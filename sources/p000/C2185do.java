package p000;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

/* renamed from: do */
/* compiled from: AppOpsManagerCompat */
public final class C2185do {

    /* renamed from: do$a */
    /* compiled from: AppOpsManagerCompat */
    public static class C2186a {
        /* renamed from: a */
        public static <T> T m15238a(Context context, Class<T> cls) {
            return context.getSystemService(cls);
        }

        /* renamed from: b */
        public static int m15239b(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOp(str, str2);
        }

        /* renamed from: c */
        public static int m15240c(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        /* renamed from: d */
        public static String m15241d(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    /* renamed from: do$b */
    /* compiled from: AppOpsManagerCompat */
    public static class C2187b {
        /* renamed from: a */
        public static int m15242a(AppOpsManager appOpsManager, String str, int i, String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i, str2);
        }

        /* renamed from: b */
        public static String m15243b(Context context) {
            return context.getOpPackageName();
        }

        /* renamed from: c */
        public static AppOpsManager m15244c(Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    /* renamed from: a */
    public static int m15235a(Context context, int i, String str, String str2) {
        if (Build.VERSION.SDK_INT < 29) {
            return m15236b(context, str, str2);
        }
        AppOpsManager c = C2187b.m15244c(context);
        int a = C2187b.m15242a(c, str, Binder.getCallingUid(), str2);
        if (a != 0) {
            return a;
        }
        return C2187b.m15242a(c, str, i, C2187b.m15243b(context));
    }

    /* renamed from: b */
    public static int m15236b(Context context, String str, String str2) {
        return C2186a.m15240c((AppOpsManager) C2186a.m15238a(context, AppOpsManager.class), str, str2);
    }

    /* renamed from: c */
    public static String m15237c(String str) {
        return C2186a.m15241d(str);
    }
}
