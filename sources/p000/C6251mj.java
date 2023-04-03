package p000;

import android.annotation.TargetApi;
import android.app.Activity;

@TargetApi(23)
/* renamed from: mj */
/* compiled from: AndroidSupportV4Compat */
public class C6251mj {
    /* renamed from: a */
    public static void m48323a(Activity activity, String[] strArr, int i) {
        if (activity instanceof C6317oj) {
            ((C6317oj) activity).validateRequestPermissionsRequestCode(i);
        }
        activity.requestPermissions(strArr, i);
    }

    /* renamed from: b */
    public static boolean m48324b(Activity activity, String str) {
        return C3582x9.m29965w(activity, str);
    }
}
