package p000;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.PropertyWriter;

/* renamed from: hx4 */
/* compiled from: PropertyFilter */
public interface hx4 {
    /* renamed from: a */
    void mo21414a(Object obj, JsonGenerator jsonGenerator, zw5 zw5, PropertyWriter propertyWriter) throws Exception;

    /* renamed from: b */
    void mo21415b(PropertyWriter propertyWriter, j53 j53, zw5 zw5) throws JsonMappingException;

    @Deprecated
    /* renamed from: c */
    void mo21416c(PropertyWriter propertyWriter, ObjectNode objectNode, zw5 zw5) throws JsonMappingException;
}
