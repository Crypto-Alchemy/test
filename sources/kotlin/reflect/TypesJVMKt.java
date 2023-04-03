package kotlin.reflect;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import okhttp3.HttpUrl;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\u001a\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003\u001a\"\u0010\n\u001a\u00020\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0003\u001a\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002\"\u001e\u0010\u0012\u001a\u00020\u0003*\u00020\u00008FX\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\"\u001e\u0010\u0012\u001a\u00020\u0003*\u00020\b8BX\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, mo44877d2 = {"Lm93;", "", "forceWrapper", "Ljava/lang/reflect/Type;", "c", "Ljava/lang/Class;", "jClass", "", "Lq93;", "arguments", "e", "type", "", "h", "f", "(Lm93;)Ljava/lang/reflect/Type;", "getJavaType$annotations", "(Lm93;)V", "javaType", "g", "(Lq93;)Ljava/lang/reflect/Type;", "(Lq93;)V", "kotlin-stdlib"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* compiled from: TypesJVM.kt */
public final class TypesJVMKt {

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: kotlin.reflect.TypesJVMKt$a */
    /* compiled from: TypesJVM.kt */
    public /* synthetic */ class C6195a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f30991a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                kotlin.reflect.KVariance[] r0 = kotlin.reflect.KVariance.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.IN     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.INVARIANT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.OUT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f30991a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.TypesJVMKt.C6195a.<clinit>():void");
        }
    }

    /* renamed from: c */
    public static final Type m47444c(m93 m93, boolean z) {
        Class cls;
        int i;
        x83 d = m93.mo45705d();
        if (d instanceof o93) {
            return new z17((o93) d);
        }
        if (d instanceof q83) {
            q83 q83 = (q83) d;
            if (z) {
                cls = x73.m54254c(q83);
            } else {
                cls = x73.m54253b(q83);
            }
            List<q93> b = m93.mo45704b();
            if (b.isEmpty()) {
                return cls;
            }
            if (!cls.isArray()) {
                return m47446e(cls, b);
            }
            if (cls.getComponentType().isPrimitive()) {
                return cls;
            }
            q93 q93 = (q93) CollectionsKt___CollectionsKt.m47302B0(b);
            if (q93 != null) {
                KVariance a = q93.mo47026a();
                m93 b2 = q93.mo47027b();
                if (a == null) {
                    i = -1;
                } else {
                    i = C6195a.f30991a[a.ordinal()];
                }
                if (i == -1 || i == 1) {
                    return cls;
                }
                if (i == 2 || i == 3) {
                    vx2.m53588d(b2);
                    Type d2 = m47445d(b2, false, 1, (Object) null);
                    if (d2 instanceof Class) {
                        return cls;
                    }
                    return new ff2(d2);
                }
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + m93);
        }
        throw new UnsupportedOperationException("Unsupported type classifier: " + m93);
    }

    /* renamed from: d */
    public static /* synthetic */ Type m47445d(m93 m93, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m47444c(m93, z);
    }

    /* renamed from: e */
    public static final Type m47446e(Class<?> cls, List<q93> list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(dk0.m43495u(list, 10));
            for (q93 g : list) {
                arrayList.add(m47448g(g));
            }
            return new ParameterizedTypeImpl(cls, (Type) null, arrayList);
        } else if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(dk0.m43495u(list, 10));
            for (q93 g2 : list) {
                arrayList2.add(m47448g(g2));
            }
            return new ParameterizedTypeImpl(cls, declaringClass, arrayList2);
        } else {
            int length = cls.getTypeParameters().length;
            Type e = m47446e(declaringClass, list.subList(length, list.size()));
            List<q93> subList = list.subList(0, length);
            ArrayList arrayList3 = new ArrayList(dk0.m43495u(subList, 10));
            for (q93 g3 : subList) {
                arrayList3.add(m47448g(g3));
            }
            return new ParameterizedTypeImpl(cls, e, arrayList3);
        }
    }

    /* renamed from: f */
    public static final Type m47447f(m93 m93) {
        Type g;
        vx2.m53591g(m93, "<this>");
        if (!(m93 instanceof n93) || (g = ((n93) m93).mo46045g()) == null) {
            return m47445d(m93, false, 1, (Object) null);
        }
        return g;
    }

    /* renamed from: g */
    public static final Type m47448g(q93 q93) {
        KVariance d = q93.mo47029d();
        if (d == null) {
            return zk7.f36177e.mo49873a();
        }
        m93 c = q93.mo47028c();
        vx2.m53588d(c);
        int i = C6195a.f30991a[d.ordinal()];
        if (i == 1) {
            return new zk7((Type) null, m47444c(c, true));
        }
        if (i == 2) {
            return m47444c(c, true);
        }
        if (i == 3) {
            return new zk7(m47444c(c, true), (Type) null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: h */
    public static final String m47449h(Type type) {
        String str;
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            hw5 j = SequencesKt__SequencesKt.m63015j(type, TypesJVMKt$typeToString$unwrap$1.INSTANCE);
            str = ((Class) SequencesKt___SequencesKt.m63033w(j)).getName() + yb6.m74328E(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, SequencesKt___SequencesKt.m63023m(j));
        } else {
            str = cls.getName();
        }
        vx2.m53590f(str, "{\n        if (type.isArr…   } else type.name\n    }");
        return str;
    }
}
