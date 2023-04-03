package androidx.viewpager2.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.C1337r;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p000.C3335t8;
import p000.C3658y8;

public final class ViewPager2 extends ViewGroup {

    /* renamed from: k0 */
    public static boolean f7400k0 = true;

    /* renamed from: A */
    public RecyclerView f7401A;

    /* renamed from: B */
    public C1337r f7402B;

    /* renamed from: C */
    public C1505c f7403C;

    /* renamed from: H */
    public C1503a f7404H;

    /* renamed from: I */
    public wy1 f7405I;

    /* renamed from: L */
    public C1504b f7406L;

    /* renamed from: M */
    public RecyclerView.C1242l f7407M = null;

    /* renamed from: P */
    public boolean f7408P = false;

    /* renamed from: Q */
    public boolean f7409Q = true;

    /* renamed from: U */
    public int f7410U = -1;

    /* renamed from: a */
    public final Rect f7411a = new Rect();

    /* renamed from: d */
    public final Rect f7412d = new Rect();

    /* renamed from: e */
    public C1503a f7413e = new C1503a(3);

    /* renamed from: e0 */
    public C1490e f7414e0;

    /* renamed from: g */
    public int f7415g;

    /* renamed from: k */
    public boolean f7416k = false;

    /* renamed from: r */
    public RecyclerView.C1239i f7417r = new C1486a();

    /* renamed from: s */
    public LinearLayoutManager f7418s;

    /* renamed from: x */
    public int f7419x = -1;

    /* renamed from: y */
    public Parcelable f7420y;

    /* renamed from: androidx.viewpager2.widget.ViewPager2$a */
    public class C1486a extends C1492g {
        public C1486a() {
            super((C1486a) null);
        }

        public void onChanged() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f7416k = true;
            viewPager2.f7403C.mo10838j();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$b */
    public class C1487b extends C1494i {
        public C1487b() {
        }

        /* renamed from: a */
        public void mo10796a(int i) {
            if (i == 0) {
                ViewPager2.this.mo10772l();
            }
        }

        /* renamed from: c */
        public void mo10797c(int i) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f7415g != i) {
                viewPager2.f7415g = i;
                viewPager2.f7414e0.mo10814q();
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$c */
    public class C1488c extends C1494i {
        public C1488c() {
        }

        /* renamed from: c */
        public void mo10797c(int i) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.f7401A.requestFocus(2);
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$d */
    public class C1489d implements RecyclerView.C1248o {
        public C1489d() {
        }

        /* renamed from: b */
        public void mo9438b(View view) {
        }

        /* renamed from: d */
        public void mo9439d(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (layoutParams.width != -1 || layoutParams.height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$e */
    public abstract class C1490e {
        public C1490e() {
        }

        /* renamed from: a */
        public boolean mo10798a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo10799b(int i) {
            return false;
        }

        /* renamed from: c */
        public boolean mo10800c(int i, Bundle bundle) {
            return false;
        }

        /* renamed from: d */
        public boolean mo10801d() {
            return false;
        }

        /* renamed from: e */
        public void mo10802e(RecyclerView.Adapter<?> adapter) {
        }

        /* renamed from: f */
        public void mo10803f(RecyclerView.Adapter<?> adapter) {
        }

        /* renamed from: g */
        public String mo10804g() {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: h */
        public void mo10805h(C1503a aVar, RecyclerView recyclerView) {
        }

        /* renamed from: i */
        public void mo10806i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        /* renamed from: j */
        public void mo10807j(C3335t8 t8Var) {
        }

        /* renamed from: k */
        public boolean mo10808k(int i) {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: l */
        public boolean mo10809l(int i, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: m */
        public void mo10810m() {
        }

        /* renamed from: n */
        public CharSequence mo10811n() {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: o */
        public void mo10812o(AccessibilityEvent accessibilityEvent) {
        }

        /* renamed from: p */
        public void mo10813p() {
        }

        /* renamed from: q */
        public void mo10814q() {
        }

        /* renamed from: r */
        public void mo10815r() {
        }

        /* renamed from: s */
        public void mo10816s() {
        }

        public /* synthetic */ C1490e(ViewPager2 viewPager2, C1486a aVar) {
            this();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$f */
    public class C1491f extends C1490e {
        public C1491f() {
            super(ViewPager2.this, (C1486a) null);
        }

        /* renamed from: b */
        public boolean mo10799b(int i) {
            if ((i == 8192 || i == 4096) && !ViewPager2.this.mo10757e()) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public boolean mo10801d() {
            return true;
        }

        /* renamed from: j */
        public void mo10807j(C3335t8 t8Var) {
            if (!ViewPager2.this.mo10757e()) {
                t8Var.mo26223W(C3335t8.C3336a.f18017r);
                t8Var.mo26223W(C3335t8.C3336a.f18016q);
                t8Var.mo26199G0(false);
            }
        }

        /* renamed from: k */
        public boolean mo10808k(int i) {
            if (mo10799b(i)) {
                return false;
            }
            throw new IllegalStateException();
        }

        /* renamed from: n */
        public CharSequence mo10811n() {
            if (mo10801d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$g */
    public static abstract class C1492g extends RecyclerView.C1239i {
        public C1492g() {
        }

        public abstract void onChanged();

        public final void onItemRangeChanged(int i, int i2) {
            onChanged();
        }

        public final void onItemRangeInserted(int i, int i2) {
            onChanged();
        }

        public final void onItemRangeMoved(int i, int i2, int i3) {
            onChanged();
        }

        public final void onItemRangeRemoved(int i, int i2) {
            onChanged();
        }

        public /* synthetic */ C1492g(C1486a aVar) {
            this();
        }

        public final void onItemRangeChanged(int i, int i2, Object obj) {
            onChanged();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$h */
    public class C1493h extends LinearLayoutManager {
        public C1493h(Context context) {
            super(context);
        }

        /* renamed from: B1 */
        public boolean mo9198B1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            return false;
        }

        /* renamed from: V0 */
        public void mo9236V0(RecyclerView.C1254t tVar, RecyclerView.C1260x xVar, C3335t8 t8Var) {
            super.mo9236V0(tVar, xVar, t8Var);
            ViewPager2.this.f7414e0.mo10807j(t8Var);
        }

        /* renamed from: V1 */
        public void mo8900V1(RecyclerView.C1260x xVar, int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.mo8900V1(xVar, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        /* renamed from: p1 */
        public boolean mo9274p1(RecyclerView.C1254t tVar, RecyclerView.C1260x xVar, int i, Bundle bundle) {
            if (ViewPager2.this.f7414e0.mo10799b(i)) {
                return ViewPager2.this.f7414e0.mo10808k(i);
            }
            return super.mo9274p1(tVar, xVar, i, bundle);
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$i */
    public static abstract class C1494i {
        /* renamed from: a */
        public void mo10796a(int i) {
        }

        /* renamed from: b */
        public void mo10817b(int i, float f, int i2) {
        }

        /* renamed from: c */
        public void mo10797c(int i) {
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$j */
    public class C1495j extends C1490e {

        /* renamed from: b */
        public final C3658y8 f7431b = new C1496a();

        /* renamed from: c */
        public final C3658y8 f7432c = new C1497b();

        /* renamed from: d */
        public RecyclerView.C1239i f7433d;

        /* renamed from: androidx.viewpager2.widget.ViewPager2$j$a */
        public class C1496a implements C3658y8 {
            public C1496a() {
            }

            /* renamed from: a */
            public boolean mo5572a(View view, C3658y8.C3659a aVar) {
                C1495j.this.mo10820v(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        /* renamed from: androidx.viewpager2.widget.ViewPager2$j$b */
        public class C1497b implements C3658y8 {
            public C1497b() {
            }

            /* renamed from: a */
            public boolean mo5572a(View view, C3658y8.C3659a aVar) {
                C1495j.this.mo10820v(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        /* renamed from: androidx.viewpager2.widget.ViewPager2$j$c */
        public class C1498c extends C1492g {
            public C1498c() {
                super((C1486a) null);
            }

            public void onChanged() {
                C1495j.this.mo10821w();
            }
        }

        public C1495j() {
            super(ViewPager2.this, (C1486a) null);
        }

        /* renamed from: a */
        public boolean mo10798a() {
            return true;
        }

        /* renamed from: c */
        public boolean mo10800c(int i, Bundle bundle) {
            return i == 8192 || i == 4096;
        }

        /* renamed from: e */
        public void mo10802e(RecyclerView.Adapter<?> adapter) {
            mo10821w();
            if (adapter != null) {
                adapter.registerAdapterDataObserver(this.f7433d);
            }
        }

        /* renamed from: f */
        public void mo10803f(RecyclerView.Adapter<?> adapter) {
            if (adapter != null) {
                adapter.unregisterAdapterDataObserver(this.f7433d);
            }
        }

        /* renamed from: g */
        public String mo10804g() {
            if (mo10798a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        /* renamed from: h */
        public void mo10805h(C1503a aVar, RecyclerView recyclerView) {
            ga7.m17714A0(recyclerView, 2);
            this.f7433d = new C1498c();
            if (ga7.m17804z(ViewPager2.this) == 0) {
                ga7.m17714A0(ViewPager2.this, 1);
            }
        }

        /* renamed from: i */
        public void mo10806i(AccessibilityNodeInfo accessibilityNodeInfo) {
            mo10818t(accessibilityNodeInfo);
            mo10819u(accessibilityNodeInfo);
        }

        /* renamed from: l */
        public boolean mo10809l(int i, Bundle bundle) {
            int i2;
            if (mo10800c(i, bundle)) {
                if (i == 8192) {
                    i2 = ViewPager2.this.getCurrentItem() - 1;
                } else {
                    i2 = ViewPager2.this.getCurrentItem() + 1;
                }
                mo10820v(i2);
                return true;
            }
            throw new IllegalStateException();
        }

        /* renamed from: m */
        public void mo10810m() {
            mo10821w();
        }

        /* renamed from: o */
        public void mo10812o(AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(mo10804g());
        }

        /* renamed from: p */
        public void mo10813p() {
            mo10821w();
        }

        /* renamed from: q */
        public void mo10814q() {
            mo10821w();
        }

        /* renamed from: r */
        public void mo10815r() {
            mo10821w();
        }

        /* renamed from: s */
        public void mo10816s() {
            mo10821w();
        }

        /* renamed from: t */
        public final void mo10818t(AccessibilityNodeInfo accessibilityNodeInfo) {
            int i;
            int i2;
            if (ViewPager2.this.getAdapter() == null) {
                i2 = 0;
                i = 0;
            } else if (ViewPager2.this.getOrientation() == 1) {
                i2 = ViewPager2.this.getAdapter().getItemCount();
                i = 0;
            } else {
                i = ViewPager2.this.getAdapter().getItemCount();
                i2 = 0;
            }
            C3335t8.m27495S0(accessibilityNodeInfo).mo26243h0(C3335t8.C3337b.m27595b(i2, i, false, 0));
        }

        /* renamed from: u */
        public final void mo10819u(AccessibilityNodeInfo accessibilityNodeInfo) {
            int itemCount;
            RecyclerView.Adapter adapter = ViewPager2.this.getAdapter();
            if (adapter != null && (itemCount = adapter.getItemCount()) != 0 && ViewPager2.this.mo10757e()) {
                if (ViewPager2.this.f7415g > 0) {
                    accessibilityNodeInfo.addAction(8192);
                }
                if (ViewPager2.this.f7415g < itemCount - 1) {
                    accessibilityNodeInfo.addAction(4096);
                }
                accessibilityNodeInfo.setScrollable(true);
            }
        }

        /* renamed from: v */
        public void mo10820v(int i) {
            if (ViewPager2.this.mo10757e()) {
                ViewPager2.this.mo10769i(i, true);
            }
        }

        /* renamed from: w */
        public void mo10821w() {
            int itemCount;
            int i;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i2 = 16908360;
            ga7.m17773j0(viewPager2, 16908360);
            ga7.m17773j0(viewPager2, 16908361);
            ga7.m17773j0(viewPager2, 16908358);
            ga7.m17773j0(viewPager2, 16908359);
            if (ViewPager2.this.getAdapter() != null && (itemCount = ViewPager2.this.getAdapter().getItemCount()) != 0 && ViewPager2.this.mo10757e()) {
                if (ViewPager2.this.getOrientation() == 0) {
                    boolean d = ViewPager2.this.mo10755d();
                    if (d) {
                        i = 16908360;
                    } else {
                        i = 16908361;
                    }
                    if (d) {
                        i2 = 16908361;
                    }
                    if (ViewPager2.this.f7415g < itemCount - 1) {
                        ga7.m17777l0(viewPager2, new C3335t8.C3336a(i, (CharSequence) null), (CharSequence) null, this.f7431b);
                    }
                    if (ViewPager2.this.f7415g > 0) {
                        ga7.m17777l0(viewPager2, new C3335t8.C3336a(i2, (CharSequence) null), (CharSequence) null, this.f7432c);
                        return;
                    }
                    return;
                }
                if (ViewPager2.this.f7415g < itemCount - 1) {
                    ga7.m17777l0(viewPager2, new C3335t8.C3336a(16908359, (CharSequence) null), (CharSequence) null, this.f7431b);
                }
                if (ViewPager2.this.f7415g > 0) {
                    ga7.m17777l0(viewPager2, new C3335t8.C3336a(16908358, (CharSequence) null), (CharSequence) null, this.f7432c);
                }
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$k */
    public interface C1499k {
        /* renamed from: a */
        void mo10822a(View view, float f);
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$l */
    public class C1500l extends C1337r {
        public C1500l() {
        }

        /* renamed from: h */
        public View mo9912h(RecyclerView.LayoutManager layoutManager) {
            if (ViewPager2.this.mo10752c()) {
                return null;
            }
            return super.mo9912h(layoutManager);
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$m */
    public class C1501m extends RecyclerView {
        public C1501m(Context context) {
            super(context);
        }

        public CharSequence getAccessibilityClassName() {
            if (ViewPager2.this.f7414e0.mo10801d()) {
                return ViewPager2.this.f7414e0.mo10811n();
            }
            return super.getAccessibilityClassName();
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f7415g);
            accessibilityEvent.setToIndex(ViewPager2.this.f7415g);
            ViewPager2.this.f7414e0.mo10812o(accessibilityEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (!ViewPager2.this.mo10757e() || !super.onInterceptTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (!ViewPager2.this.mo10757e() || !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$n */
    public static class C1502n implements Runnable {

        /* renamed from: a */
        public final int f7440a;

        /* renamed from: d */
        public final RecyclerView f7441d;

        public C1502n(int i, RecyclerView recyclerView) {
            this.f7440a = i;
            this.f7441d = recyclerView;
        }

        public void run() {
            this.f7441d.mo9158w1(this.f7440a);
        }
    }

    public ViewPager2(Context context) {
        super(context);
        mo10751b(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final RecyclerView.C1248o mo10750a() {
        return new C1489d();
    }

    /* renamed from: b */
    public final void mo10751b(Context context, AttributeSet attributeSet) {
        C1490e eVar;
        if (f7400k0) {
            eVar = new C1495j();
        } else {
            eVar = new C1491f();
        }
        this.f7414e0 = eVar;
        C1501m mVar = new C1501m(context);
        this.f7401A = mVar;
        mVar.setId(ga7.m17774k());
        this.f7401A.setDescendantFocusability(131072);
        C1493h hVar = new C1493h(context);
        this.f7418s = hVar;
        this.f7401A.setLayoutManager(hVar);
        this.f7401A.setScrollingTouchSlop(1);
        mo10770j(context, attributeSet);
        this.f7401A.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f7401A.mo9076j(mo10750a());
        C1505c cVar = new C1505c(this);
        this.f7403C = cVar;
        this.f7405I = new wy1(this, cVar, this.f7401A);
        C1500l lVar = new C1500l();
        this.f7402B = lVar;
        lVar.mo9980b(this.f7401A);
        this.f7401A.mo9081l(this.f7403C);
        C1503a aVar = new C1503a(3);
        this.f7404H = aVar;
        this.f7403C.mo10841m(aVar);
        C1487b bVar = new C1487b();
        C1488c cVar2 = new C1488c();
        this.f7404H.mo10825d(bVar);
        this.f7404H.mo10825d(cVar2);
        this.f7414e0.mo10805h(this.f7404H, this.f7401A);
        this.f7404H.mo10825d(this.f7413e);
        C1504b bVar2 = new C1504b(this.f7418s);
        this.f7406L = bVar2;
        this.f7404H.mo10825d(bVar2);
        RecyclerView recyclerView = this.f7401A;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    /* renamed from: c */
    public boolean mo10752c() {
        return this.f7405I.mo27621a();
    }

    public boolean canScrollHorizontally(int i) {
        return this.f7401A.canScrollHorizontally(i);
    }

    public boolean canScrollVertically(int i) {
        return this.f7401A.canScrollVertically(i);
    }

    /* renamed from: d */
    public boolean mo10755d() {
        if (this.f7418s.mo9262k0() == 1) {
            return true;
        }
        return false;
    }

    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i = ((SavedState) parcelable).f7421a;
            sparseArray.put(this.f7401A.getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        mo10768h();
    }

    /* renamed from: e */
    public boolean mo10757e() {
        return this.f7409Q;
    }

    /* renamed from: f */
    public final void mo10758f(RecyclerView.Adapter<?> adapter) {
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.f7417r);
        }
    }

    /* renamed from: g */
    public void mo10759g() {
        if (this.f7406L.mo10827d() != null) {
            double e = this.f7403C.mo10833e();
            int i = (int) e;
            float f = (float) (e - ((double) i));
            this.f7406L.mo10817b(i, f, Math.round(((float) getPageSize()) * f));
        }
    }

    public CharSequence getAccessibilityClassName() {
        if (this.f7414e0.mo10798a()) {
            return this.f7414e0.mo10804g();
        }
        return super.getAccessibilityClassName();
    }

    public RecyclerView.Adapter getAdapter() {
        return this.f7401A.getAdapter();
    }

    public int getCurrentItem() {
        return this.f7415g;
    }

    public int getItemDecorationCount() {
        return this.f7401A.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f7410U;
    }

    public int getOrientation() {
        return this.f7418s.mo8930v2();
    }

    public int getPageSize() {
        int i;
        int i2;
        RecyclerView recyclerView = this.f7401A;
        if (getOrientation() == 0) {
            i = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            i2 = recyclerView.getPaddingRight();
        } else {
            i = recyclerView.getHeight() - recyclerView.getPaddingTop();
            i2 = recyclerView.getPaddingBottom();
        }
        return i - i2;
    }

    public int getScrollState() {
        return this.f7403C.mo10834f();
    }

    /* renamed from: h */
    public final void mo10768h() {
        RecyclerView.Adapter adapter;
        if (this.f7419x != -1 && (adapter = getAdapter()) != null) {
            Parcelable parcelable = this.f7420y;
            if (parcelable != null) {
                if (adapter instanceof e96) {
                    ((e96) adapter).mo19219b(parcelable);
                }
                this.f7420y = null;
            }
            int max = Math.max(0, Math.min(this.f7419x, adapter.getItemCount() - 1));
            this.f7415g = max;
            this.f7419x = -1;
            this.f7401A.mo9092o1(max);
            this.f7414e0.mo10810m();
        }
    }

    /* renamed from: i */
    public void mo10769i(int i, boolean z) {
        int i2;
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter == null) {
            if (this.f7419x != -1) {
                this.f7419x = Math.max(i, 0);
            }
        } else if (adapter.getItemCount() > 0) {
            int min = Math.min(Math.max(i, 0), adapter.getItemCount() - 1);
            if (min != this.f7415g || !this.f7403C.mo10836h()) {
                int i3 = this.f7415g;
                if (min != i3 || !z) {
                    double d = (double) i3;
                    this.f7415g = min;
                    this.f7414e0.mo10814q();
                    if (!this.f7403C.mo10836h()) {
                        d = this.f7403C.mo10833e();
                    }
                    this.f7403C.mo10839k(min, z);
                    if (!z) {
                        this.f7401A.mo9092o1(min);
                        return;
                    }
                    double d2 = (double) min;
                    if (Math.abs(d2 - d) > 3.0d) {
                        RecyclerView recyclerView = this.f7401A;
                        if (d2 > d) {
                            i2 = min - 3;
                        } else {
                            i2 = min + 3;
                        }
                        recyclerView.mo9092o1(i2);
                        RecyclerView recyclerView2 = this.f7401A;
                        recyclerView2.post(new C1502n(min, recyclerView2));
                        return;
                    }
                    this.f7401A.mo9158w1(min);
                }
            }
        }
    }

    /* renamed from: j */
    public final void mo10770j(Context context, AttributeSet attributeSet) {
        int[] iArr = m55.ViewPager2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(m55.ViewPager2_android_orientation, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: k */
    public final void mo10771k(RecyclerView.Adapter<?> adapter) {
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(this.f7417r);
        }
    }

    /* renamed from: l */
    public void mo10772l() {
        C1337r rVar = this.f7402B;
        if (rVar != null) {
            View h = rVar.mo9912h(this.f7418s);
            if (h != null) {
                int o0 = this.f7418s.mo9271o0(h);
                if (o0 != this.f7415g && getScrollState() == 0) {
                    this.f7404H.mo10797c(o0);
                }
                this.f7416k = false;
                return;
            }
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f7414e0.mo10806i(accessibilityNodeInfo);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.f7401A.getMeasuredWidth();
        int measuredHeight = this.f7401A.getMeasuredHeight();
        this.f7411a.left = getPaddingLeft();
        this.f7411a.right = (i3 - i) - getPaddingRight();
        this.f7411a.top = getPaddingTop();
        this.f7411a.bottom = (i4 - i2) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f7411a, this.f7412d);
        RecyclerView recyclerView = this.f7401A;
        Rect rect = this.f7412d;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f7416k) {
            mo10772l();
        }
    }

    public void onMeasure(int i, int i2) {
        measureChild(this.f7401A, i, i2);
        int measuredWidth = this.f7401A.getMeasuredWidth();
        int measuredHeight = this.f7401A.getMeasuredHeight();
        int measuredState = this.f7401A.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f7419x = savedState.f7422d;
        this.f7420y = savedState.f7423e;
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f7421a = this.f7401A.getId();
        int i = this.f7419x;
        if (i == -1) {
            i = this.f7415g;
        }
        savedState.f7422d = i;
        Parcelable parcelable = this.f7420y;
        if (parcelable != null) {
            savedState.f7423e = parcelable;
        } else {
            RecyclerView.Adapter adapter = this.f7401A.getAdapter();
            if (adapter instanceof e96) {
                savedState.f7423e = ((e96) adapter).mo19218a();
            }
        }
        return savedState;
    }

    public void onViewAdded(View view) {
        throw new IllegalStateException(ViewPager2.class.getSimpleName() + " does not support direct child views");
    }

    public boolean performAccessibilityAction(int i, Bundle bundle) {
        if (this.f7414e0.mo10800c(i, bundle)) {
            return this.f7414e0.mo10809l(i, bundle);
        }
        return super.performAccessibilityAction(i, bundle);
    }

    public void setAdapter(RecyclerView.Adapter adapter) {
        RecyclerView.Adapter adapter2 = this.f7401A.getAdapter();
        this.f7414e0.mo10803f(adapter2);
        mo10771k(adapter2);
        this.f7401A.setAdapter(adapter);
        this.f7415g = 0;
        mo10768h();
        this.f7414e0.mo10802e(adapter);
        mo10758f(adapter);
    }

    public void setCurrentItem(int i) {
        setCurrentItem(i, true);
    }

    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.f7414e0.mo10813p();
    }

    public void setOffscreenPageLimit(int i) {
        if (i >= 1 || i == -1) {
            this.f7410U = i;
            this.f7401A.requestLayout();
            return;
        }
        throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
    }

    public void setOrientation(int i) {
        this.f7418s.mo8885J2(i);
        this.f7414e0.mo10815r();
    }

    public void setPageTransformer(C1499k kVar) {
        if (kVar != null) {
            if (!this.f7408P) {
                this.f7407M = this.f7401A.getItemAnimator();
                this.f7408P = true;
            }
            this.f7401A.setItemAnimator((RecyclerView.C1242l) null);
        } else if (this.f7408P) {
            this.f7401A.setItemAnimator(this.f7407M);
            this.f7407M = null;
            this.f7408P = false;
        }
        if (kVar != this.f7406L.mo10827d()) {
            this.f7406L.mo10828e(kVar);
            mo10759g();
        }
    }

    public void setUserInputEnabled(boolean z) {
        this.f7409Q = z;
        this.f7414e0.mo10816s();
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1485a();

        /* renamed from: a */
        public int f7421a;

        /* renamed from: d */
        public int f7422d;

        /* renamed from: e */
        public Parcelable f7423e;

        /* renamed from: androidx.viewpager2.widget.ViewPager2$SavedState$a */
        public static class C1485a implements Parcelable.ClassLoaderCreator<SavedState> {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                if (Build.VERSION.SDK_INT >= 24) {
                    return new SavedState(parcel, classLoader);
                }
                return new SavedState(parcel);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            mo10788a(parcel, classLoader);
        }

        /* renamed from: a */
        public final void mo10788a(Parcel parcel, ClassLoader classLoader) {
            this.f7421a = parcel.readInt();
            this.f7422d = parcel.readInt();
            this.f7423e = parcel.readParcelable(classLoader);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f7421a);
            parcel.writeInt(this.f7422d);
            parcel.writeParcelable(this.f7423e, i);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            mo10788a(parcel, (ClassLoader) null);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public void setCurrentItem(int i, boolean z) {
        if (!mo10752c()) {
            mo10769i(i, z);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo10751b(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo10751b(context, attributeSet);
    }
}
