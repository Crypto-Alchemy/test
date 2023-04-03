package p000;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import net.safemoon.androidwallet.R;

/* renamed from: uy2 */
/* compiled from: ItemAktFiatListHeaderBinding */
public final class uy2 {

    /* renamed from: a */
    public final ConstraintLayout f34754a;

    /* renamed from: b */
    public final TextView f34755b;

    public uy2(ConstraintLayout constraintLayout, TextView textView) {
        this.f34754a = constraintLayout;
        this.f34755b = textView;
    }

    /* renamed from: a */
    public static uy2 m53070a(View view) {
        TextView textView = (TextView) ca7.m11819a(view, R.id.tvText);
        if (textView != null) {
            return new uy2((ConstraintLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.tvText)));
    }

    /* renamed from: b */
    public ConstraintLayout mo48550b() {
        return this.f34754a;
    }
}
