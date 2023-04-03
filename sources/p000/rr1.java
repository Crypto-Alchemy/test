package p000;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.ObjectReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: rr1 */
/* compiled from: EthBlock */
public class rr1 extends ag5<C9279a> {

    /* renamed from: rr1$a */
    /* compiled from: EthBlock */
    public static class C9279a {
        private String author;
        private String difficulty;
        private String extraData;
        private String gasLimit;
        private String gasUsed;
        private String hash;
        private String logsBloom;
        private String miner;
        private String mixHash;
        private String nonce;
        private String number;
        private String parentHash;
        private String receiptsRoot;
        private List<String> sealFields;
        private String sha3Uncles;
        private String size;
        private String stateRoot;
        private String timestamp;
        private String totalDifficulty;
        private List<C9284f> transactions;
        private String transactionsRoot;
        private List<String> uncles;

        public C9279a() {
        }

        public C9279a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, List<C9284f> list, List<String> list2, List<String> list3) {
            this.number = str;
            this.hash = str2;
            this.parentHash = str3;
            this.nonce = str4;
            this.sha3Uncles = str5;
            this.logsBloom = str6;
            this.transactionsRoot = str7;
            this.stateRoot = str8;
            this.receiptsRoot = str9;
            this.author = str10;
            this.miner = str11;
            this.mixHash = str12;
            this.difficulty = str13;
            this.totalDifficulty = str14;
            this.extraData = str15;
            this.size = str16;
            this.gasLimit = str17;
            this.gasUsed = str18;
            this.timestamp = str19;
            this.transactions = list;
            this.uncles = list2;
            this.sealFields = list3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9279a)) {
                return false;
            }
            C9279a aVar = (C9279a) obj;
            if (getNumberRaw() == null ? aVar.getNumberRaw() != null : !getNumberRaw().equals(aVar.getNumberRaw())) {
                return false;
            }
            if (getHash() == null ? aVar.getHash() != null : !getHash().equals(aVar.getHash())) {
                return false;
            }
            if (getParentHash() == null ? aVar.getParentHash() != null : !getParentHash().equals(aVar.getParentHash())) {
                return false;
            }
            if (getNonceRaw() == null ? aVar.getNonceRaw() != null : !getNonceRaw().equals(aVar.getNonceRaw())) {
                return false;
            }
            if (getSha3Uncles() == null ? aVar.getSha3Uncles() != null : !getSha3Uncles().equals(aVar.getSha3Uncles())) {
                return false;
            }
            if (getLogsBloom() == null ? aVar.getLogsBloom() != null : !getLogsBloom().equals(aVar.getLogsBloom())) {
                return false;
            }
            if (getTransactionsRoot() == null ? aVar.getTransactionsRoot() != null : !getTransactionsRoot().equals(aVar.getTransactionsRoot())) {
                return false;
            }
            if (getStateRoot() == null ? aVar.getStateRoot() != null : !getStateRoot().equals(aVar.getStateRoot())) {
                return false;
            }
            if (getReceiptsRoot() == null ? aVar.getReceiptsRoot() != null : !getReceiptsRoot().equals(aVar.getReceiptsRoot())) {
                return false;
            }
            if (getAuthor() == null ? aVar.getAuthor() != null : !getAuthor().equals(aVar.getAuthor())) {
                return false;
            }
            if (getMiner() == null ? aVar.getMiner() != null : !getMiner().equals(aVar.getMiner())) {
                return false;
            }
            if (getMixHash() == null ? aVar.getMixHash() != null : !getMixHash().equals(aVar.getMixHash())) {
                return false;
            }
            if (getDifficultyRaw() == null ? aVar.getDifficultyRaw() != null : !getDifficultyRaw().equals(aVar.getDifficultyRaw())) {
                return false;
            }
            if (getTotalDifficultyRaw() == null ? aVar.getTotalDifficultyRaw() != null : !getTotalDifficultyRaw().equals(aVar.getTotalDifficultyRaw())) {
                return false;
            }
            if (getExtraData() == null ? aVar.getExtraData() != null : !getExtraData().equals(aVar.getExtraData())) {
                return false;
            }
            if (getSizeRaw() == null ? aVar.getSizeRaw() != null : !getSizeRaw().equals(aVar.getSizeRaw())) {
                return false;
            }
            if (getGasLimitRaw() == null ? aVar.getGasLimitRaw() != null : !getGasLimitRaw().equals(aVar.getGasLimitRaw())) {
                return false;
            }
            if (getGasUsedRaw() == null ? aVar.getGasUsedRaw() != null : !getGasUsedRaw().equals(aVar.getGasUsedRaw())) {
                return false;
            }
            if (getTimestampRaw() == null ? aVar.getTimestampRaw() != null : !getTimestampRaw().equals(aVar.getTimestampRaw())) {
                return false;
            }
            if (getTransactions() == null ? aVar.getTransactions() != null : !getTransactions().equals(aVar.getTransactions())) {
                return false;
            }
            if (getUncles() == null ? aVar.getUncles() != null : !getUncles().equals(aVar.getUncles())) {
                return false;
            }
            if (getSealFields() != null) {
                return getSealFields().equals(aVar.getSealFields());
            }
            if (aVar.getSealFields() == null) {
                return true;
            }
            return false;
        }

        public String getAuthor() {
            return this.author;
        }

        public BigInteger getDifficulty() {
            return pc4.decodeQuantity(this.difficulty);
        }

        public String getDifficultyRaw() {
            return this.difficulty;
        }

        public String getExtraData() {
            return this.extraData;
        }

        public BigInteger getGasLimit() {
            return pc4.decodeQuantity(this.gasLimit);
        }

        public String getGasLimitRaw() {
            return this.gasLimit;
        }

        public BigInteger getGasUsed() {
            return pc4.decodeQuantity(this.gasUsed);
        }

        public String getGasUsedRaw() {
            return this.gasUsed;
        }

        public String getHash() {
            return this.hash;
        }

        public String getLogsBloom() {
            return this.logsBloom;
        }

        public String getMiner() {
            return this.miner;
        }

        public String getMixHash() {
            return this.mixHash;
        }

        public BigInteger getNonce() {
            return pc4.decodeQuantity(this.nonce);
        }

        public String getNonceRaw() {
            return this.nonce;
        }

        public BigInteger getNumber() {
            return pc4.decodeQuantity(this.number);
        }

        public String getNumberRaw() {
            return this.number;
        }

        public String getParentHash() {
            return this.parentHash;
        }

        public String getReceiptsRoot() {
            return this.receiptsRoot;
        }

        public List<String> getSealFields() {
            return this.sealFields;
        }

        public String getSha3Uncles() {
            return this.sha3Uncles;
        }

        public BigInteger getSize() {
            String str = this.size;
            if (str != null) {
                return pc4.decodeQuantity(str);
            }
            return BigInteger.ZERO;
        }

        public String getSizeRaw() {
            return this.size;
        }

        public String getStateRoot() {
            return this.stateRoot;
        }

        public BigInteger getTimestamp() {
            return pc4.decodeQuantity(this.timestamp);
        }

        public String getTimestampRaw() {
            return this.timestamp;
        }

        public BigInteger getTotalDifficulty() {
            return pc4.decodeQuantity(this.totalDifficulty);
        }

        public String getTotalDifficultyRaw() {
            return this.totalDifficulty;
        }

        public List<C9284f> getTransactions() {
            return this.transactions;
        }

        public String getTransactionsRoot() {
            return this.transactionsRoot;
        }

        public List<String> getUncles() {
            return this.uncles;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            int i20;
            int i21;
            int i22 = 0;
            if (getNumberRaw() != null) {
                i = getNumberRaw().hashCode();
            } else {
                i = 0;
            }
            int i23 = i * 31;
            if (getHash() != null) {
                i2 = getHash().hashCode();
            } else {
                i2 = 0;
            }
            int i24 = (i23 + i2) * 31;
            if (getParentHash() != null) {
                i3 = getParentHash().hashCode();
            } else {
                i3 = 0;
            }
            int i25 = (i24 + i3) * 31;
            if (getNonceRaw() != null) {
                i4 = getNonceRaw().hashCode();
            } else {
                i4 = 0;
            }
            int i26 = (i25 + i4) * 31;
            if (getSha3Uncles() != null) {
                i5 = getSha3Uncles().hashCode();
            } else {
                i5 = 0;
            }
            int i27 = (i26 + i5) * 31;
            if (getLogsBloom() != null) {
                i6 = getLogsBloom().hashCode();
            } else {
                i6 = 0;
            }
            int i28 = (i27 + i6) * 31;
            if (getTransactionsRoot() != null) {
                i7 = getTransactionsRoot().hashCode();
            } else {
                i7 = 0;
            }
            int i29 = (i28 + i7) * 31;
            if (getStateRoot() != null) {
                i8 = getStateRoot().hashCode();
            } else {
                i8 = 0;
            }
            int i30 = (i29 + i8) * 31;
            if (getReceiptsRoot() != null) {
                i9 = getReceiptsRoot().hashCode();
            } else {
                i9 = 0;
            }
            int i31 = (i30 + i9) * 31;
            if (getAuthor() != null) {
                i10 = getAuthor().hashCode();
            } else {
                i10 = 0;
            }
            int i32 = (i31 + i10) * 31;
            if (getMiner() != null) {
                i11 = getMiner().hashCode();
            } else {
                i11 = 0;
            }
            int i33 = (i32 + i11) * 31;
            if (getMixHash() != null) {
                i12 = getMixHash().hashCode();
            } else {
                i12 = 0;
            }
            int i34 = (i33 + i12) * 31;
            if (getDifficultyRaw() != null) {
                i13 = getDifficultyRaw().hashCode();
            } else {
                i13 = 0;
            }
            int i35 = (i34 + i13) * 31;
            if (getTotalDifficultyRaw() != null) {
                i14 = getTotalDifficultyRaw().hashCode();
            } else {
                i14 = 0;
            }
            int i36 = (i35 + i14) * 31;
            if (getExtraData() != null) {
                i15 = getExtraData().hashCode();
            } else {
                i15 = 0;
            }
            int i37 = (i36 + i15) * 31;
            if (getSizeRaw() != null) {
                i16 = getSizeRaw().hashCode();
            } else {
                i16 = 0;
            }
            int i38 = (i37 + i16) * 31;
            if (getGasLimitRaw() != null) {
                i17 = getGasLimitRaw().hashCode();
            } else {
                i17 = 0;
            }
            int i39 = (i38 + i17) * 31;
            if (getGasUsedRaw() != null) {
                i18 = getGasUsedRaw().hashCode();
            } else {
                i18 = 0;
            }
            int i40 = (i39 + i18) * 31;
            if (getTimestampRaw() != null) {
                i19 = getTimestampRaw().hashCode();
            } else {
                i19 = 0;
            }
            int i41 = (i40 + i19) * 31;
            if (getTransactions() != null) {
                i20 = getTransactions().hashCode();
            } else {
                i20 = 0;
            }
            int i42 = (i41 + i20) * 31;
            if (getUncles() != null) {
                i21 = getUncles().hashCode();
            } else {
                i21 = 0;
            }
            int i43 = (i42 + i21) * 31;
            if (getSealFields() != null) {
                i22 = getSealFields().hashCode();
            }
            return i43 + i22;
        }

        public void setAuthor(String str) {
            this.author = str;
        }

        public void setDifficulty(String str) {
            this.difficulty = str;
        }

        public void setExtraData(String str) {
            this.extraData = str;
        }

        public void setGasLimit(String str) {
            this.gasLimit = str;
        }

        public void setGasUsed(String str) {
            this.gasUsed = str;
        }

        public void setHash(String str) {
            this.hash = str;
        }

        public void setLogsBloom(String str) {
            this.logsBloom = str;
        }

        public void setMiner(String str) {
            this.miner = str;
        }

        public void setMixHash(String str) {
            this.mixHash = str;
        }

        public void setNonce(String str) {
            this.nonce = str;
        }

        public void setNumber(String str) {
            this.number = str;
        }

        public void setParentHash(String str) {
            this.parentHash = str;
        }

        public void setReceiptsRoot(String str) {
            this.receiptsRoot = str;
        }

        public void setSealFields(List<String> list) {
            this.sealFields = list;
        }

        public void setSha3Uncles(String str) {
            this.sha3Uncles = str;
        }

        public void setSize(String str) {
            this.size = str;
        }

        public void setStateRoot(String str) {
            this.stateRoot = str;
        }

        public void setTimestamp(String str) {
            this.timestamp = str;
        }

        public void setTotalDifficulty(String str) {
            this.totalDifficulty = str;
        }

        @n43(using = C9281c.class)
        public void setTransactions(List<C9284f> list) {
            this.transactions = list;
        }

        public void setTransactionsRoot(String str) {
            this.transactionsRoot = str;
        }

        public void setUncles(List<String> list) {
            this.uncles = list;
        }
    }

    /* renamed from: rr1$b */
    /* compiled from: EthBlock */
    public static class C9280b extends o43<C9279a> {
        private ObjectReader objectReader = ef4.getObjectReader();

        public C9279a deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (jsonParser.mo13985v() != JsonToken.VALUE_NULL) {
                return (C9279a) this.objectReader.readValue(jsonParser, C9279a.class);
            }
            return null;
        }
    }

    /* renamed from: rr1$c */
    /* compiled from: EthBlock */
    public static class C9281c extends o43<List<C9284f>> {
        private ObjectReader objectReader = ef4.getObjectReader();

        public List<C9284f> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            ArrayList arrayList = new ArrayList();
            JsonToken N0 = jsonParser.mo13938N0();
            if (N0 == JsonToken.START_OBJECT) {
                Iterator<C9283e> readValues = this.objectReader.readValues(jsonParser, C9283e.class);
                while (readValues.hasNext()) {
                    arrayList.add(readValues.next());
                }
            } else if (N0 == JsonToken.VALUE_STRING) {
                jsonParser.mo13974k0();
                Iterator<C9282d> readValues2 = this.objectReader.readValues(jsonParser, C9282d.class);
                while (readValues2.hasNext()) {
                    arrayList.add(readValues2.next());
                }
            }
            return arrayList;
        }
    }

    /* renamed from: rr1$d */
    /* compiled from: EthBlock */
    public static class C9282d implements C9284f<String> {
        private String value;

        public C9282d() {
        }

        public C9282d(String str) {
            this.value = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9282d)) {
                return false;
            }
            String str = this.value;
            String str2 = ((C9282d) obj).value;
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

    /* renamed from: rr1$e */
    /* compiled from: EthBlock */
    public static class C9283e extends pt6 implements C9284f<pt6> {
        public C9283e() {
        }

        public pt6 get() {
            return this;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C9283e(java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, int r37) {
            /*
                r20 = this;
                r0 = r20
                r1 = r21
                r2 = r22
                r3 = r23
                r4 = r24
                r5 = r25
                r6 = r26
                r7 = r27
                r8 = r28
                r10 = r29
                r9 = r30
                r11 = r31
                r12 = r32
                r13 = r33
                r14 = r34
                r15 = r35
                r16 = r36
                r19 = r0
                r0 = r37
                long r0 = (long) r0
                r17 = r0
                r1 = r21
                r0 = r19
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.rr1.C9283e.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void");
        }
    }

    /* renamed from: rr1$f */
    /* compiled from: EthBlock */
    public interface C9284f<T> {
        T get();
    }

    public C9279a getBlock() {
        return (C9279a) getResult();
    }

    @n43(using = C9280b.class)
    public void setResult(C9279a aVar) {
        super.setResult(aVar);
    }
}
