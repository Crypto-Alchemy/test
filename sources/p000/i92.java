package p000;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import net.safemoon.androidwallet.R;

/* renamed from: i92 */
/* compiled from: FragmentCollectionsBinding */
public final class i92 {

    /* renamed from: a */
    public final LinearLayout f29856a;

    /* renamed from: b */
    public final AppCompatImageView f29857b;

    /* renamed from: c */
    public final AppCompatImageView f29858c;

    /* renamed from: d */
    public final LinearLayout f29859d;

    /* renamed from: e */
    public final TextView f29860e;

    /* renamed from: f */
    public final TextView f29861f;

    /* renamed from: g */
    public final RecyclerView f29862g;

    /* renamed from: h */
    public final SwipeRefreshLayout f29863h;

    /* renamed from: i */
    public final AppCompatTextView f29864i;

    public i92(LinearLayout linearLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, LinearLayout linearLayout2, TextView textView, TextView textView2, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, AppCompatTextView appCompatTextView) {
        this.f29856a = linearLayout;
        this.f29857b = appCompatImageView;
        this.f29858c = appCompatImageView2;
        this.f29859d = linearLayout2;
        this.f29860e = textView;
        this.f29861f = textView2;
        this.f29862g = recyclerView;
        this.f29863h = swipeRefreshLayout;
        this.f29864i = appCompatTextView;
    }

    /* renamed from: a */
    public static i92 m45588a(View view) {
        int i = R.id.btnBack;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ca7.m11819a(view, R.id.btnBack);
        if (appCompatImageView != null) {
            i = R.id.btnInfo;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ca7.m11819a(view, R.id.btnInfo);
            if (appCompatImageView2 != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                i = R.id.emptyPlaceholder;
                TextView textView = (TextView) ca7.m11819a(view, R.id.emptyPlaceholder);
                if (textView != null) {
                    i = R.id.learn_more;
                    TextView textView2 = (TextView) ca7.m11819a(view, R.id.learn_more);
                    if (textView2 != null) {
                        i = R.id.nftCollections;
                        RecyclerView recyclerView = (RecyclerView) ca7.m11819a(view, R.id.nftCollections);
                        if (recyclerView != null) {
                            i = R.id.swRefresh;
                            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ca7.m11819a(view, R.id.swRefresh);
                            if (swipeRefreshLayout != null) {
                                i = R.id.title;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) ca7.m11819a(view, R.id.title);
                                if (appCompatTextView != null) {
                                    return new i92(linearLayout, appCompatImageView, appCompatImageView2, linearLayout, textView, textView2, recyclerView, swipeRefreshLayout, appCompatTextView);
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
    public LinearLayout mo43522b() {
        return this.f29856a;
    }
}
