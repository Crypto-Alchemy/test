package p000;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import net.safemoon.androidwallet.R;

/* renamed from: oa2 */
/* compiled from: FragmentSelectChainBinding */
public final class oa2 {

    /* renamed from: a */
    public final ConstraintLayout f32342a;

    /* renamed from: b */
    public final RecyclerView f32343b;

    /* renamed from: c */
    public final vn5 f32344c;

    /* renamed from: d */
    public final b36 f32345d;

    public oa2(ConstraintLayout constraintLayout, RecyclerView recyclerView, vn5 vn5, b36 b36) {
        this.f32342a = constraintLayout;
        this.f32343b = recyclerView;
        this.f32344c = vn5;
        this.f32345d = b36;
    }

    /* renamed from: a */
    public static oa2 m49226a(View view) {
        int i = R.id.rvTokenTypeList;
        RecyclerView recyclerView = (RecyclerView) ca7.m11819a(view, R.id.rvTokenTypeList);
        if (recyclerView != null) {
            i = R.id.searchBar;
            View a = ca7.m11819a(view, R.id.searchBar);
            if (a != null) {
                vn5 a2 = vn5.m53437a(a);
                View a3 = ca7.m11819a(view, R.id.toolbar);
                if (a3 != null) {
                    return new oa2((ConstraintLayout) view, recyclerView, a2, b36.m32346a(a3));
                }
                i = R.id.toolbar;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public ConstraintLayout mo46369b() {
        return this.f32342a;
    }
}
