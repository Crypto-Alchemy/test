package wallet.core.jni.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.C4949a;
import com.google.protobuf.C4956c0;
import com.google.protobuf.C4969g;
import com.google.protobuf.C4987l;
import com.google.protobuf.C5011t;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import wallet.core.jni.proto.Common;

public final class Ethereum {

    /* renamed from: wallet.core.jni.proto.Ethereum$1 */
    public static /* synthetic */ class C97411 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f46553xa1df5c61;

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
                f46553xa1df5c61 = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f46553xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f46553xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f46553xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f46553xa1df5c61     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f46553xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f46553xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wallet.core.jni.proto.Ethereum.C97411.<clinit>():void");
        }
    }

    public static final class SigningInput extends GeneratedMessageLite<SigningInput, Builder> implements SigningInputOrBuilder {
        public static final int CHAIN_ID_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final SigningInput DEFAULT_INSTANCE;
        public static final int GAS_LIMIT_FIELD_NUMBER = 5;
        public static final int GAS_PRICE_FIELD_NUMBER = 4;
        public static final int MAX_FEE_PER_GAS_FIELD_NUMBER = 7;
        public static final int MAX_INCLUSION_FEE_PER_GAS_FIELD_NUMBER = 6;
        public static final int NONCE_FIELD_NUMBER = 2;
        private static volatile im4<SigningInput> PARSER = null;
        public static final int PRIVATE_KEY_FIELD_NUMBER = 9;
        public static final int TO_ADDRESS_FIELD_NUMBER = 8;
        public static final int TRANSACTION_FIELD_NUMBER = 10;
        public static final int TX_MODE_FIELD_NUMBER = 3;
        private ByteString chainId_;
        private ByteString gasLimit_;
        private ByteString gasPrice_;
        private ByteString maxFeePerGas_;
        private ByteString maxInclusionFeePerGas_;
        private ByteString nonce_;
        private ByteString privateKey_;
        private String toAddress_ = "";
        private Transaction transaction_;
        private int txMode_;

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningInput, Builder> implements SigningInputOrBuilder {
            public /* synthetic */ Builder(C97411 r1) {
                this();
            }

            public Builder clearChainId() {
                copyOnWrite();
                ((SigningInput) this.instance).clearChainId();
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

            public Builder clearMaxFeePerGas() {
                copyOnWrite();
                ((SigningInput) this.instance).clearMaxFeePerGas();
                return this;
            }

            public Builder clearMaxInclusionFeePerGas() {
                copyOnWrite();
                ((SigningInput) this.instance).clearMaxInclusionFeePerGas();
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

            public Builder clearToAddress() {
                copyOnWrite();
                ((SigningInput) this.instance).clearToAddress();
                return this;
            }

            public Builder clearTransaction() {
                copyOnWrite();
                ((SigningInput) this.instance).clearTransaction();
                return this;
            }

            public Builder clearTxMode() {
                copyOnWrite();
                ((SigningInput) this.instance).clearTxMode();
                return this;
            }

            public ByteString getChainId() {
                return ((SigningInput) this.instance).getChainId();
            }

            public ByteString getGasLimit() {
                return ((SigningInput) this.instance).getGasLimit();
            }

            public ByteString getGasPrice() {
                return ((SigningInput) this.instance).getGasPrice();
            }

            public ByteString getMaxFeePerGas() {
                return ((SigningInput) this.instance).getMaxFeePerGas();
            }

            public ByteString getMaxInclusionFeePerGas() {
                return ((SigningInput) this.instance).getMaxInclusionFeePerGas();
            }

            public ByteString getNonce() {
                return ((SigningInput) this.instance).getNonce();
            }

            public ByteString getPrivateKey() {
                return ((SigningInput) this.instance).getPrivateKey();
            }

            public String getToAddress() {
                return ((SigningInput) this.instance).getToAddress();
            }

            public ByteString getToAddressBytes() {
                return ((SigningInput) this.instance).getToAddressBytes();
            }

            public Transaction getTransaction() {
                return ((SigningInput) this.instance).getTransaction();
            }

            public TransactionMode getTxMode() {
                return ((SigningInput) this.instance).getTxMode();
            }

            public int getTxModeValue() {
                return ((SigningInput) this.instance).getTxModeValue();
            }

            public boolean hasTransaction() {
                return ((SigningInput) this.instance).hasTransaction();
            }

            public Builder mergeTransaction(Transaction transaction) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeTransaction(transaction);
                return this;
            }

            public Builder setChainId(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setChainId(byteString);
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

            public Builder setMaxFeePerGas(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setMaxFeePerGas(byteString);
                return this;
            }

            public Builder setMaxInclusionFeePerGas(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setMaxInclusionFeePerGas(byteString);
                return this;
            }

            public Builder setNonce(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setNonce(byteString);
                return this;
            }

            public Builder setPrivateKey(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setPrivateKey(byteString);
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

            public Builder setTransaction(Transaction transaction) {
                copyOnWrite();
                ((SigningInput) this.instance).setTransaction(transaction);
                return this;
            }

            public Builder setTxMode(TransactionMode transactionMode) {
                copyOnWrite();
                ((SigningInput) this.instance).setTxMode(transactionMode);
                return this;
            }

            public Builder setTxModeValue(int i) {
                copyOnWrite();
                ((SigningInput) this.instance).setTxModeValue(i);
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
            this.chainId_ = byteString;
            this.nonce_ = byteString;
            this.gasPrice_ = byteString;
            this.gasLimit_ = byteString;
            this.maxInclusionFeePerGas_ = byteString;
            this.maxFeePerGas_ = byteString;
            this.privateKey_ = byteString;
        }

        /* access modifiers changed from: private */
        public void clearChainId() {
            this.chainId_ = getDefaultInstance().getChainId();
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
        public void clearMaxFeePerGas() {
            this.maxFeePerGas_ = getDefaultInstance().getMaxFeePerGas();
        }

        /* access modifiers changed from: private */
        public void clearMaxInclusionFeePerGas() {
            this.maxInclusionFeePerGas_ = getDefaultInstance().getMaxInclusionFeePerGas();
        }

        /* access modifiers changed from: private */
        public void clearNonce() {
            this.nonce_ = getDefaultInstance().getNonce();
        }

        /* access modifiers changed from: private */
        public void clearPrivateKey() {
            this.privateKey_ = getDefaultInstance().getPrivateKey();
        }

        /* access modifiers changed from: private */
        public void clearToAddress() {
            this.toAddress_ = getDefaultInstance().getToAddress();
        }

        /* access modifiers changed from: private */
        public void clearTransaction() {
            this.transaction_ = null;
        }

        /* access modifiers changed from: private */
        public void clearTxMode() {
            this.txMode_ = 0;
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
        public void setChainId(ByteString byteString) {
            byteString.getClass();
            this.chainId_ = byteString;
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
        public void setMaxFeePerGas(ByteString byteString) {
            byteString.getClass();
            this.maxFeePerGas_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setMaxInclusionFeePerGas(ByteString byteString) {
            byteString.getClass();
            this.maxInclusionFeePerGas_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setNonce(ByteString byteString) {
            byteString.getClass();
            this.nonce_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setPrivateKey(ByteString byteString) {
            byteString.getClass();
            this.privateKey_ = byteString;
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

        /* access modifiers changed from: private */
        public void setTransaction(Transaction transaction) {
            transaction.getClass();
            this.transaction_ = transaction;
        }

        /* access modifiers changed from: private */
        public void setTxMode(TransactionMode transactionMode) {
            this.txMode_ = transactionMode.getNumber();
        }

        /* access modifiers changed from: private */
        public void setTxModeValue(int i) {
            this.txMode_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97411.f46553xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningInput();
                case 2:
                    return new Builder((C97411) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001\n\u0002\n\u0003\f\u0004\n\u0005\n\u0006\n\u0007\n\bȈ\t\n\n\t", new Object[]{"chainId_", "nonce_", "txMode_", "gasPrice_", "gasLimit_", "maxInclusionFeePerGas_", "maxFeePerGas_", "toAddress_", "privateKey_", "transaction_"});
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

        public ByteString getChainId() {
            return this.chainId_;
        }

        public ByteString getGasLimit() {
            return this.gasLimit_;
        }

        public ByteString getGasPrice() {
            return this.gasPrice_;
        }

        public ByteString getMaxFeePerGas() {
            return this.maxFeePerGas_;
        }

        public ByteString getMaxInclusionFeePerGas() {
            return this.maxInclusionFeePerGas_;
        }

        public ByteString getNonce() {
            return this.nonce_;
        }

        public ByteString getPrivateKey() {
            return this.privateKey_;
        }

        public String getToAddress() {
            return this.toAddress_;
        }

        public ByteString getToAddressBytes() {
            return ByteString.copyFromUtf8(this.toAddress_);
        }

        public Transaction getTransaction() {
            Transaction transaction = this.transaction_;
            if (transaction == null) {
                return Transaction.getDefaultInstance();
            }
            return transaction;
        }

        public TransactionMode getTxMode() {
            TransactionMode forNumber = TransactionMode.forNumber(this.txMode_);
            if (forNumber == null) {
                return TransactionMode.UNRECOGNIZED;
            }
            return forNumber;
        }

        public int getTxModeValue() {
            return this.txMode_;
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
        ByteString getChainId();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        ByteString getGasLimit();

        ByteString getGasPrice();

        ByteString getMaxFeePerGas();

        ByteString getMaxInclusionFeePerGas();

        ByteString getNonce();

        ByteString getPrivateKey();

        String getToAddress();

        ByteString getToAddressBytes();

        Transaction getTransaction();

        TransactionMode getTxMode();

        int getTxModeValue();

        boolean hasTransaction();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SigningOutput extends GeneratedMessageLite<SigningOutput, Builder> implements SigningOutputOrBuilder {
        public static final int DATA_FIELD_NUMBER = 5;
        /* access modifiers changed from: private */
        public static final SigningOutput DEFAULT_INSTANCE;
        public static final int ENCODED_FIELD_NUMBER = 1;
        public static final int ERROR_FIELD_NUMBER = 6;
        public static final int ERROR_MESSAGE_FIELD_NUMBER = 7;
        private static volatile im4<SigningOutput> PARSER = null;
        public static final int R_FIELD_NUMBER = 3;
        public static final int S_FIELD_NUMBER = 4;
        public static final int V_FIELD_NUMBER = 2;
        private ByteString data_;
        private ByteString encoded_;
        private String errorMessage_ = "";
        private int error_;

        /* renamed from: r_ */
        private ByteString f46554r_;

        /* renamed from: s_ */
        private ByteString f46555s_;

        /* renamed from: v_ */
        private ByteString f46556v_;

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningOutput, Builder> implements SigningOutputOrBuilder {
            public /* synthetic */ Builder(C97411 r1) {
                this();
            }

            public Builder clearData() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearData();
                return this;
            }

            public Builder clearEncoded() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearEncoded();
                return this;
            }

            public Builder clearError() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearError();
                return this;
            }

            public Builder clearErrorMessage() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearErrorMessage();
                return this;
            }

            public Builder clearR() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearR();
                return this;
            }

            public Builder clearS() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearS();
                return this;
            }

            public Builder clearV() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearV();
                return this;
            }

            public ByteString getData() {
                return ((SigningOutput) this.instance).getData();
            }

            public ByteString getEncoded() {
                return ((SigningOutput) this.instance).getEncoded();
            }

            public Common.SigningError getError() {
                return ((SigningOutput) this.instance).getError();
            }

            public String getErrorMessage() {
                return ((SigningOutput) this.instance).getErrorMessage();
            }

            public ByteString getErrorMessageBytes() {
                return ((SigningOutput) this.instance).getErrorMessageBytes();
            }

            public int getErrorValue() {
                return ((SigningOutput) this.instance).getErrorValue();
            }

            public ByteString getR() {
                return ((SigningOutput) this.instance).getR();
            }

            public ByteString getS() {
                return ((SigningOutput) this.instance).getS();
            }

            public ByteString getV() {
                return ((SigningOutput) this.instance).getV();
            }

            public Builder setData(ByteString byteString) {
                copyOnWrite();
                ((SigningOutput) this.instance).setData(byteString);
                return this;
            }

            public Builder setEncoded(ByteString byteString) {
                copyOnWrite();
                ((SigningOutput) this.instance).setEncoded(byteString);
                return this;
            }

            public Builder setError(Common.SigningError signingError) {
                copyOnWrite();
                ((SigningOutput) this.instance).setError(signingError);
                return this;
            }

            public Builder setErrorMessage(String str) {
                copyOnWrite();
                ((SigningOutput) this.instance).setErrorMessage(str);
                return this;
            }

            public Builder setErrorMessageBytes(ByteString byteString) {
                copyOnWrite();
                ((SigningOutput) this.instance).setErrorMessageBytes(byteString);
                return this;
            }

            public Builder setErrorValue(int i) {
                copyOnWrite();
                ((SigningOutput) this.instance).setErrorValue(i);
                return this;
            }

            public Builder setR(ByteString byteString) {
                copyOnWrite();
                ((SigningOutput) this.instance).setR(byteString);
                return this;
            }

            public Builder setS(ByteString byteString) {
                copyOnWrite();
                ((SigningOutput) this.instance).setS(byteString);
                return this;
            }

            public Builder setV(ByteString byteString) {
                copyOnWrite();
                ((SigningOutput) this.instance).setV(byteString);
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
            ByteString byteString = ByteString.EMPTY;
            this.encoded_ = byteString;
            this.f46556v_ = byteString;
            this.f46554r_ = byteString;
            this.f46555s_ = byteString;
            this.data_ = byteString;
        }

        /* access modifiers changed from: private */
        public void clearData() {
            this.data_ = getDefaultInstance().getData();
        }

        /* access modifiers changed from: private */
        public void clearEncoded() {
            this.encoded_ = getDefaultInstance().getEncoded();
        }

        /* access modifiers changed from: private */
        public void clearError() {
            this.error_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearErrorMessage() {
            this.errorMessage_ = getDefaultInstance().getErrorMessage();
        }

        /* access modifiers changed from: private */
        public void clearR() {
            this.f46554r_ = getDefaultInstance().getR();
        }

        /* access modifiers changed from: private */
        public void clearS() {
            this.f46555s_ = getDefaultInstance().getS();
        }

        /* access modifiers changed from: private */
        public void clearV() {
            this.f46556v_ = getDefaultInstance().getV();
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
        public void setData(ByteString byteString) {
            byteString.getClass();
            this.data_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setEncoded(ByteString byteString) {
            byteString.getClass();
            this.encoded_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setError(Common.SigningError signingError) {
            this.error_ = signingError.getNumber();
        }

        /* access modifiers changed from: private */
        public void setErrorMessage(String str) {
            str.getClass();
            this.errorMessage_ = str;
        }

        /* access modifiers changed from: private */
        public void setErrorMessageBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.errorMessage_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setErrorValue(int i) {
            this.error_ = i;
        }

        /* access modifiers changed from: private */
        public void setR(ByteString byteString) {
            byteString.getClass();
            this.f46554r_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setS(ByteString byteString) {
            byteString.getClass();
            this.f46555s_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setV(ByteString byteString) {
            byteString.getClass();
            this.f46556v_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97411.f46553xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningOutput();
                case 2:
                    return new Builder((C97411) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\n\u0002\n\u0003\n\u0004\n\u0005\n\u0006\f\u0007Ȉ", new Object[]{"encoded_", "v_", "r_", "s_", "data_", "error_", "errorMessage_"});
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

        public ByteString getData() {
            return this.data_;
        }

        public ByteString getEncoded() {
            return this.encoded_;
        }

        public Common.SigningError getError() {
            Common.SigningError forNumber = Common.SigningError.forNumber(this.error_);
            if (forNumber == null) {
                return Common.SigningError.UNRECOGNIZED;
            }
            return forNumber;
        }

        public String getErrorMessage() {
            return this.errorMessage_;
        }

        public ByteString getErrorMessageBytes() {
            return ByteString.copyFromUtf8(this.errorMessage_);
        }

        public int getErrorValue() {
            return this.error_;
        }

        public ByteString getR() {
            return this.f46554r_;
        }

        public ByteString getS() {
            return this.f46555s_;
        }

        public ByteString getV() {
            return this.f46556v_;
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
        ByteString getData();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        ByteString getEncoded();

        Common.SigningError getError();

        String getErrorMessage();

        ByteString getErrorMessageBytes();

        int getErrorValue();

        ByteString getR();

        ByteString getS();

        ByteString getV();

        /* synthetic */ boolean isInitialized();
    }

    public static final class Transaction extends GeneratedMessageLite<Transaction, Builder> implements TransactionOrBuilder {
        public static final int CONTRACT_GENERIC_FIELD_NUMBER = 6;
        /* access modifiers changed from: private */
        public static final Transaction DEFAULT_INSTANCE;
        public static final int ERC1155_TRANSFER_FIELD_NUMBER = 5;
        public static final int ERC20_APPROVE_FIELD_NUMBER = 3;
        public static final int ERC20_TRANSFER_FIELD_NUMBER = 2;
        public static final int ERC721_TRANSFER_FIELD_NUMBER = 4;
        private static volatile im4<Transaction> PARSER = null;
        public static final int TRANSFER_FIELD_NUMBER = 1;
        private int transactionOneofCase_ = 0;
        private Object transactionOneof_;

        public static final class Builder extends GeneratedMessageLite.C4930a<Transaction, Builder> implements TransactionOrBuilder {
            public /* synthetic */ Builder(C97411 r1) {
                this();
            }

            public Builder clearContractGeneric() {
                copyOnWrite();
                ((Transaction) this.instance).clearContractGeneric();
                return this;
            }

            public Builder clearErc1155Transfer() {
                copyOnWrite();
                ((Transaction) this.instance).clearErc1155Transfer();
                return this;
            }

            public Builder clearErc20Approve() {
                copyOnWrite();
                ((Transaction) this.instance).clearErc20Approve();
                return this;
            }

            public Builder clearErc20Transfer() {
                copyOnWrite();
                ((Transaction) this.instance).clearErc20Transfer();
                return this;
            }

            public Builder clearErc721Transfer() {
                copyOnWrite();
                ((Transaction) this.instance).clearErc721Transfer();
                return this;
            }

            public Builder clearTransactionOneof() {
                copyOnWrite();
                ((Transaction) this.instance).clearTransactionOneof();
                return this;
            }

            public Builder clearTransfer() {
                copyOnWrite();
                ((Transaction) this.instance).clearTransfer();
                return this;
            }

            public ContractGeneric getContractGeneric() {
                return ((Transaction) this.instance).getContractGeneric();
            }

            public ERC1155Transfer getErc1155Transfer() {
                return ((Transaction) this.instance).getErc1155Transfer();
            }

            public ERC20Approve getErc20Approve() {
                return ((Transaction) this.instance).getErc20Approve();
            }

            public ERC20Transfer getErc20Transfer() {
                return ((Transaction) this.instance).getErc20Transfer();
            }

            public ERC721Transfer getErc721Transfer() {
                return ((Transaction) this.instance).getErc721Transfer();
            }

            public TransactionOneofCase getTransactionOneofCase() {
                return ((Transaction) this.instance).getTransactionOneofCase();
            }

            public Transfer getTransfer() {
                return ((Transaction) this.instance).getTransfer();
            }

            public boolean hasContractGeneric() {
                return ((Transaction) this.instance).hasContractGeneric();
            }

            public boolean hasErc1155Transfer() {
                return ((Transaction) this.instance).hasErc1155Transfer();
            }

            public boolean hasErc20Approve() {
                return ((Transaction) this.instance).hasErc20Approve();
            }

            public boolean hasErc20Transfer() {
                return ((Transaction) this.instance).hasErc20Transfer();
            }

            public boolean hasErc721Transfer() {
                return ((Transaction) this.instance).hasErc721Transfer();
            }

            public boolean hasTransfer() {
                return ((Transaction) this.instance).hasTransfer();
            }

            public Builder mergeContractGeneric(ContractGeneric contractGeneric) {
                copyOnWrite();
                ((Transaction) this.instance).mergeContractGeneric(contractGeneric);
                return this;
            }

            public Builder mergeErc1155Transfer(ERC1155Transfer eRC1155Transfer) {
                copyOnWrite();
                ((Transaction) this.instance).mergeErc1155Transfer(eRC1155Transfer);
                return this;
            }

            public Builder mergeErc20Approve(ERC20Approve eRC20Approve) {
                copyOnWrite();
                ((Transaction) this.instance).mergeErc20Approve(eRC20Approve);
                return this;
            }

            public Builder mergeErc20Transfer(ERC20Transfer eRC20Transfer) {
                copyOnWrite();
                ((Transaction) this.instance).mergeErc20Transfer(eRC20Transfer);
                return this;
            }

            public Builder mergeErc721Transfer(ERC721Transfer eRC721Transfer) {
                copyOnWrite();
                ((Transaction) this.instance).mergeErc721Transfer(eRC721Transfer);
                return this;
            }

            public Builder mergeTransfer(Transfer transfer) {
                copyOnWrite();
                ((Transaction) this.instance).mergeTransfer(transfer);
                return this;
            }

            public Builder setContractGeneric(ContractGeneric contractGeneric) {
                copyOnWrite();
                ((Transaction) this.instance).setContractGeneric(contractGeneric);
                return this;
            }

            public Builder setErc1155Transfer(ERC1155Transfer eRC1155Transfer) {
                copyOnWrite();
                ((Transaction) this.instance).setErc1155Transfer(eRC1155Transfer);
                return this;
            }

            public Builder setErc20Approve(ERC20Approve eRC20Approve) {
                copyOnWrite();
                ((Transaction) this.instance).setErc20Approve(eRC20Approve);
                return this;
            }

            public Builder setErc20Transfer(ERC20Transfer eRC20Transfer) {
                copyOnWrite();
                ((Transaction) this.instance).setErc20Transfer(eRC20Transfer);
                return this;
            }

            public Builder setErc721Transfer(ERC721Transfer eRC721Transfer) {
                copyOnWrite();
                ((Transaction) this.instance).setErc721Transfer(eRC721Transfer);
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

            public Builder setContractGeneric(ContractGeneric.Builder builder) {
                copyOnWrite();
                ((Transaction) this.instance).setContractGeneric((ContractGeneric) builder.build());
                return this;
            }

            public Builder setErc1155Transfer(ERC1155Transfer.Builder builder) {
                copyOnWrite();
                ((Transaction) this.instance).setErc1155Transfer((ERC1155Transfer) builder.build());
                return this;
            }

            public Builder setErc20Approve(ERC20Approve.Builder builder) {
                copyOnWrite();
                ((Transaction) this.instance).setErc20Approve((ERC20Approve) builder.build());
                return this;
            }

            public Builder setErc20Transfer(ERC20Transfer.Builder builder) {
                copyOnWrite();
                ((Transaction) this.instance).setErc20Transfer((ERC20Transfer) builder.build());
                return this;
            }

            public Builder setErc721Transfer(ERC721Transfer.Builder builder) {
                copyOnWrite();
                ((Transaction) this.instance).setErc721Transfer((ERC721Transfer) builder.build());
                return this;
            }

            public Builder setTransfer(Transfer.Builder builder) {
                copyOnWrite();
                ((Transaction) this.instance).setTransfer((Transfer) builder.build());
                return this;
            }
        }

        public static final class ContractGeneric extends GeneratedMessageLite<ContractGeneric, Builder> implements ContractGenericOrBuilder {
            public static final int AMOUNT_FIELD_NUMBER = 1;
            public static final int DATA_FIELD_NUMBER = 2;
            /* access modifiers changed from: private */
            public static final ContractGeneric DEFAULT_INSTANCE;
            private static volatile im4<ContractGeneric> PARSER;
            private ByteString amount_;
            private ByteString data_;

            public static final class Builder extends GeneratedMessageLite.C4930a<ContractGeneric, Builder> implements ContractGenericOrBuilder {
                public /* synthetic */ Builder(C97411 r1) {
                    this();
                }

                public Builder clearAmount() {
                    copyOnWrite();
                    ((ContractGeneric) this.instance).clearAmount();
                    return this;
                }

                public Builder clearData() {
                    copyOnWrite();
                    ((ContractGeneric) this.instance).clearData();
                    return this;
                }

                public ByteString getAmount() {
                    return ((ContractGeneric) this.instance).getAmount();
                }

                public ByteString getData() {
                    return ((ContractGeneric) this.instance).getData();
                }

                public Builder setAmount(ByteString byteString) {
                    copyOnWrite();
                    ((ContractGeneric) this.instance).setAmount(byteString);
                    return this;
                }

                public Builder setData(ByteString byteString) {
                    copyOnWrite();
                    ((ContractGeneric) this.instance).setData(byteString);
                    return this;
                }

                private Builder() {
                    super(ContractGeneric.DEFAULT_INSTANCE);
                }
            }

            static {
                ContractGeneric contractGeneric = new ContractGeneric();
                DEFAULT_INSTANCE = contractGeneric;
                GeneratedMessageLite.registerDefaultInstance(ContractGeneric.class, contractGeneric);
            }

            private ContractGeneric() {
                ByteString byteString = ByteString.EMPTY;
                this.amount_ = byteString;
                this.data_ = byteString;
            }

            /* access modifiers changed from: private */
            public void clearAmount() {
                this.amount_ = getDefaultInstance().getAmount();
            }

            /* access modifiers changed from: private */
            public void clearData() {
                this.data_ = getDefaultInstance().getData();
            }

            public static ContractGeneric getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static ContractGeneric parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (ContractGeneric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ContractGeneric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (ContractGeneric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<ContractGeneric> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setAmount(ByteString byteString) {
                byteString.getClass();
                this.amount_ = byteString;
            }

            /* access modifiers changed from: private */
            public void setData(ByteString byteString) {
                byteString.getClass();
                this.data_ = byteString;
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97411.f46553xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ContractGeneric();
                    case 2:
                        return new Builder((C97411) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\n", new Object[]{"amount_", "data_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<ContractGeneric> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (ContractGeneric.class) {
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

            public ByteString getData() {
                return this.data_;
            }

            public static Builder newBuilder(ContractGeneric contractGeneric) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(contractGeneric);
            }

            public static ContractGeneric parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (ContractGeneric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static ContractGeneric parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (ContractGeneric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static ContractGeneric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (ContractGeneric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ContractGeneric parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (ContractGeneric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static ContractGeneric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (ContractGeneric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ContractGeneric parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (ContractGeneric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static ContractGeneric parseFrom(InputStream inputStream) throws IOException {
                return (ContractGeneric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ContractGeneric parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (ContractGeneric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static ContractGeneric parseFrom(C4969g gVar) throws IOException {
                return (ContractGeneric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static ContractGeneric parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (ContractGeneric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public interface ContractGenericOrBuilder extends qu3 {
            ByteString getAmount();

            ByteString getData();

            /* synthetic */ C4956c0 getDefaultInstanceForType();

            /* synthetic */ boolean isInitialized();
        }

        public static final class ERC1155Transfer extends GeneratedMessageLite<ERC1155Transfer, Builder> implements ERC1155TransferOrBuilder {
            public static final int DATA_FIELD_NUMBER = 5;
            /* access modifiers changed from: private */
            public static final ERC1155Transfer DEFAULT_INSTANCE;
            public static final int FROM_FIELD_NUMBER = 1;
            private static volatile im4<ERC1155Transfer> PARSER = null;
            public static final int TOKEN_ID_FIELD_NUMBER = 3;
            public static final int TO_FIELD_NUMBER = 2;
            public static final int VALUE_FIELD_NUMBER = 4;
            private ByteString data_;
            private String from_ = "";
            private String to_ = "";
            private ByteString tokenId_;
            private ByteString value_;

            public static final class Builder extends GeneratedMessageLite.C4930a<ERC1155Transfer, Builder> implements ERC1155TransferOrBuilder {
                public /* synthetic */ Builder(C97411 r1) {
                    this();
                }

                public Builder clearData() {
                    copyOnWrite();
                    ((ERC1155Transfer) this.instance).clearData();
                    return this;
                }

                public Builder clearFrom() {
                    copyOnWrite();
                    ((ERC1155Transfer) this.instance).clearFrom();
                    return this;
                }

                public Builder clearTo() {
                    copyOnWrite();
                    ((ERC1155Transfer) this.instance).clearTo();
                    return this;
                }

                public Builder clearTokenId() {
                    copyOnWrite();
                    ((ERC1155Transfer) this.instance).clearTokenId();
                    return this;
                }

                public Builder clearValue() {
                    copyOnWrite();
                    ((ERC1155Transfer) this.instance).clearValue();
                    return this;
                }

                public ByteString getData() {
                    return ((ERC1155Transfer) this.instance).getData();
                }

                public String getFrom() {
                    return ((ERC1155Transfer) this.instance).getFrom();
                }

                public ByteString getFromBytes() {
                    return ((ERC1155Transfer) this.instance).getFromBytes();
                }

                public String getTo() {
                    return ((ERC1155Transfer) this.instance).getTo();
                }

                public ByteString getToBytes() {
                    return ((ERC1155Transfer) this.instance).getToBytes();
                }

                public ByteString getTokenId() {
                    return ((ERC1155Transfer) this.instance).getTokenId();
                }

                public ByteString getValue() {
                    return ((ERC1155Transfer) this.instance).getValue();
                }

                public Builder setData(ByteString byteString) {
                    copyOnWrite();
                    ((ERC1155Transfer) this.instance).setData(byteString);
                    return this;
                }

                public Builder setFrom(String str) {
                    copyOnWrite();
                    ((ERC1155Transfer) this.instance).setFrom(str);
                    return this;
                }

                public Builder setFromBytes(ByteString byteString) {
                    copyOnWrite();
                    ((ERC1155Transfer) this.instance).setFromBytes(byteString);
                    return this;
                }

                public Builder setTo(String str) {
                    copyOnWrite();
                    ((ERC1155Transfer) this.instance).setTo(str);
                    return this;
                }

                public Builder setToBytes(ByteString byteString) {
                    copyOnWrite();
                    ((ERC1155Transfer) this.instance).setToBytes(byteString);
                    return this;
                }

                public Builder setTokenId(ByteString byteString) {
                    copyOnWrite();
                    ((ERC1155Transfer) this.instance).setTokenId(byteString);
                    return this;
                }

                public Builder setValue(ByteString byteString) {
                    copyOnWrite();
                    ((ERC1155Transfer) this.instance).setValue(byteString);
                    return this;
                }

                private Builder() {
                    super(ERC1155Transfer.DEFAULT_INSTANCE);
                }
            }

            static {
                ERC1155Transfer eRC1155Transfer = new ERC1155Transfer();
                DEFAULT_INSTANCE = eRC1155Transfer;
                GeneratedMessageLite.registerDefaultInstance(ERC1155Transfer.class, eRC1155Transfer);
            }

            private ERC1155Transfer() {
                ByteString byteString = ByteString.EMPTY;
                this.tokenId_ = byteString;
                this.value_ = byteString;
                this.data_ = byteString;
            }

            /* access modifiers changed from: private */
            public void clearData() {
                this.data_ = getDefaultInstance().getData();
            }

            /* access modifiers changed from: private */
            public void clearFrom() {
                this.from_ = getDefaultInstance().getFrom();
            }

            /* access modifiers changed from: private */
            public void clearTo() {
                this.to_ = getDefaultInstance().getTo();
            }

            /* access modifiers changed from: private */
            public void clearTokenId() {
                this.tokenId_ = getDefaultInstance().getTokenId();
            }

            /* access modifiers changed from: private */
            public void clearValue() {
                this.value_ = getDefaultInstance().getValue();
            }

            public static ERC1155Transfer getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static ERC1155Transfer parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (ERC1155Transfer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ERC1155Transfer parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (ERC1155Transfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<ERC1155Transfer> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setData(ByteString byteString) {
                byteString.getClass();
                this.data_ = byteString;
            }

            /* access modifiers changed from: private */
            public void setFrom(String str) {
                str.getClass();
                this.from_ = str;
            }

            /* access modifiers changed from: private */
            public void setFromBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.from_ = byteString.toStringUtf8();
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
            public void setTokenId(ByteString byteString) {
                byteString.getClass();
                this.tokenId_ = byteString;
            }

            /* access modifiers changed from: private */
            public void setValue(ByteString byteString) {
                byteString.getClass();
                this.value_ = byteString;
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97411.f46553xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ERC1155Transfer();
                    case 2:
                        return new Builder((C97411) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\n\u0004\n\u0005\n", new Object[]{"from_", "to_", "tokenId_", "value_", "data_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<ERC1155Transfer> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (ERC1155Transfer.class) {
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

            public ByteString getData() {
                return this.data_;
            }

            public String getFrom() {
                return this.from_;
            }

            public ByteString getFromBytes() {
                return ByteString.copyFromUtf8(this.from_);
            }

            public String getTo() {
                return this.to_;
            }

            public ByteString getToBytes() {
                return ByteString.copyFromUtf8(this.to_);
            }

            public ByteString getTokenId() {
                return this.tokenId_;
            }

            public ByteString getValue() {
                return this.value_;
            }

            public static Builder newBuilder(ERC1155Transfer eRC1155Transfer) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(eRC1155Transfer);
            }

            public static ERC1155Transfer parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (ERC1155Transfer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static ERC1155Transfer parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (ERC1155Transfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static ERC1155Transfer parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (ERC1155Transfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ERC1155Transfer parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (ERC1155Transfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static ERC1155Transfer parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (ERC1155Transfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ERC1155Transfer parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (ERC1155Transfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static ERC1155Transfer parseFrom(InputStream inputStream) throws IOException {
                return (ERC1155Transfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ERC1155Transfer parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (ERC1155Transfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static ERC1155Transfer parseFrom(C4969g gVar) throws IOException {
                return (ERC1155Transfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static ERC1155Transfer parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (ERC1155Transfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public interface ERC1155TransferOrBuilder extends qu3 {
            ByteString getData();

            /* synthetic */ C4956c0 getDefaultInstanceForType();

            String getFrom();

            ByteString getFromBytes();

            String getTo();

            ByteString getToBytes();

            ByteString getTokenId();

            ByteString getValue();

            /* synthetic */ boolean isInitialized();
        }

        public static final class ERC20Approve extends GeneratedMessageLite<ERC20Approve, Builder> implements ERC20ApproveOrBuilder {
            public static final int AMOUNT_FIELD_NUMBER = 2;
            /* access modifiers changed from: private */
            public static final ERC20Approve DEFAULT_INSTANCE;
            private static volatile im4<ERC20Approve> PARSER = null;
            public static final int SPENDER_FIELD_NUMBER = 1;
            private ByteString amount_ = ByteString.EMPTY;
            private String spender_ = "";

            public static final class Builder extends GeneratedMessageLite.C4930a<ERC20Approve, Builder> implements ERC20ApproveOrBuilder {
                public /* synthetic */ Builder(C97411 r1) {
                    this();
                }

                public Builder clearAmount() {
                    copyOnWrite();
                    ((ERC20Approve) this.instance).clearAmount();
                    return this;
                }

                public Builder clearSpender() {
                    copyOnWrite();
                    ((ERC20Approve) this.instance).clearSpender();
                    return this;
                }

                public ByteString getAmount() {
                    return ((ERC20Approve) this.instance).getAmount();
                }

                public String getSpender() {
                    return ((ERC20Approve) this.instance).getSpender();
                }

                public ByteString getSpenderBytes() {
                    return ((ERC20Approve) this.instance).getSpenderBytes();
                }

                public Builder setAmount(ByteString byteString) {
                    copyOnWrite();
                    ((ERC20Approve) this.instance).setAmount(byteString);
                    return this;
                }

                public Builder setSpender(String str) {
                    copyOnWrite();
                    ((ERC20Approve) this.instance).setSpender(str);
                    return this;
                }

                public Builder setSpenderBytes(ByteString byteString) {
                    copyOnWrite();
                    ((ERC20Approve) this.instance).setSpenderBytes(byteString);
                    return this;
                }

                private Builder() {
                    super(ERC20Approve.DEFAULT_INSTANCE);
                }
            }

            static {
                ERC20Approve eRC20Approve = new ERC20Approve();
                DEFAULT_INSTANCE = eRC20Approve;
                GeneratedMessageLite.registerDefaultInstance(ERC20Approve.class, eRC20Approve);
            }

            private ERC20Approve() {
            }

            /* access modifiers changed from: private */
            public void clearAmount() {
                this.amount_ = getDefaultInstance().getAmount();
            }

            /* access modifiers changed from: private */
            public void clearSpender() {
                this.spender_ = getDefaultInstance().getSpender();
            }

            public static ERC20Approve getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static ERC20Approve parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (ERC20Approve) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ERC20Approve parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (ERC20Approve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<ERC20Approve> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setAmount(ByteString byteString) {
                byteString.getClass();
                this.amount_ = byteString;
            }

            /* access modifiers changed from: private */
            public void setSpender(String str) {
                str.getClass();
                this.spender_ = str;
            }

            /* access modifiers changed from: private */
            public void setSpenderBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.spender_ = byteString.toStringUtf8();
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97411.f46553xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ERC20Approve();
                    case 2:
                        return new Builder((C97411) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"spender_", "amount_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<ERC20Approve> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (ERC20Approve.class) {
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

            public String getSpender() {
                return this.spender_;
            }

            public ByteString getSpenderBytes() {
                return ByteString.copyFromUtf8(this.spender_);
            }

            public static Builder newBuilder(ERC20Approve eRC20Approve) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(eRC20Approve);
            }

            public static ERC20Approve parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (ERC20Approve) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static ERC20Approve parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (ERC20Approve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static ERC20Approve parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (ERC20Approve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ERC20Approve parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (ERC20Approve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static ERC20Approve parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (ERC20Approve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ERC20Approve parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (ERC20Approve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static ERC20Approve parseFrom(InputStream inputStream) throws IOException {
                return (ERC20Approve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ERC20Approve parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (ERC20Approve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static ERC20Approve parseFrom(C4969g gVar) throws IOException {
                return (ERC20Approve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static ERC20Approve parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (ERC20Approve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public interface ERC20ApproveOrBuilder extends qu3 {
            ByteString getAmount();

            /* synthetic */ C4956c0 getDefaultInstanceForType();

            String getSpender();

            ByteString getSpenderBytes();

            /* synthetic */ boolean isInitialized();
        }

        public static final class ERC20Transfer extends GeneratedMessageLite<ERC20Transfer, Builder> implements ERC20TransferOrBuilder {
            public static final int AMOUNT_FIELD_NUMBER = 2;
            /* access modifiers changed from: private */
            public static final ERC20Transfer DEFAULT_INSTANCE;
            private static volatile im4<ERC20Transfer> PARSER = null;
            public static final int TO_FIELD_NUMBER = 1;
            private ByteString amount_ = ByteString.EMPTY;
            private String to_ = "";

            public static final class Builder extends GeneratedMessageLite.C4930a<ERC20Transfer, Builder> implements ERC20TransferOrBuilder {
                public /* synthetic */ Builder(C97411 r1) {
                    this();
                }

                public Builder clearAmount() {
                    copyOnWrite();
                    ((ERC20Transfer) this.instance).clearAmount();
                    return this;
                }

                public Builder clearTo() {
                    copyOnWrite();
                    ((ERC20Transfer) this.instance).clearTo();
                    return this;
                }

                public ByteString getAmount() {
                    return ((ERC20Transfer) this.instance).getAmount();
                }

                public String getTo() {
                    return ((ERC20Transfer) this.instance).getTo();
                }

                public ByteString getToBytes() {
                    return ((ERC20Transfer) this.instance).getToBytes();
                }

                public Builder setAmount(ByteString byteString) {
                    copyOnWrite();
                    ((ERC20Transfer) this.instance).setAmount(byteString);
                    return this;
                }

                public Builder setTo(String str) {
                    copyOnWrite();
                    ((ERC20Transfer) this.instance).setTo(str);
                    return this;
                }

                public Builder setToBytes(ByteString byteString) {
                    copyOnWrite();
                    ((ERC20Transfer) this.instance).setToBytes(byteString);
                    return this;
                }

                private Builder() {
                    super(ERC20Transfer.DEFAULT_INSTANCE);
                }
            }

            static {
                ERC20Transfer eRC20Transfer = new ERC20Transfer();
                DEFAULT_INSTANCE = eRC20Transfer;
                GeneratedMessageLite.registerDefaultInstance(ERC20Transfer.class, eRC20Transfer);
            }

            private ERC20Transfer() {
            }

            /* access modifiers changed from: private */
            public void clearAmount() {
                this.amount_ = getDefaultInstance().getAmount();
            }

            /* access modifiers changed from: private */
            public void clearTo() {
                this.to_ = getDefaultInstance().getTo();
            }

            public static ERC20Transfer getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static ERC20Transfer parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (ERC20Transfer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ERC20Transfer parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (ERC20Transfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<ERC20Transfer> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setAmount(ByteString byteString) {
                byteString.getClass();
                this.amount_ = byteString;
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

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97411.f46553xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ERC20Transfer();
                    case 2:
                        return new Builder((C97411) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"to_", "amount_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<ERC20Transfer> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (ERC20Transfer.class) {
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

            public String getTo() {
                return this.to_;
            }

            public ByteString getToBytes() {
                return ByteString.copyFromUtf8(this.to_);
            }

            public static Builder newBuilder(ERC20Transfer eRC20Transfer) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(eRC20Transfer);
            }

            public static ERC20Transfer parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (ERC20Transfer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static ERC20Transfer parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (ERC20Transfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static ERC20Transfer parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (ERC20Transfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ERC20Transfer parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (ERC20Transfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static ERC20Transfer parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (ERC20Transfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ERC20Transfer parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (ERC20Transfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static ERC20Transfer parseFrom(InputStream inputStream) throws IOException {
                return (ERC20Transfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ERC20Transfer parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (ERC20Transfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static ERC20Transfer parseFrom(C4969g gVar) throws IOException {
                return (ERC20Transfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static ERC20Transfer parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (ERC20Transfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public interface ERC20TransferOrBuilder extends qu3 {
            ByteString getAmount();

            /* synthetic */ C4956c0 getDefaultInstanceForType();

            String getTo();

            ByteString getToBytes();

            /* synthetic */ boolean isInitialized();
        }

        public static final class ERC721Transfer extends GeneratedMessageLite<ERC721Transfer, Builder> implements ERC721TransferOrBuilder {
            /* access modifiers changed from: private */
            public static final ERC721Transfer DEFAULT_INSTANCE;
            public static final int FROM_FIELD_NUMBER = 1;
            private static volatile im4<ERC721Transfer> PARSER = null;
            public static final int TOKEN_ID_FIELD_NUMBER = 3;
            public static final int TO_FIELD_NUMBER = 2;
            private String from_ = "";
            private String to_ = "";
            private ByteString tokenId_ = ByteString.EMPTY;

            public static final class Builder extends GeneratedMessageLite.C4930a<ERC721Transfer, Builder> implements ERC721TransferOrBuilder {
                public /* synthetic */ Builder(C97411 r1) {
                    this();
                }

                public Builder clearFrom() {
                    copyOnWrite();
                    ((ERC721Transfer) this.instance).clearFrom();
                    return this;
                }

                public Builder clearTo() {
                    copyOnWrite();
                    ((ERC721Transfer) this.instance).clearTo();
                    return this;
                }

                public Builder clearTokenId() {
                    copyOnWrite();
                    ((ERC721Transfer) this.instance).clearTokenId();
                    return this;
                }

                public String getFrom() {
                    return ((ERC721Transfer) this.instance).getFrom();
                }

                public ByteString getFromBytes() {
                    return ((ERC721Transfer) this.instance).getFromBytes();
                }

                public String getTo() {
                    return ((ERC721Transfer) this.instance).getTo();
                }

                public ByteString getToBytes() {
                    return ((ERC721Transfer) this.instance).getToBytes();
                }

                public ByteString getTokenId() {
                    return ((ERC721Transfer) this.instance).getTokenId();
                }

                public Builder setFrom(String str) {
                    copyOnWrite();
                    ((ERC721Transfer) this.instance).setFrom(str);
                    return this;
                }

                public Builder setFromBytes(ByteString byteString) {
                    copyOnWrite();
                    ((ERC721Transfer) this.instance).setFromBytes(byteString);
                    return this;
                }

                public Builder setTo(String str) {
                    copyOnWrite();
                    ((ERC721Transfer) this.instance).setTo(str);
                    return this;
                }

                public Builder setToBytes(ByteString byteString) {
                    copyOnWrite();
                    ((ERC721Transfer) this.instance).setToBytes(byteString);
                    return this;
                }

                public Builder setTokenId(ByteString byteString) {
                    copyOnWrite();
                    ((ERC721Transfer) this.instance).setTokenId(byteString);
                    return this;
                }

                private Builder() {
                    super(ERC721Transfer.DEFAULT_INSTANCE);
                }
            }

            static {
                ERC721Transfer eRC721Transfer = new ERC721Transfer();
                DEFAULT_INSTANCE = eRC721Transfer;
                GeneratedMessageLite.registerDefaultInstance(ERC721Transfer.class, eRC721Transfer);
            }

            private ERC721Transfer() {
            }

            /* access modifiers changed from: private */
            public void clearFrom() {
                this.from_ = getDefaultInstance().getFrom();
            }

            /* access modifiers changed from: private */
            public void clearTo() {
                this.to_ = getDefaultInstance().getTo();
            }

            /* access modifiers changed from: private */
            public void clearTokenId() {
                this.tokenId_ = getDefaultInstance().getTokenId();
            }

            public static ERC721Transfer getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static ERC721Transfer parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (ERC721Transfer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ERC721Transfer parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (ERC721Transfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<ERC721Transfer> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setFrom(String str) {
                str.getClass();
                this.from_ = str;
            }

            /* access modifiers changed from: private */
            public void setFromBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.from_ = byteString.toStringUtf8();
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
            public void setTokenId(ByteString byteString) {
                byteString.getClass();
                this.tokenId_ = byteString;
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97411.f46553xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ERC721Transfer();
                    case 2:
                        return new Builder((C97411) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\n", new Object[]{"from_", "to_", "tokenId_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<ERC721Transfer> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (ERC721Transfer.class) {
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

            public String getFrom() {
                return this.from_;
            }

            public ByteString getFromBytes() {
                return ByteString.copyFromUtf8(this.from_);
            }

            public String getTo() {
                return this.to_;
            }

            public ByteString getToBytes() {
                return ByteString.copyFromUtf8(this.to_);
            }

            public ByteString getTokenId() {
                return this.tokenId_;
            }

            public static Builder newBuilder(ERC721Transfer eRC721Transfer) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(eRC721Transfer);
            }

            public static ERC721Transfer parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (ERC721Transfer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static ERC721Transfer parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (ERC721Transfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static ERC721Transfer parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (ERC721Transfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ERC721Transfer parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (ERC721Transfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static ERC721Transfer parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (ERC721Transfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ERC721Transfer parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (ERC721Transfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static ERC721Transfer parseFrom(InputStream inputStream) throws IOException {
                return (ERC721Transfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ERC721Transfer parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (ERC721Transfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static ERC721Transfer parseFrom(C4969g gVar) throws IOException {
                return (ERC721Transfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static ERC721Transfer parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (ERC721Transfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public interface ERC721TransferOrBuilder extends qu3 {
            /* synthetic */ C4956c0 getDefaultInstanceForType();

            String getFrom();

            ByteString getFromBytes();

            String getTo();

            ByteString getToBytes();

            ByteString getTokenId();

            /* synthetic */ boolean isInitialized();
        }

        public enum TransactionOneofCase {
            TRANSFER(1),
            ERC20_TRANSFER(2),
            ERC20_APPROVE(3),
            ERC721_TRANSFER(4),
            ERC1155_TRANSFER(5),
            CONTRACT_GENERIC(6),
            TRANSACTIONONEOF_NOT_SET(0);
            
            private final int value;

            private TransactionOneofCase(int i) {
                this.value = i;
            }

            public static TransactionOneofCase forNumber(int i) {
                switch (i) {
                    case 0:
                        return TRANSACTIONONEOF_NOT_SET;
                    case 1:
                        return TRANSFER;
                    case 2:
                        return ERC20_TRANSFER;
                    case 3:
                        return ERC20_APPROVE;
                    case 4:
                        return ERC721_TRANSFER;
                    case 5:
                        return ERC1155_TRANSFER;
                    case 6:
                        return CONTRACT_GENERIC;
                    default:
                        return null;
                }
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static TransactionOneofCase valueOf(int i) {
                return forNumber(i);
            }
        }

        public static final class Transfer extends GeneratedMessageLite<Transfer, Builder> implements TransferOrBuilder {
            public static final int AMOUNT_FIELD_NUMBER = 1;
            public static final int DATA_FIELD_NUMBER = 2;
            /* access modifiers changed from: private */
            public static final Transfer DEFAULT_INSTANCE;
            private static volatile im4<Transfer> PARSER;
            private ByteString amount_;
            private ByteString data_;

            public static final class Builder extends GeneratedMessageLite.C4930a<Transfer, Builder> implements TransferOrBuilder {
                public /* synthetic */ Builder(C97411 r1) {
                    this();
                }

                public Builder clearAmount() {
                    copyOnWrite();
                    ((Transfer) this.instance).clearAmount();
                    return this;
                }

                public Builder clearData() {
                    copyOnWrite();
                    ((Transfer) this.instance).clearData();
                    return this;
                }

                public ByteString getAmount() {
                    return ((Transfer) this.instance).getAmount();
                }

                public ByteString getData() {
                    return ((Transfer) this.instance).getData();
                }

                public Builder setAmount(ByteString byteString) {
                    copyOnWrite();
                    ((Transfer) this.instance).setAmount(byteString);
                    return this;
                }

                public Builder setData(ByteString byteString) {
                    copyOnWrite();
                    ((Transfer) this.instance).setData(byteString);
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
                ByteString byteString = ByteString.EMPTY;
                this.amount_ = byteString;
                this.data_ = byteString;
            }

            /* access modifiers changed from: private */
            public void clearAmount() {
                this.amount_ = getDefaultInstance().getAmount();
            }

            /* access modifiers changed from: private */
            public void clearData() {
                this.data_ = getDefaultInstance().getData();
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

            /* access modifiers changed from: private */
            public void setData(ByteString byteString) {
                byteString.getClass();
                this.data_ = byteString;
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97411.f46553xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Transfer();
                    case 2:
                        return new Builder((C97411) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\n", new Object[]{"amount_", "data_"});
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

            public ByteString getData() {
                return this.data_;
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

            ByteString getData();

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
        public void clearContractGeneric() {
            if (this.transactionOneofCase_ == 6) {
                this.transactionOneofCase_ = 0;
                this.transactionOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearErc1155Transfer() {
            if (this.transactionOneofCase_ == 5) {
                this.transactionOneofCase_ = 0;
                this.transactionOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearErc20Approve() {
            if (this.transactionOneofCase_ == 3) {
                this.transactionOneofCase_ = 0;
                this.transactionOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearErc20Transfer() {
            if (this.transactionOneofCase_ == 2) {
                this.transactionOneofCase_ = 0;
                this.transactionOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearErc721Transfer() {
            if (this.transactionOneofCase_ == 4) {
                this.transactionOneofCase_ = 0;
                this.transactionOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearTransactionOneof() {
            this.transactionOneofCase_ = 0;
            this.transactionOneof_ = null;
        }

        /* access modifiers changed from: private */
        public void clearTransfer() {
            if (this.transactionOneofCase_ == 1) {
                this.transactionOneofCase_ = 0;
                this.transactionOneof_ = null;
            }
        }

        public static Transaction getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeContractGeneric(ContractGeneric contractGeneric) {
            contractGeneric.getClass();
            if (this.transactionOneofCase_ != 6 || this.transactionOneof_ == ContractGeneric.getDefaultInstance()) {
                this.transactionOneof_ = contractGeneric;
            } else {
                this.transactionOneof_ = ((ContractGeneric.Builder) ContractGeneric.newBuilder((ContractGeneric) this.transactionOneof_).mergeFrom(contractGeneric)).buildPartial();
            }
            this.transactionOneofCase_ = 6;
        }

        /* access modifiers changed from: private */
        public void mergeErc1155Transfer(ERC1155Transfer eRC1155Transfer) {
            eRC1155Transfer.getClass();
            if (this.transactionOneofCase_ != 5 || this.transactionOneof_ == ERC1155Transfer.getDefaultInstance()) {
                this.transactionOneof_ = eRC1155Transfer;
            } else {
                this.transactionOneof_ = ((ERC1155Transfer.Builder) ERC1155Transfer.newBuilder((ERC1155Transfer) this.transactionOneof_).mergeFrom(eRC1155Transfer)).buildPartial();
            }
            this.transactionOneofCase_ = 5;
        }

        /* access modifiers changed from: private */
        public void mergeErc20Approve(ERC20Approve eRC20Approve) {
            eRC20Approve.getClass();
            if (this.transactionOneofCase_ != 3 || this.transactionOneof_ == ERC20Approve.getDefaultInstance()) {
                this.transactionOneof_ = eRC20Approve;
            } else {
                this.transactionOneof_ = ((ERC20Approve.Builder) ERC20Approve.newBuilder((ERC20Approve) this.transactionOneof_).mergeFrom(eRC20Approve)).buildPartial();
            }
            this.transactionOneofCase_ = 3;
        }

        /* access modifiers changed from: private */
        public void mergeErc20Transfer(ERC20Transfer eRC20Transfer) {
            eRC20Transfer.getClass();
            if (this.transactionOneofCase_ != 2 || this.transactionOneof_ == ERC20Transfer.getDefaultInstance()) {
                this.transactionOneof_ = eRC20Transfer;
            } else {
                this.transactionOneof_ = ((ERC20Transfer.Builder) ERC20Transfer.newBuilder((ERC20Transfer) this.transactionOneof_).mergeFrom(eRC20Transfer)).buildPartial();
            }
            this.transactionOneofCase_ = 2;
        }

        /* access modifiers changed from: private */
        public void mergeErc721Transfer(ERC721Transfer eRC721Transfer) {
            eRC721Transfer.getClass();
            if (this.transactionOneofCase_ != 4 || this.transactionOneof_ == ERC721Transfer.getDefaultInstance()) {
                this.transactionOneof_ = eRC721Transfer;
            } else {
                this.transactionOneof_ = ((ERC721Transfer.Builder) ERC721Transfer.newBuilder((ERC721Transfer) this.transactionOneof_).mergeFrom(eRC721Transfer)).buildPartial();
            }
            this.transactionOneofCase_ = 4;
        }

        /* access modifiers changed from: private */
        public void mergeTransfer(Transfer transfer) {
            transfer.getClass();
            if (this.transactionOneofCase_ != 1 || this.transactionOneof_ == Transfer.getDefaultInstance()) {
                this.transactionOneof_ = transfer;
            } else {
                this.transactionOneof_ = ((Transfer.Builder) Transfer.newBuilder((Transfer) this.transactionOneof_).mergeFrom(transfer)).buildPartial();
            }
            this.transactionOneofCase_ = 1;
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
        public void setContractGeneric(ContractGeneric contractGeneric) {
            contractGeneric.getClass();
            this.transactionOneof_ = contractGeneric;
            this.transactionOneofCase_ = 6;
        }

        /* access modifiers changed from: private */
        public void setErc1155Transfer(ERC1155Transfer eRC1155Transfer) {
            eRC1155Transfer.getClass();
            this.transactionOneof_ = eRC1155Transfer;
            this.transactionOneofCase_ = 5;
        }

        /* access modifiers changed from: private */
        public void setErc20Approve(ERC20Approve eRC20Approve) {
            eRC20Approve.getClass();
            this.transactionOneof_ = eRC20Approve;
            this.transactionOneofCase_ = 3;
        }

        /* access modifiers changed from: private */
        public void setErc20Transfer(ERC20Transfer eRC20Transfer) {
            eRC20Transfer.getClass();
            this.transactionOneof_ = eRC20Transfer;
            this.transactionOneofCase_ = 2;
        }

        /* access modifiers changed from: private */
        public void setErc721Transfer(ERC721Transfer eRC721Transfer) {
            eRC721Transfer.getClass();
            this.transactionOneof_ = eRC721Transfer;
            this.transactionOneofCase_ = 4;
        }

        /* access modifiers changed from: private */
        public void setTransfer(Transfer transfer) {
            transfer.getClass();
            this.transactionOneof_ = transfer;
            this.transactionOneofCase_ = 1;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97411.f46553xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Transaction();
                case 2:
                    return new Builder((C97411) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"transactionOneof_", "transactionOneofCase_", Transfer.class, ERC20Transfer.class, ERC20Approve.class, ERC721Transfer.class, ERC1155Transfer.class, ContractGeneric.class});
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

        public ContractGeneric getContractGeneric() {
            if (this.transactionOneofCase_ == 6) {
                return (ContractGeneric) this.transactionOneof_;
            }
            return ContractGeneric.getDefaultInstance();
        }

        public ERC1155Transfer getErc1155Transfer() {
            if (this.transactionOneofCase_ == 5) {
                return (ERC1155Transfer) this.transactionOneof_;
            }
            return ERC1155Transfer.getDefaultInstance();
        }

        public ERC20Approve getErc20Approve() {
            if (this.transactionOneofCase_ == 3) {
                return (ERC20Approve) this.transactionOneof_;
            }
            return ERC20Approve.getDefaultInstance();
        }

        public ERC20Transfer getErc20Transfer() {
            if (this.transactionOneofCase_ == 2) {
                return (ERC20Transfer) this.transactionOneof_;
            }
            return ERC20Transfer.getDefaultInstance();
        }

        public ERC721Transfer getErc721Transfer() {
            if (this.transactionOneofCase_ == 4) {
                return (ERC721Transfer) this.transactionOneof_;
            }
            return ERC721Transfer.getDefaultInstance();
        }

        public TransactionOneofCase getTransactionOneofCase() {
            return TransactionOneofCase.forNumber(this.transactionOneofCase_);
        }

        public Transfer getTransfer() {
            if (this.transactionOneofCase_ == 1) {
                return (Transfer) this.transactionOneof_;
            }
            return Transfer.getDefaultInstance();
        }

        public boolean hasContractGeneric() {
            if (this.transactionOneofCase_ == 6) {
                return true;
            }
            return false;
        }

        public boolean hasErc1155Transfer() {
            if (this.transactionOneofCase_ == 5) {
                return true;
            }
            return false;
        }

        public boolean hasErc20Approve() {
            if (this.transactionOneofCase_ == 3) {
                return true;
            }
            return false;
        }

        public boolean hasErc20Transfer() {
            if (this.transactionOneofCase_ == 2) {
                return true;
            }
            return false;
        }

        public boolean hasErc721Transfer() {
            if (this.transactionOneofCase_ == 4) {
                return true;
            }
            return false;
        }

        public boolean hasTransfer() {
            if (this.transactionOneofCase_ == 1) {
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

    public enum TransactionMode implements C5011t.C5014c {
        Legacy(0),
        Enveloped(1),
        UNRECOGNIZED(-1);
        
        public static final int Enveloped_VALUE = 1;
        public static final int Legacy_VALUE = 0;
        private static final C5011t.C5015d<TransactionMode> internalValueMap = null;
        private final int value;

        public static final class TransactionModeVerifier implements C5011t.C5016e {
            public static final C5011t.C5016e INSTANCE = null;

            static {
                INSTANCE = new TransactionModeVerifier();
            }

            private TransactionModeVerifier() {
            }

            public boolean isInRange(int i) {
                if (TransactionMode.forNumber(i) != null) {
                    return true;
                }
                return false;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C5011t.C5015d<TransactionMode>() {
                public TransactionMode findValueByNumber(int i) {
                    return TransactionMode.forNumber(i);
                }
            };
        }

        private TransactionMode(int i) {
            this.value = i;
        }

        public static TransactionMode forNumber(int i) {
            if (i == 0) {
                return Legacy;
            }
            if (i != 1) {
                return null;
            }
            return Enveloped;
        }

        public static C5011t.C5015d<TransactionMode> internalGetValueMap() {
            return internalValueMap;
        }

        public static C5011t.C5016e internalGetVerifier() {
            return TransactionModeVerifier.INSTANCE;
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static TransactionMode valueOf(int i) {
            return forNumber(i);
        }
    }

    public interface TransactionOrBuilder extends qu3 {
        Transaction.ContractGeneric getContractGeneric();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        Transaction.ERC1155Transfer getErc1155Transfer();

        Transaction.ERC20Approve getErc20Approve();

        Transaction.ERC20Transfer getErc20Transfer();

        Transaction.ERC721Transfer getErc721Transfer();

        Transaction.TransactionOneofCase getTransactionOneofCase();

        Transaction.Transfer getTransfer();

        boolean hasContractGeneric();

        boolean hasErc1155Transfer();

        boolean hasErc20Approve();

        boolean hasErc20Transfer();

        boolean hasErc721Transfer();

        boolean hasTransfer();

        /* synthetic */ boolean isInitialized();
    }

    private Ethereum() {
    }

    public static void registerAllExtensions(C4987l lVar) {
    }
}
