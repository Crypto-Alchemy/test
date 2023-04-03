package p000;

import androidx.compose.runtime.snapshots.SnapshotIdSet;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014\u0012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0002R\u0017\u0010\u000b\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u001a"}, mo44877d2 = {"Ld54;", "Ls04;", "Lr37;", "d", "Lb56;", "A", "Q", "n", "Ls04;", "getParent", "()Ls04;", "parent", "", "o", "Z", "deactivated", "", "id", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "Lkotlin/Function1;", "", "readObserver", "writeObserver", "<init>", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;Lrc2;Lrc2;Ls04;)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: d54 */
/* compiled from: Snapshot.kt */
public final class d54 extends s04 {

    /* renamed from: n */
    public final s04 f10500n;

    /* renamed from: o */
    public boolean f10501o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d54(int i, SnapshotIdSet snapshotIdSet, rc2<Object, r37> rc2, rc2<Object, r37> rc22, s04 s04) {
        super(i, snapshotIdSet, rc2, rc22);
        vx2.m53591g(snapshotIdSet, "invalid");
        vx2.m53591g(s04, "parent");
        this.f10500n = s04;
        s04.mo49l(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0074  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p000.b56 mo3149A() {
        /*
            r6 = this;
            s04 r0 = r6.f10500n
            boolean r0 = r0.mo25589B()
            if (r0 != 0) goto L_0x00be
            s04 r0 = r6.f10500n
            boolean r0 = r0.mo42e()
            if (r0 == 0) goto L_0x0012
            goto L_0x00be
        L_0x0012:
            java.util.Set r0 = r6.mo19001C()
            int r1 = r6.mo43f()
            if (r0 == 0) goto L_0x0027
            s04 r2 = r6.f10500n
            androidx.compose.runtime.snapshots.SnapshotIdSet r3 = r2.mo44g()
            java.util.Map r2 = androidx.compose.runtime.snapshots.SnapshotKt.m2226J(r2, r6, r3)
            goto L_0x0028
        L_0x0027:
            r2 = 0
        L_0x0028:
            java.lang.Object r3 = androidx.compose.runtime.snapshots.SnapshotKt.m2219C()
            monitor-enter(r3)
            androidx.compose.runtime.snapshots.SnapshotKt.m2239W(r6)     // Catch:{ all -> 0x00bb }
            if (r0 == 0) goto L_0x0069
            int r4 = r0.size()     // Catch:{ all -> 0x00bb }
            if (r4 != 0) goto L_0x0039
            goto L_0x0069
        L_0x0039:
            s04 r4 = r6.f10500n     // Catch:{ all -> 0x00bb }
            int r4 = r4.mo43f()     // Catch:{ all -> 0x00bb }
            s04 r5 = r6.f10500n     // Catch:{ all -> 0x00bb }
            androidx.compose.runtime.snapshots.SnapshotIdSet r5 = r5.mo44g()     // Catch:{ all -> 0x00bb }
            b56 r2 = r6.mo25592F(r4, r2, r5)     // Catch:{ all -> 0x00bb }
            b56$b r4 = p000.b56.C1605b.f7948a     // Catch:{ all -> 0x00bb }
            boolean r4 = p000.vx2.m53586b(r2, r4)     // Catch:{ all -> 0x00bb }
            if (r4 != 0) goto L_0x0053
            monitor-exit(r3)
            return r2
        L_0x0053:
            s04 r2 = r6.f10500n     // Catch:{ all -> 0x00bb }
            java.util.Set r2 = r2.mo19001C()     // Catch:{ all -> 0x00bb }
            if (r2 != 0) goto L_0x0065
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x00bb }
            r2.<init>()     // Catch:{ all -> 0x00bb }
            s04 r4 = r6.f10500n     // Catch:{ all -> 0x00bb }
            r4.mo19002M(r2)     // Catch:{ all -> 0x00bb }
        L_0x0065:
            r2.addAll(r0)     // Catch:{ all -> 0x00bb }
            goto L_0x006c
        L_0x0069:
            r6.mo39b()     // Catch:{ all -> 0x00bb }
        L_0x006c:
            s04 r0 = r6.f10500n     // Catch:{ all -> 0x00bb }
            int r0 = r0.mo43f()     // Catch:{ all -> 0x00bb }
            if (r0 >= r1) goto L_0x0079
            s04 r0 = r6.f10500n     // Catch:{ all -> 0x00bb }
            r0.mo25602z()     // Catch:{ all -> 0x00bb }
        L_0x0079:
            s04 r0 = r6.f10500n     // Catch:{ all -> 0x00bb }
            androidx.compose.runtime.snapshots.SnapshotIdSet r2 = r0.mo44g()     // Catch:{ all -> 0x00bb }
            androidx.compose.runtime.snapshots.SnapshotIdSet r2 = r2.mo3162s(r1)     // Catch:{ all -> 0x00bb }
            androidx.compose.runtime.snapshots.SnapshotIdSet r4 = r6.mo25590D()     // Catch:{ all -> 0x00bb }
            androidx.compose.runtime.snapshots.SnapshotIdSet r2 = r2.mo3161r(r4)     // Catch:{ all -> 0x00bb }
            r0.mo58u(r2)     // Catch:{ all -> 0x00bb }
            s04 r0 = r6.f10500n     // Catch:{ all -> 0x00bb }
            r0.mo25593G(r1)     // Catch:{ all -> 0x00bb }
            s04 r0 = r6.f10500n     // Catch:{ all -> 0x00bb }
            int r1 = r6.mo60w()     // Catch:{ all -> 0x00bb }
            r0.mo25595I(r1)     // Catch:{ all -> 0x00bb }
            s04 r0 = r6.f10500n     // Catch:{ all -> 0x00bb }
            androidx.compose.runtime.snapshots.SnapshotIdSet r1 = r6.mo25590D()     // Catch:{ all -> 0x00bb }
            r0.mo25594H(r1)     // Catch:{ all -> 0x00bb }
            s04 r0 = r6.f10500n     // Catch:{ all -> 0x00bb }
            int[] r1 = r6.mo25591E()     // Catch:{ all -> 0x00bb }
            r0.mo25596J(r1)     // Catch:{ all -> 0x00bb }
            r37 r0 = p000.r37.f33317a     // Catch:{ all -> 0x00bb }
            monitor-exit(r3)
            r0 = 1
            r6.mo25598L(r0)
            r6.mo18523Q()
            b56$b r0 = p000.b56.C1605b.f7948a
            return r0
        L_0x00bb:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x00be:
            b56$a r0 = new b56$a
            r0.<init>(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.d54.mo3149A():b56");
    }

    /* renamed from: Q */
    public final void mo18523Q() {
        if (!this.f10501o) {
            this.f10501o = true;
            this.f10500n.mo50m(this);
        }
    }

    /* renamed from: d */
    public void mo41d() {
        if (!mo42e()) {
            super.mo41d();
            mo18523Q();
        }
    }
}
