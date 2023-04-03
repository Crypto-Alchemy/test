package p000;

import android.content.Intent;

/* renamed from: u18 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class u18 extends a28 {

    /* renamed from: a */
    public final /* synthetic */ Intent f34440a;

    /* renamed from: d */
    public final /* synthetic */ qg3 f34441d;

    public u18(Intent intent, qg3 qg3, int i) {
        this.f34440a = intent;
        this.f34441d = qg3;
    }

    /* renamed from: a */
    public final void mo28796a() {
        Intent intent = this.f34440a;
        if (intent != null) {
            this.f34441d.startActivityForResult(intent, 2);
        }
    }
}
