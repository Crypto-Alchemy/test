package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public abstract class ContainerDeserializerBase<T> extends StdDeserializer<T> {
    public final JavaType _containerType;
    public final bc4 _nullProvider;
    public final boolean _skipNullValues;
    public final Boolean _unwrapSingle;

    public ContainerDeserializerBase(JavaType javaType, bc4 bc4, Boolean bool) {
        super(javaType);
        this._containerType = javaType;
        this._unwrapSingle = bool;
        this._nullProvider = bc4;
        this._skipNullValues = NullsConstantProvider.isSkipper(bc4);
    }

    public SettableBeanProperty findBackReference(String str) {
        o43<Object> contentDeserializer = getContentDeserializer();
        if (contentDeserializer != null) {
            return contentDeserializer.findBackReference(str);
        }
        throw new IllegalArgumentException(String.format("Cannot handle managed/back reference '%s': type: container deserializer of type %s returned null for 'getContentDeserializer()'", new Object[]{str, getClass().getName()}));
    }

    public abstract o43<Object> getContentDeserializer();

    public JavaType getContentType() {
        JavaType javaType = this._containerType;
        if (javaType == null) {
            return TypeFactory.unknownType();
        }
        return javaType.getContentType();
    }

    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.DYNAMIC;
    }

    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        ValueInstantiator valueInstantiator = getValueInstantiator();
        if (valueInstantiator == null || !valueInstantiator.canCreateUsingDefault()) {
            JavaType valueType = getValueType();
            deserializationContext.reportBadDefinition(valueType, String.format("Cannot create empty instance of %s, no default Creator", new Object[]{valueType}));
        }
        try {
            return valueInstantiator.createUsingDefault(deserializationContext);
        } catch (IOException e) {
            return wf0.m29513g0(deserializationContext, e);
        }
    }

    public JavaType getValueType() {
        return this._containerType;
    }

    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    @Deprecated
    public <BOGUS> BOGUS wrapAndThrow(Throwable th, Object obj, String str) throws IOException {
        return wrapAndThrow((DeserializationContext) null, th, obj, str);
    }

    public <BOGUS> BOGUS wrapAndThrow(DeserializationContext deserializationContext, Throwable th, Object obj, String str) throws IOException {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        wf0.m29515h0(th);
        if (deserializationContext != null && !deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)) {
            wf0.m29519j0(th);
        }
        if (!(th instanceof IOException) || (th instanceof JsonMappingException)) {
            throw JsonMappingException.wrapWithPath(th, obj, (String) wf0.m29498Y(str, xg5.MISSING_REASON));
        }
        throw ((IOException) th);
    }

    public ContainerDeserializerBase(JavaType javaType) {
        this(javaType, (bc4) null, (Boolean) null);
    }

    public ContainerDeserializerBase(ContainerDeserializerBase<?> containerDeserializerBase) {
        this(containerDeserializerBase, containerDeserializerBase._nullProvider, containerDeserializerBase._unwrapSingle);
    }

    public ContainerDeserializerBase(ContainerDeserializerBase<?> containerDeserializerBase, bc4 bc4, Boolean bool) {
        super(containerDeserializerBase._containerType);
        this._containerType = containerDeserializerBase._containerType;
        this._nullProvider = bc4;
        this._unwrapSingle = bool;
        this._skipNullValues = NullsConstantProvider.isSkipper(bc4);
    }
}
