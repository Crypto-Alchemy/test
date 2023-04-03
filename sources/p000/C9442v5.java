package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.C7389b;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;

/* renamed from: v5 */
/* compiled from: AbstractClassTypeConstructor */
public abstract class C9442v5 extends AbstractTypeConstructor {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9442v5(da6 da6) {
        super(da6);
        if (da6 == null) {
            m73086v(0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0045  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void m73086v(int r9) {
        /*
            r0 = 4
            r1 = 3
            r2 = 1
            if (r9 == r2) goto L_0x000c
            if (r9 == r1) goto L_0x000c
            if (r9 == r0) goto L_0x000c
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L_0x000e
        L_0x000c:
            java.lang.String r3 = "@NotNull method %s.%s must not return null"
        L_0x000e:
            r4 = 2
            if (r9 == r2) goto L_0x0017
            if (r9 == r1) goto L_0x0017
            if (r9 == r0) goto L_0x0017
            r5 = r1
            goto L_0x0018
        L_0x0017:
            r5 = r4
        L_0x0018:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor"
            r7 = 0
            if (r9 == r2) goto L_0x002f
            if (r9 == r4) goto L_0x002a
            if (r9 == r1) goto L_0x002f
            if (r9 == r0) goto L_0x002f
            java.lang.String r8 = "storageManager"
            r5[r7] = r8
            goto L_0x0031
        L_0x002a:
            java.lang.String r8 = "classifier"
            r5[r7] = r8
            goto L_0x0031
        L_0x002f:
            r5[r7] = r6
        L_0x0031:
            if (r9 == r2) goto L_0x003f
            if (r9 == r1) goto L_0x003a
            if (r9 == r0) goto L_0x003a
            r5[r2] = r6
            goto L_0x0043
        L_0x003a:
            java.lang.String r6 = "getAdditionalNeighboursInSupertypeGraph"
            r5[r2] = r6
            goto L_0x0043
        L_0x003f:
            java.lang.String r6 = "getBuiltIns"
            r5[r2] = r6
        L_0x0043:
            if (r9 == r2) goto L_0x0054
            if (r9 == r4) goto L_0x0050
            if (r9 == r1) goto L_0x0054
            if (r9 == r0) goto L_0x0054
            java.lang.String r6 = "<init>"
            r5[r4] = r6
            goto L_0x0054
        L_0x0050:
            java.lang.String r6 = "isSameClassifier"
            r5[r4] = r6
        L_0x0054:
            java.lang.String r3 = java.lang.String.format(r3, r5)
            if (r9 == r2) goto L_0x0064
            if (r9 == r1) goto L_0x0064
            if (r9 == r0) goto L_0x0064
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r3)
            goto L_0x0069
        L_0x0064:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
        L_0x0069:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9442v5.m73086v(int):void");
    }

    /* renamed from: i */
    public boolean mo51185i(eg0 eg0) {
        if (eg0 == null) {
            m73086v(2);
        }
        if (!(eg0 instanceof if0) || !mo51182f(mo53524w(), eg0)) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public C7389b mo51813k() {
        C7389b f = DescriptorUtilsKt.m62445f(mo53524w());
        if (f == null) {
            m73086v(1);
        }
        return f;
    }

    /* renamed from: n */
    public xc3 mo52633n() {
        if (C7389b.m60144t0(mo53524w())) {
            return null;
        }
        return mo51813k().mo53169i();
    }

    /* renamed from: o */
    public Collection<xc3> mo55277o(boolean z) {
        d31 b = mo53524w().mo51119b();
        if (!(b instanceof if0)) {
            List emptyList = Collections.emptyList();
            if (emptyList == null) {
                m73086v(3);
            }
            return emptyList;
        }
        v46 v46 = new v46();
        if0 if0 = (if0) b;
        v46.add(if0.mo51464n());
        if0 h0 = if0.mo52350h0();
        if (z && h0 != null) {
            v46.add(h0.mo51464n());
        }
        return v46;
    }

    /* renamed from: w */
    public abstract if0 mo53524w();
}
