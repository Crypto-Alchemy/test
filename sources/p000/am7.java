package p000;

import java.util.concurrent.ScheduledFuture;

/* renamed from: am7 */
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final /* synthetic */ class am7 implements bh4 {

    /* renamed from: a */
    public final ScheduledFuture f20975a;

    public am7(ScheduledFuture scheduledFuture) {
        this.f20975a = scheduledFuture;
    }

    /* renamed from: a */
    public void mo29007a(tl6 tl6) {
        this.f20975a.cancel(false);
    }
}
