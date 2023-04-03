package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import p000.C5943hz;

/* renamed from: fk1 */
/* compiled from: DrawingDelegate */
public abstract class fk1<S extends C5943hz> {

    /* renamed from: a */
    public S f28889a;

    /* renamed from: b */
    public wj1 f28890b;

    public fk1(S s) {
        this.f28889a = s;
    }

    /* renamed from: a */
    public abstract void mo42603a(Canvas canvas, float f);

    /* renamed from: b */
    public abstract void mo42604b(Canvas canvas, Paint paint, float f, float f2, int i);

    /* renamed from: c */
    public abstract void mo42605c(Canvas canvas, Paint paint);

    /* renamed from: d */
    public abstract int mo42606d();

    /* renamed from: e */
    public abstract int mo42607e();

    /* renamed from: f */
    public void mo42608f(wj1 wj1) {
        this.f28890b = wj1;
    }

    /* renamed from: g */
    public void mo42609g(Canvas canvas, float f) {
        this.f28889a.mo33320e();
        mo42603a(canvas, f);
    }
}
