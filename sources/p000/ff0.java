package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.C7424b;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C7433a;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* renamed from: ff0 */
/* compiled from: ClassConstructorDescriptorImpl */
public class ff0 extends C7433a implements ef0 {

    /* renamed from: r1 */
    public final boolean f37790r1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ff0(if0 if0, C7424b bVar, C6983dm dmVar, boolean z, CallableMemberDescriptor.Kind kind, a66 a66) {
        super(if0, bVar, dmVar, n66.f41110i, kind, a66);
        if (if0 == null) {
            m57684Q(0);
        }
        if (dmVar == null) {
            m57684Q(1);
        }
        if (kind == null) {
            m57684Q(2);
        }
        if (a66 == null) {
            m57684Q(3);
        }
        this.f37790r1 = z;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m57684Q(int i) {
        String str;
        int i2;
        Throwable th;
        if (!(i == 21 || i == 27)) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i == 21 || i == 27)) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    i2 = 3;
                    break;
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 5:
            case 8:
            case 25:
                objArr[0] = "annotations";
                break;
            case 2:
            case 24:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 9:
            case 26:
                objArr[0] = "source";
                break;
            case 10:
            case 13:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
            case 14:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "typeParameterDescriptors";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                break;
            case 20:
                objArr[0] = "originalSubstitutor";
                break;
            case 22:
                objArr[0] = "overriddenDescriptors";
                break;
            case 23:
                objArr[0] = "newOwner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 21) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i != 27) {
            switch (i) {
                case 15:
                case 16:
                    objArr[1] = "calculateContextReceiverParameters";
                    break;
                case 17:
                    objArr[1] = "getContainingDeclaration";
                    break;
                case 18:
                    objArr[1] = "getConstructedClass";
                    break;
                case 19:
                    objArr[1] = "getOriginal";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "create";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSynthesized";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                objArr[2] = "initialize";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                break;
            case 20:
                objArr[2] = "substitute";
                break;
            case 22:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 23:
            case 24:
            case 25:
            case 26:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i == 21 || i == 27)) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    th = new IllegalArgumentException(format);
                    break;
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    /* renamed from: h1 */
    public static ff0 m57685h1(if0 if0, C6983dm dmVar, boolean z, a66 a66) {
        if (if0 == null) {
            m57684Q(4);
        }
        if (dmVar == null) {
            m57684Q(5);
        }
        if (a66 == null) {
            m57684Q(6);
        }
        return new ff0(if0, (C7424b) null, dmVar, z, CallableMemberDescriptor.Kind.DECLARATION, a66);
    }

    /* renamed from: W */
    public boolean mo51657W() {
        return this.f37790r1;
    }

    /* renamed from: X */
    public if0 mo51658X() {
        if0 j1 = m57696b();
        if (j1 == null) {
            m57684Q(18);
        }
        return j1;
    }

    /* renamed from: d */
    public Collection<? extends C7425c> mo51659d() {
        Set emptySet = Collections.emptySet();
        if (emptySet == null) {
            m57684Q(21);
        }
        return emptySet;
    }

    /* renamed from: e1 */
    public final List<h85> mo51660e1() {
        if0 j1 = m57696b();
        if (!j1.mo52463U().isEmpty()) {
            List<h85> U = j1.mo52463U();
            if (U == null) {
                m57684Q(15);
            }
            return U;
        }
        List<h85> emptyList = Collections.emptyList();
        if (emptyList == null) {
            m57684Q(16);
        }
        return emptyList;
    }

    /* renamed from: f1 */
    public h85 mo51661f1() {
        if0 j1 = m57696b();
        if (!j1.mo51669i()) {
            return null;
        }
        d31 b = j1.mo51119b();
        if (b instanceof if0) {
            return ((if0) b).mo52460D0();
        }
        return null;
    }

    /* renamed from: g1 */
    public ef0 mo50948f0(d31 d31, Modality modality, fd1 fd1, CallableMemberDescriptor.Kind kind, boolean z) {
        ef0 ef0 = (ef0) super.mo50948f0(d31, modality, fd1, kind, z);
        if (ef0 == null) {
            m57684Q(27);
        }
        return ef0;
    }

    /* renamed from: i1 */
    public ff0 mo50142F0(d31 d31, C7425c cVar, CallableMemberDescriptor.Kind kind, r24 r24, C6983dm dmVar, a66 a66) {
        if (d31 == null) {
            m57684Q(23);
        }
        if (kind == null) {
            m57684Q(24);
        }
        if (dmVar == null) {
            m57684Q(25);
        }
        if (a66 == null) {
            m57684Q(26);
        }
        CallableMemberDescriptor.Kind kind2 = CallableMemberDescriptor.Kind.DECLARATION;
        if (kind == kind2 || kind == CallableMemberDescriptor.Kind.SYNTHESIZED) {
            return new ff0((if0) d31, this, dmVar, this.f37790r1, kind2, a66);
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\n" + "newOwner: " + d31 + "\n" + "kind: " + kind);
    }

    /* renamed from: j0 */
    public <R, D> R mo51120j0(h31<R, D> h31, D d) {
        return h31.mo52112j(this, d);
    }

    /* renamed from: j1 */
    public if0 m57696b() {
        if0 if0 = (if0) super.mo51119b();
        if (if0 == null) {
            m57684Q(17);
        }
        return if0;
    }

    /* renamed from: k1 */
    public ff0 mo51665k1(List<n87> list, fd1 fd1) {
        if (list == null) {
            m57684Q(13);
        }
        if (fd1 == null) {
            m57684Q(14);
        }
        mo51666l1(list, fd1, m57696b().mo51670o());
        return this;
    }

    /* renamed from: l1 */
    public ff0 mo51666l1(List<n87> list, fd1 fd1, List<a17> list2) {
        if (list == null) {
            m57684Q(10);
        }
        if (fd1 == null) {
            m57684Q(11);
        }
        if (list2 == null) {
            m57684Q(12);
        }
        super.mo52098L0((h85) null, mo51661f1(), mo51660e1(), list2, list, (xc3) null, Modality.FINAL, fd1);
        return this;
    }

    /* renamed from: x0 */
    public void mo50952x0(Collection<? extends CallableMemberDescriptor> collection) {
        if (collection == null) {
            m57684Q(22);
        }
    }

    /* renamed from: c */
    public ef0 m57700c(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            m57684Q(20);
        }
        return (ef0) super.mo50708c(typeSubstitutor);
    }

    /* renamed from: a */
    public ef0 m57691a() {
        ef0 ef0 = (ef0) super.mo51329y0();
        if (ef0 == null) {
            m57684Q(19);
        }
        return ef0;
    }
}
