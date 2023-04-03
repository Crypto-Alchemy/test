package p000;

import androidx.constraintlayout.core.widgets.C0486d;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ad0 */
/* compiled from: ChainRun */
public class ad0 extends WidgetRun {

    /* renamed from: k */
    public ArrayList<WidgetRun> f91k = new ArrayList<>();

    /* renamed from: l */
    public int f92l;

    public ad0(ConstraintWidget constraintWidget, int i) {
        super(constraintWidget);
        this.f2484f = i;
        mo147q();
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo141a(p000.jc1 r27) {
        /*
            r26 = this;
            r0 = r26
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r0.f2486h
            boolean r1 = r1.f2475j
            if (r1 == 0) goto L_0x0427
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r0.f2487i
            boolean r1 = r1.f2475j
            if (r1 != 0) goto L_0x0010
            goto L_0x0427
        L_0x0010:
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r0.f2480b
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.mo4351M()
            boolean r2 = r1 instanceof androidx.constraintlayout.core.widgets.C0486d
            if (r2 == 0) goto L_0x0021
            androidx.constraintlayout.core.widgets.d r1 = (androidx.constraintlayout.core.widgets.C0486d) r1
            boolean r1 = r1.mo4486M1()
            goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r0.f2487i
            int r2 = r2.f2472g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r0.f2486h
            int r4 = r4.f2472g
            int r2 = r2 - r4
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r4 = r0.f91k
            int r4 = r4.size()
            r5 = 0
        L_0x0032:
            r6 = -1
            r7 = 8
            if (r5 >= r4) goto L_0x004a
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r8 = r0.f91k
            java.lang.Object r8 = r8.get(r5)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r8 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r8
            androidx.constraintlayout.core.widgets.ConstraintWidget r8 = r8.f2480b
            int r8 = r8.mo4367U()
            if (r8 != r7) goto L_0x004b
            int r5 = r5 + 1
            goto L_0x0032
        L_0x004a:
            r5 = r6
        L_0x004b:
            int r8 = r4 + -1
            r9 = r8
        L_0x004e:
            if (r9 < 0) goto L_0x0064
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r10 = r0.f91k
            java.lang.Object r10 = r10.get(r9)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r10 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r10
            androidx.constraintlayout.core.widgets.ConstraintWidget r10 = r10.f2480b
            int r10 = r10.mo4367U()
            if (r10 != r7) goto L_0x0063
            int r9 = r9 + -1
            goto L_0x004e
        L_0x0063:
            r6 = r9
        L_0x0064:
            r9 = 0
        L_0x0065:
            r11 = 2
            if (r9 >= r11) goto L_0x0109
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x006f:
            if (r13 >= r4) goto L_0x00fb
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r3 = r0.f91k
            java.lang.Object r3 = r3.get(r13)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r3 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r3
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = r3.f2480b
            int r11 = r11.mo4367U()
            if (r11 != r7) goto L_0x0083
            goto L_0x00f4
        L_0x0083:
            int r16 = r16 + 1
            if (r13 <= 0) goto L_0x008e
            if (r13 < r5) goto L_0x008e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r11 = r3.f2486h
            int r11 = r11.f2471f
            int r14 = r14 + r11
        L_0x008e:
            androidx.constraintlayout.core.widgets.analyzer.a r11 = r3.f2483e
            int r7 = r11.f2472g
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = r3.f2482d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r10 == r12) goto L_0x009a
            r10 = 1
            goto L_0x009b
        L_0x009a:
            r10 = 0
        L_0x009b:
            if (r10 == 0) goto L_0x00bd
            int r11 = r0.f2484f
            if (r11 != 0) goto L_0x00ac
            androidx.constraintlayout.core.widgets.ConstraintWidget r12 = r3.f2480b
            androidx.constraintlayout.core.widgets.analyzer.c r12 = r12.f2415e
            androidx.constraintlayout.core.widgets.analyzer.a r12 = r12.f2483e
            boolean r12 = r12.f2475j
            if (r12 != 0) goto L_0x00ac
            return
        L_0x00ac:
            r12 = 1
            if (r11 != r12) goto L_0x00ba
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = r3.f2480b
            androidx.constraintlayout.core.widgets.analyzer.d r11 = r11.f2417f
            androidx.constraintlayout.core.widgets.analyzer.a r11 = r11.f2483e
            boolean r11 = r11.f2475j
            if (r11 != 0) goto L_0x00ba
            return
        L_0x00ba:
            r19 = r7
            goto L_0x00d3
        L_0x00bd:
            r19 = r7
            r12 = 1
            int r7 = r3.f2479a
            if (r7 != r12) goto L_0x00cb
            if (r9 != 0) goto L_0x00cb
            int r7 = r11.f2491m
            int r15 = r15 + 1
            goto L_0x00d1
        L_0x00cb:
            boolean r7 = r11.f2475j
            if (r7 == 0) goto L_0x00d3
            r7 = r19
        L_0x00d1:
            r10 = 1
            goto L_0x00d5
        L_0x00d3:
            r7 = r19
        L_0x00d5:
            if (r10 != 0) goto L_0x00e9
            int r15 = r15 + 1
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r3.f2480b
            float[] r7 = r7.f2387M0
            int r10 = r0.f2484f
            r7 = r7[r10]
            r10 = 0
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 < 0) goto L_0x00ea
            float r17 = r17 + r7
            goto L_0x00ea
        L_0x00e9:
            int r14 = r14 + r7
        L_0x00ea:
            if (r13 >= r8) goto L_0x00f4
            if (r13 >= r6) goto L_0x00f4
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r3.f2487i
            int r3 = r3.f2471f
            int r3 = -r3
            int r14 = r14 + r3
        L_0x00f4:
            int r13 = r13 + 1
            r7 = 8
            r11 = 2
            goto L_0x006f
        L_0x00fb:
            if (r14 < r2) goto L_0x0106
            if (r15 != 0) goto L_0x0100
            goto L_0x0106
        L_0x0100:
            int r9 = r9 + 1
            r7 = 8
            goto L_0x0065
        L_0x0106:
            r3 = r16
            goto L_0x010e
        L_0x0109:
            r3 = 0
            r14 = 0
            r15 = 0
            r17 = 0
        L_0x010e:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r0.f2486h
            int r7 = r7.f2472g
            if (r1 == 0) goto L_0x0118
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r0.f2487i
            int r7 = r7.f2472g
        L_0x0118:
            r9 = 1056964608(0x3f000000, float:0.5)
            if (r14 <= r2) goto L_0x012f
            r10 = 1073741824(0x40000000, float:2.0)
            if (r1 == 0) goto L_0x0128
            int r11 = r14 - r2
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            int r7 = r7 + r10
            goto L_0x012f
        L_0x0128:
            int r11 = r14 - r2
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            int r7 = r7 - r10
        L_0x012f:
            if (r15 <= 0) goto L_0x0226
            int r10 = r2 - r14
            float r10 = (float) r10
            float r11 = (float) r15
            float r11 = r10 / r11
            float r11 = r11 + r9
            int r11 = (int) r11
            r12 = 0
            r13 = 0
        L_0x013b:
            if (r12 >= r4) goto L_0x01d8
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r9 = r0.f91k
            java.lang.Object r9 = r9.get(r12)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r9 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r9
            r19 = r11
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = r9.f2480b
            int r11 = r11.mo4367U()
            r20 = r14
            r14 = 8
            if (r11 != r14) goto L_0x0155
            goto L_0x01be
        L_0x0155:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r9.f2482d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r14) goto L_0x01be
            androidx.constraintlayout.core.widgets.analyzer.a r11 = r9.f2483e
            boolean r14 = r11.f2475j
            if (r14 != 0) goto L_0x01be
            r14 = 0
            int r18 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r18 <= 0) goto L_0x0178
            androidx.constraintlayout.core.widgets.ConstraintWidget r14 = r9.f2480b
            float[] r14 = r14.f2387M0
            r21 = r7
            int r7 = r0.f2484f
            r7 = r14[r7]
            float r7 = r7 * r10
            float r7 = r7 / r17
            r14 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r14
            int r7 = (int) r7
            goto L_0x017c
        L_0x0178:
            r21 = r7
            r7 = r19
        L_0x017c:
            int r14 = r0.f2484f
            if (r14 != 0) goto L_0x018b
            androidx.constraintlayout.core.widgets.ConstraintWidget r14 = r9.f2480b
            r22 = r10
            int r10 = r14.f2457z
            int r14 = r14.f2455y
            r23 = r1
            goto L_0x019a
        L_0x018b:
            r22 = r10
            androidx.constraintlayout.core.widgets.ConstraintWidget r10 = r9.f2480b
            int r14 = r10.f2366C
            int r10 = r10.f2364B
            r23 = r1
            r25 = r14
            r14 = r10
            r10 = r25
        L_0x019a:
            int r1 = r9.f2479a
            r24 = r3
            r3 = 1
            if (r1 != r3) goto L_0x01a8
            int r1 = r11.f2491m
            int r1 = java.lang.Math.min(r7, r1)
            goto L_0x01a9
        L_0x01a8:
            r1 = r7
        L_0x01a9:
            int r1 = java.lang.Math.max(r14, r1)
            if (r10 <= 0) goto L_0x01b3
            int r1 = java.lang.Math.min(r10, r1)
        L_0x01b3:
            if (r1 == r7) goto L_0x01b8
            int r13 = r13 + 1
            r7 = r1
        L_0x01b8:
            androidx.constraintlayout.core.widgets.analyzer.a r1 = r9.f2483e
            r1.mo4454d(r7)
            goto L_0x01c6
        L_0x01be:
            r23 = r1
            r24 = r3
            r21 = r7
            r22 = r10
        L_0x01c6:
            int r12 = r12 + 1
            r11 = r19
            r14 = r20
            r7 = r21
            r10 = r22
            r1 = r23
            r3 = r24
            r9 = 1056964608(0x3f000000, float:0.5)
            goto L_0x013b
        L_0x01d8:
            r23 = r1
            r24 = r3
            r21 = r7
            r20 = r14
            if (r13 <= 0) goto L_0x0217
            int r15 = r15 - r13
            r1 = 0
            r3 = 0
        L_0x01e5:
            if (r1 >= r4) goto L_0x0215
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r7 = r0.f91k
            java.lang.Object r7 = r7.get(r1)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r7 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r7
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r7.f2480b
            int r9 = r9.mo4367U()
            r10 = 8
            if (r9 != r10) goto L_0x01fa
            goto L_0x0212
        L_0x01fa:
            if (r1 <= 0) goto L_0x0203
            if (r1 < r5) goto L_0x0203
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r7.f2486h
            int r9 = r9.f2471f
            int r3 = r3 + r9
        L_0x0203:
            androidx.constraintlayout.core.widgets.analyzer.a r9 = r7.f2483e
            int r9 = r9.f2472g
            int r3 = r3 + r9
            if (r1 >= r8) goto L_0x0212
            if (r1 >= r6) goto L_0x0212
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r7.f2487i
            int r7 = r7.f2471f
            int r7 = -r7
            int r3 = r3 + r7
        L_0x0212:
            int r1 = r1 + 1
            goto L_0x01e5
        L_0x0215:
            r14 = r3
            goto L_0x0219
        L_0x0217:
            r14 = r20
        L_0x0219:
            int r1 = r0.f92l
            r3 = 2
            if (r1 != r3) goto L_0x0224
            if (r13 != 0) goto L_0x0224
            r1 = 0
            r0.f92l = r1
            goto L_0x0230
        L_0x0224:
            r1 = 0
            goto L_0x0230
        L_0x0226:
            r23 = r1
            r24 = r3
            r21 = r7
            r20 = r14
            r1 = 0
            r3 = 2
        L_0x0230:
            if (r14 <= r2) goto L_0x0234
            r0.f92l = r3
        L_0x0234:
            if (r24 <= 0) goto L_0x023c
            if (r15 != 0) goto L_0x023c
            if (r5 != r6) goto L_0x023c
            r0.f92l = r3
        L_0x023c:
            int r3 = r0.f92l
            r7 = 1
            if (r3 != r7) goto L_0x02e0
            r9 = r24
            if (r9 <= r7) goto L_0x024a
            int r2 = r2 - r14
            int r3 = r9 + -1
            int r2 = r2 / r3
            goto L_0x0251
        L_0x024a:
            if (r9 != r7) goto L_0x0250
            int r2 = r2 - r14
            r3 = 2
            int r2 = r2 / r3
            goto L_0x0251
        L_0x0250:
            r2 = r1
        L_0x0251:
            if (r15 <= 0) goto L_0x0254
            r2 = r1
        L_0x0254:
            r3 = r1
            r7 = r21
        L_0x0257:
            if (r3 >= r4) goto L_0x0427
            if (r23 == 0) goto L_0x0260
            int r1 = r3 + 1
            int r1 = r4 - r1
            goto L_0x0261
        L_0x0260:
            r1 = r3
        L_0x0261:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r9 = r0.f91k
            java.lang.Object r1 = r9.get(r1)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r1 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r1
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r1.f2480b
            int r9 = r9.mo4367U()
            r10 = 8
            if (r9 != r10) goto L_0x027e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.f2486h
            r9.mo4454d(r7)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.f2487i
            r1.mo4454d(r7)
            goto L_0x02dc
        L_0x027e:
            if (r3 <= 0) goto L_0x0285
            if (r23 == 0) goto L_0x0284
            int r7 = r7 - r2
            goto L_0x0285
        L_0x0284:
            int r7 = r7 + r2
        L_0x0285:
            if (r3 <= 0) goto L_0x0296
            if (r3 < r5) goto L_0x0296
            if (r23 == 0) goto L_0x0291
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.f2486h
            int r9 = r9.f2471f
            int r7 = r7 - r9
            goto L_0x0296
        L_0x0291:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.f2486h
            int r9 = r9.f2471f
            int r7 = r7 + r9
        L_0x0296:
            if (r23 == 0) goto L_0x029e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.f2487i
            r9.mo4454d(r7)
            goto L_0x02a3
        L_0x029e:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.f2486h
            r9.mo4454d(r7)
        L_0x02a3:
            androidx.constraintlayout.core.widgets.analyzer.a r9 = r1.f2483e
            int r10 = r9.f2472g
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r1.f2482d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x02b4
            int r11 = r1.f2479a
            r12 = 1
            if (r11 != r12) goto L_0x02b4
            int r10 = r9.f2491m
        L_0x02b4:
            if (r23 == 0) goto L_0x02b8
            int r7 = r7 - r10
            goto L_0x02b9
        L_0x02b8:
            int r7 = r7 + r10
        L_0x02b9:
            if (r23 == 0) goto L_0x02c1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.f2486h
            r9.mo4454d(r7)
            goto L_0x02c6
        L_0x02c1:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.f2487i
            r9.mo4454d(r7)
        L_0x02c6:
            r9 = 1
            r1.f2485g = r9
            if (r3 >= r8) goto L_0x02dc
            if (r3 >= r6) goto L_0x02dc
            if (r23 == 0) goto L_0x02d6
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.f2487i
            int r1 = r1.f2471f
            int r1 = -r1
            int r7 = r7 - r1
            goto L_0x02dc
        L_0x02d6:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.f2487i
            int r1 = r1.f2471f
            int r1 = -r1
            int r7 = r7 + r1
        L_0x02dc:
            int r3 = r3 + 1
            goto L_0x0257
        L_0x02e0:
            r9 = r24
            if (r3 != 0) goto L_0x0377
            int r2 = r2 - r14
            r3 = 1
            int r7 = r9 + 1
            int r2 = r2 / r7
            if (r15 <= 0) goto L_0x02ec
            r2 = r1
        L_0x02ec:
            r3 = r1
            r7 = r21
        L_0x02ef:
            if (r3 >= r4) goto L_0x0427
            if (r23 == 0) goto L_0x02f8
            int r1 = r3 + 1
            int r1 = r4 - r1
            goto L_0x02f9
        L_0x02f8:
            r1 = r3
        L_0x02f9:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r9 = r0.f91k
            java.lang.Object r1 = r9.get(r1)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r1 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r1
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r1.f2480b
            int r9 = r9.mo4367U()
            r10 = 8
            if (r9 != r10) goto L_0x0316
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.f2486h
            r9.mo4454d(r7)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.f2487i
            r1.mo4454d(r7)
            goto L_0x0373
        L_0x0316:
            if (r23 == 0) goto L_0x031a
            int r7 = r7 - r2
            goto L_0x031b
        L_0x031a:
            int r7 = r7 + r2
        L_0x031b:
            if (r3 <= 0) goto L_0x032c
            if (r3 < r5) goto L_0x032c
            if (r23 == 0) goto L_0x0327
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.f2486h
            int r9 = r9.f2471f
            int r7 = r7 - r9
            goto L_0x032c
        L_0x0327:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.f2486h
            int r9 = r9.f2471f
            int r7 = r7 + r9
        L_0x032c:
            if (r23 == 0) goto L_0x0334
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.f2487i
            r9.mo4454d(r7)
            goto L_0x0339
        L_0x0334:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.f2486h
            r9.mo4454d(r7)
        L_0x0339:
            androidx.constraintlayout.core.widgets.analyzer.a r9 = r1.f2483e
            int r10 = r9.f2472g
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r1.f2482d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x034e
            int r11 = r1.f2479a
            r12 = 1
            if (r11 != r12) goto L_0x034e
            int r9 = r9.f2491m
            int r10 = java.lang.Math.min(r10, r9)
        L_0x034e:
            if (r23 == 0) goto L_0x0352
            int r7 = r7 - r10
            goto L_0x0353
        L_0x0352:
            int r7 = r7 + r10
        L_0x0353:
            if (r23 == 0) goto L_0x035b
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.f2486h
            r9.mo4454d(r7)
            goto L_0x0360
        L_0x035b:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.f2487i
            r9.mo4454d(r7)
        L_0x0360:
            if (r3 >= r8) goto L_0x0373
            if (r3 >= r6) goto L_0x0373
            if (r23 == 0) goto L_0x036d
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.f2487i
            int r1 = r1.f2471f
            int r1 = -r1
            int r7 = r7 - r1
            goto L_0x0373
        L_0x036d:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.f2487i
            int r1 = r1.f2471f
            int r1 = -r1
            int r7 = r7 + r1
        L_0x0373:
            int r3 = r3 + 1
            goto L_0x02ef
        L_0x0377:
            r7 = 2
            if (r3 != r7) goto L_0x0427
            int r3 = r0.f2484f
            if (r3 != 0) goto L_0x0385
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f2480b
            float r3 = r3.mo4327A()
            goto L_0x038b
        L_0x0385:
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f2480b
            float r3 = r3.mo4359Q()
        L_0x038b:
            if (r23 == 0) goto L_0x0391
            r7 = 1065353216(0x3f800000, float:1.0)
            float r3 = r7 - r3
        L_0x0391:
            int r2 = r2 - r14
            float r2 = (float) r2
            float r2 = r2 * r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r3
            int r2 = (int) r2
            if (r2 < 0) goto L_0x039c
            if (r15 <= 0) goto L_0x039d
        L_0x039c:
            r2 = r1
        L_0x039d:
            if (r23 == 0) goto L_0x03a2
            int r7 = r21 - r2
            goto L_0x03a4
        L_0x03a2:
            int r7 = r21 + r2
        L_0x03a4:
            r3 = r1
        L_0x03a5:
            if (r3 >= r4) goto L_0x0427
            if (r23 == 0) goto L_0x03ae
            int r1 = r3 + 1
            int r1 = r4 - r1
            goto L_0x03af
        L_0x03ae:
            r1 = r3
        L_0x03af:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r2 = r0.f91k
            java.lang.Object r1 = r2.get(r1)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r1 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r1
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r1.f2480b
            int r2 = r2.mo4367U()
            r9 = 8
            if (r2 != r9) goto L_0x03cd
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r1.f2486h
            r2.mo4454d(r7)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.f2487i
            r1.mo4454d(r7)
            r12 = 1
            goto L_0x0423
        L_0x03cd:
            if (r3 <= 0) goto L_0x03de
            if (r3 < r5) goto L_0x03de
            if (r23 == 0) goto L_0x03d9
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r1.f2486h
            int r2 = r2.f2471f
            int r7 = r7 - r2
            goto L_0x03de
        L_0x03d9:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r1.f2486h
            int r2 = r2.f2471f
            int r7 = r7 + r2
        L_0x03de:
            if (r23 == 0) goto L_0x03e6
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r1.f2487i
            r2.mo4454d(r7)
            goto L_0x03eb
        L_0x03e6:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r1.f2486h
            r2.mo4454d(r7)
        L_0x03eb:
            androidx.constraintlayout.core.widgets.analyzer.a r2 = r1.f2483e
            int r10 = r2.f2472g
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r1.f2482d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x03fd
            int r11 = r1.f2479a
            r12 = 1
            if (r11 != r12) goto L_0x03fe
            int r10 = r2.f2491m
            goto L_0x03fe
        L_0x03fd:
            r12 = 1
        L_0x03fe:
            if (r23 == 0) goto L_0x0402
            int r7 = r7 - r10
            goto L_0x0403
        L_0x0402:
            int r7 = r7 + r10
        L_0x0403:
            if (r23 == 0) goto L_0x040b
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r1.f2486h
            r2.mo4454d(r7)
            goto L_0x0410
        L_0x040b:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r1.f2487i
            r2.mo4454d(r7)
        L_0x0410:
            if (r3 >= r8) goto L_0x0423
            if (r3 >= r6) goto L_0x0423
            if (r23 == 0) goto L_0x041d
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.f2487i
            int r1 = r1.f2471f
            int r1 = -r1
            int r7 = r7 - r1
            goto L_0x0423
        L_0x041d:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.f2487i
            int r1 = r1.f2471f
            int r1 = -r1
            int r7 = r7 + r1
        L_0x0423:
            int r3 = r3 + 1
            goto L_0x03a5
        L_0x0427:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ad0.mo141a(jc1):void");
    }

    /* renamed from: d */
    public void mo142d() {
        Iterator<WidgetRun> it = this.f91k.iterator();
        while (it.hasNext()) {
            it.next().mo142d();
        }
        int size = this.f91k.size();
        if (size >= 1) {
            ConstraintWidget constraintWidget = this.f91k.get(0).f2480b;
            ConstraintWidget constraintWidget2 = this.f91k.get(size - 1).f2480b;
            if (this.f2484f == 0) {
                ConstraintAnchor constraintAnchor = constraintWidget.f2392P;
                ConstraintAnchor constraintAnchor2 = constraintWidget2.f2396R;
                DependencyNode i = mo4460i(constraintAnchor, 0);
                int f = constraintAnchor.mo4310f();
                ConstraintWidget r = mo148r();
                if (r != null) {
                    f = r.f2392P.mo4310f();
                }
                if (i != null) {
                    mo4456b(this.f2486h, i, f);
                }
                DependencyNode i2 = mo4460i(constraintAnchor2, 0);
                int f2 = constraintAnchor2.mo4310f();
                ConstraintWidget s = mo149s();
                if (s != null) {
                    f2 = s.f2396R.mo4310f();
                }
                if (i2 != null) {
                    mo4456b(this.f2487i, i2, -f2);
                }
            } else {
                ConstraintAnchor constraintAnchor3 = constraintWidget.f2394Q;
                ConstraintAnchor constraintAnchor4 = constraintWidget2.f2398S;
                DependencyNode i3 = mo4460i(constraintAnchor3, 1);
                int f3 = constraintAnchor3.mo4310f();
                ConstraintWidget r2 = mo148r();
                if (r2 != null) {
                    f3 = r2.f2394Q.mo4310f();
                }
                if (i3 != null) {
                    mo4456b(this.f2486h, i3, f3);
                }
                DependencyNode i4 = mo4460i(constraintAnchor4, 1);
                int f4 = constraintAnchor4.mo4310f();
                ConstraintWidget s2 = mo149s();
                if (s2 != null) {
                    f4 = s2.f2398S.mo4310f();
                }
                if (i4 != null) {
                    mo4456b(this.f2487i, i4, -f4);
                }
            }
            this.f2486h.f2466a = this;
            this.f2487i.f2466a = this;
        }
    }

    /* renamed from: e */
    public void mo143e() {
        for (int i = 0; i < this.f91k.size(); i++) {
            this.f91k.get(i).mo143e();
        }
    }

    /* renamed from: f */
    public void mo144f() {
        this.f2481c = null;
        Iterator<WidgetRun> it = this.f91k.iterator();
        while (it.hasNext()) {
            it.next().mo144f();
        }
    }

    /* renamed from: j */
    public long mo145j() {
        int size = this.f91k.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            WidgetRun widgetRun = this.f91k.get(i);
            j = j + ((long) widgetRun.f2486h.f2471f) + widgetRun.mo145j() + ((long) widgetRun.f2487i.f2471f);
        }
        return j;
    }

    /* renamed from: m */
    public boolean mo146m() {
        int size = this.f91k.size();
        for (int i = 0; i < size; i++) {
            if (!this.f91k.get(i).mo146m()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: q */
    public final void mo147q() {
        ConstraintWidget constraintWidget;
        boolean z;
        int i;
        ConstraintWidget constraintWidget2 = this.f2480b;
        ConstraintWidget N = constraintWidget2.mo4353N(this.f2484f);
        while (true) {
            ConstraintWidget constraintWidget3 = N;
            constraintWidget = constraintWidget2;
            constraintWidget2 = constraintWidget3;
            if (constraintWidget2 == null) {
                break;
            }
            N = constraintWidget2.mo4353N(this.f2484f);
        }
        this.f2480b = constraintWidget;
        this.f91k.add(constraintWidget.mo4357P(this.f2484f));
        ConstraintWidget L = constraintWidget.mo4349L(this.f2484f);
        while (L != null) {
            this.f91k.add(L.mo4357P(this.f2484f));
            L = L.mo4349L(this.f2484f);
        }
        Iterator<WidgetRun> it = this.f91k.iterator();
        while (it.hasNext()) {
            WidgetRun next = it.next();
            int i2 = this.f2484f;
            if (i2 == 0) {
                next.f2480b.f2411c = this;
            } else if (i2 == 1) {
                next.f2480b.f2413d = this;
            }
        }
        if (this.f2484f != 0 || !((C0486d) this.f2480b.mo4351M()).mo4486M1()) {
            z = false;
        } else {
            z = true;
        }
        if (z && this.f91k.size() > 1) {
            ArrayList<WidgetRun> arrayList = this.f91k;
            this.f2480b = arrayList.get(arrayList.size() - 1).f2480b;
        }
        if (this.f2484f == 0) {
            i = this.f2480b.mo4329B();
        } else {
            i = this.f2480b.mo4361R();
        }
        this.f92l = i;
    }

    /* renamed from: r */
    public final ConstraintWidget mo148r() {
        for (int i = 0; i < this.f91k.size(); i++) {
            WidgetRun widgetRun = this.f91k.get(i);
            if (widgetRun.f2480b.mo4367U() != 8) {
                return widgetRun.f2480b;
            }
        }
        return null;
    }

    /* renamed from: s */
    public final ConstraintWidget mo149s() {
        for (int size = this.f91k.size() - 1; size >= 0; size--) {
            WidgetRun widgetRun = this.f91k.get(size);
            if (widgetRun.f2480b.mo4367U() != 8) {
                return widgetRun.f2480b;
            }
        }
        return null;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ChainRun ");
        if (this.f2484f == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        sb.append(str);
        Iterator<WidgetRun> it = this.f91k.iterator();
        while (it.hasNext()) {
            sb.append("<");
            sb.append(it.next());
            sb.append("> ");
        }
        return sb.toString();
    }
}
