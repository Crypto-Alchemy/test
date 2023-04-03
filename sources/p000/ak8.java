package p000;

import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: ak8 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@19.0.0 */
public final class ak8 extends fk8 {

    /* renamed from: A */
    public final /* synthetic */ boolean f20966A;

    /* renamed from: B */
    public final /* synthetic */ cm8 f20967B;

    /* renamed from: k */
    public final /* synthetic */ Long f20968k;

    /* renamed from: r */
    public final /* synthetic */ String f20969r;

    /* renamed from: s */
    public final /* synthetic */ String f20970s;

    /* renamed from: x */
    public final /* synthetic */ Bundle f20971x;

    /* renamed from: y */
    public final /* synthetic */ boolean f20972y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ak8(cm8 cm8, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(cm8, true);
        this.f20967B = cm8;
        this.f20968k = l;
        this.f20969r = str;
        this.f20970s = str2;
        this.f20971x = bundle;
        this.f20972y = z;
        this.f20966A = z2;
    }

    /* renamed from: a */
    public final void mo28979a() throws RemoteException {
        long j;
        Long l = this.f20968k;
        if (l == null) {
            j = this.f28894a;
        } else {
            j = l.longValue();
        }
        ((ef8) cu4.m43221k(this.f20967B.f21816i)).logEvent(this.f20969r, this.f20970s, this.f20971x, this.f20972y, this.f20966A, j);
    }
}
