package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.LinearLayoutCompat;

public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: C */
    public static final Interpolator f1131C = new DecelerateInterpolator();

    /* renamed from: A */
    public ViewPropertyAnimator f1132A;

    /* renamed from: B */
    public final C0245e f1133B = new C0245e();

    /* renamed from: a */
    public Runnable f1134a;

    /* renamed from: d */
    public C0243c f1135d;

    /* renamed from: e */
    public LinearLayoutCompat f1136e;

    /* renamed from: g */
    public Spinner f1137g;

    /* renamed from: k */
    public boolean f1138k;

    /* renamed from: r */
    public int f1139r;

    /* renamed from: s */
    public int f1140s;

    /* renamed from: x */
    public int f1141x;

    /* renamed from: y */
    public int f1142y;

    /* renamed from: androidx.appcompat.widget.ScrollingTabContainerView$a */
    public class C0241a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ View f1143a;

        public C0241a(View view) {
            this.f1143a = view;
        }

        public void run() {
            ScrollingTabContainerView.this.smoothScrollTo(this.f1143a.getLeft() - ((ScrollingTabContainerView.this.getWidth() - this.f1143a.getWidth()) / 2), 0);
            ScrollingTabContainerView.this.f1134a = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ScrollingTabContainerView$b */
    public class C0242b extends BaseAdapter {
        public C0242b() {
        }

        public int getCount() {
            return ScrollingTabContainerView.this.f1136e.getChildCount();
        }

        public Object getItem(int i) {
            return ((C0244d) ScrollingTabContainerView.this.f1136e.getChildAt(i)).mo2257b();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return ScrollingTabContainerView.this.mo2237d((ActionBar.C0111b) getItem(i), true);
            }
            ((C0244d) view).mo2256a((ActionBar.C0111b) getItem(i));
            return view;
        }
    }

    /* renamed from: androidx.appcompat.widget.ScrollingTabContainerView$c */
    public class C0243c implements View.OnClickListener {
        public C0243c() {
        }

        public void onClick(View view) {
            boolean z;
            ((C0244d) view).mo2257b().mo979e();
            int childCount = ScrollingTabContainerView.this.f1136e.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = ScrollingTabContainerView.this.f1136e.getChildAt(i);
                if (childAt == view) {
                    z = true;
                } else {
                    z = false;
                }
                childAt.setSelected(z);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ScrollingTabContainerView$d */
    public class C0244d extends LinearLayout {

        /* renamed from: a */
        public final int[] f1147a;

        /* renamed from: d */
        public ActionBar.C0111b f1148d;

        /* renamed from: e */
        public TextView f1149e;

        /* renamed from: g */
        public ImageView f1150g;

        /* renamed from: k */
        public View f1151k;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C0244d(android.content.Context r6, androidx.appcompat.app.ActionBar.C0111b r7, boolean r8) {
            /*
                r4 = this;
                androidx.appcompat.widget.ScrollingTabContainerView.this = r5
                int r5 = p000.m15.actionBarTabStyle
                r0 = 0
                r4.<init>(r6, r0, r5)
                r1 = 1
                int[] r1 = new int[r1]
                r2 = 16842964(0x10100d4, float:2.3694152E-38)
                r3 = 0
                r1[r3] = r2
                r4.f1147a = r1
                r4.f1148d = r7
                yq6 r5 = p000.yq6.m30733v(r6, r0, r1, r5, r3)
                boolean r6 = r5.mo28193s(r3)
                if (r6 == 0) goto L_0x0026
                android.graphics.drawable.Drawable r6 = r5.mo28181g(r3)
                r4.setBackgroundDrawable(r6)
            L_0x0026:
                r5.mo28194w()
                if (r8 == 0) goto L_0x0031
                r5 = 8388627(0x800013, float:1.175497E-38)
                r4.setGravity(r5)
            L_0x0031:
                r4.mo2258c()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ScrollingTabContainerView.C0244d.<init>(androidx.appcompat.widget.ScrollingTabContainerView, android.content.Context, androidx.appcompat.app.ActionBar$b, boolean):void");
        }

        /* renamed from: a */
        public void mo2256a(ActionBar.C0111b bVar) {
            this.f1148d = bVar;
            mo2258c();
        }

        /* renamed from: b */
        public ActionBar.C0111b mo2257b() {
            return this.f1148d;
        }

        /* renamed from: c */
        public void mo2258c() {
            ActionBar.C0111b bVar = this.f1148d;
            View b = bVar.mo976b();
            CharSequence charSequence = null;
            if (b != null) {
                ViewParent parent = b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b);
                    }
                    addView(b);
                }
                this.f1151k = b;
                TextView textView = this.f1149e;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1150g;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1150g.setImageDrawable((Drawable) null);
                    return;
                }
                return;
            }
            View view = this.f1151k;
            if (view != null) {
                removeView(view);
                this.f1151k = null;
            }
            Drawable c = bVar.mo977c();
            CharSequence d = bVar.mo978d();
            if (c != null) {
                if (this.f1150g == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f1150g = appCompatImageView;
                }
                this.f1150g.setImageDrawable(c);
                this.f1150g.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1150g;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1150g.setImageDrawable((Drawable) null);
                }
            }
            boolean z = !TextUtils.isEmpty(d);
            if (z) {
                if (this.f1149e == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null, m15.actionBarTabTextStyle);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f1149e = appCompatTextView;
                }
                this.f1149e.setText(d);
                this.f1149e.setVisibility(0);
            } else {
                TextView textView2 = this.f1149e;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1149e.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1150g;
            if (imageView3 != null) {
                imageView3.setContentDescription(bVar.mo975a());
            }
            if (!z) {
                charSequence = bVar.mo975a();
            }
            xr6.m30294a(this, charSequence);
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onMeasure(int i, int i2) {
            int i3;
            super.onMeasure(i, i2);
            if (ScrollingTabContainerView.this.f1139r > 0 && getMeasuredWidth() > (i3 = ScrollingTabContainerView.this.f1139r)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
            }
        }

        public void setSelected(boolean z) {
            boolean z2;
            if (isSelected() != z) {
                z2 = true;
            } else {
                z2 = false;
            }
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ScrollingTabContainerView$e */
    public class C0245e extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f1153a = false;

        /* renamed from: d */
        public int f1154d;

        public C0245e() {
        }

        public void onAnimationCancel(Animator animator) {
            this.f1153a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f1153a) {
                ScrollingTabContainerView scrollingTabContainerView = ScrollingTabContainerView.this;
                scrollingTabContainerView.f1132A = null;
                scrollingTabContainerView.setVisibility(this.f1154d);
            }
        }

        public void onAnimationStart(Animator animator) {
            ScrollingTabContainerView.this.setVisibility(0);
            this.f1153a = false;
        }
    }

    public ScrollingTabContainerView(Context context) {
        super(context);
        setHorizontalScrollBarEnabled(false);
        C2215e9 b = C2215e9.m15978b(context);
        setContentHeight(b.mo19212f());
        this.f1140s = b.mo19211e();
        LinearLayoutCompat c = mo2236c();
        this.f1136e = c;
        addView(c, new ViewGroup.LayoutParams(-2, -1));
    }

    /* renamed from: a */
    public void mo2234a(int i) {
        View childAt = this.f1136e.getChildAt(i);
        Runnable runnable = this.f1134a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        C0241a aVar = new C0241a(childAt);
        this.f1134a = aVar;
        post(aVar);
    }

    /* renamed from: b */
    public final Spinner mo2235b() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), (AttributeSet) null, m15.actionDropDownStyle);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    /* renamed from: c */
    public final LinearLayoutCompat mo2236c() {
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), (AttributeSet) null, m15.actionBarTabBarStyle);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        return linearLayoutCompat;
    }

    /* renamed from: d */
    public C0244d mo2237d(ActionBar.C0111b bVar, boolean z) {
        C0244d dVar = new C0244d(getContext(), bVar, z);
        if (z) {
            dVar.setBackgroundDrawable((Drawable) null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1141x));
        } else {
            dVar.setFocusable(true);
            if (this.f1135d == null) {
                this.f1135d = new C0243c();
            }
            dVar.setOnClickListener(this.f1135d);
        }
        return dVar;
    }

    /* renamed from: e */
    public final boolean mo2238e() {
        Spinner spinner = this.f1137g;
        if (spinner == null || spinner.getParent() != this) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final void mo2239f() {
        if (!mo2238e()) {
            if (this.f1137g == null) {
                this.f1137g = mo2235b();
            }
            removeView(this.f1136e);
            addView(this.f1137g, new ViewGroup.LayoutParams(-2, -1));
            if (this.f1137g.getAdapter() == null) {
                this.f1137g.setAdapter(new C0242b());
            }
            Runnable runnable = this.f1134a;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f1134a = null;
            }
            this.f1137g.setSelection(this.f1142y);
        }
    }

    /* renamed from: g */
    public final boolean mo2240g() {
        if (!mo2238e()) {
            return false;
        }
        removeView(this.f1137g);
        addView(this.f1136e, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f1137g.getSelectedItemPosition());
        return false;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1134a;
        if (runnable != null) {
            post(runnable);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C2215e9 b = C2215e9.m15978b(getContext());
        setContentHeight(b.mo19212f());
        this.f1140s = b.mo19211e();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1134a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C0244d) view).mo2257b().mo979e();
    }

    public void onMeasure(int i, int i2) {
        boolean z;
        int mode = View.MeasureSpec.getMode(i);
        boolean z2 = true;
        if (mode == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        setFillViewport(z);
        int childCount = this.f1136e.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f1139r = -1;
        } else {
            if (childCount > 2) {
                this.f1139r = (int) (((float) View.MeasureSpec.getSize(i)) * 0.4f);
            } else {
                this.f1139r = View.MeasureSpec.getSize(i) / 2;
            }
            this.f1139r = Math.min(this.f1139r, this.f1140s);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1141x, 1073741824);
        if (z || !this.f1138k) {
            z2 = false;
        }
        if (z2) {
            this.f1136e.measure(0, makeMeasureSpec);
            if (this.f1136e.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                mo2239f();
            } else {
                mo2240g();
            }
        } else {
            mo2240g();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z && measuredWidth != measuredWidth2) {
            setTabSelected(this.f1142y);
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f1138k = z;
    }

    public void setContentHeight(int i) {
        this.f1141x = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        boolean z;
        this.f1142y = i;
        int childCount = this.f1136e.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.f1136e.getChildAt(i2);
            if (i2 == i) {
                z = true;
            } else {
                z = false;
            }
            childAt.setSelected(z);
            if (z) {
                mo2234a(i);
            }
        }
        Spinner spinner = this.f1137g;
        if (spinner != null && i >= 0) {
            spinner.setSelection(i);
        }
    }
}
