package p000;

import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import net.safemoon.androidwallet.R;

/* renamed from: ye1 */
/* compiled from: DialogAnchorPopUpMyTokensBinding */
public final class ye1 {

    /* renamed from: a */
    public final ConstraintLayout f35853a;

    /* renamed from: b */
    public final CardView f35854b;

    /* renamed from: c */
    public final RecyclerView f35855c;

    /* renamed from: d */
    public final vn5 f35856d;

    public ye1(ConstraintLayout constraintLayout, CardView cardView, RecyclerView recyclerView, vn5 vn5) {
        this.f35853a = constraintLayout;
        this.f35854b = cardView;
        this.f35855c = recyclerView;
        this.f35856d = vn5;
    }

    /* renamed from: a */
    public static ye1 m54726a(View view) {
        int i = R.id.ccItemWrapper;
        CardView cardView = (CardView) ca7.m11819a(view, R.id.ccItemWrapper);
        if (cardView != null) {
            i = R.id.recyclerView;
            RecyclerView recyclerView = (RecyclerView) ca7.m11819a(view, R.id.recyclerView);
            if (recyclerView != null) {
                i = R.id.searchBar;
                View a = ca7.m11819a(view, R.id.searchBar);
                if (a != null) {
                    return new ye1((ConstraintLayout) view, cardView, recyclerView, vn5.m53437a(a));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
