package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.StartedLazily$command$1;

@Metadata(mo44878k = 3, mo44879mv = {1, 6, 0}, mo44881xi = 48)
@v21(mo48631c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", mo48632f = "SharingStarted.kt", mo48633l = {158}, mo48634m = "emit")
/* compiled from: SharingStarted.kt */
public final class StartedLazily$command$1$1$emit$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ StartedLazily$command$1.C77911<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StartedLazily$command$1$1$emit$1(StartedLazily$command$1.C77911<? super T> r1, ns0<? super StartedLazily$command$1$1$emit$1> ns0) {
        super(ns0);
        this.this$0 = r1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo55651a(0, this);
    }
}
