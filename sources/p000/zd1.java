package p000;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: zd1 */
/* compiled from: DeserializedMemberDescriptor.kt */
public final class zd1 extends AbstractTypeAliasDescriptor implements ud1 {

    /* renamed from: A */
    public final t24 f46354A;

    /* renamed from: B */
    public final w17 f46355B;

    /* renamed from: C */
    public final a97 f46356C;

    /* renamed from: H */
    public final sd1 f46357H;

    /* renamed from: I */
    public Collection<? extends gz6> f46358I;

    /* renamed from: L */
    public d36 f46359L;

    /* renamed from: M */
    public d36 f46360M;

    /* renamed from: P */
    public List<? extends a17> f46361P;

    /* renamed from: Q */
    public d36 f46362Q;

    /* renamed from: x */
    public final da6 f46363x;

    /* renamed from: y */
    public final ProtoBuf$TypeAlias f46364y;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zd1(p000.da6 r13, p000.d31 r14, p000.C6983dm r15, p000.r24 r16, p000.fd1 r17, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias r18, p000.t24 r19, p000.w17 r20, p000.a97 r21, p000.sd1 r22) {
        /*
            r12 = this;
            r6 = r12
            r7 = r13
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            java.lang.String r0 = "storageManager"
            p000.vx2.m53591g(r13, r0)
            java.lang.String r0 = "containingDeclaration"
            r1 = r14
            p000.vx2.m53591g(r14, r0)
            java.lang.String r0 = "annotations"
            r2 = r15
            p000.vx2.m53591g(r15, r0)
            java.lang.String r0 = "name"
            r3 = r16
            p000.vx2.m53591g(r3, r0)
            java.lang.String r0 = "visibility"
            r5 = r17
            p000.vx2.m53591g(r5, r0)
            java.lang.String r0 = "proto"
            p000.vx2.m53591g(r8, r0)
            java.lang.String r0 = "nameResolver"
            p000.vx2.m53591g(r9, r0)
            java.lang.String r0 = "typeTable"
            p000.vx2.m53591g(r10, r0)
            java.lang.String r0 = "versionRequirementTable"
            p000.vx2.m53591g(r11, r0)
            a66 r4 = p000.a66.f36360a
            java.lang.String r0 = "NO_SOURCE"
            p000.vx2.m53590f(r4, r0)
            r0 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f46363x = r7
            r6.f46364y = r8
            r6.f46354A = r9
            r6.f46355B = r10
            r6.f46356C = r11
            r0 = r22
            r6.f46357H = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.zd1.<init>(da6, d31, dm, r24, fd1, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias, t24, w17, a97, sd1):void");
    }

    /* renamed from: A */
    public w17 mo65453A() {
        return this.f46355B;
    }

    /* renamed from: C */
    public d36 mo52331C() {
        d36 d36 = this.f46360M;
        if (d36 != null) {
            return d36;
        }
        vx2.m53605u("expandedType");
        return null;
    }

    /* renamed from: E */
    public t24 mo65454E() {
        return this.f46354A;
    }

    /* renamed from: F */
    public sd1 mo65455F() {
        return this.f46357H;
    }

    /* renamed from: G0 */
    public List<a17> mo53273G0() {
        List<? extends a17> list = this.f46361P;
        if (list != null) {
            return list;
        }
        vx2.m53605u("typeConstructorParameters");
        return null;
    }

    /* renamed from: H */
    public da6 mo53274H() {
        return this.f46363x;
    }

    /* renamed from: I0 */
    public ProtoBuf$TypeAlias mo67246I0() {
        return this.f46364y;
    }

    /* renamed from: J0 */
    public a97 mo67247J0() {
        return this.f46356C;
    }

    /* renamed from: K0 */
    public final void mo67248K0(List<? extends a17> list, d36 d36, d36 d362) {
        vx2.m53591g(list, "declaredTypeParameters");
        vx2.m53591g(d36, "underlyingType");
        vx2.m53591g(d362, "expandedType");
        mo53275H0(list);
        this.f46359L = d36;
        this.f46360M = d362;
        this.f46361P = TypeParameterUtilsKt.m60322d(this);
        this.f46362Q = mo53270A0();
        this.f46358I = mo53272F0();
    }

    /* renamed from: L0 */
    public hz6 mo50708c(TypeSubstitutor typeSubstitutor) {
        vx2.m53591g(typeSubstitutor, "substitutor");
        if (typeSubstitutor.mo55336k()) {
            return this;
        }
        da6 H = mo53274H();
        d31 b = mo51119b();
        vx2.m53590f(b, "containingDeclaration");
        C6983dm annotations = getAnnotations();
        vx2.m53590f(annotations, "annotations");
        r24 name = getName();
        vx2.m53590f(name, PublicResolver.FUNC_NAME);
        zd1 zd1 = new zd1(H, b, annotations, name, getVisibility(), mo67246I0(), mo65454E(), mo65453A(), mo67247J0(), mo65455F());
        List<a17> o = mo51670o();
        d36 o0 = mo52332o0();
        Variance variance = Variance.INVARIANT;
        xc3 n = typeSubstitutor.mo55338n(o0, variance);
        vx2.m53590f(n, "substitutor.safeSubstitu…Type, Variance.INVARIANT)");
        d36 a = q17.m71165a(n);
        xc3 n2 = typeSubstitutor.mo55338n(mo52331C(), variance);
        vx2.m53590f(n2, "substitutor.safeSubstitu…Type, Variance.INVARIANT)");
        zd1.mo67248K0(o, a, q17.m71165a(n2));
        return zd1;
    }

    /* renamed from: n */
    public d36 mo51464n() {
        d36 d36 = this.f46362Q;
        if (d36 != null) {
            return d36;
        }
        vx2.m53605u("defaultTypeImpl");
        return null;
    }

    /* renamed from: o0 */
    public d36 mo52332o0() {
        d36 d36 = this.f46359L;
        if (d36 != null) {
            return d36;
        }
        vx2.m53605u("underlyingType");
        return null;
    }

    /* renamed from: r */
    public if0 mo52333r() {
        if (zc3.m74855a(mo52331C())) {
            return null;
        }
        eg0 d = mo52331C().mo51134H0().mo51180d();
        if (d instanceof if0) {
            return (if0) d;
        }
        return null;
    }
}
