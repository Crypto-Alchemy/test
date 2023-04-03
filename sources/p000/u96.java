package p000;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsDeductionTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.LaissezFaireSubTypeValidator;
import java.lang.reflect.Type;
import java.util.Collection;

/* renamed from: u96 */
/* compiled from: StdTypeResolverBuilder */
public class u96 implements l17<u96> {
    public r07 _customIdResolver;
    public Class<?> _defaultImpl;
    public JsonTypeInfo.C1972Id _idType;
    public JsonTypeInfo.C1971As _includeAs;
    public boolean _typeIdVisible = false;
    public String _typeProperty;

    /* renamed from: u96$a */
    /* compiled from: StdTypeResolverBuilder */
    public static /* synthetic */ class C3398a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18412a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f18413b;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|(2:19|20)|21|23|24|25|26|27|28|29|30|(3:31|32|34)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|23|24|25|26|27|28|29|30|(3:31|32|34)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0078 */
        static {
            /*
                com.fasterxml.jackson.annotation.JsonTypeInfo$Id[] r0 = com.fasterxml.jackson.annotation.JsonTypeInfo.C1972Id.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f18413b = r0
                r1 = 1
                com.fasterxml.jackson.annotation.JsonTypeInfo$Id r2 = com.fasterxml.jackson.annotation.JsonTypeInfo.C1972Id.DEDUCTION     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f18413b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.annotation.JsonTypeInfo$Id r3 = com.fasterxml.jackson.annotation.JsonTypeInfo.C1972Id.CLASS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f18413b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.annotation.JsonTypeInfo$Id r4 = com.fasterxml.jackson.annotation.JsonTypeInfo.C1972Id.MINIMAL_CLASS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f18413b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fasterxml.jackson.annotation.JsonTypeInfo$Id r5 = com.fasterxml.jackson.annotation.JsonTypeInfo.C1972Id.NAME     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f18413b     // Catch:{ NoSuchFieldError -> 0x003e }
                com.fasterxml.jackson.annotation.JsonTypeInfo$Id r6 = com.fasterxml.jackson.annotation.JsonTypeInfo.C1972Id.NONE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r5 = f18413b     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.fasterxml.jackson.annotation.JsonTypeInfo$Id r6 = com.fasterxml.jackson.annotation.JsonTypeInfo.C1972Id.CUSTOM     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r7 = 6
                r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                com.fasterxml.jackson.annotation.JsonTypeInfo$As[] r5 = com.fasterxml.jackson.annotation.JsonTypeInfo.C1971As.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f18412a = r5
                com.fasterxml.jackson.annotation.JsonTypeInfo$As r6 = com.fasterxml.jackson.annotation.JsonTypeInfo.C1971As.WRAPPER_ARRAY     // Catch:{ NoSuchFieldError -> 0x005a }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                int[] r1 = f18412a     // Catch:{ NoSuchFieldError -> 0x0064 }
                com.fasterxml.jackson.annotation.JsonTypeInfo$As r5 = com.fasterxml.jackson.annotation.JsonTypeInfo.C1971As.PROPERTY     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r1[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                int[] r0 = f18412a     // Catch:{ NoSuchFieldError -> 0x006e }
                com.fasterxml.jackson.annotation.JsonTypeInfo$As r1 = com.fasterxml.jackson.annotation.JsonTypeInfo.C1971As.WRAPPER_OBJECT     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = f18412a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.fasterxml.jackson.annotation.JsonTypeInfo$As r1 = com.fasterxml.jackson.annotation.JsonTypeInfo.C1971As.EXTERNAL_PROPERTY     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f18412a     // Catch:{ NoSuchFieldError -> 0x0082 }
                com.fasterxml.jackson.annotation.JsonTypeInfo$As r1 = com.fasterxml.jackson.annotation.JsonTypeInfo.C1971As.EXISTING_PROPERTY     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.u96.C3398a.<clinit>():void");
        }
    }

    public u96() {
    }

    public static u96 noTypeInfoBuilder() {
        return new u96().init(JsonTypeInfo.C1972Id.NONE, (r07) null);
    }

    public boolean allowPrimitiveTypes(MapperConfig<?> mapperConfig, JavaType javaType) {
        return false;
    }

    public j07 buildTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, Collection<NamedType> collection) {
        if (this._idType == JsonTypeInfo.C1972Id.NONE) {
            return null;
        }
        if (javaType.isPrimitive() && !allowPrimitiveTypes(deserializationConfig, javaType)) {
            return null;
        }
        r07 idResolver = idResolver(deserializationConfig, javaType, verifyBaseTypeValidity(deserializationConfig, javaType), collection, false, true);
        JavaType defineDefaultImpl = defineDefaultImpl(deserializationConfig, javaType);
        if (this._idType == JsonTypeInfo.C1972Id.DEDUCTION) {
            return new AsDeductionTypeDeserializer(javaType, idResolver, defineDefaultImpl, deserializationConfig, collection);
        }
        int i = C3398a.f18412a[this._includeAs.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return new AsWrapperTypeDeserializer(javaType, idResolver, this._typeProperty, this._typeIdVisible, defineDefaultImpl);
                } else if (i == 4) {
                    return new AsExternalTypeDeserializer(javaType, idResolver, this._typeProperty, this._typeIdVisible, defineDefaultImpl);
                } else if (i != 5) {
                    throw new IllegalStateException("Do not know how to construct standard type serializer for inclusion type: " + this._includeAs);
                }
            }
            return new AsPropertyTypeDeserializer(javaType, idResolver, this._typeProperty, this._typeIdVisible, defineDefaultImpl, this._includeAs);
        }
        return new AsArrayTypeDeserializer(javaType, idResolver, this._typeProperty, this._typeIdVisible, defineDefaultImpl);
    }

    public m17 buildTypeSerializer(SerializationConfig serializationConfig, JavaType javaType, Collection<NamedType> collection) {
        if (this._idType == JsonTypeInfo.C1972Id.NONE) {
            return null;
        }
        if (javaType.isPrimitive() && !allowPrimitiveTypes(serializationConfig, javaType)) {
            return null;
        }
        r07 idResolver = idResolver(serializationConfig, javaType, subTypeValidator(serializationConfig), collection, true, false);
        if (this._idType == JsonTypeInfo.C1972Id.DEDUCTION) {
            return new C2112cr(idResolver, (BeanProperty) null, this._typeProperty);
        }
        int i = C3398a.f18412a[this._includeAs.ordinal()];
        if (i == 1) {
            return new C1644br(idResolver, (BeanProperty) null);
        }
        if (i == 2) {
            return new C2248er(idResolver, (BeanProperty) null, this._typeProperty);
        }
        if (i == 3) {
            return new C2318fr(idResolver, (BeanProperty) null);
        }
        if (i == 4) {
            return new C2190dr(idResolver, (BeanProperty) null, this._typeProperty);
        }
        if (i == 5) {
            return new C2112cr(idResolver, (BeanProperty) null, this._typeProperty);
        }
        throw new IllegalStateException("Do not know how to construct standard type serializer for inclusion type: " + this._includeAs);
    }

    public JavaType defineDefaultImpl(DeserializationConfig deserializationConfig, JavaType javaType) {
        Class<?> cls = this._defaultImpl;
        if (cls != null) {
            if (cls == Void.class || cls == l74.class) {
                return deserializationConfig.getTypeFactory().constructType((Type) this._defaultImpl);
            }
            if (javaType.hasRawClass(cls)) {
                return javaType;
            }
            if (javaType.isTypeOrSuperTypeOf(this._defaultImpl)) {
                return deserializationConfig.getTypeFactory().constructSpecializedType(javaType, this._defaultImpl);
            }
            if (javaType.hasRawClass(this._defaultImpl)) {
                return javaType;
            }
        }
        if (!deserializationConfig.isEnabled(MapperFeature.USE_BASE_TYPE_AS_DEFAULT_IMPL) || javaType.isAbstract()) {
            return null;
        }
        return javaType;
    }

    public Class<?> getDefaultImpl() {
        return this._defaultImpl;
    }

    public String getTypeProperty() {
        return this._typeProperty;
    }

    public r07 idResolver(MapperConfig<?> mapperConfig, JavaType javaType, PolymorphicTypeValidator polymorphicTypeValidator, Collection<NamedType> collection, boolean z, boolean z2) {
        r07 r07 = this._customIdResolver;
        if (r07 != null) {
            return r07;
        }
        JsonTypeInfo.C1972Id id = this._idType;
        if (id != null) {
            int i = C3398a.f18413b[id.ordinal()];
            if (i == 1 || i == 2) {
                return qf0.m25663i(javaType, mapperConfig, polymorphicTypeValidator);
            }
            if (i == 3) {
                return xv3.m30325j(javaType, mapperConfig, polymorphicTypeValidator);
            }
            if (i == 4) {
                return z07.m30898i(mapperConfig, javaType, collection, z, z2);
            }
            if (i == 5) {
                return null;
            }
            throw new IllegalStateException("Do not know how to construct standard type id resolver for idType: " + this._idType);
        }
        throw new IllegalStateException("Cannot build, 'init()' not yet called");
    }

    public boolean isTypeIdVisible() {
        return this._typeIdVisible;
    }

    public PolymorphicTypeValidator reportInvalidBaseType(MapperConfig<?> mapperConfig, JavaType javaType, PolymorphicTypeValidator polymorphicTypeValidator) {
        throw new IllegalArgumentException(String.format("Configured `PolymorphicTypeValidator` (of type %s) denied resolution of all subtypes of base type %s", new Object[]{wf0.m29514h(polymorphicTypeValidator), wf0.m29514h(javaType.getRawClass())}));
    }

    public PolymorphicTypeValidator subTypeValidator(MapperConfig<?> mapperConfig) {
        return mapperConfig.getPolymorphicTypeValidator();
    }

    public PolymorphicTypeValidator verifyBaseTypeValidity(MapperConfig<?> mapperConfig, JavaType javaType) {
        PolymorphicTypeValidator subTypeValidator = subTypeValidator(mapperConfig);
        JsonTypeInfo.C1972Id id = this._idType;
        if (id == JsonTypeInfo.C1972Id.CLASS || id == JsonTypeInfo.C1972Id.MINIMAL_CLASS) {
            PolymorphicTypeValidator.Validity validateBaseType = subTypeValidator.validateBaseType(mapperConfig, javaType);
            if (validateBaseType == PolymorphicTypeValidator.Validity.DENIED) {
                return reportInvalidBaseType(mapperConfig, javaType, subTypeValidator);
            }
            if (validateBaseType == PolymorphicTypeValidator.Validity.ALLOWED) {
                return LaissezFaireSubTypeValidator.instance;
            }
        }
        return subTypeValidator;
    }

    public u96 defaultImpl(Class<?> cls) {
        this._defaultImpl = cls;
        return this;
    }

    public u96 inclusion(JsonTypeInfo.C1971As as) {
        if (as != null) {
            this._includeAs = as;
            return this;
        }
        throw new IllegalArgumentException("includeAs cannot be null");
    }

    public u96 init(JsonTypeInfo.C1972Id id, r07 r07) {
        if (id != null) {
            this._idType = id;
            this._customIdResolver = r07;
            this._typeProperty = id.getDefaultPropertyName();
            return this;
        }
        throw new IllegalArgumentException("idType cannot be null");
    }

    public u96 typeIdVisibility(boolean z) {
        this._typeIdVisible = z;
        return this;
    }

    public u96 typeProperty(String str) {
        if (str == null || str.isEmpty()) {
            str = this._idType.getDefaultPropertyName();
        }
        this._typeProperty = str;
        return this;
    }

    public u96 withDefaultImpl(Class<?> cls) {
        if (this._defaultImpl == cls) {
            return this;
        }
        wf0.m29527n0(u96.class, this, "withDefaultImpl");
        return new u96(this, cls);
    }

    public u96(JsonTypeInfo.C1972Id id, JsonTypeInfo.C1971As as, String str) {
        this._idType = id;
        this._includeAs = as;
        this._typeProperty = str;
    }

    public u96(u96 u96, Class<?> cls) {
        this._idType = u96._idType;
        this._includeAs = u96._includeAs;
        this._typeProperty = u96._typeProperty;
        this._typeIdVisible = u96._typeIdVisible;
        this._customIdResolver = u96._customIdResolver;
        this._defaultImpl = cls;
    }
}
