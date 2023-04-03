package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 \u001b*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\nB!\b\u0000\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0018\u0010\u0019B\u0017\b\u0011\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0018\u0010\u001aJ \u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\n\u0010\n\u001a\u0004\u0018\u00010\tH\u0001J\b\u0010\f\u001a\u00020\u000bH\u0016R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, mo44877d2 = {"Lmk5;", "T", "Lns0;", "Lju0;", "Lkotlin/Result;", "result", "Lr37;", "resumeWith", "(Ljava/lang/Object;)V", "", "a", "", "toString", "Lns0;", "delegate", "Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "getCallerFrame", "()Lju0;", "callerFrame", "initialResult", "<init>", "(Lns0;Ljava/lang/Object;)V", "(Lns0;)V", "d", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: mk5 */
/* compiled from: SafeContinuationJvm.kt */
public final class mk5<T> implements ns0<T>, ju0 {

    /* renamed from: d */
    public static final C6253a f31722d = new C6253a((DefaultConstructorMarker) null);
    @Deprecated

    /* renamed from: e */
    public static final AtomicReferenceFieldUpdater<mk5<?>, Object> f31723e = AtomicReferenceFieldUpdater.newUpdater(mk5.class, Object.class, "result");

    /* renamed from: a */
    public final ns0<T> f31724a;
    private volatile Object result;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\bRj\u0010\u0005\u001aR\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*(\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00020\u00028\u0002X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\b¨\u0006\n"}, mo44877d2 = {"Lmk5$a;", "", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "Lmk5;", "kotlin.jvm.PlatformType", "RESULT", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "getRESULT$annotations", "()V", "<init>", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: mk5$a */
    /* compiled from: SafeContinuationJvm.kt */
    public static final class C6253a {
        public C6253a() {
        }

        public /* synthetic */ C6253a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public mk5(ns0<? super T> ns0, Object obj) {
        vx2.m53591g(ns0, "delegate");
        this.f31724a = ns0;
        this.result = obj;
    }

    /* renamed from: a */
    public final Object mo45814a() {
        Object obj = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
        if (obj == coroutineSingletons) {
            if (C2265f6.m16607a(f31723e, this, coroutineSingletons, wx2.m54101d())) {
                return wx2.m54101d();
            }
            obj = this.result;
        }
        if (obj == CoroutineSingletons.RESUMED) {
            return wx2.m54101d();
        }
        if (!(obj instanceof Result.Failure)) {
            return obj;
        }
        throw ((Result.Failure) obj).exception;
    }

    public ju0 getCallerFrame() {
        ns0<T> ns0 = this.f31724a;
        if (ns0 instanceof ju0) {
            return (ju0) ns0;
        }
        return null;
    }

    public CoroutineContext getContext() {
        return this.f31724a.getContext();
    }

    public void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
            if (obj2 == coroutineSingletons) {
                if (C2265f6.m16607a(f31723e, this, coroutineSingletons, obj)) {
                    return;
                }
            } else if (obj2 != wx2.m54101d()) {
                throw new IllegalStateException("Already resumed");
            } else if (C2265f6.m16607a(f31723e, this, wx2.m54101d(), CoroutineSingletons.RESUMED)) {
                this.f31724a.resumeWith(obj);
                return;
            }
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.f31724a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public mk5(ns0<? super T> ns0) {
        this(ns0, CoroutineSingletons.UNDECIDED);
        vx2.m53591g(ns0, "delegate");
    }
}
