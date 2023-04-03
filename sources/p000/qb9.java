package p000;

import android.os.Bundle;
import com.google.android.gms.cloudmessaging.zzp;

/* renamed from: qb9 */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public final class qb9 extends tg9<Void> {
    public qb9(int i, int i2, Bundle bundle) {
        super(i, 2, bundle);
    }

    /* renamed from: a */
    public final void mo45802a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            mo48113c(null);
        } else {
            mo48112b(new zzp(4, "Invalid response to one way request"));
        }
    }

    /* renamed from: d */
    public final boolean mo45803d() {
        return true;
    }
}
