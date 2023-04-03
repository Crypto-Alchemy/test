package p000;

import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import net.safemoon.androidwallet.R;

/* renamed from: pb2 */
/* compiled from: FragmentWalletConnectSmartContractCallBinding */
public final class pb2 {

    /* renamed from: a */
    public final ConstraintLayout f32637a;

    /* renamed from: b */
    public final MaterialButton f32638b;

    /* renamed from: c */
    public final MaterialCardView f32639c;

    /* renamed from: d */
    public final LinearLayoutCompat f32640d;

    /* renamed from: e */
    public final b36 f32641e;

    /* renamed from: f */
    public final MaterialTextView f32642f;

    /* renamed from: g */
    public final AppCompatTextView f32643g;

    /* renamed from: h */
    public final AppCompatTextView f32644h;

    /* renamed from: i */
    public final MaterialTextView f32645i;

    /* renamed from: j */
    public final MaterialTextView f32646j;

    /* renamed from: k */
    public final MaterialTextView f32647k;

    /* renamed from: l */
    public final MaterialTextView f32648l;

    /* renamed from: m */
    public final View f32649m;

    /* renamed from: n */
    public final WebView f32650n;

    public pb2(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialCardView materialCardView, LinearLayoutCompat linearLayoutCompat, b36 b36, MaterialTextView materialTextView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, MaterialTextView materialTextView5, View view, WebView webView) {
        this.f32637a = constraintLayout;
        this.f32638b = materialButton;
        this.f32639c = materialCardView;
        this.f32640d = linearLayoutCompat;
        this.f32641e = b36;
        this.f32642f = materialTextView;
        this.f32643g = appCompatTextView;
        this.f32644h = appCompatTextView2;
        this.f32645i = materialTextView2;
        this.f32646j = materialTextView3;
        this.f32647k = materialTextView4;
        this.f32648l = materialTextView5;
        this.f32649m = view;
        this.f32650n = webView;
    }

    /* renamed from: a */
    public static pb2 m49838a(View view) {
        View view2 = view;
        int i = R.id.btnConfirm;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view2, R.id.btnConfirm);
        if (materialButton != null) {
            i = R.id.ccNoteWrapper;
            MaterialCardView materialCardView = (MaterialCardView) ca7.m11819a(view2, R.id.ccNoteWrapper);
            if (materialCardView != null) {
                i = R.id.layoutMaxTotal;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ca7.m11819a(view2, R.id.layoutMaxTotal);
                if (linearLayoutCompat != null) {
                    i = R.id.toolbarWrapper;
                    View a = ca7.m11819a(view2, R.id.toolbarWrapper);
                    if (a != null) {
                        b36 a2 = b36.m32346a(a);
                        i = R.id.txtAssetName;
                        MaterialTextView materialTextView = (MaterialTextView) ca7.m11819a(view2, R.id.txtAssetName);
                        if (materialTextView != null) {
                            i = R.id.txtBalanceFiat;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) ca7.m11819a(view2, R.id.txtBalanceFiat);
                            if (appCompatTextView != null) {
                                i = R.id.txtBalanceNative;
                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ca7.m11819a(view2, R.id.txtBalanceNative);
                                if (appCompatTextView2 != null) {
                                    i = R.id.txtDAppLink;
                                    MaterialTextView materialTextView2 = (MaterialTextView) ca7.m11819a(view2, R.id.txtDAppLink);
                                    if (materialTextView2 != null) {
                                        i = R.id.txtMaxTotal;
                                        MaterialTextView materialTextView3 = (MaterialTextView) ca7.m11819a(view2, R.id.txtMaxTotal);
                                        if (materialTextView3 != null) {
                                            i = R.id.txtNetWorkFee;
                                            MaterialTextView materialTextView4 = (MaterialTextView) ca7.m11819a(view2, R.id.txtNetWorkFee);
                                            if (materialTextView4 != null) {
                                                i = R.id.txtWalletName;
                                                MaterialTextView materialTextView5 = (MaterialTextView) ca7.m11819a(view2, R.id.txtWalletName);
                                                if (materialTextView5 != null) {
                                                    i = R.id.viewFeeDivider;
                                                    View a3 = ca7.m11819a(view2, R.id.viewFeeDivider);
                                                    if (a3 != null) {
                                                        i = R.id.webViewForSimulateTransaction;
                                                        WebView webView = (WebView) ca7.m11819a(view2, R.id.webViewForSimulateTransaction);
                                                        if (webView != null) {
                                                            return new pb2((ConstraintLayout) view2, materialButton, materialCardView, linearLayoutCompat, a2, materialTextView, appCompatTextView, appCompatTextView2, materialTextView2, materialTextView3, materialTextView4, materialTextView5, a3, webView);
                                                        }
                                                    }
                                                }
                                            }
                                        }
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
