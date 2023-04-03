package zendesk.belvedere;

import android.view.View;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;
import zendesk.belvedere.BelvedereUi;
import zendesk.belvedere.C9807c;
import zendesk.belvedere.C9810d;

/* renamed from: zendesk.belvedere.g */
/* compiled from: ImageStreamPresenter */
public class C9821g {

    /* renamed from: a */
    public final tr2 f46728a;

    /* renamed from: b */
    public final C9820f f46729b;

    /* renamed from: c */
    public final C9802b f46730c;

    /* renamed from: d */
    public final C9807c.C9809b f46731d = new C9824c();

    /* renamed from: zendesk.belvedere.g$a */
    /* compiled from: ImageStreamPresenter */
    public class C9822a implements View.OnClickListener {
        public C9822a() {
        }

        public void onClick(View view) {
            C9821g.this.f46729b.mo73776h(C9821g.this.f46728a.mo67446a(), C9821g.this.f46730c);
        }
    }

    /* renamed from: zendesk.belvedere.g$b */
    /* compiled from: ImageStreamPresenter */
    public class C9823b implements View.OnClickListener {
        public C9823b() {
        }

        public void onClick(View view) {
            C9821g.this.f46729b.mo73776h(C9821g.this.f46728a.mo67457l(), C9821g.this.f46730c);
        }
    }

    /* renamed from: zendesk.belvedere.g$c */
    /* compiled from: ImageStreamPresenter */
    public class C9824c implements C9807c.C9809b {
        public C9824c() {
        }

        /* renamed from: a */
        public boolean mo73757a(C9810d.C9812b bVar) {
            MediaResult d = bVar.mo73763d();
            long b = C9821g.this.f46728a.mo67447b();
            if ((d == null || d.mo73703l() > b) && b != -1) {
                C9821g.this.f46729b.mo73773e(q45.belvedere_image_stream_file_too_large);
                return false;
            }
            bVar.mo73765f(!bVar.mo73764e());
            List d2 = C9821g.this.mo73784k(d, bVar.mo73764e());
            C9821g.this.f46729b.mo73777i(d2.size());
            C9821g.this.f46729b.mo73769a(d2.size());
            ArrayList arrayList = new ArrayList();
            arrayList.add(d);
            if (bVar.mo73764e()) {
                C9821g.this.f46730c.mo73739q(arrayList);
                return true;
            }
            C9821g.this.f46730c.mo73738p(arrayList);
            return true;
        }

        /* renamed from: b */
        public void mo73758b() {
            if (C9821g.this.f46728a.mo67449d()) {
                C9821g.this.f46729b.mo73776h(C9821g.this.f46728a.mo67453h(), C9821g.this.f46730c);
            }
        }
    }

    public C9821g(tr2 tr2, C9820f fVar, C9802b bVar) {
        this.f46728a = tr2;
        this.f46729b = fVar;
        this.f46730c = bVar;
    }

    /* renamed from: e */
    public void mo73778e() {
        this.f46730c.mo73743u((C9825h) null, (BelvedereUi.UiConfig) null);
        this.f46730c.mo73741s(0, 0, Utils.FLOAT_EPSILON);
        this.f46730c.mo73737o();
    }

    /* renamed from: f */
    public void mo73779f() {
        mo73782i();
        mo73780g();
        this.f46729b.mo73777i(this.f46728a.mo67451f().size());
        this.f46729b.mo73769a(this.f46728a.mo67451f().size());
    }

    /* renamed from: g */
    public final void mo73780g() {
        if (this.f46728a.mo67455j()) {
            this.f46729b.mo73772d(new C9822a());
        }
        if (this.f46728a.mo67448c()) {
            this.f46729b.mo73771c(new C9823b());
        }
    }

    /* renamed from: h */
    public void mo73781h(int i, int i2, float f) {
        if (f >= Utils.FLOAT_EPSILON) {
            this.f46730c.mo73741s(i, i2, f);
        }
    }

    /* renamed from: i */
    public final void mo73782i() {
        boolean z;
        if (this.f46728a.mo67452g() || this.f46729b.mo73774f()) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        this.f46729b.mo73775g(z2);
        this.f46729b.mo73770b(this.f46728a.mo67456k(), this.f46728a.mo67451f(), z2, this.f46728a.mo67449d(), this.f46731d);
        this.f46730c.mo73742t();
    }

    /* renamed from: j */
    public void mo73783j() {
        this.f46730c.mo73740r(this.f46728a.mo67451f());
    }

    /* renamed from: k */
    public final List<MediaResult> mo73784k(MediaResult mediaResult, boolean z) {
        if (z) {
            return this.f46728a.mo67454i(mediaResult);
        }
        return this.f46728a.mo67450e(mediaResult);
    }
}
