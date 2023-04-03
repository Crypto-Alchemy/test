package p000;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;

/* renamed from: q44 */
/* compiled from: NavUtils */
public final class q44 {

    /* renamed from: q44$a */
    /* compiled from: NavUtils */
    public static class C3121a {
        /* renamed from: a */
        public static Intent m25392a(Activity activity) {
            return activity.getParentActivityIntent();
        }

        /* renamed from: b */
        public static boolean m25393b(Activity activity, Intent intent) {
            return activity.navigateUpTo(intent);
        }

        /* renamed from: c */
        public static boolean m25394c(Activity activity, Intent intent) {
            return activity.shouldUpRecreateTask(intent);
        }
    }

    /* renamed from: a */
    public static Intent m25386a(Activity activity) {
        Intent a = C3121a.m25392a(activity);
        if (a != null) {
            return a;
        }
        String c = m25388c(activity);
        if (c == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, c);
        try {
            if (m25389d(activity, componentName) == null) {
                return Intent.makeMainActivity(componentName);
            }
            return new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("getParentActivityIntent: bad parentActivityName '");
            sb.append(c);
            sb.append("' in manifest");
            return null;
        }
    }

    /* renamed from: b */
    public static Intent m25387b(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String d = m25389d(context, componentName);
        if (d == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), d);
        if (m25389d(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    /* renamed from: c */
    public static String m25388c(Activity activity) {
        try {
            return m25389d(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: d */
    public static String m25389d(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i = Build.VERSION.SDK_INT;
        int i2 = 640;
        if (i >= 29) {
            i2 = 269222528;
        } else if (i >= 24) {
            i2 = 787072;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i2);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    /* renamed from: e */
    public static void m25390e(Activity activity, Intent intent) {
        C3121a.m25393b(activity, intent);
    }

    /* renamed from: f */
    public static boolean m25391f(Activity activity, Intent intent) {
        return C3121a.m25394c(activity, intent);
    }
}
