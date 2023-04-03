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

public final class Stellar {

    /* renamed from: wallet.core.jni.proto.Stellar$1 */
    public static /* synthetic */ class C97641 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f46579xa1df5c61;

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
                f46579xa1df5c61 = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f46579xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f46579xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f46579xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f46579xa1df5c61     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f46579xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f46579xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wallet.core.jni.proto.Stellar.C97641.<clinit>():void");
        }
    }

    public static final class Asset extends GeneratedMessageLite<Asset, Builder> implements AssetOrBuilder {
        public static final int ALPHANUM4_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final Asset DEFAULT_INSTANCE;
        public static final int ISSUER_FIELD_NUMBER = 1;
        private static volatile im4<Asset> PARSER;
        private String alphanum4_ = "";
        private String issuer_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<Asset, Builder> implements AssetOrBuilder {
            public /* synthetic */ Builder(C97641 r1) {
                this();
            }

            public Builder clearAlphanum4() {
                copyOnWrite();
                ((Asset) this.instance).clearAlphanum4();
                return this;
            }

            public Builder clearIssuer() {
                copyOnWrite();
                ((Asset) this.instance).clearIssuer();
                return this;
            }

            public String getAlphanum4() {
                return ((Asset) this.instance).getAlphanum4();
            }

            public ByteString getAlphanum4Bytes() {
                return ((Asset) this.instance).getAlphanum4Bytes();
            }

            public String getIssuer() {
                return ((Asset) this.instance).getIssuer();
            }

            public ByteString getIssuerBytes() {
                return ((Asset) this.instance).getIssuerBytes();
            }

            public Builder setAlphanum4(String str) {
                copyOnWrite();
                ((Asset) this.instance).setAlphanum4(str);
                return this;
            }

            public Builder setAlphanum4Bytes(ByteString byteString) {
                copyOnWrite();
                ((Asset) this.instance).setAlphanum4Bytes(byteString);
                return this;
            }

            public Builder setIssuer(String str) {
                copyOnWrite();
                ((Asset) this.instance).setIssuer(str);
                return this;
            }

            public Builder setIssuerBytes(ByteString byteString) {
                copyOnWrite();
                ((Asset) this.instance).setIssuerBytes(byteString);
                return this;
            }

            private Builder() {
                super(Asset.DEFAULT_INSTANCE);
            }
        }

        static {
            Asset asset = new Asset();
            DEFAULT_INSTANCE = asset;
            GeneratedMessageLite.registerDefaultInstance(Asset.class, asset);
        }

        private Asset() {
        }

        /* access modifiers changed from: private */
        public void clearAlphanum4() {
            this.alphanum4_ = getDefaultInstance().getAlphanum4();
        }

        /* access modifiers changed from: private */
        public void clearIssuer() {
            this.issuer_ = getDefaultInstance().getIssuer();
        }

        public static Asset getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Asset parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Asset) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Asset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<Asset> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAlphanum4(String str) {
            str.getClass();
            this.alphanum4_ = str;
        }

        /* access modifiers changed from: private */
        public void setAlphanum4Bytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.alphanum4_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setIssuer(String str) {
            str.getClass();
            this.issuer_ = str;
        }

        /* access modifiers changed from: private */
        public void setIssuerBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.issuer_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97641.f46579xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Asset();
                case 2:
                    return new Builder((C97641) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"issuer_", "alphanum4_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<Asset> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (Asset.class) {
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

        public String getAlphanum4() {
            return this.alphanum4_;
        }

        public ByteString getAlphanum4Bytes() {
            return ByteString.copyFromUtf8(this.alphanum4_);
        }

        public String getIssuer() {
            return this.issuer_;
        }

        public ByteString getIssuerBytes() {
            return ByteString.copyFromUtf8(this.issuer_);
        }

        public static Builder newBuilder(Asset asset) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(asset);
        }

        public static Asset parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Asset) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Asset parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static Asset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Asset parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static Asset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Asset parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static Asset parseFrom(InputStream inputStream) throws IOException {
            return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Asset parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Asset parseFrom(C4969g gVar) throws IOException {
            return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static Asset parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface AssetOrBuilder extends qu3 {
        String getAlphanum4();

        ByteString getAlphanum4Bytes();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getIssuer();

        ByteString getIssuerBytes();

        /* synthetic */ boolean isInitialized();
    }

    public enum ClaimPredicate implements C5011t.C5014c {
        Predicate_unconditional(0),
        UNRECOGNIZED(-1);
        
        public static final int Predicate_unconditional_VALUE = 0;
        private static final C5011t.C5015d<ClaimPredicate> internalValueMap = null;
        private final int value;

        public static final class ClaimPredicateVerifier implements C5011t.C5016e {
            public static final C5011t.C5016e INSTANCE = null;

            static {
                INSTANCE = new ClaimPredicateVerifier();
            }

            private ClaimPredicateVerifier() {
            }

            public boolean isInRange(int i) {
                if (ClaimPredicate.forNumber(i) != null) {
                    return true;
                }
                return false;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C5011t.C5015d<ClaimPredicate>() {
                public ClaimPredicate findValueByNumber(int i) {
                    return ClaimPredicate.forNumber(i);
                }
            };
        }

        private ClaimPredicate(int i) {
            this.value = i;
        }

        public static ClaimPredicate forNumber(int i) {
            if (i != 0) {
                return null;
            }
            return Predicate_unconditional;
        }

        public static C5011t.C5015d<ClaimPredicate> internalGetValueMap() {
            return internalValueMap;
        }

        public static C5011t.C5016e internalGetVerifier() {
            return ClaimPredicateVerifier.INSTANCE;
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static ClaimPredicate valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class Claimant extends GeneratedMessageLite<Claimant, Builder> implements ClaimantOrBuilder {
        public static final int ACCOUNT_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final Claimant DEFAULT_INSTANCE;
        private static volatile im4<Claimant> PARSER = null;
        public static final int PREDICATE_FIELD_NUMBER = 2;
        private String account_ = "";
        private int predicate_;

        public static final class Builder extends GeneratedMessageLite.C4930a<Claimant, Builder> implements ClaimantOrBuilder {
            public /* synthetic */ Builder(C97641 r1) {
                this();
            }

            public Builder clearAccount() {
                copyOnWrite();
                ((Claimant) this.instance).clearAccount();
                return this;
            }

            public Builder clearPredicate() {
                copyOnWrite();
                ((Claimant) this.instance).clearPredicate();
                return this;
            }

            public String getAccount() {
                return ((Claimant) this.instance).getAccount();
            }

            public ByteString getAccountBytes() {
                return ((Claimant) this.instance).getAccountBytes();
            }

            public ClaimPredicate getPredicate() {
                return ((Claimant) this.instance).getPredicate();
            }

            public int getPredicateValue() {
                return ((Claimant) this.instance).getPredicateValue();
            }

            public Builder setAccount(String str) {
                copyOnWrite();
                ((Claimant) this.instance).setAccount(str);
                return this;
            }

            public Builder setAccountBytes(ByteString byteString) {
                copyOnWrite();
                ((Claimant) this.instance).setAccountBytes(byteString);
                return this;
            }

            public Builder setPredicate(ClaimPredicate claimPredicate) {
                copyOnWrite();
                ((Claimant) this.instance).setPredicate(claimPredicate);
                return this;
            }

            public Builder setPredicateValue(int i) {
                copyOnWrite();
                ((Claimant) this.instance).setPredicateValue(i);
                return this;
            }

            private Builder() {
                super(Claimant.DEFAULT_INSTANCE);
            }
        }

        static {
            Claimant claimant = new Claimant();
            DEFAULT_INSTANCE = claimant;
            GeneratedMessageLite.registerDefaultInstance(Claimant.class, claimant);
        }

        private Claimant() {
        }

        /* access modifiers changed from: private */
        public void clearAccount() {
            this.account_ = getDefaultInstance().getAccount();
        }

        /* access modifiers changed from: private */
        public void clearPredicate() {
            this.predicate_ = 0;
        }

        public static Claimant getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Claimant parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Claimant) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Claimant parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Claimant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<Claimant> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAccount(String str) {
            str.getClass();
            this.account_ = str;
        }

        /* access modifiers changed from: private */
        public void setAccountBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.account_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setPredicate(ClaimPredicate claimPredicate) {
            this.predicate_ = claimPredicate.getNumber();
        }

        /* access modifiers changed from: private */
        public void setPredicateValue(int i) {
            this.predicate_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97641.f46579xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Claimant();
                case 2:
                    return new Builder((C97641) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"account_", "predicate_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<Claimant> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (Claimant.class) {
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

        public String getAccount() {
            return this.account_;
        }

        public ByteString getAccountBytes() {
            return ByteString.copyFromUtf8(this.account_);
        }

        public ClaimPredicate getPredicate() {
            ClaimPredicate forNumber = ClaimPredicate.forNumber(this.predicate_);
            if (forNumber == null) {
                return ClaimPredicate.UNRECOGNIZED;
            }
            return forNumber;
        }

        public int getPredicateValue() {
            return this.predicate_;
        }

        public static Builder newBuilder(Claimant claimant) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(claimant);
        }

        public static Claimant parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Claimant) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Claimant parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (Claimant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static Claimant parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Claimant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Claimant parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (Claimant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static Claimant parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Claimant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Claimant parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (Claimant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static Claimant parseFrom(InputStream inputStream) throws IOException {
            return (Claimant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Claimant parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Claimant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Claimant parseFrom(C4969g gVar) throws IOException {
            return (Claimant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static Claimant parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (Claimant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface ClaimantOrBuilder extends qu3 {
        String getAccount();

        ByteString getAccountBytes();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        ClaimPredicate getPredicate();

        int getPredicateValue();

        /* synthetic */ boolean isInitialized();
    }

    public static final class MemoHash extends GeneratedMessageLite<MemoHash, Builder> implements MemoHashOrBuilder {
        /* access modifiers changed from: private */
        public static final MemoHash DEFAULT_INSTANCE;
        public static final int HASH_FIELD_NUMBER = 1;
        private static volatile im4<MemoHash> PARSER;
        private ByteString hash_ = ByteString.EMPTY;

        public static final class Builder extends GeneratedMessageLite.C4930a<MemoHash, Builder> implements MemoHashOrBuilder {
            public /* synthetic */ Builder(C97641 r1) {
                this();
            }

            public Builder clearHash() {
                copyOnWrite();
                ((MemoHash) this.instance).clearHash();
                return this;
            }

            public ByteString getHash() {
                return ((MemoHash) this.instance).getHash();
            }

            public Builder setHash(ByteString byteString) {
                copyOnWrite();
                ((MemoHash) this.instance).setHash(byteString);
                return this;
            }

            private Builder() {
                super(MemoHash.DEFAULT_INSTANCE);
            }
        }

        static {
            MemoHash memoHash = new MemoHash();
            DEFAULT_INSTANCE = memoHash;
            GeneratedMessageLite.registerDefaultInstance(MemoHash.class, memoHash);
        }

        private MemoHash() {
        }

        /* access modifiers changed from: private */
        public void clearHash() {
            this.hash_ = getDefaultInstance().getHash();
        }

        public static MemoHash getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static MemoHash parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MemoHash) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MemoHash parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (MemoHash) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<MemoHash> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setHash(ByteString byteString) {
            byteString.getClass();
            this.hash_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97641.f46579xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new MemoHash();
                case 2:
                    return new Builder((C97641) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"hash_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<MemoHash> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (MemoHash.class) {
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

        public ByteString getHash() {
            return this.hash_;
        }

        public static Builder newBuilder(MemoHash memoHash) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(memoHash);
        }

        public static MemoHash parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (MemoHash) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static MemoHash parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (MemoHash) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static MemoHash parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MemoHash) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MemoHash parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (MemoHash) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static MemoHash parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MemoHash) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MemoHash parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (MemoHash) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static MemoHash parseFrom(InputStream inputStream) throws IOException {
            return (MemoHash) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MemoHash parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (MemoHash) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static MemoHash parseFrom(C4969g gVar) throws IOException {
            return (MemoHash) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static MemoHash parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (MemoHash) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface MemoHashOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        ByteString getHash();

        /* synthetic */ boolean isInitialized();
    }

    public static final class MemoId extends GeneratedMessageLite<MemoId, Builder> implements MemoIdOrBuilder {
        /* access modifiers changed from: private */
        public static final MemoId DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        private static volatile im4<MemoId> PARSER;
        private long id_;

        public static final class Builder extends GeneratedMessageLite.C4930a<MemoId, Builder> implements MemoIdOrBuilder {
            public /* synthetic */ Builder(C97641 r1) {
                this();
            }

            public Builder clearId() {
                copyOnWrite();
                ((MemoId) this.instance).clearId();
                return this;
            }

            public long getId() {
                return ((MemoId) this.instance).getId();
            }

            public Builder setId(long j) {
                copyOnWrite();
                ((MemoId) this.instance).setId(j);
                return this;
            }

            private Builder() {
                super(MemoId.DEFAULT_INSTANCE);
            }
        }

        static {
            MemoId memoId = new MemoId();
            DEFAULT_INSTANCE = memoId;
            GeneratedMessageLite.registerDefaultInstance(MemoId.class, memoId);
        }

        private MemoId() {
        }

        /* access modifiers changed from: private */
        public void clearId() {
            this.id_ = 0;
        }

        public static MemoId getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static MemoId parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MemoId) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MemoId parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (MemoId) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<MemoId> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setId(long j) {
            this.id_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97641.f46579xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new MemoId();
                case 2:
                    return new Builder((C97641) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"id_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<MemoId> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (MemoId.class) {
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

        public long getId() {
            return this.id_;
        }

        public static Builder newBuilder(MemoId memoId) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(memoId);
        }

        public static MemoId parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (MemoId) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static MemoId parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (MemoId) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static MemoId parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MemoId) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MemoId parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (MemoId) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static MemoId parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MemoId) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MemoId parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (MemoId) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static MemoId parseFrom(InputStream inputStream) throws IOException {
            return (MemoId) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MemoId parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (MemoId) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static MemoId parseFrom(C4969g gVar) throws IOException {
            return (MemoId) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static MemoId parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (MemoId) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface MemoIdOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        long getId();

        /* synthetic */ boolean isInitialized();
    }

    public static final class MemoText extends GeneratedMessageLite<MemoText, Builder> implements MemoTextOrBuilder {
        /* access modifiers changed from: private */
        public static final MemoText DEFAULT_INSTANCE;
        private static volatile im4<MemoText> PARSER = null;
        public static final int TEXT_FIELD_NUMBER = 1;
        private String text_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<MemoText, Builder> implements MemoTextOrBuilder {
            public /* synthetic */ Builder(C97641 r1) {
                this();
            }

            public Builder clearText() {
                copyOnWrite();
                ((MemoText) this.instance).clearText();
                return this;
            }

            public String getText() {
                return ((MemoText) this.instance).getText();
            }

            public ByteString getTextBytes() {
                return ((MemoText) this.instance).getTextBytes();
            }

            public Builder setText(String str) {
                copyOnWrite();
                ((MemoText) this.instance).setText(str);
                return this;
            }

            public Builder setTextBytes(ByteString byteString) {
                copyOnWrite();
                ((MemoText) this.instance).setTextBytes(byteString);
                return this;
            }

            private Builder() {
                super(MemoText.DEFAULT_INSTANCE);
            }
        }

        static {
            MemoText memoText = new MemoText();
            DEFAULT_INSTANCE = memoText;
            GeneratedMessageLite.registerDefaultInstance(MemoText.class, memoText);
        }

        private MemoText() {
        }

        /* access modifiers changed from: private */
        public void clearText() {
            this.text_ = getDefaultInstance().getText();
        }

        public static MemoText getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static MemoText parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MemoText) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MemoText parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (MemoText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<MemoText> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setText(String str) {
            str.getClass();
            this.text_ = str;
        }

        /* access modifiers changed from: private */
        public void setTextBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.text_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97641.f46579xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new MemoText();
                case 2:
                    return new Builder((C97641) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"text_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<MemoText> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (MemoText.class) {
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

        public String getText() {
            return this.text_;
        }

        public ByteString getTextBytes() {
            return ByteString.copyFromUtf8(this.text_);
        }

        public static Builder newBuilder(MemoText memoText) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(memoText);
        }

        public static MemoText parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (MemoText) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static MemoText parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (MemoText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static MemoText parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MemoText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MemoText parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (MemoText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static MemoText parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MemoText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MemoText parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (MemoText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static MemoText parseFrom(InputStream inputStream) throws IOException {
            return (MemoText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MemoText parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (MemoText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static MemoText parseFrom(C4969g gVar) throws IOException {
            return (MemoText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static MemoText parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (MemoText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface MemoTextOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getText();

        ByteString getTextBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class MemoVoid extends GeneratedMessageLite<MemoVoid, Builder> implements MemoVoidOrBuilder {
        /* access modifiers changed from: private */
        public static final MemoVoid DEFAULT_INSTANCE;
        private static volatile im4<MemoVoid> PARSER;

        public static final class Builder extends GeneratedMessageLite.C4930a<MemoVoid, Builder> implements MemoVoidOrBuilder {
            public /* synthetic */ Builder(C97641 r1) {
                this();
            }

            private Builder() {
                super(MemoVoid.DEFAULT_INSTANCE);
            }
        }

        static {
            MemoVoid memoVoid = new MemoVoid();
            DEFAULT_INSTANCE = memoVoid;
            GeneratedMessageLite.registerDefaultInstance(MemoVoid.class, memoVoid);
        }

        private MemoVoid() {
        }

        public static MemoVoid getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static MemoVoid parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MemoVoid) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MemoVoid parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (MemoVoid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<MemoVoid> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97641.f46579xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new MemoVoid();
                case 2:
                    return new Builder((C97641) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<MemoVoid> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (MemoVoid.class) {
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

        public static Builder newBuilder(MemoVoid memoVoid) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(memoVoid);
        }

        public static MemoVoid parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (MemoVoid) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static MemoVoid parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (MemoVoid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static MemoVoid parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MemoVoid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MemoVoid parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (MemoVoid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static MemoVoid parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MemoVoid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MemoVoid parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (MemoVoid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static MemoVoid parseFrom(InputStream inputStream) throws IOException {
            return (MemoVoid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MemoVoid parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (MemoVoid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static MemoVoid parseFrom(C4969g gVar) throws IOException {
            return (MemoVoid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static MemoVoid parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (MemoVoid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface MemoVoidOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        /* synthetic */ boolean isInitialized();
    }

    public static final class OperationChangeTrust extends GeneratedMessageLite<OperationChangeTrust, Builder> implements OperationChangeTrustOrBuilder {
        public static final int ASSET_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final OperationChangeTrust DEFAULT_INSTANCE;
        private static volatile im4<OperationChangeTrust> PARSER = null;
        public static final int VALID_BEFORE_FIELD_NUMBER = 2;
        private Asset asset_;
        private long validBefore_;

        public static final class Builder extends GeneratedMessageLite.C4930a<OperationChangeTrust, Builder> implements OperationChangeTrustOrBuilder {
            public /* synthetic */ Builder(C97641 r1) {
                this();
            }

            public Builder clearAsset() {
                copyOnWrite();
                ((OperationChangeTrust) this.instance).clearAsset();
                return this;
            }

            public Builder clearValidBefore() {
                copyOnWrite();
                ((OperationChangeTrust) this.instance).clearValidBefore();
                return this;
            }

            public Asset getAsset() {
                return ((OperationChangeTrust) this.instance).getAsset();
            }

            public long getValidBefore() {
                return ((OperationChangeTrust) this.instance).getValidBefore();
            }

            public boolean hasAsset() {
                return ((OperationChangeTrust) this.instance).hasAsset();
            }

            public Builder mergeAsset(Asset asset) {
                copyOnWrite();
                ((OperationChangeTrust) this.instance).mergeAsset(asset);
                return this;
            }

            public Builder setAsset(Asset asset) {
                copyOnWrite();
                ((OperationChangeTrust) this.instance).setAsset(asset);
                return this;
            }

            public Builder setValidBefore(long j) {
                copyOnWrite();
                ((OperationChangeTrust) this.instance).setValidBefore(j);
                return this;
            }

            private Builder() {
                super(OperationChangeTrust.DEFAULT_INSTANCE);
            }

            public Builder setAsset(Asset.Builder builder) {
                copyOnWrite();
                ((OperationChangeTrust) this.instance).setAsset((Asset) builder.build());
                return this;
            }
        }

        static {
            OperationChangeTrust operationChangeTrust = new OperationChangeTrust();
            DEFAULT_INSTANCE = operationChangeTrust;
            GeneratedMessageLite.registerDefaultInstance(OperationChangeTrust.class, operationChangeTrust);
        }

        private OperationChangeTrust() {
        }

        /* access modifiers changed from: private */
        public void clearAsset() {
            this.asset_ = null;
        }

        /* access modifiers changed from: private */
        public void clearValidBefore() {
            this.validBefore_ = 0;
        }

        public static OperationChangeTrust getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeAsset(Asset asset) {
            asset.getClass();
            Asset asset2 = this.asset_;
            if (asset2 == null || asset2 == Asset.getDefaultInstance()) {
                this.asset_ = asset;
            } else {
                this.asset_ = (Asset) ((Asset.Builder) Asset.newBuilder(this.asset_).mergeFrom(asset)).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static OperationChangeTrust parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OperationChangeTrust) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationChangeTrust parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (OperationChangeTrust) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<OperationChangeTrust> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAsset(Asset asset) {
            asset.getClass();
            this.asset_ = asset;
        }

        /* access modifiers changed from: private */
        public void setValidBefore(long j) {
            this.validBefore_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97641.f46579xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new OperationChangeTrust();
                case 2:
                    return new Builder((C97641) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u0002", new Object[]{"asset_", "validBefore_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<OperationChangeTrust> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (OperationChangeTrust.class) {
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

        public Asset getAsset() {
            Asset asset = this.asset_;
            if (asset == null) {
                return Asset.getDefaultInstance();
            }
            return asset;
        }

        public long getValidBefore() {
            return this.validBefore_;
        }

        public boolean hasAsset() {
            if (this.asset_ != null) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(OperationChangeTrust operationChangeTrust) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(operationChangeTrust);
        }

        public static OperationChangeTrust parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (OperationChangeTrust) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static OperationChangeTrust parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (OperationChangeTrust) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static OperationChangeTrust parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OperationChangeTrust) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static OperationChangeTrust parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (OperationChangeTrust) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static OperationChangeTrust parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OperationChangeTrust) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OperationChangeTrust parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (OperationChangeTrust) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static OperationChangeTrust parseFrom(InputStream inputStream) throws IOException {
            return (OperationChangeTrust) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationChangeTrust parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (OperationChangeTrust) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static OperationChangeTrust parseFrom(C4969g gVar) throws IOException {
            return (OperationChangeTrust) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static OperationChangeTrust parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (OperationChangeTrust) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface OperationChangeTrustOrBuilder extends qu3 {
        Asset getAsset();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        long getValidBefore();

        boolean hasAsset();

        /* synthetic */ boolean isInitialized();
    }

    public static final class OperationClaimClaimableBalance extends GeneratedMessageLite<OperationClaimClaimableBalance, Builder> implements OperationClaimClaimableBalanceOrBuilder {
        public static final int BALANCE_ID_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final OperationClaimClaimableBalance DEFAULT_INSTANCE;
        private static volatile im4<OperationClaimClaimableBalance> PARSER;
        private ByteString balanceId_ = ByteString.EMPTY;

        public static final class Builder extends GeneratedMessageLite.C4930a<OperationClaimClaimableBalance, Builder> implements OperationClaimClaimableBalanceOrBuilder {
            public /* synthetic */ Builder(C97641 r1) {
                this();
            }

            public Builder clearBalanceId() {
                copyOnWrite();
                ((OperationClaimClaimableBalance) this.instance).clearBalanceId();
                return this;
            }

            public ByteString getBalanceId() {
                return ((OperationClaimClaimableBalance) this.instance).getBalanceId();
            }

            public Builder setBalanceId(ByteString byteString) {
                copyOnWrite();
                ((OperationClaimClaimableBalance) this.instance).setBalanceId(byteString);
                return this;
            }

            private Builder() {
                super(OperationClaimClaimableBalance.DEFAULT_INSTANCE);
            }
        }

        static {
            OperationClaimClaimableBalance operationClaimClaimableBalance = new OperationClaimClaimableBalance();
            DEFAULT_INSTANCE = operationClaimClaimableBalance;
            GeneratedMessageLite.registerDefaultInstance(OperationClaimClaimableBalance.class, operationClaimClaimableBalance);
        }

        private OperationClaimClaimableBalance() {
        }

        /* access modifiers changed from: private */
        public void clearBalanceId() {
            this.balanceId_ = getDefaultInstance().getBalanceId();
        }

        public static OperationClaimClaimableBalance getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static OperationClaimClaimableBalance parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OperationClaimClaimableBalance) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationClaimClaimableBalance parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (OperationClaimClaimableBalance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<OperationClaimClaimableBalance> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setBalanceId(ByteString byteString) {
            byteString.getClass();
            this.balanceId_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97641.f46579xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new OperationClaimClaimableBalance();
                case 2:
                    return new Builder((C97641) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"balanceId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<OperationClaimClaimableBalance> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (OperationClaimClaimableBalance.class) {
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

        public ByteString getBalanceId() {
            return this.balanceId_;
        }

        public static Builder newBuilder(OperationClaimClaimableBalance operationClaimClaimableBalance) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(operationClaimClaimableBalance);
        }

        public static OperationClaimClaimableBalance parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (OperationClaimClaimableBalance) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static OperationClaimClaimableBalance parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (OperationClaimClaimableBalance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static OperationClaimClaimableBalance parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OperationClaimClaimableBalance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static OperationClaimClaimableBalance parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (OperationClaimClaimableBalance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static OperationClaimClaimableBalance parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OperationClaimClaimableBalance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OperationClaimClaimableBalance parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (OperationClaimClaimableBalance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static OperationClaimClaimableBalance parseFrom(InputStream inputStream) throws IOException {
            return (OperationClaimClaimableBalance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationClaimClaimableBalance parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (OperationClaimClaimableBalance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static OperationClaimClaimableBalance parseFrom(C4969g gVar) throws IOException {
            return (OperationClaimClaimableBalance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static OperationClaimClaimableBalance parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (OperationClaimClaimableBalance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface OperationClaimClaimableBalanceOrBuilder extends qu3 {
        ByteString getBalanceId();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        /* synthetic */ boolean isInitialized();
    }

    public static final class OperationCreateAccount extends GeneratedMessageLite<OperationCreateAccount, Builder> implements OperationCreateAccountOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final OperationCreateAccount DEFAULT_INSTANCE;
        public static final int DESTINATION_FIELD_NUMBER = 1;
        private static volatile im4<OperationCreateAccount> PARSER;
        private long amount_;
        private String destination_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<OperationCreateAccount, Builder> implements OperationCreateAccountOrBuilder {
            public /* synthetic */ Builder(C97641 r1) {
                this();
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((OperationCreateAccount) this.instance).clearAmount();
                return this;
            }

            public Builder clearDestination() {
                copyOnWrite();
                ((OperationCreateAccount) this.instance).clearDestination();
                return this;
            }

            public long getAmount() {
                return ((OperationCreateAccount) this.instance).getAmount();
            }

            public String getDestination() {
                return ((OperationCreateAccount) this.instance).getDestination();
            }

            public ByteString getDestinationBytes() {
                return ((OperationCreateAccount) this.instance).getDestinationBytes();
            }

            public Builder setAmount(long j) {
                copyOnWrite();
                ((OperationCreateAccount) this.instance).setAmount(j);
                return this;
            }

            public Builder setDestination(String str) {
                copyOnWrite();
                ((OperationCreateAccount) this.instance).setDestination(str);
                return this;
            }

            public Builder setDestinationBytes(ByteString byteString) {
                copyOnWrite();
                ((OperationCreateAccount) this.instance).setDestinationBytes(byteString);
                return this;
            }

            private Builder() {
                super(OperationCreateAccount.DEFAULT_INSTANCE);
            }
        }

        static {
            OperationCreateAccount operationCreateAccount = new OperationCreateAccount();
            DEFAULT_INSTANCE = operationCreateAccount;
            GeneratedMessageLite.registerDefaultInstance(OperationCreateAccount.class, operationCreateAccount);
        }

        private OperationCreateAccount() {
        }

        /* access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearDestination() {
            this.destination_ = getDefaultInstance().getDestination();
        }

        public static OperationCreateAccount getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static OperationCreateAccount parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OperationCreateAccount) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationCreateAccount parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (OperationCreateAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<OperationCreateAccount> parser() {
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

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97641.f46579xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new OperationCreateAccount();
                case 2:
                    return new Builder((C97641) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0002", new Object[]{"destination_", "amount_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<OperationCreateAccount> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (OperationCreateAccount.class) {
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

        public static Builder newBuilder(OperationCreateAccount operationCreateAccount) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(operationCreateAccount);
        }

        public static OperationCreateAccount parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (OperationCreateAccount) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static OperationCreateAccount parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (OperationCreateAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static OperationCreateAccount parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OperationCreateAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static OperationCreateAccount parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (OperationCreateAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static OperationCreateAccount parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OperationCreateAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OperationCreateAccount parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (OperationCreateAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static OperationCreateAccount parseFrom(InputStream inputStream) throws IOException {
            return (OperationCreateAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationCreateAccount parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (OperationCreateAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static OperationCreateAccount parseFrom(C4969g gVar) throws IOException {
            return (OperationCreateAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static OperationCreateAccount parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (OperationCreateAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface OperationCreateAccountOrBuilder extends qu3 {
        long getAmount();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getDestination();

        ByteString getDestinationBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class OperationCreateClaimableBalance extends GeneratedMessageLite<OperationCreateClaimableBalance, Builder> implements OperationCreateClaimableBalanceOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 2;
        public static final int ASSET_FIELD_NUMBER = 1;
        public static final int CLAIMANTS_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final OperationCreateClaimableBalance DEFAULT_INSTANCE;
        private static volatile im4<OperationCreateClaimableBalance> PARSER;
        private long amount_;
        private Asset asset_;
        private C5011t.C5020i<Claimant> claimants_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.C4930a<OperationCreateClaimableBalance, Builder> implements OperationCreateClaimableBalanceOrBuilder {
            public /* synthetic */ Builder(C97641 r1) {
                this();
            }

            public Builder addAllClaimants(Iterable<? extends Claimant> iterable) {
                copyOnWrite();
                ((OperationCreateClaimableBalance) this.instance).addAllClaimants(iterable);
                return this;
            }

            public Builder addClaimants(Claimant claimant) {
                copyOnWrite();
                ((OperationCreateClaimableBalance) this.instance).addClaimants(claimant);
                return this;
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((OperationCreateClaimableBalance) this.instance).clearAmount();
                return this;
            }

            public Builder clearAsset() {
                copyOnWrite();
                ((OperationCreateClaimableBalance) this.instance).clearAsset();
                return this;
            }

            public Builder clearClaimants() {
                copyOnWrite();
                ((OperationCreateClaimableBalance) this.instance).clearClaimants();
                return this;
            }

            public long getAmount() {
                return ((OperationCreateClaimableBalance) this.instance).getAmount();
            }

            public Asset getAsset() {
                return ((OperationCreateClaimableBalance) this.instance).getAsset();
            }

            public Claimant getClaimants(int i) {
                return ((OperationCreateClaimableBalance) this.instance).getClaimants(i);
            }

            public int getClaimantsCount() {
                return ((OperationCreateClaimableBalance) this.instance).getClaimantsCount();
            }

            public List<Claimant> getClaimantsList() {
                return Collections.unmodifiableList(((OperationCreateClaimableBalance) this.instance).getClaimantsList());
            }

            public boolean hasAsset() {
                return ((OperationCreateClaimableBalance) this.instance).hasAsset();
            }

            public Builder mergeAsset(Asset asset) {
                copyOnWrite();
                ((OperationCreateClaimableBalance) this.instance).mergeAsset(asset);
                return this;
            }

            public Builder removeClaimants(int i) {
                copyOnWrite();
                ((OperationCreateClaimableBalance) this.instance).removeClaimants(i);
                return this;
            }

            public Builder setAmount(long j) {
                copyOnWrite();
                ((OperationCreateClaimableBalance) this.instance).setAmount(j);
                return this;
            }

            public Builder setAsset(Asset asset) {
                copyOnWrite();
                ((OperationCreateClaimableBalance) this.instance).setAsset(asset);
                return this;
            }

            public Builder setClaimants(int i, Claimant claimant) {
                copyOnWrite();
                ((OperationCreateClaimableBalance) this.instance).setClaimants(i, claimant);
                return this;
            }

            private Builder() {
                super(OperationCreateClaimableBalance.DEFAULT_INSTANCE);
            }

            public Builder addClaimants(int i, Claimant claimant) {
                copyOnWrite();
                ((OperationCreateClaimableBalance) this.instance).addClaimants(i, claimant);
                return this;
            }

            public Builder setAsset(Asset.Builder builder) {
                copyOnWrite();
                ((OperationCreateClaimableBalance) this.instance).setAsset((Asset) builder.build());
                return this;
            }

            public Builder setClaimants(int i, Claimant.Builder builder) {
                copyOnWrite();
                ((OperationCreateClaimableBalance) this.instance).setClaimants(i, (Claimant) builder.build());
                return this;
            }

            public Builder addClaimants(Claimant.Builder builder) {
                copyOnWrite();
                ((OperationCreateClaimableBalance) this.instance).addClaimants((Claimant) builder.build());
                return this;
            }

            public Builder addClaimants(int i, Claimant.Builder builder) {
                copyOnWrite();
                ((OperationCreateClaimableBalance) this.instance).addClaimants(i, (Claimant) builder.build());
                return this;
            }
        }

        static {
            OperationCreateClaimableBalance operationCreateClaimableBalance = new OperationCreateClaimableBalance();
            DEFAULT_INSTANCE = operationCreateClaimableBalance;
            GeneratedMessageLite.registerDefaultInstance(OperationCreateClaimableBalance.class, operationCreateClaimableBalance);
        }

        private OperationCreateClaimableBalance() {
        }

        /* access modifiers changed from: private */
        public void addAllClaimants(Iterable<? extends Claimant> iterable) {
            ensureClaimantsIsMutable();
            C4949a.addAll(iterable, this.claimants_);
        }

        /* access modifiers changed from: private */
        public void addClaimants(Claimant claimant) {
            claimant.getClass();
            ensureClaimantsIsMutable();
            this.claimants_.add(claimant);
        }

        /* access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearAsset() {
            this.asset_ = null;
        }

        /* access modifiers changed from: private */
        public void clearClaimants() {
            this.claimants_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureClaimantsIsMutable() {
            C5011t.C5020i<Claimant> iVar = this.claimants_;
            if (!iVar.mo37090v()) {
                this.claimants_ = GeneratedMessageLite.mutableCopy(iVar);
            }
        }

        public static OperationCreateClaimableBalance getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeAsset(Asset asset) {
            asset.getClass();
            Asset asset2 = this.asset_;
            if (asset2 == null || asset2 == Asset.getDefaultInstance()) {
                this.asset_ = asset;
            } else {
                this.asset_ = (Asset) ((Asset.Builder) Asset.newBuilder(this.asset_).mergeFrom(asset)).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static OperationCreateClaimableBalance parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OperationCreateClaimableBalance) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationCreateClaimableBalance parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (OperationCreateClaimableBalance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<OperationCreateClaimableBalance> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeClaimants(int i) {
            ensureClaimantsIsMutable();
            this.claimants_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setAmount(long j) {
            this.amount_ = j;
        }

        /* access modifiers changed from: private */
        public void setAsset(Asset asset) {
            asset.getClass();
            this.asset_ = asset;
        }

        /* access modifiers changed from: private */
        public void setClaimants(int i, Claimant claimant) {
            claimant.getClass();
            ensureClaimantsIsMutable();
            this.claimants_.set(i, claimant);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97641.f46579xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new OperationCreateClaimableBalance();
                case 2:
                    return new Builder((C97641) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\t\u0002\u0002\u0003\u001b", new Object[]{"asset_", "amount_", "claimants_", Claimant.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<OperationCreateClaimableBalance> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (OperationCreateClaimableBalance.class) {
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

        public Asset getAsset() {
            Asset asset = this.asset_;
            if (asset == null) {
                return Asset.getDefaultInstance();
            }
            return asset;
        }

        public Claimant getClaimants(int i) {
            return this.claimants_.get(i);
        }

        public int getClaimantsCount() {
            return this.claimants_.size();
        }

        public List<Claimant> getClaimantsList() {
            return this.claimants_;
        }

        public ClaimantOrBuilder getClaimantsOrBuilder(int i) {
            return this.claimants_.get(i);
        }

        public List<? extends ClaimantOrBuilder> getClaimantsOrBuilderList() {
            return this.claimants_;
        }

        public boolean hasAsset() {
            if (this.asset_ != null) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(OperationCreateClaimableBalance operationCreateClaimableBalance) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(operationCreateClaimableBalance);
        }

        public static OperationCreateClaimableBalance parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (OperationCreateClaimableBalance) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static OperationCreateClaimableBalance parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (OperationCreateClaimableBalance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static OperationCreateClaimableBalance parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OperationCreateClaimableBalance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* access modifiers changed from: private */
        public void addClaimants(int i, Claimant claimant) {
            claimant.getClass();
            ensureClaimantsIsMutable();
            this.claimants_.add(i, claimant);
        }

        public static OperationCreateClaimableBalance parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (OperationCreateClaimableBalance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static OperationCreateClaimableBalance parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OperationCreateClaimableBalance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OperationCreateClaimableBalance parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (OperationCreateClaimableBalance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static OperationCreateClaimableBalance parseFrom(InputStream inputStream) throws IOException {
            return (OperationCreateClaimableBalance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationCreateClaimableBalance parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (OperationCreateClaimableBalance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static OperationCreateClaimableBalance parseFrom(C4969g gVar) throws IOException {
            return (OperationCreateClaimableBalance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static OperationCreateClaimableBalance parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (OperationCreateClaimableBalance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface OperationCreateClaimableBalanceOrBuilder extends qu3 {
        long getAmount();

        Asset getAsset();

        Claimant getClaimants(int i);

        int getClaimantsCount();

        List<Claimant> getClaimantsList();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        boolean hasAsset();

        /* synthetic */ boolean isInitialized();
    }

    public static final class OperationPayment extends GeneratedMessageLite<OperationPayment, Builder> implements OperationPaymentOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 3;
        public static final int ASSET_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final OperationPayment DEFAULT_INSTANCE;
        public static final int DESTINATION_FIELD_NUMBER = 1;
        private static volatile im4<OperationPayment> PARSER;
        private long amount_;
        private Asset asset_;
        private String destination_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<OperationPayment, Builder> implements OperationPaymentOrBuilder {
            public /* synthetic */ Builder(C97641 r1) {
                this();
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((OperationPayment) this.instance).clearAmount();
                return this;
            }

            public Builder clearAsset() {
                copyOnWrite();
                ((OperationPayment) this.instance).clearAsset();
                return this;
            }

            public Builder clearDestination() {
                copyOnWrite();
                ((OperationPayment) this.instance).clearDestination();
                return this;
            }

            public long getAmount() {
                return ((OperationPayment) this.instance).getAmount();
            }

            public Asset getAsset() {
                return ((OperationPayment) this.instance).getAsset();
            }

            public String getDestination() {
                return ((OperationPayment) this.instance).getDestination();
            }

            public ByteString getDestinationBytes() {
                return ((OperationPayment) this.instance).getDestinationBytes();
            }

            public boolean hasAsset() {
                return ((OperationPayment) this.instance).hasAsset();
            }

            public Builder mergeAsset(Asset asset) {
                copyOnWrite();
                ((OperationPayment) this.instance).mergeAsset(asset);
                return this;
            }

            public Builder setAmount(long j) {
                copyOnWrite();
                ((OperationPayment) this.instance).setAmount(j);
                return this;
            }

            public Builder setAsset(Asset asset) {
                copyOnWrite();
                ((OperationPayment) this.instance).setAsset(asset);
                return this;
            }

            public Builder setDestination(String str) {
                copyOnWrite();
                ((OperationPayment) this.instance).setDestination(str);
                return this;
            }

            public Builder setDestinationBytes(ByteString byteString) {
                copyOnWrite();
                ((OperationPayment) this.instance).setDestinationBytes(byteString);
                return this;
            }

            private Builder() {
                super(OperationPayment.DEFAULT_INSTANCE);
            }

            public Builder setAsset(Asset.Builder builder) {
                copyOnWrite();
                ((OperationPayment) this.instance).setAsset((Asset) builder.build());
                return this;
            }
        }

        static {
            OperationPayment operationPayment = new OperationPayment();
            DEFAULT_INSTANCE = operationPayment;
            GeneratedMessageLite.registerDefaultInstance(OperationPayment.class, operationPayment);
        }

        private OperationPayment() {
        }

        /* access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearAsset() {
            this.asset_ = null;
        }

        /* access modifiers changed from: private */
        public void clearDestination() {
            this.destination_ = getDefaultInstance().getDestination();
        }

        public static OperationPayment getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeAsset(Asset asset) {
            asset.getClass();
            Asset asset2 = this.asset_;
            if (asset2 == null || asset2 == Asset.getDefaultInstance()) {
                this.asset_ = asset;
            } else {
                this.asset_ = (Asset) ((Asset.Builder) Asset.newBuilder(this.asset_).mergeFrom(asset)).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static OperationPayment parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OperationPayment) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationPayment parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (OperationPayment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<OperationPayment> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAmount(long j) {
            this.amount_ = j;
        }

        /* access modifiers changed from: private */
        public void setAsset(Asset asset) {
            asset.getClass();
            this.asset_ = asset;
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

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97641.f46579xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new OperationPayment();
                case 2:
                    return new Builder((C97641) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\u0002", new Object[]{"destination_", "asset_", "amount_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<OperationPayment> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (OperationPayment.class) {
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

        public Asset getAsset() {
            Asset asset = this.asset_;
            if (asset == null) {
                return Asset.getDefaultInstance();
            }
            return asset;
        }

        public String getDestination() {
            return this.destination_;
        }

        public ByteString getDestinationBytes() {
            return ByteString.copyFromUtf8(this.destination_);
        }

        public boolean hasAsset() {
            if (this.asset_ != null) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(OperationPayment operationPayment) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(operationPayment);
        }

        public static OperationPayment parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (OperationPayment) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static OperationPayment parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (OperationPayment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static OperationPayment parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OperationPayment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static OperationPayment parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (OperationPayment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static OperationPayment parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OperationPayment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OperationPayment parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (OperationPayment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static OperationPayment parseFrom(InputStream inputStream) throws IOException {
            return (OperationPayment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationPayment parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (OperationPayment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static OperationPayment parseFrom(C4969g gVar) throws IOException {
            return (OperationPayment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static OperationPayment parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (OperationPayment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface OperationPaymentOrBuilder extends qu3 {
        long getAmount();

        Asset getAsset();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getDestination();

        ByteString getDestinationBytes();

        boolean hasAsset();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SigningInput extends GeneratedMessageLite<SigningInput, Builder> implements SigningInputOrBuilder {
        public static final int ACCOUNT_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final SigningInput DEFAULT_INSTANCE;
        public static final int FEE_FIELD_NUMBER = 1;
        public static final int MEMO_HASH_FIELD_NUMBER = 12;
        public static final int MEMO_ID_FIELD_NUMBER = 11;
        public static final int MEMO_RETURN_HASH_FIELD_NUMBER = 13;
        public static final int MEMO_TEXT_FIELD_NUMBER = 10;
        public static final int MEMO_VOID_FIELD_NUMBER = 9;
        public static final int OP_CHANGE_TRUST_FIELD_NUMBER = 8;
        public static final int OP_CLAIM_CLAIMABLE_BALANCE_FIELD_NUMBER = 15;
        public static final int OP_CREATE_ACCOUNT_FIELD_NUMBER = 6;
        public static final int OP_CREATE_CLAIMABLE_BALANCE_FIELD_NUMBER = 14;
        public static final int OP_PAYMENT_FIELD_NUMBER = 7;
        private static volatile im4<SigningInput> PARSER = null;
        public static final int PASSPHRASE_FIELD_NUMBER = 5;
        public static final int PRIVATE_KEY_FIELD_NUMBER = 4;
        public static final int SEQUENCE_FIELD_NUMBER = 2;
        private String account_ = "";
        private int fee_;
        private int memoTypeOneofCase_ = 0;
        private Object memoTypeOneof_;
        private int operationOneofCase_ = 0;
        private Object operationOneof_;
        private String passphrase_ = "";
        private ByteString privateKey_ = ByteString.EMPTY;
        private long sequence_;

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningInput, Builder> implements SigningInputOrBuilder {
            public /* synthetic */ Builder(C97641 r1) {
                this();
            }

            public Builder clearAccount() {
                copyOnWrite();
                ((SigningInput) this.instance).clearAccount();
                return this;
            }

            public Builder clearFee() {
                copyOnWrite();
                ((SigningInput) this.instance).clearFee();
                return this;
            }

            public Builder clearMemoHash() {
                copyOnWrite();
                ((SigningInput) this.instance).clearMemoHash();
                return this;
            }

            public Builder clearMemoId() {
                copyOnWrite();
                ((SigningInput) this.instance).clearMemoId();
                return this;
            }

            public Builder clearMemoReturnHash() {
                copyOnWrite();
                ((SigningInput) this.instance).clearMemoReturnHash();
                return this;
            }

            public Builder clearMemoText() {
                copyOnWrite();
                ((SigningInput) this.instance).clearMemoText();
                return this;
            }

            public Builder clearMemoTypeOneof() {
                copyOnWrite();
                ((SigningInput) this.instance).clearMemoTypeOneof();
                return this;
            }

            public Builder clearMemoVoid() {
                copyOnWrite();
                ((SigningInput) this.instance).clearMemoVoid();
                return this;
            }

            public Builder clearOpChangeTrust() {
                copyOnWrite();
                ((SigningInput) this.instance).clearOpChangeTrust();
                return this;
            }

            public Builder clearOpClaimClaimableBalance() {
                copyOnWrite();
                ((SigningInput) this.instance).clearOpClaimClaimableBalance();
                return this;
            }

            public Builder clearOpCreateAccount() {
                copyOnWrite();
                ((SigningInput) this.instance).clearOpCreateAccount();
                return this;
            }

            public Builder clearOpCreateClaimableBalance() {
                copyOnWrite();
                ((SigningInput) this.instance).clearOpCreateClaimableBalance();
                return this;
            }

            public Builder clearOpPayment() {
                copyOnWrite();
                ((SigningInput) this.instance).clearOpPayment();
                return this;
            }

            public Builder clearOperationOneof() {
                copyOnWrite();
                ((SigningInput) this.instance).clearOperationOneof();
                return this;
            }

            public Builder clearPassphrase() {
                copyOnWrite();
                ((SigningInput) this.instance).clearPassphrase();
                return this;
            }

            public Builder clearPrivateKey() {
                copyOnWrite();
                ((SigningInput) this.instance).clearPrivateKey();
                return this;
            }

            public Builder clearSequence() {
                copyOnWrite();
                ((SigningInput) this.instance).clearSequence();
                return this;
            }

            public String getAccount() {
                return ((SigningInput) this.instance).getAccount();
            }

            public ByteString getAccountBytes() {
                return ((SigningInput) this.instance).getAccountBytes();
            }

            public int getFee() {
                return ((SigningInput) this.instance).getFee();
            }

            public MemoHash getMemoHash() {
                return ((SigningInput) this.instance).getMemoHash();
            }

            public MemoId getMemoId() {
                return ((SigningInput) this.instance).getMemoId();
            }

            public MemoHash getMemoReturnHash() {
                return ((SigningInput) this.instance).getMemoReturnHash();
            }

            public MemoText getMemoText() {
                return ((SigningInput) this.instance).getMemoText();
            }

            public MemoTypeOneofCase getMemoTypeOneofCase() {
                return ((SigningInput) this.instance).getMemoTypeOneofCase();
            }

            public MemoVoid getMemoVoid() {
                return ((SigningInput) this.instance).getMemoVoid();
            }

            public OperationChangeTrust getOpChangeTrust() {
                return ((SigningInput) this.instance).getOpChangeTrust();
            }

            public OperationClaimClaimableBalance getOpClaimClaimableBalance() {
                return ((SigningInput) this.instance).getOpClaimClaimableBalance();
            }

            public OperationCreateAccount getOpCreateAccount() {
                return ((SigningInput) this.instance).getOpCreateAccount();
            }

            public OperationCreateClaimableBalance getOpCreateClaimableBalance() {
                return ((SigningInput) this.instance).getOpCreateClaimableBalance();
            }

            public OperationPayment getOpPayment() {
                return ((SigningInput) this.instance).getOpPayment();
            }

            public OperationOneofCase getOperationOneofCase() {
                return ((SigningInput) this.instance).getOperationOneofCase();
            }

            public String getPassphrase() {
                return ((SigningInput) this.instance).getPassphrase();
            }

            public ByteString getPassphraseBytes() {
                return ((SigningInput) this.instance).getPassphraseBytes();
            }

            public ByteString getPrivateKey() {
                return ((SigningInput) this.instance).getPrivateKey();
            }

            public long getSequence() {
                return ((SigningInput) this.instance).getSequence();
            }

            public boolean hasMemoHash() {
                return ((SigningInput) this.instance).hasMemoHash();
            }

            public boolean hasMemoId() {
                return ((SigningInput) this.instance).hasMemoId();
            }

            public boolean hasMemoReturnHash() {
                return ((SigningInput) this.instance).hasMemoReturnHash();
            }

            public boolean hasMemoText() {
                return ((SigningInput) this.instance).hasMemoText();
            }

            public boolean hasMemoVoid() {
                return ((SigningInput) this.instance).hasMemoVoid();
            }

            public boolean hasOpChangeTrust() {
                return ((SigningInput) this.instance).hasOpChangeTrust();
            }

            public boolean hasOpClaimClaimableBalance() {
                return ((SigningInput) this.instance).hasOpClaimClaimableBalance();
            }

            public boolean hasOpCreateAccount() {
                return ((SigningInput) this.instance).hasOpCreateAccount();
            }

            public boolean hasOpCreateClaimableBalance() {
                return ((SigningInput) this.instance).hasOpCreateClaimableBalance();
            }

            public boolean hasOpPayment() {
                return ((SigningInput) this.instance).hasOpPayment();
            }

            public Builder mergeMemoHash(MemoHash memoHash) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeMemoHash(memoHash);
                return this;
            }

            public Builder mergeMemoId(MemoId memoId) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeMemoId(memoId);
                return this;
            }

            public Builder mergeMemoReturnHash(MemoHash memoHash) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeMemoReturnHash(memoHash);
                return this;
            }

            public Builder mergeMemoText(MemoText memoText) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeMemoText(memoText);
                return this;
            }

            public Builder mergeMemoVoid(MemoVoid memoVoid) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeMemoVoid(memoVoid);
                return this;
            }

            public Builder mergeOpChangeTrust(OperationChangeTrust operationChangeTrust) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeOpChangeTrust(operationChangeTrust);
                return this;
            }

            public Builder mergeOpClaimClaimableBalance(OperationClaimClaimableBalance operationClaimClaimableBalance) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeOpClaimClaimableBalance(operationClaimClaimableBalance);
                return this;
            }

            public Builder mergeOpCreateAccount(OperationCreateAccount operationCreateAccount) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeOpCreateAccount(operationCreateAccount);
                return this;
            }

            public Builder mergeOpCreateClaimableBalance(OperationCreateClaimableBalance operationCreateClaimableBalance) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeOpCreateClaimableBalance(operationCreateClaimableBalance);
                return this;
            }

            public Builder mergeOpPayment(OperationPayment operationPayment) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeOpPayment(operationPayment);
                return this;
            }

            public Builder setAccount(String str) {
                copyOnWrite();
                ((SigningInput) this.instance).setAccount(str);
                return this;
            }

            public Builder setAccountBytes(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setAccountBytes(byteString);
                return this;
            }

            public Builder setFee(int i) {
                copyOnWrite();
                ((SigningInput) this.instance).setFee(i);
                return this;
            }

            public Builder setMemoHash(MemoHash memoHash) {
                copyOnWrite();
                ((SigningInput) this.instance).setMemoHash(memoHash);
                return this;
            }

            public Builder setMemoId(MemoId memoId) {
                copyOnWrite();
                ((SigningInput) this.instance).setMemoId(memoId);
                return this;
            }

            public Builder setMemoReturnHash(MemoHash memoHash) {
                copyOnWrite();
                ((SigningInput) this.instance).setMemoReturnHash(memoHash);
                return this;
            }

            public Builder setMemoText(MemoText memoText) {
                copyOnWrite();
                ((SigningInput) this.instance).setMemoText(memoText);
                return this;
            }

            public Builder setMemoVoid(MemoVoid memoVoid) {
                copyOnWrite();
                ((SigningInput) this.instance).setMemoVoid(memoVoid);
                return this;
            }

            public Builder setOpChangeTrust(OperationChangeTrust operationChangeTrust) {
                copyOnWrite();
                ((SigningInput) this.instance).setOpChangeTrust(operationChangeTrust);
                return this;
            }

            public Builder setOpClaimClaimableBalance(OperationClaimClaimableBalance operationClaimClaimableBalance) {
                copyOnWrite();
                ((SigningInput) this.instance).setOpClaimClaimableBalance(operationClaimClaimableBalance);
                return this;
            }

            public Builder setOpCreateAccount(OperationCreateAccount operationCreateAccount) {
                copyOnWrite();
                ((SigningInput) this.instance).setOpCreateAccount(operationCreateAccount);
                return this;
            }

            public Builder setOpCreateClaimableBalance(OperationCreateClaimableBalance operationCreateClaimableBalance) {
                copyOnWrite();
                ((SigningInput) this.instance).setOpCreateClaimableBalance(operationCreateClaimableBalance);
                return this;
            }

            public Builder setOpPayment(OperationPayment operationPayment) {
                copyOnWrite();
                ((SigningInput) this.instance).setOpPayment(operationPayment);
                return this;
            }

            public Builder setPassphrase(String str) {
                copyOnWrite();
                ((SigningInput) this.instance).setPassphrase(str);
                return this;
            }

            public Builder setPassphraseBytes(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setPassphraseBytes(byteString);
                return this;
            }

            public Builder setPrivateKey(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setPrivateKey(byteString);
                return this;
            }

            public Builder setSequence(long j) {
                copyOnWrite();
                ((SigningInput) this.instance).setSequence(j);
                return this;
            }

            private Builder() {
                super(SigningInput.DEFAULT_INSTANCE);
            }

            public Builder setMemoHash(MemoHash.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setMemoHash((MemoHash) builder.build());
                return this;
            }

            public Builder setMemoId(MemoId.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setMemoId((MemoId) builder.build());
                return this;
            }

            public Builder setMemoReturnHash(MemoHash.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setMemoReturnHash((MemoHash) builder.build());
                return this;
            }

            public Builder setMemoText(MemoText.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setMemoText((MemoText) builder.build());
                return this;
            }

            public Builder setMemoVoid(MemoVoid.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setMemoVoid((MemoVoid) builder.build());
                return this;
            }

            public Builder setOpChangeTrust(OperationChangeTrust.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setOpChangeTrust((OperationChangeTrust) builder.build());
                return this;
            }

            public Builder setOpClaimClaimableBalance(OperationClaimClaimableBalance.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setOpClaimClaimableBalance((OperationClaimClaimableBalance) builder.build());
                return this;
            }

            public Builder setOpCreateAccount(OperationCreateAccount.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setOpCreateAccount((OperationCreateAccount) builder.build());
                return this;
            }

            public Builder setOpCreateClaimableBalance(OperationCreateClaimableBalance.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setOpCreateClaimableBalance((OperationCreateClaimableBalance) builder.build());
                return this;
            }

            public Builder setOpPayment(OperationPayment.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setOpPayment((OperationPayment) builder.build());
                return this;
            }
        }

        public enum MemoTypeOneofCase {
            MEMO_VOID(9),
            MEMO_TEXT(10),
            MEMO_ID(11),
            MEMO_HASH(12),
            MEMO_RETURN_HASH(13),
            MEMOTYPEONEOF_NOT_SET(0);
            
            private final int value;

            private MemoTypeOneofCase(int i) {
                this.value = i;
            }

            public static MemoTypeOneofCase forNumber(int i) {
                if (i == 0) {
                    return MEMOTYPEONEOF_NOT_SET;
                }
                switch (i) {
                    case 9:
                        return MEMO_VOID;
                    case 10:
                        return MEMO_TEXT;
                    case 11:
                        return MEMO_ID;
                    case 12:
                        return MEMO_HASH;
                    case 13:
                        return MEMO_RETURN_HASH;
                    default:
                        return null;
                }
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static MemoTypeOneofCase valueOf(int i) {
                return forNumber(i);
            }
        }

        public enum OperationOneofCase {
            OP_CREATE_ACCOUNT(6),
            OP_PAYMENT(7),
            OP_CHANGE_TRUST(8),
            OP_CREATE_CLAIMABLE_BALANCE(14),
            OP_CLAIM_CLAIMABLE_BALANCE(15),
            OPERATIONONEOF_NOT_SET(0);
            
            private final int value;

            private OperationOneofCase(int i) {
                this.value = i;
            }

            public static OperationOneofCase forNumber(int i) {
                if (i == 0) {
                    return OPERATIONONEOF_NOT_SET;
                }
                if (i == 6) {
                    return OP_CREATE_ACCOUNT;
                }
                if (i == 7) {
                    return OP_PAYMENT;
                }
                if (i == 8) {
                    return OP_CHANGE_TRUST;
                }
                if (i == 14) {
                    return OP_CREATE_CLAIMABLE_BALANCE;
                }
                if (i != 15) {
                    return null;
                }
                return OP_CLAIM_CLAIMABLE_BALANCE;
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
        public void clearAccount() {
            this.account_ = getDefaultInstance().getAccount();
        }

        /* access modifiers changed from: private */
        public void clearFee() {
            this.fee_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearMemoHash() {
            if (this.memoTypeOneofCase_ == 12) {
                this.memoTypeOneofCase_ = 0;
                this.memoTypeOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearMemoId() {
            if (this.memoTypeOneofCase_ == 11) {
                this.memoTypeOneofCase_ = 0;
                this.memoTypeOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearMemoReturnHash() {
            if (this.memoTypeOneofCase_ == 13) {
                this.memoTypeOneofCase_ = 0;
                this.memoTypeOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearMemoText() {
            if (this.memoTypeOneofCase_ == 10) {
                this.memoTypeOneofCase_ = 0;
                this.memoTypeOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearMemoTypeOneof() {
            this.memoTypeOneofCase_ = 0;
            this.memoTypeOneof_ = null;
        }

        /* access modifiers changed from: private */
        public void clearMemoVoid() {
            if (this.memoTypeOneofCase_ == 9) {
                this.memoTypeOneofCase_ = 0;
                this.memoTypeOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearOpChangeTrust() {
            if (this.operationOneofCase_ == 8) {
                this.operationOneofCase_ = 0;
                this.operationOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearOpClaimClaimableBalance() {
            if (this.operationOneofCase_ == 15) {
                this.operationOneofCase_ = 0;
                this.operationOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearOpCreateAccount() {
            if (this.operationOneofCase_ == 6) {
                this.operationOneofCase_ = 0;
                this.operationOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearOpCreateClaimableBalance() {
            if (this.operationOneofCase_ == 14) {
                this.operationOneofCase_ = 0;
                this.operationOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearOpPayment() {
            if (this.operationOneofCase_ == 7) {
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
        public void clearPassphrase() {
            this.passphrase_ = getDefaultInstance().getPassphrase();
        }

        /* access modifiers changed from: private */
        public void clearPrivateKey() {
            this.privateKey_ = getDefaultInstance().getPrivateKey();
        }

        /* access modifiers changed from: private */
        public void clearSequence() {
            this.sequence_ = 0;
        }

        public static SigningInput getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeMemoHash(MemoHash memoHash) {
            memoHash.getClass();
            if (this.memoTypeOneofCase_ != 12 || this.memoTypeOneof_ == MemoHash.getDefaultInstance()) {
                this.memoTypeOneof_ = memoHash;
            } else {
                this.memoTypeOneof_ = ((MemoHash.Builder) MemoHash.newBuilder((MemoHash) this.memoTypeOneof_).mergeFrom(memoHash)).buildPartial();
            }
            this.memoTypeOneofCase_ = 12;
        }

        /* access modifiers changed from: private */
        public void mergeMemoId(MemoId memoId) {
            memoId.getClass();
            if (this.memoTypeOneofCase_ != 11 || this.memoTypeOneof_ == MemoId.getDefaultInstance()) {
                this.memoTypeOneof_ = memoId;
            } else {
                this.memoTypeOneof_ = ((MemoId.Builder) MemoId.newBuilder((MemoId) this.memoTypeOneof_).mergeFrom(memoId)).buildPartial();
            }
            this.memoTypeOneofCase_ = 11;
        }

        /* access modifiers changed from: private */
        public void mergeMemoReturnHash(MemoHash memoHash) {
            memoHash.getClass();
            if (this.memoTypeOneofCase_ != 13 || this.memoTypeOneof_ == MemoHash.getDefaultInstance()) {
                this.memoTypeOneof_ = memoHash;
            } else {
                this.memoTypeOneof_ = ((MemoHash.Builder) MemoHash.newBuilder((MemoHash) this.memoTypeOneof_).mergeFrom(memoHash)).buildPartial();
            }
            this.memoTypeOneofCase_ = 13;
        }

        /* access modifiers changed from: private */
        public void mergeMemoText(MemoText memoText) {
            memoText.getClass();
            if (this.memoTypeOneofCase_ != 10 || this.memoTypeOneof_ == MemoText.getDefaultInstance()) {
                this.memoTypeOneof_ = memoText;
            } else {
                this.memoTypeOneof_ = ((MemoText.Builder) MemoText.newBuilder((MemoText) this.memoTypeOneof_).mergeFrom(memoText)).buildPartial();
            }
            this.memoTypeOneofCase_ = 10;
        }

        /* access modifiers changed from: private */
        public void mergeMemoVoid(MemoVoid memoVoid) {
            memoVoid.getClass();
            if (this.memoTypeOneofCase_ != 9 || this.memoTypeOneof_ == MemoVoid.getDefaultInstance()) {
                this.memoTypeOneof_ = memoVoid;
            } else {
                this.memoTypeOneof_ = ((MemoVoid.Builder) MemoVoid.newBuilder((MemoVoid) this.memoTypeOneof_).mergeFrom(memoVoid)).buildPartial();
            }
            this.memoTypeOneofCase_ = 9;
        }

        /* access modifiers changed from: private */
        public void mergeOpChangeTrust(OperationChangeTrust operationChangeTrust) {
            operationChangeTrust.getClass();
            if (this.operationOneofCase_ != 8 || this.operationOneof_ == OperationChangeTrust.getDefaultInstance()) {
                this.operationOneof_ = operationChangeTrust;
            } else {
                this.operationOneof_ = ((OperationChangeTrust.Builder) OperationChangeTrust.newBuilder((OperationChangeTrust) this.operationOneof_).mergeFrom(operationChangeTrust)).buildPartial();
            }
            this.operationOneofCase_ = 8;
        }

        /* access modifiers changed from: private */
        public void mergeOpClaimClaimableBalance(OperationClaimClaimableBalance operationClaimClaimableBalance) {
            operationClaimClaimableBalance.getClass();
            if (this.operationOneofCase_ != 15 || this.operationOneof_ == OperationClaimClaimableBalance.getDefaultInstance()) {
                this.operationOneof_ = operationClaimClaimableBalance;
            } else {
                this.operationOneof_ = ((OperationClaimClaimableBalance.Builder) OperationClaimClaimableBalance.newBuilder((OperationClaimClaimableBalance) this.operationOneof_).mergeFrom(operationClaimClaimableBalance)).buildPartial();
            }
            this.operationOneofCase_ = 15;
        }

        /* access modifiers changed from: private */
        public void mergeOpCreateAccount(OperationCreateAccount operationCreateAccount) {
            operationCreateAccount.getClass();
            if (this.operationOneofCase_ != 6 || this.operationOneof_ == OperationCreateAccount.getDefaultInstance()) {
                this.operationOneof_ = operationCreateAccount;
            } else {
                this.operationOneof_ = ((OperationCreateAccount.Builder) OperationCreateAccount.newBuilder((OperationCreateAccount) this.operationOneof_).mergeFrom(operationCreateAccount)).buildPartial();
            }
            this.operationOneofCase_ = 6;
        }

        /* access modifiers changed from: private */
        public void mergeOpCreateClaimableBalance(OperationCreateClaimableBalance operationCreateClaimableBalance) {
            operationCreateClaimableBalance.getClass();
            if (this.operationOneofCase_ != 14 || this.operationOneof_ == OperationCreateClaimableBalance.getDefaultInstance()) {
                this.operationOneof_ = operationCreateClaimableBalance;
            } else {
                this.operationOneof_ = ((OperationCreateClaimableBalance.Builder) OperationCreateClaimableBalance.newBuilder((OperationCreateClaimableBalance) this.operationOneof_).mergeFrom(operationCreateClaimableBalance)).buildPartial();
            }
            this.operationOneofCase_ = 14;
        }

        /* access modifiers changed from: private */
        public void mergeOpPayment(OperationPayment operationPayment) {
            operationPayment.getClass();
            if (this.operationOneofCase_ != 7 || this.operationOneof_ == OperationPayment.getDefaultInstance()) {
                this.operationOneof_ = operationPayment;
            } else {
                this.operationOneof_ = ((OperationPayment.Builder) OperationPayment.newBuilder((OperationPayment) this.operationOneof_).mergeFrom(operationPayment)).buildPartial();
            }
            this.operationOneofCase_ = 7;
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
        public void setAccount(String str) {
            str.getClass();
            this.account_ = str;
        }

        /* access modifiers changed from: private */
        public void setAccountBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.account_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setFee(int i) {
            this.fee_ = i;
        }

        /* access modifiers changed from: private */
        public void setMemoHash(MemoHash memoHash) {
            memoHash.getClass();
            this.memoTypeOneof_ = memoHash;
            this.memoTypeOneofCase_ = 12;
        }

        /* access modifiers changed from: private */
        public void setMemoId(MemoId memoId) {
            memoId.getClass();
            this.memoTypeOneof_ = memoId;
            this.memoTypeOneofCase_ = 11;
        }

        /* access modifiers changed from: private */
        public void setMemoReturnHash(MemoHash memoHash) {
            memoHash.getClass();
            this.memoTypeOneof_ = memoHash;
            this.memoTypeOneofCase_ = 13;
        }

        /* access modifiers changed from: private */
        public void setMemoText(MemoText memoText) {
            memoText.getClass();
            this.memoTypeOneof_ = memoText;
            this.memoTypeOneofCase_ = 10;
        }

        /* access modifiers changed from: private */
        public void setMemoVoid(MemoVoid memoVoid) {
            memoVoid.getClass();
            this.memoTypeOneof_ = memoVoid;
            this.memoTypeOneofCase_ = 9;
        }

        /* access modifiers changed from: private */
        public void setOpChangeTrust(OperationChangeTrust operationChangeTrust) {
            operationChangeTrust.getClass();
            this.operationOneof_ = operationChangeTrust;
            this.operationOneofCase_ = 8;
        }

        /* access modifiers changed from: private */
        public void setOpClaimClaimableBalance(OperationClaimClaimableBalance operationClaimClaimableBalance) {
            operationClaimClaimableBalance.getClass();
            this.operationOneof_ = operationClaimClaimableBalance;
            this.operationOneofCase_ = 15;
        }

        /* access modifiers changed from: private */
        public void setOpCreateAccount(OperationCreateAccount operationCreateAccount) {
            operationCreateAccount.getClass();
            this.operationOneof_ = operationCreateAccount;
            this.operationOneofCase_ = 6;
        }

        /* access modifiers changed from: private */
        public void setOpCreateClaimableBalance(OperationCreateClaimableBalance operationCreateClaimableBalance) {
            operationCreateClaimableBalance.getClass();
            this.operationOneof_ = operationCreateClaimableBalance;
            this.operationOneofCase_ = 14;
        }

        /* access modifiers changed from: private */
        public void setOpPayment(OperationPayment operationPayment) {
            operationPayment.getClass();
            this.operationOneof_ = operationPayment;
            this.operationOneofCase_ = 7;
        }

        /* access modifiers changed from: private */
        public void setPassphrase(String str) {
            str.getClass();
            this.passphrase_ = str;
        }

        /* access modifiers changed from: private */
        public void setPassphraseBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.passphrase_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setPrivateKey(ByteString byteString) {
            byteString.getClass();
            this.privateKey_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setSequence(long j) {
            this.sequence_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Class<MemoHash> cls = MemoHash.class;
            switch (C97641.f46579xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningInput();
                case 2:
                    return new Builder((C97641) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0002\u0000\u0001\u000f\u000f\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003Ȉ\u0004\n\u0005Ȉ\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0001\n<\u0001\u000b<\u0001\f<\u0001\r<\u0001\u000e<\u0000\u000f<\u0000", new Object[]{"operationOneof_", "operationOneofCase_", "memoTypeOneof_", "memoTypeOneofCase_", "fee_", "sequence_", "account_", "privateKey_", "passphrase_", OperationCreateAccount.class, OperationPayment.class, OperationChangeTrust.class, MemoVoid.class, MemoText.class, MemoId.class, cls, cls, OperationCreateClaimableBalance.class, OperationClaimClaimableBalance.class});
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

        public String getAccount() {
            return this.account_;
        }

        public ByteString getAccountBytes() {
            return ByteString.copyFromUtf8(this.account_);
        }

        public int getFee() {
            return this.fee_;
        }

        public MemoHash getMemoHash() {
            if (this.memoTypeOneofCase_ == 12) {
                return (MemoHash) this.memoTypeOneof_;
            }
            return MemoHash.getDefaultInstance();
        }

        public MemoId getMemoId() {
            if (this.memoTypeOneofCase_ == 11) {
                return (MemoId) this.memoTypeOneof_;
            }
            return MemoId.getDefaultInstance();
        }

        public MemoHash getMemoReturnHash() {
            if (this.memoTypeOneofCase_ == 13) {
                return (MemoHash) this.memoTypeOneof_;
            }
            return MemoHash.getDefaultInstance();
        }

        public MemoText getMemoText() {
            if (this.memoTypeOneofCase_ == 10) {
                return (MemoText) this.memoTypeOneof_;
            }
            return MemoText.getDefaultInstance();
        }

        public MemoTypeOneofCase getMemoTypeOneofCase() {
            return MemoTypeOneofCase.forNumber(this.memoTypeOneofCase_);
        }

        public MemoVoid getMemoVoid() {
            if (this.memoTypeOneofCase_ == 9) {
                return (MemoVoid) this.memoTypeOneof_;
            }
            return MemoVoid.getDefaultInstance();
        }

        public OperationChangeTrust getOpChangeTrust() {
            if (this.operationOneofCase_ == 8) {
                return (OperationChangeTrust) this.operationOneof_;
            }
            return OperationChangeTrust.getDefaultInstance();
        }

        public OperationClaimClaimableBalance getOpClaimClaimableBalance() {
            if (this.operationOneofCase_ == 15) {
                return (OperationClaimClaimableBalance) this.operationOneof_;
            }
            return OperationClaimClaimableBalance.getDefaultInstance();
        }

        public OperationCreateAccount getOpCreateAccount() {
            if (this.operationOneofCase_ == 6) {
                return (OperationCreateAccount) this.operationOneof_;
            }
            return OperationCreateAccount.getDefaultInstance();
        }

        public OperationCreateClaimableBalance getOpCreateClaimableBalance() {
            if (this.operationOneofCase_ == 14) {
                return (OperationCreateClaimableBalance) this.operationOneof_;
            }
            return OperationCreateClaimableBalance.getDefaultInstance();
        }

        public OperationPayment getOpPayment() {
            if (this.operationOneofCase_ == 7) {
                return (OperationPayment) this.operationOneof_;
            }
            return OperationPayment.getDefaultInstance();
        }

        public OperationOneofCase getOperationOneofCase() {
            return OperationOneofCase.forNumber(this.operationOneofCase_);
        }

        public String getPassphrase() {
            return this.passphrase_;
        }

        public ByteString getPassphraseBytes() {
            return ByteString.copyFromUtf8(this.passphrase_);
        }

        public ByteString getPrivateKey() {
            return this.privateKey_;
        }

        public long getSequence() {
            return this.sequence_;
        }

        public boolean hasMemoHash() {
            if (this.memoTypeOneofCase_ == 12) {
                return true;
            }
            return false;
        }

        public boolean hasMemoId() {
            if (this.memoTypeOneofCase_ == 11) {
                return true;
            }
            return false;
        }

        public boolean hasMemoReturnHash() {
            if (this.memoTypeOneofCase_ == 13) {
                return true;
            }
            return false;
        }

        public boolean hasMemoText() {
            if (this.memoTypeOneofCase_ == 10) {
                return true;
            }
            return false;
        }

        public boolean hasMemoVoid() {
            if (this.memoTypeOneofCase_ == 9) {
                return true;
            }
            return false;
        }

        public boolean hasOpChangeTrust() {
            if (this.operationOneofCase_ == 8) {
                return true;
            }
            return false;
        }

        public boolean hasOpClaimClaimableBalance() {
            if (this.operationOneofCase_ == 15) {
                return true;
            }
            return false;
        }

        public boolean hasOpCreateAccount() {
            if (this.operationOneofCase_ == 6) {
                return true;
            }
            return false;
        }

        public boolean hasOpCreateClaimableBalance() {
            if (this.operationOneofCase_ == 14) {
                return true;
            }
            return false;
        }

        public boolean hasOpPayment() {
            if (this.operationOneofCase_ == 7) {
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
        String getAccount();

        ByteString getAccountBytes();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        int getFee();

        MemoHash getMemoHash();

        MemoId getMemoId();

        MemoHash getMemoReturnHash();

        MemoText getMemoText();

        SigningInput.MemoTypeOneofCase getMemoTypeOneofCase();

        MemoVoid getMemoVoid();

        OperationChangeTrust getOpChangeTrust();

        OperationClaimClaimableBalance getOpClaimClaimableBalance();

        OperationCreateAccount getOpCreateAccount();

        OperationCreateClaimableBalance getOpCreateClaimableBalance();

        OperationPayment getOpPayment();

        SigningInput.OperationOneofCase getOperationOneofCase();

        String getPassphrase();

        ByteString getPassphraseBytes();

        ByteString getPrivateKey();

        long getSequence();

        boolean hasMemoHash();

        boolean hasMemoId();

        boolean hasMemoReturnHash();

        boolean hasMemoText();

        boolean hasMemoVoid();

        boolean hasOpChangeTrust();

        boolean hasOpClaimClaimableBalance();

        boolean hasOpCreateAccount();

        boolean hasOpCreateClaimableBalance();

        boolean hasOpPayment();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SigningOutput extends GeneratedMessageLite<SigningOutput, Builder> implements SigningOutputOrBuilder {
        /* access modifiers changed from: private */
        public static final SigningOutput DEFAULT_INSTANCE;
        private static volatile im4<SigningOutput> PARSER = null;
        public static final int SIGNATURE_FIELD_NUMBER = 1;
        private String signature_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningOutput, Builder> implements SigningOutputOrBuilder {
            public /* synthetic */ Builder(C97641 r1) {
                this();
            }

            public Builder clearSignature() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearSignature();
                return this;
            }

            public String getSignature() {
                return ((SigningOutput) this.instance).getSignature();
            }

            public ByteString getSignatureBytes() {
                return ((SigningOutput) this.instance).getSignatureBytes();
            }

            public Builder setSignature(String str) {
                copyOnWrite();
                ((SigningOutput) this.instance).setSignature(str);
                return this;
            }

            public Builder setSignatureBytes(ByteString byteString) {
                copyOnWrite();
                ((SigningOutput) this.instance).setSignatureBytes(byteString);
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
        public void setSignature(String str) {
            str.getClass();
            this.signature_ = str;
        }

        /* access modifiers changed from: private */
        public void setSignatureBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.signature_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97641.f46579xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningOutput();
                case 2:
                    return new Builder((C97641) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"signature_"});
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

        public String getSignature() {
            return this.signature_;
        }

        public ByteString getSignatureBytes() {
            return ByteString.copyFromUtf8(this.signature_);
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

        String getSignature();

        ByteString getSignatureBytes();

        /* synthetic */ boolean isInitialized();
    }

    private Stellar() {
    }

    public static void registerAllExtensions(C4987l lVar) {
    }
}
