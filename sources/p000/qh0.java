package p000;

import android.graphics.Bitmap;

/* renamed from: qh0 */
/* compiled from: CloseableStaticBitmap */
public class qh0 extends ih0 implements hl2 {

    /* renamed from: e */
    public nh0<Bitmap> f16943e;

    /* renamed from: g */
    public volatile Bitmap f16944g;

    /* renamed from: k */
    public final qz4 f16945k;

    /* renamed from: r */
    public final int f16946r;

    /* renamed from: s */
    public final int f16947s;

    public qh0(Bitmap bitmap, rf5<Bitmap> rf5, qz4 qz4, int i) {
        this(bitmap, rf5, qz4, i, 0);
    }

    /* renamed from: i */
    public static int m25689i(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getHeight();
    }

    /* renamed from: j */
    public static int m25690j(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getWidth();
    }

    /* renamed from: a */
    public qz4 mo22289a() {
        return this.f16945k;
    }

    /* renamed from: b */
    public int mo21175b() {
        return b30.m11041e(this.f16944g);
    }

    public void close() {
        nh0<Bitmap> h = mo25109h();
        if (h != null) {
            h.close();
        }
    }

    /* renamed from: f */
    public Bitmap mo21538f() {
        return this.f16944g;
    }

    /* renamed from: g */
    public synchronized nh0<Bitmap> mo25108g() {
        return nh0.m23176f(this.f16943e);
    }

    public int getHeight() {
        int i;
        if (this.f16946r % 180 != 0 || (i = this.f16947s) == 5 || i == 7) {
            return m25690j(this.f16944g);
        }
        return m25689i(this.f16944g);
    }

    public int getWidth() {
        int i;
        if (this.f16946r % 180 != 0 || (i = this.f16947s) == 5 || i == 7) {
            return m25689i(this.f16944g);
        }
        return m25690j(this.f16944g);
    }

    /* renamed from: h */
    public final synchronized nh0<Bitmap> mo25109h() {
        nh0<Bitmap> nh0;
        nh0 = this.f16943e;
        this.f16943e = null;
        this.f16944g = null;
        return nh0;
    }

    public synchronized boolean isClosed() {
        boolean z;
        if (this.f16943e == null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: k */
    public int mo25110k() {
        return this.f16947s;
    }

    /* renamed from: l */
    public int mo25111l() {
        return this.f16946r;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [rf5<android.graphics.Bitmap>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qh0(android.graphics.Bitmap r1, p000.rf5<android.graphics.Bitmap> r2, p000.qz4 r3, int r4, int r5) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = p000.au4.m10792g(r1)
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            r0.f16944g = r1
            android.graphics.Bitmap r1 = r0.f16944g
            java.lang.Object r2 = p000.au4.m10792g(r2)
            rf5 r2 = (p000.rf5) r2
            nh0 r1 = p000.nh0.m23183y(r1, r2)
            r0.f16943e = r1
            r0.f16945k = r3
            r0.f16946r = r4
            r0.f16947s = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.qh0.<init>(android.graphics.Bitmap, rf5, qz4, int, int):void");
    }

    public qh0(nh0<Bitmap> nh0, qz4 qz4, int i) {
        this(nh0, qz4, i, 0);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [nh0<android.graphics.Bitmap>, nh0] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qh0(p000.nh0<android.graphics.Bitmap> r1, p000.qz4 r2, int r3, int r4) {
        /*
            r0 = this;
            r0.<init>()
            nh0 r1 = r1.mo23683d()
            java.lang.Object r1 = p000.au4.m10792g(r1)
            nh0 r1 = (p000.nh0) r1
            r0.f16943e = r1
            java.lang.Object r1 = r1.mo23684j()
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            r0.f16944g = r1
            r0.f16945k = r2
            r0.f16946r = r3
            r0.f16947s = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.qh0.<init>(nh0, qz4, int, int):void");
    }
}
