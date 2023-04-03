package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

/* renamed from: zp2 */
/* compiled from: IdManager */
public class zp2 implements uv2 {

    /* renamed from: g */
    public static final Pattern f36205g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h */
    public static final String f36206h = Pattern.quote("/");

    /* renamed from: a */
    public final wv2 f36207a;

    /* renamed from: b */
    public final Context f36208b;

    /* renamed from: c */
    public final String f36209c;

    /* renamed from: d */
    public final o22 f36210d;

    /* renamed from: e */
    public final m11 f36211e;

    /* renamed from: f */
    public String f36212f;

    public zp2(Context context, String str, o22 o22, m11 m11) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        } else if (str != null) {
            this.f36208b = context;
            this.f36209c = str;
            this.f36210d = o22;
            this.f36211e = m11;
            this.f36207a = new wv2();
        } else {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
    }

    /* renamed from: c */
    public static String m55172c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    /* renamed from: e */
    public static String m55173e(String str) {
        if (str == null) {
            return null;
        }
        return f36205g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    /* renamed from: k */
    public static boolean m55174k(String str) {
        if (str == null || !str.startsWith("SYN_")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public synchronized String mo48534a() {
        String str = this.f36212f;
        if (str != null) {
            return str;
        }
        rk3.m51112f().mo47429i("Determining Crashlytics installation ID...");
        SharedPreferences r = CommonUtils.m38415r(this.f36208b);
        String string = r.getString("firebase.installation.id", (String) null);
        rk3 f = rk3.m51112f();
        f.mo47429i("Cached Firebase Installation ID: " + string);
        if (this.f36211e.mo45599d()) {
            String d = mo49896d();
            rk3 f2 = rk3.m51112f();
            f2.mo47429i("Fetched Firebase Installation ID: " + d);
            if (d == null) {
                if (string == null) {
                    d = m55172c();
                } else {
                    d = string;
                }
            }
            if (d.equals(string)) {
                this.f36212f = mo49902l(r);
            } else {
                this.f36212f = mo49895b(d, r);
            }
        } else if (m55174k(string)) {
            this.f36212f = mo49902l(r);
        } else {
            this.f36212f = mo49895b(m55172c(), r);
        }
        if (this.f36212f == null) {
            rk3.m51112f().mo47431k("Unable to determine Crashlytics Install Id, creating a new one.");
            this.f36212f = mo49895b(m55172c(), r);
        }
        rk3 f3 = rk3.m51112f();
        f3.mo47429i("Crashlytics installation ID: " + this.f36212f);
        return this.f36212f;
    }

    /* renamed from: b */
    public final synchronized String mo49895b(String str, SharedPreferences sharedPreferences) {
        String e;
        e = m55173e(UUID.randomUUID().toString());
        rk3 f = rk3.m51112f();
        f.mo47429i("Created new Crashlytics installation ID: " + e + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", e).putString("firebase.installation.id", str).apply();
        return e;
    }

    /* renamed from: d */
    public final String mo49896d() {
        try {
            return (String) o77.m49176b(this.f36210d.getId());
        } catch (Exception e) {
            rk3.m51112f().mo47432l("Failed to retrieve Firebase Installations ID.", e);
            return null;
        }
    }

    /* renamed from: f */
    public String mo49897f() {
        return this.f36209c;
    }

    /* renamed from: g */
    public String mo49898g() {
        return this.f36207a.mo49284a(this.f36208b);
    }

    /* renamed from: h */
    public String mo49899h() {
        return String.format(Locale.US, "%s/%s", new Object[]{mo49903m(Build.MANUFACTURER), mo49903m(Build.MODEL)});
    }

    /* renamed from: i */
    public String mo49900i() {
        return mo49903m(Build.VERSION.INCREMENTAL);
    }

    /* renamed from: j */
    public String mo49901j() {
        return mo49903m(Build.VERSION.RELEASE);
    }

    /* renamed from: l */
    public final String mo49902l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", (String) null);
    }

    /* renamed from: m */
    public final String mo49903m(String str) {
        return str.replaceAll(f36206h, "");
    }
}
