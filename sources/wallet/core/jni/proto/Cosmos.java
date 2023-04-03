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

public final class Cosmos {

    /* renamed from: wallet.core.jni.proto.Cosmos$1 */
    public static /* synthetic */ class C97321 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f46548xa1df5c61;

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
                f46548xa1df5c61 = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f46548xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f46548xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f46548xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f46548xa1df5c61     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f46548xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f46548xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wallet.core.jni.proto.Cosmos.C97321.<clinit>():void");
        }
    }

    public static final class Amount extends GeneratedMessageLite<Amount, Builder> implements AmountOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final Amount DEFAULT_INSTANCE;
        public static final int DENOM_FIELD_NUMBER = 1;
        private static volatile im4<Amount> PARSER;
        private String amount_ = "";
        private String denom_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<Amount, Builder> implements AmountOrBuilder {
            public /* synthetic */ Builder(C97321 r1) {
                this();
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((Amount) this.instance).clearAmount();
                return this;
            }

            public Builder clearDenom() {
                copyOnWrite();
                ((Amount) this.instance).clearDenom();
                return this;
            }

            public String getAmount() {
                return ((Amount) this.instance).getAmount();
            }

            public ByteString getAmountBytes() {
                return ((Amount) this.instance).getAmountBytes();
            }

            public String getDenom() {
                return ((Amount) this.instance).getDenom();
            }

            public ByteString getDenomBytes() {
                return ((Amount) this.instance).getDenomBytes();
            }

            public Builder setAmount(String str) {
                copyOnWrite();
                ((Amount) this.instance).setAmount(str);
                return this;
            }

            public Builder setAmountBytes(ByteString byteString) {
                copyOnWrite();
                ((Amount) this.instance).setAmountBytes(byteString);
                return this;
            }

            public Builder setDenom(String str) {
                copyOnWrite();
                ((Amount) this.instance).setDenom(str);
                return this;
            }

            public Builder setDenomBytes(ByteString byteString) {
                copyOnWrite();
                ((Amount) this.instance).setDenomBytes(byteString);
                return this;
            }

            private Builder() {
                super(Amount.DEFAULT_INSTANCE);
            }
        }

        static {
            Amount amount = new Amount();
            DEFAULT_INSTANCE = amount;
            GeneratedMessageLite.registerDefaultInstance(Amount.class, amount);
        }

        private Amount() {
        }

        /* access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = getDefaultInstance().getAmount();
        }

        /* access modifiers changed from: private */
        public void clearDenom() {
            this.denom_ = getDefaultInstance().getDenom();
        }

        public static Amount getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Amount parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Amount) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Amount parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Amount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<Amount> parser() {
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
            switch (C97321.f46548xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Amount();
                case 2:
                    return new Builder((C97321) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"denom_", "amount_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<Amount> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (Amount.class) {
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

        public String getDenom() {
            return this.denom_;
        }

        public ByteString getDenomBytes() {
            return ByteString.copyFromUtf8(this.denom_);
        }

        public static Builder newBuilder(Amount amount) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(amount);
        }

        public static Amount parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Amount) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Amount parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (Amount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static Amount parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Amount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Amount parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (Amount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static Amount parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Amount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Amount parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (Amount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static Amount parseFrom(InputStream inputStream) throws IOException {
            return (Amount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Amount parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Amount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Amount parseFrom(C4969g gVar) throws IOException {
            return (Amount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static Amount parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (Amount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface AmountOrBuilder extends qu3 {
        String getAmount();

        ByteString getAmountBytes();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getDenom();

        ByteString getDenomBytes();

        /* synthetic */ boolean isInitialized();
    }

    public enum BroadcastMode implements C5011t.C5014c {
        BLOCK(0),
        SYNC(1),
        ASYNC(2),
        UNRECOGNIZED(-1);
        
        public static final int ASYNC_VALUE = 2;
        public static final int BLOCK_VALUE = 0;
        public static final int SYNC_VALUE = 1;
        private static final C5011t.C5015d<BroadcastMode> internalValueMap = null;
        private final int value;

        public static final class BroadcastModeVerifier implements C5011t.C5016e {
            public static final C5011t.C5016e INSTANCE = null;

            static {
                INSTANCE = new BroadcastModeVerifier();
            }

            private BroadcastModeVerifier() {
            }

            public boolean isInRange(int i) {
                if (BroadcastMode.forNumber(i) != null) {
                    return true;
                }
                return false;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C5011t.C5015d<BroadcastMode>() {
                public BroadcastMode findValueByNumber(int i) {
                    return BroadcastMode.forNumber(i);
                }
            };
        }

        private BroadcastMode(int i) {
            this.value = i;
        }

        public static BroadcastMode forNumber(int i) {
            if (i == 0) {
                return BLOCK;
            }
            if (i == 1) {
                return SYNC;
            }
            if (i != 2) {
                return null;
            }
            return ASYNC;
        }

        public static C5011t.C5015d<BroadcastMode> internalGetValueMap() {
            return internalValueMap;
        }

        public static C5011t.C5016e internalGetVerifier() {
            return BroadcastModeVerifier.INSTANCE;
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static BroadcastMode valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class Fee extends GeneratedMessageLite<Fee, Builder> implements FeeOrBuilder {
        public static final int AMOUNTS_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final Fee DEFAULT_INSTANCE;
        public static final int GAS_FIELD_NUMBER = 2;
        private static volatile im4<Fee> PARSER;
        private C5011t.C5020i<Amount> amounts_ = GeneratedMessageLite.emptyProtobufList();
        private long gas_;

        public static final class Builder extends GeneratedMessageLite.C4930a<Fee, Builder> implements FeeOrBuilder {
            public /* synthetic */ Builder(C97321 r1) {
                this();
            }

            public Builder addAllAmounts(Iterable<? extends Amount> iterable) {
                copyOnWrite();
                ((Fee) this.instance).addAllAmounts(iterable);
                return this;
            }

            public Builder addAmounts(Amount amount) {
                copyOnWrite();
                ((Fee) this.instance).addAmounts(amount);
                return this;
            }

            public Builder clearAmounts() {
                copyOnWrite();
                ((Fee) this.instance).clearAmounts();
                return this;
            }

            public Builder clearGas() {
                copyOnWrite();
                ((Fee) this.instance).clearGas();
                return this;
            }

            public Amount getAmounts(int i) {
                return ((Fee) this.instance).getAmounts(i);
            }

            public int getAmountsCount() {
                return ((Fee) this.instance).getAmountsCount();
            }

            public List<Amount> getAmountsList() {
                return Collections.unmodifiableList(((Fee) this.instance).getAmountsList());
            }

            public long getGas() {
                return ((Fee) this.instance).getGas();
            }

            public Builder removeAmounts(int i) {
                copyOnWrite();
                ((Fee) this.instance).removeAmounts(i);
                return this;
            }

            public Builder setAmounts(int i, Amount amount) {
                copyOnWrite();
                ((Fee) this.instance).setAmounts(i, amount);
                return this;
            }

            public Builder setGas(long j) {
                copyOnWrite();
                ((Fee) this.instance).setGas(j);
                return this;
            }

            private Builder() {
                super(Fee.DEFAULT_INSTANCE);
            }

            public Builder addAmounts(int i, Amount amount) {
                copyOnWrite();
                ((Fee) this.instance).addAmounts(i, amount);
                return this;
            }

            public Builder setAmounts(int i, Amount.Builder builder) {
                copyOnWrite();
                ((Fee) this.instance).setAmounts(i, (Amount) builder.build());
                return this;
            }

            public Builder addAmounts(Amount.Builder builder) {
                copyOnWrite();
                ((Fee) this.instance).addAmounts((Amount) builder.build());
                return this;
            }

            public Builder addAmounts(int i, Amount.Builder builder) {
                copyOnWrite();
                ((Fee) this.instance).addAmounts(i, (Amount) builder.build());
                return this;
            }
        }

        static {
            Fee fee = new Fee();
            DEFAULT_INSTANCE = fee;
            GeneratedMessageLite.registerDefaultInstance(Fee.class, fee);
        }

        private Fee() {
        }

        /* access modifiers changed from: private */
        public void addAllAmounts(Iterable<? extends Amount> iterable) {
            ensureAmountsIsMutable();
            C4949a.addAll(iterable, this.amounts_);
        }

        /* access modifiers changed from: private */
        public void addAmounts(Amount amount) {
            amount.getClass();
            ensureAmountsIsMutable();
            this.amounts_.add(amount);
        }

        /* access modifiers changed from: private */
        public void clearAmounts() {
            this.amounts_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearGas() {
            this.gas_ = 0;
        }

        private void ensureAmountsIsMutable() {
            C5011t.C5020i<Amount> iVar = this.amounts_;
            if (!iVar.mo37090v()) {
                this.amounts_ = GeneratedMessageLite.mutableCopy(iVar);
            }
        }

        public static Fee getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Fee parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Fee) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Fee parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Fee) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<Fee> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeAmounts(int i) {
            ensureAmountsIsMutable();
            this.amounts_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setAmounts(int i, Amount amount) {
            amount.getClass();
            ensureAmountsIsMutable();
            this.amounts_.set(i, amount);
        }

        /* access modifiers changed from: private */
        public void setGas(long j) {
            this.gas_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97321.f46548xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Fee();
                case 2:
                    return new Builder((C97321) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0003", new Object[]{"amounts_", Amount.class, "gas_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<Fee> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (Fee.class) {
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

        public Amount getAmounts(int i) {
            return this.amounts_.get(i);
        }

        public int getAmountsCount() {
            return this.amounts_.size();
        }

        public List<Amount> getAmountsList() {
            return this.amounts_;
        }

        public AmountOrBuilder getAmountsOrBuilder(int i) {
            return this.amounts_.get(i);
        }

        public List<? extends AmountOrBuilder> getAmountsOrBuilderList() {
            return this.amounts_;
        }

        public long getGas() {
            return this.gas_;
        }

        public static Builder newBuilder(Fee fee) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(fee);
        }

        public static Fee parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Fee) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Fee parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (Fee) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static Fee parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Fee) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* access modifiers changed from: private */
        public void addAmounts(int i, Amount amount) {
            amount.getClass();
            ensureAmountsIsMutable();
            this.amounts_.add(i, amount);
        }

        public static Fee parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (Fee) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static Fee parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Fee) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Fee parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (Fee) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static Fee parseFrom(InputStream inputStream) throws IOException {
            return (Fee) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Fee parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Fee) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Fee parseFrom(C4969g gVar) throws IOException {
            return (Fee) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static Fee parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (Fee) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface FeeOrBuilder extends qu3 {
        Amount getAmounts(int i);

        int getAmountsCount();

        List<Amount> getAmountsList();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        long getGas();

        /* synthetic */ boolean isInitialized();
    }

    public static final class Height extends GeneratedMessageLite<Height, Builder> implements HeightOrBuilder {
        /* access modifiers changed from: private */
        public static final Height DEFAULT_INSTANCE;
        private static volatile im4<Height> PARSER = null;
        public static final int REVISION_HEIGHT_FIELD_NUMBER = 2;
        public static final int REVISION_NUMBER_FIELD_NUMBER = 1;
        private long revisionHeight_;
        private long revisionNumber_;

        public static final class Builder extends GeneratedMessageLite.C4930a<Height, Builder> implements HeightOrBuilder {
            public /* synthetic */ Builder(C97321 r1) {
                this();
            }

            public Builder clearRevisionHeight() {
                copyOnWrite();
                ((Height) this.instance).clearRevisionHeight();
                return this;
            }

            public Builder clearRevisionNumber() {
                copyOnWrite();
                ((Height) this.instance).clearRevisionNumber();
                return this;
            }

            public long getRevisionHeight() {
                return ((Height) this.instance).getRevisionHeight();
            }

            public long getRevisionNumber() {
                return ((Height) this.instance).getRevisionNumber();
            }

            public Builder setRevisionHeight(long j) {
                copyOnWrite();
                ((Height) this.instance).setRevisionHeight(j);
                return this;
            }

            public Builder setRevisionNumber(long j) {
                copyOnWrite();
                ((Height) this.instance).setRevisionNumber(j);
                return this;
            }

            private Builder() {
                super(Height.DEFAULT_INSTANCE);
            }
        }

        static {
            Height height = new Height();
            DEFAULT_INSTANCE = height;
            GeneratedMessageLite.registerDefaultInstance(Height.class, height);
        }

        private Height() {
        }

        /* access modifiers changed from: private */
        public void clearRevisionHeight() {
            this.revisionHeight_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearRevisionNumber() {
            this.revisionNumber_ = 0;
        }

        public static Height getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Height parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Height) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Height parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Height) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<Height> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setRevisionHeight(long j) {
            this.revisionHeight_ = j;
        }

        /* access modifiers changed from: private */
        public void setRevisionNumber(long j) {
            this.revisionNumber_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97321.f46548xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Height();
                case 2:
                    return new Builder((C97321) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0003\u0002\u0003", new Object[]{"revisionNumber_", "revisionHeight_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<Height> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (Height.class) {
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

        public long getRevisionHeight() {
            return this.revisionHeight_;
        }

        public long getRevisionNumber() {
            return this.revisionNumber_;
        }

        public static Builder newBuilder(Height height) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(height);
        }

        public static Height parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Height) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Height parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (Height) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static Height parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Height) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Height parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (Height) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static Height parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Height) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Height parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (Height) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static Height parseFrom(InputStream inputStream) throws IOException {
            return (Height) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Height parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Height) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Height parseFrom(C4969g gVar) throws IOException {
            return (Height) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static Height parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (Height) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface HeightOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        long getRevisionHeight();

        long getRevisionNumber();

        /* synthetic */ boolean isInitialized();
    }

    public static final class Message extends GeneratedMessageLite<Message, Builder> implements MessageOrBuilder {
        public static final int AUTH_GRANT_FIELD_NUMBER = 16;
        public static final int AUTH_REVOKE_FIELD_NUMBER = 17;
        /* access modifiers changed from: private */
        public static final Message DEFAULT_INSTANCE;
        public static final int MSG_VOTE_FIELD_NUMBER = 18;
        private static volatile im4<Message> PARSER = null;
        public static final int RAW_JSON_MESSAGE_FIELD_NUMBER = 7;
        public static final int RESTAKE_MESSAGE_FIELD_NUMBER = 5;
        public static final int SEND_COINS_MESSAGE_FIELD_NUMBER = 1;
        public static final int SIGN_DIRECT_MESSAGE_FIELD_NUMBER = 15;
        public static final int STAKE_MESSAGE_FIELD_NUMBER = 3;
        public static final int THORCHAIN_SEND_MESSAGE_FIELD_NUMBER = 10;
        public static final int TRANSFER_TOKENS_MESSAGE_FIELD_NUMBER = 2;
        public static final int UNSTAKE_MESSAGE_FIELD_NUMBER = 4;
        public static final int WASM_EXECUTE_CONTRACT_GENERIC_FIELD_NUMBER = 14;
        public static final int WASM_EXECUTE_CONTRACT_SEND_MESSAGE_FIELD_NUMBER = 13;
        public static final int WASM_EXECUTE_CONTRACT_TRANSFER_MESSAGE_FIELD_NUMBER = 12;
        public static final int WASM_TERRA_EXECUTE_CONTRACT_GENERIC_FIELD_NUMBER = 11;
        public static final int WASM_TERRA_EXECUTE_CONTRACT_SEND_MESSAGE_FIELD_NUMBER = 9;
        public static final int WASM_TERRA_EXECUTE_CONTRACT_TRANSFER_MESSAGE_FIELD_NUMBER = 8;
        public static final int WITHDRAW_STAKE_REWARD_MESSAGE_FIELD_NUMBER = 6;
        private int messageOneofCase_ = 0;
        private Object messageOneof_;

        public static final class AuthGrant extends GeneratedMessageLite<AuthGrant, Builder> implements AuthGrantOrBuilder {
            /* access modifiers changed from: private */
            public static final AuthGrant DEFAULT_INSTANCE;
            public static final int EXPIRATION_FIELD_NUMBER = 4;
            public static final int GRANTEE_FIELD_NUMBER = 2;
            public static final int GRANTER_FIELD_NUMBER = 1;
            public static final int GRANT_STAKE_FIELD_NUMBER = 3;
            private static volatile im4<AuthGrant> PARSER;
            private long expiration_;
            private int grantTypeCase_ = 0;
            private Object grantType_;
            private String grantee_ = "";
            private String granter_ = "";

            public static final class Builder extends GeneratedMessageLite.C4930a<AuthGrant, Builder> implements AuthGrantOrBuilder {
                public /* synthetic */ Builder(C97321 r1) {
                    this();
                }

                public Builder clearExpiration() {
                    copyOnWrite();
                    ((AuthGrant) this.instance).clearExpiration();
                    return this;
                }

                public Builder clearGrantStake() {
                    copyOnWrite();
                    ((AuthGrant) this.instance).clearGrantStake();
                    return this;
                }

                public Builder clearGrantType() {
                    copyOnWrite();
                    ((AuthGrant) this.instance).clearGrantType();
                    return this;
                }

                public Builder clearGrantee() {
                    copyOnWrite();
                    ((AuthGrant) this.instance).clearGrantee();
                    return this;
                }

                public Builder clearGranter() {
                    copyOnWrite();
                    ((AuthGrant) this.instance).clearGranter();
                    return this;
                }

                public long getExpiration() {
                    return ((AuthGrant) this.instance).getExpiration();
                }

                public StakeAuthorization getGrantStake() {
                    return ((AuthGrant) this.instance).getGrantStake();
                }

                public GrantTypeCase getGrantTypeCase() {
                    return ((AuthGrant) this.instance).getGrantTypeCase();
                }

                public String getGrantee() {
                    return ((AuthGrant) this.instance).getGrantee();
                }

                public ByteString getGranteeBytes() {
                    return ((AuthGrant) this.instance).getGranteeBytes();
                }

                public String getGranter() {
                    return ((AuthGrant) this.instance).getGranter();
                }

                public ByteString getGranterBytes() {
                    return ((AuthGrant) this.instance).getGranterBytes();
                }

                public boolean hasGrantStake() {
                    return ((AuthGrant) this.instance).hasGrantStake();
                }

                public Builder mergeGrantStake(StakeAuthorization stakeAuthorization) {
                    copyOnWrite();
                    ((AuthGrant) this.instance).mergeGrantStake(stakeAuthorization);
                    return this;
                }

                public Builder setExpiration(long j) {
                    copyOnWrite();
                    ((AuthGrant) this.instance).setExpiration(j);
                    return this;
                }

                public Builder setGrantStake(StakeAuthorization stakeAuthorization) {
                    copyOnWrite();
                    ((AuthGrant) this.instance).setGrantStake(stakeAuthorization);
                    return this;
                }

                public Builder setGrantee(String str) {
                    copyOnWrite();
                    ((AuthGrant) this.instance).setGrantee(str);
                    return this;
                }

                public Builder setGranteeBytes(ByteString byteString) {
                    copyOnWrite();
                    ((AuthGrant) this.instance).setGranteeBytes(byteString);
                    return this;
                }

                public Builder setGranter(String str) {
                    copyOnWrite();
                    ((AuthGrant) this.instance).setGranter(str);
                    return this;
                }

                public Builder setGranterBytes(ByteString byteString) {
                    copyOnWrite();
                    ((AuthGrant) this.instance).setGranterBytes(byteString);
                    return this;
                }

                private Builder() {
                    super(AuthGrant.DEFAULT_INSTANCE);
                }

                public Builder setGrantStake(StakeAuthorization.Builder builder) {
                    copyOnWrite();
                    ((AuthGrant) this.instance).setGrantStake((StakeAuthorization) builder.build());
                    return this;
                }
            }

            public enum GrantTypeCase {
                GRANT_STAKE(3),
                GRANTTYPE_NOT_SET(0);
                
                private final int value;

                private GrantTypeCase(int i) {
                    this.value = i;
                }

                public static GrantTypeCase forNumber(int i) {
                    if (i == 0) {
                        return GRANTTYPE_NOT_SET;
                    }
                    if (i != 3) {
                        return null;
                    }
                    return GRANT_STAKE;
                }

                public int getNumber() {
                    return this.value;
                }

                @Deprecated
                public static GrantTypeCase valueOf(int i) {
                    return forNumber(i);
                }
            }

            static {
                AuthGrant authGrant = new AuthGrant();
                DEFAULT_INSTANCE = authGrant;
                GeneratedMessageLite.registerDefaultInstance(AuthGrant.class, authGrant);
            }

            private AuthGrant() {
            }

            /* access modifiers changed from: private */
            public void clearExpiration() {
                this.expiration_ = 0;
            }

            /* access modifiers changed from: private */
            public void clearGrantStake() {
                if (this.grantTypeCase_ == 3) {
                    this.grantTypeCase_ = 0;
                    this.grantType_ = null;
                }
            }

            /* access modifiers changed from: private */
            public void clearGrantType() {
                this.grantTypeCase_ = 0;
                this.grantType_ = null;
            }

            /* access modifiers changed from: private */
            public void clearGrantee() {
                this.grantee_ = getDefaultInstance().getGrantee();
            }

            /* access modifiers changed from: private */
            public void clearGranter() {
                this.granter_ = getDefaultInstance().getGranter();
            }

            public static AuthGrant getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* access modifiers changed from: private */
            public void mergeGrantStake(StakeAuthorization stakeAuthorization) {
                stakeAuthorization.getClass();
                if (this.grantTypeCase_ != 3 || this.grantType_ == StakeAuthorization.getDefaultInstance()) {
                    this.grantType_ = stakeAuthorization;
                } else {
                    this.grantType_ = ((StakeAuthorization.Builder) StakeAuthorization.newBuilder((StakeAuthorization) this.grantType_).mergeFrom(stakeAuthorization)).buildPartial();
                }
                this.grantTypeCase_ = 3;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static AuthGrant parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (AuthGrant) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static AuthGrant parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (AuthGrant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<AuthGrant> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setExpiration(long j) {
                this.expiration_ = j;
            }

            /* access modifiers changed from: private */
            public void setGrantStake(StakeAuthorization stakeAuthorization) {
                stakeAuthorization.getClass();
                this.grantType_ = stakeAuthorization;
                this.grantTypeCase_ = 3;
            }

            /* access modifiers changed from: private */
            public void setGrantee(String str) {
                str.getClass();
                this.grantee_ = str;
            }

            /* access modifiers changed from: private */
            public void setGranteeBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.grantee_ = byteString.toStringUtf8();
            }

            /* access modifiers changed from: private */
            public void setGranter(String str) {
                str.getClass();
                this.granter_ = str;
            }

            /* access modifiers changed from: private */
            public void setGranterBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.granter_ = byteString.toStringUtf8();
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97321.f46548xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new AuthGrant();
                    case 2:
                        return new Builder((C97321) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003<\u0000\u0004\u0002", new Object[]{"grantType_", "grantTypeCase_", "granter_", "grantee_", StakeAuthorization.class, "expiration_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<AuthGrant> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (AuthGrant.class) {
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

            public long getExpiration() {
                return this.expiration_;
            }

            public StakeAuthorization getGrantStake() {
                if (this.grantTypeCase_ == 3) {
                    return (StakeAuthorization) this.grantType_;
                }
                return StakeAuthorization.getDefaultInstance();
            }

            public GrantTypeCase getGrantTypeCase() {
                return GrantTypeCase.forNumber(this.grantTypeCase_);
            }

            public String getGrantee() {
                return this.grantee_;
            }

            public ByteString getGranteeBytes() {
                return ByteString.copyFromUtf8(this.grantee_);
            }

            public String getGranter() {
                return this.granter_;
            }

            public ByteString getGranterBytes() {
                return ByteString.copyFromUtf8(this.granter_);
            }

            public boolean hasGrantStake() {
                if (this.grantTypeCase_ == 3) {
                    return true;
                }
                return false;
            }

            public static Builder newBuilder(AuthGrant authGrant) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(authGrant);
            }

            public static AuthGrant parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (AuthGrant) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static AuthGrant parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (AuthGrant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static AuthGrant parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (AuthGrant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static AuthGrant parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (AuthGrant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static AuthGrant parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (AuthGrant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static AuthGrant parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (AuthGrant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static AuthGrant parseFrom(InputStream inputStream) throws IOException {
                return (AuthGrant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static AuthGrant parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (AuthGrant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static AuthGrant parseFrom(C4969g gVar) throws IOException {
                return (AuthGrant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static AuthGrant parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (AuthGrant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public interface AuthGrantOrBuilder extends qu3 {
            /* synthetic */ C4956c0 getDefaultInstanceForType();

            long getExpiration();

            StakeAuthorization getGrantStake();

            AuthGrant.GrantTypeCase getGrantTypeCase();

            String getGrantee();

            ByteString getGranteeBytes();

            String getGranter();

            ByteString getGranterBytes();

            boolean hasGrantStake();

            /* synthetic */ boolean isInitialized();
        }

        public static final class AuthRevoke extends GeneratedMessageLite<AuthRevoke, Builder> implements AuthRevokeOrBuilder {
            /* access modifiers changed from: private */
            public static final AuthRevoke DEFAULT_INSTANCE;
            public static final int GRANTEE_FIELD_NUMBER = 2;
            public static final int GRANTER_FIELD_NUMBER = 1;
            public static final int MSG_TYPE_URL_FIELD_NUMBER = 3;
            private static volatile im4<AuthRevoke> PARSER;
            private String grantee_ = "";
            private String granter_ = "";
            private String msgTypeUrl_ = "";

            public static final class Builder extends GeneratedMessageLite.C4930a<AuthRevoke, Builder> implements AuthRevokeOrBuilder {
                public /* synthetic */ Builder(C97321 r1) {
                    this();
                }

                public Builder clearGrantee() {
                    copyOnWrite();
                    ((AuthRevoke) this.instance).clearGrantee();
                    return this;
                }

                public Builder clearGranter() {
                    copyOnWrite();
                    ((AuthRevoke) this.instance).clearGranter();
                    return this;
                }

                public Builder clearMsgTypeUrl() {
                    copyOnWrite();
                    ((AuthRevoke) this.instance).clearMsgTypeUrl();
                    return this;
                }

                public String getGrantee() {
                    return ((AuthRevoke) this.instance).getGrantee();
                }

                public ByteString getGranteeBytes() {
                    return ((AuthRevoke) this.instance).getGranteeBytes();
                }

                public String getGranter() {
                    return ((AuthRevoke) this.instance).getGranter();
                }

                public ByteString getGranterBytes() {
                    return ((AuthRevoke) this.instance).getGranterBytes();
                }

                public String getMsgTypeUrl() {
                    return ((AuthRevoke) this.instance).getMsgTypeUrl();
                }

                public ByteString getMsgTypeUrlBytes() {
                    return ((AuthRevoke) this.instance).getMsgTypeUrlBytes();
                }

                public Builder setGrantee(String str) {
                    copyOnWrite();
                    ((AuthRevoke) this.instance).setGrantee(str);
                    return this;
                }

                public Builder setGranteeBytes(ByteString byteString) {
                    copyOnWrite();
                    ((AuthRevoke) this.instance).setGranteeBytes(byteString);
                    return this;
                }

                public Builder setGranter(String str) {
                    copyOnWrite();
                    ((AuthRevoke) this.instance).setGranter(str);
                    return this;
                }

                public Builder setGranterBytes(ByteString byteString) {
                    copyOnWrite();
                    ((AuthRevoke) this.instance).setGranterBytes(byteString);
                    return this;
                }

                public Builder setMsgTypeUrl(String str) {
                    copyOnWrite();
                    ((AuthRevoke) this.instance).setMsgTypeUrl(str);
                    return this;
                }

                public Builder setMsgTypeUrlBytes(ByteString byteString) {
                    copyOnWrite();
                    ((AuthRevoke) this.instance).setMsgTypeUrlBytes(byteString);
                    return this;
                }

                private Builder() {
                    super(AuthRevoke.DEFAULT_INSTANCE);
                }
            }

            static {
                AuthRevoke authRevoke = new AuthRevoke();
                DEFAULT_INSTANCE = authRevoke;
                GeneratedMessageLite.registerDefaultInstance(AuthRevoke.class, authRevoke);
            }

            private AuthRevoke() {
            }

            /* access modifiers changed from: private */
            public void clearGrantee() {
                this.grantee_ = getDefaultInstance().getGrantee();
            }

            /* access modifiers changed from: private */
            public void clearGranter() {
                this.granter_ = getDefaultInstance().getGranter();
            }

            /* access modifiers changed from: private */
            public void clearMsgTypeUrl() {
                this.msgTypeUrl_ = getDefaultInstance().getMsgTypeUrl();
            }

            public static AuthRevoke getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static AuthRevoke parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (AuthRevoke) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static AuthRevoke parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (AuthRevoke) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<AuthRevoke> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setGrantee(String str) {
                str.getClass();
                this.grantee_ = str;
            }

            /* access modifiers changed from: private */
            public void setGranteeBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.grantee_ = byteString.toStringUtf8();
            }

            /* access modifiers changed from: private */
            public void setGranter(String str) {
                str.getClass();
                this.granter_ = str;
            }

            /* access modifiers changed from: private */
            public void setGranterBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.granter_ = byteString.toStringUtf8();
            }

            /* access modifiers changed from: private */
            public void setMsgTypeUrl(String str) {
                str.getClass();
                this.msgTypeUrl_ = str;
            }

            /* access modifiers changed from: private */
            public void setMsgTypeUrlBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.msgTypeUrl_ = byteString.toStringUtf8();
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97321.f46548xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new AuthRevoke();
                    case 2:
                        return new Builder((C97321) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"granter_", "grantee_", "msgTypeUrl_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<AuthRevoke> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (AuthRevoke.class) {
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

            public String getGrantee() {
                return this.grantee_;
            }

            public ByteString getGranteeBytes() {
                return ByteString.copyFromUtf8(this.grantee_);
            }

            public String getGranter() {
                return this.granter_;
            }

            public ByteString getGranterBytes() {
                return ByteString.copyFromUtf8(this.granter_);
            }

            public String getMsgTypeUrl() {
                return this.msgTypeUrl_;
            }

            public ByteString getMsgTypeUrlBytes() {
                return ByteString.copyFromUtf8(this.msgTypeUrl_);
            }

            public static Builder newBuilder(AuthRevoke authRevoke) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(authRevoke);
            }

            public static AuthRevoke parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (AuthRevoke) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static AuthRevoke parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (AuthRevoke) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static AuthRevoke parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (AuthRevoke) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static AuthRevoke parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (AuthRevoke) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static AuthRevoke parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (AuthRevoke) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static AuthRevoke parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (AuthRevoke) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static AuthRevoke parseFrom(InputStream inputStream) throws IOException {
                return (AuthRevoke) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static AuthRevoke parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (AuthRevoke) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static AuthRevoke parseFrom(C4969g gVar) throws IOException {
                return (AuthRevoke) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static AuthRevoke parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (AuthRevoke) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public interface AuthRevokeOrBuilder extends qu3 {
            /* synthetic */ C4956c0 getDefaultInstanceForType();

            String getGrantee();

            ByteString getGranteeBytes();

            String getGranter();

            ByteString getGranterBytes();

            String getMsgTypeUrl();

            ByteString getMsgTypeUrlBytes();

            /* synthetic */ boolean isInitialized();
        }

        public enum AuthorizationType implements C5011t.C5014c {
            UNSPECIFIED(0),
            DELEGATE(1),
            UNDELEGATE(2),
            REDELEGATE(3),
            UNRECOGNIZED(-1);
            
            public static final int DELEGATE_VALUE = 1;
            public static final int REDELEGATE_VALUE = 3;
            public static final int UNDELEGATE_VALUE = 2;
            public static final int UNSPECIFIED_VALUE = 0;
            private static final C5011t.C5015d<AuthorizationType> internalValueMap = null;
            private final int value;

            public static final class AuthorizationTypeVerifier implements C5011t.C5016e {
                public static final C5011t.C5016e INSTANCE = null;

                static {
                    INSTANCE = new AuthorizationTypeVerifier();
                }

                private AuthorizationTypeVerifier() {
                }

                public boolean isInRange(int i) {
                    if (AuthorizationType.forNumber(i) != null) {
                        return true;
                    }
                    return false;
                }
            }

            /* access modifiers changed from: public */
            static {
                internalValueMap = new C5011t.C5015d<AuthorizationType>() {
                    public AuthorizationType findValueByNumber(int i) {
                        return AuthorizationType.forNumber(i);
                    }
                };
            }

            private AuthorizationType(int i) {
                this.value = i;
            }

            public static AuthorizationType forNumber(int i) {
                if (i == 0) {
                    return UNSPECIFIED;
                }
                if (i == 1) {
                    return DELEGATE;
                }
                if (i == 2) {
                    return UNDELEGATE;
                }
                if (i != 3) {
                    return null;
                }
                return REDELEGATE;
            }

            public static C5011t.C5015d<AuthorizationType> internalGetValueMap() {
                return internalValueMap;
            }

            public static C5011t.C5016e internalGetVerifier() {
                return AuthorizationTypeVerifier.INSTANCE;
            }

            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Deprecated
            public static AuthorizationType valueOf(int i) {
                return forNumber(i);
            }
        }

        public static final class BeginRedelegate extends GeneratedMessageLite<BeginRedelegate, Builder> implements BeginRedelegateOrBuilder {
            public static final int AMOUNT_FIELD_NUMBER = 4;
            /* access modifiers changed from: private */
            public static final BeginRedelegate DEFAULT_INSTANCE;
            public static final int DELEGATOR_ADDRESS_FIELD_NUMBER = 1;
            private static volatile im4<BeginRedelegate> PARSER = null;
            public static final int TYPE_PREFIX_FIELD_NUMBER = 5;
            public static final int VALIDATOR_DST_ADDRESS_FIELD_NUMBER = 3;
            public static final int VALIDATOR_SRC_ADDRESS_FIELD_NUMBER = 2;
            private Amount amount_;
            private String delegatorAddress_ = "";
            private String typePrefix_ = "";
            private String validatorDstAddress_ = "";
            private String validatorSrcAddress_ = "";

            public static final class Builder extends GeneratedMessageLite.C4930a<BeginRedelegate, Builder> implements BeginRedelegateOrBuilder {
                public /* synthetic */ Builder(C97321 r1) {
                    this();
                }

                public Builder clearAmount() {
                    copyOnWrite();
                    ((BeginRedelegate) this.instance).clearAmount();
                    return this;
                }

                public Builder clearDelegatorAddress() {
                    copyOnWrite();
                    ((BeginRedelegate) this.instance).clearDelegatorAddress();
                    return this;
                }

                public Builder clearTypePrefix() {
                    copyOnWrite();
                    ((BeginRedelegate) this.instance).clearTypePrefix();
                    return this;
                }

                public Builder clearValidatorDstAddress() {
                    copyOnWrite();
                    ((BeginRedelegate) this.instance).clearValidatorDstAddress();
                    return this;
                }

                public Builder clearValidatorSrcAddress() {
                    copyOnWrite();
                    ((BeginRedelegate) this.instance).clearValidatorSrcAddress();
                    return this;
                }

                public Amount getAmount() {
                    return ((BeginRedelegate) this.instance).getAmount();
                }

                public String getDelegatorAddress() {
                    return ((BeginRedelegate) this.instance).getDelegatorAddress();
                }

                public ByteString getDelegatorAddressBytes() {
                    return ((BeginRedelegate) this.instance).getDelegatorAddressBytes();
                }

                public String getTypePrefix() {
                    return ((BeginRedelegate) this.instance).getTypePrefix();
                }

                public ByteString getTypePrefixBytes() {
                    return ((BeginRedelegate) this.instance).getTypePrefixBytes();
                }

                public String getValidatorDstAddress() {
                    return ((BeginRedelegate) this.instance).getValidatorDstAddress();
                }

                public ByteString getValidatorDstAddressBytes() {
                    return ((BeginRedelegate) this.instance).getValidatorDstAddressBytes();
                }

                public String getValidatorSrcAddress() {
                    return ((BeginRedelegate) this.instance).getValidatorSrcAddress();
                }

                public ByteString getValidatorSrcAddressBytes() {
                    return ((BeginRedelegate) this.instance).getValidatorSrcAddressBytes();
                }

                public boolean hasAmount() {
                    return ((BeginRedelegate) this.instance).hasAmount();
                }

                public Builder mergeAmount(Amount amount) {
                    copyOnWrite();
                    ((BeginRedelegate) this.instance).mergeAmount(amount);
                    return this;
                }

                public Builder setAmount(Amount amount) {
                    copyOnWrite();
                    ((BeginRedelegate) this.instance).setAmount(amount);
                    return this;
                }

                public Builder setDelegatorAddress(String str) {
                    copyOnWrite();
                    ((BeginRedelegate) this.instance).setDelegatorAddress(str);
                    return this;
                }

                public Builder setDelegatorAddressBytes(ByteString byteString) {
                    copyOnWrite();
                    ((BeginRedelegate) this.instance).setDelegatorAddressBytes(byteString);
                    return this;
                }

                public Builder setTypePrefix(String str) {
                    copyOnWrite();
                    ((BeginRedelegate) this.instance).setTypePrefix(str);
                    return this;
                }

                public Builder setTypePrefixBytes(ByteString byteString) {
                    copyOnWrite();
                    ((BeginRedelegate) this.instance).setTypePrefixBytes(byteString);
                    return this;
                }

                public Builder setValidatorDstAddress(String str) {
                    copyOnWrite();
                    ((BeginRedelegate) this.instance).setValidatorDstAddress(str);
                    return this;
                }

                public Builder setValidatorDstAddressBytes(ByteString byteString) {
                    copyOnWrite();
                    ((BeginRedelegate) this.instance).setValidatorDstAddressBytes(byteString);
                    return this;
                }

                public Builder setValidatorSrcAddress(String str) {
                    copyOnWrite();
                    ((BeginRedelegate) this.instance).setValidatorSrcAddress(str);
                    return this;
                }

                public Builder setValidatorSrcAddressBytes(ByteString byteString) {
                    copyOnWrite();
                    ((BeginRedelegate) this.instance).setValidatorSrcAddressBytes(byteString);
                    return this;
                }

                private Builder() {
                    super(BeginRedelegate.DEFAULT_INSTANCE);
                }

                public Builder setAmount(Amount.Builder builder) {
                    copyOnWrite();
                    ((BeginRedelegate) this.instance).setAmount((Amount) builder.build());
                    return this;
                }
            }

            static {
                BeginRedelegate beginRedelegate = new BeginRedelegate();
                DEFAULT_INSTANCE = beginRedelegate;
                GeneratedMessageLite.registerDefaultInstance(BeginRedelegate.class, beginRedelegate);
            }

            private BeginRedelegate() {
            }

            /* access modifiers changed from: private */
            public void clearAmount() {
                this.amount_ = null;
            }

            /* access modifiers changed from: private */
            public void clearDelegatorAddress() {
                this.delegatorAddress_ = getDefaultInstance().getDelegatorAddress();
            }

            /* access modifiers changed from: private */
            public void clearTypePrefix() {
                this.typePrefix_ = getDefaultInstance().getTypePrefix();
            }

            /* access modifiers changed from: private */
            public void clearValidatorDstAddress() {
                this.validatorDstAddress_ = getDefaultInstance().getValidatorDstAddress();
            }

            /* access modifiers changed from: private */
            public void clearValidatorSrcAddress() {
                this.validatorSrcAddress_ = getDefaultInstance().getValidatorSrcAddress();
            }

            public static BeginRedelegate getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* access modifiers changed from: private */
            public void mergeAmount(Amount amount) {
                amount.getClass();
                Amount amount2 = this.amount_;
                if (amount2 == null || amount2 == Amount.getDefaultInstance()) {
                    this.amount_ = amount;
                } else {
                    this.amount_ = (Amount) ((Amount.Builder) Amount.newBuilder(this.amount_).mergeFrom(amount)).buildPartial();
                }
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static BeginRedelegate parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (BeginRedelegate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static BeginRedelegate parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (BeginRedelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<BeginRedelegate> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setAmount(Amount amount) {
                amount.getClass();
                this.amount_ = amount;
            }

            /* access modifiers changed from: private */
            public void setDelegatorAddress(String str) {
                str.getClass();
                this.delegatorAddress_ = str;
            }

            /* access modifiers changed from: private */
            public void setDelegatorAddressBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.delegatorAddress_ = byteString.toStringUtf8();
            }

            /* access modifiers changed from: private */
            public void setTypePrefix(String str) {
                str.getClass();
                this.typePrefix_ = str;
            }

            /* access modifiers changed from: private */
            public void setTypePrefixBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.typePrefix_ = byteString.toStringUtf8();
            }

            /* access modifiers changed from: private */
            public void setValidatorDstAddress(String str) {
                str.getClass();
                this.validatorDstAddress_ = str;
            }

            /* access modifiers changed from: private */
            public void setValidatorDstAddressBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.validatorDstAddress_ = byteString.toStringUtf8();
            }

            /* access modifiers changed from: private */
            public void setValidatorSrcAddress(String str) {
                str.getClass();
                this.validatorSrcAddress_ = str;
            }

            /* access modifiers changed from: private */
            public void setValidatorSrcAddressBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.validatorSrcAddress_ = byteString.toStringUtf8();
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97321.f46548xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new BeginRedelegate();
                    case 2:
                        return new Builder((C97321) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\t\u0005Ȉ", new Object[]{"delegatorAddress_", "validatorSrcAddress_", "validatorDstAddress_", "amount_", "typePrefix_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<BeginRedelegate> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (BeginRedelegate.class) {
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

            public Amount getAmount() {
                Amount amount = this.amount_;
                if (amount == null) {
                    return Amount.getDefaultInstance();
                }
                return amount;
            }

            public String getDelegatorAddress() {
                return this.delegatorAddress_;
            }

            public ByteString getDelegatorAddressBytes() {
                return ByteString.copyFromUtf8(this.delegatorAddress_);
            }

            public String getTypePrefix() {
                return this.typePrefix_;
            }

            public ByteString getTypePrefixBytes() {
                return ByteString.copyFromUtf8(this.typePrefix_);
            }

            public String getValidatorDstAddress() {
                return this.validatorDstAddress_;
            }

            public ByteString getValidatorDstAddressBytes() {
                return ByteString.copyFromUtf8(this.validatorDstAddress_);
            }

            public String getValidatorSrcAddress() {
                return this.validatorSrcAddress_;
            }

            public ByteString getValidatorSrcAddressBytes() {
                return ByteString.copyFromUtf8(this.validatorSrcAddress_);
            }

            public boolean hasAmount() {
                if (this.amount_ != null) {
                    return true;
                }
                return false;
            }

            public static Builder newBuilder(BeginRedelegate beginRedelegate) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(beginRedelegate);
            }

            public static BeginRedelegate parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (BeginRedelegate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static BeginRedelegate parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (BeginRedelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static BeginRedelegate parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (BeginRedelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static BeginRedelegate parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (BeginRedelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static BeginRedelegate parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (BeginRedelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static BeginRedelegate parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (BeginRedelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static BeginRedelegate parseFrom(InputStream inputStream) throws IOException {
                return (BeginRedelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static BeginRedelegate parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (BeginRedelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static BeginRedelegate parseFrom(C4969g gVar) throws IOException {
                return (BeginRedelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static BeginRedelegate parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (BeginRedelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public interface BeginRedelegateOrBuilder extends qu3 {
            Amount getAmount();

            /* synthetic */ C4956c0 getDefaultInstanceForType();

            String getDelegatorAddress();

            ByteString getDelegatorAddressBytes();

            String getTypePrefix();

            ByteString getTypePrefixBytes();

            String getValidatorDstAddress();

            ByteString getValidatorDstAddressBytes();

            String getValidatorSrcAddress();

            ByteString getValidatorSrcAddressBytes();

            boolean hasAmount();

            /* synthetic */ boolean isInitialized();
        }

        public static final class Builder extends GeneratedMessageLite.C4930a<Message, Builder> implements MessageOrBuilder {
            public /* synthetic */ Builder(C97321 r1) {
                this();
            }

            public Builder clearAuthGrant() {
                copyOnWrite();
                ((Message) this.instance).clearAuthGrant();
                return this;
            }

            public Builder clearAuthRevoke() {
                copyOnWrite();
                ((Message) this.instance).clearAuthRevoke();
                return this;
            }

            public Builder clearMessageOneof() {
                copyOnWrite();
                ((Message) this.instance).clearMessageOneof();
                return this;
            }

            public Builder clearMsgVote() {
                copyOnWrite();
                ((Message) this.instance).clearMsgVote();
                return this;
            }

            public Builder clearRawJsonMessage() {
                copyOnWrite();
                ((Message) this.instance).clearRawJsonMessage();
                return this;
            }

            public Builder clearRestakeMessage() {
                copyOnWrite();
                ((Message) this.instance).clearRestakeMessage();
                return this;
            }

            public Builder clearSendCoinsMessage() {
                copyOnWrite();
                ((Message) this.instance).clearSendCoinsMessage();
                return this;
            }

            public Builder clearSignDirectMessage() {
                copyOnWrite();
                ((Message) this.instance).clearSignDirectMessage();
                return this;
            }

            public Builder clearStakeMessage() {
                copyOnWrite();
                ((Message) this.instance).clearStakeMessage();
                return this;
            }

            public Builder clearThorchainSendMessage() {
                copyOnWrite();
                ((Message) this.instance).clearThorchainSendMessage();
                return this;
            }

            public Builder clearTransferTokensMessage() {
                copyOnWrite();
                ((Message) this.instance).clearTransferTokensMessage();
                return this;
            }

            public Builder clearUnstakeMessage() {
                copyOnWrite();
                ((Message) this.instance).clearUnstakeMessage();
                return this;
            }

            public Builder clearWasmExecuteContractGeneric() {
                copyOnWrite();
                ((Message) this.instance).clearWasmExecuteContractGeneric();
                return this;
            }

            public Builder clearWasmExecuteContractSendMessage() {
                copyOnWrite();
                ((Message) this.instance).clearWasmExecuteContractSendMessage();
                return this;
            }

            public Builder clearWasmExecuteContractTransferMessage() {
                copyOnWrite();
                ((Message) this.instance).clearWasmExecuteContractTransferMessage();
                return this;
            }

            public Builder clearWasmTerraExecuteContractGeneric() {
                copyOnWrite();
                ((Message) this.instance).clearWasmTerraExecuteContractGeneric();
                return this;
            }

            public Builder clearWasmTerraExecuteContractSendMessage() {
                copyOnWrite();
                ((Message) this.instance).clearWasmTerraExecuteContractSendMessage();
                return this;
            }

            public Builder clearWasmTerraExecuteContractTransferMessage() {
                copyOnWrite();
                ((Message) this.instance).clearWasmTerraExecuteContractTransferMessage();
                return this;
            }

            public Builder clearWithdrawStakeRewardMessage() {
                copyOnWrite();
                ((Message) this.instance).clearWithdrawStakeRewardMessage();
                return this;
            }

            public AuthGrant getAuthGrant() {
                return ((Message) this.instance).getAuthGrant();
            }

            public AuthRevoke getAuthRevoke() {
                return ((Message) this.instance).getAuthRevoke();
            }

            public MessageOneofCase getMessageOneofCase() {
                return ((Message) this.instance).getMessageOneofCase();
            }

            public MsgVote getMsgVote() {
                return ((Message) this.instance).getMsgVote();
            }

            public RawJSON getRawJsonMessage() {
                return ((Message) this.instance).getRawJsonMessage();
            }

            public BeginRedelegate getRestakeMessage() {
                return ((Message) this.instance).getRestakeMessage();
            }

            public Send getSendCoinsMessage() {
                return ((Message) this.instance).getSendCoinsMessage();
            }

            public SignDirect getSignDirectMessage() {
                return ((Message) this.instance).getSignDirectMessage();
            }

            public Delegate getStakeMessage() {
                return ((Message) this.instance).getStakeMessage();
            }

            public THORChainSend getThorchainSendMessage() {
                return ((Message) this.instance).getThorchainSendMessage();
            }

            public Transfer getTransferTokensMessage() {
                return ((Message) this.instance).getTransferTokensMessage();
            }

            public Undelegate getUnstakeMessage() {
                return ((Message) this.instance).getUnstakeMessage();
            }

            public WasmExecuteContractGeneric getWasmExecuteContractGeneric() {
                return ((Message) this.instance).getWasmExecuteContractGeneric();
            }

            public WasmExecuteContractSend getWasmExecuteContractSendMessage() {
                return ((Message) this.instance).getWasmExecuteContractSendMessage();
            }

            public WasmExecuteContractTransfer getWasmExecuteContractTransferMessage() {
                return ((Message) this.instance).getWasmExecuteContractTransferMessage();
            }

            public WasmTerraExecuteContractGeneric getWasmTerraExecuteContractGeneric() {
                return ((Message) this.instance).getWasmTerraExecuteContractGeneric();
            }

            public WasmTerraExecuteContractSend getWasmTerraExecuteContractSendMessage() {
                return ((Message) this.instance).getWasmTerraExecuteContractSendMessage();
            }

            public WasmTerraExecuteContractTransfer getWasmTerraExecuteContractTransferMessage() {
                return ((Message) this.instance).getWasmTerraExecuteContractTransferMessage();
            }

            public WithdrawDelegationReward getWithdrawStakeRewardMessage() {
                return ((Message) this.instance).getWithdrawStakeRewardMessage();
            }

            public boolean hasAuthGrant() {
                return ((Message) this.instance).hasAuthGrant();
            }

            public boolean hasAuthRevoke() {
                return ((Message) this.instance).hasAuthRevoke();
            }

            public boolean hasMsgVote() {
                return ((Message) this.instance).hasMsgVote();
            }

            public boolean hasRawJsonMessage() {
                return ((Message) this.instance).hasRawJsonMessage();
            }

            public boolean hasRestakeMessage() {
                return ((Message) this.instance).hasRestakeMessage();
            }

            public boolean hasSendCoinsMessage() {
                return ((Message) this.instance).hasSendCoinsMessage();
            }

            public boolean hasSignDirectMessage() {
                return ((Message) this.instance).hasSignDirectMessage();
            }

            public boolean hasStakeMessage() {
                return ((Message) this.instance).hasStakeMessage();
            }

            public boolean hasThorchainSendMessage() {
                return ((Message) this.instance).hasThorchainSendMessage();
            }

            public boolean hasTransferTokensMessage() {
                return ((Message) this.instance).hasTransferTokensMessage();
            }

            public boolean hasUnstakeMessage() {
                return ((Message) this.instance).hasUnstakeMessage();
            }

            public boolean hasWasmExecuteContractGeneric() {
                return ((Message) this.instance).hasWasmExecuteContractGeneric();
            }

            public boolean hasWasmExecuteContractSendMessage() {
                return ((Message) this.instance).hasWasmExecuteContractSendMessage();
            }

            public boolean hasWasmExecuteContractTransferMessage() {
                return ((Message) this.instance).hasWasmExecuteContractTransferMessage();
            }

            public boolean hasWasmTerraExecuteContractGeneric() {
                return ((Message) this.instance).hasWasmTerraExecuteContractGeneric();
            }

            public boolean hasWasmTerraExecuteContractSendMessage() {
                return ((Message) this.instance).hasWasmTerraExecuteContractSendMessage();
            }

            public boolean hasWasmTerraExecuteContractTransferMessage() {
                return ((Message) this.instance).hasWasmTerraExecuteContractTransferMessage();
            }

            public boolean hasWithdrawStakeRewardMessage() {
                return ((Message) this.instance).hasWithdrawStakeRewardMessage();
            }

            public Builder mergeAuthGrant(AuthGrant authGrant) {
                copyOnWrite();
                ((Message) this.instance).mergeAuthGrant(authGrant);
                return this;
            }

            public Builder mergeAuthRevoke(AuthRevoke authRevoke) {
                copyOnWrite();
                ((Message) this.instance).mergeAuthRevoke(authRevoke);
                return this;
            }

            public Builder mergeMsgVote(MsgVote msgVote) {
                copyOnWrite();
                ((Message) this.instance).mergeMsgVote(msgVote);
                return this;
            }

            public Builder mergeRawJsonMessage(RawJSON rawJSON) {
                copyOnWrite();
                ((Message) this.instance).mergeRawJsonMessage(rawJSON);
                return this;
            }

            public Builder mergeRestakeMessage(BeginRedelegate beginRedelegate) {
                copyOnWrite();
                ((Message) this.instance).mergeRestakeMessage(beginRedelegate);
                return this;
            }

            public Builder mergeSendCoinsMessage(Send send) {
                copyOnWrite();
                ((Message) this.instance).mergeSendCoinsMessage(send);
                return this;
            }

            public Builder mergeSignDirectMessage(SignDirect signDirect) {
                copyOnWrite();
                ((Message) this.instance).mergeSignDirectMessage(signDirect);
                return this;
            }

            public Builder mergeStakeMessage(Delegate delegate) {
                copyOnWrite();
                ((Message) this.instance).mergeStakeMessage(delegate);
                return this;
            }

            public Builder mergeThorchainSendMessage(THORChainSend tHORChainSend) {
                copyOnWrite();
                ((Message) this.instance).mergeThorchainSendMessage(tHORChainSend);
                return this;
            }

            public Builder mergeTransferTokensMessage(Transfer transfer) {
                copyOnWrite();
                ((Message) this.instance).mergeTransferTokensMessage(transfer);
                return this;
            }

            public Builder mergeUnstakeMessage(Undelegate undelegate) {
                copyOnWrite();
                ((Message) this.instance).mergeUnstakeMessage(undelegate);
                return this;
            }

            public Builder mergeWasmExecuteContractGeneric(WasmExecuteContractGeneric wasmExecuteContractGeneric) {
                copyOnWrite();
                ((Message) this.instance).mergeWasmExecuteContractGeneric(wasmExecuteContractGeneric);
                return this;
            }

            public Builder mergeWasmExecuteContractSendMessage(WasmExecuteContractSend wasmExecuteContractSend) {
                copyOnWrite();
                ((Message) this.instance).mergeWasmExecuteContractSendMessage(wasmExecuteContractSend);
                return this;
            }

            public Builder mergeWasmExecuteContractTransferMessage(WasmExecuteContractTransfer wasmExecuteContractTransfer) {
                copyOnWrite();
                ((Message) this.instance).mergeWasmExecuteContractTransferMessage(wasmExecuteContractTransfer);
                return this;
            }

            public Builder mergeWasmTerraExecuteContractGeneric(WasmTerraExecuteContractGeneric wasmTerraExecuteContractGeneric) {
                copyOnWrite();
                ((Message) this.instance).mergeWasmTerraExecuteContractGeneric(wasmTerraExecuteContractGeneric);
                return this;
            }

            public Builder mergeWasmTerraExecuteContractSendMessage(WasmTerraExecuteContractSend wasmTerraExecuteContractSend) {
                copyOnWrite();
                ((Message) this.instance).mergeWasmTerraExecuteContractSendMessage(wasmTerraExecuteContractSend);
                return this;
            }

            public Builder mergeWasmTerraExecuteContractTransferMessage(WasmTerraExecuteContractTransfer wasmTerraExecuteContractTransfer) {
                copyOnWrite();
                ((Message) this.instance).mergeWasmTerraExecuteContractTransferMessage(wasmTerraExecuteContractTransfer);
                return this;
            }

            public Builder mergeWithdrawStakeRewardMessage(WithdrawDelegationReward withdrawDelegationReward) {
                copyOnWrite();
                ((Message) this.instance).mergeWithdrawStakeRewardMessage(withdrawDelegationReward);
                return this;
            }

            public Builder setAuthGrant(AuthGrant authGrant) {
                copyOnWrite();
                ((Message) this.instance).setAuthGrant(authGrant);
                return this;
            }

            public Builder setAuthRevoke(AuthRevoke authRevoke) {
                copyOnWrite();
                ((Message) this.instance).setAuthRevoke(authRevoke);
                return this;
            }

            public Builder setMsgVote(MsgVote msgVote) {
                copyOnWrite();
                ((Message) this.instance).setMsgVote(msgVote);
                return this;
            }

            public Builder setRawJsonMessage(RawJSON rawJSON) {
                copyOnWrite();
                ((Message) this.instance).setRawJsonMessage(rawJSON);
                return this;
            }

            public Builder setRestakeMessage(BeginRedelegate beginRedelegate) {
                copyOnWrite();
                ((Message) this.instance).setRestakeMessage(beginRedelegate);
                return this;
            }

            public Builder setSendCoinsMessage(Send send) {
                copyOnWrite();
                ((Message) this.instance).setSendCoinsMessage(send);
                return this;
            }

            public Builder setSignDirectMessage(SignDirect signDirect) {
                copyOnWrite();
                ((Message) this.instance).setSignDirectMessage(signDirect);
                return this;
            }

            public Builder setStakeMessage(Delegate delegate) {
                copyOnWrite();
                ((Message) this.instance).setStakeMessage(delegate);
                return this;
            }

            public Builder setThorchainSendMessage(THORChainSend tHORChainSend) {
                copyOnWrite();
                ((Message) this.instance).setThorchainSendMessage(tHORChainSend);
                return this;
            }

            public Builder setTransferTokensMessage(Transfer transfer) {
                copyOnWrite();
                ((Message) this.instance).setTransferTokensMessage(transfer);
                return this;
            }

            public Builder setUnstakeMessage(Undelegate undelegate) {
                copyOnWrite();
                ((Message) this.instance).setUnstakeMessage(undelegate);
                return this;
            }

            public Builder setWasmExecuteContractGeneric(WasmExecuteContractGeneric wasmExecuteContractGeneric) {
                copyOnWrite();
                ((Message) this.instance).setWasmExecuteContractGeneric(wasmExecuteContractGeneric);
                return this;
            }

            public Builder setWasmExecuteContractSendMessage(WasmExecuteContractSend wasmExecuteContractSend) {
                copyOnWrite();
                ((Message) this.instance).setWasmExecuteContractSendMessage(wasmExecuteContractSend);
                return this;
            }

            public Builder setWasmExecuteContractTransferMessage(WasmExecuteContractTransfer wasmExecuteContractTransfer) {
                copyOnWrite();
                ((Message) this.instance).setWasmExecuteContractTransferMessage(wasmExecuteContractTransfer);
                return this;
            }

            public Builder setWasmTerraExecuteContractGeneric(WasmTerraExecuteContractGeneric wasmTerraExecuteContractGeneric) {
                copyOnWrite();
                ((Message) this.instance).setWasmTerraExecuteContractGeneric(wasmTerraExecuteContractGeneric);
                return this;
            }

            public Builder setWasmTerraExecuteContractSendMessage(WasmTerraExecuteContractSend wasmTerraExecuteContractSend) {
                copyOnWrite();
                ((Message) this.instance).setWasmTerraExecuteContractSendMessage(wasmTerraExecuteContractSend);
                return this;
            }

            public Builder setWasmTerraExecuteContractTransferMessage(WasmTerraExecuteContractTransfer wasmTerraExecuteContractTransfer) {
                copyOnWrite();
                ((Message) this.instance).setWasmTerraExecuteContractTransferMessage(wasmTerraExecuteContractTransfer);
                return this;
            }

            public Builder setWithdrawStakeRewardMessage(WithdrawDelegationReward withdrawDelegationReward) {
                copyOnWrite();
                ((Message) this.instance).setWithdrawStakeRewardMessage(withdrawDelegationReward);
                return this;
            }

            private Builder() {
                super(Message.DEFAULT_INSTANCE);
            }

            public Builder setAuthGrant(AuthGrant.Builder builder) {
                copyOnWrite();
                ((Message) this.instance).setAuthGrant((AuthGrant) builder.build());
                return this;
            }

            public Builder setAuthRevoke(AuthRevoke.Builder builder) {
                copyOnWrite();
                ((Message) this.instance).setAuthRevoke((AuthRevoke) builder.build());
                return this;
            }

            public Builder setMsgVote(MsgVote.Builder builder) {
                copyOnWrite();
                ((Message) this.instance).setMsgVote((MsgVote) builder.build());
                return this;
            }

            public Builder setRawJsonMessage(RawJSON.Builder builder) {
                copyOnWrite();
                ((Message) this.instance).setRawJsonMessage((RawJSON) builder.build());
                return this;
            }

            public Builder setRestakeMessage(BeginRedelegate.Builder builder) {
                copyOnWrite();
                ((Message) this.instance).setRestakeMessage((BeginRedelegate) builder.build());
                return this;
            }

            public Builder setSendCoinsMessage(Send.Builder builder) {
                copyOnWrite();
                ((Message) this.instance).setSendCoinsMessage((Send) builder.build());
                return this;
            }

            public Builder setSignDirectMessage(SignDirect.Builder builder) {
                copyOnWrite();
                ((Message) this.instance).setSignDirectMessage((SignDirect) builder.build());
                return this;
            }

            public Builder setStakeMessage(Delegate.Builder builder) {
                copyOnWrite();
                ((Message) this.instance).setStakeMessage((Delegate) builder.build());
                return this;
            }

            public Builder setThorchainSendMessage(THORChainSend.Builder builder) {
                copyOnWrite();
                ((Message) this.instance).setThorchainSendMessage((THORChainSend) builder.build());
                return this;
            }

            public Builder setTransferTokensMessage(Transfer.Builder builder) {
                copyOnWrite();
                ((Message) this.instance).setTransferTokensMessage((Transfer) builder.build());
                return this;
            }

            public Builder setUnstakeMessage(Undelegate.Builder builder) {
                copyOnWrite();
                ((Message) this.instance).setUnstakeMessage((Undelegate) builder.build());
                return this;
            }

            public Builder setWasmExecuteContractGeneric(WasmExecuteContractGeneric.Builder builder) {
                copyOnWrite();
                ((Message) this.instance).setWasmExecuteContractGeneric((WasmExecuteContractGeneric) builder.build());
                return this;
            }

            public Builder setWasmExecuteContractSendMessage(WasmExecuteContractSend.Builder builder) {
                copyOnWrite();
                ((Message) this.instance).setWasmExecuteContractSendMessage((WasmExecuteContractSend) builder.build());
                return this;
            }

            public Builder setWasmExecuteContractTransferMessage(WasmExecuteContractTransfer.Builder builder) {
                copyOnWrite();
                ((Message) this.instance).setWasmExecuteContractTransferMessage((WasmExecuteContractTransfer) builder.build());
                return this;
            }

            public Builder setWasmTerraExecuteContractGeneric(WasmTerraExecuteContractGeneric.Builder builder) {
                copyOnWrite();
                ((Message) this.instance).setWasmTerraExecuteContractGeneric((WasmTerraExecuteContractGeneric) builder.build());
                return this;
            }

            public Builder setWasmTerraExecuteContractSendMessage(WasmTerraExecuteContractSend.Builder builder) {
                copyOnWrite();
                ((Message) this.instance).setWasmTerraExecuteContractSendMessage((WasmTerraExecuteContractSend) builder.build());
                return this;
            }

            public Builder setWasmTerraExecuteContractTransferMessage(WasmTerraExecuteContractTransfer.Builder builder) {
                copyOnWrite();
                ((Message) this.instance).setWasmTerraExecuteContractTransferMessage((WasmTerraExecuteContractTransfer) builder.build());
                return this;
            }

            public Builder setWithdrawStakeRewardMessage(WithdrawDelegationReward.Builder builder) {
                copyOnWrite();
                ((Message) this.instance).setWithdrawStakeRewardMessage((WithdrawDelegationReward) builder.build());
                return this;
            }
        }

        public static final class Delegate extends GeneratedMessageLite<Delegate, Builder> implements DelegateOrBuilder {
            public static final int AMOUNT_FIELD_NUMBER = 3;
            /* access modifiers changed from: private */
            public static final Delegate DEFAULT_INSTANCE;
            public static final int DELEGATOR_ADDRESS_FIELD_NUMBER = 1;
            private static volatile im4<Delegate> PARSER = null;
            public static final int TYPE_PREFIX_FIELD_NUMBER = 4;
            public static final int VALIDATOR_ADDRESS_FIELD_NUMBER = 2;
            private Amount amount_;
            private String delegatorAddress_ = "";
            private String typePrefix_ = "";
            private String validatorAddress_ = "";

            public static final class Builder extends GeneratedMessageLite.C4930a<Delegate, Builder> implements DelegateOrBuilder {
                public /* synthetic */ Builder(C97321 r1) {
                    this();
                }

                public Builder clearAmount() {
                    copyOnWrite();
                    ((Delegate) this.instance).clearAmount();
                    return this;
                }

                public Builder clearDelegatorAddress() {
                    copyOnWrite();
                    ((Delegate) this.instance).clearDelegatorAddress();
                    return this;
                }

                public Builder clearTypePrefix() {
                    copyOnWrite();
                    ((Delegate) this.instance).clearTypePrefix();
                    return this;
                }

                public Builder clearValidatorAddress() {
                    copyOnWrite();
                    ((Delegate) this.instance).clearValidatorAddress();
                    return this;
                }

                public Amount getAmount() {
                    return ((Delegate) this.instance).getAmount();
                }

                public String getDelegatorAddress() {
                    return ((Delegate) this.instance).getDelegatorAddress();
                }

                public ByteString getDelegatorAddressBytes() {
                    return ((Delegate) this.instance).getDelegatorAddressBytes();
                }

                public String getTypePrefix() {
                    return ((Delegate) this.instance).getTypePrefix();
                }

                public ByteString getTypePrefixBytes() {
                    return ((Delegate) this.instance).getTypePrefixBytes();
                }

                public String getValidatorAddress() {
                    return ((Delegate) this.instance).getValidatorAddress();
                }

                public ByteString getValidatorAddressBytes() {
                    return ((Delegate) this.instance).getValidatorAddressBytes();
                }

                public boolean hasAmount() {
                    return ((Delegate) this.instance).hasAmount();
                }

                public Builder mergeAmount(Amount amount) {
                    copyOnWrite();
                    ((Delegate) this.instance).mergeAmount(amount);
                    return this;
                }

                public Builder setAmount(Amount amount) {
                    copyOnWrite();
                    ((Delegate) this.instance).setAmount(amount);
                    return this;
                }

                public Builder setDelegatorAddress(String str) {
                    copyOnWrite();
                    ((Delegate) this.instance).setDelegatorAddress(str);
                    return this;
                }

                public Builder setDelegatorAddressBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Delegate) this.instance).setDelegatorAddressBytes(byteString);
                    return this;
                }

                public Builder setTypePrefix(String str) {
                    copyOnWrite();
                    ((Delegate) this.instance).setTypePrefix(str);
                    return this;
                }

                public Builder setTypePrefixBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Delegate) this.instance).setTypePrefixBytes(byteString);
                    return this;
                }

                public Builder setValidatorAddress(String str) {
                    copyOnWrite();
                    ((Delegate) this.instance).setValidatorAddress(str);
                    return this;
                }

                public Builder setValidatorAddressBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Delegate) this.instance).setValidatorAddressBytes(byteString);
                    return this;
                }

                private Builder() {
                    super(Delegate.DEFAULT_INSTANCE);
                }

                public Builder setAmount(Amount.Builder builder) {
                    copyOnWrite();
                    ((Delegate) this.instance).setAmount((Amount) builder.build());
                    return this;
                }
            }

            static {
                Delegate delegate = new Delegate();
                DEFAULT_INSTANCE = delegate;
                GeneratedMessageLite.registerDefaultInstance(Delegate.class, delegate);
            }

            private Delegate() {
            }

            /* access modifiers changed from: private */
            public void clearAmount() {
                this.amount_ = null;
            }

            /* access modifiers changed from: private */
            public void clearDelegatorAddress() {
                this.delegatorAddress_ = getDefaultInstance().getDelegatorAddress();
            }

            /* access modifiers changed from: private */
            public void clearTypePrefix() {
                this.typePrefix_ = getDefaultInstance().getTypePrefix();
            }

            /* access modifiers changed from: private */
            public void clearValidatorAddress() {
                this.validatorAddress_ = getDefaultInstance().getValidatorAddress();
            }

            public static Delegate getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* access modifiers changed from: private */
            public void mergeAmount(Amount amount) {
                amount.getClass();
                Amount amount2 = this.amount_;
                if (amount2 == null || amount2 == Amount.getDefaultInstance()) {
                    this.amount_ = amount;
                } else {
                    this.amount_ = (Amount) ((Amount.Builder) Amount.newBuilder(this.amount_).mergeFrom(amount)).buildPartial();
                }
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static Delegate parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Delegate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Delegate parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Delegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<Delegate> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setAmount(Amount amount) {
                amount.getClass();
                this.amount_ = amount;
            }

            /* access modifiers changed from: private */
            public void setDelegatorAddress(String str) {
                str.getClass();
                this.delegatorAddress_ = str;
            }

            /* access modifiers changed from: private */
            public void setDelegatorAddressBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.delegatorAddress_ = byteString.toStringUtf8();
            }

            /* access modifiers changed from: private */
            public void setTypePrefix(String str) {
                str.getClass();
                this.typePrefix_ = str;
            }

            /* access modifiers changed from: private */
            public void setTypePrefixBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.typePrefix_ = byteString.toStringUtf8();
            }

            /* access modifiers changed from: private */
            public void setValidatorAddress(String str) {
                str.getClass();
                this.validatorAddress_ = str;
            }

            /* access modifiers changed from: private */
            public void setValidatorAddressBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.validatorAddress_ = byteString.toStringUtf8();
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97321.f46548xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Delegate();
                    case 2:
                        return new Builder((C97321) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\t\u0004Ȉ", new Object[]{"delegatorAddress_", "validatorAddress_", "amount_", "typePrefix_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<Delegate> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (Delegate.class) {
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

            public Amount getAmount() {
                Amount amount = this.amount_;
                if (amount == null) {
                    return Amount.getDefaultInstance();
                }
                return amount;
            }

            public String getDelegatorAddress() {
                return this.delegatorAddress_;
            }

            public ByteString getDelegatorAddressBytes() {
                return ByteString.copyFromUtf8(this.delegatorAddress_);
            }

            public String getTypePrefix() {
                return this.typePrefix_;
            }

            public ByteString getTypePrefixBytes() {
                return ByteString.copyFromUtf8(this.typePrefix_);
            }

            public String getValidatorAddress() {
                return this.validatorAddress_;
            }

            public ByteString getValidatorAddressBytes() {
                return ByteString.copyFromUtf8(this.validatorAddress_);
            }

            public boolean hasAmount() {
                if (this.amount_ != null) {
                    return true;
                }
                return false;
            }

            public static Builder newBuilder(Delegate delegate) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(delegate);
            }

            public static Delegate parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (Delegate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static Delegate parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (Delegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static Delegate parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Delegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Delegate parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (Delegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static Delegate parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Delegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Delegate parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (Delegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static Delegate parseFrom(InputStream inputStream) throws IOException {
                return (Delegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Delegate parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (Delegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static Delegate parseFrom(C4969g gVar) throws IOException {
                return (Delegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static Delegate parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (Delegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public interface DelegateOrBuilder extends qu3 {
            Amount getAmount();

            /* synthetic */ C4956c0 getDefaultInstanceForType();

            String getDelegatorAddress();

            ByteString getDelegatorAddressBytes();

            String getTypePrefix();

            ByteString getTypePrefixBytes();

            String getValidatorAddress();

            ByteString getValidatorAddressBytes();

            boolean hasAmount();

            /* synthetic */ boolean isInitialized();
        }

        public enum MessageOneofCase {
            SEND_COINS_MESSAGE(1),
            TRANSFER_TOKENS_MESSAGE(2),
            STAKE_MESSAGE(3),
            UNSTAKE_MESSAGE(4),
            RESTAKE_MESSAGE(5),
            WITHDRAW_STAKE_REWARD_MESSAGE(6),
            RAW_JSON_MESSAGE(7),
            WASM_TERRA_EXECUTE_CONTRACT_TRANSFER_MESSAGE(8),
            WASM_TERRA_EXECUTE_CONTRACT_SEND_MESSAGE(9),
            THORCHAIN_SEND_MESSAGE(10),
            WASM_TERRA_EXECUTE_CONTRACT_GENERIC(11),
            WASM_EXECUTE_CONTRACT_TRANSFER_MESSAGE(12),
            WASM_EXECUTE_CONTRACT_SEND_MESSAGE(13),
            WASM_EXECUTE_CONTRACT_GENERIC(14),
            SIGN_DIRECT_MESSAGE(15),
            AUTH_GRANT(16),
            AUTH_REVOKE(17),
            MSG_VOTE(18),
            MESSAGEONEOF_NOT_SET(0);
            
            private final int value;

            private MessageOneofCase(int i) {
                this.value = i;
            }

            public static MessageOneofCase forNumber(int i) {
                switch (i) {
                    case 0:
                        return MESSAGEONEOF_NOT_SET;
                    case 1:
                        return SEND_COINS_MESSAGE;
                    case 2:
                        return TRANSFER_TOKENS_MESSAGE;
                    case 3:
                        return STAKE_MESSAGE;
                    case 4:
                        return UNSTAKE_MESSAGE;
                    case 5:
                        return RESTAKE_MESSAGE;
                    case 6:
                        return WITHDRAW_STAKE_REWARD_MESSAGE;
                    case 7:
                        return RAW_JSON_MESSAGE;
                    case 8:
                        return WASM_TERRA_EXECUTE_CONTRACT_TRANSFER_MESSAGE;
                    case 9:
                        return WASM_TERRA_EXECUTE_CONTRACT_SEND_MESSAGE;
                    case 10:
                        return THORCHAIN_SEND_MESSAGE;
                    case 11:
                        return WASM_TERRA_EXECUTE_CONTRACT_GENERIC;
                    case 12:
                        return WASM_EXECUTE_CONTRACT_TRANSFER_MESSAGE;
                    case 13:
                        return WASM_EXECUTE_CONTRACT_SEND_MESSAGE;
                    case 14:
                        return WASM_EXECUTE_CONTRACT_GENERIC;
                    case 15:
                        return SIGN_DIRECT_MESSAGE;
                    case 16:
                        return AUTH_GRANT;
                    case 17:
                        return AUTH_REVOKE;
                    case 18:
                        return MSG_VOTE;
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

        public static final class MsgVote extends GeneratedMessageLite<MsgVote, Builder> implements MsgVoteOrBuilder {
            /* access modifiers changed from: private */
            public static final MsgVote DEFAULT_INSTANCE;
            public static final int OPTION_FIELD_NUMBER = 3;
            private static volatile im4<MsgVote> PARSER = null;
            public static final int PROPOSAL_ID_FIELD_NUMBER = 1;
            public static final int VOTER_FIELD_NUMBER = 2;
            private int option_;
            private long proposalId_;
            private String voter_ = "";

            public static final class Builder extends GeneratedMessageLite.C4930a<MsgVote, Builder> implements MsgVoteOrBuilder {
                public /* synthetic */ Builder(C97321 r1) {
                    this();
                }

                public Builder clearOption() {
                    copyOnWrite();
                    ((MsgVote) this.instance).clearOption();
                    return this;
                }

                public Builder clearProposalId() {
                    copyOnWrite();
                    ((MsgVote) this.instance).clearProposalId();
                    return this;
                }

                public Builder clearVoter() {
                    copyOnWrite();
                    ((MsgVote) this.instance).clearVoter();
                    return this;
                }

                public VoteOption getOption() {
                    return ((MsgVote) this.instance).getOption();
                }

                public int getOptionValue() {
                    return ((MsgVote) this.instance).getOptionValue();
                }

                public long getProposalId() {
                    return ((MsgVote) this.instance).getProposalId();
                }

                public String getVoter() {
                    return ((MsgVote) this.instance).getVoter();
                }

                public ByteString getVoterBytes() {
                    return ((MsgVote) this.instance).getVoterBytes();
                }

                public Builder setOption(VoteOption voteOption) {
                    copyOnWrite();
                    ((MsgVote) this.instance).setOption(voteOption);
                    return this;
                }

                public Builder setOptionValue(int i) {
                    copyOnWrite();
                    ((MsgVote) this.instance).setOptionValue(i);
                    return this;
                }

                public Builder setProposalId(long j) {
                    copyOnWrite();
                    ((MsgVote) this.instance).setProposalId(j);
                    return this;
                }

                public Builder setVoter(String str) {
                    copyOnWrite();
                    ((MsgVote) this.instance).setVoter(str);
                    return this;
                }

                public Builder setVoterBytes(ByteString byteString) {
                    copyOnWrite();
                    ((MsgVote) this.instance).setVoterBytes(byteString);
                    return this;
                }

                private Builder() {
                    super(MsgVote.DEFAULT_INSTANCE);
                }
            }

            static {
                MsgVote msgVote = new MsgVote();
                DEFAULT_INSTANCE = msgVote;
                GeneratedMessageLite.registerDefaultInstance(MsgVote.class, msgVote);
            }

            private MsgVote() {
            }

            /* access modifiers changed from: private */
            public void clearOption() {
                this.option_ = 0;
            }

            /* access modifiers changed from: private */
            public void clearProposalId() {
                this.proposalId_ = 0;
            }

            /* access modifiers changed from: private */
            public void clearVoter() {
                this.voter_ = getDefaultInstance().getVoter();
            }

            public static MsgVote getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static MsgVote parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (MsgVote) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static MsgVote parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (MsgVote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<MsgVote> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setOption(VoteOption voteOption) {
                this.option_ = voteOption.getNumber();
            }

            /* access modifiers changed from: private */
            public void setOptionValue(int i) {
                this.option_ = i;
            }

            /* access modifiers changed from: private */
            public void setProposalId(long j) {
                this.proposalId_ = j;
            }

            /* access modifiers changed from: private */
            public void setVoter(String str) {
                str.getClass();
                this.voter_ = str;
            }

            /* access modifiers changed from: private */
            public void setVoterBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.voter_ = byteString.toStringUtf8();
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97321.f46548xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new MsgVote();
                    case 2:
                        return new Builder((C97321) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0003\u0002Ȉ\u0003\f", new Object[]{"proposalId_", "voter_", "option_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<MsgVote> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (MsgVote.class) {
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

            public VoteOption getOption() {
                VoteOption forNumber = VoteOption.forNumber(this.option_);
                if (forNumber == null) {
                    return VoteOption.UNRECOGNIZED;
                }
                return forNumber;
            }

            public int getOptionValue() {
                return this.option_;
            }

            public long getProposalId() {
                return this.proposalId_;
            }

            public String getVoter() {
                return this.voter_;
            }

            public ByteString getVoterBytes() {
                return ByteString.copyFromUtf8(this.voter_);
            }

            public static Builder newBuilder(MsgVote msgVote) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(msgVote);
            }

            public static MsgVote parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (MsgVote) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static MsgVote parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (MsgVote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static MsgVote parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (MsgVote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static MsgVote parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (MsgVote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static MsgVote parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (MsgVote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static MsgVote parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (MsgVote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static MsgVote parseFrom(InputStream inputStream) throws IOException {
                return (MsgVote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static MsgVote parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (MsgVote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static MsgVote parseFrom(C4969g gVar) throws IOException {
                return (MsgVote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static MsgVote parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (MsgVote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public interface MsgVoteOrBuilder extends qu3 {
            /* synthetic */ C4956c0 getDefaultInstanceForType();

            VoteOption getOption();

            int getOptionValue();

            long getProposalId();

            String getVoter();

            ByteString getVoterBytes();

            /* synthetic */ boolean isInitialized();
        }

        public static final class RawJSON extends GeneratedMessageLite<RawJSON, Builder> implements RawJSONOrBuilder {
            /* access modifiers changed from: private */
            public static final RawJSON DEFAULT_INSTANCE;
            private static volatile im4<RawJSON> PARSER = null;
            public static final int TYPE_FIELD_NUMBER = 1;
            public static final int VALUE_FIELD_NUMBER = 2;
            private String type_ = "";
            private String value_ = "";

            public static final class Builder extends GeneratedMessageLite.C4930a<RawJSON, Builder> implements RawJSONOrBuilder {
                public /* synthetic */ Builder(C97321 r1) {
                    this();
                }

                public Builder clearType() {
                    copyOnWrite();
                    ((RawJSON) this.instance).clearType();
                    return this;
                }

                public Builder clearValue() {
                    copyOnWrite();
                    ((RawJSON) this.instance).clearValue();
                    return this;
                }

                public String getType() {
                    return ((RawJSON) this.instance).getType();
                }

                public ByteString getTypeBytes() {
                    return ((RawJSON) this.instance).getTypeBytes();
                }

                public String getValue() {
                    return ((RawJSON) this.instance).getValue();
                }

                public ByteString getValueBytes() {
                    return ((RawJSON) this.instance).getValueBytes();
                }

                public Builder setType(String str) {
                    copyOnWrite();
                    ((RawJSON) this.instance).setType(str);
                    return this;
                }

                public Builder setTypeBytes(ByteString byteString) {
                    copyOnWrite();
                    ((RawJSON) this.instance).setTypeBytes(byteString);
                    return this;
                }

                public Builder setValue(String str) {
                    copyOnWrite();
                    ((RawJSON) this.instance).setValue(str);
                    return this;
                }

                public Builder setValueBytes(ByteString byteString) {
                    copyOnWrite();
                    ((RawJSON) this.instance).setValueBytes(byteString);
                    return this;
                }

                private Builder() {
                    super(RawJSON.DEFAULT_INSTANCE);
                }
            }

            static {
                RawJSON rawJSON = new RawJSON();
                DEFAULT_INSTANCE = rawJSON;
                GeneratedMessageLite.registerDefaultInstance(RawJSON.class, rawJSON);
            }

            private RawJSON() {
            }

            /* access modifiers changed from: private */
            public void clearType() {
                this.type_ = getDefaultInstance().getType();
            }

            /* access modifiers changed from: private */
            public void clearValue() {
                this.value_ = getDefaultInstance().getValue();
            }

            public static RawJSON getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static RawJSON parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (RawJSON) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static RawJSON parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (RawJSON) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<RawJSON> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setType(String str) {
                str.getClass();
                this.type_ = str;
            }

            /* access modifiers changed from: private */
            public void setTypeBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.type_ = byteString.toStringUtf8();
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
                switch (C97321.f46548xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new RawJSON();
                    case 2:
                        return new Builder((C97321) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"type_", "value_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<RawJSON> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (RawJSON.class) {
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

            public String getType() {
                return this.type_;
            }

            public ByteString getTypeBytes() {
                return ByteString.copyFromUtf8(this.type_);
            }

            public String getValue() {
                return this.value_;
            }

            public ByteString getValueBytes() {
                return ByteString.copyFromUtf8(this.value_);
            }

            public static Builder newBuilder(RawJSON rawJSON) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(rawJSON);
            }

            public static RawJSON parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (RawJSON) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static RawJSON parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (RawJSON) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static RawJSON parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (RawJSON) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static RawJSON parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (RawJSON) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static RawJSON parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (RawJSON) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static RawJSON parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (RawJSON) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static RawJSON parseFrom(InputStream inputStream) throws IOException {
                return (RawJSON) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static RawJSON parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (RawJSON) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static RawJSON parseFrom(C4969g gVar) throws IOException {
                return (RawJSON) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static RawJSON parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (RawJSON) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public interface RawJSONOrBuilder extends qu3 {
            /* synthetic */ C4956c0 getDefaultInstanceForType();

            String getType();

            ByteString getTypeBytes();

            String getValue();

            ByteString getValueBytes();

            /* synthetic */ boolean isInitialized();
        }

        public static final class Send extends GeneratedMessageLite<Send, Builder> implements SendOrBuilder {
            public static final int AMOUNTS_FIELD_NUMBER = 3;
            /* access modifiers changed from: private */
            public static final Send DEFAULT_INSTANCE;
            public static final int FROM_ADDRESS_FIELD_NUMBER = 1;
            private static volatile im4<Send> PARSER = null;
            public static final int TO_ADDRESS_FIELD_NUMBER = 2;
            public static final int TYPE_PREFIX_FIELD_NUMBER = 4;
            private C5011t.C5020i<Amount> amounts_ = GeneratedMessageLite.emptyProtobufList();
            private String fromAddress_ = "";
            private String toAddress_ = "";
            private String typePrefix_ = "";

            public static final class Builder extends GeneratedMessageLite.C4930a<Send, Builder> implements SendOrBuilder {
                public /* synthetic */ Builder(C97321 r1) {
                    this();
                }

                public Builder addAllAmounts(Iterable<? extends Amount> iterable) {
                    copyOnWrite();
                    ((Send) this.instance).addAllAmounts(iterable);
                    return this;
                }

                public Builder addAmounts(Amount amount) {
                    copyOnWrite();
                    ((Send) this.instance).addAmounts(amount);
                    return this;
                }

                public Builder clearAmounts() {
                    copyOnWrite();
                    ((Send) this.instance).clearAmounts();
                    return this;
                }

                public Builder clearFromAddress() {
                    copyOnWrite();
                    ((Send) this.instance).clearFromAddress();
                    return this;
                }

                public Builder clearToAddress() {
                    copyOnWrite();
                    ((Send) this.instance).clearToAddress();
                    return this;
                }

                public Builder clearTypePrefix() {
                    copyOnWrite();
                    ((Send) this.instance).clearTypePrefix();
                    return this;
                }

                public Amount getAmounts(int i) {
                    return ((Send) this.instance).getAmounts(i);
                }

                public int getAmountsCount() {
                    return ((Send) this.instance).getAmountsCount();
                }

                public List<Amount> getAmountsList() {
                    return Collections.unmodifiableList(((Send) this.instance).getAmountsList());
                }

                public String getFromAddress() {
                    return ((Send) this.instance).getFromAddress();
                }

                public ByteString getFromAddressBytes() {
                    return ((Send) this.instance).getFromAddressBytes();
                }

                public String getToAddress() {
                    return ((Send) this.instance).getToAddress();
                }

                public ByteString getToAddressBytes() {
                    return ((Send) this.instance).getToAddressBytes();
                }

                public String getTypePrefix() {
                    return ((Send) this.instance).getTypePrefix();
                }

                public ByteString getTypePrefixBytes() {
                    return ((Send) this.instance).getTypePrefixBytes();
                }

                public Builder removeAmounts(int i) {
                    copyOnWrite();
                    ((Send) this.instance).removeAmounts(i);
                    return this;
                }

                public Builder setAmounts(int i, Amount amount) {
                    copyOnWrite();
                    ((Send) this.instance).setAmounts(i, amount);
                    return this;
                }

                public Builder setFromAddress(String str) {
                    copyOnWrite();
                    ((Send) this.instance).setFromAddress(str);
                    return this;
                }

                public Builder setFromAddressBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Send) this.instance).setFromAddressBytes(byteString);
                    return this;
                }

                public Builder setToAddress(String str) {
                    copyOnWrite();
                    ((Send) this.instance).setToAddress(str);
                    return this;
                }

                public Builder setToAddressBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Send) this.instance).setToAddressBytes(byteString);
                    return this;
                }

                public Builder setTypePrefix(String str) {
                    copyOnWrite();
                    ((Send) this.instance).setTypePrefix(str);
                    return this;
                }

                public Builder setTypePrefixBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Send) this.instance).setTypePrefixBytes(byteString);
                    return this;
                }

                private Builder() {
                    super(Send.DEFAULT_INSTANCE);
                }

                public Builder addAmounts(int i, Amount amount) {
                    copyOnWrite();
                    ((Send) this.instance).addAmounts(i, amount);
                    return this;
                }

                public Builder setAmounts(int i, Amount.Builder builder) {
                    copyOnWrite();
                    ((Send) this.instance).setAmounts(i, (Amount) builder.build());
                    return this;
                }

                public Builder addAmounts(Amount.Builder builder) {
                    copyOnWrite();
                    ((Send) this.instance).addAmounts((Amount) builder.build());
                    return this;
                }

                public Builder addAmounts(int i, Amount.Builder builder) {
                    copyOnWrite();
                    ((Send) this.instance).addAmounts(i, (Amount) builder.build());
                    return this;
                }
            }

            static {
                Send send = new Send();
                DEFAULT_INSTANCE = send;
                GeneratedMessageLite.registerDefaultInstance(Send.class, send);
            }

            private Send() {
            }

            /* access modifiers changed from: private */
            public void addAllAmounts(Iterable<? extends Amount> iterable) {
                ensureAmountsIsMutable();
                C4949a.addAll(iterable, this.amounts_);
            }

            /* access modifiers changed from: private */
            public void addAmounts(Amount amount) {
                amount.getClass();
                ensureAmountsIsMutable();
                this.amounts_.add(amount);
            }

            /* access modifiers changed from: private */
            public void clearAmounts() {
                this.amounts_ = GeneratedMessageLite.emptyProtobufList();
            }

            /* access modifiers changed from: private */
            public void clearFromAddress() {
                this.fromAddress_ = getDefaultInstance().getFromAddress();
            }

            /* access modifiers changed from: private */
            public void clearToAddress() {
                this.toAddress_ = getDefaultInstance().getToAddress();
            }

            /* access modifiers changed from: private */
            public void clearTypePrefix() {
                this.typePrefix_ = getDefaultInstance().getTypePrefix();
            }

            private void ensureAmountsIsMutable() {
                C5011t.C5020i<Amount> iVar = this.amounts_;
                if (!iVar.mo37090v()) {
                    this.amounts_ = GeneratedMessageLite.mutableCopy(iVar);
                }
            }

            public static Send getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static Send parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Send) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Send parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<Send> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void removeAmounts(int i) {
                ensureAmountsIsMutable();
                this.amounts_.remove(i);
            }

            /* access modifiers changed from: private */
            public void setAmounts(int i, Amount amount) {
                amount.getClass();
                ensureAmountsIsMutable();
                this.amounts_.set(i, amount);
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
            public void setTypePrefix(String str) {
                str.getClass();
                this.typePrefix_ = str;
            }

            /* access modifiers changed from: private */
            public void setTypePrefixBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.typePrefix_ = byteString.toStringUtf8();
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97321.f46548xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Send();
                    case 2:
                        return new Builder((C97321) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004Ȉ", new Object[]{"fromAddress_", "toAddress_", "amounts_", Amount.class, "typePrefix_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<Send> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (Send.class) {
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

            public Amount getAmounts(int i) {
                return this.amounts_.get(i);
            }

            public int getAmountsCount() {
                return this.amounts_.size();
            }

            public List<Amount> getAmountsList() {
                return this.amounts_;
            }

            public AmountOrBuilder getAmountsOrBuilder(int i) {
                return this.amounts_.get(i);
            }

            public List<? extends AmountOrBuilder> getAmountsOrBuilderList() {
                return this.amounts_;
            }

            public String getFromAddress() {
                return this.fromAddress_;
            }

            public ByteString getFromAddressBytes() {
                return ByteString.copyFromUtf8(this.fromAddress_);
            }

            public String getToAddress() {
                return this.toAddress_;
            }

            public ByteString getToAddressBytes() {
                return ByteString.copyFromUtf8(this.toAddress_);
            }

            public String getTypePrefix() {
                return this.typePrefix_;
            }

            public ByteString getTypePrefixBytes() {
                return ByteString.copyFromUtf8(this.typePrefix_);
            }

            public static Builder newBuilder(Send send) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(send);
            }

            public static Send parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (Send) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static Send parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (Send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static Send parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            /* access modifiers changed from: private */
            public void addAmounts(int i, Amount amount) {
                amount.getClass();
                ensureAmountsIsMutable();
                this.amounts_.add(i, amount);
            }

            public static Send parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (Send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static Send parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Send parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (Send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static Send parseFrom(InputStream inputStream) throws IOException {
                return (Send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Send parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (Send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static Send parseFrom(C4969g gVar) throws IOException {
                return (Send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static Send parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (Send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public interface SendOrBuilder extends qu3 {
            Amount getAmounts(int i);

            int getAmountsCount();

            List<Amount> getAmountsList();

            /* synthetic */ C4956c0 getDefaultInstanceForType();

            String getFromAddress();

            ByteString getFromAddressBytes();

            String getToAddress();

            ByteString getToAddressBytes();

            String getTypePrefix();

            ByteString getTypePrefixBytes();

            /* synthetic */ boolean isInitialized();
        }

        public static final class SignDirect extends GeneratedMessageLite<SignDirect, Builder> implements SignDirectOrBuilder {
            public static final int AUTH_INFO_BYTES_FIELD_NUMBER = 2;
            public static final int BODY_BYTES_FIELD_NUMBER = 1;
            /* access modifiers changed from: private */
            public static final SignDirect DEFAULT_INSTANCE;
            private static volatile im4<SignDirect> PARSER;
            private ByteString authInfoBytes_;
            private ByteString bodyBytes_;

            public static final class Builder extends GeneratedMessageLite.C4930a<SignDirect, Builder> implements SignDirectOrBuilder {
                public /* synthetic */ Builder(C97321 r1) {
                    this();
                }

                public Builder clearAuthInfoBytes() {
                    copyOnWrite();
                    ((SignDirect) this.instance).clearAuthInfoBytes();
                    return this;
                }

                public Builder clearBodyBytes() {
                    copyOnWrite();
                    ((SignDirect) this.instance).clearBodyBytes();
                    return this;
                }

                public ByteString getAuthInfoBytes() {
                    return ((SignDirect) this.instance).getAuthInfoBytes();
                }

                public ByteString getBodyBytes() {
                    return ((SignDirect) this.instance).getBodyBytes();
                }

                public Builder setAuthInfoBytes(ByteString byteString) {
                    copyOnWrite();
                    ((SignDirect) this.instance).setAuthInfoBytes(byteString);
                    return this;
                }

                public Builder setBodyBytes(ByteString byteString) {
                    copyOnWrite();
                    ((SignDirect) this.instance).setBodyBytes(byteString);
                    return this;
                }

                private Builder() {
                    super(SignDirect.DEFAULT_INSTANCE);
                }
            }

            static {
                SignDirect signDirect = new SignDirect();
                DEFAULT_INSTANCE = signDirect;
                GeneratedMessageLite.registerDefaultInstance(SignDirect.class, signDirect);
            }

            private SignDirect() {
                ByteString byteString = ByteString.EMPTY;
                this.bodyBytes_ = byteString;
                this.authInfoBytes_ = byteString;
            }

            /* access modifiers changed from: private */
            public void clearAuthInfoBytes() {
                this.authInfoBytes_ = getDefaultInstance().getAuthInfoBytes();
            }

            /* access modifiers changed from: private */
            public void clearBodyBytes() {
                this.bodyBytes_ = getDefaultInstance().getBodyBytes();
            }

            public static SignDirect getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static SignDirect parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (SignDirect) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SignDirect parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (SignDirect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<SignDirect> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setAuthInfoBytes(ByteString byteString) {
                byteString.getClass();
                this.authInfoBytes_ = byteString;
            }

            /* access modifiers changed from: private */
            public void setBodyBytes(ByteString byteString) {
                byteString.getClass();
                this.bodyBytes_ = byteString;
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97321.f46548xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new SignDirect();
                    case 2:
                        return new Builder((C97321) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\n", new Object[]{"bodyBytes_", "authInfoBytes_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<SignDirect> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (SignDirect.class) {
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

            public ByteString getAuthInfoBytes() {
                return this.authInfoBytes_;
            }

            public ByteString getBodyBytes() {
                return this.bodyBytes_;
            }

            public static Builder newBuilder(SignDirect signDirect) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(signDirect);
            }

            public static SignDirect parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (SignDirect) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static SignDirect parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (SignDirect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static SignDirect parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (SignDirect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static SignDirect parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (SignDirect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static SignDirect parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (SignDirect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static SignDirect parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (SignDirect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static SignDirect parseFrom(InputStream inputStream) throws IOException {
                return (SignDirect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SignDirect parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (SignDirect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static SignDirect parseFrom(C4969g gVar) throws IOException {
                return (SignDirect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static SignDirect parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (SignDirect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public interface SignDirectOrBuilder extends qu3 {
            ByteString getAuthInfoBytes();

            ByteString getBodyBytes();

            /* synthetic */ C4956c0 getDefaultInstanceForType();

            /* synthetic */ boolean isInitialized();
        }

        public static final class StakeAuthorization extends GeneratedMessageLite<StakeAuthorization, Builder> implements StakeAuthorizationOrBuilder {
            public static final int ALLOW_LIST_FIELD_NUMBER = 2;
            public static final int AUTHORIZATION_TYPE_FIELD_NUMBER = 4;
            /* access modifiers changed from: private */
            public static final StakeAuthorization DEFAULT_INSTANCE;
            public static final int DENY_LIST_FIELD_NUMBER = 3;
            public static final int MAX_TOKENS_FIELD_NUMBER = 1;
            private static volatile im4<StakeAuthorization> PARSER;
            private int authorizationType_;
            private Amount maxTokens_;
            private int validatorsCase_ = 0;
            private Object validators_;

            public static final class Builder extends GeneratedMessageLite.C4930a<StakeAuthorization, Builder> implements StakeAuthorizationOrBuilder {
                public /* synthetic */ Builder(C97321 r1) {
                    this();
                }

                public Builder clearAllowList() {
                    copyOnWrite();
                    ((StakeAuthorization) this.instance).clearAllowList();
                    return this;
                }

                public Builder clearAuthorizationType() {
                    copyOnWrite();
                    ((StakeAuthorization) this.instance).clearAuthorizationType();
                    return this;
                }

                public Builder clearDenyList() {
                    copyOnWrite();
                    ((StakeAuthorization) this.instance).clearDenyList();
                    return this;
                }

                public Builder clearMaxTokens() {
                    copyOnWrite();
                    ((StakeAuthorization) this.instance).clearMaxTokens();
                    return this;
                }

                public Builder clearValidators() {
                    copyOnWrite();
                    ((StakeAuthorization) this.instance).clearValidators();
                    return this;
                }

                public Validators getAllowList() {
                    return ((StakeAuthorization) this.instance).getAllowList();
                }

                public AuthorizationType getAuthorizationType() {
                    return ((StakeAuthorization) this.instance).getAuthorizationType();
                }

                public int getAuthorizationTypeValue() {
                    return ((StakeAuthorization) this.instance).getAuthorizationTypeValue();
                }

                public Validators getDenyList() {
                    return ((StakeAuthorization) this.instance).getDenyList();
                }

                public Amount getMaxTokens() {
                    return ((StakeAuthorization) this.instance).getMaxTokens();
                }

                public ValidatorsCase getValidatorsCase() {
                    return ((StakeAuthorization) this.instance).getValidatorsCase();
                }

                public boolean hasAllowList() {
                    return ((StakeAuthorization) this.instance).hasAllowList();
                }

                public boolean hasDenyList() {
                    return ((StakeAuthorization) this.instance).hasDenyList();
                }

                public boolean hasMaxTokens() {
                    return ((StakeAuthorization) this.instance).hasMaxTokens();
                }

                public Builder mergeAllowList(Validators validators) {
                    copyOnWrite();
                    ((StakeAuthorization) this.instance).mergeAllowList(validators);
                    return this;
                }

                public Builder mergeDenyList(Validators validators) {
                    copyOnWrite();
                    ((StakeAuthorization) this.instance).mergeDenyList(validators);
                    return this;
                }

                public Builder mergeMaxTokens(Amount amount) {
                    copyOnWrite();
                    ((StakeAuthorization) this.instance).mergeMaxTokens(amount);
                    return this;
                }

                public Builder setAllowList(Validators validators) {
                    copyOnWrite();
                    ((StakeAuthorization) this.instance).setAllowList(validators);
                    return this;
                }

                public Builder setAuthorizationType(AuthorizationType authorizationType) {
                    copyOnWrite();
                    ((StakeAuthorization) this.instance).setAuthorizationType(authorizationType);
                    return this;
                }

                public Builder setAuthorizationTypeValue(int i) {
                    copyOnWrite();
                    ((StakeAuthorization) this.instance).setAuthorizationTypeValue(i);
                    return this;
                }

                public Builder setDenyList(Validators validators) {
                    copyOnWrite();
                    ((StakeAuthorization) this.instance).setDenyList(validators);
                    return this;
                }

                public Builder setMaxTokens(Amount amount) {
                    copyOnWrite();
                    ((StakeAuthorization) this.instance).setMaxTokens(amount);
                    return this;
                }

                private Builder() {
                    super(StakeAuthorization.DEFAULT_INSTANCE);
                }

                public Builder setAllowList(Validators.Builder builder) {
                    copyOnWrite();
                    ((StakeAuthorization) this.instance).setAllowList((Validators) builder.build());
                    return this;
                }

                public Builder setDenyList(Validators.Builder builder) {
                    copyOnWrite();
                    ((StakeAuthorization) this.instance).setDenyList((Validators) builder.build());
                    return this;
                }

                public Builder setMaxTokens(Amount.Builder builder) {
                    copyOnWrite();
                    ((StakeAuthorization) this.instance).setMaxTokens((Amount) builder.build());
                    return this;
                }
            }

            public static final class Validators extends GeneratedMessageLite<Validators, Builder> implements ValidatorsOrBuilder {
                public static final int ADDRESS_FIELD_NUMBER = 1;
                /* access modifiers changed from: private */
                public static final Validators DEFAULT_INSTANCE;
                private static volatile im4<Validators> PARSER;
                private C5011t.C5020i<String> address_ = GeneratedMessageLite.emptyProtobufList();

                public static final class Builder extends GeneratedMessageLite.C4930a<Validators, Builder> implements ValidatorsOrBuilder {
                    public /* synthetic */ Builder(C97321 r1) {
                        this();
                    }

                    public Builder addAddress(String str) {
                        copyOnWrite();
                        ((Validators) this.instance).addAddress(str);
                        return this;
                    }

                    public Builder addAddressBytes(ByteString byteString) {
                        copyOnWrite();
                        ((Validators) this.instance).addAddressBytes(byteString);
                        return this;
                    }

                    public Builder addAllAddress(Iterable<String> iterable) {
                        copyOnWrite();
                        ((Validators) this.instance).addAllAddress(iterable);
                        return this;
                    }

                    public Builder clearAddress() {
                        copyOnWrite();
                        ((Validators) this.instance).clearAddress();
                        return this;
                    }

                    public String getAddress(int i) {
                        return ((Validators) this.instance).getAddress(i);
                    }

                    public ByteString getAddressBytes(int i) {
                        return ((Validators) this.instance).getAddressBytes(i);
                    }

                    public int getAddressCount() {
                        return ((Validators) this.instance).getAddressCount();
                    }

                    public List<String> getAddressList() {
                        return Collections.unmodifiableList(((Validators) this.instance).getAddressList());
                    }

                    public Builder setAddress(int i, String str) {
                        copyOnWrite();
                        ((Validators) this.instance).setAddress(i, str);
                        return this;
                    }

                    private Builder() {
                        super(Validators.DEFAULT_INSTANCE);
                    }
                }

                static {
                    Validators validators = new Validators();
                    DEFAULT_INSTANCE = validators;
                    GeneratedMessageLite.registerDefaultInstance(Validators.class, validators);
                }

                private Validators() {
                }

                /* access modifiers changed from: private */
                public void addAddress(String str) {
                    str.getClass();
                    ensureAddressIsMutable();
                    this.address_.add(str);
                }

                /* access modifiers changed from: private */
                public void addAddressBytes(ByteString byteString) {
                    C4949a.checkByteStringIsUtf8(byteString);
                    ensureAddressIsMutable();
                    this.address_.add(byteString.toStringUtf8());
                }

                /* access modifiers changed from: private */
                public void addAllAddress(Iterable<String> iterable) {
                    ensureAddressIsMutable();
                    C4949a.addAll(iterable, this.address_);
                }

                /* access modifiers changed from: private */
                public void clearAddress() {
                    this.address_ = GeneratedMessageLite.emptyProtobufList();
                }

                private void ensureAddressIsMutable() {
                    C5011t.C5020i<String> iVar = this.address_;
                    if (!iVar.mo37090v()) {
                        this.address_ = GeneratedMessageLite.mutableCopy(iVar);
                    }
                }

                public static Validators getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static Builder newBuilder() {
                    return (Builder) DEFAULT_INSTANCE.createBuilder();
                }

                public static Validators parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (Validators) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static Validators parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return (Validators) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static im4<Validators> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                /* access modifiers changed from: private */
                public void setAddress(int i, String str) {
                    str.getClass();
                    ensureAddressIsMutable();
                    this.address_.set(i, str);
                }

                public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                    switch (C97321.f46548xa1df5c61[methodToInvoke.ordinal()]) {
                        case 1:
                            return new Validators();
                        case 2:
                            return new Builder((C97321) null);
                        case 3:
                            return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"address_"});
                        case 4:
                            return DEFAULT_INSTANCE;
                        case 5:
                            im4<Validators> im4 = PARSER;
                            if (im4 == null) {
                                synchronized (Validators.class) {
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

                public String getAddress(int i) {
                    return this.address_.get(i);
                }

                public ByteString getAddressBytes(int i) {
                    return ByteString.copyFromUtf8(this.address_.get(i));
                }

                public int getAddressCount() {
                    return this.address_.size();
                }

                public List<String> getAddressList() {
                    return this.address_;
                }

                public static Builder newBuilder(Validators validators) {
                    return (Builder) DEFAULT_INSTANCE.createBuilder(validators);
                }

                public static Validators parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                    return (Validators) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
                }

                public static Validators parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                    return (Validators) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
                }

                public static Validators parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return (Validators) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                }

                public static Validators parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                    return (Validators) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
                }

                public static Validators parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return (Validators) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static Validators parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                    return (Validators) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
                }

                public static Validators parseFrom(InputStream inputStream) throws IOException {
                    return (Validators) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static Validators parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                    return (Validators) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
                }

                public static Validators parseFrom(C4969g gVar) throws IOException {
                    return (Validators) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
                }

                public static Validators parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                    return (Validators) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
                }
            }

            public enum ValidatorsCase {
                ALLOW_LIST(2),
                DENY_LIST(3),
                VALIDATORS_NOT_SET(0);
                
                private final int value;

                private ValidatorsCase(int i) {
                    this.value = i;
                }

                public static ValidatorsCase forNumber(int i) {
                    if (i == 0) {
                        return VALIDATORS_NOT_SET;
                    }
                    if (i == 2) {
                        return ALLOW_LIST;
                    }
                    if (i != 3) {
                        return null;
                    }
                    return DENY_LIST;
                }

                public int getNumber() {
                    return this.value;
                }

                @Deprecated
                public static ValidatorsCase valueOf(int i) {
                    return forNumber(i);
                }
            }

            public interface ValidatorsOrBuilder extends qu3 {
                String getAddress(int i);

                ByteString getAddressBytes(int i);

                int getAddressCount();

                List<String> getAddressList();

                /* synthetic */ C4956c0 getDefaultInstanceForType();

                /* synthetic */ boolean isInitialized();
            }

            static {
                StakeAuthorization stakeAuthorization = new StakeAuthorization();
                DEFAULT_INSTANCE = stakeAuthorization;
                GeneratedMessageLite.registerDefaultInstance(StakeAuthorization.class, stakeAuthorization);
            }

            private StakeAuthorization() {
            }

            /* access modifiers changed from: private */
            public void clearAllowList() {
                if (this.validatorsCase_ == 2) {
                    this.validatorsCase_ = 0;
                    this.validators_ = null;
                }
            }

            /* access modifiers changed from: private */
            public void clearAuthorizationType() {
                this.authorizationType_ = 0;
            }

            /* access modifiers changed from: private */
            public void clearDenyList() {
                if (this.validatorsCase_ == 3) {
                    this.validatorsCase_ = 0;
                    this.validators_ = null;
                }
            }

            /* access modifiers changed from: private */
            public void clearMaxTokens() {
                this.maxTokens_ = null;
            }

            /* access modifiers changed from: private */
            public void clearValidators() {
                this.validatorsCase_ = 0;
                this.validators_ = null;
            }

            public static StakeAuthorization getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* access modifiers changed from: private */
            public void mergeAllowList(Validators validators) {
                validators.getClass();
                if (this.validatorsCase_ != 2 || this.validators_ == Validators.getDefaultInstance()) {
                    this.validators_ = validators;
                } else {
                    this.validators_ = ((Validators.Builder) Validators.newBuilder((Validators) this.validators_).mergeFrom(validators)).buildPartial();
                }
                this.validatorsCase_ = 2;
            }

            /* access modifiers changed from: private */
            public void mergeDenyList(Validators validators) {
                validators.getClass();
                if (this.validatorsCase_ != 3 || this.validators_ == Validators.getDefaultInstance()) {
                    this.validators_ = validators;
                } else {
                    this.validators_ = ((Validators.Builder) Validators.newBuilder((Validators) this.validators_).mergeFrom(validators)).buildPartial();
                }
                this.validatorsCase_ = 3;
            }

            /* access modifiers changed from: private */
            public void mergeMaxTokens(Amount amount) {
                amount.getClass();
                Amount amount2 = this.maxTokens_;
                if (amount2 == null || amount2 == Amount.getDefaultInstance()) {
                    this.maxTokens_ = amount;
                } else {
                    this.maxTokens_ = (Amount) ((Amount.Builder) Amount.newBuilder(this.maxTokens_).mergeFrom(amount)).buildPartial();
                }
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static StakeAuthorization parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (StakeAuthorization) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static StakeAuthorization parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (StakeAuthorization) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<StakeAuthorization> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setAllowList(Validators validators) {
                validators.getClass();
                this.validators_ = validators;
                this.validatorsCase_ = 2;
            }

            /* access modifiers changed from: private */
            public void setAuthorizationType(AuthorizationType authorizationType) {
                this.authorizationType_ = authorizationType.getNumber();
            }

            /* access modifiers changed from: private */
            public void setAuthorizationTypeValue(int i) {
                this.authorizationType_ = i;
            }

            /* access modifiers changed from: private */
            public void setDenyList(Validators validators) {
                validators.getClass();
                this.validators_ = validators;
                this.validatorsCase_ = 3;
            }

            /* access modifiers changed from: private */
            public void setMaxTokens(Amount amount) {
                amount.getClass();
                this.maxTokens_ = amount;
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Class<Validators> cls = Validators.class;
                switch (C97321.f46548xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new StakeAuthorization();
                    case 2:
                        return new Builder((C97321) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002<\u0000\u0003<\u0000\u0004\f", new Object[]{"validators_", "validatorsCase_", "maxTokens_", cls, cls, "authorizationType_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<StakeAuthorization> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (StakeAuthorization.class) {
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

            public Validators getAllowList() {
                if (this.validatorsCase_ == 2) {
                    return (Validators) this.validators_;
                }
                return Validators.getDefaultInstance();
            }

            public AuthorizationType getAuthorizationType() {
                AuthorizationType forNumber = AuthorizationType.forNumber(this.authorizationType_);
                if (forNumber == null) {
                    return AuthorizationType.UNRECOGNIZED;
                }
                return forNumber;
            }

            public int getAuthorizationTypeValue() {
                return this.authorizationType_;
            }

            public Validators getDenyList() {
                if (this.validatorsCase_ == 3) {
                    return (Validators) this.validators_;
                }
                return Validators.getDefaultInstance();
            }

            public Amount getMaxTokens() {
                Amount amount = this.maxTokens_;
                if (amount == null) {
                    return Amount.getDefaultInstance();
                }
                return amount;
            }

            public ValidatorsCase getValidatorsCase() {
                return ValidatorsCase.forNumber(this.validatorsCase_);
            }

            public boolean hasAllowList() {
                if (this.validatorsCase_ == 2) {
                    return true;
                }
                return false;
            }

            public boolean hasDenyList() {
                if (this.validatorsCase_ == 3) {
                    return true;
                }
                return false;
            }

            public boolean hasMaxTokens() {
                if (this.maxTokens_ != null) {
                    return true;
                }
                return false;
            }

            public static Builder newBuilder(StakeAuthorization stakeAuthorization) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(stakeAuthorization);
            }

            public static StakeAuthorization parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (StakeAuthorization) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static StakeAuthorization parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (StakeAuthorization) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static StakeAuthorization parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (StakeAuthorization) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static StakeAuthorization parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (StakeAuthorization) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static StakeAuthorization parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (StakeAuthorization) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static StakeAuthorization parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (StakeAuthorization) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static StakeAuthorization parseFrom(InputStream inputStream) throws IOException {
                return (StakeAuthorization) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static StakeAuthorization parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (StakeAuthorization) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static StakeAuthorization parseFrom(C4969g gVar) throws IOException {
                return (StakeAuthorization) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static StakeAuthorization parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (StakeAuthorization) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public interface StakeAuthorizationOrBuilder extends qu3 {
            StakeAuthorization.Validators getAllowList();

            AuthorizationType getAuthorizationType();

            int getAuthorizationTypeValue();

            /* synthetic */ C4956c0 getDefaultInstanceForType();

            StakeAuthorization.Validators getDenyList();

            Amount getMaxTokens();

            StakeAuthorization.ValidatorsCase getValidatorsCase();

            boolean hasAllowList();

            boolean hasDenyList();

            boolean hasMaxTokens();

            /* synthetic */ boolean isInitialized();
        }

        public static final class THORChainSend extends GeneratedMessageLite<THORChainSend, Builder> implements THORChainSendOrBuilder {
            public static final int AMOUNTS_FIELD_NUMBER = 3;
            /* access modifiers changed from: private */
            public static final THORChainSend DEFAULT_INSTANCE;
            public static final int FROM_ADDRESS_FIELD_NUMBER = 1;
            private static volatile im4<THORChainSend> PARSER = null;
            public static final int TO_ADDRESS_FIELD_NUMBER = 2;
            private C5011t.C5020i<Amount> amounts_ = GeneratedMessageLite.emptyProtobufList();
            private ByteString fromAddress_;
            private ByteString toAddress_;

            public static final class Builder extends GeneratedMessageLite.C4930a<THORChainSend, Builder> implements THORChainSendOrBuilder {
                public /* synthetic */ Builder(C97321 r1) {
                    this();
                }

                public Builder addAllAmounts(Iterable<? extends Amount> iterable) {
                    copyOnWrite();
                    ((THORChainSend) this.instance).addAllAmounts(iterable);
                    return this;
                }

                public Builder addAmounts(Amount amount) {
                    copyOnWrite();
                    ((THORChainSend) this.instance).addAmounts(amount);
                    return this;
                }

                public Builder clearAmounts() {
                    copyOnWrite();
                    ((THORChainSend) this.instance).clearAmounts();
                    return this;
                }

                public Builder clearFromAddress() {
                    copyOnWrite();
                    ((THORChainSend) this.instance).clearFromAddress();
                    return this;
                }

                public Builder clearToAddress() {
                    copyOnWrite();
                    ((THORChainSend) this.instance).clearToAddress();
                    return this;
                }

                public Amount getAmounts(int i) {
                    return ((THORChainSend) this.instance).getAmounts(i);
                }

                public int getAmountsCount() {
                    return ((THORChainSend) this.instance).getAmountsCount();
                }

                public List<Amount> getAmountsList() {
                    return Collections.unmodifiableList(((THORChainSend) this.instance).getAmountsList());
                }

                public ByteString getFromAddress() {
                    return ((THORChainSend) this.instance).getFromAddress();
                }

                public ByteString getToAddress() {
                    return ((THORChainSend) this.instance).getToAddress();
                }

                public Builder removeAmounts(int i) {
                    copyOnWrite();
                    ((THORChainSend) this.instance).removeAmounts(i);
                    return this;
                }

                public Builder setAmounts(int i, Amount amount) {
                    copyOnWrite();
                    ((THORChainSend) this.instance).setAmounts(i, amount);
                    return this;
                }

                public Builder setFromAddress(ByteString byteString) {
                    copyOnWrite();
                    ((THORChainSend) this.instance).setFromAddress(byteString);
                    return this;
                }

                public Builder setToAddress(ByteString byteString) {
                    copyOnWrite();
                    ((THORChainSend) this.instance).setToAddress(byteString);
                    return this;
                }

                private Builder() {
                    super(THORChainSend.DEFAULT_INSTANCE);
                }

                public Builder addAmounts(int i, Amount amount) {
                    copyOnWrite();
                    ((THORChainSend) this.instance).addAmounts(i, amount);
                    return this;
                }

                public Builder setAmounts(int i, Amount.Builder builder) {
                    copyOnWrite();
                    ((THORChainSend) this.instance).setAmounts(i, (Amount) builder.build());
                    return this;
                }

                public Builder addAmounts(Amount.Builder builder) {
                    copyOnWrite();
                    ((THORChainSend) this.instance).addAmounts((Amount) builder.build());
                    return this;
                }

                public Builder addAmounts(int i, Amount.Builder builder) {
                    copyOnWrite();
                    ((THORChainSend) this.instance).addAmounts(i, (Amount) builder.build());
                    return this;
                }
            }

            static {
                THORChainSend tHORChainSend = new THORChainSend();
                DEFAULT_INSTANCE = tHORChainSend;
                GeneratedMessageLite.registerDefaultInstance(THORChainSend.class, tHORChainSend);
            }

            private THORChainSend() {
                ByteString byteString = ByteString.EMPTY;
                this.fromAddress_ = byteString;
                this.toAddress_ = byteString;
            }

            /* access modifiers changed from: private */
            public void addAllAmounts(Iterable<? extends Amount> iterable) {
                ensureAmountsIsMutable();
                C4949a.addAll(iterable, this.amounts_);
            }

            /* access modifiers changed from: private */
            public void addAmounts(Amount amount) {
                amount.getClass();
                ensureAmountsIsMutable();
                this.amounts_.add(amount);
            }

            /* access modifiers changed from: private */
            public void clearAmounts() {
                this.amounts_ = GeneratedMessageLite.emptyProtobufList();
            }

            /* access modifiers changed from: private */
            public void clearFromAddress() {
                this.fromAddress_ = getDefaultInstance().getFromAddress();
            }

            /* access modifiers changed from: private */
            public void clearToAddress() {
                this.toAddress_ = getDefaultInstance().getToAddress();
            }

            private void ensureAmountsIsMutable() {
                C5011t.C5020i<Amount> iVar = this.amounts_;
                if (!iVar.mo37090v()) {
                    this.amounts_ = GeneratedMessageLite.mutableCopy(iVar);
                }
            }

            public static THORChainSend getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static THORChainSend parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (THORChainSend) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static THORChainSend parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (THORChainSend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<THORChainSend> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void removeAmounts(int i) {
                ensureAmountsIsMutable();
                this.amounts_.remove(i);
            }

            /* access modifiers changed from: private */
            public void setAmounts(int i, Amount amount) {
                amount.getClass();
                ensureAmountsIsMutable();
                this.amounts_.set(i, amount);
            }

            /* access modifiers changed from: private */
            public void setFromAddress(ByteString byteString) {
                byteString.getClass();
                this.fromAddress_ = byteString;
            }

            /* access modifiers changed from: private */
            public void setToAddress(ByteString byteString) {
                byteString.getClass();
                this.toAddress_ = byteString;
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97321.f46548xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new THORChainSend();
                    case 2:
                        return new Builder((C97321) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\n\u0002\n\u0003\u001b", new Object[]{"fromAddress_", "toAddress_", "amounts_", Amount.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<THORChainSend> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (THORChainSend.class) {
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

            public Amount getAmounts(int i) {
                return this.amounts_.get(i);
            }

            public int getAmountsCount() {
                return this.amounts_.size();
            }

            public List<Amount> getAmountsList() {
                return this.amounts_;
            }

            public AmountOrBuilder getAmountsOrBuilder(int i) {
                return this.amounts_.get(i);
            }

            public List<? extends AmountOrBuilder> getAmountsOrBuilderList() {
                return this.amounts_;
            }

            public ByteString getFromAddress() {
                return this.fromAddress_;
            }

            public ByteString getToAddress() {
                return this.toAddress_;
            }

            public static Builder newBuilder(THORChainSend tHORChainSend) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(tHORChainSend);
            }

            public static THORChainSend parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (THORChainSend) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static THORChainSend parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (THORChainSend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static THORChainSend parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (THORChainSend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            /* access modifiers changed from: private */
            public void addAmounts(int i, Amount amount) {
                amount.getClass();
                ensureAmountsIsMutable();
                this.amounts_.add(i, amount);
            }

            public static THORChainSend parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (THORChainSend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static THORChainSend parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (THORChainSend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static THORChainSend parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (THORChainSend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static THORChainSend parseFrom(InputStream inputStream) throws IOException {
                return (THORChainSend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static THORChainSend parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (THORChainSend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static THORChainSend parseFrom(C4969g gVar) throws IOException {
                return (THORChainSend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static THORChainSend parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (THORChainSend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public interface THORChainSendOrBuilder extends qu3 {
            Amount getAmounts(int i);

            int getAmountsCount();

            List<Amount> getAmountsList();

            /* synthetic */ C4956c0 getDefaultInstanceForType();

            ByteString getFromAddress();

            ByteString getToAddress();

            /* synthetic */ boolean isInitialized();
        }

        public static final class Transfer extends GeneratedMessageLite<Transfer, Builder> implements TransferOrBuilder {
            /* access modifiers changed from: private */
            public static final Transfer DEFAULT_INSTANCE;
            private static volatile im4<Transfer> PARSER = null;
            public static final int RECEIVER_FIELD_NUMBER = 5;
            public static final int SENDER_FIELD_NUMBER = 4;
            public static final int SOURCE_CHANNEL_FIELD_NUMBER = 2;
            public static final int SOURCE_PORT_FIELD_NUMBER = 1;
            public static final int TIMEOUT_HEIGHT_FIELD_NUMBER = 6;
            public static final int TIMEOUT_TIMESTAMP_FIELD_NUMBER = 7;
            public static final int TOKEN_FIELD_NUMBER = 3;
            private String receiver_ = "";
            private String sender_ = "";
            private String sourceChannel_ = "";
            private String sourcePort_ = "";
            private Height timeoutHeight_;
            private long timeoutTimestamp_;
            private Amount token_;

            public static final class Builder extends GeneratedMessageLite.C4930a<Transfer, Builder> implements TransferOrBuilder {
                public /* synthetic */ Builder(C97321 r1) {
                    this();
                }

                public Builder clearReceiver() {
                    copyOnWrite();
                    ((Transfer) this.instance).clearReceiver();
                    return this;
                }

                public Builder clearSender() {
                    copyOnWrite();
                    ((Transfer) this.instance).clearSender();
                    return this;
                }

                public Builder clearSourceChannel() {
                    copyOnWrite();
                    ((Transfer) this.instance).clearSourceChannel();
                    return this;
                }

                public Builder clearSourcePort() {
                    copyOnWrite();
                    ((Transfer) this.instance).clearSourcePort();
                    return this;
                }

                public Builder clearTimeoutHeight() {
                    copyOnWrite();
                    ((Transfer) this.instance).clearTimeoutHeight();
                    return this;
                }

                public Builder clearTimeoutTimestamp() {
                    copyOnWrite();
                    ((Transfer) this.instance).clearTimeoutTimestamp();
                    return this;
                }

                public Builder clearToken() {
                    copyOnWrite();
                    ((Transfer) this.instance).clearToken();
                    return this;
                }

                public String getReceiver() {
                    return ((Transfer) this.instance).getReceiver();
                }

                public ByteString getReceiverBytes() {
                    return ((Transfer) this.instance).getReceiverBytes();
                }

                public String getSender() {
                    return ((Transfer) this.instance).getSender();
                }

                public ByteString getSenderBytes() {
                    return ((Transfer) this.instance).getSenderBytes();
                }

                public String getSourceChannel() {
                    return ((Transfer) this.instance).getSourceChannel();
                }

                public ByteString getSourceChannelBytes() {
                    return ((Transfer) this.instance).getSourceChannelBytes();
                }

                public String getSourcePort() {
                    return ((Transfer) this.instance).getSourcePort();
                }

                public ByteString getSourcePortBytes() {
                    return ((Transfer) this.instance).getSourcePortBytes();
                }

                public Height getTimeoutHeight() {
                    return ((Transfer) this.instance).getTimeoutHeight();
                }

                public long getTimeoutTimestamp() {
                    return ((Transfer) this.instance).getTimeoutTimestamp();
                }

                public Amount getToken() {
                    return ((Transfer) this.instance).getToken();
                }

                public boolean hasTimeoutHeight() {
                    return ((Transfer) this.instance).hasTimeoutHeight();
                }

                public boolean hasToken() {
                    return ((Transfer) this.instance).hasToken();
                }

                public Builder mergeTimeoutHeight(Height height) {
                    copyOnWrite();
                    ((Transfer) this.instance).mergeTimeoutHeight(height);
                    return this;
                }

                public Builder mergeToken(Amount amount) {
                    copyOnWrite();
                    ((Transfer) this.instance).mergeToken(amount);
                    return this;
                }

                public Builder setReceiver(String str) {
                    copyOnWrite();
                    ((Transfer) this.instance).setReceiver(str);
                    return this;
                }

                public Builder setReceiverBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Transfer) this.instance).setReceiverBytes(byteString);
                    return this;
                }

                public Builder setSender(String str) {
                    copyOnWrite();
                    ((Transfer) this.instance).setSender(str);
                    return this;
                }

                public Builder setSenderBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Transfer) this.instance).setSenderBytes(byteString);
                    return this;
                }

                public Builder setSourceChannel(String str) {
                    copyOnWrite();
                    ((Transfer) this.instance).setSourceChannel(str);
                    return this;
                }

                public Builder setSourceChannelBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Transfer) this.instance).setSourceChannelBytes(byteString);
                    return this;
                }

                public Builder setSourcePort(String str) {
                    copyOnWrite();
                    ((Transfer) this.instance).setSourcePort(str);
                    return this;
                }

                public Builder setSourcePortBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Transfer) this.instance).setSourcePortBytes(byteString);
                    return this;
                }

                public Builder setTimeoutHeight(Height height) {
                    copyOnWrite();
                    ((Transfer) this.instance).setTimeoutHeight(height);
                    return this;
                }

                public Builder setTimeoutTimestamp(long j) {
                    copyOnWrite();
                    ((Transfer) this.instance).setTimeoutTimestamp(j);
                    return this;
                }

                public Builder setToken(Amount amount) {
                    copyOnWrite();
                    ((Transfer) this.instance).setToken(amount);
                    return this;
                }

                private Builder() {
                    super(Transfer.DEFAULT_INSTANCE);
                }

                public Builder setTimeoutHeight(Height.Builder builder) {
                    copyOnWrite();
                    ((Transfer) this.instance).setTimeoutHeight((Height) builder.build());
                    return this;
                }

                public Builder setToken(Amount.Builder builder) {
                    copyOnWrite();
                    ((Transfer) this.instance).setToken((Amount) builder.build());
                    return this;
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
            public void clearReceiver() {
                this.receiver_ = getDefaultInstance().getReceiver();
            }

            /* access modifiers changed from: private */
            public void clearSender() {
                this.sender_ = getDefaultInstance().getSender();
            }

            /* access modifiers changed from: private */
            public void clearSourceChannel() {
                this.sourceChannel_ = getDefaultInstance().getSourceChannel();
            }

            /* access modifiers changed from: private */
            public void clearSourcePort() {
                this.sourcePort_ = getDefaultInstance().getSourcePort();
            }

            /* access modifiers changed from: private */
            public void clearTimeoutHeight() {
                this.timeoutHeight_ = null;
            }

            /* access modifiers changed from: private */
            public void clearTimeoutTimestamp() {
                this.timeoutTimestamp_ = 0;
            }

            /* access modifiers changed from: private */
            public void clearToken() {
                this.token_ = null;
            }

            public static Transfer getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* access modifiers changed from: private */
            public void mergeTimeoutHeight(Height height) {
                height.getClass();
                Height height2 = this.timeoutHeight_;
                if (height2 == null || height2 == Height.getDefaultInstance()) {
                    this.timeoutHeight_ = height;
                } else {
                    this.timeoutHeight_ = (Height) ((Height.Builder) Height.newBuilder(this.timeoutHeight_).mergeFrom(height)).buildPartial();
                }
            }

            /* access modifiers changed from: private */
            public void mergeToken(Amount amount) {
                amount.getClass();
                Amount amount2 = this.token_;
                if (amount2 == null || amount2 == Amount.getDefaultInstance()) {
                    this.token_ = amount;
                } else {
                    this.token_ = (Amount) ((Amount.Builder) Amount.newBuilder(this.token_).mergeFrom(amount)).buildPartial();
                }
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
            public void setSourceChannel(String str) {
                str.getClass();
                this.sourceChannel_ = str;
            }

            /* access modifiers changed from: private */
            public void setSourceChannelBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.sourceChannel_ = byteString.toStringUtf8();
            }

            /* access modifiers changed from: private */
            public void setSourcePort(String str) {
                str.getClass();
                this.sourcePort_ = str;
            }

            /* access modifiers changed from: private */
            public void setSourcePortBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.sourcePort_ = byteString.toStringUtf8();
            }

            /* access modifiers changed from: private */
            public void setTimeoutHeight(Height height) {
                height.getClass();
                this.timeoutHeight_ = height;
            }

            /* access modifiers changed from: private */
            public void setTimeoutTimestamp(long j) {
                this.timeoutTimestamp_ = j;
            }

            /* access modifiers changed from: private */
            public void setToken(Amount amount) {
                amount.getClass();
                this.token_ = amount;
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97321.f46548xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Transfer();
                    case 2:
                        return new Builder((C97321) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\t\u0004Ȉ\u0005Ȉ\u0006\t\u0007\u0003", new Object[]{"sourcePort_", "sourceChannel_", "token_", "sender_", "receiver_", "timeoutHeight_", "timeoutTimestamp_"});
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

            public String getReceiver() {
                return this.receiver_;
            }

            public ByteString getReceiverBytes() {
                return ByteString.copyFromUtf8(this.receiver_);
            }

            public String getSender() {
                return this.sender_;
            }

            public ByteString getSenderBytes() {
                return ByteString.copyFromUtf8(this.sender_);
            }

            public String getSourceChannel() {
                return this.sourceChannel_;
            }

            public ByteString getSourceChannelBytes() {
                return ByteString.copyFromUtf8(this.sourceChannel_);
            }

            public String getSourcePort() {
                return this.sourcePort_;
            }

            public ByteString getSourcePortBytes() {
                return ByteString.copyFromUtf8(this.sourcePort_);
            }

            public Height getTimeoutHeight() {
                Height height = this.timeoutHeight_;
                if (height == null) {
                    return Height.getDefaultInstance();
                }
                return height;
            }

            public long getTimeoutTimestamp() {
                return this.timeoutTimestamp_;
            }

            public Amount getToken() {
                Amount amount = this.token_;
                if (amount == null) {
                    return Amount.getDefaultInstance();
                }
                return amount;
            }

            public boolean hasTimeoutHeight() {
                if (this.timeoutHeight_ != null) {
                    return true;
                }
                return false;
            }

            public boolean hasToken() {
                if (this.token_ != null) {
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
            /* synthetic */ C4956c0 getDefaultInstanceForType();

            String getReceiver();

            ByteString getReceiverBytes();

            String getSender();

            ByteString getSenderBytes();

            String getSourceChannel();

            ByteString getSourceChannelBytes();

            String getSourcePort();

            ByteString getSourcePortBytes();

            Height getTimeoutHeight();

            long getTimeoutTimestamp();

            Amount getToken();

            boolean hasTimeoutHeight();

            boolean hasToken();

            /* synthetic */ boolean isInitialized();
        }

        public static final class Undelegate extends GeneratedMessageLite<Undelegate, Builder> implements UndelegateOrBuilder {
            public static final int AMOUNT_FIELD_NUMBER = 3;
            /* access modifiers changed from: private */
            public static final Undelegate DEFAULT_INSTANCE;
            public static final int DELEGATOR_ADDRESS_FIELD_NUMBER = 1;
            private static volatile im4<Undelegate> PARSER = null;
            public static final int TYPE_PREFIX_FIELD_NUMBER = 4;
            public static final int VALIDATOR_ADDRESS_FIELD_NUMBER = 2;
            private Amount amount_;
            private String delegatorAddress_ = "";
            private String typePrefix_ = "";
            private String validatorAddress_ = "";

            public static final class Builder extends GeneratedMessageLite.C4930a<Undelegate, Builder> implements UndelegateOrBuilder {
                public /* synthetic */ Builder(C97321 r1) {
                    this();
                }

                public Builder clearAmount() {
                    copyOnWrite();
                    ((Undelegate) this.instance).clearAmount();
                    return this;
                }

                public Builder clearDelegatorAddress() {
                    copyOnWrite();
                    ((Undelegate) this.instance).clearDelegatorAddress();
                    return this;
                }

                public Builder clearTypePrefix() {
                    copyOnWrite();
                    ((Undelegate) this.instance).clearTypePrefix();
                    return this;
                }

                public Builder clearValidatorAddress() {
                    copyOnWrite();
                    ((Undelegate) this.instance).clearValidatorAddress();
                    return this;
                }

                public Amount getAmount() {
                    return ((Undelegate) this.instance).getAmount();
                }

                public String getDelegatorAddress() {
                    return ((Undelegate) this.instance).getDelegatorAddress();
                }

                public ByteString getDelegatorAddressBytes() {
                    return ((Undelegate) this.instance).getDelegatorAddressBytes();
                }

                public String getTypePrefix() {
                    return ((Undelegate) this.instance).getTypePrefix();
                }

                public ByteString getTypePrefixBytes() {
                    return ((Undelegate) this.instance).getTypePrefixBytes();
                }

                public String getValidatorAddress() {
                    return ((Undelegate) this.instance).getValidatorAddress();
                }

                public ByteString getValidatorAddressBytes() {
                    return ((Undelegate) this.instance).getValidatorAddressBytes();
                }

                public boolean hasAmount() {
                    return ((Undelegate) this.instance).hasAmount();
                }

                public Builder mergeAmount(Amount amount) {
                    copyOnWrite();
                    ((Undelegate) this.instance).mergeAmount(amount);
                    return this;
                }

                public Builder setAmount(Amount amount) {
                    copyOnWrite();
                    ((Undelegate) this.instance).setAmount(amount);
                    return this;
                }

                public Builder setDelegatorAddress(String str) {
                    copyOnWrite();
                    ((Undelegate) this.instance).setDelegatorAddress(str);
                    return this;
                }

                public Builder setDelegatorAddressBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Undelegate) this.instance).setDelegatorAddressBytes(byteString);
                    return this;
                }

                public Builder setTypePrefix(String str) {
                    copyOnWrite();
                    ((Undelegate) this.instance).setTypePrefix(str);
                    return this;
                }

                public Builder setTypePrefixBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Undelegate) this.instance).setTypePrefixBytes(byteString);
                    return this;
                }

                public Builder setValidatorAddress(String str) {
                    copyOnWrite();
                    ((Undelegate) this.instance).setValidatorAddress(str);
                    return this;
                }

                public Builder setValidatorAddressBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Undelegate) this.instance).setValidatorAddressBytes(byteString);
                    return this;
                }

                private Builder() {
                    super(Undelegate.DEFAULT_INSTANCE);
                }

                public Builder setAmount(Amount.Builder builder) {
                    copyOnWrite();
                    ((Undelegate) this.instance).setAmount((Amount) builder.build());
                    return this;
                }
            }

            static {
                Undelegate undelegate = new Undelegate();
                DEFAULT_INSTANCE = undelegate;
                GeneratedMessageLite.registerDefaultInstance(Undelegate.class, undelegate);
            }

            private Undelegate() {
            }

            /* access modifiers changed from: private */
            public void clearAmount() {
                this.amount_ = null;
            }

            /* access modifiers changed from: private */
            public void clearDelegatorAddress() {
                this.delegatorAddress_ = getDefaultInstance().getDelegatorAddress();
            }

            /* access modifiers changed from: private */
            public void clearTypePrefix() {
                this.typePrefix_ = getDefaultInstance().getTypePrefix();
            }

            /* access modifiers changed from: private */
            public void clearValidatorAddress() {
                this.validatorAddress_ = getDefaultInstance().getValidatorAddress();
            }

            public static Undelegate getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* access modifiers changed from: private */
            public void mergeAmount(Amount amount) {
                amount.getClass();
                Amount amount2 = this.amount_;
                if (amount2 == null || amount2 == Amount.getDefaultInstance()) {
                    this.amount_ = amount;
                } else {
                    this.amount_ = (Amount) ((Amount.Builder) Amount.newBuilder(this.amount_).mergeFrom(amount)).buildPartial();
                }
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static Undelegate parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Undelegate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Undelegate parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Undelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<Undelegate> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setAmount(Amount amount) {
                amount.getClass();
                this.amount_ = amount;
            }

            /* access modifiers changed from: private */
            public void setDelegatorAddress(String str) {
                str.getClass();
                this.delegatorAddress_ = str;
            }

            /* access modifiers changed from: private */
            public void setDelegatorAddressBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.delegatorAddress_ = byteString.toStringUtf8();
            }

            /* access modifiers changed from: private */
            public void setTypePrefix(String str) {
                str.getClass();
                this.typePrefix_ = str;
            }

            /* access modifiers changed from: private */
            public void setTypePrefixBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.typePrefix_ = byteString.toStringUtf8();
            }

            /* access modifiers changed from: private */
            public void setValidatorAddress(String str) {
                str.getClass();
                this.validatorAddress_ = str;
            }

            /* access modifiers changed from: private */
            public void setValidatorAddressBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.validatorAddress_ = byteString.toStringUtf8();
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97321.f46548xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Undelegate();
                    case 2:
                        return new Builder((C97321) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\t\u0004Ȉ", new Object[]{"delegatorAddress_", "validatorAddress_", "amount_", "typePrefix_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<Undelegate> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (Undelegate.class) {
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

            public Amount getAmount() {
                Amount amount = this.amount_;
                if (amount == null) {
                    return Amount.getDefaultInstance();
                }
                return amount;
            }

            public String getDelegatorAddress() {
                return this.delegatorAddress_;
            }

            public ByteString getDelegatorAddressBytes() {
                return ByteString.copyFromUtf8(this.delegatorAddress_);
            }

            public String getTypePrefix() {
                return this.typePrefix_;
            }

            public ByteString getTypePrefixBytes() {
                return ByteString.copyFromUtf8(this.typePrefix_);
            }

            public String getValidatorAddress() {
                return this.validatorAddress_;
            }

            public ByteString getValidatorAddressBytes() {
                return ByteString.copyFromUtf8(this.validatorAddress_);
            }

            public boolean hasAmount() {
                if (this.amount_ != null) {
                    return true;
                }
                return false;
            }

            public static Builder newBuilder(Undelegate undelegate) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(undelegate);
            }

            public static Undelegate parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (Undelegate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static Undelegate parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (Undelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static Undelegate parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Undelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Undelegate parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (Undelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static Undelegate parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Undelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Undelegate parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (Undelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static Undelegate parseFrom(InputStream inputStream) throws IOException {
                return (Undelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Undelegate parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (Undelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static Undelegate parseFrom(C4969g gVar) throws IOException {
                return (Undelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static Undelegate parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (Undelegate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public interface UndelegateOrBuilder extends qu3 {
            Amount getAmount();

            /* synthetic */ C4956c0 getDefaultInstanceForType();

            String getDelegatorAddress();

            ByteString getDelegatorAddressBytes();

            String getTypePrefix();

            ByteString getTypePrefixBytes();

            String getValidatorAddress();

            ByteString getValidatorAddressBytes();

            boolean hasAmount();

            /* synthetic */ boolean isInitialized();
        }

        public enum VoteOption implements C5011t.C5014c {
            _UNSPECIFIED(0),
            YES(1),
            ABSTAIN(2),
            NO(3),
            NO_WITH_VETO(4),
            UNRECOGNIZED(-1);
            
            public static final int ABSTAIN_VALUE = 2;
            public static final int NO_VALUE = 3;
            public static final int NO_WITH_VETO_VALUE = 4;
            public static final int YES_VALUE = 1;
            public static final int _UNSPECIFIED_VALUE = 0;
            private static final C5011t.C5015d<VoteOption> internalValueMap = null;
            private final int value;

            public static final class VoteOptionVerifier implements C5011t.C5016e {
                public static final C5011t.C5016e INSTANCE = null;

                static {
                    INSTANCE = new VoteOptionVerifier();
                }

                private VoteOptionVerifier() {
                }

                public boolean isInRange(int i) {
                    if (VoteOption.forNumber(i) != null) {
                        return true;
                    }
                    return false;
                }
            }

            /* access modifiers changed from: public */
            static {
                internalValueMap = new C5011t.C5015d<VoteOption>() {
                    public VoteOption findValueByNumber(int i) {
                        return VoteOption.forNumber(i);
                    }
                };
            }

            private VoteOption(int i) {
                this.value = i;
            }

            public static VoteOption forNumber(int i) {
                if (i == 0) {
                    return _UNSPECIFIED;
                }
                if (i == 1) {
                    return YES;
                }
                if (i == 2) {
                    return ABSTAIN;
                }
                if (i == 3) {
                    return NO;
                }
                if (i != 4) {
                    return null;
                }
                return NO_WITH_VETO;
            }

            public static C5011t.C5015d<VoteOption> internalGetValueMap() {
                return internalValueMap;
            }

            public static C5011t.C5016e internalGetVerifier() {
                return VoteOptionVerifier.INSTANCE;
            }

            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Deprecated
            public static VoteOption valueOf(int i) {
                return forNumber(i);
            }
        }

        public static final class WasmExecuteContractGeneric extends GeneratedMessageLite<WasmExecuteContractGeneric, Builder> implements WasmExecuteContractGenericOrBuilder {
            public static final int COINS_FIELD_NUMBER = 5;
            public static final int CONTRACT_ADDRESS_FIELD_NUMBER = 2;
            /* access modifiers changed from: private */
            public static final WasmExecuteContractGeneric DEFAULT_INSTANCE;
            public static final int EXECUTE_MSG_FIELD_NUMBER = 3;
            private static volatile im4<WasmExecuteContractGeneric> PARSER = null;
            public static final int SENDER_ADDRESS_FIELD_NUMBER = 1;
            private C5011t.C5020i<Amount> coins_ = GeneratedMessageLite.emptyProtobufList();
            private String contractAddress_ = "";
            private String executeMsg_ = "";
            private String senderAddress_ = "";

            public static final class Builder extends GeneratedMessageLite.C4930a<WasmExecuteContractGeneric, Builder> implements WasmExecuteContractGenericOrBuilder {
                public /* synthetic */ Builder(C97321 r1) {
                    this();
                }

                public Builder addAllCoins(Iterable<? extends Amount> iterable) {
                    copyOnWrite();
                    ((WasmExecuteContractGeneric) this.instance).addAllCoins(iterable);
                    return this;
                }

                public Builder addCoins(Amount amount) {
                    copyOnWrite();
                    ((WasmExecuteContractGeneric) this.instance).addCoins(amount);
                    return this;
                }

                public Builder clearCoins() {
                    copyOnWrite();
                    ((WasmExecuteContractGeneric) this.instance).clearCoins();
                    return this;
                }

                public Builder clearContractAddress() {
                    copyOnWrite();
                    ((WasmExecuteContractGeneric) this.instance).clearContractAddress();
                    return this;
                }

                public Builder clearExecuteMsg() {
                    copyOnWrite();
                    ((WasmExecuteContractGeneric) this.instance).clearExecuteMsg();
                    return this;
                }

                public Builder clearSenderAddress() {
                    copyOnWrite();
                    ((WasmExecuteContractGeneric) this.instance).clearSenderAddress();
                    return this;
                }

                public Amount getCoins(int i) {
                    return ((WasmExecuteContractGeneric) this.instance).getCoins(i);
                }

                public int getCoinsCount() {
                    return ((WasmExecuteContractGeneric) this.instance).getCoinsCount();
                }

                public List<Amount> getCoinsList() {
                    return Collections.unmodifiableList(((WasmExecuteContractGeneric) this.instance).getCoinsList());
                }

                public String getContractAddress() {
                    return ((WasmExecuteContractGeneric) this.instance).getContractAddress();
                }

                public ByteString getContractAddressBytes() {
                    return ((WasmExecuteContractGeneric) this.instance).getContractAddressBytes();
                }

                public String getExecuteMsg() {
                    return ((WasmExecuteContractGeneric) this.instance).getExecuteMsg();
                }

                public ByteString getExecuteMsgBytes() {
                    return ((WasmExecuteContractGeneric) this.instance).getExecuteMsgBytes();
                }

                public String getSenderAddress() {
                    return ((WasmExecuteContractGeneric) this.instance).getSenderAddress();
                }

                public ByteString getSenderAddressBytes() {
                    return ((WasmExecuteContractGeneric) this.instance).getSenderAddressBytes();
                }

                public Builder removeCoins(int i) {
                    copyOnWrite();
                    ((WasmExecuteContractGeneric) this.instance).removeCoins(i);
                    return this;
                }

                public Builder setCoins(int i, Amount amount) {
                    copyOnWrite();
                    ((WasmExecuteContractGeneric) this.instance).setCoins(i, amount);
                    return this;
                }

                public Builder setContractAddress(String str) {
                    copyOnWrite();
                    ((WasmExecuteContractGeneric) this.instance).setContractAddress(str);
                    return this;
                }

                public Builder setContractAddressBytes(ByteString byteString) {
                    copyOnWrite();
                    ((WasmExecuteContractGeneric) this.instance).setContractAddressBytes(byteString);
                    return this;
                }

                public Builder setExecuteMsg(String str) {
                    copyOnWrite();
                    ((WasmExecuteContractGeneric) this.instance).setExecuteMsg(str);
                    return this;
                }

                public Builder setExecuteMsgBytes(ByteString byteString) {
                    copyOnWrite();
                    ((WasmExecuteContractGeneric) this.instance).setExecuteMsgBytes(byteString);
                    return this;
                }

                public Builder setSenderAddress(String str) {
                    copyOnWrite();
                    ((WasmExecuteContractGeneric) this.instance).setSenderAddress(str);
                    return this;
                }

                public Builder setSenderAddressBytes(ByteString byteString) {
                    copyOnWrite();
                    ((WasmExecuteContractGeneric) this.instance).setSenderAddressBytes(byteString);
                    return this;
                }

                private Builder() {
                    super(WasmExecuteContractGeneric.DEFAULT_INSTANCE);
                }

                public Builder addCoins(int i, Amount amount) {
                    copyOnWrite();
                    ((WasmExecuteContractGeneric) this.instance).addCoins(i, amount);
                    return this;
                }

                public Builder setCoins(int i, Amount.Builder builder) {
                    copyOnWrite();
                    ((WasmExecuteContractGeneric) this.instance).setCoins(i, (Amount) builder.build());
                    return this;
                }

                public Builder addCoins(Amount.Builder builder) {
                    copyOnWrite();
                    ((WasmExecuteContractGeneric) this.instance).addCoins((Amount) builder.build());
                    return this;
                }

                public Builder addCoins(int i, Amount.Builder builder) {
                    copyOnWrite();
                    ((WasmExecuteContractGeneric) this.instance).addCoins(i, (Amount) builder.build());
                    return this;
                }
            }

            static {
                WasmExecuteContractGeneric wasmExecuteContractGeneric = new WasmExecuteContractGeneric();
                DEFAULT_INSTANCE = wasmExecuteContractGeneric;
                GeneratedMessageLite.registerDefaultInstance(WasmExecuteContractGeneric.class, wasmExecuteContractGeneric);
            }

            private WasmExecuteContractGeneric() {
            }

            /* access modifiers changed from: private */
            public void addAllCoins(Iterable<? extends Amount> iterable) {
                ensureCoinsIsMutable();
                C4949a.addAll(iterable, this.coins_);
            }

            /* access modifiers changed from: private */
            public void addCoins(Amount amount) {
                amount.getClass();
                ensureCoinsIsMutable();
                this.coins_.add(amount);
            }

            /* access modifiers changed from: private */
            public void clearCoins() {
                this.coins_ = GeneratedMessageLite.emptyProtobufList();
            }

            /* access modifiers changed from: private */
            public void clearContractAddress() {
                this.contractAddress_ = getDefaultInstance().getContractAddress();
            }

            /* access modifiers changed from: private */
            public void clearExecuteMsg() {
                this.executeMsg_ = getDefaultInstance().getExecuteMsg();
            }

            /* access modifiers changed from: private */
            public void clearSenderAddress() {
                this.senderAddress_ = getDefaultInstance().getSenderAddress();
            }

            private void ensureCoinsIsMutable() {
                C5011t.C5020i<Amount> iVar = this.coins_;
                if (!iVar.mo37090v()) {
                    this.coins_ = GeneratedMessageLite.mutableCopy(iVar);
                }
            }

            public static WasmExecuteContractGeneric getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static WasmExecuteContractGeneric parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (WasmExecuteContractGeneric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static WasmExecuteContractGeneric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (WasmExecuteContractGeneric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<WasmExecuteContractGeneric> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void removeCoins(int i) {
                ensureCoinsIsMutable();
                this.coins_.remove(i);
            }

            /* access modifiers changed from: private */
            public void setCoins(int i, Amount amount) {
                amount.getClass();
                ensureCoinsIsMutable();
                this.coins_.set(i, amount);
            }

            /* access modifiers changed from: private */
            public void setContractAddress(String str) {
                str.getClass();
                this.contractAddress_ = str;
            }

            /* access modifiers changed from: private */
            public void setContractAddressBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.contractAddress_ = byteString.toStringUtf8();
            }

            /* access modifiers changed from: private */
            public void setExecuteMsg(String str) {
                str.getClass();
                this.executeMsg_ = str;
            }

            /* access modifiers changed from: private */
            public void setExecuteMsgBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.executeMsg_ = byteString.toStringUtf8();
            }

            /* access modifiers changed from: private */
            public void setSenderAddress(String str) {
                str.getClass();
                this.senderAddress_ = str;
            }

            /* access modifiers changed from: private */
            public void setSenderAddressBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.senderAddress_ = byteString.toStringUtf8();
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97321.f46548xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new WasmExecuteContractGeneric();
                    case 2:
                        return new Builder((C97321) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0005\u001b", new Object[]{"senderAddress_", "contractAddress_", "executeMsg_", "coins_", Amount.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<WasmExecuteContractGeneric> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (WasmExecuteContractGeneric.class) {
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

            public Amount getCoins(int i) {
                return this.coins_.get(i);
            }

            public int getCoinsCount() {
                return this.coins_.size();
            }

            public List<Amount> getCoinsList() {
                return this.coins_;
            }

            public AmountOrBuilder getCoinsOrBuilder(int i) {
                return this.coins_.get(i);
            }

            public List<? extends AmountOrBuilder> getCoinsOrBuilderList() {
                return this.coins_;
            }

            public String getContractAddress() {
                return this.contractAddress_;
            }

            public ByteString getContractAddressBytes() {
                return ByteString.copyFromUtf8(this.contractAddress_);
            }

            public String getExecuteMsg() {
                return this.executeMsg_;
            }

            public ByteString getExecuteMsgBytes() {
                return ByteString.copyFromUtf8(this.executeMsg_);
            }

            public String getSenderAddress() {
                return this.senderAddress_;
            }

            public ByteString getSenderAddressBytes() {
                return ByteString.copyFromUtf8(this.senderAddress_);
            }

            public static Builder newBuilder(WasmExecuteContractGeneric wasmExecuteContractGeneric) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(wasmExecuteContractGeneric);
            }

            public static WasmExecuteContractGeneric parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (WasmExecuteContractGeneric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static WasmExecuteContractGeneric parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (WasmExecuteContractGeneric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static WasmExecuteContractGeneric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (WasmExecuteContractGeneric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            /* access modifiers changed from: private */
            public void addCoins(int i, Amount amount) {
                amount.getClass();
                ensureCoinsIsMutable();
                this.coins_.add(i, amount);
            }

            public static WasmExecuteContractGeneric parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (WasmExecuteContractGeneric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static WasmExecuteContractGeneric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (WasmExecuteContractGeneric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static WasmExecuteContractGeneric parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (WasmExecuteContractGeneric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static WasmExecuteContractGeneric parseFrom(InputStream inputStream) throws IOException {
                return (WasmExecuteContractGeneric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static WasmExecuteContractGeneric parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (WasmExecuteContractGeneric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static WasmExecuteContractGeneric parseFrom(C4969g gVar) throws IOException {
                return (WasmExecuteContractGeneric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static WasmExecuteContractGeneric parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (WasmExecuteContractGeneric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public interface WasmExecuteContractGenericOrBuilder extends qu3 {
            Amount getCoins(int i);

            int getCoinsCount();

            List<Amount> getCoinsList();

            String getContractAddress();

            ByteString getContractAddressBytes();

            /* synthetic */ C4956c0 getDefaultInstanceForType();

            String getExecuteMsg();

            ByteString getExecuteMsgBytes();

            String getSenderAddress();

            ByteString getSenderAddressBytes();

            /* synthetic */ boolean isInitialized();
        }

        public static final class WasmExecuteContractSend extends GeneratedMessageLite<WasmExecuteContractSend, Builder> implements WasmExecuteContractSendOrBuilder {
            public static final int AMOUNT_FIELD_NUMBER = 3;
            public static final int COIN_FIELD_NUMBER = 6;
            public static final int CONTRACT_ADDRESS_FIELD_NUMBER = 2;
            /* access modifiers changed from: private */
            public static final WasmExecuteContractSend DEFAULT_INSTANCE;
            public static final int MSG_FIELD_NUMBER = 5;
            private static volatile im4<WasmExecuteContractSend> PARSER = null;
            public static final int RECIPIENT_CONTRACT_ADDRESS_FIELD_NUMBER = 4;
            public static final int SENDER_ADDRESS_FIELD_NUMBER = 1;
            private ByteString amount_ = ByteString.EMPTY;
            private C5011t.C5020i<String> coin_ = GeneratedMessageLite.emptyProtobufList();
            private String contractAddress_ = "";
            private String msg_ = "";
            private String recipientContractAddress_ = "";
            private String senderAddress_ = "";

            public static final class Builder extends GeneratedMessageLite.C4930a<WasmExecuteContractSend, Builder> implements WasmExecuteContractSendOrBuilder {
                public /* synthetic */ Builder(C97321 r1) {
                    this();
                }

                public Builder addAllCoin(Iterable<String> iterable) {
                    copyOnWrite();
                    ((WasmExecuteContractSend) this.instance).addAllCoin(iterable);
                    return this;
                }

                public Builder addCoin(String str) {
                    copyOnWrite();
                    ((WasmExecuteContractSend) this.instance).addCoin(str);
                    return this;
                }

                public Builder addCoinBytes(ByteString byteString) {
                    copyOnWrite();
                    ((WasmExecuteContractSend) this.instance).addCoinBytes(byteString);
                    return this;
                }

                public Builder clearAmount() {
                    copyOnWrite();
                    ((WasmExecuteContractSend) this.instance).clearAmount();
                    return this;
                }

                public Builder clearCoin() {
                    copyOnWrite();
                    ((WasmExecuteContractSend) this.instance).clearCoin();
                    return this;
                }

                public Builder clearContractAddress() {
                    copyOnWrite();
                    ((WasmExecuteContractSend) this.instance).clearContractAddress();
                    return this;
                }

                public Builder clearMsg() {
                    copyOnWrite();
                    ((WasmExecuteContractSend) this.instance).clearMsg();
                    return this;
                }

                public Builder clearRecipientContractAddress() {
                    copyOnWrite();
                    ((WasmExecuteContractSend) this.instance).clearRecipientContractAddress();
                    return this;
                }

                public Builder clearSenderAddress() {
                    copyOnWrite();
                    ((WasmExecuteContractSend) this.instance).clearSenderAddress();
                    return this;
                }

                public ByteString getAmount() {
                    return ((WasmExecuteContractSend) this.instance).getAmount();
                }

                public String getCoin(int i) {
                    return ((WasmExecuteContractSend) this.instance).getCoin(i);
                }

                public ByteString getCoinBytes(int i) {
                    return ((WasmExecuteContractSend) this.instance).getCoinBytes(i);
                }

                public int getCoinCount() {
                    return ((WasmExecuteContractSend) this.instance).getCoinCount();
                }

                public List<String> getCoinList() {
                    return Collections.unmodifiableList(((WasmExecuteContractSend) this.instance).getCoinList());
                }

                public String getContractAddress() {
                    return ((WasmExecuteContractSend) this.instance).getContractAddress();
                }

                public ByteString getContractAddressBytes() {
                    return ((WasmExecuteContractSend) this.instance).getContractAddressBytes();
                }

                public String getMsg() {
                    return ((WasmExecuteContractSend) this.instance).getMsg();
                }

                public ByteString getMsgBytes() {
                    return ((WasmExecuteContractSend) this.instance).getMsgBytes();
                }

                public String getRecipientContractAddress() {
                    return ((WasmExecuteContractSend) this.instance).getRecipientContractAddress();
                }

                public ByteString getRecipientContractAddressBytes() {
                    return ((WasmExecuteContractSend) this.instance).getRecipientContractAddressBytes();
                }

                public String getSenderAddress() {
                    return ((WasmExecuteContractSend) this.instance).getSenderAddress();
                }

                public ByteString getSenderAddressBytes() {
                    return ((WasmExecuteContractSend) this.instance).getSenderAddressBytes();
                }

                public Builder setAmount(ByteString byteString) {
                    copyOnWrite();
                    ((WasmExecuteContractSend) this.instance).setAmount(byteString);
                    return this;
                }

                public Builder setCoin(int i, String str) {
                    copyOnWrite();
                    ((WasmExecuteContractSend) this.instance).setCoin(i, str);
                    return this;
                }

                public Builder setContractAddress(String str) {
                    copyOnWrite();
                    ((WasmExecuteContractSend) this.instance).setContractAddress(str);
                    return this;
                }

                public Builder setContractAddressBytes(ByteString byteString) {
                    copyOnWrite();
                    ((WasmExecuteContractSend) this.instance).setContractAddressBytes(byteString);
                    return this;
                }

                public Builder setMsg(String str) {
                    copyOnWrite();
                    ((WasmExecuteContractSend) this.instance).setMsg(str);
                    return this;
                }

                public Builder setMsgBytes(ByteString byteString) {
                    copyOnWrite();
                    ((WasmExecuteContractSend) this.instance).setMsgBytes(byteString);
                    return this;
                }

                public Builder setRecipientContractAddress(String str) {
                    copyOnWrite();
                    ((WasmExecuteContractSend) this.instance).setRecipientContractAddress(str);
                    return this;
                }

                public Builder setRecipientContractAddressBytes(ByteString byteString) {
                    copyOnWrite();
                    ((WasmExecuteContractSend) this.instance).setRecipientContractAddressBytes(byteString);
                    return this;
                }

                public Builder setSenderAddress(String str) {
                    copyOnWrite();
                    ((WasmExecuteContractSend) this.instance).setSenderAddress(str);
                    return this;
                }

                public Builder setSenderAddressBytes(ByteString byteString) {
                    copyOnWrite();
                    ((WasmExecuteContractSend) this.instance).setSenderAddressBytes(byteString);
                    return this;
                }

                private Builder() {
                    super(WasmExecuteContractSend.DEFAULT_INSTANCE);
                }
            }

            static {
                WasmExecuteContractSend wasmExecuteContractSend = new WasmExecuteContractSend();
                DEFAULT_INSTANCE = wasmExecuteContractSend;
                GeneratedMessageLite.registerDefaultInstance(WasmExecuteContractSend.class, wasmExecuteContractSend);
            }

            private WasmExecuteContractSend() {
            }

            /* access modifiers changed from: private */
            public void addAllCoin(Iterable<String> iterable) {
                ensureCoinIsMutable();
                C4949a.addAll(iterable, this.coin_);
            }

            /* access modifiers changed from: private */
            public void addCoin(String str) {
                str.getClass();
                ensureCoinIsMutable();
                this.coin_.add(str);
            }

            /* access modifiers changed from: private */
            public void addCoinBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                ensureCoinIsMutable();
                this.coin_.add(byteString.toStringUtf8());
            }

            /* access modifiers changed from: private */
            public void clearAmount() {
                this.amount_ = getDefaultInstance().getAmount();
            }

            /* access modifiers changed from: private */
            public void clearCoin() {
                this.coin_ = GeneratedMessageLite.emptyProtobufList();
            }

            /* access modifiers changed from: private */
            public void clearContractAddress() {
                this.contractAddress_ = getDefaultInstance().getContractAddress();
            }

            /* access modifiers changed from: private */
            public void clearMsg() {
                this.msg_ = getDefaultInstance().getMsg();
            }

            /* access modifiers changed from: private */
            public void clearRecipientContractAddress() {
                this.recipientContractAddress_ = getDefaultInstance().getRecipientContractAddress();
            }

            /* access modifiers changed from: private */
            public void clearSenderAddress() {
                this.senderAddress_ = getDefaultInstance().getSenderAddress();
            }

            private void ensureCoinIsMutable() {
                C5011t.C5020i<String> iVar = this.coin_;
                if (!iVar.mo37090v()) {
                    this.coin_ = GeneratedMessageLite.mutableCopy(iVar);
                }
            }

            public static WasmExecuteContractSend getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static WasmExecuteContractSend parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (WasmExecuteContractSend) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static WasmExecuteContractSend parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (WasmExecuteContractSend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<WasmExecuteContractSend> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setAmount(ByteString byteString) {
                byteString.getClass();
                this.amount_ = byteString;
            }

            /* access modifiers changed from: private */
            public void setCoin(int i, String str) {
                str.getClass();
                ensureCoinIsMutable();
                this.coin_.set(i, str);
            }

            /* access modifiers changed from: private */
            public void setContractAddress(String str) {
                str.getClass();
                this.contractAddress_ = str;
            }

            /* access modifiers changed from: private */
            public void setContractAddressBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.contractAddress_ = byteString.toStringUtf8();
            }

            /* access modifiers changed from: private */
            public void setMsg(String str) {
                str.getClass();
                this.msg_ = str;
            }

            /* access modifiers changed from: private */
            public void setMsgBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.msg_ = byteString.toStringUtf8();
            }

            /* access modifiers changed from: private */
            public void setRecipientContractAddress(String str) {
                str.getClass();
                this.recipientContractAddress_ = str;
            }

            /* access modifiers changed from: private */
            public void setRecipientContractAddressBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.recipientContractAddress_ = byteString.toStringUtf8();
            }

            /* access modifiers changed from: private */
            public void setSenderAddress(String str) {
                str.getClass();
                this.senderAddress_ = str;
            }

            /* access modifiers changed from: private */
            public void setSenderAddressBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.senderAddress_ = byteString.toStringUtf8();
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97321.f46548xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new WasmExecuteContractSend();
                    case 2:
                        return new Builder((C97321) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\n\u0004Ȉ\u0005Ȉ\u0006Ț", new Object[]{"senderAddress_", "contractAddress_", "amount_", "recipientContractAddress_", "msg_", "coin_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<WasmExecuteContractSend> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (WasmExecuteContractSend.class) {
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

            public ByteString getAmount() {
                return this.amount_;
            }

            public String getCoin(int i) {
                return this.coin_.get(i);
            }

            public ByteString getCoinBytes(int i) {
                return ByteString.copyFromUtf8(this.coin_.get(i));
            }

            public int getCoinCount() {
                return this.coin_.size();
            }

            public List<String> getCoinList() {
                return this.coin_;
            }

            public String getContractAddress() {
                return this.contractAddress_;
            }

            public ByteString getContractAddressBytes() {
                return ByteString.copyFromUtf8(this.contractAddress_);
            }

            public String getMsg() {
                return this.msg_;
            }

            public ByteString getMsgBytes() {
                return ByteString.copyFromUtf8(this.msg_);
            }

            public String getRecipientContractAddress() {
                return this.recipientContractAddress_;
            }

            public ByteString getRecipientContractAddressBytes() {
                return ByteString.copyFromUtf8(this.recipientContractAddress_);
            }

            public String getSenderAddress() {
                return this.senderAddress_;
            }

            public ByteString getSenderAddressBytes() {
                return ByteString.copyFromUtf8(this.senderAddress_);
            }

            public static Builder newBuilder(WasmExecuteContractSend wasmExecuteContractSend) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(wasmExecuteContractSend);
            }

            public static WasmExecuteContractSend parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (WasmExecuteContractSend) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static WasmExecuteContractSend parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (WasmExecuteContractSend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static WasmExecuteContractSend parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (WasmExecuteContractSend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static WasmExecuteContractSend parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (WasmExecuteContractSend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static WasmExecuteContractSend parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (WasmExecuteContractSend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static WasmExecuteContractSend parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (WasmExecuteContractSend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static WasmExecuteContractSend parseFrom(InputStream inputStream) throws IOException {
                return (WasmExecuteContractSend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static WasmExecuteContractSend parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (WasmExecuteContractSend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static WasmExecuteContractSend parseFrom(C4969g gVar) throws IOException {
                return (WasmExecuteContractSend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static WasmExecuteContractSend parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (WasmExecuteContractSend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public interface WasmExecuteContractSendOrBuilder extends qu3 {
            ByteString getAmount();

            String getCoin(int i);

            ByteString getCoinBytes(int i);

            int getCoinCount();

            List<String> getCoinList();

            String getContractAddress();

            ByteString getContractAddressBytes();

            /* synthetic */ C4956c0 getDefaultInstanceForType();

            String getMsg();

            ByteString getMsgBytes();

            String getRecipientContractAddress();

            ByteString getRecipientContractAddressBytes();

            String getSenderAddress();

            ByteString getSenderAddressBytes();

            /* synthetic */ boolean isInitialized();
        }

        public static final class WasmExecuteContractTransfer extends GeneratedMessageLite<WasmExecuteContractTransfer, Builder> implements WasmExecuteContractTransferOrBuilder {
            public static final int AMOUNT_FIELD_NUMBER = 3;
            public static final int CONTRACT_ADDRESS_FIELD_NUMBER = 2;
            /* access modifiers changed from: private */
            public static final WasmExecuteContractTransfer DEFAULT_INSTANCE;
            private static volatile im4<WasmExecuteContractTransfer> PARSER = null;
            public static final int RECIPIENT_ADDRESS_FIELD_NUMBER = 4;
            public static final int SENDER_ADDRESS_FIELD_NUMBER = 1;
            private ByteString amount_ = ByteString.EMPTY;
            private String contractAddress_ = "";
            private String recipientAddress_ = "";
            private String senderAddress_ = "";

            public static final class Builder extends GeneratedMessageLite.C4930a<WasmExecuteContractTransfer, Builder> implements WasmExecuteContractTransferOrBuilder {
                public /* synthetic */ Builder(C97321 r1) {
                    this();
                }

                public Builder clearAmount() {
                    copyOnWrite();
                    ((WasmExecuteContractTransfer) this.instance).clearAmount();
                    return this;
                }

                public Builder clearContractAddress() {
                    copyOnWrite();
                    ((WasmExecuteContractTransfer) this.instance).clearContractAddress();
                    return this;
                }

                public Builder clearRecipientAddress() {
                    copyOnWrite();
                    ((WasmExecuteContractTransfer) this.instance).clearRecipientAddress();
                    return this;
                }

                public Builder clearSenderAddress() {
                    copyOnWrite();
                    ((WasmExecuteContractTransfer) this.instance).clearSenderAddress();
                    return this;
                }

                public ByteString getAmount() {
                    return ((WasmExecuteContractTransfer) this.instance).getAmount();
                }

                public String getContractAddress() {
                    return ((WasmExecuteContractTransfer) this.instance).getContractAddress();
                }

                public ByteString getContractAddressBytes() {
                    return ((WasmExecuteContractTransfer) this.instance).getContractAddressBytes();
                }

                public String getRecipientAddress() {
                    return ((WasmExecuteContractTransfer) this.instance).getRecipientAddress();
                }

                public ByteString getRecipientAddressBytes() {
                    return ((WasmExecuteContractTransfer) this.instance).getRecipientAddressBytes();
                }

                public String getSenderAddress() {
                    return ((WasmExecuteContractTransfer) this.instance).getSenderAddress();
                }

                public ByteString getSenderAddressBytes() {
                    return ((WasmExecuteContractTransfer) this.instance).getSenderAddressBytes();
                }

                public Builder setAmount(ByteString byteString) {
                    copyOnWrite();
                    ((WasmExecuteContractTransfer) this.instance).setAmount(byteString);
                    return this;
                }

                public Builder setContractAddress(String str) {
                    copyOnWrite();
                    ((WasmExecuteContractTransfer) this.instance).setContractAddress(str);
                    return this;
                }

                public Builder setContractAddressBytes(ByteString byteString) {
                    copyOnWrite();
                    ((WasmExecuteContractTransfer) this.instance).setContractAddressBytes(byteString);
                    return this;
                }

                public Builder setRecipientAddress(String str) {
                    copyOnWrite();
                    ((WasmExecuteContractTransfer) this.instance).setRecipientAddress(str);
                    return this;
                }

                public Builder setRecipientAddressBytes(ByteString byteString) {
                    copyOnWrite();
                    ((WasmExecuteContractTransfer) this.instance).setRecipientAddressBytes(byteString);
                    return this;
                }

                public Builder setSenderAddress(String str) {
                    copyOnWrite();
                    ((WasmExecuteContractTransfer) this.instance).setSenderAddress(str);
                    return this;
                }

                public Builder setSenderAddressBytes(ByteString byteString) {
                    copyOnWrite();
                    ((WasmExecuteContractTransfer) this.instance).setSenderAddressBytes(byteString);
                    return this;
                }

                private Builder() {
                    super(WasmExecuteContractTransfer.DEFAULT_INSTANCE);
                }
            }

            static {
                WasmExecuteContractTransfer wasmExecuteContractTransfer = new WasmExecuteContractTransfer();
                DEFAULT_INSTANCE = wasmExecuteContractTransfer;
                GeneratedMessageLite.registerDefaultInstance(WasmExecuteContractTransfer.class, wasmExecuteContractTransfer);
            }

            private WasmExecuteContractTransfer() {
            }

            /* access modifiers changed from: private */
            public void clearAmount() {
                this.amount_ = getDefaultInstance().getAmount();
            }

            /* access modifiers changed from: private */
            public void clearContractAddress() {
                this.contractAddress_ = getDefaultInstance().getContractAddress();
            }

            /* access modifiers changed from: private */
            public void clearRecipientAddress() {
                this.recipientAddress_ = getDefaultInstance().getRecipientAddress();
            }

            /* access modifiers changed from: private */
            public void clearSenderAddress() {
                this.senderAddress_ = getDefaultInstance().getSenderAddress();
            }

            public static WasmExecuteContractTransfer getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static WasmExecuteContractTransfer parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (WasmExecuteContractTransfer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static WasmExecuteContractTransfer parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (WasmExecuteContractTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<WasmExecuteContractTransfer> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setAmount(ByteString byteString) {
                byteString.getClass();
                this.amount_ = byteString;
            }

            /* access modifiers changed from: private */
            public void setContractAddress(String str) {
                str.getClass();
                this.contractAddress_ = str;
            }

            /* access modifiers changed from: private */
            public void setContractAddressBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.contractAddress_ = byteString.toStringUtf8();
            }

            /* access modifiers changed from: private */
            public void setRecipientAddress(String str) {
                str.getClass();
                this.recipientAddress_ = str;
            }

            /* access modifiers changed from: private */
            public void setRecipientAddressBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.recipientAddress_ = byteString.toStringUtf8();
            }

            /* access modifiers changed from: private */
            public void setSenderAddress(String str) {
                str.getClass();
                this.senderAddress_ = str;
            }

            /* access modifiers changed from: private */
            public void setSenderAddressBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.senderAddress_ = byteString.toStringUtf8();
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97321.f46548xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new WasmExecuteContractTransfer();
                    case 2:
                        return new Builder((C97321) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\n\u0004Ȉ", new Object[]{"senderAddress_", "contractAddress_", "amount_", "recipientAddress_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<WasmExecuteContractTransfer> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (WasmExecuteContractTransfer.class) {
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

            public ByteString getAmount() {
                return this.amount_;
            }

            public String getContractAddress() {
                return this.contractAddress_;
            }

            public ByteString getContractAddressBytes() {
                return ByteString.copyFromUtf8(this.contractAddress_);
            }

            public String getRecipientAddress() {
                return this.recipientAddress_;
            }

            public ByteString getRecipientAddressBytes() {
                return ByteString.copyFromUtf8(this.recipientAddress_);
            }

            public String getSenderAddress() {
                return this.senderAddress_;
            }

            public ByteString getSenderAddressBytes() {
                return ByteString.copyFromUtf8(this.senderAddress_);
            }

            public static Builder newBuilder(WasmExecuteContractTransfer wasmExecuteContractTransfer) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(wasmExecuteContractTransfer);
            }

            public static WasmExecuteContractTransfer parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (WasmExecuteContractTransfer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static WasmExecuteContractTransfer parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (WasmExecuteContractTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static WasmExecuteContractTransfer parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (WasmExecuteContractTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static WasmExecuteContractTransfer parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (WasmExecuteContractTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static WasmExecuteContractTransfer parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (WasmExecuteContractTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static WasmExecuteContractTransfer parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (WasmExecuteContractTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static WasmExecuteContractTransfer parseFrom(InputStream inputStream) throws IOException {
                return (WasmExecuteContractTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static WasmExecuteContractTransfer parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (WasmExecuteContractTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static WasmExecuteContractTransfer parseFrom(C4969g gVar) throws IOException {
                return (WasmExecuteContractTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static WasmExecuteContractTransfer parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (WasmExecuteContractTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public interface WasmExecuteContractTransferOrBuilder extends qu3 {
            ByteString getAmount();

            String getContractAddress();

            ByteString getContractAddressBytes();

            /* synthetic */ C4956c0 getDefaultInstanceForType();

            String getRecipientAddress();

            ByteString getRecipientAddressBytes();

            String getSenderAddress();

            ByteString getSenderAddressBytes();

            /* synthetic */ boolean isInitialized();
        }

        public static final class WasmTerraExecuteContractGeneric extends GeneratedMessageLite<WasmTerraExecuteContractGeneric, Builder> implements WasmTerraExecuteContractGenericOrBuilder {
            public static final int COINS_FIELD_NUMBER = 5;
            public static final int CONTRACT_ADDRESS_FIELD_NUMBER = 2;
            /* access modifiers changed from: private */
            public static final WasmTerraExecuteContractGeneric DEFAULT_INSTANCE;
            public static final int EXECUTE_MSG_FIELD_NUMBER = 3;
            private static volatile im4<WasmTerraExecuteContractGeneric> PARSER = null;
            public static final int SENDER_ADDRESS_FIELD_NUMBER = 1;
            private C5011t.C5020i<Amount> coins_ = GeneratedMessageLite.emptyProtobufList();
            private String contractAddress_ = "";
            private String executeMsg_ = "";
            private String senderAddress_ = "";

            public static final class Builder extends GeneratedMessageLite.C4930a<WasmTerraExecuteContractGeneric, Builder> implements WasmTerraExecuteContractGenericOrBuilder {
                public /* synthetic */ Builder(C97321 r1) {
                    this();
                }

                public Builder addAllCoins(Iterable<? extends Amount> iterable) {
                    copyOnWrite();
                    ((WasmTerraExecuteContractGeneric) this.instance).addAllCoins(iterable);
                    return this;
                }

                public Builder addCoins(Amount amount) {
                    copyOnWrite();
                    ((WasmTerraExecuteContractGeneric) this.instance).addCoins(amount);
                    return this;
                }

                public Builder clearCoins() {
                    copyOnWrite();
                    ((WasmTerraExecuteContractGeneric) this.instance).clearCoins();
                    return this;
                }

                public Builder clearContractAddress() {
                    copyOnWrite();
                    ((WasmTerraExecuteContractGeneric) this.instance).clearContractAddress();
                    return this;
                }

                public Builder clearExecuteMsg() {
                    copyOnWrite();
                    ((WasmTerraExecuteContractGeneric) this.instance).clearExecuteMsg();
                    return this;
                }

                public Builder clearSenderAddress() {
                    copyOnWrite();
                    ((WasmTerraExecuteContractGeneric) this.instance).clearSenderAddress();
                    return this;
                }

                public Amount getCoins(int i) {
                    return ((WasmTerraExecuteContractGeneric) this.instance).getCoins(i);
                }

                public int getCoinsCount() {
                    return ((WasmTerraExecuteContractGeneric) this.instance).getCoinsCount();
                }

                public List<Amount> getCoinsList() {
                    return Collections.unmodifiableList(((WasmTerraExecuteContractGeneric) this.instance).getCoinsList());
                }

                public String getContractAddress() {
                    return ((WasmTerraExecuteContractGeneric) this.instance).getContractAddress();
                }

                public ByteString getContractAddressBytes() {
                    return ((WasmTerraExecuteContractGeneric) this.instance).getContractAddressBytes();
                }

                public String getExecuteMsg() {
                    return ((WasmTerraExecuteContractGeneric) this.instance).getExecuteMsg();
                }

                public ByteString getExecuteMsgBytes() {
                    return ((WasmTerraExecuteContractGeneric) this.instance).getExecuteMsgBytes();
                }

                public String getSenderAddress() {
                    return ((WasmTerraExecuteContractGeneric) this.instance).getSenderAddress();
                }

                public ByteString getSenderAddressBytes() {
                    return ((WasmTerraExecuteContractGeneric) this.instance).getSenderAddressBytes();
                }

                public Builder removeCoins(int i) {
                    copyOnWrite();
                    ((WasmTerraExecuteContractGeneric) this.instance).removeCoins(i);
                    return this;
                }

                public Builder setCoins(int i, Amount amount) {
                    copyOnWrite();
                    ((WasmTerraExecuteContractGeneric) this.instance).setCoins(i, amount);
                    return this;
                }

                public Builder setContractAddress(String str) {
                    copyOnWrite();
                    ((WasmTerraExecuteContractGeneric) this.instance).setContractAddress(str);
                    return this;
                }

                public Builder setContractAddressBytes(ByteString byteString) {
                    copyOnWrite();
                    ((WasmTerraExecuteContractGeneric) this.instance).setContractAddressBytes(byteString);
                    return this;
                }

                public Builder setExecuteMsg(String str) {
                    copyOnWrite();
                    ((WasmTerraExecuteContractGeneric) this.instance).setExecuteMsg(str);
                    return this;
                }

                public Builder setExecuteMsgBytes(ByteString byteString) {
                    copyOnWrite();
                    ((WasmTerraExecuteContractGeneric) this.instance).setExecuteMsgBytes(byteString);
                    return this;
                }

                public Builder setSenderAddress(String str) {
                    copyOnWrite();
                    ((WasmTerraExecuteContractGeneric) this.instance).setSenderAddress(str);
                    return this;
                }

                public Builder setSenderAddressBytes(ByteString byteString) {
                    copyOnWrite();
                    ((WasmTerraExecuteContractGeneric) this.instance).setSenderAddressBytes(byteString);
                    return this;
                }

                private Builder() {
                    super(WasmTerraExecuteContractGeneric.DEFAULT_INSTANCE);
                }

                public Builder addCoins(int i, Amount amount) {
                    copyOnWrite();
                    ((WasmTerraExecuteContractGeneric) this.instance).addCoins(i, amount);
                    return this;
                }

                public Builder setCoins(int i, Amount.Builder builder) {
                    copyOnWrite();
                    ((WasmTerraExecuteContractGeneric) this.instance).setCoins(i, (Amount) builder.build());
                    return this;
                }

                public Builder addCoins(Amount.Builder builder) {
                    copyOnWrite();
                    ((WasmTerraExecuteContractGeneric) this.instance).addCoins((Amount) builder.build());
                    return this;
                }

                public Builder addCoins(int i, Amount.Builder builder) {
                    copyOnWrite();
                    ((WasmTerraExecuteContractGeneric) this.instance).addCoins(i, (Amount) builder.build());
                    return this;
                }
            }

            static {
                WasmTerraExecuteContractGeneric wasmTerraExecuteContractGeneric = new WasmTerraExecuteContractGeneric();
                DEFAULT_INSTANCE = wasmTerraExecuteContractGeneric;
                GeneratedMessageLite.registerDefaultInstance(WasmTerraExecuteContractGeneric.class, wasmTerraExecuteContractGeneric);
            }

            private WasmTerraExecuteContractGeneric() {
            }

            /* access modifiers changed from: private */
            public void addAllCoins(Iterable<? extends Amount> iterable) {
                ensureCoinsIsMutable();
                C4949a.addAll(iterable, this.coins_);
            }

            /* access modifiers changed from: private */
            public void addCoins(Amount amount) {
                amount.getClass();
                ensureCoinsIsMutable();
                this.coins_.add(amount);
            }

            /* access modifiers changed from: private */
            public void clearCoins() {
                this.coins_ = GeneratedMessageLite.emptyProtobufList();
            }

            /* access modifiers changed from: private */
            public void clearContractAddress() {
                this.contractAddress_ = getDefaultInstance().getContractAddress();
            }

            /* access modifiers changed from: private */
            public void clearExecuteMsg() {
                this.executeMsg_ = getDefaultInstance().getExecuteMsg();
            }

            /* access modifiers changed from: private */
            public void clearSenderAddress() {
                this.senderAddress_ = getDefaultInstance().getSenderAddress();
            }

            private void ensureCoinsIsMutable() {
                C5011t.C5020i<Amount> iVar = this.coins_;
                if (!iVar.mo37090v()) {
                    this.coins_ = GeneratedMessageLite.mutableCopy(iVar);
                }
            }

            public static WasmTerraExecuteContractGeneric getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static WasmTerraExecuteContractGeneric parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (WasmTerraExecuteContractGeneric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static WasmTerraExecuteContractGeneric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (WasmTerraExecuteContractGeneric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<WasmTerraExecuteContractGeneric> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void removeCoins(int i) {
                ensureCoinsIsMutable();
                this.coins_.remove(i);
            }

            /* access modifiers changed from: private */
            public void setCoins(int i, Amount amount) {
                amount.getClass();
                ensureCoinsIsMutable();
                this.coins_.set(i, amount);
            }

            /* access modifiers changed from: private */
            public void setContractAddress(String str) {
                str.getClass();
                this.contractAddress_ = str;
            }

            /* access modifiers changed from: private */
            public void setContractAddressBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.contractAddress_ = byteString.toStringUtf8();
            }

            /* access modifiers changed from: private */
            public void setExecuteMsg(String str) {
                str.getClass();
                this.executeMsg_ = str;
            }

            /* access modifiers changed from: private */
            public void setExecuteMsgBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.executeMsg_ = byteString.toStringUtf8();
            }

            /* access modifiers changed from: private */
            public void setSenderAddress(String str) {
                str.getClass();
                this.senderAddress_ = str;
            }

            /* access modifiers changed from: private */
            public void setSenderAddressBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.senderAddress_ = byteString.toStringUtf8();
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97321.f46548xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new WasmTerraExecuteContractGeneric();
                    case 2:
                        return new Builder((C97321) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0005\u001b", new Object[]{"senderAddress_", "contractAddress_", "executeMsg_", "coins_", Amount.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<WasmTerraExecuteContractGeneric> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (WasmTerraExecuteContractGeneric.class) {
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

            public Amount getCoins(int i) {
                return this.coins_.get(i);
            }

            public int getCoinsCount() {
                return this.coins_.size();
            }

            public List<Amount> getCoinsList() {
                return this.coins_;
            }

            public AmountOrBuilder getCoinsOrBuilder(int i) {
                return this.coins_.get(i);
            }

            public List<? extends AmountOrBuilder> getCoinsOrBuilderList() {
                return this.coins_;
            }

            public String getContractAddress() {
                return this.contractAddress_;
            }

            public ByteString getContractAddressBytes() {
                return ByteString.copyFromUtf8(this.contractAddress_);
            }

            public String getExecuteMsg() {
                return this.executeMsg_;
            }

            public ByteString getExecuteMsgBytes() {
                return ByteString.copyFromUtf8(this.executeMsg_);
            }

            public String getSenderAddress() {
                return this.senderAddress_;
            }

            public ByteString getSenderAddressBytes() {
                return ByteString.copyFromUtf8(this.senderAddress_);
            }

            public static Builder newBuilder(WasmTerraExecuteContractGeneric wasmTerraExecuteContractGeneric) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(wasmTerraExecuteContractGeneric);
            }

            public static WasmTerraExecuteContractGeneric parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (WasmTerraExecuteContractGeneric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static WasmTerraExecuteContractGeneric parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (WasmTerraExecuteContractGeneric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static WasmTerraExecuteContractGeneric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (WasmTerraExecuteContractGeneric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            /* access modifiers changed from: private */
            public void addCoins(int i, Amount amount) {
                amount.getClass();
                ensureCoinsIsMutable();
                this.coins_.add(i, amount);
            }

            public static WasmTerraExecuteContractGeneric parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (WasmTerraExecuteContractGeneric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static WasmTerraExecuteContractGeneric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (WasmTerraExecuteContractGeneric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static WasmTerraExecuteContractGeneric parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (WasmTerraExecuteContractGeneric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static WasmTerraExecuteContractGeneric parseFrom(InputStream inputStream) throws IOException {
                return (WasmTerraExecuteContractGeneric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static WasmTerraExecuteContractGeneric parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (WasmTerraExecuteContractGeneric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static WasmTerraExecuteContractGeneric parseFrom(C4969g gVar) throws IOException {
                return (WasmTerraExecuteContractGeneric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static WasmTerraExecuteContractGeneric parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (WasmTerraExecuteContractGeneric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public interface WasmTerraExecuteContractGenericOrBuilder extends qu3 {
            Amount getCoins(int i);

            int getCoinsCount();

            List<Amount> getCoinsList();

            String getContractAddress();

            ByteString getContractAddressBytes();

            /* synthetic */ C4956c0 getDefaultInstanceForType();

            String getExecuteMsg();

            ByteString getExecuteMsgBytes();

            String getSenderAddress();

            ByteString getSenderAddressBytes();

            /* synthetic */ boolean isInitialized();
        }

        public static final class WasmTerraExecuteContractSend extends GeneratedMessageLite<WasmTerraExecuteContractSend, Builder> implements WasmTerraExecuteContractSendOrBuilder {
            public static final int AMOUNT_FIELD_NUMBER = 3;
            public static final int COIN_FIELD_NUMBER = 6;
            public static final int CONTRACT_ADDRESS_FIELD_NUMBER = 2;
            /* access modifiers changed from: private */
            public static final WasmTerraExecuteContractSend DEFAULT_INSTANCE;
            public static final int MSG_FIELD_NUMBER = 5;
            private static volatile im4<WasmTerraExecuteContractSend> PARSER = null;
            public static final int RECIPIENT_CONTRACT_ADDRESS_FIELD_NUMBER = 4;
            public static final int SENDER_ADDRESS_FIELD_NUMBER = 1;
            private ByteString amount_ = ByteString.EMPTY;
            private C5011t.C5020i<String> coin_ = GeneratedMessageLite.emptyProtobufList();
            private String contractAddress_ = "";
            private String msg_ = "";
            private String recipientContractAddress_ = "";
            private String senderAddress_ = "";

            public static final class Builder extends GeneratedMessageLite.C4930a<WasmTerraExecuteContractSend, Builder> implements WasmTerraExecuteContractSendOrBuilder {
                public /* synthetic */ Builder(C97321 r1) {
                    this();
                }

                public Builder addAllCoin(Iterable<String> iterable) {
                    copyOnWrite();
                    ((WasmTerraExecuteContractSend) this.instance).addAllCoin(iterable);
                    return this;
                }

                public Builder addCoin(String str) {
                    copyOnWrite();
                    ((WasmTerraExecuteContractSend) this.instance).addCoin(str);
                    return this;
                }

                public Builder addCoinBytes(ByteString byteString) {
                    copyOnWrite();
                    ((WasmTerraExecuteContractSend) this.instance).addCoinBytes(byteString);
                    return this;
                }

                public Builder clearAmount() {
                    copyOnWrite();
                    ((WasmTerraExecuteContractSend) this.instance).clearAmount();
                    return this;
                }

                public Builder clearCoin() {
                    copyOnWrite();
                    ((WasmTerraExecuteContractSend) this.instance).clearCoin();
                    return this;
                }

                public Builder clearContractAddress() {
                    copyOnWrite();
                    ((WasmTerraExecuteContractSend) this.instance).clearContractAddress();
                    return this;
                }

                public Builder clearMsg() {
                    copyOnWrite();
                    ((WasmTerraExecuteContractSend) this.instance).clearMsg();
                    return this;
                }

                public Builder clearRecipientContractAddress() {
                    copyOnWrite();
                    ((WasmTerraExecuteContractSend) this.instance).clearRecipientContractAddress();
                    return this;
                }

                public Builder clearSenderAddress() {
                    copyOnWrite();
                    ((WasmTerraExecuteContractSend) this.instance).clearSenderAddress();
                    return this;
                }

                public ByteString getAmount() {
                    return ((WasmTerraExecuteContractSend) this.instance).getAmount();
                }

                public String getCoin(int i) {
                    return ((WasmTerraExecuteContractSend) this.instance).getCoin(i);
                }

                public ByteString getCoinBytes(int i) {
                    return ((WasmTerraExecuteContractSend) this.instance).getCoinBytes(i);
                }

                public int getCoinCount() {
                    return ((WasmTerraExecuteContractSend) this.instance).getCoinCount();
                }

                public List<String> getCoinList() {
                    return Collections.unmodifiableList(((WasmTerraExecuteContractSend) this.instance).getCoinList());
                }

                public String getContractAddress() {
                    return ((WasmTerraExecuteContractSend) this.instance).getContractAddress();
                }

                public ByteString getContractAddressBytes() {
                    return ((WasmTerraExecuteContractSend) this.instance).getContractAddressBytes();
                }

                public String getMsg() {
                    return ((WasmTerraExecuteContractSend) this.instance).getMsg();
                }

                public ByteString getMsgBytes() {
                    return ((WasmTerraExecuteContractSend) this.instance).getMsgBytes();
                }

                public String getRecipientContractAddress() {
                    return ((WasmTerraExecuteContractSend) this.instance).getRecipientContractAddress();
                }

                public ByteString getRecipientContractAddressBytes() {
                    return ((WasmTerraExecuteContractSend) this.instance).getRecipientContractAddressBytes();
                }

                public String getSenderAddress() {
                    return ((WasmTerraExecuteContractSend) this.instance).getSenderAddress();
                }

                public ByteString getSenderAddressBytes() {
                    return ((WasmTerraExecuteContractSend) this.instance).getSenderAddressBytes();
                }

                public Builder setAmount(ByteString byteString) {
                    copyOnWrite();
                    ((WasmTerraExecuteContractSend) this.instance).setAmount(byteString);
                    return this;
                }

                public Builder setCoin(int i, String str) {
                    copyOnWrite();
                    ((WasmTerraExecuteContractSend) this.instance).setCoin(i, str);
                    return this;
                }

                public Builder setContractAddress(String str) {
                    copyOnWrite();
                    ((WasmTerraExecuteContractSend) this.instance).setContractAddress(str);
                    return this;
                }

                public Builder setContractAddressBytes(ByteString byteString) {
                    copyOnWrite();
                    ((WasmTerraExecuteContractSend) this.instance).setContractAddressBytes(byteString);
                    return this;
                }

                public Builder setMsg(String str) {
                    copyOnWrite();
                    ((WasmTerraExecuteContractSend) this.instance).setMsg(str);
                    return this;
                }

                public Builder setMsgBytes(ByteString byteString) {
                    copyOnWrite();
                    ((WasmTerraExecuteContractSend) this.instance).setMsgBytes(byteString);
                    return this;
                }

                public Builder setRecipientContractAddress(String str) {
                    copyOnWrite();
                    ((WasmTerraExecuteContractSend) this.instance).setRecipientContractAddress(str);
                    return this;
                }

                public Builder setRecipientContractAddressBytes(ByteString byteString) {
                    copyOnWrite();
                    ((WasmTerraExecuteContractSend) this.instance).setRecipientContractAddressBytes(byteString);
                    return this;
                }

                public Builder setSenderAddress(String str) {
                    copyOnWrite();
                    ((WasmTerraExecuteContractSend) this.instance).setSenderAddress(str);
                    return this;
                }

                public Builder setSenderAddressBytes(ByteString byteString) {
                    copyOnWrite();
                    ((WasmTerraExecuteContractSend) this.instance).setSenderAddressBytes(byteString);
                    return this;
                }

                private Builder() {
                    super(WasmTerraExecuteContractSend.DEFAULT_INSTANCE);
                }
            }

            static {
                WasmTerraExecuteContractSend wasmTerraExecuteContractSend = new WasmTerraExecuteContractSend();
                DEFAULT_INSTANCE = wasmTerraExecuteContractSend;
                GeneratedMessageLite.registerDefaultInstance(WasmTerraExecuteContractSend.class, wasmTerraExecuteContractSend);
            }

            private WasmTerraExecuteContractSend() {
            }

            /* access modifiers changed from: private */
            public void addAllCoin(Iterable<String> iterable) {
                ensureCoinIsMutable();
                C4949a.addAll(iterable, this.coin_);
            }

            /* access modifiers changed from: private */
            public void addCoin(String str) {
                str.getClass();
                ensureCoinIsMutable();
                this.coin_.add(str);
            }

            /* access modifiers changed from: private */
            public void addCoinBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                ensureCoinIsMutable();
                this.coin_.add(byteString.toStringUtf8());
            }

            /* access modifiers changed from: private */
            public void clearAmount() {
                this.amount_ = getDefaultInstance().getAmount();
            }

            /* access modifiers changed from: private */
            public void clearCoin() {
                this.coin_ = GeneratedMessageLite.emptyProtobufList();
            }

            /* access modifiers changed from: private */
            public void clearContractAddress() {
                this.contractAddress_ = getDefaultInstance().getContractAddress();
            }

            /* access modifiers changed from: private */
            public void clearMsg() {
                this.msg_ = getDefaultInstance().getMsg();
            }

            /* access modifiers changed from: private */
            public void clearRecipientContractAddress() {
                this.recipientContractAddress_ = getDefaultInstance().getRecipientContractAddress();
            }

            /* access modifiers changed from: private */
            public void clearSenderAddress() {
                this.senderAddress_ = getDefaultInstance().getSenderAddress();
            }

            private void ensureCoinIsMutable() {
                C5011t.C5020i<String> iVar = this.coin_;
                if (!iVar.mo37090v()) {
                    this.coin_ = GeneratedMessageLite.mutableCopy(iVar);
                }
            }

            public static WasmTerraExecuteContractSend getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static WasmTerraExecuteContractSend parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (WasmTerraExecuteContractSend) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static WasmTerraExecuteContractSend parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (WasmTerraExecuteContractSend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<WasmTerraExecuteContractSend> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setAmount(ByteString byteString) {
                byteString.getClass();
                this.amount_ = byteString;
            }

            /* access modifiers changed from: private */
            public void setCoin(int i, String str) {
                str.getClass();
                ensureCoinIsMutable();
                this.coin_.set(i, str);
            }

            /* access modifiers changed from: private */
            public void setContractAddress(String str) {
                str.getClass();
                this.contractAddress_ = str;
            }

            /* access modifiers changed from: private */
            public void setContractAddressBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.contractAddress_ = byteString.toStringUtf8();
            }

            /* access modifiers changed from: private */
            public void setMsg(String str) {
                str.getClass();
                this.msg_ = str;
            }

            /* access modifiers changed from: private */
            public void setMsgBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.msg_ = byteString.toStringUtf8();
            }

            /* access modifiers changed from: private */
            public void setRecipientContractAddress(String str) {
                str.getClass();
                this.recipientContractAddress_ = str;
            }

            /* access modifiers changed from: private */
            public void setRecipientContractAddressBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.recipientContractAddress_ = byteString.toStringUtf8();
            }

            /* access modifiers changed from: private */
            public void setSenderAddress(String str) {
                str.getClass();
                this.senderAddress_ = str;
            }

            /* access modifiers changed from: private */
            public void setSenderAddressBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.senderAddress_ = byteString.toStringUtf8();
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97321.f46548xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new WasmTerraExecuteContractSend();
                    case 2:
                        return new Builder((C97321) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\n\u0004Ȉ\u0005Ȉ\u0006Ț", new Object[]{"senderAddress_", "contractAddress_", "amount_", "recipientContractAddress_", "msg_", "coin_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<WasmTerraExecuteContractSend> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (WasmTerraExecuteContractSend.class) {
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

            public ByteString getAmount() {
                return this.amount_;
            }

            public String getCoin(int i) {
                return this.coin_.get(i);
            }

            public ByteString getCoinBytes(int i) {
                return ByteString.copyFromUtf8(this.coin_.get(i));
            }

            public int getCoinCount() {
                return this.coin_.size();
            }

            public List<String> getCoinList() {
                return this.coin_;
            }

            public String getContractAddress() {
                return this.contractAddress_;
            }

            public ByteString getContractAddressBytes() {
                return ByteString.copyFromUtf8(this.contractAddress_);
            }

            public String getMsg() {
                return this.msg_;
            }

            public ByteString getMsgBytes() {
                return ByteString.copyFromUtf8(this.msg_);
            }

            public String getRecipientContractAddress() {
                return this.recipientContractAddress_;
            }

            public ByteString getRecipientContractAddressBytes() {
                return ByteString.copyFromUtf8(this.recipientContractAddress_);
            }

            public String getSenderAddress() {
                return this.senderAddress_;
            }

            public ByteString getSenderAddressBytes() {
                return ByteString.copyFromUtf8(this.senderAddress_);
            }

            public static Builder newBuilder(WasmTerraExecuteContractSend wasmTerraExecuteContractSend) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(wasmTerraExecuteContractSend);
            }

            public static WasmTerraExecuteContractSend parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (WasmTerraExecuteContractSend) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static WasmTerraExecuteContractSend parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (WasmTerraExecuteContractSend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static WasmTerraExecuteContractSend parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (WasmTerraExecuteContractSend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static WasmTerraExecuteContractSend parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (WasmTerraExecuteContractSend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static WasmTerraExecuteContractSend parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (WasmTerraExecuteContractSend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static WasmTerraExecuteContractSend parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (WasmTerraExecuteContractSend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static WasmTerraExecuteContractSend parseFrom(InputStream inputStream) throws IOException {
                return (WasmTerraExecuteContractSend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static WasmTerraExecuteContractSend parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (WasmTerraExecuteContractSend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static WasmTerraExecuteContractSend parseFrom(C4969g gVar) throws IOException {
                return (WasmTerraExecuteContractSend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static WasmTerraExecuteContractSend parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (WasmTerraExecuteContractSend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public interface WasmTerraExecuteContractSendOrBuilder extends qu3 {
            ByteString getAmount();

            String getCoin(int i);

            ByteString getCoinBytes(int i);

            int getCoinCount();

            List<String> getCoinList();

            String getContractAddress();

            ByteString getContractAddressBytes();

            /* synthetic */ C4956c0 getDefaultInstanceForType();

            String getMsg();

            ByteString getMsgBytes();

            String getRecipientContractAddress();

            ByteString getRecipientContractAddressBytes();

            String getSenderAddress();

            ByteString getSenderAddressBytes();

            /* synthetic */ boolean isInitialized();
        }

        public static final class WasmTerraExecuteContractTransfer extends GeneratedMessageLite<WasmTerraExecuteContractTransfer, Builder> implements WasmTerraExecuteContractTransferOrBuilder {
            public static final int AMOUNT_FIELD_NUMBER = 3;
            public static final int CONTRACT_ADDRESS_FIELD_NUMBER = 2;
            /* access modifiers changed from: private */
            public static final WasmTerraExecuteContractTransfer DEFAULT_INSTANCE;
            private static volatile im4<WasmTerraExecuteContractTransfer> PARSER = null;
            public static final int RECIPIENT_ADDRESS_FIELD_NUMBER = 4;
            public static final int SENDER_ADDRESS_FIELD_NUMBER = 1;
            private ByteString amount_ = ByteString.EMPTY;
            private String contractAddress_ = "";
            private String recipientAddress_ = "";
            private String senderAddress_ = "";

            public static final class Builder extends GeneratedMessageLite.C4930a<WasmTerraExecuteContractTransfer, Builder> implements WasmTerraExecuteContractTransferOrBuilder {
                public /* synthetic */ Builder(C97321 r1) {
                    this();
                }

                public Builder clearAmount() {
                    copyOnWrite();
                    ((WasmTerraExecuteContractTransfer) this.instance).clearAmount();
                    return this;
                }

                public Builder clearContractAddress() {
                    copyOnWrite();
                    ((WasmTerraExecuteContractTransfer) this.instance).clearContractAddress();
                    return this;
                }

                public Builder clearRecipientAddress() {
                    copyOnWrite();
                    ((WasmTerraExecuteContractTransfer) this.instance).clearRecipientAddress();
                    return this;
                }

                public Builder clearSenderAddress() {
                    copyOnWrite();
                    ((WasmTerraExecuteContractTransfer) this.instance).clearSenderAddress();
                    return this;
                }

                public ByteString getAmount() {
                    return ((WasmTerraExecuteContractTransfer) this.instance).getAmount();
                }

                public String getContractAddress() {
                    return ((WasmTerraExecuteContractTransfer) this.instance).getContractAddress();
                }

                public ByteString getContractAddressBytes() {
                    return ((WasmTerraExecuteContractTransfer) this.instance).getContractAddressBytes();
                }

                public String getRecipientAddress() {
                    return ((WasmTerraExecuteContractTransfer) this.instance).getRecipientAddress();
                }

                public ByteString getRecipientAddressBytes() {
                    return ((WasmTerraExecuteContractTransfer) this.instance).getRecipientAddressBytes();
                }

                public String getSenderAddress() {
                    return ((WasmTerraExecuteContractTransfer) this.instance).getSenderAddress();
                }

                public ByteString getSenderAddressBytes() {
                    return ((WasmTerraExecuteContractTransfer) this.instance).getSenderAddressBytes();
                }

                public Builder setAmount(ByteString byteString) {
                    copyOnWrite();
                    ((WasmTerraExecuteContractTransfer) this.instance).setAmount(byteString);
                    return this;
                }

                public Builder setContractAddress(String str) {
                    copyOnWrite();
                    ((WasmTerraExecuteContractTransfer) this.instance).setContractAddress(str);
                    return this;
                }

                public Builder setContractAddressBytes(ByteString byteString) {
                    copyOnWrite();
                    ((WasmTerraExecuteContractTransfer) this.instance).setContractAddressBytes(byteString);
                    return this;
                }

                public Builder setRecipientAddress(String str) {
                    copyOnWrite();
                    ((WasmTerraExecuteContractTransfer) this.instance).setRecipientAddress(str);
                    return this;
                }

                public Builder setRecipientAddressBytes(ByteString byteString) {
                    copyOnWrite();
                    ((WasmTerraExecuteContractTransfer) this.instance).setRecipientAddressBytes(byteString);
                    return this;
                }

                public Builder setSenderAddress(String str) {
                    copyOnWrite();
                    ((WasmTerraExecuteContractTransfer) this.instance).setSenderAddress(str);
                    return this;
                }

                public Builder setSenderAddressBytes(ByteString byteString) {
                    copyOnWrite();
                    ((WasmTerraExecuteContractTransfer) this.instance).setSenderAddressBytes(byteString);
                    return this;
                }

                private Builder() {
                    super(WasmTerraExecuteContractTransfer.DEFAULT_INSTANCE);
                }
            }

            static {
                WasmTerraExecuteContractTransfer wasmTerraExecuteContractTransfer = new WasmTerraExecuteContractTransfer();
                DEFAULT_INSTANCE = wasmTerraExecuteContractTransfer;
                GeneratedMessageLite.registerDefaultInstance(WasmTerraExecuteContractTransfer.class, wasmTerraExecuteContractTransfer);
            }

            private WasmTerraExecuteContractTransfer() {
            }

            /* access modifiers changed from: private */
            public void clearAmount() {
                this.amount_ = getDefaultInstance().getAmount();
            }

            /* access modifiers changed from: private */
            public void clearContractAddress() {
                this.contractAddress_ = getDefaultInstance().getContractAddress();
            }

            /* access modifiers changed from: private */
            public void clearRecipientAddress() {
                this.recipientAddress_ = getDefaultInstance().getRecipientAddress();
            }

            /* access modifiers changed from: private */
            public void clearSenderAddress() {
                this.senderAddress_ = getDefaultInstance().getSenderAddress();
            }

            public static WasmTerraExecuteContractTransfer getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static WasmTerraExecuteContractTransfer parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (WasmTerraExecuteContractTransfer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static WasmTerraExecuteContractTransfer parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (WasmTerraExecuteContractTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<WasmTerraExecuteContractTransfer> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setAmount(ByteString byteString) {
                byteString.getClass();
                this.amount_ = byteString;
            }

            /* access modifiers changed from: private */
            public void setContractAddress(String str) {
                str.getClass();
                this.contractAddress_ = str;
            }

            /* access modifiers changed from: private */
            public void setContractAddressBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.contractAddress_ = byteString.toStringUtf8();
            }

            /* access modifiers changed from: private */
            public void setRecipientAddress(String str) {
                str.getClass();
                this.recipientAddress_ = str;
            }

            /* access modifiers changed from: private */
            public void setRecipientAddressBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.recipientAddress_ = byteString.toStringUtf8();
            }

            /* access modifiers changed from: private */
            public void setSenderAddress(String str) {
                str.getClass();
                this.senderAddress_ = str;
            }

            /* access modifiers changed from: private */
            public void setSenderAddressBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.senderAddress_ = byteString.toStringUtf8();
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97321.f46548xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new WasmTerraExecuteContractTransfer();
                    case 2:
                        return new Builder((C97321) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\n\u0004Ȉ", new Object[]{"senderAddress_", "contractAddress_", "amount_", "recipientAddress_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<WasmTerraExecuteContractTransfer> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (WasmTerraExecuteContractTransfer.class) {
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

            public ByteString getAmount() {
                return this.amount_;
            }

            public String getContractAddress() {
                return this.contractAddress_;
            }

            public ByteString getContractAddressBytes() {
                return ByteString.copyFromUtf8(this.contractAddress_);
            }

            public String getRecipientAddress() {
                return this.recipientAddress_;
            }

            public ByteString getRecipientAddressBytes() {
                return ByteString.copyFromUtf8(this.recipientAddress_);
            }

            public String getSenderAddress() {
                return this.senderAddress_;
            }

            public ByteString getSenderAddressBytes() {
                return ByteString.copyFromUtf8(this.senderAddress_);
            }

            public static Builder newBuilder(WasmTerraExecuteContractTransfer wasmTerraExecuteContractTransfer) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(wasmTerraExecuteContractTransfer);
            }

            public static WasmTerraExecuteContractTransfer parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (WasmTerraExecuteContractTransfer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static WasmTerraExecuteContractTransfer parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (WasmTerraExecuteContractTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static WasmTerraExecuteContractTransfer parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (WasmTerraExecuteContractTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static WasmTerraExecuteContractTransfer parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (WasmTerraExecuteContractTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static WasmTerraExecuteContractTransfer parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (WasmTerraExecuteContractTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static WasmTerraExecuteContractTransfer parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (WasmTerraExecuteContractTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static WasmTerraExecuteContractTransfer parseFrom(InputStream inputStream) throws IOException {
                return (WasmTerraExecuteContractTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static WasmTerraExecuteContractTransfer parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (WasmTerraExecuteContractTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static WasmTerraExecuteContractTransfer parseFrom(C4969g gVar) throws IOException {
                return (WasmTerraExecuteContractTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static WasmTerraExecuteContractTransfer parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (WasmTerraExecuteContractTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public interface WasmTerraExecuteContractTransferOrBuilder extends qu3 {
            ByteString getAmount();

            String getContractAddress();

            ByteString getContractAddressBytes();

            /* synthetic */ C4956c0 getDefaultInstanceForType();

            String getRecipientAddress();

            ByteString getRecipientAddressBytes();

            String getSenderAddress();

            ByteString getSenderAddressBytes();

            /* synthetic */ boolean isInitialized();
        }

        public static final class WithdrawDelegationReward extends GeneratedMessageLite<WithdrawDelegationReward, Builder> implements WithdrawDelegationRewardOrBuilder {
            /* access modifiers changed from: private */
            public static final WithdrawDelegationReward DEFAULT_INSTANCE;
            public static final int DELEGATOR_ADDRESS_FIELD_NUMBER = 1;
            private static volatile im4<WithdrawDelegationReward> PARSER = null;
            public static final int TYPE_PREFIX_FIELD_NUMBER = 3;
            public static final int VALIDATOR_ADDRESS_FIELD_NUMBER = 2;
            private String delegatorAddress_ = "";
            private String typePrefix_ = "";
            private String validatorAddress_ = "";

            public static final class Builder extends GeneratedMessageLite.C4930a<WithdrawDelegationReward, Builder> implements WithdrawDelegationRewardOrBuilder {
                public /* synthetic */ Builder(C97321 r1) {
                    this();
                }

                public Builder clearDelegatorAddress() {
                    copyOnWrite();
                    ((WithdrawDelegationReward) this.instance).clearDelegatorAddress();
                    return this;
                }

                public Builder clearTypePrefix() {
                    copyOnWrite();
                    ((WithdrawDelegationReward) this.instance).clearTypePrefix();
                    return this;
                }

                public Builder clearValidatorAddress() {
                    copyOnWrite();
                    ((WithdrawDelegationReward) this.instance).clearValidatorAddress();
                    return this;
                }

                public String getDelegatorAddress() {
                    return ((WithdrawDelegationReward) this.instance).getDelegatorAddress();
                }

                public ByteString getDelegatorAddressBytes() {
                    return ((WithdrawDelegationReward) this.instance).getDelegatorAddressBytes();
                }

                public String getTypePrefix() {
                    return ((WithdrawDelegationReward) this.instance).getTypePrefix();
                }

                public ByteString getTypePrefixBytes() {
                    return ((WithdrawDelegationReward) this.instance).getTypePrefixBytes();
                }

                public String getValidatorAddress() {
                    return ((WithdrawDelegationReward) this.instance).getValidatorAddress();
                }

                public ByteString getValidatorAddressBytes() {
                    return ((WithdrawDelegationReward) this.instance).getValidatorAddressBytes();
                }

                public Builder setDelegatorAddress(String str) {
                    copyOnWrite();
                    ((WithdrawDelegationReward) this.instance).setDelegatorAddress(str);
                    return this;
                }

                public Builder setDelegatorAddressBytes(ByteString byteString) {
                    copyOnWrite();
                    ((WithdrawDelegationReward) this.instance).setDelegatorAddressBytes(byteString);
                    return this;
                }

                public Builder setTypePrefix(String str) {
                    copyOnWrite();
                    ((WithdrawDelegationReward) this.instance).setTypePrefix(str);
                    return this;
                }

                public Builder setTypePrefixBytes(ByteString byteString) {
                    copyOnWrite();
                    ((WithdrawDelegationReward) this.instance).setTypePrefixBytes(byteString);
                    return this;
                }

                public Builder setValidatorAddress(String str) {
                    copyOnWrite();
                    ((WithdrawDelegationReward) this.instance).setValidatorAddress(str);
                    return this;
                }

                public Builder setValidatorAddressBytes(ByteString byteString) {
                    copyOnWrite();
                    ((WithdrawDelegationReward) this.instance).setValidatorAddressBytes(byteString);
                    return this;
                }

                private Builder() {
                    super(WithdrawDelegationReward.DEFAULT_INSTANCE);
                }
            }

            static {
                WithdrawDelegationReward withdrawDelegationReward = new WithdrawDelegationReward();
                DEFAULT_INSTANCE = withdrawDelegationReward;
                GeneratedMessageLite.registerDefaultInstance(WithdrawDelegationReward.class, withdrawDelegationReward);
            }

            private WithdrawDelegationReward() {
            }

            /* access modifiers changed from: private */
            public void clearDelegatorAddress() {
                this.delegatorAddress_ = getDefaultInstance().getDelegatorAddress();
            }

            /* access modifiers changed from: private */
            public void clearTypePrefix() {
                this.typePrefix_ = getDefaultInstance().getTypePrefix();
            }

            /* access modifiers changed from: private */
            public void clearValidatorAddress() {
                this.validatorAddress_ = getDefaultInstance().getValidatorAddress();
            }

            public static WithdrawDelegationReward getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static WithdrawDelegationReward parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (WithdrawDelegationReward) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static WithdrawDelegationReward parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (WithdrawDelegationReward) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<WithdrawDelegationReward> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setDelegatorAddress(String str) {
                str.getClass();
                this.delegatorAddress_ = str;
            }

            /* access modifiers changed from: private */
            public void setDelegatorAddressBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.delegatorAddress_ = byteString.toStringUtf8();
            }

            /* access modifiers changed from: private */
            public void setTypePrefix(String str) {
                str.getClass();
                this.typePrefix_ = str;
            }

            /* access modifiers changed from: private */
            public void setTypePrefixBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.typePrefix_ = byteString.toStringUtf8();
            }

            /* access modifiers changed from: private */
            public void setValidatorAddress(String str) {
                str.getClass();
                this.validatorAddress_ = str;
            }

            /* access modifiers changed from: private */
            public void setValidatorAddressBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.validatorAddress_ = byteString.toStringUtf8();
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97321.f46548xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new WithdrawDelegationReward();
                    case 2:
                        return new Builder((C97321) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"delegatorAddress_", "validatorAddress_", "typePrefix_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<WithdrawDelegationReward> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (WithdrawDelegationReward.class) {
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

            public String getDelegatorAddress() {
                return this.delegatorAddress_;
            }

            public ByteString getDelegatorAddressBytes() {
                return ByteString.copyFromUtf8(this.delegatorAddress_);
            }

            public String getTypePrefix() {
                return this.typePrefix_;
            }

            public ByteString getTypePrefixBytes() {
                return ByteString.copyFromUtf8(this.typePrefix_);
            }

            public String getValidatorAddress() {
                return this.validatorAddress_;
            }

            public ByteString getValidatorAddressBytes() {
                return ByteString.copyFromUtf8(this.validatorAddress_);
            }

            public static Builder newBuilder(WithdrawDelegationReward withdrawDelegationReward) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(withdrawDelegationReward);
            }

            public static WithdrawDelegationReward parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (WithdrawDelegationReward) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static WithdrawDelegationReward parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (WithdrawDelegationReward) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static WithdrawDelegationReward parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (WithdrawDelegationReward) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static WithdrawDelegationReward parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (WithdrawDelegationReward) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static WithdrawDelegationReward parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (WithdrawDelegationReward) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static WithdrawDelegationReward parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (WithdrawDelegationReward) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static WithdrawDelegationReward parseFrom(InputStream inputStream) throws IOException {
                return (WithdrawDelegationReward) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static WithdrawDelegationReward parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (WithdrawDelegationReward) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static WithdrawDelegationReward parseFrom(C4969g gVar) throws IOException {
                return (WithdrawDelegationReward) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static WithdrawDelegationReward parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (WithdrawDelegationReward) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public interface WithdrawDelegationRewardOrBuilder extends qu3 {
            /* synthetic */ C4956c0 getDefaultInstanceForType();

            String getDelegatorAddress();

            ByteString getDelegatorAddressBytes();

            String getTypePrefix();

            ByteString getTypePrefixBytes();

            String getValidatorAddress();

            ByteString getValidatorAddressBytes();

            /* synthetic */ boolean isInitialized();
        }

        static {
            Message message = new Message();
            DEFAULT_INSTANCE = message;
            GeneratedMessageLite.registerDefaultInstance(Message.class, message);
        }

        private Message() {
        }

        /* access modifiers changed from: private */
        public void clearAuthGrant() {
            if (this.messageOneofCase_ == 16) {
                this.messageOneofCase_ = 0;
                this.messageOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearAuthRevoke() {
            if (this.messageOneofCase_ == 17) {
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
        public void clearMsgVote() {
            if (this.messageOneofCase_ == 18) {
                this.messageOneofCase_ = 0;
                this.messageOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearRawJsonMessage() {
            if (this.messageOneofCase_ == 7) {
                this.messageOneofCase_ = 0;
                this.messageOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearRestakeMessage() {
            if (this.messageOneofCase_ == 5) {
                this.messageOneofCase_ = 0;
                this.messageOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearSendCoinsMessage() {
            if (this.messageOneofCase_ == 1) {
                this.messageOneofCase_ = 0;
                this.messageOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearSignDirectMessage() {
            if (this.messageOneofCase_ == 15) {
                this.messageOneofCase_ = 0;
                this.messageOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearStakeMessage() {
            if (this.messageOneofCase_ == 3) {
                this.messageOneofCase_ = 0;
                this.messageOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearThorchainSendMessage() {
            if (this.messageOneofCase_ == 10) {
                this.messageOneofCase_ = 0;
                this.messageOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearTransferTokensMessage() {
            if (this.messageOneofCase_ == 2) {
                this.messageOneofCase_ = 0;
                this.messageOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearUnstakeMessage() {
            if (this.messageOneofCase_ == 4) {
                this.messageOneofCase_ = 0;
                this.messageOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearWasmExecuteContractGeneric() {
            if (this.messageOneofCase_ == 14) {
                this.messageOneofCase_ = 0;
                this.messageOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearWasmExecuteContractSendMessage() {
            if (this.messageOneofCase_ == 13) {
                this.messageOneofCase_ = 0;
                this.messageOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearWasmExecuteContractTransferMessage() {
            if (this.messageOneofCase_ == 12) {
                this.messageOneofCase_ = 0;
                this.messageOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearWasmTerraExecuteContractGeneric() {
            if (this.messageOneofCase_ == 11) {
                this.messageOneofCase_ = 0;
                this.messageOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearWasmTerraExecuteContractSendMessage() {
            if (this.messageOneofCase_ == 9) {
                this.messageOneofCase_ = 0;
                this.messageOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearWasmTerraExecuteContractTransferMessage() {
            if (this.messageOneofCase_ == 8) {
                this.messageOneofCase_ = 0;
                this.messageOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearWithdrawStakeRewardMessage() {
            if (this.messageOneofCase_ == 6) {
                this.messageOneofCase_ = 0;
                this.messageOneof_ = null;
            }
        }

        public static Message getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeAuthGrant(AuthGrant authGrant) {
            authGrant.getClass();
            if (this.messageOneofCase_ != 16 || this.messageOneof_ == AuthGrant.getDefaultInstance()) {
                this.messageOneof_ = authGrant;
            } else {
                this.messageOneof_ = ((AuthGrant.Builder) AuthGrant.newBuilder((AuthGrant) this.messageOneof_).mergeFrom(authGrant)).buildPartial();
            }
            this.messageOneofCase_ = 16;
        }

        /* access modifiers changed from: private */
        public void mergeAuthRevoke(AuthRevoke authRevoke) {
            authRevoke.getClass();
            if (this.messageOneofCase_ != 17 || this.messageOneof_ == AuthRevoke.getDefaultInstance()) {
                this.messageOneof_ = authRevoke;
            } else {
                this.messageOneof_ = ((AuthRevoke.Builder) AuthRevoke.newBuilder((AuthRevoke) this.messageOneof_).mergeFrom(authRevoke)).buildPartial();
            }
            this.messageOneofCase_ = 17;
        }

        /* access modifiers changed from: private */
        public void mergeMsgVote(MsgVote msgVote) {
            msgVote.getClass();
            if (this.messageOneofCase_ != 18 || this.messageOneof_ == MsgVote.getDefaultInstance()) {
                this.messageOneof_ = msgVote;
            } else {
                this.messageOneof_ = ((MsgVote.Builder) MsgVote.newBuilder((MsgVote) this.messageOneof_).mergeFrom(msgVote)).buildPartial();
            }
            this.messageOneofCase_ = 18;
        }

        /* access modifiers changed from: private */
        public void mergeRawJsonMessage(RawJSON rawJSON) {
            rawJSON.getClass();
            if (this.messageOneofCase_ != 7 || this.messageOneof_ == RawJSON.getDefaultInstance()) {
                this.messageOneof_ = rawJSON;
            } else {
                this.messageOneof_ = ((RawJSON.Builder) RawJSON.newBuilder((RawJSON) this.messageOneof_).mergeFrom(rawJSON)).buildPartial();
            }
            this.messageOneofCase_ = 7;
        }

        /* access modifiers changed from: private */
        public void mergeRestakeMessage(BeginRedelegate beginRedelegate) {
            beginRedelegate.getClass();
            if (this.messageOneofCase_ != 5 || this.messageOneof_ == BeginRedelegate.getDefaultInstance()) {
                this.messageOneof_ = beginRedelegate;
            } else {
                this.messageOneof_ = ((BeginRedelegate.Builder) BeginRedelegate.newBuilder((BeginRedelegate) this.messageOneof_).mergeFrom(beginRedelegate)).buildPartial();
            }
            this.messageOneofCase_ = 5;
        }

        /* access modifiers changed from: private */
        public void mergeSendCoinsMessage(Send send) {
            send.getClass();
            if (this.messageOneofCase_ != 1 || this.messageOneof_ == Send.getDefaultInstance()) {
                this.messageOneof_ = send;
            } else {
                this.messageOneof_ = ((Send.Builder) Send.newBuilder((Send) this.messageOneof_).mergeFrom(send)).buildPartial();
            }
            this.messageOneofCase_ = 1;
        }

        /* access modifiers changed from: private */
        public void mergeSignDirectMessage(SignDirect signDirect) {
            signDirect.getClass();
            if (this.messageOneofCase_ != 15 || this.messageOneof_ == SignDirect.getDefaultInstance()) {
                this.messageOneof_ = signDirect;
            } else {
                this.messageOneof_ = ((SignDirect.Builder) SignDirect.newBuilder((SignDirect) this.messageOneof_).mergeFrom(signDirect)).buildPartial();
            }
            this.messageOneofCase_ = 15;
        }

        /* access modifiers changed from: private */
        public void mergeStakeMessage(Delegate delegate) {
            delegate.getClass();
            if (this.messageOneofCase_ != 3 || this.messageOneof_ == Delegate.getDefaultInstance()) {
                this.messageOneof_ = delegate;
            } else {
                this.messageOneof_ = ((Delegate.Builder) Delegate.newBuilder((Delegate) this.messageOneof_).mergeFrom(delegate)).buildPartial();
            }
            this.messageOneofCase_ = 3;
        }

        /* access modifiers changed from: private */
        public void mergeThorchainSendMessage(THORChainSend tHORChainSend) {
            tHORChainSend.getClass();
            if (this.messageOneofCase_ != 10 || this.messageOneof_ == THORChainSend.getDefaultInstance()) {
                this.messageOneof_ = tHORChainSend;
            } else {
                this.messageOneof_ = ((THORChainSend.Builder) THORChainSend.newBuilder((THORChainSend) this.messageOneof_).mergeFrom(tHORChainSend)).buildPartial();
            }
            this.messageOneofCase_ = 10;
        }

        /* access modifiers changed from: private */
        public void mergeTransferTokensMessage(Transfer transfer) {
            transfer.getClass();
            if (this.messageOneofCase_ != 2 || this.messageOneof_ == Transfer.getDefaultInstance()) {
                this.messageOneof_ = transfer;
            } else {
                this.messageOneof_ = ((Transfer.Builder) Transfer.newBuilder((Transfer) this.messageOneof_).mergeFrom(transfer)).buildPartial();
            }
            this.messageOneofCase_ = 2;
        }

        /* access modifiers changed from: private */
        public void mergeUnstakeMessage(Undelegate undelegate) {
            undelegate.getClass();
            if (this.messageOneofCase_ != 4 || this.messageOneof_ == Undelegate.getDefaultInstance()) {
                this.messageOneof_ = undelegate;
            } else {
                this.messageOneof_ = ((Undelegate.Builder) Undelegate.newBuilder((Undelegate) this.messageOneof_).mergeFrom(undelegate)).buildPartial();
            }
            this.messageOneofCase_ = 4;
        }

        /* access modifiers changed from: private */
        public void mergeWasmExecuteContractGeneric(WasmExecuteContractGeneric wasmExecuteContractGeneric) {
            wasmExecuteContractGeneric.getClass();
            if (this.messageOneofCase_ != 14 || this.messageOneof_ == WasmExecuteContractGeneric.getDefaultInstance()) {
                this.messageOneof_ = wasmExecuteContractGeneric;
            } else {
                this.messageOneof_ = ((WasmExecuteContractGeneric.Builder) WasmExecuteContractGeneric.newBuilder((WasmExecuteContractGeneric) this.messageOneof_).mergeFrom(wasmExecuteContractGeneric)).buildPartial();
            }
            this.messageOneofCase_ = 14;
        }

        /* access modifiers changed from: private */
        public void mergeWasmExecuteContractSendMessage(WasmExecuteContractSend wasmExecuteContractSend) {
            wasmExecuteContractSend.getClass();
            if (this.messageOneofCase_ != 13 || this.messageOneof_ == WasmExecuteContractSend.getDefaultInstance()) {
                this.messageOneof_ = wasmExecuteContractSend;
            } else {
                this.messageOneof_ = ((WasmExecuteContractSend.Builder) WasmExecuteContractSend.newBuilder((WasmExecuteContractSend) this.messageOneof_).mergeFrom(wasmExecuteContractSend)).buildPartial();
            }
            this.messageOneofCase_ = 13;
        }

        /* access modifiers changed from: private */
        public void mergeWasmExecuteContractTransferMessage(WasmExecuteContractTransfer wasmExecuteContractTransfer) {
            wasmExecuteContractTransfer.getClass();
            if (this.messageOneofCase_ != 12 || this.messageOneof_ == WasmExecuteContractTransfer.getDefaultInstance()) {
                this.messageOneof_ = wasmExecuteContractTransfer;
            } else {
                this.messageOneof_ = ((WasmExecuteContractTransfer.Builder) WasmExecuteContractTransfer.newBuilder((WasmExecuteContractTransfer) this.messageOneof_).mergeFrom(wasmExecuteContractTransfer)).buildPartial();
            }
            this.messageOneofCase_ = 12;
        }

        /* access modifiers changed from: private */
        public void mergeWasmTerraExecuteContractGeneric(WasmTerraExecuteContractGeneric wasmTerraExecuteContractGeneric) {
            wasmTerraExecuteContractGeneric.getClass();
            if (this.messageOneofCase_ != 11 || this.messageOneof_ == WasmTerraExecuteContractGeneric.getDefaultInstance()) {
                this.messageOneof_ = wasmTerraExecuteContractGeneric;
            } else {
                this.messageOneof_ = ((WasmTerraExecuteContractGeneric.Builder) WasmTerraExecuteContractGeneric.newBuilder((WasmTerraExecuteContractGeneric) this.messageOneof_).mergeFrom(wasmTerraExecuteContractGeneric)).buildPartial();
            }
            this.messageOneofCase_ = 11;
        }

        /* access modifiers changed from: private */
        public void mergeWasmTerraExecuteContractSendMessage(WasmTerraExecuteContractSend wasmTerraExecuteContractSend) {
            wasmTerraExecuteContractSend.getClass();
            if (this.messageOneofCase_ != 9 || this.messageOneof_ == WasmTerraExecuteContractSend.getDefaultInstance()) {
                this.messageOneof_ = wasmTerraExecuteContractSend;
            } else {
                this.messageOneof_ = ((WasmTerraExecuteContractSend.Builder) WasmTerraExecuteContractSend.newBuilder((WasmTerraExecuteContractSend) this.messageOneof_).mergeFrom(wasmTerraExecuteContractSend)).buildPartial();
            }
            this.messageOneofCase_ = 9;
        }

        /* access modifiers changed from: private */
        public void mergeWasmTerraExecuteContractTransferMessage(WasmTerraExecuteContractTransfer wasmTerraExecuteContractTransfer) {
            wasmTerraExecuteContractTransfer.getClass();
            if (this.messageOneofCase_ != 8 || this.messageOneof_ == WasmTerraExecuteContractTransfer.getDefaultInstance()) {
                this.messageOneof_ = wasmTerraExecuteContractTransfer;
            } else {
                this.messageOneof_ = ((WasmTerraExecuteContractTransfer.Builder) WasmTerraExecuteContractTransfer.newBuilder((WasmTerraExecuteContractTransfer) this.messageOneof_).mergeFrom(wasmTerraExecuteContractTransfer)).buildPartial();
            }
            this.messageOneofCase_ = 8;
        }

        /* access modifiers changed from: private */
        public void mergeWithdrawStakeRewardMessage(WithdrawDelegationReward withdrawDelegationReward) {
            withdrawDelegationReward.getClass();
            if (this.messageOneofCase_ != 6 || this.messageOneof_ == WithdrawDelegationReward.getDefaultInstance()) {
                this.messageOneof_ = withdrawDelegationReward;
            } else {
                this.messageOneof_ = ((WithdrawDelegationReward.Builder) WithdrawDelegationReward.newBuilder((WithdrawDelegationReward) this.messageOneof_).mergeFrom(withdrawDelegationReward)).buildPartial();
            }
            this.messageOneofCase_ = 6;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Message parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Message) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Message parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<Message> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAuthGrant(AuthGrant authGrant) {
            authGrant.getClass();
            this.messageOneof_ = authGrant;
            this.messageOneofCase_ = 16;
        }

        /* access modifiers changed from: private */
        public void setAuthRevoke(AuthRevoke authRevoke) {
            authRevoke.getClass();
            this.messageOneof_ = authRevoke;
            this.messageOneofCase_ = 17;
        }

        /* access modifiers changed from: private */
        public void setMsgVote(MsgVote msgVote) {
            msgVote.getClass();
            this.messageOneof_ = msgVote;
            this.messageOneofCase_ = 18;
        }

        /* access modifiers changed from: private */
        public void setRawJsonMessage(RawJSON rawJSON) {
            rawJSON.getClass();
            this.messageOneof_ = rawJSON;
            this.messageOneofCase_ = 7;
        }

        /* access modifiers changed from: private */
        public void setRestakeMessage(BeginRedelegate beginRedelegate) {
            beginRedelegate.getClass();
            this.messageOneof_ = beginRedelegate;
            this.messageOneofCase_ = 5;
        }

        /* access modifiers changed from: private */
        public void setSendCoinsMessage(Send send) {
            send.getClass();
            this.messageOneof_ = send;
            this.messageOneofCase_ = 1;
        }

        /* access modifiers changed from: private */
        public void setSignDirectMessage(SignDirect signDirect) {
            signDirect.getClass();
            this.messageOneof_ = signDirect;
            this.messageOneofCase_ = 15;
        }

        /* access modifiers changed from: private */
        public void setStakeMessage(Delegate delegate) {
            delegate.getClass();
            this.messageOneof_ = delegate;
            this.messageOneofCase_ = 3;
        }

        /* access modifiers changed from: private */
        public void setThorchainSendMessage(THORChainSend tHORChainSend) {
            tHORChainSend.getClass();
            this.messageOneof_ = tHORChainSend;
            this.messageOneofCase_ = 10;
        }

        /* access modifiers changed from: private */
        public void setTransferTokensMessage(Transfer transfer) {
            transfer.getClass();
            this.messageOneof_ = transfer;
            this.messageOneofCase_ = 2;
        }

        /* access modifiers changed from: private */
        public void setUnstakeMessage(Undelegate undelegate) {
            undelegate.getClass();
            this.messageOneof_ = undelegate;
            this.messageOneofCase_ = 4;
        }

        /* access modifiers changed from: private */
        public void setWasmExecuteContractGeneric(WasmExecuteContractGeneric wasmExecuteContractGeneric) {
            wasmExecuteContractGeneric.getClass();
            this.messageOneof_ = wasmExecuteContractGeneric;
            this.messageOneofCase_ = 14;
        }

        /* access modifiers changed from: private */
        public void setWasmExecuteContractSendMessage(WasmExecuteContractSend wasmExecuteContractSend) {
            wasmExecuteContractSend.getClass();
            this.messageOneof_ = wasmExecuteContractSend;
            this.messageOneofCase_ = 13;
        }

        /* access modifiers changed from: private */
        public void setWasmExecuteContractTransferMessage(WasmExecuteContractTransfer wasmExecuteContractTransfer) {
            wasmExecuteContractTransfer.getClass();
            this.messageOneof_ = wasmExecuteContractTransfer;
            this.messageOneofCase_ = 12;
        }

        /* access modifiers changed from: private */
        public void setWasmTerraExecuteContractGeneric(WasmTerraExecuteContractGeneric wasmTerraExecuteContractGeneric) {
            wasmTerraExecuteContractGeneric.getClass();
            this.messageOneof_ = wasmTerraExecuteContractGeneric;
            this.messageOneofCase_ = 11;
        }

        /* access modifiers changed from: private */
        public void setWasmTerraExecuteContractSendMessage(WasmTerraExecuteContractSend wasmTerraExecuteContractSend) {
            wasmTerraExecuteContractSend.getClass();
            this.messageOneof_ = wasmTerraExecuteContractSend;
            this.messageOneofCase_ = 9;
        }

        /* access modifiers changed from: private */
        public void setWasmTerraExecuteContractTransferMessage(WasmTerraExecuteContractTransfer wasmTerraExecuteContractTransfer) {
            wasmTerraExecuteContractTransfer.getClass();
            this.messageOneof_ = wasmTerraExecuteContractTransfer;
            this.messageOneofCase_ = 8;
        }

        /* access modifiers changed from: private */
        public void setWithdrawStakeRewardMessage(WithdrawDelegationReward withdrawDelegationReward) {
            withdrawDelegationReward.getClass();
            this.messageOneof_ = withdrawDelegationReward;
            this.messageOneofCase_ = 6;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97321.f46548xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Message();
                case 2:
                    return new Builder((C97321) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0012\u0001\u0000\u0001\u0012\u0012\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000", new Object[]{"messageOneof_", "messageOneofCase_", Send.class, Transfer.class, Delegate.class, Undelegate.class, BeginRedelegate.class, WithdrawDelegationReward.class, RawJSON.class, WasmTerraExecuteContractTransfer.class, WasmTerraExecuteContractSend.class, THORChainSend.class, WasmTerraExecuteContractGeneric.class, WasmExecuteContractTransfer.class, WasmExecuteContractSend.class, WasmExecuteContractGeneric.class, SignDirect.class, AuthGrant.class, AuthRevoke.class, MsgVote.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<Message> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (Message.class) {
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

        public AuthGrant getAuthGrant() {
            if (this.messageOneofCase_ == 16) {
                return (AuthGrant) this.messageOneof_;
            }
            return AuthGrant.getDefaultInstance();
        }

        public AuthRevoke getAuthRevoke() {
            if (this.messageOneofCase_ == 17) {
                return (AuthRevoke) this.messageOneof_;
            }
            return AuthRevoke.getDefaultInstance();
        }

        public MessageOneofCase getMessageOneofCase() {
            return MessageOneofCase.forNumber(this.messageOneofCase_);
        }

        public MsgVote getMsgVote() {
            if (this.messageOneofCase_ == 18) {
                return (MsgVote) this.messageOneof_;
            }
            return MsgVote.getDefaultInstance();
        }

        public RawJSON getRawJsonMessage() {
            if (this.messageOneofCase_ == 7) {
                return (RawJSON) this.messageOneof_;
            }
            return RawJSON.getDefaultInstance();
        }

        public BeginRedelegate getRestakeMessage() {
            if (this.messageOneofCase_ == 5) {
                return (BeginRedelegate) this.messageOneof_;
            }
            return BeginRedelegate.getDefaultInstance();
        }

        public Send getSendCoinsMessage() {
            if (this.messageOneofCase_ == 1) {
                return (Send) this.messageOneof_;
            }
            return Send.getDefaultInstance();
        }

        public SignDirect getSignDirectMessage() {
            if (this.messageOneofCase_ == 15) {
                return (SignDirect) this.messageOneof_;
            }
            return SignDirect.getDefaultInstance();
        }

        public Delegate getStakeMessage() {
            if (this.messageOneofCase_ == 3) {
                return (Delegate) this.messageOneof_;
            }
            return Delegate.getDefaultInstance();
        }

        public THORChainSend getThorchainSendMessage() {
            if (this.messageOneofCase_ == 10) {
                return (THORChainSend) this.messageOneof_;
            }
            return THORChainSend.getDefaultInstance();
        }

        public Transfer getTransferTokensMessage() {
            if (this.messageOneofCase_ == 2) {
                return (Transfer) this.messageOneof_;
            }
            return Transfer.getDefaultInstance();
        }

        public Undelegate getUnstakeMessage() {
            if (this.messageOneofCase_ == 4) {
                return (Undelegate) this.messageOneof_;
            }
            return Undelegate.getDefaultInstance();
        }

        public WasmExecuteContractGeneric getWasmExecuteContractGeneric() {
            if (this.messageOneofCase_ == 14) {
                return (WasmExecuteContractGeneric) this.messageOneof_;
            }
            return WasmExecuteContractGeneric.getDefaultInstance();
        }

        public WasmExecuteContractSend getWasmExecuteContractSendMessage() {
            if (this.messageOneofCase_ == 13) {
                return (WasmExecuteContractSend) this.messageOneof_;
            }
            return WasmExecuteContractSend.getDefaultInstance();
        }

        public WasmExecuteContractTransfer getWasmExecuteContractTransferMessage() {
            if (this.messageOneofCase_ == 12) {
                return (WasmExecuteContractTransfer) this.messageOneof_;
            }
            return WasmExecuteContractTransfer.getDefaultInstance();
        }

        public WasmTerraExecuteContractGeneric getWasmTerraExecuteContractGeneric() {
            if (this.messageOneofCase_ == 11) {
                return (WasmTerraExecuteContractGeneric) this.messageOneof_;
            }
            return WasmTerraExecuteContractGeneric.getDefaultInstance();
        }

        public WasmTerraExecuteContractSend getWasmTerraExecuteContractSendMessage() {
            if (this.messageOneofCase_ == 9) {
                return (WasmTerraExecuteContractSend) this.messageOneof_;
            }
            return WasmTerraExecuteContractSend.getDefaultInstance();
        }

        public WasmTerraExecuteContractTransfer getWasmTerraExecuteContractTransferMessage() {
            if (this.messageOneofCase_ == 8) {
                return (WasmTerraExecuteContractTransfer) this.messageOneof_;
            }
            return WasmTerraExecuteContractTransfer.getDefaultInstance();
        }

        public WithdrawDelegationReward getWithdrawStakeRewardMessage() {
            if (this.messageOneofCase_ == 6) {
                return (WithdrawDelegationReward) this.messageOneof_;
            }
            return WithdrawDelegationReward.getDefaultInstance();
        }

        public boolean hasAuthGrant() {
            if (this.messageOneofCase_ == 16) {
                return true;
            }
            return false;
        }

        public boolean hasAuthRevoke() {
            if (this.messageOneofCase_ == 17) {
                return true;
            }
            return false;
        }

        public boolean hasMsgVote() {
            if (this.messageOneofCase_ == 18) {
                return true;
            }
            return false;
        }

        public boolean hasRawJsonMessage() {
            if (this.messageOneofCase_ == 7) {
                return true;
            }
            return false;
        }

        public boolean hasRestakeMessage() {
            if (this.messageOneofCase_ == 5) {
                return true;
            }
            return false;
        }

        public boolean hasSendCoinsMessage() {
            if (this.messageOneofCase_ == 1) {
                return true;
            }
            return false;
        }

        public boolean hasSignDirectMessage() {
            if (this.messageOneofCase_ == 15) {
                return true;
            }
            return false;
        }

        public boolean hasStakeMessage() {
            if (this.messageOneofCase_ == 3) {
                return true;
            }
            return false;
        }

        public boolean hasThorchainSendMessage() {
            if (this.messageOneofCase_ == 10) {
                return true;
            }
            return false;
        }

        public boolean hasTransferTokensMessage() {
            if (this.messageOneofCase_ == 2) {
                return true;
            }
            return false;
        }

        public boolean hasUnstakeMessage() {
            if (this.messageOneofCase_ == 4) {
                return true;
            }
            return false;
        }

        public boolean hasWasmExecuteContractGeneric() {
            if (this.messageOneofCase_ == 14) {
                return true;
            }
            return false;
        }

        public boolean hasWasmExecuteContractSendMessage() {
            if (this.messageOneofCase_ == 13) {
                return true;
            }
            return false;
        }

        public boolean hasWasmExecuteContractTransferMessage() {
            if (this.messageOneofCase_ == 12) {
                return true;
            }
            return false;
        }

        public boolean hasWasmTerraExecuteContractGeneric() {
            if (this.messageOneofCase_ == 11) {
                return true;
            }
            return false;
        }

        public boolean hasWasmTerraExecuteContractSendMessage() {
            if (this.messageOneofCase_ == 9) {
                return true;
            }
            return false;
        }

        public boolean hasWasmTerraExecuteContractTransferMessage() {
            if (this.messageOneofCase_ == 8) {
                return true;
            }
            return false;
        }

        public boolean hasWithdrawStakeRewardMessage() {
            if (this.messageOneofCase_ == 6) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(Message message) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(message);
        }

        public static Message parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Message) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Message parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (Message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static Message parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Message parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (Message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static Message parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Message parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (Message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static Message parseFrom(InputStream inputStream) throws IOException {
            return (Message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Message parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Message parseFrom(C4969g gVar) throws IOException {
            return (Message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static Message parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (Message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface MessageOrBuilder extends qu3 {
        Message.AuthGrant getAuthGrant();

        Message.AuthRevoke getAuthRevoke();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        Message.MessageOneofCase getMessageOneofCase();

        Message.MsgVote getMsgVote();

        Message.RawJSON getRawJsonMessage();

        Message.BeginRedelegate getRestakeMessage();

        Message.Send getSendCoinsMessage();

        Message.SignDirect getSignDirectMessage();

        Message.Delegate getStakeMessage();

        Message.THORChainSend getThorchainSendMessage();

        Message.Transfer getTransferTokensMessage();

        Message.Undelegate getUnstakeMessage();

        Message.WasmExecuteContractGeneric getWasmExecuteContractGeneric();

        Message.WasmExecuteContractSend getWasmExecuteContractSendMessage();

        Message.WasmExecuteContractTransfer getWasmExecuteContractTransferMessage();

        Message.WasmTerraExecuteContractGeneric getWasmTerraExecuteContractGeneric();

        Message.WasmTerraExecuteContractSend getWasmTerraExecuteContractSendMessage();

        Message.WasmTerraExecuteContractTransfer getWasmTerraExecuteContractTransferMessage();

        Message.WithdrawDelegationReward getWithdrawStakeRewardMessage();

        boolean hasAuthGrant();

        boolean hasAuthRevoke();

        boolean hasMsgVote();

        boolean hasRawJsonMessage();

        boolean hasRestakeMessage();

        boolean hasSendCoinsMessage();

        boolean hasSignDirectMessage();

        boolean hasStakeMessage();

        boolean hasThorchainSendMessage();

        boolean hasTransferTokensMessage();

        boolean hasUnstakeMessage();

        boolean hasWasmExecuteContractGeneric();

        boolean hasWasmExecuteContractSendMessage();

        boolean hasWasmExecuteContractTransferMessage();

        boolean hasWasmTerraExecuteContractGeneric();

        boolean hasWasmTerraExecuteContractSendMessage();

        boolean hasWasmTerraExecuteContractTransferMessage();

        boolean hasWithdrawStakeRewardMessage();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SigningInput extends GeneratedMessageLite<SigningInput, Builder> implements SigningInputOrBuilder {
        public static final int ACCOUNT_NUMBER_FIELD_NUMBER = 2;
        public static final int CHAIN_ID_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final SigningInput DEFAULT_INSTANCE;
        public static final int FEE_FIELD_NUMBER = 4;
        public static final int MEMO_FIELD_NUMBER = 5;
        public static final int MESSAGES_FIELD_NUMBER = 8;
        public static final int MODE_FIELD_NUMBER = 9;
        private static volatile im4<SigningInput> PARSER = null;
        public static final int PRIVATE_KEY_FIELD_NUMBER = 7;
        public static final int SEQUENCE_FIELD_NUMBER = 6;
        public static final int SIGNING_MODE_FIELD_NUMBER = 1;
        private long accountNumber_;
        private String chainId_ = "";
        private Fee fee_;
        private String memo_ = "";
        private C5011t.C5020i<Message> messages_ = GeneratedMessageLite.emptyProtobufList();
        private int mode_;
        private ByteString privateKey_ = ByteString.EMPTY;
        private long sequence_;
        private int signingMode_;

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningInput, Builder> implements SigningInputOrBuilder {
            public /* synthetic */ Builder(C97321 r1) {
                this();
            }

            public Builder addAllMessages(Iterable<? extends Message> iterable) {
                copyOnWrite();
                ((SigningInput) this.instance).addAllMessages(iterable);
                return this;
            }

            public Builder addMessages(Message message) {
                copyOnWrite();
                ((SigningInput) this.instance).addMessages(message);
                return this;
            }

            public Builder clearAccountNumber() {
                copyOnWrite();
                ((SigningInput) this.instance).clearAccountNumber();
                return this;
            }

            public Builder clearChainId() {
                copyOnWrite();
                ((SigningInput) this.instance).clearChainId();
                return this;
            }

            public Builder clearFee() {
                copyOnWrite();
                ((SigningInput) this.instance).clearFee();
                return this;
            }

            public Builder clearMemo() {
                copyOnWrite();
                ((SigningInput) this.instance).clearMemo();
                return this;
            }

            public Builder clearMessages() {
                copyOnWrite();
                ((SigningInput) this.instance).clearMessages();
                return this;
            }

            public Builder clearMode() {
                copyOnWrite();
                ((SigningInput) this.instance).clearMode();
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

            public Builder clearSigningMode() {
                copyOnWrite();
                ((SigningInput) this.instance).clearSigningMode();
                return this;
            }

            public long getAccountNumber() {
                return ((SigningInput) this.instance).getAccountNumber();
            }

            public String getChainId() {
                return ((SigningInput) this.instance).getChainId();
            }

            public ByteString getChainIdBytes() {
                return ((SigningInput) this.instance).getChainIdBytes();
            }

            public Fee getFee() {
                return ((SigningInput) this.instance).getFee();
            }

            public String getMemo() {
                return ((SigningInput) this.instance).getMemo();
            }

            public ByteString getMemoBytes() {
                return ((SigningInput) this.instance).getMemoBytes();
            }

            public Message getMessages(int i) {
                return ((SigningInput) this.instance).getMessages(i);
            }

            public int getMessagesCount() {
                return ((SigningInput) this.instance).getMessagesCount();
            }

            public List<Message> getMessagesList() {
                return Collections.unmodifiableList(((SigningInput) this.instance).getMessagesList());
            }

            public BroadcastMode getMode() {
                return ((SigningInput) this.instance).getMode();
            }

            public int getModeValue() {
                return ((SigningInput) this.instance).getModeValue();
            }

            public ByteString getPrivateKey() {
                return ((SigningInput) this.instance).getPrivateKey();
            }

            public long getSequence() {
                return ((SigningInput) this.instance).getSequence();
            }

            public SigningMode getSigningMode() {
                return ((SigningInput) this.instance).getSigningMode();
            }

            public int getSigningModeValue() {
                return ((SigningInput) this.instance).getSigningModeValue();
            }

            public boolean hasFee() {
                return ((SigningInput) this.instance).hasFee();
            }

            public Builder mergeFee(Fee fee) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeFee(fee);
                return this;
            }

            public Builder removeMessages(int i) {
                copyOnWrite();
                ((SigningInput) this.instance).removeMessages(i);
                return this;
            }

            public Builder setAccountNumber(long j) {
                copyOnWrite();
                ((SigningInput) this.instance).setAccountNumber(j);
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

            public Builder setFee(Fee fee) {
                copyOnWrite();
                ((SigningInput) this.instance).setFee(fee);
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

            public Builder setMessages(int i, Message message) {
                copyOnWrite();
                ((SigningInput) this.instance).setMessages(i, message);
                return this;
            }

            public Builder setMode(BroadcastMode broadcastMode) {
                copyOnWrite();
                ((SigningInput) this.instance).setMode(broadcastMode);
                return this;
            }

            public Builder setModeValue(int i) {
                copyOnWrite();
                ((SigningInput) this.instance).setModeValue(i);
                return this;
            }

            public Builder setPrivateKey(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setPrivateKey(byteString);
                return this;
            }

            public Builder setSequence(long j) {
                copyOnWrite();
                ((SigningInput) this.instance).setSequence(j);
                return this;
            }

            public Builder setSigningMode(SigningMode signingMode) {
                copyOnWrite();
                ((SigningInput) this.instance).setSigningMode(signingMode);
                return this;
            }

            public Builder setSigningModeValue(int i) {
                copyOnWrite();
                ((SigningInput) this.instance).setSigningModeValue(i);
                return this;
            }

            private Builder() {
                super(SigningInput.DEFAULT_INSTANCE);
            }

            public Builder addMessages(int i, Message message) {
                copyOnWrite();
                ((SigningInput) this.instance).addMessages(i, message);
                return this;
            }

            public Builder setFee(Fee.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setFee((Fee) builder.build());
                return this;
            }

            public Builder setMessages(int i, Message.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setMessages(i, (Message) builder.build());
                return this;
            }

            public Builder addMessages(Message.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).addMessages((Message) builder.build());
                return this;
            }

            public Builder addMessages(int i, Message.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).addMessages(i, (Message) builder.build());
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
        public void addAllMessages(Iterable<? extends Message> iterable) {
            ensureMessagesIsMutable();
            C4949a.addAll(iterable, this.messages_);
        }

        /* access modifiers changed from: private */
        public void addMessages(Message message) {
            message.getClass();
            ensureMessagesIsMutable();
            this.messages_.add(message);
        }

        /* access modifiers changed from: private */
        public void clearAccountNumber() {
            this.accountNumber_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearChainId() {
            this.chainId_ = getDefaultInstance().getChainId();
        }

        /* access modifiers changed from: private */
        public void clearFee() {
            this.fee_ = null;
        }

        /* access modifiers changed from: private */
        public void clearMemo() {
            this.memo_ = getDefaultInstance().getMemo();
        }

        /* access modifiers changed from: private */
        public void clearMessages() {
            this.messages_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearMode() {
            this.mode_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearPrivateKey() {
            this.privateKey_ = getDefaultInstance().getPrivateKey();
        }

        /* access modifiers changed from: private */
        public void clearSequence() {
            this.sequence_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSigningMode() {
            this.signingMode_ = 0;
        }

        private void ensureMessagesIsMutable() {
            C5011t.C5020i<Message> iVar = this.messages_;
            if (!iVar.mo37090v()) {
                this.messages_ = GeneratedMessageLite.mutableCopy(iVar);
            }
        }

        public static SigningInput getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeFee(Fee fee) {
            fee.getClass();
            Fee fee2 = this.fee_;
            if (fee2 == null || fee2 == Fee.getDefaultInstance()) {
                this.fee_ = fee;
            } else {
                this.fee_ = (Fee) ((Fee.Builder) Fee.newBuilder(this.fee_).mergeFrom(fee)).buildPartial();
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
        public void removeMessages(int i) {
            ensureMessagesIsMutable();
            this.messages_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setAccountNumber(long j) {
            this.accountNumber_ = j;
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
        public void setFee(Fee fee) {
            fee.getClass();
            this.fee_ = fee;
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
        public void setMessages(int i, Message message) {
            message.getClass();
            ensureMessagesIsMutable();
            this.messages_.set(i, message);
        }

        /* access modifiers changed from: private */
        public void setMode(BroadcastMode broadcastMode) {
            this.mode_ = broadcastMode.getNumber();
        }

        /* access modifiers changed from: private */
        public void setModeValue(int i) {
            this.mode_ = i;
        }

        /* access modifiers changed from: private */
        public void setPrivateKey(ByteString byteString) {
            byteString.getClass();
            this.privateKey_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setSequence(long j) {
            this.sequence_ = j;
        }

        /* access modifiers changed from: private */
        public void setSigningMode(SigningMode signingMode) {
            this.signingMode_ = signingMode.getNumber();
        }

        /* access modifiers changed from: private */
        public void setSigningModeValue(int i) {
            this.signingMode_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97321.f46548xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningInput();
                case 2:
                    return new Builder((C97321) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0001\u0000\u0001\f\u0002\u0003\u0003Ȉ\u0004\t\u0005Ȉ\u0006\u0003\u0007\n\b\u001b\t\f", new Object[]{"signingMode_", "accountNumber_", "chainId_", "fee_", "memo_", "sequence_", "privateKey_", "messages_", Message.class, "mode_"});
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

        public String getChainId() {
            return this.chainId_;
        }

        public ByteString getChainIdBytes() {
            return ByteString.copyFromUtf8(this.chainId_);
        }

        public Fee getFee() {
            Fee fee = this.fee_;
            if (fee == null) {
                return Fee.getDefaultInstance();
            }
            return fee;
        }

        public String getMemo() {
            return this.memo_;
        }

        public ByteString getMemoBytes() {
            return ByteString.copyFromUtf8(this.memo_);
        }

        public Message getMessages(int i) {
            return this.messages_.get(i);
        }

        public int getMessagesCount() {
            return this.messages_.size();
        }

        public List<Message> getMessagesList() {
            return this.messages_;
        }

        public MessageOrBuilder getMessagesOrBuilder(int i) {
            return this.messages_.get(i);
        }

        public List<? extends MessageOrBuilder> getMessagesOrBuilderList() {
            return this.messages_;
        }

        public BroadcastMode getMode() {
            BroadcastMode forNumber = BroadcastMode.forNumber(this.mode_);
            if (forNumber == null) {
                return BroadcastMode.UNRECOGNIZED;
            }
            return forNumber;
        }

        public int getModeValue() {
            return this.mode_;
        }

        public ByteString getPrivateKey() {
            return this.privateKey_;
        }

        public long getSequence() {
            return this.sequence_;
        }

        public SigningMode getSigningMode() {
            SigningMode forNumber = SigningMode.forNumber(this.signingMode_);
            if (forNumber == null) {
                return SigningMode.UNRECOGNIZED;
            }
            return forNumber;
        }

        public int getSigningModeValue() {
            return this.signingMode_;
        }

        public boolean hasFee() {
            if (this.fee_ != null) {
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

        /* access modifiers changed from: private */
        public void addMessages(int i, Message message) {
            message.getClass();
            ensureMessagesIsMutable();
            this.messages_.add(i, message);
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

        String getChainId();

        ByteString getChainIdBytes();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        Fee getFee();

        String getMemo();

        ByteString getMemoBytes();

        Message getMessages(int i);

        int getMessagesCount();

        List<Message> getMessagesList();

        BroadcastMode getMode();

        int getModeValue();

        ByteString getPrivateKey();

        long getSequence();

        SigningMode getSigningMode();

        int getSigningModeValue();

        boolean hasFee();

        /* synthetic */ boolean isInitialized();
    }

    public enum SigningMode implements C5011t.C5014c {
        JSON(0),
        Protobuf(1),
        UNRECOGNIZED(-1);
        
        public static final int JSON_VALUE = 0;
        public static final int Protobuf_VALUE = 1;
        private static final C5011t.C5015d<SigningMode> internalValueMap = null;
        private final int value;

        public static final class SigningModeVerifier implements C5011t.C5016e {
            public static final C5011t.C5016e INSTANCE = null;

            static {
                INSTANCE = new SigningModeVerifier();
            }

            private SigningModeVerifier() {
            }

            public boolean isInRange(int i) {
                if (SigningMode.forNumber(i) != null) {
                    return true;
                }
                return false;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C5011t.C5015d<SigningMode>() {
                public SigningMode findValueByNumber(int i) {
                    return SigningMode.forNumber(i);
                }
            };
        }

        private SigningMode(int i) {
            this.value = i;
        }

        public static SigningMode forNumber(int i) {
            if (i == 0) {
                return JSON;
            }
            if (i != 1) {
                return null;
            }
            return Protobuf;
        }

        public static C5011t.C5015d<SigningMode> internalGetValueMap() {
            return internalValueMap;
        }

        public static C5011t.C5016e internalGetVerifier() {
            return SigningModeVerifier.INSTANCE;
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static SigningMode valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class SigningOutput extends GeneratedMessageLite<SigningOutput, Builder> implements SigningOutputOrBuilder {
        /* access modifiers changed from: private */
        public static final SigningOutput DEFAULT_INSTANCE;
        public static final int ERROR_FIELD_NUMBER = 4;
        public static final int JSON_FIELD_NUMBER = 2;
        private static volatile im4<SigningOutput> PARSER = null;
        public static final int SERIALIZED_FIELD_NUMBER = 3;
        public static final int SIGNATURE_FIELD_NUMBER = 1;
        public static final int SIGNATURE_JSON_FIELD_NUMBER = 5;
        private String error_ = "";
        private String json_ = "";
        private String serialized_ = "";
        private String signatureJson_ = "";
        private ByteString signature_ = ByteString.EMPTY;

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningOutput, Builder> implements SigningOutputOrBuilder {
            public /* synthetic */ Builder(C97321 r1) {
                this();
            }

            public Builder clearError() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearError();
                return this;
            }

            public Builder clearJson() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearJson();
                return this;
            }

            public Builder clearSerialized() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearSerialized();
                return this;
            }

            public Builder clearSignature() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearSignature();
                return this;
            }

            public Builder clearSignatureJson() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearSignatureJson();
                return this;
            }

            public String getError() {
                return ((SigningOutput) this.instance).getError();
            }

            public ByteString getErrorBytes() {
                return ((SigningOutput) this.instance).getErrorBytes();
            }

            public String getJson() {
                return ((SigningOutput) this.instance).getJson();
            }

            public ByteString getJsonBytes() {
                return ((SigningOutput) this.instance).getJsonBytes();
            }

            public String getSerialized() {
                return ((SigningOutput) this.instance).getSerialized();
            }

            public ByteString getSerializedBytes() {
                return ((SigningOutput) this.instance).getSerializedBytes();
            }

            public ByteString getSignature() {
                return ((SigningOutput) this.instance).getSignature();
            }

            public String getSignatureJson() {
                return ((SigningOutput) this.instance).getSignatureJson();
            }

            public ByteString getSignatureJsonBytes() {
                return ((SigningOutput) this.instance).getSignatureJsonBytes();
            }

            public Builder setError(String str) {
                copyOnWrite();
                ((SigningOutput) this.instance).setError(str);
                return this;
            }

            public Builder setErrorBytes(ByteString byteString) {
                copyOnWrite();
                ((SigningOutput) this.instance).setErrorBytes(byteString);
                return this;
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

            public Builder setSerialized(String str) {
                copyOnWrite();
                ((SigningOutput) this.instance).setSerialized(str);
                return this;
            }

            public Builder setSerializedBytes(ByteString byteString) {
                copyOnWrite();
                ((SigningOutput) this.instance).setSerializedBytes(byteString);
                return this;
            }

            public Builder setSignature(ByteString byteString) {
                copyOnWrite();
                ((SigningOutput) this.instance).setSignature(byteString);
                return this;
            }

            public Builder setSignatureJson(String str) {
                copyOnWrite();
                ((SigningOutput) this.instance).setSignatureJson(str);
                return this;
            }

            public Builder setSignatureJsonBytes(ByteString byteString) {
                copyOnWrite();
                ((SigningOutput) this.instance).setSignatureJsonBytes(byteString);
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
            this.error_ = getDefaultInstance().getError();
        }

        /* access modifiers changed from: private */
        public void clearJson() {
            this.json_ = getDefaultInstance().getJson();
        }

        /* access modifiers changed from: private */
        public void clearSerialized() {
            this.serialized_ = getDefaultInstance().getSerialized();
        }

        /* access modifiers changed from: private */
        public void clearSignature() {
            this.signature_ = getDefaultInstance().getSignature();
        }

        /* access modifiers changed from: private */
        public void clearSignatureJson() {
            this.signatureJson_ = getDefaultInstance().getSignatureJson();
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
        public void setError(String str) {
            str.getClass();
            this.error_ = str;
        }

        /* access modifiers changed from: private */
        public void setErrorBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.error_ = byteString.toStringUtf8();
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
        public void setSerialized(String str) {
            str.getClass();
            this.serialized_ = str;
        }

        /* access modifiers changed from: private */
        public void setSerializedBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.serialized_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setSignature(ByteString byteString) {
            byteString.getClass();
            this.signature_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setSignatureJson(String str) {
            str.getClass();
            this.signatureJson_ = str;
        }

        /* access modifiers changed from: private */
        public void setSignatureJsonBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.signatureJson_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97321.f46548xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningOutput();
                case 2:
                    return new Builder((C97321) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"signature_", "json_", "serialized_", "error_", "signatureJson_"});
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

        public String getError() {
            return this.error_;
        }

        public ByteString getErrorBytes() {
            return ByteString.copyFromUtf8(this.error_);
        }

        public String getJson() {
            return this.json_;
        }

        public ByteString getJsonBytes() {
            return ByteString.copyFromUtf8(this.json_);
        }

        public String getSerialized() {
            return this.serialized_;
        }

        public ByteString getSerializedBytes() {
            return ByteString.copyFromUtf8(this.serialized_);
        }

        public ByteString getSignature() {
            return this.signature_;
        }

        public String getSignatureJson() {
            return this.signatureJson_;
        }

        public ByteString getSignatureJsonBytes() {
            return ByteString.copyFromUtf8(this.signatureJson_);
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

        String getError();

        ByteString getErrorBytes();

        String getJson();

        ByteString getJsonBytes();

        String getSerialized();

        ByteString getSerializedBytes();

        ByteString getSignature();

        String getSignatureJson();

        ByteString getSignatureJsonBytes();

        /* synthetic */ boolean isInitialized();
    }

    private Cosmos() {
    }

    public static void registerAllExtensions(C4987l lVar) {
    }
}
