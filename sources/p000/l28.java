package p000;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;

/* renamed from: l28 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class l28 implements GoogleApiClient.C4012c {

    /* renamed from: a */
    public final int f31162a;

    /* renamed from: b */
    public final GoogleApiClient f31163b;

    /* renamed from: c */
    public final GoogleApiClient.C4012c f31164c;

    /* renamed from: d */
    public final /* synthetic */ n28 f31165d;

    public l28(n28 n28, int i, GoogleApiClient googleApiClient, GoogleApiClient.C4012c cVar) {
        this.f31165d = n28;
        this.f31162a = i;
        this.f31163b = googleApiClient;
        this.f31164c = cVar;
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        "beginFailureResolution for ".concat(String.valueOf(connectionResult));
        this.f31165d.mo43071s(connectionResult, this.f31162a);
    }
}
