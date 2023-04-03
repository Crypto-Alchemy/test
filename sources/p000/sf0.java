package p000;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C6177b;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsKt;
import org.web3j.abi.datatypes.Int;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0017\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0010B\u0013\u0012\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u000f¢\u0006\u0004\b-\u0010.J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0017J\u0013\u0010\n\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\u001e\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\u00020\u00078VX\u0004¢\u0006\f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\u001a\u0010&\u001a\u00020\u00078VX\u0004¢\u0006\f\u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010!R\u001a\u0010)\u001a\u00020\u00078VX\u0004¢\u0006\f\u0012\u0004\b(\u0010#\u001a\u0004\b'\u0010!R\u001a\u0010,\u001a\u00020\u00078VX\u0004¢\u0006\f\u0012\u0004\b+\u0010#\u001a\u0004\b*\u0010!¨\u00060"}, mo44877d2 = {"Lsf0;", "Lq83;", "", "Ldf0;", "", "p", "value", "", "h", "other", "equals", "", "hashCode", "", "toString", "Ljava/lang/Class;", "a", "Ljava/lang/Class;", "k", "()Ljava/lang/Class;", "jClass", "l", "()Ljava/lang/String;", "qualifiedName", "", "", "getAnnotations", "()Ljava/util/List;", "annotations", "f", "()Ljava/lang/Object;", "objectInstance", "isAbstract", "()Z", "isAbstract$annotations", "()V", "c", "isSealed$annotations", "isSealed", "i", "isInner$annotations", "isInner", "q", "isValue$annotations", "isValue", "<init>", "(Ljava/lang/Class;)V", "d", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: sf0 */
/* compiled from: ClassReference.kt */
public final class sf0 implements q83<Object>, df0 {

    /* renamed from: d */
    public static final C6483a f33843d = new C6483a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final Map<Class<? extends nd2<?>>, Integer> f33844e;

    /* renamed from: g */
    public static final HashMap<String, String> f33845g;

    /* renamed from: k */
    public static final HashMap<String, String> f33846k;

    /* renamed from: r */
    public static final HashMap<String, String> f33847r;

    /* renamed from: s */
    public static final Map<String, String> f33848s;

    /* renamed from: a */
    public final Class<?> f33849a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002J\u001c\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002R,\u0010\f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\n0\u0002\u0012\u0004\u0012\u00020\u000b0\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR0\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000ej\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R0\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000ej\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R0\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000ej\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\r¨\u0006\u0017"}, mo44877d2 = {"Lsf0$a;", "", "Ljava/lang/Class;", "jClass", "", "a", "value", "", "b", "", "Lnd2;", "", "FUNCTION_CLASSES", "Ljava/util/Map;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "classFqNames", "Ljava/util/HashMap;", "primitiveFqNames", "primitiveWrapperFqNames", "simpleNames", "<init>", "()V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: sf0$a */
    /* compiled from: ClassReference.kt */
    public static final class C6483a {
        public C6483a() {
        }

        public /* synthetic */ C6483a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String mo47751a(Class<?> cls) {
            String str;
            vx2.m53591g(cls, "jClass");
            String str2 = null;
            if (cls.isAnonymousClass() || cls.isLocalClass()) {
                return null;
            }
            if (cls.isArray()) {
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (str = (String) sf0.f33847r.get(componentType.getName())) != null) {
                    str2 = str + "Array";
                }
                if (str2 == null) {
                    return "kotlin.Array";
                }
                return str2;
            }
            String str3 = (String) sf0.f33847r.get(cls.getName());
            if (str3 == null) {
                return cls.getCanonicalName();
            }
            return str3;
        }

        /* renamed from: b */
        public final boolean mo47752b(Object obj, Class<?> cls) {
            vx2.m53591g(cls, "jClass");
            Map o = sf0.f33844e;
            vx2.m53589e(o, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) o.get(cls);
            if (num != null) {
                return t07.m52034m(obj, num.intValue());
            }
            if (cls.isPrimitive()) {
                cls = x73.m54254c(x73.m54256e(cls));
            }
            return cls.isInstance(obj);
        }
    }

    static {
        int i = 0;
        List m = ck0.m33065m(pc2.class, rc2.class, fd2.class, id2.class, kd2.class, md2.class, od2.class, pd2.class, qd2.class, rd2.class, qc2.class, sc2.class, tc2.class, uc2.class, vc2.class, wc2.class, xc2.class, yc2.class, zc2.class, ad2.class, cd2.class, dd2.class, ed2.class);
        ArrayList arrayList = new ArrayList(dk0.m43495u(m, 10));
        for (Object next : m) {
            int i2 = i + 1;
            if (i < 0) {
                ck0.m33072t();
            }
            arrayList.add(wy6.m54142a((Class) next, Integer.valueOf(i)));
            i = i2;
        }
        f33844e = C6177b.m47369q(arrayList);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put(Int.TYPE_NAME, "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f33845g = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f33846k = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        vx2.m53590f(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            vx2.m53590f(str, "kotlinName");
            sb.append(StringsKt__StringsKt.m63076O0(str, '.', (String) null, 2, (Object) null));
            sb.append("CompanionObject");
            String sb2 = sb.toString();
            Pair a = wy6.m54142a(sb2, str + ".Companion");
            hashMap3.put(a.getFirst(), a.getSecond());
        }
        for (Map.Entry next2 : f33844e.entrySet()) {
            int intValue = ((Number) next2.getValue()).intValue();
            String name = ((Class) next2.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        f33847r = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(ao3.m31893e(hashMap3.size()));
        for (Map.Entry entry : hashMap3.entrySet()) {
            linkedHashMap.put(entry.getKey(), StringsKt__StringsKt.m63076O0((String) entry.getValue(), '.', (String) null, 2, (Object) null));
        }
        f33848s = linkedHashMap;
    }

    public sf0(Class<?> cls) {
        vx2.m53591g(cls, "jClass");
        this.f33849a = cls;
    }

    /* renamed from: c */
    public boolean mo46997c() {
        mo47749p();
        throw new KotlinNothingValueException();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof sf0) || !vx2.m53586b(x73.m54254c(this), x73.m54254c((q83) obj))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public Object mo46998f() {
        mo47749p();
        throw new KotlinNothingValueException();
    }

    public List<Annotation> getAnnotations() {
        mo47749p();
        throw new KotlinNothingValueException();
    }

    /* renamed from: h */
    public boolean mo46999h(Object obj) {
        return f33843d.mo47752b(obj, mo41920k());
    }

    public int hashCode() {
        return x73.m54254c(this).hashCode();
    }

    /* renamed from: i */
    public boolean mo47000i() {
        mo47749p();
        throw new KotlinNothingValueException();
    }

    public boolean isAbstract() {
        mo47749p();
        throw new KotlinNothingValueException();
    }

    /* renamed from: k */
    public Class<?> mo41920k() {
        return this.f33849a;
    }

    /* renamed from: l */
    public String mo47002l() {
        return f33843d.mo47751a(mo41920k());
    }

    /* renamed from: p */
    public final Void mo47749p() {
        throw new KotlinReflectionNotSupportedError();
    }

    /* renamed from: q */
    public boolean mo47003q() {
        mo47749p();
        throw new KotlinNothingValueException();
    }

    public String toString() {
        return mo41920k().toString() + " (Kotlin reflection is not available)";
    }
}
