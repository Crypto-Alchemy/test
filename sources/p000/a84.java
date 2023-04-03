package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a;\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0007"}, mo44877d2 = {"T", "Lnb1;", "Lc84;", "type", "stopType", "b", "(Lnb1;II)Ljava/lang/Object;", "ui_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: a84 */
/* compiled from: NodeCoordinator.kt */
public final class a84 {
    /* renamed from: b */
    public static final <T> T m129b(nb1 nb1, int i, int i2) {
        T u = nb1.mo23638l().mo25986u();
        if (u == null || (u.mo25985t() & i) == 0) {
            return null;
        }
        while (u != null) {
            int w = u.mo25988w();
            if ((w & i2) != 0) {
                return null;
            }
            if ((w & i) != 0) {
                return u;
            }
            u = u.mo25986u();
        }
        return null;
    }
}
