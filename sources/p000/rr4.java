package p000;

import androidx.compose.p004ui.node.LayoutNode;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b!\u0010\"J0\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\f\u001a\u00020\u000bR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006#"}, mo44877d2 = {"Lrr4;", "", "Lpr4;", "pointerEvent", "Llt4;", "positionCalculator", "", "isInBounds", "Lpv4;", "a", "(Lpr4;Llt4;Z)I", "Lr37;", "b", "Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/LayoutNode;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "root", "Ldm2;", "Ldm2;", "hitPathTracker", "Lor4;", "c", "Lor4;", "pointerInputChangeEventProducer", "Lem2;", "Lvr4;", "d", "Lem2;", "hitResult", "e", "Z", "isProcessing", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: rr4 */
/* compiled from: PointerInputEventProcessor.kt */
public final class rr4 {

    /* renamed from: a */
    public final LayoutNode f17352a;

    /* renamed from: b */
    public final dm2 f17353b;

    /* renamed from: c */
    public final or4 f17354c = new or4();

    /* renamed from: d */
    public final em2<vr4> f17355d = new em2<>();

    /* renamed from: e */
    public boolean f17356e;

    public rr4(LayoutNode layoutNode) {
        vx2.m53591g(layoutNode, "root");
        this.f17352a = layoutNode;
        this.f17353b = new dm2(layoutNode.mo3445c());
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0059 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo25522a(p000.pr4 r18, p000.lt4 r19, boolean r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            java.lang.String r3 = "pointerEvent"
            p000.vx2.m53591g(r0, r3)
            java.lang.String r3 = "positionCalculator"
            p000.vx2.m53591g(r2, r3)
            boolean r3 = r1.f17356e
            r4 = 0
            if (r3 == 0) goto L_0x001a
            int r0 = p000.sr4.m27083a(r4, r4)
            return r0
        L_0x001a:
            r3 = 1
            r1.f17356e = r3     // Catch:{ all -> 0x0107 }
            or4 r5 = r1.f17354c     // Catch:{ all -> 0x0107 }
            ox2 r0 = r5.mo24087b(r0, r2)     // Catch:{ all -> 0x0107 }
            java.util.Map r2 = r0.mo24266a()     // Catch:{ all -> 0x0107 }
            java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x0107 }
            boolean r5 = r2 instanceof java.util.Collection     // Catch:{ all -> 0x0107 }
            if (r5 == 0) goto L_0x0037
            boolean r5 = r2.isEmpty()     // Catch:{ all -> 0x0107 }
            if (r5 == 0) goto L_0x0037
        L_0x0035:
            r2 = r4
            goto L_0x005a
        L_0x0037:
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0107 }
        L_0x003b:
            boolean r5 = r2.hasNext()     // Catch:{ all -> 0x0107 }
            if (r5 == 0) goto L_0x0035
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x0107 }
            nr4 r5 = (p000.nr4) r5     // Catch:{ all -> 0x0107 }
            boolean r6 = r5.mo23788f()     // Catch:{ all -> 0x0107 }
            if (r6 != 0) goto L_0x0056
            boolean r5 = r5.mo23791i()     // Catch:{ all -> 0x0107 }
            if (r5 == 0) goto L_0x0054
            goto L_0x0056
        L_0x0054:
            r5 = r4
            goto L_0x0057
        L_0x0056:
            r5 = r3
        L_0x0057:
            if (r5 == 0) goto L_0x003b
            r2 = r3
        L_0x005a:
            if (r2 != 0) goto L_0x005e
            r2 = r3
            goto L_0x005f
        L_0x005e:
            r2 = r4
        L_0x005f:
            java.util.Map r5 = r0.mo24266a()     // Catch:{ all -> 0x0107 }
            java.util.Collection r5 = r5.values()     // Catch:{ all -> 0x0107 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0107 }
        L_0x006b:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0107 }
            if (r6 == 0) goto L_0x00b7
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0107 }
            nr4 r6 = (p000.nr4) r6     // Catch:{ all -> 0x0107 }
            if (r2 != 0) goto L_0x007f
            boolean r7 = p000.gr4.m18367a(r6)     // Catch:{ all -> 0x0107 }
            if (r7 == 0) goto L_0x006b
        L_0x007f:
            int r7 = r6.mo23792j()     // Catch:{ all -> 0x0107 }
            yr4$a r8 = p000.yr4.f20321a     // Catch:{ all -> 0x0107 }
            int r8 = r8.mo28199d()     // Catch:{ all -> 0x0107 }
            boolean r13 = p000.yr4.m30764g(r7, r8)     // Catch:{ all -> 0x0107 }
            androidx.compose.ui.node.LayoutNode r9 = r1.f17352a     // Catch:{ all -> 0x0107 }
            long r10 = r6.mo23787e()     // Catch:{ all -> 0x0107 }
            em2<vr4> r12 = r1.f17355d     // Catch:{ all -> 0x0107 }
            r14 = 0
            r15 = 8
            r16 = 0
            androidx.compose.p004ui.node.LayoutNode.m2544d0(r9, r10, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0107 }
            em2<vr4> r7 = r1.f17355d     // Catch:{ all -> 0x0107 }
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x0107 }
            r7 = r7 ^ r3
            if (r7 == 0) goto L_0x006b
            dm2 r7 = r1.f17353b     // Catch:{ all -> 0x0107 }
            long r8 = r6.mo23786d()     // Catch:{ all -> 0x0107 }
            em2<vr4> r6 = r1.f17355d     // Catch:{ all -> 0x0107 }
            r7.mo18838a(r8, r6)     // Catch:{ all -> 0x0107 }
            em2<vr4> r6 = r1.f17355d     // Catch:{ all -> 0x0107 }
            r6.clear()     // Catch:{ all -> 0x0107 }
            goto L_0x006b
        L_0x00b7:
            dm2 r2 = r1.f17353b     // Catch:{ all -> 0x0107 }
            r2.mo18841d()     // Catch:{ all -> 0x0107 }
            dm2 r2 = r1.f17353b     // Catch:{ all -> 0x0107 }
            r5 = r20
            boolean r2 = r2.mo18839b(r0, r5)     // Catch:{ all -> 0x0107 }
            boolean r5 = r0.mo24268c()     // Catch:{ all -> 0x0107 }
            if (r5 == 0) goto L_0x00cc
        L_0x00ca:
            r3 = r4
            goto L_0x0100
        L_0x00cc:
            java.util.Map r0 = r0.mo24266a()     // Catch:{ all -> 0x0107 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0107 }
            boolean r5 = r0 instanceof java.util.Collection     // Catch:{ all -> 0x0107 }
            if (r5 == 0) goto L_0x00df
            boolean r5 = r0.isEmpty()     // Catch:{ all -> 0x0107 }
            if (r5 == 0) goto L_0x00df
            goto L_0x00ca
        L_0x00df:
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0107 }
        L_0x00e3:
            boolean r5 = r0.hasNext()     // Catch:{ all -> 0x0107 }
            if (r5 == 0) goto L_0x00ca
            java.lang.Object r5 = r0.next()     // Catch:{ all -> 0x0107 }
            nr4 r5 = (p000.nr4) r5     // Catch:{ all -> 0x0107 }
            boolean r6 = p000.gr4.m18371e(r5)     // Catch:{ all -> 0x0107 }
            if (r6 == 0) goto L_0x00fd
            boolean r5 = r5.mo23793k()     // Catch:{ all -> 0x0107 }
            if (r5 == 0) goto L_0x00fd
            r5 = r3
            goto L_0x00fe
        L_0x00fd:
            r5 = r4
        L_0x00fe:
            if (r5 == 0) goto L_0x00e3
        L_0x0100:
            int r0 = p000.sr4.m27083a(r2, r3)     // Catch:{ all -> 0x0107 }
            r1.f17356e = r4
            return r0
        L_0x0107:
            r0 = move-exception
            r1.f17356e = r4
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.rr4.mo25522a(pr4, lt4, boolean):int");
    }

    /* renamed from: b */
    public final void mo25523b() {
        if (!this.f17356e) {
            this.f17354c.mo24086a();
            this.f17353b.mo18840c();
        }
    }
}
