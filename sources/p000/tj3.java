package p000;

import android.os.Build;
import android.p001os.LocaleList;
import java.util.Locale;

/* renamed from: tj3 */
/* compiled from: LocaleListCompat */
public final class tj3 {

    /* renamed from: b */
    public static final tj3 f18158b = m27770a(new Locale[0]);

    /* renamed from: a */
    public final wj3 f18159a;

    /* renamed from: tj3$a */
    /* compiled from: LocaleListCompat */
    public static class C3365a {
        /* renamed from: a */
        public static LocaleList m27774a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        /* renamed from: b */
        public static LocaleList m27775b() {
            return LocaleList.getAdjustedDefault();
        }

        /* renamed from: c */
        public static LocaleList m27776c() {
            return LocaleList.getDefault();
        }
    }

    public tj3(wj3 wj3) {
        this.f18159a = wj3;
    }

    /* renamed from: a */
    public static tj3 m27770a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return m27772d(C3365a.m27774a(localeArr));
        }
        return new tj3(new uj3(localeArr));
    }

    /* renamed from: b */
    public static Locale m27771b(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else if (!str.contains("_")) {
            return new Locale(str);
        } else {
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    /* renamed from: d */
    public static tj3 m27772d(LocaleList localeList) {
        return new tj3(new xj3(localeList));
    }

    /* renamed from: c */
    public Locale mo26464c(int i) {
        return this.f18159a.get(i);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof tj3) || !this.f18159a.equals(((tj3) obj).f18159a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f18159a.hashCode();
    }

    public String toString() {
        return this.f18159a.toString();
    }
}
