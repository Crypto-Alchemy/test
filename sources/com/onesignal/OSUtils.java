package com.onesignal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.core.app.JobIntentService;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.location.LocationListener;
import com.google.firebase.messaging.FirebaseMessaging;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.location.LocationCallback;
import com.onesignal.OneSignal;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import net.sqlcipher.database.SQLiteDatabase;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.web3j.abi.datatypes.Utf8String;

class OSUtils {

    /* renamed from: a */
    public static int f25992a = 3;

    /* renamed from: b */
    public static final int[] f25993b = {401, 402, 403, 404, 410};

    public enum SchemaType {
        DATA("data"),
        HTTPS("https"),
        HTTP("http");
        
        private final String text;

        /* access modifiers changed from: public */
        SchemaType(String str) {
            this.text = str;
        }

        public static SchemaType fromString(String str) {
            for (SchemaType schemaType : values()) {
                if (schemaType.text.equalsIgnoreCase(str)) {
                    return schemaType;
                }
            }
            return null;
        }
    }

    /* renamed from: com.onesignal.OSUtils$a */
    public static /* synthetic */ class C5125a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25995a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.onesignal.OSUtils$SchemaType[] r0 = com.onesignal.OSUtils.SchemaType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25995a = r0
                com.onesignal.OSUtils$SchemaType r1 = com.onesignal.OSUtils.SchemaType.DATA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f25995a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onesignal.OSUtils$SchemaType r1 = com.onesignal.OSUtils.SchemaType.HTTPS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f25995a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onesignal.OSUtils$SchemaType r1 = com.onesignal.OSUtils.SchemaType.HTTP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.OSUtils.C5125a.<clinit>():void");
        }
    }

    /* renamed from: B */
    public static boolean m40253B() {
        if (new OSUtils().mo38560e() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public static boolean m40254C() {
        if (new OSUtils().mo38560e() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: D */
    public static boolean m40255D() {
        return m40267P("com.google.android.gms");
    }

    /* renamed from: E */
    public static boolean m40256E() {
        if (HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(OneSignal.f26030e) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public static boolean m40257F() {
        return m40267P("com.huawei.hwid");
    }

    /* renamed from: G */
    public static boolean m40258G() {
        if (new OSUtils().mo38560e() == 13) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public static boolean m40259H() {
        return Thread.currentThread().equals(Looper.getMainLooper().getThread());
    }

    /* renamed from: I */
    public static boolean m40260I(String str) {
        return !TextUtils.isEmpty(str);
    }

    /* renamed from: J */
    public static boolean m40261J(String str) {
        if (str == null || str.matches("^[0-9]")) {
            return false;
        }
        return true;
    }

    /* renamed from: K */
    public static <T> Set<T> m40262K() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    /* renamed from: L */
    public static Set<String> m40263L(JSONArray jSONArray) throws JSONException {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            hashSet.add(jSONArray.getString(i));
        }
        return hashSet;
    }

    /* renamed from: M */
    public static void m40264M(Uri uri) {
        OneSignal.f26030e.startActivity(m40266O(uri));
    }

    /* renamed from: N */
    public static void m40265N(String str) {
        m40264M(Uri.parse(str.trim()));
    }

    /* renamed from: O */
    public static Intent m40266O(Uri uri) {
        SchemaType schemaType;
        Intent intent;
        if (uri.getScheme() != null) {
            schemaType = SchemaType.fromString(uri.getScheme());
        } else {
            schemaType = null;
        }
        if (schemaType == null) {
            schemaType = SchemaType.HTTP;
            if (!uri.toString().contains("://")) {
                uri = Uri.parse("http://" + uri.toString());
            }
        }
        if (C5125a.f25995a[schemaType.ordinal()] != 1) {
            intent = new Intent("android.intent.action.VIEW", uri);
        } else {
            intent = Intent.makeMainSelectorActivity("android.intent.action.MAIN", "android.intent.category.APP_BROWSER");
            intent.setData(uri);
        }
        intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        return intent;
    }

    /* renamed from: P */
    public static boolean m40267P(String str) {
        try {
            return OneSignal.f26030e.getPackageManager().getPackageInfo(str, 128).applicationInfo.enabled;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: Q */
    public static long[] m40268Q(JSONObject jSONObject) {
        JSONArray jSONArray;
        try {
            Object opt = jSONObject.opt("vib_pt");
            if (opt instanceof String) {
                jSONArray = new JSONArray((String) opt);
            } else {
                jSONArray = (JSONArray) opt;
            }
            long[] jArr = new long[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                jArr[i] = jSONArray.optLong(i);
            }
            return jArr;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: R */
    public static void m40269R(Runnable runnable, int i) {
        new Handler(Looper.getMainLooper()).postDelayed(runnable, (long) i);
    }

    /* renamed from: S */
    public static void m40270S(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    /* renamed from: T */
    public static boolean m40271T(String str) {
        if (str != null) {
            return false;
        }
        OneSignal.m40376a(OneSignal.LOG_LEVEL.INFO, "OneSignal was not initialized, ensure to always initialize OneSignal from the onCreate of your Application class.");
        return true;
    }

    /* renamed from: U */
    public static boolean m40272U(int i) {
        for (int i2 : f25993b) {
            if (i == i2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: V */
    public static void m40273V(int i) {
        try {
            Thread.sleep((long) i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static boolean m40274a(Context context) {
        try {
            return qb4.m25577d(OneSignal.f26030e).mo25049a();
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: f */
    public static String m40275f(Context context, String str) {
        Bundle h = m40277h(context);
        if (h != null) {
            return h.getString(str);
        }
        return null;
    }

    /* renamed from: g */
    public static boolean m40276g(Context context, String str) {
        Bundle h = m40277h(context);
        if (h != null) {
            return h.getBoolean(str);
        }
        return false;
    }

    /* renamed from: h */
    public static Bundle m40277h(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException e) {
            OneSignal.m40379b(OneSignal.LOG_LEVEL.ERROR, "Manifest application info not found", e);
            return null;
        }
    }

    /* renamed from: j */
    public static int m40278j(int i, int i2) {
        return new Random().nextInt((i2 + 1) - i) + i;
    }

    /* renamed from: k */
    public static String m40279k(Context context, String str, String str2) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(str, Utf8String.TYPE_NAME, context.getPackageName());
        if (identifier != 0) {
            return resources.getString(identifier);
        }
        return str2;
    }

    /* renamed from: l */
    public static String m40280l(Throwable th) {
        return m40281m(th).getMessage();
    }

    /* renamed from: m */
    public static Throwable m40281m(Throwable th) {
        while (th.getCause() != null && th.getCause() != th) {
            th = th.getCause();
        }
        return th;
    }

    /* renamed from: n */
    public static Uri m40282n(Context context, String str) {
        int identifier;
        Resources resources = context.getResources();
        String packageName = context.getPackageName();
        if (!m40261J(str) || (identifier = resources.getIdentifier(str, "raw", packageName)) == 0) {
            int identifier2 = resources.getIdentifier("onesignal_default_sound", "raw", packageName);
            if (identifier2 == 0) {
                return null;
            }
            return Uri.parse("android.resource://" + packageName + "/" + identifier2);
        }
        return Uri.parse("android.resource://" + packageName + "/" + identifier);
    }

    /* renamed from: o */
    public static int m40283o(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 15;
        }
    }

    @Keep
    private static boolean opaqueHasClass(Class<?> cls) {
        return true;
    }

    /* renamed from: p */
    public static boolean m40284p() {
        if (!m40288t() || !m40291w()) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public static boolean m40285q(Activity activity, int i) {
        try {
            if ((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).configChanges & i) != 0) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: r */
    public static boolean m40286r() {
        try {
            return opaqueHasClass(FirebaseMessaging.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    /* renamed from: s */
    public static boolean m40287s() {
        try {
            return opaqueHasClass(LocationListener.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    /* renamed from: t */
    public static boolean m40288t() {
        try {
            return opaqueHasClass(AGConnectServicesConfig.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    /* renamed from: u */
    public static boolean m40289u() {
        try {
            return opaqueHasClass(HuaweiApiAvailability.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    /* renamed from: v */
    public static boolean m40290v() {
        try {
            return opaqueHasClass(LocationCallback.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    /* renamed from: w */
    public static boolean m40291w() {
        try {
            return opaqueHasClass(HmsInstanceId.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    /* renamed from: x */
    public static boolean m40292x() {
        Class<JobIntentService> cls = JobIntentService.class;
        return true;
    }

    /* renamed from: y */
    public static boolean m40293y() {
        return true;
    }

    /* renamed from: z */
    public static boolean m40294z() {
        Class<WakefulBroadcastReceiver> cls = WakefulBroadcastReceiver.class;
        return true;
    }

    /* renamed from: A */
    public int mo38553A(Context context, String str) {
        Integer c;
        int e = mo38560e();
        try {
            UUID.fromString(str);
            if ("b2f7f966-d8cc-11e4-bed1-df8f05be55ba".equals(str) || "5eb5a37e-b458-11e3-ac11-000c2940e62c".equals(str)) {
                OneSignal.m40376a(OneSignal.LOG_LEVEL.ERROR, "OneSignal Example AppID detected, please update to your app's id found on OneSignal.com");
            }
            int i = 1;
            if (e == 1 && (c = mo38558c()) != null) {
                i = c.intValue();
            }
            Integer b = mo38557b(context);
            if (b != null) {
                return b.intValue();
            }
            return i;
        } catch (Throwable th) {
            OneSignal.m40379b(OneSignal.LOG_LEVEL.FATAL, "OneSignal AppId format is invalid.\nExample: 'b2f7f966-d8cc-11e4-bed1-df8f05be55ba'\n", th);
            return -999;
        }
    }

    /* renamed from: W */
    public final boolean mo38554W() {
        try {
            Class.forName("com.amazon.device.messaging.ADM");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: X */
    public final boolean mo38555X() {
        if (!m40286r()) {
            return false;
        }
        return m40255D();
    }

    /* renamed from: Y */
    public final boolean mo38556Y() {
        if (!m40289u() || !m40284p()) {
            return false;
        }
        return m40256E();
    }

    /* renamed from: b */
    public final Integer mo38557b(Context context) {
        boolean z = m40294z();
        boolean y = m40293y();
        if (!z && !y) {
            OneSignal.m40376a(OneSignal.LOG_LEVEL.FATAL, "Could not find the Android Support Library. Please make sure it has been correctly added to your project.");
            return -3;
        } else if (!z || !y) {
            OneSignal.m40376a(OneSignal.LOG_LEVEL.FATAL, "The included Android Support Library is to old or incomplete. Please update to the 26.0.0 revision or newer.");
            return -5;
        } else if (Build.VERSION.SDK_INT < 26 || m40283o(context) < 26 || m40292x()) {
            return null;
        } else {
            OneSignal.m40376a(OneSignal.LOG_LEVEL.FATAL, "The included Android Support Library is to old or incomplete. Please update to the 26.0.0 revision or newer.");
            return -5;
        }
    }

    /* renamed from: c */
    public Integer mo38558c() {
        if (m40286r()) {
            return null;
        }
        OneSignal.m40376a(OneSignal.LOG_LEVEL.FATAL, "The Firebase FCM library is missing! Please make sure to include it in your project.");
        return -4;
    }

    /* renamed from: d */
    public String mo38559d() {
        try {
            String networkOperatorName = ((TelephonyManager) OneSignal.f26030e.getSystemService("phone")).getNetworkOperatorName();
            if ("".equals(networkOperatorName)) {
                return null;
            }
            return networkOperatorName;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: e */
    public int mo38560e() {
        if (mo38554W()) {
            return 2;
        }
        if (mo38555X()) {
            return 1;
        }
        if (mo38556Y()) {
            return 13;
        }
        if (!m40255D() && m40257F()) {
            return 13;
        }
        return 1;
    }

    /* renamed from: i */
    public Integer mo38561i() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) OneSignal.f26030e.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return null;
        }
        int type = activeNetworkInfo.getType();
        if (type == 1 || type == 9) {
            return 0;
        }
        return 1;
    }
}
