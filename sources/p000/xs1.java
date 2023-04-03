package p000;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.ObjectReader;
import java.io.IOException;

/* renamed from: xs1 */
/* compiled from: EthSyncing */
public class xs1 extends ag5<C9610b> {

    /* renamed from: xs1$a */
    /* compiled from: EthSyncing */
    public static class C9609a extends o43<C9610b> {
        private ObjectReader objectReader = ef4.getObjectReader();

        public C9610b deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (jsonParser.mo13985v() != JsonToken.VALUE_FALSE) {
                return (C9610b) this.objectReader.readValue(jsonParser, C9611c.class);
            }
            C9610b bVar = new C9610b();
            bVar.setSyncing(jsonParser.mo13977m());
            return bVar;
        }
    }

    /* renamed from: xs1$b */
    /* compiled from: EthSyncing */
    public static class C9610b {
        private boolean isSyncing = true;

        public boolean isSyncing() {
            return this.isSyncing;
        }

        public void setSyncing(boolean z) {
            this.isSyncing = z;
        }
    }

    @JsonIgnoreProperties({"knownStates", "pulledStates"})
    /* renamed from: xs1$c */
    /* compiled from: EthSyncing */
    public static class C9611c extends C9610b {
        private String currentBlock;
        private String highestBlock;
        private String knownStates;
        private String pulledStates;
        private String startingBlock;

        public C9611c() {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9611c)) {
                return false;
            }
            C9611c cVar = (C9611c) obj;
            if (isSyncing() != cVar.isSyncing()) {
                return false;
            }
            if (getStartingBlock() == null ? cVar.getStartingBlock() != null : !getStartingBlock().equals(cVar.getStartingBlock())) {
                return false;
            }
            if (getCurrentBlock() == null ? cVar.getCurrentBlock() != null : !getCurrentBlock().equals(cVar.getCurrentBlock())) {
                return false;
            }
            if (getHighestBlock() == null ? cVar.getHighestBlock() != null : !getHighestBlock().equals(cVar.getHighestBlock())) {
                return false;
            }
            String str = this.knownStates;
            if (str == null ? cVar.knownStates != null : !str.equals(cVar.knownStates)) {
                return false;
            }
            String str2 = this.pulledStates;
            if (str2 != null) {
                return str2.equals(cVar.pulledStates);
            }
            if (cVar.pulledStates == null) {
                return true;
            }
            return false;
        }

        public String getCurrentBlock() {
            return this.currentBlock;
        }

        public String getHighestBlock() {
            return this.highestBlock;
        }

        public String getStartingBlock() {
            return this.startingBlock;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (getStartingBlock() != null) {
                i = getStartingBlock().hashCode();
            } else {
                i = 0;
            }
            int hashCode = ((i * 31) + yl0.hashCode(isSyncing())) * 31;
            if (getCurrentBlock() != null) {
                i2 = getCurrentBlock().hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (hashCode + i2) * 31;
            if (getHighestBlock() != null) {
                i3 = getHighestBlock().hashCode();
            } else {
                i3 = 0;
            }
            int i7 = (i6 + i3) * 31;
            String str = this.knownStates;
            if (str != null) {
                i4 = str.hashCode();
            } else {
                i4 = 0;
            }
            int i8 = (i7 + i4) * 31;
            String str2 = this.pulledStates;
            if (str2 != null) {
                i5 = str2.hashCode();
            }
            return i8 + i5;
        }

        public void setCurrentBlock(String str) {
            this.currentBlock = str;
        }

        public void setHighestBlock(String str) {
            this.highestBlock = str;
        }

        public void setStartingBlock(String str) {
            this.startingBlock = str;
        }

        public C9611c(String str, String str2, String str3, String str4, String str5) {
            this.startingBlock = str;
            this.currentBlock = str2;
            this.highestBlock = str3;
            this.knownStates = str4;
            this.pulledStates = str5;
        }
    }

    public boolean isSyncing() {
        return ((C9610b) getResult()).isSyncing();
    }

    @n43(using = C9609a.class)
    public void setResult(C9610b bVar) {
        super.setResult(bVar);
    }
}
