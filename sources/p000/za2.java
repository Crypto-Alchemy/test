package p000;

import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import net.safemoon.androidwallet.R;

/* renamed from: za2 */
/* compiled from: FragmentTermScreenWebViewBinding */
public final class za2 {

    /* renamed from: a */
    public final ConstraintLayout f36078a;

    /* renamed from: b */
    public final AppCompatButton f36079b;

    /* renamed from: c */
    public final ConstraintLayout f36080c;

    /* renamed from: d */
    public final LinearLayout f36081d;

    /* renamed from: e */
    public final ProgressBar f36082e;

    /* renamed from: f */
    public final b36 f36083f;

    /* renamed from: g */
    public final WebView f36084g;

    public za2(ConstraintLayout constraintLayout, AppCompatButton appCompatButton, ConstraintLayout constraintLayout2, LinearLayout linearLayout, ProgressBar progressBar, b36 b36, WebView webView) {
        this.f36078a = constraintLayout;
        this.f36079b = appCompatButton;
        this.f36080c = constraintLayout2;
        this.f36081d = linearLayout;
        this.f36082e = progressBar;
        this.f36083f = b36;
        this.f36084g = webView;
    }

    /* renamed from: a */
    public static za2 m55038a(View view) {
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
                            return new za2(constraintLayout, appCompatButton, constraintLayout, linearLayout, progressBar, a2, webView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public ConstraintLayout mo49813b() {
        return this.f36078a;
    }
}
