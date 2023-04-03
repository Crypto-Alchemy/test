package net.safemoon.androidwallet.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.R;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 #2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b!\u0010\"J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\b\u0010\u000f\u001a\u00020\u000bH\u0002R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001e¨\u0006%"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/FullScreenWebViewFragment;", "Lbz;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lr37;", "onViewCreated", "r", "t", "q", "Lr92;", "d", "Lr92;", "binding", "", "e", "I", "titleResId", "", "g", "Ljava/lang/String;", "loadUrl", "", "k", "Z", "withBottomPadding", "isPageLoaded", "<init>", "()V", "s", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: FullScreenWebViewFragment.kt */
public final class FullScreenWebViewFragment extends C6912bz {

    /* renamed from: s */
    public static final C8389a f41947s = new C8389a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public r92 f41948d;

    /* renamed from: e */
    public int f41949e;

    /* renamed from: g */
    public String f41950g = "";

    /* renamed from: k */
    public boolean f41951k;

    /* renamed from: r */
    public boolean f41952r;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\f"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/FullScreenWebViewFragment$a;", "", "", "url", "", "titleResId", "", "withBottomPadding", "Lnet/safemoon/androidwallet/fragments/FullScreenWebViewFragment;", "a", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.FullScreenWebViewFragment$a */
    /* compiled from: FullScreenWebViewFragment.kt */
    public static final class C8389a {
        public C8389a() {
        }

        public /* synthetic */ C8389a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final FullScreenWebViewFragment mo57487a(String str, int i, boolean z) {
            vx2.m53591g(str, "url");
            FullScreenWebViewFragment fullScreenWebViewFragment = new FullScreenWebViewFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("titleResId", i);
            bundle.putString("url", str);
            bundle.putBoolean("withBottomPadding", z);
            fullScreenWebViewFragment.setArguments(bundle);
            return fullScreenWebViewFragment;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001c\u0010\f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u001c\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u000f"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/FullScreenWebViewFragment$b", "Landroid/webkit/WebViewClient;", "Landroid/webkit/WebView;", "view", "Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceError;", "error", "Lr37;", "onReceivedError", "", "url", "onPageCommitVisible", "", "shouldOverrideUrlLoading", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.FullScreenWebViewFragment$b */
    /* compiled from: FullScreenWebViewFragment.kt */
    public static final class C8390b extends WebViewClient {

        /* renamed from: a */
        public final /* synthetic */ FullScreenWebViewFragment f41953a;

        public C8390b(FullScreenWebViewFragment fullScreenWebViewFragment) {
            this.f41953a = fullScreenWebViewFragment;
        }

        public void onPageCommitVisible(WebView webView, String str) {
            ProgressBar progressBar;
            LinearLayout linearLayout;
            super.onPageCommitVisible(webView, str);
            this.f41953a.f41952r = true;
            super.onPageFinished(webView, str);
            r92 n = this.f41953a.f41948d;
            WebView webView2 = null;
            if (n != null) {
                progressBar = n.f33368e;
            } else {
                progressBar = null;
            }
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            r92 n2 = this.f41953a.f41948d;
            if (n2 != null) {
                linearLayout = n2.f33367d;
            } else {
                linearLayout = null;
            }
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            r92 n3 = this.f41953a.f41948d;
            if (n3 != null) {
                webView2 = n3.f33370g;
            }
            if (webView2 != null) {
                webView2.setVisibility(0);
            }
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            LinearLayout linearLayout;
            ProgressBar progressBar;
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (!this.f41953a.f41952r) {
                r92 n = this.f41953a.f41948d;
                WebView webView2 = null;
                if (n != null) {
                    linearLayout = n.f33367d;
                } else {
                    linearLayout = null;
                }
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                r92 n2 = this.f41953a.f41948d;
                if (n2 != null) {
                    progressBar = n2.f33368e;
                } else {
                    progressBar = null;
                }
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                }
                r92 n3 = this.f41953a.f41948d;
                if (n3 != null) {
                    webView2 = n3.f33370g;
                }
                if (webView2 != null) {
                    webView2.setVisibility(8);
                }
            }
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return true;
        }
    }

    /* renamed from: s */
    public static final void m66564s(FullScreenWebViewFragment fullScreenWebViewFragment, View view) {
        vx2.m53591g(fullScreenWebViewFragment, "this$0");
        fullScreenWebViewFragment.mo50752i();
    }

    /* renamed from: u */
    public static final void m66565u(FullScreenWebViewFragment fullScreenWebViewFragment, View view) {
        LinearLayout linearLayout;
        vx2.m53591g(fullScreenWebViewFragment, "this$0");
        r92 r92 = fullScreenWebViewFragment.f41948d;
        ProgressBar progressBar = null;
        if (r92 != null) {
            linearLayout = r92.f33367d;
        } else {
            linearLayout = null;
        }
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        r92 r922 = fullScreenWebViewFragment.f41948d;
        if (r922 != null) {
            progressBar = r922.f33368e;
        }
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        fullScreenWebViewFragment.mo57484q();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        this.f41948d = r92.m50998a(layoutInflater.inflate(R.layout.fragment_full_screen_web_view, viewGroup, false));
        if (getArguments() == null || requireArguments().get("url") == null || requireArguments().get("titleResId") == null || requireArguments().get("withBottomPadding") == null) {
            throw new NullPointerException("Arguments shouldn't be null");
        }
        this.f41949e = requireArguments().getInt("titleResId");
        String string = requireArguments().getString("url");
        vx2.m53588d(string);
        this.f41950g = string;
        this.f41951k = requireArguments().getBoolean("withBottomPadding");
        r92 r92 = this.f41948d;
        vx2.m53588d(r92);
        ConstraintLayout b = r92.mo47349b();
        vx2.m53590f(b, "binding!!.root");
        return b;
    }

    public void onViewCreated(View view, Bundle bundle) {
        vx2.m53591g(view, "view");
        try {
            super.onViewCreated(view, bundle);
        } catch (Exception e) {
            e.printStackTrace();
        }
        mo57485r();
        mo57486t();
        mo57484q();
    }

    /* renamed from: q */
    public final void mo57484q() {
        WebView webView;
        WebView webView2;
        r92 r92 = this.f41948d;
        if (!(r92 == null || (webView2 = r92.f33370g) == null)) {
            webView2.loadUrl(this.f41950g);
        }
        try {
            r92 r922 = this.f41948d;
            if (r922 != null && (webView = r922.f33370g) != null) {
                webView.loadUrl(this.f41950g);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: r */
    public final void mo57485r() {
        r92 r92 = this.f41948d;
        vx2.m53588d(r92);
        r92.f33369f.f21125c.setOnClickListener(new nc2(this));
        r92 r922 = this.f41948d;
        vx2.m53588d(r922);
        r922.f33369f.f21127e.setText(getResources().getText(this.f41949e));
    }

    /* renamed from: t */
    public final void mo57486t() {
        r92 r92 = this.f41948d;
        vx2.m53588d(r92);
        WebView webView = r92.f33370g;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setSupportZoom(false);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.setWebViewClient(new C8390b(this));
        r92 r922 = this.f41948d;
        vx2.m53588d(r922);
        r922.f33365b.setOnClickListener(new oc2(this));
    }
}
