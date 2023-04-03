package p000;

import com.fasterxml.jackson.core.C1979c;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.Version;
import java.io.IOException;
import java.util.Iterator;

/* renamed from: xe4 */
/* compiled from: ObjectCodec */
public abstract class xe4 extends sx6 {
    public abstract C1979c createArrayNode();

    public abstract C1979c createObjectNode();

    public JsonFactory getFactory() {
        return getJsonFactory();
    }

    @Deprecated
    public JsonFactory getJsonFactory() {
        return getFactory();
    }

    public abstract <T extends C1979c> T readTree(JsonParser jsonParser) throws IOException;

    public abstract <T> T readValue(JsonParser jsonParser, af5 af5) throws IOException;

    public abstract <T> T readValue(JsonParser jsonParser, j17<T> j17) throws IOException;

    public abstract <T> T readValue(JsonParser jsonParser, Class<T> cls) throws IOException;

    public abstract <T> Iterator<T> readValues(JsonParser jsonParser, af5 af5) throws IOException;

    public abstract <T> Iterator<T> readValues(JsonParser jsonParser, j17<T> j17) throws IOException;

    public abstract <T> Iterator<T> readValues(JsonParser jsonParser, Class<T> cls) throws IOException;

    public abstract JsonParser treeAsTokens(C1979c cVar);

    public abstract <T> T treeToValue(C1979c cVar, Class<T> cls) throws JsonProcessingException;

    public abstract Version version();

    public abstract void writeTree(JsonGenerator jsonGenerator, C1979c cVar) throws IOException;

    public abstract void writeValue(JsonGenerator jsonGenerator, Object obj) throws IOException;
}
