package com.onesignal;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.onesignal.C5197b1;
import com.onesignal.C5221e1;
import com.onesignal.C5224f0;
import com.onesignal.C5296n1;
import com.onesignal.C5308p0;
import com.onesignal.C5346y0;
import com.onesignal.C5355z0;
import com.onesignal.LocationController;
import com.onesignal.OSNotificationAction;
import com.onesignal.OneSignalStateSynchronizer;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class OneSignal {

    /* renamed from: A */
    public static FocusTimeController f25996A;

    /* renamed from: B */
    public static C5308p0.C5310b f25997B = new C5130c();

    /* renamed from: C */
    public static ad4 f25998C = new ad4();

    /* renamed from: D */
    public static ne4 f25999D = new oe4();

    /* renamed from: E */
    public static C5305o0 f26000E = new C5305o0();

    /* renamed from: F */
    public static C5323s0 f26001F = new C5323s0(f26063z);

    /* renamed from: G */
    public static me4 f26002G = new me4(f26000E, f26063z);

    /* renamed from: H */
    public static yh4 f26003H = new C5184a1();

    /* renamed from: I */
    public static je4 f26004I;

    /* renamed from: J */
    public static qe4 f26005J;

    /* renamed from: K */
    public static C5308p0 f26006K;

    /* renamed from: L */
    public static C5282l0 f26007L;

    /* renamed from: M */
    public static vd4 f26008M;

    /* renamed from: N */
    public static C5224f0 f26009N;

    /* renamed from: O */
    public static final Object f26010O = new C5145k();

    /* renamed from: P */
    public static String f26011P = "native";

    /* renamed from: Q */
    public static String f26012Q;

    /* renamed from: R */
    public static OSUtils f26013R = new OSUtils();

    /* renamed from: S */
    public static boolean f26014S;

    /* renamed from: T */
    public static boolean f26015T;

    /* renamed from: U */
    public static boolean f26016U;

    /* renamed from: V */
    public static boolean f26017V;

    /* renamed from: W */
    public static boolean f26018W;

    /* renamed from: X */
    public static LocationController.C5105d f26019X;

    /* renamed from: Y */
    public static Collection<JSONArray> f26020Y = new ArrayList();

    /* renamed from: Z */
    public static HashSet<String> f26021Z = new HashSet<>();

    /* renamed from: a */
    public static C5137f0 f26022a;

    /* renamed from: a0 */
    public static final ArrayList<C5158x> f26023a0 = new ArrayList<>();

    /* renamed from: b */
    public static C5155u f26024b;

    /* renamed from: b0 */
    public static lb1 f26025b0;

    /* renamed from: c */
    public static C5155u f26026c;

    /* renamed from: c0 */
    public static C5292m0 f26027c0;

    /* renamed from: d */
    public static List<C5156v> f26028d = new ArrayList();

    /* renamed from: d0 */
    public static C5292m0 f26029d0;

    /* renamed from: e */
    public static Context f26030e;

    /* renamed from: e0 */
    public static C5277k0<Object, ge4> f26031e0;

    /* renamed from: f */
    public static WeakReference<Activity> f26032f;

    /* renamed from: f0 */
    public static OSSubscriptionState f26033f0;

    /* renamed from: g */
    public static String f26034g;

    /* renamed from: g0 */
    public static OSSubscriptionState f26035g0;

    /* renamed from: h */
    public static String f26036h;

    /* renamed from: h0 */
    public static C5277k0<Object, le4> f26037h0;

    /* renamed from: i */
    public static LOG_LEVEL f26038i = LOG_LEVEL.NONE;

    /* renamed from: i0 */
    public static xc4 f26039i0;

    /* renamed from: j */
    public static LOG_LEVEL f26040j = LOG_LEVEL.WARN;

    /* renamed from: j0 */
    public static xc4 f26041j0;

    /* renamed from: k */
    public static String f26042k = null;

    /* renamed from: k0 */
    public static C5277k0<Object, yc4> f26043k0;

    /* renamed from: l */
    public static String f26044l = null;

    /* renamed from: l0 */
    public static he4 f26045l0;

    /* renamed from: m */
    public static String f26046m = null;

    /* renamed from: m0 */
    public static he4 f26047m0;

    /* renamed from: n */
    public static int f26048n = Integer.MAX_VALUE;

    /* renamed from: n0 */
    public static C5277k0<Object, ie4> f26049n0;

    /* renamed from: o */
    public static vd3 f26050o = null;

    /* renamed from: o0 */
    public static C5157w f26051o0;

    /* renamed from: p */
    public static C5133d0 f26052p;

    /* renamed from: p0 */
    public static C5197b1 f26053p0;

    /* renamed from: q */
    public static C5129b0 f26054q;

    /* renamed from: r */
    public static C5127a0 f26055r;

    /* renamed from: s */
    public static C5159y f26056s;

    /* renamed from: t */
    public static boolean f26057t;

    /* renamed from: u */
    public static boolean f26058u;

    /* renamed from: v */
    public static AppEntryAction f26059v = AppEntryAction.APP_CLOSE;

    /* renamed from: w */
    public static C5244h1 f26060w;

    /* renamed from: x */
    public static C5236g1 f26061x;

    /* renamed from: y */
    public static ss6 f26062y;

    /* renamed from: z */
    public static ld4 f26063z = new C5203c0();

    public enum AppEntryAction {
        NOTIFICATION_CLICK,
        APP_OPEN,
        APP_CLOSE;

        public boolean isAppClose() {
            return equals(APP_CLOSE);
        }

        public boolean isAppOpen() {
            return equals(APP_OPEN);
        }

        public boolean isNotificationClick() {
            return equals(NOTIFICATION_CLICK);
        }
    }

    public enum EmailErrorType {
        VALIDATION,
        REQUIRES_EMAIL_AUTH,
        INVALID_OPERATION,
        NETWORK
    }

    public enum LOG_LEVEL {
        NONE,
        FATAL,
        ERROR,
        WARN,
        INFO,
        DEBUG,
        VERBOSE
    }

    public enum PromptActionResult {
        PERMISSION_GRANTED,
        PERMISSION_DENIED,
        LOCATION_PERMISSIONS_MISSING_MANIFEST,
        ERROR
    }

    public enum SMSErrorType {
        VALIDATION,
        REQUIRES_SMS_AUTH,
        INVALID_OPERATION,
        NETWORK
    }

    /* renamed from: com.onesignal.OneSignal$a */
    public class C5126a implements Runnable {
        public void run() {
            try {
                OneSignal.m40414m1();
            } catch (JSONException e) {
                OneSignal.m40379b(LOG_LEVEL.FATAL, "FATAL Error registering device!", e);
            }
        }
    }

    /* renamed from: com.onesignal.OneSignal$a0 */
    public interface C5127a0 {
        /* renamed from: a */
        void mo38569a(C5259i0 i0Var);
    }

    /* renamed from: com.onesignal.OneSignal$b */
    public class C5128b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ JSONObject f26069a;

        /* renamed from: d */
        public final /* synthetic */ C5153s f26070d;

        public C5128b(JSONObject jSONObject, C5153s sVar) {
            this.f26069a = jSONObject;
            this.f26070d = sVar;
        }

        public void run() {
            OneSignal.f26063z.debug("Running sendTags() operation from pending task queue.");
            OneSignal.m40306A1(this.f26069a, this.f26070d);
        }
    }

    /* renamed from: com.onesignal.OneSignal$b0 */
    public interface C5129b0 {
        /* renamed from: a */
        void mo38571a(C5266j0 j0Var);
    }

    /* renamed from: com.onesignal.OneSignal$c */
    public class C5130c implements C5308p0.C5310b {
        /* renamed from: a */
        public void mo38572a(List<id4> list) {
            if (OneSignal.f26007L == null) {
                OneSignal.m40376a(LOG_LEVEL.WARN, "OneSignal onSessionEnding called before init!");
            }
            if (OneSignal.f26007L != null) {
                OneSignal.f26007L.mo38964e();
            }
            OneSignal.m40380b0().mo38396g(list);
        }
    }

    /* renamed from: com.onesignal.OneSignal$c0 */
    public interface C5131c0 {
        /* renamed from: a */
        void mo38528a(PromptActionResult promptActionResult);
    }

    /* renamed from: com.onesignal.OneSignal$d */
    public class C5132d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ JSONObject f26071a;

        /* renamed from: d */
        public final /* synthetic */ C5153s f26072d;

        public C5132d(JSONObject jSONObject, C5153s sVar) {
            this.f26071a = jSONObject;
            this.f26072d = sVar;
        }

        public void run() {
            if (this.f26071a == null) {
                OneSignal.f26063z.error("Attempted to send null tags");
                C5153s sVar = this.f26072d;
                if (sVar != null) {
                    sVar.mo38590b(new C5143i0(-1, "Attempted to send null tags"));
                    return;
                }
                return;
            }
            JSONObject jSONObject = OneSignalStateSynchronizer.m40483h(false).f26491b;
            JSONObject jSONObject2 = new JSONObject();
            Iterator<String> keys = this.f26071a.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    Object opt = this.f26071a.opt(next);
                    if (!(opt instanceof JSONArray)) {
                        if (!(opt instanceof JSONObject)) {
                            if (!this.f26071a.isNull(next)) {
                                if (!"".equals(opt)) {
                                    jSONObject2.put(next, opt.toString());
                                }
                            }
                            if (jSONObject != null && jSONObject.has(next)) {
                                jSONObject2.put(next, "");
                            }
                        }
                    }
                    LOG_LEVEL log_level = LOG_LEVEL.ERROR;
                    OneSignal.m40376a(log_level, "Omitting key '" + next + "'! sendTags DO NOT supported nested values!");
                } catch (Throwable unused) {
                }
            }
            if (!jSONObject2.toString().equals("{}")) {
                ld4 d = OneSignal.f26063z;
                d.debug("Available tags to send: " + jSONObject2.toString());
                OneSignalStateSynchronizer.m40492q(jSONObject2, this.f26072d);
                return;
            }
            OneSignal.f26063z.debug("Send tags ended successfully");
            C5153s sVar2 = this.f26072d;
            if (sVar2 != null) {
                sVar2.mo38589a(jSONObject);
            }
        }
    }

    /* renamed from: com.onesignal.OneSignal$d0 */
    public interface C5133d0 {
        /* renamed from: a */
        void mo38574a(Context context, C5266j0 j0Var);
    }

    /* renamed from: com.onesignal.OneSignal$e */
    public class C5134e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C5158x f26073a;

        public C5134e(C5158x xVar) {
            this.f26073a = xVar;
        }

        public void run() {
            OneSignal.f26063z.debug("Running getTags() operation from pending queue.");
            OneSignal.m40440v0(this.f26073a);
        }
    }

    /* renamed from: com.onesignal.OneSignal$e0 */
    public static class C5135e0 {

        /* renamed from: a */
        public SMSErrorType f26074a;

        /* renamed from: b */
        public String f26075b;

        public C5135e0(SMSErrorType sMSErrorType, String str) {
            this.f26074a = sMSErrorType;
            this.f26075b = str;
        }
    }

    /* renamed from: com.onesignal.OneSignal$f */
    public class C5136f implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C5158x f26076a;

        public C5136f(C5158x xVar) {
            this.f26076a = xVar;
        }

        public void run() {
            synchronized (OneSignal.f26023a0) {
                OneSignal.f26023a0.add(this.f26076a);
                if (OneSignal.f26023a0.size() <= 1) {
                    OneSignal.m40426q1();
                }
            }
        }
    }

    /* renamed from: com.onesignal.OneSignal$f0 */
    public interface C5137f0 {
        /* renamed from: a */
        void mo38577a(JSONObject jSONObject);

        /* renamed from: b */
        void mo38578b(C5135e0 e0Var);
    }

    /* renamed from: com.onesignal.OneSignal$g */
    public class C5138g implements Runnable {
        public void run() {
            JSONObject jSONObject;
            C5296n1.C5301e h = OneSignalStateSynchronizer.m40483h(!OneSignal.f26016U);
            if (h.f26490a) {
                boolean unused = OneSignal.f26016U = true;
            }
            synchronized (OneSignal.f26023a0) {
                Iterator it = OneSignal.f26023a0.iterator();
                while (it.hasNext()) {
                    C5158x xVar = (C5158x) it.next();
                    if (h.f26491b != null) {
                        if (!h.toString().equals("{}")) {
                            jSONObject = h.f26491b;
                            xVar.mo38525a(jSONObject);
                        }
                    }
                    jSONObject = null;
                    xVar.mo38525a(jSONObject);
                }
                OneSignal.f26023a0.clear();
            }
        }
    }

    /* renamed from: com.onesignal.OneSignal$g0 */
    public interface C5139g0 {
        /* renamed from: a */
        void mo38580a(qd4 qd4);
    }

    /* renamed from: com.onesignal.OneSignal$h */
    public class C5140h implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C5259i0 f26077a;

        public C5140h(C5259i0 i0Var) {
            this.f26077a = i0Var;
        }

        public void run() {
            OneSignal.f26055r.mo38569a(this.f26077a);
        }
    }

    /* renamed from: com.onesignal.OneSignal$h0 */
    public interface C5141h0 {
        /* renamed from: a */
        void mo38582a(boolean z);
    }

    /* renamed from: com.onesignal.OneSignal$i */
    public class C5142i extends C5355z0.C5362g {
        /* renamed from: a */
        public void mo38414a(int i, String str, Throwable th) {
            OneSignal.m40365U0("sending Notification Opened Failed", i, th, str);
        }
    }

    /* renamed from: com.onesignal.OneSignal$i0 */
    public static class C5143i0 {

        /* renamed from: a */
        public String f26078a;

        /* renamed from: b */
        public int f26079b;

        public C5143i0(int i, String str) {
            this.f26078a = str;
            this.f26079b = i;
        }
    }

    /* renamed from: com.onesignal.OneSignal$j */
    public class C5144j implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C5131c0 f26080a;

        /* renamed from: d */
        public final /* synthetic */ boolean f26081d;

        public C5144j(C5131c0 c0Var, boolean z) {
            this.f26080a = c0Var;
            this.f26081d = z;
        }

        public void run() {
            OneSignal.f26063z.debug("Running promptLocation() operation from pending queue.");
            OneSignal.m40396g1(this.f26080a, this.f26081d);
        }
    }

    /* renamed from: com.onesignal.OneSignal$k */
    public class C5145k {
    }

    /* renamed from: com.onesignal.OneSignal$l */
    public class C5146l extends LocationController.C5106e {

        /* renamed from: a */
        public final /* synthetic */ C5131c0 f26082a;

        public C5146l(C5131c0 c0Var) {
            this.f26082a = c0Var;
        }

        /* renamed from: a */
        public void mo38437a(LocationController.C5105d dVar) {
            if (!OneSignal.m40339L1("promptLocation()") && dVar != null) {
                OneSignalStateSynchronizer.m40498w(dVar);
            }
        }

        /* renamed from: b */
        public void mo38440b(PromptActionResult promptActionResult) {
            super.mo38440b(promptActionResult);
            C5131c0 c0Var = this.f26082a;
            if (c0Var != null) {
                c0Var.mo38528a(promptActionResult);
            }
        }

        public LocationController.PermissionType getType() {
            return LocationController.PermissionType.PROMPT_LOCATION;
        }
    }

    /* renamed from: com.onesignal.OneSignal$m */
    public class C5147m implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f26083a;

        public C5147m(int i) {
            this.f26083a = i;
        }

        public void run() {
            OneSignal.f26063z.debug("Running removeNotification() operation from pending queue.");
            OneSignal.m40420o1(this.f26083a);
        }
    }

    /* renamed from: com.onesignal.OneSignal$n */
    public class C5148n implements LocationController.C5103b {
        /* renamed from: a */
        public void mo38437a(LocationController.C5105d dVar) {
            LocationController.C5105d unused = OneSignal.f26019X = dVar;
            boolean unused2 = OneSignal.f26015T = true;
            OneSignal.m40411l1();
        }

        public LocationController.PermissionType getType() {
            return LocationController.PermissionType.STARTUP;
        }
    }

    /* renamed from: com.onesignal.OneSignal$o */
    public class C5149o implements C5197b1.C5198a {
        /* renamed from: a */
        public void mo38585a(String str, int i) {
            ld4 d = OneSignal.f26063z;
            d.debug("registerForPushToken completed with id: " + str + " status: " + i);
            if (i < 1) {
                if (OneSignalStateSynchronizer.m40480e() == null && (OneSignal.f26048n == 1 || OneSignal.m40399h1(OneSignal.f26048n))) {
                    int unused = OneSignal.f26048n = i;
                }
            } else if (OneSignal.m40399h1(OneSignal.f26048n)) {
                int unused2 = OneSignal.f26048n = i;
            }
            String unused3 = OneSignal.f26012Q = str;
            boolean unused4 = OneSignal.f26014S = true;
            OneSignal.m40364U(OneSignal.f26030e).mo38545h(str);
            OneSignal.m40411l1();
        }
    }

    /* renamed from: com.onesignal.OneSignal$p */
    public class C5150p implements C5346y0.C5350c {

        /* renamed from: a */
        public final /* synthetic */ boolean f26084a;

        public C5150p(boolean z) {
            this.f26084a = z;
        }

        /* renamed from: a */
        public void mo38586a(C5346y0.C5353f fVar) {
            boolean unused = OneSignal.f26018W = false;
            String str = fVar.f26596a;
            if (str != null) {
                OneSignal.f26036h = str;
            }
            OneSignal.f26000E.mo39051q(fVar, OneSignal.f26005J, OneSignal.f26004I, OneSignal.f26063z);
            OneSignal.m40384c1();
            C5281l.m41047f(OneSignal.f26030e, fVar.f26600e);
            if (this.f26084a) {
                OneSignal.m40408k1();
            }
        }
    }

    /* renamed from: com.onesignal.OneSignal$q */
    public class C5151q implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ LOG_LEVEL f26085a;

        /* renamed from: d */
        public final /* synthetic */ String f26086d;

        public C5151q(LOG_LEVEL log_level, String str) {
            this.f26085a = log_level;
            this.f26086d = str;
        }

        public void run() {
            if (OneSignal.m40352Q() != null) {
                new AlertDialog.Builder(OneSignal.m40352Q()).setTitle(this.f26085a.toString()).setMessage(this.f26086d).show();
            }
        }
    }

    /* renamed from: com.onesignal.OneSignal$r */
    public class C5152r implements Runnable {
        public void run() {
            OneSignal.f26063z.debug("Running onAppLostFocus() operation from a pending task queue.");
            OneSignal.m40310C();
        }
    }

    /* renamed from: com.onesignal.OneSignal$s */
    public interface C5153s {
        /* renamed from: a */
        void mo38589a(JSONObject jSONObject);

        /* renamed from: b */
        void mo38590b(C5143i0 i0Var);
    }

    /* renamed from: com.onesignal.OneSignal$t */
    public static class C5154t {

        /* renamed from: a */
        public EmailErrorType f26087a;

        /* renamed from: b */
        public String f26088b;

        public C5154t(EmailErrorType emailErrorType, String str) {
            this.f26087a = emailErrorType;
            this.f26088b = str;
        }
    }

    /* renamed from: com.onesignal.OneSignal$u */
    public interface C5155u {
        /* renamed from: a */
        void mo38591a(C5154t tVar);

        void onSuccess();
    }

    /* renamed from: com.onesignal.OneSignal$v */
    public interface C5156v {
        /* renamed from: a */
        void mo38593a(AppEntryAction appEntryAction);
    }

    /* renamed from: com.onesignal.OneSignal$w */
    public static class C5157w {

        /* renamed from: a */
        public JSONArray f26089a;

        /* renamed from: b */
        public boolean f26090b;

        /* renamed from: c */
        public C5355z0.C5362g f26091c;

        public C5157w(JSONArray jSONArray) {
            this.f26089a = jSONArray;
        }
    }

    /* renamed from: com.onesignal.OneSignal$x */
    public interface C5158x {
        /* renamed from: a */
        void mo38525a(JSONObject jSONObject);
    }

    /* renamed from: com.onesignal.OneSignal$y */
    public interface C5159y {
        /* renamed from: a */
        void mo38594a(OSInAppMessageAction oSInAppMessageAction);
    }

    /* renamed from: com.onesignal.OneSignal$z */
    public interface C5160z {
        /* renamed from: a */
        void mo38595a(String str, boolean z);
    }

    static {
        ke4 ke4 = new ke4();
        f26004I = ke4;
        qe4 qe4 = new qe4(ke4, f26063z, f25999D);
        f26005J = qe4;
        f26006K = new C5308p0(f25997B, qe4, f26063z);
    }

    /* renamed from: A */
    public static boolean m40304A() {
        if (f26000E.mo39054t()) {
            return OSUtils.m40274a(f26030e);
        }
        return true;
    }

    /* renamed from: A0 */
    public static void m40305A0(Context context) {
        boolean z;
        boolean z2;
        C5179a b = C6139ka.m46938b();
        boolean z3 = context instanceof Activity;
        if (m40352Q() == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z || z3) {
            z2 = true;
        } else {
            z2 = false;
        }
        m40312C1(z2);
        f26063z.debug("OneSignal handleActivityLifecycleHandler inForeground: " + f26058u);
        if (f26058u) {
            if (z && z3 && b != null) {
                b.mo38667r((Activity) context);
                b.mo38668s(true);
            }
            OSNotificationRestoreWorkManager.m40224c(context, false);
            m40380b0().mo38391b();
        } else if (b != null) {
            b.mo38668s(true);
        }
    }

    /* renamed from: A1 */
    public static void m40306A1(JSONObject jSONObject, C5153s sVar) {
        if (f26002G.mo45777g("sendTags()")) {
            f26063z.error("Waiting for remote params. Moving sendTags() operation to a pending task queue.");
            f26002G.mo39099c(new C5128b(jSONObject, sVar));
        } else if (!m40339L1("sendTags()")) {
            C5132d dVar = new C5132d(jSONObject, sVar);
            if (f26002G.mo39101e()) {
                f26063z.debug("Sending sendTags() operation to pending task queue.");
                f26002G.mo39099c(dVar);
                return;
            }
            dVar.run();
        }
    }

    /* renamed from: B */
    public static boolean m40307B(LOG_LEVEL log_level) {
        if (log_level.compareTo(f26038i) < 1 || log_level.compareTo(f26040j) < 1) {
            return true;
        }
        return false;
    }

    /* renamed from: B0 */
    public static void m40308B0() {
        try {
            Class.forName("com.amazon.device.iap.PurchasingListener");
            f26061x = new C5236g1(f26030e);
        } catch (ClassNotFoundException unused) {
        }
    }

    /* renamed from: B1 */
    public static void m40309B1(String str) {
        if (str == null || str.isEmpty()) {
            ld4 ld4 = f26063z;
            ld4.mo38717b("setAppId called with id: " + str + ", ignoring!");
            return;
        }
        if (!str.equals(f26034g)) {
            f26057t = false;
            ld4 ld42 = f26063z;
            ld42.mo38716a("setAppId called with id: " + str + " changing id from: " + f26034g);
        }
        f26034g = str;
        if (f26030e == null) {
            f26063z.mo38717b("appId set, but please call initWithContext(appContext) with Application context to complete OneSignal init!");
            return;
        }
        WeakReference<Activity> weakReference = f26032f;
        if (weakReference == null || weakReference.get() == null) {
            m40335K0(f26030e);
        } else {
            m40335K0(f26032f.get());
        }
    }

    /* renamed from: C */
    public static void m40310C() {
        if (!f26058u) {
            C5236g1 g1Var = f26061x;
            if (g1Var != null) {
                g1Var.mo38828c();
            }
            m40380b0().mo38390a();
            m40444w1();
        }
    }

    /* renamed from: C0 */
    public static void m40311C0() {
        String o0 = m40419o0();
        if (o0 == null) {
            LOG_LEVEL log_level = LOG_LEVEL.DEBUG;
            m40376a(log_level, "App id set for first time:  " + f26034g);
            C5186b.m40597d(0, f26030e);
            m40432s1(f26034g);
        } else if (!o0.equals(f26034g)) {
            LOG_LEVEL log_level2 = LOG_LEVEL.DEBUG;
            m40376a(log_level2, "App id has changed:\nFrom: " + o0 + "\n To: " + f26034g + "\nClearing the user id, app state, and remoteParams as they are no longer valid");
            m40432s1(f26034g);
            OneSignalStateSynchronizer.m40490o();
            f26000E.mo39035a();
        }
    }

    /* renamed from: C1 */
    public static void m40312C1(boolean z) {
        f26058u = z;
    }

    /* renamed from: D */
    public static void m40313D(AppEntryAction appEntryAction) {
        for (C5156v a : new ArrayList(f26028d)) {
            a.mo38593a(appEntryAction);
        }
    }

    /* renamed from: D0 */
    public static void m40314D0() {
        C5155u uVar = f26026c;
        if (uVar != null) {
            uVar.mo38591a(new C5154t(EmailErrorType.NETWORK, "Failed due to network failure. Will retry on next sync."));
            f26026c = null;
        }
    }

    /* renamed from: D1 */
    public static void m40315D1(long j) {
        ld4 ld4 = f26063z;
        ld4.debug("Last session time set to: " + j);
        C5342x0.m41401l(C5342x0.f26571a, "OS_LAST_SESSION_TIME", j);
    }

    /* renamed from: E */
    public static void m40316E(JSONArray jSONArray, C5153s sVar) {
        if (!m40339L1("deleteTags()")) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < jSONArray.length(); i++) {
                    jSONObject.put(jSONArray.getString(i), "");
                }
                m40306A1(jSONObject, sVar);
            } catch (Throwable th) {
                m40379b(LOG_LEVEL.ERROR, "Failed to generate JSON for deleteTags.", th);
            }
        }
    }

    /* renamed from: E0 */
    public static void m40317E0(Activity activity, JSONArray jSONArray, String str) {
        if (!m40339L1((String) null)) {
            m40371X0(activity, jSONArray);
            if (f26062y != null && m40377a0()) {
                f26062y.mo47857g(m40343N(jSONArray));
            }
            if (m40336K1(activity, jSONArray)) {
                m40451z(str);
            }
            m40390e1(activity, jSONArray);
            m40429r1(jSONArray);
        }
    }

    /* renamed from: E1 */
    public static void m40318E1(LOG_LEVEL log_level, LOG_LEVEL log_level2) {
        f26040j = log_level;
        f26038i = log_level2;
    }

    /* renamed from: F */
    public static void m40319F() {
        if (m40342M1()) {
            ld4 ld4 = f26063z;
            ld4.debug("Starting new session with appEntryState: " + m40346O());
            OneSignalStateSynchronizer.m40493r();
            m40395g0().mo38964e();
            f26006K.mo39071m(m40346O());
            m40383c0().mo38514n0();
            m40315D1(f25999D.mo46064a());
        } else if (m40347O0()) {
            ld4 ld42 = f26063z;
            ld42.debug("Continue on same session with appEntryState: " + m40346O());
            f26006K.mo39061c(m40346O());
        }
        m40383c0().mo38491T();
        if (!f26058u && m40332J0()) {
            f26063z.debug("doSessionInit on background with already registered user");
        }
        m40351P1();
    }

    /* renamed from: F0 */
    public static void m40320F0(md4 md4) {
        try {
            JSONObject jSONObject = new JSONObject(md4.mo45747e().toString());
            jSONObject.put("androidNotificationId", md4.mo45743a());
            C5259i0 N = m40343N(C5270k.m41000g(jSONObject));
            if (f26062y != null && m40377a0()) {
                f26062y.mo47858h(N);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: F1 */
    public static void m40321F1(C5133d0 d0Var) {
        if (f26052p == null) {
            f26052p = d0Var;
        }
    }

    /* renamed from: G */
    public static void m40322G() {
        for (JSONArray r1 : f26020Y) {
            m40429r1(r1);
        }
        f26020Y.clear();
    }

    /* renamed from: G0 */
    public static void m40323G0() {
        C5155u uVar = f26026c;
        if (uVar != null) {
            uVar.onSuccess();
            f26026c = null;
        }
    }

    /* renamed from: G1 */
    public static void m40324G1(boolean z) {
        if (m40407k0().mo39040f()) {
            f26063z.mo38717b("setRequiresUserPrivacyConsent already called by remote params!, ignoring user set");
        } else if (!m40423p1() || z) {
            m40407k0().mo39049o(z);
        } else {
            m40376a(LOG_LEVEL.ERROR, "Cannot change requiresUserPrivacyConsent() from TRUE to FALSE");
        }
    }

    /* renamed from: H */
    public static void m40325H() {
        C5155u uVar = f26024b;
        if (uVar != null) {
            uVar.mo38591a(new C5154t(EmailErrorType.NETWORK, "Failed due to network failure. Will retry on next sync."));
            f26024b = null;
        }
    }

    /* renamed from: H0 */
    public static boolean m40326H0() {
        return !TextUtils.isEmpty(f26044l);
    }

    /* renamed from: H1 */
    public static void m40327H1(boolean z) {
        C6139ka.m46939c((Application) f26030e);
        if (z) {
            f26050o = new vd3(f26004I);
            C5342x0.m41404o();
            C5340w0 V = m40366V();
            C5224f0 f0Var = new C5224f0(V, f26063z);
            f26009N = f0Var;
            f0Var.mo38817h();
            m40383c0().mo38475D();
            if (f26008M == null) {
                f26008M = new vd4(f26063z, f26003H, V, f26004I);
            }
            f26006K.mo39065g();
            m40395g0().mo38963d();
        }
    }

    /* renamed from: I */
    public static void m40328I() {
        C5155u uVar = f26024b;
        if (uVar != null) {
            uVar.onSuccess();
            f26024b = null;
        }
    }

    /* renamed from: I0 */
    public static boolean m40329I0() {
        return !TextUtils.isEmpty(f26046m);
    }

    /* renamed from: I1 */
    public static void m40330I1(Context context) {
        try {
            String string = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString("com.onesignal.PrivacyConsent");
            if (string != null) {
                m40324G1("ENABLE".equalsIgnoreCase(string));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: J */
    public static void m40331J(C5220e0 e0Var) {
        m40387d1(LOG_LEVEL.INFO, "Fire notificationWillShowInForegroundHandler");
        C5266j0 c = e0Var.mo38804c();
        try {
            f26054q.mo38571a(c);
        } catch (Throwable th) {
            m40387d1(LOG_LEVEL.ERROR, "Exception thrown while notification was being processed for display by notificationWillShowInForegroundHandler, showing notification in foreground!");
            c.mo38925b(c.mo38926c());
            throw th;
        }
    }

    /* renamed from: J0 */
    public static boolean m40332J0() {
        if (m40452z0() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: J1 */
    public static boolean m40333J1(md4 md4) {
        if (!m40347O0()) {
            m40387d1(LOG_LEVEL.INFO, "App is in background, show notification");
            return false;
        } else if (f26054q == null) {
            m40387d1(LOG_LEVEL.INFO, "No NotificationWillShowInForegroundHandler setup, show notification");
            return false;
        } else if (!md4.mo45756n()) {
            return true;
        } else {
            m40387d1(LOG_LEVEL.INFO, "Not firing notificationWillShowInForegroundHandler for restored notifications");
            return false;
        }
    }

    /* renamed from: K */
    public static void m40334K(C5259i0 i0Var) {
        OSUtils.m40270S(new C5140h(i0Var));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00dc, code lost:
        return;
     */
    /* renamed from: K0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m40335K0(android.content.Context r5) {
        /*
            java.lang.Class<com.onesignal.OneSignal> r0 = com.onesignal.OneSignal.class
            monitor-enter(r0)
            ld4 r1 = f26063z     // Catch:{ all -> 0x00dd }
            java.lang.String r2 = "Starting OneSignal initialization!"
            r1.mo38716a(r2)     // Catch:{ all -> 0x00dd }
            android.content.Context r1 = f26030e     // Catch:{ all -> 0x00dd }
            com.onesignal.C5220e0.m40809h(r1)     // Catch:{ all -> 0x00dd }
            boolean r1 = m40423p1()     // Catch:{ all -> 0x00dd }
            r2 = 0
            if (r1 != 0) goto L_0x00a9
            com.onesignal.o0 r1 = f26000E     // Catch:{ all -> 0x00dd }
            boolean r1 = r1.mo39045k()     // Catch:{ all -> 0x00dd }
            if (r1 != 0) goto L_0x0020
            goto L_0x00a9
        L_0x0020:
            int r1 = f26048n     // Catch:{ all -> 0x00dd }
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r3) goto L_0x0028
            goto L_0x0032
        L_0x0028:
            com.onesignal.OSUtils r1 = f26013R     // Catch:{ all -> 0x00dd }
            android.content.Context r3 = f26030e     // Catch:{ all -> 0x00dd }
            java.lang.String r4 = f26034g     // Catch:{ all -> 0x00dd }
            int r1 = r1.mo38553A(r3, r4)     // Catch:{ all -> 0x00dd }
        L_0x0032:
            f26048n = r1     // Catch:{ all -> 0x00dd }
            boolean r1 = m40359S0()     // Catch:{ all -> 0x00dd }
            if (r1 == 0) goto L_0x003c
            monitor-exit(r0)
            return
        L_0x003c:
            boolean r1 = f26057t     // Catch:{ all -> 0x00dd }
            if (r1 == 0) goto L_0x0050
            com.onesignal.OneSignal$a0 r5 = f26055r     // Catch:{ all -> 0x00dd }
            if (r5 == 0) goto L_0x0047
            m40322G()     // Catch:{ all -> 0x00dd }
        L_0x0047:
            ld4 r5 = f26063z     // Catch:{ all -> 0x00dd }
            java.lang.String r1 = "OneSignal SDK initialization already completed."
            r5.debug(r1)     // Catch:{ all -> 0x00dd }
            monitor-exit(r0)
            return
        L_0x0050:
            m40305A0(r5)     // Catch:{ all -> 0x00dd }
            f26032f = r2     // Catch:{ all -> 0x00dd }
            com.onesignal.OneSignalStateSynchronizer.m40486k()     // Catch:{ all -> 0x00dd }
            m40311C0()     // Catch:{ all -> 0x00dd }
            m40308B0()     // Catch:{ all -> 0x00dd }
            android.content.Context r5 = f26030e     // Catch:{ all -> 0x00dd }
            com.onesignal.m0 r5 = m40358S(r5)     // Catch:{ all -> 0x00dd }
            com.onesignal.OSPermissionChangedInternalObserver.m40235b(r5)     // Catch:{ all -> 0x00dd }
            m40319F()     // Catch:{ all -> 0x00dd }
            com.onesignal.OneSignal$a0 r5 = f26055r     // Catch:{ all -> 0x00dd }
            if (r5 == 0) goto L_0x0071
            m40322G()     // Catch:{ all -> 0x00dd }
        L_0x0071:
            android.content.Context r5 = f26030e     // Catch:{ all -> 0x00dd }
            boolean r5 = com.onesignal.C5244h1.m40862a(r5)     // Catch:{ all -> 0x00dd }
            if (r5 == 0) goto L_0x0082
            com.onesignal.h1 r5 = new com.onesignal.h1     // Catch:{ all -> 0x00dd }
            android.content.Context r1 = f26030e     // Catch:{ all -> 0x00dd }
            r5.<init>(r1)     // Catch:{ all -> 0x00dd }
            f26060w = r5     // Catch:{ all -> 0x00dd }
        L_0x0082:
            boolean r5 = p000.ss6.m51895a()     // Catch:{ all -> 0x00dd }
            if (r5 == 0) goto L_0x0091
            ss6 r5 = new ss6     // Catch:{ all -> 0x00dd }
            android.content.Context r1 = f26030e     // Catch:{ all -> 0x00dd }
            r5.<init>(r1)     // Catch:{ all -> 0x00dd }
            f26062y = r5     // Catch:{ all -> 0x00dd }
        L_0x0091:
            r5 = 1
            f26057t = r5     // Catch:{ all -> 0x00dd }
            com.onesignal.OneSignal$LOG_LEVEL r5 = com.onesignal.OneSignal.LOG_LEVEL.VERBOSE     // Catch:{ all -> 0x00dd }
            java.lang.String r1 = "OneSignal SDK initialization done."
            m40376a(r5, r1)     // Catch:{ all -> 0x00dd }
            com.onesignal.l0 r5 = m40395g0()     // Catch:{ all -> 0x00dd }
            r5.mo38976q()     // Catch:{ all -> 0x00dd }
            me4 r5 = f26002G     // Catch:{ all -> 0x00dd }
            r5.mo39102f()     // Catch:{ all -> 0x00dd }
            monitor-exit(r0)
            return
        L_0x00a9:
            com.onesignal.o0 r1 = f26000E     // Catch:{ all -> 0x00dd }
            boolean r1 = r1.mo39045k()     // Catch:{ all -> 0x00dd }
            if (r1 != 0) goto L_0x00b9
            ld4 r1 = f26063z     // Catch:{ all -> 0x00dd }
            java.lang.String r3 = "OneSignal SDK initialization delayed, waiting for remote params."
            r1.mo38716a(r3)     // Catch:{ all -> 0x00dd }
            goto L_0x00c0
        L_0x00b9:
            ld4 r1 = f26063z     // Catch:{ all -> 0x00dd }
            java.lang.String r3 = "OneSignal SDK initialization delayed, waiting for privacy consent to be set."
            r1.mo38716a(r3)     // Catch:{ all -> 0x00dd }
        L_0x00c0:
            lb1 r1 = new lb1     // Catch:{ all -> 0x00dd }
            android.content.Context r3 = f26030e     // Catch:{ all -> 0x00dd }
            java.lang.String r4 = f26034g     // Catch:{ all -> 0x00dd }
            r1.<init>(r3, r4)     // Catch:{ all -> 0x00dd }
            f26025b0 = r1     // Catch:{ all -> 0x00dd }
            java.lang.String r1 = f26034g     // Catch:{ all -> 0x00dd }
            f26034g = r2     // Catch:{ all -> 0x00dd }
            if (r1 == 0) goto L_0x00db
            if (r5 == 0) goto L_0x00db
            java.lang.String r5 = m40452z0()     // Catch:{ all -> 0x00dd }
            r2 = 0
            m40367V0(r1, r5, r2)     // Catch:{ all -> 0x00dd }
        L_0x00db:
            monitor-exit(r0)
            return
        L_0x00dd:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.OneSignal.m40335K0(android.content.Context):void");
    }

    /* renamed from: K1 */
    public static boolean m40336K1(Activity activity, JSONArray jSONArray) {
        if (f26058u) {
            return false;
        }
        try {
            return new od4(activity, jSONArray.getJSONObject(0)).mo46382a();
        } catch (JSONException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: L */
    public static void m40337L() {
        C5137f0 f0Var = f26022a;
        if (f0Var != null) {
            f0Var.mo38578b(new C5135e0(SMSErrorType.NETWORK, "Failed due to network failure. Will retry on next sync."));
            f26022a = null;
        }
    }

    /* renamed from: L0 */
    public static void m40338L0(Context context) {
        boolean z;
        if (context == null) {
            f26063z.mo38717b("initWithContext called with null context, ignoring!");
            return;
        }
        if (context instanceof Activity) {
            f26032f = new WeakReference<>((Activity) context);
        }
        if (f26030e == null) {
            z = true;
        } else {
            z = false;
        }
        f26030e = context.getApplicationContext();
        m40327H1(z);
        m40330I1(f26030e);
        if (f26034g == null) {
            String o0 = m40419o0();
            if (o0 == null) {
                f26063z.mo38717b("appContext set, but please call setAppId(appId) with a valid appId to complete OneSignal init!");
                return;
            }
            ld4 ld4 = f26063z;
            ld4.mo38716a("appContext set and cached app id found, calling setAppId with: " + o0);
            m40309B1(o0);
            return;
        }
        ld4 ld42 = f26063z;
        ld42.mo38716a("initWithContext called with: " + context);
        m40335K0(context);
    }

    /* renamed from: L1 */
    public static boolean m40339L1(String str) {
        if (!m40423p1()) {
            return false;
        }
        if (str == null) {
            return true;
        }
        LOG_LEVEL log_level = LOG_LEVEL.WARN;
        m40376a(log_level, "Method " + str + " was called before the user provided privacy consent. Your application is set to require the user's privacy consent before the OneSignal SDK can be initialized. Please ensure the user has provided consent before calling this method. You can check the latest OneSignal consent status by calling OneSignal.userProvidedPrivacyConsent()");
        return true;
    }

    /* renamed from: M */
    public static void m40340M(JSONObject jSONObject) {
        C5137f0 f0Var = f26022a;
        if (f0Var != null) {
            f0Var.mo38577a(jSONObject);
            f26022a = null;
        }
    }

    /* renamed from: M0 */
    public static void m40341M0() {
        ArrayList<C5158x> arrayList = f26023a0;
        synchronized (arrayList) {
            if (arrayList.size() != 0) {
                new Thread(new C5138g(), "OS_GETTAGS_CALLBACK").start();
            }
        }
    }

    /* renamed from: M1 */
    public static boolean m40342M1() {
        if (m40347O0() && m40356R0()) {
            return true;
        }
        return false;
    }

    /* renamed from: N */
    public static C5259i0 m40343N(JSONArray jSONArray) {
        OSNotificationAction.ActionType actionType;
        int length = jSONArray.length();
        int optInt = jSONArray.optJSONObject(0).optInt("androidNotificationId");
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        String str = null;
        JSONObject jSONObject = null;
        for (int i = 0; i < length; i++) {
            try {
                jSONObject = jSONArray.getJSONObject(i);
                if (str == null && jSONObject.has("actionId")) {
                    str = jSONObject.optString("actionId", (String) null);
                }
                if (z) {
                    z = false;
                } else {
                    arrayList.add(new C5211d0(jSONObject));
                }
            } catch (Throwable th) {
                m40379b(LOG_LEVEL.ERROR, "Error parsing JSON item " + i + "/" + length + " for callback.", th);
            }
        }
        if (str != null) {
            actionType = OSNotificationAction.ActionType.ActionTaken;
        } else {
            actionType = OSNotificationAction.ActionType.Opened;
        }
        return new C5259i0(new C5211d0(arrayList, jSONObject, optInt), new OSNotificationAction(actionType, str));
    }

    /* renamed from: N0 */
    public static boolean m40344N0() {
        if (!f26057t || !m40347O0()) {
            return false;
        }
        return true;
    }

    /* renamed from: N1 */
    public static void m40345N1(boolean z) {
        ld4 ld4 = f26063z;
        ld4.debug("OneSignal startLocationShared: " + z);
        m40407k0().mo39048n(z);
        if (!z) {
            f26063z.debug("OneSignal is shareLocation set false, clearing last location!");
            OneSignalStateSynchronizer.m40476a();
        }
    }

    /* renamed from: O */
    public static AppEntryAction m40346O() {
        return f26059v;
    }

    /* renamed from: O0 */
    public static boolean m40347O0() {
        return f26058u;
    }

    /* renamed from: O1 */
    public static void m40348O1() {
        LocationController.m40098g(f26030e, false, false, new C5148n());
    }

    /* renamed from: P */
    public static boolean m40349P() {
        return f26000E.mo39036b();
    }

    /* renamed from: P0 */
    public static boolean m40350P0() {
        return f26057t;
    }

    /* renamed from: P1 */
    public static void m40351P1() {
        if (!f26017V) {
            f26017V = true;
            if (f26058u && OneSignalStateSynchronizer.m40482g()) {
                f26015T = false;
            }
            m40348O1();
            f26014S = false;
            if (m40410l0() != null) {
                m40408k1();
            } else {
                m40367V0(f26034g, m40452z0(), true);
            }
        }
    }

    /* renamed from: Q */
    public static Activity m40352Q() {
        C5179a b = C6139ka.m46938b();
        if (b != null) {
            return b.mo38653d();
        }
        return null;
    }

    /* renamed from: Q0 */
    public static boolean m40353Q0() {
        return f26000E.mo39042h();
    }

    /* renamed from: Q1 */
    public static void m40354Q1(String str) {
        m40435t1(str);
        m40355R(f26030e).mo49448f(str);
        try {
            OneSignalStateSynchronizer.m40499x(new JSONObject().put("parent_player_id", str));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: R */
    public static xc4 m40355R(Context context) {
        if (context == null) {
            return null;
        }
        if (f26039i0 == null) {
            xc4 xc4 = new xc4(false);
            f26039i0 = xc4;
            xc4.mo49444a().mo38949b(new OSEmailSubscriptionChangedInternalObserver());
        }
        return f26039i0;
    }

    /* renamed from: R0 */
    public static boolean m40356R0() {
        long a = m40443w0().mo46064a();
        long d0 = m40386d0();
        long j = a - d0;
        ld4 ld4 = f26063z;
        ld4.debug("isPastOnSessionTime currentTimeMillis: " + a + " lastSessionTime: " + d0 + " difference: " + j);
        if (j >= 30000) {
            return true;
        }
        return false;
    }

    /* renamed from: R1 */
    public static void m40357R1(String str) {
        m40438u1(str);
        m40361T(f26030e).mo43173f(str);
    }

    /* renamed from: S */
    public static C5292m0 m40358S(Context context) {
        if (context == null) {
            return null;
        }
        if (f26027c0 == null) {
            C5292m0 m0Var = new C5292m0(false);
            f26027c0 = m0Var;
            m0Var.mo38986b().mo38949b(new OSPermissionChangedInternalObserver());
        }
        return f26027c0;
    }

    /* renamed from: S0 */
    public static boolean m40359S0() {
        if (f26048n == -999) {
            return true;
        }
        return false;
    }

    /* renamed from: S1 */
    public static void m40360S1(String str) {
        m40441v1(str);
        m40341M0();
        m40364U(f26030e).mo38546i(str);
        C5157w wVar = f26051o0;
        if (wVar != null) {
            m40450y1(wVar.f26089a, wVar.f26090b, wVar.f26091c);
            f26051o0 = null;
        }
        OneSignalStateSynchronizer.m40489n();
    }

    /* renamed from: T */
    public static he4 m40361T(Context context) {
        if (context == null) {
            return null;
        }
        if (f26045l0 == null) {
            he4 he4 = new he4(false);
            f26045l0 = he4;
            he4.mo43169a().mo38949b(new OSSMSSubscriptionChangedInternalObserver());
        }
        return f26045l0;
    }

    /* renamed from: T0 */
    public static boolean m40362T0() {
        return f26000E.mo39043i();
    }

    /* renamed from: T1 */
    public static boolean m40363T1() {
        return f26000E.mo39039e();
    }

    /* renamed from: U */
    public static OSSubscriptionState m40364U(Context context) {
        if (context == null) {
            return null;
        }
        if (f26033f0 == null) {
            f26033f0 = new OSSubscriptionState(false, m40358S(context).mo38985a());
            m40358S(context).mo38986b().mo38948a(f26033f0);
            f26033f0.mo38538a().mo38949b(new OSSubscriptionChangedInternalObserver());
        }
        return f26033f0;
    }

    /* renamed from: U0 */
    public static void m40365U0(String str, int i, Throwable th, String str2) {
        String str3;
        if (str2 == null || !m40307B(LOG_LEVEL.INFO)) {
            str3 = "";
        } else {
            str3 = "\n" + str2 + "\n";
        }
        m40379b(LOG_LEVEL.WARN, "HTTP code: " + i + " " + str + str3, th);
    }

    /* renamed from: V */
    public static C5340w0 m40366V() {
        return C5340w0.m41369g(f26030e);
    }

    /* renamed from: V0 */
    public static void m40367V0(String str, String str2, boolean z) {
        if (m40410l0() == null && !f26018W) {
            f26018W = true;
            C5346y0.m41419e(str, str2, new C5150p(z));
        }
    }

    /* renamed from: W */
    public static C5340w0 m40368W(Context context) {
        return C5340w0.m41369g(context);
    }

    /* renamed from: W0 */
    public static void m40369W0(Context context, JSONObject jSONObject, C5224f0.C5228d dVar) {
        if (f26009N == null) {
            f26009N = new C5224f0(m40368W(context), f26063z);
        }
        f26009N.mo38819j(jSONObject, dVar);
    }

    /* renamed from: X */
    public static boolean m40370X() {
        return f26000E.mo39041g();
    }

    /* renamed from: X0 */
    public static void m40371X0(Context context, JSONArray jSONArray) {
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                String optString = new JSONObject(jSONArray.getJSONObject(i).optString("custom", (String) null)).optString("i", (String) null);
                if (!f26021Z.contains(optString)) {
                    f26021Z.add(optString);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("app_id", m40422p0(context));
                    jSONObject.put("player_id", m40425q0(context));
                    jSONObject.put("opened", true);
                    jSONObject.put("device_type", f26013R.mo38560e());
                    C5355z0.m41447l("notifications/" + optString, jSONObject, new C5142i());
                }
            } catch (Throwable th) {
                m40379b(LOG_LEVEL.ERROR, "Failed to generate JSON to send notification opened.", th);
            }
        }
    }

    /* renamed from: Y */
    public static String m40372Y() {
        if (f26044l == null && f26030e != null) {
            f26044l = C5342x0.m41395f(C5342x0.f26571a, "OS_EMAIL_ID", (String) null);
        }
        if (TextUtils.isEmpty(f26044l)) {
            return null;
        }
        return f26044l;
    }

    /* renamed from: Y0 */
    public static void m40373Y0() {
        LOG_LEVEL log_level = LOG_LEVEL.DEBUG;
        m40376a(log_level, "Application on focus");
        m40312C1(true);
        AppEntryAction appEntryAction = f26059v;
        AppEntryAction appEntryAction2 = AppEntryAction.NOTIFICATION_CLICK;
        if (!appEntryAction.equals(appEntryAction2)) {
            m40313D(f26059v);
            if (!f26059v.equals(appEntryAction2)) {
                f26059v = AppEntryAction.APP_OPEN;
            }
        }
        LocationController.m40103l();
        C5306p.f26501d.mo39057g();
        if (!OSUtils.m40271T(f26034g)) {
            if (!f26000E.mo39045k()) {
                m40376a(log_level, "Delay onAppFocus logic due to missing remote params");
                m40367V0(f26034g, m40452z0(), false);
                return;
            }
            m40375Z0();
        }
    }

    /* renamed from: Z */
    public static C5277k0<Object, yc4> m40374Z() {
        if (f26043k0 == null) {
            f26043k0 = new C5277k0<>("onOSEmailSubscriptionChanged", true);
        }
        return f26043k0;
    }

    /* renamed from: Z0 */
    public static void m40375Z0() {
        if (!m40339L1("onAppFocus")) {
            m40380b0().mo38391b();
            m40319F();
            C5244h1 h1Var = f26060w;
            if (h1Var != null) {
                h1Var.mo38836u();
            }
            OSNotificationRestoreWorkManager.m40224c(f26030e, false);
            m40405j1();
            if (f26062y != null && m40377a0()) {
                f26062y.mo47856f();
            }
            C5312q0.m41240q().mo39080p(f26030e);
        }
    }

    /* renamed from: a */
    public static void m40376a(LOG_LEVEL log_level, String str) {
        m40379b(log_level, str, (Throwable) null);
    }

    /* renamed from: a0 */
    public static boolean m40377a0() {
        return f26000E.mo39037c();
    }

    /* renamed from: a1 */
    public static void m40378a1() {
        LOG_LEVEL log_level = LOG_LEVEL.DEBUG;
        m40376a(log_level, "Application lost focus initDone: " + f26057t);
        m40312C1(false);
        f26059v = AppEntryAction.APP_CLOSE;
        m40315D1(m40443w0().mo46064a());
        LocationController.m40103l();
        if (f26057t) {
            m40310C();
        } else if (f26002G.mo45777g("onAppLostFocus()")) {
            f26063z.error("Waiting for remote params. Moving onAppLostFocus() operation to a pending task queue.");
            f26002G.mo39099c(new C5152r());
        }
    }

    /* renamed from: b */
    public static void m40379b(LOG_LEVEL log_level, String str, Throwable th) {
        if (!(log_level.compareTo(f26040j) >= 1 || log_level == LOG_LEVEL.VERBOSE || log_level == LOG_LEVEL.DEBUG || log_level == LOG_LEVEL.INFO || log_level == LOG_LEVEL.WARN || log_level == LOG_LEVEL.ERROR)) {
            LOG_LEVEL log_level2 = LOG_LEVEL.FATAL;
        }
        if (log_level.compareTo(f26038i) < 1 && m40352Q() != null) {
            try {
                String str2 = str + "\n";
                if (th != null) {
                    StringWriter stringWriter = new StringWriter();
                    th.printStackTrace(new PrintWriter(stringWriter));
                    str2 = (str2 + th.getMessage()) + stringWriter.toString();
                }
                OSUtils.m40270S(new C5151q(log_level, str2));
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b0 */
    public static FocusTimeController m40380b0() {
        if (f25996A == null) {
            f25996A = new FocusTimeController(new C5335v(), f26063z);
        }
        return f25996A;
    }

    /* renamed from: b1 */
    public static void m40381b1() {
        m40405j1();
    }

    /* renamed from: c0 */
    public static OSInAppMessageController m40383c0() {
        return f25998C.mo28919a(m40366V(), f26001F, m40389e0(), m40434t0(), f26050o);
    }

    /* renamed from: c1 */
    public static void m40384c1() {
        if (!m40402i1() && f26058u) {
            m40375Z0();
        }
    }

    /* renamed from: d0 */
    public static long m40386d0() {
        return C5342x0.m41393d(C5342x0.f26571a, "OS_LAST_SESSION_TIME", -31000);
    }

    /* renamed from: d1 */
    public static void m40387d1(LOG_LEVEL log_level, String str) {
        m40376a(log_level, str);
    }

    /* renamed from: e0 */
    public static ld4 m40389e0() {
        return f26063z;
    }

    /* renamed from: e1 */
    public static void m40390e1(Activity activity, JSONArray jSONArray) {
        try {
            Intent b = C5223f.f26308a.mo38813a(activity, jSONArray.getJSONObject(0)).mo49830b();
            if (b != null) {
                ld4 ld4 = f26063z;
                ld4.info("SDK running startActivity with Intent: " + b);
                activity.startActivity(b);
                return;
            }
            f26063z.info("SDK not showing an Activity automatically due to it's settings.");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: f0 */
    public static String m40392f0(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString("custom"));
            if (jSONObject2.has("i")) {
                return jSONObject2.optString("i", (String) null);
            }
            f26063z.debug("Not a OneSignal formatted FCM message. No 'i' field in custom.");
            return null;
        } catch (JSONException unused) {
            f26063z.debug("Not a OneSignal formatted FCM message. No 'custom' field in the JSONObject.");
        }
    }

    /* renamed from: f1 */
    public static void m40393f1(boolean z, C5141h0 h0Var) {
        C5306p.f26501d.mo39058h(z, h0Var);
    }

    /* renamed from: g0 */
    public static C5282l0 m40395g0() {
        if (f26007L == null) {
            synchronized (f26010O) {
                if (f26007L == null) {
                    if (f26008M == null) {
                        f26008M = new vd4(f26063z, f26003H, m40366V(), f26004I);
                    }
                    f26007L = new C5282l0(f26006K, f26008M);
                }
            }
        }
        return f26007L;
    }

    /* renamed from: g1 */
    public static void m40396g1(C5131c0 c0Var, boolean z) {
        if (f26002G.mo45777g("promptLocation()")) {
            f26063z.error("Waiting for remote params. Moving promptLocation() operation to a pending queue.");
            f26002G.mo39099c(new C5144j(c0Var, z));
        } else if (!m40339L1("promptLocation()")) {
            LocationController.m40098g(f26030e, true, z, new C5146l(c0Var));
        }
    }

    /* renamed from: h0 */
    public static C5277k0<Object, ge4> m40398h0() {
        if (f26031e0 == null) {
            f26031e0 = new C5277k0<>("onOSPermissionChanged", true);
        }
        return f26031e0;
    }

    /* renamed from: h1 */
    public static boolean m40399h1(int i) {
        return i < -6;
    }

    /* renamed from: i0 */
    public static C5197b1 m40401i0() {
        C5197b1 b1Var = f26053p0;
        if (b1Var != null) {
            return b1Var;
        }
        if (OSUtils.m40254C()) {
            f26053p0 = new C5204c1();
        } else if (!OSUtils.m40253B()) {
            f26053p0 = new C5229f1();
        } else if (OSUtils.m40286r()) {
            f26053p0 = m40404j0();
        }
        return f26053p0;
    }

    /* renamed from: i1 */
    public static boolean m40402i1() {
        Context context;
        String str;
        if (f26057t) {
            return false;
        }
        lb1 lb1 = f26025b0;
        if (lb1 == null) {
            str = m40419o0();
            context = f26030e;
            f26063z.error("Trying to continue OneSignal with null delayed params");
        } else {
            str = lb1.mo45405a();
            context = f26025b0.mo45406b();
        }
        ld4 ld4 = f26063z;
        ld4.debug("reassignDelayedInitParams with appContext: " + f26030e);
        f26025b0 = null;
        m40309B1(str);
        if (f26057t) {
            return true;
        }
        if (context == null) {
            f26063z.error("Trying to continue OneSignal with null delayed params context");
            return false;
        }
        m40338L0(context);
        return true;
    }

    /* renamed from: j0 */
    public static C5221e1 m40404j0() {
        C5221e1.C5222a aVar;
        C5346y0.C5351d dVar = f26000E.mo39038d().f26610o;
        if (dVar != null) {
            aVar = new C5221e1.C5222a(dVar.f26585a, dVar.f26586b, dVar.f26587c);
        } else {
            aVar = null;
        }
        return new C5221e1(f26030e, aVar);
    }

    /* renamed from: j1 */
    public static void m40405j1() {
        m40358S(f26030e).mo38989f();
    }

    /* renamed from: k0 */
    public static C5305o0 m40407k0() {
        return f26000E;
    }

    /* renamed from: k1 */
    public static void m40408k1() {
        m40401i0().mo38706a(f26030e, f26036h, new C5149o());
    }

    /* renamed from: l0 */
    public static C5346y0.C5353f m40410l0() {
        return f26000E.mo39038d();
    }

    /* renamed from: l1 */
    public static void m40411l1() {
        ld4 ld4 = f26063z;
        ld4.debug("registerUser:registerForPushFired:" + f26014S + ", locationFired: " + f26015T + ", remoteParams: " + m40410l0() + ", appId: " + f26034g);
        if (!f26014S || !f26015T || m40410l0() == null || f26034g == null) {
            f26063z.debug("registerUser not possible");
        } else {
            new Thread(new C5126a(), "OS_REG_USER").start();
        }
    }

    /* renamed from: m0 */
    public static String m40413m0() {
        if (f26046m == null && f26030e != null) {
            f26046m = C5342x0.m41395f(C5342x0.f26571a, "PREFS_OS_SMS_ID", (String) null);
        }
        if (TextUtils.isEmpty(f26046m)) {
            return null;
        }
        return f26046m;
    }

    /* renamed from: m1 */
    public static void m40414m1() throws JSONException {
        LocationController.C5105d dVar;
        String packageName = f26030e.getPackageName();
        PackageManager packageManager = f26030e.getPackageManager();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("app_id", m40419o0());
        jSONObject.put("device_os", Build.VERSION.RELEASE);
        jSONObject.put("timezone", m40449y0());
        jSONObject.put("timezone_id", m40446x0());
        jSONObject.put("language", f26050o.mo48731b());
        jSONObject.put("sdk", "040805");
        jSONObject.put("sdk_type", f26011P);
        jSONObject.put("android_package", packageName);
        jSONObject.put("device_model", Build.MODEL);
        try {
            jSONObject.put("game_version", packageManager.getPackageInfo(packageName, 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("net_type", f26013R.mo38561i());
        jSONObject.put("carrier", f26013R.mo38559d());
        jSONObject.put("rooted", sh5.m51797a());
        OneSignalStateSynchronizer.m40497v(jSONObject, (OneSignalStateSynchronizer.C5161a) null);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("identifier", f26012Q);
        jSONObject2.put("subscribableStatus", f26048n);
        jSONObject2.put("androidPermission", m40304A());
        jSONObject2.put("device_type", f26013R.mo38560e());
        OneSignalStateSynchronizer.m40499x(jSONObject2);
        if (m40353Q0() && (dVar = f26019X) != null) {
            OneSignalStateSynchronizer.m40498w(dVar);
        }
        f26063z.debug("registerUserTask calling readyToUpdate");
        OneSignalStateSynchronizer.m40488m(true);
        f26017V = false;
    }

    /* renamed from: n0 */
    public static C5277k0<Object, ie4> m40416n0() {
        if (f26049n0 == null) {
            f26049n0 = new C5277k0<>("onSMSSubscriptionChanged", true);
        }
        return f26049n0;
    }

    /* renamed from: n1 */
    public static void m40417n1(C5156v vVar) {
        f26028d.remove(vVar);
    }

    /* renamed from: o0 */
    public static String m40419o0() {
        return m40422p0(f26030e);
    }

    /* renamed from: o1 */
    public static void m40420o1(int i) {
        if (f26002G.mo45777g("removeNotification()") || f26009N == null) {
            f26063z.error("Waiting for remote params. Moving removeNotification() operation to a pending queue.");
            f26002G.mo39099c(new C5147m(i));
        } else if (!m40339L1("removeNotification()")) {
            f26009N.mo38820k(i, new WeakReference(f26030e));
        }
    }

    /* renamed from: p0 */
    public static String m40422p0(Context context) {
        if (context == null) {
            return null;
        }
        return C5342x0.m41395f(C5342x0.f26571a, "GT_APP_ID", (String) null);
    }

    /* renamed from: p1 */
    public static boolean m40423p1() {
        if (f26030e == null || (m40362T0() && !m40363T1())) {
            return true;
        }
        return false;
    }

    /* renamed from: q0 */
    public static String m40425q0(Context context) {
        if (context == null) {
            return null;
        }
        return C5342x0.m41395f(C5342x0.f26571a, "GT_PLAYER_ID", (String) null);
    }

    /* renamed from: q1 */
    public static void m40426q1() {
        if (m40452z0() == null) {
            f26063z.mo38717b("getTags called under a null user!");
        } else {
            m40341M0();
        }
    }

    /* renamed from: r0 */
    public static String m40428r0() {
        return "040805";
    }

    /* renamed from: r1 */
    public static void m40429r1(JSONArray jSONArray) {
        if (f26055r == null) {
            f26020Y.add(jSONArray);
            return;
        }
        C5259i0 N = m40343N(jSONArray);
        m40445x(N, f26059v);
        m40334K(N);
    }

    /* renamed from: s0 */
    public static C5308p0 m40431s0() {
        return f26006K;
    }

    /* renamed from: s1 */
    public static void m40432s1(String str) {
        if (f26030e != null) {
            C5342x0.m41402m(C5342x0.f26571a, "GT_APP_ID", str);
        }
    }

    /* renamed from: t0 */
    public static je4 m40434t0() {
        return f26004I;
    }

    /* renamed from: t1 */
    public static void m40435t1(String str) {
        String str2;
        f26044l = str;
        if (f26030e != null) {
            String str3 = C5342x0.f26571a;
            if ("".equals(f26044l)) {
                str2 = null;
            } else {
                str2 = f26044l;
            }
            C5342x0.m41402m(str3, "OS_EMAIL_ID", str2);
        }
    }

    /* renamed from: u0 */
    public static C5277k0<Object, le4> m40437u0() {
        if (f26037h0 == null) {
            f26037h0 = new C5277k0<>("onOSSubscriptionChanged", true);
        }
        return f26037h0;
    }

    /* renamed from: u1 */
    public static void m40438u1(String str) {
        String str2;
        f26046m = str;
        if (f26030e != null) {
            String str3 = C5342x0.f26571a;
            if ("".equals(f26046m)) {
                str2 = null;
            } else {
                str2 = f26046m;
            }
            C5342x0.m41402m(str3, "PREFS_OS_SMS_ID", str2);
        }
    }

    /* renamed from: v0 */
    public static void m40440v0(C5158x xVar) {
        if (f26002G.mo45777g("getTags()")) {
            f26063z.error("Waiting for remote params. Moving getTags() operation to a pending queue.");
            f26002G.mo39099c(new C5134e(xVar));
        } else if (!m40339L1("getTags()")) {
            if (xVar == null) {
                f26063z.error("getTags called with null GetTagsHandler!");
            } else {
                new Thread(new C5136f(xVar), "OS_GETTAGS").start();
            }
        }
    }

    /* renamed from: v1 */
    public static void m40441v1(String str) {
        f26042k = str;
        if (f26030e != null) {
            C5342x0.m41402m(C5342x0.f26571a, "GT_PLAYER_ID", f26042k);
        }
    }

    /* renamed from: w0 */
    public static ne4 m40443w0() {
        return f25999D;
    }

    /* renamed from: w1 */
    public static boolean m40444w1() {
        boolean l = OneSignalStateSynchronizer.m40487l();
        ld4 ld4 = f26063z;
        ld4.debug("OneSignal scheduleSyncService unsyncedChanges: " + l);
        if (l) {
            C5312q0.m41240q().mo39082s(f26030e);
        }
        boolean m = LocationController.m40104m(f26030e);
        ld4 ld42 = f26063z;
        ld42.debug("OneSignal scheduleSyncService locationScheduled: " + m);
        if (m || l) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public static void m40445x(C5156v vVar, AppEntryAction appEntryAction) {
        if (!appEntryAction.equals(AppEntryAction.NOTIFICATION_CLICK)) {
            f26028d.add(vVar);
        }
    }

    /* renamed from: x0 */
    public static String m40446x0() {
        if (Build.VERSION.SDK_INT >= 26) {
            return ZoneId.systemDefault().getId();
        }
        return TimeZone.getDefault().getID();
    }

    /* renamed from: x1 */
    public static void m40447x1(List<cd4> list) {
        C5282l0 l0Var = f26007L;
        if (l0Var == null || f26034g == null) {
            m40376a(LOG_LEVEL.ERROR, "Make sure OneSignal.init is called first");
        } else {
            l0Var.mo38972m(list);
        }
    }

    /* renamed from: y */
    public static void m40448y(JSONObject jSONObject) {
        try {
            jSONObject.put("net_type", f26013R.mo38561i());
        } catch (Throwable unused) {
        }
    }

    /* renamed from: y0 */
    public static int m40449y0() {
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        int rawOffset = timeZone.getRawOffset();
        if (timeZone.inDaylightTime(new Date())) {
            rawOffset += timeZone.getDSTSavings();
        }
        return rawOffset / 1000;
    }

    /* renamed from: y1 */
    public static void m40450y1(JSONArray jSONArray, boolean z, C5355z0.C5362g gVar) {
        if (!m40339L1("sendPurchases()")) {
            if (m40452z0() == null) {
                C5157w wVar = new C5157w(jSONArray);
                f26051o0 = wVar;
                wVar.f26090b = z;
                wVar.f26091c = gVar;
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("app_id", m40419o0());
                if (z) {
                    jSONObject.put("existing", true);
                }
                jSONObject.put("purchases", jSONArray);
                OneSignalStateSynchronizer.m40491p(jSONObject, gVar);
            } catch (Throwable th) {
                m40379b(LOG_LEVEL.ERROR, "Failed to generate JSON for sendPurchases.", th);
            }
        }
    }

    /* renamed from: z */
    public static void m40451z(String str) {
        AppEntryAction appEntryAction = AppEntryAction.NOTIFICATION_CLICK;
        f26059v = appEntryAction;
        f26006K.mo39068j(appEntryAction, str);
    }

    /* renamed from: z0 */
    public static String m40452z0() {
        Context context;
        if (f26042k == null && (context = f26030e) != null) {
            f26042k = m40425q0(context);
        }
        return f26042k;
    }

    /* renamed from: z1 */
    public static void m40453z1(JSONObject jSONObject) {
        m40306A1(jSONObject, (C5153s) null);
    }
}
