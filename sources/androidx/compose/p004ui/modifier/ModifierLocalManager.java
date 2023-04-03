package androidx.compose.p004ui.modifier;

import androidx.compose.p004ui.node.BackwardsCompatNode;
import androidx.compose.p004ui.node.LayoutNode;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.Pair;
import org.web3j.ens.contracts.generated.ENS;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010 J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u001a\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007J\u001a\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007J\u001a\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007J*\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\f2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0002R\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R*\u0010\u0018\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00160\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R*\u0010\u0019\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00160\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R*\u0010\u001b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00160\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u001d¨\u0006!"}, mo44877d2 = {"Landroidx/compose/ui/modifier/ModifierLocalManager;", "", "Lr37;", "b", "e", "Landroidx/compose/ui/node/BackwardsCompatNode;", "node", "Luw3;", "key", "f", "a", "d", "Lsw3$c;", "", "set", "c", "Lnj4;", "Lnj4;", "getOwner", "()Lnj4;", "owner", "Lv04;", "Lkotlin/Pair;", "Lv04;", "inserted", "updated", "Landroidx/compose/ui/node/LayoutNode;", "removed", "", "Z", "invalidated", "<init>", "(Lnj4;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.modifier.ModifierLocalManager */
/* compiled from: ModifierLocalManager.kt */
public final class ModifierLocalManager {

    /* renamed from: a */
    public final nj4 f1711a;

    /* renamed from: b */
    public final v04<Pair<BackwardsCompatNode, uw3<?>>> f1712b = new v04<>(new Pair[16], 0);

    /* renamed from: c */
    public final v04<Pair<BackwardsCompatNode, uw3<?>>> f1713c = new v04<>(new Pair[16], 0);

    /* renamed from: d */
    public final v04<Pair<LayoutNode, uw3<?>>> f1714d = new v04<>(new Pair[16], 0);

    /* renamed from: e */
    public boolean f1715e;

    public ModifierLocalManager(nj4 nj4) {
        vx2.m53591g(nj4, ENS.FUNC_OWNER);
        this.f1711a = nj4;
    }

    /* renamed from: a */
    public final void mo3324a(BackwardsCompatNode backwardsCompatNode, uw3<?> uw3) {
        vx2.m53591g(backwardsCompatNode, "node");
        vx2.m53591g(uw3, "key");
        this.f1712b.mo26953c(wy6.m54142a(backwardsCompatNode, uw3));
        mo3325b();
    }

    /* renamed from: b */
    public final void mo3325b() {
        if (!this.f1715e) {
            this.f1715e = true;
            this.f1711a.mo3777o(new ModifierLocalManager$invalidate$1(this));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x002f A[EDGE_INSN: B:35:0x002f->B:33:0x002f ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0085 A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3326c(p000.sw3.C3310c r9, p000.uw3<?> r10, java.util.Set<androidx.compose.p004ui.node.BackwardsCompatNode> r11) {
        /*
            r8 = this;
            g84 r0 = p000.g84.f12195a
            int r0 = r0.mo20431g()
            sw3$c r1 = r9.mo23638l()
            boolean r1 = r1.mo25990y()
            if (r1 == 0) goto L_0x008f
            r1 = 16
            v04 r2 = new v04
            sw3$c[] r1 = new p000.sw3.C3310c[r1]
            r3 = 0
            r2.<init>(r1, r3)
            sw3$c r1 = r9.mo23638l()
            sw3$c r1 = r1.mo25986u()
            if (r1 != 0) goto L_0x002c
            sw3$c r9 = r9.mo23638l()
            p000.ob1.m23740b(r2, r9)
            goto L_0x002f
        L_0x002c:
            r2.mo26953c(r1)
        L_0x002f:
            boolean r9 = r2.mo26966r()
            if (r9 == 0) goto L_0x008e
            int r9 = r2.mo26963n()
            r1 = 1
            int r9 = r9 - r1
            java.lang.Object r9 = r2.mo26971x(r9)
            sw3$c r9 = (p000.sw3.C3310c) r9
            int r4 = r9.mo25985t()
            r4 = r4 & r0
            if (r4 == 0) goto L_0x008a
            r4 = r9
        L_0x0049:
            if (r4 == 0) goto L_0x008a
            int r5 = r4.mo25988w()
            r5 = r5 & r0
            if (r5 == 0) goto L_0x0085
            boolean r5 = r4 instanceof p000.yw3
            if (r5 == 0) goto L_0x0082
            r5 = r4
            yw3 r5 = (p000.yw3) r5
            boolean r6 = r5 instanceof androidx.compose.p004ui.node.BackwardsCompatNode
            if (r6 == 0) goto L_0x0075
            r6 = r5
            androidx.compose.ui.node.BackwardsCompatNode r6 = (androidx.compose.p004ui.node.BackwardsCompatNode) r6
            sw3$b r7 = r6.mo3351J()
            boolean r7 = r7 instanceof p000.vw3
            if (r7 == 0) goto L_0x0075
            java.util.HashSet r6 = r6.mo3352K()
            boolean r6 = r6.contains(r10)
            if (r6 == 0) goto L_0x0075
            r11.add(r5)
        L_0x0075:
            xw3 r5 = r5.mo3370j()
            boolean r5 = r5.mo11920a(r10)
            if (r5 != 0) goto L_0x0080
            goto L_0x0082
        L_0x0080:
            r5 = r3
            goto L_0x0083
        L_0x0082:
            r5 = r1
        L_0x0083:
            if (r5 == 0) goto L_0x002f
        L_0x0085:
            sw3$c r4 = r4.mo25986u()
            goto L_0x0049
        L_0x008a:
            p000.ob1.m23740b(r2, r9)
            goto L_0x002f
        L_0x008e:
            return
        L_0x008f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Check failed."
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.modifier.ModifierLocalManager.mo3326c(sw3$c, uw3, java.util.Set):void");
    }

    /* renamed from: d */
    public final void mo3327d(BackwardsCompatNode backwardsCompatNode, uw3<?> uw3) {
        vx2.m53591g(backwardsCompatNode, "node");
        vx2.m53591g(uw3, "key");
        this.f1714d.mo26953c(wy6.m54142a(ob1.m23744f(backwardsCompatNode), uw3));
        mo3325b();
    }

    /* renamed from: e */
    public final void mo3328e() {
        int i = 0;
        this.f1715e = false;
        HashSet<BackwardsCompatNode> hashSet = new HashSet<>();
        v04<Pair<LayoutNode, uw3<?>>> v04 = this.f1714d;
        int n = v04.mo26963n();
        if (n > 0) {
            Object[] m = v04.mo26962m();
            vx2.m53589e(m, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i2 = 0;
            do {
                Pair pair = (Pair) m[i2];
                LayoutNode layoutNode = (LayoutNode) pair.component1();
                uw3 uw3 = (uw3) pair.component2();
                if (layoutNode.mo3459l0()) {
                    mo3326c(layoutNode.mo3424S().mo28349l(), uw3, hashSet);
                }
                i2++;
            } while (i2 < n);
        }
        this.f1714d.mo26958i();
        v04<Pair<BackwardsCompatNode, uw3<?>>> v042 = this.f1712b;
        int n2 = v042.mo26963n();
        if (n2 > 0) {
            Object[] m2 = v042.mo26962m();
            vx2.m53589e(m2, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i3 = 0;
            do {
                Pair pair2 = (Pair) m2[i3];
                BackwardsCompatNode backwardsCompatNode = (BackwardsCompatNode) pair2.component1();
                uw3 uw32 = (uw3) pair2.component2();
                if (backwardsCompatNode.mo25990y()) {
                    mo3326c(backwardsCompatNode, uw32, hashSet);
                }
                i3++;
            } while (i3 < n2);
        }
        this.f1712b.mo26958i();
        v04<Pair<BackwardsCompatNode, uw3<?>>> v043 = this.f1713c;
        int n3 = v043.mo26963n();
        if (n3 > 0) {
            Object[] m3 = v043.mo26962m();
            vx2.m53589e(m3, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                Pair pair3 = (Pair) m3[i];
                BackwardsCompatNode backwardsCompatNode2 = (BackwardsCompatNode) pair3.component1();
                uw3 uw33 = (uw3) pair3.component2();
                if (backwardsCompatNode2.mo25990y()) {
                    mo3326c(backwardsCompatNode2, uw33, hashSet);
                }
                i++;
            } while (i < n3);
        }
        this.f1713c.mo26958i();
        for (BackwardsCompatNode R : hashSet) {
            R.mo3359R();
        }
    }

    /* renamed from: f */
    public final void mo3329f(BackwardsCompatNode backwardsCompatNode, uw3<?> uw3) {
        vx2.m53591g(backwardsCompatNode, "node");
        vx2.m53591g(uw3, "key");
        this.f1713c.mo26953c(wy6.m54142a(backwardsCompatNode, uw3));
        mo3325b();
    }
}
