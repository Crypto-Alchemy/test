package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0018\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a,\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0000\u001a,\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\t2\b\b\u0002\u0010\u0006\u001a\u00020\t2\b\b\u0002\u0010\u0007\u001a\u00020\tH\u0000¨\u0006\u000b"}, mo44877d2 = {"", "propertyName", "", "defaultValue", "c", "", "minValue", "maxValue", "a", "", "b", "kotlinx-coroutines-core"}, mo44878k = 5, mo44879mv = {1, 6, 0}, mo44882xs = "kotlinx/coroutines/internal/SystemPropsKt")
/* renamed from: fl6 */
/* compiled from: SystemProps.common.kt */
public final /* synthetic */ class fl6 {
    /* renamed from: a */
    public static final int m57783a(String str, int i, int i2, int i3) {
        return (int) dl6.m56898c(str, (long) i, (long) i2, (long) i3);
    }

    /* renamed from: b */
    public static final long m57784b(String str, long j, long j2, long j3) {
        String d = dl6.m56899d(str);
        if (d == null) {
            return j;
        }
        Long p = xb6.m73918p(d);
        if (p != null) {
            long longValue = p.longValue();
            boolean z = false;
            if (j2 <= longValue && longValue <= j3) {
                z = true;
            }
            if (z) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + d + '\'').toString());
    }

    /* renamed from: c */
    public static final boolean m57785c(String str, boolean z) {
        String d = dl6.m56899d(str);
        if (d != null) {
            return Boolean.parseBoolean(d);
        }
        return z;
    }

    /* renamed from: d */
    public static /* synthetic */ int m57786d(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return dl6.m56897b(str, i, i2, i3);
    }

    /* renamed from: e */
    public static /* synthetic */ long m57787e(String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            j3 = Long.MAX_VALUE;
        }
        return dl6.m56898c(str, j, j4, j3);
    }
}
