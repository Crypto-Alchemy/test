package p018io.reactivex.internal.util;

import java.util.concurrent.atomic.AtomicReference;
import p018io.reactivex.exceptions.CompositeException;

/* renamed from: io.reactivex.internal.util.ExceptionHelper */
public final class ExceptionHelper {

    /* renamed from: a */
    public static final Throwable f30070a = new Termination();

    /* renamed from: io.reactivex.internal.util.ExceptionHelper$Termination */
    public static final class Termination extends Throwable {
        private static final long serialVersionUID = -4649703670690200604L;

        public Termination() {
            super("No further exceptions");
        }

        public Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: a */
    public static <T> boolean m45874a(AtomicReference<Throwable> atomicReference, Throwable th) {
        Throwable th2;
        Throwable th3;
        do {
            th2 = atomicReference.get();
            if (th2 == f30070a) {
                return false;
            }
            if (th2 == null) {
                th3 = th;
            } else {
                th3 = new CompositeException(th2, th);
            }
        } while (!ao0.m10672a(atomicReference, th2, th3));
        return true;
    }

    /* renamed from: b */
    public static <T> Throwable m45875b(AtomicReference<Throwable> atomicReference) {
        Throwable th = atomicReference.get();
        Throwable th2 = f30070a;
        if (th != th2) {
            return atomicReference.getAndSet(th2);
        }
        return th;
    }

    /* renamed from: c */
    public static <E extends Throwable> Exception m45876c(Throwable th) throws Throwable {
        if (th instanceof Exception) {
            return (Exception) th;
        }
        throw th;
    }

    /* renamed from: d */
    public static RuntimeException m45877d(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        } else if (th instanceof RuntimeException) {
            return (RuntimeException) th;
        } else {
            return new RuntimeException(th);
        }
    }
}
