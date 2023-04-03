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

public final class EOS {

    /* renamed from: wallet.core.jni.proto.EOS$1 */
    public static /* synthetic */ class C97381 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f46551xa1df5c61;

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
                f46551xa1df5c61 = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f46551xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f46551xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f46551xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f46551xa1df5c61     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f46551xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f46551xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wallet.core.jni.proto.EOS.C97381.<clinit>():void");
        }
    }

    public static final class Asset extends GeneratedMessageLite<Asset, Builder> implements AssetOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 1;
        public static final int DECIMALS_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final Asset DEFAULT_INSTANCE;
        private static volatile im4<Asset> PARSER = null;
        public static final int SYMBOL_FIELD_NUMBER = 3;
        private long amount_;
        private int decimals_;
        private String symbol_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<Asset, Builder> implements AssetOrBuilder {
            public /* synthetic */ Builder(C97381 r1) {
                this();
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((Asset) this.instance).clearAmount();
                return this;
            }

            public Builder clearDecimals() {
                copyOnWrite();
                ((Asset) this.instance).clearDecimals();
                return this;
            }

            public Builder clearSymbol() {
                copyOnWrite();
                ((Asset) this.instance).clearSymbol();
                return this;
            }

            public long getAmount() {
                return ((Asset) this.instance).getAmount();
            }

            public int getDecimals() {
                return ((Asset) this.instance).getDecimals();
            }

            public String getSymbol() {
                return ((Asset) this.instance).getSymbol();
            }

            public ByteString getSymbolBytes() {
                return ((Asset) this.instance).getSymbolBytes();
            }

            public Builder setAmount(long j) {
                copyOnWrite();
                ((Asset) this.instance).setAmount(j);
                return this;
            }

            public Builder setDecimals(int i) {
                copyOnWrite();
                ((Asset) this.instance).setDecimals(i);
                return this;
            }

            public Builder setSymbol(String str) {
                copyOnWrite();
                ((Asset) this.instance).setSymbol(str);
                return this;
            }

            public Builder setSymbolBytes(ByteString byteString) {
                copyOnWrite();
                ((Asset) this.instance).setSymbolBytes(byteString);
                return this;
            }

            private Builder() {
                super(Asset.DEFAULT_INSTANCE);
            }
        }

        static {
            Asset asset = new Asset();
            DEFAULT_INSTANCE = asset;
            GeneratedMessageLite.registerDefaultInstance(Asset.class, asset);
        }

        private Asset() {
        }

        /* access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearDecimals() {
            this.decimals_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSymbol() {
            this.symbol_ = getDefaultInstance().getSymbol();
        }

        public static Asset getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Asset parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Asset) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Asset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<Asset> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAmount(long j) {
            this.amount_ = j;
        }

        /* access modifiers changed from: private */
        public void setDecimals(int i) {
            this.decimals_ = i;
        }

        /* access modifiers changed from: private */
        public void setSymbol(String str) {
            str.getClass();
            this.symbol_ = str;
        }

        /* access modifiers changed from: private */
        public void setSymbolBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.symbol_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97381.f46551xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Asset();
                case 2:
                    return new Builder((C97381) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\u000b\u0003Ȉ", new Object[]{"amount_", "decimals_", "symbol_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<Asset> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (Asset.class) {
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

        public int getDecimals() {
            return this.decimals_;
        }

        public String getSymbol() {
            return this.symbol_;
        }

        public ByteString getSymbolBytes() {
            return ByteString.copyFromUtf8(this.symbol_);
        }

        public static Builder newBuilder(Asset asset) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(asset);
        }

        public static Asset parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Asset) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Asset parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static Asset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Asset parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static Asset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Asset parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static Asset parseFrom(InputStream inputStream) throws IOException {
            return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Asset parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Asset parseFrom(C4969g gVar) throws IOException {
            return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static Asset parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface AssetOrBuilder extends qu3 {
        long getAmount();

        int getDecimals();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getSymbol();

        ByteString getSymbolBytes();

        /* synthetic */ boolean isInitialized();
    }

    public enum KeyType implements C5011t.C5014c {
        LEGACY(0),
        MODERNK1(1),
        MODERNR1(2),
        UNRECOGNIZED(-1);
        
        public static final int LEGACY_VALUE = 0;
        public static final int MODERNK1_VALUE = 1;
        public static final int MODERNR1_VALUE = 2;
        private static final C5011t.C5015d<KeyType> internalValueMap = null;
        private final int value;

        public static final class KeyTypeVerifier implements C5011t.C5016e {
            public static final C5011t.C5016e INSTANCE = null;

            static {
                INSTANCE = new KeyTypeVerifier();
            }

            private KeyTypeVerifier() {
            }

            public boolean isInRange(int i) {
                if (KeyType.forNumber(i) != null) {
                    return true;
                }
                return false;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C5011t.C5015d<KeyType>() {
                public KeyType findValueByNumber(int i) {
                    return KeyType.forNumber(i);
                }
            };
        }

        private KeyType(int i) {
            this.value = i;
        }

        public static KeyType forNumber(int i) {
            if (i == 0) {
                return LEGACY;
            }
            if (i == 1) {
                return MODERNK1;
            }
            if (i != 2) {
                return null;
            }
            return MODERNR1;
        }

        public static C5011t.C5015d<KeyType> internalGetValueMap() {
            return internalValueMap;
        }

        public static C5011t.C5016e internalGetVerifier() {
            return KeyTypeVerifier.INSTANCE;
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static KeyType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class SigningInput extends GeneratedMessageLite<SigningInput, Builder> implements SigningInputOrBuilder {
        public static final int ASSET_FIELD_NUMBER = 8;
        public static final int CHAIN_ID_FIELD_NUMBER = 1;
        public static final int CURRENCY_FIELD_NUMBER = 4;
        /* access modifiers changed from: private */
        public static final SigningInput DEFAULT_INSTANCE;
        public static final int MEMO_FIELD_NUMBER = 7;
        private static volatile im4<SigningInput> PARSER = null;
        public static final int PRIVATE_KEY_FIELD_NUMBER = 9;
        public static final int PRIVATE_KEY_TYPE_FIELD_NUMBER = 10;
        public static final int RECIPIENT_FIELD_NUMBER = 6;
        public static final int REFERENCE_BLOCK_ID_FIELD_NUMBER = 2;
        public static final int REFERENCE_BLOCK_TIME_FIELD_NUMBER = 3;
        public static final int SENDER_FIELD_NUMBER = 5;
        private Asset asset_;
        private ByteString chainId_;
        private String currency_ = "";
        private String memo_ = "";
        private int privateKeyType_;
        private ByteString privateKey_;
        private String recipient_ = "";
        private ByteString referenceBlockId_;
        private int referenceBlockTime_;
        private String sender_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningInput, Builder> implements SigningInputOrBuilder {
            public /* synthetic */ Builder(C97381 r1) {
                this();
            }

            public Builder clearAsset() {
                copyOnWrite();
                ((SigningInput) this.instance).clearAsset();
                return this;
            }

            public Builder clearChainId() {
                copyOnWrite();
                ((SigningInput) this.instance).clearChainId();
                return this;
            }

            public Builder clearCurrency() {
                copyOnWrite();
                ((SigningInput) this.instance).clearCurrency();
                return this;
            }

            public Builder clearMemo() {
                copyOnWrite();
                ((SigningInput) this.instance).clearMemo();
                return this;
            }

            public Builder clearPrivateKey() {
                copyOnWrite();
                ((SigningInput) this.instance).clearPrivateKey();
                return this;
            }

            public Builder clearPrivateKeyType() {
                copyOnWrite();
                ((SigningInput) this.instance).clearPrivateKeyType();
                return this;
            }

            public Builder clearRecipient() {
                copyOnWrite();
                ((SigningInput) this.instance).clearRecipient();
                return this;
            }

            public Builder clearReferenceBlockId() {
                copyOnWrite();
                ((SigningInput) this.instance).clearReferenceBlockId();
                return this;
            }

            public Builder clearReferenceBlockTime() {
                copyOnWrite();
                ((SigningInput) this.instance).clearReferenceBlockTime();
                return this;
            }

            public Builder clearSender() {
                copyOnWrite();
                ((SigningInput) this.instance).clearSender();
                return this;
            }

            public Asset getAsset() {
                return ((SigningInput) this.instance).getAsset();
            }

            public ByteString getChainId() {
                return ((SigningInput) this.instance).getChainId();
            }

            public String getCurrency() {
                return ((SigningInput) this.instance).getCurrency();
            }

            public ByteString getCurrencyBytes() {
                return ((SigningInput) this.instance).getCurrencyBytes();
            }

            public String getMemo() {
                return ((SigningInput) this.instance).getMemo();
            }

            public ByteString getMemoBytes() {
                return ((SigningInput) this.instance).getMemoBytes();
            }

            public ByteString getPrivateKey() {
                return ((SigningInput) this.instance).getPrivateKey();
            }

            public KeyType getPrivateKeyType() {
                return ((SigningInput) this.instance).getPrivateKeyType();
            }

            public int getPrivateKeyTypeValue() {
                return ((SigningInput) this.instance).getPrivateKeyTypeValue();
            }

            public String getRecipient() {
                return ((SigningInput) this.instance).getRecipient();
            }

            public ByteString getRecipientBytes() {
                return ((SigningInput) this.instance).getRecipientBytes();
            }

            public ByteString getReferenceBlockId() {
                return ((SigningInput) this.instance).getReferenceBlockId();
            }

            public int getReferenceBlockTime() {
                return ((SigningInput) this.instance).getReferenceBlockTime();
            }

            public String getSender() {
                return ((SigningInput) this.instance).getSender();
            }

            public ByteString getSenderBytes() {
                return ((SigningInput) this.instance).getSenderBytes();
            }

            public boolean hasAsset() {
                return ((SigningInput) this.instance).hasAsset();
            }

            public Builder mergeAsset(Asset asset) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeAsset(asset);
                return this;
            }

            public Builder setAsset(Asset asset) {
                copyOnWrite();
                ((SigningInput) this.instance).setAsset(asset);
                return this;
            }

            public Builder setChainId(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setChainId(byteString);
                return this;
            }

            public Builder setCurrency(String str) {
                copyOnWrite();
                ((SigningInput) this.instance).setCurrency(str);
                return this;
            }

            public Builder setCurrencyBytes(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setCurrencyBytes(byteString);
                return this;
            }

            public Builder setMemo(String str) {
                copyOnWrite();
                ((SigningInput) this.instance).setMemo(str);
                return this;
            }

            public Builder setMemoBytes(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setMemoBytes(byteString);
                return this;
            }

            public Builder setPrivateKey(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setPrivateKey(byteString);
                return this;
            }

            public Builder setPrivateKeyType(KeyType keyType) {
                copyOnWrite();
                ((SigningInput) this.instance).setPrivateKeyType(keyType);
                return this;
            }

            public Builder setPrivateKeyTypeValue(int i) {
                copyOnWrite();
                ((SigningInput) this.instance).setPrivateKeyTypeValue(i);
                return this;
            }

            public Builder setRecipient(String str) {
                copyOnWrite();
                ((SigningInput) this.instance).setRecipient(str);
                return this;
            }

            public Builder setRecipientBytes(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setRecipientBytes(byteString);
                return this;
            }

            public Builder setReferenceBlockId(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setReferenceBlockId(byteString);
                return this;
            }

            public Builder setReferenceBlockTime(int i) {
                copyOnWrite();
                ((SigningInput) this.instance).setReferenceBlockTime(i);
                return this;
            }

            public Builder setSender(String str) {
                copyOnWrite();
                ((SigningInput) this.instance).setSender(str);
                return this;
            }

            public Builder setSenderBytes(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setSenderBytes(byteString);
                return this;
            }

            private Builder() {
                super(SigningInput.DEFAULT_INSTANCE);
            }

            public Builder setAsset(Asset.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setAsset((Asset) builder.build());
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
            this.referenceBlockId_ = byteString;
            this.privateKey_ = byteString;
        }

        /* access modifiers changed from: private */
        public void clearAsset() {
            this.asset_ = null;
        }

        /* access modifiers changed from: private */
        public void clearChainId() {
            this.chainId_ = getDefaultInstance().getChainId();
        }

        /* access modifiers changed from: private */
        public void clearCurrency() {
            this.currency_ = getDefaultInstance().getCurrency();
        }

        /* access modifiers changed from: private */
        public void clearMemo() {
            this.memo_ = getDefaultInstance().getMemo();
        }

        /* access modifiers changed from: private */
        public void clearPrivateKey() {
            this.privateKey_ = getDefaultInstance().getPrivateKey();
        }

        /* access modifiers changed from: private */
        public void clearPrivateKeyType() {
            this.privateKeyType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearRecipient() {
            this.recipient_ = getDefaultInstance().getRecipient();
        }

        /* access modifiers changed from: private */
        public void clearReferenceBlockId() {
            this.referenceBlockId_ = getDefaultInstance().getReferenceBlockId();
        }

        /* access modifiers changed from: private */
        public void clearReferenceBlockTime() {
            this.referenceBlockTime_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSender() {
            this.sender_ = getDefaultInstance().getSender();
        }

        public static SigningInput getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeAsset(Asset asset) {
            asset.getClass();
            Asset asset2 = this.asset_;
            if (asset2 == null || asset2 == Asset.getDefaultInstance()) {
                this.asset_ = asset;
            } else {
                this.asset_ = (Asset) ((Asset.Builder) Asset.newBuilder(this.asset_).mergeFrom(asset)).buildPartial();
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
        public void setAsset(Asset asset) {
            asset.getClass();
            this.asset_ = asset;
        }

        /* access modifiers changed from: private */
        public void setChainId(ByteString byteString) {
            byteString.getClass();
            this.chainId_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setCurrency(String str) {
            str.getClass();
            this.currency_ = str;
        }

        /* access modifiers changed from: private */
        public void setCurrencyBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.currency_ = byteString.toStringUtf8();
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
        public void setPrivateKey(ByteString byteString) {
            byteString.getClass();
            this.privateKey_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setPrivateKeyType(KeyType keyType) {
            this.privateKeyType_ = keyType.getNumber();
        }

        /* access modifiers changed from: private */
        public void setPrivateKeyTypeValue(int i) {
            this.privateKeyType_ = i;
        }

        /* access modifiers changed from: private */
        public void setRecipient(String str) {
            str.getClass();
            this.recipient_ = str;
        }

        /* access modifiers changed from: private */
        public void setRecipientBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.recipient_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setReferenceBlockId(ByteString byteString) {
            byteString.getClass();
            this.referenceBlockId_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setReferenceBlockTime(int i) {
            this.referenceBlockTime_ = i;
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

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97381.f46551xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningInput();
                case 2:
                    return new Builder((C97381) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001\n\u0002\n\u0003\r\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\t\t\n\n\f", new Object[]{"chainId_", "referenceBlockId_", "referenceBlockTime_", "currency_", "sender_", "recipient_", "memo_", "asset_", "privateKey_", "privateKeyType_"});
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

        public Asset getAsset() {
            Asset asset = this.asset_;
            if (asset == null) {
                return Asset.getDefaultInstance();
            }
            return asset;
        }

        public ByteString getChainId() {
            return this.chainId_;
        }

        public String getCurrency() {
            return this.currency_;
        }

        public ByteString getCurrencyBytes() {
            return ByteString.copyFromUtf8(this.currency_);
        }

        public String getMemo() {
            return this.memo_;
        }

        public ByteString getMemoBytes() {
            return ByteString.copyFromUtf8(this.memo_);
        }

        public ByteString getPrivateKey() {
            return this.privateKey_;
        }

        public KeyType getPrivateKeyType() {
            KeyType forNumber = KeyType.forNumber(this.privateKeyType_);
            if (forNumber == null) {
                return KeyType.UNRECOGNIZED;
            }
            return forNumber;
        }

        public int getPrivateKeyTypeValue() {
            return this.privateKeyType_;
        }

        public String getRecipient() {
            return this.recipient_;
        }

        public ByteString getRecipientBytes() {
            return ByteString.copyFromUtf8(this.recipient_);
        }

        public ByteString getReferenceBlockId() {
            return this.referenceBlockId_;
        }

        public int getReferenceBlockTime() {
            return this.referenceBlockTime_;
        }

        public String getSender() {
            return this.sender_;
        }

        public ByteString getSenderBytes() {
            return ByteString.copyFromUtf8(this.sender_);
        }

        public boolean hasAsset() {
            if (this.asset_ != null) {
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
        Asset getAsset();

        ByteString getChainId();

        String getCurrency();

        ByteString getCurrencyBytes();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getMemo();

        ByteString getMemoBytes();

        ByteString getPrivateKey();

        KeyType getPrivateKeyType();

        int getPrivateKeyTypeValue();

        String getRecipient();

        ByteString getRecipientBytes();

        ByteString getReferenceBlockId();

        int getReferenceBlockTime();

        String getSender();

        ByteString getSenderBytes();

        boolean hasAsset();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SigningOutput extends GeneratedMessageLite<SigningOutput, Builder> implements SigningOutputOrBuilder {
        /* access modifiers changed from: private */
        public static final SigningOutput DEFAULT_INSTANCE;
        public static final int ERROR_FIELD_NUMBER = 2;
        public static final int JSON_ENCODED_FIELD_NUMBER = 1;
        private static volatile im4<SigningOutput> PARSER;
        private int error_;
        private String jsonEncoded_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningOutput, Builder> implements SigningOutputOrBuilder {
            public /* synthetic */ Builder(C97381 r1) {
                this();
            }

            public Builder clearError() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearError();
                return this;
            }

            public Builder clearJsonEncoded() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearJsonEncoded();
                return this;
            }

            public Common.SigningError getError() {
                return ((SigningOutput) this.instance).getError();
            }

            public int getErrorValue() {
                return ((SigningOutput) this.instance).getErrorValue();
            }

            public String getJsonEncoded() {
                return ((SigningOutput) this.instance).getJsonEncoded();
            }

            public ByteString getJsonEncodedBytes() {
                return ((SigningOutput) this.instance).getJsonEncodedBytes();
            }

            public Builder setError(Common.SigningError signingError) {
                copyOnWrite();
                ((SigningOutput) this.instance).setError(signingError);
                return this;
            }

            public Builder setErrorValue(int i) {
                copyOnWrite();
                ((SigningOutput) this.instance).setErrorValue(i);
                return this;
            }

            public Builder setJsonEncoded(String str) {
                copyOnWrite();
                ((SigningOutput) this.instance).setJsonEncoded(str);
                return this;
            }

            public Builder setJsonEncodedBytes(ByteString byteString) {
                copyOnWrite();
                ((SigningOutput) this.instance).setJsonEncodedBytes(byteString);
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
        public void clearError() {
            this.error_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearJsonEncoded() {
            this.jsonEncoded_ = getDefaultInstance().getJsonEncoded();
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
        public void setError(Common.SigningError signingError) {
            this.error_ = signingError.getNumber();
        }

        /* access modifiers changed from: private */
        public void setErrorValue(int i) {
            this.error_ = i;
        }

        /* access modifiers changed from: private */
        public void setJsonEncoded(String str) {
            str.getClass();
            this.jsonEncoded_ = str;
        }

        /* access modifiers changed from: private */
        public void setJsonEncodedBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.jsonEncoded_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97381.f46551xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningOutput();
                case 2:
                    return new Builder((C97381) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"jsonEncoded_", "error_"});
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

        public Common.SigningError getError() {
            Common.SigningError forNumber = Common.SigningError.forNumber(this.error_);
            if (forNumber == null) {
                return Common.SigningError.UNRECOGNIZED;
            }
            return forNumber;
        }

        public int getErrorValue() {
            return this.error_;
        }

        public String getJsonEncoded() {
            return this.jsonEncoded_;
        }

        public ByteString getJsonEncodedBytes() {
            return ByteString.copyFromUtf8(this.jsonEncoded_);
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

        Common.SigningError getError();

        int getErrorValue();

        String getJsonEncoded();

        ByteString getJsonEncodedBytes();

        /* synthetic */ boolean isInitialized();
    }

    private EOS() {
    }

    public static void registerAllExtensions(C4987l lVar) {
    }
}
