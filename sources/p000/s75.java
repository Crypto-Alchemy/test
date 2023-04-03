package p000;

import androidx.compose.runtime.snapshots.NestedReadonlySnapshot;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import androidx.compose.runtime.snapshots.SnapshotKt;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u001f\u001a\u00020\u0016\u0012\u0006\u0010!\u001a\u00020 \u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\"\u0010#J\u001e\u0010\u0006\u001a\u00020\u00012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016J\u000f\u0010\u0007\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0004H\u0016J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u0010\u0010\u0011R(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0010X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028PX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0015¨\u0006$"}, mo44877d2 = {"Ls75;", "La56;", "Lkotlin/Function1;", "", "Lr37;", "readObserver", "v", "n", "()V", "d", "snapshot", "l", "(La56;)V", "m", "Lz86;", "state", "o", "(Lz86;)V", "g", "Lrc2;", "h", "()Lrc2;", "", "I", "snapshots", "", "i", "()Z", "readOnly", "j", "writeObserver", "id", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "<init>", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;Lrc2;)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: s75 */
/* compiled from: Snapshot.kt */
public final class s75 extends a56 {

    /* renamed from: g */
    public final rc2<Object, r37> f17515g;

    /* renamed from: h */
    public int f17516h = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s75(int i, SnapshotIdSet snapshotIdSet, rc2<Object, r37> rc2) {
        super(i, snapshotIdSet, (DefaultConstructorMarker) null);
        vx2.m53591g(snapshotIdSet, "invalid");
        this.f17515g = rc2;
    }

    /* renamed from: d */
    public void mo41d() {
        if (!mo42e()) {
            mo50m(this);
            super.mo41d();
        }
    }

    /* renamed from: h */
    public rc2<Object, r37> mo45h() {
        return this.f17515g;
    }

    /* renamed from: i */
    public boolean mo46i() {
        return true;
    }

    /* renamed from: j */
    public rc2<Object, r37> mo47j() {
        return null;
    }

    /* renamed from: l */
    public void mo49l(a56 a56) {
        vx2.m53591g(a56, "snapshot");
        this.f17516h++;
    }

    /* renamed from: m */
    public void mo50m(a56 a56) {
        vx2.m53591g(a56, "snapshot");
        int i = this.f17516h - 1;
        this.f17516h = i;
        if (i == 0) {
            mo39b();
        }
    }

    /* renamed from: n */
    public void mo51n() {
    }

    /* renamed from: o */
    public void mo52o(z86 z86) {
        vx2.m53591g(z86, "state");
        Void unused = SnapshotKt.m2232P();
        throw new KotlinNothingValueException();
    }

    /* renamed from: v */
    public a56 mo59v(rc2<Object, r37> rc2) {
        SnapshotKt.m2239W(this);
        return new NestedReadonlySnapshot(mo43f(), mo44g(), rc2, this);
    }
}
