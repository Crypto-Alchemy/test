package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\n\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, mo44877d2 = {"", "", "n", "(Ljava/lang/String;)Ljava/lang/Integer;", "radix", "o", "(Ljava/lang/String;I)Ljava/lang/Integer;", "", "p", "(Ljava/lang/String;)Ljava/lang/Long;", "q", "(Ljava/lang/String;I)Ljava/lang/Long;", "kotlin-stdlib"}, mo44878k = 5, mo44879mv = {1, 7, 1}, mo44882xs = "kotlin/text/StringsKt")
/* renamed from: xb6 */
/* compiled from: StringNumberConversions.kt */
public class xb6 extends wb6 {
    /* renamed from: n */
    public static final Integer m73916n(String str) {
        vx2.m53591g(str, "<this>");
        return m73917o(str, 10);
    }

    /* renamed from: o */
    public static final Integer m73917o(String str, int i) {
        boolean z;
        int i2;
        vx2.m53591g(str, "<this>");
        wd0.m73569a(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char charAt = str.charAt(0);
        int i4 = vx2.m53593i(charAt, 48);
        int i5 = CellBase.GROUP_ID_END_USER;
        int i6 = 1;
        if (i4 >= 0) {
            z = false;
            i6 = 0;
        } else if (length == 1) {
            return null;
        } else {
            if (charAt == '-') {
                i5 = Integer.MIN_VALUE;
                z = true;
            } else if (charAt != '+') {
                return null;
            } else {
                z = false;
            }
        }
        int i7 = -59652323;
        while (i6 < length) {
            int b = wd0.m73570b(str.charAt(i6), i);
            if (b < 0) {
                return null;
            }
            if ((i3 < i7 && (i7 != -59652323 || i3 < (i7 = i5 / i))) || (i2 = i3 * i) < i5 + b) {
                return null;
            }
            i3 = i2 - b;
            i6++;
        }
        if (z) {
            return Integer.valueOf(i3);
        }
        return Integer.valueOf(-i3);
    }

    /* renamed from: p */
    public static final Long m73918p(String str) {
        vx2.m53591g(str, "<this>");
        return m73919q(str, 10);
    }

    /* renamed from: q */
    public static final Long m73919q(String str, int i) {
        String str2 = str;
        int i2 = i;
        vx2.m53591g(str2, "<this>");
        wd0.m73569a(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char charAt = str2.charAt(0);
        int i4 = vx2.m53593i(charAt, 48);
        long j = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        boolean z = true;
        if (i4 >= 0) {
            z = false;
        } else if (length == 1) {
            return null;
        } else {
            if (charAt == '-') {
                j = Long.MIN_VALUE;
                i3 = 1;
            } else if (charAt != '+') {
                return null;
            } else {
                z = false;
                i3 = 1;
            }
        }
        long j2 = -256204778801521550L;
        long j3 = 0;
        long j4 = -256204778801521550L;
        while (i3 < length) {
            int b = wd0.m73570b(str2.charAt(i3), i2);
            if (b < 0) {
                return null;
            }
            if (j3 < j4) {
                if (j4 == j2) {
                    j4 = j / ((long) i2);
                    if (j3 < j4) {
                    }
                }
                return null;
            }
            long j5 = j3 * ((long) i2);
            long j6 = (long) b;
            if (j5 < j + j6) {
                return null;
            }
            j3 = j5 - j6;
            i3++;
            j2 = -256204778801521550L;
        }
        if (z) {
            return Long.valueOf(j3);
        }
        return Long.valueOf(-j3);
    }
}
