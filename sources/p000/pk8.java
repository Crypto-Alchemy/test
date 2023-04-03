package p000;

import android.app.Activity;
import android.os.RemoteException;

/* renamed from: pk8 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@19.0.0 */
public final class pk8 extends fk8 {

    /* renamed from: k */
    public final /* synthetic */ Activity f32723k;

    /* renamed from: r */
    public final /* synthetic */ zl8 f32724r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pk8(zl8 zl8, Activity activity) {
        super(zl8.f36184a, true);
        this.f32724r = zl8;
        this.f32723k = activity;
    }

    /* renamed from: a */
    public final void mo28979a() throws RemoteException {
        ((ef8) cu4.m43221k(this.f32724r.f36184a.f21816i)).onActivityStarted(gf4.m44716s1(this.f32723k), this.f28895d);
    }
}
