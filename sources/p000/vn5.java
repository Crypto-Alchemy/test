package p000;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputEditText;
import net.safemoon.androidwallet.R;

/* renamed from: vn5 */
/* compiled from: SearchBarBinding */
public final class vn5 {

    /* renamed from: a */
    public final LinearLayout f34979a;

    /* renamed from: b */
    public final TextInputEditText f34980b;

    /* renamed from: c */
    public final LinearLayout f34981c;

    public vn5(LinearLayout linearLayout, TextInputEditText textInputEditText, LinearLayout linearLayout2) {
        this.f34979a = linearLayout;
        this.f34980b = textInputEditText;
        this.f34981c = linearLayout2;
    }

    /* renamed from: a */
    public static vn5 m53437a(View view) {
        TextInputEditText textInputEditText = (TextInputEditText) ca7.m11819a(view, R.id.etSearch);
        if (textInputEditText != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            return new vn5(linearLayout, textInputEditText, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.etSearch)));
    }

    /* renamed from: b */
    public LinearLayout mo48773b() {
        return this.f34979a;
    }
}
