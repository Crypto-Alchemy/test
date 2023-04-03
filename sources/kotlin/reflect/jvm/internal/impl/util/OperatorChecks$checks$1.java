package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;

/* compiled from: modifierChecks.kt */
public final class OperatorChecks$checks$1 extends Lambda implements rc2<C7425c, String> {
    public static final OperatorChecks$checks$1 INSTANCE = new OperatorChecks$checks$1();

    public OperatorChecks$checks$1() {
        super(1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        if ((!kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.m62440a(r4) && r4.mo53317q0() == null) == true) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String invoke(kotlin.reflect.jvm.internal.impl.descriptors.C7425c r4) {
        /*
            r3 = this;
            java.lang.String r0 = "$this$$receiver"
            p000.vx2.m53591g(r4, r0)
            java.util.List r4 = r4.mo51763f()
            java.lang.String r0 = "valueParameters"
            p000.vx2.m53590f(r4, r0)
            java.lang.Object r4 = kotlin.collections.CollectionsKt___CollectionsKt.m47342m0(r4)
            n87 r4 = (p000.n87) r4
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L_0x002a
            boolean r2 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.m62440a(r4)
            if (r2 != 0) goto L_0x0026
            xc3 r4 = r4.mo53317q0()
            if (r4 != 0) goto L_0x0026
            r4 = r0
            goto L_0x0027
        L_0x0026:
            r4 = r1
        L_0x0027:
            if (r4 != r0) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r0 = r1
        L_0x002b:
            kotlin.reflect.jvm.internal.impl.util.OperatorChecks r4 = kotlin.reflect.jvm.internal.impl.util.OperatorChecks.f40312a
            if (r0 != 0) goto L_0x0032
            java.lang.String r4 = "last parameter should not have a default value or be a vararg"
            goto L_0x0033
        L_0x0032:
            r4 = 0
        L_0x0033:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.util.OperatorChecks$checks$1.invoke(kotlin.reflect.jvm.internal.impl.descriptors.c):java.lang.String");
    }
}
