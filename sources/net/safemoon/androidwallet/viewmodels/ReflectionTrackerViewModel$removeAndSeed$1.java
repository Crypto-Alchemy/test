package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$removeAndSeed$1", mo48632f = "ReflectionTrackerViewModel.kt", mo48633l = {264, 265, 268}, mo48634m = "invokeSuspend")
/* compiled from: ReflectionTrackerViewModel.kt */
public final class ReflectionTrackerViewModel$removeAndSeed$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ String $symbolWithType;
    public int label;
    public final /* synthetic */ ReflectionTrackerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReflectionTrackerViewModel$removeAndSeed$1(ReflectionTrackerViewModel reflectionTrackerViewModel, String str, ns0<? super ReflectionTrackerViewModel$removeAndSeed$1> ns0) {
        super(2, ns0);
        this.this$0 = reflectionTrackerViewModel;
        this.$symbolWithType = str;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new ReflectionTrackerViewModel$removeAndSeed$1(this.this$0, this.$symbolWithType, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((ReflectionTrackerViewModel$removeAndSeed$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0068 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = p000.wx2.m54101d()
            int r1 = r5.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0025
            if (r1 == r4) goto L_0x0021
            if (r1 == r3) goto L_0x001d
            if (r1 != r2) goto L_0x0015
            p000.hg5.m45199b(r6)
            goto L_0x0078
        L_0x0015:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x001d:
            p000.hg5.m45199b(r6)
            goto L_0x0048
        L_0x0021:
            p000.hg5.m45199b(r6)
            goto L_0x0039
        L_0x0025:
            p000.hg5.m45199b(r6)
            net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel r6 = r5.this$0
            net.safemoon.androidwallet.repository.ReflectionDataSource r6 = r6.mo61347s()
            java.lang.String r1 = r5.$symbolWithType
            r5.label = r4
            java.lang.Object r6 = r6.mo60749j(r1, r5)
            if (r6 != r0) goto L_0x0039
            return r0
        L_0x0039:
            net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel r6 = r5.this$0
            net.safemoon.androidwallet.repository.ReflectionDataSource r6 = r6.mo61347s()
            r5.label = r3
            java.lang.Object r6 = r6.mo60746g(r5)
            if (r6 != r0) goto L_0x0048
            return r0
        L_0x0048:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.lang.String r1 = r5.$symbolWithType
            java.util.Iterator r6 = r6.iterator()
        L_0x0050:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x0068
            java.lang.Object r3 = r6.next()
            r4 = r3
            net.safemoon.androidwallet.model.reflections.RoomReflectionsToken r4 = (net.safemoon.androidwallet.model.reflections.RoomReflectionsToken) r4
            java.lang.String r4 = r4.getSymbolWithType()
            boolean r4 = p000.vx2.m53586b(r4, r1)
            if (r4 == 0) goto L_0x0050
            goto L_0x0069
        L_0x0068:
            r3 = 0
        L_0x0069:
            net.safemoon.androidwallet.model.reflections.RoomReflectionsToken r3 = (net.safemoon.androidwallet.model.reflections.RoomReflectionsToken) r3
            if (r3 == 0) goto L_0x0078
            net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel r6 = r5.this$0
            r5.label = r2
            java.lang.Object r6 = r6.mo61331B(r3, r5)
            if (r6 != r0) goto L_0x0078
            return r0
        L_0x0078:
            r37 r6 = p000.r37.f33317a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$removeAndSeed$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
