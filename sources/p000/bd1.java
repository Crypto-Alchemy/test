package p000;

import java.util.HashMap;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* renamed from: bd1 */
/* compiled from: DescriptorSubstitutor */
public class bd1 {
    /* renamed from: a */
    public static /* synthetic */ void m55844a(int i) {
        String str = i != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 4 ? 3 : 2)];
        switch (i) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String format = String.format(str, objArr);
        throw (i != 4 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    /* renamed from: b */
    public static TypeSubstitutor m55845b(List<a17> list, p17 p17, d31 d31, List<a17> list2) {
        if (list == null) {
            m55844a(0);
        }
        if (p17 == null) {
            m55844a(1);
        }
        if (d31 == null) {
            m55844a(2);
        }
        if (list2 == null) {
            m55844a(3);
        }
        TypeSubstitutor c = m55846c(list, p17, d31, list2, (boolean[]) null);
        if (c != null) {
            return c;
        }
        throw new AssertionError("Substitution failed");
    }

    /* renamed from: c */
    public static TypeSubstitutor m55846c(List<a17> list, p17 p17, d31 d31, List<a17> list2, boolean[] zArr) {
        TypeSubstitutor typeSubstitutor;
        p17 p172 = p17;
        List<a17> list3 = list2;
        if (list == null) {
            m55844a(5);
        }
        if (p172 == null) {
            m55844a(6);
        }
        if (d31 == null) {
            m55844a(7);
        }
        if (list3 == null) {
            m55844a(8);
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        int i = 0;
        for (a17 next : list) {
            b17 K0 = b17.m55707K0(d31, next.getAnnotations(), next.mo50050u(), next.mo50049j(), next.getName(), i, a66.f36360a, next.mo50043H());
            hashMap.put(next.mo50046g(), new h17(K0.mo51464n()));
            hashMap2.put(next, K0);
            list3.add(K0);
            i++;
        }
        a07 j = a07.m55337j(hashMap);
        TypeSubstitutor h = TypeSubstitutor.m62903h(p172, j);
        TypeSubstitutor h2 = TypeSubstitutor.m62903h(p17.mo65209h(), j);
        for (a17 next2 : list) {
            b17 b17 = (b17) hashMap2.get(next2);
            for (xc3 next3 : next2.getUpperBounds()) {
                eg0 d = next3.mo51134H0().mo51180d();
                if (!(d instanceof a17) || !TypeUtilsKt.m62954j((a17) d)) {
                    typeSubstitutor = h2;
                } else {
                    typeSubstitutor = h;
                }
                xc3 p = typeSubstitutor.mo55339p(next3, Variance.OUT_VARIANCE);
                if (p == null) {
                    return null;
                }
                if (!(p == next3 || zArr == null)) {
                    zArr[0] = true;
                }
                b17.mo50452G0(p);
            }
            b17.mo50458P0();
        }
        return h;
    }
}
