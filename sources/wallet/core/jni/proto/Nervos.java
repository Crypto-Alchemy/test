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

public final class Nervos {

    /* renamed from: wallet.core.jni.proto.Nervos$1 */
    public static /* synthetic */ class C97561 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f46572xa1df5c61;

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
                f46572xa1df5c61 = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f46572xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f46572xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f46572xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f46572xa1df5c61     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f46572xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f46572xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wallet.core.jni.proto.Nervos.C97561.<clinit>():void");
        }
    }

    public static final class Cell extends GeneratedMessageLite<Cell, Builder> implements CellOrBuilder {
        public static final int BLOCK_HASH_FIELD_NUMBER = 7;
        public static final int BLOCK_NUMBER_FIELD_NUMBER = 6;
        public static final int CAPACITY_FIELD_NUMBER = 2;
        public static final int DATA_FIELD_NUMBER = 5;
        /* access modifiers changed from: private */
        public static final Cell DEFAULT_INSTANCE;
        public static final int INPUT_TYPE_FIELD_NUMBER = 9;
        public static final int LOCK_FIELD_NUMBER = 3;
        public static final int OUTPUT_TYPE_FIELD_NUMBER = 10;
        public static final int OUT_POINT_FIELD_NUMBER = 1;
        private static volatile im4<Cell> PARSER = null;
        public static final int SINCE_FIELD_NUMBER = 8;
        public static final int TYPE_FIELD_NUMBER = 4;
        private ByteString blockHash_;
        private long blockNumber_;
        private long capacity_;
        private ByteString data_;
        private ByteString inputType_;
        private Script lock_;
        private OutPoint outPoint_;
        private ByteString outputType_;
        private long since_;
        private Script type_;

        public static final class Builder extends GeneratedMessageLite.C4930a<Cell, Builder> implements CellOrBuilder {
            public /* synthetic */ Builder(C97561 r1) {
                this();
            }

            public Builder clearBlockHash() {
                copyOnWrite();
                ((Cell) this.instance).clearBlockHash();
                return this;
            }

            public Builder clearBlockNumber() {
                copyOnWrite();
                ((Cell) this.instance).clearBlockNumber();
                return this;
            }

            public Builder clearCapacity() {
                copyOnWrite();
                ((Cell) this.instance).clearCapacity();
                return this;
            }

            public Builder clearData() {
                copyOnWrite();
                ((Cell) this.instance).clearData();
                return this;
            }

            public Builder clearInputType() {
                copyOnWrite();
                ((Cell) this.instance).clearInputType();
                return this;
            }

            public Builder clearLock() {
                copyOnWrite();
                ((Cell) this.instance).clearLock();
                return this;
            }

            public Builder clearOutPoint() {
                copyOnWrite();
                ((Cell) this.instance).clearOutPoint();
                return this;
            }

            public Builder clearOutputType() {
                copyOnWrite();
                ((Cell) this.instance).clearOutputType();
                return this;
            }

            public Builder clearSince() {
                copyOnWrite();
                ((Cell) this.instance).clearSince();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((Cell) this.instance).clearType();
                return this;
            }

            public ByteString getBlockHash() {
                return ((Cell) this.instance).getBlockHash();
            }

            public long getBlockNumber() {
                return ((Cell) this.instance).getBlockNumber();
            }

            public long getCapacity() {
                return ((Cell) this.instance).getCapacity();
            }

            public ByteString getData() {
                return ((Cell) this.instance).getData();
            }

            public ByteString getInputType() {
                return ((Cell) this.instance).getInputType();
            }

            public Script getLock() {
                return ((Cell) this.instance).getLock();
            }

            public OutPoint getOutPoint() {
                return ((Cell) this.instance).getOutPoint();
            }

            public ByteString getOutputType() {
                return ((Cell) this.instance).getOutputType();
            }

            public long getSince() {
                return ((Cell) this.instance).getSince();
            }

            public Script getType() {
                return ((Cell) this.instance).getType();
            }

            public boolean hasLock() {
                return ((Cell) this.instance).hasLock();
            }

            public boolean hasOutPoint() {
                return ((Cell) this.instance).hasOutPoint();
            }

            public boolean hasType() {
                return ((Cell) this.instance).hasType();
            }

            public Builder mergeLock(Script script) {
                copyOnWrite();
                ((Cell) this.instance).mergeLock(script);
                return this;
            }

            public Builder mergeOutPoint(OutPoint outPoint) {
                copyOnWrite();
                ((Cell) this.instance).mergeOutPoint(outPoint);
                return this;
            }

            public Builder mergeType(Script script) {
                copyOnWrite();
                ((Cell) this.instance).mergeType(script);
                return this;
            }

            public Builder setBlockHash(ByteString byteString) {
                copyOnWrite();
                ((Cell) this.instance).setBlockHash(byteString);
                return this;
            }

            public Builder setBlockNumber(long j) {
                copyOnWrite();
                ((Cell) this.instance).setBlockNumber(j);
                return this;
            }

            public Builder setCapacity(long j) {
                copyOnWrite();
                ((Cell) this.instance).setCapacity(j);
                return this;
            }

            public Builder setData(ByteString byteString) {
                copyOnWrite();
                ((Cell) this.instance).setData(byteString);
                return this;
            }

            public Builder setInputType(ByteString byteString) {
                copyOnWrite();
                ((Cell) this.instance).setInputType(byteString);
                return this;
            }

            public Builder setLock(Script script) {
                copyOnWrite();
                ((Cell) this.instance).setLock(script);
                return this;
            }

            public Builder setOutPoint(OutPoint outPoint) {
                copyOnWrite();
                ((Cell) this.instance).setOutPoint(outPoint);
                return this;
            }

            public Builder setOutputType(ByteString byteString) {
                copyOnWrite();
                ((Cell) this.instance).setOutputType(byteString);
                return this;
            }

            public Builder setSince(long j) {
                copyOnWrite();
                ((Cell) this.instance).setSince(j);
                return this;
            }

            public Builder setType(Script script) {
                copyOnWrite();
                ((Cell) this.instance).setType(script);
                return this;
            }

            private Builder() {
                super(Cell.DEFAULT_INSTANCE);
            }

            public Builder setLock(Script.Builder builder) {
                copyOnWrite();
                ((Cell) this.instance).setLock((Script) builder.build());
                return this;
            }

            public Builder setOutPoint(OutPoint.Builder builder) {
                copyOnWrite();
                ((Cell) this.instance).setOutPoint((OutPoint) builder.build());
                return this;
            }

            public Builder setType(Script.Builder builder) {
                copyOnWrite();
                ((Cell) this.instance).setType((Script) builder.build());
                return this;
            }
        }

        static {
            Cell cell = new Cell();
            DEFAULT_INSTANCE = cell;
            GeneratedMessageLite.registerDefaultInstance(Cell.class, cell);
        }

        private Cell() {
            ByteString byteString = ByteString.EMPTY;
            this.data_ = byteString;
            this.blockHash_ = byteString;
            this.inputType_ = byteString;
            this.outputType_ = byteString;
        }

        /* access modifiers changed from: private */
        public void clearBlockHash() {
            this.blockHash_ = getDefaultInstance().getBlockHash();
        }

        /* access modifiers changed from: private */
        public void clearBlockNumber() {
            this.blockNumber_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearCapacity() {
            this.capacity_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearData() {
            this.data_ = getDefaultInstance().getData();
        }

        /* access modifiers changed from: private */
        public void clearInputType() {
            this.inputType_ = getDefaultInstance().getInputType();
        }

        /* access modifiers changed from: private */
        public void clearLock() {
            this.lock_ = null;
        }

        /* access modifiers changed from: private */
        public void clearOutPoint() {
            this.outPoint_ = null;
        }

        /* access modifiers changed from: private */
        public void clearOutputType() {
            this.outputType_ = getDefaultInstance().getOutputType();
        }

        /* access modifiers changed from: private */
        public void clearSince() {
            this.since_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearType() {
            this.type_ = null;
        }

        public static Cell getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeLock(Script script) {
            script.getClass();
            Script script2 = this.lock_;
            if (script2 == null || script2 == Script.getDefaultInstance()) {
                this.lock_ = script;
            } else {
                this.lock_ = (Script) ((Script.Builder) Script.newBuilder(this.lock_).mergeFrom(script)).buildPartial();
            }
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

        /* access modifiers changed from: private */
        public void mergeType(Script script) {
            script.getClass();
            Script script2 = this.type_;
            if (script2 == null || script2 == Script.getDefaultInstance()) {
                this.type_ = script;
            } else {
                this.type_ = (Script) ((Script.Builder) Script.newBuilder(this.type_).mergeFrom(script)).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Cell parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Cell) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Cell parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<Cell> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setBlockHash(ByteString byteString) {
            byteString.getClass();
            this.blockHash_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setBlockNumber(long j) {
            this.blockNumber_ = j;
        }

        /* access modifiers changed from: private */
        public void setCapacity(long j) {
            this.capacity_ = j;
        }

        /* access modifiers changed from: private */
        public void setData(ByteString byteString) {
            byteString.getClass();
            this.data_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setInputType(ByteString byteString) {
            byteString.getClass();
            this.inputType_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setLock(Script script) {
            script.getClass();
            this.lock_ = script;
        }

        /* access modifiers changed from: private */
        public void setOutPoint(OutPoint outPoint) {
            outPoint.getClass();
            this.outPoint_ = outPoint;
        }

        /* access modifiers changed from: private */
        public void setOutputType(ByteString byteString) {
            byteString.getClass();
            this.outputType_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setSince(long j) {
            this.since_ = j;
        }

        /* access modifiers changed from: private */
        public void setType(Script script) {
            script.getClass();
            this.type_ = script;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97561.f46572xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Cell();
                case 2:
                    return new Builder((C97561) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001\t\u0002\u0003\u0003\t\u0004\t\u0005\n\u0006\u0003\u0007\n\b\u0003\t\n\n\n", new Object[]{"outPoint_", "capacity_", "lock_", "type_", "data_", "blockNumber_", "blockHash_", "since_", "inputType_", "outputType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<Cell> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (Cell.class) {
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

        public ByteString getBlockHash() {
            return this.blockHash_;
        }

        public long getBlockNumber() {
            return this.blockNumber_;
        }

        public long getCapacity() {
            return this.capacity_;
        }

        public ByteString getData() {
            return this.data_;
        }

        public ByteString getInputType() {
            return this.inputType_;
        }

        public Script getLock() {
            Script script = this.lock_;
            if (script == null) {
                return Script.getDefaultInstance();
            }
            return script;
        }

        public OutPoint getOutPoint() {
            OutPoint outPoint = this.outPoint_;
            if (outPoint == null) {
                return OutPoint.getDefaultInstance();
            }
            return outPoint;
        }

        public ByteString getOutputType() {
            return this.outputType_;
        }

        public long getSince() {
            return this.since_;
        }

        public Script getType() {
            Script script = this.type_;
            if (script == null) {
                return Script.getDefaultInstance();
            }
            return script;
        }

        public boolean hasLock() {
            if (this.lock_ != null) {
                return true;
            }
            return false;
        }

        public boolean hasOutPoint() {
            if (this.outPoint_ != null) {
                return true;
            }
            return false;
        }

        public boolean hasType() {
            if (this.type_ != null) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(Cell cell) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(cell);
        }

        public static Cell parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Cell) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Cell parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (Cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static Cell parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Cell parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (Cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static Cell parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Cell parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (Cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static Cell parseFrom(InputStream inputStream) throws IOException {
            return (Cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Cell parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Cell parseFrom(C4969g gVar) throws IOException {
            return (Cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static Cell parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (Cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public static final class CellDep extends GeneratedMessageLite<CellDep, Builder> implements CellDepOrBuilder {
        /* access modifiers changed from: private */
        public static final CellDep DEFAULT_INSTANCE;
        public static final int DEP_TYPE_FIELD_NUMBER = 1;
        public static final int OUT_POINT_FIELD_NUMBER = 2;
        private static volatile im4<CellDep> PARSER;
        private String depType_ = "";
        private OutPoint outPoint_;

        public static final class Builder extends GeneratedMessageLite.C4930a<CellDep, Builder> implements CellDepOrBuilder {
            public /* synthetic */ Builder(C97561 r1) {
                this();
            }

            public Builder clearDepType() {
                copyOnWrite();
                ((CellDep) this.instance).clearDepType();
                return this;
            }

            public Builder clearOutPoint() {
                copyOnWrite();
                ((CellDep) this.instance).clearOutPoint();
                return this;
            }

            public String getDepType() {
                return ((CellDep) this.instance).getDepType();
            }

            public ByteString getDepTypeBytes() {
                return ((CellDep) this.instance).getDepTypeBytes();
            }

            public OutPoint getOutPoint() {
                return ((CellDep) this.instance).getOutPoint();
            }

            public boolean hasOutPoint() {
                return ((CellDep) this.instance).hasOutPoint();
            }

            public Builder mergeOutPoint(OutPoint outPoint) {
                copyOnWrite();
                ((CellDep) this.instance).mergeOutPoint(outPoint);
                return this;
            }

            public Builder setDepType(String str) {
                copyOnWrite();
                ((CellDep) this.instance).setDepType(str);
                return this;
            }

            public Builder setDepTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((CellDep) this.instance).setDepTypeBytes(byteString);
                return this;
            }

            public Builder setOutPoint(OutPoint outPoint) {
                copyOnWrite();
                ((CellDep) this.instance).setOutPoint(outPoint);
                return this;
            }

            private Builder() {
                super(CellDep.DEFAULT_INSTANCE);
            }

            public Builder setOutPoint(OutPoint.Builder builder) {
                copyOnWrite();
                ((CellDep) this.instance).setOutPoint((OutPoint) builder.build());
                return this;
            }
        }

        static {
            CellDep cellDep = new CellDep();
            DEFAULT_INSTANCE = cellDep;
            GeneratedMessageLite.registerDefaultInstance(CellDep.class, cellDep);
        }

        private CellDep() {
        }

        /* access modifiers changed from: private */
        public void clearDepType() {
            this.depType_ = getDefaultInstance().getDepType();
        }

        /* access modifiers changed from: private */
        public void clearOutPoint() {
            this.outPoint_ = null;
        }

        public static CellDep getDefaultInstance() {
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

        public static CellDep parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CellDep) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CellDep parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CellDep) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<CellDep> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setDepType(String str) {
            str.getClass();
            this.depType_ = str;
        }

        /* access modifiers changed from: private */
        public void setDepTypeBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.depType_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setOutPoint(OutPoint outPoint) {
            outPoint.getClass();
            this.outPoint_ = outPoint;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97561.f46572xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new CellDep();
                case 2:
                    return new Builder((C97561) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"depType_", "outPoint_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<CellDep> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (CellDep.class) {
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

        public String getDepType() {
            return this.depType_;
        }

        public ByteString getDepTypeBytes() {
            return ByteString.copyFromUtf8(this.depType_);
        }

        public OutPoint getOutPoint() {
            OutPoint outPoint = this.outPoint_;
            if (outPoint == null) {
                return OutPoint.getDefaultInstance();
            }
            return outPoint;
        }

        public boolean hasOutPoint() {
            if (this.outPoint_ != null) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(CellDep cellDep) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(cellDep);
        }

        public static CellDep parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (CellDep) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static CellDep parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (CellDep) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static CellDep parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CellDep) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CellDep parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (CellDep) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static CellDep parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CellDep) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CellDep parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (CellDep) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static CellDep parseFrom(InputStream inputStream) throws IOException {
            return (CellDep) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CellDep parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (CellDep) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static CellDep parseFrom(C4969g gVar) throws IOException {
            return (CellDep) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static CellDep parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (CellDep) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface CellDepOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getDepType();

        ByteString getDepTypeBytes();

        OutPoint getOutPoint();

        boolean hasOutPoint();

        /* synthetic */ boolean isInitialized();
    }

    public interface CellOrBuilder extends qu3 {
        ByteString getBlockHash();

        long getBlockNumber();

        long getCapacity();

        ByteString getData();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        ByteString getInputType();

        Script getLock();

        OutPoint getOutPoint();

        ByteString getOutputType();

        long getSince();

        Script getType();

        boolean hasLock();

        boolean hasOutPoint();

        boolean hasType();

        /* synthetic */ boolean isInitialized();
    }

    public static final class CellOutput extends GeneratedMessageLite<CellOutput, Builder> implements CellOutputOrBuilder {
        public static final int CAPACITY_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final CellOutput DEFAULT_INSTANCE;
        public static final int LOCK_FIELD_NUMBER = 2;
        private static volatile im4<CellOutput> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 3;
        private long capacity_;
        private Script lock_;
        private Script type_;

        public static final class Builder extends GeneratedMessageLite.C4930a<CellOutput, Builder> implements CellOutputOrBuilder {
            public /* synthetic */ Builder(C97561 r1) {
                this();
            }

            public Builder clearCapacity() {
                copyOnWrite();
                ((CellOutput) this.instance).clearCapacity();
                return this;
            }

            public Builder clearLock() {
                copyOnWrite();
                ((CellOutput) this.instance).clearLock();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((CellOutput) this.instance).clearType();
                return this;
            }

            public long getCapacity() {
                return ((CellOutput) this.instance).getCapacity();
            }

            public Script getLock() {
                return ((CellOutput) this.instance).getLock();
            }

            public Script getType() {
                return ((CellOutput) this.instance).getType();
            }

            public boolean hasLock() {
                return ((CellOutput) this.instance).hasLock();
            }

            public boolean hasType() {
                return ((CellOutput) this.instance).hasType();
            }

            public Builder mergeLock(Script script) {
                copyOnWrite();
                ((CellOutput) this.instance).mergeLock(script);
                return this;
            }

            public Builder mergeType(Script script) {
                copyOnWrite();
                ((CellOutput) this.instance).mergeType(script);
                return this;
            }

            public Builder setCapacity(long j) {
                copyOnWrite();
                ((CellOutput) this.instance).setCapacity(j);
                return this;
            }

            public Builder setLock(Script script) {
                copyOnWrite();
                ((CellOutput) this.instance).setLock(script);
                return this;
            }

            public Builder setType(Script script) {
                copyOnWrite();
                ((CellOutput) this.instance).setType(script);
                return this;
            }

            private Builder() {
                super(CellOutput.DEFAULT_INSTANCE);
            }

            public Builder setLock(Script.Builder builder) {
                copyOnWrite();
                ((CellOutput) this.instance).setLock((Script) builder.build());
                return this;
            }

            public Builder setType(Script.Builder builder) {
                copyOnWrite();
                ((CellOutput) this.instance).setType((Script) builder.build());
                return this;
            }
        }

        static {
            CellOutput cellOutput = new CellOutput();
            DEFAULT_INSTANCE = cellOutput;
            GeneratedMessageLite.registerDefaultInstance(CellOutput.class, cellOutput);
        }

        private CellOutput() {
        }

        /* access modifiers changed from: private */
        public void clearCapacity() {
            this.capacity_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearLock() {
            this.lock_ = null;
        }

        /* access modifiers changed from: private */
        public void clearType() {
            this.type_ = null;
        }

        public static CellOutput getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeLock(Script script) {
            script.getClass();
            Script script2 = this.lock_;
            if (script2 == null || script2 == Script.getDefaultInstance()) {
                this.lock_ = script;
            } else {
                this.lock_ = (Script) ((Script.Builder) Script.newBuilder(this.lock_).mergeFrom(script)).buildPartial();
            }
        }

        /* access modifiers changed from: private */
        public void mergeType(Script script) {
            script.getClass();
            Script script2 = this.type_;
            if (script2 == null || script2 == Script.getDefaultInstance()) {
                this.type_ = script;
            } else {
                this.type_ = (Script) ((Script.Builder) Script.newBuilder(this.type_).mergeFrom(script)).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static CellOutput parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CellOutput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CellOutput parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CellOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<CellOutput> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setCapacity(long j) {
            this.capacity_ = j;
        }

        /* access modifiers changed from: private */
        public void setLock(Script script) {
            script.getClass();
            this.lock_ = script;
        }

        /* access modifiers changed from: private */
        public void setType(Script script) {
            script.getClass();
            this.type_ = script;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97561.f46572xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new CellOutput();
                case 2:
                    return new Builder((C97561) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0003\u0002\t\u0003\t", new Object[]{"capacity_", "lock_", "type_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<CellOutput> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (CellOutput.class) {
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

        public long getCapacity() {
            return this.capacity_;
        }

        public Script getLock() {
            Script script = this.lock_;
            if (script == null) {
                return Script.getDefaultInstance();
            }
            return script;
        }

        public Script getType() {
            Script script = this.type_;
            if (script == null) {
                return Script.getDefaultInstance();
            }
            return script;
        }

        public boolean hasLock() {
            if (this.lock_ != null) {
                return true;
            }
            return false;
        }

        public boolean hasType() {
            if (this.type_ != null) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(CellOutput cellOutput) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(cellOutput);
        }

        public static CellOutput parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (CellOutput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static CellOutput parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (CellOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static CellOutput parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CellOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CellOutput parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (CellOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static CellOutput parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CellOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CellOutput parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (CellOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static CellOutput parseFrom(InputStream inputStream) throws IOException {
            return (CellOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CellOutput parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (CellOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static CellOutput parseFrom(C4969g gVar) throws IOException {
            return (CellOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static CellOutput parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (CellOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface CellOutputOrBuilder extends qu3 {
        long getCapacity();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        Script getLock();

        Script getType();

        boolean hasLock();

        boolean hasType();

        /* synthetic */ boolean isInitialized();
    }

    public static final class DaoDeposit extends GeneratedMessageLite<DaoDeposit, Builder> implements DaoDepositOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 3;
        public static final int CHANGE_ADDRESS_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final DaoDeposit DEFAULT_INSTANCE;
        private static volatile im4<DaoDeposit> PARSER = null;
        public static final int TO_ADDRESS_FIELD_NUMBER = 1;
        private long amount_;
        private String changeAddress_ = "";
        private String toAddress_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<DaoDeposit, Builder> implements DaoDepositOrBuilder {
            public /* synthetic */ Builder(C97561 r1) {
                this();
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((DaoDeposit) this.instance).clearAmount();
                return this;
            }

            public Builder clearChangeAddress() {
                copyOnWrite();
                ((DaoDeposit) this.instance).clearChangeAddress();
                return this;
            }

            public Builder clearToAddress() {
                copyOnWrite();
                ((DaoDeposit) this.instance).clearToAddress();
                return this;
            }

            public long getAmount() {
                return ((DaoDeposit) this.instance).getAmount();
            }

            public String getChangeAddress() {
                return ((DaoDeposit) this.instance).getChangeAddress();
            }

            public ByteString getChangeAddressBytes() {
                return ((DaoDeposit) this.instance).getChangeAddressBytes();
            }

            public String getToAddress() {
                return ((DaoDeposit) this.instance).getToAddress();
            }

            public ByteString getToAddressBytes() {
                return ((DaoDeposit) this.instance).getToAddressBytes();
            }

            public Builder setAmount(long j) {
                copyOnWrite();
                ((DaoDeposit) this.instance).setAmount(j);
                return this;
            }

            public Builder setChangeAddress(String str) {
                copyOnWrite();
                ((DaoDeposit) this.instance).setChangeAddress(str);
                return this;
            }

            public Builder setChangeAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((DaoDeposit) this.instance).setChangeAddressBytes(byteString);
                return this;
            }

            public Builder setToAddress(String str) {
                copyOnWrite();
                ((DaoDeposit) this.instance).setToAddress(str);
                return this;
            }

            public Builder setToAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((DaoDeposit) this.instance).setToAddressBytes(byteString);
                return this;
            }

            private Builder() {
                super(DaoDeposit.DEFAULT_INSTANCE);
            }
        }

        static {
            DaoDeposit daoDeposit = new DaoDeposit();
            DEFAULT_INSTANCE = daoDeposit;
            GeneratedMessageLite.registerDefaultInstance(DaoDeposit.class, daoDeposit);
        }

        private DaoDeposit() {
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
        public void clearToAddress() {
            this.toAddress_ = getDefaultInstance().getToAddress();
        }

        public static DaoDeposit getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static DaoDeposit parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DaoDeposit) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DaoDeposit parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DaoDeposit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<DaoDeposit> parser() {
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
            switch (C97561.f46572xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new DaoDeposit();
                case 2:
                    return new Builder((C97561) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0003", new Object[]{"toAddress_", "changeAddress_", "amount_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<DaoDeposit> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (DaoDeposit.class) {
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

        public String getToAddress() {
            return this.toAddress_;
        }

        public ByteString getToAddressBytes() {
            return ByteString.copyFromUtf8(this.toAddress_);
        }

        public static Builder newBuilder(DaoDeposit daoDeposit) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(daoDeposit);
        }

        public static DaoDeposit parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (DaoDeposit) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static DaoDeposit parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (DaoDeposit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static DaoDeposit parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DaoDeposit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DaoDeposit parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (DaoDeposit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static DaoDeposit parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DaoDeposit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DaoDeposit parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (DaoDeposit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static DaoDeposit parseFrom(InputStream inputStream) throws IOException {
            return (DaoDeposit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DaoDeposit parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (DaoDeposit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static DaoDeposit parseFrom(C4969g gVar) throws IOException {
            return (DaoDeposit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static DaoDeposit parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (DaoDeposit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface DaoDepositOrBuilder extends qu3 {
        long getAmount();

        String getChangeAddress();

        ByteString getChangeAddressBytes();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getToAddress();

        ByteString getToAddressBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class DaoWithdrawPhase1 extends GeneratedMessageLite<DaoWithdrawPhase1, Builder> implements DaoWithdrawPhase1OrBuilder {
        public static final int CHANGE_ADDRESS_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final DaoWithdrawPhase1 DEFAULT_INSTANCE;
        public static final int DEPOSIT_CELL_FIELD_NUMBER = 1;
        private static volatile im4<DaoWithdrawPhase1> PARSER;
        private String changeAddress_ = "";
        private Cell depositCell_;

        public static final class Builder extends GeneratedMessageLite.C4930a<DaoWithdrawPhase1, Builder> implements DaoWithdrawPhase1OrBuilder {
            public /* synthetic */ Builder(C97561 r1) {
                this();
            }

            public Builder clearChangeAddress() {
                copyOnWrite();
                ((DaoWithdrawPhase1) this.instance).clearChangeAddress();
                return this;
            }

            public Builder clearDepositCell() {
                copyOnWrite();
                ((DaoWithdrawPhase1) this.instance).clearDepositCell();
                return this;
            }

            public String getChangeAddress() {
                return ((DaoWithdrawPhase1) this.instance).getChangeAddress();
            }

            public ByteString getChangeAddressBytes() {
                return ((DaoWithdrawPhase1) this.instance).getChangeAddressBytes();
            }

            public Cell getDepositCell() {
                return ((DaoWithdrawPhase1) this.instance).getDepositCell();
            }

            public boolean hasDepositCell() {
                return ((DaoWithdrawPhase1) this.instance).hasDepositCell();
            }

            public Builder mergeDepositCell(Cell cell) {
                copyOnWrite();
                ((DaoWithdrawPhase1) this.instance).mergeDepositCell(cell);
                return this;
            }

            public Builder setChangeAddress(String str) {
                copyOnWrite();
                ((DaoWithdrawPhase1) this.instance).setChangeAddress(str);
                return this;
            }

            public Builder setChangeAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((DaoWithdrawPhase1) this.instance).setChangeAddressBytes(byteString);
                return this;
            }

            public Builder setDepositCell(Cell cell) {
                copyOnWrite();
                ((DaoWithdrawPhase1) this.instance).setDepositCell(cell);
                return this;
            }

            private Builder() {
                super(DaoWithdrawPhase1.DEFAULT_INSTANCE);
            }

            public Builder setDepositCell(Cell.Builder builder) {
                copyOnWrite();
                ((DaoWithdrawPhase1) this.instance).setDepositCell((Cell) builder.build());
                return this;
            }
        }

        static {
            DaoWithdrawPhase1 daoWithdrawPhase1 = new DaoWithdrawPhase1();
            DEFAULT_INSTANCE = daoWithdrawPhase1;
            GeneratedMessageLite.registerDefaultInstance(DaoWithdrawPhase1.class, daoWithdrawPhase1);
        }

        private DaoWithdrawPhase1() {
        }

        /* access modifiers changed from: private */
        public void clearChangeAddress() {
            this.changeAddress_ = getDefaultInstance().getChangeAddress();
        }

        /* access modifiers changed from: private */
        public void clearDepositCell() {
            this.depositCell_ = null;
        }

        public static DaoWithdrawPhase1 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeDepositCell(Cell cell) {
            cell.getClass();
            Cell cell2 = this.depositCell_;
            if (cell2 == null || cell2 == Cell.getDefaultInstance()) {
                this.depositCell_ = cell;
            } else {
                this.depositCell_ = (Cell) ((Cell.Builder) Cell.newBuilder(this.depositCell_).mergeFrom(cell)).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static DaoWithdrawPhase1 parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DaoWithdrawPhase1) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DaoWithdrawPhase1 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DaoWithdrawPhase1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<DaoWithdrawPhase1> parser() {
            return DEFAULT_INSTANCE.getParserForType();
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
        public void setDepositCell(Cell cell) {
            cell.getClass();
            this.depositCell_ = cell;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97561.f46572xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new DaoWithdrawPhase1();
                case 2:
                    return new Builder((C97561) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002Ȉ", new Object[]{"depositCell_", "changeAddress_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<DaoWithdrawPhase1> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (DaoWithdrawPhase1.class) {
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

        public String getChangeAddress() {
            return this.changeAddress_;
        }

        public ByteString getChangeAddressBytes() {
            return ByteString.copyFromUtf8(this.changeAddress_);
        }

        public Cell getDepositCell() {
            Cell cell = this.depositCell_;
            if (cell == null) {
                return Cell.getDefaultInstance();
            }
            return cell;
        }

        public boolean hasDepositCell() {
            if (this.depositCell_ != null) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(DaoWithdrawPhase1 daoWithdrawPhase1) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(daoWithdrawPhase1);
        }

        public static DaoWithdrawPhase1 parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (DaoWithdrawPhase1) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static DaoWithdrawPhase1 parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (DaoWithdrawPhase1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static DaoWithdrawPhase1 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DaoWithdrawPhase1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DaoWithdrawPhase1 parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (DaoWithdrawPhase1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static DaoWithdrawPhase1 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DaoWithdrawPhase1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DaoWithdrawPhase1 parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (DaoWithdrawPhase1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static DaoWithdrawPhase1 parseFrom(InputStream inputStream) throws IOException {
            return (DaoWithdrawPhase1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DaoWithdrawPhase1 parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (DaoWithdrawPhase1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static DaoWithdrawPhase1 parseFrom(C4969g gVar) throws IOException {
            return (DaoWithdrawPhase1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static DaoWithdrawPhase1 parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (DaoWithdrawPhase1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface DaoWithdrawPhase1OrBuilder extends qu3 {
        String getChangeAddress();

        ByteString getChangeAddressBytes();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        Cell getDepositCell();

        boolean hasDepositCell();

        /* synthetic */ boolean isInitialized();
    }

    public static final class DaoWithdrawPhase2 extends GeneratedMessageLite<DaoWithdrawPhase2, Builder> implements DaoWithdrawPhase2OrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final DaoWithdrawPhase2 DEFAULT_INSTANCE;
        public static final int DEPOSIT_CELL_FIELD_NUMBER = 1;
        private static volatile im4<DaoWithdrawPhase2> PARSER = null;
        public static final int WITHDRAWING_CELL_FIELD_NUMBER = 2;
        private long amount_;
        private Cell depositCell_;
        private Cell withdrawingCell_;

        public static final class Builder extends GeneratedMessageLite.C4930a<DaoWithdrawPhase2, Builder> implements DaoWithdrawPhase2OrBuilder {
            public /* synthetic */ Builder(C97561 r1) {
                this();
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((DaoWithdrawPhase2) this.instance).clearAmount();
                return this;
            }

            public Builder clearDepositCell() {
                copyOnWrite();
                ((DaoWithdrawPhase2) this.instance).clearDepositCell();
                return this;
            }

            public Builder clearWithdrawingCell() {
                copyOnWrite();
                ((DaoWithdrawPhase2) this.instance).clearWithdrawingCell();
                return this;
            }

            public long getAmount() {
                return ((DaoWithdrawPhase2) this.instance).getAmount();
            }

            public Cell getDepositCell() {
                return ((DaoWithdrawPhase2) this.instance).getDepositCell();
            }

            public Cell getWithdrawingCell() {
                return ((DaoWithdrawPhase2) this.instance).getWithdrawingCell();
            }

            public boolean hasDepositCell() {
                return ((DaoWithdrawPhase2) this.instance).hasDepositCell();
            }

            public boolean hasWithdrawingCell() {
                return ((DaoWithdrawPhase2) this.instance).hasWithdrawingCell();
            }

            public Builder mergeDepositCell(Cell cell) {
                copyOnWrite();
                ((DaoWithdrawPhase2) this.instance).mergeDepositCell(cell);
                return this;
            }

            public Builder mergeWithdrawingCell(Cell cell) {
                copyOnWrite();
                ((DaoWithdrawPhase2) this.instance).mergeWithdrawingCell(cell);
                return this;
            }

            public Builder setAmount(long j) {
                copyOnWrite();
                ((DaoWithdrawPhase2) this.instance).setAmount(j);
                return this;
            }

            public Builder setDepositCell(Cell cell) {
                copyOnWrite();
                ((DaoWithdrawPhase2) this.instance).setDepositCell(cell);
                return this;
            }

            public Builder setWithdrawingCell(Cell cell) {
                copyOnWrite();
                ((DaoWithdrawPhase2) this.instance).setWithdrawingCell(cell);
                return this;
            }

            private Builder() {
                super(DaoWithdrawPhase2.DEFAULT_INSTANCE);
            }

            public Builder setDepositCell(Cell.Builder builder) {
                copyOnWrite();
                ((DaoWithdrawPhase2) this.instance).setDepositCell((Cell) builder.build());
                return this;
            }

            public Builder setWithdrawingCell(Cell.Builder builder) {
                copyOnWrite();
                ((DaoWithdrawPhase2) this.instance).setWithdrawingCell((Cell) builder.build());
                return this;
            }
        }

        static {
            DaoWithdrawPhase2 daoWithdrawPhase2 = new DaoWithdrawPhase2();
            DEFAULT_INSTANCE = daoWithdrawPhase2;
            GeneratedMessageLite.registerDefaultInstance(DaoWithdrawPhase2.class, daoWithdrawPhase2);
        }

        private DaoWithdrawPhase2() {
        }

        /* access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearDepositCell() {
            this.depositCell_ = null;
        }

        /* access modifiers changed from: private */
        public void clearWithdrawingCell() {
            this.withdrawingCell_ = null;
        }

        public static DaoWithdrawPhase2 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeDepositCell(Cell cell) {
            cell.getClass();
            Cell cell2 = this.depositCell_;
            if (cell2 == null || cell2 == Cell.getDefaultInstance()) {
                this.depositCell_ = cell;
            } else {
                this.depositCell_ = (Cell) ((Cell.Builder) Cell.newBuilder(this.depositCell_).mergeFrom(cell)).buildPartial();
            }
        }

        /* access modifiers changed from: private */
        public void mergeWithdrawingCell(Cell cell) {
            cell.getClass();
            Cell cell2 = this.withdrawingCell_;
            if (cell2 == null || cell2 == Cell.getDefaultInstance()) {
                this.withdrawingCell_ = cell;
            } else {
                this.withdrawingCell_ = (Cell) ((Cell.Builder) Cell.newBuilder(this.withdrawingCell_).mergeFrom(cell)).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static DaoWithdrawPhase2 parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DaoWithdrawPhase2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DaoWithdrawPhase2 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DaoWithdrawPhase2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<DaoWithdrawPhase2> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAmount(long j) {
            this.amount_ = j;
        }

        /* access modifiers changed from: private */
        public void setDepositCell(Cell cell) {
            cell.getClass();
            this.depositCell_ = cell;
        }

        /* access modifiers changed from: private */
        public void setWithdrawingCell(Cell cell) {
            cell.getClass();
            this.withdrawingCell_ = cell;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97561.f46572xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new DaoWithdrawPhase2();
                case 2:
                    return new Builder((C97561) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\u0003", new Object[]{"depositCell_", "withdrawingCell_", "amount_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<DaoWithdrawPhase2> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (DaoWithdrawPhase2.class) {
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

        public Cell getDepositCell() {
            Cell cell = this.depositCell_;
            if (cell == null) {
                return Cell.getDefaultInstance();
            }
            return cell;
        }

        public Cell getWithdrawingCell() {
            Cell cell = this.withdrawingCell_;
            if (cell == null) {
                return Cell.getDefaultInstance();
            }
            return cell;
        }

        public boolean hasDepositCell() {
            if (this.depositCell_ != null) {
                return true;
            }
            return false;
        }

        public boolean hasWithdrawingCell() {
            if (this.withdrawingCell_ != null) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(DaoWithdrawPhase2 daoWithdrawPhase2) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(daoWithdrawPhase2);
        }

        public static DaoWithdrawPhase2 parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (DaoWithdrawPhase2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static DaoWithdrawPhase2 parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (DaoWithdrawPhase2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static DaoWithdrawPhase2 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DaoWithdrawPhase2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DaoWithdrawPhase2 parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (DaoWithdrawPhase2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static DaoWithdrawPhase2 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DaoWithdrawPhase2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DaoWithdrawPhase2 parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (DaoWithdrawPhase2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static DaoWithdrawPhase2 parseFrom(InputStream inputStream) throws IOException {
            return (DaoWithdrawPhase2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DaoWithdrawPhase2 parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (DaoWithdrawPhase2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static DaoWithdrawPhase2 parseFrom(C4969g gVar) throws IOException {
            return (DaoWithdrawPhase2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static DaoWithdrawPhase2 parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (DaoWithdrawPhase2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface DaoWithdrawPhase2OrBuilder extends qu3 {
        long getAmount();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        Cell getDepositCell();

        Cell getWithdrawingCell();

        boolean hasDepositCell();

        boolean hasWithdrawingCell();

        /* synthetic */ boolean isInitialized();
    }

    public static final class NativeTransfer extends GeneratedMessageLite<NativeTransfer, Builder> implements NativeTransferOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 3;
        public static final int CHANGE_ADDRESS_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final NativeTransfer DEFAULT_INSTANCE;
        private static volatile im4<NativeTransfer> PARSER = null;
        public static final int TO_ADDRESS_FIELD_NUMBER = 1;
        public static final int USE_MAX_AMOUNT_FIELD_NUMBER = 4;
        private long amount_;
        private String changeAddress_ = "";
        private String toAddress_ = "";
        private boolean useMaxAmount_;

        public static final class Builder extends GeneratedMessageLite.C4930a<NativeTransfer, Builder> implements NativeTransferOrBuilder {
            public /* synthetic */ Builder(C97561 r1) {
                this();
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((NativeTransfer) this.instance).clearAmount();
                return this;
            }

            public Builder clearChangeAddress() {
                copyOnWrite();
                ((NativeTransfer) this.instance).clearChangeAddress();
                return this;
            }

            public Builder clearToAddress() {
                copyOnWrite();
                ((NativeTransfer) this.instance).clearToAddress();
                return this;
            }

            public Builder clearUseMaxAmount() {
                copyOnWrite();
                ((NativeTransfer) this.instance).clearUseMaxAmount();
                return this;
            }

            public long getAmount() {
                return ((NativeTransfer) this.instance).getAmount();
            }

            public String getChangeAddress() {
                return ((NativeTransfer) this.instance).getChangeAddress();
            }

            public ByteString getChangeAddressBytes() {
                return ((NativeTransfer) this.instance).getChangeAddressBytes();
            }

            public String getToAddress() {
                return ((NativeTransfer) this.instance).getToAddress();
            }

            public ByteString getToAddressBytes() {
                return ((NativeTransfer) this.instance).getToAddressBytes();
            }

            public boolean getUseMaxAmount() {
                return ((NativeTransfer) this.instance).getUseMaxAmount();
            }

            public Builder setAmount(long j) {
                copyOnWrite();
                ((NativeTransfer) this.instance).setAmount(j);
                return this;
            }

            public Builder setChangeAddress(String str) {
                copyOnWrite();
                ((NativeTransfer) this.instance).setChangeAddress(str);
                return this;
            }

            public Builder setChangeAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((NativeTransfer) this.instance).setChangeAddressBytes(byteString);
                return this;
            }

            public Builder setToAddress(String str) {
                copyOnWrite();
                ((NativeTransfer) this.instance).setToAddress(str);
                return this;
            }

            public Builder setToAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((NativeTransfer) this.instance).setToAddressBytes(byteString);
                return this;
            }

            public Builder setUseMaxAmount(boolean z) {
                copyOnWrite();
                ((NativeTransfer) this.instance).setUseMaxAmount(z);
                return this;
            }

            private Builder() {
                super(NativeTransfer.DEFAULT_INSTANCE);
            }
        }

        static {
            NativeTransfer nativeTransfer = new NativeTransfer();
            DEFAULT_INSTANCE = nativeTransfer;
            GeneratedMessageLite.registerDefaultInstance(NativeTransfer.class, nativeTransfer);
        }

        private NativeTransfer() {
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
        public void clearToAddress() {
            this.toAddress_ = getDefaultInstance().getToAddress();
        }

        /* access modifiers changed from: private */
        public void clearUseMaxAmount() {
            this.useMaxAmount_ = false;
        }

        public static NativeTransfer getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static NativeTransfer parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NativeTransfer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NativeTransfer parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (NativeTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<NativeTransfer> parser() {
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
        public void setUseMaxAmount(boolean z) {
            this.useMaxAmount_ = z;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97561.f46572xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new NativeTransfer();
                case 2:
                    return new Builder((C97561) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0003\u0004\u0007", new Object[]{"toAddress_", "changeAddress_", "amount_", "useMaxAmount_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<NativeTransfer> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (NativeTransfer.class) {
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

        public String getToAddress() {
            return this.toAddress_;
        }

        public ByteString getToAddressBytes() {
            return ByteString.copyFromUtf8(this.toAddress_);
        }

        public boolean getUseMaxAmount() {
            return this.useMaxAmount_;
        }

        public static Builder newBuilder(NativeTransfer nativeTransfer) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(nativeTransfer);
        }

        public static NativeTransfer parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (NativeTransfer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static NativeTransfer parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (NativeTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static NativeTransfer parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (NativeTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NativeTransfer parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (NativeTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static NativeTransfer parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (NativeTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NativeTransfer parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (NativeTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static NativeTransfer parseFrom(InputStream inputStream) throws IOException {
            return (NativeTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NativeTransfer parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (NativeTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static NativeTransfer parseFrom(C4969g gVar) throws IOException {
            return (NativeTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static NativeTransfer parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (NativeTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface NativeTransferOrBuilder extends qu3 {
        long getAmount();

        String getChangeAddress();

        ByteString getChangeAddressBytes();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getToAddress();

        ByteString getToAddressBytes();

        boolean getUseMaxAmount();

        /* synthetic */ boolean isInitialized();
    }

    public static final class OutPoint extends GeneratedMessageLite<OutPoint, Builder> implements OutPointOrBuilder {
        /* access modifiers changed from: private */
        public static final OutPoint DEFAULT_INSTANCE;
        public static final int INDEX_FIELD_NUMBER = 2;
        private static volatile im4<OutPoint> PARSER = null;
        public static final int TX_HASH_FIELD_NUMBER = 1;
        private int index_;
        private ByteString txHash_ = ByteString.EMPTY;

        public static final class Builder extends GeneratedMessageLite.C4930a<OutPoint, Builder> implements OutPointOrBuilder {
            public /* synthetic */ Builder(C97561 r1) {
                this();
            }

            public Builder clearIndex() {
                copyOnWrite();
                ((OutPoint) this.instance).clearIndex();
                return this;
            }

            public Builder clearTxHash() {
                copyOnWrite();
                ((OutPoint) this.instance).clearTxHash();
                return this;
            }

            public int getIndex() {
                return ((OutPoint) this.instance).getIndex();
            }

            public ByteString getTxHash() {
                return ((OutPoint) this.instance).getTxHash();
            }

            public Builder setIndex(int i) {
                copyOnWrite();
                ((OutPoint) this.instance).setIndex(i);
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
        public void clearIndex() {
            this.index_ = 0;
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
        public void setIndex(int i) {
            this.index_ = i;
        }

        /* access modifiers changed from: private */
        public void setTxHash(ByteString byteString) {
            byteString.getClass();
            this.txHash_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97561.f46572xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new OutPoint();
                case 2:
                    return new Builder((C97561) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\u000b", new Object[]{"txHash_", "index_"});
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

        public int getIndex() {
            return this.index_;
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

        int getIndex();

        ByteString getTxHash();

        /* synthetic */ boolean isInitialized();
    }

    public static final class Script extends GeneratedMessageLite<Script, Builder> implements ScriptOrBuilder {
        public static final int ARGS_FIELD_NUMBER = 3;
        public static final int CODE_HASH_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final Script DEFAULT_INSTANCE;
        public static final int HASH_TYPE_FIELD_NUMBER = 2;
        private static volatile im4<Script> PARSER;
        private ByteString args_;
        private ByteString codeHash_;
        private String hashType_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<Script, Builder> implements ScriptOrBuilder {
            public /* synthetic */ Builder(C97561 r1) {
                this();
            }

            public Builder clearArgs() {
                copyOnWrite();
                ((Script) this.instance).clearArgs();
                return this;
            }

            public Builder clearCodeHash() {
                copyOnWrite();
                ((Script) this.instance).clearCodeHash();
                return this;
            }

            public Builder clearHashType() {
                copyOnWrite();
                ((Script) this.instance).clearHashType();
                return this;
            }

            public ByteString getArgs() {
                return ((Script) this.instance).getArgs();
            }

            public ByteString getCodeHash() {
                return ((Script) this.instance).getCodeHash();
            }

            public String getHashType() {
                return ((Script) this.instance).getHashType();
            }

            public ByteString getHashTypeBytes() {
                return ((Script) this.instance).getHashTypeBytes();
            }

            public Builder setArgs(ByteString byteString) {
                copyOnWrite();
                ((Script) this.instance).setArgs(byteString);
                return this;
            }

            public Builder setCodeHash(ByteString byteString) {
                copyOnWrite();
                ((Script) this.instance).setCodeHash(byteString);
                return this;
            }

            public Builder setHashType(String str) {
                copyOnWrite();
                ((Script) this.instance).setHashType(str);
                return this;
            }

            public Builder setHashTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((Script) this.instance).setHashTypeBytes(byteString);
                return this;
            }

            private Builder() {
                super(Script.DEFAULT_INSTANCE);
            }
        }

        static {
            Script script = new Script();
            DEFAULT_INSTANCE = script;
            GeneratedMessageLite.registerDefaultInstance(Script.class, script);
        }

        private Script() {
            ByteString byteString = ByteString.EMPTY;
            this.codeHash_ = byteString;
            this.args_ = byteString;
        }

        /* access modifiers changed from: private */
        public void clearArgs() {
            this.args_ = getDefaultInstance().getArgs();
        }

        /* access modifiers changed from: private */
        public void clearCodeHash() {
            this.codeHash_ = getDefaultInstance().getCodeHash();
        }

        /* access modifiers changed from: private */
        public void clearHashType() {
            this.hashType_ = getDefaultInstance().getHashType();
        }

        public static Script getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Script parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Script) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Script parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Script) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<Script> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setArgs(ByteString byteString) {
            byteString.getClass();
            this.args_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setCodeHash(ByteString byteString) {
            byteString.getClass();
            this.codeHash_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setHashType(String str) {
            str.getClass();
            this.hashType_ = str;
        }

        /* access modifiers changed from: private */
        public void setHashTypeBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.hashType_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97561.f46572xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Script();
                case 2:
                    return new Builder((C97561) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0003\n", new Object[]{"codeHash_", "hashType_", "args_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<Script> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (Script.class) {
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

        public ByteString getArgs() {
            return this.args_;
        }

        public ByteString getCodeHash() {
            return this.codeHash_;
        }

        public String getHashType() {
            return this.hashType_;
        }

        public ByteString getHashTypeBytes() {
            return ByteString.copyFromUtf8(this.hashType_);
        }

        public static Builder newBuilder(Script script) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(script);
        }

        public static Script parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Script) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Script parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (Script) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static Script parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Script) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Script parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (Script) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static Script parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Script) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Script parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (Script) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static Script parseFrom(InputStream inputStream) throws IOException {
            return (Script) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Script parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Script) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Script parseFrom(C4969g gVar) throws IOException {
            return (Script) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static Script parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (Script) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface ScriptOrBuilder extends qu3 {
        ByteString getArgs();

        ByteString getCodeHash();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getHashType();

        ByteString getHashTypeBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SigningInput extends GeneratedMessageLite<SigningInput, Builder> implements SigningInputOrBuilder {
        public static final int BYTE_FEE_FIELD_NUMBER = 1;
        public static final int CELL_FIELD_NUMBER = 3;
        public static final int DAO_DEPOSIT_FIELD_NUMBER = 7;
        public static final int DAO_WITHDRAW_PHASE1_FIELD_NUMBER = 8;
        public static final int DAO_WITHDRAW_PHASE2_FIELD_NUMBER = 9;
        /* access modifiers changed from: private */
        public static final SigningInput DEFAULT_INSTANCE;
        public static final int NATIVE_TRANSFER_FIELD_NUMBER = 5;
        private static volatile im4<SigningInput> PARSER = null;
        public static final int PLAN_FIELD_NUMBER = 4;
        public static final int PRIVATE_KEY_FIELD_NUMBER = 2;
        public static final int SUDT_TRANSFER_FIELD_NUMBER = 6;
        private long byteFee_;
        private C5011t.C5020i<Cell> cell_ = GeneratedMessageLite.emptyProtobufList();
        private int operationOneofCase_ = 0;
        private Object operationOneof_;
        private TransactionPlan plan_;
        private C5011t.C5020i<ByteString> privateKey_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningInput, Builder> implements SigningInputOrBuilder {
            public /* synthetic */ Builder(C97561 r1) {
                this();
            }

            public Builder addAllCell(Iterable<? extends Cell> iterable) {
                copyOnWrite();
                ((SigningInput) this.instance).addAllCell(iterable);
                return this;
            }

            public Builder addAllPrivateKey(Iterable<? extends ByteString> iterable) {
                copyOnWrite();
                ((SigningInput) this.instance).addAllPrivateKey(iterable);
                return this;
            }

            public Builder addCell(Cell cell) {
                copyOnWrite();
                ((SigningInput) this.instance).addCell(cell);
                return this;
            }

            public Builder addPrivateKey(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).addPrivateKey(byteString);
                return this;
            }

            public Builder clearByteFee() {
                copyOnWrite();
                ((SigningInput) this.instance).clearByteFee();
                return this;
            }

            public Builder clearCell() {
                copyOnWrite();
                ((SigningInput) this.instance).clearCell();
                return this;
            }

            public Builder clearDaoDeposit() {
                copyOnWrite();
                ((SigningInput) this.instance).clearDaoDeposit();
                return this;
            }

            public Builder clearDaoWithdrawPhase1() {
                copyOnWrite();
                ((SigningInput) this.instance).clearDaoWithdrawPhase1();
                return this;
            }

            public Builder clearDaoWithdrawPhase2() {
                copyOnWrite();
                ((SigningInput) this.instance).clearDaoWithdrawPhase2();
                return this;
            }

            public Builder clearNativeTransfer() {
                copyOnWrite();
                ((SigningInput) this.instance).clearNativeTransfer();
                return this;
            }

            public Builder clearOperationOneof() {
                copyOnWrite();
                ((SigningInput) this.instance).clearOperationOneof();
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

            public Builder clearSudtTransfer() {
                copyOnWrite();
                ((SigningInput) this.instance).clearSudtTransfer();
                return this;
            }

            public long getByteFee() {
                return ((SigningInput) this.instance).getByteFee();
            }

            public Cell getCell(int i) {
                return ((SigningInput) this.instance).getCell(i);
            }

            public int getCellCount() {
                return ((SigningInput) this.instance).getCellCount();
            }

            public List<Cell> getCellList() {
                return Collections.unmodifiableList(((SigningInput) this.instance).getCellList());
            }

            public DaoDeposit getDaoDeposit() {
                return ((SigningInput) this.instance).getDaoDeposit();
            }

            public DaoWithdrawPhase1 getDaoWithdrawPhase1() {
                return ((SigningInput) this.instance).getDaoWithdrawPhase1();
            }

            public DaoWithdrawPhase2 getDaoWithdrawPhase2() {
                return ((SigningInput) this.instance).getDaoWithdrawPhase2();
            }

            public NativeTransfer getNativeTransfer() {
                return ((SigningInput) this.instance).getNativeTransfer();
            }

            public OperationOneofCase getOperationOneofCase() {
                return ((SigningInput) this.instance).getOperationOneofCase();
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

            public SudtTransfer getSudtTransfer() {
                return ((SigningInput) this.instance).getSudtTransfer();
            }

            public boolean hasDaoDeposit() {
                return ((SigningInput) this.instance).hasDaoDeposit();
            }

            public boolean hasDaoWithdrawPhase1() {
                return ((SigningInput) this.instance).hasDaoWithdrawPhase1();
            }

            public boolean hasDaoWithdrawPhase2() {
                return ((SigningInput) this.instance).hasDaoWithdrawPhase2();
            }

            public boolean hasNativeTransfer() {
                return ((SigningInput) this.instance).hasNativeTransfer();
            }

            public boolean hasPlan() {
                return ((SigningInput) this.instance).hasPlan();
            }

            public boolean hasSudtTransfer() {
                return ((SigningInput) this.instance).hasSudtTransfer();
            }

            public Builder mergeDaoDeposit(DaoDeposit daoDeposit) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeDaoDeposit(daoDeposit);
                return this;
            }

            public Builder mergeDaoWithdrawPhase1(DaoWithdrawPhase1 daoWithdrawPhase1) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeDaoWithdrawPhase1(daoWithdrawPhase1);
                return this;
            }

            public Builder mergeDaoWithdrawPhase2(DaoWithdrawPhase2 daoWithdrawPhase2) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeDaoWithdrawPhase2(daoWithdrawPhase2);
                return this;
            }

            public Builder mergeNativeTransfer(NativeTransfer nativeTransfer) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeNativeTransfer(nativeTransfer);
                return this;
            }

            public Builder mergePlan(TransactionPlan transactionPlan) {
                copyOnWrite();
                ((SigningInput) this.instance).mergePlan(transactionPlan);
                return this;
            }

            public Builder mergeSudtTransfer(SudtTransfer sudtTransfer) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeSudtTransfer(sudtTransfer);
                return this;
            }

            public Builder removeCell(int i) {
                copyOnWrite();
                ((SigningInput) this.instance).removeCell(i);
                return this;
            }

            public Builder setByteFee(long j) {
                copyOnWrite();
                ((SigningInput) this.instance).setByteFee(j);
                return this;
            }

            public Builder setCell(int i, Cell cell) {
                copyOnWrite();
                ((SigningInput) this.instance).setCell(i, cell);
                return this;
            }

            public Builder setDaoDeposit(DaoDeposit daoDeposit) {
                copyOnWrite();
                ((SigningInput) this.instance).setDaoDeposit(daoDeposit);
                return this;
            }

            public Builder setDaoWithdrawPhase1(DaoWithdrawPhase1 daoWithdrawPhase1) {
                copyOnWrite();
                ((SigningInput) this.instance).setDaoWithdrawPhase1(daoWithdrawPhase1);
                return this;
            }

            public Builder setDaoWithdrawPhase2(DaoWithdrawPhase2 daoWithdrawPhase2) {
                copyOnWrite();
                ((SigningInput) this.instance).setDaoWithdrawPhase2(daoWithdrawPhase2);
                return this;
            }

            public Builder setNativeTransfer(NativeTransfer nativeTransfer) {
                copyOnWrite();
                ((SigningInput) this.instance).setNativeTransfer(nativeTransfer);
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

            public Builder setSudtTransfer(SudtTransfer sudtTransfer) {
                copyOnWrite();
                ((SigningInput) this.instance).setSudtTransfer(sudtTransfer);
                return this;
            }

            private Builder() {
                super(SigningInput.DEFAULT_INSTANCE);
            }

            public Builder addCell(int i, Cell cell) {
                copyOnWrite();
                ((SigningInput) this.instance).addCell(i, cell);
                return this;
            }

            public Builder setCell(int i, Cell.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setCell(i, (Cell) builder.build());
                return this;
            }

            public Builder setDaoDeposit(DaoDeposit.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setDaoDeposit((DaoDeposit) builder.build());
                return this;
            }

            public Builder setDaoWithdrawPhase1(DaoWithdrawPhase1.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setDaoWithdrawPhase1((DaoWithdrawPhase1) builder.build());
                return this;
            }

            public Builder setDaoWithdrawPhase2(DaoWithdrawPhase2.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setDaoWithdrawPhase2((DaoWithdrawPhase2) builder.build());
                return this;
            }

            public Builder setNativeTransfer(NativeTransfer.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setNativeTransfer((NativeTransfer) builder.build());
                return this;
            }

            public Builder setPlan(TransactionPlan.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setPlan((TransactionPlan) builder.build());
                return this;
            }

            public Builder setSudtTransfer(SudtTransfer.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setSudtTransfer((SudtTransfer) builder.build());
                return this;
            }

            public Builder addCell(Cell.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).addCell((Cell) builder.build());
                return this;
            }

            public Builder addCell(int i, Cell.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).addCell(i, (Cell) builder.build());
                return this;
            }
        }

        public enum OperationOneofCase {
            NATIVE_TRANSFER(5),
            SUDT_TRANSFER(6),
            DAO_DEPOSIT(7),
            DAO_WITHDRAW_PHASE1(8),
            DAO_WITHDRAW_PHASE2(9),
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
                    case 5:
                        return NATIVE_TRANSFER;
                    case 6:
                        return SUDT_TRANSFER;
                    case 7:
                        return DAO_DEPOSIT;
                    case 8:
                        return DAO_WITHDRAW_PHASE1;
                    case 9:
                        return DAO_WITHDRAW_PHASE2;
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
        public void addAllCell(Iterable<? extends Cell> iterable) {
            ensureCellIsMutable();
            C4949a.addAll(iterable, this.cell_);
        }

        /* access modifiers changed from: private */
        public void addAllPrivateKey(Iterable<? extends ByteString> iterable) {
            ensurePrivateKeyIsMutable();
            C4949a.addAll(iterable, this.privateKey_);
        }

        /* access modifiers changed from: private */
        public void addCell(Cell cell) {
            cell.getClass();
            ensureCellIsMutable();
            this.cell_.add(cell);
        }

        /* access modifiers changed from: private */
        public void addPrivateKey(ByteString byteString) {
            byteString.getClass();
            ensurePrivateKeyIsMutable();
            this.privateKey_.add(byteString);
        }

        /* access modifiers changed from: private */
        public void clearByteFee() {
            this.byteFee_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearCell() {
            this.cell_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearDaoDeposit() {
            if (this.operationOneofCase_ == 7) {
                this.operationOneofCase_ = 0;
                this.operationOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearDaoWithdrawPhase1() {
            if (this.operationOneofCase_ == 8) {
                this.operationOneofCase_ = 0;
                this.operationOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearDaoWithdrawPhase2() {
            if (this.operationOneofCase_ == 9) {
                this.operationOneofCase_ = 0;
                this.operationOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearNativeTransfer() {
            if (this.operationOneofCase_ == 5) {
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
        public void clearPlan() {
            this.plan_ = null;
        }

        /* access modifiers changed from: private */
        public void clearPrivateKey() {
            this.privateKey_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearSudtTransfer() {
            if (this.operationOneofCase_ == 6) {
                this.operationOneofCase_ = 0;
                this.operationOneof_ = null;
            }
        }

        private void ensureCellIsMutable() {
            C5011t.C5020i<Cell> iVar = this.cell_;
            if (!iVar.mo37090v()) {
                this.cell_ = GeneratedMessageLite.mutableCopy(iVar);
            }
        }

        private void ensurePrivateKeyIsMutable() {
            C5011t.C5020i<ByteString> iVar = this.privateKey_;
            if (!iVar.mo37090v()) {
                this.privateKey_ = GeneratedMessageLite.mutableCopy(iVar);
            }
        }

        public static SigningInput getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeDaoDeposit(DaoDeposit daoDeposit) {
            daoDeposit.getClass();
            if (this.operationOneofCase_ != 7 || this.operationOneof_ == DaoDeposit.getDefaultInstance()) {
                this.operationOneof_ = daoDeposit;
            } else {
                this.operationOneof_ = ((DaoDeposit.Builder) DaoDeposit.newBuilder((DaoDeposit) this.operationOneof_).mergeFrom(daoDeposit)).buildPartial();
            }
            this.operationOneofCase_ = 7;
        }

        /* access modifiers changed from: private */
        public void mergeDaoWithdrawPhase1(DaoWithdrawPhase1 daoWithdrawPhase1) {
            daoWithdrawPhase1.getClass();
            if (this.operationOneofCase_ != 8 || this.operationOneof_ == DaoWithdrawPhase1.getDefaultInstance()) {
                this.operationOneof_ = daoWithdrawPhase1;
            } else {
                this.operationOneof_ = ((DaoWithdrawPhase1.Builder) DaoWithdrawPhase1.newBuilder((DaoWithdrawPhase1) this.operationOneof_).mergeFrom(daoWithdrawPhase1)).buildPartial();
            }
            this.operationOneofCase_ = 8;
        }

        /* access modifiers changed from: private */
        public void mergeDaoWithdrawPhase2(DaoWithdrawPhase2 daoWithdrawPhase2) {
            daoWithdrawPhase2.getClass();
            if (this.operationOneofCase_ != 9 || this.operationOneof_ == DaoWithdrawPhase2.getDefaultInstance()) {
                this.operationOneof_ = daoWithdrawPhase2;
            } else {
                this.operationOneof_ = ((DaoWithdrawPhase2.Builder) DaoWithdrawPhase2.newBuilder((DaoWithdrawPhase2) this.operationOneof_).mergeFrom(daoWithdrawPhase2)).buildPartial();
            }
            this.operationOneofCase_ = 9;
        }

        /* access modifiers changed from: private */
        public void mergeNativeTransfer(NativeTransfer nativeTransfer) {
            nativeTransfer.getClass();
            if (this.operationOneofCase_ != 5 || this.operationOneof_ == NativeTransfer.getDefaultInstance()) {
                this.operationOneof_ = nativeTransfer;
            } else {
                this.operationOneof_ = ((NativeTransfer.Builder) NativeTransfer.newBuilder((NativeTransfer) this.operationOneof_).mergeFrom(nativeTransfer)).buildPartial();
            }
            this.operationOneofCase_ = 5;
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
        public void mergeSudtTransfer(SudtTransfer sudtTransfer) {
            sudtTransfer.getClass();
            if (this.operationOneofCase_ != 6 || this.operationOneof_ == SudtTransfer.getDefaultInstance()) {
                this.operationOneof_ = sudtTransfer;
            } else {
                this.operationOneof_ = ((SudtTransfer.Builder) SudtTransfer.newBuilder((SudtTransfer) this.operationOneof_).mergeFrom(sudtTransfer)).buildPartial();
            }
            this.operationOneofCase_ = 6;
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
        public void removeCell(int i) {
            ensureCellIsMutable();
            this.cell_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setByteFee(long j) {
            this.byteFee_ = j;
        }

        /* access modifiers changed from: private */
        public void setCell(int i, Cell cell) {
            cell.getClass();
            ensureCellIsMutable();
            this.cell_.set(i, cell);
        }

        /* access modifiers changed from: private */
        public void setDaoDeposit(DaoDeposit daoDeposit) {
            daoDeposit.getClass();
            this.operationOneof_ = daoDeposit;
            this.operationOneofCase_ = 7;
        }

        /* access modifiers changed from: private */
        public void setDaoWithdrawPhase1(DaoWithdrawPhase1 daoWithdrawPhase1) {
            daoWithdrawPhase1.getClass();
            this.operationOneof_ = daoWithdrawPhase1;
            this.operationOneofCase_ = 8;
        }

        /* access modifiers changed from: private */
        public void setDaoWithdrawPhase2(DaoWithdrawPhase2 daoWithdrawPhase2) {
            daoWithdrawPhase2.getClass();
            this.operationOneof_ = daoWithdrawPhase2;
            this.operationOneofCase_ = 9;
        }

        /* access modifiers changed from: private */
        public void setNativeTransfer(NativeTransfer nativeTransfer) {
            nativeTransfer.getClass();
            this.operationOneof_ = nativeTransfer;
            this.operationOneofCase_ = 5;
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
        public void setSudtTransfer(SudtTransfer sudtTransfer) {
            sudtTransfer.getClass();
            this.operationOneof_ = sudtTransfer;
            this.operationOneofCase_ = 6;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97561.f46572xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningInput();
                case 2:
                    return new Builder((C97561) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0002\u0000\u0001\u0003\u0002\u001c\u0003\u001b\u0004\t\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000", new Object[]{"operationOneof_", "operationOneofCase_", "byteFee_", "privateKey_", "cell_", Cell.class, "plan_", NativeTransfer.class, SudtTransfer.class, DaoDeposit.class, DaoWithdrawPhase1.class, DaoWithdrawPhase2.class});
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

        public long getByteFee() {
            return this.byteFee_;
        }

        public Cell getCell(int i) {
            return this.cell_.get(i);
        }

        public int getCellCount() {
            return this.cell_.size();
        }

        public List<Cell> getCellList() {
            return this.cell_;
        }

        public CellOrBuilder getCellOrBuilder(int i) {
            return this.cell_.get(i);
        }

        public List<? extends CellOrBuilder> getCellOrBuilderList() {
            return this.cell_;
        }

        public DaoDeposit getDaoDeposit() {
            if (this.operationOneofCase_ == 7) {
                return (DaoDeposit) this.operationOneof_;
            }
            return DaoDeposit.getDefaultInstance();
        }

        public DaoWithdrawPhase1 getDaoWithdrawPhase1() {
            if (this.operationOneofCase_ == 8) {
                return (DaoWithdrawPhase1) this.operationOneof_;
            }
            return DaoWithdrawPhase1.getDefaultInstance();
        }

        public DaoWithdrawPhase2 getDaoWithdrawPhase2() {
            if (this.operationOneofCase_ == 9) {
                return (DaoWithdrawPhase2) this.operationOneof_;
            }
            return DaoWithdrawPhase2.getDefaultInstance();
        }

        public NativeTransfer getNativeTransfer() {
            if (this.operationOneofCase_ == 5) {
                return (NativeTransfer) this.operationOneof_;
            }
            return NativeTransfer.getDefaultInstance();
        }

        public OperationOneofCase getOperationOneofCase() {
            return OperationOneofCase.forNumber(this.operationOneofCase_);
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

        public SudtTransfer getSudtTransfer() {
            if (this.operationOneofCase_ == 6) {
                return (SudtTransfer) this.operationOneof_;
            }
            return SudtTransfer.getDefaultInstance();
        }

        public boolean hasDaoDeposit() {
            if (this.operationOneofCase_ == 7) {
                return true;
            }
            return false;
        }

        public boolean hasDaoWithdrawPhase1() {
            if (this.operationOneofCase_ == 8) {
                return true;
            }
            return false;
        }

        public boolean hasDaoWithdrawPhase2() {
            if (this.operationOneofCase_ == 9) {
                return true;
            }
            return false;
        }

        public boolean hasNativeTransfer() {
            if (this.operationOneofCase_ == 5) {
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

        public boolean hasSudtTransfer() {
            if (this.operationOneofCase_ == 6) {
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
        public void addCell(int i, Cell cell) {
            cell.getClass();
            ensureCellIsMutable();
            this.cell_.add(i, cell);
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
        long getByteFee();

        Cell getCell(int i);

        int getCellCount();

        List<Cell> getCellList();

        DaoDeposit getDaoDeposit();

        DaoWithdrawPhase1 getDaoWithdrawPhase1();

        DaoWithdrawPhase2 getDaoWithdrawPhase2();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        NativeTransfer getNativeTransfer();

        SigningInput.OperationOneofCase getOperationOneofCase();

        TransactionPlan getPlan();

        ByteString getPrivateKey(int i);

        int getPrivateKeyCount();

        List<ByteString> getPrivateKeyList();

        SudtTransfer getSudtTransfer();

        boolean hasDaoDeposit();

        boolean hasDaoWithdrawPhase1();

        boolean hasDaoWithdrawPhase2();

        boolean hasNativeTransfer();

        boolean hasPlan();

        boolean hasSudtTransfer();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SigningOutput extends GeneratedMessageLite<SigningOutput, Builder> implements SigningOutputOrBuilder {
        /* access modifiers changed from: private */
        public static final SigningOutput DEFAULT_INSTANCE;
        public static final int ERROR_FIELD_NUMBER = 3;
        private static volatile im4<SigningOutput> PARSER = null;
        public static final int TRANSACTION_ID_FIELD_NUMBER = 2;
        public static final int TRANSACTION_JSON_FIELD_NUMBER = 1;
        private int error_;
        private String transactionId_ = "";
        private String transactionJson_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningOutput, Builder> implements SigningOutputOrBuilder {
            public /* synthetic */ Builder(C97561 r1) {
                this();
            }

            public Builder clearError() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearError();
                return this;
            }

            public Builder clearTransactionId() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearTransactionId();
                return this;
            }

            public Builder clearTransactionJson() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearTransactionJson();
                return this;
            }

            public Common.SigningError getError() {
                return ((SigningOutput) this.instance).getError();
            }

            public int getErrorValue() {
                return ((SigningOutput) this.instance).getErrorValue();
            }

            public String getTransactionId() {
                return ((SigningOutput) this.instance).getTransactionId();
            }

            public ByteString getTransactionIdBytes() {
                return ((SigningOutput) this.instance).getTransactionIdBytes();
            }

            public String getTransactionJson() {
                return ((SigningOutput) this.instance).getTransactionJson();
            }

            public ByteString getTransactionJsonBytes() {
                return ((SigningOutput) this.instance).getTransactionJsonBytes();
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

            public Builder setTransactionId(String str) {
                copyOnWrite();
                ((SigningOutput) this.instance).setTransactionId(str);
                return this;
            }

            public Builder setTransactionIdBytes(ByteString byteString) {
                copyOnWrite();
                ((SigningOutput) this.instance).setTransactionIdBytes(byteString);
                return this;
            }

            public Builder setTransactionJson(String str) {
                copyOnWrite();
                ((SigningOutput) this.instance).setTransactionJson(str);
                return this;
            }

            public Builder setTransactionJsonBytes(ByteString byteString) {
                copyOnWrite();
                ((SigningOutput) this.instance).setTransactionJsonBytes(byteString);
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
        public void clearTransactionId() {
            this.transactionId_ = getDefaultInstance().getTransactionId();
        }

        /* access modifiers changed from: private */
        public void clearTransactionJson() {
            this.transactionJson_ = getDefaultInstance().getTransactionJson();
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
        public void setTransactionId(String str) {
            str.getClass();
            this.transactionId_ = str;
        }

        /* access modifiers changed from: private */
        public void setTransactionIdBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.transactionId_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setTransactionJson(String str) {
            str.getClass();
            this.transactionJson_ = str;
        }

        /* access modifiers changed from: private */
        public void setTransactionJsonBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.transactionJson_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97561.f46572xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningOutput();
                case 2:
                    return new Builder((C97561) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f", new Object[]{"transactionJson_", "transactionId_", "error_"});
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

        public String getTransactionId() {
            return this.transactionId_;
        }

        public ByteString getTransactionIdBytes() {
            return ByteString.copyFromUtf8(this.transactionId_);
        }

        public String getTransactionJson() {
            return this.transactionJson_;
        }

        public ByteString getTransactionJsonBytes() {
            return ByteString.copyFromUtf8(this.transactionJson_);
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

        String getTransactionId();

        ByteString getTransactionIdBytes();

        String getTransactionJson();

        ByteString getTransactionJsonBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SudtTransfer extends GeneratedMessageLite<SudtTransfer, Builder> implements SudtTransferOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 4;
        public static final int CHANGE_ADDRESS_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final SudtTransfer DEFAULT_INSTANCE;
        private static volatile im4<SudtTransfer> PARSER = null;
        public static final int SUDT_ADDRESS_FIELD_NUMBER = 3;
        public static final int TO_ADDRESS_FIELD_NUMBER = 1;
        public static final int USE_MAX_AMOUNT_FIELD_NUMBER = 5;
        private String amount_ = "";
        private String changeAddress_ = "";
        private ByteString sudtAddress_ = ByteString.EMPTY;
        private String toAddress_ = "";
        private boolean useMaxAmount_;

        public static final class Builder extends GeneratedMessageLite.C4930a<SudtTransfer, Builder> implements SudtTransferOrBuilder {
            public /* synthetic */ Builder(C97561 r1) {
                this();
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((SudtTransfer) this.instance).clearAmount();
                return this;
            }

            public Builder clearChangeAddress() {
                copyOnWrite();
                ((SudtTransfer) this.instance).clearChangeAddress();
                return this;
            }

            public Builder clearSudtAddress() {
                copyOnWrite();
                ((SudtTransfer) this.instance).clearSudtAddress();
                return this;
            }

            public Builder clearToAddress() {
                copyOnWrite();
                ((SudtTransfer) this.instance).clearToAddress();
                return this;
            }

            public Builder clearUseMaxAmount() {
                copyOnWrite();
                ((SudtTransfer) this.instance).clearUseMaxAmount();
                return this;
            }

            public String getAmount() {
                return ((SudtTransfer) this.instance).getAmount();
            }

            public ByteString getAmountBytes() {
                return ((SudtTransfer) this.instance).getAmountBytes();
            }

            public String getChangeAddress() {
                return ((SudtTransfer) this.instance).getChangeAddress();
            }

            public ByteString getChangeAddressBytes() {
                return ((SudtTransfer) this.instance).getChangeAddressBytes();
            }

            public ByteString getSudtAddress() {
                return ((SudtTransfer) this.instance).getSudtAddress();
            }

            public String getToAddress() {
                return ((SudtTransfer) this.instance).getToAddress();
            }

            public ByteString getToAddressBytes() {
                return ((SudtTransfer) this.instance).getToAddressBytes();
            }

            public boolean getUseMaxAmount() {
                return ((SudtTransfer) this.instance).getUseMaxAmount();
            }

            public Builder setAmount(String str) {
                copyOnWrite();
                ((SudtTransfer) this.instance).setAmount(str);
                return this;
            }

            public Builder setAmountBytes(ByteString byteString) {
                copyOnWrite();
                ((SudtTransfer) this.instance).setAmountBytes(byteString);
                return this;
            }

            public Builder setChangeAddress(String str) {
                copyOnWrite();
                ((SudtTransfer) this.instance).setChangeAddress(str);
                return this;
            }

            public Builder setChangeAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((SudtTransfer) this.instance).setChangeAddressBytes(byteString);
                return this;
            }

            public Builder setSudtAddress(ByteString byteString) {
                copyOnWrite();
                ((SudtTransfer) this.instance).setSudtAddress(byteString);
                return this;
            }

            public Builder setToAddress(String str) {
                copyOnWrite();
                ((SudtTransfer) this.instance).setToAddress(str);
                return this;
            }

            public Builder setToAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((SudtTransfer) this.instance).setToAddressBytes(byteString);
                return this;
            }

            public Builder setUseMaxAmount(boolean z) {
                copyOnWrite();
                ((SudtTransfer) this.instance).setUseMaxAmount(z);
                return this;
            }

            private Builder() {
                super(SudtTransfer.DEFAULT_INSTANCE);
            }
        }

        static {
            SudtTransfer sudtTransfer = new SudtTransfer();
            DEFAULT_INSTANCE = sudtTransfer;
            GeneratedMessageLite.registerDefaultInstance(SudtTransfer.class, sudtTransfer);
        }

        private SudtTransfer() {
        }

        /* access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = getDefaultInstance().getAmount();
        }

        /* access modifiers changed from: private */
        public void clearChangeAddress() {
            this.changeAddress_ = getDefaultInstance().getChangeAddress();
        }

        /* access modifiers changed from: private */
        public void clearSudtAddress() {
            this.sudtAddress_ = getDefaultInstance().getSudtAddress();
        }

        /* access modifiers changed from: private */
        public void clearToAddress() {
            this.toAddress_ = getDefaultInstance().getToAddress();
        }

        /* access modifiers changed from: private */
        public void clearUseMaxAmount() {
            this.useMaxAmount_ = false;
        }

        public static SudtTransfer getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static SudtTransfer parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SudtTransfer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SudtTransfer parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SudtTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<SudtTransfer> parser() {
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
        public void setSudtAddress(ByteString byteString) {
            byteString.getClass();
            this.sudtAddress_ = byteString;
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
        public void setUseMaxAmount(boolean z) {
            this.useMaxAmount_ = z;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97561.f46572xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SudtTransfer();
                case 2:
                    return new Builder((C97561) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\n\u0004Ȉ\u0005\u0007", new Object[]{"toAddress_", "changeAddress_", "sudtAddress_", "amount_", "useMaxAmount_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<SudtTransfer> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (SudtTransfer.class) {
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

        public String getChangeAddress() {
            return this.changeAddress_;
        }

        public ByteString getChangeAddressBytes() {
            return ByteString.copyFromUtf8(this.changeAddress_);
        }

        public ByteString getSudtAddress() {
            return this.sudtAddress_;
        }

        public String getToAddress() {
            return this.toAddress_;
        }

        public ByteString getToAddressBytes() {
            return ByteString.copyFromUtf8(this.toAddress_);
        }

        public boolean getUseMaxAmount() {
            return this.useMaxAmount_;
        }

        public static Builder newBuilder(SudtTransfer sudtTransfer) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(sudtTransfer);
        }

        public static SudtTransfer parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (SudtTransfer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static SudtTransfer parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (SudtTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static SudtTransfer parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SudtTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SudtTransfer parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (SudtTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static SudtTransfer parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SudtTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SudtTransfer parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (SudtTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static SudtTransfer parseFrom(InputStream inputStream) throws IOException {
            return (SudtTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SudtTransfer parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (SudtTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static SudtTransfer parseFrom(C4969g gVar) throws IOException {
            return (SudtTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static SudtTransfer parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (SudtTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface SudtTransferOrBuilder extends qu3 {
        String getAmount();

        ByteString getAmountBytes();

        String getChangeAddress();

        ByteString getChangeAddressBytes();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        ByteString getSudtAddress();

        String getToAddress();

        ByteString getToAddressBytes();

        boolean getUseMaxAmount();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TransactionPlan extends GeneratedMessageLite<TransactionPlan, Builder> implements TransactionPlanOrBuilder {
        public static final int CELL_DEPS_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final TransactionPlan DEFAULT_INSTANCE;
        public static final int ERROR_FIELD_NUMBER = 6;
        public static final int HEADER_DEPS_FIELD_NUMBER = 2;
        public static final int OUTPUTS_DATA_FIELD_NUMBER = 5;
        public static final int OUTPUTS_FIELD_NUMBER = 4;
        private static volatile im4<TransactionPlan> PARSER = null;
        public static final int SELECTED_CELLS_FIELD_NUMBER = 3;
        private C5011t.C5020i<CellDep> cellDeps_ = GeneratedMessageLite.emptyProtobufList();
        private int error_;
        private C5011t.C5020i<ByteString> headerDeps_ = GeneratedMessageLite.emptyProtobufList();
        private C5011t.C5020i<ByteString> outputsData_ = GeneratedMessageLite.emptyProtobufList();
        private C5011t.C5020i<CellOutput> outputs_ = GeneratedMessageLite.emptyProtobufList();
        private C5011t.C5020i<Cell> selectedCells_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.C4930a<TransactionPlan, Builder> implements TransactionPlanOrBuilder {
            public /* synthetic */ Builder(C97561 r1) {
                this();
            }

            public Builder addAllCellDeps(Iterable<? extends CellDep> iterable) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addAllCellDeps(iterable);
                return this;
            }

            public Builder addAllHeaderDeps(Iterable<? extends ByteString> iterable) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addAllHeaderDeps(iterable);
                return this;
            }

            public Builder addAllOutputs(Iterable<? extends CellOutput> iterable) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addAllOutputs(iterable);
                return this;
            }

            public Builder addAllOutputsData(Iterable<? extends ByteString> iterable) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addAllOutputsData(iterable);
                return this;
            }

            public Builder addAllSelectedCells(Iterable<? extends Cell> iterable) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addAllSelectedCells(iterable);
                return this;
            }

            public Builder addCellDeps(CellDep cellDep) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addCellDeps(cellDep);
                return this;
            }

            public Builder addHeaderDeps(ByteString byteString) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addHeaderDeps(byteString);
                return this;
            }

            public Builder addOutputs(CellOutput cellOutput) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addOutputs(cellOutput);
                return this;
            }

            public Builder addOutputsData(ByteString byteString) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addOutputsData(byteString);
                return this;
            }

            public Builder addSelectedCells(Cell cell) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addSelectedCells(cell);
                return this;
            }

            public Builder clearCellDeps() {
                copyOnWrite();
                ((TransactionPlan) this.instance).clearCellDeps();
                return this;
            }

            public Builder clearError() {
                copyOnWrite();
                ((TransactionPlan) this.instance).clearError();
                return this;
            }

            public Builder clearHeaderDeps() {
                copyOnWrite();
                ((TransactionPlan) this.instance).clearHeaderDeps();
                return this;
            }

            public Builder clearOutputs() {
                copyOnWrite();
                ((TransactionPlan) this.instance).clearOutputs();
                return this;
            }

            public Builder clearOutputsData() {
                copyOnWrite();
                ((TransactionPlan) this.instance).clearOutputsData();
                return this;
            }

            public Builder clearSelectedCells() {
                copyOnWrite();
                ((TransactionPlan) this.instance).clearSelectedCells();
                return this;
            }

            public CellDep getCellDeps(int i) {
                return ((TransactionPlan) this.instance).getCellDeps(i);
            }

            public int getCellDepsCount() {
                return ((TransactionPlan) this.instance).getCellDepsCount();
            }

            public List<CellDep> getCellDepsList() {
                return Collections.unmodifiableList(((TransactionPlan) this.instance).getCellDepsList());
            }

            public Common.SigningError getError() {
                return ((TransactionPlan) this.instance).getError();
            }

            public int getErrorValue() {
                return ((TransactionPlan) this.instance).getErrorValue();
            }

            public ByteString getHeaderDeps(int i) {
                return ((TransactionPlan) this.instance).getHeaderDeps(i);
            }

            public int getHeaderDepsCount() {
                return ((TransactionPlan) this.instance).getHeaderDepsCount();
            }

            public List<ByteString> getHeaderDepsList() {
                return Collections.unmodifiableList(((TransactionPlan) this.instance).getHeaderDepsList());
            }

            public CellOutput getOutputs(int i) {
                return ((TransactionPlan) this.instance).getOutputs(i);
            }

            public int getOutputsCount() {
                return ((TransactionPlan) this.instance).getOutputsCount();
            }

            public ByteString getOutputsData(int i) {
                return ((TransactionPlan) this.instance).getOutputsData(i);
            }

            public int getOutputsDataCount() {
                return ((TransactionPlan) this.instance).getOutputsDataCount();
            }

            public List<ByteString> getOutputsDataList() {
                return Collections.unmodifiableList(((TransactionPlan) this.instance).getOutputsDataList());
            }

            public List<CellOutput> getOutputsList() {
                return Collections.unmodifiableList(((TransactionPlan) this.instance).getOutputsList());
            }

            public Cell getSelectedCells(int i) {
                return ((TransactionPlan) this.instance).getSelectedCells(i);
            }

            public int getSelectedCellsCount() {
                return ((TransactionPlan) this.instance).getSelectedCellsCount();
            }

            public List<Cell> getSelectedCellsList() {
                return Collections.unmodifiableList(((TransactionPlan) this.instance).getSelectedCellsList());
            }

            public Builder removeCellDeps(int i) {
                copyOnWrite();
                ((TransactionPlan) this.instance).removeCellDeps(i);
                return this;
            }

            public Builder removeOutputs(int i) {
                copyOnWrite();
                ((TransactionPlan) this.instance).removeOutputs(i);
                return this;
            }

            public Builder removeSelectedCells(int i) {
                copyOnWrite();
                ((TransactionPlan) this.instance).removeSelectedCells(i);
                return this;
            }

            public Builder setCellDeps(int i, CellDep cellDep) {
                copyOnWrite();
                ((TransactionPlan) this.instance).setCellDeps(i, cellDep);
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

            public Builder setHeaderDeps(int i, ByteString byteString) {
                copyOnWrite();
                ((TransactionPlan) this.instance).setHeaderDeps(i, byteString);
                return this;
            }

            public Builder setOutputs(int i, CellOutput cellOutput) {
                copyOnWrite();
                ((TransactionPlan) this.instance).setOutputs(i, cellOutput);
                return this;
            }

            public Builder setOutputsData(int i, ByteString byteString) {
                copyOnWrite();
                ((TransactionPlan) this.instance).setOutputsData(i, byteString);
                return this;
            }

            public Builder setSelectedCells(int i, Cell cell) {
                copyOnWrite();
                ((TransactionPlan) this.instance).setSelectedCells(i, cell);
                return this;
            }

            private Builder() {
                super(TransactionPlan.DEFAULT_INSTANCE);
            }

            public Builder addCellDeps(int i, CellDep cellDep) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addCellDeps(i, cellDep);
                return this;
            }

            public Builder addOutputs(int i, CellOutput cellOutput) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addOutputs(i, cellOutput);
                return this;
            }

            public Builder addSelectedCells(int i, Cell cell) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addSelectedCells(i, cell);
                return this;
            }

            public Builder setCellDeps(int i, CellDep.Builder builder) {
                copyOnWrite();
                ((TransactionPlan) this.instance).setCellDeps(i, (CellDep) builder.build());
                return this;
            }

            public Builder setOutputs(int i, CellOutput.Builder builder) {
                copyOnWrite();
                ((TransactionPlan) this.instance).setOutputs(i, (CellOutput) builder.build());
                return this;
            }

            public Builder setSelectedCells(int i, Cell.Builder builder) {
                copyOnWrite();
                ((TransactionPlan) this.instance).setSelectedCells(i, (Cell) builder.build());
                return this;
            }

            public Builder addCellDeps(CellDep.Builder builder) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addCellDeps((CellDep) builder.build());
                return this;
            }

            public Builder addOutputs(CellOutput.Builder builder) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addOutputs((CellOutput) builder.build());
                return this;
            }

            public Builder addSelectedCells(Cell.Builder builder) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addSelectedCells((Cell) builder.build());
                return this;
            }

            public Builder addCellDeps(int i, CellDep.Builder builder) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addCellDeps(i, (CellDep) builder.build());
                return this;
            }

            public Builder addOutputs(int i, CellOutput.Builder builder) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addOutputs(i, (CellOutput) builder.build());
                return this;
            }

            public Builder addSelectedCells(int i, Cell.Builder builder) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addSelectedCells(i, (Cell) builder.build());
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
        public void addAllCellDeps(Iterable<? extends CellDep> iterable) {
            ensureCellDepsIsMutable();
            C4949a.addAll(iterable, this.cellDeps_);
        }

        /* access modifiers changed from: private */
        public void addAllHeaderDeps(Iterable<? extends ByteString> iterable) {
            ensureHeaderDepsIsMutable();
            C4949a.addAll(iterable, this.headerDeps_);
        }

        /* access modifiers changed from: private */
        public void addAllOutputs(Iterable<? extends CellOutput> iterable) {
            ensureOutputsIsMutable();
            C4949a.addAll(iterable, this.outputs_);
        }

        /* access modifiers changed from: private */
        public void addAllOutputsData(Iterable<? extends ByteString> iterable) {
            ensureOutputsDataIsMutable();
            C4949a.addAll(iterable, this.outputsData_);
        }

        /* access modifiers changed from: private */
        public void addAllSelectedCells(Iterable<? extends Cell> iterable) {
            ensureSelectedCellsIsMutable();
            C4949a.addAll(iterable, this.selectedCells_);
        }

        /* access modifiers changed from: private */
        public void addCellDeps(CellDep cellDep) {
            cellDep.getClass();
            ensureCellDepsIsMutable();
            this.cellDeps_.add(cellDep);
        }

        /* access modifiers changed from: private */
        public void addHeaderDeps(ByteString byteString) {
            byteString.getClass();
            ensureHeaderDepsIsMutable();
            this.headerDeps_.add(byteString);
        }

        /* access modifiers changed from: private */
        public void addOutputs(CellOutput cellOutput) {
            cellOutput.getClass();
            ensureOutputsIsMutable();
            this.outputs_.add(cellOutput);
        }

        /* access modifiers changed from: private */
        public void addOutputsData(ByteString byteString) {
            byteString.getClass();
            ensureOutputsDataIsMutable();
            this.outputsData_.add(byteString);
        }

        /* access modifiers changed from: private */
        public void addSelectedCells(Cell cell) {
            cell.getClass();
            ensureSelectedCellsIsMutable();
            this.selectedCells_.add(cell);
        }

        /* access modifiers changed from: private */
        public void clearCellDeps() {
            this.cellDeps_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearError() {
            this.error_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearHeaderDeps() {
            this.headerDeps_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearOutputs() {
            this.outputs_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearOutputsData() {
            this.outputsData_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearSelectedCells() {
            this.selectedCells_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureCellDepsIsMutable() {
            C5011t.C5020i<CellDep> iVar = this.cellDeps_;
            if (!iVar.mo37090v()) {
                this.cellDeps_ = GeneratedMessageLite.mutableCopy(iVar);
            }
        }

        private void ensureHeaderDepsIsMutable() {
            C5011t.C5020i<ByteString> iVar = this.headerDeps_;
            if (!iVar.mo37090v()) {
                this.headerDeps_ = GeneratedMessageLite.mutableCopy(iVar);
            }
        }

        private void ensureOutputsDataIsMutable() {
            C5011t.C5020i<ByteString> iVar = this.outputsData_;
            if (!iVar.mo37090v()) {
                this.outputsData_ = GeneratedMessageLite.mutableCopy(iVar);
            }
        }

        private void ensureOutputsIsMutable() {
            C5011t.C5020i<CellOutput> iVar = this.outputs_;
            if (!iVar.mo37090v()) {
                this.outputs_ = GeneratedMessageLite.mutableCopy(iVar);
            }
        }

        private void ensureSelectedCellsIsMutable() {
            C5011t.C5020i<Cell> iVar = this.selectedCells_;
            if (!iVar.mo37090v()) {
                this.selectedCells_ = GeneratedMessageLite.mutableCopy(iVar);
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
        public void removeCellDeps(int i) {
            ensureCellDepsIsMutable();
            this.cellDeps_.remove(i);
        }

        /* access modifiers changed from: private */
        public void removeOutputs(int i) {
            ensureOutputsIsMutable();
            this.outputs_.remove(i);
        }

        /* access modifiers changed from: private */
        public void removeSelectedCells(int i) {
            ensureSelectedCellsIsMutable();
            this.selectedCells_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setCellDeps(int i, CellDep cellDep) {
            cellDep.getClass();
            ensureCellDepsIsMutable();
            this.cellDeps_.set(i, cellDep);
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
        public void setHeaderDeps(int i, ByteString byteString) {
            byteString.getClass();
            ensureHeaderDepsIsMutable();
            this.headerDeps_.set(i, byteString);
        }

        /* access modifiers changed from: private */
        public void setOutputs(int i, CellOutput cellOutput) {
            cellOutput.getClass();
            ensureOutputsIsMutable();
            this.outputs_.set(i, cellOutput);
        }

        /* access modifiers changed from: private */
        public void setOutputsData(int i, ByteString byteString) {
            byteString.getClass();
            ensureOutputsDataIsMutable();
            this.outputsData_.set(i, byteString);
        }

        /* access modifiers changed from: private */
        public void setSelectedCells(int i, Cell cell) {
            cell.getClass();
            ensureSelectedCellsIsMutable();
            this.selectedCells_.set(i, cell);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97561.f46572xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TransactionPlan();
                case 2:
                    return new Builder((C97561) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0005\u0000\u0001\u001b\u0002\u001c\u0003\u001b\u0004\u001b\u0005\u001c\u0006\f", new Object[]{"cellDeps_", CellDep.class, "headerDeps_", "selectedCells_", Cell.class, "outputs_", CellOutput.class, "outputsData_", "error_"});
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

        public CellDep getCellDeps(int i) {
            return this.cellDeps_.get(i);
        }

        public int getCellDepsCount() {
            return this.cellDeps_.size();
        }

        public List<CellDep> getCellDepsList() {
            return this.cellDeps_;
        }

        public CellDepOrBuilder getCellDepsOrBuilder(int i) {
            return this.cellDeps_.get(i);
        }

        public List<? extends CellDepOrBuilder> getCellDepsOrBuilderList() {
            return this.cellDeps_;
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

        public ByteString getHeaderDeps(int i) {
            return this.headerDeps_.get(i);
        }

        public int getHeaderDepsCount() {
            return this.headerDeps_.size();
        }

        public List<ByteString> getHeaderDepsList() {
            return this.headerDeps_;
        }

        public CellOutput getOutputs(int i) {
            return this.outputs_.get(i);
        }

        public int getOutputsCount() {
            return this.outputs_.size();
        }

        public ByteString getOutputsData(int i) {
            return this.outputsData_.get(i);
        }

        public int getOutputsDataCount() {
            return this.outputsData_.size();
        }

        public List<ByteString> getOutputsDataList() {
            return this.outputsData_;
        }

        public List<CellOutput> getOutputsList() {
            return this.outputs_;
        }

        public CellOutputOrBuilder getOutputsOrBuilder(int i) {
            return this.outputs_.get(i);
        }

        public List<? extends CellOutputOrBuilder> getOutputsOrBuilderList() {
            return this.outputs_;
        }

        public Cell getSelectedCells(int i) {
            return this.selectedCells_.get(i);
        }

        public int getSelectedCellsCount() {
            return this.selectedCells_.size();
        }

        public List<Cell> getSelectedCellsList() {
            return this.selectedCells_;
        }

        public CellOrBuilder getSelectedCellsOrBuilder(int i) {
            return this.selectedCells_.get(i);
        }

        public List<? extends CellOrBuilder> getSelectedCellsOrBuilderList() {
            return this.selectedCells_;
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
        public void addCellDeps(int i, CellDep cellDep) {
            cellDep.getClass();
            ensureCellDepsIsMutable();
            this.cellDeps_.add(i, cellDep);
        }

        /* access modifiers changed from: private */
        public void addOutputs(int i, CellOutput cellOutput) {
            cellOutput.getClass();
            ensureOutputsIsMutable();
            this.outputs_.add(i, cellOutput);
        }

        /* access modifiers changed from: private */
        public void addSelectedCells(int i, Cell cell) {
            cell.getClass();
            ensureSelectedCellsIsMutable();
            this.selectedCells_.add(i, cell);
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
        CellDep getCellDeps(int i);

        int getCellDepsCount();

        List<CellDep> getCellDepsList();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        Common.SigningError getError();

        int getErrorValue();

        ByteString getHeaderDeps(int i);

        int getHeaderDepsCount();

        List<ByteString> getHeaderDepsList();

        CellOutput getOutputs(int i);

        int getOutputsCount();

        ByteString getOutputsData(int i);

        int getOutputsDataCount();

        List<ByteString> getOutputsDataList();

        List<CellOutput> getOutputsList();

        Cell getSelectedCells(int i);

        int getSelectedCellsCount();

        List<Cell> getSelectedCellsList();

        /* synthetic */ boolean isInitialized();
    }

    private Nervos() {
    }

    public static void registerAllExtensions(C4987l lVar) {
    }
}
