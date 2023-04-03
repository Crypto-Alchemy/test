package p000;

import android.os.Bundle;
import java.util.Locale;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.C6436rf;

/* renamed from: qu0 */
/* compiled from: CrashlyticsAnalyticsListener */
public class qu0 implements C6436rf.C6438b {

    /* renamed from: a */
    public C6735yf f33271a;

    /* renamed from: b */
    public C6735yf f33272b;

    /* renamed from: b */
    public static void m50875b(C6735yf yfVar, String str, Bundle bundle) {
        if (yfVar != null) {
            yfVar.mo29868a(str, bundle);
        }
    }

    /* renamed from: a */
    public void mo47274a(int i, Bundle bundle) {
        String string;
        rk3.m51112f().mo47429i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", new Object[]{Integer.valueOf(i), bundle}));
        if (bundle != null && (string = bundle.getString(PublicResolver.FUNC_NAME)) != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            mo47275c(string, bundle2);
        }
    }

    /* renamed from: c */
    public final void mo47275c(String str, Bundle bundle) {
        C6735yf yfVar;
        if ("clx".equals(bundle.getString("_o"))) {
            yfVar = this.f33271a;
        } else {
            yfVar = this.f33272b;
        }
        m50875b(yfVar, str, bundle);
    }

    /* renamed from: d */
    public void mo47276d(C6735yf yfVar) {
        this.f33272b = yfVar;
    }

    /* renamed from: e */
    public void mo47277e(C6735yf yfVar) {
        this.f33271a = yfVar;
    }
}
