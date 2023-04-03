package p000;

import java.util.Arrays;

/* renamed from: rj9 */
/* compiled from: com.google.mlkit:common@@18.5.0 */
public final class rj9 {

    /* renamed from: a */
    public final String f33442a;

    /* renamed from: b */
    public final jj9 f33443b;

    /* renamed from: c */
    public jj9 f33444c;

    public /* synthetic */ rj9(String str, si9 si9) {
        jj9 jj9 = new jj9((si9) null);
        this.f33443b = jj9;
        this.f33444c = jj9;
        str.getClass();
        this.f33442a = str;
    }

    /* renamed from: a */
    public final rj9 mo47420a(String str, Object obj) {
        jj9 jj9 = new jj9((si9) null);
        this.f33444c.f30509c = jj9;
        this.f33444c = jj9;
        jj9.f30508b = obj;
        jj9.f30507a = str;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f33442a);
        sb.append('{');
        jj9 jj9 = this.f33443b.f30509c;
        String str = "";
        while (jj9 != null) {
            Object obj = jj9.f30508b;
            sb.append(str);
            String str2 = jj9.f30507a;
            if (str2 != null) {
                sb.append(str2);
                sb.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append(deepToString, 1, deepToString.length() - 1);
            }
            jj9 = jj9.f30509c;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
