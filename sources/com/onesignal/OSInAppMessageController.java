package com.onesignal;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.onesignal.C5187b0;
import com.onesignal.C5318r0;
import com.onesignal.C5327t;
import com.onesignal.OSInAppMessageAction;
import com.onesignal.OneSignal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class OSInAppMessageController extends C5317r implements C5327t.C5330c, C5318r0.C5321c {

    /* renamed from: u */
    public static final Object f25915u = new Object();

    /* renamed from: v */
    public static ArrayList<String> f25916v = new ArrayList<String>() {
        {
            add("android");
            add("app");
            add("all");
        }
    };

    /* renamed from: a */
    public final ld4 f25917a;

    /* renamed from: b */
    public final C5323s0 f25918b;

    /* renamed from: c */
    public final vd3 f25919c;

    /* renamed from: d */
    public C5318r0 f25920d;

    /* renamed from: e */
    public C5187b0 f25921e;

    /* renamed from: f */
    public C5333u0 f25922f;

    /* renamed from: g */
    public ArrayList<bd4> f25923g;

    /* renamed from: h */
    public final Set<String> f25924h;

    /* renamed from: i */
    public final Set<String> f25925i;

    /* renamed from: j */
    public final Set<String> f25926j;

    /* renamed from: k */
    public final Set<String> f25927k;

    /* renamed from: l */
    public final ArrayList<bd4> f25928l;

    /* renamed from: m */
    public List<bd4> f25929m = null;

    /* renamed from: n */
    public C5345y f25930n = null;

    /* renamed from: o */
    public boolean f25931o = true;

    /* renamed from: p */
    public boolean f25932p = false;

    /* renamed from: q */
    public String f25933q = "";

    /* renamed from: r */
    public C5339w f25934r = null;

    /* renamed from: s */
    public boolean f25935s = false;

    /* renamed from: t */
    public Date f25936t = null;

    /* renamed from: com.onesignal.OSInAppMessageController$a */
    public class C5110a implements C5187b0.C5196i {

        /* renamed from: a */
        public final /* synthetic */ String f25937a;

        /* renamed from: b */
        public final /* synthetic */ bd4 f25938b;

        public C5110a(String str, bd4 bd4) {
            this.f25937a = str;
            this.f25938b = bd4;
        }

        /* renamed from: a */
        public void mo38522a(String str) {
        }

        /* renamed from: b */
        public void mo38523b(String str) {
            OSInAppMessageController.this.f25927k.remove(this.f25937a);
            this.f25938b.mo29546m(this.f25937a);
        }
    }

    /* renamed from: com.onesignal.OSInAppMessageController$b */
    public class C5111b extends C6751yw {

        /* renamed from: a */
        public final /* synthetic */ bd4 f25940a;

        public C5111b(bd4 bd4) {
            this.f25940a = bd4;
        }

        public void run() {
            super.run();
            OSInAppMessageController.this.f25921e.mo38681A(this.f25940a);
            OSInAppMessageController.this.f25921e.mo38682B(OSInAppMessageController.this.f25936t);
        }
    }

    /* renamed from: com.onesignal.OSInAppMessageController$c */
    public class C5112c implements OneSignal.C5158x {

        /* renamed from: a */
        public final /* synthetic */ boolean f25942a;

        /* renamed from: b */
        public final /* synthetic */ bd4 f25943b;

        public C5112c(boolean z, bd4 bd4) {
            this.f25942a = z;
            this.f25943b = bd4;
        }

        /* renamed from: a */
        public void mo38525a(JSONObject jSONObject) {
            boolean unused = OSInAppMessageController.this.f25935s = false;
            if (jSONObject != null) {
                String unused2 = OSInAppMessageController.this.f25933q = jSONObject.toString();
            }
            if (OSInAppMessageController.this.f25934r != null) {
                if (!this.f25942a) {
                    OneSignal.m40431s0().mo39069k(this.f25943b.f36112a);
                }
                C5339w n = OSInAppMessageController.this.f25934r;
                OSInAppMessageController oSInAppMessageController = OSInAppMessageController.this;
                n.mo39141h(oSInAppMessageController.mo38520t0(oSInAppMessageController.f25934r.mo39134a()));
                WebViewManager.m40516I(this.f25943b, OSInAppMessageController.this.f25934r);
                C5339w unused3 = OSInAppMessageController.this.f25934r = null;
            }
        }
    }

    /* renamed from: com.onesignal.OSInAppMessageController$d */
    public class C5113d implements C5187b0.C5196i {

        /* renamed from: a */
        public final /* synthetic */ bd4 f25945a;

        public C5113d(bd4 bd4) {
            this.f25945a = bd4;
        }

        /* renamed from: a */
        public void mo38522a(String str) {
            try {
                C5339w p = OSInAppMessageController.this.mo38508h0(new JSONObject(str), this.f25945a);
                if (p.mo39134a() == null) {
                    OSInAppMessageController.this.f25917a.debug("displayMessage:OnSuccess: No HTML retrieved from loadMessageContent");
                } else if (OSInAppMessageController.this.f25935s) {
                    C5339w unused = OSInAppMessageController.this.f25934r = p;
                } else {
                    OneSignal.m40431s0().mo39069k(this.f25945a.f36112a);
                    OSInAppMessageController.this.mo38506f0(this.f25945a);
                    p.mo39141h(OSInAppMessageController.this.mo38520t0(p.mo39134a()));
                    WebViewManager.m40516I(this.f25945a, p);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        /* renamed from: b */
        public void mo38523b(String str) {
            boolean unused = OSInAppMessageController.this.f25932p = false;
            try {
                if (new JSONObject(str).getBoolean("retry")) {
                    OSInAppMessageController.this.mo38511k0(this.f25945a);
                } else {
                    OSInAppMessageController.this.mo38496Y(this.f25945a, true);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.onesignal.OSInAppMessageController$e */
    public class C5114e implements C5187b0.C5196i {

        /* renamed from: a */
        public final /* synthetic */ bd4 f25947a;

        public C5114e(bd4 bd4) {
            this.f25947a = bd4;
        }

        /* renamed from: a */
        public void mo38522a(String str) {
            try {
                C5339w p = OSInAppMessageController.this.mo38508h0(new JSONObject(str), this.f25947a);
                if (p.mo39134a() == null) {
                    OSInAppMessageController.this.f25917a.debug("displayPreviewMessage:OnSuccess: No HTML retrieved from loadMessageContent");
                } else if (OSInAppMessageController.this.f25935s) {
                    C5339w unused = OSInAppMessageController.this.f25934r = p;
                } else {
                    OSInAppMessageController.this.mo38506f0(this.f25947a);
                    p.mo39141h(OSInAppMessageController.this.mo38520t0(p.mo39134a()));
                    WebViewManager.m40516I(this.f25947a, p);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        /* renamed from: b */
        public void mo38523b(String str) {
            OSInAppMessageController.this.mo38476E((bd4) null);
        }
    }

    /* renamed from: com.onesignal.OSInAppMessageController$f */
    public class C5115f extends C6751yw {
        public C5115f() {
        }

        public void run() {
            super.run();
            OSInAppMessageController.this.f25921e.mo38687h();
        }
    }

    /* renamed from: com.onesignal.OSInAppMessageController$g */
    public class C5116g extends C6751yw {
        public C5116g() {
        }

        public void run() {
            super.run();
            synchronized (OSInAppMessageController.f25915u) {
                OSInAppMessageController oSInAppMessageController = OSInAppMessageController.this;
                List unused = oSInAppMessageController.f25929m = oSInAppMessageController.f25921e.mo38690k();
                ld4 u = OSInAppMessageController.this.f25917a;
                u.debug("Retrieved IAMs from DB redisplayedInAppMessages: " + OSInAppMessageController.this.f25929m.toString());
            }
        }
    }

    /* renamed from: com.onesignal.OSInAppMessageController$h */
    public class C5117h implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ JSONArray f25951a;

        public C5117h(JSONArray jSONArray) {
            this.f25951a = jSONArray;
        }

        public void run() {
            OSInAppMessageController.this.mo38513m0();
            try {
                OSInAppMessageController.this.mo38510j0(this.f25951a);
            } catch (JSONException e) {
                OSInAppMessageController.this.f25917a.error("ERROR processing InAppMessageJson JSON Response.", e);
            }
        }
    }

    /* renamed from: com.onesignal.OSInAppMessageController$i */
    public class C5118i implements Runnable {
        public C5118i() {
        }

        public void run() {
            OSInAppMessageController.this.f25917a.debug("Delaying evaluateInAppMessages due to redisplay data not retrieved yet");
            OSInAppMessageController.this.mo38479H();
        }
    }

    /* renamed from: com.onesignal.OSInAppMessageController$j */
    public class C5119j implements C5187b0.C5196i {

        /* renamed from: a */
        public final /* synthetic */ bd4 f25954a;

        public C5119j(bd4 bd4) {
            this.f25954a = bd4;
        }

        /* renamed from: a */
        public void mo38522a(String str) {
        }

        /* renamed from: b */
        public void mo38523b(String str) {
            OSInAppMessageController.this.f25925i.remove(this.f25954a.f36112a);
        }
    }

    /* renamed from: com.onesignal.OSInAppMessageController$k */
    public class C5120k implements OneSignal.C5131c0 {

        /* renamed from: a */
        public final /* synthetic */ bd4 f25956a;

        /* renamed from: b */
        public final /* synthetic */ List f25957b;

        public C5120k(bd4 bd4, List list) {
            this.f25956a = bd4;
            this.f25957b = list;
        }

        /* renamed from: a */
        public void mo38528a(OneSignal.PromptActionResult promptActionResult) {
            C5345y unused = OSInAppMessageController.this.f25930n = null;
            ld4 u = OSInAppMessageController.this.f25917a;
            u.debug("IAM prompt to handle finished with result: " + promptActionResult);
            bd4 bd4 = this.f25956a;
            if (!bd4.f21255k || promptActionResult != OneSignal.PromptActionResult.LOCATION_PERMISSIONS_MISSING_MANIFEST) {
                OSInAppMessageController.this.mo38519s0(bd4, this.f25957b);
            } else {
                OSInAppMessageController.this.mo38518r0(bd4, this.f25957b);
            }
        }
    }

    /* renamed from: com.onesignal.OSInAppMessageController$l */
    public class C5121l implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ bd4 f25959a;

        /* renamed from: d */
        public final /* synthetic */ List f25960d;

        public C5121l(bd4 bd4, List list) {
            this.f25959a = bd4;
            this.f25960d = list;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            OSInAppMessageController.this.mo38519s0(this.f25959a, this.f25960d);
        }
    }

    /* renamed from: com.onesignal.OSInAppMessageController$m */
    public class C5122m implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f25962a;

        /* renamed from: d */
        public final /* synthetic */ OSInAppMessageAction f25963d;

        public C5122m(String str, OSInAppMessageAction oSInAppMessageAction) {
            this.f25962a = str;
            this.f25963d = oSInAppMessageAction;
        }

        public void run() {
            OneSignal.m40431s0().mo39066h(this.f25962a);
            OneSignal.f26056s.mo38594a(this.f25963d);
        }
    }

    /* renamed from: com.onesignal.OSInAppMessageController$n */
    public class C5123n implements C5187b0.C5196i {

        /* renamed from: a */
        public final /* synthetic */ String f25965a;

        public C5123n(String str) {
            this.f25965a = str;
        }

        /* renamed from: a */
        public void mo38522a(String str) {
        }

        /* renamed from: b */
        public void mo38523b(String str) {
            OSInAppMessageController.this.f25926j.remove(this.f25965a);
        }
    }

    public OSInAppMessageController(C5340w0 w0Var, C5323s0 s0Var, ld4 ld4, je4 je4, vd3 vd3) {
        this.f25918b = s0Var;
        this.f25923g = new ArrayList<>();
        Set<String> K = OSUtils.m40262K();
        this.f25924h = K;
        this.f25928l = new ArrayList<>();
        Set<String> K2 = OSUtils.m40262K();
        this.f25925i = K2;
        Set<String> K3 = OSUtils.m40262K();
        this.f25926j = K3;
        Set<String> K4 = OSUtils.m40262K();
        this.f25927k = K4;
        this.f25922f = new C5333u0(this);
        this.f25920d = new C5318r0(this);
        this.f25919c = vd3;
        this.f25917a = ld4;
        C5187b0 P = mo38487P(w0Var, ld4, je4);
        this.f25921e = P;
        Set<String> m = P.mo38692m();
        if (m != null) {
            K.addAll(m);
        }
        Set<String> p = this.f25921e.mo38695p();
        if (p != null) {
            K2.addAll(p);
        }
        Set<String> s = this.f25921e.mo38698s();
        if (s != null) {
            K3.addAll(s);
        }
        Set<String> l = this.f25921e.mo38691l();
        if (l != null) {
            K4.addAll(l);
        }
        Date q = this.f25921e.mo38696q();
        if (q != null) {
            this.f25936t = q;
        }
        mo38490S();
    }

    /* renamed from: B */
    public final void mo38473B() {
        synchronized (this.f25928l) {
            if (!this.f25920d.mo39088c()) {
                this.f25917a.mo38717b("In app message not showing due to system condition not correct");
                return;
            }
            ld4 ld4 = this.f25917a;
            ld4.debug("displayFirstIAMOnQueue: " + this.f25928l);
            if (this.f25928l.size() <= 0 || mo38492U()) {
                ld4 ld42 = this.f25917a;
                ld42.debug("In app message is currently showing or there are no IAMs left in the queue! isInAppMessageShowing: " + mo38492U());
                return;
            }
            this.f25917a.debug("No IAM showing currently, showing first item in the queue!");
            mo38477F(this.f25928l.get(0));
        }
    }

    /* renamed from: C */
    public final void mo38474C(bd4 bd4, List<C5345y> list) {
        if (list.size() > 0) {
            ld4 ld4 = this.f25917a;
            ld4.debug("IAM showing prompts from IAM: " + bd4.toString());
            WebViewManager.m40534x();
            mo38519s0(bd4, list);
        }
    }

    /* renamed from: D */
    public void mo38475D() {
        mo39086d(new C5115f(), "OS_IAM_DB_ACCESS");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009e, code lost:
        return;
     */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo38476E(p000.bd4 r6) {
        /*
            r5 = this;
            com.onesignal.p0 r0 = com.onesignal.OneSignal.m40431s0()
            r0.mo39067i()
            boolean r0 = r5.mo38517q0()
            if (r0 == 0) goto L_0x0015
            ld4 r6 = r5.f25917a
            java.lang.String r0 = "Stop evaluateMessageDisplayQueue because prompt is currently displayed"
            r6.debug(r0)
            return
        L_0x0015:
            r0 = 0
            r5.f25932p = r0
            java.util.ArrayList<bd4> r1 = r5.f25928l
            monitor-enter(r1)
            if (r6 == 0) goto L_0x005f
            boolean r2 = r6.f21255k     // Catch:{ all -> 0x009f }
            if (r2 != 0) goto L_0x005f
            java.util.ArrayList<bd4> r2 = r5.f25928l     // Catch:{ all -> 0x009f }
            int r2 = r2.size()     // Catch:{ all -> 0x009f }
            if (r2 <= 0) goto L_0x005f
            java.util.ArrayList<bd4> r2 = r5.f25928l     // Catch:{ all -> 0x009f }
            boolean r6 = r2.contains(r6)     // Catch:{ all -> 0x009f }
            if (r6 != 0) goto L_0x003a
            ld4 r6 = r5.f25917a     // Catch:{ all -> 0x009f }
            java.lang.String r0 = "Message already removed from the queue!"
            r6.debug(r0)     // Catch:{ all -> 0x009f }
            monitor-exit(r1)     // Catch:{ all -> 0x009f }
            return
        L_0x003a:
            java.util.ArrayList<bd4> r6 = r5.f25928l     // Catch:{ all -> 0x009f }
            java.lang.Object r6 = r6.remove(r0)     // Catch:{ all -> 0x009f }
            bd4 r6 = (p000.bd4) r6     // Catch:{ all -> 0x009f }
            java.lang.String r6 = r6.f36112a     // Catch:{ all -> 0x009f }
            ld4 r2 = r5.f25917a     // Catch:{ all -> 0x009f }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x009f }
            r3.<init>()     // Catch:{ all -> 0x009f }
            java.lang.String r4 = "In app message with id: "
            r3.append(r4)     // Catch:{ all -> 0x009f }
            r3.append(r6)     // Catch:{ all -> 0x009f }
            java.lang.String r6 = ", dismissed (removed) from the queue!"
            r3.append(r6)     // Catch:{ all -> 0x009f }
            java.lang.String r6 = r3.toString()     // Catch:{ all -> 0x009f }
            r2.debug(r6)     // Catch:{ all -> 0x009f }
        L_0x005f:
            java.util.ArrayList<bd4> r6 = r5.f25928l     // Catch:{ all -> 0x009f }
            int r6 = r6.size()     // Catch:{ all -> 0x009f }
            if (r6 <= 0) goto L_0x0093
            ld4 r6 = r5.f25917a     // Catch:{ all -> 0x009f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x009f }
            r2.<init>()     // Catch:{ all -> 0x009f }
            java.lang.String r3 = "In app message on queue available: "
            r2.append(r3)     // Catch:{ all -> 0x009f }
            java.util.ArrayList<bd4> r3 = r5.f25928l     // Catch:{ all -> 0x009f }
            java.lang.Object r3 = r3.get(r0)     // Catch:{ all -> 0x009f }
            bd4 r3 = (p000.bd4) r3     // Catch:{ all -> 0x009f }
            java.lang.String r3 = r3.f36112a     // Catch:{ all -> 0x009f }
            r2.append(r3)     // Catch:{ all -> 0x009f }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x009f }
            r6.debug(r2)     // Catch:{ all -> 0x009f }
            java.util.ArrayList<bd4> r6 = r5.f25928l     // Catch:{ all -> 0x009f }
            java.lang.Object r6 = r6.get(r0)     // Catch:{ all -> 0x009f }
            bd4 r6 = (p000.bd4) r6     // Catch:{ all -> 0x009f }
            r5.mo38477F(r6)     // Catch:{ all -> 0x009f }
            goto L_0x009d
        L_0x0093:
            ld4 r6 = r5.f25917a     // Catch:{ all -> 0x009f }
            java.lang.String r0 = "In app message dismissed evaluating messages"
            r6.debug(r0)     // Catch:{ all -> 0x009f }
            r5.mo38479H()     // Catch:{ all -> 0x009f }
        L_0x009d:
            monitor-exit(r1)     // Catch:{ all -> 0x009f }
            return
        L_0x009f:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x009f }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.OSInAppMessageController.mo38476E(bd4):void");
    }

    /* renamed from: F */
    public final void mo38477F(bd4 bd4) {
        if (!this.f25931o) {
            this.f25917a.mo38716a("In app messaging is currently paused, in app messages will not be shown!");
            return;
        }
        this.f25932p = true;
        mo38488Q(bd4, false);
        this.f25921e.mo38693n(OneSignal.f26034g, bd4.f36112a, mo38521u0(bd4), new C5113d(bd4));
    }

    /* renamed from: G */
    public void mo38478G(String str) {
        this.f25932p = true;
        bd4 bd4 = new bd4(true);
        mo38488Q(bd4, true);
        this.f25921e.mo38694o(OneSignal.f26034g, str, new C5114e(bd4));
    }

    /* renamed from: H */
    public final void mo38479H() {
        this.f25917a.debug("Starting evaluateInAppMessages");
        if (mo38516p0()) {
            this.f25918b.mo39099c(new C5118i());
            return;
        }
        Iterator<bd4> it = this.f25923g.iterator();
        while (it.hasNext()) {
            bd4 next = it.next();
            if (this.f25922f.mo39121b(next)) {
                mo38515o0(next);
                if (!this.f25924h.contains(next.f36112a) && !next.mo29540h()) {
                    mo38511k0(next);
                }
            }
        }
    }

    /* renamed from: I */
    public void mo38480I(Runnable runnable) {
        synchronized (f25915u) {
            if (mo38516p0()) {
                this.f25917a.debug("Delaying task due to redisplay data not retrieved yet");
                this.f25918b.mo39099c(runnable);
            } else {
                runnable.run();
            }
        }
    }

    /* renamed from: J */
    public final void mo38481J(OSInAppMessageAction oSInAppMessageAction) {
        if (oSInAppMessageAction.mo38462b() != null && !oSInAppMessageAction.mo38462b().isEmpty()) {
            if (oSInAppMessageAction.mo38466f() == OSInAppMessageAction.OSInAppMessageActionUrlType.BROWSER) {
                OSUtils.m40265N(oSInAppMessageAction.mo38462b());
            } else if (oSInAppMessageAction.mo38466f() == OSInAppMessageAction.OSInAppMessageActionUrlType.IN_APP_WEBVIEW) {
                ci4.m33054b(oSInAppMessageAction.mo38462b(), true);
            }
        }
    }

    /* renamed from: K */
    public final void mo38482K(String str, List<cd4> list) {
        OneSignal.m40431s0().mo39066h(str);
        OneSignal.m40447x1(list);
    }

    /* renamed from: L */
    public final void mo38483L(String str, OSInAppMessageAction oSInAppMessageAction) {
        if (OneSignal.f26056s != null) {
            OSUtils.m40270S(new C5122m(str, oSInAppMessageAction));
        }
    }

    /* renamed from: M */
    public final void mo38484M(bd4 bd4, OSInAppMessageAction oSInAppMessageAction) {
        boolean z;
        String u0 = mo38521u0(bd4);
        if (u0 != null) {
            String a = oSInAppMessageAction.mo38461a();
            if (!bd4.mo29536e().mo38674e() || !bd4.mo29538f(a)) {
                z = false;
            } else {
                z = true;
            }
            if (z || !this.f25927k.contains(a)) {
                this.f25927k.add(a);
                bd4.mo29532a(a);
                this.f25921e.mo38684D(OneSignal.f26034g, OneSignal.m40452z0(), u0, new OSUtils().mo38560e(), bd4.f36112a, a, oSInAppMessageAction.mo38467g(), this.f25927k, new C5110a(a, bd4));
            }
        }
    }

    /* renamed from: N */
    public final void mo38485N(bd4 bd4, dd4 dd4) {
        String u0 = mo38521u0(bd4);
        if (u0 != null) {
            String a = dd4.mo41905a();
            String str = bd4.f36112a + a;
            if (this.f25926j.contains(str)) {
                this.f25917a.mo38716a("Already sent page impression for id: " + a);
                return;
            }
            this.f25926j.add(str);
            this.f25921e.mo38686F(OneSignal.f26034g, OneSignal.m40452z0(), u0, new OSUtils().mo38560e(), bd4.f36112a, a, this.f25926j, new C5123n(str));
        }
    }

    /* renamed from: O */
    public final void mo38486O(OSInAppMessageAction oSInAppMessageAction) {
        if (oSInAppMessageAction.mo38465e() != null) {
            gd4 e = oSInAppMessageAction.mo38465e();
            if (e.mo42871a() != null) {
                OneSignal.m40453z1(e.mo42871a());
            }
            if (e.mo42872b() != null) {
                OneSignal.m40316E(e.mo42872b(), (OneSignal.C5153s) null);
            }
        }
    }

    /* renamed from: P */
    public C5187b0 mo38487P(C5340w0 w0Var, ld4 ld4, je4 je4) {
        if (this.f25921e == null) {
            this.f25921e = new C5187b0(w0Var, ld4, je4);
        }
        return this.f25921e;
    }

    /* renamed from: Q */
    public final void mo38488Q(bd4 bd4, boolean z) {
        this.f25935s = false;
        if (z || bd4.mo29535d()) {
            this.f25935s = true;
            OneSignal.m40440v0(new C5112c(z, bd4));
        }
    }

    /* renamed from: R */
    public final boolean mo38489R(bd4 bd4) {
        boolean z;
        if (this.f25922f.mo39124e(bd4)) {
            return !bd4.mo29539g();
        }
        if (bd4.mo29539g() || !bd4.f21247c.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (bd4.mo29542i() || z) {
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public void mo38490S() {
        this.f25918b.mo39099c(new C5116g());
        this.f25918b.mo39102f();
    }

    /* renamed from: T */
    public void mo38491T() {
        if (!this.f25923g.isEmpty()) {
            ld4 ld4 = this.f25917a;
            ld4.debug("initWithCachedInAppMessages with already in memory messages: " + this.f25923g);
            return;
        }
        String r = this.f25921e.mo38697r();
        ld4 ld42 = this.f25917a;
        ld42.debug("initWithCachedInAppMessages: " + r);
        if (r != null && !r.isEmpty()) {
            synchronized (f25915u) {
                try {
                    if (this.f25923g.isEmpty()) {
                        mo38510j0(new JSONArray(r));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: U */
    public boolean mo38492U() {
        return this.f25932p;
    }

    /* renamed from: V */
    public final void mo38493V(OSInAppMessageAction oSInAppMessageAction) {
        if (oSInAppMessageAction.mo38465e() != null) {
            ld4 ld4 = this.f25917a;
            ld4.debug("Tags detected inside of the action click payload, ignoring because action came from IAM preview:: " + oSInAppMessageAction.mo38465e().toString());
        }
        if (oSInAppMessageAction.mo38463c().size() > 0) {
            ld4 ld42 = this.f25917a;
            ld42.debug("Outcomes detected inside of the action click payload, ignoring because action came from IAM preview: " + oSInAppMessageAction.mo38463c().toString());
        }
    }

    /* renamed from: W */
    public final void mo38494W(Collection<String> collection) {
        Iterator<bd4> it = this.f25923g.iterator();
        while (it.hasNext()) {
            bd4 next = it.next();
            if (!next.mo29542i() && this.f25929m.contains(next) && this.f25922f.mo39123d(next, collection)) {
                ld4 ld4 = this.f25917a;
                ld4.debug("Trigger changed for message: " + next.toString());
                next.mo29549p(true);
            }
        }
    }

    /* renamed from: X */
    public void mo38495X(bd4 bd4) {
        mo38496Y(bd4, false);
    }

    /* renamed from: Y */
    public void mo38496Y(bd4 bd4, boolean z) {
        if (!bd4.f21255k) {
            this.f25924h.add(bd4.f36112a);
            if (!z) {
                this.f25921e.mo38703x(this.f25924h);
                this.f25936t = new Date();
                mo38509i0(bd4);
            }
            ld4 ld4 = this.f25917a;
            ld4.debug("OSInAppMessageController messageWasDismissed dismissedMessages: " + this.f25924h.toString());
        }
        if (!mo38517q0()) {
            mo38501b0(bd4);
        }
        mo38476E(bd4);
    }

    /* renamed from: Z */
    public void mo38497Z(bd4 bd4, JSONObject jSONObject) throws JSONException {
        OSInAppMessageAction oSInAppMessageAction = new OSInAppMessageAction(jSONObject);
        oSInAppMessageAction.mo38470j(bd4.mo29550q());
        mo38483L(bd4.f36112a, oSInAppMessageAction);
        mo38474C(bd4, oSInAppMessageAction.mo38464d());
        mo38481J(oSInAppMessageAction);
        mo38484M(bd4, oSInAppMessageAction);
        mo38486O(oSInAppMessageAction);
        mo38482K(bd4.f36112a, oSInAppMessageAction.mo38463c());
    }

    /* renamed from: a */
    public void mo38498a() {
        mo38473B();
    }

    /* renamed from: a0 */
    public void mo38499a0(bd4 bd4, JSONObject jSONObject) throws JSONException {
        OSInAppMessageAction oSInAppMessageAction = new OSInAppMessageAction(jSONObject);
        oSInAppMessageAction.mo38470j(bd4.mo29550q());
        mo38483L(bd4.f36112a, oSInAppMessageAction);
        mo38474C(bd4, oSInAppMessageAction.mo38464d());
        mo38481J(oSInAppMessageAction);
        mo38493V(oSInAppMessageAction);
    }

    /* renamed from: b */
    public void mo38500b() {
        this.f25917a.debug("messageTriggerConditionChanged called");
        mo38479H();
    }

    /* renamed from: b0 */
    public void mo38501b0(bd4 bd4) {
        this.f25917a.mo38716a("OSInAppMessageController onMessageDidDismiss: inAppMessageLifecycleHandler is null");
    }

    /* renamed from: c */
    public void mo38502c(String str) {
        ld4 ld4 = this.f25917a;
        ld4.debug("messageDynamicTriggerCompleted called with triggerId: " + str);
        HashSet hashSet = new HashSet();
        hashSet.add(str);
        mo38494W(hashSet);
    }

    /* renamed from: c0 */
    public void mo38503c0(bd4 bd4) {
        this.f25917a.mo38716a("OSInAppMessageController onMessageDidDisplay: inAppMessageLifecycleHandler is null");
    }

    /* renamed from: d0 */
    public void mo38504d0(bd4 bd4) {
        mo38503c0(bd4);
        if (!bd4.f21255k && !this.f25925i.contains(bd4.f36112a)) {
            this.f25925i.add(bd4.f36112a);
            String u0 = mo38521u0(bd4);
            if (u0 != null) {
                this.f25921e.mo38685E(OneSignal.f26034g, OneSignal.m40452z0(), u0, new OSUtils().mo38560e(), bd4.f36112a, this.f25925i, new C5119j(bd4));
            }
        }
    }

    /* renamed from: e0 */
    public void mo38505e0(bd4 bd4) {
        this.f25917a.mo38716a("OSInAppMessageController onMessageWillDismiss: inAppMessageLifecycleHandler is null");
    }

    /* renamed from: f0 */
    public void mo38506f0(bd4 bd4) {
        this.f25917a.mo38716a("OSInAppMessageController onMessageWillDisplay: inAppMessageLifecycleHandler is null");
    }

    /* renamed from: g0 */
    public void mo38507g0(bd4 bd4, JSONObject jSONObject) {
        dd4 dd4 = new dd4(jSONObject);
        if (!bd4.f21255k) {
            mo38485N(bd4, dd4);
        }
    }

    /* renamed from: h0 */
    public final C5339w mo38508h0(JSONObject jSONObject, bd4 bd4) {
        C5339w wVar = new C5339w(jSONObject);
        bd4.mo29547n(wVar.mo39135b().doubleValue());
        return wVar;
    }

    /* renamed from: i0 */
    public final void mo38509i0(bd4 bd4) {
        bd4.mo29536e().mo38677h(OneSignal.m40443w0().mo46064a() / 1000);
        bd4.mo29536e().mo38672c();
        bd4.mo29549p(false);
        bd4.mo29548o(true);
        mo39086d(new C5111b(bd4), "OS_IAM_DB_ACCESS");
        int indexOf = this.f25929m.indexOf(bd4);
        if (indexOf != -1) {
            this.f25929m.set(indexOf, bd4);
        } else {
            this.f25929m.add(bd4);
        }
        ld4 ld4 = this.f25917a;
        ld4.debug("persistInAppMessageForRedisplay: " + bd4.toString() + " with msg array data: " + this.f25929m.toString());
    }

    /* renamed from: j0 */
    public final void mo38510j0(JSONArray jSONArray) throws JSONException {
        synchronized (f25915u) {
            ArrayList<bd4> arrayList = new ArrayList<>();
            for (int i = 0; i < jSONArray.length(); i++) {
                bd4 bd4 = new bd4(jSONArray.getJSONObject(i));
                if (bd4.f36112a != null) {
                    arrayList.add(bd4);
                }
            }
            this.f25923g = arrayList;
        }
        mo38479H();
    }

    /* renamed from: k0 */
    public final void mo38511k0(bd4 bd4) {
        synchronized (this.f25928l) {
            if (!this.f25928l.contains(bd4)) {
                this.f25928l.add(bd4);
                ld4 ld4 = this.f25917a;
                ld4.debug("In app message with id: " + bd4.f36112a + ", added to the queue");
            }
            mo38473B();
        }
    }

    /* renamed from: l0 */
    public void mo38512l0(JSONArray jSONArray) throws JSONException {
        this.f25921e.mo38704y(jSONArray.toString());
        mo38480I(new C5117h(jSONArray));
    }

    /* renamed from: m0 */
    public final void mo38513m0() {
        for (bd4 o : this.f25929m) {
            o.mo29548o(false);
        }
    }

    /* renamed from: n0 */
    public void mo38514n0() {
        C5327t.m41325e();
    }

    /* renamed from: o0 */
    public final void mo38515o0(bd4 bd4) {
        boolean contains = this.f25924h.contains(bd4.f36112a);
        int indexOf = this.f25929m.indexOf(bd4);
        if (contains && indexOf != -1) {
            bd4 bd42 = this.f25929m.get(indexOf);
            bd4.mo29536e().mo38676g(bd42.mo29536e());
            bd4.mo29548o(bd42.mo29539g());
            boolean R = mo38489R(bd4);
            ld4 ld4 = this.f25917a;
            ld4.debug("setDataForRedisplay: " + bd4.toString() + " triggerHasChanged: " + R);
            if (R && bd4.mo29536e().mo38673d() && bd4.mo29536e().mo38678i()) {
                ld4 ld42 = this.f25917a;
                ld42.debug("setDataForRedisplay message available for redisplay: " + bd4.f36112a);
                this.f25924h.remove(bd4.f36112a);
                this.f25925i.remove(bd4.f36112a);
                this.f25926j.clear();
                this.f25921e.mo38683C(this.f25926j);
                bd4.mo29533b();
            }
        }
    }

    /* renamed from: p0 */
    public boolean mo38516p0() {
        boolean z;
        synchronized (f25915u) {
            if (this.f25929m != null || !this.f25918b.mo39101e()) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: q0 */
    public final boolean mo38517q0() {
        if (this.f25930n != null) {
            return true;
        }
        return false;
    }

    /* renamed from: r0 */
    public final void mo38518r0(bd4 bd4, List<C5345y> list) {
        String string = OneSignal.f26030e.getString(z45.location_permission_missing_title);
        new AlertDialog.Builder(OneSignal.m40352Q()).setTitle(string).setMessage(OneSignal.f26030e.getString(z45.location_permission_missing_message)).setPositiveButton(17039370, new C5121l(bd4, list)).show();
    }

    /* renamed from: s0 */
    public final void mo38519s0(bd4 bd4, List<C5345y> list) {
        Iterator<C5345y> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C5345y next = it.next();
            if (!next.mo39165c()) {
                this.f25930n = next;
                break;
            }
        }
        if (this.f25930n != null) {
            ld4 ld4 = this.f25917a;
            ld4.debug("IAM prompt to handle: " + this.f25930n.toString());
            this.f25930n.mo39166d(true);
            this.f25930n.mo39158b(new C5120k(bd4, list));
            return;
        }
        ld4 ld42 = this.f25917a;
        ld42.debug("No IAM prompt to handle, dismiss message: " + bd4.f36112a);
        mo38495X(bd4);
    }

    /* renamed from: t0 */
    public String mo38520t0(String str) {
        String str2 = this.f25933q;
        return str + String.format("\n\n<script>\n    setPlayerTags(%s);\n</script>", new Object[]{str2});
    }

    /* renamed from: u0 */
    public final String mo38521u0(bd4 bd4) {
        String b = this.f25919c.mo48731b();
        Iterator<String> it = f25916v.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (bd4.f21246b.containsKey(next)) {
                HashMap hashMap = bd4.f21246b.get(next);
                if (hashMap.containsKey(b)) {
                    return (String) hashMap.get(b);
                }
                return (String) hashMap.get("default");
            }
        }
        return null;
    }
}
