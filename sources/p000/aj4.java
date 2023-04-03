package p000;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import com.facebook.imagepipeline.platform.C1948a;

@TargetApi(26)
/* renamed from: aj4 */
/* compiled from: OreoDecoder */
public class aj4 extends C1948a {
    public aj4(s20 s20, int i, ct4 ct4) {
        super(s20, i, ct4);
    }

    /* renamed from: f */
    public static boolean m326f(BitmapFactory.Options options) {
        ColorSpace colorSpace = options.outColorSpace;
        if (colorSpace == null || !colorSpace.isWideGamut() || options.inPreferredConfig == Bitmap.Config.RGBA_F16) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public int mo324d(int i, int i2, BitmapFactory.Options options) {
        if (m326f(options)) {
            return i * i2 * 8;
        }
        Bitmap.Config config = options.inPreferredConfig;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return b30.m11040d(i, i2, config);
    }
}
