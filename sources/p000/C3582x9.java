package p000;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: x9 */
/* compiled from: ActivityCompat */
public class C3582x9 extends zr0 {

    /* renamed from: c */
    public static C3587e f19495c;

    /* renamed from: x9$a */
    /* compiled from: ActivityCompat */
    public static class C3583a {
        /* renamed from: a */
        public static void m29969a(Activity activity) {
            activity.finishAffinity();
        }

        /* renamed from: b */
        public static void m29970b(Activity activity, Intent intent, int i, Bundle bundle) {
            activity.startActivityForResult(intent, i, bundle);
        }

        /* renamed from: c */
        public static void m29971c(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    /* renamed from: x9$b */
    /* compiled from: ActivityCompat */
    public static class C3584b {
        /* renamed from: a */
        public static void m29972a(Activity activity) {
            activity.finishAfterTransition();
        }

        /* renamed from: b */
        public static void m29973b(Activity activity) {
            activity.postponeEnterTransition();
        }

        /* renamed from: c */
        public static void m29974c(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        /* renamed from: d */
        public static void m29975d(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        /* renamed from: e */
        public static void m29976e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    /* renamed from: x9$c */
    /* compiled from: ActivityCompat */
    public static class C3585c {
        /* renamed from: a */
        public static void m29977a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        /* renamed from: b */
        public static void m29978b(Activity activity, String[] strArr, int i) {
            activity.requestPermissions(strArr, i);
        }

        /* renamed from: c */
        public static boolean m29979c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* renamed from: x9$d */
    /* compiled from: ActivityCompat */
    public static class C3586d {
        /* renamed from: a */
        public static <T> T m29980a(Activity activity, int i) {
            return activity.requireViewById(i);
        }
    }

    /* renamed from: x9$e */
    /* compiled from: ActivityCompat */
    public interface C3587e {
        /* renamed from: a */
        boolean mo27701a(Activity activity, String[] strArr, int i);
    }

    /* renamed from: x9$f */
    /* compiled from: ActivityCompat */
    public interface C3588f {
        void validateRequestPermissionsRequestCode(int i);
    }

    /* renamed from: n */
    public static void m29956n(Activity activity) {
        C3583a.m29969a(activity);
    }

    /* renamed from: o */
    public static void m29957o(Activity activity) {
        C3584b.m29972a(activity);
    }

    /* renamed from: p */
    public static /* synthetic */ void m29958p(Activity activity) {
        if (!activity.isFinishing() && !C3045pa.m24781i(activity)) {
            activity.recreate();
        }
    }

    /* renamed from: q */
    public static void m29959q(Activity activity) {
        C3584b.m29973b(activity);
    }

    /* renamed from: r */
    public static void m29960r(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new C3528w9(activity));
        }
    }

    /* renamed from: s */
    public static void m29961s(Activity activity, String[] strArr, int i) {
        String[] strArr2;
        C3587e eVar = f19495c;
        if (eVar == null || !eVar.mo27701a(activity, strArr, i)) {
            HashSet hashSet = new HashSet();
            int i2 = 0;
            while (i2 < strArr.length) {
                if (!TextUtils.isEmpty(strArr[i2])) {
                    if (!x40.m29875d() && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                        hashSet.add(Integer.valueOf(i2));
                    }
                    i2++;
                } else {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
            }
            int size = hashSet.size();
            if (size > 0) {
                strArr2 = new String[(strArr.length - size)];
            } else {
                strArr2 = strArr;
            }
            if (size > 0) {
                if (size != strArr.length) {
                    int i3 = 0;
                    for (int i4 = 0; i4 < strArr.length; i4++) {
                        if (!hashSet.contains(Integer.valueOf(i4))) {
                            strArr2[i3] = strArr[i4];
                            i3++;
                        }
                    }
                } else {
                    return;
                }
            }
            if (activity instanceof C3588f) {
                ((C3588f) activity).validateRequestPermissionsRequestCode(i);
            }
            C3585c.m29978b(activity, strArr, i);
        }
    }

    /* renamed from: t */
    public static <T extends View> T m29962t(Activity activity, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (View) C3586d.m29980a(activity, i);
        }
        T findViewById = activity.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }

    /* renamed from: u */
    public static void m29963u(Activity activity, wz5 wz5) {
        C3584b.m29974c(activity, (SharedElementCallback) null);
    }

    /* renamed from: v */
    public static void m29964v(Activity activity, wz5 wz5) {
        C3584b.m29975d(activity, (SharedElementCallback) null);
    }

    /* renamed from: w */
    public static boolean m29965w(Activity activity, String str) {
        if (x40.m29875d() || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return C3585c.m29979c(activity, str);
        }
        return false;
    }

    /* renamed from: x */
    public static void m29966x(Activity activity, Intent intent, int i, Bundle bundle) {
        C3583a.m29970b(activity, intent, i, bundle);
    }

    /* renamed from: y */
    public static void m29967y(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        C3583a.m29971c(activity, intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* renamed from: z */
    public static void m29968z(Activity activity) {
        C3584b.m29976e(activity);
    }
}
