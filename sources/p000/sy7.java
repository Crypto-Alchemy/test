package p000;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;

/* renamed from: sy7 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class sy7 implements GoogleApiClient.C4011b, GoogleApiClient.C4012c {

    /* renamed from: a */
    public final /* synthetic */ vy7 f34060a;

    public /* synthetic */ sy7(vy7 vy7, ry7 ry7) {
        this.f34060a = vy7;
    }

    public final void onConnected(Bundle bundle) {
        sg0 sg0 = (sg0) cu4.m43221k(this.f34060a.f35210r);
        ((r18) cu4.m43221k(this.f34060a.f35203k)).mo45330u(new qy7(this.f34060a));
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.f34060a.f35194b.lock();
        try {
            if (this.f34060a.mo48869p(connectionResult)) {
                this.f34060a.mo48861h();
                this.f34060a.mo48866m();
            } else {
                this.f34060a.mo48864k(connectionResult);
            }
        } finally {
            this.f34060a.f35194b.unlock();
        }
    }

    public final void onConnectionSuspended(int i) {
    }
}
