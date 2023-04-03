package p000;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.textview.MaterialTextView;
import net.safemoon.androidwallet.R;

/* renamed from: h92 */
/* compiled from: FragmentCollectiblesBinding */
public final class h92 {

    /* renamed from: a */
    public final LinearLayout f29466a;

    /* renamed from: b */
    public final AppCompatImageView f29467b;

    /* renamed from: c */
    public final AppCompatImageView f29468c;

    /* renamed from: d */
    public final LinearLayout f29469d;

    /* renamed from: e */
    public final TextView f29470e;

    /* renamed from: f */
    public final LinearLayout f29471f;

    /* renamed from: g */
    public final LinearLayout f29472g;

    /* renamed from: h */
    public final cf3 f29473h;

    /* renamed from: i */
    public final TextView f29474i;

    /* renamed from: j */
    public final RecyclerView f29475j;

    /* renamed from: k */
    public final SwipeRefreshLayout f29476k;

    /* renamed from: l */
    public final TextView f29477l;

    /* renamed from: m */
    public final MaterialTextView f29478m;

    /* renamed from: n */
    public final TextView f29479n;

    public h92(LinearLayout linearLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, LinearLayout linearLayout2, TextView textView, LinearLayout linearLayout3, LinearLayout linearLayout4, cf3 cf3, TextView textView2, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, TextView textView3, MaterialTextView materialTextView, TextView textView4) {
        this.f29466a = linearLayout;
        this.f29467b = appCompatImageView;
        this.f29468c = appCompatImageView2;
        this.f29469d = linearLayout2;
        this.f29470e = textView;
        this.f29471f = linearLayout3;
        this.f29472g = linearLayout4;
        this.f29473h = cf3;
        this.f29474i = textView2;
        this.f29475j = recyclerView;
        this.f29476k = swipeRefreshLayout;
        this.f29477l = textView3;
        this.f29478m = materialTextView;
        this.f29479n = textView4;
    }

    /* renamed from: a */
    public static h92 m45069a(View view) {
        View view2 = view;
        int i = R.id.btnForHide;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ca7.m11819a(view2, R.id.btnForHide);
        if (appCompatImageView != null) {
            i = R.id.btnInfo;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ca7.m11819a(view2, R.id.btnInfo);
            if (appCompatImageView2 != null) {
                LinearLayout linearLayout = (LinearLayout) view2;
                i = R.id.emptyPlaceholder;
                TextView textView = (TextView) ca7.m11819a(view2, R.id.emptyPlaceholder);
                if (textView != null) {
                    i = R.id.errorWrapper;
                    LinearLayout linearLayout2 = (LinearLayout) ca7.m11819a(view2, R.id.errorWrapper);
                    if (linearLayout2 != null) {
                        i = R.id.headerWrapper;
                        LinearLayout linearLayout3 = (LinearLayout) ca7.m11819a(view2, R.id.headerWrapper);
                        if (linearLayout3 != null) {
                            i = R.id.lSelectTokenType;
                            View a = ca7.m11819a(view2, R.id.lSelectTokenType);
                            if (a != null) {
                                cf3 a2 = cf3.m32978a(a);
                                i = R.id.learn_more;
                                TextView textView2 = (TextView) ca7.m11819a(view2, R.id.learn_more);
                                if (textView2 != null) {
                                    i = R.id.nftCollections;
                                    RecyclerView recyclerView = (RecyclerView) ca7.m11819a(view2, R.id.nftCollections);
                                    if (recyclerView != null) {
                                        i = R.id.swRefresh;
                                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ca7.m11819a(view2, R.id.swRefresh);
                                        if (swipeRefreshLayout != null) {
                                            i = R.id.title;
                                            TextView textView3 = (TextView) ca7.m11819a(view2, R.id.title);
                                            if (textView3 != null) {
                                                i = R.id.tvMainWallet;
                                                MaterialTextView materialTextView = (MaterialTextView) ca7.m11819a(view2, R.id.tvMainWallet);
                                                if (materialTextView != null) {
                                                    i = R.id.whatAreCollectibles;
                                                    TextView textView4 = (TextView) ca7.m11819a(view2, R.id.whatAreCollectibles);
                                                    if (textView4 != null) {
                                                        return new h92(linearLayout, appCompatImageView, appCompatImageView2, linearLayout, textView, linearLayout2, linearLayout3, a2, textView2, recyclerView, swipeRefreshLayout, textView3, materialTextView, textView4);
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
    public LinearLayout mo43107b() {
        return this.f29466a;
    }
}
