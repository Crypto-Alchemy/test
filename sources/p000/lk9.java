package p000;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.cloudmessaging.C4008a;

/* renamed from: lk9 */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public final class lk9 extends ml8 {

    /* renamed from: a */
    public final /* synthetic */ C4008a f31333a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lk9(C4008a aVar, Looper looper) {
        super(looper);
        this.f31333a = aVar;
    }

    public final void handleMessage(Message message) {
        this.f31333a.mo30444h(message);
    }
}
