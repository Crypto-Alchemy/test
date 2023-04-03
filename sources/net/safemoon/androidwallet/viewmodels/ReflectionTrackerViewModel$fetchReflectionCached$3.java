package net.safemoon.androidwallet.viewmodels;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import net.safemoon.androidwallet.model.reflections.RoomReflectionsToken;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H@"}, mo44877d2 = {"La52;", "", "Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsToken;", "", "it", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$fetchReflectionCached$3", mo48632f = "ReflectionTrackerViewModel.kt", mo48633l = {}, mo48634m = "invokeSuspend")
/* compiled from: ReflectionTrackerViewModel.kt */
public final class ReflectionTrackerViewModel$fetchReflectionCached$3 extends SuspendLambda implements id2<a52<? super List<RoomReflectionsToken>>, Throwable, ns0<? super r37>, Object> {
    public int label;
    public final /* synthetic */ ReflectionTrackerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReflectionTrackerViewModel$fetchReflectionCached$3(ReflectionTrackerViewModel reflectionTrackerViewModel, ns0<? super ReflectionTrackerViewModel$fetchReflectionCached$3> ns0) {
        super(3, ns0);
        this.this$0 = reflectionTrackerViewModel;
    }

    public final Object invoke(a52<? super List<RoomReflectionsToken>> a52, Throwable th, ns0<? super r37> ns0) {
        return new ReflectionTrackerViewModel$fetchReflectionCached$3(this.this$0, ns0).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        wx2.m54101d();
        if (this.label == 0) {
            hg5.m45199b(obj);
            cd7.m11843a(this.this$0);
            return r37.f33317a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
