package p000;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import net.safemoon.androidwallet.R;

/* renamed from: ab2 */
/* compiled from: FragmentTokenListBinding */
public final class ab2 {

    /* renamed from: a */
    public final ConstraintLayout f20879a;

    /* renamed from: b */
    public final RecyclerView f20880b;

    /* renamed from: c */
    public final un5 f20881c;

    /* renamed from: d */
    public final b36 f20882d;

    public ab2(ConstraintLayout constraintLayout, RecyclerView recyclerView, un5 un5, b36 b36) {
        this.f20879a = constraintLayout;
        this.f20880b = recyclerView;
        this.f20881c = un5;
        this.f20882d = b36;
    }

    /* renamed from: a */
    public static ab2 m31767a(View view) {
        int i = R.id.rvTokenList;
        RecyclerView recyclerView = (RecyclerView) ca7.m11819a(view, R.id.rvTokenList);
        if (recyclerView != null) {
            i = R.id.searchBar;
            View a = ca7.m11819a(view, R.id.searchBar);
            if (a != null) {
                un5 a2 = un5.m52886a(a);
                View a3 = ca7.m11819a(view, R.id.toolbar);
                if (a3 != null) {
                    return new ab2((ConstraintLayout) view, recyclerView, a2, b36.m32346a(a3));
                }
                i = R.id.toolbar;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
