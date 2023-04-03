package p000;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.IOException;

/* renamed from: d27 */
/* compiled from: TypeWrappedSerializer */
public final class d27 extends y63<Object> implements ls0 {

    /* renamed from: a */
    public final m17 f10458a;

    /* renamed from: d */
    public final y63<Object> f10459d;

    public d27(m17 m17, y63<?> y63) {
        this.f10458a = m17;
        this.f10459d = y63;
    }

    /* renamed from: a */
    public m17 mo18413a() {
        return this.f10458a;
    }

    public y63<?> createContextual(zw5 zw5, BeanProperty beanProperty) throws JsonMappingException {
        y63 y63 = this.f10459d;
        if (y63 instanceof ls0) {
            y63 = zw5.handleSecondaryContextualization(y63, beanProperty);
        }
        if (y63 == this.f10459d) {
            return this;
        }
        return new d27(this.f10458a, y63);
    }

    public Class<Object> handledType() {
        return Object.class;
    }

    public void serialize(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        this.f10459d.serializeWithType(obj, jsonGenerator, zw5, this.f10458a);
    }

    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, zw5 zw5, m17 m17) throws IOException {
        this.f10459d.serializeWithType(obj, jsonGenerator, zw5, m17);
    }
}
