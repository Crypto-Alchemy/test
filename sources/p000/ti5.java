package p000;

import java.util.concurrent.Callable;
import p018io.reactivex.exceptions.CompositeException;
import p018io.reactivex.exceptions.MissingBackpressureException;
import p018io.reactivex.exceptions.OnErrorNotImplementedException;
import p018io.reactivex.exceptions.UndeliverableException;
import p018io.reactivex.internal.util.ExceptionHelper;

/* renamed from: ti5 */
/* compiled from: RxJavaPlugins */
public final class ti5 {

    /* renamed from: a */
    public static volatile wq0<? super Throwable> f34270a;

    /* renamed from: b */
    public static volatile jd2<? super Runnable, ? extends Runnable> f34271b;

    /* renamed from: c */
    public static volatile jd2<? super Callable<nm5>, ? extends nm5> f34272c;

    /* renamed from: d */
    public static volatile jd2<? super Callable<nm5>, ? extends nm5> f34273d;

    /* renamed from: e */
    public static volatile jd2<? super Callable<nm5>, ? extends nm5> f34274e;

    /* renamed from: f */
    public static volatile jd2<? super Callable<nm5>, ? extends nm5> f34275f;

    /* renamed from: g */
    public static volatile jd2<? super nm5, ? extends nm5> f34276g;

    /* renamed from: h */
    public static volatile jd2<? super nm5, ? extends nm5> f34277h;

    /* renamed from: i */
    public static volatile jd2<? super g52, ? extends g52> f34278i;

    /* renamed from: j */
    public static volatile jd2<? super op3, ? extends op3> f34279j;

    /* renamed from: k */
    public static volatile d10<? super g52, ? super nc6, ? extends nc6> f34280k;

    /* renamed from: l */
    public static volatile d10<? super op3, ? super tp3, ? extends tp3> f34281l;

    /* renamed from: a */
    public static <T, U, R> R m52300a(d10<T, U, R> d10, T t, U u) {
        try {
            return d10.apply(t, u);
        } catch (Throwable th) {
            throw ExceptionHelper.m45877d(th);
        }
    }

    /* renamed from: b */
    public static <T, R> R m52301b(jd2<T, R> jd2, T t) {
        try {
            return jd2.apply(t);
        } catch (Throwable th) {
            throw ExceptionHelper.m45877d(th);
        }
    }

    /* renamed from: c */
    public static nm5 m52302c(jd2<? super Callable<nm5>, ? extends nm5> jd2, Callable<nm5> callable) {
        return (nm5) af4.m31828d(m52301b(jd2, callable), "Scheduler Callable result can't be null");
    }

    /* renamed from: d */
    public static nm5 m52303d(Callable<nm5> callable) {
        try {
            return (nm5) af4.m31828d(callable.call(), "Scheduler Callable result can't be null");
        } catch (Throwable th) {
            throw ExceptionHelper.m45877d(th);
        }
    }

    /* renamed from: e */
    public static nm5 m52304e(Callable<nm5> callable) {
        af4.m31828d(callable, "Scheduler Callable can't be null");
        jd2<? super Callable<nm5>, ? extends nm5> jd2 = f34272c;
        if (jd2 == null) {
            return m52303d(callable);
        }
        return m52302c(jd2, callable);
    }

    /* renamed from: f */
    public static nm5 m52305f(Callable<nm5> callable) {
        af4.m31828d(callable, "Scheduler Callable can't be null");
        jd2<? super Callable<nm5>, ? extends nm5> jd2 = f34274e;
        if (jd2 == null) {
            return m52303d(callable);
        }
        return m52302c(jd2, callable);
    }

    /* renamed from: g */
    public static nm5 m52306g(Callable<nm5> callable) {
        af4.m31828d(callable, "Scheduler Callable can't be null");
        jd2<? super Callable<nm5>, ? extends nm5> jd2 = f34275f;
        if (jd2 == null) {
            return m52303d(callable);
        }
        return m52302c(jd2, callable);
    }

    /* renamed from: h */
    public static nm5 m52307h(Callable<nm5> callable) {
        af4.m31828d(callable, "Scheduler Callable can't be null");
        jd2<? super Callable<nm5>, ? extends nm5> jd2 = f34273d;
        if (jd2 == null) {
            return m52303d(callable);
        }
        return m52302c(jd2, callable);
    }

    /* renamed from: i */
    public static boolean m52308i(Throwable th) {
        if (!(th instanceof OnErrorNotImplementedException) && !(th instanceof MissingBackpressureException) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof CompositeException)) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static <T> g52<T> m52309j(g52<T> g52) {
        jd2<? super g52, ? extends g52> jd2 = f34278i;
        if (jd2 != null) {
            return (g52) m52301b(jd2, g52);
        }
        return g52;
    }

    /* renamed from: k */
    public static <T> op3<T> m52310k(op3<T> op3) {
        jd2<? super op3, ? extends op3> jd2 = f34279j;
        if (jd2 != null) {
            return (op3) m52301b(jd2, op3);
        }
        return op3;
    }

    /* renamed from: l */
    public static nm5 m52311l(nm5 nm5) {
        jd2<? super nm5, ? extends nm5> jd2 = f34276g;
        if (jd2 == null) {
            return nm5;
        }
        return (nm5) m52301b(jd2, nm5);
    }

    /* renamed from: m */
    public static void m52312m(Throwable th) {
        wq0<? super Throwable> wq0 = f34270a;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!m52308i(th)) {
            th = new UndeliverableException(th);
        }
        if (wq0 != null) {
            try {
                wq0.accept(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                m52317r(th2);
            }
        }
        th.printStackTrace();
        m52317r(th);
    }

    /* renamed from: n */
    public static Runnable m52313n(Runnable runnable) {
        af4.m31828d(runnable, "run is null");
        jd2<? super Runnable, ? extends Runnable> jd2 = f34271b;
        if (jd2 == null) {
            return runnable;
        }
        return (Runnable) m52301b(jd2, runnable);
    }

    /* renamed from: o */
    public static nm5 m52314o(nm5 nm5) {
        jd2<? super nm5, ? extends nm5> jd2 = f34277h;
        if (jd2 == null) {
            return nm5;
        }
        return (nm5) m52301b(jd2, nm5);
    }

    /* renamed from: p */
    public static <T> tp3<? super T> m52315p(op3<T> op3, tp3<? super T> tp3) {
        d10<? super op3, ? super tp3, ? extends tp3> d10 = f34281l;
        if (d10 != null) {
            return (tp3) m52300a(d10, op3, tp3);
        }
        return tp3;
    }

    /* renamed from: q */
    public static <T> nc6<? super T> m52316q(g52<T> g52, nc6<? super T> nc6) {
        d10<? super g52, ? super nc6, ? extends nc6> d10 = f34280k;
        if (d10 != null) {
            return (nc6) m52300a(d10, g52, nc6);
        }
        return nc6;
    }

    /* renamed from: r */
    public static void m52317r(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}
