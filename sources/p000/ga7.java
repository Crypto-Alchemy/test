package p000;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.View$OnUnhandledKeyEventListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p000.C3335t8;
import p000.C3715z7;
import p000.hl7;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: ga7 */
/* compiled from: ViewCompat */
public class ga7 {

    /* renamed from: a */
    public static final AtomicInteger f12240a = new AtomicInteger(1);

    /* renamed from: b */
    public static WeakHashMap<View, vd7> f12241b = null;

    /* renamed from: c */
    public static Field f12242c;

    /* renamed from: d */
    public static boolean f12243d = false;

    /* renamed from: e */
    public static final int[] f12244e = {q35.accessibility_custom_action_0, q35.accessibility_custom_action_1, q35.accessibility_custom_action_2, q35.accessibility_custom_action_3, q35.accessibility_custom_action_4, q35.accessibility_custom_action_5, q35.accessibility_custom_action_6, q35.accessibility_custom_action_7, q35.accessibility_custom_action_8, q35.accessibility_custom_action_9, q35.accessibility_custom_action_10, q35.accessibility_custom_action_11, q35.accessibility_custom_action_12, q35.accessibility_custom_action_13, q35.accessibility_custom_action_14, q35.accessibility_custom_action_15, q35.accessibility_custom_action_16, q35.accessibility_custom_action_17, q35.accessibility_custom_action_18, q35.accessibility_custom_action_19, q35.accessibility_custom_action_20, q35.accessibility_custom_action_21, q35.accessibility_custom_action_22, q35.accessibility_custom_action_23, q35.accessibility_custom_action_24, q35.accessibility_custom_action_25, q35.accessibility_custom_action_26, q35.accessibility_custom_action_27, q35.accessibility_custom_action_28, q35.accessibility_custom_action_29, q35.accessibility_custom_action_30, q35.accessibility_custom_action_31};

    /* renamed from: f */
    public static final qh4 f12245f = new fa7();

    /* renamed from: g */
    public static final C2355e f12246g = new C2355e();

    /* renamed from: ga7$a */
    /* compiled from: ViewCompat */
    public class C2351a extends C2356f<Boolean> {
        public C2351a(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* renamed from: i */
        public Boolean mo20455d(View view) {
            return Boolean.valueOf(C2368q.m17941d(view));
        }

        /* renamed from: j */
        public void mo20456e(View view, Boolean bool) {
            C2368q.m17946i(view, bool.booleanValue());
        }

        /* renamed from: k */
        public boolean mo20457h(Boolean bool, Boolean bool2) {
            return !mo20478a(bool, bool2);
        }
    }

    /* renamed from: ga7$b */
    /* compiled from: ViewCompat */
    public class C2352b extends C2356f<CharSequence> {
        public C2352b(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* renamed from: i */
        public CharSequence mo20455d(View view) {
            return C2368q.m17939b(view);
        }

        /* renamed from: j */
        public void mo20456e(View view, CharSequence charSequence) {
            C2368q.m17945h(view, charSequence);
        }

        /* renamed from: k */
        public boolean mo20457h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: ga7$c */
    /* compiled from: ViewCompat */
    public class C2353c extends C2356f<CharSequence> {
        public C2353c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* renamed from: i */
        public CharSequence mo20455d(View view) {
            return C2370s.m17951a(view);
        }

        /* renamed from: j */
        public void mo20456e(View view, CharSequence charSequence) {
            C2370s.m17952b(view, charSequence);
        }

        /* renamed from: k */
        public boolean mo20457h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: ga7$d */
    /* compiled from: ViewCompat */
    public class C2354d extends C2356f<Boolean> {
        public C2354d(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* renamed from: i */
        public Boolean mo20455d(View view) {
            return Boolean.valueOf(C2368q.m17940c(view));
        }

        /* renamed from: j */
        public void mo20456e(View view, Boolean bool) {
            C2368q.m17944g(view, bool.booleanValue());
        }

        /* renamed from: k */
        public boolean mo20457h(Boolean bool, Boolean bool2) {
            return !mo20478a(bool, bool2);
        }
    }

    /* renamed from: ga7$e */
    /* compiled from: ViewCompat */
    public static class C2355e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: a */
        public final WeakHashMap<View, Boolean> f12247a = new WeakHashMap<>();

        /* renamed from: a */
        public void mo20470a(View view) {
            boolean z;
            WeakHashMap<View, Boolean> weakHashMap = this.f12247a;
            if (!view.isShown() || view.getWindowVisibility() != 0) {
                z = false;
            } else {
                z = true;
            }
            weakHashMap.put(view, Boolean.valueOf(z));
            view.addOnAttachStateChangeListener(this);
            if (C2361k.m17878b(view)) {
                mo20472c(view);
            }
        }

        /* renamed from: b */
        public final void mo20471b(View view, boolean z) {
            boolean z2;
            int i;
            if (!view.isShown() || view.getWindowVisibility() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z != z2) {
                if (z2) {
                    i = 16;
                } else {
                    i = 32;
                }
                ga7.m17752Y(view, i);
                this.f12247a.put(view, Boolean.valueOf(z2));
            }
        }

        /* renamed from: c */
        public final void mo20472c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        /* renamed from: d */
        public void mo20473d(View view) {
            this.f12247a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            mo20474e(view);
        }

        /* renamed from: e */
        public final void mo20474e(View view) {
            C2358h.m17858o(view.getViewTreeObserver(), this);
        }

        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry next : this.f12247a.entrySet()) {
                    mo20471b((View) next.getKey(), ((Boolean) next.getValue()).booleanValue());
                }
            }
        }

        public void onViewAttachedToWindow(View view) {
            mo20472c(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: ga7$f */
    /* compiled from: ViewCompat */
    public static abstract class C2356f<T> {

        /* renamed from: a */
        public final int f12248a;

        /* renamed from: b */
        public final Class<T> f12249b;

        /* renamed from: c */
        public final int f12250c;

        /* renamed from: d */
        public final int f12251d;

        public C2356f(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        /* renamed from: a */
        public boolean mo20478a(Boolean bool, Boolean bool2) {
            boolean z;
            boolean z2;
            if (bool == null || !bool.booleanValue()) {
                z = false;
            } else {
                z = true;
            }
            if (bool2 == null || !bool2.booleanValue()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z == z2) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final boolean mo20479b() {
            return true;
        }

        /* renamed from: c */
        public final boolean mo20480c() {
            if (Build.VERSION.SDK_INT >= this.f12250c) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public abstract T mo20455d(View view);

        /* renamed from: e */
        public abstract void mo20456e(View view, T t);

        /* renamed from: f */
        public T mo20481f(View view) {
            if (mo20480c()) {
                return mo20455d(view);
            }
            if (!mo20479b()) {
                return null;
            }
            T tag = view.getTag(this.f12248a);
            if (this.f12249b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        /* renamed from: g */
        public void mo20482g(View view, T t) {
            if (mo20480c()) {
                mo20456e(view, t);
            } else if (mo20479b() && mo20457h(mo20481f(view), t)) {
                ga7.m17772j(view);
                view.setTag(this.f12248a, t);
                ga7.m17752Y(view, this.f12251d);
            }
        }

        /* renamed from: h */
        public abstract boolean mo20457h(T t, T t2);

        public C2356f(int i, Class<T> cls, int i2, int i3) {
            this.f12248a = i;
            this.f12249b = cls;
            this.f12251d = i2;
            this.f12250c = i3;
        }
    }

    /* renamed from: ga7$g */
    /* compiled from: ViewCompat */
    public static class C2357g {
        /* renamed from: a */
        public static boolean m17843a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* renamed from: ga7$h */
    /* compiled from: ViewCompat */
    public static class C2358h {
        /* renamed from: a */
        public static AccessibilityNodeProvider m17844a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        /* renamed from: b */
        public static boolean m17845b(View view) {
            return view.getFitsSystemWindows();
        }

        /* renamed from: c */
        public static int m17846c(View view) {
            return view.getImportantForAccessibility();
        }

        /* renamed from: d */
        public static int m17847d(View view) {
            return view.getMinimumHeight();
        }

        /* renamed from: e */
        public static int m17848e(View view) {
            return view.getMinimumWidth();
        }

        /* renamed from: f */
        public static ViewParent m17849f(View view) {
            return view.getParentForAccessibility();
        }

        /* renamed from: g */
        public static int m17850g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        /* renamed from: h */
        public static boolean m17851h(View view) {
            return view.hasOverlappingRendering();
        }

        /* renamed from: i */
        public static boolean m17852i(View view) {
            return view.hasTransientState();
        }

        /* renamed from: j */
        public static boolean m17853j(View view, int i, Bundle bundle) {
            return view.performAccessibilityAction(i, bundle);
        }

        /* renamed from: k */
        public static void m17854k(View view) {
            view.postInvalidateOnAnimation();
        }

        /* renamed from: l */
        public static void m17855l(View view, int i, int i2, int i3, int i4) {
            view.postInvalidateOnAnimation(i, i2, i3, i4);
        }

        /* renamed from: m */
        public static void m17856m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        /* renamed from: n */
        public static void m17857n(View view, Runnable runnable, long j) {
            view.postOnAnimationDelayed(runnable, j);
        }

        /* renamed from: o */
        public static void m17858o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        /* renamed from: p */
        public static void m17859p(View view) {
            view.requestFitSystemWindows();
        }

        /* renamed from: q */
        public static void m17860q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        /* renamed from: r */
        public static void m17861r(View view, boolean z) {
            view.setHasTransientState(z);
        }

        /* renamed from: s */
        public static void m17862s(View view, int i) {
            view.setImportantForAccessibility(i);
        }
    }

    /* renamed from: ga7$i */
    /* compiled from: ViewCompat */
    public static class C2359i {
        /* renamed from: a */
        public static int m17863a() {
            return View.generateViewId();
        }

        /* renamed from: b */
        public static Display m17864b(View view) {
            return view.getDisplay();
        }

        /* renamed from: c */
        public static int m17865c(View view) {
            return view.getLabelFor();
        }

        /* renamed from: d */
        public static int m17866d(View view) {
            return view.getLayoutDirection();
        }

        /* renamed from: e */
        public static int m17867e(View view) {
            return view.getPaddingEnd();
        }

        /* renamed from: f */
        public static int m17868f(View view) {
            return view.getPaddingStart();
        }

        /* renamed from: g */
        public static boolean m17869g(View view) {
            return view.isPaddingRelative();
        }

        /* renamed from: h */
        public static void m17870h(View view, int i) {
            view.setLabelFor(i);
        }

        /* renamed from: i */
        public static void m17871i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        /* renamed from: j */
        public static void m17872j(View view, int i) {
            view.setLayoutDirection(i);
        }

        /* renamed from: k */
        public static void m17873k(View view, int i, int i2, int i3, int i4) {
            view.setPaddingRelative(i, i2, i3, i4);
        }
    }

    /* renamed from: ga7$j */
    /* compiled from: ViewCompat */
    public static class C2360j {
        /* renamed from: a */
        public static Rect m17874a(View view) {
            return view.getClipBounds();
        }

        /* renamed from: b */
        public static boolean m17875b(View view) {
            return view.isInLayout();
        }

        /* renamed from: c */
        public static void m17876c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* renamed from: ga7$k */
    /* compiled from: ViewCompat */
    public static class C2361k {
        /* renamed from: a */
        public static int m17877a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        /* renamed from: b */
        public static boolean m17878b(View view) {
            return view.isAttachedToWindow();
        }

        /* renamed from: c */
        public static boolean m17879c(View view) {
            return view.isLaidOut();
        }

        /* renamed from: d */
        public static boolean m17880d(View view) {
            return view.isLayoutDirectionResolved();
        }

        /* renamed from: e */
        public static void m17881e(ViewParent viewParent, View view, View view2, int i) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
        }

        /* renamed from: f */
        public static void m17882f(View view, int i) {
            view.setAccessibilityLiveRegion(i);
        }

        /* renamed from: g */
        public static void m17883g(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    /* renamed from: ga7$l */
    /* compiled from: ViewCompat */
    public static class C2362l {
        /* renamed from: a */
        public static WindowInsets m17884a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        /* renamed from: b */
        public static WindowInsets m17885b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        /* renamed from: c */
        public static void m17886c(View view) {
            view.requestApplyInsets();
        }
    }

    /* renamed from: ga7$m */
    /* compiled from: ViewCompat */
    public static class C2363m {

        /* renamed from: ga7$m$a */
        /* compiled from: ViewCompat */
        public class C2364a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            public hl7 f12252a = null;

            /* renamed from: b */
            public final /* synthetic */ View f12253b;

            /* renamed from: c */
            public final /* synthetic */ xg4 f12254c;

            public C2364a(View view, xg4 xg4) {
                this.f12253b = view;
                this.f12254c = xg4;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                hl7 y = hl7.m18976y(windowInsets, view);
                int i = Build.VERSION.SDK_INT;
                if (i < 30) {
                    C2363m.m17887a(windowInsets, this.f12253b);
                    if (y.equals(this.f12252a)) {
                        return this.f12254c.mo1158a(view, y).mo21249w();
                    }
                }
                this.f12252a = y;
                hl7 a = this.f12254c.mo1158a(view, y);
                if (i >= 30) {
                    return a.mo21249w();
                }
                ga7.m17779m0(view);
                return a.mo21249w();
            }
        }

        /* renamed from: a */
        public static void m17887a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(q35.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        /* renamed from: b */
        public static hl7 m17888b(View view, hl7 hl7, Rect rect) {
            WindowInsets w = hl7.mo21249w();
            if (w != null) {
                return hl7.m18976y(view.computeSystemWindowInsets(w, rect), view);
            }
            rect.setEmpty();
            return hl7;
        }

        /* renamed from: c */
        public static boolean m17889c(View view, float f, float f2, boolean z) {
            return view.dispatchNestedFling(f, f2, z);
        }

        /* renamed from: d */
        public static boolean m17890d(View view, float f, float f2) {
            return view.dispatchNestedPreFling(f, f2);
        }

        /* renamed from: e */
        public static boolean m17891e(View view, int i, int i2, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        }

        /* renamed from: f */
        public static boolean m17892f(View view, int i, int i2, int i3, int i4, int[] iArr) {
            return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
        }

        /* renamed from: g */
        public static ColorStateList m17893g(View view) {
            return view.getBackgroundTintList();
        }

        /* renamed from: h */
        public static PorterDuff.Mode m17894h(View view) {
            return view.getBackgroundTintMode();
        }

        /* renamed from: i */
        public static float m17895i(View view) {
            return view.getElevation();
        }

        /* renamed from: j */
        public static hl7 m17896j(View view) {
            return hl7.C2480a.m18999a(view);
        }

        /* renamed from: k */
        public static String m17897k(View view) {
            return view.getTransitionName();
        }

        /* renamed from: l */
        public static float m17898l(View view) {
            return view.getTranslationZ();
        }

        /* renamed from: m */
        public static float m17899m(View view) {
            return view.getZ();
        }

        /* renamed from: n */
        public static boolean m17900n(View view) {
            return view.hasNestedScrollingParent();
        }

        /* renamed from: o */
        public static boolean m17901o(View view) {
            return view.isImportantForAccessibility();
        }

        /* renamed from: p */
        public static boolean m17902p(View view) {
            return view.isNestedScrollingEnabled();
        }

        /* renamed from: q */
        public static void m17903q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        /* renamed from: r */
        public static void m17904r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        /* renamed from: s */
        public static void m17905s(View view, float f) {
            view.setElevation(f);
        }

        /* renamed from: t */
        public static void m17906t(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        /* renamed from: u */
        public static void m17907u(View view, xg4 xg4) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(q35.tag_on_apply_window_listener, xg4);
            }
            if (xg4 == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(q35.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new C2364a(view, xg4));
            }
        }

        /* renamed from: v */
        public static void m17908v(View view, String str) {
            view.setTransitionName(str);
        }

        /* renamed from: w */
        public static void m17909w(View view, float f) {
            view.setTranslationZ(f);
        }

        /* renamed from: x */
        public static void m17910x(View view, float f) {
            view.setZ(f);
        }

        /* renamed from: y */
        public static boolean m17911y(View view, int i) {
            return view.startNestedScroll(i);
        }

        /* renamed from: z */
        public static void m17912z(View view) {
            view.stopNestedScroll();
        }
    }

    /* renamed from: ga7$n */
    /* compiled from: ViewCompat */
    public static class C2365n {
        /* renamed from: a */
        public static hl7 m17913a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            hl7 x = hl7.m18975x(rootWindowInsets);
            x.mo21247u(x);
            x.mo21229d(view.getRootView());
            return x;
        }

        /* renamed from: b */
        public static int m17914b(View view) {
            return view.getScrollIndicators();
        }

        /* renamed from: c */
        public static void m17915c(View view, int i) {
            view.setScrollIndicators(i);
        }

        /* renamed from: d */
        public static void m17916d(View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* renamed from: ga7$o */
    /* compiled from: ViewCompat */
    public static class C2366o {
        /* renamed from: a */
        public static void m17917a(View view) {
            view.cancelDragAndDrop();
        }

        /* renamed from: b */
        public static void m17918b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        /* renamed from: c */
        public static void m17919c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        /* renamed from: d */
        public static void m17920d(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        /* renamed from: e */
        public static boolean m17921e(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i);
        }

        /* renamed from: f */
        public static void m17922f(View view, View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    /* renamed from: ga7$p */
    /* compiled from: ViewCompat */
    public static class C2367p {
        /* renamed from: a */
        public static void m17923a(View view, Collection<View> collection, int i) {
            view.addKeyboardNavigationClusters(collection, i);
        }

        /* renamed from: b */
        public static int m17924b(View view) {
            return view.getImportantForAutofill();
        }

        /* renamed from: c */
        public static int m17925c(View view) {
            return view.getNextClusterForwardId();
        }

        /* renamed from: d */
        public static boolean m17926d(View view) {
            return view.hasExplicitFocusable();
        }

        /* renamed from: e */
        public static boolean m17927e(View view) {
            return view.isFocusedByDefault();
        }

        /* renamed from: f */
        public static boolean m17928f(View view) {
            return view.isImportantForAutofill();
        }

        /* renamed from: g */
        public static boolean m17929g(View view) {
            return view.isKeyboardNavigationCluster();
        }

        /* renamed from: h */
        public static View m17930h(View view, View view2, int i) {
            return view.keyboardNavigationClusterSearch(view2, i);
        }

        /* renamed from: i */
        public static boolean m17931i(View view) {
            return view.restoreDefaultFocus();
        }

        /* renamed from: j */
        public static void m17932j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        /* renamed from: k */
        public static void m17933k(View view, boolean z) {
            view.setFocusedByDefault(z);
        }

        /* renamed from: l */
        public static void m17934l(View view, int i) {
            view.setImportantForAutofill(i);
        }

        /* renamed from: m */
        public static void m17935m(View view, boolean z) {
            view.setKeyboardNavigationCluster(z);
        }

        /* renamed from: n */
        public static void m17936n(View view, int i) {
            view.setNextClusterForwardId(i);
        }

        /* renamed from: o */
        public static void m17937o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* renamed from: ga7$q */
    /* compiled from: ViewCompat */
    public static class C2368q {
        /* renamed from: a */
        public static void m17938a(View view, C2373v vVar) {
            int i = q35.tag_unhandled_key_listeners;
            y16 y16 = (y16) view.getTag(i);
            if (y16 == null) {
                y16 = new y16();
                view.setTag(i, y16);
            }
            Objects.requireNonNull(vVar);
            ib7 ib7 = new ib7(vVar);
            y16.put(vVar, ib7);
            view.addOnUnhandledKeyEventListener(ib7);
        }

        /* renamed from: b */
        public static CharSequence m17939b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        /* renamed from: c */
        public static boolean m17940c(View view) {
            return view.isAccessibilityHeading();
        }

        /* renamed from: d */
        public static boolean m17941d(View view) {
            return view.isScreenReaderFocusable();
        }

        /* renamed from: e */
        public static void m17942e(View view, C2373v vVar) {
            View$OnUnhandledKeyEventListener view$OnUnhandledKeyEventListener;
            y16 y16 = (y16) view.getTag(q35.tag_unhandled_key_listeners);
            if (y16 != null && (view$OnUnhandledKeyEventListener = (View$OnUnhandledKeyEventListener) y16.get(vVar)) != null) {
                view.removeOnUnhandledKeyEventListener(view$OnUnhandledKeyEventListener);
            }
        }

        /* renamed from: f */
        public static <T> T m17943f(View view, int i) {
            return view.requireViewById(i);
        }

        /* renamed from: g */
        public static void m17944g(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        /* renamed from: h */
        public static void m17945h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* renamed from: i */
        public static void m17946i(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    /* renamed from: ga7$r */
    /* compiled from: ViewCompat */
    public static class C2369r {
        /* renamed from: a */
        public static View.AccessibilityDelegate m17947a(View view) {
            return view.getAccessibilityDelegate();
        }

        /* renamed from: b */
        public static List<Rect> m17948b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        /* renamed from: c */
        public static void m17949c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }

        /* renamed from: d */
        public static void m17950d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* renamed from: ga7$s */
    /* compiled from: ViewCompat */
    public static class C2370s {
        /* renamed from: a */
        public static CharSequence m17951a(View view) {
            return view.getStateDescription();
        }

        /* renamed from: b */
        public static void m17952b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* renamed from: ga7$t */
    /* compiled from: ViewCompat */
    public static final class C2371t {
        /* renamed from: a */
        public static String[] m17953a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        /* renamed from: b */
        public static rr0 m17954b(View view, rr0 rr0) {
            ContentInfo f = rr0.mo25504f();
            ContentInfo a = view.performReceiveContent(f);
            if (a == null) {
                return null;
            }
            if (a == f) {
                return rr0;
            }
            return rr0.m26389g(a);
        }

        /* renamed from: c */
        public static void m17955c(View view, String[] strArr, ph4 ph4) {
            if (ph4 == null) {
                view.setOnReceiveContentListener(strArr, (OnReceiveContentListener) null);
            } else {
                view.setOnReceiveContentListener(strArr, new C2372u(ph4));
            }
        }
    }

    /* renamed from: ga7$u */
    /* compiled from: ViewCompat */
    public static final class C2372u implements OnReceiveContentListener {

        /* renamed from: a */
        public final ph4 f12255a;

        public C2372u(ph4 ph4) {
            this.f12255a = ph4;
        }

        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            rr0 g = rr0.m26389g(contentInfo);
            rr0 a = this.f12255a.mo24602a(view, g);
            if (a == null) {
                return null;
            }
            if (a == g) {
                return contentInfo;
            }
            return a.mo25504f();
        }
    }

    /* renamed from: ga7$v */
    /* compiled from: ViewCompat */
    public interface C2373v {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    /* renamed from: ga7$w */
    /* compiled from: ViewCompat */
    public static class C2374w {

        /* renamed from: d */
        public static final ArrayList<WeakReference<View>> f12256d = new ArrayList<>();

        /* renamed from: a */
        public WeakHashMap<View, Boolean> f12257a = null;

        /* renamed from: b */
        public SparseArray<WeakReference<View>> f12258b = null;

        /* renamed from: c */
        public WeakReference<KeyEvent> f12259c = null;

        /* renamed from: a */
        public static C2374w m17956a(View view) {
            int i = q35.tag_unhandled_key_event_manager;
            C2374w wVar = (C2374w) view.getTag(i);
            if (wVar != null) {
                return wVar;
            }
            C2374w wVar2 = new C2374w();
            view.setTag(i, wVar2);
            return wVar2;
        }

        /* renamed from: b */
        public boolean mo20486b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                mo20491g();
            }
            View c = mo20487c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c != null && !KeyEvent.isModifierKey(keyCode)) {
                    mo20488d().put(keyCode, new WeakReference(c));
                }
            }
            if (c != null) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public final View mo20487c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f12257a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c = mo20487c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c != null) {
                            return c;
                        }
                    }
                }
                if (mo20489e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: d */
        public final SparseArray<WeakReference<View>> mo20488d() {
            if (this.f12258b == null) {
                this.f12258b = new SparseArray<>();
            }
            return this.f12258b;
        }

        /* renamed from: e */
        public final boolean mo20489e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(q35.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((C2373v) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: f */
        public boolean mo20490f(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f12259c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f12259c = new WeakReference<>(keyEvent);
            WeakReference weakReference2 = null;
            SparseArray<WeakReference<View>> d = mo20488d();
            if (keyEvent.getAction() == 1 && (indexOfKey = d.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = d.valueAt(indexOfKey);
                d.removeAt(indexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = d.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = (View) weakReference2.get();
            if (view != null && ga7.m17746S(view)) {
                mo20489e(view, keyEvent);
            }
            return true;
        }

        /* renamed from: g */
        public final void mo20491g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f12257a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f12256d;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    if (this.f12257a == null) {
                        this.f12257a = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = f12256d;
                        View view = (View) arrayList2.get(size).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f12257a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f12257a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: A */
    public static int m17713A(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C2367p.m17924b(view);
        }
        return 0;
    }

    /* renamed from: A0 */
    public static void m17714A0(View view, int i) {
        C2358h.m17862s(view, i);
    }

    /* renamed from: B */
    public static int m17715B(View view) {
        return C2359i.m17866d(view);
    }

    /* renamed from: B0 */
    public static void m17716B0(View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            C2367p.m17934l(view, i);
        }
    }

    /* renamed from: C */
    public static int m17717C(View view) {
        return C2358h.m17847d(view);
    }

    /* renamed from: C0 */
    public static void m17718C0(View view, Paint paint) {
        C2359i.m17871i(view, paint);
    }

    /* renamed from: D */
    public static int m17719D(View view) {
        return C2358h.m17848e(view);
    }

    /* renamed from: D0 */
    public static void m17720D0(View view, xg4 xg4) {
        C2363m.m17907u(view, xg4);
    }

    /* renamed from: E */
    public static String[] m17721E(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C2371t.m17953a(view);
        }
        return (String[]) view.getTag(q35.tag_on_receive_content_mime_types);
    }

    /* renamed from: E0 */
    public static void m17722E0(View view, int i, int i2, int i3, int i4) {
        C2359i.m17873k(view, i, i2, i3, i4);
    }

    /* renamed from: F */
    public static int m17723F(View view) {
        return C2359i.m17867e(view);
    }

    /* renamed from: F0 */
    public static void m17724F0(View view, kr4 kr4) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 24) {
            if (kr4 != null) {
                obj = kr4.mo22516a();
            } else {
                obj = null;
            }
            C2366o.m17920d(view, (PointerIcon) obj);
        }
    }

    /* renamed from: G */
    public static int m17725G(View view) {
        return C2359i.m17868f(view);
    }

    /* renamed from: G0 */
    public static void m17726G0(View view, boolean z) {
        m17783o0().mo20482g(view, Boolean.valueOf(z));
    }

    /* renamed from: H */
    public static ViewParent m17727H(View view) {
        return C2358h.m17849f(view);
    }

    /* renamed from: H0 */
    public static void m17728H0(View view, int i, int i2) {
        C2365n.m17916d(view, i, i2);
    }

    /* renamed from: I */
    public static hl7 m17729I(View view) {
        return C2365n.m17913a(view);
    }

    /* renamed from: I0 */
    public static void m17730I0(View view, CharSequence charSequence) {
        m17740N0().mo20482g(view, charSequence);
    }

    /* renamed from: J */
    public static CharSequence m17731J(View view) {
        return m17740N0().mo20481f(view);
    }

    /* renamed from: J0 */
    public static void m17732J0(View view, String str) {
        C2363m.m17908v(view, str);
    }

    /* renamed from: K */
    public static String m17733K(View view) {
        return C2363m.m17897k(view);
    }

    /* renamed from: K0 */
    public static void m17734K0(View view, float f) {
        C2363m.m17909w(view, f);
    }

    /* renamed from: L */
    public static float m17735L(View view) {
        return C2363m.m17898l(view);
    }

    /* renamed from: L0 */
    public static void m17736L0(View view) {
        if (m17804z(view) == 0) {
            m17714A0(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (m17804z((View) parent) == 4) {
                m17714A0(view, 2);
                return;
            }
        }
    }

    @Deprecated
    /* renamed from: M */
    public static int m17737M(View view) {
        return C2358h.m17850g(view);
    }

    /* renamed from: M0 */
    public static void m17738M0(View view, float f) {
        C2363m.m17910x(view, f);
    }

    /* renamed from: N */
    public static float m17739N(View view) {
        return C2363m.m17899m(view);
    }

    /* renamed from: N0 */
    public static C2356f<CharSequence> m17740N0() {
        return new C2353c(q35.tag_state_description, CharSequence.class, 64, 30);
    }

    /* renamed from: O */
    public static boolean m17741O(View view) {
        return C2357g.m17843a(view);
    }

    /* renamed from: O0 */
    public static void m17742O0(View view) {
        C2363m.m17912z(view);
    }

    /* renamed from: P */
    public static boolean m17743P(View view) {
        return C2358h.m17851h(view);
    }

    /* renamed from: Q */
    public static boolean m17744Q(View view) {
        return C2358h.m17852i(view);
    }

    /* renamed from: R */
    public static boolean m17745R(View view) {
        Boolean f = m17756b().mo20481f(view);
        if (f == null || !f.booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: S */
    public static boolean m17746S(View view) {
        return C2361k.m17878b(view);
    }

    /* renamed from: T */
    public static boolean m17747T(View view) {
        return C2361k.m17879c(view);
    }

    /* renamed from: U */
    public static boolean m17748U(View view) {
        return C2363m.m17902p(view);
    }

    /* renamed from: V */
    public static boolean m17749V(View view) {
        return C2359i.m17869g(view);
    }

    /* renamed from: W */
    public static boolean m17750W(View view) {
        Boolean f = m17783o0().mo20481f(view);
        if (f == null || !f.booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: X */
    public static /* synthetic */ rr0 m17751X(rr0 rr0) {
        return rr0;
    }

    /* renamed from: Y */
    public static void m17752Y(View view, int i) {
        boolean z;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            if (m17784p(view) == null || !view.isShown() || view.getWindowVisibility() != 0) {
                z = false;
            } else {
                z = true;
            }
            int i2 = 32;
            if (m17782o(view) != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z) {
                    i2 = 2048;
                }
                obtain.setEventType(i2);
                C2361k.m17883g(obtain, i);
                if (z) {
                    obtain.getText().add(m17784p(view));
                    m17736L0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                C2361k.m17883g(obtain2, i);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(m17784p(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    C2361k.m17881e(view.getParent(), view, view, i);
                } catch (AbstractMethodError unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(view.getParent().getClass().getSimpleName());
                    sb.append(" does not fully implement ViewParent");
                }
            }
        }
    }

    /* renamed from: Z */
    public static void m17753Z(View view, int i) {
        view.offsetLeftAndRight(i);
    }

    /* renamed from: a0 */
    public static void m17755a0(View view, int i) {
        view.offsetTopAndBottom(i);
    }

    /* renamed from: b */
    public static C2356f<Boolean> m17756b() {
        return new C2354d(q35.tag_accessibility_heading, Boolean.class, 28);
    }

    /* renamed from: b0 */
    public static hl7 m17757b0(View view, hl7 hl7) {
        WindowInsets w = hl7.mo21249w();
        if (w != null) {
            WindowInsets b = C2362l.m17885b(view, w);
            if (!b.equals(w)) {
                return hl7.m18976y(b, view);
            }
        }
        return hl7;
    }

    /* renamed from: c */
    public static int m17758c(View view, CharSequence charSequence, C3658y8 y8Var) {
        int r = m17788r(view, charSequence);
        if (r != -1) {
            m17760d(view, new C3335t8.C3336a(r, charSequence, y8Var));
        }
        return r;
    }

    /* renamed from: c0 */
    public static void m17759c0(View view, C3335t8 t8Var) {
        view.onInitializeAccessibilityNodeInfo(t8Var.mo26220R0());
    }

    /* renamed from: d */
    public static void m17760d(View view, C3335t8.C3336a aVar) {
        m17772j(view);
        m17775k0(aVar.mo26281b(), view);
        m17786q(view).add(aVar);
        m17752Y(view, 0);
    }

    /* renamed from: d0 */
    public static C2356f<CharSequence> m17761d0() {
        return new C2352b(q35.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    /* renamed from: e */
    public static vd7 m17762e(View view) {
        if (f12241b == null) {
            f12241b = new WeakHashMap<>();
        }
        vd7 vd7 = f12241b.get(view);
        if (vd7 != null) {
            return vd7;
        }
        vd7 vd72 = new vd7(view);
        f12241b.put(view, vd72);
        return vd72;
    }

    /* renamed from: e0 */
    public static boolean m17763e0(View view, int i, Bundle bundle) {
        return C2358h.m17853j(view, i, bundle);
    }

    /* renamed from: f */
    public static hl7 m17764f(View view, hl7 hl7, Rect rect) {
        return C2363m.m17888b(view, hl7, rect);
    }

    /* renamed from: f0 */
    public static rr0 m17765f0(View view, rr0 rr0) {
        if (Log.isLoggable("ViewCompat", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("performReceiveContent: ");
            sb.append(rr0);
            sb.append(", view=");
            sb.append(view.getClass().getSimpleName());
            sb.append("[");
            sb.append(view.getId());
            sb.append("]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return C2371t.m17954b(view, rr0);
        }
        ph4 ph4 = (ph4) view.getTag(q35.tag_on_receive_content_listener);
        if (ph4 == null) {
            return m17800x(view).mo1885a(rr0);
        }
        rr0 a = ph4.mo24602a(view, rr0);
        if (a == null) {
            return null;
        }
        return m17800x(view).mo1885a(a);
    }

    /* renamed from: g */
    public static hl7 m17766g(View view, hl7 hl7) {
        WindowInsets w = hl7.mo21249w();
        if (w != null) {
            WindowInsets a = C2362l.m17884a(view, w);
            if (!a.equals(w)) {
                return hl7.m18976y(a, view);
            }
        }
        return hl7;
    }

    /* renamed from: g0 */
    public static void m17767g0(View view) {
        C2358h.m17854k(view);
    }

    /* renamed from: h */
    public static boolean m17768h(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C2374w.m17956a(view).mo20486b(view, keyEvent);
    }

    /* renamed from: h0 */
    public static void m17769h0(View view, Runnable runnable) {
        C2358h.m17856m(view, runnable);
    }

    /* renamed from: i */
    public static boolean m17770i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C2374w.m17956a(view).mo20490f(keyEvent);
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: i0 */
    public static void m17771i0(View view, Runnable runnable, long j) {
        C2358h.m17857n(view, runnable, j);
    }

    /* renamed from: j */
    public static void m17772j(View view) {
        C3715z7 l = m17776l(view);
        if (l == null) {
            l = new C3715z7();
        }
        m17785p0(view, l);
    }

    /* renamed from: j0 */
    public static void m17773j0(View view, int i) {
        m17775k0(i, view);
        m17752Y(view, 0);
    }

    /* renamed from: k */
    public static int m17774k() {
        return C2359i.m17863a();
    }

    /* renamed from: k0 */
    public static void m17775k0(int i, View view) {
        List<C3335t8.C3336a> q = m17786q(view);
        for (int i2 = 0; i2 < q.size(); i2++) {
            if (q.get(i2).mo26281b() == i) {
                q.remove(i2);
                return;
            }
        }
    }

    /* renamed from: l */
    public static C3715z7 m17776l(View view) {
        View.AccessibilityDelegate m = m17778m(view);
        if (m == null) {
            return null;
        }
        if (m instanceof C3715z7.C3716a) {
            return ((C3715z7.C3716a) m).f20478a;
        }
        return new C3715z7(m);
    }

    /* renamed from: l0 */
    public static void m17777l0(View view, C3335t8.C3336a aVar, CharSequence charSequence, C3658y8 y8Var) {
        if (y8Var == null && charSequence == null) {
            m17773j0(view, aVar.mo26281b());
        } else {
            m17760d(view, aVar.mo26280a(charSequence, y8Var));
        }
    }

    /* renamed from: m */
    public static View.AccessibilityDelegate m17778m(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C2369r.m17947a(view);
        }
        return m17780n(view);
    }

    /* renamed from: m0 */
    public static void m17779m0(View view) {
        C2362l.m17886c(view);
    }

    /* renamed from: n */
    public static View.AccessibilityDelegate m17780n(View view) {
        if (f12243d) {
            return null;
        }
        if (f12242c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f12242c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f12243d = true;
                return null;
            }
        }
        try {
            Object obj = f12242c.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f12243d = true;
            return null;
        }
    }

    /* renamed from: n0 */
    public static void m17781n0(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            C2369r.m17949c(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* renamed from: o */
    public static int m17782o(View view) {
        return C2361k.m17877a(view);
    }

    /* renamed from: o0 */
    public static C2356f<Boolean> m17783o0() {
        return new C2351a(q35.tag_screen_reader_focusable, Boolean.class, 28);
    }

    /* renamed from: p */
    public static CharSequence m17784p(View view) {
        return m17761d0().mo20481f(view);
    }

    /* renamed from: p0 */
    public static void m17785p0(View view, C3715z7 z7Var) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (z7Var == null && (m17778m(view) instanceof C3715z7.C3716a)) {
            z7Var = new C3715z7();
        }
        if (z7Var == null) {
            accessibilityDelegate = null;
        } else {
            accessibilityDelegate = z7Var.mo28331d();
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    /* renamed from: q */
    public static List<C3335t8.C3336a> m17786q(View view) {
        int i = q35.tag_accessibility_actions;
        ArrayList arrayList = (ArrayList) view.getTag(i);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i, arrayList2);
        return arrayList2;
    }

    /* renamed from: q0 */
    public static void m17787q0(View view, boolean z) {
        m17756b().mo20482g(view, Boolean.valueOf(z));
    }

    /* renamed from: r */
    public static int m17788r(View view, CharSequence charSequence) {
        boolean z;
        List<C3335t8.C3336a> q = m17786q(view);
        for (int i = 0; i < q.size(); i++) {
            if (TextUtils.equals(charSequence, q.get(i).mo26282c())) {
                return q.get(i).mo26281b();
            }
        }
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int[] iArr = f12244e;
            if (i3 >= iArr.length || i2 != -1) {
                return i2;
            }
            int i4 = iArr[i3];
            boolean z2 = true;
            for (int i5 = 0; i5 < q.size(); i5++) {
                if (q.get(i5).mo26281b() != i4) {
                    z = true;
                } else {
                    z = false;
                }
                z2 &= z;
            }
            if (z2) {
                i2 = i4;
            }
            i3++;
        }
        return i2;
    }

    /* renamed from: r0 */
    public static void m17789r0(View view, int i) {
        C2361k.m17882f(view, i);
    }

    /* renamed from: s */
    public static ColorStateList m17790s(View view) {
        return C2363m.m17893g(view);
    }

    /* renamed from: s0 */
    public static void m17791s0(View view, CharSequence charSequence) {
        m17761d0().mo20482g(view, charSequence);
        if (charSequence != null) {
            f12246g.mo20470a(view);
        } else {
            f12246g.mo20473d(view);
        }
    }

    /* renamed from: t */
    public static PorterDuff.Mode m17792t(View view) {
        return C2363m.m17894h(view);
    }

    /* renamed from: t0 */
    public static void m17793t0(View view, Drawable drawable) {
        C2358h.m17860q(view, drawable);
    }

    /* renamed from: u */
    public static Rect m17794u(View view) {
        return C2360j.m17874a(view);
    }

    /* renamed from: u0 */
    public static void m17795u0(View view, ColorStateList colorStateList) {
        C2363m.m17903q(view, colorStateList);
    }

    /* renamed from: v */
    public static Display m17796v(View view) {
        return C2359i.m17864b(view);
    }

    /* renamed from: v0 */
    public static void m17797v0(View view, PorterDuff.Mode mode) {
        C2363m.m17904r(view, mode);
    }

    /* renamed from: w */
    public static float m17798w(View view) {
        return C2363m.m17895i(view);
    }

    /* renamed from: w0 */
    public static void m17799w0(View view, Rect rect) {
        C2360j.m17876c(view, rect);
    }

    /* renamed from: x */
    public static qh4 m17800x(View view) {
        if (view instanceof qh4) {
            return (qh4) view;
        }
        return f12245f;
    }

    /* renamed from: x0 */
    public static void m17801x0(View view, float f) {
        C2363m.m17905s(view, f);
    }

    /* renamed from: y */
    public static boolean m17802y(View view) {
        return C2358h.m17845b(view);
    }

    @Deprecated
    /* renamed from: y0 */
    public static void m17803y0(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    /* renamed from: z */
    public static int m17804z(View view) {
        return C2358h.m17846c(view);
    }

    /* renamed from: z0 */
    public static void m17805z0(View view, boolean z) {
        C2358h.m17861r(view, z);
    }
}
