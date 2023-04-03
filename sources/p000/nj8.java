package p000;

import android.os.RemoteException;

/* renamed from: nj8 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@19.0.0 */
public final class nj8 extends fk8 {

    /* renamed from: k */
    public final /* synthetic */ boolean f32138k;

    /* renamed from: r */
    public final /* synthetic */ cm8 f32139r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nj8(cm8 cm8, boolean z) {
        super(cm8, true);
        this.f32139r = cm8;
        this.f32138k = z;
    }

    /* renamed from: a */
    public final void mo28979a() throws RemoteException {
        ((ef8) cu4.m43221k(this.f32139r.f21816i)).setDataCollectionEnabled(this.f32138k);
    }
}
