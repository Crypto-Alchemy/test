package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$setDefaultReflectionToken$1", mo48632f = "ReflectionTrackerViewModel.kt", mo48633l = {246, 254, 256}, mo48634m = "invokeSuspend")
/* compiled from: ReflectionTrackerViewModel.kt */
public final class ReflectionTrackerViewModel$setDefaultReflectionToken$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ ReflectionTrackerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReflectionTrackerViewModel$setDefaultReflectionToken$1(ReflectionTrackerViewModel reflectionTrackerViewModel, ns0<? super ReflectionTrackerViewModel$setDefaultReflectionToken$1> ns0) {
        super(2, ns0);
        this.this$0 = reflectionTrackerViewModel;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new ReflectionTrackerViewModel$setDefaultReflectionToken$1(this.this$0, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((ReflectionTrackerViewModel$setDefaultReflectionToken$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0132  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r5) goto L_0x003a
            if (r2 == r4) goto L_0x002a
            if (r2 != r3) goto L_0x0022
            java.lang.Object r2 = r0.L$1
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r5 = r0.L$0
            net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel r5 = (net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel) r5
            p000.hg5.m45199b(r18)
            r8 = r3
            r3 = r0
            goto L_0x012a
        L_0x0022:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x002a:
            java.lang.Object r2 = r0.L$1
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r5 = r0.L$0
            net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel r5 = (net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel) r5
            p000.hg5.m45199b(r18)
            r6 = r18
            r3 = r0
            goto L_0x0114
        L_0x003a:
            p000.hg5.m45199b(r18)
            r2 = r18
            goto L_0x0052
        L_0x0040:
            p000.hg5.m45199b(r18)
            net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel r2 = r0.this$0
            net.safemoon.androidwallet.repository.ReflectionDataSource r2 = r2.mo61347s()
            r0.label = r5
            java.lang.Object r2 = r2.mo60746g(r0)
            if (r2 != r1) goto L_0x0052
            return r1
        L_0x0052:
            java.util.List r2 = (java.util.List) r2
            zi7 r6 = p000.zi7.f46397a
            net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel r7 = r0.this$0
            android.app.Application r7 = r7.mo27549b()
            java.lang.String r8 = "getApplication()"
            p000.vx2.m53590f(r7, r8)
            java.lang.String r8 = "DEFAULT_REFLECTION_DELETE_MAP"
            java.util.Set r6 = r6.mo67314b(r7, r8)
            net.safemoon.androidwallet.database.room.ApplicationRoomDatabase$m r7 = net.safemoon.androidwallet.database.room.ApplicationRoomDatabase.f41664p
            kotlin.Pair r7 = r7.mo57123f()
            java.lang.Object r7 = r7.getFirst()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x007c:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x00ca
            java.lang.Object r9 = r7.next()
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10
            int r11 = r2.size()
            java.util.ListIterator r11 = r2.listIterator(r11)
        L_0x0091:
            boolean r12 = r11.hasPrevious()
            if (r12 == 0) goto L_0x00bd
            java.lang.Object r12 = r11.previous()
            r13 = r12
            net.safemoon.androidwallet.model.reflections.RoomReflectionsToken r13 = (net.safemoon.androidwallet.model.reflections.RoomReflectionsToken) r13
            java.util.Locale r14 = java.util.Locale.ROOT
            java.lang.String r15 = r10.toLowerCase(r14)
            java.lang.String r3 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            p000.vx2.m53590f(r15, r3)
            java.lang.String r13 = r13.getSymbolWithType()
            java.lang.String r13 = r13.toLowerCase(r14)
            p000.vx2.m53590f(r13, r3)
            boolean r3 = p000.vx2.m53586b(r15, r13)
            if (r3 == 0) goto L_0x00bb
            goto L_0x00be
        L_0x00bb:
            r3 = 3
            goto L_0x0091
        L_0x00bd:
            r12 = 0
        L_0x00be:
            if (r12 != 0) goto L_0x00c2
            r3 = r5
            goto L_0x00c3
        L_0x00c2:
            r3 = 0
        L_0x00c3:
            if (r3 == 0) goto L_0x00c8
            r8.add(r9)
        L_0x00c8:
            r3 = 3
            goto L_0x007c
        L_0x00ca:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r8.iterator()
        L_0x00d3:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x00eb
            java.lang.Object r7 = r3.next()
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = r6.contains(r8)
            r8 = r8 ^ r5
            if (r8 == 0) goto L_0x00d3
            r2.add(r7)
            goto L_0x00d3
        L_0x00eb:
            net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel r3 = r0.this$0
            java.util.Iterator r2 = r2.iterator()
            r5 = r0
        L_0x00f2:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0132
            java.lang.Object r6 = r2.next()
            java.lang.String r6 = (java.lang.String) r6
            net.safemoon.androidwallet.repository.dataSource.token.user.LocalUserTokenDataSource r7 = r3.mo61351w()
            r5.L$0 = r3
            r5.L$1 = r2
            r5.label = r4
            java.lang.Object r6 = r7.mo51960f(r6, r5)
            if (r6 != r1) goto L_0x010f
            return r1
        L_0x010f:
            r16 = r5
            r5 = r3
            r3 = r16
        L_0x0114:
            net.safemoon.androidwallet.model.token.room.RoomToken r6 = (net.safemoon.androidwallet.model.token.room.RoomToken) r6
            if (r6 == 0) goto L_0x0130
            net.safemoon.androidwallet.utils.ReflectionCustomContract r7 = r5.mo61346r()
            r3.L$0 = r5
            r3.L$1 = r2
            r8 = 3
            r3.label = r8
            java.lang.Object r6 = r7.mo60946k(r6, r3)
            if (r6 != r1) goto L_0x012a
            return r1
        L_0x012a:
            r16 = r5
            r5 = r3
            r3 = r16
            goto L_0x00f2
        L_0x0130:
            r8 = 3
            goto L_0x012a
        L_0x0132:
            r37 r1 = p000.r37.f33317a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$setDefaultReflectionToken$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
