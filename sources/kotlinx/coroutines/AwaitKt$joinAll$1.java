package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 6, 0}, mo44881xi = 48)
@v21(mo48631c = "kotlinx.coroutines.AwaitKt", mo48632f = "Await.kt", mo48633l = {54}, mo48634m = "joinAll")
/* compiled from: Await.kt */
public final class AwaitKt$joinAll$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public AwaitKt$joinAll$1(ns0<? super AwaitKt$joinAll$1> ns0) {
        super(ns0);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AwaitKt.m63129a((y23[]) null, this);
    }
}
