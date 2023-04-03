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
import wallet.core.jni.proto.Bitcoin;
import wallet.core.jni.proto.Common;

public final class Decred {

    /* renamed from: wallet.core.jni.proto.Decred$1 */
    public static /* synthetic */ class C97371 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f46550xa1df5c61;

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
                f46550xa1df5c61 = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f46550xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f46550xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f46550xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f46550xa1df5c61     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f46550xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f46550xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wallet.core.jni.proto.Decred.C97371.<clinit>():void");
        }
    }

    public static final class SigningOutput extends GeneratedMessageLite<SigningOutput, Builder> implements SigningOutputOrBuilder {
        /* access modifiers changed from: private */
        public static final SigningOutput DEFAULT_INSTANCE;
        public static final int ENCODED_FIELD_NUMBER = 2;
        public static final int ERROR_FIELD_NUMBER = 4;
        private static volatile im4<SigningOutput> PARSER = null;
        public static final int TRANSACTION_FIELD_NUMBER = 1;
        public static final int TRANSACTION_ID_FIELD_NUMBER = 3;
        private ByteString encoded_ = ByteString.EMPTY;
        private int error_;
        private String transactionId_ = "";
        private Transaction transaction_;

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningOutput, Builder> implements SigningOutputOrBuilder {
            public /* synthetic */ Builder(C97371 r1) {
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

            public Builder clearTransaction() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearTransaction();
                return this;
            }

            public Builder clearTransactionId() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearTransactionId();
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

            public Transaction getTransaction() {
                return ((SigningOutput) this.instance).getTransaction();
            }

            public String getTransactionId() {
                return ((SigningOutput) this.instance).getTransactionId();
            }

            public ByteString getTransactionIdBytes() {
                return ((SigningOutput) this.instance).getTransactionIdBytes();
            }

            public boolean hasTransaction() {
                return ((SigningOutput) this.instance).hasTransaction();
            }

            public Builder mergeTransaction(Transaction transaction) {
                copyOnWrite();
                ((SigningOutput) this.instance).mergeTransaction(transaction);
                return this;
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

            public Builder setTransaction(Transaction transaction) {
                copyOnWrite();
                ((SigningOutput) this.instance).setTransaction(transaction);
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

            private Builder() {
                super(SigningOutput.DEFAULT_INSTANCE);
            }

            public Builder setTransaction(Transaction.Builder builder) {
                copyOnWrite();
                ((SigningOutput) this.instance).setTransaction((Transaction) builder.build());
                return this;
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
        public void clearTransaction() {
            this.transaction_ = null;
        }

        /* access modifiers changed from: private */
        public void clearTransactionId() {
            this.transactionId_ = getDefaultInstance().getTransactionId();
        }

        public static SigningOutput getDefaultInstance() {
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
        public void setTransaction(Transaction transaction) {
            transaction.getClass();
            this.transaction_ = transaction;
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

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97371.f46550xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningOutput();
                case 2:
                    return new Builder((C97371) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\n\u0003Ȉ\u0004\f", new Object[]{"transaction_", "encoded_", "transactionId_", "error_"});
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

        public Transaction getTransaction() {
            Transaction transaction = this.transaction_;
            if (transaction == null) {
                return Transaction.getDefaultInstance();
            }
            return transaction;
        }

        public String getTransactionId() {
            return this.transactionId_;
        }

        public ByteString getTransactionIdBytes() {
            return ByteString.copyFromUtf8(this.transactionId_);
        }

        public boolean hasTransaction() {
            if (this.transaction_ != null) {
                return true;
            }
            return false;
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

        Transaction getTransaction();

        String getTransactionId();

        ByteString getTransactionIdBytes();

        boolean hasTransaction();

        /* synthetic */ boolean isInitialized();
    }

    public static final class Transaction extends GeneratedMessageLite<Transaction, Builder> implements TransactionOrBuilder {
        /* access modifiers changed from: private */
        public static final Transaction DEFAULT_INSTANCE;
        public static final int EXPIRY_FIELD_NUMBER = 6;
        public static final int INPUTS_FIELD_NUMBER = 3;
        public static final int LOCKTIME_FIELD_NUMBER = 5;
        public static final int OUTPUTS_FIELD_NUMBER = 4;
        private static volatile im4<Transaction> PARSER = null;
        public static final int SERIALIZETYPE_FIELD_NUMBER = 1;
        public static final int VERSION_FIELD_NUMBER = 2;
        private int expiry_;
        private C5011t.C5020i<TransactionInput> inputs_ = GeneratedMessageLite.emptyProtobufList();
        private int lockTime_;
        private C5011t.C5020i<TransactionOutput> outputs_ = GeneratedMessageLite.emptyProtobufList();
        private int serializeType_;
        private int version_;

        public static final class Builder extends GeneratedMessageLite.C4930a<Transaction, Builder> implements TransactionOrBuilder {
            public /* synthetic */ Builder(C97371 r1) {
                this();
            }

            public Builder addAllInputs(Iterable<? extends TransactionInput> iterable) {
                copyOnWrite();
                ((Transaction) this.instance).addAllInputs(iterable);
                return this;
            }

            public Builder addAllOutputs(Iterable<? extends TransactionOutput> iterable) {
                copyOnWrite();
                ((Transaction) this.instance).addAllOutputs(iterable);
                return this;
            }

            public Builder addInputs(TransactionInput transactionInput) {
                copyOnWrite();
                ((Transaction) this.instance).addInputs(transactionInput);
                return this;
            }

            public Builder addOutputs(TransactionOutput transactionOutput) {
                copyOnWrite();
                ((Transaction) this.instance).addOutputs(transactionOutput);
                return this;
            }

            public Builder clearExpiry() {
                copyOnWrite();
                ((Transaction) this.instance).clearExpiry();
                return this;
            }

            public Builder clearInputs() {
                copyOnWrite();
                ((Transaction) this.instance).clearInputs();
                return this;
            }

            public Builder clearLockTime() {
                copyOnWrite();
                ((Transaction) this.instance).clearLockTime();
                return this;
            }

            public Builder clearOutputs() {
                copyOnWrite();
                ((Transaction) this.instance).clearOutputs();
                return this;
            }

            public Builder clearSerializeType() {
                copyOnWrite();
                ((Transaction) this.instance).clearSerializeType();
                return this;
            }

            public Builder clearVersion() {
                copyOnWrite();
                ((Transaction) this.instance).clearVersion();
                return this;
            }

            public int getExpiry() {
                return ((Transaction) this.instance).getExpiry();
            }

            public TransactionInput getInputs(int i) {
                return ((Transaction) this.instance).getInputs(i);
            }

            public int getInputsCount() {
                return ((Transaction) this.instance).getInputsCount();
            }

            public List<TransactionInput> getInputsList() {
                return Collections.unmodifiableList(((Transaction) this.instance).getInputsList());
            }

            public int getLockTime() {
                return ((Transaction) this.instance).getLockTime();
            }

            public TransactionOutput getOutputs(int i) {
                return ((Transaction) this.instance).getOutputs(i);
            }

            public int getOutputsCount() {
                return ((Transaction) this.instance).getOutputsCount();
            }

            public List<TransactionOutput> getOutputsList() {
                return Collections.unmodifiableList(((Transaction) this.instance).getOutputsList());
            }

            public int getSerializeType() {
                return ((Transaction) this.instance).getSerializeType();
            }

            public int getVersion() {
                return ((Transaction) this.instance).getVersion();
            }

            public Builder removeInputs(int i) {
                copyOnWrite();
                ((Transaction) this.instance).removeInputs(i);
                return this;
            }

            public Builder removeOutputs(int i) {
                copyOnWrite();
                ((Transaction) this.instance).removeOutputs(i);
                return this;
            }

            public Builder setExpiry(int i) {
                copyOnWrite();
                ((Transaction) this.instance).setExpiry(i);
                return this;
            }

            public Builder setInputs(int i, TransactionInput transactionInput) {
                copyOnWrite();
                ((Transaction) this.instance).setInputs(i, transactionInput);
                return this;
            }

            public Builder setLockTime(int i) {
                copyOnWrite();
                ((Transaction) this.instance).setLockTime(i);
                return this;
            }

            public Builder setOutputs(int i, TransactionOutput transactionOutput) {
                copyOnWrite();
                ((Transaction) this.instance).setOutputs(i, transactionOutput);
                return this;
            }

            public Builder setSerializeType(int i) {
                copyOnWrite();
                ((Transaction) this.instance).setSerializeType(i);
                return this;
            }

            public Builder setVersion(int i) {
                copyOnWrite();
                ((Transaction) this.instance).setVersion(i);
                return this;
            }

            private Builder() {
                super(Transaction.DEFAULT_INSTANCE);
            }

            public Builder addInputs(int i, TransactionInput transactionInput) {
                copyOnWrite();
                ((Transaction) this.instance).addInputs(i, transactionInput);
                return this;
            }

            public Builder addOutputs(int i, TransactionOutput transactionOutput) {
                copyOnWrite();
                ((Transaction) this.instance).addOutputs(i, transactionOutput);
                return this;
            }

            public Builder setInputs(int i, TransactionInput.Builder builder) {
                copyOnWrite();
                ((Transaction) this.instance).setInputs(i, (TransactionInput) builder.build());
                return this;
            }

            public Builder setOutputs(int i, TransactionOutput.Builder builder) {
                copyOnWrite();
                ((Transaction) this.instance).setOutputs(i, (TransactionOutput) builder.build());
                return this;
            }

            public Builder addInputs(TransactionInput.Builder builder) {
                copyOnWrite();
                ((Transaction) this.instance).addInputs((TransactionInput) builder.build());
                return this;
            }

            public Builder addOutputs(TransactionOutput.Builder builder) {
                copyOnWrite();
                ((Transaction) this.instance).addOutputs((TransactionOutput) builder.build());
                return this;
            }

            public Builder addInputs(int i, TransactionInput.Builder builder) {
                copyOnWrite();
                ((Transaction) this.instance).addInputs(i, (TransactionInput) builder.build());
                return this;
            }

            public Builder addOutputs(int i, TransactionOutput.Builder builder) {
                copyOnWrite();
                ((Transaction) this.instance).addOutputs(i, (TransactionOutput) builder.build());
                return this;
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
        public void clearExpiry() {
            this.expiry_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearInputs() {
            this.inputs_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearLockTime() {
            this.lockTime_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearOutputs() {
            this.outputs_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearSerializeType() {
            this.serializeType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearVersion() {
            this.version_ = 0;
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
        public void setExpiry(int i) {
            this.expiry_ = i;
        }

        /* access modifiers changed from: private */
        public void setInputs(int i, TransactionInput transactionInput) {
            transactionInput.getClass();
            ensureInputsIsMutable();
            this.inputs_.set(i, transactionInput);
        }

        /* access modifiers changed from: private */
        public void setLockTime(int i) {
            this.lockTime_ = i;
        }

        /* access modifiers changed from: private */
        public void setOutputs(int i, TransactionOutput transactionOutput) {
            transactionOutput.getClass();
            ensureOutputsIsMutable();
            this.outputs_.set(i, transactionOutput);
        }

        /* access modifiers changed from: private */
        public void setSerializeType(int i) {
            this.serializeType_ = i;
        }

        /* access modifiers changed from: private */
        public void setVersion(int i) {
            this.version_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97371.f46550xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Transaction();
                case 2:
                    return new Builder((C97371) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u000b\u0002\u000b\u0003\u001b\u0004\u001b\u0005\u000b\u0006\u000b", new Object[]{"serializeType_", "version_", "inputs_", TransactionInput.class, "outputs_", TransactionOutput.class, "lockTime_", "expiry_"});
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

        public int getExpiry() {
            return this.expiry_;
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

        public int getLockTime() {
            return this.lockTime_;
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

        public int getSerializeType() {
            return this.serializeType_;
        }

        public int getVersion() {
            return this.version_;
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

    public static final class TransactionInput extends GeneratedMessageLite<TransactionInput, Builder> implements TransactionInputOrBuilder {
        public static final int BLOCKHEIGHT_FIELD_NUMBER = 4;
        public static final int BLOCKINDEX_FIELD_NUMBER = 5;
        /* access modifiers changed from: private */
        public static final TransactionInput DEFAULT_INSTANCE;
        private static volatile im4<TransactionInput> PARSER = null;
        public static final int PREVIOUSOUTPUT_FIELD_NUMBER = 1;
        public static final int SCRIPT_FIELD_NUMBER = 6;
        public static final int SEQUENCE_FIELD_NUMBER = 2;
        public static final int VALUEIN_FIELD_NUMBER = 3;
        private int blockHeight_;
        private int blockIndex_;
        private Bitcoin.OutPoint previousOutput_;
        private ByteString script_ = ByteString.EMPTY;
        private int sequence_;
        private long valueIn_;

        public static final class Builder extends GeneratedMessageLite.C4930a<TransactionInput, Builder> implements TransactionInputOrBuilder {
            public /* synthetic */ Builder(C97371 r1) {
                this();
            }

            public Builder clearBlockHeight() {
                copyOnWrite();
                ((TransactionInput) this.instance).clearBlockHeight();
                return this;
            }

            public Builder clearBlockIndex() {
                copyOnWrite();
                ((TransactionInput) this.instance).clearBlockIndex();
                return this;
            }

            public Builder clearPreviousOutput() {
                copyOnWrite();
                ((TransactionInput) this.instance).clearPreviousOutput();
                return this;
            }

            public Builder clearScript() {
                copyOnWrite();
                ((TransactionInput) this.instance).clearScript();
                return this;
            }

            public Builder clearSequence() {
                copyOnWrite();
                ((TransactionInput) this.instance).clearSequence();
                return this;
            }

            public Builder clearValueIn() {
                copyOnWrite();
                ((TransactionInput) this.instance).clearValueIn();
                return this;
            }

            public int getBlockHeight() {
                return ((TransactionInput) this.instance).getBlockHeight();
            }

            public int getBlockIndex() {
                return ((TransactionInput) this.instance).getBlockIndex();
            }

            public Bitcoin.OutPoint getPreviousOutput() {
                return ((TransactionInput) this.instance).getPreviousOutput();
            }

            public ByteString getScript() {
                return ((TransactionInput) this.instance).getScript();
            }

            public int getSequence() {
                return ((TransactionInput) this.instance).getSequence();
            }

            public long getValueIn() {
                return ((TransactionInput) this.instance).getValueIn();
            }

            public boolean hasPreviousOutput() {
                return ((TransactionInput) this.instance).hasPreviousOutput();
            }

            public Builder mergePreviousOutput(Bitcoin.OutPoint outPoint) {
                copyOnWrite();
                ((TransactionInput) this.instance).mergePreviousOutput(outPoint);
                return this;
            }

            public Builder setBlockHeight(int i) {
                copyOnWrite();
                ((TransactionInput) this.instance).setBlockHeight(i);
                return this;
            }

            public Builder setBlockIndex(int i) {
                copyOnWrite();
                ((TransactionInput) this.instance).setBlockIndex(i);
                return this;
            }

            public Builder setPreviousOutput(Bitcoin.OutPoint outPoint) {
                copyOnWrite();
                ((TransactionInput) this.instance).setPreviousOutput(outPoint);
                return this;
            }

            public Builder setScript(ByteString byteString) {
                copyOnWrite();
                ((TransactionInput) this.instance).setScript(byteString);
                return this;
            }

            public Builder setSequence(int i) {
                copyOnWrite();
                ((TransactionInput) this.instance).setSequence(i);
                return this;
            }

            public Builder setValueIn(long j) {
                copyOnWrite();
                ((TransactionInput) this.instance).setValueIn(j);
                return this;
            }

            private Builder() {
                super(TransactionInput.DEFAULT_INSTANCE);
            }

            public Builder setPreviousOutput(Bitcoin.OutPoint.Builder builder) {
                copyOnWrite();
                ((TransactionInput) this.instance).setPreviousOutput((Bitcoin.OutPoint) builder.build());
                return this;
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
        public void clearBlockHeight() {
            this.blockHeight_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearBlockIndex() {
            this.blockIndex_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearPreviousOutput() {
            this.previousOutput_ = null;
        }

        /* access modifiers changed from: private */
        public void clearScript() {
            this.script_ = getDefaultInstance().getScript();
        }

        /* access modifiers changed from: private */
        public void clearSequence() {
            this.sequence_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearValueIn() {
            this.valueIn_ = 0;
        }

        public static TransactionInput getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergePreviousOutput(Bitcoin.OutPoint outPoint) {
            outPoint.getClass();
            Bitcoin.OutPoint outPoint2 = this.previousOutput_;
            if (outPoint2 == null || outPoint2 == Bitcoin.OutPoint.getDefaultInstance()) {
                this.previousOutput_ = outPoint;
            } else {
                this.previousOutput_ = (Bitcoin.OutPoint) ((Bitcoin.OutPoint.Builder) Bitcoin.OutPoint.newBuilder(this.previousOutput_).mergeFrom(outPoint)).buildPartial();
            }
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
        public void setBlockHeight(int i) {
            this.blockHeight_ = i;
        }

        /* access modifiers changed from: private */
        public void setBlockIndex(int i) {
            this.blockIndex_ = i;
        }

        /* access modifiers changed from: private */
        public void setPreviousOutput(Bitcoin.OutPoint outPoint) {
            outPoint.getClass();
            this.previousOutput_ = outPoint;
        }

        /* access modifiers changed from: private */
        public void setScript(ByteString byteString) {
            byteString.getClass();
            this.script_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setSequence(int i) {
            this.sequence_ = i;
        }

        /* access modifiers changed from: private */
        public void setValueIn(long j) {
            this.valueIn_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97371.f46550xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TransactionInput();
                case 2:
                    return new Builder((C97371) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u0002\u0004\u000b\u0005\u000b\u0006\n", new Object[]{"previousOutput_", "sequence_", "valueIn_", "blockHeight_", "blockIndex_", "script_"});
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

        public int getBlockHeight() {
            return this.blockHeight_;
        }

        public int getBlockIndex() {
            return this.blockIndex_;
        }

        public Bitcoin.OutPoint getPreviousOutput() {
            Bitcoin.OutPoint outPoint = this.previousOutput_;
            if (outPoint == null) {
                return Bitcoin.OutPoint.getDefaultInstance();
            }
            return outPoint;
        }

        public ByteString getScript() {
            return this.script_;
        }

        public int getSequence() {
            return this.sequence_;
        }

        public long getValueIn() {
            return this.valueIn_;
        }

        public boolean hasPreviousOutput() {
            if (this.previousOutput_ != null) {
                return true;
            }
            return false;
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
        int getBlockHeight();

        int getBlockIndex();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        Bitcoin.OutPoint getPreviousOutput();

        ByteString getScript();

        int getSequence();

        long getValueIn();

        boolean hasPreviousOutput();

        /* synthetic */ boolean isInitialized();
    }

    public interface TransactionOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        int getExpiry();

        TransactionInput getInputs(int i);

        int getInputsCount();

        List<TransactionInput> getInputsList();

        int getLockTime();

        TransactionOutput getOutputs(int i);

        int getOutputsCount();

        List<TransactionOutput> getOutputsList();

        int getSerializeType();

        int getVersion();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TransactionOutput extends GeneratedMessageLite<TransactionOutput, Builder> implements TransactionOutputOrBuilder {
        /* access modifiers changed from: private */
        public static final TransactionOutput DEFAULT_INSTANCE;
        private static volatile im4<TransactionOutput> PARSER = null;
        public static final int SCRIPT_FIELD_NUMBER = 3;
        public static final int VALUE_FIELD_NUMBER = 1;
        public static final int VERSION_FIELD_NUMBER = 2;
        private ByteString script_ = ByteString.EMPTY;
        private long value_;
        private int version_;

        public static final class Builder extends GeneratedMessageLite.C4930a<TransactionOutput, Builder> implements TransactionOutputOrBuilder {
            public /* synthetic */ Builder(C97371 r1) {
                this();
            }

            public Builder clearScript() {
                copyOnWrite();
                ((TransactionOutput) this.instance).clearScript();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((TransactionOutput) this.instance).clearValue();
                return this;
            }

            public Builder clearVersion() {
                copyOnWrite();
                ((TransactionOutput) this.instance).clearVersion();
                return this;
            }

            public ByteString getScript() {
                return ((TransactionOutput) this.instance).getScript();
            }

            public long getValue() {
                return ((TransactionOutput) this.instance).getValue();
            }

            public int getVersion() {
                return ((TransactionOutput) this.instance).getVersion();
            }

            public Builder setScript(ByteString byteString) {
                copyOnWrite();
                ((TransactionOutput) this.instance).setScript(byteString);
                return this;
            }

            public Builder setValue(long j) {
                copyOnWrite();
                ((TransactionOutput) this.instance).setValue(j);
                return this;
            }

            public Builder setVersion(int i) {
                copyOnWrite();
                ((TransactionOutput) this.instance).setVersion(i);
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
        public void clearScript() {
            this.script_ = getDefaultInstance().getScript();
        }

        /* access modifiers changed from: private */
        public void clearValue() {
            this.value_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearVersion() {
            this.version_ = 0;
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
        public void setScript(ByteString byteString) {
            byteString.getClass();
            this.script_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setValue(long j) {
            this.value_ = j;
        }

        /* access modifiers changed from: private */
        public void setVersion(int i) {
            this.version_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97371.f46550xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TransactionOutput();
                case 2:
                    return new Builder((C97371) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\u000b\u0003\n", new Object[]{"value_", "version_", "script_"});
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

        public ByteString getScript() {
            return this.script_;
        }

        public long getValue() {
            return this.value_;
        }

        public int getVersion() {
            return this.version_;
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
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        ByteString getScript();

        long getValue();

        int getVersion();

        /* synthetic */ boolean isInitialized();
    }

    private Decred() {
    }

    public static void registerAllExtensions(C4987l lVar) {
    }
}
