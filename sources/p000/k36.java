package p000;

import org.web3j.ens.contracts.generated.ENS;

/* renamed from: k36 */
/* compiled from: ModuleClassResolver.kt */
public final class k36 implements ix3 {

    /* renamed from: a */
    public a13 f38857a;

    /* renamed from: a */
    public if0 mo52549a(p03 p03) {
        vx2.m53591g(p03, "javaClass");
        return mo52856b().mo50040b(p03);
    }

    /* renamed from: b */
    public final a13 mo52856b() {
        a13 a13 = this.f38857a;
        if (a13 != null) {
            return a13;
        }
        vx2.m53605u(ENS.FUNC_RESOLVER);
        return null;
    }

    /* renamed from: c */
    public final void mo52857c(a13 a13) {
        vx2.m53591g(a13, "<set-?>");
        this.f38857a = a13;
    }
}
