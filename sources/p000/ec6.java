package p000;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* renamed from: ec6 */
/* compiled from: StubTypes.kt */
public final class ec6 extends C7120g7 {

    /* renamed from: r */
    public final yz6 f37503r;

    /* renamed from: s */
    public final MemberScope f37504s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ec6(n64 n64, boolean z, yz6 yz6) {
        super(n64, z);
        vx2.m53591g(n64, "originalTypeVariable");
        vx2.m53591g(yz6, "constructor");
        this.f37503r = yz6;
        this.f37504s = n64.mo51813k().mo53169i().mo51146m();
    }

    /* renamed from: H0 */
    public yz6 mo51134H0() {
        return this.f37503r;
    }

    /* renamed from: R0 */
    public C7120g7 mo51446R0(boolean z) {
        return new ec6(mo51871Q0(), z, mo51134H0());
    }

    /* renamed from: m */
    public MemberScope mo51146m() {
        return this.f37504s;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Stub (BI): ");
        sb.append(mo51871Q0());
        if (mo51135I0()) {
            str = "?";
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }
}
