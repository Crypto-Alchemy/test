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

public final class NULS {

    /* renamed from: wallet.core.jni.proto.NULS$1 */
    public static /* synthetic */ class C97531 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f46569xa1df5c61;

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
                f46569xa1df5c61 = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f46569xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f46569xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f46569xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f46569xa1df5c61     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f46569xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f46569xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wallet.core.jni.proto.NULS.C97531.<clinit>():void");
        }
    }

    public static final class Signature extends GeneratedMessageLite<Signature, Builder> implements SignatureOrBuilder {
        /* access modifiers changed from: private */
        public static final Signature DEFAULT_INSTANCE;
        private static volatile im4<Signature> PARSER = null;
        public static final int PKEY_LEN_FIELD_NUMBER = 1;
        public static final int PUBLIC_KEY_FIELD_NUMBER = 2;
        public static final int SIGNATURE_FIELD_NUMBER = 4;
        public static final int SIG_LEN_FIELD_NUMBER = 3;
        private int pkeyLen_;
        private ByteString publicKey_;
        private int sigLen_;
        private ByteString signature_;

        public static final class Builder extends GeneratedMessageLite.C4930a<Signature, Builder> implements SignatureOrBuilder {
            public /* synthetic */ Builder(C97531 r1) {
                this();
            }

            public Builder clearPkeyLen() {
                copyOnWrite();
                ((Signature) this.instance).clearPkeyLen();
                return this;
            }

            public Builder clearPublicKey() {
                copyOnWrite();
                ((Signature) this.instance).clearPublicKey();
                return this;
            }

            public Builder clearSigLen() {
                copyOnWrite();
                ((Signature) this.instance).clearSigLen();
                return this;
            }

            public Builder clearSignature() {
                copyOnWrite();
                ((Signature) this.instance).clearSignature();
                return this;
            }

            public int getPkeyLen() {
                return ((Signature) this.instance).getPkeyLen();
            }

            public ByteString getPublicKey() {
                return ((Signature) this.instance).getPublicKey();
            }

            public int getSigLen() {
                return ((Signature) this.instance).getSigLen();
            }

            public ByteString getSignature() {
                return ((Signature) this.instance).getSignature();
            }

            public Builder setPkeyLen(int i) {
                copyOnWrite();
                ((Signature) this.instance).setPkeyLen(i);
                return this;
            }

            public Builder setPublicKey(ByteString byteString) {
                copyOnWrite();
                ((Signature) this.instance).setPublicKey(byteString);
                return this;
            }

            public Builder setSigLen(int i) {
                copyOnWrite();
                ((Signature) this.instance).setSigLen(i);
                return this;
            }

            public Builder setSignature(ByteString byteString) {
                copyOnWrite();
                ((Signature) this.instance).setSignature(byteString);
                return this;
            }

            private Builder() {
                super(Signature.DEFAULT_INSTANCE);
            }
        }

        static {
            Signature signature = new Signature();
            DEFAULT_INSTANCE = signature;
            GeneratedMessageLite.registerDefaultInstance(Signature.class, signature);
        }

        private Signature() {
            ByteString byteString = ByteString.EMPTY;
            this.publicKey_ = byteString;
            this.signature_ = byteString;
        }

        /* access modifiers changed from: private */
        public void clearPkeyLen() {
            this.pkeyLen_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearPublicKey() {
            this.publicKey_ = getDefaultInstance().getPublicKey();
        }

        /* access modifiers changed from: private */
        public void clearSigLen() {
            this.sigLen_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSignature() {
            this.signature_ = getDefaultInstance().getSignature();
        }

        public static Signature getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Signature parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Signature) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Signature parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Signature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<Signature> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setPkeyLen(int i) {
            this.pkeyLen_ = i;
        }

        /* access modifiers changed from: private */
        public void setPublicKey(ByteString byteString) {
            byteString.getClass();
            this.publicKey_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setSigLen(int i) {
            this.sigLen_ = i;
        }

        /* access modifiers changed from: private */
        public void setSignature(ByteString byteString) {
            byteString.getClass();
            this.signature_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97531.f46569xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Signature();
                case 2:
                    return new Builder((C97531) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\u000b\u0004\n", new Object[]{"pkeyLen_", "publicKey_", "sigLen_", "signature_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<Signature> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (Signature.class) {
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

        public int getPkeyLen() {
            return this.pkeyLen_;
        }

        public ByteString getPublicKey() {
            return this.publicKey_;
        }

        public int getSigLen() {
            return this.sigLen_;
        }

        public ByteString getSignature() {
            return this.signature_;
        }

        public static Builder newBuilder(Signature signature) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(signature);
        }

        public static Signature parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Signature) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Signature parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (Signature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static Signature parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Signature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Signature parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (Signature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static Signature parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Signature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Signature parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (Signature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static Signature parseFrom(InputStream inputStream) throws IOException {
            return (Signature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Signature parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Signature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Signature parseFrom(C4969g gVar) throws IOException {
            return (Signature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static Signature parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (Signature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface SignatureOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        int getPkeyLen();

        ByteString getPublicKey();

        int getSigLen();

        ByteString getSignature();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SigningInput extends GeneratedMessageLite<SigningInput, Builder> implements SigningInputOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 4;
        public static final int BALANCE_FIELD_NUMBER = 9;
        public static final int CHAIN_ID_FIELD_NUMBER = 5;
        /* access modifiers changed from: private */
        public static final SigningInput DEFAULT_INSTANCE;
        public static final int FROM_FIELD_NUMBER = 2;
        public static final int IDASSETS_ID_FIELD_NUMBER = 6;
        public static final int NONCE_FIELD_NUMBER = 7;
        private static volatile im4<SigningInput> PARSER = null;
        public static final int PRIVATE_KEY_FIELD_NUMBER = 1;
        public static final int REMARK_FIELD_NUMBER = 8;
        public static final int TIMESTAMP_FIELD_NUMBER = 10;
        public static final int TO_FIELD_NUMBER = 3;
        private ByteString amount_;
        private ByteString balance_;
        private int chainId_;
        private String from_ = "";
        private int idassetsId_;
        private ByteString nonce_;
        private ByteString privateKey_;
        private String remark_;
        private int timestamp_;
        private String to_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningInput, Builder> implements SigningInputOrBuilder {
            public /* synthetic */ Builder(C97531 r1) {
                this();
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((SigningInput) this.instance).clearAmount();
                return this;
            }

            public Builder clearBalance() {
                copyOnWrite();
                ((SigningInput) this.instance).clearBalance();
                return this;
            }

            public Builder clearChainId() {
                copyOnWrite();
                ((SigningInput) this.instance).clearChainId();
                return this;
            }

            public Builder clearFrom() {
                copyOnWrite();
                ((SigningInput) this.instance).clearFrom();
                return this;
            }

            public Builder clearIdassetsId() {
                copyOnWrite();
                ((SigningInput) this.instance).clearIdassetsId();
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

            public Builder clearRemark() {
                copyOnWrite();
                ((SigningInput) this.instance).clearRemark();
                return this;
            }

            public Builder clearTimestamp() {
                copyOnWrite();
                ((SigningInput) this.instance).clearTimestamp();
                return this;
            }

            public Builder clearTo() {
                copyOnWrite();
                ((SigningInput) this.instance).clearTo();
                return this;
            }

            public ByteString getAmount() {
                return ((SigningInput) this.instance).getAmount();
            }

            public ByteString getBalance() {
                return ((SigningInput) this.instance).getBalance();
            }

            public int getChainId() {
                return ((SigningInput) this.instance).getChainId();
            }

            public String getFrom() {
                return ((SigningInput) this.instance).getFrom();
            }

            public ByteString getFromBytes() {
                return ((SigningInput) this.instance).getFromBytes();
            }

            public int getIdassetsId() {
                return ((SigningInput) this.instance).getIdassetsId();
            }

            public ByteString getNonce() {
                return ((SigningInput) this.instance).getNonce();
            }

            public ByteString getPrivateKey() {
                return ((SigningInput) this.instance).getPrivateKey();
            }

            public String getRemark() {
                return ((SigningInput) this.instance).getRemark();
            }

            public ByteString getRemarkBytes() {
                return ((SigningInput) this.instance).getRemarkBytes();
            }

            public int getTimestamp() {
                return ((SigningInput) this.instance).getTimestamp();
            }

            public String getTo() {
                return ((SigningInput) this.instance).getTo();
            }

            public ByteString getToBytes() {
                return ((SigningInput) this.instance).getToBytes();
            }

            public Builder setAmount(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setAmount(byteString);
                return this;
            }

            public Builder setBalance(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setBalance(byteString);
                return this;
            }

            public Builder setChainId(int i) {
                copyOnWrite();
                ((SigningInput) this.instance).setChainId(i);
                return this;
            }

            public Builder setFrom(String str) {
                copyOnWrite();
                ((SigningInput) this.instance).setFrom(str);
                return this;
            }

            public Builder setFromBytes(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setFromBytes(byteString);
                return this;
            }

            public Builder setIdassetsId(int i) {
                copyOnWrite();
                ((SigningInput) this.instance).setIdassetsId(i);
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

            public Builder setRemark(String str) {
                copyOnWrite();
                ((SigningInput) this.instance).setRemark(str);
                return this;
            }

            public Builder setRemarkBytes(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setRemarkBytes(byteString);
                return this;
            }

            public Builder setTimestamp(int i) {
                copyOnWrite();
                ((SigningInput) this.instance).setTimestamp(i);
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
            this.privateKey_ = byteString;
            this.amount_ = byteString;
            this.nonce_ = byteString;
            this.remark_ = "";
            this.balance_ = byteString;
        }

        /* access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = getDefaultInstance().getAmount();
        }

        /* access modifiers changed from: private */
        public void clearBalance() {
            this.balance_ = getDefaultInstance().getBalance();
        }

        /* access modifiers changed from: private */
        public void clearChainId() {
            this.chainId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFrom() {
            this.from_ = getDefaultInstance().getFrom();
        }

        /* access modifiers changed from: private */
        public void clearIdassetsId() {
            this.idassetsId_ = 0;
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
        public void clearRemark() {
            this.remark_ = getDefaultInstance().getRemark();
        }

        /* access modifiers changed from: private */
        public void clearTimestamp() {
            this.timestamp_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTo() {
            this.to_ = getDefaultInstance().getTo();
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
        public void setBalance(ByteString byteString) {
            byteString.getClass();
            this.balance_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setChainId(int i) {
            this.chainId_ = i;
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
        public void setIdassetsId(int i) {
            this.idassetsId_ = i;
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
        public void setRemark(String str) {
            str.getClass();
            this.remark_ = str;
        }

        /* access modifiers changed from: private */
        public void setRemarkBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.remark_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setTimestamp(int i) {
            this.timestamp_ = i;
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
            switch (C97531.f46569xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningInput();
                case 2:
                    return new Builder((C97531) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0003Ȉ\u0004\n\u0005\u000b\u0006\u000b\u0007\n\bȈ\t\n\n\u000b", new Object[]{"privateKey_", "from_", "to_", "amount_", "chainId_", "idassetsId_", "nonce_", "remark_", "balance_", "timestamp_"});
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

        public ByteString getBalance() {
            return this.balance_;
        }

        public int getChainId() {
            return this.chainId_;
        }

        public String getFrom() {
            return this.from_;
        }

        public ByteString getFromBytes() {
            return ByteString.copyFromUtf8(this.from_);
        }

        public int getIdassetsId() {
            return this.idassetsId_;
        }

        public ByteString getNonce() {
            return this.nonce_;
        }

        public ByteString getPrivateKey() {
            return this.privateKey_;
        }

        public String getRemark() {
            return this.remark_;
        }

        public ByteString getRemarkBytes() {
            return ByteString.copyFromUtf8(this.remark_);
        }

        public int getTimestamp() {
            return this.timestamp_;
        }

        public String getTo() {
            return this.to_;
        }

        public ByteString getToBytes() {
            return ByteString.copyFromUtf8(this.to_);
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

        ByteString getBalance();

        int getChainId();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getFrom();

        ByteString getFromBytes();

        int getIdassetsId();

        ByteString getNonce();

        ByteString getPrivateKey();

        String getRemark();

        ByteString getRemarkBytes();

        int getTimestamp();

        String getTo();

        ByteString getToBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SigningOutput extends GeneratedMessageLite<SigningOutput, Builder> implements SigningOutputOrBuilder {
        /* access modifiers changed from: private */
        public static final SigningOutput DEFAULT_INSTANCE;
        public static final int ENCODED_FIELD_NUMBER = 1;
        private static volatile im4<SigningOutput> PARSER;
        private ByteString encoded_ = ByteString.EMPTY;

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningOutput, Builder> implements SigningOutputOrBuilder {
            public /* synthetic */ Builder(C97531 r1) {
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
            switch (C97531.f46569xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningOutput();
                case 2:
                    return new Builder((C97531) null);
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

    public static final class Transaction extends GeneratedMessageLite<Transaction, Builder> implements TransactionOrBuilder {
        /* access modifiers changed from: private */
        public static final Transaction DEFAULT_INSTANCE;
        public static final int HASH_FIELD_NUMBER = 8;
        public static final int INPUT_FIELD_NUMBER = 5;
        public static final int OUTPUT_FIELD_NUMBER = 6;
        private static volatile im4<Transaction> PARSER = null;
        public static final int REMARK_FIELD_NUMBER = 3;
        public static final int TIMESTAMP_FIELD_NUMBER = 2;
        public static final int TX_DATA_FIELD_NUMBER = 4;
        public static final int TX_SIGS_FIELD_NUMBER = 7;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int hash_;
        private TransactionCoinFrom input_;
        private TransactionCoinTo output_;
        private String remark_ = "";
        private int timestamp_;
        private ByteString txData_ = ByteString.EMPTY;
        private Signature txSigs_;
        private int type_;

        public static final class Builder extends GeneratedMessageLite.C4930a<Transaction, Builder> implements TransactionOrBuilder {
            public /* synthetic */ Builder(C97531 r1) {
                this();
            }

            public Builder clearHash() {
                copyOnWrite();
                ((Transaction) this.instance).clearHash();
                return this;
            }

            public Builder clearInput() {
                copyOnWrite();
                ((Transaction) this.instance).clearInput();
                return this;
            }

            public Builder clearOutput() {
                copyOnWrite();
                ((Transaction) this.instance).clearOutput();
                return this;
            }

            public Builder clearRemark() {
                copyOnWrite();
                ((Transaction) this.instance).clearRemark();
                return this;
            }

            public Builder clearTimestamp() {
                copyOnWrite();
                ((Transaction) this.instance).clearTimestamp();
                return this;
            }

            public Builder clearTxData() {
                copyOnWrite();
                ((Transaction) this.instance).clearTxData();
                return this;
            }

            public Builder clearTxSigs() {
                copyOnWrite();
                ((Transaction) this.instance).clearTxSigs();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((Transaction) this.instance).clearType();
                return this;
            }

            public int getHash() {
                return ((Transaction) this.instance).getHash();
            }

            public TransactionCoinFrom getInput() {
                return ((Transaction) this.instance).getInput();
            }

            public TransactionCoinTo getOutput() {
                return ((Transaction) this.instance).getOutput();
            }

            public String getRemark() {
                return ((Transaction) this.instance).getRemark();
            }

            public ByteString getRemarkBytes() {
                return ((Transaction) this.instance).getRemarkBytes();
            }

            public int getTimestamp() {
                return ((Transaction) this.instance).getTimestamp();
            }

            public ByteString getTxData() {
                return ((Transaction) this.instance).getTxData();
            }

            public Signature getTxSigs() {
                return ((Transaction) this.instance).getTxSigs();
            }

            public int getType() {
                return ((Transaction) this.instance).getType();
            }

            public boolean hasInput() {
                return ((Transaction) this.instance).hasInput();
            }

            public boolean hasOutput() {
                return ((Transaction) this.instance).hasOutput();
            }

            public boolean hasTxSigs() {
                return ((Transaction) this.instance).hasTxSigs();
            }

            public Builder mergeInput(TransactionCoinFrom transactionCoinFrom) {
                copyOnWrite();
                ((Transaction) this.instance).mergeInput(transactionCoinFrom);
                return this;
            }

            public Builder mergeOutput(TransactionCoinTo transactionCoinTo) {
                copyOnWrite();
                ((Transaction) this.instance).mergeOutput(transactionCoinTo);
                return this;
            }

            public Builder mergeTxSigs(Signature signature) {
                copyOnWrite();
                ((Transaction) this.instance).mergeTxSigs(signature);
                return this;
            }

            public Builder setHash(int i) {
                copyOnWrite();
                ((Transaction) this.instance).setHash(i);
                return this;
            }

            public Builder setInput(TransactionCoinFrom transactionCoinFrom) {
                copyOnWrite();
                ((Transaction) this.instance).setInput(transactionCoinFrom);
                return this;
            }

            public Builder setOutput(TransactionCoinTo transactionCoinTo) {
                copyOnWrite();
                ((Transaction) this.instance).setOutput(transactionCoinTo);
                return this;
            }

            public Builder setRemark(String str) {
                copyOnWrite();
                ((Transaction) this.instance).setRemark(str);
                return this;
            }

            public Builder setRemarkBytes(ByteString byteString) {
                copyOnWrite();
                ((Transaction) this.instance).setRemarkBytes(byteString);
                return this;
            }

            public Builder setTimestamp(int i) {
                copyOnWrite();
                ((Transaction) this.instance).setTimestamp(i);
                return this;
            }

            public Builder setTxData(ByteString byteString) {
                copyOnWrite();
                ((Transaction) this.instance).setTxData(byteString);
                return this;
            }

            public Builder setTxSigs(Signature signature) {
                copyOnWrite();
                ((Transaction) this.instance).setTxSigs(signature);
                return this;
            }

            public Builder setType(int i) {
                copyOnWrite();
                ((Transaction) this.instance).setType(i);
                return this;
            }

            private Builder() {
                super(Transaction.DEFAULT_INSTANCE);
            }

            public Builder setInput(TransactionCoinFrom.Builder builder) {
                copyOnWrite();
                ((Transaction) this.instance).setInput((TransactionCoinFrom) builder.build());
                return this;
            }

            public Builder setOutput(TransactionCoinTo.Builder builder) {
                copyOnWrite();
                ((Transaction) this.instance).setOutput((TransactionCoinTo) builder.build());
                return this;
            }

            public Builder setTxSigs(Signature.Builder builder) {
                copyOnWrite();
                ((Transaction) this.instance).setTxSigs((Signature) builder.build());
                return this;
            }
        }

        static {
            Transaction transaction = new Transaction();
            DEFAULT_INSTANCE = transaction;
            GeneratedMessageLite.registerDefaultInstance(Transaction.class, transaction);
        }

        private Transaction() {
        }

        /* access modifiers changed from: private */
        public void clearHash() {
            this.hash_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearInput() {
            this.input_ = null;
        }

        /* access modifiers changed from: private */
        public void clearOutput() {
            this.output_ = null;
        }

        /* access modifiers changed from: private */
        public void clearRemark() {
            this.remark_ = getDefaultInstance().getRemark();
        }

        /* access modifiers changed from: private */
        public void clearTimestamp() {
            this.timestamp_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTxData() {
            this.txData_ = getDefaultInstance().getTxData();
        }

        /* access modifiers changed from: private */
        public void clearTxSigs() {
            this.txSigs_ = null;
        }

        /* access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        public static Transaction getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeInput(TransactionCoinFrom transactionCoinFrom) {
            transactionCoinFrom.getClass();
            TransactionCoinFrom transactionCoinFrom2 = this.input_;
            if (transactionCoinFrom2 == null || transactionCoinFrom2 == TransactionCoinFrom.getDefaultInstance()) {
                this.input_ = transactionCoinFrom;
            } else {
                this.input_ = (TransactionCoinFrom) ((TransactionCoinFrom.Builder) TransactionCoinFrom.newBuilder(this.input_).mergeFrom(transactionCoinFrom)).buildPartial();
            }
        }

        /* access modifiers changed from: private */
        public void mergeOutput(TransactionCoinTo transactionCoinTo) {
            transactionCoinTo.getClass();
            TransactionCoinTo transactionCoinTo2 = this.output_;
            if (transactionCoinTo2 == null || transactionCoinTo2 == TransactionCoinTo.getDefaultInstance()) {
                this.output_ = transactionCoinTo;
            } else {
                this.output_ = (TransactionCoinTo) ((TransactionCoinTo.Builder) TransactionCoinTo.newBuilder(this.output_).mergeFrom(transactionCoinTo)).buildPartial();
            }
        }

        /* access modifiers changed from: private */
        public void mergeTxSigs(Signature signature) {
            signature.getClass();
            Signature signature2 = this.txSigs_;
            if (signature2 == null || signature2 == Signature.getDefaultInstance()) {
                this.txSigs_ = signature;
            } else {
                this.txSigs_ = (Signature) ((Signature.Builder) Signature.newBuilder(this.txSigs_).mergeFrom(signature)).buildPartial();
            }
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
        public void setHash(int i) {
            this.hash_ = i;
        }

        /* access modifiers changed from: private */
        public void setInput(TransactionCoinFrom transactionCoinFrom) {
            transactionCoinFrom.getClass();
            this.input_ = transactionCoinFrom;
        }

        /* access modifiers changed from: private */
        public void setOutput(TransactionCoinTo transactionCoinTo) {
            transactionCoinTo.getClass();
            this.output_ = transactionCoinTo;
        }

        /* access modifiers changed from: private */
        public void setRemark(String str) {
            str.getClass();
            this.remark_ = str;
        }

        /* access modifiers changed from: private */
        public void setRemarkBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.remark_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setTimestamp(int i) {
            this.timestamp_ = i;
        }

        /* access modifiers changed from: private */
        public void setTxData(ByteString byteString) {
            byteString.getClass();
            this.txData_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setTxSigs(Signature signature) {
            signature.getClass();
            this.txSigs_ = signature;
        }

        /* access modifiers changed from: private */
        public void setType(int i) {
            this.type_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97531.f46569xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Transaction();
                case 2:
                    return new Builder((C97531) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003Ȉ\u0004\n\u0005\t\u0006\t\u0007\t\b\u000b", new Object[]{"type_", "timestamp_", "remark_", "txData_", "input_", "output_", "txSigs_", "hash_"});
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

        public int getHash() {
            return this.hash_;
        }

        public TransactionCoinFrom getInput() {
            TransactionCoinFrom transactionCoinFrom = this.input_;
            if (transactionCoinFrom == null) {
                return TransactionCoinFrom.getDefaultInstance();
            }
            return transactionCoinFrom;
        }

        public TransactionCoinTo getOutput() {
            TransactionCoinTo transactionCoinTo = this.output_;
            if (transactionCoinTo == null) {
                return TransactionCoinTo.getDefaultInstance();
            }
            return transactionCoinTo;
        }

        public String getRemark() {
            return this.remark_;
        }

        public ByteString getRemarkBytes() {
            return ByteString.copyFromUtf8(this.remark_);
        }

        public int getTimestamp() {
            return this.timestamp_;
        }

        public ByteString getTxData() {
            return this.txData_;
        }

        public Signature getTxSigs() {
            Signature signature = this.txSigs_;
            if (signature == null) {
                return Signature.getDefaultInstance();
            }
            return signature;
        }

        public int getType() {
            return this.type_;
        }

        public boolean hasInput() {
            if (this.input_ != null) {
                return true;
            }
            return false;
        }

        public boolean hasOutput() {
            if (this.output_ != null) {
                return true;
            }
            return false;
        }

        public boolean hasTxSigs() {
            if (this.txSigs_ != null) {
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

    public static final class TransactionCoinFrom extends GeneratedMessageLite<TransactionCoinFrom, Builder> implements TransactionCoinFromOrBuilder {
        public static final int ASSETS_CHAINID_FIELD_NUMBER = 2;
        public static final int ASSETS_ID_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final TransactionCoinFrom DEFAULT_INSTANCE;
        public static final int FROM_ADDRESS_FIELD_NUMBER = 1;
        public static final int ID_AMOUNT_FIELD_NUMBER = 4;
        public static final int LOCKED_FIELD_NUMBER = 6;
        public static final int NONCE_FIELD_NUMBER = 5;
        private static volatile im4<TransactionCoinFrom> PARSER;
        private int assetsChainid_;
        private int assetsId_;
        private String fromAddress_ = "";
        private ByteString idAmount_;
        private int locked_;
        private ByteString nonce_;

        public static final class Builder extends GeneratedMessageLite.C4930a<TransactionCoinFrom, Builder> implements TransactionCoinFromOrBuilder {
            public /* synthetic */ Builder(C97531 r1) {
                this();
            }

            public Builder clearAssetsChainid() {
                copyOnWrite();
                ((TransactionCoinFrom) this.instance).clearAssetsChainid();
                return this;
            }

            public Builder clearAssetsId() {
                copyOnWrite();
                ((TransactionCoinFrom) this.instance).clearAssetsId();
                return this;
            }

            public Builder clearFromAddress() {
                copyOnWrite();
                ((TransactionCoinFrom) this.instance).clearFromAddress();
                return this;
            }

            public Builder clearIdAmount() {
                copyOnWrite();
                ((TransactionCoinFrom) this.instance).clearIdAmount();
                return this;
            }

            public Builder clearLocked() {
                copyOnWrite();
                ((TransactionCoinFrom) this.instance).clearLocked();
                return this;
            }

            public Builder clearNonce() {
                copyOnWrite();
                ((TransactionCoinFrom) this.instance).clearNonce();
                return this;
            }

            public int getAssetsChainid() {
                return ((TransactionCoinFrom) this.instance).getAssetsChainid();
            }

            public int getAssetsId() {
                return ((TransactionCoinFrom) this.instance).getAssetsId();
            }

            public String getFromAddress() {
                return ((TransactionCoinFrom) this.instance).getFromAddress();
            }

            public ByteString getFromAddressBytes() {
                return ((TransactionCoinFrom) this.instance).getFromAddressBytes();
            }

            public ByteString getIdAmount() {
                return ((TransactionCoinFrom) this.instance).getIdAmount();
            }

            public int getLocked() {
                return ((TransactionCoinFrom) this.instance).getLocked();
            }

            public ByteString getNonce() {
                return ((TransactionCoinFrom) this.instance).getNonce();
            }

            public Builder setAssetsChainid(int i) {
                copyOnWrite();
                ((TransactionCoinFrom) this.instance).setAssetsChainid(i);
                return this;
            }

            public Builder setAssetsId(int i) {
                copyOnWrite();
                ((TransactionCoinFrom) this.instance).setAssetsId(i);
                return this;
            }

            public Builder setFromAddress(String str) {
                copyOnWrite();
                ((TransactionCoinFrom) this.instance).setFromAddress(str);
                return this;
            }

            public Builder setFromAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((TransactionCoinFrom) this.instance).setFromAddressBytes(byteString);
                return this;
            }

            public Builder setIdAmount(ByteString byteString) {
                copyOnWrite();
                ((TransactionCoinFrom) this.instance).setIdAmount(byteString);
                return this;
            }

            public Builder setLocked(int i) {
                copyOnWrite();
                ((TransactionCoinFrom) this.instance).setLocked(i);
                return this;
            }

            public Builder setNonce(ByteString byteString) {
                copyOnWrite();
                ((TransactionCoinFrom) this.instance).setNonce(byteString);
                return this;
            }

            private Builder() {
                super(TransactionCoinFrom.DEFAULT_INSTANCE);
            }
        }

        static {
            TransactionCoinFrom transactionCoinFrom = new TransactionCoinFrom();
            DEFAULT_INSTANCE = transactionCoinFrom;
            GeneratedMessageLite.registerDefaultInstance(TransactionCoinFrom.class, transactionCoinFrom);
        }

        private TransactionCoinFrom() {
            ByteString byteString = ByteString.EMPTY;
            this.idAmount_ = byteString;
            this.nonce_ = byteString;
        }

        /* access modifiers changed from: private */
        public void clearAssetsChainid() {
            this.assetsChainid_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearAssetsId() {
            this.assetsId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFromAddress() {
            this.fromAddress_ = getDefaultInstance().getFromAddress();
        }

        /* access modifiers changed from: private */
        public void clearIdAmount() {
            this.idAmount_ = getDefaultInstance().getIdAmount();
        }

        /* access modifiers changed from: private */
        public void clearLocked() {
            this.locked_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearNonce() {
            this.nonce_ = getDefaultInstance().getNonce();
        }

        public static TransactionCoinFrom getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TransactionCoinFrom parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TransactionCoinFrom) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TransactionCoinFrom parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TransactionCoinFrom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<TransactionCoinFrom> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAssetsChainid(int i) {
            this.assetsChainid_ = i;
        }

        /* access modifiers changed from: private */
        public void setAssetsId(int i) {
            this.assetsId_ = i;
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
        public void setIdAmount(ByteString byteString) {
            byteString.getClass();
            this.idAmount_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setLocked(int i) {
            this.locked_ = i;
        }

        /* access modifiers changed from: private */
        public void setNonce(ByteString byteString) {
            byteString.getClass();
            this.nonce_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97531.f46569xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TransactionCoinFrom();
                case 2:
                    return new Builder((C97531) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003\u000b\u0004\n\u0005\n\u0006\u000b", new Object[]{"fromAddress_", "assetsChainid_", "assetsId_", "idAmount_", "nonce_", "locked_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<TransactionCoinFrom> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (TransactionCoinFrom.class) {
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

        public int getAssetsChainid() {
            return this.assetsChainid_;
        }

        public int getAssetsId() {
            return this.assetsId_;
        }

        public String getFromAddress() {
            return this.fromAddress_;
        }

        public ByteString getFromAddressBytes() {
            return ByteString.copyFromUtf8(this.fromAddress_);
        }

        public ByteString getIdAmount() {
            return this.idAmount_;
        }

        public int getLocked() {
            return this.locked_;
        }

        public ByteString getNonce() {
            return this.nonce_;
        }

        public static Builder newBuilder(TransactionCoinFrom transactionCoinFrom) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(transactionCoinFrom);
        }

        public static TransactionCoinFrom parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TransactionCoinFrom) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TransactionCoinFrom parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransactionCoinFrom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static TransactionCoinFrom parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TransactionCoinFrom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TransactionCoinFrom parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransactionCoinFrom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static TransactionCoinFrom parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TransactionCoinFrom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TransactionCoinFrom parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransactionCoinFrom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static TransactionCoinFrom parseFrom(InputStream inputStream) throws IOException {
            return (TransactionCoinFrom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TransactionCoinFrom parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TransactionCoinFrom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TransactionCoinFrom parseFrom(C4969g gVar) throws IOException {
            return (TransactionCoinFrom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static TransactionCoinFrom parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (TransactionCoinFrom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface TransactionCoinFromOrBuilder extends qu3 {
        int getAssetsChainid();

        int getAssetsId();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getFromAddress();

        ByteString getFromAddressBytes();

        ByteString getIdAmount();

        int getLocked();

        ByteString getNonce();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TransactionCoinTo extends GeneratedMessageLite<TransactionCoinTo, Builder> implements TransactionCoinToOrBuilder {
        public static final int ASSETS_CHAINID_FIELD_NUMBER = 2;
        public static final int ASSETS_ID_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final TransactionCoinTo DEFAULT_INSTANCE;
        public static final int ID_AMOUNT_FIELD_NUMBER = 4;
        public static final int LOCK_TIME_FIELD_NUMBER = 5;
        private static volatile im4<TransactionCoinTo> PARSER = null;
        public static final int TO_ADDRESS_FIELD_NUMBER = 1;
        private int assetsChainid_;
        private int assetsId_;
        private ByteString idAmount_ = ByteString.EMPTY;
        private int lockTime_;
        private String toAddress_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<TransactionCoinTo, Builder> implements TransactionCoinToOrBuilder {
            public /* synthetic */ Builder(C97531 r1) {
                this();
            }

            public Builder clearAssetsChainid() {
                copyOnWrite();
                ((TransactionCoinTo) this.instance).clearAssetsChainid();
                return this;
            }

            public Builder clearAssetsId() {
                copyOnWrite();
                ((TransactionCoinTo) this.instance).clearAssetsId();
                return this;
            }

            public Builder clearIdAmount() {
                copyOnWrite();
                ((TransactionCoinTo) this.instance).clearIdAmount();
                return this;
            }

            public Builder clearLockTime() {
                copyOnWrite();
                ((TransactionCoinTo) this.instance).clearLockTime();
                return this;
            }

            public Builder clearToAddress() {
                copyOnWrite();
                ((TransactionCoinTo) this.instance).clearToAddress();
                return this;
            }

            public int getAssetsChainid() {
                return ((TransactionCoinTo) this.instance).getAssetsChainid();
            }

            public int getAssetsId() {
                return ((TransactionCoinTo) this.instance).getAssetsId();
            }

            public ByteString getIdAmount() {
                return ((TransactionCoinTo) this.instance).getIdAmount();
            }

            public int getLockTime() {
                return ((TransactionCoinTo) this.instance).getLockTime();
            }

            public String getToAddress() {
                return ((TransactionCoinTo) this.instance).getToAddress();
            }

            public ByteString getToAddressBytes() {
                return ((TransactionCoinTo) this.instance).getToAddressBytes();
            }

            public Builder setAssetsChainid(int i) {
                copyOnWrite();
                ((TransactionCoinTo) this.instance).setAssetsChainid(i);
                return this;
            }

            public Builder setAssetsId(int i) {
                copyOnWrite();
                ((TransactionCoinTo) this.instance).setAssetsId(i);
                return this;
            }

            public Builder setIdAmount(ByteString byteString) {
                copyOnWrite();
                ((TransactionCoinTo) this.instance).setIdAmount(byteString);
                return this;
            }

            public Builder setLockTime(int i) {
                copyOnWrite();
                ((TransactionCoinTo) this.instance).setLockTime(i);
                return this;
            }

            public Builder setToAddress(String str) {
                copyOnWrite();
                ((TransactionCoinTo) this.instance).setToAddress(str);
                return this;
            }

            public Builder setToAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((TransactionCoinTo) this.instance).setToAddressBytes(byteString);
                return this;
            }

            private Builder() {
                super(TransactionCoinTo.DEFAULT_INSTANCE);
            }
        }

        static {
            TransactionCoinTo transactionCoinTo = new TransactionCoinTo();
            DEFAULT_INSTANCE = transactionCoinTo;
            GeneratedMessageLite.registerDefaultInstance(TransactionCoinTo.class, transactionCoinTo);
        }

        private TransactionCoinTo() {
        }

        /* access modifiers changed from: private */
        public void clearAssetsChainid() {
            this.assetsChainid_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearAssetsId() {
            this.assetsId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearIdAmount() {
            this.idAmount_ = getDefaultInstance().getIdAmount();
        }

        /* access modifiers changed from: private */
        public void clearLockTime() {
            this.lockTime_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearToAddress() {
            this.toAddress_ = getDefaultInstance().getToAddress();
        }

        public static TransactionCoinTo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TransactionCoinTo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TransactionCoinTo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TransactionCoinTo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TransactionCoinTo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<TransactionCoinTo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAssetsChainid(int i) {
            this.assetsChainid_ = i;
        }

        /* access modifiers changed from: private */
        public void setAssetsId(int i) {
            this.assetsId_ = i;
        }

        /* access modifiers changed from: private */
        public void setIdAmount(ByteString byteString) {
            byteString.getClass();
            this.idAmount_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setLockTime(int i) {
            this.lockTime_ = i;
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
            switch (C97531.f46569xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TransactionCoinTo();
                case 2:
                    return new Builder((C97531) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003\u000b\u0004\n\u0005\u000b", new Object[]{"toAddress_", "assetsChainid_", "assetsId_", "idAmount_", "lockTime_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<TransactionCoinTo> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (TransactionCoinTo.class) {
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

        public int getAssetsChainid() {
            return this.assetsChainid_;
        }

        public int getAssetsId() {
            return this.assetsId_;
        }

        public ByteString getIdAmount() {
            return this.idAmount_;
        }

        public int getLockTime() {
            return this.lockTime_;
        }

        public String getToAddress() {
            return this.toAddress_;
        }

        public ByteString getToAddressBytes() {
            return ByteString.copyFromUtf8(this.toAddress_);
        }

        public static Builder newBuilder(TransactionCoinTo transactionCoinTo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(transactionCoinTo);
        }

        public static TransactionCoinTo parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TransactionCoinTo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TransactionCoinTo parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransactionCoinTo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static TransactionCoinTo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TransactionCoinTo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TransactionCoinTo parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransactionCoinTo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static TransactionCoinTo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TransactionCoinTo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TransactionCoinTo parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransactionCoinTo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static TransactionCoinTo parseFrom(InputStream inputStream) throws IOException {
            return (TransactionCoinTo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TransactionCoinTo parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TransactionCoinTo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TransactionCoinTo parseFrom(C4969g gVar) throws IOException {
            return (TransactionCoinTo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static TransactionCoinTo parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (TransactionCoinTo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface TransactionCoinToOrBuilder extends qu3 {
        int getAssetsChainid();

        int getAssetsId();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        ByteString getIdAmount();

        int getLockTime();

        String getToAddress();

        ByteString getToAddressBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface TransactionOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        int getHash();

        TransactionCoinFrom getInput();

        TransactionCoinTo getOutput();

        String getRemark();

        ByteString getRemarkBytes();

        int getTimestamp();

        ByteString getTxData();

        Signature getTxSigs();

        int getType();

        boolean hasInput();

        boolean hasOutput();

        boolean hasTxSigs();

        /* synthetic */ boolean isInitialized();
    }

    private NULS() {
    }

    public static void registerAllExtensions(C4987l lVar) {
    }
}
