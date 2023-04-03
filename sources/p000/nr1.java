package p000;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;

/* renamed from: nr1 */
/* compiled from: ErrorUtils.kt */
public final class nr1 {

    /* renamed from: a */
    public static final nr1 f43548a = new nr1();

    /* renamed from: b */
    public static final mx3 f43549b = er1.f37594a;

    /* renamed from: c */
    public static final br1 f43550c;

    /* renamed from: d */
    public static final xc3 f43551d = m70033d(ErrorTypeKind.CYCLIC_SUPERTYPES, new String[0]);

    /* renamed from: e */
    public static final xc3 f43552e = m70033d(ErrorTypeKind.ERROR_PROPERTY_TYPE, new String[0]);

    /* renamed from: f */
    public static final fx4 f43553f;

    /* renamed from: g */
    public static final Set<fx4> f43554g;

    static {
        String format = String.format(ErrorEntity.ERROR_CLASS.getDebugText(), Arrays.copyOf(new Object[]{"unknown class"}, 1));
        vx2.m53590f(format, "format(this, *args)");
        r24 m = r24.m71447m(format);
        vx2.m53590f(m, "special(ErrorEntity.ERRO….format(\"unknown class\"))");
        f43550c = new br1(m);
        fr1 fr1 = new fr1();
        f43553f = fr1;
        f43554g = my5.m48548d(fr1);
    }

    /* renamed from: a */
    public static final jr1 m70031a(ErrorScopeKind errorScopeKind, boolean z, String... strArr) {
        vx2.m53591g(errorScopeKind, "kind");
        vx2.m53591g(strArr, "formatParams");
        if (z) {
            return new sp6(errorScopeKind, (String[]) Arrays.copyOf(strArr, strArr.length));
        }
        return new jr1(errorScopeKind, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: b */
    public static final jr1 m70032b(ErrorScopeKind errorScopeKind, String... strArr) {
        vx2.m53591g(errorScopeKind, "kind");
        vx2.m53591g(strArr, "formatParams");
        return m70031a(errorScopeKind, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: d */
    public static final lr1 m70033d(ErrorTypeKind errorTypeKind, String... strArr) {
        vx2.m53591g(errorTypeKind, "kind");
        vx2.m53591g(strArr, "formatParams");
        return f43548a.mo62787g(errorTypeKind, ck0.m33062j(), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: m */
    public static final boolean m70034m(d31 d31) {
        if (d31 != null) {
            nr1 nr1 = f43548a;
            if (nr1.mo62793n(d31) || nr1.mo62793n(d31.mo51119b()) || d31 == f43549b) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    public static final boolean m70035o(xc3 xc3) {
        if (xc3 == null) {
            return false;
        }
        yz6 H0 = xc3.mo51134H0();
        if (!(H0 instanceof mr1) || ((mr1) H0).mo56318f() != ErrorTypeKind.UNINFERRED_TYPE_VARIABLE) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final lr1 mo62784c(ErrorTypeKind errorTypeKind, yz6 yz6, String... strArr) {
        vx2.m53591g(errorTypeKind, "kind");
        vx2.m53591g(yz6, "typeConstructor");
        vx2.m53591g(strArr, "formatParams");
        return mo62786f(errorTypeKind, ck0.m33062j(), yz6, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: e */
    public final mr1 mo62785e(ErrorTypeKind errorTypeKind, String... strArr) {
        vx2.m53591g(errorTypeKind, "kind");
        vx2.m53591g(strArr, "formatParams");
        return new mr1(errorTypeKind, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: f */
    public final lr1 mo62786f(ErrorTypeKind errorTypeKind, List<? extends f17> list, yz6 yz6, String... strArr) {
        vx2.m53591g(errorTypeKind, "kind");
        vx2.m53591g(list, "arguments");
        vx2.m53591g(yz6, "typeConstructor");
        vx2.m53591g(strArr, "formatParams");
        return new lr1(yz6, m70032b(ErrorScopeKind.ERROR_TYPE_SCOPE, yz6.toString()), errorTypeKind, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: g */
    public final lr1 mo62787g(ErrorTypeKind errorTypeKind, List<? extends f17> list, String... strArr) {
        vx2.m53591g(errorTypeKind, "kind");
        vx2.m53591g(list, "arguments");
        vx2.m53591g(strArr, "formatParams");
        return mo62786f(errorTypeKind, list, mo62785e(errorTypeKind, (String[]) Arrays.copyOf(strArr, strArr.length)), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: h */
    public final br1 mo62788h() {
        return f43550c;
    }

    /* renamed from: i */
    public final mx3 mo62789i() {
        return f43549b;
    }

    /* renamed from: j */
    public final Set<fx4> mo62790j() {
        return f43554g;
    }

    /* renamed from: k */
    public final xc3 mo62791k() {
        return f43552e;
    }

    /* renamed from: l */
    public final xc3 mo62792l() {
        return f43551d;
    }

    /* renamed from: n */
    public final boolean mo62793n(d31 d31) {
        return d31 instanceof br1;
    }
}
