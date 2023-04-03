package p000;

import java.util.concurrent.ThreadFactory;
import p000.nm5;
import p018io.reactivex.internal.schedulers.C5991a;
import p018io.reactivex.internal.schedulers.RxThreadFactory;

/* renamed from: m64 */
/* compiled from: NewThreadScheduler */
public final class m64 extends nm5 {

    /* renamed from: c */
    public static final RxThreadFactory f31522c = new RxThreadFactory("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    /* renamed from: b */
    public final ThreadFactory f31523b;

    public m64() {
        this(f31522c);
    }

    /* renamed from: a */
    public nm5.C6288b mo42927a() {
        return new C5991a(this.f31523b);
    }

    public m64(ThreadFactory threadFactory) {
        this.f31523b = threadFactory;
    }
}
