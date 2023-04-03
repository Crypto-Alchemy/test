package p000;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.switchmaterial.SwitchMaterial;
import net.safemoon.androidwallet.R;

/* renamed from: ga2 */
/* compiled from: FragmentNotificationBinding */
public final class ga2 {

    /* renamed from: a */
    public final ConstraintLayout f29146a;

    /* renamed from: b */
    public final LinearLayoutCompat f29147b;

    /* renamed from: c */
    public final View f29148c;

    /* renamed from: d */
    public final CardView f29149d;

    /* renamed from: e */
    public final CardView f29150e;

    /* renamed from: f */
    public final ConstraintLayout f29151f;

    /* renamed from: g */
    public final ImageView f29152g;

    /* renamed from: h */
    public final RecyclerView f29153h;

    /* renamed from: i */
    public final NestedScrollView f29154i;

    /* renamed from: j */
    public final vn5 f29155j;

    /* renamed from: k */
    public final vn5 f29156k;

    /* renamed from: l */
    public final FrameLayout f29157l;

    /* renamed from: m */
    public final SwitchMaterial f29158m;

    /* renamed from: n */
    public final TextView f29159n;

    /* renamed from: o */
    public final TextView f29160o;

    /* renamed from: p */
    public final MaterialButton f29161p;

    public ga2(ConstraintLayout constraintLayout, LinearLayoutCompat linearLayoutCompat, View view, CardView cardView, CardView cardView2, ConstraintLayout constraintLayout2, ImageView imageView, RecyclerView recyclerView, NestedScrollView nestedScrollView, vn5 vn5, vn5 vn52, FrameLayout frameLayout, SwitchMaterial switchMaterial, TextView textView, TextView textView2, MaterialButton materialButton) {
        this.f29146a = constraintLayout;
        this.f29147b = linearLayoutCompat;
        this.f29148c = view;
        this.f29149d = cardView;
        this.f29150e = cardView2;
        this.f29151f = constraintLayout2;
        this.f29152g = imageView;
        this.f29153h = recyclerView;
        this.f29154i = nestedScrollView;
        this.f29155j = vn5;
        this.f29156k = vn52;
        this.f29157l = frameLayout;
        this.f29158m = switchMaterial;
        this.f29159n = textView;
        this.f29160o = textView2;
        this.f29161p = materialButton;
    }

    /* renamed from: a */
    public static ga2 m44673a(View view) {
        View view2 = view;
        int i = R.id.chainWrapper;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ca7.m11819a(view2, R.id.chainWrapper);
        if (linearLayoutCompat != null) {
            i = R.id.constraintLayout;
            View a = ca7.m11819a(view2, R.id.constraintLayout);
            if (a != null) {
                i = R.id.cv_1;
                CardView cardView = (CardView) ca7.m11819a(view2, R.id.cv_1);
                if (cardView != null) {
                    i = R.id.cvPriceAlert;
                    CardView cardView2 = (CardView) ca7.m11819a(view2, R.id.cvPriceAlert);
                    if (cardView2 != null) {
                        i = R.id.cvTokenWrapper;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ca7.m11819a(view2, R.id.cvTokenWrapper);
                        if (constraintLayout != null) {
                            i = R.id.iv_back;
                            ImageView imageView = (ImageView) ca7.m11819a(view2, R.id.iv_back);
                            if (imageView != null) {
                                i = R.id.rvTokenList;
                                RecyclerView recyclerView = (RecyclerView) ca7.m11819a(view2, R.id.rvTokenList);
                                if (recyclerView != null) {
                                    i = R.id.scrollView;
                                    NestedScrollView nestedScrollView = (NestedScrollView) ca7.m11819a(view2, R.id.scrollView);
                                    if (nestedScrollView != null) {
                                        i = R.id.searchBar;
                                        View a2 = ca7.m11819a(view2, R.id.searchBar);
                                        if (a2 != null) {
                                            vn5 a3 = vn5.m53437a(a2);
                                            i = R.id.stickySearchBar;
                                            View a4 = ca7.m11819a(view2, R.id.stickySearchBar);
                                            if (a4 != null) {
                                                vn5 a5 = vn5.m53437a(a4);
                                                i = R.id.stickySearchWrapper;
                                                FrameLayout frameLayout = (FrameLayout) ca7.m11819a(view2, R.id.stickySearchWrapper);
                                                if (frameLayout != null) {
                                                    i = R.id.switchEnableNotificationConfirm;
                                                    SwitchMaterial switchMaterial = (SwitchMaterial) ca7.m11819a(view2, R.id.switchEnableNotificationConfirm);
                                                    if (switchMaterial != null) {
                                                        i = R.id.textView7;
                                                        TextView textView = (TextView) ca7.m11819a(view2, R.id.textView7);
                                                        if (textView != null) {
                                                            i = R.id.txtHeaderCPA;
                                                            TextView textView2 = (TextView) ca7.m11819a(view2, R.id.txtHeaderCPA);
                                                            if (textView2 != null) {
                                                                i = R.id.txtSubHeaderCPA;
                                                                MaterialButton materialButton = (MaterialButton) ca7.m11819a(view2, R.id.txtSubHeaderCPA);
                                                                if (materialButton != null) {
                                                                    return new ga2((ConstraintLayout) view2, linearLayoutCompat, a, cardView, cardView2, constraintLayout, imageView, recyclerView, nestedScrollView, a3, a5, frameLayout, switchMaterial, textView, textView2, materialButton);
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

    /* renamed from: b */
    public ConstraintLayout mo42858b() {
        return this.f29146a;
    }
}
