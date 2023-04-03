package p000;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import com.facebook.imagepipeline.memory.BasePool;

@TargetApi(21)
/* renamed from: l40 */
/* compiled from: BucketsBitmapPool */
public class l40 extends BasePool<Bitmap> implements s20 {
    public l40(ht3 ht3, ms4 ms4, ns4 ns4, boolean z) {
        super(ht3, ms4, ns4, z);
        mo13343r();
    }

    /* renamed from: A */
    public void mo13335j(Bitmap bitmap) {
        au4.m10792g(bitmap);
        bitmap.recycle();
    }

    /* renamed from: B */
    public int mo13339n(Bitmap bitmap) {
        au4.m10792g(bitmap);
        return bitmap.getAllocationByteCount();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [j40<android.graphics.Bitmap>, j40] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap mo13341p(p000.j40<android.graphics.Bitmap> r2) {
        /*
            r1 = this;
            java.lang.Object r2 = super.mo13341p(r2)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 == 0) goto L_0x000c
            r0 = 0
            r2.eraseColor(r0)
        L_0x000c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.l40.mo13341p(j40):android.graphics.Bitmap");
    }

    /* renamed from: D */
    public boolean mo13345t(Bitmap bitmap) {
        au4.m10792g(bitmap);
        if (bitmap.isRecycled() || !bitmap.isMutable()) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public int mo13338m(int i) {
        return i;
    }

    /* renamed from: o */
    public int mo13340o(int i) {
        return i;
    }

    /* renamed from: z */
    public Bitmap mo13330f(int i) {
        return Bitmap.createBitmap(1, (int) Math.ceil(((double) i) / 2.0d), Bitmap.Config.RGB_565);
    }
}
