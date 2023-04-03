package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.TokenStreamFactory;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.ser.impl.UnsupportedTypeSerializer;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.ser.std.ToEmptyObjectSerializer;
import com.fasterxml.jackson.databind.util.IgnorePropertiesUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class BeanSerializerFactory extends BasicSerializerFactory {
    public static final BeanSerializerFactory instance = new BeanSerializerFactory((SerializerFactoryConfig) null);
    private static final long serialVersionUID = 1;

    public BeanSerializerFactory(SerializerFactoryConfig serializerFactoryConfig) {
        super(serializerFactoryConfig);
    }

    public BeanPropertyWriter _constructWriter(zw5 zw5, q00 q00, ex4 ex4, boolean z, AnnotatedMember annotatedMember) throws JsonMappingException {
        zw5 zw52 = zw5;
        AnnotatedMember annotatedMember2 = annotatedMember;
        PropertyName fullName = q00.getFullName();
        JavaType type = annotatedMember.getType();
        BeanProperty.Std std = new BeanProperty.Std(fullName, type, q00.getWrapperName(), annotatedMember, q00.getMetadata());
        y63<Object> findSerializerFromAnnotation = findSerializerFromAnnotation(zw5, annotatedMember2);
        if (findSerializerFromAnnotation instanceof ye5) {
            ((ye5) findSerializerFromAnnotation).resolve(zw5);
        }
        y63<?> handlePrimaryContextualization = zw5.handlePrimaryContextualization(findSerializerFromAnnotation, std);
        m17 m17 = null;
        if (type.isContainerType() || type.isReferenceType()) {
            m17 = findPropertyContentTypeSerializer(type, zw5.getConfig(), annotatedMember2);
        }
        m17 m172 = m17;
        return ex4.mo19510c(zw5, q00, type, handlePrimaryContextualization, findPropertyTypeSerializer(type, zw5.getConfig(), annotatedMember2), m172, annotatedMember, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e A[LOOP:0: B:11:0x002e->B:14:0x003e, LOOP_START, PHI: r2 
      PHI: (r2v1 y63) = (r2v0 y63), (r2v5 y63) binds: [B:10:0x0026, B:14:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p000.y63<?> _createSerializer2(p000.zw5 r5, com.fasterxml.jackson.databind.JavaType r6, p000.n00 r7, boolean r8) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r4 = this;
            com.fasterxml.jackson.databind.SerializationConfig r0 = r5.getConfig()
            boolean r1 = r6.isContainerType()
            r2 = 0
            if (r1 == 0) goto L_0x0018
            if (r8 != 0) goto L_0x0011
            boolean r8 = r4.usesStaticTyping(r0, r7, r2)
        L_0x0011:
            y63 r1 = r4.buildContainerSerializer(r5, r6, r7, r8)
            if (r1 == 0) goto L_0x0047
            return r1
        L_0x0018:
            boolean r1 = r6.isReferenceType()
            if (r1 == 0) goto L_0x0026
            r1 = r6
            com.fasterxml.jackson.databind.type.ReferenceType r1 = (com.fasterxml.jackson.databind.type.ReferenceType) r1
            y63 r1 = r4.findReferenceSerializer(r5, r1, r7, r8)
            goto L_0x0041
        L_0x0026:
            java.lang.Iterable r1 = r4.customSerializers()
            java.util.Iterator r1 = r1.iterator()
        L_0x002e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0040
            java.lang.Object r2 = r1.next()
            ax5 r2 = (p000.ax5) r2
            y63 r2 = r2.findSerializer(r0, r6, r7)
            if (r2 == 0) goto L_0x002e
        L_0x0040:
            r1 = r2
        L_0x0041:
            if (r1 != 0) goto L_0x0047
            y63 r1 = r4.findSerializerByAnnotations(r5, r6, r7)
        L_0x0047:
            if (r1 != 0) goto L_0x0063
            y63 r1 = r4.findSerializerByLookup(r6, r0, r7, r8)
            if (r1 != 0) goto L_0x0063
            y63 r1 = r4.findSerializerByPrimaryType(r5, r6, r7, r8)
            if (r1 != 0) goto L_0x0063
            y63 r1 = r4.findBeanOrAddOnSerializer(r5, r6, r7, r8)
            if (r1 != 0) goto L_0x0063
            java.lang.Class r6 = r7.mo23460r()
            y63 r1 = r5.getUnknownTypeSerializer(r6)
        L_0x0063:
            if (r1 == 0) goto L_0x0088
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r5 = r4._factoryConfig
            boolean r5 = r5.hasSerializerModifiers()
            if (r5 == 0) goto L_0x0088
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r5 = r4._factoryConfig
            java.lang.Iterable r5 = r5.serializerModifiers()
            java.util.Iterator r5 = r5.iterator()
        L_0x0077:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0088
            java.lang.Object r6 = r5.next()
            s00 r6 = (p000.s00) r6
            y63 r1 = r6.mo25577i(r0, r7, r1)
            goto L_0x0077
        L_0x0088:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.BeanSerializerFactory._createSerializer2(zw5, com.fasterxml.jackson.databind.JavaType, n00, boolean):y63");
    }

    public y63<?> _findUnsupportedTypeSerializer(zw5 zw5, JavaType javaType, n00 n00) throws JsonMappingException {
        String a = t00.m27230a(javaType);
        if (a == null || zw5.getConfig().findMixInClassFor(javaType.getRawClass()) != null) {
            return null;
        }
        return new UnsupportedTypeSerializer(javaType, a);
    }

    public boolean _isUnserializableJacksonType(zw5 zw5, JavaType javaType) {
        Class<?> rawClass = javaType.getRawClass();
        if (ObjectMapper.class.isAssignableFrom(rawClass) || ObjectReader.class.isAssignableFrom(rawClass) || ObjectWriter.class.isAssignableFrom(rawClass) || k21.class.isAssignableFrom(rawClass) || TokenStreamFactory.class.isAssignableFrom(rawClass) || JsonParser.class.isAssignableFrom(rawClass) || JsonGenerator.class.isAssignableFrom(rawClass)) {
            return true;
        }
        return false;
    }

    public y63<Object> constructBeanOrAddOnSerializer(zw5 zw5, JavaType javaType, n00 n00, boolean z) throws JsonMappingException {
        List<BeanPropertyWriter> list;
        zw5 zw52 = zw5;
        JavaType javaType2 = javaType;
        n00 n002 = n00;
        Class<Object> cls = Object.class;
        if (n00.mo23460r() == cls) {
            return zw52.getUnknownTypeSerializer(cls);
        }
        y63<?> _findUnsupportedTypeSerializer = _findUnsupportedTypeSerializer(zw5, javaType, n00);
        if (_findUnsupportedTypeSerializer != null) {
            return _findUnsupportedTypeSerializer;
        }
        if (_isUnserializableJacksonType(zw5, javaType)) {
            return new ToEmptyObjectSerializer(javaType2);
        }
        SerializationConfig config = zw5.getConfig();
        r00 constructBeanSerializerBuilder = constructBeanSerializerBuilder(n002);
        constructBeanSerializerBuilder.mo25306j(config);
        List<BeanPropertyWriter> findBeanProperties = findBeanProperties(zw52, n002, constructBeanSerializerBuilder);
        if (findBeanProperties == null) {
            list = new ArrayList<>();
        } else {
            list = removeOverlappingTypeIds(zw52, n002, constructBeanSerializerBuilder, findBeanProperties);
        }
        zw5.getAnnotationIntrospector().findAndAddVirtualProperties(config, n00.mo23462t(), list);
        if (this._factoryConfig.hasSerializerModifiers()) {
            for (s00 a : this._factoryConfig.serializerModifiers()) {
                list = a.mo25569a(config, n002, list);
            }
        }
        List<BeanPropertyWriter> filterBeanProperties = filterBeanProperties(config, n002, filterUnwantedJDKProperties(config, n002, list));
        if (this._factoryConfig.hasSerializerModifiers()) {
            for (s00 j : this._factoryConfig.serializerModifiers()) {
                filterBeanProperties = j.mo25578j(config, n002, filterBeanProperties);
            }
        }
        constructBeanSerializerBuilder.mo25309m(constructObjectIdHandler(zw52, n002, filterBeanProperties));
        constructBeanSerializerBuilder.mo25310n(filterBeanProperties);
        constructBeanSerializerBuilder.mo25307k(findFilterId(config, n002));
        AnnotatedMember a2 = n00.mo23443a();
        if (a2 != null) {
            JavaType type = a2.getType();
            JavaType contentType = type.getContentType();
            m17 createTypeSerializer = createTypeSerializer(config, contentType);
            y63 findSerializerFromAnnotation = findSerializerFromAnnotation(zw52, a2);
            if (findSerializerFromAnnotation == null) {
                findSerializerFromAnnotation = MapSerializer.construct((Set<String>) null, type, config.isEnabled(MapperFeature.USE_STATIC_TYPING), createTypeSerializer, (y63<Object>) null, (y63<Object>) null, (Object) null);
            }
            constructBeanSerializerBuilder.mo25305i(new C2613jm(new BeanProperty.Std(PropertyName.construct(a2.getName()), contentType, (PropertyName) null, a2, PropertyMetadata.STD_OPTIONAL), a2, findSerializerFromAnnotation));
        }
        processViews(config, constructBeanSerializerBuilder);
        if (this._factoryConfig.hasSerializerModifiers()) {
            for (s00 k : this._factoryConfig.serializerModifiers()) {
                constructBeanSerializerBuilder = k.mo25579k(config, n002, constructBeanSerializerBuilder);
            }
        }
        try {
            y63<?> a3 = constructBeanSerializerBuilder.mo25297a();
            if (a3 == null) {
                if (javaType.isRecordType()) {
                    return constructBeanSerializerBuilder.mo25298b();
                }
                a3 = findSerializerByAddonType(config, javaType2, n002, z);
                if (a3 == null && n00.mo23440B()) {
                    return constructBeanSerializerBuilder.mo25298b();
                }
            }
            return a3;
        } catch (RuntimeException e) {
            RuntimeException runtimeException = e;
            return (y63) zw52.reportBadTypeDefinition(n002, "Failed to construct BeanSerializer for %s: (%s) %s", n00.mo23439A(), runtimeException.getClass().getName(), runtimeException.getMessage());
        }
    }

    @Deprecated
    public y63<Object> constructBeanSerializer(zw5 zw5, n00 n00) throws JsonMappingException {
        return constructBeanOrAddOnSerializer(zw5, n00.mo23439A(), n00, zw5.isEnabled(MapperFeature.USE_STATIC_TYPING));
    }

    public r00 constructBeanSerializerBuilder(n00 n00) {
        return new r00(n00);
    }

    public BeanPropertyWriter constructFilteredBeanWriter(BeanPropertyWriter beanPropertyWriter, Class<?>[] clsArr) {
        return FilteredBeanPropertyWriter.m14281a(beanPropertyWriter, clsArr);
    }

    public cf4 constructObjectIdHandler(zw5 zw5, n00 n00, List<BeanPropertyWriter> list) throws JsonMappingException {
        bf4 z = n00.mo23468z();
        if (z == null) {
            return null;
        }
        Class<? extends ObjectIdGenerator<?>> c = z.mo11628c();
        if (c == ObjectIdGenerators$PropertyGenerator.class) {
            String simpleName = z.mo11629d().getSimpleName();
            int size = list.size();
            for (int i = 0; i != size; i++) {
                BeanPropertyWriter beanPropertyWriter = list.get(i);
                if (simpleName.equals(beanPropertyWriter.getName())) {
                    if (i > 0) {
                        list.remove(i);
                        list.add(0, beanPropertyWriter);
                    }
                    return cf4.m11853a(beanPropertyWriter.getType(), (PropertyName) null, new PropertyBasedObjectIdGenerator(z, beanPropertyWriter), z.mo11627b());
                }
            }
            throw new IllegalArgumentException(String.format("Invalid Object Id definition for %s: cannot find property with name %s", new Object[]{wf0.m29480G(n00.mo23439A()), wf0.m29495V(simpleName)}));
        }
        return cf4.m11853a(zw5.getTypeFactory().findTypeParameters(zw5.constructType(c), (Class<?>) ObjectIdGenerator.class)[0], z.mo11629d(), zw5.objectIdGeneratorInstance(n00.mo23462t(), z), z.mo11627b());
    }

    public ex4 constructPropertyBuilder(SerializationConfig serializationConfig, n00 n00) {
        return new ex4(serializationConfig, n00);
    }

    public y63<Object> createSerializer(zw5 zw5, JavaType javaType) throws JsonMappingException {
        JavaType javaType2;
        SerializationConfig config = zw5.getConfig();
        n00 introspect = config.introspect(javaType);
        y63 findSerializerFromAnnotation = findSerializerFromAnnotation(zw5, introspect.mo23462t());
        if (findSerializerFromAnnotation != null) {
            return findSerializerFromAnnotation;
        }
        AnnotationIntrospector annotationIntrospector = config.getAnnotationIntrospector();
        boolean z = false;
        if (annotationIntrospector == null) {
            javaType2 = javaType;
        } else {
            try {
                javaType2 = annotationIntrospector.refineSerializationType(config, introspect.mo23462t(), javaType);
            } catch (JsonMappingException e) {
                return (y63) zw5.reportBadTypeDefinition(introspect, e.getMessage(), new Object[0]);
            }
        }
        if (javaType2 != javaType) {
            if (!javaType2.hasRawClass(javaType.getRawClass())) {
                introspect = config.introspect(javaType2);
            }
            z = true;
        }
        ot0<Object, Object> q = introspect.mo23459q();
        if (q == null) {
            return _createSerializer2(zw5, javaType2, introspect, z);
        }
        JavaType c = q.mo23478c(zw5.getTypeFactory());
        if (!c.hasRawClass(javaType2.getRawClass())) {
            introspect = config.introspect(c);
            findSerializerFromAnnotation = findSerializerFromAnnotation(zw5, introspect.mo23462t());
        }
        if (findSerializerFromAnnotation == null && !c.isJavaLangObject()) {
            findSerializerFromAnnotation = _createSerializer2(zw5, c, introspect, true);
        }
        return new StdDelegatingSerializer(q, c, findSerializerFromAnnotation);
    }

    public Iterable<ax5> customSerializers() {
        return this._factoryConfig.serializers();
    }

    public List<BeanPropertyWriter> filterBeanProperties(SerializationConfig serializationConfig, n00 n00, List<BeanPropertyWriter> list) {
        Set<String> set;
        JsonIgnoreProperties.Value defaultPropertyIgnorals = serializationConfig.getDefaultPropertyIgnorals(n00.mo23460r(), n00.mo23462t());
        Set<String> set2 = null;
        if (defaultPropertyIgnorals != null) {
            set = defaultPropertyIgnorals.findIgnoredForSerialization();
        } else {
            set = null;
        }
        JsonIncludeProperties.Value defaultPropertyInclusions = serializationConfig.getDefaultPropertyInclusions(n00.mo23460r(), n00.mo23462t());
        if (defaultPropertyInclusions != null) {
            set2 = defaultPropertyInclusions.getIncluded();
        }
        if (set2 != null || (set != null && !set.isEmpty())) {
            Iterator<BeanPropertyWriter> it = list.iterator();
            while (it.hasNext()) {
                if (IgnorePropertiesUtil.m14343c(it.next().getName(), set, set2)) {
                    it.remove();
                }
            }
        }
        return list;
    }

    public List<BeanPropertyWriter> filterUnwantedJDKProperties(SerializationConfig serializationConfig, n00 n00, List<BeanPropertyWriter> list) {
        if (n00.mo23439A().isTypeOrSubTypeOf(CharSequence.class) && list.size() == 1) {
            AnnotatedMember member = list.get(0).getMember();
            if ((member instanceof AnnotatedMethod) && "isEmpty".equals(member.getName()) && member.getDeclaringClass() == CharSequence.class) {
                list.remove(0);
            }
        }
        return list;
    }

    public y63<Object> findBeanOrAddOnSerializer(zw5 zw5, JavaType javaType, n00 n00, boolean z) throws JsonMappingException {
        if (isPotentialBeanType(javaType.getRawClass()) || wf0.m29485L(javaType.getRawClass())) {
            return constructBeanOrAddOnSerializer(zw5, javaType, n00, z);
        }
        return null;
    }

    public List<BeanPropertyWriter> findBeanProperties(zw5 zw5, n00 n00, r00 r00) throws JsonMappingException {
        List<q00> o = n00.mo23457o();
        SerializationConfig config = zw5.getConfig();
        removeIgnorableTypes(config, n00, o);
        if (config.isEnabled(MapperFeature.REQUIRE_SETTERS_FOR_GETTERS)) {
            removeSetterlessGetters(config, n00, o);
        }
        if (o.isEmpty()) {
            return null;
        }
        boolean usesStaticTyping = usesStaticTyping(config, n00, (m17) null);
        ex4 constructPropertyBuilder = constructPropertyBuilder(config, n00);
        ArrayList arrayList = new ArrayList(o.size());
        for (q00 next : o) {
            AnnotatedMember l = next.mo24887l();
            if (!next.mo24876G()) {
                AnnotationIntrospector.ReferenceProperty h = next.mo24885h();
                if (h == null || !h.mo14222c()) {
                    if (l instanceof AnnotatedMethod) {
                        arrayList.add(_constructWriter(zw5, next, constructPropertyBuilder, usesStaticTyping, (AnnotatedMethod) l));
                    } else {
                        arrayList.add(_constructWriter(zw5, next, constructPropertyBuilder, usesStaticTyping, (AnnotatedField) l));
                    }
                }
            } else if (l != null) {
                r00.mo25311o(l);
            }
        }
        return arrayList;
    }

    @Deprecated
    public y63<Object> findBeanSerializer(zw5 zw5, JavaType javaType, n00 n00) throws JsonMappingException {
        return findBeanOrAddOnSerializer(zw5, javaType, n00, zw5.isEnabled(MapperFeature.USE_STATIC_TYPING));
    }

    public m17 findPropertyContentTypeSerializer(JavaType javaType, SerializationConfig serializationConfig, AnnotatedMember annotatedMember) throws JsonMappingException {
        JavaType contentType = javaType.getContentType();
        l17<?> findPropertyContentTypeResolver = serializationConfig.getAnnotationIntrospector().findPropertyContentTypeResolver(serializationConfig, annotatedMember, javaType);
        if (findPropertyContentTypeResolver == null) {
            return createTypeSerializer(serializationConfig, contentType);
        }
        return findPropertyContentTypeResolver.buildTypeSerializer(serializationConfig, contentType, serializationConfig.getSubtypeResolver().collectAndResolveSubtypesByClass(serializationConfig, annotatedMember, contentType));
    }

    public m17 findPropertyTypeSerializer(JavaType javaType, SerializationConfig serializationConfig, AnnotatedMember annotatedMember) throws JsonMappingException {
        l17<?> findPropertyTypeResolver = serializationConfig.getAnnotationIntrospector().findPropertyTypeResolver(serializationConfig, annotatedMember, javaType);
        if (findPropertyTypeResolver == null) {
            return createTypeSerializer(serializationConfig, javaType);
        }
        return findPropertyTypeResolver.buildTypeSerializer(serializationConfig, javaType, serializationConfig.getSubtypeResolver().collectAndResolveSubtypesByClass(serializationConfig, annotatedMember, javaType));
    }

    public boolean isPotentialBeanType(Class<?> cls) {
        if (wf0.m29510f(cls) != null || wf0.m29492S(cls)) {
            return false;
        }
        return true;
    }

    public void processViews(SerializationConfig serializationConfig, r00 r00) {
        List<BeanPropertyWriter> g = r00.mo25303g();
        boolean isEnabled = serializationConfig.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION);
        int size = g.size();
        BeanPropertyWriter[] beanPropertyWriterArr = new BeanPropertyWriter[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            BeanPropertyWriter beanPropertyWriter = g.get(i2);
            Class[] views = beanPropertyWriter.getViews();
            if (views != null && views.length != 0) {
                i++;
                beanPropertyWriterArr[i2] = constructFilteredBeanWriter(beanPropertyWriter, views);
            } else if (isEnabled) {
                beanPropertyWriterArr[i2] = beanPropertyWriter;
            }
        }
        if (!isEnabled || i != 0) {
            r00.mo25308l(beanPropertyWriterArr);
        }
    }

    public void removeIgnorableTypes(SerializationConfig serializationConfig, n00 n00, List<q00> list) {
        AnnotationIntrospector annotationIntrospector = serializationConfig.getAnnotationIntrospector();
        HashMap hashMap = new HashMap();
        Iterator<q00> it = list.iterator();
        while (it.hasNext()) {
            q00 next = it.next();
            if (next.mo24887l() == null) {
                it.remove();
            } else {
                Class<?> x = next.mo24896x();
                Boolean bool = (Boolean) hashMap.get(x);
                if (bool == null) {
                    bool = serializationConfig.getConfigOverride(x).getIsIgnoredType();
                    if (bool == null && (bool = annotationIntrospector.isIgnorableType(serializationConfig.introspectClassAnnotations(x).mo23462t())) == null) {
                        bool = Boolean.FALSE;
                    }
                    hashMap.put(x, bool);
                }
                if (bool.booleanValue()) {
                    it.remove();
                }
            }
        }
    }

    public List<BeanPropertyWriter> removeOverlappingTypeIds(zw5 zw5, n00 n00, r00 r00, List<BeanPropertyWriter> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            BeanPropertyWriter beanPropertyWriter = list.get(i);
            m17 typeSerializer = beanPropertyWriter.getTypeSerializer();
            if (typeSerializer != null && typeSerializer.mo11784c() == JsonTypeInfo.C1971As.EXTERNAL_PROPERTY) {
                PropertyName construct = PropertyName.construct(typeSerializer.mo16711b());
                Iterator<BeanPropertyWriter> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        BeanPropertyWriter next = it.next();
                        if (next != beanPropertyWriter && next.wouldConflictWithName(construct)) {
                            beanPropertyWriter.assignTypeSerializer((m17) null);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        return list;
    }

    public void removeSetterlessGetters(SerializationConfig serializationConfig, n00 n00, List<q00> list) {
        Iterator<q00> it = list.iterator();
        while (it.hasNext()) {
            q00 next = it.next();
            if (!next.mo24877a() && !next.mo24874E()) {
                it.remove();
            }
        }
    }

    public yw5 withConfig(SerializerFactoryConfig serializerFactoryConfig) {
        if (this._factoryConfig == serializerFactoryConfig) {
            return this;
        }
        if (getClass() == BeanSerializerFactory.class) {
            return new BeanSerializerFactory(serializerFactoryConfig);
        }
        throw new IllegalStateException("Subtype of BeanSerializerFactory (" + getClass().getName() + ") has not properly overridden method 'withAdditionalSerializers': cannot instantiate subtype with additional serializer definitions");
    }
}
