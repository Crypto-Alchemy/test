package p000;

import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.mikephil.charting.charts.CandleStickChart;
import com.github.mikephil.charting.charts.LineChart;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import net.safemoon.androidwallet.R;

/* renamed from: qi2 */
/* compiled from: GraphDialogBinding */
public final class qi2 {

    /* renamed from: A */
    public final TextView f33110A;

    /* renamed from: B */
    public final TextView f33111B;

    /* renamed from: C */
    public final TextView f33112C;

    /* renamed from: D */
    public final WebView f33113D;

    /* renamed from: a */
    public final ConstraintLayout f33114a;

    /* renamed from: b */
    public final ImageView f33115b;

    /* renamed from: c */
    public final ImageView f33116c;

    /* renamed from: d */
    public final AppCompatButton f33117d;

    /* renamed from: e */
    public final AppCompatButton f33118e;

    /* renamed from: f */
    public final AppCompatButton f33119f;

    /* renamed from: g */
    public final AppCompatButton f33120g;

    /* renamed from: h */
    public final AppCompatButton f33121h;

    /* renamed from: i */
    public final AppCompatButton f33122i;

    /* renamed from: j */
    public final CandleStickChart f33123j;

    /* renamed from: k */
    public final MaterialCheckBox f33124k;

    /* renamed from: l */
    public final MaterialCheckBox f33125l;

    /* renamed from: m */
    public final MaterialButton f33126m;

    /* renamed from: n */
    public final LinearLayout f33127n;

    /* renamed from: o */
    public final ImageView f33128o;

    /* renamed from: p */
    public final LinearLayout f33129p;

    /* renamed from: q */
    public final RelativeLayout f33130q;

    /* renamed from: r */
    public final LineChart f33131r;

    /* renamed from: s */
    public final LinearLayout f33132s;

    /* renamed from: t */
    public final LinearLayout f33133t;

    /* renamed from: u */
    public final LinearLayout f33134u;

    /* renamed from: v */
    public final TextView f33135v;

    /* renamed from: w */
    public final TextView f33136w;

    /* renamed from: x */
    public final TextView f33137x;

    /* renamed from: y */
    public final TextView f33138y;

    /* renamed from: z */
    public final TextView f33139z;

    public qi2(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, AppCompatButton appCompatButton3, AppCompatButton appCompatButton4, AppCompatButton appCompatButton5, AppCompatButton appCompatButton6, CandleStickChart candleStickChart, MaterialCheckBox materialCheckBox, MaterialCheckBox materialCheckBox2, MaterialButton materialButton, LinearLayout linearLayout, ImageView imageView3, LinearLayout linearLayout2, RelativeLayout relativeLayout, LineChart lineChart, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, WebView webView) {
        this.f33114a = constraintLayout;
        this.f33115b = imageView;
        this.f33116c = imageView2;
        this.f33117d = appCompatButton;
        this.f33118e = appCompatButton2;
        this.f33119f = appCompatButton3;
        this.f33120g = appCompatButton4;
        this.f33121h = appCompatButton5;
        this.f33122i = appCompatButton6;
        this.f33123j = candleStickChart;
        this.f33124k = materialCheckBox;
        this.f33125l = materialCheckBox2;
        this.f33126m = materialButton;
        this.f33127n = linearLayout;
        this.f33128o = imageView3;
        this.f33129p = linearLayout2;
        this.f33130q = relativeLayout;
        this.f33131r = lineChart;
        this.f33132s = linearLayout3;
        this.f33133t = linearLayout4;
        this.f33134u = linearLayout5;
        this.f33135v = textView;
        this.f33136w = textView2;
        this.f33137x = textView3;
        this.f33138y = textView4;
        this.f33139z = textView5;
        this.f33110A = textView6;
        this.f33111B = textView7;
        this.f33112C = textView8;
        this.f33113D = webView;
    }

    /* renamed from: a */
    public static qi2 m50600a(View view) {
        View view2 = view;
        int i = R.id.IvPercentDialog;
        ImageView imageView = (ImageView) ca7.m11819a(view2, R.id.IvPercentDialog);
        if (imageView != null) {
            i = R.id.IvPercentDialog_1;
            ImageView imageView2 = (ImageView) ca7.m11819a(view2, R.id.IvPercentDialog_1);
            if (imageView2 != null) {
                i = R.id.btn12Hours;
                AppCompatButton appCompatButton = (AppCompatButton) ca7.m11819a(view2, R.id.btn12Hours);
                if (appCompatButton != null) {
                    i = R.id.btn1Day;
                    AppCompatButton appCompatButton2 = (AppCompatButton) ca7.m11819a(view2, R.id.btn1Day);
                    if (appCompatButton2 != null) {
                        i = R.id.btn1Month;
                        AppCompatButton appCompatButton3 = (AppCompatButton) ca7.m11819a(view2, R.id.btn1Month);
                        if (appCompatButton3 != null) {
                            i = R.id.btn1Week;
                            AppCompatButton appCompatButton4 = (AppCompatButton) ca7.m11819a(view2, R.id.btn1Week);
                            if (appCompatButton4 != null) {
                                i = R.id.btn3Months;
                                AppCompatButton appCompatButton5 = (AppCompatButton) ca7.m11819a(view2, R.id.btn3Months);
                                if (appCompatButton5 != null) {
                                    i = R.id.btn6Months;
                                    AppCompatButton appCompatButton6 = (AppCompatButton) ca7.m11819a(view2, R.id.btn6Months);
                                    if (appCompatButton6 != null) {
                                        i = R.id.candle_stick_chart;
                                        CandleStickChart candleStickChart = (CandleStickChart) ca7.m11819a(view2, R.id.candle_stick_chart);
                                        if (candleStickChart != null) {
                                            i = R.id.chk_candle_graph_view;
                                            MaterialCheckBox materialCheckBox = (MaterialCheckBox) ca7.m11819a(view2, R.id.chk_candle_graph_view);
                                            if (materialCheckBox != null) {
                                                i = R.id.chk_full_screen;
                                                MaterialCheckBox materialCheckBox2 = (MaterialCheckBox) ca7.m11819a(view2, R.id.chk_full_screen);
                                                if (materialCheckBox2 != null) {
                                                    i = R.id.dialog_cross;
                                                    MaterialButton materialButton = (MaterialButton) ca7.m11819a(view2, R.id.dialog_cross);
                                                    if (materialButton != null) {
                                                        i = R.id.header;
                                                        LinearLayout linearLayout = (LinearLayout) ca7.m11819a(view2, R.id.header);
                                                        if (linearLayout != null) {
                                                            i = R.id.ivDialog;
                                                            ImageView imageView3 = (ImageView) ca7.m11819a(view2, R.id.ivDialog);
                                                            if (imageView3 != null) {
                                                                i = R.id.l1;
                                                                LinearLayout linearLayout2 = (LinearLayout) ca7.m11819a(view2, R.id.l1);
                                                                if (linearLayout2 != null) {
                                                                    i = R.id.lSafemoon;
                                                                    RelativeLayout relativeLayout = (RelativeLayout) ca7.m11819a(view2, R.id.lSafemoon);
                                                                    if (relativeLayout != null) {
                                                                        i = R.id.line_stick_chart;
                                                                        LineChart lineChart = (LineChart) ca7.m11819a(view2, R.id.line_stick_chart);
                                                                        if (lineChart != null) {
                                                                            i = R.id.llCaption;
                                                                            LinearLayout linearLayout3 = (LinearLayout) ca7.m11819a(view2, R.id.llCaption);
                                                                            if (linearLayout3 != null) {
                                                                                i = R.id.llStatus;
                                                                                LinearLayout linearLayout4 = (LinearLayout) ca7.m11819a(view2, R.id.llStatus);
                                                                                if (linearLayout4 != null) {
                                                                                    i = R.id.llStatus_1;
                                                                                    LinearLayout linearLayout5 = (LinearLayout) ca7.m11819a(view2, R.id.llStatus_1);
                                                                                    if (linearLayout5 != null) {
                                                                                        i = R.id.providerLabel;
                                                                                        TextView textView = (TextView) ca7.m11819a(view2, R.id.providerLabel);
                                                                                        if (textView != null) {
                                                                                            i = R.id.providerLink;
                                                                                            TextView textView2 = (TextView) ca7.m11819a(view2, R.id.providerLink);
                                                                                            if (textView2 != null) {
                                                                                                i = R.id.tvBalanceDialog;
                                                                                                TextView textView3 = (TextView) ca7.m11819a(view2, R.id.tvBalanceDialog);
                                                                                                if (textView3 != null) {
                                                                                                    i = R.id.tvBalanceDialog_1;
                                                                                                    TextView textView4 = (TextView) ca7.m11819a(view2, R.id.tvBalanceDialog_1);
                                                                                                    if (textView4 != null) {
                                                                                                        i = R.id.tvNameDialog;
                                                                                                        TextView textView5 = (TextView) ca7.m11819a(view2, R.id.tvNameDialog);
                                                                                                        if (textView5 != null) {
                                                                                                            i = R.id.tvPercentDialog;
                                                                                                            TextView textView6 = (TextView) ca7.m11819a(view2, R.id.tvPercentDialog);
                                                                                                            if (textView6 != null) {
                                                                                                                i = R.id.tvPercentDialog_1;
                                                                                                                TextView textView7 = (TextView) ca7.m11819a(view2, R.id.tvPercentDialog_1);
                                                                                                                if (textView7 != null) {
                                                                                                                    i = R.id.tvPriceDialog;
                                                                                                                    TextView textView8 = (TextView) ca7.m11819a(view2, R.id.tvPriceDialog);
                                                                                                                    if (textView8 != null) {
                                                                                                                        i = R.id.web_view_chart;
                                                                                                                        WebView webView = (WebView) ca7.m11819a(view2, R.id.web_view_chart);
                                                                                                                        if (webView != null) {
                                                                                                                            return new qi2((ConstraintLayout) view2, imageView, imageView2, appCompatButton, appCompatButton2, appCompatButton3, appCompatButton4, appCompatButton5, appCompatButton6, candleStickChart, materialCheckBox, materialCheckBox2, materialButton, linearLayout, imageView3, linearLayout2, relativeLayout, lineChart, linearLayout3, linearLayout4, linearLayout5, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, webView);
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
