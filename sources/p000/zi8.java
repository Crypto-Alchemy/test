package p000;

import android.os.RemoteException;

/* renamed from: zi8 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@19.0.0 */
public final class zi8 extends fk8 {

    /* renamed from: k */
    public final /* synthetic */ String f36162k;

    /* renamed from: r */
    public final /* synthetic */ Object f36163r;

    /* renamed from: s */
    public final /* synthetic */ cm8 f36164s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zi8(cm8 cm8, boolean z, int i, String str, Object obj, Object obj2, Object obj3) {
        super(cm8, false);
        this.f36164s = cm8;
        this.f36162k = str;
        this.f36163r = obj;
    }

    /* renamed from: a */
    public final void mo28979a() throws RemoteException {
        ((ef8) cu4.m43221k(this.f36164s.f21816i)).logHealthData(5, this.f36162k, gf4.m44716s1(this.f36163r), gf4.m44716s1(null), gf4.m44716s1(null));
    }
}
