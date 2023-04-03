package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$IntRef;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Lr37;", "<anonymous parameter 0>", "Lkotlin/coroutines/CoroutineContext$a;", "element", "invoke", "(Lr37;Lkotlin/coroutines/CoroutineContext$a;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: CoroutineContextImpl.kt */
public final class CombinedContext$writeReplace$1 extends Lambda implements fd2<r37, CoroutineContext.C6188a, r37> {
    public final /* synthetic */ CoroutineContext[] $elements;
    public final /* synthetic */ Ref$IntRef $index;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CombinedContext$writeReplace$1(CoroutineContext[] coroutineContextArr, Ref$IntRef ref$IntRef) {
        super(2);
        this.$elements = coroutineContextArr;
        this.$index = ref$IntRef;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((r37) obj, (CoroutineContext.C6188a) obj2);
        return r37.f33317a;
    }

    public final void invoke(r37 r37, CoroutineContext.C6188a aVar) {
        vx2.m53591g(r37, "<anonymous parameter 0>");
        vx2.m53591g(aVar, "element");
        CoroutineContext[] coroutineContextArr = this.$elements;
        Ref$IntRef ref$IntRef = this.$index;
        int i = ref$IntRef.element;
        ref$IntRef.element = i + 1;
        coroutineContextArr[i] = aVar;
    }
}
