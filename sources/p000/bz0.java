package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: bz0 */
/* compiled from: CutoutDrawable */
public class bz0 extends uo3 {

    /* renamed from: b1 */
    public final RectF f21519b1;

    /* renamed from: e1 */
    public int f21520e1;

    /* renamed from: v0 */
    public final Paint f21521v0;

    public bz0() {
        this((rz5) null);
    }

    public void draw(Canvas canvas) {
        mo29805r0(canvas);
        super.draw(canvas);
        canvas.drawRect(this.f21519b1, this.f21521v0);
        mo29804q0(canvas);
    }

    /* renamed from: p0 */
    public boolean mo29803p0() {
        return !this.f21519b1.isEmpty();
    }

    /* renamed from: q0 */
    public final void mo29804q0(Canvas canvas) {
        if (!mo29811x0(getCallback())) {
            canvas.restoreToCount(this.f21520e1);
        }
    }

    /* renamed from: r0 */
    public final void mo29805r0(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (mo29811x0(callback)) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, (Paint) null);
                return;
            }
            return;
        }
        mo29807t0(canvas);
    }

    /* renamed from: s0 */
    public void mo29806s0() {
        mo29808u0(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
    }

    /* renamed from: t0 */
    public final void mo29807t0(Canvas canvas) {
        this.f21520e1 = canvas.saveLayer(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) canvas.getWidth(), (float) canvas.getHeight(), (Paint) null);
    }

    /* renamed from: u0 */
    public void mo29808u0(float f, float f2, float f3, float f4) {
        RectF rectF = this.f21519b1;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            rectF.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    /* renamed from: v0 */
    public void mo29809v0(RectF rectF) {
        mo29808u0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* renamed from: w0 */
    public final void mo29810w0() {
        this.f21521v0.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f21521v0.setColor(-1);
        this.f21521v0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* renamed from: x0 */
    public final boolean mo29811x0(Drawable.Callback callback) {
        return callback instanceof View;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bz0(rz5 rz5) {
        super(rz5 == null ? new rz5() : rz5);
        this.f21521v0 = new Paint(1);
        mo29810w0();
        this.f21519b1 = new RectF();
    }
}
