package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.p011rd.animation.type.AnimationType;

/* renamed from: xz */
/* compiled from: BasicDrawer */
public class C6712xz extends C6427qy {

    /* renamed from: c */
    public Paint f35736c;

    public C6712xz(Paint paint, zt2 zt2) {
        super(paint, zt2);
        Paint paint2 = new Paint();
        this.f35736c = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f35736c.setAntiAlias(true);
        this.f35736c.setStrokeWidth((float) zt2.mo49963s());
    }

    /* renamed from: a */
    public void mo49573a(Canvas canvas, int i, boolean z, int i2, int i3) {
        Paint paint;
        float m = (float) this.f33298b.mo49957m();
        int s = this.f33298b.mo49963s();
        float o = this.f33298b.mo49959o();
        int p = this.f33298b.mo49960p();
        int t = this.f33298b.mo49964t();
        int q = this.f33298b.mo49961q();
        AnimationType b = this.f33298b.mo49946b();
        if ((b == AnimationType.SCALE && !z) || (b == AnimationType.SCALE_DOWN && z)) {
            m *= o;
        }
        if (i != q) {
            p = t;
        }
        if (b != AnimationType.FILL || i == q) {
            paint = this.f33297a;
        } else {
            paint = this.f35736c;
            paint.setStrokeWidth((float) s);
        }
        paint.setColor(p);
        canvas.drawCircle((float) i2, (float) i3, m, paint);
    }
}
