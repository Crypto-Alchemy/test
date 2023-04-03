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

public final class Cardano {

    /* renamed from: wallet.core.jni.proto.Cardano$1 */
    public static /* synthetic */ class C97301 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f46546xa1df5c61;

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
                f46546xa1df5c61 = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f46546xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f46546xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f46546xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f46546xa1df5c61     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f46546xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f46546xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wallet.core.jni.proto.Cardano.C97301.<clinit>():void");
        }
    }

    public static final class Delegate extends GeneratedMessageLite<Delegate, Builder> implements DelegateOrBuilder {
        /* access modifiers changed from: private */
        public static final Delegate DEFAULT_INSTANCE;
        public static final int DEPOSIT_AMOUNT_FIELD_NUMBER = 3;
        private static volatile im4<Delegate> PARSER = null;
        public static final int POOL_ID_FIELD_NUMBER = 2;
        public static final int STAKING_ADDRESS_FIELD_NUMBER = 1;
        private long depositAmount_;
        private ByteString poolId_ = ByteString.EMPTY;
        private String stakingAddress_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<Delegate, Builder> implements DelegateOrBuilder {
            public /* synthetic */ Builder(C97301 r1) {
                this();
            }

            public Builder clearDepositAmount() {
                copyOnWrite();
                ((Delegate) this.instance).clearDepositAmount();
                return this;
            }

            public Builder clearPoolId() {
                copyOnWrite();
                ((Delegate) this.instance).clearPoolId();
                return this;
            }

            public Builder clearStakingAddress() {
                copyOnWrite();
                ((Delegate) this.instance).clearStakingAddress();
                return this;
            }

            public long getDepositAmount() {
                return ((Delegate) this.instance).getDepositAmount();
            }

            public ByteString getPoolId() {
                return ((Delegate) this.instance).getPoolId();
            }

            public String getStakingAddress() {
                return ((Delegate) this.instance).getStakingAddress();
            }

            public ByteString getStakingAddressBytes() {
                return ((Delegate) this.instance).getStakingAddressBytes();
            }

            public Builder setDepositAmount(long j) {
                copyOnWrite();
                ((Delegate) this.instance).setDepositAmount(j);
                return this;
            }

            public Builder setPoolId(ByteString byteString) {
                copyOnWrite();
                ((Delegate) this.instance).setPoolId(byteString);
                return this;
            }

            public Builder setStakingAddress(String str) {
                copyOnWrite();
                ((Delegate) this.instance).setStakingAddress(str);
                return this;
            }

            public Builder setStakingAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((Delegate) this.instance).setStakingAddressBytes(byteString);
                return this;
            }

            private Builder() {
                super(Delegate.DEFAULT_INSTANCE);
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
        public void clearDepositAmount() {
            this.depositAmount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearPoolId() {
            this.poolId_ = getDefaultInstance().getPoolId();
        }

        /* access modifiers changed from: private */
        public void clearStakingAddress() {
            this.stakingAddress_ = getDefaultInstance().getStakingAddress();
        }

        public static Delegate getDefaultInstance() {
            return DEFAULT_INSTANCE;
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
        public void setDepositAmount(long j) {
            this.depositAmount_ = j;
        }

        /* access modifiers changed from: private */
        public void setPoolId(ByteString byteString) {
            byteString.getClass();
            this.poolId_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setStakingAddress(String str) {
            str.getClass();
            this.stakingAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setStakingAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.stakingAddress_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97301.f46546xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Delegate();
                case 2:
                    return new Builder((C97301) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\u0003", new Object[]{"stakingAddress_", "poolId_", "depositAmount_"});
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

        public long getDepositAmount() {
            return this.depositAmount_;
        }

        public ByteString getPoolId() {
            return this.poolId_;
        }

        public String getStakingAddress() {
            return this.stakingAddress_;
        }

        public ByteString getStakingAddressBytes() {
            return ByteString.copyFromUtf8(this.stakingAddress_);
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
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        long getDepositAmount();

        ByteString getPoolId();

        String getStakingAddress();

        ByteString getStakingAddressBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class DeregisterStakingKey extends GeneratedMessageLite<DeregisterStakingKey, Builder> implements DeregisterStakingKeyOrBuilder {
        /* access modifiers changed from: private */
        public static final DeregisterStakingKey DEFAULT_INSTANCE;
        private static volatile im4<DeregisterStakingKey> PARSER = null;
        public static final int STAKING_ADDRESS_FIELD_NUMBER = 1;
        public static final int UNDEPOSIT_AMOUNT_FIELD_NUMBER = 2;
        private String stakingAddress_ = "";
        private long undepositAmount_;

        public static final class Builder extends GeneratedMessageLite.C4930a<DeregisterStakingKey, Builder> implements DeregisterStakingKeyOrBuilder {
            public /* synthetic */ Builder(C97301 r1) {
                this();
            }

            public Builder clearStakingAddress() {
                copyOnWrite();
                ((DeregisterStakingKey) this.instance).clearStakingAddress();
                return this;
            }

            public Builder clearUndepositAmount() {
                copyOnWrite();
                ((DeregisterStakingKey) this.instance).clearUndepositAmount();
                return this;
            }

            public String getStakingAddress() {
                return ((DeregisterStakingKey) this.instance).getStakingAddress();
            }

            public ByteString getStakingAddressBytes() {
                return ((DeregisterStakingKey) this.instance).getStakingAddressBytes();
            }

            public long getUndepositAmount() {
                return ((DeregisterStakingKey) this.instance).getUndepositAmount();
            }

            public Builder setStakingAddress(String str) {
                copyOnWrite();
                ((DeregisterStakingKey) this.instance).setStakingAddress(str);
                return this;
            }

            public Builder setStakingAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((DeregisterStakingKey) this.instance).setStakingAddressBytes(byteString);
                return this;
            }

            public Builder setUndepositAmount(long j) {
                copyOnWrite();
                ((DeregisterStakingKey) this.instance).setUndepositAmount(j);
                return this;
            }

            private Builder() {
                super(DeregisterStakingKey.DEFAULT_INSTANCE);
            }
        }

        static {
            DeregisterStakingKey deregisterStakingKey = new DeregisterStakingKey();
            DEFAULT_INSTANCE = deregisterStakingKey;
            GeneratedMessageLite.registerDefaultInstance(DeregisterStakingKey.class, deregisterStakingKey);
        }

        private DeregisterStakingKey() {
        }

        /* access modifiers changed from: private */
        public void clearStakingAddress() {
            this.stakingAddress_ = getDefaultInstance().getStakingAddress();
        }

        /* access modifiers changed from: private */
        public void clearUndepositAmount() {
            this.undepositAmount_ = 0;
        }

        public static DeregisterStakingKey getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static DeregisterStakingKey parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DeregisterStakingKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeregisterStakingKey parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DeregisterStakingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<DeregisterStakingKey> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setStakingAddress(String str) {
            str.getClass();
            this.stakingAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setStakingAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.stakingAddress_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setUndepositAmount(long j) {
            this.undepositAmount_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97301.f46546xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new DeregisterStakingKey();
                case 2:
                    return new Builder((C97301) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0003", new Object[]{"stakingAddress_", "undepositAmount_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<DeregisterStakingKey> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (DeregisterStakingKey.class) {
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

        public String getStakingAddress() {
            return this.stakingAddress_;
        }

        public ByteString getStakingAddressBytes() {
            return ByteString.copyFromUtf8(this.stakingAddress_);
        }

        public long getUndepositAmount() {
            return this.undepositAmount_;
        }

        public static Builder newBuilder(DeregisterStakingKey deregisterStakingKey) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(deregisterStakingKey);
        }

        public static DeregisterStakingKey parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (DeregisterStakingKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static DeregisterStakingKey parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (DeregisterStakingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static DeregisterStakingKey parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DeregisterStakingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DeregisterStakingKey parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (DeregisterStakingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static DeregisterStakingKey parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DeregisterStakingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DeregisterStakingKey parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (DeregisterStakingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static DeregisterStakingKey parseFrom(InputStream inputStream) throws IOException {
            return (DeregisterStakingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeregisterStakingKey parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (DeregisterStakingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static DeregisterStakingKey parseFrom(C4969g gVar) throws IOException {
            return (DeregisterStakingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static DeregisterStakingKey parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (DeregisterStakingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface DeregisterStakingKeyOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getStakingAddress();

        ByteString getStakingAddressBytes();

        long getUndepositAmount();

        /* synthetic */ boolean isInitialized();
    }

    public static final class OutPoint extends GeneratedMessageLite<OutPoint, Builder> implements OutPointOrBuilder {
        /* access modifiers changed from: private */
        public static final OutPoint DEFAULT_INSTANCE;
        public static final int OUTPUT_INDEX_FIELD_NUMBER = 2;
        private static volatile im4<OutPoint> PARSER = null;
        public static final int TX_HASH_FIELD_NUMBER = 1;
        private long outputIndex_;
        private ByteString txHash_ = ByteString.EMPTY;

        public static final class Builder extends GeneratedMessageLite.C4930a<OutPoint, Builder> implements OutPointOrBuilder {
            public /* synthetic */ Builder(C97301 r1) {
                this();
            }

            public Builder clearOutputIndex() {
                copyOnWrite();
                ((OutPoint) this.instance).clearOutputIndex();
                return this;
            }

            public Builder clearTxHash() {
                copyOnWrite();
                ((OutPoint) this.instance).clearTxHash();
                return this;
            }

            public long getOutputIndex() {
                return ((OutPoint) this.instance).getOutputIndex();
            }

            public ByteString getTxHash() {
                return ((OutPoint) this.instance).getTxHash();
            }

            public Builder setOutputIndex(long j) {
                copyOnWrite();
                ((OutPoint) this.instance).setOutputIndex(j);
                return this;
            }

            public Builder setTxHash(ByteString byteString) {
                copyOnWrite();
                ((OutPoint) this.instance).setTxHash(byteString);
                return this;
            }

            private Builder() {
                super(OutPoint.DEFAULT_INSTANCE);
            }
        }

        static {
            OutPoint outPoint = new OutPoint();
            DEFAULT_INSTANCE = outPoint;
            GeneratedMessageLite.registerDefaultInstance(OutPoint.class, outPoint);
        }

        private OutPoint() {
        }

        /* access modifiers changed from: private */
        public void clearOutputIndex() {
            this.outputIndex_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTxHash() {
            this.txHash_ = getDefaultInstance().getTxHash();
        }

        public static OutPoint getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static OutPoint parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OutPoint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OutPoint parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (OutPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<OutPoint> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setOutputIndex(long j) {
            this.outputIndex_ = j;
        }

        /* access modifiers changed from: private */
        public void setTxHash(ByteString byteString) {
            byteString.getClass();
            this.txHash_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97301.f46546xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new OutPoint();
                case 2:
                    return new Builder((C97301) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\u0003", new Object[]{"txHash_", "outputIndex_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<OutPoint> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (OutPoint.class) {
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

        public long getOutputIndex() {
            return this.outputIndex_;
        }

        public ByteString getTxHash() {
            return this.txHash_;
        }

        public static Builder newBuilder(OutPoint outPoint) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(outPoint);
        }

        public static OutPoint parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (OutPoint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static OutPoint parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (OutPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static OutPoint parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OutPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static OutPoint parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (OutPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static OutPoint parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OutPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OutPoint parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (OutPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static OutPoint parseFrom(InputStream inputStream) throws IOException {
            return (OutPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OutPoint parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (OutPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static OutPoint parseFrom(C4969g gVar) throws IOException {
            return (OutPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static OutPoint parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (OutPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface OutPointOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        long getOutputIndex();

        ByteString getTxHash();

        /* synthetic */ boolean isInitialized();
    }

    public static final class RegisterStakingKey extends GeneratedMessageLite<RegisterStakingKey, Builder> implements RegisterStakingKeyOrBuilder {
        /* access modifiers changed from: private */
        public static final RegisterStakingKey DEFAULT_INSTANCE;
        public static final int DEPOSIT_AMOUNT_FIELD_NUMBER = 2;
        private static volatile im4<RegisterStakingKey> PARSER = null;
        public static final int STAKING_ADDRESS_FIELD_NUMBER = 1;
        private long depositAmount_;
        private String stakingAddress_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<RegisterStakingKey, Builder> implements RegisterStakingKeyOrBuilder {
            public /* synthetic */ Builder(C97301 r1) {
                this();
            }

            public Builder clearDepositAmount() {
                copyOnWrite();
                ((RegisterStakingKey) this.instance).clearDepositAmount();
                return this;
            }

            public Builder clearStakingAddress() {
                copyOnWrite();
                ((RegisterStakingKey) this.instance).clearStakingAddress();
                return this;
            }

            public long getDepositAmount() {
                return ((RegisterStakingKey) this.instance).getDepositAmount();
            }

            public String getStakingAddress() {
                return ((RegisterStakingKey) this.instance).getStakingAddress();
            }

            public ByteString getStakingAddressBytes() {
                return ((RegisterStakingKey) this.instance).getStakingAddressBytes();
            }

            public Builder setDepositAmount(long j) {
                copyOnWrite();
                ((RegisterStakingKey) this.instance).setDepositAmount(j);
                return this;
            }

            public Builder setStakingAddress(String str) {
                copyOnWrite();
                ((RegisterStakingKey) this.instance).setStakingAddress(str);
                return this;
            }

            public Builder setStakingAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((RegisterStakingKey) this.instance).setStakingAddressBytes(byteString);
                return this;
            }

            private Builder() {
                super(RegisterStakingKey.DEFAULT_INSTANCE);
            }
        }

        static {
            RegisterStakingKey registerStakingKey = new RegisterStakingKey();
            DEFAULT_INSTANCE = registerStakingKey;
            GeneratedMessageLite.registerDefaultInstance(RegisterStakingKey.class, registerStakingKey);
        }

        private RegisterStakingKey() {
        }

        /* access modifiers changed from: private */
        public void clearDepositAmount() {
            this.depositAmount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearStakingAddress() {
            this.stakingAddress_ = getDefaultInstance().getStakingAddress();
        }

        public static RegisterStakingKey getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static RegisterStakingKey parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RegisterStakingKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RegisterStakingKey parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (RegisterStakingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<RegisterStakingKey> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setDepositAmount(long j) {
            this.depositAmount_ = j;
        }

        /* access modifiers changed from: private */
        public void setStakingAddress(String str) {
            str.getClass();
            this.stakingAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setStakingAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.stakingAddress_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97301.f46546xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new RegisterStakingKey();
                case 2:
                    return new Builder((C97301) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0003", new Object[]{"stakingAddress_", "depositAmount_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<RegisterStakingKey> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (RegisterStakingKey.class) {
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

        public long getDepositAmount() {
            return this.depositAmount_;
        }

        public String getStakingAddress() {
            return this.stakingAddress_;
        }

        public ByteString getStakingAddressBytes() {
            return ByteString.copyFromUtf8(this.stakingAddress_);
        }

        public static Builder newBuilder(RegisterStakingKey registerStakingKey) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(registerStakingKey);
        }

        public static RegisterStakingKey parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (RegisterStakingKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static RegisterStakingKey parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (RegisterStakingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static RegisterStakingKey parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (RegisterStakingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RegisterStakingKey parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (RegisterStakingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static RegisterStakingKey parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (RegisterStakingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RegisterStakingKey parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (RegisterStakingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static RegisterStakingKey parseFrom(InputStream inputStream) throws IOException {
            return (RegisterStakingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RegisterStakingKey parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (RegisterStakingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static RegisterStakingKey parseFrom(C4969g gVar) throws IOException {
            return (RegisterStakingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static RegisterStakingKey parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (RegisterStakingKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface RegisterStakingKeyOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        long getDepositAmount();

        String getStakingAddress();

        ByteString getStakingAddressBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SigningInput extends GeneratedMessageLite<SigningInput, Builder> implements SigningInputOrBuilder {
        /* access modifiers changed from: private */
        public static final SigningInput DEFAULT_INSTANCE;
        public static final int DELEGATE_FIELD_NUMBER = 7;
        public static final int DEREGISTER_STAKING_KEY_FIELD_NUMBER = 9;
        private static volatile im4<SigningInput> PARSER = null;
        public static final int PLAN_FIELD_NUMBER = 5;
        public static final int PRIVATE_KEY_FIELD_NUMBER = 2;
        public static final int REGISTER_STAKING_KEY_FIELD_NUMBER = 6;
        public static final int TRANSFER_MESSAGE_FIELD_NUMBER = 3;
        public static final int TTL_FIELD_NUMBER = 4;
        public static final int UTXOS_FIELD_NUMBER = 1;
        public static final int WITHDRAW_FIELD_NUMBER = 8;
        private Delegate delegate_;
        private DeregisterStakingKey deregisterStakingKey_;
        private TransactionPlan plan_;
        private C5011t.C5020i<ByteString> privateKey_ = GeneratedMessageLite.emptyProtobufList();
        private RegisterStakingKey registerStakingKey_;
        private Transfer transferMessage_;
        private long ttl_;
        private C5011t.C5020i<TxInput> utxos_ = GeneratedMessageLite.emptyProtobufList();
        private Withdraw withdraw_;

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningInput, Builder> implements SigningInputOrBuilder {
            public /* synthetic */ Builder(C97301 r1) {
                this();
            }

            public Builder addAllPrivateKey(Iterable<? extends ByteString> iterable) {
                copyOnWrite();
                ((SigningInput) this.instance).addAllPrivateKey(iterable);
                return this;
            }

            public Builder addAllUtxos(Iterable<? extends TxInput> iterable) {
                copyOnWrite();
                ((SigningInput) this.instance).addAllUtxos(iterable);
                return this;
            }

            public Builder addPrivateKey(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).addPrivateKey(byteString);
                return this;
            }

            public Builder addUtxos(TxInput txInput) {
                copyOnWrite();
                ((SigningInput) this.instance).addUtxos(txInput);
                return this;
            }

            public Builder clearDelegate() {
                copyOnWrite();
                ((SigningInput) this.instance).clearDelegate();
                return this;
            }

            public Builder clearDeregisterStakingKey() {
                copyOnWrite();
                ((SigningInput) this.instance).clearDeregisterStakingKey();
                return this;
            }

            public Builder clearPlan() {
                copyOnWrite();
                ((SigningInput) this.instance).clearPlan();
                return this;
            }

            public Builder clearPrivateKey() {
                copyOnWrite();
                ((SigningInput) this.instance).clearPrivateKey();
                return this;
            }

            public Builder clearRegisterStakingKey() {
                copyOnWrite();
                ((SigningInput) this.instance).clearRegisterStakingKey();
                return this;
            }

            public Builder clearTransferMessage() {
                copyOnWrite();
                ((SigningInput) this.instance).clearTransferMessage();
                return this;
            }

            public Builder clearTtl() {
                copyOnWrite();
                ((SigningInput) this.instance).clearTtl();
                return this;
            }

            public Builder clearUtxos() {
                copyOnWrite();
                ((SigningInput) this.instance).clearUtxos();
                return this;
            }

            public Builder clearWithdraw() {
                copyOnWrite();
                ((SigningInput) this.instance).clearWithdraw();
                return this;
            }

            public Delegate getDelegate() {
                return ((SigningInput) this.instance).getDelegate();
            }

            public DeregisterStakingKey getDeregisterStakingKey() {
                return ((SigningInput) this.instance).getDeregisterStakingKey();
            }

            public TransactionPlan getPlan() {
                return ((SigningInput) this.instance).getPlan();
            }

            public ByteString getPrivateKey(int i) {
                return ((SigningInput) this.instance).getPrivateKey(i);
            }

            public int getPrivateKeyCount() {
                return ((SigningInput) this.instance).getPrivateKeyCount();
            }

            public List<ByteString> getPrivateKeyList() {
                return Collections.unmodifiableList(((SigningInput) this.instance).getPrivateKeyList());
            }

            public RegisterStakingKey getRegisterStakingKey() {
                return ((SigningInput) this.instance).getRegisterStakingKey();
            }

            public Transfer getTransferMessage() {
                return ((SigningInput) this.instance).getTransferMessage();
            }

            public long getTtl() {
                return ((SigningInput) this.instance).getTtl();
            }

            public TxInput getUtxos(int i) {
                return ((SigningInput) this.instance).getUtxos(i);
            }

            public int getUtxosCount() {
                return ((SigningInput) this.instance).getUtxosCount();
            }

            public List<TxInput> getUtxosList() {
                return Collections.unmodifiableList(((SigningInput) this.instance).getUtxosList());
            }

            public Withdraw getWithdraw() {
                return ((SigningInput) this.instance).getWithdraw();
            }

            public boolean hasDelegate() {
                return ((SigningInput) this.instance).hasDelegate();
            }

            public boolean hasDeregisterStakingKey() {
                return ((SigningInput) this.instance).hasDeregisterStakingKey();
            }

            public boolean hasPlan() {
                return ((SigningInput) this.instance).hasPlan();
            }

            public boolean hasRegisterStakingKey() {
                return ((SigningInput) this.instance).hasRegisterStakingKey();
            }

            public boolean hasTransferMessage() {
                return ((SigningInput) this.instance).hasTransferMessage();
            }

            public boolean hasWithdraw() {
                return ((SigningInput) this.instance).hasWithdraw();
            }

            public Builder mergeDelegate(Delegate delegate) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeDelegate(delegate);
                return this;
            }

            public Builder mergeDeregisterStakingKey(DeregisterStakingKey deregisterStakingKey) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeDeregisterStakingKey(deregisterStakingKey);
                return this;
            }

            public Builder mergePlan(TransactionPlan transactionPlan) {
                copyOnWrite();
                ((SigningInput) this.instance).mergePlan(transactionPlan);
                return this;
            }

            public Builder mergeRegisterStakingKey(RegisterStakingKey registerStakingKey) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeRegisterStakingKey(registerStakingKey);
                return this;
            }

            public Builder mergeTransferMessage(Transfer transfer) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeTransferMessage(transfer);
                return this;
            }

            public Builder mergeWithdraw(Withdraw withdraw) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeWithdraw(withdraw);
                return this;
            }

            public Builder removeUtxos(int i) {
                copyOnWrite();
                ((SigningInput) this.instance).removeUtxos(i);
                return this;
            }

            public Builder setDelegate(Delegate delegate) {
                copyOnWrite();
                ((SigningInput) this.instance).setDelegate(delegate);
                return this;
            }

            public Builder setDeregisterStakingKey(DeregisterStakingKey deregisterStakingKey) {
                copyOnWrite();
                ((SigningInput) this.instance).setDeregisterStakingKey(deregisterStakingKey);
                return this;
            }

            public Builder setPlan(TransactionPlan transactionPlan) {
                copyOnWrite();
                ((SigningInput) this.instance).setPlan(transactionPlan);
                return this;
            }

            public Builder setPrivateKey(int i, ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setPrivateKey(i, byteString);
                return this;
            }

            public Builder setRegisterStakingKey(RegisterStakingKey registerStakingKey) {
                copyOnWrite();
                ((SigningInput) this.instance).setRegisterStakingKey(registerStakingKey);
                return this;
            }

            public Builder setTransferMessage(Transfer transfer) {
                copyOnWrite();
                ((SigningInput) this.instance).setTransferMessage(transfer);
                return this;
            }

            public Builder setTtl(long j) {
                copyOnWrite();
                ((SigningInput) this.instance).setTtl(j);
                return this;
            }

            public Builder setUtxos(int i, TxInput txInput) {
                copyOnWrite();
                ((SigningInput) this.instance).setUtxos(i, txInput);
                return this;
            }

            public Builder setWithdraw(Withdraw withdraw) {
                copyOnWrite();
                ((SigningInput) this.instance).setWithdraw(withdraw);
                return this;
            }

            private Builder() {
                super(SigningInput.DEFAULT_INSTANCE);
            }

            public Builder addUtxos(int i, TxInput txInput) {
                copyOnWrite();
                ((SigningInput) this.instance).addUtxos(i, txInput);
                return this;
            }

            public Builder setDelegate(Delegate.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setDelegate((Delegate) builder.build());
                return this;
            }

            public Builder setDeregisterStakingKey(DeregisterStakingKey.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setDeregisterStakingKey((DeregisterStakingKey) builder.build());
                return this;
            }

            public Builder setPlan(TransactionPlan.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setPlan((TransactionPlan) builder.build());
                return this;
            }

            public Builder setRegisterStakingKey(RegisterStakingKey.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setRegisterStakingKey((RegisterStakingKey) builder.build());
                return this;
            }

            public Builder setTransferMessage(Transfer.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setTransferMessage((Transfer) builder.build());
                return this;
            }

            public Builder setUtxos(int i, TxInput.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setUtxos(i, (TxInput) builder.build());
                return this;
            }

            public Builder setWithdraw(Withdraw.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setWithdraw((Withdraw) builder.build());
                return this;
            }

            public Builder addUtxos(TxInput.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).addUtxos((TxInput) builder.build());
                return this;
            }

            public Builder addUtxos(int i, TxInput.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).addUtxos(i, (TxInput) builder.build());
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
        public void addAllPrivateKey(Iterable<? extends ByteString> iterable) {
            ensurePrivateKeyIsMutable();
            C4949a.addAll(iterable, this.privateKey_);
        }

        /* access modifiers changed from: private */
        public void addAllUtxos(Iterable<? extends TxInput> iterable) {
            ensureUtxosIsMutable();
            C4949a.addAll(iterable, this.utxos_);
        }

        /* access modifiers changed from: private */
        public void addPrivateKey(ByteString byteString) {
            byteString.getClass();
            ensurePrivateKeyIsMutable();
            this.privateKey_.add(byteString);
        }

        /* access modifiers changed from: private */
        public void addUtxos(TxInput txInput) {
            txInput.getClass();
            ensureUtxosIsMutable();
            this.utxos_.add(txInput);
        }

        /* access modifiers changed from: private */
        public void clearDelegate() {
            this.delegate_ = null;
        }

        /* access modifiers changed from: private */
        public void clearDeregisterStakingKey() {
            this.deregisterStakingKey_ = null;
        }

        /* access modifiers changed from: private */
        public void clearPlan() {
            this.plan_ = null;
        }

        /* access modifiers changed from: private */
        public void clearPrivateKey() {
            this.privateKey_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearRegisterStakingKey() {
            this.registerStakingKey_ = null;
        }

        /* access modifiers changed from: private */
        public void clearTransferMessage() {
            this.transferMessage_ = null;
        }

        /* access modifiers changed from: private */
        public void clearTtl() {
            this.ttl_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearUtxos() {
            this.utxos_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearWithdraw() {
            this.withdraw_ = null;
        }

        private void ensurePrivateKeyIsMutable() {
            C5011t.C5020i<ByteString> iVar = this.privateKey_;
            if (!iVar.mo37090v()) {
                this.privateKey_ = GeneratedMessageLite.mutableCopy(iVar);
            }
        }

        private void ensureUtxosIsMutable() {
            C5011t.C5020i<TxInput> iVar = this.utxos_;
            if (!iVar.mo37090v()) {
                this.utxos_ = GeneratedMessageLite.mutableCopy(iVar);
            }
        }

        public static SigningInput getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeDelegate(Delegate delegate) {
            delegate.getClass();
            Delegate delegate2 = this.delegate_;
            if (delegate2 == null || delegate2 == Delegate.getDefaultInstance()) {
                this.delegate_ = delegate;
            } else {
                this.delegate_ = (Delegate) ((Delegate.Builder) Delegate.newBuilder(this.delegate_).mergeFrom(delegate)).buildPartial();
            }
        }

        /* access modifiers changed from: private */
        public void mergeDeregisterStakingKey(DeregisterStakingKey deregisterStakingKey) {
            deregisterStakingKey.getClass();
            DeregisterStakingKey deregisterStakingKey2 = this.deregisterStakingKey_;
            if (deregisterStakingKey2 == null || deregisterStakingKey2 == DeregisterStakingKey.getDefaultInstance()) {
                this.deregisterStakingKey_ = deregisterStakingKey;
            } else {
                this.deregisterStakingKey_ = (DeregisterStakingKey) ((DeregisterStakingKey.Builder) DeregisterStakingKey.newBuilder(this.deregisterStakingKey_).mergeFrom(deregisterStakingKey)).buildPartial();
            }
        }

        /* access modifiers changed from: private */
        public void mergePlan(TransactionPlan transactionPlan) {
            transactionPlan.getClass();
            TransactionPlan transactionPlan2 = this.plan_;
            if (transactionPlan2 == null || transactionPlan2 == TransactionPlan.getDefaultInstance()) {
                this.plan_ = transactionPlan;
            } else {
                this.plan_ = (TransactionPlan) ((TransactionPlan.Builder) TransactionPlan.newBuilder(this.plan_).mergeFrom(transactionPlan)).buildPartial();
            }
        }

        /* access modifiers changed from: private */
        public void mergeRegisterStakingKey(RegisterStakingKey registerStakingKey) {
            registerStakingKey.getClass();
            RegisterStakingKey registerStakingKey2 = this.registerStakingKey_;
            if (registerStakingKey2 == null || registerStakingKey2 == RegisterStakingKey.getDefaultInstance()) {
                this.registerStakingKey_ = registerStakingKey;
            } else {
                this.registerStakingKey_ = (RegisterStakingKey) ((RegisterStakingKey.Builder) RegisterStakingKey.newBuilder(this.registerStakingKey_).mergeFrom(registerStakingKey)).buildPartial();
            }
        }

        /* access modifiers changed from: private */
        public void mergeTransferMessage(Transfer transfer) {
            transfer.getClass();
            Transfer transfer2 = this.transferMessage_;
            if (transfer2 == null || transfer2 == Transfer.getDefaultInstance()) {
                this.transferMessage_ = transfer;
            } else {
                this.transferMessage_ = (Transfer) ((Transfer.Builder) Transfer.newBuilder(this.transferMessage_).mergeFrom(transfer)).buildPartial();
            }
        }

        /* access modifiers changed from: private */
        public void mergeWithdraw(Withdraw withdraw) {
            withdraw.getClass();
            Withdraw withdraw2 = this.withdraw_;
            if (withdraw2 == null || withdraw2 == Withdraw.getDefaultInstance()) {
                this.withdraw_ = withdraw;
            } else {
                this.withdraw_ = (Withdraw) ((Withdraw.Builder) Withdraw.newBuilder(this.withdraw_).mergeFrom(withdraw)).buildPartial();
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
        public void removeUtxos(int i) {
            ensureUtxosIsMutable();
            this.utxos_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setDelegate(Delegate delegate) {
            delegate.getClass();
            this.delegate_ = delegate;
        }

        /* access modifiers changed from: private */
        public void setDeregisterStakingKey(DeregisterStakingKey deregisterStakingKey) {
            deregisterStakingKey.getClass();
            this.deregisterStakingKey_ = deregisterStakingKey;
        }

        /* access modifiers changed from: private */
        public void setPlan(TransactionPlan transactionPlan) {
            transactionPlan.getClass();
            this.plan_ = transactionPlan;
        }

        /* access modifiers changed from: private */
        public void setPrivateKey(int i, ByteString byteString) {
            byteString.getClass();
            ensurePrivateKeyIsMutable();
            this.privateKey_.set(i, byteString);
        }

        /* access modifiers changed from: private */
        public void setRegisterStakingKey(RegisterStakingKey registerStakingKey) {
            registerStakingKey.getClass();
            this.registerStakingKey_ = registerStakingKey;
        }

        /* access modifiers changed from: private */
        public void setTransferMessage(Transfer transfer) {
            transfer.getClass();
            this.transferMessage_ = transfer;
        }

        /* access modifiers changed from: private */
        public void setTtl(long j) {
            this.ttl_ = j;
        }

        /* access modifiers changed from: private */
        public void setUtxos(int i, TxInput txInput) {
            txInput.getClass();
            ensureUtxosIsMutable();
            this.utxos_.set(i, txInput);
        }

        /* access modifiers changed from: private */
        public void setWithdraw(Withdraw withdraw) {
            withdraw.getClass();
            this.withdraw_ = withdraw;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97301.f46546xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningInput();
                case 2:
                    return new Builder((C97301) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0002\u0000\u0001\u001b\u0002\u001c\u0003\t\u0004\u0003\u0005\t\u0006\t\u0007\t\b\t\t\t", new Object[]{"utxos_", TxInput.class, "privateKey_", "transferMessage_", "ttl_", "plan_", "registerStakingKey_", "delegate_", "withdraw_", "deregisterStakingKey_"});
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

        public Delegate getDelegate() {
            Delegate delegate = this.delegate_;
            if (delegate == null) {
                return Delegate.getDefaultInstance();
            }
            return delegate;
        }

        public DeregisterStakingKey getDeregisterStakingKey() {
            DeregisterStakingKey deregisterStakingKey = this.deregisterStakingKey_;
            if (deregisterStakingKey == null) {
                return DeregisterStakingKey.getDefaultInstance();
            }
            return deregisterStakingKey;
        }

        public TransactionPlan getPlan() {
            TransactionPlan transactionPlan = this.plan_;
            if (transactionPlan == null) {
                return TransactionPlan.getDefaultInstance();
            }
            return transactionPlan;
        }

        public ByteString getPrivateKey(int i) {
            return this.privateKey_.get(i);
        }

        public int getPrivateKeyCount() {
            return this.privateKey_.size();
        }

        public List<ByteString> getPrivateKeyList() {
            return this.privateKey_;
        }

        public RegisterStakingKey getRegisterStakingKey() {
            RegisterStakingKey registerStakingKey = this.registerStakingKey_;
            if (registerStakingKey == null) {
                return RegisterStakingKey.getDefaultInstance();
            }
            return registerStakingKey;
        }

        public Transfer getTransferMessage() {
            Transfer transfer = this.transferMessage_;
            if (transfer == null) {
                return Transfer.getDefaultInstance();
            }
            return transfer;
        }

        public long getTtl() {
            return this.ttl_;
        }

        public TxInput getUtxos(int i) {
            return this.utxos_.get(i);
        }

        public int getUtxosCount() {
            return this.utxos_.size();
        }

        public List<TxInput> getUtxosList() {
            return this.utxos_;
        }

        public TxInputOrBuilder getUtxosOrBuilder(int i) {
            return this.utxos_.get(i);
        }

        public List<? extends TxInputOrBuilder> getUtxosOrBuilderList() {
            return this.utxos_;
        }

        public Withdraw getWithdraw() {
            Withdraw withdraw = this.withdraw_;
            if (withdraw == null) {
                return Withdraw.getDefaultInstance();
            }
            return withdraw;
        }

        public boolean hasDelegate() {
            if (this.delegate_ != null) {
                return true;
            }
            return false;
        }

        public boolean hasDeregisterStakingKey() {
            if (this.deregisterStakingKey_ != null) {
                return true;
            }
            return false;
        }

        public boolean hasPlan() {
            if (this.plan_ != null) {
                return true;
            }
            return false;
        }

        public boolean hasRegisterStakingKey() {
            if (this.registerStakingKey_ != null) {
                return true;
            }
            return false;
        }

        public boolean hasTransferMessage() {
            if (this.transferMessage_ != null) {
                return true;
            }
            return false;
        }

        public boolean hasWithdraw() {
            if (this.withdraw_ != null) {
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
        public void addUtxos(int i, TxInput txInput) {
            txInput.getClass();
            ensureUtxosIsMutable();
            this.utxos_.add(i, txInput);
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
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        Delegate getDelegate();

        DeregisterStakingKey getDeregisterStakingKey();

        TransactionPlan getPlan();

        ByteString getPrivateKey(int i);

        int getPrivateKeyCount();

        List<ByteString> getPrivateKeyList();

        RegisterStakingKey getRegisterStakingKey();

        Transfer getTransferMessage();

        long getTtl();

        TxInput getUtxos(int i);

        int getUtxosCount();

        List<TxInput> getUtxosList();

        Withdraw getWithdraw();

        boolean hasDelegate();

        boolean hasDeregisterStakingKey();

        boolean hasPlan();

        boolean hasRegisterStakingKey();

        boolean hasTransferMessage();

        boolean hasWithdraw();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SigningOutput extends GeneratedMessageLite<SigningOutput, Builder> implements SigningOutputOrBuilder {
        /* access modifiers changed from: private */
        public static final SigningOutput DEFAULT_INSTANCE;
        public static final int ENCODED_FIELD_NUMBER = 1;
        public static final int ERROR_FIELD_NUMBER = 3;
        private static volatile im4<SigningOutput> PARSER = null;
        public static final int TX_ID_FIELD_NUMBER = 2;
        private ByteString encoded_;
        private int error_;
        private ByteString txId_;

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningOutput, Builder> implements SigningOutputOrBuilder {
            public /* synthetic */ Builder(C97301 r1) {
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

            public Builder clearTxId() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearTxId();
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

            public ByteString getTxId() {
                return ((SigningOutput) this.instance).getTxId();
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

            public Builder setTxId(ByteString byteString) {
                copyOnWrite();
                ((SigningOutput) this.instance).setTxId(byteString);
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
            ByteString byteString = ByteString.EMPTY;
            this.encoded_ = byteString;
            this.txId_ = byteString;
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
        public void clearTxId() {
            this.txId_ = getDefaultInstance().getTxId();
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

        /* access modifiers changed from: private */
        public void setTxId(ByteString byteString) {
            byteString.getClass();
            this.txId_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97301.f46546xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningOutput();
                case 2:
                    return new Builder((C97301) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\n\u0003\f", new Object[]{"encoded_", "txId_", "error_"});
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

        public ByteString getTxId() {
            return this.txId_;
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

        ByteString getTxId();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TokenAmount extends GeneratedMessageLite<TokenAmount, Builder> implements TokenAmountOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 3;
        public static final int ASSET_NAME_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final TokenAmount DEFAULT_INSTANCE;
        private static volatile im4<TokenAmount> PARSER = null;
        public static final int POLICY_ID_FIELD_NUMBER = 1;
        private ByteString amount_ = ByteString.EMPTY;
        private String assetName_ = "";
        private String policyId_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<TokenAmount, Builder> implements TokenAmountOrBuilder {
            public /* synthetic */ Builder(C97301 r1) {
                this();
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((TokenAmount) this.instance).clearAmount();
                return this;
            }

            public Builder clearAssetName() {
                copyOnWrite();
                ((TokenAmount) this.instance).clearAssetName();
                return this;
            }

            public Builder clearPolicyId() {
                copyOnWrite();
                ((TokenAmount) this.instance).clearPolicyId();
                return this;
            }

            public ByteString getAmount() {
                return ((TokenAmount) this.instance).getAmount();
            }

            public String getAssetName() {
                return ((TokenAmount) this.instance).getAssetName();
            }

            public ByteString getAssetNameBytes() {
                return ((TokenAmount) this.instance).getAssetNameBytes();
            }

            public String getPolicyId() {
                return ((TokenAmount) this.instance).getPolicyId();
            }

            public ByteString getPolicyIdBytes() {
                return ((TokenAmount) this.instance).getPolicyIdBytes();
            }

            public Builder setAmount(ByteString byteString) {
                copyOnWrite();
                ((TokenAmount) this.instance).setAmount(byteString);
                return this;
            }

            public Builder setAssetName(String str) {
                copyOnWrite();
                ((TokenAmount) this.instance).setAssetName(str);
                return this;
            }

            public Builder setAssetNameBytes(ByteString byteString) {
                copyOnWrite();
                ((TokenAmount) this.instance).setAssetNameBytes(byteString);
                return this;
            }

            public Builder setPolicyId(String str) {
                copyOnWrite();
                ((TokenAmount) this.instance).setPolicyId(str);
                return this;
            }

            public Builder setPolicyIdBytes(ByteString byteString) {
                copyOnWrite();
                ((TokenAmount) this.instance).setPolicyIdBytes(byteString);
                return this;
            }

            private Builder() {
                super(TokenAmount.DEFAULT_INSTANCE);
            }
        }

        static {
            TokenAmount tokenAmount = new TokenAmount();
            DEFAULT_INSTANCE = tokenAmount;
            GeneratedMessageLite.registerDefaultInstance(TokenAmount.class, tokenAmount);
        }

        private TokenAmount() {
        }

        /* access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = getDefaultInstance().getAmount();
        }

        /* access modifiers changed from: private */
        public void clearAssetName() {
            this.assetName_ = getDefaultInstance().getAssetName();
        }

        /* access modifiers changed from: private */
        public void clearPolicyId() {
            this.policyId_ = getDefaultInstance().getPolicyId();
        }

        public static TokenAmount getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TokenAmount parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TokenAmount) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TokenAmount parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TokenAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<TokenAmount> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAmount(ByteString byteString) {
            byteString.getClass();
            this.amount_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setAssetName(String str) {
            str.getClass();
            this.assetName_ = str;
        }

        /* access modifiers changed from: private */
        public void setAssetNameBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.assetName_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setPolicyId(String str) {
            str.getClass();
            this.policyId_ = str;
        }

        /* access modifiers changed from: private */
        public void setPolicyIdBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.policyId_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97301.f46546xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TokenAmount();
                case 2:
                    return new Builder((C97301) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\n", new Object[]{"policyId_", "assetName_", "amount_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<TokenAmount> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (TokenAmount.class) {
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

        public String getAssetName() {
            return this.assetName_;
        }

        public ByteString getAssetNameBytes() {
            return ByteString.copyFromUtf8(this.assetName_);
        }

        public String getPolicyId() {
            return this.policyId_;
        }

        public ByteString getPolicyIdBytes() {
            return ByteString.copyFromUtf8(this.policyId_);
        }

        public static Builder newBuilder(TokenAmount tokenAmount) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(tokenAmount);
        }

        public static TokenAmount parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TokenAmount) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TokenAmount parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (TokenAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static TokenAmount parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TokenAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TokenAmount parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (TokenAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static TokenAmount parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TokenAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TokenAmount parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (TokenAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static TokenAmount parseFrom(InputStream inputStream) throws IOException {
            return (TokenAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TokenAmount parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TokenAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TokenAmount parseFrom(C4969g gVar) throws IOException {
            return (TokenAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static TokenAmount parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (TokenAmount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface TokenAmountOrBuilder extends qu3 {
        ByteString getAmount();

        String getAssetName();

        ByteString getAssetNameBytes();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getPolicyId();

        ByteString getPolicyIdBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TokenBundle extends GeneratedMessageLite<TokenBundle, Builder> implements TokenBundleOrBuilder {
        /* access modifiers changed from: private */
        public static final TokenBundle DEFAULT_INSTANCE;
        private static volatile im4<TokenBundle> PARSER = null;
        public static final int TOKEN_FIELD_NUMBER = 1;
        private C5011t.C5020i<TokenAmount> token_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.C4930a<TokenBundle, Builder> implements TokenBundleOrBuilder {
            public /* synthetic */ Builder(C97301 r1) {
                this();
            }

            public Builder addAllToken(Iterable<? extends TokenAmount> iterable) {
                copyOnWrite();
                ((TokenBundle) this.instance).addAllToken(iterable);
                return this;
            }

            public Builder addToken(TokenAmount tokenAmount) {
                copyOnWrite();
                ((TokenBundle) this.instance).addToken(tokenAmount);
                return this;
            }

            public Builder clearToken() {
                copyOnWrite();
                ((TokenBundle) this.instance).clearToken();
                return this;
            }

            public TokenAmount getToken(int i) {
                return ((TokenBundle) this.instance).getToken(i);
            }

            public int getTokenCount() {
                return ((TokenBundle) this.instance).getTokenCount();
            }

            public List<TokenAmount> getTokenList() {
                return Collections.unmodifiableList(((TokenBundle) this.instance).getTokenList());
            }

            public Builder removeToken(int i) {
                copyOnWrite();
                ((TokenBundle) this.instance).removeToken(i);
                return this;
            }

            public Builder setToken(int i, TokenAmount tokenAmount) {
                copyOnWrite();
                ((TokenBundle) this.instance).setToken(i, tokenAmount);
                return this;
            }

            private Builder() {
                super(TokenBundle.DEFAULT_INSTANCE);
            }

            public Builder addToken(int i, TokenAmount tokenAmount) {
                copyOnWrite();
                ((TokenBundle) this.instance).addToken(i, tokenAmount);
                return this;
            }

            public Builder setToken(int i, TokenAmount.Builder builder) {
                copyOnWrite();
                ((TokenBundle) this.instance).setToken(i, (TokenAmount) builder.build());
                return this;
            }

            public Builder addToken(TokenAmount.Builder builder) {
                copyOnWrite();
                ((TokenBundle) this.instance).addToken((TokenAmount) builder.build());
                return this;
            }

            public Builder addToken(int i, TokenAmount.Builder builder) {
                copyOnWrite();
                ((TokenBundle) this.instance).addToken(i, (TokenAmount) builder.build());
                return this;
            }
        }

        static {
            TokenBundle tokenBundle = new TokenBundle();
            DEFAULT_INSTANCE = tokenBundle;
            GeneratedMessageLite.registerDefaultInstance(TokenBundle.class, tokenBundle);
        }

        private TokenBundle() {
        }

        /* access modifiers changed from: private */
        public void addAllToken(Iterable<? extends TokenAmount> iterable) {
            ensureTokenIsMutable();
            C4949a.addAll(iterable, this.token_);
        }

        /* access modifiers changed from: private */
        public void addToken(TokenAmount tokenAmount) {
            tokenAmount.getClass();
            ensureTokenIsMutable();
            this.token_.add(tokenAmount);
        }

        /* access modifiers changed from: private */
        public void clearToken() {
            this.token_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureTokenIsMutable() {
            C5011t.C5020i<TokenAmount> iVar = this.token_;
            if (!iVar.mo37090v()) {
                this.token_ = GeneratedMessageLite.mutableCopy(iVar);
            }
        }

        public static TokenBundle getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TokenBundle parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TokenBundle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TokenBundle parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TokenBundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<TokenBundle> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeToken(int i) {
            ensureTokenIsMutable();
            this.token_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setToken(int i, TokenAmount tokenAmount) {
            tokenAmount.getClass();
            ensureTokenIsMutable();
            this.token_.set(i, tokenAmount);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97301.f46546xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TokenBundle();
                case 2:
                    return new Builder((C97301) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"token_", TokenAmount.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<TokenBundle> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (TokenBundle.class) {
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

        public TokenAmount getToken(int i) {
            return this.token_.get(i);
        }

        public int getTokenCount() {
            return this.token_.size();
        }

        public List<TokenAmount> getTokenList() {
            return this.token_;
        }

        public TokenAmountOrBuilder getTokenOrBuilder(int i) {
            return this.token_.get(i);
        }

        public List<? extends TokenAmountOrBuilder> getTokenOrBuilderList() {
            return this.token_;
        }

        public static Builder newBuilder(TokenBundle tokenBundle) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(tokenBundle);
        }

        public static TokenBundle parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TokenBundle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TokenBundle parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (TokenBundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static TokenBundle parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TokenBundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* access modifiers changed from: private */
        public void addToken(int i, TokenAmount tokenAmount) {
            tokenAmount.getClass();
            ensureTokenIsMutable();
            this.token_.add(i, tokenAmount);
        }

        public static TokenBundle parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (TokenBundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static TokenBundle parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TokenBundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TokenBundle parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (TokenBundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static TokenBundle parseFrom(InputStream inputStream) throws IOException {
            return (TokenBundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TokenBundle parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TokenBundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TokenBundle parseFrom(C4969g gVar) throws IOException {
            return (TokenBundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static TokenBundle parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (TokenBundle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface TokenBundleOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        TokenAmount getToken(int i);

        int getTokenCount();

        List<TokenAmount> getTokenList();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TransactionPlan extends GeneratedMessageLite<TransactionPlan, Builder> implements TransactionPlanOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 2;
        public static final int AVAILABLE_AMOUNT_FIELD_NUMBER = 1;
        public static final int AVAILABLE_TOKENS_FIELD_NUMBER = 5;
        public static final int CHANGE_FIELD_NUMBER = 4;
        public static final int CHANGE_TOKENS_FIELD_NUMBER = 7;
        /* access modifiers changed from: private */
        public static final TransactionPlan DEFAULT_INSTANCE;
        public static final int DEPOSIT_FIELD_NUMBER = 10;
        public static final int ERROR_FIELD_NUMBER = 9;
        public static final int FEE_FIELD_NUMBER = 3;
        public static final int OUTPUT_TOKENS_FIELD_NUMBER = 6;
        private static volatile im4<TransactionPlan> PARSER = null;
        public static final int UNDEPOSIT_FIELD_NUMBER = 11;
        public static final int UTXOS_FIELD_NUMBER = 8;
        private long amount_;
        private long availableAmount_;
        private C5011t.C5020i<TokenAmount> availableTokens_ = GeneratedMessageLite.emptyProtobufList();
        private C5011t.C5020i<TokenAmount> changeTokens_ = GeneratedMessageLite.emptyProtobufList();
        private long change_;
        private long deposit_;
        private int error_;
        private long fee_;
        private C5011t.C5020i<TokenAmount> outputTokens_ = GeneratedMessageLite.emptyProtobufList();
        private long undeposit_;
        private C5011t.C5020i<TxInput> utxos_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.C4930a<TransactionPlan, Builder> implements TransactionPlanOrBuilder {
            public /* synthetic */ Builder(C97301 r1) {
                this();
            }

            public Builder addAllAvailableTokens(Iterable<? extends TokenAmount> iterable) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addAllAvailableTokens(iterable);
                return this;
            }

            public Builder addAllChangeTokens(Iterable<? extends TokenAmount> iterable) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addAllChangeTokens(iterable);
                return this;
            }

            public Builder addAllOutputTokens(Iterable<? extends TokenAmount> iterable) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addAllOutputTokens(iterable);
                return this;
            }

            public Builder addAllUtxos(Iterable<? extends TxInput> iterable) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addAllUtxos(iterable);
                return this;
            }

            public Builder addAvailableTokens(TokenAmount tokenAmount) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addAvailableTokens(tokenAmount);
                return this;
            }

            public Builder addChangeTokens(TokenAmount tokenAmount) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addChangeTokens(tokenAmount);
                return this;
            }

            public Builder addOutputTokens(TokenAmount tokenAmount) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addOutputTokens(tokenAmount);
                return this;
            }

            public Builder addUtxos(TxInput txInput) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addUtxos(txInput);
                return this;
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((TransactionPlan) this.instance).clearAmount();
                return this;
            }

            public Builder clearAvailableAmount() {
                copyOnWrite();
                ((TransactionPlan) this.instance).clearAvailableAmount();
                return this;
            }

            public Builder clearAvailableTokens() {
                copyOnWrite();
                ((TransactionPlan) this.instance).clearAvailableTokens();
                return this;
            }

            public Builder clearChange() {
                copyOnWrite();
                ((TransactionPlan) this.instance).clearChange();
                return this;
            }

            public Builder clearChangeTokens() {
                copyOnWrite();
                ((TransactionPlan) this.instance).clearChangeTokens();
                return this;
            }

            public Builder clearDeposit() {
                copyOnWrite();
                ((TransactionPlan) this.instance).clearDeposit();
                return this;
            }

            public Builder clearError() {
                copyOnWrite();
                ((TransactionPlan) this.instance).clearError();
                return this;
            }

            public Builder clearFee() {
                copyOnWrite();
                ((TransactionPlan) this.instance).clearFee();
                return this;
            }

            public Builder clearOutputTokens() {
                copyOnWrite();
                ((TransactionPlan) this.instance).clearOutputTokens();
                return this;
            }

            public Builder clearUndeposit() {
                copyOnWrite();
                ((TransactionPlan) this.instance).clearUndeposit();
                return this;
            }

            public Builder clearUtxos() {
                copyOnWrite();
                ((TransactionPlan) this.instance).clearUtxos();
                return this;
            }

            public long getAmount() {
                return ((TransactionPlan) this.instance).getAmount();
            }

            public long getAvailableAmount() {
                return ((TransactionPlan) this.instance).getAvailableAmount();
            }

            public TokenAmount getAvailableTokens(int i) {
                return ((TransactionPlan) this.instance).getAvailableTokens(i);
            }

            public int getAvailableTokensCount() {
                return ((TransactionPlan) this.instance).getAvailableTokensCount();
            }

            public List<TokenAmount> getAvailableTokensList() {
                return Collections.unmodifiableList(((TransactionPlan) this.instance).getAvailableTokensList());
            }

            public long getChange() {
                return ((TransactionPlan) this.instance).getChange();
            }

            public TokenAmount getChangeTokens(int i) {
                return ((TransactionPlan) this.instance).getChangeTokens(i);
            }

            public int getChangeTokensCount() {
                return ((TransactionPlan) this.instance).getChangeTokensCount();
            }

            public List<TokenAmount> getChangeTokensList() {
                return Collections.unmodifiableList(((TransactionPlan) this.instance).getChangeTokensList());
            }

            public long getDeposit() {
                return ((TransactionPlan) this.instance).getDeposit();
            }

            public Common.SigningError getError() {
                return ((TransactionPlan) this.instance).getError();
            }

            public int getErrorValue() {
                return ((TransactionPlan) this.instance).getErrorValue();
            }

            public long getFee() {
                return ((TransactionPlan) this.instance).getFee();
            }

            public TokenAmount getOutputTokens(int i) {
                return ((TransactionPlan) this.instance).getOutputTokens(i);
            }

            public int getOutputTokensCount() {
                return ((TransactionPlan) this.instance).getOutputTokensCount();
            }

            public List<TokenAmount> getOutputTokensList() {
                return Collections.unmodifiableList(((TransactionPlan) this.instance).getOutputTokensList());
            }

            public long getUndeposit() {
                return ((TransactionPlan) this.instance).getUndeposit();
            }

            public TxInput getUtxos(int i) {
                return ((TransactionPlan) this.instance).getUtxos(i);
            }

            public int getUtxosCount() {
                return ((TransactionPlan) this.instance).getUtxosCount();
            }

            public List<TxInput> getUtxosList() {
                return Collections.unmodifiableList(((TransactionPlan) this.instance).getUtxosList());
            }

            public Builder removeAvailableTokens(int i) {
                copyOnWrite();
                ((TransactionPlan) this.instance).removeAvailableTokens(i);
                return this;
            }

            public Builder removeChangeTokens(int i) {
                copyOnWrite();
                ((TransactionPlan) this.instance).removeChangeTokens(i);
                return this;
            }

            public Builder removeOutputTokens(int i) {
                copyOnWrite();
                ((TransactionPlan) this.instance).removeOutputTokens(i);
                return this;
            }

            public Builder removeUtxos(int i) {
                copyOnWrite();
                ((TransactionPlan) this.instance).removeUtxos(i);
                return this;
            }

            public Builder setAmount(long j) {
                copyOnWrite();
                ((TransactionPlan) this.instance).setAmount(j);
                return this;
            }

            public Builder setAvailableAmount(long j) {
                copyOnWrite();
                ((TransactionPlan) this.instance).setAvailableAmount(j);
                return this;
            }

            public Builder setAvailableTokens(int i, TokenAmount tokenAmount) {
                copyOnWrite();
                ((TransactionPlan) this.instance).setAvailableTokens(i, tokenAmount);
                return this;
            }

            public Builder setChange(long j) {
                copyOnWrite();
                ((TransactionPlan) this.instance).setChange(j);
                return this;
            }

            public Builder setChangeTokens(int i, TokenAmount tokenAmount) {
                copyOnWrite();
                ((TransactionPlan) this.instance).setChangeTokens(i, tokenAmount);
                return this;
            }

            public Builder setDeposit(long j) {
                copyOnWrite();
                ((TransactionPlan) this.instance).setDeposit(j);
                return this;
            }

            public Builder setError(Common.SigningError signingError) {
                copyOnWrite();
                ((TransactionPlan) this.instance).setError(signingError);
                return this;
            }

            public Builder setErrorValue(int i) {
                copyOnWrite();
                ((TransactionPlan) this.instance).setErrorValue(i);
                return this;
            }

            public Builder setFee(long j) {
                copyOnWrite();
                ((TransactionPlan) this.instance).setFee(j);
                return this;
            }

            public Builder setOutputTokens(int i, TokenAmount tokenAmount) {
                copyOnWrite();
                ((TransactionPlan) this.instance).setOutputTokens(i, tokenAmount);
                return this;
            }

            public Builder setUndeposit(long j) {
                copyOnWrite();
                ((TransactionPlan) this.instance).setUndeposit(j);
                return this;
            }

            public Builder setUtxos(int i, TxInput txInput) {
                copyOnWrite();
                ((TransactionPlan) this.instance).setUtxos(i, txInput);
                return this;
            }

            private Builder() {
                super(TransactionPlan.DEFAULT_INSTANCE);
            }

            public Builder addAvailableTokens(int i, TokenAmount tokenAmount) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addAvailableTokens(i, tokenAmount);
                return this;
            }

            public Builder addChangeTokens(int i, TokenAmount tokenAmount) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addChangeTokens(i, tokenAmount);
                return this;
            }

            public Builder addOutputTokens(int i, TokenAmount tokenAmount) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addOutputTokens(i, tokenAmount);
                return this;
            }

            public Builder addUtxos(int i, TxInput txInput) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addUtxos(i, txInput);
                return this;
            }

            public Builder setAvailableTokens(int i, TokenAmount.Builder builder) {
                copyOnWrite();
                ((TransactionPlan) this.instance).setAvailableTokens(i, (TokenAmount) builder.build());
                return this;
            }

            public Builder setChangeTokens(int i, TokenAmount.Builder builder) {
                copyOnWrite();
                ((TransactionPlan) this.instance).setChangeTokens(i, (TokenAmount) builder.build());
                return this;
            }

            public Builder setOutputTokens(int i, TokenAmount.Builder builder) {
                copyOnWrite();
                ((TransactionPlan) this.instance).setOutputTokens(i, (TokenAmount) builder.build());
                return this;
            }

            public Builder setUtxos(int i, TxInput.Builder builder) {
                copyOnWrite();
                ((TransactionPlan) this.instance).setUtxos(i, (TxInput) builder.build());
                return this;
            }

            public Builder addAvailableTokens(TokenAmount.Builder builder) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addAvailableTokens((TokenAmount) builder.build());
                return this;
            }

            public Builder addChangeTokens(TokenAmount.Builder builder) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addChangeTokens((TokenAmount) builder.build());
                return this;
            }

            public Builder addOutputTokens(TokenAmount.Builder builder) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addOutputTokens((TokenAmount) builder.build());
                return this;
            }

            public Builder addUtxos(TxInput.Builder builder) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addUtxos((TxInput) builder.build());
                return this;
            }

            public Builder addAvailableTokens(int i, TokenAmount.Builder builder) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addAvailableTokens(i, (TokenAmount) builder.build());
                return this;
            }

            public Builder addChangeTokens(int i, TokenAmount.Builder builder) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addChangeTokens(i, (TokenAmount) builder.build());
                return this;
            }

            public Builder addOutputTokens(int i, TokenAmount.Builder builder) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addOutputTokens(i, (TokenAmount) builder.build());
                return this;
            }

            public Builder addUtxos(int i, TxInput.Builder builder) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addUtxos(i, (TxInput) builder.build());
                return this;
            }
        }

        static {
            TransactionPlan transactionPlan = new TransactionPlan();
            DEFAULT_INSTANCE = transactionPlan;
            GeneratedMessageLite.registerDefaultInstance(TransactionPlan.class, transactionPlan);
        }

        private TransactionPlan() {
        }

        /* access modifiers changed from: private */
        public void addAllAvailableTokens(Iterable<? extends TokenAmount> iterable) {
            ensureAvailableTokensIsMutable();
            C4949a.addAll(iterable, this.availableTokens_);
        }

        /* access modifiers changed from: private */
        public void addAllChangeTokens(Iterable<? extends TokenAmount> iterable) {
            ensureChangeTokensIsMutable();
            C4949a.addAll(iterable, this.changeTokens_);
        }

        /* access modifiers changed from: private */
        public void addAllOutputTokens(Iterable<? extends TokenAmount> iterable) {
            ensureOutputTokensIsMutable();
            C4949a.addAll(iterable, this.outputTokens_);
        }

        /* access modifiers changed from: private */
        public void addAllUtxos(Iterable<? extends TxInput> iterable) {
            ensureUtxosIsMutable();
            C4949a.addAll(iterable, this.utxos_);
        }

        /* access modifiers changed from: private */
        public void addAvailableTokens(TokenAmount tokenAmount) {
            tokenAmount.getClass();
            ensureAvailableTokensIsMutable();
            this.availableTokens_.add(tokenAmount);
        }

        /* access modifiers changed from: private */
        public void addChangeTokens(TokenAmount tokenAmount) {
            tokenAmount.getClass();
            ensureChangeTokensIsMutable();
            this.changeTokens_.add(tokenAmount);
        }

        /* access modifiers changed from: private */
        public void addOutputTokens(TokenAmount tokenAmount) {
            tokenAmount.getClass();
            ensureOutputTokensIsMutable();
            this.outputTokens_.add(tokenAmount);
        }

        /* access modifiers changed from: private */
        public void addUtxos(TxInput txInput) {
            txInput.getClass();
            ensureUtxosIsMutable();
            this.utxos_.add(txInput);
        }

        /* access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearAvailableAmount() {
            this.availableAmount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearAvailableTokens() {
            this.availableTokens_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearChange() {
            this.change_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearChangeTokens() {
            this.changeTokens_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearDeposit() {
            this.deposit_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearError() {
            this.error_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFee() {
            this.fee_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearOutputTokens() {
            this.outputTokens_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearUndeposit() {
            this.undeposit_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearUtxos() {
            this.utxos_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureAvailableTokensIsMutable() {
            C5011t.C5020i<TokenAmount> iVar = this.availableTokens_;
            if (!iVar.mo37090v()) {
                this.availableTokens_ = GeneratedMessageLite.mutableCopy(iVar);
            }
        }

        private void ensureChangeTokensIsMutable() {
            C5011t.C5020i<TokenAmount> iVar = this.changeTokens_;
            if (!iVar.mo37090v()) {
                this.changeTokens_ = GeneratedMessageLite.mutableCopy(iVar);
            }
        }

        private void ensureOutputTokensIsMutable() {
            C5011t.C5020i<TokenAmount> iVar = this.outputTokens_;
            if (!iVar.mo37090v()) {
                this.outputTokens_ = GeneratedMessageLite.mutableCopy(iVar);
            }
        }

        private void ensureUtxosIsMutable() {
            C5011t.C5020i<TxInput> iVar = this.utxos_;
            if (!iVar.mo37090v()) {
                this.utxos_ = GeneratedMessageLite.mutableCopy(iVar);
            }
        }

        public static TransactionPlan getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TransactionPlan parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TransactionPlan) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TransactionPlan parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TransactionPlan) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<TransactionPlan> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeAvailableTokens(int i) {
            ensureAvailableTokensIsMutable();
            this.availableTokens_.remove(i);
        }

        /* access modifiers changed from: private */
        public void removeChangeTokens(int i) {
            ensureChangeTokensIsMutable();
            this.changeTokens_.remove(i);
        }

        /* access modifiers changed from: private */
        public void removeOutputTokens(int i) {
            ensureOutputTokensIsMutable();
            this.outputTokens_.remove(i);
        }

        /* access modifiers changed from: private */
        public void removeUtxos(int i) {
            ensureUtxosIsMutable();
            this.utxos_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setAmount(long j) {
            this.amount_ = j;
        }

        /* access modifiers changed from: private */
        public void setAvailableAmount(long j) {
            this.availableAmount_ = j;
        }

        /* access modifiers changed from: private */
        public void setAvailableTokens(int i, TokenAmount tokenAmount) {
            tokenAmount.getClass();
            ensureAvailableTokensIsMutable();
            this.availableTokens_.set(i, tokenAmount);
        }

        /* access modifiers changed from: private */
        public void setChange(long j) {
            this.change_ = j;
        }

        /* access modifiers changed from: private */
        public void setChangeTokens(int i, TokenAmount tokenAmount) {
            tokenAmount.getClass();
            ensureChangeTokensIsMutable();
            this.changeTokens_.set(i, tokenAmount);
        }

        /* access modifiers changed from: private */
        public void setDeposit(long j) {
            this.deposit_ = j;
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
        public void setFee(long j) {
            this.fee_ = j;
        }

        /* access modifiers changed from: private */
        public void setOutputTokens(int i, TokenAmount tokenAmount) {
            tokenAmount.getClass();
            ensureOutputTokensIsMutable();
            this.outputTokens_.set(i, tokenAmount);
        }

        /* access modifiers changed from: private */
        public void setUndeposit(long j) {
            this.undeposit_ = j;
        }

        /* access modifiers changed from: private */
        public void setUtxos(int i, TxInput txInput) {
            txInput.getClass();
            ensureUtxosIsMutable();
            this.utxos_.set(i, txInput);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Class<TokenAmount> cls = TokenAmount.class;
            switch (C97301.f46546xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TransactionPlan();
                case 2:
                    return new Builder((C97301) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0004\u0000\u0001\u0003\u0002\u0003\u0003\u0003\u0004\u0003\u0005\u001b\u0006\u001b\u0007\u001b\b\u001b\t\f\n\u0003\u000b\u0003", new Object[]{"availableAmount_", "amount_", "fee_", "change_", "availableTokens_", cls, "outputTokens_", cls, "changeTokens_", cls, "utxos_", TxInput.class, "error_", "deposit_", "undeposit_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<TransactionPlan> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (TransactionPlan.class) {
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

        public long getAvailableAmount() {
            return this.availableAmount_;
        }

        public TokenAmount getAvailableTokens(int i) {
            return this.availableTokens_.get(i);
        }

        public int getAvailableTokensCount() {
            return this.availableTokens_.size();
        }

        public List<TokenAmount> getAvailableTokensList() {
            return this.availableTokens_;
        }

        public TokenAmountOrBuilder getAvailableTokensOrBuilder(int i) {
            return this.availableTokens_.get(i);
        }

        public List<? extends TokenAmountOrBuilder> getAvailableTokensOrBuilderList() {
            return this.availableTokens_;
        }

        public long getChange() {
            return this.change_;
        }

        public TokenAmount getChangeTokens(int i) {
            return this.changeTokens_.get(i);
        }

        public int getChangeTokensCount() {
            return this.changeTokens_.size();
        }

        public List<TokenAmount> getChangeTokensList() {
            return this.changeTokens_;
        }

        public TokenAmountOrBuilder getChangeTokensOrBuilder(int i) {
            return this.changeTokens_.get(i);
        }

        public List<? extends TokenAmountOrBuilder> getChangeTokensOrBuilderList() {
            return this.changeTokens_;
        }

        public long getDeposit() {
            return this.deposit_;
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

        public long getFee() {
            return this.fee_;
        }

        public TokenAmount getOutputTokens(int i) {
            return this.outputTokens_.get(i);
        }

        public int getOutputTokensCount() {
            return this.outputTokens_.size();
        }

        public List<TokenAmount> getOutputTokensList() {
            return this.outputTokens_;
        }

        public TokenAmountOrBuilder getOutputTokensOrBuilder(int i) {
            return this.outputTokens_.get(i);
        }

        public List<? extends TokenAmountOrBuilder> getOutputTokensOrBuilderList() {
            return this.outputTokens_;
        }

        public long getUndeposit() {
            return this.undeposit_;
        }

        public TxInput getUtxos(int i) {
            return this.utxos_.get(i);
        }

        public int getUtxosCount() {
            return this.utxos_.size();
        }

        public List<TxInput> getUtxosList() {
            return this.utxos_;
        }

        public TxInputOrBuilder getUtxosOrBuilder(int i) {
            return this.utxos_.get(i);
        }

        public List<? extends TxInputOrBuilder> getUtxosOrBuilderList() {
            return this.utxos_;
        }

        public static Builder newBuilder(TransactionPlan transactionPlan) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(transactionPlan);
        }

        public static TransactionPlan parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TransactionPlan) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TransactionPlan parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransactionPlan) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static TransactionPlan parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TransactionPlan) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* access modifiers changed from: private */
        public void addAvailableTokens(int i, TokenAmount tokenAmount) {
            tokenAmount.getClass();
            ensureAvailableTokensIsMutable();
            this.availableTokens_.add(i, tokenAmount);
        }

        /* access modifiers changed from: private */
        public void addChangeTokens(int i, TokenAmount tokenAmount) {
            tokenAmount.getClass();
            ensureChangeTokensIsMutable();
            this.changeTokens_.add(i, tokenAmount);
        }

        /* access modifiers changed from: private */
        public void addOutputTokens(int i, TokenAmount tokenAmount) {
            tokenAmount.getClass();
            ensureOutputTokensIsMutable();
            this.outputTokens_.add(i, tokenAmount);
        }

        /* access modifiers changed from: private */
        public void addUtxos(int i, TxInput txInput) {
            txInput.getClass();
            ensureUtxosIsMutable();
            this.utxos_.add(i, txInput);
        }

        public static TransactionPlan parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransactionPlan) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static TransactionPlan parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TransactionPlan) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TransactionPlan parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransactionPlan) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static TransactionPlan parseFrom(InputStream inputStream) throws IOException {
            return (TransactionPlan) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TransactionPlan parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TransactionPlan) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TransactionPlan parseFrom(C4969g gVar) throws IOException {
            return (TransactionPlan) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static TransactionPlan parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (TransactionPlan) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface TransactionPlanOrBuilder extends qu3 {
        long getAmount();

        long getAvailableAmount();

        TokenAmount getAvailableTokens(int i);

        int getAvailableTokensCount();

        List<TokenAmount> getAvailableTokensList();

        long getChange();

        TokenAmount getChangeTokens(int i);

        int getChangeTokensCount();

        List<TokenAmount> getChangeTokensList();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        long getDeposit();

        Common.SigningError getError();

        int getErrorValue();

        long getFee();

        TokenAmount getOutputTokens(int i);

        int getOutputTokensCount();

        List<TokenAmount> getOutputTokensList();

        long getUndeposit();

        TxInput getUtxos(int i);

        int getUtxosCount();

        List<TxInput> getUtxosList();

        /* synthetic */ boolean isInitialized();
    }

    public static final class Transfer extends GeneratedMessageLite<Transfer, Builder> implements TransferOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 3;
        public static final int CHANGE_ADDRESS_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final Transfer DEFAULT_INSTANCE;
        public static final int FORCE_FEE_FIELD_NUMBER = 6;
        private static volatile im4<Transfer> PARSER = null;
        public static final int TOKEN_AMOUNT_FIELD_NUMBER = 4;
        public static final int TO_ADDRESS_FIELD_NUMBER = 1;
        public static final int USE_MAX_AMOUNT_FIELD_NUMBER = 5;
        private long amount_;
        private String changeAddress_ = "";
        private long forceFee_;
        private String toAddress_ = "";
        private TokenBundle tokenAmount_;
        private boolean useMaxAmount_;

        public static final class Builder extends GeneratedMessageLite.C4930a<Transfer, Builder> implements TransferOrBuilder {
            public /* synthetic */ Builder(C97301 r1) {
                this();
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((Transfer) this.instance).clearAmount();
                return this;
            }

            public Builder clearChangeAddress() {
                copyOnWrite();
                ((Transfer) this.instance).clearChangeAddress();
                return this;
            }

            public Builder clearForceFee() {
                copyOnWrite();
                ((Transfer) this.instance).clearForceFee();
                return this;
            }

            public Builder clearToAddress() {
                copyOnWrite();
                ((Transfer) this.instance).clearToAddress();
                return this;
            }

            public Builder clearTokenAmount() {
                copyOnWrite();
                ((Transfer) this.instance).clearTokenAmount();
                return this;
            }

            public Builder clearUseMaxAmount() {
                copyOnWrite();
                ((Transfer) this.instance).clearUseMaxAmount();
                return this;
            }

            public long getAmount() {
                return ((Transfer) this.instance).getAmount();
            }

            public String getChangeAddress() {
                return ((Transfer) this.instance).getChangeAddress();
            }

            public ByteString getChangeAddressBytes() {
                return ((Transfer) this.instance).getChangeAddressBytes();
            }

            public long getForceFee() {
                return ((Transfer) this.instance).getForceFee();
            }

            public String getToAddress() {
                return ((Transfer) this.instance).getToAddress();
            }

            public ByteString getToAddressBytes() {
                return ((Transfer) this.instance).getToAddressBytes();
            }

            public TokenBundle getTokenAmount() {
                return ((Transfer) this.instance).getTokenAmount();
            }

            public boolean getUseMaxAmount() {
                return ((Transfer) this.instance).getUseMaxAmount();
            }

            public boolean hasTokenAmount() {
                return ((Transfer) this.instance).hasTokenAmount();
            }

            public Builder mergeTokenAmount(TokenBundle tokenBundle) {
                copyOnWrite();
                ((Transfer) this.instance).mergeTokenAmount(tokenBundle);
                return this;
            }

            public Builder setAmount(long j) {
                copyOnWrite();
                ((Transfer) this.instance).setAmount(j);
                return this;
            }

            public Builder setChangeAddress(String str) {
                copyOnWrite();
                ((Transfer) this.instance).setChangeAddress(str);
                return this;
            }

            public Builder setChangeAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((Transfer) this.instance).setChangeAddressBytes(byteString);
                return this;
            }

            public Builder setForceFee(long j) {
                copyOnWrite();
                ((Transfer) this.instance).setForceFee(j);
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

            public Builder setTokenAmount(TokenBundle tokenBundle) {
                copyOnWrite();
                ((Transfer) this.instance).setTokenAmount(tokenBundle);
                return this;
            }

            public Builder setUseMaxAmount(boolean z) {
                copyOnWrite();
                ((Transfer) this.instance).setUseMaxAmount(z);
                return this;
            }

            private Builder() {
                super(Transfer.DEFAULT_INSTANCE);
            }

            public Builder setTokenAmount(TokenBundle.Builder builder) {
                copyOnWrite();
                ((Transfer) this.instance).setTokenAmount((TokenBundle) builder.build());
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
        public void clearAmount() {
            this.amount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearChangeAddress() {
            this.changeAddress_ = getDefaultInstance().getChangeAddress();
        }

        /* access modifiers changed from: private */
        public void clearForceFee() {
            this.forceFee_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearToAddress() {
            this.toAddress_ = getDefaultInstance().getToAddress();
        }

        /* access modifiers changed from: private */
        public void clearTokenAmount() {
            this.tokenAmount_ = null;
        }

        /* access modifiers changed from: private */
        public void clearUseMaxAmount() {
            this.useMaxAmount_ = false;
        }

        public static Transfer getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeTokenAmount(TokenBundle tokenBundle) {
            tokenBundle.getClass();
            TokenBundle tokenBundle2 = this.tokenAmount_;
            if (tokenBundle2 == null || tokenBundle2 == TokenBundle.getDefaultInstance()) {
                this.tokenAmount_ = tokenBundle;
            } else {
                this.tokenAmount_ = (TokenBundle) ((TokenBundle.Builder) TokenBundle.newBuilder(this.tokenAmount_).mergeFrom(tokenBundle)).buildPartial();
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
        public void setAmount(long j) {
            this.amount_ = j;
        }

        /* access modifiers changed from: private */
        public void setChangeAddress(String str) {
            str.getClass();
            this.changeAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setChangeAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.changeAddress_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setForceFee(long j) {
            this.forceFee_ = j;
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
        public void setTokenAmount(TokenBundle tokenBundle) {
            tokenBundle.getClass();
            this.tokenAmount_ = tokenBundle;
        }

        /* access modifiers changed from: private */
        public void setUseMaxAmount(boolean z) {
            this.useMaxAmount_ = z;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97301.f46546xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Transfer();
                case 2:
                    return new Builder((C97301) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0003\u0004\t\u0005\u0007\u0006\u0003", new Object[]{"toAddress_", "changeAddress_", "amount_", "tokenAmount_", "useMaxAmount_", "forceFee_"});
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

        public String getChangeAddress() {
            return this.changeAddress_;
        }

        public ByteString getChangeAddressBytes() {
            return ByteString.copyFromUtf8(this.changeAddress_);
        }

        public long getForceFee() {
            return this.forceFee_;
        }

        public String getToAddress() {
            return this.toAddress_;
        }

        public ByteString getToAddressBytes() {
            return ByteString.copyFromUtf8(this.toAddress_);
        }

        public TokenBundle getTokenAmount() {
            TokenBundle tokenBundle = this.tokenAmount_;
            if (tokenBundle == null) {
                return TokenBundle.getDefaultInstance();
            }
            return tokenBundle;
        }

        public boolean getUseMaxAmount() {
            return this.useMaxAmount_;
        }

        public boolean hasTokenAmount() {
            if (this.tokenAmount_ != null) {
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
        long getAmount();

        String getChangeAddress();

        ByteString getChangeAddressBytes();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        long getForceFee();

        String getToAddress();

        ByteString getToAddressBytes();

        TokenBundle getTokenAmount();

        boolean getUseMaxAmount();

        boolean hasTokenAmount();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TxInput extends GeneratedMessageLite<TxInput, Builder> implements TxInputOrBuilder {
        public static final int ADDRESS_FIELD_NUMBER = 2;
        public static final int AMOUNT_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final TxInput DEFAULT_INSTANCE;
        public static final int OUT_POINT_FIELD_NUMBER = 1;
        private static volatile im4<TxInput> PARSER = null;
        public static final int TOKEN_AMOUNT_FIELD_NUMBER = 4;
        private String address_ = "";
        private long amount_;
        private OutPoint outPoint_;
        private C5011t.C5020i<TokenAmount> tokenAmount_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.C4930a<TxInput, Builder> implements TxInputOrBuilder {
            public /* synthetic */ Builder(C97301 r1) {
                this();
            }

            public Builder addAllTokenAmount(Iterable<? extends TokenAmount> iterable) {
                copyOnWrite();
                ((TxInput) this.instance).addAllTokenAmount(iterable);
                return this;
            }

            public Builder addTokenAmount(TokenAmount tokenAmount) {
                copyOnWrite();
                ((TxInput) this.instance).addTokenAmount(tokenAmount);
                return this;
            }

            public Builder clearAddress() {
                copyOnWrite();
                ((TxInput) this.instance).clearAddress();
                return this;
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((TxInput) this.instance).clearAmount();
                return this;
            }

            public Builder clearOutPoint() {
                copyOnWrite();
                ((TxInput) this.instance).clearOutPoint();
                return this;
            }

            public Builder clearTokenAmount() {
                copyOnWrite();
                ((TxInput) this.instance).clearTokenAmount();
                return this;
            }

            public String getAddress() {
                return ((TxInput) this.instance).getAddress();
            }

            public ByteString getAddressBytes() {
                return ((TxInput) this.instance).getAddressBytes();
            }

            public long getAmount() {
                return ((TxInput) this.instance).getAmount();
            }

            public OutPoint getOutPoint() {
                return ((TxInput) this.instance).getOutPoint();
            }

            public TokenAmount getTokenAmount(int i) {
                return ((TxInput) this.instance).getTokenAmount(i);
            }

            public int getTokenAmountCount() {
                return ((TxInput) this.instance).getTokenAmountCount();
            }

            public List<TokenAmount> getTokenAmountList() {
                return Collections.unmodifiableList(((TxInput) this.instance).getTokenAmountList());
            }

            public boolean hasOutPoint() {
                return ((TxInput) this.instance).hasOutPoint();
            }

            public Builder mergeOutPoint(OutPoint outPoint) {
                copyOnWrite();
                ((TxInput) this.instance).mergeOutPoint(outPoint);
                return this;
            }

            public Builder removeTokenAmount(int i) {
                copyOnWrite();
                ((TxInput) this.instance).removeTokenAmount(i);
                return this;
            }

            public Builder setAddress(String str) {
                copyOnWrite();
                ((TxInput) this.instance).setAddress(str);
                return this;
            }

            public Builder setAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((TxInput) this.instance).setAddressBytes(byteString);
                return this;
            }

            public Builder setAmount(long j) {
                copyOnWrite();
                ((TxInput) this.instance).setAmount(j);
                return this;
            }

            public Builder setOutPoint(OutPoint outPoint) {
                copyOnWrite();
                ((TxInput) this.instance).setOutPoint(outPoint);
                return this;
            }

            public Builder setTokenAmount(int i, TokenAmount tokenAmount) {
                copyOnWrite();
                ((TxInput) this.instance).setTokenAmount(i, tokenAmount);
                return this;
            }

            private Builder() {
                super(TxInput.DEFAULT_INSTANCE);
            }

            public Builder addTokenAmount(int i, TokenAmount tokenAmount) {
                copyOnWrite();
                ((TxInput) this.instance).addTokenAmount(i, tokenAmount);
                return this;
            }

            public Builder setOutPoint(OutPoint.Builder builder) {
                copyOnWrite();
                ((TxInput) this.instance).setOutPoint((OutPoint) builder.build());
                return this;
            }

            public Builder setTokenAmount(int i, TokenAmount.Builder builder) {
                copyOnWrite();
                ((TxInput) this.instance).setTokenAmount(i, (TokenAmount) builder.build());
                return this;
            }

            public Builder addTokenAmount(TokenAmount.Builder builder) {
                copyOnWrite();
                ((TxInput) this.instance).addTokenAmount((TokenAmount) builder.build());
                return this;
            }

            public Builder addTokenAmount(int i, TokenAmount.Builder builder) {
                copyOnWrite();
                ((TxInput) this.instance).addTokenAmount(i, (TokenAmount) builder.build());
                return this;
            }
        }

        static {
            TxInput txInput = new TxInput();
            DEFAULT_INSTANCE = txInput;
            GeneratedMessageLite.registerDefaultInstance(TxInput.class, txInput);
        }

        private TxInput() {
        }

        /* access modifiers changed from: private */
        public void addAllTokenAmount(Iterable<? extends TokenAmount> iterable) {
            ensureTokenAmountIsMutable();
            C4949a.addAll(iterable, this.tokenAmount_);
        }

        /* access modifiers changed from: private */
        public void addTokenAmount(TokenAmount tokenAmount) {
            tokenAmount.getClass();
            ensureTokenAmountIsMutable();
            this.tokenAmount_.add(tokenAmount);
        }

        /* access modifiers changed from: private */
        public void clearAddress() {
            this.address_ = getDefaultInstance().getAddress();
        }

        /* access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearOutPoint() {
            this.outPoint_ = null;
        }

        /* access modifiers changed from: private */
        public void clearTokenAmount() {
            this.tokenAmount_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureTokenAmountIsMutable() {
            C5011t.C5020i<TokenAmount> iVar = this.tokenAmount_;
            if (!iVar.mo37090v()) {
                this.tokenAmount_ = GeneratedMessageLite.mutableCopy(iVar);
            }
        }

        public static TxInput getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeOutPoint(OutPoint outPoint) {
            outPoint.getClass();
            OutPoint outPoint2 = this.outPoint_;
            if (outPoint2 == null || outPoint2 == OutPoint.getDefaultInstance()) {
                this.outPoint_ = outPoint;
            } else {
                this.outPoint_ = (OutPoint) ((OutPoint.Builder) OutPoint.newBuilder(this.outPoint_).mergeFrom(outPoint)).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TxInput parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TxInput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TxInput parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TxInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<TxInput> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeTokenAmount(int i) {
            ensureTokenAmountIsMutable();
            this.tokenAmount_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setAddress(String str) {
            str.getClass();
            this.address_ = str;
        }

        /* access modifiers changed from: private */
        public void setAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.address_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setAmount(long j) {
            this.amount_ = j;
        }

        /* access modifiers changed from: private */
        public void setOutPoint(OutPoint outPoint) {
            outPoint.getClass();
            this.outPoint_ = outPoint;
        }

        /* access modifiers changed from: private */
        public void setTokenAmount(int i, TokenAmount tokenAmount) {
            tokenAmount.getClass();
            ensureTokenAmountIsMutable();
            this.tokenAmount_.set(i, tokenAmount);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97301.f46546xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TxInput();
                case 2:
                    return new Builder((C97301) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\t\u0002Ȉ\u0003\u0003\u0004\u001b", new Object[]{"outPoint_", "address_", "amount_", "tokenAmount_", TokenAmount.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<TxInput> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (TxInput.class) {
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

        public String getAddress() {
            return this.address_;
        }

        public ByteString getAddressBytes() {
            return ByteString.copyFromUtf8(this.address_);
        }

        public long getAmount() {
            return this.amount_;
        }

        public OutPoint getOutPoint() {
            OutPoint outPoint = this.outPoint_;
            if (outPoint == null) {
                return OutPoint.getDefaultInstance();
            }
            return outPoint;
        }

        public TokenAmount getTokenAmount(int i) {
            return this.tokenAmount_.get(i);
        }

        public int getTokenAmountCount() {
            return this.tokenAmount_.size();
        }

        public List<TokenAmount> getTokenAmountList() {
            return this.tokenAmount_;
        }

        public TokenAmountOrBuilder getTokenAmountOrBuilder(int i) {
            return this.tokenAmount_.get(i);
        }

        public List<? extends TokenAmountOrBuilder> getTokenAmountOrBuilderList() {
            return this.tokenAmount_;
        }

        public boolean hasOutPoint() {
            if (this.outPoint_ != null) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(TxInput txInput) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(txInput);
        }

        public static TxInput parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TxInput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TxInput parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (TxInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static TxInput parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TxInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* access modifiers changed from: private */
        public void addTokenAmount(int i, TokenAmount tokenAmount) {
            tokenAmount.getClass();
            ensureTokenAmountIsMutable();
            this.tokenAmount_.add(i, tokenAmount);
        }

        public static TxInput parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (TxInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static TxInput parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TxInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TxInput parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (TxInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static TxInput parseFrom(InputStream inputStream) throws IOException {
            return (TxInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TxInput parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TxInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TxInput parseFrom(C4969g gVar) throws IOException {
            return (TxInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static TxInput parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (TxInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface TxInputOrBuilder extends qu3 {
        String getAddress();

        ByteString getAddressBytes();

        long getAmount();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        OutPoint getOutPoint();

        TokenAmount getTokenAmount(int i);

        int getTokenAmountCount();

        List<TokenAmount> getTokenAmountList();

        boolean hasOutPoint();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TxOutput extends GeneratedMessageLite<TxOutput, Builder> implements TxOutputOrBuilder {
        public static final int ADDRESS_FIELD_NUMBER = 1;
        public static final int AMOUNT_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final TxOutput DEFAULT_INSTANCE;
        private static volatile im4<TxOutput> PARSER = null;
        public static final int TOKEN_AMOUNT_FIELD_NUMBER = 3;
        private String address_ = "";
        private long amount_;
        private C5011t.C5020i<TokenAmount> tokenAmount_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.C4930a<TxOutput, Builder> implements TxOutputOrBuilder {
            public /* synthetic */ Builder(C97301 r1) {
                this();
            }

            public Builder addAllTokenAmount(Iterable<? extends TokenAmount> iterable) {
                copyOnWrite();
                ((TxOutput) this.instance).addAllTokenAmount(iterable);
                return this;
            }

            public Builder addTokenAmount(TokenAmount tokenAmount) {
                copyOnWrite();
                ((TxOutput) this.instance).addTokenAmount(tokenAmount);
                return this;
            }

            public Builder clearAddress() {
                copyOnWrite();
                ((TxOutput) this.instance).clearAddress();
                return this;
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((TxOutput) this.instance).clearAmount();
                return this;
            }

            public Builder clearTokenAmount() {
                copyOnWrite();
                ((TxOutput) this.instance).clearTokenAmount();
                return this;
            }

            public String getAddress() {
                return ((TxOutput) this.instance).getAddress();
            }

            public ByteString getAddressBytes() {
                return ((TxOutput) this.instance).getAddressBytes();
            }

            public long getAmount() {
                return ((TxOutput) this.instance).getAmount();
            }

            public TokenAmount getTokenAmount(int i) {
                return ((TxOutput) this.instance).getTokenAmount(i);
            }

            public int getTokenAmountCount() {
                return ((TxOutput) this.instance).getTokenAmountCount();
            }

            public List<TokenAmount> getTokenAmountList() {
                return Collections.unmodifiableList(((TxOutput) this.instance).getTokenAmountList());
            }

            public Builder removeTokenAmount(int i) {
                copyOnWrite();
                ((TxOutput) this.instance).removeTokenAmount(i);
                return this;
            }

            public Builder setAddress(String str) {
                copyOnWrite();
                ((TxOutput) this.instance).setAddress(str);
                return this;
            }

            public Builder setAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((TxOutput) this.instance).setAddressBytes(byteString);
                return this;
            }

            public Builder setAmount(long j) {
                copyOnWrite();
                ((TxOutput) this.instance).setAmount(j);
                return this;
            }

            public Builder setTokenAmount(int i, TokenAmount tokenAmount) {
                copyOnWrite();
                ((TxOutput) this.instance).setTokenAmount(i, tokenAmount);
                return this;
            }

            private Builder() {
                super(TxOutput.DEFAULT_INSTANCE);
            }

            public Builder addTokenAmount(int i, TokenAmount tokenAmount) {
                copyOnWrite();
                ((TxOutput) this.instance).addTokenAmount(i, tokenAmount);
                return this;
            }

            public Builder setTokenAmount(int i, TokenAmount.Builder builder) {
                copyOnWrite();
                ((TxOutput) this.instance).setTokenAmount(i, (TokenAmount) builder.build());
                return this;
            }

            public Builder addTokenAmount(TokenAmount.Builder builder) {
                copyOnWrite();
                ((TxOutput) this.instance).addTokenAmount((TokenAmount) builder.build());
                return this;
            }

            public Builder addTokenAmount(int i, TokenAmount.Builder builder) {
                copyOnWrite();
                ((TxOutput) this.instance).addTokenAmount(i, (TokenAmount) builder.build());
                return this;
            }
        }

        static {
            TxOutput txOutput = new TxOutput();
            DEFAULT_INSTANCE = txOutput;
            GeneratedMessageLite.registerDefaultInstance(TxOutput.class, txOutput);
        }

        private TxOutput() {
        }

        /* access modifiers changed from: private */
        public void addAllTokenAmount(Iterable<? extends TokenAmount> iterable) {
            ensureTokenAmountIsMutable();
            C4949a.addAll(iterable, this.tokenAmount_);
        }

        /* access modifiers changed from: private */
        public void addTokenAmount(TokenAmount tokenAmount) {
            tokenAmount.getClass();
            ensureTokenAmountIsMutable();
            this.tokenAmount_.add(tokenAmount);
        }

        /* access modifiers changed from: private */
        public void clearAddress() {
            this.address_ = getDefaultInstance().getAddress();
        }

        /* access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTokenAmount() {
            this.tokenAmount_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureTokenAmountIsMutable() {
            C5011t.C5020i<TokenAmount> iVar = this.tokenAmount_;
            if (!iVar.mo37090v()) {
                this.tokenAmount_ = GeneratedMessageLite.mutableCopy(iVar);
            }
        }

        public static TxOutput getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TxOutput parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TxOutput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TxOutput parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TxOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<TxOutput> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeTokenAmount(int i) {
            ensureTokenAmountIsMutable();
            this.tokenAmount_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setAddress(String str) {
            str.getClass();
            this.address_ = str;
        }

        /* access modifiers changed from: private */
        public void setAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.address_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setAmount(long j) {
            this.amount_ = j;
        }

        /* access modifiers changed from: private */
        public void setTokenAmount(int i, TokenAmount tokenAmount) {
            tokenAmount.getClass();
            ensureTokenAmountIsMutable();
            this.tokenAmount_.set(i, tokenAmount);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97301.f46546xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TxOutput();
                case 2:
                    return new Builder((C97301) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0003\u0003\u001b", new Object[]{"address_", "amount_", "tokenAmount_", TokenAmount.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<TxOutput> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (TxOutput.class) {
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

        public String getAddress() {
            return this.address_;
        }

        public ByteString getAddressBytes() {
            return ByteString.copyFromUtf8(this.address_);
        }

        public long getAmount() {
            return this.amount_;
        }

        public TokenAmount getTokenAmount(int i) {
            return this.tokenAmount_.get(i);
        }

        public int getTokenAmountCount() {
            return this.tokenAmount_.size();
        }

        public List<TokenAmount> getTokenAmountList() {
            return this.tokenAmount_;
        }

        public TokenAmountOrBuilder getTokenAmountOrBuilder(int i) {
            return this.tokenAmount_.get(i);
        }

        public List<? extends TokenAmountOrBuilder> getTokenAmountOrBuilderList() {
            return this.tokenAmount_;
        }

        public static Builder newBuilder(TxOutput txOutput) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(txOutput);
        }

        public static TxOutput parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TxOutput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TxOutput parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (TxOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static TxOutput parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TxOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* access modifiers changed from: private */
        public void addTokenAmount(int i, TokenAmount tokenAmount) {
            tokenAmount.getClass();
            ensureTokenAmountIsMutable();
            this.tokenAmount_.add(i, tokenAmount);
        }

        public static TxOutput parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (TxOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static TxOutput parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TxOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TxOutput parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (TxOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static TxOutput parseFrom(InputStream inputStream) throws IOException {
            return (TxOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TxOutput parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TxOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TxOutput parseFrom(C4969g gVar) throws IOException {
            return (TxOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static TxOutput parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (TxOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface TxOutputOrBuilder extends qu3 {
        String getAddress();

        ByteString getAddressBytes();

        long getAmount();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        TokenAmount getTokenAmount(int i);

        int getTokenAmountCount();

        List<TokenAmount> getTokenAmountList();

        /* synthetic */ boolean isInitialized();
    }

    public static final class Withdraw extends GeneratedMessageLite<Withdraw, Builder> implements WithdrawOrBuilder {
        /* access modifiers changed from: private */
        public static final Withdraw DEFAULT_INSTANCE;
        private static volatile im4<Withdraw> PARSER = null;
        public static final int STAKING_ADDRESS_FIELD_NUMBER = 1;
        public static final int WITHDRAW_AMOUNT_FIELD_NUMBER = 2;
        private String stakingAddress_ = "";
        private long withdrawAmount_;

        public static final class Builder extends GeneratedMessageLite.C4930a<Withdraw, Builder> implements WithdrawOrBuilder {
            public /* synthetic */ Builder(C97301 r1) {
                this();
            }

            public Builder clearStakingAddress() {
                copyOnWrite();
                ((Withdraw) this.instance).clearStakingAddress();
                return this;
            }

            public Builder clearWithdrawAmount() {
                copyOnWrite();
                ((Withdraw) this.instance).clearWithdrawAmount();
                return this;
            }

            public String getStakingAddress() {
                return ((Withdraw) this.instance).getStakingAddress();
            }

            public ByteString getStakingAddressBytes() {
                return ((Withdraw) this.instance).getStakingAddressBytes();
            }

            public long getWithdrawAmount() {
                return ((Withdraw) this.instance).getWithdrawAmount();
            }

            public Builder setStakingAddress(String str) {
                copyOnWrite();
                ((Withdraw) this.instance).setStakingAddress(str);
                return this;
            }

            public Builder setStakingAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((Withdraw) this.instance).setStakingAddressBytes(byteString);
                return this;
            }

            public Builder setWithdrawAmount(long j) {
                copyOnWrite();
                ((Withdraw) this.instance).setWithdrawAmount(j);
                return this;
            }

            private Builder() {
                super(Withdraw.DEFAULT_INSTANCE);
            }
        }

        static {
            Withdraw withdraw = new Withdraw();
            DEFAULT_INSTANCE = withdraw;
            GeneratedMessageLite.registerDefaultInstance(Withdraw.class, withdraw);
        }

        private Withdraw() {
        }

        /* access modifiers changed from: private */
        public void clearStakingAddress() {
            this.stakingAddress_ = getDefaultInstance().getStakingAddress();
        }

        /* access modifiers changed from: private */
        public void clearWithdrawAmount() {
            this.withdrawAmount_ = 0;
        }

        public static Withdraw getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Withdraw parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Withdraw) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Withdraw parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Withdraw) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<Withdraw> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setStakingAddress(String str) {
            str.getClass();
            this.stakingAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setStakingAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.stakingAddress_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setWithdrawAmount(long j) {
            this.withdrawAmount_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97301.f46546xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Withdraw();
                case 2:
                    return new Builder((C97301) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0003", new Object[]{"stakingAddress_", "withdrawAmount_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<Withdraw> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (Withdraw.class) {
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

        public String getStakingAddress() {
            return this.stakingAddress_;
        }

        public ByteString getStakingAddressBytes() {
            return ByteString.copyFromUtf8(this.stakingAddress_);
        }

        public long getWithdrawAmount() {
            return this.withdrawAmount_;
        }

        public static Builder newBuilder(Withdraw withdraw) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(withdraw);
        }

        public static Withdraw parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Withdraw) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Withdraw parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (Withdraw) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static Withdraw parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Withdraw) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Withdraw parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (Withdraw) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static Withdraw parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Withdraw) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Withdraw parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (Withdraw) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static Withdraw parseFrom(InputStream inputStream) throws IOException {
            return (Withdraw) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Withdraw parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Withdraw) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Withdraw parseFrom(C4969g gVar) throws IOException {
            return (Withdraw) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static Withdraw parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (Withdraw) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface WithdrawOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getStakingAddress();

        ByteString getStakingAddressBytes();

        long getWithdrawAmount();

        /* synthetic */ boolean isInitialized();
    }

    private Cardano() {
    }

    public static void registerAllExtensions(C4987l lVar) {
    }
}
