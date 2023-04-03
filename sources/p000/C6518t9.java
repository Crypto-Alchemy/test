package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import net.safemoon.androidwallet.R;

/* renamed from: t9 */
/* compiled from: ActivityAktSelectLanguageBinding */
public final class C6518t9 {

    /* renamed from: a */
    public final ConstraintLayout f34146a;

    /* renamed from: b */
    public final ConstraintLayout f34147b;

    /* renamed from: c */
    public final EditText f34148c;

    /* renamed from: d */
    public final RecyclerView f34149d;

    /* renamed from: e */
    public final c36 f34150e;

    /* renamed from: f */
    public final TextView f34151f;

    /* renamed from: g */
    public final LinearLayout f34152g;

    public C6518t9(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, EditText editText, RecyclerView recyclerView, c36 c36, TextView textView, LinearLayout linearLayout) {
        this.f34146a = constraintLayout;
        this.f34147b = constraintLayout2;
        this.f34148c = editText;
        this.f34149d = recyclerView;
        this.f34150e = c36;
        this.f34151f = textView;
        this.f34152g = linearLayout;
    }

    /* renamed from: a */
    public static C6518t9 m52139a(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.etSearch;
        EditText editText = (EditText) ca7.m11819a(view, R.id.etSearch);
        if (editText != null) {
            i = R.id.rvRealLanguage;
            RecyclerView recyclerView = (RecyclerView) ca7.m11819a(view, R.id.rvRealLanguage);
            if (recyclerView != null) {
                i = R.id.toolbar;
                View a = ca7.m11819a(view, R.id.toolbar);
                if (a != null) {
                    c36 a2 = c36.m32847a(a);
                    i = R.id.tv_not_found;
                    TextView textView = (TextView) ca7.m11819a(view, R.id.tv_not_found);
                    if (textView != null) {
                        i = R.id.vSearchContainer;
                        LinearLayout linearLayout = (LinearLayout) ca7.m11819a(view, R.id.vSearchContainer);
                        if (linearLayout != null) {
                            return new C6518t9(constraintLayout, constraintLayout, editText, recyclerView, a2, textView, linearLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C6518t9 m52140c(LayoutInflater layoutInflater) {
        return m52141d(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: d */
    public static C6518t9 m52141d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_akt_select_language, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m52139a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout mo48033b() {
        return this.f34146a;
    }
}
