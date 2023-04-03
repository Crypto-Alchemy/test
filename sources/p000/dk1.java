package p000;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: dk1 */
/* compiled from: Drawer */
public class dk1 {

    /* renamed from: a */
    public C6712xz f28210a;

    /* renamed from: b */
    public xk0 f28211b;

    /* renamed from: c */
    public sl5 f28212c;

    /* renamed from: d */
    public mn7 f28213d;

    /* renamed from: e */
    public c46 f28214e;

    /* renamed from: f */
    public l12 f28215f;

    /* renamed from: g */
    public bp6 f28216g;

    /* renamed from: h */
    public uk1 f28217h;

    /* renamed from: i */
    public ve6 f28218i;

    /* renamed from: j */
    public rl5 f28219j;

    /* renamed from: k */
    public int f28220k;

    /* renamed from: l */
    public int f28221l;

    /* renamed from: m */
    public int f28222m;

    public dk1(zt2 zt2) {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.f28210a = new C6712xz(paint, zt2);
        this.f28211b = new xk0(paint, zt2);
        this.f28212c = new sl5(paint, zt2);
        this.f28213d = new mn7(paint, zt2);
        this.f28214e = new c46(paint, zt2);
        this.f28215f = new l12(paint, zt2);
        this.f28216g = new bp6(paint, zt2);
        this.f28217h = new uk1(paint, zt2);
        this.f28218i = new ve6(paint, zt2);
        this.f28219j = new rl5(paint, zt2);
    }

    /* renamed from: a */
    public void mo41932a(Canvas canvas, boolean z) {
        if (this.f28211b != null) {
            this.f28210a.mo49573a(canvas, this.f28220k, z, this.f28221l, this.f28222m);
        }
    }

    /* renamed from: b */
    public void mo41933b(Canvas canvas, c87 c87) {
        xk0 xk0 = this.f28211b;
        if (xk0 != null) {
            xk0.mo49499a(canvas, c87, this.f28220k, this.f28221l, this.f28222m);
        }
    }

    /* renamed from: c */
    public void mo41934c(Canvas canvas, c87 c87) {
        uk1 uk1 = this.f28217h;
        if (uk1 != null) {
            uk1.mo48410a(canvas, c87, this.f28221l, this.f28222m);
        }
    }

    /* renamed from: d */
    public void mo41935d(Canvas canvas, c87 c87) {
        l12 l12 = this.f28215f;
        if (l12 != null) {
            l12.mo45326a(canvas, c87, this.f28220k, this.f28221l, this.f28222m);
        }
    }

    /* renamed from: e */
    public void mo41936e(Canvas canvas, c87 c87) {
        sl5 sl5 = this.f28212c;
        if (sl5 != null) {
            sl5.mo47812a(canvas, c87, this.f28220k, this.f28221l, this.f28222m);
        }
    }

    /* renamed from: f */
    public void mo41937f(Canvas canvas, c87 c87) {
        rl5 rl5 = this.f28219j;
        if (rl5 != null) {
            rl5.mo47433a(canvas, c87, this.f28220k, this.f28221l, this.f28222m);
        }
    }

    /* renamed from: g */
    public void mo41938g(Canvas canvas, c87 c87) {
        c46 c46 = this.f28214e;
        if (c46 != null) {
            c46.mo29870a(canvas, c87, this.f28221l, this.f28222m);
        }
    }

    /* renamed from: h */
    public void mo41939h(Canvas canvas, c87 c87) {
        ve6 ve6 = this.f28218i;
        if (ve6 != null) {
            ve6.mo48737a(canvas, c87, this.f28220k, this.f28221l, this.f28222m);
        }
    }

    /* renamed from: i */
    public void mo41940i(Canvas canvas, c87 c87) {
        bp6 bp6 = this.f28216g;
        if (bp6 != null) {
            bp6.mo29681a(canvas, c87, this.f28221l, this.f28222m);
        }
    }

    /* renamed from: j */
    public void mo41941j(Canvas canvas, c87 c87) {
        mn7 mn7 = this.f28213d;
        if (mn7 != null) {
            mn7.mo29681a(canvas, c87, this.f28221l, this.f28222m);
        }
    }

    /* renamed from: k */
    public void mo41942k(int i, int i2, int i3) {
        this.f28220k = i;
        this.f28221l = i2;
        this.f28222m = i3;
    }
}
