package p000;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012 \u0010'\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n\u0018\u00010%j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`&¢\u0006\u0004\b(\u0010)J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0014J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014J\u0016\u0010\u000e\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0014J\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0002R\u0018\u0010\u0015\u001a\u00060\u0011j\u0002`\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\b8DX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\b8DX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\b8DX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001aR\u0014\u0010!\u001a\u00020\b8DX\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001aR\u0014\u0010$\u001a\u00020\"8TX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010#¨\u0006*"}, mo44877d2 = {"Lkp0;", "E", "Lkotlinx/coroutines/channels/AbstractChannel;", "element", "", "v", "(Ljava/lang/Object;)Ljava/lang/Object;", "Q", "", "wasClosed", "Lr37;", "M", "Lx75;", "receive", "I", "Lkotlinx/coroutines/internal/UndeliveredElementException;", "T", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "g", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "k", "Ljava/lang/Object;", "value", "J", "()Z", "isBufferAlwaysEmpty", "K", "isBufferEmpty", "q", "isBufferAlwaysFull", "s", "isBufferFull", "", "()Ljava/lang/String;", "bufferDebugString", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lrc2;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: kp0 */
/* compiled from: ConflatedChannel.kt */
public class kp0<E> extends AbstractChannel<E> {

    /* renamed from: g */
    public final ReentrantLock f40507g = new ReentrantLock();

    /* renamed from: k */
    public Object f40508k = C9327t5.f44638a;

    public kp0(rc2<? super E, r37> rc2) {
        super(rc2);
    }

    /* renamed from: I */
    public boolean mo51250I(x75<? super E> x75) {
        ReentrantLock reentrantLock = this.f40507g;
        reentrantLock.lock();
        try {
            return super.mo51250I(x75);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: J */
    public final boolean mo51251J() {
        return false;
    }

    /* renamed from: K */
    public final boolean mo51252K() {
        boolean z;
        ReentrantLock reentrantLock = this.f40507g;
        reentrantLock.lock();
        try {
            if (this.f40508k == C9327t5.f44638a) {
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: M */
    public void mo51254M(boolean z) {
        ReentrantLock reentrantLock = this.f40507g;
        reentrantLock.lock();
        try {
            UndeliveredElementException T = mo55759T(C9327t5.f44638a);
            r37 r37 = r37.f33317a;
            reentrantLock.unlock();
            super.mo51254M(z);
            if (T != null) {
                throw T;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: Q */
    public Object mo51255Q() {
        ReentrantLock reentrantLock = this.f40507g;
        reentrantLock.lock();
        try {
            Object obj = this.f40508k;
            xj6 xj6 = C9327t5.f44638a;
            if (obj == xj6) {
                Object i = mo67223i();
                if (i == null) {
                    i = C9327t5.f44641d;
                }
                return i;
            }
            this.f40508k = xj6;
            r37 r37 = r37.f33317a;
            reentrantLock.unlock();
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: T */
    public final UndeliveredElementException mo55759T(Object obj) {
        rc2<E, r37> rc2;
        Object obj2 = this.f40508k;
        UndeliveredElementException undeliveredElementException = null;
        if (!(obj2 == C9327t5.f44638a || (rc2 = this.f46334a) == null)) {
            undeliveredElementException = OnUndeliveredElementKt.m63494d(rc2, obj2, (UndeliveredElementException) null, 2, (Object) null);
        }
        this.f40508k = obj;
        return undeliveredElementException;
    }

    /* renamed from: g */
    public String mo51260g() {
        ReentrantLock reentrantLock = this.f40507g;
        reentrantLock.lock();
        try {
            return "(value=" + this.f40508k + ')';
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: q */
    public final boolean mo51261q() {
        return false;
    }

    /* renamed from: s */
    public final boolean mo51262s() {
        return false;
    }

    /* renamed from: v */
    public Object mo51263v(E e) {
        g85 A;
        ReentrantLock reentrantLock = this.f40507g;
        reentrantLock.lock();
        try {
            sh0<?> i = mo67223i();
            if (i != null) {
                return i;
            }
            if (this.f40508k == C9327t5.f44638a) {
                do {
                    A = mo55573A();
                    if (A != null) {
                        if (A instanceof sh0) {
                            reentrantLock.unlock();
                            return A;
                        }
                        vx2.m53588d(A);
                    }
                } while (A.mo51884f(e, (LockFreeLinkedListNode.C7797b) null) == null);
                r37 r37 = r37.f33317a;
                reentrantLock.unlock();
                A.mo51883e(e);
                return A.mo51882b();
            }
            UndeliveredElementException T = mo55759T(e);
            if (T == null) {
                xj6 xj6 = C9327t5.f44639b;
                reentrantLock.unlock();
                return xj6;
            }
            throw T;
        } finally {
            reentrantLock.unlock();
        }
    }
}
