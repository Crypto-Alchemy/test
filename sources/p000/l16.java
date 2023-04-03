package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.C4033b;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;
import p000.C6462ry;

/* renamed from: l16 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class l16 extends jh2<x18> implements r18 {

    /* renamed from: z1 */
    public static final /* synthetic */ int f31148z1 = 0;

    /* renamed from: v1 */
    public final boolean f31149v1 = true;

    /* renamed from: w1 */
    public final sg0 f31150w1;

    /* renamed from: x1 */
    public final Bundle f31151x1;

    /* renamed from: y1 */
    public final Integer f31152y1;

    public l16(Context context, Looper looper, boolean z, sg0 sg0, Bundle bundle, GoogleApiClient.C4011b bVar, GoogleApiClient.C4012c cVar) {
        super(context, looper, 44, sg0, bVar, cVar);
        this.f31150w1 = sg0;
        this.f31151x1 = bundle;
        this.f31152y1 = sg0.mo47779g();
    }

    /* renamed from: q0 */
    public static Bundle m47594q0(sg0 sg0) {
        sg0.mo47778f();
        Integer g = sg0.mo47779g();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", sg0.mo47773a());
        if (g != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", g.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", (String) null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    /* renamed from: F */
    public final Bundle mo42128F() {
        if (!mo47528D().getPackageName().equals(this.f31150w1.mo47776d())) {
            this.f31151x1.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f31150w1.mo47776d());
        }
        return this.f31151x1;
    }

    /* renamed from: J */
    public final String mo28792J() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* renamed from: K */
    public final String mo28793K() {
        return "com.google.android.gms.signin.service.START";
    }

    /* renamed from: i */
    public final void mo45327i() {
        try {
            ((x18) mo47531I()).mo49332t1(((Integer) cu4.m43221k(this.f31152y1)).intValue());
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: j */
    public final boolean mo30551j() {
        return this.f31149v1;
    }

    /* renamed from: k */
    public final void mo45328k() {
        mo47555n(new C6462ry.C6466d());
    }

    /* renamed from: p */
    public final int mo28794p() {
        return mi2.f31711a;
    }

    /* renamed from: r */
    public final void mo45329r(C4033b bVar, boolean z) {
        try {
            ((x18) mo47531I()).mo49333u1(bVar, ((Integer) cu4.m43221k(this.f31152y1)).intValue(), z);
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: u */
    public final void mo45330u(s18 s18) {
        GoogleSignInAccount googleSignInAccount;
        cu4.m43222l(s18, "Expecting a valid ISignInCallbacks");
        try {
            Account b = this.f31150w1.mo47774b();
            if ("<<default account>>".equals(b.name)) {
                googleSignInAccount = ba6.m32444a(mo47528D()).mo29511b();
            } else {
                googleSignInAccount = null;
            }
            ((x18) mo47531I()).mo49334v1(new zai(1, new zat(b, ((Integer) cu4.m43221k(this.f31152y1)).intValue(), googleSignInAccount)), s18);
        } catch (RemoteException e) {
            try {
                s18.mo47312n(new zak(1, new ConnectionResult(8, (PendingIntent) null), (zav) null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    /* renamed from: x */
    public final /* synthetic */ IInterface mo28795x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof x18) {
            return (x18) queryLocalInterface;
        }
        return new x18(iBinder);
    }
}
