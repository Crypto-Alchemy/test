package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import net.safemoon.androidwallet.R;

/* renamed from: gz2 */
/* compiled from: ItemManageWalletAddressBinding */
public final class gz2 {

    /* renamed from: a */
    public final LinearLayoutCompat f29403a;

    /* renamed from: b */
    public final LinearLayoutCompat f29404b;

    /* renamed from: c */
    public final TextView f29405c;

    /* renamed from: d */
    public final TextView f29406d;

    public gz2(LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, TextView textView, TextView textView2) {
        this.f29403a = linearLayoutCompat;
        this.f29404b = linearLayoutCompat2;
        this.f29405c = textView;
        this.f29406d = textView2;
    }

    /* renamed from: a */
    public static gz2 m44995a(View view) {
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
        int i = R.id.tvWalletAddress;
        TextView textView = (TextView) ca7.m11819a(view, R.id.tvWalletAddress);
        if (textView != null) {
            i = R.id.tvWalletName;
            TextView textView2 = (TextView) ca7.m11819a(view, R.id.tvWalletName);
            if (textView2 != null) {
                return new gz2(linearLayoutCompat, linearLayoutCompat, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static gz2 m44996c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_manage_wallet_address, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m44995a(inflate);
    }

    /* renamed from: b */
    public LinearLayoutCompat mo43045b() {
        return this.f29403a;
    }
}
