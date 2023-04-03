package p000;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;
import p000.v62;

/* renamed from: ox1 */
/* compiled from: ExploreByTouchHelper */
public abstract class ox1 extends C3715z7 {

    /* renamed from: n */
    public static final Rect f16199n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o */
    public static final v62.C3463a<C3335t8> f16200o = new C3006a();

    /* renamed from: p */
    public static final v62.C3464b<j66<C3335t8>, C3335t8> f16201p = new C3007b();

    /* renamed from: d */
    public final Rect f16202d = new Rect();

    /* renamed from: e */
    public final Rect f16203e = new Rect();

    /* renamed from: f */
    public final Rect f16204f = new Rect();

    /* renamed from: g */
    public final int[] f16205g = new int[2];

    /* renamed from: h */
    public final AccessibilityManager f16206h;

    /* renamed from: i */
    public final View f16207i;

    /* renamed from: j */
    public C3008c f16208j;

    /* renamed from: k */
    public int f16209k = Integer.MIN_VALUE;

    /* renamed from: l */
    public int f16210l = Integer.MIN_VALUE;

    /* renamed from: m */
    public int f16211m = Integer.MIN_VALUE;

    /* renamed from: ox1$a */
    /* compiled from: ExploreByTouchHelper */
    public class C3006a implements v62.C3463a<C3335t8> {
        /* renamed from: b */
        public void mo24257a(C3335t8 t8Var, Rect rect) {
            t8Var.mo26252m(rect);
        }
    }

    /* renamed from: ox1$b */
    /* compiled from: ExploreByTouchHelper */
    public class C3007b implements v62.C3464b<j66<C3335t8>, C3335t8> {
        /* renamed from: c */
        public C3335t8 mo24259a(j66<C3335t8> j66, int i) {
            return j66.mo21767w(i);
        }

        /* renamed from: d */
        public int mo24260b(j66<C3335t8> j66) {
            return j66.mo21766v();
        }
    }

    /* renamed from: ox1$c */
    /* compiled from: ExploreByTouchHelper */
    public class C3008c extends C3523w8 {
        public C3008c() {
        }

        /* renamed from: b */
        public C3335t8 mo24263b(int i) {
            return C3335t8.m27494S(ox1.this.mo24229J(i));
        }

        /* renamed from: d */
        public C3335t8 mo24264d(int i) {
            int i2;
            if (i == 2) {
                i2 = ox1.this.f16209k;
            } else {
                i2 = ox1.this.f16210l;
            }
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return mo24263b(i2);
        }

        /* renamed from: f */
        public boolean mo24265f(int i, int i2, Bundle bundle) {
            return ox1.this.mo24237R(i, i2, bundle);
        }
    }

    public ox1(View view) {
        if (view != null) {
            this.f16207i = view;
            this.f16206h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (ga7.m17804z(view) == 0) {
                ga7.m17714A0(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    /* renamed from: D */
    public static Rect m24335D(View view, int i, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
        } else if (i == 33) {
            rect.set(0, height, width, height);
        } else if (i == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    /* renamed from: H */
    public static int m24336H(int i) {
        if (i == 19) {
            return 33;
        }
        if (i != 21) {
            return i != 22 ? 130 : 66;
        }
        return 17;
    }

    /* renamed from: A */
    public final int mo24222A() {
        return this.f16210l;
    }

    /* renamed from: B */
    public abstract int mo24223B(float f, float f2);

    /* renamed from: C */
    public abstract void mo24224C(List<Integer> list);

    /* renamed from: E */
    public final void mo24225E(int i) {
        mo24226F(i, 0);
    }

    /* renamed from: F */
    public final void mo24226F(int i, int i2) {
        ViewParent parent;
        if (i != Integer.MIN_VALUE && this.f16206h.isEnabled() && (parent = this.f16207i.getParent()) != null) {
            AccessibilityEvent q = mo24247q(i, 2048);
            C0012a8.m107b(q, i2);
            parent.requestSendAccessibilityEvent(this.f16207i, q);
        }
    }

    /* renamed from: G */
    public final boolean mo24227G(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f16207i.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent parent = this.f16207i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= Utils.FLOAT_EPSILON || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        if (parent != null) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    public final boolean mo24228I(int i, Rect rect) {
        C3335t8 t8Var;
        C3335t8 t8Var2;
        boolean z;
        j66<C3335t8> y = mo24255y();
        int i2 = this.f16210l;
        int i3 = Integer.MIN_VALUE;
        if (i2 == Integer.MIN_VALUE) {
            t8Var = null;
        } else {
            t8Var = y.mo21756i(i2);
        }
        C3335t8 t8Var3 = t8Var;
        if (i == 1 || i == 2) {
            if (ga7.m17715B(this.f16207i) == 1) {
                z = true;
            } else {
                z = false;
            }
            t8Var2 = (C3335t8) v62.m28652d(y, f16201p, f16200o, t8Var3, i, z, false);
        } else if (i == 17 || i == 33 || i == 66 || i == 130) {
            Rect rect2 = new Rect();
            int i4 = this.f16210l;
            if (i4 != Integer.MIN_VALUE) {
                mo24256z(i4, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                m24335D(this.f16207i, i, rect2);
            }
            t8Var2 = (C3335t8) v62.m28651c(y, f16201p, f16200o, t8Var3, rect2, i);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        if (t8Var2 != null) {
            i3 = y.mo21761p(y.mo21759m(t8Var2));
        }
        return mo24241V(i3);
    }

    /* renamed from: J */
    public C3335t8 mo24229J(int i) {
        if (i == -1) {
            return mo24251u();
        }
        return mo24250t(i);
    }

    /* renamed from: K */
    public final void mo24230K(boolean z, int i, Rect rect) {
        int i2 = this.f16210l;
        if (i2 != Integer.MIN_VALUE) {
            mo24245o(i2);
        }
        if (z) {
            mo24228I(i, rect);
        }
    }

    /* renamed from: L */
    public abstract boolean mo24231L(int i, int i2, Bundle bundle);

    /* renamed from: M */
    public void mo24232M(AccessibilityEvent accessibilityEvent) {
    }

    /* renamed from: N */
    public void mo24233N(int i, AccessibilityEvent accessibilityEvent) {
    }

    /* renamed from: O */
    public void mo24234O(C3335t8 t8Var) {
    }

    /* renamed from: P */
    public abstract void mo24235P(int i, C3335t8 t8Var);

    /* renamed from: Q */
    public void mo24236Q(int i, boolean z) {
    }

    /* renamed from: R */
    public boolean mo24237R(int i, int i2, Bundle bundle) {
        if (i != -1) {
            return mo24238S(i, i2, bundle);
        }
        return mo24239T(i2, bundle);
    }

    /* renamed from: S */
    public final boolean mo24238S(int i, int i2, Bundle bundle) {
        if (i2 == 1) {
            return mo24241V(i);
        }
        if (i2 == 2) {
            return mo24245o(i);
        }
        if (i2 == 64) {
            return mo24240U(i);
        }
        if (i2 != 128) {
            return mo24231L(i, i2, bundle);
        }
        return mo24244n(i);
    }

    /* renamed from: T */
    public final boolean mo24239T(int i, Bundle bundle) {
        return ga7.m17763e0(this.f16207i, i, bundle);
    }

    /* renamed from: U */
    public final boolean mo24240U(int i) {
        int i2;
        if (!this.f16206h.isEnabled() || !this.f16206h.isTouchExplorationEnabled() || (i2 = this.f16209k) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            mo24244n(i2);
        }
        this.f16209k = i;
        this.f16207i.invalidate();
        mo24242W(i, 32768);
        return true;
    }

    /* renamed from: V */
    public final boolean mo24241V(int i) {
        int i2;
        if ((!this.f16207i.isFocused() && !this.f16207i.requestFocus()) || (i2 = this.f16210l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            mo24245o(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f16210l = i;
        mo24236Q(i, true);
        mo24242W(i, 8);
        return true;
    }

    /* renamed from: W */
    public final boolean mo24242W(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f16206h.isEnabled() || (parent = this.f16207i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f16207i, mo24247q(i, i2));
    }

    /* renamed from: X */
    public final void mo24243X(int i) {
        int i2 = this.f16211m;
        if (i2 != i) {
            this.f16211m = i;
            mo24242W(i, 128);
            mo24242W(i2, 256);
        }
    }

    /* renamed from: b */
    public C3523w8 mo3837b(View view) {
        if (this.f16208j == null) {
            this.f16208j = new C3008c();
        }
        return this.f16208j;
    }

    /* renamed from: f */
    public void mo5478f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo5478f(view, accessibilityEvent);
        mo24232M(accessibilityEvent);
    }

    /* renamed from: g */
    public void mo5479g(View view, C3335t8 t8Var) {
        super.mo5479g(view, t8Var);
        mo24234O(t8Var);
    }

    /* renamed from: n */
    public final boolean mo24244n(int i) {
        if (this.f16209k != i) {
            return false;
        }
        this.f16209k = Integer.MIN_VALUE;
        this.f16207i.invalidate();
        mo24242W(i, 65536);
        return true;
    }

    /* renamed from: o */
    public final boolean mo24245o(int i) {
        if (this.f16210l != i) {
            return false;
        }
        this.f16210l = Integer.MIN_VALUE;
        mo24236Q(i, false);
        mo24242W(i, 8);
        return true;
    }

    /* renamed from: p */
    public final boolean mo24246p() {
        int i = this.f16210l;
        if (i == Integer.MIN_VALUE || !mo24231L(i, 16, (Bundle) null)) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public final AccessibilityEvent mo24247q(int i, int i2) {
        if (i != -1) {
            return mo24248r(i, i2);
        }
        return mo24249s(i2);
    }

    /* renamed from: r */
    public final AccessibilityEvent mo24248r(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        C3335t8 J = mo24229J(i);
        obtain.getText().add(J.mo26278z());
        obtain.setContentDescription(J.mo26261r());
        obtain.setScrollable(J.mo26212N());
        obtain.setPassword(J.mo26210M());
        obtain.setEnabled(J.mo26202I());
        obtain.setChecked(J.mo26198G());
        mo24233N(i, obtain);
        if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
            obtain.setClassName(J.mo26258p());
            C3576x8.m29929c(obtain, this.f16207i, i);
            obtain.setPackageName(this.f16207i.getContext().getPackageName());
            return obtain;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    /* renamed from: s */
    public final AccessibilityEvent mo24249s(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        this.f16207i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    /* renamed from: t */
    public final C3335t8 mo24250t(int i) {
        boolean z;
        C3335t8 R = C3335t8.m27493R();
        R.mo26255n0(true);
        R.mo26259p0(true);
        R.mo26239f0("android.view.View");
        Rect rect = f16199n;
        R.mo26228a0(rect);
        R.mo26230b0(rect);
        R.mo26187A0(this.f16207i);
        mo24235P(i, R);
        if (R.mo26278z() == null && R.mo26261r() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        R.mo26252m(this.f16203e);
        if (!this.f16203e.equals(rect)) {
            int k = R.mo26248k();
            if ((k & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((k & 128) == 0) {
                R.mo26277y0(this.f16207i.getContext().getPackageName());
                R.mo26207K0(this.f16207i, i);
                if (this.f16209k == i) {
                    R.mo26225Y(true);
                    R.mo26227a(128);
                } else {
                    R.mo26225Y(false);
                    R.mo26227a(64);
                }
                if (this.f16210l == i) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    R.mo26227a(2);
                } else if (R.mo26204J()) {
                    R.mo26227a(1);
                }
                R.mo26260q0(z);
                this.f16207i.getLocationOnScreen(this.f16205g);
                R.mo26254n(this.f16202d);
                if (this.f16202d.equals(rect)) {
                    R.mo26252m(this.f16202d);
                    if (R.f17981b != -1) {
                        C3335t8 R2 = C3335t8.m27493R();
                        for (int i2 = R.f17981b; i2 != -1; i2 = R2.f17981b) {
                            R2.mo26189B0(this.f16207i, -1);
                            R2.mo26228a0(f16199n);
                            mo24235P(i2, R2);
                            R2.mo26252m(this.f16203e);
                            Rect rect2 = this.f16202d;
                            Rect rect3 = this.f16203e;
                            rect2.offset(rect3.left, rect3.top);
                        }
                        R2.mo26222V();
                    }
                    this.f16202d.offset(this.f16205g[0] - this.f16207i.getScrollX(), this.f16205g[1] - this.f16207i.getScrollY());
                }
                if (this.f16207i.getLocalVisibleRect(this.f16204f)) {
                    this.f16204f.offset(this.f16205g[0] - this.f16207i.getScrollX(), this.f16205g[1] - this.f16207i.getScrollY());
                    if (this.f16202d.intersect(this.f16204f)) {
                        R.mo26230b0(this.f16202d);
                        if (mo24227G(this.f16202d)) {
                            R.mo26219Q0(true);
                        }
                    }
                }
                return R;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    /* renamed from: u */
    public final C3335t8 mo24251u() {
        C3335t8 T = C3335t8.m27496T(this.f16207i);
        ga7.m17759c0(this.f16207i, T);
        ArrayList arrayList = new ArrayList();
        mo24224C(arrayList);
        if (T.mo26256o() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                T.mo26233d(this.f16207i, ((Integer) arrayList.get(i)).intValue());
            }
            return T;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    /* renamed from: v */
    public final boolean mo24252v(MotionEvent motionEvent) {
        if (!this.f16206h.isEnabled() || !this.f16206h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int B = mo24223B(motionEvent.getX(), motionEvent.getY());
            mo24243X(B);
            if (B != Integer.MIN_VALUE) {
                return true;
            }
            return false;
        } else if (action != 10 || this.f16211m == Integer.MIN_VALUE) {
            return false;
        } else {
            mo24243X(Integer.MIN_VALUE);
            return true;
        }
    }

    /* renamed from: w */
    public final boolean mo24253w(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int H = m24336H(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z = false;
                        while (i < repeatCount && mo24228I(H, (Rect) null)) {
                            i++;
                            z = true;
                        }
                        return z;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            mo24246p();
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return mo24228I(2, (Rect) null);
        } else {
            if (keyEvent.hasModifiers(1)) {
                return mo24228I(1, (Rect) null);
            }
            return false;
        }
    }

    /* renamed from: x */
    public final int mo24254x() {
        return this.f16209k;
    }

    /* renamed from: y */
    public final j66<C3335t8> mo24255y() {
        ArrayList arrayList = new ArrayList();
        mo24224C(arrayList);
        j66<C3335t8> j66 = new j66<>();
        for (int i = 0; i < arrayList.size(); i++) {
            j66.mo21762r(((Integer) arrayList.get(i)).intValue(), mo24250t(((Integer) arrayList.get(i)).intValue()));
        }
        return j66;
    }

    /* renamed from: z */
    public final void mo24256z(int i, Rect rect) {
        mo24229J(i).mo26252m(rect);
    }
}
