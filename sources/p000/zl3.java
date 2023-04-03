package p000;

import android.graphics.Bitmap;

/* renamed from: zl3 */
/* compiled from: LruBitmapPool */
public class zl3 implements s20 {

    /* renamed from: a */
    public final js4<Bitmap> f20595a = new v20();

    /* renamed from: b */
    public final int f20596b;

    /* renamed from: c */
    public int f20597c;

    /* renamed from: d */
    public final ns4 f20598d;

    /* renamed from: e */
    public int f20599e;

    public zl3(int i, int i2, ns4 ns4, ht3 ht3) {
        this.f20596b = i;
        this.f20597c = i2;
        this.f20598d = ns4;
        if (ht3 != null) {
            ht3.mo21382a(this);
        }
    }

    /* renamed from: f */
    public final Bitmap mo28523f(int i) {
        this.f20598d.mo23803d(i);
        return Bitmap.createBitmap(1, i, Bitmap.Config.ALPHA_8);
    }

    /* renamed from: g */
    public synchronized Bitmap get(int i) {
        int i2 = this.f20599e;
        int i3 = this.f20596b;
        if (i2 > i3) {
            mo28526i(i3);
        }
        Bitmap bitmap = this.f20595a.get(i);
        if (bitmap != null) {
            int a = this.f20595a.mo22086a(bitmap);
            this.f20599e -= a;
            this.f20598d.mo23804e(a);
            return bitmap;
        }
        return mo28523f(i);
    }

    /* renamed from: h */
    public void mo360a(Bitmap bitmap) {
        int a = this.f20595a.mo22086a(bitmap);
        if (a <= this.f20597c) {
            this.f20598d.mo23802c(a);
            this.f20595a.put(bitmap);
            synchronized (this) {
                this.f20599e += a;
            }
        }
    }

    /* renamed from: i */
    public final synchronized void mo28526i(int i) {
        while (true) {
            if (this.f20599e <= i) {
                break;
            }
            Bitmap pop = this.f20595a.pop();
            if (pop == null) {
                break;
            }
            int a = this.f20595a.mo22086a(pop);
            this.f20599e -= a;
            this.f20598d.mo23801b(a);
        }
    }
}
