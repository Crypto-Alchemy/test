package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.installations.C4782a;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import java.util.concurrent.ExecutionException;
import p000.uu3;

/* renamed from: com.google.firebase.messaging.b */
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public class C4805b {
    /* renamed from: A */
    public static boolean m38630A(Intent intent) {
        if (intent == null || m38649r(intent)) {
            return false;
        }
        return m38631B(intent.getExtras());
    }

    /* renamed from: B */
    public static boolean m38631B(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m38632a() {
        /*
            java.lang.String r0 = "delivery_metrics_exported_to_big_query_enabled"
            r1 = 0
            p000.f22.m44161i()     // Catch:{ IllegalStateException -> 0x0044 }
            f22 r2 = p000.f22.m44161i()
            android.content.Context r2 = r2.mo42485h()
            java.lang.String r3 = "com.google.firebase.messaging"
            android.content.SharedPreferences r3 = r2.getSharedPreferences(r3, r1)
            java.lang.String r4 = "export_to_big_query"
            boolean r5 = r3.contains(r4)
            if (r5 == 0) goto L_0x0021
            boolean r0 = r3.getBoolean(r4, r1)
            return r0
        L_0x0021:
            android.content.pm.PackageManager r3 = r2.getPackageManager()     // Catch:{  }
            if (r3 == 0) goto L_0x0044
            java.lang.String r2 = r2.getPackageName()     // Catch:{  }
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r2 = r3.getApplicationInfo(r2, r4)     // Catch:{  }
            if (r2 == 0) goto L_0x0044
            android.os.Bundle r3 = r2.metaData     // Catch:{  }
            if (r3 == 0) goto L_0x0044
            boolean r3 = r3.containsKey(r0)     // Catch:{  }
            if (r3 == 0) goto L_0x0044
            android.os.Bundle r2 = r2.metaData     // Catch:{  }
            boolean r0 = r2.getBoolean(r0, r1)     // Catch:{  }
            return r0
        L_0x0044:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C4805b.m38632a():boolean");
    }

    /* renamed from: b */
    public static MessagingClientEvent m38633b(MessagingClientEvent.Event event, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        MessagingClientEvent.C4815a p = MessagingClientEvent.m38708p();
        p.mo36322m(m38647p(extras));
        p.mo36314e(event);
        p.mo36315f(m38637f(extras));
        p.mo36318i(m38644m());
        p.mo36320k(MessagingClientEvent.SDKPlatform.ANDROID);
        p.mo36317h(m38642k(extras));
        String h = m38639h(extras);
        if (h != null) {
            p.mo36316g(h);
        }
        String o = m38646o(extras);
        if (o != null) {
            p.mo36321l(o);
        }
        String c = m38634c(extras);
        if (c != null) {
            p.mo36312c(c);
        }
        String i = m38640i(extras);
        if (i != null) {
            p.mo36311b(i);
        }
        String e = m38636e(extras);
        if (e != null) {
            p.mo36313d(e);
        }
        long n = m38645n(extras);
        if (n > 0) {
            p.mo36319j(n);
        }
        return p.mo36310a();
    }

    /* renamed from: c */
    public static String m38634c(Bundle bundle) {
        return bundle.getString("collapse_key");
    }

    /* renamed from: d */
    public static String m38635d(Bundle bundle) {
        return bundle.getString("google.c.a.c_id");
    }

    /* renamed from: e */
    public static String m38636e(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    /* renamed from: f */
    public static String m38637f(Bundle bundle) {
        String string = bundle.getString("google.to");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) jm6.m46615a(C4782a.m38441o(f22.m44161i()).getId());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: g */
    public static String m38638g(Bundle bundle) {
        return bundle.getString("google.c.a.m_c");
    }

    /* renamed from: h */
    public static String m38639h(Bundle bundle) {
        String string = bundle.getString("google.message_id");
        if (string == null) {
            return bundle.getString("message_id");
        }
        return string;
    }

    /* renamed from: i */
    public static String m38640i(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    /* renamed from: j */
    public static String m38641j(Bundle bundle) {
        return bundle.getString("google.c.a.ts");
    }

    /* renamed from: k */
    public static MessagingClientEvent.MessageType m38642k(Bundle bundle) {
        if (bundle == null || !C4806c.m38660t(bundle)) {
            return MessagingClientEvent.MessageType.DATA_MESSAGE;
        }
        return MessagingClientEvent.MessageType.DISPLAY_NOTIFICATION;
    }

    /* renamed from: l */
    public static String m38643l(Bundle bundle) {
        if (true != C4806c.m38660t(bundle)) {
            return "data";
        }
        return "display";
    }

    /* renamed from: m */
    public static String m38644m() {
        return f22.m44161i().mo42485h().getPackageName();
    }

    /* renamed from: n */
    public static long m38645n(Bundle bundle) {
        if (bundle.containsKey("google.c.sender.id")) {
            try {
                return Long.parseLong(bundle.getString("google.c.sender.id"));
            } catch (NumberFormatException unused) {
            }
        }
        f22 i = f22.m44161i();
        String d = i.mo42488k().mo29853d();
        if (d != null) {
            try {
                return Long.parseLong(d);
            } catch (NumberFormatException unused2) {
            }
        }
        String c = i.mo42488k().mo29852c();
        if (!c.startsWith("1:")) {
            try {
                return Long.parseLong(c);
            } catch (NumberFormatException unused3) {
                return 0;
            }
        } else {
            String[] split = c.split(":");
            if (split.length < 2) {
                return 0;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return 0;
            }
            return Long.parseLong(str);
        }
    }

    /* renamed from: o */
    public static String m38646o(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    /* renamed from: p */
    public static int m38647p(Bundle bundle) {
        Object obj = bundle.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(valueOf.length() + 13);
            sb.append("Invalid TTL: ");
            sb.append(valueOf);
            return 0;
        }
    }

    /* renamed from: q */
    public static String m38648q(Bundle bundle) {
        if (bundle.containsKey("google.c.a.udt")) {
            return bundle.getString("google.c.a.udt");
        }
        return null;
    }

    /* renamed from: r */
    public static boolean m38649r(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }

    /* renamed from: s */
    public static void m38650s(Intent intent) {
        m38655x("_nd", intent.getExtras());
    }

    /* renamed from: t */
    public static void m38651t(Intent intent) {
        m38655x("_nf", intent.getExtras());
    }

    /* renamed from: u */
    public static void m38652u(Bundle bundle) {
        m38656y(bundle);
        m38655x("_no", bundle);
    }

    /* renamed from: v */
    public static void m38653v(Intent intent) {
        if (m38630A(intent)) {
            m38655x("_nr", intent.getExtras());
        }
        if (m38657z(intent)) {
            m38654w(MessagingClientEvent.Event.MESSAGE_DELIVERED, intent, FirebaseMessaging.m38583k());
        }
    }

    /* renamed from: w */
    public static void m38654w(MessagingClientEvent.Event event, Intent intent, ix6 ix6) {
        MessagingClientEvent b;
        if (ix6 != null && (b = m38633b(event, intent)) != null) {
            try {
                fx6<uu3> a = ix6.mo43972a("FCM_CLIENT_EVENT_LOGGING", uu3.class, qp1.m50725b("proto"), tu3.f34390a);
                uu3.C6583a b2 = uu3.m53019b();
                b2.mo48531b(b);
                a.mo42686a(gt1.m44893d(b2.mo48530a()));
            } catch (RuntimeException unused) {
            }
        }
    }

    /* renamed from: x */
    public static void m38655x(String str, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = new Bundle();
        String d = m38635d(bundle);
        if (d != null) {
            bundle2.putString("_nmid", d);
        }
        String e = m38636e(bundle);
        if (e != null) {
            bundle2.putString("_nmn", e);
        }
        String i = m38640i(bundle);
        if (!TextUtils.isEmpty(i)) {
            bundle2.putString("label", i);
        }
        String g = m38638g(bundle);
        if (!TextUtils.isEmpty(g)) {
            bundle2.putString("message_channel", g);
        }
        String o = m38646o(bundle);
        if (o != null) {
            bundle2.putString("_nt", o);
        }
        String j = m38641j(bundle);
        if (j != null) {
            try {
                bundle2.putInt("_nmt", Integer.parseInt(j));
            } catch (NumberFormatException unused) {
            }
        }
        String q = m38648q(bundle);
        if (q != null) {
            try {
                bundle2.putInt("_ndt", Integer.parseInt(q));
            } catch (NumberFormatException unused2) {
            }
        }
        String l = m38643l(bundle);
        if ("_nr".equals(str) || "_nf".equals(str)) {
            bundle2.putString("_nmc", l);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String valueOf = String.valueOf(bundle2);
            StringBuilder sb = new StringBuilder(str.length() + 37 + valueOf.length());
            sb.append("Logging to scion event=");
            sb.append(str);
            sb.append(" scionPayload=");
            sb.append(valueOf);
        }
        C6436rf rfVar = (C6436rf) f22.m44161i().mo42484g(C6436rf.class);
        if (rfVar != null) {
            rfVar.mo47394a("fcm", str, bundle2);
        }
    }

    /* renamed from: y */
    public static void m38656y(Bundle bundle) {
        C6436rf rfVar;
        if (bundle != null && "1".equals(bundle.getString("google.c.a.tc")) && (rfVar = (C6436rf) f22.m44161i().mo42484g(C6436rf.class)) != null) {
            String string = bundle.getString("google.c.a.c_id");
            rfVar.mo47395b("fcm", "_ln", string);
            Bundle bundle2 = new Bundle();
            bundle2.putString("source", "Firebase");
            bundle2.putString("medium", "notification");
            bundle2.putString("campaign", string);
            rfVar.mo47394a("fcm", "_cmp", bundle2);
        }
    }

    /* renamed from: z */
    public static boolean m38657z(Intent intent) {
        if (intent == null || m38649r(intent)) {
            return false;
        }
        return m38632a();
    }
}
