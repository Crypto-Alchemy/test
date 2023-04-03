package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C6177b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.builtins.C7389b;
import kotlin.reflect.jvm.internal.impl.builtins.C7395c;
import kotlin.reflect.jvm.internal.impl.descriptors.C7420a;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import p000.eb1;

/* compiled from: TypeDeserializer.kt */
public final class TypeDeserializer {

    /* renamed from: a */
    public final md1 f40150a;

    /* renamed from: b */
    public final TypeDeserializer f40151b;

    /* renamed from: c */
    public final String f40152c;

    /* renamed from: d */
    public final String f40153d;

    /* renamed from: e */
    public final rc2<Integer, eg0> f40154e;

    /* renamed from: f */
    public final rc2<Integer, eg0> f40155f;

    /* renamed from: g */
    public final Map<Integer, a17> f40156g;

    public TypeDeserializer(md1 md1, TypeDeserializer typeDeserializer, List<ProtoBuf$TypeParameter> list, String str, String str2) {
        Map<Integer, a17> map;
        vx2.m53591g(md1, "c");
        vx2.m53591g(list, "typeParameterProtos");
        vx2.m53591g(str, "debugName");
        vx2.m53591g(str2, "containerPresentableName");
        this.f40150a = md1;
        this.f40151b = typeDeserializer;
        this.f40152c = str;
        this.f40153d = str2;
        this.f40154e = md1.mo56231h().mo51159d(new TypeDeserializer$classifierDescriptors$1(this));
        this.f40155f = md1.mo56231h().mo51159d(new TypeDeserializer$typeAliasDescriptors$1(this));
        if (list.isEmpty()) {
            map = C6177b.m47361i();
        } else {
            map = new LinkedHashMap<>();
            int i = 0;
            for (ProtoBuf$TypeParameter next : list) {
                map.put(Integer.valueOf(next.getId()), new DeserializedTypeParameterDescriptor(this.f40150a, next, i));
                i++;
            }
        }
        this.f40156g = map;
    }

    /* renamed from: m */
    public static final List<ProtoBuf$Type.Argument> m62557m(ProtoBuf$Type protoBuf$Type, TypeDeserializer typeDeserializer) {
        List<ProtoBuf$Type.Argument> list;
        List<ProtoBuf$Type.Argument> argumentList = protoBuf$Type.getArgumentList();
        vx2.m53590f(argumentList, "argumentList");
        ProtoBuf$Type g = cy4.m56602g(protoBuf$Type, typeDeserializer.f40150a.mo56233j());
        if (g != null) {
            list = m62557m(g, typeDeserializer);
        } else {
            list = null;
        }
        if (list == null) {
            list = ck0.m33062j();
        }
        return CollectionsKt___CollectionsKt.m47350u0(argumentList, list);
    }

    /* renamed from: n */
    public static /* synthetic */ d36 m62558n(TypeDeserializer typeDeserializer, ProtoBuf$Type protoBuf$Type, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return typeDeserializer.mo55150l(protoBuf$Type, z);
    }

    /* renamed from: t */
    public static final if0 m62559t(TypeDeserializer typeDeserializer, ProtoBuf$Type protoBuf$Type, int i) {
        nf0 a = v24.m73043a(typeDeserializer.f40150a.mo56230g(), i);
        List E = SequencesKt___SequencesKt.m63021E(SequencesKt___SequencesKt.m63034x(SequencesKt__SequencesKt.m63015j(protoBuf$Type, new C7675x131ab842(typeDeserializer)), C7676x131ab843.INSTANCE));
        int m = SequencesKt___SequencesKt.m63023m(SequencesKt__SequencesKt.m63015j(a, C7674x1c22db09.INSTANCE));
        while (E.size() < m) {
            E.add(0);
        }
        return typeDeserializer.f40150a.mo56226c().mo52450q().mo53241d(a, E);
    }

    /* renamed from: d */
    public final eg0 mo55142d(int i) {
        nf0 a = v24.m73043a(this.f40150a.mo56230g(), i);
        if (a.mo62682k()) {
            return this.f40150a.mo56226c().mo52435b(a);
        }
        return FindClassInModuleKt.m60279b(this.f40150a.mo56226c().mo52449p(), a);
    }

    /* renamed from: e */
    public final d36 mo55143e(int i) {
        if (v24.m73043a(this.f40150a.mo56230g(), i).mo62682k()) {
            return this.f40150a.mo56226c().mo52447n().mo51934a();
        }
        return null;
    }

    /* renamed from: f */
    public final eg0 mo55144f(int i) {
        nf0 a = v24.m73043a(this.f40150a.mo56230g(), i);
        if (a.mo62682k()) {
            return null;
        }
        return FindClassInModuleKt.m60281d(this.f40150a.mo56226c().mo52449p(), a);
    }

    /* renamed from: g */
    public final d36 mo55145g(xc3 xc3, xc3 xc32) {
        C7389b h = TypeUtilsKt.m62952h(xc3);
        C6983dm annotations = xc3.getAnnotations();
        xc3 j = ce2.m56404j(xc3);
        List<xc3> e = ce2.m56399e(xc3);
        List<T> U = CollectionsKt___CollectionsKt.m47324U(ce2.m56406l(xc3), 1);
        ArrayList arrayList = new ArrayList(dk0.m43495u(U, 10));
        for (T type : U) {
            arrayList.add(type.getType());
        }
        return ce2.m56396b(h, annotations, j, e, arrayList, (List<r24>) null, xc32, true).mo51121O0(xc3.mo51135I0());
    }

    /* renamed from: h */
    public final d36 mo55146h(rz6 rz6, yz6 yz6, List<? extends f17> list, boolean z) {
        int size;
        int size2 = yz6.getParameters().size() - list.size();
        d36 d36 = null;
        if (size2 == 0) {
            d36 = mo55147i(rz6, yz6, list, z);
        } else if (size2 == 1 && (size = list.size() - 1) >= 0) {
            yz6 g = yz6.mo51813k().mo53163X(size).mo50046g();
            vx2.m53590f(g, "functionTypeConstructor.…on(arity).typeConstructor");
            d36 = KotlinTypeFactory.m62853i(rz6, g, list, z, (bd3) null, 16, (Object) null);
        }
        if (d36 == null) {
            return nr1.f43548a.mo62786f(ErrorTypeKind.INCONSISTENT_SUSPEND_FUNCTION, list, yz6, new String[0]);
        }
        return d36;
    }

    /* renamed from: i */
    public final d36 mo55147i(rz6 rz6, yz6 yz6, List<? extends f17> list, boolean z) {
        d36 i = KotlinTypeFactory.m62853i(rz6, yz6, list, z, (bd3) null, 16, (Object) null);
        if (!ce2.m56410p(i)) {
            return null;
        }
        return mo55152p(i);
    }

    /* renamed from: j */
    public final List<a17> mo55148j() {
        return CollectionsKt___CollectionsKt.m47311K0(this.f40156g.values());
    }

    /* renamed from: k */
    public final a17 mo55149k(int i) {
        a17 a17 = this.f40156g.get(Integer.valueOf(i));
        if (a17 != null) {
            return a17;
        }
        TypeDeserializer typeDeserializer = this.f40151b;
        if (typeDeserializer != null) {
            return typeDeserializer.mo55149k(i);
        }
        return null;
    }

    /* renamed from: l */
    public final d36 mo55150l(ProtoBuf$Type protoBuf$Type, boolean z) {
        d36 d36;
        d36 d362;
        d36 j;
        vx2.m53591g(protoBuf$Type, "proto");
        if (protoBuf$Type.hasClassName()) {
            d36 = mo55143e(protoBuf$Type.getClassName());
        } else if (protoBuf$Type.hasTypeAliasName()) {
            d36 = mo55143e(protoBuf$Type.getTypeAliasName());
        } else {
            d36 = null;
        }
        if (d36 != null) {
            return d36;
        }
        yz6 s = mo55155s(protoBuf$Type);
        boolean z2 = true;
        if (nr1.m70034m(s.mo51180d())) {
            return nr1.f43548a.mo62784c(ErrorTypeKind.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, s, s.toString());
        }
        od1 od1 = new od1(this.f40150a.mo56231h(), new TypeDeserializer$simpleType$annotations$1(this, protoBuf$Type));
        rz6 o = mo55151o(this.f40150a.mo56226c().mo52455v(), od1, s, this.f40150a.mo56228e());
        List<ProtoBuf$Type.Argument> m = m62557m(protoBuf$Type, this);
        ArrayList arrayList = new ArrayList(dk0.m43495u(m, 10));
        int i = 0;
        for (T next : m) {
            int i2 = i + 1;
            if (i < 0) {
                ck0.m33072t();
            }
            List<a17> parameters = s.getParameters();
            vx2.m53590f(parameters, "constructor.parameters");
            arrayList.add(mo55154r((a17) CollectionsKt___CollectionsKt.m47332c0(parameters, i), (ProtoBuf$Type.Argument) next));
            i = i2;
        }
        List K0 = CollectionsKt___CollectionsKt.m47311K0(arrayList);
        eg0 d = s.mo51180d();
        if (!z || !(d instanceof hz6)) {
            Boolean g = b42.f36652a.mo50465d(protoBuf$Type.getFlags());
            vx2.m53590f(g, "SUSPEND_TYPE.get(proto.flags)");
            if (g.booleanValue()) {
                d362 = mo55146h(o, s, K0, protoBuf$Type.getNullable());
            } else {
                d362 = KotlinTypeFactory.m62853i(o, s, K0, protoBuf$Type.getNullable(), (bd3) null, 16, (Object) null);
                Boolean g2 = b42.f36653b.mo50465d(protoBuf$Type.getFlags());
                vx2.m53590f(g2, "DEFINITELY_NOT_NULL_TYPE.get(proto.flags)");
                if (g2.booleanValue()) {
                    eb1 c = eb1.C7028a.m57265c(eb1.f37495g, d362, false, 2, (Object) null);
                    if (c != null) {
                        d362 = c;
                    } else {
                        throw new IllegalStateException(("null DefinitelyNotNullType for '" + d362 + '\'').toString());
                    }
                }
            }
        } else {
            KotlinTypeFactory kotlinTypeFactory = KotlinTypeFactory.f40263a;
            d36 b = KotlinTypeFactory.m62848b((hz6) d, K0);
            rz6 o2 = mo55151o(this.f40150a.mo56226c().mo52455v(), C6983dm.f37317b.mo51227a(CollectionsKt___CollectionsKt.m47348s0(od1, b.getAnnotations())), s, this.f40150a.mo56228e());
            if (!zc3.m74856b(b) && !protoBuf$Type.getNullable()) {
                z2 = false;
            }
            d362 = b.mo51121O0(z2).mo51122P0(o2);
        }
        ProtoBuf$Type a = cy4.m56596a(protoBuf$Type, this.f40150a.mo56233j());
        if (!(a == null || (j = o66.m70170j(d362, mo55150l(a, false))) == null)) {
            d362 = j;
        }
        if (!protoBuf$Type.hasClassName()) {
            return d362;
        }
        return this.f40150a.mo56226c().mo52453t().mo51244a(v24.m73043a(this.f40150a.mo56230g(), protoBuf$Type.getClassName()), d362);
    }

    /* renamed from: o */
    public final rz6 mo55151o(List<? extends pz6> list, C6983dm dmVar, yz6 yz6, d31 d31) {
        ArrayList arrayList = new ArrayList(dk0.m43495u(list, 10));
        for (pz6 a : list) {
            arrayList.add(a.mo65408a(dmVar, yz6, d31));
        }
        return rz6.f44504d.mo65782g(dk0.m43497w(arrayList));
    }

    /* renamed from: p */
    public final d36 mo55152p(xc3 xc3) {
        xc3 type;
        u82 u82;
        f17 f17 = (f17) CollectionsKt___CollectionsKt.m47342m0(ce2.m56406l(xc3));
        u82 u822 = null;
        if (f17 == null || (type = f17.getType()) == null) {
            return null;
        }
        eg0 d = type.mo51134H0().mo51180d();
        if (d != null) {
            u82 = DescriptorUtilsKt.m62447h(d);
        } else {
            u82 = null;
        }
        if (type.mo51132F0().size() != 1 || (!vx2.m53586b(u82, C7395c.f39108m) && !vx2.m53586b(u82, k07.f38834a))) {
            return (d36) xc3;
        }
        xc3 type2 = ((f17) CollectionsKt___CollectionsKt.m47355z0(type.mo51132F0())).getType();
        vx2.m53590f(type2, "continuationArgumentType.arguments.single().type");
        d31 e = this.f40150a.mo56228e();
        if (!(e instanceof C7420a)) {
            e = null;
        }
        C7420a aVar = (C7420a) e;
        if (aVar != null) {
            u822 = DescriptorUtilsKt.m62443d(aVar);
        }
        if (vx2.m53586b(u822, le6.f40604a)) {
            return mo55145g(xc3, type2);
        }
        return mo55145g(xc3, type2);
    }

    /* renamed from: q */
    public final xc3 mo55153q(ProtoBuf$Type protoBuf$Type) {
        vx2.m53591g(protoBuf$Type, "proto");
        if (!protoBuf$Type.hasFlexibleTypeCapabilitiesId()) {
            return mo55150l(protoBuf$Type, true);
        }
        String string = this.f40150a.mo56230g().getString(protoBuf$Type.getFlexibleTypeCapabilitiesId());
        d36 n = m62558n(this, protoBuf$Type, false, 2, (Object) null);
        ProtoBuf$Type c = cy4.m56598c(protoBuf$Type, this.f40150a.mo56233j());
        vx2.m53588d(c);
        return this.f40150a.mo56226c().mo52445l().mo51842a(protoBuf$Type, string, n, m62558n(this, c, false, 2, (Object) null));
    }

    /* renamed from: r */
    public final f17 mo55154r(a17 a17, ProtoBuf$Type.Argument argument) {
        if (argument.getProjection() != ProtoBuf$Type.Argument.Projection.STAR) {
            yx4 yx4 = yx4.f46285a;
            ProtoBuf$Type.Argument.Projection projection = argument.getProjection();
            vx2.m53590f(projection, "typeArgumentProto.projection");
            Variance c = yx4.mo67187c(projection);
            ProtoBuf$Type m = cy4.m56608m(argument, this.f40150a.mo56233j());
            if (m != null) {
                return new h17(c, mo55153q(m));
            }
            return new h17(nr1.m70033d(ErrorTypeKind.NO_RECORDED_TYPE, argument.toString()));
        } else if (a17 == null) {
            return new e86(this.f40150a.mo56226c().mo52449p().mo51535k());
        } else {
            return new StarProjectionImpl(a17);
        }
    }

    /* renamed from: s */
    public final yz6 mo55155s(ProtoBuf$Type protoBuf$Type) {
        eg0 eg0;
        T t;
        if (protoBuf$Type.hasClassName()) {
            eg0 = this.f40154e.invoke(Integer.valueOf(protoBuf$Type.getClassName()));
            if (eg0 == null) {
                eg0 = m62559t(this, protoBuf$Type, protoBuf$Type.getClassName());
            }
        } else if (protoBuf$Type.hasTypeParameter()) {
            eg0 = mo55149k(protoBuf$Type.getTypeParameter());
            if (eg0 == null) {
                return nr1.f43548a.mo62785e(ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, String.valueOf(protoBuf$Type.getTypeParameter()), this.f40153d);
            }
        } else if (protoBuf$Type.hasTypeParameterName()) {
            String string = this.f40150a.mo56230g().getString(protoBuf$Type.getTypeParameterName());
            Iterator<T> it = mo55148j().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (vx2.m53586b(((a17) t).getName().mo65594d(), string)) {
                    break;
                }
            }
            eg0 = (a17) t;
            if (eg0 == null) {
                return nr1.f43548a.mo62785e(ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, string, this.f40150a.mo56228e().toString());
            }
        } else if (!protoBuf$Type.hasTypeAliasName()) {
            return nr1.f43548a.mo62785e(ErrorTypeKind.UNKNOWN_TYPE, new String[0]);
        } else {
            eg0 = this.f40155f.invoke(Integer.valueOf(protoBuf$Type.getTypeAliasName()));
            if (eg0 == null) {
                eg0 = m62559t(this, protoBuf$Type, protoBuf$Type.getTypeAliasName());
            }
        }
        yz6 g = eg0.mo50046g();
        vx2.m53590f(g, "classifier.typeConstructor");
        return g;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f40152c);
        if (this.f40151b == null) {
            str = "";
        } else {
            str = ". Child of " + this.f40151b.f40152c;
        }
        sb.append(str);
        return sb.toString();
    }
}
