package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: jm6 */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final class jm6 {
    /* renamed from: a */
    public static <TResult> TResult m46615a(tl6<TResult> tl6) throws ExecutionException, InterruptedException {
        cu4.m43219i();
        cu4.m43222l(tl6, "Task must not be null");
        if (tl6.mo48144o()) {
            return m46622h(tl6);
        }
        g68 g68 = new g68((z58) null);
        m46623i(tl6, g68);
        g68.mo42788b();
        return m46622h(tl6);
    }

    /* renamed from: b */
    public static <TResult> TResult m46616b(tl6<TResult> tl6, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        cu4.m43219i();
        cu4.m43222l(tl6, "Task must not be null");
        cu4.m43222l(timeUnit, "TimeUnit must not be null");
        if (tl6.mo48144o()) {
            return m46622h(tl6);
        }
        g68 g68 = new g68((z58) null);
        m46623i(tl6, g68);
        if (g68.mo42789d(j, timeUnit)) {
            return m46622h(tl6);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @Deprecated
    /* renamed from: c */
    public static <TResult> tl6<TResult> m46617c(Executor executor, Callable<TResult> callable) {
        cu4.m43222l(executor, "Executor must not be null");
        cu4.m43222l(callable, "Callback must not be null");
        uj9 uj9 = new uj9();
        executor.execute(new sk9(uj9, callable));
        return uj9;
    }

    /* renamed from: d */
    public static <TResult> tl6<TResult> m46618d(Exception exc) {
        uj9 uj9 = new uj9();
        uj9.mo48402s(exc);
        return uj9;
    }

    /* renamed from: e */
    public static <TResult> tl6<TResult> m46619e(TResult tresult) {
        uj9 uj9 = new uj9();
        uj9.mo48403t(tresult);
        return uj9;
    }

    /* renamed from: f */
    public static tl6<Void> m46620f(Collection<? extends tl6<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return m46619e((Object) null);
        }
        for (tl6 tl6 : collection) {
            if (tl6 == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        uj9 uj9 = new uj9();
        v68 v68 = new v68(collection.size(), uj9);
        for (tl6 i : collection) {
            m46623i(i, v68);
        }
        return uj9;
    }

    /* renamed from: g */
    public static tl6<Void> m46621g(tl6<?>... tl6Arr) {
        if (tl6Arr == null || tl6Arr.length == 0) {
            return m46619e((Object) null);
        }
        return m46620f(Arrays.asList(tl6Arr));
    }

    /* renamed from: h */
    public static Object m46622h(tl6 tl6) throws ExecutionException {
        if (tl6.mo48145p()) {
            return tl6.mo48141l();
        }
        if (tl6.mo48143n()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(tl6.mo48140k());
    }

    /* renamed from: i */
    public static void m46623i(tl6 tl6, o68 o68) {
        Executor executor = em6.f28635b;
        tl6.mo48136g(executor, o68);
        tl6.mo48134e(executor, o68);
        tl6.mo48130a(executor, o68);
    }
}
