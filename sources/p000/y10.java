package p000;

import android.graphics.Bitmap;

/* renamed from: y10 */
/* compiled from: BitmapCounter */
public class y10 {

    /* renamed from: a */
    public int f19996a;

    /* renamed from: b */
    public long f19997b;

    /* renamed from: c */
    public final int f19998c;

    /* renamed from: d */
    public final int f19999d;

    /* renamed from: e */
    public final rf5<Bitmap> f20000e;

    /* renamed from: y10$a */
    /* compiled from: BitmapCounter */
    public class C3649a implements rf5<Bitmap> {
        public C3649a() {
        }

        /* renamed from: b */
        public void mo360a(Bitmap bitmap) {
            try {
                y10.this.mo27896a(bitmap);
            } finally {
                bitmap.recycle();
            }
        }
    }

    public y10(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        au4.m10787b(Boolean.valueOf(z));
        au4.m10787b(Boolean.valueOf(i2 <= 0 ? false : z2));
        this.f19998c = i;
        this.f19999d = i2;
        this.f20000e = new C3649a();
    }

    /* renamed from: a */
    public synchronized void mo27896a(Bitmap bitmap) {
        boolean z;
        boolean z2;
        int e = b30.m11041e(bitmap);
        if (this.f19996a > 0) {
            z = true;
        } else {
            z = false;
        }
        au4.m10788c(z, "No bitmaps registered.");
        long j = (long) e;
        if (j <= this.f19997b) {
            z2 = true;
        } else {
            z2 = false;
        }
        au4.m10789d(z2, "Bitmap size bigger than the total registered size: %d, %d", Integer.valueOf(e), Long.valueOf(this.f19997b));
        this.f19997b -= j;
        this.f19996a--;
    }

    /* renamed from: b */
    public synchronized int mo27897b() {
        return this.f19996a;
    }

    /* renamed from: c */
    public synchronized int mo27898c() {
        return this.f19998c;
    }

    /* renamed from: d */
    public synchronized int mo27899d() {
        return this.f19999d;
    }

    /* renamed from: e */
    public rf5<Bitmap> mo27900e() {
        return this.f20000e;
    }

    /* renamed from: f */
    public synchronized long mo27901f() {
        return this.f19997b;
    }

    /* renamed from: g */
    public synchronized boolean mo27902g(Bitmap bitmap) {
        int e = b30.m11041e(bitmap);
        int i = this.f19996a;
        if (i < this.f19998c) {
            long j = this.f19997b;
            long j2 = (long) e;
            if (j + j2 <= ((long) this.f19999d)) {
                this.f19996a = i + 1;
                this.f19997b = j + j2;
                return true;
            }
        }
        return false;
    }
}
