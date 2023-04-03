package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: y71 */
/* compiled from: DefaultExecutorSupplier */
public class y71 implements yu1 {

    /* renamed from: a */
    public final Executor f20059a = Executors.newFixedThreadPool(2, new iv4(10, "FrescoIoBoundExecutor", true));

    /* renamed from: b */
    public final Executor f20060b;

    /* renamed from: c */
    public final Executor f20061c;

    /* renamed from: d */
    public final Executor f20062d;

    /* renamed from: e */
    public final ScheduledExecutorService f20063e;

    public y71(int i) {
        this.f20060b = Executors.newFixedThreadPool(i, new iv4(10, "FrescoDecodeExecutor", true));
        this.f20061c = Executors.newFixedThreadPool(i, new iv4(10, "FrescoBackgroundExecutor", true));
        this.f20063e = Executors.newScheduledThreadPool(i, new iv4(10, "FrescoBackgroundExecutor", true));
        this.f20062d = Executors.newFixedThreadPool(1, new iv4(10, "FrescoLightWeightBackgroundExecutor", true));
    }

    /* renamed from: a */
    public Executor mo27971a() {
        return this.f20062d;
    }

    /* renamed from: b */
    public Executor mo27972b() {
        return this.f20059a;
    }

    /* renamed from: c */
    public ScheduledExecutorService mo27973c() {
        return this.f20063e;
    }

    /* renamed from: d */
    public Executor mo27974d() {
        return this.f20060b;
    }

    /* renamed from: e */
    public Executor mo27975e() {
        return this.f20061c;
    }

    /* renamed from: f */
    public Executor mo27976f() {
        return this.f20059a;
    }

    /* renamed from: g */
    public Executor mo27977g() {
        return this.f20059a;
    }
}
