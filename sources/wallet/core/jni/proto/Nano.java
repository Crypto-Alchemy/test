package wallet.core.jni.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.C4949a;
import com.google.protobuf.C4956c0;
import com.google.protobuf.C4969g;
import com.google.protobuf.C4987l;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Nano {

    /* renamed from: wallet.core.jni.proto.Nano$1 */
    public static /* synthetic */ class C97541 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f46570xa1df5c61;

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
                f46570xa1df5c61 = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f46570xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f46570xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f46570xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f46570xa1df5c61     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f46570xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f46570xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wallet.core.jni.proto.Nano.C97541.<clinit>():void");
        }
    }

    public static final class SigningInput extends GeneratedMessageLite<SigningInput, Builder> implements SigningInputOrBuilder {
        public static final int BALANCE_FIELD_NUMBER = 6;
        /* access modifiers changed from: private */
        public static final SigningInput DEFAULT_INSTANCE;
        public static final int LINK_BLOCK_FIELD_NUMBER = 3;
        public static final int LINK_RECIPIENT_FIELD_NUMBER = 4;
        public static final int PARENT_BLOCK_FIELD_NUMBER = 2;
        private static volatile im4<SigningInput> PARSER = null;
        public static final int PRIVATE_KEY_FIELD_NUMBER = 1;
        public static final int REPRESENTATIVE_FIELD_NUMBER = 5;
        public static final int WORK_FIELD_NUMBER = 7;
        private String balance_;
        private int linkOneofCase_ = 0;
        private Object linkOneof_;
        private ByteString parentBlock_;
        private ByteString privateKey_;
        private String representative_;
        private String work_;

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningInput, Builder> implements SigningInputOrBuilder {
            public /* synthetic */ Builder(C97541 r1) {
                this();
            }

            public Builder clearBalance() {
                copyOnWrite();
                ((SigningInput) this.instance).clearBalance();
                return this;
            }

            public Builder clearLinkBlock() {
                copyOnWrite();
                ((SigningInput) this.instance).clearLinkBlock();
                return this;
            }

            public Builder clearLinkOneof() {
                copyOnWrite();
                ((SigningInput) this.instance).clearLinkOneof();
                return this;
            }

            public Builder clearLinkRecipient() {
                copyOnWrite();
                ((SigningInput) this.instance).clearLinkRecipient();
                return this;
            }

            public Builder clearParentBlock() {
                copyOnWrite();
                ((SigningInput) this.instance).clearParentBlock();
                return this;
            }

            public Builder clearPrivateKey() {
                copyOnWrite();
                ((SigningInput) this.instance).clearPrivateKey();
                return this;
            }

            public Builder clearRepresentative() {
                copyOnWrite();
                ((SigningInput) this.instance).clearRepresentative();
                return this;
            }

            public Builder clearWork() {
                copyOnWrite();
                ((SigningInput) this.instance).clearWork();
                return this;
            }

            public String getBalance() {
                return ((SigningInput) this.instance).getBalance();
            }

            public ByteString getBalanceBytes() {
                return ((SigningInput) this.instance).getBalanceBytes();
            }

            public ByteString getLinkBlock() {
                return ((SigningInput) this.instance).getLinkBlock();
            }

            public LinkOneofCase getLinkOneofCase() {
                return ((SigningInput) this.instance).getLinkOneofCase();
            }

            public String getLinkRecipient() {
                return ((SigningInput) this.instance).getLinkRecipient();
            }

            public ByteString getLinkRecipientBytes() {
                return ((SigningInput) this.instance).getLinkRecipientBytes();
            }

            public ByteString getParentBlock() {
                return ((SigningInput) this.instance).getParentBlock();
            }

            public ByteString getPrivateKey() {
                return ((SigningInput) this.instance).getPrivateKey();
            }

            public String getRepresentative() {
                return ((SigningInput) this.instance).getRepresentative();
            }

            public ByteString getRepresentativeBytes() {
                return ((SigningInput) this.instance).getRepresentativeBytes();
            }

            public String getWork() {
                return ((SigningInput) this.instance).getWork();
            }

            public ByteString getWorkBytes() {
                return ((SigningInput) this.instance).getWorkBytes();
            }

            public boolean hasLinkBlock() {
                return ((SigningInput) this.instance).hasLinkBlock();
            }

            public boolean hasLinkRecipient() {
                return ((SigningInput) this.instance).hasLinkRecipient();
            }

            public Builder setBalance(String str) {
                copyOnWrite();
                ((SigningInput) this.instance).setBalance(str);
                return this;
            }

            public Builder setBalanceBytes(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setBalanceBytes(byteString);
                return this;
            }

            public Builder setLinkBlock(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setLinkBlock(byteString);
                return this;
            }

            public Builder setLinkRecipient(String str) {
                copyOnWrite();
                ((SigningInput) this.instance).setLinkRecipient(str);
                return this;
            }

            public Builder setLinkRecipientBytes(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setLinkRecipientBytes(byteString);
                return this;
            }

            public Builder setParentBlock(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setParentBlock(byteString);
                return this;
            }

            public Builder setPrivateKey(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setPrivateKey(byteString);
                return this;
            }

            public Builder setRepresentative(String str) {
                copyOnWrite();
                ((SigningInput) this.instance).setRepresentative(str);
                return this;
            }

            public Builder setRepresentativeBytes(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setRepresentativeBytes(byteString);
                return this;
            }

            public Builder setWork(String str) {
                copyOnWrite();
                ((SigningInput) this.instance).setWork(str);
                return this;
            }

            public Builder setWorkBytes(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setWorkBytes(byteString);
                return this;
            }

            private Builder() {
                super(SigningInput.DEFAULT_INSTANCE);
            }
        }

        public enum LinkOneofCase {
            LINK_BLOCK(3),
            LINK_RECIPIENT(4),
            LINKONEOF_NOT_SET(0);
            
            private final int value;

            private LinkOneofCase(int i) {
                this.value = i;
            }

            public static LinkOneofCase forNumber(int i) {
                if (i == 0) {
                    return LINKONEOF_NOT_SET;
                }
                if (i == 3) {
                    return LINK_BLOCK;
                }
                if (i != 4) {
                    return null;
                }
                return LINK_RECIPIENT;
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static LinkOneofCase valueOf(int i) {
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
            this.privateKey_ = byteString;
            this.parentBlock_ = byteString;
            this.representative_ = "";
            this.balance_ = "";
            this.work_ = "";
        }

        /* access modifiers changed from: private */
        public void clearBalance() {
            this.balance_ = getDefaultInstance().getBalance();
        }

        /* access modifiers changed from: private */
        public void clearLinkBlock() {
            if (this.linkOneofCase_ == 3) {
                this.linkOneofCase_ = 0;
                this.linkOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearLinkOneof() {
            this.linkOneofCase_ = 0;
            this.linkOneof_ = null;
        }

        /* access modifiers changed from: private */
        public void clearLinkRecipient() {
            if (this.linkOneofCase_ == 4) {
                this.linkOneofCase_ = 0;
                this.linkOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearParentBlock() {
            this.parentBlock_ = getDefaultInstance().getParentBlock();
        }

        /* access modifiers changed from: private */
        public void clearPrivateKey() {
            this.privateKey_ = getDefaultInstance().getPrivateKey();
        }

        /* access modifiers changed from: private */
        public void clearRepresentative() {
            this.representative_ = getDefaultInstance().getRepresentative();
        }

        /* access modifiers changed from: private */
        public void clearWork() {
            this.work_ = getDefaultInstance().getWork();
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
        public void setBalance(String str) {
            str.getClass();
            this.balance_ = str;
        }

        /* access modifiers changed from: private */
        public void setBalanceBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.balance_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setLinkBlock(ByteString byteString) {
            byteString.getClass();
            this.linkOneofCase_ = 3;
            this.linkOneof_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setLinkRecipient(String str) {
            str.getClass();
            this.linkOneofCase_ = 4;
            this.linkOneof_ = str;
        }

        /* access modifiers changed from: private */
        public void setLinkRecipientBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.linkOneof_ = byteString.toStringUtf8();
            this.linkOneofCase_ = 4;
        }

        /* access modifiers changed from: private */
        public void setParentBlock(ByteString byteString) {
            byteString.getClass();
            this.parentBlock_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setPrivateKey(ByteString byteString) {
            byteString.getClass();
            this.privateKey_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setRepresentative(String str) {
            str.getClass();
            this.representative_ = str;
        }

        /* access modifiers changed from: private */
        public void setRepresentativeBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.representative_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setWork(String str) {
            str.getClass();
            this.work_ = str;
        }

        /* access modifiers changed from: private */
        public void setWorkBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.work_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97541.f46570xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningInput();
                case 2:
                    return new Builder((C97541) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\n\u0002\n\u0003=\u0000\u0004Ȼ\u0000\u0005Ȉ\u0006Ȉ\u0007Ȉ", new Object[]{"linkOneof_", "linkOneofCase_", "privateKey_", "parentBlock_", "representative_", "balance_", "work_"});
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

        public String getBalance() {
            return this.balance_;
        }

        public ByteString getBalanceBytes() {
            return ByteString.copyFromUtf8(this.balance_);
        }

        public ByteString getLinkBlock() {
            if (this.linkOneofCase_ == 3) {
                return (ByteString) this.linkOneof_;
            }
            return ByteString.EMPTY;
        }

        public LinkOneofCase getLinkOneofCase() {
            return LinkOneofCase.forNumber(this.linkOneofCase_);
        }

        public String getLinkRecipient() {
            if (this.linkOneofCase_ == 4) {
                return (String) this.linkOneof_;
            }
            return "";
        }

        public ByteString getLinkRecipientBytes() {
            String str;
            if (this.linkOneofCase_ == 4) {
                str = (String) this.linkOneof_;
            } else {
                str = "";
            }
            return ByteString.copyFromUtf8(str);
        }

        public ByteString getParentBlock() {
            return this.parentBlock_;
        }

        public ByteString getPrivateKey() {
            return this.privateKey_;
        }

        public String getRepresentative() {
            return this.representative_;
        }

        public ByteString getRepresentativeBytes() {
            return ByteString.copyFromUtf8(this.representative_);
        }

        public String getWork() {
            return this.work_;
        }

        public ByteString getWorkBytes() {
            return ByteString.copyFromUtf8(this.work_);
        }

        public boolean hasLinkBlock() {
            if (this.linkOneofCase_ == 3) {
                return true;
            }
            return false;
        }

        public boolean hasLinkRecipient() {
            if (this.linkOneofCase_ == 4) {
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
        String getBalance();

        ByteString getBalanceBytes();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        ByteString getLinkBlock();

        SigningInput.LinkOneofCase getLinkOneofCase();

        String getLinkRecipient();

        ByteString getLinkRecipientBytes();

        ByteString getParentBlock();

        ByteString getPrivateKey();

        String getRepresentative();

        ByteString getRepresentativeBytes();

        String getWork();

        ByteString getWorkBytes();

        boolean hasLinkBlock();

        boolean hasLinkRecipient();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SigningOutput extends GeneratedMessageLite<SigningOutput, Builder> implements SigningOutputOrBuilder {
        public static final int BLOCK_HASH_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final SigningOutput DEFAULT_INSTANCE;
        public static final int JSON_FIELD_NUMBER = 3;
        private static volatile im4<SigningOutput> PARSER = null;
        public static final int SIGNATURE_FIELD_NUMBER = 1;
        private ByteString blockHash_;
        private String json_ = "";
        private ByteString signature_;

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningOutput, Builder> implements SigningOutputOrBuilder {
            public /* synthetic */ Builder(C97541 r1) {
                this();
            }

            public Builder clearBlockHash() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearBlockHash();
                return this;
            }

            public Builder clearJson() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearJson();
                return this;
            }

            public Builder clearSignature() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearSignature();
                return this;
            }

            public ByteString getBlockHash() {
                return ((SigningOutput) this.instance).getBlockHash();
            }

            public String getJson() {
                return ((SigningOutput) this.instance).getJson();
            }

            public ByteString getJsonBytes() {
                return ((SigningOutput) this.instance).getJsonBytes();
            }

            public ByteString getSignature() {
                return ((SigningOutput) this.instance).getSignature();
            }

            public Builder setBlockHash(ByteString byteString) {
                copyOnWrite();
                ((SigningOutput) this.instance).setBlockHash(byteString);
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
            this.signature_ = byteString;
            this.blockHash_ = byteString;
        }

        /* access modifiers changed from: private */
        public void clearBlockHash() {
            this.blockHash_ = getDefaultInstance().getBlockHash();
        }

        /* access modifiers changed from: private */
        public void clearJson() {
            this.json_ = getDefaultInstance().getJson();
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
        public void setBlockHash(ByteString byteString) {
            byteString.getClass();
            this.blockHash_ = byteString;
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
        public void setSignature(ByteString byteString) {
            byteString.getClass();
            this.signature_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97541.f46570xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningOutput();
                case 2:
                    return new Builder((C97541) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\n\u0003Ȉ", new Object[]{"signature_", "blockHash_", "json_"});
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

        public ByteString getBlockHash() {
            return this.blockHash_;
        }

        public String getJson() {
            return this.json_;
        }

        public ByteString getJsonBytes() {
            return ByteString.copyFromUtf8(this.json_);
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
        ByteString getBlockHash();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getJson();

        ByteString getJsonBytes();

        ByteString getSignature();

        /* synthetic */ boolean isInitialized();
    }

    private Nano() {
    }

    public static void registerAllExtensions(C4987l lVar) {
    }
}
