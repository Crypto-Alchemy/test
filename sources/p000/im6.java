package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: im6 */
public final class im6 {
    /* renamed from: a */
    public static <ResultT> ul6<ResultT> m45799a(ResultT resultt) {
        cw7 cw7 = new cw7();
        cw7.mo41746g(resultt);
        return cw7;
    }

    /* renamed from: b */
    public static <ResultT> ResultT m45800b(ul6<ResultT> ul6) throws ExecutionException, InterruptedException {
        rr7.m51235d(ul6, "Task must not be null");
        if (ul6.mo41744e()) {
            return m45802d(ul6);
        }
        gw7 gw7 = new gw7((byte[]) null);
        m45803e(ul6, gw7);
        gw7.mo43013b();
        return m45802d(ul6);
    }

    /* renamed from: c */
    public static <ResultT> ul6<ResultT> m45801c(Exception exc) {
        cw7 cw7 = new cw7();
        cw7.mo41748i(exc);
        return cw7;
    }

    /* renamed from: d */
    public static <ResultT> ResultT m45802d(ul6<ResultT> ul6) throws ExecutionException {
        if (ul6.mo41745f()) {
            return ul6.mo41743d();
        }
        throw new ExecutionException(ul6.mo41742c());
    }

    /* renamed from: e */
    public static void m45803e(ul6<?> ul6, gw7 gw7) {
        Executor executor = dm6.f28252b;
        ul6.mo41741b(executor, gw7);
        ul6.mo41740a(executor, gw7);
    }
}
