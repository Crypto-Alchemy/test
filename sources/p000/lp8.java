package p000;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p000.C5889hd;

/* renamed from: lp8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class lp8 extends vt8 {

    /* renamed from: x */
    public static final Pair<String, Long> f31353x = new Pair<>("", 0L);

    /* renamed from: c */
    public SharedPreferences f31354c;

    /* renamed from: d */
    public lo8 f31355d;

    /* renamed from: e */
    public final io8 f31356e = new io8(this, "first_open_time", 0);

    /* renamed from: f */
    public final io8 f31357f = new io8(this, "app_install_time", 0);

    /* renamed from: g */
    public final ip8 f31358g = new ip8(this, "app_instance_id", (String) null);

    /* renamed from: h */
    public String f31359h;

    /* renamed from: i */
    public boolean f31360i;

    /* renamed from: j */
    public long f31361j;

    /* renamed from: k */
    public final io8 f31362k = new io8(this, "session_timeout", 1800000);

    /* renamed from: l */
    public final do8 f31363l = new do8(this, "start_new_session", true);

    /* renamed from: m */
    public final ip8 f31364m = new ip8(this, "non_personalized_ads", (String) null);

    /* renamed from: n */
    public final do8 f31365n = new do8(this, "allow_remote_dynamite", false);

    /* renamed from: o */
    public final io8 f31366o = new io8(this, "last_pause_time", 0);

    /* renamed from: p */
    public boolean f31367p;

    /* renamed from: q */
    public final do8 f31368q = new do8(this, "app_backgrounded", false);

    /* renamed from: r */
    public final do8 f31369r = new do8(this, "deep_link_retrieval_complete", false);

    /* renamed from: s */
    public final io8 f31370s = new io8(this, "deep_link_retrieval_attempts", 0);

    /* renamed from: t */
    public final ip8 f31371t = new ip8(this, "firebase_feature_rollouts", (String) null);

    /* renamed from: u */
    public final ip8 f31372u = new ip8(this, "deferred_attribution_cache", (String) null);

    /* renamed from: v */
    public final io8 f31373v = new io8(this, "deferred_attribution_cache_timestamp", 0);

    /* renamed from: w */
    public final fo8 f31374w = new fo8(this, "default_event_parameters", (Bundle) null);

    public lp8(kr8 kr8) {
        super(kr8);
    }

    /* renamed from: f */
    public final boolean mo29669f() {
        return true;
    }

    @EnsuresNonNull.List({@EnsuresNonNull({"this.preferences"}), @EnsuresNonNull({"this.monitoringSample"})})
    /* renamed from: g */
    public final void mo42811g() {
        SharedPreferences sharedPreferences = this.f34342a.mo45271q().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f31354c = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.f31367p = z;
        if (!z) {
            SharedPreferences.Editor edit = this.f31354c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f34342a.mo45274y();
        this.f31355d = new lo8(this, "health_monitor", Math.max(0, rl8.f33490d.mo48412b(null).longValue()), (bo8) null);
    }

    /* renamed from: l */
    public final Pair<String, Boolean> mo45478l(String str) {
        mo29006e();
        long b = this.f34342a.mo45256a().mo29581b();
        String str2 = this.f31359h;
        if (str2 != null && b < this.f31361j) {
            return new Pair<>(str2, Boolean.valueOf(this.f31360i));
        }
        this.f31361j = b + this.f34342a.mo45274y().mo45993p(str, rl8.f33488c);
        C5889hd.m45128d(true);
        try {
            C5889hd.C5890a b2 = C5889hd.m45127b(this.f34342a.mo45271q());
            this.f31359h = "";
            String a = b2.mo43135a();
            if (a != null) {
                this.f31359h = a;
            }
            this.f31360i = b2.mo43136b();
        } catch (Exception e) {
            this.f34342a.mo45237A().mo29677u().mo48770b("Unable to get advertising id", e);
            this.f31359h = "";
        }
        C5889hd.m45128d(false);
        return new Pair<>(this.f31359h, Boolean.valueOf(this.f31360i));
    }

    /* renamed from: m */
    public final SharedPreferences mo45479m() {
        mo29006e();
        mo48801i();
        cu4.m43221k(this.f31354c);
        return this.f31354c;
    }

    /* renamed from: n */
    public final void mo45480n(Boolean bool) {
        mo29006e();
        SharedPreferences.Editor edit = mo45479m().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    /* renamed from: o */
    public final Boolean mo45481o() {
        mo29006e();
        if (mo45479m().contains("measurement_enabled")) {
            return Boolean.valueOf(mo45479m().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* renamed from: p */
    public final boolean mo45482p(int i) {
        return u68.m52650m(i, mo45479m().getInt("consent_source", 100));
    }

    /* renamed from: r */
    public final u68 mo45483r() {
        mo29006e();
        return u68.m52648c(mo45479m().getString("consent_settings", "G1"));
    }

    /* renamed from: t */
    public final void mo45484t(boolean z) {
        mo29006e();
        this.f34342a.mo45237A().mo29678v().mo48770b("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor edit = mo45479m().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    /* renamed from: u */
    public final boolean mo45485u() {
        SharedPreferences sharedPreferences = this.f31354c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    /* renamed from: v */
    public final boolean mo45486v(long j) {
        if (j - this.f31362k.mo43882a() > this.f31366o.mo43882a()) {
            return true;
        }
        return false;
    }
}
