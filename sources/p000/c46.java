package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.p011rd.draw.data.Orientation;

/* renamed from: c46 */
/* compiled from: SlideDrawer */
public class c46 extends C6427qy {
    public c46(Paint paint, zt2 zt2) {
        super(paint, zt2);
    }

    /* renamed from: a */
    public void mo29870a(Canvas canvas, c87 c87, int i, int i2) {
        if (c87 instanceof b46) {
            int a = ((b46) c87).mo29453a();
            int t = this.f33298b.mo49964t();
            int p = this.f33298b.mo49960p();
            int m = this.f33298b.mo49957m();
            this.f33297a.setColor(t);
            float f = (float) i;
            float f2 = (float) i2;
            float f3 = (float) m;
            canvas.drawCircle(f, f2, f3, this.f33297a);
            this.f33297a.setColor(p);
            if (this.f33298b.mo49951g() == Orientation.HORIZONTAL) {
                canvas.drawCircle((float) a, f2, f3, this.f33297a);
            } else {
                canvas.drawCircle(f, (float) a, f3, this.f33297a);
            }
        }
    }
}
