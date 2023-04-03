package p000;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: js8 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class js8 extends z48 {

    /* renamed from: g */
    public final /* synthetic */ C6462ry f30584g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public js8(C6462ry ryVar, int i, Bundle bundle) {
        super(ryVar, i, (Bundle) null);
        this.f30584g = ryVar;
    }

    /* renamed from: f */
    public final void mo44572f(ConnectionResult connectionResult) {
        if (!this.f30584g.mo47563y() || !C6462ry.m51381m0(this.f30584g)) {
            this.f30584g.f33640M.mo45313a(connectionResult);
            this.f30584g.mo47536Q(connectionResult);
            return;
        }
        C6462ry.m51378i0(this.f30584g, 16);
    }

    /* renamed from: g */
    public final boolean mo44573g() {
        this.f30584g.f33640M.mo45313a(ConnectionResult.f22149k);
        return true;
    }
}
