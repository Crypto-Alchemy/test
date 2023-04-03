package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: A */
    public int f867A;

    /* renamed from: a */
    public boolean f868a;

    /* renamed from: d */
    public View f869d;

    /* renamed from: e */
    public View f870e;

    /* renamed from: g */
    public View f871g;

    /* renamed from: k */
    public Drawable f872k;

    /* renamed from: r */
    public Drawable f873r;

    /* renamed from: s */
    public Drawable f874s;

    /* renamed from: x */
    public boolean f875x;

    /* renamed from: y */
    public boolean f876y;

    /* renamed from: androidx.appcompat.widget.ActionBarContainer$a */
    public static class C0190a {
        /* renamed from: a */
        public static void m1227a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final int mo1576a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    public final boolean mo1577b(View view) {
        if (view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0) {
            return true;
        }
        return false;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f872k;
        if (drawable != null && drawable.isStateful()) {
            this.f872k.setState(getDrawableState());
        }
        Drawable drawable2 = this.f873r;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f873r.setState(getDrawableState());
        }
        Drawable drawable3 = this.f874s;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f874s.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f869d;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f872k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f873r;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f874s;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f870e = findViewById(j35.action_bar);
        this.f871g = findViewById(j35.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f868a || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            super.onLayout(r5, r6, r7, r8, r9)
            android.view.View r5 = r4.f869d
            r7 = 8
            r9 = 1
            r0 = 0
            if (r5 == 0) goto L_0x0013
            int r1 = r5.getVisibility()
            if (r1 == r7) goto L_0x0013
            r1 = r9
            goto L_0x0014
        L_0x0013:
            r1 = r0
        L_0x0014:
            if (r5 == 0) goto L_0x0033
            int r2 = r5.getVisibility()
            if (r2 == r7) goto L_0x0033
            int r7 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r3 = r5.getMeasuredHeight()
            int r3 = r7 - r3
            int r2 = r2.bottomMargin
            int r3 = r3 - r2
            int r7 = r7 - r2
            r5.layout(r6, r3, r8, r7)
        L_0x0033:
            boolean r6 = r4.f875x
            if (r6 == 0) goto L_0x004b
            android.graphics.drawable.Drawable r5 = r4.f874s
            if (r5 == 0) goto L_0x0048
            int r6 = r4.getMeasuredWidth()
            int r7 = r4.getMeasuredHeight()
            r5.setBounds(r0, r0, r6, r7)
            goto L_0x00be
        L_0x0048:
            r9 = r0
            goto L_0x00be
        L_0x004b:
            android.graphics.drawable.Drawable r6 = r4.f872k
            if (r6 == 0) goto L_0x00a3
            android.view.View r6 = r4.f870e
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x0075
            android.graphics.drawable.Drawable r6 = r4.f872k
            android.view.View r7 = r4.f870e
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f870e
            int r8 = r8.getTop()
            android.view.View r0 = r4.f870e
            int r0 = r0.getRight()
            android.view.View r2 = r4.f870e
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto L_0x00a2
        L_0x0075:
            android.view.View r6 = r4.f871g
            if (r6 == 0) goto L_0x009d
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x009d
            android.graphics.drawable.Drawable r6 = r4.f872k
            android.view.View r7 = r4.f871g
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f871g
            int r8 = r8.getTop()
            android.view.View r0 = r4.f871g
            int r0 = r0.getRight()
            android.view.View r2 = r4.f871g
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto L_0x00a2
        L_0x009d:
            android.graphics.drawable.Drawable r6 = r4.f872k
            r6.setBounds(r0, r0, r0, r0)
        L_0x00a2:
            r0 = r9
        L_0x00a3:
            r4.f876y = r1
            if (r1 == 0) goto L_0x0048
            android.graphics.drawable.Drawable r6 = r4.f873r
            if (r6 == 0) goto L_0x0048
            int r7 = r5.getLeft()
            int r8 = r5.getTop()
            int r0 = r5.getRight()
            int r5 = r5.getBottom()
            r6.setBounds(r7, r8, r0, r5)
        L_0x00be:
            if (r9 == 0) goto L_0x00c3
            r4.invalidate()
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.f870e == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i5 = this.f867A) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i5, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f870e != null) {
            int mode = View.MeasureSpec.getMode(i2);
            View view = this.f869d;
            if (view != null && view.getVisibility() != 8 && mode != 1073741824) {
                if (!mo1577b(this.f870e)) {
                    i3 = mo1576a(this.f870e);
                } else if (!mo1577b(this.f871g)) {
                    i3 = mo1576a(this.f871g);
                } else {
                    i3 = 0;
                }
                if (mode == Integer.MIN_VALUE) {
                    i4 = View.MeasureSpec.getSize(i2);
                } else {
                    i4 = Integer.MAX_VALUE;
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(i3 + mo1576a(this.f869d), i4));
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f872k;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f872k);
        }
        this.f872k = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f870e;
            if (view != null) {
                this.f872k.setBounds(view.getLeft(), this.f870e.getTop(), this.f870e.getRight(), this.f870e.getBottom());
            }
        }
        boolean z = true;
        if (!this.f875x ? !(this.f872k == null && this.f873r == null) : this.f874s != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        C0190a.m1227a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f874s;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f874s);
        }
        this.f874s = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f875x && (drawable2 = this.f874s) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f875x ? this.f872k == null && this.f873r == null : this.f874s == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        C0190a.m1227a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f873r;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f873r);
        }
        this.f873r = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f876y && (drawable2 = this.f873r) != null) {
                drawable2.setBounds(this.f869d.getLeft(), this.f869d.getTop(), this.f869d.getRight(), this.f869d.getBottom());
            }
        }
        boolean z = true;
        if (!this.f875x ? !(this.f872k == null && this.f873r == null) : this.f874s != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        C0190a.m1227a(this);
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.f869d;
        if (view != null) {
            removeView(view);
        }
        this.f869d = scrollingTabContainerView;
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            ViewGroup.LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        int i;
        this.f868a = z;
        if (z) {
            i = 393216;
        } else {
            i = 262144;
        }
        setDescendantFocusability(i);
    }

    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.f872k;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f873r;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f874s;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    public boolean verifyDrawable(Drawable drawable) {
        if ((drawable != this.f872k || this.f875x) && ((drawable != this.f873r || !this.f876y) && ((drawable != this.f874s || !this.f875x) && !super.verifyDrawable(drawable)))) {
            return false;
        }
        return true;
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ga7.m17793t0(this, new C1614b9(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j65.ActionBar);
        this.f872k = obtainStyledAttributes.getDrawable(j65.ActionBar_background);
        this.f873r = obtainStyledAttributes.getDrawable(j65.ActionBar_backgroundStacked);
        this.f867A = obtainStyledAttributes.getDimensionPixelSize(j65.ActionBar_height, -1);
        boolean z = true;
        if (getId() == j35.split_action_bar) {
            this.f875x = true;
            this.f874s = obtainStyledAttributes.getDrawable(j65.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        if (!this.f875x ? !(this.f872k == null && this.f873r == null) : this.f874s != null) {
            z = false;
        }
        setWillNotDraw(z);
    }
}
