package p000;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import net.safemoon.androidwallet.R;

/* renamed from: ze1 */
/* compiled from: DialogAnchorSelectSecurityQuestionsBinding */
public final class ze1 {

    /* renamed from: a */
    public final ConstraintLayout f36131a;

    /* renamed from: b */
    public final LinearLayoutCompat f36132b;

    public ze1(ConstraintLayout constraintLayout, LinearLayoutCompat linearLayoutCompat) {
        this.f36131a = constraintLayout;
        this.f36132b = linearLayoutCompat;
    }

    /* renamed from: a */
    public static ze1 m55075a(View view) {
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ca7.m11819a(view, R.id.buttonWrapper);
        if (linearLayoutCompat != null) {
            return new ze1((ConstraintLayout) view, linearLayoutCompat);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.buttonWrapper)));
    }
}
