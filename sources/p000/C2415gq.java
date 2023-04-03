package p000;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: gq */
/* compiled from: ArrayDrawable */
public class C2415gq extends Drawable implements Drawable.Callback, hw6, gw6 {

    /* renamed from: a */
    public hw6 f12543a;

    /* renamed from: d */
    public final oj1 f12544d = new oj1();

    /* renamed from: e */
    public final Drawable[] f12545e;

    /* renamed from: g */
    public final nj1[] f12546g;

    /* renamed from: k */
    public final Rect f12547k = new Rect();

    /* renamed from: r */
    public boolean f12548r;

    /* renamed from: s */
    public boolean f12549s;

    /* renamed from: x */
    public boolean f12550x;

    /* renamed from: gq$a */
    /* compiled from: ArrayDrawable */
    public class C2416a implements nj1 {

        /* renamed from: a */
        public final /* synthetic */ int f12551a;

        public C2416a(int i) {
            this.f12551a = i;
        }

        /* renamed from: d */
        public Drawable mo20786d(Drawable drawable) {
            return C2415gq.this.mo20766g(this.f12551a, drawable);
        }

        /* renamed from: j */
        public Drawable mo20787j() {
            return C2415gq.this.mo20762b(this.f12551a);
        }
    }

    public C2415gq(Drawable[] drawableArr) {
        int i = 0;
        this.f12548r = false;
        this.f12549s = false;
        this.f12550x = false;
        au4.m10792g(drawableArr);
        this.f12545e = drawableArr;
        while (true) {
            Drawable[] drawableArr2 = this.f12545e;
            if (i < drawableArr2.length) {
                uj1.m28304d(drawableArr2[i], this, this);
                i++;
            } else {
                this.f12546g = new nj1[drawableArr2.length];
                return;
            }
        }
    }

    /* renamed from: a */
    public final nj1 mo20761a(int i) {
        return new C2416a(i);
    }

    /* renamed from: b */
    public Drawable mo20762b(int i) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        au4.m10787b(Boolean.valueOf(z));
        if (i >= this.f12545e.length) {
            z2 = false;
        }
        au4.m10787b(Boolean.valueOf(z2));
        return this.f12545e[i];
    }

    /* renamed from: c */
    public void mo11676c(Matrix matrix) {
        hw6 hw6 = this.f12543a;
        if (hw6 != null) {
            hw6.mo11676c(matrix);
        } else {
            matrix.reset();
        }
    }

    /* renamed from: d */
    public nj1 mo20763d(int i) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        au4.m10787b(Boolean.valueOf(z));
        if (i >= this.f12546g.length) {
            z2 = false;
        }
        au4.m10787b(Boolean.valueOf(z2));
        nj1[] nj1Arr = this.f12546g;
        if (nj1Arr[i] == null) {
            nj1Arr[i] = mo20761a(i);
        }
        return this.f12546g[i];
    }

    public void draw(Canvas canvas) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f12545e;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    public int mo20765e() {
        return this.f12545e.length;
    }

    /* renamed from: f */
    public void mo20589f(hw6 hw6) {
        this.f12543a = hw6;
    }

    /* renamed from: g */
    public Drawable mo20766g(int i, Drawable drawable) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        au4.m10787b(Boolean.valueOf(z));
        if (i >= this.f12545e.length) {
            z2 = false;
        }
        au4.m10787b(Boolean.valueOf(z2));
        Drawable drawable2 = this.f12545e[i];
        if (drawable != drawable2) {
            if (drawable != null && this.f12550x) {
                drawable.mutate();
            }
            uj1.m28304d(this.f12545e[i], (Drawable.Callback) null, (hw6) null);
            uj1.m28304d(drawable, (Drawable.Callback) null, (hw6) null);
            uj1.m28305e(drawable, this.f12544d);
            uj1.m28301a(drawable, this);
            uj1.m28304d(drawable, this, this);
            this.f12549s = false;
            this.f12545e[i] = drawable;
            invalidateSelf();
        }
        return drawable2;
    }

    public int getIntrinsicHeight() {
        int i = 0;
        int i2 = -1;
        while (true) {
            Drawable[] drawableArr = this.f12545e;
            if (i >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                i2 = Math.max(i2, drawable.getIntrinsicHeight());
            }
            i++;
        }
        if (i2 > 0) {
            return i2;
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        int i = 0;
        int i2 = -1;
        while (true) {
            Drawable[] drawableArr = this.f12545e;
            if (i >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                i2 = Math.max(i2, drawable.getIntrinsicWidth());
            }
            i++;
        }
        if (i2 > 0) {
            return i2;
        }
        return -1;
    }

    public int getOpacity() {
        if (this.f12545e.length == 0) {
            return -2;
        }
        int i = -1;
        int i2 = 1;
        while (true) {
            Drawable[] drawableArr = this.f12545e;
            if (i2 >= drawableArr.length) {
                return i;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                i = Drawable.resolveOpacity(i, drawable.getOpacity());
            }
            i2++;
        }
    }

    public boolean getPadding(Rect rect) {
        int i = 0;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        Rect rect2 = this.f12547k;
        while (true) {
            Drawable[] drawableArr = this.f12545e;
            if (i >= drawableArr.length) {
                return true;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.getPadding(rect2);
                rect.left = Math.max(rect.left, rect2.left);
                rect.top = Math.max(rect.top, rect2.top);
                rect.right = Math.max(rect.right, rect2.right);
                rect.bottom = Math.max(rect.bottom, rect2.bottom);
            }
            i++;
        }
    }

    /* renamed from: i */
    public void mo20771i(RectF rectF) {
        hw6 hw6 = this.f12543a;
        if (hw6 != null) {
            hw6.mo20771i(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isStateful() {
        if (!this.f12549s) {
            this.f12548r = false;
            int i = 0;
            while (true) {
                Drawable[] drawableArr = this.f12545e;
                boolean z = true;
                if (i >= drawableArr.length) {
                    break;
                }
                Drawable drawable = drawableArr[i];
                boolean z2 = this.f12548r;
                if (drawable == null || !drawable.isStateful()) {
                    z = false;
                }
                this.f12548r = z2 | z;
                i++;
            }
            this.f12549s = true;
        }
        return this.f12548r;
    }

    public Drawable mutate() {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f12545e;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.mutate();
                }
                i++;
            } else {
                this.f12550x = true;
                return this;
            }
        }
    }

    public void onBoundsChange(Rect rect) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f12545e;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setBounds(rect);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public boolean onLevelChange(int i) {
        int i2 = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.f12545e;
            if (i2 >= drawableArr.length) {
                return z;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null && drawable.setLevel(i)) {
                z = true;
            }
            i2++;
        }
    }

    public boolean onStateChange(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.f12545e;
            if (i >= drawableArr.length) {
                return z;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null && drawable.setState(iArr)) {
                z = true;
            }
            i++;
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f12544d.mo23961b(i);
        int i2 = 0;
        while (true) {
            Drawable[] drawableArr = this.f12545e;
            if (i2 < drawableArr.length) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null) {
                    drawable.setAlpha(i);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f12544d.mo23962c(colorFilter);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f12545e;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setColorFilter(colorFilter);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public void setDither(boolean z) {
        this.f12544d.mo23963d(z);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f12545e;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setDither(z);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public void setFilterBitmap(boolean z) {
        this.f12544d.mo23964e(z);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f12545e;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setFilterBitmap(z);
                }
                i++;
            } else {
                return;
            }
        }
    }

    @TargetApi(21)
    public void setHotspot(float f, float f2) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f12545e;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setHotspot(f, f2);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f12545e;
            if (i >= drawableArr.length) {
                return visible;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setVisible(z, z2);
            }
            i++;
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
