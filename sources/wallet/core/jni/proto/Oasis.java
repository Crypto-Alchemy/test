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

public final class Oasis {

    /* renamed from: wallet.core.jni.proto.Oasis$1 */
    public static /* synthetic */ class C97581 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f46574xa1df5c61;

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
                f46574xa1df5c61 = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f46574xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f46574xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f46574xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f46574xa1df5c61     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f46574xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f46574xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wallet.core.jni.proto.Oasis.C97581.<clinit>():void");
        }
    }

    public static final class SigningInput extends GeneratedMessageLite<SigningInput, Builder> implements SigningInputOrBuilder {
        /* access modifiers changed from: private */
        public static final SigningInput DEFAULT_INSTANCE;
        private static volatile im4<SigningInput> PARSER = null;
        public static final int PRIVATE_KEY_FIELD_NUMBER = 1;
        public static final int TRANSFER_FIELD_NUMBER = 2;
        private int messageCase_ = 0;
        private Object message_;
        private ByteString privateKey_ = ByteString.EMPTY;

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningInput, Builder> implements SigningInputOrBuilder {
            public /* synthetic */ Builder(C97581 r1) {
                this();
            }

            public Builder clearMessage() {
                copyOnWrite();
                ((SigningInput) this.instance).clearMessage();
                return this;
            }

            public Builder clearPrivateKey() {
                copyOnWrite();
                ((SigningInput) this.instance).clearPrivateKey();
                return this;
            }

            public Builder clearTransfer() {
                copyOnWrite();
                ((SigningInput) this.instance).clearTransfer();
                return this;
            }

            public MessageCase getMessageCase() {
                return ((SigningInput) this.instance).getMessageCase();
            }

            public ByteString getPrivateKey() {
                return ((SigningInput) this.instance).getPrivateKey();
            }

            public TransferMessage getTransfer() {
                return ((SigningInput) this.instance).getTransfer();
            }

            public boolean hasTransfer() {
                return ((SigningInput) this.instance).hasTransfer();
            }

            public Builder mergeTransfer(TransferMessage transferMessage) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeTransfer(transferMessage);
                return this;
            }

            public Builder setPrivateKey(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setPrivateKey(byteString);
                return this;
            }

            public Builder setTransfer(TransferMessage transferMessage) {
                copyOnWrite();
                ((SigningInput) this.instance).setTransfer(transferMessage);
                return this;
            }

            private Builder() {
                super(SigningInput.DEFAULT_INSTANCE);
            }

            public Builder setTransfer(TransferMessage.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setTransfer((TransferMessage) builder.build());
                return this;
            }
        }

        public enum MessageCase {
            TRANSFER(2),
            MESSAGE_NOT_SET(0);
            
            private final int value;

            private MessageCase(int i) {
                this.value = i;
            }

            public static MessageCase forNumber(int i) {
                if (i == 0) {
                    return MESSAGE_NOT_SET;
                }
                if (i != 2) {
                    return null;
                }
                return TRANSFER;
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static MessageCase valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            SigningInput signingInput = new SigningInput();
            DEFAULT_INSTANCE = signingInput;
            GeneratedMessageLite.registerDefaultInstance(SigningInput.class, signingInput);
        }

        private SigningInput() {
        }

        /* access modifiers changed from: private */
        public void clearMessage() {
            this.messageCase_ = 0;
            this.message_ = null;
        }

        /* access modifiers changed from: private */
        public void clearPrivateKey() {
            this.privateKey_ = getDefaultInstance().getPrivateKey();
        }

        /* access modifiers changed from: private */
        public void clearTransfer() {
            if (this.messageCase_ == 2) {
                this.messageCase_ = 0;
                this.message_ = null;
            }
        }

        public static SigningInput getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeTransfer(TransferMessage transferMessage) {
            transferMessage.getClass();
            if (this.messageCase_ != 2 || this.message_ == TransferMessage.getDefaultInstance()) {
                this.message_ = transferMessage;
            } else {
                this.message_ = ((TransferMessage.Builder) TransferMessage.newBuilder((TransferMessage) this.message_).mergeFrom(transferMessage)).buildPartial();
            }
            this.messageCase_ = 2;
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
        public void setPrivateKey(ByteString byteString) {
            byteString.getClass();
            this.privateKey_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setTransfer(TransferMessage transferMessage) {
            transferMessage.getClass();
            this.message_ = transferMessage;
            this.messageCase_ = 2;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97581.f46574xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningInput();
                case 2:
                    return new Builder((C97581) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002<\u0000", new Object[]{"message_", "messageCase_", "privateKey_", TransferMessage.class});
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

        public MessageCase getMessageCase() {
            return MessageCase.forNumber(this.messageCase_);
        }

        public ByteString getPrivateKey() {
            return this.privateKey_;
        }

        public TransferMessage getTransfer() {
            if (this.messageCase_ == 2) {
                return (TransferMessage) this.message_;
            }
            return TransferMessage.getDefaultInstance();
        }

        public boolean hasTransfer() {
            if (this.messageCase_ == 2) {
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

        SigningInput.MessageCase getMessageCase();

        ByteString getPrivateKey();

        TransferMessage getTransfer();

        boolean hasTransfer();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SigningOutput extends GeneratedMessageLite<SigningOutput, Builder> implements SigningOutputOrBuilder {
        /* access modifiers changed from: private */
        public static final SigningOutput DEFAULT_INSTANCE;
        public static final int ENCODED_FIELD_NUMBER = 1;
        private static volatile im4<SigningOutput> PARSER;
        private ByteString encoded_ = ByteString.EMPTY;

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningOutput, Builder> implements SigningOutputOrBuilder {
            public /* synthetic */ Builder(C97581 r1) {
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
            switch (C97581.f46574xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningOutput();
                case 2:
                    return new Builder((C97581) null);
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

    public static final class TransferMessage extends GeneratedMessageLite<TransferMessage, Builder> implements TransferMessageOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 4;
        public static final int CONTEXT_FIELD_NUMBER = 6;
        /* access modifiers changed from: private */
        public static final TransferMessage DEFAULT_INSTANCE;
        public static final int GAS_AMOUNT_FIELD_NUMBER = 3;
        public static final int GAS_PRICE_FIELD_NUMBER = 2;
        public static final int NONCE_FIELD_NUMBER = 5;
        private static volatile im4<TransferMessage> PARSER = null;
        public static final int TO_FIELD_NUMBER = 1;
        private String amount_ = "";
        private String context_ = "";
        private String gasAmount_ = "";
        private long gasPrice_;
        private long nonce_;
        private String to_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<TransferMessage, Builder> implements TransferMessageOrBuilder {
            public /* synthetic */ Builder(C97581 r1) {
                this();
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((TransferMessage) this.instance).clearAmount();
                return this;
            }

            public Builder clearContext() {
                copyOnWrite();
                ((TransferMessage) this.instance).clearContext();
                return this;
            }

            public Builder clearGasAmount() {
                copyOnWrite();
                ((TransferMessage) this.instance).clearGasAmount();
                return this;
            }

            public Builder clearGasPrice() {
                copyOnWrite();
                ((TransferMessage) this.instance).clearGasPrice();
                return this;
            }

            public Builder clearNonce() {
                copyOnWrite();
                ((TransferMessage) this.instance).clearNonce();
                return this;
            }

            public Builder clearTo() {
                copyOnWrite();
                ((TransferMessage) this.instance).clearTo();
                return this;
            }

            public String getAmount() {
                return ((TransferMessage) this.instance).getAmount();
            }

            public ByteString getAmountBytes() {
                return ((TransferMessage) this.instance).getAmountBytes();
            }

            public String getContext() {
                return ((TransferMessage) this.instance).getContext();
            }

            public ByteString getContextBytes() {
                return ((TransferMessage) this.instance).getContextBytes();
            }

            public String getGasAmount() {
                return ((TransferMessage) this.instance).getGasAmount();
            }

            public ByteString getGasAmountBytes() {
                return ((TransferMessage) this.instance).getGasAmountBytes();
            }

            public long getGasPrice() {
                return ((TransferMessage) this.instance).getGasPrice();
            }

            public long getNonce() {
                return ((TransferMessage) this.instance).getNonce();
            }

            public String getTo() {
                return ((TransferMessage) this.instance).getTo();
            }

            public ByteString getToBytes() {
                return ((TransferMessage) this.instance).getToBytes();
            }

            public Builder setAmount(String str) {
                copyOnWrite();
                ((TransferMessage) this.instance).setAmount(str);
                return this;
            }

            public Builder setAmountBytes(ByteString byteString) {
                copyOnWrite();
                ((TransferMessage) this.instance).setAmountBytes(byteString);
                return this;
            }

            public Builder setContext(String str) {
                copyOnWrite();
                ((TransferMessage) this.instance).setContext(str);
                return this;
            }

            public Builder setContextBytes(ByteString byteString) {
                copyOnWrite();
                ((TransferMessage) this.instance).setContextBytes(byteString);
                return this;
            }

            public Builder setGasAmount(String str) {
                copyOnWrite();
                ((TransferMessage) this.instance).setGasAmount(str);
                return this;
            }

            public Builder setGasAmountBytes(ByteString byteString) {
                copyOnWrite();
                ((TransferMessage) this.instance).setGasAmountBytes(byteString);
                return this;
            }

            public Builder setGasPrice(long j) {
                copyOnWrite();
                ((TransferMessage) this.instance).setGasPrice(j);
                return this;
            }

            public Builder setNonce(long j) {
                copyOnWrite();
                ((TransferMessage) this.instance).setNonce(j);
                return this;
            }

            public Builder setTo(String str) {
                copyOnWrite();
                ((TransferMessage) this.instance).setTo(str);
                return this;
            }

            public Builder setToBytes(ByteString byteString) {
                copyOnWrite();
                ((TransferMessage) this.instance).setToBytes(byteString);
                return this;
            }

            private Builder() {
                super(TransferMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            TransferMessage transferMessage = new TransferMessage();
            DEFAULT_INSTANCE = transferMessage;
            GeneratedMessageLite.registerDefaultInstance(TransferMessage.class, transferMessage);
        }

        private TransferMessage() {
        }

        /* access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = getDefaultInstance().getAmount();
        }

        /* access modifiers changed from: private */
        public void clearContext() {
            this.context_ = getDefaultInstance().getContext();
        }

        /* access modifiers changed from: private */
        public void clearGasAmount() {
            this.gasAmount_ = getDefaultInstance().getGasAmount();
        }

        /* access modifiers changed from: private */
        public void clearGasPrice() {
            this.gasPrice_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearNonce() {
            this.nonce_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTo() {
            this.to_ = getDefaultInstance().getTo();
        }

        public static TransferMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TransferMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TransferMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TransferMessage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TransferMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<TransferMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAmount(String str) {
            str.getClass();
            this.amount_ = str;
        }

        /* access modifiers changed from: private */
        public void setAmountBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.amount_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setContext(String str) {
            str.getClass();
            this.context_ = str;
        }

        /* access modifiers changed from: private */
        public void setContextBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.context_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setGasAmount(String str) {
            str.getClass();
            this.gasAmount_ = str;
        }

        /* access modifiers changed from: private */
        public void setGasAmountBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.gasAmount_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setGasPrice(long j) {
            this.gasPrice_ = j;
        }

        /* access modifiers changed from: private */
        public void setNonce(long j) {
            this.nonce_ = j;
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
            switch (C97581.f46574xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TransferMessage();
                case 2:
                    return new Builder((C97581) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0003\u0003Ȉ\u0004Ȉ\u0005\u0003\u0006Ȉ", new Object[]{"to_", "gasPrice_", "gasAmount_", "amount_", "nonce_", "context_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<TransferMessage> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (TransferMessage.class) {
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

        public String getAmount() {
            return this.amount_;
        }

        public ByteString getAmountBytes() {
            return ByteString.copyFromUtf8(this.amount_);
        }

        public String getContext() {
            return this.context_;
        }

        public ByteString getContextBytes() {
            return ByteString.copyFromUtf8(this.context_);
        }

        public String getGasAmount() {
            return this.gasAmount_;
        }

        public ByteString getGasAmountBytes() {
            return ByteString.copyFromUtf8(this.gasAmount_);
        }

        public long getGasPrice() {
            return this.gasPrice_;
        }

        public long getNonce() {
            return this.nonce_;
        }

        public String getTo() {
            return this.to_;
        }

        public ByteString getToBytes() {
            return ByteString.copyFromUtf8(this.to_);
        }

        public static Builder newBuilder(TransferMessage transferMessage) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(transferMessage);
        }

        public static TransferMessage parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TransferMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TransferMessage parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransferMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static TransferMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TransferMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TransferMessage parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransferMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static TransferMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TransferMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TransferMessage parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransferMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static TransferMessage parseFrom(InputStream inputStream) throws IOException {
            return (TransferMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TransferMessage parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TransferMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TransferMessage parseFrom(C4969g gVar) throws IOException {
            return (TransferMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static TransferMessage parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (TransferMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface TransferMessageOrBuilder extends qu3 {
        String getAmount();

        ByteString getAmountBytes();

        String getContext();

        ByteString getContextBytes();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getGasAmount();

        ByteString getGasAmountBytes();

        long getGasPrice();

        long getNonce();

        String getTo();

        ByteString getToBytes();

        /* synthetic */ boolean isInitialized();
    }

    private Oasis() {
    }

    public static void registerAllExtensions(C4987l lVar) {
    }
}
