package p000;

import android.os.Bundle;
import p000.C3966co;

/* renamed from: rh8 */
/* compiled from: com.google.android.gms:play-services-measurement-api@@19.0.0 */
public final class rh8 implements C3966co.C3967a {

    /* renamed from: a */
    public final /* synthetic */ dl8 f33437a;

    public rh8(dl8 dl8) {
        this.f33437a = dl8;
    }

    /* renamed from: a */
    public final void mo28920a(String str, String str2, Bundle bundle, long j) {
        if (this.f33437a.f28247a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("events", ke8.m47051f(str2));
            this.f33437a.f28248b.mo47274a(2, bundle2);
        }
    }
}
