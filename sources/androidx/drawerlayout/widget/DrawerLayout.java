package androidx.drawerlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.customview.view.AbsSavedState;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;
import p000.C3335t8;
import p000.C3658y8;
import p000.bc7;

public class DrawerLayout extends ViewGroup implements li4 {

    /* renamed from: B1 */
    public static final int[] f3461B1 = {16843828};

    /* renamed from: C1 */
    public static final int[] f3462C1 = {16842931};

    /* renamed from: D1 */
    public static final boolean f3463D1 = true;

    /* renamed from: E1 */
    public static final boolean f3464E1 = true;

    /* renamed from: F1 */
    public static boolean f3465F1;

    /* renamed from: A */
    public final C0580f f3466A;

    /* renamed from: A1 */
    public final C3658y8 f3467A1;

    /* renamed from: B */
    public int f3468B;

    /* renamed from: C */
    public boolean f3469C;

    /* renamed from: H */
    public boolean f3470H;

    /* renamed from: I */
    public int f3471I;

    /* renamed from: L */
    public int f3472L;

    /* renamed from: M */
    public int f3473M;

    /* renamed from: P */
    public int f3474P;

    /* renamed from: Q */
    public boolean f3475Q;

    /* renamed from: U */
    public C0579e f3476U;

    /* renamed from: a */
    public final C0578d f3477a;

    /* renamed from: b1 */
    public Drawable f3478b1;

    /* renamed from: d */
    public float f3479d;

    /* renamed from: e */
    public int f3480e;

    /* renamed from: e0 */
    public List<C0579e> f3481e0;

    /* renamed from: e1 */
    public Drawable f3482e1;

    /* renamed from: g */
    public int f3483g;

    /* renamed from: k */
    public float f3484k;

    /* renamed from: k0 */
    public float f3485k0;

    /* renamed from: o1 */
    public Drawable f3486o1;

    /* renamed from: p1 */
    public CharSequence f3487p1;

    /* renamed from: q1 */
    public CharSequence f3488q1;

    /* renamed from: r */
    public Paint f3489r;

    /* renamed from: r1 */
    public Object f3490r1;

    /* renamed from: s */
    public final bc7 f3491s;

    /* renamed from: s1 */
    public boolean f3492s1;

    /* renamed from: t1 */
    public Drawable f3493t1;

    /* renamed from: u1 */
    public Drawable f3494u1;

    /* renamed from: v0 */
    public float f3495v0;

    /* renamed from: v1 */
    public Drawable f3496v1;

    /* renamed from: w1 */
    public Drawable f3497w1;

    /* renamed from: x */
    public final bc7 f3498x;

    /* renamed from: x1 */
    public final ArrayList<View> f3499x1;

    /* renamed from: y */
    public final C0580f f3500y;

    /* renamed from: y1 */
    public Rect f3501y1;

    /* renamed from: z1 */
    public Matrix f3502z1;

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$a */
    public class C0575a implements C3658y8 {
        public C0575a() {
        }

        /* renamed from: a */
        public boolean mo5572a(View view, C3658y8.C3659a aVar) {
            if (!DrawerLayout.this.mo5489A(view) || DrawerLayout.this.mo5543p(view) == 2) {
                return false;
            }
            DrawerLayout.this.mo5512d(view);
            return true;
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$b */
    public class C0576b implements View.OnApplyWindowInsetsListener {
        public C0576b() {
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            boolean z;
            DrawerLayout drawerLayout = (DrawerLayout) view;
            if (windowInsets.getSystemWindowInsetTop() > 0) {
                z = true;
            } else {
                z = false;
            }
            drawerLayout.setChildInsets(windowInsets, z);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$c */
    public class C0577c extends C3715z7 {

        /* renamed from: d */
        public final Rect f3514d = new Rect();

        public C0577c() {
        }

        /* renamed from: a */
        public boolean mo5574a(View view, AccessibilityEvent accessibilityEvent) {
            CharSequence q;
            if (accessibilityEvent.getEventType() != 32) {
                return super.mo5574a(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View n = DrawerLayout.this.mo5529n();
            if (n == null || (q = DrawerLayout.this.mo5544q(DrawerLayout.this.mo5545r(n))) == null) {
                return true;
            }
            text.add(q);
            return true;
        }

        /* renamed from: f */
        public void mo5478f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo5478f(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        /* renamed from: g */
        public void mo5479g(View view, C3335t8 t8Var) {
            if (DrawerLayout.f3463D1) {
                super.mo5479g(view, t8Var);
            } else {
                C3335t8 S = C3335t8.m27494S(t8Var);
                super.mo5479g(view, S);
                t8Var.mo26205J0(view);
                ViewParent H = ga7.m17727H(view);
                if (H instanceof View) {
                    t8Var.mo26187A0((View) H);
                }
                mo5577o(t8Var, S);
                S.mo26222V();
                mo5576n(t8Var, (ViewGroup) view);
            }
            t8Var.mo26239f0("androidx.drawerlayout.widget.DrawerLayout");
            t8Var.mo26259p0(false);
            t8Var.mo26260q0(false);
            t8Var.mo26223W(C3335t8.C3336a.f18004e);
            t8Var.mo26223W(C3335t8.C3336a.f18005f);
        }

        /* renamed from: i */
        public boolean mo5575i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.f3463D1 || DrawerLayout.m4412y(view)) {
                return super.mo5575i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        /* renamed from: n */
        public final void mo5576n(C3335t8 t8Var, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.m4412y(childAt)) {
                    t8Var.mo26231c(childAt);
                }
            }
        }

        /* renamed from: o */
        public final void mo5577o(C3335t8 t8Var, C3335t8 t8Var2) {
            Rect rect = this.f3514d;
            t8Var2.mo26254n(rect);
            t8Var.mo26230b0(rect);
            t8Var.mo26219Q0(t8Var2.mo26218Q());
            t8Var.mo26277y0(t8Var2.mo26272w());
            t8Var.mo26239f0(t8Var2.mo26258p());
            t8Var.mo26247j0(t8Var2.mo26261r());
            t8Var.mo26255n0(t8Var2.mo26202I());
            t8Var.mo26260q0(t8Var2.mo26206K());
            t8Var.mo26225Y(t8Var2.mo26194E());
            t8Var.mo26201H0(t8Var2.mo26214O());
            t8Var.mo26227a(t8Var2.mo26248k());
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$d */
    public static final class C0578d extends C3715z7 {
        /* renamed from: g */
        public void mo5479g(View view, C3335t8 t8Var) {
            super.mo5479g(view, t8Var);
            if (!DrawerLayout.m4412y(view)) {
                t8Var.mo26187A0((View) null);
            }
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$e */
    public interface C0579e {
        /* renamed from: a */
        void mo5578a(View view);

        /* renamed from: b */
        void mo5579b(View view);

        /* renamed from: c */
        void mo5580c(int i);

        /* renamed from: d */
        void mo5581d(View view, float f);
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$f */
    public class C0580f extends bc7.C1622c {

        /* renamed from: a */
        public final int f3516a;

        /* renamed from: b */
        public bc7 f3517b;

        /* renamed from: c */
        public final Runnable f3518c = new C0581a();

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$f$a */
        public class C0581a implements Runnable {
            public C0581a() {
            }

            public void run() {
                C0580f.this.mo5594o();
            }
        }

        public C0580f(int i) {
            this.f3516a = i;
        }

        /* renamed from: a */
        public int mo5582a(View view, int i, int i2) {
            if (DrawerLayout.this.mo5509c(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        /* renamed from: b */
        public int mo5583b(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: d */
        public int mo5584d(View view) {
            if (DrawerLayout.this.mo5490B(view)) {
                return view.getWidth();
            }
            return 0;
        }

        /* renamed from: f */
        public void mo5585f(int i, int i2) {
            View view;
            if ((i & 1) == 1) {
                view = DrawerLayout.this.mo5527l(3);
            } else {
                view = DrawerLayout.this.mo5527l(5);
            }
            if (view != null && DrawerLayout.this.mo5543p(view) == 0) {
                this.f3517b.mo11508c(view, i2);
            }
        }

        /* renamed from: g */
        public boolean mo5586g(int i) {
            return false;
        }

        /* renamed from: h */
        public void mo5587h(int i, int i2) {
            DrawerLayout.this.postDelayed(this.f3518c, 160);
        }

        /* renamed from: i */
        public void mo5588i(View view, int i) {
            ((LayoutParams) view.getLayoutParams()).f3505c = false;
            mo5593n();
        }

        /* renamed from: j */
        public void mo5589j(int i) {
            DrawerLayout.this.mo5504P(i, this.f3517b.mo11526w());
        }

        /* renamed from: k */
        public void mo5590k(View view, int i, int i2, int i3, int i4) {
            float f;
            int i5;
            int width = view.getWidth();
            if (DrawerLayout.this.mo5509c(view, 3)) {
                f = (float) (i + width);
            } else {
                f = (float) (DrawerLayout.this.getWidth() - i);
            }
            float f2 = f / ((float) width);
            DrawerLayout.this.mo5501M(view, f2);
            if (f2 == Utils.FLOAT_EPSILON) {
                i5 = 4;
            } else {
                i5 = 0;
            }
            view.setVisibility(i5);
            DrawerLayout.this.invalidate();
        }

        /* renamed from: l */
        public void mo5591l(View view, float f, float f2) {
            int i;
            float s = DrawerLayout.this.mo5548s(view);
            int width = view.getWidth();
            if (DrawerLayout.this.mo5509c(view, 3)) {
                int i2 = (f > Utils.FLOAT_EPSILON ? 1 : (f == Utils.FLOAT_EPSILON ? 0 : -1));
                if (i2 > 0 || (i2 == 0 && s > 0.5f)) {
                    i = 0;
                } else {
                    i = -width;
                }
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f < Utils.FLOAT_EPSILON || (f == Utils.FLOAT_EPSILON && s > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.f3517b.mo11502P(i, view.getTop());
            DrawerLayout.this.invalidate();
        }

        /* renamed from: m */
        public boolean mo5592m(View view, int i) {
            if (!DrawerLayout.this.mo5490B(view) || !DrawerLayout.this.mo5509c(view, this.f3516a) || DrawerLayout.this.mo5543p(view) != 0) {
                return false;
            }
            return true;
        }

        /* renamed from: n */
        public final void mo5593n() {
            int i = 3;
            if (this.f3516a == 3) {
                i = 5;
            }
            View l = DrawerLayout.this.mo5527l(i);
            if (l != null) {
                DrawerLayout.this.mo5512d(l);
            }
        }

        /* renamed from: o */
        public void mo5594o() {
            boolean z;
            View view;
            int i;
            int y = this.f3517b.mo11528y();
            int i2 = 0;
            if (this.f3516a == 3) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                view = DrawerLayout.this.mo5527l(3);
                if (view != null) {
                    i2 = -view.getWidth();
                }
                i = i2 + y;
            } else {
                view = DrawerLayout.this.mo5527l(5);
                i = DrawerLayout.this.getWidth() - y;
            }
            if (view == null) {
                return;
            }
            if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && DrawerLayout.this.mo5543p(view) == 0) {
                this.f3517b.mo11504R(view, i, view.getTop());
                ((LayoutParams) view.getLayoutParams()).f3505c = true;
                DrawerLayout.this.invalidate();
                mo5593n();
                DrawerLayout.this.mo5508b();
            }
        }

        /* renamed from: p */
        public void mo5595p() {
            DrawerLayout.this.removeCallbacks(this.f3518c);
        }

        /* renamed from: q */
        public void mo5596q(bc7 bc7) {
            this.f3517b = bc7;
        }
    }

    static {
        boolean z = true;
        int i = Build.VERSION.SDK_INT;
        if (i < 29) {
            z = false;
        }
        f3465F1 = z;
    }

    public DrawerLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: u */
    public static String m4410u(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        if ((i & 5) == 5) {
            return "RIGHT";
        }
        return Integer.toHexString(i);
    }

    /* renamed from: v */
    public static boolean m4411v(View view) {
        Drawable background = view.getBackground();
        if (background == null || background.getOpacity() != -1) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    public static boolean m4412y(View view) {
        if (ga7.m17804z(view) == 4 || ga7.m17804z(view) == 2) {
            return false;
        }
        return true;
    }

    /* renamed from: A */
    public boolean mo5489A(View view) {
        if (!mo5490B(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        } else if ((((LayoutParams) view.getLayoutParams()).f3506d & 1) == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: B */
    public boolean mo5490B(View view) {
        int b = pj2.m24971b(((LayoutParams) view.getLayoutParams()).f3503a, ga7.m17715B(view));
        if ((b & 3) == 0 && (b & 5) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: C */
    public boolean mo5491C(View view) {
        if (!mo5490B(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        } else if (((LayoutParams) view.getLayoutParams()).f3504b > Utils.FLOAT_EPSILON) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: D */
    public final boolean mo5492D(float f, float f2, View view) {
        if (this.f3501y1 == null) {
            this.f3501y1 = new Rect();
        }
        view.getHitRect(this.f3501y1);
        return this.f3501y1.contains((int) f, (int) f2);
    }

    /* renamed from: E */
    public final void mo5493E(Drawable drawable, int i) {
        if (drawable != null && ij1.m19649h(drawable)) {
            ij1.m19654m(drawable, i);
        }
    }

    /* renamed from: F */
    public void mo5494F(View view, float f) {
        float s = mo5548s(view);
        float width = (float) view.getWidth();
        int i = ((int) (width * f)) - ((int) (s * width));
        if (!mo5509c(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        mo5501M(view, f);
    }

    /* renamed from: G */
    public void mo5495G(View view) {
        mo5496H(view, true);
    }

    /* renamed from: H */
    public void mo5496H(View view, boolean z) {
        if (mo5490B(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.f3470H) {
                layoutParams.f3504b = 1.0f;
                layoutParams.f3506d = 1;
                mo5503O(view, true);
                mo5502N(view);
            } else if (z) {
                layoutParams.f3506d |= 2;
                if (mo5509c(view, 3)) {
                    this.f3491s.mo11504R(view, 0, view.getTop());
                } else {
                    this.f3498x.mo11504R(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                mo5494F(view, 1.0f);
                mo5504P(0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    /* renamed from: I */
    public void mo5497I(C0579e eVar) {
        List<C0579e> list;
        if (eVar != null && (list = this.f3481e0) != null) {
            list.remove(eVar);
        }
    }

    /* renamed from: J */
    public final Drawable mo5498J() {
        int B = ga7.m17715B(this);
        if (B == 0) {
            Drawable drawable = this.f3493t1;
            if (drawable != null) {
                mo5493E(drawable, B);
                return this.f3493t1;
            }
        } else {
            Drawable drawable2 = this.f3494u1;
            if (drawable2 != null) {
                mo5493E(drawable2, B);
                return this.f3494u1;
            }
        }
        return this.f3496v1;
    }

    /* renamed from: K */
    public final Drawable mo5499K() {
        int B = ga7.m17715B(this);
        if (B == 0) {
            Drawable drawable = this.f3494u1;
            if (drawable != null) {
                mo5493E(drawable, B);
                return this.f3494u1;
            }
        } else {
            Drawable drawable2 = this.f3493t1;
            if (drawable2 != null) {
                mo5493E(drawable2, B);
                return this.f3493t1;
            }
        }
        return this.f3497w1;
    }

    /* renamed from: L */
    public final void mo5500L() {
        if (!f3464E1) {
            this.f3482e1 = mo5498J();
            this.f3486o1 = mo5499K();
        }
    }

    /* renamed from: M */
    public void mo5501M(View view, float f) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f != layoutParams.f3504b) {
            layoutParams.f3504b = f;
            mo5525j(view, f);
        }
    }

    /* renamed from: N */
    public final void mo5502N(View view) {
        C3335t8.C3336a aVar = C3335t8.C3336a.f18024y;
        ga7.m17773j0(view, aVar.mo26281b());
        if (mo5489A(view) && mo5543p(view) != 2) {
            ga7.m17777l0(view, aVar, (CharSequence) null, this.f3467A1);
        }
    }

    /* renamed from: O */
    public final void mo5503O(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || mo5490B(childAt)) && (!z || childAt != view)) {
                ga7.m17714A0(childAt, 4);
            } else {
                ga7.m17714A0(childAt, 1);
            }
        }
    }

    /* renamed from: P */
    public void mo5504P(int i, View view) {
        int B = this.f3491s.mo11488B();
        int B2 = this.f3498x.mo11488B();
        int i2 = 2;
        if (B == 1 || B2 == 1) {
            i2 = 1;
        } else if (!(B == 2 || B2 == 2)) {
            i2 = 0;
        }
        if (view != null && i == 0) {
            float f = ((LayoutParams) view.getLayoutParams()).f3504b;
            if (f == Utils.FLOAT_EPSILON) {
                mo5523h(view);
            } else if (f == 1.0f) {
                mo5524i(view);
            }
        }
        if (i2 != this.f3468B) {
            this.f3468B = i2;
            List<C0579e> list = this.f3481e0;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f3481e0.get(size).mo5580c(i2);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo5505a(C0579e eVar) {
        if (eVar != null) {
            if (this.f3481e0 == null) {
                this.f3481e0 = new ArrayList();
            }
            this.f3481e0.add(eVar);
        }
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z = false;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (!mo5490B(childAt)) {
                    this.f3499x1.add(childAt);
                } else if (mo5489A(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            }
            if (!z) {
                int size = this.f3499x1.size();
                for (int i4 = 0; i4 < size; i4++) {
                    View view = this.f3499x1.get(i4);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i, i2);
                    }
                }
            }
            this.f3499x1.clear();
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (mo5528m() != null || mo5490B(view)) {
            ga7.m17714A0(view, 4);
        } else {
            ga7.m17714A0(view, 1);
        }
        if (!f3463D1) {
            ga7.m17785p0(view, this.f3477a);
        }
    }

    /* renamed from: b */
    public void mo5508b() {
        if (!this.f3475Q) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 0);
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.f3475Q = true;
        }
    }

    /* renamed from: c */
    public boolean mo5509c(View view, int i) {
        if ((mo5545r(view) & i) == i) {
            return true;
        }
        return false;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof LayoutParams) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f = Utils.FLOAT_EPSILON;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((LayoutParams) getChildAt(i).getLayoutParams()).f3504b);
        }
        this.f3484k = f;
        boolean n = this.f3491s.mo11519n(true);
        boolean n2 = this.f3498x.mo11519n(true);
        if (n || n2) {
            ga7.m17767g0(this);
        }
    }

    /* renamed from: d */
    public void mo5512d(View view) {
        mo5515e(view, true);
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f3484k <= Utils.FLOAT_EPSILON) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            if (mo5492D(x, y, childAt) && !mo5565z(childAt) && mo5526k(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        Canvas canvas2 = canvas;
        View view2 = view;
        int height = getHeight();
        boolean z = mo5565z(view2);
        int width = getWidth();
        int save = canvas.save();
        int i = 0;
        if (z) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view2 && childAt.getVisibility() == 0 && m4411v(childAt) && mo5490B(childAt) && childAt.getHeight() >= height) {
                    if (mo5509c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f = this.f3484k;
        if (f > Utils.FLOAT_EPSILON && z) {
            int i4 = this.f3483g;
            this.f3489r.setColor((i4 & 16777215) | (((int) (((float) ((-16777216 & i4) >>> 24)) * f)) << 24));
            canvas.drawRect((float) i, Utils.FLOAT_EPSILON, (float) width, (float) getHeight(), this.f3489r);
        } else if (this.f3482e1 != null && mo5509c(view2, 3)) {
            int intrinsicWidth = this.f3482e1.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(Utils.FLOAT_EPSILON, Math.min(((float) right2) / ((float) this.f3491s.mo11528y()), 1.0f));
            this.f3482e1.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.f3482e1.setAlpha((int) (max * 255.0f));
            this.f3482e1.draw(canvas);
        } else if (this.f3486o1 != null && mo5509c(view2, 5)) {
            int intrinsicWidth2 = this.f3486o1.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(Utils.FLOAT_EPSILON, Math.min(((float) (getWidth() - left2)) / ((float) this.f3498x.mo11528y()), 1.0f));
            this.f3486o1.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.f3486o1.setAlpha((int) (max2 * 255.0f));
            this.f3486o1.draw(canvas);
        }
        return drawChild;
    }

    /* renamed from: e */
    public void mo5515e(View view, boolean z) {
        if (mo5490B(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.f3470H) {
                layoutParams.f3504b = Utils.FLOAT_EPSILON;
                layoutParams.f3506d = 0;
            } else if (z) {
                layoutParams.f3506d |= 4;
                if (mo5509c(view, 3)) {
                    this.f3491s.mo11504R(view, -view.getWidth(), view.getTop());
                } else {
                    this.f3498x.mo11504R(view, getWidth(), view.getTop());
                }
            } else {
                mo5494F(view, Utils.FLOAT_EPSILON);
                mo5504P(0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    /* renamed from: f */
    public void mo5516f() {
        mo5517g(false);
    }

    /* renamed from: g */
    public void mo5517g(boolean z) {
        boolean z2;
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (mo5490B(childAt) && (!z || layoutParams.f3505c)) {
                int width = childAt.getWidth();
                if (mo5509c(childAt, 3)) {
                    z2 = this.f3491s.mo11504R(childAt, -width, childAt.getTop());
                } else {
                    z2 = this.f3498x.mo11504R(childAt, getWidth(), childAt.getTop());
                }
                z3 |= z2;
                layoutParams.f3505c = false;
            }
        }
        this.f3500y.mo5595p();
        this.f3466A.mo5595p();
        if (z3) {
            invalidate();
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
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

    public float getDrawerElevation() {
        if (f3464E1) {
            return this.f3479d;
        }
        return Utils.FLOAT_EPSILON;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f3478b1;
    }

    /* renamed from: h */
    public void mo5523h(View view) {
        View rootView;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.f3506d & 1) == 1) {
            layoutParams.f3506d = 0;
            List<C0579e> list = this.f3481e0;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f3481e0.get(size).mo5579b(view);
                }
            }
            mo5503O(view, false);
            mo5502N(view);
            if (hasWindowFocus() && (rootView = getRootView()) != null) {
                rootView.sendAccessibilityEvent(32);
            }
        }
    }

    /* renamed from: i */
    public void mo5524i(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.f3506d & 1) == 0) {
            layoutParams.f3506d = 1;
            List<C0579e> list = this.f3481e0;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f3481e0.get(size).mo5578a(view);
                }
            }
            mo5503O(view, true);
            mo5502N(view);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    /* renamed from: j */
    public void mo5525j(View view, float f) {
        List<C0579e> list = this.f3481e0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f3481e0.get(size).mo5581d(view, f);
            }
        }
    }

    /* renamed from: k */
    public final boolean mo5526k(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent t = mo5562t(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(t);
            t.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = (float) (getScrollX() - view.getLeft());
        float scrollY = (float) (getScrollY() - view.getTop());
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    /* renamed from: l */
    public View mo5527l(int i) {
        int b = pj2.m24971b(i, ga7.m17715B(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((mo5545r(childAt) & 7) == b) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: m */
    public View mo5528m() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((LayoutParams) childAt.getLayoutParams()).f3506d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: n */
    public View mo5529n() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (mo5490B(childAt) && mo5491C(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: o */
    public int mo5530o(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int B = ga7.m17715B(this);
        if (i == 3) {
            int i6 = this.f3471I;
            if (i6 != 3) {
                return i6;
            }
            if (B == 0) {
                i2 = this.f3473M;
            } else {
                i2 = this.f3474P;
            }
            if (i2 != 3) {
                return i2;
            }
            return 0;
        } else if (i == 5) {
            int i7 = this.f3472L;
            if (i7 != 3) {
                return i7;
            }
            if (B == 0) {
                i3 = this.f3474P;
            } else {
                i3 = this.f3473M;
            }
            if (i3 != 3) {
                return i3;
            }
            return 0;
        } else if (i == 8388611) {
            int i8 = this.f3473M;
            if (i8 != 3) {
                return i8;
            }
            if (B == 0) {
                i4 = this.f3471I;
            } else {
                i4 = this.f3472L;
            }
            if (i4 != 3) {
                return i4;
            }
            return 0;
        } else if (i != 8388613) {
            return 0;
        } else {
            int i9 = this.f3474P;
            if (i9 != 3) {
                return i9;
            }
            if (B == 0) {
                i5 = this.f3472L;
            } else {
                i5 = this.f3471I;
            }
            if (i5 != 3) {
                return i5;
            }
            return 0;
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3470H = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3470H = true;
    }

    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.f3492s1 && this.f3478b1 != null) {
            Object obj = this.f3490r1;
            if (obj != null) {
                i = ((WindowInsets) obj).getSystemWindowInsetTop();
            } else {
                i = 0;
            }
            if (i > 0) {
                this.f3478b1.setBounds(0, 0, getWidth(), i);
                this.f3478b1.draw(canvas);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r0 != 3) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            bc7 r1 = r6.f3491s
            boolean r1 = r1.mo11503Q(r7)
            bc7 r2 = r6.f3498x
            boolean r2 = r2.mo11503Q(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0038
            if (r0 == r2) goto L_0x0031
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L_0x001e
            if (r0 == r4) goto L_0x0031
            goto L_0x0036
        L_0x001e:
            bc7 r7 = r6.f3491s
            boolean r7 = r7.mo11510e(r4)
            if (r7 == 0) goto L_0x0036
            androidx.drawerlayout.widget.DrawerLayout$f r7 = r6.f3500y
            r7.mo5595p()
            androidx.drawerlayout.widget.DrawerLayout$f r7 = r6.f3466A
            r7.mo5595p()
            goto L_0x0036
        L_0x0031:
            r6.mo5517g(r2)
            r6.f3475Q = r3
        L_0x0036:
            r7 = r3
            goto L_0x0060
        L_0x0038:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f3485k0 = r0
            r6.f3495v0 = r7
            float r4 = r6.f3484k
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x005d
            bc7 r4 = r6.f3491s
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.mo11524u(r0, r7)
            if (r7 == 0) goto L_0x005d
            boolean r7 = r6.mo5565z(r7)
            if (r7 == 0) goto L_0x005d
            r7 = r2
            goto L_0x005e
        L_0x005d:
            r7 = r3
        L_0x005e:
            r6.f3475Q = r3
        L_0x0060:
            if (r1 != 0) goto L_0x0070
            if (r7 != 0) goto L_0x0070
            boolean r7 = r6.mo5563w()
            if (r7 != 0) goto L_0x0070
            boolean r7 = r6.f3475Q
            if (r7 == 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r2 = r3
        L_0x0070:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !mo5564x()) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View n = mo5529n();
        if (n != null && mo5543p(n) == 0) {
            mo5516f();
        }
        if (n != null) {
            return true;
        }
        return false;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        WindowInsets rootWindowInsets;
        float f;
        int i5;
        boolean z2;
        int i6;
        boolean z3 = true;
        this.f3469C = true;
        int i7 = i3 - i;
        int childCount = getChildCount();
        int i8 = 0;
        while (i8 < childCount) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (mo5565z(childAt)) {
                    int i9 = layoutParams.leftMargin;
                    childAt.layout(i9, layoutParams.topMargin, childAt.getMeasuredWidth() + i9, layoutParams.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (mo5509c(childAt, 3)) {
                        float f2 = (float) measuredWidth;
                        i5 = (-measuredWidth) + ((int) (layoutParams.f3504b * f2));
                        f = ((float) (measuredWidth + i5)) / f2;
                    } else {
                        float f3 = (float) measuredWidth;
                        int i10 = i7 - ((int) (layoutParams.f3504b * f3));
                        f = ((float) (i7 - i10)) / f3;
                        i5 = i10;
                    }
                    if (f != layoutParams.f3504b) {
                        z2 = z3;
                    } else {
                        z2 = false;
                    }
                    int i11 = layoutParams.f3503a & 112;
                    if (i11 == 16) {
                        int i12 = i4 - i2;
                        int i13 = (i12 - measuredHeight) / 2;
                        int i14 = layoutParams.topMargin;
                        if (i13 < i14) {
                            i13 = i14;
                        } else {
                            int i15 = i13 + measuredHeight;
                            int i16 = layoutParams.bottomMargin;
                            if (i15 > i12 - i16) {
                                i13 = (i12 - i16) - measuredHeight;
                            }
                        }
                        childAt.layout(i5, i13, measuredWidth + i5, measuredHeight + i13);
                    } else if (i11 != 80) {
                        int i17 = layoutParams.topMargin;
                        childAt.layout(i5, i17, measuredWidth + i5, measuredHeight + i17);
                    } else {
                        int i18 = i4 - i2;
                        childAt.layout(i5, (i18 - layoutParams.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i18 - layoutParams.bottomMargin);
                    }
                    if (z2) {
                        mo5501M(childAt, f);
                    }
                    if (layoutParams.f3504b > Utils.FLOAT_EPSILON) {
                        i6 = 0;
                    } else {
                        i6 = 4;
                    }
                    if (childAt.getVisibility() != i6) {
                        childAt.setVisibility(i6);
                    }
                }
            }
            i8++;
            z3 = true;
        }
        if (f3465F1 && (rootWindowInsets = getRootWindowInsets()) != null) {
            qv2 i19 = hl7.m18975x(rootWindowInsets).mo21236i();
            bc7 bc7 = this.f3491s;
            bc7.mo11499M(Math.max(bc7.mo11527x(), i19.f17074a));
            bc7 bc72 = this.f3498x;
            bc72.mo11499M(Math.max(bc72.mo11527x(), i19.f17076c));
        }
        this.f3469C = false;
        this.f3470H = false;
    }

    @SuppressLint({"WrongConstant"})
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode == 0) {
                    size = 300;
                }
                if (mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        int i4 = 0;
        if (this.f3490r1 == null || !ga7.m17802y(this)) {
            z = false;
        } else {
            z = true;
        }
        int B = ga7.m17715B(this);
        int childCount = getChildCount();
        int i5 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (z) {
                    int b = pj2.m24971b(layoutParams.f3503a, B);
                    if (ga7.m17802y(childAt)) {
                        WindowInsets windowInsets = (WindowInsets) this.f3490r1;
                        if (b == 3) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i4, windowInsets.getSystemWindowInsetBottom());
                        } else if (b == 5) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(i4, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsets);
                    } else {
                        WindowInsets windowInsets2 = (WindowInsets) this.f3490r1;
                        if (b == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i4, windowInsets2.getSystemWindowInsetBottom());
                        } else if (b == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(i4, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        layoutParams.leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        layoutParams.topMargin = windowInsets2.getSystemWindowInsetTop();
                        layoutParams.rightMargin = windowInsets2.getSystemWindowInsetRight();
                        layoutParams.bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (mo5565z(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - layoutParams.leftMargin) - layoutParams.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - layoutParams.topMargin) - layoutParams.bottomMargin, 1073741824));
                } else if (mo5490B(childAt)) {
                    if (f3464E1) {
                        float w = ga7.m17798w(childAt);
                        float f = this.f3479d;
                        if (w != f) {
                            ga7.m17801x0(childAt, f);
                        }
                    }
                    int r = mo5545r(childAt) & 7;
                    if (r == 3) {
                        i3 = 1;
                    } else {
                        i3 = i4;
                    }
                    if ((i3 == 0 || !z2) && (i3 != 0 || !z3)) {
                        if (i3 != 0) {
                            z2 = true;
                        } else {
                            z3 = true;
                        }
                        childAt.measure(ViewGroup.getChildMeasureSpec(i, this.f3480e + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), ViewGroup.getChildMeasureSpec(i2, layoutParams.topMargin + layoutParams.bottomMargin, layoutParams.height));
                        i5++;
                        i4 = 0;
                    } else {
                        throw new IllegalStateException("Child drawer has absolute gravity " + m4410u(r) + " but this " + "DrawerLayout" + " already has a drawer view along that edge");
                    }
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i5 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
            int i6 = i;
            int i7 = i2;
            i5++;
            i4 = 0;
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        View l;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo5481a());
        int i = savedState.f3507e;
        if (!(i == 0 || (l = mo5527l(i)) == null)) {
            mo5495G(l);
        }
        int i2 = savedState.f3508g;
        if (i2 != 3) {
            setDrawerLockMode(i2, 3);
        }
        int i3 = savedState.f3509k;
        if (i3 != 3) {
            setDrawerLockMode(i3, 5);
        }
        int i4 = savedState.f3510r;
        if (i4 != 3) {
            setDrawerLockMode(i4, 8388611);
        }
        int i5 = savedState.f3511s;
        if (i5 != 3) {
            setDrawerLockMode(i5, 8388613);
        }
    }

    public void onRtlPropertiesChanged(int i) {
        mo5500L();
    }

    public Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
            int i2 = layoutParams.f3506d;
            boolean z2 = true;
            if (i2 == 1) {
                z = true;
            } else {
                z = false;
            }
            if (i2 != 2) {
                z2 = false;
            }
            if (z || z2) {
                savedState.f3507e = layoutParams.f3503a;
            } else {
                i++;
            }
        }
        savedState.f3508g = this.f3471I;
        savedState.f3509k = this.f3472L;
        savedState.f3510r = this.f3473M;
        savedState.f3511s = this.f3474P;
        return savedState;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0058, code lost:
        if (mo5543p(r7) != 2) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            bc7 r0 = r6.f3491s
            r0.mo11493G(r7)
            bc7 r0 = r6.f3498x
            r0.mo11493G(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x005f
            if (r0 == r2) goto L_0x0020
            r7 = 3
            if (r0 == r7) goto L_0x001a
            goto L_0x006d
        L_0x001a:
            r6.mo5517g(r2)
            r6.f3475Q = r1
            goto L_0x006d
        L_0x0020:
            float r0 = r7.getX()
            float r7 = r7.getY()
            bc7 r3 = r6.f3491s
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.mo11524u(r4, r5)
            if (r3 == 0) goto L_0x005a
            boolean r3 = r6.mo5565z(r3)
            if (r3 == 0) goto L_0x005a
            float r3 = r6.f3485k0
            float r0 = r0 - r3
            float r3 = r6.f3495v0
            float r7 = r7 - r3
            bc7 r3 = r6.f3491s
            int r3 = r3.mo11487A()
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x005a
            android.view.View r7 = r6.mo5528m()
            if (r7 == 0) goto L_0x005a
            int r7 = r6.mo5543p(r7)
            r0 = 2
            if (r7 != r0) goto L_0x005b
        L_0x005a:
            r1 = r2
        L_0x005b:
            r6.mo5517g(r1)
            goto L_0x006d
        L_0x005f:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f3485k0 = r0
            r6.f3495v0 = r7
            r6.f3475Q = r1
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public int mo5543p(View view) {
        if (mo5490B(view)) {
            return mo5530o(((LayoutParams) view.getLayoutParams()).f3503a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: q */
    public CharSequence mo5544q(int i) {
        int b = pj2.m24971b(i, ga7.m17715B(this));
        if (b == 3) {
            return this.f3487p1;
        }
        if (b == 5) {
            return this.f3488q1;
        }
        return null;
    }

    /* renamed from: r */
    public int mo5545r(View view) {
        return pj2.m24971b(((LayoutParams) view.getLayoutParams()).f3503a, ga7.m17715B(this));
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            mo5517g(true);
        }
    }

    public void requestLayout() {
        if (!this.f3469C) {
            super.requestLayout();
        }
    }

    /* renamed from: s */
    public float mo5548s(View view) {
        return ((LayoutParams) view.getLayoutParams()).f3504b;
    }

    public void setChildInsets(Object obj, boolean z) {
        boolean z2;
        this.f3490r1 = obj;
        this.f3492s1 = z;
        if (z || getBackground() != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        setWillNotDraw(z2);
        requestLayout();
    }

    public void setDrawerElevation(float f) {
        this.f3479d = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (mo5490B(childAt)) {
                ga7.m17801x0(childAt, this.f3479d);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(C0579e eVar) {
        C0579e eVar2 = this.f3476U;
        if (eVar2 != null) {
            mo5497I(eVar2);
        }
        if (eVar != null) {
            mo5505a(eVar);
        }
        this.f3476U = eVar;
    }

    public void setDrawerLockMode(int i) {
        setDrawerLockMode(i, 3);
        setDrawerLockMode(i, 5);
    }

    public void setDrawerShadow(Drawable drawable, int i) {
        if (!f3464E1) {
            if ((i & 8388611) == 8388611) {
                this.f3493t1 = drawable;
            } else if ((i & 8388613) == 8388613) {
                this.f3494u1 = drawable;
            } else if ((i & 3) == 3) {
                this.f3496v1 = drawable;
            } else if ((i & 5) == 5) {
                this.f3497w1 = drawable;
            } else {
                return;
            }
            mo5500L();
            invalidate();
        }
    }

    public void setDrawerTitle(int i, CharSequence charSequence) {
        int b = pj2.m24971b(i, ga7.m17715B(this));
        if (b == 3) {
            this.f3487p1 = charSequence;
        } else if (b == 5) {
            this.f3488q1 = charSequence;
        }
    }

    public void setScrimColor(int i) {
        this.f3483g = i;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f3478b1 = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.f3478b1 = new ColorDrawable(i);
        invalidate();
    }

    /* renamed from: t */
    public final MotionEvent mo5562t(MotionEvent motionEvent, View view) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation((float) (getScrollX() - view.getLeft()), (float) (getScrollY() - view.getTop()));
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.f3502z1 == null) {
                this.f3502z1 = new Matrix();
            }
            matrix.invert(this.f3502z1);
            obtain.transform(this.f3502z1);
        }
        return obtain;
    }

    /* renamed from: w */
    public final boolean mo5563w() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).f3505c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: x */
    public final boolean mo5564x() {
        if (mo5529n() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public boolean mo5565z(View view) {
        if (((LayoutParams) view.getLayoutParams()).f3503a == 0) {
            return true;
        }
        return false;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, h15.drawerLayoutStyle);
    }

    /* JADX INFO: finally extract failed */
    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3477a = new C0578d();
        this.f3483g = -1728053248;
        this.f3489r = new Paint();
        this.f3470H = true;
        this.f3471I = 3;
        this.f3472L = 3;
        this.f3473M = 3;
        this.f3474P = 3;
        this.f3493t1 = null;
        this.f3494u1 = null;
        this.f3496v1 = null;
        this.f3497w1 = null;
        this.f3467A1 = new C0575a();
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f3480e = (int) ((64.0f * f) + 0.5f);
        float f2 = f * 400.0f;
        C0580f fVar = new C0580f(3);
        this.f3500y = fVar;
        C0580f fVar2 = new C0580f(5);
        this.f3466A = fVar2;
        bc7 o = bc7.m11209o(this, 1.0f, fVar);
        this.f3491s = o;
        o.mo11500N(1);
        o.mo11501O(f2);
        fVar.mo5596q(o);
        bc7 o2 = bc7.m11209o(this, 1.0f, fVar2);
        this.f3498x = o2;
        o2.mo11500N(2);
        o2.mo11501O(f2);
        fVar2.mo5596q(o2);
        setFocusableInTouchMode(true);
        ga7.m17714A0(this, 1);
        ga7.m17785p0(this, new C0577c());
        setMotionEventSplittingEnabled(false);
        if (ga7.m17802y(this)) {
            setOnApplyWindowInsetsListener(new C0576b());
            setSystemUiVisibility(1280);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f3461B1);
            try {
                this.f3478b1 = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f65.DrawerLayout, i, 0);
        try {
            int i2 = f65.DrawerLayout_elevation;
            if (obtainStyledAttributes2.hasValue(i2)) {
                this.f3479d = obtainStyledAttributes2.getDimension(i2, Utils.FLOAT_EPSILON);
            } else {
                this.f3479d = getResources().getDimension(g25.def_drawer_elevation);
            }
            obtainStyledAttributes2.recycle();
            this.f3499x1 = new ArrayList<>();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public void setDrawerLockMode(int i, int i2) {
        View l;
        int b = pj2.m24971b(i2, ga7.m17715B(this));
        if (i2 == 3) {
            this.f3471I = i;
        } else if (i2 == 5) {
            this.f3472L = i;
        } else if (i2 == 8388611) {
            this.f3473M = i;
        } else if (i2 == 8388613) {
            this.f3474P = i;
        }
        if (i != 0) {
            (b == 3 ? this.f3491s : this.f3498x).mo11507b();
        }
        if (i == 1) {
            View l2 = mo5527l(b);
            if (l2 != null) {
                mo5512d(l2);
            }
        } else if (i == 2 && (l = mo5527l(b)) != null) {
            mo5495G(l);
        }
    }

    public void setStatusBarBackground(int i) {
        this.f3478b1 = i != 0 ? zr0.m31442e(getContext(), i) : null;
        invalidate();
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f3503a = 0;

        /* renamed from: b */
        public float f3504b;

        /* renamed from: c */
        public boolean f3505c;

        /* renamed from: d */
        public int f3506d;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f3462C1);
            this.f3503a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f3503a = layoutParams.f3503a;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0574a();

        /* renamed from: e */
        public int f3507e = 0;

        /* renamed from: g */
        public int f3508g;

        /* renamed from: k */
        public int f3509k;

        /* renamed from: r */
        public int f3510r;

        /* renamed from: s */
        public int f3511s;

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$SavedState$a */
        public class C0574a implements Parcelable.ClassLoaderCreator<SavedState> {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3507e = parcel.readInt();
            this.f3508g = parcel.readInt();
            this.f3509k = parcel.readInt();
            this.f3510r = parcel.readInt();
            this.f3511s = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3507e);
            parcel.writeInt(this.f3508g);
            parcel.writeInt(this.f3509k);
            parcel.writeInt(this.f3510r);
            parcel.writeInt(this.f3511s);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public void setDrawerShadow(int i, int i2) {
        setDrawerShadow(zr0.m31442e(getContext(), i), i2);
    }

    public void setDrawerLockMode(int i, View view) {
        if (mo5490B(view)) {
            setDrawerLockMode(i, ((LayoutParams) view.getLayoutParams()).f3503a);
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer with appropriate layout_gravity");
    }
}
