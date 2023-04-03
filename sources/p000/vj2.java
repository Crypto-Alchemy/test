package p000;

import androidx.constraintlayout.core.widgets.C0489f;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* renamed from: vj2 */
/* compiled from: Grouping */
public class vj2 {
    /* renamed from: a */
    public static xk7 m28825a(ConstraintWidget constraintWidget, int i, ArrayList<xk7> arrayList, xk7 xk7) {
        int i2;
        int p1;
        if (i == 0) {
            i2 = constraintWidget.f2397R0;
        } else {
            i2 = constraintWidget.f2399S0;
        }
        int i3 = 0;
        if (i2 != -1 && (xk7 == null || i2 != xk7.f19865b)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                xk7 xk72 = arrayList.get(i4);
                if (xk72.mo27778c() == i2) {
                    if (xk7 != null) {
                        xk7.mo27782g(i, xk72);
                        arrayList.remove(xk7);
                    }
                    xk7 = xk72;
                } else {
                    i4++;
                }
            }
        } else if (i2 != -1) {
            return xk7;
        }
        if (xk7 == null) {
            if ((constraintWidget instanceof wl2) && (p1 = ((wl2) constraintWidget).mo27554p1(i)) != -1) {
                int i5 = 0;
                while (true) {
                    if (i5 >= arrayList.size()) {
                        break;
                    }
                    xk7 xk73 = arrayList.get(i5);
                    if (xk73.mo27778c() == p1) {
                        xk7 = xk73;
                        break;
                    }
                    i5++;
                }
            }
            if (xk7 == null) {
                xk7 = new xk7(i);
            }
            arrayList.add(xk7);
        }
        if (xk7.mo27776a(constraintWidget)) {
            if (constraintWidget instanceof C0489f) {
                C0489f fVar = (C0489f) constraintWidget;
                ConstraintAnchor o1 = fVar.mo4542o1();
                if (fVar.mo4543p1() == 0) {
                    i3 = 1;
                }
                o1.mo4307c(i3, arrayList, xk7);
            }
            if (i == 0) {
                constraintWidget.f2397R0 = xk7.mo27778c();
                constraintWidget.f2392P.mo4307c(i, arrayList, xk7);
                constraintWidget.f2396R.mo4307c(i, arrayList, xk7);
            } else {
                constraintWidget.f2399S0 = xk7.mo27778c();
                constraintWidget.f2394Q.mo4307c(i, arrayList, xk7);
                constraintWidget.f2400T.mo4307c(i, arrayList, xk7);
                constraintWidget.f2398S.mo4307c(i, arrayList, xk7);
            }
            constraintWidget.f2403W.mo4307c(i, arrayList, xk7);
        }
        return xk7;
    }

    /* renamed from: b */
    public static xk7 m28826b(ArrayList<xk7> arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            xk7 xk7 = arrayList.get(i2);
            if (i == xk7.f19865b) {
                return xk7;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:175:0x0354  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0390  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0395 A[ADDED_TO_REGION] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m28827c(androidx.constraintlayout.core.widgets.C0486d r16, p000.a00.C0001b r17) {
        /*
            r0 = r16
            java.util.ArrayList r1 = r16.mo27206o1()
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        L_0x000c:
            if (r4 >= r2) goto L_0x0033
            java.lang.Object r5 = r1.get(r4)
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = r16.mo4331C()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = r16.mo4363S()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = r5.mo4331C()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = r5.mo4363S()
            boolean r6 = m28828d(r6, r7, r8, r9)
            if (r6 != 0) goto L_0x002b
            return r3
        L_0x002b:
            boolean r5 = r5 instanceof androidx.constraintlayout.core.widgets.C0487e
            if (r5 == 0) goto L_0x0030
            return r3
        L_0x0030:
            int r4 = r4 + 1
            goto L_0x000c
        L_0x0033:
            r5 = r3
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x003a:
            if (r5 >= r2) goto L_0x0116
            java.lang.Object r13 = r1.get(r5)
            androidx.constraintlayout.core.widgets.ConstraintWidget r13 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r13
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = r16.mo4331C()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r15 = r16.mo4363S()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = r13.mo4331C()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = r13.mo4363S()
            boolean r4 = m28828d(r14, r15, r4, r12)
            if (r4 != 0) goto L_0x0062
            a00$a r4 = r0.f2548y1
            int r12 = p000.a00.C0000a.f6k
            r14 = r17
            androidx.constraintlayout.core.widgets.C0486d.m3634P1(r3, r13, r14, r4, r12)
            goto L_0x0064
        L_0x0062:
            r14 = r17
        L_0x0064:
            boolean r4 = r13 instanceof androidx.constraintlayout.core.widgets.C0489f
            if (r4 == 0) goto L_0x008d
            r12 = r13
            androidx.constraintlayout.core.widgets.f r12 = (androidx.constraintlayout.core.widgets.C0489f) r12
            int r15 = r12.mo4543p1()
            if (r15 != 0) goto L_0x007b
            if (r8 != 0) goto L_0x0078
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x0078:
            r8.add(r12)
        L_0x007b:
            int r15 = r12.mo4543p1()
            r3 = 1
            if (r15 != r3) goto L_0x008d
            if (r6 != 0) goto L_0x008a
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r6 = r3
        L_0x008a:
            r6.add(r12)
        L_0x008d:
            boolean r3 = r13 instanceof p000.wl2
            if (r3 == 0) goto L_0x00d1
            boolean r3 = r13 instanceof androidx.constraintlayout.core.widgets.C0476a
            if (r3 == 0) goto L_0x00ba
            r3 = r13
            androidx.constraintlayout.core.widgets.a r3 = (androidx.constraintlayout.core.widgets.C0476a) r3
            int r12 = r3.mo4447u1()
            if (r12 != 0) goto L_0x00a8
            if (r7 != 0) goto L_0x00a5
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x00a5:
            r7.add(r3)
        L_0x00a8:
            int r12 = r3.mo4447u1()
            r15 = 1
            if (r12 != r15) goto L_0x00d1
            if (r9 != 0) goto L_0x00b6
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x00b6:
            r9.add(r3)
            goto L_0x00d1
        L_0x00ba:
            r3 = r13
            wl2 r3 = (p000.wl2) r3
            if (r7 != 0) goto L_0x00c4
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x00c4:
            r7.add(r3)
            if (r9 != 0) goto L_0x00ce
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x00ce:
            r9.add(r3)
        L_0x00d1:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r13.f2392P
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.f2355f
            if (r3 != 0) goto L_0x00ee
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r13.f2396R
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.f2355f
            if (r3 != 0) goto L_0x00ee
            if (r4 != 0) goto L_0x00ee
            boolean r3 = r13 instanceof androidx.constraintlayout.core.widgets.C0476a
            if (r3 != 0) goto L_0x00ee
            if (r10 != 0) goto L_0x00eb
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r10 = r3
        L_0x00eb:
            r10.add(r13)
        L_0x00ee:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r13.f2394Q
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.f2355f
            if (r3 != 0) goto L_0x0111
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r13.f2398S
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.f2355f
            if (r3 != 0) goto L_0x0111
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r13.f2400T
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.f2355f
            if (r3 != 0) goto L_0x0111
            if (r4 != 0) goto L_0x0111
            boolean r3 = r13 instanceof androidx.constraintlayout.core.widgets.C0476a
            if (r3 != 0) goto L_0x0111
            if (r11 != 0) goto L_0x010e
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r11 = r3
        L_0x010e:
            r11.add(r13)
        L_0x0111:
            int r5 = r5 + 1
            r3 = 0
            goto L_0x003a
        L_0x0116:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r6 == 0) goto L_0x0133
            java.util.Iterator r4 = r6.iterator()
        L_0x0121:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0133
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.f r5 = (androidx.constraintlayout.core.widgets.C0489f) r5
            r6 = 0
            r12 = 0
            m28825a(r5, r6, r3, r12)
            goto L_0x0121
        L_0x0133:
            r6 = 0
            r12 = 0
            if (r7 == 0) goto L_0x0154
            java.util.Iterator r4 = r7.iterator()
        L_0x013b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0154
            java.lang.Object r5 = r4.next()
            wl2 r5 = (p000.wl2) r5
            xk7 r7 = m28825a(r5, r6, r3, r12)
            r5.mo27553o1(r3, r6, r7)
            r7.mo27777b(r3)
            r6 = 0
            r12 = 0
            goto L_0x013b
        L_0x0154:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.mo4422q(r4)
            java.util.HashSet r5 = r4.mo4308d()
            if (r5 == 0) goto L_0x017c
            java.util.HashSet r4 = r4.mo4308d()
            java.util.Iterator r4 = r4.iterator()
        L_0x0168:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x017c
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.f2353d
            r6 = 0
            r7 = 0
            m28825a(r5, r6, r3, r7)
            goto L_0x0168
        L_0x017c:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.mo4422q(r4)
            java.util.HashSet r5 = r4.mo4308d()
            if (r5 == 0) goto L_0x01a4
            java.util.HashSet r4 = r4.mo4308d()
            java.util.Iterator r4 = r4.iterator()
        L_0x0190:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01a4
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.f2353d
            r6 = 0
            r7 = 0
            m28825a(r5, r6, r3, r7)
            goto L_0x0190
        L_0x01a4:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.mo4422q(r4)
            java.util.HashSet r5 = r4.mo4308d()
            if (r5 == 0) goto L_0x01cc
            java.util.HashSet r4 = r4.mo4308d()
            java.util.Iterator r4 = r4.iterator()
        L_0x01b8:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01cc
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.f2353d
            r6 = 0
            r7 = 0
            m28825a(r5, r6, r3, r7)
            goto L_0x01b8
        L_0x01cc:
            r6 = 0
            r7 = 0
            if (r10 == 0) goto L_0x01e4
            java.util.Iterator r4 = r10.iterator()
        L_0x01d4:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01e4
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r5
            m28825a(r5, r6, r3, r7)
            goto L_0x01d4
        L_0x01e4:
            if (r8 == 0) goto L_0x01fb
            java.util.Iterator r4 = r8.iterator()
        L_0x01ea:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01fb
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.f r5 = (androidx.constraintlayout.core.widgets.C0489f) r5
            r6 = 1
            m28825a(r5, r6, r3, r7)
            goto L_0x01ea
        L_0x01fb:
            r6 = 1
            if (r9 == 0) goto L_0x021b
            java.util.Iterator r4 = r9.iterator()
        L_0x0202:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x021b
            java.lang.Object r5 = r4.next()
            wl2 r5 = (p000.wl2) r5
            xk7 r8 = m28825a(r5, r6, r3, r7)
            r5.mo27553o1(r3, r6, r8)
            r8.mo27777b(r3)
            r6 = 1
            r7 = 0
            goto L_0x0202
        L_0x021b:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.mo4422q(r4)
            java.util.HashSet r5 = r4.mo4308d()
            if (r5 == 0) goto L_0x0243
            java.util.HashSet r4 = r4.mo4308d()
            java.util.Iterator r4 = r4.iterator()
        L_0x022f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0243
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.f2353d
            r6 = 1
            r7 = 0
            m28825a(r5, r6, r3, r7)
            goto L_0x022f
        L_0x0243:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.mo4422q(r4)
            java.util.HashSet r5 = r4.mo4308d()
            if (r5 == 0) goto L_0x026b
            java.util.HashSet r4 = r4.mo4308d()
            java.util.Iterator r4 = r4.iterator()
        L_0x0257:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x026b
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.f2353d
            r6 = 1
            r7 = 0
            m28825a(r5, r6, r3, r7)
            goto L_0x0257
        L_0x026b:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.mo4422q(r4)
            java.util.HashSet r5 = r4.mo4308d()
            if (r5 == 0) goto L_0x0293
            java.util.HashSet r4 = r4.mo4308d()
            java.util.Iterator r4 = r4.iterator()
        L_0x027f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0293
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.f2353d
            r6 = 1
            r7 = 0
            m28825a(r5, r6, r3, r7)
            goto L_0x027f
        L_0x0293:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.mo4422q(r4)
            java.util.HashSet r5 = r4.mo4308d()
            if (r5 == 0) goto L_0x02bb
            java.util.HashSet r4 = r4.mo4308d()
            java.util.Iterator r4 = r4.iterator()
        L_0x02a7:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02bb
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.f2353d
            r6 = 1
            r12 = 0
            m28825a(r5, r6, r3, r12)
            goto L_0x02a7
        L_0x02bb:
            r6 = 1
            r12 = 0
            if (r11 == 0) goto L_0x02d3
            java.util.Iterator r4 = r11.iterator()
        L_0x02c3:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02d3
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r5
            m28825a(r5, r6, r3, r12)
            goto L_0x02c3
        L_0x02d3:
            r4 = 0
        L_0x02d4:
            if (r4 >= r2) goto L_0x0300
            java.lang.Object r5 = r1.get(r4)
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r5
            boolean r6 = r5.mo4425r0()
            if (r6 == 0) goto L_0x02fd
            int r6 = r5.f2397R0
            xk7 r6 = m28826b(r3, r6)
            int r5 = r5.f2399S0
            xk7 r5 = m28826b(r3, r5)
            if (r6 == 0) goto L_0x02fd
            if (r5 == 0) goto L_0x02fd
            r7 = 0
            r6.mo27782g(r7, r5)
            r7 = 2
            r5.mo27784i(r7)
            r3.remove(r6)
        L_0x02fd:
            int r4 = r4 + 1
            goto L_0x02d4
        L_0x0300:
            int r1 = r3.size()
            r2 = 1
            if (r1 > r2) goto L_0x0309
            r1 = 0
            return r1
        L_0x0309:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r16.mo4331C()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r1 != r2) goto L_0x034b
            java.util.Iterator r1 = r3.iterator()
            r2 = r12
            r6 = 0
        L_0x0317:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x033c
            java.lang.Object r4 = r1.next()
            xk7 r4 = (p000.xk7) r4
            int r5 = r4.mo27779d()
            r7 = 1
            if (r5 != r7) goto L_0x032b
            goto L_0x0317
        L_0x032b:
            r5 = 0
            r4.mo27783h(r5)
            androidx.constraintlayout.core.c r7 = r16.mo4481H1()
            int r7 = r4.mo27781f(r7, r5)
            if (r7 <= r6) goto L_0x0317
            r2 = r4
            r6 = r7
            goto L_0x0317
        L_0x033c:
            if (r2 == 0) goto L_0x034b
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r0.mo4352M0(r1)
            r0.mo4399h1(r6)
            r1 = 1
            r2.mo27783h(r1)
            goto L_0x034c
        L_0x034b:
            r2 = r12
        L_0x034c:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r16.mo4363S()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r1 != r4) goto L_0x0390
            java.util.Iterator r1 = r3.iterator()
            r3 = r12
            r6 = 0
        L_0x035a:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x037f
            java.lang.Object r4 = r1.next()
            xk7 r4 = (p000.xk7) r4
            int r5 = r4.mo27779d()
            if (r5 != 0) goto L_0x036d
            goto L_0x035a
        L_0x036d:
            r5 = 0
            r4.mo27783h(r5)
            androidx.constraintlayout.core.c r7 = r16.mo4481H1()
            r8 = 1
            int r7 = r4.mo27781f(r7, r8)
            if (r7 <= r6) goto L_0x035a
            r3 = r4
            r6 = r7
            goto L_0x035a
        L_0x037f:
            r5 = 0
            r8 = 1
            if (r3 == 0) goto L_0x0392
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r0.mo4387d1(r1)
            r0.mo4344I0(r6)
            r3.mo27783h(r8)
            r4 = r3
            goto L_0x0393
        L_0x0390:
            r5 = 0
            r8 = 1
        L_0x0392:
            r4 = r12
        L_0x0393:
            if (r2 != 0) goto L_0x039a
            if (r4 == 0) goto L_0x0398
            goto L_0x039a
        L_0x0398:
            r3 = r5
            goto L_0x039b
        L_0x039a:
            r3 = r8
        L_0x039b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.vj2.m28827c(androidx.constraintlayout.core.widgets.d, a00$b):boolean");
    }

    /* renamed from: d */
    public static boolean m28828d(ConstraintWidget.DimensionBehaviour dimensionBehaviour, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, ConstraintWidget.DimensionBehaviour dimensionBehaviour3, ConstraintWidget.DimensionBehaviour dimensionBehaviour4) {
        boolean z;
        boolean z2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.FIXED;
        if (dimensionBehaviour3 == dimensionBehaviour7 || dimensionBehaviour3 == (dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour != dimensionBehaviour6)) {
            z = true;
        } else {
            z = false;
        }
        if (dimensionBehaviour4 == dimensionBehaviour7 || dimensionBehaviour4 == (dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || (dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour2 != dimensionBehaviour5)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || z2) {
            return true;
        }
        return false;
    }
}
