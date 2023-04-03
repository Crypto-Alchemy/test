package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.C1974a;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.C2001a;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;

public class AbstractDeserializer extends o43<Object> implements js0, Serializable {
    private static final long serialVersionUID = 1;
    public final boolean _acceptBoolean;
    public final boolean _acceptDouble;
    public final boolean _acceptInt;
    public final boolean _acceptString;
    public final Map<String, SettableBeanProperty> _backRefProperties;
    public final JavaType _baseType;
    public final ObjectIdReader _objectIdReader;
    public transient Map<String, SettableBeanProperty> _properties;

    public AbstractDeserializer(o00 o00, n00 n00, Map<String, SettableBeanProperty> map, Map<String, SettableBeanProperty> map2) {
        JavaType A = n00.mo23439A();
        this._baseType = A;
        this._objectIdReader = o00.mo23868t();
        this._backRefProperties = map;
        this._properties = map2;
        Class<?> rawClass = A.getRawClass();
        this._acceptString = rawClass.isAssignableFrom(String.class);
        boolean z = false;
        this._acceptBoolean = rawClass == Boolean.TYPE || rawClass.isAssignableFrom(Boolean.class);
        this._acceptInt = rawClass == Integer.TYPE || rawClass.isAssignableFrom(Integer.class);
        this._acceptDouble = (rawClass == Double.TYPE || rawClass.isAssignableFrom(Double.class)) ? true : z;
    }

    public static AbstractDeserializer constructForNonPOJO(n00 n00) {
        return new AbstractDeserializer(n00);
    }

    public Object _deserializeFromObjectId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object readObjectReference = this._objectIdReader.readObjectReference(jsonParser, deserializationContext);
        ObjectIdReader objectIdReader = this._objectIdReader;
        C2001a findObjectId = deserializationContext.findObjectId(readObjectReference, objectIdReader.generator, objectIdReader.resolver);
        Object f = findObjectId.mo15614f();
        if (f != null) {
            return f;
        }
        throw new UnresolvedForwardReference(jsonParser, "Could not resolve Object Id [" + readObjectReference + "] -- unresolved forward-reference?", jsonParser.mo13981q(), findObjectId);
    }

    public Object _deserializeIfNatural(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        switch (jsonParser.mo13967h()) {
            case 6:
                if (this._acceptString) {
                    return jsonParser.mo13947W();
                }
                return null;
            case 7:
                if (this._acceptInt) {
                    return Integer.valueOf(jsonParser.mo13933I());
                }
                return null;
            case 8:
                if (this._acceptDouble) {
                    return Double.valueOf(jsonParser.mo13990z());
                }
                return null;
            case 9:
                if (this._acceptBoolean) {
                    return Boolean.TRUE;
                }
                return null;
            case 10:
                if (this._acceptBoolean) {
                    return Boolean.FALSE;
                }
                return null;
            default:
                return null;
        }
    }

    public o43<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        AnnotatedMember member;
        bf4 findObjectIdInfo;
        SettableBeanProperty settableBeanProperty;
        JavaType javaType;
        ObjectIdGenerator objectIdGenerator;
        SettableBeanProperty settableBeanProperty2;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (beanProperty != null && annotationIntrospector != null && (member = beanProperty.getMember()) != null && (findObjectIdInfo = annotationIntrospector.findObjectIdInfo(member)) != null) {
            C1974a objectIdResolverInstance = deserializationContext.objectIdResolverInstance(member, findObjectIdInfo);
            bf4 findObjectReferenceInfo = annotationIntrospector.findObjectReferenceInfo(member, findObjectIdInfo);
            Class<? extends ObjectIdGenerator<?>> c = findObjectReferenceInfo.mo11628c();
            if (c == ObjectIdGenerators$PropertyGenerator.class) {
                PropertyName d = findObjectReferenceInfo.mo11629d();
                Map<String, SettableBeanProperty> map = this._properties;
                if (map == null) {
                    settableBeanProperty2 = null;
                } else {
                    settableBeanProperty2 = map.get(d.getSimpleName());
                }
                if (settableBeanProperty2 == null) {
                    deserializationContext.reportBadDefinition(this._baseType, String.format("Invalid Object Id definition for %s: cannot find property with name %s", new Object[]{wf0.m29497X(handledType()), wf0.m29494U(d)}));
                }
                JavaType type = settableBeanProperty2.getType();
                objectIdGenerator = new PropertyBasedObjectIdGenerator(findObjectReferenceInfo.mo11631f());
                javaType = type;
                settableBeanProperty = settableBeanProperty2;
            } else {
                objectIdResolverInstance = deserializationContext.objectIdResolverInstance(member, findObjectReferenceInfo);
                JavaType javaType2 = deserializationContext.getTypeFactory().findTypeParameters(deserializationContext.constructType(c), (Class<?>) ObjectIdGenerator.class)[0];
                objectIdGenerator = deserializationContext.objectIdGeneratorInstance(member, findObjectReferenceInfo);
                settableBeanProperty = null;
                javaType = javaType2;
            }
            return new AbstractDeserializer(this, ObjectIdReader.construct(javaType, findObjectReferenceInfo.mo11629d(), objectIdGenerator, deserializationContext.findRootValueDeserializer(javaType), settableBeanProperty, objectIdResolverInstance), (Map<String, SettableBeanProperty>) null);
        } else if (this._properties == null) {
            return this;
        } else {
            return new AbstractDeserializer(this, this._objectIdReader, (Map<String, SettableBeanProperty>) null);
        }
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return deserializationContext.handleMissingInstantiator(this._baseType.getRawClass(), new ValueInstantiator.Base(this._baseType), jsonParser, "abstract types either need to be mapped to concrete types, have custom deserializer, or contain additional type information", new Object[0]);
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, j07 j07) throws IOException {
        JsonToken g;
        if (!(this._objectIdReader == null || (g = jsonParser.mo13965g()) == null)) {
            if (g.isScalarValue()) {
                return _deserializeFromObjectId(jsonParser, deserializationContext);
            }
            if (g == JsonToken.START_OBJECT) {
                g = jsonParser.mo13938N0();
            }
            if (g == JsonToken.FIELD_NAME && this._objectIdReader.maySerializeAsObject() && this._objectIdReader.isValidReferencePropertyName(jsonParser.mo13964f(), jsonParser)) {
                return _deserializeFromObjectId(jsonParser, deserializationContext);
            }
        }
        Object _deserializeIfNatural = _deserializeIfNatural(jsonParser, deserializationContext);
        if (_deserializeIfNatural != null) {
            return _deserializeIfNatural;
        }
        return j07.deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    public SettableBeanProperty findBackReference(String str) {
        Map<String, SettableBeanProperty> map = this._backRefProperties;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public ObjectIdReader getObjectIdReader() {
        return this._objectIdReader;
    }

    public Class<?> handledType() {
        return this._baseType.getRawClass();
    }

    public boolean isCachable() {
        return true;
    }

    public LogicalType logicalType() {
        return LogicalType.POJO;
    }

    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return null;
    }

    @Deprecated
    public AbstractDeserializer(o00 o00, n00 n00, Map<String, SettableBeanProperty> map) {
        this(o00, n00, map, (Map<String, SettableBeanProperty>) null);
    }

    public AbstractDeserializer(n00 n00) {
        JavaType A = n00.mo23439A();
        this._baseType = A;
        this._objectIdReader = null;
        this._backRefProperties = null;
        Class<?> rawClass = A.getRawClass();
        this._acceptString = rawClass.isAssignableFrom(String.class);
        boolean z = false;
        this._acceptBoolean = rawClass == Boolean.TYPE || rawClass.isAssignableFrom(Boolean.class);
        this._acceptInt = rawClass == Integer.TYPE || rawClass.isAssignableFrom(Integer.class);
        this._acceptDouble = (rawClass == Double.TYPE || rawClass.isAssignableFrom(Double.class)) ? true : z;
    }

    public AbstractDeserializer(AbstractDeserializer abstractDeserializer, ObjectIdReader objectIdReader, Map<String, SettableBeanProperty> map) {
        this._baseType = abstractDeserializer._baseType;
        this._backRefProperties = abstractDeserializer._backRefProperties;
        this._acceptString = abstractDeserializer._acceptString;
        this._acceptBoolean = abstractDeserializer._acceptBoolean;
        this._acceptInt = abstractDeserializer._acceptInt;
        this._acceptDouble = abstractDeserializer._acceptDouble;
        this._objectIdReader = objectIdReader;
        this._properties = map;
    }
}
