package p000;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import net.safemoon.androidwallet.R;

/* renamed from: nm2 */
/* compiled from: HolderNotificationHistoryItemHeaderBinding */
public final class nm2 {

    /* renamed from: a */
    public final ConstraintLayout f32147a;

    /* renamed from: b */
    public final TextView f32148b;

    /* renamed from: c */
    public final TextView f32149c;

    public nm2(ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        this.f32147a = constraintLayout;
        this.f32148b = textView;
        this.f32149c = textView2;
    }

    /* renamed from: a */
    public static nm2 m48826a(View view) {
        int i = R.id.tvNotificationDate;
        TextView textView = (TextView) ca7.m11819a(view, R.id.tvNotificationDate);
        if (textView != null) {
            i = R.id.tvNotificationText;
            TextView textView2 = (TextView) ca7.m11819a(view, R.id.tvNotificationText);
            if (textView2 != null) {
                return new nm2((ConstraintLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public ConstraintLayout mo46104b() {
        return this.f32147a;
    }
}
