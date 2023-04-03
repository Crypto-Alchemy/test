package p018io.reactivex.internal.disposables;

import java.util.concurrent.atomic.AtomicReference;
import p018io.reactivex.exceptions.ProtocolViolationException;

/* renamed from: io.reactivex.internal.disposables.DisposableHelper */
public enum DisposableHelper implements th1 {
    DISPOSED;

    public static boolean dispose(AtomicReference<th1> atomicReference) {
        th1 andSet;
        th1 th1 = atomicReference.get();
        DisposableHelper disposableHelper = DISPOSED;
        if (th1 == disposableHelper || (andSet = atomicReference.getAndSet(disposableHelper)) == disposableHelper) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.dispose();
        return true;
    }

    public static boolean isDisposed(th1 th1) {
        if (th1 == DISPOSED) {
            return true;
        }
        return false;
    }

    public static boolean replace(AtomicReference<th1> atomicReference, th1 th1) {
        th1 th12;
        do {
            th12 = atomicReference.get();
            if (th12 == DISPOSED) {
                if (th1 == null) {
                    return false;
                }
                th1.dispose();
                return false;
            }
        } while (!ao0.m10672a(atomicReference, th12, th1));
        return true;
    }

    public static void reportDisposableSet() {
        ti5.m52312m(new ProtocolViolationException("Disposable already set!"));
    }

    public static boolean set(AtomicReference<th1> atomicReference, th1 th1) {
        th1 th12;
        do {
            th12 = atomicReference.get();
            if (th12 == DISPOSED) {
                if (th1 == null) {
                    return false;
                }
                th1.dispose();
                return false;
            }
        } while (!ao0.m10672a(atomicReference, th12, th1));
        if (th12 == null) {
            return true;
        }
        th12.dispose();
        return true;
    }

    public static boolean setOnce(AtomicReference<th1> atomicReference, th1 th1) {
        af4.m31828d(th1, "d is null");
        if (ao0.m10672a(atomicReference, (Object) null, th1)) {
            return true;
        }
        th1.dispose();
        if (atomicReference.get() == DISPOSED) {
            return false;
        }
        reportDisposableSet();
        return false;
    }

    public static boolean trySet(AtomicReference<th1> atomicReference, th1 th1) {
        if (ao0.m10672a(atomicReference, (Object) null, th1)) {
            return true;
        }
        if (atomicReference.get() != DISPOSED) {
            return false;
        }
        th1.dispose();
        return false;
    }

    public static boolean validate(th1 th1, th1 th12) {
        if (th12 == null) {
            ti5.m52312m(new NullPointerException("next is null"));
            return false;
        } else if (th1 == null) {
            return true;
        } else {
            th12.dispose();
            reportDisposableSet();
            return false;
        }
    }

    public void dispose() {
    }

    public boolean isDisposed() {
        return true;
    }
}
