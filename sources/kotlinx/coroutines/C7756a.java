package kotlinx.coroutines;

import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\"\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\n"}, mo44877d2 = {"Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "Lr37;", "a", "", "Lfu0;", "Ljava/util/List;", "handlers", "kotlinx-coroutines-core"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.a */
/* compiled from: CoroutineExceptionHandlerImpl.kt */
public final class C7756a {

    /* renamed from: a */
    public static final List<fu0> f40356a;

    static {
        Class<fu0> cls = fu0.class;
        f40356a = SequencesKt___SequencesKt.m63020D(SequencesKt__SequencesKt.m63008c(ServiceLoader.load(cls, cls.getClassLoader()).iterator()));
    }

    /* renamed from: a */
    public static final void m63234a(CoroutineContext coroutineContext, Throwable th) {
        for (fu0 q : f40356a) {
            try {
                q.mo4113q(coroutineContext, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, gu0.m58255b(th, th2));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            Result.C6167a aVar = Result.Companion;
            ru1.m51326a(th, new DiagnosticCoroutineContextException(coroutineContext));
            Result.m75635constructorimpl(r37.f33317a);
        } catch (Throwable th3) {
            Result.C6167a aVar2 = Result.Companion;
            Result.m75635constructorimpl(hg5.m45198a(th3));
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
