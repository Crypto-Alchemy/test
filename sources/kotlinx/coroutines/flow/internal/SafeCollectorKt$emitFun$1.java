package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 6, 0}, mo44881xi = 48)
/* compiled from: SafeCollector.kt */
public /* synthetic */ class SafeCollectorKt$emitFun$1 extends FunctionReferenceImpl implements id2<a52<? super Object>, Object, ns0<? super r37>, Object> {
    public static final SafeCollectorKt$emitFun$1 INSTANCE = new SafeCollectorKt$emitFun$1();

    public SafeCollectorKt$emitFun$1() {
        super(3, a52.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final Object invoke(a52<Object> a52, Object obj, ns0<? super r37> ns0) {
        return a52.emit(obj, ns0);
    }
}
