package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: ek */
/* compiled from: AnimatedDrawableBackendImpl */
public class C2232ek implements C1637bk {

    /* renamed from: a */
    public final C2388gk f11184a;

    /* renamed from: b */
    public final C3078pk f11185b;

    /* renamed from: c */
    public final C2687kk f11186c;

    /* renamed from: d */
    public final Rect f11187d;

    /* renamed from: e */
    public final int[] f11188e;

    /* renamed from: f */
    public final int[] f11189f;

    /* renamed from: g */
    public final int f11190g;

    /* renamed from: h */
    public final AnimatedDrawableFrameInfo[] f11191h;

    /* renamed from: i */
    public final Rect f11192i = new Rect();

    /* renamed from: j */
    public final Rect f11193j = new Rect();

    /* renamed from: k */
    public final boolean f11194k;

    /* renamed from: l */
    public Bitmap f11195l;

    public C2232ek(C2388gk gkVar, C3078pk pkVar, Rect rect, boolean z) {
        this.f11184a = gkVar;
        this.f11185b = pkVar;
        C2687kk d = pkVar.mo24625d();
        this.f11186c = d;
        int[] j = d.mo13081j();
        this.f11188e = j;
        gkVar.mo20613a(j);
        this.f11190g = gkVar.mo20615c(j);
        this.f11189f = gkVar.mo20614b(j);
        this.f11187d = m16127k(d, rect);
        this.f11194k = z;
        this.f11191h = new AnimatedDrawableFrameInfo[d.mo13069a()];
        for (int i = 0; i < this.f11186c.mo13069a(); i++) {
            this.f11191h[i] = this.f11186c.mo13071c(i);
        }
    }

    /* renamed from: k */
    public static Rect m16127k(C2687kk kkVar, Rect rect) {
        if (rect == null) {
            return new Rect(0, 0, kkVar.getWidth(), kkVar.getHeight());
        }
        return new Rect(0, 0, Math.min(rect.width(), kkVar.getWidth()), Math.min(rect.height(), kkVar.getHeight()));
    }

    /* renamed from: a */
    public int mo11681a() {
        return this.f11186c.mo13069a();
    }

    /* renamed from: b */
    public int mo11682b() {
        return this.f11186c.mo13070b();
    }

    /* renamed from: c */
    public AnimatedDrawableFrameInfo mo11683c(int i) {
        return this.f11191h[i];
    }

    /* renamed from: d */
    public void mo11684d(int i, Canvas canvas) {
        C2959ok i2 = this.f11186c.mo13080i(i);
        try {
            if (i2.getWidth() > 0) {
                if (i2.getHeight() > 0) {
                    if (this.f11186c.mo13074f()) {
                        mo19269n(canvas, i2);
                    } else {
                        mo19268m(canvas, i2);
                    }
                    i2.dispose();
                }
            }
        } finally {
            i2.dispose();
        }
    }

    /* renamed from: e */
    public C1637bk mo11685e(Rect rect) {
        if (m16127k(this.f11186c, rect).equals(this.f11187d)) {
            return this;
        }
        return new C2232ek(this.f11184a, this.f11185b, rect, this.f11194k);
    }

    /* renamed from: f */
    public int mo11686f(int i) {
        return this.f11188e[i];
    }

    /* renamed from: g */
    public int mo11687g() {
        return this.f11187d.height();
    }

    public int getHeight() {
        return this.f11186c.getHeight();
    }

    public int getWidth() {
        return this.f11186c.getWidth();
    }

    /* renamed from: h */
    public int mo11690h() {
        return this.f11187d.width();
    }

    /* renamed from: i */
    public C3078pk mo11691i() {
        return this.f11185b;
    }

    /* renamed from: j */
    public final synchronized void mo19266j() {
        Bitmap bitmap = this.f11195l;
        if (bitmap != null) {
            bitmap.recycle();
            this.f11195l = null;
        }
    }

    /* renamed from: l */
    public final synchronized Bitmap mo19267l(int i, int i2) {
        Bitmap bitmap = this.f11195l;
        if (bitmap != null && (bitmap.getWidth() < i || this.f11195l.getHeight() < i2)) {
            mo19266j();
        }
        if (this.f11195l == null) {
            this.f11195l = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        }
        this.f11195l.eraseColor(0);
        return this.f11195l;
    }

    /* renamed from: m */
    public final void mo19268m(Canvas canvas, C2959ok okVar) {
        int i;
        int i2;
        int i3;
        int i4;
        if (this.f11194k) {
            float max = Math.max(((float) okVar.getWidth()) / ((float) Math.min(okVar.getWidth(), canvas.getWidth())), ((float) okVar.getHeight()) / ((float) Math.min(okVar.getHeight(), canvas.getHeight())));
            i3 = (int) (((float) okVar.getWidth()) / max);
            i2 = (int) (((float) okVar.getHeight()) / max);
            i = (int) (((float) okVar.mo13062b()) / max);
            i4 = (int) (((float) okVar.mo13063c()) / max);
        } else {
            i3 = okVar.getWidth();
            i2 = okVar.getHeight();
            i = okVar.mo13062b();
            i4 = okVar.mo13063c();
        }
        synchronized (this) {
            Bitmap l = mo19267l(i3, i2);
            this.f11195l = l;
            okVar.mo13061a(i3, i2, l);
            canvas.save();
            canvas.translate((float) i, (float) i4);
            canvas.drawBitmap(this.f11195l, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (Paint) null);
            canvas.restore();
        }
    }

    /* renamed from: n */
    public final void mo19269n(Canvas canvas, C2959ok okVar) {
        double width = ((double) this.f11187d.width()) / ((double) this.f11186c.getWidth());
        double height = ((double) this.f11187d.height()) / ((double) this.f11186c.getHeight());
        int round = (int) Math.round(((double) okVar.getWidth()) * width);
        int round2 = (int) Math.round(((double) okVar.getHeight()) * height);
        int b = (int) (((double) okVar.mo13062b()) * width);
        int c = (int) (((double) okVar.mo13063c()) * height);
        synchronized (this) {
            int width2 = this.f11187d.width();
            int height2 = this.f11187d.height();
            mo19267l(width2, height2);
            Bitmap bitmap = this.f11195l;
            if (bitmap != null) {
                okVar.mo13061a(round, round2, bitmap);
            }
            this.f11192i.set(0, 0, width2, height2);
            this.f11193j.set(b, c, width2 + b, height2 + c);
            Bitmap bitmap2 = this.f11195l;
            if (bitmap2 != null) {
                canvas.drawBitmap(bitmap2, this.f11192i, this.f11193j, (Paint) null);
            }
        }
    }
}
