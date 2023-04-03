package p000;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.C1328m;
import androidx.recyclerview.widget.C1329n;
import androidx.recyclerview.widget.C1334q;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: wb0 */
/* compiled from: CarouselSnapHelper */
public class wb0 extends C1329n {

    /* renamed from: f */
    public Context f35275f;

    /* renamed from: g */
    public int f35276g = 1000;

    /* renamed from: h */
    public float f35277h = 100.0f;

    /* renamed from: i */
    public C1334q f35278i = null;

    /* renamed from: j */
    public Scroller f35279j = null;

    /* renamed from: k */
    public int f35280k = 0;

    /* renamed from: wb0$a */
    /* compiled from: CarouselSnapHelper */
    public class C6652a extends C1328m {

        /* renamed from: a */
        public final /* synthetic */ RecyclerView.LayoutManager f35281a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6652a(Context context, RecyclerView.LayoutManager layoutManager) {
            super(context);
            this.f35281a = layoutManager;
        }

        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return wb0.this.f35277h / ((float) displayMetrics.densityDpi);
        }

        public void onTargetFound(View view, RecyclerView.C1260x xVar, RecyclerView.C1257w.C1258a aVar) {
            int[] c = wb0.this.mo9911c(this.f35281a, view);
            int i = c[0];
            aVar.mo9522d(i, c[1], Math.max(1, Math.min(wb0.this.f35276g, calculateTimeForDeceleration(Math.abs(i)))), this.mDecelerateInterpolator);
        }
    }

    /* renamed from: b */
    public void mo9980b(RecyclerView recyclerView) throws IllegalStateException {
        if (recyclerView != null) {
            this.f35275f = recyclerView.getContext();
            this.f35279j = new Scroller(this.f35275f, new DecelerateInterpolator());
        } else {
            this.f35279j = null;
            this.f35275f = null;
        }
        super.mo9980b(recyclerView);
    }

    /* renamed from: c */
    public int[] mo9911c(RecyclerView.LayoutManager layoutManager, View view) {
        int[] iArr = new int[2];
        iArr[0] = mo49137u(view, mo49139w(layoutManager));
        return iArr;
    }

    /* renamed from: d */
    public int[] mo9981d(int i, int i2) {
        int[] iArr = new int[2];
        C1334q qVar = this.f35278i;
        if (qVar == null) {
            return iArr;
        }
        if (this.f35280k == 0) {
            this.f35280k = (qVar.mo9936i() - qVar.mo9940m()) / 2;
        }
        Scroller scroller = this.f35279j;
        int i3 = this.f35280k;
        scroller.fling(0, 0, i, i2, -i3, i3, 0, 0);
        iArr[0] = this.f35279j.getFinalX();
        iArr[1] = this.f35279j.getFinalY();
        return iArr;
    }

    /* renamed from: e */
    public RecyclerView.C1257w mo9947e(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof RecyclerView.C1257w.C1259b) {
            return super.mo9947e(layoutManager);
        }
        Context context = this.f35275f;
        if (context == null) {
            return null;
        }
        return new C6652a(context, layoutManager);
    }

    /* renamed from: h */
    public View mo9912h(RecyclerView.LayoutManager layoutManager) {
        return mo49138v(layoutManager, mo49139w(layoutManager));
    }

    /* renamed from: u */
    public final int mo49137u(View view, C1334q qVar) {
        return qVar.mo9934g(view) - qVar.mo9940m();
    }

    /* renamed from: v */
    public final View mo49138v(RecyclerView.LayoutManager layoutManager, C1334q qVar) {
        int U;
        View view = null;
        if (layoutManager == null || (U = layoutManager.mo9234U()) == 0) {
            return null;
        }
        int i = Integer.MAX_VALUE;
        int m = qVar.mo9940m();
        for (int i2 = 0; i2 < U; i2++) {
            View T = layoutManager.mo9231T(i2);
            int abs = Math.abs(qVar.mo9934g(T) - m);
            if (abs < i) {
                view = T;
                i = abs;
            }
        }
        return view;
    }

    /* renamed from: w */
    public final C1334q mo49139w(RecyclerView.LayoutManager layoutManager) {
        if (this.f35278i == null) {
            this.f35278i = C1334q.m9642a(layoutManager);
        }
        return this.f35278i;
    }
}
