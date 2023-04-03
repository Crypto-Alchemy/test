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

public final class Polkadot {

    /* renamed from: wallet.core.jni.proto.Polkadot$1 */
    public static /* synthetic */ class C97601 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f46576xa1df5c61;

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
                f46576xa1df5c61 = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f46576xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f46576xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f46576xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f46576xa1df5c61     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f46576xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f46576xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wallet.core.jni.proto.Polkadot.C97601.<clinit>():void");
        }
    }

    public static final class Balance extends GeneratedMessageLite<Balance, Builder> implements BalanceOrBuilder {
        /* access modifiers changed from: private */
        public static final Balance DEFAULT_INSTANCE;
        private static volatile im4<Balance> PARSER = null;
        public static final int TRANSFER_FIELD_NUMBER = 1;
        private int messageOneofCase_ = 0;
        private Object messageOneof_;

        public static final class Builder extends GeneratedMessageLite.C4930a<Balance, Builder> implements BalanceOrBuilder {
            public /* synthetic */ Builder(C97601 r1) {
                this();
            }

            public Builder clearMessageOneof() {
                copyOnWrite();
                ((Balance) this.instance).clearMessageOneof();
                return this;
            }

            public Builder clearTransfer() {
                copyOnWrite();
                ((Balance) this.instance).clearTransfer();
                return this;
            }

            public MessageOneofCase getMessageOneofCase() {
                return ((Balance) this.instance).getMessageOneofCase();
            }

            public Transfer getTransfer() {
                return ((Balance) this.instance).getTransfer();
            }

            public boolean hasTransfer() {
                return ((Balance) this.instance).hasTransfer();
            }

            public Builder mergeTransfer(Transfer transfer) {
                copyOnWrite();
                ((Balance) this.instance).mergeTransfer(transfer);
                return this;
            }

            public Builder setTransfer(Transfer transfer) {
                copyOnWrite();
                ((Balance) this.instance).setTransfer(transfer);
                return this;
            }

            private Builder() {
                super(Balance.DEFAULT_INSTANCE);
            }

            public Builder setTransfer(Transfer.Builder builder) {
                copyOnWrite();
                ((Balance) this.instance).setTransfer((Transfer) builder.build());
                return this;
            }
        }

        public enum MessageOneofCase {
            TRANSFER(1),
            MESSAGEONEOF_NOT_SET(0);
            
            private final int value;

            private MessageOneofCase(int i) {
                this.value = i;
            }

            public static MessageOneofCase forNumber(int i) {
                if (i == 0) {
                    return MESSAGEONEOF_NOT_SET;
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
            public static MessageOneofCase valueOf(int i) {
                return forNumber(i);
            }
        }

        public static final class Transfer extends GeneratedMessageLite<Transfer, Builder> implements TransferOrBuilder {
            /* access modifiers changed from: private */
            public static final Transfer DEFAULT_INSTANCE;
            private static volatile im4<Transfer> PARSER = null;
            public static final int TO_ADDRESS_FIELD_NUMBER = 1;
            public static final int VALUE_FIELD_NUMBER = 2;
            private String toAddress_ = "";
            private ByteString value_ = ByteString.EMPTY;

            public static final class Builder extends GeneratedMessageLite.C4930a<Transfer, Builder> implements TransferOrBuilder {
                public /* synthetic */ Builder(C97601 r1) {
                    this();
                }

                public Builder clearToAddress() {
                    copyOnWrite();
                    ((Transfer) this.instance).clearToAddress();
                    return this;
                }

                public Builder clearValue() {
                    copyOnWrite();
                    ((Transfer) this.instance).clearValue();
                    return this;
                }

                public String getToAddress() {
                    return ((Transfer) this.instance).getToAddress();
                }

                public ByteString getToAddressBytes() {
                    return ((Transfer) this.instance).getToAddressBytes();
                }

                public ByteString getValue() {
                    return ((Transfer) this.instance).getValue();
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

                public Builder setValue(ByteString byteString) {
                    copyOnWrite();
                    ((Transfer) this.instance).setValue(byteString);
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
            public void clearToAddress() {
                this.toAddress_ = getDefaultInstance().getToAddress();
            }

            /* access modifiers changed from: private */
            public void clearValue() {
                this.value_ = getDefaultInstance().getValue();
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
            public void setValue(ByteString byteString) {
                byteString.getClass();
                this.value_ = byteString;
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97601.f46576xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Transfer();
                    case 2:
                        return new Builder((C97601) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"toAddress_", "value_"});
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

            public String getToAddress() {
                return this.toAddress_;
            }

            public ByteString getToAddressBytes() {
                return ByteString.copyFromUtf8(this.toAddress_);
            }

            public ByteString getValue() {
                return this.value_;
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

            String getToAddress();

            ByteString getToAddressBytes();

            ByteString getValue();

            /* synthetic */ boolean isInitialized();
        }

        static {
            Balance balance = new Balance();
            DEFAULT_INSTANCE = balance;
            GeneratedMessageLite.registerDefaultInstance(Balance.class, balance);
        }

        private Balance() {
        }

        /* access modifiers changed from: private */
        public void clearMessageOneof() {
            this.messageOneofCase_ = 0;
            this.messageOneof_ = null;
        }

        /* access modifiers changed from: private */
        public void clearTransfer() {
            if (this.messageOneofCase_ == 1) {
                this.messageOneofCase_ = 0;
                this.messageOneof_ = null;
            }
        }

        public static Balance getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeTransfer(Transfer transfer) {
            transfer.getClass();
            if (this.messageOneofCase_ != 1 || this.messageOneof_ == Transfer.getDefaultInstance()) {
                this.messageOneof_ = transfer;
            } else {
                this.messageOneof_ = ((Transfer.Builder) Transfer.newBuilder((Transfer) this.messageOneof_).mergeFrom(transfer)).buildPartial();
            }
            this.messageOneofCase_ = 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Balance parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Balance) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Balance parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Balance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<Balance> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setTransfer(Transfer transfer) {
            transfer.getClass();
            this.messageOneof_ = transfer;
            this.messageOneofCase_ = 1;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97601.f46576xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Balance();
                case 2:
                    return new Builder((C97601) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"messageOneof_", "messageOneofCase_", Transfer.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<Balance> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (Balance.class) {
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

        public MessageOneofCase getMessageOneofCase() {
            return MessageOneofCase.forNumber(this.messageOneofCase_);
        }

        public Transfer getTransfer() {
            if (this.messageOneofCase_ == 1) {
                return (Transfer) this.messageOneof_;
            }
            return Transfer.getDefaultInstance();
        }

        public boolean hasTransfer() {
            if (this.messageOneofCase_ == 1) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(Balance balance) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(balance);
        }

        public static Balance parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Balance) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Balance parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (Balance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static Balance parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Balance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Balance parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (Balance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static Balance parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Balance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Balance parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (Balance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static Balance parseFrom(InputStream inputStream) throws IOException {
            return (Balance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Balance parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Balance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Balance parseFrom(C4969g gVar) throws IOException {
            return (Balance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static Balance parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (Balance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface BalanceOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        Balance.MessageOneofCase getMessageOneofCase();

        Balance.Transfer getTransfer();

        boolean hasTransfer();

        /* synthetic */ boolean isInitialized();
    }

    public static final class Era extends GeneratedMessageLite<Era, Builder> implements EraOrBuilder {
        public static final int BLOCK_NUMBER_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final Era DEFAULT_INSTANCE;
        private static volatile im4<Era> PARSER = null;
        public static final int PERIOD_FIELD_NUMBER = 2;
        private long blockNumber_;
        private long period_;

        public static final class Builder extends GeneratedMessageLite.C4930a<Era, Builder> implements EraOrBuilder {
            public /* synthetic */ Builder(C97601 r1) {
                this();
            }

            public Builder clearBlockNumber() {
                copyOnWrite();
                ((Era) this.instance).clearBlockNumber();
                return this;
            }

            public Builder clearPeriod() {
                copyOnWrite();
                ((Era) this.instance).clearPeriod();
                return this;
            }

            public long getBlockNumber() {
                return ((Era) this.instance).getBlockNumber();
            }

            public long getPeriod() {
                return ((Era) this.instance).getPeriod();
            }

            public Builder setBlockNumber(long j) {
                copyOnWrite();
                ((Era) this.instance).setBlockNumber(j);
                return this;
            }

            public Builder setPeriod(long j) {
                copyOnWrite();
                ((Era) this.instance).setPeriod(j);
                return this;
            }

            private Builder() {
                super(Era.DEFAULT_INSTANCE);
            }
        }

        static {
            Era era = new Era();
            DEFAULT_INSTANCE = era;
            GeneratedMessageLite.registerDefaultInstance(Era.class, era);
        }

        private Era() {
        }

        /* access modifiers changed from: private */
        public void clearBlockNumber() {
            this.blockNumber_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearPeriod() {
            this.period_ = 0;
        }

        public static Era getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Era parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Era) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Era parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Era) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<Era> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setBlockNumber(long j) {
            this.blockNumber_ = j;
        }

        /* access modifiers changed from: private */
        public void setPeriod(long j) {
            this.period_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97601.f46576xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Era();
                case 2:
                    return new Builder((C97601) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0003\u0002\u0003", new Object[]{"blockNumber_", "period_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<Era> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (Era.class) {
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

        public long getBlockNumber() {
            return this.blockNumber_;
        }

        public long getPeriod() {
            return this.period_;
        }

        public static Builder newBuilder(Era era) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(era);
        }

        public static Era parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Era) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Era parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (Era) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static Era parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Era) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Era parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (Era) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static Era parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Era) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Era parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (Era) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static Era parseFrom(InputStream inputStream) throws IOException {
            return (Era) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Era parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Era) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Era parseFrom(C4969g gVar) throws IOException {
            return (Era) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static Era parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (Era) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface EraOrBuilder extends qu3 {
        long getBlockNumber();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        long getPeriod();

        /* synthetic */ boolean isInitialized();
    }

    public enum RewardDestination implements C5011t.C5014c {
        STAKED(0),
        STASH(1),
        CONTROLLER(2),
        UNRECOGNIZED(-1);
        
        public static final int CONTROLLER_VALUE = 2;
        public static final int STAKED_VALUE = 0;
        public static final int STASH_VALUE = 1;
        private static final C5011t.C5015d<RewardDestination> internalValueMap = null;
        private final int value;

        public static final class RewardDestinationVerifier implements C5011t.C5016e {
            public static final C5011t.C5016e INSTANCE = null;

            static {
                INSTANCE = new RewardDestinationVerifier();
            }

            private RewardDestinationVerifier() {
            }

            public boolean isInRange(int i) {
                if (RewardDestination.forNumber(i) != null) {
                    return true;
                }
                return false;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C5011t.C5015d<RewardDestination>() {
                public RewardDestination findValueByNumber(int i) {
                    return RewardDestination.forNumber(i);
                }
            };
        }

        private RewardDestination(int i) {
            this.value = i;
        }

        public static RewardDestination forNumber(int i) {
            if (i == 0) {
                return STAKED;
            }
            if (i == 1) {
                return STASH;
            }
            if (i != 2) {
                return null;
            }
            return CONTROLLER;
        }

        public static C5011t.C5015d<RewardDestination> internalGetValueMap() {
            return internalValueMap;
        }

        public static C5011t.C5016e internalGetVerifier() {
            return RewardDestinationVerifier.INSTANCE;
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static RewardDestination valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class SigningInput extends GeneratedMessageLite<SigningInput, Builder> implements SigningInputOrBuilder {
        public static final int BALANCE_CALL_FIELD_NUMBER = 10;
        public static final int BLOCK_HASH_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final SigningInput DEFAULT_INSTANCE;
        public static final int ERA_FIELD_NUMBER = 7;
        public static final int GENESIS_HASH_FIELD_NUMBER = 2;
        public static final int NETWORK_FIELD_NUMBER = 9;
        public static final int NONCE_FIELD_NUMBER = 3;
        private static volatile im4<SigningInput> PARSER = null;
        public static final int PRIVATE_KEY_FIELD_NUMBER = 8;
        public static final int SPEC_VERSION_FIELD_NUMBER = 4;
        public static final int STAKING_CALL_FIELD_NUMBER = 11;
        public static final int TIP_FIELD_NUMBER = 6;
        public static final int TRANSACTION_VERSION_FIELD_NUMBER = 5;
        private ByteString blockHash_;
        private Era era_;
        private ByteString genesisHash_;
        private int messageOneofCase_ = 0;
        private Object messageOneof_;
        private int network_;
        private long nonce_;
        private ByteString privateKey_;
        private int specVersion_;
        private ByteString tip_;
        private int transactionVersion_;

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningInput, Builder> implements SigningInputOrBuilder {
            public /* synthetic */ Builder(C97601 r1) {
                this();
            }

            public Builder clearBalanceCall() {
                copyOnWrite();
                ((SigningInput) this.instance).clearBalanceCall();
                return this;
            }

            public Builder clearBlockHash() {
                copyOnWrite();
                ((SigningInput) this.instance).clearBlockHash();
                return this;
            }

            public Builder clearEra() {
                copyOnWrite();
                ((SigningInput) this.instance).clearEra();
                return this;
            }

            public Builder clearGenesisHash() {
                copyOnWrite();
                ((SigningInput) this.instance).clearGenesisHash();
                return this;
            }

            public Builder clearMessageOneof() {
                copyOnWrite();
                ((SigningInput) this.instance).clearMessageOneof();
                return this;
            }

            public Builder clearNetwork() {
                copyOnWrite();
                ((SigningInput) this.instance).clearNetwork();
                return this;
            }

            public Builder clearNonce() {
                copyOnWrite();
                ((SigningInput) this.instance).clearNonce();
                return this;
            }

            public Builder clearPrivateKey() {
                copyOnWrite();
                ((SigningInput) this.instance).clearPrivateKey();
                return this;
            }

            public Builder clearSpecVersion() {
                copyOnWrite();
                ((SigningInput) this.instance).clearSpecVersion();
                return this;
            }

            public Builder clearStakingCall() {
                copyOnWrite();
                ((SigningInput) this.instance).clearStakingCall();
                return this;
            }

            public Builder clearTip() {
                copyOnWrite();
                ((SigningInput) this.instance).clearTip();
                return this;
            }

            public Builder clearTransactionVersion() {
                copyOnWrite();
                ((SigningInput) this.instance).clearTransactionVersion();
                return this;
            }

            public Balance getBalanceCall() {
                return ((SigningInput) this.instance).getBalanceCall();
            }

            public ByteString getBlockHash() {
                return ((SigningInput) this.instance).getBlockHash();
            }

            public Era getEra() {
                return ((SigningInput) this.instance).getEra();
            }

            public ByteString getGenesisHash() {
                return ((SigningInput) this.instance).getGenesisHash();
            }

            public MessageOneofCase getMessageOneofCase() {
                return ((SigningInput) this.instance).getMessageOneofCase();
            }

            public int getNetwork() {
                return ((SigningInput) this.instance).getNetwork();
            }

            public long getNonce() {
                return ((SigningInput) this.instance).getNonce();
            }

            public ByteString getPrivateKey() {
                return ((SigningInput) this.instance).getPrivateKey();
            }

            public int getSpecVersion() {
                return ((SigningInput) this.instance).getSpecVersion();
            }

            public Staking getStakingCall() {
                return ((SigningInput) this.instance).getStakingCall();
            }

            public ByteString getTip() {
                return ((SigningInput) this.instance).getTip();
            }

            public int getTransactionVersion() {
                return ((SigningInput) this.instance).getTransactionVersion();
            }

            public boolean hasBalanceCall() {
                return ((SigningInput) this.instance).hasBalanceCall();
            }

            public boolean hasEra() {
                return ((SigningInput) this.instance).hasEra();
            }

            public boolean hasStakingCall() {
                return ((SigningInput) this.instance).hasStakingCall();
            }

            public Builder mergeBalanceCall(Balance balance) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeBalanceCall(balance);
                return this;
            }

            public Builder mergeEra(Era era) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeEra(era);
                return this;
            }

            public Builder mergeStakingCall(Staking staking) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeStakingCall(staking);
                return this;
            }

            public Builder setBalanceCall(Balance balance) {
                copyOnWrite();
                ((SigningInput) this.instance).setBalanceCall(balance);
                return this;
            }

            public Builder setBlockHash(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setBlockHash(byteString);
                return this;
            }

            public Builder setEra(Era era) {
                copyOnWrite();
                ((SigningInput) this.instance).setEra(era);
                return this;
            }

            public Builder setGenesisHash(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setGenesisHash(byteString);
                return this;
            }

            public Builder setNetwork(int i) {
                copyOnWrite();
                ((SigningInput) this.instance).setNetwork(i);
                return this;
            }

            public Builder setNonce(long j) {
                copyOnWrite();
                ((SigningInput) this.instance).setNonce(j);
                return this;
            }

            public Builder setPrivateKey(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setPrivateKey(byteString);
                return this;
            }

            public Builder setSpecVersion(int i) {
                copyOnWrite();
                ((SigningInput) this.instance).setSpecVersion(i);
                return this;
            }

            public Builder setStakingCall(Staking staking) {
                copyOnWrite();
                ((SigningInput) this.instance).setStakingCall(staking);
                return this;
            }

            public Builder setTip(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setTip(byteString);
                return this;
            }

            public Builder setTransactionVersion(int i) {
                copyOnWrite();
                ((SigningInput) this.instance).setTransactionVersion(i);
                return this;
            }

            private Builder() {
                super(SigningInput.DEFAULT_INSTANCE);
            }

            public Builder setBalanceCall(Balance.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setBalanceCall((Balance) builder.build());
                return this;
            }

            public Builder setEra(Era.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setEra((Era) builder.build());
                return this;
            }

            public Builder setStakingCall(Staking.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setStakingCall((Staking) builder.build());
                return this;
            }
        }

        public enum MessageOneofCase {
            BALANCE_CALL(10),
            STAKING_CALL(11),
            MESSAGEONEOF_NOT_SET(0);
            
            private final int value;

            private MessageOneofCase(int i) {
                this.value = i;
            }

            public static MessageOneofCase forNumber(int i) {
                if (i == 0) {
                    return MESSAGEONEOF_NOT_SET;
                }
                if (i == 10) {
                    return BALANCE_CALL;
                }
                if (i != 11) {
                    return null;
                }
                return STAKING_CALL;
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
            this.blockHash_ = byteString;
            this.genesisHash_ = byteString;
            this.tip_ = byteString;
            this.privateKey_ = byteString;
        }

        /* access modifiers changed from: private */
        public void clearBalanceCall() {
            if (this.messageOneofCase_ == 10) {
                this.messageOneofCase_ = 0;
                this.messageOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearBlockHash() {
            this.blockHash_ = getDefaultInstance().getBlockHash();
        }

        /* access modifiers changed from: private */
        public void clearEra() {
            this.era_ = null;
        }

        /* access modifiers changed from: private */
        public void clearGenesisHash() {
            this.genesisHash_ = getDefaultInstance().getGenesisHash();
        }

        /* access modifiers changed from: private */
        public void clearMessageOneof() {
            this.messageOneofCase_ = 0;
            this.messageOneof_ = null;
        }

        /* access modifiers changed from: private */
        public void clearNetwork() {
            this.network_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearNonce() {
            this.nonce_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearPrivateKey() {
            this.privateKey_ = getDefaultInstance().getPrivateKey();
        }

        /* access modifiers changed from: private */
        public void clearSpecVersion() {
            this.specVersion_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearStakingCall() {
            if (this.messageOneofCase_ == 11) {
                this.messageOneofCase_ = 0;
                this.messageOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearTip() {
            this.tip_ = getDefaultInstance().getTip();
        }

        /* access modifiers changed from: private */
        public void clearTransactionVersion() {
            this.transactionVersion_ = 0;
        }

        public static SigningInput getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeBalanceCall(Balance balance) {
            balance.getClass();
            if (this.messageOneofCase_ != 10 || this.messageOneof_ == Balance.getDefaultInstance()) {
                this.messageOneof_ = balance;
            } else {
                this.messageOneof_ = ((Balance.Builder) Balance.newBuilder((Balance) this.messageOneof_).mergeFrom(balance)).buildPartial();
            }
            this.messageOneofCase_ = 10;
        }

        /* access modifiers changed from: private */
        public void mergeEra(Era era) {
            era.getClass();
            Era era2 = this.era_;
            if (era2 == null || era2 == Era.getDefaultInstance()) {
                this.era_ = era;
            } else {
                this.era_ = (Era) ((Era.Builder) Era.newBuilder(this.era_).mergeFrom(era)).buildPartial();
            }
        }

        /* access modifiers changed from: private */
        public void mergeStakingCall(Staking staking) {
            staking.getClass();
            if (this.messageOneofCase_ != 11 || this.messageOneof_ == Staking.getDefaultInstance()) {
                this.messageOneof_ = staking;
            } else {
                this.messageOneof_ = ((Staking.Builder) Staking.newBuilder((Staking) this.messageOneof_).mergeFrom(staking)).buildPartial();
            }
            this.messageOneofCase_ = 11;
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
        public void setBalanceCall(Balance balance) {
            balance.getClass();
            this.messageOneof_ = balance;
            this.messageOneofCase_ = 10;
        }

        /* access modifiers changed from: private */
        public void setBlockHash(ByteString byteString) {
            byteString.getClass();
            this.blockHash_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setEra(Era era) {
            era.getClass();
            this.era_ = era;
        }

        /* access modifiers changed from: private */
        public void setGenesisHash(ByteString byteString) {
            byteString.getClass();
            this.genesisHash_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setNetwork(int i) {
            this.network_ = i;
        }

        /* access modifiers changed from: private */
        public void setNonce(long j) {
            this.nonce_ = j;
        }

        /* access modifiers changed from: private */
        public void setPrivateKey(ByteString byteString) {
            byteString.getClass();
            this.privateKey_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setSpecVersion(int i) {
            this.specVersion_ = i;
        }

        /* access modifiers changed from: private */
        public void setStakingCall(Staking staking) {
            staking.getClass();
            this.messageOneof_ = staking;
            this.messageOneofCase_ = 11;
        }

        /* access modifiers changed from: private */
        public void setTip(ByteString byteString) {
            byteString.getClass();
            this.tip_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setTransactionVersion(int i) {
            this.transactionVersion_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97601.f46576xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningInput();
                case 2:
                    return new Builder((C97601) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0001\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001\n\u0002\n\u0003\u0003\u0004\u000b\u0005\u000b\u0006\n\u0007\t\b\n\t\u000b\n<\u0000\u000b<\u0000", new Object[]{"messageOneof_", "messageOneofCase_", "blockHash_", "genesisHash_", "nonce_", "specVersion_", "transactionVersion_", "tip_", "era_", "privateKey_", "network_", Balance.class, Staking.class});
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

        public Balance getBalanceCall() {
            if (this.messageOneofCase_ == 10) {
                return (Balance) this.messageOneof_;
            }
            return Balance.getDefaultInstance();
        }

        public ByteString getBlockHash() {
            return this.blockHash_;
        }

        public Era getEra() {
            Era era = this.era_;
            if (era == null) {
                return Era.getDefaultInstance();
            }
            return era;
        }

        public ByteString getGenesisHash() {
            return this.genesisHash_;
        }

        public MessageOneofCase getMessageOneofCase() {
            return MessageOneofCase.forNumber(this.messageOneofCase_);
        }

        public int getNetwork() {
            return this.network_;
        }

        public long getNonce() {
            return this.nonce_;
        }

        public ByteString getPrivateKey() {
            return this.privateKey_;
        }

        public int getSpecVersion() {
            return this.specVersion_;
        }

        public Staking getStakingCall() {
            if (this.messageOneofCase_ == 11) {
                return (Staking) this.messageOneof_;
            }
            return Staking.getDefaultInstance();
        }

        public ByteString getTip() {
            return this.tip_;
        }

        public int getTransactionVersion() {
            return this.transactionVersion_;
        }

        public boolean hasBalanceCall() {
            if (this.messageOneofCase_ == 10) {
                return true;
            }
            return false;
        }

        public boolean hasEra() {
            if (this.era_ != null) {
                return true;
            }
            return false;
        }

        public boolean hasStakingCall() {
            if (this.messageOneofCase_ == 11) {
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
        Balance getBalanceCall();

        ByteString getBlockHash();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        Era getEra();

        ByteString getGenesisHash();

        SigningInput.MessageOneofCase getMessageOneofCase();

        int getNetwork();

        long getNonce();

        ByteString getPrivateKey();

        int getSpecVersion();

        Staking getStakingCall();

        ByteString getTip();

        int getTransactionVersion();

        boolean hasBalanceCall();

        boolean hasEra();

        boolean hasStakingCall();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SigningOutput extends GeneratedMessageLite<SigningOutput, Builder> implements SigningOutputOrBuilder {
        /* access modifiers changed from: private */
        public static final SigningOutput DEFAULT_INSTANCE;
        public static final int ENCODED_FIELD_NUMBER = 1;
        private static volatile im4<SigningOutput> PARSER;
        private ByteString encoded_ = ByteString.EMPTY;

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningOutput, Builder> implements SigningOutputOrBuilder {
            public /* synthetic */ Builder(C97601 r1) {
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
            switch (C97601.f46576xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningOutput();
                case 2:
                    return new Builder((C97601) null);
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

    public static final class Staking extends GeneratedMessageLite<Staking, Builder> implements StakingOrBuilder {
        public static final int BOND_AND_NOMINATE_FIELD_NUMBER = 2;
        public static final int BOND_EXTRA_FIELD_NUMBER = 3;
        public static final int BOND_FIELD_NUMBER = 1;
        public static final int CHILL_AND_UNBOND_FIELD_NUMBER = 8;
        public static final int CHILL_FIELD_NUMBER = 7;
        /* access modifiers changed from: private */
        public static final Staking DEFAULT_INSTANCE;
        public static final int NOMINATE_FIELD_NUMBER = 6;
        private static volatile im4<Staking> PARSER = null;
        public static final int UNBOND_FIELD_NUMBER = 4;
        public static final int WITHDRAW_UNBONDED_FIELD_NUMBER = 5;
        private int messageOneofCase_ = 0;
        private Object messageOneof_;

        public static final class Bond extends GeneratedMessageLite<Bond, Builder> implements BondOrBuilder {
            public static final int CONTROLLER_FIELD_NUMBER = 1;
            /* access modifiers changed from: private */
            public static final Bond DEFAULT_INSTANCE;
            private static volatile im4<Bond> PARSER = null;
            public static final int REWARD_DESTINATION_FIELD_NUMBER = 3;
            public static final int VALUE_FIELD_NUMBER = 2;
            private String controller_ = "";
            private int rewardDestination_;
            private ByteString value_ = ByteString.EMPTY;

            public static final class Builder extends GeneratedMessageLite.C4930a<Bond, Builder> implements BondOrBuilder {
                public /* synthetic */ Builder(C97601 r1) {
                    this();
                }

                public Builder clearController() {
                    copyOnWrite();
                    ((Bond) this.instance).clearController();
                    return this;
                }

                public Builder clearRewardDestination() {
                    copyOnWrite();
                    ((Bond) this.instance).clearRewardDestination();
                    return this;
                }

                public Builder clearValue() {
                    copyOnWrite();
                    ((Bond) this.instance).clearValue();
                    return this;
                }

                public String getController() {
                    return ((Bond) this.instance).getController();
                }

                public ByteString getControllerBytes() {
                    return ((Bond) this.instance).getControllerBytes();
                }

                public RewardDestination getRewardDestination() {
                    return ((Bond) this.instance).getRewardDestination();
                }

                public int getRewardDestinationValue() {
                    return ((Bond) this.instance).getRewardDestinationValue();
                }

                public ByteString getValue() {
                    return ((Bond) this.instance).getValue();
                }

                public Builder setController(String str) {
                    copyOnWrite();
                    ((Bond) this.instance).setController(str);
                    return this;
                }

                public Builder setControllerBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Bond) this.instance).setControllerBytes(byteString);
                    return this;
                }

                public Builder setRewardDestination(RewardDestination rewardDestination) {
                    copyOnWrite();
                    ((Bond) this.instance).setRewardDestination(rewardDestination);
                    return this;
                }

                public Builder setRewardDestinationValue(int i) {
                    copyOnWrite();
                    ((Bond) this.instance).setRewardDestinationValue(i);
                    return this;
                }

                public Builder setValue(ByteString byteString) {
                    copyOnWrite();
                    ((Bond) this.instance).setValue(byteString);
                    return this;
                }

                private Builder() {
                    super(Bond.DEFAULT_INSTANCE);
                }
            }

            static {
                Bond bond = new Bond();
                DEFAULT_INSTANCE = bond;
                GeneratedMessageLite.registerDefaultInstance(Bond.class, bond);
            }

            private Bond() {
            }

            /* access modifiers changed from: private */
            public void clearController() {
                this.controller_ = getDefaultInstance().getController();
            }

            /* access modifiers changed from: private */
            public void clearRewardDestination() {
                this.rewardDestination_ = 0;
            }

            /* access modifiers changed from: private */
            public void clearValue() {
                this.value_ = getDefaultInstance().getValue();
            }

            public static Bond getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static Bond parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Bond) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Bond parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Bond) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<Bond> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setController(String str) {
                str.getClass();
                this.controller_ = str;
            }

            /* access modifiers changed from: private */
            public void setControllerBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.controller_ = byteString.toStringUtf8();
            }

            /* access modifiers changed from: private */
            public void setRewardDestination(RewardDestination rewardDestination) {
                this.rewardDestination_ = rewardDestination.getNumber();
            }

            /* access modifiers changed from: private */
            public void setRewardDestinationValue(int i) {
                this.rewardDestination_ = i;
            }

            /* access modifiers changed from: private */
            public void setValue(ByteString byteString) {
                byteString.getClass();
                this.value_ = byteString;
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97601.f46576xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Bond();
                    case 2:
                        return new Builder((C97601) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"controller_", "value_", "rewardDestination_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<Bond> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (Bond.class) {
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

            public String getController() {
                return this.controller_;
            }

            public ByteString getControllerBytes() {
                return ByteString.copyFromUtf8(this.controller_);
            }

            public RewardDestination getRewardDestination() {
                RewardDestination forNumber = RewardDestination.forNumber(this.rewardDestination_);
                if (forNumber == null) {
                    return RewardDestination.UNRECOGNIZED;
                }
                return forNumber;
            }

            public int getRewardDestinationValue() {
                return this.rewardDestination_;
            }

            public ByteString getValue() {
                return this.value_;
            }

            public static Builder newBuilder(Bond bond) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(bond);
            }

            public static Bond parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (Bond) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static Bond parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (Bond) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static Bond parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Bond) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Bond parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (Bond) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static Bond parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Bond) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Bond parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (Bond) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static Bond parseFrom(InputStream inputStream) throws IOException {
                return (Bond) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Bond parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (Bond) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static Bond parseFrom(C4969g gVar) throws IOException {
                return (Bond) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static Bond parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (Bond) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public static final class BondAndNominate extends GeneratedMessageLite<BondAndNominate, Builder> implements BondAndNominateOrBuilder {
            public static final int CONTROLLER_FIELD_NUMBER = 1;
            /* access modifiers changed from: private */
            public static final BondAndNominate DEFAULT_INSTANCE;
            public static final int NOMINATORS_FIELD_NUMBER = 4;
            private static volatile im4<BondAndNominate> PARSER = null;
            public static final int REWARD_DESTINATION_FIELD_NUMBER = 3;
            public static final int VALUE_FIELD_NUMBER = 2;
            private String controller_ = "";
            private C5011t.C5020i<String> nominators_ = GeneratedMessageLite.emptyProtobufList();
            private int rewardDestination_;
            private ByteString value_ = ByteString.EMPTY;

            public static final class Builder extends GeneratedMessageLite.C4930a<BondAndNominate, Builder> implements BondAndNominateOrBuilder {
                public /* synthetic */ Builder(C97601 r1) {
                    this();
                }

                public Builder addAllNominators(Iterable<String> iterable) {
                    copyOnWrite();
                    ((BondAndNominate) this.instance).addAllNominators(iterable);
                    return this;
                }

                public Builder addNominators(String str) {
                    copyOnWrite();
                    ((BondAndNominate) this.instance).addNominators(str);
                    return this;
                }

                public Builder addNominatorsBytes(ByteString byteString) {
                    copyOnWrite();
                    ((BondAndNominate) this.instance).addNominatorsBytes(byteString);
                    return this;
                }

                public Builder clearController() {
                    copyOnWrite();
                    ((BondAndNominate) this.instance).clearController();
                    return this;
                }

                public Builder clearNominators() {
                    copyOnWrite();
                    ((BondAndNominate) this.instance).clearNominators();
                    return this;
                }

                public Builder clearRewardDestination() {
                    copyOnWrite();
                    ((BondAndNominate) this.instance).clearRewardDestination();
                    return this;
                }

                public Builder clearValue() {
                    copyOnWrite();
                    ((BondAndNominate) this.instance).clearValue();
                    return this;
                }

                public String getController() {
                    return ((BondAndNominate) this.instance).getController();
                }

                public ByteString getControllerBytes() {
                    return ((BondAndNominate) this.instance).getControllerBytes();
                }

                public String getNominators(int i) {
                    return ((BondAndNominate) this.instance).getNominators(i);
                }

                public ByteString getNominatorsBytes(int i) {
                    return ((BondAndNominate) this.instance).getNominatorsBytes(i);
                }

                public int getNominatorsCount() {
                    return ((BondAndNominate) this.instance).getNominatorsCount();
                }

                public List<String> getNominatorsList() {
                    return Collections.unmodifiableList(((BondAndNominate) this.instance).getNominatorsList());
                }

                public RewardDestination getRewardDestination() {
                    return ((BondAndNominate) this.instance).getRewardDestination();
                }

                public int getRewardDestinationValue() {
                    return ((BondAndNominate) this.instance).getRewardDestinationValue();
                }

                public ByteString getValue() {
                    return ((BondAndNominate) this.instance).getValue();
                }

                public Builder setController(String str) {
                    copyOnWrite();
                    ((BondAndNominate) this.instance).setController(str);
                    return this;
                }

                public Builder setControllerBytes(ByteString byteString) {
                    copyOnWrite();
                    ((BondAndNominate) this.instance).setControllerBytes(byteString);
                    return this;
                }

                public Builder setNominators(int i, String str) {
                    copyOnWrite();
                    ((BondAndNominate) this.instance).setNominators(i, str);
                    return this;
                }

                public Builder setRewardDestination(RewardDestination rewardDestination) {
                    copyOnWrite();
                    ((BondAndNominate) this.instance).setRewardDestination(rewardDestination);
                    return this;
                }

                public Builder setRewardDestinationValue(int i) {
                    copyOnWrite();
                    ((BondAndNominate) this.instance).setRewardDestinationValue(i);
                    return this;
                }

                public Builder setValue(ByteString byteString) {
                    copyOnWrite();
                    ((BondAndNominate) this.instance).setValue(byteString);
                    return this;
                }

                private Builder() {
                    super(BondAndNominate.DEFAULT_INSTANCE);
                }
            }

            static {
                BondAndNominate bondAndNominate = new BondAndNominate();
                DEFAULT_INSTANCE = bondAndNominate;
                GeneratedMessageLite.registerDefaultInstance(BondAndNominate.class, bondAndNominate);
            }

            private BondAndNominate() {
            }

            /* access modifiers changed from: private */
            public void addAllNominators(Iterable<String> iterable) {
                ensureNominatorsIsMutable();
                C4949a.addAll(iterable, this.nominators_);
            }

            /* access modifiers changed from: private */
            public void addNominators(String str) {
                str.getClass();
                ensureNominatorsIsMutable();
                this.nominators_.add(str);
            }

            /* access modifiers changed from: private */
            public void addNominatorsBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                ensureNominatorsIsMutable();
                this.nominators_.add(byteString.toStringUtf8());
            }

            /* access modifiers changed from: private */
            public void clearController() {
                this.controller_ = getDefaultInstance().getController();
            }

            /* access modifiers changed from: private */
            public void clearNominators() {
                this.nominators_ = GeneratedMessageLite.emptyProtobufList();
            }

            /* access modifiers changed from: private */
            public void clearRewardDestination() {
                this.rewardDestination_ = 0;
            }

            /* access modifiers changed from: private */
            public void clearValue() {
                this.value_ = getDefaultInstance().getValue();
            }

            private void ensureNominatorsIsMutable() {
                C5011t.C5020i<String> iVar = this.nominators_;
                if (!iVar.mo37090v()) {
                    this.nominators_ = GeneratedMessageLite.mutableCopy(iVar);
                }
            }

            public static BondAndNominate getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static BondAndNominate parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (BondAndNominate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static BondAndNominate parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (BondAndNominate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<BondAndNominate> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setController(String str) {
                str.getClass();
                this.controller_ = str;
            }

            /* access modifiers changed from: private */
            public void setControllerBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.controller_ = byteString.toStringUtf8();
            }

            /* access modifiers changed from: private */
            public void setNominators(int i, String str) {
                str.getClass();
                ensureNominatorsIsMutable();
                this.nominators_.set(i, str);
            }

            /* access modifiers changed from: private */
            public void setRewardDestination(RewardDestination rewardDestination) {
                this.rewardDestination_ = rewardDestination.getNumber();
            }

            /* access modifiers changed from: private */
            public void setRewardDestinationValue(int i) {
                this.rewardDestination_ = i;
            }

            /* access modifiers changed from: private */
            public void setValue(ByteString byteString) {
                byteString.getClass();
                this.value_ = byteString;
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97601.f46576xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new BondAndNominate();
                    case 2:
                        return new Builder((C97601) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\n\u0003\f\u0004Ț", new Object[]{"controller_", "value_", "rewardDestination_", "nominators_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<BondAndNominate> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (BondAndNominate.class) {
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

            public String getController() {
                return this.controller_;
            }

            public ByteString getControllerBytes() {
                return ByteString.copyFromUtf8(this.controller_);
            }

            public String getNominators(int i) {
                return this.nominators_.get(i);
            }

            public ByteString getNominatorsBytes(int i) {
                return ByteString.copyFromUtf8(this.nominators_.get(i));
            }

            public int getNominatorsCount() {
                return this.nominators_.size();
            }

            public List<String> getNominatorsList() {
                return this.nominators_;
            }

            public RewardDestination getRewardDestination() {
                RewardDestination forNumber = RewardDestination.forNumber(this.rewardDestination_);
                if (forNumber == null) {
                    return RewardDestination.UNRECOGNIZED;
                }
                return forNumber;
            }

            public int getRewardDestinationValue() {
                return this.rewardDestination_;
            }

            public ByteString getValue() {
                return this.value_;
            }

            public static Builder newBuilder(BondAndNominate bondAndNominate) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(bondAndNominate);
            }

            public static BondAndNominate parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (BondAndNominate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static BondAndNominate parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (BondAndNominate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static BondAndNominate parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (BondAndNominate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static BondAndNominate parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (BondAndNominate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static BondAndNominate parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (BondAndNominate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static BondAndNominate parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (BondAndNominate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static BondAndNominate parseFrom(InputStream inputStream) throws IOException {
                return (BondAndNominate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static BondAndNominate parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (BondAndNominate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static BondAndNominate parseFrom(C4969g gVar) throws IOException {
                return (BondAndNominate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static BondAndNominate parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (BondAndNominate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public interface BondAndNominateOrBuilder extends qu3 {
            String getController();

            ByteString getControllerBytes();

            /* synthetic */ C4956c0 getDefaultInstanceForType();

            String getNominators(int i);

            ByteString getNominatorsBytes(int i);

            int getNominatorsCount();

            List<String> getNominatorsList();

            RewardDestination getRewardDestination();

            int getRewardDestinationValue();

            ByteString getValue();

            /* synthetic */ boolean isInitialized();
        }

        public static final class BondExtra extends GeneratedMessageLite<BondExtra, Builder> implements BondExtraOrBuilder {
            /* access modifiers changed from: private */
            public static final BondExtra DEFAULT_INSTANCE;
            private static volatile im4<BondExtra> PARSER = null;
            public static final int VALUE_FIELD_NUMBER = 1;
            private ByteString value_ = ByteString.EMPTY;

            public static final class Builder extends GeneratedMessageLite.C4930a<BondExtra, Builder> implements BondExtraOrBuilder {
                public /* synthetic */ Builder(C97601 r1) {
                    this();
                }

                public Builder clearValue() {
                    copyOnWrite();
                    ((BondExtra) this.instance).clearValue();
                    return this;
                }

                public ByteString getValue() {
                    return ((BondExtra) this.instance).getValue();
                }

                public Builder setValue(ByteString byteString) {
                    copyOnWrite();
                    ((BondExtra) this.instance).setValue(byteString);
                    return this;
                }

                private Builder() {
                    super(BondExtra.DEFAULT_INSTANCE);
                }
            }

            static {
                BondExtra bondExtra = new BondExtra();
                DEFAULT_INSTANCE = bondExtra;
                GeneratedMessageLite.registerDefaultInstance(BondExtra.class, bondExtra);
            }

            private BondExtra() {
            }

            /* access modifiers changed from: private */
            public void clearValue() {
                this.value_ = getDefaultInstance().getValue();
            }

            public static BondExtra getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static BondExtra parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (BondExtra) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static BondExtra parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (BondExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<BondExtra> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setValue(ByteString byteString) {
                byteString.getClass();
                this.value_ = byteString;
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97601.f46576xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new BondExtra();
                    case 2:
                        return new Builder((C97601) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"value_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<BondExtra> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (BondExtra.class) {
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

            public ByteString getValue() {
                return this.value_;
            }

            public static Builder newBuilder(BondExtra bondExtra) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(bondExtra);
            }

            public static BondExtra parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (BondExtra) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static BondExtra parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (BondExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static BondExtra parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (BondExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static BondExtra parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (BondExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static BondExtra parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (BondExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static BondExtra parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (BondExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static BondExtra parseFrom(InputStream inputStream) throws IOException {
                return (BondExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static BondExtra parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (BondExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static BondExtra parseFrom(C4969g gVar) throws IOException {
                return (BondExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static BondExtra parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (BondExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public interface BondExtraOrBuilder extends qu3 {
            /* synthetic */ C4956c0 getDefaultInstanceForType();

            ByteString getValue();

            /* synthetic */ boolean isInitialized();
        }

        public interface BondOrBuilder extends qu3 {
            String getController();

            ByteString getControllerBytes();

            /* synthetic */ C4956c0 getDefaultInstanceForType();

            RewardDestination getRewardDestination();

            int getRewardDestinationValue();

            ByteString getValue();

            /* synthetic */ boolean isInitialized();
        }

        public static final class Builder extends GeneratedMessageLite.C4930a<Staking, Builder> implements StakingOrBuilder {
            public /* synthetic */ Builder(C97601 r1) {
                this();
            }

            public Builder clearBond() {
                copyOnWrite();
                ((Staking) this.instance).clearBond();
                return this;
            }

            public Builder clearBondAndNominate() {
                copyOnWrite();
                ((Staking) this.instance).clearBondAndNominate();
                return this;
            }

            public Builder clearBondExtra() {
                copyOnWrite();
                ((Staking) this.instance).clearBondExtra();
                return this;
            }

            public Builder clearChill() {
                copyOnWrite();
                ((Staking) this.instance).clearChill();
                return this;
            }

            public Builder clearChillAndUnbond() {
                copyOnWrite();
                ((Staking) this.instance).clearChillAndUnbond();
                return this;
            }

            public Builder clearMessageOneof() {
                copyOnWrite();
                ((Staking) this.instance).clearMessageOneof();
                return this;
            }

            public Builder clearNominate() {
                copyOnWrite();
                ((Staking) this.instance).clearNominate();
                return this;
            }

            public Builder clearUnbond() {
                copyOnWrite();
                ((Staking) this.instance).clearUnbond();
                return this;
            }

            public Builder clearWithdrawUnbonded() {
                copyOnWrite();
                ((Staking) this.instance).clearWithdrawUnbonded();
                return this;
            }

            public Bond getBond() {
                return ((Staking) this.instance).getBond();
            }

            public BondAndNominate getBondAndNominate() {
                return ((Staking) this.instance).getBondAndNominate();
            }

            public BondExtra getBondExtra() {
                return ((Staking) this.instance).getBondExtra();
            }

            public Chill getChill() {
                return ((Staking) this.instance).getChill();
            }

            public ChillAndUnbond getChillAndUnbond() {
                return ((Staking) this.instance).getChillAndUnbond();
            }

            public MessageOneofCase getMessageOneofCase() {
                return ((Staking) this.instance).getMessageOneofCase();
            }

            public Nominate getNominate() {
                return ((Staking) this.instance).getNominate();
            }

            public Unbond getUnbond() {
                return ((Staking) this.instance).getUnbond();
            }

            public WithdrawUnbonded getWithdrawUnbonded() {
                return ((Staking) this.instance).getWithdrawUnbonded();
            }

            public boolean hasBond() {
                return ((Staking) this.instance).hasBond();
            }

            public boolean hasBondAndNominate() {
                return ((Staking) this.instance).hasBondAndNominate();
            }

            public boolean hasBondExtra() {
                return ((Staking) this.instance).hasBondExtra();
            }

            public boolean hasChill() {
                return ((Staking) this.instance).hasChill();
            }

            public boolean hasChillAndUnbond() {
                return ((Staking) this.instance).hasChillAndUnbond();
            }

            public boolean hasNominate() {
                return ((Staking) this.instance).hasNominate();
            }

            public boolean hasUnbond() {
                return ((Staking) this.instance).hasUnbond();
            }

            public boolean hasWithdrawUnbonded() {
                return ((Staking) this.instance).hasWithdrawUnbonded();
            }

            public Builder mergeBond(Bond bond) {
                copyOnWrite();
                ((Staking) this.instance).mergeBond(bond);
                return this;
            }

            public Builder mergeBondAndNominate(BondAndNominate bondAndNominate) {
                copyOnWrite();
                ((Staking) this.instance).mergeBondAndNominate(bondAndNominate);
                return this;
            }

            public Builder mergeBondExtra(BondExtra bondExtra) {
                copyOnWrite();
                ((Staking) this.instance).mergeBondExtra(bondExtra);
                return this;
            }

            public Builder mergeChill(Chill chill) {
                copyOnWrite();
                ((Staking) this.instance).mergeChill(chill);
                return this;
            }

            public Builder mergeChillAndUnbond(ChillAndUnbond chillAndUnbond) {
                copyOnWrite();
                ((Staking) this.instance).mergeChillAndUnbond(chillAndUnbond);
                return this;
            }

            public Builder mergeNominate(Nominate nominate) {
                copyOnWrite();
                ((Staking) this.instance).mergeNominate(nominate);
                return this;
            }

            public Builder mergeUnbond(Unbond unbond) {
                copyOnWrite();
                ((Staking) this.instance).mergeUnbond(unbond);
                return this;
            }

            public Builder mergeWithdrawUnbonded(WithdrawUnbonded withdrawUnbonded) {
                copyOnWrite();
                ((Staking) this.instance).mergeWithdrawUnbonded(withdrawUnbonded);
                return this;
            }

            public Builder setBond(Bond bond) {
                copyOnWrite();
                ((Staking) this.instance).setBond(bond);
                return this;
            }

            public Builder setBondAndNominate(BondAndNominate bondAndNominate) {
                copyOnWrite();
                ((Staking) this.instance).setBondAndNominate(bondAndNominate);
                return this;
            }

            public Builder setBondExtra(BondExtra bondExtra) {
                copyOnWrite();
                ((Staking) this.instance).setBondExtra(bondExtra);
                return this;
            }

            public Builder setChill(Chill chill) {
                copyOnWrite();
                ((Staking) this.instance).setChill(chill);
                return this;
            }

            public Builder setChillAndUnbond(ChillAndUnbond chillAndUnbond) {
                copyOnWrite();
                ((Staking) this.instance).setChillAndUnbond(chillAndUnbond);
                return this;
            }

            public Builder setNominate(Nominate nominate) {
                copyOnWrite();
                ((Staking) this.instance).setNominate(nominate);
                return this;
            }

            public Builder setUnbond(Unbond unbond) {
                copyOnWrite();
                ((Staking) this.instance).setUnbond(unbond);
                return this;
            }

            public Builder setWithdrawUnbonded(WithdrawUnbonded withdrawUnbonded) {
                copyOnWrite();
                ((Staking) this.instance).setWithdrawUnbonded(withdrawUnbonded);
                return this;
            }

            private Builder() {
                super(Staking.DEFAULT_INSTANCE);
            }

            public Builder setBond(Bond.Builder builder) {
                copyOnWrite();
                ((Staking) this.instance).setBond((Bond) builder.build());
                return this;
            }

            public Builder setBondAndNominate(BondAndNominate.Builder builder) {
                copyOnWrite();
                ((Staking) this.instance).setBondAndNominate((BondAndNominate) builder.build());
                return this;
            }

            public Builder setBondExtra(BondExtra.Builder builder) {
                copyOnWrite();
                ((Staking) this.instance).setBondExtra((BondExtra) builder.build());
                return this;
            }

            public Builder setChill(Chill.Builder builder) {
                copyOnWrite();
                ((Staking) this.instance).setChill((Chill) builder.build());
                return this;
            }

            public Builder setChillAndUnbond(ChillAndUnbond.Builder builder) {
                copyOnWrite();
                ((Staking) this.instance).setChillAndUnbond((ChillAndUnbond) builder.build());
                return this;
            }

            public Builder setNominate(Nominate.Builder builder) {
                copyOnWrite();
                ((Staking) this.instance).setNominate((Nominate) builder.build());
                return this;
            }

            public Builder setUnbond(Unbond.Builder builder) {
                copyOnWrite();
                ((Staking) this.instance).setUnbond((Unbond) builder.build());
                return this;
            }

            public Builder setWithdrawUnbonded(WithdrawUnbonded.Builder builder) {
                copyOnWrite();
                ((Staking) this.instance).setWithdrawUnbonded((WithdrawUnbonded) builder.build());
                return this;
            }
        }

        public static final class Chill extends GeneratedMessageLite<Chill, Builder> implements ChillOrBuilder {
            /* access modifiers changed from: private */
            public static final Chill DEFAULT_INSTANCE;
            private static volatile im4<Chill> PARSER;

            public static final class Builder extends GeneratedMessageLite.C4930a<Chill, Builder> implements ChillOrBuilder {
                public /* synthetic */ Builder(C97601 r1) {
                    this();
                }

                private Builder() {
                    super(Chill.DEFAULT_INSTANCE);
                }
            }

            static {
                Chill chill = new Chill();
                DEFAULT_INSTANCE = chill;
                GeneratedMessageLite.registerDefaultInstance(Chill.class, chill);
            }

            private Chill() {
            }

            public static Chill getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static Chill parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Chill) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Chill parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Chill) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<Chill> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97601.f46576xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Chill();
                    case 2:
                        return new Builder((C97601) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<Chill> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (Chill.class) {
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

            public static Builder newBuilder(Chill chill) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(chill);
            }

            public static Chill parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (Chill) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static Chill parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (Chill) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static Chill parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Chill) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Chill parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (Chill) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static Chill parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Chill) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Chill parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (Chill) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static Chill parseFrom(InputStream inputStream) throws IOException {
                return (Chill) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Chill parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (Chill) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static Chill parseFrom(C4969g gVar) throws IOException {
                return (Chill) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static Chill parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (Chill) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public static final class ChillAndUnbond extends GeneratedMessageLite<ChillAndUnbond, Builder> implements ChillAndUnbondOrBuilder {
            /* access modifiers changed from: private */
            public static final ChillAndUnbond DEFAULT_INSTANCE;
            private static volatile im4<ChillAndUnbond> PARSER = null;
            public static final int VALUE_FIELD_NUMBER = 1;
            private ByteString value_ = ByteString.EMPTY;

            public static final class Builder extends GeneratedMessageLite.C4930a<ChillAndUnbond, Builder> implements ChillAndUnbondOrBuilder {
                public /* synthetic */ Builder(C97601 r1) {
                    this();
                }

                public Builder clearValue() {
                    copyOnWrite();
                    ((ChillAndUnbond) this.instance).clearValue();
                    return this;
                }

                public ByteString getValue() {
                    return ((ChillAndUnbond) this.instance).getValue();
                }

                public Builder setValue(ByteString byteString) {
                    copyOnWrite();
                    ((ChillAndUnbond) this.instance).setValue(byteString);
                    return this;
                }

                private Builder() {
                    super(ChillAndUnbond.DEFAULT_INSTANCE);
                }
            }

            static {
                ChillAndUnbond chillAndUnbond = new ChillAndUnbond();
                DEFAULT_INSTANCE = chillAndUnbond;
                GeneratedMessageLite.registerDefaultInstance(ChillAndUnbond.class, chillAndUnbond);
            }

            private ChillAndUnbond() {
            }

            /* access modifiers changed from: private */
            public void clearValue() {
                this.value_ = getDefaultInstance().getValue();
            }

            public static ChillAndUnbond getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static ChillAndUnbond parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (ChillAndUnbond) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ChillAndUnbond parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (ChillAndUnbond) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<ChillAndUnbond> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setValue(ByteString byteString) {
                byteString.getClass();
                this.value_ = byteString;
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97601.f46576xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ChillAndUnbond();
                    case 2:
                        return new Builder((C97601) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"value_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<ChillAndUnbond> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (ChillAndUnbond.class) {
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

            public ByteString getValue() {
                return this.value_;
            }

            public static Builder newBuilder(ChillAndUnbond chillAndUnbond) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(chillAndUnbond);
            }

            public static ChillAndUnbond parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (ChillAndUnbond) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static ChillAndUnbond parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (ChillAndUnbond) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static ChillAndUnbond parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (ChillAndUnbond) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ChillAndUnbond parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (ChillAndUnbond) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static ChillAndUnbond parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (ChillAndUnbond) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ChillAndUnbond parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (ChillAndUnbond) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static ChillAndUnbond parseFrom(InputStream inputStream) throws IOException {
                return (ChillAndUnbond) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ChillAndUnbond parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (ChillAndUnbond) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static ChillAndUnbond parseFrom(C4969g gVar) throws IOException {
                return (ChillAndUnbond) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static ChillAndUnbond parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (ChillAndUnbond) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public interface ChillAndUnbondOrBuilder extends qu3 {
            /* synthetic */ C4956c0 getDefaultInstanceForType();

            ByteString getValue();

            /* synthetic */ boolean isInitialized();
        }

        public interface ChillOrBuilder extends qu3 {
            /* synthetic */ C4956c0 getDefaultInstanceForType();

            /* synthetic */ boolean isInitialized();
        }

        public enum MessageOneofCase {
            BOND(1),
            BOND_AND_NOMINATE(2),
            BOND_EXTRA(3),
            UNBOND(4),
            WITHDRAW_UNBONDED(5),
            NOMINATE(6),
            CHILL(7),
            CHILL_AND_UNBOND(8),
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
                        return BOND;
                    case 2:
                        return BOND_AND_NOMINATE;
                    case 3:
                        return BOND_EXTRA;
                    case 4:
                        return UNBOND;
                    case 5:
                        return WITHDRAW_UNBONDED;
                    case 6:
                        return NOMINATE;
                    case 7:
                        return CHILL;
                    case 8:
                        return CHILL_AND_UNBOND;
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

        public static final class Nominate extends GeneratedMessageLite<Nominate, Builder> implements NominateOrBuilder {
            /* access modifiers changed from: private */
            public static final Nominate DEFAULT_INSTANCE;
            public static final int NOMINATORS_FIELD_NUMBER = 1;
            private static volatile im4<Nominate> PARSER;
            private C5011t.C5020i<String> nominators_ = GeneratedMessageLite.emptyProtobufList();

            public static final class Builder extends GeneratedMessageLite.C4930a<Nominate, Builder> implements NominateOrBuilder {
                public /* synthetic */ Builder(C97601 r1) {
                    this();
                }

                public Builder addAllNominators(Iterable<String> iterable) {
                    copyOnWrite();
                    ((Nominate) this.instance).addAllNominators(iterable);
                    return this;
                }

                public Builder addNominators(String str) {
                    copyOnWrite();
                    ((Nominate) this.instance).addNominators(str);
                    return this;
                }

                public Builder addNominatorsBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Nominate) this.instance).addNominatorsBytes(byteString);
                    return this;
                }

                public Builder clearNominators() {
                    copyOnWrite();
                    ((Nominate) this.instance).clearNominators();
                    return this;
                }

                public String getNominators(int i) {
                    return ((Nominate) this.instance).getNominators(i);
                }

                public ByteString getNominatorsBytes(int i) {
                    return ((Nominate) this.instance).getNominatorsBytes(i);
                }

                public int getNominatorsCount() {
                    return ((Nominate) this.instance).getNominatorsCount();
                }

                public List<String> getNominatorsList() {
                    return Collections.unmodifiableList(((Nominate) this.instance).getNominatorsList());
                }

                public Builder setNominators(int i, String str) {
                    copyOnWrite();
                    ((Nominate) this.instance).setNominators(i, str);
                    return this;
                }

                private Builder() {
                    super(Nominate.DEFAULT_INSTANCE);
                }
            }

            static {
                Nominate nominate = new Nominate();
                DEFAULT_INSTANCE = nominate;
                GeneratedMessageLite.registerDefaultInstance(Nominate.class, nominate);
            }

            private Nominate() {
            }

            /* access modifiers changed from: private */
            public void addAllNominators(Iterable<String> iterable) {
                ensureNominatorsIsMutable();
                C4949a.addAll(iterable, this.nominators_);
            }

            /* access modifiers changed from: private */
            public void addNominators(String str) {
                str.getClass();
                ensureNominatorsIsMutable();
                this.nominators_.add(str);
            }

            /* access modifiers changed from: private */
            public void addNominatorsBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                ensureNominatorsIsMutable();
                this.nominators_.add(byteString.toStringUtf8());
            }

            /* access modifiers changed from: private */
            public void clearNominators() {
                this.nominators_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void ensureNominatorsIsMutable() {
                C5011t.C5020i<String> iVar = this.nominators_;
                if (!iVar.mo37090v()) {
                    this.nominators_ = GeneratedMessageLite.mutableCopy(iVar);
                }
            }

            public static Nominate getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static Nominate parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Nominate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Nominate parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Nominate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<Nominate> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setNominators(int i, String str) {
                str.getClass();
                ensureNominatorsIsMutable();
                this.nominators_.set(i, str);
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97601.f46576xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Nominate();
                    case 2:
                        return new Builder((C97601) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"nominators_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<Nominate> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (Nominate.class) {
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

            public String getNominators(int i) {
                return this.nominators_.get(i);
            }

            public ByteString getNominatorsBytes(int i) {
                return ByteString.copyFromUtf8(this.nominators_.get(i));
            }

            public int getNominatorsCount() {
                return this.nominators_.size();
            }

            public List<String> getNominatorsList() {
                return this.nominators_;
            }

            public static Builder newBuilder(Nominate nominate) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(nominate);
            }

            public static Nominate parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (Nominate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static Nominate parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (Nominate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static Nominate parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Nominate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Nominate parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (Nominate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static Nominate parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Nominate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Nominate parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (Nominate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static Nominate parseFrom(InputStream inputStream) throws IOException {
                return (Nominate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Nominate parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (Nominate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static Nominate parseFrom(C4969g gVar) throws IOException {
                return (Nominate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static Nominate parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (Nominate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public interface NominateOrBuilder extends qu3 {
            /* synthetic */ C4956c0 getDefaultInstanceForType();

            String getNominators(int i);

            ByteString getNominatorsBytes(int i);

            int getNominatorsCount();

            List<String> getNominatorsList();

            /* synthetic */ boolean isInitialized();
        }

        public static final class Unbond extends GeneratedMessageLite<Unbond, Builder> implements UnbondOrBuilder {
            /* access modifiers changed from: private */
            public static final Unbond DEFAULT_INSTANCE;
            private static volatile im4<Unbond> PARSER = null;
            public static final int VALUE_FIELD_NUMBER = 1;
            private ByteString value_ = ByteString.EMPTY;

            public static final class Builder extends GeneratedMessageLite.C4930a<Unbond, Builder> implements UnbondOrBuilder {
                public /* synthetic */ Builder(C97601 r1) {
                    this();
                }

                public Builder clearValue() {
                    copyOnWrite();
                    ((Unbond) this.instance).clearValue();
                    return this;
                }

                public ByteString getValue() {
                    return ((Unbond) this.instance).getValue();
                }

                public Builder setValue(ByteString byteString) {
                    copyOnWrite();
                    ((Unbond) this.instance).setValue(byteString);
                    return this;
                }

                private Builder() {
                    super(Unbond.DEFAULT_INSTANCE);
                }
            }

            static {
                Unbond unbond = new Unbond();
                DEFAULT_INSTANCE = unbond;
                GeneratedMessageLite.registerDefaultInstance(Unbond.class, unbond);
            }

            private Unbond() {
            }

            /* access modifiers changed from: private */
            public void clearValue() {
                this.value_ = getDefaultInstance().getValue();
            }

            public static Unbond getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static Unbond parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Unbond) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Unbond parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Unbond) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<Unbond> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setValue(ByteString byteString) {
                byteString.getClass();
                this.value_ = byteString;
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97601.f46576xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Unbond();
                    case 2:
                        return new Builder((C97601) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"value_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<Unbond> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (Unbond.class) {
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

            public ByteString getValue() {
                return this.value_;
            }

            public static Builder newBuilder(Unbond unbond) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(unbond);
            }

            public static Unbond parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (Unbond) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static Unbond parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (Unbond) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static Unbond parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Unbond) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Unbond parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (Unbond) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static Unbond parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Unbond) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Unbond parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (Unbond) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static Unbond parseFrom(InputStream inputStream) throws IOException {
                return (Unbond) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Unbond parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (Unbond) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static Unbond parseFrom(C4969g gVar) throws IOException {
                return (Unbond) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static Unbond parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (Unbond) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public interface UnbondOrBuilder extends qu3 {
            /* synthetic */ C4956c0 getDefaultInstanceForType();

            ByteString getValue();

            /* synthetic */ boolean isInitialized();
        }

        public static final class WithdrawUnbonded extends GeneratedMessageLite<WithdrawUnbonded, Builder> implements WithdrawUnbondedOrBuilder {
            /* access modifiers changed from: private */
            public static final WithdrawUnbonded DEFAULT_INSTANCE;
            private static volatile im4<WithdrawUnbonded> PARSER = null;
            public static final int SLASHING_SPANS_FIELD_NUMBER = 1;
            private int slashingSpans_;

            public static final class Builder extends GeneratedMessageLite.C4930a<WithdrawUnbonded, Builder> implements WithdrawUnbondedOrBuilder {
                public /* synthetic */ Builder(C97601 r1) {
                    this();
                }

                public Builder clearSlashingSpans() {
                    copyOnWrite();
                    ((WithdrawUnbonded) this.instance).clearSlashingSpans();
                    return this;
                }

                public int getSlashingSpans() {
                    return ((WithdrawUnbonded) this.instance).getSlashingSpans();
                }

                public Builder setSlashingSpans(int i) {
                    copyOnWrite();
                    ((WithdrawUnbonded) this.instance).setSlashingSpans(i);
                    return this;
                }

                private Builder() {
                    super(WithdrawUnbonded.DEFAULT_INSTANCE);
                }
            }

            static {
                WithdrawUnbonded withdrawUnbonded = new WithdrawUnbonded();
                DEFAULT_INSTANCE = withdrawUnbonded;
                GeneratedMessageLite.registerDefaultInstance(WithdrawUnbonded.class, withdrawUnbonded);
            }

            private WithdrawUnbonded() {
            }

            /* access modifiers changed from: private */
            public void clearSlashingSpans() {
                this.slashingSpans_ = 0;
            }

            public static WithdrawUnbonded getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static WithdrawUnbonded parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (WithdrawUnbonded) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static WithdrawUnbonded parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (WithdrawUnbonded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<WithdrawUnbonded> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setSlashingSpans(int i) {
                this.slashingSpans_ = i;
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97601.f46576xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new WithdrawUnbonded();
                    case 2:
                        return new Builder((C97601) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"slashingSpans_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<WithdrawUnbonded> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (WithdrawUnbonded.class) {
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

            public int getSlashingSpans() {
                return this.slashingSpans_;
            }

            public static Builder newBuilder(WithdrawUnbonded withdrawUnbonded) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(withdrawUnbonded);
            }

            public static WithdrawUnbonded parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (WithdrawUnbonded) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static WithdrawUnbonded parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (WithdrawUnbonded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static WithdrawUnbonded parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (WithdrawUnbonded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static WithdrawUnbonded parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (WithdrawUnbonded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static WithdrawUnbonded parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (WithdrawUnbonded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static WithdrawUnbonded parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (WithdrawUnbonded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static WithdrawUnbonded parseFrom(InputStream inputStream) throws IOException {
                return (WithdrawUnbonded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static WithdrawUnbonded parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (WithdrawUnbonded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static WithdrawUnbonded parseFrom(C4969g gVar) throws IOException {
                return (WithdrawUnbonded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static WithdrawUnbonded parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (WithdrawUnbonded) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public interface WithdrawUnbondedOrBuilder extends qu3 {
            /* synthetic */ C4956c0 getDefaultInstanceForType();

            int getSlashingSpans();

            /* synthetic */ boolean isInitialized();
        }

        static {
            Staking staking = new Staking();
            DEFAULT_INSTANCE = staking;
            GeneratedMessageLite.registerDefaultInstance(Staking.class, staking);
        }

        private Staking() {
        }

        /* access modifiers changed from: private */
        public void clearBond() {
            if (this.messageOneofCase_ == 1) {
                this.messageOneofCase_ = 0;
                this.messageOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearBondAndNominate() {
            if (this.messageOneofCase_ == 2) {
                this.messageOneofCase_ = 0;
                this.messageOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearBondExtra() {
            if (this.messageOneofCase_ == 3) {
                this.messageOneofCase_ = 0;
                this.messageOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearChill() {
            if (this.messageOneofCase_ == 7) {
                this.messageOneofCase_ = 0;
                this.messageOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearChillAndUnbond() {
            if (this.messageOneofCase_ == 8) {
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
        public void clearNominate() {
            if (this.messageOneofCase_ == 6) {
                this.messageOneofCase_ = 0;
                this.messageOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearUnbond() {
            if (this.messageOneofCase_ == 4) {
                this.messageOneofCase_ = 0;
                this.messageOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearWithdrawUnbonded() {
            if (this.messageOneofCase_ == 5) {
                this.messageOneofCase_ = 0;
                this.messageOneof_ = null;
            }
        }

        public static Staking getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeBond(Bond bond) {
            bond.getClass();
            if (this.messageOneofCase_ != 1 || this.messageOneof_ == Bond.getDefaultInstance()) {
                this.messageOneof_ = bond;
            } else {
                this.messageOneof_ = ((Bond.Builder) Bond.newBuilder((Bond) this.messageOneof_).mergeFrom(bond)).buildPartial();
            }
            this.messageOneofCase_ = 1;
        }

        /* access modifiers changed from: private */
        public void mergeBondAndNominate(BondAndNominate bondAndNominate) {
            bondAndNominate.getClass();
            if (this.messageOneofCase_ != 2 || this.messageOneof_ == BondAndNominate.getDefaultInstance()) {
                this.messageOneof_ = bondAndNominate;
            } else {
                this.messageOneof_ = ((BondAndNominate.Builder) BondAndNominate.newBuilder((BondAndNominate) this.messageOneof_).mergeFrom(bondAndNominate)).buildPartial();
            }
            this.messageOneofCase_ = 2;
        }

        /* access modifiers changed from: private */
        public void mergeBondExtra(BondExtra bondExtra) {
            bondExtra.getClass();
            if (this.messageOneofCase_ != 3 || this.messageOneof_ == BondExtra.getDefaultInstance()) {
                this.messageOneof_ = bondExtra;
            } else {
                this.messageOneof_ = ((BondExtra.Builder) BondExtra.newBuilder((BondExtra) this.messageOneof_).mergeFrom(bondExtra)).buildPartial();
            }
            this.messageOneofCase_ = 3;
        }

        /* access modifiers changed from: private */
        public void mergeChill(Chill chill) {
            chill.getClass();
            if (this.messageOneofCase_ != 7 || this.messageOneof_ == Chill.getDefaultInstance()) {
                this.messageOneof_ = chill;
            } else {
                this.messageOneof_ = ((Chill.Builder) Chill.newBuilder((Chill) this.messageOneof_).mergeFrom(chill)).buildPartial();
            }
            this.messageOneofCase_ = 7;
        }

        /* access modifiers changed from: private */
        public void mergeChillAndUnbond(ChillAndUnbond chillAndUnbond) {
            chillAndUnbond.getClass();
            if (this.messageOneofCase_ != 8 || this.messageOneof_ == ChillAndUnbond.getDefaultInstance()) {
                this.messageOneof_ = chillAndUnbond;
            } else {
                this.messageOneof_ = ((ChillAndUnbond.Builder) ChillAndUnbond.newBuilder((ChillAndUnbond) this.messageOneof_).mergeFrom(chillAndUnbond)).buildPartial();
            }
            this.messageOneofCase_ = 8;
        }

        /* access modifiers changed from: private */
        public void mergeNominate(Nominate nominate) {
            nominate.getClass();
            if (this.messageOneofCase_ != 6 || this.messageOneof_ == Nominate.getDefaultInstance()) {
                this.messageOneof_ = nominate;
            } else {
                this.messageOneof_ = ((Nominate.Builder) Nominate.newBuilder((Nominate) this.messageOneof_).mergeFrom(nominate)).buildPartial();
            }
            this.messageOneofCase_ = 6;
        }

        /* access modifiers changed from: private */
        public void mergeUnbond(Unbond unbond) {
            unbond.getClass();
            if (this.messageOneofCase_ != 4 || this.messageOneof_ == Unbond.getDefaultInstance()) {
                this.messageOneof_ = unbond;
            } else {
                this.messageOneof_ = ((Unbond.Builder) Unbond.newBuilder((Unbond) this.messageOneof_).mergeFrom(unbond)).buildPartial();
            }
            this.messageOneofCase_ = 4;
        }

        /* access modifiers changed from: private */
        public void mergeWithdrawUnbonded(WithdrawUnbonded withdrawUnbonded) {
            withdrawUnbonded.getClass();
            if (this.messageOneofCase_ != 5 || this.messageOneof_ == WithdrawUnbonded.getDefaultInstance()) {
                this.messageOneof_ = withdrawUnbonded;
            } else {
                this.messageOneof_ = ((WithdrawUnbonded.Builder) WithdrawUnbonded.newBuilder((WithdrawUnbonded) this.messageOneof_).mergeFrom(withdrawUnbonded)).buildPartial();
            }
            this.messageOneofCase_ = 5;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Staking parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Staking) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Staking parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Staking) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<Staking> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setBond(Bond bond) {
            bond.getClass();
            this.messageOneof_ = bond;
            this.messageOneofCase_ = 1;
        }

        /* access modifiers changed from: private */
        public void setBondAndNominate(BondAndNominate bondAndNominate) {
            bondAndNominate.getClass();
            this.messageOneof_ = bondAndNominate;
            this.messageOneofCase_ = 2;
        }

        /* access modifiers changed from: private */
        public void setBondExtra(BondExtra bondExtra) {
            bondExtra.getClass();
            this.messageOneof_ = bondExtra;
            this.messageOneofCase_ = 3;
        }

        /* access modifiers changed from: private */
        public void setChill(Chill chill) {
            chill.getClass();
            this.messageOneof_ = chill;
            this.messageOneofCase_ = 7;
        }

        /* access modifiers changed from: private */
        public void setChillAndUnbond(ChillAndUnbond chillAndUnbond) {
            chillAndUnbond.getClass();
            this.messageOneof_ = chillAndUnbond;
            this.messageOneofCase_ = 8;
        }

        /* access modifiers changed from: private */
        public void setNominate(Nominate nominate) {
            nominate.getClass();
            this.messageOneof_ = nominate;
            this.messageOneofCase_ = 6;
        }

        /* access modifiers changed from: private */
        public void setUnbond(Unbond unbond) {
            unbond.getClass();
            this.messageOneof_ = unbond;
            this.messageOneofCase_ = 4;
        }

        /* access modifiers changed from: private */
        public void setWithdrawUnbonded(WithdrawUnbonded withdrawUnbonded) {
            withdrawUnbonded.getClass();
            this.messageOneof_ = withdrawUnbonded;
            this.messageOneofCase_ = 5;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97601.f46576xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Staking();
                case 2:
                    return new Builder((C97601) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000", new Object[]{"messageOneof_", "messageOneofCase_", Bond.class, BondAndNominate.class, BondExtra.class, Unbond.class, WithdrawUnbonded.class, Nominate.class, Chill.class, ChillAndUnbond.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<Staking> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (Staking.class) {
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

        public Bond getBond() {
            if (this.messageOneofCase_ == 1) {
                return (Bond) this.messageOneof_;
            }
            return Bond.getDefaultInstance();
        }

        public BondAndNominate getBondAndNominate() {
            if (this.messageOneofCase_ == 2) {
                return (BondAndNominate) this.messageOneof_;
            }
            return BondAndNominate.getDefaultInstance();
        }

        public BondExtra getBondExtra() {
            if (this.messageOneofCase_ == 3) {
                return (BondExtra) this.messageOneof_;
            }
            return BondExtra.getDefaultInstance();
        }

        public Chill getChill() {
            if (this.messageOneofCase_ == 7) {
                return (Chill) this.messageOneof_;
            }
            return Chill.getDefaultInstance();
        }

        public ChillAndUnbond getChillAndUnbond() {
            if (this.messageOneofCase_ == 8) {
                return (ChillAndUnbond) this.messageOneof_;
            }
            return ChillAndUnbond.getDefaultInstance();
        }

        public MessageOneofCase getMessageOneofCase() {
            return MessageOneofCase.forNumber(this.messageOneofCase_);
        }

        public Nominate getNominate() {
            if (this.messageOneofCase_ == 6) {
                return (Nominate) this.messageOneof_;
            }
            return Nominate.getDefaultInstance();
        }

        public Unbond getUnbond() {
            if (this.messageOneofCase_ == 4) {
                return (Unbond) this.messageOneof_;
            }
            return Unbond.getDefaultInstance();
        }

        public WithdrawUnbonded getWithdrawUnbonded() {
            if (this.messageOneofCase_ == 5) {
                return (WithdrawUnbonded) this.messageOneof_;
            }
            return WithdrawUnbonded.getDefaultInstance();
        }

        public boolean hasBond() {
            if (this.messageOneofCase_ == 1) {
                return true;
            }
            return false;
        }

        public boolean hasBondAndNominate() {
            if (this.messageOneofCase_ == 2) {
                return true;
            }
            return false;
        }

        public boolean hasBondExtra() {
            if (this.messageOneofCase_ == 3) {
                return true;
            }
            return false;
        }

        public boolean hasChill() {
            if (this.messageOneofCase_ == 7) {
                return true;
            }
            return false;
        }

        public boolean hasChillAndUnbond() {
            if (this.messageOneofCase_ == 8) {
                return true;
            }
            return false;
        }

        public boolean hasNominate() {
            if (this.messageOneofCase_ == 6) {
                return true;
            }
            return false;
        }

        public boolean hasUnbond() {
            if (this.messageOneofCase_ == 4) {
                return true;
            }
            return false;
        }

        public boolean hasWithdrawUnbonded() {
            if (this.messageOneofCase_ == 5) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(Staking staking) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(staking);
        }

        public static Staking parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Staking) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Staking parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (Staking) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static Staking parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Staking) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Staking parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (Staking) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static Staking parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Staking) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Staking parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (Staking) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static Staking parseFrom(InputStream inputStream) throws IOException {
            return (Staking) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Staking parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Staking) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Staking parseFrom(C4969g gVar) throws IOException {
            return (Staking) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static Staking parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (Staking) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface StakingOrBuilder extends qu3 {
        Staking.Bond getBond();

        Staking.BondAndNominate getBondAndNominate();

        Staking.BondExtra getBondExtra();

        Staking.Chill getChill();

        Staking.ChillAndUnbond getChillAndUnbond();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        Staking.MessageOneofCase getMessageOneofCase();

        Staking.Nominate getNominate();

        Staking.Unbond getUnbond();

        Staking.WithdrawUnbonded getWithdrawUnbonded();

        boolean hasBond();

        boolean hasBondAndNominate();

        boolean hasBondExtra();

        boolean hasChill();

        boolean hasChillAndUnbond();

        boolean hasNominate();

        boolean hasUnbond();

        boolean hasWithdrawUnbonded();

        /* synthetic */ boolean isInitialized();
    }

    private Polkadot() {
    }

    public static void registerAllExtensions(C4987l lVar) {
    }
}
