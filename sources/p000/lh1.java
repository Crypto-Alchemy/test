package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.ThreadContextKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u001d\u0012\u0006\u0010,\u001a\u00020*\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b>\u0010?J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001d\u001a\u00020\t2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0015\u001a\u00020\u0012H\u0010¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00028\u0000H\u0000¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020*8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010+R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0004¢\u0006\u0006\n\u0004\b%\u0010-R\u001e\u00101\u001a\u0004\u0018\u00010\u00188\u0000@\u0000X\u000e¢\u0006\f\n\u0004\b.\u0010/\u0012\u0004\b0\u0010\u000bR\u0014\u00103\u001a\u00020\u00188\u0000X\u0004¢\u0006\u0006\n\u0004\b2\u0010/R\u0014\u0010#\u001a\u00020\"8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b4\u00105R\u001c\u00108\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058PX\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u001a\u0010=\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r8BX\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u000f\u0002\u0004\n\u0002\b\u0019¨\u0006@"}, mo44877d2 = {"Llh1;", "T", "Lnh1;", "Lju0;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lns0;", "", "n", "()Z", "Lr37;", "h", "()V", "p", "Lna0;", "j", "()Lna0;", "Lma0;", "continuation", "", "q", "(Lma0;)Ljava/lang/Throwable;", "cause", "o", "(Ljava/lang/Throwable;)Z", "", "g", "()Ljava/lang/Object;", "Lkotlin/Result;", "result", "resumeWith", "(Ljava/lang/Object;)V", "takenState", "a", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "value", "k", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lns0;", "r", "Ljava/lang/Object;", "get_state$kotlinx_coroutines_core$annotations", "_state", "s", "countOrElement", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getCallerFrame", "()Lju0;", "callerFrame", "b", "()Lns0;", "delegate", "l", "reusableCancellableContinuation", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lns0;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: lh1 */
/* compiled from: DispatchedContinuation.kt */
public final class lh1<T> extends nh1<T> implements ju0, ns0<T> {

    /* renamed from: x */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f40618x = AtomicReferenceFieldUpdater.newUpdater(lh1.class, Object.class, "_reusableCancellableContinuation");
    private volatile /* synthetic */ Object _reusableCancellableContinuation = null;

    /* renamed from: g */
    public final CoroutineDispatcher f40619g;

    /* renamed from: k */
    public final ns0<T> f40620k;

    /* renamed from: r */
    public Object f40621r = mh1.f40918a;

    /* renamed from: s */
    public final Object f40622s = ThreadContextKt.m63496b(getContext());

    public lh1(CoroutineDispatcher coroutineDispatcher, ns0<? super T> ns0) {
        super(-1);
        this.f40619g = coroutineDispatcher;
        this.f40620k = ns0;
    }

    /* renamed from: a */
    public void mo55894a(Object obj, Throwable th) {
        if (obj instanceof mm0) {
            ((mm0) obj).f40939b.invoke(th);
        }
    }

    /* renamed from: b */
    public ns0<T> mo55895b() {
        return this;
    }

    /* renamed from: g */
    public Object mo55896g() {
        Object obj = this.f40621r;
        this.f40621r = mh1.f40918a;
        return obj;
    }

    public ju0 getCallerFrame() {
        ns0<T> ns0 = this.f40620k;
        if (ns0 instanceof ju0) {
            return (ju0) ns0;
        }
        return null;
    }

    public CoroutineContext getContext() {
        return this.f40620k.getContext();
    }

    /* renamed from: h */
    public final void mo55897h() {
        do {
        } while (this._reusableCancellableContinuation == mh1.f40919b);
    }

    /* renamed from: j */
    public final na0<T> mo55898j() {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = mh1.f40919b;
                return null;
            } else if (obj instanceof na0) {
                if (C2265f6.m16607a(f40618x, this, obj, mh1.f40919b)) {
                    return (na0) obj;
                }
            } else if (obj != mh1.f40919b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    /* renamed from: k */
    public final void mo55899k(CoroutineContext coroutineContext, T t) {
        this.f40621r = t;
        this.f43474e = 1;
        this.f40619g.mo50471y(coroutineContext, this);
    }

    /* renamed from: l */
    public final na0<?> mo55900l() {
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof na0) {
            return (na0) obj;
        }
        return null;
    }

    /* renamed from: n */
    public final boolean mo55901n() {
        if (this._reusableCancellableContinuation != null) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final boolean mo55902o(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            xj6 xj6 = mh1.f40919b;
            if (vx2.m53586b(obj, xj6)) {
                if (C2265f6.m16607a(f40618x, this, xj6, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (C2265f6.m16607a(f40618x, this, obj, (Object) null)) {
                    return false;
                }
            }
        }
    }

    /* renamed from: p */
    public final void mo55903p() {
        mo55897h();
        na0<?> l = mo55900l();
        if (l != null) {
            l.mo56418o();
        }
    }

    /* renamed from: q */
    public final Throwable mo55904q(ma0<?> ma0) {
        xj6 xj6;
        do {
            Object obj = this._reusableCancellableContinuation;
            xj6 = mh1.f40919b;
            if (obj != xj6) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                } else if (C2265f6.m16607a(f40618x, this, obj, (Object) null)) {
                    return (Throwable) obj;
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
        } while (!C2265f6.m16607a(f40618x, this, xj6, ma0));
        return null;
    }

    public void resumeWith(Object obj) {
        CoroutineContext context;
        Object c;
        CoroutineContext context2 = this.f40620k.getContext();
        Object d = om0.m70402d(obj, (rc2) null, 1, (Object) null);
        if (this.f40619g.mo28541z(context2)) {
            this.f40621r = d;
            this.f43474e = 0;
            this.f40619g.mo3894m(context2, this);
            return;
        }
        nt1 b = ip6.f38501a.mo52519b();
        if (b.mo62803W()) {
            this.f40621r = d;
            this.f43474e = 0;
            b.mo62801O(this);
            return;
        }
        b.mo62802Q(true);
        try {
            context = getContext();
            c = ThreadContextKt.m63497c(context, this.f40622s);
            this.f40620k.resumeWith(obj);
            r37 r37 = r37.f33317a;
            ThreadContextKt.m63495a(context, c);
            do {
            } while (b.mo62805b0());
        } catch (Throwable th) {
            try {
                mo62687e(th, (Throwable) null);
            } catch (Throwable th2) {
                b.mo62799K(true);
                throw th2;
            }
        }
        b.mo62799K(true);
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f40619g + ", " + b31.m55724c(this.f40620k) + ']';
    }
}
