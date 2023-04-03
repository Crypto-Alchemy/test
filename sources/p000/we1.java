package p000;

import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import net.safemoon.androidwallet.R;

/* renamed from: we1 */
/* compiled from: DialogAnchorFiatCurrencyBinding */
public final class we1 {

    /* renamed from: a */
    public final ConstraintLayout f35311a;

    /* renamed from: b */
    public final CardView f35312b;

    /* renamed from: c */
    public final RecyclerView f35313c;

    /* renamed from: d */
    public final vn5 f35314d;

    public we1(ConstraintLayout constraintLayout, CardView cardView, RecyclerView recyclerView, vn5 vn5) {
        this.f35311a = constraintLayout;
        this.f35312b = cardView;
        this.f35313c = recyclerView;
        this.f35314d = vn5;
    }

    /* renamed from: a */
    public static we1 m53866a(View view) {
        int i = R.id.ccItemWrapper;
        CardView cardView = (CardView) ca7.m11819a(view, R.id.ccItemWrapper);
        if (cardView != null) {
            i = R.id.recyclerView;
            RecyclerView recyclerView = (RecyclerView) ca7.m11819a(view, R.id.recyclerView);
            if (recyclerView != null) {
                i = R.id.searchBar;
                View a = ca7.m11819a(view, R.id.searchBar);
                if (a != null) {
                    return new we1((ConstraintLayout) view, cardView, recyclerView, vn5.m53437a(a));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
