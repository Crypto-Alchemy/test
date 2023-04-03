package p000;

import java.util.concurrent.Callable;
import p018io.reactivex.internal.subscriptions.EmptySubscription;
import p018io.reactivex.internal.subscriptions.ScalarSubscription;

/* renamed from: w52 */
/* compiled from: FlowableScalarXMap */
public final class w52 {

    /* renamed from: w52$a */
    /* compiled from: FlowableScalarXMap */
    public static final class C6642a<T, R> extends g52<R> {

        /* renamed from: d */
        public final T f35236d;

        /* renamed from: e */
        public final jd2<? super T, ? extends vy4<? extends R>> f35237e;

        public C6642a(T t, jd2<? super T, ? extends vy4<? extends R>> jd2) {
            this.f35236d = t;
            this.f35237e = jd2;
        }

        /* renamed from: K */
        public void mo42760K(nc6<? super R> nc6) {
            try {
                vy4 vy4 = (vy4) af4.m31828d(this.f35237e.apply(this.f35236d), "The mapper returned a null Publisher");
                if (vy4 instanceof Callable) {
                    try {
                        Object call = ((Callable) vy4).call();
                        if (call == null) {
                            EmptySubscription.complete(nc6);
                        } else {
                            nc6.onSubscribe(new ScalarSubscription(nc6, call));
                        }
                    } catch (Throwable th) {
                        ou1.m49570a(th);
                        EmptySubscription.error(th, nc6);
                    }
                } else {
                    vy4.mo40232a(nc6);
                }
            } catch (Throwable th2) {
                EmptySubscription.error(th2, nc6);
            }
        }
    }

    /* renamed from: a */
    public static <T, U> g52<U> m53703a(T t, jd2<? super T, ? extends vy4<? extends U>> jd2) {
        return ti5.m52309j(new C6642a(t, jd2));
    }

    /* renamed from: b */
    public static <T, R> boolean m53704b(vy4<T> vy4, nc6<? super R> nc6, jd2<? super T, ? extends vy4<? extends R>> jd2) {
        if (!(vy4 instanceof Callable)) {
            return false;
        }
        try {
            Object call = ((Callable) vy4).call();
            if (call == null) {
                EmptySubscription.complete(nc6);
                return true;
            }
            try {
                vy4 vy42 = (vy4) af4.m31828d(jd2.apply(call), "The mapper returned a null Publisher");
                if (vy42 instanceof Callable) {
                    try {
                        Object call2 = ((Callable) vy42).call();
                        if (call2 == null) {
                            EmptySubscription.complete(nc6);
                            return true;
                        }
                        nc6.onSubscribe(new ScalarSubscription(nc6, call2));
                    } catch (Throwable th) {
                        ou1.m49570a(th);
                        EmptySubscription.error(th, nc6);
                        return true;
                    }
                } else {
                    vy42.mo40232a(nc6);
                }
                return true;
            } catch (Throwable th2) {
                ou1.m49570a(th2);
                EmptySubscription.error(th2, nc6);
                return true;
            }
        } catch (Throwable th3) {
            ou1.m49570a(th3);
            EmptySubscription.error(th3, nc6);
            return true;
        }
    }
}
