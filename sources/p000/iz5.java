package p000;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: iz5 */
/* compiled from: SettingsJsonParser */
public class iz5 {

    /* renamed from: a */
    public final mx0 f30172a;

    public iz5(mx0 mx0) {
        this.f30172a = mx0;
    }

    /* renamed from: a */
    public static jz5 m46064a(int i) {
        if (i != 3) {
            return new w91();
        }
        return new mz5();
    }

    /* renamed from: b */
    public zy5 mo43984b(JSONObject jSONObject) throws JSONException {
        return m46064a(jSONObject.getInt("settings_version")).mo44632a(this.f30172a, jSONObject);
    }
}
