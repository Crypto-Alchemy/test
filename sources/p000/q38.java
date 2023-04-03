package p000;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4013a;
import com.google.android.gms.common.api.GoogleApiClient;

/* renamed from: q38 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class q38 implements GoogleApiClient.C4011b, GoogleApiClient.C4012c {

    /* renamed from: a */
    public final C4013a f32911a;

    /* renamed from: b */
    public final boolean f32912b;

    /* renamed from: c */
    public t38 f32913c;

    public q38(C4013a aVar, boolean z) {
        this.f32911a = aVar;
        this.f32912b = z;
    }

    /* renamed from: a */
    public final void mo46943a(t38 t38) {
        this.f32913c = t38;
    }

    /* renamed from: b */
    public final t38 mo46944b() {
        cu4.m43222l(this.f32913c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        return this.f32913c;
    }

    public final void onConnected(Bundle bundle) {
        mo46944b().onConnected(bundle);
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        mo46944b().mo45935E0(connectionResult, this.f32911a, this.f32912b);
    }

    public final void onConnectionSuspended(int i) {
        mo46944b().onConnectionSuspended(i);
    }
}
