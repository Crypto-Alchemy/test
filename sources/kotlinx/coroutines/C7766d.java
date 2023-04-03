package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import p000.ib1;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0013\b \u0018\u00002\u00020\u00012\u00020\u0002:\u000489:;B\u0007¢\u0006\u0004\b7\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\n\u0010\u000e\u001a\u00060\fj\u0002`\r¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\u00020\u00032\n\u0010\u0018\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0003H\u0004¢\u0006\u0004\b \u0010\u0005J\u001b\u0010\"\u001a\u00020!2\n\u0010\u0018\u001a\u00060\fj\u0002`\rH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\rH\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0003H\u0002¢\u0006\u0004\b&\u0010\u0005J\u0017\u0010'\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u001cH\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020)2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0003H\u0002¢\u0006\u0004\b,\u0010\u0005R$\u00102\u001a\u00020!2\u0006\u0010-\u001a\u00020!8B@BX\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u00104\u001a\u00020!8TX\u0004¢\u0006\u0006\u001a\u0004\b3\u0010/R\u0014\u00106\u001a\u00020\u00068TX\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0013¨\u0006<"}, mo44877d2 = {"Lkotlinx/coroutines/d;", "Lot1;", "Lib1;", "Lr37;", "shutdown", "()V", "", "timeMillis", "Lma0;", "continuation", "f", "(JLma0;)V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lzh1;", "C0", "(JLjava/lang/Runnable;)Lzh1;", "Y", "()J", "Lkotlin/coroutines/CoroutineContext;", "context", "m", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "task", "l0", "(Ljava/lang/Runnable;)V", "now", "Lkotlinx/coroutines/d$c;", "delayedTask", "A0", "(JLkotlinx/coroutines/d$c;)V", "y0", "", "o0", "(Ljava/lang/Runnable;)Z", "k0", "()Ljava/lang/Runnable;", "j0", "E0", "(Lkotlinx/coroutines/d$c;)Z", "", "B0", "(JLkotlinx/coroutines/d$c;)I", "x0", "value", "q0", "()Z", "D0", "(Z)V", "isCompleted", "s0", "isEmpty", "P", "nextTime", "<init>", "a", "b", "c", "d", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.d */
/* compiled from: EventLoop.common.kt */
public abstract class C7766d extends ot1 implements ib1 {

    /* renamed from: r */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f40377r;

    /* renamed from: s */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f40378s;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;
    private volatile /* synthetic */ Object _queue = null;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, mo44877d2 = {"Lkotlinx/coroutines/d$a;", "Lkotlinx/coroutines/d$c;", "Lr37;", "run", "", "toString", "Lma0;", "e", "Lma0;", "cont", "", "nanoTime", "<init>", "(Lkotlinx/coroutines/d;JLma0;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.d$a */
    /* compiled from: EventLoop.common.kt */
    public final class C7767a extends C7769c {

        /* renamed from: e */
        public final ma0<r37> f40379e;

        public C7767a(long j, ma0<? super r37> ma0) {
            super(j);
            this.f40379e = ma0;
        }

        public void run() {
            this.f40379e.mo56168y(C7766d.this, r37.f33317a);
        }

        public String toString() {
            return super.toString() + this.f40379e;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\n\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0018\u0010\n\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, mo44877d2 = {"Lkotlinx/coroutines/d$b;", "Lkotlinx/coroutines/d$c;", "Lr37;", "run", "", "toString", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "e", "Ljava/lang/Runnable;", "block", "", "nanoTime", "<init>", "(JLjava/lang/Runnable;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.d$b */
    /* compiled from: EventLoop.common.kt */
    public static final class C7768b extends C7769c {

        /* renamed from: e */
        public final Runnable f40381e;

        public C7768b(long j, Runnable runnable) {
            super(j);
            this.f40381e = runnable;
        }

        public void run() {
            this.f40381e.run();
        }

        public String toString() {
            return super.toString() + this.f40381e;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b)\u0010*J\u0011\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0002J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u001e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0013\u001a\u00020\u0012J\b\u0010\u0015\u001a\u00020\u0014H\u0016R\u0016\u0010\u0018\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010\"\u001a\u00020\u00078\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R0\u0010(\u001a\b\u0012\u0002\b\u0003\u0018\u00010#2\f\u0010$\u001a\b\u0012\u0002\b\u0003\u0018\u00010#8V@VX\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010%\"\u0004\b&\u0010'¨\u0006+"}, mo44877d2 = {"Lkotlinx/coroutines/d$c;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Lzh1;", "Lmp6;", "other", "", "f", "", "now", "", "h", "Lkotlinx/coroutines/d$d;", "delayed", "Lkotlinx/coroutines/d;", "eventLoop", "g", "Lr37;", "dispose", "", "toString", "a", "J", "nanoTime", "", "_heap", "Ljava/lang/Object;", "d", "I", "getIndex", "()I", "setIndex", "(I)V", "index", "Llp6;", "value", "()Llp6;", "e", "(Llp6;)V", "heap", "<init>", "(J)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.d$c */
    /* compiled from: EventLoop.common.kt */
    public static abstract class C7769c implements Runnable, Comparable<C7769c>, zh1, mp6 {
        private volatile Object _heap;

        /* renamed from: a */
        public long f40382a;

        /* renamed from: d */
        public int f40383d = -1;

        public C7769c(long j) {
            this.f40382a = j;
        }

        /* renamed from: a */
        public lp6<?> mo55607a() {
            Object obj = this._heap;
            if (obj instanceof lp6) {
                return (lp6) obj;
            }
            return null;
        }

        public final synchronized void dispose() {
            C7770d dVar;
            Object obj = this._heap;
            if (obj != qt1.f44234a) {
                if (obj instanceof C7770d) {
                    dVar = (C7770d) obj;
                } else {
                    dVar = null;
                }
                if (dVar != null) {
                    dVar.mo55958g(this);
                }
                this._heap = qt1.f44234a;
            }
        }

        /* renamed from: e */
        public void mo55609e(lp6<?> lp6) {
            boolean z;
            if (this._heap != qt1.f44234a) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this._heap = lp6;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: f */
        public int compareTo(C7769c cVar) {
            int i = ((this.f40382a - cVar.f40382a) > 0 ? 1 : ((this.f40382a - cVar.f40382a) == 0 ? 0 : -1));
            if (i > 0) {
                return 1;
            }
            if (i < 0) {
                return -1;
            }
            return 0;
        }

        /* renamed from: g */
        public final synchronized int mo55611g(long j, C7770d dVar, C7766d dVar2) {
            if (this._heap == qt1.f44234a) {
                return 2;
            }
            synchronized (dVar) {
                C7769c cVar = (C7769c) dVar.mo55953b();
                if (dVar2.m63298q0()) {
                    return 1;
                }
                if (cVar == null) {
                    dVar.f40384b = j;
                } else {
                    long j2 = cVar.f40382a;
                    if (j2 - j < 0) {
                        j = j2;
                    }
                    if (j - dVar.f40384b > 0) {
                        dVar.f40384b = j;
                    }
                }
                long j3 = this.f40382a;
                long j4 = dVar.f40384b;
                if (j3 - j4 < 0) {
                    this.f40382a = j4;
                }
                dVar.mo55952a(this);
                return 0;
            }
        }

        public int getIndex() {
            return this.f40383d;
        }

        /* renamed from: h */
        public final boolean mo55613h(long j) {
            if (j - this.f40382a >= 0) {
                return true;
            }
            return false;
        }

        public void setIndex(int i) {
            this.f40383d = i;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f40382a + ']';
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\t"}, mo44877d2 = {"Lkotlinx/coroutines/d$d;", "Llp6;", "Lkotlinx/coroutines/d$c;", "", "b", "J", "timeNow", "<init>", "(J)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.d$d */
    /* compiled from: EventLoop.common.kt */
    public static final class C7770d extends lp6<C7769c> {

        /* renamed from: b */
        public long f40384b;

        public C7770d(long j) {
            this.f40384b = j;
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<C7766d> cls2 = C7766d.class;
        f40377r = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_queue");
        f40378s = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_delayed");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    /* access modifiers changed from: private */
    /* renamed from: q0 */
    public final boolean m63298q0() {
        return this._isCompleted;
    }

    /* renamed from: A0 */
    public final void mo55591A0(long j, C7769c cVar) {
        int B0 = mo55592B0(j, cVar);
        if (B0 != 0) {
            if (B0 == 1) {
                mo55566g0(j, cVar);
            } else if (B0 != 2) {
                throw new IllegalStateException("unexpected result".toString());
            }
        } else if (mo55595E0(cVar)) {
            mo65197h0();
        }
    }

    /* renamed from: B0 */
    public final int mo55592B0(long j, C7769c cVar) {
        if (m63298q0()) {
            return 1;
        }
        C7770d dVar = (C7770d) this._delayed;
        if (dVar == null) {
            C2265f6.m16607a(f40378s, this, (Object) null, new C7770d(j));
            Object obj = this._delayed;
            vx2.m53588d(obj);
            dVar = (C7770d) obj;
        }
        return cVar.mo55611g(j, dVar, this);
    }

    /* renamed from: C0 */
    public final zh1 mo55593C0(long j, Runnable runnable) {
        long c = qt1.m71345c(j);
        if (c >= 4611686018427387903L) {
            return j84.f38629a;
        }
        C7208i7.m58864a();
        long nanoTime = System.nanoTime();
        C7768b bVar = new C7768b(c + nanoTime, runnable);
        mo55591A0(nanoTime, bVar);
        return bVar;
    }

    /* renamed from: D0 */
    public final void mo55594D0(boolean z) {
        this._isCompleted = z ? 1 : 0;
    }

    /* renamed from: E0 */
    public final boolean mo55595E0(C7769c cVar) {
        C7769c cVar2;
        C7770d dVar = (C7770d) this._delayed;
        if (dVar != null) {
            cVar2 = (C7769c) dVar.mo55956e();
        } else {
            cVar2 = null;
        }
        if (cVar2 == cVar) {
            return true;
        }
        return false;
    }

    /* renamed from: P */
    public long mo55596P() {
        C7769c cVar;
        if (super.mo55596P() == 0) {
            return 0;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof ek3) {
                if (!((ek3) obj).mo51498g()) {
                    return 0;
                }
            } else if (obj == qt1.f44235b) {
                return Long.MAX_VALUE;
            } else {
                return 0;
            }
        }
        C7770d dVar = (C7770d) this._delayed;
        if (dVar == null || (cVar = (C7769c) dVar.mo55956e()) == null) {
            return Long.MAX_VALUE;
        }
        long j = cVar.f40382a;
        C7208i7.m58864a();
        return d75.m43383e(j - System.nanoTime(), 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x004f  */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo55597Y() {
        /*
            r9 = this;
            boolean r0 = r9.mo62805b0()
            r1 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.lang.Object r0 = r9._delayed
            kotlinx.coroutines.d$d r0 = (kotlinx.coroutines.C7766d.C7770d) r0
            if (r0 == 0) goto L_0x0045
            boolean r3 = r0.mo55955d()
            if (r3 != 0) goto L_0x0045
            p000.C7208i7.m58864a()
            long r3 = java.lang.System.nanoTime()
        L_0x001c:
            monitor-enter(r0)
            mp6 r5 = r0.mo55953b()     // Catch:{ all -> 0x0042 }
            r6 = 0
            if (r5 != 0) goto L_0x0026
            monitor-exit(r0)
            goto L_0x003d
        L_0x0026:
            kotlinx.coroutines.d$c r5 = (kotlinx.coroutines.C7766d.C7769c) r5     // Catch:{ all -> 0x0042 }
            boolean r7 = r5.mo55613h(r3)     // Catch:{ all -> 0x0042 }
            r8 = 0
            if (r7 == 0) goto L_0x0034
            boolean r5 = r9.mo55600o0(r5)     // Catch:{ all -> 0x0042 }
            goto L_0x0035
        L_0x0034:
            r5 = r8
        L_0x0035:
            if (r5 == 0) goto L_0x003c
            mp6 r5 = r0.mo55959h(r8)     // Catch:{ all -> 0x0042 }
            r6 = r5
        L_0x003c:
            monitor-exit(r0)
        L_0x003d:
            kotlinx.coroutines.d$c r6 = (kotlinx.coroutines.C7766d.C7769c) r6
            if (r6 != 0) goto L_0x001c
            goto L_0x0045
        L_0x0042:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0045:
            java.lang.Runnable r0 = r9.mo55599k0()
            if (r0 == 0) goto L_0x004f
            r0.run()
            return r1
        L_0x004f:
            long r0 = r9.mo55596P()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C7766d.mo55597Y():long");
    }

    /* renamed from: f */
    public void mo51194f(long j, ma0<? super r37> ma0) {
        long c = qt1.m71345c(j);
        if (c < 4611686018427387903L) {
            C7208i7.m58864a();
            long nanoTime = System.nanoTime();
            C7767a aVar = new C7767a(c + nanoTime, ma0);
            mo55591A0(nanoTime, aVar);
            pa0.m70973a(ma0, aVar);
        }
    }

    /* renamed from: i */
    public zh1 mo51195i(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return ib1.C7211a.m58891a(this, j, runnable, coroutineContext);
    }

    /* renamed from: j0 */
    public final void mo55598j0() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                if (C2265f6.m16607a(f40377r, this, (Object) null, qt1.f44235b)) {
                    return;
                }
            } else if (obj instanceof ek3) {
                ((ek3) obj).mo51495d();
                return;
            } else if (obj != qt1.f44235b) {
                ek3 ek3 = new ek3(8, true);
                ek3.mo51492a((Runnable) obj);
                if (C2265f6.m16607a(f40377r, this, obj, ek3)) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: k0 */
    public final Runnable mo55599k0() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof ek3) {
                ek3 ek3 = (ek3) obj;
                Object j = ek3.mo51501j();
                if (j != ek3.f37566h) {
                    return (Runnable) j;
                }
                C2265f6.m16607a(f40377r, this, obj, ek3.mo51500i());
            } else if (obj == qt1.f44235b) {
                return null;
            } else {
                if (C2265f6.m16607a(f40377r, this, obj, (Object) null)) {
                    return (Runnable) obj;
                }
            }
        }
    }

    /* renamed from: l0 */
    public void mo55567l0(Runnable runnable) {
        if (mo55600o0(runnable)) {
            mo65197h0();
        } else {
            C7758b.f40363x.mo55567l0(runnable);
        }
    }

    /* renamed from: m */
    public final void mo3894m(CoroutineContext coroutineContext, Runnable runnable) {
        mo55567l0(runnable);
    }

    /* renamed from: o0 */
    public final boolean mo55600o0(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (m63298q0()) {
                return false;
            }
            if (obj == null) {
                if (C2265f6.m16607a(f40377r, this, (Object) null, runnable)) {
                    return true;
                }
            } else if (obj instanceof ek3) {
                ek3 ek3 = (ek3) obj;
                int a = ek3.mo51492a(runnable);
                if (a == 0) {
                    return true;
                }
                if (a == 1) {
                    C2265f6.m16607a(f40377r, this, obj, ek3.mo51500i());
                } else if (a == 2) {
                    return false;
                }
            } else if (obj == qt1.f44235b) {
                return false;
            } else {
                ek3 ek32 = new ek3(8, true);
                ek32.mo51492a((Runnable) obj);
                ek32.mo51492a(runnable);
                if (C2265f6.m16607a(f40377r, this, obj, ek32)) {
                    return true;
                }
            }
        }
    }

    /* renamed from: s0 */
    public boolean mo55601s0() {
        if (!mo62804X()) {
            return false;
        }
        C7770d dVar = (C7770d) this._delayed;
        if (dVar != null && !dVar.mo55955d()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof ek3) {
                return ((ek3) obj).mo51498g();
            }
            if (obj != qt1.f44235b) {
                return false;
            }
        }
        return true;
    }

    public void shutdown() {
        ip6.f38501a.mo52520c();
        mo55594D0(true);
        mo55598j0();
        do {
        } while (mo55597Y() <= 0);
        mo55602x0();
    }

    /* renamed from: x0 */
    public final void mo55602x0() {
        C7769c cVar;
        C7208i7.m58864a();
        long nanoTime = System.nanoTime();
        while (true) {
            C7770d dVar = (C7770d) this._delayed;
            if (dVar != null && (cVar = (C7769c) dVar.mo55960i()) != null) {
                mo55566g0(nanoTime, cVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: y0 */
    public final void mo55603y0() {
        this._queue = null;
        this._delayed = null;
    }
}
