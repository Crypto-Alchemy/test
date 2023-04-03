package kotlin.reflect.jvm.internal.impl.renderer;

import java.lang.reflect.Field;
import java.util.Set;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import p000.gg0;
import p000.zc1;

/* compiled from: DescriptorRendererOptionsImpl.kt */
public final class DescriptorRendererOptionsImpl implements zc1 {

    /* renamed from: X */
    public static final /* synthetic */ i93<Object>[] f40006X;

    /* renamed from: A */
    public final p75 f40007A;

    /* renamed from: B */
    public final p75 f40008B;

    /* renamed from: C */
    public final p75 f40009C;

    /* renamed from: D */
    public final p75 f40010D;

    /* renamed from: E */
    public final p75 f40011E;

    /* renamed from: F */
    public final p75 f40012F;

    /* renamed from: G */
    public final p75 f40013G;

    /* renamed from: H */
    public final p75 f40014H;

    /* renamed from: I */
    public final p75 f40015I;

    /* renamed from: J */
    public final p75 f40016J;

    /* renamed from: K */
    public final p75 f40017K;

    /* renamed from: L */
    public final p75 f40018L;

    /* renamed from: M */
    public final p75 f40019M;

    /* renamed from: N */
    public final p75 f40020N;

    /* renamed from: O */
    public final p75 f40021O;

    /* renamed from: P */
    public final p75 f40022P;

    /* renamed from: Q */
    public final p75 f40023Q;

    /* renamed from: R */
    public final p75 f40024R;

    /* renamed from: S */
    public final p75 f40025S;

    /* renamed from: T */
    public final p75 f40026T;

    /* renamed from: U */
    public final p75 f40027U;

    /* renamed from: V */
    public final p75 f40028V;

    /* renamed from: W */
    public final p75 f40029W;

    /* renamed from: a */
    public boolean f40030a;

    /* renamed from: b */
    public final p75 f40031b = mo55025m0(gg0.C7130c.f38022a);

    /* renamed from: c */
    public final p75 f40032c;

    /* renamed from: d */
    public final p75 f40033d;

    /* renamed from: e */
    public final p75 f40034e;

    /* renamed from: f */
    public final p75 f40035f;

    /* renamed from: g */
    public final p75 f40036g;

    /* renamed from: h */
    public final p75 f40037h;

    /* renamed from: i */
    public final p75 f40038i;

    /* renamed from: j */
    public final p75 f40039j;

    /* renamed from: k */
    public final p75 f40040k;

    /* renamed from: l */
    public final p75 f40041l;

    /* renamed from: m */
    public final p75 f40042m;

    /* renamed from: n */
    public final p75 f40043n;

    /* renamed from: o */
    public final p75 f40044o;

    /* renamed from: p */
    public final p75 f40045p;

    /* renamed from: q */
    public final p75 f40046q;

    /* renamed from: r */
    public final p75 f40047r;

    /* renamed from: s */
    public final p75 f40048s;

    /* renamed from: t */
    public final p75 f40049t;

    /* renamed from: u */
    public final p75 f40050u;

    /* renamed from: v */
    public final p75 f40051v;

    /* renamed from: w */
    public final p75 f40052w;

    /* renamed from: x */
    public final p75 f40053x;

    /* renamed from: y */
    public final p75 f40054y;

    /* renamed from: z */
    public final p75 f40055z;

    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$a */
    /* compiled from: Delegates.kt */
    public static final class C7648a extends nf4<T> {

        /* renamed from: b */
        public final /* synthetic */ DescriptorRendererOptionsImpl f40056b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7648a(Object obj, DescriptorRendererOptionsImpl descriptorRendererOptionsImpl) {
            super(obj);
            this.f40056b = descriptorRendererOptionsImpl;
        }

        /* renamed from: d */
        public boolean mo46072d(i93<?> i93, T t, T t2) {
            vx2.m53591g(i93, "property");
            if (!this.f40056b.mo55023k0()) {
                return true;
            }
            throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
        }
    }

    static {
        Class<DescriptorRendererOptionsImpl> cls = DescriptorRendererOptionsImpl.class;
        f40006X = new i93[]{ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "withDefinedIn", "getWithDefinedIn()Z")), ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "modifiers", "getModifiers()Ljava/util/Set;")), ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "startFromName", "getStartFromName()Z")), ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "debugMode", "getDebugMode()Z")), ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "verbose", "getVerbose()Z")), ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "unitReturnType", "getUnitReturnType()Z")), ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "withoutReturnType", "getWithoutReturnType()Z")), ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "enhancedTypes", "getEnhancedTypes()Z")), ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "normalizedVisibilities", "getNormalizedVisibilities()Z")), ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "renderDefaultModality", "getRenderDefaultModality()Z")), ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "includePropertyConstant", "getIncludePropertyConstant()Z")), ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "withoutTypeParameters", "getWithoutTypeParameters()Z")), ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "withoutSuperTypes", "getWithoutSuperTypes()Z")), ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "receiverAfterName", "getReceiverAfterName()Z")), ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "renderTypeExpansions", "getRenderTypeExpansions()Z")), ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "renderFunctionContracts", "getRenderFunctionContracts()Z")), ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z")), ua5.m52730e(new MutablePropertyReference1Impl(ua5.m52727b(cls), "informativeErrorType", "getInformativeErrorType()Z"))};
    }

    public DescriptorRendererOptionsImpl() {
        Boolean bool = Boolean.TRUE;
        this.f40032c = mo55025m0(bool);
        this.f40033d = mo55025m0(bool);
        this.f40034e = mo55025m0(DescriptorRendererModifier.ALL_EXCEPT_ANNOTATIONS);
        Boolean bool2 = Boolean.FALSE;
        this.f40035f = mo55025m0(bool2);
        this.f40036g = mo55025m0(bool2);
        this.f40037h = mo55025m0(bool2);
        this.f40038i = mo55025m0(bool2);
        this.f40039j = mo55025m0(bool2);
        this.f40040k = mo55025m0(bool);
        this.f40041l = mo55025m0(bool2);
        this.f40042m = mo55025m0(bool2);
        this.f40043n = mo55025m0(bool2);
        this.f40044o = mo55025m0(bool);
        this.f40045p = mo55025m0(bool);
        this.f40046q = mo55025m0(bool2);
        this.f40047r = mo55025m0(bool2);
        this.f40048s = mo55025m0(bool2);
        this.f40049t = mo55025m0(bool2);
        this.f40050u = mo55025m0(bool2);
        this.f40051v = mo55025m0(bool2);
        this.f40052w = mo55025m0(bool2);
        this.f40053x = mo55025m0(DescriptorRendererOptionsImpl$typeNormalizer$2.INSTANCE);
        this.f40054y = mo55025m0(DescriptorRendererOptionsImpl$defaultParameterValueRenderer$2.INSTANCE);
        this.f40055z = mo55025m0(bool);
        this.f40007A = mo55025m0(OverrideRenderingPolicy.RENDER_OPEN);
        this.f40008B = mo55025m0(DescriptorRenderer.C7640b.C7641a.f39998a);
        this.f40009C = mo55025m0(RenderingFormat.PLAIN);
        this.f40010D = mo55025m0(ParameterNameRenderingPolicy.ALL);
        this.f40011E = mo55025m0(bool2);
        this.f40012F = mo55025m0(bool2);
        this.f40013G = mo55025m0(PropertyAccessorRenderingPolicy.DEBUG);
        this.f40014H = mo55025m0(bool2);
        this.f40015I = mo55025m0(bool2);
        this.f40016J = mo55025m0(ny5.m49095e());
        this.f40017K = mo55025m0(su1.f44605a.mo65911a());
        this.f40018L = mo55025m0((Object) null);
        this.f40019M = mo55025m0(AnnotationArgumentsRenderingPolicy.NO_ARGUMENTS);
        this.f40020N = mo55025m0(bool2);
        this.f40021O = mo55025m0(bool);
        this.f40022P = mo55025m0(bool);
        this.f40023Q = mo55025m0(bool2);
        this.f40024R = mo55025m0(bool);
        this.f40025S = mo55025m0(bool);
        this.f40026T = mo55025m0(bool2);
        this.f40027U = mo55025m0(bool2);
        this.f40028V = mo55025m0(bool2);
        this.f40029W = mo55025m0(bool);
    }

    /* renamed from: A */
    public boolean mo54987A() {
        return ((Boolean) this.f40024R.mo46023a(this, f40006X[42])).booleanValue();
    }

    /* renamed from: B */
    public boolean mo54988B() {
        return zc1.C9673a.m74853a(this);
    }

    /* renamed from: C */
    public boolean mo54989C() {
        return zc1.C9673a.m74854b(this);
    }

    /* renamed from: D */
    public boolean mo54990D() {
        return ((Boolean) this.f40050u.mo46023a(this, f40006X[19])).booleanValue();
    }

    /* renamed from: E */
    public boolean mo54991E() {
        return ((Boolean) this.f40029W.mo46023a(this, f40006X[47])).booleanValue();
    }

    /* renamed from: F */
    public Set<DescriptorRendererModifier> mo54992F() {
        return (Set) this.f40034e.mo46023a(this, f40006X[3]);
    }

    /* renamed from: G */
    public boolean mo54993G() {
        return ((Boolean) this.f40043n.mo46023a(this, f40006X[12])).booleanValue();
    }

    /* renamed from: H */
    public OverrideRenderingPolicy mo54994H() {
        return (OverrideRenderingPolicy) this.f40007A.mo46023a(this, f40006X[25]);
    }

    /* renamed from: I */
    public ParameterNameRenderingPolicy mo54995I() {
        return (ParameterNameRenderingPolicy) this.f40010D.mo46023a(this, f40006X[28]);
    }

    /* renamed from: J */
    public boolean mo54996J() {
        return ((Boolean) this.f40025S.mo46023a(this, f40006X[43])).booleanValue();
    }

    /* renamed from: K */
    public boolean mo54997K() {
        return ((Boolean) this.f40027U.mo46023a(this, f40006X[45])).booleanValue();
    }

    /* renamed from: L */
    public PropertyAccessorRenderingPolicy mo54998L() {
        return (PropertyAccessorRenderingPolicy) this.f40013G.mo46023a(this, f40006X[31]);
    }

    /* renamed from: M */
    public boolean mo54999M() {
        return ((Boolean) this.f40011E.mo46023a(this, f40006X[29])).booleanValue();
    }

    /* renamed from: N */
    public boolean mo55000N() {
        return ((Boolean) this.f40012F.mo46023a(this, f40006X[30])).booleanValue();
    }

    /* renamed from: O */
    public boolean mo55001O() {
        return ((Boolean) this.f40046q.mo46023a(this, f40006X[15])).booleanValue();
    }

    /* renamed from: P */
    public boolean mo55002P() {
        return ((Boolean) this.f40021O.mo46023a(this, f40006X[39])).booleanValue();
    }

    /* renamed from: Q */
    public boolean mo55003Q() {
        return ((Boolean) this.f40014H.mo46023a(this, f40006X[32])).booleanValue();
    }

    /* renamed from: R */
    public boolean mo55004R() {
        return ((Boolean) this.f40045p.mo46023a(this, f40006X[14])).booleanValue();
    }

    /* renamed from: S */
    public boolean mo55005S() {
        return ((Boolean) this.f40044o.mo46023a(this, f40006X[13])).booleanValue();
    }

    /* renamed from: T */
    public boolean mo55006T() {
        return ((Boolean) this.f40047r.mo46023a(this, f40006X[16])).booleanValue();
    }

    /* renamed from: U */
    public boolean mo55007U() {
        return ((Boolean) this.f40023Q.mo46023a(this, f40006X[41])).booleanValue();
    }

    /* renamed from: V */
    public boolean mo55008V() {
        return ((Boolean) this.f40022P.mo46023a(this, f40006X[40])).booleanValue();
    }

    /* renamed from: W */
    public boolean mo55009W() {
        return ((Boolean) this.f40055z.mo46023a(this, f40006X[24])).booleanValue();
    }

    /* renamed from: X */
    public boolean mo55010X() {
        return ((Boolean) this.f40036g.mo46023a(this, f40006X[5])).booleanValue();
    }

    /* renamed from: Y */
    public boolean mo55011Y() {
        return ((Boolean) this.f40035f.mo46023a(this, f40006X[4])).booleanValue();
    }

    /* renamed from: Z */
    public RenderingFormat mo55012Z() {
        return (RenderingFormat) this.f40009C.mo46023a(this, f40006X[27]);
    }

    /* renamed from: a */
    public void mo54898a(boolean z) {
        this.f40035f.mo46070b(this, f40006X[4], Boolean.valueOf(z));
    }

    /* renamed from: a0 */
    public rc2<xc3, xc3> mo55013a0() {
        return (rc2) this.f40053x.mo46023a(this, f40006X[22]);
    }

    /* renamed from: b */
    public void mo54902b(ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        vx2.m53591g(parameterNameRenderingPolicy, "<set-?>");
        this.f40010D.mo46070b(this, f40006X[28], parameterNameRenderingPolicy);
    }

    /* renamed from: b0 */
    public boolean mo55014b0() {
        return ((Boolean) this.f40049t.mo46023a(this, f40006X[18])).booleanValue();
    }

    /* renamed from: c */
    public void mo54905c(boolean z) {
        this.f40032c.mo46070b(this, f40006X[1], Boolean.valueOf(z));
    }

    /* renamed from: c0 */
    public boolean mo55015c0() {
        return ((Boolean) this.f40040k.mo46023a(this, f40006X[9])).booleanValue();
    }

    /* renamed from: d */
    public boolean mo54908d() {
        return ((Boolean) this.f40042m.mo46023a(this, f40006X[11])).booleanValue();
    }

    /* renamed from: d0 */
    public DescriptorRenderer.C7640b mo55016d0() {
        return (DescriptorRenderer.C7640b) this.f40008B.mo46023a(this, f40006X[26]);
    }

    /* renamed from: e */
    public void mo54911e(gg0 gg0) {
        vx2.m53591g(gg0, "<set-?>");
        this.f40031b.mo46070b(this, f40006X[0], gg0);
    }

    /* renamed from: e0 */
    public boolean mo55017e0() {
        return ((Boolean) this.f40039j.mo46023a(this, f40006X[8])).booleanValue();
    }

    /* renamed from: f */
    public void mo54914f(boolean z) {
        this.f40052w.mo46070b(this, f40006X[21], Boolean.valueOf(z));
    }

    /* renamed from: f0 */
    public boolean mo55018f0() {
        return ((Boolean) this.f40032c.mo46023a(this, f40006X[1])).booleanValue();
    }

    /* renamed from: g */
    public void mo54917g(boolean z) {
        this.f40011E.mo46070b(this, f40006X[29], Boolean.valueOf(z));
    }

    /* renamed from: g0 */
    public boolean mo55019g0() {
        return ((Boolean) this.f40033d.mo46023a(this, f40006X[2])).booleanValue();
    }

    /* renamed from: h */
    public void mo54920h(RenderingFormat renderingFormat) {
        vx2.m53591g(renderingFormat, "<set-?>");
        this.f40009C.mo46070b(this, f40006X[27], renderingFormat);
    }

    /* renamed from: h0 */
    public boolean mo55020h0() {
        return ((Boolean) this.f40041l.mo46023a(this, f40006X[10])).booleanValue();
    }

    /* renamed from: i */
    public Set<u82> mo54923i() {
        return (Set) this.f40017K.mo46023a(this, f40006X[35]);
    }

    /* renamed from: i0 */
    public boolean mo55021i0() {
        return ((Boolean) this.f40052w.mo46023a(this, f40006X[21])).booleanValue();
    }

    /* renamed from: j */
    public boolean mo54926j() {
        return ((Boolean) this.f40037h.mo46023a(this, f40006X[6])).booleanValue();
    }

    /* renamed from: j0 */
    public boolean mo55022j0() {
        return ((Boolean) this.f40051v.mo46023a(this, f40006X[20])).booleanValue();
    }

    /* renamed from: k */
    public AnnotationArgumentsRenderingPolicy mo54929k() {
        return (AnnotationArgumentsRenderingPolicy) this.f40019M.mo46023a(this, f40006X[37]);
    }

    /* renamed from: k0 */
    public final boolean mo55023k0() {
        return this.f40030a;
    }

    /* renamed from: l */
    public void mo54932l(Set<u82> set) {
        vx2.m53591g(set, "<set-?>");
        this.f40017K.mo46070b(this, f40006X[35], set);
    }

    /* renamed from: l0 */
    public final void mo55024l0() {
        this.f40030a = true;
    }

    /* renamed from: m */
    public void mo54935m(Set<? extends DescriptorRendererModifier> set) {
        vx2.m53591g(set, "<set-?>");
        this.f40034e.mo46070b(this, f40006X[3], set);
    }

    /* renamed from: m0 */
    public final <T> p75<DescriptorRendererOptionsImpl, T> mo55025m0(T t) {
        rb1 rb1 = rb1.f33390a;
        return new C7648a(t, this);
    }

    /* renamed from: n */
    public void mo54938n(boolean z) {
        this.f40037h.mo46070b(this, f40006X[6], Boolean.valueOf(z));
    }

    /* renamed from: o */
    public void mo54941o(boolean z) {
        this.f40012F.mo46070b(this, f40006X[30], Boolean.valueOf(z));
    }

    /* renamed from: p */
    public void mo54944p(boolean z) {
        this.f40051v.mo46070b(this, f40006X[20], Boolean.valueOf(z));
    }

    /* renamed from: q */
    public final DescriptorRendererOptionsImpl mo55026q() {
        nf4 nf4;
        boolean z;
        Class<DescriptorRendererOptionsImpl> cls = DescriptorRendererOptionsImpl.class;
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = new DescriptorRendererOptionsImpl();
        Field[] declaredFields = cls.getDeclaredFields();
        vx2.m53590f(declaredFields, "this::class.java.declaredFields");
        for (Field field : declaredFields) {
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                Object obj = field.get(this);
                if (obj instanceof nf4) {
                    nf4 = (nf4) obj;
                } else {
                    nf4 = null;
                }
                if (nf4 != null) {
                    String name = field.getName();
                    vx2.m53590f(name, "field.name");
                    yb6.m74336M(name, "is", false, 2, (Object) null);
                    q83 b = ua5.m52727b(cls);
                    String name2 = field.getName();
                    StringBuilder sb = new StringBuilder();
                    sb.append("get");
                    String name3 = field.getName();
                    vx2.m53590f(name3, "field.name");
                    if (name3.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        char upperCase = Character.toUpperCase(name3.charAt(0));
                        String substring = name3.substring(1);
                        vx2.m53590f(substring, "this as java.lang.String).substring(startIndex)");
                        name3 = upperCase + substring;
                    }
                    sb.append(name3);
                    field.set(descriptorRendererOptionsImpl, descriptorRendererOptionsImpl.mo55025m0(nf4.mo46023a(this, new PropertyReference1Impl(b, name2, sb.toString()))));
                }
            }
        }
        return descriptorRendererOptionsImpl;
    }

    /* renamed from: r */
    public boolean mo55027r() {
        return ((Boolean) this.f40048s.mo46023a(this, f40006X[17])).booleanValue();
    }

    /* renamed from: s */
    public boolean mo55028s() {
        return ((Boolean) this.f40020N.mo46023a(this, f40006X[38])).booleanValue();
    }

    /* renamed from: t */
    public rc2<C9460vl, Boolean> mo55029t() {
        return (rc2) this.f40018L.mo46023a(this, f40006X[36]);
    }

    /* renamed from: u */
    public boolean mo55030u() {
        return ((Boolean) this.f40028V.mo46023a(this, f40006X[46])).booleanValue();
    }

    /* renamed from: v */
    public boolean mo55031v() {
        return ((Boolean) this.f40038i.mo46023a(this, f40006X[7])).booleanValue();
    }

    /* renamed from: w */
    public gg0 mo55032w() {
        return (gg0) this.f40031b.mo46023a(this, f40006X[0]);
    }

    /* renamed from: x */
    public rc2<n87, String> mo55033x() {
        return (rc2) this.f40054y.mo46023a(this, f40006X[23]);
    }

    /* renamed from: y */
    public boolean mo55034y() {
        return ((Boolean) this.f40015I.mo46023a(this, f40006X[33])).booleanValue();
    }

    /* renamed from: z */
    public Set<u82> mo55035z() {
        return (Set) this.f40016J.mo46023a(this, f40006X[34]);
    }
}
