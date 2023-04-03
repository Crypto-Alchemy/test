package p000;

import android.app.Activity;
import android.os.RemoteException;

/* renamed from: qk8 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@19.0.0 */
public final class qk8 extends fk8 {

    /* renamed from: k */
    public final /* synthetic */ Activity f33149k;

    /* renamed from: r */
    public final /* synthetic */ zl8 f33150r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qk8(zl8 zl8, Activity activity) {
        super(zl8.f36184a, true);
        this.f33150r = zl8;
        this.f33149k = activity;
    }

    /* renamed from: a */
    public final void mo28979a() throws RemoteException {
        ((ef8) cu4.m43221k(this.f33150r.f36184a.f21816i)).onActivityResumed(gf4.m44716s1(this.f33149k), this.f28895d);
    }
}
