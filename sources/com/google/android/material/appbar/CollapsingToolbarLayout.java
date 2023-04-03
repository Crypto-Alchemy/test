package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.C4332a;

public class CollapsingToolbarLayout extends FrameLayout {

    /* renamed from: t1 */
    public static final int f23292t1 = e55.Widget_Design_CollapsingToolbar;

    /* renamed from: A */
    public final Rect f23293A;

    /* renamed from: B */
    public final C4332a f23294B;

    /* renamed from: C */
    public final zn1 f23295C;

    /* renamed from: H */
    public boolean f23296H;

    /* renamed from: I */
    public boolean f23297I;

    /* renamed from: L */
    public Drawable f23298L;

    /* renamed from: M */
    public Drawable f23299M;

    /* renamed from: P */
    public int f23300P;

    /* renamed from: Q */
    public boolean f23301Q;

    /* renamed from: U */
    public ValueAnimator f23302U;

    /* renamed from: a */
    public boolean f23303a;

    /* renamed from: b1 */
    public int f23304b1;

    /* renamed from: d */
    public int f23305d;

    /* renamed from: e */
    public ViewGroup f23306e;

    /* renamed from: e0 */
    public long f23307e0;

    /* renamed from: e1 */
    public int f23308e1;

    /* renamed from: g */
    public View f23309g;

    /* renamed from: k */
    public View f23310k;

    /* renamed from: k0 */
    public int f23311k0;

    /* renamed from: o1 */
    public hl7 f23312o1;

    /* renamed from: p1 */
    public int f23313p1;

    /* renamed from: q1 */
    public boolean f23314q1;

    /* renamed from: r */
    public int f23315r;

    /* renamed from: r1 */
    public int f23316r1;

    /* renamed from: s */
    public int f23317s;

    /* renamed from: s1 */
    public boolean f23318s1;

    /* renamed from: v0 */
    public AppBarLayout.C4177d f23319v0;

    /* renamed from: x */
    public int f23320x;

    /* renamed from: y */
    public int f23321y;

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$a */
    public class C4178a implements xg4 {
        public C4178a() {
        }

        /* renamed from: a */
        public hl7 mo1158a(View view, hl7 hl7) {
            return CollapsingToolbarLayout.this.mo31642n(hl7);
        }
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$b */
    public class C4179b implements ValueAnimator.AnimatorUpdateListener {
        public C4179b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$c */
    public class C4180c implements AppBarLayout.C4177d {
        public C4180c() {
        }

        /* renamed from: a */
        public void mo31605a(AppBarLayout appBarLayout, int i) {
            int i2;
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.f23304b1 = i;
            hl7 hl7 = collapsingToolbarLayout.f23312o1;
            if (hl7 != null) {
                i2 = hl7.mo21240m();
            } else {
                i2 = 0;
            }
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i3);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                jd7 j = CollapsingToolbarLayout.m34596j(childAt);
                int i4 = layoutParams.f23322a;
                if (i4 == 1) {
                    j.mo44428j(ep3.m16274b(-i, 0, CollapsingToolbarLayout.this.mo31639h(childAt)));
                } else if (i4 == 2) {
                    j.mo44428j(Math.round(((float) (-i)) * layoutParams.f23323b));
                }
            }
            CollapsingToolbarLayout.this.mo31690t();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.f23299M != null && i2 > 0) {
                ga7.m17767g0(collapsingToolbarLayout2);
            }
            int height = CollapsingToolbarLayout.this.getHeight();
            int C = (height - ga7.m17717C(CollapsingToolbarLayout.this)) - i2;
            float f = (float) C;
            CollapsingToolbarLayout.this.f23294B.mo33076r0(Math.min(1.0f, ((float) (height - CollapsingToolbarLayout.this.getScrimVisibleHeightTrigger())) / f));
            CollapsingToolbarLayout collapsingToolbarLayout3 = CollapsingToolbarLayout.this;
            collapsingToolbarLayout3.f23294B.mo33052f0(collapsingToolbarLayout3.f23304b1 + C);
            CollapsingToolbarLayout.this.f23294B.mo33072p0(((float) Math.abs(i)) / f);
        }
    }

    public CollapsingToolbarLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: g */
    public static int m34594g(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getMeasuredHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: i */
    public static CharSequence m34595i(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getTitle();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getTitle();
        }
        return null;
    }

    /* renamed from: j */
    public static jd7 m34596j(View view) {
        int i = g35.view_offset_helper;
        jd7 jd7 = (jd7) view.getTag(i);
        if (jd7 != null) {
            return jd7;
        }
        jd7 jd72 = new jd7(view);
        view.setTag(i, jd72);
        return jd72;
    }

    /* renamed from: l */
    public static boolean m34597l(View view) {
        if ((view instanceof Toolbar) || (view instanceof android.widget.Toolbar)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo31606a(int i) {
        TimeInterpolator timeInterpolator;
        mo31608c();
        ValueAnimator valueAnimator = this.f23302U;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.f23302U = valueAnimator2;
            valueAnimator2.setDuration(this.f23307e0);
            ValueAnimator valueAnimator3 = this.f23302U;
            if (i > this.f23300P) {
                timeInterpolator = C5807el.f28630c;
            } else {
                timeInterpolator = C5807el.f28631d;
            }
            valueAnimator3.setInterpolator(timeInterpolator);
            this.f23302U.addUpdateListener(new C4179b());
        } else if (valueAnimator.isRunning()) {
            this.f23302U.cancel();
        }
        this.f23302U.setIntValues(new int[]{this.f23300P, i});
        this.f23302U.start();
    }

    /* renamed from: b */
    public final void mo31607b(AppBarLayout appBarLayout) {
        if (mo31640k()) {
            appBarLayout.setLiftOnScroll(false);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.view.ViewGroup} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo31608c() {
        /*
            r6 = this;
            boolean r0 = r6.f23303a
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r6.f23306e = r0
            r6.f23309g = r0
            int r1 = r6.f23305d
            r2 = -1
            if (r1 == r2) goto L_0x001f
            android.view.View r1 = r6.findViewById(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r6.f23306e = r1
            if (r1 == 0) goto L_0x001f
            android.view.View r1 = r6.mo31610d(r1)
            r6.f23309g = r1
        L_0x001f:
            android.view.ViewGroup r1 = r6.f23306e
            r2 = 0
            if (r1 != 0) goto L_0x003e
            int r1 = r6.getChildCount()
            r3 = r2
        L_0x0029:
            if (r3 >= r1) goto L_0x003c
            android.view.View r4 = r6.getChildAt(r3)
            boolean r5 = m34597l(r4)
            if (r5 == 0) goto L_0x0039
            r0 = r4
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x003c
        L_0x0039:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x003c:
            r6.f23306e = r0
        L_0x003e:
            r6.mo31652s()
            r6.f23303a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.mo31608c():void");
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: d */
    public final View mo31610d(View view) {
        ViewParent parent = view.getParent();
        while (parent != this && parent != null) {
            if (parent instanceof View) {
                view = (View) parent;
            }
            parent = parent.getParent();
        }
        return view;
    }

    public void draw(Canvas canvas) {
        int i;
        Drawable drawable;
        super.draw(canvas);
        mo31608c();
        if (this.f23306e == null && (drawable = this.f23298L) != null && this.f23300P > 0) {
            drawable.mutate().setAlpha(this.f23300P);
            this.f23298L.draw(canvas);
        }
        if (this.f23296H && this.f23297I) {
            if (this.f23306e == null || this.f23298L == null || this.f23300P <= 0 || !mo31640k() || this.f23294B.mo33021D() >= this.f23294B.mo33023E()) {
                this.f23294B.mo33065m(canvas);
            } else {
                int save = canvas.save();
                canvas.clipRect(this.f23298L.getBounds(), Region.Op.DIFFERENCE);
                this.f23294B.mo33065m(canvas);
                canvas.restoreToCount(save);
            }
        }
        if (this.f23299M != null && this.f23300P > 0) {
            hl7 hl7 = this.f23312o1;
            if (hl7 != null) {
                i = hl7.mo21240m();
            } else {
                i = 0;
            }
            if (i > 0) {
                this.f23299M.setBounds(0, -this.f23304b1, getWidth(), i - this.f23304b1);
                this.f23299M.mutate().setAlpha(this.f23300P);
                this.f23299M.draw(canvas);
            }
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        if (this.f23298L == null || this.f23300P <= 0 || !mo31641m(view)) {
            z = false;
        } else {
            mo31651r(this.f23298L, view, getWidth(), getHeight());
            this.f23298L.mutate().setAlpha(this.f23300P);
            this.f23298L.draw(canvas);
            z = true;
        }
        if (super.drawChild(canvas, view, j) || z) {
            return true;
        }
        return false;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f23299M;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f23298L;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        C4332a aVar = this.f23294B;
        if (aVar != null) {
            z |= aVar.mo33092z0(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: e */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    /* renamed from: f */
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public int getCollapsedTitleGravity() {
        return this.f23294B.mo33075r();
    }

    public Typeface getCollapsedTitleTypeface() {
        return this.f23294B.mo33083v();
    }

    public Drawable getContentScrim() {
        return this.f23298L;
    }

    public int getExpandedTitleGravity() {
        return this.f23294B.mo33015A();
    }

    public int getExpandedTitleMarginBottom() {
        return this.f23321y;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f23320x;
    }

    public int getExpandedTitleMarginStart() {
        return this.f23315r;
    }

    public int getExpandedTitleMarginTop() {
        return this.f23317s;
    }

    public Typeface getExpandedTitleTypeface() {
        return this.f23294B.mo33019C();
    }

    public int getHyphenationFrequency() {
        return this.f23294B.mo33024F();
    }

    public int getLineCount() {
        return this.f23294B.mo33025G();
    }

    public float getLineSpacingAdd() {
        return this.f23294B.mo33026H();
    }

    public float getLineSpacingMultiplier() {
        return this.f23294B.mo33027I();
    }

    public int getMaxLines() {
        return this.f23294B.mo33028J();
    }

    public int getScrimAlpha() {
        return this.f23300P;
    }

    public long getScrimAnimationDuration() {
        return this.f23307e0;
    }

    public int getScrimVisibleHeightTrigger() {
        int i;
        int i2 = this.f23311k0;
        if (i2 >= 0) {
            return i2 + this.f23313p1 + this.f23316r1;
        }
        hl7 hl7 = this.f23312o1;
        if (hl7 != null) {
            i = hl7.mo21240m();
        } else {
            i = 0;
        }
        int C = ga7.m17717C(this);
        if (C > 0) {
            return Math.min((C * 2) + i, getHeight());
        }
        return getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.f23299M;
    }

    public CharSequence getTitle() {
        if (this.f23296H) {
            return this.f23294B.mo33029K();
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.f23308e1;
    }

    /* renamed from: h */
    public final int mo31639h(View view) {
        return ((getHeight() - m34596j(view).mo44420b()) - view.getHeight()) - ((LayoutParams) view.getLayoutParams()).bottomMargin;
    }

    /* renamed from: k */
    public final boolean mo31640k() {
        if (this.f23308e1 == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final boolean mo31641m(View view) {
        View view2 = this.f23309g;
        if (view2 == null || view2 == this) {
            if (view == this.f23306e) {
                return true;
            }
        } else if (view == view2) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public hl7 mo31642n(hl7 hl7) {
        hl7 hl72;
        if (ga7.m17802y(this)) {
            hl72 = hl7;
        } else {
            hl72 = null;
        }
        if (!mf4.m22283a(this.f23312o1, hl72)) {
            this.f23312o1 = hl72;
            requestLayout();
        }
        return hl7.mo21228c();
    }

    /* renamed from: o */
    public final void mo31643o(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        View view = this.f23309g;
        if (view == null) {
            view = this.f23306e;
        }
        int h = mo31639h(view);
        rc1.m51059a(this, this.f23310k, this.f23293A);
        ViewGroup viewGroup = this.f23306e;
        int i5 = 0;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            i5 = toolbar.getTitleMarginStart();
            i2 = toolbar.getTitleMarginEnd();
            i = toolbar.getTitleMarginTop();
            i3 = toolbar.getTitleMarginBottom();
        } else if (Build.VERSION.SDK_INT < 24 || !(viewGroup instanceof android.widget.Toolbar)) {
            i3 = 0;
            i2 = 0;
            i = 0;
        } else {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            i5 = toolbar2.getTitleMarginStart();
            i2 = toolbar2.getTitleMarginEnd();
            i = toolbar2.getTitleMarginTop();
            i3 = toolbar2.getTitleMarginBottom();
        }
        C4332a aVar = this.f23294B;
        Rect rect = this.f23293A;
        int i6 = rect.left;
        if (z) {
            i4 = i2;
        } else {
            i4 = i5;
        }
        int i7 = i6 + i4;
        int i8 = rect.top + h + i;
        int i9 = rect.right;
        if (!z) {
            i5 = i2;
        }
        aVar.mo33039X(i7, i8, i9 - i5, (rect.bottom + h) - i3);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            mo31607b(appBarLayout);
            ga7.m17803y0(this, ga7.m17802y(appBarLayout));
            if (this.f23319v0 == null) {
                this.f23319v0 = new C4180c();
            }
            appBarLayout.mo31492b(this.f23319v0);
            ga7.m17779m0(this);
        }
    }

    public void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.C4177d dVar = this.f23319v0;
        if (dVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).mo31527p(dVar);
        }
        super.onDetachedFromWindow();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        hl7 hl7 = this.f23312o1;
        if (hl7 != null) {
            int m = hl7.mo21240m();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!ga7.m17802y(childAt) && childAt.getTop() < m) {
                    ga7.m17755a0(childAt, m);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            m34596j(getChildAt(i6)).mo44425g();
        }
        mo31691u(i, i2, i3, i4, false);
        mo31692v();
        mo31690t();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            m34596j(getChildAt(i7)).mo44419a();
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        mo31608c();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        hl7 hl7 = this.f23312o1;
        if (hl7 != null) {
            i3 = hl7.mo21240m();
        } else {
            i3 = 0;
        }
        if ((mode == 0 || this.f23314q1) && i3 > 0) {
            this.f23313p1 = i3;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + i3, 1073741824));
        }
        if (this.f23318s1 && this.f23294B.mo33028J() > 1) {
            mo31692v();
            mo31691u(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            int G = this.f23294B.mo33025G();
            if (G > 1) {
                this.f23316r1 = Math.round(this.f23294B.mo33091z()) * (G - 1);
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.f23316r1, 1073741824));
            }
        }
        ViewGroup viewGroup = this.f23306e;
        if (viewGroup != null) {
            View view = this.f23309g;
            if (view == null || view == this) {
                setMinimumHeight(m34594g(viewGroup));
            } else {
                setMinimumHeight(m34594g(view));
            }
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.f23298L;
        if (drawable != null) {
            mo31650q(drawable, i, i2);
        }
    }

    /* renamed from: p */
    public final void mo31649p() {
        setContentDescription(getTitle());
    }

    /* renamed from: q */
    public final void mo31650q(Drawable drawable, int i, int i2) {
        mo31651r(drawable, this.f23306e, i, i2);
    }

    /* renamed from: r */
    public final void mo31651r(Drawable drawable, View view, int i, int i2) {
        if (mo31640k() && view != null && this.f23296H) {
            i2 = view.getBottom();
        }
        drawable.setBounds(0, 0, i, i2);
    }

    /* renamed from: s */
    public final void mo31652s() {
        View view;
        if (!this.f23296H && (view = this.f23310k) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f23310k);
            }
        }
        if (this.f23296H && this.f23306e != null) {
            if (this.f23310k == null) {
                this.f23310k = new View(getContext());
            }
            if (this.f23310k.getParent() == null) {
                this.f23306e.addView(this.f23310k, -1, -1);
            }
        }
    }

    public void setCollapsedTitleGravity(int i) {
        this.f23294B.mo33046c0(i);
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.f23294B.mo33041Z(i);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        this.f23294B.mo33048d0(typeface);
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.f23298L;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f23298L = drawable3;
            if (drawable3 != null) {
                mo31650q(drawable3, getWidth(), getHeight());
                this.f23298L.setCallback(this);
                this.f23298L.setAlpha(this.f23300P);
            }
            ga7.m17767g0(this);
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(zr0.m31442e(getContext(), i));
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        this.f23294B.mo33064l0(i);
    }

    public void setExpandedTitleMargin(int i, int i2, int i3, int i4) {
        this.f23315r = i;
        this.f23317s = i2;
        this.f23320x = i3;
        this.f23321y = i4;
        requestLayout();
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.f23321y = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.f23320x = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.f23315r = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.f23317s = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.f23294B.mo33058i0(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        this.f23294B.mo33062k0(colorStateList);
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        this.f23294B.mo33068n0(typeface);
    }

    public void setExtraMultilineHeightEnabled(boolean z) {
        this.f23318s1 = z;
    }

    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.f23314q1 = z;
    }

    public void setHyphenationFrequency(int i) {
        this.f23294B.mo33078s0(i);
    }

    public void setLineSpacingAdd(float f) {
        this.f23294B.mo33082u0(f);
    }

    public void setLineSpacingMultiplier(float f) {
        this.f23294B.mo33084v0(f);
    }

    public void setMaxLines(int i) {
        this.f23294B.mo33086w0(i);
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.f23294B.mo33090y0(z);
    }

    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.f23300P) {
            if (!(this.f23298L == null || (viewGroup = this.f23306e) == null)) {
                ga7.m17767g0(viewGroup);
            }
            this.f23300P = i;
            ga7.m17767g0(this);
        }
    }

    public void setScrimAnimationDuration(long j) {
        this.f23307e0 = j;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.f23311k0 != i) {
            this.f23311k0 = i;
            mo31690t();
        }
    }

    public void setScrimsShown(boolean z) {
        setScrimsShown(z, ga7.m17747T(this) && !isInEditMode());
    }

    public void setStatusBarScrim(Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.f23299M;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f23299M = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f23299M.setState(getDrawableState());
                }
                ij1.m19654m(this.f23299M, ga7.m17715B(this));
                Drawable drawable4 = this.f23299M;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable4.setVisible(z, false);
                this.f23299M.setCallback(this);
                this.f23299M.setAlpha(this.f23300P);
            }
            ga7.m17767g0(this);
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(zr0.m31442e(getContext(), i));
    }

    public void setTitle(CharSequence charSequence) {
        this.f23294B.mo33016A0(charSequence);
        mo31649p();
    }

    public void setTitleCollapseMode(int i) {
        this.f23308e1 = i;
        boolean k = mo31640k();
        this.f23294B.mo33074q0(k);
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            mo31607b((AppBarLayout) parent);
        }
        if (k && this.f23298L == null) {
            setContentScrimColor(this.f23295C.mo49885d(getResources().getDimension(k25.design_appbar_elevation)));
        }
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.f23296H) {
            this.f23296H = z;
            mo31649p();
            mo31652s();
            requestLayout();
        }
    }

    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.f23299M;
        if (!(drawable == null || drawable.isVisible() == z)) {
            this.f23299M.setVisible(z, false);
        }
        Drawable drawable2 = this.f23298L;
        if (drawable2 != null && drawable2.isVisible() != z) {
            this.f23298L.setVisible(z, false);
        }
    }

    /* renamed from: t */
    public final void mo31690t() {
        boolean z;
        if (this.f23298L != null || this.f23299M != null) {
            if (getHeight() + this.f23304b1 < getScrimVisibleHeightTrigger()) {
                z = true;
            } else {
                z = false;
            }
            setScrimsShown(z);
        }
    }

    /* renamed from: u */
    public final void mo31691u(int i, int i2, int i3, int i4, boolean z) {
        View view;
        boolean z2;
        int i5;
        int i6;
        if (this.f23296H && (view = this.f23310k) != null) {
            boolean z3 = false;
            if (!ga7.m17746S(view) || this.f23310k.getVisibility() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.f23297I = z2;
            if (z2 || z) {
                if (ga7.m17715B(this) == 1) {
                    z3 = true;
                }
                mo31643o(z3);
                C4332a aVar = this.f23294B;
                if (z3) {
                    i5 = this.f23320x;
                } else {
                    i5 = this.f23315r;
                }
                int i7 = this.f23293A.top + this.f23317s;
                int i8 = i3 - i;
                if (z3) {
                    i6 = this.f23315r;
                } else {
                    i6 = this.f23320x;
                }
                aVar.mo33054g0(i5, i7, i8 - i6, (i4 - i2) - this.f23321y);
                this.f23294B.mo33038V(z);
            }
        }
    }

    /* renamed from: v */
    public final void mo31692v() {
        if (this.f23306e != null && this.f23296H && TextUtils.isEmpty(this.f23294B.mo33029K())) {
            setTitle(m34595i(this.f23306e));
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f23298L || drawable == this.f23299M) {
            return true;
        }
        return false;
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j15.collapsingToolbarLayoutStyle);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.f23294B.mo33044b0(colorStateList);
    }

    public void setScrimsShown(boolean z, boolean z2) {
        if (this.f23301Q != z) {
            int i = 255;
            if (z2) {
                if (!z) {
                    i = 0;
                }
                mo31606a(i);
            } else {
                if (!z) {
                    i = 0;
                }
                setScrimAlpha(i);
            }
            this.f23301Q = z;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CollapsingToolbarLayout(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            int r4 = f23292t1
            android.content.Context r10 = p000.xo3.m54461c(r10, r11, r12, r4)
            r9.<init>(r10, r11, r12)
            r10 = 1
            r9.f23303a = r10
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r9.f23293A = r0
            r6 = -1
            r9.f23311k0 = r6
            r7 = 0
            r9.f23313p1 = r7
            r9.f23316r1 = r7
            android.content.Context r0 = r9.getContext()
            com.google.android.material.internal.a r8 = new com.google.android.material.internal.a
            r8.<init>(r9)
            r9.f23294B = r8
            android.animation.TimeInterpolator r1 = p000.C5807el.f28632e
            r8.mo33018B0(r1)
            r8.mo33090y0(r7)
            zn1 r1 = new zn1
            r1.<init>(r0)
            r9.f23295C = r1
            int[] r2 = p000.u55.CollapsingToolbarLayout
            int[] r5 = new int[r7]
            r1 = r11
            r3 = r12
            android.content.res.TypedArray r11 = p000.wo6.m54004h(r0, r1, r2, r3, r4, r5)
            int r12 = p000.u55.CollapsingToolbarLayout_expandedTitleGravity
            r0 = 8388691(0x800053, float:1.175506E-38)
            int r12 = r11.getInt(r12, r0)
            r8.mo33064l0(r12)
            int r12 = p000.u55.CollapsingToolbarLayout_collapsedTitleGravity
            r0 = 8388627(0x800013, float:1.175497E-38)
            int r12 = r11.getInt(r12, r0)
            r8.mo33046c0(r12)
            int r12 = p000.u55.CollapsingToolbarLayout_expandedTitleMargin
            int r12 = r11.getDimensionPixelSize(r12, r7)
            r9.f23321y = r12
            r9.f23320x = r12
            r9.f23317s = r12
            r9.f23315r = r12
            int r12 = p000.u55.CollapsingToolbarLayout_expandedTitleMarginStart
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x0073
            int r12 = r11.getDimensionPixelSize(r12, r7)
            r9.f23315r = r12
        L_0x0073:
            int r12 = p000.u55.CollapsingToolbarLayout_expandedTitleMarginEnd
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x0081
            int r12 = r11.getDimensionPixelSize(r12, r7)
            r9.f23320x = r12
        L_0x0081:
            int r12 = p000.u55.CollapsingToolbarLayout_expandedTitleMarginTop
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x008f
            int r12 = r11.getDimensionPixelSize(r12, r7)
            r9.f23317s = r12
        L_0x008f:
            int r12 = p000.u55.CollapsingToolbarLayout_expandedTitleMarginBottom
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x009d
            int r12 = r11.getDimensionPixelSize(r12, r7)
            r9.f23321y = r12
        L_0x009d:
            int r12 = p000.u55.CollapsingToolbarLayout_titleEnabled
            boolean r12 = r11.getBoolean(r12, r10)
            r9.f23296H = r12
            int r12 = p000.u55.CollapsingToolbarLayout_title
            java.lang.CharSequence r12 = r11.getText(r12)
            r9.setTitle(r12)
            int r12 = p000.e55.TextAppearance_Design_CollapsingToolbar_Expanded
            r8.mo33058i0(r12)
            int r12 = p000.h55.TextAppearance_AppCompat_Widget_ActionBar_Title
            r8.mo33041Z(r12)
            int r12 = p000.u55.CollapsingToolbarLayout_expandedTitleTextAppearance
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x00c7
            int r12 = r11.getResourceId(r12, r7)
            r8.mo33058i0(r12)
        L_0x00c7:
            int r12 = p000.u55.CollapsingToolbarLayout_collapsedTitleTextAppearance
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x00d6
            int r12 = r11.getResourceId(r12, r7)
            r8.mo33041Z(r12)
        L_0x00d6:
            int r12 = p000.u55.CollapsingToolbarLayout_scrimVisibleHeightTrigger
            int r12 = r11.getDimensionPixelSize(r12, r6)
            r9.f23311k0 = r12
            int r12 = p000.u55.CollapsingToolbarLayout_maxLines
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x00ed
            int r10 = r11.getInt(r12, r10)
            r8.mo33086w0(r10)
        L_0x00ed:
            int r10 = p000.u55.CollapsingToolbarLayout_scrimAnimationDuration
            r12 = 600(0x258, float:8.41E-43)
            int r10 = r11.getInt(r10, r12)
            long r0 = (long) r10
            r9.f23307e0 = r0
            int r10 = p000.u55.CollapsingToolbarLayout_contentScrim
            android.graphics.drawable.Drawable r10 = r11.getDrawable(r10)
            r9.setContentScrim(r10)
            int r10 = p000.u55.CollapsingToolbarLayout_statusBarScrim
            android.graphics.drawable.Drawable r10 = r11.getDrawable(r10)
            r9.setStatusBarScrim(r10)
            int r10 = p000.u55.CollapsingToolbarLayout_titleCollapseMode
            int r10 = r11.getInt(r10, r7)
            r9.setTitleCollapseMode(r10)
            int r10 = p000.u55.CollapsingToolbarLayout_toolbarId
            int r10 = r11.getResourceId(r10, r6)
            r9.f23305d = r10
            int r10 = p000.u55.CollapsingToolbarLayout_forceApplySystemWindowInsetTop
            boolean r10 = r11.getBoolean(r10, r7)
            r9.f23314q1 = r10
            int r10 = p000.u55.CollapsingToolbarLayout_extraMultilineHeightEnabled
            boolean r10 = r11.getBoolean(r10, r7)
            r9.f23318s1 = r10
            r11.recycle()
            r9.setWillNotDraw(r7)
            com.google.android.material.appbar.CollapsingToolbarLayout$a r10 = new com.google.android.material.appbar.CollapsingToolbarLayout$a
            r10.<init>()
            p000.ga7.m17720D0(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public static class LayoutParams extends FrameLayout.LayoutParams {

        /* renamed from: a */
        public int f23322a = 0;

        /* renamed from: b */
        public float f23323b = 0.5f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u55.CollapsingToolbarLayout_Layout);
            this.f23322a = obtainStyledAttributes.getInt(u55.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            mo31694a(obtainStyledAttributes.getFloat(u55.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f));
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public void mo31694a(float f) {
            this.f23323b = f;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
