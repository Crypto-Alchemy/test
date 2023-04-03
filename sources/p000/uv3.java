package p000;

import android.webkit.MimeTypeMap;
import com.facebook.common.internal.ImmutableMap;
import java.util.Map;

/* renamed from: uv3 */
/* compiled from: MimeTypeMapWrapper */
public class uv3 {

    /* renamed from: a */
    public static final MimeTypeMap f18584a = MimeTypeMap.getSingleton();

    /* renamed from: b */
    public static final Map<String, String> f18585b = ImmutableMap.m13302of("image/heif", "heif", "image/heic", "heic");

    /* renamed from: c */
    public static final Map<String, String> f18586c = ImmutableMap.m13302of("heif", "image/heif", "heic", "image/heic");

    /* renamed from: a */
    public static String m28433a(String str) {
        String str2 = f18586c.get(str);
        if (str2 != null) {
            return str2;
        }
        return f18584a.getMimeTypeFromExtension(str);
    }
}
