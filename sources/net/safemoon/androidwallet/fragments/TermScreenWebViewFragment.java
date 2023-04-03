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

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 #2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b!\u0010\"J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\b\u0010\u000f\u001a\u00020\u000bH\u0002R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001e¨\u0006%"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/TermScreenWebViewFragment;", "Lbz;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lr37;", "onViewCreated", "r", "t", "q", "Lza2;", "d", "Lza2;", "binding", "", "e", "I", "titleResId", "", "g", "Ljava/lang/String;", "loadUrl", "", "k", "Z", "withBottomPadding", "isPageLoaded", "<init>", "()V", "s", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: TermScreenWebViewFragment.kt */
public final class TermScreenWebViewFragment extends C6912bz {

    /* renamed from: s */
    public static final C8483a f42224s = new C8483a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public za2 f42225d;

    /* renamed from: e */
    public int f42226e;

    /* renamed from: g */
    public String f42227g = "";

    /* renamed from: k */
    public boolean f42228k;

    /* renamed from: r */
    public boolean f42229r;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/TermScreenWebViewFragment$a;", "", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.TermScreenWebViewFragment$a */
    /* compiled from: TermScreenWebViewFragment.kt */
    public static final class C8483a {
        public C8483a() {
        }

        public /* synthetic */ C8483a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001c\u0010\f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u001c\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u000f"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/TermScreenWebViewFragment$b", "Landroid/webkit/WebViewClient;", "Landroid/webkit/WebView;", "view", "Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceError;", "error", "Lr37;", "onReceivedError", "", "url", "onPageCommitVisible", "", "shouldOverrideUrlLoading", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.TermScreenWebViewFragment$b */
    /* compiled from: TermScreenWebViewFragment.kt */
    public static final class C8484b extends WebViewClient {

        /* renamed from: a */
        public final /* synthetic */ TermScreenWebViewFragment f42230a;

        public C8484b(TermScreenWebViewFragment termScreenWebViewFragment) {
            this.f42230a = termScreenWebViewFragment;
        }

        public void onPageCommitVisible(WebView webView, String str) {
            ProgressBar progressBar;
            LinearLayout linearLayout;
            super.onPageCommitVisible(webView, str);
            this.f42230a.f42229r = true;
            super.onPageFinished(webView, str);
            za2 n = this.f42230a.f42225d;
            WebView webView2 = null;
            if (n != null) {
                progressBar = n.f36082e;
            } else {
                progressBar = null;
            }
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            za2 n2 = this.f42230a.f42225d;
            if (n2 != null) {
                linearLayout = n2.f36081d;
            } else {
                linearLayout = null;
            }
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            za2 n3 = this.f42230a.f42225d;
            if (n3 != null) {
                webView2 = n3.f36084g;
            }
            if (webView2 != null) {
                webView2.setVisibility(0);
            }
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            LinearLayout linearLayout;
            ProgressBar progressBar;
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (!this.f42230a.f42229r) {
                za2 n = this.f42230a.f42225d;
                WebView webView2 = null;
                if (n != null) {
                    linearLayout = n.f36081d;
                } else {
                    linearLayout = null;
                }
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                za2 n2 = this.f42230a.f42225d;
                if (n2 != null) {
                    progressBar = n2.f36082e;
                } else {
                    progressBar = null;
                }
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                }
                za2 n3 = this.f42230a.f42225d;
                if (n3 != null) {
                    webView2 = n3.f36084g;
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
    public static final void m67477s(TermScreenWebViewFragment termScreenWebViewFragment, View view) {
        vx2.m53591g(termScreenWebViewFragment, "this$0");
        termScreenWebViewFragment.mo50752i();
    }

    /* renamed from: u */
    public static final void m67478u(TermScreenWebViewFragment termScreenWebViewFragment, View view) {
        LinearLayout linearLayout;
        vx2.m53591g(termScreenWebViewFragment, "this$0");
        za2 za2 = termScreenWebViewFragment.f42225d;
        ProgressBar progressBar = null;
        if (za2 != null) {
            linearLayout = za2.f36081d;
        } else {
            linearLayout = null;
        }
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        za2 za22 = termScreenWebViewFragment.f42225d;
        if (za22 != null) {
            progressBar = za22.f36082e;
        }
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        termScreenWebViewFragment.mo57847q();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        this.f42225d = za2.m55038a(layoutInflater.inflate(R.layout.fragment_term_screen_web_view, viewGroup, false));
        if (getArguments() == null || requireArguments().get("url") == null || requireArguments().get("titleResId") == null || requireArguments().get("withBottomPadding") == null) {
            throw new NullPointerException("Arguments shouldn't be null");
        }
        this.f42226e = requireArguments().getInt("titleResId");
        String string = requireArguments().getString("url");
        vx2.m53588d(string);
        this.f42227g = string;
        this.f42228k = requireArguments().getBoolean("withBottomPadding");
        za2 za2 = this.f42225d;
        vx2.m53588d(za2);
        ConstraintLayout b = za2.mo49813b();
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
        mo57848r();
        mo57849t();
        mo57847q();
    }

    /* renamed from: q */
    public final void mo57847q() {
        WebView webView;
        WebView webView2;
        za2 za2 = this.f42225d;
        if (!(za2 == null || (webView2 = za2.f36084g) == null)) {
            webView2.loadUrl(this.f42227g);
        }
        try {
            za2 za22 = this.f42225d;
            if (za22 != null && (webView = za22.f36084g) != null) {
                webView.loadUrl(this.f42227g);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: r */
    public final void mo57848r() {
        za2 za2 = this.f42225d;
        vx2.m53588d(za2);
        za2.f36083f.f21125c.setOnClickListener(new wm6(this));
        za2 za22 = this.f42225d;
        vx2.m53588d(za22);
        za22.f36083f.f21127e.setText(getResources().getText(this.f42226e));
    }

    /* renamed from: t */
    public final void mo57849t() {
        za2 za2 = this.f42225d;
        vx2.m53588d(za2);
        WebView webView = za2.f36084g;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setSupportZoom(false);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.setWebViewClient(new C8484b(this));
        za2 za22 = this.f42225d;
        vx2.m53588d(za22);
        za22.f36079b.setOnClickListener(new xm6(this));
    }
}
