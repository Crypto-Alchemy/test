package p000;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzaa;
import com.google.android.gms.measurement.internal.zzas;
import com.google.android.gms.measurement.internal.zzkq;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: cw8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class cw8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Bundle f27974a;

    /* renamed from: d */
    public final /* synthetic */ sx8 f27975d;

    public cw8(sx8 sx8, Bundle bundle) {
        this.f27975d = sx8;
        this.f27974a = bundle;
    }

    public final void run() {
        sx8 sx8 = this.f27975d;
        Bundle bundle = this.f27974a;
        sx8.mo29006e();
        sx8.mo47219g();
        cu4.m43221k(bundle);
        String string = bundle.getString(PublicResolver.FUNC_NAME);
        String string2 = bundle.getString("origin");
        cu4.m43217g(string);
        cu4.m43217g(string2);
        cu4.m43221k(bundle.get("value"));
        if (!sx8.f34342a.mo45262h()) {
            sx8.f34342a.mo45237A().mo29678v().mo48769a("Conditional property not set since app measurement is disabled");
            return;
        }
        zzkq zzkq = new zzkq(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            zzas J = sx8.f34342a.mo45243G().mo42794J(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0, true, false);
            zzas J2 = sx8.f34342a.mo45243G().mo42794J(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0, true, false);
            zzas J3 = sx8.f34342a.mo45243G().mo42794J(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0, true, false);
            sx8.f34342a.mo45254R().mo42719M(new zzaa(bundle.getString("app_id"), string2, zzkq, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), J2, bundle.getLong("trigger_timeout"), J, bundle.getLong("time_to_live"), J3));
        } catch (IllegalArgumentException unused) {
        }
    }
}
