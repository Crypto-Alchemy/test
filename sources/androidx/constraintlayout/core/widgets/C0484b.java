package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.C0467c;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.core.widgets.b */
/* compiled from: Chain */
public class C0484b {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: androidx.constraintlayout.core.widgets.ConstraintWidget} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: androidx.constraintlayout.core.SolverVariable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: androidx.constraintlayout.core.SolverVariable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: androidx.constraintlayout.core.widgets.ConstraintWidget} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: androidx.constraintlayout.core.SolverVariable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: androidx.constraintlayout.core.widgets.ConstraintWidget} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: androidx.constraintlayout.core.SolverVariable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: androidx.constraintlayout.core.widgets.ConstraintWidget} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: androidx.constraintlayout.core.widgets.ConstraintWidget} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v40, resolved type: androidx.constraintlayout.core.SolverVariable} */
    /* JADX WARNING: type inference failed for: r5v10, types: [androidx.constraintlayout.core.SolverVariable] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r7 == 2) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        if (r7 == 2) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        r5 = false;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0264 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02bf A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x034c  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x03a3  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x03b8  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x03bb  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x03c1  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0499  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x04ce  */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x04e1 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x04ed  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x04f9  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x04fc  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x0502  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0505  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x0509  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x0519  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x051d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x03a5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:330:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m3629a(androidx.constraintlayout.core.widgets.C0486d r37, androidx.constraintlayout.core.C0467c r38, int r39, int r40, androidx.constraintlayout.core.widgets.C0485c r41) {
        /*
            r0 = r37
            r9 = r38
            r10 = r39
            r1 = r41
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = r1.f2497a
            androidx.constraintlayout.core.widgets.ConstraintWidget r12 = r1.f2499c
            androidx.constraintlayout.core.widgets.ConstraintWidget r13 = r1.f2498b
            androidx.constraintlayout.core.widgets.ConstraintWidget r14 = r1.f2500d
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r1.f2501e
            float r3 = r1.f2507k
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r0.f2408a0
            r4 = r4[r10]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r15 = 1
            if (r4 != r5) goto L_0x001f
            r4 = r15
            goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            r5 = 2
            if (r10 != 0) goto L_0x0034
            int r7 = r2.f2379I0
            if (r7 != 0) goto L_0x0029
            r8 = r15
            goto L_0x002a
        L_0x0029:
            r8 = 0
        L_0x002a:
            if (r7 != r15) goto L_0x002f
            r16 = r15
            goto L_0x0031
        L_0x002f:
            r16 = 0
        L_0x0031:
            if (r7 != r5) goto L_0x0046
            goto L_0x0044
        L_0x0034:
            int r7 = r2.f2381J0
            if (r7 != 0) goto L_0x003a
            r8 = r15
            goto L_0x003b
        L_0x003a:
            r8 = 0
        L_0x003b:
            if (r7 != r15) goto L_0x0040
            r16 = r15
            goto L_0x0042
        L_0x0040:
            r16 = 0
        L_0x0042:
            if (r7 != r5) goto L_0x0046
        L_0x0044:
            r5 = r15
            goto L_0x0047
        L_0x0046:
            r5 = 0
        L_0x0047:
            r17 = r16
            r7 = 0
            r16 = r8
            r8 = r11
        L_0x004d:
            r21 = 0
            if (r7 != 0) goto L_0x012f
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r6 = r8.f2404X
            r6 = r6[r40]
            if (r5 == 0) goto L_0x005a
            r19 = 1
            goto L_0x005c
        L_0x005a:
            r19 = 4
        L_0x005c:
            int r23 = r6.mo4310f()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r15 = r8.f2408a0
            r15 = r15[r10]
            r25 = r3
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r15 != r3) goto L_0x0074
            int[] r15 = r8.f2453x
            r15 = r15[r10]
            if (r15 != 0) goto L_0x0074
            r26 = r7
            r15 = 1
            goto L_0x0077
        L_0x0074:
            r26 = r7
            r15 = 0
        L_0x0077:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r6.f2355f
            if (r7 == 0) goto L_0x0083
            if (r8 == r11) goto L_0x0083
            int r7 = r7.mo4310f()
            int r23 = r23 + r7
        L_0x0083:
            r7 = r23
            if (r5 == 0) goto L_0x0090
            if (r8 == r11) goto L_0x0090
            if (r8 == r13) goto L_0x0090
            r23 = r2
            r19 = 8
            goto L_0x0092
        L_0x0090:
            r23 = r2
        L_0x0092:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r6.f2355f
            if (r2 == 0) goto L_0x00cc
            if (r8 != r13) goto L_0x00a3
            r27 = r11
            androidx.constraintlayout.core.SolverVariable r11 = r6.f2358i
            androidx.constraintlayout.core.SolverVariable r2 = r2.f2358i
            r1 = 6
            r9.mo4270h(r11, r2, r7, r1)
            goto L_0x00ae
        L_0x00a3:
            r27 = r11
            androidx.constraintlayout.core.SolverVariable r1 = r6.f2358i
            androidx.constraintlayout.core.SolverVariable r2 = r2.f2358i
            r11 = 8
            r9.mo4270h(r1, r2, r7, r11)
        L_0x00ae:
            if (r15 == 0) goto L_0x00b4
            if (r5 != 0) goto L_0x00b4
            r19 = 5
        L_0x00b4:
            if (r8 != r13) goto L_0x00c0
            if (r5 == 0) goto L_0x00c0
            boolean r1 = r8.mo4395g0(r10)
            if (r1 == 0) goto L_0x00c0
            r1 = 5
            goto L_0x00c2
        L_0x00c0:
            r1 = r19
        L_0x00c2:
            androidx.constraintlayout.core.SolverVariable r2 = r6.f2358i
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r6.f2355f
            androidx.constraintlayout.core.SolverVariable r6 = r6.f2358i
            r9.mo4267e(r2, r6, r7, r1)
            goto L_0x00ce
        L_0x00cc:
            r27 = r11
        L_0x00ce:
            if (r4 == 0) goto L_0x0102
            int r1 = r8.mo4367U()
            r2 = 8
            if (r1 == r2) goto L_0x00f0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r8.f2408a0
            r1 = r1[r10]
            if (r1 != r3) goto L_0x00f0
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r8.f2404X
            int r2 = r40 + 1
            r2 = r1[r2]
            androidx.constraintlayout.core.SolverVariable r2 = r2.f2358i
            r1 = r1[r40]
            androidx.constraintlayout.core.SolverVariable r1 = r1.f2358i
            r3 = 5
            r6 = 0
            r9.mo4270h(r2, r1, r6, r3)
            goto L_0x00f1
        L_0x00f0:
            r6 = 0
        L_0x00f1:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r8.f2404X
            r1 = r1[r40]
            androidx.constraintlayout.core.SolverVariable r1 = r1.f2358i
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r0.f2404X
            r2 = r2[r40]
            androidx.constraintlayout.core.SolverVariable r2 = r2.f2358i
            r3 = 8
            r9.mo4270h(r1, r2, r6, r3)
        L_0x0102:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r8.f2404X
            int r2 = r40 + 1
            r1 = r1[r2]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.f2355f
            if (r1 == 0) goto L_0x011d
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.f2353d
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r1.f2404X
            r2 = r2[r40]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.f2355f
            if (r2 == 0) goto L_0x011d
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r2.f2353d
            if (r2 == r8) goto L_0x011b
            goto L_0x011d
        L_0x011b:
            r21 = r1
        L_0x011d:
            if (r21 == 0) goto L_0x0124
            r8 = r21
            r7 = r26
            goto L_0x0125
        L_0x0124:
            r7 = 1
        L_0x0125:
            r1 = r41
            r2 = r23
            r3 = r25
            r11 = r27
            goto L_0x004d
        L_0x012f:
            r23 = r2
            r25 = r3
            r27 = r11
            if (r14 == 0) goto L_0x0198
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r12.f2404X
            int r2 = r40 + 1
            r1 = r1[r2]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.f2355f
            if (r1 == 0) goto L_0x0198
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r14.f2404X
            r1 = r1[r2]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r14.f2408a0
            r3 = r3[r10]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r3 != r6) goto L_0x0155
            int[] r3 = r14.f2453x
            r3 = r3[r10]
            if (r3 != 0) goto L_0x0155
            r3 = 1
            goto L_0x0156
        L_0x0155:
            r3 = 0
        L_0x0156:
            if (r3 == 0) goto L_0x016e
            if (r5 != 0) goto L_0x016e
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r1.f2355f
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r3.f2353d
            if (r6 != r0) goto L_0x016e
            androidx.constraintlayout.core.SolverVariable r6 = r1.f2358i
            androidx.constraintlayout.core.SolverVariable r3 = r3.f2358i
            int r7 = r1.mo4310f()
            int r7 = -r7
            r8 = 5
            r9.mo4267e(r6, r3, r7, r8)
            goto L_0x0184
        L_0x016e:
            r8 = 5
            if (r5 == 0) goto L_0x0184
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r1.f2355f
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r3.f2353d
            if (r6 != r0) goto L_0x0184
            androidx.constraintlayout.core.SolverVariable r6 = r1.f2358i
            androidx.constraintlayout.core.SolverVariable r3 = r3.f2358i
            int r7 = r1.mo4310f()
            int r7 = -r7
            r11 = 4
            r9.mo4267e(r6, r3, r7, r11)
        L_0x0184:
            androidx.constraintlayout.core.SolverVariable r3 = r1.f2358i
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r6 = r12.f2404X
            r2 = r6[r2]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.f2355f
            androidx.constraintlayout.core.SolverVariable r2 = r2.f2358i
            int r1 = r1.mo4310f()
            int r1 = -r1
            r6 = 6
            r9.mo4272j(r3, r2, r1, r6)
            goto L_0x0199
        L_0x0198:
            r8 = 5
        L_0x0199:
            if (r4 == 0) goto L_0x01b2
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.f2404X
            int r1 = r40 + 1
            r0 = r0[r1]
            androidx.constraintlayout.core.SolverVariable r0 = r0.f2358i
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r12.f2404X
            r1 = r2[r1]
            androidx.constraintlayout.core.SolverVariable r2 = r1.f2358i
            int r1 = r1.mo4310f()
            r3 = 8
            r9.mo4270h(r0, r2, r1, r3)
        L_0x01b2:
            r0 = r41
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r1 = r0.f2504h
            if (r1 == 0) goto L_0x0262
            int r2 = r1.size()
            r3 = 1
            if (r2 <= r3) goto L_0x0262
            boolean r3 = r0.f2514r
            if (r3 == 0) goto L_0x01cb
            boolean r3 = r0.f2516t
            if (r3 != 0) goto L_0x01cb
            int r3 = r0.f2506j
            float r3 = (float) r3
            goto L_0x01cd
        L_0x01cb:
            r3 = r25
        L_0x01cd:
            r4 = 0
            r29 = r4
            r7 = r21
            r6 = 0
        L_0x01d3:
            if (r6 >= r2) goto L_0x0262
            java.lang.Object r11 = r1.get(r6)
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r11
            float[] r15 = r11.f2387M0
            r15 = r15[r10]
            int r20 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r20 >= 0) goto L_0x01ff
            boolean r15 = r0.f2516t
            if (r15 == 0) goto L_0x01fa
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r11 = r11.f2404X
            int r15 = r40 + 1
            r15 = r11[r15]
            androidx.constraintlayout.core.SolverVariable r15 = r15.f2358i
            r11 = r11[r40]
            androidx.constraintlayout.core.SolverVariable r11 = r11.f2358i
            r4 = 0
            r8 = 4
            r9.mo4267e(r15, r11, r4, r8)
            r8 = r4
            goto L_0x0216
        L_0x01fa:
            r8 = 4
            r15 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            goto L_0x0200
        L_0x01ff:
            r8 = 4
        L_0x0200:
            int r19 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r19 != 0) goto L_0x021b
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r11 = r11.f2404X
            int r15 = r40 + 1
            r15 = r11[r15]
            androidx.constraintlayout.core.SolverVariable r15 = r15.f2358i
            r11 = r11[r40]
            androidx.constraintlayout.core.SolverVariable r11 = r11.f2358i
            r4 = 8
            r8 = 0
            r9.mo4267e(r15, r11, r8, r4)
        L_0x0216:
            r25 = r1
            r18 = r2
            goto L_0x0258
        L_0x021b:
            r8 = 0
            if (r7 == 0) goto L_0x0251
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r4 = r7.f2404X
            r7 = r4[r40]
            androidx.constraintlayout.core.SolverVariable r7 = r7.f2358i
            int r18 = r40 + 1
            r4 = r4[r18]
            androidx.constraintlayout.core.SolverVariable r4 = r4.f2358i
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r8 = r11.f2404X
            r25 = r1
            r1 = r8[r40]
            androidx.constraintlayout.core.SolverVariable r1 = r1.f2358i
            r8 = r8[r18]
            androidx.constraintlayout.core.SolverVariable r8 = r8.f2358i
            r18 = r2
            androidx.constraintlayout.core.b r2 = r38.mo4280r()
            r28 = r2
            r30 = r3
            r31 = r15
            r32 = r7
            r33 = r4
            r34 = r1
            r35 = r8
            r28.mo4243l(r29, r30, r31, r32, r33, r34, r35)
            r9.mo4266d(r2)
            goto L_0x0255
        L_0x0251:
            r25 = r1
            r18 = r2
        L_0x0255:
            r7 = r11
            r29 = r15
        L_0x0258:
            int r6 = r6 + 1
            r2 = r18
            r1 = r25
            r4 = 0
            r8 = 5
            goto L_0x01d3
        L_0x0262:
            if (r13 == 0) goto L_0x02bb
            if (r13 == r14) goto L_0x0268
            if (r5 == 0) goto L_0x02bb
        L_0x0268:
            r11 = r27
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r11.f2404X
            r0 = r0[r40]
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r12.f2404X
            int r2 = r40 + 1
            r1 = r1[r2]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f2355f
            if (r0 == 0) goto L_0x027c
            androidx.constraintlayout.core.SolverVariable r0 = r0.f2358i
            r3 = r0
            goto L_0x027e
        L_0x027c:
            r3 = r21
        L_0x027e:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.f2355f
            if (r0 == 0) goto L_0x0286
            androidx.constraintlayout.core.SolverVariable r0 = r0.f2358i
            r5 = r0
            goto L_0x0288
        L_0x0286:
            r5 = r21
        L_0x0288:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r13.f2404X
            r0 = r0[r40]
            if (r14 == 0) goto L_0x0292
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r14.f2404X
            r1 = r1[r2]
        L_0x0292:
            if (r3 == 0) goto L_0x04df
            if (r5 == 0) goto L_0x04df
            if (r10 != 0) goto L_0x029d
            r2 = r23
            float r2 = r2.f2438p0
            goto L_0x02a1
        L_0x029d:
            r2 = r23
            float r2 = r2.f2440q0
        L_0x02a1:
            r4 = r2
            int r6 = r0.mo4310f()
            int r7 = r1.mo4310f()
            androidx.constraintlayout.core.SolverVariable r2 = r0.f2358i
            androidx.constraintlayout.core.SolverVariable r8 = r1.f2358i
            r10 = 7
            r0 = r38
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r8
            r8 = r10
            r0.mo4265c(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x04df
        L_0x02bb:
            r11 = r27
            if (r16 == 0) goto L_0x03aa
            if (r13 == 0) goto L_0x03aa
            int r1 = r0.f2506j
            if (r1 <= 0) goto L_0x02cc
            int r0 = r0.f2505i
            if (r0 != r1) goto L_0x02cc
            r24 = 1
            goto L_0x02ce
        L_0x02cc:
            r24 = 0
        L_0x02ce:
            r8 = r13
            r15 = r8
        L_0x02d0:
            if (r15 == 0) goto L_0x04df
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r0 = r15.f2391O0
            r0 = r0[r10]
            r7 = r0
        L_0x02d7:
            if (r7 == 0) goto L_0x02e6
            int r0 = r7.mo4367U()
            r6 = 8
            if (r0 != r6) goto L_0x02e8
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r0 = r7.f2391O0
            r7 = r0[r10]
            goto L_0x02d7
        L_0x02e6:
            r6 = 8
        L_0x02e8:
            if (r7 != 0) goto L_0x02f3
            if (r15 != r14) goto L_0x02ed
            goto L_0x02f3
        L_0x02ed:
            r20 = r7
        L_0x02ef:
            r18 = r8
            goto L_0x039a
        L_0x02f3:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r15.f2404X
            r0 = r0[r40]
            androidx.constraintlayout.core.SolverVariable r1 = r0.f2358i
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r0.f2355f
            if (r2 == 0) goto L_0x0300
            androidx.constraintlayout.core.SolverVariable r2 = r2.f2358i
            goto L_0x0302
        L_0x0300:
            r2 = r21
        L_0x0302:
            if (r8 == r15) goto L_0x030d
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r8.f2404X
            int r3 = r40 + 1
            r2 = r2[r3]
            androidx.constraintlayout.core.SolverVariable r2 = r2.f2358i
            goto L_0x031c
        L_0x030d:
            if (r15 != r13) goto L_0x031c
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r11.f2404X
            r2 = r2[r40]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.f2355f
            if (r2 == 0) goto L_0x031a
            androidx.constraintlayout.core.SolverVariable r2 = r2.f2358i
            goto L_0x031c
        L_0x031a:
            r2 = r21
        L_0x031c:
            int r0 = r0.mo4310f()
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r15.f2404X
            int r4 = r40 + 1
            r3 = r3[r4]
            int r3 = r3.mo4310f()
            if (r7 == 0) goto L_0x0335
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r5 = r7.f2404X
            r5 = r5[r40]
            androidx.constraintlayout.core.SolverVariable r6 = r5.f2358i
        L_0x0332:
            r37 = r7
            goto L_0x0344
        L_0x0335:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r5 = r12.f2404X
            r5 = r5[r4]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.f2355f
            if (r5 == 0) goto L_0x0340
            androidx.constraintlayout.core.SolverVariable r6 = r5.f2358i
            goto L_0x0332
        L_0x0340:
            r37 = r7
            r6 = r21
        L_0x0344:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r7 = r15.f2404X
            r7 = r7[r4]
            androidx.constraintlayout.core.SolverVariable r7 = r7.f2358i
            if (r5 == 0) goto L_0x0351
            int r5 = r5.mo4310f()
            int r3 = r3 + r5
        L_0x0351:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r5 = r8.f2404X
            r5 = r5[r4]
            int r5 = r5.mo4310f()
            int r0 = r0 + r5
            if (r1 == 0) goto L_0x0396
            if (r2 == 0) goto L_0x0396
            if (r6 == 0) goto L_0x0396
            if (r7 == 0) goto L_0x0396
            if (r15 != r13) goto L_0x036c
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r13.f2404X
            r0 = r0[r40]
            int r0 = r0.mo4310f()
        L_0x036c:
            r5 = r0
            if (r15 != r14) goto L_0x037a
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r14.f2404X
            r0 = r0[r4]
            int r0 = r0.mo4310f()
            r18 = r0
            goto L_0x037c
        L_0x037a:
            r18 = r3
        L_0x037c:
            if (r24 == 0) goto L_0x0381
            r19 = 8
            goto L_0x0383
        L_0x0381:
            r19 = 5
        L_0x0383:
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r38
            r3 = r5
            r5 = r6
            r6 = r7
            r20 = r37
            r7 = r18
            r18 = r8
            r8 = r19
            r0.mo4265c(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x039a
        L_0x0396:
            r20 = r37
            goto L_0x02ef
        L_0x039a:
            int r0 = r15.mo4367U()
            r8 = 8
            if (r0 == r8) goto L_0x03a3
            goto L_0x03a5
        L_0x03a3:
            r15 = r18
        L_0x03a5:
            r8 = r15
            r15 = r20
            goto L_0x02d0
        L_0x03aa:
            r8 = 8
            if (r17 == 0) goto L_0x04df
            if (r13 == 0) goto L_0x04df
            int r1 = r0.f2506j
            if (r1 <= 0) goto L_0x03bb
            int r0 = r0.f2505i
            if (r0 != r1) goto L_0x03bb
            r24 = 1
            goto L_0x03bd
        L_0x03bb:
            r24 = 0
        L_0x03bd:
            r7 = r13
            r15 = r7
        L_0x03bf:
            if (r15 == 0) goto L_0x0481
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r0 = r15.f2391O0
            r0 = r0[r10]
        L_0x03c5:
            if (r0 == 0) goto L_0x03d2
            int r1 = r0.mo4367U()
            if (r1 != r8) goto L_0x03d2
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r0 = r0.f2391O0
            r0 = r0[r10]
            goto L_0x03c5
        L_0x03d2:
            if (r15 == r13) goto L_0x046c
            if (r15 == r14) goto L_0x046c
            if (r0 == 0) goto L_0x046c
            if (r0 != r14) goto L_0x03dd
            r6 = r21
            goto L_0x03de
        L_0x03dd:
            r6 = r0
        L_0x03de:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r15.f2404X
            r0 = r0[r40]
            androidx.constraintlayout.core.SolverVariable r1 = r0.f2358i
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r0.f2355f
            if (r2 == 0) goto L_0x03ea
            androidx.constraintlayout.core.SolverVariable r2 = r2.f2358i
        L_0x03ea:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r7.f2404X
            int r3 = r40 + 1
            r2 = r2[r3]
            androidx.constraintlayout.core.SolverVariable r2 = r2.f2358i
            int r0 = r0.mo4310f()
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r4 = r15.f2404X
            r4 = r4[r3]
            int r4 = r4.mo4310f()
            if (r6 == 0) goto L_0x0417
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r5 = r6.f2404X
            r5 = r5[r40]
            androidx.constraintlayout.core.SolverVariable r8 = r5.f2358i
            r37 = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r5.f2355f
            if (r6 == 0) goto L_0x040f
            androidx.constraintlayout.core.SolverVariable r6 = r6.f2358i
            goto L_0x0411
        L_0x040f:
            r6 = r21
        L_0x0411:
            r36 = r8
            r8 = r6
            r6 = r36
            goto L_0x042a
        L_0x0417:
            r37 = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r5 = r14.f2404X
            r5 = r5[r40]
            if (r5 == 0) goto L_0x0422
            androidx.constraintlayout.core.SolverVariable r6 = r5.f2358i
            goto L_0x0424
        L_0x0422:
            r6 = r21
        L_0x0424:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r8 = r15.f2404X
            r8 = r8[r3]
            androidx.constraintlayout.core.SolverVariable r8 = r8.f2358i
        L_0x042a:
            if (r5 == 0) goto L_0x0431
            int r5 = r5.mo4310f()
            int r4 = r4 + r5
        L_0x0431:
            r18 = r4
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r4 = r7.f2404X
            r3 = r4[r3]
            int r3 = r3.mo4310f()
            int r3 = r3 + r0
            if (r24 == 0) goto L_0x0441
            r20 = 8
            goto L_0x0443
        L_0x0441:
            r20 = 4
        L_0x0443:
            if (r1 == 0) goto L_0x0461
            if (r2 == 0) goto L_0x0461
            if (r6 == 0) goto L_0x0461
            if (r8 == 0) goto L_0x0461
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r38
            r5 = r6
            r19 = r37
            r22 = 4
            r6 = r8
            r23 = r7
            r7 = r18
            r10 = 8
            r8 = r20
            r0.mo4265c(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0469
        L_0x0461:
            r19 = r37
            r23 = r7
            r10 = 8
            r22 = 4
        L_0x0469:
            r0 = r19
            goto L_0x0471
        L_0x046c:
            r23 = r7
            r10 = r8
            r22 = 4
        L_0x0471:
            int r1 = r15.mo4367U()
            if (r1 == r10) goto L_0x0479
            r7 = r15
            goto L_0x047b
        L_0x0479:
            r7 = r23
        L_0x047b:
            r15 = r0
            r8 = r10
            r10 = r39
            goto L_0x03bf
        L_0x0481:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r13.f2404X
            r0 = r0[r40]
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r11.f2404X
            r1 = r1[r40]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.f2355f
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r14.f2404X
            int r3 = r40 + 1
            r10 = r2[r3]
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r12.f2404X
            r2 = r2[r3]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r2.f2355f
            if (r1 == 0) goto L_0x04ce
            if (r13 == r14) goto L_0x04a8
            androidx.constraintlayout.core.SolverVariable r2 = r0.f2358i
            androidx.constraintlayout.core.SolverVariable r1 = r1.f2358i
            int r0 = r0.mo4310f()
            r15 = 5
            r9.mo4267e(r2, r1, r0, r15)
            goto L_0x04cf
        L_0x04a8:
            r15 = 5
            if (r11 == 0) goto L_0x04cf
            androidx.constraintlayout.core.SolverVariable r2 = r0.f2358i
            androidx.constraintlayout.core.SolverVariable r3 = r1.f2358i
            int r4 = r0.mo4310f()
            r5 = 1056964608(0x3f000000, float:0.5)
            androidx.constraintlayout.core.SolverVariable r6 = r10.f2358i
            androidx.constraintlayout.core.SolverVariable r7 = r11.f2358i
            int r8 = r10.mo4310f()
            r18 = 5
            r0 = r38
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r18
            r0.mo4265c(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x04cf
        L_0x04ce:
            r15 = 5
        L_0x04cf:
            if (r11 == 0) goto L_0x04df
            if (r13 == r14) goto L_0x04df
            androidx.constraintlayout.core.SolverVariable r0 = r10.f2358i
            androidx.constraintlayout.core.SolverVariable r1 = r11.f2358i
            int r2 = r10.mo4310f()
            int r2 = -r2
            r9.mo4267e(r0, r1, r2, r15)
        L_0x04df:
            if (r16 != 0) goto L_0x04e3
            if (r17 == 0) goto L_0x053d
        L_0x04e3:
            if (r13 == 0) goto L_0x053d
            if (r13 == r14) goto L_0x053d
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r13.f2404X
            r1 = r0[r40]
            if (r14 != 0) goto L_0x04ee
            r14 = r13
        L_0x04ee:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r14.f2404X
            r3 = 1
            int r3 = r40 + 1
            r2 = r2[r3]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r1.f2355f
            if (r4 == 0) goto L_0x04fc
            androidx.constraintlayout.core.SolverVariable r4 = r4.f2358i
            goto L_0x04fe
        L_0x04fc:
            r4 = r21
        L_0x04fe:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r2.f2355f
            if (r5 == 0) goto L_0x0505
            androidx.constraintlayout.core.SolverVariable r5 = r5.f2358i
            goto L_0x0507
        L_0x0505:
            r5 = r21
        L_0x0507:
            if (r12 == r14) goto L_0x0517
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r5 = r12.f2404X
            r5 = r5[r3]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.f2355f
            if (r5 == 0) goto L_0x0515
            androidx.constraintlayout.core.SolverVariable r5 = r5.f2358i
            r21 = r5
        L_0x0515:
            r5 = r21
        L_0x0517:
            if (r13 != r14) goto L_0x051b
            r2 = r0[r3]
        L_0x051b:
            if (r4 == 0) goto L_0x053d
            if (r5 == 0) goto L_0x053d
            r6 = 1056964608(0x3f000000, float:0.5)
            int r7 = r1.mo4310f()
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r14.f2404X
            r0 = r0[r3]
            int r8 = r0.mo4310f()
            androidx.constraintlayout.core.SolverVariable r1 = r1.f2358i
            androidx.constraintlayout.core.SolverVariable r10 = r2.f2358i
            r11 = 5
            r0 = r38
            r2 = r4
            r3 = r7
            r4 = r6
            r6 = r10
            r7 = r8
            r8 = r11
            r0.mo4265c(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x053d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.C0484b.m3629a(androidx.constraintlayout.core.widgets.d, androidx.constraintlayout.core.c, int, int, androidx.constraintlayout.core.widgets.c):void");
    }

    /* renamed from: b */
    public static void m3630b(C0486d dVar, C0467c cVar, ArrayList<ConstraintWidget> arrayList, int i) {
        C0485c[] cVarArr;
        int i2;
        int i3;
        if (i == 0) {
            i3 = dVar.f2529f1;
            cVarArr = dVar.f2532i1;
            i2 = 0;
        } else {
            int i4 = dVar.f2530g1;
            cVarArr = dVar.f2531h1;
            int i5 = i4;
            i2 = 2;
            i3 = i5;
        }
        for (int i6 = 0; i6 < i3; i6++) {
            C0485c cVar2 = cVarArr[i6];
            cVar2.mo4472a();
            if (arrayList == null || arrayList.contains(cVar2.f2497a)) {
                m3629a(dVar, cVar, i, i2, cVar2);
            }
        }
    }
}
