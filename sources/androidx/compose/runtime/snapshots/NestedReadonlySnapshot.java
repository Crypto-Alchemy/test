package androidx.compose.runtime.snapshots;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0001¢\u0006\u0004\b%\u0010&J\u001e\u0010\u0006\u001a\u00020\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016J\u000f\u0010\u0007\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0004H\u0016J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0010¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0010X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\"\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028PX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001a¨\u0006'"}, mo44877d2 = {"Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;", "La56;", "Lkotlin/Function1;", "", "Lr37;", "readObserver", "B", "n", "()V", "d", "Lz86;", "state", "", "A", "(Lz86;)Ljava/lang/Void;", "snapshot", "z", "(La56;)Ljava/lang/Void;", "y", "g", "La56;", "getParent", "()La56;", "parent", "h", "Lrc2;", "()Lrc2;", "", "i", "()Z", "readOnly", "j", "writeObserver", "", "id", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "<init>", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;Lrc2;La56;)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: Snapshot.kt */
public final class NestedReadonlySnapshot extends a56 {

    /* renamed from: g */
    public final a56 f1574g;

    /* renamed from: h */
    public final rc2<Object, r37> f1575h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NestedReadonlySnapshot(int i, SnapshotIdSet snapshotIdSet, rc2<Object, r37> rc2, a56 a56) {
        super(i, snapshotIdSet, (DefaultConstructorMarker) null);
        vx2.m53591g(snapshotIdSet, "invalid");
        vx2.m53591g(a56, "parent");
        this.f1574g = a56;
        a56.mo49l(this);
        if (rc2 != null) {
            rc2<Object, r37> h = a56.mo45h();
            if (h != null) {
                rc2 = new NestedReadonlySnapshot$readObserver$1$1$1(rc2, h);
            }
        } else {
            rc2 = a56.mo45h();
        }
        this.f1575h = rc2;
    }

    /* renamed from: A */
    public Void mo52o(z86 z86) {
        vx2.m53591g(z86, "state");
        Void unused = SnapshotKt.m2232P();
        throw new KotlinNothingValueException();
    }

    /* renamed from: B */
    public NestedReadonlySnapshot mo59v(rc2<Object, r37> rc2) {
        return new NestedReadonlySnapshot(mo43f(), mo44g(), rc2, this.f1574g);
    }

    /* renamed from: d */
    public void mo41d() {
        if (!mo42e()) {
            if (mo43f() != this.f1574g.mo43f()) {
                mo39b();
            }
            this.f1574g.mo50m(this);
            super.mo41d();
        }
    }

    /* renamed from: h */
    public rc2<Object, r37> mo45h() {
        return this.f1575h;
    }

    /* renamed from: i */
    public boolean mo46i() {
        return true;
    }

    /* renamed from: j */
    public rc2<Object, r37> mo47j() {
        return null;
    }

    /* renamed from: n */
    public void mo51n() {
    }

    /* renamed from: y */
    public Void mo49l(a56 a56) {
        vx2.m53591g(a56, "snapshot");
        m56.m22026a();
        throw new KotlinNothingValueException();
    }

    /* renamed from: z */
    public Void mo50m(a56 a56) {
        vx2.m53591g(a56, "snapshot");
        m56.m22026a();
        throw new KotlinNothingValueException();
    }
}
