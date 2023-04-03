package p000;

import com.google.android.gms.internal.measurement.zzbl;
import java.util.ArrayList;
import java.util.List;

/* renamed from: u98 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class u98 extends l98 {
    public u98() {
        this.f31222a.add(zzbl.APPLY);
        this.f31222a.add(zzbl.BLOCK);
        this.f31222a.add(zzbl.BREAK);
        this.f31222a.add(zzbl.CASE);
        this.f31222a.add(zzbl.DEFAULT);
        this.f31222a.add(zzbl.CONTINUE);
        this.f31222a.add(zzbl.DEFINE_FUNCTION);
        this.f31222a.add(zzbl.FN);
        this.f31222a.add(zzbl.IF);
        this.f31222a.add(zzbl.QUOTE);
        this.f31222a.add(zzbl.RETURN);
        this.f31222a.add(zzbl.SWITCH);
        this.f31222a.add(zzbl.TERNARY);
    }

    /* renamed from: c */
    public static r88 m52689c(ps8 ps8, List<r88> list) {
        gv8.m44947b(zzbl.FN.name(), 2, list);
        r88 a = ps8.mo46865a(list.get(0));
        r88 a2 = ps8.mo46865a(list.get(1));
        if (a2 instanceof k68) {
            List<r88> r = ((k68) a2).mo44680r();
            List<r88> arrayList = new ArrayList<>();
            if (list.size() > 2) {
                arrayList = list.subList(2, list.size());
            }
            return new l88(a.zzc(), r, arrayList, ps8);
        }
        throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", new Object[]{a2.getClass().getCanonicalName()}));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0129, code lost:
        if (r8.equals("continue") == false) goto L_0x012d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.r88 mo28916a(java.lang.String r8, p000.ps8 r9, java.util.List<p000.r88> r10) {
        /*
            r7 = this;
            com.google.android.gms.internal.measurement.zzbl r0 = com.google.android.gms.internal.measurement.zzbl.ADD
            com.google.android.gms.internal.measurement.zzbl r0 = p000.gv8.m44950e(r8)
            int r0 = r0.ordinal()
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 == r2) goto L_0x0211
            r5 = 15
            if (r0 == r5) goto L_0x0205
            r5 = 25
            if (r0 == r5) goto L_0x0200
            r5 = 41
            if (r0 == r5) goto L_0x01ae
            r5 = 54
            if (r0 == r5) goto L_0x01a8
            r5 = 57
            java.lang.String r6 = "return"
            if (r0 == r5) goto L_0x0185
            r5 = 19
            if (r0 == r5) goto L_0x0164
            r5 = 20
            if (r0 == r5) goto L_0x0140
            r5 = 60
            if (r0 == r5) goto L_0x008b
            r5 = 61
            if (r0 == r5) goto L_0x0058
            switch(r0) {
                case 11: goto L_0x004a;
                case 12: goto L_0x003e;
                case 13: goto L_0x0164;
                default: goto L_0x0039;
            }
        L_0x0039:
            r88 r8 = super.mo45390b(r8)
            return r8
        L_0x003e:
            com.google.android.gms.internal.measurement.zzbl r8 = com.google.android.gms.internal.measurement.zzbl.BREAK
            java.lang.String r8 = r8.name()
            p000.gv8.m44946a(r8, r4, r10)
            r88 r8 = p000.r88.f33333j1
            return r8
        L_0x004a:
            ps8 r8 = r9.mo46867c()
            k68 r9 = new k68
            r9.<init>(r10)
            r88 r8 = r8.mo46866b(r9)
            return r8
        L_0x0058:
            com.google.android.gms.internal.measurement.zzbl r8 = com.google.android.gms.internal.measurement.zzbl.TERNARY
            java.lang.String r8 = r8.name()
            p000.gv8.m44946a(r8, r1, r10)
            java.lang.Object r8 = r10.get(r4)
            r88 r8 = (p000.r88) r8
            r88 r8 = r9.mo46865a(r8)
            java.lang.Boolean r8 = r8.mo29500c()
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0080
            java.lang.Object r8 = r10.get(r3)
            r88 r8 = (p000.r88) r8
            r88 r8 = r9.mo46865a(r8)
            goto L_0x008a
        L_0x0080:
            java.lang.Object r8 = r10.get(r2)
            r88 r8 = (p000.r88) r8
            r88 r8 = r9.mo46865a(r8)
        L_0x008a:
            return r8
        L_0x008b:
            com.google.android.gms.internal.measurement.zzbl r8 = com.google.android.gms.internal.measurement.zzbl.SWITCH
            java.lang.String r8 = r8.name()
            p000.gv8.m44946a(r8, r1, r10)
            java.lang.Object r8 = r10.get(r4)
            r88 r8 = (p000.r88) r8
            r88 r8 = r9.mo46865a(r8)
            java.lang.Object r0 = r10.get(r3)
            r88 r0 = (p000.r88) r0
            r88 r0 = r9.mo46865a(r0)
            java.lang.Object r10 = r10.get(r2)
            r88 r10 = (p000.r88) r10
            r88 r10 = r9.mo46865a(r10)
            boolean r1 = r0 instanceof p000.k68
            if (r1 == 0) goto L_0x0138
            boolean r1 = r10 instanceof p000.k68
            if (r1 == 0) goto L_0x0130
            k68 r0 = (p000.k68) r0
            k68 r10 = (p000.k68) r10
            r1 = r4
            r2 = r1
        L_0x00c0:
            int r5 = r0.mo44682t()
            if (r1 >= r5) goto L_0x00fb
            if (r2 != 0) goto L_0x00d9
            r88 r2 = r0.mo44685w(r1)
            r88 r2 = r9.mo46865a(r2)
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L_0x00d7
            goto L_0x00d9
        L_0x00d7:
            r2 = r4
            goto L_0x00f8
        L_0x00d9:
            r88 r2 = r10.mo44685w(r1)
            r88 r2 = r9.mo46865a(r2)
            boolean r5 = r2 instanceof p000.y68
            if (r5 == 0) goto L_0x00f7
            r8 = r2
            y68 r8 = (p000.y68) r8
            java.lang.String r8 = r8.mo49603d()
            java.lang.String r9 = "break"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x012c
            r88 r8 = p000.r88.f33330g1
            return r8
        L_0x00f7:
            r2 = r3
        L_0x00f8:
            int r1 = r1 + 1
            goto L_0x00c0
        L_0x00fb:
            int r8 = r0.mo44682t()
            int r8 = r8 + r3
            int r1 = r10.mo44682t()
            if (r8 != r1) goto L_0x012d
            int r8 = r0.mo44682t()
            r88 r8 = r10.mo44685w(r8)
            r88 r2 = r9.mo46865a(r8)
            boolean r8 = r2 instanceof p000.y68
            if (r8 == 0) goto L_0x012d
            r8 = r2
            y68 r8 = (p000.y68) r8
            java.lang.String r8 = r8.mo49603d()
            boolean r9 = r8.equals(r6)
            if (r9 != 0) goto L_0x012c
            java.lang.String r9 = "continue"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x012c
            goto L_0x012d
        L_0x012c:
            return r2
        L_0x012d:
            r88 r8 = p000.r88.f33330g1
            return r8
        L_0x0130:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Malformed SWITCH statement, case statements are not a list"
            r8.<init>(r9)
            throw r8
        L_0x0138:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Malformed SWITCH statement, cases are not a list"
            r8.<init>(r9)
            throw r8
        L_0x0140:
            com.google.android.gms.internal.measurement.zzbl r8 = com.google.android.gms.internal.measurement.zzbl.DEFINE_FUNCTION
            java.lang.String r8 = r8.name()
            p000.gv8.m44947b(r8, r2, r10)
            r88 r8 = m52689c(r9, r10)
            r10 = r8
            j78 r10 = (p000.j78) r10
            java.lang.String r0 = r10.mo44059d()
            if (r0 != 0) goto L_0x015c
            java.lang.String r10 = ""
            r9.mo46869e(r10, r8)
            goto L_0x0163
        L_0x015c:
            java.lang.String r10 = r10.mo44059d()
            r9.mo46869e(r10, r8)
        L_0x0163:
            return r8
        L_0x0164:
            boolean r8 = r10.isEmpty()
            if (r8 == 0) goto L_0x016d
            r88 r8 = p000.r88.f33330g1
            goto L_0x0184
        L_0x016d:
            java.lang.Object r8 = r10.get(r4)
            r88 r8 = (p000.r88) r8
            r88 r8 = r9.mo46865a(r8)
            boolean r10 = r8 instanceof p000.k68
            if (r10 == 0) goto L_0x0182
            k68 r8 = (p000.k68) r8
            r88 r8 = r9.mo46866b(r8)
            goto L_0x0184
        L_0x0182:
            r88 r8 = p000.r88.f33330g1
        L_0x0184:
            return r8
        L_0x0185:
            boolean r8 = r10.isEmpty()
            if (r8 == 0) goto L_0x018e
            r88 r8 = p000.r88.f33334k1
            goto L_0x01a7
        L_0x018e:
            com.google.android.gms.internal.measurement.zzbl r8 = com.google.android.gms.internal.measurement.zzbl.RETURN
            java.lang.String r8 = r8.name()
            p000.gv8.m44946a(r8, r3, r10)
            java.lang.Object r8 = r10.get(r4)
            r88 r8 = (p000.r88) r8
            r88 r8 = r9.mo46865a(r8)
            y68 r9 = new y68
            r9.<init>(r6, r8)
            r8 = r9
        L_0x01a7:
            return r8
        L_0x01a8:
            k68 r8 = new k68
            r8.<init>(r10)
            return r8
        L_0x01ae:
            com.google.android.gms.internal.measurement.zzbl r8 = com.google.android.gms.internal.measurement.zzbl.IF
            java.lang.String r8 = r8.name()
            p000.gv8.m44947b(r8, r2, r10)
            java.lang.Object r8 = r10.get(r4)
            r88 r8 = (p000.r88) r8
            r88 r8 = r9.mo46865a(r8)
            java.lang.Object r0 = r10.get(r3)
            r88 r0 = (p000.r88) r0
            r88 r0 = r9.mo46865a(r0)
            int r1 = r10.size()
            if (r1 <= r2) goto L_0x01dc
            java.lang.Object r10 = r10.get(r2)
            r88 r10 = (p000.r88) r10
            r88 r10 = r9.mo46865a(r10)
            goto L_0x01dd
        L_0x01dc:
            r10 = 0
        L_0x01dd:
            r88 r1 = p000.r88.f33330g1
            java.lang.Boolean r8 = r8.mo29500c()
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x01f0
            k68 r0 = (p000.k68) r0
            r88 r8 = r9.mo46866b(r0)
            goto L_0x01fa
        L_0x01f0:
            if (r10 == 0) goto L_0x01f9
            k68 r10 = (p000.k68) r10
            r88 r8 = r9.mo46866b(r10)
            goto L_0x01fa
        L_0x01f9:
            r8 = r1
        L_0x01fa:
            boolean r9 = r8 instanceof p000.y68
            if (r9 == 0) goto L_0x01ff
            return r8
        L_0x01ff:
            return r1
        L_0x0200:
            r88 r8 = m52689c(r9, r10)
            return r8
        L_0x0205:
            com.google.android.gms.internal.measurement.zzbl r8 = com.google.android.gms.internal.measurement.zzbl.BREAK
            java.lang.String r8 = r8.name()
            p000.gv8.m44946a(r8, r4, r10)
            r88 r8 = p000.r88.f33332i1
            return r8
        L_0x0211:
            com.google.android.gms.internal.measurement.zzbl r8 = com.google.android.gms.internal.measurement.zzbl.APPLY
            java.lang.String r8 = r8.name()
            p000.gv8.m44946a(r8, r1, r10)
            java.lang.Object r8 = r10.get(r4)
            r88 r8 = (p000.r88) r8
            r88 r8 = r9.mo46865a(r8)
            java.lang.Object r0 = r10.get(r3)
            r88 r0 = (p000.r88) r0
            r88 r0 = r9.mo46865a(r0)
            java.lang.String r0 = r0.zzc()
            java.lang.Object r10 = r10.get(r2)
            r88 r10 = (p000.r88) r10
            r88 r10 = r9.mo46865a(r10)
            boolean r1 = r10 instanceof p000.k68
            if (r1 == 0) goto L_0x0259
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0251
            k68 r10 = (p000.k68) r10
            java.util.List r10 = r10.mo44680r()
            r88 r8 = r8.mo29506o(r0, r9, r10)
            return r8
        L_0x0251:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Function name for apply is undefined"
            r8.<init>(r9)
            throw r8
        L_0x0259:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.Object[] r9 = new java.lang.Object[r3]
            java.lang.Class r10 = r10.getClass()
            java.lang.String r10 = r10.getCanonicalName()
            r9[r4] = r10
            java.lang.String r10 = "Function arguments for Apply are not a list found %s"
            java.lang.String r9 = java.lang.String.format(r10, r9)
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.u98.mo28916a(java.lang.String, ps8, java.util.List):r88");
    }
}
