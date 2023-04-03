package wallet.core.jni.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.C4949a;
import com.google.protobuf.C4956c0;
import com.google.protobuf.C4969g;
import com.google.protobuf.C4987l;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Nebulas {

    /* renamed from: wallet.core.jni.proto.Nebulas$1 */
    public static /* synthetic */ class C97551 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f46571xa1df5c61;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f46571xa1df5c61 = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f46571xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f46571xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f46571xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f46571xa1df5c61     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f46571xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f46571xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wallet.core.jni.proto.Nebulas.C97551.<clinit>():void");
        }
    }

    public static final class Data extends GeneratedMessageLite<Data, Builder> implements DataOrBuilder {
        /* access modifiers changed from: private */
        public static final Data DEFAULT_INSTANCE;
        private static volatile im4<Data> PARSER = null;
        public static final int PAYLOAD_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private ByteString payload_ = ByteString.EMPTY;
        private String type_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<Data, Builder> implements DataOrBuilder {
            public /* synthetic */ Builder(C97551 r1) {
                this();
            }

            public Builder clearPayload() {
                copyOnWrite();
                ((Data) this.instance).clearPayload();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((Data) this.instance).clearType();
                return this;
            }

            public ByteString getPayload() {
                return ((Data) this.instance).getPayload();
            }

            public String getType() {
                return ((Data) this.instance).getType();
            }

            public ByteString getTypeBytes() {
                return ((Data) this.instance).getTypeBytes();
            }

            public Builder setPayload(ByteString byteString) {
                copyOnWrite();
                ((Data) this.instance).setPayload(byteString);
                return this;
            }

            public Builder setType(String str) {
                copyOnWrite();
                ((Data) this.instance).setType(str);
                return this;
            }

            public Builder setTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((Data) this.instance).setTypeBytes(byteString);
                return this;
            }

            private Builder() {
                super(Data.DEFAULT_INSTANCE);
            }
        }

        static {
            Data data = new Data();
            DEFAULT_INSTANCE = data;
            GeneratedMessageLite.registerDefaultInstance(Data.class, data);
        }

        private Data() {
        }

        /* access modifiers changed from: private */
        public void clearPayload() {
            this.payload_ = getDefaultInstance().getPayload();
        }

        /* access modifiers changed from: private */
        public void clearType() {
            this.type_ = getDefaultInstance().getType();
        }

        public static Data getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Data parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Data) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Data parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<Data> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setPayload(ByteString byteString) {
            byteString.getClass();
            this.payload_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setType(String str) {
            str.getClass();
            this.type_ = str;
        }

        /* access modifiers changed from: private */
        public void setTypeBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.type_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97551.f46571xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Data();
                case 2:
                    return new Builder((C97551) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"type_", "payload_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<Data> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (Data.class) {
                            im4 = PARSER;
                            if (im4 == null) {
                                im4 = new GeneratedMessageLite.C4931b<>(DEFAULT_INSTANCE);
                                PARSER = im4;
                            }
                        }
                    }
                    return im4;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public ByteString getPayload() {
            return this.payload_;
        }

        public String getType() {
            return this.type_;
        }

        public ByteString getTypeBytes() {
            return ByteString.copyFromUtf8(this.type_);
        }

        public static Builder newBuilder(Data data) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(data);
        }

        public static Data parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Data) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Data parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static Data parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Data parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static Data parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Data parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static Data parseFrom(InputStream inputStream) throws IOException {
            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Data parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Data parseFrom(C4969g gVar) throws IOException {
            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static Data parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface DataOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        ByteString getPayload();

        String getType();

        ByteString getTypeBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class RawTransaction extends GeneratedMessageLite<RawTransaction, Builder> implements RawTransactionOrBuilder {
        public static final int ALG_FIELD_NUMBER = 11;
        public static final int CHAIN_ID_FIELD_NUMBER = 8;
        public static final int DATA_FIELD_NUMBER = 7;
        /* access modifiers changed from: private */
        public static final RawTransaction DEFAULT_INSTANCE;
        public static final int FROM_FIELD_NUMBER = 2;
        public static final int GAS_LIMIT_FIELD_NUMBER = 10;
        public static final int GAS_PRICE_FIELD_NUMBER = 9;
        public static final int HASH_FIELD_NUMBER = 1;
        public static final int NONCE_FIELD_NUMBER = 5;
        private static volatile im4<RawTransaction> PARSER = null;
        public static final int SIGN_FIELD_NUMBER = 12;
        public static final int TIMESTAMP_FIELD_NUMBER = 6;
        public static final int TO_FIELD_NUMBER = 3;
        public static final int VALUE_FIELD_NUMBER = 4;
        private int alg_;
        private int chainId_;
        private Data data_;
        private ByteString from_;
        private ByteString gasLimit_;
        private ByteString gasPrice_;
        private ByteString hash_;
        private long nonce_;
        private ByteString sign_;
        private long timestamp_;
        private ByteString to_;
        private ByteString value_;

        public static final class Builder extends GeneratedMessageLite.C4930a<RawTransaction, Builder> implements RawTransactionOrBuilder {
            public /* synthetic */ Builder(C97551 r1) {
                this();
            }

            public Builder clearAlg() {
                copyOnWrite();
                ((RawTransaction) this.instance).clearAlg();
                return this;
            }

            public Builder clearChainId() {
                copyOnWrite();
                ((RawTransaction) this.instance).clearChainId();
                return this;
            }

            public Builder clearData() {
                copyOnWrite();
                ((RawTransaction) this.instance).clearData();
                return this;
            }

            public Builder clearFrom() {
                copyOnWrite();
                ((RawTransaction) this.instance).clearFrom();
                return this;
            }

            public Builder clearGasLimit() {
                copyOnWrite();
                ((RawTransaction) this.instance).clearGasLimit();
                return this;
            }

            public Builder clearGasPrice() {
                copyOnWrite();
                ((RawTransaction) this.instance).clearGasPrice();
                return this;
            }

            public Builder clearHash() {
                copyOnWrite();
                ((RawTransaction) this.instance).clearHash();
                return this;
            }

            public Builder clearNonce() {
                copyOnWrite();
                ((RawTransaction) this.instance).clearNonce();
                return this;
            }

            public Builder clearSign() {
                copyOnWrite();
                ((RawTransaction) this.instance).clearSign();
                return this;
            }

            public Builder clearTimestamp() {
                copyOnWrite();
                ((RawTransaction) this.instance).clearTimestamp();
                return this;
            }

            public Builder clearTo() {
                copyOnWrite();
                ((RawTransaction) this.instance).clearTo();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((RawTransaction) this.instance).clearValue();
                return this;
            }

            public int getAlg() {
                return ((RawTransaction) this.instance).getAlg();
            }

            public int getChainId() {
                return ((RawTransaction) this.instance).getChainId();
            }

            public Data getData() {
                return ((RawTransaction) this.instance).getData();
            }

            public ByteString getFrom() {
                return ((RawTransaction) this.instance).getFrom();
            }

            public ByteString getGasLimit() {
                return ((RawTransaction) this.instance).getGasLimit();
            }

            public ByteString getGasPrice() {
                return ((RawTransaction) this.instance).getGasPrice();
            }

            public ByteString getHash() {
                return ((RawTransaction) this.instance).getHash();
            }

            public long getNonce() {
                return ((RawTransaction) this.instance).getNonce();
            }

            public ByteString getSign() {
                return ((RawTransaction) this.instance).getSign();
            }

            public long getTimestamp() {
                return ((RawTransaction) this.instance).getTimestamp();
            }

            public ByteString getTo() {
                return ((RawTransaction) this.instance).getTo();
            }

            public ByteString getValue() {
                return ((RawTransaction) this.instance).getValue();
            }

            public boolean hasData() {
                return ((RawTransaction) this.instance).hasData();
            }

            public Builder mergeData(Data data) {
                copyOnWrite();
                ((RawTransaction) this.instance).mergeData(data);
                return this;
            }

            public Builder setAlg(int i) {
                copyOnWrite();
                ((RawTransaction) this.instance).setAlg(i);
                return this;
            }

            public Builder setChainId(int i) {
                copyOnWrite();
                ((RawTransaction) this.instance).setChainId(i);
                return this;
            }

            public Builder setData(Data data) {
                copyOnWrite();
                ((RawTransaction) this.instance).setData(data);
                return this;
            }

            public Builder setFrom(ByteString byteString) {
                copyOnWrite();
                ((RawTransaction) this.instance).setFrom(byteString);
                return this;
            }

            public Builder setGasLimit(ByteString byteString) {
                copyOnWrite();
                ((RawTransaction) this.instance).setGasLimit(byteString);
                return this;
            }

            public Builder setGasPrice(ByteString byteString) {
                copyOnWrite();
                ((RawTransaction) this.instance).setGasPrice(byteString);
                return this;
            }

            public Builder setHash(ByteString byteString) {
                copyOnWrite();
                ((RawTransaction) this.instance).setHash(byteString);
                return this;
            }

            public Builder setNonce(long j) {
                copyOnWrite();
                ((RawTransaction) this.instance).setNonce(j);
                return this;
            }

            public Builder setSign(ByteString byteString) {
                copyOnWrite();
                ((RawTransaction) this.instance).setSign(byteString);
                return this;
            }

            public Builder setTimestamp(long j) {
                copyOnWrite();
                ((RawTransaction) this.instance).setTimestamp(j);
                return this;
            }

            public Builder setTo(ByteString byteString) {
                copyOnWrite();
                ((RawTransaction) this.instance).setTo(byteString);
                return this;
            }

            public Builder setValue(ByteString byteString) {
                copyOnWrite();
                ((RawTransaction) this.instance).setValue(byteString);
                return this;
            }

            private Builder() {
                super(RawTransaction.DEFAULT_INSTANCE);
            }

            public Builder setData(Data.Builder builder) {
                copyOnWrite();
                ((RawTransaction) this.instance).setData((Data) builder.build());
                return this;
            }
        }

        static {
            RawTransaction rawTransaction = new RawTransaction();
            DEFAULT_INSTANCE = rawTransaction;
            GeneratedMessageLite.registerDefaultInstance(RawTransaction.class, rawTransaction);
        }

        private RawTransaction() {
            ByteString byteString = ByteString.EMPTY;
            this.hash_ = byteString;
            this.from_ = byteString;
            this.to_ = byteString;
            this.value_ = byteString;
            this.gasPrice_ = byteString;
            this.gasLimit_ = byteString;
            this.sign_ = byteString;
        }

        /* access modifiers changed from: private */
        public void clearAlg() {
            this.alg_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearChainId() {
            this.chainId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearData() {
            this.data_ = null;
        }

        /* access modifiers changed from: private */
        public void clearFrom() {
            this.from_ = getDefaultInstance().getFrom();
        }

        /* access modifiers changed from: private */
        public void clearGasLimit() {
            this.gasLimit_ = getDefaultInstance().getGasLimit();
        }

        /* access modifiers changed from: private */
        public void clearGasPrice() {
            this.gasPrice_ = getDefaultInstance().getGasPrice();
        }

        /* access modifiers changed from: private */
        public void clearHash() {
            this.hash_ = getDefaultInstance().getHash();
        }

        /* access modifiers changed from: private */
        public void clearNonce() {
            this.nonce_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSign() {
            this.sign_ = getDefaultInstance().getSign();
        }

        /* access modifiers changed from: private */
        public void clearTimestamp() {
            this.timestamp_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTo() {
            this.to_ = getDefaultInstance().getTo();
        }

        /* access modifiers changed from: private */
        public void clearValue() {
            this.value_ = getDefaultInstance().getValue();
        }

        public static RawTransaction getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeData(Data data) {
            data.getClass();
            Data data2 = this.data_;
            if (data2 == null || data2 == Data.getDefaultInstance()) {
                this.data_ = data;
            } else {
                this.data_ = (Data) ((Data.Builder) Data.newBuilder(this.data_).mergeFrom(data)).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static RawTransaction parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RawTransaction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RawTransaction parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (RawTransaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<RawTransaction> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAlg(int i) {
            this.alg_ = i;
        }

        /* access modifiers changed from: private */
        public void setChainId(int i) {
            this.chainId_ = i;
        }

        /* access modifiers changed from: private */
        public void setData(Data data) {
            data.getClass();
            this.data_ = data;
        }

        /* access modifiers changed from: private */
        public void setFrom(ByteString byteString) {
            byteString.getClass();
            this.from_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setGasLimit(ByteString byteString) {
            byteString.getClass();
            this.gasLimit_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setGasPrice(ByteString byteString) {
            byteString.getClass();
            this.gasPrice_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setHash(ByteString byteString) {
            byteString.getClass();
            this.hash_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setNonce(long j) {
            this.nonce_ = j;
        }

        /* access modifiers changed from: private */
        public void setSign(ByteString byteString) {
            byteString.getClass();
            this.sign_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setTimestamp(long j) {
            this.timestamp_ = j;
        }

        /* access modifiers changed from: private */
        public void setTo(ByteString byteString) {
            byteString.getClass();
            this.to_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setValue(ByteString byteString) {
            byteString.getClass();
            this.value_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97551.f46571xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new RawTransaction();
                case 2:
                    return new Builder((C97551) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\f\f\u0000\u0000\u0000\u0001\n\u0002\n\u0003\n\u0004\n\u0005\u0003\u0006\u0002\u0007\t\b\u000b\t\n\n\n\u000b\u000b\f\n", new Object[]{"hash_", "from_", "to_", "value_", "nonce_", "timestamp_", "data_", "chainId_", "gasPrice_", "gasLimit_", "alg_", "sign_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<RawTransaction> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (RawTransaction.class) {
                            im4 = PARSER;
                            if (im4 == null) {
                                im4 = new GeneratedMessageLite.C4931b<>(DEFAULT_INSTANCE);
                                PARSER = im4;
                            }
                        }
                    }
                    return im4;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public int getAlg() {
            return this.alg_;
        }

        public int getChainId() {
            return this.chainId_;
        }

        public Data getData() {
            Data data = this.data_;
            if (data == null) {
                return Data.getDefaultInstance();
            }
            return data;
        }

        public ByteString getFrom() {
            return this.from_;
        }

        public ByteString getGasLimit() {
            return this.gasLimit_;
        }

        public ByteString getGasPrice() {
            return this.gasPrice_;
        }

        public ByteString getHash() {
            return this.hash_;
        }

        public long getNonce() {
            return this.nonce_;
        }

        public ByteString getSign() {
            return this.sign_;
        }

        public long getTimestamp() {
            return this.timestamp_;
        }

        public ByteString getTo() {
            return this.to_;
        }

        public ByteString getValue() {
            return this.value_;
        }

        public boolean hasData() {
            if (this.data_ != null) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(RawTransaction rawTransaction) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(rawTransaction);
        }

        public static RawTransaction parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (RawTransaction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static RawTransaction parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (RawTransaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static RawTransaction parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (RawTransaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RawTransaction parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (RawTransaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static RawTransaction parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (RawTransaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RawTransaction parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (RawTransaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static RawTransaction parseFrom(InputStream inputStream) throws IOException {
            return (RawTransaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RawTransaction parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (RawTransaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static RawTransaction parseFrom(C4969g gVar) throws IOException {
            return (RawTransaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static RawTransaction parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (RawTransaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface RawTransactionOrBuilder extends qu3 {
        int getAlg();

        int getChainId();

        Data getData();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        ByteString getFrom();

        ByteString getGasLimit();

        ByteString getGasPrice();

        ByteString getHash();

        long getNonce();

        ByteString getSign();

        long getTimestamp();

        ByteString getTo();

        ByteString getValue();

        boolean hasData();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SigningInput extends GeneratedMessageLite<SigningInput, Builder> implements SigningInputOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 7;
        public static final int CHAIN_ID_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final SigningInput DEFAULT_INSTANCE;
        public static final int FROM_ADDRESS_FIELD_NUMBER = 1;
        public static final int GAS_LIMIT_FIELD_NUMBER = 5;
        public static final int GAS_PRICE_FIELD_NUMBER = 4;
        public static final int NONCE_FIELD_NUMBER = 3;
        private static volatile im4<SigningInput> PARSER = null;
        public static final int PAYLOAD_FIELD_NUMBER = 9;
        public static final int PRIVATE_KEY_FIELD_NUMBER = 10;
        public static final int TIMESTAMP_FIELD_NUMBER = 8;
        public static final int TO_ADDRESS_FIELD_NUMBER = 6;
        private ByteString amount_;
        private ByteString chainId_;
        private String fromAddress_ = "";
        private ByteString gasLimit_;
        private ByteString gasPrice_;
        private ByteString nonce_;
        private String payload_;
        private ByteString privateKey_;
        private ByteString timestamp_;
        private String toAddress_;

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningInput, Builder> implements SigningInputOrBuilder {
            public /* synthetic */ Builder(C97551 r1) {
                this();
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((SigningInput) this.instance).clearAmount();
                return this;
            }

            public Builder clearChainId() {
                copyOnWrite();
                ((SigningInput) this.instance).clearChainId();
                return this;
            }

            public Builder clearFromAddress() {
                copyOnWrite();
                ((SigningInput) this.instance).clearFromAddress();
                return this;
            }

            public Builder clearGasLimit() {
                copyOnWrite();
                ((SigningInput) this.instance).clearGasLimit();
                return this;
            }

            public Builder clearGasPrice() {
                copyOnWrite();
                ((SigningInput) this.instance).clearGasPrice();
                return this;
            }

            public Builder clearNonce() {
                copyOnWrite();
                ((SigningInput) this.instance).clearNonce();
                return this;
            }

            public Builder clearPayload() {
                copyOnWrite();
                ((SigningInput) this.instance).clearPayload();
                return this;
            }

            public Builder clearPrivateKey() {
                copyOnWrite();
                ((SigningInput) this.instance).clearPrivateKey();
                return this;
            }

            public Builder clearTimestamp() {
                copyOnWrite();
                ((SigningInput) this.instance).clearTimestamp();
                return this;
            }

            public Builder clearToAddress() {
                copyOnWrite();
                ((SigningInput) this.instance).clearToAddress();
                return this;
            }

            public ByteString getAmount() {
                return ((SigningInput) this.instance).getAmount();
            }

            public ByteString getChainId() {
                return ((SigningInput) this.instance).getChainId();
            }

            public String getFromAddress() {
                return ((SigningInput) this.instance).getFromAddress();
            }

            public ByteString getFromAddressBytes() {
                return ((SigningInput) this.instance).getFromAddressBytes();
            }

            public ByteString getGasLimit() {
                return ((SigningInput) this.instance).getGasLimit();
            }

            public ByteString getGasPrice() {
                return ((SigningInput) this.instance).getGasPrice();
            }

            public ByteString getNonce() {
                return ((SigningInput) this.instance).getNonce();
            }

            public String getPayload() {
                return ((SigningInput) this.instance).getPayload();
            }

            public ByteString getPayloadBytes() {
                return ((SigningInput) this.instance).getPayloadBytes();
            }

            public ByteString getPrivateKey() {
                return ((SigningInput) this.instance).getPrivateKey();
            }

            public ByteString getTimestamp() {
                return ((SigningInput) this.instance).getTimestamp();
            }

            public String getToAddress() {
                return ((SigningInput) this.instance).getToAddress();
            }

            public ByteString getToAddressBytes() {
                return ((SigningInput) this.instance).getToAddressBytes();
            }

            public Builder setAmount(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setAmount(byteString);
                return this;
            }

            public Builder setChainId(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setChainId(byteString);
                return this;
            }

            public Builder setFromAddress(String str) {
                copyOnWrite();
                ((SigningInput) this.instance).setFromAddress(str);
                return this;
            }

            public Builder setFromAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setFromAddressBytes(byteString);
                return this;
            }

            public Builder setGasLimit(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setGasLimit(byteString);
                return this;
            }

            public Builder setGasPrice(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setGasPrice(byteString);
                return this;
            }

            public Builder setNonce(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setNonce(byteString);
                return this;
            }

            public Builder setPayload(String str) {
                copyOnWrite();
                ((SigningInput) this.instance).setPayload(str);
                return this;
            }

            public Builder setPayloadBytes(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setPayloadBytes(byteString);
                return this;
            }

            public Builder setPrivateKey(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setPrivateKey(byteString);
                return this;
            }

            public Builder setTimestamp(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setTimestamp(byteString);
                return this;
            }

            public Builder setToAddress(String str) {
                copyOnWrite();
                ((SigningInput) this.instance).setToAddress(str);
                return this;
            }

            public Builder setToAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setToAddressBytes(byteString);
                return this;
            }

            private Builder() {
                super(SigningInput.DEFAULT_INSTANCE);
            }
        }

        static {
            SigningInput signingInput = new SigningInput();
            DEFAULT_INSTANCE = signingInput;
            GeneratedMessageLite.registerDefaultInstance(SigningInput.class, signingInput);
        }

        private SigningInput() {
            ByteString byteString = ByteString.EMPTY;
            this.chainId_ = byteString;
            this.nonce_ = byteString;
            this.gasPrice_ = byteString;
            this.gasLimit_ = byteString;
            this.toAddress_ = "";
            this.amount_ = byteString;
            this.timestamp_ = byteString;
            this.payload_ = "";
            this.privateKey_ = byteString;
        }

        /* access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = getDefaultInstance().getAmount();
        }

        /* access modifiers changed from: private */
        public void clearChainId() {
            this.chainId_ = getDefaultInstance().getChainId();
        }

        /* access modifiers changed from: private */
        public void clearFromAddress() {
            this.fromAddress_ = getDefaultInstance().getFromAddress();
        }

        /* access modifiers changed from: private */
        public void clearGasLimit() {
            this.gasLimit_ = getDefaultInstance().getGasLimit();
        }

        /* access modifiers changed from: private */
        public void clearGasPrice() {
            this.gasPrice_ = getDefaultInstance().getGasPrice();
        }

        /* access modifiers changed from: private */
        public void clearNonce() {
            this.nonce_ = getDefaultInstance().getNonce();
        }

        /* access modifiers changed from: private */
        public void clearPayload() {
            this.payload_ = getDefaultInstance().getPayload();
        }

        /* access modifiers changed from: private */
        public void clearPrivateKey() {
            this.privateKey_ = getDefaultInstance().getPrivateKey();
        }

        /* access modifiers changed from: private */
        public void clearTimestamp() {
            this.timestamp_ = getDefaultInstance().getTimestamp();
        }

        /* access modifiers changed from: private */
        public void clearToAddress() {
            this.toAddress_ = getDefaultInstance().getToAddress();
        }

        public static SigningInput getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static SigningInput parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SigningInput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SigningInput parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SigningInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<SigningInput> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAmount(ByteString byteString) {
            byteString.getClass();
            this.amount_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setChainId(ByteString byteString) {
            byteString.getClass();
            this.chainId_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setFromAddress(String str) {
            str.getClass();
            this.fromAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setFromAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.fromAddress_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setGasLimit(ByteString byteString) {
            byteString.getClass();
            this.gasLimit_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setGasPrice(ByteString byteString) {
            byteString.getClass();
            this.gasPrice_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setNonce(ByteString byteString) {
            byteString.getClass();
            this.nonce_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setPayload(String str) {
            str.getClass();
            this.payload_ = str;
        }

        /* access modifiers changed from: private */
        public void setPayloadBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.payload_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setPrivateKey(ByteString byteString) {
            byteString.getClass();
            this.privateKey_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setTimestamp(ByteString byteString) {
            byteString.getClass();
            this.timestamp_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setToAddress(String str) {
            str.getClass();
            this.toAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setToAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.toAddress_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97551.f46571xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningInput();
                case 2:
                    return new Builder((C97551) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\n\u0004\n\u0005\n\u0006Ȉ\u0007\n\b\n\tȈ\n\n", new Object[]{"fromAddress_", "chainId_", "nonce_", "gasPrice_", "gasLimit_", "toAddress_", "amount_", "timestamp_", "payload_", "privateKey_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<SigningInput> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (SigningInput.class) {
                            im4 = PARSER;
                            if (im4 == null) {
                                im4 = new GeneratedMessageLite.C4931b<>(DEFAULT_INSTANCE);
                                PARSER = im4;
                            }
                        }
                    }
                    return im4;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public ByteString getAmount() {
            return this.amount_;
        }

        public ByteString getChainId() {
            return this.chainId_;
        }

        public String getFromAddress() {
            return this.fromAddress_;
        }

        public ByteString getFromAddressBytes() {
            return ByteString.copyFromUtf8(this.fromAddress_);
        }

        public ByteString getGasLimit() {
            return this.gasLimit_;
        }

        public ByteString getGasPrice() {
            return this.gasPrice_;
        }

        public ByteString getNonce() {
            return this.nonce_;
        }

        public String getPayload() {
            return this.payload_;
        }

        public ByteString getPayloadBytes() {
            return ByteString.copyFromUtf8(this.payload_);
        }

        public ByteString getPrivateKey() {
            return this.privateKey_;
        }

        public ByteString getTimestamp() {
            return this.timestamp_;
        }

        public String getToAddress() {
            return this.toAddress_;
        }

        public ByteString getToAddressBytes() {
            return ByteString.copyFromUtf8(this.toAddress_);
        }

        public static Builder newBuilder(SigningInput signingInput) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(signingInput);
        }

        public static SigningInput parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (SigningInput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static SigningInput parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (SigningInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static SigningInput parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SigningInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SigningInput parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (SigningInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static SigningInput parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SigningInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SigningInput parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (SigningInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static SigningInput parseFrom(InputStream inputStream) throws IOException {
            return (SigningInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SigningInput parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (SigningInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static SigningInput parseFrom(C4969g gVar) throws IOException {
            return (SigningInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static SigningInput parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (SigningInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface SigningInputOrBuilder extends qu3 {
        ByteString getAmount();

        ByteString getChainId();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getFromAddress();

        ByteString getFromAddressBytes();

        ByteString getGasLimit();

        ByteString getGasPrice();

        ByteString getNonce();

        String getPayload();

        ByteString getPayloadBytes();

        ByteString getPrivateKey();

        ByteString getTimestamp();

        String getToAddress();

        ByteString getToAddressBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SigningOutput extends GeneratedMessageLite<SigningOutput, Builder> implements SigningOutputOrBuilder {
        public static final int ALGORITHM_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final SigningOutput DEFAULT_INSTANCE;
        private static volatile im4<SigningOutput> PARSER = null;
        public static final int RAW_FIELD_NUMBER = 3;
        public static final int SIGNATURE_FIELD_NUMBER = 2;
        private int algorithm_;
        private String raw_ = "";
        private ByteString signature_ = ByteString.EMPTY;

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningOutput, Builder> implements SigningOutputOrBuilder {
            public /* synthetic */ Builder(C97551 r1) {
                this();
            }

            public Builder clearAlgorithm() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearAlgorithm();
                return this;
            }

            public Builder clearRaw() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearRaw();
                return this;
            }

            public Builder clearSignature() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearSignature();
                return this;
            }

            public int getAlgorithm() {
                return ((SigningOutput) this.instance).getAlgorithm();
            }

            public String getRaw() {
                return ((SigningOutput) this.instance).getRaw();
            }

            public ByteString getRawBytes() {
                return ((SigningOutput) this.instance).getRawBytes();
            }

            public ByteString getSignature() {
                return ((SigningOutput) this.instance).getSignature();
            }

            public Builder setAlgorithm(int i) {
                copyOnWrite();
                ((SigningOutput) this.instance).setAlgorithm(i);
                return this;
            }

            public Builder setRaw(String str) {
                copyOnWrite();
                ((SigningOutput) this.instance).setRaw(str);
                return this;
            }

            public Builder setRawBytes(ByteString byteString) {
                copyOnWrite();
                ((SigningOutput) this.instance).setRawBytes(byteString);
                return this;
            }

            public Builder setSignature(ByteString byteString) {
                copyOnWrite();
                ((SigningOutput) this.instance).setSignature(byteString);
                return this;
            }

            private Builder() {
                super(SigningOutput.DEFAULT_INSTANCE);
            }
        }

        static {
            SigningOutput signingOutput = new SigningOutput();
            DEFAULT_INSTANCE = signingOutput;
            GeneratedMessageLite.registerDefaultInstance(SigningOutput.class, signingOutput);
        }

        private SigningOutput() {
        }

        /* access modifiers changed from: private */
        public void clearAlgorithm() {
            this.algorithm_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearRaw() {
            this.raw_ = getDefaultInstance().getRaw();
        }

        /* access modifiers changed from: private */
        public void clearSignature() {
            this.signature_ = getDefaultInstance().getSignature();
        }

        public static SigningOutput getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static SigningOutput parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SigningOutput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SigningOutput parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SigningOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<SigningOutput> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAlgorithm(int i) {
            this.algorithm_ = i;
        }

        /* access modifiers changed from: private */
        public void setRaw(String str) {
            str.getClass();
            this.raw_ = str;
        }

        /* access modifiers changed from: private */
        public void setRawBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.raw_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setSignature(ByteString byteString) {
            byteString.getClass();
            this.signature_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97551.f46571xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningOutput();
                case 2:
                    return new Builder((C97551) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003Ȉ", new Object[]{"algorithm_", "signature_", "raw_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<SigningOutput> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (SigningOutput.class) {
                            im4 = PARSER;
                            if (im4 == null) {
                                im4 = new GeneratedMessageLite.C4931b<>(DEFAULT_INSTANCE);
                                PARSER = im4;
                            }
                        }
                    }
                    return im4;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public int getAlgorithm() {
            return this.algorithm_;
        }

        public String getRaw() {
            return this.raw_;
        }

        public ByteString getRawBytes() {
            return ByteString.copyFromUtf8(this.raw_);
        }

        public ByteString getSignature() {
            return this.signature_;
        }

        public static Builder newBuilder(SigningOutput signingOutput) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(signingOutput);
        }

        public static SigningOutput parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (SigningOutput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static SigningOutput parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (SigningOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static SigningOutput parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SigningOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SigningOutput parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (SigningOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static SigningOutput parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SigningOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SigningOutput parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (SigningOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static SigningOutput parseFrom(InputStream inputStream) throws IOException {
            return (SigningOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SigningOutput parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (SigningOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static SigningOutput parseFrom(C4969g gVar) throws IOException {
            return (SigningOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static SigningOutput parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (SigningOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface SigningOutputOrBuilder extends qu3 {
        int getAlgorithm();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getRaw();

        ByteString getRawBytes();

        ByteString getSignature();

        /* synthetic */ boolean isInitialized();
    }

    private Nebulas() {
    }

    public static void registerAllExtensions(C4987l lVar) {
    }
}
