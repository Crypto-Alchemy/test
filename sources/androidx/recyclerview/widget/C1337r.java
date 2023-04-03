package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: androidx.recyclerview.widget.r */
/* compiled from: PagerSnapHelper */
public class C1337r extends C1343v {

    /* renamed from: d */
    public C1334q f6830d;

    /* renamed from: e */
    public C1334q f6831e;

    /* renamed from: androidx.recyclerview.widget.r$a */
    /* compiled from: PagerSnapHelper */
    public class C1338a extends C1328m {
        public C1338a(Context context) {
            super(context);
        }

        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }

        public int calculateTimeForScrolling(int i) {
            return Math.min(100, super.calculateTimeForScrolling(i));
        }

        public void onTargetFound(View view, RecyclerView.C1260x xVar, RecyclerView.C1257w.C1258a aVar) {
            C1337r rVar = C1337r.this;
            int[] c = rVar.mo9911c(rVar.f6837a.getLayoutManager(), view);
            int i = c[0];
            int i2 = c[1];
            int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
            if (calculateTimeForDeceleration > 0) {
                aVar.mo9522d(i, i2, calculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    /* renamed from: c */
    public int[] mo9911c(RecyclerView.LayoutManager layoutManager, View view) {
        int[] iArr = new int[2];
        if (layoutManager.mo8929v()) {
            iArr[0] = mo9948m(view, mo9950o(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.mo8931w()) {
            iArr[1] = mo9948m(view, mo9952q(layoutManager));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* renamed from: e */
    public RecyclerView.C1257w mo9947e(RecyclerView.LayoutManager layoutManager) {
        if (!(layoutManager instanceof RecyclerView.C1257w.C1259b)) {
            return null;
        }
        return new C1338a(this.f6837a.getContext());
    }

    /* renamed from: h */
    public View mo9912h(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.mo8931w()) {
            return mo9949n(layoutManager, mo9952q(layoutManager));
        }
        if (layoutManager.mo8929v()) {
            return mo9949n(layoutManager, mo9950o(layoutManager));
        }
        return null;
    }

    /* renamed from: i */
    public int mo9913i(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        C1334q p;
        int i3;
        int j0 = layoutManager.mo9260j0();
        if (j0 == 0 || (p = mo9951p(layoutManager)) == null) {
            return -1;
        }
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MAX_VALUE;
        int U = layoutManager.mo9234U();
        View view = null;
        View view2 = null;
        for (int i6 = 0; i6 < U; i6++) {
            View T = layoutManager.mo9231T(i6);
            if (T != null) {
                int m = mo9948m(T, p);
                if (m <= 0 && m > i4) {
                    view2 = T;
                    i4 = m;
                }
                if (m >= 0 && m < i5) {
                    view = T;
                    i5 = m;
                }
            }
        }
        boolean r = mo9953r(layoutManager, i, i2);
        if (r && view != null) {
            return layoutManager.mo9271o0(view);
        }
        if (!r && view2 != null) {
            return layoutManager.mo9271o0(view2);
        }
        if (r) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int o0 = layoutManager.mo9271o0(view);
        if (mo9954s(layoutManager) == r) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        int i7 = o0 + i3;
        if (i7 < 0 || i7 >= j0) {
            return -1;
        }
        return i7;
    }

    /* renamed from: m */
    public final int mo9948m(View view, C1334q qVar) {
        return (qVar.mo9934g(view) + (qVar.mo9932e(view) / 2)) - (qVar.mo9940m() + (qVar.mo9941n() / 2));
    }

    /* renamed from: n */
    public final View mo9949n(RecyclerView.LayoutManager layoutManager, C1334q qVar) {
        int U = layoutManager.mo9234U();
        View view = null;
        if (U == 0) {
            return null;
        }
        int m = qVar.mo9940m() + (qVar.mo9941n() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < U; i2++) {
            View T = layoutManager.mo9231T(i2);
            int abs = Math.abs((qVar.mo9934g(T) + (qVar.mo9932e(T) / 2)) - m);
            if (abs < i) {
                view = T;
                i = abs;
            }
        }
        return view;
    }

    /* renamed from: o */
    public final C1334q mo9950o(RecyclerView.LayoutManager layoutManager) {
        C1334q qVar = this.f6831e;
        if (qVar == null || qVar.f6827a != layoutManager) {
            this.f6831e = C1334q.m9642a(layoutManager);
        }
        return this.f6831e;
    }

    /* renamed from: p */
    public final C1334q mo9951p(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.mo8931w()) {
            return mo9952q(layoutManager);
        }
        if (layoutManager.mo8929v()) {
            return mo9950o(layoutManager);
        }
        return null;
    }

    /* renamed from: q */
    public final C1334q mo9952q(RecyclerView.LayoutManager layoutManager) {
        C1334q qVar = this.f6830d;
        if (qVar == null || qVar.f6827a != layoutManager) {
            this.f6830d = C1334q.m9644c(layoutManager);
        }
        return this.f6830d;
    }

    /* renamed from: r */
    public final boolean mo9953r(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        if (layoutManager.mo8929v()) {
            if (i > 0) {
                return true;
            }
            return false;
        } else if (i2 > 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: s */
    public final boolean mo9954s(RecyclerView.LayoutManager layoutManager) {
        PointF a;
        int j0 = layoutManager.mo9260j0();
        if (!(layoutManager instanceof RecyclerView.C1257w.C1259b) || (a = ((RecyclerView.C1257w.C1259b) layoutManager).mo8904a(j0 - 1)) == null) {
            return false;
        }
        if (a.x < Utils.FLOAT_EPSILON || a.y < Utils.FLOAT_EPSILON) {
            return true;
        }
        return false;
    }
}
