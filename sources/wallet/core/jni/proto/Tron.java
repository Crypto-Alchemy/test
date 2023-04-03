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

public final class Tron {

    /* renamed from: wallet.core.jni.proto.Tron$1 */
    public static /* synthetic */ class C97731 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f46585xa1df5c61;

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
                f46585xa1df5c61 = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f46585xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f46585xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f46585xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f46585xa1df5c61     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f46585xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f46585xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wallet.core.jni.proto.Tron.C97731.<clinit>():void");
        }
    }

    public static final class BlockHeader extends GeneratedMessageLite<BlockHeader, Builder> implements BlockHeaderOrBuilder {
        /* access modifiers changed from: private */
        public static final BlockHeader DEFAULT_INSTANCE;
        public static final int NUMBER_FIELD_NUMBER = 7;
        public static final int PARENT_HASH_FIELD_NUMBER = 3;
        private static volatile im4<BlockHeader> PARSER = null;
        public static final int TIMESTAMP_FIELD_NUMBER = 1;
        public static final int TX_TRIE_ROOT_FIELD_NUMBER = 2;
        public static final int VERSION_FIELD_NUMBER = 10;
        public static final int WITNESS_ADDRESS_FIELD_NUMBER = 9;
        private long number_;
        private ByteString parentHash_;
        private long timestamp_;
        private ByteString txTrieRoot_;
        private int version_;
        private ByteString witnessAddress_;

        public static final class Builder extends GeneratedMessageLite.C4930a<BlockHeader, Builder> implements BlockHeaderOrBuilder {
            public /* synthetic */ Builder(C97731 r1) {
                this();
            }

            public Builder clearNumber() {
                copyOnWrite();
                ((BlockHeader) this.instance).clearNumber();
                return this;
            }

            public Builder clearParentHash() {
                copyOnWrite();
                ((BlockHeader) this.instance).clearParentHash();
                return this;
            }

            public Builder clearTimestamp() {
                copyOnWrite();
                ((BlockHeader) this.instance).clearTimestamp();
                return this;
            }

            public Builder clearTxTrieRoot() {
                copyOnWrite();
                ((BlockHeader) this.instance).clearTxTrieRoot();
                return this;
            }

            public Builder clearVersion() {
                copyOnWrite();
                ((BlockHeader) this.instance).clearVersion();
                return this;
            }

            public Builder clearWitnessAddress() {
                copyOnWrite();
                ((BlockHeader) this.instance).clearWitnessAddress();
                return this;
            }

            public long getNumber() {
                return ((BlockHeader) this.instance).getNumber();
            }

            public ByteString getParentHash() {
                return ((BlockHeader) this.instance).getParentHash();
            }

            public long getTimestamp() {
                return ((BlockHeader) this.instance).getTimestamp();
            }

            public ByteString getTxTrieRoot() {
                return ((BlockHeader) this.instance).getTxTrieRoot();
            }

            public int getVersion() {
                return ((BlockHeader) this.instance).getVersion();
            }

            public ByteString getWitnessAddress() {
                return ((BlockHeader) this.instance).getWitnessAddress();
            }

            public Builder setNumber(long j) {
                copyOnWrite();
                ((BlockHeader) this.instance).setNumber(j);
                return this;
            }

            public Builder setParentHash(ByteString byteString) {
                copyOnWrite();
                ((BlockHeader) this.instance).setParentHash(byteString);
                return this;
            }

            public Builder setTimestamp(long j) {
                copyOnWrite();
                ((BlockHeader) this.instance).setTimestamp(j);
                return this;
            }

            public Builder setTxTrieRoot(ByteString byteString) {
                copyOnWrite();
                ((BlockHeader) this.instance).setTxTrieRoot(byteString);
                return this;
            }

            public Builder setVersion(int i) {
                copyOnWrite();
                ((BlockHeader) this.instance).setVersion(i);
                return this;
            }

            public Builder setWitnessAddress(ByteString byteString) {
                copyOnWrite();
                ((BlockHeader) this.instance).setWitnessAddress(byteString);
                return this;
            }

            private Builder() {
                super(BlockHeader.DEFAULT_INSTANCE);
            }
        }

        static {
            BlockHeader blockHeader = new BlockHeader();
            DEFAULT_INSTANCE = blockHeader;
            GeneratedMessageLite.registerDefaultInstance(BlockHeader.class, blockHeader);
        }

        private BlockHeader() {
            ByteString byteString = ByteString.EMPTY;
            this.txTrieRoot_ = byteString;
            this.parentHash_ = byteString;
            this.witnessAddress_ = byteString;
        }

        /* access modifiers changed from: private */
        public void clearNumber() {
            this.number_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearParentHash() {
            this.parentHash_ = getDefaultInstance().getParentHash();
        }

        /* access modifiers changed from: private */
        public void clearTimestamp() {
            this.timestamp_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTxTrieRoot() {
            this.txTrieRoot_ = getDefaultInstance().getTxTrieRoot();
        }

        /* access modifiers changed from: private */
        public void clearVersion() {
            this.version_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearWitnessAddress() {
            this.witnessAddress_ = getDefaultInstance().getWitnessAddress();
        }

        public static BlockHeader getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static BlockHeader parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (BlockHeader) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BlockHeader parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (BlockHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<BlockHeader> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setNumber(long j) {
            this.number_ = j;
        }

        /* access modifiers changed from: private */
        public void setParentHash(ByteString byteString) {
            byteString.getClass();
            this.parentHash_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setTimestamp(long j) {
            this.timestamp_ = j;
        }

        /* access modifiers changed from: private */
        public void setTxTrieRoot(ByteString byteString) {
            byteString.getClass();
            this.txTrieRoot_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setVersion(int i) {
            this.version_ = i;
        }

        /* access modifiers changed from: private */
        public void setWitnessAddress(ByteString byteString) {
            byteString.getClass();
            this.witnessAddress_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97731.f46585xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new BlockHeader();
                case 2:
                    return new Builder((C97731) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\n\u0006\u0000\u0000\u0000\u0001\u0002\u0002\n\u0003\n\u0007\u0002\t\n\n\u0004", new Object[]{"timestamp_", "txTrieRoot_", "parentHash_", "number_", "witnessAddress_", "version_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<BlockHeader> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (BlockHeader.class) {
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

        public long getNumber() {
            return this.number_;
        }

        public ByteString getParentHash() {
            return this.parentHash_;
        }

        public long getTimestamp() {
            return this.timestamp_;
        }

        public ByteString getTxTrieRoot() {
            return this.txTrieRoot_;
        }

        public int getVersion() {
            return this.version_;
        }

        public ByteString getWitnessAddress() {
            return this.witnessAddress_;
        }

        public static Builder newBuilder(BlockHeader blockHeader) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(blockHeader);
        }

        public static BlockHeader parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (BlockHeader) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static BlockHeader parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (BlockHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static BlockHeader parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (BlockHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static BlockHeader parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (BlockHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static BlockHeader parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BlockHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BlockHeader parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (BlockHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static BlockHeader parseFrom(InputStream inputStream) throws IOException {
            return (BlockHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BlockHeader parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (BlockHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static BlockHeader parseFrom(C4969g gVar) throws IOException {
            return (BlockHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static BlockHeader parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (BlockHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface BlockHeaderOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        long getNumber();

        ByteString getParentHash();

        long getTimestamp();

        ByteString getTxTrieRoot();

        int getVersion();

        ByteString getWitnessAddress();

        /* synthetic */ boolean isInitialized();
    }

    public static final class FreezeBalanceContract extends GeneratedMessageLite<FreezeBalanceContract, Builder> implements FreezeBalanceContractOrBuilder {
        /* access modifiers changed from: private */
        public static final FreezeBalanceContract DEFAULT_INSTANCE;
        public static final int FROZEN_BALANCE_FIELD_NUMBER = 2;
        public static final int FROZEN_DURATION_FIELD_NUMBER = 3;
        public static final int OWNER_ADDRESS_FIELD_NUMBER = 1;
        private static volatile im4<FreezeBalanceContract> PARSER = null;
        public static final int RECEIVER_ADDRESS_FIELD_NUMBER = 15;
        public static final int RESOURCE_FIELD_NUMBER = 10;
        private long frozenBalance_;
        private long frozenDuration_;
        private String ownerAddress_ = "";
        private String receiverAddress_ = "";
        private String resource_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<FreezeBalanceContract, Builder> implements FreezeBalanceContractOrBuilder {
            public /* synthetic */ Builder(C97731 r1) {
                this();
            }

            public Builder clearFrozenBalance() {
                copyOnWrite();
                ((FreezeBalanceContract) this.instance).clearFrozenBalance();
                return this;
            }

            public Builder clearFrozenDuration() {
                copyOnWrite();
                ((FreezeBalanceContract) this.instance).clearFrozenDuration();
                return this;
            }

            public Builder clearOwnerAddress() {
                copyOnWrite();
                ((FreezeBalanceContract) this.instance).clearOwnerAddress();
                return this;
            }

            public Builder clearReceiverAddress() {
                copyOnWrite();
                ((FreezeBalanceContract) this.instance).clearReceiverAddress();
                return this;
            }

            public Builder clearResource() {
                copyOnWrite();
                ((FreezeBalanceContract) this.instance).clearResource();
                return this;
            }

            public long getFrozenBalance() {
                return ((FreezeBalanceContract) this.instance).getFrozenBalance();
            }

            public long getFrozenDuration() {
                return ((FreezeBalanceContract) this.instance).getFrozenDuration();
            }

            public String getOwnerAddress() {
                return ((FreezeBalanceContract) this.instance).getOwnerAddress();
            }

            public ByteString getOwnerAddressBytes() {
                return ((FreezeBalanceContract) this.instance).getOwnerAddressBytes();
            }

            public String getReceiverAddress() {
                return ((FreezeBalanceContract) this.instance).getReceiverAddress();
            }

            public ByteString getReceiverAddressBytes() {
                return ((FreezeBalanceContract) this.instance).getReceiverAddressBytes();
            }

            public String getResource() {
                return ((FreezeBalanceContract) this.instance).getResource();
            }

            public ByteString getResourceBytes() {
                return ((FreezeBalanceContract) this.instance).getResourceBytes();
            }

            public Builder setFrozenBalance(long j) {
                copyOnWrite();
                ((FreezeBalanceContract) this.instance).setFrozenBalance(j);
                return this;
            }

            public Builder setFrozenDuration(long j) {
                copyOnWrite();
                ((FreezeBalanceContract) this.instance).setFrozenDuration(j);
                return this;
            }

            public Builder setOwnerAddress(String str) {
                copyOnWrite();
                ((FreezeBalanceContract) this.instance).setOwnerAddress(str);
                return this;
            }

            public Builder setOwnerAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((FreezeBalanceContract) this.instance).setOwnerAddressBytes(byteString);
                return this;
            }

            public Builder setReceiverAddress(String str) {
                copyOnWrite();
                ((FreezeBalanceContract) this.instance).setReceiverAddress(str);
                return this;
            }

            public Builder setReceiverAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((FreezeBalanceContract) this.instance).setReceiverAddressBytes(byteString);
                return this;
            }

            public Builder setResource(String str) {
                copyOnWrite();
                ((FreezeBalanceContract) this.instance).setResource(str);
                return this;
            }

            public Builder setResourceBytes(ByteString byteString) {
                copyOnWrite();
                ((FreezeBalanceContract) this.instance).setResourceBytes(byteString);
                return this;
            }

            private Builder() {
                super(FreezeBalanceContract.DEFAULT_INSTANCE);
            }
        }

        static {
            FreezeBalanceContract freezeBalanceContract = new FreezeBalanceContract();
            DEFAULT_INSTANCE = freezeBalanceContract;
            GeneratedMessageLite.registerDefaultInstance(FreezeBalanceContract.class, freezeBalanceContract);
        }

        private FreezeBalanceContract() {
        }

        /* access modifiers changed from: private */
        public void clearFrozenBalance() {
            this.frozenBalance_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFrozenDuration() {
            this.frozenDuration_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearOwnerAddress() {
            this.ownerAddress_ = getDefaultInstance().getOwnerAddress();
        }

        /* access modifiers changed from: private */
        public void clearReceiverAddress() {
            this.receiverAddress_ = getDefaultInstance().getReceiverAddress();
        }

        /* access modifiers changed from: private */
        public void clearResource() {
            this.resource_ = getDefaultInstance().getResource();
        }

        public static FreezeBalanceContract getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FreezeBalanceContract parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FreezeBalanceContract) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FreezeBalanceContract parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (FreezeBalanceContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<FreezeBalanceContract> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setFrozenBalance(long j) {
            this.frozenBalance_ = j;
        }

        /* access modifiers changed from: private */
        public void setFrozenDuration(long j) {
            this.frozenDuration_ = j;
        }

        /* access modifiers changed from: private */
        public void setOwnerAddress(String str) {
            str.getClass();
            this.ownerAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setOwnerAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.ownerAddress_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setReceiverAddress(String str) {
            str.getClass();
            this.receiverAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setReceiverAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.receiverAddress_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setResource(String str) {
            str.getClass();
            this.resource_ = str;
        }

        /* access modifiers changed from: private */
        public void setResourceBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.resource_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97731.f46585xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new FreezeBalanceContract();
                case 2:
                    return new Builder((C97731) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u000f\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\nȈ\u000fȈ", new Object[]{"ownerAddress_", "frozenBalance_", "frozenDuration_", "resource_", "receiverAddress_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<FreezeBalanceContract> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (FreezeBalanceContract.class) {
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

        public long getFrozenBalance() {
            return this.frozenBalance_;
        }

        public long getFrozenDuration() {
            return this.frozenDuration_;
        }

        public String getOwnerAddress() {
            return this.ownerAddress_;
        }

        public ByteString getOwnerAddressBytes() {
            return ByteString.copyFromUtf8(this.ownerAddress_);
        }

        public String getReceiverAddress() {
            return this.receiverAddress_;
        }

        public ByteString getReceiverAddressBytes() {
            return ByteString.copyFromUtf8(this.receiverAddress_);
        }

        public String getResource() {
            return this.resource_;
        }

        public ByteString getResourceBytes() {
            return ByteString.copyFromUtf8(this.resource_);
        }

        public static Builder newBuilder(FreezeBalanceContract freezeBalanceContract) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(freezeBalanceContract);
        }

        public static FreezeBalanceContract parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (FreezeBalanceContract) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static FreezeBalanceContract parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (FreezeBalanceContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static FreezeBalanceContract parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (FreezeBalanceContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static FreezeBalanceContract parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (FreezeBalanceContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static FreezeBalanceContract parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (FreezeBalanceContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FreezeBalanceContract parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (FreezeBalanceContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static FreezeBalanceContract parseFrom(InputStream inputStream) throws IOException {
            return (FreezeBalanceContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FreezeBalanceContract parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (FreezeBalanceContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static FreezeBalanceContract parseFrom(C4969g gVar) throws IOException {
            return (FreezeBalanceContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static FreezeBalanceContract parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (FreezeBalanceContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface FreezeBalanceContractOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        long getFrozenBalance();

        long getFrozenDuration();

        String getOwnerAddress();

        ByteString getOwnerAddressBytes();

        String getReceiverAddress();

        ByteString getReceiverAddressBytes();

        String getResource();

        ByteString getResourceBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SigningInput extends GeneratedMessageLite<SigningInput, Builder> implements SigningInputOrBuilder {
        /* access modifiers changed from: private */
        public static final SigningInput DEFAULT_INSTANCE;
        private static volatile im4<SigningInput> PARSER = null;
        public static final int PRIVATE_KEY_FIELD_NUMBER = 2;
        public static final int TRANSACTION_FIELD_NUMBER = 1;
        private ByteString privateKey_ = ByteString.EMPTY;
        private Transaction transaction_;

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningInput, Builder> implements SigningInputOrBuilder {
            public /* synthetic */ Builder(C97731 r1) {
                this();
            }

            public Builder clearPrivateKey() {
                copyOnWrite();
                ((SigningInput) this.instance).clearPrivateKey();
                return this;
            }

            public Builder clearTransaction() {
                copyOnWrite();
                ((SigningInput) this.instance).clearTransaction();
                return this;
            }

            public ByteString getPrivateKey() {
                return ((SigningInput) this.instance).getPrivateKey();
            }

            public Transaction getTransaction() {
                return ((SigningInput) this.instance).getTransaction();
            }

            public boolean hasTransaction() {
                return ((SigningInput) this.instance).hasTransaction();
            }

            public Builder mergeTransaction(Transaction transaction) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeTransaction(transaction);
                return this;
            }

            public Builder setPrivateKey(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setPrivateKey(byteString);
                return this;
            }

            public Builder setTransaction(Transaction transaction) {
                copyOnWrite();
                ((SigningInput) this.instance).setTransaction(transaction);
                return this;
            }

            private Builder() {
                super(SigningInput.DEFAULT_INSTANCE);
            }

            public Builder setTransaction(Transaction.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setTransaction((Transaction) builder.build());
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
        public void clearPrivateKey() {
            this.privateKey_ = getDefaultInstance().getPrivateKey();
        }

        /* access modifiers changed from: private */
        public void clearTransaction() {
            this.transaction_ = null;
        }

        public static SigningInput getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeTransaction(Transaction transaction) {
            transaction.getClass();
            Transaction transaction2 = this.transaction_;
            if (transaction2 == null || transaction2 == Transaction.getDefaultInstance()) {
                this.transaction_ = transaction;
            } else {
                this.transaction_ = (Transaction) ((Transaction.Builder) Transaction.newBuilder(this.transaction_).mergeFrom(transaction)).buildPartial();
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
        public void setPrivateKey(ByteString byteString) {
            byteString.getClass();
            this.privateKey_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setTransaction(Transaction transaction) {
            transaction.getClass();
            this.transaction_ = transaction;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97731.f46585xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningInput();
                case 2:
                    return new Builder((C97731) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\n", new Object[]{"transaction_", "privateKey_"});
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

        public ByteString getPrivateKey() {
            return this.privateKey_;
        }

        public Transaction getTransaction() {
            Transaction transaction = this.transaction_;
            if (transaction == null) {
                return Transaction.getDefaultInstance();
            }
            return transaction;
        }

        public boolean hasTransaction() {
            if (this.transaction_ != null) {
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
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        ByteString getPrivateKey();

        Transaction getTransaction();

        boolean hasTransaction();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SigningOutput extends GeneratedMessageLite<SigningOutput, Builder> implements SigningOutputOrBuilder {
        /* access modifiers changed from: private */
        public static final SigningOutput DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int JSON_FIELD_NUMBER = 5;
        private static volatile im4<SigningOutput> PARSER = null;
        public static final int REF_BLOCK_BYTES_FIELD_NUMBER = 3;
        public static final int REF_BLOCK_HASH_FIELD_NUMBER = 4;
        public static final int SIGNATURE_FIELD_NUMBER = 2;
        private ByteString id_;
        private String json_ = "";
        private ByteString refBlockBytes_;
        private ByteString refBlockHash_;
        private ByteString signature_;

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningOutput, Builder> implements SigningOutputOrBuilder {
            public /* synthetic */ Builder(C97731 r1) {
                this();
            }

            public Builder clearId() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearId();
                return this;
            }

            public Builder clearJson() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearJson();
                return this;
            }

            public Builder clearRefBlockBytes() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearRefBlockBytes();
                return this;
            }

            public Builder clearRefBlockHash() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearRefBlockHash();
                return this;
            }

            public Builder clearSignature() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearSignature();
                return this;
            }

            public ByteString getId() {
                return ((SigningOutput) this.instance).getId();
            }

            public String getJson() {
                return ((SigningOutput) this.instance).getJson();
            }

            public ByteString getJsonBytes() {
                return ((SigningOutput) this.instance).getJsonBytes();
            }

            public ByteString getRefBlockBytes() {
                return ((SigningOutput) this.instance).getRefBlockBytes();
            }

            public ByteString getRefBlockHash() {
                return ((SigningOutput) this.instance).getRefBlockHash();
            }

            public ByteString getSignature() {
                return ((SigningOutput) this.instance).getSignature();
            }

            public Builder setId(ByteString byteString) {
                copyOnWrite();
                ((SigningOutput) this.instance).setId(byteString);
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

            public Builder setRefBlockBytes(ByteString byteString) {
                copyOnWrite();
                ((SigningOutput) this.instance).setRefBlockBytes(byteString);
                return this;
            }

            public Builder setRefBlockHash(ByteString byteString) {
                copyOnWrite();
                ((SigningOutput) this.instance).setRefBlockHash(byteString);
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
            ByteString byteString = ByteString.EMPTY;
            this.id_ = byteString;
            this.signature_ = byteString;
            this.refBlockBytes_ = byteString;
            this.refBlockHash_ = byteString;
        }

        /* access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* access modifiers changed from: private */
        public void clearJson() {
            this.json_ = getDefaultInstance().getJson();
        }

        /* access modifiers changed from: private */
        public void clearRefBlockBytes() {
            this.refBlockBytes_ = getDefaultInstance().getRefBlockBytes();
        }

        /* access modifiers changed from: private */
        public void clearRefBlockHash() {
            this.refBlockHash_ = getDefaultInstance().getRefBlockHash();
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
        public void setId(ByteString byteString) {
            byteString.getClass();
            this.id_ = byteString;
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
        public void setRefBlockBytes(ByteString byteString) {
            byteString.getClass();
            this.refBlockBytes_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setRefBlockHash(ByteString byteString) {
            byteString.getClass();
            this.refBlockHash_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setSignature(ByteString byteString) {
            byteString.getClass();
            this.signature_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97731.f46585xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningOutput();
                case 2:
                    return new Builder((C97731) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\n\u0002\n\u0003\n\u0004\n\u0005Ȉ", new Object[]{"id_", "signature_", "refBlockBytes_", "refBlockHash_", "json_"});
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

        public ByteString getId() {
            return this.id_;
        }

        public String getJson() {
            return this.json_;
        }

        public ByteString getJsonBytes() {
            return ByteString.copyFromUtf8(this.json_);
        }

        public ByteString getRefBlockBytes() {
            return this.refBlockBytes_;
        }

        public ByteString getRefBlockHash() {
            return this.refBlockHash_;
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

        ByteString getId();

        String getJson();

        ByteString getJsonBytes();

        ByteString getRefBlockBytes();

        ByteString getRefBlockHash();

        ByteString getSignature();

        /* synthetic */ boolean isInitialized();
    }

    public static final class Transaction extends GeneratedMessageLite<Transaction, Builder> implements TransactionOrBuilder {
        public static final int BLOCK_HEADER_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final Transaction DEFAULT_INSTANCE;
        public static final int EXPIRATION_FIELD_NUMBER = 2;
        public static final int FEE_LIMIT_FIELD_NUMBER = 4;
        public static final int FREEZE_BALANCE_FIELD_NUMBER = 12;
        private static volatile im4<Transaction> PARSER = null;
        public static final int TIMESTAMP_FIELD_NUMBER = 1;
        public static final int TRANSFER_ASSET_FIELD_NUMBER = 11;
        public static final int TRANSFER_FIELD_NUMBER = 10;
        public static final int TRANSFER_TRC20_CONTRACT_FIELD_NUMBER = 19;
        public static final int TRIGGER_SMART_CONTRACT_FIELD_NUMBER = 18;
        public static final int UNFREEZE_ASSET_FIELD_NUMBER = 14;
        public static final int UNFREEZE_BALANCE_FIELD_NUMBER = 13;
        public static final int VOTE_ASSET_FIELD_NUMBER = 16;
        public static final int VOTE_WITNESS_FIELD_NUMBER = 17;
        public static final int WITHDRAW_BALANCE_FIELD_NUMBER = 15;
        private BlockHeader blockHeader_;
        private int contractOneofCase_ = 0;
        private Object contractOneof_;
        private long expiration_;
        private long feeLimit_;
        private long timestamp_;

        public static final class Builder extends GeneratedMessageLite.C4930a<Transaction, Builder> implements TransactionOrBuilder {
            public /* synthetic */ Builder(C97731 r1) {
                this();
            }

            public Builder clearBlockHeader() {
                copyOnWrite();
                ((Transaction) this.instance).clearBlockHeader();
                return this;
            }

            public Builder clearContractOneof() {
                copyOnWrite();
                ((Transaction) this.instance).clearContractOneof();
                return this;
            }

            public Builder clearExpiration() {
                copyOnWrite();
                ((Transaction) this.instance).clearExpiration();
                return this;
            }

            public Builder clearFeeLimit() {
                copyOnWrite();
                ((Transaction) this.instance).clearFeeLimit();
                return this;
            }

            public Builder clearFreezeBalance() {
                copyOnWrite();
                ((Transaction) this.instance).clearFreezeBalance();
                return this;
            }

            public Builder clearTimestamp() {
                copyOnWrite();
                ((Transaction) this.instance).clearTimestamp();
                return this;
            }

            public Builder clearTransfer() {
                copyOnWrite();
                ((Transaction) this.instance).clearTransfer();
                return this;
            }

            public Builder clearTransferAsset() {
                copyOnWrite();
                ((Transaction) this.instance).clearTransferAsset();
                return this;
            }

            public Builder clearTransferTrc20Contract() {
                copyOnWrite();
                ((Transaction) this.instance).clearTransferTrc20Contract();
                return this;
            }

            public Builder clearTriggerSmartContract() {
                copyOnWrite();
                ((Transaction) this.instance).clearTriggerSmartContract();
                return this;
            }

            public Builder clearUnfreezeAsset() {
                copyOnWrite();
                ((Transaction) this.instance).clearUnfreezeAsset();
                return this;
            }

            public Builder clearUnfreezeBalance() {
                copyOnWrite();
                ((Transaction) this.instance).clearUnfreezeBalance();
                return this;
            }

            public Builder clearVoteAsset() {
                copyOnWrite();
                ((Transaction) this.instance).clearVoteAsset();
                return this;
            }

            public Builder clearVoteWitness() {
                copyOnWrite();
                ((Transaction) this.instance).clearVoteWitness();
                return this;
            }

            public Builder clearWithdrawBalance() {
                copyOnWrite();
                ((Transaction) this.instance).clearWithdrawBalance();
                return this;
            }

            public BlockHeader getBlockHeader() {
                return ((Transaction) this.instance).getBlockHeader();
            }

            public ContractOneofCase getContractOneofCase() {
                return ((Transaction) this.instance).getContractOneofCase();
            }

            public long getExpiration() {
                return ((Transaction) this.instance).getExpiration();
            }

            public long getFeeLimit() {
                return ((Transaction) this.instance).getFeeLimit();
            }

            public FreezeBalanceContract getFreezeBalance() {
                return ((Transaction) this.instance).getFreezeBalance();
            }

            public long getTimestamp() {
                return ((Transaction) this.instance).getTimestamp();
            }

            public TransferContract getTransfer() {
                return ((Transaction) this.instance).getTransfer();
            }

            public TransferAssetContract getTransferAsset() {
                return ((Transaction) this.instance).getTransferAsset();
            }

            public TransferTRC20Contract getTransferTrc20Contract() {
                return ((Transaction) this.instance).getTransferTrc20Contract();
            }

            public TriggerSmartContract getTriggerSmartContract() {
                return ((Transaction) this.instance).getTriggerSmartContract();
            }

            public UnfreezeAssetContract getUnfreezeAsset() {
                return ((Transaction) this.instance).getUnfreezeAsset();
            }

            public UnfreezeBalanceContract getUnfreezeBalance() {
                return ((Transaction) this.instance).getUnfreezeBalance();
            }

            public VoteAssetContract getVoteAsset() {
                return ((Transaction) this.instance).getVoteAsset();
            }

            public VoteWitnessContract getVoteWitness() {
                return ((Transaction) this.instance).getVoteWitness();
            }

            public WithdrawBalanceContract getWithdrawBalance() {
                return ((Transaction) this.instance).getWithdrawBalance();
            }

            public boolean hasBlockHeader() {
                return ((Transaction) this.instance).hasBlockHeader();
            }

            public boolean hasFreezeBalance() {
                return ((Transaction) this.instance).hasFreezeBalance();
            }

            public boolean hasTransfer() {
                return ((Transaction) this.instance).hasTransfer();
            }

            public boolean hasTransferAsset() {
                return ((Transaction) this.instance).hasTransferAsset();
            }

            public boolean hasTransferTrc20Contract() {
                return ((Transaction) this.instance).hasTransferTrc20Contract();
            }

            public boolean hasTriggerSmartContract() {
                return ((Transaction) this.instance).hasTriggerSmartContract();
            }

            public boolean hasUnfreezeAsset() {
                return ((Transaction) this.instance).hasUnfreezeAsset();
            }

            public boolean hasUnfreezeBalance() {
                return ((Transaction) this.instance).hasUnfreezeBalance();
            }

            public boolean hasVoteAsset() {
                return ((Transaction) this.instance).hasVoteAsset();
            }

            public boolean hasVoteWitness() {
                return ((Transaction) this.instance).hasVoteWitness();
            }

            public boolean hasWithdrawBalance() {
                return ((Transaction) this.instance).hasWithdrawBalance();
            }

            public Builder mergeBlockHeader(BlockHeader blockHeader) {
                copyOnWrite();
                ((Transaction) this.instance).mergeBlockHeader(blockHeader);
                return this;
            }

            public Builder mergeFreezeBalance(FreezeBalanceContract freezeBalanceContract) {
                copyOnWrite();
                ((Transaction) this.instance).mergeFreezeBalance(freezeBalanceContract);
                return this;
            }

            public Builder mergeTransfer(TransferContract transferContract) {
                copyOnWrite();
                ((Transaction) this.instance).mergeTransfer(transferContract);
                return this;
            }

            public Builder mergeTransferAsset(TransferAssetContract transferAssetContract) {
                copyOnWrite();
                ((Transaction) this.instance).mergeTransferAsset(transferAssetContract);
                return this;
            }

            public Builder mergeTransferTrc20Contract(TransferTRC20Contract transferTRC20Contract) {
                copyOnWrite();
                ((Transaction) this.instance).mergeTransferTrc20Contract(transferTRC20Contract);
                return this;
            }

            public Builder mergeTriggerSmartContract(TriggerSmartContract triggerSmartContract) {
                copyOnWrite();
                ((Transaction) this.instance).mergeTriggerSmartContract(triggerSmartContract);
                return this;
            }

            public Builder mergeUnfreezeAsset(UnfreezeAssetContract unfreezeAssetContract) {
                copyOnWrite();
                ((Transaction) this.instance).mergeUnfreezeAsset(unfreezeAssetContract);
                return this;
            }

            public Builder mergeUnfreezeBalance(UnfreezeBalanceContract unfreezeBalanceContract) {
                copyOnWrite();
                ((Transaction) this.instance).mergeUnfreezeBalance(unfreezeBalanceContract);
                return this;
            }

            public Builder mergeVoteAsset(VoteAssetContract voteAssetContract) {
                copyOnWrite();
                ((Transaction) this.instance).mergeVoteAsset(voteAssetContract);
                return this;
            }

            public Builder mergeVoteWitness(VoteWitnessContract voteWitnessContract) {
                copyOnWrite();
                ((Transaction) this.instance).mergeVoteWitness(voteWitnessContract);
                return this;
            }

            public Builder mergeWithdrawBalance(WithdrawBalanceContract withdrawBalanceContract) {
                copyOnWrite();
                ((Transaction) this.instance).mergeWithdrawBalance(withdrawBalanceContract);
                return this;
            }

            public Builder setBlockHeader(BlockHeader blockHeader) {
                copyOnWrite();
                ((Transaction) this.instance).setBlockHeader(blockHeader);
                return this;
            }

            public Builder setExpiration(long j) {
                copyOnWrite();
                ((Transaction) this.instance).setExpiration(j);
                return this;
            }

            public Builder setFeeLimit(long j) {
                copyOnWrite();
                ((Transaction) this.instance).setFeeLimit(j);
                return this;
            }

            public Builder setFreezeBalance(FreezeBalanceContract freezeBalanceContract) {
                copyOnWrite();
                ((Transaction) this.instance).setFreezeBalance(freezeBalanceContract);
                return this;
            }

            public Builder setTimestamp(long j) {
                copyOnWrite();
                ((Transaction) this.instance).setTimestamp(j);
                return this;
            }

            public Builder setTransfer(TransferContract transferContract) {
                copyOnWrite();
                ((Transaction) this.instance).setTransfer(transferContract);
                return this;
            }

            public Builder setTransferAsset(TransferAssetContract transferAssetContract) {
                copyOnWrite();
                ((Transaction) this.instance).setTransferAsset(transferAssetContract);
                return this;
            }

            public Builder setTransferTrc20Contract(TransferTRC20Contract transferTRC20Contract) {
                copyOnWrite();
                ((Transaction) this.instance).setTransferTrc20Contract(transferTRC20Contract);
                return this;
            }

            public Builder setTriggerSmartContract(TriggerSmartContract triggerSmartContract) {
                copyOnWrite();
                ((Transaction) this.instance).setTriggerSmartContract(triggerSmartContract);
                return this;
            }

            public Builder setUnfreezeAsset(UnfreezeAssetContract unfreezeAssetContract) {
                copyOnWrite();
                ((Transaction) this.instance).setUnfreezeAsset(unfreezeAssetContract);
                return this;
            }

            public Builder setUnfreezeBalance(UnfreezeBalanceContract unfreezeBalanceContract) {
                copyOnWrite();
                ((Transaction) this.instance).setUnfreezeBalance(unfreezeBalanceContract);
                return this;
            }

            public Builder setVoteAsset(VoteAssetContract voteAssetContract) {
                copyOnWrite();
                ((Transaction) this.instance).setVoteAsset(voteAssetContract);
                return this;
            }

            public Builder setVoteWitness(VoteWitnessContract voteWitnessContract) {
                copyOnWrite();
                ((Transaction) this.instance).setVoteWitness(voteWitnessContract);
                return this;
            }

            public Builder setWithdrawBalance(WithdrawBalanceContract withdrawBalanceContract) {
                copyOnWrite();
                ((Transaction) this.instance).setWithdrawBalance(withdrawBalanceContract);
                return this;
            }

            private Builder() {
                super(Transaction.DEFAULT_INSTANCE);
            }

            public Builder setBlockHeader(BlockHeader.Builder builder) {
                copyOnWrite();
                ((Transaction) this.instance).setBlockHeader((BlockHeader) builder.build());
                return this;
            }

            public Builder setFreezeBalance(FreezeBalanceContract.Builder builder) {
                copyOnWrite();
                ((Transaction) this.instance).setFreezeBalance((FreezeBalanceContract) builder.build());
                return this;
            }

            public Builder setTransfer(TransferContract.Builder builder) {
                copyOnWrite();
                ((Transaction) this.instance).setTransfer((TransferContract) builder.build());
                return this;
            }

            public Builder setTransferAsset(TransferAssetContract.Builder builder) {
                copyOnWrite();
                ((Transaction) this.instance).setTransferAsset((TransferAssetContract) builder.build());
                return this;
            }

            public Builder setTransferTrc20Contract(TransferTRC20Contract.Builder builder) {
                copyOnWrite();
                ((Transaction) this.instance).setTransferTrc20Contract((TransferTRC20Contract) builder.build());
                return this;
            }

            public Builder setTriggerSmartContract(TriggerSmartContract.Builder builder) {
                copyOnWrite();
                ((Transaction) this.instance).setTriggerSmartContract((TriggerSmartContract) builder.build());
                return this;
            }

            public Builder setUnfreezeAsset(UnfreezeAssetContract.Builder builder) {
                copyOnWrite();
                ((Transaction) this.instance).setUnfreezeAsset((UnfreezeAssetContract) builder.build());
                return this;
            }

            public Builder setUnfreezeBalance(UnfreezeBalanceContract.Builder builder) {
                copyOnWrite();
                ((Transaction) this.instance).setUnfreezeBalance((UnfreezeBalanceContract) builder.build());
                return this;
            }

            public Builder setVoteAsset(VoteAssetContract.Builder builder) {
                copyOnWrite();
                ((Transaction) this.instance).setVoteAsset((VoteAssetContract) builder.build());
                return this;
            }

            public Builder setVoteWitness(VoteWitnessContract.Builder builder) {
                copyOnWrite();
                ((Transaction) this.instance).setVoteWitness((VoteWitnessContract) builder.build());
                return this;
            }

            public Builder setWithdrawBalance(WithdrawBalanceContract.Builder builder) {
                copyOnWrite();
                ((Transaction) this.instance).setWithdrawBalance((WithdrawBalanceContract) builder.build());
                return this;
            }
        }

        public enum ContractOneofCase {
            TRANSFER(10),
            TRANSFER_ASSET(11),
            FREEZE_BALANCE(12),
            UNFREEZE_BALANCE(13),
            UNFREEZE_ASSET(14),
            WITHDRAW_BALANCE(15),
            VOTE_ASSET(16),
            VOTE_WITNESS(17),
            TRIGGER_SMART_CONTRACT(18),
            TRANSFER_TRC20_CONTRACT(19),
            CONTRACTONEOF_NOT_SET(0);
            
            private final int value;

            private ContractOneofCase(int i) {
                this.value = i;
            }

            public static ContractOneofCase forNumber(int i) {
                if (i == 0) {
                    return CONTRACTONEOF_NOT_SET;
                }
                switch (i) {
                    case 10:
                        return TRANSFER;
                    case 11:
                        return TRANSFER_ASSET;
                    case 12:
                        return FREEZE_BALANCE;
                    case 13:
                        return UNFREEZE_BALANCE;
                    case 14:
                        return UNFREEZE_ASSET;
                    case 15:
                        return WITHDRAW_BALANCE;
                    case 16:
                        return VOTE_ASSET;
                    case 17:
                        return VOTE_WITNESS;
                    case 18:
                        return TRIGGER_SMART_CONTRACT;
                    case 19:
                        return TRANSFER_TRC20_CONTRACT;
                    default:
                        return null;
                }
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static ContractOneofCase valueOf(int i) {
                return forNumber(i);
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
        public void clearBlockHeader() {
            this.blockHeader_ = null;
        }

        /* access modifiers changed from: private */
        public void clearContractOneof() {
            this.contractOneofCase_ = 0;
            this.contractOneof_ = null;
        }

        /* access modifiers changed from: private */
        public void clearExpiration() {
            this.expiration_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFeeLimit() {
            this.feeLimit_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFreezeBalance() {
            if (this.contractOneofCase_ == 12) {
                this.contractOneofCase_ = 0;
                this.contractOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearTimestamp() {
            this.timestamp_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTransfer() {
            if (this.contractOneofCase_ == 10) {
                this.contractOneofCase_ = 0;
                this.contractOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearTransferAsset() {
            if (this.contractOneofCase_ == 11) {
                this.contractOneofCase_ = 0;
                this.contractOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearTransferTrc20Contract() {
            if (this.contractOneofCase_ == 19) {
                this.contractOneofCase_ = 0;
                this.contractOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearTriggerSmartContract() {
            if (this.contractOneofCase_ == 18) {
                this.contractOneofCase_ = 0;
                this.contractOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearUnfreezeAsset() {
            if (this.contractOneofCase_ == 14) {
                this.contractOneofCase_ = 0;
                this.contractOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearUnfreezeBalance() {
            if (this.contractOneofCase_ == 13) {
                this.contractOneofCase_ = 0;
                this.contractOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearVoteAsset() {
            if (this.contractOneofCase_ == 16) {
                this.contractOneofCase_ = 0;
                this.contractOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearVoteWitness() {
            if (this.contractOneofCase_ == 17) {
                this.contractOneofCase_ = 0;
                this.contractOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearWithdrawBalance() {
            if (this.contractOneofCase_ == 15) {
                this.contractOneofCase_ = 0;
                this.contractOneof_ = null;
            }
        }

        public static Transaction getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeBlockHeader(BlockHeader blockHeader) {
            blockHeader.getClass();
            BlockHeader blockHeader2 = this.blockHeader_;
            if (blockHeader2 == null || blockHeader2 == BlockHeader.getDefaultInstance()) {
                this.blockHeader_ = blockHeader;
            } else {
                this.blockHeader_ = (BlockHeader) ((BlockHeader.Builder) BlockHeader.newBuilder(this.blockHeader_).mergeFrom(blockHeader)).buildPartial();
            }
        }

        /* access modifiers changed from: private */
        public void mergeFreezeBalance(FreezeBalanceContract freezeBalanceContract) {
            freezeBalanceContract.getClass();
            if (this.contractOneofCase_ != 12 || this.contractOneof_ == FreezeBalanceContract.getDefaultInstance()) {
                this.contractOneof_ = freezeBalanceContract;
            } else {
                this.contractOneof_ = ((FreezeBalanceContract.Builder) FreezeBalanceContract.newBuilder((FreezeBalanceContract) this.contractOneof_).mergeFrom(freezeBalanceContract)).buildPartial();
            }
            this.contractOneofCase_ = 12;
        }

        /* access modifiers changed from: private */
        public void mergeTransfer(TransferContract transferContract) {
            transferContract.getClass();
            if (this.contractOneofCase_ != 10 || this.contractOneof_ == TransferContract.getDefaultInstance()) {
                this.contractOneof_ = transferContract;
            } else {
                this.contractOneof_ = ((TransferContract.Builder) TransferContract.newBuilder((TransferContract) this.contractOneof_).mergeFrom(transferContract)).buildPartial();
            }
            this.contractOneofCase_ = 10;
        }

        /* access modifiers changed from: private */
        public void mergeTransferAsset(TransferAssetContract transferAssetContract) {
            transferAssetContract.getClass();
            if (this.contractOneofCase_ != 11 || this.contractOneof_ == TransferAssetContract.getDefaultInstance()) {
                this.contractOneof_ = transferAssetContract;
            } else {
                this.contractOneof_ = ((TransferAssetContract.Builder) TransferAssetContract.newBuilder((TransferAssetContract) this.contractOneof_).mergeFrom(transferAssetContract)).buildPartial();
            }
            this.contractOneofCase_ = 11;
        }

        /* access modifiers changed from: private */
        public void mergeTransferTrc20Contract(TransferTRC20Contract transferTRC20Contract) {
            transferTRC20Contract.getClass();
            if (this.contractOneofCase_ != 19 || this.contractOneof_ == TransferTRC20Contract.getDefaultInstance()) {
                this.contractOneof_ = transferTRC20Contract;
            } else {
                this.contractOneof_ = ((TransferTRC20Contract.Builder) TransferTRC20Contract.newBuilder((TransferTRC20Contract) this.contractOneof_).mergeFrom(transferTRC20Contract)).buildPartial();
            }
            this.contractOneofCase_ = 19;
        }

        /* access modifiers changed from: private */
        public void mergeTriggerSmartContract(TriggerSmartContract triggerSmartContract) {
            triggerSmartContract.getClass();
            if (this.contractOneofCase_ != 18 || this.contractOneof_ == TriggerSmartContract.getDefaultInstance()) {
                this.contractOneof_ = triggerSmartContract;
            } else {
                this.contractOneof_ = ((TriggerSmartContract.Builder) TriggerSmartContract.newBuilder((TriggerSmartContract) this.contractOneof_).mergeFrom(triggerSmartContract)).buildPartial();
            }
            this.contractOneofCase_ = 18;
        }

        /* access modifiers changed from: private */
        public void mergeUnfreezeAsset(UnfreezeAssetContract unfreezeAssetContract) {
            unfreezeAssetContract.getClass();
            if (this.contractOneofCase_ != 14 || this.contractOneof_ == UnfreezeAssetContract.getDefaultInstance()) {
                this.contractOneof_ = unfreezeAssetContract;
            } else {
                this.contractOneof_ = ((UnfreezeAssetContract.Builder) UnfreezeAssetContract.newBuilder((UnfreezeAssetContract) this.contractOneof_).mergeFrom(unfreezeAssetContract)).buildPartial();
            }
            this.contractOneofCase_ = 14;
        }

        /* access modifiers changed from: private */
        public void mergeUnfreezeBalance(UnfreezeBalanceContract unfreezeBalanceContract) {
            unfreezeBalanceContract.getClass();
            if (this.contractOneofCase_ != 13 || this.contractOneof_ == UnfreezeBalanceContract.getDefaultInstance()) {
                this.contractOneof_ = unfreezeBalanceContract;
            } else {
                this.contractOneof_ = ((UnfreezeBalanceContract.Builder) UnfreezeBalanceContract.newBuilder((UnfreezeBalanceContract) this.contractOneof_).mergeFrom(unfreezeBalanceContract)).buildPartial();
            }
            this.contractOneofCase_ = 13;
        }

        /* access modifiers changed from: private */
        public void mergeVoteAsset(VoteAssetContract voteAssetContract) {
            voteAssetContract.getClass();
            if (this.contractOneofCase_ != 16 || this.contractOneof_ == VoteAssetContract.getDefaultInstance()) {
                this.contractOneof_ = voteAssetContract;
            } else {
                this.contractOneof_ = ((VoteAssetContract.Builder) VoteAssetContract.newBuilder((VoteAssetContract) this.contractOneof_).mergeFrom(voteAssetContract)).buildPartial();
            }
            this.contractOneofCase_ = 16;
        }

        /* access modifiers changed from: private */
        public void mergeVoteWitness(VoteWitnessContract voteWitnessContract) {
            voteWitnessContract.getClass();
            if (this.contractOneofCase_ != 17 || this.contractOneof_ == VoteWitnessContract.getDefaultInstance()) {
                this.contractOneof_ = voteWitnessContract;
            } else {
                this.contractOneof_ = ((VoteWitnessContract.Builder) VoteWitnessContract.newBuilder((VoteWitnessContract) this.contractOneof_).mergeFrom(voteWitnessContract)).buildPartial();
            }
            this.contractOneofCase_ = 17;
        }

        /* access modifiers changed from: private */
        public void mergeWithdrawBalance(WithdrawBalanceContract withdrawBalanceContract) {
            withdrawBalanceContract.getClass();
            if (this.contractOneofCase_ != 15 || this.contractOneof_ == WithdrawBalanceContract.getDefaultInstance()) {
                this.contractOneof_ = withdrawBalanceContract;
            } else {
                this.contractOneof_ = ((WithdrawBalanceContract.Builder) WithdrawBalanceContract.newBuilder((WithdrawBalanceContract) this.contractOneof_).mergeFrom(withdrawBalanceContract)).buildPartial();
            }
            this.contractOneofCase_ = 15;
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
        public void setBlockHeader(BlockHeader blockHeader) {
            blockHeader.getClass();
            this.blockHeader_ = blockHeader;
        }

        /* access modifiers changed from: private */
        public void setExpiration(long j) {
            this.expiration_ = j;
        }

        /* access modifiers changed from: private */
        public void setFeeLimit(long j) {
            this.feeLimit_ = j;
        }

        /* access modifiers changed from: private */
        public void setFreezeBalance(FreezeBalanceContract freezeBalanceContract) {
            freezeBalanceContract.getClass();
            this.contractOneof_ = freezeBalanceContract;
            this.contractOneofCase_ = 12;
        }

        /* access modifiers changed from: private */
        public void setTimestamp(long j) {
            this.timestamp_ = j;
        }

        /* access modifiers changed from: private */
        public void setTransfer(TransferContract transferContract) {
            transferContract.getClass();
            this.contractOneof_ = transferContract;
            this.contractOneofCase_ = 10;
        }

        /* access modifiers changed from: private */
        public void setTransferAsset(TransferAssetContract transferAssetContract) {
            transferAssetContract.getClass();
            this.contractOneof_ = transferAssetContract;
            this.contractOneofCase_ = 11;
        }

        /* access modifiers changed from: private */
        public void setTransferTrc20Contract(TransferTRC20Contract transferTRC20Contract) {
            transferTRC20Contract.getClass();
            this.contractOneof_ = transferTRC20Contract;
            this.contractOneofCase_ = 19;
        }

        /* access modifiers changed from: private */
        public void setTriggerSmartContract(TriggerSmartContract triggerSmartContract) {
            triggerSmartContract.getClass();
            this.contractOneof_ = triggerSmartContract;
            this.contractOneofCase_ = 18;
        }

        /* access modifiers changed from: private */
        public void setUnfreezeAsset(UnfreezeAssetContract unfreezeAssetContract) {
            unfreezeAssetContract.getClass();
            this.contractOneof_ = unfreezeAssetContract;
            this.contractOneofCase_ = 14;
        }

        /* access modifiers changed from: private */
        public void setUnfreezeBalance(UnfreezeBalanceContract unfreezeBalanceContract) {
            unfreezeBalanceContract.getClass();
            this.contractOneof_ = unfreezeBalanceContract;
            this.contractOneofCase_ = 13;
        }

        /* access modifiers changed from: private */
        public void setVoteAsset(VoteAssetContract voteAssetContract) {
            voteAssetContract.getClass();
            this.contractOneof_ = voteAssetContract;
            this.contractOneofCase_ = 16;
        }

        /* access modifiers changed from: private */
        public void setVoteWitness(VoteWitnessContract voteWitnessContract) {
            voteWitnessContract.getClass();
            this.contractOneof_ = voteWitnessContract;
            this.contractOneofCase_ = 17;
        }

        /* access modifiers changed from: private */
        public void setWithdrawBalance(WithdrawBalanceContract withdrawBalanceContract) {
            withdrawBalanceContract.getClass();
            this.contractOneof_ = withdrawBalanceContract;
            this.contractOneofCase_ = 15;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97731.f46585xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Transaction();
                case 2:
                    return new Builder((C97731) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0001\u0000\u0001\u0013\u000e\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\t\u0004\u0002\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000\u0013<\u0000", new Object[]{"contractOneof_", "contractOneofCase_", "timestamp_", "expiration_", "blockHeader_", "feeLimit_", TransferContract.class, TransferAssetContract.class, FreezeBalanceContract.class, UnfreezeBalanceContract.class, UnfreezeAssetContract.class, WithdrawBalanceContract.class, VoteAssetContract.class, VoteWitnessContract.class, TriggerSmartContract.class, TransferTRC20Contract.class});
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

        public BlockHeader getBlockHeader() {
            BlockHeader blockHeader = this.blockHeader_;
            if (blockHeader == null) {
                return BlockHeader.getDefaultInstance();
            }
            return blockHeader;
        }

        public ContractOneofCase getContractOneofCase() {
            return ContractOneofCase.forNumber(this.contractOneofCase_);
        }

        public long getExpiration() {
            return this.expiration_;
        }

        public long getFeeLimit() {
            return this.feeLimit_;
        }

        public FreezeBalanceContract getFreezeBalance() {
            if (this.contractOneofCase_ == 12) {
                return (FreezeBalanceContract) this.contractOneof_;
            }
            return FreezeBalanceContract.getDefaultInstance();
        }

        public long getTimestamp() {
            return this.timestamp_;
        }

        public TransferContract getTransfer() {
            if (this.contractOneofCase_ == 10) {
                return (TransferContract) this.contractOneof_;
            }
            return TransferContract.getDefaultInstance();
        }

        public TransferAssetContract getTransferAsset() {
            if (this.contractOneofCase_ == 11) {
                return (TransferAssetContract) this.contractOneof_;
            }
            return TransferAssetContract.getDefaultInstance();
        }

        public TransferTRC20Contract getTransferTrc20Contract() {
            if (this.contractOneofCase_ == 19) {
                return (TransferTRC20Contract) this.contractOneof_;
            }
            return TransferTRC20Contract.getDefaultInstance();
        }

        public TriggerSmartContract getTriggerSmartContract() {
            if (this.contractOneofCase_ == 18) {
                return (TriggerSmartContract) this.contractOneof_;
            }
            return TriggerSmartContract.getDefaultInstance();
        }

        public UnfreezeAssetContract getUnfreezeAsset() {
            if (this.contractOneofCase_ == 14) {
                return (UnfreezeAssetContract) this.contractOneof_;
            }
            return UnfreezeAssetContract.getDefaultInstance();
        }

        public UnfreezeBalanceContract getUnfreezeBalance() {
            if (this.contractOneofCase_ == 13) {
                return (UnfreezeBalanceContract) this.contractOneof_;
            }
            return UnfreezeBalanceContract.getDefaultInstance();
        }

        public VoteAssetContract getVoteAsset() {
            if (this.contractOneofCase_ == 16) {
                return (VoteAssetContract) this.contractOneof_;
            }
            return VoteAssetContract.getDefaultInstance();
        }

        public VoteWitnessContract getVoteWitness() {
            if (this.contractOneofCase_ == 17) {
                return (VoteWitnessContract) this.contractOneof_;
            }
            return VoteWitnessContract.getDefaultInstance();
        }

        public WithdrawBalanceContract getWithdrawBalance() {
            if (this.contractOneofCase_ == 15) {
                return (WithdrawBalanceContract) this.contractOneof_;
            }
            return WithdrawBalanceContract.getDefaultInstance();
        }

        public boolean hasBlockHeader() {
            if (this.blockHeader_ != null) {
                return true;
            }
            return false;
        }

        public boolean hasFreezeBalance() {
            if (this.contractOneofCase_ == 12) {
                return true;
            }
            return false;
        }

        public boolean hasTransfer() {
            if (this.contractOneofCase_ == 10) {
                return true;
            }
            return false;
        }

        public boolean hasTransferAsset() {
            if (this.contractOneofCase_ == 11) {
                return true;
            }
            return false;
        }

        public boolean hasTransferTrc20Contract() {
            if (this.contractOneofCase_ == 19) {
                return true;
            }
            return false;
        }

        public boolean hasTriggerSmartContract() {
            if (this.contractOneofCase_ == 18) {
                return true;
            }
            return false;
        }

        public boolean hasUnfreezeAsset() {
            if (this.contractOneofCase_ == 14) {
                return true;
            }
            return false;
        }

        public boolean hasUnfreezeBalance() {
            if (this.contractOneofCase_ == 13) {
                return true;
            }
            return false;
        }

        public boolean hasVoteAsset() {
            if (this.contractOneofCase_ == 16) {
                return true;
            }
            return false;
        }

        public boolean hasVoteWitness() {
            if (this.contractOneofCase_ == 17) {
                return true;
            }
            return false;
        }

        public boolean hasWithdrawBalance() {
            if (this.contractOneofCase_ == 15) {
                return true;
            }
            return false;
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
        BlockHeader getBlockHeader();

        Transaction.ContractOneofCase getContractOneofCase();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        long getExpiration();

        long getFeeLimit();

        FreezeBalanceContract getFreezeBalance();

        long getTimestamp();

        TransferContract getTransfer();

        TransferAssetContract getTransferAsset();

        TransferTRC20Contract getTransferTrc20Contract();

        TriggerSmartContract getTriggerSmartContract();

        UnfreezeAssetContract getUnfreezeAsset();

        UnfreezeBalanceContract getUnfreezeBalance();

        VoteAssetContract getVoteAsset();

        VoteWitnessContract getVoteWitness();

        WithdrawBalanceContract getWithdrawBalance();

        boolean hasBlockHeader();

        boolean hasFreezeBalance();

        boolean hasTransfer();

        boolean hasTransferAsset();

        boolean hasTransferTrc20Contract();

        boolean hasTriggerSmartContract();

        boolean hasUnfreezeAsset();

        boolean hasUnfreezeBalance();

        boolean hasVoteAsset();

        boolean hasVoteWitness();

        boolean hasWithdrawBalance();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TransferAssetContract extends GeneratedMessageLite<TransferAssetContract, Builder> implements TransferAssetContractOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 4;
        public static final int ASSET_NAME_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final TransferAssetContract DEFAULT_INSTANCE;
        public static final int OWNER_ADDRESS_FIELD_NUMBER = 2;
        private static volatile im4<TransferAssetContract> PARSER = null;
        public static final int TO_ADDRESS_FIELD_NUMBER = 3;
        private long amount_;
        private String assetName_ = "";
        private String ownerAddress_ = "";
        private String toAddress_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<TransferAssetContract, Builder> implements TransferAssetContractOrBuilder {
            public /* synthetic */ Builder(C97731 r1) {
                this();
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((TransferAssetContract) this.instance).clearAmount();
                return this;
            }

            public Builder clearAssetName() {
                copyOnWrite();
                ((TransferAssetContract) this.instance).clearAssetName();
                return this;
            }

            public Builder clearOwnerAddress() {
                copyOnWrite();
                ((TransferAssetContract) this.instance).clearOwnerAddress();
                return this;
            }

            public Builder clearToAddress() {
                copyOnWrite();
                ((TransferAssetContract) this.instance).clearToAddress();
                return this;
            }

            public long getAmount() {
                return ((TransferAssetContract) this.instance).getAmount();
            }

            public String getAssetName() {
                return ((TransferAssetContract) this.instance).getAssetName();
            }

            public ByteString getAssetNameBytes() {
                return ((TransferAssetContract) this.instance).getAssetNameBytes();
            }

            public String getOwnerAddress() {
                return ((TransferAssetContract) this.instance).getOwnerAddress();
            }

            public ByteString getOwnerAddressBytes() {
                return ((TransferAssetContract) this.instance).getOwnerAddressBytes();
            }

            public String getToAddress() {
                return ((TransferAssetContract) this.instance).getToAddress();
            }

            public ByteString getToAddressBytes() {
                return ((TransferAssetContract) this.instance).getToAddressBytes();
            }

            public Builder setAmount(long j) {
                copyOnWrite();
                ((TransferAssetContract) this.instance).setAmount(j);
                return this;
            }

            public Builder setAssetName(String str) {
                copyOnWrite();
                ((TransferAssetContract) this.instance).setAssetName(str);
                return this;
            }

            public Builder setAssetNameBytes(ByteString byteString) {
                copyOnWrite();
                ((TransferAssetContract) this.instance).setAssetNameBytes(byteString);
                return this;
            }

            public Builder setOwnerAddress(String str) {
                copyOnWrite();
                ((TransferAssetContract) this.instance).setOwnerAddress(str);
                return this;
            }

            public Builder setOwnerAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((TransferAssetContract) this.instance).setOwnerAddressBytes(byteString);
                return this;
            }

            public Builder setToAddress(String str) {
                copyOnWrite();
                ((TransferAssetContract) this.instance).setToAddress(str);
                return this;
            }

            public Builder setToAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((TransferAssetContract) this.instance).setToAddressBytes(byteString);
                return this;
            }

            private Builder() {
                super(TransferAssetContract.DEFAULT_INSTANCE);
            }
        }

        static {
            TransferAssetContract transferAssetContract = new TransferAssetContract();
            DEFAULT_INSTANCE = transferAssetContract;
            GeneratedMessageLite.registerDefaultInstance(TransferAssetContract.class, transferAssetContract);
        }

        private TransferAssetContract() {
        }

        /* access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearAssetName() {
            this.assetName_ = getDefaultInstance().getAssetName();
        }

        /* access modifiers changed from: private */
        public void clearOwnerAddress() {
            this.ownerAddress_ = getDefaultInstance().getOwnerAddress();
        }

        /* access modifiers changed from: private */
        public void clearToAddress() {
            this.toAddress_ = getDefaultInstance().getToAddress();
        }

        public static TransferAssetContract getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TransferAssetContract parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TransferAssetContract) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TransferAssetContract parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TransferAssetContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<TransferAssetContract> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAmount(long j) {
            this.amount_ = j;
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
        public void setOwnerAddress(String str) {
            str.getClass();
            this.ownerAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setOwnerAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.ownerAddress_ = byteString.toStringUtf8();
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
            switch (C97731.f46585xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TransferAssetContract();
                case 2:
                    return new Builder((C97731) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0002", new Object[]{"assetName_", "ownerAddress_", "toAddress_", "amount_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<TransferAssetContract> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (TransferAssetContract.class) {
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

        public String getAssetName() {
            return this.assetName_;
        }

        public ByteString getAssetNameBytes() {
            return ByteString.copyFromUtf8(this.assetName_);
        }

        public String getOwnerAddress() {
            return this.ownerAddress_;
        }

        public ByteString getOwnerAddressBytes() {
            return ByteString.copyFromUtf8(this.ownerAddress_);
        }

        public String getToAddress() {
            return this.toAddress_;
        }

        public ByteString getToAddressBytes() {
            return ByteString.copyFromUtf8(this.toAddress_);
        }

        public static Builder newBuilder(TransferAssetContract transferAssetContract) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(transferAssetContract);
        }

        public static TransferAssetContract parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TransferAssetContract) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TransferAssetContract parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransferAssetContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static TransferAssetContract parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TransferAssetContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TransferAssetContract parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransferAssetContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static TransferAssetContract parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TransferAssetContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TransferAssetContract parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransferAssetContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static TransferAssetContract parseFrom(InputStream inputStream) throws IOException {
            return (TransferAssetContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TransferAssetContract parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TransferAssetContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TransferAssetContract parseFrom(C4969g gVar) throws IOException {
            return (TransferAssetContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static TransferAssetContract parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (TransferAssetContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface TransferAssetContractOrBuilder extends qu3 {
        long getAmount();

        String getAssetName();

        ByteString getAssetNameBytes();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getOwnerAddress();

        ByteString getOwnerAddressBytes();

        String getToAddress();

        ByteString getToAddressBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TransferContract extends GeneratedMessageLite<TransferContract, Builder> implements TransferContractOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final TransferContract DEFAULT_INSTANCE;
        public static final int OWNER_ADDRESS_FIELD_NUMBER = 1;
        private static volatile im4<TransferContract> PARSER = null;
        public static final int TO_ADDRESS_FIELD_NUMBER = 2;
        private long amount_;
        private String ownerAddress_ = "";
        private String toAddress_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<TransferContract, Builder> implements TransferContractOrBuilder {
            public /* synthetic */ Builder(C97731 r1) {
                this();
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((TransferContract) this.instance).clearAmount();
                return this;
            }

            public Builder clearOwnerAddress() {
                copyOnWrite();
                ((TransferContract) this.instance).clearOwnerAddress();
                return this;
            }

            public Builder clearToAddress() {
                copyOnWrite();
                ((TransferContract) this.instance).clearToAddress();
                return this;
            }

            public long getAmount() {
                return ((TransferContract) this.instance).getAmount();
            }

            public String getOwnerAddress() {
                return ((TransferContract) this.instance).getOwnerAddress();
            }

            public ByteString getOwnerAddressBytes() {
                return ((TransferContract) this.instance).getOwnerAddressBytes();
            }

            public String getToAddress() {
                return ((TransferContract) this.instance).getToAddress();
            }

            public ByteString getToAddressBytes() {
                return ((TransferContract) this.instance).getToAddressBytes();
            }

            public Builder setAmount(long j) {
                copyOnWrite();
                ((TransferContract) this.instance).setAmount(j);
                return this;
            }

            public Builder setOwnerAddress(String str) {
                copyOnWrite();
                ((TransferContract) this.instance).setOwnerAddress(str);
                return this;
            }

            public Builder setOwnerAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((TransferContract) this.instance).setOwnerAddressBytes(byteString);
                return this;
            }

            public Builder setToAddress(String str) {
                copyOnWrite();
                ((TransferContract) this.instance).setToAddress(str);
                return this;
            }

            public Builder setToAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((TransferContract) this.instance).setToAddressBytes(byteString);
                return this;
            }

            private Builder() {
                super(TransferContract.DEFAULT_INSTANCE);
            }
        }

        static {
            TransferContract transferContract = new TransferContract();
            DEFAULT_INSTANCE = transferContract;
            GeneratedMessageLite.registerDefaultInstance(TransferContract.class, transferContract);
        }

        private TransferContract() {
        }

        /* access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearOwnerAddress() {
            this.ownerAddress_ = getDefaultInstance().getOwnerAddress();
        }

        /* access modifiers changed from: private */
        public void clearToAddress() {
            this.toAddress_ = getDefaultInstance().getToAddress();
        }

        public static TransferContract getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TransferContract parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TransferContract) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TransferContract parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TransferContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<TransferContract> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAmount(long j) {
            this.amount_ = j;
        }

        /* access modifiers changed from: private */
        public void setOwnerAddress(String str) {
            str.getClass();
            this.ownerAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setOwnerAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.ownerAddress_ = byteString.toStringUtf8();
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
            switch (C97731.f46585xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TransferContract();
                case 2:
                    return new Builder((C97731) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002", new Object[]{"ownerAddress_", "toAddress_", "amount_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<TransferContract> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (TransferContract.class) {
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

        public String getOwnerAddress() {
            return this.ownerAddress_;
        }

        public ByteString getOwnerAddressBytes() {
            return ByteString.copyFromUtf8(this.ownerAddress_);
        }

        public String getToAddress() {
            return this.toAddress_;
        }

        public ByteString getToAddressBytes() {
            return ByteString.copyFromUtf8(this.toAddress_);
        }

        public static Builder newBuilder(TransferContract transferContract) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(transferContract);
        }

        public static TransferContract parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TransferContract) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TransferContract parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransferContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static TransferContract parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TransferContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TransferContract parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransferContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static TransferContract parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TransferContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TransferContract parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransferContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static TransferContract parseFrom(InputStream inputStream) throws IOException {
            return (TransferContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TransferContract parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TransferContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TransferContract parseFrom(C4969g gVar) throws IOException {
            return (TransferContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static TransferContract parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (TransferContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface TransferContractOrBuilder extends qu3 {
        long getAmount();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getOwnerAddress();

        ByteString getOwnerAddressBytes();

        String getToAddress();

        ByteString getToAddressBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TransferTRC20Contract extends GeneratedMessageLite<TransferTRC20Contract, Builder> implements TransferTRC20ContractOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 4;
        public static final int CONTRACT_ADDRESS_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final TransferTRC20Contract DEFAULT_INSTANCE;
        public static final int OWNER_ADDRESS_FIELD_NUMBER = 2;
        private static volatile im4<TransferTRC20Contract> PARSER = null;
        public static final int TO_ADDRESS_FIELD_NUMBER = 3;
        private ByteString amount_ = ByteString.EMPTY;
        private String contractAddress_ = "";
        private String ownerAddress_ = "";
        private String toAddress_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<TransferTRC20Contract, Builder> implements TransferTRC20ContractOrBuilder {
            public /* synthetic */ Builder(C97731 r1) {
                this();
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((TransferTRC20Contract) this.instance).clearAmount();
                return this;
            }

            public Builder clearContractAddress() {
                copyOnWrite();
                ((TransferTRC20Contract) this.instance).clearContractAddress();
                return this;
            }

            public Builder clearOwnerAddress() {
                copyOnWrite();
                ((TransferTRC20Contract) this.instance).clearOwnerAddress();
                return this;
            }

            public Builder clearToAddress() {
                copyOnWrite();
                ((TransferTRC20Contract) this.instance).clearToAddress();
                return this;
            }

            public ByteString getAmount() {
                return ((TransferTRC20Contract) this.instance).getAmount();
            }

            public String getContractAddress() {
                return ((TransferTRC20Contract) this.instance).getContractAddress();
            }

            public ByteString getContractAddressBytes() {
                return ((TransferTRC20Contract) this.instance).getContractAddressBytes();
            }

            public String getOwnerAddress() {
                return ((TransferTRC20Contract) this.instance).getOwnerAddress();
            }

            public ByteString getOwnerAddressBytes() {
                return ((TransferTRC20Contract) this.instance).getOwnerAddressBytes();
            }

            public String getToAddress() {
                return ((TransferTRC20Contract) this.instance).getToAddress();
            }

            public ByteString getToAddressBytes() {
                return ((TransferTRC20Contract) this.instance).getToAddressBytes();
            }

            public Builder setAmount(ByteString byteString) {
                copyOnWrite();
                ((TransferTRC20Contract) this.instance).setAmount(byteString);
                return this;
            }

            public Builder setContractAddress(String str) {
                copyOnWrite();
                ((TransferTRC20Contract) this.instance).setContractAddress(str);
                return this;
            }

            public Builder setContractAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((TransferTRC20Contract) this.instance).setContractAddressBytes(byteString);
                return this;
            }

            public Builder setOwnerAddress(String str) {
                copyOnWrite();
                ((TransferTRC20Contract) this.instance).setOwnerAddress(str);
                return this;
            }

            public Builder setOwnerAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((TransferTRC20Contract) this.instance).setOwnerAddressBytes(byteString);
                return this;
            }

            public Builder setToAddress(String str) {
                copyOnWrite();
                ((TransferTRC20Contract) this.instance).setToAddress(str);
                return this;
            }

            public Builder setToAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((TransferTRC20Contract) this.instance).setToAddressBytes(byteString);
                return this;
            }

            private Builder() {
                super(TransferTRC20Contract.DEFAULT_INSTANCE);
            }
        }

        static {
            TransferTRC20Contract transferTRC20Contract = new TransferTRC20Contract();
            DEFAULT_INSTANCE = transferTRC20Contract;
            GeneratedMessageLite.registerDefaultInstance(TransferTRC20Contract.class, transferTRC20Contract);
        }

        private TransferTRC20Contract() {
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
        public void clearOwnerAddress() {
            this.ownerAddress_ = getDefaultInstance().getOwnerAddress();
        }

        /* access modifiers changed from: private */
        public void clearToAddress() {
            this.toAddress_ = getDefaultInstance().getToAddress();
        }

        public static TransferTRC20Contract getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TransferTRC20Contract parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TransferTRC20Contract) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TransferTRC20Contract parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TransferTRC20Contract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<TransferTRC20Contract> parser() {
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
        public void setOwnerAddress(String str) {
            str.getClass();
            this.ownerAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setOwnerAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.ownerAddress_ = byteString.toStringUtf8();
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
            switch (C97731.f46585xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TransferTRC20Contract();
                case 2:
                    return new Builder((C97731) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\n", new Object[]{"contractAddress_", "ownerAddress_", "toAddress_", "amount_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<TransferTRC20Contract> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (TransferTRC20Contract.class) {
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

        public String getOwnerAddress() {
            return this.ownerAddress_;
        }

        public ByteString getOwnerAddressBytes() {
            return ByteString.copyFromUtf8(this.ownerAddress_);
        }

        public String getToAddress() {
            return this.toAddress_;
        }

        public ByteString getToAddressBytes() {
            return ByteString.copyFromUtf8(this.toAddress_);
        }

        public static Builder newBuilder(TransferTRC20Contract transferTRC20Contract) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(transferTRC20Contract);
        }

        public static TransferTRC20Contract parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TransferTRC20Contract) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TransferTRC20Contract parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransferTRC20Contract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static TransferTRC20Contract parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TransferTRC20Contract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TransferTRC20Contract parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransferTRC20Contract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static TransferTRC20Contract parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TransferTRC20Contract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TransferTRC20Contract parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransferTRC20Contract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static TransferTRC20Contract parseFrom(InputStream inputStream) throws IOException {
            return (TransferTRC20Contract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TransferTRC20Contract parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TransferTRC20Contract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TransferTRC20Contract parseFrom(C4969g gVar) throws IOException {
            return (TransferTRC20Contract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static TransferTRC20Contract parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (TransferTRC20Contract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface TransferTRC20ContractOrBuilder extends qu3 {
        ByteString getAmount();

        String getContractAddress();

        ByteString getContractAddressBytes();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getOwnerAddress();

        ByteString getOwnerAddressBytes();

        String getToAddress();

        ByteString getToAddressBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TriggerSmartContract extends GeneratedMessageLite<TriggerSmartContract, Builder> implements TriggerSmartContractOrBuilder {
        public static final int CALL_TOKEN_VALUE_FIELD_NUMBER = 5;
        public static final int CALL_VALUE_FIELD_NUMBER = 3;
        public static final int CONTRACT_ADDRESS_FIELD_NUMBER = 2;
        public static final int DATA_FIELD_NUMBER = 4;
        /* access modifiers changed from: private */
        public static final TriggerSmartContract DEFAULT_INSTANCE;
        public static final int OWNER_ADDRESS_FIELD_NUMBER = 1;
        private static volatile im4<TriggerSmartContract> PARSER = null;
        public static final int TOKEN_ID_FIELD_NUMBER = 6;
        private long callTokenValue_;
        private long callValue_;
        private String contractAddress_ = "";
        private ByteString data_ = ByteString.EMPTY;
        private String ownerAddress_ = "";
        private long tokenId_;

        public static final class Builder extends GeneratedMessageLite.C4930a<TriggerSmartContract, Builder> implements TriggerSmartContractOrBuilder {
            public /* synthetic */ Builder(C97731 r1) {
                this();
            }

            public Builder clearCallTokenValue() {
                copyOnWrite();
                ((TriggerSmartContract) this.instance).clearCallTokenValue();
                return this;
            }

            public Builder clearCallValue() {
                copyOnWrite();
                ((TriggerSmartContract) this.instance).clearCallValue();
                return this;
            }

            public Builder clearContractAddress() {
                copyOnWrite();
                ((TriggerSmartContract) this.instance).clearContractAddress();
                return this;
            }

            public Builder clearData() {
                copyOnWrite();
                ((TriggerSmartContract) this.instance).clearData();
                return this;
            }

            public Builder clearOwnerAddress() {
                copyOnWrite();
                ((TriggerSmartContract) this.instance).clearOwnerAddress();
                return this;
            }

            public Builder clearTokenId() {
                copyOnWrite();
                ((TriggerSmartContract) this.instance).clearTokenId();
                return this;
            }

            public long getCallTokenValue() {
                return ((TriggerSmartContract) this.instance).getCallTokenValue();
            }

            public long getCallValue() {
                return ((TriggerSmartContract) this.instance).getCallValue();
            }

            public String getContractAddress() {
                return ((TriggerSmartContract) this.instance).getContractAddress();
            }

            public ByteString getContractAddressBytes() {
                return ((TriggerSmartContract) this.instance).getContractAddressBytes();
            }

            public ByteString getData() {
                return ((TriggerSmartContract) this.instance).getData();
            }

            public String getOwnerAddress() {
                return ((TriggerSmartContract) this.instance).getOwnerAddress();
            }

            public ByteString getOwnerAddressBytes() {
                return ((TriggerSmartContract) this.instance).getOwnerAddressBytes();
            }

            public long getTokenId() {
                return ((TriggerSmartContract) this.instance).getTokenId();
            }

            public Builder setCallTokenValue(long j) {
                copyOnWrite();
                ((TriggerSmartContract) this.instance).setCallTokenValue(j);
                return this;
            }

            public Builder setCallValue(long j) {
                copyOnWrite();
                ((TriggerSmartContract) this.instance).setCallValue(j);
                return this;
            }

            public Builder setContractAddress(String str) {
                copyOnWrite();
                ((TriggerSmartContract) this.instance).setContractAddress(str);
                return this;
            }

            public Builder setContractAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((TriggerSmartContract) this.instance).setContractAddressBytes(byteString);
                return this;
            }

            public Builder setData(ByteString byteString) {
                copyOnWrite();
                ((TriggerSmartContract) this.instance).setData(byteString);
                return this;
            }

            public Builder setOwnerAddress(String str) {
                copyOnWrite();
                ((TriggerSmartContract) this.instance).setOwnerAddress(str);
                return this;
            }

            public Builder setOwnerAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((TriggerSmartContract) this.instance).setOwnerAddressBytes(byteString);
                return this;
            }

            public Builder setTokenId(long j) {
                copyOnWrite();
                ((TriggerSmartContract) this.instance).setTokenId(j);
                return this;
            }

            private Builder() {
                super(TriggerSmartContract.DEFAULT_INSTANCE);
            }
        }

        static {
            TriggerSmartContract triggerSmartContract = new TriggerSmartContract();
            DEFAULT_INSTANCE = triggerSmartContract;
            GeneratedMessageLite.registerDefaultInstance(TriggerSmartContract.class, triggerSmartContract);
        }

        private TriggerSmartContract() {
        }

        /* access modifiers changed from: private */
        public void clearCallTokenValue() {
            this.callTokenValue_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearCallValue() {
            this.callValue_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearContractAddress() {
            this.contractAddress_ = getDefaultInstance().getContractAddress();
        }

        /* access modifiers changed from: private */
        public void clearData() {
            this.data_ = getDefaultInstance().getData();
        }

        /* access modifiers changed from: private */
        public void clearOwnerAddress() {
            this.ownerAddress_ = getDefaultInstance().getOwnerAddress();
        }

        /* access modifiers changed from: private */
        public void clearTokenId() {
            this.tokenId_ = 0;
        }

        public static TriggerSmartContract getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TriggerSmartContract parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TriggerSmartContract) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TriggerSmartContract parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TriggerSmartContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<TriggerSmartContract> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setCallTokenValue(long j) {
            this.callTokenValue_ = j;
        }

        /* access modifiers changed from: private */
        public void setCallValue(long j) {
            this.callValue_ = j;
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
        public void setData(ByteString byteString) {
            byteString.getClass();
            this.data_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setOwnerAddress(String str) {
            str.getClass();
            this.ownerAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setOwnerAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.ownerAddress_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setTokenId(long j) {
            this.tokenId_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97731.f46585xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TriggerSmartContract();
                case 2:
                    return new Builder((C97731) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004\n\u0005\u0002\u0006\u0002", new Object[]{"ownerAddress_", "contractAddress_", "callValue_", "data_", "callTokenValue_", "tokenId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<TriggerSmartContract> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (TriggerSmartContract.class) {
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

        public long getCallTokenValue() {
            return this.callTokenValue_;
        }

        public long getCallValue() {
            return this.callValue_;
        }

        public String getContractAddress() {
            return this.contractAddress_;
        }

        public ByteString getContractAddressBytes() {
            return ByteString.copyFromUtf8(this.contractAddress_);
        }

        public ByteString getData() {
            return this.data_;
        }

        public String getOwnerAddress() {
            return this.ownerAddress_;
        }

        public ByteString getOwnerAddressBytes() {
            return ByteString.copyFromUtf8(this.ownerAddress_);
        }

        public long getTokenId() {
            return this.tokenId_;
        }

        public static Builder newBuilder(TriggerSmartContract triggerSmartContract) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(triggerSmartContract);
        }

        public static TriggerSmartContract parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TriggerSmartContract) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TriggerSmartContract parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (TriggerSmartContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static TriggerSmartContract parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TriggerSmartContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TriggerSmartContract parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (TriggerSmartContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static TriggerSmartContract parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TriggerSmartContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TriggerSmartContract parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (TriggerSmartContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static TriggerSmartContract parseFrom(InputStream inputStream) throws IOException {
            return (TriggerSmartContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TriggerSmartContract parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TriggerSmartContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TriggerSmartContract parseFrom(C4969g gVar) throws IOException {
            return (TriggerSmartContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static TriggerSmartContract parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (TriggerSmartContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface TriggerSmartContractOrBuilder extends qu3 {
        long getCallTokenValue();

        long getCallValue();

        String getContractAddress();

        ByteString getContractAddressBytes();

        ByteString getData();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getOwnerAddress();

        ByteString getOwnerAddressBytes();

        long getTokenId();

        /* synthetic */ boolean isInitialized();
    }

    public static final class UnfreezeAssetContract extends GeneratedMessageLite<UnfreezeAssetContract, Builder> implements UnfreezeAssetContractOrBuilder {
        /* access modifiers changed from: private */
        public static final UnfreezeAssetContract DEFAULT_INSTANCE;
        public static final int OWNER_ADDRESS_FIELD_NUMBER = 1;
        private static volatile im4<UnfreezeAssetContract> PARSER;
        private String ownerAddress_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<UnfreezeAssetContract, Builder> implements UnfreezeAssetContractOrBuilder {
            public /* synthetic */ Builder(C97731 r1) {
                this();
            }

            public Builder clearOwnerAddress() {
                copyOnWrite();
                ((UnfreezeAssetContract) this.instance).clearOwnerAddress();
                return this;
            }

            public String getOwnerAddress() {
                return ((UnfreezeAssetContract) this.instance).getOwnerAddress();
            }

            public ByteString getOwnerAddressBytes() {
                return ((UnfreezeAssetContract) this.instance).getOwnerAddressBytes();
            }

            public Builder setOwnerAddress(String str) {
                copyOnWrite();
                ((UnfreezeAssetContract) this.instance).setOwnerAddress(str);
                return this;
            }

            public Builder setOwnerAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((UnfreezeAssetContract) this.instance).setOwnerAddressBytes(byteString);
                return this;
            }

            private Builder() {
                super(UnfreezeAssetContract.DEFAULT_INSTANCE);
            }
        }

        static {
            UnfreezeAssetContract unfreezeAssetContract = new UnfreezeAssetContract();
            DEFAULT_INSTANCE = unfreezeAssetContract;
            GeneratedMessageLite.registerDefaultInstance(UnfreezeAssetContract.class, unfreezeAssetContract);
        }

        private UnfreezeAssetContract() {
        }

        /* access modifiers changed from: private */
        public void clearOwnerAddress() {
            this.ownerAddress_ = getDefaultInstance().getOwnerAddress();
        }

        public static UnfreezeAssetContract getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static UnfreezeAssetContract parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UnfreezeAssetContract) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UnfreezeAssetContract parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (UnfreezeAssetContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<UnfreezeAssetContract> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setOwnerAddress(String str) {
            str.getClass();
            this.ownerAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setOwnerAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.ownerAddress_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97731.f46585xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new UnfreezeAssetContract();
                case 2:
                    return new Builder((C97731) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"ownerAddress_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<UnfreezeAssetContract> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (UnfreezeAssetContract.class) {
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

        public String getOwnerAddress() {
            return this.ownerAddress_;
        }

        public ByteString getOwnerAddressBytes() {
            return ByteString.copyFromUtf8(this.ownerAddress_);
        }

        public static Builder newBuilder(UnfreezeAssetContract unfreezeAssetContract) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(unfreezeAssetContract);
        }

        public static UnfreezeAssetContract parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (UnfreezeAssetContract) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static UnfreezeAssetContract parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (UnfreezeAssetContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static UnfreezeAssetContract parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (UnfreezeAssetContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static UnfreezeAssetContract parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (UnfreezeAssetContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static UnfreezeAssetContract parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UnfreezeAssetContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UnfreezeAssetContract parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (UnfreezeAssetContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static UnfreezeAssetContract parseFrom(InputStream inputStream) throws IOException {
            return (UnfreezeAssetContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UnfreezeAssetContract parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (UnfreezeAssetContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static UnfreezeAssetContract parseFrom(C4969g gVar) throws IOException {
            return (UnfreezeAssetContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static UnfreezeAssetContract parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (UnfreezeAssetContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface UnfreezeAssetContractOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getOwnerAddress();

        ByteString getOwnerAddressBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class UnfreezeBalanceContract extends GeneratedMessageLite<UnfreezeBalanceContract, Builder> implements UnfreezeBalanceContractOrBuilder {
        /* access modifiers changed from: private */
        public static final UnfreezeBalanceContract DEFAULT_INSTANCE;
        public static final int OWNER_ADDRESS_FIELD_NUMBER = 1;
        private static volatile im4<UnfreezeBalanceContract> PARSER = null;
        public static final int RECEIVER_ADDRESS_FIELD_NUMBER = 15;
        public static final int RESOURCE_FIELD_NUMBER = 10;
        private String ownerAddress_ = "";
        private String receiverAddress_ = "";
        private String resource_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<UnfreezeBalanceContract, Builder> implements UnfreezeBalanceContractOrBuilder {
            public /* synthetic */ Builder(C97731 r1) {
                this();
            }

            public Builder clearOwnerAddress() {
                copyOnWrite();
                ((UnfreezeBalanceContract) this.instance).clearOwnerAddress();
                return this;
            }

            public Builder clearReceiverAddress() {
                copyOnWrite();
                ((UnfreezeBalanceContract) this.instance).clearReceiverAddress();
                return this;
            }

            public Builder clearResource() {
                copyOnWrite();
                ((UnfreezeBalanceContract) this.instance).clearResource();
                return this;
            }

            public String getOwnerAddress() {
                return ((UnfreezeBalanceContract) this.instance).getOwnerAddress();
            }

            public ByteString getOwnerAddressBytes() {
                return ((UnfreezeBalanceContract) this.instance).getOwnerAddressBytes();
            }

            public String getReceiverAddress() {
                return ((UnfreezeBalanceContract) this.instance).getReceiverAddress();
            }

            public ByteString getReceiverAddressBytes() {
                return ((UnfreezeBalanceContract) this.instance).getReceiverAddressBytes();
            }

            public String getResource() {
                return ((UnfreezeBalanceContract) this.instance).getResource();
            }

            public ByteString getResourceBytes() {
                return ((UnfreezeBalanceContract) this.instance).getResourceBytes();
            }

            public Builder setOwnerAddress(String str) {
                copyOnWrite();
                ((UnfreezeBalanceContract) this.instance).setOwnerAddress(str);
                return this;
            }

            public Builder setOwnerAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((UnfreezeBalanceContract) this.instance).setOwnerAddressBytes(byteString);
                return this;
            }

            public Builder setReceiverAddress(String str) {
                copyOnWrite();
                ((UnfreezeBalanceContract) this.instance).setReceiverAddress(str);
                return this;
            }

            public Builder setReceiverAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((UnfreezeBalanceContract) this.instance).setReceiverAddressBytes(byteString);
                return this;
            }

            public Builder setResource(String str) {
                copyOnWrite();
                ((UnfreezeBalanceContract) this.instance).setResource(str);
                return this;
            }

            public Builder setResourceBytes(ByteString byteString) {
                copyOnWrite();
                ((UnfreezeBalanceContract) this.instance).setResourceBytes(byteString);
                return this;
            }

            private Builder() {
                super(UnfreezeBalanceContract.DEFAULT_INSTANCE);
            }
        }

        static {
            UnfreezeBalanceContract unfreezeBalanceContract = new UnfreezeBalanceContract();
            DEFAULT_INSTANCE = unfreezeBalanceContract;
            GeneratedMessageLite.registerDefaultInstance(UnfreezeBalanceContract.class, unfreezeBalanceContract);
        }

        private UnfreezeBalanceContract() {
        }

        /* access modifiers changed from: private */
        public void clearOwnerAddress() {
            this.ownerAddress_ = getDefaultInstance().getOwnerAddress();
        }

        /* access modifiers changed from: private */
        public void clearReceiverAddress() {
            this.receiverAddress_ = getDefaultInstance().getReceiverAddress();
        }

        /* access modifiers changed from: private */
        public void clearResource() {
            this.resource_ = getDefaultInstance().getResource();
        }

        public static UnfreezeBalanceContract getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static UnfreezeBalanceContract parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UnfreezeBalanceContract) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UnfreezeBalanceContract parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (UnfreezeBalanceContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<UnfreezeBalanceContract> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setOwnerAddress(String str) {
            str.getClass();
            this.ownerAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setOwnerAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.ownerAddress_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setReceiverAddress(String str) {
            str.getClass();
            this.receiverAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setReceiverAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.receiverAddress_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setResource(String str) {
            str.getClass();
            this.resource_ = str;
        }

        /* access modifiers changed from: private */
        public void setResourceBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.resource_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97731.f46585xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new UnfreezeBalanceContract();
                case 2:
                    return new Builder((C97731) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u000f\u0003\u0000\u0000\u0000\u0001Ȉ\nȈ\u000fȈ", new Object[]{"ownerAddress_", "resource_", "receiverAddress_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<UnfreezeBalanceContract> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (UnfreezeBalanceContract.class) {
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

        public String getOwnerAddress() {
            return this.ownerAddress_;
        }

        public ByteString getOwnerAddressBytes() {
            return ByteString.copyFromUtf8(this.ownerAddress_);
        }

        public String getReceiverAddress() {
            return this.receiverAddress_;
        }

        public ByteString getReceiverAddressBytes() {
            return ByteString.copyFromUtf8(this.receiverAddress_);
        }

        public String getResource() {
            return this.resource_;
        }

        public ByteString getResourceBytes() {
            return ByteString.copyFromUtf8(this.resource_);
        }

        public static Builder newBuilder(UnfreezeBalanceContract unfreezeBalanceContract) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(unfreezeBalanceContract);
        }

        public static UnfreezeBalanceContract parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (UnfreezeBalanceContract) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static UnfreezeBalanceContract parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (UnfreezeBalanceContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static UnfreezeBalanceContract parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (UnfreezeBalanceContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static UnfreezeBalanceContract parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (UnfreezeBalanceContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static UnfreezeBalanceContract parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UnfreezeBalanceContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UnfreezeBalanceContract parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (UnfreezeBalanceContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static UnfreezeBalanceContract parseFrom(InputStream inputStream) throws IOException {
            return (UnfreezeBalanceContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UnfreezeBalanceContract parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (UnfreezeBalanceContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static UnfreezeBalanceContract parseFrom(C4969g gVar) throws IOException {
            return (UnfreezeBalanceContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static UnfreezeBalanceContract parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (UnfreezeBalanceContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface UnfreezeBalanceContractOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getOwnerAddress();

        ByteString getOwnerAddressBytes();

        String getReceiverAddress();

        ByteString getReceiverAddressBytes();

        String getResource();

        ByteString getResourceBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class VoteAssetContract extends GeneratedMessageLite<VoteAssetContract, Builder> implements VoteAssetContractOrBuilder {
        public static final int COUNT_FIELD_NUMBER = 5;
        /* access modifiers changed from: private */
        public static final VoteAssetContract DEFAULT_INSTANCE;
        public static final int OWNER_ADDRESS_FIELD_NUMBER = 1;
        private static volatile im4<VoteAssetContract> PARSER = null;
        public static final int SUPPORT_FIELD_NUMBER = 3;
        public static final int VOTE_ADDRESS_FIELD_NUMBER = 2;
        private int count_;
        private String ownerAddress_ = "";
        private boolean support_;
        private C5011t.C5020i<String> voteAddress_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.C4930a<VoteAssetContract, Builder> implements VoteAssetContractOrBuilder {
            public /* synthetic */ Builder(C97731 r1) {
                this();
            }

            public Builder addAllVoteAddress(Iterable<String> iterable) {
                copyOnWrite();
                ((VoteAssetContract) this.instance).addAllVoteAddress(iterable);
                return this;
            }

            public Builder addVoteAddress(String str) {
                copyOnWrite();
                ((VoteAssetContract) this.instance).addVoteAddress(str);
                return this;
            }

            public Builder addVoteAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((VoteAssetContract) this.instance).addVoteAddressBytes(byteString);
                return this;
            }

            public Builder clearCount() {
                copyOnWrite();
                ((VoteAssetContract) this.instance).clearCount();
                return this;
            }

            public Builder clearOwnerAddress() {
                copyOnWrite();
                ((VoteAssetContract) this.instance).clearOwnerAddress();
                return this;
            }

            public Builder clearSupport() {
                copyOnWrite();
                ((VoteAssetContract) this.instance).clearSupport();
                return this;
            }

            public Builder clearVoteAddress() {
                copyOnWrite();
                ((VoteAssetContract) this.instance).clearVoteAddress();
                return this;
            }

            public int getCount() {
                return ((VoteAssetContract) this.instance).getCount();
            }

            public String getOwnerAddress() {
                return ((VoteAssetContract) this.instance).getOwnerAddress();
            }

            public ByteString getOwnerAddressBytes() {
                return ((VoteAssetContract) this.instance).getOwnerAddressBytes();
            }

            public boolean getSupport() {
                return ((VoteAssetContract) this.instance).getSupport();
            }

            public String getVoteAddress(int i) {
                return ((VoteAssetContract) this.instance).getVoteAddress(i);
            }

            public ByteString getVoteAddressBytes(int i) {
                return ((VoteAssetContract) this.instance).getVoteAddressBytes(i);
            }

            public int getVoteAddressCount() {
                return ((VoteAssetContract) this.instance).getVoteAddressCount();
            }

            public List<String> getVoteAddressList() {
                return Collections.unmodifiableList(((VoteAssetContract) this.instance).getVoteAddressList());
            }

            public Builder setCount(int i) {
                copyOnWrite();
                ((VoteAssetContract) this.instance).setCount(i);
                return this;
            }

            public Builder setOwnerAddress(String str) {
                copyOnWrite();
                ((VoteAssetContract) this.instance).setOwnerAddress(str);
                return this;
            }

            public Builder setOwnerAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((VoteAssetContract) this.instance).setOwnerAddressBytes(byteString);
                return this;
            }

            public Builder setSupport(boolean z) {
                copyOnWrite();
                ((VoteAssetContract) this.instance).setSupport(z);
                return this;
            }

            public Builder setVoteAddress(int i, String str) {
                copyOnWrite();
                ((VoteAssetContract) this.instance).setVoteAddress(i, str);
                return this;
            }

            private Builder() {
                super(VoteAssetContract.DEFAULT_INSTANCE);
            }
        }

        static {
            VoteAssetContract voteAssetContract = new VoteAssetContract();
            DEFAULT_INSTANCE = voteAssetContract;
            GeneratedMessageLite.registerDefaultInstance(VoteAssetContract.class, voteAssetContract);
        }

        private VoteAssetContract() {
        }

        /* access modifiers changed from: private */
        public void addAllVoteAddress(Iterable<String> iterable) {
            ensureVoteAddressIsMutable();
            C4949a.addAll(iterable, this.voteAddress_);
        }

        /* access modifiers changed from: private */
        public void addVoteAddress(String str) {
            str.getClass();
            ensureVoteAddressIsMutable();
            this.voteAddress_.add(str);
        }

        /* access modifiers changed from: private */
        public void addVoteAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            ensureVoteAddressIsMutable();
            this.voteAddress_.add(byteString.toStringUtf8());
        }

        /* access modifiers changed from: private */
        public void clearCount() {
            this.count_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearOwnerAddress() {
            this.ownerAddress_ = getDefaultInstance().getOwnerAddress();
        }

        /* access modifiers changed from: private */
        public void clearSupport() {
            this.support_ = false;
        }

        /* access modifiers changed from: private */
        public void clearVoteAddress() {
            this.voteAddress_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureVoteAddressIsMutable() {
            C5011t.C5020i<String> iVar = this.voteAddress_;
            if (!iVar.mo37090v()) {
                this.voteAddress_ = GeneratedMessageLite.mutableCopy(iVar);
            }
        }

        public static VoteAssetContract getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static VoteAssetContract parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoteAssetContract) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoteAssetContract parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (VoteAssetContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<VoteAssetContract> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setCount(int i) {
            this.count_ = i;
        }

        /* access modifiers changed from: private */
        public void setOwnerAddress(String str) {
            str.getClass();
            this.ownerAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setOwnerAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.ownerAddress_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setSupport(boolean z) {
            this.support_ = z;
        }

        /* access modifiers changed from: private */
        public void setVoteAddress(int i, String str) {
            str.getClass();
            ensureVoteAddressIsMutable();
            this.voteAddress_.set(i, str);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97731.f46585xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoteAssetContract();
                case 2:
                    return new Builder((C97731) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003\u0007\u0005\u0004", new Object[]{"ownerAddress_", "voteAddress_", "support_", "count_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<VoteAssetContract> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (VoteAssetContract.class) {
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

        public int getCount() {
            return this.count_;
        }

        public String getOwnerAddress() {
            return this.ownerAddress_;
        }

        public ByteString getOwnerAddressBytes() {
            return ByteString.copyFromUtf8(this.ownerAddress_);
        }

        public boolean getSupport() {
            return this.support_;
        }

        public String getVoteAddress(int i) {
            return this.voteAddress_.get(i);
        }

        public ByteString getVoteAddressBytes(int i) {
            return ByteString.copyFromUtf8(this.voteAddress_.get(i));
        }

        public int getVoteAddressCount() {
            return this.voteAddress_.size();
        }

        public List<String> getVoteAddressList() {
            return this.voteAddress_;
        }

        public static Builder newBuilder(VoteAssetContract voteAssetContract) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(voteAssetContract);
        }

        public static VoteAssetContract parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (VoteAssetContract) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static VoteAssetContract parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (VoteAssetContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static VoteAssetContract parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoteAssetContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static VoteAssetContract parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (VoteAssetContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static VoteAssetContract parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoteAssetContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoteAssetContract parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (VoteAssetContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static VoteAssetContract parseFrom(InputStream inputStream) throws IOException {
            return (VoteAssetContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoteAssetContract parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (VoteAssetContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static VoteAssetContract parseFrom(C4969g gVar) throws IOException {
            return (VoteAssetContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static VoteAssetContract parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (VoteAssetContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface VoteAssetContractOrBuilder extends qu3 {
        int getCount();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getOwnerAddress();

        ByteString getOwnerAddressBytes();

        boolean getSupport();

        String getVoteAddress(int i);

        ByteString getVoteAddressBytes(int i);

        int getVoteAddressCount();

        List<String> getVoteAddressList();

        /* synthetic */ boolean isInitialized();
    }

    public static final class VoteWitnessContract extends GeneratedMessageLite<VoteWitnessContract, Builder> implements VoteWitnessContractOrBuilder {
        /* access modifiers changed from: private */
        public static final VoteWitnessContract DEFAULT_INSTANCE;
        public static final int OWNER_ADDRESS_FIELD_NUMBER = 1;
        private static volatile im4<VoteWitnessContract> PARSER = null;
        public static final int SUPPORT_FIELD_NUMBER = 3;
        public static final int VOTES_FIELD_NUMBER = 2;
        private String ownerAddress_ = "";
        private boolean support_;
        private C5011t.C5020i<Vote> votes_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.C4930a<VoteWitnessContract, Builder> implements VoteWitnessContractOrBuilder {
            public /* synthetic */ Builder(C97731 r1) {
                this();
            }

            public Builder addAllVotes(Iterable<? extends Vote> iterable) {
                copyOnWrite();
                ((VoteWitnessContract) this.instance).addAllVotes(iterable);
                return this;
            }

            public Builder addVotes(Vote vote) {
                copyOnWrite();
                ((VoteWitnessContract) this.instance).addVotes(vote);
                return this;
            }

            public Builder clearOwnerAddress() {
                copyOnWrite();
                ((VoteWitnessContract) this.instance).clearOwnerAddress();
                return this;
            }

            public Builder clearSupport() {
                copyOnWrite();
                ((VoteWitnessContract) this.instance).clearSupport();
                return this;
            }

            public Builder clearVotes() {
                copyOnWrite();
                ((VoteWitnessContract) this.instance).clearVotes();
                return this;
            }

            public String getOwnerAddress() {
                return ((VoteWitnessContract) this.instance).getOwnerAddress();
            }

            public ByteString getOwnerAddressBytes() {
                return ((VoteWitnessContract) this.instance).getOwnerAddressBytes();
            }

            public boolean getSupport() {
                return ((VoteWitnessContract) this.instance).getSupport();
            }

            public Vote getVotes(int i) {
                return ((VoteWitnessContract) this.instance).getVotes(i);
            }

            public int getVotesCount() {
                return ((VoteWitnessContract) this.instance).getVotesCount();
            }

            public List<Vote> getVotesList() {
                return Collections.unmodifiableList(((VoteWitnessContract) this.instance).getVotesList());
            }

            public Builder removeVotes(int i) {
                copyOnWrite();
                ((VoteWitnessContract) this.instance).removeVotes(i);
                return this;
            }

            public Builder setOwnerAddress(String str) {
                copyOnWrite();
                ((VoteWitnessContract) this.instance).setOwnerAddress(str);
                return this;
            }

            public Builder setOwnerAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((VoteWitnessContract) this.instance).setOwnerAddressBytes(byteString);
                return this;
            }

            public Builder setSupport(boolean z) {
                copyOnWrite();
                ((VoteWitnessContract) this.instance).setSupport(z);
                return this;
            }

            public Builder setVotes(int i, Vote vote) {
                copyOnWrite();
                ((VoteWitnessContract) this.instance).setVotes(i, vote);
                return this;
            }

            private Builder() {
                super(VoteWitnessContract.DEFAULT_INSTANCE);
            }

            public Builder addVotes(int i, Vote vote) {
                copyOnWrite();
                ((VoteWitnessContract) this.instance).addVotes(i, vote);
                return this;
            }

            public Builder setVotes(int i, Vote.Builder builder) {
                copyOnWrite();
                ((VoteWitnessContract) this.instance).setVotes(i, (Vote) builder.build());
                return this;
            }

            public Builder addVotes(Vote.Builder builder) {
                copyOnWrite();
                ((VoteWitnessContract) this.instance).addVotes((Vote) builder.build());
                return this;
            }

            public Builder addVotes(int i, Vote.Builder builder) {
                copyOnWrite();
                ((VoteWitnessContract) this.instance).addVotes(i, (Vote) builder.build());
                return this;
            }
        }

        public static final class Vote extends GeneratedMessageLite<Vote, Builder> implements VoteOrBuilder {
            /* access modifiers changed from: private */
            public static final Vote DEFAULT_INSTANCE;
            private static volatile im4<Vote> PARSER = null;
            public static final int VOTE_ADDRESS_FIELD_NUMBER = 1;
            public static final int VOTE_COUNT_FIELD_NUMBER = 2;
            private String voteAddress_ = "";
            private long voteCount_;

            public static final class Builder extends GeneratedMessageLite.C4930a<Vote, Builder> implements VoteOrBuilder {
                public /* synthetic */ Builder(C97731 r1) {
                    this();
                }

                public Builder clearVoteAddress() {
                    copyOnWrite();
                    ((Vote) this.instance).clearVoteAddress();
                    return this;
                }

                public Builder clearVoteCount() {
                    copyOnWrite();
                    ((Vote) this.instance).clearVoteCount();
                    return this;
                }

                public String getVoteAddress() {
                    return ((Vote) this.instance).getVoteAddress();
                }

                public ByteString getVoteAddressBytes() {
                    return ((Vote) this.instance).getVoteAddressBytes();
                }

                public long getVoteCount() {
                    return ((Vote) this.instance).getVoteCount();
                }

                public Builder setVoteAddress(String str) {
                    copyOnWrite();
                    ((Vote) this.instance).setVoteAddress(str);
                    return this;
                }

                public Builder setVoteAddressBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Vote) this.instance).setVoteAddressBytes(byteString);
                    return this;
                }

                public Builder setVoteCount(long j) {
                    copyOnWrite();
                    ((Vote) this.instance).setVoteCount(j);
                    return this;
                }

                private Builder() {
                    super(Vote.DEFAULT_INSTANCE);
                }
            }

            static {
                Vote vote = new Vote();
                DEFAULT_INSTANCE = vote;
                GeneratedMessageLite.registerDefaultInstance(Vote.class, vote);
            }

            private Vote() {
            }

            /* access modifiers changed from: private */
            public void clearVoteAddress() {
                this.voteAddress_ = getDefaultInstance().getVoteAddress();
            }

            /* access modifiers changed from: private */
            public void clearVoteCount() {
                this.voteCount_ = 0;
            }

            public static Vote getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static Vote parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Vote) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Vote parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Vote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<Vote> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setVoteAddress(String str) {
                str.getClass();
                this.voteAddress_ = str;
            }

            /* access modifiers changed from: private */
            public void setVoteAddressBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.voteAddress_ = byteString.toStringUtf8();
            }

            /* access modifiers changed from: private */
            public void setVoteCount(long j) {
                this.voteCount_ = j;
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97731.f46585xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Vote();
                    case 2:
                        return new Builder((C97731) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0002", new Object[]{"voteAddress_", "voteCount_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<Vote> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (Vote.class) {
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

            public String getVoteAddress() {
                return this.voteAddress_;
            }

            public ByteString getVoteAddressBytes() {
                return ByteString.copyFromUtf8(this.voteAddress_);
            }

            public long getVoteCount() {
                return this.voteCount_;
            }

            public static Builder newBuilder(Vote vote) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(vote);
            }

            public static Vote parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (Vote) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static Vote parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (Vote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static Vote parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Vote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Vote parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (Vote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static Vote parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Vote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Vote parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (Vote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static Vote parseFrom(InputStream inputStream) throws IOException {
                return (Vote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Vote parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (Vote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static Vote parseFrom(C4969g gVar) throws IOException {
                return (Vote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static Vote parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (Vote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public interface VoteOrBuilder extends qu3 {
            /* synthetic */ C4956c0 getDefaultInstanceForType();

            String getVoteAddress();

            ByteString getVoteAddressBytes();

            long getVoteCount();

            /* synthetic */ boolean isInitialized();
        }

        static {
            VoteWitnessContract voteWitnessContract = new VoteWitnessContract();
            DEFAULT_INSTANCE = voteWitnessContract;
            GeneratedMessageLite.registerDefaultInstance(VoteWitnessContract.class, voteWitnessContract);
        }

        private VoteWitnessContract() {
        }

        /* access modifiers changed from: private */
        public void addAllVotes(Iterable<? extends Vote> iterable) {
            ensureVotesIsMutable();
            C4949a.addAll(iterable, this.votes_);
        }

        /* access modifiers changed from: private */
        public void addVotes(Vote vote) {
            vote.getClass();
            ensureVotesIsMutable();
            this.votes_.add(vote);
        }

        /* access modifiers changed from: private */
        public void clearOwnerAddress() {
            this.ownerAddress_ = getDefaultInstance().getOwnerAddress();
        }

        /* access modifiers changed from: private */
        public void clearSupport() {
            this.support_ = false;
        }

        /* access modifiers changed from: private */
        public void clearVotes() {
            this.votes_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureVotesIsMutable() {
            C5011t.C5020i<Vote> iVar = this.votes_;
            if (!iVar.mo37090v()) {
                this.votes_ = GeneratedMessageLite.mutableCopy(iVar);
            }
        }

        public static VoteWitnessContract getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static VoteWitnessContract parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoteWitnessContract) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoteWitnessContract parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (VoteWitnessContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<VoteWitnessContract> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeVotes(int i) {
            ensureVotesIsMutable();
            this.votes_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setOwnerAddress(String str) {
            str.getClass();
            this.ownerAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setOwnerAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.ownerAddress_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setSupport(boolean z) {
            this.support_ = z;
        }

        /* access modifiers changed from: private */
        public void setVotes(int i, Vote vote) {
            vote.getClass();
            ensureVotesIsMutable();
            this.votes_.set(i, vote);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97731.f46585xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoteWitnessContract();
                case 2:
                    return new Builder((C97731) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003\u0007", new Object[]{"ownerAddress_", "votes_", Vote.class, "support_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<VoteWitnessContract> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (VoteWitnessContract.class) {
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

        public String getOwnerAddress() {
            return this.ownerAddress_;
        }

        public ByteString getOwnerAddressBytes() {
            return ByteString.copyFromUtf8(this.ownerAddress_);
        }

        public boolean getSupport() {
            return this.support_;
        }

        public Vote getVotes(int i) {
            return this.votes_.get(i);
        }

        public int getVotesCount() {
            return this.votes_.size();
        }

        public List<Vote> getVotesList() {
            return this.votes_;
        }

        public VoteOrBuilder getVotesOrBuilder(int i) {
            return this.votes_.get(i);
        }

        public List<? extends VoteOrBuilder> getVotesOrBuilderList() {
            return this.votes_;
        }

        public static Builder newBuilder(VoteWitnessContract voteWitnessContract) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(voteWitnessContract);
        }

        public static VoteWitnessContract parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (VoteWitnessContract) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static VoteWitnessContract parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (VoteWitnessContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static VoteWitnessContract parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoteWitnessContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* access modifiers changed from: private */
        public void addVotes(int i, Vote vote) {
            vote.getClass();
            ensureVotesIsMutable();
            this.votes_.add(i, vote);
        }

        public static VoteWitnessContract parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (VoteWitnessContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static VoteWitnessContract parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoteWitnessContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoteWitnessContract parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (VoteWitnessContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static VoteWitnessContract parseFrom(InputStream inputStream) throws IOException {
            return (VoteWitnessContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoteWitnessContract parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (VoteWitnessContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static VoteWitnessContract parseFrom(C4969g gVar) throws IOException {
            return (VoteWitnessContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static VoteWitnessContract parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (VoteWitnessContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface VoteWitnessContractOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getOwnerAddress();

        ByteString getOwnerAddressBytes();

        boolean getSupport();

        VoteWitnessContract.Vote getVotes(int i);

        int getVotesCount();

        List<VoteWitnessContract.Vote> getVotesList();

        /* synthetic */ boolean isInitialized();
    }

    public static final class WithdrawBalanceContract extends GeneratedMessageLite<WithdrawBalanceContract, Builder> implements WithdrawBalanceContractOrBuilder {
        /* access modifiers changed from: private */
        public static final WithdrawBalanceContract DEFAULT_INSTANCE;
        public static final int OWNER_ADDRESS_FIELD_NUMBER = 1;
        private static volatile im4<WithdrawBalanceContract> PARSER;
        private String ownerAddress_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<WithdrawBalanceContract, Builder> implements WithdrawBalanceContractOrBuilder {
            public /* synthetic */ Builder(C97731 r1) {
                this();
            }

            public Builder clearOwnerAddress() {
                copyOnWrite();
                ((WithdrawBalanceContract) this.instance).clearOwnerAddress();
                return this;
            }

            public String getOwnerAddress() {
                return ((WithdrawBalanceContract) this.instance).getOwnerAddress();
            }

            public ByteString getOwnerAddressBytes() {
                return ((WithdrawBalanceContract) this.instance).getOwnerAddressBytes();
            }

            public Builder setOwnerAddress(String str) {
                copyOnWrite();
                ((WithdrawBalanceContract) this.instance).setOwnerAddress(str);
                return this;
            }

            public Builder setOwnerAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((WithdrawBalanceContract) this.instance).setOwnerAddressBytes(byteString);
                return this;
            }

            private Builder() {
                super(WithdrawBalanceContract.DEFAULT_INSTANCE);
            }
        }

        static {
            WithdrawBalanceContract withdrawBalanceContract = new WithdrawBalanceContract();
            DEFAULT_INSTANCE = withdrawBalanceContract;
            GeneratedMessageLite.registerDefaultInstance(WithdrawBalanceContract.class, withdrawBalanceContract);
        }

        private WithdrawBalanceContract() {
        }

        /* access modifiers changed from: private */
        public void clearOwnerAddress() {
            this.ownerAddress_ = getDefaultInstance().getOwnerAddress();
        }

        public static WithdrawBalanceContract getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static WithdrawBalanceContract parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (WithdrawBalanceContract) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WithdrawBalanceContract parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (WithdrawBalanceContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<WithdrawBalanceContract> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setOwnerAddress(String str) {
            str.getClass();
            this.ownerAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setOwnerAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.ownerAddress_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97731.f46585xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new WithdrawBalanceContract();
                case 2:
                    return new Builder((C97731) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"ownerAddress_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<WithdrawBalanceContract> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (WithdrawBalanceContract.class) {
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

        public String getOwnerAddress() {
            return this.ownerAddress_;
        }

        public ByteString getOwnerAddressBytes() {
            return ByteString.copyFromUtf8(this.ownerAddress_);
        }

        public static Builder newBuilder(WithdrawBalanceContract withdrawBalanceContract) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(withdrawBalanceContract);
        }

        public static WithdrawBalanceContract parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (WithdrawBalanceContract) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static WithdrawBalanceContract parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (WithdrawBalanceContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static WithdrawBalanceContract parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (WithdrawBalanceContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static WithdrawBalanceContract parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (WithdrawBalanceContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static WithdrawBalanceContract parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (WithdrawBalanceContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static WithdrawBalanceContract parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (WithdrawBalanceContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static WithdrawBalanceContract parseFrom(InputStream inputStream) throws IOException {
            return (WithdrawBalanceContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WithdrawBalanceContract parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (WithdrawBalanceContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static WithdrawBalanceContract parseFrom(C4969g gVar) throws IOException {
            return (WithdrawBalanceContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static WithdrawBalanceContract parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (WithdrawBalanceContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface WithdrawBalanceContractOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getOwnerAddress();

        ByteString getOwnerAddressBytes();

        /* synthetic */ boolean isInitialized();
    }

    private Tron() {
    }

    public static void registerAllExtensions(C4987l lVar) {
    }
}
