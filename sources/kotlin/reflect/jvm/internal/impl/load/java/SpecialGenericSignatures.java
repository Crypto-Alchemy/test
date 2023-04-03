package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C6177b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.web3j.ens.contracts.generated.PublicResolver;

/* compiled from: SpecialGenericSignatures.kt */
public class SpecialGenericSignatures {

    /* renamed from: a */
    public static final C7449a f39411a = new C7449a((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final List<C7449a.C7450a> f39412b;

    /* renamed from: c */
    public static final List<String> f39413c;

    /* renamed from: d */
    public static final List<String> f39414d;

    /* renamed from: e */
    public static final Map<C7449a.C7450a, TypeSafeBarrierDescription> f39415e;

    /* renamed from: f */
    public static final Map<String, TypeSafeBarrierDescription> f39416f;

    /* renamed from: g */
    public static final Set<r24> f39417g;

    /* renamed from: h */
    public static final Set<String> f39418h;

    /* renamed from: i */
    public static final C7449a.C7450a f39419i;

    /* renamed from: j */
    public static final Map<C7449a.C7450a, r24> f39420j;

    /* renamed from: k */
    public static final Map<String, r24> f39421k;

    /* renamed from: l */
    public static final List<r24> f39422l;

    /* renamed from: m */
    public static final Map<r24, r24> f39423m;

    /* compiled from: SpecialGenericSignatures.kt */
    public enum SpecialSignatureInfo {
        ONE_COLLECTION_PARAMETER("Ljava/util/Collection<+Ljava/lang/Object;>;", false),
        OBJECT_PARAMETER_NON_GENERIC((String) null, true),
        OBJECT_PARAMETER_GENERIC("Ljava/lang/Object;", true);
        
        private final boolean isObjectReplacedWithTypeParameter;
        private final String valueParametersSignature;

        /* access modifiers changed from: public */
        SpecialSignatureInfo(String str, boolean z) {
            this.valueParametersSignature = str;
            this.isObjectReplacedWithTypeParameter = z;
        }
    }

    /* compiled from: SpecialGenericSignatures.kt */
    public enum TypeSafeBarrierDescription {
        NULL((String) null),
        INDEX(-1),
        FALSE(Boolean.FALSE);
        
        private final Object defaultValue;

        /* compiled from: SpecialGenericSignatures.kt */
        public static final class MAP_GET_OR_DEFAULT extends TypeSafeBarrierDescription {
            public MAP_GET_OR_DEFAULT(String str, int i) {
                super(str, i, (Object) null, (DefaultConstructorMarker) null);
            }
        }

        /* access modifiers changed from: public */
        TypeSafeBarrierDescription(Object obj) {
            this.defaultValue = obj;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a */
    /* compiled from: SpecialGenericSignatures.kt */
    public static final class C7449a {

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a */
        /* compiled from: SpecialGenericSignatures.kt */
        public static final class C7450a {

            /* renamed from: a */
            public final r24 f39426a;

            /* renamed from: b */
            public final String f39427b;

            public C7450a(r24 r24, String str) {
                vx2.m53591g(r24, PublicResolver.FUNC_NAME);
                vx2.m53591g(str, "signature");
                this.f39426a = r24;
                this.f39427b = str;
            }

            /* renamed from: a */
            public final r24 mo53472a() {
                return this.f39426a;
            }

            /* renamed from: b */
            public final String mo53473b() {
                return this.f39427b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C7450a)) {
                    return false;
                }
                C7450a aVar = (C7450a) obj;
                return vx2.m53586b(this.f39426a, aVar.f39426a) && vx2.m53586b(this.f39427b, aVar.f39427b);
            }

            public int hashCode() {
                return (this.f39426a.hashCode() * 31) + this.f39427b.hashCode();
            }

            public String toString() {
                return "NameAndSignature(name=" + this.f39426a + ", signature=" + this.f39427b + ')';
            }
        }

        public C7449a() {
        }

        public /* synthetic */ C7449a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final r24 mo53460b(r24 r24) {
            vx2.m53591g(r24, PublicResolver.FUNC_NAME);
            return mo53464f().get(r24);
        }

        /* renamed from: c */
        public final List<String> mo53461c() {
            return SpecialGenericSignatures.f39413c;
        }

        /* renamed from: d */
        public final Set<r24> mo53462d() {
            return SpecialGenericSignatures.f39417g;
        }

        /* renamed from: e */
        public final Set<String> mo53463e() {
            return SpecialGenericSignatures.f39418h;
        }

        /* renamed from: f */
        public final Map<r24, r24> mo53464f() {
            return SpecialGenericSignatures.f39423m;
        }

        /* renamed from: g */
        public final List<r24> mo53465g() {
            return SpecialGenericSignatures.f39422l;
        }

        /* renamed from: h */
        public final C7450a mo53466h() {
            return SpecialGenericSignatures.f39419i;
        }

        /* renamed from: i */
        public final Map<String, TypeSafeBarrierDescription> mo53467i() {
            return SpecialGenericSignatures.f39416f;
        }

        /* renamed from: j */
        public final Map<String, r24> mo53468j() {
            return SpecialGenericSignatures.f39421k;
        }

        /* renamed from: k */
        public final boolean mo53469k(r24 r24) {
            vx2.m53591g(r24, "<this>");
            return mo53465g().contains(r24);
        }

        /* renamed from: l */
        public final SpecialSignatureInfo mo53470l(String str) {
            vx2.m53591g(str, "builtinSignature");
            if (mo53461c().contains(str)) {
                return SpecialSignatureInfo.ONE_COLLECTION_PARAMETER;
            }
            if (((TypeSafeBarrierDescription) C6177b.m47362j(mo53467i(), str)) == TypeSafeBarrierDescription.NULL) {
                return SpecialSignatureInfo.OBJECT_PARAMETER_GENERIC;
            }
            return SpecialSignatureInfo.OBJECT_PARAMETER_NON_GENERIC;
        }

        /* renamed from: m */
        public final C7450a mo53471m(String str, String str2, String str3, String str4) {
            r24 h = r24.m71445h(str2);
            vx2.m53590f(h, "identifier(name)");
            SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.f39611a;
            return new C7450a(h, signatureBuildingComponents.mo53818k(str, str2 + '(' + str3 + ')' + str4));
        }
    }

    static {
        Set<String> h = ny5.m49098h("containsAll", "removeAll", "retainAll");
        ArrayList<C7449a.C7450a> arrayList = new ArrayList<>(dk0.m43495u(h, 10));
        for (String a : h) {
            C7449a aVar = f39411a;
            String desc = JvmPrimitiveType.BOOLEAN.getDesc();
            vx2.m53590f(desc, "BOOLEAN.desc");
            arrayList.add(aVar.mo53471m("java/util/Collection", a, "Ljava/util/Collection;", desc));
        }
        f39412b = arrayList;
        ArrayList arrayList2 = new ArrayList(dk0.m43495u(arrayList, 10));
        for (C7449a.C7450a b : arrayList) {
            arrayList2.add(b.mo53473b());
        }
        f39413c = arrayList2;
        List<C7449a.C7450a> list = f39412b;
        ArrayList arrayList3 = new ArrayList(dk0.m43495u(list, 10));
        for (C7449a.C7450a a2 : list) {
            arrayList3.add(a2.mo53472a().mo65594d());
        }
        f39414d = arrayList3;
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.f39611a;
        C7449a aVar2 = f39411a;
        String i = signatureBuildingComponents.mo53816i("Collection");
        JvmPrimitiveType jvmPrimitiveType = JvmPrimitiveType.BOOLEAN;
        String desc2 = jvmPrimitiveType.getDesc();
        vx2.m53590f(desc2, "BOOLEAN.desc");
        C7449a.C7450a a3 = aVar2.mo53471m(i, "contains", "Ljava/lang/Object;", desc2);
        TypeSafeBarrierDescription typeSafeBarrierDescription = TypeSafeBarrierDescription.FALSE;
        String i2 = signatureBuildingComponents.mo53816i("Collection");
        String desc3 = jvmPrimitiveType.getDesc();
        vx2.m53590f(desc3, "BOOLEAN.desc");
        String i3 = signatureBuildingComponents.mo53816i("Map");
        String desc4 = jvmPrimitiveType.getDesc();
        vx2.m53590f(desc4, "BOOLEAN.desc");
        String i4 = signatureBuildingComponents.mo53816i("Map");
        String desc5 = jvmPrimitiveType.getDesc();
        vx2.m53590f(desc5, "BOOLEAN.desc");
        String i5 = signatureBuildingComponents.mo53816i("Map");
        String desc6 = jvmPrimitiveType.getDesc();
        vx2.m53590f(desc6, "BOOLEAN.desc");
        C7449a.C7450a a4 = aVar2.mo53471m(signatureBuildingComponents.mo53816i("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        TypeSafeBarrierDescription typeSafeBarrierDescription2 = TypeSafeBarrierDescription.NULL;
        String i6 = signatureBuildingComponents.mo53816i("List");
        JvmPrimitiveType jvmPrimitiveType2 = JvmPrimitiveType.INT;
        String desc7 = jvmPrimitiveType2.getDesc();
        vx2.m53590f(desc7, "INT.desc");
        C7449a.C7450a a5 = aVar2.mo53471m(i6, "indexOf", "Ljava/lang/Object;", desc7);
        TypeSafeBarrierDescription typeSafeBarrierDescription3 = TypeSafeBarrierDescription.INDEX;
        String i7 = signatureBuildingComponents.mo53816i("List");
        String desc8 = jvmPrimitiveType2.getDesc();
        vx2.m53590f(desc8, "INT.desc");
        Map<C7449a.C7450a, TypeSafeBarrierDescription> l = C6177b.m47364l(wy6.m54142a(a3, typeSafeBarrierDescription), wy6.m54142a(aVar2.mo53471m(i2, "remove", "Ljava/lang/Object;", desc3), typeSafeBarrierDescription), wy6.m54142a(aVar2.mo53471m(i3, "containsKey", "Ljava/lang/Object;", desc4), typeSafeBarrierDescription), wy6.m54142a(aVar2.mo53471m(i4, "containsValue", "Ljava/lang/Object;", desc5), typeSafeBarrierDescription), wy6.m54142a(aVar2.mo53471m(i5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", desc6), typeSafeBarrierDescription), wy6.m54142a(aVar2.mo53471m(signatureBuildingComponents.mo53816i("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), TypeSafeBarrierDescription.MAP_GET_OR_DEFAULT), wy6.m54142a(a4, typeSafeBarrierDescription2), wy6.m54142a(aVar2.mo53471m(signatureBuildingComponents.mo53816i("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), typeSafeBarrierDescription2), wy6.m54142a(a5, typeSafeBarrierDescription3), wy6.m54142a(aVar2.mo53471m(i7, "lastIndexOf", "Ljava/lang/Object;", desc8), typeSafeBarrierDescription3));
        f39415e = l;
        LinkedHashMap linkedHashMap = new LinkedHashMap(ao3.m31893e(l.size()));
        for (Map.Entry entry : l.entrySet()) {
            linkedHashMap.put(((C7449a.C7450a) entry.getKey()).mo53473b(), entry.getValue());
        }
        f39416f = linkedHashMap;
        Set<T> k = oy5.m49611k(f39415e.keySet(), f39412b);
        ArrayList arrayList4 = new ArrayList(dk0.m43495u(k, 10));
        for (T a6 : k) {
            arrayList4.add(a6.mo53472a());
        }
        f39417g = CollectionsKt___CollectionsKt.m47315O0(arrayList4);
        ArrayList arrayList5 = new ArrayList(dk0.m43495u(k, 10));
        for (T b2 : k) {
            arrayList5.add(b2.mo53473b());
        }
        f39418h = CollectionsKt___CollectionsKt.m47315O0(arrayList5);
        C7449a aVar3 = f39411a;
        JvmPrimitiveType jvmPrimitiveType3 = JvmPrimitiveType.INT;
        String desc9 = jvmPrimitiveType3.getDesc();
        vx2.m53590f(desc9, "INT.desc");
        C7449a.C7450a a7 = aVar3.mo53471m("java/util/List", "removeAt", desc9, "Ljava/lang/Object;");
        f39419i = a7;
        SignatureBuildingComponents signatureBuildingComponents2 = SignatureBuildingComponents.f39611a;
        String h2 = signatureBuildingComponents2.mo53815h("Number");
        String desc10 = JvmPrimitiveType.BYTE.getDesc();
        vx2.m53590f(desc10, "BYTE.desc");
        String h3 = signatureBuildingComponents2.mo53815h("Number");
        String desc11 = JvmPrimitiveType.SHORT.getDesc();
        vx2.m53590f(desc11, "SHORT.desc");
        String h4 = signatureBuildingComponents2.mo53815h("Number");
        String desc12 = jvmPrimitiveType3.getDesc();
        vx2.m53590f(desc12, "INT.desc");
        String h5 = signatureBuildingComponents2.mo53815h("Number");
        String desc13 = JvmPrimitiveType.LONG.getDesc();
        vx2.m53590f(desc13, "LONG.desc");
        String h6 = signatureBuildingComponents2.mo53815h("Number");
        String desc14 = JvmPrimitiveType.FLOAT.getDesc();
        vx2.m53590f(desc14, "FLOAT.desc");
        String h7 = signatureBuildingComponents2.mo53815h("Number");
        String desc15 = JvmPrimitiveType.DOUBLE.getDesc();
        vx2.m53590f(desc15, "DOUBLE.desc");
        String h8 = signatureBuildingComponents2.mo53815h("CharSequence");
        String desc16 = jvmPrimitiveType3.getDesc();
        vx2.m53590f(desc16, "INT.desc");
        String desc17 = JvmPrimitiveType.CHAR.getDesc();
        vx2.m53590f(desc17, "CHAR.desc");
        Map<C7449a.C7450a, r24> l2 = C6177b.m47364l(wy6.m54142a(aVar3.mo53471m(h2, "toByte", "", desc10), r24.m71445h("byteValue")), wy6.m54142a(aVar3.mo53471m(h3, "toShort", "", desc11), r24.m71445h("shortValue")), wy6.m54142a(aVar3.mo53471m(h4, "toInt", "", desc12), r24.m71445h("intValue")), wy6.m54142a(aVar3.mo53471m(h5, "toLong", "", desc13), r24.m71445h("longValue")), wy6.m54142a(aVar3.mo53471m(h6, "toFloat", "", desc14), r24.m71445h("floatValue")), wy6.m54142a(aVar3.mo53471m(h7, "toDouble", "", desc15), r24.m71445h("doubleValue")), wy6.m54142a(a7, r24.m71445h("remove")), wy6.m54142a(aVar3.mo53471m(h8, "get", desc16, desc17), r24.m71445h("charAt")));
        f39420j = l2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(ao3.m31893e(l2.size()));
        for (Map.Entry entry2 : l2.entrySet()) {
            linkedHashMap2.put(((C7449a.C7450a) entry2.getKey()).mo53473b(), entry2.getValue());
        }
        f39421k = linkedHashMap2;
        Set<C7449a.C7450a> keySet = f39420j.keySet();
        ArrayList arrayList6 = new ArrayList(dk0.m43495u(keySet, 10));
        for (C7449a.C7450a a8 : keySet) {
            arrayList6.add(a8.mo53472a());
        }
        f39422l = arrayList6;
        Set<Map.Entry<C7449a.C7450a, r24>> entrySet = f39420j.entrySet();
        ArrayList<Pair> arrayList7 = new ArrayList<>(dk0.m43495u(entrySet, 10));
        for (Map.Entry entry3 : entrySet) {
            arrayList7.add(new Pair(((C7449a.C7450a) entry3.getKey()).mo53472a(), entry3.getValue()));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(d75.m43382d(ao3.m31893e(dk0.m43495u(arrayList7, 10)), 16));
        for (Pair pair : arrayList7) {
            linkedHashMap3.put((r24) pair.getSecond(), (r24) pair.getFirst());
        }
        f39423m = linkedHashMap3;
    }
}
