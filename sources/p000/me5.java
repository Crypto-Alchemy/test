package p000;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.C1710a;
import com.bumptech.glide.Priority;
import java.io.File;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.vp0;

/* renamed from: me5 */
/* compiled from: RequestManager */
public class me5 implements ComponentCallbacks2, sg3 {

    /* renamed from: C */
    public static final qe5 f14943C = ((qe5) qe5.m25624z0(Bitmap.class).mo22570Z());

    /* renamed from: H */
    public static final qe5 f14944H = ((qe5) qe5.m25624z0(jg2.class).mo22570Z());

    /* renamed from: I */
    public static final qe5 f14945I = ((qe5) ((qe5) qe5.m25619A0(xg1.f19829c).mo22585i0(Priority.LOW)).mo22598q0(true));

    /* renamed from: A */
    public qe5 f14946A;

    /* renamed from: B */
    public boolean f14947B;

    /* renamed from: a */
    public final C1710a f14948a;

    /* renamed from: d */
    public final Context f14949d;

    /* renamed from: e */
    public final lg3 f14950e;

    /* renamed from: g */
    public final re5 f14951g;

    /* renamed from: k */
    public final pe5 f14952k;

    /* renamed from: r */
    public final rl6 f14953r;

    /* renamed from: s */
    public final Runnable f14954s;

    /* renamed from: x */
    public final vp0 f14955x;

    /* renamed from: y */
    public final CopyOnWriteArrayList<le5<Object>> f14956y;

    /* renamed from: me5$a */
    /* compiled from: RequestManager */
    public class C2823a implements Runnable {
        public C2823a() {
        }

        public void run() {
            me5 me5 = me5.this;
            me5.f14950e.mo12019a(me5);
        }
    }

    /* renamed from: me5$b */
    /* compiled from: RequestManager */
    public class C2824b implements vp0.C3503a {

        /* renamed from: a */
        public final re5 f14958a;

        public C2824b(re5 re5) {
            this.f14958a = re5;
        }

        /* renamed from: a */
        public void mo23167a(boolean z) {
            if (z) {
                synchronized (me5.this) {
                    this.f14958a.mo25365e();
                }
            }
        }
    }

    public me5(C1710a aVar, lg3 lg3, pe5 pe5, Context context) {
        this(aVar, lg3, pe5, new re5(), aVar.mo12360g(), context);
    }

    /* renamed from: A */
    public synchronized void mo23139A() {
        this.f14951g.mo25363c();
    }

    /* renamed from: B */
    public synchronized void mo23140B() {
        mo23139A();
        for (me5 A : this.f14952k.mo197a()) {
            A.mo23139A();
        }
    }

    /* renamed from: C */
    public synchronized void mo23141C() {
        this.f14951g.mo25364d();
    }

    /* renamed from: D */
    public synchronized void mo23142D() {
        this.f14951g.mo25366f();
    }

    /* renamed from: E */
    public synchronized void mo23143E(qe5 qe5) {
        this.f14946A = (qe5) ((qe5) qe5.clone()).mo22572b();
    }

    /* renamed from: F */
    public synchronized void mo23144F(pl6<?> pl6, ae5 ae5) {
        this.f14953r.mo25454l(pl6);
        this.f14951g.mo25367g(ae5);
    }

    /* renamed from: G */
    public synchronized boolean mo23145G(pl6<?> pl6) {
        ae5 g = pl6.mo21093g();
        if (g == null) {
            return true;
        }
        if (!this.f14951g.mo25361a(g)) {
            return false;
        }
        this.f14953r.mo25455o(pl6);
        pl6.mo21099j((ae5) null);
        return true;
    }

    /* renamed from: H */
    public final void mo23146H(pl6<?> pl6) {
        boolean G = mo23145G(pl6);
        ae5 g = pl6.mo21093g();
        if (!G && !this.f14948a.mo12369p(pl6) && g != null) {
            pl6.mo21099j((ae5) null);
            g.clear();
        }
    }

    /* renamed from: b */
    public synchronized void mo19468b() {
        mo23142D();
        this.f14953r.mo19468b();
    }

    /* renamed from: c */
    public synchronized void mo20968c() {
        this.f14953r.mo20968c();
        for (pl6<?> o : this.f14953r.mo25453i()) {
            mo23150o(o);
        }
        this.f14953r.mo25452d();
        this.f14951g.mo25362b();
        this.f14950e.mo12020b(this);
        this.f14950e.mo12020b(this.f14955x);
        p67.m24694v(this.f14954s);
        this.f14948a.mo12371s(this);
    }

    /* renamed from: d */
    public <ResourceType> be5<ResourceType> mo23147d(Class<ResourceType> cls) {
        return new be5<>(this.f14948a, this, cls, this.f14949d);
    }

    /* renamed from: i */
    public be5<Bitmap> mo23148i() {
        return mo23147d(Bitmap.class).mo11567a(f14943C);
    }

    /* renamed from: l */
    public be5<Drawable> mo23149l() {
        return mo23147d(Drawable.class);
    }

    /* renamed from: n */
    public synchronized void mo19473n() {
        mo23141C();
        this.f14953r.mo19473n();
    }

    /* renamed from: o */
    public void mo23150o(pl6<?> pl6) {
        if (pl6 != null) {
            mo23146H(pl6);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
    }

    public void onTrimMemory(int i) {
        if (i == 60 && this.f14947B) {
            mo23140B();
        }
    }

    /* renamed from: p */
    public be5<File> mo23154p() {
        return mo23147d(File.class).mo11567a(f14945I);
    }

    /* renamed from: q */
    public List<le5<Object>> mo23155q() {
        return this.f14956y;
    }

    /* renamed from: r */
    public synchronized qe5 mo23156r() {
        return this.f14946A;
    }

    /* renamed from: s */
    public <T> yw6<?, T> mo23157s(Class<T> cls) {
        return this.f14948a.mo12362i().mo12379e(cls);
    }

    /* renamed from: t */
    public be5<Drawable> mo23158t(Bitmap bitmap) {
        return mo23149l().mo11556N0(bitmap);
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f14951g + ", treeNode=" + this.f14952k + "}";
    }

    /* renamed from: u */
    public be5<Drawable> mo23160u(Uri uri) {
        return mo23149l().mo11557O0(uri);
    }

    /* renamed from: v */
    public be5<Drawable> mo23161v(File file) {
        return mo23149l().mo11558P0(file);
    }

    /* renamed from: w */
    public be5<Drawable> mo23162w(Integer num) {
        return mo23149l().mo11559Q0(num);
    }

    /* renamed from: x */
    public be5<Drawable> mo23163x(Object obj) {
        return mo23149l().mo11560R0(obj);
    }

    /* renamed from: y */
    public be5<Drawable> mo23164y(String str) {
        return mo23149l().mo11561S0(str);
    }

    /* renamed from: z */
    public be5<Drawable> mo23165z(byte[] bArr) {
        return mo23149l().mo11562T0(bArr);
    }

    public me5(C1710a aVar, lg3 lg3, pe5 pe5, re5 re5, wp0 wp0, Context context) {
        this.f14953r = new rl6();
        C2823a aVar2 = new C2823a();
        this.f14954s = aVar2;
        this.f14948a = aVar;
        this.f14950e = lg3;
        this.f14952k = pe5;
        this.f14951g = re5;
        this.f14949d = context;
        vp0 a = wp0.mo21473a(context.getApplicationContext(), new C2824b(re5));
        this.f14955x = a;
        if (p67.m24689q()) {
            p67.m24693u(aVar2);
        } else {
            lg3.mo12019a(this);
        }
        lg3.mo12019a(a);
        this.f14956y = new CopyOnWriteArrayList<>(aVar.mo12362i().mo12377c());
        mo23143E(aVar.mo12362i().mo12378d());
        aVar.mo12365o(this);
    }
}
