package p018io.reactivex.internal.util;

import java.io.Serializable;

/* renamed from: io.reactivex.internal.util.NotificationLite */
public enum NotificationLite {
    COMPLETE;

    /* renamed from: io.reactivex.internal.util.NotificationLite$DisposableNotification */
    public static final class DisposableNotification implements Serializable {
        private static final long serialVersionUID = -7482590109178395495L;
        public final th1 upstream;

        public DisposableNotification(th1 th1) {
            this.upstream = th1;
        }

        public String toString() {
            return "NotificationLite.Disposable[" + this.upstream + "]";
        }
    }

    /* renamed from: io.reactivex.internal.util.NotificationLite$ErrorNotification */
    public static final class ErrorNotification implements Serializable {
        private static final long serialVersionUID = -8759979445933046293L;

        /* renamed from: e */
        public final Throwable f30072e;

        public ErrorNotification(Throwable th) {
            this.f30072e = th;
        }

        public boolean equals(Object obj) {
            if (obj instanceof ErrorNotification) {
                return af4.m31827c(this.f30072e, ((ErrorNotification) obj).f30072e);
            }
            return false;
        }

        public int hashCode() {
            return this.f30072e.hashCode();
        }

        public String toString() {
            return "NotificationLite.Error[" + this.f30072e + "]";
        }
    }

    /* renamed from: io.reactivex.internal.util.NotificationLite$SubscriptionNotification */
    public static final class SubscriptionNotification implements Serializable {
        private static final long serialVersionUID = -1322257508628817540L;
        public final pc6 upstream;

        public SubscriptionNotification(pc6 pc6) {
            this.upstream = pc6;
        }

        public String toString() {
            return "NotificationLite.Subscription[" + this.upstream + "]";
        }
    }

    public static <T> boolean accept(Object obj, nc6<? super T> nc6) {
        if (obj == COMPLETE) {
            nc6.onComplete();
            return true;
        } else if (obj instanceof ErrorNotification) {
            nc6.onError(((ErrorNotification) obj).f30072e);
            return true;
        } else {
            nc6.onNext(obj);
            return false;
        }
    }

    public static <T> boolean acceptFull(Object obj, nc6<? super T> nc6) {
        if (obj == COMPLETE) {
            nc6.onComplete();
            return true;
        } else if (obj instanceof ErrorNotification) {
            nc6.onError(((ErrorNotification) obj).f30072e);
            return true;
        } else if (obj instanceof SubscriptionNotification) {
            nc6.onSubscribe(((SubscriptionNotification) obj).upstream);
            return false;
        } else {
            nc6.onNext(obj);
            return false;
        }
    }

    public static Object complete() {
        return COMPLETE;
    }

    public static Object disposable(th1 th1) {
        return new DisposableNotification(th1);
    }

    public static Object error(Throwable th) {
        return new ErrorNotification(th);
    }

    public static th1 getDisposable(Object obj) {
        return ((DisposableNotification) obj).upstream;
    }

    public static Throwable getError(Object obj) {
        return ((ErrorNotification) obj).f30072e;
    }

    public static pc6 getSubscription(Object obj) {
        return ((SubscriptionNotification) obj).upstream;
    }

    public static <T> T getValue(Object obj) {
        return obj;
    }

    public static boolean isComplete(Object obj) {
        if (obj == COMPLETE) {
            return true;
        }
        return false;
    }

    public static boolean isDisposable(Object obj) {
        return obj instanceof DisposableNotification;
    }

    public static boolean isError(Object obj) {
        return obj instanceof ErrorNotification;
    }

    public static boolean isSubscription(Object obj) {
        return obj instanceof SubscriptionNotification;
    }

    public static <T> Object next(T t) {
        return t;
    }

    public static Object subscription(pc6 pc6) {
        return new SubscriptionNotification(pc6);
    }

    public String toString() {
        return "NotificationLite.Complete";
    }

    public static <T> boolean accept(Object obj, of4<? super T> of4) {
        if (obj == COMPLETE) {
            of4.onComplete();
            return true;
        } else if (obj instanceof ErrorNotification) {
            of4.onError(((ErrorNotification) obj).f30072e);
            return true;
        } else {
            of4.onNext(obj);
            return false;
        }
    }

    public static <T> boolean acceptFull(Object obj, of4<? super T> of4) {
        if (obj == COMPLETE) {
            of4.onComplete();
            return true;
        } else if (obj instanceof ErrorNotification) {
            of4.onError(((ErrorNotification) obj).f30072e);
            return true;
        } else if (obj instanceof DisposableNotification) {
            of4.onSubscribe(((DisposableNotification) obj).upstream);
            return false;
        } else {
            of4.onNext(obj);
            return false;
        }
    }
}
