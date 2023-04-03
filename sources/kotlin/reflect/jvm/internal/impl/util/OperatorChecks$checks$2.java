package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.C7389b;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;

/* compiled from: modifierChecks.kt */
public final class OperatorChecks$checks$2 extends Lambda implements rc2<C7425c, String> {
    public static final OperatorChecks$checks$2 INSTANCE = new OperatorChecks$checks$2();

    public OperatorChecks$checks$2() {
        super(1);
    }

    /* renamed from: a */
    public static final boolean m62984a(d31 d31) {
        if (!(d31 instanceof if0) || !C7389b.m60121a0((if0) d31)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String invoke(kotlin.reflect.jvm.internal.impl.descriptors.C7425c r5) {
        /*
            r4 = this;
            java.lang.String r0 = "$this$$receiver"
            p000.vx2.m53591g(r5, r0)
            kotlin.reflect.jvm.internal.impl.util.OperatorChecks r0 = kotlin.reflect.jvm.internal.impl.util.OperatorChecks.f40312a
            d31 r0 = r5.mo51119b()
            java.lang.String r1 = "containingDeclaration"
            p000.vx2.m53590f(r0, r1)
            boolean r0 = m62984a(r0)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x004d
            java.util.Collection r5 = r5.mo51659d()
            java.lang.String r0 = "overriddenDescriptors"
            p000.vx2.m53590f(r5, r0)
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0029
        L_0x0027:
            r5 = r2
            goto L_0x0049
        L_0x0029:
            java.util.Iterator r5 = r5.iterator()
        L_0x002d:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r0 = r5.next()
            kotlin.reflect.jvm.internal.impl.descriptors.c r0 = (kotlin.reflect.jvm.internal.impl.descriptors.C7425c) r0
            d31 r0 = r0.mo51119b()
            java.lang.String r3 = "it.containingDeclaration"
            p000.vx2.m53590f(r0, r3)
            boolean r0 = m62984a(r0)
            if (r0 == 0) goto L_0x002d
            r5 = r1
        L_0x0049:
            if (r5 == 0) goto L_0x004c
            goto L_0x004d
        L_0x004c:
            r1 = r2
        L_0x004d:
            if (r1 != 0) goto L_0x0052
            java.lang.String r5 = "must override ''equals()'' in Any"
            goto L_0x0053
        L_0x0052:
            r5 = 0
        L_0x0053:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.util.OperatorChecks$checks$2.invoke(kotlin.reflect.jvm.internal.impl.descriptors.c):java.lang.String");
    }
}
