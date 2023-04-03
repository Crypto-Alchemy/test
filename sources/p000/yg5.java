package p000;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: yg5 */
/* compiled from: RippleDrawableCompat */
public class yg5 extends Drawable implements vz5 {

    /* renamed from: a */
    public C6738b f35880a;

    /* renamed from: a */
    public yg5 mutate() {
        this.f35880a = new C6738b(this.f35880a);
        return this;
    }

    public void draw(Canvas canvas) {
        C6738b bVar = this.f35880a;
        if (bVar.f35882b) {
            bVar.f35881a.draw(canvas);
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.f35880a;
    }

    public int getOpacity() {
        return this.f35880a.f35881a.getOpacity();
    }

    public boolean isStateful() {
        return true;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f35880a.f35881a.setBounds(rect);
    }

    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f35880a.f35881a.setState(iArr)) {
            onStateChange = true;
        }
        boolean e = bh5.m32534e(iArr);
        C6738b bVar = this.f35880a;
        if (bVar.f35882b == e) {
            return onStateChange;
        }
        bVar.f35882b = e;
        return true;
    }

    public void setAlpha(int i) {
        this.f35880a.f35881a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f35880a.f35881a.setColorFilter(colorFilter);
    }

    public void setShapeAppearanceModel(rz5 rz5) {
        this.f35880a.f35881a.setShapeAppearanceModel(rz5);
    }

    public void setTint(int i) {
        this.f35880a.f35881a.setTint(i);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f35880a.f35881a.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f35880a.f35881a.setTintMode(mode);
    }

    public yg5(rz5 rz5) {
        this(new C6738b(new uo3(rz5)));
    }

    /* renamed from: yg5$b */
    /* compiled from: RippleDrawableCompat */
    public static final class C6738b extends Drawable.ConstantState {

        /* renamed from: a */
        public uo3 f35881a;

        /* renamed from: b */
        public boolean f35882b;

        public C6738b(uo3 uo3) {
            this.f35881a = uo3;
            this.f35882b = false;
        }

        /* renamed from: a */
        public yg5 newDrawable() {
            return new yg5(new C6738b(this));
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public C6738b(C6738b bVar) {
            this.f35881a = (uo3) bVar.f35881a.getConstantState().newDrawable();
            this.f35882b = bVar.f35882b;
        }
    }

    public yg5(C6738b bVar) {
        this.f35880a = bVar;
    }
}
