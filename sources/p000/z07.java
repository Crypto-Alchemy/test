package p000;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: z07 */
/* compiled from: TypeNameIdResolver */
public class z07 extends s07 {

    /* renamed from: c */
    public final MapperConfig<?> f20422c;

    /* renamed from: d */
    public final ConcurrentHashMap<String, String> f20423d;

    /* renamed from: e */
    public final Map<String, JavaType> f20424e;

    /* renamed from: f */
    public final boolean f20425f;

    public z07(MapperConfig<?> mapperConfig, JavaType javaType, ConcurrentHashMap<String, String> concurrentHashMap, HashMap<String, JavaType> hashMap) {
        super(javaType, mapperConfig.getTypeFactory());
        this.f20422c = mapperConfig;
        this.f20423d = concurrentHashMap;
        this.f20424e = hashMap;
        this.f20425f = mapperConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_VALUES);
    }

    /* renamed from: g */
    public static String m30897g(Class<?> cls) {
        String name = cls.getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf < 0) {
            return name;
        }
        return name.substring(lastIndexOf + 1);
    }

    /* renamed from: i */
    public static z07 m30898i(MapperConfig<?> mapperConfig, JavaType javaType, Collection<NamedType> collection, boolean z, boolean z2) {
        HashMap hashMap;
        ConcurrentHashMap concurrentHashMap;
        String str;
        if (z != z2) {
            if (z) {
                concurrentHashMap = new ConcurrentHashMap();
                hashMap = null;
            } else {
                hashMap = new HashMap();
                concurrentHashMap = new ConcurrentHashMap(4);
            }
            boolean isEnabled = mapperConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_VALUES);
            if (collection != null) {
                for (NamedType next : collection) {
                    Class<?> type = next.getType();
                    if (next.hasName()) {
                        str = next.getName();
                    } else {
                        str = m30897g(type);
                    }
                    if (z) {
                        concurrentHashMap.put(type.getName(), str);
                    }
                    if (z2) {
                        if (isEnabled) {
                            str = str.toLowerCase();
                        }
                        JavaType javaType2 = (JavaType) hashMap.get(str);
                        if (javaType2 == null || !type.isAssignableFrom(javaType2.getRawClass())) {
                            hashMap.put(str, mapperConfig.constructType(type));
                        }
                    }
                }
            }
            return new z07(mapperConfig, javaType, concurrentHashMap, hashMap);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public String mo25084a(Object obj) {
        return mo28291j(obj.getClass());
    }

    /* renamed from: b */
    public String mo25085b() {
        TreeSet treeSet = new TreeSet();
        for (Map.Entry next : this.f20424e.entrySet()) {
            if (((JavaType) next.getValue()).isConcrete()) {
                treeSet.add(next.getKey());
            }
        }
        return treeSet.toString();
    }

    /* renamed from: d */
    public JavaType mo25086d(k21 k21, String str) {
        return mo28290h(str);
    }

    /* renamed from: e */
    public String mo25087e(Object obj, Class<?> cls) {
        if (obj == null) {
            return mo28291j(cls);
        }
        return mo25084a(obj);
    }

    /* renamed from: h */
    public JavaType mo28290h(String str) {
        if (this.f20425f) {
            str = str.toLowerCase();
        }
        return this.f20424e.get(str);
    }

    /* renamed from: j */
    public String mo28291j(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        String name = cls.getName();
        String str = this.f20423d.get(name);
        if (str == null) {
            Class<?> rawClass = this.f17424a.constructType((Type) cls).getRawClass();
            if (this.f20422c.isAnnotationProcessingEnabled()) {
                str = this.f20422c.getAnnotationIntrospector().findTypeName(this.f20422c.introspectClassAnnotations(rawClass).mo23462t());
            }
            if (str == null) {
                str = m30897g(rawClass);
            }
            this.f20423d.put(name, str);
        }
        return str;
    }

    public String toString() {
        return String.format("[%s; id-to-type=%s]", new Object[]{getClass().getName(), this.f20424e});
    }
}
