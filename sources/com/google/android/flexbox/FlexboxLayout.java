package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.flexbox.C3998b;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.http2.Http2Connection;

public class FlexboxLayout extends ViewGroup implements g42 {

    /* renamed from: A */
    public int f21932A;

    /* renamed from: B */
    public int f21933B;

    /* renamed from: C */
    public int f21934C;

    /* renamed from: H */
    public int[] f21935H;

    /* renamed from: I */
    public SparseIntArray f21936I;

    /* renamed from: L */
    public C3998b f21937L;

    /* renamed from: M */
    public List<C3997a> f21938M;

    /* renamed from: P */
    public C3998b.C4000b f21939P;

    /* renamed from: a */
    public int f21940a;

    /* renamed from: d */
    public int f21941d;

    /* renamed from: e */
    public int f21942e;

    /* renamed from: g */
    public int f21943g;

    /* renamed from: k */
    public int f21944k;

    /* renamed from: r */
    public int f21945r;

    /* renamed from: s */
    public Drawable f21946s;

    /* renamed from: x */
    public Drawable f21947x;

    /* renamed from: y */
    public int f21948y;

    public FlexboxLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: A */
    public final void mo30190A() {
        if (this.f21946s == null && this.f21947x == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    /* renamed from: a */
    public final boolean mo30191a(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f21938M.get(i2).mo30331c() > 0) {
                return false;
            }
        }
        return true;
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.f21936I == null) {
            this.f21936I = new SparseIntArray(getChildCount());
        }
        this.f21935H = this.f21937L.mo30372n(view, i, layoutParams, this.f21936I);
        super.addView(view, i, layoutParams);
    }

    /* renamed from: b */
    public void mo30193b(View view, int i, int i2, C3997a aVar) {
        if (!mo30231s(i, i2)) {
            return;
        }
        if (mo30221l()) {
            int i3 = aVar.f22019e;
            int i4 = this.f21934C;
            aVar.f22019e = i3 + i4;
            aVar.f22020f += i4;
            return;
        }
        int i5 = aVar.f22019e;
        int i6 = this.f21933B;
        aVar.f22019e = i5 + i6;
        aVar.f22020f += i6;
    }

    /* renamed from: c */
    public int mo30194c(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: d */
    public final boolean mo30196d(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View r = mo30230r(i - i3);
            if (r != null && r.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public View mo30197e(int i) {
        return getChildAt(i);
    }

    /* renamed from: f */
    public int mo30198f(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    /* renamed from: g */
    public int mo30199g(View view) {
        return 0;
    }

    public int getAlignContent() {
        return this.f21944k;
    }

    public int getAlignItems() {
        return this.f21943g;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.f21946s;
    }

    public Drawable getDividerDrawableVertical() {
        return this.f21947x;
    }

    public int getFlexDirection() {
        return this.f21940a;
    }

    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<C3997a> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.f21938M.size());
        for (C3997a next : this.f21938M) {
            if (next.mo30331c() != 0) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public List<C3997a> getFlexLinesInternal() {
        return this.f21938M;
    }

    public int getFlexWrap() {
        return this.f21941d;
    }

    public int getJustifyContent() {
        return this.f21942e;
    }

    public int getLargestMainSize() {
        int i = Integer.MIN_VALUE;
        for (C3997a aVar : this.f21938M) {
            i = Math.max(i, aVar.f22019e);
        }
        return i;
    }

    public int getMaxLine() {
        return this.f21945r;
    }

    public int getShowDividerHorizontal() {
        return this.f21948y;
    }

    public int getShowDividerVertical() {
        return this.f21932A;
    }

    public int getSumOfCrossSize() {
        int i;
        int i2;
        int size = this.f21938M.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C3997a aVar = this.f21938M.get(i4);
            if (mo30245t(i4)) {
                if (mo30221l()) {
                    i2 = this.f21933B;
                } else {
                    i2 = this.f21934C;
                }
                i3 += i2;
            }
            if (mo30246u(i4)) {
                if (mo30221l()) {
                    i = this.f21933B;
                } else {
                    i = this.f21934C;
                }
                i3 += i;
            }
            i3 += aVar.f22021g;
        }
        return i3;
    }

    /* renamed from: h */
    public void mo30217h(C3997a aVar) {
        if (mo30221l()) {
            if ((this.f21932A & 4) > 0) {
                int i = aVar.f22019e;
                int i2 = this.f21934C;
                aVar.f22019e = i + i2;
                aVar.f22020f += i2;
            }
        } else if ((this.f21948y & 4) > 0) {
            int i3 = aVar.f22019e;
            int i4 = this.f21933B;
            aVar.f22019e = i3 + i4;
            aVar.f22020f += i4;
        }
    }

    /* renamed from: i */
    public View mo30218i(int i) {
        return mo30230r(i);
    }

    /* renamed from: j */
    public void mo30219j(int i, View view) {
    }

    /* renamed from: k */
    public int mo30220k(View view, int i, int i2) {
        int i3;
        int i4 = 0;
        if (mo30221l()) {
            if (mo30231s(i, i2)) {
                i4 = 0 + this.f21934C;
            }
            if ((this.f21932A & 4) <= 0) {
                return i4;
            }
            i3 = this.f21934C;
        } else {
            if (mo30231s(i, i2)) {
                i4 = 0 + this.f21933B;
            }
            if ((this.f21948y & 4) <= 0) {
                return i4;
            }
            i3 = this.f21933B;
        }
        return i4 + i3;
    }

    /* renamed from: l */
    public boolean mo30221l() {
        int i = this.f21940a;
        if (i == 0 || i == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final void mo30222m(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        int i4;
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.f21938M.size();
        for (int i5 = 0; i5 < size; i5++) {
            C3997a aVar = this.f21938M.get(i5);
            for (int i6 = 0; i6 < aVar.f22022h; i6++) {
                int i7 = aVar.f22029o + i6;
                View r = mo30230r(i7);
                if (!(r == null || r.getVisibility() == 8)) {
                    LayoutParams layoutParams = (LayoutParams) r.getLayoutParams();
                    if (mo30231s(i7, i6)) {
                        if (z) {
                            i4 = r.getRight() + layoutParams.rightMargin;
                        } else {
                            i4 = (r.getLeft() - layoutParams.leftMargin) - this.f21934C;
                        }
                        mo30228p(canvas, i4, aVar.f22016b, aVar.f22021g);
                    }
                    if (i6 == aVar.f22022h - 1 && (this.f21932A & 4) > 0) {
                        if (z) {
                            i3 = (r.getLeft() - layoutParams.leftMargin) - this.f21934C;
                        } else {
                            i3 = r.getRight() + layoutParams.rightMargin;
                        }
                        mo30228p(canvas, i3, aVar.f22016b, aVar.f22021g);
                    }
                }
            }
            if (mo30245t(i5)) {
                if (z2) {
                    i2 = aVar.f22018d;
                } else {
                    i2 = aVar.f22016b - this.f21933B;
                }
                mo30224o(canvas, paddingLeft, i2, max);
            }
            if (mo30246u(i5) && (this.f21948y & 4) > 0) {
                if (z2) {
                    i = aVar.f22016b - this.f21933B;
                } else {
                    i = aVar.f22018d;
                }
                mo30224o(canvas, paddingLeft, i, max);
            }
        }
    }

    /* renamed from: n */
    public final void mo30223n(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        int i4;
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.f21938M.size();
        for (int i5 = 0; i5 < size; i5++) {
            C3997a aVar = this.f21938M.get(i5);
            for (int i6 = 0; i6 < aVar.f22022h; i6++) {
                int i7 = aVar.f22029o + i6;
                View r = mo30230r(i7);
                if (!(r == null || r.getVisibility() == 8)) {
                    LayoutParams layoutParams = (LayoutParams) r.getLayoutParams();
                    if (mo30231s(i7, i6)) {
                        if (z2) {
                            i4 = r.getBottom() + layoutParams.bottomMargin;
                        } else {
                            i4 = (r.getTop() - layoutParams.topMargin) - this.f21933B;
                        }
                        mo30224o(canvas, aVar.f22015a, i4, aVar.f22021g);
                    }
                    if (i6 == aVar.f22022h - 1 && (this.f21948y & 4) > 0) {
                        if (z2) {
                            i3 = (r.getTop() - layoutParams.topMargin) - this.f21933B;
                        } else {
                            i3 = r.getBottom() + layoutParams.bottomMargin;
                        }
                        mo30224o(canvas, aVar.f22015a, i3, aVar.f22021g);
                    }
                }
            }
            if (mo30245t(i5)) {
                if (z) {
                    i2 = aVar.f22017c;
                } else {
                    i2 = aVar.f22015a - this.f21934C;
                }
                mo30228p(canvas, i2, paddingTop, max);
            }
            if (mo30246u(i5) && (this.f21932A & 4) > 0) {
                if (z) {
                    i = aVar.f22015a - this.f21934C;
                } else {
                    i = aVar.f22017c;
                }
                mo30228p(canvas, i, paddingTop, max);
            }
        }
    }

    /* renamed from: o */
    public final void mo30224o(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.f21946s;
        if (drawable != null) {
            drawable.setBounds(i, i2, i3 + i, this.f21933B + i2);
            this.f21946s.draw(canvas);
        }
    }

    public void onDraw(Canvas canvas) {
        boolean z;
        boolean z2;
        if (this.f21947x != null || this.f21946s != null) {
            if (this.f21948y != 0 || this.f21932A != 0) {
                int B = ga7.m17715B(this);
                int i = this.f21940a;
                boolean z3 = false;
                boolean z4 = true;
                if (i == 0) {
                    if (B == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (this.f21941d == 2) {
                        z3 = true;
                    }
                    mo30222m(canvas, z, z3);
                } else if (i == 1) {
                    if (B != 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (this.f21941d == 2) {
                        z3 = true;
                    }
                    mo30222m(canvas, z2, z3);
                } else if (i == 2) {
                    if (B != 1) {
                        z4 = false;
                    }
                    if (this.f21941d == 2) {
                        z4 = !z4;
                    }
                    mo30223n(canvas, z4, false);
                } else if (i == 3) {
                    if (B == 1) {
                        z3 = true;
                    }
                    if (this.f21941d == 2) {
                        z3 = !z3;
                    }
                    mo30223n(canvas, z3, true);
                }
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int B = ga7.m17715B(this);
        int i5 = this.f21940a;
        boolean z6 = false;
        if (i5 == 0) {
            if (B == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            mo30247v(z2, i, i2, i3, i4);
        } else if (i5 == 1) {
            if (B != 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            mo30247v(z3, i, i2, i3, i4);
        } else if (i5 == 2) {
            if (B == 1) {
                z6 = true;
            }
            if (this.f21941d == 2) {
                z4 = !z6;
            } else {
                z4 = z6;
            }
            mo30248w(z4, false, i, i2, i3, i4);
        } else if (i5 == 3) {
            if (B == 1) {
                z6 = true;
            }
            if (this.f21941d == 2) {
                z5 = !z6;
            } else {
                z5 = z6;
            }
            mo30248w(z5, true, i, i2, i3, i4);
        } else {
            throw new IllegalStateException("Invalid flex direction is set: " + this.f21940a);
        }
    }

    public void onMeasure(int i, int i2) {
        if (this.f21936I == null) {
            this.f21936I = new SparseIntArray(getChildCount());
        }
        if (this.f21937L.mo30347O(this.f21936I)) {
            this.f21935H = this.f21937L.mo30371m(this.f21936I);
        }
        int i3 = this.f21940a;
        if (i3 == 0 || i3 == 1) {
            mo30249x(i, i2);
        } else if (i3 == 2 || i3 == 3) {
            mo30250y(i, i2);
        } else {
            throw new IllegalStateException("Invalid value for the flex direction is set: " + this.f21940a);
        }
    }

    /* renamed from: p */
    public final void mo30228p(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.f21947x;
        if (drawable != null) {
            drawable.setBounds(i, i2, this.f21934C + i, i3 + i2);
            this.f21947x.draw(canvas);
        }
    }

    /* renamed from: q */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: r */
    public View mo30230r(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.f21935H;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    /* renamed from: s */
    public final boolean mo30231s(int i, int i2) {
        if (mo30196d(i, i2)) {
            if (mo30221l()) {
                if ((this.f21932A & 1) != 0) {
                    return true;
                }
                return false;
            } else if ((this.f21948y & 1) != 0) {
                return true;
            } else {
                return false;
            }
        } else if (mo30221l()) {
            if ((this.f21932A & 2) != 0) {
                return true;
            }
            return false;
        } else if ((this.f21948y & 2) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public void setAlignContent(int i) {
        if (this.f21944k != i) {
            this.f21944k = i;
            requestLayout();
        }
    }

    public void setAlignItems(int i) {
        if (this.f21943g != i) {
            this.f21943g = i;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable != this.f21946s) {
            this.f21946s = drawable;
            if (drawable != null) {
                this.f21933B = drawable.getIntrinsicHeight();
            } else {
                this.f21933B = 0;
            }
            mo30190A();
            requestLayout();
        }
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable != this.f21947x) {
            this.f21947x = drawable;
            if (drawable != null) {
                this.f21934C = drawable.getIntrinsicWidth();
            } else {
                this.f21934C = 0;
            }
            mo30190A();
            requestLayout();
        }
    }

    public void setFlexDirection(int i) {
        if (this.f21940a != i) {
            this.f21940a = i;
            requestLayout();
        }
    }

    public void setFlexLines(List<C3997a> list) {
        this.f21938M = list;
    }

    public void setFlexWrap(int i) {
        if (this.f21941d != i) {
            this.f21941d = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.f21942e != i) {
            this.f21942e = i;
            requestLayout();
        }
    }

    public void setMaxLine(int i) {
        if (this.f21945r != i) {
            this.f21945r = i;
            requestLayout();
        }
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.f21948y) {
            this.f21948y = i;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i) {
        if (i != this.f21932A) {
            this.f21932A = i;
            requestLayout();
        }
    }

    /* renamed from: t */
    public final boolean mo30245t(int i) {
        if (i < 0 || i >= this.f21938M.size()) {
            return false;
        }
        if (mo30191a(i)) {
            if (mo30221l()) {
                if ((this.f21948y & 1) != 0) {
                    return true;
                }
                return false;
            } else if ((this.f21932A & 1) != 0) {
                return true;
            } else {
                return false;
            }
        } else if (mo30221l()) {
            if ((this.f21948y & 2) != 0) {
                return true;
            }
            return false;
        } else if ((this.f21932A & 2) != 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: u */
    public final boolean mo30246u(int i) {
        if (i < 0 || i >= this.f21938M.size()) {
            return false;
        }
        for (int i2 = i + 1; i2 < this.f21938M.size(); i2++) {
            if (this.f21938M.get(i2).mo30331c() > 0) {
                return false;
            }
        }
        if (mo30221l()) {
            if ((this.f21948y & 4) != 0) {
                return true;
            }
            return false;
        } else if ((this.f21932A & 4) != 0) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01fd  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30247v(boolean r29, int r30, int r31, int r32, int r33) {
        /*
            r28 = this;
            r0 = r28
            int r1 = r28.getPaddingLeft()
            int r2 = r28.getPaddingRight()
            int r3 = r33 - r31
            int r4 = r32 - r30
            int r5 = r28.getPaddingBottom()
            int r3 = r3 - r5
            int r5 = r28.getPaddingTop()
            java.util.List<com.google.android.flexbox.a> r6 = r0.f21938M
            int r6 = r6.size()
            r8 = 0
        L_0x001e:
            if (r8 >= r6) goto L_0x022c
            java.util.List<com.google.android.flexbox.a> r9 = r0.f21938M
            java.lang.Object r9 = r9.get(r8)
            com.google.android.flexbox.a r9 = (com.google.android.flexbox.C3997a) r9
            boolean r10 = r0.mo30245t(r8)
            if (r10 == 0) goto L_0x0032
            int r10 = r0.f21933B
            int r3 = r3 - r10
            int r5 = r5 + r10
        L_0x0032:
            int r10 = r0.f21942e
            r15 = 4
            r14 = 2
            r11 = 0
            r13 = 1
            if (r10 == 0) goto L_0x00c7
            if (r10 == r13) goto L_0x00bd
            r12 = 1073741824(0x40000000, float:2.0)
            if (r10 == r14) goto L_0x00ab
            r7 = 3
            if (r10 == r7) goto L_0x0093
            if (r10 == r15) goto L_0x007a
            r7 = 5
            if (r10 != r7) goto L_0x0061
            int r7 = r9.mo30331c()
            if (r7 == 0) goto L_0x0058
            int r10 = r9.f22019e
            int r10 = r4 - r10
            float r10 = (float) r10
            int r7 = r7 + 1
            float r7 = (float) r7
            float r10 = r10 / r7
            goto L_0x0059
        L_0x0058:
            r10 = r11
        L_0x0059:
            float r7 = (float) r1
            float r7 = r7 + r10
            int r12 = r4 - r2
            float r12 = (float) r12
            float r12 = r12 - r10
            goto L_0x00cc
        L_0x0061:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid justifyContent is set: "
            r2.append(r3)
            int r3 = r0.f21942e
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x007a:
            int r7 = r9.mo30331c()
            if (r7 == 0) goto L_0x0088
            int r10 = r9.f22019e
            int r10 = r4 - r10
            float r10 = (float) r10
            float r7 = (float) r7
            float r10 = r10 / r7
            goto L_0x0089
        L_0x0088:
            r10 = r11
        L_0x0089:
            float r7 = (float) r1
            float r12 = r10 / r12
            float r7 = r7 + r12
            int r14 = r4 - r2
            float r14 = (float) r14
            float r12 = r14 - r12
            goto L_0x00cc
        L_0x0093:
            float r7 = (float) r1
            int r10 = r9.mo30331c()
            if (r10 == r13) goto L_0x009e
            int r10 = r10 + -1
            float r10 = (float) r10
            goto L_0x00a0
        L_0x009e:
            r10 = 1065353216(0x3f800000, float:1.0)
        L_0x00a0:
            int r12 = r9.f22019e
            int r12 = r4 - r12
            float r12 = (float) r12
            float r10 = r12 / r10
            int r12 = r4 - r2
            float r12 = (float) r12
            goto L_0x00cc
        L_0x00ab:
            float r7 = (float) r1
            int r10 = r9.f22019e
            int r14 = r4 - r10
            float r14 = (float) r14
            float r14 = r14 / r12
            float r7 = r7 + r14
            int r14 = r4 - r2
            float r14 = (float) r14
            int r10 = r4 - r10
            float r10 = (float) r10
            float r10 = r10 / r12
            float r12 = r14 - r10
            goto L_0x00cb
        L_0x00bd:
            int r7 = r9.f22019e
            int r10 = r4 - r7
            int r10 = r10 + r2
            float r10 = (float) r10
            int r7 = r7 - r1
            float r12 = (float) r7
            r7 = r10
            goto L_0x00cb
        L_0x00c7:
            float r7 = (float) r1
            int r10 = r4 - r2
            float r12 = (float) r10
        L_0x00cb:
            r10 = r11
        L_0x00cc:
            float r17 = java.lang.Math.max(r10, r11)
            r14 = 0
        L_0x00d1:
            int r10 = r9.f22022h
            if (r14 >= r10) goto L_0x0220
            int r10 = r9.f22029o
            int r10 = r10 + r14
            android.view.View r18 = r0.mo30230r(r10)
            if (r18 == 0) goto L_0x020c
            int r11 = r18.getVisibility()
            r15 = 8
            if (r11 != r15) goto L_0x00f2
            r23 = r1
            r26 = r13
            r22 = r14
            r25 = 2
            r27 = 4
            goto L_0x0216
        L_0x00f2:
            android.view.ViewGroup$LayoutParams r11 = r18.getLayoutParams()
            r15 = r11
            com.google.android.flexbox.FlexboxLayout$LayoutParams r15 = (com.google.android.flexbox.FlexboxLayout.LayoutParams) r15
            int r11 = r15.leftMargin
            float r11 = (float) r11
            float r7 = r7 + r11
            int r11 = r15.rightMargin
            float r11 = (float) r11
            float r12 = r12 - r11
            boolean r10 = r0.mo30231s(r10, r14)
            if (r10 == 0) goto L_0x0111
            int r10 = r0.f21934C
            float r11 = (float) r10
            float r7 = r7 + r11
            float r12 = r12 - r11
            r20 = r10
            r19 = r12
            goto L_0x0115
        L_0x0111:
            r19 = r12
            r20 = 0
        L_0x0115:
            int r10 = r9.f22022h
            int r10 = r10 - r13
            if (r14 != r10) goto L_0x0127
            int r10 = r0.f21932A
            r16 = 4
            r10 = r10 & 4
            if (r10 <= 0) goto L_0x0129
            int r10 = r0.f21934C
            r21 = r10
            goto L_0x012b
        L_0x0127:
            r16 = 4
        L_0x0129:
            r21 = 0
        L_0x012b:
            int r10 = r0.f21941d
            r12 = 2
            if (r10 != r12) goto L_0x018d
            if (r29 == 0) goto L_0x0163
            com.google.android.flexbox.b r10 = r0.f21937L
            int r11 = java.lang.Math.round(r19)
            int r22 = r18.getMeasuredWidth()
            int r22 = r11 - r22
            int r11 = r18.getMeasuredHeight()
            int r23 = r3 - r11
            int r24 = java.lang.Math.round(r19)
            r11 = r18
            r25 = r12
            r12 = r9
            r26 = r13
            r13 = r22
            r22 = r14
            r14 = r23
            r23 = r1
            r1 = r15
            r27 = r16
            r15 = r24
            r16 = r3
            r10.mo30349Q(r11, r12, r13, r14, r15, r16)
            goto L_0x01d5
        L_0x0163:
            r23 = r1
            r25 = r12
            r26 = r13
            r22 = r14
            r1 = r15
            r27 = r16
            com.google.android.flexbox.b r10 = r0.f21937L
            int r13 = java.lang.Math.round(r7)
            int r11 = r18.getMeasuredHeight()
            int r14 = r3 - r11
            int r11 = java.lang.Math.round(r7)
            int r12 = r18.getMeasuredWidth()
            int r15 = r11 + r12
            r11 = r18
            r12 = r9
            r16 = r3
            r10.mo30349Q(r11, r12, r13, r14, r15, r16)
            goto L_0x01d5
        L_0x018d:
            r23 = r1
            r25 = r12
            r26 = r13
            r22 = r14
            r1 = r15
            r27 = r16
            if (r29 == 0) goto L_0x01b8
            com.google.android.flexbox.b r10 = r0.f21937L
            int r11 = java.lang.Math.round(r19)
            int r12 = r18.getMeasuredWidth()
            int r13 = r11 - r12
            int r15 = java.lang.Math.round(r19)
            int r11 = r18.getMeasuredHeight()
            int r16 = r5 + r11
            r11 = r18
            r12 = r9
            r14 = r5
            r10.mo30349Q(r11, r12, r13, r14, r15, r16)
            goto L_0x01d5
        L_0x01b8:
            com.google.android.flexbox.b r10 = r0.f21937L
            int r13 = java.lang.Math.round(r7)
            int r11 = java.lang.Math.round(r7)
            int r12 = r18.getMeasuredWidth()
            int r15 = r11 + r12
            int r11 = r18.getMeasuredHeight()
            int r16 = r5 + r11
            r11 = r18
            r12 = r9
            r14 = r5
            r10.mo30349Q(r11, r12, r13, r14, r15, r16)
        L_0x01d5:
            int r10 = r18.getMeasuredWidth()
            float r10 = (float) r10
            float r10 = r10 + r17
            int r11 = r1.rightMargin
            float r11 = (float) r11
            float r10 = r10 + r11
            float r7 = r7 + r10
            int r10 = r18.getMeasuredWidth()
            float r10 = (float) r10
            float r10 = r10 + r17
            int r1 = r1.leftMargin
            float r1 = (float) r1
            float r10 = r10 + r1
            float r19 = r19 - r10
            if (r29 == 0) goto L_0x01fd
            r13 = 0
            r15 = 0
            r10 = r9
            r11 = r18
            r12 = r21
            r14 = r20
            r10.mo30332d(r11, r12, r13, r14, r15)
            goto L_0x0209
        L_0x01fd:
            r13 = 0
            r15 = 0
            r10 = r9
            r11 = r18
            r12 = r20
            r14 = r21
            r10.mo30332d(r11, r12, r13, r14, r15)
        L_0x0209:
            r12 = r19
            goto L_0x0216
        L_0x020c:
            r23 = r1
            r26 = r13
            r22 = r14
            r27 = r15
            r25 = 2
        L_0x0216:
            int r14 = r22 + 1
            r1 = r23
            r13 = r26
            r15 = r27
            goto L_0x00d1
        L_0x0220:
            r23 = r1
            int r1 = r9.f22021g
            int r5 = r5 + r1
            int r3 = r3 - r1
            int r8 = r8 + 1
            r1 = r23
            goto L_0x001e
        L_0x022c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.mo30247v(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01f5  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30248w(boolean r30, boolean r31, int r32, int r33, int r34, int r35) {
        /*
            r29 = this;
            r0 = r29
            int r1 = r29.getPaddingTop()
            int r2 = r29.getPaddingBottom()
            int r3 = r29.getPaddingRight()
            int r4 = r29.getPaddingLeft()
            int r5 = r34 - r32
            int r6 = r35 - r33
            int r5 = r5 - r3
            java.util.List<com.google.android.flexbox.a> r3 = r0.f21938M
            int r3 = r3.size()
            r8 = 0
        L_0x001e:
            if (r8 >= r3) goto L_0x021c
            java.util.List<com.google.android.flexbox.a> r9 = r0.f21938M
            java.lang.Object r9 = r9.get(r8)
            com.google.android.flexbox.a r9 = (com.google.android.flexbox.C3997a) r9
            boolean r10 = r0.mo30245t(r8)
            if (r10 == 0) goto L_0x0032
            int r10 = r0.f21934C
            int r4 = r4 + r10
            int r5 = r5 - r10
        L_0x0032:
            int r10 = r0.f21942e
            r15 = 4
            r11 = 0
            r14 = 1
            if (r10 == 0) goto L_0x00c5
            if (r10 == r14) goto L_0x00bd
            r12 = 2
            r13 = 1073741824(0x40000000, float:2.0)
            if (r10 == r12) goto L_0x00aa
            r12 = 3
            if (r10 == r12) goto L_0x0093
            if (r10 == r15) goto L_0x007a
            r12 = 5
            if (r10 != r12) goto L_0x0061
            int r10 = r9.mo30331c()
            if (r10 == 0) goto L_0x0058
            int r12 = r9.f22019e
            int r12 = r6 - r12
            float r12 = (float) r12
            int r10 = r10 + 1
            float r10 = (float) r10
            float r12 = r12 / r10
            goto L_0x0059
        L_0x0058:
            r12 = r11
        L_0x0059:
            float r10 = (float) r1
            float r10 = r10 + r12
            int r13 = r6 - r2
            float r13 = (float) r13
            float r13 = r13 - r12
            goto L_0x00ca
        L_0x0061:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid justifyContent is set: "
            r2.append(r3)
            int r3 = r0.f21942e
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x007a:
            int r10 = r9.mo30331c()
            if (r10 == 0) goto L_0x0088
            int r12 = r9.f22019e
            int r12 = r6 - r12
            float r12 = (float) r12
            float r10 = (float) r10
            float r12 = r12 / r10
            goto L_0x0089
        L_0x0088:
            r12 = r11
        L_0x0089:
            float r10 = (float) r1
            float r13 = r12 / r13
            float r10 = r10 + r13
            int r7 = r6 - r2
            float r7 = (float) r7
            float r13 = r7 - r13
            goto L_0x00ca
        L_0x0093:
            float r10 = (float) r1
            int r7 = r9.mo30331c()
            if (r7 == r14) goto L_0x009e
            int r7 = r7 + -1
            float r7 = (float) r7
            goto L_0x00a0
        L_0x009e:
            r7 = 1065353216(0x3f800000, float:1.0)
        L_0x00a0:
            int r12 = r9.f22019e
            int r12 = r6 - r12
            float r12 = (float) r12
            float r12 = r12 / r7
            int r7 = r6 - r2
            float r13 = (float) r7
            goto L_0x00ca
        L_0x00aa:
            float r7 = (float) r1
            int r10 = r9.f22019e
            int r12 = r6 - r10
            float r12 = (float) r12
            float r12 = r12 / r13
            float r7 = r7 + r12
            int r12 = r6 - r2
            float r12 = (float) r12
            int r10 = r6 - r10
            float r10 = (float) r10
            float r10 = r10 / r13
            float r13 = r12 - r10
            r10 = r7
            goto L_0x00c9
        L_0x00bd:
            int r7 = r9.f22019e
            int r10 = r6 - r7
            int r10 = r10 + r2
            float r10 = (float) r10
            int r7 = r7 - r1
            goto L_0x00c8
        L_0x00c5:
            float r10 = (float) r1
            int r7 = r6 - r2
        L_0x00c8:
            float r13 = (float) r7
        L_0x00c9:
            r12 = r11
        L_0x00ca:
            float r7 = java.lang.Math.max(r12, r11)
            r12 = 0
        L_0x00cf:
            int r11 = r9.f22022h
            if (r12 >= r11) goto L_0x0214
            int r11 = r9.f22029o
            int r11 = r11 + r12
            android.view.View r18 = r0.mo30230r(r11)
            if (r18 == 0) goto L_0x0206
            int r15 = r18.getVisibility()
            r14 = 8
            if (r15 != r14) goto L_0x00ec
            r25 = r12
            r26 = 1
            r28 = 4
            goto L_0x020c
        L_0x00ec:
            android.view.ViewGroup$LayoutParams r14 = r18.getLayoutParams()
            r15 = r14
            com.google.android.flexbox.FlexboxLayout$LayoutParams r15 = (com.google.android.flexbox.FlexboxLayout.LayoutParams) r15
            int r14 = r15.topMargin
            float r14 = (float) r14
            float r10 = r10 + r14
            int r14 = r15.bottomMargin
            float r14 = (float) r14
            float r13 = r13 - r14
            boolean r11 = r0.mo30231s(r11, r12)
            if (r11 == 0) goto L_0x010d
            int r11 = r0.f21933B
            float r14 = (float) r11
            float r10 = r10 + r14
            float r13 = r13 - r14
            r19 = r10
            r21 = r11
            r20 = r13
            goto L_0x0113
        L_0x010d:
            r19 = r10
            r20 = r13
            r21 = 0
        L_0x0113:
            int r10 = r9.f22022h
            r14 = 1
            int r10 = r10 - r14
            if (r12 != r10) goto L_0x0126
            int r10 = r0.f21948y
            r16 = 4
            r10 = r10 & 4
            if (r10 <= 0) goto L_0x0128
            int r10 = r0.f21933B
            r22 = r10
            goto L_0x012a
        L_0x0126:
            r16 = 4
        L_0x0128:
            r22 = 0
        L_0x012a:
            if (r30 == 0) goto L_0x0185
            if (r31 == 0) goto L_0x015d
            com.google.android.flexbox.b r10 = r0.f21937L
            r13 = 1
            int r11 = r18.getMeasuredWidth()
            int r17 = r5 - r11
            int r11 = java.lang.Math.round(r20)
            int r23 = r18.getMeasuredHeight()
            int r23 = r11 - r23
            int r24 = java.lang.Math.round(r20)
            r11 = r18
            r25 = r12
            r12 = r9
            r26 = r14
            r14 = r17
            r27 = r15
            r28 = r16
            r15 = r23
            r16 = r5
            r17 = r24
            r10.mo30350R(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x01cc
        L_0x015d:
            r25 = r12
            r26 = r14
            r27 = r15
            r28 = r16
            com.google.android.flexbox.b r10 = r0.f21937L
            r13 = 1
            int r11 = r18.getMeasuredWidth()
            int r14 = r5 - r11
            int r15 = java.lang.Math.round(r19)
            int r11 = java.lang.Math.round(r19)
            int r12 = r18.getMeasuredHeight()
            int r17 = r11 + r12
            r11 = r18
            r12 = r9
            r16 = r5
            r10.mo30350R(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x01cc
        L_0x0185:
            r25 = r12
            r26 = r14
            r27 = r15
            r28 = r16
            if (r31 == 0) goto L_0x01ae
            com.google.android.flexbox.b r10 = r0.f21937L
            r13 = 0
            int r11 = java.lang.Math.round(r20)
            int r12 = r18.getMeasuredHeight()
            int r15 = r11 - r12
            int r11 = r18.getMeasuredWidth()
            int r16 = r4 + r11
            int r17 = java.lang.Math.round(r20)
            r11 = r18
            r12 = r9
            r14 = r4
            r10.mo30350R(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x01cc
        L_0x01ae:
            com.google.android.flexbox.b r10 = r0.f21937L
            r13 = 0
            int r15 = java.lang.Math.round(r19)
            int r11 = r18.getMeasuredWidth()
            int r16 = r4 + r11
            int r11 = java.lang.Math.round(r19)
            int r12 = r18.getMeasuredHeight()
            int r17 = r11 + r12
            r11 = r18
            r12 = r9
            r14 = r4
            r10.mo30350R(r11, r12, r13, r14, r15, r16, r17)
        L_0x01cc:
            int r10 = r18.getMeasuredHeight()
            float r10 = (float) r10
            float r10 = r10 + r7
            r14 = r27
            int r11 = r14.bottomMargin
            float r11 = (float) r11
            float r10 = r10 + r11
            float r19 = r19 + r10
            int r10 = r18.getMeasuredHeight()
            float r10 = (float) r10
            float r10 = r10 + r7
            int r11 = r14.topMargin
            float r11 = (float) r11
            float r10 = r10 + r11
            float r20 = r20 - r10
            if (r31 == 0) goto L_0x01f5
            r12 = 0
            r14 = 0
            r10 = r9
            r11 = r18
            r13 = r22
            r15 = r21
            r10.mo30332d(r11, r12, r13, r14, r15)
            goto L_0x0201
        L_0x01f5:
            r12 = 0
            r14 = 0
            r10 = r9
            r11 = r18
            r13 = r21
            r15 = r22
            r10.mo30332d(r11, r12, r13, r14, r15)
        L_0x0201:
            r10 = r19
            r13 = r20
            goto L_0x020c
        L_0x0206:
            r25 = r12
            r26 = r14
            r28 = r15
        L_0x020c:
            int r12 = r25 + 1
            r14 = r26
            r15 = r28
            goto L_0x00cf
        L_0x0214:
            int r7 = r9.f22021g
            int r4 = r4 + r7
            int r5 = r5 - r7
            int r8 = r8 + 1
            goto L_0x001e
        L_0x021c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.mo30248w(boolean, boolean, int, int, int, int):void");
    }

    /* renamed from: x */
    public final void mo30249x(int i, int i2) {
        this.f21938M.clear();
        this.f21939P.mo30385a();
        this.f21937L.mo30361c(this.f21939P, i, i2);
        this.f21938M = this.f21939P.f22038a;
        this.f21937L.mo30374p(i, i2);
        if (this.f21943g == 3) {
            for (C3997a next : this.f21938M) {
                int i3 = Integer.MIN_VALUE;
                for (int i4 = 0; i4 < next.f22022h; i4++) {
                    View r = mo30230r(next.f22029o + i4);
                    if (!(r == null || r.getVisibility() == 8)) {
                        LayoutParams layoutParams = (LayoutParams) r.getLayoutParams();
                        if (this.f21941d != 2) {
                            i3 = Math.max(i3, r.getMeasuredHeight() + Math.max(next.f22026l - r.getBaseline(), layoutParams.topMargin) + layoutParams.bottomMargin);
                        } else {
                            i3 = Math.max(i3, r.getMeasuredHeight() + layoutParams.topMargin + Math.max((next.f22026l - r.getMeasuredHeight()) + r.getBaseline(), layoutParams.bottomMargin));
                        }
                    }
                }
                next.f22021g = i3;
            }
        }
        this.f21937L.mo30373o(i, i2, getPaddingTop() + getPaddingBottom());
        this.f21937L.mo30356X();
        mo30251z(this.f21940a, i, i2, this.f21939P.f22039b);
    }

    /* renamed from: y */
    public final void mo30250y(int i, int i2) {
        this.f21938M.clear();
        this.f21939P.mo30385a();
        this.f21937L.mo30364f(this.f21939P, i, i2);
        this.f21938M = this.f21939P.f22038a;
        this.f21937L.mo30374p(i, i2);
        this.f21937L.mo30373o(i, i2, getPaddingLeft() + getPaddingRight());
        this.f21937L.mo30356X();
        mo30251z(this.f21940a, i, i2, this.f21939P.f22039b);
    }

    /* renamed from: z */
    public final void mo30251z(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            i5 = getSumOfCrossSize() + getPaddingTop() + getPaddingBottom();
            i6 = getLargestMainSize();
        } else if (i == 2 || i == 3) {
            i5 = getLargestMainSize();
            i6 = getSumOfCrossSize() + getPaddingLeft() + getPaddingRight();
        } else {
            throw new IllegalArgumentException("Invalid flex direction: " + i);
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < i6) {
                i4 = View.combineMeasuredStates(i4, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            } else {
                size = i6;
            }
            i7 = View.resolveSizeAndState(size, i2, i4);
        } else if (mode == 0) {
            i7 = View.resolveSizeAndState(i6, i2, i4);
        } else if (mode == 1073741824) {
            if (size < i6) {
                i4 = View.combineMeasuredStates(i4, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            }
            i7 = View.resolveSizeAndState(size, i2, i4);
        } else {
            throw new IllegalStateException("Unknown width mode is set: " + mode);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < i5) {
                i4 = View.combineMeasuredStates(i4, 256);
            } else {
                size2 = i5;
            }
            i8 = View.resolveSizeAndState(size2, i3, i4);
        } else if (mode2 == 0) {
            i8 = View.resolveSizeAndState(i5, i3, i4);
        } else if (mode2 == 1073741824) {
            if (size2 < i5) {
                i4 = View.combineMeasuredStates(i4, 256);
            }
            i8 = View.resolveSizeAndState(size2, i3, i4);
        } else {
            throw new IllegalStateException("Unknown height mode is set: " + mode2);
        }
        setMeasuredDimension(i7, i8);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21945r = -1;
        this.f21937L = new C3998b(this);
        this.f21938M = new ArrayList();
        this.f21939P = new C3998b.C4000b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r55.FlexboxLayout, i, 0);
        this.f21940a = obtainStyledAttributes.getInt(r55.FlexboxLayout_flexDirection, 0);
        this.f21941d = obtainStyledAttributes.getInt(r55.FlexboxLayout_flexWrap, 0);
        this.f21942e = obtainStyledAttributes.getInt(r55.FlexboxLayout_justifyContent, 0);
        this.f21943g = obtainStyledAttributes.getInt(r55.FlexboxLayout_alignItems, 0);
        this.f21944k = obtainStyledAttributes.getInt(r55.FlexboxLayout_alignContent, 0);
        this.f21945r = obtainStyledAttributes.getInt(r55.FlexboxLayout_maxLine, -1);
        Drawable drawable = obtainStyledAttributes.getDrawable(r55.FlexboxLayout_dividerDrawable);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(r55.FlexboxLayout_dividerDrawableHorizontal);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = obtainStyledAttributes.getDrawable(r55.FlexboxLayout_dividerDrawableVertical);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i2 = obtainStyledAttributes.getInt(r55.FlexboxLayout_showDivider, 0);
        if (i2 != 0) {
            this.f21932A = i2;
            this.f21948y = i2;
        }
        int i3 = obtainStyledAttributes.getInt(r55.FlexboxLayout_showDividerVertical, 0);
        if (i3 != 0) {
            this.f21932A = i3;
        }
        int i4 = obtainStyledAttributes.getInt(r55.FlexboxLayout_showDividerHorizontal, 0);
        if (i4 != 0) {
            this.f21948y = i4;
        }
        obtainStyledAttributes.recycle();
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new C3991a();

        /* renamed from: A */
        public boolean f21949A;

        /* renamed from: a */
        public int f21950a = 1;

        /* renamed from: d */
        public float f21951d = Utils.FLOAT_EPSILON;

        /* renamed from: e */
        public float f21952e = 1.0f;

        /* renamed from: g */
        public int f21953g = -1;

        /* renamed from: k */
        public float f21954k = -1.0f;

        /* renamed from: r */
        public int f21955r = -1;

        /* renamed from: s */
        public int f21956s = -1;

        /* renamed from: x */
        public int f21957x = 16777215;

        /* renamed from: y */
        public int f21958y = 16777215;

        /* renamed from: com.google.android.flexbox.FlexboxLayout$LayoutParams$a */
        public class C3991a implements Parcelable.Creator<LayoutParams> {
            /* renamed from: a */
            public LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            /* renamed from: b */
            public LayoutParams[] newArray(int i) {
                return new LayoutParams[i];
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r55.FlexboxLayout_Layout);
            this.f21950a = obtainStyledAttributes.getInt(r55.FlexboxLayout_Layout_layout_order, 1);
            this.f21951d = obtainStyledAttributes.getFloat(r55.FlexboxLayout_Layout_layout_flexGrow, Utils.FLOAT_EPSILON);
            this.f21952e = obtainStyledAttributes.getFloat(r55.FlexboxLayout_Layout_layout_flexShrink, 1.0f);
            this.f21953g = obtainStyledAttributes.getInt(r55.FlexboxLayout_Layout_layout_alignSelf, -1);
            this.f21954k = obtainStyledAttributes.getFraction(r55.FlexboxLayout_Layout_layout_flexBasisPercent, 1, 1, -1.0f);
            this.f21955r = obtainStyledAttributes.getDimensionPixelSize(r55.FlexboxLayout_Layout_layout_minWidth, -1);
            this.f21956s = obtainStyledAttributes.getDimensionPixelSize(r55.FlexboxLayout_Layout_layout_minHeight, -1);
            this.f21957x = obtainStyledAttributes.getDimensionPixelSize(r55.FlexboxLayout_Layout_layout_maxWidth, 16777215);
            this.f21958y = obtainStyledAttributes.getDimensionPixelSize(r55.FlexboxLayout_Layout_layout_maxHeight, 16777215);
            this.f21949A = obtainStyledAttributes.getBoolean(r55.FlexboxLayout_Layout_layout_wrapBefore, false);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: L */
        public int mo30172L() {
            return this.f21953g;
        }

        /* renamed from: N */
        public float mo30173N() {
            return this.f21952e;
        }

        /* renamed from: O0 */
        public void mo30174O0(int i) {
            this.f21955r = i;
        }

        /* renamed from: P0 */
        public int mo30175P0() {
            return this.bottomMargin;
        }

        /* renamed from: Q0 */
        public int mo30176Q0() {
            return this.leftMargin;
        }

        /* renamed from: S */
        public int mo30177S() {
            return this.f21955r;
        }

        /* renamed from: c0 */
        public int mo30178c0() {
            return this.topMargin;
        }

        /* renamed from: d1 */
        public int mo30179d1() {
            return this.rightMargin;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e0 */
        public void mo30180e0(int i) {
            this.f21956s = i;
        }

        /* renamed from: g0 */
        public float mo30181g0() {
            return this.f21951d;
        }

        /* renamed from: g1 */
        public int mo30182g1() {
            return this.f21956s;
        }

        public int getHeight() {
            return this.height;
        }

        public int getOrder() {
            return this.f21950a;
        }

        public int getWidth() {
            return this.width;
        }

        /* renamed from: j1 */
        public int mo30186j1() {
            return this.f21958y;
        }

        /* renamed from: l0 */
        public float mo30187l0() {
            return this.f21954k;
        }

        /* renamed from: q0 */
        public boolean mo30188q0() {
            return this.f21949A;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f21950a);
            parcel.writeFloat(this.f21951d);
            parcel.writeFloat(this.f21952e);
            parcel.writeInt(this.f21953g);
            parcel.writeFloat(this.f21954k);
            parcel.writeInt(this.f21955r);
            parcel.writeInt(this.f21956s);
            parcel.writeInt(this.f21957x);
            parcel.writeInt(this.f21958y);
            parcel.writeByte(this.f21949A ? (byte) 1 : 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }

        /* renamed from: x0 */
        public int mo30189x0() {
            return this.f21957x;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f21950a = layoutParams.f21950a;
            this.f21951d = layoutParams.f21951d;
            this.f21952e = layoutParams.f21952e;
            this.f21953g = layoutParams.f21953g;
            this.f21954k = layoutParams.f21954k;
            this.f21955r = layoutParams.f21955r;
            this.f21956s = layoutParams.f21956s;
            this.f21957x = layoutParams.f21957x;
            this.f21958y = layoutParams.f21958y;
            this.f21949A = layoutParams.f21949A;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public LayoutParams(Parcel parcel) {
            super(0, 0);
            boolean z = false;
            this.f21950a = parcel.readInt();
            this.f21951d = parcel.readFloat();
            this.f21952e = parcel.readFloat();
            this.f21953g = parcel.readInt();
            this.f21954k = parcel.readFloat();
            this.f21955r = parcel.readInt();
            this.f21956s = parcel.readInt();
            this.f21957x = parcel.readInt();
            this.f21958y = parcel.readInt();
            this.f21949A = parcel.readByte() != 0 ? true : z;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }
    }
}
