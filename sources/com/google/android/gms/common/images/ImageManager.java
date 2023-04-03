package com.google.android.gms.common.images;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import com.google.android.gms.common.annotation.KeepName;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class ImageManager {

    /* renamed from: a */
    public static final Object f22261a = new Object();

    /* renamed from: b */
    public static HashSet f22262b = new HashSet();

    @KeepName
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public final class ImageReceiver extends ResultReceiver {

        /* renamed from: a */
        public final Uri f22263a;

        /* renamed from: d */
        public final ArrayList f22264d;

        public final void onReceiveResult(int i, Bundle bundle) {
            ImageManager.m33701i((ImageManager) null).execute(new px7((ImageManager) null, this.f22263a, (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ Context m33693a(ImageManager imageManager) {
        throw null;
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ Handler m33694b(ImageManager imageManager) {
        throw null;
    }

    /* renamed from: c */
    public static /* bridge */ /* synthetic */ t28 m33695c(ImageManager imageManager) {
        throw null;
    }

    /* renamed from: f */
    public static /* bridge */ /* synthetic */ Map m33698f(ImageManager imageManager) {
        throw null;
    }

    /* renamed from: g */
    public static /* bridge */ /* synthetic */ Map m33699g(ImageManager imageManager) {
        throw null;
    }

    /* renamed from: h */
    public static /* bridge */ /* synthetic */ Map m33700h(ImageManager imageManager) {
        throw null;
    }

    /* renamed from: i */
    public static /* bridge */ /* synthetic */ ExecutorService m33701i(ImageManager imageManager) {
        throw null;
    }
}
