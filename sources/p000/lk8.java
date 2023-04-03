package p000;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: lk8 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@19.0.0 */
public final class lk8 extends fk8 {

    /* renamed from: k */
    public final /* synthetic */ Bundle f31330k;

    /* renamed from: r */
    public final /* synthetic */ Activity f31331r;

    /* renamed from: s */
    public final /* synthetic */ zl8 f31332s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lk8(zl8 zl8, Bundle bundle, Activity activity) {
        super(zl8.f36184a, true);
        this.f31332s = zl8;
        this.f31330k = bundle;
        this.f31331r = activity;
    }

    /* renamed from: a */
    public final void mo28979a() throws RemoteException {
        Bundle bundle;
        if (this.f31330k != null) {
            bundle = new Bundle();
            if (this.f31330k.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f31330k.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        ((ef8) cu4.m43221k(this.f31332s.f36184a.f21816i)).onActivityCreated(gf4.m44716s1(this.f31331r), bundle, this.f28895d);
    }
}
