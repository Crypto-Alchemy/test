package p000;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* renamed from: ph5 */
/* compiled from: RootDrawable */
public class ph5 extends h82 implements jf7 {

    /* renamed from: k */
    public Drawable f16490k = null;

    /* renamed from: r */
    public kf7 f16491r;

    public ph5(Drawable drawable) {
        super(drawable);
    }

    @SuppressLint({"WrongCall"})
    public void draw(Canvas canvas) {
        if (isVisible()) {
            kf7 kf7 = this.f16491r;
            if (kf7 != null) {
                kf7.onDraw();
            }
            super.draw(canvas);
            Drawable drawable = this.f16490k;
            if (drawable != null) {
                drawable.setBounds(getBounds());
                this.f16490k.draw(canvas);
            }
        }
    }

    public int getIntrinsicHeight() {
        return -1;
    }

    public int getIntrinsicWidth() {
        return -1;
    }

    /* renamed from: k */
    public void mo21823k(kf7 kf7) {
        this.f16491r = kf7;
    }

    /* renamed from: p */
    public void mo24603p(Drawable drawable) {
        this.f16490k = drawable;
        invalidateSelf();
    }

    public boolean setVisible(boolean z, boolean z2) {
        kf7 kf7 = this.f16491r;
        if (kf7 != null) {
            kf7.mo12077a(z);
        }
        return super.setVisible(z, z2);
    }
}
