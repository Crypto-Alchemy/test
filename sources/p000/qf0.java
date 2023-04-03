package p000;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;

/* renamed from: qf0 */
/* compiled from: ClassNameIdResolver */
public class qf0 extends s07 {

    /* renamed from: c */
    public final PolymorphicTypeValidator f16932c;

    public qf0(JavaType javaType, TypeFactory typeFactory, PolymorphicTypeValidator polymorphicTypeValidator) {
        super(javaType, typeFactory);
        this.f16932c = polymorphicTypeValidator;
    }

    /* renamed from: i */
    public static qf0 m25663i(JavaType javaType, MapperConfig<?> mapperConfig, PolymorphicTypeValidator polymorphicTypeValidator) {
        return new qf0(javaType, mapperConfig.getTypeFactory(), polymorphicTypeValidator);
    }

    /* renamed from: a */
    public String mo25084a(Object obj) {
        return mo25088g(obj, obj.getClass(), this.f17424a);
    }

    /* renamed from: b */
    public String mo25085b() {
        return "class name used as type id";
    }

    /* renamed from: d */
    public JavaType mo25086d(k21 k21, String str) throws IOException {
        return mo25089h(str, k21);
    }

    /* renamed from: e */
    public String mo25087e(Object obj, Class<?> cls) {
        return mo25088g(obj, cls, this.f17424a);
    }

    /* renamed from: g */
    public String mo25088g(Object obj, Class<?> cls, TypeFactory typeFactory) {
        boolean L = wf0.m29485L(cls);
        Class<? super Object> cls2 = cls;
        if (L) {
            boolean isEnum = cls.isEnum();
            cls2 = cls;
            if (!isEnum) {
                cls2 = cls.getSuperclass();
            }
        }
        String name = cls2.getName();
        if (name.startsWith("java.util.")) {
            if (obj instanceof EnumSet) {
                return typeFactory.constructCollectionType((Class<? extends Collection>) EnumSet.class, (Class<?>) wf0.m29535u((EnumSet) obj)).toCanonical();
            } else if (!(obj instanceof EnumMap)) {
                return name;
            } else {
                return typeFactory.constructMapType((Class<? extends Map>) EnumMap.class, (Class<?>) wf0.m29534t((EnumMap) obj), (Class<?>) Object.class).toCanonical();
            }
        } else if (name.indexOf(36) < 0 || wf0.m29478E(cls2) == null || wf0.m29478E(this.f17425b.getRawClass()) != null) {
            return name;
        } else {
            return this.f17425b.getRawClass().getName();
        }
    }

    /* renamed from: h */
    public JavaType mo25089h(String str, k21 k21) throws IOException {
        JavaType resolveAndValidateSubType = k21.resolveAndValidateSubType(this.f17425b, str, this.f16932c);
        if (resolveAndValidateSubType != null || !(k21 instanceof DeserializationContext)) {
            return resolveAndValidateSubType;
        }
        return ((DeserializationContext) k21).handleUnknownTypeId(this.f17425b, str, this, "no such class found");
    }
}
