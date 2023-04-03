package p000;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import net.safemoon.androidwallet.R;

/* renamed from: q92 */
/* compiled from: FragmentFiatListBinding */
public final class q92 {

    /* renamed from: a */
    public final ConstraintLayout f32993a;

    /* renamed from: b */
    public final EditText f32994b;

    /* renamed from: c */
    public final ProgressBar f32995c;

    /* renamed from: d */
    public final RecyclerView f32996d;

    /* renamed from: e */
    public final b36 f32997e;

    /* renamed from: f */
    public final TextView f32998f;

    /* renamed from: g */
    public final LinearLayout f32999g;

    public q92(ConstraintLayout constraintLayout, EditText editText, ProgressBar progressBar, RecyclerView recyclerView, b36 b36, TextView textView, LinearLayout linearLayout) {
        this.f32993a = constraintLayout;
        this.f32994b = editText;
        this.f32995c = progressBar;
        this.f32996d = recyclerView;
        this.f32997e = b36;
        this.f32998f = textView;
        this.f32999g = linearLayout;
    }

    /* renamed from: a */
    public static q92 m50460a(View view) {
        int i = R.id.etSearch;
        EditText editText = (EditText) ca7.m11819a(view, R.id.etSearch);
        if (editText != null) {
            i = R.id.pbRealCurrency;
            ProgressBar progressBar = (ProgressBar) ca7.m11819a(view, R.id.pbRealCurrency);
            if (progressBar != null) {
                i = R.id.rvRealCurrency;
                RecyclerView recyclerView = (RecyclerView) ca7.m11819a(view, R.id.rvRealCurrency);
                if (recyclerView != null) {
                    i = R.id.toolbar;
                    View a = ca7.m11819a(view, R.id.toolbar);
                    if (a != null) {
                        b36 a2 = b36.m32346a(a);
                        i = R.id.tv_not_fount;
                        TextView textView = (TextView) ca7.m11819a(view, R.id.tv_not_fount);
                        if (textView != null) {
                            i = R.id.vSearchContainer;
                            LinearLayout linearLayout = (LinearLayout) ca7.m11819a(view, R.id.vSearchContainer);
                            if (linearLayout != null) {
                                return new q92((ConstraintLayout) view, editText, progressBar, recyclerView, a2, textView, linearLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public ConstraintLayout mo47025b() {
        return this.f32993a;
    }
}
