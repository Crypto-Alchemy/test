package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a6\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000\u001a;\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\"\u0015\u0010\u0010\u001a\u00020\r*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, mo44877d2 = {"", "left", "top", "right", "bottom", "radiusX", "radiusY", "Lyh5;", "a", "Lbu0;", "cornerRadius", "b", "(FFFFJ)Lyh5;", "", "c", "(Lyh5;)Z", "isSimple", "ui-geometry_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: bi5 */
/* compiled from: RoundRect.kt */
public final class bi5 {
    /* renamed from: a */
    public static final yh5 m11411a(float f, float f2, float f3, float f4, float f5, float f6) {
        long a = cu0.m14496a(f5, f6);
        return new yh5(f, f2, f3, f4, a, a, a, a, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public static final yh5 m11412b(float f, float f2, float f3, float f4, long j) {
        return m11411a(f, f2, f3, f4, bu0.m11576d(j), bu0.m11577e(j));
    }

    /* renamed from: c */
    public static final boolean m11413c(yh5 yh5) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        vx2.m53591g(yh5, "<this>");
        if (bu0.m11576d(yh5.mo28073h()) == bu0.m11577e(yh5.mo28073h())) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (bu0.m11576d(yh5.mo28073h()) == bu0.m11576d(yh5.mo28075i())) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (bu0.m11576d(yh5.mo28073h()) == bu0.m11577e(yh5.mo28075i())) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (bu0.m11576d(yh5.mo28073h()) == bu0.m11576d(yh5.mo28067c())) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        if (bu0.m11576d(yh5.mo28073h()) == bu0.m11577e(yh5.mo28067c())) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            if (bu0.m11576d(yh5.mo28073h()) == bu0.m11576d(yh5.mo28066b())) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z6) {
                                if (bu0.m11576d(yh5.mo28073h()) == bu0.m11577e(yh5.mo28066b())) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                if (z7) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
