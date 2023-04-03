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

public final class Hedera {

    /* renamed from: wallet.core.jni.proto.Hedera$1 */
    public static /* synthetic */ class C97481 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f46564xa1df5c61;

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
                f46564xa1df5c61 = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f46564xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f46564xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f46564xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f46564xa1df5c61     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f46564xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f46564xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wallet.core.jni.proto.Hedera.C97481.<clinit>():void");
        }
    }

    public static final class SigningInput extends GeneratedMessageLite<SigningInput, Builder> implements SigningInputOrBuilder {
        public static final int BODY_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final SigningInput DEFAULT_INSTANCE;
        private static volatile im4<SigningInput> PARSER = null;
        public static final int PRIVATE_KEY_FIELD_NUMBER = 1;
        private TransactionBody body_;
        private ByteString privateKey_ = ByteString.EMPTY;

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningInput, Builder> implements SigningInputOrBuilder {
            public /* synthetic */ Builder(C97481 r1) {
                this();
            }

            public Builder clearBody() {
                copyOnWrite();
                ((SigningInput) this.instance).clearBody();
                return this;
            }

            public Builder clearPrivateKey() {
                copyOnWrite();
                ((SigningInput) this.instance).clearPrivateKey();
                return this;
            }

            public TransactionBody getBody() {
                return ((SigningInput) this.instance).getBody();
            }

            public ByteString getPrivateKey() {
                return ((SigningInput) this.instance).getPrivateKey();
            }

            public boolean hasBody() {
                return ((SigningInput) this.instance).hasBody();
            }

            public Builder mergeBody(TransactionBody transactionBody) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeBody(transactionBody);
                return this;
            }

            public Builder setBody(TransactionBody transactionBody) {
                copyOnWrite();
                ((SigningInput) this.instance).setBody(transactionBody);
                return this;
            }

            public Builder setPrivateKey(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setPrivateKey(byteString);
                return this;
            }

            private Builder() {
                super(SigningInput.DEFAULT_INSTANCE);
            }

            public Builder setBody(TransactionBody.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setBody((TransactionBody) builder.build());
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
        public void clearBody() {
            this.body_ = null;
        }

        /* access modifiers changed from: private */
        public void clearPrivateKey() {
            this.privateKey_ = getDefaultInstance().getPrivateKey();
        }

        public static SigningInput getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeBody(TransactionBody transactionBody) {
            transactionBody.getClass();
            TransactionBody transactionBody2 = this.body_;
            if (transactionBody2 == null || transactionBody2 == TransactionBody.getDefaultInstance()) {
                this.body_ = transactionBody;
            } else {
                this.body_ = (TransactionBody) ((TransactionBody.Builder) TransactionBody.newBuilder(this.body_).mergeFrom(transactionBody)).buildPartial();
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
        public void setBody(TransactionBody transactionBody) {
            transactionBody.getClass();
            this.body_ = transactionBody;
        }

        /* access modifiers changed from: private */
        public void setPrivateKey(ByteString byteString) {
            byteString.getClass();
            this.privateKey_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97481.f46564xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningInput();
                case 2:
                    return new Builder((C97481) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\t", new Object[]{"privateKey_", "body_"});
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

        public TransactionBody getBody() {
            TransactionBody transactionBody = this.body_;
            if (transactionBody == null) {
                return TransactionBody.getDefaultInstance();
            }
            return transactionBody;
        }

        public ByteString getPrivateKey() {
            return this.privateKey_;
        }

        public boolean hasBody() {
            if (this.body_ != null) {
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
        TransactionBody getBody();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        ByteString getPrivateKey();

        boolean hasBody();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SigningOutput extends GeneratedMessageLite<SigningOutput, Builder> implements SigningOutputOrBuilder {
        /* access modifiers changed from: private */
        public static final SigningOutput DEFAULT_INSTANCE;
        public static final int ENCODED_FIELD_NUMBER = 1;
        private static volatile im4<SigningOutput> PARSER;
        private ByteString encoded_ = ByteString.EMPTY;

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningOutput, Builder> implements SigningOutputOrBuilder {
            public /* synthetic */ Builder(C97481 r1) {
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
            switch (C97481.f46564xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningOutput();
                case 2:
                    return new Builder((C97481) null);
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

    public static final class Timestamp extends GeneratedMessageLite<Timestamp, Builder> implements TimestampOrBuilder {
        /* access modifiers changed from: private */
        public static final Timestamp DEFAULT_INSTANCE;
        public static final int NANOS_FIELD_NUMBER = 2;
        private static volatile im4<Timestamp> PARSER = null;
        public static final int SECONDS_FIELD_NUMBER = 1;
        private int nanos_;
        private long seconds_;

        public static final class Builder extends GeneratedMessageLite.C4930a<Timestamp, Builder> implements TimestampOrBuilder {
            public /* synthetic */ Builder(C97481 r1) {
                this();
            }

            public Builder clearNanos() {
                copyOnWrite();
                ((Timestamp) this.instance).clearNanos();
                return this;
            }

            public Builder clearSeconds() {
                copyOnWrite();
                ((Timestamp) this.instance).clearSeconds();
                return this;
            }

            public int getNanos() {
                return ((Timestamp) this.instance).getNanos();
            }

            public long getSeconds() {
                return ((Timestamp) this.instance).getSeconds();
            }

            public Builder setNanos(int i) {
                copyOnWrite();
                ((Timestamp) this.instance).setNanos(i);
                return this;
            }

            public Builder setSeconds(long j) {
                copyOnWrite();
                ((Timestamp) this.instance).setSeconds(j);
                return this;
            }

            private Builder() {
                super(Timestamp.DEFAULT_INSTANCE);
            }
        }

        static {
            Timestamp timestamp = new Timestamp();
            DEFAULT_INSTANCE = timestamp;
            GeneratedMessageLite.registerDefaultInstance(Timestamp.class, timestamp);
        }

        private Timestamp() {
        }

        /* access modifiers changed from: private */
        public void clearNanos() {
            this.nanos_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSeconds() {
            this.seconds_ = 0;
        }

        public static Timestamp getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Timestamp parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Timestamp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Timestamp parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Timestamp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<Timestamp> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setNanos(int i) {
            this.nanos_ = i;
        }

        /* access modifiers changed from: private */
        public void setSeconds(long j) {
            this.seconds_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97481.f46564xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Timestamp();
                case 2:
                    return new Builder((C97481) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<Timestamp> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (Timestamp.class) {
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

        public int getNanos() {
            return this.nanos_;
        }

        public long getSeconds() {
            return this.seconds_;
        }

        public static Builder newBuilder(Timestamp timestamp) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(timestamp);
        }

        public static Timestamp parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Timestamp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Timestamp parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (Timestamp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static Timestamp parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Timestamp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Timestamp parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (Timestamp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static Timestamp parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Timestamp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Timestamp parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (Timestamp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static Timestamp parseFrom(InputStream inputStream) throws IOException {
            return (Timestamp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Timestamp parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Timestamp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Timestamp parseFrom(C4969g gVar) throws IOException {
            return (Timestamp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static Timestamp parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (Timestamp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface TimestampOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        int getNanos();

        long getSeconds();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TransactionBody extends GeneratedMessageLite<TransactionBody, Builder> implements TransactionBodyOrBuilder {
        /* access modifiers changed from: private */
        public static final TransactionBody DEFAULT_INSTANCE;
        public static final int MEMO_FIELD_NUMBER = 5;
        public static final int NODEACCOUNTID_FIELD_NUMBER = 2;
        private static volatile im4<TransactionBody> PARSER = null;
        public static final int TRANSACTIONFEE_FIELD_NUMBER = 3;
        public static final int TRANSACTIONID_FIELD_NUMBER = 1;
        public static final int TRANSACTIONVALIDDURATION_FIELD_NUMBER = 4;
        public static final int TRANSFER_FIELD_NUMBER = 6;
        private int dataCase_ = 0;
        private Object data_;
        private String memo_ = "";
        private String nodeAccountID_ = "";
        private long transactionFee_;
        private TransactionID transactionID_;
        private long transactionValidDuration_;

        public static final class Builder extends GeneratedMessageLite.C4930a<TransactionBody, Builder> implements TransactionBodyOrBuilder {
            public /* synthetic */ Builder(C97481 r1) {
                this();
            }

            public Builder clearData() {
                copyOnWrite();
                ((TransactionBody) this.instance).clearData();
                return this;
            }

            public Builder clearMemo() {
                copyOnWrite();
                ((TransactionBody) this.instance).clearMemo();
                return this;
            }

            public Builder clearNodeAccountID() {
                copyOnWrite();
                ((TransactionBody) this.instance).clearNodeAccountID();
                return this;
            }

            public Builder clearTransactionFee() {
                copyOnWrite();
                ((TransactionBody) this.instance).clearTransactionFee();
                return this;
            }

            public Builder clearTransactionID() {
                copyOnWrite();
                ((TransactionBody) this.instance).clearTransactionID();
                return this;
            }

            public Builder clearTransactionValidDuration() {
                copyOnWrite();
                ((TransactionBody) this.instance).clearTransactionValidDuration();
                return this;
            }

            public Builder clearTransfer() {
                copyOnWrite();
                ((TransactionBody) this.instance).clearTransfer();
                return this;
            }

            public DataCase getDataCase() {
                return ((TransactionBody) this.instance).getDataCase();
            }

            public String getMemo() {
                return ((TransactionBody) this.instance).getMemo();
            }

            public ByteString getMemoBytes() {
                return ((TransactionBody) this.instance).getMemoBytes();
            }

            public String getNodeAccountID() {
                return ((TransactionBody) this.instance).getNodeAccountID();
            }

            public ByteString getNodeAccountIDBytes() {
                return ((TransactionBody) this.instance).getNodeAccountIDBytes();
            }

            public long getTransactionFee() {
                return ((TransactionBody) this.instance).getTransactionFee();
            }

            public TransactionID getTransactionID() {
                return ((TransactionBody) this.instance).getTransactionID();
            }

            public long getTransactionValidDuration() {
                return ((TransactionBody) this.instance).getTransactionValidDuration();
            }

            public TransferMessage getTransfer() {
                return ((TransactionBody) this.instance).getTransfer();
            }

            public boolean hasTransactionID() {
                return ((TransactionBody) this.instance).hasTransactionID();
            }

            public boolean hasTransfer() {
                return ((TransactionBody) this.instance).hasTransfer();
            }

            public Builder mergeTransactionID(TransactionID transactionID) {
                copyOnWrite();
                ((TransactionBody) this.instance).mergeTransactionID(transactionID);
                return this;
            }

            public Builder mergeTransfer(TransferMessage transferMessage) {
                copyOnWrite();
                ((TransactionBody) this.instance).mergeTransfer(transferMessage);
                return this;
            }

            public Builder setMemo(String str) {
                copyOnWrite();
                ((TransactionBody) this.instance).setMemo(str);
                return this;
            }

            public Builder setMemoBytes(ByteString byteString) {
                copyOnWrite();
                ((TransactionBody) this.instance).setMemoBytes(byteString);
                return this;
            }

            public Builder setNodeAccountID(String str) {
                copyOnWrite();
                ((TransactionBody) this.instance).setNodeAccountID(str);
                return this;
            }

            public Builder setNodeAccountIDBytes(ByteString byteString) {
                copyOnWrite();
                ((TransactionBody) this.instance).setNodeAccountIDBytes(byteString);
                return this;
            }

            public Builder setTransactionFee(long j) {
                copyOnWrite();
                ((TransactionBody) this.instance).setTransactionFee(j);
                return this;
            }

            public Builder setTransactionID(TransactionID transactionID) {
                copyOnWrite();
                ((TransactionBody) this.instance).setTransactionID(transactionID);
                return this;
            }

            public Builder setTransactionValidDuration(long j) {
                copyOnWrite();
                ((TransactionBody) this.instance).setTransactionValidDuration(j);
                return this;
            }

            public Builder setTransfer(TransferMessage transferMessage) {
                copyOnWrite();
                ((TransactionBody) this.instance).setTransfer(transferMessage);
                return this;
            }

            private Builder() {
                super(TransactionBody.DEFAULT_INSTANCE);
            }

            public Builder setTransactionID(TransactionID.Builder builder) {
                copyOnWrite();
                ((TransactionBody) this.instance).setTransactionID((TransactionID) builder.build());
                return this;
            }

            public Builder setTransfer(TransferMessage.Builder builder) {
                copyOnWrite();
                ((TransactionBody) this.instance).setTransfer((TransferMessage) builder.build());
                return this;
            }
        }

        public enum DataCase {
            TRANSFER(6),
            DATA_NOT_SET(0);
            
            private final int value;

            private DataCase(int i) {
                this.value = i;
            }

            public static DataCase forNumber(int i) {
                if (i == 0) {
                    return DATA_NOT_SET;
                }
                if (i != 6) {
                    return null;
                }
                return TRANSFER;
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static DataCase valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            TransactionBody transactionBody = new TransactionBody();
            DEFAULT_INSTANCE = transactionBody;
            GeneratedMessageLite.registerDefaultInstance(TransactionBody.class, transactionBody);
        }

        private TransactionBody() {
        }

        /* access modifiers changed from: private */
        public void clearData() {
            this.dataCase_ = 0;
            this.data_ = null;
        }

        /* access modifiers changed from: private */
        public void clearMemo() {
            this.memo_ = getDefaultInstance().getMemo();
        }

        /* access modifiers changed from: private */
        public void clearNodeAccountID() {
            this.nodeAccountID_ = getDefaultInstance().getNodeAccountID();
        }

        /* access modifiers changed from: private */
        public void clearTransactionFee() {
            this.transactionFee_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTransactionID() {
            this.transactionID_ = null;
        }

        /* access modifiers changed from: private */
        public void clearTransactionValidDuration() {
            this.transactionValidDuration_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTransfer() {
            if (this.dataCase_ == 6) {
                this.dataCase_ = 0;
                this.data_ = null;
            }
        }

        public static TransactionBody getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeTransactionID(TransactionID transactionID) {
            transactionID.getClass();
            TransactionID transactionID2 = this.transactionID_;
            if (transactionID2 == null || transactionID2 == TransactionID.getDefaultInstance()) {
                this.transactionID_ = transactionID;
            } else {
                this.transactionID_ = (TransactionID) ((TransactionID.Builder) TransactionID.newBuilder(this.transactionID_).mergeFrom(transactionID)).buildPartial();
            }
        }

        /* access modifiers changed from: private */
        public void mergeTransfer(TransferMessage transferMessage) {
            transferMessage.getClass();
            if (this.dataCase_ != 6 || this.data_ == TransferMessage.getDefaultInstance()) {
                this.data_ = transferMessage;
            } else {
                this.data_ = ((TransferMessage.Builder) TransferMessage.newBuilder((TransferMessage) this.data_).mergeFrom(transferMessage)).buildPartial();
            }
            this.dataCase_ = 6;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TransactionBody parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TransactionBody) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TransactionBody parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TransactionBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<TransactionBody> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setMemo(String str) {
            str.getClass();
            this.memo_ = str;
        }

        /* access modifiers changed from: private */
        public void setMemoBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.memo_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setNodeAccountID(String str) {
            str.getClass();
            this.nodeAccountID_ = str;
        }

        /* access modifiers changed from: private */
        public void setNodeAccountIDBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.nodeAccountID_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setTransactionFee(long j) {
            this.transactionFee_ = j;
        }

        /* access modifiers changed from: private */
        public void setTransactionID(TransactionID transactionID) {
            transactionID.getClass();
            this.transactionID_ = transactionID;
        }

        /* access modifiers changed from: private */
        public void setTransactionValidDuration(long j) {
            this.transactionValidDuration_ = j;
        }

        /* access modifiers changed from: private */
        public void setTransfer(TransferMessage transferMessage) {
            transferMessage.getClass();
            this.data_ = transferMessage;
            this.dataCase_ = 6;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97481.f46564xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TransactionBody();
                case 2:
                    return new Builder((C97481) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003\u0003\u0004\u0002\u0005Ȉ\u0006<\u0000", new Object[]{"data_", "dataCase_", "transactionID_", "nodeAccountID_", "transactionFee_", "transactionValidDuration_", "memo_", TransferMessage.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<TransactionBody> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (TransactionBody.class) {
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

        public DataCase getDataCase() {
            return DataCase.forNumber(this.dataCase_);
        }

        public String getMemo() {
            return this.memo_;
        }

        public ByteString getMemoBytes() {
            return ByteString.copyFromUtf8(this.memo_);
        }

        public String getNodeAccountID() {
            return this.nodeAccountID_;
        }

        public ByteString getNodeAccountIDBytes() {
            return ByteString.copyFromUtf8(this.nodeAccountID_);
        }

        public long getTransactionFee() {
            return this.transactionFee_;
        }

        public TransactionID getTransactionID() {
            TransactionID transactionID = this.transactionID_;
            if (transactionID == null) {
                return TransactionID.getDefaultInstance();
            }
            return transactionID;
        }

        public long getTransactionValidDuration() {
            return this.transactionValidDuration_;
        }

        public TransferMessage getTransfer() {
            if (this.dataCase_ == 6) {
                return (TransferMessage) this.data_;
            }
            return TransferMessage.getDefaultInstance();
        }

        public boolean hasTransactionID() {
            if (this.transactionID_ != null) {
                return true;
            }
            return false;
        }

        public boolean hasTransfer() {
            if (this.dataCase_ == 6) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(TransactionBody transactionBody) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(transactionBody);
        }

        public static TransactionBody parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TransactionBody) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TransactionBody parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransactionBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static TransactionBody parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TransactionBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TransactionBody parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransactionBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static TransactionBody parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TransactionBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TransactionBody parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransactionBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static TransactionBody parseFrom(InputStream inputStream) throws IOException {
            return (TransactionBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TransactionBody parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TransactionBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TransactionBody parseFrom(C4969g gVar) throws IOException {
            return (TransactionBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static TransactionBody parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (TransactionBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface TransactionBodyOrBuilder extends qu3 {
        TransactionBody.DataCase getDataCase();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getMemo();

        ByteString getMemoBytes();

        String getNodeAccountID();

        ByteString getNodeAccountIDBytes();

        long getTransactionFee();

        TransactionID getTransactionID();

        long getTransactionValidDuration();

        TransferMessage getTransfer();

        boolean hasTransactionID();

        boolean hasTransfer();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TransactionID extends GeneratedMessageLite<TransactionID, Builder> implements TransactionIDOrBuilder {
        public static final int ACCOUNTID_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final TransactionID DEFAULT_INSTANCE;
        public static final int NONCE_FIELD_NUMBER = 4;
        private static volatile im4<TransactionID> PARSER = null;
        public static final int SCHEDULED_FIELD_NUMBER = 3;
        public static final int TRANSACTIONVALIDSTART_FIELD_NUMBER = 1;
        private String accountID_ = "";
        private int nonce_;
        private boolean scheduled_;
        private Timestamp transactionValidStart_;

        public static final class Builder extends GeneratedMessageLite.C4930a<TransactionID, Builder> implements TransactionIDOrBuilder {
            public /* synthetic */ Builder(C97481 r1) {
                this();
            }

            public Builder clearAccountID() {
                copyOnWrite();
                ((TransactionID) this.instance).clearAccountID();
                return this;
            }

            public Builder clearNonce() {
                copyOnWrite();
                ((TransactionID) this.instance).clearNonce();
                return this;
            }

            public Builder clearScheduled() {
                copyOnWrite();
                ((TransactionID) this.instance).clearScheduled();
                return this;
            }

            public Builder clearTransactionValidStart() {
                copyOnWrite();
                ((TransactionID) this.instance).clearTransactionValidStart();
                return this;
            }

            public String getAccountID() {
                return ((TransactionID) this.instance).getAccountID();
            }

            public ByteString getAccountIDBytes() {
                return ((TransactionID) this.instance).getAccountIDBytes();
            }

            public int getNonce() {
                return ((TransactionID) this.instance).getNonce();
            }

            public boolean getScheduled() {
                return ((TransactionID) this.instance).getScheduled();
            }

            public Timestamp getTransactionValidStart() {
                return ((TransactionID) this.instance).getTransactionValidStart();
            }

            public boolean hasTransactionValidStart() {
                return ((TransactionID) this.instance).hasTransactionValidStart();
            }

            public Builder mergeTransactionValidStart(Timestamp timestamp) {
                copyOnWrite();
                ((TransactionID) this.instance).mergeTransactionValidStart(timestamp);
                return this;
            }

            public Builder setAccountID(String str) {
                copyOnWrite();
                ((TransactionID) this.instance).setAccountID(str);
                return this;
            }

            public Builder setAccountIDBytes(ByteString byteString) {
                copyOnWrite();
                ((TransactionID) this.instance).setAccountIDBytes(byteString);
                return this;
            }

            public Builder setNonce(int i) {
                copyOnWrite();
                ((TransactionID) this.instance).setNonce(i);
                return this;
            }

            public Builder setScheduled(boolean z) {
                copyOnWrite();
                ((TransactionID) this.instance).setScheduled(z);
                return this;
            }

            public Builder setTransactionValidStart(Timestamp timestamp) {
                copyOnWrite();
                ((TransactionID) this.instance).setTransactionValidStart(timestamp);
                return this;
            }

            private Builder() {
                super(TransactionID.DEFAULT_INSTANCE);
            }

            public Builder setTransactionValidStart(Timestamp.Builder builder) {
                copyOnWrite();
                ((TransactionID) this.instance).setTransactionValidStart((Timestamp) builder.build());
                return this;
            }
        }

        static {
            TransactionID transactionID = new TransactionID();
            DEFAULT_INSTANCE = transactionID;
            GeneratedMessageLite.registerDefaultInstance(TransactionID.class, transactionID);
        }

        private TransactionID() {
        }

        /* access modifiers changed from: private */
        public void clearAccountID() {
            this.accountID_ = getDefaultInstance().getAccountID();
        }

        /* access modifiers changed from: private */
        public void clearNonce() {
            this.nonce_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearScheduled() {
            this.scheduled_ = false;
        }

        /* access modifiers changed from: private */
        public void clearTransactionValidStart() {
            this.transactionValidStart_ = null;
        }

        public static TransactionID getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeTransactionValidStart(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.transactionValidStart_;
            if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
                this.transactionValidStart_ = timestamp;
            } else {
                this.transactionValidStart_ = (Timestamp) ((Timestamp.Builder) Timestamp.newBuilder(this.transactionValidStart_).mergeFrom(timestamp)).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TransactionID parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TransactionID) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TransactionID parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TransactionID) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<TransactionID> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAccountID(String str) {
            str.getClass();
            this.accountID_ = str;
        }

        /* access modifiers changed from: private */
        public void setAccountIDBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.accountID_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setNonce(int i) {
            this.nonce_ = i;
        }

        /* access modifiers changed from: private */
        public void setScheduled(boolean z) {
            this.scheduled_ = z;
        }

        /* access modifiers changed from: private */
        public void setTransactionValidStart(Timestamp timestamp) {
            timestamp.getClass();
            this.transactionValidStart_ = timestamp;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97481.f46564xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TransactionID();
                case 2:
                    return new Builder((C97481) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003\u0007\u0004\u0004", new Object[]{"transactionValidStart_", "accountID_", "scheduled_", "nonce_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<TransactionID> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (TransactionID.class) {
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

        public String getAccountID() {
            return this.accountID_;
        }

        public ByteString getAccountIDBytes() {
            return ByteString.copyFromUtf8(this.accountID_);
        }

        public int getNonce() {
            return this.nonce_;
        }

        public boolean getScheduled() {
            return this.scheduled_;
        }

        public Timestamp getTransactionValidStart() {
            Timestamp timestamp = this.transactionValidStart_;
            if (timestamp == null) {
                return Timestamp.getDefaultInstance();
            }
            return timestamp;
        }

        public boolean hasTransactionValidStart() {
            if (this.transactionValidStart_ != null) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(TransactionID transactionID) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(transactionID);
        }

        public static TransactionID parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TransactionID) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TransactionID parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransactionID) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static TransactionID parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TransactionID) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TransactionID parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransactionID) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static TransactionID parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TransactionID) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TransactionID parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransactionID) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static TransactionID parseFrom(InputStream inputStream) throws IOException {
            return (TransactionID) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TransactionID parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TransactionID) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TransactionID parseFrom(C4969g gVar) throws IOException {
            return (TransactionID) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static TransactionID parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (TransactionID) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface TransactionIDOrBuilder extends qu3 {
        String getAccountID();

        ByteString getAccountIDBytes();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        int getNonce();

        boolean getScheduled();

        Timestamp getTransactionValidStart();

        boolean hasTransactionValidStart();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TransferMessage extends GeneratedMessageLite<TransferMessage, Builder> implements TransferMessageOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final TransferMessage DEFAULT_INSTANCE;
        public static final int FROM_FIELD_NUMBER = 1;
        private static volatile im4<TransferMessage> PARSER = null;
        public static final int TO_FIELD_NUMBER = 2;
        private long amount_;
        private String from_ = "";
        private String to_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<TransferMessage, Builder> implements TransferMessageOrBuilder {
            public /* synthetic */ Builder(C97481 r1) {
                this();
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((TransferMessage) this.instance).clearAmount();
                return this;
            }

            public Builder clearFrom() {
                copyOnWrite();
                ((TransferMessage) this.instance).clearFrom();
                return this;
            }

            public Builder clearTo() {
                copyOnWrite();
                ((TransferMessage) this.instance).clearTo();
                return this;
            }

            public long getAmount() {
                return ((TransferMessage) this.instance).getAmount();
            }

            public String getFrom() {
                return ((TransferMessage) this.instance).getFrom();
            }

            public ByteString getFromBytes() {
                return ((TransferMessage) this.instance).getFromBytes();
            }

            public String getTo() {
                return ((TransferMessage) this.instance).getTo();
            }

            public ByteString getToBytes() {
                return ((TransferMessage) this.instance).getToBytes();
            }

            public Builder setAmount(long j) {
                copyOnWrite();
                ((TransferMessage) this.instance).setAmount(j);
                return this;
            }

            public Builder setFrom(String str) {
                copyOnWrite();
                ((TransferMessage) this.instance).setFrom(str);
                return this;
            }

            public Builder setFromBytes(ByteString byteString) {
                copyOnWrite();
                ((TransferMessage) this.instance).setFromBytes(byteString);
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
            this.amount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFrom() {
            this.from_ = getDefaultInstance().getFrom();
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
        public void setAmount(long j) {
            this.amount_ = j;
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

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97481.f46564xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TransferMessage();
                case 2:
                    return new Builder((C97481) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0010", new Object[]{"from_", "to_", "amount_"});
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

        public long getAmount() {
            return this.amount_;
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
        long getAmount();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getFrom();

        ByteString getFromBytes();

        String getTo();

        ByteString getToBytes();

        /* synthetic */ boolean isInitialized();
    }

    private Hedera() {
    }

    public static void registerAllExtensions(C4987l lVar) {
    }
}
