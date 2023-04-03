package p000;

import android.app.Activity;
import android.os.RemoteException;

/* renamed from: tl8 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@19.0.0 */
public final class tl8 extends fk8 {

    /* renamed from: k */
    public final /* synthetic */ Activity f34304k;

    /* renamed from: r */
    public final /* synthetic */ ud8 f34305r;

    /* renamed from: s */
    public final /* synthetic */ zl8 f34306s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tl8(zl8 zl8, Activity activity, ud8 ud8) {
        super(zl8.f36184a, true);
        this.f34306s = zl8;
        this.f34304k = activity;
        this.f34305r = ud8;
    }

    /* renamed from: a */
    public final void mo28979a() throws RemoteException {
        ((ef8) cu4.m43221k(this.f34306s.f36184a.f21816i)).onActivitySaveInstanceState(gf4.m44716s1(this.f34304k), this.f34305r, this.f28895d);
    }
}
