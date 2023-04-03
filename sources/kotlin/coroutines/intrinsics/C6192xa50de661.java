package kotlin.coroutines.intrinsics;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, mo44877d2 = {"kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/Result;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "label", "I", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2 */
/* compiled from: IntrinsicsJvm.kt */
public final class C6192xa50de661 extends ContinuationImpl {
    public final /* synthetic */ rc2 $this_createCoroutineUnintercepted$inlined;
    private int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6192xa50de661(ns0 ns0, CoroutineContext coroutineContext, rc2 rc2) {
        super(ns0, coroutineContext);
        this.$this_createCoroutineUnintercepted$inlined = rc2;
        vx2.m53589e(ns0, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    public Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            this.label = 1;
            hg5.m45199b(obj);
            vx2.m53589e(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
            return ((rc2) t07.m52027f(this.$this_createCoroutineUnintercepted$inlined, 1)).invoke(this);
        } else if (i == 1) {
            this.label = 2;
            hg5.m45199b(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }
}
