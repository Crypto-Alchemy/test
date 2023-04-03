package p000;

import java.util.Locale;

/* renamed from: de3 */
/* compiled from: LanguageProviderDevice */
public class de3 implements be3 {
    /* renamed from: a */
    public String mo29559a() {
        String language = Locale.getDefault().getLanguage();
        language.hashCode();
        char c = 65535;
        switch (language.hashCode()) {
            case 3365:
                if (language.equals("in")) {
                    c = 0;
                    break;
                }
                break;
            case 3374:
                if (language.equals("iw")) {
                    c = 1;
                    break;
                }
                break;
            case 3391:
                if (language.equals("ji")) {
                    c = 2;
                    break;
                }
                break;
            case 3886:
                if (language.equals("zh")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "id";
            case 1:
                return "he";
            case 2:
                return "yi";
            case 3:
                return language + "-" + Locale.getDefault().getCountry();
            default:
                return language;
        }
    }
}
