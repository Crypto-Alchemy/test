package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import net.safemoon.androidwallet.R;

/* renamed from: u9 */
/* compiled from: ActivityChooseNetworkBinding */
public final class C6561u9 {

    /* renamed from: a */
    public final ConstraintLayout f34478a;

    /* renamed from: b */
    public final RecyclerView f34479b;

    /* renamed from: c */
    public final vn5 f34480c;

    /* renamed from: d */
    public final b36 f34481d;

    public C6561u9(ConstraintLayout constraintLayout, RecyclerView recyclerView, vn5 vn5, b36 b36) {
        this.f34478a = constraintLayout;
        this.f34479b = recyclerView;
        this.f34480c = vn5;
        this.f34481d = b36;
    }

    /* renamed from: a */
    public static C6561u9 m52684a(View view) {
        int i = R.id.rvChainList;
        RecyclerView recyclerView = (RecyclerView) ca7.m11819a(view, R.id.rvChainList);
        if (recyclerView != null) {
            i = R.id.searchBar;
            View a = ca7.m11819a(view, R.id.searchBar);
            if (a != null) {
                vn5 a2 = vn5.m53437a(a);
                View a3 = ca7.m11819a(view, R.id.toolbar);
                if (a3 != null) {
                    return new C6561u9((ConstraintLayout) view, recyclerView, a2, b36.m32346a(a3));
                }
                i = R.id.toolbar;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C6561u9 m52685c(LayoutInflater layoutInflater) {
        return m52686d(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: d */
    public static C6561u9 m52686d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_choose_network, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m52684a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout mo48349b() {
        return this.f34478a;
    }
}
