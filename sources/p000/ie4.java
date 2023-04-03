package p000;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ie4 */
/* compiled from: OSSMSSubscriptionStateChanges */
public class ie4 {

    /* renamed from: a */
    public he4 f29905a;

    /* renamed from: b */
    public he4 f29906b;

    public ie4(he4 he4, he4 he42) {
        this.f29905a = he4;
        this.f29906b = he42;
    }

    /* renamed from: a */
    public JSONObject mo43578a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", this.f29905a.mo43174g());
            jSONObject.put("to", this.f29906b.mo43174g());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return mo43578a().toString();
    }
}
