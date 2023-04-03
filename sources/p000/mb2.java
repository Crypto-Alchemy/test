package p000;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import net.safemoon.androidwallet.R;

/* renamed from: mb2 */
/* compiled from: FragmentWalletConnectDetailBinding */
public final class mb2 {

    /* renamed from: a */
    public final ConstraintLayout f31623a;

    /* renamed from: b */
    public final MaterialButton f31624b;

    /* renamed from: c */
    public final CardView f31625c;

    /* renamed from: d */
    public final CardView f31626d;

    /* renamed from: e */
    public final CardView f31627e;

    /* renamed from: f */
    public final View f31628f;

    /* renamed from: g */
    public final View f31629g;

    /* renamed from: h */
    public final View f31630h;

    /* renamed from: i */
    public final View f31631i;

    /* renamed from: j */
    public final AppCompatImageView f31632j;

    /* renamed from: k */
    public final AppCompatImageView f31633k;

    /* renamed from: l */
    public final mm2 f31634l;

    /* renamed from: m */
    public final b36 f31635m;

    /* renamed from: n */
    public final TextView f31636n;

    /* renamed from: o */
    public final TextView f31637o;

    /* renamed from: p */
    public final TextView f31638p;

    /* renamed from: q */
    public final TextView f31639q;

    /* renamed from: r */
    public final TextView f31640r;

    /* renamed from: s */
    public final TextView f31641s;

    /* renamed from: t */
    public final MaterialTextView f31642t;

    /* renamed from: u */
    public final TextView f31643u;

    /* renamed from: v */
    public final ConstraintLayout f31644v;

    /* renamed from: w */
    public final ConstraintLayout f31645w;

    public mb2(ConstraintLayout constraintLayout, MaterialButton materialButton, CardView cardView, CardView cardView2, CardView cardView3, View view, View view2, View view3, View view4, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, mm2 mm2, b36 b36, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, MaterialTextView materialTextView, TextView textView7, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3) {
        this.f31623a = constraintLayout;
        this.f31624b = materialButton;
        this.f31625c = cardView;
        this.f31626d = cardView2;
        this.f31627e = cardView3;
        this.f31628f = view;
        this.f31629g = view2;
        this.f31630h = view3;
        this.f31631i = view4;
        this.f31632j = appCompatImageView;
        this.f31633k = appCompatImageView2;
        this.f31634l = mm2;
        this.f31635m = b36;
        this.f31636n = textView;
        this.f31637o = textView2;
        this.f31638p = textView3;
        this.f31639q = textView4;
        this.f31640r = textView5;
        this.f31641s = textView6;
        this.f31642t = materialTextView;
        this.f31643u = textView7;
        this.f31644v = constraintLayout2;
        this.f31645w = constraintLayout3;
    }

    /* renamed from: a */
    public static mb2 m48209a(View view) {
        View view2 = view;
        int i = R.id.btnDisconnect;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view2, R.id.btnDisconnect);
        if (materialButton != null) {
            i = R.id.cvConnected;
            CardView cardView = (CardView) ca7.m11819a(view2, R.id.cvConnected);
            if (cardView != null) {
                i = R.id.cvNetwork;
                CardView cardView2 = (CardView) ca7.m11819a(view2, R.id.cvNetwork);
                if (cardView2 != null) {
                    i = R.id.cvWallet;
                    CardView cardView3 = (CardView) ca7.m11819a(view2, R.id.cvWallet);
                    if (cardView3 != null) {
                        i = R.id.dividerHeaderConnected;
                        View a = ca7.m11819a(view2, R.id.dividerHeaderConnected);
                        if (a != null) {
                            i = R.id.dividerHeaderNetwork;
                            View a2 = ca7.m11819a(view2, R.id.dividerHeaderNetwork);
                            if (a2 != null) {
                                i = R.id.dividerHeaderWallet;
                                View a3 = ca7.m11819a(view2, R.id.dividerHeaderWallet);
                                if (a3 != null) {
                                    i = R.id.dividerHeaderWalletAddress;
                                    View a4 = ca7.m11819a(view2, R.id.dividerHeaderWalletAddress);
                                    if (a4 != null) {
                                        i = R.id.imgIconNote;
                                        AppCompatImageView appCompatImageView = (AppCompatImageView) ca7.m11819a(view2, R.id.imgIconNote);
                                        if (appCompatImageView != null) {
                                            i = R.id.imgNetwork;
                                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ca7.m11819a(view2, R.id.imgNetwork);
                                            if (appCompatImageView2 != null) {
                                                i = R.id.include_dapp;
                                                View a5 = ca7.m11819a(view2, R.id.include_dapp);
                                                if (a5 != null) {
                                                    mm2 a6 = mm2.m48368a(a5);
                                                    i = R.id.toolbar;
                                                    View a7 = ca7.m11819a(view2, R.id.toolbar);
                                                    if (a7 != null) {
                                                        b36 a8 = b36.m32346a(a7);
                                                        i = R.id.txtConnectAt;
                                                        TextView textView = (TextView) ca7.m11819a(view2, R.id.txtConnectAt);
                                                        if (textView != null) {
                                                            i = R.id.txtHeaderConnected;
                                                            TextView textView2 = (TextView) ca7.m11819a(view2, R.id.txtHeaderConnected);
                                                            if (textView2 != null) {
                                                                i = R.id.txtHeaderNetwork;
                                                                TextView textView3 = (TextView) ca7.m11819a(view2, R.id.txtHeaderNetwork);
                                                                if (textView3 != null) {
                                                                    i = R.id.txtHeaderWallet;
                                                                    TextView textView4 = (TextView) ca7.m11819a(view2, R.id.txtHeaderWallet);
                                                                    if (textView4 != null) {
                                                                        i = R.id.txtHeaderWalletAddress;
                                                                        TextView textView5 = (TextView) ca7.m11819a(view2, R.id.txtHeaderWalletAddress);
                                                                        if (textView5 != null) {
                                                                            i = R.id.txtNetwork;
                                                                            TextView textView6 = (TextView) ca7.m11819a(view2, R.id.txtNetwork);
                                                                            if (textView6 != null) {
                                                                                i = R.id.txtWalletAddressName;
                                                                                MaterialTextView materialTextView = (MaterialTextView) ca7.m11819a(view2, R.id.txtWalletAddressName);
                                                                                if (materialTextView != null) {
                                                                                    i = R.id.txtWalletName;
                                                                                    TextView textView7 = (TextView) ca7.m11819a(view2, R.id.txtWalletName);
                                                                                    if (textView7 != null) {
                                                                                        i = R.id.walletAddressTitleWrapper;
                                                                                        ConstraintLayout constraintLayout = (ConstraintLayout) ca7.m11819a(view2, R.id.walletAddressTitleWrapper);
                                                                                        if (constraintLayout != null) {
                                                                                            i = R.id.walletTitleWrapper;
                                                                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ca7.m11819a(view2, R.id.walletTitleWrapper);
                                                                                            if (constraintLayout2 != null) {
                                                                                                return new mb2((ConstraintLayout) view2, materialButton, cardView, cardView2, cardView3, a, a2, a3, a4, appCompatImageView, appCompatImageView2, a6, a8, textView, textView2, textView3, textView4, textView5, textView6, materialTextView, textView7, constraintLayout, constraintLayout2);
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
