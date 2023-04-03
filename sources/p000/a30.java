package p000;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.C1710a;

/* renamed from: a30 */
/* compiled from: BitmapTransformation */
public abstract class a30 implements mw6<Bitmap> {
    /* renamed from: a */
    public final bf5<Bitmap> mo33a(Context context, bf5<Bitmap> bf5, int i, int i2) {
        if (p67.m24692t(i, i2)) {
            t20 f = C1710a.m12218c(context).mo12359f();
            Bitmap bitmap = bf5.get();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap c = mo34c(f, bitmap, i, i2);
            if (bitmap.equals(c)) {
                return bf5;
            }
            return y20.m30373e(c, f);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    /* renamed from: c */
    public abstract Bitmap mo34c(t20 t20, Bitmap bitmap, int i, int i2);
}
