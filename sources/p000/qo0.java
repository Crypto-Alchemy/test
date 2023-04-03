package p000;

import android.content.res.Configuration;
import android.os.Build;
import android.p001os.LocaleList;

/* renamed from: qo0 */
/* compiled from: ConfigurationCompat */
public final class qo0 {

    /* renamed from: qo0$a */
    /* compiled from: ConfigurationCompat */
    public static class C3158a {
        /* renamed from: a */
        public static LocaleList m25804a(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    /* renamed from: a */
    public static tj3 m25803a(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return tj3.m27772d(C3158a.m25804a(configuration));
        }
        return tj3.m27770a(configuration.locale);
    }
}
