package com.squareup.picasso;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import com.github.mikephil.charting.utils.Utils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ThreadFactory;
import okio.ByteString;

/* renamed from: com.squareup.picasso.q */
/* compiled from: Utils */
public final class C5459q {

    /* renamed from: a */
    public static final StringBuilder f26943a = new StringBuilder();

    /* renamed from: b */
    public static final ByteString f26944b = ByteString.encodeUtf8("RIFF");

    /* renamed from: c */
    public static final ByteString f26945c = ByteString.encodeUtf8("WEBP");

    /* renamed from: com.squareup.picasso.q$a */
    /* compiled from: Utils */
    public static class C5460a extends Handler {
        public C5460a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            sendMessageDelayed(obtainMessage(), 1000);
        }
    }

    /* renamed from: com.squareup.picasso.q$b */
    /* compiled from: Utils */
    public static class C5461b extends Thread {
        public C5461b(Runnable runnable) {
            super(runnable);
        }

        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    /* renamed from: com.squareup.picasso.q$c */
    /* compiled from: Utils */
    public static class C5462c implements ThreadFactory {
        public Thread newThread(Runnable runnable) {
            return new C5461b(runnable);
        }
    }

    @TargetApi(18)
    /* renamed from: a */
    public static long m41873a(File file) {
        long j;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 50;
        } catch (IllegalArgumentException unused) {
            j = 5242880;
        }
        return Math.max(Math.min(j, 52428800), 5242880);
    }

    /* renamed from: b */
    public static int m41874b(Context context) {
        boolean z;
        int i;
        ActivityManager activityManager = (ActivityManager) m41886n(context, "activity");
        if ((context.getApplicationInfo().flags & 1048576) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = activityManager.getLargeMemoryClass();
        } else {
            i = activityManager.getMemoryClass();
        }
        return (int) ((((long) i) * 1048576) / 7);
    }

    /* renamed from: c */
    public static void m41875c() {
        if (!m41889q()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    /* renamed from: d */
    public static <T> T m41876d(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: e */
    public static File m41877e(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: f */
    public static String m41878f(C5450k kVar) {
        StringBuilder sb = f26943a;
        String g = m41879g(kVar, sb);
        sb.setLength(0);
        return g;
    }

    /* renamed from: g */
    public static String m41879g(C5450k kVar, StringBuilder sb) {
        String str = kVar.f26893f;
        if (str != null) {
            sb.ensureCapacity(str.length() + 50);
            sb.append(kVar.f26893f);
        } else {
            Uri uri = kVar.f26891d;
            if (uri != null) {
                String uri2 = uri.toString();
                sb.ensureCapacity(uri2.length() + 50);
                sb.append(uri2);
            } else {
                sb.ensureCapacity(50);
                sb.append(kVar.f26892e);
            }
        }
        sb.append(10);
        if (kVar.f26901n != Utils.FLOAT_EPSILON) {
            sb.append("rotation:");
            sb.append(kVar.f26901n);
            if (kVar.f26904q) {
                sb.append('@');
                sb.append(kVar.f26902o);
                sb.append('x');
                sb.append(kVar.f26903p);
            }
            sb.append(10);
        }
        if (kVar.mo39568c()) {
            sb.append("resize:");
            sb.append(kVar.f26895h);
            sb.append('x');
            sb.append(kVar.f26896i);
            sb.append(10);
        }
        if (kVar.f26897j) {
            sb.append("centerCrop:");
            sb.append(kVar.f26898k);
            sb.append(10);
        } else if (kVar.f26899l) {
            sb.append("centerInside");
            sb.append(10);
        }
        List<lw6> list = kVar.f26894g;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append(kVar.f26894g.get(i).key());
                sb.append(10);
            }
        }
        return sb.toString();
    }

    /* renamed from: h */
    public static void m41880h(Looper looper) {
        C5460a aVar = new C5460a(looper);
        aVar.sendMessageDelayed(aVar.obtainMessage(), 1000);
    }

    /* renamed from: i */
    public static int m41881i(Bitmap bitmap) {
        int allocationByteCount = bitmap.getAllocationByteCount();
        if (allocationByteCount >= 0) {
            return allocationByteCount;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }

    /* renamed from: j */
    public static String m41882j(C5431c cVar) {
        return m41883k(cVar, "");
    }

    /* renamed from: k */
    public static String m41883k(C5431c cVar, String str) {
        StringBuilder sb = new StringBuilder(str);
        C5428a h = cVar.mo39506h();
        if (h != null) {
            sb.append(h.f26810b.mo39569d());
        }
        List<C5428a> i = cVar.mo39507i();
        if (i != null) {
            int size = i.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (i2 > 0 || h != null) {
                    sb.append(", ");
                }
                sb.append(i.get(i2).f26810b.mo39569d());
            }
        }
        return sb.toString();
    }

    /* renamed from: l */
    public static int m41884l(Resources resources, C5450k kVar) throws FileNotFoundException {
        Uri uri;
        int i = kVar.f26892e;
        if (i != 0 || (uri = kVar.f26891d) == null) {
            return i;
        }
        String authority = uri.getAuthority();
        if (authority != null) {
            List<String> pathSegments = kVar.f26891d.getPathSegments();
            if (pathSegments == null || pathSegments.isEmpty()) {
                throw new FileNotFoundException("No path segments: " + kVar.f26891d);
            } else if (pathSegments.size() == 1) {
                try {
                    return Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Last path segment is not a resource ID: " + kVar.f26891d);
                }
            } else if (pathSegments.size() == 2) {
                return resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            } else {
                throw new FileNotFoundException("More than two path segments: " + kVar.f26891d);
            }
        } else {
            throw new FileNotFoundException("No package provided: " + kVar.f26891d);
        }
    }

    /* renamed from: m */
    public static Resources m41885m(Context context, C5450k kVar) throws FileNotFoundException {
        Uri uri;
        if (kVar.f26892e != 0 || (uri = kVar.f26891d) == null) {
            return context.getResources();
        }
        String authority = uri.getAuthority();
        if (authority != null) {
            try {
                return context.getPackageManager().getResourcesForApplication(authority);
            } catch (PackageManager.NameNotFoundException unused) {
                throw new FileNotFoundException("Unable to obtain resources for package: " + kVar.f26891d);
            }
        } else {
            throw new FileNotFoundException("No package provided: " + kVar.f26891d);
        }
    }

    /* renamed from: n */
    public static <T> T m41886n(Context context, String str) {
        return context.getSystemService(str);
    }

    /* renamed from: o */
    public static boolean m41887o(Context context, String str) {
        if (context.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public static boolean m41888p(Context context) {
        try {
            if (Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0) {
                return true;
            }
            return false;
        } catch (NullPointerException | SecurityException unused) {
            return false;
        }
    }

    /* renamed from: q */
    public static boolean m41889q() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public static boolean m41890r(w40 w40) throws IOException {
        if (!w40.mo56046a0(0, f26944b) || !w40.mo56046a0(8, f26945c)) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public static void m41891s(String str, String str2, String str3) {
        m41892t(str, str2, str3, "");
    }

    /* renamed from: t */
    public static void m41892t(String str, String str2, String str3, String str4) {
        String.format("%1$-11s %2$-12s %3$s %4$s", new Object[]{str, str2, str3, str4});
    }
}
