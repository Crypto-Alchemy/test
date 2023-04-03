package androidx.paging;

import androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.iu5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"T", "Lhu0;", "Lr37;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 2})
@v21(mo48631c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1", mo48632f = "SimpleChannelFlow.kt", mo48633l = {52}, mo48634m = "invokeSuspend")
/* compiled from: SimpleChannelFlow.kt */
public final class SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ fd0 $channel;
    public int label;
    public final /* synthetic */ SimpleChannelFlowKt$simpleChannelFlow$1.C11901 this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"T", "Lhu0;", "Lr37;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 2})
    @v21(mo48631c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1$1", mo48632f = "SimpleChannelFlow.kt", mo48633l = {57}, mo48634m = "invokeSuspend")
    /* renamed from: androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1$1 */
    /* compiled from: SimpleChannelFlow.kt */
    public static final class C11911 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        private /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1 this$0;

        {
            this.this$0 = r1;
        }

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            vx2.m53591g(ns0, "completion");
            C11911 r0 = new C11911(this.this$0, ns0);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C11911) create(obj, (ns0) obj2)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = wx2.m54101d();
            int i = this.label;
            if (i == 0) {
                hg5.m45199b(obj);
                t26 t26 = new t26((hu0) this.L$0, this.this$0.$channel);
                fd2 fd2 = this.this$0.this$0.this$0.$block;
                this.label = 1;
                if (fd2.invoke(t26, this) == d) {
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
    public SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1(SimpleChannelFlowKt$simpleChannelFlow$1.C11901 r1, fd0 fd0, ns0 ns0) {
        super(2, ns0);
        this.this$0 = r1;
        this.$channel = fd0;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        vx2.m53591g(ns0, "completion");
        return new SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1(this.this$0, this.$channel, ns0);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1) create(obj, (ns0) obj2)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            C11911 r5 = new C11911(this, (ns0) null);
            this.label = 1;
            if (iu0.m59115e(r5, this) == d) {
                return d;
            }
        } else if (i == 1) {
            try {
                hg5.m45199b(obj);
            } catch (Throwable th) {
                this.$channel.mo26028z(th);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        iu5.C7226a.m59120a(this.$channel, (Throwable) null, 1, (Object) null);
        return r37.f33317a;
    }
}
