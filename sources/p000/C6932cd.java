package p000;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.ObjectReader;
import java.io.IOException;

/* renamed from: cd */
/* compiled from: AdminNodeInfo */
public class C6932cd extends ag5<C6933a> {

    /* renamed from: cd$a */
    /* compiled from: AdminNodeInfo */
    public static class C6933a {
        private String enode;

        /* renamed from: id */
        private String f37100id;

        /* renamed from: ip */
        private String f37101ip;
        private String listenAddr;
        private String name;

        public C6933a() {
        }

        public C6933a(String str, String str2, String str3, String str4, String str5) {
            this.enode = str;
            this.f37100id = str2;
            this.f37101ip = str3;
            this.listenAddr = str4;
            this.name = str5;
        }

        public String getEnode() {
            return this.enode;
        }

        public String getId() {
            return this.f37100id;
        }

        public String getIp() {
            return this.f37101ip;
        }

        public String getListenAddr() {
            return this.listenAddr;
        }

        public String getName() {
            return this.name;
        }
    }

    /* renamed from: cd$b */
    /* compiled from: AdminNodeInfo */
    public static class C6934b extends o43<C6933a> {
        private ObjectReader objectReader = ef4.getObjectReader();

        public C6933a deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (jsonParser.mo13985v() != JsonToken.VALUE_NULL) {
                return (C6933a) this.objectReader.readValue(jsonParser, C6933a.class);
            }
            return null;
        }
    }

    @n43(using = C6934b.class)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public void setResult(C6933a aVar) {
        super.setResult(aVar);
    }
}
