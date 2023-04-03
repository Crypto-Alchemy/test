package p018io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p018io.reactivex.exceptions.ProtocolViolationException;

/* renamed from: io.reactivex.internal.subscriptions.SubscriptionHelper */
public enum SubscriptionHelper implements pc6 {
    CANCELLED;

    public static boolean cancel(AtomicReference<pc6> atomicReference) {
        pc6 andSet;
        pc6 pc6 = atomicReference.get();
        SubscriptionHelper subscriptionHelper = CANCELLED;
        if (pc6 == subscriptionHelper || (andSet = atomicReference.getAndSet(subscriptionHelper)) == subscriptionHelper) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    public static void deferredRequest(AtomicReference<pc6> atomicReference, AtomicLong atomicLong, long j) {
        pc6 pc6 = atomicReference.get();
        if (pc6 != null) {
            pc6.request(j);
        } else if (validate(j)) {
            C3866ax.m32276a(atomicLong, j);
            pc6 pc62 = atomicReference.get();
            if (pc62 != null) {
                long andSet = atomicLong.getAndSet(0);
                if (andSet != 0) {
                    pc62.request(andSet);
                }
            }
        }
    }

    public static boolean deferredSetOnce(AtomicReference<pc6> atomicReference, AtomicLong atomicLong, pc6 pc6) {
        if (!setOnce(atomicReference, pc6)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0);
        if (andSet == 0) {
            return true;
        }
        pc6.request(andSet);
        return true;
    }

    public static boolean isCancelled(pc6 pc6) {
        if (pc6 == CANCELLED) {
            return true;
        }
        return false;
    }

    public static boolean replace(AtomicReference<pc6> atomicReference, pc6 pc6) {
        pc6 pc62;
        do {
            pc62 = atomicReference.get();
            if (pc62 == CANCELLED) {
                if (pc6 == null) {
                    return false;
                }
                pc6.cancel();
                return false;
            }
        } while (!ao0.m10672a(atomicReference, pc62, pc6));
        return true;
    }

    public static void reportMoreProduced(long j) {
        ti5.m52312m(new ProtocolViolationException("More produced than requested: " + j));
    }

    public static void reportSubscriptionSet() {
        ti5.m52312m(new ProtocolViolationException("Subscription already set!"));
    }

    public static boolean set(AtomicReference<pc6> atomicReference, pc6 pc6) {
        pc6 pc62;
        do {
            pc62 = atomicReference.get();
            if (pc62 == CANCELLED) {
                if (pc6 == null) {
                    return false;
                }
                pc6.cancel();
                return false;
            }
        } while (!ao0.m10672a(atomicReference, pc62, pc6));
        if (pc62 == null) {
            return true;
        }
        pc62.cancel();
        return true;
    }

    public static boolean setOnce(AtomicReference<pc6> atomicReference, pc6 pc6) {
        af4.m31828d(pc6, "s is null");
        if (ao0.m10672a(atomicReference, (Object) null, pc6)) {
            return true;
        }
        pc6.cancel();
        if (atomicReference.get() == CANCELLED) {
            return false;
        }
        reportSubscriptionSet();
        return false;
    }

    public static boolean validate(pc6 pc6, pc6 pc62) {
        if (pc62 == null) {
            ti5.m52312m(new NullPointerException("next is null"));
            return false;
        } else if (pc6 == null) {
            return true;
        } else {
            pc62.cancel();
            reportSubscriptionSet();
            return false;
        }
    }

    public void cancel() {
    }

    public void request(long j) {
    }

    public static boolean validate(long j) {
        if (j > 0) {
            return true;
        }
        ti5.m52312m(new IllegalArgumentException("n > 0 required but it was " + j));
        return false;
    }

    public static boolean setOnce(AtomicReference<pc6> atomicReference, pc6 pc6, long j) {
        if (!setOnce(atomicReference, pc6)) {
            return false;
        }
        pc6.request(j);
        return true;
    }
}
