package p000;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;

/* renamed from: w63 */
/* compiled from: JsonSerializable */
public interface w63 {

    /* renamed from: w63$a */
    /* compiled from: JsonSerializable */
    public static abstract class C3522a implements w63 {
        public boolean isEmpty(zw5 zw5) {
            return false;
        }
    }

    void serialize(JsonGenerator jsonGenerator, zw5 zw5) throws IOException;

    void serializeWithType(JsonGenerator jsonGenerator, zw5 zw5, m17 m17) throws IOException;
}
