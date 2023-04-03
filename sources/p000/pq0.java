package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001a:\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\t\u001a\u00020\u0000*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0000H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\f\u001a\u00020\u0000*\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0000H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\n\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, mo44877d2 = {"", "minWidth", "maxWidth", "minHeight", "maxHeight", "Lmq0;", "a", "(IIII)J", "width", "d", "(JI)I", "height", "c", "ui-unit_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: pq0 */
/* compiled from: Constraints.kt */
public final class pq0 {
    /* renamed from: a */
    public static final long m25130a(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (i2 >= i) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i4 >= i3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i < 0 || i3 < 0) {
                    z3 = false;
                }
                if (z3) {
                    return mq0.f15127b.mo23285b(i, i2, i3, i4);
                }
                throw new IllegalArgumentException(("minWidth(" + i + ") and minHeight(" + i3 + ") must be >= 0").toString());
            }
            throw new IllegalArgumentException(("maxHeight(" + i4 + ") must be >= than minHeight(" + i3 + ')').toString());
        }
        throw new IllegalArgumentException(("maxWidth(" + i2 + ") must be >= than minWidth(" + i + ')').toString());
    }

    /* renamed from: b */
    public static /* synthetic */ long m25131b(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return m25130a(i, i2, i3, i4);
    }

    /* renamed from: c */
    public static final int m25132c(long j, int i) {
        return d75.m43389k(i, mq0.m22478i(j), mq0.m22476g(j));
    }

    /* renamed from: d */
    public static final int m25133d(long j, int i) {
        return d75.m43389k(i, mq0.m22479j(j), mq0.m22477h(j));
    }
}
