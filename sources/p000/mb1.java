package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: mb1 */
/* compiled from: DelayedWorkTracker */
public class mb1 {

    /* renamed from: d */
    public static final String f14917d = qk3.m25728f("DelayedWorkTracker");

    /* renamed from: a */
    public final rj2 f14918a;

    /* renamed from: b */
    public final li5 f14919b;

    /* renamed from: c */
    public final Map<String, Runnable> f14920c = new HashMap();

    /* renamed from: mb1$a */
    /* compiled from: DelayedWorkTracker */
    public class C2820a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ an7 f14921a;

        public C2820a(an7 an7) {
            this.f14921a = an7;
        }

        public void run() {
            qk3.m25726c().mo25135a(mb1.f14917d, String.format("Scheduling work %s", new Object[]{this.f14921a.f204a}), new Throwable[0]);
            mb1.this.f14918a.mo24004c(this.f14921a);
        }
    }

    public mb1(rj2 rj2, li5 li5) {
        this.f14918a = rj2;
        this.f14919b = li5;
    }

    /* renamed from: a */
    public void mo23116a(an7 an7) {
        Runnable remove = this.f14920c.remove(an7.f204a);
        if (remove != null) {
            this.f14919b.mo22769a(remove);
        }
        C2820a aVar = new C2820a(an7);
        this.f14920c.put(an7.f204a, aVar);
        long currentTimeMillis = System.currentTimeMillis();
        this.f14919b.mo22770b(an7.mo431a() - currentTimeMillis, aVar);
    }

    /* renamed from: b */
    public void mo23117b(String str) {
        Runnable remove = this.f14920c.remove(str);
        if (remove != null) {
            this.f14919b.mo22769a(remove);
        }
    }
}
