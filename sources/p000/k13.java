package p000;

import kotlin.collections.CollectionsKt___CollectionsKt;

/* renamed from: k13 */
/* compiled from: javaLoading.kt */
public final class k13 {
    /* renamed from: a */
    public static final boolean m59651a(m13 m13) {
        vh3 vh3;
        u82 e;
        p23 p23 = (p23) CollectionsKt___CollectionsKt.m47302B0(m13.mo51626f());
        x03 x03 = null;
        if (p23 != null) {
            vh3 = p23.getType();
        } else {
            vh3 = null;
        }
        if (vh3 instanceof x03) {
            x03 = (x03) vh3;
        }
        if (x03 == null) {
            return false;
        }
        w03 d = x03.mo66803d();
        if (!(d instanceof p03) || (e = ((p03) d).mo53383e()) == null || !vx2.m53586b(e.mo66195b(), "java.lang.Object")) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0039, code lost:
        if (r0.equals("toString") != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (r0.equals("hashCode") == false) goto L_0x0044;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m59652b(p000.m13 r3) {
        /*
            r24 r0 = r3.getName()
            java.lang.String r0 = r0.mo65594d()
            int r1 = r0.hashCode()
            r2 = -1776922004(0xffffffff9616526c, float:-1.2142911E-25)
            if (r1 == r2) goto L_0x0033
            r2 = -1295482945(0xffffffffb2c87fbf, float:-2.3341157E-8)
            if (r1 == r2) goto L_0x0025
            r2 = 147696667(0x8cdac1b, float:1.23784505E-33)
            if (r1 == r2) goto L_0x001c
            goto L_0x0044
        L_0x001c:
            java.lang.String r1 = "hashCode"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x003b
            goto L_0x0044
        L_0x0025:
            java.lang.String r1 = "equals"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x002e
            goto L_0x0044
        L_0x002e:
            boolean r3 = m59651a(r3)
            goto L_0x0045
        L_0x0033:
            java.lang.String r1 = "toString"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0044
        L_0x003b:
            java.util.List r3 = r3.mo51626f()
            boolean r3 = r3.isEmpty()
            goto L_0x0045
        L_0x0044:
            r3 = 0
        L_0x0045:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.k13.m59652b(m13):boolean");
    }

    /* renamed from: c */
    public static final boolean m59653c(l13 l13) {
        vx2.m53591g(l13, "<this>");
        if (!l13.mo51413N().mo53371I() || !(l13 instanceof m13) || !m59652b((m13) l13)) {
            return false;
        }
        return true;
    }
}
