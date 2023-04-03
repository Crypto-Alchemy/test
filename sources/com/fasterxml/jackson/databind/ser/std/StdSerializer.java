package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Map;
import org.web3j.abi.datatypes.Utf8String;

public abstract class StdSerializer<T> extends y63<T> implements ym5, Serializable {

    /* renamed from: a */
    public static final Object f10132a = new Object();
    private static final long serialVersionUID = 1;
    public final Class<T> _handledType;

    public StdSerializer(Class<T> cls) {
        this._handledType = cls;
    }

    public static final boolean _neitherNull(Object obj, Object obj2) {
        return (obj == null || obj2 == null) ? false : true;
    }

    public static final boolean _nonEmpty(Collection<?> collection) {
        if (collection == null || collection.isEmpty()) {
            return false;
        }
        return true;
    }

    public void acceptJsonFormatVisitor(t43 t43, JavaType javaType) throws JsonMappingException {
        t43.mo26057j(javaType);
    }

    public ObjectNode createSchemaNode(String str) {
        ObjectNode objectNode = JsonNodeFactory.instance.objectNode();
        objectNode.put("type", str);
        return objectNode;
    }

    public y63<?> findAnnotatedContentSerializer(zw5 zw5, BeanProperty beanProperty) throws JsonMappingException {
        Object findContentSerializer;
        if (beanProperty == null) {
            return null;
        }
        AnnotatedMember member = beanProperty.getMember();
        AnnotationIntrospector annotationIntrospector = zw5.getAnnotationIntrospector();
        if (member == null || (findContentSerializer = annotationIntrospector.findContentSerializer(member)) == null) {
            return null;
        }
        return zw5.serializerInstance(member, findContentSerializer);
    }

    public y63<?> findContextualConvertingSerializer(zw5 zw5, BeanProperty beanProperty, y63<?> y63) throws JsonMappingException {
        Object obj = f10132a;
        Map map = (Map) zw5.getAttribute(obj);
        if (map == null) {
            map = new IdentityHashMap();
            zw5.setAttribute(obj, (Object) map);
        } else if (map.get(beanProperty) != null) {
            return y63;
        }
        map.put(beanProperty, Boolean.TRUE);
        try {
            y63<?> findConvertingContentSerializer = findConvertingContentSerializer(zw5, beanProperty, y63);
            if (findConvertingContentSerializer != null) {
                return zw5.handleSecondaryContextualization(findConvertingContentSerializer, beanProperty);
            }
            map.remove(beanProperty);
            return y63;
        } finally {
            map.remove(beanProperty);
        }
    }

    @Deprecated
    public y63<?> findConvertingContentSerializer(zw5 zw5, BeanProperty beanProperty, y63<?> y63) throws JsonMappingException {
        AnnotatedMember member;
        Object findSerializationContentConverter;
        AnnotationIntrospector annotationIntrospector = zw5.getAnnotationIntrospector();
        if (!_neitherNull(annotationIntrospector, beanProperty) || (member = beanProperty.getMember()) == null || (findSerializationContentConverter = annotationIntrospector.findSerializationContentConverter(member)) == null) {
            return y63;
        }
        ot0<Object, Object> converterInstance = zw5.converterInstance(beanProperty.getMember(), findSerializationContentConverter);
        JavaType c = converterInstance.mo23478c(zw5.getTypeFactory());
        y63<Object> y632 = y63;
        if (y63 == null) {
            y632 = y63;
            if (!c.isJavaLangObject()) {
                y632 = zw5.findValueSerializer(c);
            }
        }
        return new StdDelegatingSerializer(converterInstance, c, y632);
    }

    public Boolean findFormatFeature(zw5 zw5, BeanProperty beanProperty, Class<?> cls, JsonFormat.Feature feature) {
        JsonFormat.Value findFormatOverrides = findFormatOverrides(zw5, beanProperty, cls);
        if (findFormatOverrides != null) {
            return findFormatOverrides.getFeature(feature);
        }
        return null;
    }

    public JsonFormat.Value findFormatOverrides(zw5 zw5, BeanProperty beanProperty, Class<?> cls) {
        if (beanProperty != null) {
            return beanProperty.findPropertyFormat(zw5.getConfig(), cls);
        }
        return zw5.getDefaultPropertyFormat(cls);
    }

    public JsonInclude.Value findIncludeOverrides(zw5 zw5, BeanProperty beanProperty, Class<?> cls) {
        if (beanProperty != null) {
            return beanProperty.findPropertyInclusion(zw5.getConfig(), cls);
        }
        return zw5.getDefaultPropertyInclusion(cls);
    }

    public hx4 findPropertyFilter(zw5 zw5, Object obj, Object obj2) throws JsonMappingException {
        zw5.getFilterProvider();
        Class handledType = handledType();
        return (hx4) zw5.reportBadDefinition((Class<?>) handledType, "Cannot resolve PropertyFilter with id '" + obj + "'; no FilterProvider configured");
    }

    public g53 getSchema(zw5 zw5, Type type) throws JsonMappingException {
        return createSchemaNode(Utf8String.TYPE_NAME);
    }

    public Class<T> handledType() {
        return this._handledType;
    }

    public boolean isDefaultSerializer(y63<?> y63) {
        return wf0.m29488O(y63);
    }

    public abstract void serialize(T t, JsonGenerator jsonGenerator, zw5 zw5) throws IOException;

    public void visitArrayFormat(t43 t43, JavaType javaType, y63<?> y63, JavaType javaType2) throws JsonMappingException {
        e43 m = t43.mo26059m(javaType);
        if (_neitherNull(m, y63)) {
            m.mo19120f(y63, javaType2);
        }
    }

    public void visitFloatFormat(t43 t43, JavaType javaType, JsonParser.NumberType numberType) throws JsonMappingException {
        i53 k = t43.mo26058k(javaType);
        if (k != null) {
            k.mo21467a(numberType);
        }
    }

    public void visitIntFormat(t43 t43, JavaType javaType, JsonParser.NumberType numberType) throws JsonMappingException {
        a53 c = t43.mo26054c(javaType);
        if (_neitherNull(c, numberType)) {
            c.mo36a(numberType);
        }
    }

    public void visitStringFormat(t43 t43, JavaType javaType) throws JsonMappingException {
        t43.mo26056i(javaType);
    }

    public void wrapAndThrow(zw5 zw5, Throwable th, Object obj, String str) throws IOException {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        wf0.m29515h0(th);
        boolean z = zw5 == null || zw5.isEnabled(SerializationFeature.WRAP_EXCEPTIONS);
        if (th instanceof IOException) {
            if (!z || !(th instanceof JacksonException)) {
                throw ((IOException) th);
            }
        } else if (!z) {
            wf0.m29519j0(th);
        }
        throw JsonMappingException.wrapWithPath(th, obj, str);
    }

    public g53 getSchema(zw5 zw5, Type type, boolean z) throws JsonMappingException {
        ObjectNode objectNode = (ObjectNode) getSchema(zw5, type);
        if (!z) {
            objectNode.put("required", !z);
        }
        return objectNode;
    }

    public void visitStringFormat(t43 t43, JavaType javaType, JsonValueFormat jsonValueFormat) throws JsonMappingException {
        b73 i = t43.mo26056i(javaType);
        if (i != null) {
            i.mo22678c(jsonValueFormat);
        }
    }

    public StdSerializer(JavaType javaType) {
        this._handledType = javaType.getRawClass();
    }

    public ObjectNode createSchemaNode(String str, boolean z) {
        ObjectNode createSchemaNode = createSchemaNode(str);
        if (!z) {
            createSchemaNode.put("required", !z);
        }
        return createSchemaNode;
    }

    public void visitArrayFormat(t43 t43, JavaType javaType, JsonFormatTypes jsonFormatTypes) throws JsonMappingException {
        e43 m = t43.mo26059m(javaType);
        if (m != null) {
            m.mo19119d(jsonFormatTypes);
        }
    }

    public void visitIntFormat(t43 t43, JavaType javaType, JsonParser.NumberType numberType, JsonValueFormat jsonValueFormat) throws JsonMappingException {
        a53 c = t43.mo26054c(javaType);
        if (c != null) {
            if (numberType != null) {
                c.mo36a(numberType);
            }
            if (jsonValueFormat != null) {
                c.mo22678c(jsonValueFormat);
            }
        }
    }

    public StdSerializer(Class<?> cls, boolean z) {
        this._handledType = cls;
    }

    public StdSerializer(StdSerializer<?> stdSerializer) {
        this._handledType = stdSerializer._handledType;
    }

    public void wrapAndThrow(zw5 zw5, Throwable th, Object obj, int i) throws IOException {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        wf0.m29515h0(th);
        boolean z = zw5 == null || zw5.isEnabled(SerializationFeature.WRAP_EXCEPTIONS);
        if (th instanceof IOException) {
            if (!z || !(th instanceof JacksonException)) {
                throw ((IOException) th);
            }
        } else if (!z) {
            wf0.m29519j0(th);
        }
        throw JsonMappingException.wrapWithPath(th, obj, i);
    }
}
