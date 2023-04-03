package p000;

import java.util.Locale;

/* renamed from: i70 */
/* compiled from: BytesRange */
public class i70 {

    /* renamed from: a */
    public final int f13171a;

    /* renamed from: b */
    public final int f13172b;

    public i70(int i, int i2) {
        this.f13171a = i;
        this.f13172b = i2;
    }

    /* renamed from: b */
    public static i70 m19433b(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        au4.m10787b(Boolean.valueOf(z));
        return new i70(i, Integer.MAX_VALUE);
    }

    /* renamed from: c */
    public static i70 m19434c(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        au4.m10787b(Boolean.valueOf(z));
        return new i70(0, i);
    }

    /* renamed from: d */
    public static String m19435d(int i) {
        if (i == Integer.MAX_VALUE) {
            return "";
        }
        return Integer.toString(i);
    }

    /* renamed from: a */
    public boolean mo21469a(i70 i70) {
        if (i70 != null && this.f13171a <= i70.f13171a && this.f13172b >= i70.f13172b) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i70)) {
            return false;
        }
        i70 i70 = (i70) obj;
        if (this.f13171a == i70.f13171a && this.f13172b == i70.f13172b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ll2.m21522a(this.f13171a, this.f13172b);
    }

    public String toString() {
        return String.format((Locale) null, "%s-%s", new Object[]{m19435d(this.f13171a), m19435d(this.f13172b)});
    }
}
