package p000;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import net.safemoon.androidwallet.R;

/* renamed from: o92 */
/* compiled from: FragmentDefaultLanguageBinding */
public final class o92 {

    /* renamed from: a */
    public final ConstraintLayout f32318a;

    /* renamed from: b */
    public final EditText f32319b;

    /* renamed from: c */
    public final RecyclerView f32320c;

    /* renamed from: d */
    public final b36 f32321d;

    /* renamed from: e */
    public final TextView f32322e;

    /* renamed from: f */
    public final LinearLayout f32323f;

    public o92(ConstraintLayout constraintLayout, EditText editText, RecyclerView recyclerView, b36 b36, TextView textView, LinearLayout linearLayout) {
        this.f32318a = constraintLayout;
        this.f32319b = editText;
        this.f32320c = recyclerView;
        this.f32321d = b36;
        this.f32322e = textView;
        this.f32323f = linearLayout;
    }

    /* renamed from: a */
    public static o92 m49220a(View view) {
        int i = R.id.etSearch;
        EditText editText = (EditText) ca7.m11819a(view, R.id.etSearch);
        if (editText != null) {
            i = R.id.rvRealLanguage;
            RecyclerView recyclerView = (RecyclerView) ca7.m11819a(view, R.id.rvRealLanguage);
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
                            return new o92((ConstraintLayout) view, editText, recyclerView, a2, textView, linearLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public ConstraintLayout mo46358b() {
        return this.f32318a;
    }
}
