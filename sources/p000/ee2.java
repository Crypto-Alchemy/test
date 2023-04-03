package p000;

import java.util.Comparator;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p018io.reactivex.exceptions.OnErrorNotImplementedException;

/* renamed from: ee2 */
/* compiled from: Functions */
public final class ee2 {

    /* renamed from: a */
    public static final jd2<Object, Object> f28593a = new C5798h();

    /* renamed from: b */
    public static final Runnable f28594b = new C5795e();

    /* renamed from: c */
    public static final C3803a9 f28595c = new C5792b();

    /* renamed from: d */
    public static final wq0<Object> f28596d = new C5793c();

    /* renamed from: e */
    public static final wq0<Throwable> f28597e = new C5796f();

    /* renamed from: f */
    public static final wq0<Throwable> f28598f = new C5803m();

    /* renamed from: g */
    public static final el3 f28599g = new C5794d();

    /* renamed from: h */
    public static final iu4<Object> f28600h = new C5805o();

    /* renamed from: i */
    public static final iu4<Object> f28601i = new C5797g();

    /* renamed from: j */
    public static final Callable<Object> f28602j = new C5802l();

    /* renamed from: k */
    public static final Comparator<Object> f28603k = new C5801k();

    /* renamed from: l */
    public static final wq0<pc6> f28604l = new C5800j();

    /* renamed from: ee2$a */
    /* compiled from: Functions */
    public static final class C5791a<T, U> implements jd2<T, U> {

        /* renamed from: a */
        public final Class<U> f28605a;

        public C5791a(Class<U> cls) {
            this.f28605a = cls;
        }

        public U apply(T t) throws Exception {
            return this.f28605a.cast(t);
        }
    }

    /* renamed from: ee2$b */
    /* compiled from: Functions */
    public static final class C5792b implements C3803a9 {
        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }
    }

    /* renamed from: ee2$c */
    /* compiled from: Functions */
    public static final class C5793c implements wq0<Object> {
        public void accept(Object obj) {
        }

        public String toString() {
            return "EmptyConsumer";
        }
    }

    /* renamed from: ee2$d */
    /* compiled from: Functions */
    public static final class C5794d implements el3 {
        public void accept(long j) {
        }
    }

    /* renamed from: ee2$e */
    /* compiled from: Functions */
    public static final class C5795e implements Runnable {
        public void run() {
        }

        public String toString() {
            return "EmptyRunnable";
        }
    }

    /* renamed from: ee2$f */
    /* compiled from: Functions */
    public static final class C5796f implements wq0<Throwable> {
        /* renamed from: a */
        public void accept(Throwable th) {
            ti5.m52312m(th);
        }
    }

    /* renamed from: ee2$g */
    /* compiled from: Functions */
    public static final class C5797g implements iu4<Object> {
        public boolean test(Object obj) {
            return false;
        }
    }

    /* renamed from: ee2$h */
    /* compiled from: Functions */
    public static final class C5798h implements jd2<Object, Object> {
        public Object apply(Object obj) {
            return obj;
        }

        public String toString() {
            return "IdentityFunction";
        }
    }

    /* renamed from: ee2$i */
    /* compiled from: Functions */
    public static final class C5799i<T, U> implements Callable<U>, jd2<T, U> {

        /* renamed from: a */
        public final U f28606a;

        public C5799i(U u) {
            this.f28606a = u;
        }

        public U apply(T t) throws Exception {
            return this.f28606a;
        }

        public U call() throws Exception {
            return this.f28606a;
        }
    }

    /* renamed from: ee2$j */
    /* compiled from: Functions */
    public static final class C5800j implements wq0<pc6> {
        /* renamed from: a */
        public void accept(pc6 pc6) throws Exception {
            pc6.request(Long.MAX_VALUE);
        }
    }

    /* renamed from: ee2$k */
    /* compiled from: Functions */
    public static final class C5801k implements Comparator<Object> {
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* renamed from: ee2$l */
    /* compiled from: Functions */
    public static final class C5802l implements Callable<Object> {
        public Object call() {
            return null;
        }
    }

    /* renamed from: ee2$m */
    /* compiled from: Functions */
    public static final class C5803m implements wq0<Throwable> {
        /* renamed from: a */
        public void accept(Throwable th) {
            ti5.m52312m(new OnErrorNotImplementedException(th));
        }
    }

    /* renamed from: ee2$n */
    /* compiled from: Functions */
    public static final class C5804n<T> implements jd2<T, lq6<T>> {

        /* renamed from: a */
        public final TimeUnit f28607a;

        /* renamed from: d */
        public final nm5 f28608d;

        public C5804n(TimeUnit timeUnit, nm5 nm5) {
            this.f28607a = timeUnit;
            this.f28608d = nm5;
        }

        /* renamed from: a */
        public lq6<T> apply(T t) throws Exception {
            return new lq6<>(t, this.f28608d.mo46105b(this.f28607a), this.f28607a);
        }
    }

    /* renamed from: ee2$o */
    /* compiled from: Functions */
    public static final class C5805o implements iu4<Object> {
        public boolean test(Object obj) {
            return true;
        }
    }

    /* renamed from: a */
    public static <T, U> jd2<T, U> m43948a(Class<U> cls) {
        return new C5791a(cls);
    }

    /* renamed from: b */
    public static <T> wq0<T> m43949b() {
        return f28596d;
    }

    /* renamed from: c */
    public static <T> jd2<T, T> m43950c() {
        return f28593a;
    }

    /* renamed from: d */
    public static <T> Callable<T> m43951d(T t) {
        return new C5799i(t);
    }

    /* renamed from: e */
    public static <T> jd2<T, lq6<T>> m43952e(TimeUnit timeUnit, nm5 nm5) {
        return new C5804n(timeUnit, nm5);
    }
}
