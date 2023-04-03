package p000;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.C1725a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* renamed from: zp6 */
/* compiled from: ThumbnailStreamOpener */
public class zp6 {

    /* renamed from: f */
    public static final x02 f20646f = new x02();

    /* renamed from: a */
    public final x02 f20647a;

    /* renamed from: b */
    public final xp6 f20648b;

    /* renamed from: c */
    public final C2982oq f20649c;

    /* renamed from: d */
    public final ContentResolver f20650d;

    /* renamed from: e */
    public final List<ImageHeaderParser> f20651e;

    public zp6(List<ImageHeaderParser> list, xp6 xp6, C2982oq oqVar, ContentResolver contentResolver) {
        this(list, f20646f, xp6, oqVar, contentResolver);
    }

    /* renamed from: a */
    public int mo28556a(Uri uri) {
        InputStream inputStream = null;
        try {
            InputStream openInputStream = this.f20650d.openInputStream(uri);
            int b = C1725a.m12269b(this.f20651e, openInputStream, this.f20649c);
            if (openInputStream != null) {
                try {
                    openInputStream.close();
                } catch (IOException unused) {
                }
            }
            return b;
        } catch (IOException | NullPointerException unused2) {
            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to open uri: ");
                sb.append(uri);
            }
            if (inputStream == null) {
                return -1;
            }
            try {
                inputStream.close();
                return -1;
            } catch (IOException unused3) {
                return -1;
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x002a A[Catch:{ all -> 0x003d }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0041  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo28557b(android.net.Uri r5) {
        /*
            r4 = this;
            r0 = 0
            xp6 r1 = r4.f20648b     // Catch:{ SecurityException -> 0x0020, all -> 0x001e }
            android.database.Cursor r1 = r1.mo26529a(r5)     // Catch:{ SecurityException -> 0x0020, all -> 0x001e }
            if (r1 == 0) goto L_0x0018
            boolean r2 = r1.moveToFirst()     // Catch:{ SecurityException -> 0x0021 }
            if (r2 == 0) goto L_0x0018
            r2 = 0
            java.lang.String r5 = r1.getString(r2)     // Catch:{ SecurityException -> 0x0021 }
            r1.close()
            return r5
        L_0x0018:
            if (r1 == 0) goto L_0x001d
            r1.close()
        L_0x001d:
            return r0
        L_0x001e:
            r5 = move-exception
            goto L_0x003f
        L_0x0020:
            r1 = r0
        L_0x0021:
            java.lang.String r2 = "ThumbStreamOpener"
            r3 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r3)     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x0037
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x003d }
            r2.<init>()     // Catch:{ all -> 0x003d }
            java.lang.String r3 = "Failed to query for thumbnail for Uri: "
            r2.append(r3)     // Catch:{ all -> 0x003d }
            r2.append(r5)     // Catch:{ all -> 0x003d }
        L_0x0037:
            if (r1 == 0) goto L_0x003c
            r1.close()
        L_0x003c:
            return r0
        L_0x003d:
            r5 = move-exception
            r0 = r1
        L_0x003f:
            if (r0 == 0) goto L_0x0044
            r0.close()
        L_0x0044:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.zp6.mo28557b(android.net.Uri):java.lang.String");
    }

    /* renamed from: c */
    public final boolean mo28558c(File file) {
        if (!this.f20647a.mo27631a(file) || 0 >= this.f20647a.mo27633c(file)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public InputStream mo28559d(Uri uri) throws FileNotFoundException {
        String b = mo28557b(uri);
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        File b2 = this.f20647a.mo27632b(b);
        if (!mo28558c(b2)) {
            return null;
        }
        Uri fromFile = Uri.fromFile(b2);
        try {
            return this.f20650d.openInputStream(fromFile);
        } catch (NullPointerException e) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + fromFile).initCause(e));
        }
    }

    public zp6(List<ImageHeaderParser> list, x02 x02, xp6 xp6, C2982oq oqVar, ContentResolver contentResolver) {
        this.f20647a = x02;
        this.f20648b = xp6;
        this.f20649c = oqVar;
        this.f20650d = contentResolver;
        this.f20651e = list;
    }
}
