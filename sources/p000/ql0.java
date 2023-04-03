package p000;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.firebase.messaging.C4806c;
import java.util.concurrent.atomic.AtomicInteger;
import net.sqlcipher.database.SQLiteDatabase;
import org.web3j.abi.datatypes.Utf8String;
import p000.f94;

/* renamed from: ql0 */
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final class ql0 {

    /* renamed from: a */
    public static final AtomicInteger f33151a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* renamed from: ql0$a */
    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    public static class C6415a {

        /* renamed from: a */
        public final f94.C2277e f33152a;

        /* renamed from: b */
        public final String f33153b;

        /* renamed from: c */
        public final int f33154c = 0;

        public C6415a(f94.C2277e eVar, String str, int i) {
            this.f33152a = eVar;
            this.f33153b = str;
        }
    }

    /* renamed from: a */
    public static PendingIntent m50617a(Context context, C4806c cVar, String str, PackageManager packageManager) {
        Intent f = m50622f(str, cVar, packageManager);
        if (f == null) {
            return null;
        }
        f.addFlags(67108864);
        f.putExtras(cVar.mo36271y());
        if (m50633q(cVar)) {
            f.putExtra("gcm.n.analytics_data", cVar.mo36270x());
        }
        return PendingIntent.getActivity(context, m50623g(), f, m50628l(1073741824));
    }

    /* renamed from: b */
    public static PendingIntent m50618b(Context context, C4806c cVar) {
        if (!m50633q(cVar)) {
            return null;
        }
        return m50619c(context, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(cVar.mo36270x()));
    }

    /* renamed from: c */
    public static PendingIntent m50619c(Context context, Intent intent) {
        return PendingIntent.getBroadcast(context, m50623g(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), m50628l(1073741824));
    }

    /* renamed from: d */
    public static C6415a m50620d(Context context, C4806c cVar) {
        Bundle j = m50626j(context.getPackageManager(), context.getPackageName());
        return m50621e(context, context.getPackageName(), cVar, m50627k(context, cVar.mo36261k(), j), context.getResources(), context.getPackageManager(), j);
    }

    /* renamed from: e */
    public static C6415a m50621e(Context context, String str, C4806c cVar, String str2, Resources resources, PackageManager packageManager, Bundle bundle) {
        f94.C2277e eVar = new f94.C2277e(context, str2);
        String n = cVar.mo36264n(resources, str, "gcm.n.title");
        if (!TextUtils.isEmpty(n)) {
            eVar.mo19800m(n);
        }
        String n2 = cVar.mo36264n(resources, str, "gcm.n.body");
        if (!TextUtils.isEmpty(n2)) {
            eVar.mo19799l(n2);
            eVar.mo19784C(new f94.C2275c().mo19781h(n2));
        }
        eVar.mo19782A(m50629m(packageManager, resources, str, cVar.mo36266p("gcm.n.icon"), bundle));
        Uri n3 = m50630n(str, cVar, resources);
        if (n3 != null) {
            eVar.mo19783B(n3);
        }
        eVar.mo19798k(m50617a(context, cVar, str, packageManager));
        PendingIntent b = m50618b(context, cVar);
        if (b != null) {
            eVar.mo19802o(b);
        }
        Integer h = m50624h(context, cVar.mo36266p("gcm.n.color"), bundle);
        if (h != null) {
            eVar.mo19796i(h.intValue());
        }
        eVar.mo19794g(!cVar.mo36252a("gcm.n.sticky"));
        eVar.mo19809v(cVar.mo36252a("gcm.n.local_only"));
        String p = cVar.mo36266p("gcm.n.ticker");
        if (p != null) {
            eVar.mo19785D(p);
        }
        Integer m = cVar.mo36263m();
        if (m != null) {
            eVar.mo19812y(m.intValue());
        }
        Integer r = cVar.mo36268r();
        if (r != null) {
            eVar.mo19787F(r.intValue());
        }
        Integer l = cVar.mo36262l();
        if (l != null) {
            eVar.mo19810w(l.intValue());
        }
        Long j = cVar.mo36260j("gcm.n.event_time");
        if (j != null) {
            eVar.mo19813z(true);
            eVar.mo19788G(j.longValue());
        }
        long[] q = cVar.mo36267q();
        if (q != null) {
            eVar.mo19786E(q);
        }
        int[] e = cVar.mo36255e();
        if (e != null) {
            eVar.mo19808u(e[0], e[1], e[2]);
        }
        eVar.mo19801n(m50625i(cVar));
        return new C6415a(eVar, m50631o(cVar), 0);
    }

    /* renamed from: f */
    public static Intent m50622f(String str, C4806c cVar, PackageManager packageManager) {
        String p = cVar.mo36266p("gcm.n.click_action");
        if (!TextUtils.isEmpty(p)) {
            Intent intent = new Intent(p);
            intent.setPackage(str);
            intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            return intent;
        }
        Uri f = cVar.mo36256f();
        if (f == null) {
            return packageManager.getLaunchIntentForPackage(str);
        }
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setPackage(str);
        intent2.setData(f);
        return intent2;
    }

    /* renamed from: g */
    public static int m50623g() {
        return f33151a.incrementAndGet();
    }

    /* renamed from: h */
    public static Integer m50624h(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56);
                sb.append("Color is invalid: ");
                sb.append(str);
                sb.append(". Notification will use default color.");
            }
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i == 0) {
            return null;
        }
        try {
            return Integer.valueOf(zr0.m31440c(context, i));
        } catch (Resources.NotFoundException unused2) {
            return null;
        }
    }

    /* renamed from: i */
    public static int m50625i(C4806c cVar) {
        boolean a = cVar.mo36252a("gcm.n.default_sound");
        if (cVar.mo36252a("gcm.n.default_vibrate_timings")) {
            a |= true;
        }
        return cVar.mo36252a("gcm.n.default_light_settings") ? a | true ? 1 : 0 : a ? 1 : 0;
    }

    /* renamed from: j */
    public static Bundle m50626j(PackageManager packageManager, String str) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (!(applicationInfo == null || (bundle = applicationInfo.metaData) == null)) {
                return bundle;
            }
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 35);
            sb.append("Couldn't get own application info: ");
            sb.append(valueOf);
        }
        return Bundle.EMPTY;
    }

    @TargetApi(26)
    /* renamed from: k */
    public static String m50627k(Context context, String str, Bundle bundle) {
        String str2;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion >= 26) {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (!TextUtils.isEmpty(str)) {
                    if (notificationManager.getNotificationChannel(str) != null) {
                        return str;
                    }
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 122);
                    sb.append("Notification Channel requested (");
                    sb.append(str);
                    sb.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
                }
                String string = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
                if (!TextUtils.isEmpty(string) && notificationManager.getNotificationChannel(string) != null) {
                    return string;
                }
                if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                    int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", Utf8String.TYPE_NAME, context.getPackageName());
                    if (identifier == 0) {
                        str2 = "Misc";
                    } else {
                        str2 = context.getString(identifier);
                    }
                    notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", str2, 3));
                }
                return "fcm_fallback_notification_channel";
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    /* renamed from: l */
    public static int m50628l(int i) {
        return 1140850688;
    }

    /* renamed from: m */
    public static int m50629m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && m50632p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && m50632p(resources, identifier2)) {
                return identifier2;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 61);
            sb.append("Icon resource ");
            sb.append(str2);
            sb.append(" not found. Notification will use default icon.");
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i == 0 || !m50632p(resources, i)) {
            try {
                i = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 35);
                sb2.append("Couldn't get own application info: ");
                sb2.append(valueOf);
            }
        }
        if (i == 0) {
            return 17301651;
        }
        if (!m50632p(resources, i)) {
            return 17301651;
        }
        return i;
    }

    /* renamed from: n */
    public static Uri m50630n(String str, C4806c cVar, Resources resources) {
        String o = cVar.mo36265o();
        if (TextUtils.isEmpty(o)) {
            return null;
        }
        if ("default".equals(o) || resources.getIdentifier(o, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 24 + String.valueOf(o).length());
        sb.append("android.resource://");
        sb.append(str);
        sb.append("/raw/");
        sb.append(o);
        return Uri.parse(sb.toString());
    }

    /* renamed from: o */
    public static String m50631o(C4806c cVar) {
        String p = cVar.mo36266p("gcm.n.tag");
        if (!TextUtils.isEmpty(p)) {
            return p;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        StringBuilder sb = new StringBuilder(37);
        sb.append("FCM-Notification:");
        sb.append(uptimeMillis);
        return sb.toString();
    }

    @TargetApi(26)
    /* renamed from: p */
    public static boolean m50632p(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i, (Resources.Theme) null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            StringBuilder sb = new StringBuilder(77);
            sb.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
            sb.append(i);
            return false;
        } catch (Resources.NotFoundException unused) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Couldn't find resource ");
            sb2.append(i);
            sb2.append(", treating it as an invalid icon");
            return false;
        }
    }

    /* renamed from: q */
    public static boolean m50633q(C4806c cVar) {
        return cVar.mo36252a("google.c.a.e");
    }
}
