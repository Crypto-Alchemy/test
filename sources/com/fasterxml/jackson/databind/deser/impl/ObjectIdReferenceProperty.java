package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.impl.C2001a;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.io.IOException;
import java.lang.annotation.Annotation;

public class ObjectIdReferenceProperty extends SettableBeanProperty {
    private static final long serialVersionUID = 1;
    private final SettableBeanProperty _forward;

    /* renamed from: com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty$a */
    public static final class C2000a extends C2001a.C2002a {

        /* renamed from: c */
        public final ObjectIdReferenceProperty f9939c;

        /* renamed from: d */
        public final Object f9940d;

        public C2000a(ObjectIdReferenceProperty objectIdReferenceProperty, UnresolvedForwardReference unresolvedForwardReference, Class<?> cls, Object obj) {
            super(unresolvedForwardReference, cls);
            this.f9939c = objectIdReferenceProperty;
            this.f9940d = obj;
        }

        /* renamed from: c */
        public void mo15344c(Object obj, Object obj2) throws IOException {
            if (mo15620d(obj)) {
                this.f9939c.set(this.f9940d, obj2);
                return;
            }
            throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + obj + "] that wasn't previously seen as unresolved.");
        }
    }

    public ObjectIdReferenceProperty(SettableBeanProperty settableBeanProperty, bf4 bf4) {
        super(settableBeanProperty);
        this._forward = settableBeanProperty;
        this._objectIdInfo = bf4;
    }

    public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        deserializeSetAndReturn(jsonParser, deserializationContext, obj);
    }

    public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        boolean z;
        try {
            return setAndReturn(obj, deserialize(jsonParser, deserializationContext));
        } catch (UnresolvedForwardReference e) {
            if (this._objectIdInfo == null && this._valueDeserializer.getObjectIdReader() == null) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                e.getRoid().mo15609a(new C2000a(this, e, this._type.getRawClass(), obj));
                return null;
            }
            throw JsonMappingException.from(jsonParser, "Unresolved forward reference but no identity info", (Throwable) e);
        }
    }

    public void fixAccess(DeserializationConfig deserializationConfig) {
        SettableBeanProperty settableBeanProperty = this._forward;
        if (settableBeanProperty != null) {
            settableBeanProperty.fixAccess(deserializationConfig);
        }
    }

    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        return this._forward.getAnnotation(cls);
    }

    public int getCreatorIndex() {
        return this._forward.getCreatorIndex();
    }

    public AnnotatedMember getMember() {
        return this._forward.getMember();
    }

    public void set(Object obj, Object obj2) throws IOException {
        this._forward.set(obj, obj2);
    }

    public Object setAndReturn(Object obj, Object obj2) throws IOException {
        return this._forward.setAndReturn(obj, obj2);
    }

    public SettableBeanProperty withName(PropertyName propertyName) {
        return new ObjectIdReferenceProperty(this, propertyName);
    }

    public SettableBeanProperty withNullProvider(bc4 bc4) {
        return new ObjectIdReferenceProperty(this, this._valueDeserializer, bc4);
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
        return new ObjectIdReferenceProperty(this, o43, bc4);
    }

    public ObjectIdReferenceProperty(ObjectIdReferenceProperty objectIdReferenceProperty, o43<?> o43, bc4 bc4) {
        super(objectIdReferenceProperty, o43, bc4);
        this._forward = objectIdReferenceProperty._forward;
        this._objectIdInfo = objectIdReferenceProperty._objectIdInfo;
    }

    public ObjectIdReferenceProperty(ObjectIdReferenceProperty objectIdReferenceProperty, PropertyName propertyName) {
        super(objectIdReferenceProperty, propertyName);
        this._forward = objectIdReferenceProperty._forward;
        this._objectIdInfo = objectIdReferenceProperty._objectIdInfo;
    }
}
