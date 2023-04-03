package p000;

import com.onesignal.C5292m0;
import org.json.JSONObject;

/* renamed from: ge4 */
/* compiled from: OSPermissionStateChanges */
public class ge4 {

    /* renamed from: a */
    public C5292m0 f29186a;

    /* renamed from: b */
    public C5292m0 f29187b;

    public ge4(C5292m0 m0Var, C5292m0 m0Var2) {
        this.f29186a = m0Var;
        this.f29187b = m0Var2;
    }

    /* renamed from: a */
    public JSONObject mo42883a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", this.f29186a.mo38991h());
            jSONObject.put("to", this.f29187b.mo38991h());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return mo42883a().toString();
    }
}
