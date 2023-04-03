package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"E", "", "<anonymous parameter 0>", "Lr37;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 6, 0})
/* compiled from: OnUndeliveredElement.kt */
public final class OnUndeliveredElementKt$bindCancellationFun$1 extends Lambda implements rc2<Throwable, r37> {
    public final /* synthetic */ CoroutineContext $context;
    public final /* synthetic */ E $element;
    public final /* synthetic */ rc2<E, r37> $this_bindCancellationFun;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnUndeliveredElementKt$bindCancellationFun$1(rc2<? super E, r37> rc2, E e, CoroutineContext coroutineContext) {
        super(1);
        this.$this_bindCancellationFun = rc2;
        this.$element = e;
        this.$context = coroutineContext;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return r37.f33317a;
    }

    public final void invoke(Throwable th) {
        OnUndeliveredElementKt.m63492b(this.$this_bindCancellationFun, this.$element, this.$context);
    }
}
