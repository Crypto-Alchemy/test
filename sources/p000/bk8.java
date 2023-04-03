package p000;

import android.os.RemoteException;

/* renamed from: bk8 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@19.0.0 */
public final class bk8 extends fk8 {

    /* renamed from: k */
    public final /* synthetic */ String f21354k;

    /* renamed from: r */
    public final /* synthetic */ String f21355r;

    /* renamed from: s */
    public final /* synthetic */ Object f21356s;

    /* renamed from: x */
    public final /* synthetic */ boolean f21357x;

    /* renamed from: y */
    public final /* synthetic */ cm8 f21358y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bk8(cm8 cm8, String str, String str2, Object obj, boolean z) {
        super(cm8, true);
        this.f21358y = cm8;
        this.f21354k = str;
        this.f21355r = str2;
        this.f21356s = obj;
        this.f21357x = z;
    }

    /* renamed from: a */
    public final void mo28979a() throws RemoteException {
        ((ef8) cu4.m43221k(this.f21358y.f21816i)).setUserProperty(this.f21354k, this.f21355r, gf4.m44716s1(this.f21356s), this.f21357x, this.f28894a);
    }
}
