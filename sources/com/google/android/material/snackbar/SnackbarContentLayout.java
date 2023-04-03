package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.mikephil.charting.utils.Utils;

public class SnackbarContentLayout extends LinearLayout implements wr0 {

    /* renamed from: a */
    public TextView f24329a;

    /* renamed from: d */
    public Button f24330d;

    /* renamed from: e */
    public int f24331e;

    /* renamed from: g */
    public int f24332g;

    public SnackbarContentLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: d */
    public static void m35962d(View view, int i, int i2) {
        if (ga7.m17749V(view)) {
            ga7.m17722E0(view, ga7.m17725G(view), i, ga7.m17723F(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    /* renamed from: a */
    public void mo33558a(int i, int i2) {
        this.f24329a.setAlpha(Utils.FLOAT_EPSILON);
        long j = (long) i2;
        long j2 = (long) i;
        this.f24329a.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f24330d.getVisibility() == 0) {
            this.f24330d.setAlpha(Utils.FLOAT_EPSILON);
            this.f24330d.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    /* renamed from: b */
    public void mo33559b(int i, int i2) {
        this.f24329a.setAlpha(1.0f);
        long j = (long) i2;
        long j2 = (long) i;
        this.f24329a.animate().alpha(Utils.FLOAT_EPSILON).setDuration(j).setStartDelay(j2).start();
        if (this.f24330d.getVisibility() == 0) {
            this.f24330d.setAlpha(1.0f);
            this.f24330d.animate().alpha(Utils.FLOAT_EPSILON).setDuration(j).setStartDelay(j2).start();
        }
    }

    /* renamed from: c */
    public void mo33560c(float f) {
        if (f != 1.0f) {
            this.f24330d.setTextColor(ro3.m51202h(ro3.m51198d(this, j15.colorSurface), this.f24330d.getCurrentTextColor(), f));
        }
    }

    /* renamed from: e */
    public final boolean mo33561e(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f24329a.getPaddingTop() == i2 && this.f24329a.getPaddingBottom() == i3) {
            return z;
        }
        m35962d(this.f24329a, i2, i3);
        return true;
    }

    public Button getActionView() {
        return this.f24330d;
    }

    public TextView getMessageView() {
        return this.f24329a;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f24329a = (TextView) findViewById(g35.snackbar_text);
        this.f24330d = (Button) findViewById(g35.snackbar_action);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (mo33561e(1, r0, r0 - r1) != false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (mo33561e(0, r0, r0) != false) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.f24331e
            if (r0 <= 0) goto L_0x0018
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.f24331e
            if (r0 <= r1) goto L_0x0018
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L_0x0018:
            android.content.res.Resources r0 = r7.getResources()
            int r1 = p000.k25.design_snackbar_padding_vertical_2lines
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            int r2 = p000.k25.design_snackbar_padding_vertical
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.f24329a
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L_0x003c
            r2 = r4
            goto L_0x003d
        L_0x003c:
            r2 = r3
        L_0x003d:
            if (r2 == 0) goto L_0x0056
            int r5 = r7.f24332g
            if (r5 <= 0) goto L_0x0056
            android.widget.Button r5 = r7.f24330d
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f24332g
            if (r5 <= r6) goto L_0x0056
            int r1 = r0 - r1
            boolean r0 = r7.mo33561e(r4, r0, r1)
            if (r0 == 0) goto L_0x0061
            goto L_0x0060
        L_0x0056:
            if (r2 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r0 = r1
        L_0x005a:
            boolean r0 = r7.mo33561e(r3, r0, r0)
            if (r0 == 0) goto L_0x0061
        L_0x0060:
            r3 = r4
        L_0x0061:
            if (r3 == 0) goto L_0x0066
            super.onMeasure(r8, r9)
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i) {
        this.f24332g = i;
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u55.SnackbarLayout);
        this.f24331e = obtainStyledAttributes.getDimensionPixelSize(u55.SnackbarLayout_android_maxWidth, -1);
        this.f24332g = obtainStyledAttributes.getDimensionPixelSize(u55.SnackbarLayout_maxActionInlineWidth, -1);
        obtainStyledAttributes.recycle();
    }
}
