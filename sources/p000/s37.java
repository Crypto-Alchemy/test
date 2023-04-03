package p000;

import android.graphics.Bitmap;

/* renamed from: s37 */
/* compiled from: UnitBitmapDecoder */
public final class s37 implements gf5<Bitmap, Bitmap> {

    /* renamed from: s37$a */
    /* compiled from: UnitBitmapDecoder */
    public static final class C3242a implements bf5<Bitmap> {

        /* renamed from: a */
        public final Bitmap f17463a;

        public C3242a(Bitmap bitmap) {
            this.f17463a = bitmap;
        }

        /* renamed from: a */
        public void mo11634a() {
        }

        /* renamed from: b */
        public Bitmap get() {
            return this.f17463a;
        }

        /* renamed from: c */
        public Class<Bitmap> mo11635c() {
            return Bitmap.class;
        }

        public int getSize() {
            return p67.m24680h(this.f17463a);
        }
    }

    /* renamed from: c */
    public bf5<Bitmap> mo415b(Bitmap bitmap, int i, int i2, xi4 xi4) {
        return new C3242a(bitmap);
    }

    /* renamed from: d */
    public boolean mo414a(Bitmap bitmap, xi4 xi4) {
        return true;
    }
}
