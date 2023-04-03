package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.lang.annotation.Annotation;

public abstract class PropertyWriter extends ConcreteBeanPropertyBase {
    private static final long serialVersionUID = 1;

    public PropertyWriter(PropertyMetadata propertyMetadata) {
        super(propertyMetadata);
    }

    @Deprecated
    public abstract void depositSchemaProperty(ObjectNode objectNode, zw5 zw5) throws JsonMappingException;

    public abstract void depositSchemaProperty(j53 j53, zw5 zw5) throws JsonMappingException;

    public <A extends Annotation> A findAnnotation(Class<A> cls) {
        A annotation = getAnnotation(cls);
        if (annotation == null) {
            return getContextAnnotation(cls);
        }
        return annotation;
    }

    public abstract <A extends Annotation> A getAnnotation(Class<A> cls);

    public abstract <A extends Annotation> A getContextAnnotation(Class<A> cls);

    public abstract PropertyName getFullName();

    public abstract /* synthetic */ AnnotatedMember getMember();

    public abstract String getName();

    public abstract /* synthetic */ JavaType getType();

    public abstract /* synthetic */ PropertyName getWrapperName();

    public abstract void serializeAsElement(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws Exception;

    public abstract void serializeAsField(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws Exception;

    public abstract void serializeAsOmittedField(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws Exception;

    public abstract void serializeAsPlaceholder(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws Exception;

    public PropertyWriter(q00 q00) {
        super(q00.getMetadata());
    }

    public PropertyWriter(PropertyWriter propertyWriter) {
        super((ConcreteBeanPropertyBase) propertyWriter);
    }
}
