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

public final class Binance {

    /* renamed from: wallet.core.jni.proto.Binance$1 */
    public static /* synthetic */ class C97281 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f46544xa1df5c61;

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
                f46544xa1df5c61 = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f46544xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f46544xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f46544xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f46544xa1df5c61     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f46544xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f46544xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wallet.core.jni.proto.Binance.C97281.<clinit>():void");
        }
    }

    public static final class CancelTradeOrder extends GeneratedMessageLite<CancelTradeOrder, Builder> implements CancelTradeOrderOrBuilder {
        /* access modifiers changed from: private */
        public static final CancelTradeOrder DEFAULT_INSTANCE;
        private static volatile im4<CancelTradeOrder> PARSER = null;
        public static final int REFID_FIELD_NUMBER = 3;
        public static final int SENDER_FIELD_NUMBER = 1;
        public static final int SYMBOL_FIELD_NUMBER = 2;
        private String refid_ = "";
        private ByteString sender_ = ByteString.EMPTY;
        private String symbol_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<CancelTradeOrder, Builder> implements CancelTradeOrderOrBuilder {
            public /* synthetic */ Builder(C97281 r1) {
                this();
            }

            public Builder clearRefid() {
                copyOnWrite();
                ((CancelTradeOrder) this.instance).clearRefid();
                return this;
            }

            public Builder clearSender() {
                copyOnWrite();
                ((CancelTradeOrder) this.instance).clearSender();
                return this;
            }

            public Builder clearSymbol() {
                copyOnWrite();
                ((CancelTradeOrder) this.instance).clearSymbol();
                return this;
            }

            public String getRefid() {
                return ((CancelTradeOrder) this.instance).getRefid();
            }

            public ByteString getRefidBytes() {
                return ((CancelTradeOrder) this.instance).getRefidBytes();
            }

            public ByteString getSender() {
                return ((CancelTradeOrder) this.instance).getSender();
            }

            public String getSymbol() {
                return ((CancelTradeOrder) this.instance).getSymbol();
            }

            public ByteString getSymbolBytes() {
                return ((CancelTradeOrder) this.instance).getSymbolBytes();
            }

            public Builder setRefid(String str) {
                copyOnWrite();
                ((CancelTradeOrder) this.instance).setRefid(str);
                return this;
            }

            public Builder setRefidBytes(ByteString byteString) {
                copyOnWrite();
                ((CancelTradeOrder) this.instance).setRefidBytes(byteString);
                return this;
            }

            public Builder setSender(ByteString byteString) {
                copyOnWrite();
                ((CancelTradeOrder) this.instance).setSender(byteString);
                return this;
            }

            public Builder setSymbol(String str) {
                copyOnWrite();
                ((CancelTradeOrder) this.instance).setSymbol(str);
                return this;
            }

            public Builder setSymbolBytes(ByteString byteString) {
                copyOnWrite();
                ((CancelTradeOrder) this.instance).setSymbolBytes(byteString);
                return this;
            }

            private Builder() {
                super(CancelTradeOrder.DEFAULT_INSTANCE);
            }
        }

        static {
            CancelTradeOrder cancelTradeOrder = new CancelTradeOrder();
            DEFAULT_INSTANCE = cancelTradeOrder;
            GeneratedMessageLite.registerDefaultInstance(CancelTradeOrder.class, cancelTradeOrder);
        }

        private CancelTradeOrder() {
        }

        /* access modifiers changed from: private */
        public void clearRefid() {
            this.refid_ = getDefaultInstance().getRefid();
        }

        /* access modifiers changed from: private */
        public void clearSender() {
            this.sender_ = getDefaultInstance().getSender();
        }

        /* access modifiers changed from: private */
        public void clearSymbol() {
            this.symbol_ = getDefaultInstance().getSymbol();
        }

        public static CancelTradeOrder getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static CancelTradeOrder parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CancelTradeOrder) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CancelTradeOrder parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CancelTradeOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<CancelTradeOrder> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setRefid(String str) {
            str.getClass();
            this.refid_ = str;
        }

        /* access modifiers changed from: private */
        public void setRefidBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.refid_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setSender(ByteString byteString) {
            byteString.getClass();
            this.sender_ = byteString;
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
            switch (C97281.f46544xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new CancelTradeOrder();
                case 2:
                    return new Builder((C97281) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0003Ȉ", new Object[]{"sender_", "symbol_", "refid_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<CancelTradeOrder> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (CancelTradeOrder.class) {
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

        public String getRefid() {
            return this.refid_;
        }

        public ByteString getRefidBytes() {
            return ByteString.copyFromUtf8(this.refid_);
        }

        public ByteString getSender() {
            return this.sender_;
        }

        public String getSymbol() {
            return this.symbol_;
        }

        public ByteString getSymbolBytes() {
            return ByteString.copyFromUtf8(this.symbol_);
        }

        public static Builder newBuilder(CancelTradeOrder cancelTradeOrder) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(cancelTradeOrder);
        }

        public static CancelTradeOrder parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (CancelTradeOrder) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static CancelTradeOrder parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (CancelTradeOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static CancelTradeOrder parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CancelTradeOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CancelTradeOrder parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (CancelTradeOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static CancelTradeOrder parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CancelTradeOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CancelTradeOrder parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (CancelTradeOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static CancelTradeOrder parseFrom(InputStream inputStream) throws IOException {
            return (CancelTradeOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CancelTradeOrder parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (CancelTradeOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static CancelTradeOrder parseFrom(C4969g gVar) throws IOException {
            return (CancelTradeOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static CancelTradeOrder parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (CancelTradeOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface CancelTradeOrderOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getRefid();

        ByteString getRefidBytes();

        ByteString getSender();

        String getSymbol();

        ByteString getSymbolBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class ClaimHTLOrder extends GeneratedMessageLite<ClaimHTLOrder, Builder> implements ClaimHTLOrderOrBuilder {
        /* access modifiers changed from: private */
        public static final ClaimHTLOrder DEFAULT_INSTANCE;
        public static final int FROM_FIELD_NUMBER = 1;
        private static volatile im4<ClaimHTLOrder> PARSER = null;
        public static final int RANDOM_NUMBER_FIELD_NUMBER = 3;
        public static final int SWAP_ID_FIELD_NUMBER = 2;
        private ByteString from_;
        private ByteString randomNumber_;
        private ByteString swapId_;

        public static final class Builder extends GeneratedMessageLite.C4930a<ClaimHTLOrder, Builder> implements ClaimHTLOrderOrBuilder {
            public /* synthetic */ Builder(C97281 r1) {
                this();
            }

            public Builder clearFrom() {
                copyOnWrite();
                ((ClaimHTLOrder) this.instance).clearFrom();
                return this;
            }

            public Builder clearRandomNumber() {
                copyOnWrite();
                ((ClaimHTLOrder) this.instance).clearRandomNumber();
                return this;
            }

            public Builder clearSwapId() {
                copyOnWrite();
                ((ClaimHTLOrder) this.instance).clearSwapId();
                return this;
            }

            public ByteString getFrom() {
                return ((ClaimHTLOrder) this.instance).getFrom();
            }

            public ByteString getRandomNumber() {
                return ((ClaimHTLOrder) this.instance).getRandomNumber();
            }

            public ByteString getSwapId() {
                return ((ClaimHTLOrder) this.instance).getSwapId();
            }

            public Builder setFrom(ByteString byteString) {
                copyOnWrite();
                ((ClaimHTLOrder) this.instance).setFrom(byteString);
                return this;
            }

            public Builder setRandomNumber(ByteString byteString) {
                copyOnWrite();
                ((ClaimHTLOrder) this.instance).setRandomNumber(byteString);
                return this;
            }

            public Builder setSwapId(ByteString byteString) {
                copyOnWrite();
                ((ClaimHTLOrder) this.instance).setSwapId(byteString);
                return this;
            }

            private Builder() {
                super(ClaimHTLOrder.DEFAULT_INSTANCE);
            }
        }

        static {
            ClaimHTLOrder claimHTLOrder = new ClaimHTLOrder();
            DEFAULT_INSTANCE = claimHTLOrder;
            GeneratedMessageLite.registerDefaultInstance(ClaimHTLOrder.class, claimHTLOrder);
        }

        private ClaimHTLOrder() {
            ByteString byteString = ByteString.EMPTY;
            this.from_ = byteString;
            this.swapId_ = byteString;
            this.randomNumber_ = byteString;
        }

        /* access modifiers changed from: private */
        public void clearFrom() {
            this.from_ = getDefaultInstance().getFrom();
        }

        /* access modifiers changed from: private */
        public void clearRandomNumber() {
            this.randomNumber_ = getDefaultInstance().getRandomNumber();
        }

        /* access modifiers changed from: private */
        public void clearSwapId() {
            this.swapId_ = getDefaultInstance().getSwapId();
        }

        public static ClaimHTLOrder getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ClaimHTLOrder parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ClaimHTLOrder) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClaimHTLOrder parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ClaimHTLOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<ClaimHTLOrder> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setFrom(ByteString byteString) {
            byteString.getClass();
            this.from_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setRandomNumber(ByteString byteString) {
            byteString.getClass();
            this.randomNumber_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setSwapId(ByteString byteString) {
            byteString.getClass();
            this.swapId_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97281.f46544xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new ClaimHTLOrder();
                case 2:
                    return new Builder((C97281) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\n\u0003\n", new Object[]{"from_", "swapId_", "randomNumber_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<ClaimHTLOrder> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (ClaimHTLOrder.class) {
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

        public ByteString getFrom() {
            return this.from_;
        }

        public ByteString getRandomNumber() {
            return this.randomNumber_;
        }

        public ByteString getSwapId() {
            return this.swapId_;
        }

        public static Builder newBuilder(ClaimHTLOrder claimHTLOrder) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(claimHTLOrder);
        }

        public static ClaimHTLOrder parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (ClaimHTLOrder) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static ClaimHTLOrder parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (ClaimHTLOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static ClaimHTLOrder parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ClaimHTLOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ClaimHTLOrder parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (ClaimHTLOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static ClaimHTLOrder parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ClaimHTLOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ClaimHTLOrder parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (ClaimHTLOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static ClaimHTLOrder parseFrom(InputStream inputStream) throws IOException {
            return (ClaimHTLOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClaimHTLOrder parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (ClaimHTLOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static ClaimHTLOrder parseFrom(C4969g gVar) throws IOException {
            return (ClaimHTLOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static ClaimHTLOrder parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (ClaimHTLOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface ClaimHTLOrderOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        ByteString getFrom();

        ByteString getRandomNumber();

        ByteString getSwapId();

        /* synthetic */ boolean isInitialized();
    }

    public static final class DepositHTLTOrder extends GeneratedMessageLite<DepositHTLTOrder, Builder> implements DepositHTLTOrderOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final DepositHTLTOrder DEFAULT_INSTANCE;
        public static final int FROM_FIELD_NUMBER = 1;
        private static volatile im4<DepositHTLTOrder> PARSER = null;
        public static final int SWAP_ID_FIELD_NUMBER = 3;
        private C5011t.C5020i<SendOrder.Token> amount_ = GeneratedMessageLite.emptyProtobufList();
        private ByteString from_;
        private ByteString swapId_;

        public static final class Builder extends GeneratedMessageLite.C4930a<DepositHTLTOrder, Builder> implements DepositHTLTOrderOrBuilder {
            public /* synthetic */ Builder(C97281 r1) {
                this();
            }

            public Builder addAllAmount(Iterable<? extends SendOrder.Token> iterable) {
                copyOnWrite();
                ((DepositHTLTOrder) this.instance).addAllAmount(iterable);
                return this;
            }

            public Builder addAmount(SendOrder.Token token) {
                copyOnWrite();
                ((DepositHTLTOrder) this.instance).addAmount(token);
                return this;
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((DepositHTLTOrder) this.instance).clearAmount();
                return this;
            }

            public Builder clearFrom() {
                copyOnWrite();
                ((DepositHTLTOrder) this.instance).clearFrom();
                return this;
            }

            public Builder clearSwapId() {
                copyOnWrite();
                ((DepositHTLTOrder) this.instance).clearSwapId();
                return this;
            }

            public SendOrder.Token getAmount(int i) {
                return ((DepositHTLTOrder) this.instance).getAmount(i);
            }

            public int getAmountCount() {
                return ((DepositHTLTOrder) this.instance).getAmountCount();
            }

            public List<SendOrder.Token> getAmountList() {
                return Collections.unmodifiableList(((DepositHTLTOrder) this.instance).getAmountList());
            }

            public ByteString getFrom() {
                return ((DepositHTLTOrder) this.instance).getFrom();
            }

            public ByteString getSwapId() {
                return ((DepositHTLTOrder) this.instance).getSwapId();
            }

            public Builder removeAmount(int i) {
                copyOnWrite();
                ((DepositHTLTOrder) this.instance).removeAmount(i);
                return this;
            }

            public Builder setAmount(int i, SendOrder.Token token) {
                copyOnWrite();
                ((DepositHTLTOrder) this.instance).setAmount(i, token);
                return this;
            }

            public Builder setFrom(ByteString byteString) {
                copyOnWrite();
                ((DepositHTLTOrder) this.instance).setFrom(byteString);
                return this;
            }

            public Builder setSwapId(ByteString byteString) {
                copyOnWrite();
                ((DepositHTLTOrder) this.instance).setSwapId(byteString);
                return this;
            }

            private Builder() {
                super(DepositHTLTOrder.DEFAULT_INSTANCE);
            }

            public Builder addAmount(int i, SendOrder.Token token) {
                copyOnWrite();
                ((DepositHTLTOrder) this.instance).addAmount(i, token);
                return this;
            }

            public Builder setAmount(int i, SendOrder.Token.Builder builder) {
                copyOnWrite();
                ((DepositHTLTOrder) this.instance).setAmount(i, (SendOrder.Token) builder.build());
                return this;
            }

            public Builder addAmount(SendOrder.Token.Builder builder) {
                copyOnWrite();
                ((DepositHTLTOrder) this.instance).addAmount((SendOrder.Token) builder.build());
                return this;
            }

            public Builder addAmount(int i, SendOrder.Token.Builder builder) {
                copyOnWrite();
                ((DepositHTLTOrder) this.instance).addAmount(i, (SendOrder.Token) builder.build());
                return this;
            }
        }

        static {
            DepositHTLTOrder depositHTLTOrder = new DepositHTLTOrder();
            DEFAULT_INSTANCE = depositHTLTOrder;
            GeneratedMessageLite.registerDefaultInstance(DepositHTLTOrder.class, depositHTLTOrder);
        }

        private DepositHTLTOrder() {
            ByteString byteString = ByteString.EMPTY;
            this.from_ = byteString;
            this.swapId_ = byteString;
        }

        /* access modifiers changed from: private */
        public void addAllAmount(Iterable<? extends SendOrder.Token> iterable) {
            ensureAmountIsMutable();
            C4949a.addAll(iterable, this.amount_);
        }

        /* access modifiers changed from: private */
        public void addAmount(SendOrder.Token token) {
            token.getClass();
            ensureAmountIsMutable();
            this.amount_.add(token);
        }

        /* access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearFrom() {
            this.from_ = getDefaultInstance().getFrom();
        }

        /* access modifiers changed from: private */
        public void clearSwapId() {
            this.swapId_ = getDefaultInstance().getSwapId();
        }

        private void ensureAmountIsMutable() {
            C5011t.C5020i<SendOrder.Token> iVar = this.amount_;
            if (!iVar.mo37090v()) {
                this.amount_ = GeneratedMessageLite.mutableCopy(iVar);
            }
        }

        public static DepositHTLTOrder getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static DepositHTLTOrder parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DepositHTLTOrder) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DepositHTLTOrder parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DepositHTLTOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<DepositHTLTOrder> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeAmount(int i) {
            ensureAmountIsMutable();
            this.amount_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setAmount(int i, SendOrder.Token token) {
            token.getClass();
            ensureAmountIsMutable();
            this.amount_.set(i, token);
        }

        /* access modifiers changed from: private */
        public void setFrom(ByteString byteString) {
            byteString.getClass();
            this.from_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setSwapId(ByteString byteString) {
            byteString.getClass();
            this.swapId_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97281.f46544xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new DepositHTLTOrder();
                case 2:
                    return new Builder((C97281) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\n\u0002\u001b\u0003\n", new Object[]{"from_", "amount_", SendOrder.Token.class, "swapId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<DepositHTLTOrder> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (DepositHTLTOrder.class) {
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

        public SendOrder.Token getAmount(int i) {
            return this.amount_.get(i);
        }

        public int getAmountCount() {
            return this.amount_.size();
        }

        public List<SendOrder.Token> getAmountList() {
            return this.amount_;
        }

        public SendOrder.TokenOrBuilder getAmountOrBuilder(int i) {
            return this.amount_.get(i);
        }

        public List<? extends SendOrder.TokenOrBuilder> getAmountOrBuilderList() {
            return this.amount_;
        }

        public ByteString getFrom() {
            return this.from_;
        }

        public ByteString getSwapId() {
            return this.swapId_;
        }

        public static Builder newBuilder(DepositHTLTOrder depositHTLTOrder) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(depositHTLTOrder);
        }

        public static DepositHTLTOrder parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (DepositHTLTOrder) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static DepositHTLTOrder parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (DepositHTLTOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static DepositHTLTOrder parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DepositHTLTOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* access modifiers changed from: private */
        public void addAmount(int i, SendOrder.Token token) {
            token.getClass();
            ensureAmountIsMutable();
            this.amount_.add(i, token);
        }

        public static DepositHTLTOrder parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (DepositHTLTOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static DepositHTLTOrder parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DepositHTLTOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DepositHTLTOrder parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (DepositHTLTOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static DepositHTLTOrder parseFrom(InputStream inputStream) throws IOException {
            return (DepositHTLTOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DepositHTLTOrder parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (DepositHTLTOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static DepositHTLTOrder parseFrom(C4969g gVar) throws IOException {
            return (DepositHTLTOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static DepositHTLTOrder parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (DepositHTLTOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface DepositHTLTOrderOrBuilder extends qu3 {
        SendOrder.Token getAmount(int i);

        int getAmountCount();

        List<SendOrder.Token> getAmountList();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        ByteString getFrom();

        ByteString getSwapId();

        /* synthetic */ boolean isInitialized();
    }

    public static final class HTLTOrder extends GeneratedMessageLite<HTLTOrder, Builder> implements HTLTOrderOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 7;
        public static final int CROSS_CHAIN_FIELD_NUMBER = 10;
        /* access modifiers changed from: private */
        public static final HTLTOrder DEFAULT_INSTANCE;
        public static final int EXPECTED_INCOME_FIELD_NUMBER = 8;
        public static final int FROM_FIELD_NUMBER = 1;
        public static final int HEIGHT_SPAN_FIELD_NUMBER = 9;
        private static volatile im4<HTLTOrder> PARSER = null;
        public static final int RANDOM_NUMBER_HASH_FIELD_NUMBER = 5;
        public static final int RECIPIENT_OTHER_CHAIN_FIELD_NUMBER = 3;
        public static final int SENDER_OTHER_CHAIN_FIELD_NUMBER = 4;
        public static final int TIMESTAMP_FIELD_NUMBER = 6;
        public static final int TO_FIELD_NUMBER = 2;
        private C5011t.C5020i<SendOrder.Token> amount_;
        private boolean crossChain_;
        private String expectedIncome_;
        private ByteString from_;
        private long heightSpan_;
        private ByteString randomNumberHash_;
        private String recipientOtherChain_ = "";
        private String senderOtherChain_ = "";
        private long timestamp_;
        private ByteString to_;

        public static final class Builder extends GeneratedMessageLite.C4930a<HTLTOrder, Builder> implements HTLTOrderOrBuilder {
            public /* synthetic */ Builder(C97281 r1) {
                this();
            }

            public Builder addAllAmount(Iterable<? extends SendOrder.Token> iterable) {
                copyOnWrite();
                ((HTLTOrder) this.instance).addAllAmount(iterable);
                return this;
            }

            public Builder addAmount(SendOrder.Token token) {
                copyOnWrite();
                ((HTLTOrder) this.instance).addAmount(token);
                return this;
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((HTLTOrder) this.instance).clearAmount();
                return this;
            }

            public Builder clearCrossChain() {
                copyOnWrite();
                ((HTLTOrder) this.instance).clearCrossChain();
                return this;
            }

            public Builder clearExpectedIncome() {
                copyOnWrite();
                ((HTLTOrder) this.instance).clearExpectedIncome();
                return this;
            }

            public Builder clearFrom() {
                copyOnWrite();
                ((HTLTOrder) this.instance).clearFrom();
                return this;
            }

            public Builder clearHeightSpan() {
                copyOnWrite();
                ((HTLTOrder) this.instance).clearHeightSpan();
                return this;
            }

            public Builder clearRandomNumberHash() {
                copyOnWrite();
                ((HTLTOrder) this.instance).clearRandomNumberHash();
                return this;
            }

            public Builder clearRecipientOtherChain() {
                copyOnWrite();
                ((HTLTOrder) this.instance).clearRecipientOtherChain();
                return this;
            }

            public Builder clearSenderOtherChain() {
                copyOnWrite();
                ((HTLTOrder) this.instance).clearSenderOtherChain();
                return this;
            }

            public Builder clearTimestamp() {
                copyOnWrite();
                ((HTLTOrder) this.instance).clearTimestamp();
                return this;
            }

            public Builder clearTo() {
                copyOnWrite();
                ((HTLTOrder) this.instance).clearTo();
                return this;
            }

            public SendOrder.Token getAmount(int i) {
                return ((HTLTOrder) this.instance).getAmount(i);
            }

            public int getAmountCount() {
                return ((HTLTOrder) this.instance).getAmountCount();
            }

            public List<SendOrder.Token> getAmountList() {
                return Collections.unmodifiableList(((HTLTOrder) this.instance).getAmountList());
            }

            public boolean getCrossChain() {
                return ((HTLTOrder) this.instance).getCrossChain();
            }

            public String getExpectedIncome() {
                return ((HTLTOrder) this.instance).getExpectedIncome();
            }

            public ByteString getExpectedIncomeBytes() {
                return ((HTLTOrder) this.instance).getExpectedIncomeBytes();
            }

            public ByteString getFrom() {
                return ((HTLTOrder) this.instance).getFrom();
            }

            public long getHeightSpan() {
                return ((HTLTOrder) this.instance).getHeightSpan();
            }

            public ByteString getRandomNumberHash() {
                return ((HTLTOrder) this.instance).getRandomNumberHash();
            }

            public String getRecipientOtherChain() {
                return ((HTLTOrder) this.instance).getRecipientOtherChain();
            }

            public ByteString getRecipientOtherChainBytes() {
                return ((HTLTOrder) this.instance).getRecipientOtherChainBytes();
            }

            public String getSenderOtherChain() {
                return ((HTLTOrder) this.instance).getSenderOtherChain();
            }

            public ByteString getSenderOtherChainBytes() {
                return ((HTLTOrder) this.instance).getSenderOtherChainBytes();
            }

            public long getTimestamp() {
                return ((HTLTOrder) this.instance).getTimestamp();
            }

            public ByteString getTo() {
                return ((HTLTOrder) this.instance).getTo();
            }

            public Builder removeAmount(int i) {
                copyOnWrite();
                ((HTLTOrder) this.instance).removeAmount(i);
                return this;
            }

            public Builder setAmount(int i, SendOrder.Token token) {
                copyOnWrite();
                ((HTLTOrder) this.instance).setAmount(i, token);
                return this;
            }

            public Builder setCrossChain(boolean z) {
                copyOnWrite();
                ((HTLTOrder) this.instance).setCrossChain(z);
                return this;
            }

            public Builder setExpectedIncome(String str) {
                copyOnWrite();
                ((HTLTOrder) this.instance).setExpectedIncome(str);
                return this;
            }

            public Builder setExpectedIncomeBytes(ByteString byteString) {
                copyOnWrite();
                ((HTLTOrder) this.instance).setExpectedIncomeBytes(byteString);
                return this;
            }

            public Builder setFrom(ByteString byteString) {
                copyOnWrite();
                ((HTLTOrder) this.instance).setFrom(byteString);
                return this;
            }

            public Builder setHeightSpan(long j) {
                copyOnWrite();
                ((HTLTOrder) this.instance).setHeightSpan(j);
                return this;
            }

            public Builder setRandomNumberHash(ByteString byteString) {
                copyOnWrite();
                ((HTLTOrder) this.instance).setRandomNumberHash(byteString);
                return this;
            }

            public Builder setRecipientOtherChain(String str) {
                copyOnWrite();
                ((HTLTOrder) this.instance).setRecipientOtherChain(str);
                return this;
            }

            public Builder setRecipientOtherChainBytes(ByteString byteString) {
                copyOnWrite();
                ((HTLTOrder) this.instance).setRecipientOtherChainBytes(byteString);
                return this;
            }

            public Builder setSenderOtherChain(String str) {
                copyOnWrite();
                ((HTLTOrder) this.instance).setSenderOtherChain(str);
                return this;
            }

            public Builder setSenderOtherChainBytes(ByteString byteString) {
                copyOnWrite();
                ((HTLTOrder) this.instance).setSenderOtherChainBytes(byteString);
                return this;
            }

            public Builder setTimestamp(long j) {
                copyOnWrite();
                ((HTLTOrder) this.instance).setTimestamp(j);
                return this;
            }

            public Builder setTo(ByteString byteString) {
                copyOnWrite();
                ((HTLTOrder) this.instance).setTo(byteString);
                return this;
            }

            private Builder() {
                super(HTLTOrder.DEFAULT_INSTANCE);
            }

            public Builder addAmount(int i, SendOrder.Token token) {
                copyOnWrite();
                ((HTLTOrder) this.instance).addAmount(i, token);
                return this;
            }

            public Builder setAmount(int i, SendOrder.Token.Builder builder) {
                copyOnWrite();
                ((HTLTOrder) this.instance).setAmount(i, (SendOrder.Token) builder.build());
                return this;
            }

            public Builder addAmount(SendOrder.Token.Builder builder) {
                copyOnWrite();
                ((HTLTOrder) this.instance).addAmount((SendOrder.Token) builder.build());
                return this;
            }

            public Builder addAmount(int i, SendOrder.Token.Builder builder) {
                copyOnWrite();
                ((HTLTOrder) this.instance).addAmount(i, (SendOrder.Token) builder.build());
                return this;
            }
        }

        static {
            HTLTOrder hTLTOrder = new HTLTOrder();
            DEFAULT_INSTANCE = hTLTOrder;
            GeneratedMessageLite.registerDefaultInstance(HTLTOrder.class, hTLTOrder);
        }

        private HTLTOrder() {
            ByteString byteString = ByteString.EMPTY;
            this.from_ = byteString;
            this.to_ = byteString;
            this.randomNumberHash_ = byteString;
            this.amount_ = GeneratedMessageLite.emptyProtobufList();
            this.expectedIncome_ = "";
        }

        /* access modifiers changed from: private */
        public void addAllAmount(Iterable<? extends SendOrder.Token> iterable) {
            ensureAmountIsMutable();
            C4949a.addAll(iterable, this.amount_);
        }

        /* access modifiers changed from: private */
        public void addAmount(SendOrder.Token token) {
            token.getClass();
            ensureAmountIsMutable();
            this.amount_.add(token);
        }

        /* access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearCrossChain() {
            this.crossChain_ = false;
        }

        /* access modifiers changed from: private */
        public void clearExpectedIncome() {
            this.expectedIncome_ = getDefaultInstance().getExpectedIncome();
        }

        /* access modifiers changed from: private */
        public void clearFrom() {
            this.from_ = getDefaultInstance().getFrom();
        }

        /* access modifiers changed from: private */
        public void clearHeightSpan() {
            this.heightSpan_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearRandomNumberHash() {
            this.randomNumberHash_ = getDefaultInstance().getRandomNumberHash();
        }

        /* access modifiers changed from: private */
        public void clearRecipientOtherChain() {
            this.recipientOtherChain_ = getDefaultInstance().getRecipientOtherChain();
        }

        /* access modifiers changed from: private */
        public void clearSenderOtherChain() {
            this.senderOtherChain_ = getDefaultInstance().getSenderOtherChain();
        }

        /* access modifiers changed from: private */
        public void clearTimestamp() {
            this.timestamp_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTo() {
            this.to_ = getDefaultInstance().getTo();
        }

        private void ensureAmountIsMutable() {
            C5011t.C5020i<SendOrder.Token> iVar = this.amount_;
            if (!iVar.mo37090v()) {
                this.amount_ = GeneratedMessageLite.mutableCopy(iVar);
            }
        }

        public static HTLTOrder getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static HTLTOrder parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (HTLTOrder) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HTLTOrder parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (HTLTOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<HTLTOrder> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeAmount(int i) {
            ensureAmountIsMutable();
            this.amount_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setAmount(int i, SendOrder.Token token) {
            token.getClass();
            ensureAmountIsMutable();
            this.amount_.set(i, token);
        }

        /* access modifiers changed from: private */
        public void setCrossChain(boolean z) {
            this.crossChain_ = z;
        }

        /* access modifiers changed from: private */
        public void setExpectedIncome(String str) {
            str.getClass();
            this.expectedIncome_ = str;
        }

        /* access modifiers changed from: private */
        public void setExpectedIncomeBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.expectedIncome_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setFrom(ByteString byteString) {
            byteString.getClass();
            this.from_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setHeightSpan(long j) {
            this.heightSpan_ = j;
        }

        /* access modifiers changed from: private */
        public void setRandomNumberHash(ByteString byteString) {
            byteString.getClass();
            this.randomNumberHash_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setRecipientOtherChain(String str) {
            str.getClass();
            this.recipientOtherChain_ = str;
        }

        /* access modifiers changed from: private */
        public void setRecipientOtherChainBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.recipientOtherChain_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setSenderOtherChain(String str) {
            str.getClass();
            this.senderOtherChain_ = str;
        }

        /* access modifiers changed from: private */
        public void setSenderOtherChainBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.senderOtherChain_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setTimestamp(long j) {
            this.timestamp_ = j;
        }

        /* access modifiers changed from: private */
        public void setTo(ByteString byteString) {
            byteString.getClass();
            this.to_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97281.f46544xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new HTLTOrder();
                case 2:
                    return new Builder((C97281) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0001\u0000\u0001\n\u0002\n\u0003Ȉ\u0004Ȉ\u0005\n\u0006\u0002\u0007\u001b\bȈ\t\u0002\n\u0007", new Object[]{"from_", "to_", "recipientOtherChain_", "senderOtherChain_", "randomNumberHash_", "timestamp_", "amount_", SendOrder.Token.class, "expectedIncome_", "heightSpan_", "crossChain_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<HTLTOrder> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (HTLTOrder.class) {
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

        public SendOrder.Token getAmount(int i) {
            return this.amount_.get(i);
        }

        public int getAmountCount() {
            return this.amount_.size();
        }

        public List<SendOrder.Token> getAmountList() {
            return this.amount_;
        }

        public SendOrder.TokenOrBuilder getAmountOrBuilder(int i) {
            return this.amount_.get(i);
        }

        public List<? extends SendOrder.TokenOrBuilder> getAmountOrBuilderList() {
            return this.amount_;
        }

        public boolean getCrossChain() {
            return this.crossChain_;
        }

        public String getExpectedIncome() {
            return this.expectedIncome_;
        }

        public ByteString getExpectedIncomeBytes() {
            return ByteString.copyFromUtf8(this.expectedIncome_);
        }

        public ByteString getFrom() {
            return this.from_;
        }

        public long getHeightSpan() {
            return this.heightSpan_;
        }

        public ByteString getRandomNumberHash() {
            return this.randomNumberHash_;
        }

        public String getRecipientOtherChain() {
            return this.recipientOtherChain_;
        }

        public ByteString getRecipientOtherChainBytes() {
            return ByteString.copyFromUtf8(this.recipientOtherChain_);
        }

        public String getSenderOtherChain() {
            return this.senderOtherChain_;
        }

        public ByteString getSenderOtherChainBytes() {
            return ByteString.copyFromUtf8(this.senderOtherChain_);
        }

        public long getTimestamp() {
            return this.timestamp_;
        }

        public ByteString getTo() {
            return this.to_;
        }

        public static Builder newBuilder(HTLTOrder hTLTOrder) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(hTLTOrder);
        }

        public static HTLTOrder parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (HTLTOrder) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static HTLTOrder parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (HTLTOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static HTLTOrder parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (HTLTOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* access modifiers changed from: private */
        public void addAmount(int i, SendOrder.Token token) {
            token.getClass();
            ensureAmountIsMutable();
            this.amount_.add(i, token);
        }

        public static HTLTOrder parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (HTLTOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static HTLTOrder parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (HTLTOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static HTLTOrder parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (HTLTOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static HTLTOrder parseFrom(InputStream inputStream) throws IOException {
            return (HTLTOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HTLTOrder parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (HTLTOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static HTLTOrder parseFrom(C4969g gVar) throws IOException {
            return (HTLTOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static HTLTOrder parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (HTLTOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface HTLTOrderOrBuilder extends qu3 {
        SendOrder.Token getAmount(int i);

        int getAmountCount();

        List<SendOrder.Token> getAmountList();

        boolean getCrossChain();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getExpectedIncome();

        ByteString getExpectedIncomeBytes();

        ByteString getFrom();

        long getHeightSpan();

        ByteString getRandomNumberHash();

        String getRecipientOtherChain();

        ByteString getRecipientOtherChainBytes();

        String getSenderOtherChain();

        ByteString getSenderOtherChainBytes();

        long getTimestamp();

        ByteString getTo();

        /* synthetic */ boolean isInitialized();
    }

    public static final class RefundHTLTOrder extends GeneratedMessageLite<RefundHTLTOrder, Builder> implements RefundHTLTOrderOrBuilder {
        /* access modifiers changed from: private */
        public static final RefundHTLTOrder DEFAULT_INSTANCE;
        public static final int FROM_FIELD_NUMBER = 1;
        private static volatile im4<RefundHTLTOrder> PARSER = null;
        public static final int SWAP_ID_FIELD_NUMBER = 2;
        private ByteString from_;
        private ByteString swapId_;

        public static final class Builder extends GeneratedMessageLite.C4930a<RefundHTLTOrder, Builder> implements RefundHTLTOrderOrBuilder {
            public /* synthetic */ Builder(C97281 r1) {
                this();
            }

            public Builder clearFrom() {
                copyOnWrite();
                ((RefundHTLTOrder) this.instance).clearFrom();
                return this;
            }

            public Builder clearSwapId() {
                copyOnWrite();
                ((RefundHTLTOrder) this.instance).clearSwapId();
                return this;
            }

            public ByteString getFrom() {
                return ((RefundHTLTOrder) this.instance).getFrom();
            }

            public ByteString getSwapId() {
                return ((RefundHTLTOrder) this.instance).getSwapId();
            }

            public Builder setFrom(ByteString byteString) {
                copyOnWrite();
                ((RefundHTLTOrder) this.instance).setFrom(byteString);
                return this;
            }

            public Builder setSwapId(ByteString byteString) {
                copyOnWrite();
                ((RefundHTLTOrder) this.instance).setSwapId(byteString);
                return this;
            }

            private Builder() {
                super(RefundHTLTOrder.DEFAULT_INSTANCE);
            }
        }

        static {
            RefundHTLTOrder refundHTLTOrder = new RefundHTLTOrder();
            DEFAULT_INSTANCE = refundHTLTOrder;
            GeneratedMessageLite.registerDefaultInstance(RefundHTLTOrder.class, refundHTLTOrder);
        }

        private RefundHTLTOrder() {
            ByteString byteString = ByteString.EMPTY;
            this.from_ = byteString;
            this.swapId_ = byteString;
        }

        /* access modifiers changed from: private */
        public void clearFrom() {
            this.from_ = getDefaultInstance().getFrom();
        }

        /* access modifiers changed from: private */
        public void clearSwapId() {
            this.swapId_ = getDefaultInstance().getSwapId();
        }

        public static RefundHTLTOrder getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static RefundHTLTOrder parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RefundHTLTOrder) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RefundHTLTOrder parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (RefundHTLTOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<RefundHTLTOrder> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setFrom(ByteString byteString) {
            byteString.getClass();
            this.from_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setSwapId(ByteString byteString) {
            byteString.getClass();
            this.swapId_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97281.f46544xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new RefundHTLTOrder();
                case 2:
                    return new Builder((C97281) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\n", new Object[]{"from_", "swapId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<RefundHTLTOrder> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (RefundHTLTOrder.class) {
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

        public ByteString getFrom() {
            return this.from_;
        }

        public ByteString getSwapId() {
            return this.swapId_;
        }

        public static Builder newBuilder(RefundHTLTOrder refundHTLTOrder) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(refundHTLTOrder);
        }

        public static RefundHTLTOrder parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (RefundHTLTOrder) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static RefundHTLTOrder parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (RefundHTLTOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static RefundHTLTOrder parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (RefundHTLTOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RefundHTLTOrder parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (RefundHTLTOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static RefundHTLTOrder parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (RefundHTLTOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RefundHTLTOrder parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (RefundHTLTOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static RefundHTLTOrder parseFrom(InputStream inputStream) throws IOException {
            return (RefundHTLTOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RefundHTLTOrder parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (RefundHTLTOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static RefundHTLTOrder parseFrom(C4969g gVar) throws IOException {
            return (RefundHTLTOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static RefundHTLTOrder parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (RefundHTLTOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface RefundHTLTOrderOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        ByteString getFrom();

        ByteString getSwapId();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SendOrder extends GeneratedMessageLite<SendOrder, Builder> implements SendOrderOrBuilder {
        /* access modifiers changed from: private */
        public static final SendOrder DEFAULT_INSTANCE;
        public static final int INPUTS_FIELD_NUMBER = 1;
        public static final int OUTPUTS_FIELD_NUMBER = 2;
        private static volatile im4<SendOrder> PARSER;
        private C5011t.C5020i<Input> inputs_ = GeneratedMessageLite.emptyProtobufList();
        private C5011t.C5020i<Output> outputs_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.C4930a<SendOrder, Builder> implements SendOrderOrBuilder {
            public /* synthetic */ Builder(C97281 r1) {
                this();
            }

            public Builder addAllInputs(Iterable<? extends Input> iterable) {
                copyOnWrite();
                ((SendOrder) this.instance).addAllInputs(iterable);
                return this;
            }

            public Builder addAllOutputs(Iterable<? extends Output> iterable) {
                copyOnWrite();
                ((SendOrder) this.instance).addAllOutputs(iterable);
                return this;
            }

            public Builder addInputs(Input input) {
                copyOnWrite();
                ((SendOrder) this.instance).addInputs(input);
                return this;
            }

            public Builder addOutputs(Output output) {
                copyOnWrite();
                ((SendOrder) this.instance).addOutputs(output);
                return this;
            }

            public Builder clearInputs() {
                copyOnWrite();
                ((SendOrder) this.instance).clearInputs();
                return this;
            }

            public Builder clearOutputs() {
                copyOnWrite();
                ((SendOrder) this.instance).clearOutputs();
                return this;
            }

            public Input getInputs(int i) {
                return ((SendOrder) this.instance).getInputs(i);
            }

            public int getInputsCount() {
                return ((SendOrder) this.instance).getInputsCount();
            }

            public List<Input> getInputsList() {
                return Collections.unmodifiableList(((SendOrder) this.instance).getInputsList());
            }

            public Output getOutputs(int i) {
                return ((SendOrder) this.instance).getOutputs(i);
            }

            public int getOutputsCount() {
                return ((SendOrder) this.instance).getOutputsCount();
            }

            public List<Output> getOutputsList() {
                return Collections.unmodifiableList(((SendOrder) this.instance).getOutputsList());
            }

            public Builder removeInputs(int i) {
                copyOnWrite();
                ((SendOrder) this.instance).removeInputs(i);
                return this;
            }

            public Builder removeOutputs(int i) {
                copyOnWrite();
                ((SendOrder) this.instance).removeOutputs(i);
                return this;
            }

            public Builder setInputs(int i, Input input) {
                copyOnWrite();
                ((SendOrder) this.instance).setInputs(i, input);
                return this;
            }

            public Builder setOutputs(int i, Output output) {
                copyOnWrite();
                ((SendOrder) this.instance).setOutputs(i, output);
                return this;
            }

            private Builder() {
                super(SendOrder.DEFAULT_INSTANCE);
            }

            public Builder addInputs(int i, Input input) {
                copyOnWrite();
                ((SendOrder) this.instance).addInputs(i, input);
                return this;
            }

            public Builder addOutputs(int i, Output output) {
                copyOnWrite();
                ((SendOrder) this.instance).addOutputs(i, output);
                return this;
            }

            public Builder setInputs(int i, Input.Builder builder) {
                copyOnWrite();
                ((SendOrder) this.instance).setInputs(i, (Input) builder.build());
                return this;
            }

            public Builder setOutputs(int i, Output.Builder builder) {
                copyOnWrite();
                ((SendOrder) this.instance).setOutputs(i, (Output) builder.build());
                return this;
            }

            public Builder addInputs(Input.Builder builder) {
                copyOnWrite();
                ((SendOrder) this.instance).addInputs((Input) builder.build());
                return this;
            }

            public Builder addOutputs(Output.Builder builder) {
                copyOnWrite();
                ((SendOrder) this.instance).addOutputs((Output) builder.build());
                return this;
            }

            public Builder addInputs(int i, Input.Builder builder) {
                copyOnWrite();
                ((SendOrder) this.instance).addInputs(i, (Input) builder.build());
                return this;
            }

            public Builder addOutputs(int i, Output.Builder builder) {
                copyOnWrite();
                ((SendOrder) this.instance).addOutputs(i, (Output) builder.build());
                return this;
            }
        }

        public static final class Input extends GeneratedMessageLite<Input, Builder> implements InputOrBuilder {
            public static final int ADDRESS_FIELD_NUMBER = 1;
            public static final int COINS_FIELD_NUMBER = 2;
            /* access modifiers changed from: private */
            public static final Input DEFAULT_INSTANCE;
            private static volatile im4<Input> PARSER;
            private ByteString address_ = ByteString.EMPTY;
            private C5011t.C5020i<Token> coins_ = GeneratedMessageLite.emptyProtobufList();

            public static final class Builder extends GeneratedMessageLite.C4930a<Input, Builder> implements InputOrBuilder {
                public /* synthetic */ Builder(C97281 r1) {
                    this();
                }

                public Builder addAllCoins(Iterable<? extends Token> iterable) {
                    copyOnWrite();
                    ((Input) this.instance).addAllCoins(iterable);
                    return this;
                }

                public Builder addCoins(Token token) {
                    copyOnWrite();
                    ((Input) this.instance).addCoins(token);
                    return this;
                }

                public Builder clearAddress() {
                    copyOnWrite();
                    ((Input) this.instance).clearAddress();
                    return this;
                }

                public Builder clearCoins() {
                    copyOnWrite();
                    ((Input) this.instance).clearCoins();
                    return this;
                }

                public ByteString getAddress() {
                    return ((Input) this.instance).getAddress();
                }

                public Token getCoins(int i) {
                    return ((Input) this.instance).getCoins(i);
                }

                public int getCoinsCount() {
                    return ((Input) this.instance).getCoinsCount();
                }

                public List<Token> getCoinsList() {
                    return Collections.unmodifiableList(((Input) this.instance).getCoinsList());
                }

                public Builder removeCoins(int i) {
                    copyOnWrite();
                    ((Input) this.instance).removeCoins(i);
                    return this;
                }

                public Builder setAddress(ByteString byteString) {
                    copyOnWrite();
                    ((Input) this.instance).setAddress(byteString);
                    return this;
                }

                public Builder setCoins(int i, Token token) {
                    copyOnWrite();
                    ((Input) this.instance).setCoins(i, token);
                    return this;
                }

                private Builder() {
                    super(Input.DEFAULT_INSTANCE);
                }

                public Builder addCoins(int i, Token token) {
                    copyOnWrite();
                    ((Input) this.instance).addCoins(i, token);
                    return this;
                }

                public Builder setCoins(int i, Token.Builder builder) {
                    copyOnWrite();
                    ((Input) this.instance).setCoins(i, (Token) builder.build());
                    return this;
                }

                public Builder addCoins(Token.Builder builder) {
                    copyOnWrite();
                    ((Input) this.instance).addCoins((Token) builder.build());
                    return this;
                }

                public Builder addCoins(int i, Token.Builder builder) {
                    copyOnWrite();
                    ((Input) this.instance).addCoins(i, (Token) builder.build());
                    return this;
                }
            }

            static {
                Input input = new Input();
                DEFAULT_INSTANCE = input;
                GeneratedMessageLite.registerDefaultInstance(Input.class, input);
            }

            private Input() {
            }

            /* access modifiers changed from: private */
            public void addAllCoins(Iterable<? extends Token> iterable) {
                ensureCoinsIsMutable();
                C4949a.addAll(iterable, this.coins_);
            }

            /* access modifiers changed from: private */
            public void addCoins(Token token) {
                token.getClass();
                ensureCoinsIsMutable();
                this.coins_.add(token);
            }

            /* access modifiers changed from: private */
            public void clearAddress() {
                this.address_ = getDefaultInstance().getAddress();
            }

            /* access modifiers changed from: private */
            public void clearCoins() {
                this.coins_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void ensureCoinsIsMutable() {
                C5011t.C5020i<Token> iVar = this.coins_;
                if (!iVar.mo37090v()) {
                    this.coins_ = GeneratedMessageLite.mutableCopy(iVar);
                }
            }

            public static Input getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static Input parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Input) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Input parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Input) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<Input> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void removeCoins(int i) {
                ensureCoinsIsMutable();
                this.coins_.remove(i);
            }

            /* access modifiers changed from: private */
            public void setAddress(ByteString byteString) {
                byteString.getClass();
                this.address_ = byteString;
            }

            /* access modifiers changed from: private */
            public void setCoins(int i, Token token) {
                token.getClass();
                ensureCoinsIsMutable();
                this.coins_.set(i, token);
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97281.f46544xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Input();
                    case 2:
                        return new Builder((C97281) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\n\u0002\u001b", new Object[]{"address_", "coins_", Token.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<Input> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (Input.class) {
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

            public ByteString getAddress() {
                return this.address_;
            }

            public Token getCoins(int i) {
                return this.coins_.get(i);
            }

            public int getCoinsCount() {
                return this.coins_.size();
            }

            public List<Token> getCoinsList() {
                return this.coins_;
            }

            public TokenOrBuilder getCoinsOrBuilder(int i) {
                return this.coins_.get(i);
            }

            public List<? extends TokenOrBuilder> getCoinsOrBuilderList() {
                return this.coins_;
            }

            public static Builder newBuilder(Input input) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(input);
            }

            public static Input parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (Input) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static Input parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (Input) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static Input parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Input) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            /* access modifiers changed from: private */
            public void addCoins(int i, Token token) {
                token.getClass();
                ensureCoinsIsMutable();
                this.coins_.add(i, token);
            }

            public static Input parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (Input) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static Input parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Input) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Input parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (Input) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static Input parseFrom(InputStream inputStream) throws IOException {
                return (Input) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Input parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (Input) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static Input parseFrom(C4969g gVar) throws IOException {
                return (Input) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static Input parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (Input) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public interface InputOrBuilder extends qu3 {
            ByteString getAddress();

            Token getCoins(int i);

            int getCoinsCount();

            List<Token> getCoinsList();

            /* synthetic */ C4956c0 getDefaultInstanceForType();

            /* synthetic */ boolean isInitialized();
        }

        public static final class Output extends GeneratedMessageLite<Output, Builder> implements OutputOrBuilder {
            public static final int ADDRESS_FIELD_NUMBER = 1;
            public static final int COINS_FIELD_NUMBER = 2;
            /* access modifiers changed from: private */
            public static final Output DEFAULT_INSTANCE;
            private static volatile im4<Output> PARSER;
            private ByteString address_ = ByteString.EMPTY;
            private C5011t.C5020i<Token> coins_ = GeneratedMessageLite.emptyProtobufList();

            public static final class Builder extends GeneratedMessageLite.C4930a<Output, Builder> implements OutputOrBuilder {
                public /* synthetic */ Builder(C97281 r1) {
                    this();
                }

                public Builder addAllCoins(Iterable<? extends Token> iterable) {
                    copyOnWrite();
                    ((Output) this.instance).addAllCoins(iterable);
                    return this;
                }

                public Builder addCoins(Token token) {
                    copyOnWrite();
                    ((Output) this.instance).addCoins(token);
                    return this;
                }

                public Builder clearAddress() {
                    copyOnWrite();
                    ((Output) this.instance).clearAddress();
                    return this;
                }

                public Builder clearCoins() {
                    copyOnWrite();
                    ((Output) this.instance).clearCoins();
                    return this;
                }

                public ByteString getAddress() {
                    return ((Output) this.instance).getAddress();
                }

                public Token getCoins(int i) {
                    return ((Output) this.instance).getCoins(i);
                }

                public int getCoinsCount() {
                    return ((Output) this.instance).getCoinsCount();
                }

                public List<Token> getCoinsList() {
                    return Collections.unmodifiableList(((Output) this.instance).getCoinsList());
                }

                public Builder removeCoins(int i) {
                    copyOnWrite();
                    ((Output) this.instance).removeCoins(i);
                    return this;
                }

                public Builder setAddress(ByteString byteString) {
                    copyOnWrite();
                    ((Output) this.instance).setAddress(byteString);
                    return this;
                }

                public Builder setCoins(int i, Token token) {
                    copyOnWrite();
                    ((Output) this.instance).setCoins(i, token);
                    return this;
                }

                private Builder() {
                    super(Output.DEFAULT_INSTANCE);
                }

                public Builder addCoins(int i, Token token) {
                    copyOnWrite();
                    ((Output) this.instance).addCoins(i, token);
                    return this;
                }

                public Builder setCoins(int i, Token.Builder builder) {
                    copyOnWrite();
                    ((Output) this.instance).setCoins(i, (Token) builder.build());
                    return this;
                }

                public Builder addCoins(Token.Builder builder) {
                    copyOnWrite();
                    ((Output) this.instance).addCoins((Token) builder.build());
                    return this;
                }

                public Builder addCoins(int i, Token.Builder builder) {
                    copyOnWrite();
                    ((Output) this.instance).addCoins(i, (Token) builder.build());
                    return this;
                }
            }

            static {
                Output output = new Output();
                DEFAULT_INSTANCE = output;
                GeneratedMessageLite.registerDefaultInstance(Output.class, output);
            }

            private Output() {
            }

            /* access modifiers changed from: private */
            public void addAllCoins(Iterable<? extends Token> iterable) {
                ensureCoinsIsMutable();
                C4949a.addAll(iterable, this.coins_);
            }

            /* access modifiers changed from: private */
            public void addCoins(Token token) {
                token.getClass();
                ensureCoinsIsMutable();
                this.coins_.add(token);
            }

            /* access modifiers changed from: private */
            public void clearAddress() {
                this.address_ = getDefaultInstance().getAddress();
            }

            /* access modifiers changed from: private */
            public void clearCoins() {
                this.coins_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void ensureCoinsIsMutable() {
                C5011t.C5020i<Token> iVar = this.coins_;
                if (!iVar.mo37090v()) {
                    this.coins_ = GeneratedMessageLite.mutableCopy(iVar);
                }
            }

            public static Output getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static Output parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Output) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Output parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Output) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<Output> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void removeCoins(int i) {
                ensureCoinsIsMutable();
                this.coins_.remove(i);
            }

            /* access modifiers changed from: private */
            public void setAddress(ByteString byteString) {
                byteString.getClass();
                this.address_ = byteString;
            }

            /* access modifiers changed from: private */
            public void setCoins(int i, Token token) {
                token.getClass();
                ensureCoinsIsMutable();
                this.coins_.set(i, token);
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97281.f46544xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Output();
                    case 2:
                        return new Builder((C97281) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\n\u0002\u001b", new Object[]{"address_", "coins_", Token.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<Output> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (Output.class) {
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

            public ByteString getAddress() {
                return this.address_;
            }

            public Token getCoins(int i) {
                return this.coins_.get(i);
            }

            public int getCoinsCount() {
                return this.coins_.size();
            }

            public List<Token> getCoinsList() {
                return this.coins_;
            }

            public TokenOrBuilder getCoinsOrBuilder(int i) {
                return this.coins_.get(i);
            }

            public List<? extends TokenOrBuilder> getCoinsOrBuilderList() {
                return this.coins_;
            }

            public static Builder newBuilder(Output output) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(output);
            }

            public static Output parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (Output) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static Output parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (Output) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static Output parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Output) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            /* access modifiers changed from: private */
            public void addCoins(int i, Token token) {
                token.getClass();
                ensureCoinsIsMutable();
                this.coins_.add(i, token);
            }

            public static Output parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (Output) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static Output parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Output) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Output parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (Output) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static Output parseFrom(InputStream inputStream) throws IOException {
                return (Output) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Output parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (Output) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static Output parseFrom(C4969g gVar) throws IOException {
                return (Output) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static Output parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (Output) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public interface OutputOrBuilder extends qu3 {
            ByteString getAddress();

            Token getCoins(int i);

            int getCoinsCount();

            List<Token> getCoinsList();

            /* synthetic */ C4956c0 getDefaultInstanceForType();

            /* synthetic */ boolean isInitialized();
        }

        public static final class Token extends GeneratedMessageLite<Token, Builder> implements TokenOrBuilder {
            public static final int AMOUNT_FIELD_NUMBER = 2;
            /* access modifiers changed from: private */
            public static final Token DEFAULT_INSTANCE;
            public static final int DENOM_FIELD_NUMBER = 1;
            private static volatile im4<Token> PARSER;
            private long amount_;
            private String denom_ = "";

            public static final class Builder extends GeneratedMessageLite.C4930a<Token, Builder> implements TokenOrBuilder {
                public /* synthetic */ Builder(C97281 r1) {
                    this();
                }

                public Builder clearAmount() {
                    copyOnWrite();
                    ((Token) this.instance).clearAmount();
                    return this;
                }

                public Builder clearDenom() {
                    copyOnWrite();
                    ((Token) this.instance).clearDenom();
                    return this;
                }

                public long getAmount() {
                    return ((Token) this.instance).getAmount();
                }

                public String getDenom() {
                    return ((Token) this.instance).getDenom();
                }

                public ByteString getDenomBytes() {
                    return ((Token) this.instance).getDenomBytes();
                }

                public Builder setAmount(long j) {
                    copyOnWrite();
                    ((Token) this.instance).setAmount(j);
                    return this;
                }

                public Builder setDenom(String str) {
                    copyOnWrite();
                    ((Token) this.instance).setDenom(str);
                    return this;
                }

                public Builder setDenomBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Token) this.instance).setDenomBytes(byteString);
                    return this;
                }

                private Builder() {
                    super(Token.DEFAULT_INSTANCE);
                }
            }

            static {
                Token token = new Token();
                DEFAULT_INSTANCE = token;
                GeneratedMessageLite.registerDefaultInstance(Token.class, token);
            }

            private Token() {
            }

            /* access modifiers changed from: private */
            public void clearAmount() {
                this.amount_ = 0;
            }

            /* access modifiers changed from: private */
            public void clearDenom() {
                this.denom_ = getDefaultInstance().getDenom();
            }

            public static Token getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static Token parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Token) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Token parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Token) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<Token> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setAmount(long j) {
                this.amount_ = j;
            }

            /* access modifiers changed from: private */
            public void setDenom(String str) {
                str.getClass();
                this.denom_ = str;
            }

            /* access modifiers changed from: private */
            public void setDenomBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.denom_ = byteString.toStringUtf8();
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97281.f46544xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Token();
                    case 2:
                        return new Builder((C97281) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0002", new Object[]{"denom_", "amount_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<Token> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (Token.class) {
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

            public String getDenom() {
                return this.denom_;
            }

            public ByteString getDenomBytes() {
                return ByteString.copyFromUtf8(this.denom_);
            }

            public static Builder newBuilder(Token token) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(token);
            }

            public static Token parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (Token) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static Token parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (Token) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static Token parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Token) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Token parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (Token) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static Token parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Token) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Token parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (Token) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static Token parseFrom(InputStream inputStream) throws IOException {
                return (Token) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Token parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (Token) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static Token parseFrom(C4969g gVar) throws IOException {
                return (Token) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static Token parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (Token) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public interface TokenOrBuilder extends qu3 {
            long getAmount();

            /* synthetic */ C4956c0 getDefaultInstanceForType();

            String getDenom();

            ByteString getDenomBytes();

            /* synthetic */ boolean isInitialized();
        }

        static {
            SendOrder sendOrder = new SendOrder();
            DEFAULT_INSTANCE = sendOrder;
            GeneratedMessageLite.registerDefaultInstance(SendOrder.class, sendOrder);
        }

        private SendOrder() {
        }

        /* access modifiers changed from: private */
        public void addAllInputs(Iterable<? extends Input> iterable) {
            ensureInputsIsMutable();
            C4949a.addAll(iterable, this.inputs_);
        }

        /* access modifiers changed from: private */
        public void addAllOutputs(Iterable<? extends Output> iterable) {
            ensureOutputsIsMutable();
            C4949a.addAll(iterable, this.outputs_);
        }

        /* access modifiers changed from: private */
        public void addInputs(Input input) {
            input.getClass();
            ensureInputsIsMutable();
            this.inputs_.add(input);
        }

        /* access modifiers changed from: private */
        public void addOutputs(Output output) {
            output.getClass();
            ensureOutputsIsMutable();
            this.outputs_.add(output);
        }

        /* access modifiers changed from: private */
        public void clearInputs() {
            this.inputs_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearOutputs() {
            this.outputs_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureInputsIsMutable() {
            C5011t.C5020i<Input> iVar = this.inputs_;
            if (!iVar.mo37090v()) {
                this.inputs_ = GeneratedMessageLite.mutableCopy(iVar);
            }
        }

        private void ensureOutputsIsMutable() {
            C5011t.C5020i<Output> iVar = this.outputs_;
            if (!iVar.mo37090v()) {
                this.outputs_ = GeneratedMessageLite.mutableCopy(iVar);
            }
        }

        public static SendOrder getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static SendOrder parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SendOrder) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SendOrder parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SendOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<SendOrder> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeInputs(int i) {
            ensureInputsIsMutable();
            this.inputs_.remove(i);
        }

        /* access modifiers changed from: private */
        public void removeOutputs(int i) {
            ensureOutputsIsMutable();
            this.outputs_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setInputs(int i, Input input) {
            input.getClass();
            ensureInputsIsMutable();
            this.inputs_.set(i, input);
        }

        /* access modifiers changed from: private */
        public void setOutputs(int i, Output output) {
            output.getClass();
            ensureOutputsIsMutable();
            this.outputs_.set(i, output);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97281.f46544xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SendOrder();
                case 2:
                    return new Builder((C97281) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"inputs_", Input.class, "outputs_", Output.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<SendOrder> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (SendOrder.class) {
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

        public Input getInputs(int i) {
            return this.inputs_.get(i);
        }

        public int getInputsCount() {
            return this.inputs_.size();
        }

        public List<Input> getInputsList() {
            return this.inputs_;
        }

        public InputOrBuilder getInputsOrBuilder(int i) {
            return this.inputs_.get(i);
        }

        public List<? extends InputOrBuilder> getInputsOrBuilderList() {
            return this.inputs_;
        }

        public Output getOutputs(int i) {
            return this.outputs_.get(i);
        }

        public int getOutputsCount() {
            return this.outputs_.size();
        }

        public List<Output> getOutputsList() {
            return this.outputs_;
        }

        public OutputOrBuilder getOutputsOrBuilder(int i) {
            return this.outputs_.get(i);
        }

        public List<? extends OutputOrBuilder> getOutputsOrBuilderList() {
            return this.outputs_;
        }

        public static Builder newBuilder(SendOrder sendOrder) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(sendOrder);
        }

        public static SendOrder parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (SendOrder) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static SendOrder parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (SendOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static SendOrder parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SendOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* access modifiers changed from: private */
        public void addInputs(int i, Input input) {
            input.getClass();
            ensureInputsIsMutable();
            this.inputs_.add(i, input);
        }

        /* access modifiers changed from: private */
        public void addOutputs(int i, Output output) {
            output.getClass();
            ensureOutputsIsMutable();
            this.outputs_.add(i, output);
        }

        public static SendOrder parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (SendOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static SendOrder parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SendOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SendOrder parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (SendOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static SendOrder parseFrom(InputStream inputStream) throws IOException {
            return (SendOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SendOrder parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (SendOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static SendOrder parseFrom(C4969g gVar) throws IOException {
            return (SendOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static SendOrder parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (SendOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface SendOrderOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        SendOrder.Input getInputs(int i);

        int getInputsCount();

        List<SendOrder.Input> getInputsList();

        SendOrder.Output getOutputs(int i);

        int getOutputsCount();

        List<SendOrder.Output> getOutputsList();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SideChainDelegate extends GeneratedMessageLite<SideChainDelegate, Builder> implements SideChainDelegateOrBuilder {
        public static final int CHAIN_ID_FIELD_NUMBER = 4;
        /* access modifiers changed from: private */
        public static final SideChainDelegate DEFAULT_INSTANCE;
        public static final int DELEGATION_FIELD_NUMBER = 3;
        public static final int DELEGATOR_ADDR_FIELD_NUMBER = 1;
        private static volatile im4<SideChainDelegate> PARSER = null;
        public static final int VALIDATOR_ADDR_FIELD_NUMBER = 2;
        private String chainId_ = "";
        private SendOrder.Token delegation_;
        private ByteString delegatorAddr_;
        private ByteString validatorAddr_;

        public static final class Builder extends GeneratedMessageLite.C4930a<SideChainDelegate, Builder> implements SideChainDelegateOrBuilder {
            public /* synthetic */ Builder(C97281 r1) {
                this();
            }

            public Builder clearChainId() {
                copyOnWrite();
                ((SideChainDelegate) this.instance).clearChainId();
                return this;
            }

            public Builder clearDelegation() {
                copyOnWrite();
                ((SideChainDelegate) this.instance).clearDelegation();
                return this;
            }

            public Builder clearDelegatorAddr() {
                copyOnWrite();
                ((SideChainDelegate) this.instance).clearDelegatorAddr();
                return this;
            }

            public Builder clearValidatorAddr() {
                copyOnWrite();
                ((SideChainDelegate) this.instance).clearValidatorAddr();
                return this;
            }

            public String getChainId() {
                return ((SideChainDelegate) this.instance).getChainId();
            }

            public ByteString getChainIdBytes() {
                return ((SideChainDelegate) this.instance).getChainIdBytes();
            }

            public SendOrder.Token getDelegation() {
                return ((SideChainDelegate) this.instance).getDelegation();
            }

            public ByteString getDelegatorAddr() {
                return ((SideChainDelegate) this.instance).getDelegatorAddr();
            }

            public ByteString getValidatorAddr() {
                return ((SideChainDelegate) this.instance).getValidatorAddr();
            }

            public boolean hasDelegation() {
                return ((SideChainDelegate) this.instance).hasDelegation();
            }

            public Builder mergeDelegation(SendOrder.Token token) {
                copyOnWrite();
                ((SideChainDelegate) this.instance).mergeDelegation(token);
                return this;
            }

            public Builder setChainId(String str) {
                copyOnWrite();
                ((SideChainDelegate) this.instance).setChainId(str);
                return this;
            }

            public Builder setChainIdBytes(ByteString byteString) {
                copyOnWrite();
                ((SideChainDelegate) this.instance).setChainIdBytes(byteString);
                return this;
            }

            public Builder setDelegation(SendOrder.Token token) {
                copyOnWrite();
                ((SideChainDelegate) this.instance).setDelegation(token);
                return this;
            }

            public Builder setDelegatorAddr(ByteString byteString) {
                copyOnWrite();
                ((SideChainDelegate) this.instance).setDelegatorAddr(byteString);
                return this;
            }

            public Builder setValidatorAddr(ByteString byteString) {
                copyOnWrite();
                ((SideChainDelegate) this.instance).setValidatorAddr(byteString);
                return this;
            }

            private Builder() {
                super(SideChainDelegate.DEFAULT_INSTANCE);
            }

            public Builder setDelegation(SendOrder.Token.Builder builder) {
                copyOnWrite();
                ((SideChainDelegate) this.instance).setDelegation((SendOrder.Token) builder.build());
                return this;
            }
        }

        static {
            SideChainDelegate sideChainDelegate = new SideChainDelegate();
            DEFAULT_INSTANCE = sideChainDelegate;
            GeneratedMessageLite.registerDefaultInstance(SideChainDelegate.class, sideChainDelegate);
        }

        private SideChainDelegate() {
            ByteString byteString = ByteString.EMPTY;
            this.delegatorAddr_ = byteString;
            this.validatorAddr_ = byteString;
        }

        /* access modifiers changed from: private */
        public void clearChainId() {
            this.chainId_ = getDefaultInstance().getChainId();
        }

        /* access modifiers changed from: private */
        public void clearDelegation() {
            this.delegation_ = null;
        }

        /* access modifiers changed from: private */
        public void clearDelegatorAddr() {
            this.delegatorAddr_ = getDefaultInstance().getDelegatorAddr();
        }

        /* access modifiers changed from: private */
        public void clearValidatorAddr() {
            this.validatorAddr_ = getDefaultInstance().getValidatorAddr();
        }

        public static SideChainDelegate getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeDelegation(SendOrder.Token token) {
            token.getClass();
            SendOrder.Token token2 = this.delegation_;
            if (token2 == null || token2 == SendOrder.Token.getDefaultInstance()) {
                this.delegation_ = token;
            } else {
                this.delegation_ = (SendOrder.Token) ((SendOrder.Token.Builder) SendOrder.Token.newBuilder(this.delegation_).mergeFrom(token)).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static SideChainDelegate parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SideChainDelegate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SideChainDelegate parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SideChainDelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<SideChainDelegate> parser() {
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
        public void setDelegation(SendOrder.Token token) {
            token.getClass();
            this.delegation_ = token;
        }

        /* access modifiers changed from: private */
        public void setDelegatorAddr(ByteString byteString) {
            byteString.getClass();
            this.delegatorAddr_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setValidatorAddr(ByteString byteString) {
            byteString.getClass();
            this.validatorAddr_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97281.f46544xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SideChainDelegate();
                case 2:
                    return new Builder((C97281) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\n\u0002\n\u0003\t\u0004Ȉ", new Object[]{"delegatorAddr_", "validatorAddr_", "delegation_", "chainId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<SideChainDelegate> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (SideChainDelegate.class) {
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

        public SendOrder.Token getDelegation() {
            SendOrder.Token token = this.delegation_;
            if (token == null) {
                return SendOrder.Token.getDefaultInstance();
            }
            return token;
        }

        public ByteString getDelegatorAddr() {
            return this.delegatorAddr_;
        }

        public ByteString getValidatorAddr() {
            return this.validatorAddr_;
        }

        public boolean hasDelegation() {
            if (this.delegation_ != null) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(SideChainDelegate sideChainDelegate) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(sideChainDelegate);
        }

        public static SideChainDelegate parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (SideChainDelegate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static SideChainDelegate parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (SideChainDelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static SideChainDelegate parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SideChainDelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SideChainDelegate parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (SideChainDelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static SideChainDelegate parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SideChainDelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SideChainDelegate parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (SideChainDelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static SideChainDelegate parseFrom(InputStream inputStream) throws IOException {
            return (SideChainDelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SideChainDelegate parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (SideChainDelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static SideChainDelegate parseFrom(C4969g gVar) throws IOException {
            return (SideChainDelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static SideChainDelegate parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (SideChainDelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface SideChainDelegateOrBuilder extends qu3 {
        String getChainId();

        ByteString getChainIdBytes();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        SendOrder.Token getDelegation();

        ByteString getDelegatorAddr();

        ByteString getValidatorAddr();

        boolean hasDelegation();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SideChainRedelegate extends GeneratedMessageLite<SideChainRedelegate, Builder> implements SideChainRedelegateOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 4;
        public static final int CHAIN_ID_FIELD_NUMBER = 5;
        /* access modifiers changed from: private */
        public static final SideChainRedelegate DEFAULT_INSTANCE;
        public static final int DELEGATOR_ADDR_FIELD_NUMBER = 1;
        private static volatile im4<SideChainRedelegate> PARSER = null;
        public static final int VALIDATOR_DST_ADDR_FIELD_NUMBER = 3;
        public static final int VALIDATOR_SRC_ADDR_FIELD_NUMBER = 2;
        private SendOrder.Token amount_;
        private String chainId_ = "";
        private ByteString delegatorAddr_;
        private ByteString validatorDstAddr_;
        private ByteString validatorSrcAddr_;

        public static final class Builder extends GeneratedMessageLite.C4930a<SideChainRedelegate, Builder> implements SideChainRedelegateOrBuilder {
            public /* synthetic */ Builder(C97281 r1) {
                this();
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((SideChainRedelegate) this.instance).clearAmount();
                return this;
            }

            public Builder clearChainId() {
                copyOnWrite();
                ((SideChainRedelegate) this.instance).clearChainId();
                return this;
            }

            public Builder clearDelegatorAddr() {
                copyOnWrite();
                ((SideChainRedelegate) this.instance).clearDelegatorAddr();
                return this;
            }

            public Builder clearValidatorDstAddr() {
                copyOnWrite();
                ((SideChainRedelegate) this.instance).clearValidatorDstAddr();
                return this;
            }

            public Builder clearValidatorSrcAddr() {
                copyOnWrite();
                ((SideChainRedelegate) this.instance).clearValidatorSrcAddr();
                return this;
            }

            public SendOrder.Token getAmount() {
                return ((SideChainRedelegate) this.instance).getAmount();
            }

            public String getChainId() {
                return ((SideChainRedelegate) this.instance).getChainId();
            }

            public ByteString getChainIdBytes() {
                return ((SideChainRedelegate) this.instance).getChainIdBytes();
            }

            public ByteString getDelegatorAddr() {
                return ((SideChainRedelegate) this.instance).getDelegatorAddr();
            }

            public ByteString getValidatorDstAddr() {
                return ((SideChainRedelegate) this.instance).getValidatorDstAddr();
            }

            public ByteString getValidatorSrcAddr() {
                return ((SideChainRedelegate) this.instance).getValidatorSrcAddr();
            }

            public boolean hasAmount() {
                return ((SideChainRedelegate) this.instance).hasAmount();
            }

            public Builder mergeAmount(SendOrder.Token token) {
                copyOnWrite();
                ((SideChainRedelegate) this.instance).mergeAmount(token);
                return this;
            }

            public Builder setAmount(SendOrder.Token token) {
                copyOnWrite();
                ((SideChainRedelegate) this.instance).setAmount(token);
                return this;
            }

            public Builder setChainId(String str) {
                copyOnWrite();
                ((SideChainRedelegate) this.instance).setChainId(str);
                return this;
            }

            public Builder setChainIdBytes(ByteString byteString) {
                copyOnWrite();
                ((SideChainRedelegate) this.instance).setChainIdBytes(byteString);
                return this;
            }

            public Builder setDelegatorAddr(ByteString byteString) {
                copyOnWrite();
                ((SideChainRedelegate) this.instance).setDelegatorAddr(byteString);
                return this;
            }

            public Builder setValidatorDstAddr(ByteString byteString) {
                copyOnWrite();
                ((SideChainRedelegate) this.instance).setValidatorDstAddr(byteString);
                return this;
            }

            public Builder setValidatorSrcAddr(ByteString byteString) {
                copyOnWrite();
                ((SideChainRedelegate) this.instance).setValidatorSrcAddr(byteString);
                return this;
            }

            private Builder() {
                super(SideChainRedelegate.DEFAULT_INSTANCE);
            }

            public Builder setAmount(SendOrder.Token.Builder builder) {
                copyOnWrite();
                ((SideChainRedelegate) this.instance).setAmount((SendOrder.Token) builder.build());
                return this;
            }
        }

        static {
            SideChainRedelegate sideChainRedelegate = new SideChainRedelegate();
            DEFAULT_INSTANCE = sideChainRedelegate;
            GeneratedMessageLite.registerDefaultInstance(SideChainRedelegate.class, sideChainRedelegate);
        }

        private SideChainRedelegate() {
            ByteString byteString = ByteString.EMPTY;
            this.delegatorAddr_ = byteString;
            this.validatorSrcAddr_ = byteString;
            this.validatorDstAddr_ = byteString;
        }

        /* access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = null;
        }

        /* access modifiers changed from: private */
        public void clearChainId() {
            this.chainId_ = getDefaultInstance().getChainId();
        }

        /* access modifiers changed from: private */
        public void clearDelegatorAddr() {
            this.delegatorAddr_ = getDefaultInstance().getDelegatorAddr();
        }

        /* access modifiers changed from: private */
        public void clearValidatorDstAddr() {
            this.validatorDstAddr_ = getDefaultInstance().getValidatorDstAddr();
        }

        /* access modifiers changed from: private */
        public void clearValidatorSrcAddr() {
            this.validatorSrcAddr_ = getDefaultInstance().getValidatorSrcAddr();
        }

        public static SideChainRedelegate getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeAmount(SendOrder.Token token) {
            token.getClass();
            SendOrder.Token token2 = this.amount_;
            if (token2 == null || token2 == SendOrder.Token.getDefaultInstance()) {
                this.amount_ = token;
            } else {
                this.amount_ = (SendOrder.Token) ((SendOrder.Token.Builder) SendOrder.Token.newBuilder(this.amount_).mergeFrom(token)).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static SideChainRedelegate parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SideChainRedelegate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SideChainRedelegate parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SideChainRedelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<SideChainRedelegate> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAmount(SendOrder.Token token) {
            token.getClass();
            this.amount_ = token;
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
        public void setDelegatorAddr(ByteString byteString) {
            byteString.getClass();
            this.delegatorAddr_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setValidatorDstAddr(ByteString byteString) {
            byteString.getClass();
            this.validatorDstAddr_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setValidatorSrcAddr(ByteString byteString) {
            byteString.getClass();
            this.validatorSrcAddr_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97281.f46544xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SideChainRedelegate();
                case 2:
                    return new Builder((C97281) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\n\u0002\n\u0003\n\u0004\t\u0005Ȉ", new Object[]{"delegatorAddr_", "validatorSrcAddr_", "validatorDstAddr_", "amount_", "chainId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<SideChainRedelegate> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (SideChainRedelegate.class) {
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

        public SendOrder.Token getAmount() {
            SendOrder.Token token = this.amount_;
            if (token == null) {
                return SendOrder.Token.getDefaultInstance();
            }
            return token;
        }

        public String getChainId() {
            return this.chainId_;
        }

        public ByteString getChainIdBytes() {
            return ByteString.copyFromUtf8(this.chainId_);
        }

        public ByteString getDelegatorAddr() {
            return this.delegatorAddr_;
        }

        public ByteString getValidatorDstAddr() {
            return this.validatorDstAddr_;
        }

        public ByteString getValidatorSrcAddr() {
            return this.validatorSrcAddr_;
        }

        public boolean hasAmount() {
            if (this.amount_ != null) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(SideChainRedelegate sideChainRedelegate) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(sideChainRedelegate);
        }

        public static SideChainRedelegate parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (SideChainRedelegate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static SideChainRedelegate parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (SideChainRedelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static SideChainRedelegate parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SideChainRedelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SideChainRedelegate parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (SideChainRedelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static SideChainRedelegate parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SideChainRedelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SideChainRedelegate parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (SideChainRedelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static SideChainRedelegate parseFrom(InputStream inputStream) throws IOException {
            return (SideChainRedelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SideChainRedelegate parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (SideChainRedelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static SideChainRedelegate parseFrom(C4969g gVar) throws IOException {
            return (SideChainRedelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static SideChainRedelegate parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (SideChainRedelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface SideChainRedelegateOrBuilder extends qu3 {
        SendOrder.Token getAmount();

        String getChainId();

        ByteString getChainIdBytes();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        ByteString getDelegatorAddr();

        ByteString getValidatorDstAddr();

        ByteString getValidatorSrcAddr();

        boolean hasAmount();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SideChainUndelegate extends GeneratedMessageLite<SideChainUndelegate, Builder> implements SideChainUndelegateOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 3;
        public static final int CHAIN_ID_FIELD_NUMBER = 4;
        /* access modifiers changed from: private */
        public static final SideChainUndelegate DEFAULT_INSTANCE;
        public static final int DELEGATOR_ADDR_FIELD_NUMBER = 1;
        private static volatile im4<SideChainUndelegate> PARSER = null;
        public static final int VALIDATOR_ADDR_FIELD_NUMBER = 2;
        private SendOrder.Token amount_;
        private String chainId_ = "";
        private ByteString delegatorAddr_;
        private ByteString validatorAddr_;

        public static final class Builder extends GeneratedMessageLite.C4930a<SideChainUndelegate, Builder> implements SideChainUndelegateOrBuilder {
            public /* synthetic */ Builder(C97281 r1) {
                this();
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((SideChainUndelegate) this.instance).clearAmount();
                return this;
            }

            public Builder clearChainId() {
                copyOnWrite();
                ((SideChainUndelegate) this.instance).clearChainId();
                return this;
            }

            public Builder clearDelegatorAddr() {
                copyOnWrite();
                ((SideChainUndelegate) this.instance).clearDelegatorAddr();
                return this;
            }

            public Builder clearValidatorAddr() {
                copyOnWrite();
                ((SideChainUndelegate) this.instance).clearValidatorAddr();
                return this;
            }

            public SendOrder.Token getAmount() {
                return ((SideChainUndelegate) this.instance).getAmount();
            }

            public String getChainId() {
                return ((SideChainUndelegate) this.instance).getChainId();
            }

            public ByteString getChainIdBytes() {
                return ((SideChainUndelegate) this.instance).getChainIdBytes();
            }

            public ByteString getDelegatorAddr() {
                return ((SideChainUndelegate) this.instance).getDelegatorAddr();
            }

            public ByteString getValidatorAddr() {
                return ((SideChainUndelegate) this.instance).getValidatorAddr();
            }

            public boolean hasAmount() {
                return ((SideChainUndelegate) this.instance).hasAmount();
            }

            public Builder mergeAmount(SendOrder.Token token) {
                copyOnWrite();
                ((SideChainUndelegate) this.instance).mergeAmount(token);
                return this;
            }

            public Builder setAmount(SendOrder.Token token) {
                copyOnWrite();
                ((SideChainUndelegate) this.instance).setAmount(token);
                return this;
            }

            public Builder setChainId(String str) {
                copyOnWrite();
                ((SideChainUndelegate) this.instance).setChainId(str);
                return this;
            }

            public Builder setChainIdBytes(ByteString byteString) {
                copyOnWrite();
                ((SideChainUndelegate) this.instance).setChainIdBytes(byteString);
                return this;
            }

            public Builder setDelegatorAddr(ByteString byteString) {
                copyOnWrite();
                ((SideChainUndelegate) this.instance).setDelegatorAddr(byteString);
                return this;
            }

            public Builder setValidatorAddr(ByteString byteString) {
                copyOnWrite();
                ((SideChainUndelegate) this.instance).setValidatorAddr(byteString);
                return this;
            }

            private Builder() {
                super(SideChainUndelegate.DEFAULT_INSTANCE);
            }

            public Builder setAmount(SendOrder.Token.Builder builder) {
                copyOnWrite();
                ((SideChainUndelegate) this.instance).setAmount((SendOrder.Token) builder.build());
                return this;
            }
        }

        static {
            SideChainUndelegate sideChainUndelegate = new SideChainUndelegate();
            DEFAULT_INSTANCE = sideChainUndelegate;
            GeneratedMessageLite.registerDefaultInstance(SideChainUndelegate.class, sideChainUndelegate);
        }

        private SideChainUndelegate() {
            ByteString byteString = ByteString.EMPTY;
            this.delegatorAddr_ = byteString;
            this.validatorAddr_ = byteString;
        }

        /* access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = null;
        }

        /* access modifiers changed from: private */
        public void clearChainId() {
            this.chainId_ = getDefaultInstance().getChainId();
        }

        /* access modifiers changed from: private */
        public void clearDelegatorAddr() {
            this.delegatorAddr_ = getDefaultInstance().getDelegatorAddr();
        }

        /* access modifiers changed from: private */
        public void clearValidatorAddr() {
            this.validatorAddr_ = getDefaultInstance().getValidatorAddr();
        }

        public static SideChainUndelegate getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeAmount(SendOrder.Token token) {
            token.getClass();
            SendOrder.Token token2 = this.amount_;
            if (token2 == null || token2 == SendOrder.Token.getDefaultInstance()) {
                this.amount_ = token;
            } else {
                this.amount_ = (SendOrder.Token) ((SendOrder.Token.Builder) SendOrder.Token.newBuilder(this.amount_).mergeFrom(token)).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static SideChainUndelegate parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SideChainUndelegate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SideChainUndelegate parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SideChainUndelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<SideChainUndelegate> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAmount(SendOrder.Token token) {
            token.getClass();
            this.amount_ = token;
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
        public void setDelegatorAddr(ByteString byteString) {
            byteString.getClass();
            this.delegatorAddr_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setValidatorAddr(ByteString byteString) {
            byteString.getClass();
            this.validatorAddr_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97281.f46544xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SideChainUndelegate();
                case 2:
                    return new Builder((C97281) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\n\u0002\n\u0003\t\u0004Ȉ", new Object[]{"delegatorAddr_", "validatorAddr_", "amount_", "chainId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<SideChainUndelegate> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (SideChainUndelegate.class) {
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

        public SendOrder.Token getAmount() {
            SendOrder.Token token = this.amount_;
            if (token == null) {
                return SendOrder.Token.getDefaultInstance();
            }
            return token;
        }

        public String getChainId() {
            return this.chainId_;
        }

        public ByteString getChainIdBytes() {
            return ByteString.copyFromUtf8(this.chainId_);
        }

        public ByteString getDelegatorAddr() {
            return this.delegatorAddr_;
        }

        public ByteString getValidatorAddr() {
            return this.validatorAddr_;
        }

        public boolean hasAmount() {
            if (this.amount_ != null) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(SideChainUndelegate sideChainUndelegate) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(sideChainUndelegate);
        }

        public static SideChainUndelegate parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (SideChainUndelegate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static SideChainUndelegate parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (SideChainUndelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static SideChainUndelegate parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SideChainUndelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SideChainUndelegate parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (SideChainUndelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static SideChainUndelegate parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SideChainUndelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SideChainUndelegate parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (SideChainUndelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static SideChainUndelegate parseFrom(InputStream inputStream) throws IOException {
            return (SideChainUndelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SideChainUndelegate parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (SideChainUndelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static SideChainUndelegate parseFrom(C4969g gVar) throws IOException {
            return (SideChainUndelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static SideChainUndelegate parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (SideChainUndelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface SideChainUndelegateOrBuilder extends qu3 {
        SendOrder.Token getAmount();

        String getChainId();

        ByteString getChainIdBytes();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        ByteString getDelegatorAddr();

        ByteString getValidatorAddr();

        boolean hasAmount();

        /* synthetic */ boolean isInitialized();
    }

    public static final class Signature extends GeneratedMessageLite<Signature, Builder> implements SignatureOrBuilder {
        public static final int ACCOUNT_NUMBER_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final Signature DEFAULT_INSTANCE;
        private static volatile im4<Signature> PARSER = null;
        public static final int PUB_KEY_FIELD_NUMBER = 1;
        public static final int SEQUENCE_FIELD_NUMBER = 4;
        public static final int SIGNATURE_FIELD_NUMBER = 2;
        private long accountNumber_;
        private ByteString pubKey_;
        private long sequence_;
        private ByteString signature_;

        public static final class Builder extends GeneratedMessageLite.C4930a<Signature, Builder> implements SignatureOrBuilder {
            public /* synthetic */ Builder(C97281 r1) {
                this();
            }

            public Builder clearAccountNumber() {
                copyOnWrite();
                ((Signature) this.instance).clearAccountNumber();
                return this;
            }

            public Builder clearPubKey() {
                copyOnWrite();
                ((Signature) this.instance).clearPubKey();
                return this;
            }

            public Builder clearSequence() {
                copyOnWrite();
                ((Signature) this.instance).clearSequence();
                return this;
            }

            public Builder clearSignature() {
                copyOnWrite();
                ((Signature) this.instance).clearSignature();
                return this;
            }

            public long getAccountNumber() {
                return ((Signature) this.instance).getAccountNumber();
            }

            public ByteString getPubKey() {
                return ((Signature) this.instance).getPubKey();
            }

            public long getSequence() {
                return ((Signature) this.instance).getSequence();
            }

            public ByteString getSignature() {
                return ((Signature) this.instance).getSignature();
            }

            public Builder setAccountNumber(long j) {
                copyOnWrite();
                ((Signature) this.instance).setAccountNumber(j);
                return this;
            }

            public Builder setPubKey(ByteString byteString) {
                copyOnWrite();
                ((Signature) this.instance).setPubKey(byteString);
                return this;
            }

            public Builder setSequence(long j) {
                copyOnWrite();
                ((Signature) this.instance).setSequence(j);
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
            this.pubKey_ = byteString;
            this.signature_ = byteString;
        }

        /* access modifiers changed from: private */
        public void clearAccountNumber() {
            this.accountNumber_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearPubKey() {
            this.pubKey_ = getDefaultInstance().getPubKey();
        }

        /* access modifiers changed from: private */
        public void clearSequence() {
            this.sequence_ = 0;
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
        public void setAccountNumber(long j) {
            this.accountNumber_ = j;
        }

        /* access modifiers changed from: private */
        public void setPubKey(ByteString byteString) {
            byteString.getClass();
            this.pubKey_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setSequence(long j) {
            this.sequence_ = j;
        }

        /* access modifiers changed from: private */
        public void setSignature(ByteString byteString) {
            byteString.getClass();
            this.signature_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97281.f46544xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Signature();
                case 2:
                    return new Builder((C97281) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\n\u0002\n\u0003\u0002\u0004\u0002", new Object[]{"pubKey_", "signature_", "accountNumber_", "sequence_"});
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

        public long getAccountNumber() {
            return this.accountNumber_;
        }

        public ByteString getPubKey() {
            return this.pubKey_;
        }

        public long getSequence() {
            return this.sequence_;
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
        long getAccountNumber();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        ByteString getPubKey();

        long getSequence();

        ByteString getSignature();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SigningInput extends GeneratedMessageLite<SigningInput, Builder> implements SigningInputOrBuilder {
        public static final int ACCOUNT_NUMBER_FIELD_NUMBER = 2;
        public static final int BURN_ORDER_FIELD_NUMBER = 19;
        public static final int CANCEL_TRADE_ORDER_FIELD_NUMBER = 9;
        public static final int CHAIN_ID_FIELD_NUMBER = 1;
        public static final int CLAIMHTLT_ORDER_FIELD_NUMBER = 15;
        /* access modifiers changed from: private */
        public static final SigningInput DEFAULT_INSTANCE;
        public static final int DEPOSITHTLT_ORDER_FIELD_NUMBER = 14;
        public static final int FREEZE_ORDER_FIELD_NUMBER = 11;
        public static final int HTLT_ORDER_FIELD_NUMBER = 13;
        public static final int ISSUE_ORDER_FIELD_NUMBER = 17;
        public static final int MEMO_FIELD_NUMBER = 5;
        public static final int MINT_ORDER_FIELD_NUMBER = 18;
        private static volatile im4<SigningInput> PARSER = null;
        public static final int PRIVATE_KEY_FIELD_NUMBER = 6;
        public static final int REFUNDHTLT_ORDER_FIELD_NUMBER = 16;
        public static final int SEND_ORDER_FIELD_NUMBER = 10;
        public static final int SEQUENCE_FIELD_NUMBER = 3;
        public static final int SIDE_DELEGATE_ORDER_FIELD_NUMBER = 21;
        public static final int SIDE_REDELEGATE_ORDER_FIELD_NUMBER = 22;
        public static final int SIDE_UNDELEGATE_ORDER_FIELD_NUMBER = 23;
        public static final int SOURCE_FIELD_NUMBER = 4;
        public static final int TIME_LOCK_ORDER_FIELD_NUMBER = 24;
        public static final int TIME_RELOCK_ORDER_FIELD_NUMBER = 25;
        public static final int TIME_UNLOCK_ORDER_FIELD_NUMBER = 26;
        public static final int TRADE_ORDER_FIELD_NUMBER = 8;
        public static final int TRANSFER_OUT_ORDER_FIELD_NUMBER = 20;
        public static final int UNFREEZE_ORDER_FIELD_NUMBER = 12;
        private long accountNumber_;
        private String chainId_ = "";
        private String memo_ = "";
        private int orderOneofCase_ = 0;
        private Object orderOneof_;
        private ByteString privateKey_ = ByteString.EMPTY;
        private long sequence_;
        private long source_;

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningInput, Builder> implements SigningInputOrBuilder {
            public /* synthetic */ Builder(C97281 r1) {
                this();
            }

            public Builder clearAccountNumber() {
                copyOnWrite();
                ((SigningInput) this.instance).clearAccountNumber();
                return this;
            }

            public Builder clearBurnOrder() {
                copyOnWrite();
                ((SigningInput) this.instance).clearBurnOrder();
                return this;
            }

            public Builder clearCancelTradeOrder() {
                copyOnWrite();
                ((SigningInput) this.instance).clearCancelTradeOrder();
                return this;
            }

            public Builder clearChainId() {
                copyOnWrite();
                ((SigningInput) this.instance).clearChainId();
                return this;
            }

            public Builder clearClaimHTLTOrder() {
                copyOnWrite();
                ((SigningInput) this.instance).clearClaimHTLTOrder();
                return this;
            }

            public Builder clearDepositHTLTOrder() {
                copyOnWrite();
                ((SigningInput) this.instance).clearDepositHTLTOrder();
                return this;
            }

            public Builder clearFreezeOrder() {
                copyOnWrite();
                ((SigningInput) this.instance).clearFreezeOrder();
                return this;
            }

            public Builder clearHtltOrder() {
                copyOnWrite();
                ((SigningInput) this.instance).clearHtltOrder();
                return this;
            }

            public Builder clearIssueOrder() {
                copyOnWrite();
                ((SigningInput) this.instance).clearIssueOrder();
                return this;
            }

            public Builder clearMemo() {
                copyOnWrite();
                ((SigningInput) this.instance).clearMemo();
                return this;
            }

            public Builder clearMintOrder() {
                copyOnWrite();
                ((SigningInput) this.instance).clearMintOrder();
                return this;
            }

            public Builder clearOrderOneof() {
                copyOnWrite();
                ((SigningInput) this.instance).clearOrderOneof();
                return this;
            }

            public Builder clearPrivateKey() {
                copyOnWrite();
                ((SigningInput) this.instance).clearPrivateKey();
                return this;
            }

            public Builder clearRefundHTLTOrder() {
                copyOnWrite();
                ((SigningInput) this.instance).clearRefundHTLTOrder();
                return this;
            }

            public Builder clearSendOrder() {
                copyOnWrite();
                ((SigningInput) this.instance).clearSendOrder();
                return this;
            }

            public Builder clearSequence() {
                copyOnWrite();
                ((SigningInput) this.instance).clearSequence();
                return this;
            }

            public Builder clearSideDelegateOrder() {
                copyOnWrite();
                ((SigningInput) this.instance).clearSideDelegateOrder();
                return this;
            }

            public Builder clearSideRedelegateOrder() {
                copyOnWrite();
                ((SigningInput) this.instance).clearSideRedelegateOrder();
                return this;
            }

            public Builder clearSideUndelegateOrder() {
                copyOnWrite();
                ((SigningInput) this.instance).clearSideUndelegateOrder();
                return this;
            }

            public Builder clearSource() {
                copyOnWrite();
                ((SigningInput) this.instance).clearSource();
                return this;
            }

            public Builder clearTimeLockOrder() {
                copyOnWrite();
                ((SigningInput) this.instance).clearTimeLockOrder();
                return this;
            }

            public Builder clearTimeRelockOrder() {
                copyOnWrite();
                ((SigningInput) this.instance).clearTimeRelockOrder();
                return this;
            }

            public Builder clearTimeUnlockOrder() {
                copyOnWrite();
                ((SigningInput) this.instance).clearTimeUnlockOrder();
                return this;
            }

            public Builder clearTradeOrder() {
                copyOnWrite();
                ((SigningInput) this.instance).clearTradeOrder();
                return this;
            }

            public Builder clearTransferOutOrder() {
                copyOnWrite();
                ((SigningInput) this.instance).clearTransferOutOrder();
                return this;
            }

            public Builder clearUnfreezeOrder() {
                copyOnWrite();
                ((SigningInput) this.instance).clearUnfreezeOrder();
                return this;
            }

            public long getAccountNumber() {
                return ((SigningInput) this.instance).getAccountNumber();
            }

            public TokenBurnOrder getBurnOrder() {
                return ((SigningInput) this.instance).getBurnOrder();
            }

            public CancelTradeOrder getCancelTradeOrder() {
                return ((SigningInput) this.instance).getCancelTradeOrder();
            }

            public String getChainId() {
                return ((SigningInput) this.instance).getChainId();
            }

            public ByteString getChainIdBytes() {
                return ((SigningInput) this.instance).getChainIdBytes();
            }

            public ClaimHTLOrder getClaimHTLTOrder() {
                return ((SigningInput) this.instance).getClaimHTLTOrder();
            }

            public DepositHTLTOrder getDepositHTLTOrder() {
                return ((SigningInput) this.instance).getDepositHTLTOrder();
            }

            public TokenFreezeOrder getFreezeOrder() {
                return ((SigningInput) this.instance).getFreezeOrder();
            }

            public HTLTOrder getHtltOrder() {
                return ((SigningInput) this.instance).getHtltOrder();
            }

            public TokenIssueOrder getIssueOrder() {
                return ((SigningInput) this.instance).getIssueOrder();
            }

            public String getMemo() {
                return ((SigningInput) this.instance).getMemo();
            }

            public ByteString getMemoBytes() {
                return ((SigningInput) this.instance).getMemoBytes();
            }

            public TokenMintOrder getMintOrder() {
                return ((SigningInput) this.instance).getMintOrder();
            }

            public OrderOneofCase getOrderOneofCase() {
                return ((SigningInput) this.instance).getOrderOneofCase();
            }

            public ByteString getPrivateKey() {
                return ((SigningInput) this.instance).getPrivateKey();
            }

            public RefundHTLTOrder getRefundHTLTOrder() {
                return ((SigningInput) this.instance).getRefundHTLTOrder();
            }

            public SendOrder getSendOrder() {
                return ((SigningInput) this.instance).getSendOrder();
            }

            public long getSequence() {
                return ((SigningInput) this.instance).getSequence();
            }

            public SideChainDelegate getSideDelegateOrder() {
                return ((SigningInput) this.instance).getSideDelegateOrder();
            }

            public SideChainRedelegate getSideRedelegateOrder() {
                return ((SigningInput) this.instance).getSideRedelegateOrder();
            }

            public SideChainUndelegate getSideUndelegateOrder() {
                return ((SigningInput) this.instance).getSideUndelegateOrder();
            }

            public long getSource() {
                return ((SigningInput) this.instance).getSource();
            }

            public TimeLockOrder getTimeLockOrder() {
                return ((SigningInput) this.instance).getTimeLockOrder();
            }

            public TimeRelockOrder getTimeRelockOrder() {
                return ((SigningInput) this.instance).getTimeRelockOrder();
            }

            public TimeUnlockOrder getTimeUnlockOrder() {
                return ((SigningInput) this.instance).getTimeUnlockOrder();
            }

            public TradeOrder getTradeOrder() {
                return ((SigningInput) this.instance).getTradeOrder();
            }

            public TransferOut getTransferOutOrder() {
                return ((SigningInput) this.instance).getTransferOutOrder();
            }

            public TokenUnfreezeOrder getUnfreezeOrder() {
                return ((SigningInput) this.instance).getUnfreezeOrder();
            }

            public boolean hasBurnOrder() {
                return ((SigningInput) this.instance).hasBurnOrder();
            }

            public boolean hasCancelTradeOrder() {
                return ((SigningInput) this.instance).hasCancelTradeOrder();
            }

            public boolean hasClaimHTLTOrder() {
                return ((SigningInput) this.instance).hasClaimHTLTOrder();
            }

            public boolean hasDepositHTLTOrder() {
                return ((SigningInput) this.instance).hasDepositHTLTOrder();
            }

            public boolean hasFreezeOrder() {
                return ((SigningInput) this.instance).hasFreezeOrder();
            }

            public boolean hasHtltOrder() {
                return ((SigningInput) this.instance).hasHtltOrder();
            }

            public boolean hasIssueOrder() {
                return ((SigningInput) this.instance).hasIssueOrder();
            }

            public boolean hasMintOrder() {
                return ((SigningInput) this.instance).hasMintOrder();
            }

            public boolean hasRefundHTLTOrder() {
                return ((SigningInput) this.instance).hasRefundHTLTOrder();
            }

            public boolean hasSendOrder() {
                return ((SigningInput) this.instance).hasSendOrder();
            }

            public boolean hasSideDelegateOrder() {
                return ((SigningInput) this.instance).hasSideDelegateOrder();
            }

            public boolean hasSideRedelegateOrder() {
                return ((SigningInput) this.instance).hasSideRedelegateOrder();
            }

            public boolean hasSideUndelegateOrder() {
                return ((SigningInput) this.instance).hasSideUndelegateOrder();
            }

            public boolean hasTimeLockOrder() {
                return ((SigningInput) this.instance).hasTimeLockOrder();
            }

            public boolean hasTimeRelockOrder() {
                return ((SigningInput) this.instance).hasTimeRelockOrder();
            }

            public boolean hasTimeUnlockOrder() {
                return ((SigningInput) this.instance).hasTimeUnlockOrder();
            }

            public boolean hasTradeOrder() {
                return ((SigningInput) this.instance).hasTradeOrder();
            }

            public boolean hasTransferOutOrder() {
                return ((SigningInput) this.instance).hasTransferOutOrder();
            }

            public boolean hasUnfreezeOrder() {
                return ((SigningInput) this.instance).hasUnfreezeOrder();
            }

            public Builder mergeBurnOrder(TokenBurnOrder tokenBurnOrder) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeBurnOrder(tokenBurnOrder);
                return this;
            }

            public Builder mergeCancelTradeOrder(CancelTradeOrder cancelTradeOrder) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeCancelTradeOrder(cancelTradeOrder);
                return this;
            }

            public Builder mergeClaimHTLTOrder(ClaimHTLOrder claimHTLOrder) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeClaimHTLTOrder(claimHTLOrder);
                return this;
            }

            public Builder mergeDepositHTLTOrder(DepositHTLTOrder depositHTLTOrder) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeDepositHTLTOrder(depositHTLTOrder);
                return this;
            }

            public Builder mergeFreezeOrder(TokenFreezeOrder tokenFreezeOrder) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeFreezeOrder(tokenFreezeOrder);
                return this;
            }

            public Builder mergeHtltOrder(HTLTOrder hTLTOrder) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeHtltOrder(hTLTOrder);
                return this;
            }

            public Builder mergeIssueOrder(TokenIssueOrder tokenIssueOrder) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeIssueOrder(tokenIssueOrder);
                return this;
            }

            public Builder mergeMintOrder(TokenMintOrder tokenMintOrder) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeMintOrder(tokenMintOrder);
                return this;
            }

            public Builder mergeRefundHTLTOrder(RefundHTLTOrder refundHTLTOrder) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeRefundHTLTOrder(refundHTLTOrder);
                return this;
            }

            public Builder mergeSendOrder(SendOrder sendOrder) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeSendOrder(sendOrder);
                return this;
            }

            public Builder mergeSideDelegateOrder(SideChainDelegate sideChainDelegate) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeSideDelegateOrder(sideChainDelegate);
                return this;
            }

            public Builder mergeSideRedelegateOrder(SideChainRedelegate sideChainRedelegate) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeSideRedelegateOrder(sideChainRedelegate);
                return this;
            }

            public Builder mergeSideUndelegateOrder(SideChainUndelegate sideChainUndelegate) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeSideUndelegateOrder(sideChainUndelegate);
                return this;
            }

            public Builder mergeTimeLockOrder(TimeLockOrder timeLockOrder) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeTimeLockOrder(timeLockOrder);
                return this;
            }

            public Builder mergeTimeRelockOrder(TimeRelockOrder timeRelockOrder) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeTimeRelockOrder(timeRelockOrder);
                return this;
            }

            public Builder mergeTimeUnlockOrder(TimeUnlockOrder timeUnlockOrder) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeTimeUnlockOrder(timeUnlockOrder);
                return this;
            }

            public Builder mergeTradeOrder(TradeOrder tradeOrder) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeTradeOrder(tradeOrder);
                return this;
            }

            public Builder mergeTransferOutOrder(TransferOut transferOut) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeTransferOutOrder(transferOut);
                return this;
            }

            public Builder mergeUnfreezeOrder(TokenUnfreezeOrder tokenUnfreezeOrder) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeUnfreezeOrder(tokenUnfreezeOrder);
                return this;
            }

            public Builder setAccountNumber(long j) {
                copyOnWrite();
                ((SigningInput) this.instance).setAccountNumber(j);
                return this;
            }

            public Builder setBurnOrder(TokenBurnOrder tokenBurnOrder) {
                copyOnWrite();
                ((SigningInput) this.instance).setBurnOrder(tokenBurnOrder);
                return this;
            }

            public Builder setCancelTradeOrder(CancelTradeOrder cancelTradeOrder) {
                copyOnWrite();
                ((SigningInput) this.instance).setCancelTradeOrder(cancelTradeOrder);
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

            public Builder setClaimHTLTOrder(ClaimHTLOrder claimHTLOrder) {
                copyOnWrite();
                ((SigningInput) this.instance).setClaimHTLTOrder(claimHTLOrder);
                return this;
            }

            public Builder setDepositHTLTOrder(DepositHTLTOrder depositHTLTOrder) {
                copyOnWrite();
                ((SigningInput) this.instance).setDepositHTLTOrder(depositHTLTOrder);
                return this;
            }

            public Builder setFreezeOrder(TokenFreezeOrder tokenFreezeOrder) {
                copyOnWrite();
                ((SigningInput) this.instance).setFreezeOrder(tokenFreezeOrder);
                return this;
            }

            public Builder setHtltOrder(HTLTOrder hTLTOrder) {
                copyOnWrite();
                ((SigningInput) this.instance).setHtltOrder(hTLTOrder);
                return this;
            }

            public Builder setIssueOrder(TokenIssueOrder tokenIssueOrder) {
                copyOnWrite();
                ((SigningInput) this.instance).setIssueOrder(tokenIssueOrder);
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

            public Builder setMintOrder(TokenMintOrder tokenMintOrder) {
                copyOnWrite();
                ((SigningInput) this.instance).setMintOrder(tokenMintOrder);
                return this;
            }

            public Builder setPrivateKey(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setPrivateKey(byteString);
                return this;
            }

            public Builder setRefundHTLTOrder(RefundHTLTOrder refundHTLTOrder) {
                copyOnWrite();
                ((SigningInput) this.instance).setRefundHTLTOrder(refundHTLTOrder);
                return this;
            }

            public Builder setSendOrder(SendOrder sendOrder) {
                copyOnWrite();
                ((SigningInput) this.instance).setSendOrder(sendOrder);
                return this;
            }

            public Builder setSequence(long j) {
                copyOnWrite();
                ((SigningInput) this.instance).setSequence(j);
                return this;
            }

            public Builder setSideDelegateOrder(SideChainDelegate sideChainDelegate) {
                copyOnWrite();
                ((SigningInput) this.instance).setSideDelegateOrder(sideChainDelegate);
                return this;
            }

            public Builder setSideRedelegateOrder(SideChainRedelegate sideChainRedelegate) {
                copyOnWrite();
                ((SigningInput) this.instance).setSideRedelegateOrder(sideChainRedelegate);
                return this;
            }

            public Builder setSideUndelegateOrder(SideChainUndelegate sideChainUndelegate) {
                copyOnWrite();
                ((SigningInput) this.instance).setSideUndelegateOrder(sideChainUndelegate);
                return this;
            }

            public Builder setSource(long j) {
                copyOnWrite();
                ((SigningInput) this.instance).setSource(j);
                return this;
            }

            public Builder setTimeLockOrder(TimeLockOrder timeLockOrder) {
                copyOnWrite();
                ((SigningInput) this.instance).setTimeLockOrder(timeLockOrder);
                return this;
            }

            public Builder setTimeRelockOrder(TimeRelockOrder timeRelockOrder) {
                copyOnWrite();
                ((SigningInput) this.instance).setTimeRelockOrder(timeRelockOrder);
                return this;
            }

            public Builder setTimeUnlockOrder(TimeUnlockOrder timeUnlockOrder) {
                copyOnWrite();
                ((SigningInput) this.instance).setTimeUnlockOrder(timeUnlockOrder);
                return this;
            }

            public Builder setTradeOrder(TradeOrder tradeOrder) {
                copyOnWrite();
                ((SigningInput) this.instance).setTradeOrder(tradeOrder);
                return this;
            }

            public Builder setTransferOutOrder(TransferOut transferOut) {
                copyOnWrite();
                ((SigningInput) this.instance).setTransferOutOrder(transferOut);
                return this;
            }

            public Builder setUnfreezeOrder(TokenUnfreezeOrder tokenUnfreezeOrder) {
                copyOnWrite();
                ((SigningInput) this.instance).setUnfreezeOrder(tokenUnfreezeOrder);
                return this;
            }

            private Builder() {
                super(SigningInput.DEFAULT_INSTANCE);
            }

            public Builder setBurnOrder(TokenBurnOrder.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setBurnOrder((TokenBurnOrder) builder.build());
                return this;
            }

            public Builder setCancelTradeOrder(CancelTradeOrder.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setCancelTradeOrder((CancelTradeOrder) builder.build());
                return this;
            }

            public Builder setClaimHTLTOrder(ClaimHTLOrder.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setClaimHTLTOrder((ClaimHTLOrder) builder.build());
                return this;
            }

            public Builder setDepositHTLTOrder(DepositHTLTOrder.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setDepositHTLTOrder((DepositHTLTOrder) builder.build());
                return this;
            }

            public Builder setFreezeOrder(TokenFreezeOrder.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setFreezeOrder((TokenFreezeOrder) builder.build());
                return this;
            }

            public Builder setHtltOrder(HTLTOrder.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setHtltOrder((HTLTOrder) builder.build());
                return this;
            }

            public Builder setIssueOrder(TokenIssueOrder.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setIssueOrder((TokenIssueOrder) builder.build());
                return this;
            }

            public Builder setMintOrder(TokenMintOrder.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setMintOrder((TokenMintOrder) builder.build());
                return this;
            }

            public Builder setRefundHTLTOrder(RefundHTLTOrder.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setRefundHTLTOrder((RefundHTLTOrder) builder.build());
                return this;
            }

            public Builder setSendOrder(SendOrder.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setSendOrder((SendOrder) builder.build());
                return this;
            }

            public Builder setSideDelegateOrder(SideChainDelegate.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setSideDelegateOrder((SideChainDelegate) builder.build());
                return this;
            }

            public Builder setSideRedelegateOrder(SideChainRedelegate.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setSideRedelegateOrder((SideChainRedelegate) builder.build());
                return this;
            }

            public Builder setSideUndelegateOrder(SideChainUndelegate.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setSideUndelegateOrder((SideChainUndelegate) builder.build());
                return this;
            }

            public Builder setTimeLockOrder(TimeLockOrder.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setTimeLockOrder((TimeLockOrder) builder.build());
                return this;
            }

            public Builder setTimeRelockOrder(TimeRelockOrder.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setTimeRelockOrder((TimeRelockOrder) builder.build());
                return this;
            }

            public Builder setTimeUnlockOrder(TimeUnlockOrder.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setTimeUnlockOrder((TimeUnlockOrder) builder.build());
                return this;
            }

            public Builder setTradeOrder(TradeOrder.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setTradeOrder((TradeOrder) builder.build());
                return this;
            }

            public Builder setTransferOutOrder(TransferOut.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setTransferOutOrder((TransferOut) builder.build());
                return this;
            }

            public Builder setUnfreezeOrder(TokenUnfreezeOrder.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setUnfreezeOrder((TokenUnfreezeOrder) builder.build());
                return this;
            }
        }

        public enum OrderOneofCase {
            TRADE_ORDER(8),
            CANCEL_TRADE_ORDER(9),
            SEND_ORDER(10),
            FREEZE_ORDER(11),
            UNFREEZE_ORDER(12),
            HTLT_ORDER(13),
            DEPOSITHTLT_ORDER(14),
            CLAIMHTLT_ORDER(15),
            REFUNDHTLT_ORDER(16),
            ISSUE_ORDER(17),
            MINT_ORDER(18),
            BURN_ORDER(19),
            TRANSFER_OUT_ORDER(20),
            SIDE_DELEGATE_ORDER(21),
            SIDE_REDELEGATE_ORDER(22),
            SIDE_UNDELEGATE_ORDER(23),
            TIME_LOCK_ORDER(24),
            TIME_RELOCK_ORDER(25),
            TIME_UNLOCK_ORDER(26),
            ORDERONEOF_NOT_SET(0);
            
            private final int value;

            private OrderOneofCase(int i) {
                this.value = i;
            }

            public static OrderOneofCase forNumber(int i) {
                if (i == 0) {
                    return ORDERONEOF_NOT_SET;
                }
                switch (i) {
                    case 8:
                        return TRADE_ORDER;
                    case 9:
                        return CANCEL_TRADE_ORDER;
                    case 10:
                        return SEND_ORDER;
                    case 11:
                        return FREEZE_ORDER;
                    case 12:
                        return UNFREEZE_ORDER;
                    case 13:
                        return HTLT_ORDER;
                    case 14:
                        return DEPOSITHTLT_ORDER;
                    case 15:
                        return CLAIMHTLT_ORDER;
                    case 16:
                        return REFUNDHTLT_ORDER;
                    case 17:
                        return ISSUE_ORDER;
                    case 18:
                        return MINT_ORDER;
                    case 19:
                        return BURN_ORDER;
                    case 20:
                        return TRANSFER_OUT_ORDER;
                    case 21:
                        return SIDE_DELEGATE_ORDER;
                    case 22:
                        return SIDE_REDELEGATE_ORDER;
                    case 23:
                        return SIDE_UNDELEGATE_ORDER;
                    case 24:
                        return TIME_LOCK_ORDER;
                    case 25:
                        return TIME_RELOCK_ORDER;
                    case 26:
                        return TIME_UNLOCK_ORDER;
                    default:
                        return null;
                }
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static OrderOneofCase valueOf(int i) {
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
        public void clearAccountNumber() {
            this.accountNumber_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearBurnOrder() {
            if (this.orderOneofCase_ == 19) {
                this.orderOneofCase_ = 0;
                this.orderOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearCancelTradeOrder() {
            if (this.orderOneofCase_ == 9) {
                this.orderOneofCase_ = 0;
                this.orderOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearChainId() {
            this.chainId_ = getDefaultInstance().getChainId();
        }

        /* access modifiers changed from: private */
        public void clearClaimHTLTOrder() {
            if (this.orderOneofCase_ == 15) {
                this.orderOneofCase_ = 0;
                this.orderOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearDepositHTLTOrder() {
            if (this.orderOneofCase_ == 14) {
                this.orderOneofCase_ = 0;
                this.orderOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearFreezeOrder() {
            if (this.orderOneofCase_ == 11) {
                this.orderOneofCase_ = 0;
                this.orderOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearHtltOrder() {
            if (this.orderOneofCase_ == 13) {
                this.orderOneofCase_ = 0;
                this.orderOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearIssueOrder() {
            if (this.orderOneofCase_ == 17) {
                this.orderOneofCase_ = 0;
                this.orderOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearMemo() {
            this.memo_ = getDefaultInstance().getMemo();
        }

        /* access modifiers changed from: private */
        public void clearMintOrder() {
            if (this.orderOneofCase_ == 18) {
                this.orderOneofCase_ = 0;
                this.orderOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearOrderOneof() {
            this.orderOneofCase_ = 0;
            this.orderOneof_ = null;
        }

        /* access modifiers changed from: private */
        public void clearPrivateKey() {
            this.privateKey_ = getDefaultInstance().getPrivateKey();
        }

        /* access modifiers changed from: private */
        public void clearRefundHTLTOrder() {
            if (this.orderOneofCase_ == 16) {
                this.orderOneofCase_ = 0;
                this.orderOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearSendOrder() {
            if (this.orderOneofCase_ == 10) {
                this.orderOneofCase_ = 0;
                this.orderOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearSequence() {
            this.sequence_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSideDelegateOrder() {
            if (this.orderOneofCase_ == 21) {
                this.orderOneofCase_ = 0;
                this.orderOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearSideRedelegateOrder() {
            if (this.orderOneofCase_ == 22) {
                this.orderOneofCase_ = 0;
                this.orderOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearSideUndelegateOrder() {
            if (this.orderOneofCase_ == 23) {
                this.orderOneofCase_ = 0;
                this.orderOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearSource() {
            this.source_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTimeLockOrder() {
            if (this.orderOneofCase_ == 24) {
                this.orderOneofCase_ = 0;
                this.orderOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearTimeRelockOrder() {
            if (this.orderOneofCase_ == 25) {
                this.orderOneofCase_ = 0;
                this.orderOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearTimeUnlockOrder() {
            if (this.orderOneofCase_ == 26) {
                this.orderOneofCase_ = 0;
                this.orderOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearTradeOrder() {
            if (this.orderOneofCase_ == 8) {
                this.orderOneofCase_ = 0;
                this.orderOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearTransferOutOrder() {
            if (this.orderOneofCase_ == 20) {
                this.orderOneofCase_ = 0;
                this.orderOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearUnfreezeOrder() {
            if (this.orderOneofCase_ == 12) {
                this.orderOneofCase_ = 0;
                this.orderOneof_ = null;
            }
        }

        public static SigningInput getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeBurnOrder(TokenBurnOrder tokenBurnOrder) {
            tokenBurnOrder.getClass();
            if (this.orderOneofCase_ != 19 || this.orderOneof_ == TokenBurnOrder.getDefaultInstance()) {
                this.orderOneof_ = tokenBurnOrder;
            } else {
                this.orderOneof_ = ((TokenBurnOrder.Builder) TokenBurnOrder.newBuilder((TokenBurnOrder) this.orderOneof_).mergeFrom(tokenBurnOrder)).buildPartial();
            }
            this.orderOneofCase_ = 19;
        }

        /* access modifiers changed from: private */
        public void mergeCancelTradeOrder(CancelTradeOrder cancelTradeOrder) {
            cancelTradeOrder.getClass();
            if (this.orderOneofCase_ != 9 || this.orderOneof_ == CancelTradeOrder.getDefaultInstance()) {
                this.orderOneof_ = cancelTradeOrder;
            } else {
                this.orderOneof_ = ((CancelTradeOrder.Builder) CancelTradeOrder.newBuilder((CancelTradeOrder) this.orderOneof_).mergeFrom(cancelTradeOrder)).buildPartial();
            }
            this.orderOneofCase_ = 9;
        }

        /* access modifiers changed from: private */
        public void mergeClaimHTLTOrder(ClaimHTLOrder claimHTLOrder) {
            claimHTLOrder.getClass();
            if (this.orderOneofCase_ != 15 || this.orderOneof_ == ClaimHTLOrder.getDefaultInstance()) {
                this.orderOneof_ = claimHTLOrder;
            } else {
                this.orderOneof_ = ((ClaimHTLOrder.Builder) ClaimHTLOrder.newBuilder((ClaimHTLOrder) this.orderOneof_).mergeFrom(claimHTLOrder)).buildPartial();
            }
            this.orderOneofCase_ = 15;
        }

        /* access modifiers changed from: private */
        public void mergeDepositHTLTOrder(DepositHTLTOrder depositHTLTOrder) {
            depositHTLTOrder.getClass();
            if (this.orderOneofCase_ != 14 || this.orderOneof_ == DepositHTLTOrder.getDefaultInstance()) {
                this.orderOneof_ = depositHTLTOrder;
            } else {
                this.orderOneof_ = ((DepositHTLTOrder.Builder) DepositHTLTOrder.newBuilder((DepositHTLTOrder) this.orderOneof_).mergeFrom(depositHTLTOrder)).buildPartial();
            }
            this.orderOneofCase_ = 14;
        }

        /* access modifiers changed from: private */
        public void mergeFreezeOrder(TokenFreezeOrder tokenFreezeOrder) {
            tokenFreezeOrder.getClass();
            if (this.orderOneofCase_ != 11 || this.orderOneof_ == TokenFreezeOrder.getDefaultInstance()) {
                this.orderOneof_ = tokenFreezeOrder;
            } else {
                this.orderOneof_ = ((TokenFreezeOrder.Builder) TokenFreezeOrder.newBuilder((TokenFreezeOrder) this.orderOneof_).mergeFrom(tokenFreezeOrder)).buildPartial();
            }
            this.orderOneofCase_ = 11;
        }

        /* access modifiers changed from: private */
        public void mergeHtltOrder(HTLTOrder hTLTOrder) {
            hTLTOrder.getClass();
            if (this.orderOneofCase_ != 13 || this.orderOneof_ == HTLTOrder.getDefaultInstance()) {
                this.orderOneof_ = hTLTOrder;
            } else {
                this.orderOneof_ = ((HTLTOrder.Builder) HTLTOrder.newBuilder((HTLTOrder) this.orderOneof_).mergeFrom(hTLTOrder)).buildPartial();
            }
            this.orderOneofCase_ = 13;
        }

        /* access modifiers changed from: private */
        public void mergeIssueOrder(TokenIssueOrder tokenIssueOrder) {
            tokenIssueOrder.getClass();
            if (this.orderOneofCase_ != 17 || this.orderOneof_ == TokenIssueOrder.getDefaultInstance()) {
                this.orderOneof_ = tokenIssueOrder;
            } else {
                this.orderOneof_ = ((TokenIssueOrder.Builder) TokenIssueOrder.newBuilder((TokenIssueOrder) this.orderOneof_).mergeFrom(tokenIssueOrder)).buildPartial();
            }
            this.orderOneofCase_ = 17;
        }

        /* access modifiers changed from: private */
        public void mergeMintOrder(TokenMintOrder tokenMintOrder) {
            tokenMintOrder.getClass();
            if (this.orderOneofCase_ != 18 || this.orderOneof_ == TokenMintOrder.getDefaultInstance()) {
                this.orderOneof_ = tokenMintOrder;
            } else {
                this.orderOneof_ = ((TokenMintOrder.Builder) TokenMintOrder.newBuilder((TokenMintOrder) this.orderOneof_).mergeFrom(tokenMintOrder)).buildPartial();
            }
            this.orderOneofCase_ = 18;
        }

        /* access modifiers changed from: private */
        public void mergeRefundHTLTOrder(RefundHTLTOrder refundHTLTOrder) {
            refundHTLTOrder.getClass();
            if (this.orderOneofCase_ != 16 || this.orderOneof_ == RefundHTLTOrder.getDefaultInstance()) {
                this.orderOneof_ = refundHTLTOrder;
            } else {
                this.orderOneof_ = ((RefundHTLTOrder.Builder) RefundHTLTOrder.newBuilder((RefundHTLTOrder) this.orderOneof_).mergeFrom(refundHTLTOrder)).buildPartial();
            }
            this.orderOneofCase_ = 16;
        }

        /* access modifiers changed from: private */
        public void mergeSendOrder(SendOrder sendOrder) {
            sendOrder.getClass();
            if (this.orderOneofCase_ != 10 || this.orderOneof_ == SendOrder.getDefaultInstance()) {
                this.orderOneof_ = sendOrder;
            } else {
                this.orderOneof_ = ((SendOrder.Builder) SendOrder.newBuilder((SendOrder) this.orderOneof_).mergeFrom(sendOrder)).buildPartial();
            }
            this.orderOneofCase_ = 10;
        }

        /* access modifiers changed from: private */
        public void mergeSideDelegateOrder(SideChainDelegate sideChainDelegate) {
            sideChainDelegate.getClass();
            if (this.orderOneofCase_ != 21 || this.orderOneof_ == SideChainDelegate.getDefaultInstance()) {
                this.orderOneof_ = sideChainDelegate;
            } else {
                this.orderOneof_ = ((SideChainDelegate.Builder) SideChainDelegate.newBuilder((SideChainDelegate) this.orderOneof_).mergeFrom(sideChainDelegate)).buildPartial();
            }
            this.orderOneofCase_ = 21;
        }

        /* access modifiers changed from: private */
        public void mergeSideRedelegateOrder(SideChainRedelegate sideChainRedelegate) {
            sideChainRedelegate.getClass();
            if (this.orderOneofCase_ != 22 || this.orderOneof_ == SideChainRedelegate.getDefaultInstance()) {
                this.orderOneof_ = sideChainRedelegate;
            } else {
                this.orderOneof_ = ((SideChainRedelegate.Builder) SideChainRedelegate.newBuilder((SideChainRedelegate) this.orderOneof_).mergeFrom(sideChainRedelegate)).buildPartial();
            }
            this.orderOneofCase_ = 22;
        }

        /* access modifiers changed from: private */
        public void mergeSideUndelegateOrder(SideChainUndelegate sideChainUndelegate) {
            sideChainUndelegate.getClass();
            if (this.orderOneofCase_ != 23 || this.orderOneof_ == SideChainUndelegate.getDefaultInstance()) {
                this.orderOneof_ = sideChainUndelegate;
            } else {
                this.orderOneof_ = ((SideChainUndelegate.Builder) SideChainUndelegate.newBuilder((SideChainUndelegate) this.orderOneof_).mergeFrom(sideChainUndelegate)).buildPartial();
            }
            this.orderOneofCase_ = 23;
        }

        /* access modifiers changed from: private */
        public void mergeTimeLockOrder(TimeLockOrder timeLockOrder) {
            timeLockOrder.getClass();
            if (this.orderOneofCase_ != 24 || this.orderOneof_ == TimeLockOrder.getDefaultInstance()) {
                this.orderOneof_ = timeLockOrder;
            } else {
                this.orderOneof_ = ((TimeLockOrder.Builder) TimeLockOrder.newBuilder((TimeLockOrder) this.orderOneof_).mergeFrom(timeLockOrder)).buildPartial();
            }
            this.orderOneofCase_ = 24;
        }

        /* access modifiers changed from: private */
        public void mergeTimeRelockOrder(TimeRelockOrder timeRelockOrder) {
            timeRelockOrder.getClass();
            if (this.orderOneofCase_ != 25 || this.orderOneof_ == TimeRelockOrder.getDefaultInstance()) {
                this.orderOneof_ = timeRelockOrder;
            } else {
                this.orderOneof_ = ((TimeRelockOrder.Builder) TimeRelockOrder.newBuilder((TimeRelockOrder) this.orderOneof_).mergeFrom(timeRelockOrder)).buildPartial();
            }
            this.orderOneofCase_ = 25;
        }

        /* access modifiers changed from: private */
        public void mergeTimeUnlockOrder(TimeUnlockOrder timeUnlockOrder) {
            timeUnlockOrder.getClass();
            if (this.orderOneofCase_ != 26 || this.orderOneof_ == TimeUnlockOrder.getDefaultInstance()) {
                this.orderOneof_ = timeUnlockOrder;
            } else {
                this.orderOneof_ = ((TimeUnlockOrder.Builder) TimeUnlockOrder.newBuilder((TimeUnlockOrder) this.orderOneof_).mergeFrom(timeUnlockOrder)).buildPartial();
            }
            this.orderOneofCase_ = 26;
        }

        /* access modifiers changed from: private */
        public void mergeTradeOrder(TradeOrder tradeOrder) {
            tradeOrder.getClass();
            if (this.orderOneofCase_ != 8 || this.orderOneof_ == TradeOrder.getDefaultInstance()) {
                this.orderOneof_ = tradeOrder;
            } else {
                this.orderOneof_ = ((TradeOrder.Builder) TradeOrder.newBuilder((TradeOrder) this.orderOneof_).mergeFrom(tradeOrder)).buildPartial();
            }
            this.orderOneofCase_ = 8;
        }

        /* access modifiers changed from: private */
        public void mergeTransferOutOrder(TransferOut transferOut) {
            transferOut.getClass();
            if (this.orderOneofCase_ != 20 || this.orderOneof_ == TransferOut.getDefaultInstance()) {
                this.orderOneof_ = transferOut;
            } else {
                this.orderOneof_ = ((TransferOut.Builder) TransferOut.newBuilder((TransferOut) this.orderOneof_).mergeFrom(transferOut)).buildPartial();
            }
            this.orderOneofCase_ = 20;
        }

        /* access modifiers changed from: private */
        public void mergeUnfreezeOrder(TokenUnfreezeOrder tokenUnfreezeOrder) {
            tokenUnfreezeOrder.getClass();
            if (this.orderOneofCase_ != 12 || this.orderOneof_ == TokenUnfreezeOrder.getDefaultInstance()) {
                this.orderOneof_ = tokenUnfreezeOrder;
            } else {
                this.orderOneof_ = ((TokenUnfreezeOrder.Builder) TokenUnfreezeOrder.newBuilder((TokenUnfreezeOrder) this.orderOneof_).mergeFrom(tokenUnfreezeOrder)).buildPartial();
            }
            this.orderOneofCase_ = 12;
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
        public void setAccountNumber(long j) {
            this.accountNumber_ = j;
        }

        /* access modifiers changed from: private */
        public void setBurnOrder(TokenBurnOrder tokenBurnOrder) {
            tokenBurnOrder.getClass();
            this.orderOneof_ = tokenBurnOrder;
            this.orderOneofCase_ = 19;
        }

        /* access modifiers changed from: private */
        public void setCancelTradeOrder(CancelTradeOrder cancelTradeOrder) {
            cancelTradeOrder.getClass();
            this.orderOneof_ = cancelTradeOrder;
            this.orderOneofCase_ = 9;
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
        public void setClaimHTLTOrder(ClaimHTLOrder claimHTLOrder) {
            claimHTLOrder.getClass();
            this.orderOneof_ = claimHTLOrder;
            this.orderOneofCase_ = 15;
        }

        /* access modifiers changed from: private */
        public void setDepositHTLTOrder(DepositHTLTOrder depositHTLTOrder) {
            depositHTLTOrder.getClass();
            this.orderOneof_ = depositHTLTOrder;
            this.orderOneofCase_ = 14;
        }

        /* access modifiers changed from: private */
        public void setFreezeOrder(TokenFreezeOrder tokenFreezeOrder) {
            tokenFreezeOrder.getClass();
            this.orderOneof_ = tokenFreezeOrder;
            this.orderOneofCase_ = 11;
        }

        /* access modifiers changed from: private */
        public void setHtltOrder(HTLTOrder hTLTOrder) {
            hTLTOrder.getClass();
            this.orderOneof_ = hTLTOrder;
            this.orderOneofCase_ = 13;
        }

        /* access modifiers changed from: private */
        public void setIssueOrder(TokenIssueOrder tokenIssueOrder) {
            tokenIssueOrder.getClass();
            this.orderOneof_ = tokenIssueOrder;
            this.orderOneofCase_ = 17;
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
        public void setMintOrder(TokenMintOrder tokenMintOrder) {
            tokenMintOrder.getClass();
            this.orderOneof_ = tokenMintOrder;
            this.orderOneofCase_ = 18;
        }

        /* access modifiers changed from: private */
        public void setPrivateKey(ByteString byteString) {
            byteString.getClass();
            this.privateKey_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setRefundHTLTOrder(RefundHTLTOrder refundHTLTOrder) {
            refundHTLTOrder.getClass();
            this.orderOneof_ = refundHTLTOrder;
            this.orderOneofCase_ = 16;
        }

        /* access modifiers changed from: private */
        public void setSendOrder(SendOrder sendOrder) {
            sendOrder.getClass();
            this.orderOneof_ = sendOrder;
            this.orderOneofCase_ = 10;
        }

        /* access modifiers changed from: private */
        public void setSequence(long j) {
            this.sequence_ = j;
        }

        /* access modifiers changed from: private */
        public void setSideDelegateOrder(SideChainDelegate sideChainDelegate) {
            sideChainDelegate.getClass();
            this.orderOneof_ = sideChainDelegate;
            this.orderOneofCase_ = 21;
        }

        /* access modifiers changed from: private */
        public void setSideRedelegateOrder(SideChainRedelegate sideChainRedelegate) {
            sideChainRedelegate.getClass();
            this.orderOneof_ = sideChainRedelegate;
            this.orderOneofCase_ = 22;
        }

        /* access modifiers changed from: private */
        public void setSideUndelegateOrder(SideChainUndelegate sideChainUndelegate) {
            sideChainUndelegate.getClass();
            this.orderOneof_ = sideChainUndelegate;
            this.orderOneofCase_ = 23;
        }

        /* access modifiers changed from: private */
        public void setSource(long j) {
            this.source_ = j;
        }

        /* access modifiers changed from: private */
        public void setTimeLockOrder(TimeLockOrder timeLockOrder) {
            timeLockOrder.getClass();
            this.orderOneof_ = timeLockOrder;
            this.orderOneofCase_ = 24;
        }

        /* access modifiers changed from: private */
        public void setTimeRelockOrder(TimeRelockOrder timeRelockOrder) {
            timeRelockOrder.getClass();
            this.orderOneof_ = timeRelockOrder;
            this.orderOneofCase_ = 25;
        }

        /* access modifiers changed from: private */
        public void setTimeUnlockOrder(TimeUnlockOrder timeUnlockOrder) {
            timeUnlockOrder.getClass();
            this.orderOneof_ = timeUnlockOrder;
            this.orderOneofCase_ = 26;
        }

        /* access modifiers changed from: private */
        public void setTradeOrder(TradeOrder tradeOrder) {
            tradeOrder.getClass();
            this.orderOneof_ = tradeOrder;
            this.orderOneofCase_ = 8;
        }

        /* access modifiers changed from: private */
        public void setTransferOutOrder(TransferOut transferOut) {
            transferOut.getClass();
            this.orderOneof_ = transferOut;
            this.orderOneofCase_ = 20;
        }

        /* access modifiers changed from: private */
        public void setUnfreezeOrder(TokenUnfreezeOrder tokenUnfreezeOrder) {
            tokenUnfreezeOrder.getClass();
            this.orderOneof_ = tokenUnfreezeOrder;
            this.orderOneofCase_ = 12;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97281.f46544xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningInput();
                case 2:
                    return new Builder((C97281) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0019\u0001\u0000\u0001\u001a\u0019\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\u0002\u0005Ȉ\u0006\n\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000\u0013<\u0000\u0014<\u0000\u0015<\u0000\u0016<\u0000\u0017<\u0000\u0018<\u0000\u0019<\u0000\u001a<\u0000", new Object[]{"orderOneof_", "orderOneofCase_", "chainId_", "accountNumber_", "sequence_", "source_", "memo_", "privateKey_", TradeOrder.class, CancelTradeOrder.class, SendOrder.class, TokenFreezeOrder.class, TokenUnfreezeOrder.class, HTLTOrder.class, DepositHTLTOrder.class, ClaimHTLOrder.class, RefundHTLTOrder.class, TokenIssueOrder.class, TokenMintOrder.class, TokenBurnOrder.class, TransferOut.class, SideChainDelegate.class, SideChainRedelegate.class, SideChainUndelegate.class, TimeLockOrder.class, TimeRelockOrder.class, TimeUnlockOrder.class});
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

        public long getAccountNumber() {
            return this.accountNumber_;
        }

        public TokenBurnOrder getBurnOrder() {
            if (this.orderOneofCase_ == 19) {
                return (TokenBurnOrder) this.orderOneof_;
            }
            return TokenBurnOrder.getDefaultInstance();
        }

        public CancelTradeOrder getCancelTradeOrder() {
            if (this.orderOneofCase_ == 9) {
                return (CancelTradeOrder) this.orderOneof_;
            }
            return CancelTradeOrder.getDefaultInstance();
        }

        public String getChainId() {
            return this.chainId_;
        }

        public ByteString getChainIdBytes() {
            return ByteString.copyFromUtf8(this.chainId_);
        }

        public ClaimHTLOrder getClaimHTLTOrder() {
            if (this.orderOneofCase_ == 15) {
                return (ClaimHTLOrder) this.orderOneof_;
            }
            return ClaimHTLOrder.getDefaultInstance();
        }

        public DepositHTLTOrder getDepositHTLTOrder() {
            if (this.orderOneofCase_ == 14) {
                return (DepositHTLTOrder) this.orderOneof_;
            }
            return DepositHTLTOrder.getDefaultInstance();
        }

        public TokenFreezeOrder getFreezeOrder() {
            if (this.orderOneofCase_ == 11) {
                return (TokenFreezeOrder) this.orderOneof_;
            }
            return TokenFreezeOrder.getDefaultInstance();
        }

        public HTLTOrder getHtltOrder() {
            if (this.orderOneofCase_ == 13) {
                return (HTLTOrder) this.orderOneof_;
            }
            return HTLTOrder.getDefaultInstance();
        }

        public TokenIssueOrder getIssueOrder() {
            if (this.orderOneofCase_ == 17) {
                return (TokenIssueOrder) this.orderOneof_;
            }
            return TokenIssueOrder.getDefaultInstance();
        }

        public String getMemo() {
            return this.memo_;
        }

        public ByteString getMemoBytes() {
            return ByteString.copyFromUtf8(this.memo_);
        }

        public TokenMintOrder getMintOrder() {
            if (this.orderOneofCase_ == 18) {
                return (TokenMintOrder) this.orderOneof_;
            }
            return TokenMintOrder.getDefaultInstance();
        }

        public OrderOneofCase getOrderOneofCase() {
            return OrderOneofCase.forNumber(this.orderOneofCase_);
        }

        public ByteString getPrivateKey() {
            return this.privateKey_;
        }

        public RefundHTLTOrder getRefundHTLTOrder() {
            if (this.orderOneofCase_ == 16) {
                return (RefundHTLTOrder) this.orderOneof_;
            }
            return RefundHTLTOrder.getDefaultInstance();
        }

        public SendOrder getSendOrder() {
            if (this.orderOneofCase_ == 10) {
                return (SendOrder) this.orderOneof_;
            }
            return SendOrder.getDefaultInstance();
        }

        public long getSequence() {
            return this.sequence_;
        }

        public SideChainDelegate getSideDelegateOrder() {
            if (this.orderOneofCase_ == 21) {
                return (SideChainDelegate) this.orderOneof_;
            }
            return SideChainDelegate.getDefaultInstance();
        }

        public SideChainRedelegate getSideRedelegateOrder() {
            if (this.orderOneofCase_ == 22) {
                return (SideChainRedelegate) this.orderOneof_;
            }
            return SideChainRedelegate.getDefaultInstance();
        }

        public SideChainUndelegate getSideUndelegateOrder() {
            if (this.orderOneofCase_ == 23) {
                return (SideChainUndelegate) this.orderOneof_;
            }
            return SideChainUndelegate.getDefaultInstance();
        }

        public long getSource() {
            return this.source_;
        }

        public TimeLockOrder getTimeLockOrder() {
            if (this.orderOneofCase_ == 24) {
                return (TimeLockOrder) this.orderOneof_;
            }
            return TimeLockOrder.getDefaultInstance();
        }

        public TimeRelockOrder getTimeRelockOrder() {
            if (this.orderOneofCase_ == 25) {
                return (TimeRelockOrder) this.orderOneof_;
            }
            return TimeRelockOrder.getDefaultInstance();
        }

        public TimeUnlockOrder getTimeUnlockOrder() {
            if (this.orderOneofCase_ == 26) {
                return (TimeUnlockOrder) this.orderOneof_;
            }
            return TimeUnlockOrder.getDefaultInstance();
        }

        public TradeOrder getTradeOrder() {
            if (this.orderOneofCase_ == 8) {
                return (TradeOrder) this.orderOneof_;
            }
            return TradeOrder.getDefaultInstance();
        }

        public TransferOut getTransferOutOrder() {
            if (this.orderOneofCase_ == 20) {
                return (TransferOut) this.orderOneof_;
            }
            return TransferOut.getDefaultInstance();
        }

        public TokenUnfreezeOrder getUnfreezeOrder() {
            if (this.orderOneofCase_ == 12) {
                return (TokenUnfreezeOrder) this.orderOneof_;
            }
            return TokenUnfreezeOrder.getDefaultInstance();
        }

        public boolean hasBurnOrder() {
            if (this.orderOneofCase_ == 19) {
                return true;
            }
            return false;
        }

        public boolean hasCancelTradeOrder() {
            if (this.orderOneofCase_ == 9) {
                return true;
            }
            return false;
        }

        public boolean hasClaimHTLTOrder() {
            if (this.orderOneofCase_ == 15) {
                return true;
            }
            return false;
        }

        public boolean hasDepositHTLTOrder() {
            if (this.orderOneofCase_ == 14) {
                return true;
            }
            return false;
        }

        public boolean hasFreezeOrder() {
            if (this.orderOneofCase_ == 11) {
                return true;
            }
            return false;
        }

        public boolean hasHtltOrder() {
            if (this.orderOneofCase_ == 13) {
                return true;
            }
            return false;
        }

        public boolean hasIssueOrder() {
            if (this.orderOneofCase_ == 17) {
                return true;
            }
            return false;
        }

        public boolean hasMintOrder() {
            if (this.orderOneofCase_ == 18) {
                return true;
            }
            return false;
        }

        public boolean hasRefundHTLTOrder() {
            if (this.orderOneofCase_ == 16) {
                return true;
            }
            return false;
        }

        public boolean hasSendOrder() {
            if (this.orderOneofCase_ == 10) {
                return true;
            }
            return false;
        }

        public boolean hasSideDelegateOrder() {
            if (this.orderOneofCase_ == 21) {
                return true;
            }
            return false;
        }

        public boolean hasSideRedelegateOrder() {
            if (this.orderOneofCase_ == 22) {
                return true;
            }
            return false;
        }

        public boolean hasSideUndelegateOrder() {
            if (this.orderOneofCase_ == 23) {
                return true;
            }
            return false;
        }

        public boolean hasTimeLockOrder() {
            if (this.orderOneofCase_ == 24) {
                return true;
            }
            return false;
        }

        public boolean hasTimeRelockOrder() {
            if (this.orderOneofCase_ == 25) {
                return true;
            }
            return false;
        }

        public boolean hasTimeUnlockOrder() {
            if (this.orderOneofCase_ == 26) {
                return true;
            }
            return false;
        }

        public boolean hasTradeOrder() {
            if (this.orderOneofCase_ == 8) {
                return true;
            }
            return false;
        }

        public boolean hasTransferOutOrder() {
            if (this.orderOneofCase_ == 20) {
                return true;
            }
            return false;
        }

        public boolean hasUnfreezeOrder() {
            if (this.orderOneofCase_ == 12) {
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
        long getAccountNumber();

        TokenBurnOrder getBurnOrder();

        CancelTradeOrder getCancelTradeOrder();

        String getChainId();

        ByteString getChainIdBytes();

        ClaimHTLOrder getClaimHTLTOrder();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        DepositHTLTOrder getDepositHTLTOrder();

        TokenFreezeOrder getFreezeOrder();

        HTLTOrder getHtltOrder();

        TokenIssueOrder getIssueOrder();

        String getMemo();

        ByteString getMemoBytes();

        TokenMintOrder getMintOrder();

        SigningInput.OrderOneofCase getOrderOneofCase();

        ByteString getPrivateKey();

        RefundHTLTOrder getRefundHTLTOrder();

        SendOrder getSendOrder();

        long getSequence();

        SideChainDelegate getSideDelegateOrder();

        SideChainRedelegate getSideRedelegateOrder();

        SideChainUndelegate getSideUndelegateOrder();

        long getSource();

        TimeLockOrder getTimeLockOrder();

        TimeRelockOrder getTimeRelockOrder();

        TimeUnlockOrder getTimeUnlockOrder();

        TradeOrder getTradeOrder();

        TransferOut getTransferOutOrder();

        TokenUnfreezeOrder getUnfreezeOrder();

        boolean hasBurnOrder();

        boolean hasCancelTradeOrder();

        boolean hasClaimHTLTOrder();

        boolean hasDepositHTLTOrder();

        boolean hasFreezeOrder();

        boolean hasHtltOrder();

        boolean hasIssueOrder();

        boolean hasMintOrder();

        boolean hasRefundHTLTOrder();

        boolean hasSendOrder();

        boolean hasSideDelegateOrder();

        boolean hasSideRedelegateOrder();

        boolean hasSideUndelegateOrder();

        boolean hasTimeLockOrder();

        boolean hasTimeRelockOrder();

        boolean hasTimeUnlockOrder();

        boolean hasTradeOrder();

        boolean hasTransferOutOrder();

        boolean hasUnfreezeOrder();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SigningOutput extends GeneratedMessageLite<SigningOutput, Builder> implements SigningOutputOrBuilder {
        /* access modifiers changed from: private */
        public static final SigningOutput DEFAULT_INSTANCE;
        public static final int ENCODED_FIELD_NUMBER = 1;
        public static final int ERROR_FIELD_NUMBER = 2;
        public static final int ERROR_MESSAGE_FIELD_NUMBER = 3;
        private static volatile im4<SigningOutput> PARSER;
        private ByteString encoded_ = ByteString.EMPTY;
        private String errorMessage_ = "";
        private int error_;

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningOutput, Builder> implements SigningOutputOrBuilder {
            public /* synthetic */ Builder(C97281 r1) {
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

            public Builder clearErrorMessage() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearErrorMessage();
                return this;
            }

            public ByteString getEncoded() {
                return ((SigningOutput) this.instance).getEncoded();
            }

            public Common.SigningError getError() {
                return ((SigningOutput) this.instance).getError();
            }

            public String getErrorMessage() {
                return ((SigningOutput) this.instance).getErrorMessage();
            }

            public ByteString getErrorMessageBytes() {
                return ((SigningOutput) this.instance).getErrorMessageBytes();
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

            public Builder setErrorMessage(String str) {
                copyOnWrite();
                ((SigningOutput) this.instance).setErrorMessage(str);
                return this;
            }

            public Builder setErrorMessageBytes(ByteString byteString) {
                copyOnWrite();
                ((SigningOutput) this.instance).setErrorMessageBytes(byteString);
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

        /* access modifiers changed from: private */
        public void clearErrorMessage() {
            this.errorMessage_ = getDefaultInstance().getErrorMessage();
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
        public void setErrorMessage(String str) {
            str.getClass();
            this.errorMessage_ = str;
        }

        /* access modifiers changed from: private */
        public void setErrorMessageBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.errorMessage_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setErrorValue(int i) {
            this.error_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97281.f46544xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningOutput();
                case 2:
                    return new Builder((C97281) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\f\u0003Ȉ", new Object[]{"encoded_", "error_", "errorMessage_"});
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

        public String getErrorMessage() {
            return this.errorMessage_;
        }

        public ByteString getErrorMessageBytes() {
            return ByteString.copyFromUtf8(this.errorMessage_);
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

        String getErrorMessage();

        ByteString getErrorMessageBytes();

        int getErrorValue();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TimeLockOrder extends GeneratedMessageLite<TimeLockOrder, Builder> implements TimeLockOrderOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final TimeLockOrder DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 2;
        public static final int FROM_ADDRESS_FIELD_NUMBER = 1;
        public static final int LOCK_TIME_FIELD_NUMBER = 4;
        private static volatile im4<TimeLockOrder> PARSER;
        private C5011t.C5020i<SendOrder.Token> amount_ = GeneratedMessageLite.emptyProtobufList();
        private String description_ = "";
        private ByteString fromAddress_ = ByteString.EMPTY;
        private long lockTime_;

        public static final class Builder extends GeneratedMessageLite.C4930a<TimeLockOrder, Builder> implements TimeLockOrderOrBuilder {
            public /* synthetic */ Builder(C97281 r1) {
                this();
            }

            public Builder addAllAmount(Iterable<? extends SendOrder.Token> iterable) {
                copyOnWrite();
                ((TimeLockOrder) this.instance).addAllAmount(iterable);
                return this;
            }

            public Builder addAmount(SendOrder.Token token) {
                copyOnWrite();
                ((TimeLockOrder) this.instance).addAmount(token);
                return this;
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((TimeLockOrder) this.instance).clearAmount();
                return this;
            }

            public Builder clearDescription() {
                copyOnWrite();
                ((TimeLockOrder) this.instance).clearDescription();
                return this;
            }

            public Builder clearFromAddress() {
                copyOnWrite();
                ((TimeLockOrder) this.instance).clearFromAddress();
                return this;
            }

            public Builder clearLockTime() {
                copyOnWrite();
                ((TimeLockOrder) this.instance).clearLockTime();
                return this;
            }

            public SendOrder.Token getAmount(int i) {
                return ((TimeLockOrder) this.instance).getAmount(i);
            }

            public int getAmountCount() {
                return ((TimeLockOrder) this.instance).getAmountCount();
            }

            public List<SendOrder.Token> getAmountList() {
                return Collections.unmodifiableList(((TimeLockOrder) this.instance).getAmountList());
            }

            public String getDescription() {
                return ((TimeLockOrder) this.instance).getDescription();
            }

            public ByteString getDescriptionBytes() {
                return ((TimeLockOrder) this.instance).getDescriptionBytes();
            }

            public ByteString getFromAddress() {
                return ((TimeLockOrder) this.instance).getFromAddress();
            }

            public long getLockTime() {
                return ((TimeLockOrder) this.instance).getLockTime();
            }

            public Builder removeAmount(int i) {
                copyOnWrite();
                ((TimeLockOrder) this.instance).removeAmount(i);
                return this;
            }

            public Builder setAmount(int i, SendOrder.Token token) {
                copyOnWrite();
                ((TimeLockOrder) this.instance).setAmount(i, token);
                return this;
            }

            public Builder setDescription(String str) {
                copyOnWrite();
                ((TimeLockOrder) this.instance).setDescription(str);
                return this;
            }

            public Builder setDescriptionBytes(ByteString byteString) {
                copyOnWrite();
                ((TimeLockOrder) this.instance).setDescriptionBytes(byteString);
                return this;
            }

            public Builder setFromAddress(ByteString byteString) {
                copyOnWrite();
                ((TimeLockOrder) this.instance).setFromAddress(byteString);
                return this;
            }

            public Builder setLockTime(long j) {
                copyOnWrite();
                ((TimeLockOrder) this.instance).setLockTime(j);
                return this;
            }

            private Builder() {
                super(TimeLockOrder.DEFAULT_INSTANCE);
            }

            public Builder addAmount(int i, SendOrder.Token token) {
                copyOnWrite();
                ((TimeLockOrder) this.instance).addAmount(i, token);
                return this;
            }

            public Builder setAmount(int i, SendOrder.Token.Builder builder) {
                copyOnWrite();
                ((TimeLockOrder) this.instance).setAmount(i, (SendOrder.Token) builder.build());
                return this;
            }

            public Builder addAmount(SendOrder.Token.Builder builder) {
                copyOnWrite();
                ((TimeLockOrder) this.instance).addAmount((SendOrder.Token) builder.build());
                return this;
            }

            public Builder addAmount(int i, SendOrder.Token.Builder builder) {
                copyOnWrite();
                ((TimeLockOrder) this.instance).addAmount(i, (SendOrder.Token) builder.build());
                return this;
            }
        }

        static {
            TimeLockOrder timeLockOrder = new TimeLockOrder();
            DEFAULT_INSTANCE = timeLockOrder;
            GeneratedMessageLite.registerDefaultInstance(TimeLockOrder.class, timeLockOrder);
        }

        private TimeLockOrder() {
        }

        /* access modifiers changed from: private */
        public void addAllAmount(Iterable<? extends SendOrder.Token> iterable) {
            ensureAmountIsMutable();
            C4949a.addAll(iterable, this.amount_);
        }

        /* access modifiers changed from: private */
        public void addAmount(SendOrder.Token token) {
            token.getClass();
            ensureAmountIsMutable();
            this.amount_.add(token);
        }

        /* access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearDescription() {
            this.description_ = getDefaultInstance().getDescription();
        }

        /* access modifiers changed from: private */
        public void clearFromAddress() {
            this.fromAddress_ = getDefaultInstance().getFromAddress();
        }

        /* access modifiers changed from: private */
        public void clearLockTime() {
            this.lockTime_ = 0;
        }

        private void ensureAmountIsMutable() {
            C5011t.C5020i<SendOrder.Token> iVar = this.amount_;
            if (!iVar.mo37090v()) {
                this.amount_ = GeneratedMessageLite.mutableCopy(iVar);
            }
        }

        public static TimeLockOrder getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TimeLockOrder parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TimeLockOrder) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TimeLockOrder parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TimeLockOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<TimeLockOrder> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeAmount(int i) {
            ensureAmountIsMutable();
            this.amount_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setAmount(int i, SendOrder.Token token) {
            token.getClass();
            ensureAmountIsMutable();
            this.amount_.set(i, token);
        }

        /* access modifiers changed from: private */
        public void setDescription(String str) {
            str.getClass();
            this.description_ = str;
        }

        /* access modifiers changed from: private */
        public void setDescriptionBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.description_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setFromAddress(ByteString byteString) {
            byteString.getClass();
            this.fromAddress_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setLockTime(long j) {
            this.lockTime_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97281.f46544xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TimeLockOrder();
                case 2:
                    return new Builder((C97281) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\n\u0002Ȉ\u0003\u001b\u0004\u0002", new Object[]{"fromAddress_", "description_", "amount_", SendOrder.Token.class, "lockTime_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<TimeLockOrder> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (TimeLockOrder.class) {
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

        public SendOrder.Token getAmount(int i) {
            return this.amount_.get(i);
        }

        public int getAmountCount() {
            return this.amount_.size();
        }

        public List<SendOrder.Token> getAmountList() {
            return this.amount_;
        }

        public SendOrder.TokenOrBuilder getAmountOrBuilder(int i) {
            return this.amount_.get(i);
        }

        public List<? extends SendOrder.TokenOrBuilder> getAmountOrBuilderList() {
            return this.amount_;
        }

        public String getDescription() {
            return this.description_;
        }

        public ByteString getDescriptionBytes() {
            return ByteString.copyFromUtf8(this.description_);
        }

        public ByteString getFromAddress() {
            return this.fromAddress_;
        }

        public long getLockTime() {
            return this.lockTime_;
        }

        public static Builder newBuilder(TimeLockOrder timeLockOrder) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(timeLockOrder);
        }

        public static TimeLockOrder parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TimeLockOrder) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TimeLockOrder parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (TimeLockOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static TimeLockOrder parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TimeLockOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* access modifiers changed from: private */
        public void addAmount(int i, SendOrder.Token token) {
            token.getClass();
            ensureAmountIsMutable();
            this.amount_.add(i, token);
        }

        public static TimeLockOrder parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (TimeLockOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static TimeLockOrder parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TimeLockOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TimeLockOrder parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (TimeLockOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static TimeLockOrder parseFrom(InputStream inputStream) throws IOException {
            return (TimeLockOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TimeLockOrder parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TimeLockOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TimeLockOrder parseFrom(C4969g gVar) throws IOException {
            return (TimeLockOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static TimeLockOrder parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (TimeLockOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface TimeLockOrderOrBuilder extends qu3 {
        SendOrder.Token getAmount(int i);

        int getAmountCount();

        List<SendOrder.Token> getAmountList();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getDescription();

        ByteString getDescriptionBytes();

        ByteString getFromAddress();

        long getLockTime();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TimeRelockOrder extends GeneratedMessageLite<TimeRelockOrder, Builder> implements TimeRelockOrderOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 4;
        /* access modifiers changed from: private */
        public static final TimeRelockOrder DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 3;
        public static final int FROM_ADDRESS_FIELD_NUMBER = 1;
        public static final int ID_FIELD_NUMBER = 2;
        public static final int LOCK_TIME_FIELD_NUMBER = 5;
        private static volatile im4<TimeRelockOrder> PARSER;
        private C5011t.C5020i<SendOrder.Token> amount_ = GeneratedMessageLite.emptyProtobufList();
        private String description_ = "";
        private ByteString fromAddress_ = ByteString.EMPTY;
        private long id_;
        private long lockTime_;

        public static final class Builder extends GeneratedMessageLite.C4930a<TimeRelockOrder, Builder> implements TimeRelockOrderOrBuilder {
            public /* synthetic */ Builder(C97281 r1) {
                this();
            }

            public Builder addAllAmount(Iterable<? extends SendOrder.Token> iterable) {
                copyOnWrite();
                ((TimeRelockOrder) this.instance).addAllAmount(iterable);
                return this;
            }

            public Builder addAmount(SendOrder.Token token) {
                copyOnWrite();
                ((TimeRelockOrder) this.instance).addAmount(token);
                return this;
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((TimeRelockOrder) this.instance).clearAmount();
                return this;
            }

            public Builder clearDescription() {
                copyOnWrite();
                ((TimeRelockOrder) this.instance).clearDescription();
                return this;
            }

            public Builder clearFromAddress() {
                copyOnWrite();
                ((TimeRelockOrder) this.instance).clearFromAddress();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((TimeRelockOrder) this.instance).clearId();
                return this;
            }

            public Builder clearLockTime() {
                copyOnWrite();
                ((TimeRelockOrder) this.instance).clearLockTime();
                return this;
            }

            public SendOrder.Token getAmount(int i) {
                return ((TimeRelockOrder) this.instance).getAmount(i);
            }

            public int getAmountCount() {
                return ((TimeRelockOrder) this.instance).getAmountCount();
            }

            public List<SendOrder.Token> getAmountList() {
                return Collections.unmodifiableList(((TimeRelockOrder) this.instance).getAmountList());
            }

            public String getDescription() {
                return ((TimeRelockOrder) this.instance).getDescription();
            }

            public ByteString getDescriptionBytes() {
                return ((TimeRelockOrder) this.instance).getDescriptionBytes();
            }

            public ByteString getFromAddress() {
                return ((TimeRelockOrder) this.instance).getFromAddress();
            }

            public long getId() {
                return ((TimeRelockOrder) this.instance).getId();
            }

            public long getLockTime() {
                return ((TimeRelockOrder) this.instance).getLockTime();
            }

            public Builder removeAmount(int i) {
                copyOnWrite();
                ((TimeRelockOrder) this.instance).removeAmount(i);
                return this;
            }

            public Builder setAmount(int i, SendOrder.Token token) {
                copyOnWrite();
                ((TimeRelockOrder) this.instance).setAmount(i, token);
                return this;
            }

            public Builder setDescription(String str) {
                copyOnWrite();
                ((TimeRelockOrder) this.instance).setDescription(str);
                return this;
            }

            public Builder setDescriptionBytes(ByteString byteString) {
                copyOnWrite();
                ((TimeRelockOrder) this.instance).setDescriptionBytes(byteString);
                return this;
            }

            public Builder setFromAddress(ByteString byteString) {
                copyOnWrite();
                ((TimeRelockOrder) this.instance).setFromAddress(byteString);
                return this;
            }

            public Builder setId(long j) {
                copyOnWrite();
                ((TimeRelockOrder) this.instance).setId(j);
                return this;
            }

            public Builder setLockTime(long j) {
                copyOnWrite();
                ((TimeRelockOrder) this.instance).setLockTime(j);
                return this;
            }

            private Builder() {
                super(TimeRelockOrder.DEFAULT_INSTANCE);
            }

            public Builder addAmount(int i, SendOrder.Token token) {
                copyOnWrite();
                ((TimeRelockOrder) this.instance).addAmount(i, token);
                return this;
            }

            public Builder setAmount(int i, SendOrder.Token.Builder builder) {
                copyOnWrite();
                ((TimeRelockOrder) this.instance).setAmount(i, (SendOrder.Token) builder.build());
                return this;
            }

            public Builder addAmount(SendOrder.Token.Builder builder) {
                copyOnWrite();
                ((TimeRelockOrder) this.instance).addAmount((SendOrder.Token) builder.build());
                return this;
            }

            public Builder addAmount(int i, SendOrder.Token.Builder builder) {
                copyOnWrite();
                ((TimeRelockOrder) this.instance).addAmount(i, (SendOrder.Token) builder.build());
                return this;
            }
        }

        static {
            TimeRelockOrder timeRelockOrder = new TimeRelockOrder();
            DEFAULT_INSTANCE = timeRelockOrder;
            GeneratedMessageLite.registerDefaultInstance(TimeRelockOrder.class, timeRelockOrder);
        }

        private TimeRelockOrder() {
        }

        /* access modifiers changed from: private */
        public void addAllAmount(Iterable<? extends SendOrder.Token> iterable) {
            ensureAmountIsMutable();
            C4949a.addAll(iterable, this.amount_);
        }

        /* access modifiers changed from: private */
        public void addAmount(SendOrder.Token token) {
            token.getClass();
            ensureAmountIsMutable();
            this.amount_.add(token);
        }

        /* access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearDescription() {
            this.description_ = getDefaultInstance().getDescription();
        }

        /* access modifiers changed from: private */
        public void clearFromAddress() {
            this.fromAddress_ = getDefaultInstance().getFromAddress();
        }

        /* access modifiers changed from: private */
        public void clearId() {
            this.id_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearLockTime() {
            this.lockTime_ = 0;
        }

        private void ensureAmountIsMutable() {
            C5011t.C5020i<SendOrder.Token> iVar = this.amount_;
            if (!iVar.mo37090v()) {
                this.amount_ = GeneratedMessageLite.mutableCopy(iVar);
            }
        }

        public static TimeRelockOrder getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TimeRelockOrder parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TimeRelockOrder) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TimeRelockOrder parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TimeRelockOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<TimeRelockOrder> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeAmount(int i) {
            ensureAmountIsMutable();
            this.amount_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setAmount(int i, SendOrder.Token token) {
            token.getClass();
            ensureAmountIsMutable();
            this.amount_.set(i, token);
        }

        /* access modifiers changed from: private */
        public void setDescription(String str) {
            str.getClass();
            this.description_ = str;
        }

        /* access modifiers changed from: private */
        public void setDescriptionBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.description_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setFromAddress(ByteString byteString) {
            byteString.getClass();
            this.fromAddress_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setId(long j) {
            this.id_ = j;
        }

        /* access modifiers changed from: private */
        public void setLockTime(long j) {
            this.lockTime_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97281.f46544xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TimeRelockOrder();
                case 2:
                    return new Builder((C97281) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\n\u0002\u0002\u0003Ȉ\u0004\u001b\u0005\u0002", new Object[]{"fromAddress_", "id_", "description_", "amount_", SendOrder.Token.class, "lockTime_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<TimeRelockOrder> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (TimeRelockOrder.class) {
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

        public SendOrder.Token getAmount(int i) {
            return this.amount_.get(i);
        }

        public int getAmountCount() {
            return this.amount_.size();
        }

        public List<SendOrder.Token> getAmountList() {
            return this.amount_;
        }

        public SendOrder.TokenOrBuilder getAmountOrBuilder(int i) {
            return this.amount_.get(i);
        }

        public List<? extends SendOrder.TokenOrBuilder> getAmountOrBuilderList() {
            return this.amount_;
        }

        public String getDescription() {
            return this.description_;
        }

        public ByteString getDescriptionBytes() {
            return ByteString.copyFromUtf8(this.description_);
        }

        public ByteString getFromAddress() {
            return this.fromAddress_;
        }

        public long getId() {
            return this.id_;
        }

        public long getLockTime() {
            return this.lockTime_;
        }

        public static Builder newBuilder(TimeRelockOrder timeRelockOrder) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(timeRelockOrder);
        }

        public static TimeRelockOrder parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TimeRelockOrder) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TimeRelockOrder parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (TimeRelockOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static TimeRelockOrder parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TimeRelockOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* access modifiers changed from: private */
        public void addAmount(int i, SendOrder.Token token) {
            token.getClass();
            ensureAmountIsMutable();
            this.amount_.add(i, token);
        }

        public static TimeRelockOrder parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (TimeRelockOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static TimeRelockOrder parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TimeRelockOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TimeRelockOrder parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (TimeRelockOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static TimeRelockOrder parseFrom(InputStream inputStream) throws IOException {
            return (TimeRelockOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TimeRelockOrder parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TimeRelockOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TimeRelockOrder parseFrom(C4969g gVar) throws IOException {
            return (TimeRelockOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static TimeRelockOrder parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (TimeRelockOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface TimeRelockOrderOrBuilder extends qu3 {
        SendOrder.Token getAmount(int i);

        int getAmountCount();

        List<SendOrder.Token> getAmountList();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getDescription();

        ByteString getDescriptionBytes();

        ByteString getFromAddress();

        long getId();

        long getLockTime();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TimeUnlockOrder extends GeneratedMessageLite<TimeUnlockOrder, Builder> implements TimeUnlockOrderOrBuilder {
        /* access modifiers changed from: private */
        public static final TimeUnlockOrder DEFAULT_INSTANCE;
        public static final int FROM_ADDRESS_FIELD_NUMBER = 1;
        public static final int ID_FIELD_NUMBER = 2;
        private static volatile im4<TimeUnlockOrder> PARSER;
        private ByteString fromAddress_ = ByteString.EMPTY;
        private long id_;

        public static final class Builder extends GeneratedMessageLite.C4930a<TimeUnlockOrder, Builder> implements TimeUnlockOrderOrBuilder {
            public /* synthetic */ Builder(C97281 r1) {
                this();
            }

            public Builder clearFromAddress() {
                copyOnWrite();
                ((TimeUnlockOrder) this.instance).clearFromAddress();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((TimeUnlockOrder) this.instance).clearId();
                return this;
            }

            public ByteString getFromAddress() {
                return ((TimeUnlockOrder) this.instance).getFromAddress();
            }

            public long getId() {
                return ((TimeUnlockOrder) this.instance).getId();
            }

            public Builder setFromAddress(ByteString byteString) {
                copyOnWrite();
                ((TimeUnlockOrder) this.instance).setFromAddress(byteString);
                return this;
            }

            public Builder setId(long j) {
                copyOnWrite();
                ((TimeUnlockOrder) this.instance).setId(j);
                return this;
            }

            private Builder() {
                super(TimeUnlockOrder.DEFAULT_INSTANCE);
            }
        }

        static {
            TimeUnlockOrder timeUnlockOrder = new TimeUnlockOrder();
            DEFAULT_INSTANCE = timeUnlockOrder;
            GeneratedMessageLite.registerDefaultInstance(TimeUnlockOrder.class, timeUnlockOrder);
        }

        private TimeUnlockOrder() {
        }

        /* access modifiers changed from: private */
        public void clearFromAddress() {
            this.fromAddress_ = getDefaultInstance().getFromAddress();
        }

        /* access modifiers changed from: private */
        public void clearId() {
            this.id_ = 0;
        }

        public static TimeUnlockOrder getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TimeUnlockOrder parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TimeUnlockOrder) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TimeUnlockOrder parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TimeUnlockOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<TimeUnlockOrder> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setFromAddress(ByteString byteString) {
            byteString.getClass();
            this.fromAddress_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setId(long j) {
            this.id_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97281.f46544xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TimeUnlockOrder();
                case 2:
                    return new Builder((C97281) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\u0002", new Object[]{"fromAddress_", "id_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<TimeUnlockOrder> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (TimeUnlockOrder.class) {
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

        public ByteString getFromAddress() {
            return this.fromAddress_;
        }

        public long getId() {
            return this.id_;
        }

        public static Builder newBuilder(TimeUnlockOrder timeUnlockOrder) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(timeUnlockOrder);
        }

        public static TimeUnlockOrder parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TimeUnlockOrder) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TimeUnlockOrder parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (TimeUnlockOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static TimeUnlockOrder parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TimeUnlockOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TimeUnlockOrder parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (TimeUnlockOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static TimeUnlockOrder parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TimeUnlockOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TimeUnlockOrder parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (TimeUnlockOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static TimeUnlockOrder parseFrom(InputStream inputStream) throws IOException {
            return (TimeUnlockOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TimeUnlockOrder parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TimeUnlockOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TimeUnlockOrder parseFrom(C4969g gVar) throws IOException {
            return (TimeUnlockOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static TimeUnlockOrder parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (TimeUnlockOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface TimeUnlockOrderOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        ByteString getFromAddress();

        long getId();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TokenBurnOrder extends GeneratedMessageLite<TokenBurnOrder, Builder> implements TokenBurnOrderOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final TokenBurnOrder DEFAULT_INSTANCE;
        public static final int FROM_FIELD_NUMBER = 1;
        private static volatile im4<TokenBurnOrder> PARSER = null;
        public static final int SYMBOL_FIELD_NUMBER = 2;
        private long amount_;
        private ByteString from_ = ByteString.EMPTY;
        private String symbol_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<TokenBurnOrder, Builder> implements TokenBurnOrderOrBuilder {
            public /* synthetic */ Builder(C97281 r1) {
                this();
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((TokenBurnOrder) this.instance).clearAmount();
                return this;
            }

            public Builder clearFrom() {
                copyOnWrite();
                ((TokenBurnOrder) this.instance).clearFrom();
                return this;
            }

            public Builder clearSymbol() {
                copyOnWrite();
                ((TokenBurnOrder) this.instance).clearSymbol();
                return this;
            }

            public long getAmount() {
                return ((TokenBurnOrder) this.instance).getAmount();
            }

            public ByteString getFrom() {
                return ((TokenBurnOrder) this.instance).getFrom();
            }

            public String getSymbol() {
                return ((TokenBurnOrder) this.instance).getSymbol();
            }

            public ByteString getSymbolBytes() {
                return ((TokenBurnOrder) this.instance).getSymbolBytes();
            }

            public Builder setAmount(long j) {
                copyOnWrite();
                ((TokenBurnOrder) this.instance).setAmount(j);
                return this;
            }

            public Builder setFrom(ByteString byteString) {
                copyOnWrite();
                ((TokenBurnOrder) this.instance).setFrom(byteString);
                return this;
            }

            public Builder setSymbol(String str) {
                copyOnWrite();
                ((TokenBurnOrder) this.instance).setSymbol(str);
                return this;
            }

            public Builder setSymbolBytes(ByteString byteString) {
                copyOnWrite();
                ((TokenBurnOrder) this.instance).setSymbolBytes(byteString);
                return this;
            }

            private Builder() {
                super(TokenBurnOrder.DEFAULT_INSTANCE);
            }
        }

        static {
            TokenBurnOrder tokenBurnOrder = new TokenBurnOrder();
            DEFAULT_INSTANCE = tokenBurnOrder;
            GeneratedMessageLite.registerDefaultInstance(TokenBurnOrder.class, tokenBurnOrder);
        }

        private TokenBurnOrder() {
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
        public void clearSymbol() {
            this.symbol_ = getDefaultInstance().getSymbol();
        }

        public static TokenBurnOrder getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TokenBurnOrder parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TokenBurnOrder) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TokenBurnOrder parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TokenBurnOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<TokenBurnOrder> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAmount(long j) {
            this.amount_ = j;
        }

        /* access modifiers changed from: private */
        public void setFrom(ByteString byteString) {
            byteString.getClass();
            this.from_ = byteString;
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
            switch (C97281.f46544xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TokenBurnOrder();
                case 2:
                    return new Builder((C97281) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0003\u0002", new Object[]{"from_", "symbol_", "amount_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<TokenBurnOrder> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (TokenBurnOrder.class) {
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

        public ByteString getFrom() {
            return this.from_;
        }

        public String getSymbol() {
            return this.symbol_;
        }

        public ByteString getSymbolBytes() {
            return ByteString.copyFromUtf8(this.symbol_);
        }

        public static Builder newBuilder(TokenBurnOrder tokenBurnOrder) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(tokenBurnOrder);
        }

        public static TokenBurnOrder parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TokenBurnOrder) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TokenBurnOrder parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (TokenBurnOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static TokenBurnOrder parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TokenBurnOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TokenBurnOrder parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (TokenBurnOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static TokenBurnOrder parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TokenBurnOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TokenBurnOrder parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (TokenBurnOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static TokenBurnOrder parseFrom(InputStream inputStream) throws IOException {
            return (TokenBurnOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TokenBurnOrder parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TokenBurnOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TokenBurnOrder parseFrom(C4969g gVar) throws IOException {
            return (TokenBurnOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static TokenBurnOrder parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (TokenBurnOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface TokenBurnOrderOrBuilder extends qu3 {
        long getAmount();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        ByteString getFrom();

        String getSymbol();

        ByteString getSymbolBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TokenFreezeOrder extends GeneratedMessageLite<TokenFreezeOrder, Builder> implements TokenFreezeOrderOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final TokenFreezeOrder DEFAULT_INSTANCE;
        public static final int FROM_FIELD_NUMBER = 1;
        private static volatile im4<TokenFreezeOrder> PARSER = null;
        public static final int SYMBOL_FIELD_NUMBER = 2;
        private long amount_;
        private ByteString from_ = ByteString.EMPTY;
        private String symbol_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<TokenFreezeOrder, Builder> implements TokenFreezeOrderOrBuilder {
            public /* synthetic */ Builder(C97281 r1) {
                this();
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((TokenFreezeOrder) this.instance).clearAmount();
                return this;
            }

            public Builder clearFrom() {
                copyOnWrite();
                ((TokenFreezeOrder) this.instance).clearFrom();
                return this;
            }

            public Builder clearSymbol() {
                copyOnWrite();
                ((TokenFreezeOrder) this.instance).clearSymbol();
                return this;
            }

            public long getAmount() {
                return ((TokenFreezeOrder) this.instance).getAmount();
            }

            public ByteString getFrom() {
                return ((TokenFreezeOrder) this.instance).getFrom();
            }

            public String getSymbol() {
                return ((TokenFreezeOrder) this.instance).getSymbol();
            }

            public ByteString getSymbolBytes() {
                return ((TokenFreezeOrder) this.instance).getSymbolBytes();
            }

            public Builder setAmount(long j) {
                copyOnWrite();
                ((TokenFreezeOrder) this.instance).setAmount(j);
                return this;
            }

            public Builder setFrom(ByteString byteString) {
                copyOnWrite();
                ((TokenFreezeOrder) this.instance).setFrom(byteString);
                return this;
            }

            public Builder setSymbol(String str) {
                copyOnWrite();
                ((TokenFreezeOrder) this.instance).setSymbol(str);
                return this;
            }

            public Builder setSymbolBytes(ByteString byteString) {
                copyOnWrite();
                ((TokenFreezeOrder) this.instance).setSymbolBytes(byteString);
                return this;
            }

            private Builder() {
                super(TokenFreezeOrder.DEFAULT_INSTANCE);
            }
        }

        static {
            TokenFreezeOrder tokenFreezeOrder = new TokenFreezeOrder();
            DEFAULT_INSTANCE = tokenFreezeOrder;
            GeneratedMessageLite.registerDefaultInstance(TokenFreezeOrder.class, tokenFreezeOrder);
        }

        private TokenFreezeOrder() {
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
        public void clearSymbol() {
            this.symbol_ = getDefaultInstance().getSymbol();
        }

        public static TokenFreezeOrder getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TokenFreezeOrder parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TokenFreezeOrder) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TokenFreezeOrder parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TokenFreezeOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<TokenFreezeOrder> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAmount(long j) {
            this.amount_ = j;
        }

        /* access modifiers changed from: private */
        public void setFrom(ByteString byteString) {
            byteString.getClass();
            this.from_ = byteString;
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
            switch (C97281.f46544xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TokenFreezeOrder();
                case 2:
                    return new Builder((C97281) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0003\u0002", new Object[]{"from_", "symbol_", "amount_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<TokenFreezeOrder> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (TokenFreezeOrder.class) {
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

        public ByteString getFrom() {
            return this.from_;
        }

        public String getSymbol() {
            return this.symbol_;
        }

        public ByteString getSymbolBytes() {
            return ByteString.copyFromUtf8(this.symbol_);
        }

        public static Builder newBuilder(TokenFreezeOrder tokenFreezeOrder) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(tokenFreezeOrder);
        }

        public static TokenFreezeOrder parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TokenFreezeOrder) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TokenFreezeOrder parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (TokenFreezeOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static TokenFreezeOrder parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TokenFreezeOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TokenFreezeOrder parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (TokenFreezeOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static TokenFreezeOrder parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TokenFreezeOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TokenFreezeOrder parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (TokenFreezeOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static TokenFreezeOrder parseFrom(InputStream inputStream) throws IOException {
            return (TokenFreezeOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TokenFreezeOrder parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TokenFreezeOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TokenFreezeOrder parseFrom(C4969g gVar) throws IOException {
            return (TokenFreezeOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static TokenFreezeOrder parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (TokenFreezeOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface TokenFreezeOrderOrBuilder extends qu3 {
        long getAmount();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        ByteString getFrom();

        String getSymbol();

        ByteString getSymbolBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TokenIssueOrder extends GeneratedMessageLite<TokenIssueOrder, Builder> implements TokenIssueOrderOrBuilder {
        /* access modifiers changed from: private */
        public static final TokenIssueOrder DEFAULT_INSTANCE;
        public static final int FROM_FIELD_NUMBER = 1;
        public static final int MINTABLE_FIELD_NUMBER = 5;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile im4<TokenIssueOrder> PARSER = null;
        public static final int SYMBOL_FIELD_NUMBER = 3;
        public static final int TOTAL_SUPPLY_FIELD_NUMBER = 4;
        private ByteString from_ = ByteString.EMPTY;
        private boolean mintable_;
        private String name_ = "";
        private String symbol_ = "";
        private long totalSupply_;

        public static final class Builder extends GeneratedMessageLite.C4930a<TokenIssueOrder, Builder> implements TokenIssueOrderOrBuilder {
            public /* synthetic */ Builder(C97281 r1) {
                this();
            }

            public Builder clearFrom() {
                copyOnWrite();
                ((TokenIssueOrder) this.instance).clearFrom();
                return this;
            }

            public Builder clearMintable() {
                copyOnWrite();
                ((TokenIssueOrder) this.instance).clearMintable();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((TokenIssueOrder) this.instance).clearName();
                return this;
            }

            public Builder clearSymbol() {
                copyOnWrite();
                ((TokenIssueOrder) this.instance).clearSymbol();
                return this;
            }

            public Builder clearTotalSupply() {
                copyOnWrite();
                ((TokenIssueOrder) this.instance).clearTotalSupply();
                return this;
            }

            public ByteString getFrom() {
                return ((TokenIssueOrder) this.instance).getFrom();
            }

            public boolean getMintable() {
                return ((TokenIssueOrder) this.instance).getMintable();
            }

            public String getName() {
                return ((TokenIssueOrder) this.instance).getName();
            }

            public ByteString getNameBytes() {
                return ((TokenIssueOrder) this.instance).getNameBytes();
            }

            public String getSymbol() {
                return ((TokenIssueOrder) this.instance).getSymbol();
            }

            public ByteString getSymbolBytes() {
                return ((TokenIssueOrder) this.instance).getSymbolBytes();
            }

            public long getTotalSupply() {
                return ((TokenIssueOrder) this.instance).getTotalSupply();
            }

            public Builder setFrom(ByteString byteString) {
                copyOnWrite();
                ((TokenIssueOrder) this.instance).setFrom(byteString);
                return this;
            }

            public Builder setMintable(boolean z) {
                copyOnWrite();
                ((TokenIssueOrder) this.instance).setMintable(z);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((TokenIssueOrder) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((TokenIssueOrder) this.instance).setNameBytes(byteString);
                return this;
            }

            public Builder setSymbol(String str) {
                copyOnWrite();
                ((TokenIssueOrder) this.instance).setSymbol(str);
                return this;
            }

            public Builder setSymbolBytes(ByteString byteString) {
                copyOnWrite();
                ((TokenIssueOrder) this.instance).setSymbolBytes(byteString);
                return this;
            }

            public Builder setTotalSupply(long j) {
                copyOnWrite();
                ((TokenIssueOrder) this.instance).setTotalSupply(j);
                return this;
            }

            private Builder() {
                super(TokenIssueOrder.DEFAULT_INSTANCE);
            }
        }

        static {
            TokenIssueOrder tokenIssueOrder = new TokenIssueOrder();
            DEFAULT_INSTANCE = tokenIssueOrder;
            GeneratedMessageLite.registerDefaultInstance(TokenIssueOrder.class, tokenIssueOrder);
        }

        private TokenIssueOrder() {
        }

        /* access modifiers changed from: private */
        public void clearFrom() {
            this.from_ = getDefaultInstance().getFrom();
        }

        /* access modifiers changed from: private */
        public void clearMintable() {
            this.mintable_ = false;
        }

        /* access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* access modifiers changed from: private */
        public void clearSymbol() {
            this.symbol_ = getDefaultInstance().getSymbol();
        }

        /* access modifiers changed from: private */
        public void clearTotalSupply() {
            this.totalSupply_ = 0;
        }

        public static TokenIssueOrder getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TokenIssueOrder parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TokenIssueOrder) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TokenIssueOrder parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TokenIssueOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<TokenIssueOrder> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setFrom(ByteString byteString) {
            byteString.getClass();
            this.from_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setMintable(boolean z) {
            this.mintable_ = z;
        }

        /* access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.name_ = byteString.toStringUtf8();
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
        public void setTotalSupply(long j) {
            this.totalSupply_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97281.f46544xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TokenIssueOrder();
                case 2:
                    return new Builder((C97281) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0003Ȉ\u0004\u0002\u0005\u0007", new Object[]{"from_", "name_", "symbol_", "totalSupply_", "mintable_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<TokenIssueOrder> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (TokenIssueOrder.class) {
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

        public ByteString getFrom() {
            return this.from_;
        }

        public boolean getMintable() {
            return this.mintable_;
        }

        public String getName() {
            return this.name_;
        }

        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        public String getSymbol() {
            return this.symbol_;
        }

        public ByteString getSymbolBytes() {
            return ByteString.copyFromUtf8(this.symbol_);
        }

        public long getTotalSupply() {
            return this.totalSupply_;
        }

        public static Builder newBuilder(TokenIssueOrder tokenIssueOrder) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(tokenIssueOrder);
        }

        public static TokenIssueOrder parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TokenIssueOrder) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TokenIssueOrder parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (TokenIssueOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static TokenIssueOrder parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TokenIssueOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TokenIssueOrder parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (TokenIssueOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static TokenIssueOrder parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TokenIssueOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TokenIssueOrder parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (TokenIssueOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static TokenIssueOrder parseFrom(InputStream inputStream) throws IOException {
            return (TokenIssueOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TokenIssueOrder parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TokenIssueOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TokenIssueOrder parseFrom(C4969g gVar) throws IOException {
            return (TokenIssueOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static TokenIssueOrder parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (TokenIssueOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface TokenIssueOrderOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        ByteString getFrom();

        boolean getMintable();

        String getName();

        ByteString getNameBytes();

        String getSymbol();

        ByteString getSymbolBytes();

        long getTotalSupply();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TokenMintOrder extends GeneratedMessageLite<TokenMintOrder, Builder> implements TokenMintOrderOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final TokenMintOrder DEFAULT_INSTANCE;
        public static final int FROM_FIELD_NUMBER = 1;
        private static volatile im4<TokenMintOrder> PARSER = null;
        public static final int SYMBOL_FIELD_NUMBER = 2;
        private long amount_;
        private ByteString from_ = ByteString.EMPTY;
        private String symbol_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<TokenMintOrder, Builder> implements TokenMintOrderOrBuilder {
            public /* synthetic */ Builder(C97281 r1) {
                this();
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((TokenMintOrder) this.instance).clearAmount();
                return this;
            }

            public Builder clearFrom() {
                copyOnWrite();
                ((TokenMintOrder) this.instance).clearFrom();
                return this;
            }

            public Builder clearSymbol() {
                copyOnWrite();
                ((TokenMintOrder) this.instance).clearSymbol();
                return this;
            }

            public long getAmount() {
                return ((TokenMintOrder) this.instance).getAmount();
            }

            public ByteString getFrom() {
                return ((TokenMintOrder) this.instance).getFrom();
            }

            public String getSymbol() {
                return ((TokenMintOrder) this.instance).getSymbol();
            }

            public ByteString getSymbolBytes() {
                return ((TokenMintOrder) this.instance).getSymbolBytes();
            }

            public Builder setAmount(long j) {
                copyOnWrite();
                ((TokenMintOrder) this.instance).setAmount(j);
                return this;
            }

            public Builder setFrom(ByteString byteString) {
                copyOnWrite();
                ((TokenMintOrder) this.instance).setFrom(byteString);
                return this;
            }

            public Builder setSymbol(String str) {
                copyOnWrite();
                ((TokenMintOrder) this.instance).setSymbol(str);
                return this;
            }

            public Builder setSymbolBytes(ByteString byteString) {
                copyOnWrite();
                ((TokenMintOrder) this.instance).setSymbolBytes(byteString);
                return this;
            }

            private Builder() {
                super(TokenMintOrder.DEFAULT_INSTANCE);
            }
        }

        static {
            TokenMintOrder tokenMintOrder = new TokenMintOrder();
            DEFAULT_INSTANCE = tokenMintOrder;
            GeneratedMessageLite.registerDefaultInstance(TokenMintOrder.class, tokenMintOrder);
        }

        private TokenMintOrder() {
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
        public void clearSymbol() {
            this.symbol_ = getDefaultInstance().getSymbol();
        }

        public static TokenMintOrder getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TokenMintOrder parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TokenMintOrder) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TokenMintOrder parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TokenMintOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<TokenMintOrder> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAmount(long j) {
            this.amount_ = j;
        }

        /* access modifiers changed from: private */
        public void setFrom(ByteString byteString) {
            byteString.getClass();
            this.from_ = byteString;
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
            switch (C97281.f46544xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TokenMintOrder();
                case 2:
                    return new Builder((C97281) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0003\u0002", new Object[]{"from_", "symbol_", "amount_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<TokenMintOrder> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (TokenMintOrder.class) {
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

        public ByteString getFrom() {
            return this.from_;
        }

        public String getSymbol() {
            return this.symbol_;
        }

        public ByteString getSymbolBytes() {
            return ByteString.copyFromUtf8(this.symbol_);
        }

        public static Builder newBuilder(TokenMintOrder tokenMintOrder) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(tokenMintOrder);
        }

        public static TokenMintOrder parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TokenMintOrder) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TokenMintOrder parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (TokenMintOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static TokenMintOrder parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TokenMintOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TokenMintOrder parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (TokenMintOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static TokenMintOrder parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TokenMintOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TokenMintOrder parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (TokenMintOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static TokenMintOrder parseFrom(InputStream inputStream) throws IOException {
            return (TokenMintOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TokenMintOrder parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TokenMintOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TokenMintOrder parseFrom(C4969g gVar) throws IOException {
            return (TokenMintOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static TokenMintOrder parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (TokenMintOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface TokenMintOrderOrBuilder extends qu3 {
        long getAmount();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        ByteString getFrom();

        String getSymbol();

        ByteString getSymbolBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TokenUnfreezeOrder extends GeneratedMessageLite<TokenUnfreezeOrder, Builder> implements TokenUnfreezeOrderOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final TokenUnfreezeOrder DEFAULT_INSTANCE;
        public static final int FROM_FIELD_NUMBER = 1;
        private static volatile im4<TokenUnfreezeOrder> PARSER = null;
        public static final int SYMBOL_FIELD_NUMBER = 2;
        private long amount_;
        private ByteString from_ = ByteString.EMPTY;
        private String symbol_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<TokenUnfreezeOrder, Builder> implements TokenUnfreezeOrderOrBuilder {
            public /* synthetic */ Builder(C97281 r1) {
                this();
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((TokenUnfreezeOrder) this.instance).clearAmount();
                return this;
            }

            public Builder clearFrom() {
                copyOnWrite();
                ((TokenUnfreezeOrder) this.instance).clearFrom();
                return this;
            }

            public Builder clearSymbol() {
                copyOnWrite();
                ((TokenUnfreezeOrder) this.instance).clearSymbol();
                return this;
            }

            public long getAmount() {
                return ((TokenUnfreezeOrder) this.instance).getAmount();
            }

            public ByteString getFrom() {
                return ((TokenUnfreezeOrder) this.instance).getFrom();
            }

            public String getSymbol() {
                return ((TokenUnfreezeOrder) this.instance).getSymbol();
            }

            public ByteString getSymbolBytes() {
                return ((TokenUnfreezeOrder) this.instance).getSymbolBytes();
            }

            public Builder setAmount(long j) {
                copyOnWrite();
                ((TokenUnfreezeOrder) this.instance).setAmount(j);
                return this;
            }

            public Builder setFrom(ByteString byteString) {
                copyOnWrite();
                ((TokenUnfreezeOrder) this.instance).setFrom(byteString);
                return this;
            }

            public Builder setSymbol(String str) {
                copyOnWrite();
                ((TokenUnfreezeOrder) this.instance).setSymbol(str);
                return this;
            }

            public Builder setSymbolBytes(ByteString byteString) {
                copyOnWrite();
                ((TokenUnfreezeOrder) this.instance).setSymbolBytes(byteString);
                return this;
            }

            private Builder() {
                super(TokenUnfreezeOrder.DEFAULT_INSTANCE);
            }
        }

        static {
            TokenUnfreezeOrder tokenUnfreezeOrder = new TokenUnfreezeOrder();
            DEFAULT_INSTANCE = tokenUnfreezeOrder;
            GeneratedMessageLite.registerDefaultInstance(TokenUnfreezeOrder.class, tokenUnfreezeOrder);
        }

        private TokenUnfreezeOrder() {
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
        public void clearSymbol() {
            this.symbol_ = getDefaultInstance().getSymbol();
        }

        public static TokenUnfreezeOrder getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TokenUnfreezeOrder parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TokenUnfreezeOrder) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TokenUnfreezeOrder parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TokenUnfreezeOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<TokenUnfreezeOrder> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAmount(long j) {
            this.amount_ = j;
        }

        /* access modifiers changed from: private */
        public void setFrom(ByteString byteString) {
            byteString.getClass();
            this.from_ = byteString;
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
            switch (C97281.f46544xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TokenUnfreezeOrder();
                case 2:
                    return new Builder((C97281) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0003\u0002", new Object[]{"from_", "symbol_", "amount_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<TokenUnfreezeOrder> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (TokenUnfreezeOrder.class) {
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

        public ByteString getFrom() {
            return this.from_;
        }

        public String getSymbol() {
            return this.symbol_;
        }

        public ByteString getSymbolBytes() {
            return ByteString.copyFromUtf8(this.symbol_);
        }

        public static Builder newBuilder(TokenUnfreezeOrder tokenUnfreezeOrder) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(tokenUnfreezeOrder);
        }

        public static TokenUnfreezeOrder parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TokenUnfreezeOrder) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TokenUnfreezeOrder parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (TokenUnfreezeOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static TokenUnfreezeOrder parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TokenUnfreezeOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TokenUnfreezeOrder parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (TokenUnfreezeOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static TokenUnfreezeOrder parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TokenUnfreezeOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TokenUnfreezeOrder parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (TokenUnfreezeOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static TokenUnfreezeOrder parseFrom(InputStream inputStream) throws IOException {
            return (TokenUnfreezeOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TokenUnfreezeOrder parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TokenUnfreezeOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TokenUnfreezeOrder parseFrom(C4969g gVar) throws IOException {
            return (TokenUnfreezeOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static TokenUnfreezeOrder parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (TokenUnfreezeOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface TokenUnfreezeOrderOrBuilder extends qu3 {
        long getAmount();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        ByteString getFrom();

        String getSymbol();

        ByteString getSymbolBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TradeOrder extends GeneratedMessageLite<TradeOrder, Builder> implements TradeOrderOrBuilder {
        /* access modifiers changed from: private */
        public static final TradeOrder DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 2;
        public static final int ORDERTYPE_FIELD_NUMBER = 4;
        private static volatile im4<TradeOrder> PARSER = null;
        public static final int PRICE_FIELD_NUMBER = 6;
        public static final int QUANTITY_FIELD_NUMBER = 7;
        public static final int SENDER_FIELD_NUMBER = 1;
        public static final int SIDE_FIELD_NUMBER = 5;
        public static final int SYMBOL_FIELD_NUMBER = 3;
        public static final int TIMEINFORCE_FIELD_NUMBER = 8;
        private String id_ = "";
        private long ordertype_;
        private long price_;
        private long quantity_;
        private ByteString sender_ = ByteString.EMPTY;
        private long side_;
        private String symbol_ = "";
        private long timeinforce_;

        public static final class Builder extends GeneratedMessageLite.C4930a<TradeOrder, Builder> implements TradeOrderOrBuilder {
            public /* synthetic */ Builder(C97281 r1) {
                this();
            }

            public Builder clearId() {
                copyOnWrite();
                ((TradeOrder) this.instance).clearId();
                return this;
            }

            public Builder clearOrdertype() {
                copyOnWrite();
                ((TradeOrder) this.instance).clearOrdertype();
                return this;
            }

            public Builder clearPrice() {
                copyOnWrite();
                ((TradeOrder) this.instance).clearPrice();
                return this;
            }

            public Builder clearQuantity() {
                copyOnWrite();
                ((TradeOrder) this.instance).clearQuantity();
                return this;
            }

            public Builder clearSender() {
                copyOnWrite();
                ((TradeOrder) this.instance).clearSender();
                return this;
            }

            public Builder clearSide() {
                copyOnWrite();
                ((TradeOrder) this.instance).clearSide();
                return this;
            }

            public Builder clearSymbol() {
                copyOnWrite();
                ((TradeOrder) this.instance).clearSymbol();
                return this;
            }

            public Builder clearTimeinforce() {
                copyOnWrite();
                ((TradeOrder) this.instance).clearTimeinforce();
                return this;
            }

            public String getId() {
                return ((TradeOrder) this.instance).getId();
            }

            public ByteString getIdBytes() {
                return ((TradeOrder) this.instance).getIdBytes();
            }

            public long getOrdertype() {
                return ((TradeOrder) this.instance).getOrdertype();
            }

            public long getPrice() {
                return ((TradeOrder) this.instance).getPrice();
            }

            public long getQuantity() {
                return ((TradeOrder) this.instance).getQuantity();
            }

            public ByteString getSender() {
                return ((TradeOrder) this.instance).getSender();
            }

            public long getSide() {
                return ((TradeOrder) this.instance).getSide();
            }

            public String getSymbol() {
                return ((TradeOrder) this.instance).getSymbol();
            }

            public ByteString getSymbolBytes() {
                return ((TradeOrder) this.instance).getSymbolBytes();
            }

            public long getTimeinforce() {
                return ((TradeOrder) this.instance).getTimeinforce();
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((TradeOrder) this.instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((TradeOrder) this.instance).setIdBytes(byteString);
                return this;
            }

            public Builder setOrdertype(long j) {
                copyOnWrite();
                ((TradeOrder) this.instance).setOrdertype(j);
                return this;
            }

            public Builder setPrice(long j) {
                copyOnWrite();
                ((TradeOrder) this.instance).setPrice(j);
                return this;
            }

            public Builder setQuantity(long j) {
                copyOnWrite();
                ((TradeOrder) this.instance).setQuantity(j);
                return this;
            }

            public Builder setSender(ByteString byteString) {
                copyOnWrite();
                ((TradeOrder) this.instance).setSender(byteString);
                return this;
            }

            public Builder setSide(long j) {
                copyOnWrite();
                ((TradeOrder) this.instance).setSide(j);
                return this;
            }

            public Builder setSymbol(String str) {
                copyOnWrite();
                ((TradeOrder) this.instance).setSymbol(str);
                return this;
            }

            public Builder setSymbolBytes(ByteString byteString) {
                copyOnWrite();
                ((TradeOrder) this.instance).setSymbolBytes(byteString);
                return this;
            }

            public Builder setTimeinforce(long j) {
                copyOnWrite();
                ((TradeOrder) this.instance).setTimeinforce(j);
                return this;
            }

            private Builder() {
                super(TradeOrder.DEFAULT_INSTANCE);
            }
        }

        static {
            TradeOrder tradeOrder = new TradeOrder();
            DEFAULT_INSTANCE = tradeOrder;
            GeneratedMessageLite.registerDefaultInstance(TradeOrder.class, tradeOrder);
        }

        private TradeOrder() {
        }

        /* access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* access modifiers changed from: private */
        public void clearOrdertype() {
            this.ordertype_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearPrice() {
            this.price_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearQuantity() {
            this.quantity_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSender() {
            this.sender_ = getDefaultInstance().getSender();
        }

        /* access modifiers changed from: private */
        public void clearSide() {
            this.side_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSymbol() {
            this.symbol_ = getDefaultInstance().getSymbol();
        }

        /* access modifiers changed from: private */
        public void clearTimeinforce() {
            this.timeinforce_ = 0;
        }

        public static TradeOrder getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TradeOrder parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TradeOrder) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TradeOrder parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TradeOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<TradeOrder> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setId(String str) {
            str.getClass();
            this.id_ = str;
        }

        /* access modifiers changed from: private */
        public void setIdBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.id_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setOrdertype(long j) {
            this.ordertype_ = j;
        }

        /* access modifiers changed from: private */
        public void setPrice(long j) {
            this.price_ = j;
        }

        /* access modifiers changed from: private */
        public void setQuantity(long j) {
            this.quantity_ = j;
        }

        /* access modifiers changed from: private */
        public void setSender(ByteString byteString) {
            byteString.getClass();
            this.sender_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setSide(long j) {
            this.side_ = j;
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
        public void setTimeinforce(long j) {
            this.timeinforce_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97281.f46544xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TradeOrder();
                case 2:
                    return new Builder((C97281) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0003Ȉ\u0004\u0002\u0005\u0002\u0006\u0002\u0007\u0002\b\u0002", new Object[]{"sender_", "id_", "symbol_", "ordertype_", "side_", "price_", "quantity_", "timeinforce_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<TradeOrder> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (TradeOrder.class) {
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

        public String getId() {
            return this.id_;
        }

        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        public long getOrdertype() {
            return this.ordertype_;
        }

        public long getPrice() {
            return this.price_;
        }

        public long getQuantity() {
            return this.quantity_;
        }

        public ByteString getSender() {
            return this.sender_;
        }

        public long getSide() {
            return this.side_;
        }

        public String getSymbol() {
            return this.symbol_;
        }

        public ByteString getSymbolBytes() {
            return ByteString.copyFromUtf8(this.symbol_);
        }

        public long getTimeinforce() {
            return this.timeinforce_;
        }

        public static Builder newBuilder(TradeOrder tradeOrder) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(tradeOrder);
        }

        public static TradeOrder parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TradeOrder) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TradeOrder parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (TradeOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static TradeOrder parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TradeOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TradeOrder parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (TradeOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static TradeOrder parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TradeOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TradeOrder parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (TradeOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static TradeOrder parseFrom(InputStream inputStream) throws IOException {
            return (TradeOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TradeOrder parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TradeOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TradeOrder parseFrom(C4969g gVar) throws IOException {
            return (TradeOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static TradeOrder parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (TradeOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface TradeOrderOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getId();

        ByteString getIdBytes();

        long getOrdertype();

        long getPrice();

        long getQuantity();

        ByteString getSender();

        long getSide();

        String getSymbol();

        ByteString getSymbolBytes();

        long getTimeinforce();

        /* synthetic */ boolean isInitialized();
    }

    public static final class Transaction extends GeneratedMessageLite<Transaction, Builder> implements TransactionOrBuilder {
        public static final int DATA_FIELD_NUMBER = 5;
        /* access modifiers changed from: private */
        public static final Transaction DEFAULT_INSTANCE;
        public static final int MEMO_FIELD_NUMBER = 3;
        public static final int MSGS_FIELD_NUMBER = 1;
        private static volatile im4<Transaction> PARSER = null;
        public static final int SIGNATURES_FIELD_NUMBER = 2;
        public static final int SOURCE_FIELD_NUMBER = 4;
        private ByteString data_ = ByteString.EMPTY;
        private String memo_ = "";
        private C5011t.C5020i<ByteString> msgs_ = GeneratedMessageLite.emptyProtobufList();
        private C5011t.C5020i<ByteString> signatures_ = GeneratedMessageLite.emptyProtobufList();
        private long source_;

        public static final class Builder extends GeneratedMessageLite.C4930a<Transaction, Builder> implements TransactionOrBuilder {
            public /* synthetic */ Builder(C97281 r1) {
                this();
            }

            public Builder addAllMsgs(Iterable<? extends ByteString> iterable) {
                copyOnWrite();
                ((Transaction) this.instance).addAllMsgs(iterable);
                return this;
            }

            public Builder addAllSignatures(Iterable<? extends ByteString> iterable) {
                copyOnWrite();
                ((Transaction) this.instance).addAllSignatures(iterable);
                return this;
            }

            public Builder addMsgs(ByteString byteString) {
                copyOnWrite();
                ((Transaction) this.instance).addMsgs(byteString);
                return this;
            }

            public Builder addSignatures(ByteString byteString) {
                copyOnWrite();
                ((Transaction) this.instance).addSignatures(byteString);
                return this;
            }

            public Builder clearData() {
                copyOnWrite();
                ((Transaction) this.instance).clearData();
                return this;
            }

            public Builder clearMemo() {
                copyOnWrite();
                ((Transaction) this.instance).clearMemo();
                return this;
            }

            public Builder clearMsgs() {
                copyOnWrite();
                ((Transaction) this.instance).clearMsgs();
                return this;
            }

            public Builder clearSignatures() {
                copyOnWrite();
                ((Transaction) this.instance).clearSignatures();
                return this;
            }

            public Builder clearSource() {
                copyOnWrite();
                ((Transaction) this.instance).clearSource();
                return this;
            }

            public ByteString getData() {
                return ((Transaction) this.instance).getData();
            }

            public String getMemo() {
                return ((Transaction) this.instance).getMemo();
            }

            public ByteString getMemoBytes() {
                return ((Transaction) this.instance).getMemoBytes();
            }

            public ByteString getMsgs(int i) {
                return ((Transaction) this.instance).getMsgs(i);
            }

            public int getMsgsCount() {
                return ((Transaction) this.instance).getMsgsCount();
            }

            public List<ByteString> getMsgsList() {
                return Collections.unmodifiableList(((Transaction) this.instance).getMsgsList());
            }

            public ByteString getSignatures(int i) {
                return ((Transaction) this.instance).getSignatures(i);
            }

            public int getSignaturesCount() {
                return ((Transaction) this.instance).getSignaturesCount();
            }

            public List<ByteString> getSignaturesList() {
                return Collections.unmodifiableList(((Transaction) this.instance).getSignaturesList());
            }

            public long getSource() {
                return ((Transaction) this.instance).getSource();
            }

            public Builder setData(ByteString byteString) {
                copyOnWrite();
                ((Transaction) this.instance).setData(byteString);
                return this;
            }

            public Builder setMemo(String str) {
                copyOnWrite();
                ((Transaction) this.instance).setMemo(str);
                return this;
            }

            public Builder setMemoBytes(ByteString byteString) {
                copyOnWrite();
                ((Transaction) this.instance).setMemoBytes(byteString);
                return this;
            }

            public Builder setMsgs(int i, ByteString byteString) {
                copyOnWrite();
                ((Transaction) this.instance).setMsgs(i, byteString);
                return this;
            }

            public Builder setSignatures(int i, ByteString byteString) {
                copyOnWrite();
                ((Transaction) this.instance).setSignatures(i, byteString);
                return this;
            }

            public Builder setSource(long j) {
                copyOnWrite();
                ((Transaction) this.instance).setSource(j);
                return this;
            }

            private Builder() {
                super(Transaction.DEFAULT_INSTANCE);
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
        public void addAllMsgs(Iterable<? extends ByteString> iterable) {
            ensureMsgsIsMutable();
            C4949a.addAll(iterable, this.msgs_);
        }

        /* access modifiers changed from: private */
        public void addAllSignatures(Iterable<? extends ByteString> iterable) {
            ensureSignaturesIsMutable();
            C4949a.addAll(iterable, this.signatures_);
        }

        /* access modifiers changed from: private */
        public void addMsgs(ByteString byteString) {
            byteString.getClass();
            ensureMsgsIsMutable();
            this.msgs_.add(byteString);
        }

        /* access modifiers changed from: private */
        public void addSignatures(ByteString byteString) {
            byteString.getClass();
            ensureSignaturesIsMutable();
            this.signatures_.add(byteString);
        }

        /* access modifiers changed from: private */
        public void clearData() {
            this.data_ = getDefaultInstance().getData();
        }

        /* access modifiers changed from: private */
        public void clearMemo() {
            this.memo_ = getDefaultInstance().getMemo();
        }

        /* access modifiers changed from: private */
        public void clearMsgs() {
            this.msgs_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearSignatures() {
            this.signatures_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearSource() {
            this.source_ = 0;
        }

        private void ensureMsgsIsMutable() {
            C5011t.C5020i<ByteString> iVar = this.msgs_;
            if (!iVar.mo37090v()) {
                this.msgs_ = GeneratedMessageLite.mutableCopy(iVar);
            }
        }

        private void ensureSignaturesIsMutable() {
            C5011t.C5020i<ByteString> iVar = this.signatures_;
            if (!iVar.mo37090v()) {
                this.signatures_ = GeneratedMessageLite.mutableCopy(iVar);
            }
        }

        public static Transaction getDefaultInstance() {
            return DEFAULT_INSTANCE;
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
        public void setData(ByteString byteString) {
            byteString.getClass();
            this.data_ = byteString;
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
        public void setMsgs(int i, ByteString byteString) {
            byteString.getClass();
            ensureMsgsIsMutable();
            this.msgs_.set(i, byteString);
        }

        /* access modifiers changed from: private */
        public void setSignatures(int i, ByteString byteString) {
            byteString.getClass();
            ensureSignaturesIsMutable();
            this.signatures_.set(i, byteString);
        }

        /* access modifiers changed from: private */
        public void setSource(long j) {
            this.source_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97281.f46544xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Transaction();
                case 2:
                    return new Builder((C97281) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u001c\u0002\u001c\u0003Ȉ\u0004\u0002\u0005\n", new Object[]{"msgs_", "signatures_", "memo_", "source_", "data_"});
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

        public ByteString getData() {
            return this.data_;
        }

        public String getMemo() {
            return this.memo_;
        }

        public ByteString getMemoBytes() {
            return ByteString.copyFromUtf8(this.memo_);
        }

        public ByteString getMsgs(int i) {
            return this.msgs_.get(i);
        }

        public int getMsgsCount() {
            return this.msgs_.size();
        }

        public List<ByteString> getMsgsList() {
            return this.msgs_;
        }

        public ByteString getSignatures(int i) {
            return this.signatures_.get(i);
        }

        public int getSignaturesCount() {
            return this.signatures_.size();
        }

        public List<ByteString> getSignaturesList() {
            return this.signatures_;
        }

        public long getSource() {
            return this.source_;
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

    public interface TransactionOrBuilder extends qu3 {
        ByteString getData();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getMemo();

        ByteString getMemoBytes();

        ByteString getMsgs(int i);

        int getMsgsCount();

        List<ByteString> getMsgsList();

        ByteString getSignatures(int i);

        int getSignaturesCount();

        List<ByteString> getSignaturesList();

        long getSource();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TransferOut extends GeneratedMessageLite<TransferOut, Builder> implements TransferOutOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final TransferOut DEFAULT_INSTANCE;
        public static final int EXPIRE_TIME_FIELD_NUMBER = 4;
        public static final int FROM_FIELD_NUMBER = 1;
        private static volatile im4<TransferOut> PARSER = null;
        public static final int TO_FIELD_NUMBER = 2;
        private SendOrder.Token amount_;
        private long expireTime_;
        private ByteString from_;
        private ByteString to_;

        public static final class Builder extends GeneratedMessageLite.C4930a<TransferOut, Builder> implements TransferOutOrBuilder {
            public /* synthetic */ Builder(C97281 r1) {
                this();
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((TransferOut) this.instance).clearAmount();
                return this;
            }

            public Builder clearExpireTime() {
                copyOnWrite();
                ((TransferOut) this.instance).clearExpireTime();
                return this;
            }

            public Builder clearFrom() {
                copyOnWrite();
                ((TransferOut) this.instance).clearFrom();
                return this;
            }

            public Builder clearTo() {
                copyOnWrite();
                ((TransferOut) this.instance).clearTo();
                return this;
            }

            public SendOrder.Token getAmount() {
                return ((TransferOut) this.instance).getAmount();
            }

            public long getExpireTime() {
                return ((TransferOut) this.instance).getExpireTime();
            }

            public ByteString getFrom() {
                return ((TransferOut) this.instance).getFrom();
            }

            public ByteString getTo() {
                return ((TransferOut) this.instance).getTo();
            }

            public boolean hasAmount() {
                return ((TransferOut) this.instance).hasAmount();
            }

            public Builder mergeAmount(SendOrder.Token token) {
                copyOnWrite();
                ((TransferOut) this.instance).mergeAmount(token);
                return this;
            }

            public Builder setAmount(SendOrder.Token token) {
                copyOnWrite();
                ((TransferOut) this.instance).setAmount(token);
                return this;
            }

            public Builder setExpireTime(long j) {
                copyOnWrite();
                ((TransferOut) this.instance).setExpireTime(j);
                return this;
            }

            public Builder setFrom(ByteString byteString) {
                copyOnWrite();
                ((TransferOut) this.instance).setFrom(byteString);
                return this;
            }

            public Builder setTo(ByteString byteString) {
                copyOnWrite();
                ((TransferOut) this.instance).setTo(byteString);
                return this;
            }

            private Builder() {
                super(TransferOut.DEFAULT_INSTANCE);
            }

            public Builder setAmount(SendOrder.Token.Builder builder) {
                copyOnWrite();
                ((TransferOut) this.instance).setAmount((SendOrder.Token) builder.build());
                return this;
            }
        }

        static {
            TransferOut transferOut = new TransferOut();
            DEFAULT_INSTANCE = transferOut;
            GeneratedMessageLite.registerDefaultInstance(TransferOut.class, transferOut);
        }

        private TransferOut() {
            ByteString byteString = ByteString.EMPTY;
            this.from_ = byteString;
            this.to_ = byteString;
        }

        /* access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = null;
        }

        /* access modifiers changed from: private */
        public void clearExpireTime() {
            this.expireTime_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFrom() {
            this.from_ = getDefaultInstance().getFrom();
        }

        /* access modifiers changed from: private */
        public void clearTo() {
            this.to_ = getDefaultInstance().getTo();
        }

        public static TransferOut getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeAmount(SendOrder.Token token) {
            token.getClass();
            SendOrder.Token token2 = this.amount_;
            if (token2 == null || token2 == SendOrder.Token.getDefaultInstance()) {
                this.amount_ = token;
            } else {
                this.amount_ = (SendOrder.Token) ((SendOrder.Token.Builder) SendOrder.Token.newBuilder(this.amount_).mergeFrom(token)).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TransferOut parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TransferOut) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TransferOut parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TransferOut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<TransferOut> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAmount(SendOrder.Token token) {
            token.getClass();
            this.amount_ = token;
        }

        /* access modifiers changed from: private */
        public void setExpireTime(long j) {
            this.expireTime_ = j;
        }

        /* access modifiers changed from: private */
        public void setFrom(ByteString byteString) {
            byteString.getClass();
            this.from_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setTo(ByteString byteString) {
            byteString.getClass();
            this.to_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97281.f46544xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TransferOut();
                case 2:
                    return new Builder((C97281) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\n\u0002\n\u0003\t\u0004\u0002", new Object[]{"from_", "to_", "amount_", "expireTime_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<TransferOut> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (TransferOut.class) {
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

        public SendOrder.Token getAmount() {
            SendOrder.Token token = this.amount_;
            if (token == null) {
                return SendOrder.Token.getDefaultInstance();
            }
            return token;
        }

        public long getExpireTime() {
            return this.expireTime_;
        }

        public ByteString getFrom() {
            return this.from_;
        }

        public ByteString getTo() {
            return this.to_;
        }

        public boolean hasAmount() {
            if (this.amount_ != null) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(TransferOut transferOut) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(transferOut);
        }

        public static TransferOut parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TransferOut) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TransferOut parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransferOut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static TransferOut parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TransferOut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TransferOut parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransferOut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static TransferOut parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TransferOut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TransferOut parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransferOut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static TransferOut parseFrom(InputStream inputStream) throws IOException {
            return (TransferOut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TransferOut parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TransferOut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TransferOut parseFrom(C4969g gVar) throws IOException {
            return (TransferOut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static TransferOut parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (TransferOut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface TransferOutOrBuilder extends qu3 {
        SendOrder.Token getAmount();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        long getExpireTime();

        ByteString getFrom();

        ByteString getTo();

        boolean hasAmount();

        /* synthetic */ boolean isInitialized();
    }

    private Binance() {
    }

    public static void registerAllExtensions(C4987l lVar) {
    }
}
