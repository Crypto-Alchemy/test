package p000;

import android.content.Context;
import com.google.android.play.core.assetpacks.C4474f;
import com.google.android.play.core.assetpacks.C4475g;
import com.google.android.play.core.assetpacks.C4477i;
import com.google.android.play.core.assetpacks.C4478j;
import com.google.android.play.core.assetpacks.C4479k;
import com.google.android.play.core.assetpacks.C4480l;
import com.google.android.play.core.assetpacks.C4481m;
import com.google.android.play.core.assetpacks.C4484p;
import java.util.concurrent.Executor;

/* renamed from: ps7 */
public final class ps7 implements xt7<C4475g> {

    /* renamed from: a */
    public final xt7 f32796a;

    /* renamed from: b */
    public final xt7 f32797b;

    /* renamed from: c */
    public final xt7 f32798c;

    /* renamed from: d */
    public final xt7 f32799d;

    /* renamed from: e */
    public final xt7 f32800e;

    /* renamed from: f */
    public final xt7 f32801f;

    /* renamed from: g */
    public final xt7 f32802g;

    /* renamed from: h */
    public final xt7 f32803h;

    /* renamed from: i */
    public final /* synthetic */ int f32804i = 0;

    public ps7(xt7<C4477i> xt7, xt7<yw7> xt72, xt7<C4474f> xt73, xt7<C4484p> xt74, xt7<C4479k> xt75, xt7<C4480l> xt76, xt7<C4481m> xt77, xt7<C4478j> xt78) {
        this.f32796a = xt7;
        this.f32797b = xt72;
        this.f32798c = xt73;
        this.f32799d = xt74;
        this.f32800e = xt75;
        this.f32801f = xt76;
        this.f32802g = xt77;
        this.f32803h = xt78;
    }

    public ps7(xt7<Context> xt7, xt7<C4477i> xt72, xt7<C4475g> xt73, xt7<yw7> xt74, xt7<rs7> xt75, xt7<hs7> xt76, xt7<Executor> xt77, xt7<Executor> xt78, byte[] bArr) {
        this.f32796a = xt7;
        this.f32802g = xt72;
        this.f32803h = xt73;
        this.f32797b = xt74;
        this.f32800e = xt75;
        this.f32801f = xt76;
        this.f32798c = xt77;
        this.f32799d = xt78;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo42984a() {
        if (this.f32804i != 0) {
            Context b = ((kw7) this.f32796a).mo42984a();
            Object a = this.f32802g.mo42984a();
            Object a2 = this.f32803h.mo42984a();
            rt7 c = vt7.m53503c(this.f32797b);
            Object a3 = this.f32800e.mo42984a();
            Object a4 = this.f32801f.mo42984a();
            return new hr7(b, (C4477i) a, (C4475g) a2, c, (rs7) a3, (hs7) a4, vt7.m53503c(this.f32798c), vt7.m53503c(this.f32799d));
        }
        Object a5 = this.f32796a.mo42984a();
        return new C4475g((C4477i) a5, vt7.m53503c(this.f32797b), (C4474f) this.f32798c.mo42984a(), (C4484p) this.f32799d.mo42984a(), (C4479k) this.f32800e.mo42984a(), (C4480l) this.f32801f.mo42984a(), (C4481m) this.f32802g.mo42984a(), (C4478j) this.f32803h.mo42984a());
    }
}
