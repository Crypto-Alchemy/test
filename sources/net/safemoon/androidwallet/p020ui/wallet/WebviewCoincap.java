package net.safemoon.androidwallet.p020ui.wallet;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.C0147a;
import java.io.IOException;
import net.safemoon.androidwallet.R;

/* renamed from: net.safemoon.androidwallet.ui.wallet.WebviewCoincap */
public class WebviewCoincap extends AppCompatActivity {

    /* renamed from: a */
    public WebView f42564a;

    /* renamed from: d */
    public ProgressBar f42565d;

    /* renamed from: net.safemoon.androidwallet.ui.wallet.WebviewCoincap$a */
    public class C8629a extends WebViewClient {

        /* renamed from: net.safemoon.androidwallet.ui.wallet.WebviewCoincap$a$a */
        public class C8630a implements DialogInterface.OnClickListener {

            /* renamed from: a */
            public final /* synthetic */ SslErrorHandler f42567a;

            public C8630a(SslErrorHandler sslErrorHandler) {
                this.f42567a = sslErrorHandler;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                this.f42567a.proceed();
            }
        }

        /* renamed from: net.safemoon.androidwallet.ui.wallet.WebviewCoincap$a$b */
        public class C8631b implements DialogInterface.OnClickListener {

            /* renamed from: a */
            public final /* synthetic */ SslErrorHandler f42569a;

            public C8631b(SslErrorHandler sslErrorHandler) {
                this.f42569a = sslErrorHandler;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                this.f42569a.cancel();
            }
        }

        public C8629a() {
        }

        public void onPageFinished(WebView webView, String str) {
            WebviewCoincap.this.f42565d.setVisibility(8);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            WebviewCoincap.this.f42565d.setVisibility(0);
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            C0147a.C0148a aVar = new C0147a.C0148a(WebviewCoincap.this);
            String string = WebviewCoincap.this.getString(R.string.ssl_message_certificate);
            int primaryError = sslError.getPrimaryError();
            if (primaryError == 0) {
                string = WebviewCoincap.this.getString(R.string.ssl_message_notyetvalid);
            } else if (primaryError == 1) {
                string = WebviewCoincap.this.getString(R.string.ssl_message_expired);
            } else if (primaryError == 2) {
                string = WebviewCoincap.this.getString(R.string.ssl_message_idmismatch);
            } else if (primaryError == 3) {
                string = WebviewCoincap.this.getString(R.string.ssl_message_untrusted);
            }
            aVar.mo1208k(R.string.ssl_message_title);
            aVar.mo1202f(string + WebviewCoincap.this.getString(R.string.ssl_message_post));
            aVar.setPositiveButton(R.string.action_continue, new C8630a(sslErrorHandler));
            aVar.setNegativeButton(R.string.cancel, new C8631b(sslErrorHandler));
            aVar.create().show();
        }
    }

    /* renamed from: net.safemoon.androidwallet.ui.wallet.WebviewCoincap$b */
    public class C8632b extends WebChromeClient {
        public C8632b() {
        }

        public void onProgressChanged(WebView webView, int i) {
            WebviewCoincap.this.f42565d.setProgress(i);
        }
    }

    /* renamed from: net.safemoon.androidwallet.ui.wallet.WebviewCoincap$c */
    public class C8633c implements DialogInterface.OnClickListener {
        public C8633c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.cancel();
            WebviewCoincap.this.finish();
        }
    }

    /* renamed from: C */
    public static boolean m68283C() {
        try {
            int waitFor = Runtime.getRuntime().exec("/system/bin/ping -c 1 8.8.8.8").waitFor();
            StringBuilder sb = new StringBuilder();
            sb.append(waitFor);
            sb.append(" = internet");
            if (waitFor == 0) {
                return true;
            }
            return false;
        } catch (IOException e) {
            e.getMessage().toString();
            return false;
        } catch (InterruptedException e2) {
            e2.getMessage().toString();
            return false;
        }
    }

    /* renamed from: A */
    public void mo60878A() {
        new C0147a.C0148a(this).mo1208k(R.string.title_no_network).mo1201e(R.string.message_no_network).setPositiveButton(R.string.ok, new C8633c()).mo1209l();
    }

    /* renamed from: B */
    public final boolean mo60879B() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
        if (connectivityManager.getActiveNetworkInfo() == null || !connectivityManager.getActiveNetworkInfo().isConnected()) {
            return false;
        }
        return true;
    }

    public void onBackPressed() {
        if (this.f42564a.canGoBack()) {
            this.f42564a.goBack();
        } else {
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.webview_coincap);
        this.f42564a = (WebView) findViewById(R.id.webView);
        this.f42565d = (ProgressBar) findViewById(R.id.progressBar);
        getSupportActionBar().mo959l();
        this.f42565d.setMax(100);
        this.f42565d.setProgress(1);
        this.f42564a.getSettings().setJavaScriptEnabled(true);
        this.f42564a.getSettings().setDatabaseEnabled(true);
        this.f42564a.getSettings().setDomStorageEnabled(true);
        this.f42564a.getSettings().setSupportZoom(true);
        this.f42564a.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.f42564a.getSettings().setBuiltInZoomControls(true);
        this.f42564a.getSettings().setGeolocationEnabled(true);
        this.f42564a.setWebViewClient(new C8629a());
        this.f42564a.setWebChromeClient(new C8632b());
        if (!mo60879B() || !m68283C()) {
            mo60878A();
        } else {
            this.f42564a.loadUrl("https://coinmarketcap.com/");
        }
    }
}
