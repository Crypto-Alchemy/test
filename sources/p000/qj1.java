package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* renamed from: qj1 */
/* compiled from: DrawableToBitmapConverter */
public final class qj1 {

    /* renamed from: a */
    public static final t20 f16948a = new C3148a();

    /* renamed from: qj1$a */
    /* compiled from: DrawableToBitmapConverter */
    public class C3148a extends u20 {
        /* renamed from: c */
        public void mo25118c(Bitmap bitmap) {
        }
    }

    /* renamed from: a */
    public static bf5<Bitmap> m25705a(t20 t20, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            bitmap = m25706b(t20, current, i, i2);
            z = true;
        } else {
            bitmap = null;
        }
        if (!z) {
            t20 = f16948a;
        }
        return y20.m30373e(bitmap, t20);
    }

    /* renamed from: b */
    public static Bitmap m25706b(t20 t20, Drawable drawable, int i, int i2) {
        if (i == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to draw ");
                sb.append(drawable);
                sb.append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        } else if (i2 != Integer.MIN_VALUE || drawable.getIntrinsicHeight() > 0) {
            if (drawable.getIntrinsicWidth() > 0) {
                i = drawable.getIntrinsicWidth();
            }
            if (drawable.getIntrinsicHeight() > 0) {
                i2 = drawable.getIntrinsicHeight();
            }
            Lock i3 = ow6.m24313i();
            i3.lock();
            Bitmap d = t20.mo26025d(i, i2, Bitmap.Config.ARGB_8888);
            try {
                Canvas canvas = new Canvas(d);
                drawable.setBounds(0, 0, i, i2);
                drawable.draw(canvas);
                canvas.setBitmap((Bitmap) null);
                return d;
            } finally {
                i3.unlock();
            }
        } else {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unable to draw ");
                sb2.append(drawable);
                sb2.append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        }
    }
}
