package p000;

import android.graphics.Bitmap;

/* renamed from: b26 */
/* compiled from: SimpleBitmapReleaser */
public class b26 implements rf5<Bitmap> {

    /* renamed from: a */
    public static b26 f7922a;

    /* renamed from: b */
    public static b26 m11034b() {
        if (f7922a == null) {
            f7922a = new b26();
        }
        return f7922a;
    }

    /* renamed from: c */
    public void mo360a(Bitmap bitmap) {
        bitmap.recycle();
    }
}
