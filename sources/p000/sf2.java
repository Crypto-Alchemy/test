package p000;

import com.google.firebase.installations.local.C4788b;

/* renamed from: sf2 */
/* compiled from: GetAuthTokenListener */
public class sf2 implements y86 {

    /* renamed from: a */
    public final p77 f33864a;

    /* renamed from: b */
    public final xl6<vv2> f33865b;

    public sf2(p77 p77, xl6<vv2> xl6) {
        this.f33864a = p77;
        this.f33865b = xl6;
    }

    /* renamed from: a */
    public boolean mo47753a(Exception exc) {
        this.f33865b.mo49506d(exc);
        return true;
    }

    /* renamed from: b */
    public boolean mo47754b(C4788b bVar) {
        if (!bVar.mo36154k() || this.f33864a.mo46661f(bVar)) {
            return false;
        }
        this.f33865b.mo49505c(vv2.m53566a().mo42072b(bVar.mo36133b()).mo42074d(bVar.mo36134c()).mo42073c(bVar.mo36140h()).mo42071a());
        return true;
    }
}
