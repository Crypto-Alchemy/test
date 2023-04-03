package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.C6177b;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.web3j.abi.datatypes.Int;
import org.web3j.ens.contracts.generated.PublicResolver;

/* compiled from: reflectClassUtil.kt */
public final class ReflectClassUtilKt {

    /* renamed from: a */
    public static final List<q83<? extends Object>> f39380a;

    /* renamed from: b */
    public static final Map<Class<? extends Object>, Class<? extends Object>> f39381b;

    /* renamed from: c */
    public static final Map<Class<? extends Object>, Class<? extends Object>> f39382c;

    /* renamed from: d */
    public static final Map<Class<? extends nd2<?>>, Integer> f39383d;

    static {
        int i = 0;
        List<q83<? extends Object>> m = ck0.m33065m(ua5.m52727b(Boolean.TYPE), ua5.m52727b(Byte.TYPE), ua5.m52727b(Character.TYPE), ua5.m52727b(Double.TYPE), ua5.m52727b(Float.TYPE), ua5.m52727b(Integer.TYPE), ua5.m52727b(Long.TYPE), ua5.m52727b(Short.TYPE));
        f39380a = m;
        ArrayList arrayList = new ArrayList(dk0.m43495u(m, 10));
        for (q83 q83 : m) {
            arrayList.add(wy6.m54142a(x73.m54254c(q83), x73.m54255d(q83)));
        }
        f39381b = C6177b.m47369q(arrayList);
        List<q83<? extends Object>> list = f39380a;
        ArrayList arrayList2 = new ArrayList(dk0.m43495u(list, 10));
        for (q83 q832 : list) {
            arrayList2.add(wy6.m54142a(x73.m54255d(q832), x73.m54254c(q832)));
        }
        f39382c = C6177b.m47369q(arrayList2);
        List m2 = ck0.m33065m(pc2.class, rc2.class, fd2.class, id2.class, kd2.class, md2.class, od2.class, pd2.class, qd2.class, rd2.class, qc2.class, sc2.class, tc2.class, uc2.class, vc2.class, wc2.class, xc2.class, yc2.class, zc2.class, ad2.class, cd2.class, dd2.class, ed2.class);
        ArrayList arrayList3 = new ArrayList(dk0.m43495u(m2, 10));
        for (Object next : m2) {
            int i2 = i + 1;
            if (i < 0) {
                ck0.m33072t();
            }
            arrayList3.add(wy6.m54142a((Class) next, Integer.valueOf(i)));
            i = i2;
        }
        f39383d = C6177b.m47369q(arrayList3);
    }

    /* renamed from: a */
    public static final nf0 m60593a(Class<?> cls) {
        boolean z;
        nf0 nf0;
        nf0 a;
        vx2.m53591g(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        } else if (!cls.isArray()) {
            if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
                String simpleName = cls.getSimpleName();
                vx2.m53590f(simpleName, "simpleName");
                if (simpleName.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    Class<?> declaringClass = cls.getDeclaringClass();
                    if (declaringClass == null || (a = m60593a(declaringClass)) == null || (nf0 = a.mo62675d(r24.m71445h(cls.getSimpleName()))) == null) {
                        nf0 = nf0.m69751m(new u82(cls.getName()));
                    }
                    vx2.m53590f(nf0, "declaringClass?.classId?…Id.topLevel(FqName(name))");
                    return nf0;
                }
            }
            u82 u82 = new u82(cls.getName());
            return new nf0(u82.mo66198e(), u82.m72648k(u82.mo66201g()), true);
        } else {
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
    }

    /* renamed from: b */
    public static final String m60594b(Class<?> cls) {
        vx2.m53591g(cls, "<this>");
        if (cls.isPrimitive()) {
            String name = cls.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return "D";
                    }
                    break;
                case 104431:
                    if (name.equals(Int.TYPE_NAME)) {
                        return "I";
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return "B";
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return "C";
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return "J";
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return "V";
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return "Z";
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return "F";
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return "S";
                    }
                    break;
            }
            throw new IllegalArgumentException("Unsupported primitive type: " + cls);
        } else if (cls.isArray()) {
            String name2 = cls.getName();
            vx2.m53590f(name2, PublicResolver.FUNC_NAME);
            return yb6.m74331H(name2, '.', '/', false, 4, (Object) null);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('L');
            String name3 = cls.getName();
            vx2.m53590f(name3, PublicResolver.FUNC_NAME);
            sb.append(yb6.m74331H(name3, '.', '/', false, 4, (Object) null));
            sb.append(';');
            return sb.toString();
        }
    }

    /* renamed from: c */
    public static final Integer m60595c(Class<?> cls) {
        vx2.m53591g(cls, "<this>");
        return f39383d.get(cls);
    }

    /* renamed from: d */
    public static final List<Type> m60596d(Type type) {
        vx2.m53591g(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return ck0.m33062j();
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return SequencesKt___SequencesKt.m63020D(SequencesKt___SequencesKt.m63029s(SequencesKt__SequencesKt.m63015j(type, ReflectClassUtilKt$parameterizedTypeArguments$1.INSTANCE), ReflectClassUtilKt$parameterizedTypeArguments$2.INSTANCE));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        vx2.m53590f(actualTypeArguments, "actualTypeArguments");
        return ArraysKt___ArraysKt.m47291q0(actualTypeArguments);
    }

    /* renamed from: e */
    public static final Class<?> m60597e(Class<?> cls) {
        vx2.m53591g(cls, "<this>");
        return f39381b.get(cls);
    }

    /* renamed from: f */
    public static final ClassLoader m60598f(Class<?> cls) {
        vx2.m53591g(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        vx2.m53590f(systemClassLoader, "getSystemClassLoader()");
        return systemClassLoader;
    }

    /* renamed from: g */
    public static final Class<?> m60599g(Class<?> cls) {
        vx2.m53591g(cls, "<this>");
        return f39382c.get(cls);
    }

    /* renamed from: h */
    public static final boolean m60600h(Class<?> cls) {
        vx2.m53591g(cls, "<this>");
        return Enum.class.isAssignableFrom(cls);
    }
}
