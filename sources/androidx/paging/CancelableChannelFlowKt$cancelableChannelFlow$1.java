package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.iu5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"T", "Ls26;", "Lr37;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 2})
@v21(mo48631c = "androidx.paging.CancelableChannelFlowKt$cancelableChannelFlow$1", mo48632f = "CancelableChannelFlow.kt", mo48633l = {30}, mo48634m = "invokeSuspend")
/* compiled from: CancelableChannelFlow.kt */
public final class CancelableChannelFlowKt$cancelableChannelFlow$1 extends SuspendLambda implements fd2<s26<T>, ns0<? super r37>, Object> {
    public final /* synthetic */ fd2 $block;
    public final /* synthetic */ y23 $controller;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CancelableChannelFlowKt$cancelableChannelFlow$1(y23 y23, fd2 fd2, ns0 ns0) {
        super(2, ns0);
        this.$controller = y23;
        this.$block = fd2;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        vx2.m53591g(ns0, "completion");
        CancelableChannelFlowKt$cancelableChannelFlow$1 cancelableChannelFlowKt$cancelableChannelFlow$1 = new CancelableChannelFlowKt$cancelableChannelFlow$1(this.$controller, this.$block, ns0);
        cancelableChannelFlowKt$cancelableChannelFlow$1.L$0 = obj;
        return cancelableChannelFlowKt$cancelableChannelFlow$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((CancelableChannelFlowKt$cancelableChannelFlow$1) create(obj, (ns0) obj2)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            final s26 s26 = (s26) this.L$0;
            this.$controller.mo55519p(new rc2<Throwable, r37>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return r37.f33317a;
                }

                public final void invoke(Throwable th) {
                    iu5.C7226a.m59120a(s26, (Throwable) null, 1, (Object) null);
                }
            });
            fd2 fd2 = this.$block;
            this.label = 1;
            if (fd2.invoke(s26, this) == d) {
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
