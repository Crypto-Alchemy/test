package p000;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import net.safemoon.androidwallet.R;

/* renamed from: lb2 */
/* compiled from: FragmentWalletConnectBinding */
public final class lb2 {

    /* renamed from: a */
    public final ConstraintLayout f31273a;

    /* renamed from: b */
    public final MaterialButton f31274b;

    /* renamed from: c */
    public final MaterialCardView f31275c;

    /* renamed from: d */
    public final View f31276d;

    /* renamed from: e */
    public final RecyclerView f31277e;

    /* renamed from: f */
    public final b36 f31278f;

    /* renamed from: g */
    public final AppCompatTextView f31279g;

    /* renamed from: h */
    public final MaterialTextView f31280h;

    /* renamed from: i */
    public final CardView f31281i;

    public lb2(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialCardView materialCardView, View view, RecyclerView recyclerView, b36 b36, AppCompatTextView appCompatTextView, MaterialTextView materialTextView, CardView cardView) {
        this.f31273a = constraintLayout;
        this.f31274b = materialButton;
        this.f31275c = materialCardView;
        this.f31276d = view;
        this.f31277e = recyclerView;
        this.f31278f = b36;
        this.f31279g = appCompatTextView;
        this.f31280h = materialTextView;
        this.f31281i = cardView;
    }

    /* renamed from: a */
    public static lb2 m47753a(View view) {
        int i = R.id.btnCreateConnection;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.btnCreateConnection);
        if (materialButton != null) {
            i = R.id.ccWrapperWalletConnect;
            MaterialCardView materialCardView = (MaterialCardView) ca7.m11819a(view, R.id.ccWrapperWalletConnect);
            if (materialCardView != null) {
                i = R.id.dividerTxtWcHeader;
                View a = ca7.m11819a(view, R.id.dividerTxtWcHeader);
                if (a != null) {
                    i = R.id.rvConnectedDapp;
                    RecyclerView recyclerView = (RecyclerView) ca7.m11819a(view, R.id.rvConnectedDapp);
                    if (recyclerView != null) {
                        i = R.id.toolbar;
                        View a2 = ca7.m11819a(view, R.id.toolbar);
                        if (a2 != null) {
                            b36 a3 = b36.m32346a(a2);
                            i = R.id.txtWcDetail;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) ca7.m11819a(view, R.id.txtWcDetail);
                            if (appCompatTextView != null) {
                                i = R.id.txtWcHeader;
                                MaterialTextView materialTextView = (MaterialTextView) ca7.m11819a(view, R.id.txtWcHeader);
                                if (materialTextView != null) {
                                    i = R.id.wrapperWalletConnect;
                                    CardView cardView = (CardView) ca7.m11819a(view, R.id.wrapperWalletConnect);
                                    if (cardView != null) {
                                        return new lb2((ConstraintLayout) view, materialButton, materialCardView, a, recyclerView, a3, appCompatTextView, materialTextView, cardView);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
