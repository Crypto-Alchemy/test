package p000;

import android.graphics.drawable.Drawable;

/* renamed from: m84 */
/* compiled from: NonOwnedDrawableResource */
public final class m84 extends pj1<Drawable> {
    public m84(Drawable drawable) {
        super(drawable);
    }

    /* renamed from: e */
    public static bf5<Drawable> m22091e(Drawable drawable) {
        if (drawable != null) {
            return new m84(drawable);
        }
        return null;
    }

    /* renamed from: a */
    public void mo11634a() {
    }

    /* renamed from: c */
    public Class<Drawable> mo11635c() {
        return this.f16499a.getClass();
    }

    public int getSize() {
        return Math.max(1, this.f16499a.getIntrinsicWidth() * this.f16499a.getIntrinsicHeight() * 4);
    }
}
