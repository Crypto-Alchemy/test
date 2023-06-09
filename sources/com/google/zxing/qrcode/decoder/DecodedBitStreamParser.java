package com.google.zxing.qrcode.decoder;

import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitSource;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.StringUtils;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;

final class DecodedBitStreamParser {
    private static final char[] ALPHANUMERIC_CHARS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();
    private static final int GB2312_SUBSET = 1;

    /* renamed from: com.google.zxing.qrcode.decoder.DecodedBitStreamParser$1 */
    public static /* synthetic */ class C50541 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$zxing$qrcode$decoder$Mode;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.zxing.qrcode.decoder.Mode[] r0 = com.google.zxing.qrcode.decoder.Mode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode = r0
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$google$zxing$qrcode$decoder$Mode     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.ALPHANUMERIC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$google$zxing$qrcode$decoder$Mode     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.BYTE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$google$zxing$qrcode$decoder$Mode     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.KANJI     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$google$zxing$qrcode$decoder$Mode     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.TERMINATOR     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$google$zxing$qrcode$decoder$Mode     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.FNC1_FIRST_POSITION     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$com$google$zxing$qrcode$decoder$Mode     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.FNC1_SECOND_POSITION     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = $SwitchMap$com$google$zxing$qrcode$decoder$Mode     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.STRUCTURED_APPEND     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = $SwitchMap$com$google$zxing$qrcode$decoder$Mode     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.ECI     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = $SwitchMap$com$google$zxing$qrcode$decoder$Mode     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.HANZI     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.decoder.DecodedBitStreamParser.C50541.<clinit>():void");
        }
    }

    private DecodedBitStreamParser() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0064, code lost:
        r20 = 3;
        r19 = 2;
        r11 = r5;
        r21 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009f, code lost:
        r11 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00eb, code lost:
        if (r11 != com.google.zxing.qrcode.decoder.Mode.TERMINATOR) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ed, code lost:
        if (r18 == null) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ef, code lost:
        if (r16 == false) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f1, code lost:
        r15 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f4, code lost:
        if (r17 == false) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f6, code lost:
        r0 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f8, code lost:
        r15 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00fb, code lost:
        if (r16 == false) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fd, code lost:
        r15 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0100, code lost:
        if (r17 == false) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0102, code lost:
        r0 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0103, code lost:
        r15 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0105, code lost:
        r15 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0106, code lost:
        r1 = r8.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0110, code lost:
        if (r10.isEmpty() == false) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0112, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0114, code lost:
        r11 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0115, code lost:
        if (r24 != null) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0118, code lost:
        r12 = r24.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0124, code lost:
        return new com.google.zxing.common.DecoderResult(r22, r1, r11, r12, r13, r14, r15);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.zxing.common.DecoderResult decode(byte[] r22, com.google.zxing.qrcode.decoder.Version r23, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel r24, java.util.Map<com.google.zxing.DecodeHintType, ?> r25) throws com.google.zxing.FormatException {
        /*
            r0 = r23
            com.google.zxing.common.BitSource r7 = new com.google.zxing.common.BitSource
            r9 = r22
            r7.<init>(r9)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r1 = 50
            r8.<init>(r1)
            java.util.ArrayList r10 = new java.util.ArrayList
            r11 = 1
            r10.<init>(r11)
            r1 = -1
            r2 = 0
            r12 = 0
            r13 = r1
            r14 = r13
            r15 = r2
            r16 = r15
            r17 = r16
            r18 = r12
        L_0x0022:
            int r1 = r7.available()     // Catch:{ IllegalArgumentException -> 0x0128 }
            r6 = 4
            if (r1 >= r6) goto L_0x002d
            com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.TERMINATOR     // Catch:{ IllegalArgumentException -> 0x0128 }
        L_0x002b:
            r5 = r1
            goto L_0x0036
        L_0x002d:
            int r1 = r7.readBits(r6)     // Catch:{ IllegalArgumentException -> 0x0128 }
            com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.forBits(r1)     // Catch:{ IllegalArgumentException -> 0x0128 }
            goto L_0x002b
        L_0x0036:
            int[] r1 = com.google.zxing.qrcode.decoder.DecodedBitStreamParser.C50541.$SwitchMap$com$google$zxing$qrcode$decoder$Mode     // Catch:{ IllegalArgumentException -> 0x0128 }
            int r2 = r5.ordinal()     // Catch:{ IllegalArgumentException -> 0x0128 }
            r2 = r1[r2]     // Catch:{ IllegalArgumentException -> 0x0128 }
            r4 = 2
            r3 = 3
            switch(r2) {
                case 5: goto L_0x0064;
                case 6: goto L_0x0096;
                case 7: goto L_0x008c;
                case 8: goto L_0x0072;
                case 9: goto L_0x005a;
                case 10: goto L_0x0048;
                default: goto L_0x0043;
            }     // Catch:{ IllegalArgumentException -> 0x0128 }
        L_0x0043:
            int r2 = r5.getCharacterCountBits(r0)     // Catch:{ IllegalArgumentException -> 0x0128 }
            goto L_0x00a1
        L_0x0048:
            int r1 = r7.readBits(r6)     // Catch:{ IllegalArgumentException -> 0x0128 }
            int r2 = r5.getCharacterCountBits(r0)     // Catch:{ IllegalArgumentException -> 0x0128 }
            int r2 = r7.readBits(r2)     // Catch:{ IllegalArgumentException -> 0x0128 }
            if (r1 != r11) goto L_0x0064
            decodeHanziSegment(r7, r8, r2)     // Catch:{ IllegalArgumentException -> 0x0128 }
            goto L_0x0064
        L_0x005a:
            int r1 = parseECIValue(r7)     // Catch:{ IllegalArgumentException -> 0x0128 }
            com.google.zxing.common.CharacterSetECI r18 = com.google.zxing.common.CharacterSetECI.getCharacterSetECIByValue(r1)     // Catch:{ IllegalArgumentException -> 0x0128 }
            if (r18 == 0) goto L_0x006d
        L_0x0064:
            r20 = r3
            r19 = r4
            r11 = r5
            r21 = r6
            goto L_0x00e9
        L_0x006d:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.getFormatInstance()     // Catch:{ IllegalArgumentException -> 0x0128 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0128 }
        L_0x0072:
            int r1 = r7.available()     // Catch:{ IllegalArgumentException -> 0x0128 }
            r2 = 16
            if (r1 < r2) goto L_0x0087
            r1 = 8
            int r2 = r7.readBits(r1)     // Catch:{ IllegalArgumentException -> 0x0128 }
            int r1 = r7.readBits(r1)     // Catch:{ IllegalArgumentException -> 0x0128 }
            r14 = r1
            r13 = r2
            goto L_0x0064
        L_0x0087:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.getFormatInstance()     // Catch:{ IllegalArgumentException -> 0x0128 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0128 }
        L_0x008c:
            r20 = r3
            r19 = r4
            r21 = r6
            r15 = r11
            r17 = r15
            goto L_0x009f
        L_0x0096:
            r20 = r3
            r19 = r4
            r21 = r6
            r15 = r11
            r16 = r15
        L_0x009f:
            r11 = r5
            goto L_0x00e9
        L_0x00a1:
            int r2 = r7.readBits(r2)     // Catch:{ IllegalArgumentException -> 0x0128 }
            int r19 = r5.ordinal()     // Catch:{ IllegalArgumentException -> 0x0128 }
            r1 = r1[r19]     // Catch:{ IllegalArgumentException -> 0x0128 }
            if (r1 == r11) goto L_0x00de
            if (r1 == r4) goto L_0x00d2
            if (r1 == r3) goto L_0x00bc
            if (r1 != r6) goto L_0x00b7
            decodeKanjiSegment(r7, r8, r2)     // Catch:{ IllegalArgumentException -> 0x0128 }
            goto L_0x0064
        L_0x00b7:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.getFormatInstance()     // Catch:{ IllegalArgumentException -> 0x0128 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0128 }
        L_0x00bc:
            r1 = r7
            r19 = r2
            r2 = r8
            r20 = r3
            r3 = r19
            r19 = r4
            r4 = r18
            r11 = r5
            r5 = r10
            r21 = r6
            r6 = r25
            decodeByteSegment(r1, r2, r3, r4, r5, r6)     // Catch:{ IllegalArgumentException -> 0x0128 }
            goto L_0x00e9
        L_0x00d2:
            r1 = r2
            r20 = r3
            r19 = r4
            r11 = r5
            r21 = r6
            decodeAlphanumericSegment(r7, r8, r1, r15)     // Catch:{ IllegalArgumentException -> 0x0128 }
            goto L_0x00e9
        L_0x00de:
            r1 = r2
            r20 = r3
            r19 = r4
            r11 = r5
            r21 = r6
            decodeNumericSegment(r7, r8, r1)     // Catch:{ IllegalArgumentException -> 0x0128 }
        L_0x00e9:
            com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.TERMINATOR     // Catch:{ IllegalArgumentException -> 0x0128 }
            if (r11 != r1) goto L_0x0125
            if (r18 == 0) goto L_0x00fb
            if (r16 == 0) goto L_0x00f4
            r15 = r21
            goto L_0x0106
        L_0x00f4:
            if (r17 == 0) goto L_0x00f8
            r0 = 6
            goto L_0x0103
        L_0x00f8:
            r15 = r19
            goto L_0x0106
        L_0x00fb:
            if (r16 == 0) goto L_0x0100
            r15 = r20
            goto L_0x0106
        L_0x0100:
            if (r17 == 0) goto L_0x0105
            r0 = 5
        L_0x0103:
            r15 = r0
            goto L_0x0106
        L_0x0105:
            r15 = 1
        L_0x0106:
            com.google.zxing.common.DecoderResult r0 = new com.google.zxing.common.DecoderResult
            java.lang.String r1 = r8.toString()
            boolean r2 = r10.isEmpty()
            if (r2 == 0) goto L_0x0114
            r11 = r12
            goto L_0x0115
        L_0x0114:
            r11 = r10
        L_0x0115:
            if (r24 != 0) goto L_0x0118
            goto L_0x011d
        L_0x0118:
            java.lang.String r2 = r24.toString()
            r12 = r2
        L_0x011d:
            r8 = r0
            r9 = r22
            r10 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            return r0
        L_0x0125:
            r11 = 1
            goto L_0x0022
        L_0x0128:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.getFormatInstance()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.decoder.DecodedBitStreamParser.decode(byte[], com.google.zxing.qrcode.decoder.Version, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel, java.util.Map):com.google.zxing.common.DecoderResult");
    }

    private static void decodeAlphanumericSegment(BitSource bitSource, StringBuilder sb, int i, boolean z) throws FormatException {
        while (i > 1) {
            if (bitSource.available() >= 11) {
                int readBits = bitSource.readBits(11);
                sb.append(toAlphaNumericChar(readBits / 45));
                sb.append(toAlphaNumericChar(readBits % 45));
                i -= 2;
            } else {
                throw FormatException.getFormatInstance();
            }
        }
        if (i == 1) {
            if (bitSource.available() >= 6) {
                sb.append(toAlphaNumericChar(bitSource.readBits(6)));
            } else {
                throw FormatException.getFormatInstance();
            }
        }
        if (z) {
            for (int length = sb.length(); length < sb.length(); length++) {
                if (sb.charAt(length) == '%') {
                    if (length < sb.length() - 1) {
                        int i2 = length + 1;
                        if (sb.charAt(i2) == '%') {
                            sb.deleteCharAt(i2);
                        }
                    }
                    sb.setCharAt(length, 29);
                }
            }
        }
    }

    private static void decodeByteSegment(BitSource bitSource, StringBuilder sb, int i, CharacterSetECI characterSetECI, Collection<byte[]> collection, Map<DecodeHintType, ?> map) throws FormatException {
        Charset charset;
        if (i * 8 <= bitSource.available()) {
            byte[] bArr = new byte[i];
            for (int i2 = 0; i2 < i; i2++) {
                bArr[i2] = (byte) bitSource.readBits(8);
            }
            if (characterSetECI == null) {
                charset = StringUtils.guessCharset(bArr, map);
            } else {
                charset = characterSetECI.getCharset();
            }
            sb.append(new String(bArr, charset));
            collection.add(bArr);
            return;
        }
        throw FormatException.getFormatInstance();
    }

    private static void decodeHanziSegment(BitSource bitSource, StringBuilder sb, int i) throws FormatException {
        int i2;
        if (i * 13 <= bitSource.available()) {
            byte[] bArr = new byte[(i * 2)];
            int i3 = 0;
            while (i > 0) {
                int readBits = bitSource.readBits(13);
                int i4 = (readBits % 96) | ((readBits / 96) << 8);
                if (i4 < 2560) {
                    i2 = 41377;
                } else {
                    i2 = 42657;
                }
                int i5 = i4 + i2;
                bArr[i3] = (byte) ((i5 >> 8) & 255);
                bArr[i3 + 1] = (byte) (i5 & 255);
                i3 += 2;
                i--;
            }
            sb.append(new String(bArr, StringUtils.GB2312_CHARSET));
            return;
        }
        throw FormatException.getFormatInstance();
    }

    private static void decodeKanjiSegment(BitSource bitSource, StringBuilder sb, int i) throws FormatException {
        int i2;
        if (i * 13 <= bitSource.available()) {
            byte[] bArr = new byte[(i * 2)];
            int i3 = 0;
            while (i > 0) {
                int readBits = bitSource.readBits(13);
                int i4 = (readBits % 192) | ((readBits / 192) << 8);
                if (i4 < 7936) {
                    i2 = 33088;
                } else {
                    i2 = 49472;
                }
                int i5 = i4 + i2;
                bArr[i3] = (byte) (i5 >> 8);
                bArr[i3 + 1] = (byte) i5;
                i3 += 2;
                i--;
            }
            sb.append(new String(bArr, StringUtils.SHIFT_JIS_CHARSET));
            return;
        }
        throw FormatException.getFormatInstance();
    }

    private static void decodeNumericSegment(BitSource bitSource, StringBuilder sb, int i) throws FormatException {
        while (i >= 3) {
            if (bitSource.available() >= 10) {
                int readBits = bitSource.readBits(10);
                if (readBits < 1000) {
                    sb.append(toAlphaNumericChar(readBits / 100));
                    sb.append(toAlphaNumericChar((readBits / 10) % 10));
                    sb.append(toAlphaNumericChar(readBits % 10));
                    i -= 3;
                } else {
                    throw FormatException.getFormatInstance();
                }
            } else {
                throw FormatException.getFormatInstance();
            }
        }
        if (i == 2) {
            if (bitSource.available() >= 7) {
                int readBits2 = bitSource.readBits(7);
                if (readBits2 < 100) {
                    sb.append(toAlphaNumericChar(readBits2 / 10));
                    sb.append(toAlphaNumericChar(readBits2 % 10));
                    return;
                }
                throw FormatException.getFormatInstance();
            }
            throw FormatException.getFormatInstance();
        } else if (i != 1) {
        } else {
            if (bitSource.available() >= 4) {
                int readBits3 = bitSource.readBits(4);
                if (readBits3 < 10) {
                    sb.append(toAlphaNumericChar(readBits3));
                    return;
                }
                throw FormatException.getFormatInstance();
            }
            throw FormatException.getFormatInstance();
        }
    }

    private static int parseECIValue(BitSource bitSource) throws FormatException {
        int readBits = bitSource.readBits(8);
        if ((readBits & 128) == 0) {
            return readBits & 127;
        }
        if ((readBits & 192) == 128) {
            return bitSource.readBits(8) | ((readBits & 63) << 8);
        }
        if ((readBits & 224) == 192) {
            return bitSource.readBits(16) | ((readBits & 31) << 16);
        }
        throw FormatException.getFormatInstance();
    }

    private static char toAlphaNumericChar(int i) throws FormatException {
        char[] cArr = ALPHANUMERIC_CHARS;
        if (i < cArr.length) {
            return cArr[i];
        }
        throw FormatException.getFormatInstance();
    }
}
