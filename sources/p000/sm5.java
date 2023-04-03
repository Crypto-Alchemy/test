package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p018io.reactivex.internal.schedulers.C5992b;
import p018io.reactivex.internal.schedulers.ExecutorScheduler;

/* renamed from: sm5 */
/* compiled from: Schedulers */
public final class sm5 {

    /* renamed from: a */
    public static final nm5 f33954a = ti5.m52307h(new C6497h());

    /* renamed from: b */
    public static final nm5 f33955b = ti5.m52304e(new C6491b());

    /* renamed from: c */
    public static final nm5 f33956c = ti5.m52305f(new C6492c());

    /* renamed from: d */
    public static final nm5 f33957d = mt6.m48474d();

    /* renamed from: e */
    public static final nm5 f33958e = ti5.m52306g(new C6495f());

    /* renamed from: sm5$a */
    /* compiled from: Schedulers */
    public static final class C6490a {

        /* renamed from: a */
        public static final nm5 f33959a = new go0();
    }

    /* renamed from: sm5$b */
    /* compiled from: Schedulers */
    public static final class C6491b implements Callable<nm5> {
        /* renamed from: a */
        public nm5 call() throws Exception {
            return C6490a.f33959a;
        }
    }

    /* renamed from: sm5$c */
    /* compiled from: Schedulers */
    public static final class C6492c implements Callable<nm5> {
        /* renamed from: a */
        public nm5 call() throws Exception {
            return C6493d.f33960a;
        }
    }

    /* renamed from: sm5$d */
    /* compiled from: Schedulers */
    public static final class C6493d {

        /* renamed from: a */
        public static final nm5 f33960a = new my2();
    }

    /* renamed from: sm5$e */
    /* compiled from: Schedulers */
    public static final class C6494e {

        /* renamed from: a */
        public static final nm5 f33961a = new m64();
    }

    /* renamed from: sm5$f */
    /* compiled from: Schedulers */
    public static final class C6495f implements Callable<nm5> {
        /* renamed from: a */
        public nm5 call() throws Exception {
            return C6494e.f33961a;
        }
    }

    /* renamed from: sm5$g */
    /* compiled from: Schedulers */
    public static final class C6496g {

        /* renamed from: a */
        public static final nm5 f33962a = new C5992b();
    }

    /* renamed from: sm5$h */
    /* compiled from: Schedulers */
    public static final class C6497h implements Callable<nm5> {
        /* renamed from: a */
        public nm5 call() throws Exception {
            return C6496g.f33962a;
        }
    }

    /* renamed from: a */
    public static nm5 m51860a() {
        return ti5.m52311l(f33955b);
    }

    /* renamed from: b */
    public static nm5 m51861b(Executor executor) {
        return new ExecutorScheduler(executor);
    }

    /* renamed from: c */
    public static nm5 m51862c() {
        return ti5.m52314o(f33954a);
    }
}
