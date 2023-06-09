package com.google.zxing.pdf417.encoder;

import com.google.zxing.WriterException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.ECIInput;
import com.google.zxing.common.MinimalECIInput;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

final class PDF417HighLevelEncoder {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int BYTE_COMPACTION = 1;
    private static final Charset DEFAULT_ENCODING = StandardCharsets.ISO_8859_1;
    private static final int ECI_CHARSET = 927;
    private static final int ECI_GENERAL_PURPOSE = 926;
    private static final int ECI_USER_DEFINED = 925;
    private static final int LATCH_TO_BYTE = 924;
    private static final int LATCH_TO_BYTE_PADDED = 901;
    private static final int LATCH_TO_NUMERIC = 902;
    private static final int LATCH_TO_TEXT = 900;
    private static final byte[] MIXED;
    private static final int NUMERIC_COMPACTION = 2;
    private static final byte[] PUNCTUATION = new byte[128];
    private static final int SHIFT_TO_BYTE = 913;
    private static final int SUBMODE_ALPHA = 0;
    private static final int SUBMODE_LOWER = 1;
    private static final int SUBMODE_MIXED = 2;
    private static final int SUBMODE_PUNCTUATION = 3;
    private static final int TEXT_COMPACTION = 0;
    private static final byte[] TEXT_MIXED_RAW = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};
    private static final byte[] TEXT_PUNCTUATION_RAW = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};

    /* renamed from: com.google.zxing.pdf417.encoder.PDF417HighLevelEncoder$1 */
    public static /* synthetic */ class C50451 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$zxing$pdf417$encoder$Compaction;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.google.zxing.pdf417.encoder.Compaction[] r0 = com.google.zxing.pdf417.encoder.Compaction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$google$zxing$pdf417$encoder$Compaction = r0
                com.google.zxing.pdf417.encoder.Compaction r1 = com.google.zxing.pdf417.encoder.Compaction.TEXT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$google$zxing$pdf417$encoder$Compaction     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.zxing.pdf417.encoder.Compaction r1 = com.google.zxing.pdf417.encoder.Compaction.BYTE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$google$zxing$pdf417$encoder$Compaction     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.zxing.pdf417.encoder.Compaction r1 = com.google.zxing.pdf417.encoder.Compaction.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.encoder.PDF417HighLevelEncoder.C50451.<clinit>():void");
        }
    }

    public static final class NoECIInput implements ECIInput {
        public String input;

        public /* synthetic */ NoECIInput(String str, C50451 r2) {
            this(str);
        }

        public char charAt(int i) {
            return this.input.charAt(i);
        }

        public int getECIValue(int i) {
            return -1;
        }

        public boolean haveNCharacters(int i, int i2) {
            if (i + i2 <= this.input.length()) {
                return true;
            }
            return false;
        }

        public boolean isECI(int i) {
            return false;
        }

        public int length() {
            return this.input.length();
        }

        public CharSequence subSequence(int i, int i2) {
            return this.input.subSequence(i, i2);
        }

        public String toString() {
            return this.input;
        }

        private NoECIInput(String str) {
            this.input = str;
        }
    }

    static {
        byte[] bArr = new byte[128];
        MIXED = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = TEXT_MIXED_RAW;
            if (i2 >= bArr2.length) {
                break;
            }
            byte b = bArr2[i2];
            if (b > 0) {
                MIXED[b] = (byte) i2;
            }
            i2++;
        }
        Arrays.fill(PUNCTUATION, (byte) -1);
        while (true) {
            byte[] bArr3 = TEXT_PUNCTUATION_RAW;
            if (i < bArr3.length) {
                byte b2 = bArr3[i];
                if (b2 > 0) {
                    PUNCTUATION[b2] = (byte) i;
                }
                i++;
            } else {
                return;
            }
        }
    }

    private PDF417HighLevelEncoder() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0011 A[LOOP:1: B:6:0x0011->B:13:0x0029, LOOP_START, PHI: r2 r3 
      PHI: (r2v1 int) = (r2v0 int), (r2v5 int) binds: [B:5:0x000f, B:13:0x0029] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r3v1 int) = (r3v0 int), (r3v4 int) binds: [B:5:0x000f, B:13:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int determineConsecutiveBinaryCount(com.google.zxing.common.ECIInput r6, int r7, java.nio.charset.Charset r8) throws com.google.zxing.WriterException {
        /*
            if (r8 != 0) goto L_0x0004
            r8 = 0
            goto L_0x0008
        L_0x0004:
            java.nio.charset.CharsetEncoder r8 = r8.newEncoder()
        L_0x0008:
            int r0 = r6.length()
            r1 = r7
        L_0x000d:
            if (r1 >= r0) goto L_0x0067
            r2 = 0
            r3 = r1
        L_0x0011:
            r4 = 13
            if (r2 >= r4) goto L_0x002b
            boolean r5 = r6.isECI(r3)
            if (r5 != 0) goto L_0x002b
            char r3 = r6.charAt(r3)
            boolean r3 = isDigit(r3)
            if (r3 == 0) goto L_0x002b
            int r2 = r2 + 1
            int r3 = r1 + r2
            if (r3 < r0) goto L_0x0011
        L_0x002b:
            if (r2 < r4) goto L_0x002f
            int r1 = r1 - r7
            return r1
        L_0x002f:
            if (r8 == 0) goto L_0x0064
            char r2 = r6.charAt(r1)
            boolean r2 = r8.canEncode(r2)
            if (r2 == 0) goto L_0x003c
            goto L_0x0064
        L_0x003c:
            char r6 = r6.charAt(r1)
            com.google.zxing.WriterException r7 = new com.google.zxing.WriterException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Non-encodable character detected: "
            r8.append(r0)
            r8.append(r6)
            java.lang.String r0 = " (Unicode: "
            r8.append(r0)
            r8.append(r6)
            r6 = 41
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r7.<init>((java.lang.String) r6)
            throw r7
        L_0x0064:
            int r1 = r1 + 1
            goto L_0x000d
        L_0x0067:
            int r1 = r1 - r7
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.encoder.PDF417HighLevelEncoder.determineConsecutiveBinaryCount(com.google.zxing.common.ECIInput, int, java.nio.charset.Charset):int");
    }

    private static int determineConsecutiveDigitCount(ECIInput eCIInput, int i) {
        int length = eCIInput.length();
        int i2 = 0;
        if (i < length) {
            while (i < length && !eCIInput.isECI(i) && isDigit(eCIInput.charAt(i))) {
                i2++;
                i++;
            }
        }
        return i2;
    }

    private static int determineConsecutiveTextCount(ECIInput eCIInput, int i) {
        int length = eCIInput.length();
        int i2 = i;
        while (i2 < length) {
            int i3 = 0;
            while (i3 < 13 && i2 < length && !eCIInput.isECI(i2) && isDigit(eCIInput.charAt(i2))) {
                i3++;
                i2++;
            }
            if (i3 >= 13) {
                return (i2 - i) - i3;
            }
            if (i3 <= 0) {
                if (eCIInput.isECI(i2) || !isText(eCIInput.charAt(i2))) {
                    break;
                }
                i2++;
            }
        }
        return i2 - i;
    }

    private static void encodeBinary(byte[] bArr, int i, int i2, int i3, StringBuilder sb) {
        int i4;
        if (i2 == 1 && i3 == 0) {
            sb.append(913);
        } else if (i2 % 6 == 0) {
            sb.append(924);
        } else {
            sb.append(901);
        }
        if (i2 >= 6) {
            char[] cArr = new char[5];
            i4 = i;
            while ((i + i2) - i4 >= 6) {
                long j = 0;
                for (int i5 = 0; i5 < 6; i5++) {
                    j = (j << 8) + ((long) (bArr[i4 + i5] & 255));
                }
                for (int i6 = 0; i6 < 5; i6++) {
                    cArr[i6] = (char) ((int) (j % 900));
                    j /= 900;
                }
                for (int i7 = 4; i7 >= 0; i7--) {
                    sb.append(cArr[i7]);
                }
                i4 += 6;
            }
        } else {
            i4 = i;
        }
        while (i4 < i + i2) {
            sb.append((char) (bArr[i4] & 255));
            i4++;
        }
    }

    public static String encodeHighLevel(String str, Compaction compaction, Charset charset, boolean z) throws WriterException {
        ECIInput eCIInput;
        Charset charset2;
        byte[] bArr;
        CharacterSetECI characterSetECI;
        if (charset == null && !z) {
            int i = 0;
            while (i < str.length()) {
                if (str.charAt(i) <= 255) {
                    i++;
                } else {
                    throw new WriterException("Non-encodable character detected: " + str.charAt(i) + " (Unicode: " + str.charAt(i) + "). Consider specifying EncodeHintType.PDF417_AUTO_ECI and/or EncodeTypeHint.CHARACTER_SET.");
                }
            }
        }
        StringBuilder sb = new StringBuilder(str.length());
        if (z) {
            eCIInput = new MinimalECIInput(str, charset, -1);
        } else {
            eCIInput = new NoECIInput(str, (C50451) null);
            if (charset == null) {
                charset = DEFAULT_ENCODING;
            } else if (!DEFAULT_ENCODING.equals(charset) && (characterSetECI = CharacterSetECI.getCharacterSetECI(charset)) != null) {
                encodingECI(characterSetECI.getValue(), sb);
            }
        }
        int length = eCIInput.length();
        int i2 = C50451.$SwitchMap$com$google$zxing$pdf417$encoder$Compaction[compaction.ordinal()];
        if (i2 == 1) {
            encodeText(eCIInput, 0, length, sb, 0);
        } else if (i2 != 2) {
            if (i2 != 3) {
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                while (i3 < length) {
                    while (i3 < length && eCIInput.isECI(i3)) {
                        encodingECI(eCIInput.getECIValue(i3), sb);
                        i3++;
                    }
                    if (i3 >= length) {
                        break;
                    }
                    int determineConsecutiveDigitCount = determineConsecutiveDigitCount(eCIInput, i3);
                    if (determineConsecutiveDigitCount >= 13) {
                        sb.append(902);
                        encodeNumeric(eCIInput, i3, determineConsecutiveDigitCount, sb);
                        i3 += determineConsecutiveDigitCount;
                        i4 = 0;
                        i5 = 2;
                    } else {
                        int determineConsecutiveTextCount = determineConsecutiveTextCount(eCIInput, i3);
                        if (determineConsecutiveTextCount >= 5 || determineConsecutiveDigitCount == length) {
                            if (i5 != 0) {
                                sb.append(900);
                                i4 = 0;
                                i5 = 0;
                            }
                            i4 = encodeText(eCIInput, i3, determineConsecutiveTextCount, sb, i4);
                            i3 += determineConsecutiveTextCount;
                        } else {
                            if (z) {
                                charset2 = null;
                            } else {
                                charset2 = charset;
                            }
                            int determineConsecutiveBinaryCount = determineConsecutiveBinaryCount(eCIInput, i3, charset2);
                            if (determineConsecutiveBinaryCount == 0) {
                                determineConsecutiveBinaryCount = 1;
                            }
                            if (z) {
                                bArr = null;
                            } else {
                                bArr = eCIInput.subSequence(i3, i3 + determineConsecutiveBinaryCount).toString().getBytes(charset);
                            }
                            if ((!(bArr == null && determineConsecutiveBinaryCount == 1) && (bArr == null || bArr.length != 1)) || i5 != 0) {
                                if (z) {
                                    encodeMultiECIBinary(eCIInput, i3, i3 + determineConsecutiveBinaryCount, i5, sb);
                                } else {
                                    encodeBinary(bArr, 0, bArr.length, i5, sb);
                                }
                                i4 = 0;
                                i5 = 1;
                            } else if (z) {
                                encodeMultiECIBinary(eCIInput, i3, 1, 0, sb);
                            } else {
                                encodeBinary(bArr, 0, 1, 0, sb);
                            }
                            i3 += determineConsecutiveBinaryCount;
                        }
                    }
                }
            } else {
                sb.append(902);
                encodeNumeric(eCIInput, 0, length, sb);
            }
        } else if (z) {
            encodeMultiECIBinary(eCIInput, 0, eCIInput.length(), 0, sb);
        } else {
            byte[] bytes = eCIInput.toString().getBytes(charset);
            encodeBinary(bytes, 0, bytes.length, 1, sb);
        }
        return sb.toString();
    }

    private static void encodeMultiECIBinary(ECIInput eCIInput, int i, int i2, int i3, StringBuilder sb) throws WriterException {
        int i4;
        int min = Math.min(i2 + i, eCIInput.length());
        int i5 = i;
        while (true) {
            if (i5 >= min || !eCIInput.isECI(i5)) {
                int i6 = i5;
                while (i6 < min && !eCIInput.isECI(i6)) {
                    i6++;
                }
                int i7 = i6 - i5;
                if (i7 > 0) {
                    byte[] subBytes = subBytes(eCIInput, i5, i6);
                    if (i5 == i) {
                        i4 = i3;
                    } else {
                        i4 = 1;
                    }
                    encodeBinary(subBytes, 0, i7, i4, sb);
                    i5 = i6;
                } else {
                    return;
                }
            } else {
                encodingECI(eCIInput.getECIValue(i5), sb);
                i5++;
            }
        }
    }

    private static void encodeNumeric(ECIInput eCIInput, int i, int i2, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder((i2 / 3) + 1);
        BigInteger valueOf = BigInteger.valueOf(900);
        BigInteger valueOf2 = BigInteger.valueOf(0);
        int i3 = 0;
        while (i3 < i2) {
            sb2.setLength(0);
            int min = Math.min(44, i2 - i3);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("1");
            int i4 = i + i3;
            sb3.append(eCIInput.subSequence(i4, i4 + min));
            BigInteger bigInteger = new BigInteger(sb3.toString());
            do {
                sb2.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            for (int length = sb2.length() - 1; length >= 0; length--) {
                sb.append(sb2.charAt(length));
            }
            i3 += min;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:73:0x010c A[EDGE_INSN: B:73:0x010c->B:58:0x010c ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0011 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int encodeText(com.google.zxing.common.ECIInput r16, int r17, int r18, java.lang.StringBuilder r19, int r20) throws com.google.zxing.WriterException {
        /*
            r0 = r16
            r1 = r18
            r2 = r19
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            r4 = 2
            r5 = 0
            r6 = 1
            r7 = r20
            r8 = r5
        L_0x0011:
            int r9 = r17 + r8
            boolean r10 = r0.isECI(r9)
            if (r10 == 0) goto L_0x0023
            int r9 = r0.getECIValue(r9)
            encodingECI(r9, r2)
            int r8 = r8 + 1
            goto L_0x0011
        L_0x0023:
            char r10 = r0.charAt(r9)
            r11 = 26
            r12 = 32
            r13 = 28
            r14 = 27
            r15 = 29
            if (r7 == 0) goto L_0x00d2
            if (r7 == r6) goto L_0x0099
            if (r7 == r4) goto L_0x004c
            boolean r9 = isPunctuation(r10)
            if (r9 == 0) goto L_0x0047
            byte[] r9 = PUNCTUATION
            byte r9 = r9[r10]
            char r9 = (char) r9
            r3.append(r9)
            goto L_0x0108
        L_0x0047:
            r3.append(r15)
        L_0x004a:
            r7 = r5
            goto L_0x0011
        L_0x004c:
            boolean r11 = isMixed(r10)
            if (r11 == 0) goto L_0x005c
            byte[] r9 = MIXED
            byte r9 = r9[r10]
            char r9 = (char) r9
            r3.append(r9)
            goto L_0x0108
        L_0x005c:
            boolean r11 = isAlphaUpper(r10)
            if (r11 == 0) goto L_0x0066
            r3.append(r13)
            goto L_0x004a
        L_0x0066:
            boolean r11 = isAlphaLower(r10)
            if (r11 == 0) goto L_0x0071
            r3.append(r14)
            goto L_0x00ee
        L_0x0071:
            int r9 = r9 + 1
            if (r9 >= r1) goto L_0x008c
            boolean r11 = r0.isECI(r9)
            if (r11 != 0) goto L_0x008c
            char r9 = r0.charAt(r9)
            boolean r9 = isPunctuation(r9)
            if (r9 == 0) goto L_0x008c
            r7 = 3
            r9 = 25
            r3.append(r9)
            goto L_0x0011
        L_0x008c:
            r3.append(r15)
            byte[] r9 = PUNCTUATION
            byte r9 = r9[r10]
            char r9 = (char) r9
            r3.append(r9)
            goto L_0x0108
        L_0x0099:
            boolean r9 = isAlphaLower(r10)
            if (r9 == 0) goto L_0x00ac
            if (r10 != r12) goto L_0x00a5
            r3.append(r11)
            goto L_0x0108
        L_0x00a5:
            int r10 = r10 + -97
            char r9 = (char) r10
            r3.append(r9)
            goto L_0x0108
        L_0x00ac:
            boolean r9 = isAlphaUpper(r10)
            if (r9 == 0) goto L_0x00bc
            r3.append(r14)
            int r10 = r10 + -65
            char r9 = (char) r10
            r3.append(r9)
            goto L_0x0108
        L_0x00bc:
            boolean r9 = isMixed(r10)
            if (r9 == 0) goto L_0x00c6
            r3.append(r13)
            goto L_0x00fa
        L_0x00c6:
            r3.append(r15)
            byte[] r9 = PUNCTUATION
            byte r9 = r9[r10]
            char r9 = (char) r9
            r3.append(r9)
            goto L_0x0108
        L_0x00d2:
            boolean r9 = isAlphaUpper(r10)
            if (r9 == 0) goto L_0x00e5
            if (r10 != r12) goto L_0x00de
            r3.append(r11)
            goto L_0x0108
        L_0x00de:
            int r10 = r10 + -65
            char r9 = (char) r10
            r3.append(r9)
            goto L_0x0108
        L_0x00e5:
            boolean r9 = isAlphaLower(r10)
            if (r9 == 0) goto L_0x00f1
            r3.append(r14)
        L_0x00ee:
            r7 = r6
            goto L_0x0011
        L_0x00f1:
            boolean r9 = isMixed(r10)
            if (r9 == 0) goto L_0x00fd
            r3.append(r13)
        L_0x00fa:
            r7 = r4
            goto L_0x0011
        L_0x00fd:
            r3.append(r15)
            byte[] r9 = PUNCTUATION
            byte r9 = r9[r10]
            char r9 = (char) r9
            r3.append(r9)
        L_0x0108:
            int r8 = r8 + 1
            if (r8 < r1) goto L_0x0011
            int r0 = r3.length()
            r1 = r5
            r8 = r1
        L_0x0112:
            if (r1 >= r0) goto L_0x0130
            int r9 = r1 % 2
            if (r9 == 0) goto L_0x011a
            r9 = r6
            goto L_0x011b
        L_0x011a:
            r9 = r5
        L_0x011b:
            if (r9 == 0) goto L_0x0129
            int r8 = r8 * 30
            char r9 = r3.charAt(r1)
            int r8 = r8 + r9
            char r8 = (char) r8
            r2.append(r8)
            goto L_0x012d
        L_0x0129:
            char r8 = r3.charAt(r1)
        L_0x012d:
            int r1 = r1 + 1
            goto L_0x0112
        L_0x0130:
            int r0 = r0 % r4
            if (r0 == 0) goto L_0x013a
            int r8 = r8 * 30
            int r8 = r8 + r15
            char r0 = (char) r8
            r2.append(r0)
        L_0x013a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.encoder.PDF417HighLevelEncoder.encodeText(com.google.zxing.common.ECIInput, int, int, java.lang.StringBuilder, int):int");
    }

    private static void encodingECI(int i, StringBuilder sb) throws WriterException {
        if (i >= 0 && i < LATCH_TO_TEXT) {
            sb.append(927);
            sb.append((char) i);
        } else if (i < 810900) {
            sb.append(926);
            sb.append((char) ((i / LATCH_TO_TEXT) - 1));
            sb.append((char) (i % LATCH_TO_TEXT));
        } else if (i < 811800) {
            sb.append(925);
            sb.append((char) (810900 - i));
        } else {
            throw new WriterException("ECI number not in valid range from 0..811799, but was " + i);
        }
    }

    private static boolean isAlphaLower(char c) {
        return c == ' ' || (c >= 'a' && c <= 'z');
    }

    private static boolean isAlphaUpper(char c) {
        return c == ' ' || (c >= 'A' && c <= 'Z');
    }

    private static boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    private static boolean isMixed(char c) {
        if (MIXED[c] != -1) {
            return true;
        }
        return false;
    }

    private static boolean isPunctuation(char c) {
        if (PUNCTUATION[c] != -1) {
            return true;
        }
        return false;
    }

    private static boolean isText(char c) {
        return c == 9 || c == 10 || c == 13 || (c >= ' ' && c <= '~');
    }

    public static byte[] subBytes(ECIInput eCIInput, int i, int i2) {
        byte[] bArr = new byte[(i2 - i)];
        for (int i3 = i; i3 < i2; i3++) {
            bArr[i3 - i] = (byte) (eCIInput.charAt(i3) & 255);
        }
        return bArr;
    }
}
