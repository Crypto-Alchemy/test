package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import com.github.mikephil.charting.utils.Utils;
import java.lang.ref.WeakReference;

/* renamed from: di5 */
/* compiled from: RoundedBitmapDrawable */
public class di5 extends gi5 {

    /* renamed from: q1 */
    public final Paint f10722q1;

    /* renamed from: r1 */
    public final Paint f10723r1;

    /* renamed from: s1 */
    public final Bitmap f10724s1;

    /* renamed from: t1 */
    public WeakReference<Bitmap> f10725t1;

    public di5(Resources resources, Bitmap bitmap, Paint paint) {
        super(new BitmapDrawable(resources, bitmap));
        Paint paint2 = new Paint();
        this.f10722q1 = paint2;
        Paint paint3 = new Paint(1);
        this.f10723r1 = paint3;
        this.f10724s1 = bitmap;
        if (paint != null) {
            paint2.set(paint);
        }
        paint2.setFlags(1);
        paint3.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: d */
    public boolean mo18783d() {
        if (!super.mo18783d() || this.f10724s1 == null) {
            return false;
        }
        return true;
    }

    public void draw(Canvas canvas) {
        if (lc2.m21369d()) {
            lc2.m21366a("RoundedBitmapDrawable#draw");
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
        mo18785k();
        int save = canvas.save();
        canvas.concat(this.f12335Y);
        canvas.drawPath(this.f12344k, this.f10722q1);
        float f = this.f12343g;
        if (f > Utils.FLOAT_EPSILON) {
            this.f10723r1.setStrokeWidth(f);
            this.f10723r1.setColor(uj1.m28303c(this.f12349s, this.f10722q1.getAlpha()));
            canvas.drawPath(this.f12351x, this.f10723r1);
        }
        canvas.restoreToCount(save);
        if (lc2.m21369d()) {
            lc2.m21367b();
        }
    }

    /* renamed from: k */
    public final void mo18785k() {
        WeakReference<Bitmap> weakReference = this.f10725t1;
        if (weakReference == null || weakReference.get() != this.f10724s1) {
            this.f10725t1 = new WeakReference<>(this.f10724s1);
            Paint paint = this.f10722q1;
            Bitmap bitmap = this.f10724s1;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            this.f12348r = true;
        }
        if (this.f12348r) {
            this.f10722q1.getShader().setLocalMatrix(this.f12345k0);
            this.f12348r = false;
        }
        this.f10722q1.setFilterBitmap(mo20587c());
    }

    public void setAlpha(int i) {
        super.setAlpha(i);
        if (i != this.f10722q1.getAlpha()) {
            this.f10722q1.setAlpha(i);
            super.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f10722q1.setColorFilter(colorFilter);
    }
}
