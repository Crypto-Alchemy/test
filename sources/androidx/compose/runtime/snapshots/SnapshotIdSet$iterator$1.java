package androidx.compose.runtime.snapshots;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo44877d2 = {"Ljw5;", "", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", mo48632f = "SnapshotIdSet.kt", mo48633l = {295, 300, 307}, mo48634m = "invokeSuspend")
/* compiled from: SnapshotIdSet.kt */
public final class SnapshotIdSet$iterator$1 extends RestrictedSuspendLambda implements fd2<jw5<? super Integer>, ns0<? super r37>, Object> {
    public int I$0;
    public int I$1;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ SnapshotIdSet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapshotIdSet$iterator$1(SnapshotIdSet snapshotIdSet, ns0<? super SnapshotIdSet$iterator$1> ns0) {
        super(2, ns0);
        this.this$0 = snapshotIdSet;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        SnapshotIdSet$iterator$1 snapshotIdSet$iterator$1 = new SnapshotIdSet$iterator$1(this.this$0, ns0);
        snapshotIdSet$iterator$1.L$0 = obj;
        return snapshotIdSet$iterator$1;
    }

    public final Object invoke(jw5<? super Integer> jw5, ns0<? super r37> ns0) {
        return ((SnapshotIdSet$iterator$1) create(jw5, ns0)).invokeSuspend(r37.f33317a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            r6 = 3
            r7 = 2
            r8 = 64
            r10 = 0
            r12 = 1
            if (r2 == 0) goto L_0x004d
            if (r2 == r12) goto L_0x003c
            if (r2 == r7) goto L_0x0030
            if (r2 != r6) goto L_0x0028
            int r2 = r0.I$0
            java.lang.Object r7 = r0.L$0
            jw5 r7 = (p000.jw5) r7
            p000.hg5.m45199b(r21)
            r9 = r2
            r13 = r6
            r2 = r0
            goto L_0x00f4
        L_0x0028:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0030:
            int r2 = r0.I$0
            java.lang.Object r13 = r0.L$0
            jw5 r13 = (p000.jw5) r13
            p000.hg5.m45199b(r21)
            r9 = r0
            goto L_0x00b7
        L_0x003c:
            int r2 = r0.I$1
            int r13 = r0.I$0
            java.lang.Object r14 = r0.L$1
            int[] r14 = (int[]) r14
            java.lang.Object r15 = r0.L$0
            jw5 r15 = (p000.jw5) r15
            p000.hg5.m45199b(r21)
            r9 = r0
            goto L_0x007b
        L_0x004d:
            p000.hg5.m45199b(r21)
            java.lang.Object r2 = r0.L$0
            jw5 r2 = (p000.jw5) r2
            androidx.compose.runtime.snapshots.SnapshotIdSet r13 = r0.this$0
            int[] r13 = r13.f1581g
            if (r13 == 0) goto L_0x0080
            int r14 = r13.length
            r9 = r0
            r15 = r2
            r2 = r14
            r14 = r13
            r13 = 0
        L_0x0062:
            if (r13 >= r2) goto L_0x007e
            r17 = r14[r13]
            java.lang.Integer r6 = p000.a40.m31673d(r17)
            r9.L$0 = r15
            r9.L$1 = r14
            r9.I$0 = r13
            r9.I$1 = r2
            r9.label = r12
            java.lang.Object r6 = r15.mo52541a(r6, r9)
            if (r6 != r1) goto L_0x007b
            return r1
        L_0x007b:
            int r13 = r13 + r12
            r6 = 3
            goto L_0x0062
        L_0x007e:
            r2 = r15
            goto L_0x0081
        L_0x0080:
            r9 = r0
        L_0x0081:
            androidx.compose.runtime.snapshots.SnapshotIdSet r6 = r9.this$0
            long r13 = r6.f1579d
            int r6 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x00ba
            r13 = r2
            r2 = 0
        L_0x008d:
            if (r2 >= r8) goto L_0x00b9
            androidx.compose.runtime.snapshots.SnapshotIdSet r6 = r9.this$0
            long r14 = r6.f1579d
            long r18 = r4 << r2
            long r14 = r14 & r18
            int r6 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x00b7
            androidx.compose.runtime.snapshots.SnapshotIdSet r6 = r9.this$0
            int r6 = r6.f1580e
            int r6 = r6 + r2
            java.lang.Integer r6 = p000.a40.m31673d(r6)
            r9.L$0 = r13
            r9.L$1 = r3
            r9.I$0 = r2
            r9.label = r7
            java.lang.Object r6 = r13.mo52541a(r6, r9)
            if (r6 != r1) goto L_0x00b7
            return r1
        L_0x00b7:
            int r2 = r2 + r12
            goto L_0x008d
        L_0x00b9:
            r2 = r13
        L_0x00ba:
            androidx.compose.runtime.snapshots.SnapshotIdSet r6 = r9.this$0
            long r6 = r6.f1578a
            int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x00f6
            r7 = r2
            r2 = r9
            r9 = 0
        L_0x00c7:
            if (r9 >= r8) goto L_0x00f6
            androidx.compose.runtime.snapshots.SnapshotIdSet r6 = r2.this$0
            long r13 = r6.f1578a
            long r15 = r4 << r9
            long r13 = r13 & r15
            int r6 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x00f3
            int r6 = r9 + 64
            androidx.compose.runtime.snapshots.SnapshotIdSet r13 = r2.this$0
            int r13 = r13.f1580e
            int r6 = r6 + r13
            java.lang.Integer r6 = p000.a40.m31673d(r6)
            r2.L$0 = r7
            r2.L$1 = r3
            r2.I$0 = r9
            r13 = 3
            r2.label = r13
            java.lang.Object r6 = r7.mo52541a(r6, r2)
            if (r6 != r1) goto L_0x00f4
            return r1
        L_0x00f3:
            r13 = 3
        L_0x00f4:
            int r9 = r9 + r12
            goto L_0x00c7
        L_0x00f6:
            r37 r1 = p000.r37.f33317a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
