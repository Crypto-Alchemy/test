package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Lkotlin/coroutines/CoroutineContext;", "result", "Lkotlin/coroutines/CoroutineContext$a;", "element", "invoke", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$a;)Lkotlin/coroutines/CoroutineContext;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 6, 0})
/* compiled from: CoroutineContext.kt */
public final class CoroutineContextKt$foldCopies$folded$1 extends Lambda implements fd2<CoroutineContext, CoroutineContext.C6188a, CoroutineContext> {
    public final /* synthetic */ boolean $isNewCoroutine;
    public final /* synthetic */ Ref$ObjectRef<CoroutineContext> $leftoverContext;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutineContextKt$foldCopies$folded$1(Ref$ObjectRef<CoroutineContext> ref$ObjectRef, boolean z) {
        super(2);
        this.$leftoverContext = ref$ObjectRef;
        this.$isNewCoroutine = z;
    }

    public final CoroutineContext invoke(CoroutineContext coroutineContext, CoroutineContext.C6188a aVar) {
        if (!(aVar instanceof st0)) {
            return coroutineContext.plus(aVar);
        }
        CoroutineContext.C6188a aVar2 = ((CoroutineContext) this.$leftoverContext.element).get(aVar.getKey());
        if (aVar2 == null) {
            st0 st0 = (st0) aVar;
            if (this.$isNewCoroutine) {
                st0 = st0.mo65909j();
            }
            return coroutineContext.plus(st0);
        }
        Ref$ObjectRef<CoroutineContext> ref$ObjectRef = this.$leftoverContext;
        ref$ObjectRef.element = ((CoroutineContext) ref$ObjectRef.element).minusKey(aVar.getKey());
        return coroutineContext.plus(((st0) aVar).mo65908e(aVar2));
    }
}
