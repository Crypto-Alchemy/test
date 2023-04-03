package kotlin.reflect.jvm.internal.impl.storage;

import java.util.concurrent.locks.Lock;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: kotlin.reflect.jvm.internal.impl.storage.a */
/* compiled from: locks.kt */
public interface C7708a {

    /* renamed from: a */
    public static final C7709a f40246a = C7709a.f40247a;

    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.a$a */
    /* compiled from: locks.kt */
    public static final class C7709a {

        /* renamed from: a */
        public static final /* synthetic */ C7709a f40247a = new C7709a();

        /* renamed from: a */
        public final y91 mo55256a(Runnable runnable, rc2<? super InterruptedException, r37> rc2) {
            if (runnable == null || rc2 == null) {
                return new y91((Lock) null, 1, (DefaultConstructorMarker) null);
            }
            return new ra0(runnable, rc2);
        }
    }

    void lock();

    void unlock();
}
