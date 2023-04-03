package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.images.C4031a;
import com.google.android.gms.common.images.ImageManager;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/* renamed from: px7 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class px7 implements Runnable {

    /* renamed from: a */
    public final Uri f32877a;

    /* renamed from: d */
    public final ParcelFileDescriptor f32878d;

    public px7(ImageManager imageManager, Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
        this.f32877a = uri;
        this.f32878d = parcelFileDescriptor;
    }

    public final void run() {
        boolean z;
        Bitmap bitmap;
        Bitmap bitmap2;
        C6225lr.m47912b("LoadBitmapFromDiskRunnable can't be executed in the main thread");
        ParcelFileDescriptor parcelFileDescriptor = this.f32878d;
        boolean z2 = false;
        if (parcelFileDescriptor != null) {
            try {
                bitmap2 = BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor());
            } catch (OutOfMemoryError unused) {
                "OOM while loading bitmap for uri: ".concat(String.valueOf(this.f32877a));
                z2 = true;
                bitmap2 = null;
            }
            try {
                this.f32878d.close();
            } catch (IOException unused2) {
            }
            bitmap = bitmap2;
            z = z2;
        } else {
            z = false;
            bitmap = null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ImageManager.m33694b((ImageManager) null).post(new C4031a((ImageManager) null, this.f32877a, bitmap, z, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException unused3) {
            "Latch interrupted while posting ".concat(String.valueOf(this.f32877a));
        }
    }
}
