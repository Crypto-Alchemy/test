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

public final class Aptos {

    /* renamed from: wallet.core.jni.proto.Aptos$1 */
    public static /* synthetic */ class C97271 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f46543xa1df5c61;

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
                f46543xa1df5c61 = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f46543xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f46543xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f46543xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f46543xa1df5c61     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f46543xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f46543xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wallet.core.jni.proto.Aptos.C97271.<clinit>():void");
        }
    }

    public static final class CancelOfferNftMessage extends GeneratedMessageLite<CancelOfferNftMessage, Builder> implements CancelOfferNftMessageOrBuilder {
        public static final int COLLECTIONNAME_FIELD_NUMBER = 3;
        public static final int CREATOR_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final CancelOfferNftMessage DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 4;
        private static volatile im4<CancelOfferNftMessage> PARSER = null;
        public static final int PROPERTY_VERSION_FIELD_NUMBER = 5;
        public static final int RECEIVER_FIELD_NUMBER = 1;
        private String collectionName_ = "";
        private String creator_ = "";
        private String name_ = "";
        private long propertyVersion_;
        private String receiver_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<CancelOfferNftMessage, Builder> implements CancelOfferNftMessageOrBuilder {
            public /* synthetic */ Builder(C97271 r1) {
                this();
            }

            public Builder clearCollectionName() {
                copyOnWrite();
                ((CancelOfferNftMessage) this.instance).clearCollectionName();
                return this;
            }

            public Builder clearCreator() {
                copyOnWrite();
                ((CancelOfferNftMessage) this.instance).clearCreator();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((CancelOfferNftMessage) this.instance).clearName();
                return this;
            }

            public Builder clearPropertyVersion() {
                copyOnWrite();
                ((CancelOfferNftMessage) this.instance).clearPropertyVersion();
                return this;
            }

            public Builder clearReceiver() {
                copyOnWrite();
                ((CancelOfferNftMessage) this.instance).clearReceiver();
                return this;
            }

            public String getCollectionName() {
                return ((CancelOfferNftMessage) this.instance).getCollectionName();
            }

            public ByteString getCollectionNameBytes() {
                return ((CancelOfferNftMessage) this.instance).getCollectionNameBytes();
            }

            public String getCreator() {
                return ((CancelOfferNftMessage) this.instance).getCreator();
            }

            public ByteString getCreatorBytes() {
                return ((CancelOfferNftMessage) this.instance).getCreatorBytes();
            }

            public String getName() {
                return ((CancelOfferNftMessage) this.instance).getName();
            }

            public ByteString getNameBytes() {
                return ((CancelOfferNftMessage) this.instance).getNameBytes();
            }

            public long getPropertyVersion() {
                return ((CancelOfferNftMessage) this.instance).getPropertyVersion();
            }

            public String getReceiver() {
                return ((CancelOfferNftMessage) this.instance).getReceiver();
            }

            public ByteString getReceiverBytes() {
                return ((CancelOfferNftMessage) this.instance).getReceiverBytes();
            }

            public Builder setCollectionName(String str) {
                copyOnWrite();
                ((CancelOfferNftMessage) this.instance).setCollectionName(str);
                return this;
            }

            public Builder setCollectionNameBytes(ByteString byteString) {
                copyOnWrite();
                ((CancelOfferNftMessage) this.instance).setCollectionNameBytes(byteString);
                return this;
            }

            public Builder setCreator(String str) {
                copyOnWrite();
                ((CancelOfferNftMessage) this.instance).setCreator(str);
                return this;
            }

            public Builder setCreatorBytes(ByteString byteString) {
                copyOnWrite();
                ((CancelOfferNftMessage) this.instance).setCreatorBytes(byteString);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((CancelOfferNftMessage) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((CancelOfferNftMessage) this.instance).setNameBytes(byteString);
                return this;
            }

            public Builder setPropertyVersion(long j) {
                copyOnWrite();
                ((CancelOfferNftMessage) this.instance).setPropertyVersion(j);
                return this;
            }

            public Builder setReceiver(String str) {
                copyOnWrite();
                ((CancelOfferNftMessage) this.instance).setReceiver(str);
                return this;
            }

            public Builder setReceiverBytes(ByteString byteString) {
                copyOnWrite();
                ((CancelOfferNftMessage) this.instance).setReceiverBytes(byteString);
                return this;
            }

            private Builder() {
                super(CancelOfferNftMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            CancelOfferNftMessage cancelOfferNftMessage = new CancelOfferNftMessage();
            DEFAULT_INSTANCE = cancelOfferNftMessage;
            GeneratedMessageLite.registerDefaultInstance(CancelOfferNftMessage.class, cancelOfferNftMessage);
        }

        private CancelOfferNftMessage() {
        }

        /* access modifiers changed from: private */
        public void clearCollectionName() {
            this.collectionName_ = getDefaultInstance().getCollectionName();
        }

        /* access modifiers changed from: private */
        public void clearCreator() {
            this.creator_ = getDefaultInstance().getCreator();
        }

        /* access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* access modifiers changed from: private */
        public void clearPropertyVersion() {
            this.propertyVersion_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearReceiver() {
            this.receiver_ = getDefaultInstance().getReceiver();
        }

        public static CancelOfferNftMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static CancelOfferNftMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CancelOfferNftMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CancelOfferNftMessage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CancelOfferNftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<CancelOfferNftMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setCollectionName(String str) {
            str.getClass();
            this.collectionName_ = str;
        }

        /* access modifiers changed from: private */
        public void setCollectionNameBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.collectionName_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setCreator(String str) {
            str.getClass();
            this.creator_ = str;
        }

        /* access modifiers changed from: private */
        public void setCreatorBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.creator_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.name_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setPropertyVersion(long j) {
            this.propertyVersion_ = j;
        }

        /* access modifiers changed from: private */
        public void setReceiver(String str) {
            str.getClass();
            this.receiver_ = str;
        }

        /* access modifiers changed from: private */
        public void setReceiverBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.receiver_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97271.f46543xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new CancelOfferNftMessage();
                case 2:
                    return new Builder((C97271) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u0003", new Object[]{"receiver_", "creator_", "collectionName_", "name_", "propertyVersion_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<CancelOfferNftMessage> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (CancelOfferNftMessage.class) {
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

        public String getCollectionName() {
            return this.collectionName_;
        }

        public ByteString getCollectionNameBytes() {
            return ByteString.copyFromUtf8(this.collectionName_);
        }

        public String getCreator() {
            return this.creator_;
        }

        public ByteString getCreatorBytes() {
            return ByteString.copyFromUtf8(this.creator_);
        }

        public String getName() {
            return this.name_;
        }

        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        public long getPropertyVersion() {
            return this.propertyVersion_;
        }

        public String getReceiver() {
            return this.receiver_;
        }

        public ByteString getReceiverBytes() {
            return ByteString.copyFromUtf8(this.receiver_);
        }

        public static Builder newBuilder(CancelOfferNftMessage cancelOfferNftMessage) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(cancelOfferNftMessage);
        }

        public static CancelOfferNftMessage parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (CancelOfferNftMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static CancelOfferNftMessage parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (CancelOfferNftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static CancelOfferNftMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CancelOfferNftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CancelOfferNftMessage parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (CancelOfferNftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static CancelOfferNftMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CancelOfferNftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CancelOfferNftMessage parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (CancelOfferNftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static CancelOfferNftMessage parseFrom(InputStream inputStream) throws IOException {
            return (CancelOfferNftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CancelOfferNftMessage parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (CancelOfferNftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static CancelOfferNftMessage parseFrom(C4969g gVar) throws IOException {
            return (CancelOfferNftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static CancelOfferNftMessage parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (CancelOfferNftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface CancelOfferNftMessageOrBuilder extends qu3 {
        String getCollectionName();

        ByteString getCollectionNameBytes();

        String getCreator();

        ByteString getCreatorBytes();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getName();

        ByteString getNameBytes();

        long getPropertyVersion();

        String getReceiver();

        ByteString getReceiverBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class ClaimNftMessage extends GeneratedMessageLite<ClaimNftMessage, Builder> implements ClaimNftMessageOrBuilder {
        public static final int COLLECTIONNAME_FIELD_NUMBER = 3;
        public static final int CREATOR_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final ClaimNftMessage DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 4;
        private static volatile im4<ClaimNftMessage> PARSER = null;
        public static final int PROPERTY_VERSION_FIELD_NUMBER = 5;
        public static final int SENDER_FIELD_NUMBER = 1;
        private String collectionName_ = "";
        private String creator_ = "";
        private String name_ = "";
        private long propertyVersion_;
        private String sender_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<ClaimNftMessage, Builder> implements ClaimNftMessageOrBuilder {
            public /* synthetic */ Builder(C97271 r1) {
                this();
            }

            public Builder clearCollectionName() {
                copyOnWrite();
                ((ClaimNftMessage) this.instance).clearCollectionName();
                return this;
            }

            public Builder clearCreator() {
                copyOnWrite();
                ((ClaimNftMessage) this.instance).clearCreator();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((ClaimNftMessage) this.instance).clearName();
                return this;
            }

            public Builder clearPropertyVersion() {
                copyOnWrite();
                ((ClaimNftMessage) this.instance).clearPropertyVersion();
                return this;
            }

            public Builder clearSender() {
                copyOnWrite();
                ((ClaimNftMessage) this.instance).clearSender();
                return this;
            }

            public String getCollectionName() {
                return ((ClaimNftMessage) this.instance).getCollectionName();
            }

            public ByteString getCollectionNameBytes() {
                return ((ClaimNftMessage) this.instance).getCollectionNameBytes();
            }

            public String getCreator() {
                return ((ClaimNftMessage) this.instance).getCreator();
            }

            public ByteString getCreatorBytes() {
                return ((ClaimNftMessage) this.instance).getCreatorBytes();
            }

            public String getName() {
                return ((ClaimNftMessage) this.instance).getName();
            }

            public ByteString getNameBytes() {
                return ((ClaimNftMessage) this.instance).getNameBytes();
            }

            public long getPropertyVersion() {
                return ((ClaimNftMessage) this.instance).getPropertyVersion();
            }

            public String getSender() {
                return ((ClaimNftMessage) this.instance).getSender();
            }

            public ByteString getSenderBytes() {
                return ((ClaimNftMessage) this.instance).getSenderBytes();
            }

            public Builder setCollectionName(String str) {
                copyOnWrite();
                ((ClaimNftMessage) this.instance).setCollectionName(str);
                return this;
            }

            public Builder setCollectionNameBytes(ByteString byteString) {
                copyOnWrite();
                ((ClaimNftMessage) this.instance).setCollectionNameBytes(byteString);
                return this;
            }

            public Builder setCreator(String str) {
                copyOnWrite();
                ((ClaimNftMessage) this.instance).setCreator(str);
                return this;
            }

            public Builder setCreatorBytes(ByteString byteString) {
                copyOnWrite();
                ((ClaimNftMessage) this.instance).setCreatorBytes(byteString);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((ClaimNftMessage) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((ClaimNftMessage) this.instance).setNameBytes(byteString);
                return this;
            }

            public Builder setPropertyVersion(long j) {
                copyOnWrite();
                ((ClaimNftMessage) this.instance).setPropertyVersion(j);
                return this;
            }

            public Builder setSender(String str) {
                copyOnWrite();
                ((ClaimNftMessage) this.instance).setSender(str);
                return this;
            }

            public Builder setSenderBytes(ByteString byteString) {
                copyOnWrite();
                ((ClaimNftMessage) this.instance).setSenderBytes(byteString);
                return this;
            }

            private Builder() {
                super(ClaimNftMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            ClaimNftMessage claimNftMessage = new ClaimNftMessage();
            DEFAULT_INSTANCE = claimNftMessage;
            GeneratedMessageLite.registerDefaultInstance(ClaimNftMessage.class, claimNftMessage);
        }

        private ClaimNftMessage() {
        }

        /* access modifiers changed from: private */
        public void clearCollectionName() {
            this.collectionName_ = getDefaultInstance().getCollectionName();
        }

        /* access modifiers changed from: private */
        public void clearCreator() {
            this.creator_ = getDefaultInstance().getCreator();
        }

        /* access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* access modifiers changed from: private */
        public void clearPropertyVersion() {
            this.propertyVersion_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSender() {
            this.sender_ = getDefaultInstance().getSender();
        }

        public static ClaimNftMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ClaimNftMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ClaimNftMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClaimNftMessage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ClaimNftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<ClaimNftMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setCollectionName(String str) {
            str.getClass();
            this.collectionName_ = str;
        }

        /* access modifiers changed from: private */
        public void setCollectionNameBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.collectionName_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setCreator(String str) {
            str.getClass();
            this.creator_ = str;
        }

        /* access modifiers changed from: private */
        public void setCreatorBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.creator_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.name_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setPropertyVersion(long j) {
            this.propertyVersion_ = j;
        }

        /* access modifiers changed from: private */
        public void setSender(String str) {
            str.getClass();
            this.sender_ = str;
        }

        /* access modifiers changed from: private */
        public void setSenderBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.sender_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97271.f46543xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new ClaimNftMessage();
                case 2:
                    return new Builder((C97271) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u0003", new Object[]{"sender_", "creator_", "collectionName_", "name_", "propertyVersion_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<ClaimNftMessage> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (ClaimNftMessage.class) {
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

        public String getCollectionName() {
            return this.collectionName_;
        }

        public ByteString getCollectionNameBytes() {
            return ByteString.copyFromUtf8(this.collectionName_);
        }

        public String getCreator() {
            return this.creator_;
        }

        public ByteString getCreatorBytes() {
            return ByteString.copyFromUtf8(this.creator_);
        }

        public String getName() {
            return this.name_;
        }

        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        public long getPropertyVersion() {
            return this.propertyVersion_;
        }

        public String getSender() {
            return this.sender_;
        }

        public ByteString getSenderBytes() {
            return ByteString.copyFromUtf8(this.sender_);
        }

        public static Builder newBuilder(ClaimNftMessage claimNftMessage) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(claimNftMessage);
        }

        public static ClaimNftMessage parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (ClaimNftMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static ClaimNftMessage parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (ClaimNftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static ClaimNftMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ClaimNftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ClaimNftMessage parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (ClaimNftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static ClaimNftMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ClaimNftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ClaimNftMessage parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (ClaimNftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static ClaimNftMessage parseFrom(InputStream inputStream) throws IOException {
            return (ClaimNftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClaimNftMessage parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (ClaimNftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static ClaimNftMessage parseFrom(C4969g gVar) throws IOException {
            return (ClaimNftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static ClaimNftMessage parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (ClaimNftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface ClaimNftMessageOrBuilder extends qu3 {
        String getCollectionName();

        ByteString getCollectionNameBytes();

        String getCreator();

        ByteString getCreatorBytes();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getName();

        ByteString getNameBytes();

        long getPropertyVersion();

        String getSender();

        ByteString getSenderBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class CreateAccountMessage extends GeneratedMessageLite<CreateAccountMessage, Builder> implements CreateAccountMessageOrBuilder {
        public static final int AUTH_KEY_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final CreateAccountMessage DEFAULT_INSTANCE;
        private static volatile im4<CreateAccountMessage> PARSER;
        private String authKey_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<CreateAccountMessage, Builder> implements CreateAccountMessageOrBuilder {
            public /* synthetic */ Builder(C97271 r1) {
                this();
            }

            public Builder clearAuthKey() {
                copyOnWrite();
                ((CreateAccountMessage) this.instance).clearAuthKey();
                return this;
            }

            public String getAuthKey() {
                return ((CreateAccountMessage) this.instance).getAuthKey();
            }

            public ByteString getAuthKeyBytes() {
                return ((CreateAccountMessage) this.instance).getAuthKeyBytes();
            }

            public Builder setAuthKey(String str) {
                copyOnWrite();
                ((CreateAccountMessage) this.instance).setAuthKey(str);
                return this;
            }

            public Builder setAuthKeyBytes(ByteString byteString) {
                copyOnWrite();
                ((CreateAccountMessage) this.instance).setAuthKeyBytes(byteString);
                return this;
            }

            private Builder() {
                super(CreateAccountMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            CreateAccountMessage createAccountMessage = new CreateAccountMessage();
            DEFAULT_INSTANCE = createAccountMessage;
            GeneratedMessageLite.registerDefaultInstance(CreateAccountMessage.class, createAccountMessage);
        }

        private CreateAccountMessage() {
        }

        /* access modifiers changed from: private */
        public void clearAuthKey() {
            this.authKey_ = getDefaultInstance().getAuthKey();
        }

        public static CreateAccountMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static CreateAccountMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CreateAccountMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CreateAccountMessage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CreateAccountMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<CreateAccountMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAuthKey(String str) {
            str.getClass();
            this.authKey_ = str;
        }

        /* access modifiers changed from: private */
        public void setAuthKeyBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.authKey_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97271.f46543xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new CreateAccountMessage();
                case 2:
                    return new Builder((C97271) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"authKey_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<CreateAccountMessage> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (CreateAccountMessage.class) {
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

        public String getAuthKey() {
            return this.authKey_;
        }

        public ByteString getAuthKeyBytes() {
            return ByteString.copyFromUtf8(this.authKey_);
        }

        public static Builder newBuilder(CreateAccountMessage createAccountMessage) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(createAccountMessage);
        }

        public static CreateAccountMessage parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (CreateAccountMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static CreateAccountMessage parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (CreateAccountMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static CreateAccountMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CreateAccountMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CreateAccountMessage parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (CreateAccountMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static CreateAccountMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CreateAccountMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CreateAccountMessage parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (CreateAccountMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static CreateAccountMessage parseFrom(InputStream inputStream) throws IOException {
            return (CreateAccountMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CreateAccountMessage parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (CreateAccountMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static CreateAccountMessage parseFrom(C4969g gVar) throws IOException {
            return (CreateAccountMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static CreateAccountMessage parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (CreateAccountMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface CreateAccountMessageOrBuilder extends qu3 {
        String getAuthKey();

        ByteString getAuthKeyBytes();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        /* synthetic */ boolean isInitialized();
    }

    public static final class ManagedTokensRegisterMessage extends GeneratedMessageLite<ManagedTokensRegisterMessage, Builder> implements ManagedTokensRegisterMessageOrBuilder {
        /* access modifiers changed from: private */
        public static final ManagedTokensRegisterMessage DEFAULT_INSTANCE;
        public static final int FUNCTION_FIELD_NUMBER = 1;
        private static volatile im4<ManagedTokensRegisterMessage> PARSER;
        private StructTag function_;

        public static final class Builder extends GeneratedMessageLite.C4930a<ManagedTokensRegisterMessage, Builder> implements ManagedTokensRegisterMessageOrBuilder {
            public /* synthetic */ Builder(C97271 r1) {
                this();
            }

            public Builder clearFunction() {
                copyOnWrite();
                ((ManagedTokensRegisterMessage) this.instance).clearFunction();
                return this;
            }

            public StructTag getFunction() {
                return ((ManagedTokensRegisterMessage) this.instance).getFunction();
            }

            public boolean hasFunction() {
                return ((ManagedTokensRegisterMessage) this.instance).hasFunction();
            }

            public Builder mergeFunction(StructTag structTag) {
                copyOnWrite();
                ((ManagedTokensRegisterMessage) this.instance).mergeFunction(structTag);
                return this;
            }

            public Builder setFunction(StructTag structTag) {
                copyOnWrite();
                ((ManagedTokensRegisterMessage) this.instance).setFunction(structTag);
                return this;
            }

            private Builder() {
                super(ManagedTokensRegisterMessage.DEFAULT_INSTANCE);
            }

            public Builder setFunction(StructTag.Builder builder) {
                copyOnWrite();
                ((ManagedTokensRegisterMessage) this.instance).setFunction((StructTag) builder.build());
                return this;
            }
        }

        static {
            ManagedTokensRegisterMessage managedTokensRegisterMessage = new ManagedTokensRegisterMessage();
            DEFAULT_INSTANCE = managedTokensRegisterMessage;
            GeneratedMessageLite.registerDefaultInstance(ManagedTokensRegisterMessage.class, managedTokensRegisterMessage);
        }

        private ManagedTokensRegisterMessage() {
        }

        /* access modifiers changed from: private */
        public void clearFunction() {
            this.function_ = null;
        }

        public static ManagedTokensRegisterMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeFunction(StructTag structTag) {
            structTag.getClass();
            StructTag structTag2 = this.function_;
            if (structTag2 == null || structTag2 == StructTag.getDefaultInstance()) {
                this.function_ = structTag;
            } else {
                this.function_ = (StructTag) ((StructTag.Builder) StructTag.newBuilder(this.function_).mergeFrom(structTag)).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ManagedTokensRegisterMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ManagedTokensRegisterMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ManagedTokensRegisterMessage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ManagedTokensRegisterMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<ManagedTokensRegisterMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setFunction(StructTag structTag) {
            structTag.getClass();
            this.function_ = structTag;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97271.f46543xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new ManagedTokensRegisterMessage();
                case 2:
                    return new Builder((C97271) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"function_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<ManagedTokensRegisterMessage> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (ManagedTokensRegisterMessage.class) {
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

        public StructTag getFunction() {
            StructTag structTag = this.function_;
            if (structTag == null) {
                return StructTag.getDefaultInstance();
            }
            return structTag;
        }

        public boolean hasFunction() {
            if (this.function_ != null) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(ManagedTokensRegisterMessage managedTokensRegisterMessage) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(managedTokensRegisterMessage);
        }

        public static ManagedTokensRegisterMessage parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (ManagedTokensRegisterMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static ManagedTokensRegisterMessage parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (ManagedTokensRegisterMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static ManagedTokensRegisterMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ManagedTokensRegisterMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ManagedTokensRegisterMessage parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (ManagedTokensRegisterMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static ManagedTokensRegisterMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ManagedTokensRegisterMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ManagedTokensRegisterMessage parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (ManagedTokensRegisterMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static ManagedTokensRegisterMessage parseFrom(InputStream inputStream) throws IOException {
            return (ManagedTokensRegisterMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ManagedTokensRegisterMessage parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (ManagedTokensRegisterMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static ManagedTokensRegisterMessage parseFrom(C4969g gVar) throws IOException {
            return (ManagedTokensRegisterMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static ManagedTokensRegisterMessage parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (ManagedTokensRegisterMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface ManagedTokensRegisterMessageOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        StructTag getFunction();

        boolean hasFunction();

        /* synthetic */ boolean isInitialized();
    }

    public static final class NftMessage extends GeneratedMessageLite<NftMessage, Builder> implements NftMessageOrBuilder {
        public static final int CANCEL_OFFER_NFT_FIELD_NUMBER = 2;
        public static final int CLAIM_NFT_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final NftMessage DEFAULT_INSTANCE;
        public static final int OFFER_NFT_FIELD_NUMBER = 1;
        private static volatile im4<NftMessage> PARSER;
        private int nftTransactionPayloadCase_ = 0;
        private Object nftTransactionPayload_;

        public static final class Builder extends GeneratedMessageLite.C4930a<NftMessage, Builder> implements NftMessageOrBuilder {
            public /* synthetic */ Builder(C97271 r1) {
                this();
            }

            public Builder clearCancelOfferNft() {
                copyOnWrite();
                ((NftMessage) this.instance).clearCancelOfferNft();
                return this;
            }

            public Builder clearClaimNft() {
                copyOnWrite();
                ((NftMessage) this.instance).clearClaimNft();
                return this;
            }

            public Builder clearNftTransactionPayload() {
                copyOnWrite();
                ((NftMessage) this.instance).clearNftTransactionPayload();
                return this;
            }

            public Builder clearOfferNft() {
                copyOnWrite();
                ((NftMessage) this.instance).clearOfferNft();
                return this;
            }

            public CancelOfferNftMessage getCancelOfferNft() {
                return ((NftMessage) this.instance).getCancelOfferNft();
            }

            public ClaimNftMessage getClaimNft() {
                return ((NftMessage) this.instance).getClaimNft();
            }

            public NftTransactionPayloadCase getNftTransactionPayloadCase() {
                return ((NftMessage) this.instance).getNftTransactionPayloadCase();
            }

            public OfferNftMessage getOfferNft() {
                return ((NftMessage) this.instance).getOfferNft();
            }

            public boolean hasCancelOfferNft() {
                return ((NftMessage) this.instance).hasCancelOfferNft();
            }

            public boolean hasClaimNft() {
                return ((NftMessage) this.instance).hasClaimNft();
            }

            public boolean hasOfferNft() {
                return ((NftMessage) this.instance).hasOfferNft();
            }

            public Builder mergeCancelOfferNft(CancelOfferNftMessage cancelOfferNftMessage) {
                copyOnWrite();
                ((NftMessage) this.instance).mergeCancelOfferNft(cancelOfferNftMessage);
                return this;
            }

            public Builder mergeClaimNft(ClaimNftMessage claimNftMessage) {
                copyOnWrite();
                ((NftMessage) this.instance).mergeClaimNft(claimNftMessage);
                return this;
            }

            public Builder mergeOfferNft(OfferNftMessage offerNftMessage) {
                copyOnWrite();
                ((NftMessage) this.instance).mergeOfferNft(offerNftMessage);
                return this;
            }

            public Builder setCancelOfferNft(CancelOfferNftMessage cancelOfferNftMessage) {
                copyOnWrite();
                ((NftMessage) this.instance).setCancelOfferNft(cancelOfferNftMessage);
                return this;
            }

            public Builder setClaimNft(ClaimNftMessage claimNftMessage) {
                copyOnWrite();
                ((NftMessage) this.instance).setClaimNft(claimNftMessage);
                return this;
            }

            public Builder setOfferNft(OfferNftMessage offerNftMessage) {
                copyOnWrite();
                ((NftMessage) this.instance).setOfferNft(offerNftMessage);
                return this;
            }

            private Builder() {
                super(NftMessage.DEFAULT_INSTANCE);
            }

            public Builder setCancelOfferNft(CancelOfferNftMessage.Builder builder) {
                copyOnWrite();
                ((NftMessage) this.instance).setCancelOfferNft((CancelOfferNftMessage) builder.build());
                return this;
            }

            public Builder setClaimNft(ClaimNftMessage.Builder builder) {
                copyOnWrite();
                ((NftMessage) this.instance).setClaimNft((ClaimNftMessage) builder.build());
                return this;
            }

            public Builder setOfferNft(OfferNftMessage.Builder builder) {
                copyOnWrite();
                ((NftMessage) this.instance).setOfferNft((OfferNftMessage) builder.build());
                return this;
            }
        }

        public enum NftTransactionPayloadCase {
            OFFER_NFT(1),
            CANCEL_OFFER_NFT(2),
            CLAIM_NFT(3),
            NFTTRANSACTIONPAYLOAD_NOT_SET(0);
            
            private final int value;

            private NftTransactionPayloadCase(int i) {
                this.value = i;
            }

            public static NftTransactionPayloadCase forNumber(int i) {
                if (i == 0) {
                    return NFTTRANSACTIONPAYLOAD_NOT_SET;
                }
                if (i == 1) {
                    return OFFER_NFT;
                }
                if (i == 2) {
                    return CANCEL_OFFER_NFT;
                }
                if (i != 3) {
                    return null;
                }
                return CLAIM_NFT;
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static NftTransactionPayloadCase valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            NftMessage nftMessage = new NftMessage();
            DEFAULT_INSTANCE = nftMessage;
            GeneratedMessageLite.registerDefaultInstance(NftMessage.class, nftMessage);
        }

        private NftMessage() {
        }

        /* access modifiers changed from: private */
        public void clearCancelOfferNft() {
            if (this.nftTransactionPayloadCase_ == 2) {
                this.nftTransactionPayloadCase_ = 0;
                this.nftTransactionPayload_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearClaimNft() {
            if (this.nftTransactionPayloadCase_ == 3) {
                this.nftTransactionPayloadCase_ = 0;
                this.nftTransactionPayload_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearNftTransactionPayload() {
            this.nftTransactionPayloadCase_ = 0;
            this.nftTransactionPayload_ = null;
        }

        /* access modifiers changed from: private */
        public void clearOfferNft() {
            if (this.nftTransactionPayloadCase_ == 1) {
                this.nftTransactionPayloadCase_ = 0;
                this.nftTransactionPayload_ = null;
            }
        }

        public static NftMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeCancelOfferNft(CancelOfferNftMessage cancelOfferNftMessage) {
            cancelOfferNftMessage.getClass();
            if (this.nftTransactionPayloadCase_ != 2 || this.nftTransactionPayload_ == CancelOfferNftMessage.getDefaultInstance()) {
                this.nftTransactionPayload_ = cancelOfferNftMessage;
            } else {
                this.nftTransactionPayload_ = ((CancelOfferNftMessage.Builder) CancelOfferNftMessage.newBuilder((CancelOfferNftMessage) this.nftTransactionPayload_).mergeFrom(cancelOfferNftMessage)).buildPartial();
            }
            this.nftTransactionPayloadCase_ = 2;
        }

        /* access modifiers changed from: private */
        public void mergeClaimNft(ClaimNftMessage claimNftMessage) {
            claimNftMessage.getClass();
            if (this.nftTransactionPayloadCase_ != 3 || this.nftTransactionPayload_ == ClaimNftMessage.getDefaultInstance()) {
                this.nftTransactionPayload_ = claimNftMessage;
            } else {
                this.nftTransactionPayload_ = ((ClaimNftMessage.Builder) ClaimNftMessage.newBuilder((ClaimNftMessage) this.nftTransactionPayload_).mergeFrom(claimNftMessage)).buildPartial();
            }
            this.nftTransactionPayloadCase_ = 3;
        }

        /* access modifiers changed from: private */
        public void mergeOfferNft(OfferNftMessage offerNftMessage) {
            offerNftMessage.getClass();
            if (this.nftTransactionPayloadCase_ != 1 || this.nftTransactionPayload_ == OfferNftMessage.getDefaultInstance()) {
                this.nftTransactionPayload_ = offerNftMessage;
            } else {
                this.nftTransactionPayload_ = ((OfferNftMessage.Builder) OfferNftMessage.newBuilder((OfferNftMessage) this.nftTransactionPayload_).mergeFrom(offerNftMessage)).buildPartial();
            }
            this.nftTransactionPayloadCase_ = 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static NftMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NftMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NftMessage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (NftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<NftMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setCancelOfferNft(CancelOfferNftMessage cancelOfferNftMessage) {
            cancelOfferNftMessage.getClass();
            this.nftTransactionPayload_ = cancelOfferNftMessage;
            this.nftTransactionPayloadCase_ = 2;
        }

        /* access modifiers changed from: private */
        public void setClaimNft(ClaimNftMessage claimNftMessage) {
            claimNftMessage.getClass();
            this.nftTransactionPayload_ = claimNftMessage;
            this.nftTransactionPayloadCase_ = 3;
        }

        /* access modifiers changed from: private */
        public void setOfferNft(OfferNftMessage offerNftMessage) {
            offerNftMessage.getClass();
            this.nftTransactionPayload_ = offerNftMessage;
            this.nftTransactionPayloadCase_ = 1;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97271.f46543xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new NftMessage();
                case 2:
                    return new Builder((C97271) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"nftTransactionPayload_", "nftTransactionPayloadCase_", OfferNftMessage.class, CancelOfferNftMessage.class, ClaimNftMessage.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<NftMessage> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (NftMessage.class) {
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

        public CancelOfferNftMessage getCancelOfferNft() {
            if (this.nftTransactionPayloadCase_ == 2) {
                return (CancelOfferNftMessage) this.nftTransactionPayload_;
            }
            return CancelOfferNftMessage.getDefaultInstance();
        }

        public ClaimNftMessage getClaimNft() {
            if (this.nftTransactionPayloadCase_ == 3) {
                return (ClaimNftMessage) this.nftTransactionPayload_;
            }
            return ClaimNftMessage.getDefaultInstance();
        }

        public NftTransactionPayloadCase getNftTransactionPayloadCase() {
            return NftTransactionPayloadCase.forNumber(this.nftTransactionPayloadCase_);
        }

        public OfferNftMessage getOfferNft() {
            if (this.nftTransactionPayloadCase_ == 1) {
                return (OfferNftMessage) this.nftTransactionPayload_;
            }
            return OfferNftMessage.getDefaultInstance();
        }

        public boolean hasCancelOfferNft() {
            if (this.nftTransactionPayloadCase_ == 2) {
                return true;
            }
            return false;
        }

        public boolean hasClaimNft() {
            if (this.nftTransactionPayloadCase_ == 3) {
                return true;
            }
            return false;
        }

        public boolean hasOfferNft() {
            if (this.nftTransactionPayloadCase_ == 1) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(NftMessage nftMessage) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(nftMessage);
        }

        public static NftMessage parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (NftMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static NftMessage parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (NftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static NftMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (NftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NftMessage parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (NftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static NftMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (NftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NftMessage parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (NftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static NftMessage parseFrom(InputStream inputStream) throws IOException {
            return (NftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NftMessage parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (NftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static NftMessage parseFrom(C4969g gVar) throws IOException {
            return (NftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static NftMessage parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (NftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface NftMessageOrBuilder extends qu3 {
        CancelOfferNftMessage getCancelOfferNft();

        ClaimNftMessage getClaimNft();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        NftMessage.NftTransactionPayloadCase getNftTransactionPayloadCase();

        OfferNftMessage getOfferNft();

        boolean hasCancelOfferNft();

        boolean hasClaimNft();

        boolean hasOfferNft();

        /* synthetic */ boolean isInitialized();
    }

    public static final class OfferNftMessage extends GeneratedMessageLite<OfferNftMessage, Builder> implements OfferNftMessageOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 6;
        public static final int COLLECTIONNAME_FIELD_NUMBER = 3;
        public static final int CREATOR_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final OfferNftMessage DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 4;
        private static volatile im4<OfferNftMessage> PARSER = null;
        public static final int PROPERTY_VERSION_FIELD_NUMBER = 5;
        public static final int RECEIVER_FIELD_NUMBER = 1;
        private long amount_;
        private String collectionName_ = "";
        private String creator_ = "";
        private String name_ = "";
        private long propertyVersion_;
        private String receiver_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<OfferNftMessage, Builder> implements OfferNftMessageOrBuilder {
            public /* synthetic */ Builder(C97271 r1) {
                this();
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((OfferNftMessage) this.instance).clearAmount();
                return this;
            }

            public Builder clearCollectionName() {
                copyOnWrite();
                ((OfferNftMessage) this.instance).clearCollectionName();
                return this;
            }

            public Builder clearCreator() {
                copyOnWrite();
                ((OfferNftMessage) this.instance).clearCreator();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((OfferNftMessage) this.instance).clearName();
                return this;
            }

            public Builder clearPropertyVersion() {
                copyOnWrite();
                ((OfferNftMessage) this.instance).clearPropertyVersion();
                return this;
            }

            public Builder clearReceiver() {
                copyOnWrite();
                ((OfferNftMessage) this.instance).clearReceiver();
                return this;
            }

            public long getAmount() {
                return ((OfferNftMessage) this.instance).getAmount();
            }

            public String getCollectionName() {
                return ((OfferNftMessage) this.instance).getCollectionName();
            }

            public ByteString getCollectionNameBytes() {
                return ((OfferNftMessage) this.instance).getCollectionNameBytes();
            }

            public String getCreator() {
                return ((OfferNftMessage) this.instance).getCreator();
            }

            public ByteString getCreatorBytes() {
                return ((OfferNftMessage) this.instance).getCreatorBytes();
            }

            public String getName() {
                return ((OfferNftMessage) this.instance).getName();
            }

            public ByteString getNameBytes() {
                return ((OfferNftMessage) this.instance).getNameBytes();
            }

            public long getPropertyVersion() {
                return ((OfferNftMessage) this.instance).getPropertyVersion();
            }

            public String getReceiver() {
                return ((OfferNftMessage) this.instance).getReceiver();
            }

            public ByteString getReceiverBytes() {
                return ((OfferNftMessage) this.instance).getReceiverBytes();
            }

            public Builder setAmount(long j) {
                copyOnWrite();
                ((OfferNftMessage) this.instance).setAmount(j);
                return this;
            }

            public Builder setCollectionName(String str) {
                copyOnWrite();
                ((OfferNftMessage) this.instance).setCollectionName(str);
                return this;
            }

            public Builder setCollectionNameBytes(ByteString byteString) {
                copyOnWrite();
                ((OfferNftMessage) this.instance).setCollectionNameBytes(byteString);
                return this;
            }

            public Builder setCreator(String str) {
                copyOnWrite();
                ((OfferNftMessage) this.instance).setCreator(str);
                return this;
            }

            public Builder setCreatorBytes(ByteString byteString) {
                copyOnWrite();
                ((OfferNftMessage) this.instance).setCreatorBytes(byteString);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((OfferNftMessage) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((OfferNftMessage) this.instance).setNameBytes(byteString);
                return this;
            }

            public Builder setPropertyVersion(long j) {
                copyOnWrite();
                ((OfferNftMessage) this.instance).setPropertyVersion(j);
                return this;
            }

            public Builder setReceiver(String str) {
                copyOnWrite();
                ((OfferNftMessage) this.instance).setReceiver(str);
                return this;
            }

            public Builder setReceiverBytes(ByteString byteString) {
                copyOnWrite();
                ((OfferNftMessage) this.instance).setReceiverBytes(byteString);
                return this;
            }

            private Builder() {
                super(OfferNftMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            OfferNftMessage offerNftMessage = new OfferNftMessage();
            DEFAULT_INSTANCE = offerNftMessage;
            GeneratedMessageLite.registerDefaultInstance(OfferNftMessage.class, offerNftMessage);
        }

        private OfferNftMessage() {
        }

        /* access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearCollectionName() {
            this.collectionName_ = getDefaultInstance().getCollectionName();
        }

        /* access modifiers changed from: private */
        public void clearCreator() {
            this.creator_ = getDefaultInstance().getCreator();
        }

        /* access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* access modifiers changed from: private */
        public void clearPropertyVersion() {
            this.propertyVersion_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearReceiver() {
            this.receiver_ = getDefaultInstance().getReceiver();
        }

        public static OfferNftMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static OfferNftMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OfferNftMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OfferNftMessage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (OfferNftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<OfferNftMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAmount(long j) {
            this.amount_ = j;
        }

        /* access modifiers changed from: private */
        public void setCollectionName(String str) {
            str.getClass();
            this.collectionName_ = str;
        }

        /* access modifiers changed from: private */
        public void setCollectionNameBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.collectionName_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setCreator(String str) {
            str.getClass();
            this.creator_ = str;
        }

        /* access modifiers changed from: private */
        public void setCreatorBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.creator_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.name_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setPropertyVersion(long j) {
            this.propertyVersion_ = j;
        }

        /* access modifiers changed from: private */
        public void setReceiver(String str) {
            str.getClass();
            this.receiver_ = str;
        }

        /* access modifiers changed from: private */
        public void setReceiverBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.receiver_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97271.f46543xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new OfferNftMessage();
                case 2:
                    return new Builder((C97271) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u0003\u0006\u0003", new Object[]{"receiver_", "creator_", "collectionName_", "name_", "propertyVersion_", "amount_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<OfferNftMessage> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (OfferNftMessage.class) {
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

        public String getCollectionName() {
            return this.collectionName_;
        }

        public ByteString getCollectionNameBytes() {
            return ByteString.copyFromUtf8(this.collectionName_);
        }

        public String getCreator() {
            return this.creator_;
        }

        public ByteString getCreatorBytes() {
            return ByteString.copyFromUtf8(this.creator_);
        }

        public String getName() {
            return this.name_;
        }

        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        public long getPropertyVersion() {
            return this.propertyVersion_;
        }

        public String getReceiver() {
            return this.receiver_;
        }

        public ByteString getReceiverBytes() {
            return ByteString.copyFromUtf8(this.receiver_);
        }

        public static Builder newBuilder(OfferNftMessage offerNftMessage) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(offerNftMessage);
        }

        public static OfferNftMessage parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (OfferNftMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static OfferNftMessage parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (OfferNftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static OfferNftMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OfferNftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static OfferNftMessage parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (OfferNftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static OfferNftMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OfferNftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OfferNftMessage parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (OfferNftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static OfferNftMessage parseFrom(InputStream inputStream) throws IOException {
            return (OfferNftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OfferNftMessage parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (OfferNftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static OfferNftMessage parseFrom(C4969g gVar) throws IOException {
            return (OfferNftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static OfferNftMessage parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (OfferNftMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface OfferNftMessageOrBuilder extends qu3 {
        long getAmount();

        String getCollectionName();

        ByteString getCollectionNameBytes();

        String getCreator();

        ByteString getCreatorBytes();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getName();

        ByteString getNameBytes();

        long getPropertyVersion();

        String getReceiver();

        ByteString getReceiverBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SigningInput extends GeneratedMessageLite<SigningInput, Builder> implements SigningInputOrBuilder {
        public static final int ANY_ENCODED_FIELD_NUMBER = 8;
        public static final int CHAIN_ID_FIELD_NUMBER = 6;
        public static final int CREATE_ACCOUNT_FIELD_NUMBER = 11;
        /* access modifiers changed from: private */
        public static final SigningInput DEFAULT_INSTANCE;
        public static final int EXPIRATION_TIMESTAMP_SECS_FIELD_NUMBER = 5;
        public static final int GAS_UNIT_PRICE_FIELD_NUMBER = 4;
        public static final int MAX_GAS_AMOUNT_FIELD_NUMBER = 3;
        public static final int NFT_MESSAGE_FIELD_NUMBER = 12;
        private static volatile im4<SigningInput> PARSER = null;
        public static final int PRIVATE_KEY_FIELD_NUMBER = 7;
        public static final int REGISTER_TOKEN_FIELD_NUMBER = 13;
        public static final int SENDER_FIELD_NUMBER = 1;
        public static final int SEQUENCE_NUMBER_FIELD_NUMBER = 2;
        public static final int TOKEN_TRANSFER_FIELD_NUMBER = 10;
        public static final int TRANSFER_FIELD_NUMBER = 9;
        private String anyEncoded_ = "";
        private int chainId_;
        private long expirationTimestampSecs_;
        private long gasUnitPrice_;
        private long maxGasAmount_;
        private ByteString privateKey_ = ByteString.EMPTY;
        private String sender_ = "";
        private long sequenceNumber_;
        private int transactionPayloadCase_ = 0;
        private Object transactionPayload_;

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningInput, Builder> implements SigningInputOrBuilder {
            public /* synthetic */ Builder(C97271 r1) {
                this();
            }

            public Builder clearAnyEncoded() {
                copyOnWrite();
                ((SigningInput) this.instance).clearAnyEncoded();
                return this;
            }

            public Builder clearChainId() {
                copyOnWrite();
                ((SigningInput) this.instance).clearChainId();
                return this;
            }

            public Builder clearCreateAccount() {
                copyOnWrite();
                ((SigningInput) this.instance).clearCreateAccount();
                return this;
            }

            public Builder clearExpirationTimestampSecs() {
                copyOnWrite();
                ((SigningInput) this.instance).clearExpirationTimestampSecs();
                return this;
            }

            public Builder clearGasUnitPrice() {
                copyOnWrite();
                ((SigningInput) this.instance).clearGasUnitPrice();
                return this;
            }

            public Builder clearMaxGasAmount() {
                copyOnWrite();
                ((SigningInput) this.instance).clearMaxGasAmount();
                return this;
            }

            public Builder clearNftMessage() {
                copyOnWrite();
                ((SigningInput) this.instance).clearNftMessage();
                return this;
            }

            public Builder clearPrivateKey() {
                copyOnWrite();
                ((SigningInput) this.instance).clearPrivateKey();
                return this;
            }

            public Builder clearRegisterToken() {
                copyOnWrite();
                ((SigningInput) this.instance).clearRegisterToken();
                return this;
            }

            public Builder clearSender() {
                copyOnWrite();
                ((SigningInput) this.instance).clearSender();
                return this;
            }

            public Builder clearSequenceNumber() {
                copyOnWrite();
                ((SigningInput) this.instance).clearSequenceNumber();
                return this;
            }

            public Builder clearTokenTransfer() {
                copyOnWrite();
                ((SigningInput) this.instance).clearTokenTransfer();
                return this;
            }

            public Builder clearTransactionPayload() {
                copyOnWrite();
                ((SigningInput) this.instance).clearTransactionPayload();
                return this;
            }

            public Builder clearTransfer() {
                copyOnWrite();
                ((SigningInput) this.instance).clearTransfer();
                return this;
            }

            public String getAnyEncoded() {
                return ((SigningInput) this.instance).getAnyEncoded();
            }

            public ByteString getAnyEncodedBytes() {
                return ((SigningInput) this.instance).getAnyEncodedBytes();
            }

            public int getChainId() {
                return ((SigningInput) this.instance).getChainId();
            }

            public CreateAccountMessage getCreateAccount() {
                return ((SigningInput) this.instance).getCreateAccount();
            }

            public long getExpirationTimestampSecs() {
                return ((SigningInput) this.instance).getExpirationTimestampSecs();
            }

            public long getGasUnitPrice() {
                return ((SigningInput) this.instance).getGasUnitPrice();
            }

            public long getMaxGasAmount() {
                return ((SigningInput) this.instance).getMaxGasAmount();
            }

            public NftMessage getNftMessage() {
                return ((SigningInput) this.instance).getNftMessage();
            }

            public ByteString getPrivateKey() {
                return ((SigningInput) this.instance).getPrivateKey();
            }

            public ManagedTokensRegisterMessage getRegisterToken() {
                return ((SigningInput) this.instance).getRegisterToken();
            }

            public String getSender() {
                return ((SigningInput) this.instance).getSender();
            }

            public ByteString getSenderBytes() {
                return ((SigningInput) this.instance).getSenderBytes();
            }

            public long getSequenceNumber() {
                return ((SigningInput) this.instance).getSequenceNumber();
            }

            public TokenTransferMessage getTokenTransfer() {
                return ((SigningInput) this.instance).getTokenTransfer();
            }

            public TransactionPayloadCase getTransactionPayloadCase() {
                return ((SigningInput) this.instance).getTransactionPayloadCase();
            }

            public TransferMessage getTransfer() {
                return ((SigningInput) this.instance).getTransfer();
            }

            public boolean hasCreateAccount() {
                return ((SigningInput) this.instance).hasCreateAccount();
            }

            public boolean hasNftMessage() {
                return ((SigningInput) this.instance).hasNftMessage();
            }

            public boolean hasRegisterToken() {
                return ((SigningInput) this.instance).hasRegisterToken();
            }

            public boolean hasTokenTransfer() {
                return ((SigningInput) this.instance).hasTokenTransfer();
            }

            public boolean hasTransfer() {
                return ((SigningInput) this.instance).hasTransfer();
            }

            public Builder mergeCreateAccount(CreateAccountMessage createAccountMessage) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeCreateAccount(createAccountMessage);
                return this;
            }

            public Builder mergeNftMessage(NftMessage nftMessage) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeNftMessage(nftMessage);
                return this;
            }

            public Builder mergeRegisterToken(ManagedTokensRegisterMessage managedTokensRegisterMessage) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeRegisterToken(managedTokensRegisterMessage);
                return this;
            }

            public Builder mergeTokenTransfer(TokenTransferMessage tokenTransferMessage) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeTokenTransfer(tokenTransferMessage);
                return this;
            }

            public Builder mergeTransfer(TransferMessage transferMessage) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeTransfer(transferMessage);
                return this;
            }

            public Builder setAnyEncoded(String str) {
                copyOnWrite();
                ((SigningInput) this.instance).setAnyEncoded(str);
                return this;
            }

            public Builder setAnyEncodedBytes(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setAnyEncodedBytes(byteString);
                return this;
            }

            public Builder setChainId(int i) {
                copyOnWrite();
                ((SigningInput) this.instance).setChainId(i);
                return this;
            }

            public Builder setCreateAccount(CreateAccountMessage createAccountMessage) {
                copyOnWrite();
                ((SigningInput) this.instance).setCreateAccount(createAccountMessage);
                return this;
            }

            public Builder setExpirationTimestampSecs(long j) {
                copyOnWrite();
                ((SigningInput) this.instance).setExpirationTimestampSecs(j);
                return this;
            }

            public Builder setGasUnitPrice(long j) {
                copyOnWrite();
                ((SigningInput) this.instance).setGasUnitPrice(j);
                return this;
            }

            public Builder setMaxGasAmount(long j) {
                copyOnWrite();
                ((SigningInput) this.instance).setMaxGasAmount(j);
                return this;
            }

            public Builder setNftMessage(NftMessage nftMessage) {
                copyOnWrite();
                ((SigningInput) this.instance).setNftMessage(nftMessage);
                return this;
            }

            public Builder setPrivateKey(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setPrivateKey(byteString);
                return this;
            }

            public Builder setRegisterToken(ManagedTokensRegisterMessage managedTokensRegisterMessage) {
                copyOnWrite();
                ((SigningInput) this.instance).setRegisterToken(managedTokensRegisterMessage);
                return this;
            }

            public Builder setSender(String str) {
                copyOnWrite();
                ((SigningInput) this.instance).setSender(str);
                return this;
            }

            public Builder setSenderBytes(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setSenderBytes(byteString);
                return this;
            }

            public Builder setSequenceNumber(long j) {
                copyOnWrite();
                ((SigningInput) this.instance).setSequenceNumber(j);
                return this;
            }

            public Builder setTokenTransfer(TokenTransferMessage tokenTransferMessage) {
                copyOnWrite();
                ((SigningInput) this.instance).setTokenTransfer(tokenTransferMessage);
                return this;
            }

            public Builder setTransfer(TransferMessage transferMessage) {
                copyOnWrite();
                ((SigningInput) this.instance).setTransfer(transferMessage);
                return this;
            }

            private Builder() {
                super(SigningInput.DEFAULT_INSTANCE);
            }

            public Builder setCreateAccount(CreateAccountMessage.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setCreateAccount((CreateAccountMessage) builder.build());
                return this;
            }

            public Builder setNftMessage(NftMessage.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setNftMessage((NftMessage) builder.build());
                return this;
            }

            public Builder setRegisterToken(ManagedTokensRegisterMessage.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setRegisterToken((ManagedTokensRegisterMessage) builder.build());
                return this;
            }

            public Builder setTokenTransfer(TokenTransferMessage.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setTokenTransfer((TokenTransferMessage) builder.build());
                return this;
            }

            public Builder setTransfer(TransferMessage.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setTransfer((TransferMessage) builder.build());
                return this;
            }
        }

        public enum TransactionPayloadCase {
            TRANSFER(9),
            TOKEN_TRANSFER(10),
            CREATE_ACCOUNT(11),
            NFT_MESSAGE(12),
            REGISTER_TOKEN(13),
            TRANSACTIONPAYLOAD_NOT_SET(0);
            
            private final int value;

            private TransactionPayloadCase(int i) {
                this.value = i;
            }

            public static TransactionPayloadCase forNumber(int i) {
                if (i == 0) {
                    return TRANSACTIONPAYLOAD_NOT_SET;
                }
                switch (i) {
                    case 9:
                        return TRANSFER;
                    case 10:
                        return TOKEN_TRANSFER;
                    case 11:
                        return CREATE_ACCOUNT;
                    case 12:
                        return NFT_MESSAGE;
                    case 13:
                        return REGISTER_TOKEN;
                    default:
                        return null;
                }
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static TransactionPayloadCase valueOf(int i) {
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
        public void clearAnyEncoded() {
            this.anyEncoded_ = getDefaultInstance().getAnyEncoded();
        }

        /* access modifiers changed from: private */
        public void clearChainId() {
            this.chainId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearCreateAccount() {
            if (this.transactionPayloadCase_ == 11) {
                this.transactionPayloadCase_ = 0;
                this.transactionPayload_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearExpirationTimestampSecs() {
            this.expirationTimestampSecs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearGasUnitPrice() {
            this.gasUnitPrice_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearMaxGasAmount() {
            this.maxGasAmount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearNftMessage() {
            if (this.transactionPayloadCase_ == 12) {
                this.transactionPayloadCase_ = 0;
                this.transactionPayload_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearPrivateKey() {
            this.privateKey_ = getDefaultInstance().getPrivateKey();
        }

        /* access modifiers changed from: private */
        public void clearRegisterToken() {
            if (this.transactionPayloadCase_ == 13) {
                this.transactionPayloadCase_ = 0;
                this.transactionPayload_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearSender() {
            this.sender_ = getDefaultInstance().getSender();
        }

        /* access modifiers changed from: private */
        public void clearSequenceNumber() {
            this.sequenceNumber_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTokenTransfer() {
            if (this.transactionPayloadCase_ == 10) {
                this.transactionPayloadCase_ = 0;
                this.transactionPayload_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearTransactionPayload() {
            this.transactionPayloadCase_ = 0;
            this.transactionPayload_ = null;
        }

        /* access modifiers changed from: private */
        public void clearTransfer() {
            if (this.transactionPayloadCase_ == 9) {
                this.transactionPayloadCase_ = 0;
                this.transactionPayload_ = null;
            }
        }

        public static SigningInput getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeCreateAccount(CreateAccountMessage createAccountMessage) {
            createAccountMessage.getClass();
            if (this.transactionPayloadCase_ != 11 || this.transactionPayload_ == CreateAccountMessage.getDefaultInstance()) {
                this.transactionPayload_ = createAccountMessage;
            } else {
                this.transactionPayload_ = ((CreateAccountMessage.Builder) CreateAccountMessage.newBuilder((CreateAccountMessage) this.transactionPayload_).mergeFrom(createAccountMessage)).buildPartial();
            }
            this.transactionPayloadCase_ = 11;
        }

        /* access modifiers changed from: private */
        public void mergeNftMessage(NftMessage nftMessage) {
            nftMessage.getClass();
            if (this.transactionPayloadCase_ != 12 || this.transactionPayload_ == NftMessage.getDefaultInstance()) {
                this.transactionPayload_ = nftMessage;
            } else {
                this.transactionPayload_ = ((NftMessage.Builder) NftMessage.newBuilder((NftMessage) this.transactionPayload_).mergeFrom(nftMessage)).buildPartial();
            }
            this.transactionPayloadCase_ = 12;
        }

        /* access modifiers changed from: private */
        public void mergeRegisterToken(ManagedTokensRegisterMessage managedTokensRegisterMessage) {
            managedTokensRegisterMessage.getClass();
            if (this.transactionPayloadCase_ != 13 || this.transactionPayload_ == ManagedTokensRegisterMessage.getDefaultInstance()) {
                this.transactionPayload_ = managedTokensRegisterMessage;
            } else {
                this.transactionPayload_ = ((ManagedTokensRegisterMessage.Builder) ManagedTokensRegisterMessage.newBuilder((ManagedTokensRegisterMessage) this.transactionPayload_).mergeFrom(managedTokensRegisterMessage)).buildPartial();
            }
            this.transactionPayloadCase_ = 13;
        }

        /* access modifiers changed from: private */
        public void mergeTokenTransfer(TokenTransferMessage tokenTransferMessage) {
            tokenTransferMessage.getClass();
            if (this.transactionPayloadCase_ != 10 || this.transactionPayload_ == TokenTransferMessage.getDefaultInstance()) {
                this.transactionPayload_ = tokenTransferMessage;
            } else {
                this.transactionPayload_ = ((TokenTransferMessage.Builder) TokenTransferMessage.newBuilder((TokenTransferMessage) this.transactionPayload_).mergeFrom(tokenTransferMessage)).buildPartial();
            }
            this.transactionPayloadCase_ = 10;
        }

        /* access modifiers changed from: private */
        public void mergeTransfer(TransferMessage transferMessage) {
            transferMessage.getClass();
            if (this.transactionPayloadCase_ != 9 || this.transactionPayload_ == TransferMessage.getDefaultInstance()) {
                this.transactionPayload_ = transferMessage;
            } else {
                this.transactionPayload_ = ((TransferMessage.Builder) TransferMessage.newBuilder((TransferMessage) this.transactionPayload_).mergeFrom(transferMessage)).buildPartial();
            }
            this.transactionPayloadCase_ = 9;
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
        public void setAnyEncoded(String str) {
            str.getClass();
            this.anyEncoded_ = str;
        }

        /* access modifiers changed from: private */
        public void setAnyEncodedBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.anyEncoded_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setChainId(int i) {
            this.chainId_ = i;
        }

        /* access modifiers changed from: private */
        public void setCreateAccount(CreateAccountMessage createAccountMessage) {
            createAccountMessage.getClass();
            this.transactionPayload_ = createAccountMessage;
            this.transactionPayloadCase_ = 11;
        }

        /* access modifiers changed from: private */
        public void setExpirationTimestampSecs(long j) {
            this.expirationTimestampSecs_ = j;
        }

        /* access modifiers changed from: private */
        public void setGasUnitPrice(long j) {
            this.gasUnitPrice_ = j;
        }

        /* access modifiers changed from: private */
        public void setMaxGasAmount(long j) {
            this.maxGasAmount_ = j;
        }

        /* access modifiers changed from: private */
        public void setNftMessage(NftMessage nftMessage) {
            nftMessage.getClass();
            this.transactionPayload_ = nftMessage;
            this.transactionPayloadCase_ = 12;
        }

        /* access modifiers changed from: private */
        public void setPrivateKey(ByteString byteString) {
            byteString.getClass();
            this.privateKey_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setRegisterToken(ManagedTokensRegisterMessage managedTokensRegisterMessage) {
            managedTokensRegisterMessage.getClass();
            this.transactionPayload_ = managedTokensRegisterMessage;
            this.transactionPayloadCase_ = 13;
        }

        /* access modifiers changed from: private */
        public void setSender(String str) {
            str.getClass();
            this.sender_ = str;
        }

        /* access modifiers changed from: private */
        public void setSenderBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.sender_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setSequenceNumber(long j) {
            this.sequenceNumber_ = j;
        }

        /* access modifiers changed from: private */
        public void setTokenTransfer(TokenTransferMessage tokenTransferMessage) {
            tokenTransferMessage.getClass();
            this.transactionPayload_ = tokenTransferMessage;
            this.transactionPayloadCase_ = 10;
        }

        /* access modifiers changed from: private */
        public void setTransfer(TransferMessage transferMessage) {
            transferMessage.getClass();
            this.transactionPayload_ = transferMessage;
            this.transactionPayloadCase_ = 9;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97271.f46543xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningInput();
                case 2:
                    return new Builder((C97271) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0001\u0000\u0001\r\r\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0003\u0004\u0003\u0005\u0003\u0006\u000b\u0007\n\bȈ\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000", new Object[]{"transactionPayload_", "transactionPayloadCase_", "sender_", "sequenceNumber_", "maxGasAmount_", "gasUnitPrice_", "expirationTimestampSecs_", "chainId_", "privateKey_", "anyEncoded_", TransferMessage.class, TokenTransferMessage.class, CreateAccountMessage.class, NftMessage.class, ManagedTokensRegisterMessage.class});
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

        public String getAnyEncoded() {
            return this.anyEncoded_;
        }

        public ByteString getAnyEncodedBytes() {
            return ByteString.copyFromUtf8(this.anyEncoded_);
        }

        public int getChainId() {
            return this.chainId_;
        }

        public CreateAccountMessage getCreateAccount() {
            if (this.transactionPayloadCase_ == 11) {
                return (CreateAccountMessage) this.transactionPayload_;
            }
            return CreateAccountMessage.getDefaultInstance();
        }

        public long getExpirationTimestampSecs() {
            return this.expirationTimestampSecs_;
        }

        public long getGasUnitPrice() {
            return this.gasUnitPrice_;
        }

        public long getMaxGasAmount() {
            return this.maxGasAmount_;
        }

        public NftMessage getNftMessage() {
            if (this.transactionPayloadCase_ == 12) {
                return (NftMessage) this.transactionPayload_;
            }
            return NftMessage.getDefaultInstance();
        }

        public ByteString getPrivateKey() {
            return this.privateKey_;
        }

        public ManagedTokensRegisterMessage getRegisterToken() {
            if (this.transactionPayloadCase_ == 13) {
                return (ManagedTokensRegisterMessage) this.transactionPayload_;
            }
            return ManagedTokensRegisterMessage.getDefaultInstance();
        }

        public String getSender() {
            return this.sender_;
        }

        public ByteString getSenderBytes() {
            return ByteString.copyFromUtf8(this.sender_);
        }

        public long getSequenceNumber() {
            return this.sequenceNumber_;
        }

        public TokenTransferMessage getTokenTransfer() {
            if (this.transactionPayloadCase_ == 10) {
                return (TokenTransferMessage) this.transactionPayload_;
            }
            return TokenTransferMessage.getDefaultInstance();
        }

        public TransactionPayloadCase getTransactionPayloadCase() {
            return TransactionPayloadCase.forNumber(this.transactionPayloadCase_);
        }

        public TransferMessage getTransfer() {
            if (this.transactionPayloadCase_ == 9) {
                return (TransferMessage) this.transactionPayload_;
            }
            return TransferMessage.getDefaultInstance();
        }

        public boolean hasCreateAccount() {
            if (this.transactionPayloadCase_ == 11) {
                return true;
            }
            return false;
        }

        public boolean hasNftMessage() {
            if (this.transactionPayloadCase_ == 12) {
                return true;
            }
            return false;
        }

        public boolean hasRegisterToken() {
            if (this.transactionPayloadCase_ == 13) {
                return true;
            }
            return false;
        }

        public boolean hasTokenTransfer() {
            if (this.transactionPayloadCase_ == 10) {
                return true;
            }
            return false;
        }

        public boolean hasTransfer() {
            if (this.transactionPayloadCase_ == 9) {
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
        String getAnyEncoded();

        ByteString getAnyEncodedBytes();

        int getChainId();

        CreateAccountMessage getCreateAccount();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        long getExpirationTimestampSecs();

        long getGasUnitPrice();

        long getMaxGasAmount();

        NftMessage getNftMessage();

        ByteString getPrivateKey();

        ManagedTokensRegisterMessage getRegisterToken();

        String getSender();

        ByteString getSenderBytes();

        long getSequenceNumber();

        TokenTransferMessage getTokenTransfer();

        SigningInput.TransactionPayloadCase getTransactionPayloadCase();

        TransferMessage getTransfer();

        boolean hasCreateAccount();

        boolean hasNftMessage();

        boolean hasRegisterToken();

        boolean hasTokenTransfer();

        boolean hasTransfer();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SigningOutput extends GeneratedMessageLite<SigningOutput, Builder> implements SigningOutputOrBuilder {
        public static final int AUTHENTICATOR_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final SigningOutput DEFAULT_INSTANCE;
        public static final int ENCODED_FIELD_NUMBER = 3;
        public static final int JSON_FIELD_NUMBER = 4;
        private static volatile im4<SigningOutput> PARSER = null;
        public static final int RAW_TXN_FIELD_NUMBER = 1;
        private TransactionAuthenticator authenticator_;
        private ByteString encoded_;
        private String json_ = "";
        private ByteString rawTxn_;

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningOutput, Builder> implements SigningOutputOrBuilder {
            public /* synthetic */ Builder(C97271 r1) {
                this();
            }

            public Builder clearAuthenticator() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearAuthenticator();
                return this;
            }

            public Builder clearEncoded() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearEncoded();
                return this;
            }

            public Builder clearJson() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearJson();
                return this;
            }

            public Builder clearRawTxn() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearRawTxn();
                return this;
            }

            public TransactionAuthenticator getAuthenticator() {
                return ((SigningOutput) this.instance).getAuthenticator();
            }

            public ByteString getEncoded() {
                return ((SigningOutput) this.instance).getEncoded();
            }

            public String getJson() {
                return ((SigningOutput) this.instance).getJson();
            }

            public ByteString getJsonBytes() {
                return ((SigningOutput) this.instance).getJsonBytes();
            }

            public ByteString getRawTxn() {
                return ((SigningOutput) this.instance).getRawTxn();
            }

            public boolean hasAuthenticator() {
                return ((SigningOutput) this.instance).hasAuthenticator();
            }

            public Builder mergeAuthenticator(TransactionAuthenticator transactionAuthenticator) {
                copyOnWrite();
                ((SigningOutput) this.instance).mergeAuthenticator(transactionAuthenticator);
                return this;
            }

            public Builder setAuthenticator(TransactionAuthenticator transactionAuthenticator) {
                copyOnWrite();
                ((SigningOutput) this.instance).setAuthenticator(transactionAuthenticator);
                return this;
            }

            public Builder setEncoded(ByteString byteString) {
                copyOnWrite();
                ((SigningOutput) this.instance).setEncoded(byteString);
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

            public Builder setRawTxn(ByteString byteString) {
                copyOnWrite();
                ((SigningOutput) this.instance).setRawTxn(byteString);
                return this;
            }

            private Builder() {
                super(SigningOutput.DEFAULT_INSTANCE);
            }

            public Builder setAuthenticator(TransactionAuthenticator.Builder builder) {
                copyOnWrite();
                ((SigningOutput) this.instance).setAuthenticator((TransactionAuthenticator) builder.build());
                return this;
            }
        }

        static {
            SigningOutput signingOutput = new SigningOutput();
            DEFAULT_INSTANCE = signingOutput;
            GeneratedMessageLite.registerDefaultInstance(SigningOutput.class, signingOutput);
        }

        private SigningOutput() {
            ByteString byteString = ByteString.EMPTY;
            this.rawTxn_ = byteString;
            this.encoded_ = byteString;
        }

        /* access modifiers changed from: private */
        public void clearAuthenticator() {
            this.authenticator_ = null;
        }

        /* access modifiers changed from: private */
        public void clearEncoded() {
            this.encoded_ = getDefaultInstance().getEncoded();
        }

        /* access modifiers changed from: private */
        public void clearJson() {
            this.json_ = getDefaultInstance().getJson();
        }

        /* access modifiers changed from: private */
        public void clearRawTxn() {
            this.rawTxn_ = getDefaultInstance().getRawTxn();
        }

        public static SigningOutput getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeAuthenticator(TransactionAuthenticator transactionAuthenticator) {
            transactionAuthenticator.getClass();
            TransactionAuthenticator transactionAuthenticator2 = this.authenticator_;
            if (transactionAuthenticator2 == null || transactionAuthenticator2 == TransactionAuthenticator.getDefaultInstance()) {
                this.authenticator_ = transactionAuthenticator;
            } else {
                this.authenticator_ = (TransactionAuthenticator) ((TransactionAuthenticator.Builder) TransactionAuthenticator.newBuilder(this.authenticator_).mergeFrom(transactionAuthenticator)).buildPartial();
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
        public void setAuthenticator(TransactionAuthenticator transactionAuthenticator) {
            transactionAuthenticator.getClass();
            this.authenticator_ = transactionAuthenticator;
        }

        /* access modifiers changed from: private */
        public void setEncoded(ByteString byteString) {
            byteString.getClass();
            this.encoded_ = byteString;
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
        public void setRawTxn(ByteString byteString) {
            byteString.getClass();
            this.rawTxn_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97271.f46543xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningOutput();
                case 2:
                    return new Builder((C97271) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\n\u0002\t\u0003\n\u0004Ȉ", new Object[]{"rawTxn_", "authenticator_", "encoded_", "json_"});
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

        public TransactionAuthenticator getAuthenticator() {
            TransactionAuthenticator transactionAuthenticator = this.authenticator_;
            if (transactionAuthenticator == null) {
                return TransactionAuthenticator.getDefaultInstance();
            }
            return transactionAuthenticator;
        }

        public ByteString getEncoded() {
            return this.encoded_;
        }

        public String getJson() {
            return this.json_;
        }

        public ByteString getJsonBytes() {
            return ByteString.copyFromUtf8(this.json_);
        }

        public ByteString getRawTxn() {
            return this.rawTxn_;
        }

        public boolean hasAuthenticator() {
            if (this.authenticator_ != null) {
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
        TransactionAuthenticator getAuthenticator();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        ByteString getEncoded();

        String getJson();

        ByteString getJsonBytes();

        ByteString getRawTxn();

        boolean hasAuthenticator();

        /* synthetic */ boolean isInitialized();
    }

    public static final class StructTag extends GeneratedMessageLite<StructTag, Builder> implements StructTagOrBuilder {
        public static final int ACCOUNT_ADDRESS_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final StructTag DEFAULT_INSTANCE;
        public static final int MODULE_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 3;
        private static volatile im4<StructTag> PARSER;
        private String accountAddress_ = "";
        private String module_ = "";
        private String name_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<StructTag, Builder> implements StructTagOrBuilder {
            public /* synthetic */ Builder(C97271 r1) {
                this();
            }

            public Builder clearAccountAddress() {
                copyOnWrite();
                ((StructTag) this.instance).clearAccountAddress();
                return this;
            }

            public Builder clearModule() {
                copyOnWrite();
                ((StructTag) this.instance).clearModule();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((StructTag) this.instance).clearName();
                return this;
            }

            public String getAccountAddress() {
                return ((StructTag) this.instance).getAccountAddress();
            }

            public ByteString getAccountAddressBytes() {
                return ((StructTag) this.instance).getAccountAddressBytes();
            }

            public String getModule() {
                return ((StructTag) this.instance).getModule();
            }

            public ByteString getModuleBytes() {
                return ((StructTag) this.instance).getModuleBytes();
            }

            public String getName() {
                return ((StructTag) this.instance).getName();
            }

            public ByteString getNameBytes() {
                return ((StructTag) this.instance).getNameBytes();
            }

            public Builder setAccountAddress(String str) {
                copyOnWrite();
                ((StructTag) this.instance).setAccountAddress(str);
                return this;
            }

            public Builder setAccountAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((StructTag) this.instance).setAccountAddressBytes(byteString);
                return this;
            }

            public Builder setModule(String str) {
                copyOnWrite();
                ((StructTag) this.instance).setModule(str);
                return this;
            }

            public Builder setModuleBytes(ByteString byteString) {
                copyOnWrite();
                ((StructTag) this.instance).setModuleBytes(byteString);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((StructTag) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((StructTag) this.instance).setNameBytes(byteString);
                return this;
            }

            private Builder() {
                super(StructTag.DEFAULT_INSTANCE);
            }
        }

        static {
            StructTag structTag = new StructTag();
            DEFAULT_INSTANCE = structTag;
            GeneratedMessageLite.registerDefaultInstance(StructTag.class, structTag);
        }

        private StructTag() {
        }

        /* access modifiers changed from: private */
        public void clearAccountAddress() {
            this.accountAddress_ = getDefaultInstance().getAccountAddress();
        }

        /* access modifiers changed from: private */
        public void clearModule() {
            this.module_ = getDefaultInstance().getModule();
        }

        /* access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        public static StructTag getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static StructTag parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (StructTag) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StructTag parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (StructTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<StructTag> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAccountAddress(String str) {
            str.getClass();
            this.accountAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setAccountAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.accountAddress_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setModule(String str) {
            str.getClass();
            this.module_ = str;
        }

        /* access modifiers changed from: private */
        public void setModuleBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.module_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.name_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97271.f46543xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new StructTag();
                case 2:
                    return new Builder((C97271) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"accountAddress_", "module_", "name_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<StructTag> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (StructTag.class) {
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

        public String getAccountAddress() {
            return this.accountAddress_;
        }

        public ByteString getAccountAddressBytes() {
            return ByteString.copyFromUtf8(this.accountAddress_);
        }

        public String getModule() {
            return this.module_;
        }

        public ByteString getModuleBytes() {
            return ByteString.copyFromUtf8(this.module_);
        }

        public String getName() {
            return this.name_;
        }

        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        public static Builder newBuilder(StructTag structTag) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(structTag);
        }

        public static StructTag parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (StructTag) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static StructTag parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (StructTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static StructTag parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (StructTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static StructTag parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (StructTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static StructTag parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (StructTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StructTag parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (StructTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static StructTag parseFrom(InputStream inputStream) throws IOException {
            return (StructTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StructTag parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (StructTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static StructTag parseFrom(C4969g gVar) throws IOException {
            return (StructTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static StructTag parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (StructTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface StructTagOrBuilder extends qu3 {
        String getAccountAddress();

        ByteString getAccountAddressBytes();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getModule();

        ByteString getModuleBytes();

        String getName();

        ByteString getNameBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TokenTransferMessage extends GeneratedMessageLite<TokenTransferMessage, Builder> implements TokenTransferMessageOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final TokenTransferMessage DEFAULT_INSTANCE;
        public static final int FUNCTION_FIELD_NUMBER = 3;
        private static volatile im4<TokenTransferMessage> PARSER = null;
        public static final int TO_FIELD_NUMBER = 1;
        private long amount_;
        private StructTag function_;
        private String to_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<TokenTransferMessage, Builder> implements TokenTransferMessageOrBuilder {
            public /* synthetic */ Builder(C97271 r1) {
                this();
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((TokenTransferMessage) this.instance).clearAmount();
                return this;
            }

            public Builder clearFunction() {
                copyOnWrite();
                ((TokenTransferMessage) this.instance).clearFunction();
                return this;
            }

            public Builder clearTo() {
                copyOnWrite();
                ((TokenTransferMessage) this.instance).clearTo();
                return this;
            }

            public long getAmount() {
                return ((TokenTransferMessage) this.instance).getAmount();
            }

            public StructTag getFunction() {
                return ((TokenTransferMessage) this.instance).getFunction();
            }

            public String getTo() {
                return ((TokenTransferMessage) this.instance).getTo();
            }

            public ByteString getToBytes() {
                return ((TokenTransferMessage) this.instance).getToBytes();
            }

            public boolean hasFunction() {
                return ((TokenTransferMessage) this.instance).hasFunction();
            }

            public Builder mergeFunction(StructTag structTag) {
                copyOnWrite();
                ((TokenTransferMessage) this.instance).mergeFunction(structTag);
                return this;
            }

            public Builder setAmount(long j) {
                copyOnWrite();
                ((TokenTransferMessage) this.instance).setAmount(j);
                return this;
            }

            public Builder setFunction(StructTag structTag) {
                copyOnWrite();
                ((TokenTransferMessage) this.instance).setFunction(structTag);
                return this;
            }

            public Builder setTo(String str) {
                copyOnWrite();
                ((TokenTransferMessage) this.instance).setTo(str);
                return this;
            }

            public Builder setToBytes(ByteString byteString) {
                copyOnWrite();
                ((TokenTransferMessage) this.instance).setToBytes(byteString);
                return this;
            }

            private Builder() {
                super(TokenTransferMessage.DEFAULT_INSTANCE);
            }

            public Builder setFunction(StructTag.Builder builder) {
                copyOnWrite();
                ((TokenTransferMessage) this.instance).setFunction((StructTag) builder.build());
                return this;
            }
        }

        static {
            TokenTransferMessage tokenTransferMessage = new TokenTransferMessage();
            DEFAULT_INSTANCE = tokenTransferMessage;
            GeneratedMessageLite.registerDefaultInstance(TokenTransferMessage.class, tokenTransferMessage);
        }

        private TokenTransferMessage() {
        }

        /* access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFunction() {
            this.function_ = null;
        }

        /* access modifiers changed from: private */
        public void clearTo() {
            this.to_ = getDefaultInstance().getTo();
        }

        public static TokenTransferMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeFunction(StructTag structTag) {
            structTag.getClass();
            StructTag structTag2 = this.function_;
            if (structTag2 == null || structTag2 == StructTag.getDefaultInstance()) {
                this.function_ = structTag;
            } else {
                this.function_ = (StructTag) ((StructTag.Builder) StructTag.newBuilder(this.function_).mergeFrom(structTag)).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TokenTransferMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TokenTransferMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TokenTransferMessage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TokenTransferMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<TokenTransferMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAmount(long j) {
            this.amount_ = j;
        }

        /* access modifiers changed from: private */
        public void setFunction(StructTag structTag) {
            structTag.getClass();
            this.function_ = structTag;
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

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97271.f46543xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TokenTransferMessage();
                case 2:
                    return new Builder((C97271) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0003\u0003\t", new Object[]{"to_", "amount_", "function_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<TokenTransferMessage> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (TokenTransferMessage.class) {
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

        public StructTag getFunction() {
            StructTag structTag = this.function_;
            if (structTag == null) {
                return StructTag.getDefaultInstance();
            }
            return structTag;
        }

        public String getTo() {
            return this.to_;
        }

        public ByteString getToBytes() {
            return ByteString.copyFromUtf8(this.to_);
        }

        public boolean hasFunction() {
            if (this.function_ != null) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(TokenTransferMessage tokenTransferMessage) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(tokenTransferMessage);
        }

        public static TokenTransferMessage parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TokenTransferMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TokenTransferMessage parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (TokenTransferMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static TokenTransferMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TokenTransferMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TokenTransferMessage parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (TokenTransferMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static TokenTransferMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TokenTransferMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TokenTransferMessage parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (TokenTransferMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static TokenTransferMessage parseFrom(InputStream inputStream) throws IOException {
            return (TokenTransferMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TokenTransferMessage parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TokenTransferMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TokenTransferMessage parseFrom(C4969g gVar) throws IOException {
            return (TokenTransferMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static TokenTransferMessage parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (TokenTransferMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface TokenTransferMessageOrBuilder extends qu3 {
        long getAmount();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        StructTag getFunction();

        String getTo();

        ByteString getToBytes();

        boolean hasFunction();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TransactionAuthenticator extends GeneratedMessageLite<TransactionAuthenticator, Builder> implements TransactionAuthenticatorOrBuilder {
        /* access modifiers changed from: private */
        public static final TransactionAuthenticator DEFAULT_INSTANCE;
        private static volatile im4<TransactionAuthenticator> PARSER = null;
        public static final int PUBLIC_KEY_FIELD_NUMBER = 2;
        public static final int SIGNATURE_FIELD_NUMBER = 1;
        private ByteString publicKey_;
        private ByteString signature_;

        public static final class Builder extends GeneratedMessageLite.C4930a<TransactionAuthenticator, Builder> implements TransactionAuthenticatorOrBuilder {
            public /* synthetic */ Builder(C97271 r1) {
                this();
            }

            public Builder clearPublicKey() {
                copyOnWrite();
                ((TransactionAuthenticator) this.instance).clearPublicKey();
                return this;
            }

            public Builder clearSignature() {
                copyOnWrite();
                ((TransactionAuthenticator) this.instance).clearSignature();
                return this;
            }

            public ByteString getPublicKey() {
                return ((TransactionAuthenticator) this.instance).getPublicKey();
            }

            public ByteString getSignature() {
                return ((TransactionAuthenticator) this.instance).getSignature();
            }

            public Builder setPublicKey(ByteString byteString) {
                copyOnWrite();
                ((TransactionAuthenticator) this.instance).setPublicKey(byteString);
                return this;
            }

            public Builder setSignature(ByteString byteString) {
                copyOnWrite();
                ((TransactionAuthenticator) this.instance).setSignature(byteString);
                return this;
            }

            private Builder() {
                super(TransactionAuthenticator.DEFAULT_INSTANCE);
            }
        }

        static {
            TransactionAuthenticator transactionAuthenticator = new TransactionAuthenticator();
            DEFAULT_INSTANCE = transactionAuthenticator;
            GeneratedMessageLite.registerDefaultInstance(TransactionAuthenticator.class, transactionAuthenticator);
        }

        private TransactionAuthenticator() {
            ByteString byteString = ByteString.EMPTY;
            this.signature_ = byteString;
            this.publicKey_ = byteString;
        }

        /* access modifiers changed from: private */
        public void clearPublicKey() {
            this.publicKey_ = getDefaultInstance().getPublicKey();
        }

        /* access modifiers changed from: private */
        public void clearSignature() {
            this.signature_ = getDefaultInstance().getSignature();
        }

        public static TransactionAuthenticator getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TransactionAuthenticator parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TransactionAuthenticator) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TransactionAuthenticator parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TransactionAuthenticator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<TransactionAuthenticator> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setPublicKey(ByteString byteString) {
            byteString.getClass();
            this.publicKey_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setSignature(ByteString byteString) {
            byteString.getClass();
            this.signature_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97271.f46543xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TransactionAuthenticator();
                case 2:
                    return new Builder((C97271) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\n", new Object[]{"signature_", "publicKey_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<TransactionAuthenticator> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (TransactionAuthenticator.class) {
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

        public ByteString getSignature() {
            return this.signature_;
        }

        public static Builder newBuilder(TransactionAuthenticator transactionAuthenticator) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(transactionAuthenticator);
        }

        public static TransactionAuthenticator parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TransactionAuthenticator) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TransactionAuthenticator parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransactionAuthenticator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static TransactionAuthenticator parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TransactionAuthenticator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TransactionAuthenticator parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransactionAuthenticator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static TransactionAuthenticator parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TransactionAuthenticator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TransactionAuthenticator parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransactionAuthenticator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static TransactionAuthenticator parseFrom(InputStream inputStream) throws IOException {
            return (TransactionAuthenticator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TransactionAuthenticator parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TransactionAuthenticator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TransactionAuthenticator parseFrom(C4969g gVar) throws IOException {
            return (TransactionAuthenticator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static TransactionAuthenticator parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (TransactionAuthenticator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface TransactionAuthenticatorOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        ByteString getPublicKey();

        ByteString getSignature();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TransferMessage extends GeneratedMessageLite<TransferMessage, Builder> implements TransferMessageOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final TransferMessage DEFAULT_INSTANCE;
        private static volatile im4<TransferMessage> PARSER = null;
        public static final int TO_FIELD_NUMBER = 1;
        private long amount_;
        private String to_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<TransferMessage, Builder> implements TransferMessageOrBuilder {
            public /* synthetic */ Builder(C97271 r1) {
                this();
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((TransferMessage) this.instance).clearAmount();
                return this;
            }

            public Builder clearTo() {
                copyOnWrite();
                ((TransferMessage) this.instance).clearTo();
                return this;
            }

            public long getAmount() {
                return ((TransferMessage) this.instance).getAmount();
            }

            public String getTo() {
                return ((TransferMessage) this.instance).getTo();
            }

            public ByteString getToBytes() {
                return ((TransferMessage) this.instance).getToBytes();
            }

            public Builder setAmount(long j) {
                copyOnWrite();
                ((TransferMessage) this.instance).setAmount(j);
                return this;
            }

            public Builder setTo(String str) {
                copyOnWrite();
                ((TransferMessage) this.instance).setTo(str);
                return this;
            }

            public Builder setToBytes(ByteString byteString) {
                copyOnWrite();
                ((TransferMessage) this.instance).setToBytes(byteString);
                return this;
            }

            private Builder() {
                super(TransferMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            TransferMessage transferMessage = new TransferMessage();
            DEFAULT_INSTANCE = transferMessage;
            GeneratedMessageLite.registerDefaultInstance(TransferMessage.class, transferMessage);
        }

        private TransferMessage() {
        }

        /* access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTo() {
            this.to_ = getDefaultInstance().getTo();
        }

        public static TransferMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TransferMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TransferMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TransferMessage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TransferMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<TransferMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAmount(long j) {
            this.amount_ = j;
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

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97271.f46543xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new TransferMessage();
                case 2:
                    return new Builder((C97271) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0003", new Object[]{"to_", "amount_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<TransferMessage> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (TransferMessage.class) {
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

        public String getTo() {
            return this.to_;
        }

        public ByteString getToBytes() {
            return ByteString.copyFromUtf8(this.to_);
        }

        public static Builder newBuilder(TransferMessage transferMessage) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(transferMessage);
        }

        public static TransferMessage parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TransferMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TransferMessage parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransferMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static TransferMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TransferMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TransferMessage parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransferMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static TransferMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TransferMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TransferMessage parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (TransferMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static TransferMessage parseFrom(InputStream inputStream) throws IOException {
            return (TransferMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TransferMessage parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (TransferMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static TransferMessage parseFrom(C4969g gVar) throws IOException {
            return (TransferMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static TransferMessage parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (TransferMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface TransferMessageOrBuilder extends qu3 {
        long getAmount();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getTo();

        ByteString getToBytes();

        /* synthetic */ boolean isInitialized();
    }

    private Aptos() {
    }

    public static void registerAllExtensions(C4987l lVar) {
    }
}
