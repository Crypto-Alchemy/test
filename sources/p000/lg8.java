package p000;

import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: lg8 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@19.0.0 */
public final class lg8 extends fk8 {

    /* renamed from: k */
    public final /* synthetic */ String f31311k;

    /* renamed from: r */
    public final /* synthetic */ String f31312r;

    /* renamed from: s */
    public final /* synthetic */ ud8 f31313s;

    /* renamed from: x */
    public final /* synthetic */ cm8 f31314x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lg8(cm8 cm8, String str, String str2, ud8 ud8) {
        super(cm8, true);
        this.f31314x = cm8;
        this.f31311k = str;
        this.f31312r = str2;
        this.f31313s = ud8;
    }

    /* renamed from: a */
    public final void mo28979a() throws RemoteException {
        ((ef8) cu4.m43221k(this.f31314x.f21816i)).getConditionalUserProperties(this.f31311k, this.f31312r, this.f31313s);
    }

    /* renamed from: b */
    public final void mo42597b() {
        this.f31313s.mo43180X0((Bundle) null);
    }
}
