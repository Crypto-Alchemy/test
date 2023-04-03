package p000;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: yc4 */
/* compiled from: OSEmailSubscriptionStateChanges */
public class yc4 {

    /* renamed from: a */
    public xc4 f35847a;

    /* renamed from: b */
    public xc4 f35848b;

    public yc4(xc4 xc4, xc4 xc42) {
        this.f35847a = xc4;
        this.f35848b = xc42;
    }

    /* renamed from: a */
    public JSONObject mo49629a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", this.f35847a.mo49449g());
            jSONObject.put("to", this.f35848b.mo49449g());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return mo49629a().toString();
    }
}
