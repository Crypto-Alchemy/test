package p000;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: l12 */
/* compiled from: FillDrawer */
public class l12 extends C6427qy {

    /* renamed from: c */
    public Paint f31147c;

    public l12(Paint paint, zt2 zt2) {
        super(paint, zt2);
        Paint paint2 = new Paint();
        this.f31147c = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f31147c.setAntiAlias(true);
    }

    /* renamed from: a */
    public void mo45326a(Canvas canvas, c87 c87, int i, int i2, int i3) {
        if (c87 instanceof k12) {
            k12 k12 = (k12) c87;
            int t = this.f33298b.mo49964t();
            float m = (float) this.f33298b.mo49957m();
            int s = this.f33298b.mo49963s();
            int q = this.f33298b.mo49961q();
            int r = this.f33298b.mo49962r();
            int f = this.f33298b.mo49950f();
            if (this.f33298b.mo49970z()) {
                if (i == r) {
                    t = k12.mo49217a();
                    m = (float) k12.mo44650e();
                    s = k12.mo44652g();
                } else if (i == q) {
                    t = k12.mo49218b();
                    m = (float) k12.mo44651f();
                    s = k12.mo44653h();
                }
            } else if (i == q) {
                t = k12.mo49217a();
                m = (float) k12.mo44650e();
                s = k12.mo44652g();
            } else if (i == f) {
                t = k12.mo49218b();
                m = (float) k12.mo44651f();
                s = k12.mo44653h();
            }
            this.f31147c.setColor(t);
            this.f31147c.setStrokeWidth((float) this.f33298b.mo49963s());
            float f2 = (float) i2;
            float f3 = (float) i3;
            canvas.drawCircle(f2, f3, (float) this.f33298b.mo49957m(), this.f31147c);
            this.f31147c.setStrokeWidth((float) s);
            canvas.drawCircle(f2, f3, m, this.f31147c);
        }
    }
}
