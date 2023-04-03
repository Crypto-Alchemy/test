package com.google.android.material.circularreveal;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.circularreveal.C4247c;

/* renamed from: com.google.android.material.circularreveal.b */
/* compiled from: CircularRevealHelper */
public class C4245b {

    /* renamed from: j */
    public static final int f23691j = 2;

    /* renamed from: a */
    public final C4246a f23692a;

    /* renamed from: b */
    public final View f23693b;

    /* renamed from: c */
    public final Path f23694c = new Path();

    /* renamed from: d */
    public final Paint f23695d = new Paint(7);

    /* renamed from: e */
    public final Paint f23696e;

    /* renamed from: f */
    public C4247c.C4252e f23697f;

    /* renamed from: g */
    public Drawable f23698g;

    /* renamed from: h */
    public boolean f23699h;

    /* renamed from: i */
    public boolean f23700i;

    /* renamed from: com.google.android.material.circularreveal.b$a */
    /* compiled from: CircularRevealHelper */
    public interface C4246a {
        /* renamed from: c */
        void mo32427c(Canvas canvas);

        /* renamed from: d */
        boolean mo32428d();
    }

    public C4245b(C4246a aVar) {
        this.f23692a = aVar;
        View view = (View) aVar;
        this.f23693b = view;
        view.setWillNotDraw(false);
        Paint paint = new Paint(1);
        this.f23696e = paint;
        paint.setColor(0);
    }

    /* renamed from: a */
    public void mo32448a() {
        if (f23691j == 0) {
            this.f23699h = true;
            this.f23700i = false;
            this.f23693b.buildDrawingCache();
            Bitmap drawingCache = this.f23693b.getDrawingCache();
            if (!(drawingCache != null || this.f23693b.getWidth() == 0 || this.f23693b.getHeight() == 0)) {
                drawingCache = Bitmap.createBitmap(this.f23693b.getWidth(), this.f23693b.getHeight(), Bitmap.Config.ARGB_8888);
                this.f23693b.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                Paint paint = this.f23695d;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(drawingCache, tileMode, tileMode));
            }
            this.f23699h = false;
            this.f23700i = true;
        }
    }

    /* renamed from: b */
    public void mo32449b() {
        if (f23691j == 0) {
            this.f23700i = false;
            this.f23693b.destroyDrawingCache();
            this.f23695d.setShader((Shader) null);
            this.f23693b.invalidate();
        }
    }

    /* renamed from: c */
    public void mo32450c(Canvas canvas) {
        if (mo32461n()) {
            int i = f23691j;
            if (i == 0) {
                C4247c.C4252e eVar = this.f23697f;
                canvas.drawCircle(eVar.f23705a, eVar.f23706b, eVar.f23707c, this.f23695d);
                if (mo32463p()) {
                    C4247c.C4252e eVar2 = this.f23697f;
                    canvas.drawCircle(eVar2.f23705a, eVar2.f23706b, eVar2.f23707c, this.f23696e);
                }
            } else if (i == 1) {
                int save = canvas.save();
                canvas.clipPath(this.f23694c);
                this.f23692a.mo32427c(canvas);
                if (mo32463p()) {
                    canvas.drawRect(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) this.f23693b.getWidth(), (float) this.f23693b.getHeight(), this.f23696e);
                }
                canvas.restoreToCount(save);
            } else if (i == 2) {
                this.f23692a.mo32427c(canvas);
                if (mo32463p()) {
                    canvas.drawRect(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) this.f23693b.getWidth(), (float) this.f23693b.getHeight(), this.f23696e);
                }
            } else {
                throw new IllegalStateException("Unsupported strategy " + i);
            }
        } else {
            this.f23692a.mo32427c(canvas);
            if (mo32463p()) {
                canvas.drawRect(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) this.f23693b.getWidth(), (float) this.f23693b.getHeight(), this.f23696e);
            }
        }
        mo32451d(canvas);
    }

    /* renamed from: d */
    public final void mo32451d(Canvas canvas) {
        if (mo32462o()) {
            Rect bounds = this.f23698g.getBounds();
            float width = this.f23697f.f23705a - (((float) bounds.width()) / 2.0f);
            float height = this.f23697f.f23706b - (((float) bounds.height()) / 2.0f);
            canvas.translate(width, height);
            this.f23698g.draw(canvas);
            canvas.translate(-width, -height);
        }
    }

    /* renamed from: e */
    public Drawable mo32452e() {
        return this.f23698g;
    }

    /* renamed from: f */
    public int mo32453f() {
        return this.f23696e.getColor();
    }

    /* renamed from: g */
    public final float mo32454g(C4247c.C4252e eVar) {
        return dp3.m43581b(eVar.f23705a, eVar.f23706b, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) this.f23693b.getWidth(), (float) this.f23693b.getHeight());
    }

    /* renamed from: h */
    public C4247c.C4252e mo32455h() {
        C4247c.C4252e eVar = this.f23697f;
        if (eVar == null) {
            return null;
        }
        C4247c.C4252e eVar2 = new C4247c.C4252e(eVar);
        if (eVar2.mo32474a()) {
            eVar2.f23707c = mo32454g(eVar2);
        }
        return eVar2;
    }

    /* renamed from: i */
    public final void mo32456i() {
        if (f23691j == 1) {
            this.f23694c.rewind();
            C4247c.C4252e eVar = this.f23697f;
            if (eVar != null) {
                this.f23694c.addCircle(eVar.f23705a, eVar.f23706b, eVar.f23707c, Path.Direction.CW);
            }
        }
        this.f23693b.invalidate();
    }

    /* renamed from: j */
    public boolean mo32457j() {
        if (!this.f23692a.mo32428d() || mo32461n()) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public void mo32458k(Drawable drawable) {
        this.f23698g = drawable;
        this.f23693b.invalidate();
    }

    /* renamed from: l */
    public void mo32459l(int i) {
        this.f23696e.setColor(i);
        this.f23693b.invalidate();
    }

    /* renamed from: m */
    public void mo32460m(C4247c.C4252e eVar) {
        if (eVar == null) {
            this.f23697f = null;
        } else {
            C4247c.C4252e eVar2 = this.f23697f;
            if (eVar2 == null) {
                this.f23697f = new C4247c.C4252e(eVar);
            } else {
                eVar2.mo32476c(eVar);
            }
            if (dp3.m43582c(eVar.f23707c, mo32454g(eVar), 1.0E-4f)) {
                this.f23697f.f23707c = Float.MAX_VALUE;
            }
        }
        mo32456i();
    }

    /* renamed from: n */
    public final boolean mo32461n() {
        boolean z;
        C4247c.C4252e eVar = this.f23697f;
        if (eVar == null || eVar.mo32474a()) {
            z = true;
        } else {
            z = false;
        }
        if (f23691j != 0) {
            return !z;
        }
        if (z || !this.f23700i) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public final boolean mo32462o() {
        if (this.f23699h || this.f23698g == null || this.f23697f == null) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public final boolean mo32463p() {
        if (this.f23699h || Color.alpha(this.f23696e.getColor()) == 0) {
            return false;
        }
        return true;
    }
}
