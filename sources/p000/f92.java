package p000;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import net.safemoon.androidwallet.R;

/* renamed from: f92 */
/* compiled from: FragmentChainNetworkBinding */
public final class f92 {

    /* renamed from: a */
    public final ConstraintLayout f28789a;

    /* renamed from: b */
    public final RecyclerView f28790b;

    /* renamed from: c */
    public final vn5 f28791c;

    /* renamed from: d */
    public final b36 f28792d;

    public f92(ConstraintLayout constraintLayout, RecyclerView recyclerView, vn5 vn5, b36 b36) {
        this.f28789a = constraintLayout;
        this.f28790b = recyclerView;
        this.f28791c = vn5;
        this.f28792d = b36;
    }

    /* renamed from: a */
    public static f92 m44232a(View view) {
        int i = R.id.rvChainList;
        RecyclerView recyclerView = (RecyclerView) ca7.m11819a(view, R.id.rvChainList);
        if (recyclerView != null) {
            i = R.id.searchBar;
            View a = ca7.m11819a(view, R.id.searchBar);
            if (a != null) {
                vn5 a2 = vn5.m53437a(a);
                View a3 = ca7.m11819a(view, R.id.toolbar);
                if (a3 != null) {
                    return new f92((ConstraintLayout) view, recyclerView, a2, b36.m32346a(a3));
                }
                i = R.id.toolbar;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
