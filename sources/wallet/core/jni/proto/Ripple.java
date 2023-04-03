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
import java.util.Collections;
import java.util.List;
import wallet.core.jni.proto.Common;

public final class Ripple {

    /* renamed from: wallet.core.jni.proto.Ripple$1 */
    public static /* synthetic */ class C97621 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f46577xa1df5c61;

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
                f46577xa1df5c61 = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f46577xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f46577xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f46577xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f46577xa1df5c61     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f46577xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f46577xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wallet.core.jni.proto.Ripple.C97621.<clinit>():void");
        }
    }

    public static final class CurrencyAmount extends GeneratedMessageLite<CurrencyAmount, Builder> implements CurrencyAmountOrBuilder {
        public static final int CURRENCY_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final CurrencyAmount DEFAULT_INSTANCE;
        public static final int ISSUER_FIELD_NUMBER = 3;
        private static volatile im4<CurrencyAmount> PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 2;
        private String currency_ = "";
        private String issuer_ = "";
        private String value_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<CurrencyAmount, Builder> implements CurrencyAmountOrBuilder {
            public /* synthetic */ Builder(C97621 r1) {
                this();
            }

            public Builder clearCurrency() {
                copyOnWrite();
                ((CurrencyAmount) this.instance).clearCurrency();
                return this;
            }

            public Builder clearIssuer() {
                copyOnWrite();
                ((CurrencyAmount) this.instance).clearIssuer();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((CurrencyAmount) this.instance).clearValue();
                return this;
            }

            public String getCurrency() {
                return ((CurrencyAmount) this.instance).getCurrency();
            }

            public ByteString getCurrencyBytes() {
                return ((CurrencyAmount) this.instance).getCurrencyBytes();
            }

            public String getIssuer() {
                return ((CurrencyAmount) this.instance).getIssuer();
            }

            public ByteString getIssuerBytes() {
                return ((CurrencyAmount) this.instance).getIssuerBytes();
            }

            public String getValue() {
                return ((CurrencyAmount) this.instance).getValue();
            }

            public ByteString getValueBytes() {
                return ((CurrencyAmount) this.instance).getValueBytes();
            }

            public Builder setCurrency(String str) {
                copyOnWrite();
                ((CurrencyAmount) this.instance).setCurrency(str);
                return this;
            }

            public Builder setCurrencyBytes(ByteString byteString) {
                copyOnWrite();
                ((CurrencyAmount) this.instance).setCurrencyBytes(byteString);
                return this;
            }

            public Builder setIssuer(String str) {
                copyOnWrite();
                ((CurrencyAmount) this.instance).setIssuer(str);
                return this;
            }

            public Builder setIssuerBytes(ByteString byteString) {
                copyOnWrite();
                ((CurrencyAmount) this.instance).setIssuerBytes(byteString);
                return this;
            }

            public Builder setValue(String str) {
                copyOnWrite();
                ((CurrencyAmount) this.instance).setValue(str);
                return this;
            }

            public Builder setValueBytes(ByteString byteString) {
                copyOnWrite();
                ((CurrencyAmount) this.instance).setValueBytes(byteString);
                return this;
            }

            private Builder() {
                super(CurrencyAmount.DEFAULT_INSTANCE);
            }
        }

        static {
            CurrencyAmount currencyAmount = new CurrencyAmount();
            DEFAULT_INSTANCE = currencyAmount;
            GeneratedMessageLite.registerDefaultInstance(CurrencyAmount.class, currencyAmount);
        }

        private CurrencyAmount() {
        }

        /* access modifiers changed from: private */
        public void clearCurrency() {
            this.currency_ = getDefaultInstance().getCurrency();
        }

        /* access modifiers changed from: private */
        public void clearIssuer() {
            this.issuer_ = getDefaultInstance().getIssuer();
        }

        /* access modifiers changed from: private */
        public void clearValue() {
            this.value_ = getDefaultInstance().getValue();
        }

        public static CurrencyAmount getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static CurrencyAmount parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CurrencyAmount) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CurrencyAmount parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CurrencyAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<CurrencyAmount> parser() {
            return DEFAULT_INSTANCE.getParserForType();
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
        public void setIssuer(String str) {
            str.getClass();
            this.issuer_ = str;
        }

        /* access modifiers changed from: private */
        public void setIssuerBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.issuer_ = byteString.toStringUtf8();
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

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97621.f46577xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new CurrencyAmount();
                case 2:
                    return new Builder((C97621) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"currency_", "value_", "issuer_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<CurrencyAmount> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (CurrencyAmount.class) {
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

        public String getCurrency() {
            return this.currency_;
        }

        public ByteString getCurrencyBytes() {
            return ByteString.copyFromUtf8(this.currency_);
        }

        public String getIssuer() {
            return this.issuer_;
        }

        public ByteString getIssuerBytes() {
            return ByteString.copyFromUtf8(this.issuer_);
        }

        public String getValue() {
            return this.value_;
        }

        public ByteString getValueBytes() {
            return ByteString.copyFromUtf8(this.value_);
        }

        public static Builder newBuilder(CurrencyAmount currencyAmount) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(currencyAmount);
        }

        public static CurrencyAmount parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (CurrencyAmount) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static CurrencyAmount parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (CurrencyAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static CurrencyAmount parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CurrencyAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CurrencyAmount parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (CurrencyAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static CurrencyAmount parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CurrencyAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CurrencyAmount parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (CurrencyAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static CurrencyAmount parseFrom(InputStream inputStream) throws IOException {
            return (CurrencyAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CurrencyAmount parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (CurrencyAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static CurrencyAmount parseFrom(C4969g gVar) throws IOException {
            return (CurrencyAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static CurrencyAmount parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (CurrencyAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface CurrencyAmountOrBuilder extends qu3 {
        String getCurrency();

        ByteString getCurrencyBytes();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getIssuer();

        ByteString getIssuerBytes();

        String getValue();

        ByteString getValueBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class OperationNFTokenAcceptOffer extends GeneratedMessageLite<OperationNFTokenAcceptOffer, Builder> implements OperationNFTokenAcceptOfferOrBuilder {
        /* access modifiers changed from: private */
        public static final OperationNFTokenAcceptOffer DEFAULT_INSTANCE;
        private static volatile im4<OperationNFTokenAcceptOffer> PARSER = null;
        public static final int SELL_OFFER_FIELD_NUMBER = 1;
        private ByteString sellOffer_ = ByteString.EMPTY;

        public static final class Builder extends GeneratedMessageLite.C4930a<OperationNFTokenAcceptOffer, Builder> implements OperationNFTokenAcceptOfferOrBuilder {
            public /* synthetic */ Builder(C97621 r1) {
                this();
            }

            public Builder clearSellOffer() {
                copyOnWrite();
                ((OperationNFTokenAcceptOffer) this.instance).clearSellOffer();
                return this;
            }

            public ByteString getSellOffer() {
                return ((OperationNFTokenAcceptOffer) this.instance).getSellOffer();
            }

            public Builder setSellOffer(ByteString byteString) {
                copyOnWrite();
                ((OperationNFTokenAcceptOffer) this.instance).setSellOffer(byteString);
                return this;
            }

            private Builder() {
                super(OperationNFTokenAcceptOffer.DEFAULT_INSTANCE);
            }
        }

        static {
            OperationNFTokenAcceptOffer operationNFTokenAcceptOffer = new OperationNFTokenAcceptOffer();
            DEFAULT_INSTANCE = operationNFTokenAcceptOffer;
            GeneratedMessageLite.registerDefaultInstance(OperationNFTokenAcceptOffer.class, operationNFTokenAcceptOffer);
        }

        private OperationNFTokenAcceptOffer() {
        }

        /* access modifiers changed from: private */
        public void clearSellOffer() {
            this.sellOffer_ = getDefaultInstance().getSellOffer();
        }

        public static OperationNFTokenAcceptOffer getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static OperationNFTokenAcceptOffer parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OperationNFTokenAcceptOffer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationNFTokenAcceptOffer parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (OperationNFTokenAcceptOffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<OperationNFTokenAcceptOffer> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setSellOffer(ByteString byteString) {
            byteString.getClass();
            this.sellOffer_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97621.f46577xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new OperationNFTokenAcceptOffer();
                case 2:
                    return new Builder((C97621) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"sellOffer_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<OperationNFTokenAcceptOffer> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (OperationNFTokenAcceptOffer.class) {
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

        public ByteString getSellOffer() {
            return this.sellOffer_;
        }

        public static Builder newBuilder(OperationNFTokenAcceptOffer operationNFTokenAcceptOffer) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(operationNFTokenAcceptOffer);
        }

        public static OperationNFTokenAcceptOffer parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (OperationNFTokenAcceptOffer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static OperationNFTokenAcceptOffer parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (OperationNFTokenAcceptOffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static OperationNFTokenAcceptOffer parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OperationNFTokenAcceptOffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static OperationNFTokenAcceptOffer parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (OperationNFTokenAcceptOffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static OperationNFTokenAcceptOffer parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OperationNFTokenAcceptOffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OperationNFTokenAcceptOffer parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (OperationNFTokenAcceptOffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static OperationNFTokenAcceptOffer parseFrom(InputStream inputStream) throws IOException {
            return (OperationNFTokenAcceptOffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationNFTokenAcceptOffer parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (OperationNFTokenAcceptOffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static OperationNFTokenAcceptOffer parseFrom(C4969g gVar) throws IOException {
            return (OperationNFTokenAcceptOffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static OperationNFTokenAcceptOffer parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (OperationNFTokenAcceptOffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface OperationNFTokenAcceptOfferOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        ByteString getSellOffer();

        /* synthetic */ boolean isInitialized();
    }

    public static final class OperationNFTokenBurn extends GeneratedMessageLite<OperationNFTokenBurn, Builder> implements OperationNFTokenBurnOrBuilder {
        /* access modifiers changed from: private */
        public static final OperationNFTokenBurn DEFAULT_INSTANCE;
        public static final int NFTOKEN_ID_FIELD_NUMBER = 1;
        private static volatile im4<OperationNFTokenBurn> PARSER;
        private ByteString nftokenId_ = ByteString.EMPTY;

        public static final class Builder extends GeneratedMessageLite.C4930a<OperationNFTokenBurn, Builder> implements OperationNFTokenBurnOrBuilder {
            public /* synthetic */ Builder(C97621 r1) {
                this();
            }

            public Builder clearNftokenId() {
                copyOnWrite();
                ((OperationNFTokenBurn) this.instance).clearNftokenId();
                return this;
            }

            public ByteString getNftokenId() {
                return ((OperationNFTokenBurn) this.instance).getNftokenId();
            }

            public Builder setNftokenId(ByteString byteString) {
                copyOnWrite();
                ((OperationNFTokenBurn) this.instance).setNftokenId(byteString);
                return this;
            }

            private Builder() {
                super(OperationNFTokenBurn.DEFAULT_INSTANCE);
            }
        }

        static {
            OperationNFTokenBurn operationNFTokenBurn = new OperationNFTokenBurn();
            DEFAULT_INSTANCE = operationNFTokenBurn;
            GeneratedMessageLite.registerDefaultInstance(OperationNFTokenBurn.class, operationNFTokenBurn);
        }

        private OperationNFTokenBurn() {
        }

        /* access modifiers changed from: private */
        public void clearNftokenId() {
            this.nftokenId_ = getDefaultInstance().getNftokenId();
        }

        public static OperationNFTokenBurn getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static OperationNFTokenBurn parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OperationNFTokenBurn) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationNFTokenBurn parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (OperationNFTokenBurn) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<OperationNFTokenBurn> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setNftokenId(ByteString byteString) {
            byteString.getClass();
            this.nftokenId_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97621.f46577xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new OperationNFTokenBurn();
                case 2:
                    return new Builder((C97621) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"nftokenId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<OperationNFTokenBurn> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (OperationNFTokenBurn.class) {
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

        public ByteString getNftokenId() {
            return this.nftokenId_;
        }

        public static Builder newBuilder(OperationNFTokenBurn operationNFTokenBurn) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(operationNFTokenBurn);
        }

        public static OperationNFTokenBurn parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (OperationNFTokenBurn) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static OperationNFTokenBurn parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (OperationNFTokenBurn) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static OperationNFTokenBurn parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OperationNFTokenBurn) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static OperationNFTokenBurn parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (OperationNFTokenBurn) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static OperationNFTokenBurn parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OperationNFTokenBurn) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OperationNFTokenBurn parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (OperationNFTokenBurn) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static OperationNFTokenBurn parseFrom(InputStream inputStream) throws IOException {
            return (OperationNFTokenBurn) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationNFTokenBurn parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (OperationNFTokenBurn) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static OperationNFTokenBurn parseFrom(C4969g gVar) throws IOException {
            return (OperationNFTokenBurn) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static OperationNFTokenBurn parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (OperationNFTokenBurn) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface OperationNFTokenBurnOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        ByteString getNftokenId();

        /* synthetic */ boolean isInitialized();
    }

    public static final class OperationNFTokenCancelOffer extends GeneratedMessageLite<OperationNFTokenCancelOffer, Builder> implements OperationNFTokenCancelOfferOrBuilder {
        /* access modifiers changed from: private */
        public static final OperationNFTokenCancelOffer DEFAULT_INSTANCE;
        private static volatile im4<OperationNFTokenCancelOffer> PARSER = null;
        public static final int TOKEN_OFFERS_FIELD_NUMBER = 1;
        private C5011t.C5020i<ByteString> tokenOffers_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.C4930a<OperationNFTokenCancelOffer, Builder> implements OperationNFTokenCancelOfferOrBuilder {
            public /* synthetic */ Builder(C97621 r1) {
                this();
            }

            public Builder addAllTokenOffers(Iterable<? extends ByteString> iterable) {
                copyOnWrite();
                ((OperationNFTokenCancelOffer) this.instance).addAllTokenOffers(iterable);
                return this;
            }

            public Builder addTokenOffers(ByteString byteString) {
                copyOnWrite();
                ((OperationNFTokenCancelOffer) this.instance).addTokenOffers(byteString);
                return this;
            }

            public Builder clearTokenOffers() {
                copyOnWrite();
                ((OperationNFTokenCancelOffer) this.instance).clearTokenOffers();
                return this;
            }

            public ByteString getTokenOffers(int i) {
                return ((OperationNFTokenCancelOffer) this.instance).getTokenOffers(i);
            }

            public int getTokenOffersCount() {
                return ((OperationNFTokenCancelOffer) this.instance).getTokenOffersCount();
            }

            public List<ByteString> getTokenOffersList() {
                return Collections.unmodifiableList(((OperationNFTokenCancelOffer) this.instance).getTokenOffersList());
            }

            public Builder setTokenOffers(int i, ByteString byteString) {
                copyOnWrite();
                ((OperationNFTokenCancelOffer) this.instance).setTokenOffers(i, byteString);
                return this;
            }

            private Builder() {
                super(OperationNFTokenCancelOffer.DEFAULT_INSTANCE);
            }
        }

        static {
            OperationNFTokenCancelOffer operationNFTokenCancelOffer = new OperationNFTokenCancelOffer();
            DEFAULT_INSTANCE = operationNFTokenCancelOffer;
            GeneratedMessageLite.registerDefaultInstance(OperationNFTokenCancelOffer.class, operationNFTokenCancelOffer);
        }

        private OperationNFTokenCancelOffer() {
        }

        /* access modifiers changed from: private */
        public void addAllTokenOffers(Iterable<? extends ByteString> iterable) {
            ensureTokenOffersIsMutable();
            C4949a.addAll(iterable, this.tokenOffers_);
        }

        /* access modifiers changed from: private */
        public void addTokenOffers(ByteString byteString) {
            byteString.getClass();
            ensureTokenOffersIsMutable();
            this.tokenOffers_.add(byteString);
        }

        /* access modifiers changed from: private */
        public void clearTokenOffers() {
            this.tokenOffers_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureTokenOffersIsMutable() {
            C5011t.C5020i<ByteString> iVar = this.tokenOffers_;
            if (!iVar.mo37090v()) {
                this.tokenOffers_ = GeneratedMessageLite.mutableCopy(iVar);
            }
        }

        public static OperationNFTokenCancelOffer getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static OperationNFTokenCancelOffer parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OperationNFTokenCancelOffer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationNFTokenCancelOffer parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (OperationNFTokenCancelOffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<OperationNFTokenCancelOffer> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setTokenOffers(int i, ByteString byteString) {
            byteString.getClass();
            ensureTokenOffersIsMutable();
            this.tokenOffers_.set(i, byteString);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97621.f46577xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new OperationNFTokenCancelOffer();
                case 2:
                    return new Builder((C97621) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001c", new Object[]{"tokenOffers_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<OperationNFTokenCancelOffer> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (OperationNFTokenCancelOffer.class) {
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

        public ByteString getTokenOffers(int i) {
            return this.tokenOffers_.get(i);
        }

        public int getTokenOffersCount() {
            return this.tokenOffers_.size();
        }

        public List<ByteString> getTokenOffersList() {
            return this.tokenOffers_;
        }

        public static Builder newBuilder(OperationNFTokenCancelOffer operationNFTokenCancelOffer) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(operationNFTokenCancelOffer);
        }

        public static OperationNFTokenCancelOffer parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (OperationNFTokenCancelOffer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static OperationNFTokenCancelOffer parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (OperationNFTokenCancelOffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static OperationNFTokenCancelOffer parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OperationNFTokenCancelOffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static OperationNFTokenCancelOffer parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (OperationNFTokenCancelOffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static OperationNFTokenCancelOffer parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OperationNFTokenCancelOffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OperationNFTokenCancelOffer parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (OperationNFTokenCancelOffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static OperationNFTokenCancelOffer parseFrom(InputStream inputStream) throws IOException {
            return (OperationNFTokenCancelOffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationNFTokenCancelOffer parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (OperationNFTokenCancelOffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static OperationNFTokenCancelOffer parseFrom(C4969g gVar) throws IOException {
            return (OperationNFTokenCancelOffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static OperationNFTokenCancelOffer parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (OperationNFTokenCancelOffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface OperationNFTokenCancelOfferOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        ByteString getTokenOffers(int i);

        int getTokenOffersCount();

        List<ByteString> getTokenOffersList();

        /* synthetic */ boolean isInitialized();
    }

    public static final class OperationNFTokenCreateOffer extends GeneratedMessageLite<OperationNFTokenCreateOffer, Builder> implements OperationNFTokenCreateOfferOrBuilder {
        /* access modifiers changed from: private */
        public static final OperationNFTokenCreateOffer DEFAULT_INSTANCE;
        public static final int DESTINATION_FIELD_NUMBER = 2;
        public static final int NFTOKEN_ID_FIELD_NUMBER = 1;
        private static volatile im4<OperationNFTokenCreateOffer> PARSER;
        private String destination_ = "";
        private ByteString nftokenId_ = ByteString.EMPTY;

        public static final class Builder extends GeneratedMessageLite.C4930a<OperationNFTokenCreateOffer, Builder> implements OperationNFTokenCreateOfferOrBuilder {
            public /* synthetic */ Builder(C97621 r1) {
                this();
            }

            public Builder clearDestination() {
                copyOnWrite();
                ((OperationNFTokenCreateOffer) this.instance).clearDestination();
                return this;
            }

            public Builder clearNftokenId() {
                copyOnWrite();
                ((OperationNFTokenCreateOffer) this.instance).clearNftokenId();
                return this;
            }

            public String getDestination() {
                return ((OperationNFTokenCreateOffer) this.instance).getDestination();
            }

            public ByteString getDestinationBytes() {
                return ((OperationNFTokenCreateOffer) this.instance).getDestinationBytes();
            }

            public ByteString getNftokenId() {
                return ((OperationNFTokenCreateOffer) this.instance).getNftokenId();
            }

            public Builder setDestination(String str) {
                copyOnWrite();
                ((OperationNFTokenCreateOffer) this.instance).setDestination(str);
                return this;
            }

            public Builder setDestinationBytes(ByteString byteString) {
                copyOnWrite();
                ((OperationNFTokenCreateOffer) this.instance).setDestinationBytes(byteString);
                return this;
            }

            public Builder setNftokenId(ByteString byteString) {
                copyOnWrite();
                ((OperationNFTokenCreateOffer) this.instance).setNftokenId(byteString);
                return this;
            }

            private Builder() {
                super(OperationNFTokenCreateOffer.DEFAULT_INSTANCE);
            }
        }

        static {
            OperationNFTokenCreateOffer operationNFTokenCreateOffer = new OperationNFTokenCreateOffer();
            DEFAULT_INSTANCE = operationNFTokenCreateOffer;
            GeneratedMessageLite.registerDefaultInstance(OperationNFTokenCreateOffer.class, operationNFTokenCreateOffer);
        }

        private OperationNFTokenCreateOffer() {
        }

        /* access modifiers changed from: private */
        public void clearDestination() {
            this.destination_ = getDefaultInstance().getDestination();
        }

        /* access modifiers changed from: private */
        public void clearNftokenId() {
            this.nftokenId_ = getDefaultInstance().getNftokenId();
        }

        public static OperationNFTokenCreateOffer getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static OperationNFTokenCreateOffer parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OperationNFTokenCreateOffer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationNFTokenCreateOffer parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (OperationNFTokenCreateOffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<OperationNFTokenCreateOffer> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setDestination(String str) {
            str.getClass();
            this.destination_ = str;
        }

        /* access modifiers changed from: private */
        public void setDestinationBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.destination_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setNftokenId(ByteString byteString) {
            byteString.getClass();
            this.nftokenId_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97621.f46577xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new OperationNFTokenCreateOffer();
                case 2:
                    return new Builder((C97621) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002Ȉ", new Object[]{"nftokenId_", "destination_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<OperationNFTokenCreateOffer> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (OperationNFTokenCreateOffer.class) {
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

        public String getDestination() {
            return this.destination_;
        }

        public ByteString getDestinationBytes() {
            return ByteString.copyFromUtf8(this.destination_);
        }

        public ByteString getNftokenId() {
            return this.nftokenId_;
        }

        public static Builder newBuilder(OperationNFTokenCreateOffer operationNFTokenCreateOffer) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(operationNFTokenCreateOffer);
        }

        public static OperationNFTokenCreateOffer parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (OperationNFTokenCreateOffer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static OperationNFTokenCreateOffer parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (OperationNFTokenCreateOffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static OperationNFTokenCreateOffer parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OperationNFTokenCreateOffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static OperationNFTokenCreateOffer parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (OperationNFTokenCreateOffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static OperationNFTokenCreateOffer parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OperationNFTokenCreateOffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OperationNFTokenCreateOffer parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (OperationNFTokenCreateOffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static OperationNFTokenCreateOffer parseFrom(InputStream inputStream) throws IOException {
            return (OperationNFTokenCreateOffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationNFTokenCreateOffer parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (OperationNFTokenCreateOffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static OperationNFTokenCreateOffer parseFrom(C4969g gVar) throws IOException {
            return (OperationNFTokenCreateOffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static OperationNFTokenCreateOffer parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (OperationNFTokenCreateOffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface OperationNFTokenCreateOfferOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getDestination();

        ByteString getDestinationBytes();

        ByteString getNftokenId();

        /* synthetic */ boolean isInitialized();
    }

    public static final class OperationPayment extends GeneratedMessageLite<OperationPayment, Builder> implements OperationPaymentOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 1;
        public static final int CURRENCY_AMOUNT_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final OperationPayment DEFAULT_INSTANCE;
        public static final int DESTINATION_FIELD_NUMBER = 3;
        public static final int DESTINATION_TAG_FIELD_NUMBER = 4;
        private static volatile im4<OperationPayment> PARSER;
        private int amountOneofCase_ = 0;
        private Object amountOneof_;
        private long destinationTag_;
        private String destination_ = "";

        public enum AmountOneofCase {
            AMOUNT(1),
            CURRENCY_AMOUNT(2),
            AMOUNTONEOF_NOT_SET(0);
            
            private final int value;

            private AmountOneofCase(int i) {
                this.value = i;
            }

            public static AmountOneofCase forNumber(int i) {
                if (i == 0) {
                    return AMOUNTONEOF_NOT_SET;
                }
                if (i == 1) {
                    return AMOUNT;
                }
                if (i != 2) {
                    return null;
                }
                return CURRENCY_AMOUNT;
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static AmountOneofCase valueOf(int i) {
                return forNumber(i);
            }
        }

        public static final class Builder extends GeneratedMessageLite.C4930a<OperationPayment, Builder> implements OperationPaymentOrBuilder {
            public /* synthetic */ Builder(C97621 r1) {
                this();
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((OperationPayment) this.instance).clearAmount();
                return this;
            }

            public Builder clearAmountOneof() {
                copyOnWrite();
                ((OperationPayment) this.instance).clearAmountOneof();
                return this;
            }

            public Builder clearCurrencyAmount() {
                copyOnWrite();
                ((OperationPayment) this.instance).clearCurrencyAmount();
                return this;
            }

            public Builder clearDestination() {
                copyOnWrite();
                ((OperationPayment) this.instance).clearDestination();
                return this;
            }

            public Builder clearDestinationTag() {
                copyOnWrite();
                ((OperationPayment) this.instance).clearDestinationTag();
                return this;
            }

            public long getAmount() {
                return ((OperationPayment) this.instance).getAmount();
            }

            public AmountOneofCase getAmountOneofCase() {
                return ((OperationPayment) this.instance).getAmountOneofCase();
            }

            public CurrencyAmount getCurrencyAmount() {
                return ((OperationPayment) this.instance).getCurrencyAmount();
            }

            public String getDestination() {
                return ((OperationPayment) this.instance).getDestination();
            }

            public ByteString getDestinationBytes() {
                return ((OperationPayment) this.instance).getDestinationBytes();
            }

            public long getDestinationTag() {
                return ((OperationPayment) this.instance).getDestinationTag();
            }

            public boolean hasAmount() {
                return ((OperationPayment) this.instance).hasAmount();
            }

            public boolean hasCurrencyAmount() {
                return ((OperationPayment) this.instance).hasCurrencyAmount();
            }

            public Builder mergeCurrencyAmount(CurrencyAmount currencyAmount) {
                copyOnWrite();
                ((OperationPayment) this.instance).mergeCurrencyAmount(currencyAmount);
                return this;
            }

            public Builder setAmount(long j) {
                copyOnWrite();
                ((OperationPayment) this.instance).setAmount(j);
                return this;
            }

            public Builder setCurrencyAmount(CurrencyAmount currencyAmount) {
                copyOnWrite();
                ((OperationPayment) this.instance).setCurrencyAmount(currencyAmount);
                return this;
            }

            public Builder setDestination(String str) {
                copyOnWrite();
                ((OperationPayment) this.instance).setDestination(str);
                return this;
            }

            public Builder setDestinationBytes(ByteString byteString) {
                copyOnWrite();
                ((OperationPayment) this.instance).setDestinationBytes(byteString);
                return this;
            }

            public Builder setDestinationTag(long j) {
                copyOnWrite();
                ((OperationPayment) this.instance).setDestinationTag(j);
                return this;
            }

            private Builder() {
                super(OperationPayment.DEFAULT_INSTANCE);
            }

            public Builder setCurrencyAmount(CurrencyAmount.Builder builder) {
                copyOnWrite();
                ((OperationPayment) this.instance).setCurrencyAmount((CurrencyAmount) builder.build());
                return this;
            }
        }

        static {
            OperationPayment operationPayment = new OperationPayment();
            DEFAULT_INSTANCE = operationPayment;
            GeneratedMessageLite.registerDefaultInstance(OperationPayment.class, operationPayment);
        }

        private OperationPayment() {
        }

        /* access modifiers changed from: private */
        public void clearAmount() {
            if (this.amountOneofCase_ == 1) {
                this.amountOneofCase_ = 0;
                this.amountOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearAmountOneof() {
            this.amountOneofCase_ = 0;
            this.amountOneof_ = null;
        }

        /* access modifiers changed from: private */
        public void clearCurrencyAmount() {
            if (this.amountOneofCase_ == 2) {
                this.amountOneofCase_ = 0;
                this.amountOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearDestination() {
            this.destination_ = getDefaultInstance().getDestination();
        }

        /* access modifiers changed from: private */
        public void clearDestinationTag() {
            this.destinationTag_ = 0;
        }

        public static OperationPayment getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeCurrencyAmount(CurrencyAmount currencyAmount) {
            currencyAmount.getClass();
            if (this.amountOneofCase_ != 2 || this.amountOneof_ == CurrencyAmount.getDefaultInstance()) {
                this.amountOneof_ = currencyAmount;
            } else {
                this.amountOneof_ = ((CurrencyAmount.Builder) CurrencyAmount.newBuilder((CurrencyAmount) this.amountOneof_).mergeFrom(currencyAmount)).buildPartial();
            }
            this.amountOneofCase_ = 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static OperationPayment parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OperationPayment) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationPayment parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (OperationPayment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<OperationPayment> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAmount(long j) {
            this.amountOneofCase_ = 1;
            this.amountOneof_ = Long.valueOf(j);
        }

        /* access modifiers changed from: private */
        public void setCurrencyAmount(CurrencyAmount currencyAmount) {
            currencyAmount.getClass();
            this.amountOneof_ = currencyAmount;
            this.amountOneofCase_ = 2;
        }

        /* access modifiers changed from: private */
        public void setDestination(String str) {
            str.getClass();
            this.destination_ = str;
        }

        /* access modifiers changed from: private */
        public void setDestinationBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.destination_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setDestinationTag(long j) {
            this.destinationTag_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97621.f46577xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new OperationPayment();
                case 2:
                    return new Builder((C97621) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u00015\u0000\u0002<\u0000\u0003Ȉ\u0004\u0002", new Object[]{"amountOneof_", "amountOneofCase_", CurrencyAmount.class, "destination_", "destinationTag_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<OperationPayment> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (OperationPayment.class) {
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
            if (this.amountOneofCase_ == 1) {
                return ((Long) this.amountOneof_).longValue();
            }
            return 0;
        }

        public AmountOneofCase getAmountOneofCase() {
            return AmountOneofCase.forNumber(this.amountOneofCase_);
        }

        public CurrencyAmount getCurrencyAmount() {
            if (this.amountOneofCase_ == 2) {
                return (CurrencyAmount) this.amountOneof_;
            }
            return CurrencyAmount.getDefaultInstance();
        }

        public String getDestination() {
            return this.destination_;
        }

        public ByteString getDestinationBytes() {
            return ByteString.copyFromUtf8(this.destination_);
        }

        public long getDestinationTag() {
            return this.destinationTag_;
        }

        public boolean hasAmount() {
            if (this.amountOneofCase_ == 1) {
                return true;
            }
            return false;
        }

        public boolean hasCurrencyAmount() {
            if (this.amountOneofCase_ == 2) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(OperationPayment operationPayment) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(operationPayment);
        }

        public static OperationPayment parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (OperationPayment) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static OperationPayment parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (OperationPayment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static OperationPayment parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OperationPayment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static OperationPayment parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (OperationPayment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static OperationPayment parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OperationPayment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OperationPayment parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (OperationPayment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static OperationPayment parseFrom(InputStream inputStream) throws IOException {
            return (OperationPayment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationPayment parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (OperationPayment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static OperationPayment parseFrom(C4969g gVar) throws IOException {
            return (OperationPayment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static OperationPayment parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (OperationPayment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface OperationPaymentOrBuilder extends qu3 {
        long getAmount();

        OperationPayment.AmountOneofCase getAmountOneofCase();

        CurrencyAmount getCurrencyAmount();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getDestination();

        ByteString getDestinationBytes();

        long getDestinationTag();

        boolean hasAmount();

        boolean hasCurrencyAmount();

        /* synthetic */ boolean isInitialized();
    }

    public static final class OperationTrustSet extends GeneratedMessageLite<OperationTrustSet, Builder> implements OperationTrustSetOrBuilder {
        /* access modifiers changed from: private */
        public static final OperationTrustSet DEFAULT_INSTANCE;
        public static final int LIMIT_AMOUNT_FIELD_NUMBER = 1;
        private static volatile im4<OperationTrustSet> PARSER;
        private CurrencyAmount limitAmount_;

        public static final class Builder extends GeneratedMessageLite.C4930a<OperationTrustSet, Builder> implements OperationTrustSetOrBuilder {
            public /* synthetic */ Builder(C97621 r1) {
                this();
            }

            public Builder clearLimitAmount() {
                copyOnWrite();
                ((OperationTrustSet) this.instance).clearLimitAmount();
                return this;
            }

            public CurrencyAmount getLimitAmount() {
                return ((OperationTrustSet) this.instance).getLimitAmount();
            }

            public boolean hasLimitAmount() {
                return ((OperationTrustSet) this.instance).hasLimitAmount();
            }

            public Builder mergeLimitAmount(CurrencyAmount currencyAmount) {
                copyOnWrite();
                ((OperationTrustSet) this.instance).mergeLimitAmount(currencyAmount);
                return this;
            }

            public Builder setLimitAmount(CurrencyAmount currencyAmount) {
                copyOnWrite();
                ((OperationTrustSet) this.instance).setLimitAmount(currencyAmount);
                return this;
            }

            private Builder() {
                super(OperationTrustSet.DEFAULT_INSTANCE);
            }

            public Builder setLimitAmount(CurrencyAmount.Builder builder) {
                copyOnWrite();
                ((OperationTrustSet) this.instance).setLimitAmount((CurrencyAmount) builder.build());
                return this;
            }
        }

        static {
            OperationTrustSet operationTrustSet = new OperationTrustSet();
            DEFAULT_INSTANCE = operationTrustSet;
            GeneratedMessageLite.registerDefaultInstance(OperationTrustSet.class, operationTrustSet);
        }

        private OperationTrustSet() {
        }

        /* access modifiers changed from: private */
        public void clearLimitAmount() {
            this.limitAmount_ = null;
        }

        public static OperationTrustSet getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeLimitAmount(CurrencyAmount currencyAmount) {
            currencyAmount.getClass();
            CurrencyAmount currencyAmount2 = this.limitAmount_;
            if (currencyAmount2 == null || currencyAmount2 == CurrencyAmount.getDefaultInstance()) {
                this.limitAmount_ = currencyAmount;
            } else {
                this.limitAmount_ = (CurrencyAmount) ((CurrencyAmount.Builder) CurrencyAmount.newBuilder(this.limitAmount_).mergeFrom(currencyAmount)).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static OperationTrustSet parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OperationTrustSet) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationTrustSet parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (OperationTrustSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<OperationTrustSet> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setLimitAmount(CurrencyAmount currencyAmount) {
            currencyAmount.getClass();
            this.limitAmount_ = currencyAmount;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97621.f46577xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new OperationTrustSet();
                case 2:
                    return new Builder((C97621) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"limitAmount_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<OperationTrustSet> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (OperationTrustSet.class) {
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

        public CurrencyAmount getLimitAmount() {
            CurrencyAmount currencyAmount = this.limitAmount_;
            if (currencyAmount == null) {
                return CurrencyAmount.getDefaultInstance();
            }
            return currencyAmount;
        }

        public boolean hasLimitAmount() {
            if (this.limitAmount_ != null) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(OperationTrustSet operationTrustSet) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(operationTrustSet);
        }

        public static OperationTrustSet parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (OperationTrustSet) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static OperationTrustSet parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (OperationTrustSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static OperationTrustSet parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OperationTrustSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static OperationTrustSet parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (OperationTrustSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static OperationTrustSet parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OperationTrustSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OperationTrustSet parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (OperationTrustSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static OperationTrustSet parseFrom(InputStream inputStream) throws IOException {
            return (OperationTrustSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationTrustSet parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (OperationTrustSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static OperationTrustSet parseFrom(C4969g gVar) throws IOException {
            return (OperationTrustSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static OperationTrustSet parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (OperationTrustSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface OperationTrustSetOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        CurrencyAmount getLimitAmount();

        boolean hasLimitAmount();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SigningInput extends GeneratedMessageLite<SigningInput, Builder> implements SigningInputOrBuilder {
        public static final int ACCOUNT_FIELD_NUMBER = 4;
        /* access modifiers changed from: private */
        public static final SigningInput DEFAULT_INSTANCE;
        public static final int FEE_FIELD_NUMBER = 1;
        public static final int FLAGS_FIELD_NUMBER = 5;
        public static final int LAST_LEDGER_SEQUENCE_FIELD_NUMBER = 3;
        public static final int OP_NFTOKEN_ACCEPT_OFFER_FIELD_NUMBER = 11;
        public static final int OP_NFTOKEN_BURN_FIELD_NUMBER = 9;
        public static final int OP_NFTOKEN_CANCEL_OFFER_FIELD_NUMBER = 12;
        public static final int OP_NFTOKEN_CREATE_OFFER_FIELD_NUMBER = 10;
        public static final int OP_PAYMENT_FIELD_NUMBER = 8;
        public static final int OP_TRUST_SET_FIELD_NUMBER = 7;
        private static volatile im4<SigningInput> PARSER = null;
        public static final int PRIVATE_KEY_FIELD_NUMBER = 6;
        public static final int SEQUENCE_FIELD_NUMBER = 2;
        private String account_ = "";
        private long fee_;
        private long flags_;
        private int lastLedgerSequence_;
        private int operationOneofCase_ = 0;
        private Object operationOneof_;
        private ByteString privateKey_ = ByteString.EMPTY;
        private int sequence_;

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningInput, Builder> implements SigningInputOrBuilder {
            public /* synthetic */ Builder(C97621 r1) {
                this();
            }

            public Builder clearAccount() {
                copyOnWrite();
                ((SigningInput) this.instance).clearAccount();
                return this;
            }

            public Builder clearFee() {
                copyOnWrite();
                ((SigningInput) this.instance).clearFee();
                return this;
            }

            public Builder clearFlags() {
                copyOnWrite();
                ((SigningInput) this.instance).clearFlags();
                return this;
            }

            public Builder clearLastLedgerSequence() {
                copyOnWrite();
                ((SigningInput) this.instance).clearLastLedgerSequence();
                return this;
            }

            public Builder clearOpNftokenAcceptOffer() {
                copyOnWrite();
                ((SigningInput) this.instance).clearOpNftokenAcceptOffer();
                return this;
            }

            public Builder clearOpNftokenBurn() {
                copyOnWrite();
                ((SigningInput) this.instance).clearOpNftokenBurn();
                return this;
            }

            public Builder clearOpNftokenCancelOffer() {
                copyOnWrite();
                ((SigningInput) this.instance).clearOpNftokenCancelOffer();
                return this;
            }

            public Builder clearOpNftokenCreateOffer() {
                copyOnWrite();
                ((SigningInput) this.instance).clearOpNftokenCreateOffer();
                return this;
            }

            public Builder clearOpPayment() {
                copyOnWrite();
                ((SigningInput) this.instance).clearOpPayment();
                return this;
            }

            public Builder clearOpTrustSet() {
                copyOnWrite();
                ((SigningInput) this.instance).clearOpTrustSet();
                return this;
            }

            public Builder clearOperationOneof() {
                copyOnWrite();
                ((SigningInput) this.instance).clearOperationOneof();
                return this;
            }

            public Builder clearPrivateKey() {
                copyOnWrite();
                ((SigningInput) this.instance).clearPrivateKey();
                return this;
            }

            public Builder clearSequence() {
                copyOnWrite();
                ((SigningInput) this.instance).clearSequence();
                return this;
            }

            public String getAccount() {
                return ((SigningInput) this.instance).getAccount();
            }

            public ByteString getAccountBytes() {
                return ((SigningInput) this.instance).getAccountBytes();
            }

            public long getFee() {
                return ((SigningInput) this.instance).getFee();
            }

            public long getFlags() {
                return ((SigningInput) this.instance).getFlags();
            }

            public int getLastLedgerSequence() {
                return ((SigningInput) this.instance).getLastLedgerSequence();
            }

            public OperationNFTokenAcceptOffer getOpNftokenAcceptOffer() {
                return ((SigningInput) this.instance).getOpNftokenAcceptOffer();
            }

            public OperationNFTokenBurn getOpNftokenBurn() {
                return ((SigningInput) this.instance).getOpNftokenBurn();
            }

            public OperationNFTokenCancelOffer getOpNftokenCancelOffer() {
                return ((SigningInput) this.instance).getOpNftokenCancelOffer();
            }

            public OperationNFTokenCreateOffer getOpNftokenCreateOffer() {
                return ((SigningInput) this.instance).getOpNftokenCreateOffer();
            }

            public OperationPayment getOpPayment() {
                return ((SigningInput) this.instance).getOpPayment();
            }

            public OperationTrustSet getOpTrustSet() {
                return ((SigningInput) this.instance).getOpTrustSet();
            }

            public OperationOneofCase getOperationOneofCase() {
                return ((SigningInput) this.instance).getOperationOneofCase();
            }

            public ByteString getPrivateKey() {
                return ((SigningInput) this.instance).getPrivateKey();
            }

            public int getSequence() {
                return ((SigningInput) this.instance).getSequence();
            }

            public boolean hasOpNftokenAcceptOffer() {
                return ((SigningInput) this.instance).hasOpNftokenAcceptOffer();
            }

            public boolean hasOpNftokenBurn() {
                return ((SigningInput) this.instance).hasOpNftokenBurn();
            }

            public boolean hasOpNftokenCancelOffer() {
                return ((SigningInput) this.instance).hasOpNftokenCancelOffer();
            }

            public boolean hasOpNftokenCreateOffer() {
                return ((SigningInput) this.instance).hasOpNftokenCreateOffer();
            }

            public boolean hasOpPayment() {
                return ((SigningInput) this.instance).hasOpPayment();
            }

            public boolean hasOpTrustSet() {
                return ((SigningInput) this.instance).hasOpTrustSet();
            }

            public Builder mergeOpNftokenAcceptOffer(OperationNFTokenAcceptOffer operationNFTokenAcceptOffer) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeOpNftokenAcceptOffer(operationNFTokenAcceptOffer);
                return this;
            }

            public Builder mergeOpNftokenBurn(OperationNFTokenBurn operationNFTokenBurn) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeOpNftokenBurn(operationNFTokenBurn);
                return this;
            }

            public Builder mergeOpNftokenCancelOffer(OperationNFTokenCancelOffer operationNFTokenCancelOffer) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeOpNftokenCancelOffer(operationNFTokenCancelOffer);
                return this;
            }

            public Builder mergeOpNftokenCreateOffer(OperationNFTokenCreateOffer operationNFTokenCreateOffer) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeOpNftokenCreateOffer(operationNFTokenCreateOffer);
                return this;
            }

            public Builder mergeOpPayment(OperationPayment operationPayment) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeOpPayment(operationPayment);
                return this;
            }

            public Builder mergeOpTrustSet(OperationTrustSet operationTrustSet) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeOpTrustSet(operationTrustSet);
                return this;
            }

            public Builder setAccount(String str) {
                copyOnWrite();
                ((SigningInput) this.instance).setAccount(str);
                return this;
            }

            public Builder setAccountBytes(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setAccountBytes(byteString);
                return this;
            }

            public Builder setFee(long j) {
                copyOnWrite();
                ((SigningInput) this.instance).setFee(j);
                return this;
            }

            public Builder setFlags(long j) {
                copyOnWrite();
                ((SigningInput) this.instance).setFlags(j);
                return this;
            }

            public Builder setLastLedgerSequence(int i) {
                copyOnWrite();
                ((SigningInput) this.instance).setLastLedgerSequence(i);
                return this;
            }

            public Builder setOpNftokenAcceptOffer(OperationNFTokenAcceptOffer operationNFTokenAcceptOffer) {
                copyOnWrite();
                ((SigningInput) this.instance).setOpNftokenAcceptOffer(operationNFTokenAcceptOffer);
                return this;
            }

            public Builder setOpNftokenBurn(OperationNFTokenBurn operationNFTokenBurn) {
                copyOnWrite();
                ((SigningInput) this.instance).setOpNftokenBurn(operationNFTokenBurn);
                return this;
            }

            public Builder setOpNftokenCancelOffer(OperationNFTokenCancelOffer operationNFTokenCancelOffer) {
                copyOnWrite();
                ((SigningInput) this.instance).setOpNftokenCancelOffer(operationNFTokenCancelOffer);
                return this;
            }

            public Builder setOpNftokenCreateOffer(OperationNFTokenCreateOffer operationNFTokenCreateOffer) {
                copyOnWrite();
                ((SigningInput) this.instance).setOpNftokenCreateOffer(operationNFTokenCreateOffer);
                return this;
            }

            public Builder setOpPayment(OperationPayment operationPayment) {
                copyOnWrite();
                ((SigningInput) this.instance).setOpPayment(operationPayment);
                return this;
            }

            public Builder setOpTrustSet(OperationTrustSet operationTrustSet) {
                copyOnWrite();
                ((SigningInput) this.instance).setOpTrustSet(operationTrustSet);
                return this;
            }

            public Builder setPrivateKey(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setPrivateKey(byteString);
                return this;
            }

            public Builder setSequence(int i) {
                copyOnWrite();
                ((SigningInput) this.instance).setSequence(i);
                return this;
            }

            private Builder() {
                super(SigningInput.DEFAULT_INSTANCE);
            }

            public Builder setOpNftokenAcceptOffer(OperationNFTokenAcceptOffer.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setOpNftokenAcceptOffer((OperationNFTokenAcceptOffer) builder.build());
                return this;
            }

            public Builder setOpNftokenBurn(OperationNFTokenBurn.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setOpNftokenBurn((OperationNFTokenBurn) builder.build());
                return this;
            }

            public Builder setOpNftokenCancelOffer(OperationNFTokenCancelOffer.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setOpNftokenCancelOffer((OperationNFTokenCancelOffer) builder.build());
                return this;
            }

            public Builder setOpNftokenCreateOffer(OperationNFTokenCreateOffer.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setOpNftokenCreateOffer((OperationNFTokenCreateOffer) builder.build());
                return this;
            }

            public Builder setOpPayment(OperationPayment.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setOpPayment((OperationPayment) builder.build());
                return this;
            }

            public Builder setOpTrustSet(OperationTrustSet.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setOpTrustSet((OperationTrustSet) builder.build());
                return this;
            }
        }

        public enum OperationOneofCase {
            OP_TRUST_SET(7),
            OP_PAYMENT(8),
            OP_NFTOKEN_BURN(9),
            OP_NFTOKEN_CREATE_OFFER(10),
            OP_NFTOKEN_ACCEPT_OFFER(11),
            OP_NFTOKEN_CANCEL_OFFER(12),
            OPERATIONONEOF_NOT_SET(0);
            
            private final int value;

            private OperationOneofCase(int i) {
                this.value = i;
            }

            public static OperationOneofCase forNumber(int i) {
                if (i == 0) {
                    return OPERATIONONEOF_NOT_SET;
                }
                switch (i) {
                    case 7:
                        return OP_TRUST_SET;
                    case 8:
                        return OP_PAYMENT;
                    case 9:
                        return OP_NFTOKEN_BURN;
                    case 10:
                        return OP_NFTOKEN_CREATE_OFFER;
                    case 11:
                        return OP_NFTOKEN_ACCEPT_OFFER;
                    case 12:
                        return OP_NFTOKEN_CANCEL_OFFER;
                    default:
                        return null;
                }
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static OperationOneofCase valueOf(int i) {
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
        public void clearAccount() {
            this.account_ = getDefaultInstance().getAccount();
        }

        /* access modifiers changed from: private */
        public void clearFee() {
            this.fee_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFlags() {
            this.flags_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearLastLedgerSequence() {
            this.lastLedgerSequence_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearOpNftokenAcceptOffer() {
            if (this.operationOneofCase_ == 11) {
                this.operationOneofCase_ = 0;
                this.operationOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearOpNftokenBurn() {
            if (this.operationOneofCase_ == 9) {
                this.operationOneofCase_ = 0;
                this.operationOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearOpNftokenCancelOffer() {
            if (this.operationOneofCase_ == 12) {
                this.operationOneofCase_ = 0;
                this.operationOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearOpNftokenCreateOffer() {
            if (this.operationOneofCase_ == 10) {
                this.operationOneofCase_ = 0;
                this.operationOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearOpPayment() {
            if (this.operationOneofCase_ == 8) {
                this.operationOneofCase_ = 0;
                this.operationOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearOpTrustSet() {
            if (this.operationOneofCase_ == 7) {
                this.operationOneofCase_ = 0;
                this.operationOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearOperationOneof() {
            this.operationOneofCase_ = 0;
            this.operationOneof_ = null;
        }

        /* access modifiers changed from: private */
        public void clearPrivateKey() {
            this.privateKey_ = getDefaultInstance().getPrivateKey();
        }

        /* access modifiers changed from: private */
        public void clearSequence() {
            this.sequence_ = 0;
        }

        public static SigningInput getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeOpNftokenAcceptOffer(OperationNFTokenAcceptOffer operationNFTokenAcceptOffer) {
            operationNFTokenAcceptOffer.getClass();
            if (this.operationOneofCase_ != 11 || this.operationOneof_ == OperationNFTokenAcceptOffer.getDefaultInstance()) {
                this.operationOneof_ = operationNFTokenAcceptOffer;
            } else {
                this.operationOneof_ = ((OperationNFTokenAcceptOffer.Builder) OperationNFTokenAcceptOffer.newBuilder((OperationNFTokenAcceptOffer) this.operationOneof_).mergeFrom(operationNFTokenAcceptOffer)).buildPartial();
            }
            this.operationOneofCase_ = 11;
        }

        /* access modifiers changed from: private */
        public void mergeOpNftokenBurn(OperationNFTokenBurn operationNFTokenBurn) {
            operationNFTokenBurn.getClass();
            if (this.operationOneofCase_ != 9 || this.operationOneof_ == OperationNFTokenBurn.getDefaultInstance()) {
                this.operationOneof_ = operationNFTokenBurn;
            } else {
                this.operationOneof_ = ((OperationNFTokenBurn.Builder) OperationNFTokenBurn.newBuilder((OperationNFTokenBurn) this.operationOneof_).mergeFrom(operationNFTokenBurn)).buildPartial();
            }
            this.operationOneofCase_ = 9;
        }

        /* access modifiers changed from: private */
        public void mergeOpNftokenCancelOffer(OperationNFTokenCancelOffer operationNFTokenCancelOffer) {
            operationNFTokenCancelOffer.getClass();
            if (this.operationOneofCase_ != 12 || this.operationOneof_ == OperationNFTokenCancelOffer.getDefaultInstance()) {
                this.operationOneof_ = operationNFTokenCancelOffer;
            } else {
                this.operationOneof_ = ((OperationNFTokenCancelOffer.Builder) OperationNFTokenCancelOffer.newBuilder((OperationNFTokenCancelOffer) this.operationOneof_).mergeFrom(operationNFTokenCancelOffer)).buildPartial();
            }
            this.operationOneofCase_ = 12;
        }

        /* access modifiers changed from: private */
        public void mergeOpNftokenCreateOffer(OperationNFTokenCreateOffer operationNFTokenCreateOffer) {
            operationNFTokenCreateOffer.getClass();
            if (this.operationOneofCase_ != 10 || this.operationOneof_ == OperationNFTokenCreateOffer.getDefaultInstance()) {
                this.operationOneof_ = operationNFTokenCreateOffer;
            } else {
                this.operationOneof_ = ((OperationNFTokenCreateOffer.Builder) OperationNFTokenCreateOffer.newBuilder((OperationNFTokenCreateOffer) this.operationOneof_).mergeFrom(operationNFTokenCreateOffer)).buildPartial();
            }
            this.operationOneofCase_ = 10;
        }

        /* access modifiers changed from: private */
        public void mergeOpPayment(OperationPayment operationPayment) {
            operationPayment.getClass();
            if (this.operationOneofCase_ != 8 || this.operationOneof_ == OperationPayment.getDefaultInstance()) {
                this.operationOneof_ = operationPayment;
            } else {
                this.operationOneof_ = ((OperationPayment.Builder) OperationPayment.newBuilder((OperationPayment) this.operationOneof_).mergeFrom(operationPayment)).buildPartial();
            }
            this.operationOneofCase_ = 8;
        }

        /* access modifiers changed from: private */
        public void mergeOpTrustSet(OperationTrustSet operationTrustSet) {
            operationTrustSet.getClass();
            if (this.operationOneofCase_ != 7 || this.operationOneof_ == OperationTrustSet.getDefaultInstance()) {
                this.operationOneof_ = operationTrustSet;
            } else {
                this.operationOneof_ = ((OperationTrustSet.Builder) OperationTrustSet.newBuilder((OperationTrustSet) this.operationOneof_).mergeFrom(operationTrustSet)).buildPartial();
            }
            this.operationOneofCase_ = 7;
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
        public void setAccount(String str) {
            str.getClass();
            this.account_ = str;
        }

        /* access modifiers changed from: private */
        public void setAccountBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.account_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setFee(long j) {
            this.fee_ = j;
        }

        /* access modifiers changed from: private */
        public void setFlags(long j) {
            this.flags_ = j;
        }

        /* access modifiers changed from: private */
        public void setLastLedgerSequence(int i) {
            this.lastLedgerSequence_ = i;
        }

        /* access modifiers changed from: private */
        public void setOpNftokenAcceptOffer(OperationNFTokenAcceptOffer operationNFTokenAcceptOffer) {
            operationNFTokenAcceptOffer.getClass();
            this.operationOneof_ = operationNFTokenAcceptOffer;
            this.operationOneofCase_ = 11;
        }

        /* access modifiers changed from: private */
        public void setOpNftokenBurn(OperationNFTokenBurn operationNFTokenBurn) {
            operationNFTokenBurn.getClass();
            this.operationOneof_ = operationNFTokenBurn;
            this.operationOneofCase_ = 9;
        }

        /* access modifiers changed from: private */
        public void setOpNftokenCancelOffer(OperationNFTokenCancelOffer operationNFTokenCancelOffer) {
            operationNFTokenCancelOffer.getClass();
            this.operationOneof_ = operationNFTokenCancelOffer;
            this.operationOneofCase_ = 12;
        }

        /* access modifiers changed from: private */
        public void setOpNftokenCreateOffer(OperationNFTokenCreateOffer operationNFTokenCreateOffer) {
            operationNFTokenCreateOffer.getClass();
            this.operationOneof_ = operationNFTokenCreateOffer;
            this.operationOneofCase_ = 10;
        }

        /* access modifiers changed from: private */
        public void setOpPayment(OperationPayment operationPayment) {
            operationPayment.getClass();
            this.operationOneof_ = operationPayment;
            this.operationOneofCase_ = 8;
        }

        /* access modifiers changed from: private */
        public void setOpTrustSet(OperationTrustSet operationTrustSet) {
            operationTrustSet.getClass();
            this.operationOneof_ = operationTrustSet;
            this.operationOneofCase_ = 7;
        }

        /* access modifiers changed from: private */
        public void setPrivateKey(ByteString byteString) {
            byteString.getClass();
            this.privateKey_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setSequence(int i) {
            this.sequence_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97621.f46577xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningInput();
                case 2:
                    return new Builder((C97621) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0001\u0000\u0001\f\f\u0000\u0000\u0000\u0001\u0002\u0002\u0004\u0003\u0004\u0004Ȉ\u0005\u0002\u0006\n\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000", new Object[]{"operationOneof_", "operationOneofCase_", "fee_", "sequence_", "lastLedgerSequence_", "account_", "flags_", "privateKey_", OperationTrustSet.class, OperationPayment.class, OperationNFTokenBurn.class, OperationNFTokenCreateOffer.class, OperationNFTokenAcceptOffer.class, OperationNFTokenCancelOffer.class});
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

        public String getAccount() {
            return this.account_;
        }

        public ByteString getAccountBytes() {
            return ByteString.copyFromUtf8(this.account_);
        }

        public long getFee() {
            return this.fee_;
        }

        public long getFlags() {
            return this.flags_;
        }

        public int getLastLedgerSequence() {
            return this.lastLedgerSequence_;
        }

        public OperationNFTokenAcceptOffer getOpNftokenAcceptOffer() {
            if (this.operationOneofCase_ == 11) {
                return (OperationNFTokenAcceptOffer) this.operationOneof_;
            }
            return OperationNFTokenAcceptOffer.getDefaultInstance();
        }

        public OperationNFTokenBurn getOpNftokenBurn() {
            if (this.operationOneofCase_ == 9) {
                return (OperationNFTokenBurn) this.operationOneof_;
            }
            return OperationNFTokenBurn.getDefaultInstance();
        }

        public OperationNFTokenCancelOffer getOpNftokenCancelOffer() {
            if (this.operationOneofCase_ == 12) {
                return (OperationNFTokenCancelOffer) this.operationOneof_;
            }
            return OperationNFTokenCancelOffer.getDefaultInstance();
        }

        public OperationNFTokenCreateOffer getOpNftokenCreateOffer() {
            if (this.operationOneofCase_ == 10) {
                return (OperationNFTokenCreateOffer) this.operationOneof_;
            }
            return OperationNFTokenCreateOffer.getDefaultInstance();
        }

        public OperationPayment getOpPayment() {
            if (this.operationOneofCase_ == 8) {
                return (OperationPayment) this.operationOneof_;
            }
            return OperationPayment.getDefaultInstance();
        }

        public OperationTrustSet getOpTrustSet() {
            if (this.operationOneofCase_ == 7) {
                return (OperationTrustSet) this.operationOneof_;
            }
            return OperationTrustSet.getDefaultInstance();
        }

        public OperationOneofCase getOperationOneofCase() {
            return OperationOneofCase.forNumber(this.operationOneofCase_);
        }

        public ByteString getPrivateKey() {
            return this.privateKey_;
        }

        public int getSequence() {
            return this.sequence_;
        }

        public boolean hasOpNftokenAcceptOffer() {
            if (this.operationOneofCase_ == 11) {
                return true;
            }
            return false;
        }

        public boolean hasOpNftokenBurn() {
            if (this.operationOneofCase_ == 9) {
                return true;
            }
            return false;
        }

        public boolean hasOpNftokenCancelOffer() {
            if (this.operationOneofCase_ == 12) {
                return true;
            }
            return false;
        }

        public boolean hasOpNftokenCreateOffer() {
            if (this.operationOneofCase_ == 10) {
                return true;
            }
            return false;
        }

        public boolean hasOpPayment() {
            if (this.operationOneofCase_ == 8) {
                return true;
            }
            return false;
        }

        public boolean hasOpTrustSet() {
            if (this.operationOneofCase_ == 7) {
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
        String getAccount();

        ByteString getAccountBytes();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        long getFee();

        long getFlags();

        int getLastLedgerSequence();

        OperationNFTokenAcceptOffer getOpNftokenAcceptOffer();

        OperationNFTokenBurn getOpNftokenBurn();

        OperationNFTokenCancelOffer getOpNftokenCancelOffer();

        OperationNFTokenCreateOffer getOpNftokenCreateOffer();

        OperationPayment getOpPayment();

        OperationTrustSet getOpTrustSet();

        SigningInput.OperationOneofCase getOperationOneofCase();

        ByteString getPrivateKey();

        int getSequence();

        boolean hasOpNftokenAcceptOffer();

        boolean hasOpNftokenBurn();

        boolean hasOpNftokenCancelOffer();

        boolean hasOpNftokenCreateOffer();

        boolean hasOpPayment();

        boolean hasOpTrustSet();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SigningOutput extends GeneratedMessageLite<SigningOutput, Builder> implements SigningOutputOrBuilder {
        /* access modifiers changed from: private */
        public static final SigningOutput DEFAULT_INSTANCE;
        public static final int ENCODED_FIELD_NUMBER = 1;
        public static final int ERROR_FIELD_NUMBER = 2;
        private static volatile im4<SigningOutput> PARSER;
        private ByteString encoded_ = ByteString.EMPTY;
        private int error_;

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningOutput, Builder> implements SigningOutputOrBuilder {
            public /* synthetic */ Builder(C97621 r1) {
                this();
            }

            public Builder clearEncoded() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearEncoded();
                return this;
            }

            public Builder clearError() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearError();
                return this;
            }

            public ByteString getEncoded() {
                return ((SigningOutput) this.instance).getEncoded();
            }

            public Common.SigningError getError() {
                return ((SigningOutput) this.instance).getError();
            }

            public int getErrorValue() {
                return ((SigningOutput) this.instance).getErrorValue();
            }

            public Builder setEncoded(ByteString byteString) {
                copyOnWrite();
                ((SigningOutput) this.instance).setEncoded(byteString);
                return this;
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
        public void clearError() {
            this.error_ = 0;
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

        /* access modifiers changed from: private */
        public void setError(Common.SigningError signingError) {
            this.error_ = signingError.getNumber();
        }

        /* access modifiers changed from: private */
        public void setErrorValue(int i) {
            this.error_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97621.f46577xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningOutput();
                case 2:
                    return new Builder((C97621) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\f", new Object[]{"encoded_", "error_"});
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

        Common.SigningError getError();

        int getErrorValue();

        /* synthetic */ boolean isInitialized();
    }

    private Ripple() {
    }

    public static void registerAllExtensions(C4987l lVar) {
    }
}
