package p000;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* renamed from: cd1 */
/* compiled from: descriptorUtil.kt */
public final class cd1 {
    /* renamed from: a */
    public static final eg0 m56378a(d31 d31) {
        vx2.m53591g(d31, "<this>");
        d31 b = d31.mo51119b();
        if (b == null || (d31 instanceof fk4)) {
            return null;
        }
        if (!m56379b(b)) {
            return m56378a(b);
        }
        if (b instanceof eg0) {
            return (eg0) b;
        }
        return null;
    }

    /* renamed from: b */
    public static final boolean m56379b(d31 d31) {
        vx2.m53591g(d31, "<this>");
        return d31.mo51119b() instanceof fk4;
    }

    /* renamed from: c */
    public static final if0 m56380c(mx3 mx3, u82 u82, ul3 ul3) {
        if0 if0;
        d31 d31;
        MemberScope O;
        vx2.m53591g(mx3, "<this>");
        vx2.m53591g(u82, "fqName");
        vx2.m53591g(ul3, "lookupLocation");
        if (u82.mo66197d()) {
            return null;
        }
        u82 e = u82.mo66198e();
        vx2.m53590f(e, "fqName.parent()");
        MemberScope m = mx3.mo51532N(e).mo53288m();
        r24 g = u82.mo66201g();
        vx2.m53590f(g, "fqName.shortName()");
        eg0 e2 = m.mo50864e(g, ul3);
        if (e2 instanceof if0) {
            if0 = (if0) e2;
        } else {
            if0 = null;
        }
        if (if0 != null) {
            return if0;
        }
        u82 e3 = u82.mo66198e();
        vx2.m53590f(e3, "fqName.parent()");
        if0 c = m56380c(mx3, e3, ul3);
        if (c == null || (O = c.mo52461O()) == null) {
            d31 = null;
        } else {
            r24 g2 = u82.mo66201g();
            vx2.m53590f(g2, "fqName.shortName()");
            d31 = O.mo50864e(g2, ul3);
        }
        if (d31 instanceof if0) {
            return (if0) d31;
        }
        return null;
    }
}
