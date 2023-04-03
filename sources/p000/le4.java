package p000;

import com.onesignal.OSSubscriptionState;
import org.json.JSONObject;

/* renamed from: le4 */
/* compiled from: OSSubscriptionStateChanges */
public class le4 {

    /* renamed from: a */
    public OSSubscriptionState f31296a;

    /* renamed from: b */
    public OSSubscriptionState f31297b;

    public le4(OSSubscriptionState oSSubscriptionState, OSSubscriptionState oSSubscriptionState2) {
        this.f31296a = oSSubscriptionState;
        this.f31297b = oSSubscriptionState2;
    }

    /* renamed from: a */
    public JSONObject mo45427a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", this.f31296a.mo38547j());
            jSONObject.put("to", this.f31297b.mo38547j());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return mo45427a().toString();
    }
}
