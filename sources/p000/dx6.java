package p000;

import androidx.compose.runtime.snapshots.SnapshotIdSet;
import androidx.compose.runtime.snapshots.SnapshotKt;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001\u0012\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n\u0012\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010&\u001a\u00020!¢\u0006\u0004\b@\u0010AJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u000e\u001a\u00020\r2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\nH\u0016J4\u0010\u0010\u001a\u00020\u00012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\nH\u0016J\u000f\u0010\u0011\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\rH\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\rH\u0010¢\u0006\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R(\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0000X\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR(\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0000X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u0014\u0010$\u001a\u00020!8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020!8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010#R$\u0010-\u001a\u00020'2\u0006\u0010(\u001a\u00020'8V@PX\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u00103\u001a\u00020.2\u0006\u0010(\u001a\u00020.8P@PX\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R4\u00109\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001042\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001048P@VX\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0014\u0010<\u001a\u00020!8VX\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010?\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006B"}, mo44877d2 = {"Ldx6;", "Ls04;", "Lr37;", "d", "Lb56;", "A", "Lz86;", "state", "o", "(Lz86;)V", "Lkotlin/Function1;", "", "readObserver", "La56;", "v", "writeObserver", "N", "n", "()V", "snapshot", "", "R", "(La56;)Ljava/lang/Void;", "S", "Ls04;", "previousSnapshot", "Lrc2;", "getSpecifiedReadObserver$runtime_release", "()Lrc2;", "specifiedReadObserver", "p", "getSpecifiedWriteObserver$runtime_release", "specifiedWriteObserver", "", "q", "Z", "mergeParentObservers", "r", "ownsPreviousSnapshot", "", "value", "f", "()I", "t", "(I)V", "id", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "g", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "u", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "invalid", "", "C", "()Ljava/util/Set;", "M", "(Ljava/util/Set;)V", "modified", "i", "()Z", "readOnly", "Q", "()Ls04;", "currentSnapshot", "<init>", "(Ls04;Lrc2;Lrc2;ZZ)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: dx6 */
/* compiled from: Snapshot.kt */
public final class dx6 extends s04 {

    /* renamed from: n */
    public final s04 f10974n;

    /* renamed from: o */
    public final rc2<Object, r37> f10975o;

    /* renamed from: p */
    public final rc2<Object, r37> f10976p;

    /* renamed from: q */
    public final boolean f10977q;

    /* renamed from: r */
    public final boolean f10978r;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r1 = r5.mo45h();
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public dx6(p000.s04 r5, p000.rc2<java.lang.Object, p000.r37> r6, p000.rc2<java.lang.Object, p000.r37> r7, boolean r8, boolean r9) {
        /*
            r4 = this;
            androidx.compose.runtime.snapshots.SnapshotIdSet$a r0 = androidx.compose.runtime.snapshots.SnapshotIdSet.f1576k
            androidx.compose.runtime.snapshots.SnapshotIdSet r0 = r0.mo3167a()
            if (r5 == 0) goto L_0x000e
            rc2 r1 = r5.mo45h()
            if (r1 != 0) goto L_0x001c
        L_0x000e:
            java.util.concurrent.atomic.AtomicReference r1 = androidx.compose.runtime.snapshots.SnapshotKt.f1590i
            java.lang.Object r1 = r1.get()
            androidx.compose.runtime.snapshots.GlobalSnapshot r1 = (androidx.compose.runtime.snapshots.GlobalSnapshot) r1
            rc2 r1 = r1.mo45h()
        L_0x001c:
            rc2 r1 = androidx.compose.runtime.snapshots.SnapshotKt.m2221E(r6, r1, r8)
            if (r5 == 0) goto L_0x0028
            rc2 r2 = r5.mo47j()
            if (r2 != 0) goto L_0x0036
        L_0x0028:
            java.util.concurrent.atomic.AtomicReference r2 = androidx.compose.runtime.snapshots.SnapshotKt.f1590i
            java.lang.Object r2 = r2.get()
            androidx.compose.runtime.snapshots.GlobalSnapshot r2 = (androidx.compose.runtime.snapshots.GlobalSnapshot) r2
            rc2 r2 = r2.mo47j()
        L_0x0036:
            rc2 r2 = androidx.compose.runtime.snapshots.SnapshotKt.m2223G(r7, r2)
            r3 = 0
            r4.<init>(r3, r0, r1, r2)
            r4.f10974n = r5
            r4.f10975o = r6
            r4.f10976p = r7
            r4.f10977q = r8
            r4.f10978r = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dx6.<init>(s04, rc2, rc2, boolean, boolean):void");
    }

    /* renamed from: A */
    public b56 mo3149A() {
        return mo19003Q().mo3149A();
    }

    /* renamed from: C */
    public Set<z86> mo19001C() {
        return mo19003Q().mo19001C();
    }

    /* renamed from: M */
    public void mo19002M(Set<z86> set) {
        m56.m22026a();
        throw new KotlinNothingValueException();
    }

    /* renamed from: N */
    public s04 mo3150N(rc2<Object, r37> rc2, rc2<Object, r37> rc22) {
        rc2 F = SnapshotKt.m2222F(rc2, mo45h(), false, 4, (Object) null);
        rc2 l = SnapshotKt.m2223G(rc22, mo47j());
        if (!this.f10977q) {
            return new dx6(mo19003Q().mo3150N((rc2<Object, r37>) null, l), F, l, false, true);
        }
        return mo19003Q().mo3150N(F, l);
    }

    /* renamed from: Q */
    public final s04 mo19003Q() {
        s04 s04 = this.f10974n;
        if (s04 != null) {
            return s04;
        }
        Object obj = SnapshotKt.f1590i.get();
        vx2.m53590f(obj, "currentGlobalSnapshot.get()");
        return (s04) obj;
    }

    /* renamed from: R */
    public Void mo49l(a56 a56) {
        vx2.m53591g(a56, "snapshot");
        m56.m22026a();
        throw new KotlinNothingValueException();
    }

    /* renamed from: S */
    public Void mo50m(a56 a56) {
        vx2.m53591g(a56, "snapshot");
        m56.m22026a();
        throw new KotlinNothingValueException();
    }

    /* renamed from: d */
    public void mo41d() {
        s04 s04;
        mo56s(true);
        if (this.f10978r && (s04 = this.f10974n) != null) {
            s04.mo41d();
        }
    }

    /* renamed from: f */
    public int mo43f() {
        return mo19003Q().mo43f();
    }

    /* renamed from: g */
    public SnapshotIdSet mo44g() {
        return mo19003Q().mo44g();
    }

    /* renamed from: i */
    public boolean mo46i() {
        return mo19003Q().mo46i();
    }

    /* renamed from: n */
    public void mo51n() {
        mo19003Q().mo51n();
    }

    /* renamed from: o */
    public void mo52o(z86 z86) {
        vx2.m53591g(z86, "state");
        mo19003Q().mo52o(z86);
    }

    /* renamed from: t */
    public void mo57t(int i) {
        m56.m22026a();
        throw new KotlinNothingValueException();
    }

    /* renamed from: u */
    public void mo58u(SnapshotIdSet snapshotIdSet) {
        vx2.m53591g(snapshotIdSet, "value");
        m56.m22026a();
        throw new KotlinNothingValueException();
    }

    /* renamed from: v */
    public a56 mo59v(rc2<Object, r37> rc2) {
        rc2 F = SnapshotKt.m2222F(rc2, mo45h(), false, 4, (Object) null);
        if (!this.f10977q) {
            return SnapshotKt.m2264y(mo19003Q().mo59v((rc2<Object, r37>) null), F, true);
        }
        return mo19003Q().mo59v(F);
    }
}
