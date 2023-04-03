package p000;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* renamed from: lc0 */
/* compiled from: CenterInside */
public class lc0 extends a30 {

    /* renamed from: b */
    public static final byte[] f14469b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(z93.f20511a);

    /* renamed from: b */
    public void mo18753b(MessageDigest messageDigest) {
        messageDigest.update(f14469b);
    }

    /* renamed from: c */
    public Bitmap mo34c(t20 t20, Bitmap bitmap, int i, int i2) {
        return ow6.m24307c(t20, bitmap, i, i2);
    }

    public boolean equals(Object obj) {
        return obj instanceof lc0;
    }

    public int hashCode() {
        return -670243078;
    }
}
