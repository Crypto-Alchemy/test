package p000;

import java.math.BigDecimal;
import java.util.Arrays;

/* renamed from: g10 */
/* compiled from: BigDecimalParser */
public final class g10 {

    /* renamed from: a */
    public final char[] f12160a;

    public g10(char[] cArr) {
        this.f12160a = cArr;
    }

    /* renamed from: b */
    public static BigDecimal m17562b(String str) {
        return m17563c(str.toCharArray());
    }

    /* renamed from: c */
    public static BigDecimal m17563c(char[] cArr) {
        String str;
        int length = cArr.length;
        if (length >= 500) {
            return new g10(cArr).mo20330e(length / 10);
        }
        try {
            return new BigDecimal(cArr);
        } catch (NumberFormatException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "Not a valid number representation";
            }
            if (cArr.length <= 1000) {
                str = new String(cArr);
            } else {
                str = new String(Arrays.copyOfRange(cArr, 0, 1000)) + "(truncated, full length is " + cArr.length + " chars)";
            }
            throw new NumberFormatException("Value \"" + str + "\" can not be represented as `java.math.BigDecimal`, reason: " + message);
        }
    }

    /* renamed from: d */
    public static BigDecimal m17564d(char[] cArr, int i, int i2) {
        if (i > 0 || i2 != cArr.length) {
            cArr = Arrays.copyOfRange(cArr, i, i2 + i);
        }
        return m17563c(cArr);
    }

    /* renamed from: a */
    public final int mo20329a(int i, long j) {
        long j2 = ((long) i) - j;
        if (j2 <= 2147483647L && j2 >= -2147483648L) {
            return (int) j2;
        }
        throw new NumberFormatException("Scale out of range: " + j2 + " while adjusting scale " + i + " to exponent " + j);
    }

    /* renamed from: e */
    public final BigDecimal mo20330e(int i) {
        int i2;
        int i3;
        BigDecimal bigDecimal;
        int i4 = i;
        int length = this.f12160a.length;
        int i5 = -1;
        int i6 = -1;
        int i7 = 0;
        boolean z = false;
        boolean z2 = false;
        int i8 = 0;
        boolean z3 = false;
        for (int i9 = 0; i9 < length; i9++) {
            char c = this.f12160a[i9];
            if (c != '+') {
                if (c != 'E' && c != 'e') {
                    if (c != '-') {
                        if (c != '.') {
                            if (i6 >= 0 && i5 == -1) {
                                i7++;
                            }
                        } else if (i6 < 0) {
                            i6 = i9;
                        } else {
                            throw new NumberFormatException("Multiple decimal points");
                        }
                    } else if (i5 >= 0) {
                        if (z2) {
                            throw new NumberFormatException("Multiple signs in exponent");
                        }
                    } else if (!z) {
                        i8 = i9 + 1;
                        z = true;
                        z3 = true;
                    } else {
                        throw new NumberFormatException("Multiple signs in number");
                    }
                } else if (i5 < 0) {
                    i5 = i9;
                } else {
                    throw new NumberFormatException("Multiple exponent markers");
                }
            } else if (i5 >= 0) {
                if (z2) {
                    throw new NumberFormatException("Multiple signs in exponent");
                }
            } else if (!z) {
                i8 = i9 + 1;
                z = true;
            } else {
                throw new NumberFormatException("Multiple signs in number");
            }
            z2 = true;
        }
        if (i5 >= 0) {
            i2 = 1;
            i3 = Integer.parseInt(new String(this.f12160a, i5 + 1, (length - i5) - 1));
            i7 = mo20329a(i7, (long) i3);
            length = i5;
        } else {
            i2 = 1;
            i3 = 0;
        }
        if (i6 >= 0) {
            int i10 = (length - i6) - i2;
            bigDecimal = mo20331f(i8, i6 - i8, i3, i4).add(mo20331f(i6 + i2, i10, i3 - i10, i4));
        } else {
            bigDecimal = mo20331f(i8, length - i8, i3, i4);
        }
        if (i7 != 0) {
            bigDecimal = bigDecimal.setScale(i7);
        }
        if (z3) {
            return bigDecimal.negate();
        }
        return bigDecimal;
    }

    /* renamed from: f */
    public final BigDecimal mo20331f(int i, int i2, int i3, int i4) {
        if (i2 > i4) {
            int i5 = i2 / 2;
            return mo20331f(i, i5, (i3 + i2) - i5, i4).add(mo20331f(i + i5, i2 - i5, i3, i4));
        } else if (i2 == 0) {
            return BigDecimal.ZERO;
        } else {
            return new BigDecimal(this.f12160a, i, i2).movePointRight(i3);
        }
    }
}
