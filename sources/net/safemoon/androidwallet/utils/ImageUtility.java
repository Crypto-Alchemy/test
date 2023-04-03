package net.safemoon.androidwallet.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010 \u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fJ#\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u001d\u001a\u00020\u001cH\u0002R\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001f\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, mo44877d2 = {"Lnet/safemoon/androidwallet/utils/ImageUtility;", "", "Landroid/net/Uri;", "uri", "Ljava/io/File;", "b", "(Landroid/net/Uri;Lns0;)Ljava/lang/Object;", "Landroid/graphics/Bitmap;", "bitmap", "", "folder", "a", "(Landroid/graphics/Bitmap;Ljava/lang/String;Lns0;)Ljava/lang/Object;", "Landroid/graphics/drawable/Drawable;", "drawable", "", "color", "c", "Ljava/io/InputStream;", "in", "Ljava/io/OutputStream;", "out", "Lr37;", "e", "(Ljava/io/InputStream;Ljava/io/OutputStream;Lns0;)Ljava/lang/Object;", "bmp", "d", "(Landroid/graphics/Bitmap;Ljava/io/OutputStream;Lns0;)Ljava/lang/Object;", "", "f", "Landroid/content/Context;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: ImageUtility.kt */
public final class ImageUtility {

    /* renamed from: a */
    public final Context f42586a;

    public ImageUtility(Context context) {
        vx2.m53591g(context, "context");
        this.f42586a = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60920a(android.graphics.Bitmap r7, java.lang.String r8, p000.ns0<? super java.io.File> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof net.safemoon.androidwallet.utils.ImageUtility$addCache$2
            if (r0 == 0) goto L_0x0013
            r0 = r9
            net.safemoon.androidwallet.utils.ImageUtility$addCache$2 r0 = (net.safemoon.androidwallet.utils.ImageUtility$addCache$2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.utils.ImageUtility$addCache$2 r0 = new net.safemoon.androidwallet.utils.ImageUtility$addCache$2
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r7 = r0.L$0
            java.io.File r7 = (java.io.File) r7
            p000.hg5.m45199b(r9)
            goto L_0x006a
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            p000.hg5.m45199b(r9)
            java.io.File r9 = new java.io.File
            android.content.Context r2 = r6.f42586a
            java.io.File r2 = r2.getFilesDir()
            r9.<init>(r2, r8)
            boolean r8 = r9.exists()
            if (r8 != 0) goto L_0x004c
            r9.mkdirs()
        L_0x004c:
            java.io.File r8 = new java.io.File
            long r4 = r6.mo60925f()
            java.lang.String r2 = java.lang.String.valueOf(r4)
            r8.<init>(r9, r2)
            java.io.FileOutputStream r9 = new java.io.FileOutputStream
            r9.<init>(r8)
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r7 = r6.mo60923d(r7, r9, r0)
            if (r7 != r1) goto L_0x0069
            return r1
        L_0x0069:
            r7 = r8
        L_0x006a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.utils.ImageUtility.mo60920a(android.graphics.Bitmap, java.lang.String, ns0):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60921b(android.net.Uri r7, p000.ns0<? super java.io.File> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof net.safemoon.androidwallet.utils.ImageUtility$addCache$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            net.safemoon.androidwallet.utils.ImageUtility$addCache$1 r0 = (net.safemoon.androidwallet.utils.ImageUtility$addCache$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.utils.ImageUtility$addCache$1 r0 = new net.safemoon.androidwallet.utils.ImageUtility$addCache$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r7 = r0.L$0
            java.io.File r7 = (java.io.File) r7
            p000.hg5.m45199b(r8)
            goto L_0x0079
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            p000.hg5.m45199b(r8)
            java.io.File r8 = new java.io.File
            android.content.Context r2 = r6.f42586a
            java.io.File r2 = r2.getFilesDir()
            java.lang.String r4 = "Avatar"
            r8.<init>(r2, r4)
            boolean r2 = r8.exists()
            if (r2 != 0) goto L_0x004e
            r8.mkdirs()
        L_0x004e:
            java.io.File r2 = new java.io.File
            long r4 = r6.mo60925f()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r2.<init>(r8, r4)
            android.content.Context r8 = r6.f42586a
            android.content.ContentResolver r8 = r8.getContentResolver()
            java.io.InputStream r7 = r8.openInputStream(r7)
            java.io.FileOutputStream r8 = new java.io.FileOutputStream
            r8.<init>(r2)
            p000.vx2.m53588d(r7)
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r7 = r6.mo60924e(r7, r8, r0)
            if (r7 != r1) goto L_0x0078
            return r1
        L_0x0078:
            r7 = r2
        L_0x0079:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.utils.ImageUtility.mo60921b(android.net.Uri, ns0):java.lang.Object");
    }

    /* renamed from: c */
    public final Drawable mo60922c(Drawable drawable, int i) {
        if (drawable == null) {
            return null;
        }
        Drawable r = ij1.m19659r(drawable);
        vx2.m53590f(r, "wrap(drawable)");
        r.setColorFilter(new PorterDuffColorFilter(uf5.m28221d(this.f42586a.getResources(), R.color.dark_grey, (Resources.Theme) null), PorterDuff.Mode.SRC_ATOP));
        return r;
    }

    /* renamed from: d */
    public final Object mo60923d(Bitmap bitmap, OutputStream outputStream, ns0<? super r37> ns0) {
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream);
        return r37.f33317a;
    }

    /* renamed from: e */
    public final Object mo60924e(InputStream inputStream, OutputStream outputStream, ns0<? super r37> ns0) {
        byte[] bArr = new byte[RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE];
        while (true) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                outputStream.write(bArr, 0, read);
            } else {
                outputStream.close();
                inputStream.close();
                return r37.f33317a;
            }
        }
    }

    /* renamed from: f */
    public final long mo60925f() {
        return System.currentTimeMillis();
    }
}
