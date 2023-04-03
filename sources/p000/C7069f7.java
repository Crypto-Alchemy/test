package p000;

/* renamed from: f7 */
/* compiled from: AbstractStrictEqualityTypeChecker.kt */
public final class C7069f7 {

    /* renamed from: a */
    public static final C7069f7 f37732a = new C7069f7();

    /* renamed from: a */
    public final boolean mo51606a(s17 s17, f36 f36, f36 f362) {
        boolean z;
        boolean z2;
        if (s17.mo51070X(f36) == s17.mo51070X(f362) && s17.mo51060N(f36) == s17.mo51060N(f362)) {
            if (s17.mo51050E0(f36) == null) {
                z = true;
            } else {
                z = false;
            }
            if (s17.mo51050E0(f362) == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z == z2 && s17.mo51103s0(s17.mo50570c(f36), s17.mo50570c(f362))) {
                if (s17.mo51058L(f36, f362)) {
                    return true;
                }
                int X = s17.mo51070X(f36);
                for (int i = 0; i < X; i++) {
                    nz6 S = s17.mo51065S(f36, i);
                    nz6 S2 = s17.mo51065S(f362, i);
                    if (s17.mo51071Y(S) != s17.mo51071Y(S2)) {
                        return false;
                    }
                    if (!s17.mo51071Y(S) && (s17.mo51072Z(S) != s17.mo51072Z(S2) || !mo51608c(s17, s17.mo51088l(S), s17.mo51088l(S2)))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo51607b(s17 s17, ad3 ad3, ad3 ad32) {
        vx2.m53591g(s17, "context");
        vx2.m53591g(ad3, "a");
        vx2.m53591g(ad32, "b");
        return mo51608c(s17, ad3, ad32);
    }

    /* renamed from: c */
    public final boolean mo51608c(s17 s17, ad3 ad3, ad3 ad32) {
        if (ad3 == ad32) {
            return true;
        }
        f36 a = s17.mo50568a(ad3);
        f36 a2 = s17.mo50568a(ad32);
        if (a != null && a2 != null) {
            return mo51606a(s17, a, a2);
        }
        l42 t0 = s17.mo51105t0(ad3);
        l42 t02 = s17.mo51105t0(ad32);
        if (t0 == null || t02 == null) {
            return false;
        }
        if (!mo51606a(s17, s17.mo50571d(t0), s17.mo50571d(t02)) || !mo51606a(s17, s17.mo50574g(t0), s17.mo50574g(t02))) {
            return false;
        }
        return true;
    }
}
