package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.v */
/* compiled from: SnapHelper */
public abstract class C1343v extends RecyclerView.C1249p {

    /* renamed from: a */
    public RecyclerView f6837a;

    /* renamed from: b */
    public Scroller f6838b;

    /* renamed from: c */
    public final RecyclerView.C1251r f6839c = new C1344a();

    /* renamed from: androidx.recyclerview.widget.v$a */
    /* compiled from: SnapHelper */
    public class C1344a extends RecyclerView.C1251r {

        /* renamed from: a */
        public boolean f6840a = false;

        public C1344a() {
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && this.f6840a) {
                this.f6840a = false;
                C1343v.this.mo9986l();
            }
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.f6840a = true;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.v$b */
    /* compiled from: SnapHelper */
    public class C1345b extends C1328m {
        public C1345b(Context context) {
            super(context);
        }

        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }

        public void onTargetFound(View view, RecyclerView.C1260x xVar, RecyclerView.C1257w.C1258a aVar) {
            C1343v vVar = C1343v.this;
            RecyclerView recyclerView = vVar.f6837a;
            if (recyclerView != null) {
                int[] c = vVar.mo9911c(recyclerView.getLayoutManager(), view);
                int i = c[0];
                int i2 = c[1];
                int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
                if (calculateTimeForDeceleration > 0) {
                    aVar.mo9522d(i, i2, calculateTimeForDeceleration, this.mDecelerateInterpolator);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo9440a(int i, int i2) {
        RecyclerView.LayoutManager layoutManager = this.f6837a.getLayoutManager();
        if (layoutManager == null || this.f6837a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f6837a.getMinFlingVelocity();
        if ((Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && mo9985k(layoutManager, i, i2)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo9980b(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.f6837a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                mo9983g();
            }
            this.f6837a = recyclerView;
            if (recyclerView != null) {
                mo9984j();
                this.f6838b = new Scroller(this.f6837a.getContext(), new DecelerateInterpolator());
                mo9986l();
            }
        }
    }

    /* renamed from: c */
    public abstract int[] mo9911c(RecyclerView.LayoutManager layoutManager, View view);

    /* renamed from: d */
    public int[] mo9981d(int i, int i2) {
        this.f6838b.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.f6838b.getFinalX(), this.f6838b.getFinalY()};
    }

    /* renamed from: e */
    public RecyclerView.C1257w mo9947e(RecyclerView.LayoutManager layoutManager) {
        return mo9982f(layoutManager);
    }

    @Deprecated
    /* renamed from: f */
    public C1328m mo9982f(RecyclerView.LayoutManager layoutManager) {
        if (!(layoutManager instanceof RecyclerView.C1257w.C1259b)) {
            return null;
        }
        return new C1345b(this.f6837a.getContext());
    }

    /* renamed from: g */
    public final void mo9983g() {
        this.f6837a.mo9042f1(this.f6839c);
        this.f6837a.setOnFlingListener((RecyclerView.C1249p) null);
    }

    /* renamed from: h */
    public abstract View mo9912h(RecyclerView.LayoutManager layoutManager);

    /* renamed from: i */
    public abstract int mo9913i(RecyclerView.LayoutManager layoutManager, int i, int i2);

    /* renamed from: j */
    public final void mo9984j() throws IllegalStateException {
        if (this.f6837a.getOnFlingListener() == null) {
            this.f6837a.mo9081l(this.f6839c);
            this.f6837a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    /* renamed from: k */
    public final boolean mo9985k(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        RecyclerView.C1257w e;
        int i3;
        if (!(layoutManager instanceof RecyclerView.C1257w.C1259b) || (e = mo9947e(layoutManager)) == null || (i3 = mo9913i(layoutManager, i, i2)) == -1) {
            return false;
        }
        e.setTargetPosition(i3);
        layoutManager.mo9230S1(e);
        return true;
    }

    /* renamed from: l */
    public void mo9986l() {
        RecyclerView.LayoutManager layoutManager;
        View h;
        RecyclerView recyclerView = this.f6837a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (h = mo9912h(layoutManager)) != null) {
            int[] c = mo9911c(layoutManager, h);
            int i = c[0];
            if (i != 0 || c[1] != 0) {
                this.f6837a.mo9120s1(i, c[1]);
            }
        }
    }
}
