package p000;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.textview.MaterialTextView;
import net.safemoon.androidwallet.R;

/* renamed from: la2 */
/* compiled from: FragmentReflectionsBinding */
public final class la2 {

    /* renamed from: a */
    public final FrameLayout f31260a;

    /* renamed from: b */
    public final AppBarLayout f31261b;

    /* renamed from: c */
    public final CollapsingToolbarLayout f31262c;

    /* renamed from: d */
    public final FrameLayout f31263d;

    /* renamed from: e */
    public final CoordinatorLayout f31264e;

    /* renamed from: f */
    public final AppCompatImageView f31265f;

    /* renamed from: g */
    public final cf3 f31266g;

    /* renamed from: h */
    public final RecyclerView f31267h;

    /* renamed from: i */
    public final C5872go f31268i;

    /* renamed from: j */
    public final TextView f31269j;

    /* renamed from: k */
    public final MaterialTextView f31270k;

    public la2(FrameLayout frameLayout, AppBarLayout appBarLayout, CollapsingToolbarLayout collapsingToolbarLayout, FrameLayout frameLayout2, CoordinatorLayout coordinatorLayout, AppCompatImageView appCompatImageView, cf3 cf3, RecyclerView recyclerView, C5872go goVar, TextView textView, MaterialTextView materialTextView) {
        this.f31260a = frameLayout;
        this.f31261b = appBarLayout;
        this.f31262c = collapsingToolbarLayout;
        this.f31263d = frameLayout2;
        this.f31264e = coordinatorLayout;
        this.f31265f = appCompatImageView;
        this.f31266g = cf3;
        this.f31267h = recyclerView;
        this.f31268i = goVar;
        this.f31269j = textView;
        this.f31270k = materialTextView;
    }

    /* renamed from: a */
    public static la2 m47749a(View view) {
        int i = R.id.appBar;
        AppBarLayout appBarLayout = (AppBarLayout) ca7.m11819a(view, R.id.appBar);
        if (appBarLayout != null) {
            i = R.id.ccToolBar;
            CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) ca7.m11819a(view, R.id.ccToolBar);
            if (collapsingToolbarLayout != null) {
                FrameLayout frameLayout = (FrameLayout) view;
                i = R.id.coordinator;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ca7.m11819a(view, R.id.coordinator);
                if (coordinatorLayout != null) {
                    i = R.id.imgInfo;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ca7.m11819a(view, R.id.imgInfo);
                    if (appCompatImageView != null) {
                        i = R.id.lSelectTokenType;
                        View a = ca7.m11819a(view, R.id.lSelectTokenType);
                        if (a != null) {
                            cf3 a2 = cf3.m32978a(a);
                            i = R.id.rvReflectionToken;
                            RecyclerView recyclerView = (RecyclerView) ca7.m11819a(view, R.id.rvReflectionToken);
                            if (recyclerView != null) {
                                i = R.id.topBar;
                                View a3 = ca7.m11819a(view, R.id.topBar);
                                if (a3 != null) {
                                    C5872go a4 = C5872go.m44795a(a3);
                                    i = R.id.tvTitle;
                                    TextView textView = (TextView) ca7.m11819a(view, R.id.tvTitle);
                                    if (textView != null) {
                                        i = R.id.txtAlertReflection;
                                        MaterialTextView materialTextView = (MaterialTextView) ca7.m11819a(view, R.id.txtAlertReflection);
                                        if (materialTextView != null) {
                                            return new la2(frameLayout, appBarLayout, collapsingToolbarLayout, frameLayout, coordinatorLayout, appCompatImageView, a2, recyclerView, a4, textView, materialTextView);
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
