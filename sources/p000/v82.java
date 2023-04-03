package p000;

import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.collections.ArraysKt___ArraysKt;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: v82 */
/* compiled from: FqNameUnsafe */
public final class v82 {

    /* renamed from: e */
    public static final r24 f45239e = r24.m71447m("<root>");

    /* renamed from: f */
    public static final Pattern f45240f = Pattern.compile("\\.");

    /* renamed from: g */
    public static final rc2<String, r24> f45241g = new C9447a();

    /* renamed from: a */
    public final String f45242a;

    /* renamed from: b */
    public transient u82 f45243b;

    /* renamed from: c */
    public transient v82 f45244c;

    /* renamed from: d */
    public transient r24 f45245d;

    /* renamed from: v82$a */
    /* compiled from: FqNameUnsafe */
    public static class C9447a implements rc2<String, r24> {
        /* renamed from: a */
        public r24 invoke(String str) {
            return r24.m71444g(str);
        }
    }

    public v82(String str, u82 u82) {
        if (str == null) {
            m73136a(0);
        }
        if (u82 == null) {
            m73136a(1);
        }
        this.f45242a = str;
        this.f45243b = u82;
    }

    /* renamed from: a */
    public static /* synthetic */ void m73136a(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
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
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        if (i != 1) {
            switch (i) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 17:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = PublicResolver.FUNC_NAME;
                    break;
                case 15:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case 17:
                objArr[1] = "toString";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
                objArr[2] = "startsWith";
                break;
            case 16:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: m */
    public static v82 m73137m(r24 r24) {
        if (r24 == null) {
            m73136a(16);
        }
        return new v82(r24.mo65594d(), u82.f44926c.mo66205j(), r24);
    }

    /* renamed from: b */
    public String mo66442b() {
        String str = this.f45242a;
        if (str == null) {
            m73136a(4);
        }
        return str;
    }

    /* renamed from: c */
    public v82 mo66443c(r24 r24) {
        String str;
        if (r24 == null) {
            m73136a(9);
        }
        if (mo66445e()) {
            str = r24.mo65594d();
        } else {
            str = this.f45242a + "." + r24.mo65594d();
        }
        return new v82(str, this, r24);
    }

    /* renamed from: d */
    public final void mo66444d() {
        int lastIndexOf = this.f45242a.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            this.f45245d = r24.m71444g(this.f45242a.substring(lastIndexOf + 1));
            this.f45244c = new v82(this.f45242a.substring(0, lastIndexOf));
            return;
        }
        this.f45245d = r24.m71444g(this.f45242a);
        this.f45244c = u82.f44926c.mo66205j();
    }

    /* renamed from: e */
    public boolean mo66445e() {
        return this.f45242a.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof v82) && this.f45242a.equals(((v82) obj).f45242a)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo66447f() {
        if (this.f45243b != null || mo66442b().indexOf(60) < 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public v82 mo66448g() {
        v82 v82 = this.f45244c;
        if (v82 != null) {
            if (v82 == null) {
                m73136a(7);
            }
            return v82;
        } else if (!mo66445e()) {
            mo66444d();
            v82 v822 = this.f45244c;
            if (v822 == null) {
                m73136a(8);
            }
            return v822;
        } else {
            throw new IllegalStateException("root");
        }
    }

    /* renamed from: h */
    public List<r24> mo66449h() {
        List<r24> list;
        if (mo66445e()) {
            list = Collections.emptyList();
        } else {
            list = ArraysKt___ArraysKt.m47272X(f45240f.split(this.f45242a), f45241g);
        }
        if (list == null) {
            m73136a(14);
        }
        return list;
    }

    public int hashCode() {
        return this.f45242a.hashCode();
    }

    /* renamed from: i */
    public r24 mo66451i() {
        r24 r24 = this.f45245d;
        if (r24 != null) {
            if (r24 == null) {
                m73136a(10);
            }
            return r24;
        } else if (!mo66445e()) {
            mo66444d();
            r24 r242 = this.f45245d;
            if (r242 == null) {
                m73136a(11);
            }
            return r242;
        } else {
            throw new IllegalStateException("root");
        }
    }

    /* renamed from: j */
    public r24 mo66452j() {
        if (mo66445e()) {
            r24 r24 = f45239e;
            if (r24 == null) {
                m73136a(12);
            }
            return r24;
        }
        r24 i = mo66451i();
        if (i == null) {
            m73136a(13);
        }
        return i;
    }

    /* renamed from: k */
    public boolean mo66453k(r24 r24) {
        if (r24 == null) {
            m73136a(15);
        }
        if (mo66445e()) {
            return false;
        }
        int indexOf = this.f45242a.indexOf(46);
        String str = this.f45242a;
        String d = r24.mo65594d();
        if (indexOf == -1) {
            indexOf = this.f45242a.length();
        }
        return str.regionMatches(0, d, 0, indexOf);
    }

    /* renamed from: l */
    public u82 mo66454l() {
        u82 u82 = this.f45243b;
        if (u82 != null) {
            if (u82 == null) {
                m73136a(5);
            }
            return u82;
        }
        u82 u822 = new u82(this);
        this.f45243b = u822;
        return u822;
    }

    public String toString() {
        String str;
        if (mo66445e()) {
            str = f45239e.mo65594d();
        } else {
            str = this.f45242a;
        }
        if (str == null) {
            m73136a(17);
        }
        return str;
    }

    public v82(String str) {
        if (str == null) {
            m73136a(2);
        }
        this.f45242a = str;
    }

    public v82(String str, v82 v82, r24 r24) {
        if (str == null) {
            m73136a(3);
        }
        this.f45242a = str;
        this.f45244c = v82;
        this.f45245d = r24;
    }
}
