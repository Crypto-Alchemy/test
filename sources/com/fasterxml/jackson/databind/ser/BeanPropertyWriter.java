package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.p009io.SerializedString;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.impl.C2040a;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.HashMap;

@zz2
public class BeanPropertyWriter extends PropertyWriter {
    public static final Object MARKER_FOR_EMPTY = JsonInclude.Include.NON_EMPTY;
    private static final long serialVersionUID = 1;
    public transient Method _accessorMethod;
    public final JavaType _cfgSerializationType;
    public final transient C2236em _contextAnnotations;
    public final JavaType _declaredType;
    public transient C2040a _dynamicSerializers;
    public transient Field _field;
    public final Class<?>[] _includeInViews;
    public transient HashMap<Object, Object> _internalSettings;
    public final AnnotatedMember _member;
    public final SerializedString _name;
    public JavaType _nonTrivialBaseType;
    public y63<Object> _nullSerializer;
    public y63<Object> _serializer;
    public final boolean _suppressNulls;
    public final Object _suppressableValue;
    public m17 _typeSerializer;
    public final PropertyName _wrapperName;

    public BeanPropertyWriter(q00 q00, AnnotatedMember annotatedMember, C2236em emVar, JavaType javaType, y63<?> y63, m17 m17, JavaType javaType2, boolean z, Object obj, Class<?>[] clsArr) {
        super(q00);
        this._member = annotatedMember;
        this._contextAnnotations = emVar;
        this._name = new SerializedString(q00.getName());
        this._wrapperName = q00.getWrapperName();
        this._declaredType = javaType;
        this._serializer = y63;
        this._dynamicSerializers = y63 == null ? C2040a.m14286c() : null;
        this._typeSerializer = m17;
        this._cfgSerializationType = javaType2;
        if (annotatedMember instanceof AnnotatedField) {
            this._accessorMethod = null;
            this._field = (Field) annotatedMember.getMember();
        } else if (annotatedMember instanceof AnnotatedMethod) {
            this._accessorMethod = (Method) annotatedMember.getMember();
            this._field = null;
        } else {
            this._accessorMethod = null;
            this._field = null;
        }
        this._suppressNulls = z;
        this._suppressableValue = obj;
        this._nullSerializer = null;
        this._includeInViews = clsArr;
    }

    public void _depositSchemaProperty(ObjectNode objectNode, g53 g53) {
        objectNode.set(getName(), g53);
    }

    public y63<Object> _findAndAddDynamic(C2040a aVar, Class<?> cls, zw5 zw5) throws JsonMappingException {
        C2040a.C2044d dVar;
        JavaType javaType = this._nonTrivialBaseType;
        if (javaType != null) {
            dVar = aVar.mo16640f(zw5.constructSpecializedType(javaType, cls), zw5, this);
        } else {
            dVar = aVar.mo16641g(cls, zw5, this);
        }
        C2040a aVar2 = dVar.f10110b;
        if (aVar != aVar2) {
            this._dynamicSerializers = aVar2;
        }
        return dVar.f10109a;
    }

    public boolean _handleSelfReference(Object obj, JsonGenerator jsonGenerator, zw5 zw5, y63<?> y63) throws IOException {
        if (y63.usesObjectId()) {
            return false;
        }
        if (zw5.isEnabled(SerializationFeature.FAIL_ON_SELF_REFERENCES)) {
            if (!(y63 instanceof BeanSerializerBase)) {
                return false;
            }
            zw5.reportBadDefinition(getType(), "Direct self-reference leading to cycle");
            return false;
        } else if (!zw5.isEnabled(SerializationFeature.WRITE_SELF_REFERENCES_AS_NULL)) {
            return false;
        } else {
            if (this._nullSerializer == null) {
                return true;
            }
            if (!jsonGenerator.mo13885k().mo28327f()) {
                jsonGenerator.mo13858Y(this._name);
            }
            this._nullSerializer.serialize(null, jsonGenerator, zw5);
            return true;
        }
    }

    public BeanPropertyWriter _new(PropertyName propertyName) {
        return new BeanPropertyWriter(this, propertyName);
    }

    public void assignNullSerializer(y63<Object> y63) {
        y63<Object> y632 = this._nullSerializer;
        if (y632 == null || y632 == y63) {
            this._nullSerializer = y63;
        } else {
            throw new IllegalStateException(String.format("Cannot override _nullSerializer: had a %s, trying to set to %s", new Object[]{wf0.m29514h(this._nullSerializer), wf0.m29514h(y63)}));
        }
    }

    public void assignSerializer(y63<Object> y63) {
        y63<Object> y632 = this._serializer;
        if (y632 == null || y632 == y63) {
            this._serializer = y63;
        } else {
            throw new IllegalStateException(String.format("Cannot override _serializer: had a %s, trying to set to %s", new Object[]{wf0.m29514h(this._serializer), wf0.m29514h(y63)}));
        }
    }

    public void assignTypeSerializer(m17 m17) {
        this._typeSerializer = m17;
    }

    public void depositSchemaProperty(j53 j53, zw5 zw5) throws JsonMappingException {
        if (j53 == null) {
            return;
        }
        if (isRequired()) {
            j53.mo21725q(this);
        } else {
            j53.mo21724l(this);
        }
    }

    public void fixAccess(SerializationConfig serializationConfig) {
        this._member.fixAccess(serializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    public final Object get(Object obj) throws Exception {
        Method method = this._accessorMethod;
        if (method == null) {
            return this._field.get(obj);
        }
        return method.invoke(obj, (Object[]) null);
    }

    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        AnnotatedMember annotatedMember = this._member;
        if (annotatedMember == null) {
            return null;
        }
        return annotatedMember.getAnnotation(cls);
    }

    public <A extends Annotation> A getContextAnnotation(Class<A> cls) {
        C2236em emVar = this._contextAnnotations;
        if (emVar == null) {
            return null;
        }
        return emVar.get(cls);
    }

    public PropertyName getFullName() {
        return new PropertyName(this._name.getValue());
    }

    @Deprecated
    public Type getGenericPropertyType() {
        Method method = this._accessorMethod;
        if (method != null) {
            return method.getGenericReturnType();
        }
        Field field = this._field;
        if (field != null) {
            return field.getGenericType();
        }
        return null;
    }

    public Object getInternalSetting(Object obj) {
        HashMap<Object, Object> hashMap = this._internalSettings;
        if (hashMap == null) {
            return null;
        }
        return hashMap.get(obj);
    }

    public AnnotatedMember getMember() {
        return this._member;
    }

    public String getName() {
        return this._name.getValue();
    }

    @Deprecated
    public Class<?> getPropertyType() {
        Method method = this._accessorMethod;
        if (method != null) {
            return method.getReturnType();
        }
        Field field = this._field;
        if (field != null) {
            return field.getType();
        }
        return null;
    }

    @Deprecated
    public Class<?> getRawSerializationType() {
        JavaType javaType = this._cfgSerializationType;
        if (javaType == null) {
            return null;
        }
        return javaType.getRawClass();
    }

    public JavaType getSerializationType() {
        return this._cfgSerializationType;
    }

    public qw5 getSerializedName() {
        return this._name;
    }

    public y63<Object> getSerializer() {
        return this._serializer;
    }

    public JavaType getType() {
        return this._declaredType;
    }

    public m17 getTypeSerializer() {
        return this._typeSerializer;
    }

    public Class<?>[] getViews() {
        return this._includeInViews;
    }

    public PropertyName getWrapperName() {
        return this._wrapperName;
    }

    public boolean hasNullSerializer() {
        if (this._nullSerializer != null) {
            return true;
        }
        return false;
    }

    public boolean hasSerializer() {
        if (this._serializer != null) {
            return true;
        }
        return false;
    }

    public boolean isUnwrapping() {
        return false;
    }

    public Object readResolve() {
        AnnotatedMember annotatedMember = this._member;
        if (annotatedMember instanceof AnnotatedField) {
            this._accessorMethod = null;
            this._field = (Field) annotatedMember.getMember();
        } else if (annotatedMember instanceof AnnotatedMethod) {
            this._accessorMethod = (Method) annotatedMember.getMember();
            this._field = null;
        }
        if (this._serializer == null) {
            this._dynamicSerializers = C2040a.m14286c();
        }
        return this;
    }

    public Object removeInternalSetting(Object obj) {
        HashMap<Object, Object> hashMap = this._internalSettings;
        if (hashMap == null) {
            return null;
        }
        Object remove = hashMap.remove(obj);
        if (this._internalSettings.size() == 0) {
            this._internalSettings = null;
        }
        return remove;
    }

    public BeanPropertyWriter rename(NameTransformer nameTransformer) {
        String transform = nameTransformer.transform(this._name.getValue());
        if (transform.equals(this._name.toString())) {
            return this;
        }
        return _new(PropertyName.construct(transform));
    }

    public void serializeAsElement(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws Exception {
        Object obj2;
        Method method = this._accessorMethod;
        if (method == null) {
            obj2 = this._field.get(obj);
        } else {
            obj2 = method.invoke(obj, (Object[]) null);
        }
        if (obj2 == null) {
            y63<Object> y63 = this._nullSerializer;
            if (y63 != null) {
                y63.serialize(null, jsonGenerator, zw5);
            } else {
                jsonGenerator.mo13866c0();
            }
        } else {
            y63<Object> y632 = this._serializer;
            if (y632 == null) {
                Class<?> cls = obj2.getClass();
                C2040a aVar = this._dynamicSerializers;
                y63<Object> k = aVar.mo16645k(cls);
                if (k == null) {
                    y632 = _findAndAddDynamic(aVar, cls, zw5);
                } else {
                    y632 = k;
                }
            }
            Object obj3 = this._suppressableValue;
            if (obj3 != null) {
                if (MARKER_FOR_EMPTY == obj3) {
                    if (y632.isEmpty(zw5, obj2)) {
                        serializeAsPlaceholder(obj, jsonGenerator, zw5);
                        return;
                    }
                } else if (obj3.equals(obj2)) {
                    serializeAsPlaceholder(obj, jsonGenerator, zw5);
                    return;
                }
            }
            if (obj2 != obj || !_handleSelfReference(obj, jsonGenerator, zw5, y632)) {
                m17 m17 = this._typeSerializer;
                if (m17 == null) {
                    y632.serialize(obj2, jsonGenerator, zw5);
                } else {
                    y632.serializeWithType(obj2, jsonGenerator, zw5, m17);
                }
            }
        }
    }

    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws Exception {
        Object obj2;
        Method method = this._accessorMethod;
        if (method == null) {
            obj2 = this._field.get(obj);
        } else {
            obj2 = method.invoke(obj, (Object[]) null);
        }
        if (obj2 != null) {
            y63<Object> y63 = this._serializer;
            if (y63 == null) {
                Class<?> cls = obj2.getClass();
                C2040a aVar = this._dynamicSerializers;
                y63<Object> k = aVar.mo16645k(cls);
                if (k == null) {
                    y63 = _findAndAddDynamic(aVar, cls, zw5);
                } else {
                    y63 = k;
                }
            }
            Object obj3 = this._suppressableValue;
            if (obj3 != null) {
                if (MARKER_FOR_EMPTY == obj3) {
                    if (y63.isEmpty(zw5, obj2)) {
                        return;
                    }
                } else if (obj3.equals(obj2)) {
                    return;
                }
            }
            if (obj2 != obj || !_handleSelfReference(obj, jsonGenerator, zw5, y63)) {
                jsonGenerator.mo13858Y(this._name);
                m17 m17 = this._typeSerializer;
                if (m17 == null) {
                    y63.serialize(obj2, jsonGenerator, zw5);
                } else {
                    y63.serializeWithType(obj2, jsonGenerator, zw5, m17);
                }
            }
        } else if (this._nullSerializer != null) {
            jsonGenerator.mo13858Y(this._name);
            this._nullSerializer.serialize(null, jsonGenerator, zw5);
        }
    }

    public void serializeAsOmittedField(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws Exception {
        if (!jsonGenerator.mo13871e()) {
            jsonGenerator.mo13900x0(this._name.getValue());
        }
    }

    public void serializeAsPlaceholder(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws Exception {
        y63<Object> y63 = this._nullSerializer;
        if (y63 != null) {
            y63.serialize(null, jsonGenerator, zw5);
        } else {
            jsonGenerator.mo13866c0();
        }
    }

    public Object setInternalSetting(Object obj, Object obj2) {
        if (this._internalSettings == null) {
            this._internalSettings = new HashMap<>();
        }
        return this._internalSettings.put(obj, obj2);
    }

    public void setNonTrivialBaseType(JavaType javaType) {
        this._nonTrivialBaseType = javaType;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("property '");
        sb.append(getName());
        sb.append("' (");
        if (this._accessorMethod != null) {
            sb.append("via method ");
            sb.append(this._accessorMethod.getDeclaringClass().getName());
            sb.append("#");
            sb.append(this._accessorMethod.getName());
        } else if (this._field != null) {
            sb.append("field \"");
            sb.append(this._field.getDeclaringClass().getName());
            sb.append("#");
            sb.append(this._field.getName());
        } else {
            sb.append("virtual");
        }
        if (this._serializer == null) {
            sb.append(", no static serializer");
        } else {
            sb.append(", static serializer of type " + this._serializer.getClass().getName());
        }
        sb.append(')');
        return sb.toString();
    }

    public BeanPropertyWriter unwrappingWriter(NameTransformer nameTransformer) {
        return new UnwrappingBeanPropertyWriter(this, nameTransformer);
    }

    public boolean willSuppressNulls() {
        return this._suppressNulls;
    }

    public boolean wouldConflictWithName(PropertyName propertyName) {
        PropertyName propertyName2 = this._wrapperName;
        if (propertyName2 != null) {
            return propertyName2.equals(propertyName);
        }
        if (!propertyName.hasSimpleName(this._name.getValue()) || propertyName.hasNamespace()) {
            return false;
        }
        return true;
    }

    @Deprecated
    public void depositSchemaProperty(ObjectNode objectNode, zw5 zw5) throws JsonMappingException {
        g53 g53;
        JavaType serializationType = getSerializationType();
        Type type = serializationType == null ? getType() : serializationType.getRawClass();
        y63<Object> serializer = getSerializer();
        if (serializer == null) {
            serializer = zw5.findValueSerializer(getType(), (BeanProperty) this);
        }
        boolean z = !isRequired();
        if (serializer instanceof ym5) {
            g53 = ((ym5) serializer).getSchema(zw5, type, z);
        } else {
            g53 = u63.m28093a();
        }
        _depositSchemaProperty(objectNode, g53);
    }

    @Deprecated
    public BeanPropertyWriter(q00 q00, AnnotatedMember annotatedMember, C2236em emVar, JavaType javaType, y63<?> y63, m17 m17, JavaType javaType2, boolean z, Object obj) {
        this(q00, annotatedMember, emVar, javaType, y63, m17, javaType2, z, obj, (Class<?>[]) null);
    }

    public BeanPropertyWriter() {
        super(PropertyMetadata.STD_REQUIRED_OR_OPTIONAL);
        this._member = null;
        this._contextAnnotations = null;
        this._name = null;
        this._wrapperName = null;
        this._includeInViews = null;
        this._declaredType = null;
        this._serializer = null;
        this._dynamicSerializers = null;
        this._typeSerializer = null;
        this._cfgSerializationType = null;
        this._accessorMethod = null;
        this._field = null;
        this._suppressNulls = false;
        this._suppressableValue = null;
        this._nullSerializer = null;
    }

    public BeanPropertyWriter(BeanPropertyWriter beanPropertyWriter) {
        this(beanPropertyWriter, beanPropertyWriter._name);
    }

    public BeanPropertyWriter(BeanPropertyWriter beanPropertyWriter, PropertyName propertyName) {
        super((PropertyWriter) beanPropertyWriter);
        this._name = new SerializedString(propertyName.getSimpleName());
        this._wrapperName = beanPropertyWriter._wrapperName;
        this._contextAnnotations = beanPropertyWriter._contextAnnotations;
        this._declaredType = beanPropertyWriter._declaredType;
        this._member = beanPropertyWriter._member;
        this._accessorMethod = beanPropertyWriter._accessorMethod;
        this._field = beanPropertyWriter._field;
        this._serializer = beanPropertyWriter._serializer;
        this._nullSerializer = beanPropertyWriter._nullSerializer;
        if (beanPropertyWriter._internalSettings != null) {
            this._internalSettings = new HashMap<>(beanPropertyWriter._internalSettings);
        }
        this._cfgSerializationType = beanPropertyWriter._cfgSerializationType;
        this._dynamicSerializers = beanPropertyWriter._dynamicSerializers;
        this._suppressNulls = beanPropertyWriter._suppressNulls;
        this._suppressableValue = beanPropertyWriter._suppressableValue;
        this._includeInViews = beanPropertyWriter._includeInViews;
        this._typeSerializer = beanPropertyWriter._typeSerializer;
        this._nonTrivialBaseType = beanPropertyWriter._nonTrivialBaseType;
    }

    public BeanPropertyWriter(BeanPropertyWriter beanPropertyWriter, SerializedString serializedString) {
        super((PropertyWriter) beanPropertyWriter);
        this._name = serializedString;
        this._wrapperName = beanPropertyWriter._wrapperName;
        this._member = beanPropertyWriter._member;
        this._contextAnnotations = beanPropertyWriter._contextAnnotations;
        this._declaredType = beanPropertyWriter._declaredType;
        this._accessorMethod = beanPropertyWriter._accessorMethod;
        this._field = beanPropertyWriter._field;
        this._serializer = beanPropertyWriter._serializer;
        this._nullSerializer = beanPropertyWriter._nullSerializer;
        if (beanPropertyWriter._internalSettings != null) {
            this._internalSettings = new HashMap<>(beanPropertyWriter._internalSettings);
        }
        this._cfgSerializationType = beanPropertyWriter._cfgSerializationType;
        this._dynamicSerializers = beanPropertyWriter._dynamicSerializers;
        this._suppressNulls = beanPropertyWriter._suppressNulls;
        this._suppressableValue = beanPropertyWriter._suppressableValue;
        this._includeInViews = beanPropertyWriter._includeInViews;
        this._typeSerializer = beanPropertyWriter._typeSerializer;
        this._nonTrivialBaseType = beanPropertyWriter._nonTrivialBaseType;
    }
}
