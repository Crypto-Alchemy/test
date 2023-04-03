package p000;

import android.app.Dialog;

/* renamed from: y28 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class y28 extends a08 {

    /* renamed from: a */
    public final /* synthetic */ Dialog f35751a;

    /* renamed from: b */
    public final /* synthetic */ d38 f35752b;

    public y28(d38 d38, Dialog dialog) {
        this.f35752b = d38;
        this.f35751a = dialog;
    }

    /* renamed from: a */
    public final void mo28688a() {
        this.f35752b.f28017d.mo43069o();
        if (this.f35751a.isShowing()) {
            this.f35751a.dismiss();
        }
    }
}
