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
import wallet.core.jni.proto.Binance;
import wallet.core.jni.proto.Bitcoin;
import wallet.core.jni.proto.Ethereum;

public final class THORChainSwap {

    /* renamed from: wallet.core.jni.proto.THORChainSwap$1 */
    public static /* synthetic */ class C97661 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f46580xa1df5c61;

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
                f46580xa1df5c61 = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f46580xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f46580xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f46580xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f46580xa1df5c61     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f46580xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f46580xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wallet.core.jni.proto.THORChainSwap.C97661.<clinit>():void");
        }
    }

    public static final class Asset extends GeneratedMessageLite<Asset, Builder> implements AssetOrBuilder {
        public static final int CHAIN_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final Asset DEFAULT_INSTANCE;
        private static volatile im4<Asset> PARSER = null;
        public static final int SYMBOL_FIELD_NUMBER = 2;
        public static final int TOKEN_ID_FIELD_NUMBER = 3;
        private int chain_;
        private String symbol_ = "";
        private String tokenId_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<Asset, Builder> implements AssetOrBuilder {
            public /* synthetic */ Builder(C97661 r1) {
                this();
            }

            public Builder clearChain() {
                copyOnWrite();
                ((Asset) this.instance).clearChain();
                return this;
            }

            public Builder clearSymbol() {
                copyOnWrite();
                ((Asset) this.instance).clearSymbol();
                return this;
            }

            public Builder clearTokenId() {
                copyOnWrite();
                ((Asset) this.instance).clearTokenId();
                return this;
            }

            public Chain getChain() {
                return ((Asset) this.instance).getChain();
            }

            public int getChainValue() {
                return ((Asset) this.instance).getChainValue();
            }

            public String getSymbol() {
                return ((Asset) this.instance).getSymbol();
            }

            public ByteString getSymbolBytes() {
                return ((Asset) this.instance).getSymbolBytes();
            }

            public String getTokenId() {
                return ((Asset) this.instance).getTokenId();
            }

            public ByteString getTokenIdBytes() {
                return ((Asset) this.instance).getTokenIdBytes();
            }

            public Builder setChain(Chain chain) {
                copyOnWrite();
                ((Asset) this.instance).setChain(chain);
                return this;
            }

            public Builder setChainValue(int i) {
                copyOnWrite();
                ((Asset) this.instance).setChainValue(i);
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

            public Builder setTokenId(String str) {
                copyOnWrite();
                ((Asset) this.instance).setTokenId(str);
                return this;
            }

            public Builder setTokenIdBytes(ByteString byteString) {
                copyOnWrite();
                ((Asset) this.instance).setTokenIdBytes(byteString);
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
        public void clearChain() {
            this.chain_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSymbol() {
            this.symbol_ = getDefaultInstance().getSymbol();
        }

        /* access modifiers changed from: private */
        public void clearTokenId() {
            this.tokenId_ = getDefaultInstance().getTokenId();
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
        public void setChain(Chain chain) {
            this.chain_ = chain.getNumber();
        }

        /* access modifiers changed from: private */
        public void setChainValue(int i) {
            this.chain_ = i;
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

        /* access modifiers changed from: private */
        public void setTokenId(String str) {
            str.getClass();
            this.tokenId_ = str;
        }

        /* access modifiers changed from: private */
        public void setTokenIdBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.tokenId_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97661.f46580xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Asset();
                case 2:
                    return new Builder((C97661) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ", new Object[]{"chain_", "symbol_", "tokenId_"});
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

        public Chain getChain() {
            Chain forNumber = Chain.forNumber(this.chain_);
            if (forNumber == null) {
                return Chain.UNRECOGNIZED;
            }
            return forNumber;
        }

        public int getChainValue() {
            return this.chain_;
        }

        public String getSymbol() {
            return this.symbol_;
        }

        public ByteString getSymbolBytes() {
            return ByteString.copyFromUtf8(this.symbol_);
        }

        public String getTokenId() {
            return this.tokenId_;
        }

        public ByteString getTokenIdBytes() {
            return ByteString.copyFromUtf8(this.tokenId_);
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
        Chain getChain();

        int getChainValue();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getSymbol();

        ByteString getSymbolBytes();

        String getTokenId();

        ByteString getTokenIdBytes();

        /* synthetic */ boolean isInitialized();
    }

    public enum Chain implements C5011t.C5014c {
        THOR(0),
        BTC(1),
        ETH(2),
        BNB(3),
        UNRECOGNIZED(-1);
        
        public static final int BNB_VALUE = 3;
        public static final int BTC_VALUE = 1;
        public static final int ETH_VALUE = 2;
        public static final int THOR_VALUE = 0;
        private static final C5011t.C5015d<Chain> internalValueMap = null;
        private final int value;

        public static final class ChainVerifier implements C5011t.C5016e {
            public static final C5011t.C5016e INSTANCE = null;

            static {
                INSTANCE = new ChainVerifier();
            }

            private ChainVerifier() {
            }

            public boolean isInRange(int i) {
                if (Chain.forNumber(i) != null) {
                    return true;
                }
                return false;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C5011t.C5015d<Chain>() {
                public Chain findValueByNumber(int i) {
                    return Chain.forNumber(i);
                }
            };
        }

        private Chain(int i) {
            this.value = i;
        }

        public static Chain forNumber(int i) {
            if (i == 0) {
                return THOR;
            }
            if (i == 1) {
                return BTC;
            }
            if (i == 2) {
                return ETH;
            }
            if (i != 3) {
                return null;
            }
            return BNB;
        }

        public static C5011t.C5015d<Chain> internalGetValueMap() {
            return internalValueMap;
        }

        public static C5011t.C5016e internalGetVerifier() {
            return ChainVerifier.INSTANCE;
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static Chain valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class Error extends GeneratedMessageLite<Error, Builder> implements ErrorOrBuilder {
        public static final int CODE_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final Error DEFAULT_INSTANCE;
        public static final int MESSAGE_FIELD_NUMBER = 2;
        private static volatile im4<Error> PARSER;
        private int code_;
        private String message_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<Error, Builder> implements ErrorOrBuilder {
            public /* synthetic */ Builder(C97661 r1) {
                this();
            }

            public Builder clearCode() {
                copyOnWrite();
                ((Error) this.instance).clearCode();
                return this;
            }

            public Builder clearMessage() {
                copyOnWrite();
                ((Error) this.instance).clearMessage();
                return this;
            }

            public ErrorCode getCode() {
                return ((Error) this.instance).getCode();
            }

            public int getCodeValue() {
                return ((Error) this.instance).getCodeValue();
            }

            public String getMessage() {
                return ((Error) this.instance).getMessage();
            }

            public ByteString getMessageBytes() {
                return ((Error) this.instance).getMessageBytes();
            }

            public Builder setCode(ErrorCode errorCode) {
                copyOnWrite();
                ((Error) this.instance).setCode(errorCode);
                return this;
            }

            public Builder setCodeValue(int i) {
                copyOnWrite();
                ((Error) this.instance).setCodeValue(i);
                return this;
            }

            public Builder setMessage(String str) {
                copyOnWrite();
                ((Error) this.instance).setMessage(str);
                return this;
            }

            public Builder setMessageBytes(ByteString byteString) {
                copyOnWrite();
                ((Error) this.instance).setMessageBytes(byteString);
                return this;
            }

            private Builder() {
                super(Error.DEFAULT_INSTANCE);
            }
        }

        static {
            Error error = new Error();
            DEFAULT_INSTANCE = error;
            GeneratedMessageLite.registerDefaultInstance(Error.class, error);
        }

        private Error() {
        }

        /* access modifiers changed from: private */
        public void clearCode() {
            this.code_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearMessage() {
            this.message_ = getDefaultInstance().getMessage();
        }

        public static Error getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Error parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Error) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Error parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<Error> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setCode(ErrorCode errorCode) {
            this.code_ = errorCode.getNumber();
        }

        /* access modifiers changed from: private */
        public void setCodeValue(int i) {
            this.code_ = i;
        }

        /* access modifiers changed from: private */
        public void setMessage(String str) {
            str.getClass();
            this.message_ = str;
        }

        /* access modifiers changed from: private */
        public void setMessageBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.message_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97661.f46580xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Error();
                case 2:
                    return new Builder((C97661) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"code_", "message_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<Error> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (Error.class) {
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

        public ErrorCode getCode() {
            ErrorCode forNumber = ErrorCode.forNumber(this.code_);
            if (forNumber == null) {
                return ErrorCode.UNRECOGNIZED;
            }
            return forNumber;
        }

        public int getCodeValue() {
            return this.code_;
        }

        public String getMessage() {
            return this.message_;
        }

        public ByteString getMessageBytes() {
            return ByteString.copyFromUtf8(this.message_);
        }

        public static Builder newBuilder(Error error) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(error);
        }

        public static Error parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Error) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Error parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static Error parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Error parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static Error parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Error parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static Error parseFrom(InputStream inputStream) throws IOException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Error parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Error parseFrom(C4969g gVar) throws IOException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static Error parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public enum ErrorCode implements C5011t.C5014c {
        OK(0),
        Error_general(1),
        Error_Input_proto_deserialization(2),
        Error_Unsupported_from_chain(13),
        Error_Unsupported_to_chain(14),
        Error_Invalid_from_address(15),
        Error_Invalid_to_address(16),
        Error_Invalid_vault_address(21),
        Error_Invalid_router_address(22),
        UNRECOGNIZED(-1);
        
        public static final int Error_Input_proto_deserialization_VALUE = 2;
        public static final int Error_Invalid_from_address_VALUE = 15;
        public static final int Error_Invalid_router_address_VALUE = 22;
        public static final int Error_Invalid_to_address_VALUE = 16;
        public static final int Error_Invalid_vault_address_VALUE = 21;
        public static final int Error_Unsupported_from_chain_VALUE = 13;
        public static final int Error_Unsupported_to_chain_VALUE = 14;
        public static final int Error_general_VALUE = 1;
        public static final int OK_VALUE = 0;
        private static final C5011t.C5015d<ErrorCode> internalValueMap = null;
        private final int value;

        public static final class ErrorCodeVerifier implements C5011t.C5016e {
            public static final C5011t.C5016e INSTANCE = null;

            static {
                INSTANCE = new ErrorCodeVerifier();
            }

            private ErrorCodeVerifier() {
            }

            public boolean isInRange(int i) {
                if (ErrorCode.forNumber(i) != null) {
                    return true;
                }
                return false;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C5011t.C5015d<ErrorCode>() {
                public ErrorCode findValueByNumber(int i) {
                    return ErrorCode.forNumber(i);
                }
            };
        }

        private ErrorCode(int i) {
            this.value = i;
        }

        public static ErrorCode forNumber(int i) {
            if (i == 0) {
                return OK;
            }
            if (i == 1) {
                return Error_general;
            }
            if (i == 2) {
                return Error_Input_proto_deserialization;
            }
            if (i == 21) {
                return Error_Invalid_vault_address;
            }
            if (i == 22) {
                return Error_Invalid_router_address;
            }
            switch (i) {
                case 13:
                    return Error_Unsupported_from_chain;
                case 14:
                    return Error_Unsupported_to_chain;
                case 15:
                    return Error_Invalid_from_address;
                case 16:
                    return Error_Invalid_to_address;
                default:
                    return null;
            }
        }

        public static C5011t.C5015d<ErrorCode> internalGetValueMap() {
            return internalValueMap;
        }

        public static C5011t.C5016e internalGetVerifier() {
            return ErrorCodeVerifier.INSTANCE;
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static ErrorCode valueOf(int i) {
            return forNumber(i);
        }
    }

    public interface ErrorOrBuilder extends qu3 {
        ErrorCode getCode();

        int getCodeValue();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getMessage();

        ByteString getMessageBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SwapInput extends GeneratedMessageLite<SwapInput, Builder> implements SwapInputOrBuilder {
        public static final int AFFILIATE_FEE_ADDRESS_FIELD_NUMBER = 9;
        public static final int AFFILIATE_FEE_RATE_BP_FIELD_NUMBER = 10;
        /* access modifiers changed from: private */
        public static final SwapInput DEFAULT_INSTANCE;
        public static final int EXTRA_MEMO_FIELD_NUMBER = 11;
        public static final int FROM_ADDRESS_FIELD_NUMBER = 2;
        public static final int FROM_AMOUNT_FIELD_NUMBER = 7;
        public static final int FROM_ASSET_FIELD_NUMBER = 1;
        private static volatile im4<SwapInput> PARSER = null;
        public static final int ROUTER_ADDRESS_FIELD_NUMBER = 6;
        public static final int TO_ADDRESS_FIELD_NUMBER = 4;
        public static final int TO_AMOUNT_LIMIT_FIELD_NUMBER = 8;
        public static final int TO_ASSET_FIELD_NUMBER = 3;
        public static final int VAULT_ADDRESS_FIELD_NUMBER = 5;
        private String affiliateFeeAddress_ = "";
        private String affiliateFeeRateBp_ = "";
        private String extraMemo_ = "";
        private String fromAddress_ = "";
        private String fromAmount_ = "";
        private Asset fromAsset_;
        private String routerAddress_ = "";
        private String toAddress_ = "";
        private String toAmountLimit_ = "";
        private Asset toAsset_;
        private String vaultAddress_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<SwapInput, Builder> implements SwapInputOrBuilder {
            public /* synthetic */ Builder(C97661 r1) {
                this();
            }

            public Builder clearAffiliateFeeAddress() {
                copyOnWrite();
                ((SwapInput) this.instance).clearAffiliateFeeAddress();
                return this;
            }

            public Builder clearAffiliateFeeRateBp() {
                copyOnWrite();
                ((SwapInput) this.instance).clearAffiliateFeeRateBp();
                return this;
            }

            public Builder clearExtraMemo() {
                copyOnWrite();
                ((SwapInput) this.instance).clearExtraMemo();
                return this;
            }

            public Builder clearFromAddress() {
                copyOnWrite();
                ((SwapInput) this.instance).clearFromAddress();
                return this;
            }

            public Builder clearFromAmount() {
                copyOnWrite();
                ((SwapInput) this.instance).clearFromAmount();
                return this;
            }

            public Builder clearFromAsset() {
                copyOnWrite();
                ((SwapInput) this.instance).clearFromAsset();
                return this;
            }

            public Builder clearRouterAddress() {
                copyOnWrite();
                ((SwapInput) this.instance).clearRouterAddress();
                return this;
            }

            public Builder clearToAddress() {
                copyOnWrite();
                ((SwapInput) this.instance).clearToAddress();
                return this;
            }

            public Builder clearToAmountLimit() {
                copyOnWrite();
                ((SwapInput) this.instance).clearToAmountLimit();
                return this;
            }

            public Builder clearToAsset() {
                copyOnWrite();
                ((SwapInput) this.instance).clearToAsset();
                return this;
            }

            public Builder clearVaultAddress() {
                copyOnWrite();
                ((SwapInput) this.instance).clearVaultAddress();
                return this;
            }

            public String getAffiliateFeeAddress() {
                return ((SwapInput) this.instance).getAffiliateFeeAddress();
            }

            public ByteString getAffiliateFeeAddressBytes() {
                return ((SwapInput) this.instance).getAffiliateFeeAddressBytes();
            }

            public String getAffiliateFeeRateBp() {
                return ((SwapInput) this.instance).getAffiliateFeeRateBp();
            }

            public ByteString getAffiliateFeeRateBpBytes() {
                return ((SwapInput) this.instance).getAffiliateFeeRateBpBytes();
            }

            public String getExtraMemo() {
                return ((SwapInput) this.instance).getExtraMemo();
            }

            public ByteString getExtraMemoBytes() {
                return ((SwapInput) this.instance).getExtraMemoBytes();
            }

            public String getFromAddress() {
                return ((SwapInput) this.instance).getFromAddress();
            }

            public ByteString getFromAddressBytes() {
                return ((SwapInput) this.instance).getFromAddressBytes();
            }

            public String getFromAmount() {
                return ((SwapInput) this.instance).getFromAmount();
            }

            public ByteString getFromAmountBytes() {
                return ((SwapInput) this.instance).getFromAmountBytes();
            }

            public Asset getFromAsset() {
                return ((SwapInput) this.instance).getFromAsset();
            }

            public String getRouterAddress() {
                return ((SwapInput) this.instance).getRouterAddress();
            }

            public ByteString getRouterAddressBytes() {
                return ((SwapInput) this.instance).getRouterAddressBytes();
            }

            public String getToAddress() {
                return ((SwapInput) this.instance).getToAddress();
            }

            public ByteString getToAddressBytes() {
                return ((SwapInput) this.instance).getToAddressBytes();
            }

            public String getToAmountLimit() {
                return ((SwapInput) this.instance).getToAmountLimit();
            }

            public ByteString getToAmountLimitBytes() {
                return ((SwapInput) this.instance).getToAmountLimitBytes();
            }

            public Asset getToAsset() {
                return ((SwapInput) this.instance).getToAsset();
            }

            public String getVaultAddress() {
                return ((SwapInput) this.instance).getVaultAddress();
            }

            public ByteString getVaultAddressBytes() {
                return ((SwapInput) this.instance).getVaultAddressBytes();
            }

            public boolean hasFromAsset() {
                return ((SwapInput) this.instance).hasFromAsset();
            }

            public boolean hasToAsset() {
                return ((SwapInput) this.instance).hasToAsset();
            }

            public Builder mergeFromAsset(Asset asset) {
                copyOnWrite();
                ((SwapInput) this.instance).mergeFromAsset(asset);
                return this;
            }

            public Builder mergeToAsset(Asset asset) {
                copyOnWrite();
                ((SwapInput) this.instance).mergeToAsset(asset);
                return this;
            }

            public Builder setAffiliateFeeAddress(String str) {
                copyOnWrite();
                ((SwapInput) this.instance).setAffiliateFeeAddress(str);
                return this;
            }

            public Builder setAffiliateFeeAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((SwapInput) this.instance).setAffiliateFeeAddressBytes(byteString);
                return this;
            }

            public Builder setAffiliateFeeRateBp(String str) {
                copyOnWrite();
                ((SwapInput) this.instance).setAffiliateFeeRateBp(str);
                return this;
            }

            public Builder setAffiliateFeeRateBpBytes(ByteString byteString) {
                copyOnWrite();
                ((SwapInput) this.instance).setAffiliateFeeRateBpBytes(byteString);
                return this;
            }

            public Builder setExtraMemo(String str) {
                copyOnWrite();
                ((SwapInput) this.instance).setExtraMemo(str);
                return this;
            }

            public Builder setExtraMemoBytes(ByteString byteString) {
                copyOnWrite();
                ((SwapInput) this.instance).setExtraMemoBytes(byteString);
                return this;
            }

            public Builder setFromAddress(String str) {
                copyOnWrite();
                ((SwapInput) this.instance).setFromAddress(str);
                return this;
            }

            public Builder setFromAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((SwapInput) this.instance).setFromAddressBytes(byteString);
                return this;
            }

            public Builder setFromAmount(String str) {
                copyOnWrite();
                ((SwapInput) this.instance).setFromAmount(str);
                return this;
            }

            public Builder setFromAmountBytes(ByteString byteString) {
                copyOnWrite();
                ((SwapInput) this.instance).setFromAmountBytes(byteString);
                return this;
            }

            public Builder setFromAsset(Asset asset) {
                copyOnWrite();
                ((SwapInput) this.instance).setFromAsset(asset);
                return this;
            }

            public Builder setRouterAddress(String str) {
                copyOnWrite();
                ((SwapInput) this.instance).setRouterAddress(str);
                return this;
            }

            public Builder setRouterAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((SwapInput) this.instance).setRouterAddressBytes(byteString);
                return this;
            }

            public Builder setToAddress(String str) {
                copyOnWrite();
                ((SwapInput) this.instance).setToAddress(str);
                return this;
            }

            public Builder setToAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((SwapInput) this.instance).setToAddressBytes(byteString);
                return this;
            }

            public Builder setToAmountLimit(String str) {
                copyOnWrite();
                ((SwapInput) this.instance).setToAmountLimit(str);
                return this;
            }

            public Builder setToAmountLimitBytes(ByteString byteString) {
                copyOnWrite();
                ((SwapInput) this.instance).setToAmountLimitBytes(byteString);
                return this;
            }

            public Builder setToAsset(Asset asset) {
                copyOnWrite();
                ((SwapInput) this.instance).setToAsset(asset);
                return this;
            }

            public Builder setVaultAddress(String str) {
                copyOnWrite();
                ((SwapInput) this.instance).setVaultAddress(str);
                return this;
            }

            public Builder setVaultAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((SwapInput) this.instance).setVaultAddressBytes(byteString);
                return this;
            }

            private Builder() {
                super(SwapInput.DEFAULT_INSTANCE);
            }

            public Builder setFromAsset(Asset.Builder builder) {
                copyOnWrite();
                ((SwapInput) this.instance).setFromAsset((Asset) builder.build());
                return this;
            }

            public Builder setToAsset(Asset.Builder builder) {
                copyOnWrite();
                ((SwapInput) this.instance).setToAsset((Asset) builder.build());
                return this;
            }
        }

        static {
            SwapInput swapInput = new SwapInput();
            DEFAULT_INSTANCE = swapInput;
            GeneratedMessageLite.registerDefaultInstance(SwapInput.class, swapInput);
        }

        private SwapInput() {
        }

        /* access modifiers changed from: private */
        public void clearAffiliateFeeAddress() {
            this.affiliateFeeAddress_ = getDefaultInstance().getAffiliateFeeAddress();
        }

        /* access modifiers changed from: private */
        public void clearAffiliateFeeRateBp() {
            this.affiliateFeeRateBp_ = getDefaultInstance().getAffiliateFeeRateBp();
        }

        /* access modifiers changed from: private */
        public void clearExtraMemo() {
            this.extraMemo_ = getDefaultInstance().getExtraMemo();
        }

        /* access modifiers changed from: private */
        public void clearFromAddress() {
            this.fromAddress_ = getDefaultInstance().getFromAddress();
        }

        /* access modifiers changed from: private */
        public void clearFromAmount() {
            this.fromAmount_ = getDefaultInstance().getFromAmount();
        }

        /* access modifiers changed from: private */
        public void clearFromAsset() {
            this.fromAsset_ = null;
        }

        /* access modifiers changed from: private */
        public void clearRouterAddress() {
            this.routerAddress_ = getDefaultInstance().getRouterAddress();
        }

        /* access modifiers changed from: private */
        public void clearToAddress() {
            this.toAddress_ = getDefaultInstance().getToAddress();
        }

        /* access modifiers changed from: private */
        public void clearToAmountLimit() {
            this.toAmountLimit_ = getDefaultInstance().getToAmountLimit();
        }

        /* access modifiers changed from: private */
        public void clearToAsset() {
            this.toAsset_ = null;
        }

        /* access modifiers changed from: private */
        public void clearVaultAddress() {
            this.vaultAddress_ = getDefaultInstance().getVaultAddress();
        }

        public static SwapInput getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeFromAsset(Asset asset) {
            asset.getClass();
            Asset asset2 = this.fromAsset_;
            if (asset2 == null || asset2 == Asset.getDefaultInstance()) {
                this.fromAsset_ = asset;
            } else {
                this.fromAsset_ = (Asset) ((Asset.Builder) Asset.newBuilder(this.fromAsset_).mergeFrom(asset)).buildPartial();
            }
        }

        /* access modifiers changed from: private */
        public void mergeToAsset(Asset asset) {
            asset.getClass();
            Asset asset2 = this.toAsset_;
            if (asset2 == null || asset2 == Asset.getDefaultInstance()) {
                this.toAsset_ = asset;
            } else {
                this.toAsset_ = (Asset) ((Asset.Builder) Asset.newBuilder(this.toAsset_).mergeFrom(asset)).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static SwapInput parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SwapInput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SwapInput parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SwapInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<SwapInput> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAffiliateFeeAddress(String str) {
            str.getClass();
            this.affiliateFeeAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setAffiliateFeeAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.affiliateFeeAddress_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setAffiliateFeeRateBp(String str) {
            str.getClass();
            this.affiliateFeeRateBp_ = str;
        }

        /* access modifiers changed from: private */
        public void setAffiliateFeeRateBpBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.affiliateFeeRateBp_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setExtraMemo(String str) {
            str.getClass();
            this.extraMemo_ = str;
        }

        /* access modifiers changed from: private */
        public void setExtraMemoBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.extraMemo_ = byteString.toStringUtf8();
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
        public void setFromAmount(String str) {
            str.getClass();
            this.fromAmount_ = str;
        }

        /* access modifiers changed from: private */
        public void setFromAmountBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.fromAmount_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setFromAsset(Asset asset) {
            asset.getClass();
            this.fromAsset_ = asset;
        }

        /* access modifiers changed from: private */
        public void setRouterAddress(String str) {
            str.getClass();
            this.routerAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setRouterAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.routerAddress_ = byteString.toStringUtf8();
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
        public void setToAmountLimit(String str) {
            str.getClass();
            this.toAmountLimit_ = str;
        }

        /* access modifiers changed from: private */
        public void setToAmountLimitBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.toAmountLimit_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setToAsset(Asset asset) {
            asset.getClass();
            this.toAsset_ = asset;
        }

        /* access modifiers changed from: private */
        public void setVaultAddress(String str) {
            str.getClass();
            this.vaultAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setVaultAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.vaultAddress_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97661.f46580xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SwapInput();
                case 2:
                    return new Builder((C97661) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003\t\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ", new Object[]{"fromAsset_", "fromAddress_", "toAsset_", "toAddress_", "vaultAddress_", "routerAddress_", "fromAmount_", "toAmountLimit_", "affiliateFeeAddress_", "affiliateFeeRateBp_", "extraMemo_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<SwapInput> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (SwapInput.class) {
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

        public String getAffiliateFeeAddress() {
            return this.affiliateFeeAddress_;
        }

        public ByteString getAffiliateFeeAddressBytes() {
            return ByteString.copyFromUtf8(this.affiliateFeeAddress_);
        }

        public String getAffiliateFeeRateBp() {
            return this.affiliateFeeRateBp_;
        }

        public ByteString getAffiliateFeeRateBpBytes() {
            return ByteString.copyFromUtf8(this.affiliateFeeRateBp_);
        }

        public String getExtraMemo() {
            return this.extraMemo_;
        }

        public ByteString getExtraMemoBytes() {
            return ByteString.copyFromUtf8(this.extraMemo_);
        }

        public String getFromAddress() {
            return this.fromAddress_;
        }

        public ByteString getFromAddressBytes() {
            return ByteString.copyFromUtf8(this.fromAddress_);
        }

        public String getFromAmount() {
            return this.fromAmount_;
        }

        public ByteString getFromAmountBytes() {
            return ByteString.copyFromUtf8(this.fromAmount_);
        }

        public Asset getFromAsset() {
            Asset asset = this.fromAsset_;
            if (asset == null) {
                return Asset.getDefaultInstance();
            }
            return asset;
        }

        public String getRouterAddress() {
            return this.routerAddress_;
        }

        public ByteString getRouterAddressBytes() {
            return ByteString.copyFromUtf8(this.routerAddress_);
        }

        public String getToAddress() {
            return this.toAddress_;
        }

        public ByteString getToAddressBytes() {
            return ByteString.copyFromUtf8(this.toAddress_);
        }

        public String getToAmountLimit() {
            return this.toAmountLimit_;
        }

        public ByteString getToAmountLimitBytes() {
            return ByteString.copyFromUtf8(this.toAmountLimit_);
        }

        public Asset getToAsset() {
            Asset asset = this.toAsset_;
            if (asset == null) {
                return Asset.getDefaultInstance();
            }
            return asset;
        }

        public String getVaultAddress() {
            return this.vaultAddress_;
        }

        public ByteString getVaultAddressBytes() {
            return ByteString.copyFromUtf8(this.vaultAddress_);
        }

        public boolean hasFromAsset() {
            if (this.fromAsset_ != null) {
                return true;
            }
            return false;
        }

        public boolean hasToAsset() {
            if (this.toAsset_ != null) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(SwapInput swapInput) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(swapInput);
        }

        public static SwapInput parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (SwapInput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static SwapInput parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (SwapInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static SwapInput parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SwapInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SwapInput parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (SwapInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static SwapInput parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SwapInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SwapInput parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (SwapInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static SwapInput parseFrom(InputStream inputStream) throws IOException {
            return (SwapInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SwapInput parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (SwapInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static SwapInput parseFrom(C4969g gVar) throws IOException {
            return (SwapInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static SwapInput parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (SwapInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface SwapInputOrBuilder extends qu3 {
        String getAffiliateFeeAddress();

        ByteString getAffiliateFeeAddressBytes();

        String getAffiliateFeeRateBp();

        ByteString getAffiliateFeeRateBpBytes();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getExtraMemo();

        ByteString getExtraMemoBytes();

        String getFromAddress();

        ByteString getFromAddressBytes();

        String getFromAmount();

        ByteString getFromAmountBytes();

        Asset getFromAsset();

        String getRouterAddress();

        ByteString getRouterAddressBytes();

        String getToAddress();

        ByteString getToAddressBytes();

        String getToAmountLimit();

        ByteString getToAmountLimitBytes();

        Asset getToAsset();

        String getVaultAddress();

        ByteString getVaultAddressBytes();

        boolean hasFromAsset();

        boolean hasToAsset();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SwapOutput extends GeneratedMessageLite<SwapOutput, Builder> implements SwapOutputOrBuilder {
        public static final int BINANCE_FIELD_NUMBER = 6;
        public static final int BITCOIN_FIELD_NUMBER = 4;
        /* access modifiers changed from: private */
        public static final SwapOutput DEFAULT_INSTANCE;
        public static final int ERROR_FIELD_NUMBER = 3;
        public static final int ETHEREUM_FIELD_NUMBER = 5;
        public static final int FROM_CHAIN_FIELD_NUMBER = 1;
        private static volatile im4<SwapOutput> PARSER = null;
        public static final int TO_CHAIN_FIELD_NUMBER = 2;
        private Error error_;
        private int fromChain_;
        private int signingInputOneofCase_ = 0;
        private Object signingInputOneof_;
        private int toChain_;

        public static final class Builder extends GeneratedMessageLite.C4930a<SwapOutput, Builder> implements SwapOutputOrBuilder {
            public /* synthetic */ Builder(C97661 r1) {
                this();
            }

            public Builder clearBinance() {
                copyOnWrite();
                ((SwapOutput) this.instance).clearBinance();
                return this;
            }

            public Builder clearBitcoin() {
                copyOnWrite();
                ((SwapOutput) this.instance).clearBitcoin();
                return this;
            }

            public Builder clearError() {
                copyOnWrite();
                ((SwapOutput) this.instance).clearError();
                return this;
            }

            public Builder clearEthereum() {
                copyOnWrite();
                ((SwapOutput) this.instance).clearEthereum();
                return this;
            }

            public Builder clearFromChain() {
                copyOnWrite();
                ((SwapOutput) this.instance).clearFromChain();
                return this;
            }

            public Builder clearSigningInputOneof() {
                copyOnWrite();
                ((SwapOutput) this.instance).clearSigningInputOneof();
                return this;
            }

            public Builder clearToChain() {
                copyOnWrite();
                ((SwapOutput) this.instance).clearToChain();
                return this;
            }

            public Binance.SigningInput getBinance() {
                return ((SwapOutput) this.instance).getBinance();
            }

            public Bitcoin.SigningInput getBitcoin() {
                return ((SwapOutput) this.instance).getBitcoin();
            }

            public Error getError() {
                return ((SwapOutput) this.instance).getError();
            }

            public Ethereum.SigningInput getEthereum() {
                return ((SwapOutput) this.instance).getEthereum();
            }

            public Chain getFromChain() {
                return ((SwapOutput) this.instance).getFromChain();
            }

            public int getFromChainValue() {
                return ((SwapOutput) this.instance).getFromChainValue();
            }

            public SigningInputOneofCase getSigningInputOneofCase() {
                return ((SwapOutput) this.instance).getSigningInputOneofCase();
            }

            public Chain getToChain() {
                return ((SwapOutput) this.instance).getToChain();
            }

            public int getToChainValue() {
                return ((SwapOutput) this.instance).getToChainValue();
            }

            public boolean hasBinance() {
                return ((SwapOutput) this.instance).hasBinance();
            }

            public boolean hasBitcoin() {
                return ((SwapOutput) this.instance).hasBitcoin();
            }

            public boolean hasError() {
                return ((SwapOutput) this.instance).hasError();
            }

            public boolean hasEthereum() {
                return ((SwapOutput) this.instance).hasEthereum();
            }

            public Builder mergeBinance(Binance.SigningInput signingInput) {
                copyOnWrite();
                ((SwapOutput) this.instance).mergeBinance(signingInput);
                return this;
            }

            public Builder mergeBitcoin(Bitcoin.SigningInput signingInput) {
                copyOnWrite();
                ((SwapOutput) this.instance).mergeBitcoin(signingInput);
                return this;
            }

            public Builder mergeError(Error error) {
                copyOnWrite();
                ((SwapOutput) this.instance).mergeError(error);
                return this;
            }

            public Builder mergeEthereum(Ethereum.SigningInput signingInput) {
                copyOnWrite();
                ((SwapOutput) this.instance).mergeEthereum(signingInput);
                return this;
            }

            public Builder setBinance(Binance.SigningInput signingInput) {
                copyOnWrite();
                ((SwapOutput) this.instance).setBinance(signingInput);
                return this;
            }

            public Builder setBitcoin(Bitcoin.SigningInput signingInput) {
                copyOnWrite();
                ((SwapOutput) this.instance).setBitcoin(signingInput);
                return this;
            }

            public Builder setError(Error error) {
                copyOnWrite();
                ((SwapOutput) this.instance).setError(error);
                return this;
            }

            public Builder setEthereum(Ethereum.SigningInput signingInput) {
                copyOnWrite();
                ((SwapOutput) this.instance).setEthereum(signingInput);
                return this;
            }

            public Builder setFromChain(Chain chain) {
                copyOnWrite();
                ((SwapOutput) this.instance).setFromChain(chain);
                return this;
            }

            public Builder setFromChainValue(int i) {
                copyOnWrite();
                ((SwapOutput) this.instance).setFromChainValue(i);
                return this;
            }

            public Builder setToChain(Chain chain) {
                copyOnWrite();
                ((SwapOutput) this.instance).setToChain(chain);
                return this;
            }

            public Builder setToChainValue(int i) {
                copyOnWrite();
                ((SwapOutput) this.instance).setToChainValue(i);
                return this;
            }

            private Builder() {
                super(SwapOutput.DEFAULT_INSTANCE);
            }

            public Builder setBinance(Binance.SigningInput.Builder builder) {
                copyOnWrite();
                ((SwapOutput) this.instance).setBinance((Binance.SigningInput) builder.build());
                return this;
            }

            public Builder setBitcoin(Bitcoin.SigningInput.Builder builder) {
                copyOnWrite();
                ((SwapOutput) this.instance).setBitcoin((Bitcoin.SigningInput) builder.build());
                return this;
            }

            public Builder setError(Error.Builder builder) {
                copyOnWrite();
                ((SwapOutput) this.instance).setError((Error) builder.build());
                return this;
            }

            public Builder setEthereum(Ethereum.SigningInput.Builder builder) {
                copyOnWrite();
                ((SwapOutput) this.instance).setEthereum((Ethereum.SigningInput) builder.build());
                return this;
            }
        }

        public enum SigningInputOneofCase {
            BITCOIN(4),
            ETHEREUM(5),
            BINANCE(6),
            SIGNINGINPUTONEOF_NOT_SET(0);
            
            private final int value;

            private SigningInputOneofCase(int i) {
                this.value = i;
            }

            public static SigningInputOneofCase forNumber(int i) {
                if (i == 0) {
                    return SIGNINGINPUTONEOF_NOT_SET;
                }
                if (i == 4) {
                    return BITCOIN;
                }
                if (i == 5) {
                    return ETHEREUM;
                }
                if (i != 6) {
                    return null;
                }
                return BINANCE;
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static SigningInputOneofCase valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            SwapOutput swapOutput = new SwapOutput();
            DEFAULT_INSTANCE = swapOutput;
            GeneratedMessageLite.registerDefaultInstance(SwapOutput.class, swapOutput);
        }

        private SwapOutput() {
        }

        /* access modifiers changed from: private */
        public void clearBinance() {
            if (this.signingInputOneofCase_ == 6) {
                this.signingInputOneofCase_ = 0;
                this.signingInputOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearBitcoin() {
            if (this.signingInputOneofCase_ == 4) {
                this.signingInputOneofCase_ = 0;
                this.signingInputOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearError() {
            this.error_ = null;
        }

        /* access modifiers changed from: private */
        public void clearEthereum() {
            if (this.signingInputOneofCase_ == 5) {
                this.signingInputOneofCase_ = 0;
                this.signingInputOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearFromChain() {
            this.fromChain_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSigningInputOneof() {
            this.signingInputOneofCase_ = 0;
            this.signingInputOneof_ = null;
        }

        /* access modifiers changed from: private */
        public void clearToChain() {
            this.toChain_ = 0;
        }

        public static SwapOutput getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeBinance(Binance.SigningInput signingInput) {
            signingInput.getClass();
            if (this.signingInputOneofCase_ != 6 || this.signingInputOneof_ == Binance.SigningInput.getDefaultInstance()) {
                this.signingInputOneof_ = signingInput;
            } else {
                this.signingInputOneof_ = ((Binance.SigningInput.Builder) Binance.SigningInput.newBuilder((Binance.SigningInput) this.signingInputOneof_).mergeFrom(signingInput)).buildPartial();
            }
            this.signingInputOneofCase_ = 6;
        }

        /* access modifiers changed from: private */
        public void mergeBitcoin(Bitcoin.SigningInput signingInput) {
            signingInput.getClass();
            if (this.signingInputOneofCase_ != 4 || this.signingInputOneof_ == Bitcoin.SigningInput.getDefaultInstance()) {
                this.signingInputOneof_ = signingInput;
            } else {
                this.signingInputOneof_ = ((Bitcoin.SigningInput.Builder) Bitcoin.SigningInput.newBuilder((Bitcoin.SigningInput) this.signingInputOneof_).mergeFrom(signingInput)).buildPartial();
            }
            this.signingInputOneofCase_ = 4;
        }

        /* access modifiers changed from: private */
        public void mergeError(Error error) {
            error.getClass();
            Error error2 = this.error_;
            if (error2 == null || error2 == Error.getDefaultInstance()) {
                this.error_ = error;
            } else {
                this.error_ = (Error) ((Error.Builder) Error.newBuilder(this.error_).mergeFrom(error)).buildPartial();
            }
        }

        /* access modifiers changed from: private */
        public void mergeEthereum(Ethereum.SigningInput signingInput) {
            signingInput.getClass();
            if (this.signingInputOneofCase_ != 5 || this.signingInputOneof_ == Ethereum.SigningInput.getDefaultInstance()) {
                this.signingInputOneof_ = signingInput;
            } else {
                this.signingInputOneof_ = ((Ethereum.SigningInput.Builder) Ethereum.SigningInput.newBuilder((Ethereum.SigningInput) this.signingInputOneof_).mergeFrom(signingInput)).buildPartial();
            }
            this.signingInputOneofCase_ = 5;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static SwapOutput parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SwapOutput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SwapOutput parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SwapOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<SwapOutput> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setBinance(Binance.SigningInput signingInput) {
            signingInput.getClass();
            this.signingInputOneof_ = signingInput;
            this.signingInputOneofCase_ = 6;
        }

        /* access modifiers changed from: private */
        public void setBitcoin(Bitcoin.SigningInput signingInput) {
            signingInput.getClass();
            this.signingInputOneof_ = signingInput;
            this.signingInputOneofCase_ = 4;
        }

        /* access modifiers changed from: private */
        public void setError(Error error) {
            error.getClass();
            this.error_ = error;
        }

        /* access modifiers changed from: private */
        public void setEthereum(Ethereum.SigningInput signingInput) {
            signingInput.getClass();
            this.signingInputOneof_ = signingInput;
            this.signingInputOneofCase_ = 5;
        }

        /* access modifiers changed from: private */
        public void setFromChain(Chain chain) {
            this.fromChain_ = chain.getNumber();
        }

        /* access modifiers changed from: private */
        public void setFromChainValue(int i) {
            this.fromChain_ = i;
        }

        /* access modifiers changed from: private */
        public void setToChain(Chain chain) {
            this.toChain_ = chain.getNumber();
        }

        /* access modifiers changed from: private */
        public void setToChainValue(int i) {
            this.toChain_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97661.f46580xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SwapOutput();
                case 2:
                    return new Builder((C97661) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0002\f\u0003\t\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"signingInputOneof_", "signingInputOneofCase_", "fromChain_", "toChain_", "error_", Bitcoin.SigningInput.class, Ethereum.SigningInput.class, Binance.SigningInput.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<SwapOutput> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (SwapOutput.class) {
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

        public Binance.SigningInput getBinance() {
            if (this.signingInputOneofCase_ == 6) {
                return (Binance.SigningInput) this.signingInputOneof_;
            }
            return Binance.SigningInput.getDefaultInstance();
        }

        public Bitcoin.SigningInput getBitcoin() {
            if (this.signingInputOneofCase_ == 4) {
                return (Bitcoin.SigningInput) this.signingInputOneof_;
            }
            return Bitcoin.SigningInput.getDefaultInstance();
        }

        public Error getError() {
            Error error = this.error_;
            if (error == null) {
                return Error.getDefaultInstance();
            }
            return error;
        }

        public Ethereum.SigningInput getEthereum() {
            if (this.signingInputOneofCase_ == 5) {
                return (Ethereum.SigningInput) this.signingInputOneof_;
            }
            return Ethereum.SigningInput.getDefaultInstance();
        }

        public Chain getFromChain() {
            Chain forNumber = Chain.forNumber(this.fromChain_);
            if (forNumber == null) {
                return Chain.UNRECOGNIZED;
            }
            return forNumber;
        }

        public int getFromChainValue() {
            return this.fromChain_;
        }

        public SigningInputOneofCase getSigningInputOneofCase() {
            return SigningInputOneofCase.forNumber(this.signingInputOneofCase_);
        }

        public Chain getToChain() {
            Chain forNumber = Chain.forNumber(this.toChain_);
            if (forNumber == null) {
                return Chain.UNRECOGNIZED;
            }
            return forNumber;
        }

        public int getToChainValue() {
            return this.toChain_;
        }

        public boolean hasBinance() {
            if (this.signingInputOneofCase_ == 6) {
                return true;
            }
            return false;
        }

        public boolean hasBitcoin() {
            if (this.signingInputOneofCase_ == 4) {
                return true;
            }
            return false;
        }

        public boolean hasError() {
            if (this.error_ != null) {
                return true;
            }
            return false;
        }

        public boolean hasEthereum() {
            if (this.signingInputOneofCase_ == 5) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(SwapOutput swapOutput) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(swapOutput);
        }

        public static SwapOutput parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (SwapOutput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static SwapOutput parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (SwapOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static SwapOutput parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SwapOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SwapOutput parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (SwapOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static SwapOutput parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SwapOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SwapOutput parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (SwapOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static SwapOutput parseFrom(InputStream inputStream) throws IOException {
            return (SwapOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SwapOutput parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (SwapOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static SwapOutput parseFrom(C4969g gVar) throws IOException {
            return (SwapOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static SwapOutput parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (SwapOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface SwapOutputOrBuilder extends qu3 {
        Binance.SigningInput getBinance();

        Bitcoin.SigningInput getBitcoin();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        Error getError();

        Ethereum.SigningInput getEthereum();

        Chain getFromChain();

        int getFromChainValue();

        SwapOutput.SigningInputOneofCase getSigningInputOneofCase();

        Chain getToChain();

        int getToChainValue();

        boolean hasBinance();

        boolean hasBitcoin();

        boolean hasError();

        boolean hasEthereum();

        /* synthetic */ boolean isInitialized();
    }

    private THORChainSwap() {
    }

    public static void registerAllExtensions(C4987l lVar) {
    }
}
