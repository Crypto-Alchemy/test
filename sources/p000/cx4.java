package p000;

import java.util.List;
import kotlin.text.StringsKt__StringsKt;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: cx4 */
/* compiled from: propertiesConventionUtil.kt */
public final class cx4 {
    /* renamed from: a */
    public static final List<r24> m56585a(r24 r24) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        String d = r24.mo65594d();
        vx2.m53590f(d, "name.asString()");
        if (r73.m71466c(d)) {
            return ck0.m33066n(m56586b(r24));
        }
        if (r73.m71467d(d)) {
            return m56590f(r24);
        }
        return o50.f43586a.mo62834b(r24);
    }

    /* renamed from: b */
    public static final r24 m56586b(r24 r24) {
        vx2.m53591g(r24, "methodName");
        r24 e = m56589e(r24, "get", false, (String) null, 12, (Object) null);
        if (e == null) {
            return m56589e(r24, "is", false, (String) null, 8, (Object) null);
        }
        return e;
    }

    /* renamed from: c */
    public static final r24 m56587c(r24 r24, boolean z) {
        String str;
        vx2.m53591g(r24, "methodName");
        if (z) {
            str = "is";
        } else {
            str = null;
        }
        return m56589e(r24, "set", false, str, 4, (Object) null);
    }

    /* renamed from: d */
    public static final r24 m56588d(r24 r24, String str, boolean z, String str2) {
        if (r24.mo65599i()) {
            return null;
        }
        String f = r24.mo65597f();
        vx2.m53590f(f, "methodName.identifier");
        boolean z2 = false;
        if (!yb6.m74336M(f, str, false, 2, (Object) null) || f.length() == str.length()) {
            return null;
        }
        char charAt = f.charAt(str.length());
        if ('a' <= charAt && charAt < '{') {
            z2 = true;
        }
        if (z2) {
            return null;
        }
        if (str2 != null) {
            return r24.m71445h(str2 + StringsKt__StringsKt.m63114s0(f, str));
        } else if (!z) {
            return r24;
        } else {
            String c = hb0.m58515c(StringsKt__StringsKt.m63114s0(f, str), true);
            if (!r24.m71446l(c)) {
                return null;
            }
            return r24.m71445h(c);
        }
    }

    /* renamed from: e */
    public static /* synthetic */ r24 m56589e(r24 r24, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        return m56588d(r24, str, z, str2);
    }

    /* renamed from: f */
    public static final List<r24> m56590f(r24 r24) {
        vx2.m53591g(r24, "methodName");
        return ck0.m33067o(m56587c(r24, false), m56587c(r24, true));
    }
}
