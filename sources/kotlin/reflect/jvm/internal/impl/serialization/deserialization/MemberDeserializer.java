package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C6177b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.C7420a;
import kotlin.reflect.jvm.internal.impl.descriptors.C7424b;
import kotlin.reflect.jvm.internal.impl.descriptors.C7428e;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility;
import kotlin.reflect.jvm.internal.impl.protobuf.C7628h;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import p000.C6983dm;
import p000.b42;
import p000.xx4;

/* compiled from: MemberDeserializer.kt */
public final class MemberDeserializer {

    /* renamed from: a */
    public final md1 f40147a;

    /* renamed from: b */
    public final C9600xl f40148b;

    public MemberDeserializer(md1 md1) {
        vx2.m53591g(md1, "c");
        this.f40147a = md1;
        this.f40148b = new C9600xl(md1.mo56226c().mo52449p(), md1.mo56226c().mo52450q());
    }

    /* renamed from: c */
    public final xx4 mo55129c(d31 d31) {
        if (d31 instanceof fk4) {
            return new xx4.C9613b(((fk4) d31).mo51711e(), this.f40147a.mo56230g(), this.f40147a.mo56233j(), this.f40147a.mo56227d());
        }
        if (d31 instanceof DeserializedClassDescriptor) {
            return ((DeserializedClassDescriptor) d31).mo55177Z0();
        }
        return null;
    }

    /* renamed from: d */
    public final C6983dm mo55130d(C7628h hVar, int i, AnnotatedCallableKind annotatedCallableKind) {
        if (!b42.f36654c.mo50465d(i).booleanValue()) {
            return C6983dm.f37317b.mo51228b();
        }
        return new k84(this.f40147a.mo56231h(), new MemberDeserializer$getAnnotations$1(this, hVar, annotatedCallableKind));
    }

    /* renamed from: e */
    public final h85 mo55131e() {
        if0 if0;
        d31 e = this.f40147a.mo56228e();
        if (e instanceof if0) {
            if0 = (if0) e;
        } else {
            if0 = null;
        }
        if (if0 != null) {
            return if0.mo52460D0();
        }
        return null;
    }

    /* renamed from: f */
    public final C6983dm mo55132f(ProtoBuf$Property protoBuf$Property, boolean z) {
        if (!b42.f36654c.mo50465d(protoBuf$Property.getFlags()).booleanValue()) {
            return C6983dm.f37317b.mo51228b();
        }
        return new k84(this.f40147a.mo56231h(), new MemberDeserializer$getPropertyFieldAnnotations$1(this, z, protoBuf$Property));
    }

    /* renamed from: g */
    public final C6983dm mo55133g(C7628h hVar, AnnotatedCallableKind annotatedCallableKind) {
        return new od1(this.f40147a.mo56231h(), new MemberDeserializer$getReceiverParameterAnnotations$1(this, hVar, annotatedCallableKind));
    }

    /* renamed from: h */
    public final void mo55134h(yd1 yd1, h85 h85, h85 h852, List<? extends h85> list, List<? extends a17> list2, List<? extends n87> list3, xc3 xc3, Modality modality, fd1 fd1, Map<? extends C7420a.C7421a<?>, ?> map) {
        yd1.mo52101i1(h85, h852, list, list2, list3, xc3, modality, fd1, map);
    }

    /* renamed from: i */
    public final ef0 mo55135i(ProtoBuf$Constructor protoBuf$Constructor, boolean z) {
        ProtoBuf$Constructor protoBuf$Constructor2 = protoBuf$Constructor;
        vx2.m53591g(protoBuf$Constructor2, "proto");
        d31 e = this.f40147a.mo56228e();
        vx2.m53589e(e, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        if0 if0 = (if0) e;
        int flags = protoBuf$Constructor.getFlags();
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        qd1 qd1 = r1;
        qd1 qd12 = new qd1(if0, (C7424b) null, mo55130d(protoBuf$Constructor2, flags, annotatedCallableKind), z, CallableMemberDescriptor.Kind.DECLARATION, protoBuf$Constructor, this.f40147a.mo56230g(), this.f40147a.mo56233j(), this.f40147a.mo56234k(), this.f40147a.mo56227d(), (a66) null, RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE, (DefaultConstructorMarker) null);
        MemberDeserializer f = md1.m64295b(this.f40147a, qd1, ck0.m33062j(), (t24) null, (w17) null, (a97) null, (o10) null, 60, (Object) null).mo56229f();
        List<ProtoBuf$ValueParameter> valueParameterList = protoBuf$Constructor.getValueParameterList();
        vx2.m53590f(valueParameterList, "proto.valueParameterList");
        qd1 qd13 = qd1;
        qd13.mo51665k1(f.mo55141o(valueParameterList, protoBuf$Constructor2, annotatedCallableKind), zx4.m75243a(yx4.f46285a, b42.f36655d.mo50465d(protoBuf$Constructor.getFlags())));
        qd13.mo53336a1(if0.mo51464n());
        qd13.mo53327Q0(if0.mo51319d0());
        qd13.mo53329S0(!b42.f36665n.mo50465d(protoBuf$Constructor.getFlags()).booleanValue());
        return qd13;
    }

    /* renamed from: j */
    public final C7428e mo55136j(ProtoBuf$Function protoBuf$Function) {
        int i;
        C6983dm dmVar;
        a97 a97;
        h85 h85;
        xc3 q;
        ProtoBuf$Function protoBuf$Function2 = protoBuf$Function;
        vx2.m53591g(protoBuf$Function2, "proto");
        if (protoBuf$Function.hasFlags()) {
            i = protoBuf$Function.getFlags();
        } else {
            i = mo55137k(protoBuf$Function.getOldFlags());
        }
        int i2 = i;
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        C6983dm d = mo55130d(protoBuf$Function2, i2, annotatedCallableKind);
        if (cy4.m56599d(protoBuf$Function)) {
            dmVar = mo55133g(protoBuf$Function2, annotatedCallableKind);
        } else {
            dmVar = C6983dm.f37317b.mo51228b();
        }
        if (vx2.m53586b(DescriptorUtilsKt.m62447h(this.f40147a.mo56228e()).mo66196c(v24.m73044b(this.f40147a.mo56230g(), protoBuf$Function.getName())), le6.f40604a)) {
            a97 = a97.f36407b.mo50123b();
        } else {
            a97 = this.f40147a.mo56234k();
        }
        ProtoBuf$Function protoBuf$Function3 = protoBuf$Function;
        yd1 yd1 = new yd1(this.f40147a.mo56228e(), (C7428e) null, d, v24.m73044b(this.f40147a.mo56230g(), protoBuf$Function.getName()), zx4.m75244b(yx4.f46285a, b42.f36666o.mo50465d(i2)), protoBuf$Function3, this.f40147a.mo56230g(), this.f40147a.mo56233j(), a97, this.f40147a.mo56227d(), (a66) null, RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE, (DefaultConstructorMarker) null);
        md1 md1 = this.f40147a;
        List<ProtoBuf$TypeParameter> typeParameterList = protoBuf$Function.getTypeParameterList();
        vx2.m53590f(typeParameterList, "proto.typeParameterList");
        md1 b = md1.m64295b(md1, yd1, typeParameterList, (t24) null, (w17) null, (a97) null, (o10) null, 60, (Object) null);
        ProtoBuf$Type h = cy4.m56603h(protoBuf$Function2, this.f40147a.mo56233j());
        if (h == null || (q = b.mo56232i().mo55153q(h)) == null) {
            h85 = null;
        } else {
            h85 = wc1.m73548h(yd1, q, dmVar);
        }
        h85 h852 = h85;
        h85 e = mo55131e();
        List<ProtoBuf$Type> contextReceiverTypeList = protoBuf$Function.getContextReceiverTypeList();
        vx2.m53590f(contextReceiverTypeList, "proto.contextReceiverTypeList");
        ArrayList arrayList = new ArrayList();
        for (ProtoBuf$Type protoBuf$Type : contextReceiverTypeList) {
            vx2.m53590f(protoBuf$Type, "it");
            h85 n = mo55140n(protoBuf$Type, b, yd1);
            if (n != null) {
                arrayList.add(n);
            }
        }
        List<a17> j = b.mo56232i().mo55148j();
        MemberDeserializer f = b.mo56229f();
        List<ProtoBuf$ValueParameter> valueParameterList = protoBuf$Function.getValueParameterList();
        vx2.m53590f(valueParameterList, "proto.valueParameterList");
        List<n87> o = f.mo55141o(valueParameterList, protoBuf$Function2, AnnotatedCallableKind.FUNCTION);
        xc3 q2 = b.mo56232i().mo55153q(cy4.m56605j(protoBuf$Function2, this.f40147a.mo56233j()));
        yx4 yx4 = yx4.f46285a;
        Modality b2 = yx4.mo67186b(b42.f36656e.mo50465d(i2));
        yd1 yd12 = yd1;
        md1 md12 = b;
        yd1 yd13 = yd1;
        Modality modality = b2;
        int i3 = i2;
        fd1 a = zx4.m75243a(yx4, b42.f36655d.mo50465d(i2));
        mo55134h(yd12, h852, e, arrayList, j, o, q2, modality, a, C6177b.m47361i());
        Boolean g = b42.f36667p.mo50465d(i3);
        vx2.m53590f(g, "IS_OPERATOR.get(flags)");
        yd13.mo53335Z0(g.booleanValue());
        Boolean g2 = b42.f36668q.mo50465d(i3);
        vx2.m53590f(g2, "IS_INFIX.get(flags)");
        yd13.mo53333W0(g2.booleanValue());
        Boolean g3 = b42.f36671t.mo50465d(i3);
        vx2.m53590f(g3, "IS_EXTERNAL_FUNCTION.get(flags)");
        yd13.mo53328R0(g3.booleanValue());
        Boolean g4 = b42.f36669r.mo50465d(i3);
        vx2.m53590f(g4, "IS_INLINE.get(flags)");
        yd13.mo53334Y0(g4.booleanValue());
        Boolean g5 = b42.f36670s.mo50465d(i3);
        vx2.m53590f(g5, "IS_TAILREC.get(flags)");
        yd13.mo53338c1(g5.booleanValue());
        Boolean g6 = b42.f36672u.mo50465d(i3);
        vx2.m53590f(g6, "IS_SUSPEND.get(flags)");
        yd13.mo53337b1(g6.booleanValue());
        Boolean g7 = b42.f36673v.mo50465d(i3);
        vx2.m53590f(g7, "IS_EXPECT_FUNCTION.get(flags)");
        yd13.mo53327Q0(g7.booleanValue());
        yd13.mo53329S0(!b42.f36674w.mo50465d(i3).booleanValue());
        Pair<C7420a.C7421a<?>, Object> a2 = this.f40147a.mo56226c().mo52441h().mo52312a(protoBuf$Function2, yd13, this.f40147a.mo56233j(), md12.mo56232i());
        if (a2 != null) {
            yd13.mo53325O0(a2.getFirst(), a2.getSecond());
        }
        return yd13;
    }

    /* renamed from: k */
    public final int mo55137k(int i) {
        return (i & 63) + ((i >> 8) << 6);
    }

    /* renamed from: l */
    public final fx4 mo55138l(ProtoBuf$Property protoBuf$Property) {
        ProtoBuf$Property protoBuf$Property2;
        C6983dm dmVar;
        xd1 xd1;
        h85 h85;
        b42.C6847d<ProtoBuf$Visibility> dVar;
        md1 md1;
        b42.C6847d<ProtoBuf$Modality> dVar2;
        jx4 jx4;
        jx4 jx42;
        mx4 mx4;
        int i;
        boolean z;
        ProtoBuf$Property protoBuf$Property3;
        xd1 xd12;
        jx4 jx43;
        xc3 q;
        ProtoBuf$Property protoBuf$Property4 = protoBuf$Property;
        vx2.m53591g(protoBuf$Property4, "proto");
        int flags = protoBuf$Property.hasFlags() ? protoBuf$Property.getFlags() : mo55137k(protoBuf$Property.getOldFlags());
        d31 e = this.f40147a.mo56228e();
        C6983dm d = mo55130d(protoBuf$Property4, flags, AnnotatedCallableKind.PROPERTY);
        yx4 yx4 = yx4.f46285a;
        Modality b = yx4.mo67186b(b42.f36656e.mo50465d(flags));
        fd1 a = zx4.m75243a(yx4, b42.f36655d.mo50465d(flags));
        Boolean g = b42.f36675x.mo50465d(flags);
        vx2.m53590f(g, "IS_VAR.get(flags)");
        boolean booleanValue = g.booleanValue();
        r24 b2 = v24.m73044b(this.f40147a.mo56230g(), protoBuf$Property.getName());
        CallableMemberDescriptor.Kind b3 = zx4.m75244b(yx4, b42.f36666o.mo50465d(flags));
        Boolean g2 = b42.f36638B.mo50465d(flags);
        vx2.m53590f(g2, "IS_LATEINIT.get(flags)");
        boolean booleanValue2 = g2.booleanValue();
        Boolean g3 = b42.f36637A.mo50465d(flags);
        vx2.m53590f(g3, "IS_CONST.get(flags)");
        boolean booleanValue3 = g3.booleanValue();
        Boolean g4 = b42.f36640D.mo50465d(flags);
        vx2.m53590f(g4, "IS_EXTERNAL_PROPERTY.get(flags)");
        boolean booleanValue4 = g4.booleanValue();
        Boolean g5 = b42.f36641E.mo50465d(flags);
        vx2.m53590f(g5, "IS_DELEGATED.get(flags)");
        boolean booleanValue5 = g5.booleanValue();
        xd1 xd13 = r1;
        Boolean g6 = b42.f36642F.mo50465d(flags);
        vx2.m53590f(g6, "IS_EXPECT_PROPERTY.get(flags)");
        ProtoBuf$Property protoBuf$Property5 = protoBuf$Property4;
        xd1 xd14 = new xd1(e, (fx4) null, d, b, a, booleanValue, b2, b3, booleanValue2, booleanValue3, booleanValue4, booleanValue5, g6.booleanValue(), protoBuf$Property, this.f40147a.mo56230g(), this.f40147a.mo56233j(), this.f40147a.mo56234k(), this.f40147a.mo56227d());
        md1 md12 = this.f40147a;
        List<ProtoBuf$TypeParameter> typeParameterList = protoBuf$Property.getTypeParameterList();
        vx2.m53590f(typeParameterList, "proto.typeParameterList");
        md1 b4 = md1.m64295b(md12, xd13, typeParameterList, (t24) null, (w17) null, (a97) null, (o10) null, 60, (Object) null);
        int i2 = flags;
        Boolean g7 = b42.f36676y.mo50465d(i2);
        vx2.m53590f(g7, "HAS_GETTER.get(flags)");
        boolean booleanValue6 = g7.booleanValue();
        if (!booleanValue6 || !cy4.m56600e(protoBuf$Property)) {
            protoBuf$Property2 = protoBuf$Property;
            dmVar = C6983dm.f37317b.mo51228b();
        } else {
            protoBuf$Property2 = protoBuf$Property;
            dmVar = mo55133g(protoBuf$Property2, AnnotatedCallableKind.PROPERTY_GETTER);
        }
        xc3 q2 = b4.mo56232i().mo55153q(cy4.m56606k(protoBuf$Property2, this.f40147a.mo56233j()));
        List<a17> j = b4.mo56232i().mo55148j();
        h85 e2 = mo55131e();
        ProtoBuf$Type i3 = cy4.m56604i(protoBuf$Property2, this.f40147a.mo56233j());
        ClassKind classKind = null;
        if (i3 == null || (q = b4.mo56232i().mo55153q(i3)) == null) {
            xd1 = xd13;
            h85 = null;
        } else {
            xd1 = xd13;
            h85 = wc1.m73548h(xd1, q, dmVar);
        }
        List<ProtoBuf$Type> contextReceiverTypeList = protoBuf$Property.getContextReceiverTypeList();
        vx2.m53590f(contextReceiverTypeList, "proto.contextReceiverTypeList");
        ArrayList arrayList = new ArrayList(dk0.m43495u(contextReceiverTypeList, 10));
        for (ProtoBuf$Type protoBuf$Type : contextReceiverTypeList) {
            vx2.m53590f(protoBuf$Type, "it");
            arrayList.add(mo55140n(protoBuf$Type, b4, xd1));
        }
        xd1.mo52050V0(q2, j, e2, h85, arrayList);
        Boolean g8 = b42.f36654c.mo50465d(i2);
        vx2.m53590f(g8, "HAS_ANNOTATIONS.get(flags)");
        boolean booleanValue7 = g8.booleanValue();
        b42.C6847d<ProtoBuf$Visibility> dVar3 = b42.f36655d;
        b42.C6847d<ProtoBuf$Modality> dVar4 = b42.f36656e;
        int b5 = b42.m55727b(booleanValue7, dVar3.mo50465d(i2), dVar4.mo50465d(i2), false, false, false);
        if (booleanValue6) {
            int getterFlags = protoBuf$Property.hasGetterFlags() ? protoBuf$Property.getGetterFlags() : b5;
            Boolean g9 = b42.f36646J.mo50465d(getterFlags);
            vx2.m53590f(g9, "IS_NOT_DEFAULT.get(getterFlags)");
            boolean booleanValue8 = g9.booleanValue();
            Boolean g10 = b42.f36647K.mo50465d(getterFlags);
            vx2.m53590f(g10, "IS_EXTERNAL_ACCESSOR.get(getterFlags)");
            boolean booleanValue9 = g10.booleanValue();
            Boolean g11 = b42.f36648L.mo50465d(getterFlags);
            vx2.m53590f(g11, "IS_INLINE_ACCESSOR.get(getterFlags)");
            boolean booleanValue10 = g11.booleanValue();
            C6983dm d2 = mo55130d(protoBuf$Property2, getterFlags, AnnotatedCallableKind.PROPERTY_GETTER);
            if (booleanValue8) {
                yx4 yx42 = yx4.f46285a;
                md1 = b4;
                dVar2 = dVar4;
                dVar = dVar3;
                jx43 = new jx4(xd1, d2, yx42.mo67186b(dVar4.mo50465d(getterFlags)), zx4.m75243a(yx42, dVar3.mo50465d(getterFlags)), !booleanValue8, booleanValue9, booleanValue10, xd1.getKind(), (ix4) null, a66.f36360a);
            } else {
                dVar = dVar3;
                md1 = b4;
                dVar2 = dVar4;
                jx43 = wc1.m73544d(xd1, d2);
                vx2.m53590f(jx43, "{\n                Descri…nnotations)\n            }");
            }
            jx43.mo52818K0(xd1.getReturnType());
            jx4 = jx43;
        } else {
            dVar = dVar3;
            md1 = b4;
            dVar2 = dVar4;
            jx4 = null;
        }
        Boolean g12 = b42.f36677z.mo50465d(i2);
        vx2.m53590f(g12, "HAS_SETTER.get(flags)");
        if (g12.booleanValue()) {
            if (protoBuf$Property.hasSetterFlags()) {
                b5 = protoBuf$Property.getSetterFlags();
            }
            int i4 = b5;
            Boolean g13 = b42.f36646J.mo50465d(i4);
            vx2.m53590f(g13, "IS_NOT_DEFAULT.get(setterFlags)");
            boolean booleanValue11 = g13.booleanValue();
            Boolean g14 = b42.f36647K.mo50465d(i4);
            vx2.m53590f(g14, "IS_EXTERNAL_ACCESSOR.get(setterFlags)");
            boolean booleanValue12 = g14.booleanValue();
            Boolean g15 = b42.f36648L.mo50465d(i4);
            vx2.m53590f(g15, "IS_INLINE_ACCESSOR.get(setterFlags)");
            boolean booleanValue13 = g15.booleanValue();
            AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.PROPERTY_SETTER;
            C6983dm d3 = mo55130d(protoBuf$Property2, i4, annotatedCallableKind);
            if (booleanValue11) {
                yx4 yx43 = yx4.f46285a;
                mx4 mx42 = r1;
                jx42 = jx4;
                mx4 mx43 = new mx4(xd1, d3, yx43.mo67186b(dVar2.mo50465d(i4)), zx4.m75243a(yx43, dVar.mo50465d(i4)), !booleanValue11, booleanValue12, booleanValue13, xd1.getKind(), (lx4) null, a66.f36360a);
                z = true;
                xd12 = xd1;
                protoBuf$Property3 = protoBuf$Property2;
                i = i2;
                mx4 mx44 = mx42;
                mx44.mo56333L0((n87) CollectionsKt___CollectionsKt.m47355z0(md1.m64295b(md1, mx42, ck0.m33062j(), (t24) null, (w17) null, (a97) null, (o10) null, 60, (Object) null).mo56229f().mo55141o(bk0.m32598e(protoBuf$Property.getSetterValueParameter()), protoBuf$Property3, annotatedCallableKind)));
                mx4 = mx44;
            } else {
                jx42 = jx4;
                xd12 = xd1;
                protoBuf$Property3 = protoBuf$Property2;
                i = i2;
                z = true;
                mx4 = wc1.m73545e(xd12, d3, C6983dm.f37317b.mo51228b());
                vx2.m53590f(mx4, "{\n                Descri…          )\n            }");
            }
        } else {
            jx42 = jx4;
            xd12 = xd1;
            protoBuf$Property3 = protoBuf$Property2;
            i = i2;
            z = true;
            mx4 = null;
        }
        Boolean g16 = b42.f36639C.mo50465d(i);
        vx2.m53590f(g16, "HAS_CONSTANT.get(flags)");
        if (g16.booleanValue()) {
            xd12.mo53365F0(new MemberDeserializer$loadProperty$4(this, protoBuf$Property3, xd12));
        }
        d31 e3 = this.f40147a.mo56228e();
        if0 if0 = e3 instanceof if0 ? (if0) e3 : null;
        if (if0 != null) {
            classKind = if0.getKind();
        }
        if (classKind == ClassKind.ANNOTATION_CLASS) {
            xd12.mo53365F0(new MemberDeserializer$loadProperty$5(this, protoBuf$Property3, xd12));
        }
        xd12.mo52045P0(jx42, mx4, new h02(mo55132f(protoBuf$Property3, false), xd12), new h02(mo55132f(protoBuf$Property3, z), xd12));
        return xd12;
    }

    /* renamed from: m */
    public final hz6 mo55139m(ProtoBuf$TypeAlias protoBuf$TypeAlias) {
        ProtoBuf$TypeAlias protoBuf$TypeAlias2 = protoBuf$TypeAlias;
        vx2.m53591g(protoBuf$TypeAlias2, "proto");
        C6983dm.C6984a aVar = C6983dm.f37317b;
        List<ProtoBuf$Annotation> annotationList = protoBuf$TypeAlias.getAnnotationList();
        vx2.m53590f(annotationList, "proto.annotationList");
        ArrayList arrayList = new ArrayList(dk0.m43495u(annotationList, 10));
        for (ProtoBuf$Annotation protoBuf$Annotation : annotationList) {
            C9600xl xlVar = this.f40148b;
            vx2.m53590f(protoBuf$Annotation, "it");
            arrayList.add(xlVar.mo66874a(protoBuf$Annotation, this.f40147a.mo56230g()));
        }
        zd1 zd1 = new zd1(this.f40147a.mo56231h(), this.f40147a.mo56228e(), aVar.mo51227a(arrayList), v24.m73044b(this.f40147a.mo56230g(), protoBuf$TypeAlias.getName()), zx4.m75243a(yx4.f46285a, b42.f36655d.mo50465d(protoBuf$TypeAlias.getFlags())), protoBuf$TypeAlias, this.f40147a.mo56230g(), this.f40147a.mo56233j(), this.f40147a.mo56234k(), this.f40147a.mo56227d());
        md1 md1 = this.f40147a;
        List<ProtoBuf$TypeParameter> typeParameterList = protoBuf$TypeAlias.getTypeParameterList();
        vx2.m53590f(typeParameterList, "proto.typeParameterList");
        zd1 zd12 = zd1;
        md1 b = md1.m64295b(md1, zd1, typeParameterList, (t24) null, (w17) null, (a97) null, (o10) null, 60, (Object) null);
        zd12.mo67248K0(b.mo56232i().mo55148j(), b.mo56232i().mo55150l(cy4.m56610o(protoBuf$TypeAlias2, this.f40147a.mo56233j()), false), b.mo56232i().mo55150l(cy4.m56597b(protoBuf$TypeAlias2, this.f40147a.mo56233j()), false));
        return zd12;
    }

    /* renamed from: n */
    public final h85 mo55140n(ProtoBuf$Type protoBuf$Type, md1 md1, C7420a aVar) {
        return wc1.m73542b(aVar, md1.mo56232i().mo55153q(protoBuf$Type), C6983dm.f37317b.mo51228b());
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00f3  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<p000.n87> mo55141o(java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter> r26, kotlin.reflect.jvm.internal.impl.protobuf.C7628h r27, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r28) {
        /*
            r25 = this;
            r7 = r25
            md1 r0 = r7.f40147a
            d31 r0 = r0.mo56228e()
            java.lang.String r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor"
            p000.vx2.m53589e(r0, r1)
            r20 = r0
            kotlin.reflect.jvm.internal.impl.descriptors.a r20 = (kotlin.reflect.jvm.internal.impl.descriptors.C7420a) r20
            d31 r0 = r20.mo51119b()
            java.lang.String r1 = "callableDescriptor.containingDeclaration"
            p000.vx2.m53590f(r0, r1)
            xx4 r21 = r7.mo55129c(r0)
            java.util.ArrayList r15 = new java.util.ArrayList
            r0 = 10
            r1 = r26
            int r0 = p000.dk0.m43495u(r1, r0)
            r15.<init>(r0)
            java.util.Iterator r22 = r26.iterator()
            r23 = 0
            r11 = r23
        L_0x0033:
            boolean r0 = r22.hasNext()
            if (r0 == 0) goto L_0x0111
            java.lang.Object r0 = r22.next()
            int r24 = r11 + 1
            if (r11 >= 0) goto L_0x0044
            p000.ck0.m33072t()
        L_0x0044:
            r8 = r0
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter r8 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter) r8
            boolean r0 = r8.hasFlags()
            if (r0 == 0) goto L_0x0053
            int r0 = r8.getFlags()
            r9 = r0
            goto L_0x0055
        L_0x0053:
            r9 = r23
        L_0x0055:
            if (r21 == 0) goto L_0x0085
            b42$b r0 = p000.b42.f36654c
            java.lang.Boolean r0 = r0.mo50465d(r9)
            java.lang.String r1 = "HAS_ANNOTATIONS.get(flags)"
            p000.vx2.m53590f(r0, r1)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0085
            k84 r10 = new k84
            md1 r0 = r7.f40147a
            da6 r12 = r0.mo56231h()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$valueParameters$1$annotations$1 r13 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$valueParameters$1$annotations$1
            r0 = r13
            r1 = r25
            r2 = r21
            r3 = r27
            r4 = r28
            r5 = r11
            r6 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r10.<init>(r12, r13)
            r12 = r10
            goto L_0x008c
        L_0x0085:
            dm$a r0 = p000.C6983dm.f37317b
            dm r0 = r0.mo51228b()
            r12 = r0
        L_0x008c:
            r10 = 0
            md1 r0 = r7.f40147a
            t24 r0 = r0.mo56230g()
            int r1 = r8.getName()
            r24 r13 = p000.v24.m73044b(r0, r1)
            md1 r0 = r7.f40147a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer r0 = r0.mo56232i()
            md1 r1 = r7.f40147a
            w17 r1 = r1.mo56233j()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r1 = p000.cy4.m56609n(r8, r1)
            xc3 r14 = r0.mo55153q(r1)
            b42$b r0 = p000.b42.f36643G
            java.lang.Boolean r0 = r0.mo50465d(r9)
            java.lang.String r1 = "DECLARES_DEFAULT_VALUE.get(flags)"
            p000.vx2.m53590f(r0, r1)
            boolean r0 = r0.booleanValue()
            b42$b r1 = p000.b42.f36644H
            java.lang.Boolean r1 = r1.mo50465d(r9)
            java.lang.String r2 = "IS_CROSSINLINE.get(flags)"
            p000.vx2.m53590f(r1, r2)
            boolean r16 = r1.booleanValue()
            b42$b r1 = p000.b42.f36645I
            java.lang.Boolean r1 = r1.mo50465d(r9)
            java.lang.String r2 = "IS_NOINLINE.get(flags)"
            p000.vx2.m53590f(r1, r2)
            boolean r17 = r1.booleanValue()
            md1 r1 = r7.f40147a
            w17 r1 = r1.mo56233j()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r1 = p000.cy4.m56612q(r8, r1)
            if (r1 == 0) goto L_0x00f3
            md1 r2 = r7.f40147a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer r2 = r2.mo56232i()
            xc3 r1 = r2.mo55153q(r1)
            goto L_0x00f4
        L_0x00f3:
            r1 = 0
        L_0x00f4:
            r18 = r1
            a66 r1 = p000.a66.f36360a
            java.lang.String r2 = "NO_SOURCE"
            p000.vx2.m53590f(r1, r2)
            kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl r2 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl
            r8 = r2
            r9 = r20
            r3 = r15
            r15 = r0
            r19 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r3.add(r2)
            r15 = r3
            r11 = r24
            goto L_0x0033
        L_0x0111:
            r3 = r15
            java.util.List r0 = kotlin.collections.CollectionsKt___CollectionsKt.m47311K0(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer.mo55141o(java.util.List, kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind):java.util.List");
    }
}
