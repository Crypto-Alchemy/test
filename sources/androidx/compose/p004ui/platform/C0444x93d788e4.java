package androidx.compose.p004ui.platform;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1", mo48632f = "WindowRecomposer.android.kt", mo48633l = {386}, mo48634m = "invokeSuspend")
/* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1 */
/* compiled from: WindowRecomposer.android.kt */
public final class C0444x93d788e4 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ t86<Float> $durationScaleStateFlow;
    public final /* synthetic */ my3 $it;
    public int label;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo44877d2 = {"", "scaleFactor", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1$a */
    /* compiled from: WindowRecomposer.android.kt */
    public static final class C0445a implements a52<Float> {

        /* renamed from: a */
        public final /* synthetic */ my3 f2100a;

        public C0445a(my3 my3) {
            this.f2100a = my3;
        }

        /* renamed from: a */
        public final Object mo3977a(float f, ns0<? super r37> ns0) {
            this.f2100a.mo23421f(f);
            return r37.f33317a;
        }

        public /* bridge */ /* synthetic */ Object emit(Object obj, ns0 ns0) {
            return mo3977a(((Number) obj).floatValue(), ns0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0444x93d788e4(t86<Float> t86, my3 my3, ns0<? super C0444x93d788e4> ns0) {
        super(2, ns0);
        this.$durationScaleStateFlow = t86;
        this.$it = my3;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new C0444x93d788e4(this.$durationScaleStateFlow, this.$it, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((C0444x93d788e4) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            t86<Float> t86 = this.$durationScaleStateFlow;
            C0445a aVar = new C0445a(this.$it);
            this.label = 1;
            if (t86.mo8646a(aVar, this) == d) {
                return d;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            hg5.m45199b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
