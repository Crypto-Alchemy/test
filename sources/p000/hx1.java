package p000;

import java.util.HashSet;

/* renamed from: hx1 */
/* compiled from: expandedTypeUtils.kt */
public final class hx1 {
    /* renamed from: a */
    public static final ad3 m58723a(r17 r17, ad3 ad3) {
        vx2.m53591g(r17, "<this>");
        vx2.m53591g(ad3, "inlineClassType");
        return m58724b(r17, ad3, new HashSet());
    }

    /* renamed from: b */
    public static final ad3 m58724b(r17 r17, ad3 ad3, HashSet<zz6> hashSet) {
        ad3 ad32;
        boolean z;
        ad3 ad33;
        zz6 u0 = r17.mo51107u0(ad3);
        if (!hashSet.add(u0)) {
            return null;
        }
        c17 y = r17.mo51114y(u0);
        if (y != null) {
            ad3 H = r17.mo51054H(y);
            ad32 = m58724b(r17, H, hashSet);
            if (ad32 == null) {
                return null;
            }
            if (r17.mo51094o(r17.mo51107u0(H)) || ((H instanceof f36) && r17.mo51046C((f36) H))) {
                z = true;
            } else {
                z = false;
            }
            if ((ad32 instanceof f36) && r17.mo51046C((f36) ad32) && r17.mo51066T(ad3) && z) {
                ad33 = r17.mo51097p0(H);
            } else if (!r17.mo51066T(ad32) && r17.mo51047C0(ad3)) {
                ad33 = r17.mo51097p0(ad32);
            }
            return ad33;
        } else if (!r17.mo51094o(u0)) {
            return ad3;
        } else {
            ad3 q0 = r17.mo51099q0(ad3);
            if (q0 == null || (ad32 = m58724b(r17, q0, hashSet)) == null) {
                return null;
            }
            if (r17.mo51066T(ad3)) {
                if (r17.mo51066T(ad32)) {
                    return ad3;
                }
                if (!(ad32 instanceof f36) || !r17.mo51046C((f36) ad32)) {
                    return r17.mo51097p0(ad32);
                }
                return ad3;
            }
        }
        return ad32;
    }
}
