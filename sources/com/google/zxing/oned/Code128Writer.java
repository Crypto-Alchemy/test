package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

public final class Code128Writer extends OneDimensionalCodeWriter {
    private static final int CODE_CODE_A = 101;
    private static final int CODE_CODE_B = 100;
    private static final int CODE_CODE_C = 99;
    private static final int CODE_FNC_1 = 102;
    private static final int CODE_FNC_2 = 97;
    private static final int CODE_FNC_3 = 96;
    private static final int CODE_FNC_4_A = 101;
    private static final int CODE_FNC_4_B = 100;
    private static final int CODE_START_A = 103;
    private static final int CODE_START_B = 104;
    private static final int CODE_START_C = 105;
    private static final int CODE_STOP = 106;
    private static final char ESCAPE_FNC_1 = 'ñ';
    private static final char ESCAPE_FNC_2 = 'ò';
    private static final char ESCAPE_FNC_3 = 'ó';
    private static final char ESCAPE_FNC_4 = 'ô';

    /* renamed from: com.google.zxing.oned.Code128Writer$1 */
    public static /* synthetic */ class C50431 {

        /* renamed from: $SwitchMap$com$google$zxing$oned$Code128Writer$MinimalEncoder$Charset */
        public static final /* synthetic */ int[] f25788x18b242a8;

        /* renamed from: $SwitchMap$com$google$zxing$oned$Code128Writer$MinimalEncoder$Latch */
        public static final /* synthetic */ int[] f25789x56054aa0;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        static {
            /*
                com.google.zxing.oned.Code128Writer$MinimalEncoder$Charset[] r0 = com.google.zxing.oned.Code128Writer.MinimalEncoder.Charset.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25788x18b242a8 = r0
                r1 = 1
                com.google.zxing.oned.Code128Writer$MinimalEncoder$Charset r2 = com.google.zxing.oned.Code128Writer.MinimalEncoder.Charset.A     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f25788x18b242a8     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.zxing.oned.Code128Writer$MinimalEncoder$Charset r3 = com.google.zxing.oned.Code128Writer.MinimalEncoder.Charset.B     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f25788x18b242a8     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.zxing.oned.Code128Writer$MinimalEncoder$Charset r4 = com.google.zxing.oned.Code128Writer.MinimalEncoder.Charset.C     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.google.zxing.oned.Code128Writer$MinimalEncoder$Latch[] r3 = com.google.zxing.oned.Code128Writer.MinimalEncoder.Latch.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f25789x56054aa0 = r3
                com.google.zxing.oned.Code128Writer$MinimalEncoder$Latch r4 = com.google.zxing.oned.Code128Writer.MinimalEncoder.Latch.A     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f25789x56054aa0     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.google.zxing.oned.Code128Writer$MinimalEncoder$Latch r3 = com.google.zxing.oned.Code128Writer.MinimalEncoder.Latch.B     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f25789x56054aa0     // Catch:{ NoSuchFieldError -> 0x004d }
                com.google.zxing.oned.Code128Writer$MinimalEncoder$Latch r1 = com.google.zxing.oned.Code128Writer.MinimalEncoder.Latch.C     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = f25789x56054aa0     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.google.zxing.oned.Code128Writer$MinimalEncoder$Latch r1 = com.google.zxing.oned.Code128Writer.MinimalEncoder.Latch.SHIFT     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.Code128Writer.C50431.<clinit>():void");
        }
    }

    public enum CType {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
        if (r7.equals("B") == false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int check(java.lang.String r6, java.util.Map<com.google.zxing.EncodeHintType, ?> r7) {
        /*
            int r0 = r6.length()
            r1 = 1
            if (r0 < r1) goto L_0x00ff
            r2 = 80
            if (r0 > r2) goto L_0x00ff
            r2 = 0
            r3 = -1
            if (r7 == 0) goto L_0x006b
            com.google.zxing.EncodeHintType r4 = com.google.zxing.EncodeHintType.FORCE_CODE_SET
            boolean r5 = r7.containsKey(r4)
            if (r5 == 0) goto L_0x006b
            java.lang.Object r7 = r7.get(r4)
            java.lang.String r7 = r7.toString()
            r7.hashCode()
            int r4 = r7.hashCode()
            switch(r4) {
                case 65: goto L_0x003f;
                case 66: goto L_0x0036;
                case 67: goto L_0x002b;
                default: goto L_0x0029;
            }
        L_0x0029:
            r1 = r3
            goto L_0x0049
        L_0x002b:
            java.lang.String r1 = "C"
            boolean r1 = r7.equals(r1)
            if (r1 != 0) goto L_0x0034
            goto L_0x0029
        L_0x0034:
            r1 = 2
            goto L_0x0049
        L_0x0036:
            java.lang.String r4 = "B"
            boolean r4 = r7.equals(r4)
            if (r4 != 0) goto L_0x0049
            goto L_0x0029
        L_0x003f:
            java.lang.String r1 = "A"
            boolean r1 = r7.equals(r1)
            if (r1 != 0) goto L_0x0048
            goto L_0x0029
        L_0x0048:
            r1 = r2
        L_0x0049:
            switch(r1) {
                case 0: goto L_0x0069;
                case 1: goto L_0x0066;
                case 2: goto L_0x0063;
                default: goto L_0x004c;
            }
        L_0x004c:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unsupported code set hint: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            throw r6
        L_0x0063:
            r3 = 99
            goto L_0x006b
        L_0x0066:
            r3 = 100
            goto L_0x006b
        L_0x0069:
            r3 = 101(0x65, float:1.42E-43)
        L_0x006b:
            if (r2 >= r0) goto L_0x00fe
            char r7 = r6.charAt(r2)
            r1 = 127(0x7f, float:1.78E-43)
            switch(r7) {
                case 241: goto L_0x0078;
                case 242: goto L_0x0078;
                case 243: goto L_0x0078;
                case 244: goto L_0x0078;
                default: goto L_0x0076;
            }
        L_0x0076:
            if (r7 > r1) goto L_0x00e7
        L_0x0078:
            switch(r3) {
                case 99: goto L_0x00b6;
                case 100: goto L_0x009a;
                case 101: goto L_0x007c;
                default: goto L_0x007b;
            }
        L_0x007b:
            goto L_0x00e4
        L_0x007c:
            r4 = 95
            if (r7 <= r4) goto L_0x00e4
            if (r7 <= r1) goto L_0x0083
            goto L_0x00e4
        L_0x0083:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Bad character in input for forced code set A: ASCII value="
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            throw r6
        L_0x009a:
            r1 = 32
            if (r7 <= r1) goto L_0x009f
            goto L_0x00e4
        L_0x009f:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Bad character in input for forced code set B: ASCII value="
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            throw r6
        L_0x00b6:
            r4 = 48
            if (r7 < r4) goto L_0x00cd
            r4 = 57
            if (r7 <= r4) goto L_0x00c0
            if (r7 <= r1) goto L_0x00cd
        L_0x00c0:
            r1 = 242(0xf2, float:3.39E-43)
            if (r7 == r1) goto L_0x00cd
            r1 = 243(0xf3, float:3.4E-43)
            if (r7 == r1) goto L_0x00cd
            r1 = 244(0xf4, float:3.42E-43)
            if (r7 == r1) goto L_0x00cd
            goto L_0x00e4
        L_0x00cd:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Bad character in input for forced code set C: ASCII value="
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            throw r6
        L_0x00e4:
            int r2 = r2 + 1
            goto L_0x006b
        L_0x00e7:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Bad character in input: ASCII value="
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            throw r6
        L_0x00fe:
            return r3
        L_0x00ff:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "Contents length should be between 1 and 80 characters, but got "
            r7.append(r1)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.Code128Writer.check(java.lang.String, java.util.Map):int");
    }

    private static int chooseCode(CharSequence charSequence, int i, int i2) {
        CType findCType;
        CType findCType2;
        char charAt;
        CType findCType3 = findCType(charSequence, i);
        CType cType = CType.ONE_DIGIT;
        if (findCType3 != cType) {
            CType cType2 = CType.UNCODABLE;
            if (findCType3 == cType2) {
                if (i >= charSequence.length() || ((charAt = charSequence.charAt(i)) >= ' ' && (i2 != 101 || (charAt >= '`' && (charAt < 241 || charAt > 244))))) {
                    return 100;
                }
                return 101;
            } else if (i2 == 101 && findCType3 == CType.FNC_1) {
                return 101;
            } else {
                if (i2 == 99) {
                    return 99;
                }
                if (i2 == 100) {
                    CType cType3 = CType.FNC_1;
                    if (findCType3 == cType3 || (findCType = findCType(charSequence, i + 2)) == cType2 || findCType == cType) {
                        return 100;
                    }
                    if (findCType != cType3) {
                        int i3 = i + 4;
                        while (true) {
                            findCType2 = findCType(charSequence, i3);
                            if (findCType2 != CType.TWO_DIGITS) {
                                break;
                            }
                            i3 += 2;
                        }
                        if (findCType2 == CType.ONE_DIGIT) {
                            return 100;
                        }
                        return 99;
                    } else if (findCType(charSequence, i + 3) == CType.TWO_DIGITS) {
                        return 99;
                    } else {
                        return 100;
                    }
                } else {
                    if (findCType3 == CType.FNC_1) {
                        findCType3 = findCType(charSequence, i + 1);
                    }
                    if (findCType3 == CType.TWO_DIGITS) {
                        return 99;
                    }
                    return 100;
                }
            }
        } else if (i2 == 101) {
            return 101;
        } else {
            return 100;
        }
    }

    private static boolean[] encodeFast(String str, int i) {
        int i2;
        int i3;
        int i4;
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1;
        while (i5 < length) {
            if (i == -1) {
                i2 = chooseCode(str, i5, i7);
            } else {
                i2 = i;
            }
            int i9 = 100;
            if (i2 == i7) {
                switch (str.charAt(i5)) {
                    case 241:
                        i9 = 102;
                        break;
                    case 242:
                        i9 = 97;
                        break;
                    case 243:
                        i9 = 96;
                        break;
                    case 244:
                        if (i7 == 101) {
                            i9 = 101;
                            break;
                        }
                        break;
                    default:
                        if (i7 != 100) {
                            if (i7 == 101) {
                                i9 = str.charAt(i5) - ' ';
                                if (i9 < 0) {
                                    i9 += 96;
                                    break;
                                }
                            } else {
                                int i10 = i5 + 1;
                                if (i10 != length) {
                                    i9 = Integer.parseInt(str.substring(i5, i5 + 2));
                                    i5 = i10;
                                    break;
                                } else {
                                    throw new IllegalArgumentException("Bad number of characters for digit only encoding.");
                                }
                            }
                        } else {
                            i9 = str.charAt(i5) - ' ';
                            break;
                        }
                        break;
                }
                i5++;
            } else {
                if (i7 == 0) {
                    if (i2 == 100) {
                        i4 = 104;
                    } else if (i2 != 101) {
                        i4 = 105;
                    } else {
                        i4 = 103;
                    }
                    i3 = i4;
                } else {
                    i3 = i2;
                }
                i7 = i2;
            }
            arrayList.add(Code128Reader.CODE_PATTERNS[i3]);
            i6 += i3 * i8;
            if (i5 != 0) {
                i8++;
            }
        }
        return produceResult(arrayList, i6);
    }

    private static CType findCType(CharSequence charSequence, int i) {
        int length = charSequence.length();
        if (i >= length) {
            return CType.UNCODABLE;
        }
        char charAt = charSequence.charAt(i);
        if (charAt == 241) {
            return CType.FNC_1;
        }
        if (charAt < '0' || charAt > '9') {
            return CType.UNCODABLE;
        }
        int i2 = i + 1;
        if (i2 >= length) {
            return CType.ONE_DIGIT;
        }
        char charAt2 = charSequence.charAt(i2);
        if (charAt2 < '0' || charAt2 > '9') {
            return CType.ONE_DIGIT;
        }
        return CType.TWO_DIGITS;
    }

    public static boolean[] produceResult(Collection<int[]> collection, int i) {
        int[][] iArr = Code128Reader.CODE_PATTERNS;
        collection.add(iArr[i % 103]);
        collection.add(iArr[106]);
        int i2 = 0;
        int i3 = 0;
        for (int[] next : collection) {
            for (int i4 : r7.next()) {
                i3 += i4;
            }
        }
        boolean[] zArr = new boolean[i3];
        for (int[] appendPattern : collection) {
            i2 += OneDimensionalCodeWriter.appendPattern(zArr, i2, appendPattern, true);
        }
        return zArr;
    }

    public boolean[] encode(String str) {
        return encode(str, (Map<EncodeHintType, ?>) null);
    }

    public Collection<BarcodeFormat> getSupportedWriteFormats() {
        return Collections.singleton(BarcodeFormat.CODE_128);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean[] encode(java.lang.String r4, java.util.Map<com.google.zxing.EncodeHintType, ?> r5) {
        /*
            r3 = this;
            int r0 = check(r4, r5)
            if (r5 == 0) goto L_0x001e
            com.google.zxing.EncodeHintType r1 = com.google.zxing.EncodeHintType.CODE128_COMPACT
            boolean r2 = r5.containsKey(r1)
            if (r2 == 0) goto L_0x001e
            java.lang.Object r5 = r5.get(r1)
            java.lang.String r5 = r5.toString()
            boolean r5 = java.lang.Boolean.parseBoolean(r5)
            if (r5 == 0) goto L_0x001e
            r5 = 1
            goto L_0x001f
        L_0x001e:
            r5 = 0
        L_0x001f:
            if (r5 == 0) goto L_0x002c
            com.google.zxing.oned.Code128Writer$MinimalEncoder r5 = new com.google.zxing.oned.Code128Writer$MinimalEncoder
            r0 = 0
            r5.<init>(r0)
            boolean[] r4 = r5.encode(r4)
            goto L_0x0030
        L_0x002c:
            boolean[] r4 = encodeFast(r4, r0)
        L_0x0030:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.Code128Writer.encode(java.lang.String, java.util.Map):boolean[]");
    }

    public static final class MinimalEncoder {
        public static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: A */
        public static final String f25790A = " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001fÿ";

        /* renamed from: B */
        public static final String f25791B = " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~ÿ";
        private static final int CODE_SHIFT = 98;
        private int[][] memoizedCost;
        private Latch[][] minPath;

        public enum Charset {
            A,
            B,
            C,
            NONE
        }

        public enum Latch {
            A,
            B,
            C,
            SHIFT,
            NONE
        }

        private MinimalEncoder() {
        }

        public /* synthetic */ MinimalEncoder(C50431 r1) {
            this();
        }

        private static void addPattern(Collection<int[]> collection, int i, int[] iArr, int[] iArr2, int i2) {
            collection.add(Code128Reader.CODE_PATTERNS[i]);
            if (i2 != 0) {
                iArr2[0] = iArr2[0] + 1;
            }
            iArr[0] = iArr[0] + (i * iArr2[0]);
        }

        private boolean canEncode(CharSequence charSequence, Charset charset, int i) {
            int i2;
            char charAt = charSequence.charAt(i);
            int i3 = C50431.f25788x18b242a8[charset.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        return false;
                    }
                    if (charAt == 241 || ((i2 = i + 1) < charSequence.length() && isDigit(charAt) && isDigit(charSequence.charAt(i2)))) {
                        return true;
                    }
                    return false;
                } else if (charAt == 241 || charAt == 242 || charAt == 243 || charAt == 244 || f25791B.indexOf(charAt) >= 0) {
                    return true;
                } else {
                    return false;
                }
            } else if (charAt == 241 || charAt == 242 || charAt == 243 || charAt == 244 || f25790A.indexOf(charAt) >= 0) {
                return true;
            } else {
                return false;
            }
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x009a  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00b9  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean[] encode(java.lang.String r17) {
            /*
                r16 = this;
                r0 = r16
                r1 = r17
                int r2 = r17.length()
                r3 = 2
                int[] r4 = new int[r3]
                r5 = 1
                r4[r5] = r2
                r2 = 0
                r6 = 4
                r4[r2] = r6
                java.lang.Class r7 = java.lang.Integer.TYPE
                java.lang.Object r4 = java.lang.reflect.Array.newInstance(r7, r4)
                int[][] r4 = (int[][]) r4
                r0.memoizedCost = r4
                int r4 = r17.length()
                int[] r7 = new int[r3]
                r7[r5] = r4
                r7[r2] = r6
                java.lang.Class<com.google.zxing.oned.Code128Writer$MinimalEncoder$Latch> r4 = com.google.zxing.oned.Code128Writer.MinimalEncoder.Latch.class
                java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r7)
                com.google.zxing.oned.Code128Writer$MinimalEncoder$Latch[][] r4 = (com.google.zxing.oned.Code128Writer.MinimalEncoder.Latch[][]) r4
                r0.minPath = r4
                com.google.zxing.oned.Code128Writer$MinimalEncoder$Charset r4 = com.google.zxing.oned.Code128Writer.MinimalEncoder.Charset.NONE
                r0.encode(r1, r4, r2)
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                int[] r8 = new int[r5]
                r8[r2] = r2
                int[] r9 = new int[r5]
                r9[r2] = r5
                int r10 = r17.length()
                r11 = r2
            L_0x0047:
                if (r11 >= r10) goto L_0x00fb
                com.google.zxing.oned.Code128Writer$MinimalEncoder$Latch[][] r12 = r0.minPath
                int r13 = r4.ordinal()
                r12 = r12[r13]
                r12 = r12[r11]
                int[] r13 = com.google.zxing.oned.Code128Writer.C50431.f25789x56054aa0
                int r14 = r12.ordinal()
                r13 = r13[r14]
                r14 = 100
                r15 = 101(0x65, float:1.42E-43)
                if (r13 == r5) goto L_0x0088
                if (r13 == r3) goto L_0x007c
                r3 = 3
                if (r13 == r3) goto L_0x006f
                if (r13 == r6) goto L_0x0069
                goto L_0x0094
            L_0x0069:
                r3 = 98
                addPattern(r7, r3, r8, r9, r11)
                goto L_0x0094
            L_0x006f:
                com.google.zxing.oned.Code128Writer$MinimalEncoder$Charset r3 = com.google.zxing.oned.Code128Writer.MinimalEncoder.Charset.C
                if (r11 != 0) goto L_0x0076
                r4 = 105(0x69, float:1.47E-43)
                goto L_0x0078
            L_0x0076:
                r4 = 99
            L_0x0078:
                addPattern(r7, r4, r8, r9, r11)
                goto L_0x0093
            L_0x007c:
                com.google.zxing.oned.Code128Writer$MinimalEncoder$Charset r3 = com.google.zxing.oned.Code128Writer.MinimalEncoder.Charset.B
                if (r11 != 0) goto L_0x0083
                r4 = 104(0x68, float:1.46E-43)
                goto L_0x0084
            L_0x0083:
                r4 = r14
            L_0x0084:
                addPattern(r7, r4, r8, r9, r11)
                goto L_0x0093
            L_0x0088:
                com.google.zxing.oned.Code128Writer$MinimalEncoder$Charset r3 = com.google.zxing.oned.Code128Writer.MinimalEncoder.Charset.A
                if (r11 != 0) goto L_0x008f
                r4 = 103(0x67, float:1.44E-43)
                goto L_0x0090
            L_0x008f:
                r4 = r15
            L_0x0090:
                addPattern(r7, r4, r8, r9, r11)
            L_0x0093:
                r4 = r3
            L_0x0094:
                com.google.zxing.oned.Code128Writer$MinimalEncoder$Charset r3 = com.google.zxing.oned.Code128Writer.MinimalEncoder.Charset.C
                r13 = 102(0x66, float:1.43E-43)
                if (r4 != r3) goto L_0x00b9
                char r3 = r1.charAt(r11)
                r12 = 241(0xf1, float:3.38E-43)
                if (r3 != r12) goto L_0x00a6
                addPattern(r7, r13, r8, r9, r11)
                goto L_0x00f7
            L_0x00a6:
                int r3 = r11 + 2
                java.lang.String r3 = r1.substring(r11, r3)
                int r3 = java.lang.Integer.parseInt(r3)
                addPattern(r7, r3, r8, r9, r11)
                int r3 = r11 + 1
                if (r3 >= r10) goto L_0x00f7
                r11 = r3
                goto L_0x00f7
            L_0x00b9:
                char r3 = r1.charAt(r11)
                switch(r3) {
                    case 241: goto L_0x00df;
                    case 242: goto L_0x00dc;
                    case 243: goto L_0x00d9;
                    case 244: goto L_0x00c7;
                    default: goto L_0x00c0;
                }
            L_0x00c0:
                char r3 = r1.charAt(r11)
                int r14 = r3 + -32
                goto L_0x00e0
            L_0x00c7:
                com.google.zxing.oned.Code128Writer$MinimalEncoder$Charset r3 = com.google.zxing.oned.Code128Writer.MinimalEncoder.Charset.A
                if (r4 != r3) goto L_0x00cf
                com.google.zxing.oned.Code128Writer$MinimalEncoder$Latch r3 = com.google.zxing.oned.Code128Writer.MinimalEncoder.Latch.SHIFT
                if (r12 != r3) goto L_0x00d7
            L_0x00cf:
                com.google.zxing.oned.Code128Writer$MinimalEncoder$Charset r3 = com.google.zxing.oned.Code128Writer.MinimalEncoder.Charset.B
                if (r4 != r3) goto L_0x00e0
                com.google.zxing.oned.Code128Writer$MinimalEncoder$Latch r3 = com.google.zxing.oned.Code128Writer.MinimalEncoder.Latch.SHIFT
                if (r12 != r3) goto L_0x00e0
            L_0x00d7:
                r14 = r15
                goto L_0x00e0
            L_0x00d9:
                r14 = 96
                goto L_0x00e0
            L_0x00dc:
                r14 = 97
                goto L_0x00e0
            L_0x00df:
                r14 = r13
            L_0x00e0:
                com.google.zxing.oned.Code128Writer$MinimalEncoder$Charset r3 = com.google.zxing.oned.Code128Writer.MinimalEncoder.Charset.A
                if (r4 != r3) goto L_0x00e8
                com.google.zxing.oned.Code128Writer$MinimalEncoder$Latch r3 = com.google.zxing.oned.Code128Writer.MinimalEncoder.Latch.SHIFT
                if (r12 != r3) goto L_0x00f0
            L_0x00e8:
                com.google.zxing.oned.Code128Writer$MinimalEncoder$Charset r3 = com.google.zxing.oned.Code128Writer.MinimalEncoder.Charset.B
                if (r4 != r3) goto L_0x00f4
                com.google.zxing.oned.Code128Writer$MinimalEncoder$Latch r3 = com.google.zxing.oned.Code128Writer.MinimalEncoder.Latch.SHIFT
                if (r12 != r3) goto L_0x00f4
            L_0x00f0:
                if (r14 >= 0) goto L_0x00f4
                int r14 = r14 + 96
            L_0x00f4:
                addPattern(r7, r14, r8, r9, r11)
            L_0x00f7:
                int r11 = r11 + r5
                r3 = 2
                goto L_0x0047
            L_0x00fb:
                r1 = 0
                r0.memoizedCost = r1
                r0.minPath = r1
                r1 = r8[r2]
                boolean[] r1 = com.google.zxing.oned.Code128Writer.produceResult(r7, r1)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.Code128Writer.MinimalEncoder.encode(java.lang.String):boolean[]");
        }

        private static boolean isDigit(char c) {
            return c >= '0' && c <= '9';
        }

        private int encode(CharSequence charSequence, Charset charset, int i) {
            int i2;
            int i3;
            int i4 = this.memoizedCost[charset.ordinal()][i];
            if (i4 > 0) {
                return i4;
            }
            Latch latch = Latch.NONE;
            int i5 = i + 1;
            int i6 = 1;
            boolean z = i5 >= charSequence.length();
            Charset[] charsetArr = {Charset.A, Charset.B};
            int i7 = Integer.MAX_VALUE;
            for (int i8 = 0; i8 <= 1; i8++) {
                if (canEncode(charSequence, charsetArr[i8], i)) {
                    Latch latch2 = Latch.NONE;
                    Charset charset2 = charsetArr[i8];
                    if (charset != charset2) {
                        latch2 = Latch.valueOf(charset2.toString());
                        i3 = 2;
                    } else {
                        i3 = 1;
                    }
                    if (!z) {
                        i3 += encode(charSequence, charsetArr[i8], i5);
                    }
                    if (i3 < i7) {
                        latch = latch2;
                        i7 = i3;
                    }
                    if (charset == charsetArr[(i8 + 1) % 2]) {
                        Latch latch3 = Latch.SHIFT;
                        int encode = !z ? encode(charSequence, charset, i5) + 2 : 2;
                        if (encode < i7) {
                            latch = latch3;
                            i7 = encode;
                        }
                    }
                }
            }
            Charset charset3 = Charset.C;
            if (canEncode(charSequence, charset3, i)) {
                Latch latch4 = Latch.NONE;
                if (charset != charset3) {
                    latch4 = Latch.C;
                    i2 = 2;
                } else {
                    i2 = 1;
                }
                if (charSequence.charAt(i) != 241) {
                    i6 = 2;
                }
                int i9 = i6 + i;
                if (i9 < charSequence.length()) {
                    i2 += encode(charSequence, charset3, i9);
                }
                if (i2 < i7) {
                    latch = latch4;
                    i7 = i2;
                }
            }
            if (i7 != Integer.MAX_VALUE) {
                this.memoizedCost[charset.ordinal()][i] = i7;
                this.minPath[charset.ordinal()][i] = latch;
                return i7;
            }
            throw new IllegalArgumentException("Bad character in input: ASCII value=" + charSequence.charAt(i));
        }
    }
}
