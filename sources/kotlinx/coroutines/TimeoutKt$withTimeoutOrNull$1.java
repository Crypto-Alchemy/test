package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 6, 0}, mo44881xi = 48)
@v21(mo48631c = "kotlinx.coroutines.TimeoutKt", mo48632f = "Timeout.kt", mo48633l = {100}, mo48634m = "withTimeoutOrNull")
/* compiled from: Timeout.kt */
public final class TimeoutKt$withTimeoutOrNull$1<T> extends ContinuationImpl {
    public long J$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;

    public TimeoutKt$withTimeoutOrNull$1(ns0<? super TimeoutKt$withTimeoutOrNull$1> ns0) {
        super(ns0);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TimeoutKt.m63233d(0, (fd2) null, this);
    }
}
