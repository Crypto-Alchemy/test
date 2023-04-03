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

public final class Aeternity {

    /* renamed from: wallet.core.jni.proto.Aeternity$1 */
    public static /* synthetic */ class C97241 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f46540xa1df5c61;

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
                f46540xa1df5c61 = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f46540xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f46540xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f46540xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f46540xa1df5c61     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f46540xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f46540xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wallet.core.jni.proto.Aeternity.C97241.<clinit>():void");
        }
    }

    public static final class SigningInput extends GeneratedMessageLite<SigningInput, Builder> implements SigningInputOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final SigningInput DEFAULT_INSTANCE;
        public static final int FEE_FIELD_NUMBER = 4;
        public static final int FROM_ADDRESS_FIELD_NUMBER = 1;
        public static final int NONCE_FIELD_NUMBER = 7;
        private static volatile im4<SigningInput> PARSER = null;
        public static final int PAYLOAD_FIELD_NUMBER = 5;
        public static final int PRIVATE_KEY_FIELD_NUMBER = 8;
        public static final int TO_ADDRESS_FIELD_NUMBER = 2;
        public static final int TTL_FIELD_NUMBER = 6;
        private ByteString amount_;
        private ByteString fee_;
        private String fromAddress_ = "";
        private long nonce_;
        private String payload_;
        private ByteString privateKey_;
        private String toAddress_ = "";
        private long ttl_;

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningInput, Builder> implements SigningInputOrBuilder {
            public /* synthetic */ Builder(C97241 r1) {
                this();
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((SigningInput) this.instance).clearAmount();
                return this;
            }

            public Builder clearFee() {
                copyOnWrite();
                ((SigningInput) this.instance).clearFee();
                return this;
            }

            public Builder clearFromAddress() {
                copyOnWrite();
                ((SigningInput) this.instance).clearFromAddress();
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

            public Builder clearToAddress() {
                copyOnWrite();
                ((SigningInput) this.instance).clearToAddress();
                return this;
            }

            public Builder clearTtl() {
                copyOnWrite();
                ((SigningInput) this.instance).clearTtl();
                return this;
            }

            public ByteString getAmount() {
                return ((SigningInput) this.instance).getAmount();
            }

            public ByteString getFee() {
                return ((SigningInput) this.instance).getFee();
            }

            public String getFromAddress() {
                return ((SigningInput) this.instance).getFromAddress();
            }

            public ByteString getFromAddressBytes() {
                return ((SigningInput) this.instance).getFromAddressBytes();
            }

            public long getNonce() {
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

            public String getToAddress() {
                return ((SigningInput) this.instance).getToAddress();
            }

            public ByteString getToAddressBytes() {
                return ((SigningInput) this.instance).getToAddressBytes();
            }

            public long getTtl() {
                return ((SigningInput) this.instance).getTtl();
            }

            public Builder setAmount(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setAmount(byteString);
                return this;
            }

            public Builder setFee(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setFee(byteString);
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

            public Builder setNonce(long j) {
                copyOnWrite();
                ((SigningInput) this.instance).setNonce(j);
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

            public Builder setTtl(long j) {
                copyOnWrite();
                ((SigningInput) this.instance).setTtl(j);
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
            this.amount_ = byteString;
            this.fee_ = byteString;
            this.payload_ = "";
            this.privateKey_ = byteString;
        }

        /* access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = getDefaultInstance().getAmount();
        }

        /* access modifiers changed from: private */
        public void clearFee() {
            this.fee_ = getDefaultInstance().getFee();
        }

        /* access modifiers changed from: private */
        public void clearFromAddress() {
            this.fromAddress_ = getDefaultInstance().getFromAddress();
        }

        /* access modifiers changed from: private */
        public void clearNonce() {
            this.nonce_ = 0;
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
        public void clearToAddress() {
            this.toAddress_ = getDefaultInstance().getToAddress();
        }

        /* access modifiers changed from: private */
        public void clearTtl() {
            this.ttl_ = 0;
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
        public void setFee(ByteString byteString) {
            byteString.getClass();
            this.fee_ = byteString;
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
        public void setNonce(long j) {
            this.nonce_ = j;
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
        public void setTtl(long j) {
            this.ttl_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97241.f46540xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningInput();
                case 2:
                    return new Builder((C97241) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\n\u0004\n\u0005Ȉ\u0006\u0003\u0007\u0003\b\n", new Object[]{"fromAddress_", "toAddress_", "amount_", "fee_", "payload_", "ttl_", "nonce_", "privateKey_"});
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

        public ByteString getFee() {
            return this.fee_;
        }

        public String getFromAddress() {
            return this.fromAddress_;
        }

        public ByteString getFromAddressBytes() {
            return ByteString.copyFromUtf8(this.fromAddress_);
        }

        public long getNonce() {
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

        public String getToAddress() {
            return this.toAddress_;
        }

        public ByteString getToAddressBytes() {
            return ByteString.copyFromUtf8(this.toAddress_);
        }

        public long getTtl() {
            return this.ttl_;
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

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        ByteString getFee();

        String getFromAddress();

        ByteString getFromAddressBytes();

        long getNonce();

        String getPayload();

        ByteString getPayloadBytes();

        ByteString getPrivateKey();

        String getToAddress();

        ByteString getToAddressBytes();

        long getTtl();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SigningOutput extends GeneratedMessageLite<SigningOutput, Builder> implements SigningOutputOrBuilder {
        /* access modifiers changed from: private */
        public static final SigningOutput DEFAULT_INSTANCE;
        public static final int ENCODED_FIELD_NUMBER = 1;
        private static volatile im4<SigningOutput> PARSER = null;
        public static final int SIGNATURE_FIELD_NUMBER = 2;
        private String encoded_ = "";
        private String signature_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningOutput, Builder> implements SigningOutputOrBuilder {
            public /* synthetic */ Builder(C97241 r1) {
                this();
            }

            public Builder clearEncoded() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearEncoded();
                return this;
            }

            public Builder clearSignature() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearSignature();
                return this;
            }

            public String getEncoded() {
                return ((SigningOutput) this.instance).getEncoded();
            }

            public ByteString getEncodedBytes() {
                return ((SigningOutput) this.instance).getEncodedBytes();
            }

            public String getSignature() {
                return ((SigningOutput) this.instance).getSignature();
            }

            public ByteString getSignatureBytes() {
                return ((SigningOutput) this.instance).getSignatureBytes();
            }

            public Builder setEncoded(String str) {
                copyOnWrite();
                ((SigningOutput) this.instance).setEncoded(str);
                return this;
            }

            public Builder setEncodedBytes(ByteString byteString) {
                copyOnWrite();
                ((SigningOutput) this.instance).setEncodedBytes(byteString);
                return this;
            }

            public Builder setSignature(String str) {
                copyOnWrite();
                ((SigningOutput) this.instance).setSignature(str);
                return this;
            }

            public Builder setSignatureBytes(ByteString byteString) {
                copyOnWrite();
                ((SigningOutput) this.instance).setSignatureBytes(byteString);
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
        public void setEncoded(String str) {
            str.getClass();
            this.encoded_ = str;
        }

        /* access modifiers changed from: private */
        public void setEncodedBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.encoded_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setSignature(String str) {
            str.getClass();
            this.signature_ = str;
        }

        /* access modifiers changed from: private */
        public void setSignatureBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.signature_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97241.f46540xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningOutput();
                case 2:
                    return new Builder((C97241) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"encoded_", "signature_"});
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

        public String getEncoded() {
            return this.encoded_;
        }

        public ByteString getEncodedBytes() {
            return ByteString.copyFromUtf8(this.encoded_);
        }

        public String getSignature() {
            return this.signature_;
        }

        public ByteString getSignatureBytes() {
            return ByteString.copyFromUtf8(this.signature_);
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

        String getEncoded();

        ByteString getEncodedBytes();

        String getSignature();

        ByteString getSignatureBytes();

        /* synthetic */ boolean isInitialized();
    }

    private Aeternity() {
    }

    public static void registerAllExtensions(C4987l lVar) {
    }
}
