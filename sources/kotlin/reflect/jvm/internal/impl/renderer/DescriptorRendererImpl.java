package kotlin.reflect.jvm.internal.impl.renderer;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C6169a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.builtins.C7389b;
import kotlin.reflect.jvm.internal.impl.builtins.C7395c;
import kotlin.reflect.jvm.internal.impl.descriptors.C7420a;
import kotlin.reflect.jvm.internal.impl.descriptors.C7424b;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;
import kotlin.reflect.jvm.internal.impl.descriptors.C7427d;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.t83;

/* compiled from: DescriptorRendererImpl.kt */
public final class DescriptorRendererImpl extends DescriptorRenderer implements zc1 {

    /* renamed from: l */
    public final DescriptorRendererOptionsImpl f39999l;

    /* renamed from: m */
    public final ef3 f40000m = C6169a.m47232a(new DescriptorRendererImpl$functionTypeAnnotationsRenderer$2(this));

    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$a */
    /* compiled from: DescriptorRendererImpl.kt */
    public final class C7643a implements h31<r37, StringBuilder> {

        /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$a$a */
        /* compiled from: DescriptorRendererImpl.kt */
        public /* synthetic */ class C7644a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f40002a;

            static {
                int[] iArr = new int[PropertyAccessorRenderingPolicy.values().length];
                iArr[PropertyAccessorRenderingPolicy.PRETTY.ordinal()] = 1;
                iArr[PropertyAccessorRenderingPolicy.DEBUG.ordinal()] = 2;
                iArr[PropertyAccessorRenderingPolicy.NONE.ordinal()] = 3;
                f40002a = iArr;
            }
        }

        public C7643a() {
        }

        /* renamed from: A */
        public void mo54967A(n87 n87, StringBuilder sb) {
            vx2.m53591g(n87, "descriptor");
            vx2.m53591g(sb, "builder");
            DescriptorRendererImpl.this.mo54880T1(n87, true, sb, true);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo52103a(h85 h85, Object obj) {
            mo54978x(h85, (StringBuilder) obj);
            return r37.f33317a;
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ Object mo52104b(ix4 ix4, Object obj) {
            mo54976v(ix4, (StringBuilder) obj);
            return r37.f33317a;
        }

        /* renamed from: c */
        public /* bridge */ /* synthetic */ Object mo52105c(if0 if0, Object obj) {
            mo54968n(if0, (StringBuilder) obj);
            return r37.f33317a;
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ Object mo52106d(lx4 lx4, Object obj) {
            mo54977w(lx4, (StringBuilder) obj);
            return r37.f33317a;
        }

        /* renamed from: e */
        public /* bridge */ /* synthetic */ Object mo52107e(fx4 fx4, Object obj) {
            mo54975u(fx4, (StringBuilder) obj);
            return r37.f33317a;
        }

        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo52108f(tk4 tk4, Object obj) {
            mo54973s(tk4, (StringBuilder) obj);
            return r37.f33317a;
        }

        /* renamed from: g */
        public /* bridge */ /* synthetic */ Object mo52109g(fk4 fk4, Object obj) {
            mo54972r(fk4, (StringBuilder) obj);
            return r37.f33317a;
        }

        /* renamed from: h */
        public /* bridge */ /* synthetic */ Object mo52110h(hz6 hz6, Object obj) {
            mo54979y(hz6, (StringBuilder) obj);
            return r37.f33317a;
        }

        /* renamed from: i */
        public /* bridge */ /* synthetic */ Object mo52111i(C7425c cVar, Object obj) {
            mo54970p(cVar, (StringBuilder) obj);
            return r37.f33317a;
        }

        /* renamed from: j */
        public /* bridge */ /* synthetic */ Object mo52112j(C7424b bVar, Object obj) {
            mo54969o(bVar, (StringBuilder) obj);
            return r37.f33317a;
        }

        /* renamed from: k */
        public /* bridge */ /* synthetic */ Object mo52113k(mx3 mx3, Object obj) {
            mo54971q(mx3, (StringBuilder) obj);
            return r37.f33317a;
        }

        /* renamed from: l */
        public /* bridge */ /* synthetic */ Object mo52114l(a17 a17, Object obj) {
            mo54980z(a17, (StringBuilder) obj);
            return r37.f33317a;
        }

        /* renamed from: m */
        public /* bridge */ /* synthetic */ Object mo52115m(n87 n87, Object obj) {
            mo54967A(n87, (StringBuilder) obj);
            return r37.f33317a;
        }

        /* renamed from: n */
        public void mo54968n(if0 if0, StringBuilder sb) {
            vx2.m53591g(if0, "descriptor");
            vx2.m53591g(sb, "builder");
            DescriptorRendererImpl.this.mo54893Y0(if0, sb);
        }

        /* renamed from: o */
        public void mo54969o(C7424b bVar, StringBuilder sb) {
            vx2.m53591g(bVar, "constructorDescriptor");
            vx2.m53591g(sb, "builder");
            DescriptorRendererImpl.this.mo54910d1(bVar, sb);
        }

        /* renamed from: p */
        public void mo54970p(C7425c cVar, StringBuilder sb) {
            vx2.m53591g(cVar, "descriptor");
            vx2.m53591g(sb, "builder");
            DescriptorRendererImpl.this.mo54928j1(cVar, sb);
        }

        /* renamed from: q */
        public void mo54971q(mx3 mx3, StringBuilder sb) {
            vx2.m53591g(mx3, "descriptor");
            vx2.m53591g(sb, "builder");
            DescriptorRendererImpl.this.mo54954t1(mx3, sb, true);
        }

        /* renamed from: r */
        public void mo54972r(fk4 fk4, StringBuilder sb) {
            vx2.m53591g(fk4, "descriptor");
            vx2.m53591g(sb, "builder");
            DescriptorRendererImpl.this.mo54962x1(fk4, sb);
        }

        /* renamed from: s */
        public void mo54973s(tk4 tk4, StringBuilder sb) {
            vx2.m53591g(tk4, "descriptor");
            vx2.m53591g(sb, "builder");
            DescriptorRendererImpl.this.mo54966z1(tk4, sb);
        }

        /* renamed from: t */
        public final void mo54974t(C7427d dVar, StringBuilder sb, String str) {
            int i = C7644a.f40002a[DescriptorRendererImpl.this.mo54936m0().ordinal()];
            if (i == 1) {
                DescriptorRendererImpl.this.mo54877S0(dVar, sb);
                sb.append(str + " for ");
                DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
                fx4 R = dVar.mo51316R();
                vx2.m53590f(R, "descriptor.correspondingProperty");
                descriptorRendererImpl.mo54837B1(R, sb);
            } else if (i == 2) {
                mo54970p(dVar, sb);
            }
        }

        /* renamed from: u */
        public void mo54975u(fx4 fx4, StringBuilder sb) {
            vx2.m53591g(fx4, "descriptor");
            vx2.m53591g(sb, "builder");
            DescriptorRendererImpl.this.mo54837B1(fx4, sb);
        }

        /* renamed from: v */
        public void mo54976v(ix4 ix4, StringBuilder sb) {
            vx2.m53591g(ix4, "descriptor");
            vx2.m53591g(sb, "builder");
            mo54974t(ix4, sb, "getter");
        }

        /* renamed from: w */
        public void mo54977w(lx4 lx4, StringBuilder sb) {
            vx2.m53591g(lx4, "descriptor");
            vx2.m53591g(sb, "builder");
            mo54974t(lx4, sb, "setter");
        }

        /* renamed from: x */
        public void mo54978x(h85 h85, StringBuilder sb) {
            vx2.m53591g(h85, "descriptor");
            vx2.m53591g(sb, "builder");
            sb.append(h85.getName());
        }

        /* renamed from: y */
        public void mo54979y(hz6 hz6, StringBuilder sb) {
            vx2.m53591g(hz6, "descriptor");
            vx2.m53591g(sb, "builder");
            DescriptorRendererImpl.this.mo54853J1(hz6, sb);
        }

        /* renamed from: z */
        public void mo54980z(a17 a17, StringBuilder sb) {
            vx2.m53591g(a17, "descriptor");
            vx2.m53591g(sb, "builder");
            DescriptorRendererImpl.this.mo54866O1(a17, sb, true);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$b */
    /* compiled from: DescriptorRendererImpl.kt */
    public /* synthetic */ class C7645b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40003a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f40004b;

        static {
            int[] iArr = new int[RenderingFormat.values().length];
            iArr[RenderingFormat.PLAIN.ordinal()] = 1;
            iArr[RenderingFormat.HTML.ordinal()] = 2;
            f40003a = iArr;
            int[] iArr2 = new int[ParameterNameRenderingPolicy.values().length];
            iArr2[ParameterNameRenderingPolicy.ALL.ordinal()] = 1;
            iArr2[ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED.ordinal()] = 2;
            iArr2[ParameterNameRenderingPolicy.NONE.ordinal()] = 3;
            f40004b = iArr2;
        }
    }

    public DescriptorRendererImpl(DescriptorRendererOptionsImpl descriptorRendererOptionsImpl) {
        vx2.m53591g(descriptorRendererOptionsImpl, "options");
        this.f39999l = descriptorRendererOptionsImpl;
        descriptorRendererOptionsImpl.mo55023k0();
    }

    /* renamed from: N1 */
    public static /* synthetic */ void m62103N1(DescriptorRendererImpl descriptorRendererImpl, StringBuilder sb, xc3 xc3, yz6 yz6, int i, Object obj) {
        if ((i & 2) != 0) {
            yz6 = xc3.mo51134H0();
        }
        descriptorRendererImpl.mo54861M1(sb, xc3, yz6);
    }

    /* renamed from: S1 */
    public static /* synthetic */ void m62104S1(DescriptorRendererImpl descriptorRendererImpl, o87 o87, StringBuilder sb, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        descriptorRendererImpl.mo54875R1(o87, sb, z);
    }

    /* renamed from: W0 */
    public static /* synthetic */ void m62105W0(DescriptorRendererImpl descriptorRendererImpl, StringBuilder sb, C7903ml mlVar, AnnotationUseSiteTarget annotationUseSiteTarget, int i, Object obj) {
        if ((i & 2) != 0) {
            annotationUseSiteTarget = null;
        }
        descriptorRendererImpl.mo54885V0(sb, mlVar, annotationUseSiteTarget);
    }

    /* renamed from: A0 */
    public RenderingFormat mo54834A0() {
        return this.f39999l.mo55012Z();
    }

    /* renamed from: A1 */
    public final void mo54835A1(StringBuilder sb, pt4 pt4) {
        pt4 c = pt4.mo65362c();
        if (c != null) {
            mo54835A1(sb, c);
            sb.append('.');
            r24 name = pt4.mo65361b().getName();
            vx2.m53590f(name, "possiblyInnerType.classifierDescriptor.name");
            sb.append(mo54814v(name, false));
        } else {
            yz6 g = pt4.mo65361b().mo50046g();
            vx2.m53590f(g, "possiblyInnerType.classi…escriptor.typeConstructor");
            sb.append(mo54858L1(g));
        }
        sb.append(mo54855K1(pt4.mo65360a()));
    }

    /* renamed from: B0 */
    public rc2<xc3, xc3> mo54836B0() {
        return this.f39999l.mo55013a0();
    }

    /* renamed from: B1 */
    public final void mo54837B1(fx4 fx4, StringBuilder sb) {
        boolean z;
        if (!mo54965z0()) {
            if (!mo54963y0()) {
                mo54839C1(fx4, sb);
                List<h85> s0 = fx4.mo51327s0();
                vx2.m53590f(s0, "property.contextReceiverParameters");
                mo54913e1(s0, sb);
                fd1 visibility = fx4.getVisibility();
                vx2.m53590f(visibility, "property.visibility");
                mo54888W1(visibility, sb);
                boolean z2 = false;
                if (!mo54915f0().contains(DescriptorRendererModifier.CONST) || !fx4.isConst()) {
                    z = false;
                } else {
                    z = true;
                }
                mo54952s1(sb, z, "const");
                mo54943o1(fx4, sb);
                mo54950r1(fx4, sb);
                mo54960w1(fx4, sb);
                if (mo54915f0().contains(DescriptorRendererModifier.LATEINIT) && fx4.mo51772t0()) {
                    z2 = true;
                }
                mo54952s1(sb, z2, "lateinit");
                mo54940n1(fx4, sb);
            }
            m62104S1(this, fx4, sb, false, 4, (Object) null);
            List<a17> typeParameters = fx4.getTypeParameters();
            vx2.m53590f(typeParameters, "property.typeParameters");
            mo54872Q1(typeParameters, sb, true);
            mo54841D1(fx4, sb);
        }
        mo54954t1(fx4, sb, true);
        sb.append(": ");
        xc3 type = fx4.getType();
        vx2.m53590f(type, "property.type");
        sb.append(mo54815w(type));
        mo54843E1(fx4, sb);
        mo54934l1(fx4, sb);
        List<a17> typeParameters2 = fx4.getTypeParameters();
        vx2.m53590f(typeParameters2, "property.typeParameters");
        mo54891X1(typeParameters2, sb);
    }

    /* renamed from: C0 */
    public boolean mo54838C0() {
        return this.f39999l.mo55014b0();
    }

    /* renamed from: C1 */
    public final void mo54839C1(fx4 fx4, StringBuilder sb) {
        if (mo54915f0().contains(DescriptorRendererModifier.ANNOTATIONS)) {
            m62105W0(this, sb, fx4, (AnnotationUseSiteTarget) null, 2, (Object) null);
            g02 r0 = fx4.mo51770r0();
            if (r0 != null) {
                mo54885V0(sb, r0, AnnotationUseSiteTarget.FIELD);
            }
            g02 K = fx4.mo51762K();
            if (K != null) {
                mo54885V0(sb, K, AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD);
            }
            if (mo54936m0() == PropertyAccessorRenderingPolicy.NONE) {
                ix4 getter = fx4.getGetter();
                if (getter != null) {
                    mo54885V0(sb, getter, AnnotationUseSiteTarget.PROPERTY_GETTER);
                }
                lx4 setter = fx4.getSetter();
                if (setter != null) {
                    mo54885V0(sb, setter, AnnotationUseSiteTarget.PROPERTY_SETTER);
                    List<n87> f = setter.mo51763f();
                    vx2.m53590f(f, "setter.valueParameters");
                    n87 n87 = (n87) CollectionsKt___CollectionsKt.m47355z0(f);
                    vx2.m53590f(n87, "it");
                    mo54885V0(sb, n87, AnnotationUseSiteTarget.SETTER_PARAMETER);
                }
            }
        }
    }

    /* renamed from: D0 */
    public boolean mo54840D0() {
        return this.f39999l.mo55015c0();
    }

    /* renamed from: D1 */
    public final void mo54841D1(C7420a aVar, StringBuilder sb) {
        h85 J = aVar.mo51315J();
        if (J != null) {
            mo54885V0(sb, J, AnnotationUseSiteTarget.RECEIVER);
            xc3 type = J.getType();
            vx2.m53590f(type, "receiver.type");
            sb.append(mo54922h1(type));
            sb.append(".");
        }
    }

    /* renamed from: E0 */
    public DescriptorRenderer.C7640b mo54842E0() {
        return this.f39999l.mo55016d0();
    }

    /* renamed from: E1 */
    public final void mo54843E1(C7420a aVar, StringBuilder sb) {
        h85 J;
        if (mo54939n0() && (J = aVar.mo51315J()) != null) {
            sb.append(" on ");
            xc3 type = J.getType();
            vx2.m53590f(type, "receiver.type");
            sb.append(mo54815w(type));
        }
    }

    /* renamed from: F0 */
    public boolean mo54844F0() {
        return this.f39999l.mo55017e0();
    }

    /* renamed from: F1 */
    public final void mo54845F1(StringBuilder sb, d36 d36) {
        if (vx2.m53586b(d36, x17.f45835b) || x17.m73827k(d36)) {
            sb.append("???");
        } else if (nr1.m70035o(d36)) {
            if (mo54838C0()) {
                yz6 H0 = d36.mo51134H0();
                vx2.m53589e(H0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
                sb.append(mo54919g1(((mr1) H0).mo56319h(0)));
                return;
            }
            sb.append("???");
        } else if (zc3.m74855a(d36)) {
            mo54916f1(sb, d36);
        } else if (mo54897Z1(d36)) {
            mo54931k1(sb, d36);
        } else {
            mo54916f1(sb, d36);
        }
    }

    /* renamed from: G0 */
    public boolean mo54846G0() {
        return this.f39999l.mo55018f0();
    }

    /* renamed from: G1 */
    public final void mo54847G1(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    /* renamed from: H0 */
    public boolean mo54848H0() {
        return this.f39999l.mo55019g0();
    }

    /* renamed from: H1 */
    public final void mo54849H1(if0 if0, StringBuilder sb) {
        if (!mo54852J0() && !C7389b.m60137m0(if0.mo51464n())) {
            Collection<xc3> g = if0.mo50046g().mo51811g();
            vx2.m53590f(g, "klass.typeConstructor.supertypes");
            if (g.isEmpty()) {
                return;
            }
            if (g.size() != 1 || !C7389b.m60123b0(g.iterator().next())) {
                mo54847G1(sb);
                sb.append(": ");
                CollectionsKt___CollectionsKt.m47336g0(g, sb, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new DescriptorRendererImpl$renderSuperTypes$1(this), 60, (Object) null);
            }
        }
    }

    /* renamed from: I0 */
    public boolean mo54850I0() {
        return this.f39999l.mo55020h0();
    }

    /* renamed from: I1 */
    public final void mo54851I1(C7425c cVar, StringBuilder sb) {
        mo54952s1(sb, cVar.isSuspend(), "suspend");
    }

    /* renamed from: J0 */
    public boolean mo54852J0() {
        return this.f39999l.mo55021i0();
    }

    /* renamed from: J1 */
    public final void mo54853J1(hz6 hz6, StringBuilder sb) {
        m62105W0(this, sb, hz6, (AnnotationUseSiteTarget) null, 2, (Object) null);
        fd1 visibility = hz6.getVisibility();
        vx2.m53590f(visibility, "typeAlias.visibility");
        mo54888W1(visibility, sb);
        mo54943o1(hz6, sb);
        sb.append(mo54937m1("typealias"));
        sb.append(" ");
        mo54954t1(hz6, sb, true);
        List<a17> o = hz6.mo51670o();
        vx2.m53590f(o, "typeAlias.declaredTypeParameters");
        mo54872Q1(o, sb, false);
        mo54890X0(hz6, sb);
        sb.append(" = ");
        sb.append(mo54815w(hz6.mo52332o0()));
    }

    /* renamed from: K0 */
    public boolean mo54854K0() {
        return this.f39999l.mo55022j0();
    }

    /* renamed from: K1 */
    public String mo54855K1(List<? extends f17> list) {
        vx2.m53591g(list, "typeArguments");
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(mo54868P0());
        mo54859M(sb, list);
        sb.append(mo54857L0());
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: L */
    public final void mo54856L(StringBuilder sb, d31 d31) {
        d31 b;
        String str;
        String name;
        if (!(d31 instanceof fk4) && !(d31 instanceof tk4) && (b = d31.mo51119b()) != null && !(b instanceof mx3)) {
            sb.append(" ");
            sb.append(mo54946p1("defined in"));
            sb.append(" ");
            v82 m = dd1.m56821m(b);
            vx2.m53590f(m, "getFqName(containingDeclaration)");
            if (m.mo66445e()) {
                str = "root package";
            } else {
                str = mo54813u(m);
            }
            sb.append(str);
            if (mo54848H0() && (b instanceof fk4) && (d31 instanceof j31) && (name = ((j31) d31).getSource().mo50072b().getName()) != null) {
                sb.append(" ");
                sb.append(mo54946p1("in file"));
                sb.append(" ");
                sb.append(name);
            }
        }
    }

    /* renamed from: L0 */
    public final String mo54857L0() {
        return mo54867P(">");
    }

    /* renamed from: L1 */
    public String mo54858L1(yz6 yz6) {
        boolean z;
        vx2.m53591g(yz6, "typeConstructor");
        eg0 d = yz6.mo51180d();
        boolean z2 = true;
        if (d instanceof a17) {
            z = true;
        } else {
            z = d instanceof if0;
        }
        if (!z) {
            z2 = d instanceof hz6;
        }
        if (z2) {
            return mo54900a1(d);
        }
        if (d != null) {
            throw new IllegalStateException(("Unexpected classifier: " + d.getClass()).toString());
        } else if (yz6 instanceof IntersectionTypeConstructor) {
            return ((IntersectionTypeConstructor) yz6).mo55300j(DescriptorRendererImpl$renderTypeConstructor$1.INSTANCE);
        } else {
            return yz6.toString();
        }
    }

    /* renamed from: M */
    public final void mo54859M(StringBuilder sb, List<? extends f17> list) {
        CollectionsKt___CollectionsKt.m47336g0(list, sb, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new DescriptorRendererImpl$appendTypeProjections$1(this), 60, (Object) null);
    }

    /* renamed from: M0 */
    public final boolean mo54860M0(xc3 xc3) {
        if (ce2.m56411q(xc3) || !xc3.getAnnotations().isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: M1 */
    public final void mo54861M1(StringBuilder sb, xc3 xc3, yz6 yz6) {
        pt4 a = TypeParameterUtilsKt.m60319a(xc3);
        if (a == null) {
            sb.append(mo54858L1(yz6));
            sb.append(mo54855K1(xc3.mo51132F0()));
            return;
        }
        mo54835A1(sb, a);
    }

    /* renamed from: N */
    public final String mo54862N() {
        int i = C7645b.f40003a[mo54834A0().ordinal()];
        if (i == 1) {
            return mo54867P("->");
        }
        if (i == 2) {
            return "&rarr;";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: N0 */
    public final Modality mo54863N0(ns3 ns3) {
        if0 if0;
        if (!(ns3 instanceof if0)) {
            d31 b = ns3.mo51119b();
            if (b instanceof if0) {
                if0 = (if0) b;
            } else {
                if0 = null;
            }
            if (if0 == null) {
                return Modality.FINAL;
            }
            if (!(ns3 instanceof CallableMemberDescriptor)) {
                return Modality.FINAL;
            }
            CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) ns3;
            Collection<? extends CallableMemberDescriptor> d = callableMemberDescriptor.mo51659d();
            vx2.m53590f(d, "this.overriddenDescriptors");
            if ((!d.isEmpty()) && if0.mo51326p() != Modality.FINAL) {
                return Modality.OPEN;
            }
            if (if0.getKind() != ClassKind.INTERFACE || vx2.m53586b(callableMemberDescriptor.getVisibility(), ed1.f37506a)) {
                return Modality.FINAL;
            }
            Modality p = callableMemberDescriptor.mo51326p();
            Modality modality = Modality.ABSTRACT;
            if (p == modality) {
                return modality;
            }
            return Modality.OPEN;
        } else if (((if0) ns3).getKind() == ClassKind.INTERFACE) {
            return Modality.ABSTRACT;
        } else {
            return Modality.FINAL;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0032, code lost:
        if (p000.vx2.m53586b(r7 + '?', r8) == false) goto L_0x0034;
     */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo54864O(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r1 = "?"
            java.lang.String r2 = ""
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r8
            java.lang.String r0 = p000.yb6.m74332I(r0, r1, r2, r3, r4, r5)
            boolean r0 = p000.vx2.m53586b(r7, r0)
            r1 = 0
            if (r0 != 0) goto L_0x0050
            r0 = 2
            r2 = 0
            java.lang.String r3 = "?"
            boolean r0 = p000.yb6.m74343x(r8, r3, r1, r0, r2)
            if (r0 == 0) goto L_0x0034
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r2 = 63
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            boolean r0 = p000.vx2.m53586b(r0, r8)
            if (r0 != 0) goto L_0x0050
        L_0x0034:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r2 = 40
            r0.append(r2)
            r0.append(r7)
            java.lang.String r7 = ")?"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            boolean r7 = p000.vx2.m53586b(r7, r8)
            if (r7 == 0) goto L_0x0051
        L_0x0050:
            r1 = 1
        L_0x0051:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.mo54864O(java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: O0 */
    public final boolean mo54865O0(C9460vl vlVar) {
        return vx2.m53586b(vlVar.mo53263e(), C7395c.C7396a.f39128E);
    }

    /* renamed from: O1 */
    public final void mo54866O1(a17 a17, StringBuilder sb, boolean z) {
        boolean z2;
        if (z) {
            sb.append(mo54868P0());
        }
        if (mo54844F0()) {
            sb.append("/*");
            sb.append(a17.getIndex());
            sb.append("*/ ");
        }
        mo54952s1(sb, a17.mo50050u(), "reified");
        String label = a17.mo50049j().getLabel();
        boolean z3 = true;
        if (label.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        mo54952s1(sb, z2, label);
        m62105W0(this, sb, a17, (AnnotationUseSiteTarget) null, 2, (Object) null);
        mo54954t1(a17, sb, z);
        int size = a17.getUpperBounds().size();
        if ((size > 1 && !z) || size == 1) {
            xc3 next = a17.getUpperBounds().iterator().next();
            if (!C7389b.m60133i0(next)) {
                sb.append(" : ");
                vx2.m53590f(next, "upperBound");
                sb.append(mo54815w(next));
            }
        } else if (z) {
            for (xc3 next2 : a17.getUpperBounds()) {
                if (!C7389b.m60133i0(next2)) {
                    if (z3) {
                        sb.append(" : ");
                    } else {
                        sb.append(" & ");
                    }
                    vx2.m53590f(next2, "upperBound");
                    sb.append(mo54815w(next2));
                    z3 = false;
                }
            }
        }
        if (z) {
            sb.append(mo54857L0());
        }
    }

    /* renamed from: P */
    public final String mo54867P(String str) {
        return mo54834A0().escape(str);
    }

    /* renamed from: P0 */
    public final String mo54868P0() {
        return mo54867P("<");
    }

    /* renamed from: P1 */
    public final void mo54869P1(StringBuilder sb, List<? extends a17> list) {
        Iterator<? extends a17> it = list.iterator();
        while (it.hasNext()) {
            mo54866O1((a17) it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    /* renamed from: Q */
    public boolean mo54870Q() {
        return this.f39999l.mo55027r();
    }

    /* renamed from: Q0 */
    public final boolean mo54871Q0(CallableMemberDescriptor callableMemberDescriptor) {
        return !callableMemberDescriptor.mo51659d().isEmpty();
    }

    /* renamed from: Q1 */
    public final void mo54872Q1(List<? extends a17> list, StringBuilder sb, boolean z) {
        if (!mo54854K0() && (!list.isEmpty())) {
            sb.append(mo54868P0());
            mo54869P1(sb, list);
            sb.append(mo54857L0());
            if (z) {
                sb.append(" ");
            }
        }
    }

    /* renamed from: R */
    public boolean mo54873R() {
        return this.f39999l.mo55028s();
    }

    /* renamed from: R0 */
    public final void mo54874R0(StringBuilder sb, C7864m5 m5Var) {
        RenderingFormat A0 = mo54834A0();
        RenderingFormat renderingFormat = RenderingFormat.HTML;
        if (A0 == renderingFormat) {
            sb.append("<font color=\"808080\"><i>");
        }
        sb.append(" /* = ");
        mo54958v1(sb, m5Var.mo56125C());
        sb.append(" */");
        if (mo54834A0() == renderingFormat) {
            sb.append("</i></font>");
        }
    }

    /* renamed from: R1 */
    public final void mo54875R1(o87 o87, StringBuilder sb, boolean z) {
        String str;
        if (z || !(o87 instanceof n87)) {
            if (o87.mo51761I()) {
                str = "var";
            } else {
                str = "val";
            }
            sb.append(mo54937m1(str));
            sb.append(" ");
        }
    }

    /* renamed from: S */
    public rc2<C9460vl, Boolean> mo54876S() {
        return this.f39999l.mo55029t();
    }

    /* renamed from: S0 */
    public final void mo54877S0(C7427d dVar, StringBuilder sb) {
        mo54943o1(dVar, sb);
    }

    /* renamed from: T */
    public boolean mo54878T() {
        return this.f39999l.mo55030u();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0041  */
    /* renamed from: T0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo54879T0(kotlin.reflect.jvm.internal.impl.descriptors.C7425c r6, java.lang.StringBuilder r7) {
        /*
            r5 = this;
            boolean r0 = r6.isOperator()
            java.lang.String r1 = "functionDescriptor.overriddenDescriptors"
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x003a
            java.util.Collection r0 = r6.mo51659d()
            p000.vx2.m53590f(r0, r1)
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x0019
        L_0x0017:
            r0 = r3
            goto L_0x0030
        L_0x0019:
            java.util.Iterator r0 = r0.iterator()
        L_0x001d:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0017
            java.lang.Object r4 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.c r4 = (kotlin.reflect.jvm.internal.impl.descriptors.C7425c) r4
            boolean r4 = r4.isOperator()
            if (r4 == 0) goto L_0x001d
            r0 = r2
        L_0x0030:
            if (r0 != 0) goto L_0x0038
            boolean r0 = r5.mo54873R()
            if (r0 == 0) goto L_0x003a
        L_0x0038:
            r0 = r3
            goto L_0x003b
        L_0x003a:
            r0 = r2
        L_0x003b:
            boolean r4 = r6.isInfix()
            if (r4 == 0) goto L_0x0070
            java.util.Collection r4 = r6.mo51659d()
            p000.vx2.m53590f(r4, r1)
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L_0x0050
        L_0x004e:
            r1 = r3
            goto L_0x0067
        L_0x0050:
            java.util.Iterator r1 = r4.iterator()
        L_0x0054:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x004e
            java.lang.Object r4 = r1.next()
            kotlin.reflect.jvm.internal.impl.descriptors.c r4 = (kotlin.reflect.jvm.internal.impl.descriptors.C7425c) r4
            boolean r4 = r4.isInfix()
            if (r4 == 0) goto L_0x0054
            r1 = r2
        L_0x0067:
            if (r1 != 0) goto L_0x006f
            boolean r1 = r5.mo54873R()
            if (r1 == 0) goto L_0x0070
        L_0x006f:
            r2 = r3
        L_0x0070:
            boolean r1 = r6.mo50147y()
            java.lang.String r3 = "tailrec"
            r5.mo54952s1(r7, r1, r3)
            r5.mo54851I1(r6, r7)
            boolean r6 = r6.isInline()
            java.lang.String r1 = "inline"
            r5.mo54952s1(r7, r6, r1)
            java.lang.String r6 = "infix"
            r5.mo54952s1(r7, r2, r6)
            java.lang.String r6 = "operator"
            r5.mo54952s1(r7, r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.mo54879T0(kotlin.reflect.jvm.internal.impl.descriptors.c, java.lang.StringBuilder):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008e, code lost:
        if (r11 != false) goto L_0x0092;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: T1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo54880T1(p000.n87 r10, boolean r11, java.lang.StringBuilder r12, boolean r13) {
        /*
            r9 = this;
            if (r13 == 0) goto L_0x0010
            java.lang.String r0 = "value-parameter"
            java.lang.String r0 = r9.mo54937m1(r0)
            r12.append(r0)
            java.lang.String r0 = " "
            r12.append(r0)
        L_0x0010:
            boolean r0 = r9.mo54844F0()
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = "/*"
            r12.append(r0)
            int r0 = r10.getIndex()
            r12.append(r0)
            java.lang.String r0 = "*/ "
            r12.append(r0)
        L_0x0027:
            r4 = 0
            r5 = 2
            r6 = 0
            r1 = r9
            r2 = r12
            r3 = r10
            m62105W0(r1, r2, r3, r4, r5, r6)
            boolean r0 = r10.mo53316m0()
            java.lang.String r1 = "crossinline"
            r9.mo54952s1(r12, r0, r1)
            boolean r0 = r10.mo53315k0()
            java.lang.String r1 = "noinline"
            r9.mo54952s1(r12, r0, r1)
            boolean r0 = r9.mo54955u0()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0065
            kotlin.reflect.jvm.internal.impl.descriptors.a r0 = r10.mo51119b()
            boolean r3 = r0 instanceof p000.ef0
            if (r3 == 0) goto L_0x0055
            ef0 r0 = (p000.ef0) r0
            goto L_0x0056
        L_0x0055:
            r0 = 0
        L_0x0056:
            if (r0 == 0) goto L_0x0060
            boolean r0 = r0.mo51657W()
            if (r0 != r1) goto L_0x0060
            r0 = r1
            goto L_0x0061
        L_0x0060:
            r0 = r2
        L_0x0061:
            if (r0 == 0) goto L_0x0065
            r8 = r1
            goto L_0x0066
        L_0x0065:
            r8 = r2
        L_0x0066:
            if (r8 == 0) goto L_0x0071
            boolean r0 = r9.mo54870Q()
            java.lang.String r3 = "actual"
            r9.mo54952s1(r12, r0, r3)
        L_0x0071:
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r3.mo54886V1(r4, r5, r6, r7, r8)
            rc2 r11 = r9.mo54887W()
            if (r11 == 0) goto L_0x0091
            boolean r11 = r9.mo54926j()
            if (r11 == 0) goto L_0x008a
            boolean r11 = r10.mo53318v0()
            goto L_0x008e
        L_0x008a:
            boolean r11 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.m62440a(r10)
        L_0x008e:
            if (r11 == 0) goto L_0x0091
            goto L_0x0092
        L_0x0091:
            r1 = r2
        L_0x0092:
            if (r1 == 0) goto L_0x00b5
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = " = "
            r11.append(r13)
            rc2 r13 = r9.mo54887W()
            p000.vx2.m53588d(r13)
            java.lang.Object r10 = r13.invoke(r10)
            java.lang.String r10 = (java.lang.String) r10
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r12.append(r10)
        L_0x00b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.mo54880T1(n87, boolean, java.lang.StringBuilder, boolean):void");
    }

    /* renamed from: U */
    public boolean mo54881U() {
        return this.f39999l.mo55031v();
    }

    /* renamed from: U0 */
    public final List<String> mo54882U0(C9460vl vlVar) {
        if0 if0;
        String str;
        ef0 z;
        List<n87> f;
        Map<r24, fq0<?>> f2 = vlVar.mo53264f();
        List list = null;
        if (mo54949r0()) {
            if0 = DescriptorUtilsKt.m62444e(vlVar);
        } else {
            if0 = null;
        }
        if (!(if0 == null || (z = if0.mo52355z()) == null || (f = z.mo51763f()) == null)) {
            ArrayList<n87> arrayList = new ArrayList<>();
            for (T next : f) {
                if (((n87) next).mo53318v0()) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(dk0.m43495u(arrayList, 10));
            for (n87 name : arrayList) {
                arrayList2.add(name.getName());
            }
            list = arrayList2;
        }
        if (list == null) {
            list = ck0.m33062j();
        }
        ArrayList<r24> arrayList3 = new ArrayList<>();
        for (Object next2 : list) {
            r24 r24 = (r24) next2;
            vx2.m53590f(r24, "it");
            if (!f2.containsKey(r24)) {
                arrayList3.add(next2);
            }
        }
        ArrayList arrayList4 = new ArrayList(dk0.m43495u(arrayList3, 10));
        for (r24 d : arrayList3) {
            arrayList4.add(d.mo65594d() + " = ...");
        }
        Set<Map.Entry<r24, fq0<?>>> entrySet = f2.entrySet();
        ArrayList arrayList5 = new ArrayList(dk0.m43495u(entrySet, 10));
        for (Map.Entry entry : entrySet) {
            r24 r242 = (r24) entry.getKey();
            fq0 fq0 = (fq0) entry.getValue();
            StringBuilder sb = new StringBuilder();
            sb.append(r242.mo65594d());
            sb.append(" = ");
            if (!list.contains(r242)) {
                str = mo54907c1(fq0);
            } else {
                str = "...";
            }
            sb.append(str);
            arrayList5.add(sb.toString());
        }
        return CollectionsKt___CollectionsKt.m47303C0(CollectionsKt___CollectionsKt.m47350u0(arrayList4, arrayList5));
    }

    /* renamed from: U1 */
    public final void mo54883U1(Collection<? extends n87> collection, boolean z, StringBuilder sb) {
        boolean a2 = mo54901a2(z);
        int size = collection.size();
        mo54842E0().mo54821b(size, sb);
        int i = 0;
        for (n87 n87 : collection) {
            mo54842E0().mo54823d(n87, i, size, sb);
            mo54880T1(n87, a2, sb, false);
            mo54842E0().mo54820a(n87, i, size, sb);
            i++;
        }
        mo54842E0().mo54822c(size, sb);
    }

    /* renamed from: V */
    public gg0 mo54884V() {
        return this.f39999l.mo55032w();
    }

    /* renamed from: V0 */
    public final void mo54885V0(StringBuilder sb, C7903ml mlVar, AnnotationUseSiteTarget annotationUseSiteTarget) {
        Set<u82> set;
        if (mo54915f0().contains(DescriptorRendererModifier.ANNOTATIONS)) {
            if (mlVar instanceof xc3) {
                set = mo54923i();
            } else {
                set = mo54892Y();
            }
            rc2<C9460vl, Boolean> S = mo54876S();
            for (C9460vl vlVar : mlVar.getAnnotations()) {
                if (!CollectionsKt___CollectionsKt.m47320R(set, vlVar.mo53263e()) && !mo54865O0(vlVar)) {
                    if (S == null || S.invoke(vlVar).booleanValue()) {
                        sb.append(mo54811r(vlVar, annotationUseSiteTarget));
                        if (mo54889X()) {
                            sb.append(10);
                            vx2.m53590f(sb, "append('\\n')");
                        } else {
                            sb.append(" ");
                        }
                    }
                }
            }
        }
    }

    /* renamed from: V1 */
    public final void mo54886V1(o87 o87, boolean z, StringBuilder sb, boolean z2, boolean z3) {
        n87 n87;
        xc3 xc3;
        boolean z4;
        xc3 type = o87.getType();
        vx2.m53590f(type, "variable.type");
        xc3 xc32 = null;
        if (o87 instanceof n87) {
            n87 = (n87) o87;
        } else {
            n87 = null;
        }
        if (n87 != null) {
            xc32 = n87.mo53317q0();
        }
        if (xc32 == null) {
            xc3 = type;
        } else {
            xc3 = xc32;
        }
        if (xc32 != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        mo54952s1(sb, z4, "vararg");
        if (z3 || (z2 && !mo54965z0())) {
            mo54875R1(o87, sb, z3);
        }
        if (z) {
            mo54954t1(o87, sb, z2);
            sb.append(": ");
        }
        sb.append(mo54815w(xc3));
        mo54934l1(o87, sb);
        if (mo54844F0() && xc32 != null) {
            sb.append(" /*");
            sb.append(mo54815w(type));
            sb.append("*/");
        }
    }

    /* renamed from: W */
    public rc2<n87, String> mo54887W() {
        return this.f39999l.mo55033x();
    }

    /* renamed from: W1 */
    public final boolean mo54888W1(fd1 fd1, StringBuilder sb) {
        if (!mo54915f0().contains(DescriptorRendererModifier.VISIBILITY)) {
            return false;
        }
        if (mo54918g0()) {
            fd1 = fd1.mo51644f();
        }
        if (!mo54953t0() && vx2.m53586b(fd1, ed1.f37517l)) {
            return false;
        }
        sb.append(mo54937m1(fd1.mo51642c()));
        sb.append(" ");
        return true;
    }

    /* renamed from: X */
    public boolean mo54889X() {
        return this.f39999l.mo55034y();
    }

    /* renamed from: X0 */
    public final void mo54890X0(fg0 fg0, StringBuilder sb) {
        List<a17> o = fg0.mo51670o();
        vx2.m53590f(o, "classifier.declaredTypeParameters");
        List<a17> parameters = fg0.mo50046g().getParameters();
        vx2.m53590f(parameters, "classifier.typeConstructor.parameters");
        if (mo54844F0() && fg0.mo51669i() && parameters.size() > o.size()) {
            sb.append(" /*captured type parameters: ");
            mo54869P1(sb, parameters.subList(o.size(), parameters.size()));
            sb.append("*/");
        }
    }

    /* renamed from: X1 */
    public final void mo54891X1(List<? extends a17> list, StringBuilder sb) {
        if (!mo54854K0()) {
            ArrayList arrayList = new ArrayList(0);
            for (a17 a17 : list) {
                List<xc3> upperBounds = a17.getUpperBounds();
                vx2.m53590f(upperBounds, "typeParameter.upperBounds");
                for (T t : CollectionsKt___CollectionsKt.m47323T(upperBounds, 1)) {
                    StringBuilder sb2 = new StringBuilder();
                    r24 name = a17.getName();
                    vx2.m53590f(name, "typeParameter.name");
                    sb2.append(mo54814v(name, false));
                    sb2.append(" : ");
                    vx2.m53590f(t, "it");
                    sb2.append(mo54815w(t));
                    arrayList.add(sb2.toString());
                }
            }
            if (!arrayList.isEmpty()) {
                sb.append(" ");
                sb.append(mo54937m1("where"));
                sb.append(" ");
                CollectionsKt___CollectionsKt.m47336g0(arrayList, sb, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (rc2) null, 124, (Object) null);
            }
        }
    }

    /* renamed from: Y */
    public Set<u82> mo54892Y() {
        return this.f39999l.mo55035z();
    }

    /* renamed from: Y0 */
    public final void mo54893Y0(if0 if0, StringBuilder sb) {
        boolean z;
        ef0 z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        if (if0.getKind() == ClassKind.ENUM_ENTRY) {
            z = true;
        } else {
            z = false;
        }
        if (!mo54965z0()) {
            m62105W0(this, sb, if0, (AnnotationUseSiteTarget) null, 2, (Object) null);
            List<h85> U = if0.mo52463U();
            vx2.m53590f(U, "klass.contextReceivers");
            mo54913e1(U, sb);
            if (!z) {
                fd1 visibility = if0.getVisibility();
                vx2.m53590f(visibility, "klass.visibility");
                mo54888W1(visibility, sb);
            }
            if (!(if0.getKind() == ClassKind.INTERFACE && if0.mo51326p() == Modality.ABSTRACT) && (!if0.getKind().isSingleton() || if0.mo51326p() != Modality.FINAL)) {
                Modality p = if0.mo51326p();
                vx2.m53590f(p, "klass.modality");
                mo54948q1(p, sb, mo54863N0(if0));
            }
            mo54943o1(if0, sb);
            if (!mo54915f0().contains(DescriptorRendererModifier.INNER) || !if0.mo51669i()) {
                z3 = false;
            } else {
                z3 = true;
            }
            mo54952s1(sb, z3, "inner");
            if (!mo54915f0().contains(DescriptorRendererModifier.DATA) || !if0.mo52338C0()) {
                z4 = false;
            } else {
                z4 = true;
            }
            mo54952s1(sb, z4, "data");
            if (!mo54915f0().contains(DescriptorRendererModifier.INLINE) || !if0.isInline()) {
                z5 = false;
            } else {
                z5 = true;
            }
            mo54952s1(sb, z5, "inline");
            if (!mo54915f0().contains(DescriptorRendererModifier.VALUE) || !if0.mo52352q()) {
                z6 = false;
            } else {
                z6 = true;
            }
            mo54952s1(sb, z6, "value");
            if (!mo54915f0().contains(DescriptorRendererModifier.FUN) || !if0.mo52346Y()) {
                z7 = false;
            } else {
                z7 = true;
            }
            mo54952s1(sb, z7, "fun");
            mo54896Z0(if0, sb);
        }
        if (!dd1.m56832x(if0)) {
            if (!mo54965z0()) {
                mo54847G1(sb);
            }
            mo54954t1(if0, sb, true);
        } else {
            mo54904b1(if0, sb);
        }
        if (!z) {
            List<a17> o = if0.mo51670o();
            vx2.m53590f(o, "klass.declaredTypeParameters");
            mo54872Q1(o, sb, false);
            mo54890X0(if0, sb);
            if (!if0.getKind().isSingleton() && mo54881U() && (z2 = if0.mo52355z()) != null) {
                sb.append(" ");
                m62105W0(this, sb, z2, (AnnotationUseSiteTarget) null, 2, (Object) null);
                fd1 visibility2 = z2.getVisibility();
                vx2.m53590f(visibility2, "primaryConstructor.visibility");
                mo54888W1(visibility2, sb);
                sb.append(mo54937m1("constructor"));
                List<n87> f = z2.mo51763f();
                vx2.m53590f(f, "primaryConstructor.valueParameters");
                mo54883U1(f, z2.mo51318a0(), sb);
            }
            mo54849H1(if0, sb);
            mo54891X1(o, sb);
        }
    }

    /* renamed from: Y1 */
    public final String mo54894Y1(String str, String str2, String str3, String str4, String str5) {
        if (yb6.m74336M(str, str2, false, 2, (Object) null) && yb6.m74336M(str3, str4, false, 2, (Object) null)) {
            String substring = str.substring(str2.length());
            vx2.m53590f(substring, "this as java.lang.String).substring(startIndex)");
            String substring2 = str3.substring(str4.length());
            vx2.m53590f(substring2, "this as java.lang.String).substring(startIndex)");
            String str6 = str5 + substring;
            if (vx2.m53586b(substring, substring2)) {
                return str6;
            }
            if (mo54864O(substring, substring2)) {
                return str6 + '!';
            }
        }
        return null;
    }

    /* renamed from: Z */
    public final DescriptorRendererImpl mo54895Z() {
        return (DescriptorRendererImpl) this.f40000m.getValue();
    }

    /* renamed from: Z0 */
    public final void mo54896Z0(if0 if0, StringBuilder sb) {
        sb.append(mo54937m1(DescriptorRenderer.f39986a.mo54818a(if0)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: Z1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo54897Z1(p000.xc3 r4) {
        /*
            r3 = this;
            boolean r0 = p000.ce2.m56409o(r4)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0032
            java.util.List r4 = r4.mo51132F0()
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0018
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0018
        L_0x0016:
            r4 = r2
            goto L_0x002f
        L_0x0018:
            java.util.Iterator r4 = r4.iterator()
        L_0x001c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r4.next()
            f17 r0 = (p000.f17) r0
            boolean r0 = r0.mo51408b()
            if (r0 == 0) goto L_0x001c
            r4 = r1
        L_0x002f:
            if (r4 == 0) goto L_0x0032
            r1 = r2
        L_0x0032:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.mo54897Z1(xc3):boolean");
    }

    /* renamed from: a */
    public void mo54898a(boolean z) {
        this.f39999l.mo54898a(z);
    }

    /* renamed from: a0 */
    public boolean mo54899a0() {
        return this.f39999l.mo54987A();
    }

    /* renamed from: a1 */
    public String mo54900a1(eg0 eg0) {
        vx2.m53591g(eg0, "klass");
        if (nr1.m70034m(eg0)) {
            return eg0.mo50046g().toString();
        }
        return mo54884V().mo51918a(eg0, this);
    }

    /* renamed from: a2 */
    public final boolean mo54901a2(boolean z) {
        int i = C7645b.f40004b[mo54927j0().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return false;
                }
                throw new NoWhenBranchMatchedException();
            } else if (z) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public void mo54902b(ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        vx2.m53591g(parameterNameRenderingPolicy, "<set-?>");
        this.f39999l.mo54902b(parameterNameRenderingPolicy);
    }

    /* renamed from: b0 */
    public boolean mo54903b0() {
        return this.f39999l.mo54988B();
    }

    /* renamed from: b1 */
    public final void mo54904b1(d31 d31, StringBuilder sb) {
        if (mo54942o0()) {
            if (mo54965z0()) {
                sb.append("companion object");
            }
            mo54847G1(sb);
            d31 b = d31.mo51119b();
            if (b != null) {
                sb.append("of ");
                r24 name = b.getName();
                vx2.m53590f(name, "containingDeclaration.name");
                sb.append(mo54814v(name, false));
            }
        }
        if (mo54844F0() || !vx2.m53586b(d31.getName(), n66.f41105d)) {
            if (!mo54965z0()) {
                mo54847G1(sb);
            }
            r24 name2 = d31.getName();
            vx2.m53590f(name2, "descriptor.name");
            sb.append(mo54814v(name2, true));
        }
    }

    /* renamed from: c */
    public void mo54905c(boolean z) {
        this.f39999l.mo54905c(z);
    }

    /* renamed from: c0 */
    public boolean mo54906c0() {
        return this.f39999l.mo54989C();
    }

    /* renamed from: c1 */
    public final String mo54907c1(fq0<?> fq0) {
        if (fq0 instanceof C9313sq) {
            return CollectionsKt___CollectionsKt.m47338i0((Iterable) ((C9313sq) fq0).mo51739b(), ", ", "{", "}", 0, (CharSequence) null, new DescriptorRendererImpl$renderConstant$1(this), 24, (Object) null);
        }
        if (fq0 instanceof C6948cm) {
            return StringsKt__StringsKt.m63114s0(DescriptorRenderer.m62073s(this, (C9460vl) ((C6948cm) fq0).mo51739b(), (AnnotationUseSiteTarget) null, 2, (Object) null), "@");
        }
        if (!(fq0 instanceof t83)) {
            return fq0.toString();
        }
        t83.C9332b bVar = (t83.C9332b) ((t83) fq0).mo51739b();
        if (bVar instanceof t83.C9332b.C9333a) {
            return ((t83.C9332b.C9333a) bVar).mo65992a() + "::class";
        } else if (bVar instanceof t83.C9332b.C9334b) {
            t83.C9332b.C9334b bVar2 = (t83.C9332b.C9334b) bVar;
            String b = bVar2.mo65997b().mo62673b().mo66195b();
            vx2.m53590f(b, "classValue.classId.asSingleFqName().asString()");
            for (int i = 0; i < bVar2.mo65996a(); i++) {
                b = "kotlin.Array<" + b + '>';
            }
            return b + "::class";
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: d */
    public boolean mo54908d() {
        return this.f39999l.mo54908d();
    }

    /* renamed from: d0 */
    public boolean mo54909d0() {
        return this.f39999l.mo54990D();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* renamed from: d1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo54910d1(kotlin.reflect.jvm.internal.impl.descriptors.C7424b r18, java.lang.StringBuilder r19) {
        /*
            r17 = this;
            r6 = r17
            r7 = r19
            r3 = 0
            r4 = 2
            r5 = 0
            r0 = r17
            r1 = r19
            r2 = r18
            m62105W0(r0, r1, r2, r3, r4, r5)
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl r0 = r6.f39999l
            boolean r0 = r0.mo55005S()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0026
            if0 r0 = r18.mo51658X()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r0 = r0.mo51326p()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r3 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.SEALED
            if (r0 == r3) goto L_0x0037
        L_0x0026:
            fd1 r0 = r18.getVisibility()
            java.lang.String r3 = "constructor.visibility"
            p000.vx2.m53590f(r0, r3)
            boolean r0 = r6.mo54888W1(r0, r7)
            if (r0 == 0) goto L_0x0037
            r0 = r2
            goto L_0x0038
        L_0x0037:
            r0 = r1
        L_0x0038:
            r17.mo54940n1(r18, r19)
            boolean r3 = r17.mo54947q0()
            if (r3 != 0) goto L_0x004c
            boolean r3 = r18.mo51657W()
            if (r3 == 0) goto L_0x004c
            if (r0 == 0) goto L_0x004a
            goto L_0x004c
        L_0x004a:
            r0 = r1
            goto L_0x004d
        L_0x004c:
            r0 = r2
        L_0x004d:
            if (r0 == 0) goto L_0x0058
            java.lang.String r3 = "constructor"
            java.lang.String r3 = r6.mo54937m1(r3)
            r7.append(r3)
        L_0x0058:
            fg0 r3 = r18.mo51119b()
            java.lang.String r4 = "constructor.containingDeclaration"
            p000.vx2.m53590f(r3, r4)
            boolean r4 = r17.mo54961x0()
            java.lang.String r5 = "constructor.typeParameters"
            if (r4 == 0) goto L_0x007d
            if (r0 == 0) goto L_0x0070
            java.lang.String r0 = " "
            r7.append(r0)
        L_0x0070:
            r6.mo54954t1(r3, r7, r2)
            java.util.List r0 = r18.getTypeParameters()
            p000.vx2.m53590f(r0, r5)
            r6.mo54872Q1(r0, r7, r1)
        L_0x007d:
            java.util.List r0 = r18.mo51763f()
            java.lang.String r4 = "constructor.valueParameters"
            p000.vx2.m53590f(r0, r4)
            boolean r4 = r18.mo51318a0()
            r6.mo54883U1(r0, r4, r7)
            boolean r0 = r17.mo54945p0()
            if (r0 == 0) goto L_0x0103
            boolean r0 = r18.mo51657W()
            if (r0 != 0) goto L_0x0103
            boolean r0 = r3 instanceof p000.if0
            if (r0 == 0) goto L_0x0103
            if0 r3 = (p000.if0) r3
            ef0 r0 = r3.mo52355z()
            if (r0 == 0) goto L_0x0103
            java.util.List r0 = r0.mo51763f()
            java.lang.String r3 = "primaryConstructor.valueParameters"
            p000.vx2.m53590f(r0, r3)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x00b7:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00d9
            java.lang.Object r3 = r0.next()
            r4 = r3
            n87 r4 = (p000.n87) r4
            boolean r9 = r4.mo53318v0()
            if (r9 != 0) goto L_0x00d2
            xc3 r4 = r4.mo53317q0()
            if (r4 != 0) goto L_0x00d2
            r4 = r2
            goto L_0x00d3
        L_0x00d2:
            r4 = r1
        L_0x00d3:
            if (r4 == 0) goto L_0x00b7
            r8.add(r3)
            goto L_0x00b7
        L_0x00d9:
            boolean r0 = r8.isEmpty()
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x0103
            java.lang.String r0 = " : "
            r7.append(r0)
            java.lang.String r0 = "this"
            java.lang.String r0 = r6.mo54937m1(r0)
            r7.append(r0)
            r12 = 0
            r13 = 0
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$renderConstructor$1 r14 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$renderConstructor$1.INSTANCE
            r15 = 24
            r16 = 0
            java.lang.String r9 = ", "
            java.lang.String r10 = "("
            java.lang.String r11 = ")"
            java.lang.String r0 = kotlin.collections.CollectionsKt___CollectionsKt.m47338i0(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r7.append(r0)
        L_0x0103:
            boolean r0 = r17.mo54961x0()
            if (r0 == 0) goto L_0x0113
            java.util.List r0 = r18.getTypeParameters()
            p000.vx2.m53590f(r0, r5)
            r6.mo54891X1(r0, r7)
        L_0x0113:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.mo54910d1(kotlin.reflect.jvm.internal.impl.descriptors.b, java.lang.StringBuilder):void");
    }

    /* renamed from: e */
    public void mo54911e(gg0 gg0) {
        vx2.m53591g(gg0, "<set-?>");
        this.f39999l.mo54911e(gg0);
    }

    /* renamed from: e0 */
    public boolean mo54912e0() {
        return this.f39999l.mo54991E();
    }

    /* renamed from: e1 */
    public final void mo54913e1(List<? extends h85> list, StringBuilder sb) {
        if (!list.isEmpty()) {
            sb.append("context(");
            int i = 0;
            for (h85 h85 : list) {
                int i2 = i + 1;
                mo54885V0(sb, h85, AnnotationUseSiteTarget.RECEIVER);
                xc3 type = h85.getType();
                vx2.m53590f(type, "contextReceiver.type");
                sb.append(mo54922h1(type));
                if (i == ck0.m33064l(list)) {
                    sb.append(") ");
                } else {
                    sb.append(", ");
                }
                i = i2;
            }
        }
    }

    /* renamed from: f */
    public void mo54914f(boolean z) {
        this.f39999l.mo54914f(z);
    }

    /* renamed from: f0 */
    public Set<DescriptorRendererModifier> mo54915f0() {
        return this.f39999l.mo54992F();
    }

    /* renamed from: f1 */
    public final void mo54916f1(StringBuilder sb, xc3 xc3) {
        eb1 eb1;
        m62105W0(this, sb, xc3, (AnnotationUseSiteTarget) null, 2, (Object) null);
        d36 d36 = null;
        if (xc3 instanceof eb1) {
            eb1 = (eb1) xc3;
        } else {
            eb1 = null;
        }
        if (eb1 != null) {
            d36 = eb1.mo51433T0();
        }
        if (zc3.m74855a(xc3)) {
            if (TypeUtilsKt.m62962r(xc3) && mo54933l0()) {
                sb.append(((lr1) xc3).mo55967Q0());
            } else if (!(xc3 instanceof lr1) || mo54912e0()) {
                sb.append(xc3.mo51134H0().toString());
            } else {
                sb.append(((lr1) xc3).mo55967Q0());
            }
            sb.append(mo54855K1(xc3.mo51132F0()));
        } else if (xc3 instanceof ec6) {
            sb.append(((ec6) xc3).mo51871Q0().toString());
        } else if (d36 instanceof ec6) {
            sb.append(((ec6) d36).mo51871Q0().toString());
        } else {
            m62103N1(this, sb, xc3, (yz6) null, 2, (Object) null);
        }
        if (xc3.mo51135I0()) {
            sb.append("?");
        }
        if (o66.m70163c(xc3)) {
            sb.append(" & Any");
        }
    }

    /* renamed from: g */
    public void mo54917g(boolean z) {
        this.f39999l.mo54917g(z);
    }

    /* renamed from: g0 */
    public boolean mo54918g0() {
        return this.f39999l.mo54993G();
    }

    /* renamed from: g1 */
    public final String mo54919g1(String str) {
        int i = C7645b.f40003a[mo54834A0().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i == 2) {
            return "<font color=red><b>" + str + "</b></font>";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: h */
    public void mo54920h(RenderingFormat renderingFormat) {
        vx2.m53591g(renderingFormat, "<set-?>");
        this.f39999l.mo54920h(renderingFormat);
    }

    /* renamed from: h0 */
    public final DescriptorRendererOptionsImpl mo54921h0() {
        return this.f39999l;
    }

    /* renamed from: h1 */
    public final String mo54922h1(xc3 xc3) {
        String w = mo54815w(xc3);
        if (!mo54897Z1(xc3) || x17.m73828l(xc3)) {
            return w;
        }
        return '(' + w + ')';
    }

    /* renamed from: i */
    public Set<u82> mo54923i() {
        return this.f39999l.mo54923i();
    }

    /* renamed from: i0 */
    public OverrideRenderingPolicy mo54924i0() {
        return this.f39999l.mo54994H();
    }

    /* renamed from: i1 */
    public final String mo54925i1(List<r24> list) {
        return mo54867P(rd5.m71513c(list));
    }

    /* renamed from: j */
    public boolean mo54926j() {
        return this.f39999l.mo54926j();
    }

    /* renamed from: j0 */
    public ParameterNameRenderingPolicy mo54927j0() {
        return this.f39999l.mo54995I();
    }

    /* renamed from: j1 */
    public final void mo54928j1(C7425c cVar, StringBuilder sb) {
        String str;
        if (!mo54965z0()) {
            if (!mo54963y0()) {
                m62105W0(this, sb, cVar, (AnnotationUseSiteTarget) null, 2, (Object) null);
                List<h85> s0 = cVar.mo51327s0();
                vx2.m53590f(s0, "function.contextReceiverParameters");
                mo54913e1(s0, sb);
                fd1 visibility = cVar.getVisibility();
                vx2.m53590f(visibility, "function.visibility");
                mo54888W1(visibility, sb);
                mo54950r1(cVar, sb);
                if (mo54899a0()) {
                    mo54943o1(cVar, sb);
                }
                mo54960w1(cVar, sb);
                if (mo54899a0()) {
                    mo54879T0(cVar, sb);
                } else {
                    mo54851I1(cVar, sb);
                }
                mo54940n1(cVar, sb);
                if (mo54844F0()) {
                    if (cVar.mo51328w0()) {
                        sb.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (cVar.mo51330z0()) {
                        sb.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb.append(mo54937m1("fun"));
            sb.append(" ");
            List<a17> typeParameters = cVar.getTypeParameters();
            vx2.m53590f(typeParameters, "function.typeParameters");
            mo54872Q1(typeParameters, sb, true);
            mo54841D1(cVar, sb);
        }
        mo54954t1(cVar, sb, true);
        List<n87> f = cVar.mo51763f();
        vx2.m53590f(f, "function.valueParameters");
        mo54883U1(f, cVar.mo51318a0(), sb);
        mo54843E1(cVar, sb);
        xc3 returnType = cVar.getReturnType();
        if (!mo54850I0() && (mo54840D0() || returnType == null || !C7389b.m60115B0(returnType))) {
            sb.append(": ");
            if (returnType == null) {
                str = "[NULL]";
            } else {
                str = mo54815w(returnType);
            }
            sb.append(str);
        }
        List<a17> typeParameters2 = cVar.getTypeParameters();
        vx2.m53590f(typeParameters2, "function.typeParameters");
        mo54891X1(typeParameters2, sb);
    }

    /* renamed from: k */
    public AnnotationArgumentsRenderingPolicy mo54929k() {
        return this.f39999l.mo54929k();
    }

    /* renamed from: k0 */
    public boolean mo54930k0() {
        return this.f39999l.mo54996J();
    }

    /* renamed from: k1 */
    public final void mo54931k1(StringBuilder sb, xc3 xc3) {
        boolean z;
        boolean z2;
        r24 r24;
        boolean z3;
        int length = sb.length();
        m62105W0(mo54895Z(), sb, xc3, (AnnotationUseSiteTarget) null, 2, (Object) null);
        if (sb.length() != length) {
            z = true;
        } else {
            z = false;
        }
        xc3 j = ce2.m56404j(xc3);
        List<xc3> e = ce2.m56399e(xc3);
        if (!e.isEmpty()) {
            sb.append("context(");
            for (xc3 u1 : e.subList(0, ck0.m33064l(e))) {
                mo54956u1(sb, u1);
                sb.append(", ");
            }
            mo54956u1(sb, (xc3) CollectionsKt___CollectionsKt.m47340k0(e));
            sb.append(") ");
        }
        boolean q = ce2.m56411q(xc3);
        boolean I0 = xc3.mo51135I0();
        if (I0 || (z && j != null)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (q) {
                sb.insert(length, '(');
            } else {
                if (z) {
                    wd0.m73571c(StringsKt___StringsKt.m63125a1(sb));
                    if (sb.charAt(StringsKt__StringsKt.m63094Y(sb) - 1) != ')') {
                        sb.insert(StringsKt__StringsKt.m63094Y(sb), "()");
                    }
                }
                sb.append("(");
            }
        }
        mo54952s1(sb, q, "suspend");
        if (j != null) {
            if ((!mo54897Z1(j) || j.mo51135I0()) && !mo54860M0(j)) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3) {
                sb.append("(");
            }
            mo54956u1(sb, j);
            if (z3) {
                sb.append(")");
            }
            sb.append(".");
        }
        sb.append("(");
        if (!ce2.m56407m(xc3) || xc3.mo51132F0().size() > 1) {
            int i = 0;
            for (f17 next : ce2.m56406l(xc3)) {
                int i2 = i + 1;
                if (i > 0) {
                    sb.append(", ");
                }
                if (mo54930k0()) {
                    xc3 type = next.getType();
                    vx2.m53590f(type, "typeProjection.type");
                    r24 = ce2.m56398d(type);
                } else {
                    r24 = null;
                }
                if (r24 != null) {
                    sb.append(mo54814v(r24, false));
                    sb.append(": ");
                }
                sb.append(mo54816x(next));
                i = i2;
            }
        } else {
            sb.append("???");
        }
        sb.append(") ");
        sb.append(mo54862N());
        sb.append(" ");
        mo54956u1(sb, ce2.m56405k(xc3));
        if (z2) {
            sb.append(")");
        }
        if (I0) {
            sb.append("?");
        }
    }

    /* renamed from: l */
    public void mo54932l(Set<u82> set) {
        vx2.m53591g(set, "<set-?>");
        this.f39999l.mo54932l(set);
    }

    /* renamed from: l0 */
    public boolean mo54933l0() {
        return this.f39999l.mo54997K();
    }

    /* renamed from: l1 */
    public final void mo54934l1(o87 o87, StringBuilder sb) {
        fq0<?> i0;
        if (mo54909d0() && (i0 = o87.mo51768i0()) != null) {
            sb.append(" = ");
            sb.append(mo54867P(mo54907c1(i0)));
        }
    }

    /* renamed from: m */
    public void mo54935m(Set<? extends DescriptorRendererModifier> set) {
        vx2.m53591g(set, "<set-?>");
        this.f39999l.mo54935m(set);
    }

    /* renamed from: m0 */
    public PropertyAccessorRenderingPolicy mo54936m0() {
        return this.f39999l.mo54998L();
    }

    /* renamed from: m1 */
    public final String mo54937m1(String str) {
        int i = C7645b.f40003a[mo54834A0().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        } else if (mo54878T()) {
            return str;
        } else {
            return "<b>" + str + "</b>";
        }
    }

    /* renamed from: n */
    public void mo54938n(boolean z) {
        this.f39999l.mo54938n(z);
    }

    /* renamed from: n0 */
    public boolean mo54939n0() {
        return this.f39999l.mo54999M();
    }

    /* renamed from: n1 */
    public final void mo54940n1(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb) {
        if (mo54915f0().contains(DescriptorRendererModifier.MEMBER_KIND) && mo54844F0() && callableMemberDescriptor.getKind() != CallableMemberDescriptor.Kind.DECLARATION) {
            sb.append("/*");
            sb.append(hb0.m58518f(callableMemberDescriptor.getKind().name()));
            sb.append("*/ ");
        }
    }

    /* renamed from: o */
    public void mo54941o(boolean z) {
        this.f39999l.mo54941o(z);
    }

    /* renamed from: o0 */
    public boolean mo54942o0() {
        return this.f39999l.mo55000N();
    }

    /* renamed from: o1 */
    public final void mo54943o1(ns3 ns3, StringBuilder sb) {
        boolean z;
        mo54952s1(sb, ns3.isExternal(), "external");
        boolean z2 = true;
        if (!mo54915f0().contains(DescriptorRendererModifier.EXPECT) || !ns3.mo51319d0()) {
            z = false;
        } else {
            z = true;
        }
        mo54952s1(sb, z, "expect");
        if (!mo54915f0().contains(DescriptorRendererModifier.ACTUAL) || !ns3.mo51317T()) {
            z2 = false;
        }
        mo54952s1(sb, z2, "actual");
    }

    /* renamed from: p */
    public void mo54944p(boolean z) {
        this.f39999l.mo54944p(z);
    }

    /* renamed from: p0 */
    public boolean mo54945p0() {
        return this.f39999l.mo55001O();
    }

    /* renamed from: p1 */
    public String mo54946p1(String str) {
        vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
        int i = C7645b.f40003a[mo54834A0().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i == 2) {
            return "<i>" + str + "</i>";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: q */
    public String mo54810q(d31 d31) {
        vx2.m53591g(d31, "declarationDescriptor");
        StringBuilder sb = new StringBuilder();
        d31.mo51120j0(new C7643a(), sb);
        if (mo54846G0()) {
            mo54856L(sb, d31);
        }
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: q0 */
    public boolean mo54947q0() {
        return this.f39999l.mo55002P();
    }

    /* renamed from: q1 */
    public final void mo54948q1(Modality modality, StringBuilder sb, Modality modality2) {
        if (mo54951s0() || modality != modality2) {
            mo54952s1(sb, mo54915f0().contains(DescriptorRendererModifier.MODALITY), hb0.m58518f(modality.name()));
        }
    }

    /* renamed from: r */
    public String mo54811r(C9460vl vlVar, AnnotationUseSiteTarget annotationUseSiteTarget) {
        vx2.m53591g(vlVar, "annotation");
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (annotationUseSiteTarget != null) {
            sb.append(annotationUseSiteTarget.getRenderName() + ':');
        }
        xc3 type = vlVar.getType();
        sb.append(mo54815w(type));
        if (mo54903b0()) {
            List<String> U0 = mo54882U0(vlVar);
            if (mo54906c0() || (!U0.isEmpty())) {
                CollectionsKt___CollectionsKt.m47336g0(U0, sb, ", ", "(", ")", 0, (CharSequence) null, (rc2) null, 112, (Object) null);
            }
        }
        if (mo54844F0() && (zc3.m74855a(type) || (type.mo51134H0().mo51180d() instanceof NotFoundClasses.C7415b))) {
            sb.append(" /* annotation class not found */");
        }
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: r0 */
    public boolean mo54949r0() {
        return this.f39999l.mo55003Q();
    }

    /* renamed from: r1 */
    public final void mo54950r1(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb) {
        if (dd1.m56805J(callableMemberDescriptor) && callableMemberDescriptor.mo51326p() == Modality.FINAL) {
            return;
        }
        if (mo54924i0() != OverrideRenderingPolicy.RENDER_OVERRIDE || callableMemberDescriptor.mo51326p() != Modality.OPEN || !mo54871Q0(callableMemberDescriptor)) {
            Modality p = callableMemberDescriptor.mo51326p();
            vx2.m53590f(p, "callable.modality");
            mo54948q1(p, sb, mo54863N0(callableMemberDescriptor));
        }
    }

    /* renamed from: s0 */
    public boolean mo54951s0() {
        return this.f39999l.mo55004R();
    }

    /* renamed from: s1 */
    public final void mo54952s1(StringBuilder sb, boolean z, String str) {
        if (z) {
            sb.append(mo54937m1(str));
            sb.append(" ");
        }
    }

    /* renamed from: t */
    public String mo54812t(String str, String str2, C7389b bVar) {
        String str3 = str;
        String str4 = str2;
        vx2.m53591g(str3, "lowerRendered");
        vx2.m53591g(str4, "upperRendered");
        vx2.m53591g(bVar, "builtIns");
        if (!mo54864O(str, str2)) {
            gg0 V = mo54884V();
            if0 w = bVar.mo53183w();
            vx2.m53590f(w, "builtIns.collection");
            String S0 = StringsKt__StringsKt.m63084S0(V.mo51918a(w, this), "Collection", (String) null, 2, (Object) null);
            String Y1 = mo54894Y1(str, S0 + "Mutable", str2, S0, S0 + '(' + "Mutable" + ')');
            if (Y1 != null) {
                return Y1;
            }
            String Y12 = mo54894Y1(str, S0 + "MutableMap.MutableEntry", str2, S0 + "Map.Entry", S0 + "(Mutable)Map.(Mutable)Entry");
            if (Y12 != null) {
                return Y12;
            }
            gg0 V2 = mo54884V();
            if0 j = bVar.mo53170j();
            vx2.m53590f(j, "builtIns.array");
            String S02 = StringsKt__StringsKt.m63084S0(V2.mo51918a(j, this), "Array", (String) null, 2, (Object) null);
            String Y13 = mo54894Y1(str, S02 + mo54867P("Array<"), str2, S02 + mo54867P("Array<out "), S02 + mo54867P("Array<(out) "));
            if (Y13 != null) {
                return Y13;
            }
            return '(' + str3 + ".." + str4 + ')';
        } else if (yb6.m74336M(str4, "(", false, 2, (Object) null)) {
            return '(' + str3 + ")!";
        } else {
            return str3 + '!';
        }
    }

    /* renamed from: t0 */
    public boolean mo54953t0() {
        return this.f39999l.mo55005S();
    }

    /* renamed from: t1 */
    public final void mo54954t1(d31 d31, StringBuilder sb, boolean z) {
        r24 name = d31.getName();
        vx2.m53590f(name, "descriptor.name");
        sb.append(mo54814v(name, z));
    }

    /* renamed from: u */
    public String mo54813u(v82 v82) {
        vx2.m53591g(v82, "fqName");
        List<r24> h = v82.mo66449h();
        vx2.m53590f(h, "fqName.pathSegments()");
        return mo54925i1(h);
    }

    /* renamed from: u0 */
    public boolean mo54955u0() {
        return this.f39999l.mo55006T();
    }

    /* renamed from: u1 */
    public final void mo54956u1(StringBuilder sb, xc3 xc3) {
        C7864m5 m5Var;
        w47 K0 = xc3.mo64506K0();
        if (K0 instanceof C7864m5) {
            m5Var = (C7864m5) K0;
        } else {
            m5Var = null;
        }
        if (m5Var == null) {
            mo54958v1(sb, xc3);
        } else if (mo54957v0()) {
            mo54958v1(sb, m5Var.mo56125C());
        } else {
            mo54958v1(sb, m5Var.mo56126T0());
            if (mo54959w0()) {
                mo54874R0(sb, m5Var);
            }
        }
    }

    /* renamed from: v */
    public String mo54814v(r24 r24, boolean z) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        String P = mo54867P(rd5.m71512b(r24));
        if (!mo54878T() || mo54834A0() != RenderingFormat.HTML || !z) {
            return P;
        }
        return "<b>" + P + "</b>";
    }

    /* renamed from: v0 */
    public boolean mo54957v0() {
        return this.f39999l.mo55007U();
    }

    /* renamed from: v1 */
    public final void mo54958v1(StringBuilder sb, xc3 xc3) {
        if (!(xc3 instanceof on7) || !mo54926j() || ((on7) xc3).mo55316M0()) {
            w47 K0 = xc3.mo64506K0();
            if (K0 instanceof i42) {
                sb.append(((i42) K0).mo52401R0(this, this));
            } else if (K0 instanceof d36) {
                mo54845F1(sb, (d36) K0);
            }
        } else {
            sb.append("<Not computed yet>");
        }
    }

    /* renamed from: w */
    public String mo54815w(xc3 xc3) {
        vx2.m53591g(xc3, "type");
        StringBuilder sb = new StringBuilder();
        mo54956u1(sb, mo54836B0().invoke(xc3));
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: w0 */
    public boolean mo54959w0() {
        return this.f39999l.mo55008V();
    }

    /* renamed from: w1 */
    public final void mo54960w1(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb) {
        if (mo54915f0().contains(DescriptorRendererModifier.OVERRIDE) && mo54871Q0(callableMemberDescriptor) && mo54924i0() != OverrideRenderingPolicy.RENDER_OPEN) {
            mo54952s1(sb, true, "override");
            if (mo54844F0()) {
                sb.append("/*");
                sb.append(callableMemberDescriptor.mo51659d().size());
                sb.append("*/ ");
            }
        }
    }

    /* renamed from: x */
    public String mo54816x(f17 f17) {
        vx2.m53591g(f17, "typeProjection");
        StringBuilder sb = new StringBuilder();
        mo54859M(sb, bk0.m32598e(f17));
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: x0 */
    public boolean mo54961x0() {
        return this.f39999l.mo55009W();
    }

    /* renamed from: x1 */
    public final void mo54962x1(fk4 fk4, StringBuilder sb) {
        mo54964y1(fk4.mo51711e(), "package-fragment", sb);
        if (mo54926j()) {
            sb.append(" in ");
            mo54954t1(fk4.mo51119b(), sb, false);
        }
    }

    /* renamed from: y0 */
    public boolean mo54963y0() {
        return this.f39999l.mo55010X();
    }

    /* renamed from: y1 */
    public final void mo54964y1(u82 u82, String str, StringBuilder sb) {
        boolean z;
        sb.append(mo54937m1(str));
        v82 j = u82.mo66205j();
        vx2.m53590f(j, "fqName.toUnsafe()");
        String u = mo54813u(j);
        if (u.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            sb.append(" ");
            sb.append(u);
        }
    }

    /* renamed from: z0 */
    public boolean mo54965z0() {
        return this.f39999l.mo55011Y();
    }

    /* renamed from: z1 */
    public final void mo54966z1(tk4 tk4, StringBuilder sb) {
        mo54964y1(tk4.mo53283e(), "package", sb);
        if (mo54926j()) {
            sb.append(" in context of ");
            mo54954t1(tk4.getModule(), sb, false);
        }
    }
}
