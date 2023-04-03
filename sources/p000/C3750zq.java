package p000;

import android.annotation.TargetApi;
import android.graphics.Bitmap;

@TargetApi(21)
/* renamed from: zq */
/* compiled from: ArtBitmapFactory */
public class C3750zq extends xo4 {

    /* renamed from: a */
    public final s20 f20652a;

    /* renamed from: b */
    public final oh0 f20653b;

    public C3750zq(s20 s20, oh0 oh0) {
        this.f20652a = s20;
        this.f20653b = oh0;
    }

    /* renamed from: c */
    public nh0<Bitmap> mo27854c(int i, int i2, Bitmap.Config config) {
        boolean z;
        Bitmap bitmap = (Bitmap) this.f20652a.get(b30.m11040d(i, i2, config));
        if (bitmap.getAllocationByteCount() >= i * i2 * b30.m11039c(config)) {
            z = true;
        } else {
            z = false;
        }
        au4.m10787b(Boolean.valueOf(z));
        bitmap.reconfigure(i, i2, config);
        return this.f20653b.mo23951c(bitmap, this.f20652a);
    }
}
