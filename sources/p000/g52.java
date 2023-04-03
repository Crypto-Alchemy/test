package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p018io.reactivex.BackpressureStrategy;
import p018io.reactivex.internal.operators.flowable.C5985a;
import p018io.reactivex.internal.operators.flowable.FlowableCombineLatest;
import p018io.reactivex.internal.operators.flowable.FlowableConcatArray;
import p018io.reactivex.internal.operators.flowable.FlowableCreate;
import p018io.reactivex.internal.operators.flowable.FlowableDebounceTimed;
import p018io.reactivex.internal.operators.flowable.FlowableFlatMap;
import p018io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe;
import p018io.reactivex.internal.operators.flowable.FlowableFlattenIterable;
import p018io.reactivex.internal.operators.flowable.FlowableObserveOn;
import p018io.reactivex.internal.operators.flowable.FlowableOnBackpressureBuffer;
import p018io.reactivex.internal.operators.flowable.FlowableOnBackpressureLatest;
import p018io.reactivex.internal.operators.flowable.FlowableSubscribeOn;
import p018io.reactivex.internal.operators.flowable.FlowableTimer;
import p018io.reactivex.internal.subscribers.StrictSubscriber;

/* renamed from: g52 */
/* compiled from: Flowable */
public abstract class g52<T> implements vy4<T> {

    /* renamed from: a */
    public static final int f29075a = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    /* renamed from: B */
    public static <T> g52<T> m44524B(Callable<? extends T> callable) {
        af4.m31828d(callable, "supplier is null");
        return ti5.m52309j(new p52(callable));
    }

    /* renamed from: C */
    public static <T> g52<T> m44525C(vy4<? extends T> vy4) {
        if (vy4 instanceof g52) {
            return ti5.m52309j((g52) vy4);
        }
        af4.m31828d(vy4, "publisher is null");
        return ti5.m52309j(new q52(vy4));
    }

    /* renamed from: O */
    public static g52<Long> m44526O(long j, TimeUnit timeUnit, nm5 nm5) {
        af4.m31828d(timeUnit, "unit is null");
        af4.m31828d(nm5, "scheduler is null");
        return ti5.m52309j(new FlowableTimer(Math.max(0, j), timeUnit, nm5));
    }

    /* renamed from: c */
    public static int m44527c() {
        return f29075a;
    }

    /* renamed from: e */
    public static <T, R> g52<R> m44528e(Iterable<? extends vy4<? extends T>> iterable, jd2<? super Object[], ? extends R> jd2) {
        return m44529f(iterable, jd2, m44527c());
    }

    /* renamed from: f */
    public static <T, R> g52<R> m44529f(Iterable<? extends vy4<? extends T>> iterable, jd2<? super Object[], ? extends R> jd2, int i) {
        af4.m31828d(iterable, "sources is null");
        af4.m31828d(jd2, "combiner is null");
        af4.m31829e(i, "bufferSize");
        return ti5.m52309j(new FlowableCombineLatest(iterable, jd2, i, false));
    }

    /* renamed from: h */
    public static <T> g52<T> m44530h(vy4<? extends T> vy4, vy4<? extends T> vy42) {
        af4.m31828d(vy4, "source1 is null");
        af4.m31828d(vy42, "source2 is null");
        return m44531i(vy4, vy42);
    }

    /* renamed from: i */
    public static <T> g52<T> m44531i(vy4<? extends T>... vy4Arr) {
        if (vy4Arr.length == 0) {
            return m44534r();
        }
        if (vy4Arr.length == 1) {
            return m44525C(vy4Arr[0]);
        }
        return ti5.m52309j(new FlowableConcatArray(vy4Arr, false));
    }

    /* renamed from: j */
    public static <T> g52<T> m44532j(u52<T> u52, BackpressureStrategy backpressureStrategy) {
        af4.m31828d(u52, "source is null");
        af4.m31828d(backpressureStrategy, "mode is null");
        return ti5.m52309j(new FlowableCreate(u52, backpressureStrategy));
    }

    /* renamed from: l */
    public static <T> g52<T> m44533l(Callable<? extends vy4<? extends T>> callable) {
        af4.m31828d(callable, "supplier is null");
        return ti5.m52309j(new h52(callable));
    }

    /* renamed from: r */
    public static <T> g52<T> m44534r() {
        return ti5.m52309j(m52.f31511d);
    }

    /* renamed from: s */
    public static <T> g52<T> m44535s(Throwable th) {
        af4.m31828d(th, "throwable is null");
        return m44536t(ee2.m43951d(th));
    }

    /* renamed from: t */
    public static <T> g52<T> m44536t(Callable<? extends Throwable> callable) {
        af4.m31828d(callable, "errorSupplier is null");
        return ti5.m52309j(new n52(callable));
    }

    /* renamed from: A */
    public final <R> g52<R> mo42752A(jd2<? super T, ? extends up3<? extends R>> jd2, boolean z, int i) {
        af4.m31828d(jd2, "mapper is null");
        af4.m31829e(i, "maxConcurrency");
        return ti5.m52309j(new FlowableFlatMapMaybe(this, jd2, z, i));
    }

    /* renamed from: D */
    public final <R> g52<R> mo42753D(jd2<? super T, ? extends R> jd2) {
        af4.m31828d(jd2, "mapper is null");
        return ti5.m52309j(new C5985a(this, jd2));
    }

    /* renamed from: E */
    public final g52<T> mo42754E(nm5 nm5) {
        return mo42755F(nm5, false, m44527c());
    }

    /* renamed from: F */
    public final g52<T> mo42755F(nm5 nm5, boolean z, int i) {
        af4.m31828d(nm5, "scheduler is null");
        af4.m31829e(i, "bufferSize");
        return ti5.m52309j(new FlowableObserveOn(this, nm5, z, i));
    }

    /* renamed from: G */
    public final g52<T> mo42756G() {
        return mo42757H(m44527c(), false, true);
    }

    /* renamed from: H */
    public final g52<T> mo42757H(int i, boolean z, boolean z2) {
        af4.m31829e(i, "bufferSize");
        return ti5.m52309j(new FlowableOnBackpressureBuffer(this, i, z2, z, ee2.f28595c));
    }

    /* renamed from: I */
    public final g52<T> mo42758I() {
        return ti5.m52309j(new FlowableOnBackpressureLatest(this));
    }

    /* renamed from: J */
    public final void mo42759J(y52<? super T> y52) {
        af4.m31828d(y52, "s is null");
        try {
            nc6<? super Object> q = ti5.m52316q(this, y52);
            af4.m31828d(q, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo42760K(q);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            ou1.m49570a(th);
            ti5.m52312m(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: K */
    public abstract void mo42760K(nc6<? super T> nc6);

    /* renamed from: L */
    public final g52<T> mo42761L(nm5 nm5) {
        af4.m31828d(nm5, "scheduler is null");
        return mo42762M(nm5, !(this instanceof FlowableCreate));
    }

    /* renamed from: M */
    public final g52<T> mo42762M(nm5 nm5, boolean z) {
        af4.m31828d(nm5, "scheduler is null");
        return ti5.m52309j(new FlowableSubscribeOn(this, nm5, z));
    }

    /* renamed from: N */
    public final g52<T> mo42763N(long j, TimeUnit timeUnit, nm5 nm5) {
        return mo42768k(j, timeUnit, nm5);
    }

    /* renamed from: P */
    public final g52<lq6<T>> mo42764P(nm5 nm5) {
        return mo42765Q(TimeUnit.MILLISECONDS, nm5);
    }

    /* renamed from: Q */
    public final g52<lq6<T>> mo42765Q(TimeUnit timeUnit, nm5 nm5) {
        af4.m31828d(timeUnit, "unit is null");
        af4.m31828d(nm5, "scheduler is null");
        return mo42753D(ee2.m43952e(timeUnit, nm5));
    }

    /* renamed from: a */
    public final void mo40232a(nc6<? super T> nc6) {
        if (nc6 instanceof y52) {
            mo42759J((y52) nc6);
            return;
        }
        af4.m31828d(nc6, "s is null");
        mo42759J(new StrictSubscriber(nc6));
    }

    /* renamed from: d */
    public final <U> g52<U> mo42766d(Class<U> cls) {
        af4.m31828d(cls, "clazz is null");
        return mo42753D(ee2.m43948a(cls));
    }

    /* renamed from: g */
    public final <R> g52<R> mo42767g(z52<? super T, ? extends R> z52) {
        return m44525C(((z52) af4.m31828d(z52, "composer is null")).mo49478a(this));
    }

    /* renamed from: k */
    public final g52<T> mo42768k(long j, TimeUnit timeUnit, nm5 nm5) {
        af4.m31828d(timeUnit, "unit is null");
        af4.m31828d(nm5, "scheduler is null");
        return ti5.m52309j(new FlowableDebounceTimed(this, j, timeUnit, nm5));
    }

    /* renamed from: m */
    public final g52<T> mo42769m(e10<? super T, ? super T> e10) {
        af4.m31828d(e10, "comparer is null");
        return ti5.m52309j(new i52(this, ee2.m43950c(), e10));
    }

    /* renamed from: n */
    public final g52<T> mo42770n(wq0<? super T> wq0, wq0<? super Throwable> wq02, C3803a9 a9Var, C3803a9 a9Var2) {
        af4.m31828d(wq0, "onNext is null");
        af4.m31828d(wq02, "onError is null");
        af4.m31828d(a9Var, "onComplete is null");
        af4.m31828d(a9Var2, "onAfterTerminate is null");
        return ti5.m52309j(new j52(this, wq0, wq02, a9Var, a9Var2));
    }

    /* renamed from: o */
    public final g52<T> mo42771o(wq0<? super pc6> wq0, el3 el3, C3803a9 a9Var) {
        af4.m31828d(wq0, "onSubscribe is null");
        af4.m31828d(el3, "onRequest is null");
        af4.m31828d(a9Var, "onCancel is null");
        return ti5.m52309j(new k52(this, wq0, el3, a9Var));
    }

    /* renamed from: p */
    public final g52<T> mo42772p(wq0<? super T> wq0) {
        wq0 b = ee2.m43949b();
        C3803a9 a9Var = ee2.f28595c;
        return mo42770n(wq0, b, a9Var, a9Var);
    }

    /* renamed from: q */
    public final g52<T> mo42773q(wq0<? super pc6> wq0) {
        return mo42771o(wq0, ee2.f28599g, ee2.f28595c);
    }

    /* renamed from: u */
    public final g52<T> mo42774u(iu4<? super T> iu4) {
        af4.m31828d(iu4, "predicate is null");
        return ti5.m52309j(new o52(this, iu4));
    }

    /* renamed from: v */
    public final <R> g52<R> mo42775v(jd2<? super T, ? extends vy4<? extends R>> jd2) {
        return mo42776w(jd2, false, m44527c(), m44527c());
    }

    /* renamed from: w */
    public final <R> g52<R> mo42776w(jd2<? super T, ? extends vy4<? extends R>> jd2, boolean z, int i, int i2) {
        af4.m31828d(jd2, "mapper is null");
        af4.m31829e(i, "maxConcurrency");
        af4.m31829e(i2, "bufferSize");
        if (!(this instanceof ml5)) {
            return ti5.m52309j(new FlowableFlatMap(this, jd2, z, i, i2));
        }
        Object call = ((ml5) this).call();
        if (call == null) {
            return m44534r();
        }
        return w52.m53703a(call, jd2);
    }

    /* renamed from: x */
    public final <U> g52<U> mo42777x(jd2<? super T, ? extends Iterable<? extends U>> jd2) {
        return mo42778y(jd2, m44527c());
    }

    /* renamed from: y */
    public final <U> g52<U> mo42778y(jd2<? super T, ? extends Iterable<? extends U>> jd2, int i) {
        af4.m31828d(jd2, "mapper is null");
        af4.m31829e(i, "bufferSize");
        return ti5.m52309j(new FlowableFlattenIterable(this, jd2, i));
    }

    /* renamed from: z */
    public final <R> g52<R> mo42779z(jd2<? super T, ? extends up3<? extends R>> jd2) {
        return mo42752A(jd2, false, Integer.MAX_VALUE);
    }
}
