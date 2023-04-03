package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.common.images.ImageManager;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.common.images.a */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class C4031a implements Runnable {

    /* renamed from: a */
    public final Uri f22269a;

    /* renamed from: d */
    public final Bitmap f22270d;

    /* renamed from: e */
    public final CountDownLatch f22271e;

    public C4031a(ImageManager imageManager, Uri uri, Bitmap bitmap, boolean z, CountDownLatch countDownLatch) {
        this.f22269a = uri;
        this.f22270d = bitmap;
        this.f22271e = countDownLatch;
    }

    public final void run() {
        C6225lr.m47911a("OnBitmapLoadedRunnable must be executed in the main thread");
        Bitmap bitmap = this.f22270d;
        ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver) ImageManager.m33700h((ImageManager) null).remove(this.f22269a);
        if (imageReceiver != null) {
            ArrayList a = imageReceiver.f22264d;
            int size = a.size();
            for (int i = 0; i < size; i++) {
                z18 z18 = (z18) a.get(i);
                Bitmap bitmap2 = this.f22270d;
                if (bitmap2 == null || bitmap == null) {
                    ImageManager.m33698f((ImageManager) null).put(this.f22269a, Long.valueOf(SystemClock.elapsedRealtime()));
                    Context a2 = ImageManager.m33693a((ImageManager) null);
                    ImageManager.m33695c((ImageManager) null);
                    z18.mo49777b(a2, (t28) null, false);
                } else {
                    z18.mo49778c(ImageManager.m33693a((ImageManager) null), bitmap2, false);
                }
                ImageManager.m33699g((ImageManager) null).remove(z18);
            }
        }
        this.f22271e.countDown();
        synchronized (ImageManager.f22261a) {
            ImageManager.f22262b.remove(this.f22269a);
        }
    }
}
