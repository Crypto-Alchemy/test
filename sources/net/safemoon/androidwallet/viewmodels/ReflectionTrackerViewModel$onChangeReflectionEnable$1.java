package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import net.safemoon.androidwallet.model.reflections.RoomReflectionsToken;
import net.safemoon.androidwallet.repository.ReflectionDataSource;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$onChangeReflectionEnable$1", mo48632f = "ReflectionTrackerViewModel.kt", mo48633l = {448, 449}, mo48634m = "invokeSuspend")
/* compiled from: ReflectionTrackerViewModel.kt */
public final class ReflectionTrackerViewModel$onChangeReflectionEnable$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ RoomReflectionsToken $rrt;
    public int label;
    public final /* synthetic */ ReflectionTrackerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReflectionTrackerViewModel$onChangeReflectionEnable$1(ReflectionTrackerViewModel reflectionTrackerViewModel, RoomReflectionsToken roomReflectionsToken, ns0<? super ReflectionTrackerViewModel$onChangeReflectionEnable$1> ns0) {
        super(2, ns0);
        this.this$0 = reflectionTrackerViewModel;
        this.$rrt = roomReflectionsToken;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new ReflectionTrackerViewModel$onChangeReflectionEnable$1(this.this$0, this.$rrt, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((ReflectionTrackerViewModel$onChangeReflectionEnable$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            ReflectionDataSource e = this.this$0.mo61347s();
            RoomReflectionsToken roomReflectionsToken = this.$rrt;
            this.label = 1;
            if (e.mo60757r(roomReflectionsToken, this) == d) {
                return d;
            }
        } else if (i == 1) {
            hg5.m45199b(obj);
        } else if (i == 2) {
            hg5.m45199b(obj);
            return r37.f33317a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ReflectionTrackerViewModel reflectionTrackerViewModel = this.this$0;
        RoomReflectionsToken roomReflectionsToken2 = this.$rrt;
        this.label = 2;
        if (reflectionTrackerViewModel.mo61331B(roomReflectionsToken2, this) == d) {
            return d;
        }
        return r37.f33317a;
    }
}
