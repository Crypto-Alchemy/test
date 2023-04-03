package p000;

import android.os.Looper;
import android.os.Message;

/* renamed from: gz7 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class gz7 extends s38 {

    /* renamed from: a */
    public final /* synthetic */ iz7 f29407a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gz7(iz7 iz7, Looper looper) {
        super(looper);
        this.f29407a = iz7;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            iz7.m46069p(this.f29407a);
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown message id: ");
            sb.append(i);
        } else {
            iz7.m46068o(this.f29407a);
        }
    }
}
