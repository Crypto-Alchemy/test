package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import net.safemoon.androidwallet.model.reflections.RoomReflectionsToken;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel", mo48632f = "ReflectionTrackerViewModel.kt", mo48633l = {299, 332, 333, 338, 358, 363, 368, 373, 378, 395}, mo48634m = "seedData")
/* compiled from: ReflectionTrackerViewModel.kt */
public final class ReflectionTrackerViewModel$seedData$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ReflectionTrackerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReflectionTrackerViewModel$seedData$1(ReflectionTrackerViewModel reflectionTrackerViewModel, ns0<? super ReflectionTrackerViewModel$seedData$1> ns0) {
        super(ns0);
        this.this$0 = reflectionTrackerViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo61331B((RoomReflectionsToken) null, this);
    }
}
