package p000;

import java.util.concurrent.Executor;

/* renamed from: yu8 */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final class yu8 implements sg9 {

    /* renamed from: a */
    public final Executor f35928a;

    /* renamed from: b */
    public final Object f35929b = new Object();

    /* renamed from: c */
    public ah4 f35930c;

    public yu8(Executor executor, ah4 ah4) {
        this.f35928a = executor;
        this.f35930c = ah4;
    }

    /* renamed from: b */
    public final void mo28891b(tl6 tl6) {
        if (tl6.mo48143n()) {
            synchronized (this.f35929b) {
                if (this.f35930c != null) {
                    this.f35928a.execute(new ds8(this));
                }
            }
        }
    }
}
