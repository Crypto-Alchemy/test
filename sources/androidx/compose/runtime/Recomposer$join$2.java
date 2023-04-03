package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo44877d2 = {"Landroidx/compose/runtime/Recomposer$State;", "it", "", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "androidx.compose.runtime.Recomposer$join$2", mo48632f = "Recomposer.kt", mo48633l = {}, mo48634m = "invokeSuspend")
/* compiled from: Recomposer.kt */
public final class Recomposer$join$2 extends SuspendLambda implements fd2<Recomposer.State, ns0<? super Boolean>, Object> {
    public /* synthetic */ Object L$0;
    public int label;

    public Recomposer$join$2(ns0<? super Recomposer$join$2> ns0) {
        super(2, ns0);
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        Recomposer$join$2 recomposer$join$2 = new Recomposer$join$2(ns0);
        recomposer$join$2.L$0 = obj;
        return recomposer$join$2;
    }

    public final Object invoke(Recomposer.State state, ns0<? super Boolean> ns0) {
        return ((Recomposer$join$2) create(state, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z;
        wx2.m54101d();
        if (this.label == 0) {
            hg5.m45199b(obj);
            if (((Recomposer.State) this.L$0) == Recomposer.State.ShutDown) {
                z = true;
            } else {
                z = false;
            }
            return a40.m31670a(z);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
