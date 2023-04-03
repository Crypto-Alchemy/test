package p000;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.C7616d;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import p000.b42;
import p000.b83;

/* renamed from: i83 */
/* compiled from: JvmProtoBufUtil.kt */
public final class i83 {

    /* renamed from: a */
    public static final i83 f38338a = new i83();

    /* renamed from: b */
    public static final C7616d f38339b;

    static {
        C7616d d = C7616d.m62009d();
        JvmProtoBuf.m61742a(d);
        vx2.m53590f(d, "newInstance().apply(JvmP…f::registerAllExtensions)");
        f38339b = d;
    }

    /* renamed from: d */
    public static /* synthetic */ b83.C6854a m58869d(i83 i83, ProtoBuf$Property protoBuf$Property, t24 t24, w17 w17, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        return i83.mo52419c(protoBuf$Property, t24, w17, z);
    }

    /* renamed from: f */
    public static final boolean m58870f(ProtoBuf$Property protoBuf$Property) {
        vx2.m53591g(protoBuf$Property, "proto");
        b42.C6845b a = a83.f36402a.mo50119a();
        Object extension = protoBuf$Property.getExtension(JvmProtoBuf.f39868e);
        vx2.m53590f(extension, "proto.getExtension(JvmProtoBuf.flags)");
        Boolean g = a.mo50465d(((Number) extension).intValue());
        vx2.m53590f(g, "JvmFlags.IS_MOVED_FROM_I…nsion(JvmProtoBuf.flags))");
        return g.booleanValue();
    }

    /* renamed from: h */
    public static final Pair<d83, ProtoBuf$Class> m58871h(byte[] bArr, String[] strArr) {
        vx2.m53591g(bArr, "bytes");
        vx2.m53591g(strArr, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new Pair<>(f38338a.mo52422k(byteArrayInputStream, strArr), ProtoBuf$Class.parseFrom(byteArrayInputStream, f38339b));
    }

    /* renamed from: i */
    public static final Pair<d83, ProtoBuf$Class> m58872i(String[] strArr, String[] strArr2) {
        vx2.m53591g(strArr, "data");
        vx2.m53591g(strArr2, "strings");
        byte[] e = v10.m73024e(strArr);
        vx2.m53590f(e, "decodeBytes(data)");
        return m58871h(e, strArr2);
    }

    /* renamed from: j */
    public static final Pair<d83, ProtoBuf$Function> m58873j(String[] strArr, String[] strArr2) {
        vx2.m53591g(strArr, "data");
        vx2.m53591g(strArr2, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(v10.m73024e(strArr));
        return new Pair<>(f38338a.mo52422k(byteArrayInputStream, strArr2), ProtoBuf$Function.parseFrom(byteArrayInputStream, f38339b));
    }

    /* renamed from: l */
    public static final Pair<d83, ProtoBuf$Package> m58874l(byte[] bArr, String[] strArr) {
        vx2.m53591g(bArr, "bytes");
        vx2.m53591g(strArr, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new Pair<>(f38338a.mo52422k(byteArrayInputStream, strArr), ProtoBuf$Package.parseFrom(byteArrayInputStream, f38339b));
    }

    /* renamed from: m */
    public static final Pair<d83, ProtoBuf$Package> m58875m(String[] strArr, String[] strArr2) {
        vx2.m53591g(strArr, "data");
        vx2.m53591g(strArr2, "strings");
        byte[] e = v10.m73024e(strArr);
        vx2.m53590f(e, "decodeBytes(data)");
        return m58874l(e, strArr2);
    }

    /* renamed from: a */
    public final C7616d mo52417a() {
        return f38339b;
    }

    /* renamed from: b */
    public final b83.C6855b mo52418b(ProtoBuf$Constructor protoBuf$Constructor, t24 t24, w17 w17) {
        String str;
        String str2;
        vx2.m53591g(protoBuf$Constructor, "proto");
        vx2.m53591g(t24, "nameResolver");
        vx2.m53591g(w17, "typeTable");
        GeneratedMessageLite.C7604e<ProtoBuf$Constructor, JvmProtoBuf.JvmMethodSignature> eVar = JvmProtoBuf.f39864a;
        vx2.m53590f(eVar, "constructorSignature");
        JvmProtoBuf.JvmMethodSignature jvmMethodSignature = (JvmProtoBuf.JvmMethodSignature) wx4.m73751a(protoBuf$Constructor, eVar);
        if (jvmMethodSignature == null || !jvmMethodSignature.hasName()) {
            str = "<init>";
        } else {
            str = t24.getString(jvmMethodSignature.getName());
        }
        if (jvmMethodSignature == null || !jvmMethodSignature.hasDesc()) {
            List<ProtoBuf$ValueParameter> valueParameterList = protoBuf$Constructor.getValueParameterList();
            vx2.m53590f(valueParameterList, "proto.valueParameterList");
            ArrayList arrayList = new ArrayList(dk0.m43495u(valueParameterList, 10));
            for (ProtoBuf$ValueParameter protoBuf$ValueParameter : valueParameterList) {
                i83 i83 = f38338a;
                vx2.m53590f(protoBuf$ValueParameter, "it");
                String g = i83.mo52421g(cy4.m56609n(protoBuf$ValueParameter, w17), t24);
                if (g == null) {
                    return null;
                }
                arrayList.add(g);
            }
            str2 = CollectionsKt___CollectionsKt.m47338i0(arrayList, "", "(", ")V", 0, (CharSequence) null, (rc2) null, 56, (Object) null);
        } else {
            str2 = t24.getString(jvmMethodSignature.getDesc());
        }
        return new b83.C6855b(str, str2);
    }

    /* renamed from: c */
    public final b83.C6854a mo52419c(ProtoBuf$Property protoBuf$Property, t24 t24, w17 w17, boolean z) {
        JvmProtoBuf.JvmFieldSignature jvmFieldSignature;
        int i;
        String str;
        vx2.m53591g(protoBuf$Property, "proto");
        vx2.m53591g(t24, "nameResolver");
        vx2.m53591g(w17, "typeTable");
        GeneratedMessageLite.C7604e<ProtoBuf$Property, JvmProtoBuf.JvmPropertySignature> eVar = JvmProtoBuf.f39867d;
        vx2.m53590f(eVar, "propertySignature");
        JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) wx4.m73751a(protoBuf$Property, eVar);
        if (jvmPropertySignature == null) {
            return null;
        }
        if (jvmPropertySignature.hasField()) {
            jvmFieldSignature = jvmPropertySignature.getField();
        } else {
            jvmFieldSignature = null;
        }
        if (jvmFieldSignature == null && z) {
            return null;
        }
        if (jvmFieldSignature == null || !jvmFieldSignature.hasName()) {
            i = protoBuf$Property.getName();
        } else {
            i = jvmFieldSignature.getName();
        }
        if (jvmFieldSignature == null || !jvmFieldSignature.hasDesc()) {
            str = mo52421g(cy4.m56606k(protoBuf$Property, w17), t24);
            if (str == null) {
                return null;
            }
        } else {
            str = t24.getString(jvmFieldSignature.getDesc());
        }
        return new b83.C6854a(t24.getString(i), str);
    }

    /* renamed from: e */
    public final b83.C6855b mo52420e(ProtoBuf$Function protoBuf$Function, t24 t24, w17 w17) {
        int i;
        String str;
        ProtoBuf$Function protoBuf$Function2 = protoBuf$Function;
        t24 t242 = t24;
        w17 w172 = w17;
        vx2.m53591g(protoBuf$Function2, "proto");
        vx2.m53591g(t242, "nameResolver");
        vx2.m53591g(w172, "typeTable");
        GeneratedMessageLite.C7604e<ProtoBuf$Function, JvmProtoBuf.JvmMethodSignature> eVar = JvmProtoBuf.f39865b;
        vx2.m53590f(eVar, "methodSignature");
        JvmProtoBuf.JvmMethodSignature jvmMethodSignature = (JvmProtoBuf.JvmMethodSignature) wx4.m73751a(protoBuf$Function2, eVar);
        if (jvmMethodSignature == null || !jvmMethodSignature.hasName()) {
            i = protoBuf$Function.getName();
        } else {
            i = jvmMethodSignature.getName();
        }
        if (jvmMethodSignature == null || !jvmMethodSignature.hasDesc()) {
            List n = ck0.m33066n(cy4.m56603h(protoBuf$Function2, w172));
            List<ProtoBuf$ValueParameter> valueParameterList = protoBuf$Function.getValueParameterList();
            vx2.m53590f(valueParameterList, "proto.valueParameterList");
            ArrayList arrayList = new ArrayList(dk0.m43495u(valueParameterList, 10));
            for (ProtoBuf$ValueParameter protoBuf$ValueParameter : valueParameterList) {
                vx2.m53590f(protoBuf$ValueParameter, "it");
                arrayList.add(cy4.m56609n(protoBuf$ValueParameter, w172));
            }
            List<ProtoBuf$Type> u0 = CollectionsKt___CollectionsKt.m47350u0(n, arrayList);
            ArrayList arrayList2 = new ArrayList(dk0.m43495u(u0, 10));
            for (ProtoBuf$Type g : u0) {
                String g2 = f38338a.mo52421g(g, t242);
                if (g2 == null) {
                    return null;
                }
                arrayList2.add(g2);
            }
            String g3 = mo52421g(cy4.m56605j(protoBuf$Function2, w172), t242);
            if (g3 == null) {
                return null;
            }
            str = CollectionsKt___CollectionsKt.m47338i0(arrayList2, "", "(", ")", 0, (CharSequence) null, (rc2) null, 56, (Object) null) + g3;
        } else {
            str = t242.getString(jvmMethodSignature.getDesc());
        }
        return new b83.C6855b(t242.getString(i), str);
    }

    /* renamed from: g */
    public final String mo52421g(ProtoBuf$Type protoBuf$Type, t24 t24) {
        if (protoBuf$Type.hasClassName()) {
            return pf0.m71005b(t24.mo51404b(protoBuf$Type.getClassName()));
        }
        return null;
    }

    /* renamed from: k */
    public final d83 mo52422k(InputStream inputStream, String[] strArr) {
        JvmProtoBuf.StringTableTypes parseDelimitedFrom = JvmProtoBuf.StringTableTypes.parseDelimitedFrom(inputStream, f38339b);
        vx2.m53590f(parseDelimitedFrom, "parseDelimitedFrom(this, EXTENSION_REGISTRY)");
        return new d83(parseDelimitedFrom, strArr);
    }
}
