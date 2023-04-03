package p000;

/* renamed from: y73 */
/* compiled from: JvmClassName */
public class y73 {

    /* renamed from: a */
    public final String f46132a;

    /* renamed from: b */
    public u82 f46133b;

    public y73(String str) {
        if (str == null) {
            m74290a(5);
        }
        this.f46132a = str;
    }

    /* renamed from: a */
    public static /* synthetic */ void m74290a(int i) {
        String str = (i == 3 || i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 3 || i == 6 || i == 7 || i == 8) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "classId";
                break;
            case 2:
            case 4:
                objArr[0] = "fqName";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i == 3) {
            objArr[1] = "byFqNameWithoutInnerClasses";
        } else if (i == 6) {
            objArr[1] = "getFqNameForClassNameWithoutDollars";
        } else if (i == 7) {
            objArr[1] = "getPackageFqName";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
        } else {
            objArr[1] = "getInternalName";
        }
        switch (i) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
            case 4:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                break;
            case 5:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 3 || i == 6 || i == 7 || i == 8) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b */
    public static y73 m74291b(nf0 nf0) {
        if (nf0 == null) {
            m74290a(1);
        }
        u82 h = nf0.mo62678h();
        String replace = nf0.mo62680i().mo66195b().replace('.', DecodedChar.FNC1);
        if (h.mo66197d()) {
            return new y73(replace);
        }
        return new y73(h.mo66195b().replace('.', '/') + "/" + replace);
    }

    /* renamed from: c */
    public static y73 m74292c(u82 u82) {
        if (u82 == null) {
            m74290a(2);
        }
        y73 y73 = new y73(u82.mo66195b().replace('.', '/'));
        y73.f46133b = u82;
        return y73;
    }

    /* renamed from: d */
    public static y73 m74293d(String str) {
        if (str == null) {
            m74290a(0);
        }
        return new y73(str);
    }

    /* renamed from: e */
    public u82 mo67041e() {
        return new u82(this.f46132a.replace('/', '.'));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f46132a.equals(((y73) obj).f46132a);
    }

    /* renamed from: f */
    public String mo67043f() {
        String str = this.f46132a;
        if (str == null) {
            m74290a(8);
        }
        return str;
    }

    /* renamed from: g */
    public u82 mo67044g() {
        int lastIndexOf = this.f46132a.lastIndexOf("/");
        if (lastIndexOf != -1) {
            return new u82(this.f46132a.substring(0, lastIndexOf).replace('/', '.'));
        }
        u82 u82 = u82.f44926c;
        if (u82 == null) {
            m74290a(7);
        }
        return u82;
    }

    public int hashCode() {
        return this.f46132a.hashCode();
    }

    public String toString() {
        return this.f46132a;
    }
}
