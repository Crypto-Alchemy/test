package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: qf5 */
/* compiled from: ResourceRecycler */
public class qf5 {

    /* renamed from: a */
    public boolean f16935a;

    /* renamed from: b */
    public final Handler f16936b = new Handler(Looper.getMainLooper(), new C3145a());

    /* renamed from: qf5$a */
    /* compiled from: ResourceRecycler */
    public static final class C3145a implements Handler.Callback {
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((bf5) message.obj).mo11634a();
            return true;
        }
    }

    /* renamed from: a */
    public synchronized void mo25092a(bf5<?> bf5, boolean z) {
        if (!this.f16935a) {
            if (!z) {
                this.f16935a = true;
                bf5.mo11634a();
                this.f16935a = false;
            }
        }
        this.f16936b.obtainMessage(1, bf5).sendToTarget();
    }
}
