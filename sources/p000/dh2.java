package p000;

import android.net.Uri;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* renamed from: dh2 */
/* compiled from: GlideUrl */
public class dh2 implements z93 {

    /* renamed from: b */
    public final ql2 f10715b;

    /* renamed from: c */
    public final URL f10716c;

    /* renamed from: d */
    public final String f10717d;

    /* renamed from: e */
    public String f10718e;

    /* renamed from: f */
    public URL f10719f;

    /* renamed from: g */
    public volatile byte[] f10720g;

    /* renamed from: h */
    public int f10721h;

    public dh2(URL url) {
        this(url, ql2.f16970b);
    }

    /* renamed from: b */
    public void mo18753b(MessageDigest messageDigest) {
        messageDigest.update(mo18776d());
    }

    /* renamed from: c */
    public String mo18775c() {
        String str = this.f10717d;
        if (str != null) {
            return str;
        }
        return ((URL) zt4.m31500d(this.f10716c)).toString();
    }

    /* renamed from: d */
    public final byte[] mo18776d() {
        if (this.f10720g == null) {
            this.f10720g = mo18775c().getBytes(z93.f20511a);
        }
        return this.f10720g;
    }

    /* renamed from: e */
    public Map<String, String> mo18777e() {
        return this.f10715b.mo23168a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof dh2)) {
            return false;
        }
        dh2 dh2 = (dh2) obj;
        if (!mo18775c().equals(dh2.mo18775c()) || !this.f10715b.equals(dh2.f10715b)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final String mo18778f() {
        if (TextUtils.isEmpty(this.f10718e)) {
            String str = this.f10717d;
            if (TextUtils.isEmpty(str)) {
                str = ((URL) zt4.m31500d(this.f10716c)).toString();
            }
            this.f10718e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f10718e;
    }

    /* renamed from: g */
    public final URL mo18779g() throws MalformedURLException {
        if (this.f10719f == null) {
            this.f10719f = new URL(mo18778f());
        }
        return this.f10719f;
    }

    /* renamed from: h */
    public String mo18780h() {
        return mo18778f();
    }

    public int hashCode() {
        if (this.f10721h == 0) {
            int hashCode = mo18775c().hashCode();
            this.f10721h = hashCode;
            this.f10721h = (hashCode * 31) + this.f10715b.hashCode();
        }
        return this.f10721h;
    }

    /* renamed from: i */
    public URL mo18781i() throws MalformedURLException {
        return mo18779g();
    }

    public String toString() {
        return mo18775c();
    }

    public dh2(String str) {
        this(str, ql2.f16970b);
    }

    public dh2(URL url, ql2 ql2) {
        this.f10716c = (URL) zt4.m31500d(url);
        this.f10717d = null;
        this.f10715b = (ql2) zt4.m31500d(ql2);
    }

    public dh2(String str, ql2 ql2) {
        this.f10716c = null;
        this.f10717d = zt4.m31498b(str);
        this.f10715b = (ql2) zt4.m31500d(ql2);
    }
}
