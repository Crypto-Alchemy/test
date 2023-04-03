package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¨\u0006\u0005"}, mo44877d2 = {"Lnl3;", "Lcf;", "alignmentLine", "", "b", "ui_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: ue3 */
/* compiled from: LayoutModifierNodeCoordinator.kt */
public final class ue3 {
    /* renamed from: b */
    public static final int m28204b(nl3 nl3, C1677cf cfVar) {
        boolean z;
        int i;
        nl3 U = nl3.mo3590U();
        if (U != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalStateException(("Child of " + nl3 + " cannot be null when calculating alignment line").toString());
        } else if (nl3.mo3598Y().mo23300b().containsKey(cfVar)) {
            Integer num = nl3.mo3598Y().mo23300b().get(cfVar);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        } else {
            int T = U.mo23723T(cfVar);
            if (T == Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            U.mo23728g0(true);
            nl3.mo23727f0(true);
            nl3.mo3608e0();
            U.mo23728g0(false);
            nl3.mo23727f0(false);
            if (cfVar instanceof um2) {
                i = nw2.m23482g(U.mo3602a0());
            } else {
                i = nw2.m23481f(U.mo3602a0());
            }
            return T + i;
        }
    }
}
