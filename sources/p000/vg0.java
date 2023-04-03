package p000;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: vg0 */
/* compiled from: ClipHelper */
public class vg0 implements xg0 {

    /* renamed from: a */
    public final View f18744a;

    /* renamed from: d */
    public boolean f18745d;

    /* renamed from: e */
    public final RectF f18746e = new RectF();

    /* renamed from: g */
    public float f18747g;

    public vg0(View view) {
        this.f18744a = view;
    }

    /* renamed from: a */
    public void mo27130a(Canvas canvas) {
        if (this.f18745d) {
            canvas.restore();
        }
    }

    /* renamed from: b */
    public void mo12292b(RectF rectF, float f) {
        if (rectF != null) {
            this.f18745d = true;
            this.f18746e.set(rectF);
            this.f18747g = f;
            this.f18744a.invalidate();
        } else if (this.f18745d) {
            this.f18745d = false;
            this.f18744a.invalidate();
        }
    }

    /* renamed from: c */
    public void mo27131c(Canvas canvas) {
        if (this.f18745d) {
            canvas.save();
            if (p86.m24755c(this.f18747g, Utils.FLOAT_EPSILON)) {
                canvas.clipRect(this.f18746e);
                return;
            }
            canvas.rotate(this.f18747g, this.f18746e.centerX(), this.f18746e.centerY());
            canvas.clipRect(this.f18746e);
            canvas.rotate(-this.f18747g, this.f18746e.centerX(), this.f18746e.centerY());
        }
    }
}
