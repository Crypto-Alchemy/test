package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import net.safemoon.androidwallet.R;

/* renamed from: ab */
/* compiled from: ActivityStartWalletBinding */
public final class C3805ab {

    /* renamed from: a */
    public final ConstraintLayout f20877a;

    /* renamed from: b */
    public final it2 f20878b;

    public C3805ab(ConstraintLayout constraintLayout, it2 it2) {
        this.f20877a = constraintLayout;
        this.f20878b = it2;
    }

    /* renamed from: a */
    public static C3805ab m31763a(View view) {
        View a = ca7.m11819a(view, R.id.layoutSafeMoonBrand);
        if (a != null) {
            return new C3805ab((ConstraintLayout) view, it2.m45959a(a));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.layoutSafeMoonBrand)));
    }

    /* renamed from: c */
    public static C3805ab m31764c(LayoutInflater layoutInflater) {
        return m31765d(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: d */
    public static C3805ab m31765d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_start_wallet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m31763a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout mo28905b() {
        return this.f20877a;
    }
}
