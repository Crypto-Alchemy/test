package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.utils.Utils;
import p000.C3553wk;

/* renamed from: w10 */
/* compiled from: BitmapAnimationBackend */
public class w10 implements C3418uk, C3553wk.C3555b {

    /* renamed from: m */
    public static final Class<?> f18956m = w10.class;

    /* renamed from: a */
    public final xo4 f18957a;

    /* renamed from: b */
    public final f20 f18958b;

    /* renamed from: c */
    public final C1638bl f18959c;

    /* renamed from: d */
    public final i20 f18960d;

    /* renamed from: e */
    public final g20 f18961e;

    /* renamed from: f */
    public final h20 f18962f;

    /* renamed from: g */
    public final Paint f18963g;

    /* renamed from: h */
    public Rect f18964h;

    /* renamed from: i */
    public int f18965i;

    /* renamed from: j */
    public int f18966j;

    /* renamed from: k */
    public Bitmap.Config f18967k = Bitmap.Config.ARGB_8888;

    /* renamed from: l */
    public C3519a f18968l;

    /* renamed from: w10$a */
    /* compiled from: BitmapAnimationBackend */
    public interface C3519a {
        /* renamed from: a */
        void mo27412a(w10 w10, int i);

        /* renamed from: b */
        void mo27413b(w10 w10, int i);

        /* renamed from: c */
        void mo27414c(w10 w10, int i, int i2);
    }

    public w10(xo4 xo4, f20 f20, C1638bl blVar, i20 i20, g20 g20, h20 h20) {
        this.f18957a = xo4;
        this.f18958b = f20;
        this.f18959c = blVar;
        this.f18960d = i20;
        this.f18961e = g20;
        this.f18962f = h20;
        this.f18963g = new Paint(6);
        mo27411n();
    }

    /* renamed from: a */
    public int mo11695a() {
        return this.f18959c.mo11695a();
    }

    /* renamed from: b */
    public int mo11696b() {
        return this.f18959c.mo11696b();
    }

    /* renamed from: c */
    public int mo26810c() {
        return this.f18966j;
    }

    public void clear() {
        this.f18958b.clear();
    }

    /* renamed from: d */
    public void mo26812d(Rect rect) {
        this.f18964h = rect;
        this.f18960d.mo18796d(rect);
        mo27411n();
    }

    /* renamed from: e */
    public int mo26813e() {
        return this.f18965i;
    }

    /* renamed from: f */
    public void mo26814f(ColorFilter colorFilter) {
        this.f18963g.setColorFilter(colorFilter);
    }

    /* renamed from: g */
    public boolean mo26815g(Drawable drawable, Canvas canvas, int i) {
        h20 h20;
        C3519a aVar;
        C3519a aVar2 = this.f18968l;
        if (aVar2 != null) {
            aVar2.mo27412a(this, i);
        }
        boolean l = mo27409l(canvas, i, 0);
        if (!l && (aVar = this.f18968l) != null) {
            aVar.mo27413b(this, i);
        }
        g20 g20 = this.f18961e;
        if (!(g20 == null || (h20 = this.f18962f) == null)) {
            g20.mo20333a(h20, this.f18958b, this, i);
        }
        return l;
    }

    /* renamed from: h */
    public void mo27407h() {
        clear();
    }

    /* renamed from: i */
    public int mo11697i(int i) {
        return this.f18959c.mo11697i(i);
    }

    /* renamed from: j */
    public void mo26816j(int i) {
        this.f18963g.setAlpha(i);
    }

    /* renamed from: k */
    public final boolean mo27408k(int i, nh0<Bitmap> nh0, Canvas canvas, int i2) {
        if (!nh0.m23180p(nh0)) {
            return false;
        }
        if (this.f18964h == null) {
            canvas.drawBitmap(nh0.mo23684j(), Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, this.f18963g);
        } else {
            canvas.drawBitmap(nh0.mo23684j(), (Rect) null, this.f18964h, this.f18963g);
        }
        if (i2 != 3) {
            this.f18958b.mo19589d(i, nh0, i2);
        }
        C3519a aVar = this.f18968l;
        if (aVar == null) {
            return true;
        }
        aVar.mo27414c(this, i, i2);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        p000.oy1.m24434u(f18956m, "Failed to create frame bitmap", r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
        p000.nh0.m23178h((p000.nh0<?>) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0077, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0078, code lost:
        p000.nh0.m23178h(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x007b, code lost:
        throw r10;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:7:0x0012, B:10:0x001e] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo27409l(android.graphics.Canvas r10, int r11, int r12) {
        /*
            r9 = this;
            r0 = -1
            r1 = 3
            r2 = 2
            r3 = 0
            r4 = 1
            r5 = 0
            if (r12 == 0) goto L_0x005e
            if (r12 == r4) goto L_0x0044
            if (r12 == r2) goto L_0x001e
            if (r12 == r1) goto L_0x0012
            p000.nh0.m23178h(r5)
            return r3
        L_0x0012:
            f20 r12 = r9.f18958b     // Catch:{ all -> 0x0077 }
            nh0 r5 = r12.mo19586b(r11)     // Catch:{ all -> 0x0077 }
            boolean r12 = r9.mo27408k(r11, r5, r10, r1)     // Catch:{ all -> 0x0077 }
            r1 = r0
            goto L_0x0069
        L_0x001e:
            xo4 r12 = r9.f18957a     // Catch:{ RuntimeException -> 0x0038 }
            int r6 = r9.f18965i     // Catch:{ RuntimeException -> 0x0038 }
            int r7 = r9.f18966j     // Catch:{ RuntimeException -> 0x0038 }
            android.graphics.Bitmap$Config r8 = r9.f18967k     // Catch:{ RuntimeException -> 0x0038 }
            nh0 r5 = r12.mo27852a(r6, r7, r8)     // Catch:{ RuntimeException -> 0x0038 }
            boolean r12 = r9.mo27410m(r11, r5)     // Catch:{ all -> 0x0077 }
            if (r12 == 0) goto L_0x005c
            boolean r12 = r9.mo27408k(r11, r5, r10, r2)     // Catch:{ all -> 0x0077 }
            if (r12 == 0) goto L_0x005c
            r3 = r4
            goto L_0x005c
        L_0x0038:
            r10 = move-exception
            java.lang.Class<?> r11 = f18956m     // Catch:{ all -> 0x0077 }
            java.lang.String r12 = "Failed to create frame bitmap"
            p000.oy1.m24434u(r11, r12, r10)     // Catch:{ all -> 0x0077 }
            p000.nh0.m23178h(r5)
            return r3
        L_0x0044:
            f20 r12 = r9.f18958b     // Catch:{ all -> 0x0077 }
            int r1 = r9.f18965i     // Catch:{ all -> 0x0077 }
            int r6 = r9.f18966j     // Catch:{ all -> 0x0077 }
            nh0 r5 = r12.mo19587c(r11, r1, r6)     // Catch:{ all -> 0x0077 }
            boolean r12 = r9.mo27410m(r11, r5)     // Catch:{ all -> 0x0077 }
            if (r12 == 0) goto L_0x005b
            boolean r12 = r9.mo27408k(r11, r5, r10, r4)     // Catch:{ all -> 0x0077 }
            if (r12 == 0) goto L_0x005b
            r3 = r4
        L_0x005b:
            r1 = r2
        L_0x005c:
            r12 = r3
            goto L_0x0069
        L_0x005e:
            f20 r12 = r9.f18958b     // Catch:{ all -> 0x0077 }
            nh0 r5 = r12.mo19591f(r11)     // Catch:{ all -> 0x0077 }
            boolean r12 = r9.mo27408k(r11, r5, r10, r3)     // Catch:{ all -> 0x0077 }
            r1 = r4
        L_0x0069:
            p000.nh0.m23178h(r5)
            if (r12 != 0) goto L_0x0076
            if (r1 != r0) goto L_0x0071
            goto L_0x0076
        L_0x0071:
            boolean r10 = r9.mo27409l(r10, r11, r1)
            return r10
        L_0x0076:
            return r12
        L_0x0077:
            r10 = move-exception
            p000.nh0.m23178h(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.w10.mo27409l(android.graphics.Canvas, int, int):boolean");
    }

    /* renamed from: m */
    public final boolean mo27410m(int i, nh0<Bitmap> nh0) {
        if (!nh0.m23180p(nh0)) {
            return false;
        }
        boolean a = this.f18960d.mo18794a(i, nh0.mo23684j());
        if (!a) {
            nh0.m23178h(nh0);
        }
        return a;
    }

    /* renamed from: n */
    public final void mo27411n() {
        int i;
        int e = this.f18960d.mo18797e();
        this.f18965i = e;
        int i2 = -1;
        if (e == -1) {
            Rect rect = this.f18964h;
            if (rect == null) {
                i = -1;
            } else {
                i = rect.width();
            }
            this.f18965i = i;
        }
        int c = this.f18960d.mo18795c();
        this.f18966j = c;
        if (c == -1) {
            Rect rect2 = this.f18964h;
            if (rect2 != null) {
                i2 = rect2.height();
            }
            this.f18966j = i2;
        }
    }
}
