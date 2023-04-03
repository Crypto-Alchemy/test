package p000;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputEditText;
import net.safemoon.androidwallet.R;

/* renamed from: un5 */
/* compiled from: SearchBar1Binding */
public final class un5 {

    /* renamed from: a */
    public final LinearLayout f34625a;

    /* renamed from: b */
    public final TextInputEditText f34626b;

    /* renamed from: c */
    public final LinearLayout f34627c;

    public un5(LinearLayout linearLayout, TextInputEditText textInputEditText, LinearLayout linearLayout2) {
        this.f34625a = linearLayout;
        this.f34626b = textInputEditText;
        this.f34627c = linearLayout2;
    }

    /* renamed from: a */
    public static un5 m52886a(View view) {
        TextInputEditText textInputEditText = (TextInputEditText) ca7.m11819a(view, R.id.etSearch);
        if (textInputEditText != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            return new un5(linearLayout, textInputEditText, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.etSearch)));
    }
}
