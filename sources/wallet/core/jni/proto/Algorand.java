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

public final class Algorand {

    /* renamed from: wallet.core.jni.proto.Algorand$1 */
    public static /* synthetic */ class C97261 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f46542xa1df5c61;

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
                f46542xa1df5c61 = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f46542xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f46542xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f46542xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f46542xa1df5c61     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f46542xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f46542xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wallet.core.jni.proto.Algorand.C97261.<clinit>():void");
        }
    }

    public static final class AssetOptIn extends GeneratedMessageLite<AssetOptIn, Builder> implements AssetOptInOrBuilder {
        public static final int ASSET_ID_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final AssetOptIn DEFAULT_INSTANCE;
        private static volatile im4<AssetOptIn> PARSER;
        private long assetId_;

        public static final class Builder extends GeneratedMessageLite.C4930a<AssetOptIn, Builder> implements AssetOptInOrBuilder {
            public /* synthetic */ Builder(C97261 r1) {
                this();
            }

            public Builder clearAssetId() {
                copyOnWrite();
                ((AssetOptIn) this.instance).clearAssetId();
                return this;
            }

            public long getAssetId() {
                return ((AssetOptIn) this.instance).getAssetId();
            }

            public Builder setAssetId(long j) {
                copyOnWrite();
                ((AssetOptIn) this.instance).setAssetId(j);
                return this;
            }

            private Builder() {
                super(AssetOptIn.DEFAULT_INSTANCE);
            }
        }

        static {
            AssetOptIn assetOptIn = new AssetOptIn();
            DEFAULT_INSTANCE = assetOptIn;
            GeneratedMessageLite.registerDefaultInstance(AssetOptIn.class, assetOptIn);
        }

        private AssetOptIn() {
        }

        /* access modifiers changed from: private */
        public void clearAssetId() {
            this.assetId_ = 0;
        }

        public static AssetOptIn getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static AssetOptIn parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AssetOptIn) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AssetOptIn parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AssetOptIn) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<AssetOptIn> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAssetId(long j) {
            this.assetId_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97261.f46542xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new AssetOptIn();
                case 2:
                    return new Builder((C97261) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0003", new Object[]{"assetId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<AssetOptIn> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (AssetOptIn.class) {
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

        public long getAssetId() {
            return this.assetId_;
        }

        public static Builder newBuilder(AssetOptIn assetOptIn) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(assetOptIn);
        }

        public static AssetOptIn parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (AssetOptIn) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static AssetOptIn parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (AssetOptIn) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static AssetOptIn parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AssetOptIn) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AssetOptIn parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (AssetOptIn) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static AssetOptIn parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AssetOptIn) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AssetOptIn parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (AssetOptIn) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static AssetOptIn parseFrom(InputStream inputStream) throws IOException {
            return (AssetOptIn) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AssetOptIn parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (AssetOptIn) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static AssetOptIn parseFrom(C4969g gVar) throws IOException {
            return (AssetOptIn) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static AssetOptIn parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (AssetOptIn) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface AssetOptInOrBuilder extends qu3 {
        long getAssetId();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        /* synthetic */ boolean isInitialized();
    }

    public static final class AssetTransfer extends GeneratedMessageLite<AssetTransfer, Builder> implements AssetTransferOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 2;
        public static final int ASSET_ID_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final AssetTransfer DEFAULT_INSTANCE;
        private static volatile im4<AssetTransfer> PARSER = null;
        public static final int TO_ADDRESS_FIELD_NUMBER = 1;
        private long amount_;
        private long assetId_;
        private String toAddress_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<AssetTransfer, Builder> implements AssetTransferOrBuilder {
            public /* synthetic */ Builder(C97261 r1) {
                this();
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((AssetTransfer) this.instance).clearAmount();
                return this;
            }

            public Builder clearAssetId() {
                copyOnWrite();
                ((AssetTransfer) this.instance).clearAssetId();
                return this;
            }

            public Builder clearToAddress() {
                copyOnWrite();
                ((AssetTransfer) this.instance).clearToAddress();
                return this;
            }

            public long getAmount() {
                return ((AssetTransfer) this.instance).getAmount();
            }

            public long getAssetId() {
                return ((AssetTransfer) this.instance).getAssetId();
            }

            public String getToAddress() {
                return ((AssetTransfer) this.instance).getToAddress();
            }

            public ByteString getToAddressBytes() {
                return ((AssetTransfer) this.instance).getToAddressBytes();
            }

            public Builder setAmount(long j) {
                copyOnWrite();
                ((AssetTransfer) this.instance).setAmount(j);
                return this;
            }

            public Builder setAssetId(long j) {
                copyOnWrite();
                ((AssetTransfer) this.instance).setAssetId(j);
                return this;
            }

            public Builder setToAddress(String str) {
                copyOnWrite();
                ((AssetTransfer) this.instance).setToAddress(str);
                return this;
            }

            public Builder setToAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((AssetTransfer) this.instance).setToAddressBytes(byteString);
                return this;
            }

            private Builder() {
                super(AssetTransfer.DEFAULT_INSTANCE);
            }
        }

        static {
            AssetTransfer assetTransfer = new AssetTransfer();
            DEFAULT_INSTANCE = assetTransfer;
            GeneratedMessageLite.registerDefaultInstance(AssetTransfer.class, assetTransfer);
        }

        private AssetTransfer() {
        }

        /* access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearAssetId() {
            this.assetId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearToAddress() {
            this.toAddress_ = getDefaultInstance().getToAddress();
        }

        public static AssetTransfer getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static AssetTransfer parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AssetTransfer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AssetTransfer parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AssetTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<AssetTransfer> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAmount(long j) {
            this.amount_ = j;
        }

        /* access modifiers changed from: private */
        public void setAssetId(long j) {
            this.assetId_ = j;
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
            switch (C97261.f46542xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new AssetTransfer();
                case 2:
                    return new Builder((C97261) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0003\u0003\u0003", new Object[]{"toAddress_", "amount_", "assetId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<AssetTransfer> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (AssetTransfer.class) {
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

        public long getAssetId() {
            return this.assetId_;
        }

        public String getToAddress() {
            return this.toAddress_;
        }

        public ByteString getToAddressBytes() {
            return ByteString.copyFromUtf8(this.toAddress_);
        }

        public static Builder newBuilder(AssetTransfer assetTransfer) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(assetTransfer);
        }

        public static AssetTransfer parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (AssetTransfer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static AssetTransfer parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (AssetTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static AssetTransfer parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AssetTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AssetTransfer parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (AssetTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static AssetTransfer parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AssetTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AssetTransfer parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (AssetTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static AssetTransfer parseFrom(InputStream inputStream) throws IOException {
            return (AssetTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AssetTransfer parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (AssetTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static AssetTransfer parseFrom(C4969g gVar) throws IOException {
            return (AssetTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static AssetTransfer parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (AssetTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface AssetTransferOrBuilder extends qu3 {
        long getAmount();

        long getAssetId();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getToAddress();

        ByteString getToAddressBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SigningInput extends GeneratedMessageLite<SigningInput, Builder> implements SigningInputOrBuilder {
        public static final int ASSET_OPT_IN_FIELD_NUMBER = 12;
        public static final int ASSET_TRANSFER_FIELD_NUMBER = 11;
        /* access modifiers changed from: private */
        public static final SigningInput DEFAULT_INSTANCE;
        public static final int FEE_FIELD_NUMBER = 7;
        public static final int FIRST_ROUND_FIELD_NUMBER = 5;
        public static final int GENESIS_HASH_FIELD_NUMBER = 2;
        public static final int GENESIS_ID_FIELD_NUMBER = 1;
        public static final int LAST_ROUND_FIELD_NUMBER = 6;
        public static final int NOTE_FIELD_NUMBER = 3;
        private static volatile im4<SigningInput> PARSER = null;
        public static final int PRIVATE_KEY_FIELD_NUMBER = 4;
        public static final int TRANSFER_FIELD_NUMBER = 10;
        private long fee_;
        private long firstRound_;
        private ByteString genesisHash_;
        private String genesisId_ = "";
        private long lastRound_;
        private int messageOneofCase_ = 0;
        private Object messageOneof_;
        private ByteString note_;
        private ByteString privateKey_;

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningInput, Builder> implements SigningInputOrBuilder {
            public /* synthetic */ Builder(C97261 r1) {
                this();
            }

            public Builder clearAssetOptIn() {
                copyOnWrite();
                ((SigningInput) this.instance).clearAssetOptIn();
                return this;
            }

            public Builder clearAssetTransfer() {
                copyOnWrite();
                ((SigningInput) this.instance).clearAssetTransfer();
                return this;
            }

            public Builder clearFee() {
                copyOnWrite();
                ((SigningInput) this.instance).clearFee();
                return this;
            }

            public Builder clearFirstRound() {
                copyOnWrite();
                ((SigningInput) this.instance).clearFirstRound();
                return this;
            }

            public Builder clearGenesisHash() {
                copyOnWrite();
                ((SigningInput) this.instance).clearGenesisHash();
                return this;
            }

            public Builder clearGenesisId() {
                copyOnWrite();
                ((SigningInput) this.instance).clearGenesisId();
                return this;
            }

            public Builder clearLastRound() {
                copyOnWrite();
                ((SigningInput) this.instance).clearLastRound();
                return this;
            }

            public Builder clearMessageOneof() {
                copyOnWrite();
                ((SigningInput) this.instance).clearMessageOneof();
                return this;
            }

            public Builder clearNote() {
                copyOnWrite();
                ((SigningInput) this.instance).clearNote();
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

            public AssetOptIn getAssetOptIn() {
                return ((SigningInput) this.instance).getAssetOptIn();
            }

            public AssetTransfer getAssetTransfer() {
                return ((SigningInput) this.instance).getAssetTransfer();
            }

            public long getFee() {
                return ((SigningInput) this.instance).getFee();
            }

            public long getFirstRound() {
                return ((SigningInput) this.instance).getFirstRound();
            }

            public ByteString getGenesisHash() {
                return ((SigningInput) this.instance).getGenesisHash();
            }

            public String getGenesisId() {
                return ((SigningInput) this.instance).getGenesisId();
            }

            public ByteString getGenesisIdBytes() {
                return ((SigningInput) this.instance).getGenesisIdBytes();
            }

            public long getLastRound() {
                return ((SigningInput) this.instance).getLastRound();
            }

            public MessageOneofCase getMessageOneofCase() {
                return ((SigningInput) this.instance).getMessageOneofCase();
            }

            public ByteString getNote() {
                return ((SigningInput) this.instance).getNote();
            }

            public ByteString getPrivateKey() {
                return ((SigningInput) this.instance).getPrivateKey();
            }

            public Transfer getTransfer() {
                return ((SigningInput) this.instance).getTransfer();
            }

            public boolean hasAssetOptIn() {
                return ((SigningInput) this.instance).hasAssetOptIn();
            }

            public boolean hasAssetTransfer() {
                return ((SigningInput) this.instance).hasAssetTransfer();
            }

            public boolean hasTransfer() {
                return ((SigningInput) this.instance).hasTransfer();
            }

            public Builder mergeAssetOptIn(AssetOptIn assetOptIn) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeAssetOptIn(assetOptIn);
                return this;
            }

            public Builder mergeAssetTransfer(AssetTransfer assetTransfer) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeAssetTransfer(assetTransfer);
                return this;
            }

            public Builder mergeTransfer(Transfer transfer) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeTransfer(transfer);
                return this;
            }

            public Builder setAssetOptIn(AssetOptIn assetOptIn) {
                copyOnWrite();
                ((SigningInput) this.instance).setAssetOptIn(assetOptIn);
                return this;
            }

            public Builder setAssetTransfer(AssetTransfer assetTransfer) {
                copyOnWrite();
                ((SigningInput) this.instance).setAssetTransfer(assetTransfer);
                return this;
            }

            public Builder setFee(long j) {
                copyOnWrite();
                ((SigningInput) this.instance).setFee(j);
                return this;
            }

            public Builder setFirstRound(long j) {
                copyOnWrite();
                ((SigningInput) this.instance).setFirstRound(j);
                return this;
            }

            public Builder setGenesisHash(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setGenesisHash(byteString);
                return this;
            }

            public Builder setGenesisId(String str) {
                copyOnWrite();
                ((SigningInput) this.instance).setGenesisId(str);
                return this;
            }

            public Builder setGenesisIdBytes(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setGenesisIdBytes(byteString);
                return this;
            }

            public Builder setLastRound(long j) {
                copyOnWrite();
                ((SigningInput) this.instance).setLastRound(j);
                return this;
            }

            public Builder setNote(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setNote(byteString);
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

            public Builder setAssetOptIn(AssetOptIn.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setAssetOptIn((AssetOptIn) builder.build());
                return this;
            }

            public Builder setAssetTransfer(AssetTransfer.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setAssetTransfer((AssetTransfer) builder.build());
                return this;
            }

            public Builder setTransfer(Transfer.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setTransfer((Transfer) builder.build());
                return this;
            }
        }

        public enum MessageOneofCase {
            TRANSFER(10),
            ASSET_TRANSFER(11),
            ASSET_OPT_IN(12),
            MESSAGEONEOF_NOT_SET(0);
            
            private final int value;

            private MessageOneofCase(int i) {
                this.value = i;
            }

            public static MessageOneofCase forNumber(int i) {
                if (i == 0) {
                    return MESSAGEONEOF_NOT_SET;
                }
                switch (i) {
                    case 10:
                        return TRANSFER;
                    case 11:
                        return ASSET_TRANSFER;
                    case 12:
                        return ASSET_OPT_IN;
                    default:
                        return null;
                }
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
            ByteString byteString = ByteString.EMPTY;
            this.genesisHash_ = byteString;
            this.note_ = byteString;
            this.privateKey_ = byteString;
        }

        /* access modifiers changed from: private */
        public void clearAssetOptIn() {
            if (this.messageOneofCase_ == 12) {
                this.messageOneofCase_ = 0;
                this.messageOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearAssetTransfer() {
            if (this.messageOneofCase_ == 11) {
                this.messageOneofCase_ = 0;
                this.messageOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearFee() {
            this.fee_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFirstRound() {
            this.firstRound_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearGenesisHash() {
            this.genesisHash_ = getDefaultInstance().getGenesisHash();
        }

        /* access modifiers changed from: private */
        public void clearGenesisId() {
            this.genesisId_ = getDefaultInstance().getGenesisId();
        }

        /* access modifiers changed from: private */
        public void clearLastRound() {
            this.lastRound_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearMessageOneof() {
            this.messageOneofCase_ = 0;
            this.messageOneof_ = null;
        }

        /* access modifiers changed from: private */
        public void clearNote() {
            this.note_ = getDefaultInstance().getNote();
        }

        /* access modifiers changed from: private */
        public void clearPrivateKey() {
            this.privateKey_ = getDefaultInstance().getPrivateKey();
        }

        /* access modifiers changed from: private */
        public void clearTransfer() {
            if (this.messageOneofCase_ == 10) {
                this.messageOneofCase_ = 0;
                this.messageOneof_ = null;
            }
        }

        public static SigningInput getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeAssetOptIn(AssetOptIn assetOptIn) {
            assetOptIn.getClass();
            if (this.messageOneofCase_ != 12 || this.messageOneof_ == AssetOptIn.getDefaultInstance()) {
                this.messageOneof_ = assetOptIn;
            } else {
                this.messageOneof_ = ((AssetOptIn.Builder) AssetOptIn.newBuilder((AssetOptIn) this.messageOneof_).mergeFrom(assetOptIn)).buildPartial();
            }
            this.messageOneofCase_ = 12;
        }

        /* access modifiers changed from: private */
        public void mergeAssetTransfer(AssetTransfer assetTransfer) {
            assetTransfer.getClass();
            if (this.messageOneofCase_ != 11 || this.messageOneof_ == AssetTransfer.getDefaultInstance()) {
                this.messageOneof_ = assetTransfer;
            } else {
                this.messageOneof_ = ((AssetTransfer.Builder) AssetTransfer.newBuilder((AssetTransfer) this.messageOneof_).mergeFrom(assetTransfer)).buildPartial();
            }
            this.messageOneofCase_ = 11;
        }

        /* access modifiers changed from: private */
        public void mergeTransfer(Transfer transfer) {
            transfer.getClass();
            if (this.messageOneofCase_ != 10 || this.messageOneof_ == Transfer.getDefaultInstance()) {
                this.messageOneof_ = transfer;
            } else {
                this.messageOneof_ = ((Transfer.Builder) Transfer.newBuilder((Transfer) this.messageOneof_).mergeFrom(transfer)).buildPartial();
            }
            this.messageOneofCase_ = 10;
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
        public void setAssetOptIn(AssetOptIn assetOptIn) {
            assetOptIn.getClass();
            this.messageOneof_ = assetOptIn;
            this.messageOneofCase_ = 12;
        }

        /* access modifiers changed from: private */
        public void setAssetTransfer(AssetTransfer assetTransfer) {
            assetTransfer.getClass();
            this.messageOneof_ = assetTransfer;
            this.messageOneofCase_ = 11;
        }

        /* access modifiers changed from: private */
        public void setFee(long j) {
            this.fee_ = j;
        }

        /* access modifiers changed from: private */
        public void setFirstRound(long j) {
            this.firstRound_ = j;
        }

        /* access modifiers changed from: private */
        public void setGenesisHash(ByteString byteString) {
            byteString.getClass();
            this.genesisHash_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setGenesisId(String str) {
            str.getClass();
            this.genesisId_ = str;
        }

        /* access modifiers changed from: private */
        public void setGenesisIdBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.genesisId_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setLastRound(long j) {
            this.lastRound_ = j;
        }

        /* access modifiers changed from: private */
        public void setNote(ByteString byteString) {
            byteString.getClass();
            this.note_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setPrivateKey(ByteString byteString) {
            byteString.getClass();
            this.privateKey_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setTransfer(Transfer transfer) {
            transfer.getClass();
            this.messageOneof_ = transfer;
            this.messageOneofCase_ = 10;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97261.f46542xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningInput();
                case 2:
                    return new Builder((C97261) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0001\u0000\u0001\f\n\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\n\u0004\n\u0005\u0003\u0006\u0003\u0007\u0003\n<\u0000\u000b<\u0000\f<\u0000", new Object[]{"messageOneof_", "messageOneofCase_", "genesisId_", "genesisHash_", "note_", "privateKey_", "firstRound_", "lastRound_", "fee_", Transfer.class, AssetTransfer.class, AssetOptIn.class});
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

        public AssetOptIn getAssetOptIn() {
            if (this.messageOneofCase_ == 12) {
                return (AssetOptIn) this.messageOneof_;
            }
            return AssetOptIn.getDefaultInstance();
        }

        public AssetTransfer getAssetTransfer() {
            if (this.messageOneofCase_ == 11) {
                return (AssetTransfer) this.messageOneof_;
            }
            return AssetTransfer.getDefaultInstance();
        }

        public long getFee() {
            return this.fee_;
        }

        public long getFirstRound() {
            return this.firstRound_;
        }

        public ByteString getGenesisHash() {
            return this.genesisHash_;
        }

        public String getGenesisId() {
            return this.genesisId_;
        }

        public ByteString getGenesisIdBytes() {
            return ByteString.copyFromUtf8(this.genesisId_);
        }

        public long getLastRound() {
            return this.lastRound_;
        }

        public MessageOneofCase getMessageOneofCase() {
            return MessageOneofCase.forNumber(this.messageOneofCase_);
        }

        public ByteString getNote() {
            return this.note_;
        }

        public ByteString getPrivateKey() {
            return this.privateKey_;
        }

        public Transfer getTransfer() {
            if (this.messageOneofCase_ == 10) {
                return (Transfer) this.messageOneof_;
            }
            return Transfer.getDefaultInstance();
        }

        public boolean hasAssetOptIn() {
            if (this.messageOneofCase_ == 12) {
                return true;
            }
            return false;
        }

        public boolean hasAssetTransfer() {
            if (this.messageOneofCase_ == 11) {
                return true;
            }
            return false;
        }

        public boolean hasTransfer() {
            if (this.messageOneofCase_ == 10) {
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
        AssetOptIn getAssetOptIn();

        AssetTransfer getAssetTransfer();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        long getFee();

        long getFirstRound();

        ByteString getGenesisHash();

        String getGenesisId();

        ByteString getGenesisIdBytes();

        long getLastRound();

        SigningInput.MessageOneofCase getMessageOneofCase();

        ByteString getNote();

        ByteString getPrivateKey();

        Transfer getTransfer();

        boolean hasAssetOptIn();

        boolean hasAssetTransfer();

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
            public /* synthetic */ Builder(C97261 r1) {
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
            switch (C97261.f46542xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningOutput();
                case 2:
                    return new Builder((C97261) null);
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

    public static final class Transfer extends GeneratedMessageLite<Transfer, Builder> implements TransferOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final Transfer DEFAULT_INSTANCE;
        private static volatile im4<Transfer> PARSER = null;
        public static final int TO_ADDRESS_FIELD_NUMBER = 1;
        private long amount_;
        private String toAddress_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<Transfer, Builder> implements TransferOrBuilder {
            public /* synthetic */ Builder(C97261 r1) {
                this();
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((Transfer) this.instance).clearAmount();
                return this;
            }

            public Builder clearToAddress() {
                copyOnWrite();
                ((Transfer) this.instance).clearToAddress();
                return this;
            }

            public long getAmount() {
                return ((Transfer) this.instance).getAmount();
            }

            public String getToAddress() {
                return ((Transfer) this.instance).getToAddress();
            }

            public ByteString getToAddressBytes() {
                return ((Transfer) this.instance).getToAddressBytes();
            }

            public Builder setAmount(long j) {
                copyOnWrite();
                ((Transfer) this.instance).setAmount(j);
                return this;
            }

            public Builder setToAddress(String str) {
                copyOnWrite();
                ((Transfer) this.instance).setToAddress(str);
                return this;
            }

            public Builder setToAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((Transfer) this.instance).setToAddressBytes(byteString);
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
            this.amount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearToAddress() {
            this.toAddress_ = getDefaultInstance().getToAddress();
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
            switch (C97261.f46542xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Transfer();
                case 2:
                    return new Builder((C97261) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0003", new Object[]{"toAddress_", "amount_"});
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

        public long getAmount() {
            return this.amount_;
        }

        public String getToAddress() {
            return this.toAddress_;
        }

        public ByteString getToAddressBytes() {
            return ByteString.copyFromUtf8(this.toAddress_);
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
        long getAmount();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getToAddress();

        ByteString getToAddressBytes();

        /* synthetic */ boolean isInitialized();
    }

    private Algorand() {
    }

    public static void registerAllExtensions(C4987l lVar) {
    }
}
