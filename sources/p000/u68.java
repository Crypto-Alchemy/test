package p000;

import android.os.Bundle;

/* renamed from: u68 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class u68 {

    /* renamed from: c */
    public static final u68 f34472c = new u68((Boolean) null, (Boolean) null);

    /* renamed from: a */
    public final Boolean f34473a;

    /* renamed from: b */
    public final Boolean f34474b;

    public u68(Boolean bool, Boolean bool2) {
        this.f34473a = bool;
        this.f34474b = bool2;
    }

    /* renamed from: a */
    public static String m52646a(Bundle bundle) {
        String string = bundle.getString("ad_storage");
        if (string != null && m52652o(string) == null) {
            return string;
        }
        String string2 = bundle.getString("analytics_storage");
        if (string2 == null || m52652o(string2) != null) {
            return null;
        }
        return string2;
    }

    /* renamed from: b */
    public static u68 m52647b(Bundle bundle) {
        if (bundle == null) {
            return f34472c;
        }
        return new u68(m52652o(bundle.getString("ad_storage")), m52652o(bundle.getString("analytics_storage")));
    }

    /* renamed from: c */
    public static u68 m52648c(String str) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3 = null;
        if (str != null) {
            if (str.length() >= 3) {
                bool2 = m52653p(str.charAt(2));
            } else {
                bool2 = null;
            }
            if (str.length() >= 4) {
                bool3 = m52653p(str.charAt(3));
            }
            bool = bool3;
            bool3 = bool2;
        } else {
            bool = null;
        }
        return new u68(bool3, bool);
    }

    /* renamed from: j */
    public static Boolean m52649j(Boolean bool, Boolean bool2) {
        if (bool == null) {
            return bool2;
        }
        if (bool2 == null) {
            return bool;
        }
        boolean z = false;
        if (bool.booleanValue() && bool2.booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: m */
    public static boolean m52650m(int i, int i2) {
        return i <= i2;
    }

    /* renamed from: n */
    public static final int m52651n(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        if (bool.booleanValue()) {
            return 1;
        }
        return 2;
    }

    /* renamed from: o */
    public static Boolean m52652o(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* renamed from: p */
    public static Boolean m52653p(char c) {
        if (c == '0') {
            return Boolean.FALSE;
        }
        if (c != '1') {
            return null;
        }
        return Boolean.TRUE;
    }

    /* renamed from: q */
    public static final char m52654q(Boolean bool) {
        if (bool == null) {
            return '-';
        }
        if (bool.booleanValue()) {
            return '1';
        }
        return '0';
    }

    /* renamed from: d */
    public final String mo48326d() {
        return "G1" + m52654q(this.f34473a) + m52654q(this.f34474b);
    }

    /* renamed from: e */
    public final Boolean mo48327e() {
        return this.f34473a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u68)) {
            return false;
        }
        u68 u68 = (u68) obj;
        if (m52651n(this.f34473a) == m52651n(u68.f34473a) && m52651n(this.f34474b) == m52651n(u68.f34474b)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo48329f() {
        Boolean bool = this.f34473a;
        if (bool == null || bool.booleanValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final Boolean mo48330g() {
        return this.f34474b;
    }

    /* renamed from: h */
    public final boolean mo48331h() {
        Boolean bool = this.f34474b;
        if (bool == null || bool.booleanValue()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((m52651n(this.f34473a) + 527) * 31) + m52651n(this.f34474b);
    }

    /* renamed from: i */
    public final boolean mo48333i(u68 u68) {
        Boolean bool = this.f34473a;
        Boolean bool2 = Boolean.FALSE;
        if (bool == bool2 && u68.f34473a != bool2) {
            return true;
        }
        if (this.f34474b != bool2) {
            return false;
        }
        if (u68.f34474b != bool2) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final u68 mo48334k(u68 u68) {
        return new u68(m52649j(this.f34473a, u68.f34473a), m52649j(this.f34474b, u68.f34474b));
    }

    /* renamed from: l */
    public final u68 mo48335l(u68 u68) {
        Boolean bool = this.f34473a;
        if (bool == null) {
            bool = u68.f34473a;
        }
        Boolean bool2 = this.f34474b;
        if (bool2 == null) {
            bool2 = u68.f34474b;
        }
        return new u68(bool, bool2);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ConsentSettings: ");
        sb.append("adStorage=");
        Boolean bool = this.f34473a;
        String str2 = "denied";
        if (bool == null) {
            sb.append("uninitialized");
        } else {
            if (true != bool.booleanValue()) {
                str = str2;
            } else {
                str = "granted";
            }
            sb.append(str);
        }
        sb.append(", analyticsStorage=");
        Boolean bool2 = this.f34474b;
        if (bool2 == null) {
            sb.append("uninitialized");
        } else {
            if (true == bool2.booleanValue()) {
                str2 = "granted";
            }
            sb.append(str2);
        }
        return sb.toString();
    }
}
