package p000;

import java.util.HashMap;

/* renamed from: tn3 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class tn3 {
    /* renamed from: a */
    public static void m52382a(StringBuilder sb, HashMap<String, String> hashMap) {
        sb.append("{");
        boolean z = true;
        for (String next : hashMap.keySet()) {
            if (!z) {
                sb.append(",");
            }
            String str = hashMap.get(next);
            sb.append("\"");
            sb.append(next);
            sb.append("\":");
            if (str == null) {
                sb.append("null");
            } else {
                sb.append("\"");
                sb.append(str);
                sb.append("\"");
            }
            z = false;
        }
        sb.append("}");
    }
}
