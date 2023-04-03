package p000;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import net.safemoon.androidwallet.R;

/* renamed from: p26 */
/* compiled from: SimpleListViewBinding */
public final class p26 {

    /* renamed from: a */
    public final ConstraintLayout f32540a;

    /* renamed from: b */
    public final b36 f32541b;

    /* renamed from: c */
    public final RecyclerView f32542c;

    /* renamed from: d */
    public final vn5 f32543d;

    public p26(ConstraintLayout constraintLayout, b36 b36, RecyclerView recyclerView, vn5 vn5) {
        this.f32540a = constraintLayout;
        this.f32541b = b36;
        this.f32542c = recyclerView;
        this.f32543d = vn5;
    }

    /* renamed from: a */
    public static p26 m49675a(View view) {
        int i = R.id.includeTopBar;
        View a = ca7.m11819a(view, R.id.includeTopBar);
        if (a != null) {
            b36 a2 = b36.m32346a(a);
            int i2 = R.id.listView;
            RecyclerView recyclerView = (RecyclerView) ca7.m11819a(view, R.id.listView);
            if (recyclerView != null) {
                i2 = R.id.searchBar;
                View a3 = ca7.m11819a(view, R.id.searchBar);
                if (a3 != null) {
                    return new p26((ConstraintLayout) view, a2, recyclerView, vn5.m53437a(a3));
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
