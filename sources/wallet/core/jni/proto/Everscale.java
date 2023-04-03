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

public final class Everscale {

    /* renamed from: wallet.core.jni.proto.Everscale$1 */
    public static /* synthetic */ class C97431 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f46557xa1df5c61;

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
                f46557xa1df5c61 = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f46557xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f46557xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f46557xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f46557xa1df5c61     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f46557xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f46557xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wallet.core.jni.proto.Everscale.C97431.<clinit>():void");
        }
    }

    public enum MessageBehavior implements C5011t.C5014c {
        SimpleTransfer(0),
        SendAllBalance(1),
        UNRECOGNIZED(-1);
        
        public static final int SendAllBalance_VALUE = 1;
        public static final int SimpleTransfer_VALUE = 0;
        private static final C5011t.C5015d<MessageBehavior> internalValueMap = null;
        private final int value;

        public static final class MessageBehaviorVerifier implements C5011t.C5016e {
            public static final C5011t.C5016e INSTANCE = null;

            static {
                INSTANCE = new MessageBehaviorVerifier();
            }

            private MessageBehaviorVerifier() {
            }

            public boolean isInRange(int i) {
                if (MessageBehavior.forNumber(i) != null) {
                    return true;
                }
                return false;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C5011t.C5015d<MessageBehavior>() {
                public MessageBehavior findValueByNumber(int i) {
                    return MessageBehavior.forNumber(i);
                }
            };
        }

        private MessageBehavior(int i) {
            this.value = i;
        }

        public static MessageBehavior forNumber(int i) {
            if (i == 0) {
                return SimpleTransfer;
            }
            if (i != 1) {
                return null;
            }
            return SendAllBalance;
        }

        public static C5011t.C5015d<MessageBehavior> internalGetValueMap() {
            return internalValueMap;
        }

        public static C5011t.C5016e internalGetVerifier() {
            return MessageBehaviorVerifier.INSTANCE;
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static MessageBehavior valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class SigningInput extends GeneratedMessageLite<SigningInput, Builder> implements SigningInputOrBuilder {
        /* access modifiers changed from: private */
        public static final SigningInput DEFAULT_INSTANCE;
        private static volatile im4<SigningInput> PARSER = null;
        public static final int PRIVATE_KEY_FIELD_NUMBER = 2;
        public static final int TRANSFER_FIELD_NUMBER = 1;
        private int actionOneofCase_ = 0;
        private Object actionOneof_;
        private ByteString privateKey_ = ByteString.EMPTY;

        public enum ActionOneofCase {
            TRANSFER(1),
            ACTIONONEOF_NOT_SET(0);
            
            private final int value;

            private ActionOneofCase(int i) {
                this.value = i;
            }

            public static ActionOneofCase forNumber(int i) {
                if (i == 0) {
                    return ACTIONONEOF_NOT_SET;
                }
                if (i != 1) {
                    return null;
                }
                return TRANSFER;
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static ActionOneofCase valueOf(int i) {
                return forNumber(i);
            }
        }

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningInput, Builder> implements SigningInputOrBuilder {
            public /* synthetic */ Builder(C97431 r1) {
                this();
            }

            public Builder clearActionOneof() {
                copyOnWrite();
                ((SigningInput) this.instance).clearActionOneof();
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

            public ActionOneofCase getActionOneofCase() {
                return ((SigningInput) this.instance).getActionOneofCase();
            }

            public ByteString getPrivateKey() {
                return ((SigningInput) this.instance).getPrivateKey();
            }

            public Transfer getTransfer() {
                return ((SigningInput) this.instance).getTransfer();
            }

            public boolean hasTransfer() {
                return ((SigningInput) this.instance).hasTransfer();
            }

            public Builder mergeTransfer(Transfer transfer) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeTransfer(transfer);
                return this;
            }

            public Builder setPrivateKey(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setPrivateKey(byteString);
                return this;
            }

            public Builder setTransfer(Transfer transfer) {
                copyOnWrite();
                ((SigningInput) this.instance).setTransfer(transfer);
                return this;
            }

            private Builder() {
                super(SigningInput.DEFAULT_INSTANCE);
            }

            public Builder setTransfer(Transfer.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setTransfer((Transfer) builder.build());
                return this;
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
        public void clearActionOneof() {
            this.actionOneofCase_ = 0;
            this.actionOneof_ = null;
        }

        /* access modifiers changed from: private */
        public void clearPrivateKey() {
            this.privateKey_ = getDefaultInstance().getPrivateKey();
        }

        /* access modifiers changed from: private */
        public void clearTransfer() {
            if (this.actionOneofCase_ == 1) {
                this.actionOneofCase_ = 0;
                this.actionOneof_ = null;
            }
        }

        public static SigningInput getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeTransfer(Transfer transfer) {
            transfer.getClass();
            if (this.actionOneofCase_ != 1 || this.actionOneof_ == Transfer.getDefaultInstance()) {
                this.actionOneof_ = transfer;
            } else {
                this.actionOneof_ = ((Transfer.Builder) Transfer.newBuilder((Transfer) this.actionOneof_).mergeFrom(transfer)).buildPartial();
            }
            this.actionOneofCase_ = 1;
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
        public void setTransfer(Transfer transfer) {
            transfer.getClass();
            this.actionOneof_ = transfer;
            this.actionOneofCase_ = 1;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97431.f46557xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningInput();
                case 2:
                    return new Builder((C97431) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002\n", new Object[]{"actionOneof_", "actionOneofCase_", Transfer.class, "privateKey_"});
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

        public ActionOneofCase getActionOneofCase() {
            return ActionOneofCase.forNumber(this.actionOneofCase_);
        }

        public ByteString getPrivateKey() {
            return this.privateKey_;
        }

        public Transfer getTransfer() {
            if (this.actionOneofCase_ == 1) {
                return (Transfer) this.actionOneof_;
            }
            return Transfer.getDefaultInstance();
        }

        public boolean hasTransfer() {
            if (this.actionOneofCase_ == 1) {
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
        SigningInput.ActionOneofCase getActionOneofCase();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        ByteString getPrivateKey();

        Transfer getTransfer();

        boolean hasTransfer();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SigningOutput extends GeneratedMessageLite<SigningOutput, Builder> implements SigningOutputOrBuilder {
        /* access modifiers changed from: private */
        public static final SigningOutput DEFAULT_INSTANCE;
        public static final int ENCODED_FIELD_NUMBER = 1;
        private static volatile im4<SigningOutput> PARSER;
        private String encoded_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningOutput, Builder> implements SigningOutputOrBuilder {
            public /* synthetic */ Builder(C97431 r1) {
                this();
            }

            public Builder clearEncoded() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearEncoded();
                return this;
            }

            public String getEncoded() {
                return ((SigningOutput) this.instance).getEncoded();
            }

            public ByteString getEncodedBytes() {
                return ((SigningOutput) this.instance).getEncodedBytes();
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
        public void setEncoded(String str) {
            str.getClass();
            this.encoded_ = str;
        }

        /* access modifiers changed from: private */
        public void setEncodedBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.encoded_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97431.f46557xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningOutput();
                case 2:
                    return new Builder((C97431) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"encoded_"});
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

        /* synthetic */ boolean isInitialized();
    }

    public static final class Transfer extends GeneratedMessageLite<Transfer, Builder> implements TransferOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 3;
        public static final int BEHAVIOR_FIELD_NUMBER = 2;
        public static final int BOUNCE_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final Transfer DEFAULT_INSTANCE;
        public static final int ENCODED_CONTRACT_DATA_FIELD_NUMBER = 6;
        public static final int EXPIRED_AT_FIELD_NUMBER = 4;
        private static volatile im4<Transfer> PARSER = null;
        public static final int TO_FIELD_NUMBER = 5;
        private int accountStateOneofCase_ = 0;
        private Object accountStateOneof_;
        private long amount_;
        private int behavior_;
        private boolean bounce_;
        private int expiredAt_;
        private String to_ = "";

        public enum AccountStateOneofCase {
            ENCODED_CONTRACT_DATA(6),
            ACCOUNTSTATEONEOF_NOT_SET(0);
            
            private final int value;

            private AccountStateOneofCase(int i) {
                this.value = i;
            }

            public static AccountStateOneofCase forNumber(int i) {
                if (i == 0) {
                    return ACCOUNTSTATEONEOF_NOT_SET;
                }
                if (i != 6) {
                    return null;
                }
                return ENCODED_CONTRACT_DATA;
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static AccountStateOneofCase valueOf(int i) {
                return forNumber(i);
            }
        }

        public static final class Builder extends GeneratedMessageLite.C4930a<Transfer, Builder> implements TransferOrBuilder {
            public /* synthetic */ Builder(C97431 r1) {
                this();
            }

            public Builder clearAccountStateOneof() {
                copyOnWrite();
                ((Transfer) this.instance).clearAccountStateOneof();
                return this;
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((Transfer) this.instance).clearAmount();
                return this;
            }

            public Builder clearBehavior() {
                copyOnWrite();
                ((Transfer) this.instance).clearBehavior();
                return this;
            }

            public Builder clearBounce() {
                copyOnWrite();
                ((Transfer) this.instance).clearBounce();
                return this;
            }

            public Builder clearEncodedContractData() {
                copyOnWrite();
                ((Transfer) this.instance).clearEncodedContractData();
                return this;
            }

            public Builder clearExpiredAt() {
                copyOnWrite();
                ((Transfer) this.instance).clearExpiredAt();
                return this;
            }

            public Builder clearTo() {
                copyOnWrite();
                ((Transfer) this.instance).clearTo();
                return this;
            }

            public AccountStateOneofCase getAccountStateOneofCase() {
                return ((Transfer) this.instance).getAccountStateOneofCase();
            }

            public long getAmount() {
                return ((Transfer) this.instance).getAmount();
            }

            public MessageBehavior getBehavior() {
                return ((Transfer) this.instance).getBehavior();
            }

            public int getBehaviorValue() {
                return ((Transfer) this.instance).getBehaviorValue();
            }

            public boolean getBounce() {
                return ((Transfer) this.instance).getBounce();
            }

            public String getEncodedContractData() {
                return ((Transfer) this.instance).getEncodedContractData();
            }

            public ByteString getEncodedContractDataBytes() {
                return ((Transfer) this.instance).getEncodedContractDataBytes();
            }

            public int getExpiredAt() {
                return ((Transfer) this.instance).getExpiredAt();
            }

            public String getTo() {
                return ((Transfer) this.instance).getTo();
            }

            public ByteString getToBytes() {
                return ((Transfer) this.instance).getToBytes();
            }

            public boolean hasEncodedContractData() {
                return ((Transfer) this.instance).hasEncodedContractData();
            }

            public Builder setAmount(long j) {
                copyOnWrite();
                ((Transfer) this.instance).setAmount(j);
                return this;
            }

            public Builder setBehavior(MessageBehavior messageBehavior) {
                copyOnWrite();
                ((Transfer) this.instance).setBehavior(messageBehavior);
                return this;
            }

            public Builder setBehaviorValue(int i) {
                copyOnWrite();
                ((Transfer) this.instance).setBehaviorValue(i);
                return this;
            }

            public Builder setBounce(boolean z) {
                copyOnWrite();
                ((Transfer) this.instance).setBounce(z);
                return this;
            }

            public Builder setEncodedContractData(String str) {
                copyOnWrite();
                ((Transfer) this.instance).setEncodedContractData(str);
                return this;
            }

            public Builder setEncodedContractDataBytes(ByteString byteString) {
                copyOnWrite();
                ((Transfer) this.instance).setEncodedContractDataBytes(byteString);
                return this;
            }

            public Builder setExpiredAt(int i) {
                copyOnWrite();
                ((Transfer) this.instance).setExpiredAt(i);
                return this;
            }

            public Builder setTo(String str) {
                copyOnWrite();
                ((Transfer) this.instance).setTo(str);
                return this;
            }

            public Builder setToBytes(ByteString byteString) {
                copyOnWrite();
                ((Transfer) this.instance).setToBytes(byteString);
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
        public void clearAccountStateOneof() {
            this.accountStateOneofCase_ = 0;
            this.accountStateOneof_ = null;
        }

        /* access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearBehavior() {
            this.behavior_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearBounce() {
            this.bounce_ = false;
        }

        /* access modifiers changed from: private */
        public void clearEncodedContractData() {
            if (this.accountStateOneofCase_ == 6) {
                this.accountStateOneofCase_ = 0;
                this.accountStateOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearExpiredAt() {
            this.expiredAt_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTo() {
            this.to_ = getDefaultInstance().getTo();
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
        public void setAmount(long j) {
            this.amount_ = j;
        }

        /* access modifiers changed from: private */
        public void setBehavior(MessageBehavior messageBehavior) {
            this.behavior_ = messageBehavior.getNumber();
        }

        /* access modifiers changed from: private */
        public void setBehaviorValue(int i) {
            this.behavior_ = i;
        }

        /* access modifiers changed from: private */
        public void setBounce(boolean z) {
            this.bounce_ = z;
        }

        /* access modifiers changed from: private */
        public void setEncodedContractData(String str) {
            str.getClass();
            this.accountStateOneofCase_ = 6;
            this.accountStateOneof_ = str;
        }

        /* access modifiers changed from: private */
        public void setEncodedContractDataBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.accountStateOneof_ = byteString.toStringUtf8();
            this.accountStateOneofCase_ = 6;
        }

        /* access modifiers changed from: private */
        public void setExpiredAt(int i) {
            this.expiredAt_ = i;
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
            switch (C97431.f46557xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Transfer();
                case 2:
                    return new Builder((C97431) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0007\u0002\f\u0003\u0003\u0004\u000b\u0005Ȉ\u0006Ȼ\u0000", new Object[]{"accountStateOneof_", "accountStateOneofCase_", "bounce_", "behavior_", "amount_", "expiredAt_", "to_"});
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

        public AccountStateOneofCase getAccountStateOneofCase() {
            return AccountStateOneofCase.forNumber(this.accountStateOneofCase_);
        }

        public long getAmount() {
            return this.amount_;
        }

        public MessageBehavior getBehavior() {
            MessageBehavior forNumber = MessageBehavior.forNumber(this.behavior_);
            if (forNumber == null) {
                return MessageBehavior.UNRECOGNIZED;
            }
            return forNumber;
        }

        public int getBehaviorValue() {
            return this.behavior_;
        }

        public boolean getBounce() {
            return this.bounce_;
        }

        public String getEncodedContractData() {
            if (this.accountStateOneofCase_ == 6) {
                return (String) this.accountStateOneof_;
            }
            return "";
        }

        public ByteString getEncodedContractDataBytes() {
            String str;
            if (this.accountStateOneofCase_ == 6) {
                str = (String) this.accountStateOneof_;
            } else {
                str = "";
            }
            return ByteString.copyFromUtf8(str);
        }

        public int getExpiredAt() {
            return this.expiredAt_;
        }

        public String getTo() {
            return this.to_;
        }

        public ByteString getToBytes() {
            return ByteString.copyFromUtf8(this.to_);
        }

        public boolean hasEncodedContractData() {
            if (this.accountStateOneofCase_ == 6) {
                return true;
            }
            return false;
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
        Transfer.AccountStateOneofCase getAccountStateOneofCase();

        long getAmount();

        MessageBehavior getBehavior();

        int getBehaviorValue();

        boolean getBounce();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getEncodedContractData();

        ByteString getEncodedContractDataBytes();

        int getExpiredAt();

        String getTo();

        ByteString getToBytes();

        boolean hasEncodedContractData();

        /* synthetic */ boolean isInitialized();
    }

    private Everscale() {
    }

    public static void registerAllExtensions(C4987l lVar) {
    }
}
