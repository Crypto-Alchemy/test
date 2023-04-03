package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.C4385a;
import java.util.List;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: u */
    public static final Handler f24266u = new Handler(Looper.getMainLooper(), new C4370j());

    /* renamed from: v */
    public static final boolean f24267v = false;

    /* renamed from: w */
    public static final int[] f24268w = {j15.snackbarStyle};

    /* renamed from: x */
    public static final String f24269x = BaseTransientBottomBar.class.getSimpleName();

    /* renamed from: a */
    public final ViewGroup f24270a;

    /* renamed from: b */
    public final Context f24271b;

    /* renamed from: c */
    public final SnackbarBaseLayout f24272c;

    /* renamed from: d */
    public final wr0 f24273d;

    /* renamed from: e */
    public int f24274e;

    /* renamed from: f */
    public boolean f24275f;

    /* renamed from: g */
    public View f24276g;

    /* renamed from: h */
    public boolean f24277h = false;

    /* renamed from: i */
    public final ViewTreeObserver.OnGlobalLayoutListener f24278i = new C4371k();

    /* renamed from: j */
    public final Runnable f24279j = new C4372l();

    /* renamed from: k */
    public Rect f24280k;

    /* renamed from: l */
    public int f24281l;

    /* renamed from: m */
    public int f24282m;

    /* renamed from: n */
    public int f24283n;

    /* renamed from: o */
    public int f24284o;

    /* renamed from: p */
    public int f24285p;

    /* renamed from: q */
    public List<C4380s<B>> f24286q;

    /* renamed from: r */
    public Behavior f24287r;

    /* renamed from: s */
    public final AccessibilityManager f24288s;

    /* renamed from: t */
    public C4385a.C4387b f24289t = new C4375o();

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: k */
        public final C4381t f24290k = new C4381t(this);

        /* renamed from: a */
        public boolean mo31765a(View view) {
            return this.f24290k.mo33549a(view);
        }

        /* renamed from: l */
        public final void mo33510l(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f24290k.mo33551c(baseTransientBottomBar);
        }

        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f24290k.mo33550b(coordinatorLayout, view, motionEvent);
            return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        }
    }

    public static class SnackbarBaseLayout extends FrameLayout {

        /* renamed from: x */
        public static final View.OnTouchListener f24291x = new C4360a();

        /* renamed from: a */
        public C4383v f24292a;

        /* renamed from: d */
        public C4382u f24293d;

        /* renamed from: e */
        public int f24294e;

        /* renamed from: g */
        public final float f24295g;

        /* renamed from: k */
        public final float f24296k;

        /* renamed from: r */
        public ColorStateList f24297r;

        /* renamed from: s */
        public PorterDuff.Mode f24298s;

        /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout$a */
        public static class C4360a implements View.OnTouchListener {
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public SnackbarBaseLayout(Context context) {
            this(context, (AttributeSet) null);
        }

        /* renamed from: a */
        public final Drawable mo33511a() {
            float dimension = getResources().getDimension(k25.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(ro3.m51203i(this, j15.colorSurface, j15.colorOnSurface, getBackgroundOverlayColorAlpha()));
            if (this.f24297r == null) {
                return ij1.m19659r(gradientDrawable);
            }
            Drawable r = ij1.m19659r(gradientDrawable);
            ij1.m19656o(r, this.f24297r);
            return r;
        }

        public float getActionTextColorAlpha() {
            return this.f24296k;
        }

        public int getAnimationMode() {
            return this.f24294e;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f24295g;
        }

        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            C4382u uVar = this.f24293d;
            if (uVar != null) {
                uVar.onViewAttachedToWindow(this);
            }
            ga7.m17779m0(this);
        }

        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            C4382u uVar = this.f24293d;
            if (uVar != null) {
                uVar.onViewDetachedFromWindow(this);
            }
        }

        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            C4383v vVar = this.f24292a;
            if (vVar != null) {
                vVar.mo33546a(this, i, i2, i3, i4);
            }
        }

        public void setAnimationMode(int i) {
            this.f24294e = i;
        }

        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        public void setBackgroundDrawable(Drawable drawable) {
            if (!(drawable == null || this.f24297r == null)) {
                drawable = ij1.m19659r(drawable.mutate());
                ij1.m19656o(drawable, this.f24297r);
                ij1.m19657p(drawable, this.f24298s);
            }
            super.setBackgroundDrawable(drawable);
        }

        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f24297r = colorStateList;
            if (getBackground() != null) {
                Drawable r = ij1.m19659r(getBackground().mutate());
                ij1.m19656o(r, colorStateList);
                ij1.m19657p(r, this.f24298s);
                if (r != getBackground()) {
                    super.setBackgroundDrawable(r);
                }
            }
        }

        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f24298s = mode;
            if (getBackground() != null) {
                Drawable r = ij1.m19659r(getBackground().mutate());
                ij1.m19657p(r, mode);
                if (r != getBackground()) {
                    super.setBackgroundDrawable(r);
                }
            }
        }

        public void setOnAttachStateChangeListener(C4382u uVar) {
            this.f24293d = uVar;
        }

        public void setOnClickListener(View.OnClickListener onClickListener) {
            View.OnTouchListener onTouchListener;
            if (onClickListener != null) {
                onTouchListener = null;
            } else {
                onTouchListener = f24291x;
            }
            setOnTouchListener(onTouchListener);
            super.setOnClickListener(onClickListener);
        }

        public void setOnLayoutChangeListener(C4383v vVar) {
            this.f24292a = vVar;
        }

        public SnackbarBaseLayout(Context context, AttributeSet attributeSet) {
            super(xo3.m54461c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, u55.SnackbarLayout);
            int i = u55.SnackbarLayout_elevation;
            if (obtainStyledAttributes.hasValue(i)) {
                ga7.m17801x0(this, (float) obtainStyledAttributes.getDimensionPixelSize(i, 0));
            }
            this.f24294e = obtainStyledAttributes.getInt(u55.SnackbarLayout_animationMode, 0);
            this.f24295g = obtainStyledAttributes.getFloat(u55.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
            setBackgroundTintList(to3.m52391b(context2, obtainStyledAttributes, u55.SnackbarLayout_backgroundTint));
            setBackgroundTintMode(pe7.m49903i(obtainStyledAttributes.getInt(u55.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
            this.f24296k = obtainStyledAttributes.getFloat(u55.SnackbarLayout_actionTextColorAlpha, 1.0f);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f24291x);
            setFocusable(true);
            if (getBackground() == null) {
                ga7.m17793t0(this, mo33511a());
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$a */
    public class C4361a implements Runnable {
        public C4361a() {
        }

        public void run() {
            SnackbarBaseLayout snackbarBaseLayout = BaseTransientBottomBar.this.f24272c;
            if (snackbarBaseLayout != null) {
                if (snackbarBaseLayout.getParent() != null) {
                    BaseTransientBottomBar.this.f24272c.setVisibility(0);
                }
                if (BaseTransientBottomBar.this.f24272c.getAnimationMode() == 1) {
                    BaseTransientBottomBar.this.mo33497T();
                } else {
                    BaseTransientBottomBar.this.mo33499V();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$b */
    public class C4362b extends AnimatorListenerAdapter {
        public C4362b() {
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.mo33489L();
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$c */
    public class C4363c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ int f24301a;

        public C4363c(int i) {
            this.f24301a = i;
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.mo33488K(this.f24301a);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$d */
    public class C4364d implements ValueAnimator.AnimatorUpdateListener {
        public C4364d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f24272c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$e */
    public class C4365e implements ValueAnimator.AnimatorUpdateListener {
        public C4365e() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f24272c.setScaleX(floatValue);
            BaseTransientBottomBar.this.f24272c.setScaleY(floatValue);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$f */
    public class C4366f extends AnimatorListenerAdapter {
        public C4366f() {
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.mo33489L();
        }

        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f24273d.mo33558a(70, 180);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$g */
    public class C4367g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public int f24306a;

        /* renamed from: d */
        public final /* synthetic */ int f24307d;

        public C4367g(int i) {
            this.f24307d = i;
            this.f24306a = i;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f24267v) {
                ga7.m17755a0(BaseTransientBottomBar.this.f24272c, intValue - this.f24306a);
            } else {
                BaseTransientBottomBar.this.f24272c.setTranslationY((float) intValue);
            }
            this.f24306a = intValue;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$h */
    public class C4368h extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ int f24309a;

        public C4368h(int i) {
            this.f24309a = i;
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.mo33488K(this.f24309a);
        }

        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f24273d.mo33559b(0, 180);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$i */
    public class C4369i implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public int f24311a = 0;

        public C4369i() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f24267v) {
                ga7.m17755a0(BaseTransientBottomBar.this.f24272c, intValue - this.f24311a);
            } else {
                BaseTransientBottomBar.this.f24272c.setTranslationY((float) intValue);
            }
            this.f24311a = intValue;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$j */
    public static class C4370j implements Handler.Callback {
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                ((BaseTransientBottomBar) message.obj).mo33495R();
                return true;
            } else if (i != 1) {
                return false;
            } else {
                ((BaseTransientBottomBar) message.obj).mo33485H(message.arg1);
                return true;
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$k */
    public class C4371k implements ViewTreeObserver.OnGlobalLayoutListener {
        public C4371k() {
        }

        public void onGlobalLayout() {
            if (BaseTransientBottomBar.this.f24277h) {
                BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
                int unused = baseTransientBottomBar.f24285p = baseTransientBottomBar.mo33504u();
                BaseTransientBottomBar.this.mo33501X();
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$l */
    public class C4372l implements Runnable {
        public C4372l() {
        }

        public void run() {
            int m;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f24272c != null && baseTransientBottomBar.f24271b != null && (m = (BaseTransientBottomBar.this.mo33480C() - BaseTransientBottomBar.this.mo33483F()) + ((int) BaseTransientBottomBar.this.f24272c.getTranslationY())) < BaseTransientBottomBar.this.f24284o) {
                ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f24272c.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    String unused = BaseTransientBottomBar.f24269x;
                    return;
                }
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f24284o - m;
                BaseTransientBottomBar.this.f24272c.requestLayout();
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$m */
    public class C4373m implements xg4 {
        public C4373m() {
        }

        /* renamed from: a */
        public hl7 mo1158a(View view, hl7 hl7) {
            int unused = BaseTransientBottomBar.this.f24281l = hl7.mo21237j();
            int unused2 = BaseTransientBottomBar.this.f24282m = hl7.mo21238k();
            int unused3 = BaseTransientBottomBar.this.f24283n = hl7.mo21239l();
            BaseTransientBottomBar.this.mo33501X();
            return hl7;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$n */
    public class C4374n extends C3715z7 {
        public C4374n() {
        }

        /* renamed from: g */
        public void mo5479g(View view, C3335t8 t8Var) {
            super.mo5479g(view, t8Var);
            t8Var.mo26227a(1048576);
            t8Var.mo26251l0(true);
        }

        /* renamed from: j */
        public boolean mo5480j(View view, int i, Bundle bundle) {
            if (i != 1048576) {
                return super.mo5480j(view, i, bundle);
            }
            BaseTransientBottomBar.this.mo33505v();
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$o */
    public class C4375o implements C4385a.C4387b {
        public C4375o() {
        }

        /* renamed from: a */
        public void mo33541a(int i) {
            Handler handler = BaseTransientBottomBar.f24266u;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }

        /* renamed from: c */
        public void mo33542c() {
            Handler handler = BaseTransientBottomBar.f24266u;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$p */
    public class C4376p implements C4382u {

        /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$p$a */
        public class C4377a implements Runnable {
            public C4377a() {
            }

            public void run() {
                BaseTransientBottomBar.this.mo33488K(3);
            }
        }

        public C4376p() {
        }

        public void onViewAttachedToWindow(View view) {
            WindowInsets rootWindowInsets;
            if (Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = BaseTransientBottomBar.this.f24272c.getRootWindowInsets()) != null) {
                int unused = BaseTransientBottomBar.this.f24284o = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
                BaseTransientBottomBar.this.mo33501X();
            }
        }

        public void onViewDetachedFromWindow(View view) {
            if (BaseTransientBottomBar.this.mo33486I()) {
                BaseTransientBottomBar.f24266u.post(new C4377a());
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$q */
    public class C4378q implements C4383v {
        public C4378q() {
        }

        /* renamed from: a */
        public void mo33546a(View view, int i, int i2, int i3, int i4) {
            BaseTransientBottomBar.this.f24272c.setOnLayoutChangeListener((C4383v) null);
            BaseTransientBottomBar.this.mo33496S();
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$r */
    public class C4379r implements SwipeDismissBehavior.C4188c {
        public C4379r() {
        }

        /* renamed from: a */
        public void mo31773a(View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.mo33506w(0);
        }

        /* renamed from: b */
        public void mo31774b(int i) {
            if (i == 0) {
                C4385a.m35967c().mo33576k(BaseTransientBottomBar.this.f24289t);
            } else if (i == 1 || i == 2) {
                C4385a.m35967c().mo33575j(BaseTransientBottomBar.this.f24289t);
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$s */
    public static abstract class C4380s<B> {
        /* renamed from: a */
        public void mo33547a(B b, int i) {
        }

        /* renamed from: b */
        public void mo33548b(B b) {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$t */
    public static class C4381t {

        /* renamed from: a */
        public C4385a.C4387b f24322a;

        public C4381t(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.mo31769h(0.1f);
            swipeDismissBehavior.mo31767f(0.6f);
            swipeDismissBehavior.mo31770i(0);
        }

        /* renamed from: a */
        public boolean mo33549a(View view) {
            return view instanceof SnackbarBaseLayout;
        }

        /* renamed from: b */
        public void mo33550b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    C4385a.m35967c().mo33576k(this.f24322a);
                }
            } else if (coordinatorLayout.isPointInChildBounds(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                C4385a.m35967c().mo33575j(this.f24322a);
            }
        }

        /* renamed from: c */
        public void mo33551c(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f24322a = baseTransientBottomBar.f24289t;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$u */
    public interface C4382u {
        void onViewAttachedToWindow(View view);

        void onViewDetachedFromWindow(View view);
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$v */
    public interface C4383v {
        /* renamed from: a */
        void mo33546a(View view, int i, int i2, int i3, int i4);
    }

    public BaseTransientBottomBar(Context context, ViewGroup viewGroup, View view, wr0 wr0) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        } else if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (wr0 != null) {
            this.f24270a = viewGroup;
            this.f24273d = wr0;
            this.f24271b = context;
            wo6.m53997a(context);
            SnackbarBaseLayout snackbarBaseLayout = (SnackbarBaseLayout) LayoutInflater.from(context).inflate(mo33481D(), viewGroup, false);
            this.f24272c = snackbarBaseLayout;
            if (view instanceof SnackbarContentLayout) {
                ((SnackbarContentLayout) view).mo33560c(snackbarBaseLayout.getActionTextColorAlpha());
            }
            snackbarBaseLayout.addView(view);
            ViewGroup.LayoutParams layoutParams = snackbarBaseLayout.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.f24280k = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            }
            ga7.m17789r0(snackbarBaseLayout, 1);
            ga7.m17714A0(snackbarBaseLayout, 1);
            ga7.m17803y0(snackbarBaseLayout, true);
            ga7.m17720D0(snackbarBaseLayout, new C4373m());
            ga7.m17785p0(snackbarBaseLayout, new C4374n());
            this.f24288s = (AccessibilityManager) context.getSystemService("accessibility");
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    /* renamed from: A */
    public SwipeDismissBehavior<? extends View> mo33478A() {
        return new Behavior();
    }

    /* renamed from: B */
    public final ValueAnimator mo33479B(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C5807el.f28631d);
        ofFloat.addUpdateListener(new C4365e());
        return ofFloat;
    }

    /* renamed from: C */
    public final int mo33480C() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.f24271b.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    /* renamed from: D */
    public int mo33481D() {
        if (mo33484G()) {
            return c45.mtrl_layout_snackbar;
        }
        return c45.design_layout_snackbar;
    }

    /* renamed from: E */
    public final int mo33482E() {
        int height = this.f24272c.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f24272c.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return height;
    }

    /* renamed from: F */
    public final int mo33483F() {
        int[] iArr = new int[2];
        this.f24272c.getLocationOnScreen(iArr);
        return iArr[1] + this.f24272c.getHeight();
    }

    /* renamed from: G */
    public boolean mo33484G() {
        TypedArray obtainStyledAttributes = this.f24271b.obtainStyledAttributes(f24268w);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        if (resourceId != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public final void mo33485H(int i) {
        if (!mo33492O() || this.f24272c.getVisibility() != 0) {
            mo33488K(i);
        } else {
            mo33503t(i);
        }
    }

    /* renamed from: I */
    public boolean mo33486I() {
        return C4385a.m35967c().mo33570e(this.f24289t);
    }

    /* renamed from: J */
    public final boolean mo33487J() {
        ViewGroup.LayoutParams layoutParams = this.f24272c.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.C0546e) || !(((CoordinatorLayout.C0546e) layoutParams).mo5294f() instanceof SwipeDismissBehavior)) {
            return false;
        }
        return true;
    }

    /* renamed from: K */
    public void mo33488K(int i) {
        C4385a.m35967c().mo33573h(this.f24289t);
        List<C4380s<B>> list = this.f24286q;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f24286q.get(size).mo33547a(this, i);
            }
        }
        ViewParent parent = this.f24272c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f24272c);
        }
    }

    /* renamed from: L */
    public void mo33489L() {
        C4385a.m35967c().mo33574i(this.f24289t);
        List<C4380s<B>> list = this.f24286q;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f24286q.get(size).mo33548b(this);
            }
        }
    }

    /* renamed from: M */
    public B mo33490M(int i) {
        this.f24274e = i;
        return this;
    }

    /* renamed from: N */
    public final void mo33491N(CoordinatorLayout.C0546e eVar) {
        SwipeDismissBehavior swipeDismissBehavior = this.f24287r;
        if (swipeDismissBehavior == null) {
            swipeDismissBehavior = mo33478A();
        }
        if (swipeDismissBehavior instanceof Behavior) {
            ((Behavior) swipeDismissBehavior).mo33510l(this);
        }
        swipeDismissBehavior.mo31768g(new C4379r());
        eVar.mo5303o(swipeDismissBehavior);
        if (this.f24276g == null) {
            eVar.f3355g = 80;
        }
    }

    /* renamed from: O */
    public boolean mo33492O() {
        AccessibilityManager accessibilityManager = this.f24288s;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        if (enabledAccessibilityServiceList == null || !enabledAccessibilityServiceList.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: P */
    public final boolean mo33493P() {
        if (this.f24284o <= 0 || this.f24275f || !mo33487J()) {
            return false;
        }
        return true;
    }

    /* renamed from: Q */
    public void mo33494Q() {
        C4385a.m35967c().mo33578m(mo33509z(), this.f24289t);
    }

    /* renamed from: R */
    public final void mo33495R() {
        this.f24272c.setOnAttachStateChangeListener(new C4376p());
        if (this.f24272c.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f24272c.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0546e) {
                mo33491N((CoordinatorLayout.C0546e) layoutParams);
            }
            this.f24285p = mo33504u();
            mo33501X();
            this.f24272c.setVisibility(4);
            this.f24270a.addView(this.f24272c);
        }
        if (ga7.m17747T(this.f24272c)) {
            mo33496S();
        } else {
            this.f24272c.setOnLayoutChangeListener(new C4378q());
        }
    }

    /* renamed from: S */
    public final void mo33496S() {
        if (mo33492O()) {
            mo33502s();
            return;
        }
        if (this.f24272c.getParent() != null) {
            this.f24272c.setVisibility(0);
        }
        mo33489L();
    }

    /* renamed from: T */
    public final void mo33497T() {
        ValueAnimator x = mo33507x(Utils.FLOAT_EPSILON, 1.0f);
        ValueAnimator B = mo33479B(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{x, B});
        animatorSet.setDuration(150);
        animatorSet.addListener(new C4362b());
        animatorSet.start();
    }

    /* renamed from: U */
    public final void mo33498U(int i) {
        ValueAnimator x = mo33507x(1.0f, Utils.FLOAT_EPSILON);
        x.setDuration(75);
        x.addListener(new C4363c(i));
        x.start();
    }

    /* renamed from: V */
    public final void mo33499V() {
        int E = mo33482E();
        if (f24267v) {
            ga7.m17755a0(this.f24272c, E);
        } else {
            this.f24272c.setTranslationY((float) E);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{E, 0});
        valueAnimator.setInterpolator(C5807el.f28629b);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new C4366f());
        valueAnimator.addUpdateListener(new C4367g(E));
        valueAnimator.start();
    }

    /* renamed from: W */
    public final void mo33500W(int i) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{0, mo33482E()});
        valueAnimator.setInterpolator(C5807el.f28629b);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new C4368h(i));
        valueAnimator.addUpdateListener(new C4369i());
        valueAnimator.start();
    }

    /* renamed from: X */
    public final void mo33501X() {
        Rect rect;
        int i;
        ViewGroup.LayoutParams layoutParams = this.f24272c.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (rect = this.f24280k) != null) {
            if (this.f24276g != null) {
                i = this.f24285p;
            } else {
                i = this.f24281l;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = rect.bottom + i;
            marginLayoutParams.leftMargin = rect.left + this.f24282m;
            marginLayoutParams.rightMargin = rect.right + this.f24283n;
            this.f24272c.requestLayout();
            if (Build.VERSION.SDK_INT >= 29 && mo33493P()) {
                this.f24272c.removeCallbacks(this.f24279j);
                this.f24272c.post(this.f24279j);
            }
        }
    }

    /* renamed from: s */
    public void mo33502s() {
        this.f24272c.post(new C4361a());
    }

    /* renamed from: t */
    public final void mo33503t(int i) {
        if (this.f24272c.getAnimationMode() == 1) {
            mo33498U(i);
        } else {
            mo33500W(i);
        }
    }

    /* renamed from: u */
    public final int mo33504u() {
        View view = this.f24276g;
        if (view == null) {
            return 0;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[1];
        int[] iArr2 = new int[2];
        this.f24270a.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f24270a.getHeight()) - i;
    }

    /* renamed from: v */
    public void mo33505v() {
        mo33506w(3);
    }

    /* renamed from: w */
    public void mo33506w(int i) {
        C4385a.m35967c().mo33568b(this.f24289t, i);
    }

    /* renamed from: x */
    public final ValueAnimator mo33507x(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C5807el.f28628a);
        ofFloat.addUpdateListener(new C4364d());
        return ofFloat;
    }

    /* renamed from: y */
    public Context mo33508y() {
        return this.f24271b;
    }

    /* renamed from: z */
    public int mo33509z() {
        return this.f24274e;
    }
}
