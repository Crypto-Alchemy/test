package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import net.safemoon.androidwallet.R;

/* renamed from: bb */
/* compiled from: ActivitySwitchWalletBinding */
public final class C3888bb {

    /* renamed from: a */
    public final ConstraintLayout f21215a;

    /* renamed from: b */
    public final RecyclerView f21216b;

    /* renamed from: c */
    public final tr6 f21217c;

    public C3888bb(ConstraintLayout constraintLayout, RecyclerView recyclerView, tr6 tr6) {
        this.f21215a = constraintLayout;
        this.f21216b = recyclerView;
        this.f21217c = tr6;
    }

    /* renamed from: a */
    public static C3888bb m32450a(View view) {
        int i = R.id.rvWallets;
        RecyclerView recyclerView = (RecyclerView) ca7.m11819a(view, R.id.rvWallets);
        if (recyclerView != null) {
            i = R.id.toolbarParent;
            View a = ca7.m11819a(view, R.id.toolbarParent);
            if (a != null) {
                return new C3888bb((ConstraintLayout) view, recyclerView, tr6.m52423a(a));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C3888bb m32451c(LayoutInflater layoutInflater) {
        return m32452d(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: d */
    public static C3888bb m32452d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_switch_wallet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m32450a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout mo29516b() {
        return this.f21215a;
    }
}
