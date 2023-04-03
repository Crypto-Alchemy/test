package p000;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: n23 */
/* compiled from: JavaUtilCollectionsDeserializers */
public abstract class n23 {

    /* renamed from: n23$a */
    /* compiled from: JavaUtilCollectionsDeserializers */
    public static class C2859a implements ot0<Object, Object> {

        /* renamed from: a */
        public final JavaType f15300a;

        /* renamed from: b */
        public final int f15301b;

        public C2859a(int i, JavaType javaType) {
            this.f15300a = javaType;
            this.f15301b = i;
        }

        /* renamed from: a */
        public Object mo23476a(Object obj) {
            if (obj == null) {
                return null;
            }
            switch (this.f15301b) {
                case 1:
                    Set set = (Set) obj;
                    mo23479d(set.size());
                    return Collections.singleton(set.iterator().next());
                case 2:
                    List list = (List) obj;
                    mo23479d(list.size());
                    return Collections.singletonList(list.get(0));
                case 3:
                    Map map = (Map) obj;
                    mo23479d(map.size());
                    Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
                    return Collections.singletonMap(entry.getKey(), entry.getValue());
                case 4:
                    return Collections.unmodifiableSet((Set) obj);
                case 5:
                    return Collections.unmodifiableList((List) obj);
                case 6:
                    return Collections.unmodifiableMap((Map) obj);
                case 7:
                    return Collections.synchronizedSet((Set) obj);
                case 8:
                    return Collections.synchronizedCollection((Collection) obj);
                case 9:
                    return Collections.synchronizedList((List) obj);
                case 10:
                    return Collections.synchronizedMap((Map) obj);
                default:
                    return obj;
            }
        }

        /* renamed from: b */
        public JavaType mo23477b(TypeFactory typeFactory) {
            return this.f15300a;
        }

        /* renamed from: c */
        public JavaType mo23478c(TypeFactory typeFactory) {
            return this.f15300a;
        }

        /* renamed from: d */
        public final void mo23479d(int i) {
            if (i != 1) {
                throw new IllegalArgumentException("Can not deserialize Singleton container from " + i + " entries");
            }
        }
    }

    /* renamed from: a */
    public static String m22743a(String str) {
        if (str.startsWith("Singleton")) {
            return str.substring(9);
        }
        return null;
    }

    /* renamed from: b */
    public static String m22744b(String str) {
        if (str.startsWith("Synchronized")) {
            return str.substring(12);
        }
        return null;
    }

    /* renamed from: c */
    public static String m22745c(String str) {
        if (str.startsWith("Unmodifiable")) {
            return str.substring(12);
        }
        return null;
    }

    /* renamed from: d */
    public static String m22746d(String str) {
        if (str.startsWith("java.util.Arrays$")) {
            return str.substring(17);
        }
        return null;
    }

    /* renamed from: e */
    public static String m22747e(String str) {
        if (str.startsWith("java.util.ImmutableCollections$")) {
            return str.substring(31);
        }
        return null;
    }

    /* renamed from: f */
    public static String m22748f(String str) {
        if (str.startsWith("java.util.Collections$")) {
            return str.substring(22);
        }
        return null;
    }

    /* renamed from: g */
    public static C2859a m22749g(int i, JavaType javaType, Class<?> cls) {
        return new C2859a(i, javaType.findSuperType(cls));
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.o43<?> m22750h(com.fasterxml.jackson.databind.DeserializationContext r6, com.fasterxml.jackson.databind.JavaType r7) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            java.lang.Class r6 = r7.getRawClass()
            java.lang.String r6 = r6.getName()
            java.lang.String r0 = "java.util."
            boolean r0 = r6.startsWith(r0)
            r1 = 0
            if (r0 != 0) goto L_0x0012
            return r1
        L_0x0012:
            java.lang.String r0 = m22748f(r6)
            r2 = 4
            r3 = 5
            java.lang.String r4 = "Set"
            java.lang.String r5 = "List"
            if (r0 == 0) goto L_0x009e
            java.lang.String r6 = m22745c(r0)
            if (r6 == 0) goto L_0x003e
            boolean r0 = r6.endsWith(r4)
            if (r0 == 0) goto L_0x0031
            java.lang.Class<java.util.Set> r6 = java.util.Set.class
            n23$a r6 = m22749g(r2, r7, r6)
            goto L_0x0095
        L_0x0031:
            boolean r6 = r6.endsWith(r5)
            if (r6 == 0) goto L_0x0094
            java.lang.Class<java.util.List> r6 = java.util.List.class
            n23$a r6 = m22749g(r3, r7, r6)
            goto L_0x0095
        L_0x003e:
            java.lang.String r6 = m22743a(r0)
            if (r6 == 0) goto L_0x0060
            boolean r0 = r6.endsWith(r4)
            if (r0 == 0) goto L_0x0052
            r6 = 1
            java.lang.Class<java.util.Set> r0 = java.util.Set.class
            n23$a r6 = m22749g(r6, r7, r0)
            goto L_0x0095
        L_0x0052:
            boolean r6 = r6.endsWith(r5)
            if (r6 == 0) goto L_0x0094
            r6 = 2
            java.lang.Class<java.util.List> r0 = java.util.List.class
            n23$a r6 = m22749g(r6, r7, r0)
            goto L_0x0095
        L_0x0060:
            java.lang.String r6 = m22744b(r0)
            if (r6 == 0) goto L_0x0094
            boolean r0 = r6.endsWith(r4)
            if (r0 == 0) goto L_0x0074
            r6 = 7
            java.lang.Class<java.util.Set> r0 = java.util.Set.class
            n23$a r6 = m22749g(r6, r7, r0)
            goto L_0x0095
        L_0x0074:
            boolean r0 = r6.endsWith(r5)
            if (r0 == 0) goto L_0x0083
            r6 = 9
            java.lang.Class<java.util.List> r0 = java.util.List.class
            n23$a r6 = m22749g(r6, r7, r0)
            goto L_0x0095
        L_0x0083:
            java.lang.String r0 = "Collection"
            boolean r6 = r6.endsWith(r0)
            if (r6 == 0) goto L_0x0094
            r6 = 8
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            n23$a r6 = m22749g(r6, r7, r0)
            goto L_0x0095
        L_0x0094:
            r6 = r1
        L_0x0095:
            if (r6 != 0) goto L_0x0098
            goto L_0x009d
        L_0x0098:
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer r1 = new com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer
            r1.<init>(r6)
        L_0x009d:
            return r1
        L_0x009e:
            java.lang.String r0 = m22746d(r6)
            if (r0 == 0) goto L_0x00b7
            boolean r6 = r0.contains(r5)
            if (r6 == 0) goto L_0x00b6
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer r6 = new com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer
            java.lang.Class<java.util.List> r0 = java.util.List.class
            n23$a r7 = m22749g(r3, r7, r0)
            r6.<init>(r7)
            return r6
        L_0x00b6:
            return r1
        L_0x00b7:
            java.lang.String r6 = m22747e(r6)
            if (r6 == 0) goto L_0x00e3
            boolean r0 = r6.contains(r5)
            if (r0 == 0) goto L_0x00d1
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer r6 = new com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer
            r0 = 11
            java.lang.Class<java.util.List> r1 = java.util.List.class
            n23$a r7 = m22749g(r0, r7, r1)
            r6.<init>(r7)
            return r6
        L_0x00d1:
            boolean r6 = r6.contains(r4)
            if (r6 == 0) goto L_0x00e3
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer r6 = new com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer
            java.lang.Class<java.util.Set> r0 = java.util.Set.class
            n23$a r7 = m22749g(r2, r7, r0)
            r6.<init>(r7)
            return r6
        L_0x00e3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.n23.m22750h(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType):o43");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.o43<?> m22751i(com.fasterxml.jackson.databind.DeserializationContext r4, com.fasterxml.jackson.databind.JavaType r5) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            java.lang.Class r4 = r5.getRawClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r0 = m22748f(r4)
            r1 = 6
            r2 = 0
            java.lang.String r3 = "Map"
            if (r0 == 0) goto L_0x004e
            java.lang.String r4 = m22745c(r0)
            if (r4 == 0) goto L_0x0025
            boolean r4 = r4.contains(r3)
            if (r4 == 0) goto L_0x0061
            java.lang.Class<java.util.Map> r4 = java.util.Map.class
            n23$a r4 = m22749g(r1, r5, r4)
            goto L_0x0062
        L_0x0025:
            java.lang.String r4 = m22743a(r0)
            if (r4 == 0) goto L_0x0039
            boolean r4 = r4.contains(r3)
            if (r4 == 0) goto L_0x0061
            r4 = 3
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            n23$a r4 = m22749g(r4, r5, r0)
            goto L_0x0062
        L_0x0039:
            java.lang.String r4 = m22744b(r0)
            if (r4 == 0) goto L_0x0061
            boolean r4 = r4.contains(r3)
            if (r4 == 0) goto L_0x0061
            r4 = 10
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            n23$a r4 = m22749g(r4, r5, r0)
            goto L_0x0062
        L_0x004e:
            java.lang.String r4 = m22747e(r4)
            if (r4 == 0) goto L_0x0061
            boolean r4 = r4.contains(r3)
            if (r4 == 0) goto L_0x0061
            java.lang.Class<java.util.Map> r4 = java.util.Map.class
            n23$a r4 = m22749g(r1, r5, r4)
            goto L_0x0062
        L_0x0061:
            r4 = r2
        L_0x0062:
            if (r4 != 0) goto L_0x0065
            goto L_0x006a
        L_0x0065:
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer r2 = new com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer
            r2.<init>(r4)
        L_0x006a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.n23.m22751i(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType):o43");
    }
}
