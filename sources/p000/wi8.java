package p000;

import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: wi8 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@19.0.0 */
public final class wi8 extends fk8 {

    /* renamed from: k */
    public final /* synthetic */ String f35333k;

    /* renamed from: r */
    public final /* synthetic */ String f35334r;

    /* renamed from: s */
    public final /* synthetic */ boolean f35335s;

    /* renamed from: x */
    public final /* synthetic */ ud8 f35336x;

    /* renamed from: y */
    public final /* synthetic */ cm8 f35337y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wi8(cm8 cm8, String str, String str2, boolean z, ud8 ud8) {
        super(cm8, true);
        this.f35337y = cm8;
        this.f35333k = str;
        this.f35334r = str2;
        this.f35335s = z;
        this.f35336x = ud8;
    }

    /* renamed from: a */
    public final void mo28979a() throws RemoteException {
        ((ef8) cu4.m43221k(this.f35337y.f21816i)).getUserProperties(this.f35333k, this.f35334r, this.f35335s, this.f35336x);
    }

    /* renamed from: b */
    public final void mo42597b() {
        this.f35336x.mo43180X0((Bundle) null);
    }
}
