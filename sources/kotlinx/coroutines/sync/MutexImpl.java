package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00010\u0002:\u0004\u0013\b\n\u000fB\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\t\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, mo44877d2 = {"Lkotlinx/coroutines/sync/MutexImpl;", "Ly04;", "", "owner", "", "d", "(Ljava/lang/Object;)Z", "Lr37;", "a", "(Ljava/lang/Object;Lns0;)Ljava/lang/Object;", "b", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "c", "locked", "<init>", "(Z)V", "LockCont", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: Mutex.kt */
public final class MutexImpl implements y04 {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f40500a = AtomicReferenceFieldUpdater.newUpdater(MutexImpl.class, Object.class, "_state");
    public volatile /* synthetic */ Object _state;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u001f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0011"}, mo44877d2 = {"Lkotlinx/coroutines/sync/MutexImpl$LockCont;", "Lkotlinx/coroutines/sync/MutexImpl$a;", "Lkotlinx/coroutines/sync/MutexImpl;", "", "C", "Lr37;", "A", "", "toString", "Lma0;", "s", "Lma0;", "cont", "", "owner", "<init>", "(Lkotlinx/coroutines/sync/MutexImpl;Ljava/lang/Object;Lma0;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* compiled from: Mutex.kt */
    public final class LockCont extends C7801a {

        /* renamed from: s */
        public final ma0<r37> f40501s;

        public LockCont(Object obj, ma0<? super r37> ma0) {
            super(obj);
            this.f40501s = ma0;
        }

        /* renamed from: A */
        public void mo55751A() {
            this.f40501s.mo56162F(oa0.f43593a);
        }

        /* renamed from: C */
        public boolean mo55752C() {
            if (mo55753B() && this.f40501s.mo56161B(r37.f33317a, (Object) null, new MutexImpl$LockCont$tryResumeLockWaiter$1(MutexImpl.this, this)) != null) {
                return true;
            }
            return false;
        }

        public String toString() {
            return "LockCont[" + this.f40504g + ", " + this.f40501s + "] for " + MutexImpl.this;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\b¢\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H&¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H&¢\u0006\u0004\b\n\u0010\bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, mo44877d2 = {"Lkotlinx/coroutines/sync/MutexImpl$a;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lzh1;", "", "B", "()Z", "Lr37;", "dispose", "()V", "C", "A", "", "g", "Ljava/lang/Object;", "owner", "<init>", "(Lkotlinx/coroutines/sync/MutexImpl;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.sync.MutexImpl$a */
    /* compiled from: Mutex.kt */
    public abstract class C7801a extends LockFreeLinkedListNode implements zh1 {

        /* renamed from: r */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f40503r = AtomicIntegerFieldUpdater.newUpdater(C7801a.class, "isTaken");

        /* renamed from: g */
        public final Object f40504g;
        private volatile /* synthetic */ int isTaken = 0;

        public C7801a(Object obj) {
            this.f40504g = obj;
        }

        /* renamed from: A */
        public abstract void mo55751A();

        /* renamed from: B */
        public final boolean mo55753B() {
            return f40503r.compareAndSet(this, 0, 1);
        }

        /* renamed from: C */
        public abstract boolean mo55752C();

        public final void dispose() {
            mo50615v();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo44877d2 = {"Lkotlinx/coroutines/sync/MutexImpl$b;", "Lbk3;", "", "toString", "", "owner", "Ljava/lang/Object;", "<init>", "(Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.sync.MutexImpl$b */
    /* compiled from: Mutex.kt */
    public static final class C7802b extends bk3 {
        public volatile Object owner;

        public C7802b(Object obj) {
            this.owner = obj;
        }

        public String toString() {
            return "LockedQueue[" + this.owner + ']';
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0006X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, mo44877d2 = {"Lkotlinx/coroutines/sync/MutexImpl$c;", "Ljs;", "Lkotlinx/coroutines/sync/MutexImpl;", "affected", "", "i", "failure", "Lr37;", "h", "Lkotlinx/coroutines/sync/MutexImpl$b;", "b", "Lkotlinx/coroutines/sync/MutexImpl$b;", "queue", "<init>", "(Lkotlinx/coroutines/sync/MutexImpl$b;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.sync.MutexImpl$c */
    /* compiled from: Mutex.kt */
    public static final class C7803c extends C7311js<MutexImpl> {

        /* renamed from: b */
        public final C7802b f40506b;

        public C7803c(C7802b bVar) {
            this.f40506b = bVar;
        }

        /* renamed from: h */
        public void mo52780d(MutexImpl mutexImpl, Object obj) {
            Object obj2;
            if (obj == null) {
                obj2 = z04.f46321f;
            } else {
                obj2 = this.f40506b;
            }
            C2265f6.m16607a(MutexImpl.f40500a, mutexImpl, this, obj2);
        }

        /* renamed from: i */
        public Object mo52783g(MutexImpl mutexImpl) {
            if (this.f40506b.mo50612A()) {
                return null;
            }
            return z04.f46317b;
        }
    }

    public MutexImpl(boolean z) {
        mo1 mo1;
        if (z) {
            mo1 = z04.f46320e;
        } else {
            mo1 = z04.f46321f;
        }
        this._state = mo1;
    }

    /* renamed from: a */
    public Object mo55746a(Object obj, ns0<? super r37> ns0) {
        if (mo55749d(obj)) {
            return r37.f33317a;
        }
        Object c = mo55748c(obj, ns0);
        if (c == wx2.m54101d()) {
            return c;
        }
        return r37.f33317a;
    }

    /* renamed from: b */
    public void mo55747b(Object obj) {
        while (true) {
            Object obj2 = this._state;
            boolean z = true;
            if (obj2 instanceof mo1) {
                if (obj == null) {
                    if (((mo1) obj2).f40982a == z04.f46319d) {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    mo1 mo1 = (mo1) obj2;
                    if (mo1.f40982a != obj) {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException(("Mutex is locked by " + mo1.f40982a + " but expected " + obj).toString());
                    }
                }
                if (C2265f6.m16607a(f40500a, this, obj2, z04.f46321f)) {
                    return;
                }
            } else if (obj2 instanceof gi4) {
                ((gi4) obj2).mo51929c(this);
            } else if (obj2 instanceof C7802b) {
                if (obj != null) {
                    C7802b bVar = (C7802b) obj2;
                    if (bVar.owner != obj) {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException(("Mutex is locked by " + bVar.owner + " but expected " + obj).toString());
                    }
                }
                C7802b bVar2 = (C7802b) obj2;
                LockFreeLinkedListNode w = bVar2.mo55696w();
                if (w == null) {
                    C7803c cVar = new C7803c(bVar2);
                    if (C2265f6.m16607a(f40500a, this, obj2, cVar) && cVar.mo51929c(this) == null) {
                        return;
                    }
                } else {
                    C7801a aVar = (C7801a) w;
                    if (aVar.mo55752C()) {
                        Object obj3 = aVar.f40504g;
                        if (obj3 == null) {
                            obj3 = z04.f46318c;
                        }
                        bVar2.owner = obj3;
                        aVar.mo55751A();
                        return;
                    }
                }
            } else {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            }
        }
    }

    /* renamed from: c */
    public final Object mo55748c(Object obj, ns0<? super r37> ns0) {
        boolean z;
        mo1 mo1;
        na0<? super r37> b = pa0.m70974b(IntrinsicsKt__IntrinsicsJvmKt.m47425c(ns0));
        LockCont lockCont = new LockCont(obj, b);
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof mo1) {
                mo1 mo12 = (mo1) obj2;
                if (mo12.f40982a != z04.f46319d) {
                    C2265f6.m16607a(f40500a, this, obj2, new C7802b(mo12.f40982a));
                } else {
                    if (obj == null) {
                        mo1 = z04.f46320e;
                    } else {
                        mo1 = new mo1(obj);
                    }
                    if (C2265f6.m16607a(f40500a, this, obj2, mo1)) {
                        b.mo56167w(r37.f33317a, new MutexImpl$lockSuspend$2$1$1(this, obj));
                        break;
                    }
                }
            } else if (obj2 instanceof C7802b) {
                C7802b bVar = (C7802b) obj2;
                if (bVar.owner != obj) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    bVar.mo55685h(lockCont);
                    if (this._state == obj2 || !lockCont.mo55753B()) {
                        pa0.m70975c(b, lockCont);
                    } else {
                        lockCont = new LockCont(obj, b);
                    }
                } else {
                    throw new IllegalStateException(("Already locked by " + obj).toString());
                }
            } else if (obj2 instanceof gi4) {
                ((gi4) obj2).mo51929c(this);
            } else {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            }
        }
        Object s = b.mo56421s();
        if (s == wx2.m54101d()) {
            a31.m31656c(ns0);
        }
        if (s == wx2.m54101d()) {
            return s;
        }
        return r37.f33317a;
    }

    /* renamed from: d */
    public boolean mo55749d(Object obj) {
        mo1 mo1;
        while (true) {
            Object obj2 = this._state;
            boolean z = true;
            if (obj2 instanceof mo1) {
                if (((mo1) obj2).f40982a != z04.f46319d) {
                    return false;
                }
                if (obj == null) {
                    mo1 = z04.f46320e;
                } else {
                    mo1 = new mo1(obj);
                }
                if (C2265f6.m16607a(f40500a, this, obj2, mo1)) {
                    return true;
                }
            } else if (obj2 instanceof C7802b) {
                if (((C7802b) obj2).owner == obj) {
                    z = false;
                }
                if (z) {
                    return false;
                }
                throw new IllegalStateException(("Already locked by " + obj).toString());
            } else if (obj2 instanceof gi4) {
                ((gi4) obj2).mo51929c(this);
            } else {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            }
        }
    }

    public String toString() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof mo1) {
                return "Mutex[" + ((mo1) obj).f40982a + ']';
            } else if (obj instanceof gi4) {
                ((gi4) obj).mo51929c(this);
            } else if (obj instanceof C7802b) {
                return "Mutex[" + ((C7802b) obj).owner + ']';
            } else {
                throw new IllegalStateException(("Illegal state " + obj).toString());
            }
        }
    }
}
