package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.bumptech.glide.C1710a;
import java.nio.ByteBuffer;
import java.util.List;
import p000.pg2;

/* renamed from: jg2 */
/* compiled from: GifDrawable */
public class jg2 extends Drawable implements pg2.C3066b, Animatable {

    /* renamed from: A */
    public Rect f13599A;

    /* renamed from: B */
    public List<C3681yj> f13600B;

    /* renamed from: a */
    public final C2600a f13601a;

    /* renamed from: d */
    public boolean f13602d;

    /* renamed from: e */
    public boolean f13603e;

    /* renamed from: g */
    public boolean f13604g;

    /* renamed from: k */
    public boolean f13605k;

    /* renamed from: r */
    public int f13606r;

    /* renamed from: s */
    public int f13607s;

    /* renamed from: x */
    public boolean f13608x;

    /* renamed from: y */
    public Paint f13609y;

    /* renamed from: jg2$a */
    /* compiled from: GifDrawable */
    public static final class C2600a extends Drawable.ConstantState {

        /* renamed from: a */
        public final pg2 f13610a;

        public C2600a(pg2 pg2) {
            this.f13610a = pg2;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        public Drawable newDrawable() {
            return new jg2(this);
        }
    }

    public jg2(Context context, ig2 ig2, mw6<Bitmap> mw6, int i, int i2, Bitmap bitmap) {
        this(new C2600a(new pg2(C1710a.m12218c(context), ig2, i, i2, mw6, bitmap)));
    }

    /* renamed from: a */
    public void mo21824a() {
        if (mo21825b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (mo21831g() == mo21830f() - 1) {
            this.f13606r++;
        }
        int i = this.f13607s;
        if (i != -1 && this.f13606r >= i) {
            mo21839j();
            stop();
        }
    }

    /* renamed from: b */
    public final Drawable.Callback mo21825b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    /* renamed from: c */
    public ByteBuffer mo21826c() {
        return this.f13601a.f13610a.mo24579b();
    }

    /* renamed from: d */
    public final Rect mo21827d() {
        if (this.f13599A == null) {
            this.f13599A = new Rect();
        }
        return this.f13599A;
    }

    public void draw(Canvas canvas) {
        if (!this.f13604g) {
            if (this.f13608x) {
                Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), mo21827d());
                this.f13608x = false;
            }
            canvas.drawBitmap(this.f13601a.f13610a.mo24580c(), (Rect) null, mo21827d(), mo21836h());
        }
    }

    /* renamed from: e */
    public Bitmap mo21829e() {
        return this.f13601a.f13610a.mo24582e();
    }

    /* renamed from: f */
    public int mo21830f() {
        return this.f13601a.f13610a.mo24583f();
    }

    /* renamed from: g */
    public int mo21831g() {
        return this.f13601a.f13610a.mo24581d();
    }

    public Drawable.ConstantState getConstantState() {
        return this.f13601a;
    }

    public int getIntrinsicHeight() {
        return this.f13601a.f13610a.mo24584h();
    }

    public int getIntrinsicWidth() {
        return this.f13601a.f13610a.mo24586k();
    }

    public int getOpacity() {
        return -2;
    }

    /* renamed from: h */
    public final Paint mo21836h() {
        if (this.f13609y == null) {
            this.f13609y = new Paint(2);
        }
        return this.f13609y;
    }

    /* renamed from: i */
    public int mo21837i() {
        return this.f13601a.f13610a.mo24585j();
    }

    public boolean isRunning() {
        return this.f13602d;
    }

    /* renamed from: j */
    public final void mo21839j() {
        List<C3681yj> list = this.f13600B;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.f13600B.get(i).onAnimationEnd(this);
            }
        }
    }

    /* renamed from: k */
    public void mo21840k() {
        this.f13604g = true;
        this.f13601a.f13610a.mo24578a();
    }

    /* renamed from: l */
    public final void mo21841l() {
        this.f13606r = 0;
    }

    /* renamed from: m */
    public void mo21842m(mw6<Bitmap> mw6, Bitmap bitmap) {
        this.f13601a.f13610a.mo24590o(mw6, bitmap);
    }

    /* renamed from: n */
    public final void mo21843n() {
        zt4.m31497a(!this.f13604g, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f13601a.f13610a.mo24583f() == 1) {
            invalidateSelf();
        } else if (!this.f13602d) {
            this.f13602d = true;
            this.f13601a.f13610a.mo24593r(this);
            invalidateSelf();
        }
    }

    /* renamed from: o */
    public final void mo21844o() {
        this.f13602d = false;
        this.f13601a.f13610a.mo24594s(this);
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f13608x = true;
    }

    public void setAlpha(int i) {
        mo21836h().setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        mo21836h().setColorFilter(colorFilter);
    }

    public boolean setVisible(boolean z, boolean z2) {
        zt4.m31497a(!this.f13604g, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f13605k = z;
        if (!z) {
            mo21844o();
        } else if (this.f13603e) {
            mo21843n();
        }
        return super.setVisible(z, z2);
    }

    public void start() {
        this.f13603e = true;
        mo21841l();
        if (this.f13605k) {
            mo21843n();
        }
    }

    public void stop() {
        this.f13603e = false;
        mo21844o();
    }

    public jg2(C2600a aVar) {
        this.f13605k = true;
        this.f13607s = -1;
        this.f13601a = (C2600a) zt4.m31500d(aVar);
    }
}
