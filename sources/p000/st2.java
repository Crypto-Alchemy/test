package p000;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import p000.C5943hz;

/* renamed from: st2 */
/* compiled from: IndeterminateDrawable */
public final class st2<S extends C5943hz> extends wj1 {

    /* renamed from: M */
    public fk1<S> f34001M;

    /* renamed from: P */
    public rt2<ObjectAnimator> f34002P;

    public st2(Context context, C5943hz hzVar, fk1<S> fk1, rt2<ObjectAnimator> rt2) {
        super(context, hzVar);
        mo47866x(fk1);
        mo47865w(rt2);
    }

    /* renamed from: s */
    public static st2<CircularProgressIndicatorSpec> m51904s(Context context, CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        return new st2<>(context, circularProgressIndicatorSpec, new ze0(circularProgressIndicatorSpec), new af0(circularProgressIndicatorSpec));
    }

    /* renamed from: t */
    public static st2<LinearProgressIndicatorSpec> m51905t(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        rt2 rt2;
        lh3 lh3 = new lh3(linearProgressIndicatorSpec);
        if (linearProgressIndicatorSpec.f24188g == 0) {
            rt2 = new mh3(linearProgressIndicatorSpec);
        } else {
            rt2 = new nh3(context, linearProgressIndicatorSpec);
        }
        return new st2<>(context, linearProgressIndicatorSpec, lh3, rt2);
    }

    public void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.f34001M.mo42609g(canvas, mo49205g());
            this.f34001M.mo42605c(canvas, this.f35350H);
            int i = 0;
            while (true) {
                rt2<ObjectAnimator> rt2 = this.f34002P;
                int[] iArr = rt2.f33578c;
                if (i < iArr.length) {
                    fk1<S> fk1 = this.f34001M;
                    Paint paint = this.f35350H;
                    float[] fArr = rt2.f33577b;
                    int i2 = i * 2;
                    fk1.mo42604b(canvas, paint, fArr[i2], fArr[i2 + 1], iArr[i]);
                    i++;
                } else {
                    canvas.restore();
                    return;
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public int getIntrinsicHeight() {
        return this.f34001M.mo42606d();
    }

    public int getIntrinsicWidth() {
        return this.f34001M.mo42607e();
    }

    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    /* renamed from: h */
    public /* bridge */ /* synthetic */ boolean mo42564h() {
        return super.mo42564h();
    }

    /* renamed from: i */
    public /* bridge */ /* synthetic */ boolean mo42565i() {
        return super.mo42565i();
    }

    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    /* renamed from: j */
    public /* bridge */ /* synthetic */ boolean mo42567j() {
        return super.mo42567j();
    }

    /* renamed from: l */
    public /* bridge */ /* synthetic */ void mo42569l(C3681yj yjVar) {
        super.mo42569l(yjVar);
    }

    /* renamed from: p */
    public /* bridge */ /* synthetic */ boolean mo42571p(boolean z, boolean z2, boolean z3) {
        return super.mo42571p(z, z2, z3);
    }

    /* renamed from: q */
    public boolean mo42572q(boolean z, boolean z2, boolean z3) {
        boolean q = super.mo42572q(z, z2, z3);
        if (!isRunning()) {
            this.f34002P.mo28932a();
        }
        this.f35354e.mo42905a(this.f35352a.getContentResolver());
        if (z && z3) {
            this.f34002P.mo28936g();
        }
        return q;
    }

    /* renamed from: r */
    public /* bridge */ /* synthetic */ boolean mo42573r(C3681yj yjVar) {
        return super.mo42573r(yjVar);
    }

    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2);
    }

    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    /* renamed from: u */
    public rt2<ObjectAnimator> mo47863u() {
        return this.f34002P;
    }

    /* renamed from: v */
    public fk1<S> mo47864v() {
        return this.f34001M;
    }

    /* renamed from: w */
    public void mo47865w(rt2<ObjectAnimator> rt2) {
        this.f34002P = rt2;
        rt2.mo47485e(this);
    }

    /* renamed from: x */
    public void mo47866x(fk1<S> fk1) {
        this.f34001M = fk1;
        fk1.mo42608f(this);
    }
}
