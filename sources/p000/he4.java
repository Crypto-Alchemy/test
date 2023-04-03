package p000;

import com.onesignal.C5277k0;
import com.onesignal.C5342x0;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalStateSynchronizer;
import org.json.JSONObject;

/* renamed from: he4 */
/* compiled from: OSSMSSubscriptionState */
public class he4 implements Cloneable {

    /* renamed from: a */
    public C5277k0<Object, he4> f29558a = new C5277k0<>("changed", false);

    /* renamed from: d */
    public String f29559d;

    /* renamed from: e */
    public String f29560e;

    public he4(boolean z) {
        if (z) {
            String str = C5342x0.f26571a;
            this.f29559d = C5342x0.m41395f(str, "PREFS_OS_SMS_ID_LAST", (String) null);
            this.f29560e = C5342x0.m41395f(str, "PREFS_OS_SMS_NUMBER_LAST", (String) null);
            return;
        }
        this.f29559d = OneSignal.m40413m0();
        this.f29560e = OneSignalStateSynchronizer.m40481f().mo38997E();
    }

    /* renamed from: a */
    public C5277k0<Object, he4> mo43169a() {
        return this.f29558a;
    }

    /* renamed from: b */
    public boolean mo43170b() {
        if (this.f29559d == null || this.f29560e == null) {
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
    public void mo43172d() {
        String str = C5342x0.f26571a;
        C5342x0.m41402m(str, "PREFS_OS_SMS_ID_LAST", this.f29559d);
        C5342x0.m41402m(str, "PREFS_OS_SMS_NUMBER_LAST", this.f29560e);
    }

    /* renamed from: f */
    public void mo43173f(String str) {
        boolean z = true;
        if (str != null ? str.equals(this.f29559d) : this.f29559d == null) {
            z = false;
        }
        this.f29559d = str;
        if (z) {
            this.f29558a.mo38950c(this);
        }
    }

    /* renamed from: g */
    public JSONObject mo43174g() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f29559d;
            if (str != null) {
                jSONObject.put("smsUserId", str);
            } else {
                jSONObject.put("smsUserId", JSONObject.NULL);
            }
            String str2 = this.f29560e;
            if (str2 != null) {
                jSONObject.put("smsNumber", str2);
            } else {
                jSONObject.put("smsNumber", JSONObject.NULL);
            }
            jSONObject.put("isSubscribed", mo43170b());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return mo43174g().toString();
    }
}
