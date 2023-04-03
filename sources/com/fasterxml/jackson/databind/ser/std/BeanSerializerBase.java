package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.PropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class BeanSerializerBase extends StdSerializer<Object> implements ls0, ye5 {
    public static final PropertyName NAME_FOR_OBJECT_REF = new PropertyName("#object-ref");
    public static final BeanPropertyWriter[] NO_PROPS = new BeanPropertyWriter[0];
    public final C2613jm _anyGetterWriter;
    public final JavaType _beanType;
    public final BeanPropertyWriter[] _filteredProps;
    public final cf4 _objectIdWriter;
    public final Object _propertyFilterId;
    public final BeanPropertyWriter[] _props;
    public final JsonFormat.Shape _serializationShape;
    public final AnnotatedMember _typeId;

    /* renamed from: com.fasterxml.jackson.databind.ser.std.BeanSerializerBase$a */
    public static /* synthetic */ class C2047a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10115a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.fasterxml.jackson.annotation.JsonFormat$Shape[] r0 = com.fasterxml.jackson.annotation.JsonFormat.Shape.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10115a = r0
                com.fasterxml.jackson.annotation.JsonFormat$Shape r1 = com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10115a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.annotation.JsonFormat$Shape r1 = com.fasterxml.jackson.annotation.JsonFormat.Shape.NUMBER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10115a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.annotation.JsonFormat$Shape r1 = com.fasterxml.jackson.annotation.JsonFormat.Shape.NUMBER_INT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.C2047a.<clinit>():void");
        }
    }

    public BeanSerializerBase(JavaType javaType, r00 r00, BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        super(javaType);
        this._beanType = javaType;
        this._props = beanPropertyWriterArr;
        this._filteredProps = beanPropertyWriterArr2;
        if (r00 == null) {
            this._typeId = null;
            this._anyGetterWriter = null;
            this._propertyFilterId = null;
            this._objectIdWriter = null;
            this._serializationShape = null;
            return;
        }
        this._typeId = r00.mo25304h();
        this._anyGetterWriter = r00.mo25299c();
        this._propertyFilterId = r00.mo25301e();
        this._objectIdWriter = r00.mo25302f();
        this._serializationShape = r00.mo25300d().mo23449g((JsonFormat.Value) null).getShape();
    }

    /* renamed from: a */
    public static final BeanPropertyWriter[] m14305a(BeanPropertyWriter[] beanPropertyWriterArr, NameTransformer nameTransformer) {
        if (beanPropertyWriterArr == null || beanPropertyWriterArr.length == 0 || nameTransformer == null || nameTransformer == NameTransformer.NOP) {
            return beanPropertyWriterArr;
        }
        int length = beanPropertyWriterArr.length;
        BeanPropertyWriter[] beanPropertyWriterArr2 = new BeanPropertyWriter[length];
        for (int i = 0; i < length; i++) {
            BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i];
            if (beanPropertyWriter != null) {
                beanPropertyWriterArr2[i] = beanPropertyWriter.rename(nameTransformer);
            }
        }
        return beanPropertyWriterArr2;
    }

    @Deprecated
    public final String _customTypeId(Object obj) {
        Object value = this._typeId.getValue(obj);
        if (value == null) {
            return "";
        }
        if (value instanceof String) {
            return (String) value;
        }
        return value.toString();
    }

    public void _serializeObjectId(Object obj, JsonGenerator jsonGenerator, zw5 zw5, m17 m17, un7 un7) throws IOException {
        cf4 cf4 = this._objectIdWriter;
        WritableTypeId _typeIdDef = _typeIdDef(m17, obj, JsonToken.START_OBJECT);
        m17.mo16712g(jsonGenerator, _typeIdDef);
        jsonGenerator.mo13895s(obj);
        un7.mo26835b(jsonGenerator, zw5, cf4);
        if (this._propertyFilterId != null) {
            serializeFieldsFiltered(obj, jsonGenerator, zw5);
        } else {
            serializeFields(obj, jsonGenerator, zw5);
        }
        m17.mo16713h(jsonGenerator, _typeIdDef);
    }

    public final void _serializeWithObjectId(Object obj, JsonGenerator jsonGenerator, zw5 zw5, boolean z) throws IOException {
        cf4 cf4 = this._objectIdWriter;
        un7 findObjectId = zw5.findObjectId(obj, cf4.f8431c);
        if (!findObjectId.mo26836c(jsonGenerator, zw5, cf4)) {
            Object a = findObjectId.mo26834a(obj);
            if (cf4.f8433e) {
                cf4.f8432d.serialize(a, jsonGenerator, zw5);
                return;
            }
            if (z) {
                jsonGenerator.mo13854S0(obj);
            }
            findObjectId.mo26835b(jsonGenerator, zw5, cf4);
            if (this._propertyFilterId != null) {
                serializeFieldsFiltered(obj, jsonGenerator, zw5);
            } else {
                serializeFields(obj, jsonGenerator, zw5);
            }
            if (z) {
                jsonGenerator.mo13855W();
            }
        }
    }

    public final WritableTypeId _typeIdDef(m17 m17, Object obj, JsonToken jsonToken) {
        AnnotatedMember annotatedMember = this._typeId;
        if (annotatedMember == null) {
            return m17.mo23018d(obj, jsonToken);
        }
        Object value = annotatedMember.getValue(obj);
        if (value == null) {
            value = "";
        }
        return m17.mo23019e(obj, jsonToken, value);
    }

    public void acceptJsonFormatVisitor(t43 t43, JavaType javaType) throws JsonMappingException {
        j53 e;
        BeanPropertyWriter[] beanPropertyWriterArr;
        if (t43 != null && (e = t43.mo16635e(javaType)) != null) {
            zw5 b = t43.mo25637b();
            int i = 0;
            Class<?> cls = null;
            if (this._propertyFilterId != null) {
                hx4 findPropertyFilter = findPropertyFilter(t43.mo25637b(), this._propertyFilterId, (Object) null);
                int length = this._props.length;
                while (i < length) {
                    findPropertyFilter.mo21415b(this._props[i], e, b);
                    i++;
                }
                return;
            }
            if (!(this._filteredProps == null || b == null)) {
                cls = b.getActiveView();
            }
            if (cls != null) {
                beanPropertyWriterArr = this._filteredProps;
            } else {
                beanPropertyWriterArr = this._props;
            }
            int length2 = beanPropertyWriterArr.length;
            while (i < length2) {
                BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i];
                if (beanPropertyWriter != null) {
                    beanPropertyWriter.depositSchemaProperty(e, b);
                }
                i++;
            }
        }
    }

    public abstract BeanSerializerBase asArraySerializer();

    public y63<?> createContextual(zw5 zw5, BeanProperty beanProperty) throws JsonMappingException {
        AnnotatedMember annotatedMember;
        JsonFormat.Shape shape;
        Set<String> set;
        BeanPropertyWriter[] beanPropertyWriterArr;
        Set<String> set2;
        int i;
        Object obj;
        BeanSerializerBase beanSerializerBase;
        cf4 c;
        Object obj2;
        BeanPropertyWriter beanPropertyWriter;
        bf4 findObjectReferenceInfo;
        zw5 zw52 = zw5;
        BeanProperty beanProperty2 = beanProperty;
        AnnotationIntrospector annotationIntrospector = zw5.getAnnotationIntrospector();
        if (beanProperty2 == null || annotationIntrospector == null) {
            annotatedMember = null;
        } else {
            annotatedMember = beanProperty.getMember();
        }
        SerializationConfig config = zw5.getConfig();
        JsonFormat.Value findFormatOverrides = findFormatOverrides(zw52, beanProperty2, this._handledType);
        int i2 = 2;
        if (findFormatOverrides == null || !findFormatOverrides.hasShape()) {
            shape = null;
        } else {
            shape = findFormatOverrides.getShape();
            if (!(shape == JsonFormat.Shape.ANY || shape == this._serializationShape)) {
                if (this._beanType.isEnumType()) {
                    int i3 = C2047a.f10115a[shape.ordinal()];
                    if (i3 == 1 || i3 == 2 || i3 == 3) {
                        return zw52.handlePrimaryContextualization(EnumSerializer.construct(this._beanType.getRawClass(), zw5.getConfig(), config.introspectClassAnnotations(this._beanType), findFormatOverrides), beanProperty2);
                    }
                } else if (shape == JsonFormat.Shape.NATURAL && ((!this._beanType.isMapLikeType() || !Map.class.isAssignableFrom(this._handledType)) && Map.Entry.class.isAssignableFrom(this._handledType))) {
                    JavaType findSuperType = this._beanType.findSuperType(Map.Entry.class);
                    return zw52.handlePrimaryContextualization(new MapEntrySerializer(this._beanType, findSuperType.containedTypeOrUnknown(0), findSuperType.containedTypeOrUnknown(1), false, (m17) null, beanProperty), beanProperty2);
                }
            }
        }
        cf4 cf4 = this._objectIdWriter;
        if (annotatedMember != null) {
            set = annotationIntrospector.findPropertyIgnoralByName(config, annotatedMember).findIgnoredForSerialization();
            set2 = annotationIntrospector.findPropertyInclusionByName(config, annotatedMember).getIncluded();
            bf4 findObjectIdInfo = annotationIntrospector.findObjectIdInfo(annotatedMember);
            if (findObjectIdInfo == null) {
                if (!(cf4 == null || (findObjectReferenceInfo = annotationIntrospector.findObjectReferenceInfo(annotatedMember, (bf4) null)) == null)) {
                    cf4 = this._objectIdWriter.mo12049b(findObjectReferenceInfo.mo11627b());
                }
                beanPropertyWriterArr = null;
            } else {
                bf4 findObjectReferenceInfo2 = annotationIntrospector.findObjectReferenceInfo(annotatedMember, findObjectIdInfo);
                Class<? extends ObjectIdGenerator<?>> c2 = findObjectReferenceInfo2.mo11628c();
                JavaType javaType = zw5.getTypeFactory().findTypeParameters(zw52.constructType(c2), (Class<?>) ObjectIdGenerator.class)[0];
                if (c2 == ObjectIdGenerators$PropertyGenerator.class) {
                    String simpleName = findObjectReferenceInfo2.mo11629d().getSimpleName();
                    int length = this._props.length;
                    i = 0;
                    while (true) {
                        if (i == length) {
                            JavaType javaType2 = this._beanType;
                            Object[] objArr = new Object[i2];
                            objArr[0] = wf0.m29497X(handledType());
                            objArr[1] = wf0.m29495V(simpleName);
                            zw52.reportBadDefinition(javaType2, String.format("Invalid Object Id definition for %s: cannot find property with name %s", objArr));
                        }
                        beanPropertyWriter = this._props[i];
                        if (simpleName.equals(beanPropertyWriter.getName())) {
                            break;
                        }
                        i++;
                        i2 = 2;
                    }
                    beanPropertyWriterArr = null;
                    cf4 = cf4.m11853a(beanPropertyWriter.getType(), (PropertyName) null, new PropertyBasedObjectIdGenerator(findObjectReferenceInfo2, beanPropertyWriter), findObjectReferenceInfo2.mo11627b());
                    obj = annotationIntrospector.findFilterId(annotatedMember);
                    if (obj == null || ((obj2 = this._propertyFilterId) != null && obj.equals(obj2))) {
                        obj = beanPropertyWriterArr;
                    }
                } else {
                    beanPropertyWriterArr = null;
                    cf4 = cf4.m11853a(javaType, findObjectReferenceInfo2.mo11629d(), zw52.objectIdGeneratorInstance(annotatedMember, findObjectReferenceInfo2), findObjectReferenceInfo2.mo11627b());
                }
            }
            i = 0;
            obj = annotationIntrospector.findFilterId(annotatedMember);
            obj = beanPropertyWriterArr;
        } else {
            beanPropertyWriterArr = null;
            obj = null;
            set2 = null;
            set = null;
            i = 0;
        }
        if (i > 0) {
            BeanPropertyWriter[] beanPropertyWriterArr2 = this._props;
            BeanPropertyWriter[] beanPropertyWriterArr3 = (BeanPropertyWriter[]) Arrays.copyOf(beanPropertyWriterArr2, beanPropertyWriterArr2.length);
            BeanPropertyWriter beanPropertyWriter2 = beanPropertyWriterArr3[i];
            System.arraycopy(beanPropertyWriterArr3, 0, beanPropertyWriterArr3, 1, i);
            beanPropertyWriterArr3[0] = beanPropertyWriter2;
            BeanPropertyWriter[] beanPropertyWriterArr4 = this._filteredProps;
            if (beanPropertyWriterArr4 != null) {
                beanPropertyWriterArr = (BeanPropertyWriter[]) Arrays.copyOf(beanPropertyWriterArr4, beanPropertyWriterArr4.length);
                BeanPropertyWriter beanPropertyWriter3 = beanPropertyWriterArr[i];
                System.arraycopy(beanPropertyWriterArr, 0, beanPropertyWriterArr, 1, i);
                beanPropertyWriterArr[0] = beanPropertyWriter3;
            }
            beanSerializerBase = withProperties(beanPropertyWriterArr3, beanPropertyWriterArr);
        } else {
            beanSerializerBase = this;
        }
        if (!(cf4 == null || (c = cf4.mo12050c(zw52.findValueSerializer(cf4.f8429a, beanProperty2))) == this._objectIdWriter)) {
            beanSerializerBase = beanSerializerBase.withObjectIdWriter(c);
        }
        if ((set != null && !set.isEmpty()) || set2 != null) {
            beanSerializerBase = beanSerializerBase.withByNameInclusion(set, set2);
        }
        if (obj != null) {
            beanSerializerBase = beanSerializerBase.withFilterId(obj);
        }
        if (shape == null) {
            shape = this._serializationShape;
        }
        if (shape == JsonFormat.Shape.ARRAY) {
            return beanSerializerBase.asArraySerializer();
        }
        return beanSerializerBase;
    }

    public y63<Object> findConvertingSerializer(zw5 zw5, BeanPropertyWriter beanPropertyWriter) throws JsonMappingException {
        AnnotatedMember member;
        Object findSerializationConverter;
        AnnotationIntrospector annotationIntrospector = zw5.getAnnotationIntrospector();
        y63<Object> y63 = null;
        if (annotationIntrospector == null || (member = beanPropertyWriter.getMember()) == null || (findSerializationConverter = annotationIntrospector.findSerializationConverter(member)) == null) {
            return null;
        }
        ot0<Object, Object> converterInstance = zw5.converterInstance(beanPropertyWriter.getMember(), findSerializationConverter);
        JavaType c = converterInstance.mo23478c(zw5.getTypeFactory());
        if (!c.isJavaLangObject()) {
            y63 = zw5.findValueSerializer(c, (BeanProperty) beanPropertyWriter);
        }
        return new StdDelegatingSerializer(converterInstance, c, y63);
    }

    @Deprecated
    public g53 getSchema(zw5 zw5, Type type) throws JsonMappingException {
        String id;
        ObjectNode createSchemaNode = createSchemaNode("object", true);
        x63 x63 = (x63) this._handledType.getAnnotation(x63.class);
        if (!(x63 == null || (id = x63.mo27682id()) == null || id.isEmpty())) {
            createSchemaNode.put("id", id);
        }
        ObjectNode objectNode = createSchemaNode.objectNode();
        Object obj = this._propertyFilterId;
        hx4 hx4 = null;
        if (obj != null) {
            hx4 = findPropertyFilter(zw5, obj, (Object) null);
        }
        int i = 0;
        while (true) {
            BeanPropertyWriter[] beanPropertyWriterArr = this._props;
            if (i < beanPropertyWriterArr.length) {
                BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i];
                if (hx4 == null) {
                    beanPropertyWriter.depositSchemaProperty(objectNode, zw5);
                } else {
                    hx4.mo21416c(beanPropertyWriter, objectNode, zw5);
                }
                i++;
            } else {
                createSchemaNode.set("properties", objectNode);
                return createSchemaNode;
            }
        }
    }

    public Iterator<PropertyWriter> properties() {
        return Arrays.asList(this._props).iterator();
    }

    public void resolve(zw5 zw5) throws JsonMappingException {
        int i;
        BeanPropertyWriter beanPropertyWriter;
        m17 m17;
        y63<Object> findNullValueSerializer;
        BeanPropertyWriter beanPropertyWriter2;
        BeanPropertyWriter[] beanPropertyWriterArr = this._filteredProps;
        if (beanPropertyWriterArr == null) {
            i = 0;
        } else {
            i = beanPropertyWriterArr.length;
        }
        int length = this._props.length;
        for (int i2 = 0; i2 < length; i2++) {
            BeanPropertyWriter beanPropertyWriter3 = this._props[i2];
            if (!beanPropertyWriter3.willSuppressNulls() && !beanPropertyWriter3.hasNullSerializer() && (findNullValueSerializer = zw5.findNullValueSerializer(beanPropertyWriter3)) != null) {
                beanPropertyWriter3.assignNullSerializer(findNullValueSerializer);
                if (i2 < i && (beanPropertyWriter2 = this._filteredProps[i2]) != null) {
                    beanPropertyWriter2.assignNullSerializer(findNullValueSerializer);
                }
            }
            if (!beanPropertyWriter3.hasSerializer()) {
                y63<Object> findConvertingSerializer = findConvertingSerializer(zw5, beanPropertyWriter3);
                if (findConvertingSerializer == null) {
                    JavaType serializationType = beanPropertyWriter3.getSerializationType();
                    if (serializationType == null) {
                        serializationType = beanPropertyWriter3.getType();
                        if (!serializationType.isFinal()) {
                            if (serializationType.isContainerType() || serializationType.containedTypeCount() > 0) {
                                beanPropertyWriter3.setNonTrivialBaseType(serializationType);
                            }
                        }
                    }
                    y63<Object> findValueSerializer = zw5.findValueSerializer(serializationType, (BeanProperty) beanPropertyWriter3);
                    if (!serializationType.isContainerType() || (m17 = (m17) serializationType.getContentType().getTypeHandler()) == null || !(findValueSerializer instanceof ContainerSerializer)) {
                        findConvertingSerializer = findValueSerializer;
                    } else {
                        findConvertingSerializer = ((ContainerSerializer) findValueSerializer).withValueTypeSerializer(m17);
                    }
                }
                if (i2 >= i || (beanPropertyWriter = this._filteredProps[i2]) == null) {
                    beanPropertyWriter3.assignSerializer(findConvertingSerializer);
                } else {
                    beanPropertyWriter.assignSerializer(findConvertingSerializer);
                }
            }
        }
        C2613jm jmVar = this._anyGetterWriter;
        if (jmVar != null) {
            jmVar.mo21967d(zw5);
        }
    }

    public abstract void serialize(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws IOException;

    public void serializeFields(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        BeanPropertyWriter[] beanPropertyWriterArr;
        String str = "[anySetter]";
        if (this._filteredProps == null || zw5.getActiveView() == null) {
            beanPropertyWriterArr = this._props;
        } else {
            beanPropertyWriterArr = this._filteredProps;
        }
        try {
            for (BeanPropertyWriter beanPropertyWriter : beanPropertyWriterArr) {
                if (beanPropertyWriter != null) {
                    beanPropertyWriter.serializeAsField(obj, jsonGenerator, zw5);
                }
            }
            C2613jm jmVar = this._anyGetterWriter;
            if (jmVar != null) {
                jmVar.mo21966c(obj, jsonGenerator, zw5);
            }
        } catch (Exception e) {
            if (0 != beanPropertyWriterArr.length) {
                str = beanPropertyWriterArr[0].getName();
            }
            wrapAndThrow(zw5, (Throwable) e, obj, str);
        } catch (StackOverflowError e2) {
            JsonMappingException jsonMappingException = new JsonMappingException((Closeable) jsonGenerator, "Infinite recursion (StackOverflowError)", (Throwable) e2);
            if (0 != beanPropertyWriterArr.length) {
                str = beanPropertyWriterArr[0].getName();
            }
            jsonMappingException.prependPath(obj, str);
            throw jsonMappingException;
        }
    }

    public void serializeFieldsFiltered(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        BeanPropertyWriter[] beanPropertyWriterArr;
        String str = "[anySetter]";
        if (this._filteredProps == null || zw5.getActiveView() == null) {
            beanPropertyWriterArr = this._props;
        } else {
            beanPropertyWriterArr = this._filteredProps;
        }
        hx4 findPropertyFilter = findPropertyFilter(zw5, this._propertyFilterId, obj);
        if (findPropertyFilter == null) {
            serializeFields(obj, jsonGenerator, zw5);
            return;
        }
        try {
            for (BeanPropertyWriter beanPropertyWriter : beanPropertyWriterArr) {
                if (beanPropertyWriter != null) {
                    findPropertyFilter.mo21414a(obj, jsonGenerator, zw5, beanPropertyWriter);
                }
            }
            C2613jm jmVar = this._anyGetterWriter;
            if (jmVar != null) {
                jmVar.mo21965b(obj, jsonGenerator, zw5, findPropertyFilter);
            }
        } catch (Exception e) {
            if (0 != beanPropertyWriterArr.length) {
                str = beanPropertyWriterArr[0].getName();
            }
            wrapAndThrow(zw5, (Throwable) e, obj, str);
        } catch (StackOverflowError e2) {
            JsonMappingException jsonMappingException = new JsonMappingException((Closeable) jsonGenerator, "Infinite recursion (StackOverflowError)", (Throwable) e2);
            if (0 != beanPropertyWriterArr.length) {
                str = beanPropertyWriterArr[0].getName();
            }
            jsonMappingException.prependPath(obj, str);
            throw jsonMappingException;
        }
    }

    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, zw5 zw5, m17 m17) throws IOException {
        if (this._objectIdWriter != null) {
            _serializeWithObjectId(obj, jsonGenerator, zw5, m17);
            return;
        }
        WritableTypeId _typeIdDef = _typeIdDef(m17, obj, JsonToken.START_OBJECT);
        m17.mo16712g(jsonGenerator, _typeIdDef);
        jsonGenerator.mo13895s(obj);
        if (this._propertyFilterId != null) {
            serializeFieldsFiltered(obj, jsonGenerator, zw5);
        } else {
            serializeFields(obj, jsonGenerator, zw5);
        }
        m17.mo16713h(jsonGenerator, _typeIdDef);
    }

    public boolean usesObjectId() {
        if (this._objectIdWriter != null) {
            return true;
        }
        return false;
    }

    public abstract BeanSerializerBase withByNameInclusion(Set<String> set, Set<String> set2);

    public abstract BeanSerializerBase withFilterId(Object obj);

    @Deprecated
    public BeanSerializerBase withIgnorals(Set<String> set) {
        return withByNameInclusion(set, (Set<String>) null);
    }

    public abstract BeanSerializerBase withObjectIdWriter(cf4 cf4);

    public abstract BeanSerializerBase withProperties(BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2);

    @Deprecated
    public BeanSerializerBase withIgnorals(String[] strArr) {
        return withIgnorals((Set<String>) C2103cq.m14358a(strArr));
    }

    public final void _serializeWithObjectId(Object obj, JsonGenerator jsonGenerator, zw5 zw5, m17 m17) throws IOException {
        cf4 cf4 = this._objectIdWriter;
        un7 findObjectId = zw5.findObjectId(obj, cf4.f8431c);
        if (!findObjectId.mo26836c(jsonGenerator, zw5, cf4)) {
            Object a = findObjectId.mo26834a(obj);
            if (cf4.f8433e) {
                cf4.f8432d.serialize(a, jsonGenerator, zw5);
            } else {
                _serializeObjectId(obj, jsonGenerator, zw5, m17, findObjectId);
            }
        }
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        super(beanSerializerBase._handledType);
        this._beanType = beanSerializerBase._beanType;
        this._props = beanPropertyWriterArr;
        this._filteredProps = beanPropertyWriterArr2;
        this._typeId = beanSerializerBase._typeId;
        this._anyGetterWriter = beanSerializerBase._anyGetterWriter;
        this._objectIdWriter = beanSerializerBase._objectIdWriter;
        this._propertyFilterId = beanSerializerBase._propertyFilterId;
        this._serializationShape = beanSerializerBase._serializationShape;
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, cf4 cf4) {
        this(beanSerializerBase, cf4, beanSerializerBase._propertyFilterId);
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, cf4 cf4, Object obj) {
        super(beanSerializerBase._handledType);
        this._beanType = beanSerializerBase._beanType;
        this._props = beanSerializerBase._props;
        this._filteredProps = beanSerializerBase._filteredProps;
        this._typeId = beanSerializerBase._typeId;
        this._anyGetterWriter = beanSerializerBase._anyGetterWriter;
        this._objectIdWriter = cf4;
        this._propertyFilterId = obj;
        this._serializationShape = beanSerializerBase._serializationShape;
    }

    @Deprecated
    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, String[] strArr) {
        this(beanSerializerBase, (Set<String>) C2103cq.m14358a(strArr), (Set<String>) null);
    }

    @Deprecated
    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, Set<String> set) {
        this(beanSerializerBase, set, (Set<String>) null);
    }

    /* JADX WARNING: type inference failed for: r11v11, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BeanSerializerBase(com.fasterxml.jackson.databind.ser.std.BeanSerializerBase r10, java.util.Set<java.lang.String> r11, java.util.Set<java.lang.String> r12) {
        /*
            r9 = this;
            java.lang.Class<T> r0 = r10._handledType
            r9.<init>(r0)
            com.fasterxml.jackson.databind.JavaType r0 = r10._beanType
            r9._beanType = r0
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] r0 = r10._props
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] r1 = r10._filteredProps
            int r2 = r0.length
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            r4 = 0
            if (r1 != 0) goto L_0x0018
            r5 = r4
            goto L_0x001d
        L_0x0018:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r2)
        L_0x001d:
            r6 = 0
        L_0x001e:
            if (r6 >= r2) goto L_0x003a
            r7 = r0[r6]
            java.lang.String r8 = r7.getName()
            boolean r8 = com.fasterxml.jackson.databind.util.IgnorePropertiesUtil.m14343c(r8, r11, r12)
            if (r8 == 0) goto L_0x002d
            goto L_0x0037
        L_0x002d:
            r3.add(r7)
            if (r1 == 0) goto L_0x0037
            r7 = r1[r6]
            r5.add(r7)
        L_0x0037:
            int r6 = r6 + 1
            goto L_0x001e
        L_0x003a:
            int r11 = r3.size()
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] r11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[r11]
            java.lang.Object[] r11 = r3.toArray(r11)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] r11 = (com.fasterxml.jackson.databind.ser.BeanPropertyWriter[]) r11
            r9._props = r11
            if (r5 != 0) goto L_0x004b
            goto L_0x0058
        L_0x004b:
            int r11 = r5.size()
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] r11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[r11]
            java.lang.Object[] r11 = r5.toArray(r11)
            r4 = r11
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] r4 = (com.fasterxml.jackson.databind.ser.BeanPropertyWriter[]) r4
        L_0x0058:
            r9._filteredProps = r4
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r11 = r10._typeId
            r9._typeId = r11
            jm r11 = r10._anyGetterWriter
            r9._anyGetterWriter = r11
            cf4 r11 = r10._objectIdWriter
            r9._objectIdWriter = r11
            java.lang.Object r11 = r10._propertyFilterId
            r9._propertyFilterId = r11
            com.fasterxml.jackson.annotation.JsonFormat$Shape r10 = r10._serializationShape
            r9._serializationShape = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.<init>(com.fasterxml.jackson.databind.ser.std.BeanSerializerBase, java.util.Set, java.util.Set):void");
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase) {
        this(beanSerializerBase, beanSerializerBase._props, beanSerializerBase._filteredProps);
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, NameTransformer nameTransformer) {
        this(beanSerializerBase, m14305a(beanSerializerBase._props, nameTransformer), m14305a(beanSerializerBase._filteredProps, nameTransformer));
    }
}
