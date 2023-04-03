package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.impl.FailingDeserializer;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase;
import com.fasterxml.jackson.databind.util.ViewMatcher;
import java.io.IOException;
import java.lang.annotation.Annotation;

public abstract class SettableBeanProperty extends ConcreteBeanPropertyBase {
    public static final o43<Object> MISSING_VALUE_DESERIALIZER = new FailingDeserializer("No _valueDeserializer assigned");
    public final transient C2236em _contextAnnotations;
    public String _managedReferenceName;
    public final bc4 _nullProvider;
    public bf4 _objectIdInfo;
    public final PropertyName _propName;
    public int _propertyIndex;
    public final JavaType _type;
    public final o43<Object> _valueDeserializer;
    public final j07 _valueTypeDeserializer;
    public ViewMatcher _viewMatcher;
    public final PropertyName _wrapperName;

    public static abstract class Delegating extends SettableBeanProperty {
        public final SettableBeanProperty delegate;

        public Delegating(SettableBeanProperty settableBeanProperty) {
            super(settableBeanProperty);
            this.delegate = settableBeanProperty;
        }

        public SettableBeanProperty _with(SettableBeanProperty settableBeanProperty) {
            if (settableBeanProperty == this.delegate) {
                return this;
            }
            return withDelegate(settableBeanProperty);
        }

        public void assignIndex(int i) {
            this.delegate.assignIndex(i);
        }

        public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
            this.delegate.deserializeAndSet(jsonParser, deserializationContext, obj);
        }

        public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
            return this.delegate.deserializeSetAndReturn(jsonParser, deserializationContext, obj);
        }

        public void fixAccess(DeserializationConfig deserializationConfig) {
            this.delegate.fixAccess(deserializationConfig);
        }

        public <A extends Annotation> A getAnnotation(Class<A> cls) {
            return this.delegate.getAnnotation(cls);
        }

        public int getCreatorIndex() {
            return this.delegate.getCreatorIndex();
        }

        public Class<?> getDeclaringClass() {
            return this.delegate.getDeclaringClass();
        }

        public SettableBeanProperty getDelegate() {
            return this.delegate;
        }

        public Object getInjectableValueId() {
            return this.delegate.getInjectableValueId();
        }

        public String getManagedReferenceName() {
            return this.delegate.getManagedReferenceName();
        }

        public AnnotatedMember getMember() {
            return this.delegate.getMember();
        }

        public bf4 getObjectIdInfo() {
            return this.delegate.getObjectIdInfo();
        }

        public int getPropertyIndex() {
            return this.delegate.getPropertyIndex();
        }

        public o43<Object> getValueDeserializer() {
            return this.delegate.getValueDeserializer();
        }

        public j07 getValueTypeDeserializer() {
            return this.delegate.getValueTypeDeserializer();
        }

        public boolean hasValueDeserializer() {
            return this.delegate.hasValueDeserializer();
        }

        public boolean hasValueTypeDeserializer() {
            return this.delegate.hasValueTypeDeserializer();
        }

        public boolean hasViews() {
            return this.delegate.hasViews();
        }

        public boolean isInjectionOnly() {
            return this.delegate.isInjectionOnly();
        }

        public void set(Object obj, Object obj2) throws IOException {
            this.delegate.set(obj, obj2);
        }

        public Object setAndReturn(Object obj, Object obj2) throws IOException {
            return this.delegate.setAndReturn(obj, obj2);
        }

        public boolean visibleInView(Class<?> cls) {
            return this.delegate.visibleInView(cls);
        }

        public abstract SettableBeanProperty withDelegate(SettableBeanProperty settableBeanProperty);

        public SettableBeanProperty withName(PropertyName propertyName) {
            return _with(this.delegate.withName(propertyName));
        }

        public SettableBeanProperty withNullProvider(bc4 bc4) {
            return _with(this.delegate.withNullProvider(bc4));
        }

        public SettableBeanProperty withValueDeserializer(o43<?> o43) {
            return _with(this.delegate.withValueDeserializer(o43));
        }
    }

    public SettableBeanProperty(q00 q00, JavaType javaType, j07 j07, C2236em emVar) {
        this(q00.getFullName(), javaType, q00.getWrapperName(), j07, emVar, q00.getMetadata());
    }

    public void _throwAsIOE(JsonParser jsonParser, Exception exc, Object obj) throws IOException {
        if (exc instanceof IllegalArgumentException) {
            String h = wf0.m29514h(obj);
            StringBuilder sb = new StringBuilder("Problem deserializing property '");
            sb.append(getName());
            sb.append("' (expected type: ");
            sb.append(getType());
            sb.append("; actual type: ");
            sb.append(h);
            sb.append(")");
            String o = wf0.m29528o(exc);
            if (o != null) {
                sb.append(", problem: ");
                sb.append(o);
            } else {
                sb.append(" (no error message provided)");
            }
            throw JsonMappingException.from(jsonParser, sb.toString(), (Throwable) exc);
        }
        _throwAsIOE(jsonParser, exc);
    }

    public void assignIndex(int i) {
        if (this._propertyIndex == -1) {
            this._propertyIndex = i;
            return;
        }
        throw new IllegalStateException("Property '" + getName() + "' already had index (" + this._propertyIndex + "), trying to assign " + i);
    }

    public void depositSchemaProperty(j53 j53, zw5 zw5) throws JsonMappingException {
        if (isRequired()) {
            j53.mo21725q(this);
        } else {
            j53.mo21724l(this);
        }
    }

    public final Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.mo13984s0(JsonToken.VALUE_NULL)) {
            return this._nullProvider.getNullValue(deserializationContext);
        }
        j07 j07 = this._valueTypeDeserializer;
        if (j07 != null) {
            return this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, j07);
        }
        Object deserialize = this._valueDeserializer.deserialize(jsonParser, deserializationContext);
        if (deserialize == null) {
            return this._nullProvider.getNullValue(deserializationContext);
        }
        return deserialize;
    }

    public abstract void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException;

    public abstract Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException;

    public final Object deserializeWith(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        if (!jsonParser.mo13984s0(JsonToken.VALUE_NULL)) {
            if (this._valueTypeDeserializer != null) {
                deserializationContext.reportBadDefinition(getType(), String.format("Cannot merge polymorphic property '%s'", new Object[]{getName()}));
            }
            Object deserialize = this._valueDeserializer.deserialize(jsonParser, deserializationContext, obj);
            if (deserialize != null) {
                return deserialize;
            }
            if (NullsConstantProvider.isSkipper(this._nullProvider)) {
                return obj;
            }
            return this._nullProvider.getNullValue(deserializationContext);
        } else if (NullsConstantProvider.isSkipper(this._nullProvider)) {
            return obj;
        } else {
            return this._nullProvider.getNullValue(deserializationContext);
        }
    }

    public void fixAccess(DeserializationConfig deserializationConfig) {
    }

    public abstract <A extends Annotation> A getAnnotation(Class<A> cls);

    public <A extends Annotation> A getContextAnnotation(Class<A> cls) {
        return this._contextAnnotations.get(cls);
    }

    public int getCreatorIndex() {
        throw new IllegalStateException(String.format("Internal error: no creator index for property '%s' (of type %s)", new Object[]{getName(), getClass().getName()}));
    }

    public Class<?> getDeclaringClass() {
        return getMember().getDeclaringClass();
    }

    public PropertyName getFullName() {
        return this._propName;
    }

    public Object getInjectableValueId() {
        return null;
    }

    public String getManagedReferenceName() {
        return this._managedReferenceName;
    }

    public abstract AnnotatedMember getMember();

    public final String getName() {
        return this._propName.getSimpleName();
    }

    public bc4 getNullValueProvider() {
        return this._nullProvider;
    }

    public bf4 getObjectIdInfo() {
        return this._objectIdInfo;
    }

    public int getPropertyIndex() {
        return this._propertyIndex;
    }

    public JavaType getType() {
        return this._type;
    }

    public o43<Object> getValueDeserializer() {
        o43<Object> o43 = this._valueDeserializer;
        if (o43 == MISSING_VALUE_DESERIALIZER) {
            return null;
        }
        return o43;
    }

    public j07 getValueTypeDeserializer() {
        return this._valueTypeDeserializer;
    }

    public PropertyName getWrapperName() {
        return this._wrapperName;
    }

    public boolean hasValueDeserializer() {
        o43<Object> o43 = this._valueDeserializer;
        if (o43 == null || o43 == MISSING_VALUE_DESERIALIZER) {
            return false;
        }
        return true;
    }

    public boolean hasValueTypeDeserializer() {
        if (this._valueTypeDeserializer != null) {
            return true;
        }
        return false;
    }

    public boolean hasViews() {
        if (this._viewMatcher != null) {
            return true;
        }
        return false;
    }

    public boolean isIgnorable() {
        return false;
    }

    public boolean isInjectionOnly() {
        return false;
    }

    public void markAsIgnorable() {
    }

    public abstract void set(Object obj, Object obj2) throws IOException;

    public abstract Object setAndReturn(Object obj, Object obj2) throws IOException;

    public void setManagedReferenceName(String str) {
        this._managedReferenceName = str;
    }

    public void setObjectIdInfo(bf4 bf4) {
        this._objectIdInfo = bf4;
    }

    public void setViews(Class<?>[] clsArr) {
        if (clsArr == null) {
            this._viewMatcher = null;
        } else {
            this._viewMatcher = ViewMatcher.construct(clsArr);
        }
    }

    public String toString() {
        return "[property '" + getName() + "']";
    }

    public boolean visibleInView(Class<?> cls) {
        ViewMatcher viewMatcher = this._viewMatcher;
        if (viewMatcher == null || viewMatcher.isVisibleForView(cls)) {
            return true;
        }
        return false;
    }

    public abstract SettableBeanProperty withName(PropertyName propertyName);

    public abstract SettableBeanProperty withNullProvider(bc4 bc4);

    public SettableBeanProperty withSimpleName(String str) {
        PropertyName propertyName;
        PropertyName propertyName2 = this._propName;
        if (propertyName2 == null) {
            propertyName = new PropertyName(str);
        } else {
            propertyName = propertyName2.withSimpleName(str);
        }
        if (propertyName == this._propName) {
            return this;
        }
        return withName(propertyName);
    }

    public abstract SettableBeanProperty withValueDeserializer(o43<?> o43);

    public SettableBeanProperty(PropertyName propertyName, JavaType javaType, PropertyName propertyName2, j07 j07, C2236em emVar, PropertyMetadata propertyMetadata) {
        super(propertyMetadata);
        this._propertyIndex = -1;
        if (propertyName == null) {
            this._propName = PropertyName.NO_NAME;
        } else {
            this._propName = propertyName.internSimpleName();
        }
        this._type = javaType;
        this._wrapperName = propertyName2;
        this._contextAnnotations = emVar;
        this._viewMatcher = null;
        this._valueTypeDeserializer = j07 != null ? j07.forProperty(this) : j07;
        o43<Object> o43 = MISSING_VALUE_DESERIALIZER;
        this._valueDeserializer = o43;
        this._nullProvider = o43;
    }

    public IOException _throwAsIOE(JsonParser jsonParser, Exception exc) throws IOException {
        wf0.m29517i0(exc);
        wf0.m29519j0(exc);
        Throwable F = wf0.m29479F(exc);
        throw JsonMappingException.from(jsonParser, wf0.m29528o(F), F);
    }

    public SettableBeanProperty(PropertyName propertyName, JavaType javaType, PropertyMetadata propertyMetadata, o43<Object> o43) {
        super(propertyMetadata);
        this._propertyIndex = -1;
        if (propertyName == null) {
            this._propName = PropertyName.NO_NAME;
        } else {
            this._propName = propertyName.internSimpleName();
        }
        this._type = javaType;
        this._wrapperName = null;
        this._contextAnnotations = null;
        this._viewMatcher = null;
        this._valueTypeDeserializer = null;
        this._valueDeserializer = o43;
        this._nullProvider = o43;
    }

    @Deprecated
    public IOException _throwAsIOE(Exception exc) throws IOException {
        return _throwAsIOE((JsonParser) null, exc);
    }

    public void _throwAsIOE(Exception exc, Object obj) throws IOException {
        _throwAsIOE((JsonParser) null, exc, obj);
    }

    public SettableBeanProperty(SettableBeanProperty settableBeanProperty) {
        super((ConcreteBeanPropertyBase) settableBeanProperty);
        this._propertyIndex = -1;
        this._propName = settableBeanProperty._propName;
        this._type = settableBeanProperty._type;
        this._wrapperName = settableBeanProperty._wrapperName;
        this._contextAnnotations = settableBeanProperty._contextAnnotations;
        this._valueDeserializer = settableBeanProperty._valueDeserializer;
        this._valueTypeDeserializer = settableBeanProperty._valueTypeDeserializer;
        this._managedReferenceName = settableBeanProperty._managedReferenceName;
        this._propertyIndex = settableBeanProperty._propertyIndex;
        this._viewMatcher = settableBeanProperty._viewMatcher;
        this._nullProvider = settableBeanProperty._nullProvider;
    }

    public SettableBeanProperty(SettableBeanProperty settableBeanProperty, o43<?> o43, bc4 bc4) {
        super((ConcreteBeanPropertyBase) settableBeanProperty);
        this._propertyIndex = -1;
        this._propName = settableBeanProperty._propName;
        this._type = settableBeanProperty._type;
        this._wrapperName = settableBeanProperty._wrapperName;
        this._contextAnnotations = settableBeanProperty._contextAnnotations;
        this._valueTypeDeserializer = settableBeanProperty._valueTypeDeserializer;
        this._managedReferenceName = settableBeanProperty._managedReferenceName;
        this._propertyIndex = settableBeanProperty._propertyIndex;
        if (o43 == null) {
            this._valueDeserializer = MISSING_VALUE_DESERIALIZER;
        } else {
            this._valueDeserializer = o43;
        }
        this._viewMatcher = settableBeanProperty._viewMatcher;
        this._nullProvider = bc4 == MISSING_VALUE_DESERIALIZER ? this._valueDeserializer : bc4;
    }

    public SettableBeanProperty(SettableBeanProperty settableBeanProperty, PropertyName propertyName) {
        super((ConcreteBeanPropertyBase) settableBeanProperty);
        this._propertyIndex = -1;
        this._propName = propertyName;
        this._type = settableBeanProperty._type;
        this._wrapperName = settableBeanProperty._wrapperName;
        this._contextAnnotations = settableBeanProperty._contextAnnotations;
        this._valueDeserializer = settableBeanProperty._valueDeserializer;
        this._valueTypeDeserializer = settableBeanProperty._valueTypeDeserializer;
        this._managedReferenceName = settableBeanProperty._managedReferenceName;
        this._propertyIndex = settableBeanProperty._propertyIndex;
        this._viewMatcher = settableBeanProperty._viewMatcher;
        this._nullProvider = settableBeanProperty._nullProvider;
    }
}
