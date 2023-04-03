package p000;

import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import net.safemoon.androidwallet.R;

/* renamed from: r92 */
/* compiled from: FragmentFullScreenWebViewBinding */
public final class r92 {

    /* renamed from: a */
    public final ConstraintLayout f33364a;

    /* renamed from: b */
    public final AppCompatButton f33365b;

    /* renamed from: c */
    public final ConstraintLayout f33366c;

    /* renamed from: d */
    public final LinearLayout f33367d;

    /* renamed from: e */
    public final ProgressBar f33368e;

    /* renamed from: f */
    public final b36 f33369f;

    /* renamed from: g */
    public final WebView f33370g;

    public r92(ConstraintLayout constraintLayout, AppCompatButton appCompatButton, ConstraintLayout constraintLayout2, LinearLayout linearLayout, ProgressBar progressBar, b36 b36, WebView webView) {
        this.f33364a = constraintLayout;
        this.f33365b = appCompatButton;
        this.f33366c = constraintLayout2;
        this.f33367d = linearLayout;
        this.f33368e = progressBar;
        this.f33369f = b36;
        this.f33370g = webView;
    }

    /* renamed from: a */
    public static r92 m50998a(View view) {
        int i = R.id.btnTryAgain;
        AppCompatButton appCompatButton = (AppCompatButton) ca7.m11819a(view, R.id.btnTryAgain);
        if (appCompatButton != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.lErrorMsgContainer;
            LinearLayout linearLayout = (LinearLayout) ca7.m11819a(view, R.id.lErrorMsgContainer);
            if (linearLayout != null) {
                i = R.id.pbContentLoading;
                ProgressBar progressBar = (ProgressBar) ca7.m11819a(view, R.id.pbContentLoading);
                if (progressBar != null) {
                    i = R.id.toolbar;
                    View a = ca7.m11819a(view, R.id.toolbar);
                    if (a != null) {
                        b36 a2 = b36.m32346a(a);
                        i = R.id.wvContent;
                        WebView webView = (WebView) ca7.m11819a(view, R.id.wvContent);
                        if (webView != null) {
                            return new r92(constraintLayout, appCompatButton, constraintLayout, linearLayout, progressBar, a2, webView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public ConstraintLayout mo47349b() {
        return this.f33364a;
    }
}
