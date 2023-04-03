package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H@"}, mo44877d2 = {"T", "R", "Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 6, 0})
@v21(mo48631c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", mo48632f = "Merge.kt", mo48633l = {27}, mo48634m = "invokeSuspend")
/* compiled from: Merge.kt */
public final class ChannelFlowTransformLatest$flowCollect$3 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ a52<R> $collector;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ ChannelFlowTransformLatest<T, R> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelFlowTransformLatest$flowCollect$3(ChannelFlowTransformLatest<T, R> channelFlowTransformLatest, a52<? super R> a52, ns0<? super ChannelFlowTransformLatest$flowCollect$3> ns0) {
        super(2, ns0);
        this.this$0 = channelFlowTransformLatest;
        this.$collector = a52;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        ChannelFlowTransformLatest$flowCollect$3 channelFlowTransformLatest$flowCollect$3 = new ChannelFlowTransformLatest$flowCollect$3(this.this$0, this.$collector, ns0);
        channelFlowTransformLatest$flowCollect$3.L$0 = obj;
        return channelFlowTransformLatest$flowCollect$3;
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((ChannelFlowTransformLatest$flowCollect$3) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            final hu0 hu0 = (hu0) this.L$0;
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            final ChannelFlowTransformLatest<T, R> channelFlowTransformLatest = this.this$0;
            z42<S> z42 = channelFlowTransformLatest.f40455g;
            final a52<R> a52 = this.$collector;
            C77921 r5 = new a52() {
                /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(final T r8, p000.ns0<? super p000.r37> r9) {
                    /*
                        r7 = this;
                        boolean r0 = r9 instanceof kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1
                        if (r0 == 0) goto L_0x0013
                        r0 = r9
                        kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L_0x0018
                    L_0x0013:
                        kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1
                        r0.<init>(r7, r9)
                    L_0x0018:
                        java.lang.Object r9 = r0.result
                        java.lang.Object r1 = p000.wx2.m54101d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L_0x003b
                        if (r2 != r3) goto L_0x0033
                        java.lang.Object r8 = r0.L$2
                        y23 r8 = (p000.y23) r8
                        java.lang.Object r8 = r0.L$1
                        java.lang.Object r0 = r0.L$0
                        kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3.C77921) r0
                        p000.hg5.m45199b(r9)
                        goto L_0x005e
                    L_0x0033:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r9)
                        throw r8
                    L_0x003b:
                        p000.hg5.m45199b(r9)
                        kotlin.jvm.internal.Ref$ObjectRef<y23> r9 = r1
                        T r9 = r9.element
                        y23 r9 = (p000.y23) r9
                        if (r9 == 0) goto L_0x005d
                        kotlinx.coroutines.flow.internal.ChildCancelledException r2 = new kotlinx.coroutines.flow.internal.ChildCancelledException
                        r2.<init>()
                        r9.mo52179c(r2)
                        r0.L$0 = r7
                        r0.L$1 = r8
                        r0.L$2 = r9
                        r0.label = r3
                        java.lang.Object r9 = r9.mo55508g(r0)
                        if (r9 != r1) goto L_0x005d
                        return r1
                    L_0x005d:
                        r0 = r7
                    L_0x005e:
                        kotlin.jvm.internal.Ref$ObjectRef<y23> r9 = r1
                        hu0 r1 = r8
                        r2 = 0
                        kotlinx.coroutines.CoroutineStart r3 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
                        kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2 r4 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2
                        kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest<T, R> r5 = r3
                        a52<R> r0 = r6
                        r6 = 0
                        r4.<init>(r5, r0, r8, r6)
                        r5 = 1
                        y23 r8 = p000.d50.m56748b(r1, r2, r3, r4, r5, r6)
                        r9.element = r8
                        r37 r8 = p000.r37.f33317a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3.C77921.emit(java.lang.Object, ns0):java.lang.Object");
                }
            };
            this.label = 1;
            if (z42.mo8646a(r5, this) == d) {
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
