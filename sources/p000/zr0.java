package p000;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import java.io.File;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: zr0 */
/* compiled from: ContextCompat */
public class zr0 {

    /* renamed from: a */
    public static final Object f20657a = new Object();

    /* renamed from: b */
    public static final Object f20658b = new Object();

    /* renamed from: zr0$a */
    /* compiled from: ContextCompat */
    public static class C3751a {
        /* renamed from: a */
        public static void m31450a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        /* renamed from: b */
        public static void m31451b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* renamed from: zr0$b */
    /* compiled from: ContextCompat */
    public static class C3752b {
        /* renamed from: a */
        public static File[] m31452a(Context context) {
            return context.getExternalCacheDirs();
        }

        /* renamed from: b */
        public static File[] m31453b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        /* renamed from: c */
        public static File[] m31454c(Context context) {
            return context.getObbDirs();
        }
    }

    /* renamed from: zr0$c */
    /* compiled from: ContextCompat */
    public static class C3753c {
        /* renamed from: a */
        public static File m31455a(Context context) {
            return context.getCodeCacheDir();
        }

        /* renamed from: b */
        public static Drawable m31456b(Context context, int i) {
            return context.getDrawable(i);
        }

        /* renamed from: c */
        public static File m31457c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* renamed from: zr0$d */
    /* compiled from: ContextCompat */
    public static class C3754d {
        /* renamed from: a */
        public static int m31458a(Context context, int i) {
            return context.getColor(i);
        }

        /* renamed from: b */
        public static <T> T m31459b(Context context, Class<T> cls) {
            return context.getSystemService(cls);
        }

        /* renamed from: c */
        public static String m31460c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* renamed from: zr0$e */
    /* compiled from: ContextCompat */
    public static class C3755e {
        /* renamed from: a */
        public static Context m31461a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        /* renamed from: b */
        public static File m31462b(Context context) {
            return context.getDataDir();
        }

        /* renamed from: c */
        public static boolean m31463c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* renamed from: zr0$f */
    /* compiled from: ContextCompat */
    public static class C3756f {
        /* renamed from: a */
        public static Intent m31464a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
            if ((i & 4) != 0 && str == null) {
                return context.registerReceiver(broadcastReceiver, intentFilter, zr0.m31446i(context), handler);
            }
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i & 1);
        }

        /* renamed from: b */
        public static ComponentName m31465b(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    /* renamed from: a */
    public static int m31438a(Context context, String str) {
        mf4.m22286d(str, "permission must be non-null");
        if (x40.m29875d() || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        if (qb4.m25577d(context).mo25049a()) {
            return 0;
        }
        return -1;
    }

    /* renamed from: b */
    public static Context m31439b(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C3755e.m31461a(context);
        }
        return null;
    }

    /* renamed from: c */
    public static int m31440c(Context context, int i) {
        return C3754d.m31458a(context, i);
    }

    /* renamed from: d */
    public static ColorStateList m31441d(Context context, int i) {
        return uf5.m28222e(context.getResources(), i, context.getTheme());
    }

    /* renamed from: e */
    public static Drawable m31442e(Context context, int i) {
        return C3753c.m31456b(context, i);
    }

    /* renamed from: f */
    public static File[] m31443f(Context context) {
        return C3752b.m31452a(context);
    }

    /* renamed from: g */
    public static File[] m31444g(Context context, String str) {
        return C3752b.m31453b(context, str);
    }

    /* renamed from: h */
    public static File m31445h(Context context) {
        return C3753c.m31457c(context);
    }

    /* renamed from: i */
    public static String m31446i(Context context) {
        String str = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (kn4.m20930c(context, str) == 0) {
            return str;
        }
        throw new RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    /* renamed from: j */
    public static boolean m31447j(Context context, Intent[] intentArr, Bundle bundle) {
        C3751a.m31450a(context, intentArr, bundle);
        return true;
    }

    /* renamed from: k */
    public static void m31448k(Context context, Intent intent, Bundle bundle) {
        C3751a.m31451b(context, intent, bundle);
    }

    /* renamed from: l */
    public static void m31449l(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            C3756f.m31465b(context, intent);
        } else {
            context.startService(intent);
        }
    }
}
