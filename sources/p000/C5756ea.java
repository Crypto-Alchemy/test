package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.views.CustomKeyBoard;

/* renamed from: ea */
/* compiled from: ActivityHomeBinding */
public final class C5756ea {

    /* renamed from: a */
    public final CoordinatorLayout f28470a;

    /* renamed from: b */
    public final Barrier f28471b;

    /* renamed from: c */
    public final TextView f28472c;

    /* renamed from: d */
    public final ConstraintLayout f28473d;

    /* renamed from: e */
    public final ConstraintLayout f28474e;

    /* renamed from: f */
    public final ImageView f28475f;

    /* renamed from: g */
    public final AppCompatImageView f28476g;

    /* renamed from: h */
    public final CustomKeyBoard f28477h;

    /* renamed from: i */
    public final CardView f28478i;

    /* renamed from: j */
    public final BottomNavigationView f28479j;

    /* renamed from: k */
    public final CoordinatorLayout f28480k;

    /* renamed from: l */
    public final AppCompatTextView f28481l;

    /* renamed from: m */
    public final TextView f28482m;

    /* renamed from: n */
    public final TextView f28483n;

    /* renamed from: o */
    public final TextView f28484o;

    /* renamed from: p */
    public final TextView f28485p;

    /* renamed from: q */
    public final TextView f28486q;

    /* renamed from: r */
    public final TextView f28487r;

    public C5756ea(CoordinatorLayout coordinatorLayout, Barrier barrier, TextView textView, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, AppCompatImageView appCompatImageView, CustomKeyBoard customKeyBoard, CardView cardView, BottomNavigationView bottomNavigationView, CoordinatorLayout coordinatorLayout2, AppCompatTextView appCompatTextView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.f28470a = coordinatorLayout;
        this.f28471b = barrier;
        this.f28472c = textView;
        this.f28473d = constraintLayout;
        this.f28474e = constraintLayout2;
        this.f28475f = imageView;
        this.f28476g = appCompatImageView;
        this.f28477h = customKeyBoard;
        this.f28478i = cardView;
        this.f28479j = bottomNavigationView;
        this.f28480k = coordinatorLayout2;
        this.f28481l = appCompatTextView;
        this.f28482m = textView2;
        this.f28483n = textView3;
        this.f28484o = textView4;
        this.f28485p = textView5;
        this.f28486q = textView6;
        this.f28487r = textView7;
    }

    /* renamed from: a */
    public static C5756ea m43837a(View view) {
        View view2 = view;
        int i = R.id.barrierBottom;
        Barrier barrier = (Barrier) ca7.m11819a(view2, R.id.barrierBottom);
        if (barrier != null) {
            i = R.id.btnConfirm;
            TextView textView = (TextView) ca7.m11819a(view2, R.id.btnConfirm);
            if (textView != null) {
                i = R.id.cl_top;
                ConstraintLayout constraintLayout = (ConstraintLayout) ca7.m11819a(view2, R.id.cl_top);
                if (constraintLayout != null) {
                    i = R.id.container;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ca7.m11819a(view2, R.id.container);
                    if (constraintLayout2 != null) {
                        i = R.id.imageView5;
                        ImageView imageView = (ImageView) ca7.m11819a(view2, R.id.imageView5);
                        if (imageView != null) {
                            i = R.id.img_logo;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) ca7.m11819a(view2, R.id.img_logo);
                            if (appCompatImageView != null) {
                                i = R.id.keyWrapper;
                                CustomKeyBoard customKeyBoard = (CustomKeyBoard) ca7.m11819a(view2, R.id.keyWrapper);
                                if (customKeyBoard != null) {
                                    i = R.id.loaderWrapper;
                                    CardView cardView = (CardView) ca7.m11819a(view2, R.id.loaderWrapper);
                                    if (cardView != null) {
                                        i = R.id.nav_view;
                                        BottomNavigationView bottomNavigationView = (BottomNavigationView) ca7.m11819a(view2, R.id.nav_view);
                                        if (bottomNavigationView != null) {
                                            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view2;
                                            i = R.id.text_version;
                                            AppCompatTextView appCompatTextView = (AppCompatTextView) ca7.m11819a(view2, R.id.text_version);
                                            if (appCompatTextView != null) {
                                                i = R.id.textView28;
                                                TextView textView2 = (TextView) ca7.m11819a(view2, R.id.textView28);
                                                if (textView2 != null) {
                                                    i = R.id.textView29;
                                                    TextView textView3 = (TextView) ca7.m11819a(view2, R.id.textView29);
                                                    if (textView3 != null) {
                                                        i = R.id.textView30;
                                                        TextView textView4 = (TextView) ca7.m11819a(view2, R.id.textView30);
                                                        if (textView4 != null) {
                                                            i = R.id.textView31;
                                                            TextView textView5 = (TextView) ca7.m11819a(view2, R.id.textView31);
                                                            if (textView5 != null) {
                                                                i = R.id.textView32;
                                                                TextView textView6 = (TextView) ca7.m11819a(view2, R.id.textView32);
                                                                if (textView6 != null) {
                                                                    i = R.id.textView33;
                                                                    TextView textView7 = (TextView) ca7.m11819a(view2, R.id.textView33);
                                                                    if (textView7 != null) {
                                                                        return new C5756ea(coordinatorLayout, barrier, textView, constraintLayout, constraintLayout2, imageView, appCompatImageView, customKeyBoard, cardView, bottomNavigationView, coordinatorLayout, appCompatTextView, textView2, textView3, textView4, textView5, textView6, textView7);
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

    /* renamed from: c */
    public static C5756ea m43838c(LayoutInflater layoutInflater) {
        return m43839d(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: d */
    public static C5756ea m43839d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_home, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m43837a(inflate);
    }

    /* renamed from: b */
    public CoordinatorLayout mo42172b() {
        return this.f28470a;
    }
}
