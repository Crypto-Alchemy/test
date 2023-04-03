package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: hj1 */
/* compiled from: DrawableBytesTranscoder */
public final class hj1 implements sf5<Drawable, byte[]> {

    /* renamed from: a */
    public final t20 f12910a;

    /* renamed from: b */
    public final sf5<Bitmap, byte[]> f12911b;

    /* renamed from: c */
    public final sf5<jg2, byte[]> f12912c;

    public hj1(t20 t20, sf5<Bitmap, byte[]> sf5, sf5<jg2, byte[]> sf52) {
        this.f12910a = t20;
        this.f12911b = sf5;
        this.f12912c = sf52;
    }

    /* renamed from: b */
    public static bf5<jg2> m18910b(bf5<Drawable> bf5) {
        return bf5;
    }

    /* renamed from: a */
    public bf5<byte[]> mo18396a(bf5<Drawable> bf5, xi4 xi4) {
        Drawable drawable = bf5.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f12911b.mo18396a(y20.m30373e(((BitmapDrawable) drawable).getBitmap(), this.f12910a), xi4);
        }
        if (drawable instanceof jg2) {
            return this.f12912c.mo18396a(m18910b(bf5), xi4);
        }
        return null;
    }
}
