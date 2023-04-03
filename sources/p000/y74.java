package p000;

import androidx.compose.p004ui.input.pointer.PointerEventPass;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u001a¢\u0006\u0004\b2\u00103J7\u0010\f\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J7\u0010\u000e\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0006\u0010\u0011\u001a\u00020\u000fJ\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u001a\u0010\u0018\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u000fH\u0002R\u0017\u0010\u001e\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R#\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040%8\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0010\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010(R\u0018\u0010+\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010*R\u0016\u0010.\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00100\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u0010-R\u0016\u00101\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010-\u0002\u0004\n\u0002\b\u0019¨\u00064"}, mo44877d2 = {"Ly74;", "Lf84;", "", "Lmr4;", "Lnr4;", "changes", "Lme3;", "parentCoordinates", "Lox2;", "internalPointerEvent", "", "isInBounds", "f", "e", "a", "Lr37;", "d", "m", "b", "", "toString", "Lfr4;", "oldEvent", "newEvent", "l", "i", "Lvr4;", "Lvr4;", "k", "()Lvr4;", "pointerInputNode", "Lv04;", "c", "Lv04;", "j", "()Lv04;", "pointerIds", "", "Ljava/util/Map;", "relevantChanges", "Lme3;", "coordinates", "Lfr4;", "pointerEvent", "g", "Z", "wasIn", "h", "isIn", "hasExited", "<init>", "(Lvr4;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: y74 */
/* compiled from: HitPathTracker.kt */
public final class y74 extends f84 {

    /* renamed from: b */
    public final vr4 f20064b;

    /* renamed from: c */
    public final v04<mr4> f20065c = new v04<>(new mr4[16], 0);

    /* renamed from: d */
    public final Map<mr4, nr4> f20066d = new LinkedHashMap();

    /* renamed from: e */
    public me3 f20067e;

    /* renamed from: f */
    public fr4 f20068f;

    /* renamed from: g */
    public boolean f20069g;

    /* renamed from: h */
    public boolean f20070h = true;

    /* renamed from: i */
    public boolean f20071i = true;

    public y74(vr4 vr4) {
        vx2.m53591g(vr4, "pointerInputNode");
        this.f20064b = vr4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01da  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo19720a(java.util.Map<p000.mr4, p000.nr4> r31, p000.me3 r32, p000.ox2 r33, boolean r34) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r33
            java.lang.String r4 = "changes"
            p000.vx2.m53591g(r1, r4)
            java.lang.String r4 = "parentCoordinates"
            p000.vx2.m53591g(r2, r4)
            java.lang.String r4 = "internalPointerEvent"
            p000.vx2.m53591g(r3, r4)
            boolean r4 = super.mo19720a(r31, r32, r33, r34)
            vr4 r5 = r0.f20064b
            boolean r5 = p000.wr4.m29691b(r5)
            r6 = 1
            if (r5 != 0) goto L_0x0025
            return r6
        L_0x0025:
            vr4 r5 = r0.f20064b
            me3 r5 = p000.wr4.m29690a(r5)
            r0.f20067e = r5
            java.util.Set r5 = r31.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0035:
            boolean r7 = r5.hasNext()
            r8 = 0
            if (r7 == 0) goto L_0x00da
            java.lang.Object r7 = r5.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r9 = r7.getKey()
            mr4 r9 = (p000.mr4) r9
            long r9 = r9.mo23380g()
            java.lang.Object r7 = r7.getValue()
            r11 = r7
            nr4 r11 = (p000.nr4) r11
            v04<mr4> r7 = r0.f20065c
            mr4 r12 = p000.mr4.m22620a(r9)
            boolean r7 = r7.mo26959j(r12)
            if (r7 == 0) goto L_0x0035
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.List r12 = r11.mo23785c()
            int r13 = r12.size()
        L_0x006c:
            if (r8 >= r13) goto L_0x009c
            java.lang.Object r14 = r12.get(r8)
            cm2 r14 = (p000.cm2) r14
            cm2 r15 = new cm2
            long r16 = r14.mo12111b()
            me3 r6 = r0.f20067e
            p000.vx2.m53588d(r6)
            r21 = r12
            r22 = r13
            long r12 = r14.mo12110a()
            long r18 = r6.mo3620m(r2, r12)
            r20 = 0
            r6 = r15
            r15.<init>(r16, r18, r20)
            r7.add(r6)
            int r8 = r8 + 1
            r12 = r21
            r13 = r22
            r6 = 1
            goto L_0x006c
        L_0x009c:
            java.util.Map<mr4, nr4> r6 = r0.f20066d
            mr4 r8 = p000.mr4.m22620a(r9)
            me3 r9 = r0.f20067e
            p000.vx2.m53588d(r9)
            long r12 = r11.mo23790h()
            long r21 = r9.mo3620m(r2, r12)
            me3 r9 = r0.f20067e
            p000.vx2.m53588d(r9)
            long r12 = r11.mo23787e()
            long r16 = r9.mo3620m(r2, r12)
            r12 = 0
            r14 = 0
            r18 = 0
            r19 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r28 = 731(0x2db, float:1.024E-42)
            r29 = 0
            r25 = r7
            nr4 r7 = p000.nr4.m23438b(r11, r12, r14, r16, r18, r19, r21, r23, r24, r25, r26, r28, r29)
            r6.put(r8, r7)
            r6 = 1
            goto L_0x0035
        L_0x00da:
            java.util.Map<mr4, nr4> r2 = r0.f20066d
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x00f0
            v04<mr4> r1 = r0.f20065c
            r1.mo26958i()
            v04 r1 = r30.mo19726g()
            r1.mo26958i()
            r2 = 1
            return r2
        L_0x00f0:
            r2 = 1
            v04<mr4> r5 = r0.f20065c
            int r5 = r5.mo26963n()
            int r5 = r5 - r2
        L_0x00f8:
            r2 = -1
            if (r2 >= r5) goto L_0x011b
            v04<mr4> r2 = r0.f20065c
            java.lang.Object[] r2 = r2.mo26962m()
            r2 = r2[r5]
            mr4 r2 = (p000.mr4) r2
            long r6 = r2.mo23380g()
            mr4 r2 = p000.mr4.m22620a(r6)
            boolean r2 = r1.containsKey(r2)
            if (r2 != 0) goto L_0x0118
            v04<mr4> r2 = r0.f20065c
            r2.mo26971x(r5)
        L_0x0118:
            int r5 = r5 + -1
            goto L_0x00f8
        L_0x011b:
            fr4 r1 = new fr4
            java.util.Map<mr4, nr4> r2 = r0.f20066d
            java.util.Collection r2 = r2.values()
            java.util.List r2 = kotlin.collections.CollectionsKt___CollectionsKt.m47311K0(r2)
            r1.<init>(r2, r3)
            java.util.List r2 = r1.mo20069b()
            int r5 = r2.size()
            r6 = r8
        L_0x0133:
            if (r6 >= r5) goto L_0x014a
            java.lang.Object r7 = r2.get(r6)
            r9 = r7
            nr4 r9 = (p000.nr4) r9
            long r9 = r9.mo23786d()
            boolean r9 = r3.mo24269d(r9)
            if (r9 == 0) goto L_0x0147
            goto L_0x014b
        L_0x0147:
            int r6 = r6 + 1
            goto L_0x0133
        L_0x014a:
            r7 = 0
        L_0x014b:
            nr4 r7 = (p000.nr4) r7
            if (r7 == 0) goto L_0x01fa
            if (r34 != 0) goto L_0x0154
            r0.f20070h = r8
            goto L_0x0176
        L_0x0154:
            boolean r2 = r0.f20070h
            if (r2 != 0) goto L_0x0176
            boolean r2 = r7.mo23788f()
            if (r2 != 0) goto L_0x0164
            boolean r2 = r7.mo23791i()
            if (r2 == 0) goto L_0x0176
        L_0x0164:
            me3 r2 = r0.f20067e
            p000.vx2.m53588d(r2)
            long r2 = r2.mo3611g()
            boolean r2 = p000.gr4.m18369c(r7, r2)
            r3 = 1
            r2 = r2 ^ r3
            r0.f20070h = r2
            goto L_0x0177
        L_0x0176:
            r3 = 1
        L_0x0177:
            boolean r2 = r0.f20070h
            boolean r5 = r0.f20069g
            if (r2 == r5) goto L_0x01ba
            int r2 = r1.mo20071d()
            hr4$a r5 = p000.hr4.f13010a
            int r6 = r5.mo21348c()
            boolean r2 = p000.hr4.m19172i(r2, r6)
            if (r2 != 0) goto L_0x01a9
            int r2 = r1.mo20071d()
            int r6 = r5.mo21346a()
            boolean r2 = p000.hr4.m19172i(r2, r6)
            if (r2 != 0) goto L_0x01a9
            int r2 = r1.mo20071d()
            int r6 = r5.mo21347b()
            boolean r2 = p000.hr4.m19172i(r2, r6)
            if (r2 == 0) goto L_0x01ba
        L_0x01a9:
            boolean r2 = r0.f20070h
            if (r2 == 0) goto L_0x01b2
            int r2 = r5.mo21346a()
            goto L_0x01b6
        L_0x01b2:
            int r2 = r5.mo21347b()
        L_0x01b6:
            r1.mo20072e(r2)
            goto L_0x01fb
        L_0x01ba:
            int r2 = r1.mo20071d()
            hr4$a r5 = p000.hr4.f13010a
            int r6 = r5.mo21346a()
            boolean r2 = p000.hr4.m19172i(r2, r6)
            if (r2 == 0) goto L_0x01da
            boolean r2 = r0.f20069g
            if (r2 == 0) goto L_0x01da
            boolean r2 = r0.f20071i
            if (r2 != 0) goto L_0x01da
            int r2 = r5.mo21348c()
            r1.mo20072e(r2)
            goto L_0x01fb
        L_0x01da:
            int r2 = r1.mo20071d()
            int r6 = r5.mo21347b()
            boolean r2 = p000.hr4.m19172i(r2, r6)
            if (r2 == 0) goto L_0x01fb
            boolean r2 = r0.f20070h
            if (r2 == 0) goto L_0x01fb
            boolean r2 = r7.mo23788f()
            if (r2 == 0) goto L_0x01fb
            int r2 = r5.mo21348c()
            r1.mo20072e(r2)
            goto L_0x01fb
        L_0x01fa:
            r3 = 1
        L_0x01fb:
            if (r4 != 0) goto L_0x0218
            int r2 = r1.mo20071d()
            hr4$a r4 = p000.hr4.f13010a
            int r4 = r4.mo21348c()
            boolean r2 = p000.hr4.m19172i(r2, r4)
            if (r2 == 0) goto L_0x0218
            fr4 r2 = r0.f20068f
            boolean r2 = r0.mo27981l(r2, r1)
            if (r2 == 0) goto L_0x0216
            goto L_0x0218
        L_0x0216:
            r6 = r8
            goto L_0x0219
        L_0x0218:
            r6 = r3
        L_0x0219:
            r0.f20068f = r1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.y74.mo19720a(java.util.Map, me3, ox2, boolean):boolean");
    }

    /* renamed from: b */
    public void mo19721b(ox2 ox2) {
        boolean z;
        vx2.m53591g(ox2, "internalPointerEvent");
        super.mo19721b(ox2);
        fr4 fr4 = this.f20068f;
        if (fr4 != null) {
            this.f20069g = this.f20070h;
            List<nr4> b = fr4.mo20069b();
            int size = b.size();
            for (int i = 0; i < size; i++) {
                nr4 nr4 = b.get(i);
                if (nr4.mo23788f() || (ox2.mo24269d(nr4.mo23786d()) && this.f20070h)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    this.f20065c.mo26968t(mr4.m22620a(nr4.mo23786d()));
                }
            }
            this.f20070h = false;
            this.f20071i = hr4.m19172i(fr4.mo20071d(), hr4.f13010a.mo21347b());
        }
    }

    /* renamed from: d */
    public void mo19723d() {
        v04<y74> g = mo19726g();
        int n = g.mo26963n();
        if (n > 0) {
            int i = 0;
            Object[] m = g.mo26962m();
            vx2.m53589e(m, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                ((y74) m[i]).mo19723d();
                i++;
            } while (i < n);
        }
        this.f20064b.mo3373n();
    }

    /* renamed from: e */
    public boolean mo19724e(ox2 ox2) {
        v04<y74> g;
        int n;
        vx2.m53591g(ox2, "internalPointerEvent");
        boolean z = true;
        int i = 0;
        if (!this.f20066d.isEmpty() && wr4.m29691b(this.f20064b)) {
            fr4 fr4 = this.f20068f;
            vx2.m53588d(fr4);
            me3 me3 = this.f20067e;
            vx2.m53588d(me3);
            this.f20064b.mo3372m(fr4, PointerEventPass.Final, me3.mo3611g());
            if (wr4.m29691b(this.f20064b) && (n = g.mo26963n()) > 0) {
                Object[] m = (g = mo19726g()).mo26962m();
                vx2.m53589e(m, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                do {
                    ((y74) m[i]).mo19724e(ox2);
                    i++;
                } while (i < n);
            }
        } else {
            z = false;
        }
        mo19721b(ox2);
        mo27978i();
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0041, code lost:
        r3 = mo19726g();
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo19725f(java.util.Map<p000.mr4, p000.nr4> r9, p000.me3 r10, p000.ox2 r11, boolean r12) {
        /*
            r8 = this;
            java.lang.String r0 = "changes"
            p000.vx2.m53591g(r9, r0)
            java.lang.String r9 = "parentCoordinates"
            p000.vx2.m53591g(r10, r9)
            java.lang.String r9 = "internalPointerEvent"
            p000.vx2.m53591g(r11, r9)
            java.util.Map<mr4, nr4> r9 = r8.f20066d
            boolean r9 = r9.isEmpty()
            r10 = 1
            r0 = 0
            if (r9 == 0) goto L_0x001b
        L_0x0019:
            r10 = r0
            goto L_0x0074
        L_0x001b:
            vr4 r9 = r8.f20064b
            boolean r9 = p000.wr4.m29691b(r9)
            if (r9 != 0) goto L_0x0024
            goto L_0x0019
        L_0x0024:
            fr4 r9 = r8.f20068f
            p000.vx2.m53588d(r9)
            me3 r1 = r8.f20067e
            p000.vx2.m53588d(r1)
            long r1 = r1.mo3611g()
            vr4 r3 = r8.f20064b
            androidx.compose.ui.input.pointer.PointerEventPass r4 = androidx.compose.p004ui.input.pointer.PointerEventPass.Initial
            r3.mo3372m(r9, r4, r1)
            vr4 r3 = r8.f20064b
            boolean r3 = p000.wr4.m29691b(r3)
            if (r3 == 0) goto L_0x0065
            v04 r3 = r8.mo19726g()
            int r4 = r3.mo26963n()
            if (r4 <= 0) goto L_0x0065
            java.lang.Object[] r3 = r3.mo26962m()
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>"
            p000.vx2.m53589e(r3, r5)
        L_0x0054:
            r5 = r3[r0]
            y74 r5 = (p000.y74) r5
            java.util.Map<mr4, nr4> r6 = r8.f20066d
            me3 r7 = r8.f20067e
            p000.vx2.m53588d(r7)
            r5.mo19725f(r6, r7, r11, r12)
            int r0 = r0 + r10
            if (r0 < r4) goto L_0x0054
        L_0x0065:
            vr4 r11 = r8.f20064b
            boolean r11 = p000.wr4.m29691b(r11)
            if (r11 == 0) goto L_0x0074
            vr4 r11 = r8.f20064b
            androidx.compose.ui.input.pointer.PointerEventPass r12 = androidx.compose.p004ui.input.pointer.PointerEventPass.Main
            r11.mo3372m(r9, r12, r1)
        L_0x0074:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.y74.mo19725f(java.util.Map, me3, ox2, boolean):boolean");
    }

    /* renamed from: i */
    public final void mo27978i() {
        this.f20066d.clear();
        this.f20067e = null;
    }

    /* renamed from: j */
    public final v04<mr4> mo27979j() {
        return this.f20065c;
    }

    /* renamed from: k */
    public final vr4 mo27980k() {
        return this.f20064b;
    }

    /* renamed from: l */
    public final boolean mo27981l(fr4 fr4, fr4 fr42) {
        if (fr4 == null || fr4.mo20069b().size() != fr42.mo20069b().size()) {
            return true;
        }
        int size = fr42.mo20069b().size();
        for (int i = 0; i < size; i++) {
            if (!tf4.m27732i(fr4.mo20069b().get(i).mo23787e(), fr42.mo20069b().get(i).mo23787e())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public final void mo27982m() {
        this.f20070h = true;
    }

    public String toString() {
        return "Node(pointerInputFilter=" + this.f20064b + ", children=" + mo19726g() + ", pointerIds=" + this.f20065c + ')';
    }
}
