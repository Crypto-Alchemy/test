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

public final class Zilliqa {

    /* renamed from: wallet.core.jni.proto.Zilliqa$1 */
    public static /* synthetic */ class C97761 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f46588xa1df5c61;

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
                f46588xa1df5c61 = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f46588xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f46588xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f46588xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f46588xa1df5c61     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f46588xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f46588xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wallet.core.jni.proto.Zilliqa.C97761.<clinit>():void");
        }
    }

    public static final class SigningInput extends GeneratedMessageLite<SigningInput, Builder> implements SigningInputOrBuilder {
        /* access modifiers changed from: private */
        public static final SigningInput DEFAULT_INSTANCE;
        public static final int GAS_LIMIT_FIELD_NUMBER = 5;
        public static final int GAS_PRICE_FIELD_NUMBER = 4;
        public static final int NONCE_FIELD_NUMBER = 2;
        private static volatile im4<SigningInput> PARSER = null;
        public static final int PRIVATE_KEY_FIELD_NUMBER = 6;
        public static final int TO_FIELD_NUMBER = 3;
        public static final int TRANSACTION_FIELD_NUMBER = 7;
        public static final int VERSION_FIELD_NUMBER = 1;
        private long gasLimit_;
        private ByteString gasPrice_;
        private long nonce_;
        private ByteString privateKey_;
        private String to_ = "";
        private Transaction transaction_;
        private int version_;

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningInput, Builder> implements SigningInputOrBuilder {
            public /* synthetic */ Builder(C97761 r1) {
                this();
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

            public Builder clearPrivateKey() {
                copyOnWrite();
                ((SigningInput) this.instance).clearPrivateKey();
                return this;
            }

            public Builder clearTo() {
                copyOnWrite();
                ((SigningInput) this.instance).clearTo();
                return this;
            }

            public Builder clearTransaction() {
                copyOnWrite();
                ((SigningInput) this.instance).clearTransaction();
                return this;
            }

            public Builder clearVersion() {
                copyOnWrite();
                ((SigningInput) this.instance).clearVersion();
                return this;
            }

            public long getGasLimit() {
                return ((SigningInput) this.instance).getGasLimit();
            }

            public ByteString getGasPrice() {
                return ((SigningInput) this.instance).getGasPrice();
            }

            public long getNonce() {
                return ((SigningInput) this.instance).getNonce();
            }

            public ByteString getPrivateKey() {
                return ((SigningInput) this.instance).getPrivateKey();
            }

            public String getTo() {
                return ((SigningInput) this.instance).getTo();
            }

            public ByteString getToBytes() {
                return ((SigningInput) this.instance).getToBytes();
            }

            public Transaction getTransaction() {
                return ((SigningInput) this.instance).getTransaction();
            }

            public int getVersion() {
                return ((SigningInput) this.instance).getVersion();
            }

            public boolean hasTransaction() {
                return ((SigningInput) this.instance).hasTransaction();
            }

            public Builder mergeTransaction(Transaction transaction) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeTransaction(transaction);
                return this;
            }

            public Builder setGasLimit(long j) {
                copyOnWrite();
                ((SigningInput) this.instance).setGasLimit(j);
                return this;
            }

            public Builder setGasPrice(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setGasPrice(byteString);
                return this;
            }

            public Builder setNonce(long j) {
                copyOnWrite();
                ((SigningInput) this.instance).setNonce(j);
                return this;
            }

            public Builder setPrivateKey(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setPrivateKey(byteString);
                return this;
            }

            public Builder setTo(String str) {
                copyOnWrite();
                ((SigningInput) this.instance).setTo(str);
                return this;
            }

            public Builder setToBytes(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setToBytes(byteString);
                return this;
            }

            public Builder setTransaction(Transaction transaction) {
                copyOnWrite();
                ((SigningInput) this.instance).setTransaction(transaction);
                return this;
            }

            public Builder setVersion(int i) {
                copyOnWrite();
                ((SigningInput) this.instance).setVersion(i);
                return this;
            }

            private Builder() {
                super(SigningInput.DEFAULT_INSTANCE);
            }

            public Builder setTransaction(Transaction.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setTransaction((Transaction) builder.build());
                return this;
            }
        }

        static {
            SigningInput signingInput = new SigningInput();
            DEFAULT_INSTANCE = signingInput;
            GeneratedMessageLite.registerDefaultInstance(SigningInput.class, signingInput);
        }

        private SigningInput() {
            ByteString byteString = ByteString.EMPTY;
            this.gasPrice_ = byteString;
            this.privateKey_ = byteString;
        }

        /* access modifiers changed from: private */
        public void clearGasLimit() {
            this.gasLimit_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearGasPrice() {
            this.gasPrice_ = getDefaultInstance().getGasPrice();
        }

        /* access modifiers changed from: private */
        public void clearNonce() {
            this.nonce_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearPrivateKey() {
            this.privateKey_ = getDefaultInstance().getPrivateKey();
        }

        /* access modifiers changed from: private */
        public void clearTo() {
            this.to_ = getDefaultInstance().getTo();
        }

        /* access modifiers changed from: private */
        public void clearTransaction() {
            this.transaction_ = null;
        }

        /* access modifiers changed from: private */
        public void clearVersion() {
            this.version_ = 0;
        }

        public static SigningInput getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeTransaction(Transaction transaction) {
            transaction.getClass();
            Transaction transaction2 = this.transaction_;
            if (transaction2 == null || transaction2 == Transaction.getDefaultInstance()) {
                this.transaction_ = transaction;
            } else {
                this.transaction_ = (Transaction) ((Transaction.Builder) Transaction.newBuilder(this.transaction_).mergeFrom(transaction)).buildPartial();
            }
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
        public void setGasLimit(long j) {
            this.gasLimit_ = j;
        }

        /* access modifiers changed from: private */
        public void setGasPrice(ByteString byteString) {
            byteString.getClass();
            this.gasPrice_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setNonce(long j) {
            this.nonce_ = j;
        }

        /* access modifiers changed from: private */
        public void setPrivateKey(ByteString byteString) {
            byteString.getClass();
            this.privateKey_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setTo(String str) {
            str.getClass();
            this.to_ = str;
        }

        /* access modifiers changed from: private */
        public void setToBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.to_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setTransaction(Transaction transaction) {
            transaction.getClass();
            this.transaction_ = transaction;
        }

        /* access modifiers changed from: private */
        public void setVersion(int i) {
            this.version_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97761.f46588xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningInput();
                case 2:
                    return new Builder((C97761) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u000b\u0002\u0003\u0003Ȉ\u0004\n\u0005\u0003\u0006\n\u0007\t", new Object[]{"version_", "nonce_", "to_", "gasPrice_", "gasLimit_", "privateKey_", "transaction_"});
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

        public long getGasLimit() {
            return this.gasLimit_;
        }

        public ByteString getGasPrice() {
            return this.gasPrice_;
        }

        public long getNonce() {
            return this.nonce_;
        }

        public ByteString getPrivateKey() {
            return this.privateKey_;
        }

        public String getTo() {
            return this.to_;
        }

        public ByteString getToBytes() {
            return ByteString.copyFromUtf8(this.to_);
        }

        public Transaction getTransaction() {
            Transaction transaction = this.transaction_;
            if (transaction == null) {
                return Transaction.getDefaultInstance();
            }
            return transaction;
        }

        public int getVersion() {
            return this.version_;
        }

        public boolean hasTransaction() {
            if (this.transaction_ != null) {
                return true;
            }
            return false;
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
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        long getGasLimit();

        ByteString getGasPrice();

        long getNonce();

        ByteString getPrivateKey();

        String getTo();

        ByteString getToBytes();

        Transaction getTransaction();

        int getVersion();

        boolean hasTransaction();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SigningOutput extends GeneratedMessageLite<SigningOutput, Builder> implements SigningOutputOrBuilder {
        /* access modifiers changed from: private */
        public static final SigningOutput DEFAULT_INSTANCE;
        public static final int JSON_FIELD_NUMBER = 2;
        private static volatile im4<SigningOutput> PARSER = null;
        public static final int SIGNATURE_FIELD_NUMBER = 1;
        private String json_ = "";
        private ByteString signature_ = ByteString.EMPTY;

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningOutput, Builder> implements SigningOutputOrBuilder {
            public /* synthetic */ Builder(C97761 r1) {
                this();
            }

            public Builder clearJson() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearJson();
                return this;
            }

            public Builder clearSignature() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearSignature();
                return this;
            }

            public String getJson() {
                return ((SigningOutput) this.instance).getJson();
            }

            public ByteString getJsonBytes() {
                return ((SigningOutput) this.instance).getJsonBytes();
            }

            public ByteString getSignature() {
                return ((SigningOutput) this.instance).getSignature();
            }

            public Builder setJson(String str) {
                copyOnWrite();
                ((SigningOutput) this.instance).setJson(str);
                return this;
            }

            public Builder setJsonBytes(ByteString byteString) {
                copyOnWrite();
                ((SigningOutput) this.instance).setJsonBytes(byteString);
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
        public void clearJson() {
            this.json_ = getDefaultInstance().getJson();
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
        public void setJson(String str) {
            str.getClass();
            this.json_ = str;
        }

        /* access modifiers changed from: private */
        public void setJsonBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.json_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setSignature(ByteString byteString) {
            byteString.getClass();
            this.signature_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97761.f46588xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningOutput();
                case 2:
                    return new Builder((C97761) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002Ȉ", new Object[]{"signature_", "json_"});
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

        public String getJson() {
            return this.json_;
        }

        public ByteString getJsonBytes() {
            return ByteString.copyFromUtf8(this.json_);
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
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getJson();

        ByteString getJsonBytes();

        ByteString getSignature();

        /* synthetic */ boolean isInitialized();
    }

    public static final class Transaction extends GeneratedMessageLite<Transaction, Builder> implements TransactionOrBuilder {
        /* access modifiers changed from: private */
        public static final Transaction DEFAULT_INSTANCE;
        private static volatile im4<Transaction> PARSER = null;
        public static final int RAW_TRANSACTION_FIELD_NUMBER = 2;
        public static final int TRANSFER_FIELD_NUMBER = 1;
        private int messageOneofCase_ = 0;
        private Object messageOneof_;

        public static final class Builder extends GeneratedMessageLite.C4930a<Transaction, Builder> implements TransactionOrBuilder {
            public /* synthetic */ Builder(C97761 r1) {
                this();
            }

            public Builder clearMessageOneof() {
                copyOnWrite();
                ((Transaction) this.instance).clearMessageOneof();
                return this;
            }

            public Builder clearRawTransaction() {
                copyOnWrite();
                ((Transaction) this.instance).clearRawTransaction();
                return this;
            }

            public Builder clearTransfer() {
                copyOnWrite();
                ((Transaction) this.instance).clearTransfer();
                return this;
            }

            public MessageOneofCase getMessageOneofCase() {
                return ((Transaction) this.instance).getMessageOneofCase();
            }

            public Raw getRawTransaction() {
                return ((Transaction) this.instance).getRawTransaction();
            }

            public Transfer getTransfer() {
                return ((Transaction) this.instance).getTransfer();
            }

            public boolean hasRawTransaction() {
                return ((Transaction) this.instance).hasRawTransaction();
            }

            public boolean hasTransfer() {
                return ((Transaction) this.instance).hasTransfer();
            }

            public Builder mergeRawTransaction(Raw raw) {
                copyOnWrite();
                ((Transaction) this.instance).mergeRawTransaction(raw);
                return this;
            }

            public Builder mergeTransfer(Transfer transfer) {
                copyOnWrite();
                ((Transaction) this.instance).mergeTransfer(transfer);
                return this;
            }

            public Builder setRawTransaction(Raw raw) {
                copyOnWrite();
                ((Transaction) this.instance).setRawTransaction(raw);
                return this;
            }

            public Builder setTransfer(Transfer transfer) {
                copyOnWrite();
                ((Transaction) this.instance).setTransfer(transfer);
                return this;
            }

            private Builder() {
                super(Transaction.DEFAULT_INSTANCE);
            }

            public Builder setRawTransaction(Raw.Builder builder) {
                copyOnWrite();
                ((Transaction) this.instance).setRawTransaction((Raw) builder.build());
                return this;
            }

            public Builder setTransfer(Transfer.Builder builder) {
                copyOnWrite();
                ((Transaction) this.instance).setTransfer((Transfer) builder.build());
                return this;
            }
        }

        public enum MessageOneofCase {
            TRANSFER(1),
            RAW_TRANSACTION(2),
            MESSAGEONEOF_NOT_SET(0);
            
            private final int value;

            private MessageOneofCase(int i) {
                this.value = i;
            }

            public static MessageOneofCase forNumber(int i) {
                if (i == 0) {
                    return MESSAGEONEOF_NOT_SET;
                }
                if (i == 1) {
                    return TRANSFER;
                }
                if (i != 2) {
                    return null;
                }
                return RAW_TRANSACTION;
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static MessageOneofCase valueOf(int i) {
                return forNumber(i);
            }
        }

        public static final class Raw extends GeneratedMessageLite<Raw, Builder> implements RawOrBuilder {
            public static final int AMOUNT_FIELD_NUMBER = 1;
            public static final int CODE_FIELD_NUMBER = 2;
            public static final int DATA_FIELD_NUMBER = 3;
            /* access modifiers changed from: private */
            public static final Raw DEFAULT_INSTANCE;
            private static volatile im4<Raw> PARSER;
            private ByteString amount_;
            private ByteString code_;
            private ByteString data_;

            public static final class Builder extends GeneratedMessageLite.C4930a<Raw, Builder> implements RawOrBuilder {
                public /* synthetic */ Builder(C97761 r1) {
                    this();
                }

                public Builder clearAmount() {
                    copyOnWrite();
                    ((Raw) this.instance).clearAmount();
                    return this;
                }

                public Builder clearCode() {
                    copyOnWrite();
                    ((Raw) this.instance).clearCode();
                    return this;
                }

                public Builder clearData() {
                    copyOnWrite();
                    ((Raw) this.instance).clearData();
                    return this;
                }

                public ByteString getAmount() {
                    return ((Raw) this.instance).getAmount();
                }

                public ByteString getCode() {
                    return ((Raw) this.instance).getCode();
                }

                public ByteString getData() {
                    return ((Raw) this.instance).getData();
                }

                public Builder setAmount(ByteString byteString) {
                    copyOnWrite();
                    ((Raw) this.instance).setAmount(byteString);
                    return this;
                }

                public Builder setCode(ByteString byteString) {
                    copyOnWrite();
                    ((Raw) this.instance).setCode(byteString);
                    return this;
                }

                public Builder setData(ByteString byteString) {
                    copyOnWrite();
                    ((Raw) this.instance).setData(byteString);
                    return this;
                }

                private Builder() {
                    super(Raw.DEFAULT_INSTANCE);
                }
            }

            static {
                Raw raw = new Raw();
                DEFAULT_INSTANCE = raw;
                GeneratedMessageLite.registerDefaultInstance(Raw.class, raw);
            }

            private Raw() {
                ByteString byteString = ByteString.EMPTY;
                this.amount_ = byteString;
                this.code_ = byteString;
                this.data_ = byteString;
            }

            /* access modifiers changed from: private */
            public void clearAmount() {
                this.amount_ = getDefaultInstance().getAmount();
            }

            /* access modifiers changed from: private */
            public void clearCode() {
                this.code_ = getDefaultInstance().getCode();
            }

            /* access modifiers changed from: private */
            public void clearData() {
                this.data_ = getDefaultInstance().getData();
            }

            public static Raw getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static Raw parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Raw) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Raw parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Raw) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<Raw> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setAmount(ByteString byteString) {
                byteString.getClass();
                this.amount_ = byteString;
            }

            /* access modifiers changed from: private */
            public void setCode(ByteString byteString) {
                byteString.getClass();
                this.code_ = byteString;
            }

            /* access modifiers changed from: private */
            public void setData(ByteString byteString) {
                byteString.getClass();
                this.data_ = byteString;
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97761.f46588xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Raw();
                    case 2:
                        return new Builder((C97761) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\n\u0003\n", new Object[]{"amount_", "code_", "data_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<Raw> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (Raw.class) {
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

            public ByteString getCode() {
                return this.code_;
            }

            public ByteString getData() {
                return this.data_;
            }

            public static Builder newBuilder(Raw raw) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(raw);
            }

            public static Raw parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (Raw) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static Raw parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (Raw) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static Raw parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Raw) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Raw parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (Raw) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static Raw parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Raw) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Raw parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (Raw) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static Raw parseFrom(InputStream inputStream) throws IOException {
                return (Raw) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Raw parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (Raw) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static Raw parseFrom(C4969g gVar) throws IOException {
                return (Raw) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static Raw parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (Raw) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public interface RawOrBuilder extends qu3 {
            ByteString getAmount();

            ByteString getCode();

            ByteString getData();

            /* synthetic */ C4956c0 getDefaultInstanceForType();

            /* synthetic */ boolean isInitialized();
        }

        public static final class Transfer extends GeneratedMessageLite<Transfer, Builder> implements TransferOrBuilder {
            public static final int AMOUNT_FIELD_NUMBER = 1;
            /* access modifiers changed from: private */
            public static final Transfer DEFAULT_INSTANCE;
            private static volatile im4<Transfer> PARSER;
            private ByteString amount_ = ByteString.EMPTY;

            public static final class Builder extends GeneratedMessageLite.C4930a<Transfer, Builder> implements TransferOrBuilder {
                public /* synthetic */ Builder(C97761 r1) {
                    this();
                }

                public Builder clearAmount() {
                    copyOnWrite();
                    ((Transfer) this.instance).clearAmount();
                    return this;
                }

                public ByteString getAmount() {
                    return ((Transfer) this.instance).getAmount();
                }

                public Builder setAmount(ByteString byteString) {
                    copyOnWrite();
                    ((Transfer) this.instance).setAmount(byteString);
                    return this;
                }

                private Builder() {
                    super(Transfer.DEFAULT_INSTANCE);
                }
            }

            static {
                Transfer transfer = new Transfer();
                DEFAULT_INSTANCE = transfer;
                GeneratedMessageLite.registerDefaultInstance(Transfer.class, transfer);
            }

            private Transfer() {
            }

            /* access modifiers changed from: private */
            public void clearAmount() {
                this.amount_ = getDefaultInstance().getAmount();
            }

            public static Transfer getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static Transfer parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Transfer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Transfer parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Transfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<Transfer> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setAmount(ByteString byteString) {
                byteString.getClass();
                this.amount_ = byteString;
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97761.f46588xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Transfer();
                    case 2:
                        return new Builder((C97761) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"amount_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<Transfer> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (Transfer.class) {
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

            public static Builder newBuilder(Transfer transfer) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(transfer);
            }

            public static Transfer parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (Transfer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static Transfer parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (Transfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static Transfer parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Transfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Transfer parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (Transfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static Transfer parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Transfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Transfer parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (Transfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static Transfer parseFrom(InputStream inputStream) throws IOException {
                return (Transfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Transfer parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (Transfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static Transfer parseFrom(C4969g gVar) throws IOException {
                return (Transfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static Transfer parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (Transfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public interface TransferOrBuilder extends qu3 {
            ByteString getAmount();

            /* synthetic */ C4956c0 getDefaultInstanceForType();

            /* synthetic */ boolean isInitialized();
        }

        static {
            Transaction transaction = new Transaction();
            DEFAULT_INSTANCE = transaction;
            GeneratedMessageLite.registerDefaultInstance(Transaction.class, transaction);
        }

        private Transaction() {
        }

        /* access modifiers changed from: private */
        public void clearMessageOneof() {
            this.messageOneofCase_ = 0;
            this.messageOneof_ = null;
        }

        /* access modifiers changed from: private */
        public void clearRawTransaction() {
            if (this.messageOneofCase_ == 2) {
                this.messageOneofCase_ = 0;
                this.messageOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearTransfer() {
            if (this.messageOneofCase_ == 1) {
                this.messageOneofCase_ = 0;
                this.messageOneof_ = null;
            }
        }

        public static Transaction getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeRawTransaction(Raw raw) {
            raw.getClass();
            if (this.messageOneofCase_ != 2 || this.messageOneof_ == Raw.getDefaultInstance()) {
                this.messageOneof_ = raw;
            } else {
                this.messageOneof_ = ((Raw.Builder) Raw.newBuilder((Raw) this.messageOneof_).mergeFrom(raw)).buildPartial();
            }
            this.messageOneofCase_ = 2;
        }

        /* access modifiers changed from: private */
        public void mergeTransfer(Transfer transfer) {
            transfer.getClass();
            if (this.messageOneofCase_ != 1 || this.messageOneof_ == Transfer.getDefaultInstance()) {
                this.messageOneof_ = transfer;
            } else {
                this.messageOneof_ = ((Transfer.Builder) Transfer.newBuilder((Transfer) this.messageOneof_).mergeFrom(transfer)).buildPartial();
            }
            this.messageOneofCase_ = 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Transaction parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Transaction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Transaction parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Transaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<Transaction> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setRawTransaction(Raw raw) {
            raw.getClass();
            this.messageOneof_ = raw;
            this.messageOneofCase_ = 2;
        }

        /* access modifiers changed from: private */
        public void setTransfer(Transfer transfer) {
            transfer.getClass();
            this.messageOneof_ = transfer;
            this.messageOneofCase_ = 1;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97761.f46588xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Transaction();
                case 2:
                    return new Builder((C97761) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"messageOneof_", "messageOneofCase_", Transfer.class, Raw.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<Transaction> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (Transaction.class) {
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

        public MessageOneofCase getMessageOneofCase() {
            return MessageOneofCase.forNumber(this.messageOneofCase_);
        }

        public Raw getRawTransaction() {
            if (this.messageOneofCase_ == 2) {
                return (Raw) this.messageOneof_;
            }
            return Raw.getDefaultInstance();
        }

        public Transfer getTransfer() {
            if (this.messageOneofCase_ == 1) {
                return (Transfer) this.messageOneof_;
            }
            return Transfer.getDefaultInstance();
        }

        public boolean hasRawTransaction() {
            if (this.messageOneofCase_ == 2) {
                return true;
            }
            return false;
        }

        public boolean hasTransfer() {
            if (this.messageOneofCase_ == 1) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(Transaction transaction) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(transaction);
        }

        public static Transaction parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Transaction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Transaction parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (Transaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static Transaction parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Transaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Transaction parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (Transaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static Transaction parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Transaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Transaction parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (Transaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static Transaction parseFrom(InputStream inputStream) throws IOException {
            return (Transaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Transaction parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Transaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Transaction parseFrom(C4969g gVar) throws IOException {
            return (Transaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static Transaction parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (Transaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface TransactionOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        Transaction.MessageOneofCase getMessageOneofCase();

        Transaction.Raw getRawTransaction();

        Transaction.Transfer getTransfer();

        boolean hasRawTransaction();

        boolean hasTransfer();

        /* synthetic */ boolean isInitialized();
    }

    private Zilliqa() {
    }

    public static void registerAllExtensions(C4987l lVar) {
    }
}
