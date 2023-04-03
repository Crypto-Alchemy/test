package p000;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C4013a;
import p000.wl6;

/* renamed from: x08 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class x08 extends wl6 {

    /* renamed from: d */
    public final /* synthetic */ wl6.C6669a f35493d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x08(wl6.C6669a aVar, Feature[] featureArr, boolean z, int i) {
        super(featureArr, z, i);
        this.f35493d = aVar;
    }

    /* renamed from: b */
    public final void mo49230b(C4013a.C4015b bVar, xl6 xl6) throws RemoteException {
        this.f35493d.f35381a.accept(bVar, xl6);
    }
}
