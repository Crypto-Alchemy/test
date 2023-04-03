package p000;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: gd4 */
/* compiled from: OSInAppMessageTag */
public class gd4 {

    /* renamed from: a */
    public JSONObject f29182a;

    /* renamed from: b */
    public JSONArray f29183b;

    public gd4(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        JSONArray jSONArray = null;
        if (jSONObject.has("adds")) {
            jSONObject2 = jSONObject.getJSONObject("adds");
        } else {
            jSONObject2 = null;
        }
        this.f29182a = jSONObject2;
        this.f29183b = jSONObject.has("removes") ? jSONObject.getJSONArray("removes") : jSONArray;
    }

    /* renamed from: a */
    public JSONObject mo42871a() {
        return this.f29182a;
    }

    /* renamed from: b */
    public JSONArray mo42872b() {
        return this.f29183b;
    }

    public String toString() {
        return "OSInAppMessageTag{adds=" + this.f29182a + ", removes=" + this.f29183b + '}';
    }
}
