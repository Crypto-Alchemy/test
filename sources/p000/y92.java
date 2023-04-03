package p000;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import net.safemoon.androidwallet.R;

/* renamed from: y92 */
/* compiled from: FragmentManageContactsBinding */
public final class y92 {

    /* renamed from: a */
    public final ConstraintLayout f35802a;

    /* renamed from: b */
    public final RecyclerView f35803b;

    /* renamed from: c */
    public final vn5 f35804c;

    /* renamed from: d */
    public final tr6 f35805d;

    /* renamed from: e */
    public final TextView f35806e;

    public y92(ConstraintLayout constraintLayout, RecyclerView recyclerView, vn5 vn5, tr6 tr6, TextView textView) {
        this.f35802a = constraintLayout;
        this.f35803b = recyclerView;
        this.f35804c = vn5;
        this.f35805d = tr6;
        this.f35806e = textView;
    }

    /* renamed from: a */
    public static y92 m54658a(View view) {
        int i = R.id.rvContactList;
        RecyclerView recyclerView = (RecyclerView) ca7.m11819a(view, R.id.rvContactList);
        if (recyclerView != null) {
            i = R.id.searchBar;
            View a = ca7.m11819a(view, R.id.searchBar);
            if (a != null) {
                vn5 a2 = vn5.m53437a(a);
                i = R.id.toolbar;
                View a3 = ca7.m11819a(view, R.id.toolbar);
                if (a3 != null) {
                    tr6 a4 = tr6.m52423a(a3);
                    i = R.id.tvNoItemsMsg;
                    TextView textView = (TextView) ca7.m11819a(view, R.id.tvNoItemsMsg);
                    if (textView != null) {
                        return new y92((ConstraintLayout) view, recyclerView, a2, a4, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public ConstraintLayout mo49617b() {
        return this.f35802a;
    }
}
