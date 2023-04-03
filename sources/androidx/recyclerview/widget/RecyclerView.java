package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.customview.view.AbsSavedState;
import androidx.media3.common.PlaybackException;
import androidx.recyclerview.widget.C1268a;
import androidx.recyclerview.widget.C1280e;
import androidx.recyclerview.widget.C1310j;
import androidx.recyclerview.widget.C1339s;
import androidx.recyclerview.widget.C1346w;
import androidx.recyclerview.widget.C1349x;
import com.github.mikephil.charting.utils.Utils;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.C3335t8;

public class RecyclerView extends ViewGroup implements f54 {

    /* renamed from: p2 */
    public static final int[] f6363p2 = {16843830};

    /* renamed from: q2 */
    public static final boolean f6364q2 = false;

    /* renamed from: r2 */
    public static final boolean f6365r2 = true;

    /* renamed from: s2 */
    public static final boolean f6366s2 = true;

    /* renamed from: t2 */
    public static final boolean f6367t2 = true;

    /* renamed from: u2 */
    public static final boolean f6368u2 = false;

    /* renamed from: v2 */
    public static final boolean f6369v2 = false;

    /* renamed from: w2 */
    public static final Class<?>[] f6370w2;

    /* renamed from: x2 */
    public static final Interpolator f6371x2 = new C1233c();

    /* renamed from: A */
    public final Rect f6372A;

    /* renamed from: A1 */
    public EdgeEffect f6373A1;

    /* renamed from: B */
    public final RectF f6374B;

    /* renamed from: B1 */
    public EdgeEffect f6375B1;

    /* renamed from: C */
    public Adapter f6376C;

    /* renamed from: C1 */
    public EdgeEffect f6377C1;

    /* renamed from: D1 */
    public C1242l f6378D1;

    /* renamed from: E1 */
    public int f6379E1;

    /* renamed from: F1 */
    public int f6380F1;

    /* renamed from: G1 */
    public VelocityTracker f6381G1;

    /* renamed from: H */
    public LayoutManager f6382H;

    /* renamed from: H1 */
    public int f6383H1;

    /* renamed from: I */
    public C1255u f6384I;

    /* renamed from: I1 */
    public int f6385I1;

    /* renamed from: J1 */
    public int f6386J1;

    /* renamed from: K1 */
    public int f6387K1;

    /* renamed from: L */
    public final List<C1255u> f6388L;

    /* renamed from: L1 */
    public int f6389L1;

    /* renamed from: M */
    public final ArrayList<C1247n> f6390M;

    /* renamed from: M1 */
    public C1249p f6391M1;

    /* renamed from: N1 */
    public final int f6392N1;

    /* renamed from: O1 */
    public final int f6393O1;

    /* renamed from: P */
    public final ArrayList<C1250q> f6394P;

    /* renamed from: P1 */
    public float f6395P1;

    /* renamed from: Q */
    public C1250q f6396Q;

    /* renamed from: Q1 */
    public float f6397Q1;

    /* renamed from: R1 */
    public boolean f6398R1;

    /* renamed from: S1 */
    public final C1262z f6399S1;

    /* renamed from: T1 */
    public C1310j f6400T1;

    /* renamed from: U */
    public boolean f6401U;

    /* renamed from: U1 */
    public C1310j.C1312b f6402U1;

    /* renamed from: V1 */
    public final C1260x f6403V1;

    /* renamed from: W1 */
    public C1251r f6404W1;

    /* renamed from: X1 */
    public List<C1251r> f6405X1;

    /* renamed from: Y1 */
    public boolean f6406Y1;

    /* renamed from: Z1 */
    public boolean f6407Z1;

    /* renamed from: a */
    public final C1256v f6408a;

    /* renamed from: a2 */
    public C1242l.C1244b f6409a2;

    /* renamed from: b1 */
    public int f6410b1;

    /* renamed from: b2 */
    public boolean f6411b2;

    /* renamed from: c2 */
    public C1339s f6412c2;

    /* renamed from: d */
    public final C1254t f6413d;

    /* renamed from: d2 */
    public C1240j f6414d2;

    /* renamed from: e */
    public SavedState f6415e;

    /* renamed from: e0 */
    public boolean f6416e0;

    /* renamed from: e1 */
    public boolean f6417e1;

    /* renamed from: e2 */
    public final int[] f6418e2;

    /* renamed from: f2 */
    public g54 f6419f2;

    /* renamed from: g */
    public C1268a f6420g;

    /* renamed from: g2 */
    public final int[] f6421g2;

    /* renamed from: h2 */
    public final int[] f6422h2;

    /* renamed from: i2 */
    public final int[] f6423i2;

    /* renamed from: j2 */
    public final List<C1231a0> f6424j2;

    /* renamed from: k */
    public C1280e f6425k;

    /* renamed from: k0 */
    public boolean f6426k0;

    /* renamed from: k2 */
    public Runnable f6427k2;

    /* renamed from: l2 */
    public boolean f6428l2;

    /* renamed from: m2 */
    public int f6429m2;

    /* renamed from: n2 */
    public int f6430n2;

    /* renamed from: o1 */
    public boolean f6431o1;

    /* renamed from: o2 */
    public final C1349x.C1351b f6432o2;

    /* renamed from: p1 */
    public boolean f6433p1;

    /* renamed from: q1 */
    public int f6434q1;

    /* renamed from: r */
    public final C1349x f6435r;

    /* renamed from: r1 */
    public boolean f6436r1;

    /* renamed from: s */
    public boolean f6437s;

    /* renamed from: s1 */
    public final AccessibilityManager f6438s1;

    /* renamed from: t1 */
    public List<C1248o> f6439t1;

    /* renamed from: u1 */
    public boolean f6440u1;

    /* renamed from: v0 */
    public boolean f6441v0;

    /* renamed from: v1 */
    public boolean f6442v1;

    /* renamed from: w1 */
    public int f6443w1;

    /* renamed from: x */
    public final Runnable f6444x;

    /* renamed from: x1 */
    public int f6445x1;

    /* renamed from: y */
    public final Rect f6446y;

    /* renamed from: y1 */
    public C1241k f6447y1;

    /* renamed from: z1 */
    public EdgeEffect f6448z1;

    public static abstract class Adapter<VH extends C1231a0> {
        private boolean mHasStableIds = false;
        private final C1238h mObservable = new C1238h();
        private StateRestorationPolicy mStateRestorationPolicy = StateRestorationPolicy.ALLOW;

        public enum StateRestorationPolicy {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public final void bindViewHolder(VH vh, int i) {
            boolean z;
            if (vh.mBindingAdapter == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                vh.mPosition = i;
                if (hasStableIds()) {
                    vh.mItemId = getItemId(i);
                }
                vh.setFlags(1, 519);
                os6.m24033a("RV OnBindView");
            }
            vh.mBindingAdapter = this;
            onBindViewHolder(vh, i, vh.getUnmodifiedPayloads());
            if (z) {
                vh.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
                if (layoutParams instanceof LayoutParams) {
                    ((LayoutParams) layoutParams).f6476e = true;
                }
                os6.m24034b();
            }
        }

        public boolean canRestoreState() {
            int i = C1237g.f6484a[this.mStateRestorationPolicy.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i != 2) {
                return true;
            }
            if (getItemCount() > 0) {
                return true;
            }
            return false;
        }

        public final VH createViewHolder(ViewGroup viewGroup, int i) {
            try {
                os6.m24033a("RV CreateView");
                VH onCreateViewHolder = onCreateViewHolder(viewGroup, i);
                if (onCreateViewHolder.itemView.getParent() == null) {
                    onCreateViewHolder.mItemViewType = i;
                    return onCreateViewHolder;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                os6.m24034b();
            }
        }

        public int findRelativeAdapterPositionIn(Adapter<? extends C1231a0> adapter, C1231a0 a0Var, int i) {
            if (adapter == this) {
                return i;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i) {
            return -1;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public final StateRestorationPolicy getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.mo9384a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.mo9385b();
        }

        public final void notifyItemChanged(int i) {
            this.mObservable.mo9387d(i, 1);
        }

        public final void notifyItemInserted(int i) {
            this.mObservable.mo9389f(i, 1);
        }

        public final void notifyItemMoved(int i, int i2) {
            this.mObservable.mo9386c(i, i2);
        }

        public final void notifyItemRangeChanged(int i, int i2) {
            this.mObservable.mo9387d(i, i2);
        }

        public final void notifyItemRangeInserted(int i, int i2) {
            this.mObservable.mo9389f(i, i2);
        }

        public final void notifyItemRangeRemoved(int i, int i2) {
            this.mObservable.mo9390g(i, i2);
        }

        public final void notifyItemRemoved(int i) {
            this.mObservable.mo9390g(i, 1);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(VH vh, int i);

        public void onBindViewHolder(VH vh, int i, List<Object> list) {
            onBindViewHolder(vh, i);
        }

        public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(VH vh) {
        }

        public void onViewDetachedFromWindow(VH vh) {
        }

        public void onViewRecycled(VH vh) {
        }

        public void registerAdapterDataObserver(C1239i iVar) {
            this.mObservable.registerObserver(iVar);
        }

        public void setHasStableIds(boolean z) {
            if (!hasObservers()) {
                this.mHasStableIds = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void setStateRestorationPolicy(StateRestorationPolicy stateRestorationPolicy) {
            this.mStateRestorationPolicy = stateRestorationPolicy;
            this.mObservable.mo9391h();
        }

        public void unregisterAdapterDataObserver(C1239i iVar) {
            this.mObservable.unregisterObserver(iVar);
        }

        public final void notifyItemChanged(int i, Object obj) {
            this.mObservable.mo9388e(i, 1, obj);
        }

        public final void notifyItemRangeChanged(int i, int i2, Object obj) {
            this.mObservable.mo9388e(i, i2, obj);
        }
    }

    public static abstract class LayoutManager {

        /* renamed from: A */
        public boolean f6450A = false;

        /* renamed from: B */
        public boolean f6451B = true;

        /* renamed from: C */
        public boolean f6452C = true;

        /* renamed from: H */
        public int f6453H;

        /* renamed from: I */
        public boolean f6454I;

        /* renamed from: L */
        public int f6455L;

        /* renamed from: M */
        public int f6456M;

        /* renamed from: P */
        public int f6457P;

        /* renamed from: Q */
        public int f6458Q;

        /* renamed from: a */
        public C1280e f6459a;

        /* renamed from: d */
        public RecyclerView f6460d;

        /* renamed from: e */
        public final C1346w.C1348b f6461e;

        /* renamed from: g */
        public final C1346w.C1348b f6462g;

        /* renamed from: k */
        public C1346w f6463k;

        /* renamed from: r */
        public C1346w f6464r;

        /* renamed from: s */
        public C1257w f6465s;

        /* renamed from: x */
        public boolean f6466x = false;

        /* renamed from: y */
        public boolean f6467y = false;

        public static class Properties {

            /* renamed from: a */
            public int f6468a;

            /* renamed from: b */
            public int f6469b;

            /* renamed from: c */
            public boolean f6470c;

            /* renamed from: d */
            public boolean f6471d;
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$LayoutManager$a */
        public class C1226a implements C1346w.C1348b {
            public C1226a() {
            }

            /* renamed from: a */
            public View mo9297a(int i) {
                return LayoutManager.this.mo9231T(i);
            }

            /* renamed from: b */
            public int mo9298b(View view) {
                return LayoutManager.this.mo9243b0(view) - ((LayoutParams) view.getLayoutParams()).leftMargin;
            }

            /* renamed from: c */
            public int mo9299c() {
                return LayoutManager.this.getPaddingLeft();
            }

            /* renamed from: d */
            public int mo9300d() {
                return LayoutManager.this.mo9288v0() - LayoutManager.this.getPaddingRight();
            }

            /* renamed from: e */
            public int mo9301e(View view) {
                return LayoutManager.this.mo9247e0(view) + ((LayoutParams) view.getLayoutParams()).rightMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$LayoutManager$b */
        public class C1227b implements C1346w.C1348b {
            public C1227b() {
            }

            /* renamed from: a */
            public View mo9297a(int i) {
                return LayoutManager.this.mo9231T(i);
            }

            /* renamed from: b */
            public int mo9298b(View view) {
                return LayoutManager.this.mo9248f0(view) - ((LayoutParams) view.getLayoutParams()).topMargin;
            }

            /* renamed from: c */
            public int mo9299c() {
                return LayoutManager.this.getPaddingTop();
            }

            /* renamed from: d */
            public int mo9300d() {
                return LayoutManager.this.mo9256h0() - LayoutManager.this.getPaddingBottom();
            }

            /* renamed from: e */
            public int mo9301e(View view) {
                return LayoutManager.this.mo9241Z(view) + ((LayoutParams) view.getLayoutParams()).bottomMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$LayoutManager$c */
        public interface C1228c {
            /* renamed from: a */
            void mo9302a(int i, int i2);
        }

        public LayoutManager() {
            C1226a aVar = new C1226a();
            this.f6461e = aVar;
            C1227b bVar = new C1227b();
            this.f6462g = bVar;
            this.f6463k = new C1346w(aVar);
            this.f6464r = new C1346w(bVar);
        }

        /* renamed from: E0 */
        public static boolean m8980E0(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    return true;
                }
                if (mode == 1073741824 && size == i) {
                    return true;
                }
                return false;
            } else if (size >= i) {
                return true;
            } else {
                return false;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r5 == 1073741824) goto L_0x0020;
         */
        /* renamed from: V */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m8981V(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001a
                if (r7 < 0) goto L_0x0011
                goto L_0x001c
            L_0x0011:
                if (r7 != r1) goto L_0x002f
                if (r5 == r2) goto L_0x0020
                if (r5 == 0) goto L_0x002f
                if (r5 == r3) goto L_0x0020
                goto L_0x002f
            L_0x001a:
                if (r7 < 0) goto L_0x001e
            L_0x001c:
                r5 = r3
                goto L_0x0031
            L_0x001e:
                if (r7 != r1) goto L_0x0022
            L_0x0020:
                r7 = r4
                goto L_0x0031
            L_0x0022:
                if (r7 != r0) goto L_0x002f
                if (r5 == r2) goto L_0x002c
                if (r5 != r3) goto L_0x0029
                goto L_0x002c
            L_0x0029:
                r7 = r4
                r5 = r6
                goto L_0x0031
            L_0x002c:
                r7 = r4
                r5 = r2
                goto L_0x0031
            L_0x002f:
                r5 = r6
                r7 = r5
            L_0x0031:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.LayoutManager.m8981V(int, int, int, int, boolean):int");
        }

        /* renamed from: p0 */
        public static Properties m8982p0(Context context, AttributeSet attributeSet, int i, int i2) {
            Properties properties = new Properties();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k55.RecyclerView, i, i2);
            properties.f6468a = obtainStyledAttributes.getInt(k55.RecyclerView_android_orientation, 1);
            properties.f6469b = obtainStyledAttributes.getInt(k55.RecyclerView_spanCount, 1);
            properties.f6470c = obtainStyledAttributes.getBoolean(k55.RecyclerView_reverseLayout, false);
            properties.f6471d = obtainStyledAttributes.getBoolean(k55.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return properties;
        }

        /* renamed from: y */
        public static int m8983y(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode == Integer.MIN_VALUE) {
                return Math.min(size, Math.max(i2, i3));
            }
            if (mode != 1073741824) {
                return Math.max(i2, i3);
            }
            return size;
        }

        /* renamed from: A */
        public void mo8873A(int i, C1228c cVar) {
        }

        /* renamed from: A0 */
        public final boolean mo9195A0(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int v0 = mo9288v0() - getPaddingRight();
            int h0 = mo9256h0() - getPaddingBottom();
            Rect rect = this.f6460d.f6446y;
            mo9242a0(focusedChild, rect);
            if (rect.left - i >= v0 || rect.right - i <= paddingLeft || rect.top - i2 >= h0 || rect.bottom - i2 <= paddingTop) {
                return false;
            }
            return true;
        }

        /* renamed from: A1 */
        public boolean mo9196A1(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return mo9198B1(recyclerView, view, rect, z, false);
        }

        /* renamed from: B */
        public int mo8874B(C1260x xVar) {
            return 0;
        }

        /* renamed from: B0 */
        public final boolean mo9197B0() {
            return this.f6452C;
        }

        /* renamed from: B1 */
        public boolean mo9198B1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] W = mo9237W(view, rect);
            int i = W[0];
            int i2 = W[1];
            if ((z2 && !mo9195A0(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.mo9120s1(i, i2);
            }
            return true;
        }

        /* renamed from: C */
        public int mo8819C(C1260x xVar) {
            return 0;
        }

        /* renamed from: C0 */
        public boolean mo9199C0(C1254t tVar, C1260x xVar) {
            return false;
        }

        /* renamed from: C1 */
        public void mo9200C1() {
            RecyclerView recyclerView = this.f6460d;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* renamed from: D */
        public int mo8820D(C1260x xVar) {
            return 0;
        }

        /* renamed from: D0 */
        public boolean mo9201D0() {
            return this.f6451B;
        }

        /* renamed from: D1 */
        public void mo9202D1() {
            this.f6466x = true;
        }

        /* renamed from: E */
        public int mo8878E(C1260x xVar) {
            return 0;
        }

        /* renamed from: E1 */
        public final void mo9203E1(C1254t tVar, int i, View view) {
            C1231a0 i0 = RecyclerView.m8852i0(view);
            if (!i0.shouldIgnore()) {
                if (!i0.isInvalid() || i0.isRemoved() || this.f6460d.f6376C.hasStableIds()) {
                    mo9208I(i);
                    tVar.mo9462D(view);
                    this.f6460d.f6435r.mo10004k(i0);
                    return;
                }
                mo9296z1(i);
                tVar.mo9461C(i0);
            }
        }

        /* renamed from: F */
        public int mo8821F(C1260x xVar) {
            return 0;
        }

        /* renamed from: F0 */
        public boolean mo9204F0() {
            C1257w wVar = this.f6465s;
            if (wVar == null || !wVar.isRunning()) {
                return false;
            }
            return true;
        }

        /* renamed from: F1 */
        public int mo8822F1(int i, C1254t tVar, C1260x xVar) {
            return 0;
        }

        /* renamed from: G */
        public int mo8823G(C1260x xVar) {
            return 0;
        }

        /* renamed from: G0 */
        public boolean mo9205G0(View view, boolean z, boolean z2) {
            boolean z3;
            if (!this.f6463k.mo9988b(view, 24579) || !this.f6464r.mo9988b(view, 24579)) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z) {
                return z3;
            }
            return !z3;
        }

        /* renamed from: G1 */
        public void mo8881G1(int i) {
        }

        /* renamed from: H */
        public void mo9206H(C1254t tVar) {
            for (int U = mo9234U() - 1; U >= 0; U--) {
                mo9203E1(tVar, U, mo9231T(U));
            }
        }

        /* renamed from: H0 */
        public void mo9207H0(View view, int i, int i2, int i3, int i4) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rect = layoutParams.f6475d;
            view.layout(i + rect.left + layoutParams.leftMargin, i2 + rect.top + layoutParams.topMargin, (i3 - rect.right) - layoutParams.rightMargin, (i4 - rect.bottom) - layoutParams.bottomMargin);
        }

        /* renamed from: H1 */
        public int mo8824H1(int i, C1254t tVar, C1260x xVar) {
            return 0;
        }

        /* renamed from: I */
        public void mo9208I(int i) {
            mo9211J(i, mo9231T(i));
        }

        /* renamed from: I0 */
        public void mo9209I0(View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect n0 = this.f6460d.mo9088n0(view);
            int i3 = i + n0.left + n0.right;
            int i4 = i2 + n0.top + n0.bottom;
            int V = m8981V(mo9288v0(), mo9290w0(), getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin + i3, layoutParams.width, mo8929v());
            int V2 = m8981V(mo9256h0(), mo9258i0(), getPaddingTop() + getPaddingBottom() + layoutParams.topMargin + layoutParams.bottomMargin + i4, layoutParams.height, mo8931w());
            if (mo9225O1(view, V, V2, layoutParams)) {
                view.measure(V, V2);
            }
        }

        /* renamed from: I1 */
        public void mo9210I1(RecyclerView recyclerView) {
            mo9213J1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* renamed from: J */
        public final void mo9211J(int i, View view) {
            this.f6459a.mo9712d(i);
        }

        /* renamed from: J0 */
        public void mo9212J0(int i, int i2) {
            View T = mo9231T(i);
            if (T != null) {
                mo9208I(i);
                mo9279s(T, i2);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.f6460d.toString());
        }

        /* renamed from: J1 */
        public void mo9213J1(int i, int i2) {
            this.f6457P = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.f6455L = mode;
            if (mode == 0 && !RecyclerView.f6365r2) {
                this.f6457P = 0;
            }
            this.f6458Q = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f6456M = mode2;
            if (mode2 == 0 && !RecyclerView.f6365r2) {
                this.f6458Q = 0;
            }
        }

        /* renamed from: K */
        public void mo9214K(RecyclerView recyclerView) {
            this.f6467y = true;
            mo9224O0(recyclerView);
        }

        /* renamed from: K0 */
        public void mo9215K0(int i) {
            RecyclerView recyclerView = this.f6460d;
            if (recyclerView != null) {
                recyclerView.mo8971E0(i);
            }
        }

        /* renamed from: K1 */
        public void mo9216K1(int i, int i2) {
            this.f6460d.setMeasuredDimension(i, i2);
        }

        /* renamed from: L */
        public void mo9217L(RecyclerView recyclerView, C1254t tVar) {
            this.f6467y = false;
            mo8893Q0(recyclerView, tVar);
        }

        /* renamed from: L0 */
        public void mo9218L0(int i) {
            RecyclerView recyclerView = this.f6460d;
            if (recyclerView != null) {
                recyclerView.mo8973F0(i);
            }
        }

        /* renamed from: L1 */
        public void mo8825L1(Rect rect, int i, int i2) {
            mo9216K1(m8983y(i, rect.width() + getPaddingLeft() + getPaddingRight(), mo9268n0()), m8983y(i2, rect.height() + getPaddingTop() + getPaddingBottom(), mo9265m0()));
        }

        /* renamed from: M */
        public View mo9219M(View view) {
            View T;
            RecyclerView recyclerView = this.f6460d;
            if (recyclerView == null || (T = recyclerView.mo9000T(view)) == null || this.f6459a.mo9722n(T)) {
                return null;
            }
            return T;
        }

        /* renamed from: M0 */
        public void mo9220M0(Adapter adapter, Adapter adapter2) {
        }

        /* renamed from: M1 */
        public void mo9221M1(int i, int i2) {
            int U = mo9234U();
            if (U == 0) {
                this.f6460d.mo9159x(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MIN_VALUE;
            for (int i7 = 0; i7 < U; i7++) {
                View T = mo9231T(i7);
                Rect rect = this.f6460d.f6446y;
                mo9242a0(T, rect);
                int i8 = rect.left;
                if (i8 < i4) {
                    i4 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i5) {
                    i5 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i6) {
                    i6 = i11;
                }
            }
            this.f6460d.f6446y.set(i4, i5, i3, i6);
            mo8825L1(this.f6460d.f6446y, i, i2);
        }

        /* renamed from: N */
        public View mo8888N(int i) {
            int U = mo9234U();
            for (int i2 = 0; i2 < U; i2++) {
                View T = mo9231T(i2);
                C1231a0 i0 = RecyclerView.m8852i0(T);
                if (i0 != null && i0.getLayoutPosition() == i && !i0.shouldIgnore() && (this.f6460d.f6403V1.mo9528e() || !i0.isRemoved())) {
                    return T;
                }
            }
            return null;
        }

        /* renamed from: N0 */
        public boolean mo9222N0(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        /* renamed from: N1 */
        public void mo9223N1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f6460d = null;
                this.f6459a = null;
                this.f6457P = 0;
                this.f6458Q = 0;
            } else {
                this.f6460d = recyclerView;
                this.f6459a = recyclerView.f6425k;
                this.f6457P = recyclerView.getWidth();
                this.f6458Q = recyclerView.getHeight();
            }
            this.f6455L = 1073741824;
            this.f6456M = 1073741824;
        }

        /* renamed from: O */
        public abstract LayoutParams mo8827O();

        /* renamed from: O0 */
        public void mo9224O0(RecyclerView recyclerView) {
        }

        /* renamed from: O1 */
        public boolean mo9225O1(View view, int i, int i2, LayoutParams layoutParams) {
            if (view.isLayoutRequested() || !this.f6451B || !m8980E0(view.getWidth(), i, layoutParams.width) || !m8980E0(view.getHeight(), i2, layoutParams.height)) {
                return true;
            }
            return false;
        }

        /* renamed from: P */
        public LayoutParams mo8828P(Context context, AttributeSet attributeSet) {
            return new LayoutParams(context, attributeSet);
        }

        @Deprecated
        /* renamed from: P0 */
        public void mo9226P0(RecyclerView recyclerView) {
        }

        /* renamed from: P1 */
        public boolean mo8891P1() {
            return false;
        }

        /* renamed from: Q */
        public LayoutParams mo8829Q(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof LayoutParams) {
                return new LayoutParams((LayoutParams) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new LayoutParams(layoutParams);
        }

        /* renamed from: Q0 */
        public void mo8893Q0(RecyclerView recyclerView, C1254t tVar) {
            mo9226P0(recyclerView);
        }

        /* renamed from: Q1 */
        public boolean mo9227Q1(View view, int i, int i2, LayoutParams layoutParams) {
            if (!this.f6451B || !m8980E0(view.getMeasuredWidth(), i, layoutParams.width) || !m8980E0(view.getMeasuredHeight(), i2, layoutParams.height)) {
                return true;
            }
            return false;
        }

        /* renamed from: R */
        public int mo9228R() {
            return -1;
        }

        /* renamed from: R0 */
        public View mo8830R0(View view, int i, C1254t tVar, C1260x xVar) {
            return null;
        }

        /* renamed from: R1 */
        public void mo8895R1(RecyclerView recyclerView, C1260x xVar, int i) {
        }

        /* renamed from: S */
        public int mo9229S(View view) {
            return ((LayoutParams) view.getLayoutParams()).f6475d.bottom;
        }

        /* renamed from: S0 */
        public void mo8897S0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f6460d;
            mo9232T0(recyclerView.f6413d, recyclerView.f6403V1, accessibilityEvent);
        }

        /* renamed from: S1 */
        public void mo9230S1(C1257w wVar) {
            C1257w wVar2 = this.f6465s;
            if (!(wVar2 == null || wVar == wVar2 || !wVar2.isRunning())) {
                this.f6465s.stop();
            }
            this.f6465s = wVar;
            wVar.start(this.f6460d, this);
        }

        /* renamed from: T */
        public View mo9231T(int i) {
            C1280e eVar = this.f6459a;
            if (eVar != null) {
                return eVar.mo9714f(i);
            }
            return null;
        }

        /* renamed from: T0 */
        public void mo9232T0(C1254t tVar, C1260x xVar, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f6460d;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.f6460d.canScrollVertically(-1) && !this.f6460d.canScrollHorizontally(-1) && !this.f6460d.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                Adapter adapter = this.f6460d.f6376C;
                if (adapter != null) {
                    accessibilityEvent.setItemCount(adapter.getItemCount());
                }
            }
        }

        /* renamed from: T1 */
        public void mo9233T1() {
            C1257w wVar = this.f6465s;
            if (wVar != null) {
                wVar.stop();
            }
        }

        /* renamed from: U */
        public int mo9234U() {
            C1280e eVar = this.f6459a;
            if (eVar != null) {
                return eVar.mo9715g();
            }
            return 0;
        }

        /* renamed from: U0 */
        public void mo9235U0(C3335t8 t8Var) {
            RecyclerView recyclerView = this.f6460d;
            mo9236V0(recyclerView.f6413d, recyclerView.f6403V1, t8Var);
        }

        /* renamed from: U1 */
        public boolean mo8831U1() {
            return false;
        }

        /* renamed from: V0 */
        public void mo9236V0(C1254t tVar, C1260x xVar, C3335t8 t8Var) {
            if (this.f6460d.canScrollVertically(-1) || this.f6460d.canScrollHorizontally(-1)) {
                t8Var.mo26227a(8192);
                t8Var.mo26199G0(true);
            }
            if (this.f6460d.canScrollVertically(1) || this.f6460d.canScrollHorizontally(1)) {
                t8Var.mo26227a(4096);
                t8Var.mo26199G0(true);
            }
            t8Var.mo26243h0(C3335t8.C3337b.m27595b(mo8861r0(tVar, xVar), mo8837Y(tVar, xVar), mo9199C0(tVar, xVar), mo9280s0(tVar, xVar)));
        }

        /* renamed from: W */
        public final int[] mo9237W(View view, Rect rect) {
            int[] iArr = new int[2];
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int v0 = mo9288v0() - getPaddingRight();
            int h0 = mo9256h0() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i = left - paddingLeft;
            int min = Math.min(0, i);
            int i2 = top - paddingTop;
            int min2 = Math.min(0, i2);
            int i3 = width - v0;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height - h0);
            if (mo9262k0() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        /* renamed from: W0 */
        public void mo9238W0(View view, C3335t8 t8Var) {
            C1231a0 i0 = RecyclerView.m8852i0(view);
            if (i0 != null && !i0.isRemoved() && !this.f6459a.mo9722n(i0.itemView)) {
                RecyclerView recyclerView = this.f6460d;
                mo8836X0(recyclerView.f6413d, recyclerView.f6403V1, view, t8Var);
            }
        }

        /* renamed from: X */
        public boolean mo9239X() {
            RecyclerView recyclerView = this.f6460d;
            if (recyclerView == null || !recyclerView.f6437s) {
                return false;
            }
            return true;
        }

        /* renamed from: X0 */
        public void mo8836X0(C1254t tVar, C1260x xVar, View view, C3335t8 t8Var) {
        }

        /* renamed from: Y */
        public int mo8837Y(C1254t tVar, C1260x xVar) {
            return -1;
        }

        /* renamed from: Y0 */
        public View mo9240Y0(View view, int i) {
            return null;
        }

        /* renamed from: Z */
        public int mo9241Z(View view) {
            return view.getBottom() + mo9229S(view);
        }

        /* renamed from: Z0 */
        public void mo8839Z0(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: a0 */
        public void mo9242a0(View view, Rect rect) {
            RecyclerView.m8853k0(view, rect);
        }

        /* renamed from: a1 */
        public void mo8841a1(RecyclerView recyclerView) {
        }

        /* renamed from: b0 */
        public int mo9243b0(View view) {
            return view.getLeft() - mo9263l0(view);
        }

        /* renamed from: b1 */
        public void mo8843b1(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        /* renamed from: c0 */
        public int mo9244c0(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f6475d;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* renamed from: c1 */
        public void mo8845c1(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: d0 */
        public int mo9245d0(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f6475d;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* renamed from: d1 */
        public void mo9246d1(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: e0 */
        public int mo9247e0(View view) {
            return view.getRight() + mo9276q0(view);
        }

        /* renamed from: e1 */
        public void mo8848e1(RecyclerView recyclerView, int i, int i2, Object obj) {
            mo9246d1(recyclerView, i, i2);
        }

        /* renamed from: f0 */
        public int mo9248f0(View view) {
            return view.getTop() - mo9283t0(view);
        }

        /* renamed from: f1 */
        public void mo8850f1(C1254t tVar, C1260x xVar) {
        }

        /* renamed from: g0 */
        public View mo9249g0() {
            View focusedChild;
            RecyclerView recyclerView = this.f6460d;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f6459a.mo9722n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* renamed from: g1 */
        public void mo8852g1(C1260x xVar) {
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.f6460d;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingEnd() {
            RecyclerView recyclerView = this.f6460d;
            if (recyclerView != null) {
                return ga7.m17723F(recyclerView);
            }
            return 0;
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.f6460d;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.f6460d;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingStart() {
            RecyclerView recyclerView = this.f6460d;
            if (recyclerView != null) {
                return ga7.m17725G(recyclerView);
            }
            return 0;
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.f6460d;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* renamed from: h0 */
        public int mo9256h0() {
            return this.f6458Q;
        }

        /* renamed from: h1 */
        public void mo9257h1(C1254t tVar, C1260x xVar, int i, int i2) {
            this.f6460d.mo9159x(i, i2);
        }

        /* renamed from: i0 */
        public int mo9258i0() {
            return this.f6456M;
        }

        @Deprecated
        /* renamed from: i1 */
        public boolean mo9259i1(RecyclerView recyclerView, View view, View view2) {
            if (mo9204F0() || recyclerView.mo9163y0()) {
                return true;
            }
            return false;
        }

        /* renamed from: j0 */
        public int mo9260j0() {
            Adapter adapter;
            RecyclerView recyclerView = this.f6460d;
            if (recyclerView != null) {
                adapter = recyclerView.getAdapter();
            } else {
                adapter = null;
            }
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        /* renamed from: j1 */
        public boolean mo9261j1(RecyclerView recyclerView, C1260x xVar, View view, View view2) {
            return mo9259i1(recyclerView, view, view2);
        }

        /* renamed from: k0 */
        public int mo9262k0() {
            return ga7.m17715B(this.f6460d);
        }

        /* renamed from: k1 */
        public void mo8916k1(Parcelable parcelable) {
        }

        /* renamed from: l0 */
        public int mo9263l0(View view) {
            return ((LayoutParams) view.getLayoutParams()).f6475d.left;
        }

        /* renamed from: l1 */
        public Parcelable mo8918l1() {
            return null;
        }

        /* renamed from: m */
        public void mo9264m(View view) {
            mo9267n(view, -1);
        }

        /* renamed from: m0 */
        public int mo9265m0() {
            return ga7.m17717C(this.f6460d);
        }

        /* renamed from: m1 */
        public void mo9266m1(int i) {
        }

        /* renamed from: n */
        public void mo9267n(View view, int i) {
            mo9275q(view, i, true);
        }

        /* renamed from: n0 */
        public int mo9268n0() {
            return ga7.m17719D(this.f6460d);
        }

        /* renamed from: n1 */
        public void mo9269n1(C1257w wVar) {
            if (this.f6465s == wVar) {
                this.f6465s = null;
            }
        }

        /* renamed from: o */
        public void mo9270o(View view) {
            mo9273p(view, -1);
        }

        /* renamed from: o0 */
        public int mo9271o0(View view) {
            return ((LayoutParams) view.getLayoutParams()).mo9303a();
        }

        /* renamed from: o1 */
        public boolean mo9272o1(int i, Bundle bundle) {
            RecyclerView recyclerView = this.f6460d;
            return mo9274p1(recyclerView.f6413d, recyclerView.f6403V1, i, bundle);
        }

        /* renamed from: p */
        public void mo9273p(View view, int i) {
            mo9275q(view, i, false);
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0075 A[ADDED_TO_REGION] */
        /* renamed from: p1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo9274p1(androidx.recyclerview.widget.RecyclerView.C1254t r8, androidx.recyclerview.widget.RecyclerView.C1260x r9, int r10, android.os.Bundle r11) {
            /*
                r7 = this;
                androidx.recyclerview.widget.RecyclerView r8 = r7.f6460d
                r9 = 0
                if (r8 != 0) goto L_0x0006
                return r9
            L_0x0006:
                r11 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r10 == r11) goto L_0x0042
                r11 = 8192(0x2000, float:1.14794E-41)
                if (r10 == r11) goto L_0x0012
                r2 = r9
                r3 = r2
                goto L_0x0073
            L_0x0012:
                r10 = -1
                boolean r8 = r8.canScrollVertically(r10)
                if (r8 == 0) goto L_0x0029
                int r8 = r7.mo9256h0()
                int r11 = r7.getPaddingTop()
                int r8 = r8 - r11
                int r11 = r7.getPaddingBottom()
                int r8 = r8 - r11
                int r8 = -r8
                goto L_0x002a
            L_0x0029:
                r8 = r9
            L_0x002a:
                androidx.recyclerview.widget.RecyclerView r11 = r7.f6460d
                boolean r10 = r11.canScrollHorizontally(r10)
                if (r10 == 0) goto L_0x0071
                int r10 = r7.mo9288v0()
                int r11 = r7.getPaddingLeft()
                int r10 = r10 - r11
                int r11 = r7.getPaddingRight()
                int r10 = r10 - r11
                int r10 = -r10
                goto L_0x006e
            L_0x0042:
                boolean r8 = r8.canScrollVertically(r0)
                if (r8 == 0) goto L_0x0057
                int r8 = r7.mo9256h0()
                int r10 = r7.getPaddingTop()
                int r8 = r8 - r10
                int r10 = r7.getPaddingBottom()
                int r8 = r8 - r10
                goto L_0x0058
            L_0x0057:
                r8 = r9
            L_0x0058:
                androidx.recyclerview.widget.RecyclerView r10 = r7.f6460d
                boolean r10 = r10.canScrollHorizontally(r0)
                if (r10 == 0) goto L_0x0071
                int r10 = r7.mo9288v0()
                int r11 = r7.getPaddingLeft()
                int r10 = r10 - r11
                int r11 = r7.getPaddingRight()
                int r10 = r10 - r11
            L_0x006e:
                r3 = r8
                r2 = r10
                goto L_0x0073
            L_0x0071:
                r3 = r8
                r2 = r9
            L_0x0073:
                if (r3 != 0) goto L_0x0078
                if (r2 != 0) goto L_0x0078
                return r9
            L_0x0078:
                androidx.recyclerview.widget.RecyclerView r1 = r7.f6460d
                r4 = 0
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r6 = 1
                r1.mo9155v1(r2, r3, r4, r5, r6)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.LayoutManager.mo9274p1(androidx.recyclerview.widget.RecyclerView$t, androidx.recyclerview.widget.RecyclerView$x, int, android.os.Bundle):boolean");
        }

        /* renamed from: q */
        public final void mo9275q(View view, int i, boolean z) {
            C1231a0 i0 = RecyclerView.m8852i0(view);
            if (z || i0.isRemoved()) {
                this.f6460d.f6435r.mo9995b(i0);
            } else {
                this.f6460d.f6435r.mo10009p(i0);
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (i0.wasReturnedFromScrap() || i0.isScrap()) {
                if (i0.isScrap()) {
                    i0.unScrap();
                } else {
                    i0.clearReturnedFromScrapFlag();
                }
                this.f6459a.mo9711c(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f6460d) {
                int m = this.f6459a.mo9721m(view);
                if (i == -1) {
                    i = this.f6459a.mo9715g();
                }
                if (m == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f6460d.indexOfChild(view) + this.f6460d.mo8994Q());
                } else if (m != i) {
                    this.f6460d.f6382H.mo9212J0(m, i);
                }
            } else {
                this.f6459a.mo9709a(view, i, false);
                layoutParams.f6476e = true;
                C1257w wVar = this.f6465s;
                if (wVar != null && wVar.isRunning()) {
                    this.f6465s.onChildAttachedToWindow(view);
                }
            }
            if (layoutParams.f6477g) {
                i0.itemView.invalidate();
                layoutParams.f6477g = false;
            }
        }

        /* renamed from: q0 */
        public int mo9276q0(View view) {
            return ((LayoutParams) view.getLayoutParams()).f6475d.right;
        }

        /* renamed from: q1 */
        public boolean mo9277q1(View view, int i, Bundle bundle) {
            RecyclerView recyclerView = this.f6460d;
            return mo9278r1(recyclerView.f6413d, recyclerView.f6403V1, view, i, bundle);
        }

        /* renamed from: r */
        public void mo8924r(String str) {
            RecyclerView recyclerView = this.f6460d;
            if (recyclerView != null) {
                recyclerView.mo9105p(str);
            }
        }

        /* renamed from: r0 */
        public int mo8861r0(C1254t tVar, C1260x xVar) {
            return -1;
        }

        /* renamed from: r1 */
        public boolean mo9278r1(C1254t tVar, C1260x xVar, View view, int i, Bundle bundle) {
            return false;
        }

        /* renamed from: s */
        public void mo9279s(View view, int i) {
            mo9282t(view, i, (LayoutParams) view.getLayoutParams());
        }

        /* renamed from: s0 */
        public int mo9280s0(C1254t tVar, C1260x xVar) {
            return 0;
        }

        /* renamed from: s1 */
        public void mo9281s1() {
            for (int U = mo9234U() - 1; U >= 0; U--) {
                this.f6459a.mo9725q(U);
            }
        }

        /* renamed from: t */
        public void mo9282t(View view, int i, LayoutParams layoutParams) {
            C1231a0 i0 = RecyclerView.m8852i0(view);
            if (i0.isRemoved()) {
                this.f6460d.f6435r.mo9995b(i0);
            } else {
                this.f6460d.f6435r.mo10009p(i0);
            }
            this.f6459a.mo9711c(view, i, layoutParams, i0.isRemoved());
        }

        /* renamed from: t0 */
        public int mo9283t0(View view) {
            return ((LayoutParams) view.getLayoutParams()).f6475d.top;
        }

        /* renamed from: t1 */
        public void mo9284t1(C1254t tVar) {
            for (int U = mo9234U() - 1; U >= 0; U--) {
                if (!RecyclerView.m8852i0(mo9231T(U)).shouldIgnore()) {
                    mo9291w1(U, tVar);
                }
            }
        }

        /* renamed from: u */
        public void mo9285u(View view, Rect rect) {
            RecyclerView recyclerView = this.f6460d;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.mo9088n0(view));
            }
        }

        /* renamed from: u0 */
        public void mo9286u0(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((LayoutParams) view.getLayoutParams()).f6475d;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.f6460d == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f6460d.f6374B;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: u1 */
        public void mo9287u1(C1254t tVar) {
            int j = tVar.mo9481j();
            for (int i = j - 1; i >= 0; i--) {
                View n = tVar.mo9485n(i);
                C1231a0 i0 = RecyclerView.m8852i0(n);
                if (!i0.shouldIgnore()) {
                    i0.setIsRecyclable(false);
                    if (i0.isTmpDetached()) {
                        this.f6460d.removeDetachedView(n, false);
                    }
                    C1242l lVar = this.f6460d.f6378D1;
                    if (lVar != null) {
                        lVar.endAnimation(i0);
                    }
                    i0.setIsRecyclable(true);
                    tVar.mo9496y(n);
                }
            }
            tVar.mo9476e();
            if (j > 0) {
                this.f6460d.invalidate();
            }
        }

        /* renamed from: v */
        public boolean mo8929v() {
            return false;
        }

        /* renamed from: v0 */
        public int mo9288v0() {
            return this.f6457P;
        }

        /* renamed from: v1 */
        public void mo9289v1(View view, C1254t tVar) {
            mo9295y1(view);
            tVar.mo9460B(view);
        }

        /* renamed from: w */
        public boolean mo8931w() {
            return false;
        }

        /* renamed from: w0 */
        public int mo9290w0() {
            return this.f6455L;
        }

        /* renamed from: w1 */
        public void mo9291w1(int i, C1254t tVar) {
            View T = mo9231T(i);
            mo9296z1(i);
            tVar.mo9460B(T);
        }

        /* renamed from: x */
        public boolean mo8862x(LayoutParams layoutParams) {
            return layoutParams != null;
        }

        /* renamed from: x0 */
        public boolean mo9292x0() {
            int U = mo9234U();
            for (int i = 0; i < U; i++) {
                ViewGroup.LayoutParams layoutParams = mo9231T(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: x1 */
        public boolean mo9293x1(Runnable runnable) {
            RecyclerView recyclerView = this.f6460d;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        /* renamed from: y0 */
        public boolean mo9294y0() {
            return this.f6467y;
        }

        /* renamed from: y1 */
        public void mo9295y1(View view) {
            this.f6459a.mo9724p(view);
        }

        /* renamed from: z */
        public void mo8934z(int i, int i2, C1260x xVar, C1228c cVar) {
        }

        /* renamed from: z0 */
        public boolean mo8935z0() {
            return this.f6450A;
        }

        /* renamed from: z1 */
        public void mo9296z1(int i) {
            if (mo9231T(i) != null) {
                this.f6459a.mo9725q(i);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    public class C1230a implements Runnable {
        public C1230a() {
        }

        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f6441v0 && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.f6401U) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.f6431o1) {
                    recyclerView2.f6417e1 = true;
                } else {
                    recyclerView2.mo9153v();
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a0 */
    public static abstract class C1231a0 {
        public static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        public static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        public static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        public static final int FLAG_BOUND = 1;
        public static final int FLAG_IGNORE = 128;
        public static final int FLAG_INVALID = 4;
        public static final int FLAG_MOVED = 2048;
        public static final int FLAG_NOT_RECYCLABLE = 16;
        public static final int FLAG_REMOVED = 8;
        public static final int FLAG_RETURNED_FROM_SCRAP = 32;
        public static final int FLAG_TMP_DETACHED = 256;
        public static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        public static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        public Adapter<? extends C1231a0> mBindingAdapter;
        public int mFlags;
        public boolean mInChangeScrap = false;
        private int mIsRecyclableCount = 0;
        public long mItemId = -1;
        public int mItemViewType = -1;
        public WeakReference<RecyclerView> mNestedRecyclerView;
        public int mOldPosition = -1;
        public RecyclerView mOwnerRecyclerView;
        public List<Object> mPayloads = null;
        public int mPendingAccessibilityState = -1;
        public int mPosition = -1;
        public int mPreLayoutPosition = -1;
        public C1254t mScrapContainer = null;
        public C1231a0 mShadowedHolder = null;
        public C1231a0 mShadowingHolder = null;
        public List<Object> mUnmodifiedPayloads = null;
        private int mWasImportantForAccessibilityBeforeHidden = 0;

        public C1231a0(View view) {
            if (view != null) {
                this.itemView = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(FLAG_ADAPTER_FULLUPDATE);
            } else if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        public void addFlags(int i) {
            this.mFlags = i | this.mFlags;
        }

        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        public boolean doesTransientStatePreventRecycling() {
            if ((this.mFlags & 16) != 0 || !ga7.m17744Q(this.itemView)) {
                return false;
            }
            return true;
        }

        public void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
            addFlags(8);
            offsetPosition(i2, z);
            this.mPosition = i;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.mo9028d0(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public final Adapter<? extends C1231a0> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            Adapter adapter;
            int d0;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (d0 = this.mOwnerRecyclerView.mo9028d0(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, d0);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i = this.mPreLayoutPosition;
            if (i == -1) {
                return this.mPosition;
            }
            return i;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i = this.mPreLayoutPosition;
            if (i == -1) {
                return this.mPosition;
            }
            return i;
        }

        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & FLAG_ADAPTER_FULLUPDATE) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            if (list == null || list.size() == 0) {
                return FULLUPDATE_PAYLOADS;
            }
            return this.mUnmodifiedPayloads;
        }

        public boolean hasAnyOfTheFlags(int i) {
            if ((i & this.mFlags) != 0) {
                return true;
            }
            return false;
        }

        public boolean isAdapterPositionUnknown() {
            if ((this.mFlags & FLAG_ADAPTER_POSITION_UNKNOWN) != 0 || isInvalid()) {
                return true;
            }
            return false;
        }

        public boolean isAttachedToTransitionOverlay() {
            if (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) {
                return false;
            }
            return true;
        }

        public boolean isBound() {
            if ((this.mFlags & 1) != 0) {
                return true;
            }
            return false;
        }

        public boolean isInvalid() {
            if ((this.mFlags & 4) != 0) {
                return true;
            }
            return false;
        }

        public final boolean isRecyclable() {
            if ((this.mFlags & 16) != 0 || ga7.m17744Q(this.itemView)) {
                return false;
            }
            return true;
        }

        public boolean isRemoved() {
            if ((this.mFlags & 8) != 0) {
                return true;
            }
            return false;
        }

        public boolean isScrap() {
            if (this.mScrapContainer != null) {
                return true;
            }
            return false;
        }

        public boolean isTmpDetached() {
            if ((this.mFlags & 256) != 0) {
                return true;
            }
            return false;
        }

        public boolean isUpdated() {
            if ((this.mFlags & 2) != 0) {
                return true;
            }
            return false;
        }

        public boolean needsUpdate() {
            if ((this.mFlags & 2) != 0) {
                return true;
            }
            return false;
        }

        public void offsetPosition(int i, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i;
            }
            this.mPosition += i;
            if (this.itemView.getLayoutParams() != null) {
                ((LayoutParams) this.itemView.getLayoutParams()).f6476e = true;
            }
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i = this.mPendingAccessibilityState;
            if (i != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = ga7.m17804z(this.itemView);
            }
            recyclerView.mo9110q1(this, 4);
        }

        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.mo9110q1(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.m8854s(this);
        }

        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public void setFlags(int i, int i2) {
            this.mFlags = (i & i2) | (this.mFlags & (~i2));
        }

        public final void setIsRecyclable(boolean z) {
            int i;
            int i2 = this.mIsRecyclableCount;
            if (z) {
                i = i2 - 1;
            } else {
                i = i2 + 1;
            }
            this.mIsRecyclableCount = i;
            if (i < 0) {
                this.mIsRecyclableCount = 0;
                StringBuilder sb = new StringBuilder();
                sb.append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
                sb.append(this);
            } else if (!z && i == 1) {
                this.mFlags |= 16;
            } else if (z && i == 0) {
                this.mFlags &= -17;
            }
        }

        public void setScrapContainer(C1254t tVar, boolean z) {
            this.mScrapContainer = tVar;
            this.mInChangeScrap = z;
        }

        public boolean shouldBeKeptAsChild() {
            if ((this.mFlags & 16) != 0) {
                return true;
            }
            return false;
        }

        public boolean shouldIgnore() {
            if ((this.mFlags & 128) != 0) {
                return true;
            }
            return false;
        }

        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            String str;
            String str2;
            if (getClass().isAnonymousClass()) {
                str = "ViewHolder";
            } else {
                str = getClass().getSimpleName();
            }
            StringBuilder sb = new StringBuilder(str + "{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb.append(" scrap ");
                if (this.mInChangeScrap) {
                    str2 = "[changeScrap]";
                } else {
                    str2 = "[attachedScrap]";
                }
                sb.append(str2);
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public void unScrap() {
            this.mScrapContainer.mo9468J(this);
        }

        public boolean wasReturnedFromScrap() {
            if ((this.mFlags & 32) != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    public class C1232b implements Runnable {
        public C1232b() {
        }

        public void run() {
            C1242l lVar = RecyclerView.this.f6378D1;
            if (lVar != null) {
                lVar.runPendingAnimations();
            }
            RecyclerView.this.f6411b2 = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c */
    public class C1233c implements Interpolator {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    public class C1234d implements C1349x.C1351b {
        public C1234d() {
        }

        /* renamed from: a */
        public void mo9360a(C1231a0 a0Var, C1242l.C1245c cVar, C1242l.C1245c cVar2) {
            RecyclerView.this.mo9084m(a0Var, cVar, cVar2);
        }

        /* renamed from: b */
        public void mo9361b(C1231a0 a0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f6382H.mo9289v1(a0Var.itemView, recyclerView.f6413d);
        }

        /* renamed from: c */
        public void mo9362c(C1231a0 a0Var, C1242l.C1245c cVar, C1242l.C1245c cVar2) {
            RecyclerView.this.f6413d.mo9468J(a0Var);
            RecyclerView.this.mo9090o(a0Var, cVar, cVar2);
        }

        /* renamed from: d */
        public void mo9363d(C1231a0 a0Var, C1242l.C1245c cVar, C1242l.C1245c cVar2) {
            a0Var.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f6440u1) {
                if (recyclerView.f6378D1.animateChange(a0Var, a0Var, cVar, cVar2)) {
                    RecyclerView.this.mo8997R0();
                }
            } else if (recyclerView.f6378D1.animatePersistence(a0Var, cVar, cVar2)) {
                RecyclerView.this.mo8997R0();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    public class C1235e implements C1280e.C1282b {
        public C1235e() {
        }

        /* renamed from: a */
        public View mo9364a(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        /* renamed from: b */
        public void mo9365b(View view) {
            C1231a0 i0 = RecyclerView.m8852i0(view);
            if (i0 != null) {
                i0.onEnteredHiddenState(RecyclerView.this);
            }
        }

        /* renamed from: c */
        public int mo9366c() {
            return RecyclerView.this.getChildCount();
        }

        /* renamed from: d */
        public C1231a0 mo9367d(View view) {
            return RecyclerView.m8852i0(view);
        }

        /* renamed from: e */
        public void mo9368e(int i) {
            C1231a0 i0;
            View a = mo9364a(i);
            if (!(a == null || (i0 = RecyclerView.m8852i0(a)) == null)) {
                if (!i0.isTmpDetached() || i0.shouldIgnore()) {
                    i0.addFlags(256);
                } else {
                    throw new IllegalArgumentException("called detach on an already detached child " + i0 + RecyclerView.this.mo8994Q());
                }
            }
            RecyclerView.this.detachViewFromParent(i);
        }

        /* renamed from: f */
        public void mo9369f(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.mo9165z(view);
        }

        /* renamed from: g */
        public void mo9370g() {
            int c = mo9366c();
            for (int i = 0; i < c; i++) {
                View a = mo9364a(i);
                RecyclerView.this.mo8958A(a);
                a.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        /* renamed from: h */
        public int mo9371h(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        /* renamed from: i */
        public void mo9372i(View view) {
            C1231a0 i0 = RecyclerView.m8852i0(view);
            if (i0 != null) {
                i0.onLeftHiddenState(RecyclerView.this);
            }
        }

        /* renamed from: j */
        public void mo9373j(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.mo8958A(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }

        /* renamed from: k */
        public void mo9374k(View view, int i, ViewGroup.LayoutParams layoutParams) {
            C1231a0 i0 = RecyclerView.m8852i0(view);
            if (i0 != null) {
                if (i0.isTmpDetached() || i0.shouldIgnore()) {
                    i0.clearTmpDetachFlag();
                } else {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + i0 + RecyclerView.this.mo8994Q());
                }
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f */
    public class C1236f implements C1268a.C1269a {
        public C1236f() {
        }

        /* renamed from: a */
        public void mo9375a(int i, int i2) {
            RecyclerView.this.mo8977H0(i, i2);
            RecyclerView.this.f6406Y1 = true;
        }

        /* renamed from: b */
        public void mo9376b(C1268a.C1270b bVar) {
            mo9383i(bVar);
        }

        /* renamed from: c */
        public void mo9377c(C1268a.C1270b bVar) {
            mo9383i(bVar);
        }

        /* renamed from: d */
        public void mo9378d(int i, int i2) {
            RecyclerView.this.mo8979I0(i, i2, false);
            RecyclerView.this.f6406Y1 = true;
        }

        /* renamed from: e */
        public void mo9379e(int i, int i2, Object obj) {
            RecyclerView.this.mo8969D1(i, i2, obj);
            RecyclerView.this.f6407Z1 = true;
        }

        /* renamed from: f */
        public C1231a0 mo9380f(int i) {
            C1231a0 b0 = RecyclerView.this.mo9017b0(i, true);
            if (b0 != null && !RecyclerView.this.f6425k.mo9722n(b0.itemView)) {
                return b0;
            }
            return null;
        }

        /* renamed from: g */
        public void mo9381g(int i, int i2) {
            RecyclerView.this.mo8975G0(i, i2);
            RecyclerView.this.f6406Y1 = true;
        }

        /* renamed from: h */
        public void mo9382h(int i, int i2) {
            RecyclerView.this.mo8979I0(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f6406Y1 = true;
            recyclerView.f6403V1.f6515d += i2;
        }

        /* renamed from: i */
        public void mo9383i(C1268a.C1270b bVar) {
            int i = bVar.f6600a;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f6382H.mo8839Z0(recyclerView, bVar.f6601b, bVar.f6603d);
            } else if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f6382H.mo8845c1(recyclerView2, bVar.f6601b, bVar.f6603d);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f6382H.mo8848e1(recyclerView3, bVar.f6601b, bVar.f6603d, bVar.f6602c);
            } else if (i == 8) {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f6382H.mo8843b1(recyclerView4, bVar.f6601b, bVar.f6603d, 1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$g */
    public static /* synthetic */ class C1237g {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6484a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy[] r0 = androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6484a = r0
                androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy r1 = androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6484a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy r1 = androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C1237g.<clinit>():void");
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$h */
    public static class C1238h extends Observable<C1239i> {
        /* renamed from: a */
        public boolean mo9384a() {
            return !this.mObservers.isEmpty();
        }

        /* renamed from: b */
        public void mo9385b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1239i) this.mObservers.get(size)).onChanged();
            }
        }

        /* renamed from: c */
        public void mo9386c(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1239i) this.mObservers.get(size)).onItemRangeMoved(i, i2, 1);
            }
        }

        /* renamed from: d */
        public void mo9387d(int i, int i2) {
            mo9388e(i, i2, (Object) null);
        }

        /* renamed from: e */
        public void mo9388e(int i, int i2, Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1239i) this.mObservers.get(size)).onItemRangeChanged(i, i2, obj);
            }
        }

        /* renamed from: f */
        public void mo9389f(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1239i) this.mObservers.get(size)).onItemRangeInserted(i, i2);
            }
        }

        /* renamed from: g */
        public void mo9390g(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1239i) this.mObservers.get(size)).onItemRangeRemoved(i, i2);
            }
        }

        /* renamed from: h */
        public void mo9391h() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1239i) this.mObservers.get(size)).onStateRestorationPolicyChanged();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$i */
    public static abstract class C1239i {
        public void onChanged() {
        }

        public void onItemRangeChanged(int i, int i2) {
        }

        public void onItemRangeChanged(int i, int i2, Object obj) {
            onItemRangeChanged(i, i2);
        }

        public void onItemRangeInserted(int i, int i2) {
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
        }

        public void onItemRangeRemoved(int i, int i2) {
        }

        public void onStateRestorationPolicyChanged() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$j */
    public interface C1240j {
        /* renamed from: a */
        int mo9398a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$k */
    public static class C1241k {
        /* renamed from: a */
        public EdgeEffect mo9399a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$l */
    public static abstract class C1242l {
        public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        public static final int FLAG_CHANGED = 2;
        public static final int FLAG_INVALIDATED = 4;
        public static final int FLAG_MOVED = 2048;
        public static final int FLAG_REMOVED = 8;
        private long mAddDuration = 120;
        private long mChangeDuration = 250;
        private ArrayList<C1243a> mFinishedListeners = new ArrayList<>();
        private C1244b mListener = null;
        private long mMoveDuration = 250;
        private long mRemoveDuration = 120;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$a */
        public interface C1243a {
            /* renamed from: a */
            void mo9428a();
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$b */
        public interface C1244b {
            /* renamed from: a */
            void mo9429a(C1231a0 a0Var);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$c */
        public static class C1245c {

            /* renamed from: a */
            public int f6485a;

            /* renamed from: b */
            public int f6486b;

            /* renamed from: c */
            public int f6487c;

            /* renamed from: d */
            public int f6488d;

            /* renamed from: a */
            public C1245c mo9430a(C1231a0 a0Var) {
                return mo9431b(a0Var, 0);
            }

            /* renamed from: b */
            public C1245c mo9431b(C1231a0 a0Var, int i) {
                View view = a0Var.itemView;
                this.f6485a = view.getLeft();
                this.f6486b = view.getTop();
                this.f6487c = view.getRight();
                this.f6488d = view.getBottom();
                return this;
            }
        }

        public static int buildAdapterChangeFlagsForAnimations(C1231a0 a0Var) {
            int i = a0Var.mFlags & 14;
            if (a0Var.isInvalid()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i;
            }
            int oldPosition = a0Var.getOldPosition();
            int absoluteAdapterPosition = a0Var.getAbsoluteAdapterPosition();
            if (oldPosition == -1 || absoluteAdapterPosition == -1 || oldPosition == absoluteAdapterPosition) {
                return i;
            }
            return i | 2048;
        }

        public abstract boolean animateAppearance(C1231a0 a0Var, C1245c cVar, C1245c cVar2);

        public abstract boolean animateChange(C1231a0 a0Var, C1231a0 a0Var2, C1245c cVar, C1245c cVar2);

        public abstract boolean animateDisappearance(C1231a0 a0Var, C1245c cVar, C1245c cVar2);

        public abstract boolean animatePersistence(C1231a0 a0Var, C1245c cVar, C1245c cVar2);

        public boolean canReuseUpdatedViewHolder(C1231a0 a0Var) {
            return true;
        }

        public boolean canReuseUpdatedViewHolder(C1231a0 a0Var, List<Object> list) {
            return canReuseUpdatedViewHolder(a0Var);
        }

        public final void dispatchAnimationFinished(C1231a0 a0Var) {
            onAnimationFinished(a0Var);
            C1244b bVar = this.mListener;
            if (bVar != null) {
                bVar.mo9429a(a0Var);
            }
        }

        public final void dispatchAnimationStarted(C1231a0 a0Var) {
            onAnimationStarted(a0Var);
        }

        public final void dispatchAnimationsFinished() {
            int size = this.mFinishedListeners.size();
            for (int i = 0; i < size; i++) {
                this.mFinishedListeners.get(i).mo9428a();
            }
            this.mFinishedListeners.clear();
        }

        public abstract void endAnimation(C1231a0 a0Var);

        public abstract void endAnimations();

        public long getAddDuration() {
            return this.mAddDuration;
        }

        public long getChangeDuration() {
            return this.mChangeDuration;
        }

        public long getMoveDuration() {
            return this.mMoveDuration;
        }

        public long getRemoveDuration() {
            return this.mRemoveDuration;
        }

        public abstract boolean isRunning();

        public final boolean isRunning(C1243a aVar) {
            boolean isRunning = isRunning();
            if (aVar != null) {
                if (!isRunning) {
                    aVar.mo9428a();
                } else {
                    this.mFinishedListeners.add(aVar);
                }
            }
            return isRunning;
        }

        public C1245c obtainHolderInfo() {
            return new C1245c();
        }

        public void onAnimationFinished(C1231a0 a0Var) {
        }

        public void onAnimationStarted(C1231a0 a0Var) {
        }

        public C1245c recordPostLayoutInformation(C1260x xVar, C1231a0 a0Var) {
            return obtainHolderInfo().mo9430a(a0Var);
        }

        public C1245c recordPreLayoutInformation(C1260x xVar, C1231a0 a0Var, int i, List<Object> list) {
            return obtainHolderInfo().mo9430a(a0Var);
        }

        public abstract void runPendingAnimations();

        public void setAddDuration(long j) {
            this.mAddDuration = j;
        }

        public void setChangeDuration(long j) {
            this.mChangeDuration = j;
        }

        public void setListener(C1244b bVar) {
            this.mListener = bVar;
        }

        public void setMoveDuration(long j) {
            this.mMoveDuration = j;
        }

        public void setRemoveDuration(long j) {
            this.mRemoveDuration = j;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$m */
    public class C1246m implements C1242l.C1244b {
        public C1246m() {
        }

        /* renamed from: a */
        public void mo9429a(C1231a0 a0Var) {
            a0Var.setIsRecyclable(true);
            if (a0Var.mShadowedHolder != null && a0Var.mShadowingHolder == null) {
                a0Var.mShadowedHolder = null;
            }
            a0Var.mShadowingHolder = null;
            if (!a0Var.shouldBeKeptAsChild() && !RecyclerView.this.mo9014a1(a0Var.itemView) && a0Var.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(a0Var.itemView, false);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$n */
    public static abstract class C1247n {
        @Deprecated
        public void getItemOffsets(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(Canvas canvas, RecyclerView recyclerView) {
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, C1260x xVar) {
            onDraw(canvas, recyclerView);
        }

        @Deprecated
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, C1260x xVar) {
            onDrawOver(canvas, recyclerView);
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1260x xVar) {
            getItemOffsets(rect, ((LayoutParams) view.getLayoutParams()).mo9303a(), recyclerView);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$o */
    public interface C1248o {
        /* renamed from: b */
        void mo9438b(View view);

        /* renamed from: d */
        void mo9439d(View view);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$p */
    public static abstract class C1249p {
        /* renamed from: a */
        public abstract boolean mo9440a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$q */
    public interface C1250q {
        /* renamed from: a */
        void mo9441a(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: c */
        boolean mo9442c(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: e */
        void mo9443e(boolean z);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$r */
    public static abstract class C1251r {
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$s */
    public static class C1252s {

        /* renamed from: a */
        public SparseArray<C1253a> f6490a = new SparseArray<>();

        /* renamed from: b */
        public int f6491b = 0;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$s$a */
        public static class C1253a {

            /* renamed from: a */
            public final ArrayList<C1231a0> f6492a = new ArrayList<>();

            /* renamed from: b */
            public int f6493b = 5;

            /* renamed from: c */
            public long f6494c = 0;

            /* renamed from: d */
            public long f6495d = 0;
        }

        /* renamed from: a */
        public void mo9446a() {
            this.f6491b++;
        }

        /* renamed from: b */
        public void mo9447b() {
            for (int i = 0; i < this.f6490a.size(); i++) {
                this.f6490a.valueAt(i).f6492a.clear();
            }
        }

        /* renamed from: c */
        public void mo9448c() {
            this.f6491b--;
        }

        /* renamed from: d */
        public void mo9449d(int i, long j) {
            C1253a g = mo9452g(i);
            g.f6495d = mo9455j(g.f6495d, j);
        }

        /* renamed from: e */
        public void mo9450e(int i, long j) {
            C1253a g = mo9452g(i);
            g.f6494c = mo9455j(g.f6494c, j);
        }

        /* renamed from: f */
        public C1231a0 mo9451f(int i) {
            C1253a aVar = this.f6490a.get(i);
            if (aVar == null || aVar.f6492a.isEmpty()) {
                return null;
            }
            ArrayList<C1231a0> arrayList = aVar.f6492a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        /* renamed from: g */
        public final C1253a mo9452g(int i) {
            C1253a aVar = this.f6490a.get(i);
            if (aVar != null) {
                return aVar;
            }
            C1253a aVar2 = new C1253a();
            this.f6490a.put(i, aVar2);
            return aVar2;
        }

        /* renamed from: h */
        public void mo9453h(Adapter adapter, Adapter adapter2, boolean z) {
            if (adapter != null) {
                mo9448c();
            }
            if (!z && this.f6491b == 0) {
                mo9447b();
            }
            if (adapter2 != null) {
                mo9446a();
            }
        }

        /* renamed from: i */
        public void mo9454i(C1231a0 a0Var) {
            int itemViewType = a0Var.getItemViewType();
            ArrayList<C1231a0> arrayList = mo9452g(itemViewType).f6492a;
            if (this.f6490a.get(itemViewType).f6493b > arrayList.size()) {
                a0Var.resetInternal();
                arrayList.add(a0Var);
            }
        }

        /* renamed from: j */
        public long mo9455j(long j, long j2) {
            if (j == 0) {
                return j2;
            }
            return ((j / 4) * 3) + (j2 / 4);
        }

        /* renamed from: k */
        public void mo9456k(int i, int i2) {
            C1253a g = mo9452g(i);
            g.f6493b = i2;
            ArrayList<C1231a0> arrayList = g.f6492a;
            while (arrayList.size() > i2) {
                arrayList.remove(arrayList.size() - 1);
            }
        }

        /* renamed from: l */
        public boolean mo9457l(int i, long j, long j2) {
            long j3 = mo9452g(i).f6495d;
            if (j3 == 0 || j + j3 < j2) {
                return true;
            }
            return false;
        }

        /* renamed from: m */
        public boolean mo9458m(int i, long j, long j2) {
            long j3 = mo9452g(i).f6494c;
            if (j3 == 0 || j + j3 < j2) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$t */
    public final class C1254t {

        /* renamed from: a */
        public final ArrayList<C1231a0> f6496a;

        /* renamed from: b */
        public ArrayList<C1231a0> f6497b = null;

        /* renamed from: c */
        public final ArrayList<C1231a0> f6498c = new ArrayList<>();

        /* renamed from: d */
        public final List<C1231a0> f6499d;

        /* renamed from: e */
        public int f6500e;

        /* renamed from: f */
        public int f6501f;

        /* renamed from: g */
        public C1252s f6502g;

        public C1254t() {
            ArrayList<C1231a0> arrayList = new ArrayList<>();
            this.f6496a = arrayList;
            this.f6499d = Collections.unmodifiableList(arrayList);
            this.f6500e = 2;
            this.f6501f = 2;
        }

        /* renamed from: A */
        public void mo9459A(int i) {
            mo9472a(this.f6498c.get(i), true);
            this.f6498c.remove(i);
        }

        /* renamed from: B */
        public void mo9460B(View view) {
            C1231a0 i0 = RecyclerView.m8852i0(view);
            if (i0.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (i0.isScrap()) {
                i0.unScrap();
            } else if (i0.wasReturnedFromScrap()) {
                i0.clearReturnedFromScrapFlag();
            }
            mo9461C(i0);
            if (RecyclerView.this.f6378D1 != null && !i0.isRecyclable()) {
                RecyclerView.this.f6378D1.endAnimation(i0);
            }
        }

        /* renamed from: C */
        public void mo9461C(C1231a0 a0Var) {
            boolean z;
            boolean z2;
            boolean z3 = false;
            boolean z4 = true;
            if (a0Var.isScrap() || a0Var.itemView.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(a0Var.isScrap());
                sb.append(" isAttached:");
                if (a0Var.itemView.getParent() != null) {
                    z3 = true;
                }
                sb.append(z3);
                sb.append(RecyclerView.this.mo8994Q());
                throw new IllegalArgumentException(sb.toString());
            } else if (a0Var.isTmpDetached()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + a0Var + RecyclerView.this.mo8994Q());
            } else if (!a0Var.shouldIgnore()) {
                boolean doesTransientStatePreventRecycling = a0Var.doesTransientStatePreventRecycling();
                Adapter adapter = RecyclerView.this.f6376C;
                if (adapter == null || !doesTransientStatePreventRecycling || !adapter.onFailedToRecycleView(a0Var)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z || a0Var.isRecyclable()) {
                    if (this.f6501f <= 0 || a0Var.hasAnyOfTheFlags(526)) {
                        z2 = false;
                    } else {
                        int size = this.f6498c.size();
                        if (size >= this.f6501f && size > 0) {
                            mo9459A(0);
                            size--;
                        }
                        if (RecyclerView.f6367t2 && size > 0 && !RecyclerView.this.f6402U1.mo9827d(a0Var.mPosition)) {
                            int i = size - 1;
                            while (i >= 0) {
                                if (!RecyclerView.this.f6402U1.mo9827d(this.f6498c.get(i).mPosition)) {
                                    break;
                                }
                                i--;
                            }
                            size = i + 1;
                        }
                        this.f6498c.add(size, a0Var);
                        z2 = true;
                    }
                    if (!z2) {
                        mo9472a(a0Var, true);
                    } else {
                        z4 = false;
                    }
                    z3 = z2;
                } else {
                    z4 = false;
                }
                RecyclerView.this.f6435r.mo10010q(a0Var);
                if (!z3 && !z4 && doesTransientStatePreventRecycling) {
                    a0Var.mBindingAdapter = null;
                    a0Var.mOwnerRecyclerView = null;
                }
            } else {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.mo8994Q());
            }
        }

        /* renamed from: D */
        public void mo9462D(View view) {
            C1231a0 i0 = RecyclerView.m8852i0(view);
            if (!i0.hasAnyOfTheFlags(12) && i0.isUpdated() && !RecyclerView.this.mo9108q(i0)) {
                if (this.f6497b == null) {
                    this.f6497b = new ArrayList<>();
                }
                i0.setScrapContainer(this, true);
                this.f6497b.add(i0);
            } else if (!i0.isInvalid() || i0.isRemoved() || RecyclerView.this.f6376C.hasStableIds()) {
                i0.setScrapContainer(this, false);
                this.f6496a.add(i0);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.mo8994Q());
            }
        }

        /* renamed from: E */
        public void mo9463E(C1252s sVar) {
            C1252s sVar2 = this.f6502g;
            if (sVar2 != null) {
                sVar2.mo9448c();
            }
            this.f6502g = sVar;
            if (sVar != null && RecyclerView.this.getAdapter() != null) {
                this.f6502g.mo9446a();
            }
        }

        /* renamed from: F */
        public void mo9464F(C1261y yVar) {
        }

        /* renamed from: G */
        public void mo9465G(int i) {
            this.f6500e = i;
            mo9469K();
        }

        /* renamed from: H */
        public final boolean mo9466H(C1231a0 a0Var, int i, int i2, long j) {
            a0Var.mBindingAdapter = null;
            a0Var.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = a0Var.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j != Long.MAX_VALUE && !this.f6502g.mo9457l(itemViewType, nanoTime, j)) {
                return false;
            }
            RecyclerView.this.f6376C.bindViewHolder(a0Var, i);
            this.f6502g.mo9449d(a0Var.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
            mo9473b(a0Var);
            if (!RecyclerView.this.f6403V1.mo9528e()) {
                return true;
            }
            a0Var.mPreLayoutPosition = i2;
            return true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x014d  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x0176  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x0179  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x01a9  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x01b7  */
        /* renamed from: I */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.C1231a0 mo9467I(int r17, boolean r18, long r19) {
            /*
                r16 = this;
                r6 = r16
                r3 = r17
                r0 = r18
                if (r3 < 0) goto L_0x01da
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$x r1 = r1.f6403V1
                int r1 = r1.mo9525b()
                if (r3 >= r1) goto L_0x01da
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$x r1 = r1.f6403V1
                boolean r1 = r1.mo9528e()
                r2 = 0
                r7 = 1
                r8 = 0
                if (r1 == 0) goto L_0x0027
                androidx.recyclerview.widget.RecyclerView$a0 r1 = r16.mo9479h(r17)
                if (r1 == 0) goto L_0x0028
                r4 = r7
                goto L_0x0029
            L_0x0027:
                r1 = r2
            L_0x0028:
                r4 = r8
            L_0x0029:
                if (r1 != 0) goto L_0x005d
                androidx.recyclerview.widget.RecyclerView$a0 r1 = r16.mo9484m(r17, r18)
                if (r1 == 0) goto L_0x005d
                boolean r5 = r6.mo9470L(r1)
                if (r5 != 0) goto L_0x005c
                if (r0 != 0) goto L_0x005a
                r5 = 4
                r1.addFlags(r5)
                boolean r5 = r1.isScrap()
                if (r5 == 0) goto L_0x004e
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r9 = r1.itemView
                r5.removeDetachedView(r9, r8)
                r1.unScrap()
                goto L_0x0057
            L_0x004e:
                boolean r5 = r1.wasReturnedFromScrap()
                if (r5 == 0) goto L_0x0057
                r1.clearReturnedFromScrapFlag()
            L_0x0057:
                r6.mo9461C(r1)
            L_0x005a:
                r1 = r2
                goto L_0x005d
            L_0x005c:
                r4 = r7
            L_0x005d:
                if (r1 != 0) goto L_0x012c
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r5 = r5.f6420g
                int r5 = r5.mo9668m(r3)
                if (r5 < 0) goto L_0x00f4
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r9 = r9.f6376C
                int r9 = r9.getItemCount()
                if (r5 >= r9) goto L_0x00f4
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r9 = r9.f6376C
                int r9 = r9.getItemViewType(r5)
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r10 = r10.f6376C
                boolean r10 = r10.hasStableIds()
                if (r10 == 0) goto L_0x0096
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r1 = r1.f6376C
                long r10 = r1.getItemId(r5)
                androidx.recyclerview.widget.RecyclerView$a0 r1 = r6.mo9483l(r10, r9, r0)
                if (r1 == 0) goto L_0x0096
                r1.mPosition = r5
                r4 = r7
            L_0x0096:
                if (r1 != 0) goto L_0x00ad
                androidx.recyclerview.widget.RecyclerView$s r0 = r16.mo9480i()
                androidx.recyclerview.widget.RecyclerView$a0 r0 = r0.mo9451f(r9)
                if (r0 == 0) goto L_0x00ac
                r0.resetInternal()
                boolean r1 = androidx.recyclerview.widget.RecyclerView.f6364q2
                if (r1 == 0) goto L_0x00ac
                r6.mo9489r(r0)
            L_0x00ac:
                r1 = r0
            L_0x00ad:
                if (r1 != 0) goto L_0x012c
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                long r0 = r0.getNanoTime()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
                if (r5 == 0) goto L_0x00cb
                androidx.recyclerview.widget.RecyclerView$s r10 = r6.f6502g
                r11 = r9
                r12 = r0
                r14 = r19
                boolean r5 = r10.mo9458m(r11, r12, r14)
                if (r5 != 0) goto L_0x00cb
                return r2
            L_0x00cb:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r5 = r2.f6376C
                androidx.recyclerview.widget.RecyclerView$a0 r2 = r5.createViewHolder(r2, r9)
                boolean r5 = androidx.recyclerview.widget.RecyclerView.f6367t2
                if (r5 == 0) goto L_0x00e6
                android.view.View r5 = r2.itemView
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.m8847X(r5)
                if (r5 == 0) goto L_0x00e6
                java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
                r10.<init>(r5)
                r2.mNestedRecyclerView = r10
            L_0x00e6:
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                long r10 = r5.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$s r5 = r6.f6502g
                long r10 = r10 - r0
                r5.mo9450e(r9, r10)
                r9 = r2
                goto L_0x012d
            L_0x00f4:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Inconsistency detected. Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "(offset:"
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ").state:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$x r2 = r2.f6403V1
                int r2 = r2.mo9525b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.mo8994Q()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x012c:
                r9 = r1
            L_0x012d:
                r10 = r4
                if (r10 == 0) goto L_0x0166
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$x r0 = r0.f6403V1
                boolean r0 = r0.mo9528e()
                if (r0 != 0) goto L_0x0166
                r0 = 8192(0x2000, float:1.14794E-41)
                boolean r1 = r9.hasAnyOfTheFlags(r0)
                if (r1 == 0) goto L_0x0166
                r9.setFlags(r8, r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$x r0 = r0.f6403V1
                boolean r0 = r0.f6522k
                if (r0 == 0) goto L_0x0166
                int r0 = androidx.recyclerview.widget.RecyclerView.C1242l.buildAdapterChangeFlagsForAnimations(r9)
                r0 = r0 | 4096(0x1000, float:5.74E-42)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$l r2 = r1.f6378D1
                androidx.recyclerview.widget.RecyclerView$x r1 = r1.f6403V1
                java.util.List r4 = r9.getUnmodifiedPayloads()
                androidx.recyclerview.widget.RecyclerView$l$c r0 = r2.recordPreLayoutInformation(r1, r9, r0, r4)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.mo9007W0(r9, r0)
            L_0x0166:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$x r0 = r0.f6403V1
                boolean r0 = r0.mo9528e()
                if (r0 == 0) goto L_0x0179
                boolean r0 = r9.isBound()
                if (r0 == 0) goto L_0x0179
                r9.mPreLayoutPosition = r3
                goto L_0x018c
            L_0x0179:
                boolean r0 = r9.isBound()
                if (r0 == 0) goto L_0x018e
                boolean r0 = r9.needsUpdate()
                if (r0 != 0) goto L_0x018e
                boolean r0 = r9.isInvalid()
                if (r0 == 0) goto L_0x018c
                goto L_0x018e
            L_0x018c:
                r0 = r8
                goto L_0x01a1
            L_0x018e:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.f6420g
                int r2 = r0.mo9668m(r3)
                r0 = r16
                r1 = r9
                r3 = r17
                r4 = r19
                boolean r0 = r0.mo9466H(r1, r2, r3, r4)
            L_0x01a1:
                android.view.View r1 = r9.itemView
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                if (r1 != 0) goto L_0x01b7
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r1.generateDefaultLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
                android.view.View r2 = r9.itemView
                r2.setLayoutParams(r1)
                goto L_0x01cf
            L_0x01b7:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                boolean r2 = r2.checkLayoutParams(r1)
                if (r2 != 0) goto L_0x01cd
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r2.generateLayoutParams((android.view.ViewGroup.LayoutParams) r1)
                androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
                android.view.View r2 = r9.itemView
                r2.setLayoutParams(r1)
                goto L_0x01cf
            L_0x01cd:
                androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
            L_0x01cf:
                r1.f6474a = r9
                if (r10 == 0) goto L_0x01d6
                if (r0 == 0) goto L_0x01d6
                goto L_0x01d7
            L_0x01d6:
                r7 = r8
            L_0x01d7:
                r1.f6477g = r7
                return r9
            L_0x01da:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "("
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "). Item count:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$x r2 = r2.f6403V1
                int r2 = r2.mo9525b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.mo8994Q()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C1254t.mo9467I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$a0");
        }

        /* renamed from: J */
        public void mo9468J(C1231a0 a0Var) {
            if (a0Var.mInChangeScrap) {
                this.f6497b.remove(a0Var);
            } else {
                this.f6496a.remove(a0Var);
            }
            a0Var.mScrapContainer = null;
            a0Var.mInChangeScrap = false;
            a0Var.clearReturnedFromScrapFlag();
        }

        /* renamed from: K */
        public void mo9469K() {
            int i;
            LayoutManager layoutManager = RecyclerView.this.f6382H;
            if (layoutManager != null) {
                i = layoutManager.f6453H;
            } else {
                i = 0;
            }
            this.f6501f = this.f6500e + i;
            for (int size = this.f6498c.size() - 1; size >= 0 && this.f6498c.size() > this.f6501f; size--) {
                mo9459A(size);
            }
        }

        /* renamed from: L */
        public boolean mo9470L(C1231a0 a0Var) {
            if (a0Var.isRemoved()) {
                return RecyclerView.this.f6403V1.mo9528e();
            }
            int i = a0Var.mPosition;
            if (i < 0 || i >= RecyclerView.this.f6376C.getItemCount()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + a0Var + RecyclerView.this.mo8994Q());
            } else if (!RecyclerView.this.f6403V1.mo9528e() && RecyclerView.this.f6376C.getItemViewType(a0Var.mPosition) != a0Var.getItemViewType()) {
                return false;
            } else {
                if (!RecyclerView.this.f6376C.hasStableIds()) {
                    return true;
                }
                if (a0Var.getItemId() == RecyclerView.this.f6376C.getItemId(a0Var.mPosition)) {
                    return true;
                }
                return false;
            }
        }

        /* renamed from: M */
        public void mo9471M(int i, int i2) {
            int i3;
            int i4 = i2 + i;
            for (int size = this.f6498c.size() - 1; size >= 0; size--) {
                C1231a0 a0Var = this.f6498c.get(size);
                if (a0Var != null && (i3 = a0Var.mPosition) >= i && i3 < i4) {
                    a0Var.addFlags(2);
                    mo9459A(size);
                }
            }
        }

        /* renamed from: a */
        public void mo9472a(C1231a0 a0Var, boolean z) {
            C3715z7 z7Var;
            RecyclerView.m8854s(a0Var);
            View view = a0Var.itemView;
            C1339s sVar = RecyclerView.this.f6412c2;
            if (sVar != null) {
                C3715z7 n = sVar.mo9955n();
                if (n instanceof C1339s.C1340a) {
                    z7Var = ((C1339s.C1340a) n).mo9960n(view);
                } else {
                    z7Var = null;
                }
                ga7.m17785p0(view, z7Var);
            }
            if (z) {
                mo9478g(a0Var);
            }
            a0Var.mBindingAdapter = null;
            a0Var.mOwnerRecyclerView = null;
            mo9480i().mo9454i(a0Var);
        }

        /* renamed from: b */
        public final void mo9473b(C1231a0 a0Var) {
            if (RecyclerView.this.mo9160x0()) {
                View view = a0Var.itemView;
                if (ga7.m17804z(view) == 0) {
                    ga7.m17714A0(view, 1);
                }
                C1339s sVar = RecyclerView.this.f6412c2;
                if (sVar != null) {
                    C3715z7 n = sVar.mo9955n();
                    if (n instanceof C1339s.C1340a) {
                        ((C1339s.C1340a) n).mo9961o(view);
                    }
                    ga7.m17785p0(view, n);
                }
            }
        }

        /* renamed from: c */
        public void mo9474c() {
            this.f6496a.clear();
            mo9497z();
        }

        /* renamed from: d */
        public void mo9475d() {
            int size = this.f6498c.size();
            for (int i = 0; i < size; i++) {
                this.f6498c.get(i).clearOldPosition();
            }
            int size2 = this.f6496a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f6496a.get(i2).clearOldPosition();
            }
            ArrayList<C1231a0> arrayList = this.f6497b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    this.f6497b.get(i3).clearOldPosition();
                }
            }
        }

        /* renamed from: e */
        public void mo9476e() {
            this.f6496a.clear();
            ArrayList<C1231a0> arrayList = this.f6497b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* renamed from: f */
        public int mo9477f(int i) {
            if (i < 0 || i >= RecyclerView.this.f6403V1.mo9525b()) {
                throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + RecyclerView.this.f6403V1.mo9525b() + RecyclerView.this.mo8994Q());
            } else if (!RecyclerView.this.f6403V1.mo9528e()) {
                return i;
            } else {
                return RecyclerView.this.f6420g.mo9668m(i);
            }
        }

        /* renamed from: g */
        public void mo9478g(C1231a0 a0Var) {
            C1255u uVar = RecyclerView.this.f6384I;
            if (uVar != null) {
                uVar.mo9498a(a0Var);
            }
            int size = RecyclerView.this.f6388L.size();
            for (int i = 0; i < size; i++) {
                RecyclerView.this.f6388L.get(i).mo9498a(a0Var);
            }
            Adapter adapter = RecyclerView.this.f6376C;
            if (adapter != null) {
                adapter.onViewRecycled(a0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f6403V1 != null) {
                recyclerView.f6435r.mo10010q(a0Var);
            }
        }

        /* renamed from: h */
        public C1231a0 mo9479h(int i) {
            int size;
            int m;
            ArrayList<C1231a0> arrayList = this.f6497b;
            if (!(arrayList == null || (size = arrayList.size()) == 0)) {
                int i2 = 0;
                int i3 = 0;
                while (i3 < size) {
                    C1231a0 a0Var = this.f6497b.get(i3);
                    if (a0Var.wasReturnedFromScrap() || a0Var.getLayoutPosition() != i) {
                        i3++;
                    } else {
                        a0Var.addFlags(32);
                        return a0Var;
                    }
                }
                if (RecyclerView.this.f6376C.hasStableIds() && (m = RecyclerView.this.f6420g.mo9668m(i)) > 0 && m < RecyclerView.this.f6376C.getItemCount()) {
                    long itemId = RecyclerView.this.f6376C.getItemId(m);
                    while (i2 < size) {
                        C1231a0 a0Var2 = this.f6497b.get(i2);
                        if (a0Var2.wasReturnedFromScrap() || a0Var2.getItemId() != itemId) {
                            i2++;
                        } else {
                            a0Var2.addFlags(32);
                            return a0Var2;
                        }
                    }
                }
            }
            return null;
        }

        /* renamed from: i */
        public C1252s mo9480i() {
            if (this.f6502g == null) {
                this.f6502g = new C1252s();
            }
            return this.f6502g;
        }

        /* renamed from: j */
        public int mo9481j() {
            return this.f6496a.size();
        }

        /* renamed from: k */
        public List<C1231a0> mo9482k() {
            return this.f6499d;
        }

        /* renamed from: l */
        public C1231a0 mo9483l(long j, int i, boolean z) {
            for (int size = this.f6496a.size() - 1; size >= 0; size--) {
                C1231a0 a0Var = this.f6496a.get(size);
                if (a0Var.getItemId() == j && !a0Var.wasReturnedFromScrap()) {
                    if (i == a0Var.getItemViewType()) {
                        a0Var.addFlags(32);
                        if (a0Var.isRemoved() && !RecyclerView.this.f6403V1.mo9528e()) {
                            a0Var.setFlags(2, 14);
                        }
                        return a0Var;
                    } else if (!z) {
                        this.f6496a.remove(size);
                        RecyclerView.this.removeDetachedView(a0Var.itemView, false);
                        mo9496y(a0Var.itemView);
                    }
                }
            }
            int size2 = this.f6498c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                C1231a0 a0Var2 = this.f6498c.get(size2);
                if (a0Var2.getItemId() == j && !a0Var2.isAttachedToTransitionOverlay()) {
                    if (i == a0Var2.getItemViewType()) {
                        if (!z) {
                            this.f6498c.remove(size2);
                        }
                        return a0Var2;
                    } else if (!z) {
                        mo9459A(size2);
                        return null;
                    }
                }
            }
        }

        /* renamed from: m */
        public C1231a0 mo9484m(int i, boolean z) {
            View e;
            int size = this.f6496a.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                C1231a0 a0Var = this.f6496a.get(i3);
                if (a0Var.wasReturnedFromScrap() || a0Var.getLayoutPosition() != i || a0Var.isInvalid() || (!RecyclerView.this.f6403V1.f6519h && a0Var.isRemoved())) {
                    i3++;
                } else {
                    a0Var.addFlags(32);
                    return a0Var;
                }
            }
            if (z || (e = RecyclerView.this.f6425k.mo9713e(i)) == null) {
                int size2 = this.f6498c.size();
                while (i2 < size2) {
                    C1231a0 a0Var2 = this.f6498c.get(i2);
                    if (a0Var2.isInvalid() || a0Var2.getLayoutPosition() != i || a0Var2.isAttachedToTransitionOverlay()) {
                        i2++;
                    } else {
                        if (!z) {
                            this.f6498c.remove(i2);
                        }
                        return a0Var2;
                    }
                }
                return null;
            }
            C1231a0 i0 = RecyclerView.m8852i0(e);
            RecyclerView.this.f6425k.mo9727s(e);
            int m = RecyclerView.this.f6425k.mo9721m(e);
            if (m != -1) {
                RecyclerView.this.f6425k.mo9712d(m);
                mo9462D(e);
                i0.addFlags(8224);
                return i0;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + i0 + RecyclerView.this.mo8994Q());
        }

        /* renamed from: n */
        public View mo9485n(int i) {
            return this.f6496a.get(i).itemView;
        }

        /* renamed from: o */
        public View mo9486o(int i) {
            return mo9487p(i, false);
        }

        /* renamed from: p */
        public View mo9487p(int i, boolean z) {
            return mo9467I(i, z, Long.MAX_VALUE).itemView;
        }

        /* renamed from: q */
        public final void mo9488q(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    mo9488q((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        /* renamed from: r */
        public final void mo9489r(C1231a0 a0Var) {
            View view = a0Var.itemView;
            if (view instanceof ViewGroup) {
                mo9488q((ViewGroup) view, false);
            }
        }

        /* renamed from: s */
        public void mo9490s() {
            int size = this.f6498c.size();
            for (int i = 0; i < size; i++) {
                LayoutParams layoutParams = (LayoutParams) this.f6498c.get(i).itemView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.f6476e = true;
                }
            }
        }

        /* renamed from: t */
        public void mo9491t() {
            int size = this.f6498c.size();
            for (int i = 0; i < size; i++) {
                C1231a0 a0Var = this.f6498c.get(i);
                if (a0Var != null) {
                    a0Var.addFlags(6);
                    a0Var.addChangePayload((Object) null);
                }
            }
            Adapter adapter = RecyclerView.this.f6376C;
            if (adapter == null || !adapter.hasStableIds()) {
                mo9497z();
            }
        }

        /* renamed from: u */
        public void mo9492u(int i, int i2) {
            int size = this.f6498c.size();
            for (int i3 = 0; i3 < size; i3++) {
                C1231a0 a0Var = this.f6498c.get(i3);
                if (a0Var != null && a0Var.mPosition >= i) {
                    a0Var.offsetPosition(i2, false);
                }
            }
        }

        /* renamed from: v */
        public void mo9493v(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (i < i2) {
                i5 = -1;
                i4 = i;
                i3 = i2;
            } else {
                i5 = 1;
                i3 = i;
                i4 = i2;
            }
            int size = this.f6498c.size();
            for (int i7 = 0; i7 < size; i7++) {
                C1231a0 a0Var = this.f6498c.get(i7);
                if (a0Var != null && (i6 = a0Var.mPosition) >= i4 && i6 <= i3) {
                    if (i6 == i) {
                        a0Var.offsetPosition(i2 - i, false);
                    } else {
                        a0Var.offsetPosition(i5, false);
                    }
                }
            }
        }

        /* renamed from: w */
        public void mo9494w(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.f6498c.size() - 1; size >= 0; size--) {
                C1231a0 a0Var = this.f6498c.get(size);
                if (a0Var != null) {
                    int i4 = a0Var.mPosition;
                    if (i4 >= i3) {
                        a0Var.offsetPosition(-i2, z);
                    } else if (i4 >= i) {
                        a0Var.addFlags(8);
                        mo9459A(size);
                    }
                }
            }
        }

        /* renamed from: x */
        public void mo9495x(Adapter adapter, Adapter adapter2, boolean z) {
            mo9474c();
            mo9480i().mo9453h(adapter, adapter2, z);
        }

        /* renamed from: y */
        public void mo9496y(View view) {
            C1231a0 i0 = RecyclerView.m8852i0(view);
            i0.mScrapContainer = null;
            i0.mInChangeScrap = false;
            i0.clearReturnedFromScrapFlag();
            mo9461C(i0);
        }

        /* renamed from: z */
        public void mo9497z() {
            for (int size = this.f6498c.size() - 1; size >= 0; size--) {
                mo9459A(size);
            }
            this.f6498c.clear();
            if (RecyclerView.f6367t2) {
                RecyclerView.this.f6402U1.mo9825b();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$u */
    public interface C1255u {
        /* renamed from: a */
        void mo9498a(C1231a0 a0Var);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$v */
    public class C1256v extends C1239i {
        public C1256v() {
        }

        /* renamed from: a */
        public void mo9499a() {
            if (RecyclerView.f6366s2) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f6416e0 && recyclerView.f6401U) {
                    ga7.m17769h0(recyclerView, recyclerView.f6444x);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.f6436r1 = true;
            recyclerView2.requestLayout();
        }

        public void onChanged() {
            RecyclerView.this.mo9105p((String) null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f6403V1.f6518g = true;
            recyclerView.mo9003U0(true);
            if (!RecyclerView.this.f6420g.mo9671p()) {
                RecyclerView.this.requestLayout();
            }
        }

        public void onItemRangeChanged(int i, int i2, Object obj) {
            RecyclerView.this.mo9105p((String) null);
            if (RecyclerView.this.f6420g.mo9673r(i, i2, obj)) {
                mo9499a();
            }
        }

        public void onItemRangeInserted(int i, int i2) {
            RecyclerView.this.mo9105p((String) null);
            if (RecyclerView.this.f6420g.mo9674s(i, i2)) {
                mo9499a();
            }
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
            RecyclerView.this.mo9105p((String) null);
            if (RecyclerView.this.f6420g.mo9675t(i, i2, i3)) {
                mo9499a();
            }
        }

        public void onItemRangeRemoved(int i, int i2) {
            RecyclerView.this.mo9105p((String) null);
            if (RecyclerView.this.f6420g.mo9676u(i, i2)) {
                mo9499a();
            }
        }

        public void onStateRestorationPolicyChanged() {
            Adapter adapter;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f6415e != null && (adapter = recyclerView.f6376C) != null && adapter.canRestoreState()) {
                RecyclerView.this.requestLayout();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$w */
    public static abstract class C1257w {
        private LayoutManager mLayoutManager;
        private boolean mPendingInitialRun;
        private RecyclerView mRecyclerView;
        private final C1258a mRecyclingAction = new C1258a(0, 0);
        private boolean mRunning;
        private boolean mStarted;
        private int mTargetPosition = -1;
        private View mTargetView;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$w$a */
        public static class C1258a {

            /* renamed from: a */
            public int f6505a;

            /* renamed from: b */
            public int f6506b;

            /* renamed from: c */
            public int f6507c;

            /* renamed from: d */
            public int f6508d;

            /* renamed from: e */
            public Interpolator f6509e;

            /* renamed from: f */
            public boolean f6510f;

            /* renamed from: g */
            public int f6511g;

            public C1258a(int i, int i2) {
                this(i, i2, Integer.MIN_VALUE, (Interpolator) null);
            }

            /* renamed from: a */
            public boolean mo9519a() {
                if (this.f6508d >= 0) {
                    return true;
                }
                return false;
            }

            /* renamed from: b */
            public void mo9520b(int i) {
                this.f6508d = i;
            }

            /* renamed from: c */
            public void mo9521c(RecyclerView recyclerView) {
                int i = this.f6508d;
                if (i >= 0) {
                    this.f6508d = -1;
                    recyclerView.mo8959A0(i);
                    this.f6510f = false;
                } else if (this.f6510f) {
                    mo9523e();
                    recyclerView.f6399S1.mo9536e(this.f6505a, this.f6506b, this.f6507c, this.f6509e);
                    this.f6511g++;
                    this.f6510f = false;
                } else {
                    this.f6511g = 0;
                }
            }

            /* renamed from: d */
            public void mo9522d(int i, int i2, int i3, Interpolator interpolator) {
                this.f6505a = i;
                this.f6506b = i2;
                this.f6507c = i3;
                this.f6509e = interpolator;
                this.f6510f = true;
            }

            /* renamed from: e */
            public final void mo9523e() {
                if (this.f6509e != null && this.f6507c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (this.f6507c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            public C1258a(int i, int i2, int i3, Interpolator interpolator) {
                this.f6508d = -1;
                this.f6510f = false;
                this.f6511g = 0;
                this.f6505a = i;
                this.f6506b = i2;
                this.f6507c = i3;
                this.f6509e = interpolator;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$w$b */
        public interface C1259b {
            /* renamed from: a */
            PointF mo8904a(int i);
        }

        public PointF computeScrollVectorForPosition(int i) {
            LayoutManager layoutManager = getLayoutManager();
            if (layoutManager instanceof C1259b) {
                return ((C1259b) layoutManager).mo8904a(i);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
            sb.append(C1259b.class.getCanonicalName());
            return null;
        }

        public View findViewByPosition(int i) {
            return this.mRecyclerView.f6382H.mo8888N(i);
        }

        public int getChildCount() {
            return this.mRecyclerView.f6382H.mo9234U();
        }

        public int getChildPosition(View view) {
            return this.mRecyclerView.mo9045g0(view);
        }

        public LayoutManager getLayoutManager() {
            return this.mLayoutManager;
        }

        public int getTargetPosition() {
            return this.mTargetPosition;
        }

        @Deprecated
        public void instantScrollToPosition(int i) {
            this.mRecyclerView.mo9092o1(i);
        }

        public boolean isPendingInitialRun() {
            return this.mPendingInitialRun;
        }

        public boolean isRunning() {
            return this.mRunning;
        }

        public void normalize(PointF pointF) {
            float f = pointF.x;
            float f2 = pointF.y;
            float sqrt = (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        public void onAnimation(int i, int i2) {
            PointF computeScrollVectorForPosition;
            RecyclerView recyclerView = this.mRecyclerView;
            if (this.mTargetPosition == -1 || recyclerView == null) {
                stop();
            }
            if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (computeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null) {
                float f = computeScrollVectorForPosition.x;
                if (!(f == Utils.FLOAT_EPSILON && computeScrollVectorForPosition.y == Utils.FLOAT_EPSILON)) {
                    recyclerView.mo9089n1((int) Math.signum(f), (int) Math.signum(computeScrollVectorForPosition.y), (int[]) null);
                }
            }
            this.mPendingInitialRun = false;
            View view = this.mTargetView;
            if (view != null) {
                if (getChildPosition(view) == this.mTargetPosition) {
                    onTargetFound(this.mTargetView, recyclerView.f6403V1, this.mRecyclingAction);
                    this.mRecyclingAction.mo9521c(recyclerView);
                    stop();
                } else {
                    this.mTargetView = null;
                }
            }
            if (this.mRunning) {
                onSeekTargetStep(i, i2, recyclerView.f6403V1, this.mRecyclingAction);
                boolean a = this.mRecyclingAction.mo9519a();
                this.mRecyclingAction.mo9521c(recyclerView);
                if (a && this.mRunning) {
                    this.mPendingInitialRun = true;
                    recyclerView.f6399S1.mo9535d();
                }
            }
        }

        public void onChildAttachedToWindow(View view) {
            if (getChildPosition(view) == getTargetPosition()) {
                this.mTargetView = view;
            }
        }

        public abstract void onSeekTargetStep(int i, int i2, C1260x xVar, C1258a aVar);

        public abstract void onStart();

        public abstract void onStop();

        public abstract void onTargetFound(View view, C1260x xVar, C1258a aVar);

        public void setTargetPosition(int i) {
            this.mTargetPosition = i;
        }

        public void start(RecyclerView recyclerView, LayoutManager layoutManager) {
            recyclerView.f6399S1.mo9537f();
            if (this.mStarted) {
                StringBuilder sb = new StringBuilder();
                sb.append("An instance of ");
                sb.append(getClass().getSimpleName());
                sb.append(" was started more than once. Each instance of");
                sb.append(getClass().getSimpleName());
                sb.append(" is intended to only be used once. You should create a new instance for each use.");
            }
            this.mRecyclerView = recyclerView;
            this.mLayoutManager = layoutManager;
            int i = this.mTargetPosition;
            if (i != -1) {
                recyclerView.f6403V1.f6512a = i;
                this.mRunning = true;
                this.mPendingInitialRun = true;
                this.mTargetView = findViewByPosition(getTargetPosition());
                onStart();
                this.mRecyclerView.f6399S1.mo9535d();
                this.mStarted = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        public final void stop() {
            if (this.mRunning) {
                this.mRunning = false;
                onStop();
                this.mRecyclerView.f6403V1.f6512a = -1;
                this.mTargetView = null;
                this.mTargetPosition = -1;
                this.mPendingInitialRun = false;
                this.mLayoutManager.mo9269n1(this);
                this.mLayoutManager = null;
                this.mRecyclerView = null;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$x */
    public static class C1260x {

        /* renamed from: a */
        public int f6512a = -1;

        /* renamed from: b */
        public SparseArray<Object> f6513b;

        /* renamed from: c */
        public int f6514c = 0;

        /* renamed from: d */
        public int f6515d = 0;

        /* renamed from: e */
        public int f6516e = 1;

        /* renamed from: f */
        public int f6517f = 0;

        /* renamed from: g */
        public boolean f6518g = false;

        /* renamed from: h */
        public boolean f6519h = false;

        /* renamed from: i */
        public boolean f6520i = false;

        /* renamed from: j */
        public boolean f6521j = false;

        /* renamed from: k */
        public boolean f6522k = false;

        /* renamed from: l */
        public boolean f6523l = false;

        /* renamed from: m */
        public int f6524m;

        /* renamed from: n */
        public long f6525n;

        /* renamed from: o */
        public int f6526o;

        /* renamed from: p */
        public int f6527p;

        /* renamed from: q */
        public int f6528q;

        /* renamed from: a */
        public void mo9524a(int i) {
            if ((this.f6516e & i) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f6516e));
            }
        }

        /* renamed from: b */
        public int mo9525b() {
            if (this.f6519h) {
                return this.f6514c - this.f6515d;
            }
            return this.f6517f;
        }

        /* renamed from: c */
        public int mo9526c() {
            return this.f6512a;
        }

        /* renamed from: d */
        public boolean mo9527d() {
            if (this.f6512a != -1) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public boolean mo9528e() {
            return this.f6519h;
        }

        /* renamed from: f */
        public void mo9529f(Adapter adapter) {
            this.f6516e = 1;
            this.f6517f = adapter.getItemCount();
            this.f6519h = false;
            this.f6520i = false;
            this.f6521j = false;
        }

        /* renamed from: g */
        public boolean mo9530g() {
            return this.f6523l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f6512a + ", mData=" + this.f6513b + ", mItemCount=" + this.f6517f + ", mIsMeasuring=" + this.f6521j + ", mPreviousLayoutItemCount=" + this.f6514c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f6515d + ", mStructureChanged=" + this.f6518g + ", mInPreLayout=" + this.f6519h + ", mRunSimpleAnimations=" + this.f6522k + ", mRunPredictiveAnimations=" + this.f6523l + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$y */
    public static abstract class C1261y {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$z */
    public class C1262z implements Runnable {

        /* renamed from: a */
        public int f6529a;

        /* renamed from: d */
        public int f6530d;

        /* renamed from: e */
        public OverScroller f6531e;

        /* renamed from: g */
        public Interpolator f6532g;

        /* renamed from: k */
        public boolean f6533k = false;

        /* renamed from: r */
        public boolean f6534r = false;

        public C1262z() {
            Interpolator interpolator = RecyclerView.f6371x2;
            this.f6532g = interpolator;
            this.f6531e = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        /* renamed from: a */
        public final int mo9532a(int i, int i2) {
            boolean z;
            int i3;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            if (abs > abs2) {
                z = true;
            } else {
                z = false;
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (z) {
                i3 = recyclerView.getWidth();
            } else {
                i3 = recyclerView.getHeight();
            }
            if (!z) {
                abs = abs2;
            }
            return Math.min((int) (((((float) abs) / ((float) i3)) + 1.0f) * 300.0f), PlaybackException.ERROR_CODE_IO_UNSPECIFIED);
        }

        /* renamed from: b */
        public void mo9533b(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.f6530d = 0;
            this.f6529a = 0;
            Interpolator interpolator = this.f6532g;
            Interpolator interpolator2 = RecyclerView.f6371x2;
            if (interpolator != interpolator2) {
                this.f6532g = interpolator2;
                this.f6531e = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f6531e.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            mo9535d();
        }

        /* renamed from: c */
        public final void mo9534c() {
            RecyclerView.this.removeCallbacks(this);
            ga7.m17769h0(RecyclerView.this, this);
        }

        /* renamed from: d */
        public void mo9535d() {
            if (this.f6533k) {
                this.f6534r = true;
            } else {
                mo9534c();
            }
        }

        /* renamed from: e */
        public void mo9536e(int i, int i2, int i3, Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = mo9532a(i, i2);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.f6371x2;
            }
            if (this.f6532g != interpolator) {
                this.f6532g = interpolator;
                this.f6531e = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f6530d = 0;
            this.f6529a = 0;
            RecyclerView.this.setScrollState(2);
            this.f6531e.startScroll(0, 0, i, i2, i4);
            mo9535d();
        }

        /* renamed from: f */
        public void mo9537f() {
            RecyclerView.this.removeCallbacks(this);
            this.f6531e.abortAnimation();
        }

        public void run() {
            int i;
            int i2;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            int i3;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f6382H == null) {
                mo9537f();
                return;
            }
            this.f6534r = false;
            this.f6533k = true;
            recyclerView.mo9153v();
            OverScroller overScroller = this.f6531e;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i4 = currX - this.f6529a;
                int i5 = currY - this.f6530d;
                this.f6529a = currX;
                this.f6530d = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f6423i2;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.mo8974G(i4, i5, iArr, (int[]) null, 1)) {
                    int[] iArr2 = RecyclerView.this.f6423i2;
                    i4 -= iArr2[0];
                    i5 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.mo9150u(i4, i5);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f6376C != null) {
                    int[] iArr3 = recyclerView3.f6423i2;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.mo9089n1(i4, i5, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f6423i2;
                    i = iArr4[0];
                    i2 = iArr4[1];
                    i4 -= i;
                    i5 -= i2;
                    C1257w wVar = recyclerView4.f6382H.f6465s;
                    if (wVar != null && !wVar.isPendingInitialRun() && wVar.isRunning()) {
                        int b = RecyclerView.this.f6403V1.mo9525b();
                        if (b == 0) {
                            wVar.stop();
                        } else if (wVar.getTargetPosition() >= b) {
                            wVar.setTargetPosition(b - 1);
                            wVar.onAnimation(i, i2);
                        } else {
                            wVar.onAnimation(i, i2);
                        }
                    }
                } else {
                    i2 = 0;
                    i = 0;
                }
                if (!RecyclerView.this.f6390M.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f6423i2;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.mo8976H(i, i2, i4, i5, (int[]) null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f6423i2;
                int i6 = i4 - iArr6[0];
                int i7 = i5 - iArr6[1];
                if (!(i == 0 && i2 == 0)) {
                    recyclerView6.mo8980J(i, i2);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                if (overScroller.getCurrX() == overScroller.getFinalX()) {
                    z = true;
                } else {
                    z = false;
                }
                if (overScroller.getCurrY() == overScroller.getFinalY()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (overScroller.isFinished() || ((z || i6 != 0) && (z2 || i7 != 0))) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                C1257w wVar2 = RecyclerView.this.f6382H.f6465s;
                if (wVar2 == null || !wVar2.isPendingInitialRun()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (z4 || !z3) {
                    mo9535d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    C1310j jVar = recyclerView7.f6400T1;
                    if (jVar != null) {
                        jVar.mo9817f(recyclerView7, i, i2);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i6 < 0) {
                            i3 = -currVelocity;
                        } else if (i6 > 0) {
                            i3 = currVelocity;
                        } else {
                            i3 = 0;
                        }
                        if (i7 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i7 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.mo9016b(i3, currVelocity);
                    }
                    if (RecyclerView.f6367t2) {
                        RecyclerView.this.f6402U1.mo9825b();
                    }
                }
            }
            C1257w wVar3 = RecyclerView.this.f6382H.f6465s;
            if (wVar3 != null && wVar3.isPendingInitialRun()) {
                wVar3.onAnimation(0, 0);
            }
            this.f6533k = false;
            if (this.f6534r) {
                mo9534c();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.mo8960A1(1);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 16843830(0x1010436, float:2.369658E-38)
            r3 = 0
            r1[r3] = r2
            f6363p2 = r1
            f6364q2 = r3
            f6365r2 = r0
            f6366s2 = r0
            f6367t2 = r0
            f6368u2 = r3
            f6369v2 = r3
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r3] = r2
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r1[r0] = r2
            r0 = 2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r0] = r2
            r0 = 3
            r1[r0] = r2
            f6370w2 = r1
            androidx.recyclerview.widget.RecyclerView$c r0 = new androidx.recyclerview.widget.RecyclerView$c
            r0.<init>()
            f6371x2 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<clinit>():void");
    }

    public RecyclerView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: X */
    public static RecyclerView m8847X(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView X = m8847X(viewGroup.getChildAt(i));
            if (X != null) {
                return X;
            }
        }
        return null;
    }

    private g54 getScrollingChildHelper() {
        if (this.f6419f2 == null) {
            this.f6419f2 = new g54(this);
        }
        return this.f6419f2;
    }

    /* renamed from: i0 */
    public static C1231a0 m8852i0(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f6474a;
    }

    /* renamed from: k0 */
    public static void m8853k0(View view, Rect rect) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect2 = layoutParams.f6475d;
        rect.set((view.getLeft() - rect2.left) - layoutParams.leftMargin, (view.getTop() - rect2.top) - layoutParams.topMargin, view.getRight() + rect2.right + layoutParams.rightMargin, view.getBottom() + rect2.bottom + layoutParams.bottomMargin);
    }

    /* renamed from: s */
    public static void m8854s(C1231a0 a0Var) {
        WeakReference<RecyclerView> weakReference = a0Var.mNestedRecyclerView;
        if (weakReference != null) {
            View view = weakReference.get();
            while (view != null) {
                if (view != a0Var.itemView) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                } else {
                    return;
                }
            }
            a0Var.mNestedRecyclerView = null;
        }
    }

    /* renamed from: A */
    public void mo8958A(View view) {
        C1231a0 i0 = m8852i0(view);
        mo8983K0(view);
        Adapter adapter = this.f6376C;
        if (!(adapter == null || i0 == null)) {
            adapter.onViewDetachedFromWindow(i0);
        }
        List<C1248o> list = this.f6439t1;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f6439t1.get(size).mo9438b(view);
            }
        }
    }

    /* renamed from: A0 */
    public void mo8959A0(int i) {
        if (this.f6382H != null) {
            setScrollState(2);
            this.f6382H.mo8881G1(i);
            awakenScrollBars();
        }
    }

    /* renamed from: A1 */
    public void mo8960A1(int i) {
        getScrollingChildHelper().mo20385r(i);
    }

    /* renamed from: B */
    public final void mo8961B() {
        int i = this.f6434q1;
        this.f6434q1 = 0;
        if (i != 0 && mo9160x0()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            C0012a8.m107b(obtain, i);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    /* renamed from: B0 */
    public void mo8962B0() {
        int j = this.f6425k.mo9718j();
        for (int i = 0; i < j; i++) {
            ((LayoutParams) this.f6425k.mo9717i(i).getLayoutParams()).f6476e = true;
        }
        this.f6413d.mo9490s();
    }

    /* renamed from: B1 */
    public void mo8963B1() {
        setScrollState(0);
        mo8966C1();
    }

    /* renamed from: C */
    public void mo8964C() {
        boolean z;
        if (this.f6376C != null && this.f6382H != null) {
            this.f6403V1.f6521j = false;
            if (!this.f6428l2 || (this.f6429m2 == getWidth() && this.f6430n2 == getHeight())) {
                z = false;
            } else {
                z = true;
            }
            this.f6429m2 = 0;
            this.f6430n2 = 0;
            this.f6428l2 = false;
            if (this.f6403V1.f6516e == 1) {
                mo8967D();
                this.f6382H.mo9210I1(this);
                mo8970E();
            } else if (this.f6420g.mo9672q() || z || this.f6382H.mo9288v0() != getWidth() || this.f6382H.mo9256h0() != getHeight()) {
                this.f6382H.mo9210I1(this);
                mo8970E();
            } else {
                this.f6382H.mo9210I1(this);
            }
            mo8972F();
        }
    }

    /* renamed from: C0 */
    public void mo8965C0() {
        int j = this.f6425k.mo9718j();
        for (int i = 0; i < j; i++) {
            C1231a0 i0 = m8852i0(this.f6425k.mo9717i(i));
            if (i0 != null && !i0.shouldIgnore()) {
                i0.addFlags(6);
            }
        }
        mo8962B0();
        this.f6413d.mo9491t();
    }

    /* renamed from: C1 */
    public final void mo8966C1() {
        this.f6399S1.mo9537f();
        LayoutManager layoutManager = this.f6382H;
        if (layoutManager != null) {
            layoutManager.mo9233T1();
        }
    }

    /* renamed from: D */
    public final void mo8967D() {
        boolean z = true;
        this.f6403V1.mo9524a(1);
        mo8996R(this.f6403V1);
        this.f6403V1.f6521j = false;
        mo9161x1();
        this.f6435r.mo9999f();
        mo8985L0();
        mo9001T0();
        mo9080k1();
        C1260x xVar = this.f6403V1;
        if (!xVar.f6522k || !this.f6407Z1) {
            z = false;
        }
        xVar.f6520i = z;
        this.f6407Z1 = false;
        this.f6406Y1 = false;
        xVar.f6519h = xVar.f6523l;
        xVar.f6517f = this.f6376C.getItemCount();
        mo9006W(this.f6418e2);
        if (this.f6403V1.f6522k) {
            int g = this.f6425k.mo9715g();
            for (int i = 0; i < g; i++) {
                C1231a0 i0 = m8852i0(this.f6425k.mo9714f(i));
                if (!i0.shouldIgnore() && (!i0.isInvalid() || this.f6376C.hasStableIds())) {
                    this.f6435r.mo9998e(i0, this.f6378D1.recordPreLayoutInformation(this.f6403V1, i0, C1242l.buildAdapterChangeFlagsForAnimations(i0), i0.getUnmodifiedPayloads()));
                    if (this.f6403V1.f6520i && i0.isUpdated() && !i0.isRemoved() && !i0.shouldIgnore() && !i0.isInvalid()) {
                        this.f6435r.mo9996c(mo9039e0(i0), i0);
                    }
                }
            }
        }
        if (this.f6403V1.f6523l) {
            mo9083l1();
            C1260x xVar2 = this.f6403V1;
            boolean z2 = xVar2.f6518g;
            xVar2.f6518g = false;
            this.f6382H.mo8850f1(this.f6413d, xVar2);
            this.f6403V1.f6518g = z2;
            for (int i2 = 0; i2 < this.f6425k.mo9715g(); i2++) {
                C1231a0 i02 = m8852i0(this.f6425k.mo9714f(i2));
                if (!i02.shouldIgnore() && !this.f6435r.mo10002i(i02)) {
                    int buildAdapterChangeFlagsForAnimations = C1242l.buildAdapterChangeFlagsForAnimations(i02);
                    boolean hasAnyOfTheFlags = i02.hasAnyOfTheFlags(8192);
                    if (!hasAnyOfTheFlags) {
                        buildAdapterChangeFlagsForAnimations |= 4096;
                    }
                    C1242l.C1245c recordPreLayoutInformation = this.f6378D1.recordPreLayoutInformation(this.f6403V1, i02, buildAdapterChangeFlagsForAnimations, i02.getUnmodifiedPayloads());
                    if (hasAnyOfTheFlags) {
                        mo9007W0(i02, recordPreLayoutInformation);
                    } else {
                        this.f6435r.mo9994a(i02, recordPreLayoutInformation);
                    }
                }
            }
            mo9147t();
        } else {
            mo9147t();
        }
        mo8987M0();
        mo9167z1(false);
        this.f6403V1.f6516e = 2;
    }

    /* renamed from: D0 */
    public final void mo8968D0(int i, int i2, MotionEvent motionEvent, int i3) {
        boolean z;
        int i4;
        int i5;
        int i6;
        LayoutManager layoutManager = this.f6382H;
        if (layoutManager != null && !this.f6431o1) {
            int[] iArr = this.f6423i2;
            int i7 = 0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean v = layoutManager.mo8929v();
            boolean w = this.f6382H.mo8931w();
            if (w) {
                z = v | true;
            } else {
                z = v;
            }
            mo9164y1(z ? 1 : 0, i3);
            if (v) {
                i4 = i;
            } else {
                i4 = 0;
            }
            if (w) {
                i5 = i2;
            } else {
                i5 = 0;
            }
            if (mo8974G(i4, i5, this.f6423i2, this.f6421g2, i3)) {
                int[] iArr2 = this.f6423i2;
                i -= iArr2[0];
                i2 -= iArr2[1];
            }
            if (v) {
                i6 = i;
            } else {
                i6 = 0;
            }
            if (w) {
                i7 = i2;
            }
            mo9086m1(i6, i7, motionEvent, i3);
            C1310j jVar = this.f6400T1;
            if (!(jVar == null || (i == 0 && i2 == 0))) {
                jVar.mo9817f(this, i, i2);
            }
            mo8960A1(i3);
        }
    }

    /* renamed from: D1 */
    public void mo8969D1(int i, int i2, Object obj) {
        int i3;
        int j = this.f6425k.mo9718j();
        int i4 = i + i2;
        for (int i5 = 0; i5 < j; i5++) {
            View i6 = this.f6425k.mo9717i(i5);
            C1231a0 i0 = m8852i0(i6);
            if (i0 != null && !i0.shouldIgnore() && (i3 = i0.mPosition) >= i && i3 < i4) {
                i0.addFlags(2);
                i0.addChangePayload(obj);
                ((LayoutParams) i6.getLayoutParams()).f6476e = true;
            }
        }
        this.f6413d.mo9471M(i, i2);
    }

    /* renamed from: E */
    public final void mo8970E() {
        boolean z;
        mo9161x1();
        mo8985L0();
        this.f6403V1.mo9524a(6);
        this.f6420g.mo9665j();
        this.f6403V1.f6517f = this.f6376C.getItemCount();
        this.f6403V1.f6515d = 0;
        if (this.f6415e != null && this.f6376C.canRestoreState()) {
            Parcelable parcelable = this.f6415e.f6478e;
            if (parcelable != null) {
                this.f6382H.mo8916k1(parcelable);
            }
            this.f6415e = null;
        }
        C1260x xVar = this.f6403V1;
        xVar.f6519h = false;
        this.f6382H.mo8850f1(this.f6413d, xVar);
        C1260x xVar2 = this.f6403V1;
        xVar2.f6518g = false;
        if (!xVar2.f6522k || this.f6378D1 == null) {
            z = false;
        } else {
            z = true;
        }
        xVar2.f6522k = z;
        xVar2.f6516e = 4;
        mo8987M0();
        mo9167z1(false);
    }

    /* renamed from: E0 */
    public void mo8971E0(int i) {
        int g = this.f6425k.mo9715g();
        for (int i2 = 0; i2 < g; i2++) {
            this.f6425k.mo9714f(i2).offsetLeftAndRight(i);
        }
    }

    /* renamed from: F */
    public final void mo8972F() {
        this.f6403V1.mo9524a(4);
        mo9161x1();
        mo8985L0();
        C1260x xVar = this.f6403V1;
        xVar.f6516e = 1;
        if (xVar.f6522k) {
            for (int g = this.f6425k.mo9715g() - 1; g >= 0; g--) {
                C1231a0 i0 = m8852i0(this.f6425k.mo9714f(g));
                if (!i0.shouldIgnore()) {
                    long e0 = mo9039e0(i0);
                    C1242l.C1245c recordPostLayoutInformation = this.f6378D1.recordPostLayoutInformation(this.f6403V1, i0);
                    C1231a0 g2 = this.f6435r.mo10000g(e0);
                    if (g2 == null || g2.shouldIgnore()) {
                        this.f6435r.mo9997d(i0, recordPostLayoutInformation);
                    } else {
                        boolean h = this.f6435r.mo10001h(g2);
                        boolean h2 = this.f6435r.mo10001h(i0);
                        if (!h || g2 != i0) {
                            C1242l.C1245c n = this.f6435r.mo10007n(g2);
                            this.f6435r.mo9997d(i0, recordPostLayoutInformation);
                            C1242l.C1245c m = this.f6435r.mo10006m(i0);
                            if (n == null) {
                                mo9106p0(e0, i0, g2);
                            } else {
                                mo9087n(g2, i0, n, m, h, h2);
                            }
                        } else {
                            this.f6435r.mo9997d(i0, recordPostLayoutInformation);
                        }
                    }
                }
            }
            this.f6435r.mo10008o(this.f6432o2);
        }
        this.f6382H.mo9287u1(this.f6413d);
        C1260x xVar2 = this.f6403V1;
        xVar2.f6514c = xVar2.f6517f;
        this.f6440u1 = false;
        this.f6442v1 = false;
        xVar2.f6522k = false;
        xVar2.f6523l = false;
        this.f6382H.f6466x = false;
        ArrayList<C1231a0> arrayList = this.f6413d.f6497b;
        if (arrayList != null) {
            arrayList.clear();
        }
        LayoutManager layoutManager = this.f6382H;
        if (layoutManager.f6454I) {
            layoutManager.f6453H = 0;
            layoutManager.f6454I = false;
            this.f6413d.mo9469K();
        }
        this.f6382H.mo8852g1(this.f6403V1);
        mo8987M0();
        mo9167z1(false);
        this.f6435r.mo9999f();
        int[] iArr = this.f6418e2;
        if (mo9162y(iArr[0], iArr[1])) {
            mo8980J(0, 0);
        }
        mo9008X0();
        mo9072i1();
    }

    /* renamed from: F0 */
    public void mo8973F0(int i) {
        int g = this.f6425k.mo9715g();
        for (int i2 = 0; i2 < g; i2++) {
            this.f6425k.mo9714f(i2).offsetTopAndBottom(i);
        }
    }

    /* renamed from: G */
    public boolean mo8974G(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().mo20371d(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: G0 */
    public void mo8975G0(int i, int i2) {
        int j = this.f6425k.mo9718j();
        for (int i3 = 0; i3 < j; i3++) {
            C1231a0 i0 = m8852i0(this.f6425k.mo9717i(i3));
            if (i0 != null && !i0.shouldIgnore() && i0.mPosition >= i) {
                i0.offsetPosition(i2, false);
                this.f6403V1.f6518g = true;
            }
        }
        this.f6413d.mo9492u(i, i2);
        requestLayout();
    }

    /* renamed from: H */
    public final void mo8976H(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().mo20372e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: H0 */
    public void mo8977H0(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int j = this.f6425k.mo9718j();
        if (i < i2) {
            i5 = -1;
            i4 = i;
            i3 = i2;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i7 = 0; i7 < j; i7++) {
            C1231a0 i0 = m8852i0(this.f6425k.mo9717i(i7));
            if (i0 != null && (i6 = i0.mPosition) >= i4 && i6 <= i3) {
                if (i6 == i) {
                    i0.offsetPosition(i2 - i, false);
                } else {
                    i0.offsetPosition(i5, false);
                }
                this.f6403V1.f6518g = true;
            }
        }
        this.f6413d.mo9493v(i, i2);
        requestLayout();
    }

    /* renamed from: I */
    public void mo8978I(int i) {
        LayoutManager layoutManager = this.f6382H;
        if (layoutManager != null) {
            layoutManager.mo9266m1(i);
        }
        mo8993P0(i);
        C1251r rVar = this.f6404W1;
        if (rVar != null) {
            rVar.onScrollStateChanged(this, i);
        }
        List<C1251r> list = this.f6405X1;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f6405X1.get(size).onScrollStateChanged(this, i);
            }
        }
    }

    /* renamed from: I0 */
    public void mo8979I0(int i, int i2, boolean z) {
        int i3 = i + i2;
        int j = this.f6425k.mo9718j();
        for (int i4 = 0; i4 < j; i4++) {
            C1231a0 i0 = m8852i0(this.f6425k.mo9717i(i4));
            if (i0 != null && !i0.shouldIgnore()) {
                int i5 = i0.mPosition;
                if (i5 >= i3) {
                    i0.offsetPosition(-i2, z);
                    this.f6403V1.f6518g = true;
                } else if (i5 >= i) {
                    i0.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                    this.f6403V1.f6518g = true;
                }
            }
        }
        this.f6413d.mo9494w(i, i2, z);
        requestLayout();
    }

    /* renamed from: J */
    public void mo8980J(int i, int i2) {
        this.f6445x1++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        mo8995Q0(i, i2);
        C1251r rVar = this.f6404W1;
        if (rVar != null) {
            rVar.onScrolled(this, i, i2);
        }
        List<C1251r> list = this.f6405X1;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f6405X1.get(size).onScrolled(this, i, i2);
            }
        }
        this.f6445x1--;
    }

    /* renamed from: J0 */
    public void mo8981J0(View view) {
    }

    /* renamed from: K */
    public void mo8982K() {
        int i;
        for (int size = this.f6424j2.size() - 1; size >= 0; size--) {
            C1231a0 a0Var = this.f6424j2.get(size);
            if (a0Var.itemView.getParent() == this && !a0Var.shouldIgnore() && (i = a0Var.mPendingAccessibilityState) != -1) {
                ga7.m17714A0(a0Var.itemView, i);
                a0Var.mPendingAccessibilityState = -1;
            }
        }
        this.f6424j2.clear();
    }

    /* renamed from: K0 */
    public void mo8983K0(View view) {
    }

    /* renamed from: L */
    public final boolean mo8984L(MotionEvent motionEvent) {
        C1250q qVar = this.f6396Q;
        if (qVar != null) {
            qVar.mo9441a(this, motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.f6396Q = null;
            }
            return true;
        } else if (motionEvent.getAction() == 0) {
            return false;
        } else {
            return mo9004V(motionEvent);
        }
    }

    /* renamed from: L0 */
    public void mo8985L0() {
        this.f6443w1++;
    }

    /* renamed from: M */
    public void mo8986M() {
        if (this.f6377C1 == null) {
            EdgeEffect a = this.f6447y1.mo9399a(this, 3);
            this.f6377C1 = a;
            if (this.f6437s) {
                a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* renamed from: M0 */
    public void mo8987M0() {
        mo8989N0(true);
    }

    /* renamed from: N */
    public void mo8988N() {
        if (this.f6448z1 == null) {
            EdgeEffect a = this.f6447y1.mo9399a(this, 0);
            this.f6448z1 = a;
            if (this.f6437s) {
                a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* renamed from: N0 */
    public void mo8989N0(boolean z) {
        int i = this.f6443w1 - 1;
        this.f6443w1 = i;
        if (i < 1) {
            this.f6443w1 = 0;
            if (z) {
                mo8961B();
                mo8982K();
            }
        }
    }

    /* renamed from: O */
    public void mo8990O() {
        if (this.f6375B1 == null) {
            EdgeEffect a = this.f6447y1.mo9399a(this, 2);
            this.f6375B1 = a;
            if (this.f6437s) {
                a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* renamed from: O0 */
    public final void mo8991O0(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f6380F1) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f6380F1 = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f6386J1 = x;
            this.f6383H1 = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f6387K1 = y;
            this.f6385I1 = y;
        }
    }

    /* renamed from: P */
    public void mo8992P() {
        if (this.f6373A1 == null) {
            EdgeEffect a = this.f6447y1.mo9399a(this, 1);
            this.f6373A1 = a;
            if (this.f6437s) {
                a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* renamed from: P0 */
    public void mo8993P0(int i) {
    }

    /* renamed from: Q */
    public String mo8994Q() {
        return " " + super.toString() + ", adapter:" + this.f6376C + ", layout:" + this.f6382H + ", context:" + getContext();
    }

    /* renamed from: Q0 */
    public void mo8995Q0(int i, int i2) {
    }

    /* renamed from: R */
    public final void mo8996R(C1260x xVar) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f6399S1.f6531e;
            xVar.f6527p = overScroller.getFinalX() - overScroller.getCurrX();
            xVar.f6528q = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        xVar.f6527p = 0;
        xVar.f6528q = 0;
    }

    /* renamed from: R0 */
    public void mo8997R0() {
        if (!this.f6411b2 && this.f6401U) {
            ga7.m17769h0(this, this.f6427k2);
            this.f6411b2 = true;
        }
    }

    /* renamed from: S */
    public View mo8998S(float f, float f2) {
        for (int g = this.f6425k.mo9715g() - 1; g >= 0; g--) {
            View f3 = this.f6425k.mo9714f(g);
            float translationX = f3.getTranslationX();
            float translationY = f3.getTranslationY();
            if (f >= ((float) f3.getLeft()) + translationX && f <= ((float) f3.getRight()) + translationX && f2 >= ((float) f3.getTop()) + translationY && f2 <= ((float) f3.getBottom()) + translationY) {
                return f3;
            }
        }
        return null;
    }

    /* renamed from: S0 */
    public final boolean mo8999S0() {
        if (this.f6378D1 == null || !this.f6382H.mo8831U1()) {
            return false;
        }
        return true;
    }

    /* renamed from: T */
    public View mo9000T(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* renamed from: T0 */
    public final void mo9001T0() {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f6440u1) {
            this.f6420g.mo9680y();
            if (this.f6442v1) {
                this.f6382H.mo8841a1(this);
            }
        }
        if (mo8999S0()) {
            this.f6420g.mo9678w();
        } else {
            this.f6420g.mo9665j();
        }
        boolean z4 = false;
        if (this.f6406Y1 || this.f6407Z1) {
            z = true;
        } else {
            z = false;
        }
        C1260x xVar = this.f6403V1;
        if (!this.f6441v0 || this.f6378D1 == null || ((!(z3 = this.f6440u1) && !z && !this.f6382H.f6466x) || (z3 && !this.f6376C.hasStableIds()))) {
            z2 = false;
        } else {
            z2 = true;
        }
        xVar.f6522k = z2;
        C1260x xVar2 = this.f6403V1;
        if (xVar2.f6522k && z && !this.f6440u1 && mo8999S0()) {
            z4 = true;
        }
        xVar2.f6523l = z4;
    }

    /* renamed from: U */
    public C1231a0 mo9002U(View view) {
        View T = mo9000T(view);
        if (T == null) {
            return null;
        }
        return mo9068h0(T);
    }

    /* renamed from: U0 */
    public void mo9003U0(boolean z) {
        this.f6442v1 = z | this.f6442v1;
        this.f6440u1 = true;
        mo8965C0();
    }

    /* renamed from: V */
    public final boolean mo9004V(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f6394P.size();
        int i = 0;
        while (i < size) {
            C1250q qVar = this.f6394P.get(i);
            if (!qVar.mo9442c(this, motionEvent) || action == 3) {
                i++;
            } else {
                this.f6396Q = qVar;
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: V0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9005V0(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L_0x0021
            r6.mo8988N()
            android.widget.EdgeEffect r1 = r6.f6448z1
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
            p000.jn1.m20239c(r1, r4, r9)
        L_0x001f:
            r9 = r3
            goto L_0x003c
        L_0x0021:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x003b
            r6.mo8990O()
            android.widget.EdgeEffect r1 = r6.f6375B1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            p000.jn1.m20239c(r1, r4, r9)
            goto L_0x001f
        L_0x003b:
            r9 = 0
        L_0x003c:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L_0x0056
            r6.mo8992P()
            android.widget.EdgeEffect r9 = r6.f6373A1
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            p000.jn1.m20239c(r9, r1, r7)
            goto L_0x0072
        L_0x0056:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x0071
            r6.mo8986M()
            android.widget.EdgeEffect r9 = r6.f6377C1
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            p000.jn1.m20239c(r9, r1, r2)
            goto L_0x0072
        L_0x0071:
            r3 = r9
        L_0x0072:
            if (r3 != 0) goto L_0x007c
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L_0x007c
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x007f
        L_0x007c:
            p000.ga7.m17767g0(r6)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.mo9005V0(float, float, float, float):void");
    }

    /* renamed from: W */
    public final void mo9006W(int[] iArr) {
        int g = this.f6425k.mo9715g();
        if (g == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < g; i3++) {
            C1231a0 i0 = m8852i0(this.f6425k.mo9714f(i3));
            if (!i0.shouldIgnore()) {
                int layoutPosition = i0.getLayoutPosition();
                if (layoutPosition < i) {
                    i = layoutPosition;
                }
                if (layoutPosition > i2) {
                    i2 = layoutPosition;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* renamed from: W0 */
    public void mo9007W0(C1231a0 a0Var, C1242l.C1245c cVar) {
        a0Var.setFlags(0, 8192);
        if (this.f6403V1.f6520i && a0Var.isUpdated() && !a0Var.isRemoved() && !a0Var.shouldIgnore()) {
            this.f6435r.mo9996c(mo9039e0(a0Var), a0Var);
        }
        this.f6435r.mo9998e(a0Var, cVar);
    }

    /* renamed from: X0 */
    public final void mo9008X0() {
        C1231a0 a0Var;
        View findViewById;
        if (this.f6398R1 && this.f6376C != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (!f6369v2 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                        if (!this.f6425k.mo9722n(focusedChild)) {
                            return;
                        }
                    } else if (this.f6425k.mo9715g() == 0) {
                        requestFocus();
                        return;
                    }
                }
                View view = null;
                if (this.f6403V1.f6525n == -1 || !this.f6376C.hasStableIds()) {
                    a0Var = null;
                } else {
                    a0Var = mo9013a0(this.f6403V1.f6525n);
                }
                if (a0Var != null && !this.f6425k.mo9722n(a0Var.itemView) && a0Var.itemView.hasFocusable()) {
                    view = a0Var.itemView;
                } else if (this.f6425k.mo9715g() > 0) {
                    view = mo9009Y();
                }
                if (view != null) {
                    int i = this.f6403V1.f6526o;
                    if (!(((long) i) == -1 || (findViewById = view.findViewById(i)) == null || !findViewById.isFocusable())) {
                        view = findViewById;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    /* renamed from: Y */
    public final View mo9009Y() {
        C1231a0 Z;
        C1260x xVar = this.f6403V1;
        int i = xVar.f6524m;
        if (i == -1) {
            i = 0;
        }
        int b = xVar.mo9525b();
        int i2 = i;
        while (i2 < b) {
            C1231a0 Z2 = mo9011Z(i2);
            if (Z2 == null) {
                break;
            } else if (Z2.itemView.hasFocusable()) {
                return Z2.itemView;
            } else {
                i2++;
            }
        }
        int min = Math.min(b, i);
        while (true) {
            min--;
            if (min < 0 || (Z = mo9011Z(min)) == null) {
                return null;
            }
            if (Z.itemView.hasFocusable()) {
                return Z.itemView;
            }
        }
    }

    /* renamed from: Y0 */
    public final void mo9010Y0() {
        boolean z;
        EdgeEffect edgeEffect = this.f6448z1;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.f6448z1.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f6373A1;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.f6373A1.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f6375B1;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.f6375B1.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f6377C1;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.f6377C1.isFinished();
        }
        if (z) {
            ga7.m17767g0(this);
        }
    }

    /* renamed from: Z */
    public C1231a0 mo9011Z(int i) {
        C1231a0 a0Var = null;
        if (this.f6440u1) {
            return null;
        }
        int j = this.f6425k.mo9718j();
        for (int i2 = 0; i2 < j; i2++) {
            C1231a0 i0 = m8852i0(this.f6425k.mo9717i(i2));
            if (i0 != null && !i0.isRemoved() && mo9028d0(i0) == i) {
                if (!this.f6425k.mo9722n(i0.itemView)) {
                    return i0;
                }
                a0Var = i0;
            }
        }
        return a0Var;
    }

    /* renamed from: Z0 */
    public void mo9012Z0() {
        C1242l lVar = this.f6378D1;
        if (lVar != null) {
            lVar.endAnimations();
        }
        LayoutManager layoutManager = this.f6382H;
        if (layoutManager != null) {
            layoutManager.mo9284t1(this.f6413d);
            this.f6382H.mo9287u1(this.f6413d);
        }
        this.f6413d.mo9474c();
    }

    /* renamed from: a0 */
    public C1231a0 mo9013a0(long j) {
        Adapter adapter = this.f6376C;
        C1231a0 a0Var = null;
        if (adapter != null && adapter.hasStableIds()) {
            int j2 = this.f6425k.mo9718j();
            for (int i = 0; i < j2; i++) {
                C1231a0 i0 = m8852i0(this.f6425k.mo9717i(i));
                if (i0 != null && !i0.isRemoved() && i0.getItemId() == j) {
                    if (!this.f6425k.mo9722n(i0.itemView)) {
                        return i0;
                    }
                    a0Var = i0;
                }
            }
        }
        return a0Var;
    }

    /* renamed from: a1 */
    public boolean mo9014a1(View view) {
        mo9161x1();
        boolean r = this.f6425k.mo9726r(view);
        if (r) {
            C1231a0 i0 = m8852i0(view);
            this.f6413d.mo9468J(i0);
            this.f6413d.mo9461C(i0);
        }
        mo9167z1(!r);
        return r;
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        LayoutManager layoutManager = this.f6382H;
        if (layoutManager == null || !layoutManager.mo9222N0(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    /* renamed from: b */
    public void mo9016b(int i, int i2) {
        if (i < 0) {
            mo8988N();
            if (this.f6448z1.isFinished()) {
                this.f6448z1.onAbsorb(-i);
            }
        } else if (i > 0) {
            mo8990O();
            if (this.f6375B1.isFinished()) {
                this.f6375B1.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            mo8992P();
            if (this.f6373A1.isFinished()) {
                this.f6373A1.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            mo8986M();
            if (this.f6377C1.isFinished()) {
                this.f6377C1.onAbsorb(i2);
            }
        }
        if (i != 0 || i2 != 0) {
            ga7.m17767g0(this);
        }
    }

    /* renamed from: b0 */
    public C1231a0 mo9017b0(int i, boolean z) {
        int j = this.f6425k.mo9718j();
        C1231a0 a0Var = null;
        for (int i2 = 0; i2 < j; i2++) {
            C1231a0 i0 = m8852i0(this.f6425k.mo9717i(i2));
            if (i0 != null && !i0.isRemoved()) {
                if (z) {
                    if (i0.mPosition != i) {
                        continue;
                    }
                } else if (i0.getLayoutPosition() != i) {
                    continue;
                }
                if (!this.f6425k.mo9722n(i0.itemView)) {
                    return i0;
                }
                a0Var = i0;
            }
        }
        return a0Var;
    }

    /* renamed from: b1 */
    public void mo9018b1(C1247n nVar) {
        boolean z;
        LayoutManager layoutManager = this.f6382H;
        if (layoutManager != null) {
            layoutManager.mo8924r("Cannot remove item decoration during a scroll  or layout");
        }
        this.f6390M.remove(nVar);
        if (this.f6390M.isEmpty()) {
            if (getOverScrollMode() == 2) {
                z = true;
            } else {
                z = false;
            }
            setWillNotDraw(z);
        }
        mo8962B0();
        requestLayout();
    }

    /* renamed from: c0 */
    public boolean mo9019c0(int i, int i2) {
        boolean z;
        LayoutManager layoutManager = this.f6382H;
        if (layoutManager == null || this.f6431o1) {
            return false;
        }
        boolean v = layoutManager.mo8929v();
        boolean w = this.f6382H.mo8931w();
        if (!v || Math.abs(i) < this.f6392N1) {
            i = 0;
        }
        if (!w || Math.abs(i2) < this.f6392N1) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        float f = (float) i;
        float f2 = (float) i2;
        if (!dispatchNestedPreFling(f, f2)) {
            if (v || w) {
                z = true;
            } else {
                z = false;
            }
            dispatchNestedFling(f, f2, z);
            C1249p pVar = this.f6391M1;
            if (pVar != null && pVar.mo9440a(i, i2)) {
                return true;
            }
            if (z) {
                if (w) {
                    v |= true;
                }
                mo9164y1(v ? 1 : 0, 1);
                int i3 = this.f6393O1;
                int max = Math.max(-i3, Math.min(i, i3));
                int i4 = this.f6393O1;
                this.f6399S1.mo9533b(max, Math.max(-i4, Math.min(i2, i4)));
                return true;
            }
        }
        return false;
    }

    /* renamed from: c1 */
    public void mo9020c1(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i < 0 || i >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
        }
        mo9018b1(mo9091o0(i));
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof LayoutParams) || !this.f6382H.mo8862x((LayoutParams) layoutParams)) {
            return false;
        }
        return true;
    }

    public int computeHorizontalScrollExtent() {
        LayoutManager layoutManager = this.f6382H;
        if (layoutManager != null && layoutManager.mo8929v()) {
            return this.f6382H.mo8874B(this.f6403V1);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        LayoutManager layoutManager = this.f6382H;
        if (layoutManager != null && layoutManager.mo8929v()) {
            return this.f6382H.mo8819C(this.f6403V1);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        LayoutManager layoutManager = this.f6382H;
        if (layoutManager != null && layoutManager.mo8929v()) {
            return this.f6382H.mo8820D(this.f6403V1);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        LayoutManager layoutManager = this.f6382H;
        if (layoutManager != null && layoutManager.mo8931w()) {
            return this.f6382H.mo8878E(this.f6403V1);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        LayoutManager layoutManager = this.f6382H;
        if (layoutManager != null && layoutManager.mo8931w()) {
            return this.f6382H.mo8821F(this.f6403V1);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        LayoutManager layoutManager = this.f6382H;
        if (layoutManager != null && layoutManager.mo8931w()) {
            return this.f6382H.mo8823G(this.f6403V1);
        }
        return 0;
    }

    /* renamed from: d0 */
    public int mo9028d0(C1231a0 a0Var) {
        if (a0Var.hasAnyOfTheFlags(524) || !a0Var.isBound()) {
            return -1;
        }
        return this.f6420g.mo9660e(a0Var.mPosition);
    }

    /* renamed from: d1 */
    public void mo9029d1(C1248o oVar) {
        List<C1248o> list = this.f6439t1;
        if (list != null) {
            list.remove(oVar);
        }
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().mo20368a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().mo20369b(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().mo20370c(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().mo20373f(i, i2, i3, i4, iArr);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        int i2;
        super.draw(canvas);
        int size = this.f6390M.size();
        boolean z4 = false;
        for (int i3 = 0; i3 < size; i3++) {
            this.f6390M.get(i3).onDrawOver(canvas, this, this.f6403V1);
        }
        EdgeEffect edgeEffect = this.f6448z1;
        boolean z5 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            if (this.f6437s) {
                i2 = getPaddingBottom();
            } else {
                i2 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + i2), Utils.FLOAT_EPSILON);
            EdgeEffect edgeEffect2 = this.f6448z1;
            if (edgeEffect2 == null || !edgeEffect2.draw(canvas)) {
                z = false;
            } else {
                z = true;
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f6373A1;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f6437s) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f6373A1;
            if (edgeEffect4 == null || !edgeEffect4.draw(canvas)) {
                z3 = false;
            } else {
                z3 = true;
            }
            z |= z3;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f6375B1;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.f6437s) {
                i = getPaddingTop();
            } else {
                i = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate((float) i, (float) (-width));
            EdgeEffect edgeEffect6 = this.f6375B1;
            if (edgeEffect6 == null || !edgeEffect6.draw(canvas)) {
                z2 = false;
            } else {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f6377C1;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f6437s) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.f6377C1;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z4 = true;
            }
            z |= z4;
            canvas.restoreToCount(save4);
        }
        if (z || this.f6378D1 == null || this.f6390M.size() <= 0 || !this.f6378D1.isRunning()) {
            z5 = z;
        }
        if (z5) {
            ga7.m17767g0(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* renamed from: e0 */
    public long mo9039e0(C1231a0 a0Var) {
        if (this.f6376C.hasStableIds()) {
            return a0Var.getItemId();
        }
        return (long) a0Var.mPosition;
    }

    /* renamed from: e1 */
    public void mo9040e1(C1250q qVar) {
        this.f6394P.remove(qVar);
        if (this.f6396Q == qVar) {
            this.f6396Q = null;
        }
    }

    /* renamed from: f0 */
    public int mo9041f0(View view) {
        C1231a0 i0 = m8852i0(view);
        if (i0 != null) {
            return i0.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    /* renamed from: f1 */
    public void mo9042f1(C1251r rVar) {
        List<C1251r> list = this.f6405X1;
        if (list != null) {
            list.remove(rVar);
        }
    }

    public View focusSearch(View view, int i) {
        boolean z;
        View view2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        int i3;
        View Y0 = this.f6382H.mo9240Y0(view, i);
        if (Y0 != null) {
            return Y0;
        }
        boolean z5 = true;
        if (this.f6376C == null || this.f6382H == null || mo9163y0() || this.f6431o1) {
            z = false;
        } else {
            z = true;
        }
        FocusFinder instance = FocusFinder.getInstance();
        if (!z || !(i == 2 || i == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i);
            if (findNextFocus != null || !z) {
                view2 = findNextFocus;
            } else {
                mo9153v();
                if (mo9000T(view) == null) {
                    return null;
                }
                mo9161x1();
                view2 = this.f6382H.mo8830R0(view, i, this.f6413d, this.f6403V1);
                mo9167z1(false);
            }
        } else {
            if (this.f6382H.mo8931w()) {
                if (i == 2) {
                    i3 = 130;
                } else {
                    i3 = 33;
                }
                if (instance.findNextFocus(this, view, i3) == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (f6368u2) {
                    i = i3;
                }
            } else {
                z2 = false;
            }
            if (!z2 && this.f6382H.mo8929v()) {
                if (this.f6382H.mo9262k0() == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (i == 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z3 ^ z4) {
                    i2 = 66;
                } else {
                    i2 = 17;
                }
                if (instance.findNextFocus(this, view, i2) != null) {
                    z5 = false;
                }
                if (f6368u2) {
                    i = i2;
                }
                z2 = z5;
            }
            if (z2) {
                mo9153v();
                if (mo9000T(view) == null) {
                    return null;
                }
                mo9161x1();
                this.f6382H.mo8830R0(view, i, this.f6413d, this.f6403V1);
                mo9167z1(false);
            }
            view2 = instance.findNextFocus(this, view, i);
        }
        if (view2 == null || view2.hasFocusable()) {
            if (mo9166z0(view, view2, i)) {
                return view2;
            }
            return super.focusSearch(view, i);
        } else if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        } else {
            mo9069h1(view2, (View) null);
            return view;
        }
    }

    /* renamed from: g */
    public final void mo9044g(C1231a0 a0Var) {
        boolean z;
        View view = a0Var.itemView;
        if (view.getParent() == this) {
            z = true;
        } else {
            z = false;
        }
        this.f6413d.mo9468J(mo9068h0(view));
        if (a0Var.isTmpDetached()) {
            this.f6425k.mo9711c(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.f6425k.mo9710b(view, true);
        } else {
            this.f6425k.mo9719k(view);
        }
    }

    /* renamed from: g0 */
    public int mo9045g0(View view) {
        C1231a0 i0 = m8852i0(view);
        if (i0 != null) {
            return i0.getLayoutPosition();
        }
        return -1;
    }

    /* renamed from: g1 */
    public void mo9046g1() {
        C1231a0 a0Var;
        int g = this.f6425k.mo9715g();
        for (int i = 0; i < g; i++) {
            View f = this.f6425k.mo9714f(i);
            C1231a0 h0 = mo9068h0(f);
            if (!(h0 == null || (a0Var = h0.mShadowingHolder) == null)) {
                View view = a0Var.itemView;
                int left = f.getLeft();
                int top = f.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutManager layoutManager = this.f6382H;
        if (layoutManager != null) {
            return layoutManager.mo8827O();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo8994Q());
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        LayoutManager layoutManager = this.f6382H;
        if (layoutManager != null) {
            return layoutManager.mo8828P(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo8994Q());
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public Adapter getAdapter() {
        return this.f6376C;
    }

    public int getBaseline() {
        LayoutManager layoutManager = this.f6382H;
        if (layoutManager != null) {
            return layoutManager.mo9228R();
        }
        return super.getBaseline();
    }

    public int getChildDrawingOrder(int i, int i2) {
        C1240j jVar = this.f6414d2;
        if (jVar == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return jVar.mo9398a(i, i2);
    }

    public boolean getClipToPadding() {
        return this.f6437s;
    }

    public C1339s getCompatAccessibilityDelegate() {
        return this.f6412c2;
    }

    public C1241k getEdgeEffectFactory() {
        return this.f6447y1;
    }

    public C1242l getItemAnimator() {
        return this.f6378D1;
    }

    public int getItemDecorationCount() {
        return this.f6390M.size();
    }

    public LayoutManager getLayoutManager() {
        return this.f6382H;
    }

    public int getMaxFlingVelocity() {
        return this.f6393O1;
    }

    public int getMinFlingVelocity() {
        return this.f6392N1;
    }

    /* access modifiers changed from: package-private */
    public long getNanoTime() {
        if (f6367t2) {
            return System.nanoTime();
        }
        return 0;
    }

    public C1249p getOnFlingListener() {
        return this.f6391M1;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f6398R1;
    }

    public C1252s getRecycledViewPool() {
        return this.f6413d.mo9480i();
    }

    public int getScrollState() {
        return this.f6379E1;
    }

    /* renamed from: h */
    public void mo9067h(C1247n nVar) {
        mo9071i(nVar, -1);
    }

    /* renamed from: h0 */
    public C1231a0 mo9068h0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m8852i0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* renamed from: h1 */
    public final void mo9069h1(View view, View view2) {
        View view3;
        boolean z;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        this.f6446y.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (!layoutParams2.f6476e) {
                Rect rect = layoutParams2.f6475d;
                Rect rect2 = this.f6446y;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f6446y);
            offsetRectIntoDescendantCoords(view, this.f6446y);
        }
        LayoutManager layoutManager = this.f6382H;
        Rect rect3 = this.f6446y;
        boolean z2 = !this.f6441v0;
        if (view2 == null) {
            z = true;
        } else {
            z = false;
        }
        layoutManager.mo9198B1(this, view, rect3, z2, z);
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().mo20377j();
    }

    /* renamed from: i */
    public void mo9071i(C1247n nVar, int i) {
        LayoutManager layoutManager = this.f6382H;
        if (layoutManager != null) {
            layoutManager.mo8924r("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f6390M.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.f6390M.add(nVar);
        } else {
            this.f6390M.add(i, nVar);
        }
        mo8962B0();
        requestLayout();
    }

    /* renamed from: i1 */
    public final void mo9072i1() {
        C1260x xVar = this.f6403V1;
        xVar.f6525n = -1;
        xVar.f6524m = -1;
        xVar.f6526o = -1;
    }

    public boolean isAttachedToWindow() {
        return this.f6401U;
    }

    public final boolean isLayoutSuppressed() {
        return this.f6431o1;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().mo20379l();
    }

    /* renamed from: j */
    public void mo9076j(C1248o oVar) {
        if (this.f6439t1 == null) {
            this.f6439t1 = new ArrayList();
        }
        this.f6439t1.add(oVar);
    }

    /* renamed from: j0 */
    public void mo9077j0(View view, Rect rect) {
        m8853k0(view, rect);
    }

    /* renamed from: j1 */
    public final void mo9078j1() {
        VelocityTracker velocityTracker = this.f6381G1;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        mo8960A1(0);
        mo9010Y0();
    }

    /* renamed from: k */
    public void mo9079k(C1250q qVar) {
        this.f6394P.add(qVar);
    }

    /* renamed from: k1 */
    public final void mo9080k1() {
        View view;
        long j;
        int i;
        C1231a0 a0Var = null;
        if (!this.f6398R1 || !hasFocus() || this.f6376C == null) {
            view = null;
        } else {
            view = getFocusedChild();
        }
        if (view != null) {
            a0Var = mo9002U(view);
        }
        if (a0Var == null) {
            mo9072i1();
            return;
        }
        C1260x xVar = this.f6403V1;
        if (this.f6376C.hasStableIds()) {
            j = a0Var.getItemId();
        } else {
            j = -1;
        }
        xVar.f6525n = j;
        C1260x xVar2 = this.f6403V1;
        if (this.f6440u1) {
            i = -1;
        } else if (a0Var.isRemoved()) {
            i = a0Var.mOldPosition;
        } else {
            i = a0Var.getAbsoluteAdapterPosition();
        }
        xVar2.f6524m = i;
        this.f6403V1.f6526o = mo9082l0(a0Var.itemView);
    }

    /* renamed from: l */
    public void mo9081l(C1251r rVar) {
        if (this.f6405X1 == null) {
            this.f6405X1 = new ArrayList();
        }
        this.f6405X1.add(rVar);
    }

    /* renamed from: l0 */
    public final int mo9082l0(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    /* renamed from: l1 */
    public void mo9083l1() {
        int j = this.f6425k.mo9718j();
        for (int i = 0; i < j; i++) {
            C1231a0 i0 = m8852i0(this.f6425k.mo9717i(i));
            if (!i0.shouldIgnore()) {
                i0.saveOldPosition();
            }
        }
    }

    /* renamed from: m */
    public void mo9084m(C1231a0 a0Var, C1242l.C1245c cVar, C1242l.C1245c cVar2) {
        a0Var.setIsRecyclable(false);
        if (this.f6378D1.animateAppearance(a0Var, cVar, cVar2)) {
            mo8997R0();
        }
    }

    /* renamed from: m0 */
    public final String mo9085m0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    /* renamed from: m1 */
    public boolean mo9086m1(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        int i8 = i;
        int i9 = i2;
        MotionEvent motionEvent2 = motionEvent;
        mo9153v();
        if (this.f6376C != null) {
            int[] iArr = this.f6423i2;
            iArr[0] = 0;
            iArr[1] = 0;
            mo9089n1(i8, i9, iArr);
            int[] iArr2 = this.f6423i2;
            int i10 = iArr2[0];
            int i11 = iArr2[1];
            i7 = i11;
            i6 = i10;
            i5 = i8 - i10;
            i4 = i9 - i11;
        } else {
            i7 = 0;
            i6 = 0;
            i5 = 0;
            i4 = 0;
        }
        if (!this.f6390M.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f6423i2;
        iArr3[0] = 0;
        iArr3[1] = 0;
        mo8976H(i6, i7, i5, i4, this.f6421g2, i3, iArr3);
        int[] iArr4 = this.f6423i2;
        int i12 = iArr4[0];
        int i13 = i5 - i12;
        int i14 = iArr4[1];
        int i15 = i4 - i14;
        if (i12 == 0 && i14 == 0) {
            z = false;
        } else {
            z = true;
        }
        int i16 = this.f6386J1;
        int[] iArr5 = this.f6421g2;
        int i17 = iArr5[0];
        this.f6386J1 = i16 - i17;
        int i18 = this.f6387K1;
        int i19 = iArr5[1];
        this.f6387K1 = i18 - i19;
        int[] iArr6 = this.f6422h2;
        iArr6[0] = iArr6[0] + i17;
        iArr6[1] = iArr6[1] + i19;
        if (getOverScrollMode() != 2) {
            if (motionEvent2 != null && !oy3.m24440a(motionEvent2, 8194)) {
                mo9005V0(motionEvent.getX(), (float) i13, motionEvent.getY(), (float) i15);
            }
            mo9150u(i, i2);
        }
        if (!(i6 == 0 && i7 == 0)) {
            mo8980J(i6, i7);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z && i6 == 0 && i7 == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public final void mo9087n(C1231a0 a0Var, C1231a0 a0Var2, C1242l.C1245c cVar, C1242l.C1245c cVar2, boolean z, boolean z2) {
        a0Var.setIsRecyclable(false);
        if (z) {
            mo9044g(a0Var);
        }
        if (a0Var != a0Var2) {
            if (z2) {
                mo9044g(a0Var2);
            }
            a0Var.mShadowedHolder = a0Var2;
            mo9044g(a0Var);
            this.f6413d.mo9468J(a0Var);
            a0Var2.setIsRecyclable(false);
            a0Var2.mShadowingHolder = a0Var;
        }
        if (this.f6378D1.animateChange(a0Var, a0Var2, cVar, cVar2)) {
            mo8997R0();
        }
    }

    /* renamed from: n0 */
    public Rect mo9088n0(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.f6476e) {
            return layoutParams.f6475d;
        }
        if (this.f6403V1.mo9528e() && (layoutParams.mo9304b() || layoutParams.mo9306d())) {
            return layoutParams.f6475d;
        }
        Rect rect = layoutParams.f6475d;
        rect.set(0, 0, 0, 0);
        int size = this.f6390M.size();
        for (int i = 0; i < size; i++) {
            this.f6446y.set(0, 0, 0, 0);
            this.f6390M.get(i).getItemOffsets(this.f6446y, view, this, this.f6403V1);
            int i2 = rect.left;
            Rect rect2 = this.f6446y;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        layoutParams.f6476e = false;
        return rect;
    }

    /* renamed from: n1 */
    public void mo9089n1(int i, int i2, int[] iArr) {
        int i3;
        int i4;
        mo9161x1();
        mo8985L0();
        os6.m24033a("RV Scroll");
        mo8996R(this.f6403V1);
        if (i != 0) {
            i3 = this.f6382H.mo8822F1(i, this.f6413d, this.f6403V1);
        } else {
            i3 = 0;
        }
        if (i2 != 0) {
            i4 = this.f6382H.mo8824H1(i2, this.f6413d, this.f6403V1);
        } else {
            i4 = 0;
        }
        os6.m24034b();
        mo9046g1();
        mo8987M0();
        mo9167z1(false);
        if (iArr != null) {
            iArr[0] = i3;
            iArr[1] = i4;
        }
    }

    /* renamed from: o */
    public void mo9090o(C1231a0 a0Var, C1242l.C1245c cVar, C1242l.C1245c cVar2) {
        mo9044g(a0Var);
        a0Var.setIsRecyclable(false);
        if (this.f6378D1.animateDisappearance(a0Var, cVar, cVar2)) {
            mo8997R0();
        }
    }

    /* renamed from: o0 */
    public C1247n mo9091o0(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            return this.f6390M.get(i);
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
    }

    /* renamed from: o1 */
    public void mo9092o1(int i) {
        if (!this.f6431o1) {
            mo8963B1();
            LayoutManager layoutManager = this.f6382H;
            if (layoutManager != null) {
                layoutManager.mo8881G1(i);
                awakenScrollBars();
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6443w1 = 0;
        boolean z = true;
        this.f6401U = true;
        if (!this.f6441v0 || isLayoutRequested()) {
            z = false;
        }
        this.f6441v0 = z;
        LayoutManager layoutManager = this.f6382H;
        if (layoutManager != null) {
            layoutManager.mo9214K(this);
        }
        this.f6411b2 = false;
        if (f6367t2) {
            ThreadLocal<C1310j> threadLocal = C1310j.f6739k;
            C1310j jVar = threadLocal.get();
            this.f6400T1 = jVar;
            if (jVar == null) {
                this.f6400T1 = new C1310j();
                Display v = ga7.m17796v(this);
                float f = 60.0f;
                if (!isInEditMode() && v != null) {
                    float refreshRate = v.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                C1310j jVar2 = this.f6400T1;
                jVar2.f6743e = (long) (1.0E9f / f);
                threadLocal.set(jVar2);
            }
            this.f6400T1.mo9813a(this);
        }
    }

    public void onDetachedFromWindow() {
        C1310j jVar;
        super.onDetachedFromWindow();
        C1242l lVar = this.f6378D1;
        if (lVar != null) {
            lVar.endAnimations();
        }
        mo8963B1();
        this.f6401U = false;
        LayoutManager layoutManager = this.f6382H;
        if (layoutManager != null) {
            layoutManager.mo9217L(this, this.f6413d);
        }
        this.f6424j2.clear();
        removeCallbacks(this.f6427k2);
        this.f6435r.mo10003j();
        if (f6367t2 && (jVar = this.f6400T1) != null) {
            jVar.mo9821j(this);
            this.f6400T1 = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f6390M.size();
        for (int i = 0; i < size; i++) {
            this.f6390M.get(i).onDraw(canvas, this, this.f6403V1);
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.f6382H != null && !this.f6431o1 && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                if (this.f6382H.mo8931w()) {
                    f2 = -motionEvent.getAxisValue(9);
                } else {
                    f2 = 0.0f;
                }
                if (this.f6382H.mo8929v()) {
                    f = motionEvent.getAxisValue(10);
                    if (!(f2 == Utils.FLOAT_EPSILON && f == Utils.FLOAT_EPSILON)) {
                        mo8968D0((int) (f * this.f6395P1), (int) (f2 * this.f6397Q1), motionEvent, 1);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f6382H.mo8931w()) {
                        f2 = -axisValue;
                    } else if (this.f6382H.mo8929v()) {
                        f = axisValue;
                        f2 = 0.0f;
                        mo8968D0((int) (f * this.f6395P1), (int) (f2 * this.f6397Q1), motionEvent, 1);
                    }
                }
                f2 = 0.0f;
                f = 0.0f;
                mo8968D0((int) (f * this.f6395P1), (int) (f2 * this.f6397Q1), motionEvent, 1);
            }
            f = 0.0f;
            mo8968D0((int) (f * this.f6395P1), (int) (f2 * this.f6397Q1), motionEvent, 1);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.f6431o1) {
            return false;
        }
        this.f6396Q = null;
        if (mo9004V(motionEvent)) {
            mo9111r();
            return true;
        }
        LayoutManager layoutManager = this.f6382H;
        if (layoutManager == null) {
            return false;
        }
        boolean v = layoutManager.mo8929v();
        boolean w = this.f6382H.mo8931w();
        if (this.f6381G1 == null) {
            this.f6381G1 = VelocityTracker.obtain();
        }
        this.f6381G1.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f6433p1) {
                this.f6433p1 = false;
            }
            this.f6380F1 = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.f6386J1 = x;
            this.f6383H1 = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.f6387K1 = y;
            this.f6385I1 = y;
            if (this.f6379E1 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                mo8960A1(1);
            }
            int[] iArr = this.f6422h2;
            iArr[1] = 0;
            iArr[0] = 0;
            if (w) {
                v |= true;
            }
            mo9164y1(v ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.f6381G1.clear();
            mo8960A1(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f6380F1);
            if (findPointerIndex < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error processing scroll; pointer index for id ");
                sb.append(this.f6380F1);
                sb.append(" not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f6379E1 != 1) {
                int i = x2 - this.f6383H1;
                int i2 = y2 - this.f6385I1;
                if (!v || Math.abs(i) <= this.f6389L1) {
                    z = false;
                } else {
                    this.f6386J1 = x2;
                    z = true;
                }
                if (w && Math.abs(i2) > this.f6389L1) {
                    this.f6387K1 = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            mo9111r();
        } else if (actionMasked == 5) {
            this.f6380F1 = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f6386J1 = x3;
            this.f6383H1 = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f6387K1 = y3;
            this.f6385I1 = y3;
        } else if (actionMasked == 6) {
            mo8991O0(motionEvent);
        }
        if (this.f6379E1 == 1) {
            return true;
        }
        return false;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        os6.m24033a("RV OnLayout");
        mo8964C();
        os6.m24034b();
        this.f6441v0 = true;
    }

    public void onMeasure(int i, int i2) {
        LayoutManager layoutManager = this.f6382H;
        if (layoutManager == null) {
            mo9159x(i, i2);
            return;
        }
        boolean z = false;
        if (layoutManager.mo8935z0()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f6382H.mo9257h1(this.f6413d, this.f6403V1, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.f6428l2 = z;
            if (!z && this.f6376C != null) {
                if (this.f6403V1.f6516e == 1) {
                    mo8967D();
                }
                this.f6382H.mo9213J1(i, i2);
                this.f6403V1.f6521j = true;
                mo8970E();
                this.f6382H.mo9221M1(i, i2);
                if (this.f6382H.mo8891P1()) {
                    this.f6382H.mo9213J1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.f6403V1.f6521j = true;
                    mo8970E();
                    this.f6382H.mo9221M1(i, i2);
                }
                this.f6429m2 = getMeasuredWidth();
                this.f6430n2 = getMeasuredHeight();
            }
        } else if (this.f6416e0) {
            this.f6382H.mo9257h1(this.f6413d, this.f6403V1, i, i2);
        } else {
            if (this.f6436r1) {
                mo9161x1();
                mo8985L0();
                mo9001T0();
                mo8987M0();
                C1260x xVar = this.f6403V1;
                if (xVar.f6523l) {
                    xVar.f6519h = true;
                } else {
                    this.f6420g.mo9665j();
                    this.f6403V1.f6519h = false;
                }
                this.f6436r1 = false;
                mo9167z1(false);
            } else if (this.f6403V1.f6523l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            Adapter adapter = this.f6376C;
            if (adapter != null) {
                this.f6403V1.f6517f = adapter.getItemCount();
            } else {
                this.f6403V1.f6517f = 0;
            }
            mo9161x1();
            this.f6382H.mo9257h1(this.f6413d, this.f6403V1, i, i2);
            mo9167z1(false);
            this.f6403V1.f6519h = false;
        }
    }

    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (mo9163y0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f6415e = savedState;
        super.onRestoreInstanceState(savedState.mo5481a());
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f6415e;
        if (savedState2 != null) {
            savedState.mo9307b(savedState2);
        } else {
            LayoutManager layoutManager = this.f6382H;
            if (layoutManager != null) {
                savedState.f6478e = layoutManager.mo8918l1();
            } else {
                savedState.f6478e = null;
            }
        }
        return savedState;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            mo9157w0();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            boolean r0 = r6.f6431o1
            r8 = 0
            if (r0 != 0) goto L_0x01d6
            boolean r0 = r6.f6433p1
            if (r0 == 0) goto L_0x000f
            goto L_0x01d6
        L_0x000f:
            boolean r0 = r17.mo8984L(r18)
            r9 = 1
            if (r0 == 0) goto L_0x001a
            r17.mo9111r()
            return r9
        L_0x001a:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r6.f6382H
            if (r0 != 0) goto L_0x001f
            return r8
        L_0x001f:
            boolean r10 = r0.mo8929v()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r6.f6382H
            boolean r11 = r0.mo8931w()
            android.view.VelocityTracker r0 = r6.f6381G1
            if (r0 != 0) goto L_0x0033
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.f6381G1 = r0
        L_0x0033:
            int r0 = r18.getActionMasked()
            int r1 = r18.getActionIndex()
            if (r0 != 0) goto L_0x0043
            int[] r2 = r6.f6422h2
            r2[r9] = r8
            r2[r8] = r8
        L_0x0043:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r18)
            int[] r2 = r6.f6422h2
            r3 = r2[r8]
            float r3 = (float) r3
            r2 = r2[r9]
            float r2 = (float) r2
            r12.offsetLocation(r3, r2)
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x01aa
            if (r0 == r9) goto L_0x0168
            r3 = 2
            if (r0 == r3) goto L_0x008c
            r3 = 3
            if (r0 == r3) goto L_0x0087
            r3 = 5
            if (r0 == r3) goto L_0x006b
            r1 = 6
            if (r0 == r1) goto L_0x0066
            goto L_0x01cb
        L_0x0066:
            r17.mo8991O0(r18)
            goto L_0x01cb
        L_0x006b:
            int r0 = r7.getPointerId(r1)
            r6.f6380F1 = r0
            float r0 = r7.getX(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f6386J1 = r0
            r6.f6383H1 = r0
            float r0 = r7.getY(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f6387K1 = r0
            r6.f6385I1 = r0
            goto L_0x01cb
        L_0x0087:
            r17.mo9111r()
            goto L_0x01cb
        L_0x008c:
            int r0 = r6.f6380F1
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x00a9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error processing scroll; pointer index for id "
            r0.append(r1)
            int r1 = r6.f6380F1
            r0.append(r1)
            java.lang.String r1 = " not found. Did any MotionEvents get skipped?"
            r0.append(r1)
            return r8
        L_0x00a9:
            float r1 = r7.getX(r0)
            float r1 = r1 + r2
            int r13 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r2
            int r14 = (int) r0
            int r0 = r6.f6386J1
            int r0 = r0 - r13
            int r1 = r6.f6387K1
            int r1 = r1 - r14
            int r2 = r6.f6379E1
            if (r2 == r9) goto L_0x00f2
            if (r10 == 0) goto L_0x00d6
            if (r0 <= 0) goto L_0x00cb
            int r2 = r6.f6389L1
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto L_0x00d2
        L_0x00cb:
            int r2 = r6.f6389L1
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        L_0x00d2:
            if (r0 == 0) goto L_0x00d6
            r2 = r9
            goto L_0x00d7
        L_0x00d6:
            r2 = r8
        L_0x00d7:
            if (r11 == 0) goto L_0x00ed
            if (r1 <= 0) goto L_0x00e3
            int r3 = r6.f6389L1
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto L_0x00ea
        L_0x00e3:
            int r3 = r6.f6389L1
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        L_0x00ea:
            if (r1 == 0) goto L_0x00ed
            r2 = r9
        L_0x00ed:
            if (r2 == 0) goto L_0x00f2
            r6.setScrollState(r9)
        L_0x00f2:
            r15 = r0
            r16 = r1
            int r0 = r6.f6379E1
            if (r0 != r9) goto L_0x01cb
            int[] r3 = r6.f6423i2
            r3[r8] = r8
            r3[r9] = r8
            if (r10 == 0) goto L_0x0103
            r1 = r15
            goto L_0x0104
        L_0x0103:
            r1 = r8
        L_0x0104:
            if (r11 == 0) goto L_0x0109
            r2 = r16
            goto L_0x010a
        L_0x0109:
            r2 = r8
        L_0x010a:
            int[] r4 = r6.f6421g2
            r5 = 0
            r0 = r17
            boolean r0 = r0.mo8974G(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0137
            int[] r0 = r6.f6423i2
            r1 = r0[r8]
            int r15 = r15 - r1
            r0 = r0[r9]
            int r16 = r16 - r0
            int[] r0 = r6.f6422h2
            r1 = r0[r8]
            int[] r2 = r6.f6421g2
            r3 = r2[r8]
            int r1 = r1 + r3
            r0[r8] = r1
            r1 = r0[r9]
            r2 = r2[r9]
            int r1 = r1 + r2
            r0[r9] = r1
            android.view.ViewParent r0 = r17.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L_0x0137:
            r0 = r16
            int[] r1 = r6.f6421g2
            r2 = r1[r8]
            int r13 = r13 - r2
            r6.f6386J1 = r13
            r1 = r1[r9]
            int r14 = r14 - r1
            r6.f6387K1 = r14
            if (r10 == 0) goto L_0x0149
            r1 = r15
            goto L_0x014a
        L_0x0149:
            r1 = r8
        L_0x014a:
            if (r11 == 0) goto L_0x014e
            r2 = r0
            goto L_0x014f
        L_0x014e:
            r2 = r8
        L_0x014f:
            boolean r1 = r6.mo9086m1(r1, r2, r7, r8)
            if (r1 == 0) goto L_0x015c
            android.view.ViewParent r1 = r17.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L_0x015c:
            androidx.recyclerview.widget.j r1 = r6.f6400T1
            if (r1 == 0) goto L_0x01cb
            if (r15 != 0) goto L_0x0164
            if (r0 == 0) goto L_0x01cb
        L_0x0164:
            r1.mo9817f(r6, r15, r0)
            goto L_0x01cb
        L_0x0168:
            android.view.VelocityTracker r0 = r6.f6381G1
            r0.addMovement(r12)
            android.view.VelocityTracker r0 = r6.f6381G1
            r1 = 1000(0x3e8, float:1.401E-42)
            int r2 = r6.f6393O1
            float r2 = (float) r2
            r0.computeCurrentVelocity(r1, r2)
            r0 = 0
            if (r10 == 0) goto L_0x0184
            android.view.VelocityTracker r1 = r6.f6381G1
            int r2 = r6.f6380F1
            float r1 = r1.getXVelocity(r2)
            float r1 = -r1
            goto L_0x0185
        L_0x0184:
            r1 = r0
        L_0x0185:
            if (r11 == 0) goto L_0x0191
            android.view.VelocityTracker r2 = r6.f6381G1
            int r3 = r6.f6380F1
            float r2 = r2.getYVelocity(r3)
            float r2 = -r2
            goto L_0x0192
        L_0x0191:
            r2 = r0
        L_0x0192:
            int r3 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x019a
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01a2
        L_0x019a:
            int r0 = (int) r1
            int r1 = (int) r2
            boolean r0 = r6.mo9019c0(r0, r1)
            if (r0 != 0) goto L_0x01a5
        L_0x01a2:
            r6.setScrollState(r8)
        L_0x01a5:
            r17.mo9078j1()
            r8 = r9
            goto L_0x01cb
        L_0x01aa:
            int r0 = r7.getPointerId(r8)
            r6.f6380F1 = r0
            float r0 = r18.getX()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f6386J1 = r0
            r6.f6383H1 = r0
            float r0 = r18.getY()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f6387K1 = r0
            r6.f6385I1 = r0
            if (r11 == 0) goto L_0x01c8
            r10 = r10 | 2
        L_0x01c8:
            r6.mo9164y1(r10, r8)
        L_0x01cb:
            if (r8 != 0) goto L_0x01d2
            android.view.VelocityTracker r0 = r6.f6381G1
            r0.addMovement(r12)
        L_0x01d2:
            r12.recycle()
            return r9
        L_0x01d6:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public void mo9105p(String str) {
        if (mo9163y0()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + mo8994Q());
            }
            throw new IllegalStateException(str);
        } else if (this.f6445x1 > 0) {
            new IllegalStateException("" + mo8994Q());
        }
    }

    /* renamed from: p0 */
    public final void mo9106p0(long j, C1231a0 a0Var, C1231a0 a0Var2) {
        int g = this.f6425k.mo9715g();
        for (int i = 0; i < g; i++) {
            C1231a0 i0 = m8852i0(this.f6425k.mo9714f(i));
            if (i0 != a0Var && mo9039e0(i0) == j) {
                Adapter adapter = this.f6376C;
                if (adapter == null || !adapter.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + i0 + " \n View Holder 2:" + a0Var + mo8994Q());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + i0 + " \n View Holder 2:" + a0Var + mo8994Q());
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Problem while matching changed view holders with the newones. The pre-layout information for the change holder ");
        sb.append(a0Var2);
        sb.append(" cannot be found but it is necessary for ");
        sb.append(a0Var);
        sb.append(mo8994Q());
    }

    /* renamed from: p1 */
    public final void mo9107p1(Adapter adapter, boolean z, boolean z2) {
        Adapter adapter2 = this.f6376C;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(this.f6408a);
            this.f6376C.onDetachedFromRecyclerView(this);
        }
        if (!z || z2) {
            mo9012Z0();
        }
        this.f6420g.mo9680y();
        Adapter adapter3 = this.f6376C;
        this.f6376C = adapter;
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.f6408a);
            adapter.onAttachedToRecyclerView(this);
        }
        LayoutManager layoutManager = this.f6382H;
        if (layoutManager != null) {
            layoutManager.mo9220M0(adapter3, this.f6376C);
        }
        this.f6413d.mo9495x(adapter3, this.f6376C, z);
        this.f6403V1.f6518g = true;
    }

    /* renamed from: q */
    public boolean mo9108q(C1231a0 a0Var) {
        C1242l lVar = this.f6378D1;
        if (lVar == null || lVar.canReuseUpdatedViewHolder(a0Var, a0Var.getUnmodifiedPayloads())) {
            return true;
        }
        return false;
    }

    /* renamed from: q0 */
    public boolean mo9109q0() {
        if (!this.f6441v0 || this.f6440u1 || this.f6420g.mo9671p()) {
            return true;
        }
        return false;
    }

    /* renamed from: q1 */
    public boolean mo9110q1(C1231a0 a0Var, int i) {
        if (mo9163y0()) {
            a0Var.mPendingAccessibilityState = i;
            this.f6424j2.add(a0Var);
            return false;
        }
        ga7.m17714A0(a0Var.itemView, i);
        return true;
    }

    /* renamed from: r */
    public final void mo9111r() {
        mo9078j1();
        setScrollState(0);
    }

    /* renamed from: r0 */
    public final boolean mo9112r0() {
        int g = this.f6425k.mo9715g();
        for (int i = 0; i < g; i++) {
            C1231a0 i0 = m8852i0(this.f6425k.mo9714f(i));
            if (i0 != null && !i0.shouldIgnore() && i0.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: r1 */
    public boolean mo9113r1(AccessibilityEvent accessibilityEvent) {
        int i;
        int i2 = 0;
        if (!mo9163y0()) {
            return false;
        }
        if (accessibilityEvent != null) {
            i = C0012a8.m106a(accessibilityEvent);
        } else {
            i = 0;
        }
        if (i != 0) {
            i2 = i;
        }
        this.f6434q1 |= i2;
        return true;
    }

    public void removeDetachedView(View view, boolean z) {
        C1231a0 i0 = m8852i0(view);
        if (i0 != null) {
            if (i0.isTmpDetached()) {
                i0.clearTmpDetachFlag();
            } else if (!i0.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + i0 + mo8994Q());
            }
        }
        view.clearAnimation();
        mo8958A(view);
        super.removeDetachedView(view, z);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f6382H.mo9261j1(this, this.f6403V1, view, view2) && view2 != null) {
            mo9069h1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f6382H.mo9196A1(this, view, rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.f6394P.size();
        for (int i = 0; i < size; i++) {
            this.f6394P.get(i).mo9443e(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        if (this.f6410b1 != 0 || this.f6431o1) {
            this.f6417e1 = true;
        } else {
            super.requestLayout();
        }
    }

    /* renamed from: s0 */
    public void mo9119s0() {
        this.f6420g = new C1268a(new C1236f());
    }

    /* renamed from: s1 */
    public void mo9120s1(int i, int i2) {
        mo9149t1(i, i2, (Interpolator) null);
    }

    public void scrollBy(int i, int i2) {
        LayoutManager layoutManager = this.f6382H;
        if (layoutManager != null && !this.f6431o1) {
            boolean v = layoutManager.mo8929v();
            boolean w = this.f6382H.mo8931w();
            if (v || w) {
                if (!v) {
                    i = 0;
                }
                if (!w) {
                    i2 = 0;
                }
                mo9086m1(i, i2, (MotionEvent) null, 0);
            }
        }
    }

    public void scrollTo(int i, int i2) {
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!mo9113r1(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(C1339s sVar) {
        this.f6412c2 = sVar;
        ga7.m17785p0(this, sVar);
    }

    public void setAdapter(Adapter adapter) {
        setLayoutFrozen(false);
        mo9107p1(adapter, false, true);
        mo9003U0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(C1240j jVar) {
        boolean z;
        if (jVar != this.f6414d2) {
            this.f6414d2 = jVar;
            if (jVar != null) {
                z = true;
            } else {
                z = false;
            }
            setChildrenDrawingOrderEnabled(z);
        }
    }

    public void setClipToPadding(boolean z) {
        if (z != this.f6437s) {
            mo9157w0();
        }
        this.f6437s = z;
        super.setClipToPadding(z);
        if (this.f6441v0) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C1241k kVar) {
        gu4.m18428f(kVar);
        this.f6447y1 = kVar;
        mo9157w0();
    }

    public void setHasFixedSize(boolean z) {
        this.f6416e0 = z;
    }

    public void setItemAnimator(C1242l lVar) {
        C1242l lVar2 = this.f6378D1;
        if (lVar2 != null) {
            lVar2.endAnimations();
            this.f6378D1.setListener((C1242l.C1244b) null);
        }
        this.f6378D1 = lVar;
        if (lVar != null) {
            lVar.setListener(this.f6409a2);
        }
    }

    public void setItemViewCacheSize(int i) {
        this.f6413d.mo9465G(i);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(LayoutManager layoutManager) {
        if (layoutManager != this.f6382H) {
            mo8963B1();
            if (this.f6382H != null) {
                C1242l lVar = this.f6378D1;
                if (lVar != null) {
                    lVar.endAnimations();
                }
                this.f6382H.mo9284t1(this.f6413d);
                this.f6382H.mo9287u1(this.f6413d);
                this.f6413d.mo9474c();
                if (this.f6401U) {
                    this.f6382H.mo9217L(this, this.f6413d);
                }
                this.f6382H.mo9223N1((RecyclerView) null);
                this.f6382H = null;
            } else {
                this.f6413d.mo9474c();
            }
            this.f6425k.mo9723o();
            this.f6382H = layoutManager;
            if (layoutManager != null) {
                if (layoutManager.f6460d == null) {
                    layoutManager.mo9223N1(this);
                    if (this.f6401U) {
                        this.f6382H.mo9214K(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + layoutManager + " is already attached to a RecyclerView:" + layoutManager.f6460d.mo8994Q());
                }
            }
            this.f6413d.mo9469K();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().mo20380m(z);
    }

    public void setOnFlingListener(C1249p pVar) {
        this.f6391M1 = pVar;
    }

    @Deprecated
    public void setOnScrollListener(C1251r rVar) {
        this.f6404W1 = rVar;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f6398R1 = z;
    }

    public void setRecycledViewPool(C1252s sVar) {
        this.f6413d.mo9463E(sVar);
    }

    @Deprecated
    public void setRecyclerListener(C1255u uVar) {
        this.f6384I = uVar;
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i) {
        if (i != this.f6379E1) {
            this.f6379E1 = i;
            if (i != 2) {
                mo8966C1();
            }
            mo8978I(i);
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("setScrollingTouchSlop(): bad argument constant ");
                sb.append(i);
                sb.append("; using default value");
            } else {
                this.f6389L1 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.f6389L1 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(C1261y yVar) {
        this.f6413d.mo9464F(yVar);
    }

    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().mo20382o(i);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().mo20384q();
    }

    public final void suppressLayout(boolean z) {
        if (z != this.f6431o1) {
            mo9105p("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.f6431o1 = false;
                if (!(!this.f6417e1 || this.f6382H == null || this.f6376C == null)) {
                    requestLayout();
                }
                this.f6417e1 = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 0));
            this.f6431o1 = true;
            this.f6433p1 = true;
            mo8963B1();
        }
    }

    /* renamed from: t */
    public void mo9147t() {
        int j = this.f6425k.mo9718j();
        for (int i = 0; i < j; i++) {
            C1231a0 i0 = m8852i0(this.f6425k.mo9717i(i));
            if (!i0.shouldIgnore()) {
                i0.clearOldPosition();
            }
        }
        this.f6413d.mo9475d();
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: t0 */
    public final void mo9148t0() {
        if (ga7.m17713A(this) == 0) {
            ga7.m17716B0(this, 8);
        }
    }

    /* renamed from: t1 */
    public void mo9149t1(int i, int i2, Interpolator interpolator) {
        mo9152u1(i, i2, interpolator, Integer.MIN_VALUE);
    }

    /* renamed from: u */
    public void mo9150u(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.f6448z1;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.f6448z1.onRelease();
            z = this.f6448z1.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f6375B1;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f6375B1.onRelease();
            z |= this.f6375B1.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f6373A1;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f6373A1.onRelease();
            z |= this.f6373A1.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f6377C1;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f6377C1.onRelease();
            z |= this.f6377C1.isFinished();
        }
        if (z) {
            ga7.m17767g0(this);
        }
    }

    /* renamed from: u0 */
    public final void mo9151u0() {
        this.f6425k = new C1280e(new C1235e());
    }

    /* renamed from: u1 */
    public void mo9152u1(int i, int i2, Interpolator interpolator, int i3) {
        mo9155v1(i, i2, interpolator, i3, false);
    }

    /* renamed from: v */
    public void mo9153v() {
        if (!this.f6441v0 || this.f6440u1) {
            os6.m24033a("RV FullInvalidate");
            mo8964C();
            os6.m24034b();
        } else if (this.f6420g.mo9671p()) {
            if (this.f6420g.mo9670o(4) && !this.f6420g.mo9670o(11)) {
                os6.m24033a("RV PartialInvalidate");
                mo9161x1();
                mo8985L0();
                this.f6420g.mo9678w();
                if (!this.f6417e1) {
                    if (mo9112r0()) {
                        mo8964C();
                    } else {
                        this.f6420g.mo9664i();
                    }
                }
                mo9167z1(true);
                mo8987M0();
                os6.m24034b();
            } else if (this.f6420g.mo9671p()) {
                os6.m24033a("RV FullInvalidate");
                mo8964C();
                os6.m24034b();
            }
        }
    }

    /* renamed from: v0 */
    public void mo9154v0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + mo8994Q());
        }
        Resources resources = getContext().getResources();
        new C1305i(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(i25.fastscroll_default_thickness), resources.getDimensionPixelSize(i25.fastscroll_minimum_range), resources.getDimensionPixelOffset(i25.fastscroll_margin));
    }

    /* renamed from: v1 */
    public void mo9155v1(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        boolean z2;
        LayoutManager layoutManager = this.f6382H;
        if (layoutManager != null && !this.f6431o1) {
            int i4 = 0;
            if (!layoutManager.mo8929v()) {
                i = 0;
            }
            if (!this.f6382H.mo8931w()) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                if (i3 == Integer.MIN_VALUE || i3 > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (z) {
                        if (i != 0) {
                            i4 = 1;
                        }
                        if (i2 != 0) {
                            i4 |= 2;
                        }
                        mo9164y1(i4, 1);
                    }
                    this.f6399S1.mo9536e(i, i2, i3, interpolator);
                    return;
                }
                scrollBy(i, i2);
            }
        }
    }

    /* renamed from: w */
    public final void mo9156w(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        ClassLoader classLoader;
        Constructor<? extends U> constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String m0 = mo9085m0(context, trim);
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(m0, false, classLoader).asSubclass(LayoutManager.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(f6370w2);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                    } catch (NoSuchMethodException e) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((LayoutManager) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e2) {
                    e2.initCause(e);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + m0, e2);
                } catch (ClassNotFoundException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + m0, e3);
                } catch (InvocationTargetException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + m0, e4);
                } catch (InstantiationException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + m0, e5);
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + m0, e6);
                } catch (ClassCastException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + m0, e7);
                }
            }
        }
    }

    /* renamed from: w0 */
    public void mo9157w0() {
        this.f6377C1 = null;
        this.f6373A1 = null;
        this.f6375B1 = null;
        this.f6448z1 = null;
    }

    /* renamed from: w1 */
    public void mo9158w1(int i) {
        LayoutManager layoutManager;
        if (!this.f6431o1 && (layoutManager = this.f6382H) != null) {
            layoutManager.mo8895R1(this, this.f6403V1, i);
        }
    }

    /* renamed from: x */
    public void mo9159x(int i, int i2) {
        setMeasuredDimension(LayoutManager.m8983y(i, getPaddingLeft() + getPaddingRight(), ga7.m17719D(this)), LayoutManager.m8983y(i2, getPaddingTop() + getPaddingBottom(), ga7.m17717C(this)));
    }

    /* renamed from: x0 */
    public boolean mo9160x0() {
        AccessibilityManager accessibilityManager = this.f6438s1;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return false;
        }
        return true;
    }

    /* renamed from: x1 */
    public void mo9161x1() {
        int i = this.f6410b1 + 1;
        this.f6410b1 = i;
        if (i == 1 && !this.f6431o1) {
            this.f6417e1 = false;
        }
    }

    /* renamed from: y */
    public final boolean mo9162y(int i, int i2) {
        mo9006W(this.f6418e2);
        int[] iArr = this.f6418e2;
        if (iArr[0] == i && iArr[1] == i2) {
            return false;
        }
        return true;
    }

    /* renamed from: y0 */
    public boolean mo9163y0() {
        if (this.f6443w1 > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: y1 */
    public boolean mo9164y1(int i, int i2) {
        return getScrollingChildHelper().mo20383p(i, i2);
    }

    /* renamed from: z */
    public void mo9165z(View view) {
        C1231a0 i0 = m8852i0(view);
        mo8981J0(view);
        Adapter adapter = this.f6376C;
        if (!(adapter == null || i0 == null)) {
            adapter.onViewAttachedToWindow(i0);
        }
        List<C1248o> list = this.f6439t1;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f6439t1.get(size).mo9439d(view);
            }
        }
    }

    /* renamed from: z0 */
    public final boolean mo9166z0(View view, View view2, int i) {
        int i2;
        int i3;
        if (view2 == null || view2 == this || view2 == view || mo9000T(view2) == null) {
            return false;
        }
        if (view == null || mo9000T(view) == null) {
            return true;
        }
        this.f6446y.set(0, 0, view.getWidth(), view.getHeight());
        this.f6372A.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f6446y);
        offsetDescendantRectToMyCoords(view2, this.f6372A);
        char c = 65535;
        if (this.f6382H.mo9262k0() == 1) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        Rect rect = this.f6446y;
        int i4 = rect.left;
        Rect rect2 = this.f6372A;
        int i5 = rect2.left;
        if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
            i3 = 1;
        } else {
            int i6 = rect.right;
            int i7 = rect2.right;
            if ((i6 > i7 || i4 >= i7) && i4 > i5) {
                i3 = -1;
            } else {
                i3 = 0;
            }
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
            c = 1;
        } else {
            int i10 = rect.bottom;
            int i11 = rect2.bottom;
            if ((i10 <= i11 && i8 < i11) || i8 <= i9) {
                c = 0;
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i != 130) {
                                throw new IllegalArgumentException("Invalid direction: " + i + mo8994Q());
                            } else if (c > 0) {
                                return true;
                            } else {
                                return false;
                            }
                        } else if (i3 > 0) {
                            return true;
                        } else {
                            return false;
                        }
                    } else if (c < 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (i3 < 0) {
                    return true;
                } else {
                    return false;
                }
            } else if (c > 0 || (c == 0 && i3 * i2 > 0)) {
                return true;
            } else {
                return false;
            }
        } else if (c < 0 || (c == 0 && i3 * i2 < 0)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: z1 */
    public void mo9167z1(boolean z) {
        if (this.f6410b1 < 1) {
            this.f6410b1 = 1;
        }
        if (!z && !this.f6431o1) {
            this.f6417e1 = false;
        }
        if (this.f6410b1 == 1) {
            if (z && this.f6417e1 && !this.f6431o1 && this.f6382H != null && this.f6376C != null) {
                mo8964C();
            }
            if (!this.f6431o1) {
                this.f6417e1 = false;
            }
        }
        this.f6410b1--;
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i15.recyclerViewStyle);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1229a();

        /* renamed from: e */
        public Parcelable f6478e;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$SavedState$a */
        public class C1229a implements Parcelable.ClassLoaderCreator<SavedState> {
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
            this.f6478e = parcel.readParcelable(classLoader == null ? LayoutManager.class.getClassLoader() : classLoader);
        }

        /* renamed from: b */
        public void mo9307b(SavedState savedState) {
            this.f6478e = savedState.f6478e;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f6478e, 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        this.f6408a = new C1256v();
        this.f6413d = new C1254t();
        this.f6435r = new C1349x();
        this.f6444x = new C1230a();
        this.f6446y = new Rect();
        this.f6372A = new Rect();
        this.f6374B = new RectF();
        this.f6388L = new ArrayList();
        this.f6390M = new ArrayList<>();
        this.f6394P = new ArrayList<>();
        this.f6410b1 = 0;
        this.f6440u1 = false;
        this.f6442v1 = false;
        this.f6443w1 = 0;
        this.f6445x1 = 0;
        this.f6447y1 = new C1241k();
        this.f6378D1 = new C1283f();
        this.f6379E1 = 0;
        this.f6380F1 = -1;
        this.f6395P1 = Float.MIN_VALUE;
        this.f6397Q1 = Float.MIN_VALUE;
        this.f6398R1 = true;
        this.f6399S1 = new C1262z();
        this.f6402U1 = f6367t2 ? new C1310j.C1312b() : null;
        this.f6403V1 = new C1260x();
        this.f6406Y1 = false;
        this.f6407Z1 = false;
        this.f6409a2 = new C1246m();
        this.f6411b2 = false;
        this.f6418e2 = new int[2];
        this.f6421g2 = new int[2];
        this.f6422h2 = new int[2];
        this.f6423i2 = new int[2];
        this.f6424j2 = new ArrayList();
        this.f6427k2 = new C1232b();
        this.f6429m2 = 0;
        this.f6430n2 = 0;
        this.f6432o2 = new C1234d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f6389L1 = viewConfiguration.getScaledTouchSlop();
        this.f6395P1 = wb7.m29439b(viewConfiguration, context2);
        this.f6397Q1 = wb7.m29441d(viewConfiguration, context2);
        this.f6392N1 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f6393O1 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f6378D1.setListener(this.f6409a2);
        mo9119s0();
        mo9151u0();
        mo9148t0();
        if (ga7.m17804z(this) == 0) {
            ga7.m17714A0(this, 1);
        }
        this.f6438s1 = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C1339s(this));
        int[] iArr = k55.RecyclerView;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, iArr, i2, 0);
        ga7.m17781n0(this, context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        String string = obtainStyledAttributes.getString(k55.RecyclerView_layoutManager);
        if (obtainStyledAttributes.getInt(k55.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f6437s = obtainStyledAttributes.getBoolean(k55.RecyclerView_android_clipToPadding, true);
        boolean z = obtainStyledAttributes.getBoolean(k55.RecyclerView_fastScrollEnabled, false);
        this.f6426k0 = z;
        if (z) {
            mo9154v0((StateListDrawable) obtainStyledAttributes.getDrawable(k55.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes.getDrawable(k55.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes.getDrawable(k55.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes.getDrawable(k55.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        obtainStyledAttributes.recycle();
        mo9156w(context, string, attributeSet, i, 0);
        int[] iArr2 = f6363p2;
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, iArr2, i2, 0);
        ga7.m17781n0(this, context, iArr2, attributeSet, obtainStyledAttributes2, i, 0);
        boolean z2 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public C1231a0 f6474a;

        /* renamed from: d */
        public final Rect f6475d = new Rect();

        /* renamed from: e */
        public boolean f6476e = true;

        /* renamed from: g */
        public boolean f6477g = false;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        public int mo9303a() {
            return this.f6474a.getLayoutPosition();
        }

        /* renamed from: b */
        public boolean mo9304b() {
            return this.f6474a.isUpdated();
        }

        /* renamed from: c */
        public boolean mo9305c() {
            return this.f6474a.isRemoved();
        }

        /* renamed from: d */
        public boolean mo9306d() {
            return this.f6474a.isInvalid();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayoutManager layoutManager = this.f6382H;
        if (layoutManager != null) {
            return layoutManager.mo8829Q(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo8994Q());
    }
}
