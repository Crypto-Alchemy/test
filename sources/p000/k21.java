package p000;

import com.fasterxml.jackson.annotation.C1974a;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.reflect.Type;
import java.util.Locale;
import java.util.TimeZone;
import p000.ot0;

/* renamed from: k21 */
/* compiled from: DatabindContext */
public abstract class k21 {
    public String _colonConcat(String str, String str2) {
        if (str2 == null) {
            return str;
        }
        return str + ": " + str2;
    }

    public String _desc(String str) {
        if (str == null) {
            return "[N/A]";
        }
        return _truncate(str);
    }

    public final String _format(String str, Object... objArr) {
        if (objArr.length > 0) {
            return String.format(str, objArr);
        }
        return str;
    }

    public String _quotedString(String str) {
        if (str == null) {
            return "[N/A]";
        }
        return String.format("\"%s\"", new Object[]{_truncate(str)});
    }

    public <T> T _throwNotASubtype(JavaType javaType, String str) throws JsonMappingException {
        throw invalidTypeIdException(javaType, str, "Not a subtype");
    }

    public <T> T _throwSubtypeClassNotAllowed(JavaType javaType, String str, PolymorphicTypeValidator polymorphicTypeValidator) throws JsonMappingException {
        throw invalidTypeIdException(javaType, str, "Configured `PolymorphicTypeValidator` (of type " + wf0.m29514h(polymorphicTypeValidator) + ") denied resolution");
    }

    public <T> T _throwSubtypeNameNotAllowed(JavaType javaType, String str, PolymorphicTypeValidator polymorphicTypeValidator) throws JsonMappingException {
        throw invalidTypeIdException(javaType, str, "Configured `PolymorphicTypeValidator` (of type " + wf0.m29514h(polymorphicTypeValidator) + ") denied resolution");
    }

    public final String _truncate(String str) {
        if (str == null) {
            return "";
        }
        if (str.length() <= 500) {
            return str;
        }
        return str.substring(0, 500) + "]...[" + str.substring(str.length() - 500);
    }

    /* renamed from: a */
    public final JavaType mo22156a(JavaType javaType, String str, PolymorphicTypeValidator polymorphicTypeValidator, int i) throws JsonMappingException {
        MapperConfig<?> config = getConfig();
        PolymorphicTypeValidator.Validity validateSubClassName = polymorphicTypeValidator.validateSubClassName(config, javaType, str.substring(0, i));
        if (validateSubClassName == PolymorphicTypeValidator.Validity.DENIED) {
            return (JavaType) _throwSubtypeNameNotAllowed(javaType, str, polymorphicTypeValidator);
        }
        JavaType constructFromCanonical = getTypeFactory().constructFromCanonical(str);
        if (!constructFromCanonical.isTypeOrSubTypeOf(javaType.getRawClass())) {
            return (JavaType) _throwNotASubtype(javaType, str);
        }
        PolymorphicTypeValidator.Validity validity = PolymorphicTypeValidator.Validity.ALLOWED;
        if (validateSubClassName == validity || polymorphicTypeValidator.validateSubType(config, javaType, constructFromCanonical) == validity) {
            return constructFromCanonical;
        }
        return (JavaType) _throwSubtypeClassNotAllowed(javaType, str, polymorphicTypeValidator);
    }

    public abstract boolean canOverrideAccessModifiers();

    public abstract JavaType constructSpecializedType(JavaType javaType, Class<?> cls);

    public JavaType constructType(Type type) {
        if (type == null) {
            return null;
        }
        return getTypeFactory().constructType(type);
    }

    public ot0<Object, Object> converterInstance(C2911nl nlVar, Object obj) throws JsonMappingException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof ot0) {
            return (ot0) obj;
        }
        if (obj instanceof Class) {
            Class<ot0.C2992a> cls = (Class) obj;
            if (cls == ot0.C2992a.class || wf0.m29483J(cls)) {
                return null;
            }
            if (ot0.class.isAssignableFrom(cls)) {
                MapperConfig<?> config = getConfig();
                config.getHandlerInstantiator();
                return (ot0) wf0.m29522l(cls, config.canOverrideAccessModifiers());
            }
            throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<Converter>");
        }
        throw new IllegalStateException("AnnotationIntrospector returned Converter definition of type " + obj.getClass().getName() + "; expected type Converter or Class<Converter> instead");
    }

    public abstract Class<?> getActiveView();

    public abstract AnnotationIntrospector getAnnotationIntrospector();

    public abstract Object getAttribute(Object obj);

    public abstract MapperConfig<?> getConfig();

    public abstract JsonFormat.Value getDefaultPropertyFormat(Class<?> cls);

    public abstract Locale getLocale();

    public abstract TimeZone getTimeZone();

    public abstract TypeFactory getTypeFactory();

    public abstract JsonMappingException invalidTypeIdException(JavaType javaType, String str, String str2);

    public abstract boolean isEnabled(MapperFeature mapperFeature);

    public ObjectIdGenerator<?> objectIdGeneratorInstance(C2911nl nlVar, bf4 bf4) throws JsonMappingException {
        Class<? extends ObjectIdGenerator<?>> c = bf4.mo11628c();
        MapperConfig<?> config = getConfig();
        config.getHandlerInstantiator();
        return ((ObjectIdGenerator) wf0.m29522l(c, config.canOverrideAccessModifiers())).forScope(bf4.mo11631f());
    }

    public C1974a objectIdResolverInstance(C2911nl nlVar, bf4 bf4) {
        Class<? extends C1974a> e = bf4.mo11630e();
        MapperConfig<?> config = getConfig();
        config.getHandlerInstantiator();
        return (C1974a) wf0.m29522l(e, config.canOverrideAccessModifiers());
    }

    public abstract <T> T reportBadDefinition(JavaType javaType, String str) throws JsonMappingException;

    public <T> T reportBadDefinition(Class<?> cls, String str) throws JsonMappingException {
        return reportBadDefinition(constructType(cls), str);
    }

    public JavaType resolveAndValidateSubType(JavaType javaType, String str, PolymorphicTypeValidator polymorphicTypeValidator) throws JsonMappingException {
        int indexOf = str.indexOf(60);
        if (indexOf > 0) {
            return mo22156a(javaType, str, polymorphicTypeValidator, indexOf);
        }
        MapperConfig<?> config = getConfig();
        PolymorphicTypeValidator.Validity validateSubClassName = polymorphicTypeValidator.validateSubClassName(config, javaType, str);
        if (validateSubClassName == PolymorphicTypeValidator.Validity.DENIED) {
            return (JavaType) _throwSubtypeNameNotAllowed(javaType, str, polymorphicTypeValidator);
        }
        try {
            Class<?> findClass = getTypeFactory().findClass(str);
            if (!javaType.isTypeOrSuperTypeOf(findClass)) {
                return (JavaType) _throwNotASubtype(javaType, str);
            }
            JavaType constructSpecializedType = config.getTypeFactory().constructSpecializedType(javaType, findClass);
            if (validateSubClassName != PolymorphicTypeValidator.Validity.INDETERMINATE || polymorphicTypeValidator.validateSubType(config, javaType, constructSpecializedType) == PolymorphicTypeValidator.Validity.ALLOWED) {
                return constructSpecializedType;
            }
            return (JavaType) _throwSubtypeClassNotAllowed(javaType, str, polymorphicTypeValidator);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Exception e) {
            throw invalidTypeIdException(javaType, str, String.format("problem: (%s) %s", new Object[]{e.getClass().getName(), wf0.m29528o(e)}));
        }
    }

    public JavaType resolveSubType(JavaType javaType, String str) throws JsonMappingException {
        if (str.indexOf(60) > 0) {
            JavaType constructFromCanonical = getTypeFactory().constructFromCanonical(str);
            if (constructFromCanonical.isTypeOrSubTypeOf(javaType.getRawClass())) {
                return constructFromCanonical;
            }
        } else {
            try {
                Class<?> findClass = getTypeFactory().findClass(str);
                if (javaType.isTypeOrSuperTypeOf(findClass)) {
                    return getTypeFactory().constructSpecializedType(javaType, findClass);
                }
            } catch (ClassNotFoundException unused) {
                return null;
            } catch (Exception e) {
                throw invalidTypeIdException(javaType, str, String.format("problem: (%s) %s", new Object[]{e.getClass().getName(), wf0.m29528o(e)}));
            }
        }
        throw invalidTypeIdException(javaType, str, "Not a subtype");
    }

    public abstract k21 setAttribute(Object obj, Object obj2);
}
