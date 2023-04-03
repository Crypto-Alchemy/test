package p000;

import android.text.TextUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: x91 */
/* compiled from: DefaultSettingsSpiCall */
public class x91 implements lz5 {

    /* renamed from: a */
    public final String f35555a;

    /* renamed from: b */
    public final en2 f35556b;

    /* renamed from: c */
    public final rk3 f35557c;

    public x91(String str, en2 en2) {
        this(str, en2, rk3.m51112f());
    }

    /* renamed from: a */
    public JSONObject mo45551a(kz5 kz5, boolean z) {
        if (z) {
            try {
                Map<String, String> f = mo49437f(kz5);
                cn2 b = mo49433b(mo49435d(f), kz5);
                rk3 rk3 = this.f35557c;
                rk3.mo47423b("Requesting settings from " + this.f35555a);
                rk3 rk32 = this.f35557c;
                rk32.mo47429i("Settings query params were: " + f);
                return mo49438g(b.mo30060c());
            } catch (IOException e) {
                this.f35557c.mo47426e("Settings request failed.", e);
                return null;
            }
        } else {
            throw new RuntimeException("An invalid data collection token was used.");
        }
    }

    /* renamed from: b */
    public final cn2 mo49433b(cn2 cn2, kz5 kz5) {
        mo49434c(cn2, "X-CRASHLYTICS-GOOGLE-APP-ID", kz5.f31131a);
        mo49434c(cn2, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        mo49434c(cn2, "X-CRASHLYTICS-API-CLIENT-VERSION", vu0.m53527i());
        mo49434c(cn2, Constants.ACCEPT_HEADER, Constants.APPLICATION_JSON);
        mo49434c(cn2, "X-CRASHLYTICS-DEVICE-MODEL", kz5.f31132b);
        mo49434c(cn2, "X-CRASHLYTICS-OS-BUILD-VERSION", kz5.f31133c);
        mo49434c(cn2, "X-CRASHLYTICS-OS-DISPLAY-VERSION", kz5.f31134d);
        mo49434c(cn2, "X-CRASHLYTICS-INSTALLATION-ID", kz5.f31135e.mo48534a());
        return cn2;
    }

    /* renamed from: c */
    public final void mo49434c(cn2 cn2, String str, String str2) {
        if (str2 != null) {
            cn2.mo30061d(str, str2);
        }
    }

    /* renamed from: d */
    public cn2 mo49435d(Map<String, String> map) {
        cn2 a = this.f35556b.mo42330a(this.f35555a, map);
        return a.mo30061d(Constants.USER_AGENT_HEADER_KEY, "Crashlytics Android SDK/" + vu0.m53527i()).mo30061d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    /* renamed from: e */
    public final JSONObject mo49436e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            rk3 rk3 = this.f35557c;
            rk3.mo47432l("Failed to parse settings JSON from " + this.f35555a, e);
            rk3 rk32 = this.f35557c;
            rk32.mo47431k("Settings response " + str);
            return null;
        }
    }

    /* renamed from: f */
    public final Map<String, String> mo49437f(kz5 kz5) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", kz5.f31138h);
        hashMap.put("display_version", kz5.f31137g);
        hashMap.put("source", Integer.toString(kz5.f31139i));
        String str = kz5.f31136f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    /* renamed from: g */
    public JSONObject mo49438g(fn2 fn2) {
        int b = fn2.mo42612b();
        rk3 rk3 = this.f35557c;
        rk3.mo47429i("Settings response code was: " + b);
        if (mo49439h(b)) {
            return mo49436e(fn2.mo42611a());
        }
        rk3 rk32 = this.f35557c;
        rk32.mo47425d("Settings request failed; (status: " + b + ") from " + this.f35555a);
        return null;
    }

    /* renamed from: h */
    public boolean mo49439h(int i) {
        return i == 200 || i == 201 || i == 202 || i == 203;
    }

    public x91(String str, en2 en2, rk3 rk3) {
        if (str != null) {
            this.f35557c = rk3;
            this.f35556b = en2;
            this.f35555a = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }
}
