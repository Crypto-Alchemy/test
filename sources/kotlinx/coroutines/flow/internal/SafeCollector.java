package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt__IndentKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\u00020\u0004B\u001d\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0015¢\u0006\u0004\b-\u0010.J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\"\u0010\n\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\r\u001a\u00020\fH\u0016J\u001b\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0013\u001a\u0004\u0018\u00010\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00112\u0006\u0010\u000e\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000e\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0002R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00158\u0000X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0000X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u0010 R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010)\u001a\u0004\u0018\u00010\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020\u00158VX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+\u0002\u0004\n\u0002\b\u0019¨\u0006/"}, mo44877d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector;", "T", "La52;", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lju0;", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "Lkotlin/Result;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lr37;", "releaseIntercepted", "value", "emit", "(Ljava/lang/Object;Lns0;)Ljava/lang/Object;", "Lns0;", "uCont", "d", "(Lns0;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "currentContext", "previousContext", "a", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "Lui1;", "exception", "h", "collector", "La52;", "collectContext", "Lkotlin/coroutines/CoroutineContext;", "", "collectContextSize", "I", "lastEmissionContext", "completion", "Lns0;", "getCallerFrame", "()Lju0;", "callerFrame", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "(La52;Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: SafeCollector.kt */
public final class SafeCollector<T> extends ContinuationImpl implements a52<T> {
    public final CoroutineContext collectContext;
    public final int collectContextSize;
    public final a52<T> collector;
    private ns0<? super r37> completion;
    private CoroutineContext lastEmissionContext;

    public SafeCollector(a52<? super T> a52, CoroutineContext coroutineContext) {
        super(s74.f44537a, EmptyCoroutineContext.INSTANCE);
        this.collector = a52;
        this.collectContext = coroutineContext;
        this.collectContextSize = ((Number) coroutineContext.fold(0, SafeCollector$collectContextSize$1.INSTANCE)).intValue();
    }

    /* renamed from: a */
    public final void mo55678a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, T t) {
        if (coroutineContext2 instanceof ui1) {
            mo55680h((ui1) coroutineContext2, t);
        }
        SafeCollector_commonKt.m63469a(this, coroutineContext);
    }

    /* renamed from: d */
    public final Object mo55679d(ns0<? super r37> ns0, T t) {
        CoroutineContext context = ns0.getContext();
        g33.m58014k(context);
        CoroutineContext coroutineContext = this.lastEmissionContext;
        if (coroutineContext != context) {
            mo55678a(context, coroutineContext, t);
            this.lastEmissionContext = context;
        }
        this.completion = ns0;
        Object invoke = SafeCollectorKt.f40465a.invoke(this.collector, t, this);
        if (!vx2.m53586b(invoke, wx2.m54101d())) {
            this.completion = null;
        }
        return invoke;
    }

    public Object emit(T t, ns0<? super r37> ns0) {
        try {
            Object d = mo55679d(ns0, t);
            if (d == wx2.m54101d()) {
                a31.m31656c(ns0);
            }
            if (d == wx2.m54101d()) {
                return d;
            }
            return r37.f33317a;
        } catch (Throwable th) {
            this.lastEmissionContext = new ui1(th, ns0.getContext());
            throw th;
        }
    }

    public ju0 getCallerFrame() {
        ns0<? super r37> ns0 = this.completion;
        if (ns0 instanceof ju0) {
            return (ju0) ns0;
        }
        return null;
    }

    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.lastEmissionContext;
        if (coroutineContext == null) {
            return EmptyCoroutineContext.INSTANCE;
        }
        return coroutineContext;
    }

    public StackTraceElement getStackTraceElement() {
        return null;
    }

    /* renamed from: h */
    public final void mo55680h(ui1 ui1, Object obj) {
        throw new IllegalStateException(StringsKt__IndentKt.m63057f("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ui1.f45078a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    public Object invokeSuspend(Object obj) {
        Throwable r0 = Result.m75638exceptionOrNullimpl(obj);
        if (r0 != null) {
            this.lastEmissionContext = new ui1(r0, getContext());
        }
        ns0<? super r37> ns0 = this.completion;
        if (ns0 != null) {
            ns0.resumeWith(obj);
        }
        return wx2.m54101d();
    }

    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
