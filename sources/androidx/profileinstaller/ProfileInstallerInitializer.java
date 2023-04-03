package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ProfileInstallerInitializer implements fu2<C1212c> {

    /* renamed from: androidx.profileinstaller.ProfileInstallerInitializer$a */
    public static class C1210a {
        /* renamed from: c */
        public static void m8624c(Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new jw4(runnable));
        }
    }

    /* renamed from: androidx.profileinstaller.ProfileInstallerInitializer$b */
    public static class C1211b {
        /* renamed from: a */
        public static Handler m8625a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* renamed from: androidx.profileinstaller.ProfileInstallerInitializer$c */
    public static class C1212c {
    }

    /* renamed from: l */
    public static void m8616l(Context context) {
        new ThreadPoolExecutor(0, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new iw4(context));
    }

    /* renamed from: a */
    public List<Class<? extends fu2<?>>> mo5598a() {
        return Collections.emptyList();
    }

    /* renamed from: f */
    public C1212c mo5599b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new C1212c();
        }
        mo8810g(context.getApplicationContext());
        return new C1212c();
    }

    /* renamed from: g */
    public void mo8810g(Context context) {
        C1210a.m8624c(new gw4(this, context));
    }

    /* renamed from: h */
    public void m8613i(Context context) {
        Handler handler;
        if (Build.VERSION.SDK_INT >= 28) {
            handler = C1211b.m8625a(Looper.getMainLooper());
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.postDelayed(new hw4(context), (long) (new Random().nextInt(Math.max(1000, 1)) + 5000));
    }
}
