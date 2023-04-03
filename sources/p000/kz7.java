package p000;

import java.util.concurrent.locks.Lock;

/* renamed from: kz7 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class kz7 {

    /* renamed from: a */
    public final jz7 f31140a;

    public kz7(jz7 jz7) {
        this.f31140a = jz7;
    }

    /* renamed from: a */
    public abstract void mo43042a();

    /* renamed from: b */
    public final void mo45316b(mz7 mz7) {
        Lock h;
        mz7.f31911a.lock();
        try {
            if (mz7.f31921k != this.f31140a) {
                h = mz7.f31911a;
            } else {
                mo43042a();
                h = mz7.f31911a;
            }
            h.unlock();
        } catch (Throwable th) {
            mz7.f31911a.unlock();
            throw th;
        }
    }
}
