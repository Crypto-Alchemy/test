package p000;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;

/* renamed from: ry8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class ry8 {
    /* renamed from: a */
    public static String m51436a(Context context, String str, String str2) {
        cu4.m43221k(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str2)) {
            str2 = sq8.m51887a(context);
        }
        return sq8.m51888b("google_app_id", resources, str2);
    }

    /* renamed from: b */
    public static String m51437b(String str, String[] strArr, String[] strArr2) {
        cu4.m43221k(strArr);
        cu4.m43221k(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i];
            }
        }
        return null;
    }
}
