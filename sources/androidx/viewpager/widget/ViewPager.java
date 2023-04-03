package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.customview.view.AbsSavedState;
import com.github.mikephil.charting.utils.Utils;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager extends ViewGroup {

    /* renamed from: V1 */
    public static final int[] f7318V1 = {16842931};

    /* renamed from: W1 */
    public static final Comparator<C1478f> f7319W1 = new C1473a();

    /* renamed from: X1 */
    public static final Interpolator f7320X1 = new C1474b();

    /* renamed from: Y1 */
    public static final C1484l f7321Y1 = new C1484l();

    /* renamed from: A */
    public Scroller f7322A;

    /* renamed from: A1 */
    public int f7323A1;

    /* renamed from: B */
    public boolean f7324B;

    /* renamed from: B1 */
    public int f7325B1;

    /* renamed from: C */
    public C1483k f7326C;

    /* renamed from: C1 */
    public int f7327C1;

    /* renamed from: D1 */
    public boolean f7328D1;

    /* renamed from: E1 */
    public long f7329E1;

    /* renamed from: F1 */
    public EdgeEffect f7330F1;

    /* renamed from: G1 */
    public EdgeEffect f7331G1;

    /* renamed from: H */
    public int f7332H;

    /* renamed from: H1 */
    public boolean f7333H1 = true;

    /* renamed from: I */
    public Drawable f7334I;

    /* renamed from: I1 */
    public boolean f7335I1 = false;

    /* renamed from: J1 */
    public boolean f7336J1;

    /* renamed from: K1 */
    public int f7337K1;

    /* renamed from: L */
    public int f7338L;

    /* renamed from: L1 */
    public List<C1481i> f7339L1;

    /* renamed from: M */
    public int f7340M;

    /* renamed from: M1 */
    public C1481i f7341M1;

    /* renamed from: N1 */
    public C1481i f7342N1;

    /* renamed from: O1 */
    public List<C1480h> f7343O1;

    /* renamed from: P */
    public float f7344P = -3.4028235E38f;

    /* renamed from: P1 */
    public C1482j f7345P1;

    /* renamed from: Q */
    public float f7346Q = Float.MAX_VALUE;

    /* renamed from: Q1 */
    public int f7347Q1;

    /* renamed from: R1 */
    public int f7348R1;

    /* renamed from: S1 */
    public ArrayList<View> f7349S1;

    /* renamed from: T1 */
    public final Runnable f7350T1 = new C1475c();

    /* renamed from: U */
    public int f7351U;

    /* renamed from: U1 */
    public int f7352U1 = 0;

    /* renamed from: a */
    public int f7353a;

    /* renamed from: b1 */
    public boolean f7354b1;

    /* renamed from: d */
    public final ArrayList<C1478f> f7355d = new ArrayList<>();

    /* renamed from: e */
    public final C1478f f7356e = new C1478f();

    /* renamed from: e0 */
    public int f7357e0;

    /* renamed from: e1 */
    public int f7358e1 = 1;

    /* renamed from: g */
    public final Rect f7359g = new Rect();

    /* renamed from: k */
    public al4 f7360k;

    /* renamed from: k0 */
    public boolean f7361k0;

    /* renamed from: o1 */
    public boolean f7362o1;

    /* renamed from: p1 */
    public boolean f7363p1;

    /* renamed from: q1 */
    public int f7364q1;

    /* renamed from: r */
    public int f7365r;

    /* renamed from: r1 */
    public int f7366r1;

    /* renamed from: s */
    public int f7367s = -1;

    /* renamed from: s1 */
    public int f7368s1;

    /* renamed from: t1 */
    public float f7369t1;

    /* renamed from: u1 */
    public float f7370u1;

    /* renamed from: v0 */
    public boolean f7371v0;

    /* renamed from: v1 */
    public float f7372v1;

    /* renamed from: w1 */
    public float f7373w1;

    /* renamed from: x */
    public Parcelable f7374x = null;

    /* renamed from: x1 */
    public int f7375x1 = -1;

    /* renamed from: y */
    public ClassLoader f7376y = null;

    /* renamed from: y1 */
    public VelocityTracker f7377y1;

    /* renamed from: z1 */
    public int f7378z1;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1472a();

        /* renamed from: e */
        public int f7385e;

        /* renamed from: g */
        public Parcelable f7386g;

        /* renamed from: k */
        public ClassLoader f7387k;

        /* renamed from: androidx.viewpager.widget.ViewPager$SavedState$a */
        public static class C1472a implements Parcelable.ClassLoaderCreator<SavedState> {
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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f7385e + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f7385e);
            parcel.writeParcelable(this.f7386g, i);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f7385e = parcel.readInt();
            this.f7386g = parcel.readParcelable(classLoader);
            this.f7387k = classLoader;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$a */
    public static class C1473a implements Comparator<C1478f> {
        /* renamed from: a */
        public int compare(C1478f fVar, C1478f fVar2) {
            return fVar.f7392b - fVar2.f7392b;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$b */
    public static class C1474b implements Interpolator {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$c */
    public class C1475c implements Runnable {
        public C1475c() {
        }

        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.mo10652H();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$d */
    public class C1476d implements xg4 {

        /* renamed from: a */
        public final Rect f7389a = new Rect();

        public C1476d() {
        }

        /* renamed from: a */
        public hl7 mo1158a(View view, hl7 hl7) {
            hl7 b0 = ga7.m17757b0(view, hl7);
            if (b0.mo21243q()) {
                return b0;
            }
            Rect rect = this.f7389a;
            rect.left = b0.mo21238k();
            rect.top = b0.mo21240m();
            rect.right = b0.mo21239l();
            rect.bottom = b0.mo21237j();
            int childCount = ViewPager.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                hl7 g = ga7.m17766g(ViewPager.this.getChildAt(i), b0);
                rect.left = Math.min(g.mo21238k(), rect.left);
                rect.top = Math.min(g.mo21240m(), rect.top);
                rect.right = Math.min(g.mo21239l(), rect.right);
                rect.bottom = Math.min(g.mo21237j(), rect.bottom);
            }
            return b0.mo21244r(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.viewpager.widget.ViewPager$e */
    public @interface C1477e {
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$f */
    public static class C1478f {

        /* renamed from: a */
        public Object f7391a;

        /* renamed from: b */
        public int f7392b;

        /* renamed from: c */
        public boolean f7393c;

        /* renamed from: d */
        public float f7394d;

        /* renamed from: e */
        public float f7395e;
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$g */
    public class C1479g extends C3715z7 {
        public C1479g() {
        }

        /* renamed from: f */
        public void mo5478f(View view, AccessibilityEvent accessibilityEvent) {
            al4 al4;
            super.mo5478f(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(mo10744n());
            if (accessibilityEvent.getEventType() == 4096 && (al4 = ViewPager.this.f7360k) != null) {
                accessibilityEvent.setItemCount(al4.mo370e());
                accessibilityEvent.setFromIndex(ViewPager.this.f7365r);
                accessibilityEvent.setToIndex(ViewPager.this.f7365r);
            }
        }

        /* renamed from: g */
        public void mo5479g(View view, C3335t8 t8Var) {
            super.mo5479g(view, t8Var);
            t8Var.mo26239f0(ViewPager.class.getName());
            t8Var.mo26199G0(mo10744n());
            if (ViewPager.this.canScrollHorizontally(1)) {
                t8Var.mo26227a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                t8Var.mo26227a(8192);
            }
        }

        /* renamed from: j */
        public boolean mo5480j(View view, int i, Bundle bundle) {
            if (super.mo5480j(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.f7365r - 1);
                return true;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                ViewPager viewPager2 = ViewPager.this;
                viewPager2.setCurrentItem(viewPager2.f7365r + 1);
                return true;
            }
        }

        /* renamed from: n */
        public final boolean mo10744n() {
            al4 al4 = ViewPager.this.f7360k;
            if (al4 == null || al4.mo370e() <= 1) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$h */
    public interface C1480h {
        /* renamed from: a */
        void mo10639a(ViewPager viewPager, al4 al4, al4 al42);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$i */
    public interface C1481i {
        /* renamed from: c */
        void mo10640c(int i, float f, int i2);

        /* renamed from: d */
        void mo10641d(int i);

        /* renamed from: e */
        void mo10642e(int i);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$j */
    public interface C1482j {
        /* renamed from: a */
        void mo10745a(View view, float f);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$k */
    public class C1483k extends DataSetObserver {
        public C1483k() {
        }

        public void onChanged() {
            ViewPager.this.mo10692i();
        }

        public void onInvalidated() {
            ViewPager.this.mo10692i();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$l */
    public static class C1484l implements Comparator<View> {
        /* renamed from: a */
        public int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            boolean z = layoutParams.f7379a;
            if (z == layoutParams2.f7379a) {
                return layoutParams.f7383e - layoutParams2.f7383e;
            }
            if (z) {
                return 1;
            }
            return -1;
        }
    }

    public ViewPager(Context context) {
        super(context);
        mo10731x();
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f7371v0 != z) {
            this.f7371v0 = z;
        }
    }

    /* renamed from: y */
    public static boolean m10235y(View view) {
        if (view.getClass().getAnnotation(C1477e.class) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: A */
    public final boolean mo10645A(float f, float f2) {
        if ((f >= ((float) this.f7366r1) || f2 <= Utils.FLOAT_EPSILON) && (f <= ((float) (getWidth() - this.f7366r1)) || f2 >= Utils.FLOAT_EPSILON)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10646B(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.f7337K1
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x006b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r1
        L_0x001b:
            if (r7 >= r6) goto L_0x006b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r9 = (androidx.viewpager.widget.ViewPager.LayoutParams) r9
            boolean r10 = r9.f7379a
            if (r10 != 0) goto L_0x002c
            goto L_0x0068
        L_0x002c:
            int r9 = r9.f7380b
            r9 = r9 & 7
            if (r9 == r2) goto L_0x004d
            r10 = 3
            if (r9 == r10) goto L_0x0047
            r10 = 5
            if (r9 == r10) goto L_0x003a
            r9 = r3
            goto L_0x005c
        L_0x003a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L_0x0059
        L_0x0047:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L_0x005c
        L_0x004d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L_0x0059:
            r11 = r9
            r9 = r3
            r3 = r11
        L_0x005c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L_0x0067
            r8.offsetLeftAndRight(r3)
        L_0x0067:
            r3 = r9
        L_0x0068:
            int r7 = r7 + 1
            goto L_0x001b
        L_0x006b:
            r12.mo10694k(r13, r14, r15)
            androidx.viewpager.widget.ViewPager$j r13 = r12.f7345P1
            if (r13 == 0) goto L_0x009f
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L_0x007a:
            if (r1 >= r14) goto L_0x009f
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r0 = (androidx.viewpager.widget.ViewPager.LayoutParams) r0
            boolean r0 = r0.f7379a
            if (r0 == 0) goto L_0x008b
            goto L_0x009c
        L_0x008b:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.ViewPager$j r3 = r12.f7345P1
            r3.mo10745a(r15, r0)
        L_0x009c:
            int r1 = r1 + 1
            goto L_0x007a
        L_0x009f:
            r12.f7336J1 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.mo10646B(int, float, int):void");
    }

    /* renamed from: C */
    public final void mo10647C(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f7375x1) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f7369t1 = motionEvent.getX(i);
            this.f7375x1 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f7377y1;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: D */
    public boolean mo10648D() {
        int i = this.f7365r;
        if (i <= 0) {
            return false;
        }
        setCurrentItem(i - 1, true);
        return true;
    }

    /* renamed from: E */
    public boolean mo10649E() {
        al4 al4 = this.f7360k;
        if (al4 == null || this.f7365r >= al4.mo370e() - 1) {
            return false;
        }
        setCurrentItem(this.f7365r + 1, true);
        return true;
    }

    /* renamed from: F */
    public final boolean mo10650F(int i) {
        if (this.f7355d.size() != 0) {
            C1478f v = mo10728v();
            int clientWidth = getClientWidth();
            int i2 = this.f7332H;
            int i3 = clientWidth + i2;
            float f = (float) clientWidth;
            int i4 = v.f7392b;
            float f2 = ((((float) i) / f) - v.f7395e) / (v.f7394d + (((float) i2) / f));
            this.f7336J1 = false;
            mo10646B(i4, f2, (int) (((float) i3) * f2));
            if (this.f7336J1) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.f7333H1) {
            return false;
        } else {
            this.f7336J1 = false;
            mo10646B(0, Utils.FLOAT_EPSILON, 0);
            if (this.f7336J1) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    /* renamed from: G */
    public final boolean mo10651G(float f) {
        boolean z;
        boolean z2;
        float f2 = this.f7369t1 - f;
        this.f7369t1 = f;
        float scrollX = ((float) getScrollX()) + f2;
        float clientWidth = (float) getClientWidth();
        float f3 = this.f7344P * clientWidth;
        float f4 = this.f7346Q * clientWidth;
        boolean z3 = false;
        C1478f fVar = this.f7355d.get(0);
        ArrayList<C1478f> arrayList = this.f7355d;
        C1478f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.f7392b != 0) {
            f3 = fVar.f7395e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (fVar2.f7392b != this.f7360k.mo370e() - 1) {
            f4 = fVar2.f7395e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.f7330F1.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.f7331G1.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.f7369t1 += scrollX - ((float) i);
        scrollTo(i, getScrollY());
        mo10650F(i);
        return z3;
    }

    /* renamed from: H */
    public void mo10652H() {
        mo10653I(this.f7365r);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r9 == r10) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        r8 = null;
     */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10653I(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.f7365r
            if (r2 == r1) goto L_0x000f
            androidx.viewpager.widget.ViewPager$f r2 = r0.mo10730w(r2)
            r0.f7365r = r1
            goto L_0x0010
        L_0x000f:
            r2 = 0
        L_0x0010:
            al4 r1 = r0.f7360k
            if (r1 != 0) goto L_0x0018
            r17.mo10665U()
            return
        L_0x0018:
            boolean r1 = r0.f7354b1
            if (r1 == 0) goto L_0x0020
            r17.mo10665U()
            return
        L_0x0020:
            android.os.IBinder r1 = r17.getWindowToken()
            if (r1 != 0) goto L_0x0027
            return
        L_0x0027:
            al4 r1 = r0.f7360k
            r1.mo384s(r0)
            int r1 = r0.f7358e1
            int r4 = r0.f7365r
            int r4 = r4 - r1
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            al4 r6 = r0.f7360k
            int r6 = r6.mo370e()
            int r7 = r6 + -1
            int r8 = r0.f7365r
            int r8 = r8 + r1
            int r1 = java.lang.Math.min(r7, r8)
            int r7 = r0.f7353a
            if (r6 != r7) goto L_0x020e
            r7 = r5
        L_0x004a:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r8 = r0.f7355d
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x0066
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r8 = r0.f7355d
            java.lang.Object r8 = r8.get(r7)
            androidx.viewpager.widget.ViewPager$f r8 = (androidx.viewpager.widget.ViewPager.C1478f) r8
            int r9 = r8.f7392b
            int r10 = r0.f7365r
            if (r9 < r10) goto L_0x0063
            if (r9 != r10) goto L_0x0066
            goto L_0x0067
        L_0x0063:
            int r7 = r7 + 1
            goto L_0x004a
        L_0x0066:
            r8 = 0
        L_0x0067:
            if (r8 != 0) goto L_0x0071
            if (r6 <= 0) goto L_0x0071
            int r8 = r0.f7365r
            androidx.viewpager.widget.ViewPager$f r8 = r0.mo10666a(r8, r7)
        L_0x0071:
            r9 = 0
            if (r8 == 0) goto L_0x019b
            int r10 = r7 + -1
            if (r10 < 0) goto L_0x0081
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r11 = r0.f7355d
            java.lang.Object r11 = r11.get(r10)
            androidx.viewpager.widget.ViewPager$f r11 = (androidx.viewpager.widget.ViewPager.C1478f) r11
            goto L_0x0082
        L_0x0081:
            r11 = 0
        L_0x0082:
            int r12 = r17.getClientWidth()
            r13 = 1073741824(0x40000000, float:2.0)
            if (r12 > 0) goto L_0x008c
            r14 = r9
            goto L_0x0098
        L_0x008c:
            float r14 = r8.f7394d
            float r14 = r13 - r14
            int r15 = r17.getPaddingLeft()
            float r15 = (float) r15
            float r3 = (float) r12
            float r15 = r15 / r3
            float r14 = r14 + r15
        L_0x0098:
            int r3 = r0.f7365r
            int r3 = r3 + -1
            r15 = r9
        L_0x009d:
            if (r3 < 0) goto L_0x00fd
            int r16 = (r15 > r14 ? 1 : (r15 == r14 ? 0 : -1))
            if (r16 < 0) goto L_0x00cb
            if (r3 >= r4) goto L_0x00cb
            if (r11 != 0) goto L_0x00a8
            goto L_0x00fd
        L_0x00a8:
            int r5 = r11.f7392b
            if (r3 != r5) goto L_0x00f9
            boolean r5 = r11.f7393c
            if (r5 != 0) goto L_0x00f9
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f7355d
            r5.remove(r10)
            al4 r5 = r0.f7360k
            java.lang.Object r11 = r11.f7391a
            r5.mo367b(r0, r3, r11)
            int r10 = r10 + -1
            int r7 = r7 + -1
            if (r10 < 0) goto L_0x00f7
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f7355d
            java.lang.Object r5 = r5.get(r10)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C1478f) r5
            goto L_0x00f8
        L_0x00cb:
            if (r11 == 0) goto L_0x00e1
            int r5 = r11.f7392b
            if (r3 != r5) goto L_0x00e1
            float r5 = r11.f7394d
            float r15 = r15 + r5
            int r10 = r10 + -1
            if (r10 < 0) goto L_0x00f7
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f7355d
            java.lang.Object r5 = r5.get(r10)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C1478f) r5
            goto L_0x00f8
        L_0x00e1:
            int r5 = r10 + 1
            androidx.viewpager.widget.ViewPager$f r5 = r0.mo10666a(r3, r5)
            float r5 = r5.f7394d
            float r15 = r15 + r5
            int r7 = r7 + 1
            if (r10 < 0) goto L_0x00f7
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f7355d
            java.lang.Object r5 = r5.get(r10)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C1478f) r5
            goto L_0x00f8
        L_0x00f7:
            r5 = 0
        L_0x00f8:
            r11 = r5
        L_0x00f9:
            int r3 = r3 + -1
            r5 = 0
            goto L_0x009d
        L_0x00fd:
            float r3 = r8.f7394d
            int r4 = r7 + 1
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x018f
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f7355d
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0116
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f7355d
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C1478f) r5
            goto L_0x0117
        L_0x0116:
            r5 = 0
        L_0x0117:
            if (r12 > 0) goto L_0x011b
            r10 = r9
            goto L_0x0123
        L_0x011b:
            int r10 = r17.getPaddingRight()
            float r10 = (float) r10
            float r11 = (float) r12
            float r10 = r10 / r11
            float r10 = r10 + r13
        L_0x0123:
            int r11 = r0.f7365r
        L_0x0125:
            int r11 = r11 + 1
            if (r11 >= r6) goto L_0x018f
            int r12 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r12 < 0) goto L_0x0159
            if (r11 <= r1) goto L_0x0159
            if (r5 != 0) goto L_0x0132
            goto L_0x018f
        L_0x0132:
            int r12 = r5.f7392b
            if (r11 != r12) goto L_0x018e
            boolean r12 = r5.f7393c
            if (r12 != 0) goto L_0x018e
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r12 = r0.f7355d
            r12.remove(r4)
            al4 r12 = r0.f7360k
            java.lang.Object r5 = r5.f7391a
            r12.mo367b(r0, r11, r5)
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f7355d
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0157
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f7355d
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C1478f) r5
            goto L_0x018e
        L_0x0157:
            r5 = 0
            goto L_0x018e
        L_0x0159:
            if (r5 == 0) goto L_0x0175
            int r12 = r5.f7392b
            if (r11 != r12) goto L_0x0175
            float r5 = r5.f7394d
            float r3 = r3 + r5
            int r4 = r4 + 1
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f7355d
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0157
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f7355d
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C1478f) r5
            goto L_0x018e
        L_0x0175:
            androidx.viewpager.widget.ViewPager$f r5 = r0.mo10666a(r11, r4)
            int r4 = r4 + 1
            float r5 = r5.f7394d
            float r3 = r3 + r5
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f7355d
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0157
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f7355d
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C1478f) r5
        L_0x018e:
            goto L_0x0125
        L_0x018f:
            r0.mo10681f(r8, r7, r2)
            al4 r1 = r0.f7360k
            int r2 = r0.f7365r
            java.lang.Object r3 = r8.f7391a
            r1.mo381p(r0, r2, r3)
        L_0x019b:
            al4 r1 = r0.f7360k
            r1.mo369d(r0)
            int r1 = r17.getChildCount()
            r2 = 0
        L_0x01a5:
            if (r2 >= r1) goto L_0x01ce
            android.view.View r3 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r4 = (androidx.viewpager.widget.ViewPager.LayoutParams) r4
            r4.f7384f = r2
            boolean r5 = r4.f7379a
            if (r5 != 0) goto L_0x01cb
            float r5 = r4.f7381c
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x01cb
            androidx.viewpager.widget.ViewPager$f r3 = r0.mo10727u(r3)
            if (r3 == 0) goto L_0x01cb
            float r5 = r3.f7394d
            r4.f7381c = r5
            int r3 = r3.f7392b
            r4.f7383e = r3
        L_0x01cb:
            int r2 = r2 + 1
            goto L_0x01a5
        L_0x01ce:
            r17.mo10665U()
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x020d
            android.view.View r1 = r17.findFocus()
            if (r1 == 0) goto L_0x01e2
            androidx.viewpager.widget.ViewPager$f r3 = r0.mo10726t(r1)
            goto L_0x01e3
        L_0x01e2:
            r3 = 0
        L_0x01e3:
            if (r3 == 0) goto L_0x01eb
            int r1 = r3.f7392b
            int r2 = r0.f7365r
            if (r1 == r2) goto L_0x020d
        L_0x01eb:
            r5 = 0
        L_0x01ec:
            int r1 = r17.getChildCount()
            if (r5 >= r1) goto L_0x020d
            android.view.View r1 = r0.getChildAt(r5)
            androidx.viewpager.widget.ViewPager$f r2 = r0.mo10727u(r1)
            if (r2 == 0) goto L_0x020a
            int r2 = r2.f7392b
            int r3 = r0.f7365r
            if (r2 != r3) goto L_0x020a
            r2 = 2
            boolean r1 = r1.requestFocus(r2)
            if (r1 == 0) goto L_0x020a
            goto L_0x020d
        L_0x020a:
            int r5 = r5 + 1
            goto L_0x01ec
        L_0x020d:
            return
        L_0x020e:
            android.content.res.Resources r1 = r17.getResources()     // Catch:{ NotFoundException -> 0x021b }
            int r2 = r17.getId()     // Catch:{ NotFoundException -> 0x021b }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x021b }
            goto L_0x0223
        L_0x021b:
            int r1 = r17.getId()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
        L_0x0223:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r3.append(r4)
            int r4 = r0.f7353a
            r3.append(r4)
            java.lang.String r4 = ", found: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = " Pager id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " Pager class: "
            r3.append(r1)
            java.lang.Class r1 = r17.getClass()
            r3.append(r1)
            java.lang.String r1 = " Problematic adapter: "
            r3.append(r1)
            al4 r1 = r0.f7360k
            java.lang.Class r1 = r1.getClass()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.mo10653I(int):void");
    }

    /* renamed from: J */
    public final void mo10654J(int i, int i2, int i3, int i4) {
        float f;
        if (i2 <= 0 || this.f7355d.isEmpty()) {
            C1478f w = mo10730w(this.f7365r);
            if (w != null) {
                f = Math.min(w.f7395e, this.f7346Q);
            } else {
                f = Utils.FLOAT_EPSILON;
            }
            int paddingLeft = (int) (f * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (paddingLeft != getScrollX()) {
                mo10691h(false);
                scrollTo(paddingLeft, getScrollY());
            }
        } else if (!this.f7322A.isFinished()) {
            this.f7322A.setFinalX(getCurrentItem() * getClientWidth());
        } else {
            scrollTo((int) ((((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))) * ((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3))), getScrollY());
        }
    }

    /* renamed from: K */
    public final void mo10655K() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((LayoutParams) getChildAt(i).getLayoutParams()).f7379a) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    /* renamed from: L */
    public void mo10656L(C1480h hVar) {
        List<C1480h> list = this.f7343O1;
        if (list != null) {
            list.remove(hVar);
        }
    }

    /* renamed from: M */
    public void mo10657M(C1481i iVar) {
        List<C1481i> list = this.f7339L1;
        if (list != null) {
            list.remove(iVar);
        }
    }

    /* renamed from: N */
    public final void mo10658N(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* renamed from: O */
    public final boolean mo10659O() {
        this.f7375x1 = -1;
        mo10710p();
        this.f7330F1.onRelease();
        this.f7331G1.onRelease();
        if (this.f7330F1.isFinished() || this.f7331G1.isFinished()) {
            return true;
        }
        return false;
    }

    /* renamed from: P */
    public final void mo10660P(int i, boolean z, int i2, boolean z2) {
        int i3;
        C1478f w = mo10730w(i);
        if (w != null) {
            i3 = (int) (((float) getClientWidth()) * Math.max(this.f7344P, Math.min(w.f7395e, this.f7346Q)));
        } else {
            i3 = 0;
        }
        if (z) {
            mo10664T(i3, 0, i2);
            if (z2) {
                mo10695l(i);
                return;
            }
            return;
        }
        if (z2) {
            mo10695l(i);
        }
        mo10691h(false);
        scrollTo(i3, 0);
        mo10650F(i3);
    }

    /* renamed from: Q */
    public void mo10661Q(int i, boolean z, boolean z2) {
        mo10662R(i, z, z2, 0);
    }

    /* renamed from: R */
    public void mo10662R(int i, boolean z, boolean z2, int i2) {
        al4 al4 = this.f7360k;
        boolean z3 = false;
        if (al4 == null || al4.mo370e() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.f7365r != i || this.f7355d.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.f7360k.mo370e()) {
                i = this.f7360k.mo370e() - 1;
            }
            int i3 = this.f7358e1;
            int i4 = this.f7365r;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.f7355d.size(); i5++) {
                    this.f7355d.get(i5).f7393c = true;
                }
            }
            if (this.f7365r != i) {
                z3 = true;
            }
            if (this.f7333H1) {
                this.f7365r = i;
                if (z3) {
                    mo10695l(i);
                }
                requestLayout();
                return;
            }
            mo10653I(i);
            mo10660P(i, z, i2, z3);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    /* renamed from: S */
    public C1481i mo10663S(C1481i iVar) {
        C1481i iVar2 = this.f7342N1;
        this.f7342N1 = iVar;
        return iVar2;
    }

    /* renamed from: T */
    public void mo10664T(int i, int i2, int i3) {
        boolean z;
        int i4;
        int i5;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f7322A;
        if (scroller == null || scroller.isFinished()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (this.f7324B) {
                i4 = this.f7322A.getCurrX();
            } else {
                i4 = this.f7322A.getStartX();
            }
            this.f7322A.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            i4 = getScrollX();
        }
        int i6 = i4;
        int scrollY = getScrollY();
        int i7 = i - i6;
        int i8 = i2 - scrollY;
        if (i7 == 0 && i8 == 0) {
            mo10691h(false);
            mo10652H();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i9 = clientWidth / 2;
        float f = (float) clientWidth;
        float f2 = (float) i9;
        float n = f2 + (mo10697n(Math.min(1.0f, (((float) Math.abs(i7)) * 1.0f) / f)) * f2);
        int abs = Math.abs(i3);
        if (abs > 0) {
            i5 = Math.round(Math.abs(n / ((float) abs)) * 1000.0f) * 4;
        } else {
            i5 = (int) (((((float) Math.abs(i7)) / ((f * this.f7360k.mo373h(this.f7365r)) + ((float) this.f7332H))) + 1.0f) * 100.0f);
        }
        int min = Math.min(i5, 600);
        this.f7324B = false;
        this.f7322A.startScroll(i6, scrollY, i7, i8, min);
        ga7.m17767g0(this);
    }

    /* renamed from: U */
    public final void mo10665U() {
        if (this.f7348R1 != 0) {
            ArrayList<View> arrayList = this.f7349S1;
            if (arrayList == null) {
                this.f7349S1 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f7349S1.add(getChildAt(i));
            }
            Collections.sort(this.f7349S1, f7321Y1);
        }
    }

    /* renamed from: a */
    public C1478f mo10666a(int i, int i2) {
        C1478f fVar = new C1478f();
        fVar.f7392b = i;
        fVar.f7391a = this.f7360k.mo375j(this, i);
        fVar.f7394d = this.f7360k.mo373h(i);
        if (i2 < 0 || i2 >= this.f7355d.size()) {
            this.f7355d.add(fVar);
        } else {
            this.f7355d.add(i2, fVar);
        }
        return fVar;
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C1478f u;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (u = mo10727u(childAt)) != null && u.f7392b == this.f7365r) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList<View> arrayList) {
        C1478f u;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (u = mo10727u(childAt)) != null && u.f7392b == this.f7365r) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean y = layoutParams2.f7379a | m10235y(view);
        layoutParams2.f7379a = y;
        if (!this.f7361k0) {
            super.addView(view, i, layoutParams);
        } else if (!y) {
            layoutParams2.f7382d = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    /* renamed from: b */
    public void mo10670b(C1480h hVar) {
        if (this.f7343O1 == null) {
            this.f7343O1 = new ArrayList();
        }
        this.f7343O1.add(hVar);
    }

    /* renamed from: c */
    public void mo10671c(C1481i iVar) {
        if (this.f7339L1 == null) {
            this.f7339L1 = new ArrayList();
        }
        this.f7339L1.add(iVar);
    }

    public boolean canScrollHorizontally(int i) {
        if (this.f7360k == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX > ((int) (((float) clientWidth) * this.f7344P))) {
                return true;
            }
            return false;
        } else if (i <= 0 || scrollX >= ((int) (((float) clientWidth) * this.f7346Q))) {
            return false;
        } else {
            return true;
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof LayoutParams) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    public void computeScroll() {
        this.f7324B = true;
        if (this.f7322A.isFinished() || !this.f7322A.computeScrollOffset()) {
            mo10691h(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f7322A.getCurrX();
        int currY = this.f7322A.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!mo10650F(currX)) {
                this.f7322A.abortAnimation();
                scrollTo(0, currY);
            }
        }
        ga7.m17767g0(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c6  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo10675d(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r6) goto L_0x000b
        L_0x0009:
            r0 = r3
            goto L_0x0060
        L_0x000b:
            if (r0 == 0) goto L_0x0060
            android.view.ViewParent r4 = r0.getParent()
        L_0x0011:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x001e
            if (r4 != r6) goto L_0x0019
            r4 = r1
            goto L_0x001f
        L_0x0019:
            android.view.ViewParent r4 = r4.getParent()
            goto L_0x0011
        L_0x001e:
            r4 = r2
        L_0x001f:
            if (r4 != 0) goto L_0x0060
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
        L_0x0035:
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x004e
            java.lang.String r5 = " => "
            r4.append(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x0035
        L_0x004e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.append(r5)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            goto L_0x0009
        L_0x0060:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto L_0x00b1
            if (r3 == r0) goto L_0x00b1
            if (r7 != r5) goto L_0x0091
            android.graphics.Rect r1 = r6.f7359g
            android.graphics.Rect r1 = r6.mo10714s(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f7359g
            android.graphics.Rect r2 = r6.mo10714s(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x008b
            if (r1 < r2) goto L_0x008b
            boolean r0 = r6.mo10648D()
            goto L_0x008f
        L_0x008b:
            boolean r0 = r3.requestFocus()
        L_0x008f:
            r2 = r0
            goto L_0x00c4
        L_0x0091:
            if (r7 != r4) goto L_0x00c4
            android.graphics.Rect r1 = r6.f7359g
            android.graphics.Rect r1 = r6.mo10714s(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f7359g
            android.graphics.Rect r2 = r6.mo10714s(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x00ac
            if (r1 > r2) goto L_0x00ac
            boolean r0 = r6.mo10649E()
            goto L_0x008f
        L_0x00ac:
            boolean r0 = r3.requestFocus()
            goto L_0x008f
        L_0x00b1:
            if (r7 == r5) goto L_0x00c0
            if (r7 != r1) goto L_0x00b6
            goto L_0x00c0
        L_0x00b6:
            if (r7 == r4) goto L_0x00bb
            r0 = 2
            if (r7 != r0) goto L_0x00c4
        L_0x00bb:
            boolean r2 = r6.mo10649E()
            goto L_0x00c4
        L_0x00c0:
            boolean r2 = r6.mo10648D()
        L_0x00c4:
            if (r2 == 0) goto L_0x00cd
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        L_0x00cd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.mo10675d(int):boolean");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent) || mo10712r(keyEvent)) {
            return true;
        }
        return false;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C1478f u;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (u = mo10727u(childAt)) != null && u.f7392b == this.f7365r && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        al4 al4;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (al4 = this.f7360k) != null && al4.mo370e() > 1)) {
            if (!this.f7330F1.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.f7344P * ((float) width));
                this.f7330F1.setSize(height, width);
                z = false | this.f7330F1.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f7331G1.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.f7346Q + 1.0f)) * ((float) width2));
                this.f7331G1.setSize(height2, width2);
                z |= this.f7331G1.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.f7330F1.finish();
            this.f7331G1.finish();
        }
        if (z) {
            ga7.m17767g0(this);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f7334I;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* renamed from: e */
    public boolean mo10680e() {
        if (this.f7362o1) {
            return false;
        }
        this.f7328D1 = true;
        setScrollState(1);
        this.f7369t1 = Utils.FLOAT_EPSILON;
        this.f7372v1 = Utils.FLOAT_EPSILON;
        VelocityTracker velocityTracker = this.f7377y1;
        if (velocityTracker == null) {
            this.f7377y1 = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 0);
        this.f7377y1.addMovement(obtain);
        obtain.recycle();
        this.f7329E1 = uptimeMillis;
        return true;
    }

    /* renamed from: f */
    public final void mo10681f(C1478f fVar, int i, C1478f fVar2) {
        float f;
        float f2;
        float f3;
        int i2;
        int i3;
        C1478f fVar3;
        C1478f fVar4;
        int e = this.f7360k.mo370e();
        int clientWidth = getClientWidth();
        if (clientWidth > 0) {
            f = ((float) this.f7332H) / ((float) clientWidth);
        } else {
            f = Utils.FLOAT_EPSILON;
        }
        if (fVar2 != null) {
            int i4 = fVar2.f7392b;
            int i5 = fVar.f7392b;
            if (i4 < i5) {
                float f4 = fVar2.f7395e + fVar2.f7394d + f;
                int i6 = i4 + 1;
                int i7 = 0;
                while (i6 <= fVar.f7392b && i7 < this.f7355d.size()) {
                    Object obj = this.f7355d.get(i7);
                    while (true) {
                        fVar4 = (C1478f) obj;
                        if (i6 > fVar4.f7392b && i7 < this.f7355d.size() - 1) {
                            i7++;
                            obj = this.f7355d.get(i7);
                        }
                    }
                    while (i6 < fVar4.f7392b) {
                        f4 += this.f7360k.mo373h(i6) + f;
                        i6++;
                    }
                    fVar4.f7395e = f4;
                    f4 += fVar4.f7394d + f;
                    i6++;
                }
            } else if (i4 > i5) {
                int size = this.f7355d.size() - 1;
                float f5 = fVar2.f7395e;
                while (true) {
                    i4--;
                    if (i4 < fVar.f7392b || size < 0) {
                        break;
                    }
                    Object obj2 = this.f7355d.get(size);
                    while (true) {
                        fVar3 = (C1478f) obj2;
                        if (i4 < fVar3.f7392b && size > 0) {
                            size--;
                            obj2 = this.f7355d.get(size);
                        }
                    }
                    while (i4 > fVar3.f7392b) {
                        f5 -= this.f7360k.mo373h(i4) + f;
                        i4--;
                    }
                    f5 -= fVar3.f7394d + f;
                    fVar3.f7395e = f5;
                }
            }
        }
        int size2 = this.f7355d.size();
        float f6 = fVar.f7395e;
        int i8 = fVar.f7392b;
        int i9 = i8 - 1;
        if (i8 == 0) {
            f2 = f6;
        } else {
            f2 = -3.4028235E38f;
        }
        this.f7344P = f2;
        int i10 = e - 1;
        if (i8 == i10) {
            f3 = (fVar.f7394d + f6) - 1.0f;
        } else {
            f3 = Float.MAX_VALUE;
        }
        this.f7346Q = f3;
        int i11 = i - 1;
        while (i11 >= 0) {
            C1478f fVar5 = this.f7355d.get(i11);
            while (true) {
                i3 = fVar5.f7392b;
                if (i9 <= i3) {
                    break;
                }
                f6 -= this.f7360k.mo373h(i9) + f;
                i9--;
            }
            f6 -= fVar5.f7394d + f;
            fVar5.f7395e = f6;
            if (i3 == 0) {
                this.f7344P = f6;
            }
            i11--;
            i9--;
        }
        float f7 = fVar.f7395e + fVar.f7394d + f;
        int i12 = fVar.f7392b + 1;
        int i13 = i + 1;
        while (i13 < size2) {
            C1478f fVar6 = this.f7355d.get(i13);
            while (true) {
                i2 = fVar6.f7392b;
                if (i12 >= i2) {
                    break;
                }
                f7 += this.f7360k.mo373h(i12) + f;
                i12++;
            }
            if (i2 == i10) {
                this.f7346Q = (fVar6.f7394d + f7) - 1.0f;
            }
            fVar6.f7395e = f7;
            f7 += fVar6.f7394d + f;
            i13++;
            i12++;
        }
        this.f7335I1 = false;
    }

    /* renamed from: g */
    public boolean mo10682g(View view, boolean z, int i, int i2, int i3) {
        int i4;
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom()) {
                    if (mo10682g(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        if (!z || !view.canScrollHorizontally(-i)) {
            return false;
        }
        return true;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public al4 getAdapter() {
        return this.f7360k;
    }

    public int getChildDrawingOrder(int i, int i2) {
        if (this.f7348R1 == 2) {
            i2 = (i - 1) - i2;
        }
        return ((LayoutParams) this.f7349S1.get(i2).getLayoutParams()).f7384f;
    }

    public int getCurrentItem() {
        return this.f7365r;
    }

    public int getOffscreenPageLimit() {
        return this.f7358e1;
    }

    public int getPageMargin() {
        return this.f7332H;
    }

    /* renamed from: h */
    public final void mo10691h(boolean z) {
        boolean z2;
        if (this.f7352U1 == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f7322A.isFinished()) {
                this.f7322A.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f7322A.getCurrX();
                int currY = this.f7322A.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        mo10650F(currX);
                    }
                }
            }
        }
        this.f7354b1 = false;
        for (int i = 0; i < this.f7355d.size(); i++) {
            C1478f fVar = this.f7355d.get(i);
            if (fVar.f7393c) {
                fVar.f7393c = false;
                z2 = true;
            }
        }
        if (!z2) {
            return;
        }
        if (z) {
            ga7.m17769h0(this, this.f7350T1);
        } else {
            this.f7350T1.run();
        }
    }

    /* renamed from: i */
    public void mo10692i() {
        boolean z;
        int e = this.f7360k.mo370e();
        this.f7353a = e;
        if (this.f7355d.size() >= (this.f7358e1 * 2) + 1 || this.f7355d.size() >= e) {
            z = false;
        } else {
            z = true;
        }
        int i = this.f7365r;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.f7355d.size()) {
            C1478f fVar = this.f7355d.get(i2);
            int f = this.f7360k.mo371f(fVar.f7391a);
            if (f != -1) {
                if (f == -2) {
                    this.f7355d.remove(i2);
                    i2--;
                    if (!z2) {
                        this.f7360k.mo384s(this);
                        z2 = true;
                    }
                    this.f7360k.mo367b(this, fVar.f7392b, fVar.f7391a);
                    int i3 = this.f7365r;
                    if (i3 == fVar.f7392b) {
                        i = Math.max(0, Math.min(i3, e - 1));
                    }
                } else {
                    int i4 = fVar.f7392b;
                    if (i4 != f) {
                        if (i4 == this.f7365r) {
                            i = f;
                        }
                        fVar.f7392b = f;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.f7360k.mo369d(this);
        }
        Collections.sort(this.f7355d, f7319W1);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i5).getLayoutParams();
                if (!layoutParams.f7379a) {
                    layoutParams.f7381c = Utils.FLOAT_EPSILON;
                }
            }
            mo10661Q(i, false, true);
            requestLayout();
        }
    }

    /* renamed from: j */
    public final int mo10693j(int i, float f, int i2, int i3) {
        float f2;
        if (Math.abs(i3) <= this.f7325B1 || Math.abs(i2) <= this.f7378z1) {
            if (i >= this.f7365r) {
                f2 = 0.4f;
            } else {
                f2 = 0.6f;
            }
            i += (int) (f + f2);
        } else if (i2 <= 0) {
            i++;
        }
        if (this.f7355d.size() <= 0) {
            return i;
        }
        ArrayList<C1478f> arrayList = this.f7355d;
        return Math.max(this.f7355d.get(0).f7392b, Math.min(i, arrayList.get(arrayList.size() - 1).f7392b));
    }

    /* renamed from: k */
    public final void mo10694k(int i, float f, int i2) {
        C1481i iVar = this.f7341M1;
        if (iVar != null) {
            iVar.mo10640c(i, f, i2);
        }
        List<C1481i> list = this.f7339L1;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C1481i iVar2 = this.f7339L1.get(i3);
                if (iVar2 != null) {
                    iVar2.mo10640c(i, f, i2);
                }
            }
        }
        C1481i iVar3 = this.f7342N1;
        if (iVar3 != null) {
            iVar3.mo10640c(i, f, i2);
        }
    }

    /* renamed from: l */
    public final void mo10695l(int i) {
        C1481i iVar = this.f7341M1;
        if (iVar != null) {
            iVar.mo10642e(i);
        }
        List<C1481i> list = this.f7339L1;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1481i iVar2 = this.f7339L1.get(i2);
                if (iVar2 != null) {
                    iVar2.mo10642e(i);
                }
            }
        }
        C1481i iVar3 = this.f7342N1;
        if (iVar3 != null) {
            iVar3.mo10642e(i);
        }
    }

    /* renamed from: m */
    public final void mo10696m(int i) {
        C1481i iVar = this.f7341M1;
        if (iVar != null) {
            iVar.mo10641d(i);
        }
        List<C1481i> list = this.f7339L1;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1481i iVar2 = this.f7339L1.get(i2);
                if (iVar2 != null) {
                    iVar2.mo10641d(i);
                }
            }
        }
        C1481i iVar3 = this.f7342N1;
        if (iVar3 != null) {
            iVar3.mo10641d(i);
        }
    }

    /* renamed from: n */
    public float mo10697n(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* renamed from: o */
    public final void mo10698o(boolean z) {
        int i;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (z) {
                i = this.f7347Q1;
            } else {
                i = 0;
            }
            getChildAt(i2).setLayerType(i, (Paint) null);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f7333H1 = true;
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.f7350T1);
        Scroller scroller = this.f7322A;
        if (scroller != null && !scroller.isFinished()) {
            this.f7322A.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r18) {
        /*
            r17 = this;
            r0 = r17
            super.onDraw(r18)
            int r1 = r0.f7332H
            if (r1 <= 0) goto L_0x00a8
            android.graphics.drawable.Drawable r1 = r0.f7334I
            if (r1 == 0) goto L_0x00a8
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r1 = r0.f7355d
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x00a8
            al4 r1 = r0.f7360k
            if (r1 == 0) goto L_0x00a8
            int r1 = r17.getScrollX()
            int r2 = r17.getWidth()
            int r3 = r0.f7332H
            float r3 = (float) r3
            float r4 = (float) r2
            float r3 = r3 / r4
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f7355d
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C1478f) r5
            float r7 = r5.f7395e
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r8 = r0.f7355d
            int r8 = r8.size()
            int r9 = r5.f7392b
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r10 = r0.f7355d
            int r11 = r8 + -1
            java.lang.Object r10 = r10.get(r11)
            androidx.viewpager.widget.ViewPager$f r10 = (androidx.viewpager.widget.ViewPager.C1478f) r10
            int r10 = r10.f7392b
        L_0x0045:
            if (r9 >= r10) goto L_0x00a8
        L_0x0047:
            int r11 = r5.f7392b
            if (r9 <= r11) goto L_0x0058
            if (r6 >= r8) goto L_0x0058
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f7355d
            int r6 = r6 + 1
            java.lang.Object r5 = r5.get(r6)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C1478f) r5
            goto L_0x0047
        L_0x0058:
            if (r9 != r11) goto L_0x0064
            float r7 = r5.f7395e
            float r11 = r5.f7394d
            float r12 = r7 + r11
            float r12 = r12 * r4
            float r7 = r7 + r11
            float r7 = r7 + r3
            goto L_0x006f
        L_0x0064:
            al4 r11 = r0.f7360k
            float r11 = r11.mo373h(r9)
            float r12 = r7 + r11
            float r12 = r12 * r4
            float r11 = r11 + r3
            float r7 = r7 + r11
        L_0x006f:
            int r11 = r0.f7332H
            float r11 = (float) r11
            float r11 = r11 + r12
            float r13 = (float) r1
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 <= 0) goto L_0x0097
            android.graphics.drawable.Drawable r11 = r0.f7334I
            int r13 = java.lang.Math.round(r12)
            int r14 = r0.f7338L
            int r15 = r0.f7332H
            float r15 = (float) r15
            float r15 = r15 + r12
            int r15 = java.lang.Math.round(r15)
            r16 = r3
            int r3 = r0.f7340M
            r11.setBounds(r13, r14, r15, r3)
            android.graphics.drawable.Drawable r3 = r0.f7334I
            r11 = r18
            r3.draw(r11)
            goto L_0x009b
        L_0x0097:
            r11 = r18
            r16 = r3
        L_0x009b:
            int r3 = r1 + r2
            float r3 = (float) r3
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x00a3
            goto L_0x00a8
        L_0x00a3:
            int r9 = r9 + 1
            r3 = r16
            goto L_0x0045
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onDraw(android.graphics.Canvas):void");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            mo10659O();
            return false;
        }
        if (action != 0) {
            if (this.f7362o1) {
                return true;
            }
            if (this.f7363p1) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f7372v1 = x;
            this.f7369t1 = x;
            float y = motionEvent.getY();
            this.f7373w1 = y;
            this.f7370u1 = y;
            this.f7375x1 = motionEvent2.getPointerId(0);
            this.f7363p1 = false;
            this.f7324B = true;
            this.f7322A.computeScrollOffset();
            if (this.f7352U1 != 2 || Math.abs(this.f7322A.getFinalX() - this.f7322A.getCurrX()) <= this.f7327C1) {
                mo10691h(false);
                this.f7362o1 = false;
            } else {
                this.f7322A.abortAnimation();
                this.f7354b1 = false;
                mo10652H();
                this.f7362o1 = true;
                mo10658N(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.f7375x1;
            if (i != -1) {
                int findPointerIndex = motionEvent2.findPointerIndex(i);
                float x2 = motionEvent2.getX(findPointerIndex);
                float f2 = x2 - this.f7369t1;
                float abs = Math.abs(f2);
                float y2 = motionEvent2.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.f7373w1);
                int i2 = (f2 > Utils.FLOAT_EPSILON ? 1 : (f2 == Utils.FLOAT_EPSILON ? 0 : -1));
                if (i2 != 0 && !mo10645A(this.f7369t1, f2)) {
                    if (mo10682g(this, false, (int) f2, (int) x2, (int) y2)) {
                        this.f7369t1 = x2;
                        this.f7370u1 = y2;
                        this.f7363p1 = true;
                        return false;
                    }
                }
                int i3 = this.f7368s1;
                if (abs > ((float) i3) && abs * 0.5f > abs2) {
                    this.f7362o1 = true;
                    mo10658N(true);
                    setScrollState(1);
                    float f3 = this.f7372v1;
                    float f4 = (float) this.f7368s1;
                    if (i2 > 0) {
                        f = f3 + f4;
                    } else {
                        f = f3 - f4;
                    }
                    this.f7369t1 = f;
                    this.f7370u1 = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > ((float) i3)) {
                    this.f7363p1 = true;
                }
                if (this.f7362o1 && mo10651G(x2)) {
                    ga7.m17767g0(this);
                }
            }
        } else if (action == 6) {
            mo10647C(motionEvent);
        }
        if (this.f7377y1 == null) {
            this.f7377y1 = VelocityTracker.obtain();
        }
        this.f7377y1.addMovement(motionEvent2);
        return this.f7362o1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r18.getChildCount()
            int r2 = r22 - r20
            int r3 = r23 - r21
            int r4 = r18.getPaddingLeft()
            int r5 = r18.getPaddingTop()
            int r6 = r18.getPaddingRight()
            int r7 = r18.getPaddingBottom()
            int r8 = r18.getScrollX()
            r10 = 0
            r11 = 0
        L_0x0020:
            r12 = 8
            if (r10 >= r1) goto L_0x00b6
            android.view.View r13 = r0.getChildAt(r10)
            int r14 = r13.getVisibility()
            if (r14 == r12) goto L_0x00b2
            android.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r12 = (androidx.viewpager.widget.ViewPager.LayoutParams) r12
            boolean r14 = r12.f7379a
            if (r14 == 0) goto L_0x00b2
            int r12 = r12.f7380b
            r14 = r12 & 7
            r12 = r12 & 112(0x70, float:1.57E-43)
            r15 = 1
            if (r14 == r15) goto L_0x005c
            r15 = 3
            if (r14 == r15) goto L_0x0056
            r15 = 5
            if (r14 == r15) goto L_0x0049
            r14 = r4
            goto L_0x006d
        L_0x0049:
            int r14 = r2 - r6
            int r15 = r13.getMeasuredWidth()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredWidth()
            int r6 = r6 + r15
            goto L_0x0068
        L_0x0056:
            int r14 = r13.getMeasuredWidth()
            int r14 = r14 + r4
            goto L_0x006d
        L_0x005c:
            int r14 = r13.getMeasuredWidth()
            int r14 = r2 - r14
            int r14 = r14 / 2
            int r14 = java.lang.Math.max(r14, r4)
        L_0x0068:
            r17 = r14
            r14 = r4
            r4 = r17
        L_0x006d:
            r15 = 16
            if (r12 == r15) goto L_0x008e
            r15 = 48
            if (r12 == r15) goto L_0x0088
            r15 = 80
            if (r12 == r15) goto L_0x007b
            r12 = r5
            goto L_0x009f
        L_0x007b:
            int r12 = r3 - r7
            int r15 = r13.getMeasuredHeight()
            int r12 = r12 - r15
            int r15 = r13.getMeasuredHeight()
            int r7 = r7 + r15
            goto L_0x009a
        L_0x0088:
            int r12 = r13.getMeasuredHeight()
            int r12 = r12 + r5
            goto L_0x009f
        L_0x008e:
            int r12 = r13.getMeasuredHeight()
            int r12 = r3 - r12
            int r12 = r12 / 2
            int r12 = java.lang.Math.max(r12, r5)
        L_0x009a:
            r17 = r12
            r12 = r5
            r5 = r17
        L_0x009f:
            int r4 = r4 + r8
            int r15 = r13.getMeasuredWidth()
            int r15 = r15 + r4
            int r16 = r13.getMeasuredHeight()
            int r9 = r5 + r16
            r13.layout(r4, r5, r15, r9)
            int r11 = r11 + 1
            r5 = r12
            r4 = r14
        L_0x00b2:
            int r10 = r10 + 1
            goto L_0x0020
        L_0x00b6:
            int r2 = r2 - r4
            int r2 = r2 - r6
            r6 = 0
        L_0x00b9:
            if (r6 >= r1) goto L_0x0106
            android.view.View r8 = r0.getChildAt(r6)
            int r9 = r8.getVisibility()
            if (r9 == r12) goto L_0x0103
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r9 = (androidx.viewpager.widget.ViewPager.LayoutParams) r9
            boolean r10 = r9.f7379a
            if (r10 != 0) goto L_0x0103
            androidx.viewpager.widget.ViewPager$f r10 = r0.mo10727u(r8)
            if (r10 == 0) goto L_0x0103
            float r13 = (float) r2
            float r10 = r10.f7395e
            float r10 = r10 * r13
            int r10 = (int) r10
            int r10 = r10 + r4
            boolean r14 = r9.f7382d
            if (r14 == 0) goto L_0x00f6
            r14 = 0
            r9.f7382d = r14
            float r9 = r9.f7381c
            float r13 = r13 * r9
            int r9 = (int) r13
            r13 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r13)
            int r14 = r3 - r5
            int r14 = r14 - r7
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r8.measure(r9, r13)
        L_0x00f6:
            int r9 = r8.getMeasuredWidth()
            int r9 = r9 + r10
            int r13 = r8.getMeasuredHeight()
            int r13 = r13 + r5
            r8.layout(r10, r5, r9, r13)
        L_0x0103:
            int r6 = r6 + 1
            goto L_0x00b9
        L_0x0106:
            r0.f7338L = r5
            int r3 = r3 - r7
            r0.f7340M = r3
            r0.f7337K1 = r11
            boolean r1 = r0.f7333H1
            if (r1 == 0) goto L_0x0118
            int r1 = r0.f7365r
            r2 = 0
            r0.mo10660P(r1, r2, r2, r2)
            goto L_0x0119
        L_0x0118:
            r2 = 0
        L_0x0119:
            r0.f7333H1 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i, int i2) {
        LayoutParams layoutParams;
        LayoutParams layoutParams2;
        boolean z;
        int i3;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.f7366r1 = Math.min(measuredWidth / 10, this.f7364q1);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            boolean z2 = true;
            int i5 = 1073741824;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (!(childAt.getVisibility() == 8 || (layoutParams2 = (LayoutParams) childAt.getLayoutParams()) == null || !layoutParams2.f7379a)) {
                int i6 = layoutParams2.f7380b;
                int i7 = i6 & 7;
                int i8 = i6 & 112;
                if (i8 == 48 || i8 == 80) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(i7 == 3 || i7 == 5)) {
                    z2 = false;
                }
                int i9 = Integer.MIN_VALUE;
                if (z) {
                    i3 = Integer.MIN_VALUE;
                    i9 = 1073741824;
                } else if (z2) {
                    i3 = 1073741824;
                } else {
                    i3 = Integer.MIN_VALUE;
                }
                int i10 = layoutParams2.width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = paddingLeft;
                    }
                    i9 = 1073741824;
                } else {
                    i10 = paddingLeft;
                }
                int i11 = layoutParams2.height;
                if (i11 == -2) {
                    i11 = measuredHeight;
                    i5 = i3;
                } else if (i11 == -1) {
                    i11 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, i9), View.MeasureSpec.makeMeasureSpec(i11, i5));
                if (z) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z2) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i4++;
        }
        this.f7351U = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f7357e0 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f7361k0 = true;
        mo10652H();
        this.f7361k0 = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((layoutParams = (LayoutParams) childAt2.getLayoutParams()) == null || !layoutParams.f7379a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (((float) paddingLeft) * layoutParams.f7381c), 1073741824), this.f7357e0);
            }
        }
    }

    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C1478f u;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i3 = 0;
            i2 = 1;
        } else {
            i3 = childCount - 1;
            i2 = -1;
        }
        while (i3 != i4) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (u = mo10727u(childAt)) != null && u.f7392b == this.f7365r && childAt.requestFocus(i, rect)) {
                return true;
            }
            i3 += i2;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo5481a());
        al4 al4 = this.f7360k;
        if (al4 != null) {
            al4.mo378m(savedState.f7386g, savedState.f7387k);
            mo10661Q(savedState.f7385e, false, true);
            return;
        }
        this.f7367s = savedState.f7385e;
        this.f7374x = savedState.f7386g;
        this.f7376y = savedState.f7387k;
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f7385e = this.f7365r;
        al4 al4 = this.f7360k;
        if (al4 != null) {
            savedState.f7386g = al4.mo379n();
        }
        return savedState;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.f7332H;
            mo10654J(i, i3, i5, i5);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        al4 al4;
        float f;
        if (this.f7328D1) {
            return true;
        }
        boolean z = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (al4 = this.f7360k) == null || al4.mo370e() == 0) {
            return false;
        }
        if (this.f7377y1 == null) {
            this.f7377y1 = VelocityTracker.obtain();
        }
        this.f7377y1.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f7322A.abortAnimation();
            this.f7354b1 = false;
            mo10652H();
            float x = motionEvent.getX();
            this.f7372v1 = x;
            this.f7369t1 = x;
            float y = motionEvent.getY();
            this.f7373w1 = y;
            this.f7370u1 = y;
            this.f7375x1 = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.f7362o1) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f7375x1);
                    if (findPointerIndex == -1) {
                        z = mo10659O();
                    } else {
                        float x2 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x2 - this.f7369t1);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y2 - this.f7370u1);
                        if (abs > ((float) this.f7368s1) && abs > abs2) {
                            this.f7362o1 = true;
                            mo10658N(true);
                            float f2 = this.f7372v1;
                            if (x2 - f2 > Utils.FLOAT_EPSILON) {
                                f = f2 + ((float) this.f7368s1);
                            } else {
                                f = f2 - ((float) this.f7368s1);
                            }
                            this.f7369t1 = f;
                            this.f7370u1 = y2;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.f7362o1) {
                    z = false | mo10651G(motionEvent.getX(motionEvent.findPointerIndex(this.f7375x1)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.f7369t1 = motionEvent.getX(actionIndex);
                    this.f7375x1 = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    mo10647C(motionEvent);
                    this.f7369t1 = motionEvent.getX(motionEvent.findPointerIndex(this.f7375x1));
                }
            } else if (this.f7362o1) {
                mo10660P(this.f7365r, true, 0, false);
                z = mo10659O();
            }
        } else if (this.f7362o1) {
            VelocityTracker velocityTracker = this.f7377y1;
            velocityTracker.computeCurrentVelocity(1000, (float) this.f7323A1);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f7375x1);
            this.f7354b1 = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            C1478f v = mo10728v();
            float f3 = (float) clientWidth;
            mo10662R(mo10693j(v.f7392b, ((((float) scrollX) / f3) - v.f7395e) / (v.f7394d + (((float) this.f7332H) / f3)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.f7375x1)) - this.f7372v1)), true, true, xVelocity);
            z = mo10659O();
        }
        if (z) {
            ga7.m17767g0(this);
        }
        return true;
    }

    /* renamed from: p */
    public final void mo10710p() {
        this.f7362o1 = false;
        this.f7363p1 = false;
        VelocityTracker velocityTracker = this.f7377y1;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f7377y1 = null;
        }
    }

    /* renamed from: q */
    public void mo10711q() {
        if (this.f7328D1) {
            if (this.f7360k != null) {
                VelocityTracker velocityTracker = this.f7377y1;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f7323A1);
                int xVelocity = (int) velocityTracker.getXVelocity(this.f7375x1);
                this.f7354b1 = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                C1478f v = mo10728v();
                mo10662R(mo10693j(v.f7392b, ((((float) scrollX) / ((float) clientWidth)) - v.f7395e) / v.f7394d, xVelocity, (int) (this.f7369t1 - this.f7372v1)), true, true, xVelocity);
            }
            mo10710p();
            this.f7328D1 = false;
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    /* renamed from: r */
    public boolean mo10712r(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return mo10675d(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return mo10675d(1);
                        }
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    return mo10649E();
                } else {
                    return mo10675d(66);
                }
            } else if (keyEvent.hasModifiers(2)) {
                return mo10648D();
            } else {
                return mo10675d(17);
            }
        }
        return false;
    }

    public void removeView(View view) {
        if (this.f7361k0) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* renamed from: s */
    public final Rect mo10714s(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public void setAdapter(al4 al4) {
        al4 al42 = this.f7360k;
        if (al42 != null) {
            al42.mo382q((DataSetObserver) null);
            this.f7360k.mo384s(this);
            for (int i = 0; i < this.f7355d.size(); i++) {
                C1478f fVar = this.f7355d.get(i);
                this.f7360k.mo367b(this, fVar.f7392b, fVar.f7391a);
            }
            this.f7360k.mo369d(this);
            this.f7355d.clear();
            mo10655K();
            this.f7365r = 0;
            scrollTo(0, 0);
        }
        al4 al43 = this.f7360k;
        this.f7360k = al4;
        this.f7353a = 0;
        if (al4 != null) {
            if (this.f7326C == null) {
                this.f7326C = new C1483k();
            }
            this.f7360k.mo382q(this.f7326C);
            this.f7354b1 = false;
            boolean z = this.f7333H1;
            this.f7333H1 = true;
            this.f7353a = this.f7360k.mo370e();
            if (this.f7367s >= 0) {
                this.f7360k.mo378m(this.f7374x, this.f7376y);
                mo10661Q(this.f7367s, false, true);
                this.f7367s = -1;
                this.f7374x = null;
                this.f7376y = null;
            } else if (!z) {
                mo10652H();
            } else {
                requestLayout();
            }
        }
        List<C1480h> list = this.f7343O1;
        if (list != null && !list.isEmpty()) {
            int size = this.f7343O1.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f7343O1.get(i2).mo10639a(this, al43, al4);
            }
        }
    }

    public void setCurrentItem(int i) {
        this.f7354b1 = false;
        mo10661Q(i, !this.f7333H1, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Requested offscreen page limit ");
            sb.append(i);
            sb.append(" too small; defaulting to ");
            sb.append(1);
            i = 1;
        }
        if (i != this.f7358e1) {
            this.f7358e1 = i;
            mo10652H();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(C1481i iVar) {
        this.f7341M1 = iVar;
    }

    public void setPageMargin(int i) {
        int i2 = this.f7332H;
        this.f7332H = i;
        int width = getWidth();
        mo10654J(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f7334I = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageTransformer(boolean z, C1482j jVar) {
        setPageTransformer(z, jVar, 2);
    }

    public void setScrollState(int i) {
        boolean z;
        if (this.f7352U1 != i) {
            this.f7352U1 = i;
            if (this.f7345P1 != null) {
                if (i != 0) {
                    z = true;
                } else {
                    z = false;
                }
                mo10698o(z);
            }
            mo10696m(i);
        }
    }

    /* renamed from: t */
    public C1478f mo10726t(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return mo10727u(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    /* renamed from: u */
    public C1478f mo10727u(View view) {
        for (int i = 0; i < this.f7355d.size(); i++) {
            C1478f fVar = this.f7355d.get(i);
            if (this.f7360k.mo376k(view, fVar.f7391a)) {
                return fVar;
            }
        }
        return null;
    }

    /* renamed from: v */
    public final C1478f mo10728v() {
        float f;
        float f2;
        int i;
        int clientWidth = getClientWidth();
        float f3 = Utils.FLOAT_EPSILON;
        if (clientWidth > 0) {
            f = ((float) getScrollX()) / ((float) clientWidth);
        } else {
            f = 0.0f;
        }
        if (clientWidth > 0) {
            f2 = ((float) this.f7332H) / ((float) clientWidth);
        } else {
            f2 = 0.0f;
        }
        C1478f fVar = null;
        int i2 = 0;
        int i3 = -1;
        boolean z = true;
        float f4 = 0.0f;
        while (i2 < this.f7355d.size()) {
            C1478f fVar2 = this.f7355d.get(i2);
            if (!z && fVar2.f7392b != (i = i3 + 1)) {
                fVar2 = this.f7356e;
                fVar2.f7395e = f3 + f4 + f2;
                fVar2.f7392b = i;
                fVar2.f7394d = this.f7360k.mo373h(i);
                i2--;
            }
            f3 = fVar2.f7395e;
            float f5 = fVar2.f7394d + f3 + f2;
            if (!z && f < f3) {
                return fVar;
            }
            if (f < f5 || i2 == this.f7355d.size() - 1) {
                return fVar2;
            }
            i3 = fVar2.f7392b;
            f4 = fVar2.f7394d;
            i2++;
            z = false;
            fVar = fVar2;
        }
        return fVar;
    }

    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f7334I) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public C1478f mo10730w(int i) {
        for (int i2 = 0; i2 < this.f7355d.size(); i2++) {
            C1478f fVar = this.f7355d.get(i2);
            if (fVar.f7392b == i) {
                return fVar;
            }
        }
        return null;
    }

    /* renamed from: x */
    public void mo10731x() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f7322A = new Scroller(context, f7320X1);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f7368s1 = viewConfiguration.getScaledPagingTouchSlop();
        this.f7378z1 = (int) (400.0f * f);
        this.f7323A1 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f7330F1 = new EdgeEffect(context);
        this.f7331G1 = new EdgeEffect(context);
        this.f7325B1 = (int) (25.0f * f);
        this.f7327C1 = (int) (2.0f * f);
        this.f7364q1 = (int) (f * 16.0f);
        ga7.m17785p0(this, new C1479g());
        if (ga7.m17804z(this) == 0) {
            ga7.m17714A0(this, 1);
        }
        ga7.m17720D0(this, new C1476d());
    }

    /* renamed from: z */
    public boolean mo10732z() {
        return this.f7328D1;
    }

    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f7379a;

        /* renamed from: b */
        public int f7380b;

        /* renamed from: c */
        public float f7381c = Utils.FLOAT_EPSILON;

        /* renamed from: d */
        public boolean f7382d;

        /* renamed from: e */
        public int f7383e;

        /* renamed from: f */
        public int f7384f;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f7318V1);
            this.f7380b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setPageTransformer(boolean z, C1482j jVar, int i) {
        int i2 = 1;
        boolean z2 = jVar != null;
        boolean z3 = z2 != (this.f7345P1 != null);
        this.f7345P1 = jVar;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            if (z) {
                i2 = 2;
            }
            this.f7348R1 = i2;
            this.f7347Q1 = i;
        } else {
            this.f7348R1 = 0;
        }
        if (z3) {
            mo10652H();
        }
    }

    public void setCurrentItem(int i, boolean z) {
        this.f7354b1 = false;
        mo10661Q(i, z, false);
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(zr0.m31442e(getContext(), i));
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo10731x();
    }
}
