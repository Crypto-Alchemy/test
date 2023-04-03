package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.motion.widget.MotionHelper;

public class MotionEffect extends MotionHelper {

    /* renamed from: I */
    public float f2669I = 0.1f;

    /* renamed from: L */
    public int f2670L = 49;

    /* renamed from: M */
    public int f2671M = 50;

    /* renamed from: P */
    public int f2672P = 0;

    /* renamed from: Q */
    public int f2673Q = 0;

    /* renamed from: U */
    public boolean f2674U = true;

    /* renamed from: e0 */
    public int f2675e0 = -1;

    /* renamed from: k0 */
    public int f2676k0 = -1;

    public MotionEffect(Context context) {
        super(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x017d, code lost:
        if (r14 == com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON) goto L_0x017f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0191, code lost:
        if (r14 == com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON) goto L_0x017f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01a1, code lost:
        if (r15 == com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON) goto L_0x017f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01b1, code lost:
        if (r15 == com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON) goto L_0x0180;
     */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01b7  */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4641D(androidx.constraintlayout.motion.widget.MotionLayout r22, java.util.HashMap<android.view.View, p000.jy3> r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            android.view.ViewParent r2 = r21.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
            android.view.View[] r2 = r0.mo5054n(r2)
            if (r2 != 0) goto L_0x0022
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = p000.t21.m27243a()
            r1.append(r2)
            java.lang.String r2 = " views = null"
            r1.append(r2)
            return
        L_0x0022:
            ca3 r3 = new ca3
            r3.<init>()
            ca3 r4 = new ca3
            r4.<init>()
            float r5 = r0.f2669I
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            java.lang.String r6 = "alpha"
            r3.mo12027R(r6, r5)
            float r5 = r0.f2669I
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r4.mo12027R(r6, r5)
            int r5 = r0.f2670L
            r3.mo28002g(r5)
            int r5 = r0.f2671M
            r4.mo28002g(r5)
            xa3 r5 = new xa3
            r5.<init>()
            int r6 = r0.f2670L
            r5.mo28002g(r6)
            r6 = 0
            r5.mo27717m(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            java.lang.String r8 = "percentX"
            r5.mo27718n(r8, r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            java.lang.String r9 = "percentY"
            r5.mo27718n(r9, r7)
            xa3 r7 = new xa3
            r7.<init>()
            int r10 = r0.f2671M
            r7.mo28002g(r10)
            r7.mo27717m(r6)
            r10 = 1
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r7.mo27718n(r8, r11)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            r7.mo27718n(r9, r8)
            int r8 = r0.f2672P
            r9 = 0
            if (r8 <= 0) goto L_0x00b3
            ca3 r8 = new ca3
            r8.<init>()
            ca3 r11 = new ca3
            r11.<init>()
            int r12 = r0.f2672P
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.String r13 = "translationX"
            r8.mo12027R(r13, r12)
            int r12 = r0.f2671M
            r8.mo28002g(r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            r11.mo12027R(r13, r12)
            int r12 = r0.f2671M
            int r12 = r12 - r10
            r11.mo28002g(r12)
            goto L_0x00b5
        L_0x00b3:
            r8 = r9
            r11 = r8
        L_0x00b5:
            int r12 = r0.f2673Q
            if (r12 <= 0) goto L_0x00e1
            ca3 r9 = new ca3
            r9.<init>()
            ca3 r12 = new ca3
            r12.<init>()
            int r13 = r0.f2673Q
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.String r14 = "translationY"
            r9.mo12027R(r14, r13)
            int r13 = r0.f2671M
            r9.mo28002g(r13)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r6)
            r12.mo12027R(r14, r13)
            int r13 = r0.f2671M
            int r13 = r13 - r10
            r12.mo28002g(r13)
            goto L_0x00e2
        L_0x00e1:
            r12 = r9
        L_0x00e2:
            int r13 = r0.f2676k0
            r15 = -1
            r17 = 0
            if (r13 != r15) goto L_0x014b
            r13 = 4
            int[] r15 = new int[r13]
            r13 = r6
        L_0x00ed:
            int r14 = r2.length
            if (r13 >= r14) goto L_0x013a
            r14 = r2[r13]
            java.lang.Object r14 = r1.get(r14)
            jy3 r14 = (p000.jy3) r14
            if (r14 != 0) goto L_0x00fb
            goto L_0x0137
        L_0x00fb:
            float r19 = r14.mo22125n()
            float r20 = r14.mo22130t()
            float r19 = r19 - r20
            float r20 = r14.mo22126o()
            float r14 = r14.mo22132u()
            float r20 = r20 - r14
            int r14 = (r20 > r17 ? 1 : (r20 == r17 ? 0 : -1))
            if (r14 >= 0) goto L_0x0118
            r14 = r15[r10]
            int r14 = r14 + r10
            r15[r10] = r14
        L_0x0118:
            int r14 = (r20 > r17 ? 1 : (r20 == r17 ? 0 : -1))
            if (r14 <= 0) goto L_0x0121
            r14 = r15[r6]
            int r14 = r14 + r10
            r15[r6] = r14
        L_0x0121:
            int r14 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r14 <= 0) goto L_0x012c
            r14 = 3
            r18 = r15[r14]
            int r18 = r18 + 1
            r15[r14] = r18
        L_0x012c:
            int r14 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r14 >= 0) goto L_0x0137
            r14 = 2
            r16 = r15[r14]
            int r16 = r16 + 1
            r15[r14] = r16
        L_0x0137:
            int r13 = r13 + 1
            goto L_0x00ed
        L_0x013a:
            r13 = r15[r6]
            r14 = r13
            r13 = r6
            r6 = r10
        L_0x013f:
            r10 = 4
            if (r6 >= r10) goto L_0x014b
            r10 = r15[r6]
            if (r14 >= r10) goto L_0x0148
            r13 = r6
            r14 = r10
        L_0x0148:
            int r6 = r6 + 1
            goto L_0x013f
        L_0x014b:
            r6 = 0
        L_0x014c:
            int r10 = r2.length
            if (r6 >= r10) goto L_0x01ea
            r10 = r2[r6]
            java.lang.Object r10 = r1.get(r10)
            jy3 r10 = (p000.jy3) r10
            if (r10 != 0) goto L_0x015e
        L_0x0159:
            r1 = r22
            r15 = -1
            goto L_0x01e4
        L_0x015e:
            float r14 = r10.mo22125n()
            float r15 = r10.mo22130t()
            float r14 = r14 - r15
            float r15 = r10.mo22126o()
            float r20 = r10.mo22132u()
            float r15 = r15 - r20
            if (r13 != 0) goto L_0x0184
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 <= 0) goto L_0x0182
            boolean r15 = r0.f2674U
            if (r15 == 0) goto L_0x017f
            int r14 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r14 != 0) goto L_0x0182
        L_0x017f:
            r1 = 3
        L_0x0180:
            r14 = 0
            goto L_0x01b5
        L_0x0182:
            r1 = 3
            goto L_0x01b4
        L_0x0184:
            r1 = 1
            if (r13 != r1) goto L_0x0194
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L_0x0182
            boolean r15 = r0.f2674U
            if (r15 == 0) goto L_0x017f
            int r14 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r14 != 0) goto L_0x0182
            goto L_0x017f
        L_0x0194:
            r1 = 2
            if (r13 != r1) goto L_0x01a4
            int r14 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r14 >= 0) goto L_0x0182
            boolean r14 = r0.f2674U
            if (r14 == 0) goto L_0x017f
            int r14 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r14 != 0) goto L_0x0182
            goto L_0x017f
        L_0x01a4:
            r1 = 3
            if (r13 != r1) goto L_0x01b4
            int r14 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r14 <= 0) goto L_0x01b4
            boolean r14 = r0.f2674U
            if (r14 == 0) goto L_0x0180
            int r14 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r14 != 0) goto L_0x01b4
            goto L_0x0180
        L_0x01b4:
            r14 = 1
        L_0x01b5:
            if (r14 == 0) goto L_0x0159
            int r14 = r0.f2675e0
            r15 = -1
            if (r14 != r15) goto L_0x01df
            r10.mo22112a(r3)
            r10.mo22112a(r4)
            r10.mo22112a(r5)
            r10.mo22112a(r7)
            int r14 = r0.f2672P
            if (r14 <= 0) goto L_0x01d2
            r10.mo22112a(r8)
            r10.mo22112a(r11)
        L_0x01d2:
            int r14 = r0.f2673Q
            if (r14 <= 0) goto L_0x01dc
            r10.mo22112a(r9)
            r10.mo22112a(r12)
        L_0x01dc:
            r1 = r22
            goto L_0x01e4
        L_0x01df:
            r1 = r22
            r1.mo4659S(r14, r10)
        L_0x01e4:
            int r6 = r6 + 1
            r1 = r23
            goto L_0x014c
        L_0x01ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.MotionEffect.mo4641D(androidx.constraintlayout.motion.widget.MotionLayout, java.util.HashMap):void");
    }

    /* renamed from: E */
    public final void mo4642E(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c65.MotionEffect);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == c65.MotionEffect_motionEffect_start) {
                    int i2 = obtainStyledAttributes.getInt(index, this.f2670L);
                    this.f2670L = i2;
                    this.f2670L = Math.max(Math.min(i2, 99), 0);
                } else if (index == c65.MotionEffect_motionEffect_end) {
                    int i3 = obtainStyledAttributes.getInt(index, this.f2671M);
                    this.f2671M = i3;
                    this.f2671M = Math.max(Math.min(i3, 99), 0);
                } else if (index == c65.MotionEffect_motionEffect_translationX) {
                    this.f2672P = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2672P);
                } else if (index == c65.MotionEffect_motionEffect_translationY) {
                    this.f2673Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2673Q);
                } else if (index == c65.MotionEffect_motionEffect_alpha) {
                    this.f2669I = obtainStyledAttributes.getFloat(index, this.f2669I);
                } else if (index == c65.MotionEffect_motionEffect_move) {
                    this.f2676k0 = obtainStyledAttributes.getInt(index, this.f2676k0);
                } else if (index == c65.MotionEffect_motionEffect_strict) {
                    this.f2674U = obtainStyledAttributes.getBoolean(index, this.f2674U);
                } else if (index == c65.MotionEffect_motionEffect_viewTransition) {
                    this.f2675e0 = obtainStyledAttributes.getResourceId(index, this.f2675e0);
                }
            }
            int i4 = this.f2670L;
            int i5 = this.f2671M;
            if (i4 == i5) {
                if (i4 > 0) {
                    this.f2670L = i4 - 1;
                } else {
                    this.f2671M = i5 + 1;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: x */
    public boolean mo4643x() {
        return true;
    }

    public MotionEffect(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo4642E(context, attributeSet);
    }

    public MotionEffect(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo4642E(context, attributeSet);
    }
}
