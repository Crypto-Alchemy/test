package p000;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: c40 */
/* compiled from: BreadcrumbAnalyticsEventReceiver */
public class c40 implements C6735yf, e40 {

    /* renamed from: a */
    public d40 f21600a;

    /* renamed from: c */
    public static String m32852c(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String next : bundle.keySet()) {
            jSONObject2.put(next, bundle.get(next));
        }
        jSONObject.put(PublicResolver.FUNC_NAME, str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    /* renamed from: a */
    public void mo29868a(String str, Bundle bundle) {
        d40 d40 = this.f21600a;
        if (d40 != null) {
            try {
                d40.mo41823a("$A$:" + m32852c(str, bundle));
            } catch (JSONException unused) {
                rk3.m51112f().mo47431k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }

    /* renamed from: b */
    public void mo29869b(d40 d40) {
        this.f21600a = d40;
        rk3.m51112f().mo47423b("Registered Firebase Analytics event receiver for breadcrumbs");
    }
}
