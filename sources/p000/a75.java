package p000;

import kotlin.Metadata;
import kotlin.random.Random;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\b\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\rH\u0000\u001a\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000fH\u0000\u001a\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u0011H\u0000¨\u0006\u0014"}, mo44877d2 = {"Lkotlin/random/Random;", "Lrw2;", "range", "", "f", "value", "e", "bitCount", "g", "from", "until", "Lr37;", "c", "", "d", "", "b", "", "", "a", "kotlin-stdlib"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: a75 */
/* compiled from: Random.kt */
public final class a75 {
    /* renamed from: a */
    public static final String m31735a(Object obj, Object obj2) {
        vx2.m53591g(obj, "from");
        vx2.m53591g(obj2, "until");
        return "Random range is empty: [" + obj + ", " + obj2 + ").";
    }

    /* renamed from: b */
    public static final void m31736b(double d, double d2) {
        boolean z;
        if (d2 > d) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(m31735a(Double.valueOf(d), Double.valueOf(d2)).toString());
        }
    }

    /* renamed from: c */
    public static final void m31737c(int i, int i2) {
        boolean z;
        if (i2 > i) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(m31735a(Integer.valueOf(i), Integer.valueOf(i2)).toString());
        }
    }

    /* renamed from: d */
    public static final void m31738d(long j, long j2) {
        boolean z;
        if (j2 > j) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(m31735a(Long.valueOf(j), Long.valueOf(j2)).toString());
        }
    }

    /* renamed from: e */
    public static final int m31739e(int i) {
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    /* renamed from: f */
    public static final int m31740f(Random random, rw2 rw2) {
        vx2.m53591g(random, "<this>");
        vx2.m53591g(rw2, "range");
        if (rw2.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + rw2);
        } else if (rw2.mo46911q() < Integer.MAX_VALUE) {
            return random.nextInt(rw2.mo46910n(), rw2.mo46911q() + 1);
        } else {
            if (rw2.mo46910n() > Integer.MIN_VALUE) {
                return random.nextInt(rw2.mo46910n() - 1, rw2.mo46911q()) + 1;
            }
            return random.nextInt();
        }
    }

    /* renamed from: g */
    public static final int m31741g(int i, int i2) {
        return (i >>> (32 - i2)) & ((-i2) >> 31);
    }
}
