package p000;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzaa;
import com.google.android.gms.measurement.internal.zzas;
import com.google.android.gms.measurement.internal.zzkq;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: fw8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class fw8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Bundle f29011a;

    /* renamed from: d */
    public final /* synthetic */ sx8 f29012d;

    public fw8(sx8 sx8, Bundle bundle) {
        this.f29012d = sx8;
        this.f29011a = bundle;
    }

    public final void run() {
        zzkq zzkq;
        sx8 sx8 = this.f29012d;
        Bundle bundle = this.f29011a;
        sx8.mo29006e();
        sx8.mo47219g();
        cu4.m43221k(bundle);
        cu4.m43217g(bundle.getString(PublicResolver.FUNC_NAME));
        if (sx8.f34342a.mo45262h()) {
            if (sx8.f34342a.mo45274y().mo45997v((String) null, rl8.f33535z0)) {
                zzkq = new zzkq(bundle.getString(PublicResolver.FUNC_NAME), 0, (Object) null, "");
            } else {
                zzkq = new zzkq(bundle.getString(PublicResolver.FUNC_NAME), 0, (Object) null, (String) null);
            }
            try {
                sx8.f34342a.mo45254R().mo42719M(new zzaa(bundle.getString("app_id"), bundle.getString("origin"), zzkq, bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), (zzas) null, bundle.getLong("trigger_timeout"), (zzas) null, bundle.getLong("time_to_live"), sx8.f34342a.mo45243G().mo42794J(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), bundle.getString("origin"), bundle.getLong("creation_timestamp"), true, false)));
            } catch (IllegalArgumentException unused) {
            }
        } else {
            sx8.f34342a.mo45237A().mo29678v().mo48769a("Conditional property not cleared since app measurement is disabled");
        }
    }
}
