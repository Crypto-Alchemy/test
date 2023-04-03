package p000;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.C7420a;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;
import kotlin.reflect.jvm.internal.impl.descriptors.C7428e;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C7433a;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: h26 */
/* compiled from: SimpleFunctionDescriptorImpl */
public class h26 extends C7433a implements C7428e {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h26(d31 d31, C7428e eVar, C6983dm dmVar, r24 r24, CallableMemberDescriptor.Kind kind, a66 a66) {
        super(d31, eVar, dmVar, r24, kind, a66);
        if (d31 == null) {
            m58387Q(0);
        }
        if (dmVar == null) {
            m58387Q(1);
        }
        if (r24 == null) {
            m58387Q(2);
        }
        if (kind == null) {
            m58387Q(3);
        }
        if (a66 == null) {
            m58387Q(4);
        }
    }

    /* renamed from: Q */
    public static /* synthetic */ void m58387Q(int i) {
        String str = (i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? 2 : 3)];
        switch (i) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = PublicResolver.FUNC_NAME;
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 13 || i == 18 || i == 23) {
            objArr[1] = "initialize";
        } else if (i == 24) {
            objArr[1] = "getOriginal";
        } else if (i == 29) {
            objArr[1] = "copy";
        } else if (i != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: f1 */
    public static h26 m58388f1(d31 d31, C6983dm dmVar, r24 r24, CallableMemberDescriptor.Kind kind, a66 a66) {
        if (d31 == null) {
            m58387Q(5);
        }
        if (dmVar == null) {
            m58387Q(6);
        }
        if (r24 == null) {
            m58387Q(7);
        }
        if (kind == null) {
            m58387Q(8);
        }
        if (a66 == null) {
            m58387Q(9);
        }
        return new h26(d31, (C7428e) null, dmVar, r24, kind, a66);
    }

    /* renamed from: F0 */
    public C7433a mo50142F0(d31 d31, C7425c cVar, CallableMemberDescriptor.Kind kind, r24 r24, C6983dm dmVar, a66 a66) {
        if (d31 == null) {
            m58387Q(25);
        }
        if (kind == null) {
            m58387Q(26);
        }
        if (dmVar == null) {
            m58387Q(27);
        }
        if (a66 == null) {
            m58387Q(28);
        }
        C7428e eVar = (C7428e) cVar;
        if (r24 == null) {
            r24 = getName();
        }
        return new h26(d31, eVar, dmVar, r24, kind, a66);
    }

    /* renamed from: e1 */
    public C7428e mo50948f0(d31 d31, Modality modality, fd1 fd1, CallableMemberDescriptor.Kind kind, boolean z) {
        C7428e eVar = (C7428e) super.mo50948f0(d31, modality, fd1, kind, z);
        if (eVar == null) {
            m58387Q(29);
        }
        return eVar;
    }

    /* renamed from: g1 */
    public C7428e mo51329y0() {
        C7428e eVar = (C7428e) super.mo51329y0();
        if (eVar == null) {
            m58387Q(24);
        }
        return eVar;
    }

    /* renamed from: h1 */
    public h26 mo52098L0(h85 h85, h85 h852, List<h85> list, List<? extends a17> list2, List<n87> list3, xc3 xc3, Modality modality, fd1 fd1) {
        if (list == null) {
            m58387Q(14);
        }
        if (list2 == null) {
            m58387Q(15);
        }
        if (list3 == null) {
            m58387Q(16);
        }
        if (fd1 == null) {
            m58387Q(17);
        }
        h26 i1 = mo52101i1(h85, h852, list, list2, list3, xc3, modality, fd1, (Map<? extends C7420a.C7421a<?>, ?>) null);
        if (i1 == null) {
            m58387Q(18);
        }
        return i1;
    }

    /* renamed from: i1 */
    public h26 mo52101i1(h85 h85, h85 h852, List<h85> list, List<? extends a17> list2, List<n87> list3, xc3 xc3, Modality modality, fd1 fd1, Map<? extends C7420a.C7421a<?>, ?> map) {
        if (list == null) {
            m58387Q(19);
        }
        if (list2 == null) {
            m58387Q(20);
        }
        if (list3 == null) {
            m58387Q(21);
        }
        if (fd1 == null) {
            m58387Q(22);
        }
        super.mo52098L0(h85, h852, list, list2, list3, xc3, modality, fd1);
        if (map != null && !map.isEmpty()) {
            this.f39343q1 = new LinkedHashMap(map);
        }
        return this;
    }

    /* renamed from: s */
    public C7425c.C7426a<? extends C7428e> mo50951s() {
        C7425c.C7426a<? extends C7425c> s = super.mo50951s();
        if (s == null) {
            m58387Q(30);
        }
        return s;
    }
}
