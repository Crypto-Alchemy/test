package com.google.zxing.common;

import com.google.zxing.DecodeHintType;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public final class StringUtils {
    private static final boolean ASSUME_SHIFT_JIS;
    private static final Charset EUC_JP;
    public static final String GB2312 = "GB2312";
    public static final Charset GB2312_CHARSET = Charset.forName(GB2312);
    private static final Charset PLATFORM_DEFAULT_ENCODING;
    public static final String SHIFT_JIS = "SJIS";
    public static final Charset SHIFT_JIS_CHARSET;

    static {
        boolean z;
        Charset defaultCharset = Charset.defaultCharset();
        PLATFORM_DEFAULT_ENCODING = defaultCharset;
        Charset forName = Charset.forName(SHIFT_JIS);
        SHIFT_JIS_CHARSET = forName;
        Charset forName2 = Charset.forName("EUC_JP");
        EUC_JP = forName2;
        if (forName.equals(defaultCharset) || forName2.equals(defaultCharset)) {
            z = true;
        } else {
            z = false;
        }
        ASSUME_SHIFT_JIS = z;
    }

    private StringUtils() {
    }

    public static Charset guessCharset(byte[] bArr, Map<DecodeHintType, ?> map) {
        boolean z;
        byte b;
        byte[] bArr2 = bArr;
        Map<DecodeHintType, ?> map2 = map;
        if (map2 != null) {
            DecodeHintType decodeHintType = DecodeHintType.CHARACTER_SET;
            if (map2.containsKey(decodeHintType)) {
                return Charset.forName(map2.get(decodeHintType).toString());
            }
        }
        boolean z2 = true;
        int i = 0;
        if (bArr2.length > 2 && (((b = bArr2[0]) == -2 && bArr2[1] == -1) || (b == -1 && bArr2[1] == -2))) {
            return StandardCharsets.UTF_16;
        }
        int length = bArr2.length;
        if (bArr2.length > 3 && bArr2[0] == -17 && bArr2[1] == -69 && bArr2[2] == -65) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = true;
        boolean z4 = true;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i3 < length && (z2 || z3 || z4)) {
            byte b2 = bArr2[i3] & 255;
            if (z4) {
                if (i4 > 0) {
                    if ((b2 & 128) != 0) {
                        i4--;
                    }
                } else if ((b2 & 128) != 0) {
                    if ((b2 & 64) != 0) {
                        i4++;
                        if ((b2 & 32) == 0) {
                            i6++;
                        } else {
                            i4++;
                            if ((b2 & 16) == 0) {
                                i7++;
                            } else {
                                i4++;
                                if ((b2 & 8) == 0) {
                                    i8++;
                                }
                            }
                        }
                    }
                }
                z4 = false;
            }
            if (z2) {
                if (b2 > Byte.MAX_VALUE && b2 < 160) {
                    z2 = false;
                } else if (b2 > 159 && (b2 < 192 || b2 == 215 || b2 == 247)) {
                    i10++;
                }
            }
            if (z3) {
                if (i5 > 0) {
                    if (b2 >= 64 && b2 != Byte.MAX_VALUE && b2 <= 252) {
                        i5--;
                    }
                } else if (!(b2 == 128 || b2 == 160 || b2 > 239)) {
                    if (b2 <= 160 || b2 >= 224) {
                        if (b2 > Byte.MAX_VALUE) {
                            i5++;
                            int i13 = i11 + 1;
                            if (i13 > i) {
                                i = i13;
                                i11 = i;
                            } else {
                                i11 = i13;
                            }
                        } else {
                            i11 = 0;
                        }
                        i12 = 0;
                    } else {
                        i2++;
                        int i14 = i12 + 1;
                        if (i14 > i9) {
                            i9 = i14;
                            i12 = i9;
                        } else {
                            i12 = i14;
                        }
                        i11 = 0;
                    }
                }
                z3 = false;
            }
            i3++;
            bArr2 = bArr;
        }
        if (z4 && i4 > 0) {
            z4 = false;
        }
        if (z3 && i5 > 0) {
            z3 = false;
        }
        if (z4 && (z || i6 + i7 + i8 > 0)) {
            return StandardCharsets.UTF_8;
        }
        if (z3 && (ASSUME_SHIFT_JIS || i9 >= 3 || i >= 3)) {
            return SHIFT_JIS_CHARSET;
        }
        if (!z2 || !z3) {
            if (z2) {
                return StandardCharsets.ISO_8859_1;
            }
            if (z3) {
                return SHIFT_JIS_CHARSET;
            }
            if (z4) {
                return StandardCharsets.UTF_8;
            }
            return PLATFORM_DEFAULT_ENCODING;
        } else if ((i9 != 2 || i2 != 2) && i10 * 10 < length) {
            return StandardCharsets.ISO_8859_1;
        } else {
            return SHIFT_JIS_CHARSET;
        }
    }

    public static String guessEncoding(byte[] bArr, Map<DecodeHintType, ?> map) {
        Charset guessCharset = guessCharset(bArr, map);
        if (guessCharset == SHIFT_JIS_CHARSET) {
            return SHIFT_JIS;
        }
        if (guessCharset == StandardCharsets.UTF_8) {
            return "UTF8";
        }
        if (guessCharset == StandardCharsets.ISO_8859_1) {
            return "ISO8859_1";
        }
        return guessCharset.name();
    }
}
