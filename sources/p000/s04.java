package p000;

import androidx.compose.runtime.snapshots.NestedReadonlySnapshot;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import androidx.compose.runtime.snapshots.SnapshotKt;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.b56;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010#\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0017\u0018\u00002\u00020\u0001BE\b\u0000\u0012\u0006\u0010!\u001a\u00020\u0017\u0012\u0006\u0010R\u001a\u00020\u001c\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\bS\u0010TJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J8\u0010\b\u001a\u00020\u00002\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u001e\u0010\f\u001a\u00020\u00012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H\u0016J\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0015\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0016\u0010\u0012J5\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00172\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0002H\u0000¢\u0006\u0004\b \u0010\u0012J\u0017\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0017H\u0000¢\u0006\u0004\b$\u0010#J\u0017\u0010'\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0002H\u0000¢\u0006\u0004\b)\u0010\u0012J\u0017\u0010+\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u001cH\u0000¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u00022\u0006\u0010.\u001a\u00020-H\u0010¢\u0006\u0004\b/\u00100R(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0010X\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0010X\u0004¢\u0006\f\n\u0004\b3\u00102\u001a\u0004\b5\u00104R:\u0010>\u001a\n\u0012\u0004\u0012\u00020-\u0018\u0001062\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020-\u0018\u0001068\u0010@VX\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010C\u001a\u00020\u001c8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b5\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010,R\"\u0010I\u001a\u00020%8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010(R\u0016\u0010*\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010$R\"\u0010P\u001a\u00020J8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020J8VX\u0004¢\u0006\u0006\u001a\u0004\b8\u0010M¨\u0006U"}, mo44877d2 = {"Ls04;", "La56;", "Lr37;", "y", "Lkotlin/Function1;", "", "readObserver", "writeObserver", "N", "Lb56;", "A", "d", "v", "snapshot", "l", "(La56;)V", "m", "n", "()V", "c", "q", "O", "P", "", "snapshotId", "", "La96;", "optimisticMerges", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalidSnapshots", "F", "(ILjava/util/Map;Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Lb56;", "z", "id", "G", "(I)V", "I", "", "handles", "J", "([I)V", "K", "snapshots", "H", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "Lz86;", "state", "o", "(Lz86;)V", "g", "Lrc2;", "h", "()Lrc2;", "j", "", "<set-?>", "i", "Ljava/util/Set;", "C", "()Ljava/util/Set;", "M", "(Ljava/util/Set;)V", "modified", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "D", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "setPreviousIds$runtime_release", "previousIds", "k", "[I", "E", "()[I", "setPreviousPinnedSnapshots$runtime_release", "previousPinnedSnapshots", "", "Z", "B", "()Z", "L", "(Z)V", "applied", "readOnly", "invalid", "<init>", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;Lrc2;Lrc2;)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: s04 */
/* compiled from: Snapshot.kt */
public class s04 extends a56 {

    /* renamed from: g */
    public final rc2<Object, r37> f17417g;

    /* renamed from: h */
    public final rc2<Object, r37> f17418h;

    /* renamed from: i */
    public Set<z86> f17419i;

    /* renamed from: j */
    public SnapshotIdSet f17420j = SnapshotIdSet.f1576k.mo3167a();

    /* renamed from: k */
    public int[] f17421k = new int[0];

    /* renamed from: l */
    public int f17422l = 1;

    /* renamed from: m */
    public boolean f17423m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s04(int i, SnapshotIdSet snapshotIdSet, rc2<Object, r37> rc2, rc2<Object, r37> rc22) {
        super(i, snapshotIdSet, (DefaultConstructorMarker) null);
        vx2.m53591g(snapshotIdSet, "invalid");
        this.f17417g = rc2;
        this.f17418h = rc22;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ce, code lost:
        r2 = (java.util.List) r1.component1();
        r1 = (java.util.Set) r1.component2();
        r9.f17423m = true;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00dd, code lost:
        if (r1 == null) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e4, code lost:
        if ((!r1.isEmpty()) == false) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e6, code lost:
        r5 = r2.size();
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00eb, code lost:
        if (r6 >= r5) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ed, code lost:
        ((p000.fd2) r2.get(r6)).invoke(r1, r9);
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f9, code lost:
        if (r0 == null) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0100, code lost:
        if ((!r0.isEmpty()) == false) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0102, code lost:
        r1 = r2.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0106, code lost:
        if (r3 >= r1) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0108, code lost:
        ((p000.fd2) r2.get(r3)).invoke(r0, r9);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0114, code lost:
        r0 = androidx.compose.runtime.snapshots.SnapshotKt.m2219C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0118, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        mo54q();
        r1 = p000.r37.f33317a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x011e, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0121, code lost:
        return p000.b56.C1605b.f7948a;
     */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p000.b56 mo3149A() {
        /*
            r9 = this;
            java.util.Set r0 = r9.mo19001C()
            r1 = 0
            if (r0 == 0) goto L_0x0031
            java.util.concurrent.atomic.AtomicReference r2 = androidx.compose.runtime.snapshots.SnapshotKt.f1590i
            java.lang.Object r2 = r2.get()
            java.lang.String r3 = "currentGlobalSnapshot.get()"
            p000.vx2.m53590f(r2, r3)
            s04 r2 = (p000.s04) r2
            androidx.compose.runtime.snapshots.SnapshotIdSet r3 = androidx.compose.runtime.snapshots.SnapshotKt.f1585d
            java.util.concurrent.atomic.AtomicReference r4 = androidx.compose.runtime.snapshots.SnapshotKt.f1590i
            java.lang.Object r4 = r4.get()
            androidx.compose.runtime.snapshots.GlobalSnapshot r4 = (androidx.compose.runtime.snapshots.GlobalSnapshot) r4
            int r4 = r4.mo43f()
            androidx.compose.runtime.snapshots.SnapshotIdSet r3 = r3.mo3162s(r4)
            java.util.Map r2 = androidx.compose.runtime.snapshots.SnapshotKt.m2226J(r2, r9, r3)
            goto L_0x0032
        L_0x0031:
            r2 = r1
        L_0x0032:
            java.lang.Object r3 = androidx.compose.runtime.snapshots.SnapshotKt.m2219C()
            monitor-enter(r3)
            androidx.compose.runtime.snapshots.SnapshotKt.m2239W(r9)     // Catch:{ all -> 0x0125 }
            r4 = 1
            if (r0 == 0) goto L_0x0092
            int r5 = r0.size()     // Catch:{ all -> 0x0125 }
            if (r5 != 0) goto L_0x0044
            goto L_0x0092
        L_0x0044:
            java.util.concurrent.atomic.AtomicReference r5 = androidx.compose.runtime.snapshots.SnapshotKt.f1590i     // Catch:{ all -> 0x0125 }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x0125 }
            androidx.compose.runtime.snapshots.GlobalSnapshot r5 = (androidx.compose.runtime.snapshots.GlobalSnapshot) r5     // Catch:{ all -> 0x0125 }
            int r6 = androidx.compose.runtime.snapshots.SnapshotKt.f1586e     // Catch:{ all -> 0x0125 }
            androidx.compose.runtime.snapshots.SnapshotIdSet r7 = androidx.compose.runtime.snapshots.SnapshotKt.f1585d     // Catch:{ all -> 0x0125 }
            int r8 = r5.mo43f()     // Catch:{ all -> 0x0125 }
            androidx.compose.runtime.snapshots.SnapshotIdSet r7 = r7.mo3162s(r8)     // Catch:{ all -> 0x0125 }
            b56 r2 = r9.mo25592F(r6, r2, r7)     // Catch:{ all -> 0x0125 }
            b56$b r6 = p000.b56.C1605b.f7948a     // Catch:{ all -> 0x0125 }
            boolean r6 = p000.vx2.m53586b(r2, r6)     // Catch:{ all -> 0x0125 }
            if (r6 != 0) goto L_0x006c
            monitor-exit(r3)
            return r2
        L_0x006c:
            r9.mo40c()     // Catch:{ all -> 0x0125 }
            java.lang.String r2 = "previousGlobalSnapshot"
            p000.vx2.m53590f(r5, r2)     // Catch:{ all -> 0x0125 }
            rc2 r2 = androidx.compose.runtime.snapshots.SnapshotKt.f1582a     // Catch:{ all -> 0x0125 }
            java.lang.Object unused = androidx.compose.runtime.snapshots.SnapshotKt.m2233Q(r5, r2)     // Catch:{ all -> 0x0125 }
            java.util.Set r2 = r5.mo19001C()     // Catch:{ all -> 0x0125 }
            r9.mo19002M(r1)     // Catch:{ all -> 0x0125 }
            r5.mo19002M(r1)     // Catch:{ all -> 0x0125 }
            java.util.List r1 = androidx.compose.runtime.snapshots.SnapshotKt.f1588g     // Catch:{ all -> 0x0125 }
            java.util.List r1 = kotlin.collections.CollectionsKt___CollectionsKt.m47313M0(r1)     // Catch:{ all -> 0x0125 }
            kotlin.Pair r1 = p000.wy6.m54142a(r1, r2)     // Catch:{ all -> 0x0125 }
            goto L_0x00cd
        L_0x0092:
            r9.mo40c()     // Catch:{ all -> 0x0125 }
            java.util.concurrent.atomic.AtomicReference r2 = androidx.compose.runtime.snapshots.SnapshotKt.f1590i     // Catch:{ all -> 0x0125 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0125 }
            androidx.compose.runtime.snapshots.GlobalSnapshot r2 = (androidx.compose.runtime.snapshots.GlobalSnapshot) r2     // Catch:{ all -> 0x0125 }
            java.lang.String r5 = "previousGlobalSnapshot"
            p000.vx2.m53590f(r2, r5)     // Catch:{ all -> 0x0125 }
            rc2 r5 = androidx.compose.runtime.snapshots.SnapshotKt.f1582a     // Catch:{ all -> 0x0125 }
            java.lang.Object unused = androidx.compose.runtime.snapshots.SnapshotKt.m2233Q(r2, r5)     // Catch:{ all -> 0x0125 }
            java.util.Set r2 = r2.mo19001C()     // Catch:{ all -> 0x0125 }
            if (r2 == 0) goto L_0x00c5
            boolean r5 = r2.isEmpty()     // Catch:{ all -> 0x0125 }
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x00c5
            java.util.List r1 = androidx.compose.runtime.snapshots.SnapshotKt.f1588g     // Catch:{ all -> 0x0125 }
            java.util.List r1 = kotlin.collections.CollectionsKt___CollectionsKt.m47313M0(r1)     // Catch:{ all -> 0x0125 }
            kotlin.Pair r1 = p000.wy6.m54142a(r1, r2)     // Catch:{ all -> 0x0125 }
            goto L_0x00cd
        L_0x00c5:
            java.util.List r2 = p000.ck0.m33062j()     // Catch:{ all -> 0x0125 }
            kotlin.Pair r1 = p000.wy6.m54142a(r2, r1)     // Catch:{ all -> 0x0125 }
        L_0x00cd:
            monitor-exit(r3)
            java.lang.Object r2 = r1.component1()
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r1 = r1.component2()
            java.util.Set r1 = (java.util.Set) r1
            r9.f17423m = r4
            r3 = 0
            if (r1 == 0) goto L_0x00f9
            boolean r5 = r1.isEmpty()
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x00f9
            int r5 = r2.size()
            r6 = r3
        L_0x00eb:
            if (r6 >= r5) goto L_0x00f9
            java.lang.Object r7 = r2.get(r6)
            fd2 r7 = (p000.fd2) r7
            r7.invoke(r1, r9)
            int r6 = r6 + 1
            goto L_0x00eb
        L_0x00f9:
            if (r0 == 0) goto L_0x0114
            boolean r1 = r0.isEmpty()
            r1 = r1 ^ r4
            if (r1 == 0) goto L_0x0114
            int r1 = r2.size()
        L_0x0106:
            if (r3 >= r1) goto L_0x0114
            java.lang.Object r4 = r2.get(r3)
            fd2 r4 = (p000.fd2) r4
            r4.invoke(r0, r9)
            int r3 = r3 + 1
            goto L_0x0106
        L_0x0114:
            java.lang.Object r0 = androidx.compose.runtime.snapshots.SnapshotKt.m2219C()
            monitor-enter(r0)
            r9.mo54q()     // Catch:{ all -> 0x0122 }
            r37 r1 = p000.r37.f33317a     // Catch:{ all -> 0x0122 }
            monitor-exit(r0)
            b56$b r0 = p000.b56.C1605b.f7948a
            return r0
        L_0x0122:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0125:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.s04.mo3149A():b56");
    }

    /* renamed from: B */
    public final boolean mo25589B() {
        return this.f17423m;
    }

    /* renamed from: C */
    public Set<z86> mo19001C() {
        return this.f17419i;
    }

    /* renamed from: D */
    public final SnapshotIdSet mo25590D() {
        return this.f17420j;
    }

    /* renamed from: E */
    public final int[] mo25591E() {
        return this.f17421k;
    }

    /* renamed from: F */
    public final b56 mo25592F(int i, Map<a96, ? extends a96> map, SnapshotIdSet snapshotIdSet) {
        a96 o;
        a96 a96;
        Pair pair;
        vx2.m53591g(snapshotIdSet, "invalidSnapshots");
        SnapshotIdSet w = mo44g().mo3159A(mo43f()).mo3166w(this.f17420j);
        Set<z86> C = mo19001C();
        vx2.m53588d(C);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (z86 next : C) {
            a96 e = next.mo19691e();
            a96 o2 = SnapshotKt.m2229M(e, i, snapshotIdSet);
            if (!(o2 == null || (o = SnapshotKt.m2229M(e, mo43f(), w)) == null || vx2.m53586b(o2, o))) {
                a96 o3 = SnapshotKt.m2229M(e, mo43f(), mo44g());
                if (o3 != null) {
                    if (map == null || (a96 = (a96) map.get(o2)) == null) {
                        a96 = next.mo19692f(o, o2, o3);
                    }
                    if (a96 == null) {
                        return new b56.C1604a(this);
                    }
                    if (!vx2.m53586b(a96, o3)) {
                        if (vx2.m53586b(a96, o2)) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(wy6.m54142a(next, o2.mo128a()));
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(next);
                        } else {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            if (!vx2.m53586b(a96, o)) {
                                pair = wy6.m54142a(next, a96);
                            } else {
                                pair = wy6.m54142a(next, o.mo128a());
                            }
                            arrayList.add(pair);
                        }
                    }
                } else {
                    Void unused = SnapshotKt.m2228L();
                    throw new KotlinNothingValueException();
                }
            }
        }
        if (arrayList != null) {
            mo25602z();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Pair pair2 = (Pair) arrayList.get(i2);
                z86 z86 = (z86) pair2.component1();
                a96 a962 = (a96) pair2.component2();
                a962.mo132e(mo43f());
                synchronized (SnapshotKt.m2219C()) {
                    a962.mo131d(z86.mo19691e());
                    z86.mo19690d(a962);
                    r37 r37 = r37.f33317a;
                }
            }
        }
        if (arrayList2 != null) {
            C.removeAll(arrayList2);
        }
        return b56.C1605b.f7948a;
    }

    /* renamed from: G */
    public final void mo25593G(int i) {
        synchronized (SnapshotKt.m2219C()) {
            this.f17420j = this.f17420j.mo3159A(i);
            r37 r37 = r37.f33317a;
        }
    }

    /* renamed from: H */
    public final void mo25594H(SnapshotIdSet snapshotIdSet) {
        vx2.m53591g(snapshotIdSet, "snapshots");
        synchronized (SnapshotKt.m2219C()) {
            this.f17420j = this.f17420j.mo3166w(snapshotIdSet);
            r37 r37 = r37.f33317a;
        }
    }

    /* renamed from: I */
    public final void mo25595I(int i) {
        if (i >= 0) {
            this.f17421k = C6706xq.m54507u(this.f17421k, i);
        }
    }

    /* renamed from: J */
    public final void mo25596J(int[] iArr) {
        boolean z;
        vx2.m53591g(iArr, "handles");
        boolean z2 = true;
        if (iArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            int[] iArr2 = this.f17421k;
            if (iArr2.length != 0) {
                z2 = false;
            }
            if (z2) {
                this.f17421k = iArr;
            } else {
                this.f17421k = C6706xq.m54508v(iArr2, iArr);
            }
        }
    }

    /* renamed from: K */
    public final void mo25597K() {
        for (int O : this.f17421k) {
            SnapshotKt.m2231O(O);
        }
    }

    /* renamed from: L */
    public final void mo25598L(boolean z) {
        this.f17423m = z;
    }

    /* renamed from: M */
    public void mo19002M(Set<z86> set) {
        this.f17419i = set;
    }

    /* renamed from: N */
    public s04 mo3150N(rc2<Object, r37> rc2, rc2<Object, r37> rc22) {
        d54 d54;
        mo61x();
        mo25600P();
        mo25593G(mo43f());
        synchronized (SnapshotKt.m2219C()) {
            int h = SnapshotKt.f1586e;
            SnapshotKt.f1586e = h + 1;
            SnapshotKt.f1585d = SnapshotKt.f1585d.mo3159A(h);
            SnapshotIdSet g = mo44g();
            mo58u(g.mo3159A(h));
            d54 = new d54(h, SnapshotKt.m2261v(g, mo43f() + 1, h), SnapshotKt.m2222F(rc2, mo45h(), false, 4, (Object) null), SnapshotKt.m2223G(rc22, mo47j()), this);
        }
        if (!mo25589B() && !mo42e()) {
            int f = mo43f();
            synchronized (SnapshotKt.m2219C()) {
                int h2 = SnapshotKt.f1586e;
                SnapshotKt.f1586e = h2 + 1;
                mo57t(h2);
                SnapshotKt.f1585d = SnapshotKt.f1585d.mo3159A(mo43f());
                r37 r37 = r37.f33317a;
            }
            mo58u(SnapshotKt.m2261v(mo44g(), f + 1, mo43f()));
        }
        return d54;
    }

    /* renamed from: O */
    public final void mo25599O() {
        if (!(!this.f17423m)) {
            throw new IllegalStateException("Unsupported operation on a snapshot that has been applied".toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        if (r0 != false) goto L_0x0011;
     */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25600P() {
        /*
            r3 = this;
            boolean r0 = r3.f17423m
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0011
            int r0 = r3.f46d
            if (r0 < 0) goto L_0x000e
            r0 = r2
            goto L_0x000f
        L_0x000e:
            r0 = r1
        L_0x000f:
            if (r0 == 0) goto L_0x0012
        L_0x0011:
            r1 = r2
        L_0x0012:
            if (r1 == 0) goto L_0x0015
            return
        L_0x0015:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unsupported operation on a disposed or applied snapshot"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.s04.mo25600P():void");
    }

    /* renamed from: c */
    public void mo40c() {
        SnapshotKt.f1585d = SnapshotKt.f1585d.mo3162s(mo43f()).mo3161r(this.f17420j);
    }

    /* renamed from: d */
    public void mo41d() {
        if (!mo42e()) {
            super.mo41d();
            mo50m(this);
        }
    }

    /* renamed from: h */
    public rc2<Object, r37> mo45h() {
        return this.f17417g;
    }

    /* renamed from: i */
    public boolean mo46i() {
        return false;
    }

    /* renamed from: j */
    public rc2<Object, r37> mo47j() {
        return this.f17418h;
    }

    /* renamed from: l */
    public void mo49l(a56 a56) {
        vx2.m53591g(a56, "snapshot");
        this.f17422l++;
    }

    /* renamed from: m */
    public void mo50m(a56 a56) {
        boolean z;
        vx2.m53591g(a56, "snapshot");
        int i = this.f17422l;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i2 = i - 1;
            this.f17422l = i2;
            if (i2 == 0 && !this.f17423m) {
                mo25601y();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: n */
    public void mo51n() {
        if (!this.f17423m && !mo42e()) {
            mo25602z();
        }
    }

    /* renamed from: o */
    public void mo52o(z86 z86) {
        vx2.m53591g(z86, "state");
        Set C = mo19001C();
        if (C == null) {
            C = new HashSet();
            mo19002M(C);
        }
        C.add(z86);
    }

    /* renamed from: q */
    public void mo54q() {
        mo25597K();
        super.mo54q();
    }

    /* renamed from: v */
    public a56 mo59v(rc2<Object, r37> rc2) {
        NestedReadonlySnapshot nestedReadonlySnapshot;
        mo61x();
        mo25600P();
        int f = mo43f();
        mo25593G(mo43f());
        synchronized (SnapshotKt.m2219C()) {
            int h = SnapshotKt.f1586e;
            SnapshotKt.f1586e = h + 1;
            SnapshotKt.f1585d = SnapshotKt.f1585d.mo3159A(h);
            nestedReadonlySnapshot = new NestedReadonlySnapshot(h, SnapshotKt.m2261v(mo44g(), f + 1, h), rc2, this);
        }
        if (!mo25589B() && !mo42e()) {
            int f2 = mo43f();
            synchronized (SnapshotKt.m2219C()) {
                int h2 = SnapshotKt.f1586e;
                SnapshotKt.f1586e = h2 + 1;
                mo57t(h2);
                SnapshotKt.f1585d = SnapshotKt.f1585d.mo3159A(mo43f());
                r37 r37 = r37.f33317a;
            }
            mo58u(SnapshotKt.m2261v(mo44g(), f2 + 1, mo43f()));
        }
        return nestedReadonlySnapshot;
    }

    /* renamed from: y */
    public final void mo25601y() {
        Set<z86> C = mo19001C();
        if (C != null) {
            mo25599O();
            mo19002M((Set<z86>) null);
            int f = mo43f();
            for (z86 e : C) {
                for (a96 e2 = e.mo19691e(); e2 != null; e2 = e2.mo129b()) {
                    if (e2.mo130c() == f || CollectionsKt___CollectionsKt.m47320R(this.f17420j, Integer.valueOf(e2.mo130c()))) {
                        e2.mo132e(0);
                    }
                }
            }
        }
        mo39b();
    }

    /* renamed from: z */
    public final void mo25602z() {
        mo25593G(mo43f());
        r37 r37 = r37.f33317a;
        if (!mo25589B() && !mo42e()) {
            int f = mo43f();
            synchronized (SnapshotKt.m2219C()) {
                int h = SnapshotKt.f1586e;
                SnapshotKt.f1586e = h + 1;
                mo57t(h);
                SnapshotKt.f1585d = SnapshotKt.f1585d.mo3159A(mo43f());
            }
            mo58u(SnapshotKt.m2261v(mo44g(), f + 1, mo43f()));
        }
    }
}
