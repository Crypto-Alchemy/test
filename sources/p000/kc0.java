package p000;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* renamed from: kc0 */
/* compiled from: CenterCrop */
public class kc0 extends a30 {

    /* renamed from: b */
    public static final byte[] f14035b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(z93.f20511a);

    /* renamed from: b */
    public void mo18753b(MessageDigest messageDigest) {
        messageDigest.update(f14035b);
    }

    /* renamed from: c */
    public Bitmap mo34c(t20 t20, Bitmap bitmap, int i, int i2) {
        return ow6.m24306b(t20, bitmap, i, i2);
    }

    public boolean equals(Object obj) {
        return obj instanceof kc0;
    }

    public int hashCode() {
        return -599754482;
    }
}
