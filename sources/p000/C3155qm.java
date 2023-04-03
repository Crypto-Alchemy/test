package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: qm */
/* compiled from: AppCompatBackgroundHelper */
public class C3155qm {

    /* renamed from: a */
    public final View f16972a;

    /* renamed from: b */
    public final C3743zm f16973b;

    /* renamed from: c */
    public int f16974c = -1;

    /* renamed from: d */
    public wq6 f16975d;

    /* renamed from: e */
    public wq6 f16976e;

    /* renamed from: f */
    public wq6 f16977f;

    public C3155qm(View view) {
        this.f16972a = view;
        this.f16973b = C3743zm.m31368b();
    }

    /* renamed from: a */
    public final boolean mo25143a(Drawable drawable) {
        if (this.f16977f == null) {
            this.f16977f = new wq6();
        }
        wq6 wq6 = this.f16977f;
        wq6.mo27593a();
        ColorStateList s = ga7.m17790s(this.f16972a);
        if (s != null) {
            wq6.f19223d = true;
            wq6.f19220a = s;
        }
        PorterDuff.Mode t = ga7.m17792t(this.f16972a);
        if (t != null) {
            wq6.f19222c = true;
            wq6.f19221b = t;
        }
        if (!wq6.f19223d && !wq6.f19222c) {
            return false;
        }
        C3743zm.m31371i(drawable, wq6, this.f16972a.getDrawableState());
        return true;
    }

    /* renamed from: b */
    public void mo25144b() {
        Drawable background = this.f16972a.getBackground();
        if (background == null) {
            return;
        }
        if (!mo25153k() || !mo25143a(background)) {
            wq6 wq6 = this.f16976e;
            if (wq6 != null) {
                C3743zm.m31371i(background, wq6, this.f16972a.getDrawableState());
                return;
            }
            wq6 wq62 = this.f16975d;
            if (wq62 != null) {
                C3743zm.m31371i(background, wq62, this.f16972a.getDrawableState());
            }
        }
    }

    /* renamed from: c */
    public ColorStateList mo25145c() {
        wq6 wq6 = this.f16976e;
        if (wq6 != null) {
            return wq6.f19220a;
        }
        return null;
    }

    /* renamed from: d */
    public PorterDuff.Mode mo25146d() {
        wq6 wq6 = this.f16976e;
        if (wq6 != null) {
            return wq6.f19221b;
        }
        return null;
    }

    /* renamed from: e */
    public void mo25147e(AttributeSet attributeSet, int i) {
        Context context = this.f16972a.getContext();
        int[] iArr = j65.ViewBackgroundHelper;
        yq6 v = yq6.m30733v(context, attributeSet, iArr, i, 0);
        View view = this.f16972a;
        ga7.m17781n0(view, view.getContext(), iArr, attributeSet, v.mo28192r(), i, 0);
        try {
            int i2 = j65.ViewBackgroundHelper_android_background;
            if (v.mo28193s(i2)) {
                this.f16974c = v.mo28188n(i2, -1);
                ColorStateList f = this.f16973b.mo28529f(this.f16972a.getContext(), this.f16974c);
                if (f != null) {
                    mo25150h(f);
                }
            }
            int i3 = j65.ViewBackgroundHelper_backgroundTint;
            if (v.mo28193s(i3)) {
                ga7.m17795u0(this.f16972a, v.mo28177c(i3));
            }
            int i4 = j65.ViewBackgroundHelper_backgroundTintMode;
            if (v.mo28193s(i4)) {
                ga7.m17797v0(this.f16972a, sj1.m26923e(v.mo28185k(i4, -1), (PorterDuff.Mode) null));
            }
        } finally {
            v.mo28194w();
        }
    }

    /* renamed from: f */
    public void mo25148f(Drawable drawable) {
        this.f16974c = -1;
        mo25150h((ColorStateList) null);
        mo25144b();
    }

    /* renamed from: g */
    public void mo25149g(int i) {
        ColorStateList colorStateList;
        this.f16974c = i;
        C3743zm zmVar = this.f16973b;
        if (zmVar != null) {
            colorStateList = zmVar.mo28529f(this.f16972a.getContext(), i);
        } else {
            colorStateList = null;
        }
        mo25150h(colorStateList);
        mo25144b();
    }

    /* renamed from: h */
    public void mo25150h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f16975d == null) {
                this.f16975d = new wq6();
            }
            wq6 wq6 = this.f16975d;
            wq6.f19220a = colorStateList;
            wq6.f19223d = true;
        } else {
            this.f16975d = null;
        }
        mo25144b();
    }

    /* renamed from: i */
    public void mo25151i(ColorStateList colorStateList) {
        if (this.f16976e == null) {
            this.f16976e = new wq6();
        }
        wq6 wq6 = this.f16976e;
        wq6.f19220a = colorStateList;
        wq6.f19223d = true;
        mo25144b();
    }

    /* renamed from: j */
    public void mo25152j(PorterDuff.Mode mode) {
        if (this.f16976e == null) {
            this.f16976e = new wq6();
        }
        wq6 wq6 = this.f16976e;
        wq6.f19221b = mode;
        wq6.f19222c = true;
        mo25144b();
    }

    /* renamed from: k */
    public final boolean mo25153k() {
        if (this.f16975d != null) {
            return true;
        }
        return false;
    }
}
