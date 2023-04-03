package com.p011rd;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.viewpager.widget.ViewPager;
import com.github.mikephil.charting.utils.Utils;
import com.p011rd.C5366a;
import com.p011rd.animation.type.AnimationType;
import com.p011rd.draw.data.Orientation;
import com.p011rd.draw.data.PositionSavedState;
import com.p011rd.draw.data.RtlMode;
import p000.aj1;

/* renamed from: com.rd.PageIndicatorView */
public class PageIndicatorView extends View implements ViewPager.C1481i, C5366a.C5367a, ViewPager.C1480h, View.OnTouchListener {

    /* renamed from: r */
    public static final Handler f26633r = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public C5366a f26634a;

    /* renamed from: d */
    public DataSetObserver f26635d;

    /* renamed from: e */
    public ViewPager f26636e;

    /* renamed from: g */
    public boolean f26637g;

    /* renamed from: k */
    public Runnable f26638k = new C5364b();

    /* renamed from: com.rd.PageIndicatorView$a */
    public class C5363a extends DataSetObserver {
        public C5363a() {
        }

        public void onChanged() {
            PageIndicatorView.this.mo39243z();
        }
    }

    /* renamed from: com.rd.PageIndicatorView$b */
    public class C5364b implements Runnable {
        public C5364b() {
        }

        public void run() {
            PageIndicatorView.this.f26634a.mo39249d().mo49925H(true);
            PageIndicatorView.this.mo39198m();
        }
    }

    /* renamed from: com.rd.PageIndicatorView$c */
    public static /* synthetic */ class C5365c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26641a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.rd.draw.data.RtlMode[] r0 = com.p011rd.draw.data.RtlMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f26641a = r0
                com.rd.draw.data.RtlMode r1 = com.p011rd.draw.data.RtlMode.On     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26641a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.rd.draw.data.RtlMode r1 = com.p011rd.draw.data.RtlMode.Off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f26641a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.rd.draw.data.RtlMode r1 = com.p011rd.draw.data.RtlMode.Auto     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p011rd.PageIndicatorView.C5365c.<clinit>():void");
        }
    }

    public PageIndicatorView(Context context) {
        super(context);
        mo39199n((AttributeSet) null);
    }

    /* renamed from: A */
    public final void mo39183A() {
        if (this.f26634a.mo39249d().mo49967w()) {
            int c = this.f26634a.mo39249d().mo49947c();
            int visibility = getVisibility();
            if (visibility != 0 && c > 1) {
                setVisibility(0);
            } else if (visibility != 4 && c <= 1) {
                setVisibility(4);
            }
        }
    }

    /* renamed from: a */
    public void mo10639a(ViewPager viewPager, al4 al4, al4 al42) {
        DataSetObserver dataSetObserver;
        if (this.f26634a.mo39249d().mo49968x()) {
            if (!(al4 == null || (dataSetObserver = this.f26635d) == null)) {
                al4.mo385t(dataSetObserver);
                this.f26635d = null;
            }
            mo39237t();
        }
        mo39243z();
    }

    /* renamed from: b */
    public void mo39184b() {
        invalidate();
    }

    /* renamed from: c */
    public void mo10640c(int i, float f, int i2) {
        mo39211r(i, f);
    }

    /* renamed from: d */
    public void mo10641d(int i) {
        if (i == 0) {
            this.f26634a.mo39249d().mo49927J(this.f26637g);
        }
    }

    /* renamed from: e */
    public void mo10642e(int i) {
        mo39212s(i);
    }

    public long getAnimationDuration() {
        return this.f26634a.mo39249d().mo49944a();
    }

    public int getCount() {
        return this.f26634a.mo39249d().mo49947c();
    }

    public int getPadding() {
        return this.f26634a.mo39249d().mo49952h();
    }

    public int getRadius() {
        return this.f26634a.mo39249d().mo49957m();
    }

    public float getScaleFactor() {
        return this.f26634a.mo39249d().mo49959o();
    }

    public int getSelectedColor() {
        return this.f26634a.mo39249d().mo49960p();
    }

    public int getSelection() {
        return this.f26634a.mo39249d().mo49961q();
    }

    public int getStrokeWidth() {
        return this.f26634a.mo39249d().mo49963s();
    }

    public int getUnselectedColor() {
        return this.f26634a.mo39249d().mo49964t();
    }

    /* renamed from: i */
    public final int mo39194i(int i) {
        int c = this.f26634a.mo39249d().mo49947c() - 1;
        if (i < 0) {
            return 0;
        }
        if (i > c) {
            return c;
        }
        return i;
    }

    /* renamed from: j */
    public final void mo39195j() {
        animate().cancel();
        animate().alpha(1.0f).setDuration(250);
    }

    /* renamed from: k */
    public final ViewPager mo39196k(ViewGroup viewGroup, int i) {
        View findViewById;
        if (viewGroup.getChildCount() > 0 && (findViewById = viewGroup.findViewById(i)) != null && (findViewById instanceof ViewPager)) {
            return (ViewPager) findViewById;
        }
        return null;
    }

    /* renamed from: l */
    public final void mo39197l(ViewParent viewParent) {
        boolean z;
        if (viewParent == null || !(viewParent instanceof ViewGroup) || ((ViewGroup) viewParent).getChildCount() <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            ViewPager k = mo39196k((ViewGroup) viewParent, this.f26634a.mo39249d().mo49965u());
            if (k != null) {
                setViewPager(k);
            } else {
                mo39197l(viewParent.getParent());
            }
        }
    }

    /* renamed from: m */
    public final void mo39198m() {
        animate().cancel();
        animate().alpha(Utils.FLOAT_EPSILON).setDuration(250);
    }

    /* renamed from: n */
    public final void mo39199n(AttributeSet attributeSet) {
        mo39239v();
        mo39200o(attributeSet);
        if (this.f26634a.mo39249d().mo49969y()) {
            mo39240w();
        }
    }

    /* renamed from: o */
    public final void mo39200o(AttributeSet attributeSet) {
        C5366a aVar = new C5366a(this);
        this.f26634a = aVar;
        aVar.mo39248c().mo29618c(getContext(), attributeSet);
        zt2 d = this.f26634a.mo39249d();
        d.mo49932O(getPaddingLeft());
        d.mo49934Q(getPaddingTop());
        d.mo49933P(getPaddingRight());
        d.mo49931N(getPaddingBottom());
        this.f26637g = d.mo49970z();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo39197l(getParent());
    }

    public void onDetachedFromWindow() {
        mo39242y();
        super.onDetachedFromWindow();
    }

    public void onDraw(Canvas canvas) {
        this.f26634a.mo39248c().mo29616a(canvas);
    }

    public void onMeasure(int i, int i2) {
        Pair<Integer, Integer> d = this.f26634a.mo39248c().mo29619d(i, i2);
        setMeasuredDimension(((Integer) d.first).intValue(), ((Integer) d.second).intValue());
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof PositionSavedState) {
            zt2 d = this.f26634a.mo39249d();
            PositionSavedState positionSavedState = (PositionSavedState) parcelable;
            d.mo49939V(positionSavedState.mo39259b());
            d.mo49940W(positionSavedState.mo39260c());
            d.mo49928K(positionSavedState.mo39258a());
            super.onRestoreInstanceState(positionSavedState.getSuperState());
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        zt2 d = this.f26634a.mo39249d();
        PositionSavedState positionSavedState = new PositionSavedState(super.onSaveInstanceState());
        positionSavedState.mo39262e(d.mo49961q());
        positionSavedState.mo39263f(d.mo49962r());
        positionSavedState.mo39261d(d.mo49950f());
        return positionSavedState;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f26634a.mo39249d().mo49969y()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            mo39241x();
        } else if (action == 1) {
            mo39240w();
        }
        return false;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f26634a.mo39248c().mo29621f(motionEvent);
        return true;
    }

    /* renamed from: p */
    public final boolean mo39209p() {
        int i = C5365c.f26641a[this.f26634a.mo39249d().mo49958n().ordinal()];
        if (i == 1) {
            return true;
        }
        if (i != 3) {
            return false;
        }
        if (jo6.m20327a(getContext().getResources().getConfiguration().locale) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public final boolean mo39210q() {
        if (getMeasuredHeight() == 0 && getMeasuredWidth() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public final void mo39211r(int i, float f) {
        boolean z;
        zt2 d = this.f26634a.mo39249d();
        AnimationType b = d.mo49946b();
        boolean z2 = d.mo49970z();
        if (!mo39210q() || !z2 || b == AnimationType.NONE) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            Pair<Integer, Float> e = qt0.m50859e(d, i, f, mo39209p());
            setProgress(((Integer) e.first).intValue(), ((Float) e.second).floatValue());
        }
    }

    /* renamed from: s */
    public final void mo39212s(int i) {
        zt2 d = this.f26634a.mo39249d();
        boolean q = mo39210q();
        int c = d.mo49947c();
        if (q) {
            if (mo39209p()) {
                i = (c - 1) - i;
            }
            setSelection(i);
        }
    }

    public void setAnimationDuration(long j) {
        this.f26634a.mo39249d().mo49918A(j);
    }

    public void setAnimationType(AnimationType animationType) {
        this.f26634a.mo39246a((c87) null);
        if (animationType != null) {
            this.f26634a.mo39249d().mo49919B(animationType);
        } else {
            this.f26634a.mo39249d().mo49919B(AnimationType.NONE);
        }
        invalidate();
    }

    public void setAutoVisibility(boolean z) {
        if (!z) {
            setVisibility(0);
        }
        this.f26634a.mo39249d().mo49920C(z);
        mo39183A();
    }

    public void setClickListener(aj1.C3817b bVar) {
        this.f26634a.mo39248c().mo29620e(bVar);
    }

    public void setCount(int i) {
        if (i >= 0 && this.f26634a.mo39249d().mo49947c() != i) {
            this.f26634a.mo39249d().mo49921D(i);
            mo39183A();
            requestLayout();
        }
    }

    public void setDynamicCount(boolean z) {
        this.f26634a.mo39249d().mo49922E(z);
        if (z) {
            mo39237t();
        } else {
            mo39242y();
        }
    }

    public void setFadeOnIdle(boolean z) {
        this.f26634a.mo39249d().mo49923F(z);
        if (z) {
            mo39240w();
        } else {
            mo39241x();
        }
    }

    public void setIdleDuration(long j) {
        this.f26634a.mo39249d().mo49926I(j);
        if (this.f26634a.mo39249d().mo49969y()) {
            mo39240w();
        } else {
            mo39241x();
        }
    }

    public void setInteractiveAnimation(boolean z) {
        this.f26634a.mo39249d().mo49927J(z);
        this.f26637g = z;
    }

    public void setOrientation(Orientation orientation) {
        if (orientation != null) {
            this.f26634a.mo39249d().mo49929L(orientation);
            requestLayout();
        }
    }

    public void setPadding(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f26634a.mo39249d().mo49930M(gc1.m44677a(i));
        invalidate();
    }

    public void setProgress(int i, float f) {
        zt2 d = this.f26634a.mo39249d();
        if (d.mo49970z()) {
            int c = d.mo49947c();
            if (c <= 0 || i < 0) {
                i = 0;
            } else {
                int i2 = c - 1;
                if (i > i2) {
                    i = i2;
                }
            }
            if (f < Utils.FLOAT_EPSILON) {
                f = 0.0f;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            if (f == 1.0f) {
                d.mo49928K(d.mo49961q());
                d.mo49939V(i);
            }
            d.mo49940W(i);
            this.f26634a.mo39247b().mo41975c(f);
        }
    }

    public void setRadius(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f26634a.mo39249d().mo49935R(gc1.m44677a(i));
        invalidate();
    }

    public void setRtlMode(RtlMode rtlMode) {
        zt2 d = this.f26634a.mo39249d();
        if (rtlMode == null) {
            d.mo49936S(RtlMode.Off);
        } else {
            d.mo49936S(rtlMode);
        }
        if (this.f26636e != null) {
            int q = d.mo49961q();
            if (mo39209p()) {
                q = (d.mo49947c() - 1) - q;
            } else {
                ViewPager viewPager = this.f26636e;
                if (viewPager != null) {
                    q = viewPager.getCurrentItem();
                }
            }
            d.mo49928K(q);
            d.mo49940W(q);
            d.mo49939V(q);
            invalidate();
        }
    }

    public void setScaleFactor(float f) {
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < 0.3f) {
            f = 0.3f;
        }
        this.f26634a.mo39249d().mo49937T(f);
    }

    public void setSelected(int i) {
        zt2 d = this.f26634a.mo39249d();
        AnimationType b = d.mo49946b();
        d.mo49919B(AnimationType.NONE);
        setSelection(i);
        d.mo49919B(b);
    }

    public void setSelectedColor(int i) {
        this.f26634a.mo39249d().mo49938U(i);
        invalidate();
    }

    public void setSelection(int i) {
        zt2 d = this.f26634a.mo39249d();
        int i2 = mo39194i(i);
        if (i2 != d.mo49961q() && i2 != d.mo49962r()) {
            d.mo49927J(false);
            d.mo49928K(d.mo49961q());
            d.mo49940W(i2);
            d.mo49939V(i2);
            this.f26634a.mo39247b().mo41973a();
        }
    }

    public void setStrokeWidth(float f) {
        int m = this.f26634a.mo39249d().mo49957m();
        if (f < Utils.FLOAT_EPSILON) {
            f = 0.0f;
        } else {
            float f2 = (float) m;
            if (f > f2) {
                f = f2;
            }
        }
        this.f26634a.mo39249d().mo49941X((int) f);
        invalidate();
    }

    public void setUnselectedColor(int i) {
        this.f26634a.mo39249d().mo49942Y(i);
        invalidate();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void setViewPager(ViewPager viewPager) {
        mo39238u();
        if (viewPager != null) {
            this.f26636e = viewPager;
            viewPager.mo10671c(this);
            this.f26636e.mo10670b(this);
            this.f26636e.setOnTouchListener(this);
            this.f26634a.mo39249d().mo49943Z(this.f26636e.getId());
            setDynamicCount(this.f26634a.mo39249d().mo49968x());
            mo39243z();
        }
    }

    /* renamed from: t */
    public final void mo39237t() {
        ViewPager viewPager;
        if (this.f26635d == null && (viewPager = this.f26636e) != null && viewPager.getAdapter() != null) {
            this.f26635d = new C5363a();
            try {
                this.f26636e.getAdapter().mo377l(this.f26635d);
            } catch (IllegalStateException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: u */
    public void mo39238u() {
        ViewPager viewPager = this.f26636e;
        if (viewPager != null) {
            viewPager.mo10657M(this);
            this.f26636e.mo10656L(this);
            this.f26636e = null;
        }
    }

    /* renamed from: v */
    public final void mo39239v() {
        if (getId() == -1) {
            setId(aq2.m31905a());
        }
    }

    /* renamed from: w */
    public final void mo39240w() {
        Handler handler = f26633r;
        handler.removeCallbacks(this.f26638k);
        handler.postDelayed(this.f26638k, this.f26634a.mo39249d().mo49949e());
    }

    /* renamed from: x */
    public final void mo39241x() {
        f26633r.removeCallbacks(this.f26638k);
        mo39195j();
    }

    /* renamed from: y */
    public final void mo39242y() {
        ViewPager viewPager;
        if (this.f26635d != null && (viewPager = this.f26636e) != null && viewPager.getAdapter() != null) {
            try {
                this.f26636e.getAdapter().mo385t(this.f26635d);
                this.f26635d = null;
            } catch (IllegalStateException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: z */
    public final void mo39243z() {
        int i;
        ViewPager viewPager = this.f26636e;
        if (viewPager != null && viewPager.getAdapter() != null) {
            int e = this.f26636e.getAdapter().mo370e();
            if (mo39209p()) {
                i = (e - 1) - this.f26636e.getCurrentItem();
            } else {
                i = this.f26636e.getCurrentItem();
            }
            this.f26634a.mo39249d().mo49939V(i);
            this.f26634a.mo39249d().mo49940W(i);
            this.f26634a.mo39249d().mo49928K(i);
            this.f26634a.mo39249d().mo49921D(e);
            this.f26634a.mo39247b().mo41974b();
            mo39183A();
            requestLayout();
        }
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo39199n(attributeSet);
    }

    public void setPadding(float f) {
        if (f < Utils.FLOAT_EPSILON) {
            f = 0.0f;
        }
        this.f26634a.mo39249d().mo49930M((int) f);
        invalidate();
    }

    public void setRadius(float f) {
        if (f < Utils.FLOAT_EPSILON) {
            f = 0.0f;
        }
        this.f26634a.mo39249d().mo49935R((int) f);
        invalidate();
    }

    public void setStrokeWidth(int i) {
        int a = gc1.m44677a(i);
        int m = this.f26634a.mo39249d().mo49957m();
        if (a < 0) {
            a = 0;
        } else if (a > m) {
            a = m;
        }
        this.f26634a.mo39249d().mo49941X(a);
        invalidate();
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo39199n(attributeSet);
    }
}
