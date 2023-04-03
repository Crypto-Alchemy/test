package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Executor;

/* renamed from: qq2 */
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public class qq2 implements Closeable {

    /* renamed from: a */
    public final URL f33240a;

    /* renamed from: d */
    public tl6<Bitmap> f33241d;

    /* renamed from: e */
    public volatile InputStream f33242e;

    public qq2(URL url) {
        this.f33240a = url;
    }

    /* renamed from: c */
    public static qq2 m50820c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new qq2(new URL(str));
        } catch (MalformedURLException unused) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "Not downloading image, bad URL: ".concat(valueOf);
            }
            return null;
        }
    }

    /* renamed from: a */
    public Bitmap mo47241a() throws IOException {
        String valueOf = String.valueOf(this.f33240a);
        StringBuilder sb = new StringBuilder(valueOf.length() + 22);
        sb.append("Starting download of: ");
        sb.append(valueOf);
        byte[] b = mo47242b();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(b, 0, b.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String valueOf2 = String.valueOf(this.f33240a);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 31);
                sb2.append("Successfully downloaded image: ");
                sb2.append(valueOf2);
            }
            return decodeByteArray;
        }
        String valueOf3 = String.valueOf(this.f33240a);
        StringBuilder sb3 = new StringBuilder(valueOf3.length() + 24);
        sb3.append("Failed to decode image: ");
        sb3.append(valueOf3);
        throw new IOException(sb3.toString());
    }

    /* renamed from: b */
    public final byte[] mo47242b() throws IOException {
        URLConnection openConnection = this.f33240a.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                this.f33242e = inputStream;
                byte[] a = v69.m53292a(v69.m53293b(inputStream, 1048577));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    String valueOf = String.valueOf(this.f33240a);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 34);
                    sb.append("Downloaded ");
                    sb.append(a.length);
                    sb.append(" bytes from ");
                    sb.append(valueOf);
                }
                if (a.length <= 1048576) {
                    return a;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                qi9.m50610a(th, th);
            }
        } else {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        throw th;
    }

    public void close() {
        try {
            f99.m44238a(this.f33242e);
        } catch (NullPointerException unused) {
        }
    }

    /* renamed from: d */
    public tl6<Bitmap> mo47244d() {
        return (tl6) cu4.m43221k(this.f33241d);
    }

    /* renamed from: e */
    public void mo47245e(Executor executor) {
        this.f33241d = jm6.m46617c(executor, new pq2(this));
    }
}
