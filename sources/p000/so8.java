package p000;

import android.os.Bundle;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.C3966co;

/* renamed from: so8 */
/* compiled from: com.google.android.gms:play-services-measurement-api@@19.0.0 */
public final class so8 implements C3966co.C3967a {

    /* renamed from: a */
    public final /* synthetic */ es8 f33975a;

    public so8(es8 es8) {
        this.f33975a = es8;
    }

    /* renamed from: a */
    public final void mo28920a(String str, String str2, Bundle bundle, long j) {
        if (str != null && !str.equals("crash") && ke8.m47048c(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(PublicResolver.FUNC_NAME, str2);
            bundle2.putLong("timestampInMillis", j);
            bundle2.putBundle("params", bundle);
            this.f33975a.f28651a.mo47274a(3, bundle2);
        }
    }
}
