package p000;

import android.util.Log;

/* renamed from: lh2 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class lh2 {

    /* renamed from: a */
    public final String f31317a;

    /* renamed from: b */
    public final String f31318b;

    public lh2(String str, String str2) {
        boolean z;
        cu4.m43222l(str, "log tag cannot be null");
        if (str.length() <= 23) {
            z = true;
        } else {
            z = false;
        }
        cu4.m43213c(z, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f31317a = str;
        if (str2 == null || str2.length() <= 0) {
            this.f31318b = null;
        } else {
            this.f31318b = str2;
        }
    }

    /* renamed from: a */
    public boolean mo45432a(int i) {
        return Log.isLoggable(this.f31317a, i);
    }

    /* renamed from: b */
    public void mo45433b(String str, String str2) {
        if (mo45432a(3)) {
            mo45438g(str2);
        }
    }

    /* renamed from: c */
    public void mo45434c(String str, String str2) {
        if (mo45432a(6)) {
            mo45438g(str2);
        }
    }

    /* renamed from: d */
    public void mo45435d(String str, String str2, Throwable th) {
        if (mo45432a(6)) {
            mo45438g(str2);
        }
    }

    /* renamed from: e */
    public void mo45436e(String str, String str2) {
        if (mo45432a(2)) {
            mo45438g(str2);
        }
    }

    /* renamed from: f */
    public void mo45437f(String str, String str2) {
        if (mo45432a(5)) {
            mo45438g(str2);
        }
    }

    /* renamed from: g */
    public final String mo45438g(String str) {
        String str2 = this.f31318b;
        if (str2 == null) {
            return str;
        }
        return str2.concat(str);
    }
}
