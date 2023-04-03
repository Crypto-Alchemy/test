package p000;

import com.onesignal.C5277k0;
import com.onesignal.C5342x0;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalStateSynchronizer;
import org.json.JSONObject;

/* renamed from: xc4 */
/* compiled from: OSEmailSubscriptionState */
public class xc4 implements Cloneable {

    /* renamed from: a */
    public C5277k0<Object, xc4> f35594a = new C5277k0<>("changed", false);

    /* renamed from: d */
    public String f35595d;

    /* renamed from: e */
    public String f35596e;

    public xc4(boolean z) {
        if (z) {
            String str = C5342x0.f26571a;
            this.f35595d = C5342x0.m41395f(str, "PREFS_ONESIGNAL_EMAIL_ID_LAST", (String) null);
            this.f35596e = C5342x0.m41395f(str, "PREFS_ONESIGNAL_EMAIL_ADDRESS_LAST", (String) null);
            return;
        }
        this.f35595d = OneSignal.m40372Y();
        this.f35596e = OneSignalStateSynchronizer.m40477b().mo38997E();
    }

    /* renamed from: a */
    public C5277k0<Object, xc4> mo49444a() {
        return this.f35594a;
    }

    /* renamed from: b */
    public boolean mo49445b() {
        if (this.f35595d == null || this.f35596e == null) {
            return false;
        }
        return true;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public void mo49447d() {
        String str = C5342x0.f26571a;
        C5342x0.m41402m(str, "PREFS_ONESIGNAL_EMAIL_ID_LAST", this.f35595d);
        C5342x0.m41402m(str, "PREFS_ONESIGNAL_EMAIL_ADDRESS_LAST", this.f35596e);
    }

    /* renamed from: f */
    public void mo49448f(String str) {
        boolean z = true;
        if (str != null ? str.equals(this.f35595d) : this.f35595d == null) {
            z = false;
        }
        this.f35595d = str;
        if (z) {
            this.f35594a.mo38950c(this);
        }
    }

    /* renamed from: g */
    public JSONObject mo49449g() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f35595d;
            if (str != null) {
                jSONObject.put("emailUserId", str);
            } else {
                jSONObject.put("emailUserId", JSONObject.NULL);
            }
            String str2 = this.f35596e;
            if (str2 != null) {
                jSONObject.put("emailAddress", str2);
            } else {
                jSONObject.put("emailAddress", JSONObject.NULL);
            }
            jSONObject.put("isSubscribed", mo49445b());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return mo49449g().toString();
    }
}
