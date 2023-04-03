package p000;

import com.github.mikephil.charting.utils.Utils;
import org.json.JSONException;
import org.json.JSONObject;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: cd4 */
/* compiled from: OSInAppMessageOutcome */
public class cd4 {

    /* renamed from: a */
    public String f21692a;

    /* renamed from: b */
    public float f21693b;

    /* renamed from: c */
    public boolean f21694c;

    public cd4(JSONObject jSONObject) throws JSONException {
        float f;
        boolean z;
        this.f21692a = jSONObject.getString(PublicResolver.FUNC_NAME);
        if (jSONObject.has("weight")) {
            f = (float) jSONObject.getDouble("weight");
        } else {
            f = Utils.FLOAT_EPSILON;
        }
        this.f21693b = f;
        if (!jSONObject.has("unique") || !jSONObject.getBoolean("unique")) {
            z = false;
        } else {
            z = true;
        }
        this.f21694c = z;
    }

    /* renamed from: a */
    public String mo29940a() {
        return this.f21692a;
    }

    /* renamed from: b */
    public float mo29941b() {
        return this.f21693b;
    }

    /* renamed from: c */
    public boolean mo29942c() {
        return this.f21694c;
    }

    public String toString() {
        return "OSInAppMessageOutcome{name='" + this.f21692a + '\'' + ", weight=" + this.f21693b + ", unique=" + this.f21694c + '}';
    }
}
