package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H@¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"T", "R", "Ls26;", "Lr37;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 2})
@v21(mo48631c = "androidx.paging.FlowExtKt$simpleTransformLatest$1", mo48632f = "FlowExt.kt", mo48633l = {76}, mo48634m = "invokeSuspend")
/* compiled from: FlowExt.kt */
public final class FlowExtKt$simpleTransformLatest$1 extends SuspendLambda implements fd2<s26<R>, ns0<? super r37>, Object> {
    public final /* synthetic */ z42 $this_simpleTransformLatest;
    public final /* synthetic */ id2 $transform;
    private /* synthetic */ Object L$0;
    public int label;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"T", "R", "value", "Lr37;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 2})
    @v21(mo48631c = "androidx.paging.FlowExtKt$simpleTransformLatest$1$1", mo48632f = "FlowExt.kt", mo48633l = {77}, mo48634m = "invokeSuspend")
    /* renamed from: androidx.paging.FlowExtKt$simpleTransformLatest$1$1 */
    /* compiled from: FlowExt.kt */
    public static final class C11491 extends SuspendLambda implements fd2<T, ns0<? super r37>, Object> {
        private /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ FlowExtKt$simpleTransformLatest$1 this$0;

        {
            this.this$0 = r1;
        }

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            vx2.m53591g(ns0, "completion");
            C11491 r0 = new C11491(this.this$0, jd0, ns0);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C11491) create(obj, (ns0) obj2)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = wx2.m54101d();
            int i = this.label;
            if (i == 0) {
                hg5.m45199b(obj);
                Object obj2 = this.L$0;
                id2 id2 = this.this$0.$transform;
                jd0 jd0 = jd0;
                this.label = 1;
                if (id2.invoke(jd0, obj2, this) == d) {
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
    public FlowExtKt$simpleTransformLatest$1(z42 z42, id2 id2, ns0 ns0) {
        super(2, ns0);
        this.$this_simpleTransformLatest = z42;
        this.$transform = id2;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        vx2.m53591g(ns0, "completion");
        FlowExtKt$simpleTransformLatest$1 flowExtKt$simpleTransformLatest$1 = new FlowExtKt$simpleTransformLatest$1(this.$this_simpleTransformLatest, this.$transform, ns0);
        flowExtKt$simpleTransformLatest$1.L$0 = obj;
        return flowExtKt$simpleTransformLatest$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((FlowExtKt$simpleTransformLatest$1) create(obj, (ns0) obj2)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            z42 z42 = this.$this_simpleTransformLatest;
            final jd0 jd0 = new jd0((s26) this.L$0);
            C11491 r6 = new C11491(this, (ns0) null);
            this.label = 1;
            if (e52.m57217i(z42, r6, this) == d) {
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
