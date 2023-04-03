package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.p011rd.draw.data.Orientation;

/* renamed from: mn7 */
/* compiled from: WormDrawer */
public class mn7 extends C6427qy {

    /* renamed from: c */
    public RectF f31742c = new RectF();

    public mn7(Paint paint, zt2 zt2) {
        super(paint, zt2);
    }

    /* renamed from: a */
    public void mo29681a(Canvas canvas, c87 c87, int i, int i2) {
        if (c87 instanceof ln7) {
            ln7 ln7 = (ln7) c87;
            int b = ln7.mo45461b();
            int a = ln7.mo45460a();
            int m = this.f33298b.mo49957m();
            int t = this.f33298b.mo49964t();
            int p = this.f33298b.mo49960p();
            if (this.f33298b.mo49951g() == Orientation.HORIZONTAL) {
                RectF rectF = this.f31742c;
                rectF.left = (float) b;
                rectF.right = (float) a;
                rectF.top = (float) (i2 - m);
                rectF.bottom = (float) (i2 + m);
            } else {
                RectF rectF2 = this.f31742c;
                rectF2.left = (float) (i - m);
                rectF2.right = (float) (i + m);
                rectF2.top = (float) b;
                rectF2.bottom = (float) a;
            }
            this.f33297a.setColor(t);
            float f = (float) i;
            float f2 = (float) i2;
            float f3 = (float) m;
            canvas.drawCircle(f, f2, f3, this.f33297a);
            this.f33297a.setColor(p);
            canvas.drawRoundRect(this.f31742c, f3, f3, this.f33297a);
        }
    }
}
