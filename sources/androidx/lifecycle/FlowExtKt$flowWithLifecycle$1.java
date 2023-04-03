package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.iu5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@"}, mo44877d2 = {"T", "Lcw4;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 6, 0})
@v21(mo48631c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", mo48632f = "FlowExt.kt", mo48633l = {91}, mo48634m = "invokeSuspend")
/* compiled from: FlowExt.kt */
public final class FlowExtKt$flowWithLifecycle$1 extends SuspendLambda implements fd2<cw4<? super T>, ns0<? super r37>, Object> {
    public final /* synthetic */ Lifecycle $lifecycle;
    public final /* synthetic */ Lifecycle.State $minActiveState;
    public final /* synthetic */ z42<T> $this_flowWithLifecycle;
    private /* synthetic */ Object L$0;
    public int label;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo44877d2 = {"T", "Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 6, 0})
    @v21(mo48631c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", mo48632f = "FlowExt.kt", mo48633l = {92}, mo48634m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1 */
    /* compiled from: FlowExt.kt */
    public static final class C06891 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public int label;

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"T", "it", "Lr37;", "emit", "(Ljava/lang/Object;Lns0;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 6, 0})
        /* renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1$a */
        /* compiled from: FlowExt.kt */
        public static final class C0690a<T> implements a52 {

            /* renamed from: a */
            public final /* synthetic */ cw4<T> f3895a;

            public C0690a(cw4<? super T> cw4) {
                this.f3895a = cw4;
            }

            public final Object emit(T t, ns0<? super r37> ns0) {
                Object u = this.f3895a.mo26027u(t, ns0);
                if (u == wx2.m54101d()) {
                    return u;
                }
                return r37.f33317a;
            }
        }

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C06891(z42, cw42, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C06891) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = wx2.m54101d();
            int i = this.label;
            if (i == 0) {
                hg5.m45199b(obj);
                z42<T> z42 = z42;
                C0690a aVar = new C0690a(cw42);
                this.label = 1;
                if (z42.mo8646a(aVar, this) == d) {
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
    public FlowExtKt$flowWithLifecycle$1(Lifecycle lifecycle, Lifecycle.State state, z42<? extends T> z42, ns0<? super FlowExtKt$flowWithLifecycle$1> ns0) {
        super(2, ns0);
        this.$lifecycle = lifecycle;
        this.$minActiveState = state;
        this.$this_flowWithLifecycle = z42;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        FlowExtKt$flowWithLifecycle$1 flowExtKt$flowWithLifecycle$1 = new FlowExtKt$flowWithLifecycle$1(this.$lifecycle, this.$minActiveState, this.$this_flowWithLifecycle, ns0);
        flowExtKt$flowWithLifecycle$1.L$0 = obj;
        return flowExtKt$flowWithLifecycle$1;
    }

    public final Object invoke(cw4<? super T> cw4, ns0<? super r37> ns0) {
        return ((FlowExtKt$flowWithLifecycle$1) create(cw4, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        cw4 cw4;
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            final cw4 cw42 = (cw4) this.L$0;
            Lifecycle lifecycle = this.$lifecycle;
            Lifecycle.State state = this.$minActiveState;
            final z42<T> z42 = this.$this_flowWithLifecycle;
            C06891 r5 = new C06891((ns0<? super C06891>) null);
            this.L$0 = cw42;
            this.label = 1;
            if (RepeatOnLifecycleKt.m5055a(lifecycle, state, r5, this) == d) {
                return d;
            }
            cw4 = cw42;
        } else if (i == 1) {
            cw4 = (cw4) this.L$0;
            hg5.m45199b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        iu5.C7226a.m59120a(cw4, (Throwable) null, 1, (Object) null);
        return r37.f33317a;
    }
}
