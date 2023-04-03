package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;

/* renamed from: zh2 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class zh2 {

    /* renamed from: a */
    public static final int f36159a = mi2.f31711a;

    /* renamed from: b */
    public static final zh2 f36160b = new zh2();

    /* renamed from: h */
    public static zh2 m55108h() {
        return f36160b;
    }

    /* renamed from: a */
    public void mo49849a(Context context) {
        mi2.m48306a(context);
    }

    /* renamed from: b */
    public int mo49850b(Context context) {
        return mi2.m48307b(context);
    }

    @Deprecated
    /* renamed from: c */
    public Intent mo49851c(int i) {
        return mo49666d((Context) null, i, (String) null);
    }

    /* renamed from: d */
    public Intent mo49666d(Context context, int i, String str) {
        if (i == 1 || i == 2) {
            if (context != null && le1.m47792d(context)) {
                return pi9.m49971a();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("gcore_");
            sb.append(f36159a);
            sb.append("-");
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
            }
            sb.append("-");
            if (context != null) {
                sb.append(context.getPackageName());
            }
            sb.append("-");
            if (context != null) {
                try {
                    sb.append(tn7.m52384a(context).mo45811e(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            return pi9.m49972b("com.google.android.gms", sb.toString());
        } else if (i != 3) {
            return null;
        } else {
            return pi9.m49973c("com.google.android.gms");
        }
    }

    /* renamed from: e */
    public PendingIntent mo49667e(Context context, int i, int i2) {
        return mo49852f(context, i, i2, (String) null);
    }

    /* renamed from: f */
    public PendingIntent mo49852f(Context context, int i, int i2, String str) {
        Intent d = mo49666d(context, i, str);
        if (d == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, d, di8.f28194a | 134217728);
    }

    /* renamed from: g */
    public String mo49668g(int i) {
        return mi2.m48308c(i);
    }

    /* renamed from: i */
    public int mo49669i(Context context) {
        return mo49670j(context, f36159a);
    }

    /* renamed from: j */
    public int mo49670j(Context context, int i) {
        int g = mi2.m48312g(context, i);
        if (mi2.m48313h(context, g)) {
            return 18;
        }
        return g;
    }

    /* renamed from: k */
    public boolean mo49853k(Context context, int i) {
        return mi2.m48313h(context, i);
    }

    /* renamed from: l */
    public boolean mo49854l(Context context, String str) {
        return mi2.m48317l(context, str);
    }

    /* renamed from: m */
    public boolean mo49671m(int i) {
        return mi2.m48315j(i);
    }
}
