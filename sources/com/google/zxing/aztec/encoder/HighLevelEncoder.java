package com.google.zxing.aztec.encoder;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public final class HighLevelEncoder {
    private static final int[][] CHAR_MAP;
    public static final int[][] LATCH_TABLE = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};
    public static final int MODE_DIGIT = 2;
    public static final int MODE_LOWER = 1;
    public static final int MODE_MIXED = 3;
    public static final String[] MODE_NAMES = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};
    public static final int MODE_PUNCT = 4;
    public static final int MODE_UPPER = 0;
    public static final int[][] SHIFT_TABLE;
    private final Charset charset;
    private final byte[] text;

    static {
        int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, new int[]{5, 256});
        CHAR_MAP = iArr;
        iArr[0][32] = 1;
        for (int i = 65; i <= 90; i++) {
            CHAR_MAP[0][i] = (i - 65) + 2;
        }
        CHAR_MAP[1][32] = 1;
        for (int i2 = 97; i2 <= 122; i2++) {
            CHAR_MAP[1][i2] = (i2 - 97) + 2;
        }
        CHAR_MAP[2][32] = 1;
        for (int i3 = 48; i3 <= 57; i3++) {
            CHAR_MAP[2][i3] = (i3 - 48) + 2;
        }
        int[] iArr2 = CHAR_MAP[2];
        iArr2[44] = 12;
        iArr2[46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i4 = 0; i4 < 28; i4++) {
            CHAR_MAP[3][iArr3[i4]] = i4;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i5 = 0; i5 < 31; i5++) {
            int i6 = iArr4[i5];
            if (i6 > 0) {
                CHAR_MAP[4][i6] = i5;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance(Integer.TYPE, new int[]{6, 6});
        SHIFT_TABLE = iArr5;
        for (int[] fill : iArr5) {
            Arrays.fill(fill, -1);
        }
        int[][] iArr6 = SHIFT_TABLE;
        iArr6[0][4] = 0;
        int[] iArr7 = iArr6[1];
        iArr7[4] = 0;
        iArr7[0] = 28;
        iArr6[3][4] = 0;
        int[] iArr8 = iArr6[2];
        iArr8[4] = 0;
        iArr8[0] = 15;
    }

    public HighLevelEncoder(byte[] bArr) {
        this.text = bArr;
        this.charset = null;
    }

    private static Collection<State> simplifyStates(Iterable<State> iterable) {
        LinkedList linkedList = new LinkedList();
        for (State next : iterable) {
            boolean z = true;
            Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                State state = (State) it.next();
                if (state.isBetterThanOrEqualTo(next)) {
                    z = false;
                    break;
                } else if (next.isBetterThanOrEqualTo(state)) {
                    it.remove();
                }
            }
            if (z) {
                linkedList.addFirst(next);
            }
        }
        return linkedList;
    }

    private void updateStateForChar(State state, int i, Collection<State> collection) {
        boolean z;
        char c = (char) (this.text[i] & 255);
        if (CHAR_MAP[state.getMode()][c] > 0) {
            z = true;
        } else {
            z = false;
        }
        State state2 = null;
        for (int i2 = 0; i2 <= 4; i2++) {
            int i3 = CHAR_MAP[i2][c];
            if (i3 > 0) {
                if (state2 == null) {
                    state2 = state.endBinaryShift(i);
                }
                if (!z || i2 == state.getMode() || i2 == 2) {
                    collection.add(state2.latchAndAppend(i2, i3));
                }
                if (!z && SHIFT_TABLE[state.getMode()][i2] >= 0) {
                    collection.add(state2.shiftAndAppend(i2, i3));
                }
            }
        }
        if (state.getBinaryShiftByteCount() > 0 || CHAR_MAP[state.getMode()][c] == 0) {
            collection.add(state.addBinaryShiftChar(i));
        }
    }

    private static void updateStateForPair(State state, int i, int i2, Collection<State> collection) {
        State endBinaryShift = state.endBinaryShift(i);
        collection.add(endBinaryShift.latchAndAppend(4, i2));
        if (state.getMode() != 4) {
            collection.add(endBinaryShift.shiftAndAppend(4, i2));
        }
        if (i2 == 3 || i2 == 4) {
            collection.add(endBinaryShift.latchAndAppend(2, 16 - i2).latchAndAppend(2, 1));
        }
        if (state.getBinaryShiftByteCount() > 0) {
            collection.add(state.addBinaryShiftChar(i).addBinaryShiftChar(i + 1));
        }
    }

    private Collection<State> updateStateListForChar(Iterable<State> iterable, int i) {
        LinkedList linkedList = new LinkedList();
        for (State updateStateForChar : iterable) {
            updateStateForChar(updateStateForChar, i, linkedList);
        }
        return simplifyStates(linkedList);
    }

    private static Collection<State> updateStateListForPair(Iterable<State> iterable, int i, int i2) {
        LinkedList linkedList = new LinkedList();
        for (State updateStateForPair : iterable) {
            updateStateForPair(updateStateForPair, i, i2, linkedList);
        }
        return simplifyStates(linkedList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.zxing.common.BitArray encode() {
        /*
            r8 = this;
            com.google.zxing.aztec.encoder.State r0 = com.google.zxing.aztec.encoder.State.INITIAL_STATE
            java.nio.charset.Charset r1 = r8.charset
            if (r1 == 0) goto L_0x002e
            com.google.zxing.common.CharacterSetECI r1 = com.google.zxing.common.CharacterSetECI.getCharacterSetECI(r1)
            if (r1 == 0) goto L_0x0015
            int r1 = r1.getValue()
            com.google.zxing.aztec.encoder.State r0 = r0.appendFLGn(r1)
            goto L_0x002e
        L_0x0015:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No ECI code for character set "
            r1.append(r2)
            java.nio.charset.Charset r2 = r8.charset
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x002e:
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1 = 0
            r2 = r1
        L_0x0034:
            byte[] r3 = r8.text
            int r4 = r3.length
            if (r2 >= r4) goto L_0x0078
            int r4 = r2 + 1
            int r5 = r3.length
            if (r4 >= r5) goto L_0x0041
            byte r5 = r3[r4]
            goto L_0x0042
        L_0x0041:
            r5 = r1
        L_0x0042:
            byte r3 = r3[r2]
            r6 = 13
            if (r3 == r6) goto L_0x0064
            r6 = 44
            r7 = 32
            if (r3 == r6) goto L_0x0060
            r6 = 46
            if (r3 == r6) goto L_0x005c
            r6 = 58
            if (r3 == r6) goto L_0x0058
        L_0x0056:
            r3 = r1
            goto L_0x0069
        L_0x0058:
            if (r5 != r7) goto L_0x0056
            r3 = 5
            goto L_0x0069
        L_0x005c:
            if (r5 != r7) goto L_0x0056
            r3 = 3
            goto L_0x0069
        L_0x0060:
            if (r5 != r7) goto L_0x0056
            r3 = 4
            goto L_0x0069
        L_0x0064:
            r3 = 10
            if (r5 != r3) goto L_0x0056
            r3 = 2
        L_0x0069:
            if (r3 <= 0) goto L_0x0071
            java.util.Collection r0 = updateStateListForPair(r0, r2, r3)
            r2 = r4
            goto L_0x0075
        L_0x0071:
            java.util.Collection r0 = r8.updateStateListForChar(r0, r2)
        L_0x0075:
            int r2 = r2 + 1
            goto L_0x0034
        L_0x0078:
            com.google.zxing.aztec.encoder.HighLevelEncoder$1 r1 = new com.google.zxing.aztec.encoder.HighLevelEncoder$1
            r1.<init>()
            java.lang.Object r0 = java.util.Collections.min(r0, r1)
            com.google.zxing.aztec.encoder.State r0 = (com.google.zxing.aztec.encoder.State) r0
            byte[] r1 = r8.text
            com.google.zxing.common.BitArray r0 = r0.toBitArray(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.aztec.encoder.HighLevelEncoder.encode():com.google.zxing.common.BitArray");
    }

    public HighLevelEncoder(byte[] bArr, Charset charset2) {
        this.text = bArr;
        this.charset = charset2;
    }
}
