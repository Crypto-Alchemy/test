package net.safemoon.androidwallet.viewmodels;

import android.app.Application;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import net.safemoon.androidwallet.database.room.ApplicationRoomDatabase;
import net.safemoon.androidwallet.model.reflections.RoomReflectionsToken;
import net.safemoon.androidwallet.repository.ReflectionDataSource;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$deleteSymbolWithType$1", mo48632f = "ReflectionTrackerViewModel.kt", mo48633l = {435}, mo48634m = "invokeSuspend")
/* compiled from: ReflectionTrackerViewModel.kt */
public final class ReflectionTrackerViewModel$deleteSymbolWithType$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ RoomReflectionsToken $rrt;
    public int label;
    public final /* synthetic */ ReflectionTrackerViewModel this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$deleteSymbolWithType$1$1", mo48632f = "ReflectionTrackerViewModel.kt", mo48633l = {439}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$deleteSymbolWithType$1$1 */
    /* compiled from: ReflectionTrackerViewModel.kt */
    public static final class C87281 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C87281(roomReflectionsToken, reflectionTrackerViewModel, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C87281) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = wx2.m54101d();
            int i = this.label;
            if (i == 0) {
                hg5.m45199b(obj);
                if (ApplicationRoomDatabase.f41664p.mo57123f().getFirst().contains(roomReflectionsToken.getSymbolWithType())) {
                    zi7 zi7 = zi7.f46397a;
                    Application b = reflectionTrackerViewModel.mo27549b();
                    vx2.m53590f(b, "getApplication()");
                    zi7.mo67317e(b, "DEFAULT_REFLECTION_DELETE_MAP", roomReflectionsToken.getSymbolWithType());
                }
                ReflectionDataSource e = reflectionTrackerViewModel.mo61347s();
                RoomReflectionsToken roomReflectionsToken = roomReflectionsToken;
                this.label = 1;
                if (e.mo60740a(roomReflectionsToken, this) == d) {
                    return d;
                }
            } else if (i == 1) {
                hg5.m45199b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return r37.f33317a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReflectionTrackerViewModel$deleteSymbolWithType$1(RoomReflectionsToken roomReflectionsToken, ReflectionTrackerViewModel reflectionTrackerViewModel, ns0<? super ReflectionTrackerViewModel$deleteSymbolWithType$1> ns0) {
        super(2, ns0);
        this.$rrt = roomReflectionsToken;
        this.this$0 = reflectionTrackerViewModel;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new ReflectionTrackerViewModel$deleteSymbolWithType$1(this.$rrt, this.this$0, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((ReflectionTrackerViewModel$deleteSymbolWithType$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            CoroutineDispatcher b = qh1.m71265b();
            final RoomReflectionsToken roomReflectionsToken = this.$rrt;
            final ReflectionTrackerViewModel reflectionTrackerViewModel = this.this$0;
            C87281 r1 = new C87281((ns0<? super C87281>) null);
            this.label = 1;
            if (b50.m55768e(b, r1, this) == d) {
                return d;
            }
        } else if (i == 1) {
            hg5.m45199b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return r37.f33317a;
    }
}
