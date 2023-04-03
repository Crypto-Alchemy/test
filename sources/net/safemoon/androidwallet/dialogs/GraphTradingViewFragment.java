package net.safemoon.androidwallet.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.app.C0149b;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.C1710a;
import com.google.android.material.checkbox.MaterialCheckBox;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.Coin;
import net.safemoon.androidwallet.model.graph.TradingViewSymbol;
import net.safemoon.androidwallet.utils.Common;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 22\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b0\u00101J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0012\u0010\u0015\u001a\u00020\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010\u001b\u001a\u00020\u0004H\u0002J\b\u0010\u001c\u001a\u00020\u0004H\u0002J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\b\u0010 \u001a\u00020\u0004H\u0002R\u001b\u0010%\u001a\u00020!8BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010)R\u001d\u0010/\u001a\u0004\u0018\u00010+8BX\u0002¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b-\u0010.¨\u00064"}, mo44877d2 = {"Lnet/safemoon/androidwallet/dialogs/GraphTradingViewFragment;", "Lkf1;", "Landroid/os/Bundle;", "savedInstanceState", "Lr37;", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "Landroid/content/Context;", "context", "onAttach", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "Landroid/app/Dialog;", "p", "Landroidx/fragment/app/FragmentManager;", "manager", "P", "", "K", "O", "D", "Landroid/webkit/WebView;", "webView", "N", "L", "Lnet/safemoon/androidwallet/model/Coin;", "Lef3;", "I", "()Lnet/safemoon/androidwallet/model/Coin;", "coin", "Lnet/safemoon/androidwallet/model/graph/TradingViewSymbol;", "Q", "J", "()Lnet/safemoon/androidwallet/model/graph/TradingViewSymbol;", "tradingSymbolToken", "Lv92;", "U", "H", "()Lv92;", "binding", "<init>", "()V", "X", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: GraphTradingViewFragment.kt */
public final class GraphTradingViewFragment extends kf1 {

    /* renamed from: X */
    public static final C8306a f41779X = new C8306a((DefaultConstructorMarker) null);

    /* renamed from: P */
    public final ef3 f41780P = C6169a.m47232a(new GraphTradingViewFragment$coin$2(this));

    /* renamed from: Q */
    public final ef3 f41781Q = C6169a.m47232a(new GraphTradingViewFragment$tradingSymbolToken$2(this));

    /* renamed from: U */
    public final ef3 f41782U = C6169a.m47232a(new GraphTradingViewFragment$binding$2(this));

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, mo44877d2 = {"Lnet/safemoon/androidwallet/dialogs/GraphTradingViewFragment$a;", "", "Lnet/safemoon/androidwallet/model/Coin;", "coin", "Lnet/safemoon/androidwallet/model/graph/TradingViewSymbol;", "tradingSymbolToken", "Lnet/safemoon/androidwallet/dialogs/GraphTradingViewFragment;", "a", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.dialogs.GraphTradingViewFragment$a */
    /* compiled from: GraphTradingViewFragment.kt */
    public static final class C8306a {
        public C8306a() {
        }

        public /* synthetic */ C8306a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final GraphTradingViewFragment mo57291a(Coin coin, TradingViewSymbol tradingViewSymbol) {
            vx2.m53591g(coin, "coin");
            vx2.m53591g(tradingViewSymbol, "tradingSymbolToken");
            GraphTradingViewFragment graphTradingViewFragment = new GraphTradingViewFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("argCoin", coin);
            bundle.putSerializable("argTradingView", tradingViewSymbol);
            graphTradingViewFragment.setArguments(bundle);
            return graphTradingViewFragment;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\b"}, mo44877d2 = {"net/safemoon/androidwallet/dialogs/GraphTradingViewFragment$b", "Landroid/webkit/WebViewClient;", "Landroid/webkit/WebView;", "view", "", "url", "Lr37;", "onPageFinished", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.dialogs.GraphTradingViewFragment$b */
    /* compiled from: GraphTradingViewFragment.kt */
    public static final class C8307b extends WebViewClient {

        /* renamed from: a */
        public final /* synthetic */ GraphTradingViewFragment f41783a;

        /* renamed from: b */
        public final /* synthetic */ WebView f41784b;

        public C8307b(GraphTradingViewFragment graphTradingViewFragment, WebView webView) {
            this.f41783a = graphTradingViewFragment;
            this.f41784b = webView;
        }

        public void onPageFinished(WebView webView, String str) {
            View view;
            super.onPageFinished(webView, str);
            v92 C = this.f41783a.mo57283H();
            TextView textView = null;
            if (C != null) {
                view = C.f34886k;
            } else {
                view = null;
            }
            if (view != null) {
                view.setVisibility(8);
            }
            v92 C2 = this.f41783a.mo57283H();
            if (C2 != null) {
                textView = C2.f34887l;
            }
            if (textView != null) {
                textView.setVisibility(8);
            }
            this.f41784b.setVisibility(0);
        }
    }

    /* renamed from: E */
    public static final void m66173E(GraphTradingViewFragment graphTradingViewFragment, View view) {
        vx2.m53591g(graphTradingViewFragment, "this$0");
        graphTradingViewFragment.mo22266k();
    }

    /* renamed from: F */
    public static final void m66174F(v92 v92, GraphTradingViewFragment graphTradingViewFragment, CompoundButton compoundButton, boolean z) {
        Window window;
        ViewGroup.LayoutParams layoutParams;
        WebView webView;
        vx2.m53591g(v92, "$this_apply");
        vx2.m53591g(graphTradingViewFragment, "this$0");
        Dialog n = graphTradingViewFragment.mo22269n();
        if (n != null && (window = n.getWindow()) != null) {
            if (z) {
                v92 H = graphTradingViewFragment.mo57283H();
                if (H == null || (webView = H.f34894s) == null) {
                    layoutParams = null;
                } else {
                    layoutParams = webView.getLayoutParams();
                }
                if (layoutParams != null) {
                    layoutParams.height = 0;
                }
                window.setLayout(-1, -1);
                FragmentActivity activity = graphTradingViewFragment.getActivity();
                if (activity != null) {
                    activity.setRequestedOrientation(2);
                    return;
                }
                return;
            }
            graphTradingViewFragment.mo57289O();
            window.setLayout(-1, -2);
            FragmentActivity activity2 = graphTradingViewFragment.getActivity();
            if (activity2 != null) {
                activity2.setRequestedOrientation(1);
            }
        }
    }

    /* renamed from: G */
    public static final void m66175G(GraphTradingViewFragment graphTradingViewFragment, CompoundButton compoundButton, boolean z) {
        vx2.m53591g(graphTradingViewFragment, "this$0");
        graphTradingViewFragment.mo57287L();
    }

    /* renamed from: M */
    public static final void m66176M(GraphTradingViewFragment graphTradingViewFragment, View view) {
        vx2.m53591g(graphTradingViewFragment, "this$0");
        String obj = zm2.m31398a(graphTradingViewFragment.mo57285J().symbol, 0).toString();
        Common common = Common.f42577a;
        Context requireContext = graphTradingViewFragment.requireContext();
        vx2.m53590f(requireContext, "requireContext()");
        common.mo60917x(requireContext, "https://www.tradingview.com/chart/4Y7vkOum/?symbol=" + obj);
    }

    /* renamed from: D */
    public final void mo57282D() {
        v92 H = mo57283H();
        if (H != null) {
            H.f34880e.setOnClickListener(new jj2(this));
            H.f34879d.setOnCheckedChangeListener(new kj2(H, this));
            H.f34878c.setOnCheckedChangeListener(new lj2(this));
        }
        mo57287L();
    }

    /* renamed from: H */
    public final v92 mo57283H() {
        return (v92) this.f41782U.getValue();
    }

    /* renamed from: I */
    public final Coin mo57284I() {
        return (Coin) this.f41780P.getValue();
    }

    /* renamed from: J */
    public final TradingViewSymbol mo57285J() {
        return (TradingViewSymbol) this.f41781Q.getValue();
    }

    /* renamed from: K */
    public final String mo57286K() {
        boolean z;
        String str;
        String str2;
        boolean z2;
        MaterialCheckBox materialCheckBox;
        int i = 2;
        if (C0149b.m874l() == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str2 = "#37474f";
            str = "dark";
        } else {
            str2 = "#FFFFFF";
            str = "light";
        }
        v92 H = mo57283H();
        if (H == null || (materialCheckBox = H.f34878c) == null || !materialCheckBox.isChecked()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            i = 1;
        }
        return "<!-- TradingView Widget BEGIN -->\n<style>body {background: " + str2 + "}</style><div class=\"tradingview-widget-container\" style='background: transparent'>\n  <div id=\"tradingview_f9b26\"></div>\n  <script type=\"text/javascript\" src=\"https://s3.tradingview.com/tv.js\"></script>\n  <script type=\"text/javascript\">\n  new TradingView.widget(\n  {\n  \"autosize\": true,\n  \"symbol\": \"" + zm2.m31398a(mo57285J().symbol, 0).toString() + "\",\n  \"interval\": \"D\",\n  \"timezone\": \"Etc/UTC\",\n  \"theme\": \"" + str + "\",\n  \"style\": \"" + i + "\",\n  \"locale\": \"in\",\n  \"toolbar_bg\": \"#f1f3f6\",\n  \"enable_publishing\": false,\n  \"hide_top_toolbar\": true,\n  \"hide_legend\": true,\n  \"save_image\": false,\n  \"allow_symbol_change\": false,\n  \"container_id\": \"tradingview_f9b26\"\n}\n  );\n  </script>\n</div>\n<!-- TradingView Widget END -->";
    }

    /* renamed from: L */
    public final void mo57287L() {
        WebView webView;
        WebView webView2;
        v92 H = mo57283H();
        if (H != null) {
            webView = H.f34894s;
        } else {
            webView = null;
        }
        if (webView != null) {
            webView.setVisibility(4);
        }
        v92 H2 = mo57283H();
        if (H2 != null && (webView2 = H2.f34894s) != null) {
            webView2.loadDataWithBaseURL((String) null, mo57286K(), "text/html", "UTF-8", (String) null);
        }
    }

    /* renamed from: N */
    public final void mo57288N(WebView webView) {
        webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(new C8307b(this, webView));
    }

    /* renamed from: O */
    public final void mo57289O() {
        Float f;
        ViewGroup.LayoutParams layoutParams;
        WebView webView;
        Resources resources;
        FragmentActivity activity = getActivity();
        Integer num = null;
        if (activity == null || (resources = activity.getResources()) == null) {
            f = null;
        } else {
            f = Float.valueOf(resources.getDimension(R.dimen.my_250dp));
        }
        v92 H = mo57283H();
        if (H == null || (webView = H.f34894s) == null) {
            layoutParams = null;
        } else {
            layoutParams = webView.getLayoutParams();
        }
        if (layoutParams != null) {
            if (f != null) {
                num = Integer.valueOf((int) f.floatValue());
            }
            layoutParams.height = num.intValue();
        }
    }

    /* renamed from: P */
    public final void mo57290P(FragmentManager fragmentManager) {
        vx2.m53591g(fragmentManager, "manager");
        super.mo22281x(fragmentManager, GraphTradingViewFragment.class.getCanonicalName());
    }

    public void onAttach(Context context) {
        vx2.m53591g(context, "context");
        super.onAttach(context);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo22279v(0, 2132017641);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_graph_trading_view, viewGroup, false);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        vx2.m53591g(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setRequestedOrientation(1);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        TextView textView;
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        mo57282D();
        v92 H = mo57283H();
        if (H != null) {
            TextView textView2 = H.f34891p;
            String name = mo57284I().getName();
            String symbol = mo57284I().getSymbol();
            textView2.setText(name + "(" + symbol + ")");
            TextView textView3 = H.f34893r;
            vx2.m53590f(textView3, "tvPriceDialog");
            Double price = mo57284I().getQuote().getUSD().getPrice();
            vx2.m53590f(price, "coin.quote.usd.price");
            ol0.m70334N(textView3, price.doubleValue(), true);
            me5 u = C1710a.m12225u(H.f34881f);
            Integer id = mo57284I().getId();
            vx2.m53590f(id, "coin.id");
            u.mo23163x(C9384u3.m72567h(id.intValue(), mo57284I().getSymbol())).mo11567a(qe5.m25623x0()).mo11553K0(H.f34881f);
            try {
                WebSettings settings = H.f34894s.getSettings();
                vx2.m53590f(settings, "webView.settings");
                settings.setJavaScriptCanOpenWindowsAutomatically(true);
                settings.setSupportMultipleWindows(true);
                settings.setSupportZoom(false);
                settings.setBuiltInZoomControls(true);
                settings.setJavaScriptEnabled(true);
                settings.setCacheMode(-1);
                settings.setDatabaseEnabled(true);
                settings.setDomStorageEnabled(true);
                settings.setGeolocationEnabled(true);
                settings.setGeolocationEnabled(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
            WebView webView = H.f34894s;
            vx2.m53590f(webView, "webView");
            mo57288N(webView);
        }
        v92 H2 = mo57283H();
        if (!(H2 == null || (textView = H2.f34888m) == null)) {
            textView.setOnClickListener(new ij2(this));
        }
        mo57289O();
    }

    /* renamed from: p */
    public Dialog mo22273p(Bundle bundle) {
        Dialog p = super.mo22273p(bundle);
        vx2.m53590f(p, "super.onCreateDialog(savedInstanceState)");
        p.requestWindowFeature(1);
        Window window = p.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        Window window2 = p.getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        return p;
    }
}
