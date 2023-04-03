package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* renamed from: cf5 */
/* compiled from: ResourceBitmapDecoder */
public class cf5 implements gf5<Uri, Bitmap> {

    /* renamed from: a */
    public final if5 f8434a;

    /* renamed from: b */
    public final t20 f8435b;

    public cf5(if5 if5, t20 t20) {
        this.f8434a = if5;
        this.f8435b = t20;
    }

    /* renamed from: c */
    public bf5<Bitmap> mo415b(Uri uri, int i, int i2, xi4 xi4) {
        bf5<Drawable> c = this.f8434a.mo415b(uri, i, i2, xi4);
        if (c == null) {
            return null;
        }
        return qj1.m25705a(this.f8435b, c.get(), i, i2);
    }

    /* renamed from: d */
    public boolean mo414a(Uri uri, xi4 xi4) {
        return "android.resource".equals(uri.getScheme());
    }
}
