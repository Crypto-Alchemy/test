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

public final class Waves {

    /* renamed from: wallet.core.jni.proto.Waves$1 */
    public static /* synthetic */ class C97751 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f46587xa1df5c61;

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
                f46587xa1df5c61 = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f46587xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f46587xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f46587xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f46587xa1df5c61     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f46587xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f46587xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wallet.core.jni.proto.Waves.C97751.<clinit>():void");
        }
    }

    public static final class CancelLeaseMessage extends GeneratedMessageLite<CancelLeaseMessage, Builder> implements CancelLeaseMessageOrBuilder {
        /* access modifiers changed from: private */
        public static final CancelLeaseMessage DEFAULT_INSTANCE;
        public static final int FEE_FIELD_NUMBER = 2;
        public static final int LEASE_ID_FIELD_NUMBER = 1;
        private static volatile im4<CancelLeaseMessage> PARSER;
        private long fee_;
        private String leaseId_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<CancelLeaseMessage, Builder> implements CancelLeaseMessageOrBuilder {
            public /* synthetic */ Builder(C97751 r1) {
                this();
            }

            public Builder clearFee() {
                copyOnWrite();
                ((CancelLeaseMessage) this.instance).clearFee();
                return this;
            }

            public Builder clearLeaseId() {
                copyOnWrite();
                ((CancelLeaseMessage) this.instance).clearLeaseId();
                return this;
            }

            public long getFee() {
                return ((CancelLeaseMessage) this.instance).getFee();
            }

            public String getLeaseId() {
                return ((CancelLeaseMessage) this.instance).getLeaseId();
            }

            public ByteString getLeaseIdBytes() {
                return ((CancelLeaseMessage) this.instance).getLeaseIdBytes();
            }

            public Builder setFee(long j) {
                copyOnWrite();
                ((CancelLeaseMessage) this.instance).setFee(j);
                return this;
            }

            public Builder setLeaseId(String str) {
                copyOnWrite();
                ((CancelLeaseMessage) this.instance).setLeaseId(str);
                return this;
            }

            public Builder setLeaseIdBytes(ByteString byteString) {
                copyOnWrite();
                ((CancelLeaseMessage) this.instance).setLeaseIdBytes(byteString);
                return this;
            }

            private Builder() {
                super(CancelLeaseMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            CancelLeaseMessage cancelLeaseMessage = new CancelLeaseMessage();
            DEFAULT_INSTANCE = cancelLeaseMessage;
            GeneratedMessageLite.registerDefaultInstance(CancelLeaseMessage.class, cancelLeaseMessage);
        }

        private CancelLeaseMessage() {
        }

        /* access modifiers changed from: private */
        public void clearFee() {
            this.fee_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearLeaseId() {
            this.leaseId_ = getDefaultInstance().getLeaseId();
        }

        public static CancelLeaseMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static CancelLeaseMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CancelLeaseMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CancelLeaseMessage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CancelLeaseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<CancelLeaseMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setFee(long j) {
            this.fee_ = j;
        }

        /* access modifiers changed from: private */
        public void setLeaseId(String str) {
            str.getClass();
            this.leaseId_ = str;
        }

        /* access modifiers changed from: private */
        public void setLeaseIdBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.leaseId_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97751.f46587xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new CancelLeaseMessage();
                case 2:
                    return new Builder((C97751) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0002", new Object[]{"leaseId_", "fee_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<CancelLeaseMessage> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (CancelLeaseMessage.class) {
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

        public long getFee() {
            return this.fee_;
        }

        public String getLeaseId() {
            return this.leaseId_;
        }

        public ByteString getLeaseIdBytes() {
            return ByteString.copyFromUtf8(this.leaseId_);
        }

        public static Builder newBuilder(CancelLeaseMessage cancelLeaseMessage) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(cancelLeaseMessage);
        }

        public static CancelLeaseMessage parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (CancelLeaseMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static CancelLeaseMessage parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (CancelLeaseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static CancelLeaseMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CancelLeaseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CancelLeaseMessage parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (CancelLeaseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static CancelLeaseMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CancelLeaseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CancelLeaseMessage parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (CancelLeaseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static CancelLeaseMessage parseFrom(InputStream inputStream) throws IOException {
            return (CancelLeaseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CancelLeaseMessage parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (CancelLeaseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static CancelLeaseMessage parseFrom(C4969g gVar) throws IOException {
            return (CancelLeaseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static CancelLeaseMessage parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (CancelLeaseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface CancelLeaseMessageOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        long getFee();

        String getLeaseId();

        ByteString getLeaseIdBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class LeaseMessage extends GeneratedMessageLite<LeaseMessage, Builder> implements LeaseMessageOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final LeaseMessage DEFAULT_INSTANCE;
        public static final int FEE_FIELD_NUMBER = 3;
        private static volatile im4<LeaseMessage> PARSER = null;
        public static final int TO_FIELD_NUMBER = 2;
        private long amount_;
        private long fee_;
        private String to_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<LeaseMessage, Builder> implements LeaseMessageOrBuilder {
            public /* synthetic */ Builder(C97751 r1) {
                this();
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((LeaseMessage) this.instance).clearAmount();
                return this;
            }

            public Builder clearFee() {
                copyOnWrite();
                ((LeaseMessage) this.instance).clearFee();
                return this;
            }

            public Builder clearTo() {
                copyOnWrite();
                ((LeaseMessage) this.instance).clearTo();
                return this;
            }

            public long getAmount() {
                return ((LeaseMessage) this.instance).getAmount();
            }

            public long getFee() {
                return ((LeaseMessage) this.instance).getFee();
            }

            public String getTo() {
                return ((LeaseMessage) this.instance).getTo();
            }

            public ByteString getToBytes() {
                return ((LeaseMessage) this.instance).getToBytes();
            }

            public Builder setAmount(long j) {
                copyOnWrite();
                ((LeaseMessage) this.instance).setAmount(j);
                return this;
            }

            public Builder setFee(long j) {
                copyOnWrite();
                ((LeaseMessage) this.instance).setFee(j);
                return this;
            }

            public Builder setTo(String str) {
                copyOnWrite();
                ((LeaseMessage) this.instance).setTo(str);
                return this;
            }

            public Builder setToBytes(ByteString byteString) {
                copyOnWrite();
                ((LeaseMessage) this.instance).setToBytes(byteString);
                return this;
            }

            private Builder() {
                super(LeaseMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            LeaseMessage leaseMessage = new LeaseMessage();
            DEFAULT_INSTANCE = leaseMessage;
            GeneratedMessageLite.registerDefaultInstance(LeaseMessage.class, leaseMessage);
        }

        private LeaseMessage() {
        }

        /* access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFee() {
            this.fee_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTo() {
            this.to_ = getDefaultInstance().getTo();
        }

        public static LeaseMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static LeaseMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LeaseMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LeaseMessage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (LeaseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<LeaseMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAmount(long j) {
            this.amount_ = j;
        }

        /* access modifiers changed from: private */
        public void setFee(long j) {
            this.fee_ = j;
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
            switch (C97751.f46587xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LeaseMessage();
                case 2:
                    return new Builder((C97751) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002Ȉ\u0003\u0002", new Object[]{"amount_", "to_", "fee_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<LeaseMessage> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (LeaseMessage.class) {
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

        public long getFee() {
            return this.fee_;
        }

        public String getTo() {
            return this.to_;
        }

        public ByteString getToBytes() {
            return ByteString.copyFromUtf8(this.to_);
        }

        public static Builder newBuilder(LeaseMessage leaseMessage) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(leaseMessage);
        }

        public static LeaseMessage parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (LeaseMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static LeaseMessage parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (LeaseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static LeaseMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LeaseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static LeaseMessage parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (LeaseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static LeaseMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LeaseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LeaseMessage parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (LeaseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static LeaseMessage parseFrom(InputStream inputStream) throws IOException {
            return (LeaseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LeaseMessage parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (LeaseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static LeaseMessage parseFrom(C4969g gVar) throws IOException {
            return (LeaseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static LeaseMessage parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (LeaseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface LeaseMessageOrBuilder extends qu3 {
        long getAmount();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        long getFee();

        String getTo();

        ByteString getToBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SigningInput extends GeneratedMessageLite<SigningInput, Builder> implements SigningInputOrBuilder {
        public static final int CANCEL_LEASE_MESSAGE_FIELD_NUMBER = 5;
        /* access modifiers changed from: private */
        public static final SigningInput DEFAULT_INSTANCE;
        public static final int LEASE_MESSAGE_FIELD_NUMBER = 4;
        private static volatile im4<SigningInput> PARSER = null;
        public static final int PRIVATE_KEY_FIELD_NUMBER = 2;
        public static final int TIMESTAMP_FIELD_NUMBER = 1;
        public static final int TRANSFER_MESSAGE_FIELD_NUMBER = 3;
        private int messageOneofCase_ = 0;
        private Object messageOneof_;
        private ByteString privateKey_ = ByteString.EMPTY;
        private long timestamp_;

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningInput, Builder> implements SigningInputOrBuilder {
            public /* synthetic */ Builder(C97751 r1) {
                this();
            }

            public Builder clearCancelLeaseMessage() {
                copyOnWrite();
                ((SigningInput) this.instance).clearCancelLeaseMessage();
                return this;
            }

            public Builder clearLeaseMessage() {
                copyOnWrite();
                ((SigningInput) this.instance).clearLeaseMessage();
                return this;
            }

            public Builder clearMessageOneof() {
                copyOnWrite();
                ((SigningInput) this.instance).clearMessageOneof();
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

            public Builder clearTransferMessage() {
                copyOnWrite();
                ((SigningInput) this.instance).clearTransferMessage();
                return this;
            }

            public CancelLeaseMessage getCancelLeaseMessage() {
                return ((SigningInput) this.instance).getCancelLeaseMessage();
            }

            public LeaseMessage getLeaseMessage() {
                return ((SigningInput) this.instance).getLeaseMessage();
            }

            public MessageOneofCase getMessageOneofCase() {
                return ((SigningInput) this.instance).getMessageOneofCase();
            }

            public ByteString getPrivateKey() {
                return ((SigningInput) this.instance).getPrivateKey();
            }

            public long getTimestamp() {
                return ((SigningInput) this.instance).getTimestamp();
            }

            public TransferMessage getTransferMessage() {
                return ((SigningInput) this.instance).getTransferMessage();
            }

            public boolean hasCancelLeaseMessage() {
                return ((SigningInput) this.instance).hasCancelLeaseMessage();
            }

            public boolean hasLeaseMessage() {
                return ((SigningInput) this.instance).hasLeaseMessage();
            }

            public boolean hasTransferMessage() {
                return ((SigningInput) this.instance).hasTransferMessage();
            }

            public Builder mergeCancelLeaseMessage(CancelLeaseMessage cancelLeaseMessage) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeCancelLeaseMessage(cancelLeaseMessage);
                return this;
            }

            public Builder mergeLeaseMessage(LeaseMessage leaseMessage) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeLeaseMessage(leaseMessage);
                return this;
            }

            public Builder mergeTransferMessage(TransferMessage transferMessage) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeTransferMessage(transferMessage);
                return this;
            }

            public Builder setCancelLeaseMessage(CancelLeaseMessage cancelLeaseMessage) {
                copyOnWrite();
                ((SigningInput) this.instance).setCancelLeaseMessage(cancelLeaseMessage);
                return this;
            }

            public Builder setLeaseMessage(LeaseMessage leaseMessage) {
                copyOnWrite();
                ((SigningInput) this.instance).setLeaseMessage(leaseMessage);
                return this;
            }

            public Builder setPrivateKey(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setPrivateKey(byteString);
                return this;
            }

            public Builder setTimestamp(long j) {
                copyOnWrite();
                ((SigningInput) this.instance).setTimestamp(j);
                return this;
            }

            public Builder setTransferMessage(TransferMessage transferMessage) {
                copyOnWrite();
                ((SigningInput) this.instance).setTransferMessage(transferMessage);
                return this;
            }

            private Builder() {
                super(SigningInput.DEFAULT_INSTANCE);
            }

            public Builder setCancelLeaseMessage(CancelLeaseMessage.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setCancelLeaseMessage((CancelLeaseMessage) builder.build());
                return this;
            }

            public Builder setLeaseMessage(LeaseMessage.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setLeaseMessage((LeaseMessage) builder.build());
                return this;
            }

            public Builder setTransferMessage(TransferMessage.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setTransferMessage((TransferMessage) builder.build());
                return this;
            }
        }

        public enum MessageOneofCase {
            TRANSFER_MESSAGE(3),
            LEASE_MESSAGE(4),
            CANCEL_LEASE_MESSAGE(5),
            MESSAGEONEOF_NOT_SET(0);
            
            private final int value;

            private MessageOneofCase(int i) {
                this.value = i;
            }

            public static MessageOneofCase forNumber(int i) {
                if (i == 0) {
                    return MESSAGEONEOF_NOT_SET;
                }
                if (i == 3) {
                    return TRANSFER_MESSAGE;
                }
                if (i == 4) {
                    return LEASE_MESSAGE;
                }
                if (i != 5) {
                    return null;
                }
                return CANCEL_LEASE_MESSAGE;
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static MessageOneofCase valueOf(int i) {
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
        public void clearCancelLeaseMessage() {
            if (this.messageOneofCase_ == 5) {
                this.messageOneofCase_ = 0;
                this.messageOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearLeaseMessage() {
            if (this.messageOneofCase_ == 4) {
                this.messageOneofCase_ = 0;
                this.messageOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearMessageOneof() {
            this.messageOneofCase_ = 0;
            this.messageOneof_ = null;
        }

        /* access modifiers changed from: private */
        public void clearPrivateKey() {
            this.privateKey_ = getDefaultInstance().getPrivateKey();
        }

        /* access modifiers changed from: private */
        public void clearTimestamp() {
            this.timestamp_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTransferMessage() {
            if (this.messageOneofCase_ == 3) {
                this.messageOneofCase_ = 0;
                this.messageOneof_ = null;
            }
        }

        public static SigningInput getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeCancelLeaseMessage(CancelLeaseMessage cancelLeaseMessage) {
            cancelLeaseMessage.getClass();
            if (this.messageOneofCase_ != 5 || this.messageOneof_ == CancelLeaseMessage.getDefaultInstance()) {
                this.messageOneof_ = cancelLeaseMessage;
            } else {
                this.messageOneof_ = ((CancelLeaseMessage.Builder) CancelLeaseMessage.newBuilder((CancelLeaseMessage) this.messageOneof_).mergeFrom(cancelLeaseMessage)).buildPartial();
            }
            this.messageOneofCase_ = 5;
        }

        /* access modifiers changed from: private */
        public void mergeLeaseMessage(LeaseMessage leaseMessage) {
            leaseMessage.getClass();
            if (this.messageOneofCase_ != 4 || this.messageOneof_ == LeaseMessage.getDefaultInstance()) {
                this.messageOneof_ = leaseMessage;
            } else {
                this.messageOneof_ = ((LeaseMessage.Builder) LeaseMessage.newBuilder((LeaseMessage) this.messageOneof_).mergeFrom(leaseMessage)).buildPartial();
            }
            this.messageOneofCase_ = 4;
        }

        /* access modifiers changed from: private */
        public void mergeTransferMessage(TransferMessage transferMessage) {
            transferMessage.getClass();
            if (this.messageOneofCase_ != 3 || this.messageOneof_ == TransferMessage.getDefaultInstance()) {
                this.messageOneof_ = transferMessage;
            } else {
                this.messageOneof_ = ((TransferMessage.Builder) TransferMessage.newBuilder((TransferMessage) this.messageOneof_).mergeFrom(transferMessage)).buildPartial();
            }
            this.messageOneofCase_ = 3;
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
        public void setCancelLeaseMessage(CancelLeaseMessage cancelLeaseMessage) {
            cancelLeaseMessage.getClass();
            this.messageOneof_ = cancelLeaseMessage;
            this.messageOneofCase_ = 5;
        }

        /* access modifiers changed from: private */
        public void setLeaseMessage(LeaseMessage leaseMessage) {
            leaseMessage.getClass();
            this.messageOneof_ = leaseMessage;
            this.messageOneofCase_ = 4;
        }

        /* access modifiers changed from: private */
        public void setPrivateKey(ByteString byteString) {
            byteString.getClass();
            this.privateKey_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setTimestamp(long j) {
            this.timestamp_ = j;
        }

        /* access modifiers changed from: private */
        public void setTransferMessage(TransferMessage transferMessage) {
            transferMessage.getClass();
            this.messageOneof_ = transferMessage;
            this.messageOneofCase_ = 3;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97751.f46587xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningInput();
                case 2:
                    return new Builder((C97751) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0002\u0002\n\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"messageOneof_", "messageOneofCase_", "timestamp_", "privateKey_", TransferMessage.class, LeaseMessage.class, CancelLeaseMessage.class});
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

        public CancelLeaseMessage getCancelLeaseMessage() {
            if (this.messageOneofCase_ == 5) {
                return (CancelLeaseMessage) this.messageOneof_;
            }
            return CancelLeaseMessage.getDefaultInstance();
        }

        public LeaseMessage getLeaseMessage() {
            if (this.messageOneofCase_ == 4) {
                return (LeaseMessage) this.messageOneof_;
            }
            return LeaseMessage.getDefaultInstance();
        }

        public MessageOneofCase getMessageOneofCase() {
            return MessageOneofCase.forNumber(this.messageOneofCase_);
        }

        public ByteString getPrivateKey() {
            return this.privateKey_;
        }

        public long getTimestamp() {
            return this.timestamp_;
        }

        public TransferMessage getTransferMessage() {
            if (this.messageOneofCase_ == 3) {
                return (TransferMessage) this.messageOneof_;
            }
            return TransferMessage.getDefaultInstance();
        }

        public boolean hasCancelLeaseMessage() {
            if (this.messageOneofCase_ == 5) {
                return true;
            }
            return false;
        }

        public boolean hasLeaseMessage() {
            if (this.messageOneofCase_ == 4) {
                return true;
            }
            return false;
        }

        public boolean hasTransferMessage() {
            if (this.messageOneofCase_ == 3) {
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
        CancelLeaseMessage getCancelLeaseMessage();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        LeaseMessage getLeaseMessage();

        SigningInput.MessageOneofCase getMessageOneofCase();

        ByteString getPrivateKey();

        long getTimestamp();

        TransferMessage getTransferMessage();

        boolean hasCancelLeaseMessage();

        boolean hasLeaseMessage();

        boolean hasTransferMessage();

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
            public /* synthetic */ Builder(C97751 r1) {
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
            switch (C97751.f46587xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningOutput();
                case 2:
                    return new Builder((C97751) null);
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

    public static final class TransferMessage extends GeneratedMessageLite<TransferMessage, Builder> implements TransferMessageOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 1;
        public static final int ASSET_FIELD_NUMBER = 2;
        public static final int ATTACHMENT_FIELD_NUMBER = 6;
        /* access modifiers changed from: private */
        public static final TransferMessage DEFAULT_INSTANCE;
        public static final int FEE_ASSET_FIELD_NUMBER = 4;
        public static final int FEE_FIELD_NUMBER = 3;
        private static volatile im4<TransferMessage> PARSER = null;
        public static final int TO_FIELD_NUMBER = 5;
        private long amount_;
        private String asset_ = "";
        private ByteString attachment_ = ByteString.EMPTY;
        private String feeAsset_ = "";
        private long fee_;
        private String to_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<TransferMessage, Builder> implements TransferMessageOrBuilder {
            public /* synthetic */ Builder(C97751 r1) {
                this();
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((TransferMessage) this.instance).clearAmount();
                return this;
            }

            public Builder clearAsset() {
                copyOnWrite();
                ((TransferMessage) this.instance).clearAsset();
                return this;
            }

            public Builder clearAttachment() {
                copyOnWrite();
                ((TransferMessage) this.instance).clearAttachment();
                return this;
            }

            public Builder clearFee() {
                copyOnWrite();
                ((TransferMessage) this.instance).clearFee();
                return this;
            }

            public Builder clearFeeAsset() {
                copyOnWrite();
                ((TransferMessage) this.instance).clearFeeAsset();
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

            public String getAsset() {
                return ((TransferMessage) this.instance).getAsset();
            }

            public ByteString getAssetBytes() {
                return ((TransferMessage) this.instance).getAssetBytes();
            }

            public ByteString getAttachment() {
                return ((TransferMessage) this.instance).getAttachment();
            }

            public long getFee() {
                return ((TransferMessage) this.instance).getFee();
            }

            public String getFeeAsset() {
                return ((TransferMessage) this.instance).getFeeAsset();
            }

            public ByteString getFeeAssetBytes() {
                return ((TransferMessage) this.instance).getFeeAssetBytes();
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

            public Builder setAsset(String str) {
                copyOnWrite();
                ((TransferMessage) this.instance).setAsset(str);
                return this;
            }

            public Builder setAssetBytes(ByteString byteString) {
                copyOnWrite();
                ((TransferMessage) this.instance).setAssetBytes(byteString);
                return this;
            }

            public Builder setAttachment(ByteString byteString) {
                copyOnWrite();
                ((TransferMessage) this.instance).setAttachment(byteString);
                return this;
            }

            public Builder setFee(long j) {
                copyOnWrite();
                ((TransferMessage) this.instance).setFee(j);
                return this;
            }

            public Builder setFeeAsset(String str) {
                copyOnWrite();
                ((TransferMessage) this.instance).setFeeAsset(str);
                return this;
            }

            public Builder setFeeAssetBytes(ByteString byteString) {
                copyOnWrite();
                ((TransferMessage) this.instance).setFeeAssetBytes(byteString);
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
        public void clearAsset() {
            this.asset_ = getDefaultInstance().getAsset();
        }

        /* access modifiers changed from: private */
        public void clearAttachment() {
            this.attachment_ = getDefaultInstance().getAttachment();
        }

        /* access modifiers changed from: private */
        public void clearFee() {
            this.fee_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFeeAsset() {
            this.feeAsset_ = getDefaultInstance().getFeeAsset();
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
        public void setAsset(String str) {
            str.getClass();
            this.asset_ = str;
        }

        /* access modifiers changed from: private */
        public void setAssetBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.asset_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setAttachment(ByteString byteString) {
            byteString.getClass();
            this.attachment_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setFee(long j) {
            this.fee_ = j;
        }

        /* access modifiers changed from: private */
        public void setFeeAsset(String str) {
            str.getClass();
            this.feeAsset_ = str;
        }

        /* access modifiers changed from: private */
        public void setFeeAssetBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.feeAsset_ = byteString.toStringUtf8();
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
            switch (C97751.f46587xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TransferMessage();
                case 2:
                    return new Builder((C97751) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0002\u0002Ȉ\u0003\u0002\u0004Ȉ\u0005Ȉ\u0006\n", new Object[]{"amount_", "asset_", "fee_", "feeAsset_", "to_", "attachment_"});
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

        public String getAsset() {
            return this.asset_;
        }

        public ByteString getAssetBytes() {
            return ByteString.copyFromUtf8(this.asset_);
        }

        public ByteString getAttachment() {
            return this.attachment_;
        }

        public long getFee() {
            return this.fee_;
        }

        public String getFeeAsset() {
            return this.feeAsset_;
        }

        public ByteString getFeeAssetBytes() {
            return ByteString.copyFromUtf8(this.feeAsset_);
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

        String getAsset();

        ByteString getAssetBytes();

        ByteString getAttachment();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        long getFee();

        String getFeeAsset();

        ByteString getFeeAssetBytes();

        String getTo();

        ByteString getToBytes();

        /* synthetic */ boolean isInitialized();
    }

    private Waves() {
    }

    public static void registerAllExtensions(C4987l lVar) {
    }
}
