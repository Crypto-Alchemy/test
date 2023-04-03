package p000;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.imagepipeline.platform.C1948a;

@TargetApi(21)
/* renamed from: ar */
/* compiled from: ArtDecoder */
public class C1568ar extends C1948a {
    public C1568ar(s20 s20, int i, ct4 ct4) {
        super(s20, i, ct4);
    }

    /* renamed from: d */
    public int mo324d(int i, int i2, BitmapFactory.Options options) {
        return b30.m11040d(i, i2, (Bitmap.Config) gu4.m18428f(options.inPreferredConfig));
    }
}
