package p000;

import com.fasterxml.jackson.core.Version;
import java.util.regex.Pattern;

/* renamed from: c97 */
/* compiled from: VersionUtil */
public class c97 {

    /* renamed from: a */
    public static final Pattern f8371a = Pattern.compile("[-_./;:]");

    /* renamed from: a */
    public static Version m11759a(String str, String str2, String str3) {
        int i;
        String str4;
        if (str != null) {
            String trim = str.trim();
            if (trim.length() > 0) {
                String[] split = f8371a.split(trim);
                int i2 = 0;
                int b = m11760b(split[0]);
                if (split.length > 1) {
                    i = m11760b(split[1]);
                } else {
                    i = 0;
                }
                if (split.length > 2) {
                    i2 = m11760b(split[2]);
                }
                int i3 = i2;
                if (split.length > 3) {
                    str4 = split[3];
                } else {
                    str4 = null;
                }
                return new Version(b, i, i3, str4, str2, str3);
            }
        }
        return Version.unknownVersion();
    }

    /* renamed from: b */
    public static int m11760b(String str) {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt > '9' || charAt < '0') {
                break;
            }
            i = (i * 10) + (charAt - '0');
        }
        return i;
    }

    /* renamed from: c */
    public static final void m11761c() {
        throw new RuntimeException("Internal error: this code path should never get executed");
    }
}
