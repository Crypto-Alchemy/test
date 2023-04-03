package p000;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* renamed from: g32 */
/* compiled from: FitCenter */
public class g32 extends a30 {

    /* renamed from: b */
    public static final byte[] f12165b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(z93.f20511a);

    /* renamed from: b */
    public void mo18753b(MessageDigest messageDigest) {
        messageDigest.update(f12165b);
    }

    /* renamed from: c */
    public Bitmap mo34c(t20 t20, Bitmap bitmap, int i, int i2) {
        return ow6.m24310f(t20, bitmap, i, i2);
    }

    public boolean equals(Object obj) {
        return obj instanceof g32;
    }

    public int hashCode() {
        return 1572326941;
    }
}
