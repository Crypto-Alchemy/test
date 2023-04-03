package p000;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0013\b\u0000\u0018\u0000 \u0010*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002\b\u001cB\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u0007\u0012\u0006\u0010 \u001a\u00020\u0003¢\u0006\u0004\b'\u0010(J\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u000f2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u000f2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u000f2\u0006\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u000f2\u0006\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u0014\u0010 \u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR\u0014\u0010!\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001dR\u0011\u0010#\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0005R\u0011\u0010&\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006)"}, mo44877d2 = {"Lek3;", "", "E", "", "d", "()Z", "element", "", "a", "(Ljava/lang/Object;)I", "j", "()Ljava/lang/Object;", "i", "()Lek3;", "index", "Lkotlinx/coroutines/internal/Core;", "e", "(ILjava/lang/Object;)Lek3;", "oldHead", "newHead", "k", "(II)Lek3;", "", "h", "()J", "state", "c", "(J)Lek3;", "b", "I", "capacity", "Z", "singleConsumer", "mask", "g", "isEmpty", "f", "()I", "size", "<init>", "(IZ)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: ek3 */
/* compiled from: LockFreeTaskQueue.kt */
public final class ek3<E> {

    /* renamed from: e */
    public static final C7052a f37563e = new C7052a((DefaultConstructorMarker) null);

    /* renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f37564f;

    /* renamed from: g */
    public static final /* synthetic */ AtomicLongFieldUpdater f37565g;

    /* renamed from: h */
    public static final xj6 f37566h = new xj6("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a */
    public final int f37567a;

    /* renamed from: b */
    public final boolean f37568b;

    /* renamed from: c */
    public final int f37569c;

    /* renamed from: d */
    public /* synthetic */ AtomicReferenceArray f37570d;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\u0004\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0004J\u0012\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0012\u0010\t\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005J\n\u0010\n\u001a\u00020\u0005*\u00020\u0002R\u0014\u0010\u000b\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u0014\u0010\u0015\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u0014\u0010\u0017\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u0014\u0010\u0018\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u0014\u0010\u0019\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u0019\u0010\fR\u0014\u0010\u001b\u001a\u00020\u001a8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u001d\u0010\u0011R\u0014\u0010\u001e\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u001e\u0010\f¨\u0006!"}, mo44877d2 = {"Lek3$a;", "", "", "other", "d", "", "newHead", "b", "newTail", "c", "a", "ADD_CLOSED", "I", "ADD_FROZEN", "ADD_SUCCESS", "CAPACITY_BITS", "CLOSED_MASK", "J", "CLOSED_SHIFT", "FROZEN_MASK", "FROZEN_SHIFT", "HEAD_MASK", "HEAD_SHIFT", "INITIAL_CAPACITY", "MAX_CAPACITY_MASK", "MIN_ADD_SPIN_CAPACITY", "Lxj6;", "REMOVE_FROZEN", "Lxj6;", "TAIL_MASK", "TAIL_SHIFT", "<init>", "()V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: ek3$a */
    /* compiled from: LockFreeTaskQueue.kt */
    public static final class C7052a {
        public C7052a() {
        }

        public /* synthetic */ C7052a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo51503a(long j) {
            return (j & 2305843009213693952L) != 0 ? 2 : 1;
        }

        /* renamed from: b */
        public final long mo51504b(long j, int i) {
            return mo51506d(j, 1073741823) | (((long) i) << 0);
        }

        /* renamed from: c */
        public final long mo51505c(long j, int i) {
            return mo51506d(j, 1152921503533105152L) | (((long) i) << 30);
        }

        /* renamed from: d */
        public final long mo51506d(long j, long j2) {
            return j & (~j2);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, mo44877d2 = {"Lek3$b;", "", "", "a", "I", "index", "<init>", "(I)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: ek3$b */
    /* compiled from: LockFreeTaskQueue.kt */
    public static final class C7053b {

        /* renamed from: a */
        public final int f37571a;

        public C7053b(int i) {
            this.f37571a = i;
        }
    }

    static {
        Class<ek3> cls = ek3.class;
        f37564f = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        f37565g = AtomicLongFieldUpdater.newUpdater(cls, "_state");
    }

    public ek3(int i, boolean z) {
        boolean z2;
        this.f37567a = i;
        this.f37568b = z;
        int i2 = i - 1;
        this.f37569c = i2;
        this.f37570d = new AtomicReferenceArray(i);
        boolean z3 = false;
        if (i2 <= 1073741823) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (!((i & i2) == 0 ? true : z3)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0068 A[LOOP:1: B:19:0x0068->B:22:0x0079, LOOP_START, PHI: r0 
      PHI: (r0v13 ek3) = (r0v12 ek3), (r0v15 ek3) binds: [B:18:0x0060, B:22:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo51492a(E r13) {
        /*
            r12 = this;
        L_0x0000:
            long r2 = r12._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r6 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0012
            ek3$a r13 = f37563e
            int r13 = r13.mo51503a(r2)
            return r13
        L_0x0012:
            r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r0 & r2
            r8 = 0
            long r0 = r0 >> r8
            int r0 = (int) r0
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r1 = 30
            long r4 = r4 >> r1
            int r9 = (int) r4
            int r10 = r12.f37569c
            int r1 = r9 + 2
            r1 = r1 & r10
            r4 = r0 & r10
            r5 = 1
            if (r1 != r4) goto L_0x002e
            return r5
        L_0x002e:
            boolean r1 = r12.f37568b
            r4 = 1073741823(0x3fffffff, float:1.9999999)
            if (r1 != 0) goto L_0x004d
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r12.f37570d
            r11 = r9 & r10
            java.lang.Object r1 = r1.get(r11)
            if (r1 == 0) goto L_0x004d
            int r1 = r12.f37567a
            r2 = 1024(0x400, float:1.435E-42)
            if (r1 < r2) goto L_0x004c
            int r9 = r9 - r0
            r0 = r9 & r4
            int r1 = r1 >> 1
            if (r0 <= r1) goto L_0x0000
        L_0x004c:
            return r5
        L_0x004d:
            int r0 = r9 + 1
            r0 = r0 & r4
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = f37565g
            ek3$a r4 = f37563e
            long r4 = r4.mo51505c(r2, r0)
            r0 = r1
            r1 = r12
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L_0x0000
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r12.f37570d
            r1 = r9 & r10
            r0.set(r1, r13)
            r0 = r12
        L_0x0068:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x007b
            ek3 r0 = r0.mo51500i()
            ek3 r0 = r0.mo51496e(r9, r13)
            if (r0 != 0) goto L_0x0068
        L_0x007b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ek3.mo51492a(java.lang.Object):int");
    }

    /* renamed from: b */
    public final ek3<E> mo51493b(long j) {
        ek3<E> ek3 = new ek3<>(this.f37567a * 2, this.f37568b);
        int i = (int) ((1073741823 & j) >> 0);
        int i2 = (int) ((1152921503533105152L & j) >> 30);
        while (true) {
            int i3 = this.f37569c;
            if ((i & i3) != (i2 & i3)) {
                Object obj = this.f37570d.get(i3 & i);
                if (obj == null) {
                    obj = new C7053b(i);
                }
                ek3.f37570d.set(ek3.f37569c & i, obj);
                i++;
            } else {
                ek3._state = f37563e.mo51506d(j, 1152921504606846976L);
                return ek3;
            }
        }
    }

    /* renamed from: c */
    public final ek3<E> mo51494c(long j) {
        while (true) {
            ek3<E> ek3 = (ek3) this._next;
            if (ek3 != null) {
                return ek3;
            }
            C2265f6.m16607a(f37564f, this, (Object) null, mo51493b(j));
        }
    }

    /* renamed from: d */
    public final boolean mo51495d() {
        long j;
        do {
            j = this._state;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!f37565g.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    /* renamed from: e */
    public final ek3<E> mo51496e(int i, E e) {
        Object obj = this.f37570d.get(this.f37569c & i);
        if (!(obj instanceof C7053b) || ((C7053b) obj).f37571a != i) {
            return null;
        }
        this.f37570d.set(i & this.f37569c, e);
        return this;
    }

    /* renamed from: f */
    public final int mo51497f() {
        long j = this._state;
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j) >> 0))) & 1073741823;
    }

    /* renamed from: g */
    public final boolean mo51498g() {
        long j = this._state;
        if (((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30))) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final long mo51499h() {
        long j;
        long j2;
        do {
            j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            j2 = j | 1152921504606846976L;
        } while (!f37565g.compareAndSet(this, j, j2));
        return j2;
    }

    /* renamed from: i */
    public final ek3<E> mo51500i() {
        return mo51494c(mo51499h());
    }

    /* renamed from: j */
    public final Object mo51501j() {
        while (true) {
            long j = this._state;
            if ((1152921504606846976L & j) != 0) {
                return f37566h;
            }
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = this.f37569c;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == (i & i2)) {
                return null;
            }
            Object obj = this.f37570d.get(i2 & i);
            if (obj == null) {
                if (this.f37568b) {
                    return null;
                }
            } else if (obj instanceof C7053b) {
                return null;
            } else {
                int i3 = (i + 1) & 1073741823;
                if (f37565g.compareAndSet(this, j, f37563e.mo51504b(j, i3))) {
                    this.f37570d.set(this.f37569c & i, (Object) null);
                    return obj;
                } else if (this.f37568b) {
                    ek3 ek3 = this;
                    do {
                        ek3 = ek3.mo51502k(i, i3);
                    } while (ek3 != null);
                    return obj;
                }
            }
        }
    }

    /* renamed from: k */
    public final ek3<E> mo51502k(int i, int i2) {
        long j;
        int i3;
        do {
            j = this._state;
            i3 = (int) ((1073741823 & j) >> 0);
            if ((1152921504606846976L & j) != 0) {
                return mo51500i();
            }
        } while (!f37565g.compareAndSet(this, j, f37563e.mo51504b(j, i2)));
        this.f37570d.set(i3 & this.f37569c, (Object) null);
        return null;
    }
}
