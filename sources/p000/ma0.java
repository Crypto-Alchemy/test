package p000;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002J%\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\u0006\u0010\u0007J9\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH'¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\tH'J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0004H'J\u0014\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\tH&J\"\u0010\u0017\u001a\u00020\n2\u0018\u0010\u0016\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u0015H&J\u001b\u0010\u0019\u001a\u00020\n*\u00020\u00182\u0006\u0010\u0003\u001a\u00028\u0000H'¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u00002\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH'¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, mo44877d2 = {"Lma0;", "T", "Lns0;", "value", "", "idempotent", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "Lr37;", "onCancellation", "B", "(Ljava/lang/Object;Ljava/lang/Object;Lrc2;)Ljava/lang/Object;", "exception", "i", "token", "F", "cause", "", "m", "Lkotlinx/coroutines/CompletionHandler;", "handler", "t", "Lkotlinx/coroutines/CoroutineDispatcher;", "y", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Object;)V", "w", "(Ljava/lang/Object;Lrc2;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: ma0 */
/* compiled from: CancellableContinuation.kt */
public interface ma0<T> extends ns0<T> {

    @Metadata(mo44878k = 3, mo44879mv = {1, 6, 0}, mo44881xi = 48)
    /* renamed from: ma0$a */
    /* compiled from: CancellableContinuation.kt */
    public static final class C7871a {
        /* renamed from: a */
        public static /* synthetic */ boolean m64215a(ma0 ma0, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    th = null;
                }
                return ma0.mo56165m(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        /* renamed from: b */
        public static /* synthetic */ Object m64216b(ma0 ma0, Object obj, Object obj2, int i, Object obj3) {
            if (obj3 == null) {
                if ((i & 2) != 0) {
                    obj2 = null;
                }
                return ma0.mo56163f(obj, obj2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryResume");
        }
    }

    /* renamed from: B */
    Object mo56161B(T t, Object obj, rc2<? super Throwable, r37> rc2);

    /* renamed from: F */
    void mo56162F(Object obj);

    /* renamed from: f */
    Object mo56163f(T t, Object obj);

    /* renamed from: i */
    Object mo56164i(Throwable th);

    /* renamed from: m */
    boolean mo56165m(Throwable th);

    /* renamed from: t */
    void mo56166t(rc2<? super Throwable, r37> rc2);

    /* renamed from: w */
    void mo56167w(T t, rc2<? super Throwable, r37> rc2);

    /* renamed from: y */
    void mo56168y(CoroutineDispatcher coroutineDispatcher, T t);
}
