package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;

public class Snackbar extends BaseTransientBottomBar<Snackbar> {

    /* renamed from: A */
    public static final int[] f24323A;

    /* renamed from: B */
    public static final int[] f24324B;

    /* renamed from: y */
    public final AccessibilityManager f24325y;

    /* renamed from: z */
    public boolean f24326z;

    public static final class SnackbarLayout extends BaseTransientBottomBar.SnackbarBaseLayout {
        public SnackbarLayout(Context context) {
            super(context);
        }

        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: com.google.android.material.snackbar.Snackbar$a */
    public class C4384a implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ View.OnClickListener f24327a;

        public C4384a(View.OnClickListener onClickListener) {
            this.f24327a = onClickListener;
        }

        public void onClick(View view) {
            this.f24327a.onClick(view);
            Snackbar.this.mo33506w(1);
        }
    }

    static {
        int i = j15.snackbarButtonStyle;
        f24323A = new int[]{i};
        f24324B = new int[]{i, j15.snackbarTextViewStyle};
    }

    public Snackbar(Context context, ViewGroup viewGroup, View view, wr0 wr0) {
        super(context, viewGroup, view, wr0);
        this.f24325y = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* renamed from: Y */
    public static ViewGroup m35950Y(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                    continue;
                } else {
                    view = null;
                    continue;
                }
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    /* renamed from: Z */
    public static boolean m35951Z(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f24324B);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        if (resourceId == -1 || resourceId2 == -1) {
            return false;
        }
        return true;
    }

    /* renamed from: a0 */
    public static Snackbar m35952a0(View view, int i, int i2) {
        return m35953b0(view, view.getResources().getText(i), i2);
    }

    /* renamed from: b0 */
    public static Snackbar m35953b0(View view, CharSequence charSequence, int i) {
        return m35954c0((Context) null, view, charSequence, i);
    }

    /* renamed from: c0 */
    public static Snackbar m35954c0(Context context, View view, CharSequence charSequence, int i) {
        int i2;
        ViewGroup Y = m35950Y(view);
        if (Y != null) {
            if (context == null) {
                context = Y.getContext();
            }
            LayoutInflater from = LayoutInflater.from(context);
            if (m35951Z(context)) {
                i2 = c45.mtrl_layout_snackbar_include;
            } else {
                i2 = c45.design_layout_snackbar_include;
            }
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate(i2, Y, false);
            Snackbar snackbar = new Snackbar(context, Y, snackbarContentLayout, snackbarContentLayout);
            snackbar.mo33555g0(charSequence);
            snackbar.mo33490M(i);
            return snackbar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    /* renamed from: Q */
    public void mo33494Q() {
        super.mo33494Q();
    }

    /* renamed from: d0 */
    public Snackbar mo33552d0(int i, View.OnClickListener onClickListener) {
        return mo33553e0(mo33508y().getText(i), onClickListener);
    }

    /* renamed from: e0 */
    public Snackbar mo33553e0(CharSequence charSequence, View.OnClickListener onClickListener) {
        Button actionView = ((SnackbarContentLayout) this.f24272c.getChildAt(0)).getActionView();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            actionView.setVisibility(8);
            actionView.setOnClickListener((View.OnClickListener) null);
            this.f24326z = false;
        } else {
            this.f24326z = true;
            actionView.setVisibility(0);
            actionView.setText(charSequence);
            actionView.setOnClickListener(new C4384a(onClickListener));
        }
        return this;
    }

    /* renamed from: f0 */
    public Snackbar mo33554f0(int i) {
        return mo33555g0(mo33508y().getText(i));
    }

    /* renamed from: g0 */
    public Snackbar mo33555g0(CharSequence charSequence) {
        ((SnackbarContentLayout) this.f24272c.getChildAt(0)).getMessageView().setText(charSequence);
        return this;
    }

    /* renamed from: v */
    public void mo33505v() {
        super.mo33505v();
    }

    /* renamed from: z */
    public int mo33509z() {
        int i;
        int z = super.mo33509z();
        if (z == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.f24326z) {
                i = 4;
            } else {
                i = 0;
            }
            return this.f24325y.getRecommendedTimeoutMillis(z, i | 1 | 2);
        } else if (!this.f24326z || !this.f24325y.isTouchExplorationEnabled()) {
            return z;
        } else {
            return -2;
        }
    }
}
