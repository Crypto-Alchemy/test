package p000;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import net.safemoon.androidwallet.R;

/* renamed from: ff1 */
/* compiled from: DialogCustomConfirmationBinding */
public final class ff1 {

    /* renamed from: a */
    public final ConstraintLayout f28850a;

    /* renamed from: b */
    public final LinearLayoutCompat f28851b;

    public ff1(ConstraintLayout constraintLayout, LinearLayoutCompat linearLayoutCompat) {
        this.f28850a = constraintLayout;
        this.f28851b = linearLayoutCompat;
    }

    /* renamed from: a */
    public static ff1 m44308a(View view) {
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ca7.m11819a(view, R.id.childWrapper);
        if (linearLayoutCompat != null) {
            return new ff1((ConstraintLayout) view, linearLayoutCompat);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.childWrapper)));
    }
}
