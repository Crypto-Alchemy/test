package p000;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import net.safemoon.androidwallet.R;

/* renamed from: pm2 */
/* compiled from: HolderReflectionBinding */
public final class pm2 {

    /* renamed from: a */
    public final ConstraintLayout f32734a;

    /* renamed from: b */
    public final TextView f32735b;

    /* renamed from: c */
    public final TextView f32736c;

    /* renamed from: d */
    public final TextView f32737d;

    /* renamed from: e */
    public final View f32738e;

    public pm2(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, View view) {
        this.f32734a = constraintLayout;
        this.f32735b = textView;
        this.f32736c = textView2;
        this.f32737d = textView3;
        this.f32738e = view;
    }

    /* renamed from: a */
    public static pm2 m49996a(View view) {
        int i = R.id.tvTime;
        TextView textView = (TextView) ca7.m11819a(view, R.id.tvTime);
        if (textView != null) {
            i = R.id.tvTokenBalance;
            TextView textView2 = (TextView) ca7.m11819a(view, R.id.tvTokenBalance);
            if (textView2 != null) {
                i = R.id.tvTokenNativeBalance;
                TextView textView3 = (TextView) ca7.m11819a(view, R.id.tvTokenNativeBalance);
                if (textView3 != null) {
                    i = R.id.vDivider;
                    View a = ca7.m11819a(view, R.id.vDivider);
                    if (a != null) {
                        return new pm2((ConstraintLayout) view, textView, textView2, textView3, a);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public ConstraintLayout mo46779b() {
        return this.f32734a;
    }
}
