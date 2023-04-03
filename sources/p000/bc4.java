package p000;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;

/* renamed from: bc4 */
/* compiled from: NullValueProvider */
public interface bc4 {
    Object getAbsentValue(DeserializationContext deserializationContext) throws JsonMappingException;

    Object getNullValue(DeserializationContext deserializationContext) throws JsonMappingException;
}
