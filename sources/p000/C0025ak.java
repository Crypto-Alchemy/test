package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* renamed from: ak */
/* compiled from: AnimatedDrawable2 */
public class C0025ak extends Drawable implements Animatable, xj1 {

    /* renamed from: Q */
    public static final Class<?> f149Q = C0025ak.class;

    /* renamed from: U */
    public static final C1684cl f150U = new C3646xx();

    /* renamed from: A */
    public int f151A;

    /* renamed from: B */
    public long f152B;

    /* renamed from: C */
    public long f153C;

    /* renamed from: H */
    public int f154H;

    /* renamed from: I */
    public volatile C1684cl f155I;

    /* renamed from: L */
    public volatile C0027b f156L;

    /* renamed from: M */
    public oj1 f157M;

    /* renamed from: P */
    public final Runnable f158P;

    /* renamed from: a */
    public C3418uk f159a;

    /* renamed from: d */
    public vb2 f160d;

    /* renamed from: e */
    public volatile boolean f161e;

    /* renamed from: g */
    public long f162g;

    /* renamed from: k */
    public long f163k;

    /* renamed from: r */
    public long f164r;

    /* renamed from: s */
    public int f165s;

    /* renamed from: x */
    public long f166x;

    /* renamed from: y */
    public long f167y;

    /* renamed from: ak$a */
    /* compiled from: AnimatedDrawable2 */
    public class C0026a implements Runnable {
        public C0026a() {
        }

        public void run() {
            C0025ak akVar = C0025ak.this;
            akVar.unscheduleSelf(akVar.f158P);
            C0025ak.this.invalidateSelf();
        }
    }

    /* renamed from: ak$b */
    /* compiled from: AnimatedDrawable2 */
    public interface C0027b {
        /* renamed from: a */
        void mo341a(C0025ak akVar, vb2 vb2, int i, boolean z, boolean z2, long j, long j2, long j3, long j4, long j5, long j6, long j7);
    }

    public C0025ak() {
        this((C3418uk) null);
    }

    /* renamed from: c */
    public static vb2 m329c(C3418uk ukVar) {
        if (ukVar == null) {
            return null;
        }
        return new vk1(ukVar);
    }

    /* renamed from: a */
    public void mo325a() {
        C3418uk ukVar = this.f159a;
        if (ukVar != null) {
            ukVar.clear();
        }
    }

    /* renamed from: d */
    public final long mo326d() {
        return SystemClock.uptimeMillis();
    }

    public void draw(Canvas canvas) {
        long j;
        long j2;
        long j3;
        long j4;
        C0025ak akVar;
        if (this.f159a == null || this.f160d == null) {
            return;
        }
        long d = mo326d();
        if (this.f161e) {
            j = (d - this.f162g) + this.f153C;
        } else {
            j = Math.max(this.f163k, 0);
        }
        long j5 = j;
        int b = this.f160d.mo27094b(j5, this.f163k);
        if (b == -1) {
            b = this.f159a.mo11695a() - 1;
            this.f155I.mo12095b(this);
            this.f161e = false;
        } else if (b == 0 && this.f165s != -1 && d >= this.f164r) {
            this.f155I.mo12096c(this);
        }
        int i = b;
        boolean g = this.f159a.mo26815g(this, canvas, i);
        if (g) {
            this.f155I.mo12094a(this, i);
            this.f165s = i;
        }
        if (!g) {
            mo328e();
        }
        long d2 = mo326d();
        if (this.f161e) {
            long a = this.f160d.mo27093a(d2 - this.f162g);
            if (a != -1) {
                long j6 = this.f152B + a;
                mo329f(j6);
                j2 = j6;
            } else {
                this.f155I.mo12095b(this);
                this.f161e = false;
                j2 = -1;
            }
            j3 = a;
        } else {
            j3 = -1;
            j2 = -1;
        }
        C0027b bVar = this.f156L;
        if (bVar != null) {
            bVar.mo341a(this, this.f160d, i, g, this.f161e, this.f162g, j5, this.f163k, d, d2, j3, j2);
            akVar = this;
            j4 = j5;
        } else {
            akVar = this;
            j4 = j5;
        }
        akVar.f163k = j4;
    }

    /* renamed from: e */
    public final void mo328e() {
        this.f154H++;
        if (oy1.m24426m(2)) {
            oy1.m24428o(f149Q, "Dropped a frame. Count: %s", Integer.valueOf(this.f154H));
        }
    }

    /* renamed from: f */
    public final void mo329f(long j) {
        long j2 = this.f162g + j;
        this.f164r = j2;
        scheduleSelf(this.f158P, j2);
    }

    public int getIntrinsicHeight() {
        C3418uk ukVar = this.f159a;
        if (ukVar == null) {
            return super.getIntrinsicHeight();
        }
        return ukVar.mo26810c();
    }

    public int getIntrinsicWidth() {
        C3418uk ukVar = this.f159a;
        if (ukVar == null) {
            return super.getIntrinsicWidth();
        }
        return ukVar.mo26813e();
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return this.f161e;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        C3418uk ukVar = this.f159a;
        if (ukVar != null) {
            ukVar.mo26812d(rect);
        }
    }

    public boolean onLevelChange(int i) {
        if (this.f161e) {
            return false;
        }
        long j = (long) i;
        if (this.f163k == j) {
            return false;
        }
        this.f163k = j;
        invalidateSelf();
        return true;
    }

    public void setAlpha(int i) {
        if (this.f157M == null) {
            this.f157M = new oj1();
        }
        this.f157M.mo23961b(i);
        C3418uk ukVar = this.f159a;
        if (ukVar != null) {
            ukVar.mo26816j(i);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f157M == null) {
            this.f157M = new oj1();
        }
        this.f157M.mo23962c(colorFilter);
        C3418uk ukVar = this.f159a;
        if (ukVar != null) {
            ukVar.mo26814f(colorFilter);
        }
    }

    public void start() {
        C3418uk ukVar;
        if (!this.f161e && (ukVar = this.f159a) != null && ukVar.mo11695a() > 1) {
            this.f161e = true;
            long d = mo326d();
            long j = d - this.f166x;
            this.f162g = j;
            this.f164r = j;
            this.f163k = d - this.f167y;
            this.f165s = this.f151A;
            invalidateSelf();
            this.f155I.mo12097d(this);
        }
    }

    public void stop() {
        if (this.f161e) {
            long d = mo326d();
            this.f166x = d - this.f162g;
            this.f167y = d - this.f163k;
            this.f151A = this.f165s;
            this.f161e = false;
            this.f162g = 0;
            this.f164r = 0;
            this.f163k = -1;
            this.f165s = -1;
            unscheduleSelf(this.f158P);
            this.f155I.mo12095b(this);
        }
    }

    public C0025ak(C3418uk ukVar) {
        this.f152B = 8;
        this.f153C = 0;
        this.f155I = f150U;
        this.f156L = null;
        this.f158P = new C0026a();
        this.f159a = ukVar;
        this.f160d = m329c(ukVar);
    }
}
