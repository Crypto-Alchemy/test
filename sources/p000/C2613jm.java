package p000;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import java.util.Map;

/* renamed from: jm */
/* compiled from: AnyGetterWriter */
public class C2613jm {

    /* renamed from: a */
    public final BeanProperty f13697a;

    /* renamed from: b */
    public final AnnotatedMember f13698b;

    /* renamed from: c */
    public y63<Object> f13699c;

    /* renamed from: d */
    public MapSerializer f13700d;

    public C2613jm(BeanProperty beanProperty, AnnotatedMember annotatedMember, y63<?> y63) {
        this.f13698b = annotatedMember;
        this.f13697a = beanProperty;
        this.f13699c = y63;
        if (y63 instanceof MapSerializer) {
            this.f13700d = (MapSerializer) y63;
        }
    }

    /* renamed from: a */
    public void mo21964a(SerializationConfig serializationConfig) {
        this.f13698b.fixAccess(serializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    /* renamed from: b */
    public void mo21965b(Object obj, JsonGenerator jsonGenerator, zw5 zw5, hx4 hx4) throws Exception {
        Object value = this.f13698b.getValue(obj);
        if (value != null) {
            if (!(value instanceof Map)) {
                zw5.reportBadDefinition(this.f13697a.getType(), String.format("Value returned by 'any-getter' (%s()) not java.util.Map but %s", new Object[]{this.f13698b.getName(), value.getClass().getName()}));
            }
            MapSerializer mapSerializer = this.f13700d;
            if (mapSerializer != null) {
                mapSerializer.serializeFilteredAnyProperties(zw5, jsonGenerator, obj, (Map) value, hx4, (Object) null);
                return;
            }
            this.f13699c.serialize(value, jsonGenerator, zw5);
        }
    }

    /* renamed from: c */
    public void mo21966c(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws Exception {
        Object value = this.f13698b.getValue(obj);
        if (value != null) {
            if (!(value instanceof Map)) {
                zw5.reportBadDefinition(this.f13697a.getType(), String.format("Value returned by 'any-getter' %s() not java.util.Map but %s", new Object[]{this.f13698b.getName(), value.getClass().getName()}));
            }
            MapSerializer mapSerializer = this.f13700d;
            if (mapSerializer != null) {
                mapSerializer.serializeWithoutTypeInfo((Map) value, jsonGenerator, zw5);
            } else {
                this.f13699c.serialize(value, jsonGenerator, zw5);
            }
        }
    }

    /* renamed from: d */
    public void mo21967d(zw5 zw5) throws JsonMappingException {
        y63<Object> y63 = this.f13699c;
        if (y63 instanceof ls0) {
            y63<?> handlePrimaryContextualization = zw5.handlePrimaryContextualization(y63, this.f13697a);
            this.f13699c = handlePrimaryContextualization;
            if (handlePrimaryContextualization instanceof MapSerializer) {
                this.f13700d = (MapSerializer) handlePrimaryContextualization;
            }
        }
    }
}
