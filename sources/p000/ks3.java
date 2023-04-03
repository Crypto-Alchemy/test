package p000;

import com.facebook.common.internal.ImmutableMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: ks3 */
/* compiled from: MediaUtils */
public class ks3 {

    /* renamed from: a */
    public static final Map<String, String> f14298a = ImmutableMap.m13302of("mkv", "video/x-matroska", "glb", "model/gltf-binary");

    /* renamed from: a */
    public static String m21025a(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf < 0 || lastIndexOf == str.length() - 1) {
            return null;
        }
        return str.substring(lastIndexOf + 1);
    }

    /* renamed from: b */
    public static String m21026b(String str) {
        String a = m21025a(str);
        if (a == null) {
            return null;
        }
        String lowerCase = a.toLowerCase(Locale.US);
        String a2 = uv3.m28433a(lowerCase);
        if (a2 == null) {
            return f14298a.get(lowerCase);
        }
        return a2;
    }

    /* renamed from: c */
    public static boolean m21027c(String str) {
        if (str == null || !str.startsWith("video/")) {
            return false;
        }
        return true;
    }
}
