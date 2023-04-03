package p000;

import com.fasterxml.jackson.databind.JsonMappingException;
import java.lang.reflect.Type;

/* renamed from: ym5 */
/* compiled from: SchemaAware */
public interface ym5 {
    g53 getSchema(zw5 zw5, Type type) throws JsonMappingException;

    g53 getSchema(zw5 zw5, Type type, boolean z) throws JsonMappingException;
}
