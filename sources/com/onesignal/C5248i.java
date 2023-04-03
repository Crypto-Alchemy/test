package com.onesignal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.webkit.WebView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import com.github.mikephil.charting.utils.Utils;
import com.onesignal.C5199c;
import com.onesignal.OneSignal;
import com.onesignal.WebViewManager;

/* renamed from: com.onesignal.i */
/* compiled from: InAppMessageView */
public class C5248i {

    /* renamed from: v */
    public static final int f26353v = Color.parseColor("#00000000");

    /* renamed from: w */
    public static final int f26354w = Color.parseColor("#BB000000");

    /* renamed from: x */
    public static final int f26355x = C5336v0.m41348b(4);

    /* renamed from: a */
    public PopupWindow f26356a;

    /* renamed from: b */
    public Activity f26357b;

    /* renamed from: c */
    public final Handler f26358c = new Handler();

    /* renamed from: d */
    public int f26359d;

    /* renamed from: e */
    public int f26360e;

    /* renamed from: f */
    public int f26361f = C5336v0.m41348b(24);

    /* renamed from: g */
    public int f26362g = C5336v0.m41348b(24);

    /* renamed from: h */
    public int f26363h = C5336v0.m41348b(24);

    /* renamed from: i */
    public int f26364i = C5336v0.m41348b(24);

    /* renamed from: j */
    public double f26365j;

    /* renamed from: k */
    public boolean f26366k;

    /* renamed from: l */
    public boolean f26367l = false;

    /* renamed from: m */
    public boolean f26368m = false;

    /* renamed from: n */
    public boolean f26369n = false;

    /* renamed from: o */
    public C5339w f26370o;

    /* renamed from: p */
    public WebViewManager.Position f26371p;

    /* renamed from: q */
    public WebView f26372q;

    /* renamed from: r */
    public RelativeLayout f26373r;

    /* renamed from: s */
    public C5199c f26374s;

    /* renamed from: t */
    public C5258j f26375t;

    /* renamed from: u */
    public Runnable f26376u;

    /* renamed from: com.onesignal.i$a */
    /* compiled from: InAppMessageView */
    public class C5249a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f26377a;

        public C5249a(int i) {
            this.f26377a = i;
        }

        public void run() {
            if (C5248i.this.f26372q == null) {
                OneSignal.m40387d1(OneSignal.LOG_LEVEL.WARN, "WebView height update skipped, new height will be used once it is displayed.");
                return;
            }
            ViewGroup.LayoutParams layoutParams = C5248i.this.f26372q.getLayoutParams();
            if (layoutParams == null) {
                OneSignal.m40387d1(OneSignal.LOG_LEVEL.WARN, "WebView height update skipped because of null layoutParams, new height will be used once it is displayed.");
                return;
            }
            layoutParams.height = this.f26377a;
            C5248i.this.f26372q.setLayoutParams(layoutParams);
            if (C5248i.this.f26374s != null) {
                C5199c b = C5248i.this.f26374s;
                C5248i iVar = C5248i.this;
                b.mo38711i(iVar.mo38845F(this.f26377a, iVar.f26371p, C5248i.this.f26369n));
            }
        }
    }

    /* renamed from: com.onesignal.i$b */
    /* compiled from: InAppMessageView */
    public class C5250b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ RelativeLayout.LayoutParams f26379a;

        /* renamed from: d */
        public final /* synthetic */ RelativeLayout.LayoutParams f26380d;

        /* renamed from: e */
        public final /* synthetic */ C5199c.C5202c f26381e;

        /* renamed from: g */
        public final /* synthetic */ WebViewManager.Position f26382g;

        public C5250b(RelativeLayout.LayoutParams layoutParams, RelativeLayout.LayoutParams layoutParams2, C5199c.C5202c cVar, WebViewManager.Position position) {
            this.f26379a = layoutParams;
            this.f26380d = layoutParams2;
            this.f26381e = cVar;
            this.f26382g = position;
        }

        public void run() {
            if (C5248i.this.f26372q != null) {
                C5248i.this.f26372q.setLayoutParams(this.f26379a);
                Context applicationContext = C5248i.this.f26357b.getApplicationContext();
                C5248i.this.mo38858S(applicationContext, this.f26380d, this.f26381e);
                C5248i.this.mo38859T(applicationContext);
                C5248i iVar = C5248i.this;
                iVar.mo38847H(iVar.f26373r);
                if (C5248i.this.f26375t != null) {
                    C5248i iVar2 = C5248i.this;
                    iVar2.mo38871z(this.f26382g, iVar2.f26374s, C5248i.this.f26373r);
                }
                C5248i.this.mo38864Y();
            }
        }
    }

    /* renamed from: com.onesignal.i$c */
    /* compiled from: InAppMessageView */
    public class C5251c implements C5199c.C5201b {
        public C5251c() {
        }

        /* renamed from: a */
        public void mo38713a() {
            boolean unused = C5248i.this.f26368m = false;
        }

        /* renamed from: b */
        public void mo38714b() {
            boolean unused = C5248i.this.f26368m = true;
        }

        public void onDismiss() {
            if (C5248i.this.f26375t != null) {
                C5248i.this.f26375t.mo38642c();
            }
            C5248i.this.mo38851L((WebViewManager.C5178l) null);
        }
    }

    /* renamed from: com.onesignal.i$d */
    /* compiled from: InAppMessageView */
    public class C5252d implements Runnable {
        public C5252d() {
        }

        public void run() {
            if (C5248i.this.f26375t != null) {
                C5248i.this.f26375t.mo38642c();
            }
            if (C5248i.this.f26357b != null) {
                C5248i.this.mo38850K((WebViewManager.C5178l) null);
                Runnable unused = C5248i.this.f26376u = null;
                return;
            }
            boolean unused2 = C5248i.this.f26367l = true;
        }
    }

    /* renamed from: com.onesignal.i$e */
    /* compiled from: InAppMessageView */
    public class C5253e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Activity f26386a;

        public C5253e(Activity activity) {
            this.f26386a = activity;
        }

        public void run() {
            C5248i.this.mo38848I(this.f26386a);
        }
    }

    /* renamed from: com.onesignal.i$f */
    /* compiled from: InAppMessageView */
    public class C5254f implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ WebViewManager.C5178l f26388a;

        public C5254f(WebViewManager.C5178l lVar) {
            this.f26388a = lVar;
        }

        public void run() {
            if (!C5248i.this.f26366k || C5248i.this.f26373r == null) {
                C5248i.this.mo38842C();
                WebViewManager.C5178l lVar = this.f26388a;
                if (lVar != null) {
                    lVar.onComplete();
                    return;
                }
                return;
            }
            C5248i iVar = C5248i.this;
            iVar.mo38867v(iVar.f26373r, this.f26388a);
        }
    }

    /* renamed from: com.onesignal.i$g */
    /* compiled from: InAppMessageView */
    public class C5255g implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ CardView f26390a;

        public C5255g(CardView cardView) {
            this.f26390a = cardView;
        }

        public void onAnimationEnd(Animation animation) {
            if (Build.VERSION.SDK_INT == 23) {
                this.f26390a.setCardElevation((float) C5336v0.m41348b(5));
            }
            if (C5248i.this.f26375t != null) {
                C5248i.this.f26375t.mo38640a();
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.onesignal.i$h */
    /* compiled from: InAppMessageView */
    public class C5256h extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ WebViewManager.C5178l f26392a;

        public C5256h(WebViewManager.C5178l lVar) {
            this.f26392a = lVar;
        }

        public void onAnimationEnd(Animator animator) {
            C5248i.this.mo38842C();
            WebViewManager.C5178l lVar = this.f26392a;
            if (lVar != null) {
                lVar.onComplete();
            }
        }
    }

    /* renamed from: com.onesignal.i$i */
    /* compiled from: InAppMessageView */
    public static /* synthetic */ class C5257i {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26394a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.onesignal.WebViewManager$Position[] r0 = com.onesignal.WebViewManager.Position.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f26394a = r0
                com.onesignal.WebViewManager$Position r1 = com.onesignal.WebViewManager.Position.TOP_BANNER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26394a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onesignal.WebViewManager$Position r1 = com.onesignal.WebViewManager.Position.BOTTOM_BANNER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f26394a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onesignal.WebViewManager$Position r1 = com.onesignal.WebViewManager.Position.CENTER_MODAL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f26394a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onesignal.WebViewManager$Position r1 = com.onesignal.WebViewManager.Position.FULL_SCREEN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C5248i.C5257i.<clinit>():void");
        }
    }

    /* renamed from: com.onesignal.i$j */
    /* compiled from: InAppMessageView */
    public interface C5258j {
        /* renamed from: a */
        void mo38640a();

        /* renamed from: b */
        void mo38641b();

        /* renamed from: c */
        void mo38642c();
    }

    public C5248i(WebView webView, C5339w wVar, boolean z) {
        double d;
        this.f26372q = webView;
        this.f26371p = wVar.mo39136c();
        this.f26360e = wVar.mo39137d();
        this.f26359d = -1;
        if (wVar.mo39135b() == null) {
            d = Utils.DOUBLE_EPSILON;
        } else {
            d = wVar.mo39135b().doubleValue();
        }
        this.f26365j = d;
        this.f26366k = !this.f26371p.isBanner();
        this.f26369n = z;
        this.f26370o = wVar;
        mo38856Q(wVar);
    }

    /* renamed from: A */
    public final void mo38840A(View view, int i, Animation.AnimationListener animationListener) {
        zh4.m55121a(view, (float) ((-i) - this.f26363h), Utils.FLOAT_EPSILON, 1000, new bi4(0.1d, 8.0d), animationListener).start();
    }

    /* renamed from: B */
    public void mo38841B() {
        if (this.f26367l) {
            this.f26367l = false;
            mo38851L((WebViewManager.C5178l) null);
        }
    }

    /* renamed from: C */
    public final void mo38842C() {
        mo38855P();
        C5258j jVar = this.f26375t;
        if (jVar != null) {
            jVar.mo38641b();
        }
    }

    /* renamed from: D */
    public final Animation.AnimationListener mo38843D(CardView cardView) {
        return new C5255g(cardView);
    }

    /* renamed from: E */
    public final CardView mo38844E(Context context) {
        int i;
        CardView cardView = new CardView(context);
        if (this.f26371p == WebViewManager.Position.FULL_SCREEN) {
            i = -1;
        } else {
            i = -2;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, i);
        layoutParams.addRule(13);
        cardView.setLayoutParams(layoutParams);
        if (Build.VERSION.SDK_INT == 23) {
            cardView.setCardElevation(Utils.FLOAT_EPSILON);
        } else {
            cardView.setCardElevation((float) C5336v0.m41348b(5));
        }
        cardView.setRadius((float) C5336v0.m41348b(8));
        cardView.setClipChildren(false);
        cardView.setClipToPadding(false);
        cardView.setPreventCornerOverlap(false);
        cardView.setCardBackgroundColor(0);
        return cardView;
    }

    /* renamed from: F */
    public final C5199c.C5202c mo38845F(int i, WebViewManager.Position position, boolean z) {
        C5199c.C5202c cVar = new C5199c.C5202c();
        cVar.f26208d = this.f26362g;
        cVar.f26206b = this.f26363h;
        cVar.f26212h = z;
        cVar.f26210f = i;
        cVar.f26209e = mo38853N();
        int i2 = C5257i.f26394a[position.ordinal()];
        int i3 = 1;
        if (i2 == 1) {
            cVar.f26207c = this.f26363h - f26355x;
        } else if (i2 != 2) {
            if (i2 != 3) {
                if (i2 == 4) {
                    i = mo38853N() - (this.f26364i + this.f26363h);
                    cVar.f26210f = i;
                }
            }
            int N = (mo38853N() / 2) - (i / 2);
            cVar.f26207c = f26355x + N;
            cVar.f26206b = N;
            cVar.f26205a = N;
        } else {
            cVar.f26205a = mo38853N() - i;
            cVar.f26207c = this.f26364i + f26355x;
        }
        if (position == WebViewManager.Position.TOP_BANNER) {
            i3 = 0;
        }
        cVar.f26211g = i3;
        return cVar;
    }

    /* renamed from: G */
    public final RelativeLayout.LayoutParams mo38846G() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.f26359d, -1);
        int i = C5257i.f26394a[this.f26371p.ordinal()];
        if (i == 1) {
            layoutParams.addRule(10);
            layoutParams.addRule(14);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(14);
        } else if (i == 3 || i == 4) {
            layoutParams.addRule(13);
        }
        return layoutParams;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        if (r5 != 4) goto L_0x0048;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0054  */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo38847H(android.widget.RelativeLayout r5) {
        /*
            r4 = this;
            android.widget.PopupWindow r0 = new android.widget.PopupWindow
            boolean r1 = r4.f26366k
            r2 = -1
            if (r1 == 0) goto L_0x0009
            r3 = r2
            goto L_0x000b
        L_0x0009:
            int r3 = r4.f26359d
        L_0x000b:
            if (r1 == 0) goto L_0x000e
            goto L_0x000f
        L_0x000e:
            r2 = -2
        L_0x000f:
            r1 = 1
            r0.<init>(r5, r3, r2, r1)
            r4.f26356a = r0
            android.graphics.drawable.ColorDrawable r5 = new android.graphics.drawable.ColorDrawable
            r2 = 0
            r5.<init>(r2)
            r0.setBackgroundDrawable(r5)
            android.widget.PopupWindow r5 = r4.f26356a
            r5.setTouchable(r1)
            android.widget.PopupWindow r5 = r4.f26356a
            r5.setClippingEnabled(r2)
            boolean r5 = r4.f26366k
            if (r5 != 0) goto L_0x0048
            int[] r5 = com.onesignal.C5248i.C5257i.f26394a
            com.onesignal.WebViewManager$Position r0 = r4.f26371p
            int r0 = r0.ordinal()
            r5 = r5[r0]
            if (r5 == r1) goto L_0x0045
            r0 = 2
            if (r5 == r0) goto L_0x0042
            r0 = 3
            if (r5 == r0) goto L_0x0049
            r0 = 4
            if (r5 == r0) goto L_0x0049
            goto L_0x0048
        L_0x0042:
            r1 = 81
            goto L_0x0049
        L_0x0045:
            r1 = 49
            goto L_0x0049
        L_0x0048:
            r1 = r2
        L_0x0049:
            com.onesignal.w r5 = r4.f26370o
            boolean r5 = r5.mo39140g()
            if (r5 == 0) goto L_0x0054
            r5 = 1000(0x3e8, float:1.401E-42)
            goto L_0x0056
        L_0x0054:
            r5 = 1003(0x3eb, float:1.406E-42)
        L_0x0056:
            android.widget.PopupWindow r0 = r4.f26356a
            p000.kt4.m21073b(r0, r5)
            android.widget.PopupWindow r5 = r4.f26356a
            android.app.Activity r0 = r4.f26357b
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            android.view.View r0 = r0.getRootView()
            r5.showAtLocation(r0, r1, r2, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C5248i.mo38847H(android.widget.RelativeLayout):void");
    }

    /* renamed from: I */
    public final void mo38848I(Activity activity) {
        if (!C5336v0.m41355i(activity) || this.f26373r != null) {
            new Handler().postDelayed(new C5253e(activity), 200);
        } else {
            mo38862W(activity);
        }
    }

    /* renamed from: J */
    public final void mo38849J() {
        this.f26373r = null;
        this.f26374s = null;
        this.f26372q = null;
    }

    /* renamed from: K */
    public void mo38850K(WebViewManager.C5178l lVar) {
        C5199c cVar = this.f26374s;
        if (cVar == null) {
            OneSignal.m40379b(OneSignal.LOG_LEVEL.ERROR, "No host presenter to trigger dismiss animation, counting as dismissed already", new Throwable());
            mo38849J();
            if (lVar != null) {
                lVar.onComplete();
                return;
            }
            return;
        }
        cVar.mo38709g();
        mo38851L(lVar);
    }

    /* renamed from: L */
    public final void mo38851L(WebViewManager.C5178l lVar) {
        OSUtils.m40269R(new C5254f(lVar), 600);
    }

    /* renamed from: M */
    public WebViewManager.Position mo38852M() {
        return this.f26371p;
    }

    /* renamed from: N */
    public final int mo38853N() {
        return C5336v0.m41351e(this.f26357b);
    }

    /* renamed from: O */
    public boolean mo38854O() {
        return this.f26368m;
    }

    /* renamed from: P */
    public void mo38855P() {
        OneSignal.m40387d1(OneSignal.LOG_LEVEL.DEBUG, "InAppMessageView removing views");
        Runnable runnable = this.f26376u;
        if (runnable != null) {
            this.f26358c.removeCallbacks(runnable);
            this.f26376u = null;
        }
        C5199c cVar = this.f26374s;
        if (cVar != null) {
            cVar.removeAllViews();
        }
        PopupWindow popupWindow = this.f26356a;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        mo38849J();
    }

    /* renamed from: Q */
    public final void mo38856Q(C5339w wVar) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (wVar.mo39138e()) {
            i = C5336v0.m41348b(24);
        } else {
            i = 0;
        }
        this.f26363h = i;
        if (wVar.mo39138e()) {
            i2 = C5336v0.m41348b(24);
        } else {
            i2 = 0;
        }
        this.f26364i = i2;
        if (wVar.mo39139f()) {
            i3 = C5336v0.m41348b(24);
        } else {
            i3 = 0;
        }
        this.f26361f = i3;
        if (wVar.mo39139f()) {
            i4 = C5336v0.m41348b(24);
        }
        this.f26362g = i4;
    }

    /* renamed from: R */
    public void mo38857R(C5258j jVar) {
        this.f26375t = jVar;
    }

    /* renamed from: S */
    public final void mo38858S(Context context, RelativeLayout.LayoutParams layoutParams, C5199c.C5202c cVar) {
        C5199c cVar2 = new C5199c(context);
        this.f26374s = cVar2;
        if (layoutParams != null) {
            cVar2.setLayoutParams(layoutParams);
        }
        this.f26374s.mo38711i(cVar);
        this.f26374s.mo38710h(new C5251c());
        if (this.f26372q.getParent() != null) {
            ((ViewGroup) this.f26372q.getParent()).removeAllViews();
        }
        CardView E = mo38844E(context);
        E.setTag("IN_APP_MESSAGE_CARD_VIEW_TAG");
        E.addView(this.f26372q);
        this.f26374s.setPadding(this.f26361f, this.f26363h, this.f26362g, this.f26364i);
        this.f26374s.setClipChildren(false);
        this.f26374s.setClipToPadding(false);
        this.f26374s.addView(E);
    }

    /* renamed from: T */
    public final void mo38859T(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.f26373r = relativeLayout;
        relativeLayout.setBackgroundDrawable(new ColorDrawable(0));
        this.f26373r.setClipChildren(false);
        this.f26373r.setClipToPadding(false);
        this.f26373r.addView(this.f26374s);
    }

    /* renamed from: U */
    public void mo38860U(WebView webView) {
        this.f26372q = webView;
        webView.setBackgroundColor(0);
    }

    /* renamed from: V */
    public final void mo38861V(WebViewManager.Position position, RelativeLayout.LayoutParams layoutParams, RelativeLayout.LayoutParams layoutParams2, C5199c.C5202c cVar) {
        OSUtils.m40270S(new C5250b(layoutParams, layoutParams2, cVar, position));
    }

    /* renamed from: W */
    public void mo38862W(Activity activity) {
        RelativeLayout.LayoutParams layoutParams;
        this.f26357b = activity;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, this.f26360e);
        layoutParams2.addRule(13);
        if (this.f26366k) {
            layoutParams = mo38846G();
        } else {
            layoutParams = null;
        }
        WebViewManager.Position position = this.f26371p;
        mo38861V(position, layoutParams2, layoutParams, mo38845F(this.f26360e, position, this.f26369n));
    }

    /* renamed from: X */
    public void mo38863X(Activity activity) {
        mo38848I(activity);
    }

    /* renamed from: Y */
    public final void mo38864Y() {
        if (this.f26365j > Utils.DOUBLE_EPSILON && this.f26376u == null) {
            C5252d dVar = new C5252d();
            this.f26376u = dVar;
            this.f26358c.postDelayed(dVar, ((long) this.f26365j) * 1000);
        }
    }

    /* renamed from: Z */
    public void mo38865Z(int i) {
        this.f26360e = i;
        OSUtils.m40270S(new C5249a(i));
    }

    public String toString() {
        return "InAppMessageView{currentActivity=" + this.f26357b + ", pageWidth=" + this.f26359d + ", pageHeight=" + this.f26360e + ", displayDuration=" + this.f26365j + ", hasBackground=" + this.f26366k + ", shouldDismissWhenActive=" + this.f26367l + ", isDragging=" + this.f26368m + ", disableDragDismiss=" + this.f26369n + ", displayLocation=" + this.f26371p + ", webView=" + this.f26372q + '}';
    }

    /* renamed from: v */
    public final void mo38867v(View view, WebViewManager.C5178l lVar) {
        View view2 = view;
        mo38868w(view2, 400, f26354w, f26353v, new C5256h(lVar)).start();
    }

    /* renamed from: w */
    public final ValueAnimator mo38868w(View view, int i, int i2, int i3, Animator.AnimatorListener animatorListener) {
        return zh4.m55122b(view, i, i2, i3, animatorListener);
    }

    /* renamed from: x */
    public final void mo38869x(View view, int i, Animation.AnimationListener animationListener) {
        zh4.m55121a(view, (float) (i + this.f26364i), Utils.FLOAT_EPSILON, 1000, new bi4(0.1d, 8.0d), animationListener).start();
    }

    /* renamed from: y */
    public final void mo38870y(View view, View view2, Animation.AnimationListener animationListener, Animator.AnimatorListener animatorListener) {
        Animation c = zh4.m55123c(view, 1000, new bi4(0.1d, 8.0d), animationListener);
        ValueAnimator w = mo38868w(view2, 400, f26353v, f26354w, animatorListener);
        c.start();
        w.start();
    }

    /* renamed from: z */
    public final void mo38871z(WebViewManager.Position position, View view, View view2) {
        CardView cardView = (CardView) view.findViewWithTag("IN_APP_MESSAGE_CARD_VIEW_TAG");
        Animation.AnimationListener D = mo38843D(cardView);
        int i = C5257i.f26394a[position.ordinal()];
        if (i == 1) {
            mo38840A(cardView, this.f26372q.getHeight(), D);
        } else if (i == 2) {
            mo38869x(cardView, this.f26372q.getHeight(), D);
        } else if (i == 3 || i == 4) {
            mo38870y(view, view2, D, (Animator.AnimatorListener) null);
        }
    }
}
