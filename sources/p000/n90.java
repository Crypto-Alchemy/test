package p000;

import android.os.Handler;
import android.os.Looper;

/* renamed from: n90 */
/* compiled from: Callback */
public abstract class n90<E> {
    private boolean canceled = false;

    /* renamed from: n90$a */
    /* compiled from: Callback */
    public class C9722a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Object f46527a;

        public C9722a(Object obj) {
            this.f46527a = obj;
        }

        public void run() {
            n90.this.success(this.f46527a);
        }
    }

    public void cancel() {
        this.canceled = true;
    }

    public void internalSuccess(E e) {
        if (!this.canceled) {
            new Handler(Looper.getMainLooper()).post(new C9722a(e));
        }
    }

    public abstract void success(E e);
}
