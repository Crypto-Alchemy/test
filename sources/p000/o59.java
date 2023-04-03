package p000;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: o59 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class o59 implements d69 {

    /* renamed from: a */
    public final /* synthetic */ s59 f32283a;

    public o59(s59 s59) {
        this.f32283a = s59;
    }

    /* renamed from: i */
    public final void mo41855i(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f32283a.mo45272s().mo41640o(new l59(this, str, "_err", bundle));
        } else if (this.f32283a.f33728k != null) {
            this.f32283a.f33728k.mo45237A().mo29670l().mo48770b("AppId not known when logging event", "_err");
        }
    }
}
