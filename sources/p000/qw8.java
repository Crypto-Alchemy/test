package p000;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: qw8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class qw8 implements d69 {

    /* renamed from: a */
    public final /* synthetic */ sx8 f33287a;

    public qw8(sx8 sx8) {
        this.f33287a = sx8;
    }

    /* renamed from: i */
    public final void mo41855i(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            sx8 sx8 = this.f33287a;
            kr8.m47472t();
            sx8.mo47920b0("auto", "_err", sx8.f34342a.mo45256a().mo29580a(), bundle, false, true, false, str);
            return;
        }
        this.f33287a.mo47916X("auto", "_err", bundle);
    }
}
