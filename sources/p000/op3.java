package p000;

/* renamed from: op3 */
/* compiled from: Maybe */
public abstract class op3<T> implements up3<T> {
    /* renamed from: b */
    public static <T> op3<T> m49382b() {
        return ti5.m52310k(pp3.f32780a);
    }

    /* renamed from: d */
    public static <T> op3<T> m49383d(T t) {
        af4.m31828d(t, "item is null");
        return ti5.m52310k(new rp3(t));
    }

    /* renamed from: a */
    public final void mo46446a(tp3<? super T> tp3) {
        af4.m31828d(tp3, "observer is null");
        tp3<? super Object> p = ti5.m52315p(this, tp3);
        af4.m31828d(p, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            mo46449f(p);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            ou1.m49570a(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: c */
    public final op3<T> mo46447c(iu4<? super T> iu4) {
        af4.m31828d(iu4, "predicate is null");
        return ti5.m52310k(new qp3(this, iu4));
    }

    /* renamed from: e */
    public final <R> op3<R> mo46448e(jd2<? super T, ? extends R> jd2) {
        af4.m31828d(jd2, "mapper is null");
        return ti5.m52310k(new sp3(this, jd2));
    }

    /* renamed from: f */
    public abstract void mo46449f(tp3<? super T> tp3);
}
