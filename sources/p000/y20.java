package p000;

import android.graphics.Bitmap;

/* renamed from: y20 */
/* compiled from: BitmapResource */
public class y20 implements bf5<Bitmap>, cu2 {

    /* renamed from: a */
    public final Bitmap f20020a;

    /* renamed from: d */
    public final t20 f20021d;

    public y20(Bitmap bitmap, t20 t20) {
        this.f20020a = (Bitmap) zt4.m31501e(bitmap, "Bitmap must not be null");
        this.f20021d = (t20) zt4.m31501e(t20, "BitmapPool must not be null");
    }

    /* renamed from: e */
    public static y20 m30373e(Bitmap bitmap, t20 t20) {
        if (bitmap == null) {
            return null;
        }
        return new y20(bitmap, t20);
    }

    /* renamed from: a */
    public void mo11634a() {
        this.f20021d.mo25118c(this.f20020a);
    }

    /* renamed from: b */
    public void mo18287b() {
        this.f20020a.prepareToDraw();
    }

    /* renamed from: c */
    public Class<Bitmap> mo11635c() {
        return Bitmap.class;
    }

    /* renamed from: d */
    public Bitmap get() {
        return this.f20020a;
    }

    public int getSize() {
        return p67.m24680h(this.f20020a);
    }
}
