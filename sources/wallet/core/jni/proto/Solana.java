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

public final class Solana {

    /* renamed from: wallet.core.jni.proto.Solana$1 */
    public static /* synthetic */ class C97631 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f46578xa1df5c61;

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
                f46578xa1df5c61 = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f46578xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f46578xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f46578xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f46578xa1df5c61     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f46578xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f46578xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wallet.core.jni.proto.Solana.C97631.<clinit>():void");
        }
    }

    public static final class CreateAndTransferToken extends GeneratedMessageLite<CreateAndTransferToken, Builder> implements CreateAndTransferTokenOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 5;
        public static final int DECIMALS_FIELD_NUMBER = 6;
        /* access modifiers changed from: private */
        public static final CreateAndTransferToken DEFAULT_INSTANCE;
        public static final int MEMO_FIELD_NUMBER = 7;
        private static volatile im4<CreateAndTransferToken> PARSER = null;
        public static final int RECIPIENT_MAIN_ADDRESS_FIELD_NUMBER = 1;
        public static final int RECIPIENT_TOKEN_ADDRESS_FIELD_NUMBER = 3;
        public static final int REFERENCES_FIELD_NUMBER = 8;
        public static final int SENDER_TOKEN_ADDRESS_FIELD_NUMBER = 4;
        public static final int TOKEN_MINT_ADDRESS_FIELD_NUMBER = 2;
        private long amount_;
        private int decimals_;
        private String memo_ = "";
        private String recipientMainAddress_ = "";
        private String recipientTokenAddress_ = "";
        private C5011t.C5020i<String> references_ = GeneratedMessageLite.emptyProtobufList();
        private String senderTokenAddress_ = "";
        private String tokenMintAddress_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<CreateAndTransferToken, Builder> implements CreateAndTransferTokenOrBuilder {
            public /* synthetic */ Builder(C97631 r1) {
                this();
            }

            public Builder addAllReferences(Iterable<String> iterable) {
                copyOnWrite();
                ((CreateAndTransferToken) this.instance).addAllReferences(iterable);
                return this;
            }

            public Builder addReferences(String str) {
                copyOnWrite();
                ((CreateAndTransferToken) this.instance).addReferences(str);
                return this;
            }

            public Builder addReferencesBytes(ByteString byteString) {
                copyOnWrite();
                ((CreateAndTransferToken) this.instance).addReferencesBytes(byteString);
                return this;
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((CreateAndTransferToken) this.instance).clearAmount();
                return this;
            }

            public Builder clearDecimals() {
                copyOnWrite();
                ((CreateAndTransferToken) this.instance).clearDecimals();
                return this;
            }

            public Builder clearMemo() {
                copyOnWrite();
                ((CreateAndTransferToken) this.instance).clearMemo();
                return this;
            }

            public Builder clearRecipientMainAddress() {
                copyOnWrite();
                ((CreateAndTransferToken) this.instance).clearRecipientMainAddress();
                return this;
            }

            public Builder clearRecipientTokenAddress() {
                copyOnWrite();
                ((CreateAndTransferToken) this.instance).clearRecipientTokenAddress();
                return this;
            }

            public Builder clearReferences() {
                copyOnWrite();
                ((CreateAndTransferToken) this.instance).clearReferences();
                return this;
            }

            public Builder clearSenderTokenAddress() {
                copyOnWrite();
                ((CreateAndTransferToken) this.instance).clearSenderTokenAddress();
                return this;
            }

            public Builder clearTokenMintAddress() {
                copyOnWrite();
                ((CreateAndTransferToken) this.instance).clearTokenMintAddress();
                return this;
            }

            public long getAmount() {
                return ((CreateAndTransferToken) this.instance).getAmount();
            }

            public int getDecimals() {
                return ((CreateAndTransferToken) this.instance).getDecimals();
            }

            public String getMemo() {
                return ((CreateAndTransferToken) this.instance).getMemo();
            }

            public ByteString getMemoBytes() {
                return ((CreateAndTransferToken) this.instance).getMemoBytes();
            }

            public String getRecipientMainAddress() {
                return ((CreateAndTransferToken) this.instance).getRecipientMainAddress();
            }

            public ByteString getRecipientMainAddressBytes() {
                return ((CreateAndTransferToken) this.instance).getRecipientMainAddressBytes();
            }

            public String getRecipientTokenAddress() {
                return ((CreateAndTransferToken) this.instance).getRecipientTokenAddress();
            }

            public ByteString getRecipientTokenAddressBytes() {
                return ((CreateAndTransferToken) this.instance).getRecipientTokenAddressBytes();
            }

            public String getReferences(int i) {
                return ((CreateAndTransferToken) this.instance).getReferences(i);
            }

            public ByteString getReferencesBytes(int i) {
                return ((CreateAndTransferToken) this.instance).getReferencesBytes(i);
            }

            public int getReferencesCount() {
                return ((CreateAndTransferToken) this.instance).getReferencesCount();
            }

            public List<String> getReferencesList() {
                return Collections.unmodifiableList(((CreateAndTransferToken) this.instance).getReferencesList());
            }

            public String getSenderTokenAddress() {
                return ((CreateAndTransferToken) this.instance).getSenderTokenAddress();
            }

            public ByteString getSenderTokenAddressBytes() {
                return ((CreateAndTransferToken) this.instance).getSenderTokenAddressBytes();
            }

            public String getTokenMintAddress() {
                return ((CreateAndTransferToken) this.instance).getTokenMintAddress();
            }

            public ByteString getTokenMintAddressBytes() {
                return ((CreateAndTransferToken) this.instance).getTokenMintAddressBytes();
            }

            public Builder setAmount(long j) {
                copyOnWrite();
                ((CreateAndTransferToken) this.instance).setAmount(j);
                return this;
            }

            public Builder setDecimals(int i) {
                copyOnWrite();
                ((CreateAndTransferToken) this.instance).setDecimals(i);
                return this;
            }

            public Builder setMemo(String str) {
                copyOnWrite();
                ((CreateAndTransferToken) this.instance).setMemo(str);
                return this;
            }

            public Builder setMemoBytes(ByteString byteString) {
                copyOnWrite();
                ((CreateAndTransferToken) this.instance).setMemoBytes(byteString);
                return this;
            }

            public Builder setRecipientMainAddress(String str) {
                copyOnWrite();
                ((CreateAndTransferToken) this.instance).setRecipientMainAddress(str);
                return this;
            }

            public Builder setRecipientMainAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((CreateAndTransferToken) this.instance).setRecipientMainAddressBytes(byteString);
                return this;
            }

            public Builder setRecipientTokenAddress(String str) {
                copyOnWrite();
                ((CreateAndTransferToken) this.instance).setRecipientTokenAddress(str);
                return this;
            }

            public Builder setRecipientTokenAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((CreateAndTransferToken) this.instance).setRecipientTokenAddressBytes(byteString);
                return this;
            }

            public Builder setReferences(int i, String str) {
                copyOnWrite();
                ((CreateAndTransferToken) this.instance).setReferences(i, str);
                return this;
            }

            public Builder setSenderTokenAddress(String str) {
                copyOnWrite();
                ((CreateAndTransferToken) this.instance).setSenderTokenAddress(str);
                return this;
            }

            public Builder setSenderTokenAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((CreateAndTransferToken) this.instance).setSenderTokenAddressBytes(byteString);
                return this;
            }

            public Builder setTokenMintAddress(String str) {
                copyOnWrite();
                ((CreateAndTransferToken) this.instance).setTokenMintAddress(str);
                return this;
            }

            public Builder setTokenMintAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((CreateAndTransferToken) this.instance).setTokenMintAddressBytes(byteString);
                return this;
            }

            private Builder() {
                super(CreateAndTransferToken.DEFAULT_INSTANCE);
            }
        }

        static {
            CreateAndTransferToken createAndTransferToken = new CreateAndTransferToken();
            DEFAULT_INSTANCE = createAndTransferToken;
            GeneratedMessageLite.registerDefaultInstance(CreateAndTransferToken.class, createAndTransferToken);
        }

        private CreateAndTransferToken() {
        }

        /* access modifiers changed from: private */
        public void addAllReferences(Iterable<String> iterable) {
            ensureReferencesIsMutable();
            C4949a.addAll(iterable, this.references_);
        }

        /* access modifiers changed from: private */
        public void addReferences(String str) {
            str.getClass();
            ensureReferencesIsMutable();
            this.references_.add(str);
        }

        /* access modifiers changed from: private */
        public void addReferencesBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            ensureReferencesIsMutable();
            this.references_.add(byteString.toStringUtf8());
        }

        /* access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearDecimals() {
            this.decimals_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearMemo() {
            this.memo_ = getDefaultInstance().getMemo();
        }

        /* access modifiers changed from: private */
        public void clearRecipientMainAddress() {
            this.recipientMainAddress_ = getDefaultInstance().getRecipientMainAddress();
        }

        /* access modifiers changed from: private */
        public void clearRecipientTokenAddress() {
            this.recipientTokenAddress_ = getDefaultInstance().getRecipientTokenAddress();
        }

        /* access modifiers changed from: private */
        public void clearReferences() {
            this.references_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearSenderTokenAddress() {
            this.senderTokenAddress_ = getDefaultInstance().getSenderTokenAddress();
        }

        /* access modifiers changed from: private */
        public void clearTokenMintAddress() {
            this.tokenMintAddress_ = getDefaultInstance().getTokenMintAddress();
        }

        private void ensureReferencesIsMutable() {
            C5011t.C5020i<String> iVar = this.references_;
            if (!iVar.mo37090v()) {
                this.references_ = GeneratedMessageLite.mutableCopy(iVar);
            }
        }

        public static CreateAndTransferToken getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static CreateAndTransferToken parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CreateAndTransferToken) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CreateAndTransferToken parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CreateAndTransferToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<CreateAndTransferToken> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAmount(long j) {
            this.amount_ = j;
        }

        /* access modifiers changed from: private */
        public void setDecimals(int i) {
            this.decimals_ = i;
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
        public void setRecipientMainAddress(String str) {
            str.getClass();
            this.recipientMainAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setRecipientMainAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.recipientMainAddress_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setRecipientTokenAddress(String str) {
            str.getClass();
            this.recipientTokenAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setRecipientTokenAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.recipientTokenAddress_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setReferences(int i, String str) {
            str.getClass();
            ensureReferencesIsMutable();
            this.references_.set(i, str);
        }

        /* access modifiers changed from: private */
        public void setSenderTokenAddress(String str) {
            str.getClass();
            this.senderTokenAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setSenderTokenAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.senderTokenAddress_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setTokenMintAddress(String str) {
            str.getClass();
            this.tokenMintAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setTokenMintAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.tokenMintAddress_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97631.f46578xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new CreateAndTransferToken();
                case 2:
                    return new Builder((C97631) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u0003\u0006\u000b\u0007Ȉ\bȚ", new Object[]{"recipientMainAddress_", "tokenMintAddress_", "recipientTokenAddress_", "senderTokenAddress_", "amount_", "decimals_", "memo_", "references_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<CreateAndTransferToken> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (CreateAndTransferToken.class) {
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

        public int getDecimals() {
            return this.decimals_;
        }

        public String getMemo() {
            return this.memo_;
        }

        public ByteString getMemoBytes() {
            return ByteString.copyFromUtf8(this.memo_);
        }

        public String getRecipientMainAddress() {
            return this.recipientMainAddress_;
        }

        public ByteString getRecipientMainAddressBytes() {
            return ByteString.copyFromUtf8(this.recipientMainAddress_);
        }

        public String getRecipientTokenAddress() {
            return this.recipientTokenAddress_;
        }

        public ByteString getRecipientTokenAddressBytes() {
            return ByteString.copyFromUtf8(this.recipientTokenAddress_);
        }

        public String getReferences(int i) {
            return this.references_.get(i);
        }

        public ByteString getReferencesBytes(int i) {
            return ByteString.copyFromUtf8(this.references_.get(i));
        }

        public int getReferencesCount() {
            return this.references_.size();
        }

        public List<String> getReferencesList() {
            return this.references_;
        }

        public String getSenderTokenAddress() {
            return this.senderTokenAddress_;
        }

        public ByteString getSenderTokenAddressBytes() {
            return ByteString.copyFromUtf8(this.senderTokenAddress_);
        }

        public String getTokenMintAddress() {
            return this.tokenMintAddress_;
        }

        public ByteString getTokenMintAddressBytes() {
            return ByteString.copyFromUtf8(this.tokenMintAddress_);
        }

        public static Builder newBuilder(CreateAndTransferToken createAndTransferToken) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(createAndTransferToken);
        }

        public static CreateAndTransferToken parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (CreateAndTransferToken) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static CreateAndTransferToken parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (CreateAndTransferToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static CreateAndTransferToken parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CreateAndTransferToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CreateAndTransferToken parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (CreateAndTransferToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static CreateAndTransferToken parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CreateAndTransferToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CreateAndTransferToken parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (CreateAndTransferToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static CreateAndTransferToken parseFrom(InputStream inputStream) throws IOException {
            return (CreateAndTransferToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CreateAndTransferToken parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (CreateAndTransferToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static CreateAndTransferToken parseFrom(C4969g gVar) throws IOException {
            return (CreateAndTransferToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static CreateAndTransferToken parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (CreateAndTransferToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface CreateAndTransferTokenOrBuilder extends qu3 {
        long getAmount();

        int getDecimals();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getMemo();

        ByteString getMemoBytes();

        String getRecipientMainAddress();

        ByteString getRecipientMainAddressBytes();

        String getRecipientTokenAddress();

        ByteString getRecipientTokenAddressBytes();

        String getReferences(int i);

        ByteString getReferencesBytes(int i);

        int getReferencesCount();

        List<String> getReferencesList();

        String getSenderTokenAddress();

        ByteString getSenderTokenAddressBytes();

        String getTokenMintAddress();

        ByteString getTokenMintAddressBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class CreateTokenAccount extends GeneratedMessageLite<CreateTokenAccount, Builder> implements CreateTokenAccountOrBuilder {
        /* access modifiers changed from: private */
        public static final CreateTokenAccount DEFAULT_INSTANCE;
        public static final int MAIN_ADDRESS_FIELD_NUMBER = 1;
        private static volatile im4<CreateTokenAccount> PARSER = null;
        public static final int TOKEN_ADDRESS_FIELD_NUMBER = 3;
        public static final int TOKEN_MINT_ADDRESS_FIELD_NUMBER = 2;
        private String mainAddress_ = "";
        private String tokenAddress_ = "";
        private String tokenMintAddress_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<CreateTokenAccount, Builder> implements CreateTokenAccountOrBuilder {
            public /* synthetic */ Builder(C97631 r1) {
                this();
            }

            public Builder clearMainAddress() {
                copyOnWrite();
                ((CreateTokenAccount) this.instance).clearMainAddress();
                return this;
            }

            public Builder clearTokenAddress() {
                copyOnWrite();
                ((CreateTokenAccount) this.instance).clearTokenAddress();
                return this;
            }

            public Builder clearTokenMintAddress() {
                copyOnWrite();
                ((CreateTokenAccount) this.instance).clearTokenMintAddress();
                return this;
            }

            public String getMainAddress() {
                return ((CreateTokenAccount) this.instance).getMainAddress();
            }

            public ByteString getMainAddressBytes() {
                return ((CreateTokenAccount) this.instance).getMainAddressBytes();
            }

            public String getTokenAddress() {
                return ((CreateTokenAccount) this.instance).getTokenAddress();
            }

            public ByteString getTokenAddressBytes() {
                return ((CreateTokenAccount) this.instance).getTokenAddressBytes();
            }

            public String getTokenMintAddress() {
                return ((CreateTokenAccount) this.instance).getTokenMintAddress();
            }

            public ByteString getTokenMintAddressBytes() {
                return ((CreateTokenAccount) this.instance).getTokenMintAddressBytes();
            }

            public Builder setMainAddress(String str) {
                copyOnWrite();
                ((CreateTokenAccount) this.instance).setMainAddress(str);
                return this;
            }

            public Builder setMainAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((CreateTokenAccount) this.instance).setMainAddressBytes(byteString);
                return this;
            }

            public Builder setTokenAddress(String str) {
                copyOnWrite();
                ((CreateTokenAccount) this.instance).setTokenAddress(str);
                return this;
            }

            public Builder setTokenAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((CreateTokenAccount) this.instance).setTokenAddressBytes(byteString);
                return this;
            }

            public Builder setTokenMintAddress(String str) {
                copyOnWrite();
                ((CreateTokenAccount) this.instance).setTokenMintAddress(str);
                return this;
            }

            public Builder setTokenMintAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((CreateTokenAccount) this.instance).setTokenMintAddressBytes(byteString);
                return this;
            }

            private Builder() {
                super(CreateTokenAccount.DEFAULT_INSTANCE);
            }
        }

        static {
            CreateTokenAccount createTokenAccount = new CreateTokenAccount();
            DEFAULT_INSTANCE = createTokenAccount;
            GeneratedMessageLite.registerDefaultInstance(CreateTokenAccount.class, createTokenAccount);
        }

        private CreateTokenAccount() {
        }

        /* access modifiers changed from: private */
        public void clearMainAddress() {
            this.mainAddress_ = getDefaultInstance().getMainAddress();
        }

        /* access modifiers changed from: private */
        public void clearTokenAddress() {
            this.tokenAddress_ = getDefaultInstance().getTokenAddress();
        }

        /* access modifiers changed from: private */
        public void clearTokenMintAddress() {
            this.tokenMintAddress_ = getDefaultInstance().getTokenMintAddress();
        }

        public static CreateTokenAccount getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static CreateTokenAccount parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CreateTokenAccount) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CreateTokenAccount parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CreateTokenAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<CreateTokenAccount> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setMainAddress(String str) {
            str.getClass();
            this.mainAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setMainAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.mainAddress_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setTokenAddress(String str) {
            str.getClass();
            this.tokenAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setTokenAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.tokenAddress_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setTokenMintAddress(String str) {
            str.getClass();
            this.tokenMintAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setTokenMintAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.tokenMintAddress_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97631.f46578xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new CreateTokenAccount();
                case 2:
                    return new Builder((C97631) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"mainAddress_", "tokenMintAddress_", "tokenAddress_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<CreateTokenAccount> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (CreateTokenAccount.class) {
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

        public String getMainAddress() {
            return this.mainAddress_;
        }

        public ByteString getMainAddressBytes() {
            return ByteString.copyFromUtf8(this.mainAddress_);
        }

        public String getTokenAddress() {
            return this.tokenAddress_;
        }

        public ByteString getTokenAddressBytes() {
            return ByteString.copyFromUtf8(this.tokenAddress_);
        }

        public String getTokenMintAddress() {
            return this.tokenMintAddress_;
        }

        public ByteString getTokenMintAddressBytes() {
            return ByteString.copyFromUtf8(this.tokenMintAddress_);
        }

        public static Builder newBuilder(CreateTokenAccount createTokenAccount) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(createTokenAccount);
        }

        public static CreateTokenAccount parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (CreateTokenAccount) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static CreateTokenAccount parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (CreateTokenAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static CreateTokenAccount parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CreateTokenAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CreateTokenAccount parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (CreateTokenAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static CreateTokenAccount parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CreateTokenAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CreateTokenAccount parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (CreateTokenAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static CreateTokenAccount parseFrom(InputStream inputStream) throws IOException {
            return (CreateTokenAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CreateTokenAccount parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (CreateTokenAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static CreateTokenAccount parseFrom(C4969g gVar) throws IOException {
            return (CreateTokenAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static CreateTokenAccount parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (CreateTokenAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface CreateTokenAccountOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getMainAddress();

        ByteString getMainAddressBytes();

        String getTokenAddress();

        ByteString getTokenAddressBytes();

        String getTokenMintAddress();

        ByteString getTokenMintAddressBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class DeactivateAllStake extends GeneratedMessageLite<DeactivateAllStake, Builder> implements DeactivateAllStakeOrBuilder {
        /* access modifiers changed from: private */
        public static final DeactivateAllStake DEFAULT_INSTANCE;
        private static volatile im4<DeactivateAllStake> PARSER = null;
        public static final int STAKE_ACCOUNTS_FIELD_NUMBER = 1;
        private C5011t.C5020i<String> stakeAccounts_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.C4930a<DeactivateAllStake, Builder> implements DeactivateAllStakeOrBuilder {
            public /* synthetic */ Builder(C97631 r1) {
                this();
            }

            public Builder addAllStakeAccounts(Iterable<String> iterable) {
                copyOnWrite();
                ((DeactivateAllStake) this.instance).addAllStakeAccounts(iterable);
                return this;
            }

            public Builder addStakeAccounts(String str) {
                copyOnWrite();
                ((DeactivateAllStake) this.instance).addStakeAccounts(str);
                return this;
            }

            public Builder addStakeAccountsBytes(ByteString byteString) {
                copyOnWrite();
                ((DeactivateAllStake) this.instance).addStakeAccountsBytes(byteString);
                return this;
            }

            public Builder clearStakeAccounts() {
                copyOnWrite();
                ((DeactivateAllStake) this.instance).clearStakeAccounts();
                return this;
            }

            public String getStakeAccounts(int i) {
                return ((DeactivateAllStake) this.instance).getStakeAccounts(i);
            }

            public ByteString getStakeAccountsBytes(int i) {
                return ((DeactivateAllStake) this.instance).getStakeAccountsBytes(i);
            }

            public int getStakeAccountsCount() {
                return ((DeactivateAllStake) this.instance).getStakeAccountsCount();
            }

            public List<String> getStakeAccountsList() {
                return Collections.unmodifiableList(((DeactivateAllStake) this.instance).getStakeAccountsList());
            }

            public Builder setStakeAccounts(int i, String str) {
                copyOnWrite();
                ((DeactivateAllStake) this.instance).setStakeAccounts(i, str);
                return this;
            }

            private Builder() {
                super(DeactivateAllStake.DEFAULT_INSTANCE);
            }
        }

        static {
            DeactivateAllStake deactivateAllStake = new DeactivateAllStake();
            DEFAULT_INSTANCE = deactivateAllStake;
            GeneratedMessageLite.registerDefaultInstance(DeactivateAllStake.class, deactivateAllStake);
        }

        private DeactivateAllStake() {
        }

        /* access modifiers changed from: private */
        public void addAllStakeAccounts(Iterable<String> iterable) {
            ensureStakeAccountsIsMutable();
            C4949a.addAll(iterable, this.stakeAccounts_);
        }

        /* access modifiers changed from: private */
        public void addStakeAccounts(String str) {
            str.getClass();
            ensureStakeAccountsIsMutable();
            this.stakeAccounts_.add(str);
        }

        /* access modifiers changed from: private */
        public void addStakeAccountsBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            ensureStakeAccountsIsMutable();
            this.stakeAccounts_.add(byteString.toStringUtf8());
        }

        /* access modifiers changed from: private */
        public void clearStakeAccounts() {
            this.stakeAccounts_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureStakeAccountsIsMutable() {
            C5011t.C5020i<String> iVar = this.stakeAccounts_;
            if (!iVar.mo37090v()) {
                this.stakeAccounts_ = GeneratedMessageLite.mutableCopy(iVar);
            }
        }

        public static DeactivateAllStake getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static DeactivateAllStake parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DeactivateAllStake) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeactivateAllStake parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DeactivateAllStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<DeactivateAllStake> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setStakeAccounts(int i, String str) {
            str.getClass();
            ensureStakeAccountsIsMutable();
            this.stakeAccounts_.set(i, str);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97631.f46578xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new DeactivateAllStake();
                case 2:
                    return new Builder((C97631) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"stakeAccounts_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<DeactivateAllStake> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (DeactivateAllStake.class) {
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

        public String getStakeAccounts(int i) {
            return this.stakeAccounts_.get(i);
        }

        public ByteString getStakeAccountsBytes(int i) {
            return ByteString.copyFromUtf8(this.stakeAccounts_.get(i));
        }

        public int getStakeAccountsCount() {
            return this.stakeAccounts_.size();
        }

        public List<String> getStakeAccountsList() {
            return this.stakeAccounts_;
        }

        public static Builder newBuilder(DeactivateAllStake deactivateAllStake) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(deactivateAllStake);
        }

        public static DeactivateAllStake parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (DeactivateAllStake) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static DeactivateAllStake parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (DeactivateAllStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static DeactivateAllStake parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DeactivateAllStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DeactivateAllStake parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (DeactivateAllStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static DeactivateAllStake parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DeactivateAllStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DeactivateAllStake parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (DeactivateAllStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static DeactivateAllStake parseFrom(InputStream inputStream) throws IOException {
            return (DeactivateAllStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeactivateAllStake parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (DeactivateAllStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static DeactivateAllStake parseFrom(C4969g gVar) throws IOException {
            return (DeactivateAllStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static DeactivateAllStake parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (DeactivateAllStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface DeactivateAllStakeOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getStakeAccounts(int i);

        ByteString getStakeAccountsBytes(int i);

        int getStakeAccountsCount();

        List<String> getStakeAccountsList();

        /* synthetic */ boolean isInitialized();
    }

    public static final class DeactivateStake extends GeneratedMessageLite<DeactivateStake, Builder> implements DeactivateStakeOrBuilder {
        /* access modifiers changed from: private */
        public static final DeactivateStake DEFAULT_INSTANCE;
        private static volatile im4<DeactivateStake> PARSER = null;
        public static final int STAKE_ACCOUNT_FIELD_NUMBER = 1;
        private String stakeAccount_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<DeactivateStake, Builder> implements DeactivateStakeOrBuilder {
            public /* synthetic */ Builder(C97631 r1) {
                this();
            }

            public Builder clearStakeAccount() {
                copyOnWrite();
                ((DeactivateStake) this.instance).clearStakeAccount();
                return this;
            }

            public String getStakeAccount() {
                return ((DeactivateStake) this.instance).getStakeAccount();
            }

            public ByteString getStakeAccountBytes() {
                return ((DeactivateStake) this.instance).getStakeAccountBytes();
            }

            public Builder setStakeAccount(String str) {
                copyOnWrite();
                ((DeactivateStake) this.instance).setStakeAccount(str);
                return this;
            }

            public Builder setStakeAccountBytes(ByteString byteString) {
                copyOnWrite();
                ((DeactivateStake) this.instance).setStakeAccountBytes(byteString);
                return this;
            }

            private Builder() {
                super(DeactivateStake.DEFAULT_INSTANCE);
            }
        }

        static {
            DeactivateStake deactivateStake = new DeactivateStake();
            DEFAULT_INSTANCE = deactivateStake;
            GeneratedMessageLite.registerDefaultInstance(DeactivateStake.class, deactivateStake);
        }

        private DeactivateStake() {
        }

        /* access modifiers changed from: private */
        public void clearStakeAccount() {
            this.stakeAccount_ = getDefaultInstance().getStakeAccount();
        }

        public static DeactivateStake getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static DeactivateStake parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DeactivateStake) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeactivateStake parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DeactivateStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<DeactivateStake> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setStakeAccount(String str) {
            str.getClass();
            this.stakeAccount_ = str;
        }

        /* access modifiers changed from: private */
        public void setStakeAccountBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.stakeAccount_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97631.f46578xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new DeactivateStake();
                case 2:
                    return new Builder((C97631) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"stakeAccount_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<DeactivateStake> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (DeactivateStake.class) {
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

        public String getStakeAccount() {
            return this.stakeAccount_;
        }

        public ByteString getStakeAccountBytes() {
            return ByteString.copyFromUtf8(this.stakeAccount_);
        }

        public static Builder newBuilder(DeactivateStake deactivateStake) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(deactivateStake);
        }

        public static DeactivateStake parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (DeactivateStake) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static DeactivateStake parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (DeactivateStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static DeactivateStake parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DeactivateStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DeactivateStake parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (DeactivateStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static DeactivateStake parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DeactivateStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DeactivateStake parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (DeactivateStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static DeactivateStake parseFrom(InputStream inputStream) throws IOException {
            return (DeactivateStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeactivateStake parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (DeactivateStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static DeactivateStake parseFrom(C4969g gVar) throws IOException {
            return (DeactivateStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static DeactivateStake parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (DeactivateStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface DeactivateStakeOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getStakeAccount();

        ByteString getStakeAccountBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class DelegateStake extends GeneratedMessageLite<DelegateStake, Builder> implements DelegateStakeOrBuilder {
        /* access modifiers changed from: private */
        public static final DelegateStake DEFAULT_INSTANCE;
        private static volatile im4<DelegateStake> PARSER = null;
        public static final int STAKE_ACCOUNT_FIELD_NUMBER = 3;
        public static final int VALIDATOR_PUBKEY_FIELD_NUMBER = 1;
        public static final int VALUE_FIELD_NUMBER = 2;
        private String stakeAccount_ = "";
        private String validatorPubkey_ = "";
        private long value_;

        public static final class Builder extends GeneratedMessageLite.C4930a<DelegateStake, Builder> implements DelegateStakeOrBuilder {
            public /* synthetic */ Builder(C97631 r1) {
                this();
            }

            public Builder clearStakeAccount() {
                copyOnWrite();
                ((DelegateStake) this.instance).clearStakeAccount();
                return this;
            }

            public Builder clearValidatorPubkey() {
                copyOnWrite();
                ((DelegateStake) this.instance).clearValidatorPubkey();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((DelegateStake) this.instance).clearValue();
                return this;
            }

            public String getStakeAccount() {
                return ((DelegateStake) this.instance).getStakeAccount();
            }

            public ByteString getStakeAccountBytes() {
                return ((DelegateStake) this.instance).getStakeAccountBytes();
            }

            public String getValidatorPubkey() {
                return ((DelegateStake) this.instance).getValidatorPubkey();
            }

            public ByteString getValidatorPubkeyBytes() {
                return ((DelegateStake) this.instance).getValidatorPubkeyBytes();
            }

            public long getValue() {
                return ((DelegateStake) this.instance).getValue();
            }

            public Builder setStakeAccount(String str) {
                copyOnWrite();
                ((DelegateStake) this.instance).setStakeAccount(str);
                return this;
            }

            public Builder setStakeAccountBytes(ByteString byteString) {
                copyOnWrite();
                ((DelegateStake) this.instance).setStakeAccountBytes(byteString);
                return this;
            }

            public Builder setValidatorPubkey(String str) {
                copyOnWrite();
                ((DelegateStake) this.instance).setValidatorPubkey(str);
                return this;
            }

            public Builder setValidatorPubkeyBytes(ByteString byteString) {
                copyOnWrite();
                ((DelegateStake) this.instance).setValidatorPubkeyBytes(byteString);
                return this;
            }

            public Builder setValue(long j) {
                copyOnWrite();
                ((DelegateStake) this.instance).setValue(j);
                return this;
            }

            private Builder() {
                super(DelegateStake.DEFAULT_INSTANCE);
            }
        }

        static {
            DelegateStake delegateStake = new DelegateStake();
            DEFAULT_INSTANCE = delegateStake;
            GeneratedMessageLite.registerDefaultInstance(DelegateStake.class, delegateStake);
        }

        private DelegateStake() {
        }

        /* access modifiers changed from: private */
        public void clearStakeAccount() {
            this.stakeAccount_ = getDefaultInstance().getStakeAccount();
        }

        /* access modifiers changed from: private */
        public void clearValidatorPubkey() {
            this.validatorPubkey_ = getDefaultInstance().getValidatorPubkey();
        }

        /* access modifiers changed from: private */
        public void clearValue() {
            this.value_ = 0;
        }

        public static DelegateStake getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static DelegateStake parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DelegateStake) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DelegateStake parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DelegateStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<DelegateStake> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setStakeAccount(String str) {
            str.getClass();
            this.stakeAccount_ = str;
        }

        /* access modifiers changed from: private */
        public void setStakeAccountBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.stakeAccount_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setValidatorPubkey(String str) {
            str.getClass();
            this.validatorPubkey_ = str;
        }

        /* access modifiers changed from: private */
        public void setValidatorPubkeyBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.validatorPubkey_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setValue(long j) {
            this.value_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97631.f46578xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new DelegateStake();
                case 2:
                    return new Builder((C97631) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0003\u0003Ȉ", new Object[]{"validatorPubkey_", "value_", "stakeAccount_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<DelegateStake> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (DelegateStake.class) {
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

        public String getStakeAccount() {
            return this.stakeAccount_;
        }

        public ByteString getStakeAccountBytes() {
            return ByteString.copyFromUtf8(this.stakeAccount_);
        }

        public String getValidatorPubkey() {
            return this.validatorPubkey_;
        }

        public ByteString getValidatorPubkeyBytes() {
            return ByteString.copyFromUtf8(this.validatorPubkey_);
        }

        public long getValue() {
            return this.value_;
        }

        public static Builder newBuilder(DelegateStake delegateStake) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(delegateStake);
        }

        public static DelegateStake parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (DelegateStake) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static DelegateStake parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (DelegateStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static DelegateStake parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DelegateStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DelegateStake parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (DelegateStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static DelegateStake parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DelegateStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DelegateStake parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (DelegateStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static DelegateStake parseFrom(InputStream inputStream) throws IOException {
            return (DelegateStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DelegateStake parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (DelegateStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static DelegateStake parseFrom(C4969g gVar) throws IOException {
            return (DelegateStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static DelegateStake parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (DelegateStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface DelegateStakeOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getStakeAccount();

        ByteString getStakeAccountBytes();

        String getValidatorPubkey();

        ByteString getValidatorPubkeyBytes();

        long getValue();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SigningInput extends GeneratedMessageLite<SigningInput, Builder> implements SigningInputOrBuilder {
        public static final int CREATE_AND_TRANSFER_TOKEN_TRANSACTION_FIELD_NUMBER = 11;
        public static final int CREATE_TOKEN_ACCOUNT_TRANSACTION_FIELD_NUMBER = 9;
        public static final int DEACTIVATE_ALL_STAKE_TRANSACTION_FIELD_NUMBER = 6;
        public static final int DEACTIVATE_STAKE_TRANSACTION_FIELD_NUMBER = 5;
        /* access modifiers changed from: private */
        public static final SigningInput DEFAULT_INSTANCE;
        public static final int DELEGATE_STAKE_TRANSACTION_FIELD_NUMBER = 4;
        private static volatile im4<SigningInput> PARSER = null;
        public static final int PRIVATE_KEY_FIELD_NUMBER = 1;
        public static final int RECENT_BLOCKHASH_FIELD_NUMBER = 2;
        public static final int TOKEN_TRANSFER_TRANSACTION_FIELD_NUMBER = 10;
        public static final int TRANSFER_TRANSACTION_FIELD_NUMBER = 3;
        public static final int WITHDRAW_ALL_TRANSACTION_FIELD_NUMBER = 8;
        public static final int WITHDRAW_TRANSACTION_FIELD_NUMBER = 7;
        private ByteString privateKey_ = ByteString.EMPTY;
        private String recentBlockhash_ = "";
        private int transactionTypeCase_ = 0;
        private Object transactionType_;

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningInput, Builder> implements SigningInputOrBuilder {
            public /* synthetic */ Builder(C97631 r1) {
                this();
            }

            public Builder clearCreateAndTransferTokenTransaction() {
                copyOnWrite();
                ((SigningInput) this.instance).clearCreateAndTransferTokenTransaction();
                return this;
            }

            public Builder clearCreateTokenAccountTransaction() {
                copyOnWrite();
                ((SigningInput) this.instance).clearCreateTokenAccountTransaction();
                return this;
            }

            public Builder clearDeactivateAllStakeTransaction() {
                copyOnWrite();
                ((SigningInput) this.instance).clearDeactivateAllStakeTransaction();
                return this;
            }

            public Builder clearDeactivateStakeTransaction() {
                copyOnWrite();
                ((SigningInput) this.instance).clearDeactivateStakeTransaction();
                return this;
            }

            public Builder clearDelegateStakeTransaction() {
                copyOnWrite();
                ((SigningInput) this.instance).clearDelegateStakeTransaction();
                return this;
            }

            public Builder clearPrivateKey() {
                copyOnWrite();
                ((SigningInput) this.instance).clearPrivateKey();
                return this;
            }

            public Builder clearRecentBlockhash() {
                copyOnWrite();
                ((SigningInput) this.instance).clearRecentBlockhash();
                return this;
            }

            public Builder clearTokenTransferTransaction() {
                copyOnWrite();
                ((SigningInput) this.instance).clearTokenTransferTransaction();
                return this;
            }

            public Builder clearTransactionType() {
                copyOnWrite();
                ((SigningInput) this.instance).clearTransactionType();
                return this;
            }

            public Builder clearTransferTransaction() {
                copyOnWrite();
                ((SigningInput) this.instance).clearTransferTransaction();
                return this;
            }

            public Builder clearWithdrawAllTransaction() {
                copyOnWrite();
                ((SigningInput) this.instance).clearWithdrawAllTransaction();
                return this;
            }

            public Builder clearWithdrawTransaction() {
                copyOnWrite();
                ((SigningInput) this.instance).clearWithdrawTransaction();
                return this;
            }

            public CreateAndTransferToken getCreateAndTransferTokenTransaction() {
                return ((SigningInput) this.instance).getCreateAndTransferTokenTransaction();
            }

            public CreateTokenAccount getCreateTokenAccountTransaction() {
                return ((SigningInput) this.instance).getCreateTokenAccountTransaction();
            }

            public DeactivateAllStake getDeactivateAllStakeTransaction() {
                return ((SigningInput) this.instance).getDeactivateAllStakeTransaction();
            }

            public DeactivateStake getDeactivateStakeTransaction() {
                return ((SigningInput) this.instance).getDeactivateStakeTransaction();
            }

            public DelegateStake getDelegateStakeTransaction() {
                return ((SigningInput) this.instance).getDelegateStakeTransaction();
            }

            public ByteString getPrivateKey() {
                return ((SigningInput) this.instance).getPrivateKey();
            }

            public String getRecentBlockhash() {
                return ((SigningInput) this.instance).getRecentBlockhash();
            }

            public ByteString getRecentBlockhashBytes() {
                return ((SigningInput) this.instance).getRecentBlockhashBytes();
            }

            public TokenTransfer getTokenTransferTransaction() {
                return ((SigningInput) this.instance).getTokenTransferTransaction();
            }

            public TransactionTypeCase getTransactionTypeCase() {
                return ((SigningInput) this.instance).getTransactionTypeCase();
            }

            public Transfer getTransferTransaction() {
                return ((SigningInput) this.instance).getTransferTransaction();
            }

            public WithdrawAllStake getWithdrawAllTransaction() {
                return ((SigningInput) this.instance).getWithdrawAllTransaction();
            }

            public WithdrawStake getWithdrawTransaction() {
                return ((SigningInput) this.instance).getWithdrawTransaction();
            }

            public boolean hasCreateAndTransferTokenTransaction() {
                return ((SigningInput) this.instance).hasCreateAndTransferTokenTransaction();
            }

            public boolean hasCreateTokenAccountTransaction() {
                return ((SigningInput) this.instance).hasCreateTokenAccountTransaction();
            }

            public boolean hasDeactivateAllStakeTransaction() {
                return ((SigningInput) this.instance).hasDeactivateAllStakeTransaction();
            }

            public boolean hasDeactivateStakeTransaction() {
                return ((SigningInput) this.instance).hasDeactivateStakeTransaction();
            }

            public boolean hasDelegateStakeTransaction() {
                return ((SigningInput) this.instance).hasDelegateStakeTransaction();
            }

            public boolean hasTokenTransferTransaction() {
                return ((SigningInput) this.instance).hasTokenTransferTransaction();
            }

            public boolean hasTransferTransaction() {
                return ((SigningInput) this.instance).hasTransferTransaction();
            }

            public boolean hasWithdrawAllTransaction() {
                return ((SigningInput) this.instance).hasWithdrawAllTransaction();
            }

            public boolean hasWithdrawTransaction() {
                return ((SigningInput) this.instance).hasWithdrawTransaction();
            }

            public Builder mergeCreateAndTransferTokenTransaction(CreateAndTransferToken createAndTransferToken) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeCreateAndTransferTokenTransaction(createAndTransferToken);
                return this;
            }

            public Builder mergeCreateTokenAccountTransaction(CreateTokenAccount createTokenAccount) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeCreateTokenAccountTransaction(createTokenAccount);
                return this;
            }

            public Builder mergeDeactivateAllStakeTransaction(DeactivateAllStake deactivateAllStake) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeDeactivateAllStakeTransaction(deactivateAllStake);
                return this;
            }

            public Builder mergeDeactivateStakeTransaction(DeactivateStake deactivateStake) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeDeactivateStakeTransaction(deactivateStake);
                return this;
            }

            public Builder mergeDelegateStakeTransaction(DelegateStake delegateStake) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeDelegateStakeTransaction(delegateStake);
                return this;
            }

            public Builder mergeTokenTransferTransaction(TokenTransfer tokenTransfer) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeTokenTransferTransaction(tokenTransfer);
                return this;
            }

            public Builder mergeTransferTransaction(Transfer transfer) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeTransferTransaction(transfer);
                return this;
            }

            public Builder mergeWithdrawAllTransaction(WithdrawAllStake withdrawAllStake) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeWithdrawAllTransaction(withdrawAllStake);
                return this;
            }

            public Builder mergeWithdrawTransaction(WithdrawStake withdrawStake) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeWithdrawTransaction(withdrawStake);
                return this;
            }

            public Builder setCreateAndTransferTokenTransaction(CreateAndTransferToken createAndTransferToken) {
                copyOnWrite();
                ((SigningInput) this.instance).setCreateAndTransferTokenTransaction(createAndTransferToken);
                return this;
            }

            public Builder setCreateTokenAccountTransaction(CreateTokenAccount createTokenAccount) {
                copyOnWrite();
                ((SigningInput) this.instance).setCreateTokenAccountTransaction(createTokenAccount);
                return this;
            }

            public Builder setDeactivateAllStakeTransaction(DeactivateAllStake deactivateAllStake) {
                copyOnWrite();
                ((SigningInput) this.instance).setDeactivateAllStakeTransaction(deactivateAllStake);
                return this;
            }

            public Builder setDeactivateStakeTransaction(DeactivateStake deactivateStake) {
                copyOnWrite();
                ((SigningInput) this.instance).setDeactivateStakeTransaction(deactivateStake);
                return this;
            }

            public Builder setDelegateStakeTransaction(DelegateStake delegateStake) {
                copyOnWrite();
                ((SigningInput) this.instance).setDelegateStakeTransaction(delegateStake);
                return this;
            }

            public Builder setPrivateKey(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setPrivateKey(byteString);
                return this;
            }

            public Builder setRecentBlockhash(String str) {
                copyOnWrite();
                ((SigningInput) this.instance).setRecentBlockhash(str);
                return this;
            }

            public Builder setRecentBlockhashBytes(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setRecentBlockhashBytes(byteString);
                return this;
            }

            public Builder setTokenTransferTransaction(TokenTransfer tokenTransfer) {
                copyOnWrite();
                ((SigningInput) this.instance).setTokenTransferTransaction(tokenTransfer);
                return this;
            }

            public Builder setTransferTransaction(Transfer transfer) {
                copyOnWrite();
                ((SigningInput) this.instance).setTransferTransaction(transfer);
                return this;
            }

            public Builder setWithdrawAllTransaction(WithdrawAllStake withdrawAllStake) {
                copyOnWrite();
                ((SigningInput) this.instance).setWithdrawAllTransaction(withdrawAllStake);
                return this;
            }

            public Builder setWithdrawTransaction(WithdrawStake withdrawStake) {
                copyOnWrite();
                ((SigningInput) this.instance).setWithdrawTransaction(withdrawStake);
                return this;
            }

            private Builder() {
                super(SigningInput.DEFAULT_INSTANCE);
            }

            public Builder setCreateAndTransferTokenTransaction(CreateAndTransferToken.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setCreateAndTransferTokenTransaction((CreateAndTransferToken) builder.build());
                return this;
            }

            public Builder setCreateTokenAccountTransaction(CreateTokenAccount.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setCreateTokenAccountTransaction((CreateTokenAccount) builder.build());
                return this;
            }

            public Builder setDeactivateAllStakeTransaction(DeactivateAllStake.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setDeactivateAllStakeTransaction((DeactivateAllStake) builder.build());
                return this;
            }

            public Builder setDeactivateStakeTransaction(DeactivateStake.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setDeactivateStakeTransaction((DeactivateStake) builder.build());
                return this;
            }

            public Builder setDelegateStakeTransaction(DelegateStake.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setDelegateStakeTransaction((DelegateStake) builder.build());
                return this;
            }

            public Builder setTokenTransferTransaction(TokenTransfer.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setTokenTransferTransaction((TokenTransfer) builder.build());
                return this;
            }

            public Builder setTransferTransaction(Transfer.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setTransferTransaction((Transfer) builder.build());
                return this;
            }

            public Builder setWithdrawAllTransaction(WithdrawAllStake.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setWithdrawAllTransaction((WithdrawAllStake) builder.build());
                return this;
            }

            public Builder setWithdrawTransaction(WithdrawStake.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setWithdrawTransaction((WithdrawStake) builder.build());
                return this;
            }
        }

        public enum TransactionTypeCase {
            TRANSFER_TRANSACTION(3),
            DELEGATE_STAKE_TRANSACTION(4),
            DEACTIVATE_STAKE_TRANSACTION(5),
            DEACTIVATE_ALL_STAKE_TRANSACTION(6),
            WITHDRAW_TRANSACTION(7),
            WITHDRAW_ALL_TRANSACTION(8),
            CREATE_TOKEN_ACCOUNT_TRANSACTION(9),
            TOKEN_TRANSFER_TRANSACTION(10),
            CREATE_AND_TRANSFER_TOKEN_TRANSACTION(11),
            TRANSACTIONTYPE_NOT_SET(0);
            
            private final int value;

            private TransactionTypeCase(int i) {
                this.value = i;
            }

            public static TransactionTypeCase forNumber(int i) {
                if (i == 0) {
                    return TRANSACTIONTYPE_NOT_SET;
                }
                switch (i) {
                    case 3:
                        return TRANSFER_TRANSACTION;
                    case 4:
                        return DELEGATE_STAKE_TRANSACTION;
                    case 5:
                        return DEACTIVATE_STAKE_TRANSACTION;
                    case 6:
                        return DEACTIVATE_ALL_STAKE_TRANSACTION;
                    case 7:
                        return WITHDRAW_TRANSACTION;
                    case 8:
                        return WITHDRAW_ALL_TRANSACTION;
                    case 9:
                        return CREATE_TOKEN_ACCOUNT_TRANSACTION;
                    case 10:
                        return TOKEN_TRANSFER_TRANSACTION;
                    case 11:
                        return CREATE_AND_TRANSFER_TOKEN_TRANSACTION;
                    default:
                        return null;
                }
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static TransactionTypeCase valueOf(int i) {
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
        public void clearCreateAndTransferTokenTransaction() {
            if (this.transactionTypeCase_ == 11) {
                this.transactionTypeCase_ = 0;
                this.transactionType_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearCreateTokenAccountTransaction() {
            if (this.transactionTypeCase_ == 9) {
                this.transactionTypeCase_ = 0;
                this.transactionType_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearDeactivateAllStakeTransaction() {
            if (this.transactionTypeCase_ == 6) {
                this.transactionTypeCase_ = 0;
                this.transactionType_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearDeactivateStakeTransaction() {
            if (this.transactionTypeCase_ == 5) {
                this.transactionTypeCase_ = 0;
                this.transactionType_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearDelegateStakeTransaction() {
            if (this.transactionTypeCase_ == 4) {
                this.transactionTypeCase_ = 0;
                this.transactionType_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearPrivateKey() {
            this.privateKey_ = getDefaultInstance().getPrivateKey();
        }

        /* access modifiers changed from: private */
        public void clearRecentBlockhash() {
            this.recentBlockhash_ = getDefaultInstance().getRecentBlockhash();
        }

        /* access modifiers changed from: private */
        public void clearTokenTransferTransaction() {
            if (this.transactionTypeCase_ == 10) {
                this.transactionTypeCase_ = 0;
                this.transactionType_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearTransactionType() {
            this.transactionTypeCase_ = 0;
            this.transactionType_ = null;
        }

        /* access modifiers changed from: private */
        public void clearTransferTransaction() {
            if (this.transactionTypeCase_ == 3) {
                this.transactionTypeCase_ = 0;
                this.transactionType_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearWithdrawAllTransaction() {
            if (this.transactionTypeCase_ == 8) {
                this.transactionTypeCase_ = 0;
                this.transactionType_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearWithdrawTransaction() {
            if (this.transactionTypeCase_ == 7) {
                this.transactionTypeCase_ = 0;
                this.transactionType_ = null;
            }
        }

        public static SigningInput getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeCreateAndTransferTokenTransaction(CreateAndTransferToken createAndTransferToken) {
            createAndTransferToken.getClass();
            if (this.transactionTypeCase_ != 11 || this.transactionType_ == CreateAndTransferToken.getDefaultInstance()) {
                this.transactionType_ = createAndTransferToken;
            } else {
                this.transactionType_ = ((CreateAndTransferToken.Builder) CreateAndTransferToken.newBuilder((CreateAndTransferToken) this.transactionType_).mergeFrom(createAndTransferToken)).buildPartial();
            }
            this.transactionTypeCase_ = 11;
        }

        /* access modifiers changed from: private */
        public void mergeCreateTokenAccountTransaction(CreateTokenAccount createTokenAccount) {
            createTokenAccount.getClass();
            if (this.transactionTypeCase_ != 9 || this.transactionType_ == CreateTokenAccount.getDefaultInstance()) {
                this.transactionType_ = createTokenAccount;
            } else {
                this.transactionType_ = ((CreateTokenAccount.Builder) CreateTokenAccount.newBuilder((CreateTokenAccount) this.transactionType_).mergeFrom(createTokenAccount)).buildPartial();
            }
            this.transactionTypeCase_ = 9;
        }

        /* access modifiers changed from: private */
        public void mergeDeactivateAllStakeTransaction(DeactivateAllStake deactivateAllStake) {
            deactivateAllStake.getClass();
            if (this.transactionTypeCase_ != 6 || this.transactionType_ == DeactivateAllStake.getDefaultInstance()) {
                this.transactionType_ = deactivateAllStake;
            } else {
                this.transactionType_ = ((DeactivateAllStake.Builder) DeactivateAllStake.newBuilder((DeactivateAllStake) this.transactionType_).mergeFrom(deactivateAllStake)).buildPartial();
            }
            this.transactionTypeCase_ = 6;
        }

        /* access modifiers changed from: private */
        public void mergeDeactivateStakeTransaction(DeactivateStake deactivateStake) {
            deactivateStake.getClass();
            if (this.transactionTypeCase_ != 5 || this.transactionType_ == DeactivateStake.getDefaultInstance()) {
                this.transactionType_ = deactivateStake;
            } else {
                this.transactionType_ = ((DeactivateStake.Builder) DeactivateStake.newBuilder((DeactivateStake) this.transactionType_).mergeFrom(deactivateStake)).buildPartial();
            }
            this.transactionTypeCase_ = 5;
        }

        /* access modifiers changed from: private */
        public void mergeDelegateStakeTransaction(DelegateStake delegateStake) {
            delegateStake.getClass();
            if (this.transactionTypeCase_ != 4 || this.transactionType_ == DelegateStake.getDefaultInstance()) {
                this.transactionType_ = delegateStake;
            } else {
                this.transactionType_ = ((DelegateStake.Builder) DelegateStake.newBuilder((DelegateStake) this.transactionType_).mergeFrom(delegateStake)).buildPartial();
            }
            this.transactionTypeCase_ = 4;
        }

        /* access modifiers changed from: private */
        public void mergeTokenTransferTransaction(TokenTransfer tokenTransfer) {
            tokenTransfer.getClass();
            if (this.transactionTypeCase_ != 10 || this.transactionType_ == TokenTransfer.getDefaultInstance()) {
                this.transactionType_ = tokenTransfer;
            } else {
                this.transactionType_ = ((TokenTransfer.Builder) TokenTransfer.newBuilder((TokenTransfer) this.transactionType_).mergeFrom(tokenTransfer)).buildPartial();
            }
            this.transactionTypeCase_ = 10;
        }

        /* access modifiers changed from: private */
        public void mergeTransferTransaction(Transfer transfer) {
            transfer.getClass();
            if (this.transactionTypeCase_ != 3 || this.transactionType_ == Transfer.getDefaultInstance()) {
                this.transactionType_ = transfer;
            } else {
                this.transactionType_ = ((Transfer.Builder) Transfer.newBuilder((Transfer) this.transactionType_).mergeFrom(transfer)).buildPartial();
            }
            this.transactionTypeCase_ = 3;
        }

        /* access modifiers changed from: private */
        public void mergeWithdrawAllTransaction(WithdrawAllStake withdrawAllStake) {
            withdrawAllStake.getClass();
            if (this.transactionTypeCase_ != 8 || this.transactionType_ == WithdrawAllStake.getDefaultInstance()) {
                this.transactionType_ = withdrawAllStake;
            } else {
                this.transactionType_ = ((WithdrawAllStake.Builder) WithdrawAllStake.newBuilder((WithdrawAllStake) this.transactionType_).mergeFrom(withdrawAllStake)).buildPartial();
            }
            this.transactionTypeCase_ = 8;
        }

        /* access modifiers changed from: private */
        public void mergeWithdrawTransaction(WithdrawStake withdrawStake) {
            withdrawStake.getClass();
            if (this.transactionTypeCase_ != 7 || this.transactionType_ == WithdrawStake.getDefaultInstance()) {
                this.transactionType_ = withdrawStake;
            } else {
                this.transactionType_ = ((WithdrawStake.Builder) WithdrawStake.newBuilder((WithdrawStake) this.transactionType_).mergeFrom(withdrawStake)).buildPartial();
            }
            this.transactionTypeCase_ = 7;
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
        public void setCreateAndTransferTokenTransaction(CreateAndTransferToken createAndTransferToken) {
            createAndTransferToken.getClass();
            this.transactionType_ = createAndTransferToken;
            this.transactionTypeCase_ = 11;
        }

        /* access modifiers changed from: private */
        public void setCreateTokenAccountTransaction(CreateTokenAccount createTokenAccount) {
            createTokenAccount.getClass();
            this.transactionType_ = createTokenAccount;
            this.transactionTypeCase_ = 9;
        }

        /* access modifiers changed from: private */
        public void setDeactivateAllStakeTransaction(DeactivateAllStake deactivateAllStake) {
            deactivateAllStake.getClass();
            this.transactionType_ = deactivateAllStake;
            this.transactionTypeCase_ = 6;
        }

        /* access modifiers changed from: private */
        public void setDeactivateStakeTransaction(DeactivateStake deactivateStake) {
            deactivateStake.getClass();
            this.transactionType_ = deactivateStake;
            this.transactionTypeCase_ = 5;
        }

        /* access modifiers changed from: private */
        public void setDelegateStakeTransaction(DelegateStake delegateStake) {
            delegateStake.getClass();
            this.transactionType_ = delegateStake;
            this.transactionTypeCase_ = 4;
        }

        /* access modifiers changed from: private */
        public void setPrivateKey(ByteString byteString) {
            byteString.getClass();
            this.privateKey_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setRecentBlockhash(String str) {
            str.getClass();
            this.recentBlockhash_ = str;
        }

        /* access modifiers changed from: private */
        public void setRecentBlockhashBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.recentBlockhash_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setTokenTransferTransaction(TokenTransfer tokenTransfer) {
            tokenTransfer.getClass();
            this.transactionType_ = tokenTransfer;
            this.transactionTypeCase_ = 10;
        }

        /* access modifiers changed from: private */
        public void setTransferTransaction(Transfer transfer) {
            transfer.getClass();
            this.transactionType_ = transfer;
            this.transactionTypeCase_ = 3;
        }

        /* access modifiers changed from: private */
        public void setWithdrawAllTransaction(WithdrawAllStake withdrawAllStake) {
            withdrawAllStake.getClass();
            this.transactionType_ = withdrawAllStake;
            this.transactionTypeCase_ = 8;
        }

        /* access modifiers changed from: private */
        public void setWithdrawTransaction(WithdrawStake withdrawStake) {
            withdrawStake.getClass();
            this.transactionType_ = withdrawStake;
            this.transactionTypeCase_ = 7;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97631.f46578xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningInput();
                case 2:
                    return new Builder((C97631) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0001\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000", new Object[]{"transactionType_", "transactionTypeCase_", "privateKey_", "recentBlockhash_", Transfer.class, DelegateStake.class, DeactivateStake.class, DeactivateAllStake.class, WithdrawStake.class, WithdrawAllStake.class, CreateTokenAccount.class, TokenTransfer.class, CreateAndTransferToken.class});
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

        public CreateAndTransferToken getCreateAndTransferTokenTransaction() {
            if (this.transactionTypeCase_ == 11) {
                return (CreateAndTransferToken) this.transactionType_;
            }
            return CreateAndTransferToken.getDefaultInstance();
        }

        public CreateTokenAccount getCreateTokenAccountTransaction() {
            if (this.transactionTypeCase_ == 9) {
                return (CreateTokenAccount) this.transactionType_;
            }
            return CreateTokenAccount.getDefaultInstance();
        }

        public DeactivateAllStake getDeactivateAllStakeTransaction() {
            if (this.transactionTypeCase_ == 6) {
                return (DeactivateAllStake) this.transactionType_;
            }
            return DeactivateAllStake.getDefaultInstance();
        }

        public DeactivateStake getDeactivateStakeTransaction() {
            if (this.transactionTypeCase_ == 5) {
                return (DeactivateStake) this.transactionType_;
            }
            return DeactivateStake.getDefaultInstance();
        }

        public DelegateStake getDelegateStakeTransaction() {
            if (this.transactionTypeCase_ == 4) {
                return (DelegateStake) this.transactionType_;
            }
            return DelegateStake.getDefaultInstance();
        }

        public ByteString getPrivateKey() {
            return this.privateKey_;
        }

        public String getRecentBlockhash() {
            return this.recentBlockhash_;
        }

        public ByteString getRecentBlockhashBytes() {
            return ByteString.copyFromUtf8(this.recentBlockhash_);
        }

        public TokenTransfer getTokenTransferTransaction() {
            if (this.transactionTypeCase_ == 10) {
                return (TokenTransfer) this.transactionType_;
            }
            return TokenTransfer.getDefaultInstance();
        }

        public TransactionTypeCase getTransactionTypeCase() {
            return TransactionTypeCase.forNumber(this.transactionTypeCase_);
        }

        public Transfer getTransferTransaction() {
            if (this.transactionTypeCase_ == 3) {
                return (Transfer) this.transactionType_;
            }
            return Transfer.getDefaultInstance();
        }

        public WithdrawAllStake getWithdrawAllTransaction() {
            if (this.transactionTypeCase_ == 8) {
                return (WithdrawAllStake) this.transactionType_;
            }
            return WithdrawAllStake.getDefaultInstance();
        }

        public WithdrawStake getWithdrawTransaction() {
            if (this.transactionTypeCase_ == 7) {
                return (WithdrawStake) this.transactionType_;
            }
            return WithdrawStake.getDefaultInstance();
        }

        public boolean hasCreateAndTransferTokenTransaction() {
            if (this.transactionTypeCase_ == 11) {
                return true;
            }
            return false;
        }

        public boolean hasCreateTokenAccountTransaction() {
            if (this.transactionTypeCase_ == 9) {
                return true;
            }
            return false;
        }

        public boolean hasDeactivateAllStakeTransaction() {
            if (this.transactionTypeCase_ == 6) {
                return true;
            }
            return false;
        }

        public boolean hasDeactivateStakeTransaction() {
            if (this.transactionTypeCase_ == 5) {
                return true;
            }
            return false;
        }

        public boolean hasDelegateStakeTransaction() {
            if (this.transactionTypeCase_ == 4) {
                return true;
            }
            return false;
        }

        public boolean hasTokenTransferTransaction() {
            if (this.transactionTypeCase_ == 10) {
                return true;
            }
            return false;
        }

        public boolean hasTransferTransaction() {
            if (this.transactionTypeCase_ == 3) {
                return true;
            }
            return false;
        }

        public boolean hasWithdrawAllTransaction() {
            if (this.transactionTypeCase_ == 8) {
                return true;
            }
            return false;
        }

        public boolean hasWithdrawTransaction() {
            if (this.transactionTypeCase_ == 7) {
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
        CreateAndTransferToken getCreateAndTransferTokenTransaction();

        CreateTokenAccount getCreateTokenAccountTransaction();

        DeactivateAllStake getDeactivateAllStakeTransaction();

        DeactivateStake getDeactivateStakeTransaction();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        DelegateStake getDelegateStakeTransaction();

        ByteString getPrivateKey();

        String getRecentBlockhash();

        ByteString getRecentBlockhashBytes();

        TokenTransfer getTokenTransferTransaction();

        SigningInput.TransactionTypeCase getTransactionTypeCase();

        Transfer getTransferTransaction();

        WithdrawAllStake getWithdrawAllTransaction();

        WithdrawStake getWithdrawTransaction();

        boolean hasCreateAndTransferTokenTransaction();

        boolean hasCreateTokenAccountTransaction();

        boolean hasDeactivateAllStakeTransaction();

        boolean hasDeactivateStakeTransaction();

        boolean hasDelegateStakeTransaction();

        boolean hasTokenTransferTransaction();

        boolean hasTransferTransaction();

        boolean hasWithdrawAllTransaction();

        boolean hasWithdrawTransaction();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SigningOutput extends GeneratedMessageLite<SigningOutput, Builder> implements SigningOutputOrBuilder {
        /* access modifiers changed from: private */
        public static final SigningOutput DEFAULT_INSTANCE;
        public static final int ENCODED_FIELD_NUMBER = 1;
        private static volatile im4<SigningOutput> PARSER = null;
        public static final int UNSIGNED_TX_FIELD_NUMBER = 2;
        private String encoded_ = "";
        private String unsignedTx_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningOutput, Builder> implements SigningOutputOrBuilder {
            public /* synthetic */ Builder(C97631 r1) {
                this();
            }

            public Builder clearEncoded() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearEncoded();
                return this;
            }

            public Builder clearUnsignedTx() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearUnsignedTx();
                return this;
            }

            public String getEncoded() {
                return ((SigningOutput) this.instance).getEncoded();
            }

            public ByteString getEncodedBytes() {
                return ((SigningOutput) this.instance).getEncodedBytes();
            }

            public String getUnsignedTx() {
                return ((SigningOutput) this.instance).getUnsignedTx();
            }

            public ByteString getUnsignedTxBytes() {
                return ((SigningOutput) this.instance).getUnsignedTxBytes();
            }

            public Builder setEncoded(String str) {
                copyOnWrite();
                ((SigningOutput) this.instance).setEncoded(str);
                return this;
            }

            public Builder setEncodedBytes(ByteString byteString) {
                copyOnWrite();
                ((SigningOutput) this.instance).setEncodedBytes(byteString);
                return this;
            }

            public Builder setUnsignedTx(String str) {
                copyOnWrite();
                ((SigningOutput) this.instance).setUnsignedTx(str);
                return this;
            }

            public Builder setUnsignedTxBytes(ByteString byteString) {
                copyOnWrite();
                ((SigningOutput) this.instance).setUnsignedTxBytes(byteString);
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
        public void clearUnsignedTx() {
            this.unsignedTx_ = getDefaultInstance().getUnsignedTx();
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
        public void setEncoded(String str) {
            str.getClass();
            this.encoded_ = str;
        }

        /* access modifiers changed from: private */
        public void setEncodedBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.encoded_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setUnsignedTx(String str) {
            str.getClass();
            this.unsignedTx_ = str;
        }

        /* access modifiers changed from: private */
        public void setUnsignedTxBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.unsignedTx_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97631.f46578xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningOutput();
                case 2:
                    return new Builder((C97631) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"encoded_", "unsignedTx_"});
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

        public String getEncoded() {
            return this.encoded_;
        }

        public ByteString getEncodedBytes() {
            return ByteString.copyFromUtf8(this.encoded_);
        }

        public String getUnsignedTx() {
            return this.unsignedTx_;
        }

        public ByteString getUnsignedTxBytes() {
            return ByteString.copyFromUtf8(this.unsignedTx_);
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

        String getEncoded();

        ByteString getEncodedBytes();

        String getUnsignedTx();

        ByteString getUnsignedTxBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class StakeAccountValue extends GeneratedMessageLite<StakeAccountValue, Builder> implements StakeAccountValueOrBuilder {
        /* access modifiers changed from: private */
        public static final StakeAccountValue DEFAULT_INSTANCE;
        private static volatile im4<StakeAccountValue> PARSER = null;
        public static final int STAKE_ACCOUNT_FIELD_NUMBER = 1;
        public static final int VALUE_FIELD_NUMBER = 2;
        private String stakeAccount_ = "";
        private long value_;

        public static final class Builder extends GeneratedMessageLite.C4930a<StakeAccountValue, Builder> implements StakeAccountValueOrBuilder {
            public /* synthetic */ Builder(C97631 r1) {
                this();
            }

            public Builder clearStakeAccount() {
                copyOnWrite();
                ((StakeAccountValue) this.instance).clearStakeAccount();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((StakeAccountValue) this.instance).clearValue();
                return this;
            }

            public String getStakeAccount() {
                return ((StakeAccountValue) this.instance).getStakeAccount();
            }

            public ByteString getStakeAccountBytes() {
                return ((StakeAccountValue) this.instance).getStakeAccountBytes();
            }

            public long getValue() {
                return ((StakeAccountValue) this.instance).getValue();
            }

            public Builder setStakeAccount(String str) {
                copyOnWrite();
                ((StakeAccountValue) this.instance).setStakeAccount(str);
                return this;
            }

            public Builder setStakeAccountBytes(ByteString byteString) {
                copyOnWrite();
                ((StakeAccountValue) this.instance).setStakeAccountBytes(byteString);
                return this;
            }

            public Builder setValue(long j) {
                copyOnWrite();
                ((StakeAccountValue) this.instance).setValue(j);
                return this;
            }

            private Builder() {
                super(StakeAccountValue.DEFAULT_INSTANCE);
            }
        }

        static {
            StakeAccountValue stakeAccountValue = new StakeAccountValue();
            DEFAULT_INSTANCE = stakeAccountValue;
            GeneratedMessageLite.registerDefaultInstance(StakeAccountValue.class, stakeAccountValue);
        }

        private StakeAccountValue() {
        }

        /* access modifiers changed from: private */
        public void clearStakeAccount() {
            this.stakeAccount_ = getDefaultInstance().getStakeAccount();
        }

        /* access modifiers changed from: private */
        public void clearValue() {
            this.value_ = 0;
        }

        public static StakeAccountValue getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static StakeAccountValue parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (StakeAccountValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StakeAccountValue parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (StakeAccountValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<StakeAccountValue> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setStakeAccount(String str) {
            str.getClass();
            this.stakeAccount_ = str;
        }

        /* access modifiers changed from: private */
        public void setStakeAccountBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.stakeAccount_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setValue(long j) {
            this.value_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97631.f46578xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new StakeAccountValue();
                case 2:
                    return new Builder((C97631) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0003", new Object[]{"stakeAccount_", "value_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<StakeAccountValue> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (StakeAccountValue.class) {
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

        public String getStakeAccount() {
            return this.stakeAccount_;
        }

        public ByteString getStakeAccountBytes() {
            return ByteString.copyFromUtf8(this.stakeAccount_);
        }

        public long getValue() {
            return this.value_;
        }

        public static Builder newBuilder(StakeAccountValue stakeAccountValue) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(stakeAccountValue);
        }

        public static StakeAccountValue parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (StakeAccountValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static StakeAccountValue parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (StakeAccountValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static StakeAccountValue parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (StakeAccountValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static StakeAccountValue parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (StakeAccountValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static StakeAccountValue parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (StakeAccountValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StakeAccountValue parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (StakeAccountValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static StakeAccountValue parseFrom(InputStream inputStream) throws IOException {
            return (StakeAccountValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StakeAccountValue parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (StakeAccountValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static StakeAccountValue parseFrom(C4969g gVar) throws IOException {
            return (StakeAccountValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static StakeAccountValue parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (StakeAccountValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface StakeAccountValueOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getStakeAccount();

        ByteString getStakeAccountBytes();

        long getValue();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TokenTransfer extends GeneratedMessageLite<TokenTransfer, Builder> implements TokenTransferOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 4;
        public static final int DECIMALS_FIELD_NUMBER = 5;
        /* access modifiers changed from: private */
        public static final TokenTransfer DEFAULT_INSTANCE;
        public static final int MEMO_FIELD_NUMBER = 6;
        private static volatile im4<TokenTransfer> PARSER = null;
        public static final int RECIPIENT_TOKEN_ADDRESS_FIELD_NUMBER = 3;
        public static final int REFERENCES_FIELD_NUMBER = 7;
        public static final int SENDER_TOKEN_ADDRESS_FIELD_NUMBER = 2;
        public static final int TOKEN_MINT_ADDRESS_FIELD_NUMBER = 1;
        private long amount_;
        private int decimals_;
        private String memo_ = "";
        private String recipientTokenAddress_ = "";
        private C5011t.C5020i<String> references_ = GeneratedMessageLite.emptyProtobufList();
        private String senderTokenAddress_ = "";
        private String tokenMintAddress_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<TokenTransfer, Builder> implements TokenTransferOrBuilder {
            public /* synthetic */ Builder(C97631 r1) {
                this();
            }

            public Builder addAllReferences(Iterable<String> iterable) {
                copyOnWrite();
                ((TokenTransfer) this.instance).addAllReferences(iterable);
                return this;
            }

            public Builder addReferences(String str) {
                copyOnWrite();
                ((TokenTransfer) this.instance).addReferences(str);
                return this;
            }

            public Builder addReferencesBytes(ByteString byteString) {
                copyOnWrite();
                ((TokenTransfer) this.instance).addReferencesBytes(byteString);
                return this;
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((TokenTransfer) this.instance).clearAmount();
                return this;
            }

            public Builder clearDecimals() {
                copyOnWrite();
                ((TokenTransfer) this.instance).clearDecimals();
                return this;
            }

            public Builder clearMemo() {
                copyOnWrite();
                ((TokenTransfer) this.instance).clearMemo();
                return this;
            }

            public Builder clearRecipientTokenAddress() {
                copyOnWrite();
                ((TokenTransfer) this.instance).clearRecipientTokenAddress();
                return this;
            }

            public Builder clearReferences() {
                copyOnWrite();
                ((TokenTransfer) this.instance).clearReferences();
                return this;
            }

            public Builder clearSenderTokenAddress() {
                copyOnWrite();
                ((TokenTransfer) this.instance).clearSenderTokenAddress();
                return this;
            }

            public Builder clearTokenMintAddress() {
                copyOnWrite();
                ((TokenTransfer) this.instance).clearTokenMintAddress();
                return this;
            }

            public long getAmount() {
                return ((TokenTransfer) this.instance).getAmount();
            }

            public int getDecimals() {
                return ((TokenTransfer) this.instance).getDecimals();
            }

            public String getMemo() {
                return ((TokenTransfer) this.instance).getMemo();
            }

            public ByteString getMemoBytes() {
                return ((TokenTransfer) this.instance).getMemoBytes();
            }

            public String getRecipientTokenAddress() {
                return ((TokenTransfer) this.instance).getRecipientTokenAddress();
            }

            public ByteString getRecipientTokenAddressBytes() {
                return ((TokenTransfer) this.instance).getRecipientTokenAddressBytes();
            }

            public String getReferences(int i) {
                return ((TokenTransfer) this.instance).getReferences(i);
            }

            public ByteString getReferencesBytes(int i) {
                return ((TokenTransfer) this.instance).getReferencesBytes(i);
            }

            public int getReferencesCount() {
                return ((TokenTransfer) this.instance).getReferencesCount();
            }

            public List<String> getReferencesList() {
                return Collections.unmodifiableList(((TokenTransfer) this.instance).getReferencesList());
            }

            public String getSenderTokenAddress() {
                return ((TokenTransfer) this.instance).getSenderTokenAddress();
            }

            public ByteString getSenderTokenAddressBytes() {
                return ((TokenTransfer) this.instance).getSenderTokenAddressBytes();
            }

            public String getTokenMintAddress() {
                return ((TokenTransfer) this.instance).getTokenMintAddress();
            }

            public ByteString getTokenMintAddressBytes() {
                return ((TokenTransfer) this.instance).getTokenMintAddressBytes();
            }

            public Builder setAmount(long j) {
                copyOnWrite();
                ((TokenTransfer) this.instance).setAmount(j);
                return this;
            }

            public Builder setDecimals(int i) {
                copyOnWrite();
                ((TokenTransfer) this.instance).setDecimals(i);
                return this;
            }

            public Builder setMemo(String str) {
                copyOnWrite();
                ((TokenTransfer) this.instance).setMemo(str);
                return this;
            }

            public Builder setMemoBytes(ByteString byteString) {
                copyOnWrite();
                ((TokenTransfer) this.instance).setMemoBytes(byteString);
                return this;
            }

            public Builder setRecipientTokenAddress(String str) {
                copyOnWrite();
                ((TokenTransfer) this.instance).setRecipientTokenAddress(str);
                return this;
            }

            public Builder setRecipientTokenAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((TokenTransfer) this.instance).setRecipientTokenAddressBytes(byteString);
                return this;
            }

            public Builder setReferences(int i, String str) {
                copyOnWrite();
                ((TokenTransfer) this.instance).setReferences(i, str);
                return this;
            }

            public Builder setSenderTokenAddress(String str) {
                copyOnWrite();
                ((TokenTransfer) this.instance).setSenderTokenAddress(str);
                return this;
            }

            public Builder setSenderTokenAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((TokenTransfer) this.instance).setSenderTokenAddressBytes(byteString);
                return this;
            }

            public Builder setTokenMintAddress(String str) {
                copyOnWrite();
                ((TokenTransfer) this.instance).setTokenMintAddress(str);
                return this;
            }

            public Builder setTokenMintAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((TokenTransfer) this.instance).setTokenMintAddressBytes(byteString);
                return this;
            }

            private Builder() {
                super(TokenTransfer.DEFAULT_INSTANCE);
            }
        }

        static {
            TokenTransfer tokenTransfer = new TokenTransfer();
            DEFAULT_INSTANCE = tokenTransfer;
            GeneratedMessageLite.registerDefaultInstance(TokenTransfer.class, tokenTransfer);
        }

        private TokenTransfer() {
        }

        /* access modifiers changed from: private */
        public void addAllReferences(Iterable<String> iterable) {
            ensureReferencesIsMutable();
            C4949a.addAll(iterable, this.references_);
        }

        /* access modifiers changed from: private */
        public void addReferences(String str) {
            str.getClass();
            ensureReferencesIsMutable();
            this.references_.add(str);
        }

        /* access modifiers changed from: private */
        public void addReferencesBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            ensureReferencesIsMutable();
            this.references_.add(byteString.toStringUtf8());
        }

        /* access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearDecimals() {
            this.decimals_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearMemo() {
            this.memo_ = getDefaultInstance().getMemo();
        }

        /* access modifiers changed from: private */
        public void clearRecipientTokenAddress() {
            this.recipientTokenAddress_ = getDefaultInstance().getRecipientTokenAddress();
        }

        /* access modifiers changed from: private */
        public void clearReferences() {
            this.references_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearSenderTokenAddress() {
            this.senderTokenAddress_ = getDefaultInstance().getSenderTokenAddress();
        }

        /* access modifiers changed from: private */
        public void clearTokenMintAddress() {
            this.tokenMintAddress_ = getDefaultInstance().getTokenMintAddress();
        }

        private void ensureReferencesIsMutable() {
            C5011t.C5020i<String> iVar = this.references_;
            if (!iVar.mo37090v()) {
                this.references_ = GeneratedMessageLite.mutableCopy(iVar);
            }
        }

        public static TokenTransfer getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TokenTransfer parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TokenTransfer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TokenTransfer parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TokenTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<TokenTransfer> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAmount(long j) {
            this.amount_ = j;
        }

        /* access modifiers changed from: private */
        public void setDecimals(int i) {
            this.decimals_ = i;
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
        public void setRecipientTokenAddress(String str) {
            str.getClass();
            this.recipientTokenAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setRecipientTokenAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.recipientTokenAddress_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setReferences(int i, String str) {
            str.getClass();
            ensureReferencesIsMutable();
            this.references_.set(i, str);
        }

        /* access modifiers changed from: private */
        public void setSenderTokenAddress(String str) {
            str.getClass();
            this.senderTokenAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setSenderTokenAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.senderTokenAddress_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setTokenMintAddress(String str) {
            str.getClass();
            this.tokenMintAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setTokenMintAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.tokenMintAddress_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97631.f46578xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TokenTransfer();
                case 2:
                    return new Builder((C97631) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0003\u0005\u000b\u0006Ȉ\u0007Ț", new Object[]{"tokenMintAddress_", "senderTokenAddress_", "recipientTokenAddress_", "amount_", "decimals_", "memo_", "references_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<TokenTransfer> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (TokenTransfer.class) {
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

        public int getDecimals() {
            return this.decimals_;
        }

        public String getMemo() {
            return this.memo_;
        }

        public ByteString getMemoBytes() {
            return ByteString.copyFromUtf8(this.memo_);
        }

        public String getRecipientTokenAddress() {
            return this.recipientTokenAddress_;
        }

        public ByteString getRecipientTokenAddressBytes() {
            return ByteString.copyFromUtf8(this.recipientTokenAddress_);
        }

        public String getReferences(int i) {
            return this.references_.get(i);
        }

        public ByteString getReferencesBytes(int i) {
            return ByteString.copyFromUtf8(this.references_.get(i));
        }

        public int getReferencesCount() {
            return this.references_.size();
        }

        public List<String> getReferencesList() {
            return this.references_;
        }

        public String getSenderTokenAddress() {
            return this.senderTokenAddress_;
        }

        public ByteString getSenderTokenAddressBytes() {
            return ByteString.copyFromUtf8(this.senderTokenAddress_);
        }

        public String getTokenMintAddress() {
            return this.tokenMintAddress_;
        }

        public ByteString getTokenMintAddressBytes() {
            return ByteString.copyFromUtf8(this.tokenMintAddress_);
        }

        public static Builder newBuilder(TokenTransfer tokenTransfer) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(tokenTransfer);
        }

        public static TokenTransfer parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TokenTransfer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TokenTransfer parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (TokenTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static TokenTransfer parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TokenTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TokenTransfer parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (TokenTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static TokenTransfer parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TokenTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TokenTransfer parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (TokenTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static TokenTransfer parseFrom(InputStream inputStream) throws IOException {
            return (TokenTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TokenTransfer parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TokenTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TokenTransfer parseFrom(C4969g gVar) throws IOException {
            return (TokenTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static TokenTransfer parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (TokenTransfer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface TokenTransferOrBuilder extends qu3 {
        long getAmount();

        int getDecimals();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getMemo();

        ByteString getMemoBytes();

        String getRecipientTokenAddress();

        ByteString getRecipientTokenAddressBytes();

        String getReferences(int i);

        ByteString getReferencesBytes(int i);

        int getReferencesCount();

        List<String> getReferencesList();

        String getSenderTokenAddress();

        ByteString getSenderTokenAddressBytes();

        String getTokenMintAddress();

        ByteString getTokenMintAddressBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class Transfer extends GeneratedMessageLite<Transfer, Builder> implements TransferOrBuilder {
        /* access modifiers changed from: private */
        public static final Transfer DEFAULT_INSTANCE;
        public static final int MEMO_FIELD_NUMBER = 3;
        private static volatile im4<Transfer> PARSER = null;
        public static final int RECIPIENT_FIELD_NUMBER = 1;
        public static final int REFERENCES_FIELD_NUMBER = 4;
        public static final int VALUE_FIELD_NUMBER = 2;
        private String memo_ = "";
        private String recipient_ = "";
        private C5011t.C5020i<String> references_ = GeneratedMessageLite.emptyProtobufList();
        private long value_;

        public static final class Builder extends GeneratedMessageLite.C4930a<Transfer, Builder> implements TransferOrBuilder {
            public /* synthetic */ Builder(C97631 r1) {
                this();
            }

            public Builder addAllReferences(Iterable<String> iterable) {
                copyOnWrite();
                ((Transfer) this.instance).addAllReferences(iterable);
                return this;
            }

            public Builder addReferences(String str) {
                copyOnWrite();
                ((Transfer) this.instance).addReferences(str);
                return this;
            }

            public Builder addReferencesBytes(ByteString byteString) {
                copyOnWrite();
                ((Transfer) this.instance).addReferencesBytes(byteString);
                return this;
            }

            public Builder clearMemo() {
                copyOnWrite();
                ((Transfer) this.instance).clearMemo();
                return this;
            }

            public Builder clearRecipient() {
                copyOnWrite();
                ((Transfer) this.instance).clearRecipient();
                return this;
            }

            public Builder clearReferences() {
                copyOnWrite();
                ((Transfer) this.instance).clearReferences();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((Transfer) this.instance).clearValue();
                return this;
            }

            public String getMemo() {
                return ((Transfer) this.instance).getMemo();
            }

            public ByteString getMemoBytes() {
                return ((Transfer) this.instance).getMemoBytes();
            }

            public String getRecipient() {
                return ((Transfer) this.instance).getRecipient();
            }

            public ByteString getRecipientBytes() {
                return ((Transfer) this.instance).getRecipientBytes();
            }

            public String getReferences(int i) {
                return ((Transfer) this.instance).getReferences(i);
            }

            public ByteString getReferencesBytes(int i) {
                return ((Transfer) this.instance).getReferencesBytes(i);
            }

            public int getReferencesCount() {
                return ((Transfer) this.instance).getReferencesCount();
            }

            public List<String> getReferencesList() {
                return Collections.unmodifiableList(((Transfer) this.instance).getReferencesList());
            }

            public long getValue() {
                return ((Transfer) this.instance).getValue();
            }

            public Builder setMemo(String str) {
                copyOnWrite();
                ((Transfer) this.instance).setMemo(str);
                return this;
            }

            public Builder setMemoBytes(ByteString byteString) {
                copyOnWrite();
                ((Transfer) this.instance).setMemoBytes(byteString);
                return this;
            }

            public Builder setRecipient(String str) {
                copyOnWrite();
                ((Transfer) this.instance).setRecipient(str);
                return this;
            }

            public Builder setRecipientBytes(ByteString byteString) {
                copyOnWrite();
                ((Transfer) this.instance).setRecipientBytes(byteString);
                return this;
            }

            public Builder setReferences(int i, String str) {
                copyOnWrite();
                ((Transfer) this.instance).setReferences(i, str);
                return this;
            }

            public Builder setValue(long j) {
                copyOnWrite();
                ((Transfer) this.instance).setValue(j);
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
        public void addAllReferences(Iterable<String> iterable) {
            ensureReferencesIsMutable();
            C4949a.addAll(iterable, this.references_);
        }

        /* access modifiers changed from: private */
        public void addReferences(String str) {
            str.getClass();
            ensureReferencesIsMutable();
            this.references_.add(str);
        }

        /* access modifiers changed from: private */
        public void addReferencesBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            ensureReferencesIsMutable();
            this.references_.add(byteString.toStringUtf8());
        }

        /* access modifiers changed from: private */
        public void clearMemo() {
            this.memo_ = getDefaultInstance().getMemo();
        }

        /* access modifiers changed from: private */
        public void clearRecipient() {
            this.recipient_ = getDefaultInstance().getRecipient();
        }

        /* access modifiers changed from: private */
        public void clearReferences() {
            this.references_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearValue() {
            this.value_ = 0;
        }

        private void ensureReferencesIsMutable() {
            C5011t.C5020i<String> iVar = this.references_;
            if (!iVar.mo37090v()) {
                this.references_ = GeneratedMessageLite.mutableCopy(iVar);
            }
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
        public void setRecipient(String str) {
            str.getClass();
            this.recipient_ = str;
        }

        /* access modifiers changed from: private */
        public void setRecipientBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.recipient_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setReferences(int i, String str) {
            str.getClass();
            ensureReferencesIsMutable();
            this.references_.set(i, str);
        }

        /* access modifiers changed from: private */
        public void setValue(long j) {
            this.value_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97631.f46578xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Transfer();
                case 2:
                    return new Builder((C97631) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\u0003\u0003Ȉ\u0004Ț", new Object[]{"recipient_", "value_", "memo_", "references_"});
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

        public String getMemo() {
            return this.memo_;
        }

        public ByteString getMemoBytes() {
            return ByteString.copyFromUtf8(this.memo_);
        }

        public String getRecipient() {
            return this.recipient_;
        }

        public ByteString getRecipientBytes() {
            return ByteString.copyFromUtf8(this.recipient_);
        }

        public String getReferences(int i) {
            return this.references_.get(i);
        }

        public ByteString getReferencesBytes(int i) {
            return ByteString.copyFromUtf8(this.references_.get(i));
        }

        public int getReferencesCount() {
            return this.references_.size();
        }

        public List<String> getReferencesList() {
            return this.references_;
        }

        public long getValue() {
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

        String getMemo();

        ByteString getMemoBytes();

        String getRecipient();

        ByteString getRecipientBytes();

        String getReferences(int i);

        ByteString getReferencesBytes(int i);

        int getReferencesCount();

        List<String> getReferencesList();

        long getValue();

        /* synthetic */ boolean isInitialized();
    }

    public static final class WithdrawAllStake extends GeneratedMessageLite<WithdrawAllStake, Builder> implements WithdrawAllStakeOrBuilder {
        /* access modifiers changed from: private */
        public static final WithdrawAllStake DEFAULT_INSTANCE;
        private static volatile im4<WithdrawAllStake> PARSER = null;
        public static final int STAKE_ACCOUNTS_FIELD_NUMBER = 1;
        private C5011t.C5020i<StakeAccountValue> stakeAccounts_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.C4930a<WithdrawAllStake, Builder> implements WithdrawAllStakeOrBuilder {
            public /* synthetic */ Builder(C97631 r1) {
                this();
            }

            public Builder addAllStakeAccounts(Iterable<? extends StakeAccountValue> iterable) {
                copyOnWrite();
                ((WithdrawAllStake) this.instance).addAllStakeAccounts(iterable);
                return this;
            }

            public Builder addStakeAccounts(StakeAccountValue stakeAccountValue) {
                copyOnWrite();
                ((WithdrawAllStake) this.instance).addStakeAccounts(stakeAccountValue);
                return this;
            }

            public Builder clearStakeAccounts() {
                copyOnWrite();
                ((WithdrawAllStake) this.instance).clearStakeAccounts();
                return this;
            }

            public StakeAccountValue getStakeAccounts(int i) {
                return ((WithdrawAllStake) this.instance).getStakeAccounts(i);
            }

            public int getStakeAccountsCount() {
                return ((WithdrawAllStake) this.instance).getStakeAccountsCount();
            }

            public List<StakeAccountValue> getStakeAccountsList() {
                return Collections.unmodifiableList(((WithdrawAllStake) this.instance).getStakeAccountsList());
            }

            public Builder removeStakeAccounts(int i) {
                copyOnWrite();
                ((WithdrawAllStake) this.instance).removeStakeAccounts(i);
                return this;
            }

            public Builder setStakeAccounts(int i, StakeAccountValue stakeAccountValue) {
                copyOnWrite();
                ((WithdrawAllStake) this.instance).setStakeAccounts(i, stakeAccountValue);
                return this;
            }

            private Builder() {
                super(WithdrawAllStake.DEFAULT_INSTANCE);
            }

            public Builder addStakeAccounts(int i, StakeAccountValue stakeAccountValue) {
                copyOnWrite();
                ((WithdrawAllStake) this.instance).addStakeAccounts(i, stakeAccountValue);
                return this;
            }

            public Builder setStakeAccounts(int i, StakeAccountValue.Builder builder) {
                copyOnWrite();
                ((WithdrawAllStake) this.instance).setStakeAccounts(i, (StakeAccountValue) builder.build());
                return this;
            }

            public Builder addStakeAccounts(StakeAccountValue.Builder builder) {
                copyOnWrite();
                ((WithdrawAllStake) this.instance).addStakeAccounts((StakeAccountValue) builder.build());
                return this;
            }

            public Builder addStakeAccounts(int i, StakeAccountValue.Builder builder) {
                copyOnWrite();
                ((WithdrawAllStake) this.instance).addStakeAccounts(i, (StakeAccountValue) builder.build());
                return this;
            }
        }

        static {
            WithdrawAllStake withdrawAllStake = new WithdrawAllStake();
            DEFAULT_INSTANCE = withdrawAllStake;
            GeneratedMessageLite.registerDefaultInstance(WithdrawAllStake.class, withdrawAllStake);
        }

        private WithdrawAllStake() {
        }

        /* access modifiers changed from: private */
        public void addAllStakeAccounts(Iterable<? extends StakeAccountValue> iterable) {
            ensureStakeAccountsIsMutable();
            C4949a.addAll(iterable, this.stakeAccounts_);
        }

        /* access modifiers changed from: private */
        public void addStakeAccounts(StakeAccountValue stakeAccountValue) {
            stakeAccountValue.getClass();
            ensureStakeAccountsIsMutable();
            this.stakeAccounts_.add(stakeAccountValue);
        }

        /* access modifiers changed from: private */
        public void clearStakeAccounts() {
            this.stakeAccounts_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureStakeAccountsIsMutable() {
            C5011t.C5020i<StakeAccountValue> iVar = this.stakeAccounts_;
            if (!iVar.mo37090v()) {
                this.stakeAccounts_ = GeneratedMessageLite.mutableCopy(iVar);
            }
        }

        public static WithdrawAllStake getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static WithdrawAllStake parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (WithdrawAllStake) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WithdrawAllStake parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (WithdrawAllStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<WithdrawAllStake> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeStakeAccounts(int i) {
            ensureStakeAccountsIsMutable();
            this.stakeAccounts_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setStakeAccounts(int i, StakeAccountValue stakeAccountValue) {
            stakeAccountValue.getClass();
            ensureStakeAccountsIsMutable();
            this.stakeAccounts_.set(i, stakeAccountValue);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97631.f46578xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new WithdrawAllStake();
                case 2:
                    return new Builder((C97631) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"stakeAccounts_", StakeAccountValue.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<WithdrawAllStake> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (WithdrawAllStake.class) {
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

        public StakeAccountValue getStakeAccounts(int i) {
            return this.stakeAccounts_.get(i);
        }

        public int getStakeAccountsCount() {
            return this.stakeAccounts_.size();
        }

        public List<StakeAccountValue> getStakeAccountsList() {
            return this.stakeAccounts_;
        }

        public StakeAccountValueOrBuilder getStakeAccountsOrBuilder(int i) {
            return this.stakeAccounts_.get(i);
        }

        public List<? extends StakeAccountValueOrBuilder> getStakeAccountsOrBuilderList() {
            return this.stakeAccounts_;
        }

        public static Builder newBuilder(WithdrawAllStake withdrawAllStake) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(withdrawAllStake);
        }

        public static WithdrawAllStake parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (WithdrawAllStake) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static WithdrawAllStake parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (WithdrawAllStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static WithdrawAllStake parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (WithdrawAllStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* access modifiers changed from: private */
        public void addStakeAccounts(int i, StakeAccountValue stakeAccountValue) {
            stakeAccountValue.getClass();
            ensureStakeAccountsIsMutable();
            this.stakeAccounts_.add(i, stakeAccountValue);
        }

        public static WithdrawAllStake parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (WithdrawAllStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static WithdrawAllStake parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (WithdrawAllStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static WithdrawAllStake parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (WithdrawAllStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static WithdrawAllStake parseFrom(InputStream inputStream) throws IOException {
            return (WithdrawAllStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WithdrawAllStake parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (WithdrawAllStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static WithdrawAllStake parseFrom(C4969g gVar) throws IOException {
            return (WithdrawAllStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static WithdrawAllStake parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (WithdrawAllStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface WithdrawAllStakeOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        StakeAccountValue getStakeAccounts(int i);

        int getStakeAccountsCount();

        List<StakeAccountValue> getStakeAccountsList();

        /* synthetic */ boolean isInitialized();
    }

    public static final class WithdrawStake extends GeneratedMessageLite<WithdrawStake, Builder> implements WithdrawStakeOrBuilder {
        /* access modifiers changed from: private */
        public static final WithdrawStake DEFAULT_INSTANCE;
        private static volatile im4<WithdrawStake> PARSER = null;
        public static final int STAKE_ACCOUNT_FIELD_NUMBER = 1;
        public static final int VALUE_FIELD_NUMBER = 2;
        private String stakeAccount_ = "";
        private long value_;

        public static final class Builder extends GeneratedMessageLite.C4930a<WithdrawStake, Builder> implements WithdrawStakeOrBuilder {
            public /* synthetic */ Builder(C97631 r1) {
                this();
            }

            public Builder clearStakeAccount() {
                copyOnWrite();
                ((WithdrawStake) this.instance).clearStakeAccount();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((WithdrawStake) this.instance).clearValue();
                return this;
            }

            public String getStakeAccount() {
                return ((WithdrawStake) this.instance).getStakeAccount();
            }

            public ByteString getStakeAccountBytes() {
                return ((WithdrawStake) this.instance).getStakeAccountBytes();
            }

            public long getValue() {
                return ((WithdrawStake) this.instance).getValue();
            }

            public Builder setStakeAccount(String str) {
                copyOnWrite();
                ((WithdrawStake) this.instance).setStakeAccount(str);
                return this;
            }

            public Builder setStakeAccountBytes(ByteString byteString) {
                copyOnWrite();
                ((WithdrawStake) this.instance).setStakeAccountBytes(byteString);
                return this;
            }

            public Builder setValue(long j) {
                copyOnWrite();
                ((WithdrawStake) this.instance).setValue(j);
                return this;
            }

            private Builder() {
                super(WithdrawStake.DEFAULT_INSTANCE);
            }
        }

        static {
            WithdrawStake withdrawStake = new WithdrawStake();
            DEFAULT_INSTANCE = withdrawStake;
            GeneratedMessageLite.registerDefaultInstance(WithdrawStake.class, withdrawStake);
        }

        private WithdrawStake() {
        }

        /* access modifiers changed from: private */
        public void clearStakeAccount() {
            this.stakeAccount_ = getDefaultInstance().getStakeAccount();
        }

        /* access modifiers changed from: private */
        public void clearValue() {
            this.value_ = 0;
        }

        public static WithdrawStake getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static WithdrawStake parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (WithdrawStake) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WithdrawStake parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (WithdrawStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<WithdrawStake> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setStakeAccount(String str) {
            str.getClass();
            this.stakeAccount_ = str;
        }

        /* access modifiers changed from: private */
        public void setStakeAccountBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.stakeAccount_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setValue(long j) {
            this.value_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97631.f46578xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new WithdrawStake();
                case 2:
                    return new Builder((C97631) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0003", new Object[]{"stakeAccount_", "value_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<WithdrawStake> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (WithdrawStake.class) {
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

        public String getStakeAccount() {
            return this.stakeAccount_;
        }

        public ByteString getStakeAccountBytes() {
            return ByteString.copyFromUtf8(this.stakeAccount_);
        }

        public long getValue() {
            return this.value_;
        }

        public static Builder newBuilder(WithdrawStake withdrawStake) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(withdrawStake);
        }

        public static WithdrawStake parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (WithdrawStake) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static WithdrawStake parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (WithdrawStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static WithdrawStake parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (WithdrawStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static WithdrawStake parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (WithdrawStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static WithdrawStake parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (WithdrawStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static WithdrawStake parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (WithdrawStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static WithdrawStake parseFrom(InputStream inputStream) throws IOException {
            return (WithdrawStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WithdrawStake parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (WithdrawStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static WithdrawStake parseFrom(C4969g gVar) throws IOException {
            return (WithdrawStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static WithdrawStake parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (WithdrawStake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface WithdrawStakeOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getStakeAccount();

        ByteString getStakeAccountBytes();

        long getValue();

        /* synthetic */ boolean isInitialized();
    }

    private Solana() {
    }

    public static void registerAllExtensions(C4987l lVar) {
    }
}
