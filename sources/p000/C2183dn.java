package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: dn */
/* compiled from: AppCompatImageHelper */
public class C2183dn {

    /* renamed from: a */
    public final ImageView f10792a;

    /* renamed from: b */
    public wq6 f10793b;

    /* renamed from: c */
    public wq6 f10794c;

    /* renamed from: d */
    public wq6 f10795d;

    /* renamed from: e */
    public int f10796e = 0;

    public C2183dn(ImageView imageView) {
        this.f10792a = imageView;
    }

    /* renamed from: a */
    public final boolean mo18851a(Drawable drawable) {
        if (this.f10795d == null) {
            this.f10795d = new wq6();
        }
        wq6 wq6 = this.f10795d;
        wq6.mo27593a();
        ColorStateList a = cs2.m14478a(this.f10792a);
        if (a != null) {
            wq6.f19223d = true;
            wq6.f19220a = a;
        }
        PorterDuff.Mode b = cs2.m14479b(this.f10792a);
        if (b != null) {
            wq6.f19222c = true;
            wq6.f19221b = b;
        }
        if (!wq6.f19223d && !wq6.f19222c) {
            return false;
        }
        C3743zm.m31371i(drawable, wq6, this.f10792a.getDrawableState());
        return true;
    }

    /* renamed from: b */
    public void mo18852b() {
        if (this.f10792a.getDrawable() != null) {
            this.f10792a.getDrawable().setLevel(this.f10796e);
        }
    }

    /* renamed from: c */
    public void mo18853c() {
        Drawable drawable = this.f10792a.getDrawable();
        if (drawable != null) {
            sj1.m26920b(drawable);
        }
        if (drawable == null) {
            return;
        }
        if (!mo18862l() || !mo18851a(drawable)) {
            wq6 wq6 = this.f10794c;
            if (wq6 != null) {
                C3743zm.m31371i(drawable, wq6, this.f10792a.getDrawableState());
                return;
            }
            wq6 wq62 = this.f10793b;
            if (wq62 != null) {
                C3743zm.m31371i(drawable, wq62, this.f10792a.getDrawableState());
            }
        }
    }

    /* renamed from: d */
    public ColorStateList mo18854d() {
        wq6 wq6 = this.f10794c;
        if (wq6 != null) {
            return wq6.f19220a;
        }
        return null;
    }

    /* renamed from: e */
    public PorterDuff.Mode mo18855e() {
        wq6 wq6 = this.f10794c;
        if (wq6 != null) {
            return wq6.f19221b;
        }
        return null;
    }

    /* renamed from: f */
    public boolean mo18856f() {
        if (this.f10792a.getBackground() instanceof RippleDrawable) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public void mo18857g(AttributeSet attributeSet, int i) {
        int n;
        Context context = this.f10792a.getContext();
        int[] iArr = j65.AppCompatImageView;
        yq6 v = yq6.m30733v(context, attributeSet, iArr, i, 0);
        ImageView imageView = this.f10792a;
        ga7.m17781n0(imageView, imageView.getContext(), iArr, attributeSet, v.mo28192r(), i, 0);
        try {
            Drawable drawable = this.f10792a.getDrawable();
            if (!(drawable != null || (n = v.mo28188n(j65.AppCompatImageView_srcCompat, -1)) == -1 || (drawable = C2554in.m19714b(this.f10792a.getContext(), n)) == null)) {
                this.f10792a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                sj1.m26920b(drawable);
            }
            int i2 = j65.AppCompatImageView_tint;
            if (v.mo28193s(i2)) {
                cs2.m14480c(this.f10792a, v.mo28177c(i2));
            }
            int i3 = j65.AppCompatImageView_tintMode;
            if (v.mo28193s(i3)) {
                cs2.m14481d(this.f10792a, sj1.m26923e(v.mo28185k(i3, -1), (PorterDuff.Mode) null));
            }
        } finally {
            v.mo28194w();
        }
    }

    /* renamed from: h */
    public void mo18858h(Drawable drawable) {
        this.f10796e = drawable.getLevel();
    }

    /* renamed from: i */
    public void mo18859i(int i) {
        if (i != 0) {
            Drawable b = C2554in.m19714b(this.f10792a.getContext(), i);
            if (b != null) {
                sj1.m26920b(b);
            }
            this.f10792a.setImageDrawable(b);
        } else {
            this.f10792a.setImageDrawable((Drawable) null);
        }
        mo18853c();
    }

    /* renamed from: j */
    public void mo18860j(ColorStateList colorStateList) {
        if (this.f10794c == null) {
            this.f10794c = new wq6();
        }
        wq6 wq6 = this.f10794c;
        wq6.f19220a = colorStateList;
        wq6.f19223d = true;
        mo18853c();
    }

    /* renamed from: k */
    public void mo18861k(PorterDuff.Mode mode) {
        if (this.f10794c == null) {
            this.f10794c = new wq6();
        }
        wq6 wq6 = this.f10794c;
        wq6.f19221b = mode;
        wq6.f19222c = true;
        mo18853c();
    }

    /* renamed from: l */
    public final boolean mo18862l() {
        if (this.f10793b != null) {
            return true;
        }
        return false;
    }
}
