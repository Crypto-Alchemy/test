package p000;

import java.util.List;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.descriptors.C7420a;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* renamed from: q03 */
/* compiled from: JavaClassConstructorDescriptor */
public class q03 extends ff0 implements o03 {

    /* renamed from: s1 */
    public Boolean f44140s1;

    /* renamed from: t1 */
    public Boolean f44141t1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q03(if0 if0, q03 q03, C6983dm dmVar, boolean z, CallableMemberDescriptor.Kind kind, a66 a66) {
        super(if0, q03, dmVar, z, kind, a66);
        if (if0 == null) {
            m71140Q(0);
        }
        if (dmVar == null) {
            m71140Q(1);
        }
        if (kind == null) {
            m71140Q(2);
        }
        if (a66 == null) {
            m71140Q(3);
        }
        this.f44140s1 = null;
        this.f44141t1 = null;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m71140Q(int i) {
        String str = (i == 11 || i == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 11 || i == 18) ? 2 : 3)];
        switch (i) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 11 || i == 18) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: n1 */
    public static q03 m71141n1(if0 if0, C6983dm dmVar, boolean z, a66 a66) {
        if (if0 == null) {
            m71140Q(4);
        }
        if (dmVar == null) {
            m71140Q(5);
        }
        if (a66 == null) {
            m71140Q(6);
        }
        return new q03(if0, (q03) null, dmVar, z, CallableMemberDescriptor.Kind.DECLARATION, a66);
    }

    /* renamed from: K0 */
    public boolean mo53322K0() {
        return this.f44140s1.booleanValue();
    }

    /* renamed from: S0 */
    public void mo53329S0(boolean z) {
        this.f44140s1 = Boolean.valueOf(z);
    }

    /* renamed from: T0 */
    public void mo53330T0(boolean z) {
        this.f44141t1 = Boolean.valueOf(z);
    }

    /* renamed from: a0 */
    public boolean mo51318a0() {
        return this.f44141t1.booleanValue();
    }

    /* renamed from: m1 */
    public q03 mo65410m1(if0 if0, q03 q03, CallableMemberDescriptor.Kind kind, a66 a66, C6983dm dmVar) {
        if (if0 == null) {
            m71140Q(12);
        }
        if (kind == null) {
            m71140Q(13);
        }
        if (a66 == null) {
            m71140Q(14);
        }
        if (dmVar == null) {
            m71140Q(15);
        }
        return new q03(if0, q03, dmVar, this.f37790r1, kind, a66);
    }

    /* renamed from: o1 */
    public q03 mo51663i1(d31 d31, C7425c cVar, CallableMemberDescriptor.Kind kind, r24 r24, C6983dm dmVar, a66 a66) {
        if (d31 == null) {
            m71140Q(7);
        }
        if (kind == null) {
            m71140Q(8);
        }
        if (dmVar == null) {
            m71140Q(9);
        }
        if (a66 == null) {
            m71140Q(10);
        }
        if (kind == CallableMemberDescriptor.Kind.DECLARATION || kind == CallableMemberDescriptor.Kind.SYNTHESIZED) {
            q03 m1 = mo65410m1((if0) d31, (q03) cVar, kind, a66, dmVar);
            m1.mo53329S0(mo53322K0());
            m1.mo53330T0(mo51318a0());
            return m1;
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\n" + "newOwner: " + d31 + "\n" + "kind: " + kind);
    }

    /* renamed from: p1 */
    public q03 mo53484e0(xc3 xc3, List<xc3> list, xc3 xc32, Pair<C7420a.C7421a<?>, ?> pair) {
        h85 h85;
        xc3 xc33 = xc3;
        if (list == null) {
            m71140Q(16);
        }
        if (xc32 == null) {
            m71140Q(17);
        }
        q03 o1 = mo51663i1(m57696b(), (C7425c) null, getKind(), (r24) null, getAnnotations(), getSource());
        if (xc33 == null) {
            h85 = null;
        } else {
            h85 = wc1.m73548h(o1, xc3, C6983dm.f37317b.mo51228b());
        }
        o1.mo52098L0(h85, mo51311G(), ck0.m33062j(), getTypeParameters(), z67.m74801a(list, mo51763f(), o1), xc32, mo51326p(), getVisibility());
        if (pair != null) {
            o1.mo53325O0(pair.getFirst(), pair.getSecond());
        }
        return o1;
    }
}
