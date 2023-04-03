package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: jn */
/* compiled from: AppCompatSeekBarHelper */
public class C2614jn extends C2307fn {

    /* renamed from: d */
    public final SeekBar f13702d;

    /* renamed from: e */
    public Drawable f13703e;

    /* renamed from: f */
    public ColorStateList f13704f = null;

    /* renamed from: g */
    public PorterDuff.Mode f13705g = null;

    /* renamed from: h */
    public boolean f13706h = false;

    /* renamed from: i */
    public boolean f13707i = false;

    public C2614jn(SeekBar seekBar) {
        super(seekBar);
        this.f13702d = seekBar;
    }

    /* renamed from: c */
    public void mo20018c(AttributeSet attributeSet, int i) {
        super.mo20018c(attributeSet, i);
        Context context = this.f13702d.getContext();
        int[] iArr = j65.AppCompatSeekBar;
        yq6 v = yq6.m30733v(context, attributeSet, iArr, i, 0);
        SeekBar seekBar = this.f13702d;
        ga7.m17781n0(seekBar, seekBar.getContext(), iArr, attributeSet, v.mo28192r(), i, 0);
        Drawable h = v.mo28182h(j65.AppCompatSeekBar_android_thumb);
        if (h != null) {
            this.f13702d.setThumb(h);
        }
        mo21973j(v.mo28181g(j65.AppCompatSeekBar_tickMark));
        int i2 = j65.AppCompatSeekBar_tickMarkTintMode;
        if (v.mo28193s(i2)) {
            this.f13705g = sj1.m26923e(v.mo28185k(i2, -1), this.f13705g);
            this.f13707i = true;
        }
        int i3 = j65.AppCompatSeekBar_tickMarkTint;
        if (v.mo28193s(i3)) {
            this.f13704f = v.mo28177c(i3);
            this.f13706h = true;
        }
        v.mo28194w();
        mo21969f();
    }

    /* renamed from: f */
    public final void mo21969f() {
        Drawable drawable = this.f13703e;
        if (drawable == null) {
            return;
        }
        if (this.f13706h || this.f13707i) {
            Drawable r = ij1.m19659r(drawable.mutate());
            this.f13703e = r;
            if (this.f13706h) {
                ij1.m19656o(r, this.f13704f);
            }
            if (this.f13707i) {
                ij1.m19657p(this.f13703e, this.f13705g);
            }
            if (this.f13703e.isStateful()) {
                this.f13703e.setState(this.f13702d.getDrawableState());
            }
        }
    }

    /* renamed from: g */
    public void mo21970g(Canvas canvas) {
        int i;
        if (this.f13703e != null) {
            int max = this.f13702d.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f13703e.getIntrinsicWidth();
                int intrinsicHeight = this.f13703e.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i = intrinsicWidth / 2;
                } else {
                    i = 1;
                }
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight / 2;
                }
                this.f13703e.setBounds(-i, -i2, i, i2);
                float width = ((float) ((this.f13702d.getWidth() - this.f13702d.getPaddingLeft()) - this.f13702d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f13702d.getPaddingLeft(), (float) (this.f13702d.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f13703e.draw(canvas);
                    canvas.translate(width, Utils.FLOAT_EPSILON);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* renamed from: h */
    public void mo21971h() {
        Drawable drawable = this.f13703e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f13702d.getDrawableState())) {
            this.f13702d.invalidateDrawable(drawable);
        }
    }

    /* renamed from: i */
    public void mo21972i() {
        Drawable drawable = this.f13703e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* renamed from: j */
    public void mo21973j(Drawable drawable) {
        Drawable drawable2 = this.f13703e;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f13703e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f13702d);
            ij1.m19654m(drawable, ga7.m17715B(this.f13702d));
            if (drawable.isStateful()) {
                drawable.setState(this.f13702d.getDrawableState());
            }
            mo21969f();
        }
        this.f13702d.invalidate();
    }
}
