package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.C7508a;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.C7628h;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.text.StringsKt__StringsKt;
import p000.b83;
import p000.ss3;
import p000.tc3;
import p000.xx4;

/* compiled from: AbstractBinaryClassAnnotationLoader.kt */
public abstract class AbstractBinaryClassAnnotationLoader<A, S extends C7508a<? extends A>> implements C9641yl<A> {

    /* renamed from: a */
    public final nc3 f39599a;

    /* compiled from: AbstractBinaryClassAnnotationLoader.kt */
    public enum PropertyRelatedElement {
        PROPERTY,
        BACKING_FIELD,
        DELEGATE_FIELD
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader$a */
    /* compiled from: AbstractBinaryClassAnnotationLoader.kt */
    public static abstract class C7508a<A> {
        /* renamed from: a */
        public abstract Map<ss3, List<A>> mo53764a();
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader$b */
    /* compiled from: AbstractBinaryClassAnnotationLoader.kt */
    public /* synthetic */ class C7509b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39601a;

        static {
            int[] iArr = new int[AnnotatedCallableKind.values().length];
            iArr[AnnotatedCallableKind.PROPERTY_GETTER.ordinal()] = 1;
            iArr[AnnotatedCallableKind.PROPERTY_SETTER.ordinal()] = 2;
            iArr[AnnotatedCallableKind.PROPERTY.ordinal()] = 3;
            f39601a = iArr;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader$c */
    /* compiled from: AbstractBinaryClassAnnotationLoader.kt */
    public static final class C7510c implements tc3.C9343c {

        /* renamed from: a */
        public final /* synthetic */ AbstractBinaryClassAnnotationLoader<A, S> f39602a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList<A> f39603b;

        public C7510c(AbstractBinaryClassAnnotationLoader<A, S> abstractBinaryClassAnnotationLoader, ArrayList<A> arrayList) {
            this.f39602a = abstractBinaryClassAnnotationLoader;
            this.f39603b = arrayList;
        }

        /* renamed from: a */
        public void mo53770a() {
        }

        /* renamed from: b */
        public tc3.C9341a mo53771b(nf0 nf0, a66 a66) {
            vx2.m53591g(nf0, "classId");
            vx2.m53591g(a66, "source");
            return this.f39602a.mo53794y(nf0, a66, this.f39603b);
        }
    }

    public AbstractBinaryClassAnnotationLoader(nc3 nc3) {
        vx2.m53591g(nc3, "kotlinClassFinder");
        this.f39599a = nc3;
    }

    /* renamed from: n */
    public static /* synthetic */ List m61101n(AbstractBinaryClassAnnotationLoader abstractBinaryClassAnnotationLoader, xx4 xx4, ss3 ss3, boolean z, boolean z2, Boolean bool, boolean z3, int i, Object obj) {
        boolean z4;
        boolean z5;
        Boolean bool2;
        boolean z6;
        if (obj == null) {
            if ((i & 4) != 0) {
                z4 = false;
            } else {
                z4 = z;
            }
            if ((i & 8) != 0) {
                z5 = false;
            } else {
                z5 = z2;
            }
            if ((i & 16) != 0) {
                bool2 = null;
            } else {
                bool2 = bool;
            }
            if ((i & 32) != 0) {
                z6 = false;
            } else {
                z6 = z3;
            }
            return abstractBinaryClassAnnotationLoader.mo53787m(xx4, ss3, z4, z5, bool2, z6);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations");
    }

    /* renamed from: s */
    public static /* synthetic */ ss3 m61102s(AbstractBinaryClassAnnotationLoader abstractBinaryClassAnnotationLoader, C7628h hVar, t24 t24, w17 w17, AnnotatedCallableKind annotatedCallableKind, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 16) != 0) {
                z = false;
            }
            return abstractBinaryClassAnnotationLoader.mo53790r(hVar, t24, w17, annotatedCallableKind, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallableSignature");
    }

    /* renamed from: u */
    public static /* synthetic */ ss3 m61103u(AbstractBinaryClassAnnotationLoader abstractBinaryClassAnnotationLoader, ProtoBuf$Property protoBuf$Property, t24 t24, w17 w17, boolean z, boolean z2, boolean z3, int i, Object obj) {
        boolean z4;
        boolean z5;
        boolean z6;
        if (obj == null) {
            if ((i & 8) != 0) {
                z4 = false;
            } else {
                z4 = z;
            }
            if ((i & 16) != 0) {
                z5 = false;
            } else {
                z5 = z2;
            }
            if ((i & 32) != 0) {
                z6 = true;
            } else {
                z6 = z3;
            }
            return abstractBinaryClassAnnotationLoader.mo53791t(protoBuf$Property, t24, w17, z4, z5, z6);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPropertySignature");
    }

    /* renamed from: A */
    public abstract A mo52574A(ProtoBuf$Annotation protoBuf$Annotation, t24 t24);

    /* renamed from: B */
    public final tc3 mo53776B(xx4.C9612a aVar) {
        vc3 vc3;
        a66 c = aVar.mo66967c();
        if (c instanceof vc3) {
            vc3 = (vc3) c;
        } else {
            vc3 = null;
        }
        if (vc3 != null) {
            return vc3.mo66481d();
        }
        return null;
    }

    /* renamed from: a */
    public List<A> mo53777a(xx4 xx4, C7628h hVar, AnnotatedCallableKind annotatedCallableKind) {
        vx2.m53591g(xx4, "container");
        vx2.m53591g(hVar, "proto");
        vx2.m53591g(annotatedCallableKind, "kind");
        ss3 s = m61102s(this, hVar, xx4.mo66966b(), xx4.mo66968d(), annotatedCallableKind, false, 16, (Object) null);
        if (s == null) {
            return ck0.m33062j();
        }
        return m61101n(this, xx4, ss3.f44599b.mo65906e(s, 0), false, false, (Boolean) null, false, 60, (Object) null);
    }

    /* renamed from: b */
    public List<A> mo53778b(xx4 xx4, C7628h hVar, AnnotatedCallableKind annotatedCallableKind) {
        vx2.m53591g(xx4, "container");
        vx2.m53591g(hVar, "proto");
        vx2.m53591g(annotatedCallableKind, "kind");
        if (annotatedCallableKind == AnnotatedCallableKind.PROPERTY) {
            return mo53795z(xx4, (ProtoBuf$Property) hVar, PropertyRelatedElement.PROPERTY);
        }
        ss3 s = m61102s(this, hVar, xx4.mo66966b(), xx4.mo66968d(), annotatedCallableKind, false, 16, (Object) null);
        if (s == null) {
            return ck0.m33062j();
        }
        return m61101n(this, xx4, s, false, false, (Boolean) null, false, 60, (Object) null);
    }

    /* renamed from: c */
    public List<A> mo53779c(xx4 xx4, C7628h hVar, AnnotatedCallableKind annotatedCallableKind, int i, ProtoBuf$ValueParameter protoBuf$ValueParameter) {
        vx2.m53591g(xx4, "container");
        vx2.m53591g(hVar, "callableProto");
        vx2.m53591g(annotatedCallableKind, "kind");
        vx2.m53591g(protoBuf$ValueParameter, "proto");
        ss3 s = m61102s(this, hVar, xx4.mo66966b(), xx4.mo66968d(), annotatedCallableKind, false, 16, (Object) null);
        if (s == null) {
            return ck0.m33062j();
        }
        return m61101n(this, xx4, ss3.f44599b.mo65906e(s, i + mo53786l(xx4, hVar)), false, false, (Boolean) null, false, 60, (Object) null);
    }

    /* renamed from: d */
    public List<A> mo53780d(xx4.C9612a aVar) {
        vx2.m53591g(aVar, "container");
        tc3 B = mo53776B(aVar);
        if (B != null) {
            ArrayList arrayList = new ArrayList(1);
            B.mo65262b(new C7510c(this, arrayList), mo53789q(B));
            return arrayList;
        }
        throw new IllegalStateException(("Class for loading annotations is not found: " + aVar.mo66965a()).toString());
    }

    /* renamed from: e */
    public List<A> mo53781e(xx4 xx4, ProtoBuf$EnumEntry protoBuf$EnumEntry) {
        vx2.m53591g(xx4, "container");
        vx2.m53591g(protoBuf$EnumEntry, "proto");
        ss3.C9315a aVar = ss3.f44599b;
        String string = xx4.mo66966b().getString(protoBuf$EnumEntry.getName());
        String c = ((xx4.C9612a) xx4).mo66970e().mo62674c();
        vx2.m53590f(c, "container as ProtoContai…Class).classId.asString()");
        return m61101n(this, xx4, aVar.mo65902a(string, pf0.m71005b(c)), false, false, (Boolean) null, false, 60, (Object) null);
    }

    /* renamed from: f */
    public List<A> mo53782f(xx4 xx4, ProtoBuf$Property protoBuf$Property) {
        vx2.m53591g(xx4, "container");
        vx2.m53591g(protoBuf$Property, "proto");
        return mo53795z(xx4, protoBuf$Property, PropertyRelatedElement.BACKING_FIELD);
    }

    /* renamed from: g */
    public List<A> mo53783g(xx4 xx4, ProtoBuf$Property protoBuf$Property) {
        vx2.m53591g(xx4, "container");
        vx2.m53591g(protoBuf$Property, "proto");
        return mo53795z(xx4, protoBuf$Property, PropertyRelatedElement.DELEGATE_FIELD);
    }

    /* renamed from: i */
    public List<A> mo53784i(ProtoBuf$TypeParameter protoBuf$TypeParameter, t24 t24) {
        vx2.m53591g(protoBuf$TypeParameter, "proto");
        vx2.m53591g(t24, "nameResolver");
        Object extension = protoBuf$TypeParameter.getExtension(JvmProtoBuf.f39871h);
        vx2.m53590f(extension, "proto.getExtension(JvmPr….typeParameterAnnotation)");
        Iterable<ProtoBuf$Annotation> iterable = (Iterable) extension;
        ArrayList arrayList = new ArrayList(dk0.m43495u(iterable, 10));
        for (ProtoBuf$Annotation protoBuf$Annotation : iterable) {
            vx2.m53590f(protoBuf$Annotation, "it");
            arrayList.add(mo52574A(protoBuf$Annotation, t24));
        }
        return arrayList;
    }

    /* renamed from: k */
    public List<A> mo53785k(ProtoBuf$Type protoBuf$Type, t24 t24) {
        vx2.m53591g(protoBuf$Type, "proto");
        vx2.m53591g(t24, "nameResolver");
        Object extension = protoBuf$Type.getExtension(JvmProtoBuf.f39869f);
        vx2.m53590f(extension, "proto.getExtension(JvmProtoBuf.typeAnnotation)");
        Iterable<ProtoBuf$Annotation> iterable = (Iterable) extension;
        ArrayList arrayList = new ArrayList(dk0.m43495u(iterable, 10));
        for (ProtoBuf$Annotation protoBuf$Annotation : iterable) {
            vx2.m53590f(protoBuf$Annotation, "it");
            arrayList.add(mo52574A(protoBuf$Annotation, t24));
        }
        return arrayList;
    }

    /* renamed from: l */
    public final int mo53786l(xx4 xx4, C7628h hVar) {
        if (hVar instanceof ProtoBuf$Function) {
            if (cy4.m56599d((ProtoBuf$Function) hVar)) {
                return 1;
            }
        } else if (hVar instanceof ProtoBuf$Property) {
            if (cy4.m56600e((ProtoBuf$Property) hVar)) {
                return 1;
            }
        } else if (hVar instanceof ProtoBuf$Constructor) {
            vx2.m53589e(xx4, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class");
            xx4.C9612a aVar = (xx4.C9612a) xx4;
            if (aVar.mo66972g() == ProtoBuf$Class.Kind.ENUM_CLASS) {
                return 2;
            }
            if (aVar.mo66974i()) {
                return 1;
            }
        } else {
            throw new UnsupportedOperationException("Unsupported message: " + hVar.getClass());
        }
        return 0;
    }

    /* renamed from: m */
    public final List<A> mo53787m(xx4 xx4, ss3 ss3, boolean z, boolean z2, Boolean bool, boolean z3) {
        tc3 o = mo53788o(xx4, mo53792v(xx4, z, z2, bool, z3));
        if (o == null) {
            return ck0.m33062j();
        }
        List<A> list = (List) mo53763p(o).mo53764a().get(ss3);
        if (list == null) {
            return ck0.m33062j();
        }
        return list;
    }

    /* renamed from: o */
    public final tc3 mo53788o(xx4 xx4, tc3 tc3) {
        vx2.m53591g(xx4, "container");
        if (tc3 != null) {
            return tc3;
        }
        if (xx4 instanceof xx4.C9612a) {
            return mo53776B((xx4.C9612a) xx4);
        }
        return null;
    }

    /* renamed from: p */
    public abstract S mo53763p(tc3 tc3);

    /* renamed from: q */
    public byte[] mo53789q(tc3 tc3) {
        vx2.m53591g(tc3, "kotlinClass");
        return null;
    }

    /* renamed from: r */
    public final ss3 mo53790r(C7628h hVar, t24 t24, w17 w17, AnnotatedCallableKind annotatedCallableKind, boolean z) {
        vx2.m53591g(hVar, "proto");
        vx2.m53591g(t24, "nameResolver");
        vx2.m53591g(w17, "typeTable");
        vx2.m53591g(annotatedCallableKind, "kind");
        if (hVar instanceof ProtoBuf$Constructor) {
            ss3.C9315a aVar = ss3.f44599b;
            b83.C6855b b = i83.f38338a.mo52418b((ProtoBuf$Constructor) hVar, t24, w17);
            if (b == null) {
                return null;
            }
            return aVar.mo65903b(b);
        } else if (hVar instanceof ProtoBuf$Function) {
            ss3.C9315a aVar2 = ss3.f44599b;
            b83.C6855b e = i83.f38338a.mo52420e((ProtoBuf$Function) hVar, t24, w17);
            if (e == null) {
                return null;
            }
            return aVar2.mo65903b(e);
        } else if (!(hVar instanceof ProtoBuf$Property)) {
            return null;
        } else {
            GeneratedMessageLite.C7604e<ProtoBuf$Property, JvmProtoBuf.JvmPropertySignature> eVar = JvmProtoBuf.f39867d;
            vx2.m53590f(eVar, "propertySignature");
            JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) wx4.m73751a((GeneratedMessageLite.ExtendableMessage) hVar, eVar);
            if (jvmPropertySignature == null) {
                return null;
            }
            int i = C7509b.f39601a[annotatedCallableKind.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return mo53791t((ProtoBuf$Property) hVar, t24, w17, true, true, z);
                } else if (!jvmPropertySignature.hasSetter()) {
                    return null;
                } else {
                    ss3.C9315a aVar3 = ss3.f44599b;
                    JvmProtoBuf.JvmMethodSignature setter = jvmPropertySignature.getSetter();
                    vx2.m53590f(setter, "signature.setter");
                    return aVar3.mo65904c(t24, setter);
                }
            } else if (!jvmPropertySignature.hasGetter()) {
                return null;
            } else {
                ss3.C9315a aVar4 = ss3.f44599b;
                JvmProtoBuf.JvmMethodSignature getter = jvmPropertySignature.getGetter();
                vx2.m53590f(getter, "signature.getter");
                return aVar4.mo65904c(t24, getter);
            }
        }
    }

    /* renamed from: t */
    public final ss3 mo53791t(ProtoBuf$Property protoBuf$Property, t24 t24, w17 w17, boolean z, boolean z2, boolean z3) {
        vx2.m53591g(protoBuf$Property, "proto");
        vx2.m53591g(t24, "nameResolver");
        vx2.m53591g(w17, "typeTable");
        GeneratedMessageLite.C7604e<ProtoBuf$Property, JvmProtoBuf.JvmPropertySignature> eVar = JvmProtoBuf.f39867d;
        vx2.m53590f(eVar, "propertySignature");
        JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) wx4.m73751a(protoBuf$Property, eVar);
        if (jvmPropertySignature == null) {
            return null;
        }
        if (z) {
            b83.C6854a c = i83.f38338a.mo52419c(protoBuf$Property, t24, w17, z3);
            if (c == null) {
                return null;
            }
            return ss3.f44599b.mo65903b(c);
        } else if (!z2 || !jvmPropertySignature.hasSyntheticMethod()) {
            return null;
        } else {
            ss3.C9315a aVar = ss3.f44599b;
            JvmProtoBuf.JvmMethodSignature syntheticMethod = jvmPropertySignature.getSyntheticMethod();
            vx2.m53590f(syntheticMethod, "signature.syntheticMethod");
            return aVar.mo65904c(t24, syntheticMethod);
        }
    }

    /* renamed from: v */
    public final tc3 mo53792v(xx4 xx4, boolean z, boolean z2, Boolean bool, boolean z3) {
        xx4.C9612a h;
        g83 g83;
        y73 y73;
        vx2.m53591g(xx4, "container");
        if (z) {
            if (bool != null) {
                if (xx4 instanceof xx4.C9612a) {
                    xx4.C9612a aVar = (xx4.C9612a) xx4;
                    if (aVar.mo66972g() == ProtoBuf$Class.Kind.INTERFACE) {
                        nc3 nc3 = this.f39599a;
                        nf0 d = aVar.mo66970e().mo62675d(r24.m71445h("DefaultImpls"));
                        vx2.m53590f(d, "container.classId.create…EFAULT_IMPLS_CLASS_NAME))");
                        return oc3.m70233a(nc3, d);
                    }
                }
                if (bool.booleanValue() && (xx4 instanceof xx4.C9613b)) {
                    a66 c = xx4.mo66967c();
                    if (c instanceof g83) {
                        g83 = (g83) c;
                    } else {
                        g83 = null;
                    }
                    if (g83 != null) {
                        y73 = g83.mo51878f();
                    } else {
                        y73 = null;
                    }
                    if (y73 != null) {
                        nc3 nc32 = this.f39599a;
                        String f = y73.mo67043f();
                        vx2.m53590f(f, "facadeClassName.internalName");
                        nf0 m = nf0.m69751m(new u82(yb6.m74331H(f, '/', '.', false, 4, (Object) null)));
                        vx2.m53590f(m, "topLevel(FqName(facadeCl…lName.replace('/', '.')))");
                        return oc3.m70233a(nc32, m);
                    }
                }
            } else {
                throw new IllegalStateException(("isConst should not be null for property (container=" + xx4 + ')').toString());
            }
        }
        if (z2 && (xx4 instanceof xx4.C9612a)) {
            xx4.C9612a aVar2 = (xx4.C9612a) xx4;
            if (aVar2.mo66972g() == ProtoBuf$Class.Kind.COMPANION_OBJECT && (h = aVar2.mo66973h()) != null && (h.mo66972g() == ProtoBuf$Class.Kind.CLASS || h.mo66972g() == ProtoBuf$Class.Kind.ENUM_CLASS || (z3 && (h.mo66972g() == ProtoBuf$Class.Kind.INTERFACE || h.mo66972g() == ProtoBuf$Class.Kind.ANNOTATION_CLASS)))) {
                return mo53776B(h);
            }
        }
        if (!(xx4 instanceof xx4.C9613b) || !(xx4.mo66967c() instanceof g83)) {
            return null;
        }
        a66 c2 = xx4.mo66967c();
        vx2.m53589e(c2, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
        g83 g832 = (g83) c2;
        tc3 g = g832.mo51879g();
        if (g == null) {
            return oc3.m70233a(this.f39599a, g832.mo51876d());
        }
        return g;
    }

    /* renamed from: w */
    public final boolean mo53793w(nf0 nf0) {
        tc3 a;
        vx2.m53591g(nf0, "classId");
        if (nf0.mo62677g() == null || !vx2.m53586b(nf0.mo62681j().mo65594d(), "Container") || (a = oc3.m70233a(this.f39599a, nf0)) == null || !m66.f40792a.mo56146c(a)) {
            return false;
        }
        return true;
    }

    /* renamed from: x */
    public abstract tc3.C9341a mo52582x(nf0 nf0, a66 a66, List<A> list);

    /* renamed from: y */
    public final tc3.C9341a mo53794y(nf0 nf0, a66 a66, List<A> list) {
        vx2.m53591g(nf0, "annotationClassId");
        vx2.m53591g(a66, "source");
        vx2.m53591g(list, "result");
        if (m66.f40792a.mo56145b().contains(nf0)) {
            return null;
        }
        return mo52582x(nf0, a66, list);
    }

    /* renamed from: z */
    public final List<A> mo53795z(xx4 xx4, ProtoBuf$Property protoBuf$Property, PropertyRelatedElement propertyRelatedElement) {
        PropertyRelatedElement propertyRelatedElement2 = propertyRelatedElement;
        Boolean g = b42.f36637A.mo50465d(protoBuf$Property.getFlags());
        vx2.m53590f(g, "IS_CONST.get(proto.flags)");
        boolean booleanValue = g.booleanValue();
        boolean f = i83.m58870f(protoBuf$Property);
        if (propertyRelatedElement2 == PropertyRelatedElement.PROPERTY) {
            ss3 u = m61103u(this, protoBuf$Property, xx4.mo66966b(), xx4.mo66968d(), false, true, false, 40, (Object) null);
            if (u == null) {
                return ck0.m33062j();
            }
            return m61101n(this, xx4, u, true, false, Boolean.valueOf(booleanValue), f, 8, (Object) null);
        }
        ss3 u2 = m61103u(this, protoBuf$Property, xx4.mo66966b(), xx4.mo66968d(), true, false, false, 48, (Object) null);
        if (u2 == null) {
            return ck0.m33062j();
        }
        boolean z = false;
        boolean R = StringsKt__StringsKt.m63081R(u2.mo65898a(), "$delegate", false, 2, (Object) null);
        if (propertyRelatedElement2 == PropertyRelatedElement.DELEGATE_FIELD) {
            z = true;
        }
        if (R != z) {
            return ck0.m33062j();
        }
        return mo53787m(xx4, u2, true, true, Boolean.valueOf(booleanValue), f);
    }
}
