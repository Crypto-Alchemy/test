package p000;

import android.app.Activity;
import android.content.Intent;

/* renamed from: c18 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class c18 extends a28 {

    /* renamed from: a */
    public final /* synthetic */ Intent f21572a;

    /* renamed from: d */
    public final /* synthetic */ Activity f21573d;

    /* renamed from: e */
    public final /* synthetic */ int f21574e;

    public c18(Intent intent, Activity activity, int i) {
        this.f21572a = intent;
        this.f21573d = activity;
        this.f21574e = i;
    }

    /* renamed from: a */
    public final void mo28796a() {
        Intent intent = this.f21572a;
        if (intent != null) {
            this.f21573d.startActivityForResult(intent, this.f21574e);
        }
    }
}
