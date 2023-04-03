package p000;

import android.graphics.Bitmap;
import java.util.Set;

/* renamed from: dl1 */
/* compiled from: DummyTrackingInUseBitmapPool */
public class dl1 implements s20 {

    /* renamed from: a */
    public final Set<Bitmap> f10757a = ly5.m21895b();

    /* renamed from: f */
    public Bitmap get(int i) {
        Bitmap createBitmap = Bitmap.createBitmap(1, (int) Math.ceil(((double) i) / 2.0d), Bitmap.Config.RGB_565);
        this.f10757a.add(createBitmap);
        return createBitmap;
    }

    /* renamed from: g */
    public void mo360a(Bitmap bitmap) {
        au4.m10792g(bitmap);
        this.f10757a.remove(bitmap);
        bitmap.recycle();
    }
}
