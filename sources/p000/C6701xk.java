package p000;

import com.github.mikephil.charting.utils.Utils;
import com.p011rd.animation.type.DropAnimation;
import com.p011rd.draw.data.Orientation;
import p000.e87;

/* renamed from: xk */
/* compiled from: AnimationController */
public class C6701xk {

    /* renamed from: a */
    public e87 f35645a;

    /* renamed from: b */
    public e87.C5755a f35646b;

    /* renamed from: c */
    public C6678wx f35647c;

    /* renamed from: d */
    public zt2 f35648d;

    /* renamed from: e */
    public float f35649e;

    /* renamed from: f */
    public boolean f35650f;

    /* renamed from: xk$a */
    /* compiled from: AnimationController */
    public static /* synthetic */ class C6702a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35651a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.rd.animation.type.AnimationType[] r0 = com.p011rd.animation.type.AnimationType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f35651a = r0
                com.rd.animation.type.AnimationType r1 = com.p011rd.animation.type.AnimationType.NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f35651a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.rd.animation.type.AnimationType r1 = com.p011rd.animation.type.AnimationType.COLOR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f35651a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.rd.animation.type.AnimationType r1 = com.p011rd.animation.type.AnimationType.SCALE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f35651a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.rd.animation.type.AnimationType r1 = com.p011rd.animation.type.AnimationType.WORM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f35651a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.rd.animation.type.AnimationType r1 = com.p011rd.animation.type.AnimationType.FILL     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f35651a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.rd.animation.type.AnimationType r1 = com.p011rd.animation.type.AnimationType.SLIDE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f35651a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.rd.animation.type.AnimationType r1 = com.p011rd.animation.type.AnimationType.THIN_WORM     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f35651a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.rd.animation.type.AnimationType r1 = com.p011rd.animation.type.AnimationType.DROP     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f35651a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.rd.animation.type.AnimationType r1 = com.p011rd.animation.type.AnimationType.SWAP     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f35651a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.rd.animation.type.AnimationType r1 = com.p011rd.animation.type.AnimationType.SCALE_DOWN     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C6701xk.C6702a.<clinit>():void");
        }
    }

    public C6701xk(zt2 zt2, e87.C5755a aVar) {
        this.f35645a = new e87(aVar);
        this.f35646b = aVar;
        this.f35648d = zt2;
    }

    /* renamed from: a */
    public final void mo49486a() {
        switch (C6702a.f35651a[this.f35648d.mo49946b().ordinal()]) {
            case 1:
                this.f35646b.mo39246a((c87) null);
                return;
            case 2:
                mo49488c();
                return;
            case 3:
                mo49493h();
                return;
            case 4:
                mo49498m();
                return;
            case 5:
                mo49491f();
                return;
            case 6:
                mo49495j();
                return;
            case 7:
                mo49497l();
                return;
            case 8:
                mo49489d();
                return;
            case 9:
                mo49496k();
                return;
            case 10:
                mo49494i();
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    public void mo49487b() {
        this.f35650f = false;
        this.f35649e = Utils.FLOAT_EPSILON;
        mo49486a();
    }

    /* renamed from: c */
    public final void mo49488c() {
        int p = this.f35648d.mo49960p();
        int t = this.f35648d.mo49964t();
        C6678wx b = this.f35645a.mo42155a().mo48758l(t, p).mo49306b(this.f35648d.mo49944a());
        if (this.f35650f) {
            b.mo28833d(this.f35649e);
        } else {
            b.mo49308e();
        }
        this.f35647c = b;
    }

    /* renamed from: d */
    public final void mo49489d() {
        int i;
        int i2;
        if (this.f35648d.mo49970z()) {
            i = this.f35648d.mo49961q();
        } else {
            i = this.f35648d.mo49950f();
        }
        if (this.f35648d.mo49970z()) {
            i2 = this.f35648d.mo49962r();
        } else {
            i2 = this.f35648d.mo49961q();
        }
        int a = qt0.m50855a(this.f35648d, i);
        int a2 = qt0.m50855a(this.f35648d, i2);
        int l = this.f35648d.mo49956l();
        int j = this.f35648d.mo49954j();
        if (this.f35648d.mo49951g() != Orientation.HORIZONTAL) {
            l = j;
        }
        int m = this.f35648d.mo49957m();
        DropAnimation m2 = this.f35645a.mo42156b().mo39252i(this.f35648d.mo49944a()).mo39256m(a, a2, (m * 3) + l, m + l, m);
        if (this.f35650f) {
            m2.mo28833d(this.f35649e);
        } else {
            m2.mo49308e();
        }
        this.f35647c = m2;
    }

    /* renamed from: e */
    public void mo49490e() {
        C6678wx wxVar = this.f35647c;
        if (wxVar != null) {
            wxVar.mo49307c();
        }
    }

    /* renamed from: f */
    public final void mo49491f() {
        int p = this.f35648d.mo49960p();
        int t = this.f35648d.mo49964t();
        int m = this.f35648d.mo49957m();
        int s = this.f35648d.mo49963s();
        C6678wx b = this.f35645a.mo42157c().mo43993q(t, p, m, s).mo49306b(this.f35648d.mo49944a());
        if (this.f35650f) {
            b.mo28833d(this.f35649e);
        } else {
            b.mo49308e();
        }
        this.f35647c = b;
    }

    /* renamed from: g */
    public void mo49492g(float f) {
        this.f35650f = true;
        this.f35649e = f;
        mo49486a();
    }

    /* renamed from: h */
    public final void mo49493h() {
        int p = this.f35648d.mo49960p();
        int t = this.f35648d.mo49964t();
        int m = this.f35648d.mo49957m();
        float o = this.f35648d.mo49959o();
        C6678wx b = this.f35645a.mo42158d().mo46424p(t, p, m, o).mo49306b(this.f35648d.mo49944a());
        if (this.f35650f) {
            b.mo28833d(this.f35649e);
        } else {
            b.mo49308e();
        }
        this.f35647c = b;
    }

    /* renamed from: i */
    public final void mo49494i() {
        int p = this.f35648d.mo49960p();
        int t = this.f35648d.mo49964t();
        int m = this.f35648d.mo49957m();
        float o = this.f35648d.mo49959o();
        C6678wx b = this.f35645a.mo42159e().mo46424p(t, p, m, o).mo49306b(this.f35648d.mo49944a());
        if (this.f35650f) {
            b.mo28833d(this.f35649e);
        } else {
            b.mo49308e();
        }
        this.f35647c = b;
    }

    /* renamed from: j */
    public final void mo49495j() {
        int i;
        int i2;
        if (this.f35648d.mo49970z()) {
            i = this.f35648d.mo49961q();
        } else {
            i = this.f35648d.mo49950f();
        }
        if (this.f35648d.mo49970z()) {
            i2 = this.f35648d.mo49962r();
        } else {
            i2 = this.f35648d.mo49961q();
        }
        int a = qt0.m50855a(this.f35648d, i);
        int a2 = qt0.m50855a(this.f35648d, i2);
        C6678wx b = this.f35645a.mo42160f().mo28839l(a, a2).mo49306b(this.f35648d.mo49944a());
        if (this.f35650f) {
            b.mo28833d(this.f35649e);
        } else {
            b.mo49308e();
        }
        this.f35647c = b;
    }

    /* renamed from: k */
    public final void mo49496k() {
        int i;
        int i2;
        if (this.f35648d.mo49970z()) {
            i = this.f35648d.mo49961q();
        } else {
            i = this.f35648d.mo49950f();
        }
        if (this.f35648d.mo49970z()) {
            i2 = this.f35648d.mo49962r();
        } else {
            i2 = this.f35648d.mo49961q();
        }
        int a = qt0.m50855a(this.f35648d, i);
        int a2 = qt0.m50855a(this.f35648d, i2);
        C6678wx b = this.f35645a.mo42161g().mo46716l(a, a2).mo49306b(this.f35648d.mo49944a());
        if (this.f35650f) {
            b.mo28833d(this.f35649e);
        } else {
            b.mo49308e();
        }
        this.f35647c = b;
    }

    /* renamed from: l */
    public final void mo49497l() {
        int i;
        int i2;
        boolean z;
        if (this.f35648d.mo49970z()) {
            i = this.f35648d.mo49961q();
        } else {
            i = this.f35648d.mo49950f();
        }
        if (this.f35648d.mo49970z()) {
            i2 = this.f35648d.mo49962r();
        } else {
            i2 = this.f35648d.mo49961q();
        }
        int a = qt0.m50855a(this.f35648d, i);
        int a2 = qt0.m50855a(this.f35648d, i2);
        if (i2 > i) {
            z = true;
        } else {
            z = false;
        }
        int m = this.f35648d.mo49957m();
        kn7 j = this.f35645a.mo42162h().mo44853n(a, a2, m, z).mo44849j(this.f35648d.mo49944a());
        if (this.f35650f) {
            j.mo28833d(this.f35649e);
        } else {
            j.mo49308e();
        }
        this.f35647c = j;
    }

    /* renamed from: m */
    public final void mo49498m() {
        int i;
        int i2;
        boolean z;
        if (this.f35648d.mo49970z()) {
            i = this.f35648d.mo49961q();
        } else {
            i = this.f35648d.mo49950f();
        }
        if (this.f35648d.mo49970z()) {
            i2 = this.f35648d.mo49962r();
        } else {
            i2 = this.f35648d.mo49961q();
        }
        int a = qt0.m50855a(this.f35648d, i);
        int a2 = qt0.m50855a(this.f35648d, i2);
        if (i2 > i) {
            z = true;
        } else {
            z = false;
        }
        int m = this.f35648d.mo49957m();
        kn7 j = this.f35645a.mo42163i().mo44853n(a, a2, m, z).mo44849j(this.f35648d.mo49944a());
        if (this.f35650f) {
            j.mo28833d(this.f35649e);
        } else {
            j.mo49308e();
        }
        this.f35647c = j;
    }
}
