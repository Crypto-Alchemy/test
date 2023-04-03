package p000;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.storage.C7708a;

/* renamed from: y91 */
/* compiled from: locks.kt */
public class y91 implements C7708a {

    /* renamed from: b */
    public final Lock f46138b;

    public y91(Lock lock) {
        vx2.m53591g(lock, "lock");
        this.f46138b = lock;
    }

    /* renamed from: a */
    public final Lock mo67048a() {
        return this.f46138b;
    }

    public void lock() {
        this.f46138b.lock();
    }

    public void unlock() {
        this.f46138b.unlock();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y91(Lock lock, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ReentrantLock() : lock);
    }
}
