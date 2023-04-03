package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "acc", "Lkotlin/coroutines/CoroutineContext$a;", "element", "invoke", "(Ljava/lang/String;Lkotlin/coroutines/CoroutineContext$a;)Ljava/lang/String;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: CoroutineContextImpl.kt */
public final class CombinedContext$toString$1 extends Lambda implements fd2<String, CoroutineContext.C6188a, String> {
    public static final CombinedContext$toString$1 INSTANCE = new CombinedContext$toString$1();

    public CombinedContext$toString$1() {
        super(2);
    }

    public final String invoke(String str, CoroutineContext.C6188a aVar) {
        vx2.m53591g(str, "acc");
        vx2.m53591g(aVar, "element");
        if (str.length() == 0) {
            return aVar.toString();
        }
        return str + ", " + aVar;
    }
}
