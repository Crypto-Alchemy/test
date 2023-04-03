package p000;

import android.graphics.Bitmap;

/* renamed from: al1 */
/* compiled from: DummyBitmapPool */
public class al1 implements s20 {
    /* renamed from: f */
    public Bitmap get(int i) {
        return Bitmap.createBitmap(1, (int) Math.ceil(((double) i) / 2.0d), Bitmap.Config.RGB_565);
    }

    /* renamed from: g */
    public void mo360a(Bitmap bitmap) {
        au4.m10792g(bitmap);
        bitmap.recycle();
    }
}
