package p000;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: xk0 */
/* compiled from: ColorDrawer */
public class xk0 extends C6427qy {
    public xk0(Paint paint, zt2 zt2) {
        super(paint, zt2);
    }

    /* renamed from: a */
    public void mo49499a(Canvas canvas, c87 c87, int i, int i2, int i3) {
        if (c87 instanceof wk0) {
            wk0 wk0 = (wk0) c87;
            float m = (float) this.f33298b.mo49957m();
            int p = this.f33298b.mo49960p();
            int q = this.f33298b.mo49961q();
            int r = this.f33298b.mo49962r();
            int f = this.f33298b.mo49950f();
            if (this.f33298b.mo49970z()) {
                if (i == r) {
                    p = wk0.mo49217a();
                } else if (i == q) {
                    p = wk0.mo49218b();
                }
            } else if (i == q) {
                p = wk0.mo49217a();
            } else if (i == f) {
                p = wk0.mo49218b();
            }
            this.f33297a.setColor(p);
            canvas.drawCircle((float) i2, (float) i3, m, this.f33297a);
        }
    }
}
