package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import java.util.Collection;
import java.util.Collections;

public class Code93Writer extends OneDimensionalCodeWriter {
    @Deprecated
    public static int appendPattern(boolean[] zArr, int i, int[] iArr, boolean z) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i + 1;
            zArr[i] = iArr[i2] != 0;
            i2++;
            i = i3;
        }
        return 9;
    }

    private static int computeChecksumIndex(String str, int i) {
        int i2 = 0;
        int i3 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i2 += Code93Reader.ALPHABET_STRING.indexOf(str.charAt(length)) * i3;
            i3++;
            if (i3 > i) {
                i3 = 1;
            }
        }
        return i2 % 47;
    }

    public static String convertToExtended(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length * 2);
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == 0) {
                sb.append("bU");
            } else if (charAt <= 26) {
                sb.append('a');
                sb.append((char) ((charAt + 'A') - 1));
            } else if (charAt <= 31) {
                sb.append('b');
                sb.append((char) ((charAt + 'A') - 27));
            } else if (charAt == ' ' || charAt == '$' || charAt == '%' || charAt == '+') {
                sb.append(charAt);
            } else if (charAt <= ',') {
                sb.append('c');
                sb.append((char) ((charAt + 'A') - 33));
            } else if (charAt <= '9') {
                sb.append(charAt);
            } else if (charAt == ':') {
                sb.append("cZ");
            } else if (charAt <= '?') {
                sb.append('b');
                sb.append((char) ((charAt + 'F') - 59));
            } else if (charAt == '@') {
                sb.append("bV");
            } else if (charAt <= 'Z') {
                sb.append(charAt);
            } else if (charAt <= '_') {
                sb.append('b');
                sb.append((char) ((charAt + 'K') - 91));
            } else if (charAt == '`') {
                sb.append("bW");
            } else if (charAt <= 'z') {
                sb.append('d');
                sb.append((char) ((charAt + 'A') - 97));
            } else if (charAt <= 127) {
                sb.append('b');
                sb.append((char) ((charAt + 'P') - 123));
            } else {
                throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + charAt + "'");
            }
        }
        return sb.toString();
    }

    public boolean[] encode(String str) {
        String convertToExtended = convertToExtended(str);
        int length = convertToExtended.length();
        if (length <= 80) {
            boolean[] zArr = new boolean[(((convertToExtended.length() + 2 + 2) * 9) + 1)];
            int appendPattern = appendPattern(zArr, 0, Code93Reader.ASTERISK_ENCODING);
            for (int i = 0; i < length; i++) {
                appendPattern += appendPattern(zArr, appendPattern, Code93Reader.CHARACTER_ENCODINGS[Code93Reader.ALPHABET_STRING.indexOf(convertToExtended.charAt(i))]);
            }
            int computeChecksumIndex = computeChecksumIndex(convertToExtended, 20);
            int[] iArr = Code93Reader.CHARACTER_ENCODINGS;
            int appendPattern2 = appendPattern + appendPattern(zArr, appendPattern, iArr[computeChecksumIndex]);
            int appendPattern3 = appendPattern2 + appendPattern(zArr, appendPattern2, iArr[computeChecksumIndex(convertToExtended + Code93Reader.ALPHABET_STRING.charAt(computeChecksumIndex), 15)]);
            zArr[appendPattern3 + appendPattern(zArr, appendPattern3, Code93Reader.ASTERISK_ENCODING)] = true;
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long after converting to extended encoding, but got " + length);
    }

    public Collection<BarcodeFormat> getSupportedWriteFormats() {
        return Collections.singleton(BarcodeFormat.CODE_93);
    }

    private static int appendPattern(boolean[] zArr, int i, int i2) {
        for (int i3 = 0; i3 < 9; i3++) {
            boolean z = true;
            int i4 = i + i3;
            if (((1 << (8 - i3)) & i2) == 0) {
                z = false;
            }
            zArr[i4] = z;
        }
        return 9;
    }
}
