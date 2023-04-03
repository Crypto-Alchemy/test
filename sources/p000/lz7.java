package p000;

import android.os.Looper;
import android.os.Message;

/* renamed from: lz7 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class lz7 extends s38 {

    /* renamed from: a */
    public final /* synthetic */ mz7 f31463a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lz7(mz7 mz7, Looper looper) {
        super(looper);
        this.f31463a = mz7;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            ((kz7) message.obj).mo45316b(this.f31463a);
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown message id: ");
            sb.append(i);
        } else {
            throw ((RuntimeException) message.obj);
        }
    }
}
