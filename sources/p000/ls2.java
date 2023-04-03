package p000;

import org.json.JSONObject;

/* renamed from: ls2 */
/* compiled from: ImmutableJSONObject */
public class ls2 {

    /* renamed from: a */
    public final JSONObject f31390a;

    public ls2() {
        this.f31390a = new JSONObject();
    }

    /* renamed from: a */
    public boolean mo45505a(String str) {
        return this.f31390a.has(str);
    }

    /* renamed from: b */
    public boolean mo45506b(String str) {
        return this.f31390a.optBoolean(str);
    }

    /* renamed from: c */
    public boolean mo45507c(String str, boolean z) {
        return this.f31390a.optBoolean(str, z);
    }

    /* renamed from: d */
    public int mo45508d(String str, int i) {
        return this.f31390a.optInt(str, i);
    }

    /* renamed from: e */
    public JSONObject mo45509e(String str) {
        return this.f31390a.optJSONObject(str);
    }

    /* renamed from: f */
    public String mo45510f(String str) {
        return this.f31390a.optString(str);
    }

    /* renamed from: g */
    public String mo45511g(String str, String str2) {
        return this.f31390a.optString(str, str2);
    }

    public String toString() {
        return "ImmutableJSONObject{jsonObject=" + this.f31390a + '}';
    }

    public ls2(JSONObject jSONObject) {
        this.f31390a = jSONObject;
    }
}
