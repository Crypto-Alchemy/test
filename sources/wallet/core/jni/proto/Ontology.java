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

public final class Ontology {

    /* renamed from: wallet.core.jni.proto.Ontology$1 */
    public static /* synthetic */ class C97591 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f46575xa1df5c61;

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
                f46575xa1df5c61 = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f46575xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f46575xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f46575xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f46575xa1df5c61     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f46575xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f46575xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wallet.core.jni.proto.Ontology.C97591.<clinit>():void");
        }
    }

    public static final class SigningInput extends GeneratedMessageLite<SigningInput, Builder> implements SigningInputOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 5;
        public static final int CONTRACT_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final SigningInput DEFAULT_INSTANCE;
        public static final int GAS_LIMIT_FIELD_NUMBER = 8;
        public static final int GAS_PRICE_FIELD_NUMBER = 7;
        public static final int METHOD_FIELD_NUMBER = 2;
        public static final int NONCE_FIELD_NUMBER = 10;
        public static final int OWNER_PRIVATE_KEY_FIELD_NUMBER = 3;
        private static volatile im4<SigningInput> PARSER = null;
        public static final int PAYER_PRIVATE_KEY_FIELD_NUMBER = 6;
        public static final int QUERY_ADDRESS_FIELD_NUMBER = 9;
        public static final int TO_ADDRESS_FIELD_NUMBER = 4;
        private long amount_;
        private String contract_ = "";
        private long gasLimit_;
        private long gasPrice_;
        private String method_ = "";
        private int nonce_;
        private ByteString ownerPrivateKey_;
        private ByteString payerPrivateKey_;
        private String queryAddress_;
        private String toAddress_;

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningInput, Builder> implements SigningInputOrBuilder {
            public /* synthetic */ Builder(C97591 r1) {
                this();
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((SigningInput) this.instance).clearAmount();
                return this;
            }

            public Builder clearContract() {
                copyOnWrite();
                ((SigningInput) this.instance).clearContract();
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

            public Builder clearMethod() {
                copyOnWrite();
                ((SigningInput) this.instance).clearMethod();
                return this;
            }

            public Builder clearNonce() {
                copyOnWrite();
                ((SigningInput) this.instance).clearNonce();
                return this;
            }

            public Builder clearOwnerPrivateKey() {
                copyOnWrite();
                ((SigningInput) this.instance).clearOwnerPrivateKey();
                return this;
            }

            public Builder clearPayerPrivateKey() {
                copyOnWrite();
                ((SigningInput) this.instance).clearPayerPrivateKey();
                return this;
            }

            public Builder clearQueryAddress() {
                copyOnWrite();
                ((SigningInput) this.instance).clearQueryAddress();
                return this;
            }

            public Builder clearToAddress() {
                copyOnWrite();
                ((SigningInput) this.instance).clearToAddress();
                return this;
            }

            public long getAmount() {
                return ((SigningInput) this.instance).getAmount();
            }

            public String getContract() {
                return ((SigningInput) this.instance).getContract();
            }

            public ByteString getContractBytes() {
                return ((SigningInput) this.instance).getContractBytes();
            }

            public long getGasLimit() {
                return ((SigningInput) this.instance).getGasLimit();
            }

            public long getGasPrice() {
                return ((SigningInput) this.instance).getGasPrice();
            }

            public String getMethod() {
                return ((SigningInput) this.instance).getMethod();
            }

            public ByteString getMethodBytes() {
                return ((SigningInput) this.instance).getMethodBytes();
            }

            public int getNonce() {
                return ((SigningInput) this.instance).getNonce();
            }

            public ByteString getOwnerPrivateKey() {
                return ((SigningInput) this.instance).getOwnerPrivateKey();
            }

            public ByteString getPayerPrivateKey() {
                return ((SigningInput) this.instance).getPayerPrivateKey();
            }

            public String getQueryAddress() {
                return ((SigningInput) this.instance).getQueryAddress();
            }

            public ByteString getQueryAddressBytes() {
                return ((SigningInput) this.instance).getQueryAddressBytes();
            }

            public String getToAddress() {
                return ((SigningInput) this.instance).getToAddress();
            }

            public ByteString getToAddressBytes() {
                return ((SigningInput) this.instance).getToAddressBytes();
            }

            public Builder setAmount(long j) {
                copyOnWrite();
                ((SigningInput) this.instance).setAmount(j);
                return this;
            }

            public Builder setContract(String str) {
                copyOnWrite();
                ((SigningInput) this.instance).setContract(str);
                return this;
            }

            public Builder setContractBytes(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setContractBytes(byteString);
                return this;
            }

            public Builder setGasLimit(long j) {
                copyOnWrite();
                ((SigningInput) this.instance).setGasLimit(j);
                return this;
            }

            public Builder setGasPrice(long j) {
                copyOnWrite();
                ((SigningInput) this.instance).setGasPrice(j);
                return this;
            }

            public Builder setMethod(String str) {
                copyOnWrite();
                ((SigningInput) this.instance).setMethod(str);
                return this;
            }

            public Builder setMethodBytes(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setMethodBytes(byteString);
                return this;
            }

            public Builder setNonce(int i) {
                copyOnWrite();
                ((SigningInput) this.instance).setNonce(i);
                return this;
            }

            public Builder setOwnerPrivateKey(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setOwnerPrivateKey(byteString);
                return this;
            }

            public Builder setPayerPrivateKey(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setPayerPrivateKey(byteString);
                return this;
            }

            public Builder setQueryAddress(String str) {
                copyOnWrite();
                ((SigningInput) this.instance).setQueryAddress(str);
                return this;
            }

            public Builder setQueryAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setQueryAddressBytes(byteString);
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
            this.ownerPrivateKey_ = byteString;
            this.toAddress_ = "";
            this.payerPrivateKey_ = byteString;
            this.queryAddress_ = "";
        }

        /* access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearContract() {
            this.contract_ = getDefaultInstance().getContract();
        }

        /* access modifiers changed from: private */
        public void clearGasLimit() {
            this.gasLimit_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearGasPrice() {
            this.gasPrice_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearMethod() {
            this.method_ = getDefaultInstance().getMethod();
        }

        /* access modifiers changed from: private */
        public void clearNonce() {
            this.nonce_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearOwnerPrivateKey() {
            this.ownerPrivateKey_ = getDefaultInstance().getOwnerPrivateKey();
        }

        /* access modifiers changed from: private */
        public void clearPayerPrivateKey() {
            this.payerPrivateKey_ = getDefaultInstance().getPayerPrivateKey();
        }

        /* access modifiers changed from: private */
        public void clearQueryAddress() {
            this.queryAddress_ = getDefaultInstance().getQueryAddress();
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
        public void setAmount(long j) {
            this.amount_ = j;
        }

        /* access modifiers changed from: private */
        public void setContract(String str) {
            str.getClass();
            this.contract_ = str;
        }

        /* access modifiers changed from: private */
        public void setContractBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.contract_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setGasLimit(long j) {
            this.gasLimit_ = j;
        }

        /* access modifiers changed from: private */
        public void setGasPrice(long j) {
            this.gasPrice_ = j;
        }

        /* access modifiers changed from: private */
        public void setMethod(String str) {
            str.getClass();
            this.method_ = str;
        }

        /* access modifiers changed from: private */
        public void setMethodBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.method_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setNonce(int i) {
            this.nonce_ = i;
        }

        /* access modifiers changed from: private */
        public void setOwnerPrivateKey(ByteString byteString) {
            byteString.getClass();
            this.ownerPrivateKey_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setPayerPrivateKey(ByteString byteString) {
            byteString.getClass();
            this.payerPrivateKey_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setQueryAddress(String str) {
            str.getClass();
            this.queryAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setQueryAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.queryAddress_ = byteString.toStringUtf8();
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
            switch (C97591.f46575xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningInput();
                case 2:
                    return new Builder((C97591) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\n\u0004Ȉ\u0005\u0003\u0006\n\u0007\u0003\b\u0003\tȈ\n\u000b", new Object[]{"contract_", "method_", "ownerPrivateKey_", "toAddress_", "amount_", "payerPrivateKey_", "gasPrice_", "gasLimit_", "queryAddress_", "nonce_"});
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

        public long getAmount() {
            return this.amount_;
        }

        public String getContract() {
            return this.contract_;
        }

        public ByteString getContractBytes() {
            return ByteString.copyFromUtf8(this.contract_);
        }

        public long getGasLimit() {
            return this.gasLimit_;
        }

        public long getGasPrice() {
            return this.gasPrice_;
        }

        public String getMethod() {
            return this.method_;
        }

        public ByteString getMethodBytes() {
            return ByteString.copyFromUtf8(this.method_);
        }

        public int getNonce() {
            return this.nonce_;
        }

        public ByteString getOwnerPrivateKey() {
            return this.ownerPrivateKey_;
        }

        public ByteString getPayerPrivateKey() {
            return this.payerPrivateKey_;
        }

        public String getQueryAddress() {
            return this.queryAddress_;
        }

        public ByteString getQueryAddressBytes() {
            return ByteString.copyFromUtf8(this.queryAddress_);
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
        long getAmount();

        String getContract();

        ByteString getContractBytes();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        long getGasLimit();

        long getGasPrice();

        String getMethod();

        ByteString getMethodBytes();

        int getNonce();

        ByteString getOwnerPrivateKey();

        ByteString getPayerPrivateKey();

        String getQueryAddress();

        ByteString getQueryAddressBytes();

        String getToAddress();

        ByteString getToAddressBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SigningOutput extends GeneratedMessageLite<SigningOutput, Builder> implements SigningOutputOrBuilder {
        /* access modifiers changed from: private */
        public static final SigningOutput DEFAULT_INSTANCE;
        public static final int ENCODED_FIELD_NUMBER = 1;
        private static volatile im4<SigningOutput> PARSER;
        private ByteString encoded_ = ByteString.EMPTY;

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningOutput, Builder> implements SigningOutputOrBuilder {
            public /* synthetic */ Builder(C97591 r1) {
                this();
            }

            public Builder clearEncoded() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearEncoded();
                return this;
            }

            public ByteString getEncoded() {
                return ((SigningOutput) this.instance).getEncoded();
            }

            public Builder setEncoded(ByteString byteString) {
                copyOnWrite();
                ((SigningOutput) this.instance).setEncoded(byteString);
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
        public void clearEncoded() {
            this.encoded_ = getDefaultInstance().getEncoded();
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
        public void setEncoded(ByteString byteString) {
            byteString.getClass();
            this.encoded_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97591.f46575xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningOutput();
                case 2:
                    return new Builder((C97591) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"encoded_"});
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

        public ByteString getEncoded() {
            return this.encoded_;
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

        ByteString getEncoded();

        /* synthetic */ boolean isInitialized();
    }

    private Ontology() {
    }

    public static void registerAllExtensions(C4987l lVar) {
    }
}
