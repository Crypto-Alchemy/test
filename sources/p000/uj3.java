package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: uj3 */
/* compiled from: LocaleListCompatWrapper */
public final class uj3 implements wj3 {

    /* renamed from: c */
    public static final Locale[] f18509c = new Locale[0];

    /* renamed from: d */
    public static final Locale f18510d = new Locale("en", "XA");

    /* renamed from: e */
    public static final Locale f18511e = new Locale("ar", "XB");

    /* renamed from: f */
    public static final Locale f18512f = tj3.m27771b("en-Latn");

    /* renamed from: a */
    public final Locale[] f18513a;

    /* renamed from: b */
    public final String f18514b;

    public uj3(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f18513a = f18509c;
            this.f18514b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < localeArr.length) {
            Locale locale = localeArr[i];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    m28316b(sb, locale2);
                    if (i < localeArr.length - 1) {
                        sb.append(',');
                    }
                    hashSet.add(locale2);
                }
                i++;
            } else {
                throw new NullPointerException("list[" + i + "] is null");
            }
        }
        this.f18513a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f18514b = sb.toString();
    }

    /* renamed from: b */
    public static void m28316b(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country != null && !country.isEmpty()) {
            sb.append('-');
            sb.append(locale.getCountry());
        }
    }

    /* renamed from: a */
    public Object mo26805a() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uj3)) {
            return false;
        }
        Locale[] localeArr = ((uj3) obj).f18513a;
        if (this.f18513a.length != localeArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            Locale[] localeArr2 = this.f18513a;
            if (i >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
            i++;
        }
    }

    public Locale get(int i) {
        if (i >= 0) {
            Locale[] localeArr = this.f18513a;
            if (i < localeArr.length) {
                return localeArr[i];
            }
        }
        return null;
    }

    public int hashCode() {
        int i = 1;
        for (Locale hashCode : this.f18513a) {
            i = (i * 31) + hashCode.hashCode();
        }
        return i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f18513a;
            if (i < localeArr.length) {
                sb.append(localeArr[i]);
                if (i < this.f18513a.length - 1) {
                    sb.append(',');
                }
                i++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
