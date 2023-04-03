package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;
import org.web3j.abi.datatypes.Utf8String;

/* renamed from: com.google.firebase.messaging.c */
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public class C4806c {

    /* renamed from: a */
    public final Bundle f25449a;

    public C4806c(Bundle bundle) {
        if (bundle != null) {
            this.f25449a = new Bundle(bundle);
            return;
        }
        throw new NullPointerException("data");
    }

    /* renamed from: d */
    public static int m38658d(String str) {
        int parseColor = Color.parseColor(str);
        if (parseColor != -16777216) {
            return parseColor;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    /* renamed from: s */
    public static boolean m38659s(String str) {
        if (str.startsWith("google.c.a.") || str.equals("from")) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public static boolean m38660t(Bundle bundle) {
        if ("1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(m38662v("gcm.n.e")))) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public static boolean m38661u(String str) {
        if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public static String m38662v(String str) {
        if (!str.startsWith("gcm.n.")) {
            return str;
        }
        return str.replace("gcm.n.", "gcm.notification.");
    }

    /* renamed from: z */
    public static String m38663z(String str) {
        if (str.startsWith("gcm.n.")) {
            return str.substring(6);
        }
        return str;
    }

    /* renamed from: a */
    public boolean mo36252a(String str) {
        String p = mo36266p(str);
        if ("1".equals(p) || Boolean.parseBoolean(p)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public Integer mo36253b(String str) {
        String p = mo36266p(str);
        if (TextUtils.isEmpty(p)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(p));
        } catch (NumberFormatException unused) {
            String z = m38663z(str);
            StringBuilder sb = new StringBuilder(String.valueOf(z).length() + 38 + String.valueOf(p).length());
            sb.append("Couldn't parse value of ");
            sb.append(z);
            sb.append("(");
            sb.append(p);
            sb.append(") into an int");
            return null;
        }
    }

    /* renamed from: c */
    public JSONArray mo36254c(String str) {
        String p = mo36266p(str);
        if (TextUtils.isEmpty(p)) {
            return null;
        }
        try {
            return new JSONArray(p);
        } catch (JSONException unused) {
            String z = m38663z(str);
            StringBuilder sb = new StringBuilder(String.valueOf(z).length() + 50 + String.valueOf(p).length());
            sb.append("Malformed JSON for key ");
            sb.append(z);
            sb.append(": ");
            sb.append(p);
            sb.append(", falling back to default");
            return null;
        }
    }

    /* renamed from: e */
    public int[] mo36255e() {
        JSONArray c = mo36254c("gcm.n.light_settings");
        if (c == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (c.length() == 3) {
                iArr[0] = m38658d(c.optString(0));
                iArr[1] = c.optInt(1);
                iArr[2] = c.optInt(2);
                return iArr;
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (JSONException unused) {
            String valueOf = String.valueOf(c);
            StringBuilder sb = new StringBuilder(valueOf.length() + 58);
            sb.append("LightSettings is invalid: ");
            sb.append(valueOf);
            sb.append(". Skipping setting LightSettings");
            return null;
        } catch (IllegalArgumentException e) {
            String valueOf2 = String.valueOf(c);
            String message = e.getMessage();
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 60 + String.valueOf(message).length());
            sb2.append("LightSettings is invalid: ");
            sb2.append(valueOf2);
            sb2.append(". ");
            sb2.append(message);
            sb2.append(". Skipping setting LightSettings");
            return null;
        }
    }

    /* renamed from: f */
    public Uri mo36256f() {
        String p = mo36266p("gcm.n.link_android");
        if (TextUtils.isEmpty(p)) {
            p = mo36266p("gcm.n.link");
        }
        if (!TextUtils.isEmpty(p)) {
            return Uri.parse(p);
        }
        return null;
    }

    /* renamed from: g */
    public Object[] mo36257g(String str) {
        JSONArray c = mo36254c(String.valueOf(str).concat("_loc_args"));
        if (c == null) {
            return null;
        }
        int length = c.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = c.optString(i);
        }
        return strArr;
    }

    /* renamed from: h */
    public String mo36258h(String str) {
        return mo36266p(String.valueOf(str).concat("_loc_key"));
    }

    /* renamed from: i */
    public String mo36259i(Resources resources, String str, String str2) {
        String h = mo36258h(str2);
        if (TextUtils.isEmpty(h)) {
            return null;
        }
        int identifier = resources.getIdentifier(h, Utf8String.TYPE_NAME, str);
        if (identifier == 0) {
            String z = m38663z(String.valueOf(str2).concat("_loc_key"));
            StringBuilder sb = new StringBuilder(String.valueOf(z).length() + 49 + String.valueOf(str2).length());
            sb.append(z);
            sb.append(" resource not found: ");
            sb.append(str2);
            sb.append(" Default value will be used.");
            return null;
        }
        Object[] g = mo36257g(str2);
        if (g == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, g);
        } catch (MissingFormatArgumentException unused) {
            String z2 = m38663z(str2);
            String arrays = Arrays.toString(g);
            StringBuilder sb2 = new StringBuilder(String.valueOf(z2).length() + 58 + String.valueOf(arrays).length());
            sb2.append("Missing format argument for ");
            sb2.append(z2);
            sb2.append(": ");
            sb2.append(arrays);
            sb2.append(" Default value will be used.");
            return null;
        }
    }

    /* renamed from: j */
    public Long mo36260j(String str) {
        String p = mo36266p(str);
        if (TextUtils.isEmpty(p)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(p));
        } catch (NumberFormatException unused) {
            String z = m38663z(str);
            StringBuilder sb = new StringBuilder(String.valueOf(z).length() + 38 + String.valueOf(p).length());
            sb.append("Couldn't parse value of ");
            sb.append(z);
            sb.append("(");
            sb.append(p);
            sb.append(") into a long");
            return null;
        }
    }

    /* renamed from: k */
    public String mo36261k() {
        return mo36266p("gcm.n.android_channel_id");
    }

    /* renamed from: l */
    public Integer mo36262l() {
        Integer b = mo36253b("gcm.n.notification_count");
        if (b == null) {
            return null;
        }
        if (b.intValue() >= 0) {
            return b;
        }
        String valueOf = String.valueOf(b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 67);
        sb.append("notificationCount is invalid: ");
        sb.append(valueOf);
        sb.append(". Skipping setting notificationCount.");
        return null;
    }

    /* renamed from: m */
    public Integer mo36263m() {
        Integer b = mo36253b("gcm.n.notification_priority");
        if (b == null) {
            return null;
        }
        if (b.intValue() >= -2 && b.intValue() <= 2) {
            return b;
        }
        String valueOf = String.valueOf(b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 72);
        sb.append("notificationPriority is invalid ");
        sb.append(valueOf);
        sb.append(". Skipping setting notificationPriority.");
        return null;
    }

    /* renamed from: n */
    public String mo36264n(Resources resources, String str, String str2) {
        String p = mo36266p(str2);
        if (!TextUtils.isEmpty(p)) {
            return p;
        }
        return mo36259i(resources, str, str2);
    }

    /* renamed from: o */
    public String mo36265o() {
        String p = mo36266p("gcm.n.sound2");
        if (TextUtils.isEmpty(p)) {
            return mo36266p("gcm.n.sound");
        }
        return p;
    }

    /* renamed from: p */
    public String mo36266p(String str) {
        return this.f25449a.getString(mo36269w(str));
    }

    /* renamed from: q */
    public long[] mo36267q() {
        JSONArray c = mo36254c("gcm.n.vibrate_timings");
        if (c == null) {
            return null;
        }
        try {
            if (c.length() > 1) {
                int length = c.length();
                long[] jArr = new long[length];
                for (int i = 0; i < length; i++) {
                    jArr[i] = c.optLong(i);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            String valueOf = String.valueOf(c);
            StringBuilder sb = new StringBuilder(valueOf.length() + 74);
            sb.append("User defined vibrateTimings is invalid: ");
            sb.append(valueOf);
            sb.append(". Skipping setting vibrateTimings.");
            return null;
        }
    }

    /* renamed from: r */
    public Integer mo36268r() {
        Integer b = mo36253b("gcm.n.visibility");
        if (b == null) {
            return null;
        }
        if (b.intValue() >= -1 && b.intValue() <= 1) {
            return b;
        }
        String valueOf = String.valueOf(b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 53);
        sb.append("visibility is invalid: ");
        sb.append(valueOf);
        sb.append(". Skipping setting visibility.");
        return null;
    }

    /* renamed from: w */
    public final String mo36269w(String str) {
        if (!this.f25449a.containsKey(str) && str.startsWith("gcm.n.")) {
            String v = m38662v(str);
            if (this.f25449a.containsKey(v)) {
                return v;
            }
        }
        return str;
    }

    /* renamed from: x */
    public Bundle mo36270x() {
        Bundle bundle = new Bundle(this.f25449a);
        for (String next : this.f25449a.keySet()) {
            if (!m38659s(next)) {
                bundle.remove(next);
            }
        }
        return bundle;
    }

    /* renamed from: y */
    public Bundle mo36271y() {
        Bundle bundle = new Bundle(this.f25449a);
        for (String next : this.f25449a.keySet()) {
            if (m38661u(next)) {
                bundle.remove(next);
            }
        }
        return bundle;
    }
}
