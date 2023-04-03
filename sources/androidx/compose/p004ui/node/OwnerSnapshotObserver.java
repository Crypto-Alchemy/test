package androidx.compose.p004ui.node;

import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010%\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00070\u0010¢\u0006\u0004\b&\u0010'J/\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\nJ/\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\f\u0010\nJC\u0010\u0012\u001a\u00020\u0007\"\b\b\u0000\u0010\u000e*\u00020\r2\u0006\u0010\u000f\u001a\u00028\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00102\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0017\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001bR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010\u001bR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001bR \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001b¨\u0006("}, mo44877d2 = {"Landroidx/compose/ui/node/OwnerSnapshotObserver;", "", "Landroidx/compose/ui/node/LayoutNode;", "node", "", "affectsLookahead", "Lkotlin/Function0;", "Lr37;", "block", "d", "(Landroidx/compose/ui/node/LayoutNode;ZLpc2;)V", "b", "f", "Loj4;", "T", "target", "Lkotlin/Function1;", "onChanged", "h", "(Loj4;Lrc2;Lpc2;)V", "a", "()V", "i", "j", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "observer", "Lrc2;", "onCommitAffectingLookaheadMeasure", "c", "onCommitAffectingMeasure", "onCommitAffectingLayout", "e", "onCommitAffectingLayoutModifier", "onCommitAffectingLayoutModifierInLookahead", "g", "onCommitAffectingLookaheadLayout", "onChangedExecutor", "<init>", "(Lrc2;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.node.OwnerSnapshotObserver */
/* compiled from: OwnerSnapshotObserver.kt */
public final class OwnerSnapshotObserver {

    /* renamed from: a */
    public final SnapshotStateObserver f1854a;

    /* renamed from: b */
    public final rc2<LayoutNode, r37> f1855b = OwnerSnapshotObserver$onCommitAffectingLookaheadMeasure$1.INSTANCE;

    /* renamed from: c */
    public final rc2<LayoutNode, r37> f1856c = OwnerSnapshotObserver$onCommitAffectingMeasure$1.INSTANCE;

    /* renamed from: d */
    public final rc2<LayoutNode, r37> f1857d = OwnerSnapshotObserver$onCommitAffectingLayout$1.INSTANCE;

    /* renamed from: e */
    public final rc2<LayoutNode, r37> f1858e = OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1.INSTANCE;

    /* renamed from: f */
    public final rc2<LayoutNode, r37> f1859f = C0394x82674389.INSTANCE;

    /* renamed from: g */
    public final rc2<LayoutNode, r37> f1860g = OwnerSnapshotObserver$onCommitAffectingLookaheadLayout$1.INSTANCE;

    public OwnerSnapshotObserver(rc2<? super pc2<r37>, r37> rc2) {
        vx2.m53591g(rc2, "onChangedExecutor");
        this.f1854a = new SnapshotStateObserver(rc2);
    }

    /* renamed from: c */
    public static /* synthetic */ void m2849c(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z, pc2 pc2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        ownerSnapshotObserver.mo3654b(layoutNode, z, pc2);
    }

    /* renamed from: e */
    public static /* synthetic */ void m2850e(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z, pc2 pc2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        ownerSnapshotObserver.mo3655d(layoutNode, z, pc2);
    }

    /* renamed from: g */
    public static /* synthetic */ void m2851g(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z, pc2 pc2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        ownerSnapshotObserver.mo3656f(layoutNode, z, pc2);
    }

    /* renamed from: a */
    public final void mo3653a() {
        this.f1854a.mo3173g(OwnerSnapshotObserver$clearInvalidObservations$1.INSTANCE);
    }

    /* renamed from: b */
    public final void mo3654b(LayoutNode layoutNode, boolean z, pc2<r37> pc2) {
        vx2.m53591g(layoutNode, "node");
        vx2.m53591g(pc2, "block");
        if (!z || layoutNode.mo3411K() == null) {
            mo3657h(layoutNode, this.f1858e, pc2);
        } else {
            mo3657h(layoutNode, this.f1859f, pc2);
        }
    }

    /* renamed from: d */
    public final void mo3655d(LayoutNode layoutNode, boolean z, pc2<r37> pc2) {
        vx2.m53591g(layoutNode, "node");
        vx2.m53591g(pc2, "block");
        if (!z || layoutNode.mo3411K() == null) {
            mo3657h(layoutNode, this.f1857d, pc2);
        } else {
            mo3657h(layoutNode, this.f1860g, pc2);
        }
    }

    /* renamed from: f */
    public final void mo3656f(LayoutNode layoutNode, boolean z, pc2<r37> pc2) {
        vx2.m53591g(layoutNode, "node");
        vx2.m53591g(pc2, "block");
        if (!z || layoutNode.mo3411K() == null) {
            mo3657h(layoutNode, this.f1856c, pc2);
        } else {
            mo3657h(layoutNode, this.f1855b, pc2);
        }
    }

    /* renamed from: h */
    public final <T extends oj4> void mo3657h(T t, rc2<? super T, r37> rc2, pc2<r37> pc2) {
        vx2.m53591g(t, "target");
        vx2.m53591g(rc2, "onChanged");
        vx2.m53591g(pc2, "block");
        this.f1854a.mo3175i(t, rc2, pc2);
    }

    /* renamed from: i */
    public final void mo3658i() {
        this.f1854a.mo3176j();
    }

    /* renamed from: j */
    public final void mo3659j() {
        this.f1854a.mo3177k();
        this.f1854a.mo3172f();
    }
}
