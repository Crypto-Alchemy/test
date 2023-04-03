package p000;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ser.PropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.Iterator;

/* renamed from: y63 */
/* compiled from: JsonSerializer */
public abstract class y63<T> implements r43 {

    /* renamed from: y63$a */
    /* compiled from: JsonSerializer */
    public static abstract class C3656a extends y63<Object> {
    }

    public void acceptJsonFormatVisitor(t43 t43, JavaType javaType) throws JsonMappingException {
        t43.mo26057j(javaType);
    }

    public y63<?> getDelegatee() {
        return null;
    }

    public Class<T> handledType() {
        return null;
    }

    @Deprecated
    public boolean isEmpty(T t) {
        return isEmpty((zw5) null, t);
    }

    public boolean isEmpty(zw5 zw5, T t) {
        return t == null;
    }

    public boolean isUnwrappingSerializer() {
        return false;
    }

    public Iterator<PropertyWriter> properties() {
        return wf0.m29526n();
    }

    public y63<T> replaceDelegatee(y63<?> y63) {
        throw new UnsupportedOperationException();
    }

    public abstract void serialize(T t, JsonGenerator jsonGenerator, zw5 zw5) throws IOException;

    public void serializeWithType(T t, JsonGenerator jsonGenerator, zw5 zw5, m17 m17) throws IOException {
        Class<?> handledType = handledType();
        if (handledType == null) {
            handledType = t.getClass();
        }
        zw5.reportBadDefinition(handledType, String.format("Type id handling not implemented for type %s (by serializer of type %s)", new Object[]{handledType.getName(), getClass().getName()}));
    }

    public y63<T> unwrappingSerializer(NameTransformer nameTransformer) {
        return this;
    }

    public boolean usesObjectId() {
        return false;
    }

    public y63<?> withFilterId(Object obj) {
        return this;
    }
}
