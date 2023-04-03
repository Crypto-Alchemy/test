package p000;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4013a;
import com.google.android.gms.common.internal.C4033b;
import java.util.Set;
import p000.C6462ry;

/* renamed from: yz7 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class yz7 implements C6462ry.C6465c, v08 {

    /* renamed from: a */
    public final C4013a.C4021f f35968a;

    /* renamed from: b */
    public final C6286nm f35969b;

    /* renamed from: c */
    public C4033b f35970c = null;

    /* renamed from: d */
    public Set f35971d = null;

    /* renamed from: e */
    public boolean f35972e = false;

    /* renamed from: f */
    public final /* synthetic */ bi2 f35973f;

    public yz7(bi2 bi2, C4013a.C4021f fVar, C6286nm nmVar) {
        this.f35973f = bi2;
        this.f35968a = fVar;
        this.f35969b = nmVar;
    }

    /* renamed from: a */
    public final void mo45313a(ConnectionResult connectionResult) {
        this.f35973f.f21334M.post(new xz7(this, connectionResult));
    }

    /* renamed from: b */
    public final void mo48628b(C4033b bVar, Set set) {
        if (bVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            mo48629c(new ConnectionResult(4));
            return;
        }
        this.f35970c = bVar;
        this.f35971d = set;
        mo49766h();
    }

    /* renamed from: c */
    public final void mo48629c(ConnectionResult connectionResult) {
        uz7 uz7 = (uz7) this.f35973f.f21330C.get(this.f35969b);
        if (uz7 != null) {
            uz7.mo48595F(connectionResult);
        }
    }

    /* renamed from: h */
    public final void mo49766h() {
        C4033b bVar;
        if (this.f35972e && (bVar = this.f35970c) != null) {
            this.f35968a.mo30553m(bVar, this.f35971d);
        }
    }
}
