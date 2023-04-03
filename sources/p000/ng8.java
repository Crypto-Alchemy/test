package p000;

import android.app.Activity;
import android.os.RemoteException;

/* renamed from: ng8 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@19.0.0 */
public final class ng8 extends fk8 {

    /* renamed from: k */
    public final /* synthetic */ Activity f32115k;

    /* renamed from: r */
    public final /* synthetic */ String f32116r;

    /* renamed from: s */
    public final /* synthetic */ String f32117s;

    /* renamed from: x */
    public final /* synthetic */ cm8 f32118x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ng8(cm8 cm8, Activity activity, String str, String str2) {
        super(cm8, true);
        this.f32118x = cm8;
        this.f32115k = activity;
        this.f32116r = str;
        this.f32117s = str2;
    }

    /* renamed from: a */
    public final void mo28979a() throws RemoteException {
        ((ef8) cu4.m43221k(this.f32118x.f21816i)).setCurrentScreen(gf4.m44716s1(this.f32115k), this.f32116r, this.f32117s, this.f28894a);
    }
}
