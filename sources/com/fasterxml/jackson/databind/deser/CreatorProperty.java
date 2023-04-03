package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import java.io.IOException;
import java.lang.annotation.Annotation;

public class CreatorProperty extends SettableBeanProperty {
    private static final long serialVersionUID = 1;
    public final AnnotatedParameter _annotated;
    public final int _creatorIndex;
    public SettableBeanProperty _fallbackSetter;
    public boolean _ignorable;
    public final JacksonInject.Value _injectableValue;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreatorProperty(PropertyName propertyName, JavaType javaType, PropertyName propertyName2, j07 j07, C2236em emVar, AnnotatedParameter annotatedParameter, int i, JacksonInject.Value value, PropertyMetadata propertyMetadata) {
        super(propertyName, javaType, propertyName2, j07, emVar, propertyMetadata);
        this._annotated = annotatedParameter;
        this._creatorIndex = i;
        this._injectableValue = value;
        this._fallbackSetter = null;
    }

    public static CreatorProperty construct(PropertyName propertyName, JavaType javaType, PropertyName propertyName2, j07 j07, C2236em emVar, AnnotatedParameter annotatedParameter, int i, JacksonInject.Value value, PropertyMetadata propertyMetadata) {
        return new CreatorProperty(propertyName, javaType, propertyName2, j07, emVar, annotatedParameter, i, value, propertyMetadata);
    }

    /* renamed from: a */
    public final void mo15429a(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String str = "No fallback setter/field defined for creator property " + wf0.m29495V(getName());
        if (deserializationContext != null) {
            deserializationContext.reportBadDefinition(getType(), str);
            return;
        }
        throw InvalidDefinitionException.from(jsonParser, str, getType());
    }

    /* renamed from: b */
    public final void mo15430b() throws IOException {
        if (this._fallbackSetter == null) {
            mo15429a((JsonParser) null, (DeserializationContext) null);
        }
    }

    public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        mo15430b();
        this._fallbackSetter.set(obj, deserialize(jsonParser, deserializationContext));
    }

    public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        mo15430b();
        return this._fallbackSetter.setAndReturn(obj, deserialize(jsonParser, deserializationContext));
    }

    @Deprecated
    public Object findInjectableValue(DeserializationContext deserializationContext, Object obj) throws JsonMappingException {
        if (this._injectableValue == null) {
            deserializationContext.reportBadDefinition(wf0.m29516i(obj), String.format("Property %s (type %s) has no injectable value id configured", new Object[]{wf0.m29495V(getName()), wf0.m29514h(this)}));
        }
        return deserializationContext.findInjectableValue(this._injectableValue.getId(), this, obj);
    }

    public void fixAccess(DeserializationConfig deserializationConfig) {
        SettableBeanProperty settableBeanProperty = this._fallbackSetter;
        if (settableBeanProperty != null) {
            settableBeanProperty.fixAccess(deserializationConfig);
        }
    }

    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        AnnotatedParameter annotatedParameter = this._annotated;
        if (annotatedParameter == null) {
            return null;
        }
        return annotatedParameter.getAnnotation(cls);
    }

    public int getCreatorIndex() {
        return this._creatorIndex;
    }

    public Object getInjectableValueId() {
        JacksonInject.Value value = this._injectableValue;
        if (value == null) {
            return null;
        }
        return value.getId();
    }

    public AnnotatedMember getMember() {
        return this._annotated;
    }

    public PropertyMetadata getMetadata() {
        PropertyMetadata metadata = super.getMetadata();
        SettableBeanProperty settableBeanProperty = this._fallbackSetter;
        if (settableBeanProperty != null) {
            return metadata.withMergeInfo(settableBeanProperty.getMetadata().getMergeInfo());
        }
        return metadata;
    }

    @Deprecated
    public void inject(DeserializationContext deserializationContext, Object obj) throws IOException {
        set(obj, findInjectableValue(deserializationContext, obj));
    }

    public boolean isIgnorable() {
        return this._ignorable;
    }

    public boolean isInjectionOnly() {
        JacksonInject.Value value = this._injectableValue;
        if (value == null || value.willUseInput(true)) {
            return false;
        }
        return true;
    }

    public void markAsIgnorable() {
        this._ignorable = true;
    }

    public void set(Object obj, Object obj2) throws IOException {
        mo15430b();
        this._fallbackSetter.set(obj, obj2);
    }

    public Object setAndReturn(Object obj, Object obj2) throws IOException {
        mo15430b();
        return this._fallbackSetter.setAndReturn(obj, obj2);
    }

    public void setFallbackSetter(SettableBeanProperty settableBeanProperty) {
        this._fallbackSetter = settableBeanProperty;
    }

    public String toString() {
        return "[creator property, name " + wf0.m29495V(getName()) + "; inject id '" + getInjectableValueId() + "']";
    }

    public SettableBeanProperty withName(PropertyName propertyName) {
        return new CreatorProperty(this, propertyName);
    }

    public SettableBeanProperty withNullProvider(bc4 bc4) {
        return new CreatorProperty(this, this._valueDeserializer, bc4);
    }

    public SettableBeanProperty withValueDeserializer(o43<?> o43) {
        o43<Object> o432 = this._valueDeserializer;
        if (o432 == o43) {
            return this;
        }
        bc4 bc4 = this._nullProvider;
        if (o432 == bc4) {
            bc4 = o43;
        }
        return new CreatorProperty(this, o43, bc4);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CreatorProperty(com.fasterxml.jackson.databind.PropertyName r13, com.fasterxml.jackson.databind.JavaType r14, com.fasterxml.jackson.databind.PropertyName r15, p000.j07 r16, p000.C2236em r17, com.fasterxml.jackson.databind.introspect.AnnotatedParameter r18, int r19, java.lang.Object r20, com.fasterxml.jackson.databind.PropertyMetadata r21) {
        /*
            r12 = this;
            r0 = r20
            r1 = 0
            if (r0 != 0) goto L_0x0006
            goto L_0x000a
        L_0x0006:
            com.fasterxml.jackson.annotation.JacksonInject$Value r1 = com.fasterxml.jackson.annotation.JacksonInject.Value.construct(r0, r1)
        L_0x000a:
            r10 = r1
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r11 = r21
            r2.<init>((com.fasterxml.jackson.databind.PropertyName) r3, (com.fasterxml.jackson.databind.JavaType) r4, (com.fasterxml.jackson.databind.PropertyName) r5, (p000.j07) r6, (p000.C2236em) r7, (com.fasterxml.jackson.databind.introspect.AnnotatedParameter) r8, (int) r9, (com.fasterxml.jackson.annotation.JacksonInject.Value) r10, (com.fasterxml.jackson.databind.PropertyMetadata) r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.CreatorProperty.<init>(com.fasterxml.jackson.databind.PropertyName, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.PropertyName, j07, em, com.fasterxml.jackson.databind.introspect.AnnotatedParameter, int, java.lang.Object, com.fasterxml.jackson.databind.PropertyMetadata):void");
    }

    public CreatorProperty(CreatorProperty creatorProperty, PropertyName propertyName) {
        super(creatorProperty, propertyName);
        this._annotated = creatorProperty._annotated;
        this._injectableValue = creatorProperty._injectableValue;
        this._fallbackSetter = creatorProperty._fallbackSetter;
        this._creatorIndex = creatorProperty._creatorIndex;
        this._ignorable = creatorProperty._ignorable;
    }

    public CreatorProperty(CreatorProperty creatorProperty, o43<?> o43, bc4 bc4) {
        super(creatorProperty, o43, bc4);
        this._annotated = creatorProperty._annotated;
        this._injectableValue = creatorProperty._injectableValue;
        this._fallbackSetter = creatorProperty._fallbackSetter;
        this._creatorIndex = creatorProperty._creatorIndex;
        this._ignorable = creatorProperty._ignorable;
    }
}
