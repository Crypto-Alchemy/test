package p000;

import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: fi8 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@19.0.0 */
public final class fi8 extends fk8 {

    /* renamed from: k */
    public final /* synthetic */ ud8 f28884k;

    /* renamed from: r */
    public final /* synthetic */ cm8 f28885r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fi8(cm8 cm8, ud8 ud8) {
        super(cm8, true);
        this.f28885r = cm8;
        this.f28884k = ud8;
    }

    /* renamed from: a */
    public final void mo28979a() throws RemoteException {
        ((ef8) cu4.m43221k(this.f28885r.f21816i)).getGmpAppId(this.f28884k);
    }

    /* renamed from: b */
    public final void mo42597b() {
        this.f28884k.mo43180X0((Bundle) null);
    }
}
