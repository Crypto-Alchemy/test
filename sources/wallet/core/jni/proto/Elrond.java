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

public final class Elrond {

    /* renamed from: wallet.core.jni.proto.Elrond$1 */
    public static /* synthetic */ class C97401 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f46552xa1df5c61;

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
                f46552xa1df5c61 = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f46552xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f46552xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f46552xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f46552xa1df5c61     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f46552xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f46552xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wallet.core.jni.proto.Elrond.C97401.<clinit>():void");
        }
    }

    public static final class Accounts extends GeneratedMessageLite<Accounts, Builder> implements AccountsOrBuilder {
        /* access modifiers changed from: private */
        public static final Accounts DEFAULT_INSTANCE;
        private static volatile im4<Accounts> PARSER = null;
        public static final int RECEIVER_FIELD_NUMBER = 4;
        public static final int RECEIVER_USERNAME_FIELD_NUMBER = 5;
        public static final int SENDER_FIELD_NUMBER = 2;
        public static final int SENDER_NONCE_FIELD_NUMBER = 1;
        public static final int SENDER_USERNAME_FIELD_NUMBER = 3;
        private String receiverUsername_ = "";
        private String receiver_ = "";
        private long senderNonce_;
        private String senderUsername_ = "";
        private String sender_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<Accounts, Builder> implements AccountsOrBuilder {
            public /* synthetic */ Builder(C97401 r1) {
                this();
            }

            public Builder clearReceiver() {
                copyOnWrite();
                ((Accounts) this.instance).clearReceiver();
                return this;
            }

            public Builder clearReceiverUsername() {
                copyOnWrite();
                ((Accounts) this.instance).clearReceiverUsername();
                return this;
            }

            public Builder clearSender() {
                copyOnWrite();
                ((Accounts) this.instance).clearSender();
                return this;
            }

            public Builder clearSenderNonce() {
                copyOnWrite();
                ((Accounts) this.instance).clearSenderNonce();
                return this;
            }

            public Builder clearSenderUsername() {
                copyOnWrite();
                ((Accounts) this.instance).clearSenderUsername();
                return this;
            }

            public String getReceiver() {
                return ((Accounts) this.instance).getReceiver();
            }

            public ByteString getReceiverBytes() {
                return ((Accounts) this.instance).getReceiverBytes();
            }

            public String getReceiverUsername() {
                return ((Accounts) this.instance).getReceiverUsername();
            }

            public ByteString getReceiverUsernameBytes() {
                return ((Accounts) this.instance).getReceiverUsernameBytes();
            }

            public String getSender() {
                return ((Accounts) this.instance).getSender();
            }

            public ByteString getSenderBytes() {
                return ((Accounts) this.instance).getSenderBytes();
            }

            public long getSenderNonce() {
                return ((Accounts) this.instance).getSenderNonce();
            }

            public String getSenderUsername() {
                return ((Accounts) this.instance).getSenderUsername();
            }

            public ByteString getSenderUsernameBytes() {
                return ((Accounts) this.instance).getSenderUsernameBytes();
            }

            public Builder setReceiver(String str) {
                copyOnWrite();
                ((Accounts) this.instance).setReceiver(str);
                return this;
            }

            public Builder setReceiverBytes(ByteString byteString) {
                copyOnWrite();
                ((Accounts) this.instance).setReceiverBytes(byteString);
                return this;
            }

            public Builder setReceiverUsername(String str) {
                copyOnWrite();
                ((Accounts) this.instance).setReceiverUsername(str);
                return this;
            }

            public Builder setReceiverUsernameBytes(ByteString byteString) {
                copyOnWrite();
                ((Accounts) this.instance).setReceiverUsernameBytes(byteString);
                return this;
            }

            public Builder setSender(String str) {
                copyOnWrite();
                ((Accounts) this.instance).setSender(str);
                return this;
            }

            public Builder setSenderBytes(ByteString byteString) {
                copyOnWrite();
                ((Accounts) this.instance).setSenderBytes(byteString);
                return this;
            }

            public Builder setSenderNonce(long j) {
                copyOnWrite();
                ((Accounts) this.instance).setSenderNonce(j);
                return this;
            }

            public Builder setSenderUsername(String str) {
                copyOnWrite();
                ((Accounts) this.instance).setSenderUsername(str);
                return this;
            }

            public Builder setSenderUsernameBytes(ByteString byteString) {
                copyOnWrite();
                ((Accounts) this.instance).setSenderUsernameBytes(byteString);
                return this;
            }

            private Builder() {
                super(Accounts.DEFAULT_INSTANCE);
            }
        }

        static {
            Accounts accounts = new Accounts();
            DEFAULT_INSTANCE = accounts;
            GeneratedMessageLite.registerDefaultInstance(Accounts.class, accounts);
        }

        private Accounts() {
        }

        /* access modifiers changed from: private */
        public void clearReceiver() {
            this.receiver_ = getDefaultInstance().getReceiver();
        }

        /* access modifiers changed from: private */
        public void clearReceiverUsername() {
            this.receiverUsername_ = getDefaultInstance().getReceiverUsername();
        }

        /* access modifiers changed from: private */
        public void clearSender() {
            this.sender_ = getDefaultInstance().getSender();
        }

        /* access modifiers changed from: private */
        public void clearSenderNonce() {
            this.senderNonce_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSenderUsername() {
            this.senderUsername_ = getDefaultInstance().getSenderUsername();
        }

        public static Accounts getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Accounts parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Accounts) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Accounts parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Accounts) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<Accounts> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setReceiver(String str) {
            str.getClass();
            this.receiver_ = str;
        }

        /* access modifiers changed from: private */
        public void setReceiverBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.receiver_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setReceiverUsername(String str) {
            str.getClass();
            this.receiverUsername_ = str;
        }

        /* access modifiers changed from: private */
        public void setReceiverUsernameBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.receiverUsername_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setSender(String str) {
            str.getClass();
            this.sender_ = str;
        }

        /* access modifiers changed from: private */
        public void setSenderBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.sender_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setSenderNonce(long j) {
            this.senderNonce_ = j;
        }

        /* access modifiers changed from: private */
        public void setSenderUsername(String str) {
            str.getClass();
            this.senderUsername_ = str;
        }

        /* access modifiers changed from: private */
        public void setSenderUsernameBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.senderUsername_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97401.f46552xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Accounts();
                case 2:
                    return new Builder((C97401) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0003\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"senderNonce_", "sender_", "senderUsername_", "receiver_", "receiverUsername_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<Accounts> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (Accounts.class) {
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

        public String getReceiver() {
            return this.receiver_;
        }

        public ByteString getReceiverBytes() {
            return ByteString.copyFromUtf8(this.receiver_);
        }

        public String getReceiverUsername() {
            return this.receiverUsername_;
        }

        public ByteString getReceiverUsernameBytes() {
            return ByteString.copyFromUtf8(this.receiverUsername_);
        }

        public String getSender() {
            return this.sender_;
        }

        public ByteString getSenderBytes() {
            return ByteString.copyFromUtf8(this.sender_);
        }

        public long getSenderNonce() {
            return this.senderNonce_;
        }

        public String getSenderUsername() {
            return this.senderUsername_;
        }

        public ByteString getSenderUsernameBytes() {
            return ByteString.copyFromUtf8(this.senderUsername_);
        }

        public static Builder newBuilder(Accounts accounts) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(accounts);
        }

        public static Accounts parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Accounts) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Accounts parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (Accounts) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static Accounts parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Accounts) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Accounts parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (Accounts) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static Accounts parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Accounts) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Accounts parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (Accounts) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static Accounts parseFrom(InputStream inputStream) throws IOException {
            return (Accounts) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Accounts parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Accounts) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Accounts parseFrom(C4969g gVar) throws IOException {
            return (Accounts) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static Accounts parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (Accounts) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface AccountsOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getReceiver();

        ByteString getReceiverBytes();

        String getReceiverUsername();

        ByteString getReceiverUsernameBytes();

        String getSender();

        ByteString getSenderBytes();

        long getSenderNonce();

        String getSenderUsername();

        ByteString getSenderUsernameBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class EGLDTransfer extends GeneratedMessageLite<EGLDTransfer, Builder> implements EGLDTransferOrBuilder {
        public static final int ACCOUNTS_FIELD_NUMBER = 1;
        public static final int AMOUNT_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final EGLDTransfer DEFAULT_INSTANCE;
        private static volatile im4<EGLDTransfer> PARSER;
        private Accounts accounts_;
        private String amount_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<EGLDTransfer, Builder> implements EGLDTransferOrBuilder {
            public /* synthetic */ Builder(C97401 r1) {
                this();
            }

            public Builder clearAccounts() {
                copyOnWrite();
                ((EGLDTransfer) this.instance).clearAccounts();
                return this;
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((EGLDTransfer) this.instance).clearAmount();
                return this;
            }

            public Accounts getAccounts() {
                return ((EGLDTransfer) this.instance).getAccounts();
            }

            public String getAmount() {
                return ((EGLDTransfer) this.instance).getAmount();
            }

            public ByteString getAmountBytes() {
                return ((EGLDTransfer) this.instance).getAmountBytes();
            }

            public boolean hasAccounts() {
                return ((EGLDTransfer) this.instance).hasAccounts();
            }

            public Builder mergeAccounts(Accounts accounts) {
                copyOnWrite();
                ((EGLDTransfer) this.instance).mergeAccounts(accounts);
                return this;
            }

            public Builder setAccounts(Accounts accounts) {
                copyOnWrite();
                ((EGLDTransfer) this.instance).setAccounts(accounts);
                return this;
            }

            public Builder setAmount(String str) {
                copyOnWrite();
                ((EGLDTransfer) this.instance).setAmount(str);
                return this;
            }

            public Builder setAmountBytes(ByteString byteString) {
                copyOnWrite();
                ((EGLDTransfer) this.instance).setAmountBytes(byteString);
                return this;
            }

            private Builder() {
                super(EGLDTransfer.DEFAULT_INSTANCE);
            }

            public Builder setAccounts(Accounts.Builder builder) {
                copyOnWrite();
                ((EGLDTransfer) this.instance).setAccounts((Accounts) builder.build());
                return this;
            }
        }

        static {
            EGLDTransfer eGLDTransfer = new EGLDTransfer();
            DEFAULT_INSTANCE = eGLDTransfer;
            GeneratedMessageLite.registerDefaultInstance(EGLDTransfer.class, eGLDTransfer);
        }

        private EGLDTransfer() {
        }

        /* access modifiers changed from: private */
        public void clearAccounts() {
            this.accounts_ = null;
        }

        /* access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = getDefaultInstance().getAmount();
        }

        public static EGLDTransfer getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeAccounts(Accounts accounts) {
            accounts.getClass();
            Accounts accounts2 = this.accounts_;
            if (accounts2 == null || accounts2 == Accounts.getDefaultInstance()) {
                this.accounts_ = accounts;
            } else {
                this.accounts_ = (Accounts) ((Accounts.Builder) Accounts.newBuilder(this.accounts_).mergeFrom(accounts)).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static EGLDTransfer parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (EGLDTransfer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EGLDTransfer parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (EGLDTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<EGLDTransfer> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAccounts(Accounts accounts) {
            accounts.getClass();
            this.accounts_ = accounts;
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

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97401.f46552xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new EGLDTransfer();
                case 2:
                    return new Builder((C97401) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002Ȉ", new Object[]{"accounts_", "amount_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<EGLDTransfer> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (EGLDTransfer.class) {
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

        public Accounts getAccounts() {
            Accounts accounts = this.accounts_;
            if (accounts == null) {
                return Accounts.getDefaultInstance();
            }
            return accounts;
        }

        public String getAmount() {
            return this.amount_;
        }

        public ByteString getAmountBytes() {
            return ByteString.copyFromUtf8(this.amount_);
        }

        public boolean hasAccounts() {
            if (this.accounts_ != null) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(EGLDTransfer eGLDTransfer) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(eGLDTransfer);
        }

        public static EGLDTransfer parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (EGLDTransfer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static EGLDTransfer parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (EGLDTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static EGLDTransfer parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (EGLDTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static EGLDTransfer parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (EGLDTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static EGLDTransfer parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (EGLDTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EGLDTransfer parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (EGLDTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static EGLDTransfer parseFrom(InputStream inputStream) throws IOException {
            return (EGLDTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EGLDTransfer parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (EGLDTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static EGLDTransfer parseFrom(C4969g gVar) throws IOException {
            return (EGLDTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static EGLDTransfer parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (EGLDTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface EGLDTransferOrBuilder extends qu3 {
        Accounts getAccounts();

        String getAmount();

        ByteString getAmountBytes();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        boolean hasAccounts();

        /* synthetic */ boolean isInitialized();
    }

    public static final class ESDTNFTTransfer extends GeneratedMessageLite<ESDTNFTTransfer, Builder> implements ESDTNFTTransferOrBuilder {
        public static final int ACCOUNTS_FIELD_NUMBER = 1;
        public static final int AMOUNT_FIELD_NUMBER = 4;
        /* access modifiers changed from: private */
        public static final ESDTNFTTransfer DEFAULT_INSTANCE;
        private static volatile im4<ESDTNFTTransfer> PARSER = null;
        public static final int TOKEN_COLLECTION_FIELD_NUMBER = 2;
        public static final int TOKEN_NONCE_FIELD_NUMBER = 3;
        private Accounts accounts_;
        private String amount_ = "";
        private String tokenCollection_ = "";
        private long tokenNonce_;

        public static final class Builder extends GeneratedMessageLite.C4930a<ESDTNFTTransfer, Builder> implements ESDTNFTTransferOrBuilder {
            public /* synthetic */ Builder(C97401 r1) {
                this();
            }

            public Builder clearAccounts() {
                copyOnWrite();
                ((ESDTNFTTransfer) this.instance).clearAccounts();
                return this;
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((ESDTNFTTransfer) this.instance).clearAmount();
                return this;
            }

            public Builder clearTokenCollection() {
                copyOnWrite();
                ((ESDTNFTTransfer) this.instance).clearTokenCollection();
                return this;
            }

            public Builder clearTokenNonce() {
                copyOnWrite();
                ((ESDTNFTTransfer) this.instance).clearTokenNonce();
                return this;
            }

            public Accounts getAccounts() {
                return ((ESDTNFTTransfer) this.instance).getAccounts();
            }

            public String getAmount() {
                return ((ESDTNFTTransfer) this.instance).getAmount();
            }

            public ByteString getAmountBytes() {
                return ((ESDTNFTTransfer) this.instance).getAmountBytes();
            }

            public String getTokenCollection() {
                return ((ESDTNFTTransfer) this.instance).getTokenCollection();
            }

            public ByteString getTokenCollectionBytes() {
                return ((ESDTNFTTransfer) this.instance).getTokenCollectionBytes();
            }

            public long getTokenNonce() {
                return ((ESDTNFTTransfer) this.instance).getTokenNonce();
            }

            public boolean hasAccounts() {
                return ((ESDTNFTTransfer) this.instance).hasAccounts();
            }

            public Builder mergeAccounts(Accounts accounts) {
                copyOnWrite();
                ((ESDTNFTTransfer) this.instance).mergeAccounts(accounts);
                return this;
            }

            public Builder setAccounts(Accounts accounts) {
                copyOnWrite();
                ((ESDTNFTTransfer) this.instance).setAccounts(accounts);
                return this;
            }

            public Builder setAmount(String str) {
                copyOnWrite();
                ((ESDTNFTTransfer) this.instance).setAmount(str);
                return this;
            }

            public Builder setAmountBytes(ByteString byteString) {
                copyOnWrite();
                ((ESDTNFTTransfer) this.instance).setAmountBytes(byteString);
                return this;
            }

            public Builder setTokenCollection(String str) {
                copyOnWrite();
                ((ESDTNFTTransfer) this.instance).setTokenCollection(str);
                return this;
            }

            public Builder setTokenCollectionBytes(ByteString byteString) {
                copyOnWrite();
                ((ESDTNFTTransfer) this.instance).setTokenCollectionBytes(byteString);
                return this;
            }

            public Builder setTokenNonce(long j) {
                copyOnWrite();
                ((ESDTNFTTransfer) this.instance).setTokenNonce(j);
                return this;
            }

            private Builder() {
                super(ESDTNFTTransfer.DEFAULT_INSTANCE);
            }

            public Builder setAccounts(Accounts.Builder builder) {
                copyOnWrite();
                ((ESDTNFTTransfer) this.instance).setAccounts((Accounts) builder.build());
                return this;
            }
        }

        static {
            ESDTNFTTransfer eSDTNFTTransfer = new ESDTNFTTransfer();
            DEFAULT_INSTANCE = eSDTNFTTransfer;
            GeneratedMessageLite.registerDefaultInstance(ESDTNFTTransfer.class, eSDTNFTTransfer);
        }

        private ESDTNFTTransfer() {
        }

        /* access modifiers changed from: private */
        public void clearAccounts() {
            this.accounts_ = null;
        }

        /* access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = getDefaultInstance().getAmount();
        }

        /* access modifiers changed from: private */
        public void clearTokenCollection() {
            this.tokenCollection_ = getDefaultInstance().getTokenCollection();
        }

        /* access modifiers changed from: private */
        public void clearTokenNonce() {
            this.tokenNonce_ = 0;
        }

        public static ESDTNFTTransfer getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeAccounts(Accounts accounts) {
            accounts.getClass();
            Accounts accounts2 = this.accounts_;
            if (accounts2 == null || accounts2 == Accounts.getDefaultInstance()) {
                this.accounts_ = accounts;
            } else {
                this.accounts_ = (Accounts) ((Accounts.Builder) Accounts.newBuilder(this.accounts_).mergeFrom(accounts)).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ESDTNFTTransfer parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ESDTNFTTransfer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ESDTNFTTransfer parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ESDTNFTTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<ESDTNFTTransfer> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAccounts(Accounts accounts) {
            accounts.getClass();
            this.accounts_ = accounts;
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
        public void setTokenCollection(String str) {
            str.getClass();
            this.tokenCollection_ = str;
        }

        /* access modifiers changed from: private */
        public void setTokenCollectionBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.tokenCollection_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setTokenNonce(long j) {
            this.tokenNonce_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97401.f46552xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new ESDTNFTTransfer();
                case 2:
                    return new Builder((C97401) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003\u0003\u0004Ȉ", new Object[]{"accounts_", "tokenCollection_", "tokenNonce_", "amount_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<ESDTNFTTransfer> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (ESDTNFTTransfer.class) {
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

        public Accounts getAccounts() {
            Accounts accounts = this.accounts_;
            if (accounts == null) {
                return Accounts.getDefaultInstance();
            }
            return accounts;
        }

        public String getAmount() {
            return this.amount_;
        }

        public ByteString getAmountBytes() {
            return ByteString.copyFromUtf8(this.amount_);
        }

        public String getTokenCollection() {
            return this.tokenCollection_;
        }

        public ByteString getTokenCollectionBytes() {
            return ByteString.copyFromUtf8(this.tokenCollection_);
        }

        public long getTokenNonce() {
            return this.tokenNonce_;
        }

        public boolean hasAccounts() {
            if (this.accounts_ != null) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(ESDTNFTTransfer eSDTNFTTransfer) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(eSDTNFTTransfer);
        }

        public static ESDTNFTTransfer parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (ESDTNFTTransfer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static ESDTNFTTransfer parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (ESDTNFTTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static ESDTNFTTransfer parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ESDTNFTTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ESDTNFTTransfer parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (ESDTNFTTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static ESDTNFTTransfer parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ESDTNFTTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ESDTNFTTransfer parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (ESDTNFTTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static ESDTNFTTransfer parseFrom(InputStream inputStream) throws IOException {
            return (ESDTNFTTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ESDTNFTTransfer parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (ESDTNFTTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static ESDTNFTTransfer parseFrom(C4969g gVar) throws IOException {
            return (ESDTNFTTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static ESDTNFTTransfer parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (ESDTNFTTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface ESDTNFTTransferOrBuilder extends qu3 {
        Accounts getAccounts();

        String getAmount();

        ByteString getAmountBytes();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getTokenCollection();

        ByteString getTokenCollectionBytes();

        long getTokenNonce();

        boolean hasAccounts();

        /* synthetic */ boolean isInitialized();
    }

    public static final class ESDTTransfer extends GeneratedMessageLite<ESDTTransfer, Builder> implements ESDTTransferOrBuilder {
        public static final int ACCOUNTS_FIELD_NUMBER = 1;
        public static final int AMOUNT_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final ESDTTransfer DEFAULT_INSTANCE;
        private static volatile im4<ESDTTransfer> PARSER = null;
        public static final int TOKEN_IDENTIFIER_FIELD_NUMBER = 2;
        private Accounts accounts_;
        private String amount_ = "";
        private String tokenIdentifier_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<ESDTTransfer, Builder> implements ESDTTransferOrBuilder {
            public /* synthetic */ Builder(C97401 r1) {
                this();
            }

            public Builder clearAccounts() {
                copyOnWrite();
                ((ESDTTransfer) this.instance).clearAccounts();
                return this;
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((ESDTTransfer) this.instance).clearAmount();
                return this;
            }

            public Builder clearTokenIdentifier() {
                copyOnWrite();
                ((ESDTTransfer) this.instance).clearTokenIdentifier();
                return this;
            }

            public Accounts getAccounts() {
                return ((ESDTTransfer) this.instance).getAccounts();
            }

            public String getAmount() {
                return ((ESDTTransfer) this.instance).getAmount();
            }

            public ByteString getAmountBytes() {
                return ((ESDTTransfer) this.instance).getAmountBytes();
            }

            public String getTokenIdentifier() {
                return ((ESDTTransfer) this.instance).getTokenIdentifier();
            }

            public ByteString getTokenIdentifierBytes() {
                return ((ESDTTransfer) this.instance).getTokenIdentifierBytes();
            }

            public boolean hasAccounts() {
                return ((ESDTTransfer) this.instance).hasAccounts();
            }

            public Builder mergeAccounts(Accounts accounts) {
                copyOnWrite();
                ((ESDTTransfer) this.instance).mergeAccounts(accounts);
                return this;
            }

            public Builder setAccounts(Accounts accounts) {
                copyOnWrite();
                ((ESDTTransfer) this.instance).setAccounts(accounts);
                return this;
            }

            public Builder setAmount(String str) {
                copyOnWrite();
                ((ESDTTransfer) this.instance).setAmount(str);
                return this;
            }

            public Builder setAmountBytes(ByteString byteString) {
                copyOnWrite();
                ((ESDTTransfer) this.instance).setAmountBytes(byteString);
                return this;
            }

            public Builder setTokenIdentifier(String str) {
                copyOnWrite();
                ((ESDTTransfer) this.instance).setTokenIdentifier(str);
                return this;
            }

            public Builder setTokenIdentifierBytes(ByteString byteString) {
                copyOnWrite();
                ((ESDTTransfer) this.instance).setTokenIdentifierBytes(byteString);
                return this;
            }

            private Builder() {
                super(ESDTTransfer.DEFAULT_INSTANCE);
            }

            public Builder setAccounts(Accounts.Builder builder) {
                copyOnWrite();
                ((ESDTTransfer) this.instance).setAccounts((Accounts) builder.build());
                return this;
            }
        }

        static {
            ESDTTransfer eSDTTransfer = new ESDTTransfer();
            DEFAULT_INSTANCE = eSDTTransfer;
            GeneratedMessageLite.registerDefaultInstance(ESDTTransfer.class, eSDTTransfer);
        }

        private ESDTTransfer() {
        }

        /* access modifiers changed from: private */
        public void clearAccounts() {
            this.accounts_ = null;
        }

        /* access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = getDefaultInstance().getAmount();
        }

        /* access modifiers changed from: private */
        public void clearTokenIdentifier() {
            this.tokenIdentifier_ = getDefaultInstance().getTokenIdentifier();
        }

        public static ESDTTransfer getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeAccounts(Accounts accounts) {
            accounts.getClass();
            Accounts accounts2 = this.accounts_;
            if (accounts2 == null || accounts2 == Accounts.getDefaultInstance()) {
                this.accounts_ = accounts;
            } else {
                this.accounts_ = (Accounts) ((Accounts.Builder) Accounts.newBuilder(this.accounts_).mergeFrom(accounts)).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ESDTTransfer parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ESDTTransfer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ESDTTransfer parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ESDTTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<ESDTTransfer> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAccounts(Accounts accounts) {
            accounts.getClass();
            this.accounts_ = accounts;
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
        public void setTokenIdentifier(String str) {
            str.getClass();
            this.tokenIdentifier_ = str;
        }

        /* access modifiers changed from: private */
        public void setTokenIdentifierBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.tokenIdentifier_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97401.f46552xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new ESDTTransfer();
                case 2:
                    return new Builder((C97401) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003Ȉ", new Object[]{"accounts_", "tokenIdentifier_", "amount_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<ESDTTransfer> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (ESDTTransfer.class) {
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

        public Accounts getAccounts() {
            Accounts accounts = this.accounts_;
            if (accounts == null) {
                return Accounts.getDefaultInstance();
            }
            return accounts;
        }

        public String getAmount() {
            return this.amount_;
        }

        public ByteString getAmountBytes() {
            return ByteString.copyFromUtf8(this.amount_);
        }

        public String getTokenIdentifier() {
            return this.tokenIdentifier_;
        }

        public ByteString getTokenIdentifierBytes() {
            return ByteString.copyFromUtf8(this.tokenIdentifier_);
        }

        public boolean hasAccounts() {
            if (this.accounts_ != null) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(ESDTTransfer eSDTTransfer) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(eSDTTransfer);
        }

        public static ESDTTransfer parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (ESDTTransfer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static ESDTTransfer parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (ESDTTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static ESDTTransfer parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ESDTTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ESDTTransfer parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (ESDTTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static ESDTTransfer parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ESDTTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ESDTTransfer parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (ESDTTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static ESDTTransfer parseFrom(InputStream inputStream) throws IOException {
            return (ESDTTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ESDTTransfer parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (ESDTTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static ESDTTransfer parseFrom(C4969g gVar) throws IOException {
            return (ESDTTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static ESDTTransfer parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (ESDTTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface ESDTTransferOrBuilder extends qu3 {
        Accounts getAccounts();

        String getAmount();

        ByteString getAmountBytes();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getTokenIdentifier();

        ByteString getTokenIdentifierBytes();

        boolean hasAccounts();

        /* synthetic */ boolean isInitialized();
    }

    public static final class GenericAction extends GeneratedMessageLite<GenericAction, Builder> implements GenericActionOrBuilder {
        public static final int ACCOUNTS_FIELD_NUMBER = 1;
        public static final int DATA_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final GenericAction DEFAULT_INSTANCE;
        public static final int OPTIONS_FIELD_NUMBER = 5;
        private static volatile im4<GenericAction> PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 2;
        public static final int VERSION_FIELD_NUMBER = 4;
        private Accounts accounts_;
        private String data_ = "";
        private int options_;
        private String value_ = "";
        private int version_;

        public static final class Builder extends GeneratedMessageLite.C4930a<GenericAction, Builder> implements GenericActionOrBuilder {
            public /* synthetic */ Builder(C97401 r1) {
                this();
            }

            public Builder clearAccounts() {
                copyOnWrite();
                ((GenericAction) this.instance).clearAccounts();
                return this;
            }

            public Builder clearData() {
                copyOnWrite();
                ((GenericAction) this.instance).clearData();
                return this;
            }

            public Builder clearOptions() {
                copyOnWrite();
                ((GenericAction) this.instance).clearOptions();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((GenericAction) this.instance).clearValue();
                return this;
            }

            public Builder clearVersion() {
                copyOnWrite();
                ((GenericAction) this.instance).clearVersion();
                return this;
            }

            public Accounts getAccounts() {
                return ((GenericAction) this.instance).getAccounts();
            }

            public String getData() {
                return ((GenericAction) this.instance).getData();
            }

            public ByteString getDataBytes() {
                return ((GenericAction) this.instance).getDataBytes();
            }

            public int getOptions() {
                return ((GenericAction) this.instance).getOptions();
            }

            public String getValue() {
                return ((GenericAction) this.instance).getValue();
            }

            public ByteString getValueBytes() {
                return ((GenericAction) this.instance).getValueBytes();
            }

            public int getVersion() {
                return ((GenericAction) this.instance).getVersion();
            }

            public boolean hasAccounts() {
                return ((GenericAction) this.instance).hasAccounts();
            }

            public Builder mergeAccounts(Accounts accounts) {
                copyOnWrite();
                ((GenericAction) this.instance).mergeAccounts(accounts);
                return this;
            }

            public Builder setAccounts(Accounts accounts) {
                copyOnWrite();
                ((GenericAction) this.instance).setAccounts(accounts);
                return this;
            }

            public Builder setData(String str) {
                copyOnWrite();
                ((GenericAction) this.instance).setData(str);
                return this;
            }

            public Builder setDataBytes(ByteString byteString) {
                copyOnWrite();
                ((GenericAction) this.instance).setDataBytes(byteString);
                return this;
            }

            public Builder setOptions(int i) {
                copyOnWrite();
                ((GenericAction) this.instance).setOptions(i);
                return this;
            }

            public Builder setValue(String str) {
                copyOnWrite();
                ((GenericAction) this.instance).setValue(str);
                return this;
            }

            public Builder setValueBytes(ByteString byteString) {
                copyOnWrite();
                ((GenericAction) this.instance).setValueBytes(byteString);
                return this;
            }

            public Builder setVersion(int i) {
                copyOnWrite();
                ((GenericAction) this.instance).setVersion(i);
                return this;
            }

            private Builder() {
                super(GenericAction.DEFAULT_INSTANCE);
            }

            public Builder setAccounts(Accounts.Builder builder) {
                copyOnWrite();
                ((GenericAction) this.instance).setAccounts((Accounts) builder.build());
                return this;
            }
        }

        static {
            GenericAction genericAction = new GenericAction();
            DEFAULT_INSTANCE = genericAction;
            GeneratedMessageLite.registerDefaultInstance(GenericAction.class, genericAction);
        }

        private GenericAction() {
        }

        /* access modifiers changed from: private */
        public void clearAccounts() {
            this.accounts_ = null;
        }

        /* access modifiers changed from: private */
        public void clearData() {
            this.data_ = getDefaultInstance().getData();
        }

        /* access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearValue() {
            this.value_ = getDefaultInstance().getValue();
        }

        /* access modifiers changed from: private */
        public void clearVersion() {
            this.version_ = 0;
        }

        public static GenericAction getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeAccounts(Accounts accounts) {
            accounts.getClass();
            Accounts accounts2 = this.accounts_;
            if (accounts2 == null || accounts2 == Accounts.getDefaultInstance()) {
                this.accounts_ = accounts;
            } else {
                this.accounts_ = (Accounts) ((Accounts.Builder) Accounts.newBuilder(this.accounts_).mergeFrom(accounts)).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static GenericAction parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GenericAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GenericAction parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (GenericAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<GenericAction> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAccounts(Accounts accounts) {
            accounts.getClass();
            this.accounts_ = accounts;
        }

        /* access modifiers changed from: private */
        public void setData(String str) {
            str.getClass();
            this.data_ = str;
        }

        /* access modifiers changed from: private */
        public void setDataBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.data_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setOptions(int i) {
            this.options_ = i;
        }

        /* access modifiers changed from: private */
        public void setValue(String str) {
            str.getClass();
            this.value_ = str;
        }

        /* access modifiers changed from: private */
        public void setValueBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.value_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setVersion(int i) {
            this.version_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97401.f46552xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new GenericAction();
                case 2:
                    return new Builder((C97401) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003Ȉ\u0004\u000b\u0005\u000b", new Object[]{"accounts_", "value_", "data_", "version_", "options_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<GenericAction> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (GenericAction.class) {
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

        public Accounts getAccounts() {
            Accounts accounts = this.accounts_;
            if (accounts == null) {
                return Accounts.getDefaultInstance();
            }
            return accounts;
        }

        public String getData() {
            return this.data_;
        }

        public ByteString getDataBytes() {
            return ByteString.copyFromUtf8(this.data_);
        }

        public int getOptions() {
            return this.options_;
        }

        public String getValue() {
            return this.value_;
        }

        public ByteString getValueBytes() {
            return ByteString.copyFromUtf8(this.value_);
        }

        public int getVersion() {
            return this.version_;
        }

        public boolean hasAccounts() {
            if (this.accounts_ != null) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(GenericAction genericAction) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(genericAction);
        }

        public static GenericAction parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (GenericAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static GenericAction parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (GenericAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static GenericAction parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GenericAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static GenericAction parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (GenericAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static GenericAction parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GenericAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GenericAction parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (GenericAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static GenericAction parseFrom(InputStream inputStream) throws IOException {
            return (GenericAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GenericAction parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (GenericAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static GenericAction parseFrom(C4969g gVar) throws IOException {
            return (GenericAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static GenericAction parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (GenericAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface GenericActionOrBuilder extends qu3 {
        Accounts getAccounts();

        String getData();

        ByteString getDataBytes();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        int getOptions();

        String getValue();

        ByteString getValueBytes();

        int getVersion();

        boolean hasAccounts();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SigningInput extends GeneratedMessageLite<SigningInput, Builder> implements SigningInputOrBuilder {
        public static final int CHAIN_ID_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final SigningInput DEFAULT_INSTANCE;
        public static final int EGLD_TRANSFER_FIELD_NUMBER = 6;
        public static final int ESDTNFT_TRANSFER_FIELD_NUMBER = 8;
        public static final int ESDT_TRANSFER_FIELD_NUMBER = 7;
        public static final int GAS_LIMIT_FIELD_NUMBER = 4;
        public static final int GAS_PRICE_FIELD_NUMBER = 3;
        public static final int GENERIC_ACTION_FIELD_NUMBER = 5;
        private static volatile im4<SigningInput> PARSER = null;
        public static final int PRIVATE_KEY_FIELD_NUMBER = 1;
        private String chainId_ = "";
        private long gasLimit_;
        private long gasPrice_;
        private int messageOneofCase_ = 0;
        private Object messageOneof_;
        private ByteString privateKey_ = ByteString.EMPTY;

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningInput, Builder> implements SigningInputOrBuilder {
            public /* synthetic */ Builder(C97401 r1) {
                this();
            }

            public Builder clearChainId() {
                copyOnWrite();
                ((SigningInput) this.instance).clearChainId();
                return this;
            }

            public Builder clearEgldTransfer() {
                copyOnWrite();
                ((SigningInput) this.instance).clearEgldTransfer();
                return this;
            }

            public Builder clearEsdtTransfer() {
                copyOnWrite();
                ((SigningInput) this.instance).clearEsdtTransfer();
                return this;
            }

            public Builder clearEsdtnftTransfer() {
                copyOnWrite();
                ((SigningInput) this.instance).clearEsdtnftTransfer();
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

            public Builder clearGenericAction() {
                copyOnWrite();
                ((SigningInput) this.instance).clearGenericAction();
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

            public String getChainId() {
                return ((SigningInput) this.instance).getChainId();
            }

            public ByteString getChainIdBytes() {
                return ((SigningInput) this.instance).getChainIdBytes();
            }

            public EGLDTransfer getEgldTransfer() {
                return ((SigningInput) this.instance).getEgldTransfer();
            }

            public ESDTTransfer getEsdtTransfer() {
                return ((SigningInput) this.instance).getEsdtTransfer();
            }

            public ESDTNFTTransfer getEsdtnftTransfer() {
                return ((SigningInput) this.instance).getEsdtnftTransfer();
            }

            public long getGasLimit() {
                return ((SigningInput) this.instance).getGasLimit();
            }

            public long getGasPrice() {
                return ((SigningInput) this.instance).getGasPrice();
            }

            public GenericAction getGenericAction() {
                return ((SigningInput) this.instance).getGenericAction();
            }

            public MessageOneofCase getMessageOneofCase() {
                return ((SigningInput) this.instance).getMessageOneofCase();
            }

            public ByteString getPrivateKey() {
                return ((SigningInput) this.instance).getPrivateKey();
            }

            public boolean hasEgldTransfer() {
                return ((SigningInput) this.instance).hasEgldTransfer();
            }

            public boolean hasEsdtTransfer() {
                return ((SigningInput) this.instance).hasEsdtTransfer();
            }

            public boolean hasEsdtnftTransfer() {
                return ((SigningInput) this.instance).hasEsdtnftTransfer();
            }

            public boolean hasGenericAction() {
                return ((SigningInput) this.instance).hasGenericAction();
            }

            public Builder mergeEgldTransfer(EGLDTransfer eGLDTransfer) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeEgldTransfer(eGLDTransfer);
                return this;
            }

            public Builder mergeEsdtTransfer(ESDTTransfer eSDTTransfer) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeEsdtTransfer(eSDTTransfer);
                return this;
            }

            public Builder mergeEsdtnftTransfer(ESDTNFTTransfer eSDTNFTTransfer) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeEsdtnftTransfer(eSDTNFTTransfer);
                return this;
            }

            public Builder mergeGenericAction(GenericAction genericAction) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeGenericAction(genericAction);
                return this;
            }

            public Builder setChainId(String str) {
                copyOnWrite();
                ((SigningInput) this.instance).setChainId(str);
                return this;
            }

            public Builder setChainIdBytes(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setChainIdBytes(byteString);
                return this;
            }

            public Builder setEgldTransfer(EGLDTransfer eGLDTransfer) {
                copyOnWrite();
                ((SigningInput) this.instance).setEgldTransfer(eGLDTransfer);
                return this;
            }

            public Builder setEsdtTransfer(ESDTTransfer eSDTTransfer) {
                copyOnWrite();
                ((SigningInput) this.instance).setEsdtTransfer(eSDTTransfer);
                return this;
            }

            public Builder setEsdtnftTransfer(ESDTNFTTransfer eSDTNFTTransfer) {
                copyOnWrite();
                ((SigningInput) this.instance).setEsdtnftTransfer(eSDTNFTTransfer);
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

            public Builder setGenericAction(GenericAction genericAction) {
                copyOnWrite();
                ((SigningInput) this.instance).setGenericAction(genericAction);
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

            public Builder setEgldTransfer(EGLDTransfer.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setEgldTransfer((EGLDTransfer) builder.build());
                return this;
            }

            public Builder setEsdtTransfer(ESDTTransfer.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setEsdtTransfer((ESDTTransfer) builder.build());
                return this;
            }

            public Builder setEsdtnftTransfer(ESDTNFTTransfer.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setEsdtnftTransfer((ESDTNFTTransfer) builder.build());
                return this;
            }

            public Builder setGenericAction(GenericAction.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setGenericAction((GenericAction) builder.build());
                return this;
            }
        }

        public enum MessageOneofCase {
            GENERIC_ACTION(5),
            EGLD_TRANSFER(6),
            ESDT_TRANSFER(7),
            ESDTNFT_TRANSFER(8),
            MESSAGEONEOF_NOT_SET(0);
            
            private final int value;

            private MessageOneofCase(int i) {
                this.value = i;
            }

            public static MessageOneofCase forNumber(int i) {
                if (i == 0) {
                    return MESSAGEONEOF_NOT_SET;
                }
                if (i == 5) {
                    return GENERIC_ACTION;
                }
                if (i == 6) {
                    return EGLD_TRANSFER;
                }
                if (i == 7) {
                    return ESDT_TRANSFER;
                }
                if (i != 8) {
                    return null;
                }
                return ESDTNFT_TRANSFER;
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
        public void clearChainId() {
            this.chainId_ = getDefaultInstance().getChainId();
        }

        /* access modifiers changed from: private */
        public void clearEgldTransfer() {
            if (this.messageOneofCase_ == 6) {
                this.messageOneofCase_ = 0;
                this.messageOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearEsdtTransfer() {
            if (this.messageOneofCase_ == 7) {
                this.messageOneofCase_ = 0;
                this.messageOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearEsdtnftTransfer() {
            if (this.messageOneofCase_ == 8) {
                this.messageOneofCase_ = 0;
                this.messageOneof_ = null;
            }
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
        public void clearGenericAction() {
            if (this.messageOneofCase_ == 5) {
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

        public static SigningInput getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeEgldTransfer(EGLDTransfer eGLDTransfer) {
            eGLDTransfer.getClass();
            if (this.messageOneofCase_ != 6 || this.messageOneof_ == EGLDTransfer.getDefaultInstance()) {
                this.messageOneof_ = eGLDTransfer;
            } else {
                this.messageOneof_ = ((EGLDTransfer.Builder) EGLDTransfer.newBuilder((EGLDTransfer) this.messageOneof_).mergeFrom(eGLDTransfer)).buildPartial();
            }
            this.messageOneofCase_ = 6;
        }

        /* access modifiers changed from: private */
        public void mergeEsdtTransfer(ESDTTransfer eSDTTransfer) {
            eSDTTransfer.getClass();
            if (this.messageOneofCase_ != 7 || this.messageOneof_ == ESDTTransfer.getDefaultInstance()) {
                this.messageOneof_ = eSDTTransfer;
            } else {
                this.messageOneof_ = ((ESDTTransfer.Builder) ESDTTransfer.newBuilder((ESDTTransfer) this.messageOneof_).mergeFrom(eSDTTransfer)).buildPartial();
            }
            this.messageOneofCase_ = 7;
        }

        /* access modifiers changed from: private */
        public void mergeEsdtnftTransfer(ESDTNFTTransfer eSDTNFTTransfer) {
            eSDTNFTTransfer.getClass();
            if (this.messageOneofCase_ != 8 || this.messageOneof_ == ESDTNFTTransfer.getDefaultInstance()) {
                this.messageOneof_ = eSDTNFTTransfer;
            } else {
                this.messageOneof_ = ((ESDTNFTTransfer.Builder) ESDTNFTTransfer.newBuilder((ESDTNFTTransfer) this.messageOneof_).mergeFrom(eSDTNFTTransfer)).buildPartial();
            }
            this.messageOneofCase_ = 8;
        }

        /* access modifiers changed from: private */
        public void mergeGenericAction(GenericAction genericAction) {
            genericAction.getClass();
            if (this.messageOneofCase_ != 5 || this.messageOneof_ == GenericAction.getDefaultInstance()) {
                this.messageOneof_ = genericAction;
            } else {
                this.messageOneof_ = ((GenericAction.Builder) GenericAction.newBuilder((GenericAction) this.messageOneof_).mergeFrom(genericAction)).buildPartial();
            }
            this.messageOneofCase_ = 5;
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
        public void setChainId(String str) {
            str.getClass();
            this.chainId_ = str;
        }

        /* access modifiers changed from: private */
        public void setChainIdBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.chainId_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setEgldTransfer(EGLDTransfer eGLDTransfer) {
            eGLDTransfer.getClass();
            this.messageOneof_ = eGLDTransfer;
            this.messageOneofCase_ = 6;
        }

        /* access modifiers changed from: private */
        public void setEsdtTransfer(ESDTTransfer eSDTTransfer) {
            eSDTTransfer.getClass();
            this.messageOneof_ = eSDTTransfer;
            this.messageOneofCase_ = 7;
        }

        /* access modifiers changed from: private */
        public void setEsdtnftTransfer(ESDTNFTTransfer eSDTNFTTransfer) {
            eSDTNFTTransfer.getClass();
            this.messageOneof_ = eSDTNFTTransfer;
            this.messageOneofCase_ = 8;
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
        public void setGenericAction(GenericAction genericAction) {
            genericAction.getClass();
            this.messageOneof_ = genericAction;
            this.messageOneofCase_ = 5;
        }

        /* access modifiers changed from: private */
        public void setPrivateKey(ByteString byteString) {
            byteString.getClass();
            this.privateKey_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97401.f46552xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningInput();
                case 2:
                    return new Builder((C97401) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0003\u0003\u0004\u0003\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000", new Object[]{"messageOneof_", "messageOneofCase_", "privateKey_", "chainId_", "gasPrice_", "gasLimit_", GenericAction.class, EGLDTransfer.class, ESDTTransfer.class, ESDTNFTTransfer.class});
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

        public String getChainId() {
            return this.chainId_;
        }

        public ByteString getChainIdBytes() {
            return ByteString.copyFromUtf8(this.chainId_);
        }

        public EGLDTransfer getEgldTransfer() {
            if (this.messageOneofCase_ == 6) {
                return (EGLDTransfer) this.messageOneof_;
            }
            return EGLDTransfer.getDefaultInstance();
        }

        public ESDTTransfer getEsdtTransfer() {
            if (this.messageOneofCase_ == 7) {
                return (ESDTTransfer) this.messageOneof_;
            }
            return ESDTTransfer.getDefaultInstance();
        }

        public ESDTNFTTransfer getEsdtnftTransfer() {
            if (this.messageOneofCase_ == 8) {
                return (ESDTNFTTransfer) this.messageOneof_;
            }
            return ESDTNFTTransfer.getDefaultInstance();
        }

        public long getGasLimit() {
            return this.gasLimit_;
        }

        public long getGasPrice() {
            return this.gasPrice_;
        }

        public GenericAction getGenericAction() {
            if (this.messageOneofCase_ == 5) {
                return (GenericAction) this.messageOneof_;
            }
            return GenericAction.getDefaultInstance();
        }

        public MessageOneofCase getMessageOneofCase() {
            return MessageOneofCase.forNumber(this.messageOneofCase_);
        }

        public ByteString getPrivateKey() {
            return this.privateKey_;
        }

        public boolean hasEgldTransfer() {
            if (this.messageOneofCase_ == 6) {
                return true;
            }
            return false;
        }

        public boolean hasEsdtTransfer() {
            if (this.messageOneofCase_ == 7) {
                return true;
            }
            return false;
        }

        public boolean hasEsdtnftTransfer() {
            if (this.messageOneofCase_ == 8) {
                return true;
            }
            return false;
        }

        public boolean hasGenericAction() {
            if (this.messageOneofCase_ == 5) {
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
        String getChainId();

        ByteString getChainIdBytes();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        EGLDTransfer getEgldTransfer();

        ESDTTransfer getEsdtTransfer();

        ESDTNFTTransfer getEsdtnftTransfer();

        long getGasLimit();

        long getGasPrice();

        GenericAction getGenericAction();

        SigningInput.MessageOneofCase getMessageOneofCase();

        ByteString getPrivateKey();

        boolean hasEgldTransfer();

        boolean hasEsdtTransfer();

        boolean hasEsdtnftTransfer();

        boolean hasGenericAction();

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
            public /* synthetic */ Builder(C97401 r1) {
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
            switch (C97401.f46552xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningOutput();
                case 2:
                    return new Builder((C97401) null);
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

    private Elrond() {
    }

    public static void registerAllExtensions(C4987l lVar) {
    }
}
