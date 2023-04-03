package p000;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import androidx.work.C1515a;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: sv4 */
/* compiled from: ProcessUtils */
public class sv4 {

    /* renamed from: a */
    public static final String f17814a = qk3.m25728f("ProcessUtils");

    @SuppressLint({"PrivateApi", "DiscouragedPrivateApi"})
    /* renamed from: a */
    public static String m27136a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, sv4.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke((Object) null, new Object[0]);
            if (invoke instanceof String) {
                return (String) invoke;
            }
        } catch (Throwable th) {
            qk3.m25726c().mo25135a(f17814a, "Unable to check ActivityThread for processName", th);
        }
        int myPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (!(activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null || runningAppProcesses.isEmpty())) {
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next.pid == myPid) {
                    return next.processName;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m27137b(Context context, C1515a aVar) {
        String a = m27136a(context);
        if (!TextUtils.isEmpty(aVar.mo10907c())) {
            return TextUtils.equals(a, aVar.mo10907c());
        }
        return TextUtils.equals(a, context.getApplicationInfo().processName);
    }
}
