package p000;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import java.io.IOException;

/* renamed from: kr1 */
/* compiled from: ErrorThrowingDeserializer */
public class kr1 extends o43<Object> {

    /* renamed from: a */
    public final Error f14268a;

    public kr1(NoClassDefFoundError noClassDefFoundError) {
        this.f14268a = noClassDefFoundError;
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        throw this.f14268a;
    }
}
