package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.CoroutineDispatcher;
import p000.y23;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005B\u001d\u0012\f\u0010i\u001a\b\u0012\u0004\u0012\u00028\u00000e\u0012\u0006\u0010'\u001a\u00020!¢\u0006\u0004\by\u0010zJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0011\u001a\u00020\u000e2\u0018\u0010\u0010\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\bJ\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\bJ\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J3\u0010\u001c\u001a\u00020\u000e2\u0018\u0010\u0010\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\u001f\u001a\u00020\u001e2\u0018\u0010\u0010\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000fH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$JK\u0010*\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u001a2\u0006\u0010'\u001a\u00020!2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\b\u0010)\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b*\u0010+J9\u0010,\u001a\u00020\u000e2\b\u0010&\u001a\u0004\u0018\u00010\u001a2\u0006\u0010'\u001a\u00020!2\u0016\b\u0002\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0002¢\u0006\u0004\b,\u0010-J;\u0010/\u001a\u0004\u0018\u00010.2\b\u0010&\u001a\u0004\u0018\u00010\u001a2\b\u0010)\u001a\u0004\u0018\u00010\u001a2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0002¢\u0006\u0004\b/\u00100J\u0019\u00102\u001a\u0002012\b\u0010&\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u000eH\u0002¢\u0006\u0004\b4\u0010\u0019J\u000f\u00105\u001a\u00020\u000eH\u0016¢\u0006\u0004\b5\u0010\u0019J\u000f\u00106\u001a\u00020\u0006H\u0001¢\u0006\u0004\b6\u0010\bJ\u0011\u00107\u001a\u0004\u0018\u00010\u001aH\u0010¢\u0006\u0004\b7\u00108J!\u0010:\u001a\u00020\u000e2\b\u00109\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b:\u0010;J\u0019\u0010<\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b<\u0010\fJ\u0017\u0010=\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b=\u0010>J\u001f\u0010?\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u001e2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b?\u0010@J)\u0010A\u001a\u00020\u000e2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\bA\u0010\u0012J\u0017\u0010D\u001a\u00020\t2\u0006\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bD\u0010EJ\u0011\u0010F\u001a\u0004\u0018\u00010\u001aH\u0001¢\u0006\u0004\bF\u00108J \u0010I\u001a\u00020\u000e2\f\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000GH\u0016ø\u0001\u0000¢\u0006\u0004\bI\u0010JJ-\u0010L\u001a\u00020\u000e2\u0006\u0010K\u001a\u00028\u00002\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0016¢\u0006\u0004\bL\u0010MJ)\u0010N\u001a\u00020\u000e2\u0018\u0010\u0010\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000fH\u0016¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u000eH\u0000¢\u0006\u0004\bP\u0010\u0019J#\u0010Q\u001a\u0004\u0018\u00010\u001a2\u0006\u0010K\u001a\u00028\u00002\b\u0010)\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\bQ\u0010RJ9\u0010S\u001a\u0004\u0018\u00010\u001a2\u0006\u0010K\u001a\u00028\u00002\b\u0010)\u001a\u0004\u0018\u00010\u001a2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0016¢\u0006\u0004\bS\u0010TJ\u0019\u0010V\u001a\u0004\u0018\u00010\u001a2\u0006\u0010U\u001a\u00020\tH\u0016¢\u0006\u0004\bV\u0010WJ\u0017\u0010Y\u001a\u00020\u000e2\u0006\u0010X\u001a\u00020\u001aH\u0016¢\u0006\u0004\bY\u0010JJ\u001b\u0010[\u001a\u00020\u000e*\u00020Z2\u0006\u0010K\u001a\u00028\u0000H\u0016¢\u0006\u0004\b[\u0010\\J\u001f\u0010]\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0010¢\u0006\u0004\b]\u0010^J\u001b\u0010_\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0010¢\u0006\u0004\b_\u0010`J\u000f\u0010b\u001a\u00020aH\u0016¢\u0006\u0004\bb\u0010cJ\u000f\u0010d\u001a\u00020aH\u0014¢\u0006\u0004\bd\u0010cR \u0010i\u001a\b\u0012\u0004\u0012\u00028\u00000e8\u0000X\u0004¢\u0006\f\n\u0004\b7\u0010f\u001a\u0004\bg\u0010hR\u001a\u0010n\u001a\u00020j8\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010k\u001a\u0004\bl\u0010mR\u0018\u0010p\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bD\u0010oR\u0014\u0010r\u001a\u00020a8BX\u0004¢\u0006\u0006\u001a\u0004\bq\u0010cR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8@X\u0004¢\u0006\u0006\u001a\u0004\bs\u00108R\u0014\u0010u\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\bt\u0010\bR\u001c\u0010x\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058VX\u0004¢\u0006\u0006\u001a\u0004\bv\u0010w\u0002\u0004\n\u0002\b\u0019¨\u0006{"}, mo44877d2 = {"Lna0;", "T", "Lnh1;", "Lma0;", "Lju0;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "", "C", "()Z", "", "cause", "n", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lr37;", "Lkotlinx/coroutines/CompletionHandler;", "handler", "k", "(Lrc2;Ljava/lang/Throwable;)V", "P", "N", "Lzh1;", "z", "()Lzh1;", "I", "()V", "", "state", "E", "(Lrc2;Ljava/lang/Object;)V", "Lga0;", "D", "(Lrc2;)Lga0;", "", "mode", "q", "(I)V", "Lp84;", "proposedUpdate", "resumeMode", "onCancellation", "idempotent", "M", "(Lp84;Ljava/lang/Object;ILrc2;Ljava/lang/Object;)Ljava/lang/Object;", "K", "(Ljava/lang/Object;ILrc2;)V", "Lxj6;", "O", "(Ljava/lang/Object;Ljava/lang/Object;Lrc2;)Lxj6;", "", "h", "(Ljava/lang/Object;)Ljava/lang/Void;", "p", "x", "J", "g", "()Ljava/lang/Object;", "takenState", "a", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "m", "H", "(Ljava/lang/Throwable;)V", "j", "(Lga0;Ljava/lang/Throwable;)V", "l", "Ly23;", "parent", "r", "(Ly23;)Ljava/lang/Throwable;", "s", "Lkotlin/Result;", "result", "resumeWith", "(Ljava/lang/Object;)V", "value", "w", "(Ljava/lang/Object;Lrc2;)V", "t", "(Lrc2;)V", "o", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "B", "(Ljava/lang/Object;Ljava/lang/Object;Lrc2;)Ljava/lang/Object;", "exception", "i", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "F", "Lkotlinx/coroutines/CoroutineDispatcher;", "y", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Object;)V", "d", "(Ljava/lang/Object;)Ljava/lang/Object;", "c", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "toString", "()Ljava/lang/String;", "G", "Lns0;", "Lns0;", "b", "()Lns0;", "delegate", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "Lzh1;", "parentHandle", "v", "stateDebugRepresentation", "u", "A", "isCompleted", "getCallerFrame", "()Lju0;", "callerFrame", "<init>", "(Lns0;I)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: na0 */
/* compiled from: CancellableContinuationImpl.kt */
public class na0<T> extends nh1<T> implements ma0<T>, ju0 {

    /* renamed from: s */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f41124s = AtomicIntegerFieldUpdater.newUpdater(na0.class, "_decision");

    /* renamed from: x */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f41125x = AtomicReferenceFieldUpdater.newUpdater(na0.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision = 0;
    private volatile /* synthetic */ Object _state = C7257j9.f38631a;

    /* renamed from: g */
    public final ns0<T> f41126g;

    /* renamed from: k */
    public final CoroutineContext f41127k;

    /* renamed from: r */
    public zh1 f41128r;

    public na0(ns0<? super T> ns0, int i) {
        super(i);
        this.f41126g = ns0;
        this.f41127k = ns0.getContext();
    }

    /* renamed from: L */
    public static /* synthetic */ void m64560L(na0 na0, Object obj, int i, rc2 rc2, int i2, Object obj2) {
        if (obj2 == null) {
            if ((i2 & 4) != 0) {
                rc2 = null;
            }
            na0.mo56406K(obj, i, rc2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
    }

    /* renamed from: A */
    public boolean mo56399A() {
        return !(mo56423u() instanceof p84);
    }

    /* renamed from: B */
    public Object mo56161B(T t, Object obj, rc2<? super Throwable, r37> rc2) {
        return mo56409O(t, obj, rc2);
    }

    /* renamed from: C */
    public final boolean mo56400C() {
        if (!oh1.m70283c(this.f43474e) || !((lh1) this.f41126g).mo55901n()) {
            return false;
        }
        return true;
    }

    /* renamed from: D */
    public final ga0 mo56401D(rc2<? super Throwable, r37> rc2) {
        if (rc2 instanceof ga0) {
            return (ga0) rc2;
        }
        return new jy2(rc2);
    }

    /* renamed from: E */
    public final void mo56402E(rc2<? super Throwable, r37> rc2, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + rc2 + ", already has " + obj).toString());
    }

    /* renamed from: F */
    public void mo56162F(Object obj) {
        mo56420q(this.f43474e);
    }

    /* renamed from: G */
    public String mo55534G() {
        return "CancellableContinuation";
    }

    /* renamed from: H */
    public final void mo56403H(Throwable th) {
        if (!mo56417n(th)) {
            mo56165m(th);
            mo56419p();
        }
    }

    /* renamed from: I */
    public final void mo56404I() {
        lh1 lh1;
        Throwable q;
        ns0<T> ns0 = this.f41126g;
        if (ns0 instanceof lh1) {
            lh1 = (lh1) ns0;
        } else {
            lh1 = null;
        }
        if (lh1 != null && (q = lh1.mo55904q(this)) != null) {
            mo56418o();
            mo56165m(q);
        }
    }

    /* renamed from: J */
    public final boolean mo56405J() {
        Object obj = this._state;
        if (!(obj instanceof jm0) || ((jm0) obj).f38747d == null) {
            this._decision = 0;
            this._state = C7257j9.f38631a;
            return true;
        }
        mo56418o();
        return false;
    }

    /* renamed from: K */
    public final void mo56406K(Object obj, int i, rc2<? super Throwable, r37> rc2) {
        Object obj2;
        do {
            obj2 = this._state;
            if (obj2 instanceof p84) {
            } else {
                if (obj2 instanceof va0) {
                    va0 va0 = (va0) obj2;
                    if (va0.mo66463c()) {
                        if (rc2 != null) {
                            mo56416l(rc2, va0.f40642a);
                            return;
                        }
                        return;
                    }
                }
                mo56413h(obj);
                throw new KotlinNothingValueException();
            }
        } while (!C2265f6.m16607a(f41125x, this, obj2, mo56407M((p84) obj2, obj, i, rc2, (Object) null)));
        mo56419p();
        mo56420q(i);
    }

    /* renamed from: M */
    public final Object mo56407M(p84 p84, Object obj, int i, rc2<? super Throwable, r37> rc2, Object obj2) {
        ga0 ga0;
        if (obj instanceof lm0) {
            return obj;
        }
        if (!oh1.m70282b(i) && obj2 == null) {
            return obj;
        }
        if (rc2 == null && ((!(p84 instanceof ga0) || (p84 instanceof u00)) && obj2 == null)) {
            return obj;
        }
        if (p84 instanceof ga0) {
            ga0 = (ga0) p84;
        } else {
            ga0 = null;
        }
        return new jm0(obj, ga0, rc2, obj2, (Throwable) null, 16, (DefaultConstructorMarker) null);
    }

    /* renamed from: N */
    public final boolean mo56408N() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f41124s.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: O */
    public final xj6 mo56409O(Object obj, Object obj2, rc2<? super Throwable, r37> rc2) {
        Object obj3;
        do {
            obj3 = this._state;
            if (obj3 instanceof p84) {
            } else if (!(obj3 instanceof jm0) || obj2 == null || ((jm0) obj3).f38747d != obj2) {
                return null;
            } else {
                return oa0.f43593a;
            }
        } while (!C2265f6.m16607a(f41125x, this, obj3, mo56407M((p84) obj3, obj, this.f43474e, rc2, obj2)));
        mo56419p();
        return oa0.f43593a;
    }

    /* renamed from: P */
    public final boolean mo56410P() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f41124s.compareAndSet(this, 0, 1));
        return true;
    }

    /* renamed from: a */
    public void mo55894a(Object obj, Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof p84) {
                throw new IllegalStateException("Not completed".toString());
            } else if (!(obj2 instanceof lm0)) {
                if (obj2 instanceof jm0) {
                    jm0 jm0 = (jm0) obj2;
                    if (!jm0.mo52746c()) {
                        if (C2265f6.m16607a(f41125x, this, obj2, jm0.m59468b(jm0, (Object) null, (ga0) null, (rc2) null, (Object) null, th, 15, (Object) null))) {
                            jm0.mo52747d(this, th);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else if (C2265f6.m16607a(f41125x, this, obj2, new jm0(obj2, (ga0) null, (rc2) null, (Object) null, th, 14, (DefaultConstructorMarker) null))) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final ns0<T> mo55895b() {
        return this.f41126g;
    }

    /* renamed from: c */
    public Throwable mo56411c(Object obj) {
        Throwable c = super.mo56411c(obj);
        if (c != null) {
            return c;
        }
        return null;
    }

    /* renamed from: d */
    public <T> T mo56412d(Object obj) {
        if (obj instanceof jm0) {
            return ((jm0) obj).f38744a;
        }
        return obj;
    }

    /* renamed from: f */
    public Object mo56163f(T t, Object obj) {
        return mo56409O(t, obj, (rc2<? super Throwable, r37>) null);
    }

    /* renamed from: g */
    public Object mo55896g() {
        return mo56423u();
    }

    public ju0 getCallerFrame() {
        ns0<T> ns0 = this.f41126g;
        if (ns0 instanceof ju0) {
            return (ju0) ns0;
        }
        return null;
    }

    public CoroutineContext getContext() {
        return this.f41127k;
    }

    /* renamed from: h */
    public final Void mo56413h(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    /* renamed from: i */
    public Object mo56164i(Throwable th) {
        return mo56409O(new lm0(th, false, 2, (DefaultConstructorMarker) null), (Object) null, (rc2<? super Throwable, r37>) null);
    }

    /* renamed from: j */
    public final void mo56414j(ga0 ga0, Throwable th) {
        try {
            ga0.mo50904a(th);
        } catch (Throwable th2) {
            CoroutineContext context = getContext();
            gu0.m58254a(context, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* renamed from: k */
    public final void mo56415k(rc2<? super Throwable, r37> rc2, Throwable th) {
        try {
            rc2.invoke(th);
        } catch (Throwable th2) {
            CoroutineContext context = getContext();
            gu0.m58254a(context, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* renamed from: l */
    public final void mo56416l(rc2<? super Throwable, r37> rc2, Throwable th) {
        try {
            rc2.invoke(th);
        } catch (Throwable th2) {
            CoroutineContext context = getContext();
            gu0.m58254a(context, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    /* renamed from: m */
    public boolean mo56165m(Throwable th) {
        Object obj;
        boolean z;
        ga0 ga0;
        do {
            obj = this._state;
            if (!(obj instanceof p84)) {
                return false;
            }
            z = obj instanceof ga0;
        } while (!C2265f6.m16607a(f41125x, this, obj, new va0(this, th, z)));
        if (z) {
            ga0 = (ga0) obj;
        } else {
            ga0 = null;
        }
        if (ga0 != null) {
            mo56414j(ga0, th);
        }
        mo56419p();
        mo56420q(this.f43474e);
        return true;
    }

    /* renamed from: n */
    public final boolean mo56417n(Throwable th) {
        if (!mo56400C()) {
            return false;
        }
        return ((lh1) this.f41126g).mo55902o(th);
    }

    /* renamed from: o */
    public final void mo56418o() {
        zh1 zh1 = this.f41128r;
        if (zh1 != null) {
            zh1.dispose();
            this.f41128r = j84.f38629a;
        }
    }

    /* renamed from: p */
    public final void mo56419p() {
        if (!mo56400C()) {
            mo56418o();
        }
    }

    /* renamed from: q */
    public final void mo56420q(int i) {
        if (!mo56408N()) {
            oh1.m70281a(this, i);
        }
    }

    /* renamed from: r */
    public Throwable mo55535r(y23 y23) {
        return y23.mo55510h();
    }

    public void resumeWith(Object obj) {
        m64560L(this, om0.m70400b(obj, this), this.f43474e, (rc2) null, 4, (Object) null);
    }

    /* renamed from: s */
    public final Object mo56421s() {
        y23 y23;
        boolean C = mo56400C();
        if (mo56410P()) {
            if (this.f41128r == null) {
                mo56426z();
            }
            if (C) {
                mo56404I();
            }
            return wx2.m54101d();
        }
        if (C) {
            mo56404I();
        }
        Object u = mo56423u();
        if (u instanceof lm0) {
            throw ((lm0) u).f40642a;
        } else if (!oh1.m70282b(this.f43474e) || (y23 = (y23) getContext().get(y23.f46117l)) == null || y23.mo55502a()) {
            return mo56412d(u);
        } else {
            CancellationException h = y23.mo55510h();
            mo55894a(u, h);
            throw h;
        }
    }

    /* renamed from: t */
    public void mo56166t(rc2<? super Throwable, r37> rc2) {
        ga0 D = mo56401D(rc2);
        while (true) {
            Object obj = this._state;
            if (obj instanceof C7257j9) {
                if (C2265f6.m16607a(f41125x, this, obj, D)) {
                    return;
                }
            } else if (obj instanceof ga0) {
                mo56402E(rc2, obj);
            } else {
                boolean z = obj instanceof lm0;
                if (z) {
                    lm0 lm0 = (lm0) obj;
                    if (!lm0.mo55924b()) {
                        mo56402E(rc2, obj);
                    }
                    if (obj instanceof va0) {
                        Throwable th = null;
                        if (!z) {
                            lm0 = null;
                        }
                        if (lm0 != null) {
                            th = lm0.f40642a;
                        }
                        mo56415k(rc2, th);
                        return;
                    }
                    return;
                } else if (obj instanceof jm0) {
                    jm0 jm0 = (jm0) obj;
                    if (jm0.f38745b != null) {
                        mo56402E(rc2, obj);
                    }
                    if (!(D instanceof u00)) {
                        if (jm0.mo52746c()) {
                            mo56415k(rc2, jm0.f38748e);
                            return;
                        }
                        if (C2265f6.m16607a(f41125x, this, obj, jm0.m59468b(jm0, (Object) null, D, (rc2) null, (Object) null, (Throwable) null, 29, (Object) null))) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (!(D instanceof u00)) {
                    if (C2265f6.m16607a(f41125x, this, obj, new jm0(obj, D, (rc2) null, (Object) null, (Throwable) null, 28, (DefaultConstructorMarker) null))) {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public String toString() {
        return mo55534G() + '(' + b31.m55724c(this.f41126g) + "){" + mo56424v() + "}@" + b31.m55723b(this);
    }

    /* renamed from: u */
    public final Object mo56423u() {
        return this._state;
    }

    /* renamed from: v */
    public final String mo56424v() {
        Object u = mo56423u();
        if (u instanceof p84) {
            return "Active";
        }
        if (u instanceof va0) {
            return "Cancelled";
        }
        return "Completed";
    }

    /* renamed from: w */
    public void mo56167w(T t, rc2<? super Throwable, r37> rc2) {
        mo56406K(t, this.f43474e, rc2);
    }

    /* renamed from: x */
    public void mo56425x() {
        zh1 z = mo56426z();
        if (z != null && mo56399A()) {
            z.dispose();
            this.f41128r = j84.f38629a;
        }
    }

    /* renamed from: y */
    public void mo56168y(CoroutineDispatcher coroutineDispatcher, T t) {
        lh1 lh1;
        int i;
        ns0<T> ns0 = this.f41126g;
        CoroutineDispatcher coroutineDispatcher2 = null;
        if (ns0 instanceof lh1) {
            lh1 = (lh1) ns0;
        } else {
            lh1 = null;
        }
        if (lh1 != null) {
            coroutineDispatcher2 = lh1.f40619g;
        }
        if (coroutineDispatcher2 == coroutineDispatcher) {
            i = 4;
        } else {
            i = this.f43474e;
        }
        m64560L(this, t, i, (rc2) null, 4, (Object) null);
    }

    /* renamed from: z */
    public final zh1 mo56426z() {
        y23 y23 = (y23) getContext().get(y23.f46117l);
        if (y23 == null) {
            return null;
        }
        zh1 d = y23.C9621a.m74229d(y23, true, false, new ge0(this), 2, (Object) null);
        this.f41128r = d;
        return d;
    }
}
