package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.DeliveryMechanism;
import com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: yy5 */
/* compiled from: SettingsController */
public class yy5 implements az5 {

    /* renamed from: a */
    public final Context f35949a;

    /* renamed from: b */
    public final kz5 f35950b;

    /* renamed from: c */
    public final iz5 f35951c;

    /* renamed from: d */
    public final mx0 f35952d;

    /* renamed from: e */
    public final l80 f35953e;

    /* renamed from: f */
    public final lz5 f35954f;

    /* renamed from: g */
    public final m11 f35955g;

    /* renamed from: h */
    public final AtomicReference<xy5> f35956h;

    /* renamed from: i */
    public final AtomicReference<xl6<C5845fo>> f35957i = new AtomicReference<>(new xl6());

    /* renamed from: yy5$a */
    /* compiled from: SettingsController */
    public class C6752a implements kd6<Void, Void> {
        public C6752a() {
        }

        /* renamed from: b */
        public tl6<Void> mo44766a(Void voidR) throws Exception {
            JSONObject a = yy5.this.f35954f.mo45551a(yy5.this.f35950b, true);
            if (a != null) {
                zy5 b = yy5.this.f35951c.mo43984b(a);
                yy5.this.f35953e.mo45366c(b.mo50001d(), a);
                yy5.this.mo49759q(a, "Loaded settings: ");
                yy5 yy5 = yy5.this;
                boolean unused = yy5.mo49760r(yy5.f35950b.f31136f);
                yy5.this.f35956h.set(b);
                ((xl6) yy5.this.f35957i.get()).mo49507e(b.mo50000c());
                xl6 xl6 = new xl6();
                xl6.mo49507e(b.mo50000c());
                yy5.this.f35957i.set(xl6);
            }
            return jm6.m46619e(null);
        }
    }

    public yy5(Context context, kz5 kz5, mx0 mx0, iz5 iz5, l80 l80, lz5 lz5, m11 m11) {
        AtomicReference<xy5> atomicReference = new AtomicReference<>();
        this.f35956h = atomicReference;
        this.f35949a = context;
        this.f35950b = kz5;
        this.f35952d = mx0;
        this.f35951c = iz5;
        this.f35953e = l80;
        this.f35954f = lz5;
        this.f35955g = m11;
        atomicReference.set(w91.m53760e(mx0));
    }

    /* renamed from: l */
    public static yy5 m54904l(Context context, String str, zp2 zp2, en2 en2, String str2, String str3, m11 m11) {
        String g = zp2.mo49898g();
        ik6 ik6 = new ik6();
        iz5 iz5 = new iz5(ik6);
        l80 l80 = new l80(context);
        x91 x91 = new x91(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", new Object[]{str}), en2);
        String h = zp2.mo49899h();
        String i = zp2.mo49900i();
        String j = zp2.mo49901j();
        String h2 = CommonUtils.m38405h(CommonUtils.m38411n(context), str, str3, str2);
        return new yy5(context, new kz5(str, h, i, j, zp2, h2, str3, str2, DeliveryMechanism.determineFrom(g).getId()), ik6, iz5, l80, x91, m11);
    }

    /* renamed from: a */
    public xy5 mo29403a() {
        return this.f35956h.get();
    }

    /* renamed from: b */
    public tl6<C5845fo> mo29404b() {
        return this.f35957i.get().mo49503a();
    }

    /* renamed from: k */
    public boolean mo49754k() {
        return !mo49756n().equals(this.f35950b.f31136f);
    }

    /* renamed from: m */
    public final zy5 mo49755m(SettingsCacheBehavior settingsCacheBehavior) {
        zy5 zy5 = null;
        try {
            if (SettingsCacheBehavior.SKIP_CACHE_LOOKUP.equals(settingsCacheBehavior)) {
                return null;
            }
            JSONObject b = this.f35953e.mo45365b();
            if (b != null) {
                zy5 b2 = this.f35951c.mo43984b(b);
                if (b2 != null) {
                    mo49759q(b, "Loaded cached settings: ");
                    long a = this.f35952d.mo43635a();
                    if (!SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION.equals(settingsCacheBehavior)) {
                        if (b2.mo50002e(a)) {
                            rk3.m51112f().mo47429i("Cached settings have expired.");
                            return null;
                        }
                    }
                    try {
                        rk3.m51112f().mo47429i("Returning cached settings.");
                        return b2;
                    } catch (Exception e) {
                        e = e;
                        zy5 = b2;
                        rk3.m51112f().mo47426e("Failed to get cached settings", e);
                        return zy5;
                    }
                } else {
                    rk3.m51112f().mo47426e("Failed to parse cached settings data.", (Throwable) null);
                    return null;
                }
            } else {
                rk3.m51112f().mo47423b("No cached settings data found.");
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            rk3.m51112f().mo47426e("Failed to get cached settings", e);
            return zy5;
        }
    }

    /* renamed from: n */
    public final String mo49756n() {
        return CommonUtils.m38415r(this.f35949a).getString("existing_instance_identifier", "");
    }

    /* renamed from: o */
    public tl6<Void> mo49757o(SettingsCacheBehavior settingsCacheBehavior, Executor executor) {
        zy5 m;
        if (mo49754k() || (m = mo49755m(settingsCacheBehavior)) == null) {
            zy5 m2 = mo49755m(SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION);
            if (m2 != null) {
                this.f35956h.set(m2);
                this.f35957i.get().mo49507e(m2.mo50000c());
            }
            return this.f35955g.mo45602h().mo48147r(executor, new C6752a());
        }
        this.f35956h.set(m);
        this.f35957i.get().mo49507e(m.mo50000c());
        return jm6.m46619e(null);
    }

    /* renamed from: p */
    public tl6<Void> mo49758p(Executor executor) {
        return mo49757o(SettingsCacheBehavior.USE_CACHE, executor);
    }

    /* renamed from: q */
    public final void mo49759q(JSONObject jSONObject, String str) throws JSONException {
        rk3 f = rk3.m51112f();
        f.mo47423b(str + jSONObject.toString());
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: r */
    public final boolean mo49760r(String str) {
        SharedPreferences.Editor edit = CommonUtils.m38415r(this.f35949a).edit();
        edit.putString("existing_instance_identifier", str);
        edit.apply();
        return true;
    }
}
