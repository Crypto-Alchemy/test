package p000;

import org.web3j.abi.datatypes.Utf8String;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: nf0 */
/* compiled from: ClassId */
public final class nf0 {

    /* renamed from: a */
    public final u82 f43466a;

    /* renamed from: b */
    public final u82 f43467b;

    /* renamed from: c */
    public final boolean f43468c;

    public nf0(u82 u82, u82 u822, boolean z) {
        if (u82 == null) {
            m69748a(1);
        }
        if (u822 == null) {
            m69748a(2);
        }
        this.f43466a = u82;
        this.f43467b = u822;
        this.f43468c = z;
    }

    /* renamed from: a */
    public static /* synthetic */ void m69748a(int i) {
        String str;
        int i2;
        Throwable th;
        if (!(i == 5 || i == 6 || i == 7 || i == 9)) {
            switch (i) {
                case 13:
                case 14:
                case 15:
                case 16:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i == 5 || i == 6 || i == 7 || i == 9)) {
            switch (i) {
                case 13:
                case 14:
                case 15:
                case 16:
                    break;
                default:
                    i2 = 3;
                    break;
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 3:
                objArr[0] = "packageFqName";
                break;
            case 2:
                objArr[0] = "relativeClassName";
                break;
            case 4:
                objArr[0] = "topLevelName";
                break;
            case 5:
            case 6:
            case 7:
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                break;
            case 8:
                objArr[0] = PublicResolver.FUNC_NAME;
                break;
            case 10:
                objArr[0] = "segment";
                break;
            case 11:
            case 12:
                objArr[0] = Utf8String.TYPE_NAME;
                break;
            default:
                objArr[0] = "topLevelFqName";
                break;
        }
        if (i == 5) {
            objArr[1] = "getPackageFqName";
        } else if (i == 6) {
            objArr[1] = "getRelativeClassName";
        } else if (i == 7) {
            objArr[1] = "getShortClassName";
        } else if (i != 9) {
            switch (i) {
                case 13:
                case 14:
                    objArr[1] = "asString";
                    break;
                case 15:
                case 16:
                    objArr[1] = "asFqNameString";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                    break;
            }
        } else {
            objArr[1] = "asSingleFqName";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                objArr[2] = "<init>";
                break;
            case 5:
            case 6:
            case 7:
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
                break;
            case 8:
                objArr[2] = "createNestedClassId";
                break;
            case 10:
                objArr[2] = "startsWith";
                break;
            case 11:
            case 12:
                objArr[2] = "fromString";
                break;
            default:
                objArr[2] = "topLevel";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i == 5 || i == 6 || i == 7 || i == 9)) {
            switch (i) {
                case 13:
                case 14:
                case 15:
                case 16:
                    break;
                default:
                    th = new IllegalArgumentException(format);
                    break;
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    /* renamed from: e */
    public static nf0 m69749e(String str) {
        if (str == null) {
            m69748a(11);
        }
        return m69750f(str, false);
    }

    /* renamed from: f */
    public static nf0 m69750f(String str, boolean z) {
        String str2;
        if (str == null) {
            m69748a(12);
        }
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf == -1) {
            str2 = "";
        } else {
            String replace = str.substring(0, lastIndexOf).replace('/', '.');
            str = str.substring(lastIndexOf + 1);
            str2 = replace;
        }
        return new nf0(new u82(str2), new u82(str), z);
    }

    /* renamed from: m */
    public static nf0 m69751m(u82 u82) {
        if (u82 == null) {
            m69748a(0);
        }
        return new nf0(u82.mo66198e(), u82.mo66201g());
    }

    /* renamed from: b */
    public u82 mo62673b() {
        if (this.f43466a.mo66197d()) {
            u82 u82 = this.f43467b;
            if (u82 == null) {
                m69748a(9);
            }
            return u82;
        }
        return new u82(this.f43466a.mo66195b() + "." + this.f43467b.mo66195b());
    }

    /* renamed from: c */
    public String mo62674c() {
        if (this.f43466a.mo66197d()) {
            String b = this.f43467b.mo66195b();
            if (b == null) {
                m69748a(13);
            }
            return b;
        }
        String str = this.f43466a.mo66195b().replace('.', '/') + "/" + this.f43467b.mo66195b();
        if (str == null) {
            m69748a(14);
        }
        return str;
    }

    /* renamed from: d */
    public nf0 mo62675d(r24 r24) {
        if (r24 == null) {
            m69748a(8);
        }
        return new nf0(mo62678h(), this.f43467b.mo66196c(r24), this.f43468c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nf0.class != obj.getClass()) {
            return false;
        }
        nf0 nf0 = (nf0) obj;
        if (!this.f43466a.equals(nf0.f43466a) || !this.f43467b.equals(nf0.f43467b) || this.f43468c != nf0.f43468c) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public nf0 mo62677g() {
        u82 e = this.f43467b.mo66198e();
        if (e.mo66197d()) {
            return null;
        }
        return new nf0(mo62678h(), e, this.f43468c);
    }

    /* renamed from: h */
    public u82 mo62678h() {
        u82 u82 = this.f43466a;
        if (u82 == null) {
            m69748a(5);
        }
        return u82;
    }

    public int hashCode() {
        return (((this.f43466a.hashCode() * 31) + this.f43467b.hashCode()) * 31) + Boolean.valueOf(this.f43468c).hashCode();
    }

    /* renamed from: i */
    public u82 mo62680i() {
        u82 u82 = this.f43467b;
        if (u82 == null) {
            m69748a(6);
        }
        return u82;
    }

    /* renamed from: j */
    public r24 mo62681j() {
        r24 g = this.f43467b.mo66201g();
        if (g == null) {
            m69748a(7);
        }
        return g;
    }

    /* renamed from: k */
    public boolean mo62682k() {
        return this.f43468c;
    }

    /* renamed from: l */
    public boolean mo62683l() {
        return !this.f43467b.mo66198e().mo66197d();
    }

    public String toString() {
        if (!this.f43466a.mo66197d()) {
            return mo62674c();
        }
        return "/" + mo62674c();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public nf0(u82 u82, r24 r24) {
        this(u82, u82.m72648k(r24), false);
        if (u82 == null) {
            m69748a(3);
        }
        if (r24 == null) {
            m69748a(4);
        }
    }
}
