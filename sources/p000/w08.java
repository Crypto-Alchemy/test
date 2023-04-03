package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4013a;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import java.util.Set;

/* renamed from: w08 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class w08 extends j08 implements GoogleApiClient.C4011b, GoogleApiClient.C4012c {

    /* renamed from: h */
    public static final C4013a.C4014a f35220h = g18.f29047c;

    /* renamed from: a */
    public final Context f35221a;

    /* renamed from: b */
    public final Handler f35222b;

    /* renamed from: c */
    public final C4013a.C4014a f35223c;

    /* renamed from: d */
    public final Set f35224d;

    /* renamed from: e */
    public final sg0 f35225e;

    /* renamed from: f */
    public r18 f35226f;

    /* renamed from: g */
    public v08 f35227g;

    public w08(Context context, Handler handler, sg0 sg0) {
        C4013a.C4014a aVar = f35220h;
        this.f35221a = context;
        this.f35222b = handler;
        this.f35225e = (sg0) cu4.m43222l(sg0, "ClientSettings must not be null");
        this.f35224d = sg0.mo47777e();
        this.f35223c = aVar;
    }

    /* renamed from: s1 */
    public static /* bridge */ /* synthetic */ void m53666s1(w08 w08, zak zak) {
        ConnectionResult r1 = zak.mo31440r1();
        if (r1.mo30462v1()) {
            zav zav = (zav) cu4.m43221k(zak.mo31441s1());
            ConnectionResult r12 = zav.mo30666r1();
            if (!r12.mo30462v1()) {
                String valueOf = String.valueOf(r12);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                w08.f35227g.mo48629c(r12);
                w08.f35226f.mo30543a();
                return;
            }
            w08.f35227g.mo48628b(zav.mo30667s1(), w08.f35224d);
        } else {
            w08.f35227g.mo48629c(r1);
        }
        w08.f35226f.mo30543a();
    }

    /* renamed from: n */
    public final void mo47312n(zak zak) {
        this.f35222b.post(new u08(this, zak));
    }

    public final void onConnected(Bundle bundle) {
        this.f35226f.mo45330u(this);
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.f35227g.mo48629c(connectionResult);
    }

    public final void onConnectionSuspended(int i) {
        this.f35226f.mo30543a();
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.google.android.gms.common.api.a$f, r18] */
    /* renamed from: t1 */
    public final void mo48877t1(v08 v08) {
        r18 r18 = this.f35226f;
        if (r18 != null) {
            r18.mo30543a();
        }
        this.f35225e.mo47782j(Integer.valueOf(System.identityHashCode(this)));
        C4013a.C4014a aVar = this.f35223c;
        Context context = this.f35221a;
        Looper looper = this.f35222b.getLooper();
        sg0 sg0 = this.f35225e;
        this.f35226f = aVar.mo30538d(context, looper, sg0, sg0.mo47778f(), this, this);
        this.f35227g = v08;
        Set set = this.f35224d;
        if (set == null || set.isEmpty()) {
            this.f35222b.post(new t08(this));
        } else {
            this.f35226f.mo45328k();
        }
    }

    /* renamed from: u1 */
    public final void mo48878u1() {
        r18 r18 = this.f35226f;
        if (r18 != null) {
            r18.mo30543a();
        }
    }
}
