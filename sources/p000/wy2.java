package p000;

import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import net.safemoon.androidwallet.R;

/* renamed from: wy2 */
/* compiled from: ItemChainNetworkVerticalBinding */
public final class wy2 {

    /* renamed from: a */
    public final LinearLayoutCompat f35482a;

    /* renamed from: b */
    public final ImageView f35483b;

    /* renamed from: c */
    public final LinearLayoutCompat f35484c;

    public wy2(LinearLayoutCompat linearLayoutCompat, ImageView imageView, LinearLayoutCompat linearLayoutCompat2) {
        this.f35482a = linearLayoutCompat;
        this.f35483b = imageView;
        this.f35484c = linearLayoutCompat2;
    }

    /* renamed from: a */
    public static wy2 m54132a(View view) {
        ImageView imageView = (ImageView) ca7.m11819a(view, R.id.imgNativeNetwork);
        if (imageView != null) {
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
            return new wy2(linearLayoutCompat, imageView, linearLayoutCompat);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.imgNativeNetwork)));
    }

    /* renamed from: b */
    public LinearLayoutCompat mo49319b() {
        return this.f35482a;
    }
}
