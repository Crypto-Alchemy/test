package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.descriptors.C7420a;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;
import kotlin.reflect.jvm.internal.impl.descriptors.C7428e;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.util.OperatorChecks;
import org.web3j.ens.contracts.generated.PublicResolver;

public class JavaMethodDescriptor extends h26 implements o03 {

    /* renamed from: t1 */
    public static final C7420a.C7421a<n87> f39445t1 = new C7451a();

    /* renamed from: u1 */
    public static final C7420a.C7421a<Boolean> f39446u1 = new C7452b();

    /* renamed from: r1 */
    public ParameterNamesStatus f39447r1;

    /* renamed from: s1 */
    public final boolean f39448s1;

    public enum ParameterNamesStatus {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);
        
        public final boolean isStable;
        public final boolean isSynthesized;

        /* access modifiers changed from: public */
        ParameterNamesStatus(boolean z, boolean z2) {
            this.isStable = z;
            this.isSynthesized = z2;
        }

        public static ParameterNamesStatus get(boolean z, boolean z2) {
            ParameterNamesStatus parameterNamesStatus;
            if (z) {
                if (z2) {
                    parameterNamesStatus = STABLE_SYNTHESIZED;
                } else {
                    parameterNamesStatus = STABLE_DECLARED;
                }
            } else if (z2) {
                parameterNamesStatus = NON_STABLE_SYNTHESIZED;
            } else {
                parameterNamesStatus = NON_STABLE_DECLARED;
            }
            if (parameterNamesStatus == null) {
                m60732a(0);
            }
            return parameterNamesStatus;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor$a */
    public static class C7451a implements C7420a.C7421a<n87> {
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor$b */
    public static class C7452b implements C7420a.C7421a<Boolean> {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JavaMethodDescriptor(d31 d31, C7428e eVar, C6983dm dmVar, r24 r24, CallableMemberDescriptor.Kind kind, a66 a66, boolean z) {
        super(d31, eVar, dmVar, r24, kind, a66);
        if (d31 == null) {
            m60722Q(0);
        }
        if (dmVar == null) {
            m60722Q(1);
        }
        if (r24 == null) {
            m60722Q(2);
        }
        if (kind == null) {
            m60722Q(3);
        }
        if (a66 == null) {
            m60722Q(4);
        }
        this.f39447r1 = null;
        this.f39448s1 = z;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m60722Q(int i) {
        String str = (i == 13 || i == 18 || i == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 13 || i == 18 || i == 21) ? 2 : 3)];
        switch (i) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = PublicResolver.FUNC_NAME;
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 13) {
            objArr[1] = "initialize";
        } else if (i == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 13 || i == 18 || i == 21) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: j1 */
    public static JavaMethodDescriptor m60723j1(d31 d31, C6983dm dmVar, r24 r24, a66 a66, boolean z) {
        if (d31 == null) {
            m60722Q(5);
        }
        if (dmVar == null) {
            m60722Q(6);
        }
        if (r24 == null) {
            m60722Q(7);
        }
        if (a66 == null) {
            m60722Q(8);
        }
        return new JavaMethodDescriptor(d31, (C7428e) null, dmVar, r24, CallableMemberDescriptor.Kind.DECLARATION, a66, z);
    }

    /* renamed from: K0 */
    public boolean mo53322K0() {
        return this.f39447r1.isStable;
    }

    /* renamed from: a0 */
    public boolean mo51318a0() {
        return this.f39447r1.isSynthesized;
    }

    /* renamed from: i1 */
    public h26 mo52101i1(h85 h85, h85 h852, List<h85> list, List<? extends a17> list2, List<n87> list3, xc3 xc3, Modality modality, fd1 fd1, Map<? extends C7420a.C7421a<?>, ?> map) {
        if (list == null) {
            m60722Q(9);
        }
        if (list2 == null) {
            m60722Q(10);
        }
        if (list3 == null) {
            m60722Q(11);
        }
        if (fd1 == null) {
            m60722Q(12);
        }
        h26 i1 = super.mo52101i1(h85, h852, list, list2, list3, xc3, modality, fd1, map);
        mo53335Z0(OperatorChecks.f40312a.mo56356a(i1).mo51451a());
        if (i1 == null) {
            m60722Q(13);
        }
        return i1;
    }

    /* renamed from: k1 */
    public JavaMethodDescriptor mo50142F0(d31 d31, C7425c cVar, CallableMemberDescriptor.Kind kind, r24 r24, C6983dm dmVar, a66 a66) {
        if (d31 == null) {
            m60722Q(14);
        }
        if (kind == null) {
            m60722Q(15);
        }
        if (dmVar == null) {
            m60722Q(16);
        }
        if (a66 == null) {
            m60722Q(17);
        }
        C7428e eVar = (C7428e) cVar;
        if (r24 == null) {
            r24 = getName();
        }
        JavaMethodDescriptor javaMethodDescriptor = new JavaMethodDescriptor(d31, eVar, dmVar, r24, kind, a66, this.f39448s1);
        javaMethodDescriptor.mo53487m1(mo53322K0(), mo51318a0());
        return javaMethodDescriptor;
    }

    /* renamed from: l1 */
    public JavaMethodDescriptor mo53484e0(xc3 xc3, List<xc3> list, xc3 xc32, Pair<C7420a.C7421a<?>, ?> pair) {
        h85 h85;
        if (list == null) {
            m60722Q(19);
        }
        if (xc32 == null) {
            m60722Q(20);
        }
        List<n87> a = z67.m74801a(list, mo51763f(), this);
        if (xc3 == null) {
            h85 = null;
        } else {
            h85 = wc1.m73548h(this, xc3, C6983dm.f37317b.mo51228b());
        }
        JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) mo50951s().mo50954b(a).mo50970q(xc32).mo50956c(h85).mo50953a().mo50965l().build();
        if (pair != null) {
            javaMethodDescriptor.mo53325O0(pair.getFirst(), pair.getSecond());
        }
        if (javaMethodDescriptor == null) {
            m60722Q(21);
        }
        return javaMethodDescriptor;
    }

    /* renamed from: m1 */
    public void mo53487m1(boolean z, boolean z2) {
        this.f39447r1 = ParameterNamesStatus.get(z, z2);
    }
}
