package p000;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.ObjectReader;
import java.io.IOException;
import java.util.List;

/* renamed from: dd */
/* compiled from: AdminPeers */
public class C6968dd extends ag5<List<Object>> {

    /* renamed from: dd$a */
    /* compiled from: AdminPeers */
    public static class C6969a extends o43<List<Object>> {
        private ObjectReader objectReader = ef4.getObjectReader();

        /* renamed from: dd$a$a */
        /* compiled from: AdminPeers */
        public class C6970a extends j17<List<Object>> {
            public C6970a() {
            }
        }

        public List<Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (jsonParser.mo13985v() != JsonToken.VALUE_NULL) {
                return (List) this.objectReader.readValue(jsonParser, new C6970a());
            }
            return null;
        }
    }

    @n43(using = C6969a.class)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public void setResult(List<Object> list) {
        super.setResult(list);
    }
}
