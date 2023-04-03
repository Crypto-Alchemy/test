package retrofit2;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00060\u0000j\u0002`\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H@"}, mo44877d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "Lns0;", "", "continuation", "", "suspendAndThrow"}, mo44878k = 3, mo44879mv = {1, 4, 0})
@v21(mo48631c = "retrofit2.KotlinExtensions", mo48632f = "KotlinExtensions.kt", mo48633l = {113}, mo48634m = "suspendAndThrow")
/* compiled from: KotlinExtensions.kt */
public final class KotlinExtensions$suspendAndThrow$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public KotlinExtensions$suspendAndThrow$1(ns0 ns0) {
        super(ns0);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return KotlinExtensions.m71522d((Exception) null, this);
    }
}
