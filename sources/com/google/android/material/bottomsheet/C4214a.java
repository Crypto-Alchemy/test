package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: com.google.android.material.bottomsheet.a */
/* compiled from: BottomSheetDialog */
public class C4214a extends C3629xm {
    /* access modifiers changed from: private */
    public BottomSheetBehavior<FrameLayout> behavior;
    /* access modifiers changed from: private */
    public FrameLayout bottomSheet;
    private BottomSheetBehavior.C4212g bottomSheetCallback;
    public boolean cancelable;
    private boolean canceledOnTouchOutside;
    private boolean canceledOnTouchOutsideSet;
    private FrameLayout container;
    private CoordinatorLayout coordinator;
    public boolean dismissWithAnimation;
    /* access modifiers changed from: private */
    public BottomSheetBehavior.C4212g edgeToEdgeCallback;
    private boolean edgeToEdgeEnabled;

    /* renamed from: com.google.android.material.bottomsheet.a$a */
    /* compiled from: BottomSheetDialog */
    public class C4215a implements xg4 {
        public C4215a() {
        }

        /* renamed from: a */
        public hl7 mo1158a(View view, hl7 hl7) {
            if (C4214a.this.edgeToEdgeCallback != null) {
                C4214a.this.behavior.mo31861G(C4214a.this.edgeToEdgeCallback);
            }
            if (hl7 != null) {
                C4214a aVar = C4214a.this;
                BottomSheetBehavior.C4212g unused = aVar.edgeToEdgeCallback = new C4220f(aVar.bottomSheet, hl7, (C4215a) null);
                C4214a.this.behavior.mo31888o(C4214a.this.edgeToEdgeCallback);
            }
            return hl7;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$b */
    /* compiled from: BottomSheetDialog */
    public class C4216b implements View.OnClickListener {
        public C4216b() {
        }

        public void onClick(View view) {
            C4214a aVar = C4214a.this;
            if (aVar.cancelable && aVar.isShowing() && C4214a.this.shouldWindowCloseOnTouchOutside()) {
                C4214a.this.cancel();
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$c */
    /* compiled from: BottomSheetDialog */
    public class C4217c extends C3715z7 {
        public C4217c() {
        }

        /* renamed from: g */
        public void mo5479g(View view, C3335t8 t8Var) {
            super.mo5479g(view, t8Var);
            if (C4214a.this.cancelable) {
                t8Var.mo26227a(1048576);
                t8Var.mo26251l0(true);
                return;
            }
            t8Var.mo26251l0(false);
        }

        /* renamed from: j */
        public boolean mo5480j(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                C4214a aVar = C4214a.this;
                if (aVar.cancelable) {
                    aVar.cancel();
                    return true;
                }
            }
            return super.mo5480j(view, i, bundle);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$d */
    /* compiled from: BottomSheetDialog */
    public class C4218d implements View.OnTouchListener {
        public C4218d() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$e */
    /* compiled from: BottomSheetDialog */
    public class C4219e extends BottomSheetBehavior.C4212g {
        public C4219e() {
        }

        /* renamed from: a */
        public void mo31909a(View view, float f) {
        }

        /* renamed from: b */
        public void mo31910b(View view, int i) {
            if (i == 5) {
                C4214a.this.cancel();
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$f */
    /* compiled from: BottomSheetDialog */
    public static class C4220f extends BottomSheetBehavior.C4212g {

        /* renamed from: a */
        public final boolean f23530a;

        /* renamed from: b */
        public final boolean f23531b;

        /* renamed from: c */
        public final hl7 f23532c;

        public /* synthetic */ C4220f(View view, hl7 hl7, C4215a aVar) {
            this(view, hl7);
        }

        /* renamed from: a */
        public void mo31909a(View view, float f) {
            mo31924c(view);
        }

        /* renamed from: b */
        public void mo31910b(View view, int i) {
            mo31924c(view);
        }

        /* renamed from: c */
        public final void mo31924c(View view) {
            if (view.getTop() < this.f23532c.mo21240m()) {
                C4214a.setLightStatusBar(view, this.f23530a);
                view.setPadding(view.getPaddingLeft(), this.f23532c.mo21240m() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            } else if (view.getTop() != 0) {
                C4214a.setLightStatusBar(view, this.f23531b);
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        public C4220f(View view, hl7 hl7) {
            ColorStateList colorStateList;
            this.f23532c = hl7;
            boolean z = (view.getSystemUiVisibility() & 8192) != 0;
            this.f23531b = z;
            uo3 A = BottomSheetBehavior.m34816y(view).mo31855A();
            if (A != null) {
                colorStateList = A.mo48478x();
            } else {
                colorStateList = ga7.m17790s(view);
            }
            if (colorStateList != null) {
                this.f23530a = ro3.m51200f(colorStateList.getDefaultColor());
            } else if (view.getBackground() instanceof ColorDrawable) {
                this.f23530a = ro3.m51200f(((ColorDrawable) view.getBackground()).getColor());
            } else {
                this.f23530a = z;
            }
        }
    }

    public C4214a(Context context) {
        this(context, 0);
        this.edgeToEdgeEnabled = getContext().getTheme().obtainStyledAttributes(new int[]{j15.enableEdgeToEdge}).getBoolean(0, false);
    }

    private FrameLayout ensureContainerAndBehavior() {
        if (this.container == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), c45.design_bottom_sheet_dialog, (ViewGroup) null);
            this.container = frameLayout;
            this.coordinator = (CoordinatorLayout) frameLayout.findViewById(g35.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.container.findViewById(g35.design_bottom_sheet);
            this.bottomSheet = frameLayout2;
            BottomSheetBehavior<FrameLayout> y = BottomSheetBehavior.m34816y(frameLayout2);
            this.behavior = y;
            y.mo31888o(this.bottomSheetCallback);
            this.behavior.mo31870P(this.cancelable);
        }
        return this.container;
    }

    private static int getThemeResId(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(j15.bottomSheetDialogTheme, typedValue, true)) {
            return typedValue.resourceId;
        }
        return e55.Theme_Design_Light_BottomSheetDialog;
    }

    public static void setLightStatusBar(View view, boolean z) {
        int i;
        int systemUiVisibility = view.getSystemUiVisibility();
        if (z) {
            i = systemUiVisibility | 8192;
        } else {
            i = systemUiVisibility & -8193;
        }
        view.setSystemUiVisibility(i);
    }

    private View wrapInBottomSheet(int i, View view, ViewGroup.LayoutParams layoutParams) {
        ensureContainerAndBehavior();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.container.findViewById(g35.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, coordinatorLayout, false);
        }
        if (this.edgeToEdgeEnabled) {
            ga7.m17720D0(this.bottomSheet, new C4215a());
        }
        this.bottomSheet.removeAllViews();
        if (layoutParams == null) {
            this.bottomSheet.addView(view);
        } else {
            this.bottomSheet.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(g35.touch_outside).setOnClickListener(new C4216b());
        ga7.m17785p0(this.bottomSheet, new C4217c());
        this.bottomSheet.setOnTouchListener(new C4218d());
        return this.container;
    }

    public void cancel() {
        BottomSheetBehavior<FrameLayout> behavior2 = getBehavior();
        if (!this.dismissWithAnimation || behavior2.mo31857C() == 5) {
            super.cancel();
        } else {
            behavior2.mo31876V(5);
        }
    }

    public BottomSheetBehavior<FrameLayout> getBehavior() {
        if (this.behavior == null) {
            ensureContainerAndBehavior();
        }
        return this.behavior;
    }

    public boolean getDismissWithAnimation() {
        return this.dismissWithAnimation;
    }

    public boolean getEdgeToEdgeEnabled() {
        return this.edgeToEdgeEnabled;
    }

    public void onAttachedToWindow() {
        boolean z;
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            if (!this.edgeToEdgeEnabled || Color.alpha(window.getNavigationBarColor()) >= 255) {
                z = false;
            } else {
                z = true;
            }
            FrameLayout frameLayout = this.container;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.coordinator;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            if (z) {
                window.getDecorView().setSystemUiVisibility(768);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.behavior;
        if (bottomSheetBehavior != null && bottomSheetBehavior.mo31857C() == 5) {
            this.behavior.mo31876V(4);
        }
    }

    public void removeDefaultCallback() {
        this.behavior.mo31861G(this.bottomSheetCallback);
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.cancelable != z) {
            this.cancelable = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.behavior;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.mo31870P(z);
            }
        }
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.cancelable) {
            this.cancelable = true;
        }
        this.canceledOnTouchOutside = z;
        this.canceledOnTouchOutsideSet = true;
    }

    public void setContentView(int i) {
        super.setContentView(wrapInBottomSheet(i, (View) null, (ViewGroup.LayoutParams) null));
    }

    public void setDismissWithAnimation(boolean z) {
        this.dismissWithAnimation = z;
    }

    public boolean shouldWindowCloseOnTouchOutside() {
        if (!this.canceledOnTouchOutsideSet) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843611});
            this.canceledOnTouchOutside = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.canceledOnTouchOutsideSet = true;
        }
        return this.canceledOnTouchOutside;
    }

    public void setContentView(View view) {
        super.setContentView(wrapInBottomSheet(0, view, (ViewGroup.LayoutParams) null));
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(wrapInBottomSheet(0, view, layoutParams));
    }

    public C4214a(Context context, int i) {
        super(context, getThemeResId(context, i));
        this.cancelable = true;
        this.canceledOnTouchOutside = true;
        this.bottomSheetCallback = new C4219e();
        supportRequestWindowFeature(1);
        this.edgeToEdgeEnabled = getContext().getTheme().obtainStyledAttributes(new int[]{j15.enableEdgeToEdge}).getBoolean(0, false);
    }

    public C4214a(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
        this.cancelable = true;
        this.canceledOnTouchOutside = true;
        this.bottomSheetCallback = new C4219e();
        supportRequestWindowFeature(1);
        this.cancelable = z;
        this.edgeToEdgeEnabled = getContext().getTheme().obtainStyledAttributes(new int[]{j15.enableEdgeToEdge}).getBoolean(0, false);
    }
}
