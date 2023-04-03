package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo44877d2 = {"", "T", "Lhu0;", "Lr37;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "androidx/paging/PagingDataDiffer$collectFrom$2$1$1", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 2})
@v21(mo48631c = "androidx.paging.PagingDataDiffer$collectFrom$2$1$1", mo48632f = "PagingDataDiffer.kt", mo48633l = {142, 180}, mo48634m = "invokeSuspend")
/* renamed from: androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1$lambda$1 */
/* compiled from: PagingDataDiffer.kt */
public final class C1188x36210220 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ vk4 $event;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1188x36210220(vk4 vk4, ns0 ns0, PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 pagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1) {
        super(2, ns0);
        this.$event = vk4;
        this.this$0 = pagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        vx2.m53591g(ns0, "completion");
        return new C1188x36210220(this.$event, ns0, this.this$0);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C1188x36210220) create(obj, (ns0) obj2)).invokeSuspend(r37.f33317a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = p000.wx2.m54101d()
            int r1 = r12.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0028
            if (r1 == r3) goto L_0x001c
            if (r1 != r2) goto L_0x0014
            p000.hg5.m45199b(r13)
            goto L_0x00fb
        L_0x0014:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x001c:
            java.lang.Object r0 = r12.L$1
            kotlin.jvm.internal.Ref$BooleanRef r0 = (kotlin.jvm.internal.Ref$BooleanRef) r0
            java.lang.Object r1 = r12.L$0
            androidx.paging.PagePresenter r1 = (androidx.paging.PagePresenter) r1
            p000.hg5.m45199b(r13)
            goto L_0x0086
        L_0x0028:
            p000.hg5.m45199b(r13)
            vk4 r13 = r12.$event
            boolean r1 = r13 instanceof p000.vk4.C3493b
            if (r1 == 0) goto L_0x00e6
            vk4$b r13 = (p000.vk4.C3493b) r13
            androidx.paging.LoadType r13 = r13.mo27187e()
            androidx.paging.LoadType r1 = androidx.paging.LoadType.REFRESH
            if (r13 != r1) goto L_0x00e6
            androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 r13 = r12.this$0
            androidx.paging.PagingDataDiffer$collectFrom$2 r13 = r13.f6234a
            androidx.paging.PagingDataDiffer r13 = r13.this$0
            r13.f6227f = r4
            androidx.paging.PagePresenter r1 = new androidx.paging.PagePresenter
            vk4 r13 = r12.$event
            vk4$b r13 = (p000.vk4.C3493b) r13
            r1.<init>(r13)
            kotlin.jvm.internal.Ref$BooleanRef r13 = new kotlin.jvm.internal.Ref$BooleanRef
            r13.<init>()
            r13.element = r4
            androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 r2 = r12.this$0
            androidx.paging.PagingDataDiffer$collectFrom$2 r2 = r2.f6234a
            androidx.paging.PagingDataDiffer r5 = r2.this$0
            androidx.paging.PagePresenter r6 = r5.f6222a
            vk4 r2 = r12.$event
            vk4$b r2 = (p000.vk4.C3493b) r2
            il0 r8 = r2.mo27186d()
            androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 r2 = r12.this$0
            androidx.paging.PagingDataDiffer$collectFrom$2 r2 = r2.f6234a
            androidx.paging.PagingDataDiffer r2 = r2.this$0
            int r9 = r2.f6228g
            androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1$lambda$1$1 r10 = new androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1$lambda$1$1
            r10.<init>(r12, r1, r13)
            r12.L$0 = r1
            r12.L$1 = r13
            r12.label = r3
            r7 = r1
            r11 = r12
            java.lang.Object r2 = r5.mo8640w(r6, r7, r8, r9, r10, r11)
            if (r2 != r0) goto L_0x0084
            return r0
        L_0x0084:
            r0 = r13
            r13 = r2
        L_0x0086:
            java.lang.Integer r13 = (java.lang.Integer) r13
            boolean r0 = r0.element
            if (r0 == 0) goto L_0x00da
            androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 r0 = r12.this$0
            androidx.paging.PagingDataDiffer$collectFrom$2 r0 = r0.f6234a
            androidx.paging.PagingDataDiffer r0 = r0.this$0
            vk4 r2 = r12.$event
            vk4$b r2 = (p000.vk4.C3493b) r2
            il0 r2 = r2.mo27186d()
            r0.mo8747r(r2)
            if (r13 != 0) goto L_0x00b4
            androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 r13 = r12.this$0
            androidx.paging.PagingDataDiffer$collectFrom$2 r13 = r13.f6234a
            androidx.paging.PagingDataDiffer r13 = r13.this$0
            i37 r13 = r13.f6223b
            if (r13 == 0) goto L_0x0233
            gf7$b r0 = r1.mo8724n()
            r13.mo8672b(r0)
            goto L_0x0233
        L_0x00b4:
            androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 r0 = r12.this$0
            androidx.paging.PagingDataDiffer$collectFrom$2 r0 = r0.f6234a
            androidx.paging.PagingDataDiffer r0 = r0.this$0
            int r2 = r13.intValue()
            r0.f6228g = r2
            androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 r0 = r12.this$0
            androidx.paging.PagingDataDiffer$collectFrom$2 r0 = r0.f6234a
            androidx.paging.PagingDataDiffer r0 = r0.this$0
            i37 r0 = r0.f6223b
            if (r0 == 0) goto L_0x0233
            int r13 = r13.intValue()
            gf7$a r13 = r1.mo8715f(r13)
            r0.mo8672b(r13)
            goto L_0x0233
        L_0x00da:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "Missing call to onListPresentable after new list was presented. If you are seeing this exception, it is generally an indication of an issue with Paging. Please file a bug so we can fix it at: https://issuetracker.google.com/issues/new?component=413106"
            java.lang.String r0 = r0.toString()
            r13.<init>(r0)
            throw r13
        L_0x00e6:
            androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 r13 = r12.this$0
            androidx.paging.PagingDataDiffer$collectFrom$2 r13 = r13.f6234a
            androidx.paging.PagingDataDiffer r13 = r13.this$0
            boolean r13 = r13.mo8639v()
            if (r13 == 0) goto L_0x00fb
            r12.label = r2
            java.lang.Object r13 = p000.kp7.m63580a(r12)
            if (r13 != r0) goto L_0x00fb
            return r0
        L_0x00fb:
            androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 r13 = r12.this$0
            androidx.paging.PagingDataDiffer$collectFrom$2 r13 = r13.f6234a
            androidx.paging.PagingDataDiffer r13 = r13.this$0
            androidx.paging.PagePresenter r13 = r13.f6222a
            vk4 r0 = r12.$event
            androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 r1 = r12.this$0
            androidx.paging.PagingDataDiffer$collectFrom$2 r1 = r1.f6234a
            androidx.paging.PagingDataDiffer r1 = r1.this$0
            androidx.paging.PagingDataDiffer$a r1 = r1.f6229h
            r13.mo8726p(r0, r1)
            vk4 r13 = r12.$event
            boolean r13 = r13 instanceof p000.vk4.C3492a
            if (r13 == 0) goto L_0x0123
            androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 r13 = r12.this$0
            androidx.paging.PagingDataDiffer$collectFrom$2 r13 = r13.f6234a
            androidx.paging.PagingDataDiffer r13 = r13.this$0
            r13.f6227f = r4
        L_0x0123:
            vk4 r13 = r12.$event
            boolean r0 = r13 instanceof p000.vk4.C3493b
            if (r0 == 0) goto L_0x0233
            vk4$b r13 = (p000.vk4.C3493b) r13
            il0 r13 = r13.mo27186d()
            xi3 r13 = r13.mo21562d()
            boolean r13 = r13.mo27748a()
            vk4 r0 = r12.$event
            vk4$b r0 = (p000.vk4.C3493b) r0
            il0 r0 = r0.mo27186d()
            xi3 r0 = r0.mo21560b()
            boolean r0 = r0.mo27748a()
            vk4 r1 = r12.$event
            vk4$b r1 = (p000.vk4.C3493b) r1
            androidx.paging.LoadType r1 = r1.mo27187e()
            androidx.paging.LoadType r2 = androidx.paging.LoadType.PREPEND
            if (r1 != r2) goto L_0x0155
            if (r13 != 0) goto L_0x0164
        L_0x0155:
            vk4 r13 = r12.$event
            vk4$b r13 = (p000.vk4.C3493b) r13
            androidx.paging.LoadType r13 = r13.mo27187e()
            androidx.paging.LoadType r1 = androidx.paging.LoadType.APPEND
            if (r13 != r1) goto L_0x0166
            if (r0 != 0) goto L_0x0164
            goto L_0x0166
        L_0x0164:
            r13 = r4
            goto L_0x0167
        L_0x0166:
            r13 = r3
        L_0x0167:
            vk4 r0 = r12.$event
            vk4$b r0 = (p000.vk4.C3493b) r0
            java.util.List r0 = r0.mo27189f()
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L_0x017b
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x017b
        L_0x0179:
            r0 = r3
            goto L_0x019e
        L_0x017b:
            java.util.Iterator r0 = r0.iterator()
        L_0x017f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0179
            java.lang.Object r1 = r0.next()
            kw6 r1 = (p000.kw6) r1
            java.util.List r1 = r1.mo22539b()
            boolean r1 = r1.isEmpty()
            java.lang.Boolean r1 = p000.a40.m31670a(r1)
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x017f
            r0 = r4
        L_0x019e:
            if (r13 != 0) goto L_0x01ab
            androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 r13 = r12.this$0
            androidx.paging.PagingDataDiffer$collectFrom$2 r13 = r13.f6234a
            androidx.paging.PagingDataDiffer r13 = r13.this$0
            r13.f6227f = r4
            goto L_0x0233
        L_0x01ab:
            androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 r13 = r12.this$0
            androidx.paging.PagingDataDiffer$collectFrom$2 r13 = r13.f6234a
            androidx.paging.PagingDataDiffer r13 = r13.this$0
            boolean r13 = r13.f6227f
            if (r13 != 0) goto L_0x01b9
            if (r0 == 0) goto L_0x0233
        L_0x01b9:
            if (r0 != 0) goto L_0x0200
            androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 r13 = r12.this$0
            androidx.paging.PagingDataDiffer$collectFrom$2 r13 = r13.f6234a
            androidx.paging.PagingDataDiffer r13 = r13.this$0
            int r13 = r13.f6228g
            androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 r0 = r12.this$0
            androidx.paging.PagingDataDiffer$collectFrom$2 r0 = r0.f6234a
            androidx.paging.PagingDataDiffer r0 = r0.this$0
            androidx.paging.PagePresenter r0 = r0.f6222a
            int r0 = r0.mo8712b()
            if (r13 < r0) goto L_0x0200
            androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 r13 = r12.this$0
            androidx.paging.PagingDataDiffer$collectFrom$2 r13 = r13.f6234a
            androidx.paging.PagingDataDiffer r13 = r13.this$0
            int r13 = r13.f6228g
            androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 r0 = r12.this$0
            androidx.paging.PagingDataDiffer$collectFrom$2 r0 = r0.f6234a
            androidx.paging.PagingDataDiffer r0 = r0.this$0
            androidx.paging.PagePresenter r0 = r0.f6222a
            int r0 = r0.mo8712b()
            androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 r1 = r12.this$0
            androidx.paging.PagingDataDiffer$collectFrom$2 r1 = r1.f6234a
            androidx.paging.PagingDataDiffer r1 = r1.this$0
            androidx.paging.PagePresenter r1 = r1.f6222a
            int r1 = r1.mo8711a()
            int r0 = r0 + r1
            if (r13 <= r0) goto L_0x01ff
            goto L_0x0200
        L_0x01ff:
            r3 = r4
        L_0x0200:
            if (r3 == 0) goto L_0x022a
            androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 r13 = r12.this$0
            androidx.paging.PagingDataDiffer$collectFrom$2 r13 = r13.f6234a
            androidx.paging.PagingDataDiffer r13 = r13.this$0
            i37 r13 = r13.f6223b
            if (r13 == 0) goto L_0x0233
            androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 r0 = r12.this$0
            androidx.paging.PagingDataDiffer$collectFrom$2 r0 = r0.f6234a
            androidx.paging.PagingDataDiffer r0 = r0.this$0
            androidx.paging.PagePresenter r0 = r0.f6222a
            androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 r1 = r12.this$0
            androidx.paging.PagingDataDiffer$collectFrom$2 r1 = r1.f6234a
            androidx.paging.PagingDataDiffer r1 = r1.this$0
            int r1 = r1.f6228g
            gf7$a r0 = r0.mo8715f(r1)
            r13.mo8672b(r0)
            goto L_0x0233
        L_0x022a:
            androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 r13 = r12.this$0
            androidx.paging.PagingDataDiffer$collectFrom$2 r13 = r13.f6234a
            androidx.paging.PagingDataDiffer r13 = r13.this$0
            r13.f6227f = r4
        L_0x0233:
            r37 r13 = p000.r37.f33317a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.C1188x36210220.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
