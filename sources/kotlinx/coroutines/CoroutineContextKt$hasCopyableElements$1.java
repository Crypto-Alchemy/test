package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "result", "Lkotlin/coroutines/CoroutineContext$a;", "it", "invoke", "(ZLkotlin/coroutines/CoroutineContext$a;)Ljava/lang/Boolean;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 6, 0})
/* compiled from: CoroutineContext.kt */
public final class CoroutineContextKt$hasCopyableElements$1 extends Lambda implements fd2<Boolean, CoroutineContext.C6188a, Boolean> {
    public static final CoroutineContextKt$hasCopyableElements$1 INSTANCE = new CoroutineContextKt$hasCopyableElements$1();

    public CoroutineContextKt$hasCopyableElements$1() {
        super(2);
    }

    public final Boolean invoke(boolean z, CoroutineContext.C6188a aVar) {
        return Boolean.valueOf(z || (aVar instanceof st0));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Boolean) obj).booleanValue(), (CoroutineContext.C6188a) obj2);
    }
}
