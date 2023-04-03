package p000;

import com.fasterxml.jackson.core.C1979c;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;

/* renamed from: sx6 */
/* compiled from: TreeCodec */
public abstract class sx6 {
    public abstract C1979c createArrayNode();

    public abstract C1979c createObjectNode();

    public C1979c missingNode() {
        return null;
    }

    public C1979c nullNode() {
        return null;
    }

    public abstract <T extends C1979c> T readTree(JsonParser jsonParser) throws IOException, JsonProcessingException;

    public abstract JsonParser treeAsTokens(C1979c cVar);

    public abstract void writeTree(JsonGenerator jsonGenerator, C1979c cVar) throws IOException, JsonProcessingException;
}
