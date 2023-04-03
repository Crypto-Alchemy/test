package p000;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import java.util.Locale;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\f\u0010\t\u001a\u00020\b*\u00020\u0007H\u0000¨\u0006\n"}, mo44877d2 = {"Landroid/content/res/Configuration;", "Ljava/util/Locale;", "a", "", "versionCode", "", "b", "Landroid/app/Activity;", "Lr37;", "c", "com.yariksoffice.lingver.library"}, mo44878k = 2, mo44879mv = {1, 4, 0})
/* renamed from: by1 */
/* compiled from: Extensions.kt */
public final class by1 {
    /* renamed from: a */
    public static final Locale m32791a(Configuration configuration) {
        Locale locale;
        String str;
        vx2.m53592h(configuration, "$this$getLocaleCompat");
        if (m32792b(24)) {
            locale = configuration.getLocales().get(0);
            str = "locales.get(0)";
        } else {
            locale = configuration.locale;
            str = "locale";
        }
        vx2.m53587c(locale, str);
        return locale;
    }

    /* renamed from: b */
    public static final boolean m32792b(int i) {
        if (Build.VERSION.SDK_INT >= i) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final void m32793c(Activity activity) {
        vx2.m53592h(activity, "$this$resetTitle");
        try {
            int i = activity.getPackageManager().getActivityInfo(activity.getComponentName(), 128).labelRes;
            if (i != 0) {
                activity.setTitle(i);
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }
}
