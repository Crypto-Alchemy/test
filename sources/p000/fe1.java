package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import p000.C5943hz;

/* renamed from: fe1 */
/* compiled from: DeterminateDrawable */
public final class fe1<S extends C5943hz> extends wj1 {

    /* renamed from: Y */
    public static final s42<fe1> f28822Y = new C5841a("indicatorLevel");

    /* renamed from: M */
    public fk1<S> f28823M;

    /* renamed from: P */
    public final i76 f28824P;

    /* renamed from: Q */
    public final h76 f28825Q;

    /* renamed from: U */
    public float f28826U;

    /* renamed from: X */
    public boolean f28827X = false;

    /* renamed from: fe1$a */
    /* compiled from: DeterminateDrawable */
    public static class C5841a extends s42<fe1> {
        public C5841a(String str) {
            super(str);
        }

        /* renamed from: c */
        public float mo22353a(fe1 fe1) {
            return fe1.mo42580x() * 10000.0f;
        }

        /* renamed from: d */
        public void mo22354b(fe1 fe1, float f) {
            fe1.mo42582z(f / 10000.0f);
        }
    }

    public fe1(Context context, C5943hz hzVar, fk1<S> fk1) {
        super(context, hzVar);
        mo42581y(fk1);
        i76 i76 = new i76();
        this.f28824P = i76;
        i76.mo21477d(1.0f);
        i76.mo21479f(50.0f);
        h76 h76 = new h76(this, f28822Y);
        this.f28825Q = h76;
        h76.mo20980p(i76);
        mo49207m(1.0f);
    }

    /* renamed from: u */
    public static fe1<CircularProgressIndicatorSpec> m44282u(Context context, CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        return new fe1<>(context, circularProgressIndicatorSpec, new ze0(circularProgressIndicatorSpec));
    }

    /* renamed from: v */
    public static fe1<LinearProgressIndicatorSpec> m44283v(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        return new fe1<>(context, linearProgressIndicatorSpec, new lh3(linearProgressIndicatorSpec));
    }

    /* renamed from: A */
    public void mo42558A(float f) {
        setLevel((int) (f * 10000.0f));
    }

    public void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.f28823M.mo42609g(canvas, mo49205g());
            this.f28823M.mo42605c(canvas, this.f35350H);
            Canvas canvas2 = canvas;
            this.f28823M.mo42604b(canvas2, this.f35350H, Utils.FLOAT_EPSILON, mo42580x(), ro3.m51195a(this.f35353d.f29760c[0], getAlpha()));
            canvas.restore();
        }
    }

    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public int getIntrinsicHeight() {
        return this.f28823M.mo42606d();
    }

    public int getIntrinsicWidth() {
        return this.f28823M.mo42607e();
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

    public void jumpToCurrentState() {
        this.f28825Q.mo22345b();
        mo42582z(((float) getLevel()) / 10000.0f);
    }

    /* renamed from: l */
    public /* bridge */ /* synthetic */ void mo42569l(C3681yj yjVar) {
        super.mo42569l(yjVar);
    }

    public boolean onLevelChange(int i) {
        if (this.f28827X) {
            this.f28825Q.mo22345b();
            mo42582z(((float) i) / 10000.0f);
            return true;
        }
        this.f28825Q.mo22351i(mo42580x() * 10000.0f);
        this.f28825Q.mo20977m((float) i);
        return true;
    }

    /* renamed from: p */
    public /* bridge */ /* synthetic */ boolean mo42571p(boolean z, boolean z2, boolean z3) {
        return super.mo42571p(z, z2, z3);
    }

    /* renamed from: q */
    public boolean mo42572q(boolean z, boolean z2, boolean z3) {
        boolean q = super.mo42572q(z, z2, z3);
        float a = this.f35354e.mo42905a(this.f35352a.getContentResolver());
        if (a == Utils.FLOAT_EPSILON) {
            this.f28827X = true;
        } else {
            this.f28827X = false;
            this.f28824P.mo21479f(50.0f / a);
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

    /* renamed from: w */
    public fk1<S> mo42579w() {
        return this.f28823M;
    }

    /* renamed from: x */
    public final float mo42580x() {
        return this.f28826U;
    }

    /* renamed from: y */
    public void mo42581y(fk1<S> fk1) {
        this.f28823M = fk1;
        fk1.mo42608f(this);
    }

    /* renamed from: z */
    public final void mo42582z(float f) {
        this.f28826U = f;
        invalidateSelf();
    }
}
