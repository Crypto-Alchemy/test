package p000;

import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: r73 */
/* compiled from: JvmAbi.kt */
public final class r73 {

    /* renamed from: a */
    public static final r73 f44294a = new r73();

    /* renamed from: b */
    public static final u82 f44295b;

    /* renamed from: c */
    public static final nf0 f44296c;

    /* renamed from: d */
    public static final nf0 f44297d;

    /* renamed from: e */
    public static final nf0 f44298e;

    static {
        u82 u82 = new u82("kotlin.jvm.JvmField");
        f44295b = u82;
        nf0 m = nf0.m69751m(u82);
        vx2.m53590f(m, "topLevel(JVM_FIELD_ANNOTATION_FQ_NAME)");
        f44296c = m;
        nf0 m2 = nf0.m69751m(new u82("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        vx2.m53590f(m2, "topLevel(FqName(\"kotlin.….ReflectionFactoryImpl\"))");
        f44297d = m2;
        nf0 e = nf0.m69749e("kotlin/jvm/internal/RepeatableContainer");
        vx2.m53590f(e, "fromString(\"kotlin/jvm/i…nal/RepeatableContainer\")");
        f44298e = e;
    }

    /* renamed from: b */
    public static final String m71465b(String str) {
        vx2.m53591g(str, "propertyName");
        if (m71469f(str)) {
            return str;
        }
        return "get" + hb0.m58513a(str);
    }

    /* renamed from: c */
    public static final boolean m71466c(String str) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        if (yb6.m74336M(str, "get", false, 2, (Object) null) || yb6.m74336M(str, "is", false, 2, (Object) null)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m71467d(String str) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        return yb6.m74336M(str, "set", false, 2, (Object) null);
    }

    /* renamed from: e */
    public static final String m71468e(String str) {
        String str2;
        vx2.m53591g(str, "propertyName");
        StringBuilder sb = new StringBuilder();
        sb.append("set");
        if (m71469f(str)) {
            str2 = str.substring(2);
            vx2.m53590f(str2, "this as java.lang.String).substring(startIndex)");
        } else {
            str2 = hb0.m58513a(str);
        }
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: f */
    public static final boolean m71469f(String str) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        if (!yb6.m74336M(str, "is", false, 2, (Object) null) || str.length() == 2) {
            return false;
        }
        char charAt = str.charAt(2);
        if (vx2.m53593i(97, charAt) > 0 || vx2.m53593i(charAt, 122) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final nf0 mo65615a() {
        return f44298e;
    }
}
