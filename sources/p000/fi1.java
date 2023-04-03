package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u000f\u001a\u00020\u000eø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0001\u000f\u0001\u00020\u000eø\u0001\u0001\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0012"}, mo44877d2 = {"Lfi1;", "", "other", "", "a", "(JJ)I", "", "c", "(J)F", "distance", "", "d", "(J)Z", "isInLayer", "", "packedValue", "b", "(J)J", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: fi1 */
/* compiled from: HitTestResult.kt */
public final class fi1 {
    /* renamed from: a */
    public static final int m17003a(long j, long j2) {
        boolean d = m17006d(j);
        if (d == m17006d(j2)) {
            return (int) Math.signum(m17005c(j) - m17005c(j2));
        }
        if (d) {
            return -1;
        }
        return 1;
    }

    /* renamed from: b */
    public static long m17004b(long j) {
        return j;
    }

    /* renamed from: c */
    public static final float m17005c(long j) {
        q42 q42 = q42.f32916a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: d */
    public static final boolean m17006d(long j) {
        return ((int) (j & 4294967295L)) != 0;
    }
}
