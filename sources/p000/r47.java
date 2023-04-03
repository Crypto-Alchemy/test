package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0001\u001a\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0000H\u0001\u001a\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0000H\u0000\u001a\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0000¨\u0006\f"}, mo44877d2 = {"", "v1", "v2", "", "a", "v", "", "b", "", "c", "base", "d", "kotlin-stdlib"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: r47 */
/* compiled from: UnsignedUtils.kt */
public final class r47 {
    /* renamed from: a */
    public static final int m50941a(long j, long j2) {
        return vx2.m53594j(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
    }

    /* renamed from: b */
    public static final double m50942b(long j) {
        return (((double) (j >>> 11)) * ((double) 2048)) + ((double) (j & 2047));
    }

    /* renamed from: c */
    public static final String m50943c(long j) {
        return m50944d(j, 10);
    }

    /* renamed from: d */
    public static final String m50944d(long j, int i) {
        if (j >= 0) {
            String l = Long.toString(j, wd0.m73569a(i));
            vx2.m53590f(l, "toString(this, checkRadix(radix))");
            return l;
        }
        long j2 = (long) i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        StringBuilder sb = new StringBuilder();
        String l2 = Long.toString(j3, wd0.m73569a(i));
        vx2.m53590f(l2, "toString(this, checkRadix(radix))");
        sb.append(l2);
        String l3 = Long.toString(j4, wd0.m73569a(i));
        vx2.m53590f(l3, "toString(this, checkRadix(radix))");
        sb.append(l3);
        return sb.toString();
    }
}
