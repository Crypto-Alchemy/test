package p000;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.ObjectReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: ps1 */
/* compiled from: EthLog */
public class ps1 extends ag5<List<C9191c>> {

    /* renamed from: ps1$a */
    /* compiled from: EthLog */
    public static class C9189a implements C9191c<String> {
        private String value;

        public C9189a() {
        }

        public C9189a(String str) {
            this.value = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9189a)) {
                return false;
            }
            String str = this.value;
            String str2 = ((C9189a) obj).value;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.value;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public void setValue(String str) {
            this.value = str;
        }

        public String get() {
            return this.value;
        }
    }

    /* renamed from: ps1$b */
    /* compiled from: EthLog */
    public static class C9190b extends hk3 implements C9191c<hk3> {
        public C9190b() {
        }

        public hk3 get() {
            return this;
        }

        public C9190b(boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List<String> list) {
            super(z, str, str2, str3, str4, str5, str6, str7, str8, list);
        }
    }

    /* renamed from: ps1$c */
    /* compiled from: EthLog */
    public interface C9191c<T> {
        T get();
    }

    /* renamed from: ps1$d */
    /* compiled from: EthLog */
    public static class C9192d extends o43<List<C9191c>> {
        private ObjectReader objectReader = ef4.getObjectReader();

        public List<C9191c> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            ArrayList arrayList = new ArrayList();
            JsonToken N0 = jsonParser.mo13938N0();
            if (N0 == JsonToken.START_OBJECT) {
                Iterator<C9190b> readValues = this.objectReader.readValues(jsonParser, C9190b.class);
                while (readValues.hasNext()) {
                    arrayList.add(readValues.next());
                }
            } else if (N0 == JsonToken.VALUE_STRING) {
                jsonParser.mo13974k0();
                Iterator<C9189a> readValues2 = this.objectReader.readValues(jsonParser, C9189a.class);
                while (readValues2.hasNext()) {
                    arrayList.add(readValues2.next());
                }
            }
            return arrayList;
        }
    }

    public List<C9191c> getLogs() {
        return (List) getResult();
    }

    @n43(using = C9192d.class)
    public void setResult(List<C9191c> list) {
        super.setResult(list);
    }
}
