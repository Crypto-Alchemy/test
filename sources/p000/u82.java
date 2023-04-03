package p000;

import java.util.List;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: u82 */
/* compiled from: FqName */
public final class u82 {

    /* renamed from: c */
    public static final u82 f44926c = new u82("");

    /* renamed from: a */
    public final v82 f44927a;

    /* renamed from: b */
    public transient u82 f44928b;

    public u82(String str) {
        if (str == null) {
            m72647a(1);
        }
        this.f44927a = new v82(str, this);
    }

    /* renamed from: a */
    public static /* synthetic */ void m72647a(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "fqName";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 8:
                objArr[0] = PublicResolver.FUNC_NAME;
                break;
            case 12:
                objArr[0] = "segment";
                break;
            case 13:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
                objArr[1] = "toUnsafe";
                break;
            case 6:
            case 7:
                objArr[1] = "parent";
                break;
            case 9:
                objArr[1] = "shortName";
                break;
            case 10:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[2] = "<init>";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                break;
            case 8:
                objArr[2] = "child";
                break;
            case 12:
                objArr[2] = "startsWith";
                break;
            case 13:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: k */
    public static u82 m72648k(r24 r24) {
        if (r24 == null) {
            m72647a(13);
        }
        return new u82(v82.m73137m(r24));
    }

    /* renamed from: b */
    public String mo66195b() {
        String b = this.f44927a.mo66442b();
        if (b == null) {
            m72647a(4);
        }
        return b;
    }

    /* renamed from: c */
    public u82 mo66196c(r24 r24) {
        if (r24 == null) {
            m72647a(8);
        }
        return new u82(this.f44927a.mo66443c(r24), this);
    }

    /* renamed from: d */
    public boolean mo66197d() {
        return this.f44927a.mo66445e();
    }

    /* renamed from: e */
    public u82 mo66198e() {
        u82 u82 = this.f44928b;
        if (u82 != null) {
            if (u82 == null) {
                m72647a(6);
            }
            return u82;
        } else if (!mo66197d()) {
            u82 u822 = new u82(this.f44927a.mo66448g());
            this.f44928b = u822;
            return u822;
        } else {
            throw new IllegalStateException("root");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof u82) && this.f44927a.equals(((u82) obj).f44927a)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public List<r24> mo66200f() {
        List<r24> h = this.f44927a.mo66449h();
        if (h == null) {
            m72647a(11);
        }
        return h;
    }

    /* renamed from: g */
    public r24 mo66201g() {
        r24 i = this.f44927a.mo66451i();
        if (i == null) {
            m72647a(9);
        }
        return i;
    }

    /* renamed from: h */
    public r24 mo66202h() {
        r24 j = this.f44927a.mo66452j();
        if (j == null) {
            m72647a(10);
        }
        return j;
    }

    public int hashCode() {
        return this.f44927a.hashCode();
    }

    /* renamed from: i */
    public boolean mo66204i(r24 r24) {
        if (r24 == null) {
            m72647a(12);
        }
        return this.f44927a.mo66453k(r24);
    }

    /* renamed from: j */
    public v82 mo66205j() {
        v82 v82 = this.f44927a;
        if (v82 == null) {
            m72647a(5);
        }
        return v82;
    }

    public String toString() {
        return this.f44927a.toString();
    }

    public u82(v82 v82) {
        if (v82 == null) {
            m72647a(2);
        }
        this.f44927a = v82;
    }

    public u82(v82 v82, u82 u82) {
        if (v82 == null) {
            m72647a(3);
        }
        this.f44927a = v82;
        this.f44928b = u82;
    }
}
