package p000;

import android.net.Uri;
import java.util.Map;

/* renamed from: jw8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class jw8 {

    /* renamed from: a */
    public final Map<String, Map<String, String>> f30656a;

    public jw8(Map<String, Map<String, String>> map) {
        this.f30656a = map;
    }

    /* renamed from: a */
    public final String mo44625a(Uri uri, String str, String str2, String str3) {
        Map map;
        String str4;
        if (uri == null || (map = this.f30656a.get(uri.toString())) == null) {
            return null;
        }
        String valueOf = String.valueOf(str3);
        if (valueOf.length() != 0) {
            str4 = "".concat(valueOf);
        } else {
            str4 = new String("");
        }
        return (String) map.get(str4);
    }
}
