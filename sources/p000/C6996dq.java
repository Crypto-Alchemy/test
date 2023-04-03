package p000;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\u0006\u0010 \u001a\u00020\u0016\u0012\u0006\u0010$\u001a\u00020!\u0012 \u0010?\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0013\u0018\u00010=j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`>¢\u0006\u0004\b@\u0010AJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0010R\u0014\u0010$\u001a\u00020!8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010)\u001a\u00060%j\u0002`&8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040*8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b.\u0010\u0010R\u0014\u00102\u001a\u00020\u000f8DX\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u000f8DX\u0004¢\u0006\u0006\u001a\u0004\b3\u00101R\u0014\u00106\u001a\u00020\u000f8DX\u0004¢\u0006\u0006\u001a\u0004\b5\u00101R\u0014\u00107\u001a\u00020\u000f8DX\u0004¢\u0006\u0006\u001a\u0004\b+\u00101R\u0014\u00109\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\b8\u00101R\u0014\u0010<\u001a\u00020:8TX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010;¨\u0006B"}, mo44877d2 = {"Ldq;", "E", "Lkotlinx/coroutines/channels/AbstractChannel;", "element", "", "v", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lgu5;", "send", "f", "(Lgu5;)Ljava/lang/Object;", "Q", "()Ljava/lang/Object;", "Lx75;", "receive", "", "I", "(Lx75;)Z", "wasClosed", "Lr37;", "M", "(Z)V", "", "currentSize", "Lxj6;", "V", "(I)Lxj6;", "T", "(ILjava/lang/Object;)V", "U", "(I)V", "g", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "k", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "r", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "", "s", "[Ljava/lang/Object;", "buffer", "x", "head", "J", "()Z", "isBufferAlwaysEmpty", "K", "isBufferEmpty", "q", "isBufferAlwaysFull", "isBufferFull", "L", "isClosedForReceive", "", "()Ljava/lang/String;", "bufferDebugString", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILkotlinx/coroutines/channels/BufferOverflow;Lrc2;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: dq */
/* compiled from: ArrayChannel.kt */
public class C6996dq<E> extends AbstractChannel<E> {

    /* renamed from: g */
    public final int f37368g;

    /* renamed from: k */
    public final BufferOverflow f37369k;

    /* renamed from: r */
    public final ReentrantLock f37370r;

    /* renamed from: s */
    public Object[] f37371s;
    private volatile /* synthetic */ int size;

    /* renamed from: x */
    public int f37372x;

    @Metadata(mo44878k = 3, mo44879mv = {1, 6, 0}, mo44881xi = 48)
    /* renamed from: dq$a */
    /* compiled from: ArrayChannel.kt */
    public /* synthetic */ class C6997a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37373a;

        static {
            int[] iArr = new int[BufferOverflow.values().length];
            iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
            iArr[BufferOverflow.DROP_LATEST.ordinal()] = 2;
            iArr[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
            f37373a = iArr;
        }
    }

    public C6996dq(int i, BufferOverflow bufferOverflow, rc2<? super E, r37> rc2) {
        super(rc2);
        this.f37368g = i;
        this.f37369k = bufferOverflow;
        if (i < 1 ? false : true) {
            this.f37370r = new ReentrantLock();
            Object[] objArr = new Object[Math.min(i, 8)];
            C6706xq.m54505s(objArr, C9327t5.f44638a, 0, 0, 6, (Object) null);
            this.f37371s = objArr;
            this.size = 0;
            return;
        }
        throw new IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + i + " was specified").toString());
    }

    /* renamed from: I */
    public boolean mo51250I(x75<? super E> x75) {
        ReentrantLock reentrantLock = this.f37370r;
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
        if (this.size == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: L */
    public boolean mo51253L() {
        ReentrantLock reentrantLock = this.f37370r;
        reentrantLock.lock();
        try {
            return super.mo51253L();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: M */
    public void mo51254M(boolean z) {
        rc2<E, r37> rc2 = this.f46334a;
        ReentrantLock reentrantLock = this.f37370r;
        reentrantLock.lock();
        try {
            int i = this.size;
            UndeliveredElementException undeliveredElementException = null;
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = this.f37371s[this.f37372x];
                if (!(rc2 == null || obj == C9327t5.f44638a)) {
                    undeliveredElementException = OnUndeliveredElementKt.m63493c(rc2, obj, undeliveredElementException);
                }
                Object[] objArr = this.f37371s;
                int i3 = this.f37372x;
                objArr[i3] = C9327t5.f44638a;
                this.f37372x = (i3 + 1) % objArr.length;
            }
            this.size = 0;
            r37 r37 = r37.f33317a;
            reentrantLock.unlock();
            super.mo51254M(z);
            if (undeliveredElementException != null) {
                throw undeliveredElementException;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: Q */
    public Object mo51255Q() {
        ReentrantLock reentrantLock = this.f37370r;
        reentrantLock.lock();
        try {
            int i = this.size;
            if (i == 0) {
                Object i2 = mo67223i();
                if (i2 == null) {
                    i2 = C9327t5.f44641d;
                }
                return i2;
            }
            Object[] objArr = this.f37371s;
            int i3 = this.f37372x;
            Object obj = objArr[i3];
            gu5 gu5 = null;
            objArr[i3] = null;
            this.size = i - 1;
            Object obj2 = C9327t5.f44641d;
            boolean z = false;
            if (i == this.f37368g) {
                gu5 gu52 = null;
                while (true) {
                    gu5 B = mo67220B();
                    if (B == null) {
                        gu5 = gu52;
                        break;
                    }
                    vx2.m53588d(B);
                    if (B.mo52018D((LockFreeLinkedListNode.C7797b) null) != null) {
                        obj2 = B.mo52016B();
                        z = true;
                        gu5 = B;
                        break;
                    }
                    B.mo52019E();
                    gu52 = B;
                }
            }
            if (obj2 != C9327t5.f44641d && !(obj2 instanceof sh0)) {
                this.size = i;
                Object[] objArr2 = this.f37371s;
                objArr2[(this.f37372x + i) % objArr2.length] = obj2;
            }
            this.f37372x = (this.f37372x + 1) % this.f37371s.length;
            r37 r37 = r37.f33317a;
            reentrantLock.unlock();
            if (z) {
                vx2.m53588d(gu5);
                gu5.mo52015A();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: T */
    public final void mo51256T(int i, E e) {
        if (i < this.f37368g) {
            mo51257U(i);
            Object[] objArr = this.f37371s;
            objArr[(this.f37372x + i) % objArr.length] = e;
            return;
        }
        Object[] objArr2 = this.f37371s;
        int i2 = this.f37372x;
        objArr2[i2 % objArr2.length] = null;
        objArr2[(i + i2) % objArr2.length] = e;
        this.f37372x = (i2 + 1) % objArr2.length;
    }

    /* renamed from: U */
    public final void mo51257U(int i) {
        Object[] objArr = this.f37371s;
        if (i >= objArr.length) {
            int min = Math.min(objArr.length * 2, this.f37368g);
            Object[] objArr2 = new Object[min];
            for (int i2 = 0; i2 < i; i2++) {
                Object[] objArr3 = this.f37371s;
                objArr2[i2] = objArr3[(this.f37372x + i2) % objArr3.length];
            }
            C6706xq.m54503q(objArr2, C9327t5.f44638a, i, min);
            this.f37371s = objArr2;
            this.f37372x = 0;
        }
    }

    /* renamed from: V */
    public final xj6 mo51258V(int i) {
        if (i < this.f37368g) {
            this.size = i + 1;
            return null;
        }
        int i2 = C6997a.f37373a[this.f37369k.ordinal()];
        if (i2 == 1) {
            return C9327t5.f44640c;
        }
        if (i2 == 2) {
            return C9327t5.f44639b;
        }
        if (i2 == 3) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: f */
    public Object mo51259f(gu5 gu5) {
        ReentrantLock reentrantLock = this.f37370r;
        reentrantLock.lock();
        try {
            return super.mo51259f(gu5);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: g */
    public String mo51260g() {
        return "(buffer:capacity=" + this.f37368g + ",size=" + this.size + ')';
    }

    /* renamed from: q */
    public final boolean mo51261q() {
        return false;
    }

    /* renamed from: s */
    public final boolean mo51262s() {
        if (this.size == this.f37368g && this.f37369k == BufferOverflow.SUSPEND) {
            return true;
        }
        return false;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: v */
    public Object mo51263v(E e) {
        g85 A;
        ReentrantLock reentrantLock = this.f37370r;
        reentrantLock.lock();
        int i = this.size;
        sh0<?> i2 = mo67223i();
        if (i2 != null) {
            reentrantLock.unlock();
            return i2;
        }
        xj6 V = mo51258V(i);
        if (V != null) {
            reentrantLock.unlock();
            return V;
        }
        if (i == 0) {
            do {
                try {
                    A = mo55573A();
                    if (A != null) {
                        if (A instanceof sh0) {
                            this.size = i;
                            reentrantLock.unlock();
                            return A;
                        }
                        vx2.m53588d(A);
                    }
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } while (A.mo51884f(e, (LockFreeLinkedListNode.C7797b) null) == null);
            this.size = i;
            r37 r37 = r37.f33317a;
            reentrantLock.unlock();
            A.mo51883e(e);
            return A.mo51882b();
        }
        mo51256T(i, e);
        xj6 xj6 = C9327t5.f44639b;
        reentrantLock.unlock();
        return xj6;
    }
}
