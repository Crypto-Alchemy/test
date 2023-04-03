package androidx.compose.runtime;

import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@"}, mo44877d2 = {"Lhu0;", "Lyx3;", "parentFrameClock", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", mo48632f = "Recomposer.kt", mo48633l = {485, 503}, mo48634m = "invokeSuspend")
/* compiled from: Recomposer.kt */
public final class Recomposer$runRecomposeAndApplyChanges$2 extends SuspendLambda implements id2<hu0, yx3, ns0<? super r37>, Object> {
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;
    public final /* synthetic */ Recomposer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeAndApplyChanges$2(Recomposer recomposer, ns0<? super Recomposer$runRecomposeAndApplyChanges$2> ns0) {
        super(3, ns0);
        this.this$0 = recomposer;
    }

    /* renamed from: a */
    public static final void m2167a(List<kt0> list, List<zy3> list2, List<kt0> list3, Set<kt0> set, Set<kt0> set2) {
        list.clear();
        list2.clear();
        list3.clear();
        set.clear();
        set2.clear();
    }

    /* renamed from: d */
    public static final void m2168d(List<zy3> list, Recomposer recomposer) {
        list.clear();
        synchronized (recomposer.f1543e) {
            List w = recomposer.f1550l;
            int size = w.size();
            for (int i = 0; i < size; i++) {
                list.add((zy3) w.get(i));
            }
            recomposer.f1550l.clear();
            r37 r37 = r37.f33317a;
        }
    }

    public final Object invoke(hu0 hu0, yx3 yx3, ns0<? super r37> ns0) {
        Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2 = new Recomposer$runRecomposeAndApplyChanges$2(this.this$0, ns0);
        recomposer$runRecomposeAndApplyChanges$2.L$0 = yx3;
        return recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(r37.f33317a);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r1 = r18
            java.lang.Object r0 = p000.wx2.m54101d()
            int r2 = r1.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0065
            if (r2 == r4) goto L_0x0042
            if (r2 != r3) goto L_0x003a
            java.lang.Object r2 = r1.L$5
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Object r5 = r1.L$4
            java.util.Set r5 = (java.util.Set) r5
            java.lang.Object r6 = r1.L$3
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r1.L$2
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r1.L$1
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r1.L$0
            yx3 r9 = (p000.yx3) r9
            p000.hg5.m45199b(r19)
            r10 = r1
            r14 = r6
            r6 = r3
            r16 = r9
            r9 = r2
            r2 = r16
            r17 = r8
            r8 = r5
            r5 = r17
            goto L_0x00fd
        L_0x003a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0042:
            java.lang.Object r2 = r1.L$5
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Object r5 = r1.L$4
            java.util.Set r5 = (java.util.Set) r5
            java.lang.Object r6 = r1.L$3
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r1.L$2
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r1.L$1
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r1.L$0
            yx3 r9 = (p000.yx3) r9
            p000.hg5.m45199b(r19)
            r11 = r1
            r10 = r2
            r15 = r5
            r14 = r6
            r13 = r7
            r12 = r8
            r2 = r9
            goto L_0x00ab
        L_0x0065:
            p000.hg5.m45199b(r19)
            java.lang.Object r2 = r1.L$0
            yx3 r2 = (p000.yx3) r2
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r10 = r1
        L_0x0086:
            androidx.compose.runtime.Recomposer r11 = r10.this$0
            boolean r11 = r11.mo3098a0()
            if (r11 == 0) goto L_0x010b
            androidx.compose.runtime.Recomposer r11 = r10.this$0
            r10.L$0 = r2
            r10.L$1 = r5
            r10.L$2 = r6
            r10.L$3 = r7
            r10.L$4 = r8
            r10.L$5 = r9
            r10.label = r4
            java.lang.Object r11 = r11.mo3089S(r10)
            if (r11 != r0) goto L_0x00a5
            return r0
        L_0x00a5:
            r12 = r5
            r13 = r6
            r14 = r7
            r15 = r8
            r11 = r10
            r10 = r9
        L_0x00ab:
            androidx.compose.runtime.Recomposer r5 = r11.this$0
            java.lang.Object r5 = r5.f1543e
            androidx.compose.runtime.Recomposer r6 = r11.this$0
            monitor-enter(r5)
            boolean r7 = r6.mo3095Y()     // Catch:{ all -> 0x0108 }
            r8 = 0
            if (r7 != 0) goto L_0x00c5
            r6.mo3114k0()     // Catch:{ all -> 0x0108 }
            boolean r6 = r6.mo3095Y()     // Catch:{ all -> 0x0108 }
            if (r6 != 0) goto L_0x00c5
            r8 = r4
        L_0x00c5:
            monitor-exit(r5)
            if (r8 == 0) goto L_0x00cf
            r9 = r10
            r10 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            goto L_0x0086
        L_0x00cf:
            androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2$2 r9 = new androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2$2
            androidx.compose.runtime.Recomposer r6 = r11.this$0
            r5 = r9
            r7 = r12
            r8 = r13
            r4 = r9
            r9 = r15
            r19 = r10
            r10 = r14
            r3 = r11
            r11 = r19
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r3.L$0 = r2
            r3.L$1 = r12
            r3.L$2 = r13
            r3.L$3 = r14
            r3.L$4 = r15
            r9 = r19
            r3.L$5 = r9
            r6 = 2
            r3.label = r6
            java.lang.Object r4 = r2.mo2869d(r4, r3)
            if (r4 != r0) goto L_0x00f9
            return r0
        L_0x00f9:
            r10 = r3
            r5 = r12
            r7 = r13
            r8 = r15
        L_0x00fd:
            androidx.compose.runtime.Recomposer r3 = r10.this$0
            r3.mo3092V()
            r3 = r6
            r6 = r7
            r7 = r14
            r4 = 1
            goto L_0x0086
        L_0x0108:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x010b:
            r37 r0 = p000.r37.f33317a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
