package p000;

import android.graphics.Canvas;
import android.graphics.drawable.NinePatchDrawable;

/* renamed from: hi5 */
/* compiled from: RoundedNinePatchDrawable */
public class hi5 extends gi5 {
    public hi5(NinePatchDrawable ninePatchDrawable) {
        super(ninePatchDrawable);
    }

    public void draw(Canvas canvas) {
        if (lc2.m21369d()) {
            lc2.m21366a("RoundedNinePatchDrawable#draw");
        }
        if (!mo18783d()) {
            super.draw(canvas);
            if (lc2.m21369d()) {
                lc2.m21367b();
                return;
            }
            return;
        }
        mo20596j();
        mo20595i();
        canvas.clipPath(this.f12344k);
        super.draw(canvas);
        if (lc2.m21369d()) {
            lc2.m21367b();
        }
    }
}
