package p000;

import android.annotation.SuppressLint;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: oj1 */
/* compiled from: DrawableProperties */
public class oj1 {

    /* renamed from: a */
    public int f15910a = -1;

    /* renamed from: b */
    public boolean f15911b = false;

    /* renamed from: c */
    public ColorFilter f15912c = null;

    /* renamed from: d */
    public int f15913d = -1;

    /* renamed from: e */
    public int f15914e = -1;

    @SuppressLint({"Range"})
    /* renamed from: a */
    public void mo23960a(Drawable drawable) {
        boolean z;
        if (drawable != null) {
            int i = this.f15910a;
            if (i != -1) {
                drawable.setAlpha(i);
            }
            if (this.f15911b) {
                drawable.setColorFilter(this.f15912c);
            }
            int i2 = this.f15913d;
            boolean z2 = true;
            if (i2 != -1) {
                if (i2 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable.setDither(z);
            }
            int i3 = this.f15914e;
            if (i3 != -1) {
                if (i3 == 0) {
                    z2 = false;
                }
                drawable.setFilterBitmap(z2);
            }
        }
    }

    /* renamed from: b */
    public void mo23961b(int i) {
        this.f15910a = i;
    }

    /* renamed from: c */
    public void mo23962c(ColorFilter colorFilter) {
        boolean z;
        this.f15912c = colorFilter;
        if (colorFilter != null) {
            z = true;
        } else {
            z = false;
        }
        this.f15911b = z;
    }

    /* renamed from: d */
    public void mo23963d(boolean z) {
        this.f15913d = z ? 1 : 0;
    }

    /* renamed from: e */
    public void mo23964e(boolean z) {
        this.f15914e = z ? 1 : 0;
    }
}
