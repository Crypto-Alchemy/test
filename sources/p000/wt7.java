package p000;

import android.content.Context;
import com.google.android.play.core.assetpacks.C4468a;
import com.google.android.play.core.assetpacks.C4469b;
import com.google.android.play.core.assetpacks.C4472d;
import com.google.android.play.core.assetpacks.C4477i;
import com.google.android.play.core.assetpacks.C4478j;

/* renamed from: wt7 */
public final class wt7 implements xt7<C4478j> {

    /* renamed from: a */
    public final xt7 f35429a;

    /* renamed from: b */
    public final xt7 f35430b;

    /* renamed from: c */
    public final xt7 f35431c;

    /* renamed from: d */
    public final /* synthetic */ int f35432d = 0;

    public wt7(xt7<C4477i> xt7, xt7<C4469b> xt72, xt7<C4472d> xt73) {
        this.f35429a = xt7;
        this.f35430b = xt72;
        this.f35431c = xt73;
    }

    public wt7(xt7<Context> xt7, xt7<C4468a> xt72, xt7<bu7> xt73, byte[] bArr) {
        this.f35431c = xt7;
        this.f35430b = xt72;
        this.f35429a = xt73;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo42984a() {
        if (this.f35432d != 0) {
            yw7 yw7 = (yw7) (aw7.m32274b(((kw7) this.f35431c).mo42984a()) == null ? vt7.m53503c(this.f35430b).mo47486a() : vt7.m53503c(this.f35429a).mo47486a());
            ns7.m49004k(yw7);
            return yw7;
        }
        return new C4478j((C4477i) this.f35429a.mo42984a(), (C4469b) this.f35430b.mo42984a(), (C4472d) this.f35431c.mo42984a());
    }
}
