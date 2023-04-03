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

public final class Tezos {

    /* renamed from: wallet.core.jni.proto.Tezos$1 */
    public static /* synthetic */ class C97691 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f46582xa1df5c61;

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
                f46582xa1df5c61 = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f46582xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f46582xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f46582xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f46582xa1df5c61     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f46582xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f46582xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wallet.core.jni.proto.Tezos.C97691.<clinit>():void");
        }
    }

    public static final class DelegationOperationData extends GeneratedMessageLite<DelegationOperationData, Builder> implements DelegationOperationDataOrBuilder {
        /* access modifiers changed from: private */
        public static final DelegationOperationData DEFAULT_INSTANCE;
        public static final int DELEGATE_FIELD_NUMBER = 1;
        private static volatile im4<DelegationOperationData> PARSER;
        private String delegate_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<DelegationOperationData, Builder> implements DelegationOperationDataOrBuilder {
            public /* synthetic */ Builder(C97691 r1) {
                this();
            }

            public Builder clearDelegate() {
                copyOnWrite();
                ((DelegationOperationData) this.instance).clearDelegate();
                return this;
            }

            public String getDelegate() {
                return ((DelegationOperationData) this.instance).getDelegate();
            }

            public ByteString getDelegateBytes() {
                return ((DelegationOperationData) this.instance).getDelegateBytes();
            }

            public Builder setDelegate(String str) {
                copyOnWrite();
                ((DelegationOperationData) this.instance).setDelegate(str);
                return this;
            }

            public Builder setDelegateBytes(ByteString byteString) {
                copyOnWrite();
                ((DelegationOperationData) this.instance).setDelegateBytes(byteString);
                return this;
            }

            private Builder() {
                super(DelegationOperationData.DEFAULT_INSTANCE);
            }
        }

        static {
            DelegationOperationData delegationOperationData = new DelegationOperationData();
            DEFAULT_INSTANCE = delegationOperationData;
            GeneratedMessageLite.registerDefaultInstance(DelegationOperationData.class, delegationOperationData);
        }

        private DelegationOperationData() {
        }

        /* access modifiers changed from: private */
        public void clearDelegate() {
            this.delegate_ = getDefaultInstance().getDelegate();
        }

        public static DelegationOperationData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static DelegationOperationData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DelegationOperationData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DelegationOperationData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DelegationOperationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<DelegationOperationData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setDelegate(String str) {
            str.getClass();
            this.delegate_ = str;
        }

        /* access modifiers changed from: private */
        public void setDelegateBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.delegate_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97691.f46582xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new DelegationOperationData();
                case 2:
                    return new Builder((C97691) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"delegate_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<DelegationOperationData> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (DelegationOperationData.class) {
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

        public String getDelegate() {
            return this.delegate_;
        }

        public ByteString getDelegateBytes() {
            return ByteString.copyFromUtf8(this.delegate_);
        }

        public static Builder newBuilder(DelegationOperationData delegationOperationData) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(delegationOperationData);
        }

        public static DelegationOperationData parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (DelegationOperationData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static DelegationOperationData parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (DelegationOperationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static DelegationOperationData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DelegationOperationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DelegationOperationData parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (DelegationOperationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static DelegationOperationData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DelegationOperationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DelegationOperationData parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (DelegationOperationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static DelegationOperationData parseFrom(InputStream inputStream) throws IOException {
            return (DelegationOperationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DelegationOperationData parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (DelegationOperationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static DelegationOperationData parseFrom(C4969g gVar) throws IOException {
            return (DelegationOperationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static DelegationOperationData parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (DelegationOperationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface DelegationOperationDataOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getDelegate();

        ByteString getDelegateBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class FA12Parameters extends GeneratedMessageLite<FA12Parameters, Builder> implements FA12ParametersOrBuilder {
        /* access modifiers changed from: private */
        public static final FA12Parameters DEFAULT_INSTANCE;
        public static final int ENTRYPOINT_FIELD_NUMBER = 1;
        public static final int FROM_FIELD_NUMBER = 2;
        private static volatile im4<FA12Parameters> PARSER = null;
        public static final int TO_FIELD_NUMBER = 3;
        public static final int VALUE_FIELD_NUMBER = 4;
        private String entrypoint_ = "";
        private String from_ = "";
        private String to_ = "";
        private String value_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<FA12Parameters, Builder> implements FA12ParametersOrBuilder {
            public /* synthetic */ Builder(C97691 r1) {
                this();
            }

            public Builder clearEntrypoint() {
                copyOnWrite();
                ((FA12Parameters) this.instance).clearEntrypoint();
                return this;
            }

            public Builder clearFrom() {
                copyOnWrite();
                ((FA12Parameters) this.instance).clearFrom();
                return this;
            }

            public Builder clearTo() {
                copyOnWrite();
                ((FA12Parameters) this.instance).clearTo();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((FA12Parameters) this.instance).clearValue();
                return this;
            }

            public String getEntrypoint() {
                return ((FA12Parameters) this.instance).getEntrypoint();
            }

            public ByteString getEntrypointBytes() {
                return ((FA12Parameters) this.instance).getEntrypointBytes();
            }

            public String getFrom() {
                return ((FA12Parameters) this.instance).getFrom();
            }

            public ByteString getFromBytes() {
                return ((FA12Parameters) this.instance).getFromBytes();
            }

            public String getTo() {
                return ((FA12Parameters) this.instance).getTo();
            }

            public ByteString getToBytes() {
                return ((FA12Parameters) this.instance).getToBytes();
            }

            public String getValue() {
                return ((FA12Parameters) this.instance).getValue();
            }

            public ByteString getValueBytes() {
                return ((FA12Parameters) this.instance).getValueBytes();
            }

            public Builder setEntrypoint(String str) {
                copyOnWrite();
                ((FA12Parameters) this.instance).setEntrypoint(str);
                return this;
            }

            public Builder setEntrypointBytes(ByteString byteString) {
                copyOnWrite();
                ((FA12Parameters) this.instance).setEntrypointBytes(byteString);
                return this;
            }

            public Builder setFrom(String str) {
                copyOnWrite();
                ((FA12Parameters) this.instance).setFrom(str);
                return this;
            }

            public Builder setFromBytes(ByteString byteString) {
                copyOnWrite();
                ((FA12Parameters) this.instance).setFromBytes(byteString);
                return this;
            }

            public Builder setTo(String str) {
                copyOnWrite();
                ((FA12Parameters) this.instance).setTo(str);
                return this;
            }

            public Builder setToBytes(ByteString byteString) {
                copyOnWrite();
                ((FA12Parameters) this.instance).setToBytes(byteString);
                return this;
            }

            public Builder setValue(String str) {
                copyOnWrite();
                ((FA12Parameters) this.instance).setValue(str);
                return this;
            }

            public Builder setValueBytes(ByteString byteString) {
                copyOnWrite();
                ((FA12Parameters) this.instance).setValueBytes(byteString);
                return this;
            }

            private Builder() {
                super(FA12Parameters.DEFAULT_INSTANCE);
            }
        }

        static {
            FA12Parameters fA12Parameters = new FA12Parameters();
            DEFAULT_INSTANCE = fA12Parameters;
            GeneratedMessageLite.registerDefaultInstance(FA12Parameters.class, fA12Parameters);
        }

        private FA12Parameters() {
        }

        /* access modifiers changed from: private */
        public void clearEntrypoint() {
            this.entrypoint_ = getDefaultInstance().getEntrypoint();
        }

        /* access modifiers changed from: private */
        public void clearFrom() {
            this.from_ = getDefaultInstance().getFrom();
        }

        /* access modifiers changed from: private */
        public void clearTo() {
            this.to_ = getDefaultInstance().getTo();
        }

        /* access modifiers changed from: private */
        public void clearValue() {
            this.value_ = getDefaultInstance().getValue();
        }

        public static FA12Parameters getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FA12Parameters parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FA12Parameters) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FA12Parameters parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (FA12Parameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<FA12Parameters> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setEntrypoint(String str) {
            str.getClass();
            this.entrypoint_ = str;
        }

        /* access modifiers changed from: private */
        public void setEntrypointBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.entrypoint_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setFrom(String str) {
            str.getClass();
            this.from_ = str;
        }

        /* access modifiers changed from: private */
        public void setFromBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.from_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setTo(String str) {
            str.getClass();
            this.to_ = str;
        }

        /* access modifiers changed from: private */
        public void setToBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.to_ = byteString.toStringUtf8();
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
            switch (C97691.f46582xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new FA12Parameters();
                case 2:
                    return new Builder((C97691) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"entrypoint_", "from_", "to_", "value_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<FA12Parameters> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (FA12Parameters.class) {
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

        public String getEntrypoint() {
            return this.entrypoint_;
        }

        public ByteString getEntrypointBytes() {
            return ByteString.copyFromUtf8(this.entrypoint_);
        }

        public String getFrom() {
            return this.from_;
        }

        public ByteString getFromBytes() {
            return ByteString.copyFromUtf8(this.from_);
        }

        public String getTo() {
            return this.to_;
        }

        public ByteString getToBytes() {
            return ByteString.copyFromUtf8(this.to_);
        }

        public String getValue() {
            return this.value_;
        }

        public ByteString getValueBytes() {
            return ByteString.copyFromUtf8(this.value_);
        }

        public static Builder newBuilder(FA12Parameters fA12Parameters) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(fA12Parameters);
        }

        public static FA12Parameters parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (FA12Parameters) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static FA12Parameters parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (FA12Parameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static FA12Parameters parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (FA12Parameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static FA12Parameters parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (FA12Parameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static FA12Parameters parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (FA12Parameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FA12Parameters parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (FA12Parameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static FA12Parameters parseFrom(InputStream inputStream) throws IOException {
            return (FA12Parameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FA12Parameters parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (FA12Parameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static FA12Parameters parseFrom(C4969g gVar) throws IOException {
            return (FA12Parameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static FA12Parameters parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (FA12Parameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface FA12ParametersOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getEntrypoint();

        ByteString getEntrypointBytes();

        String getFrom();

        ByteString getFromBytes();

        String getTo();

        ByteString getToBytes();

        String getValue();

        ByteString getValueBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class FA2Parameters extends GeneratedMessageLite<FA2Parameters, Builder> implements FA2ParametersOrBuilder {
        /* access modifiers changed from: private */
        public static final FA2Parameters DEFAULT_INSTANCE;
        public static final int ENTRYPOINT_FIELD_NUMBER = 1;
        private static volatile im4<FA2Parameters> PARSER = null;
        public static final int TXS_OBJECT_FIELD_NUMBER = 2;
        private String entrypoint_ = "";
        private C5011t.C5020i<TxObject> txsObject_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.C4930a<FA2Parameters, Builder> implements FA2ParametersOrBuilder {
            public /* synthetic */ Builder(C97691 r1) {
                this();
            }

            public Builder addAllTxsObject(Iterable<? extends TxObject> iterable) {
                copyOnWrite();
                ((FA2Parameters) this.instance).addAllTxsObject(iterable);
                return this;
            }

            public Builder addTxsObject(TxObject txObject) {
                copyOnWrite();
                ((FA2Parameters) this.instance).addTxsObject(txObject);
                return this;
            }

            public Builder clearEntrypoint() {
                copyOnWrite();
                ((FA2Parameters) this.instance).clearEntrypoint();
                return this;
            }

            public Builder clearTxsObject() {
                copyOnWrite();
                ((FA2Parameters) this.instance).clearTxsObject();
                return this;
            }

            public String getEntrypoint() {
                return ((FA2Parameters) this.instance).getEntrypoint();
            }

            public ByteString getEntrypointBytes() {
                return ((FA2Parameters) this.instance).getEntrypointBytes();
            }

            public TxObject getTxsObject(int i) {
                return ((FA2Parameters) this.instance).getTxsObject(i);
            }

            public int getTxsObjectCount() {
                return ((FA2Parameters) this.instance).getTxsObjectCount();
            }

            public List<TxObject> getTxsObjectList() {
                return Collections.unmodifiableList(((FA2Parameters) this.instance).getTxsObjectList());
            }

            public Builder removeTxsObject(int i) {
                copyOnWrite();
                ((FA2Parameters) this.instance).removeTxsObject(i);
                return this;
            }

            public Builder setEntrypoint(String str) {
                copyOnWrite();
                ((FA2Parameters) this.instance).setEntrypoint(str);
                return this;
            }

            public Builder setEntrypointBytes(ByteString byteString) {
                copyOnWrite();
                ((FA2Parameters) this.instance).setEntrypointBytes(byteString);
                return this;
            }

            public Builder setTxsObject(int i, TxObject txObject) {
                copyOnWrite();
                ((FA2Parameters) this.instance).setTxsObject(i, txObject);
                return this;
            }

            private Builder() {
                super(FA2Parameters.DEFAULT_INSTANCE);
            }

            public Builder addTxsObject(int i, TxObject txObject) {
                copyOnWrite();
                ((FA2Parameters) this.instance).addTxsObject(i, txObject);
                return this;
            }

            public Builder setTxsObject(int i, TxObject.Builder builder) {
                copyOnWrite();
                ((FA2Parameters) this.instance).setTxsObject(i, (TxObject) builder.build());
                return this;
            }

            public Builder addTxsObject(TxObject.Builder builder) {
                copyOnWrite();
                ((FA2Parameters) this.instance).addTxsObject((TxObject) builder.build());
                return this;
            }

            public Builder addTxsObject(int i, TxObject.Builder builder) {
                copyOnWrite();
                ((FA2Parameters) this.instance).addTxsObject(i, (TxObject) builder.build());
                return this;
            }
        }

        static {
            FA2Parameters fA2Parameters = new FA2Parameters();
            DEFAULT_INSTANCE = fA2Parameters;
            GeneratedMessageLite.registerDefaultInstance(FA2Parameters.class, fA2Parameters);
        }

        private FA2Parameters() {
        }

        /* access modifiers changed from: private */
        public void addAllTxsObject(Iterable<? extends TxObject> iterable) {
            ensureTxsObjectIsMutable();
            C4949a.addAll(iterable, this.txsObject_);
        }

        /* access modifiers changed from: private */
        public void addTxsObject(TxObject txObject) {
            txObject.getClass();
            ensureTxsObjectIsMutable();
            this.txsObject_.add(txObject);
        }

        /* access modifiers changed from: private */
        public void clearEntrypoint() {
            this.entrypoint_ = getDefaultInstance().getEntrypoint();
        }

        /* access modifiers changed from: private */
        public void clearTxsObject() {
            this.txsObject_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureTxsObjectIsMutable() {
            C5011t.C5020i<TxObject> iVar = this.txsObject_;
            if (!iVar.mo37090v()) {
                this.txsObject_ = GeneratedMessageLite.mutableCopy(iVar);
            }
        }

        public static FA2Parameters getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FA2Parameters parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FA2Parameters) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FA2Parameters parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (FA2Parameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<FA2Parameters> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeTxsObject(int i) {
            ensureTxsObjectIsMutable();
            this.txsObject_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setEntrypoint(String str) {
            str.getClass();
            this.entrypoint_ = str;
        }

        /* access modifiers changed from: private */
        public void setEntrypointBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.entrypoint_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setTxsObject(int i, TxObject txObject) {
            txObject.getClass();
            ensureTxsObjectIsMutable();
            this.txsObject_.set(i, txObject);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97691.f46582xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new FA2Parameters();
                case 2:
                    return new Builder((C97691) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"entrypoint_", "txsObject_", TxObject.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<FA2Parameters> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (FA2Parameters.class) {
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

        public String getEntrypoint() {
            return this.entrypoint_;
        }

        public ByteString getEntrypointBytes() {
            return ByteString.copyFromUtf8(this.entrypoint_);
        }

        public TxObject getTxsObject(int i) {
            return this.txsObject_.get(i);
        }

        public int getTxsObjectCount() {
            return this.txsObject_.size();
        }

        public List<TxObject> getTxsObjectList() {
            return this.txsObject_;
        }

        public TxObjectOrBuilder getTxsObjectOrBuilder(int i) {
            return this.txsObject_.get(i);
        }

        public List<? extends TxObjectOrBuilder> getTxsObjectOrBuilderList() {
            return this.txsObject_;
        }

        public static Builder newBuilder(FA2Parameters fA2Parameters) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(fA2Parameters);
        }

        public static FA2Parameters parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (FA2Parameters) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static FA2Parameters parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (FA2Parameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static FA2Parameters parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (FA2Parameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* access modifiers changed from: private */
        public void addTxsObject(int i, TxObject txObject) {
            txObject.getClass();
            ensureTxsObjectIsMutable();
            this.txsObject_.add(i, txObject);
        }

        public static FA2Parameters parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (FA2Parameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static FA2Parameters parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (FA2Parameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FA2Parameters parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (FA2Parameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static FA2Parameters parseFrom(InputStream inputStream) throws IOException {
            return (FA2Parameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FA2Parameters parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (FA2Parameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static FA2Parameters parseFrom(C4969g gVar) throws IOException {
            return (FA2Parameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static FA2Parameters parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (FA2Parameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface FA2ParametersOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getEntrypoint();

        ByteString getEntrypointBytes();

        TxObject getTxsObject(int i);

        int getTxsObjectCount();

        List<TxObject> getTxsObjectList();

        /* synthetic */ boolean isInitialized();
    }

    public static final class Operation extends GeneratedMessageLite<Operation, Builder> implements OperationOrBuilder {
        public static final int COUNTER_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final Operation DEFAULT_INSTANCE;
        public static final int DELEGATION_OPERATION_DATA_FIELD_NUMBER = 11;
        public static final int FEE_FIELD_NUMBER = 3;
        public static final int GAS_LIMIT_FIELD_NUMBER = 4;
        public static final int KIND_FIELD_NUMBER = 7;
        private static volatile im4<Operation> PARSER = null;
        public static final int REVEAL_OPERATION_DATA_FIELD_NUMBER = 8;
        public static final int SOURCE_FIELD_NUMBER = 2;
        public static final int STORAGE_LIMIT_FIELD_NUMBER = 5;
        public static final int TRANSACTION_OPERATION_DATA_FIELD_NUMBER = 9;
        private long counter_;
        private long fee_;
        private long gasLimit_;
        private int kind_;
        private int operationDataCase_ = 0;
        private Object operationData_;
        private String source_ = "";
        private long storageLimit_;

        public static final class Builder extends GeneratedMessageLite.C4930a<Operation, Builder> implements OperationOrBuilder {
            public /* synthetic */ Builder(C97691 r1) {
                this();
            }

            public Builder clearCounter() {
                copyOnWrite();
                ((Operation) this.instance).clearCounter();
                return this;
            }

            public Builder clearDelegationOperationData() {
                copyOnWrite();
                ((Operation) this.instance).clearDelegationOperationData();
                return this;
            }

            public Builder clearFee() {
                copyOnWrite();
                ((Operation) this.instance).clearFee();
                return this;
            }

            public Builder clearGasLimit() {
                copyOnWrite();
                ((Operation) this.instance).clearGasLimit();
                return this;
            }

            public Builder clearKind() {
                copyOnWrite();
                ((Operation) this.instance).clearKind();
                return this;
            }

            public Builder clearOperationData() {
                copyOnWrite();
                ((Operation) this.instance).clearOperationData();
                return this;
            }

            public Builder clearRevealOperationData() {
                copyOnWrite();
                ((Operation) this.instance).clearRevealOperationData();
                return this;
            }

            public Builder clearSource() {
                copyOnWrite();
                ((Operation) this.instance).clearSource();
                return this;
            }

            public Builder clearStorageLimit() {
                copyOnWrite();
                ((Operation) this.instance).clearStorageLimit();
                return this;
            }

            public Builder clearTransactionOperationData() {
                copyOnWrite();
                ((Operation) this.instance).clearTransactionOperationData();
                return this;
            }

            public long getCounter() {
                return ((Operation) this.instance).getCounter();
            }

            public DelegationOperationData getDelegationOperationData() {
                return ((Operation) this.instance).getDelegationOperationData();
            }

            public long getFee() {
                return ((Operation) this.instance).getFee();
            }

            public long getGasLimit() {
                return ((Operation) this.instance).getGasLimit();
            }

            public OperationKind getKind() {
                return ((Operation) this.instance).getKind();
            }

            public int getKindValue() {
                return ((Operation) this.instance).getKindValue();
            }

            public OperationDataCase getOperationDataCase() {
                return ((Operation) this.instance).getOperationDataCase();
            }

            public RevealOperationData getRevealOperationData() {
                return ((Operation) this.instance).getRevealOperationData();
            }

            public String getSource() {
                return ((Operation) this.instance).getSource();
            }

            public ByteString getSourceBytes() {
                return ((Operation) this.instance).getSourceBytes();
            }

            public long getStorageLimit() {
                return ((Operation) this.instance).getStorageLimit();
            }

            public TransactionOperationData getTransactionOperationData() {
                return ((Operation) this.instance).getTransactionOperationData();
            }

            public boolean hasDelegationOperationData() {
                return ((Operation) this.instance).hasDelegationOperationData();
            }

            public boolean hasRevealOperationData() {
                return ((Operation) this.instance).hasRevealOperationData();
            }

            public boolean hasTransactionOperationData() {
                return ((Operation) this.instance).hasTransactionOperationData();
            }

            public Builder mergeDelegationOperationData(DelegationOperationData delegationOperationData) {
                copyOnWrite();
                ((Operation) this.instance).mergeDelegationOperationData(delegationOperationData);
                return this;
            }

            public Builder mergeRevealOperationData(RevealOperationData revealOperationData) {
                copyOnWrite();
                ((Operation) this.instance).mergeRevealOperationData(revealOperationData);
                return this;
            }

            public Builder mergeTransactionOperationData(TransactionOperationData transactionOperationData) {
                copyOnWrite();
                ((Operation) this.instance).mergeTransactionOperationData(transactionOperationData);
                return this;
            }

            public Builder setCounter(long j) {
                copyOnWrite();
                ((Operation) this.instance).setCounter(j);
                return this;
            }

            public Builder setDelegationOperationData(DelegationOperationData delegationOperationData) {
                copyOnWrite();
                ((Operation) this.instance).setDelegationOperationData(delegationOperationData);
                return this;
            }

            public Builder setFee(long j) {
                copyOnWrite();
                ((Operation) this.instance).setFee(j);
                return this;
            }

            public Builder setGasLimit(long j) {
                copyOnWrite();
                ((Operation) this.instance).setGasLimit(j);
                return this;
            }

            public Builder setKind(OperationKind operationKind) {
                copyOnWrite();
                ((Operation) this.instance).setKind(operationKind);
                return this;
            }

            public Builder setKindValue(int i) {
                copyOnWrite();
                ((Operation) this.instance).setKindValue(i);
                return this;
            }

            public Builder setRevealOperationData(RevealOperationData revealOperationData) {
                copyOnWrite();
                ((Operation) this.instance).setRevealOperationData(revealOperationData);
                return this;
            }

            public Builder setSource(String str) {
                copyOnWrite();
                ((Operation) this.instance).setSource(str);
                return this;
            }

            public Builder setSourceBytes(ByteString byteString) {
                copyOnWrite();
                ((Operation) this.instance).setSourceBytes(byteString);
                return this;
            }

            public Builder setStorageLimit(long j) {
                copyOnWrite();
                ((Operation) this.instance).setStorageLimit(j);
                return this;
            }

            public Builder setTransactionOperationData(TransactionOperationData transactionOperationData) {
                copyOnWrite();
                ((Operation) this.instance).setTransactionOperationData(transactionOperationData);
                return this;
            }

            private Builder() {
                super(Operation.DEFAULT_INSTANCE);
            }

            public Builder setDelegationOperationData(DelegationOperationData.Builder builder) {
                copyOnWrite();
                ((Operation) this.instance).setDelegationOperationData((DelegationOperationData) builder.build());
                return this;
            }

            public Builder setRevealOperationData(RevealOperationData.Builder builder) {
                copyOnWrite();
                ((Operation) this.instance).setRevealOperationData((RevealOperationData) builder.build());
                return this;
            }

            public Builder setTransactionOperationData(TransactionOperationData.Builder builder) {
                copyOnWrite();
                ((Operation) this.instance).setTransactionOperationData((TransactionOperationData) builder.build());
                return this;
            }
        }

        public enum OperationDataCase {
            REVEAL_OPERATION_DATA(8),
            TRANSACTION_OPERATION_DATA(9),
            DELEGATION_OPERATION_DATA(11),
            OPERATIONDATA_NOT_SET(0);
            
            private final int value;

            private OperationDataCase(int i) {
                this.value = i;
            }

            public static OperationDataCase forNumber(int i) {
                if (i == 0) {
                    return OPERATIONDATA_NOT_SET;
                }
                if (i == 11) {
                    return DELEGATION_OPERATION_DATA;
                }
                if (i == 8) {
                    return REVEAL_OPERATION_DATA;
                }
                if (i != 9) {
                    return null;
                }
                return TRANSACTION_OPERATION_DATA;
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static OperationDataCase valueOf(int i) {
                return forNumber(i);
            }
        }

        public enum OperationKind implements C5011t.C5014c {
            ENDORSEMENT(0),
            REVEAL(107),
            TRANSACTION(108),
            DELEGATION(110),
            UNRECOGNIZED(-1);
            
            public static final int DELEGATION_VALUE = 110;
            public static final int ENDORSEMENT_VALUE = 0;
            public static final int REVEAL_VALUE = 107;
            public static final int TRANSACTION_VALUE = 108;
            private static final C5011t.C5015d<OperationKind> internalValueMap = null;
            private final int value;

            public static final class OperationKindVerifier implements C5011t.C5016e {
                public static final C5011t.C5016e INSTANCE = null;

                static {
                    INSTANCE = new OperationKindVerifier();
                }

                private OperationKindVerifier() {
                }

                public boolean isInRange(int i) {
                    if (OperationKind.forNumber(i) != null) {
                        return true;
                    }
                    return false;
                }
            }

            /* access modifiers changed from: public */
            static {
                internalValueMap = new C5011t.C5015d<OperationKind>() {
                    public OperationKind findValueByNumber(int i) {
                        return OperationKind.forNumber(i);
                    }
                };
            }

            private OperationKind(int i) {
                this.value = i;
            }

            public static OperationKind forNumber(int i) {
                if (i == 0) {
                    return ENDORSEMENT;
                }
                if (i == 110) {
                    return DELEGATION;
                }
                if (i == 107) {
                    return REVEAL;
                }
                if (i != 108) {
                    return null;
                }
                return TRANSACTION;
            }

            public static C5011t.C5015d<OperationKind> internalGetValueMap() {
                return internalValueMap;
            }

            public static C5011t.C5016e internalGetVerifier() {
                return OperationKindVerifier.INSTANCE;
            }

            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Deprecated
            public static OperationKind valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            Operation operation = new Operation();
            DEFAULT_INSTANCE = operation;
            GeneratedMessageLite.registerDefaultInstance(Operation.class, operation);
        }

        private Operation() {
        }

        /* access modifiers changed from: private */
        public void clearCounter() {
            this.counter_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearDelegationOperationData() {
            if (this.operationDataCase_ == 11) {
                this.operationDataCase_ = 0;
                this.operationData_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearFee() {
            this.fee_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearGasLimit() {
            this.gasLimit_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearKind() {
            this.kind_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearOperationData() {
            this.operationDataCase_ = 0;
            this.operationData_ = null;
        }

        /* access modifiers changed from: private */
        public void clearRevealOperationData() {
            if (this.operationDataCase_ == 8) {
                this.operationDataCase_ = 0;
                this.operationData_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearSource() {
            this.source_ = getDefaultInstance().getSource();
        }

        /* access modifiers changed from: private */
        public void clearStorageLimit() {
            this.storageLimit_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTransactionOperationData() {
            if (this.operationDataCase_ == 9) {
                this.operationDataCase_ = 0;
                this.operationData_ = null;
            }
        }

        public static Operation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeDelegationOperationData(DelegationOperationData delegationOperationData) {
            delegationOperationData.getClass();
            if (this.operationDataCase_ != 11 || this.operationData_ == DelegationOperationData.getDefaultInstance()) {
                this.operationData_ = delegationOperationData;
            } else {
                this.operationData_ = ((DelegationOperationData.Builder) DelegationOperationData.newBuilder((DelegationOperationData) this.operationData_).mergeFrom(delegationOperationData)).buildPartial();
            }
            this.operationDataCase_ = 11;
        }

        /* access modifiers changed from: private */
        public void mergeRevealOperationData(RevealOperationData revealOperationData) {
            revealOperationData.getClass();
            if (this.operationDataCase_ != 8 || this.operationData_ == RevealOperationData.getDefaultInstance()) {
                this.operationData_ = revealOperationData;
            } else {
                this.operationData_ = ((RevealOperationData.Builder) RevealOperationData.newBuilder((RevealOperationData) this.operationData_).mergeFrom(revealOperationData)).buildPartial();
            }
            this.operationDataCase_ = 8;
        }

        /* access modifiers changed from: private */
        public void mergeTransactionOperationData(TransactionOperationData transactionOperationData) {
            transactionOperationData.getClass();
            if (this.operationDataCase_ != 9 || this.operationData_ == TransactionOperationData.getDefaultInstance()) {
                this.operationData_ = transactionOperationData;
            } else {
                this.operationData_ = ((TransactionOperationData.Builder) TransactionOperationData.newBuilder((TransactionOperationData) this.operationData_).mergeFrom(transactionOperationData)).buildPartial();
            }
            this.operationDataCase_ = 9;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Operation parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Operation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Operation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<Operation> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setCounter(long j) {
            this.counter_ = j;
        }

        /* access modifiers changed from: private */
        public void setDelegationOperationData(DelegationOperationData delegationOperationData) {
            delegationOperationData.getClass();
            this.operationData_ = delegationOperationData;
            this.operationDataCase_ = 11;
        }

        /* access modifiers changed from: private */
        public void setFee(long j) {
            this.fee_ = j;
        }

        /* access modifiers changed from: private */
        public void setGasLimit(long j) {
            this.gasLimit_ = j;
        }

        /* access modifiers changed from: private */
        public void setKind(OperationKind operationKind) {
            this.kind_ = operationKind.getNumber();
        }

        /* access modifiers changed from: private */
        public void setKindValue(int i) {
            this.kind_ = i;
        }

        /* access modifiers changed from: private */
        public void setRevealOperationData(RevealOperationData revealOperationData) {
            revealOperationData.getClass();
            this.operationData_ = revealOperationData;
            this.operationDataCase_ = 8;
        }

        /* access modifiers changed from: private */
        public void setSource(String str) {
            str.getClass();
            this.source_ = str;
        }

        /* access modifiers changed from: private */
        public void setSourceBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.source_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setStorageLimit(long j) {
            this.storageLimit_ = j;
        }

        /* access modifiers changed from: private */
        public void setTransactionOperationData(TransactionOperationData transactionOperationData) {
            transactionOperationData.getClass();
            this.operationData_ = transactionOperationData;
            this.operationDataCase_ = 9;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97691.f46582xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Operation();
                case 2:
                    return new Builder((C97691) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\u000b\t\u0000\u0000\u0000\u0001\u0002\u0002Ȉ\u0003\u0002\u0004\u0002\u0005\u0002\u0007\f\b<\u0000\t<\u0000\u000b<\u0000", new Object[]{"operationData_", "operationDataCase_", "counter_", "source_", "fee_", "gasLimit_", "storageLimit_", "kind_", RevealOperationData.class, TransactionOperationData.class, DelegationOperationData.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<Operation> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (Operation.class) {
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

        public long getCounter() {
            return this.counter_;
        }

        public DelegationOperationData getDelegationOperationData() {
            if (this.operationDataCase_ == 11) {
                return (DelegationOperationData) this.operationData_;
            }
            return DelegationOperationData.getDefaultInstance();
        }

        public long getFee() {
            return this.fee_;
        }

        public long getGasLimit() {
            return this.gasLimit_;
        }

        public OperationKind getKind() {
            OperationKind forNumber = OperationKind.forNumber(this.kind_);
            if (forNumber == null) {
                return OperationKind.UNRECOGNIZED;
            }
            return forNumber;
        }

        public int getKindValue() {
            return this.kind_;
        }

        public OperationDataCase getOperationDataCase() {
            return OperationDataCase.forNumber(this.operationDataCase_);
        }

        public RevealOperationData getRevealOperationData() {
            if (this.operationDataCase_ == 8) {
                return (RevealOperationData) this.operationData_;
            }
            return RevealOperationData.getDefaultInstance();
        }

        public String getSource() {
            return this.source_;
        }

        public ByteString getSourceBytes() {
            return ByteString.copyFromUtf8(this.source_);
        }

        public long getStorageLimit() {
            return this.storageLimit_;
        }

        public TransactionOperationData getTransactionOperationData() {
            if (this.operationDataCase_ == 9) {
                return (TransactionOperationData) this.operationData_;
            }
            return TransactionOperationData.getDefaultInstance();
        }

        public boolean hasDelegationOperationData() {
            if (this.operationDataCase_ == 11) {
                return true;
            }
            return false;
        }

        public boolean hasRevealOperationData() {
            if (this.operationDataCase_ == 8) {
                return true;
            }
            return false;
        }

        public boolean hasTransactionOperationData() {
            if (this.operationDataCase_ == 9) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(Operation operation) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(operation);
        }

        public static Operation parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Operation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Operation parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static Operation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Operation parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static Operation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Operation parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static Operation parseFrom(InputStream inputStream) throws IOException {
            return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Operation parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Operation parseFrom(C4969g gVar) throws IOException {
            return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static Operation parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public static final class OperationList extends GeneratedMessageLite<OperationList, Builder> implements OperationListOrBuilder {
        public static final int BRANCH_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final OperationList DEFAULT_INSTANCE;
        public static final int OPERATIONS_FIELD_NUMBER = 2;
        private static volatile im4<OperationList> PARSER;
        private String branch_ = "";
        private C5011t.C5020i<Operation> operations_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.C4930a<OperationList, Builder> implements OperationListOrBuilder {
            public /* synthetic */ Builder(C97691 r1) {
                this();
            }

            public Builder addAllOperations(Iterable<? extends Operation> iterable) {
                copyOnWrite();
                ((OperationList) this.instance).addAllOperations(iterable);
                return this;
            }

            public Builder addOperations(Operation operation) {
                copyOnWrite();
                ((OperationList) this.instance).addOperations(operation);
                return this;
            }

            public Builder clearBranch() {
                copyOnWrite();
                ((OperationList) this.instance).clearBranch();
                return this;
            }

            public Builder clearOperations() {
                copyOnWrite();
                ((OperationList) this.instance).clearOperations();
                return this;
            }

            public String getBranch() {
                return ((OperationList) this.instance).getBranch();
            }

            public ByteString getBranchBytes() {
                return ((OperationList) this.instance).getBranchBytes();
            }

            public Operation getOperations(int i) {
                return ((OperationList) this.instance).getOperations(i);
            }

            public int getOperationsCount() {
                return ((OperationList) this.instance).getOperationsCount();
            }

            public List<Operation> getOperationsList() {
                return Collections.unmodifiableList(((OperationList) this.instance).getOperationsList());
            }

            public Builder removeOperations(int i) {
                copyOnWrite();
                ((OperationList) this.instance).removeOperations(i);
                return this;
            }

            public Builder setBranch(String str) {
                copyOnWrite();
                ((OperationList) this.instance).setBranch(str);
                return this;
            }

            public Builder setBranchBytes(ByteString byteString) {
                copyOnWrite();
                ((OperationList) this.instance).setBranchBytes(byteString);
                return this;
            }

            public Builder setOperations(int i, Operation operation) {
                copyOnWrite();
                ((OperationList) this.instance).setOperations(i, operation);
                return this;
            }

            private Builder() {
                super(OperationList.DEFAULT_INSTANCE);
            }

            public Builder addOperations(int i, Operation operation) {
                copyOnWrite();
                ((OperationList) this.instance).addOperations(i, operation);
                return this;
            }

            public Builder setOperations(int i, Operation.Builder builder) {
                copyOnWrite();
                ((OperationList) this.instance).setOperations(i, (Operation) builder.build());
                return this;
            }

            public Builder addOperations(Operation.Builder builder) {
                copyOnWrite();
                ((OperationList) this.instance).addOperations((Operation) builder.build());
                return this;
            }

            public Builder addOperations(int i, Operation.Builder builder) {
                copyOnWrite();
                ((OperationList) this.instance).addOperations(i, (Operation) builder.build());
                return this;
            }
        }

        static {
            OperationList operationList = new OperationList();
            DEFAULT_INSTANCE = operationList;
            GeneratedMessageLite.registerDefaultInstance(OperationList.class, operationList);
        }

        private OperationList() {
        }

        /* access modifiers changed from: private */
        public void addAllOperations(Iterable<? extends Operation> iterable) {
            ensureOperationsIsMutable();
            C4949a.addAll(iterable, this.operations_);
        }

        /* access modifiers changed from: private */
        public void addOperations(Operation operation) {
            operation.getClass();
            ensureOperationsIsMutable();
            this.operations_.add(operation);
        }

        /* access modifiers changed from: private */
        public void clearBranch() {
            this.branch_ = getDefaultInstance().getBranch();
        }

        /* access modifiers changed from: private */
        public void clearOperations() {
            this.operations_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureOperationsIsMutable() {
            C5011t.C5020i<Operation> iVar = this.operations_;
            if (!iVar.mo37090v()) {
                this.operations_ = GeneratedMessageLite.mutableCopy(iVar);
            }
        }

        public static OperationList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static OperationList parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OperationList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationList parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (OperationList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<OperationList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeOperations(int i) {
            ensureOperationsIsMutable();
            this.operations_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setBranch(String str) {
            str.getClass();
            this.branch_ = str;
        }

        /* access modifiers changed from: private */
        public void setBranchBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.branch_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setOperations(int i, Operation operation) {
            operation.getClass();
            ensureOperationsIsMutable();
            this.operations_.set(i, operation);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97691.f46582xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new OperationList();
                case 2:
                    return new Builder((C97691) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"branch_", "operations_", Operation.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<OperationList> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (OperationList.class) {
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

        public String getBranch() {
            return this.branch_;
        }

        public ByteString getBranchBytes() {
            return ByteString.copyFromUtf8(this.branch_);
        }

        public Operation getOperations(int i) {
            return this.operations_.get(i);
        }

        public int getOperationsCount() {
            return this.operations_.size();
        }

        public List<Operation> getOperationsList() {
            return this.operations_;
        }

        public OperationOrBuilder getOperationsOrBuilder(int i) {
            return this.operations_.get(i);
        }

        public List<? extends OperationOrBuilder> getOperationsOrBuilderList() {
            return this.operations_;
        }

        public static Builder newBuilder(OperationList operationList) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(operationList);
        }

        public static OperationList parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (OperationList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static OperationList parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (OperationList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static OperationList parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OperationList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* access modifiers changed from: private */
        public void addOperations(int i, Operation operation) {
            operation.getClass();
            ensureOperationsIsMutable();
            this.operations_.add(i, operation);
        }

        public static OperationList parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (OperationList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static OperationList parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OperationList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OperationList parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (OperationList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static OperationList parseFrom(InputStream inputStream) throws IOException {
            return (OperationList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationList parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (OperationList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static OperationList parseFrom(C4969g gVar) throws IOException {
            return (OperationList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static OperationList parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (OperationList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface OperationListOrBuilder extends qu3 {
        String getBranch();

        ByteString getBranchBytes();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        Operation getOperations(int i);

        int getOperationsCount();

        List<Operation> getOperationsList();

        /* synthetic */ boolean isInitialized();
    }

    public interface OperationOrBuilder extends qu3 {
        long getCounter();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        DelegationOperationData getDelegationOperationData();

        long getFee();

        long getGasLimit();

        Operation.OperationKind getKind();

        int getKindValue();

        Operation.OperationDataCase getOperationDataCase();

        RevealOperationData getRevealOperationData();

        String getSource();

        ByteString getSourceBytes();

        long getStorageLimit();

        TransactionOperationData getTransactionOperationData();

        boolean hasDelegationOperationData();

        boolean hasRevealOperationData();

        boolean hasTransactionOperationData();

        /* synthetic */ boolean isInitialized();
    }

    public static final class OperationParameters extends GeneratedMessageLite<OperationParameters, Builder> implements OperationParametersOrBuilder {
        /* access modifiers changed from: private */
        public static final OperationParameters DEFAULT_INSTANCE;
        public static final int FA12_PARAMETERS_FIELD_NUMBER = 1;
        public static final int FA2_PARAMETERS_FIELD_NUMBER = 2;
        private static volatile im4<OperationParameters> PARSER;
        private int parametersCase_ = 0;
        private Object parameters_;

        public static final class Builder extends GeneratedMessageLite.C4930a<OperationParameters, Builder> implements OperationParametersOrBuilder {
            public /* synthetic */ Builder(C97691 r1) {
                this();
            }

            public Builder clearFa12Parameters() {
                copyOnWrite();
                ((OperationParameters) this.instance).clearFa12Parameters();
                return this;
            }

            public Builder clearFa2Parameters() {
                copyOnWrite();
                ((OperationParameters) this.instance).clearFa2Parameters();
                return this;
            }

            public Builder clearParameters() {
                copyOnWrite();
                ((OperationParameters) this.instance).clearParameters();
                return this;
            }

            public FA12Parameters getFa12Parameters() {
                return ((OperationParameters) this.instance).getFa12Parameters();
            }

            public FA2Parameters getFa2Parameters() {
                return ((OperationParameters) this.instance).getFa2Parameters();
            }

            public ParametersCase getParametersCase() {
                return ((OperationParameters) this.instance).getParametersCase();
            }

            public boolean hasFa12Parameters() {
                return ((OperationParameters) this.instance).hasFa12Parameters();
            }

            public boolean hasFa2Parameters() {
                return ((OperationParameters) this.instance).hasFa2Parameters();
            }

            public Builder mergeFa12Parameters(FA12Parameters fA12Parameters) {
                copyOnWrite();
                ((OperationParameters) this.instance).mergeFa12Parameters(fA12Parameters);
                return this;
            }

            public Builder mergeFa2Parameters(FA2Parameters fA2Parameters) {
                copyOnWrite();
                ((OperationParameters) this.instance).mergeFa2Parameters(fA2Parameters);
                return this;
            }

            public Builder setFa12Parameters(FA12Parameters fA12Parameters) {
                copyOnWrite();
                ((OperationParameters) this.instance).setFa12Parameters(fA12Parameters);
                return this;
            }

            public Builder setFa2Parameters(FA2Parameters fA2Parameters) {
                copyOnWrite();
                ((OperationParameters) this.instance).setFa2Parameters(fA2Parameters);
                return this;
            }

            private Builder() {
                super(OperationParameters.DEFAULT_INSTANCE);
            }

            public Builder setFa12Parameters(FA12Parameters.Builder builder) {
                copyOnWrite();
                ((OperationParameters) this.instance).setFa12Parameters((FA12Parameters) builder.build());
                return this;
            }

            public Builder setFa2Parameters(FA2Parameters.Builder builder) {
                copyOnWrite();
                ((OperationParameters) this.instance).setFa2Parameters((FA2Parameters) builder.build());
                return this;
            }
        }

        public enum ParametersCase {
            FA12_PARAMETERS(1),
            FA2_PARAMETERS(2),
            PARAMETERS_NOT_SET(0);
            
            private final int value;

            private ParametersCase(int i) {
                this.value = i;
            }

            public static ParametersCase forNumber(int i) {
                if (i == 0) {
                    return PARAMETERS_NOT_SET;
                }
                if (i == 1) {
                    return FA12_PARAMETERS;
                }
                if (i != 2) {
                    return null;
                }
                return FA2_PARAMETERS;
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static ParametersCase valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            OperationParameters operationParameters = new OperationParameters();
            DEFAULT_INSTANCE = operationParameters;
            GeneratedMessageLite.registerDefaultInstance(OperationParameters.class, operationParameters);
        }

        private OperationParameters() {
        }

        /* access modifiers changed from: private */
        public void clearFa12Parameters() {
            if (this.parametersCase_ == 1) {
                this.parametersCase_ = 0;
                this.parameters_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearFa2Parameters() {
            if (this.parametersCase_ == 2) {
                this.parametersCase_ = 0;
                this.parameters_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearParameters() {
            this.parametersCase_ = 0;
            this.parameters_ = null;
        }

        public static OperationParameters getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeFa12Parameters(FA12Parameters fA12Parameters) {
            fA12Parameters.getClass();
            if (this.parametersCase_ != 1 || this.parameters_ == FA12Parameters.getDefaultInstance()) {
                this.parameters_ = fA12Parameters;
            } else {
                this.parameters_ = ((FA12Parameters.Builder) FA12Parameters.newBuilder((FA12Parameters) this.parameters_).mergeFrom(fA12Parameters)).buildPartial();
            }
            this.parametersCase_ = 1;
        }

        /* access modifiers changed from: private */
        public void mergeFa2Parameters(FA2Parameters fA2Parameters) {
            fA2Parameters.getClass();
            if (this.parametersCase_ != 2 || this.parameters_ == FA2Parameters.getDefaultInstance()) {
                this.parameters_ = fA2Parameters;
            } else {
                this.parameters_ = ((FA2Parameters.Builder) FA2Parameters.newBuilder((FA2Parameters) this.parameters_).mergeFrom(fA2Parameters)).buildPartial();
            }
            this.parametersCase_ = 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static OperationParameters parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OperationParameters) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationParameters parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (OperationParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<OperationParameters> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setFa12Parameters(FA12Parameters fA12Parameters) {
            fA12Parameters.getClass();
            this.parameters_ = fA12Parameters;
            this.parametersCase_ = 1;
        }

        /* access modifiers changed from: private */
        public void setFa2Parameters(FA2Parameters fA2Parameters) {
            fA2Parameters.getClass();
            this.parameters_ = fA2Parameters;
            this.parametersCase_ = 2;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97691.f46582xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new OperationParameters();
                case 2:
                    return new Builder((C97691) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"parameters_", "parametersCase_", FA12Parameters.class, FA2Parameters.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<OperationParameters> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (OperationParameters.class) {
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

        public FA12Parameters getFa12Parameters() {
            if (this.parametersCase_ == 1) {
                return (FA12Parameters) this.parameters_;
            }
            return FA12Parameters.getDefaultInstance();
        }

        public FA2Parameters getFa2Parameters() {
            if (this.parametersCase_ == 2) {
                return (FA2Parameters) this.parameters_;
            }
            return FA2Parameters.getDefaultInstance();
        }

        public ParametersCase getParametersCase() {
            return ParametersCase.forNumber(this.parametersCase_);
        }

        public boolean hasFa12Parameters() {
            if (this.parametersCase_ == 1) {
                return true;
            }
            return false;
        }

        public boolean hasFa2Parameters() {
            if (this.parametersCase_ == 2) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(OperationParameters operationParameters) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(operationParameters);
        }

        public static OperationParameters parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (OperationParameters) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static OperationParameters parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (OperationParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static OperationParameters parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OperationParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static OperationParameters parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (OperationParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static OperationParameters parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OperationParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OperationParameters parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (OperationParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static OperationParameters parseFrom(InputStream inputStream) throws IOException {
            return (OperationParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationParameters parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (OperationParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static OperationParameters parseFrom(C4969g gVar) throws IOException {
            return (OperationParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static OperationParameters parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (OperationParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface OperationParametersOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        FA12Parameters getFa12Parameters();

        FA2Parameters getFa2Parameters();

        OperationParameters.ParametersCase getParametersCase();

        boolean hasFa12Parameters();

        boolean hasFa2Parameters();

        /* synthetic */ boolean isInitialized();
    }

    public static final class RevealOperationData extends GeneratedMessageLite<RevealOperationData, Builder> implements RevealOperationDataOrBuilder {
        /* access modifiers changed from: private */
        public static final RevealOperationData DEFAULT_INSTANCE;
        private static volatile im4<RevealOperationData> PARSER = null;
        public static final int PUBLIC_KEY_FIELD_NUMBER = 1;
        private ByteString publicKey_ = ByteString.EMPTY;

        public static final class Builder extends GeneratedMessageLite.C4930a<RevealOperationData, Builder> implements RevealOperationDataOrBuilder {
            public /* synthetic */ Builder(C97691 r1) {
                this();
            }

            public Builder clearPublicKey() {
                copyOnWrite();
                ((RevealOperationData) this.instance).clearPublicKey();
                return this;
            }

            public ByteString getPublicKey() {
                return ((RevealOperationData) this.instance).getPublicKey();
            }

            public Builder setPublicKey(ByteString byteString) {
                copyOnWrite();
                ((RevealOperationData) this.instance).setPublicKey(byteString);
                return this;
            }

            private Builder() {
                super(RevealOperationData.DEFAULT_INSTANCE);
            }
        }

        static {
            RevealOperationData revealOperationData = new RevealOperationData();
            DEFAULT_INSTANCE = revealOperationData;
            GeneratedMessageLite.registerDefaultInstance(RevealOperationData.class, revealOperationData);
        }

        private RevealOperationData() {
        }

        /* access modifiers changed from: private */
        public void clearPublicKey() {
            this.publicKey_ = getDefaultInstance().getPublicKey();
        }

        public static RevealOperationData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static RevealOperationData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RevealOperationData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RevealOperationData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (RevealOperationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<RevealOperationData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setPublicKey(ByteString byteString) {
            byteString.getClass();
            this.publicKey_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97691.f46582xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new RevealOperationData();
                case 2:
                    return new Builder((C97691) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"publicKey_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<RevealOperationData> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (RevealOperationData.class) {
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

        public ByteString getPublicKey() {
            return this.publicKey_;
        }

        public static Builder newBuilder(RevealOperationData revealOperationData) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(revealOperationData);
        }

        public static RevealOperationData parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (RevealOperationData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static RevealOperationData parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (RevealOperationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static RevealOperationData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (RevealOperationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RevealOperationData parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (RevealOperationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static RevealOperationData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (RevealOperationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RevealOperationData parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (RevealOperationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static RevealOperationData parseFrom(InputStream inputStream) throws IOException {
            return (RevealOperationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RevealOperationData parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (RevealOperationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static RevealOperationData parseFrom(C4969g gVar) throws IOException {
            return (RevealOperationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static RevealOperationData parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (RevealOperationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface RevealOperationDataOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        ByteString getPublicKey();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SigningInput extends GeneratedMessageLite<SigningInput, Builder> implements SigningInputOrBuilder {
        /* access modifiers changed from: private */
        public static final SigningInput DEFAULT_INSTANCE;
        public static final int OPERATION_LIST_FIELD_NUMBER = 1;
        private static volatile im4<SigningInput> PARSER = null;
        public static final int PRIVATE_KEY_FIELD_NUMBER = 2;
        private OperationList operationList_;
        private ByteString privateKey_ = ByteString.EMPTY;

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningInput, Builder> implements SigningInputOrBuilder {
            public /* synthetic */ Builder(C97691 r1) {
                this();
            }

            public Builder clearOperationList() {
                copyOnWrite();
                ((SigningInput) this.instance).clearOperationList();
                return this;
            }

            public Builder clearPrivateKey() {
                copyOnWrite();
                ((SigningInput) this.instance).clearPrivateKey();
                return this;
            }

            public OperationList getOperationList() {
                return ((SigningInput) this.instance).getOperationList();
            }

            public ByteString getPrivateKey() {
                return ((SigningInput) this.instance).getPrivateKey();
            }

            public boolean hasOperationList() {
                return ((SigningInput) this.instance).hasOperationList();
            }

            public Builder mergeOperationList(OperationList operationList) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeOperationList(operationList);
                return this;
            }

            public Builder setOperationList(OperationList operationList) {
                copyOnWrite();
                ((SigningInput) this.instance).setOperationList(operationList);
                return this;
            }

            public Builder setPrivateKey(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setPrivateKey(byteString);
                return this;
            }

            private Builder() {
                super(SigningInput.DEFAULT_INSTANCE);
            }

            public Builder setOperationList(OperationList.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setOperationList((OperationList) builder.build());
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
        public void clearOperationList() {
            this.operationList_ = null;
        }

        /* access modifiers changed from: private */
        public void clearPrivateKey() {
            this.privateKey_ = getDefaultInstance().getPrivateKey();
        }

        public static SigningInput getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeOperationList(OperationList operationList) {
            operationList.getClass();
            OperationList operationList2 = this.operationList_;
            if (operationList2 == null || operationList2 == OperationList.getDefaultInstance()) {
                this.operationList_ = operationList;
            } else {
                this.operationList_ = (OperationList) ((OperationList.Builder) OperationList.newBuilder(this.operationList_).mergeFrom(operationList)).buildPartial();
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
        public void setOperationList(OperationList operationList) {
            operationList.getClass();
            this.operationList_ = operationList;
        }

        /* access modifiers changed from: private */
        public void setPrivateKey(ByteString byteString) {
            byteString.getClass();
            this.privateKey_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97691.f46582xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningInput();
                case 2:
                    return new Builder((C97691) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\n", new Object[]{"operationList_", "privateKey_"});
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

        public OperationList getOperationList() {
            OperationList operationList = this.operationList_;
            if (operationList == null) {
                return OperationList.getDefaultInstance();
            }
            return operationList;
        }

        public ByteString getPrivateKey() {
            return this.privateKey_;
        }

        public boolean hasOperationList() {
            if (this.operationList_ != null) {
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

        OperationList getOperationList();

        ByteString getPrivateKey();

        boolean hasOperationList();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SigningOutput extends GeneratedMessageLite<SigningOutput, Builder> implements SigningOutputOrBuilder {
        /* access modifiers changed from: private */
        public static final SigningOutput DEFAULT_INSTANCE;
        public static final int ENCODED_FIELD_NUMBER = 1;
        private static volatile im4<SigningOutput> PARSER;
        private ByteString encoded_ = ByteString.EMPTY;

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningOutput, Builder> implements SigningOutputOrBuilder {
            public /* synthetic */ Builder(C97691 r1) {
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
            switch (C97691.f46582xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningOutput();
                case 2:
                    return new Builder((C97691) null);
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

    public static final class TransactionOperationData extends GeneratedMessageLite<TransactionOperationData, Builder> implements TransactionOperationDataOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final TransactionOperationData DEFAULT_INSTANCE;
        public static final int DESTINATION_FIELD_NUMBER = 1;
        public static final int PARAMETERS_FIELD_NUMBER = 3;
        private static volatile im4<TransactionOperationData> PARSER;
        private long amount_;
        private String destination_ = "";
        private OperationParameters parameters_;

        public static final class Builder extends GeneratedMessageLite.C4930a<TransactionOperationData, Builder> implements TransactionOperationDataOrBuilder {
            public /* synthetic */ Builder(C97691 r1) {
                this();
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((TransactionOperationData) this.instance).clearAmount();
                return this;
            }

            public Builder clearDestination() {
                copyOnWrite();
                ((TransactionOperationData) this.instance).clearDestination();
                return this;
            }

            public Builder clearParameters() {
                copyOnWrite();
                ((TransactionOperationData) this.instance).clearParameters();
                return this;
            }

            public long getAmount() {
                return ((TransactionOperationData) this.instance).getAmount();
            }

            public String getDestination() {
                return ((TransactionOperationData) this.instance).getDestination();
            }

            public ByteString getDestinationBytes() {
                return ((TransactionOperationData) this.instance).getDestinationBytes();
            }

            public OperationParameters getParameters() {
                return ((TransactionOperationData) this.instance).getParameters();
            }

            public boolean hasParameters() {
                return ((TransactionOperationData) this.instance).hasParameters();
            }

            public Builder mergeParameters(OperationParameters operationParameters) {
                copyOnWrite();
                ((TransactionOperationData) this.instance).mergeParameters(operationParameters);
                return this;
            }

            public Builder setAmount(long j) {
                copyOnWrite();
                ((TransactionOperationData) this.instance).setAmount(j);
                return this;
            }

            public Builder setDestination(String str) {
                copyOnWrite();
                ((TransactionOperationData) this.instance).setDestination(str);
                return this;
            }

            public Builder setDestinationBytes(ByteString byteString) {
                copyOnWrite();
                ((TransactionOperationData) this.instance).setDestinationBytes(byteString);
                return this;
            }

            public Builder setParameters(OperationParameters operationParameters) {
                copyOnWrite();
                ((TransactionOperationData) this.instance).setParameters(operationParameters);
                return this;
            }

            private Builder() {
                super(TransactionOperationData.DEFAULT_INSTANCE);
            }

            public Builder setParameters(OperationParameters.Builder builder) {
                copyOnWrite();
                ((TransactionOperationData) this.instance).setParameters((OperationParameters) builder.build());
                return this;
            }
        }

        static {
            TransactionOperationData transactionOperationData = new TransactionOperationData();
            DEFAULT_INSTANCE = transactionOperationData;
            GeneratedMessageLite.registerDefaultInstance(TransactionOperationData.class, transactionOperationData);
        }

        private TransactionOperationData() {
        }

        /* access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearDestination() {
            this.destination_ = getDefaultInstance().getDestination();
        }

        /* access modifiers changed from: private */
        public void clearParameters() {
            this.parameters_ = null;
        }

        public static TransactionOperationData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeParameters(OperationParameters operationParameters) {
            operationParameters.getClass();
            OperationParameters operationParameters2 = this.parameters_;
            if (operationParameters2 == null || operationParameters2 == OperationParameters.getDefaultInstance()) {
                this.parameters_ = operationParameters;
            } else {
                this.parameters_ = (OperationParameters) ((OperationParameters.Builder) OperationParameters.newBuilder(this.parameters_).mergeFrom(operationParameters)).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TransactionOperationData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TransactionOperationData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TransactionOperationData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TransactionOperationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<TransactionOperationData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAmount(long j) {
            this.amount_ = j;
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
        public void setParameters(OperationParameters operationParameters) {
            operationParameters.getClass();
            this.parameters_ = operationParameters;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97691.f46582xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TransactionOperationData();
                case 2:
                    return new Builder((C97691) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\t", new Object[]{"destination_", "amount_", "parameters_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<TransactionOperationData> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (TransactionOperationData.class) {
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

        public String getDestination() {
            return this.destination_;
        }

        public ByteString getDestinationBytes() {
            return ByteString.copyFromUtf8(this.destination_);
        }

        public OperationParameters getParameters() {
            OperationParameters operationParameters = this.parameters_;
            if (operationParameters == null) {
                return OperationParameters.getDefaultInstance();
            }
            return operationParameters;
        }

        public boolean hasParameters() {
            if (this.parameters_ != null) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(TransactionOperationData transactionOperationData) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(transactionOperationData);
        }

        public static TransactionOperationData parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TransactionOperationData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TransactionOperationData parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransactionOperationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static TransactionOperationData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TransactionOperationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TransactionOperationData parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransactionOperationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static TransactionOperationData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TransactionOperationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TransactionOperationData parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransactionOperationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static TransactionOperationData parseFrom(InputStream inputStream) throws IOException {
            return (TransactionOperationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TransactionOperationData parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TransactionOperationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TransactionOperationData parseFrom(C4969g gVar) throws IOException {
            return (TransactionOperationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static TransactionOperationData parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (TransactionOperationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface TransactionOperationDataOrBuilder extends qu3 {
        long getAmount();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getDestination();

        ByteString getDestinationBytes();

        OperationParameters getParameters();

        boolean hasParameters();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TxObject extends GeneratedMessageLite<TxObject, Builder> implements TxObjectOrBuilder {
        /* access modifiers changed from: private */
        public static final TxObject DEFAULT_INSTANCE;
        public static final int FROM_FIELD_NUMBER = 1;
        private static volatile im4<TxObject> PARSER = null;
        public static final int TXS_FIELD_NUMBER = 2;
        private String from_ = "";
        private C5011t.C5020i<Txs> txs_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.C4930a<TxObject, Builder> implements TxObjectOrBuilder {
            public /* synthetic */ Builder(C97691 r1) {
                this();
            }

            public Builder addAllTxs(Iterable<? extends Txs> iterable) {
                copyOnWrite();
                ((TxObject) this.instance).addAllTxs(iterable);
                return this;
            }

            public Builder addTxs(Txs txs) {
                copyOnWrite();
                ((TxObject) this.instance).addTxs(txs);
                return this;
            }

            public Builder clearFrom() {
                copyOnWrite();
                ((TxObject) this.instance).clearFrom();
                return this;
            }

            public Builder clearTxs() {
                copyOnWrite();
                ((TxObject) this.instance).clearTxs();
                return this;
            }

            public String getFrom() {
                return ((TxObject) this.instance).getFrom();
            }

            public ByteString getFromBytes() {
                return ((TxObject) this.instance).getFromBytes();
            }

            public Txs getTxs(int i) {
                return ((TxObject) this.instance).getTxs(i);
            }

            public int getTxsCount() {
                return ((TxObject) this.instance).getTxsCount();
            }

            public List<Txs> getTxsList() {
                return Collections.unmodifiableList(((TxObject) this.instance).getTxsList());
            }

            public Builder removeTxs(int i) {
                copyOnWrite();
                ((TxObject) this.instance).removeTxs(i);
                return this;
            }

            public Builder setFrom(String str) {
                copyOnWrite();
                ((TxObject) this.instance).setFrom(str);
                return this;
            }

            public Builder setFromBytes(ByteString byteString) {
                copyOnWrite();
                ((TxObject) this.instance).setFromBytes(byteString);
                return this;
            }

            public Builder setTxs(int i, Txs txs) {
                copyOnWrite();
                ((TxObject) this.instance).setTxs(i, txs);
                return this;
            }

            private Builder() {
                super(TxObject.DEFAULT_INSTANCE);
            }

            public Builder addTxs(int i, Txs txs) {
                copyOnWrite();
                ((TxObject) this.instance).addTxs(i, txs);
                return this;
            }

            public Builder setTxs(int i, Txs.Builder builder) {
                copyOnWrite();
                ((TxObject) this.instance).setTxs(i, (Txs) builder.build());
                return this;
            }

            public Builder addTxs(Txs.Builder builder) {
                copyOnWrite();
                ((TxObject) this.instance).addTxs((Txs) builder.build());
                return this;
            }

            public Builder addTxs(int i, Txs.Builder builder) {
                copyOnWrite();
                ((TxObject) this.instance).addTxs(i, (Txs) builder.build());
                return this;
            }
        }

        static {
            TxObject txObject = new TxObject();
            DEFAULT_INSTANCE = txObject;
            GeneratedMessageLite.registerDefaultInstance(TxObject.class, txObject);
        }

        private TxObject() {
        }

        /* access modifiers changed from: private */
        public void addAllTxs(Iterable<? extends Txs> iterable) {
            ensureTxsIsMutable();
            C4949a.addAll(iterable, this.txs_);
        }

        /* access modifiers changed from: private */
        public void addTxs(Txs txs) {
            txs.getClass();
            ensureTxsIsMutable();
            this.txs_.add(txs);
        }

        /* access modifiers changed from: private */
        public void clearFrom() {
            this.from_ = getDefaultInstance().getFrom();
        }

        /* access modifiers changed from: private */
        public void clearTxs() {
            this.txs_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureTxsIsMutable() {
            C5011t.C5020i<Txs> iVar = this.txs_;
            if (!iVar.mo37090v()) {
                this.txs_ = GeneratedMessageLite.mutableCopy(iVar);
            }
        }

        public static TxObject getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TxObject parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TxObject) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TxObject parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TxObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<TxObject> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeTxs(int i) {
            ensureTxsIsMutable();
            this.txs_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setFrom(String str) {
            str.getClass();
            this.from_ = str;
        }

        /* access modifiers changed from: private */
        public void setFromBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.from_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setTxs(int i, Txs txs) {
            txs.getClass();
            ensureTxsIsMutable();
            this.txs_.set(i, txs);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97691.f46582xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TxObject();
                case 2:
                    return new Builder((C97691) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"from_", "txs_", Txs.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<TxObject> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (TxObject.class) {
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

        public String getFrom() {
            return this.from_;
        }

        public ByteString getFromBytes() {
            return ByteString.copyFromUtf8(this.from_);
        }

        public Txs getTxs(int i) {
            return this.txs_.get(i);
        }

        public int getTxsCount() {
            return this.txs_.size();
        }

        public List<Txs> getTxsList() {
            return this.txs_;
        }

        public TxsOrBuilder getTxsOrBuilder(int i) {
            return this.txs_.get(i);
        }

        public List<? extends TxsOrBuilder> getTxsOrBuilderList() {
            return this.txs_;
        }

        public static Builder newBuilder(TxObject txObject) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(txObject);
        }

        public static TxObject parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TxObject) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TxObject parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (TxObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static TxObject parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TxObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* access modifiers changed from: private */
        public void addTxs(int i, Txs txs) {
            txs.getClass();
            ensureTxsIsMutable();
            this.txs_.add(i, txs);
        }

        public static TxObject parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (TxObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static TxObject parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TxObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TxObject parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (TxObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static TxObject parseFrom(InputStream inputStream) throws IOException {
            return (TxObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TxObject parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TxObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TxObject parseFrom(C4969g gVar) throws IOException {
            return (TxObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static TxObject parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (TxObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface TxObjectOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getFrom();

        ByteString getFromBytes();

        Txs getTxs(int i);

        int getTxsCount();

        List<Txs> getTxsList();

        /* synthetic */ boolean isInitialized();
    }

    public static final class Txs extends GeneratedMessageLite<Txs, Builder> implements TxsOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final Txs DEFAULT_INSTANCE;
        private static volatile im4<Txs> PARSER = null;
        public static final int TOKEN_ID_FIELD_NUMBER = 2;
        public static final int TO_FIELD_NUMBER = 1;
        private String amount_ = "";
        private String to_ = "";
        private String tokenId_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<Txs, Builder> implements TxsOrBuilder {
            public /* synthetic */ Builder(C97691 r1) {
                this();
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((Txs) this.instance).clearAmount();
                return this;
            }

            public Builder clearTo() {
                copyOnWrite();
                ((Txs) this.instance).clearTo();
                return this;
            }

            public Builder clearTokenId() {
                copyOnWrite();
                ((Txs) this.instance).clearTokenId();
                return this;
            }

            public String getAmount() {
                return ((Txs) this.instance).getAmount();
            }

            public ByteString getAmountBytes() {
                return ((Txs) this.instance).getAmountBytes();
            }

            public String getTo() {
                return ((Txs) this.instance).getTo();
            }

            public ByteString getToBytes() {
                return ((Txs) this.instance).getToBytes();
            }

            public String getTokenId() {
                return ((Txs) this.instance).getTokenId();
            }

            public ByteString getTokenIdBytes() {
                return ((Txs) this.instance).getTokenIdBytes();
            }

            public Builder setAmount(String str) {
                copyOnWrite();
                ((Txs) this.instance).setAmount(str);
                return this;
            }

            public Builder setAmountBytes(ByteString byteString) {
                copyOnWrite();
                ((Txs) this.instance).setAmountBytes(byteString);
                return this;
            }

            public Builder setTo(String str) {
                copyOnWrite();
                ((Txs) this.instance).setTo(str);
                return this;
            }

            public Builder setToBytes(ByteString byteString) {
                copyOnWrite();
                ((Txs) this.instance).setToBytes(byteString);
                return this;
            }

            public Builder setTokenId(String str) {
                copyOnWrite();
                ((Txs) this.instance).setTokenId(str);
                return this;
            }

            public Builder setTokenIdBytes(ByteString byteString) {
                copyOnWrite();
                ((Txs) this.instance).setTokenIdBytes(byteString);
                return this;
            }

            private Builder() {
                super(Txs.DEFAULT_INSTANCE);
            }
        }

        static {
            Txs txs = new Txs();
            DEFAULT_INSTANCE = txs;
            GeneratedMessageLite.registerDefaultInstance(Txs.class, txs);
        }

        private Txs() {
        }

        /* access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = getDefaultInstance().getAmount();
        }

        /* access modifiers changed from: private */
        public void clearTo() {
            this.to_ = getDefaultInstance().getTo();
        }

        /* access modifiers changed from: private */
        public void clearTokenId() {
            this.tokenId_ = getDefaultInstance().getTokenId();
        }

        public static Txs getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Txs parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Txs) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Txs parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Txs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<Txs> parser() {
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
        public void setTo(String str) {
            str.getClass();
            this.to_ = str;
        }

        /* access modifiers changed from: private */
        public void setToBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.to_ = byteString.toStringUtf8();
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
            switch (C97691.f46582xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Txs();
                case 2:
                    return new Builder((C97691) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"to_", "tokenId_", "amount_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<Txs> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (Txs.class) {
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

        public String getTo() {
            return this.to_;
        }

        public ByteString getToBytes() {
            return ByteString.copyFromUtf8(this.to_);
        }

        public String getTokenId() {
            return this.tokenId_;
        }

        public ByteString getTokenIdBytes() {
            return ByteString.copyFromUtf8(this.tokenId_);
        }

        public static Builder newBuilder(Txs txs) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(txs);
        }

        public static Txs parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Txs) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Txs parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (Txs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static Txs parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Txs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Txs parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (Txs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static Txs parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Txs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Txs parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (Txs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static Txs parseFrom(InputStream inputStream) throws IOException {
            return (Txs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Txs parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Txs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Txs parseFrom(C4969g gVar) throws IOException {
            return (Txs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static Txs parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (Txs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface TxsOrBuilder extends qu3 {
        String getAmount();

        ByteString getAmountBytes();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getTo();

        ByteString getToBytes();

        String getTokenId();

        ByteString getTokenIdBytes();

        /* synthetic */ boolean isInitialized();
    }

    private Tezos() {
    }

    public static void registerAllExtensions(C4987l lVar) {
    }
}
