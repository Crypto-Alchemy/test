package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\u0007J\u0006\u0010\u0010\u001a\u00020\u0007R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00148\u0000X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, mo44877d2 = {"Ldm2;", "", "Lmr4;", "pointerId", "", "Lvr4;", "pointerInputNodes", "Lr37;", "a", "(JLjava/util/List;)V", "Lox2;", "internalPointerEvent", "", "isInBounds", "b", "c", "d", "Lme3;", "Lme3;", "rootCoordinates", "Lf84;", "Lf84;", "getRoot$ui_release", "()Lf84;", "root", "<init>", "(Lme3;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: dm2 */
/* compiled from: HitPathTracker.kt */
public final class dm2 {

    /* renamed from: a */
    public final me3 f10784a;

    /* renamed from: b */
    public final f84 f10785b = new f84();

    public dm2(me3 me3) {
        vx2.m53591g(me3, "rootCoordinates");
        this.f10784a = me3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18838a(long r12, java.util.List<? extends p000.vr4> r14) {
        /*
            r11 = this;
            java.lang.String r0 = "pointerInputNodes"
            p000.vx2.m53591g(r14, r0)
            f84 r0 = r11.f10785b
            int r1 = r14.size()
            r2 = 0
            r3 = 1
            r4 = r2
        L_0x000e:
            if (r4 >= r1) goto L_0x007f
            java.lang.Object r5 = r14.get(r4)
            vr4 r5 = (p000.vr4) r5
            if (r3 == 0) goto L_0x0064
            v04 r6 = r0.mo19726g()
            int r7 = r6.mo26963n()
            if (r7 <= 0) goto L_0x0040
            java.lang.Object[] r6 = r6.mo26962m()
            java.lang.String r8 = "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>"
            p000.vx2.m53589e(r6, r8)
            r8 = r2
        L_0x002c:
            r9 = r6[r8]
            r10 = r9
            y74 r10 = (p000.y74) r10
            vr4 r10 = r10.mo27980k()
            boolean r10 = p000.vx2.m53586b(r10, r5)
            if (r10 == 0) goto L_0x003c
            goto L_0x0041
        L_0x003c:
            int r8 = r8 + 1
            if (r8 < r7) goto L_0x002c
        L_0x0040:
            r9 = 0
        L_0x0041:
            y74 r9 = (p000.y74) r9
            if (r9 == 0) goto L_0x0063
            r9.mo27982m()
            v04 r0 = r9.mo27979j()
            mr4 r5 = p000.mr4.m22620a(r12)
            boolean r0 = r0.mo26959j(r5)
            if (r0 != 0) goto L_0x0061
            v04 r0 = r9.mo27979j()
            mr4 r5 = p000.mr4.m22620a(r12)
            r0.mo26953c(r5)
        L_0x0061:
            r0 = r9
            goto L_0x007c
        L_0x0063:
            r3 = r2
        L_0x0064:
            y74 r6 = new y74
            r6.<init>(r5)
            v04 r5 = r6.mo27979j()
            mr4 r7 = p000.mr4.m22620a(r12)
            r5.mo26953c(r7)
            v04 r0 = r0.mo19726g()
            r0.mo26953c(r6)
            r0 = r6
        L_0x007c:
            int r4 = r4 + 1
            goto L_0x000e
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dm2.mo18838a(long, java.util.List):void");
    }

    /* renamed from: b */
    public final boolean mo18839b(ox2 ox2, boolean z) {
        vx2.m53591g(ox2, "internalPointerEvent");
        if (!this.f10785b.mo19720a(ox2.mo24266a(), this.f10784a, ox2, z)) {
            return false;
        }
        boolean f = this.f10785b.mo19725f(ox2.mo24266a(), this.f10784a, ox2, z);
        if (this.f10785b.mo19724e(ox2) || f) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo18840c() {
        this.f10785b.mo19723d();
        this.f10785b.mo19722c();
    }

    /* renamed from: d */
    public final void mo18841d() {
        this.f10785b.mo19727h();
    }
}
