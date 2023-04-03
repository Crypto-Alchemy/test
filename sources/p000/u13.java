package p000;

import java.util.List;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.builtins.C7389b;
import kotlin.reflect.jvm.internal.impl.descriptors.C7420a;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: u13 */
/* compiled from: JavaPropertyDescriptor */
public class u13 extends gx4 implements o03 {

    /* renamed from: p1 */
    public final boolean f44846p1;

    /* renamed from: q1 */
    public final Pair<C7420a.C7421a<?>, ?> f44847q1;

    /* renamed from: r1 */
    public xc3 f44848r1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u13(d31 d31, C6983dm dmVar, Modality modality, fd1 fd1, boolean z, r24 r24, a66 a66, fx4 fx4, CallableMemberDescriptor.Kind kind, boolean z2, Pair<C7420a.C7421a<?>, ?> pair) {
        super(d31, fx4, dmVar, modality, fd1, z, r24, kind, a66, false, false, false, false, false, false);
        if (d31 == null) {
            m72513Q(0);
        }
        if (dmVar == null) {
            m72513Q(1);
        }
        if (modality == null) {
            m72513Q(2);
        }
        if (fd1 == null) {
            m72513Q(3);
        }
        if (r24 == null) {
            m72513Q(4);
        }
        if (a66 == null) {
            m72513Q(5);
        }
        if (kind == null) {
            m72513Q(6);
        }
        this.f44848r1 = null;
        this.f44846p1 = z2;
        this.f44847q1 = pair;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m72513Q(int i) {
        String str = i != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 21 ? 3 : 2)];
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = PublicResolver.FUNC_NAME;
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw (i != 21 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    /* renamed from: Z0 */
    public static u13 m72514Z0(d31 d31, C6983dm dmVar, Modality modality, fd1 fd1, boolean z, r24 r24, a66 a66, boolean z2) {
        if (d31 == null) {
            m72513Q(7);
        }
        if (dmVar == null) {
            m72513Q(8);
        }
        if (modality == null) {
            m72513Q(9);
        }
        if (fd1 == null) {
            m72513Q(10);
        }
        if (r24 == null) {
            m72513Q(11);
        }
        if (a66 == null) {
            m72513Q(12);
        }
        return new u13(d31, dmVar, modality, fd1, z, r24, a66, (fx4) null, CallableMemberDescriptor.Kind.DECLARATION, z2, (Pair<C7420a.C7421a<?>, ?>) null);
    }

    /* renamed from: J0 */
    public gx4 mo52040J0(d31 d31, Modality modality, fd1 fd1, fx4 fx4, CallableMemberDescriptor.Kind kind, r24 r24, a66 a66) {
        if (d31 == null) {
            m72513Q(13);
        }
        if (modality == null) {
            m72513Q(14);
        }
        if (fd1 == null) {
            m72513Q(15);
        }
        if (kind == null) {
            m72513Q(16);
        }
        if (r24 == null) {
            m72513Q(17);
        }
        if (a66 == null) {
            m72513Q(18);
        }
        return new u13(d31, getAnnotations(), modality, fd1, mo51761I(), r24, a66, fx4, kind, this.f44846p1, this.f44847q1);
    }

    /* renamed from: T0 */
    public void mo52048T0(xc3 xc3) {
        if (xc3 == null) {
            m72513Q(22);
        }
        this.f44848r1 = xc3;
    }

    /* renamed from: a0 */
    public boolean mo51318a0() {
        return false;
    }

    /* renamed from: e0 */
    public o03 mo53484e0(xc3 xc3, List<xc3> list, xc3 xc32, Pair<C7420a.C7421a<?>, ?> pair) {
        fx4 fx4;
        jx4 jx4;
        mx4 mx4;
        h85 h85;
        lx4 lx4;
        ix4 ix4;
        xc3 xc33 = xc3;
        xc3 xc34 = xc32;
        if (list == null) {
            m72513Q(19);
        }
        if (xc34 == null) {
            m72513Q(20);
        }
        if (mo51329y0() == this) {
            fx4 = null;
        } else {
            fx4 = mo51329y0();
        }
        u13 u13 = r5;
        u13 u132 = new u13(mo51119b(), getAnnotations(), mo51326p(), getVisibility(), mo51761I(), getName(), getSource(), fx4, getKind(), this.f44846p1, pair);
        jx4 L0 = getGetter();
        if (L0 != null) {
            C6983dm annotations = L0.getAnnotations();
            Modality p = L0.mo51326p();
            fd1 visibility = L0.getVisibility();
            boolean B = L0.mo51308B();
            boolean isExternal = L0.isExternal();
            boolean isInline = L0.isInline();
            CallableMemberDescriptor.Kind kind = getKind();
            if (fx4 == null) {
                ix4 = null;
            } else {
                ix4 = fx4.getGetter();
            }
            jx4 = r5;
            jx4 jx42 = new jx4(u13, annotations, p, visibility, B, isExternal, isInline, kind, ix4, L0.getSource());
            jx4.mo51313H0(L0.mo51325n0());
            jx4.mo52818K0(xc34);
        } else {
            jx4 = null;
        }
        lx4 setter = getSetter();
        if (setter != null) {
            C6983dm annotations2 = setter.getAnnotations();
            Modality p2 = setter.mo51326p();
            fd1 visibility2 = setter.getVisibility();
            boolean B2 = setter.mo51308B();
            boolean isExternal2 = setter.isExternal();
            boolean isInline2 = setter.isInline();
            CallableMemberDescriptor.Kind kind2 = getKind();
            if (fx4 == null) {
                lx4 = null;
            } else {
                lx4 = fx4.getSetter();
            }
            mx4 mx42 = r5;
            mx4 mx43 = new mx4(u13, annotations2, p2, visibility2, B2, isExternal2, isInline2, kind2, lx4, setter.getSource());
            mx4 mx44 = mx42;
            mx44.mo51313H0(mx42.mo51325n0());
            mx44.mo56333L0(setter.mo51763f().get(0));
            mx4 = mx44;
        } else {
            mx4 = null;
        }
        u13 u133 = u13;
        u133.mo52045P0(jx4, mx4, mo51770r0(), mo51762K());
        u133.mo52049U0(mo52046Q0());
        pc2<gc4<fq0<?>>> pc2 = this.f39379x;
        if (pc2 != null) {
            u133.mo53364E0(this.f39378s, pc2);
        }
        u133.mo50952x0(mo51659d());
        if (xc33 == null) {
            h85 = null;
        } else {
            h85 = wc1.m73548h(this, xc33, C6983dm.f37317b.mo51228b());
        }
        u133.mo52050V0(xc32, getTypeParameters(), mo51311G(), h85, ck0.m33062j());
        return u133;
    }

    public boolean isConst() {
        xc3 type = getType();
        if (!this.f44846p1 || !bq0.m56114a(type) || (p07.m70838i(type) && !C7389b.m60145u0(type))) {
            return false;
        }
        return true;
    }

    /* renamed from: p0 */
    public <V> V mo50950p0(C7420a.C7421a<V> aVar) {
        Pair<C7420a.C7421a<?>, ?> pair = this.f44847q1;
        if (pair == null || !pair.getFirst().equals(aVar)) {
            return null;
        }
        return this.f44847q1.getSecond();
    }
}
