package p000;

import java.util.concurrent.atomic.AtomicReference;
import p018io.reactivex.exceptions.ProtocolViolationException;
import p018io.reactivex.internal.subscriptions.SubscriptionHelper;

/* renamed from: vp1 */
/* compiled from: EndConsumerHelper */
public final class vp1 {
    /* renamed from: a */
    public static String m53446a(String str) {
        return "It is not allowed to subscribe with a(n) " + str + " multiple times. Please create a fresh instance of " + str + " and subscribe that to the target source instead.";
    }

    /* renamed from: b */
    public static void m53447b(Class<?> cls) {
        ti5.m52312m(new ProtocolViolationException(m53446a(cls.getName())));
    }

    /* renamed from: c */
    public static boolean m53448c(AtomicReference<pc6> atomicReference, pc6 pc6, Class<?> cls) {
        af4.m31828d(pc6, "next is null");
        if (ao0.m10672a(atomicReference, (Object) null, pc6)) {
            return true;
        }
        pc6.cancel();
        if (atomicReference.get() == SubscriptionHelper.CANCELLED) {
            return false;
        }
        m53447b(cls);
        return false;
    }
}
