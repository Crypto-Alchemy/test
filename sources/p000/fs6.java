package p000;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: fs6 */
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final class fs6 {

    /* renamed from: d */
    public static final Pattern f28952d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a */
    public final String f28953a;

    /* renamed from: b */
    public final String f28954b;

    /* renamed from: c */
    public final String f28955c;

    public fs6(String str, String str2) {
        this.f28953a = m44383d(str2, str);
        this.f28954b = str;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("!");
        sb.append(str2);
        this.f28955c = sb.toString();
    }

    /* renamed from: a */
    public static fs6 m44382a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new fs6(split[0], split[1]);
    }

    /* renamed from: d */
    public static String m44383d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", new Object[]{str2});
            str = str.substring(8);
        }
        if (str != null && f28952d.matcher(str).matches()) {
            return str;
        }
        throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", new Object[]{str, "[a-zA-Z0-9-_.~%]{1,900}"}));
    }

    /* renamed from: b */
    public String mo42652b() {
        return this.f28954b;
    }

    /* renamed from: c */
    public String mo42653c() {
        return this.f28953a;
    }

    /* renamed from: e */
    public String mo42654e() {
        return this.f28955c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof fs6)) {
            return false;
        }
        fs6 fs6 = (fs6) obj;
        if (!this.f28953a.equals(fs6.f28953a) || !this.f28954b.equals(fs6.f28954b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return if4.m45710b(this.f28954b, this.f28953a);
    }
}
