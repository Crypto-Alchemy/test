package p000;

import android.graphics.Bitmap;

/* renamed from: u20 */
/* compiled from: BitmapPoolAdapter */
public class u20 implements t20 {
    /* renamed from: a */
    public void mo26023a(int i) {
    }

    /* renamed from: b */
    public void mo26024b() {
    }

    /* renamed from: c */
    public void mo25118c(Bitmap bitmap) {
        bitmap.recycle();
    }

    /* renamed from: d */
    public Bitmap mo26025d(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    /* renamed from: e */
    public Bitmap mo26026e(int i, int i2, Bitmap.Config config) {
        return mo26025d(i, i2, config);
    }
}
