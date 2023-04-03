package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.p011rd.draw.data.Orientation;

/* renamed from: uk1 */
/* compiled from: DropDrawer */
public class uk1 extends C6427qy {
    public uk1(Paint paint, zt2 zt2) {
        super(paint, zt2);
    }

    /* renamed from: a */
    public void mo48410a(Canvas canvas, c87 c87, int i, int i2) {
        if (c87 instanceof sk1) {
            sk1 sk1 = (sk1) c87;
            int t = this.f33298b.mo49964t();
            int p = this.f33298b.mo49960p();
            this.f33297a.setColor(t);
            canvas.drawCircle((float) i, (float) i2, (float) this.f33298b.mo49957m(), this.f33297a);
            this.f33297a.setColor(p);
            if (this.f33298b.mo49951g() == Orientation.HORIZONTAL) {
                canvas.drawCircle((float) sk1.mo47806c(), (float) sk1.mo47804a(), (float) sk1.mo47805b(), this.f33297a);
            } else {
                canvas.drawCircle((float) sk1.mo47804a(), (float) sk1.mo47806c(), (float) sk1.mo47805b(), this.f33297a);
            }
        }
    }
}
