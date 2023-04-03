package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0173e;

public class ActionBarContextView extends C2940o5 {

    /* renamed from: A */
    public CharSequence f877A;

    /* renamed from: B */
    public View f878B;

    /* renamed from: C */
    public View f879C;

    /* renamed from: H */
    public View f880H;

    /* renamed from: I */
    public LinearLayout f881I;

    /* renamed from: L */
    public TextView f882L;

    /* renamed from: M */
    public TextView f883M;

    /* renamed from: P */
    public int f884P;

    /* renamed from: Q */
    public int f885Q;

    /* renamed from: U */
    public boolean f886U;

    /* renamed from: e0 */
    public int f887e0;

    /* renamed from: y */
    public CharSequence f888y;

    /* renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    public class C0191a implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ C2346g9 f889a;

        public C0191a(C2346g9 g9Var) {
            this.f889a = g9Var;
        }

        public void onClick(View view) {
            this.f889a.mo1243c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: f */
    public /* bridge */ /* synthetic */ vd7 mo1596f(int i, long j) {
        return super.mo1596f(i, j);
    }

    /* renamed from: g */
    public void mo1597g() {
        if (this.f878B == null) {
            mo1607k();
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f877A;
    }

    public CharSequence getTitle() {
        return this.f888y;
    }

    /* renamed from: h */
    public void mo1604h(C2346g9 g9Var) {
        View view = this.f878B;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f887e0, this, false);
            this.f878B = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f878B);
        }
        View findViewById = this.f878B.findViewById(j35.action_mode_close_button);
        this.f879C = findViewById;
        findViewById.setOnClickListener(new C0191a(g9Var));
        C0173e eVar = (C0173e) g9Var.mo1245e();
        ActionMenuPresenter actionMenuPresenter = this.f15806g;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo1690B();
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.f15806g = actionMenuPresenter2;
        actionMenuPresenter2.mo1701M(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        eVar.mo1412c(this.f15806g, this.f15804d);
        ActionMenuView actionMenuView = (ActionMenuView) this.f15806g.mo1318r(this);
        this.f15805e = actionMenuView;
        ga7.m17793t0(actionMenuView, (Drawable) null);
        addView(this.f15805e, layoutParams);
    }

    /* renamed from: i */
    public final void mo1605i() {
        int i;
        if (this.f881I == null) {
            LayoutInflater.from(getContext()).inflate(i45.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f881I = linearLayout;
            this.f882L = (TextView) linearLayout.findViewById(j35.action_bar_title);
            this.f883M = (TextView) this.f881I.findViewById(j35.action_bar_subtitle);
            if (this.f884P != 0) {
                this.f882L.setTextAppearance(getContext(), this.f884P);
            }
            if (this.f885Q != 0) {
                this.f883M.setTextAppearance(getContext(), this.f885Q);
            }
        }
        this.f882L.setText(this.f888y);
        this.f883M.setText(this.f877A);
        boolean z = !TextUtils.isEmpty(this.f888y);
        boolean z2 = !TextUtils.isEmpty(this.f877A);
        TextView textView = this.f883M;
        int i2 = 0;
        if (z2) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        LinearLayout linearLayout2 = this.f881I;
        if (!z && !z2) {
            i2 = 8;
        }
        linearLayout2.setVisibility(i2);
        if (this.f881I.getParent() == null) {
            addView(this.f881I);
        }
    }

    /* renamed from: j */
    public boolean mo1606j() {
        return this.f886U;
    }

    /* renamed from: k */
    public void mo1607k() {
        removeAllViews();
        this.f880H = null;
        this.f15805e = null;
        this.f15806g = null;
        View view = this.f879C;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    /* renamed from: l */
    public boolean mo1608l() {
        ActionMenuPresenter actionMenuPresenter = this.f15806g;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.mo1702N();
        }
        return false;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f15806g;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo1693E();
            this.f15806g.mo1694F();
        }
    }

    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        boolean b = re7.m26176b(this);
        if (b) {
            i5 = (i3 - i) - getPaddingRight();
        } else {
            i5 = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f878B;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f878B.getLayoutParams();
            if (b) {
                i7 = marginLayoutParams.rightMargin;
            } else {
                i7 = marginLayoutParams.leftMargin;
            }
            if (b) {
                i8 = marginLayoutParams.leftMargin;
            } else {
                i8 = marginLayoutParams.rightMargin;
            }
            int d = C2940o5.m23663d(i5, i7, b);
            i5 = C2940o5.m23663d(d + mo23903e(this.f878B, d, paddingTop, paddingTop2, b), i8, b);
        }
        int i9 = i5;
        LinearLayout linearLayout = this.f881I;
        if (!(linearLayout == null || this.f880H != null || linearLayout.getVisibility() == 8)) {
            i9 += mo23903e(this.f881I, i9, paddingTop, paddingTop2, b);
        }
        int i10 = i9;
        View view2 = this.f880H;
        if (view2 != null) {
            mo23903e(view2, i10, paddingTop, paddingTop2, b);
        }
        if (b) {
            i6 = getPaddingLeft();
        } else {
            i6 = (i3 - i) - getPaddingRight();
        }
        ActionMenuView actionMenuView = this.f15805e;
        if (actionMenuView != null) {
            mo23903e(actionMenuView, i6, paddingTop, paddingTop2, !b);
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            int i6 = this.f15807k;
            if (i6 <= 0) {
                i6 = View.MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i7 = i6 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
            View view = this.f878B;
            if (view != null) {
                int c = mo23902c(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f878B.getLayoutParams();
                paddingLeft = c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f15805e;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = mo23902c(this.f15805e, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f881I;
            if (linearLayout != null && this.f880H == null) {
                if (this.f886U) {
                    this.f881I.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f881I.getMeasuredWidth();
                    if (measuredWidth <= paddingLeft) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    LinearLayout linearLayout2 = this.f881I;
                    if (z) {
                        i4 = 0;
                    } else {
                        i4 = 8;
                    }
                    linearLayout2.setVisibility(i4);
                } else {
                    paddingLeft = mo23902c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f880H;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i8 = layoutParams.width;
                if (i8 != -2) {
                    i3 = 1073741824;
                } else {
                    i3 = Integer.MIN_VALUE;
                }
                if (i8 >= 0) {
                    paddingLeft = Math.min(i8, paddingLeft);
                }
                int i9 = layoutParams.height;
                if (i9 == -2) {
                    i5 = Integer.MIN_VALUE;
                }
                if (i9 >= 0) {
                    i7 = Math.min(i9, i7);
                }
                this.f880H.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i3), View.MeasureSpec.makeMeasureSpec(i7, i5));
            }
            if (this.f15807k <= 0) {
                int childCount = getChildCount();
                int i10 = 0;
                for (int i11 = 0; i11 < childCount; i11++) {
                    int measuredHeight = getChildAt(i11).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i10) {
                        i10 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i10);
                return;
            }
            setMeasuredDimension(size, i6);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setContentHeight(int i) {
        this.f15807k = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f880H;
        if (view2 != null) {
            removeView(view2);
        }
        this.f880H = view;
        if (!(view == null || (linearLayout = this.f881I) == null)) {
            removeView(linearLayout);
            this.f881I = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f877A = charSequence;
        mo1605i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f888y = charSequence;
        mo1605i();
        ga7.m17791s0(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f886U) {
            requestLayout();
        }
        this.f886U = z;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, m15.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        yq6 v = yq6.m30733v(context, attributeSet, j65.ActionMode, i, 0);
        ga7.m17793t0(this, v.mo28181g(j65.ActionMode_background));
        this.f884P = v.mo28188n(j65.ActionMode_titleTextStyle, 0);
        this.f885Q = v.mo28188n(j65.ActionMode_subtitleTextStyle, 0);
        this.f15807k = v.mo28187m(j65.ActionMode_height, 0);
        this.f887e0 = v.mo28188n(j65.ActionMode_closeItemLayout, i45.abc_action_mode_close_item_material);
        v.mo28194w();
    }
}
