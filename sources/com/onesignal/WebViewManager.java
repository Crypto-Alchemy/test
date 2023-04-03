package com.onesignal;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.onesignal.C5179a;
import com.onesignal.C5248i;
import com.onesignal.OneSignal;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(19)
public class WebViewManager extends C5179a.C5181b {

    /* renamed from: k */
    public static final String f26110k = "com.onesignal.WebViewManager";

    /* renamed from: l */
    public static final int f26111l = C5336v0.m41348b(24);

    /* renamed from: m */
    public static WebViewManager f26112m = null;

    /* renamed from: a */
    public final Object f26113a = new C5167b();

    /* renamed from: b */
    public OSWebView f26114b;

    /* renamed from: c */
    public C5248i f26115c;

    /* renamed from: d */
    public Activity f26116d;

    /* renamed from: e */
    public bd4 f26117e;

    /* renamed from: f */
    public C5339w f26118f;

    /* renamed from: g */
    public String f26119g = null;

    /* renamed from: h */
    public Integer f26120h = null;

    /* renamed from: i */
    public boolean f26121i = false;

    /* renamed from: j */
    public boolean f26122j = false;

    public enum Position {
        TOP_BANNER,
        BOTTOM_BANNER,
        CENTER_MODAL,
        FULL_SCREEN;

        public boolean isBanner() {
            int i = C5166a.f26124a[ordinal()];
            if (i == 1 || i == 2) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.onesignal.WebViewManager$a */
    public static /* synthetic */ class C5166a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26124a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.onesignal.WebViewManager$Position[] r0 = com.onesignal.WebViewManager.Position.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f26124a = r0
                com.onesignal.WebViewManager$Position r1 = com.onesignal.WebViewManager.Position.TOP_BANNER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26124a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onesignal.WebViewManager$Position r1 = com.onesignal.WebViewManager.Position.BOTTOM_BANNER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.WebViewManager.C5166a.<clinit>():void");
        }
    }

    /* renamed from: com.onesignal.WebViewManager$b */
    public class C5167b {
        public C5167b() {
        }
    }

    /* renamed from: com.onesignal.WebViewManager$c */
    public class C5168c implements C5178l {

        /* renamed from: a */
        public final /* synthetic */ Activity f26126a;

        /* renamed from: b */
        public final /* synthetic */ bd4 f26127b;

        /* renamed from: c */
        public final /* synthetic */ C5339w f26128c;

        public C5168c(Activity activity, bd4 bd4, C5339w wVar) {
            this.f26126a = activity;
            this.f26127b = bd4;
            this.f26128c = wVar;
        }

        public void onComplete() {
            WebViewManager.f26112m = null;
            WebViewManager.m40514B(this.f26126a, this.f26127b, this.f26128c);
        }
    }

    /* renamed from: com.onesignal.WebViewManager$d */
    public class C5169d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ bd4 f26129a;

        /* renamed from: d */
        public final /* synthetic */ C5339w f26130d;

        public C5169d(bd4 bd4, C5339w wVar) {
            this.f26129a = bd4;
            this.f26130d = wVar;
        }

        public void run() {
            WebViewManager.m40516I(this.f26129a, this.f26130d);
        }
    }

    /* renamed from: com.onesignal.WebViewManager$e */
    public class C5170e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Activity f26132d;

        /* renamed from: e */
        public final /* synthetic */ String f26133e;

        /* renamed from: g */
        public final /* synthetic */ C5339w f26134g;

        public C5170e(Activity activity, String str, C5339w wVar) {
            this.f26132d = activity;
            this.f26133e = str;
            this.f26134g = wVar;
        }

        public void run() {
            try {
                WebViewManager.this.mo38622H(this.f26132d, this.f26133e, this.f26134g.mo39140g());
            } catch (Exception e) {
                if (e.getMessage() == null || !e.getMessage().contains("No WebView installed")) {
                    throw e;
                }
                OneSignal.m40379b(OneSignal.LOG_LEVEL.ERROR, "Error setting up WebView: ", e);
            }
        }
    }

    /* renamed from: com.onesignal.WebViewManager$f */
    public class C5171f implements Runnable {
        public C5171f() {
        }

        public void run() {
            int[] c = C5336v0.m41349c(WebViewManager.this.f26116d);
            WebViewManager.this.f26114b.evaluateJavascript(String.format("setSafeAreaInsets(%s)", new Object[]{String.format("{\n   top: %d,\n   bottom: %d,\n   right: %d,\n   left: %d,\n}", new Object[]{Integer.valueOf(c[0]), Integer.valueOf(c[1]), Integer.valueOf(c[2]), Integer.valueOf(c[3])})}), (ValueCallback) null);
        }
    }

    /* renamed from: com.onesignal.WebViewManager$g */
    public class C5172g implements Runnable {

        /* renamed from: com.onesignal.WebViewManager$g$a */
        public class C5173a implements ValueCallback<String> {
            public C5173a() {
            }

            /* renamed from: a */
            public void onReceiveValue(String str) {
                try {
                    WebViewManager webViewManager = WebViewManager.this;
                    WebViewManager.this.mo38623J(Integer.valueOf(webViewManager.mo38618C(webViewManager.f26116d, new JSONObject(str))));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }

        public C5172g() {
        }

        public void run() {
            WebViewManager webViewManager = WebViewManager.this;
            webViewManager.mo38621G(webViewManager.f26116d);
            if (WebViewManager.this.f26118f.mo39140g()) {
                WebViewManager.this.mo38624K();
            }
            WebViewManager.this.f26114b.evaluateJavascript("getPageMetaData()", new C5173a());
        }
    }

    /* renamed from: com.onesignal.WebViewManager$h */
    public class C5174h implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Activity f26138a;

        /* renamed from: d */
        public final /* synthetic */ String f26139d;

        public C5174h(Activity activity, String str) {
            this.f26138a = activity;
            this.f26139d = str;
        }

        public void run() {
            WebViewManager.this.mo38621G(this.f26138a);
            WebViewManager.this.f26114b.loadData(this.f26139d, "text/html; charset=utf-8", "base64");
        }
    }

    /* renamed from: com.onesignal.WebViewManager$i */
    public class C5175i implements C5248i.C5258j {
        public C5175i() {
        }

        /* renamed from: a */
        public void mo38640a() {
            OneSignal.m40383c0().mo38504d0(WebViewManager.this.f26117e);
        }

        /* renamed from: b */
        public void mo38641b() {
            OneSignal.m40383c0().mo38495X(WebViewManager.this.f26117e);
            WebViewManager.this.mo38619D();
        }

        /* renamed from: c */
        public void mo38642c() {
            OneSignal.m40383c0().mo38505e0(WebViewManager.this.f26117e);
        }
    }

    /* renamed from: com.onesignal.WebViewManager$j */
    public class C5176j implements C5178l {

        /* renamed from: a */
        public final /* synthetic */ C5178l f26142a;

        public C5176j(C5178l lVar) {
            this.f26142a = lVar;
        }

        public void onComplete() {
            boolean unused = WebViewManager.this.f26121i = false;
            WebViewManager.this.mo38620F((C5248i) null);
            C5178l lVar = this.f26142a;
            if (lVar != null) {
                lVar.onComplete();
            }
        }
    }

    /* renamed from: com.onesignal.WebViewManager$k */
    public class C5177k {
        public C5177k() {
        }

        /* renamed from: a */
        public final Position mo38643a(JSONObject jSONObject) {
            Position position = Position.FULL_SCREEN;
            try {
                if (!jSONObject.has("displayLocation") || jSONObject.get("displayLocation").equals("")) {
                    return position;
                }
                return Position.valueOf(jSONObject.optString("displayLocation", "FULL_SCREEN").toUpperCase());
            } catch (JSONException e) {
                e.printStackTrace();
                return position;
            }
        }

        /* renamed from: b */
        public final boolean mo38644b(JSONObject jSONObject) {
            try {
                return jSONObject.getBoolean("dragToDismissDisabled");
            } catch (JSONException unused) {
                return false;
            }
        }

        /* renamed from: c */
        public final int mo38645c(JSONObject jSONObject) {
            try {
                WebViewManager webViewManager = WebViewManager.this;
                return webViewManager.mo38618C(webViewManager.f26116d, jSONObject.getJSONObject("pageMetaData"));
            } catch (JSONException unused) {
                return -1;
            }
        }

        /* renamed from: d */
        public final void mo38646d(JSONObject jSONObject) throws JSONException {
            JSONObject jSONObject2 = jSONObject.getJSONObject("body");
            String optString = jSONObject2.optString("id", (String) null);
            boolean unused = WebViewManager.this.f26122j = jSONObject2.getBoolean("close");
            if (WebViewManager.this.f26117e.f21255k) {
                OneSignal.m40383c0().mo38499a0(WebViewManager.this.f26117e, jSONObject2);
            } else if (optString != null) {
                OneSignal.m40383c0().mo38497Z(WebViewManager.this.f26117e, jSONObject2);
            }
            if (WebViewManager.this.f26122j) {
                WebViewManager.this.mo38629w((C5178l) null);
            }
        }

        /* renamed from: e */
        public final void mo38647e(JSONObject jSONObject) throws JSONException {
            OneSignal.m40383c0().mo38507g0(WebViewManager.this.f26117e, jSONObject);
        }

        /* renamed from: f */
        public final void mo38648f(JSONObject jSONObject) {
            int i;
            Position a = mo38643a(jSONObject);
            if (a == Position.FULL_SCREEN) {
                i = -1;
            } else {
                i = mo38645c(jSONObject);
            }
            boolean b = mo38644b(jSONObject);
            WebViewManager.this.f26118f.mo39142i(a);
            WebViewManager.this.f26118f.mo39143j(i);
            WebViewManager.this.mo38628v(b);
        }

        @JavascriptInterface
        public void postMessage(String str) {
            try {
                OneSignal.m40387d1(OneSignal.LOG_LEVEL.DEBUG, "OSJavaScriptInterface:postMessage: " + str);
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("type");
                char c = 65535;
                switch (string.hashCode()) {
                    case -1484226720:
                        if (string.equals("page_change")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -934437708:
                        if (string.equals("resize")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 42998156:
                        if (string.equals("rendering_complete")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 1851145598:
                        if (string.equals("action_taken")) {
                            c = 1;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    mo38648f(jSONObject);
                } else if (c != 1) {
                    if (c == 3) {
                        mo38647e(jSONObject);
                    }
                } else if (!WebViewManager.this.f26115c.mo38854O()) {
                    mo38646d(jSONObject);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.onesignal.WebViewManager$l */
    public interface C5178l {
        void onComplete();
    }

    public WebViewManager(bd4 bd4, Activity activity, C5339w wVar) {
        this.f26117e = bd4;
        this.f26116d = activity;
        this.f26118f = wVar;
    }

    /* renamed from: B */
    public static void m40514B(Activity activity, bd4 bd4, C5339w wVar) {
        if (wVar.mo39140g()) {
            m40515E(wVar, activity);
        }
        try {
            String encodeToString = Base64.encodeToString(wVar.mo39134a().getBytes("UTF-8"), 2);
            WebViewManager webViewManager = new WebViewManager(bd4, activity, wVar);
            f26112m = webViewManager;
            OSUtils.m40270S(new C5170e(activity, encodeToString, wVar));
        } catch (UnsupportedEncodingException e) {
            OneSignal.m40379b(OneSignal.LOG_LEVEL.ERROR, "Catch on initInAppMessage: ", e);
            e.printStackTrace();
        }
    }

    /* renamed from: E */
    public static void m40515E(C5339w wVar, Activity activity) {
        String a = wVar.mo39134a();
        int[] c = C5336v0.m41349c(activity);
        String format = String.format("\n\n<script>\n    setSafeAreaInsets(%s);\n</script>", new Object[]{String.format("{\n   top: %d,\n   bottom: %d,\n   right: %d,\n   left: %d,\n}", new Object[]{Integer.valueOf(c[0]), Integer.valueOf(c[1]), Integer.valueOf(c[2]), Integer.valueOf(c[3])})});
        wVar.mo39141h(a + format);
    }

    /* renamed from: I */
    public static void m40516I(bd4 bd4, C5339w wVar) {
        Activity Q = OneSignal.m40352Q();
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.m40387d1(log_level, "in app message showMessageContent on currentActivity: " + Q);
        if (Q != null) {
            WebViewManager webViewManager = f26112m;
            if (webViewManager == null || !bd4.f21255k) {
                m40514B(Q, bd4, wVar);
            } else {
                webViewManager.mo38629w(new C5168c(Q, bd4, wVar));
            }
        } else {
            Looper.prepare();
            new Handler().postDelayed(new C5169d(bd4, wVar), 200);
        }
    }

    /* renamed from: x */
    public static void m40534x() {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.m40387d1(log_level, "WebViewManager IAM dismissAndAwaitNextMessage lastInstance: " + f26112m);
        WebViewManager webViewManager = f26112m;
        if (webViewManager != null) {
            webViewManager.mo38629w((C5178l) null);
        }
    }

    /* renamed from: y */
    public static void m40535y() {
        if (OneSignal.m40307B(OneSignal.LOG_LEVEL.DEBUG)) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
    }

    /* renamed from: A */
    public final int mo38617A(Activity activity) {
        int i;
        if (this.f26118f.mo39140g()) {
            i = 0;
        } else {
            i = f26111l * 2;
        }
        return C5336v0.m41351e(activity) - i;
    }

    /* renamed from: C */
    public final int mo38618C(Activity activity, JSONObject jSONObject) {
        try {
            int b = C5336v0.m41348b(jSONObject.getJSONObject("rect").getInt("height"));
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            OneSignal.m40387d1(log_level, "getPageHeightData:pxHeight: " + b);
            int A = mo38617A(activity);
            if (b <= A) {
                return b;
            }
            OneSignal.m40376a(log_level, "getPageHeightData:pxHeight is over screen max: " + A);
            return A;
        } catch (JSONException e) {
            OneSignal.m40379b(OneSignal.LOG_LEVEL.ERROR, "pageRectToViewHeight could not get page height", e);
            return -1;
        }
    }

    /* renamed from: D */
    public final void mo38619D() {
        C5179a b = C6139ka.m46938b();
        if (b != null) {
            b.mo38666q(f26110k + this.f26117e.f36112a);
        }
    }

    /* renamed from: F */
    public final void mo38620F(C5248i iVar) {
        synchronized (this.f26113a) {
            this.f26115c = iVar;
        }
    }

    /* renamed from: G */
    public final void mo38621G(Activity activity) {
        this.f26114b.layout(0, 0, mo38630z(activity), mo38617A(activity));
    }

    @SuppressLint({"SetJavaScriptEnabled", "AddJavascriptInterface"})
    /* renamed from: H */
    public final void mo38622H(Activity activity, String str, boolean z) {
        m40535y();
        OSWebView oSWebView = new OSWebView(activity);
        this.f26114b = oSWebView;
        oSWebView.setOverScrollMode(2);
        this.f26114b.setVerticalScrollBarEnabled(false);
        this.f26114b.setHorizontalScrollBarEnabled(false);
        this.f26114b.getSettings().setJavaScriptEnabled(true);
        this.f26114b.addJavascriptInterface(new C5177k(), "OSAndroid");
        if (z) {
            this.f26114b.setSystemUiVisibility(3074);
            if (Build.VERSION.SDK_INT >= 30) {
                this.f26114b.setFitsSystemWindows(false);
            }
        }
        mo38626t(this.f26114b);
        C5336v0.m41347a(activity, new C5174h(activity, str));
    }

    /* renamed from: J */
    public final void mo38623J(Integer num) {
        synchronized (this.f26113a) {
            if (this.f26115c == null) {
                OneSignal.m40376a(OneSignal.LOG_LEVEL.WARN, "No messageView found to update a with a new height.");
                return;
            }
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            OneSignal.m40376a(log_level, "In app message, showing first one with height: " + num);
            this.f26115c.mo38860U(this.f26114b);
            if (num != null) {
                this.f26120h = num;
                this.f26115c.mo38865Z(num.intValue());
            }
            this.f26115c.mo38863X(this.f26116d);
            this.f26115c.mo38841B();
        }
    }

    /* renamed from: K */
    public final void mo38624K() {
        OSUtils.m40270S(new C5171f());
    }

    /* renamed from: a */
    public void mo38609a(Activity activity) {
        String str = this.f26119g;
        this.f26116d = activity;
        this.f26119g = activity.getLocalClassName();
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.m40376a(log_level, "In app message activity available currentActivityName: " + this.f26119g + " lastActivityName: " + str);
        if (str == null) {
            mo38623J((Integer) null);
        } else if (str.equals(this.f26119g)) {
            mo38627u();
        } else if (!this.f26122j) {
            C5248i iVar = this.f26115c;
            if (iVar != null) {
                iVar.mo38855P();
            }
            mo38623J(this.f26120h);
        }
    }

    /* renamed from: b */
    public void mo38625b(Activity activity) {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.m40376a(log_level, "In app message activity stopped, cleaning views, currentActivityName: " + this.f26119g + "\nactivity: " + this.f26116d + "\nmessageView: " + this.f26115c);
        if (this.f26115c != null && activity.getLocalClassName().equals(this.f26119g)) {
            this.f26115c.mo38855P();
        }
    }

    /* renamed from: t */
    public final void mo38626t(WebView webView) {
    }

    /* renamed from: u */
    public final void mo38627u() {
        C5248i iVar = this.f26115c;
        if (iVar != null) {
            if (iVar.mo38852M() != Position.FULL_SCREEN || this.f26118f.mo39140g()) {
                OneSignal.m40376a(OneSignal.LOG_LEVEL.DEBUG, "In app message new activity, calculate height and show ");
                C5336v0.m41347a(this.f26116d, new C5172g());
                return;
            }
            mo38623J((Integer) null);
        }
    }

    /* renamed from: v */
    public final void mo38628v(boolean z) {
        this.f26120h = Integer.valueOf(this.f26118f.mo39137d());
        mo38620F(new C5248i(this.f26114b, this.f26118f, z));
        this.f26115c.mo38857R(new C5175i());
        C5179a b = C6139ka.m46938b();
        if (b != null) {
            b.mo38651b(f26110k + this.f26117e.f36112a, this);
        }
    }

    /* renamed from: w */
    public void mo38629w(C5178l lVar) {
        C5248i iVar = this.f26115c;
        if (iVar != null && !this.f26121i) {
            if (!(this.f26117e == null || iVar == null)) {
                OneSignal.m40383c0().mo38505e0(this.f26117e);
            }
            this.f26115c.mo38850K(new C5176j(lVar));
            this.f26121i = true;
        } else if (lVar != null) {
            lVar.onComplete();
        }
    }

    /* renamed from: z */
    public final int mo38630z(Activity activity) {
        if (this.f26118f.mo39140g()) {
            return C5336v0.m41350d(activity);
        }
        return C5336v0.m41354h(activity) - (f26111l * 2);
    }
}
