package p000;

import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import net.safemoon.androidwallet.R;

/* renamed from: v92 */
/* compiled from: FragmentGraphTradingViewBinding */
public final class v92 {

    /* renamed from: a */
    public final ConstraintLayout f34876a;

    /* renamed from: b */
    public final ImageView f34877b;

    /* renamed from: c */
    public final MaterialCheckBox f34878c;

    /* renamed from: d */
    public final MaterialCheckBox f34879d;

    /* renamed from: e */
    public final MaterialButton f34880e;

    /* renamed from: f */
    public final ImageView f34881f;

    /* renamed from: g */
    public final LinearLayout f34882g;

    /* renamed from: h */
    public final RelativeLayout f34883h;

    /* renamed from: i */
    public final LinearLayout f34884i;

    /* renamed from: j */
    public final LinearLayout f34885j;

    /* renamed from: k */
    public final View f34886k;

    /* renamed from: l */
    public final TextView f34887l;

    /* renamed from: m */
    public final TextView f34888m;

    /* renamed from: n */
    public final LinearLayout f34889n;

    /* renamed from: o */
    public final TextView f34890o;

    /* renamed from: p */
    public final TextView f34891p;

    /* renamed from: q */
    public final TextView f34892q;

    /* renamed from: r */
    public final TextView f34893r;

    /* renamed from: s */
    public final WebView f34894s;

    public v92(ConstraintLayout constraintLayout, ImageView imageView, MaterialCheckBox materialCheckBox, MaterialCheckBox materialCheckBox2, MaterialButton materialButton, ImageView imageView2, LinearLayout linearLayout, RelativeLayout relativeLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, View view, TextView textView, TextView textView2, LinearLayout linearLayout4, TextView textView3, TextView textView4, TextView textView5, TextView textView6, WebView webView) {
        this.f34876a = constraintLayout;
        this.f34877b = imageView;
        this.f34878c = materialCheckBox;
        this.f34879d = materialCheckBox2;
        this.f34880e = materialButton;
        this.f34881f = imageView2;
        this.f34882g = linearLayout;
        this.f34883h = relativeLayout;
        this.f34884i = linearLayout2;
        this.f34885j = linearLayout3;
        this.f34886k = view;
        this.f34887l = textView;
        this.f34888m = textView2;
        this.f34889n = linearLayout4;
        this.f34890o = textView3;
        this.f34891p = textView4;
        this.f34892q = textView5;
        this.f34893r = textView6;
        this.f34894s = webView;
    }

    /* renamed from: a */
    public static v92 m53308a(View view) {
        View view2 = view;
        int i = R.id.IvPercentDialog;
        ImageView imageView = (ImageView) ca7.m11819a(view2, R.id.IvPercentDialog);
        if (imageView != null) {
            i = R.id.chk_candle_graph_view;
            MaterialCheckBox materialCheckBox = (MaterialCheckBox) ca7.m11819a(view2, R.id.chk_candle_graph_view);
            if (materialCheckBox != null) {
                i = R.id.chk_full_screen;
                MaterialCheckBox materialCheckBox2 = (MaterialCheckBox) ca7.m11819a(view2, R.id.chk_full_screen);
                if (materialCheckBox2 != null) {
                    i = R.id.dialog_cross;
                    MaterialButton materialButton = (MaterialButton) ca7.m11819a(view2, R.id.dialog_cross);
                    if (materialButton != null) {
                        i = R.id.ivDialog;
                        ImageView imageView2 = (ImageView) ca7.m11819a(view2, R.id.ivDialog);
                        if (imageView2 != null) {
                            i = R.id.l1;
                            LinearLayout linearLayout = (LinearLayout) ca7.m11819a(view2, R.id.l1);
                            if (linearLayout != null) {
                                i = R.id.lSafemoon;
                                RelativeLayout relativeLayout = (RelativeLayout) ca7.m11819a(view2, R.id.lSafemoon);
                                if (relativeLayout != null) {
                                    i = R.id.llCaption;
                                    LinearLayout linearLayout2 = (LinearLayout) ca7.m11819a(view2, R.id.llCaption);
                                    if (linearLayout2 != null) {
                                        i = R.id.llStatus;
                                        LinearLayout linearLayout3 = (LinearLayout) ca7.m11819a(view2, R.id.llStatus);
                                        if (linearLayout3 != null) {
                                            i = R.id.loader;
                                            View a = ca7.m11819a(view2, R.id.loader);
                                            if (a != null) {
                                                i = R.id.loading;
                                                TextView textView = (TextView) ca7.m11819a(view2, R.id.loading);
                                                if (textView != null) {
                                                    i = R.id.providerLink;
                                                    TextView textView2 = (TextView) ca7.m11819a(view2, R.id.providerLink);
                                                    if (textView2 != null) {
                                                        i = R.id.tools;
                                                        LinearLayout linearLayout4 = (LinearLayout) ca7.m11819a(view2, R.id.tools);
                                                        if (linearLayout4 != null) {
                                                            i = R.id.tvBalanceDialog;
                                                            TextView textView3 = (TextView) ca7.m11819a(view2, R.id.tvBalanceDialog);
                                                            if (textView3 != null) {
                                                                i = R.id.tvNameDialog;
                                                                TextView textView4 = (TextView) ca7.m11819a(view2, R.id.tvNameDialog);
                                                                if (textView4 != null) {
                                                                    i = R.id.tvPercentDialog;
                                                                    TextView textView5 = (TextView) ca7.m11819a(view2, R.id.tvPercentDialog);
                                                                    if (textView5 != null) {
                                                                        i = R.id.tvPriceDialog;
                                                                        TextView textView6 = (TextView) ca7.m11819a(view2, R.id.tvPriceDialog);
                                                                        if (textView6 != null) {
                                                                            i = R.id.webView;
                                                                            WebView webView = (WebView) ca7.m11819a(view2, R.id.webView);
                                                                            if (webView != null) {
                                                                                return new v92((ConstraintLayout) view2, imageView, materialCheckBox, materialCheckBox2, materialButton, imageView2, linearLayout, relativeLayout, linearLayout2, linearLayout3, a, textView, textView2, linearLayout4, textView3, textView4, textView5, textView6, webView);
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
