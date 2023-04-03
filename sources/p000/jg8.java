package p000;

import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: jg8 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@19.0.0 */
public final class jg8 extends fk8 {

    /* renamed from: k */
    public final /* synthetic */ String f30492k;

    /* renamed from: r */
    public final /* synthetic */ String f30493r;

    /* renamed from: s */
    public final /* synthetic */ Bundle f30494s;

    /* renamed from: x */
    public final /* synthetic */ cm8 f30495x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jg8(cm8 cm8, String str, String str2, Bundle bundle) {
        super(cm8, true);
        this.f30495x = cm8;
        this.f30492k = str;
        this.f30493r = str2;
        this.f30494s = bundle;
    }

    /* renamed from: a */
    public final void mo28979a() throws RemoteException {
        ((ef8) cu4.m43221k(this.f30495x.f21816i)).clearConditionalUserProperty(this.f30492k, this.f30493r, this.f30494s);
    }
}
