package p000;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import net.safemoon.androidwallet.R;

/* renamed from: ha2 */
/* compiled from: FragmentNotificationHistoryBinding */
public final class ha2 {

    /* renamed from: a */
    public final ConstraintLayout f29492a;

    /* renamed from: b */
    public final FrameLayout f29493b;

    /* renamed from: c */
    public final TextView f29494c;

    /* renamed from: d */
    public final TextView f29495d;

    /* renamed from: e */
    public final TextView f29496e;

    /* renamed from: f */
    public final TextView f29497f;

    /* renamed from: g */
    public final RecyclerView f29498g;

    /* renamed from: h */
    public final SwipeRefreshLayout f29499h;

    /* renamed from: i */
    public final RelativeLayout f29500i;

    /* renamed from: j */
    public final b36 f29501j;

    /* renamed from: k */
    public final TextView f29502k;

    public ha2(ConstraintLayout constraintLayout, FrameLayout frameLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, RelativeLayout relativeLayout, b36 b36, TextView textView5) {
        this.f29492a = constraintLayout;
        this.f29493b = frameLayout;
        this.f29494c = textView;
        this.f29495d = textView2;
        this.f29496e = textView3;
        this.f29497f = textView4;
        this.f29498g = recyclerView;
        this.f29499h = swipeRefreshLayout;
        this.f29500i = relativeLayout;
        this.f29501j = b36;
        this.f29502k = textView5;
    }

    /* renamed from: a */
    public static ha2 m45079a(View view) {
        int i = R.id.cv_2;
        FrameLayout frameLayout = (FrameLayout) ca7.m11819a(view, R.id.cv_2);
        if (frameLayout != null) {
            i = R.id.delete;
            TextView textView = (TextView) ca7.m11819a(view, R.id.delete);
            if (textView != null) {
                i = R.id.deleteAll;
                TextView textView2 = (TextView) ca7.m11819a(view, R.id.deleteAll);
                if (textView2 != null) {
                    i = R.id.markAllAsRead;
                    TextView textView3 = (TextView) ca7.m11819a(view, R.id.markAllAsRead);
                    if (textView3 != null) {
                        i = R.id.markAsRead;
                        TextView textView4 = (TextView) ca7.m11819a(view, R.id.markAsRead);
                        if (textView4 != null) {
                            i = R.id.rvNotifications;
                            RecyclerView recyclerView = (RecyclerView) ca7.m11819a(view, R.id.rvNotifications);
                            if (recyclerView != null) {
                                i = R.id.rvTransGroup;
                                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ca7.m11819a(view, R.id.rvTransGroup);
                                if (swipeRefreshLayout != null) {
                                    i = R.id.selectOptions;
                                    RelativeLayout relativeLayout = (RelativeLayout) ca7.m11819a(view, R.id.selectOptions);
                                    if (relativeLayout != null) {
                                        i = R.id.toolbar;
                                        View a = ca7.m11819a(view, R.id.toolbar);
                                        if (a != null) {
                                            b36 a2 = b36.m32346a(a);
                                            i = R.id.tvNoNotifications;
                                            TextView textView5 = (TextView) ca7.m11819a(view, R.id.tvNoNotifications);
                                            if (textView5 != null) {
                                                return new ha2((ConstraintLayout) view, frameLayout, textView, textView2, textView3, textView4, recyclerView, swipeRefreshLayout, relativeLayout, a2, textView5);
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
    public ConstraintLayout mo43113b() {
        return this.f29492a;
    }
}
