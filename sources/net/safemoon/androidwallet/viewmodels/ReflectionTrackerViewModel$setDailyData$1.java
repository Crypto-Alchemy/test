package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$setDailyData$1", mo48632f = "ReflectionTrackerViewModel.kt", mo48633l = {277, 281, 283}, mo48634m = "invokeSuspend")
/* compiled from: ReflectionTrackerViewModel.kt */
public final class ReflectionTrackerViewModel$setDailyData$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ ReflectionTrackerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReflectionTrackerViewModel$setDailyData$1(ReflectionTrackerViewModel reflectionTrackerViewModel, ns0<? super ReflectionTrackerViewModel$setDailyData$1> ns0) {
        super(2, ns0);
        this.this$0 = reflectionTrackerViewModel;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new ReflectionTrackerViewModel$setDailyData$1(this.this$0, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((ReflectionTrackerViewModel$setDailyData$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x008d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = p000.wx2.m54101d()
            int r1 = r7.label
            java.lang.String r2 = "RESET_REFLECTION_DATA_V31"
            java.lang.String r3 = "getApplication()"
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L_0x0031
            if (r1 == r6) goto L_0x002d
            if (r1 == r5) goto L_0x0029
            if (r1 != r4) goto L_0x0021
            java.lang.Object r1 = r7.L$1
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r2 = r7.L$0
            net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel r2 = (net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel) r2
            p000.hg5.m45199b(r8)
            goto L_0x0086
        L_0x0021:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0029:
            p000.hg5.m45199b(r8)
            goto L_0x007c
        L_0x002d:
            p000.hg5.m45199b(r8)
            goto L_0x0054
        L_0x0031:
            p000.hg5.m45199b(r8)
            zi7 r8 = p000.zi7.f46397a
            net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel r1 = r7.this$0
            android.app.Application r1 = r1.mo27549b()
            p000.vx2.m53590f(r1, r3)
            boolean r8 = r8.mo67313a(r1, r2, r6)
            if (r8 == 0) goto L_0x006d
            net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel r8 = r7.this$0
            net.safemoon.androidwallet.repository.ReflectionDataSource r8 = r8.mo61347s()
            r7.label = r6
            java.lang.Object r8 = r8.mo60750k(r7)
            if (r8 != r0) goto L_0x0054
            return r0
        L_0x0054:
            zi7 r8 = p000.zi7.f46397a
            net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel r0 = r7.this$0
            android.app.Application r0 = r0.mo27549b()
            p000.vx2.m53590f(r0, r3)
            r1 = 0
            java.lang.Boolean r1 = p000.a40.m31670a(r1)
            r8.mo67316d(r0, r2, r1)
            net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel r8 = r7.this$0
            r8.mo61332C()
            goto L_0x00a0
        L_0x006d:
            net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel r8 = r7.this$0
            net.safemoon.androidwallet.repository.ReflectionDataSource r8 = r8.mo61347s()
            r7.label = r5
            java.lang.Object r8 = r8.mo60746g(r7)
            if (r8 != r0) goto L_0x007c
            return r0
        L_0x007c:
            java.util.List r8 = (java.util.List) r8
            net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel r1 = r7.this$0
            java.util.Iterator r8 = r8.iterator()
            r2 = r1
            r1 = r8
        L_0x0086:
            r8 = r7
        L_0x0087:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00a0
            java.lang.Object r3 = r1.next()
            net.safemoon.androidwallet.model.reflections.RoomReflectionsToken r3 = (net.safemoon.androidwallet.model.reflections.RoomReflectionsToken) r3
            r8.L$0 = r2
            r8.L$1 = r1
            r8.label = r4
            java.lang.Object r3 = r2.mo61331B(r3, r8)
            if (r3 != r0) goto L_0x0087
            return r0
        L_0x00a0:
            r37 r8 = p000.r37.f33317a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$setDailyData$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
