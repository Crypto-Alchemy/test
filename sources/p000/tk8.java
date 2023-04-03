package p000;

import android.app.Activity;
import android.os.RemoteException;

/* renamed from: tk8 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@19.0.0 */
public final class tk8 extends fk8 {

    /* renamed from: k */
    public final /* synthetic */ Activity f34297k;

    /* renamed from: r */
    public final /* synthetic */ zl8 f34298r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tk8(zl8 zl8, Activity activity) {
        super(zl8.f36184a, true);
        this.f34298r = zl8;
        this.f34297k = activity;
    }

    /* renamed from: a */
    public final void mo28979a() throws RemoteException {
        ((ef8) cu4.m43221k(this.f34298r.f36184a.f21816i)).onActivityPaused(gf4.m44716s1(this.f34297k), this.f28895d);
    }
}
