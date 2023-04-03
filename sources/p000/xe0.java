package p000;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* renamed from: xe0 */
/* compiled from: CircleCrop */
public class xe0 extends a30 {

    /* renamed from: b */
    public static final byte[] f19823b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(z93.f20511a);

    /* renamed from: b */
    public void mo18753b(MessageDigest messageDigest) {
        messageDigest.update(f19823b);
    }

    /* renamed from: c */
    public Bitmap mo34c(t20 t20, Bitmap bitmap, int i, int i2) {
        return ow6.m24308d(t20, bitmap, i, i2);
    }

    public boolean equals(Object obj) {
        return obj instanceof xe0;
    }

    public int hashCode() {
        return 1101716364;
    }
}
