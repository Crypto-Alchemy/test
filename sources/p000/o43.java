package p000;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.Collection;

/* renamed from: o43 */
/* compiled from: JsonDeserializer */
public abstract class o43<T> implements bc4 {

    /* renamed from: o43$a */
    /* compiled from: JsonDeserializer */
    public static abstract class C2939a extends o43<Object> {
    }

    public abstract T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException;

    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, T t) throws IOException, JacksonException {
        deserializationContext.handleBadMerge(this);
        return deserialize(jsonParser, deserializationContext);
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, j07 j07) throws IOException, JacksonException {
        return j07.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    public SettableBeanProperty findBackReference(String str) {
        throw new IllegalArgumentException("Cannot handle managed/back reference '" + str + "': type: value deserializer of type " + getClass().getName() + " does not support them");
    }

    public Object getAbsentValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return getNullValue(deserializationContext);
    }

    public o43<?> getDelegatee() {
        return null;
    }

    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.DYNAMIC;
    }

    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return getNullValue(deserializationContext);
    }

    public Collection<Object> getKnownPropertyNames() {
        return null;
    }

    public AccessPattern getNullAccessPattern() {
        return AccessPattern.CONSTANT;
    }

    @Deprecated
    public T getNullValue() {
        return null;
    }

    public T getNullValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return getNullValue();
    }

    public ObjectIdReader getObjectIdReader() {
        return null;
    }

    public Class<?> handledType() {
        return null;
    }

    public boolean isCachable() {
        return false;
    }

    public LogicalType logicalType() {
        return null;
    }

    public o43<?> replaceDelegatee(o43<?> o43) {
        throw new UnsupportedOperationException();
    }

    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return null;
    }

    public o43<T> unwrappingDeserializer(NameTransformer nameTransformer) {
        return this;
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, j07 j07, T t) throws IOException, JacksonException {
        deserializationContext.handleBadMerge(this);
        return deserializeWithType(jsonParser, deserializationContext, j07);
    }

    @Deprecated
    public Object getEmptyValue() {
        return getNullValue();
    }
}
