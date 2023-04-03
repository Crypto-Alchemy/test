package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators$None;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter;
import com.fasterxml.jackson.databind.ser.std.RawSerializer;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.LRUMap;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Closeable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p000.c73;
import p000.d43;
import p000.ha3;
import p000.k53;
import p000.o43;
import p000.ot0;
import p000.y63;

public class JacksonAnnotationIntrospector extends AnnotationIntrospector {

    /* renamed from: a */
    public static final Class<? extends Annotation>[] f10000a = {JsonSerialize.class, o73.class, JsonFormat.class, JsonTypeInfo.class, s53.class, h73.class, f43.class, c53.class};

    /* renamed from: d */
    public static final Class<? extends Annotation>[] f10001d = {n43.class, o73.class, JsonFormat.class, JsonTypeInfo.class, h73.class, f43.class, c53.class, e53.class};

    /* renamed from: e */
    public static final e03 f10002e;
    private static final long serialVersionUID = 1;
    public transient LRUMap<Class<?>, Boolean> _annotationsInside = new LRUMap<>(48, 48);
    public boolean _cfgConstructorPropertiesImpliesCreator = true;

    /* renamed from: com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector$a */
    public static /* synthetic */ class C2018a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10003a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.fasterxml.jackson.databind.annotation.JsonSerialize$Inclusion[] r0 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10003a = r0
                com.fasterxml.jackson.databind.annotation.JsonSerialize$Inclusion r1 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.ALWAYS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10003a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.databind.annotation.JsonSerialize$Inclusion r1 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.NON_NULL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10003a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.databind.annotation.JsonSerialize$Inclusion r1 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.NON_DEFAULT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f10003a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fasterxml.jackson.databind.annotation.JsonSerialize$Inclusion r1 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.NON_EMPTY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f10003a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.fasterxml.jackson.databind.annotation.JsonSerialize$Inclusion r1 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.DEFAULT_INCLUSION     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.C2018a.<clinit>():void");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Class<? extends java.lang.annotation.Annotation>[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<? extends java.lang.annotation.Annotation>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 8
            java.lang.Class[] r1 = new java.lang.Class[r0]
            java.lang.Class<com.fasterxml.jackson.databind.annotation.JsonSerialize> r2 = com.fasterxml.jackson.databind.annotation.JsonSerialize.class
            r3 = 0
            r1[r3] = r2
            java.lang.Class<o73> r2 = p000.o73.class
            r4 = 1
            r1[r4] = r2
            java.lang.Class<com.fasterxml.jackson.annotation.JsonFormat> r2 = com.fasterxml.jackson.annotation.JsonFormat.class
            r5 = 2
            r1[r5] = r2
            java.lang.Class<com.fasterxml.jackson.annotation.JsonTypeInfo> r2 = com.fasterxml.jackson.annotation.JsonTypeInfo.class
            r6 = 3
            r1[r6] = r2
            java.lang.Class<s53> r2 = p000.s53.class
            r7 = 4
            r1[r7] = r2
            java.lang.Class<h73> r2 = p000.h73.class
            r8 = 5
            r1[r8] = r2
            java.lang.Class<f43> r2 = p000.f43.class
            r9 = 6
            r1[r9] = r2
            java.lang.Class<c53> r2 = p000.c53.class
            r10 = 7
            r1[r10] = r2
            f10000a = r1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class<n43> r1 = p000.n43.class
            r0[r3] = r1
            java.lang.Class<o73> r1 = p000.o73.class
            r0[r4] = r1
            java.lang.Class<com.fasterxml.jackson.annotation.JsonFormat> r1 = com.fasterxml.jackson.annotation.JsonFormat.class
            r0[r5] = r1
            java.lang.Class<com.fasterxml.jackson.annotation.JsonTypeInfo> r1 = com.fasterxml.jackson.annotation.JsonTypeInfo.class
            r0[r6] = r1
            java.lang.Class<h73> r1 = p000.h73.class
            r0[r7] = r1
            java.lang.Class<f43> r1 = p000.f43.class
            r0[r8] = r1
            java.lang.Class<c53> r1 = p000.c53.class
            r0[r9] = r1
            java.lang.Class<e53> r1 = p000.e53.class
            r0[r10] = r1
            f10001d = r0
            e03 r0 = p000.e03.m15553d()     // Catch:{ all -> 0x0057 }
            goto L_0x0058
        L_0x0057:
            r0 = 0
        L_0x0058:
            f10002e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.<clinit>():void");
    }

    public Class<?> _classIfExplicit(Class<?> cls) {
        if (cls == null || wf0.m29483J(cls)) {
            return null;
        }
        return cls;
    }

    public u96 _constructNoTypeResolverBuilder() {
        return u96.noTypeInfoBuilder();
    }

    public u96 _constructStdTypeResolverBuilder() {
        return new u96();
    }

    public BeanPropertyWriter _constructVirtualProperty(d43.C2133a aVar, MapperConfig<?> mapperConfig, C2021a aVar2, JavaType javaType) {
        PropertyMetadata propertyMetadata = aVar.required() ? PropertyMetadata.STD_REQUIRED : PropertyMetadata.STD_OPTIONAL;
        String value = aVar.value();
        PropertyName _propertyName = _propertyName(aVar.propName(), aVar.propNamespace());
        if (!_propertyName.hasSimpleName()) {
            _propertyName = PropertyName.construct(value);
        }
        return AttributePropertyWriter.construct(value, z16.m30928I(mapperConfig, new VirtualAnnotatedMember(aVar2, aVar2.getRawType(), value, javaType), _propertyName, propertyMetadata, aVar.include()), aVar2.mo16045h(), javaType);
    }

    public PropertyName _findConstructorName(C2911nl nlVar) {
        e03 e03;
        PropertyName a;
        if (!(nlVar instanceof AnnotatedParameter)) {
            return null;
        }
        AnnotatedParameter annotatedParameter = (AnnotatedParameter) nlVar;
        if (annotatedParameter.getOwner() == null || (e03 = f10002e) == null || (a = e03.mo19026a(annotatedParameter)) == null) {
            return null;
        }
        return a;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.fasterxml.jackson.databind.cfg.MapperConfig<?>, com.fasterxml.jackson.databind.cfg.MapperConfig] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p000.l17<?> _findTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig<?> r5, p000.C2911nl r6, com.fasterxml.jackson.databind.JavaType r7) {
        /*
            r4 = this;
            java.lang.Class<com.fasterxml.jackson.annotation.JsonTypeInfo> r0 = com.fasterxml.jackson.annotation.JsonTypeInfo.class
            java.lang.annotation.Annotation r0 = r4._findAnnotation(r6, r0)
            com.fasterxml.jackson.annotation.JsonTypeInfo r0 = (com.fasterxml.jackson.annotation.JsonTypeInfo) r0
            java.lang.Class<g73> r1 = p000.g73.class
            java.lang.annotation.Annotation r1 = r4._findAnnotation(r6, r1)
            g73 r1 = (p000.g73) r1
            r2 = 0
            if (r1 == 0) goto L_0x001f
            if (r0 != 0) goto L_0x0016
            return r2
        L_0x0016:
            java.lang.Class r1 = r1.value()
            l17 r1 = r5.typeResolverBuilderInstance(r6, r1)
            goto L_0x0033
        L_0x001f:
            if (r0 != 0) goto L_0x0022
            return r2
        L_0x0022:
            com.fasterxml.jackson.annotation.JsonTypeInfo$Id r1 = r0.use()
            com.fasterxml.jackson.annotation.JsonTypeInfo$Id r3 = com.fasterxml.jackson.annotation.JsonTypeInfo.C1972Id.NONE
            if (r1 != r3) goto L_0x002f
            u96 r5 = r4._constructNoTypeResolverBuilder()
            return r5
        L_0x002f:
            u96 r1 = r4._constructStdTypeResolverBuilder()
        L_0x0033:
            java.lang.Class<e73> r3 = p000.e73.class
            java.lang.annotation.Annotation r3 = r4._findAnnotation(r6, r3)
            e73 r3 = (p000.e73) r3
            if (r3 != 0) goto L_0x003e
            goto L_0x0046
        L_0x003e:
            java.lang.Class r2 = r3.value()
            r07 r2 = r5.typeIdResolverInstance(r6, r2)
        L_0x0046:
            if (r2 == 0) goto L_0x004b
            r2.mo25314c(r7)
        L_0x004b:
            com.fasterxml.jackson.annotation.JsonTypeInfo$Id r5 = r0.use()
            l17 r5 = r1.init(r5, r2)
            com.fasterxml.jackson.annotation.JsonTypeInfo$As r7 = r0.include()
            com.fasterxml.jackson.annotation.JsonTypeInfo$As r1 = com.fasterxml.jackson.annotation.JsonTypeInfo.C1971As.EXTERNAL_PROPERTY
            if (r7 != r1) goto L_0x0061
            boolean r6 = r6 instanceof com.fasterxml.jackson.databind.introspect.C2021a
            if (r6 == 0) goto L_0x0061
            com.fasterxml.jackson.annotation.JsonTypeInfo$As r7 = com.fasterxml.jackson.annotation.JsonTypeInfo.C1971As.PROPERTY
        L_0x0061:
            l17 r5 = r5.inclusion(r7)
            java.lang.String r6 = r0.property()
            l17 r5 = r5.typeProperty(r6)
            java.lang.Class r6 = r0.defaultImpl()
            java.lang.Class<com.fasterxml.jackson.annotation.JsonTypeInfo$a> r7 = com.fasterxml.jackson.annotation.JsonTypeInfo.C1973a.class
            if (r6 == r7) goto L_0x007f
            boolean r7 = r6.isAnnotation()
            if (r7 != 0) goto L_0x007f
            l17 r5 = r5.defaultImpl(r6)
        L_0x007f:
            boolean r6 = r0.visible()
            l17 r5 = r5.typeIdVisibility(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector._findTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig, nl, com.fasterxml.jackson.databind.JavaType):l17");
    }

    public boolean _isIgnorable(C2911nl nlVar) {
        Boolean b;
        y43 y43 = (y43) _findAnnotation(nlVar, y43.class);
        if (y43 != null) {
            return y43.value();
        }
        e03 e03 = f10002e;
        if (e03 == null || (b = e03.mo19027b(nlVar)) == null) {
            return false;
        }
        return b.booleanValue();
    }

    public PropertyName _propertyName(String str, String str2) {
        if (str.isEmpty()) {
            return PropertyName.USE_DEFAULT;
        }
        if (str2 == null || str2.isEmpty()) {
            return PropertyName.construct(str);
        }
        return PropertyName.construct(str, str2);
    }

    /* renamed from: a */
    public final JsonMappingException mo16001a(String str) {
        return new JsonMappingException((Closeable) null, str);
    }

    /* renamed from: b */
    public final JsonMappingException mo16002b(Throwable th, String str) {
        return new JsonMappingException((Closeable) null, str, th);
    }

    /* renamed from: c */
    public final Boolean mo16003c(C2911nl nlVar) {
        q53 q53 = (q53) _findAnnotation(nlVar, q53.class);
        if (q53 == null || !q53.alphabetic()) {
            return null;
        }
        return Boolean.TRUE;
    }

    /* renamed from: d */
    public final boolean mo16004d(JavaType javaType, Class<?> cls) {
        if (javaType.isPrimitive()) {
            return javaType.hasRawClass(wf0.m29503b0(cls));
        }
        if (!cls.isPrimitive() || cls != wf0.m29503b0(javaType.getRawClass())) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean mo16005e(Class<?> cls, Class<?> cls2) {
        if (cls.isPrimitive()) {
            if (cls == wf0.m29503b0(cls2)) {
                return true;
            }
            return false;
        } else if (!cls2.isPrimitive()) {
            return false;
        } else {
            if (cls2 == wf0.m29503b0(cls)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: f */
    public final JsonInclude.Value mo16006f(C2911nl nlVar, JsonInclude.Value value) {
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(nlVar, JsonSerialize.class);
        if (jsonSerialize != null) {
            int i = C2018a.f10003a[jsonSerialize.include().ordinal()];
            if (i == 1) {
                return value.withValueInclusion(JsonInclude.Include.ALWAYS);
            }
            if (i == 2) {
                return value.withValueInclusion(JsonInclude.Include.NON_NULL);
            }
            if (i == 3) {
                return value.withValueInclusion(JsonInclude.Include.NON_DEFAULT);
            }
            if (i == 4) {
                return value.withValueInclusion(JsonInclude.Include.NON_EMPTY);
            }
        }
        return value;
    }

    public void findAndAddVirtualProperties(MapperConfig<?> mapperConfig, C2021a aVar, List<BeanPropertyWriter> list) {
        d43 d43 = (d43) _findAnnotation(aVar, d43.class);
        if (d43 != null) {
            boolean prepend = d43.prepend();
            JavaType javaType = null;
            d43.C2133a[] attrs = d43.attrs();
            int length = attrs.length;
            for (int i = 0; i < length; i++) {
                if (javaType == null) {
                    javaType = mapperConfig.constructType((Class<?>) Object.class);
                }
                BeanPropertyWriter _constructVirtualProperty = _constructVirtualProperty(attrs[i], mapperConfig, aVar, javaType);
                if (prepend) {
                    list.add(i, _constructVirtualProperty);
                } else {
                    list.add(_constructVirtualProperty);
                }
            }
            d43.C2134b[] props = d43.props();
            int length2 = props.length;
            for (int i2 = 0; i2 < length2; i2++) {
                BeanPropertyWriter _constructVirtualProperty2 = _constructVirtualProperty(props[i2], mapperConfig, aVar);
                if (prepend) {
                    list.add(i2, _constructVirtualProperty2);
                } else {
                    list.add(_constructVirtualProperty2);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.fasterxml.jackson.databind.introspect.VisibilityChecker, com.fasterxml.jackson.databind.introspect.VisibilityChecker<?>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> findAutoDetectVisibility(com.fasterxml.jackson.databind.introspect.C2021a r2, com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> r3) {
        /*
            r1 = this;
            java.lang.Class<com.fasterxml.jackson.annotation.JsonAutoDetect> r0 = com.fasterxml.jackson.annotation.JsonAutoDetect.class
            java.lang.annotation.Annotation r2 = r1._findAnnotation(r2, r0)
            com.fasterxml.jackson.annotation.JsonAutoDetect r2 = (com.fasterxml.jackson.annotation.JsonAutoDetect) r2
            if (r2 != 0) goto L_0x000b
            goto L_0x000f
        L_0x000b:
            com.fasterxml.jackson.databind.introspect.VisibilityChecker r3 = r3.with(r2)
        L_0x000f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findAutoDetectVisibility(com.fasterxml.jackson.databind.introspect.a, com.fasterxml.jackson.databind.introspect.VisibilityChecker):com.fasterxml.jackson.databind.introspect.VisibilityChecker");
    }

    public String findClassDescription(C2021a aVar) {
        i43 i43 = (i43) _findAnnotation(aVar, i43.class);
        if (i43 == null) {
            return null;
        }
        return i43.value();
    }

    public Object findContentDeserializer(C2911nl nlVar) {
        Class<? extends o43> contentUsing;
        n43 n43 = (n43) _findAnnotation(nlVar, n43.class);
        if (n43 == null || (contentUsing = n43.contentUsing()) == o43.C2939a.class) {
            return null;
        }
        return contentUsing;
    }

    public Object findContentSerializer(C2911nl nlVar) {
        Class<? extends y63> contentUsing;
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(nlVar, JsonSerialize.class);
        if (jsonSerialize == null || (contentUsing = jsonSerialize.contentUsing()) == y63.C3656a.class) {
            return null;
        }
        return contentUsing;
    }

    public JsonCreator.Mode findCreatorAnnotation(MapperConfig<?> mapperConfig, C2911nl nlVar) {
        e03 e03;
        Boolean c;
        JsonCreator jsonCreator = (JsonCreator) _findAnnotation(nlVar, JsonCreator.class);
        if (jsonCreator != null) {
            return jsonCreator.mode();
        }
        if (!this._cfgConstructorPropertiesImpliesCreator || !mapperConfig.isEnabled(MapperFeature.INFER_CREATOR_FROM_CONSTRUCTOR_PROPERTIES) || !(nlVar instanceof AnnotatedConstructor) || (e03 = f10002e) == null || (c = e03.mo19028c(nlVar)) == null || !c.booleanValue()) {
            return null;
        }
        return JsonCreator.Mode.PROPERTIES;
    }

    @Deprecated
    public JsonCreator.Mode findCreatorBinding(C2911nl nlVar) {
        JsonCreator jsonCreator = (JsonCreator) _findAnnotation(nlVar, JsonCreator.class);
        if (jsonCreator == null) {
            return null;
        }
        return jsonCreator.mode();
    }

    public Enum<?> findDefaultEnumValue(Class<Enum<?>> cls) {
        return wf0.m29536v(cls, p43.class);
    }

    public Object findDeserializationContentConverter(AnnotatedMember annotatedMember) {
        n43 n43 = (n43) _findAnnotation(annotatedMember, n43.class);
        if (n43 == null) {
            return null;
        }
        return _classIfExplicit(n43.contentConverter(), ot0.C2992a.class);
    }

    @Deprecated
    public Class<?> findDeserializationContentType(C2911nl nlVar, JavaType javaType) {
        return null;
    }

    public Object findDeserializationConverter(C2911nl nlVar) {
        n43 n43 = (n43) _findAnnotation(nlVar, n43.class);
        if (n43 == null) {
            return null;
        }
        return _classIfExplicit(n43.converter(), ot0.C2992a.class);
    }

    @Deprecated
    public Class<?> findDeserializationKeyType(C2911nl nlVar, JavaType javaType) {
        return null;
    }

    @Deprecated
    public Class<?> findDeserializationType(C2911nl nlVar, JavaType javaType) {
        return null;
    }

    public Object findDeserializer(C2911nl nlVar) {
        Class<? extends o43> using;
        n43 n43 = (n43) _findAnnotation(nlVar, n43.class);
        if (n43 == null || (using = n43.using()) == o43.C2939a.class) {
            return null;
        }
        return using;
    }

    public void findEnumAliases(Class<?> cls, Enum<?>[] enumArr, String[][] strArr) {
        z33 z33;
        for (Field field : cls.getDeclaredFields()) {
            if (field.isEnumConstant() && (z33 = (z33) field.getAnnotation(z33.class)) != null) {
                String[] value = z33.value();
                if (value.length != 0) {
                    String name = field.getName();
                    int length = enumArr.length;
                    for (int i = 0; i < length; i++) {
                        if (name.equals(enumArr[i].name())) {
                            strArr[i] = value;
                        }
                    }
                }
            }
        }
    }

    @Deprecated
    public String findEnumValue(Enum<?> enumR) {
        JsonProperty jsonProperty;
        String value;
        try {
            Field field = enumR.getDeclaringClass().getField(enumR.name());
            if (!(field == null || (jsonProperty = (JsonProperty) field.getAnnotation(JsonProperty.class)) == null || (value = jsonProperty.value()) == null || value.isEmpty())) {
                return value;
            }
        } catch (NoSuchFieldException | SecurityException unused) {
        }
        return enumR.name();
    }

    public String[] findEnumValues(Class<?> cls, Enum<?>[] enumArr, String[] strArr) {
        JsonProperty jsonProperty;
        HashMap hashMap = null;
        for (Field field : cls.getDeclaredFields()) {
            if (field.isEnumConstant() && (jsonProperty = (JsonProperty) field.getAnnotation(JsonProperty.class)) != null) {
                String value = jsonProperty.value();
                if (!value.isEmpty()) {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(field.getName(), value);
                }
            }
        }
        if (hashMap != null) {
            int length = enumArr.length;
            for (int i = 0; i < length; i++) {
                String str = (String) hashMap.get(enumArr[i].name());
                if (str != null) {
                    strArr[i] = str;
                }
            }
        }
        return strArr;
    }

    public Object findFilterId(C2911nl nlVar) {
        q43 q43 = (q43) _findAnnotation(nlVar, q43.class);
        if (q43 == null) {
            return null;
        }
        String value = q43.value();
        if (!value.isEmpty()) {
            return value;
        }
        return null;
    }

    public JsonFormat.Value findFormat(C2911nl nlVar) {
        JsonFormat jsonFormat = (JsonFormat) _findAnnotation(nlVar, JsonFormat.class);
        if (jsonFormat == null) {
            return null;
        }
        return JsonFormat.Value.from(jsonFormat);
    }

    public String findImplicitPropertyName(AnnotatedMember annotatedMember) {
        PropertyName _findConstructorName = _findConstructorName(annotatedMember);
        if (_findConstructorName == null) {
            return null;
        }
        return _findConstructorName.getSimpleName();
    }

    public JacksonInject.Value findInjectableValue(AnnotatedMember annotatedMember) {
        String str;
        JacksonInject jacksonInject = (JacksonInject) _findAnnotation(annotatedMember, JacksonInject.class);
        if (jacksonInject == null) {
            return null;
        }
        JacksonInject.Value from = JacksonInject.Value.from(jacksonInject);
        if (from.hasId()) {
            return from;
        }
        if (!(annotatedMember instanceof AnnotatedMethod)) {
            str = annotatedMember.getRawType().getName();
        } else {
            AnnotatedMethod annotatedMethod = (AnnotatedMethod) annotatedMember;
            if (annotatedMethod.getParameterCount() == 0) {
                str = annotatedMember.getRawType().getName();
            } else {
                str = annotatedMethod.getRawParameterType(0).getName();
            }
        }
        return from.withId(str);
    }

    @Deprecated
    public Object findInjectableValueId(AnnotatedMember annotatedMember) {
        JacksonInject.Value findInjectableValue = findInjectableValue(annotatedMember);
        if (findInjectableValue == null) {
            return null;
        }
        return findInjectableValue.getId();
    }

    public Object findKeyDeserializer(C2911nl nlVar) {
        Class<? extends ha3> keyUsing;
        n43 n43 = (n43) _findAnnotation(nlVar, n43.class);
        if (n43 == null || (keyUsing = n43.keyUsing()) == ha3.C2459a.class) {
            return null;
        }
        return keyUsing;
    }

    public Object findKeySerializer(C2911nl nlVar) {
        Class<? extends y63> keyUsing;
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(nlVar, JsonSerialize.class);
        if (jsonSerialize == null || (keyUsing = jsonSerialize.keyUsing()) == y63.C3656a.class) {
            return null;
        }
        return keyUsing;
    }

    public Boolean findMergeInfo(C2911nl nlVar) {
        e53 e53 = (e53) _findAnnotation(nlVar, e53.class);
        if (e53 == null) {
            return null;
        }
        return e53.value().asBoolean();
    }

    public PropertyName findNameForDeserialization(C2911nl nlVar) {
        boolean z;
        JsonSetter jsonSetter = (JsonSetter) _findAnnotation(nlVar, JsonSetter.class);
        if (jsonSetter != null) {
            String value = jsonSetter.value();
            if (!value.isEmpty()) {
                return PropertyName.construct(value);
            }
            z = true;
        } else {
            z = false;
        }
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(nlVar, JsonProperty.class);
        String str = null;
        if (jsonProperty != null) {
            String namespace = jsonProperty.namespace();
            if (namespace == null || !namespace.isEmpty()) {
                str = namespace;
            }
            return PropertyName.construct(jsonProperty.value(), str);
        } else if (z || _hasOneOf(nlVar, f10001d)) {
            return PropertyName.USE_DEFAULT;
        } else {
            return null;
        }
    }

    public PropertyName findNameForSerialization(C2911nl nlVar) {
        boolean z;
        v43 v43 = (v43) _findAnnotation(nlVar, v43.class);
        if (v43 != null) {
            String value = v43.value();
            if (!value.isEmpty()) {
                return PropertyName.construct(value);
            }
            z = true;
        } else {
            z = false;
        }
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(nlVar, JsonProperty.class);
        String str = null;
        if (jsonProperty != null) {
            String namespace = jsonProperty.namespace();
            if (namespace == null || !namespace.isEmpty()) {
                str = namespace;
            }
            return PropertyName.construct(jsonProperty.value(), str);
        } else if (z || _hasOneOf(nlVar, f10000a)) {
            return PropertyName.USE_DEFAULT;
        } else {
            return null;
        }
    }

    public Object findNamingStrategy(C2021a aVar) {
        f53 f53 = (f53) _findAnnotation(aVar, f53.class);
        if (f53 == null) {
            return null;
        }
        return f53.value();
    }

    public Object findNullSerializer(C2911nl nlVar) {
        Class<? extends y63> nullsUsing;
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(nlVar, JsonSerialize.class);
        if (jsonSerialize == null || (nullsUsing = jsonSerialize.nullsUsing()) == y63.C3656a.class) {
            return null;
        }
        return nullsUsing;
    }

    public bf4 findObjectIdInfo(C2911nl nlVar) {
        w43 w43 = (w43) _findAnnotation(nlVar, w43.class);
        if (w43 == null || w43.generator() == ObjectIdGenerators$None.class) {
            return null;
        }
        return new bf4(PropertyName.construct(w43.property()), w43.scope(), w43.generator(), w43.resolver());
    }

    public bf4 findObjectReferenceInfo(C2911nl nlVar, bf4 bf4) {
        x43 x43 = (x43) _findAnnotation(nlVar, x43.class);
        if (x43 == null) {
            return bf4;
        }
        if (bf4 == null) {
            bf4 = bf4.m11343a();
        }
        return bf4.mo11632g(x43.alwaysAsId());
    }

    public Class<?> findPOJOBuilder(C2021a aVar) {
        n43 n43 = (n43) _findAnnotation(aVar, n43.class);
        if (n43 == null) {
            return null;
        }
        return _classIfExplicit(n43.builder());
    }

    public k53.C2643a findPOJOBuilderConfig(C2021a aVar) {
        k53 k53 = (k53) _findAnnotation(aVar, k53.class);
        if (k53 == null) {
            return null;
        }
        return new k53.C2643a(k53);
    }

    public JsonProperty.Access findPropertyAccess(C2911nl nlVar) {
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(nlVar, JsonProperty.class);
        if (jsonProperty != null) {
            return jsonProperty.access();
        }
        return null;
    }

    public List<PropertyName> findPropertyAliases(C2911nl nlVar) {
        z33 z33 = (z33) _findAnnotation(nlVar, z33.class);
        if (z33 == null) {
            return null;
        }
        if (r0 == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(r0);
        for (String construct : z33.value()) {
            arrayList.add(PropertyName.construct(construct));
        }
        return arrayList;
    }

    public l17<?> findPropertyContentTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        if (javaType.getContentType() != null) {
            return _findTypeResolver(mapperConfig, annotatedMember, javaType);
        }
        throw new IllegalArgumentException("Must call method with a container or reference type (got " + javaType + ")");
    }

    public String findPropertyDefaultValue(C2911nl nlVar) {
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(nlVar, JsonProperty.class);
        if (jsonProperty == null) {
            return null;
        }
        String defaultValue = jsonProperty.defaultValue();
        if (defaultValue.isEmpty()) {
            return null;
        }
        return defaultValue;
    }

    public String findPropertyDescription(C2911nl nlVar) {
        p53 p53 = (p53) _findAnnotation(nlVar, p53.class);
        if (p53 == null) {
            return null;
        }
        return p53.value();
    }

    public JsonIgnoreProperties.Value findPropertyIgnoralByName(MapperConfig<?> mapperConfig, C2911nl nlVar) {
        JsonIgnoreProperties jsonIgnoreProperties = (JsonIgnoreProperties) _findAnnotation(nlVar, JsonIgnoreProperties.class);
        if (jsonIgnoreProperties == null) {
            return JsonIgnoreProperties.Value.empty();
        }
        return JsonIgnoreProperties.Value.from(jsonIgnoreProperties);
    }

    @Deprecated
    public JsonIgnoreProperties.Value findPropertyIgnorals(C2911nl nlVar) {
        return findPropertyIgnoralByName((MapperConfig<?>) null, nlVar);
    }

    public JsonInclude.Value findPropertyInclusion(C2911nl nlVar) {
        JsonInclude.Value value;
        JsonInclude jsonInclude = (JsonInclude) _findAnnotation(nlVar, JsonInclude.class);
        if (jsonInclude == null) {
            value = JsonInclude.Value.empty();
        } else {
            value = JsonInclude.Value.from(jsonInclude);
        }
        if (value.getValueInclusion() == JsonInclude.Include.USE_DEFAULTS) {
            return mo16006f(nlVar, value);
        }
        return value;
    }

    public JsonIncludeProperties.Value findPropertyInclusionByName(MapperConfig<?> mapperConfig, C2911nl nlVar) {
        JsonIncludeProperties jsonIncludeProperties = (JsonIncludeProperties) _findAnnotation(nlVar, JsonIncludeProperties.class);
        if (jsonIncludeProperties == null) {
            return JsonIncludeProperties.Value.all();
        }
        return JsonIncludeProperties.Value.from(jsonIncludeProperties);
    }

    public Integer findPropertyIndex(C2911nl nlVar) {
        int index;
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(nlVar, JsonProperty.class);
        if (jsonProperty == null || (index = jsonProperty.index()) == -1) {
            return null;
        }
        return Integer.valueOf(index);
    }

    public l17<?> findPropertyTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        if (javaType.isContainerType() || javaType.isReferenceType()) {
            return null;
        }
        return _findTypeResolver(mapperConfig, annotatedMember, javaType);
    }

    public AnnotationIntrospector.ReferenceProperty findReferenceType(AnnotatedMember annotatedMember) {
        c53 c53 = (c53) _findAnnotation(annotatedMember, c53.class);
        if (c53 != null) {
            return AnnotationIntrospector.ReferenceProperty.m13977e(c53.value());
        }
        f43 f43 = (f43) _findAnnotation(annotatedMember, f43.class);
        if (f43 != null) {
            return AnnotationIntrospector.ReferenceProperty.m13976a(f43.value());
        }
        return null;
    }

    public PropertyName findRenameByField(MapperConfig<?> mapperConfig, AnnotatedField annotatedField, PropertyName propertyName) {
        return null;
    }

    public PropertyName findRootName(C2021a aVar) {
        u53 u53 = (u53) _findAnnotation(aVar, u53.class);
        String str = null;
        if (u53 == null) {
            return null;
        }
        String namespace = u53.namespace();
        if (namespace == null || !namespace.isEmpty()) {
            str = namespace;
        }
        return PropertyName.construct(u53.value(), str);
    }

    public Object findSerializationContentConverter(AnnotatedMember annotatedMember) {
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotatedMember, JsonSerialize.class);
        if (jsonSerialize == null) {
            return null;
        }
        return _classIfExplicit(jsonSerialize.contentConverter(), ot0.C2992a.class);
    }

    @Deprecated
    public Class<?> findSerializationContentType(C2911nl nlVar, JavaType javaType) {
        return null;
    }

    public Object findSerializationConverter(C2911nl nlVar) {
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(nlVar, JsonSerialize.class);
        if (jsonSerialize == null) {
            return null;
        }
        return _classIfExplicit(jsonSerialize.converter(), ot0.C2992a.class);
    }

    @Deprecated
    public Class<?> findSerializationKeyType(C2911nl nlVar, JavaType javaType) {
        return null;
    }

    public String[] findSerializationPropertyOrder(C2021a aVar) {
        q53 q53 = (q53) _findAnnotation(aVar, q53.class);
        if (q53 == null) {
            return null;
        }
        return q53.value();
    }

    public Boolean findSerializationSortAlphabetically(C2911nl nlVar) {
        return mo16003c(nlVar);
    }

    @Deprecated
    public Class<?> findSerializationType(C2911nl nlVar) {
        return null;
    }

    public JsonSerialize.Typing findSerializationTyping(C2911nl nlVar) {
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(nlVar, JsonSerialize.class);
        if (jsonSerialize == null) {
            return null;
        }
        return jsonSerialize.typing();
    }

    public Object findSerializer(C2911nl nlVar) {
        Class<? extends y63> using;
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(nlVar, JsonSerialize.class);
        if (jsonSerialize != null && (using = jsonSerialize.using()) != y63.C3656a.class) {
            return using;
        }
        s53 s53 = (s53) _findAnnotation(nlVar, s53.class);
        if (s53 == null || !s53.value()) {
            return null;
        }
        return new RawSerializer(nlVar.getRawType());
    }

    public JsonSetter.Value findSetterInfo(C2911nl nlVar) {
        return JsonSetter.Value.from((JsonSetter) _findAnnotation(nlVar, JsonSetter.class));
    }

    public List<NamedType> findSubtypes(C2911nl nlVar) {
        c73 c73 = (c73) _findAnnotation(nlVar, c73.class);
        if (c73 == null) {
            return null;
        }
        c73.C1668a[] value = c73.value();
        ArrayList arrayList = new ArrayList(value.length);
        for (c73.C1668a aVar : value) {
            arrayList.add(new NamedType(aVar.value(), aVar.name()));
            for (String namedType : aVar.names()) {
                arrayList.add(new NamedType(aVar.value(), namedType));
            }
        }
        return arrayList;
    }

    public String findTypeName(C2021a aVar) {
        f73 f73 = (f73) _findAnnotation(aVar, f73.class);
        if (f73 == null) {
            return null;
        }
        return f73.value();
    }

    public l17<?> findTypeResolver(MapperConfig<?> mapperConfig, C2021a aVar, JavaType javaType) {
        return _findTypeResolver(mapperConfig, aVar, javaType);
    }

    public NameTransformer findUnwrappingNameTransformer(AnnotatedMember annotatedMember) {
        h73 h73 = (h73) _findAnnotation(annotatedMember, h73.class);
        if (h73 == null || !h73.enabled()) {
            return null;
        }
        return NameTransformer.simpleTransformer(h73.prefix(), h73.suffix());
    }

    public Object findValueInstantiator(C2021a aVar) {
        m73 m73 = (m73) _findAnnotation(aVar, m73.class);
        if (m73 == null) {
            return null;
        }
        return m73.value();
    }

    public Class<?>[] findViews(C2911nl nlVar) {
        o73 o73 = (o73) _findAnnotation(nlVar, o73.class);
        if (o73 == null) {
            return null;
        }
        return o73.value();
    }

    public Boolean hasAnyGetter(C2911nl nlVar) {
        b43 b43 = (b43) _findAnnotation(nlVar, b43.class);
        if (b43 == null) {
            return null;
        }
        return Boolean.valueOf(b43.enabled());
    }

    @Deprecated
    public boolean hasAnyGetterAnnotation(AnnotatedMethod annotatedMethod) {
        return _hasAnnotation(annotatedMethod, b43.class);
    }

    public Boolean hasAnySetter(C2911nl nlVar) {
        c43 c43 = (c43) _findAnnotation(nlVar, c43.class);
        if (c43 == null) {
            return null;
        }
        return Boolean.valueOf(c43.enabled());
    }

    @Deprecated
    public boolean hasAnySetterAnnotation(AnnotatedMethod annotatedMethod) {
        return _hasAnnotation(annotatedMethod, c43.class);
    }

    public Boolean hasAsKey(MapperConfig<?> mapperConfig, C2911nl nlVar) {
        b53 b53 = (b53) _findAnnotation(nlVar, b53.class);
        if (b53 == null) {
            return null;
        }
        return Boolean.valueOf(b53.value());
    }

    public Boolean hasAsValue(C2911nl nlVar) {
        k73 k73 = (k73) _findAnnotation(nlVar, k73.class);
        if (k73 == null) {
            return null;
        }
        return Boolean.valueOf(k73.value());
    }

    @Deprecated
    public boolean hasAsValueAnnotation(AnnotatedMethod annotatedMethod) {
        k73 k73 = (k73) _findAnnotation(annotatedMethod, k73.class);
        if (k73 == null || !k73.value()) {
            return false;
        }
        return true;
    }

    @Deprecated
    public boolean hasCreatorAnnotation(C2911nl nlVar) {
        e03 e03;
        Boolean c;
        JsonCreator jsonCreator = (JsonCreator) _findAnnotation(nlVar, JsonCreator.class);
        if (jsonCreator != null) {
            if (jsonCreator.mode() != JsonCreator.Mode.DISABLED) {
                return true;
            }
            return false;
        } else if (!this._cfgConstructorPropertiesImpliesCreator || !(nlVar instanceof AnnotatedConstructor) || (e03 = f10002e) == null || (c = e03.mo19028c(nlVar)) == null) {
            return false;
        } else {
            return c.booleanValue();
        }
    }

    public boolean hasIgnoreMarker(AnnotatedMember annotatedMember) {
        return _isIgnorable(annotatedMember);
    }

    public Boolean hasRequiredMarker(AnnotatedMember annotatedMember) {
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(annotatedMember, JsonProperty.class);
        if (jsonProperty != null) {
            return Boolean.valueOf(jsonProperty.required());
        }
        return null;
    }

    public boolean isAnnotationBundle(Annotation annotation) {
        boolean z;
        Class<? extends Annotation> annotationType = annotation.annotationType();
        Boolean bool = this._annotationsInside.get(annotationType);
        if (bool == null) {
            if (annotationType.getAnnotation(wz2.class) != null) {
                z = true;
            } else {
                z = false;
            }
            bool = Boolean.valueOf(z);
            this._annotationsInside.putIfAbsent(annotationType, bool);
        }
        return bool.booleanValue();
    }

    public Boolean isIgnorableType(C2021a aVar) {
        z43 z43 = (z43) _findAnnotation(aVar, z43.class);
        if (z43 == null) {
            return null;
        }
        return Boolean.valueOf(z43.value());
    }

    public Boolean isTypeId(AnnotatedMember annotatedMember) {
        return Boolean.valueOf(_hasAnnotation(annotatedMember, d73.class));
    }

    public Object readResolve() {
        if (this._annotationsInside == null) {
            this._annotationsInside = new LRUMap<>(48, 48);
        }
        return this;
    }

    public JavaType refineDeserializationType(MapperConfig<?> mapperConfig, C2911nl nlVar, JavaType javaType) throws JsonMappingException {
        Class<?> cls;
        Class<?> cls2;
        TypeFactory typeFactory = mapperConfig.getTypeFactory();
        n43 n43 = (n43) _findAnnotation(nlVar, n43.class);
        Class<?> cls3 = null;
        if (n43 == null) {
            cls = null;
        } else {
            cls = _classIfExplicit(n43.mo23491as());
        }
        if (cls != null && !javaType.hasRawClass(cls) && !mo16004d(javaType, cls)) {
            try {
                javaType = typeFactory.constructSpecializedType(javaType, cls);
            } catch (IllegalArgumentException e) {
                throw mo16002b(e, String.format("Failed to narrow type %s with annotation (value %s), from '%s': %s", new Object[]{javaType, cls.getName(), nlVar.getName(), e.getMessage()}));
            }
        }
        if (javaType.isMapLikeType()) {
            JavaType keyType = javaType.getKeyType();
            if (n43 == null) {
                cls2 = null;
            } else {
                cls2 = _classIfExplicit(n43.keyAs());
            }
            if (cls2 != null && !mo16004d(keyType, cls2)) {
                try {
                    javaType = ((MapLikeType) javaType).withKeyType(typeFactory.constructSpecializedType(keyType, cls2));
                } catch (IllegalArgumentException e2) {
                    throw mo16002b(e2, String.format("Failed to narrow key type of %s with concrete-type annotation (value %s), from '%s': %s", new Object[]{javaType, cls2.getName(), nlVar.getName(), e2.getMessage()}));
                }
            }
        }
        JavaType contentType = javaType.getContentType();
        if (contentType == null) {
            return javaType;
        }
        if (n43 != null) {
            cls3 = _classIfExplicit(n43.contentAs());
        }
        if (cls3 == null || mo16004d(contentType, cls3)) {
            return javaType;
        }
        try {
            return javaType.withContentType(typeFactory.constructSpecializedType(contentType, cls3));
        } catch (IllegalArgumentException e3) {
            throw mo16002b(e3, String.format("Failed to narrow value type of %s with concrete-type annotation (value %s), from '%s': %s", new Object[]{javaType, cls3.getName(), nlVar.getName(), e3.getMessage()}));
        }
    }

    public JavaType refineSerializationType(MapperConfig<?> mapperConfig, C2911nl nlVar, JavaType javaType) throws JsonMappingException {
        Class<?> cls;
        JavaType javaType2;
        Class<?> cls2;
        JavaType javaType3;
        TypeFactory typeFactory = mapperConfig.getTypeFactory();
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(nlVar, JsonSerialize.class);
        Class<?> cls3 = null;
        if (jsonSerialize == null) {
            cls = null;
        } else {
            cls = _classIfExplicit(jsonSerialize.mo15038as());
        }
        if (cls != null) {
            if (javaType.hasRawClass(cls)) {
                javaType = javaType.withStaticTyping();
            } else {
                Class<?> rawClass = javaType.getRawClass();
                try {
                    if (cls.isAssignableFrom(rawClass)) {
                        javaType = typeFactory.constructGeneralizedType(javaType, cls);
                    } else if (rawClass.isAssignableFrom(cls)) {
                        javaType = typeFactory.constructSpecializedType(javaType, cls);
                    } else if (mo16005e(rawClass, cls)) {
                        javaType = javaType.withStaticTyping();
                    } else {
                        throw mo16001a(String.format("Cannot refine serialization type %s into %s; types not related", new Object[]{javaType, cls.getName()}));
                    }
                } catch (IllegalArgumentException e) {
                    throw mo16002b(e, String.format("Failed to widen type %s with annotation (value %s), from '%s': %s", new Object[]{javaType, cls.getName(), nlVar.getName(), e.getMessage()}));
                }
            }
        }
        if (javaType.isMapLikeType()) {
            JavaType keyType = javaType.getKeyType();
            if (jsonSerialize == null) {
                cls2 = null;
            } else {
                cls2 = _classIfExplicit(jsonSerialize.keyAs());
            }
            if (cls2 != null) {
                if (keyType.hasRawClass(cls2)) {
                    javaType3 = keyType.withStaticTyping();
                } else {
                    Class<?> rawClass2 = keyType.getRawClass();
                    try {
                        if (cls2.isAssignableFrom(rawClass2)) {
                            javaType3 = typeFactory.constructGeneralizedType(keyType, cls2);
                        } else if (rawClass2.isAssignableFrom(cls2)) {
                            javaType3 = typeFactory.constructSpecializedType(keyType, cls2);
                        } else if (mo16005e(rawClass2, cls2)) {
                            javaType3 = keyType.withStaticTyping();
                        } else {
                            throw mo16001a(String.format("Cannot refine serialization key type %s into %s; types not related", new Object[]{keyType, cls2.getName()}));
                        }
                    } catch (IllegalArgumentException e2) {
                        throw mo16002b(e2, String.format("Failed to widen key type of %s with concrete-type annotation (value %s), from '%s': %s", new Object[]{javaType, cls2.getName(), nlVar.getName(), e2.getMessage()}));
                    }
                }
                javaType = ((MapLikeType) javaType).withKeyType(javaType3);
            }
        }
        JavaType contentType = javaType.getContentType();
        if (contentType == null) {
            return javaType;
        }
        if (jsonSerialize != null) {
            cls3 = _classIfExplicit(jsonSerialize.contentAs());
        }
        if (cls3 == null) {
            return javaType;
        }
        if (contentType.hasRawClass(cls3)) {
            javaType2 = contentType.withStaticTyping();
        } else {
            Class<?> rawClass3 = contentType.getRawClass();
            try {
                if (cls3.isAssignableFrom(rawClass3)) {
                    javaType2 = typeFactory.constructGeneralizedType(contentType, cls3);
                } else if (rawClass3.isAssignableFrom(cls3)) {
                    javaType2 = typeFactory.constructSpecializedType(contentType, cls3);
                } else if (mo16005e(rawClass3, cls3)) {
                    javaType2 = contentType.withStaticTyping();
                } else {
                    throw mo16001a(String.format("Cannot refine serialization content type %s into %s; types not related", new Object[]{contentType, cls3.getName()}));
                }
            } catch (IllegalArgumentException e3) {
                throw mo16002b(e3, String.format("Internal error: failed to refine value type of %s with concrete-type annotation (value %s), from '%s': %s", new Object[]{javaType, cls3.getName(), nlVar.getName(), e3.getMessage()}));
            }
        }
        return javaType.withContentType(javaType2);
    }

    public AnnotatedMethod resolveSetterConflict(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, AnnotatedMethod annotatedMethod2) {
        Class<String> cls = String.class;
        Class<?> rawParameterType = annotatedMethod.getRawParameterType(0);
        Class<?> rawParameterType2 = annotatedMethod2.getRawParameterType(0);
        if (rawParameterType.isPrimitive()) {
            if (!rawParameterType2.isPrimitive()) {
                return annotatedMethod;
            }
            return null;
        } else if (rawParameterType2.isPrimitive()) {
            return annotatedMethod2;
        } else {
            if (rawParameterType == cls) {
                if (rawParameterType2 != cls) {
                    return annotatedMethod;
                }
            } else if (rawParameterType2 == cls) {
                return annotatedMethod2;
            }
            return null;
        }
    }

    public JacksonAnnotationIntrospector setConstructorPropertiesImpliesCreator(boolean z) {
        this._cfgConstructorPropertiesImpliesCreator = z;
        return this;
    }

    public Version version() {
        return rk4.f17279a;
    }

    public Class<?> _classIfExplicit(Class<?> cls, Class<?> cls2) {
        Class<?> _classIfExplicit = _classIfExplicit(cls);
        if (_classIfExplicit == null || _classIfExplicit == cls2) {
            return null;
        }
        return _classIfExplicit;
    }

    public BeanPropertyWriter _constructVirtualProperty(d43.C2134b bVar, MapperConfig<?> mapperConfig, C2021a aVar) {
        PropertyMetadata propertyMetadata = bVar.required() ? PropertyMetadata.STD_REQUIRED : PropertyMetadata.STD_OPTIONAL;
        PropertyName _propertyName = _propertyName(bVar.name(), bVar.namespace());
        JavaType constructType = mapperConfig.constructType(bVar.type());
        z16 I = z16.m30928I(mapperConfig, new VirtualAnnotatedMember(aVar, aVar.getRawType(), _propertyName.getSimpleName(), constructType), _propertyName, propertyMetadata, bVar.include());
        Class<? extends VirtualBeanPropertyWriter> value = bVar.value();
        mapperConfig.getHandlerInstantiator();
        return ((VirtualBeanPropertyWriter) wf0.m29522l(value, mapperConfig.canOverrideAccessModifiers())).withConfig(mapperConfig, aVar, I, constructType);
    }
}
