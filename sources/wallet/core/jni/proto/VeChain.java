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

public final class VeChain {

    /* renamed from: wallet.core.jni.proto.VeChain$1 */
    public static /* synthetic */ class C97741 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f46586xa1df5c61;

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
                f46586xa1df5c61 = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f46586xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f46586xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f46586xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f46586xa1df5c61     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f46586xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f46586xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wallet.core.jni.proto.VeChain.C97741.<clinit>():void");
        }
    }

    public static final class Clause extends GeneratedMessageLite<Clause, Builder> implements ClauseOrBuilder {
        public static final int DATA_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final Clause DEFAULT_INSTANCE;
        private static volatile im4<Clause> PARSER = null;
        public static final int TO_FIELD_NUMBER = 1;
        public static final int VALUE_FIELD_NUMBER = 2;
        private ByteString data_;
        private String to_ = "";
        private ByteString value_;

        public static final class Builder extends GeneratedMessageLite.C4930a<Clause, Builder> implements ClauseOrBuilder {
            public /* synthetic */ Builder(C97741 r1) {
                this();
            }

            public Builder clearData() {
                copyOnWrite();
                ((Clause) this.instance).clearData();
                return this;
            }

            public Builder clearTo() {
                copyOnWrite();
                ((Clause) this.instance).clearTo();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((Clause) this.instance).clearValue();
                return this;
            }

            public ByteString getData() {
                return ((Clause) this.instance).getData();
            }

            public String getTo() {
                return ((Clause) this.instance).getTo();
            }

            public ByteString getToBytes() {
                return ((Clause) this.instance).getToBytes();
            }

            public ByteString getValue() {
                return ((Clause) this.instance).getValue();
            }

            public Builder setData(ByteString byteString) {
                copyOnWrite();
                ((Clause) this.instance).setData(byteString);
                return this;
            }

            public Builder setTo(String str) {
                copyOnWrite();
                ((Clause) this.instance).setTo(str);
                return this;
            }

            public Builder setToBytes(ByteString byteString) {
                copyOnWrite();
                ((Clause) this.instance).setToBytes(byteString);
                return this;
            }

            public Builder setValue(ByteString byteString) {
                copyOnWrite();
                ((Clause) this.instance).setValue(byteString);
                return this;
            }

            private Builder() {
                super(Clause.DEFAULT_INSTANCE);
            }
        }

        static {
            Clause clause = new Clause();
            DEFAULT_INSTANCE = clause;
            GeneratedMessageLite.registerDefaultInstance(Clause.class, clause);
        }

        private Clause() {
            ByteString byteString = ByteString.EMPTY;
            this.value_ = byteString;
            this.data_ = byteString;
        }

        /* access modifiers changed from: private */
        public void clearData() {
            this.data_ = getDefaultInstance().getData();
        }

        /* access modifiers changed from: private */
        public void clearTo() {
            this.to_ = getDefaultInstance().getTo();
        }

        /* access modifiers changed from: private */
        public void clearValue() {
            this.value_ = getDefaultInstance().getValue();
        }

        public static Clause getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Clause parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Clause) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Clause parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Clause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<Clause> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setData(ByteString byteString) {
            byteString.getClass();
            this.data_ = byteString;
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
        public void setValue(ByteString byteString) {
            byteString.getClass();
            this.value_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97741.f46586xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Clause();
                case 2:
                    return new Builder((C97741) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\n", new Object[]{"to_", "value_", "data_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<Clause> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (Clause.class) {
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

        public String getTo() {
            return this.to_;
        }

        public ByteString getToBytes() {
            return ByteString.copyFromUtf8(this.to_);
        }

        public ByteString getValue() {
            return this.value_;
        }

        public static Builder newBuilder(Clause clause) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(clause);
        }

        public static Clause parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Clause) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Clause parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (Clause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static Clause parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Clause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Clause parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (Clause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static Clause parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Clause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Clause parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (Clause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static Clause parseFrom(InputStream inputStream) throws IOException {
            return (Clause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Clause parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Clause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Clause parseFrom(C4969g gVar) throws IOException {
            return (Clause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static Clause parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (Clause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface ClauseOrBuilder extends qu3 {
        ByteString getData();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getTo();

        ByteString getToBytes();

        ByteString getValue();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SigningInput extends GeneratedMessageLite<SigningInput, Builder> implements SigningInputOrBuilder {
        public static final int BLOCK_REF_FIELD_NUMBER = 2;
        public static final int CHAIN_TAG_FIELD_NUMBER = 1;
        public static final int CLAUSES_FIELD_NUMBER = 4;
        /* access modifiers changed from: private */
        public static final SigningInput DEFAULT_INSTANCE;
        public static final int DEPENDS_ON_FIELD_NUMBER = 7;
        public static final int EXPIRATION_FIELD_NUMBER = 3;
        public static final int GAS_FIELD_NUMBER = 6;
        public static final int GAS_PRICE_COEF_FIELD_NUMBER = 5;
        public static final int NONCE_FIELD_NUMBER = 8;
        private static volatile im4<SigningInput> PARSER = null;
        public static final int PRIVATE_KEY_FIELD_NUMBER = 9;
        private long blockRef_;
        private int chainTag_;
        private C5011t.C5020i<Clause> clauses_ = GeneratedMessageLite.emptyProtobufList();
        private ByteString dependsOn_;
        private int expiration_;
        private int gasPriceCoef_;
        private long gas_;
        private long nonce_;
        private ByteString privateKey_;

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningInput, Builder> implements SigningInputOrBuilder {
            public /* synthetic */ Builder(C97741 r1) {
                this();
            }

            public Builder addAllClauses(Iterable<? extends Clause> iterable) {
                copyOnWrite();
                ((SigningInput) this.instance).addAllClauses(iterable);
                return this;
            }

            public Builder addClauses(Clause clause) {
                copyOnWrite();
                ((SigningInput) this.instance).addClauses(clause);
                return this;
            }

            public Builder clearBlockRef() {
                copyOnWrite();
                ((SigningInput) this.instance).clearBlockRef();
                return this;
            }

            public Builder clearChainTag() {
                copyOnWrite();
                ((SigningInput) this.instance).clearChainTag();
                return this;
            }

            public Builder clearClauses() {
                copyOnWrite();
                ((SigningInput) this.instance).clearClauses();
                return this;
            }

            public Builder clearDependsOn() {
                copyOnWrite();
                ((SigningInput) this.instance).clearDependsOn();
                return this;
            }

            public Builder clearExpiration() {
                copyOnWrite();
                ((SigningInput) this.instance).clearExpiration();
                return this;
            }

            public Builder clearGas() {
                copyOnWrite();
                ((SigningInput) this.instance).clearGas();
                return this;
            }

            public Builder clearGasPriceCoef() {
                copyOnWrite();
                ((SigningInput) this.instance).clearGasPriceCoef();
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

            public long getBlockRef() {
                return ((SigningInput) this.instance).getBlockRef();
            }

            public int getChainTag() {
                return ((SigningInput) this.instance).getChainTag();
            }

            public Clause getClauses(int i) {
                return ((SigningInput) this.instance).getClauses(i);
            }

            public int getClausesCount() {
                return ((SigningInput) this.instance).getClausesCount();
            }

            public List<Clause> getClausesList() {
                return Collections.unmodifiableList(((SigningInput) this.instance).getClausesList());
            }

            public ByteString getDependsOn() {
                return ((SigningInput) this.instance).getDependsOn();
            }

            public int getExpiration() {
                return ((SigningInput) this.instance).getExpiration();
            }

            public long getGas() {
                return ((SigningInput) this.instance).getGas();
            }

            public int getGasPriceCoef() {
                return ((SigningInput) this.instance).getGasPriceCoef();
            }

            public long getNonce() {
                return ((SigningInput) this.instance).getNonce();
            }

            public ByteString getPrivateKey() {
                return ((SigningInput) this.instance).getPrivateKey();
            }

            public Builder removeClauses(int i) {
                copyOnWrite();
                ((SigningInput) this.instance).removeClauses(i);
                return this;
            }

            public Builder setBlockRef(long j) {
                copyOnWrite();
                ((SigningInput) this.instance).setBlockRef(j);
                return this;
            }

            public Builder setChainTag(int i) {
                copyOnWrite();
                ((SigningInput) this.instance).setChainTag(i);
                return this;
            }

            public Builder setClauses(int i, Clause clause) {
                copyOnWrite();
                ((SigningInput) this.instance).setClauses(i, clause);
                return this;
            }

            public Builder setDependsOn(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setDependsOn(byteString);
                return this;
            }

            public Builder setExpiration(int i) {
                copyOnWrite();
                ((SigningInput) this.instance).setExpiration(i);
                return this;
            }

            public Builder setGas(long j) {
                copyOnWrite();
                ((SigningInput) this.instance).setGas(j);
                return this;
            }

            public Builder setGasPriceCoef(int i) {
                copyOnWrite();
                ((SigningInput) this.instance).setGasPriceCoef(i);
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

            private Builder() {
                super(SigningInput.DEFAULT_INSTANCE);
            }

            public Builder addClauses(int i, Clause clause) {
                copyOnWrite();
                ((SigningInput) this.instance).addClauses(i, clause);
                return this;
            }

            public Builder setClauses(int i, Clause.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setClauses(i, (Clause) builder.build());
                return this;
            }

            public Builder addClauses(Clause.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).addClauses((Clause) builder.build());
                return this;
            }

            public Builder addClauses(int i, Clause.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).addClauses(i, (Clause) builder.build());
                return this;
            }
        }

        static {
            SigningInput signingInput = new SigningInput();
            DEFAULT_INSTANCE = signingInput;
            GeneratedMessageLite.registerDefaultInstance(SigningInput.class, signingInput);
        }

        private SigningInput() {
            ByteString byteString = ByteString.EMPTY;
            this.dependsOn_ = byteString;
            this.privateKey_ = byteString;
        }

        /* access modifiers changed from: private */
        public void addAllClauses(Iterable<? extends Clause> iterable) {
            ensureClausesIsMutable();
            C4949a.addAll(iterable, this.clauses_);
        }

        /* access modifiers changed from: private */
        public void addClauses(Clause clause) {
            clause.getClass();
            ensureClausesIsMutable();
            this.clauses_.add(clause);
        }

        /* access modifiers changed from: private */
        public void clearBlockRef() {
            this.blockRef_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearChainTag() {
            this.chainTag_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearClauses() {
            this.clauses_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearDependsOn() {
            this.dependsOn_ = getDefaultInstance().getDependsOn();
        }

        /* access modifiers changed from: private */
        public void clearExpiration() {
            this.expiration_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearGas() {
            this.gas_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearGasPriceCoef() {
            this.gasPriceCoef_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearNonce() {
            this.nonce_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearPrivateKey() {
            this.privateKey_ = getDefaultInstance().getPrivateKey();
        }

        private void ensureClausesIsMutable() {
            C5011t.C5020i<Clause> iVar = this.clauses_;
            if (!iVar.mo37090v()) {
                this.clauses_ = GeneratedMessageLite.mutableCopy(iVar);
            }
        }

        public static SigningInput getDefaultInstance() {
            return DEFAULT_INSTANCE;
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
        public void removeClauses(int i) {
            ensureClausesIsMutable();
            this.clauses_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setBlockRef(long j) {
            this.blockRef_ = j;
        }

        /* access modifiers changed from: private */
        public void setChainTag(int i) {
            this.chainTag_ = i;
        }

        /* access modifiers changed from: private */
        public void setClauses(int i, Clause clause) {
            clause.getClass();
            ensureClausesIsMutable();
            this.clauses_.set(i, clause);
        }

        /* access modifiers changed from: private */
        public void setDependsOn(ByteString byteString) {
            byteString.getClass();
            this.dependsOn_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setExpiration(int i) {
            this.expiration_ = i;
        }

        /* access modifiers changed from: private */
        public void setGas(long j) {
            this.gas_ = j;
        }

        /* access modifiers changed from: private */
        public void setGasPriceCoef(int i) {
            this.gasPriceCoef_ = i;
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

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97741.f46586xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningInput();
                case 2:
                    return new Builder((C97741) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0001\u0000\u0001\u000b\u0002\u0003\u0003\u000b\u0004\u001b\u0005\u000b\u0006\u0003\u0007\n\b\u0003\t\n", new Object[]{"chainTag_", "blockRef_", "expiration_", "clauses_", Clause.class, "gasPriceCoef_", "gas_", "dependsOn_", "nonce_", "privateKey_"});
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

        public long getBlockRef() {
            return this.blockRef_;
        }

        public int getChainTag() {
            return this.chainTag_;
        }

        public Clause getClauses(int i) {
            return this.clauses_.get(i);
        }

        public int getClausesCount() {
            return this.clauses_.size();
        }

        public List<Clause> getClausesList() {
            return this.clauses_;
        }

        public ClauseOrBuilder getClausesOrBuilder(int i) {
            return this.clauses_.get(i);
        }

        public List<? extends ClauseOrBuilder> getClausesOrBuilderList() {
            return this.clauses_;
        }

        public ByteString getDependsOn() {
            return this.dependsOn_;
        }

        public int getExpiration() {
            return this.expiration_;
        }

        public long getGas() {
            return this.gas_;
        }

        public int getGasPriceCoef() {
            return this.gasPriceCoef_;
        }

        public long getNonce() {
            return this.nonce_;
        }

        public ByteString getPrivateKey() {
            return this.privateKey_;
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
        public void addClauses(int i, Clause clause) {
            clause.getClass();
            ensureClausesIsMutable();
            this.clauses_.add(i, clause);
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
        long getBlockRef();

        int getChainTag();

        Clause getClauses(int i);

        int getClausesCount();

        List<Clause> getClausesList();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        ByteString getDependsOn();

        int getExpiration();

        long getGas();

        int getGasPriceCoef();

        long getNonce();

        ByteString getPrivateKey();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SigningOutput extends GeneratedMessageLite<SigningOutput, Builder> implements SigningOutputOrBuilder {
        /* access modifiers changed from: private */
        public static final SigningOutput DEFAULT_INSTANCE;
        public static final int ENCODED_FIELD_NUMBER = 1;
        private static volatile im4<SigningOutput> PARSER = null;
        public static final int SIGNATURE_FIELD_NUMBER = 2;
        private ByteString encoded_;
        private ByteString signature_;

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningOutput, Builder> implements SigningOutputOrBuilder {
            public /* synthetic */ Builder(C97741 r1) {
                this();
            }

            public Builder clearEncoded() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearEncoded();
                return this;
            }

            public Builder clearSignature() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearSignature();
                return this;
            }

            public ByteString getEncoded() {
                return ((SigningOutput) this.instance).getEncoded();
            }

            public ByteString getSignature() {
                return ((SigningOutput) this.instance).getSignature();
            }

            public Builder setEncoded(ByteString byteString) {
                copyOnWrite();
                ((SigningOutput) this.instance).setEncoded(byteString);
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
            this.encoded_ = byteString;
            this.signature_ = byteString;
        }

        /* access modifiers changed from: private */
        public void clearEncoded() {
            this.encoded_ = getDefaultInstance().getEncoded();
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
        public void setEncoded(ByteString byteString) {
            byteString.getClass();
            this.encoded_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setSignature(ByteString byteString) {
            byteString.getClass();
            this.signature_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97741.f46586xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningOutput();
                case 2:
                    return new Builder((C97741) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\n", new Object[]{"encoded_", "signature_"});
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

        ByteString getEncoded();

        ByteString getSignature();

        /* synthetic */ boolean isInitialized();
    }

    private VeChain() {
    }

    public static void registerAllExtensions(C4987l lVar) {
    }
}
