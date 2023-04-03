package p000;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ig0 */
/* compiled from: ClearKeyUtil */
public final class ig0 {
    /* renamed from: a */
    public static byte[] m19595a(byte[] bArr) {
        if (w67.f19021a >= 27) {
            return bArr;
        }
        return w67.m29361j0(m19597c(w67.m29296B(bArr)));
    }

    /* renamed from: b */
    public static byte[] m19596b(byte[] bArr) {
        if (w67.f19021a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(w67.m29296B(bArr));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i = 0; i < jSONArray.length(); i++) {
                if (i != 0) {
                    sb.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                sb.append("{\"k\":\"");
                sb.append(m19598d(jSONObject2.getString("k")));
                sb.append("\",\"kid\":\"");
                sb.append(m19598d(jSONObject2.getString("kid")));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return w67.m29361j0(sb.toString());
        } catch (JSONException e) {
            gk3.m18127d("ClearKeyUtil", "Failed to adjust response data: " + w67.m29296B(bArr), e);
            return bArr;
        }
    }

    /* renamed from: c */
    public static String m19597c(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    /* renamed from: d */
    public static String m19598d(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
