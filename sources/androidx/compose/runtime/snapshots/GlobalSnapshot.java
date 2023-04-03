package androidx.compose.runtime.snapshots;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016J4\u0010\t\u001a\u00020\u00012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016J\u000f\u0010\n\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0010\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016¨\u0006\u001a"}, mo44877d2 = {"Landroidx/compose/runtime/snapshots/GlobalSnapshot;", "Ls04;", "Lkotlin/Function1;", "", "Lr37;", "readObserver", "La56;", "v", "writeObserver", "N", "n", "()V", "snapshot", "", "R", "(La56;)Ljava/lang/Void;", "Q", "Lb56;", "A", "d", "", "id", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "<init>", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: Snapshot.kt */
public final class GlobalSnapshot extends s04 {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GlobalSnapshot(int r5, androidx.compose.runtime.snapshots.SnapshotIdSet r6) {
        /*
            r4 = this;
            java.lang.String r0 = "invalid"
            p000.vx2.m53591g(r6, r0)
            java.lang.Object r0 = androidx.compose.runtime.snapshots.SnapshotKt.m2219C()
            monitor-enter(r0)
            java.util.List r1 = androidx.compose.runtime.snapshots.SnapshotKt.f1589h     // Catch:{ all -> 0x0037 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0037 }
            r1 = r1 ^ 1
            r2 = 0
            if (r1 == 0) goto L_0x0020
            java.util.List r1 = androidx.compose.runtime.snapshots.SnapshotKt.f1589h     // Catch:{ all -> 0x0037 }
            java.util.List r1 = kotlin.collections.CollectionsKt___CollectionsKt.m47313M0(r1)     // Catch:{ all -> 0x0037 }
            goto L_0x0021
        L_0x0020:
            r1 = r2
        L_0x0021:
            if (r1 == 0) goto L_0x0031
            java.lang.Object r3 = kotlin.collections.CollectionsKt___CollectionsKt.m47302B0(r1)     // Catch:{ all -> 0x0037 }
            rc2 r3 = (p000.rc2) r3     // Catch:{ all -> 0x0037 }
            if (r3 != 0) goto L_0x0032
            androidx.compose.runtime.snapshots.GlobalSnapshot$1$1$1 r3 = new androidx.compose.runtime.snapshots.GlobalSnapshot$1$1$1     // Catch:{ all -> 0x0037 }
            r3.<init>(r1)     // Catch:{ all -> 0x0037 }
            goto L_0x0032
        L_0x0031:
            r3 = r2
        L_0x0032:
            monitor-exit(r0)
            r4.<init>(r5, r6, r2, r3)
            return
        L_0x0037:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.GlobalSnapshot.<init>(int, androidx.compose.runtime.snapshots.SnapshotIdSet):void");
    }

    /* renamed from: A */
    public b56 mo3149A() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot".toString());
    }

    /* renamed from: N */
    public s04 mo3150N(rc2<Object, r37> rc2, rc2<Object, r37> rc22) {
        return (s04) SnapshotKt.m2234R(new GlobalSnapshot$takeNestedMutableSnapshot$1(rc2, rc22));
    }

    /* renamed from: Q */
    public Void mo49l(a56 a56) {
        vx2.m53591g(a56, "snapshot");
        m56.m22026a();
        throw new KotlinNothingValueException();
    }

    /* renamed from: R */
    public Void mo50m(a56 a56) {
        vx2.m53591g(a56, "snapshot");
        m56.m22026a();
        throw new KotlinNothingValueException();
    }

    /* renamed from: d */
    public void mo41d() {
        synchronized (SnapshotKt.m2219C()) {
            mo53p();
            r37 r37 = r37.f33317a;
        }
    }

    /* renamed from: n */
    public void mo51n() {
        SnapshotKt.m2263x();
    }

    /* renamed from: v */
    public a56 mo59v(rc2<Object, r37> rc2) {
        return SnapshotKt.m2234R(new GlobalSnapshot$takeNestedSnapshot$1(rc2));
    }
}
