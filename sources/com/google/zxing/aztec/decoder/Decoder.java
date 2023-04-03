package com.google.zxing.aztec.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.aztec.AztecDetectorResult;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import org.slf4j.Marker;

public final class Decoder {
    private static final Charset DEFAULT_ENCODING = StandardCharsets.ISO_8859_1;
    private static final String[] DIGIT_TABLE = {"CTRL_PS", " ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};
    private static final String[] LOWER_TABLE = {"CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    private static final String[] MIXED_TABLE = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};
    private static final String[] PUNCT_TABLE = {"FLG(n)", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", Marker.ANY_MARKER, Marker.ANY_NON_NULL_MARKER, ",", "-", ".", "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};
    private static final String[] UPPER_TABLE = {"CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    private AztecDetectorResult ddata;

    /* renamed from: com.google.zxing.aztec.decoder.Decoder$1 */
    public static /* synthetic */ class C50351 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.zxing.aztec.decoder.Decoder$Table[] r0 = com.google.zxing.aztec.decoder.Decoder.Table.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table = r0
                com.google.zxing.aztec.decoder.Decoder$Table r1 = com.google.zxing.aztec.decoder.Decoder.Table.UPPER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.zxing.aztec.decoder.Decoder$Table r1 = com.google.zxing.aztec.decoder.Decoder.Table.LOWER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.zxing.aztec.decoder.Decoder$Table r1 = com.google.zxing.aztec.decoder.Decoder.Table.MIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.zxing.aztec.decoder.Decoder$Table r1 = com.google.zxing.aztec.decoder.Decoder.Table.PUNCT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.zxing.aztec.decoder.Decoder$Table r1 = com.google.zxing.aztec.decoder.Decoder.Table.DIGIT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.aztec.decoder.Decoder.C50351.<clinit>():void");
        }
    }

    public static final class CorrectedBitsResult {
        /* access modifiers changed from: private */
        public final boolean[] correctBits;
        /* access modifiers changed from: private */
        public final int ecLevel;

        public CorrectedBitsResult(boolean[] zArr, int i) {
            this.correctBits = zArr;
            this.ecLevel = i;
        }
    }

    public enum Table {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    public static byte[] convertBoolArrayToByteArray(boolean[] zArr) {
        int length = (zArr.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = readByte(zArr, i * 8);
        }
        return bArr;
    }

    private CorrectedBitsResult correctBits(boolean[] zArr) throws FormatException {
        GenericGF genericGF;
        boolean z;
        boolean z2;
        int i = 8;
        if (this.ddata.getNbLayers() <= 2) {
            i = 6;
            genericGF = GenericGF.AZTEC_DATA_6;
        } else if (this.ddata.getNbLayers() <= 8) {
            genericGF = GenericGF.AZTEC_DATA_8;
        } else if (this.ddata.getNbLayers() <= 22) {
            i = 10;
            genericGF = GenericGF.AZTEC_DATA_10;
        } else {
            i = 12;
            genericGF = GenericGF.AZTEC_DATA_12;
        }
        int nbDatablocks = this.ddata.getNbDatablocks();
        int length = zArr.length / i;
        if (length >= nbDatablocks) {
            int length2 = zArr.length % i;
            int[] iArr = new int[length];
            int i2 = 0;
            while (i2 < length) {
                iArr[i2] = readCode(zArr, length2, i);
                i2++;
                length2 += i;
            }
            try {
                ReedSolomonDecoder reedSolomonDecoder = new ReedSolomonDecoder(genericGF);
                int i3 = length - nbDatablocks;
                reedSolomonDecoder.decode(iArr, i3);
                int i4 = (1 << i) - 1;
                int i5 = 0;
                for (int i6 = 0; i6 < nbDatablocks; i6++) {
                    int i7 = iArr[i6];
                    if (i7 == 0 || i7 == i4) {
                        throw FormatException.getFormatInstance();
                    }
                    if (i7 == 1 || i7 == i4 - 1) {
                        i5++;
                    }
                }
                boolean[] zArr2 = new boolean[((nbDatablocks * i) - i5)];
                int i8 = 0;
                for (int i9 = 0; i9 < nbDatablocks; i9++) {
                    int i10 = iArr[i9];
                    if (i10 == 1 || i10 == i4 - 1) {
                        int i11 = (i8 + i) - 1;
                        if (i10 > 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        Arrays.fill(zArr2, i8, i11, z);
                        i8 += i - 1;
                    } else {
                        int i12 = i - 1;
                        while (i12 >= 0) {
                            int i13 = i8 + 1;
                            if (((1 << i12) & i10) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zArr2[i8] = z2;
                            i12--;
                            i8 = i13;
                        }
                    }
                }
                return new CorrectedBitsResult(zArr2, (i3 * 100) / length);
            } catch (ReedSolomonException e) {
                throw FormatException.getFormatInstance(e);
            }
        } else {
            throw FormatException.getFormatInstance();
        }
    }

    private boolean[] extractBits(BitMatrix bitMatrix) {
        int i;
        int i2;
        BitMatrix bitMatrix2 = bitMatrix;
        boolean isCompact = this.ddata.isCompact();
        int nbLayers = this.ddata.getNbLayers();
        if (isCompact) {
            i = 11;
        } else {
            i = 14;
        }
        int i3 = i + (nbLayers * 4);
        int[] iArr = new int[i3];
        boolean[] zArr = new boolean[totalBitsInLayer(nbLayers, isCompact)];
        int i4 = 2;
        if (isCompact) {
            for (int i5 = 0; i5 < i3; i5++) {
                iArr[i5] = i5;
            }
        } else {
            int i6 = i3 / 2;
            int i7 = ((i3 + 1) + (((i6 - 1) / 15) * 2)) / 2;
            for (int i8 = 0; i8 < i6; i8++) {
                int i9 = (i8 / 15) + i8;
                iArr[(i6 - i8) - 1] = (i7 - i9) - 1;
                iArr[i6 + i8] = i9 + i7 + 1;
            }
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < nbLayers) {
            int i12 = (nbLayers - i10) * 4;
            if (isCompact) {
                i2 = 9;
            } else {
                i2 = 12;
            }
            int i13 = i12 + i2;
            int i14 = i10 * 2;
            int i15 = (i3 - 1) - i14;
            int i16 = 0;
            while (i16 < i13) {
                int i17 = i16 * 2;
                int i18 = 0;
                while (i18 < i4) {
                    int i19 = i14 + i18;
                    int i20 = i14 + i16;
                    zArr[i11 + i17 + i18] = bitMatrix2.get(iArr[i19], iArr[i20]);
                    int i21 = iArr[i20];
                    int i22 = i15 - i18;
                    boolean z = isCompact;
                    zArr[(i13 * 2) + i11 + i17 + i18] = bitMatrix2.get(i21, iArr[i22]);
                    int i23 = iArr[i22];
                    int i24 = i15 - i16;
                    zArr[(i13 * 4) + i11 + i17 + i18] = bitMatrix2.get(i23, iArr[i24]);
                    zArr[(i13 * 6) + i11 + i17 + i18] = bitMatrix2.get(iArr[i24], iArr[i19]);
                    i18++;
                    nbLayers = nbLayers;
                    isCompact = z;
                    i4 = 2;
                }
                boolean z2 = isCompact;
                int i25 = nbLayers;
                i16++;
                i4 = 2;
            }
            boolean z3 = isCompact;
            int i26 = nbLayers;
            i11 += i13 * 8;
            i10++;
            i4 = 2;
        }
        return zArr;
    }

    private static String getCharacter(Table table, int i) {
        int i2 = C50351.$SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[table.ordinal()];
        if (i2 == 1) {
            return UPPER_TABLE[i];
        }
        if (i2 == 2) {
            return LOWER_TABLE[i];
        }
        if (i2 == 3) {
            return MIXED_TABLE[i];
        }
        if (i2 == 4) {
            return PUNCT_TABLE[i];
        }
        if (i2 == 5) {
            return DIGIT_TABLE[i];
        }
        throw new IllegalStateException("Bad table");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b6, code lost:
        throw com.google.zxing.FormatException.getFormatInstance();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getEncodedData(boolean[] r14) throws com.google.zxing.FormatException {
        /*
            int r0 = r14.length
            com.google.zxing.aztec.decoder.Decoder$Table r1 = com.google.zxing.aztec.decoder.Decoder.Table.UPPER
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r3 = r14.length
            r4 = 5
            int r3 = r3 - r4
            r5 = 4
            int r3 = r3 / r5
            r2.<init>(r3)
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            java.nio.charset.Charset r6 = DEFAULT_ENCODING
            r7 = 0
            r8 = r6
            r9 = r7
            r6 = r1
        L_0x0018:
            if (r9 >= r0) goto L_0x0105
            com.google.zxing.aztec.decoder.Decoder$Table r10 = com.google.zxing.aztec.decoder.Decoder.Table.BINARY
            r11 = 11
            if (r1 != r10) goto L_0x0056
            int r1 = r0 - r9
            if (r1 >= r4) goto L_0x0026
            goto L_0x0105
        L_0x0026:
            int r1 = readCode(r14, r9, r4)
            int r9 = r9 + 5
            if (r1 != 0) goto L_0x003c
            int r1 = r0 - r9
            if (r1 >= r11) goto L_0x0034
            goto L_0x0105
        L_0x0034:
            int r1 = readCode(r14, r9, r11)
            int r1 = r1 + 31
            int r9 = r9 + 11
        L_0x003c:
            r10 = r7
        L_0x003d:
            if (r10 >= r1) goto L_0x0054
            int r11 = r0 - r9
            r12 = 8
            if (r11 >= r12) goto L_0x0047
            r9 = r0
            goto L_0x0054
        L_0x0047:
            int r11 = readCode(r14, r9, r12)
            byte r11 = (byte) r11
            r3.write(r11)
            int r9 = r9 + 8
            int r10 = r10 + 1
            goto L_0x003d
        L_0x0054:
            r1 = r6
            goto L_0x0018
        L_0x0056:
            com.google.zxing.aztec.decoder.Decoder$Table r10 = com.google.zxing.aztec.decoder.Decoder.Table.DIGIT
            if (r1 != r10) goto L_0x005c
            r10 = r5
            goto L_0x005d
        L_0x005c:
            r10 = r4
        L_0x005d:
            int r12 = r0 - r9
            if (r12 >= r10) goto L_0x0063
            goto L_0x0105
        L_0x0063:
            int r12 = readCode(r14, r9, r10)
            int r9 = r9 + r10
            java.lang.String r10 = getCharacter(r1, r12)
            java.lang.String r12 = "FLG(n)"
            boolean r12 = r12.equals(r10)
            if (r12 == 0) goto L_0x00d9
            int r1 = r0 - r9
            r10 = 3
            if (r1 >= r10) goto L_0x007b
            goto L_0x0105
        L_0x007b:
            int r1 = readCode(r14, r9, r10)
            int r9 = r9 + 3
            java.lang.String r10 = r8.name()     // Catch:{ UnsupportedEncodingException -> 0x00d2 }
            java.lang.String r10 = r3.toString(r10)     // Catch:{ UnsupportedEncodingException -> 0x00d2 }
            r2.append(r10)     // Catch:{ UnsupportedEncodingException -> 0x00d2 }
            r3.reset()
            if (r1 == 0) goto L_0x00cc
            r10 = 7
            if (r1 == r10) goto L_0x00c7
            int r10 = r0 - r9
            int r12 = r1 * 4
            if (r10 >= r12) goto L_0x009b
            goto L_0x0054
        L_0x009b:
            r8 = r7
        L_0x009c:
            int r10 = r1 + -1
            if (r1 <= 0) goto L_0x00b7
            int r1 = readCode(r14, r9, r5)
            int r9 = r9 + 4
            r12 = 2
            if (r1 < r12) goto L_0x00b2
            if (r1 > r11) goto L_0x00b2
            int r8 = r8 * 10
            int r1 = r1 + -2
            int r8 = r8 + r1
            r1 = r10
            goto L_0x009c
        L_0x00b2:
            com.google.zxing.FormatException r14 = com.google.zxing.FormatException.getFormatInstance()
            throw r14
        L_0x00b7:
            com.google.zxing.common.CharacterSetECI r1 = com.google.zxing.common.CharacterSetECI.getCharacterSetECIByValue(r8)
            if (r1 == 0) goto L_0x00c2
            java.nio.charset.Charset r8 = r1.getCharset()
            goto L_0x0054
        L_0x00c2:
            com.google.zxing.FormatException r14 = com.google.zxing.FormatException.getFormatInstance()
            throw r14
        L_0x00c7:
            com.google.zxing.FormatException r14 = com.google.zxing.FormatException.getFormatInstance()
            throw r14
        L_0x00cc:
            r1 = 29
            r2.append(r1)
            goto L_0x0054
        L_0x00d2:
            r14 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r14)
            throw r0
        L_0x00d9:
            java.lang.String r11 = "CTRL_"
            boolean r11 = r10.startsWith(r11)
            if (r11 == 0) goto L_0x00f9
            char r6 = r10.charAt(r4)
            com.google.zxing.aztec.decoder.Decoder$Table r6 = getTable(r6)
            r11 = 6
            char r10 = r10.charAt(r11)
            r11 = 76
            if (r10 != r11) goto L_0x00f4
            goto L_0x0054
        L_0x00f4:
            r13 = r6
            r6 = r1
            r1 = r13
            goto L_0x0018
        L_0x00f9:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.US_ASCII
            byte[] r1 = r10.getBytes(r1)
            int r10 = r1.length
            r3.write(r1, r7, r10)
            goto L_0x0054
        L_0x0105:
            java.lang.String r14 = r8.name()     // Catch:{ UnsupportedEncodingException -> 0x0115 }
            java.lang.String r14 = r3.toString(r14)     // Catch:{ UnsupportedEncodingException -> 0x0115 }
            r2.append(r14)     // Catch:{ UnsupportedEncodingException -> 0x0115 }
            java.lang.String r14 = r2.toString()
            return r14
        L_0x0115:
            r14 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.aztec.decoder.Decoder.getEncodedData(boolean[]):java.lang.String");
    }

    private static Table getTable(char c) {
        if (c == 'B') {
            return Table.BINARY;
        }
        if (c == 'D') {
            return Table.DIGIT;
        }
        if (c == 'P') {
            return Table.PUNCT;
        }
        if (c == 'L') {
            return Table.LOWER;
        }
        if (c != 'M') {
            return Table.UPPER;
        }
        return Table.MIXED;
    }

    public static String highLevelDecode(boolean[] zArr) throws FormatException {
        return getEncodedData(zArr);
    }

    private static byte readByte(boolean[] zArr, int i) {
        int readCode;
        int length = zArr.length - i;
        if (length >= 8) {
            readCode = readCode(zArr, i, 8);
        } else {
            readCode = readCode(zArr, i, length) << (8 - length);
        }
        return (byte) readCode;
    }

    private static int readCode(boolean[] zArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            i3 <<= 1;
            if (zArr[i4]) {
                i3 |= 1;
            }
        }
        return i3;
    }

    private static int totalBitsInLayer(int i, boolean z) {
        return ((z ? 88 : 112) + (i * 16)) * i;
    }

    public DecoderResult decode(AztecDetectorResult aztecDetectorResult) throws FormatException {
        this.ddata = aztecDetectorResult;
        CorrectedBitsResult correctBits = correctBits(extractBits(aztecDetectorResult.getBits()));
        DecoderResult decoderResult = new DecoderResult(convertBoolArrayToByteArray(correctBits.correctBits), getEncodedData(correctBits.correctBits), (List<byte[]>) null, String.format("%d%%", new Object[]{Integer.valueOf(correctBits.ecLevel)}));
        decoderResult.setNumBits(correctBits.correctBits.length);
        return decoderResult;
    }
}
