package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: gf3 */
/* compiled from: LazyBitmapDrawableResource */
public final class gf3 implements bf5<BitmapDrawable>, cu2 {

    /* renamed from: a */
    public final Resources f12312a;

    /* renamed from: d */
    public final bf5<Bitmap> f12313d;

    public gf3(Resources resources, bf5<Bitmap> bf5) {
        this.f12312a = (Resources) zt4.m31500d(resources);
        this.f12313d = (bf5) zt4.m31500d(bf5);
    }

    /* renamed from: e */
    public static bf5<BitmapDrawable> m18047e(Resources resources, bf5<Bitmap> bf5) {
        if (bf5 == null) {
            return null;
        }
        return new gf3(resources, bf5);
    }

    /* renamed from: a */
    public void mo11634a() {
        this.f12313d.mo11634a();
    }

    /* renamed from: b */
    public void mo18287b() {
        bf5<Bitmap> bf5 = this.f12313d;
        if (bf5 instanceof cu2) {
            ((cu2) bf5).mo18287b();
        }
    }

    /* renamed from: c */
    public Class<BitmapDrawable> mo11635c() {
        return BitmapDrawable.class;
    }

    /* renamed from: d */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f12312a, this.f12313d.get());
    }

    public int getSize() {
        return this.f12313d.getSize();
    }
}
