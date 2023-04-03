package p000;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.creageek.segmentedbutton.SegmentedButton;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.radiobutton.MaterialRadioButton;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.views.TouchControlLineChart;

/* renamed from: ka2 */
/* compiled from: FragmentReflectionsAdvanceBinding */
public final class ka2 {

    /* renamed from: a */
    public final ConstraintLayout f30758a;

    /* renamed from: b */
    public final AppBarLayout f30759b;

    /* renamed from: c */
    public final CollapsingToolbarLayout f30760c;

    /* renamed from: d */
    public final CoordinatorLayout f30761d;

    /* renamed from: e */
    public final qm2 f30762e;

    /* renamed from: f */
    public final TouchControlLineChart f30763f;

    /* renamed from: g */
    public final RecyclerView f30764g;

    /* renamed from: h */
    public final SegmentedButton f30765h;

    /* renamed from: i */
    public final SegmentedButton f30766i;

    /* renamed from: j */
    public final MaterialRadioButton f30767j;

    /* renamed from: k */
    public final MaterialRadioButton f30768k;

    /* renamed from: l */
    public final MaterialRadioButton f30769l;

    /* renamed from: m */
    public final MaterialRadioButton f30770m;

    /* renamed from: n */
    public final tr6 f30771n;

    /* renamed from: o */
    public final pm2 f30772o;

    /* renamed from: p */
    public final MaterialRadioButton f30773p;

    /* renamed from: q */
    public final MaterialRadioButton f30774q;

    /* renamed from: r */
    public final MaterialRadioButton f30775r;

    /* renamed from: s */
    public final AppCompatTextView f30776s;

    public ka2(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, CollapsingToolbarLayout collapsingToolbarLayout, CoordinatorLayout coordinatorLayout, qm2 qm2, TouchControlLineChart touchControlLineChart, RecyclerView recyclerView, SegmentedButton segmentedButton, SegmentedButton segmentedButton2, MaterialRadioButton materialRadioButton, MaterialRadioButton materialRadioButton2, MaterialRadioButton materialRadioButton3, MaterialRadioButton materialRadioButton4, tr6 tr6, pm2 pm2, MaterialRadioButton materialRadioButton5, MaterialRadioButton materialRadioButton6, MaterialRadioButton materialRadioButton7, AppCompatTextView appCompatTextView) {
        this.f30758a = constraintLayout;
        this.f30759b = appBarLayout;
        this.f30760c = collapsingToolbarLayout;
        this.f30761d = coordinatorLayout;
        this.f30762e = qm2;
        this.f30763f = touchControlLineChart;
        this.f30764g = recyclerView;
        this.f30765h = segmentedButton;
        this.f30766i = segmentedButton2;
        this.f30767j = materialRadioButton;
        this.f30768k = materialRadioButton2;
        this.f30769l = materialRadioButton3;
        this.f30770m = materialRadioButton4;
        this.f30771n = tr6;
        this.f30772o = pm2;
        this.f30773p = materialRadioButton5;
        this.f30774q = materialRadioButton6;
        this.f30775r = materialRadioButton7;
        this.f30776s = appCompatTextView;
    }

    /* renamed from: a */
    public static ka2 m46940a(View view) {
        View view2 = view;
        int i = R.id.appBar;
        AppBarLayout appBarLayout = (AppBarLayout) ca7.m11819a(view2, R.id.appBar);
        if (appBarLayout != null) {
            i = R.id.ccToolBar;
            CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) ca7.m11819a(view2, R.id.ccToolBar);
            if (collapsingToolbarLayout != null) {
                i = R.id.coordinator;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ca7.m11819a(view2, R.id.coordinator);
                if (coordinatorLayout != null) {
                    i = R.id.lSelectToken;
                    View a = ca7.m11819a(view2, R.id.lSelectToken);
                    if (a != null) {
                        qm2 a2 = qm2.m50637a(a);
                        i = R.id.lineStickChart;
                        TouchControlLineChart touchControlLineChart = (TouchControlLineChart) ca7.m11819a(view2, R.id.lineStickChart);
                        if (touchControlLineChart != null) {
                            i = R.id.rvReflectionList;
                            RecyclerView recyclerView = (RecyclerView) ca7.m11819a(view2, R.id.rvReflectionList);
                            if (recyclerView != null) {
                                i = R.id.sbTokenMode;
                                SegmentedButton segmentedButton = (SegmentedButton) ca7.m11819a(view2, R.id.sbTokenMode);
                                if (segmentedButton != null) {
                                    i = R.id.sbTokenSpan;
                                    SegmentedButton segmentedButton2 = (SegmentedButton) ca7.m11819a(view2, R.id.sbTokenSpan);
                                    if (segmentedButton2 != null) {
                                        i = R.id.tm_daily;
                                        MaterialRadioButton materialRadioButton = (MaterialRadioButton) ca7.m11819a(view2, R.id.tm_daily);
                                        if (materialRadioButton != null) {
                                            i = R.id.tm_monthly;
                                            MaterialRadioButton materialRadioButton2 = (MaterialRadioButton) ca7.m11819a(view2, R.id.tm_monthly);
                                            if (materialRadioButton2 != null) {
                                                i = R.id.tm_weekly;
                                                MaterialRadioButton materialRadioButton3 = (MaterialRadioButton) ca7.m11819a(view2, R.id.tm_weekly);
                                                if (materialRadioButton3 != null) {
                                                    i = R.id.tm_yearly;
                                                    MaterialRadioButton materialRadioButton4 = (MaterialRadioButton) ca7.m11819a(view2, R.id.tm_yearly);
                                                    if (materialRadioButton4 != null) {
                                                        i = R.id.toolbar;
                                                        View a3 = ca7.m11819a(view2, R.id.toolbar);
                                                        if (a3 != null) {
                                                            tr6 a4 = tr6.m52423a(a3);
                                                            i = R.id.totalField;
                                                            View a5 = ca7.m11819a(view2, R.id.totalField);
                                                            if (a5 != null) {
                                                                pm2 a6 = pm2.m49996a(a5);
                                                                i = R.id.ts_max;
                                                                MaterialRadioButton materialRadioButton5 = (MaterialRadioButton) ca7.m11819a(view2, R.id.ts_max);
                                                                if (materialRadioButton5 != null) {
                                                                    i = R.id.ts_med;
                                                                    MaterialRadioButton materialRadioButton6 = (MaterialRadioButton) ca7.m11819a(view2, R.id.ts_med);
                                                                    if (materialRadioButton6 != null) {
                                                                        i = R.id.ts_min;
                                                                        MaterialRadioButton materialRadioButton7 = (MaterialRadioButton) ca7.m11819a(view2, R.id.ts_min);
                                                                        if (materialRadioButton7 != null) {
                                                                            i = R.id.txtLoading;
                                                                            AppCompatTextView appCompatTextView = (AppCompatTextView) ca7.m11819a(view2, R.id.txtLoading);
                                                                            if (appCompatTextView != null) {
                                                                                return new ka2((ConstraintLayout) view2, appBarLayout, collapsingToolbarLayout, coordinatorLayout, a2, touchControlLineChart, recyclerView, segmentedButton, segmentedButton2, materialRadioButton, materialRadioButton2, materialRadioButton3, materialRadioButton4, a4, a6, materialRadioButton5, materialRadioButton6, materialRadioButton7, appCompatTextView);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
