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

public final class NEO {

    /* renamed from: wallet.core.jni.proto.NEO$1 */
    public static /* synthetic */ class C97521 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f46568xa1df5c61;

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
                f46568xa1df5c61 = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f46568xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f46568xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f46568xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f46568xa1df5c61     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f46568xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f46568xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wallet.core.jni.proto.NEO.C97521.<clinit>():void");
        }
    }

    public static final class SigningInput extends GeneratedMessageLite<SigningInput, Builder> implements SigningInputOrBuilder {
        /* access modifiers changed from: private */
        public static final SigningInput DEFAULT_INSTANCE;
        public static final int FEE_FIELD_NUMBER = 4;
        public static final int GAS_ASSET_ID_FIELD_NUMBER = 5;
        public static final int GAS_CHANGE_ADDRESS_FIELD_NUMBER = 6;
        public static final int INPUTS_FIELD_NUMBER = 1;
        public static final int OUTPUTS_FIELD_NUMBER = 2;
        private static volatile im4<SigningInput> PARSER = null;
        public static final int PLAN_FIELD_NUMBER = 7;
        public static final int PRIVATE_KEY_FIELD_NUMBER = 3;
        private long fee_;
        private String gasAssetId_ = "";
        private String gasChangeAddress_ = "";
        private C5011t.C5020i<TransactionInput> inputs_ = GeneratedMessageLite.emptyProtobufList();
        private C5011t.C5020i<TransactionOutput> outputs_ = GeneratedMessageLite.emptyProtobufList();
        private TransactionPlan plan_;
        private ByteString privateKey_ = ByteString.EMPTY;

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningInput, Builder> implements SigningInputOrBuilder {
            public /* synthetic */ Builder(C97521 r1) {
                this();
            }

            public Builder addAllInputs(Iterable<? extends TransactionInput> iterable) {
                copyOnWrite();
                ((SigningInput) this.instance).addAllInputs(iterable);
                return this;
            }

            public Builder addAllOutputs(Iterable<? extends TransactionOutput> iterable) {
                copyOnWrite();
                ((SigningInput) this.instance).addAllOutputs(iterable);
                return this;
            }

            public Builder addInputs(TransactionInput transactionInput) {
                copyOnWrite();
                ((SigningInput) this.instance).addInputs(transactionInput);
                return this;
            }

            public Builder addOutputs(TransactionOutput transactionOutput) {
                copyOnWrite();
                ((SigningInput) this.instance).addOutputs(transactionOutput);
                return this;
            }

            public Builder clearFee() {
                copyOnWrite();
                ((SigningInput) this.instance).clearFee();
                return this;
            }

            public Builder clearGasAssetId() {
                copyOnWrite();
                ((SigningInput) this.instance).clearGasAssetId();
                return this;
            }

            public Builder clearGasChangeAddress() {
                copyOnWrite();
                ((SigningInput) this.instance).clearGasChangeAddress();
                return this;
            }

            public Builder clearInputs() {
                copyOnWrite();
                ((SigningInput) this.instance).clearInputs();
                return this;
            }

            public Builder clearOutputs() {
                copyOnWrite();
                ((SigningInput) this.instance).clearOutputs();
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

            public long getFee() {
                return ((SigningInput) this.instance).getFee();
            }

            public String getGasAssetId() {
                return ((SigningInput) this.instance).getGasAssetId();
            }

            public ByteString getGasAssetIdBytes() {
                return ((SigningInput) this.instance).getGasAssetIdBytes();
            }

            public String getGasChangeAddress() {
                return ((SigningInput) this.instance).getGasChangeAddress();
            }

            public ByteString getGasChangeAddressBytes() {
                return ((SigningInput) this.instance).getGasChangeAddressBytes();
            }

            public TransactionInput getInputs(int i) {
                return ((SigningInput) this.instance).getInputs(i);
            }

            public int getInputsCount() {
                return ((SigningInput) this.instance).getInputsCount();
            }

            public List<TransactionInput> getInputsList() {
                return Collections.unmodifiableList(((SigningInput) this.instance).getInputsList());
            }

            public TransactionOutput getOutputs(int i) {
                return ((SigningInput) this.instance).getOutputs(i);
            }

            public int getOutputsCount() {
                return ((SigningInput) this.instance).getOutputsCount();
            }

            public List<TransactionOutput> getOutputsList() {
                return Collections.unmodifiableList(((SigningInput) this.instance).getOutputsList());
            }

            public TransactionPlan getPlan() {
                return ((SigningInput) this.instance).getPlan();
            }

            public ByteString getPrivateKey() {
                return ((SigningInput) this.instance).getPrivateKey();
            }

            public boolean hasPlan() {
                return ((SigningInput) this.instance).hasPlan();
            }

            public Builder mergePlan(TransactionPlan transactionPlan) {
                copyOnWrite();
                ((SigningInput) this.instance).mergePlan(transactionPlan);
                return this;
            }

            public Builder removeInputs(int i) {
                copyOnWrite();
                ((SigningInput) this.instance).removeInputs(i);
                return this;
            }

            public Builder removeOutputs(int i) {
                copyOnWrite();
                ((SigningInput) this.instance).removeOutputs(i);
                return this;
            }

            public Builder setFee(long j) {
                copyOnWrite();
                ((SigningInput) this.instance).setFee(j);
                return this;
            }

            public Builder setGasAssetId(String str) {
                copyOnWrite();
                ((SigningInput) this.instance).setGasAssetId(str);
                return this;
            }

            public Builder setGasAssetIdBytes(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setGasAssetIdBytes(byteString);
                return this;
            }

            public Builder setGasChangeAddress(String str) {
                copyOnWrite();
                ((SigningInput) this.instance).setGasChangeAddress(str);
                return this;
            }

            public Builder setGasChangeAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setGasChangeAddressBytes(byteString);
                return this;
            }

            public Builder setInputs(int i, TransactionInput transactionInput) {
                copyOnWrite();
                ((SigningInput) this.instance).setInputs(i, transactionInput);
                return this;
            }

            public Builder setOutputs(int i, TransactionOutput transactionOutput) {
                copyOnWrite();
                ((SigningInput) this.instance).setOutputs(i, transactionOutput);
                return this;
            }

            public Builder setPlan(TransactionPlan transactionPlan) {
                copyOnWrite();
                ((SigningInput) this.instance).setPlan(transactionPlan);
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

            public Builder addInputs(int i, TransactionInput transactionInput) {
                copyOnWrite();
                ((SigningInput) this.instance).addInputs(i, transactionInput);
                return this;
            }

            public Builder addOutputs(int i, TransactionOutput transactionOutput) {
                copyOnWrite();
                ((SigningInput) this.instance).addOutputs(i, transactionOutput);
                return this;
            }

            public Builder setInputs(int i, TransactionInput.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setInputs(i, (TransactionInput) builder.build());
                return this;
            }

            public Builder setOutputs(int i, TransactionOutput.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setOutputs(i, (TransactionOutput) builder.build());
                return this;
            }

            public Builder setPlan(TransactionPlan.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setPlan((TransactionPlan) builder.build());
                return this;
            }

            public Builder addInputs(TransactionInput.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).addInputs((TransactionInput) builder.build());
                return this;
            }

            public Builder addOutputs(TransactionOutput.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).addOutputs((TransactionOutput) builder.build());
                return this;
            }

            public Builder addInputs(int i, TransactionInput.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).addInputs(i, (TransactionInput) builder.build());
                return this;
            }

            public Builder addOutputs(int i, TransactionOutput.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).addOutputs(i, (TransactionOutput) builder.build());
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
        public void addAllInputs(Iterable<? extends TransactionInput> iterable) {
            ensureInputsIsMutable();
            C4949a.addAll(iterable, this.inputs_);
        }

        /* access modifiers changed from: private */
        public void addAllOutputs(Iterable<? extends TransactionOutput> iterable) {
            ensureOutputsIsMutable();
            C4949a.addAll(iterable, this.outputs_);
        }

        /* access modifiers changed from: private */
        public void addInputs(TransactionInput transactionInput) {
            transactionInput.getClass();
            ensureInputsIsMutable();
            this.inputs_.add(transactionInput);
        }

        /* access modifiers changed from: private */
        public void addOutputs(TransactionOutput transactionOutput) {
            transactionOutput.getClass();
            ensureOutputsIsMutable();
            this.outputs_.add(transactionOutput);
        }

        /* access modifiers changed from: private */
        public void clearFee() {
            this.fee_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearGasAssetId() {
            this.gasAssetId_ = getDefaultInstance().getGasAssetId();
        }

        /* access modifiers changed from: private */
        public void clearGasChangeAddress() {
            this.gasChangeAddress_ = getDefaultInstance().getGasChangeAddress();
        }

        /* access modifiers changed from: private */
        public void clearInputs() {
            this.inputs_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearOutputs() {
            this.outputs_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearPlan() {
            this.plan_ = null;
        }

        /* access modifiers changed from: private */
        public void clearPrivateKey() {
            this.privateKey_ = getDefaultInstance().getPrivateKey();
        }

        private void ensureInputsIsMutable() {
            C5011t.C5020i<TransactionInput> iVar = this.inputs_;
            if (!iVar.mo37090v()) {
                this.inputs_ = GeneratedMessageLite.mutableCopy(iVar);
            }
        }

        private void ensureOutputsIsMutable() {
            C5011t.C5020i<TransactionOutput> iVar = this.outputs_;
            if (!iVar.mo37090v()) {
                this.outputs_ = GeneratedMessageLite.mutableCopy(iVar);
            }
        }

        public static SigningInput getDefaultInstance() {
            return DEFAULT_INSTANCE;
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
        public void setFee(long j) {
            this.fee_ = j;
        }

        /* access modifiers changed from: private */
        public void setGasAssetId(String str) {
            str.getClass();
            this.gasAssetId_ = str;
        }

        /* access modifiers changed from: private */
        public void setGasAssetIdBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.gasAssetId_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setGasChangeAddress(String str) {
            str.getClass();
            this.gasChangeAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setGasChangeAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.gasChangeAddress_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setInputs(int i, TransactionInput transactionInput) {
            transactionInput.getClass();
            ensureInputsIsMutable();
            this.inputs_.set(i, transactionInput);
        }

        /* access modifiers changed from: private */
        public void setOutputs(int i, TransactionOutput transactionOutput) {
            transactionOutput.getClass();
            ensureOutputsIsMutable();
            this.outputs_.set(i, transactionOutput);
        }

        /* access modifiers changed from: private */
        public void setPlan(TransactionPlan transactionPlan) {
            transactionPlan.getClass();
            this.plan_ = transactionPlan;
        }

        /* access modifiers changed from: private */
        public void setPrivateKey(ByteString byteString) {
            byteString.getClass();
            this.privateKey_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97521.f46568xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningInput();
                case 2:
                    return new Builder((C97521) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003\n\u0004\u0002\u0005Ȉ\u0006Ȉ\u0007\t", new Object[]{"inputs_", TransactionInput.class, "outputs_", TransactionOutput.class, "privateKey_", "fee_", "gasAssetId_", "gasChangeAddress_", "plan_"});
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

        public long getFee() {
            return this.fee_;
        }

        public String getGasAssetId() {
            return this.gasAssetId_;
        }

        public ByteString getGasAssetIdBytes() {
            return ByteString.copyFromUtf8(this.gasAssetId_);
        }

        public String getGasChangeAddress() {
            return this.gasChangeAddress_;
        }

        public ByteString getGasChangeAddressBytes() {
            return ByteString.copyFromUtf8(this.gasChangeAddress_);
        }

        public TransactionInput getInputs(int i) {
            return this.inputs_.get(i);
        }

        public int getInputsCount() {
            return this.inputs_.size();
        }

        public List<TransactionInput> getInputsList() {
            return this.inputs_;
        }

        public TransactionInputOrBuilder getInputsOrBuilder(int i) {
            return this.inputs_.get(i);
        }

        public List<? extends TransactionInputOrBuilder> getInputsOrBuilderList() {
            return this.inputs_;
        }

        public TransactionOutput getOutputs(int i) {
            return this.outputs_.get(i);
        }

        public int getOutputsCount() {
            return this.outputs_.size();
        }

        public List<TransactionOutput> getOutputsList() {
            return this.outputs_;
        }

        public TransactionOutputOrBuilder getOutputsOrBuilder(int i) {
            return this.outputs_.get(i);
        }

        public List<? extends TransactionOutputOrBuilder> getOutputsOrBuilderList() {
            return this.outputs_;
        }

        public TransactionPlan getPlan() {
            TransactionPlan transactionPlan = this.plan_;
            if (transactionPlan == null) {
                return TransactionPlan.getDefaultInstance();
            }
            return transactionPlan;
        }

        public ByteString getPrivateKey() {
            return this.privateKey_;
        }

        public boolean hasPlan() {
            if (this.plan_ != null) {
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
        public void addInputs(int i, TransactionInput transactionInput) {
            transactionInput.getClass();
            ensureInputsIsMutable();
            this.inputs_.add(i, transactionInput);
        }

        /* access modifiers changed from: private */
        public void addOutputs(int i, TransactionOutput transactionOutput) {
            transactionOutput.getClass();
            ensureOutputsIsMutable();
            this.outputs_.add(i, transactionOutput);
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

        long getFee();

        String getGasAssetId();

        ByteString getGasAssetIdBytes();

        String getGasChangeAddress();

        ByteString getGasChangeAddressBytes();

        TransactionInput getInputs(int i);

        int getInputsCount();

        List<TransactionInput> getInputsList();

        TransactionOutput getOutputs(int i);

        int getOutputsCount();

        List<TransactionOutput> getOutputsList();

        TransactionPlan getPlan();

        ByteString getPrivateKey();

        boolean hasPlan();

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
            public /* synthetic */ Builder(C97521 r1) {
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
            switch (C97521.f46568xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningOutput();
                case 2:
                    return new Builder((C97521) null);
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

    public static final class TransactionInput extends GeneratedMessageLite<TransactionInput, Builder> implements TransactionInputOrBuilder {
        public static final int ASSET_ID_FIELD_NUMBER = 4;
        /* access modifiers changed from: private */
        public static final TransactionInput DEFAULT_INSTANCE;
        private static volatile im4<TransactionInput> PARSER = null;
        public static final int PREV_HASH_FIELD_NUMBER = 1;
        public static final int PREV_INDEX_FIELD_NUMBER = 2;
        public static final int VALUE_FIELD_NUMBER = 3;
        private String assetId_ = "";
        private ByteString prevHash_ = ByteString.EMPTY;
        private int prevIndex_;
        private long value_;

        public static final class Builder extends GeneratedMessageLite.C4930a<TransactionInput, Builder> implements TransactionInputOrBuilder {
            public /* synthetic */ Builder(C97521 r1) {
                this();
            }

            public Builder clearAssetId() {
                copyOnWrite();
                ((TransactionInput) this.instance).clearAssetId();
                return this;
            }

            public Builder clearPrevHash() {
                copyOnWrite();
                ((TransactionInput) this.instance).clearPrevHash();
                return this;
            }

            public Builder clearPrevIndex() {
                copyOnWrite();
                ((TransactionInput) this.instance).clearPrevIndex();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((TransactionInput) this.instance).clearValue();
                return this;
            }

            public String getAssetId() {
                return ((TransactionInput) this.instance).getAssetId();
            }

            public ByteString getAssetIdBytes() {
                return ((TransactionInput) this.instance).getAssetIdBytes();
            }

            public ByteString getPrevHash() {
                return ((TransactionInput) this.instance).getPrevHash();
            }

            public int getPrevIndex() {
                return ((TransactionInput) this.instance).getPrevIndex();
            }

            public long getValue() {
                return ((TransactionInput) this.instance).getValue();
            }

            public Builder setAssetId(String str) {
                copyOnWrite();
                ((TransactionInput) this.instance).setAssetId(str);
                return this;
            }

            public Builder setAssetIdBytes(ByteString byteString) {
                copyOnWrite();
                ((TransactionInput) this.instance).setAssetIdBytes(byteString);
                return this;
            }

            public Builder setPrevHash(ByteString byteString) {
                copyOnWrite();
                ((TransactionInput) this.instance).setPrevHash(byteString);
                return this;
            }

            public Builder setPrevIndex(int i) {
                copyOnWrite();
                ((TransactionInput) this.instance).setPrevIndex(i);
                return this;
            }

            public Builder setValue(long j) {
                copyOnWrite();
                ((TransactionInput) this.instance).setValue(j);
                return this;
            }

            private Builder() {
                super(TransactionInput.DEFAULT_INSTANCE);
            }
        }

        static {
            TransactionInput transactionInput = new TransactionInput();
            DEFAULT_INSTANCE = transactionInput;
            GeneratedMessageLite.registerDefaultInstance(TransactionInput.class, transactionInput);
        }

        private TransactionInput() {
        }

        /* access modifiers changed from: private */
        public void clearAssetId() {
            this.assetId_ = getDefaultInstance().getAssetId();
        }

        /* access modifiers changed from: private */
        public void clearPrevHash() {
            this.prevHash_ = getDefaultInstance().getPrevHash();
        }

        /* access modifiers changed from: private */
        public void clearPrevIndex() {
            this.prevIndex_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearValue() {
            this.value_ = 0;
        }

        public static TransactionInput getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TransactionInput parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TransactionInput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TransactionInput parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TransactionInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<TransactionInput> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAssetId(String str) {
            str.getClass();
            this.assetId_ = str;
        }

        /* access modifiers changed from: private */
        public void setAssetIdBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.assetId_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setPrevHash(ByteString byteString) {
            byteString.getClass();
            this.prevHash_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setPrevIndex(int i) {
            this.prevIndex_ = i;
        }

        /* access modifiers changed from: private */
        public void setValue(long j) {
            this.value_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97521.f46568xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TransactionInput();
                case 2:
                    return new Builder((C97521) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\n\u0002\u0006\u0003\u0002\u0004Ȉ", new Object[]{"prevHash_", "prevIndex_", "value_", "assetId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<TransactionInput> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (TransactionInput.class) {
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

        public String getAssetId() {
            return this.assetId_;
        }

        public ByteString getAssetIdBytes() {
            return ByteString.copyFromUtf8(this.assetId_);
        }

        public ByteString getPrevHash() {
            return this.prevHash_;
        }

        public int getPrevIndex() {
            return this.prevIndex_;
        }

        public long getValue() {
            return this.value_;
        }

        public static Builder newBuilder(TransactionInput transactionInput) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(transactionInput);
        }

        public static TransactionInput parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TransactionInput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TransactionInput parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransactionInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static TransactionInput parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TransactionInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TransactionInput parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransactionInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static TransactionInput parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TransactionInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TransactionInput parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransactionInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static TransactionInput parseFrom(InputStream inputStream) throws IOException {
            return (TransactionInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TransactionInput parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TransactionInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TransactionInput parseFrom(C4969g gVar) throws IOException {
            return (TransactionInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static TransactionInput parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (TransactionInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface TransactionInputOrBuilder extends qu3 {
        String getAssetId();

        ByteString getAssetIdBytes();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        ByteString getPrevHash();

        int getPrevIndex();

        long getValue();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TransactionOutput extends GeneratedMessageLite<TransactionOutput, Builder> implements TransactionOutputOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 2;
        public static final int ASSET_ID_FIELD_NUMBER = 1;
        public static final int CHANGE_ADDRESS_FIELD_NUMBER = 4;
        /* access modifiers changed from: private */
        public static final TransactionOutput DEFAULT_INSTANCE;
        private static volatile im4<TransactionOutput> PARSER = null;
        public static final int TO_ADDRESS_FIELD_NUMBER = 3;
        private long amount_;
        private String assetId_ = "";
        private String changeAddress_ = "";
        private String toAddress_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<TransactionOutput, Builder> implements TransactionOutputOrBuilder {
            public /* synthetic */ Builder(C97521 r1) {
                this();
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((TransactionOutput) this.instance).clearAmount();
                return this;
            }

            public Builder clearAssetId() {
                copyOnWrite();
                ((TransactionOutput) this.instance).clearAssetId();
                return this;
            }

            public Builder clearChangeAddress() {
                copyOnWrite();
                ((TransactionOutput) this.instance).clearChangeAddress();
                return this;
            }

            public Builder clearToAddress() {
                copyOnWrite();
                ((TransactionOutput) this.instance).clearToAddress();
                return this;
            }

            public long getAmount() {
                return ((TransactionOutput) this.instance).getAmount();
            }

            public String getAssetId() {
                return ((TransactionOutput) this.instance).getAssetId();
            }

            public ByteString getAssetIdBytes() {
                return ((TransactionOutput) this.instance).getAssetIdBytes();
            }

            public String getChangeAddress() {
                return ((TransactionOutput) this.instance).getChangeAddress();
            }

            public ByteString getChangeAddressBytes() {
                return ((TransactionOutput) this.instance).getChangeAddressBytes();
            }

            public String getToAddress() {
                return ((TransactionOutput) this.instance).getToAddress();
            }

            public ByteString getToAddressBytes() {
                return ((TransactionOutput) this.instance).getToAddressBytes();
            }

            public Builder setAmount(long j) {
                copyOnWrite();
                ((TransactionOutput) this.instance).setAmount(j);
                return this;
            }

            public Builder setAssetId(String str) {
                copyOnWrite();
                ((TransactionOutput) this.instance).setAssetId(str);
                return this;
            }

            public Builder setAssetIdBytes(ByteString byteString) {
                copyOnWrite();
                ((TransactionOutput) this.instance).setAssetIdBytes(byteString);
                return this;
            }

            public Builder setChangeAddress(String str) {
                copyOnWrite();
                ((TransactionOutput) this.instance).setChangeAddress(str);
                return this;
            }

            public Builder setChangeAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((TransactionOutput) this.instance).setChangeAddressBytes(byteString);
                return this;
            }

            public Builder setToAddress(String str) {
                copyOnWrite();
                ((TransactionOutput) this.instance).setToAddress(str);
                return this;
            }

            public Builder setToAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((TransactionOutput) this.instance).setToAddressBytes(byteString);
                return this;
            }

            private Builder() {
                super(TransactionOutput.DEFAULT_INSTANCE);
            }
        }

        static {
            TransactionOutput transactionOutput = new TransactionOutput();
            DEFAULT_INSTANCE = transactionOutput;
            GeneratedMessageLite.registerDefaultInstance(TransactionOutput.class, transactionOutput);
        }

        private TransactionOutput() {
        }

        /* access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearAssetId() {
            this.assetId_ = getDefaultInstance().getAssetId();
        }

        /* access modifiers changed from: private */
        public void clearChangeAddress() {
            this.changeAddress_ = getDefaultInstance().getChangeAddress();
        }

        /* access modifiers changed from: private */
        public void clearToAddress() {
            this.toAddress_ = getDefaultInstance().getToAddress();
        }

        public static TransactionOutput getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TransactionOutput parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TransactionOutput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TransactionOutput parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TransactionOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<TransactionOutput> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAmount(long j) {
            this.amount_ = j;
        }

        /* access modifiers changed from: private */
        public void setAssetId(String str) {
            str.getClass();
            this.assetId_ = str;
        }

        /* access modifiers changed from: private */
        public void setAssetIdBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.assetId_ = byteString.toStringUtf8();
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
            switch (C97521.f46568xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TransactionOutput();
                case 2:
                    return new Builder((C97521) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0010\u0003Ȉ\u0004Ȉ", new Object[]{"assetId_", "amount_", "toAddress_", "changeAddress_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<TransactionOutput> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (TransactionOutput.class) {
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

        public String getAssetId() {
            return this.assetId_;
        }

        public ByteString getAssetIdBytes() {
            return ByteString.copyFromUtf8(this.assetId_);
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

        public static Builder newBuilder(TransactionOutput transactionOutput) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(transactionOutput);
        }

        public static TransactionOutput parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TransactionOutput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TransactionOutput parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransactionOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static TransactionOutput parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TransactionOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TransactionOutput parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransactionOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static TransactionOutput parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TransactionOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TransactionOutput parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransactionOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static TransactionOutput parseFrom(InputStream inputStream) throws IOException {
            return (TransactionOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TransactionOutput parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TransactionOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TransactionOutput parseFrom(C4969g gVar) throws IOException {
            return (TransactionOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static TransactionOutput parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (TransactionOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface TransactionOutputOrBuilder extends qu3 {
        long getAmount();

        String getAssetId();

        ByteString getAssetIdBytes();

        String getChangeAddress();

        ByteString getChangeAddressBytes();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getToAddress();

        ByteString getToAddressBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TransactionOutputPlan extends GeneratedMessageLite<TransactionOutputPlan, Builder> implements TransactionOutputPlanOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 1;
        public static final int ASSET_ID_FIELD_NUMBER = 4;
        public static final int AVAILABLE_AMOUNT_FIELD_NUMBER = 2;
        public static final int CHANGE_ADDRESS_FIELD_NUMBER = 6;
        public static final int CHANGE_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final TransactionOutputPlan DEFAULT_INSTANCE;
        private static volatile im4<TransactionOutputPlan> PARSER = null;
        public static final int TO_ADDRESS_FIELD_NUMBER = 5;
        private long amount_;
        private String assetId_ = "";
        private long availableAmount_;
        private String changeAddress_ = "";
        private long change_;
        private String toAddress_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<TransactionOutputPlan, Builder> implements TransactionOutputPlanOrBuilder {
            public /* synthetic */ Builder(C97521 r1) {
                this();
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((TransactionOutputPlan) this.instance).clearAmount();
                return this;
            }

            public Builder clearAssetId() {
                copyOnWrite();
                ((TransactionOutputPlan) this.instance).clearAssetId();
                return this;
            }

            public Builder clearAvailableAmount() {
                copyOnWrite();
                ((TransactionOutputPlan) this.instance).clearAvailableAmount();
                return this;
            }

            public Builder clearChange() {
                copyOnWrite();
                ((TransactionOutputPlan) this.instance).clearChange();
                return this;
            }

            public Builder clearChangeAddress() {
                copyOnWrite();
                ((TransactionOutputPlan) this.instance).clearChangeAddress();
                return this;
            }

            public Builder clearToAddress() {
                copyOnWrite();
                ((TransactionOutputPlan) this.instance).clearToAddress();
                return this;
            }

            public long getAmount() {
                return ((TransactionOutputPlan) this.instance).getAmount();
            }

            public String getAssetId() {
                return ((TransactionOutputPlan) this.instance).getAssetId();
            }

            public ByteString getAssetIdBytes() {
                return ((TransactionOutputPlan) this.instance).getAssetIdBytes();
            }

            public long getAvailableAmount() {
                return ((TransactionOutputPlan) this.instance).getAvailableAmount();
            }

            public long getChange() {
                return ((TransactionOutputPlan) this.instance).getChange();
            }

            public String getChangeAddress() {
                return ((TransactionOutputPlan) this.instance).getChangeAddress();
            }

            public ByteString getChangeAddressBytes() {
                return ((TransactionOutputPlan) this.instance).getChangeAddressBytes();
            }

            public String getToAddress() {
                return ((TransactionOutputPlan) this.instance).getToAddress();
            }

            public ByteString getToAddressBytes() {
                return ((TransactionOutputPlan) this.instance).getToAddressBytes();
            }

            public Builder setAmount(long j) {
                copyOnWrite();
                ((TransactionOutputPlan) this.instance).setAmount(j);
                return this;
            }

            public Builder setAssetId(String str) {
                copyOnWrite();
                ((TransactionOutputPlan) this.instance).setAssetId(str);
                return this;
            }

            public Builder setAssetIdBytes(ByteString byteString) {
                copyOnWrite();
                ((TransactionOutputPlan) this.instance).setAssetIdBytes(byteString);
                return this;
            }

            public Builder setAvailableAmount(long j) {
                copyOnWrite();
                ((TransactionOutputPlan) this.instance).setAvailableAmount(j);
                return this;
            }

            public Builder setChange(long j) {
                copyOnWrite();
                ((TransactionOutputPlan) this.instance).setChange(j);
                return this;
            }

            public Builder setChangeAddress(String str) {
                copyOnWrite();
                ((TransactionOutputPlan) this.instance).setChangeAddress(str);
                return this;
            }

            public Builder setChangeAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((TransactionOutputPlan) this.instance).setChangeAddressBytes(byteString);
                return this;
            }

            public Builder setToAddress(String str) {
                copyOnWrite();
                ((TransactionOutputPlan) this.instance).setToAddress(str);
                return this;
            }

            public Builder setToAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((TransactionOutputPlan) this.instance).setToAddressBytes(byteString);
                return this;
            }

            private Builder() {
                super(TransactionOutputPlan.DEFAULT_INSTANCE);
            }
        }

        static {
            TransactionOutputPlan transactionOutputPlan = new TransactionOutputPlan();
            DEFAULT_INSTANCE = transactionOutputPlan;
            GeneratedMessageLite.registerDefaultInstance(TransactionOutputPlan.class, transactionOutputPlan);
        }

        private TransactionOutputPlan() {
        }

        /* access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearAssetId() {
            this.assetId_ = getDefaultInstance().getAssetId();
        }

        /* access modifiers changed from: private */
        public void clearAvailableAmount() {
            this.availableAmount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearChange() {
            this.change_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearChangeAddress() {
            this.changeAddress_ = getDefaultInstance().getChangeAddress();
        }

        /* access modifiers changed from: private */
        public void clearToAddress() {
            this.toAddress_ = getDefaultInstance().getToAddress();
        }

        public static TransactionOutputPlan getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TransactionOutputPlan parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TransactionOutputPlan) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TransactionOutputPlan parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TransactionOutputPlan) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<TransactionOutputPlan> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAmount(long j) {
            this.amount_ = j;
        }

        /* access modifiers changed from: private */
        public void setAssetId(String str) {
            str.getClass();
            this.assetId_ = str;
        }

        /* access modifiers changed from: private */
        public void setAssetIdBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.assetId_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setAvailableAmount(long j) {
            this.availableAmount_ = j;
        }

        /* access modifiers changed from: private */
        public void setChange(long j) {
            this.change_ = j;
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
            switch (C97521.f46568xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TransactionOutputPlan();
                case 2:
                    return new Builder((C97521) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002\u0004Ȉ\u0005Ȉ\u0006Ȉ", new Object[]{"amount_", "availableAmount_", "change_", "assetId_", "toAddress_", "changeAddress_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<TransactionOutputPlan> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (TransactionOutputPlan.class) {
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

        public String getAssetId() {
            return this.assetId_;
        }

        public ByteString getAssetIdBytes() {
            return ByteString.copyFromUtf8(this.assetId_);
        }

        public long getAvailableAmount() {
            return this.availableAmount_;
        }

        public long getChange() {
            return this.change_;
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

        public static Builder newBuilder(TransactionOutputPlan transactionOutputPlan) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(transactionOutputPlan);
        }

        public static TransactionOutputPlan parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TransactionOutputPlan) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TransactionOutputPlan parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransactionOutputPlan) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static TransactionOutputPlan parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TransactionOutputPlan) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TransactionOutputPlan parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransactionOutputPlan) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static TransactionOutputPlan parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TransactionOutputPlan) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TransactionOutputPlan parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransactionOutputPlan) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static TransactionOutputPlan parseFrom(InputStream inputStream) throws IOException {
            return (TransactionOutputPlan) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TransactionOutputPlan parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TransactionOutputPlan) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TransactionOutputPlan parseFrom(C4969g gVar) throws IOException {
            return (TransactionOutputPlan) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static TransactionOutputPlan parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (TransactionOutputPlan) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface TransactionOutputPlanOrBuilder extends qu3 {
        long getAmount();

        String getAssetId();

        ByteString getAssetIdBytes();

        long getAvailableAmount();

        long getChange();

        String getChangeAddress();

        ByteString getChangeAddressBytes();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getToAddress();

        ByteString getToAddressBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TransactionPlan extends GeneratedMessageLite<TransactionPlan, Builder> implements TransactionPlanOrBuilder {
        /* access modifiers changed from: private */
        public static final TransactionPlan DEFAULT_INSTANCE;
        public static final int ERROR_FIELD_NUMBER = 4;
        public static final int FEE_FIELD_NUMBER = 3;
        public static final int INPUTS_FIELD_NUMBER = 2;
        public static final int OUTPUTS_FIELD_NUMBER = 1;
        private static volatile im4<TransactionPlan> PARSER;
        private int error_;
        private long fee_;
        private C5011t.C5020i<TransactionInput> inputs_ = GeneratedMessageLite.emptyProtobufList();
        private C5011t.C5020i<TransactionOutputPlan> outputs_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.C4930a<TransactionPlan, Builder> implements TransactionPlanOrBuilder {
            public /* synthetic */ Builder(C97521 r1) {
                this();
            }

            public Builder addAllInputs(Iterable<? extends TransactionInput> iterable) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addAllInputs(iterable);
                return this;
            }

            public Builder addAllOutputs(Iterable<? extends TransactionOutputPlan> iterable) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addAllOutputs(iterable);
                return this;
            }

            public Builder addInputs(TransactionInput transactionInput) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addInputs(transactionInput);
                return this;
            }

            public Builder addOutputs(TransactionOutputPlan transactionOutputPlan) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addOutputs(transactionOutputPlan);
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

            public Builder clearInputs() {
                copyOnWrite();
                ((TransactionPlan) this.instance).clearInputs();
                return this;
            }

            public Builder clearOutputs() {
                copyOnWrite();
                ((TransactionPlan) this.instance).clearOutputs();
                return this;
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

            public TransactionInput getInputs(int i) {
                return ((TransactionPlan) this.instance).getInputs(i);
            }

            public int getInputsCount() {
                return ((TransactionPlan) this.instance).getInputsCount();
            }

            public List<TransactionInput> getInputsList() {
                return Collections.unmodifiableList(((TransactionPlan) this.instance).getInputsList());
            }

            public TransactionOutputPlan getOutputs(int i) {
                return ((TransactionPlan) this.instance).getOutputs(i);
            }

            public int getOutputsCount() {
                return ((TransactionPlan) this.instance).getOutputsCount();
            }

            public List<TransactionOutputPlan> getOutputsList() {
                return Collections.unmodifiableList(((TransactionPlan) this.instance).getOutputsList());
            }

            public Builder removeInputs(int i) {
                copyOnWrite();
                ((TransactionPlan) this.instance).removeInputs(i);
                return this;
            }

            public Builder removeOutputs(int i) {
                copyOnWrite();
                ((TransactionPlan) this.instance).removeOutputs(i);
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

            public Builder setInputs(int i, TransactionInput transactionInput) {
                copyOnWrite();
                ((TransactionPlan) this.instance).setInputs(i, transactionInput);
                return this;
            }

            public Builder setOutputs(int i, TransactionOutputPlan transactionOutputPlan) {
                copyOnWrite();
                ((TransactionPlan) this.instance).setOutputs(i, transactionOutputPlan);
                return this;
            }

            private Builder() {
                super(TransactionPlan.DEFAULT_INSTANCE);
            }

            public Builder addInputs(int i, TransactionInput transactionInput) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addInputs(i, transactionInput);
                return this;
            }

            public Builder addOutputs(int i, TransactionOutputPlan transactionOutputPlan) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addOutputs(i, transactionOutputPlan);
                return this;
            }

            public Builder setInputs(int i, TransactionInput.Builder builder) {
                copyOnWrite();
                ((TransactionPlan) this.instance).setInputs(i, (TransactionInput) builder.build());
                return this;
            }

            public Builder setOutputs(int i, TransactionOutputPlan.Builder builder) {
                copyOnWrite();
                ((TransactionPlan) this.instance).setOutputs(i, (TransactionOutputPlan) builder.build());
                return this;
            }

            public Builder addInputs(TransactionInput.Builder builder) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addInputs((TransactionInput) builder.build());
                return this;
            }

            public Builder addOutputs(TransactionOutputPlan.Builder builder) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addOutputs((TransactionOutputPlan) builder.build());
                return this;
            }

            public Builder addInputs(int i, TransactionInput.Builder builder) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addInputs(i, (TransactionInput) builder.build());
                return this;
            }

            public Builder addOutputs(int i, TransactionOutputPlan.Builder builder) {
                copyOnWrite();
                ((TransactionPlan) this.instance).addOutputs(i, (TransactionOutputPlan) builder.build());
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
        public void addAllInputs(Iterable<? extends TransactionInput> iterable) {
            ensureInputsIsMutable();
            C4949a.addAll(iterable, this.inputs_);
        }

        /* access modifiers changed from: private */
        public void addAllOutputs(Iterable<? extends TransactionOutputPlan> iterable) {
            ensureOutputsIsMutable();
            C4949a.addAll(iterable, this.outputs_);
        }

        /* access modifiers changed from: private */
        public void addInputs(TransactionInput transactionInput) {
            transactionInput.getClass();
            ensureInputsIsMutable();
            this.inputs_.add(transactionInput);
        }

        /* access modifiers changed from: private */
        public void addOutputs(TransactionOutputPlan transactionOutputPlan) {
            transactionOutputPlan.getClass();
            ensureOutputsIsMutable();
            this.outputs_.add(transactionOutputPlan);
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
        public void clearInputs() {
            this.inputs_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearOutputs() {
            this.outputs_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureInputsIsMutable() {
            C5011t.C5020i<TransactionInput> iVar = this.inputs_;
            if (!iVar.mo37090v()) {
                this.inputs_ = GeneratedMessageLite.mutableCopy(iVar);
            }
        }

        private void ensureOutputsIsMutable() {
            C5011t.C5020i<TransactionOutputPlan> iVar = this.outputs_;
            if (!iVar.mo37090v()) {
                this.outputs_ = GeneratedMessageLite.mutableCopy(iVar);
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
        public void setInputs(int i, TransactionInput transactionInput) {
            transactionInput.getClass();
            ensureInputsIsMutable();
            this.inputs_.set(i, transactionInput);
        }

        /* access modifiers changed from: private */
        public void setOutputs(int i, TransactionOutputPlan transactionOutputPlan) {
            transactionOutputPlan.getClass();
            ensureOutputsIsMutable();
            this.outputs_.set(i, transactionOutputPlan);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97521.f46568xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TransactionPlan();
                case 2:
                    return new Builder((C97521) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003\u0002\u0004\f", new Object[]{"outputs_", TransactionOutputPlan.class, "inputs_", TransactionInput.class, "fee_", "error_"});
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

        public TransactionInput getInputs(int i) {
            return this.inputs_.get(i);
        }

        public int getInputsCount() {
            return this.inputs_.size();
        }

        public List<TransactionInput> getInputsList() {
            return this.inputs_;
        }

        public TransactionInputOrBuilder getInputsOrBuilder(int i) {
            return this.inputs_.get(i);
        }

        public List<? extends TransactionInputOrBuilder> getInputsOrBuilderList() {
            return this.inputs_;
        }

        public TransactionOutputPlan getOutputs(int i) {
            return this.outputs_.get(i);
        }

        public int getOutputsCount() {
            return this.outputs_.size();
        }

        public List<TransactionOutputPlan> getOutputsList() {
            return this.outputs_;
        }

        public TransactionOutputPlanOrBuilder getOutputsOrBuilder(int i) {
            return this.outputs_.get(i);
        }

        public List<? extends TransactionOutputPlanOrBuilder> getOutputsOrBuilderList() {
            return this.outputs_;
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
        public void addInputs(int i, TransactionInput transactionInput) {
            transactionInput.getClass();
            ensureInputsIsMutable();
            this.inputs_.add(i, transactionInput);
        }

        /* access modifiers changed from: private */
        public void addOutputs(int i, TransactionOutputPlan transactionOutputPlan) {
            transactionOutputPlan.getClass();
            ensureOutputsIsMutable();
            this.outputs_.add(i, transactionOutputPlan);
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
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        Common.SigningError getError();

        int getErrorValue();

        long getFee();

        TransactionInput getInputs(int i);

        int getInputsCount();

        List<TransactionInput> getInputsList();

        TransactionOutputPlan getOutputs(int i);

        int getOutputsCount();

        List<TransactionOutputPlan> getOutputsList();

        /* synthetic */ boolean isInitialized();
    }

    private NEO() {
    }

    public static void registerAllExtensions(C4987l lVar) {
    }
}
