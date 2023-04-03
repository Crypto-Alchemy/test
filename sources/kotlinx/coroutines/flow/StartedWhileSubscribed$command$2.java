package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo44877d2 = {"Lkotlinx/coroutines/flow/SharingCommand;", "it", "", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 6, 0})
@v21(mo48631c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", mo48632f = "SharingStarted.kt", mo48633l = {}, mo48634m = "invokeSuspend")
/* compiled from: SharingStarted.kt */
public final class StartedWhileSubscribed$command$2 extends SuspendLambda implements fd2<SharingCommand, ns0<? super Boolean>, Object> {
    public /* synthetic */ Object L$0;
    public int label;

    public StartedWhileSubscribed$command$2(ns0<? super StartedWhileSubscribed$command$2> ns0) {
        super(2, ns0);
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        StartedWhileSubscribed$command$2 startedWhileSubscribed$command$2 = new StartedWhileSubscribed$command$2(ns0);
        startedWhileSubscribed$command$2.L$0 = obj;
        return startedWhileSubscribed$command$2;
    }

    public final Object invoke(SharingCommand sharingCommand, ns0<? super Boolean> ns0) {
        return ((StartedWhileSubscribed$command$2) create(sharingCommand, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z;
        wx2.m54101d();
        if (this.label == 0) {
            hg5.m45199b(obj);
            if (((SharingCommand) this.L$0) != SharingCommand.START) {
                z = true;
            } else {
                z = false;
            }
            return a40.m31670a(z);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
