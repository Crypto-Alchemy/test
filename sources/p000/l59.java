package p000;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzas;

/* renamed from: l59 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class l59 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f31189a;

    /* renamed from: d */
    public final /* synthetic */ String f31190d = "_err";

    /* renamed from: e */
    public final /* synthetic */ Bundle f31191e;

    /* renamed from: g */
    public final /* synthetic */ o59 f31192g;

    public l59(o59 o59, String str, String str2, Bundle bundle) {
        this.f31192g = o59;
        this.f31189a = str;
        this.f31191e = bundle;
    }

    public final void run() {
        this.f31192g.f32283a.mo47669h0((zzas) cu4.m43221k(this.f31192g.f32283a.mo47659c0().mo42794J(this.f31189a, this.f31190d, this.f31191e, "auto", this.f31192g.f32283a.mo45256a().mo29580a(), false, false)), this.f31189a);
    }
}
