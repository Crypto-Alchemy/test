package p000;

import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: r24 */
/* compiled from: Name */
public final class r24 implements Comparable<r24> {

    /* renamed from: a */
    public final String f44281a;

    /* renamed from: d */
    public final boolean f44282d;

    public r24(String str, boolean z) {
        if (str == null) {
            m71443a(0);
        }
        this.f44281a = str;
        this.f44282d = z;
    }

    /* renamed from: a */
    public static /* synthetic */ void m71443a(int i) {
        String str = (i == 1 || i == 2 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 1 || i == 2 || i == 3 || i == 4) ? 2 : 3)];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = PublicResolver.FUNC_NAME;
        }
        if (i == 1) {
            objArr[1] = "asString";
        } else if (i == 2) {
            objArr[1] = "getIdentifier";
        } else if (i == 3 || i == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "special";
                break;
            case 8:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 1 || i == 2 || i == 3 || i == 4) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: g */
    public static r24 m71444g(String str) {
        if (str == null) {
            m71443a(8);
        }
        if (str.startsWith("<")) {
            return m71447m(str);
        }
        return m71445h(str);
    }

    /* renamed from: h */
    public static r24 m71445h(String str) {
        if (str == null) {
            m71443a(5);
        }
        return new r24(str, false);
    }

    /* renamed from: l */
    public static boolean m71446l(String str) {
        if (str == null) {
            m71443a(6);
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '.' || charAt == '/' || charAt == '\\') {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    public static r24 m71447m(String str) {
        if (str == null) {
            m71443a(7);
        }
        if (str.startsWith("<")) {
            return new r24(str, true);
        }
        throw new IllegalArgumentException("special name must start with '<': " + str);
    }

    /* renamed from: d */
    public String mo65594d() {
        String str = this.f44281a;
        if (str == null) {
            m71443a(1);
        }
        return str;
    }

    /* renamed from: e */
    public int compareTo(r24 r24) {
        return this.f44281a.compareTo(r24.f44281a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r24)) {
            return false;
        }
        r24 r24 = (r24) obj;
        if (this.f44282d == r24.f44282d && this.f44281a.equals(r24.f44281a)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public String mo65597f() {
        if (!this.f44282d) {
            String d = mo65594d();
            if (d == null) {
                m71443a(2);
            }
            return d;
        }
        throw new IllegalStateException("not identifier: " + this);
    }

    public int hashCode() {
        return (this.f44281a.hashCode() * 31) + (this.f44282d ? 1 : 0);
    }

    /* renamed from: i */
    public boolean mo65599i() {
        return this.f44282d;
    }

    public String toString() {
        return this.f44281a;
    }
}
