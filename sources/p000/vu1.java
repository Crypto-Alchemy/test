package p000;

import java.util.concurrent.Executor;

/* renamed from: vu1 */
/* compiled from: ExecutionModule_ExecutorFactory */
public final class vu1 implements sy1<Executor> {

    /* renamed from: vu1$a */
    /* compiled from: ExecutionModule_ExecutorFactory */
    public static final class C6636a {

        /* renamed from: a */
        public static final vu1 f35159a = new vu1();
    }

    /* renamed from: a */
    public static vu1 m53542a() {
        return C6636a.f35159a;
    }

    /* renamed from: b */
    public static Executor m53543b() {
        return (Executor) bu4.m32727c(uu1.m53018a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: c */
    public Executor get() {
        return m53543b();
    }
}
