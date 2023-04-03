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

public final class FIO {

    /* renamed from: wallet.core.jni.proto.FIO$1 */
    public static /* synthetic */ class C97451 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f46558xa1df5c61;

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
                f46558xa1df5c61 = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f46558xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f46558xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f46558xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f46558xa1df5c61     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f46558xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f46558xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wallet.core.jni.proto.FIO.C97451.<clinit>():void");
        }
    }

    public static final class Action extends GeneratedMessageLite<Action, Builder> implements ActionOrBuilder {
        public static final int ADD_PUB_ADDRESS_MESSAGE_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final Action DEFAULT_INSTANCE;
        public static final int NEW_FUNDS_REQUEST_MESSAGE_FIELD_NUMBER = 5;
        private static volatile im4<Action> PARSER = null;
        public static final int REGISTER_FIO_ADDRESS_MESSAGE_FIELD_NUMBER = 1;
        public static final int RENEW_FIO_ADDRESS_MESSAGE_FIELD_NUMBER = 4;
        public static final int TRANSFER_MESSAGE_FIELD_NUMBER = 3;
        private int messageOneofCase_ = 0;
        private Object messageOneof_;

        public static final class AddPubAddress extends GeneratedMessageLite<AddPubAddress, Builder> implements AddPubAddressOrBuilder {
            /* access modifiers changed from: private */
            public static final AddPubAddress DEFAULT_INSTANCE;
            public static final int FEE_FIELD_NUMBER = 3;
            public static final int FIO_ADDRESS_FIELD_NUMBER = 1;
            private static volatile im4<AddPubAddress> PARSER = null;
            public static final int PUBLIC_ADDRESSES_FIELD_NUMBER = 2;
            private long fee_;
            private String fioAddress_ = "";
            private C5011t.C5020i<PublicAddress> publicAddresses_ = GeneratedMessageLite.emptyProtobufList();

            public static final class Builder extends GeneratedMessageLite.C4930a<AddPubAddress, Builder> implements AddPubAddressOrBuilder {
                public /* synthetic */ Builder(C97451 r1) {
                    this();
                }

                public Builder addAllPublicAddresses(Iterable<? extends PublicAddress> iterable) {
                    copyOnWrite();
                    ((AddPubAddress) this.instance).addAllPublicAddresses(iterable);
                    return this;
                }

                public Builder addPublicAddresses(PublicAddress publicAddress) {
                    copyOnWrite();
                    ((AddPubAddress) this.instance).addPublicAddresses(publicAddress);
                    return this;
                }

                public Builder clearFee() {
                    copyOnWrite();
                    ((AddPubAddress) this.instance).clearFee();
                    return this;
                }

                public Builder clearFioAddress() {
                    copyOnWrite();
                    ((AddPubAddress) this.instance).clearFioAddress();
                    return this;
                }

                public Builder clearPublicAddresses() {
                    copyOnWrite();
                    ((AddPubAddress) this.instance).clearPublicAddresses();
                    return this;
                }

                public long getFee() {
                    return ((AddPubAddress) this.instance).getFee();
                }

                public String getFioAddress() {
                    return ((AddPubAddress) this.instance).getFioAddress();
                }

                public ByteString getFioAddressBytes() {
                    return ((AddPubAddress) this.instance).getFioAddressBytes();
                }

                public PublicAddress getPublicAddresses(int i) {
                    return ((AddPubAddress) this.instance).getPublicAddresses(i);
                }

                public int getPublicAddressesCount() {
                    return ((AddPubAddress) this.instance).getPublicAddressesCount();
                }

                public List<PublicAddress> getPublicAddressesList() {
                    return Collections.unmodifiableList(((AddPubAddress) this.instance).getPublicAddressesList());
                }

                public Builder removePublicAddresses(int i) {
                    copyOnWrite();
                    ((AddPubAddress) this.instance).removePublicAddresses(i);
                    return this;
                }

                public Builder setFee(long j) {
                    copyOnWrite();
                    ((AddPubAddress) this.instance).setFee(j);
                    return this;
                }

                public Builder setFioAddress(String str) {
                    copyOnWrite();
                    ((AddPubAddress) this.instance).setFioAddress(str);
                    return this;
                }

                public Builder setFioAddressBytes(ByteString byteString) {
                    copyOnWrite();
                    ((AddPubAddress) this.instance).setFioAddressBytes(byteString);
                    return this;
                }

                public Builder setPublicAddresses(int i, PublicAddress publicAddress) {
                    copyOnWrite();
                    ((AddPubAddress) this.instance).setPublicAddresses(i, publicAddress);
                    return this;
                }

                private Builder() {
                    super(AddPubAddress.DEFAULT_INSTANCE);
                }

                public Builder addPublicAddresses(int i, PublicAddress publicAddress) {
                    copyOnWrite();
                    ((AddPubAddress) this.instance).addPublicAddresses(i, publicAddress);
                    return this;
                }

                public Builder setPublicAddresses(int i, PublicAddress.Builder builder) {
                    copyOnWrite();
                    ((AddPubAddress) this.instance).setPublicAddresses(i, (PublicAddress) builder.build());
                    return this;
                }

                public Builder addPublicAddresses(PublicAddress.Builder builder) {
                    copyOnWrite();
                    ((AddPubAddress) this.instance).addPublicAddresses((PublicAddress) builder.build());
                    return this;
                }

                public Builder addPublicAddresses(int i, PublicAddress.Builder builder) {
                    copyOnWrite();
                    ((AddPubAddress) this.instance).addPublicAddresses(i, (PublicAddress) builder.build());
                    return this;
                }
            }

            static {
                AddPubAddress addPubAddress = new AddPubAddress();
                DEFAULT_INSTANCE = addPubAddress;
                GeneratedMessageLite.registerDefaultInstance(AddPubAddress.class, addPubAddress);
            }

            private AddPubAddress() {
            }

            /* access modifiers changed from: private */
            public void addAllPublicAddresses(Iterable<? extends PublicAddress> iterable) {
                ensurePublicAddressesIsMutable();
                C4949a.addAll(iterable, this.publicAddresses_);
            }

            /* access modifiers changed from: private */
            public void addPublicAddresses(PublicAddress publicAddress) {
                publicAddress.getClass();
                ensurePublicAddressesIsMutable();
                this.publicAddresses_.add(publicAddress);
            }

            /* access modifiers changed from: private */
            public void clearFee() {
                this.fee_ = 0;
            }

            /* access modifiers changed from: private */
            public void clearFioAddress() {
                this.fioAddress_ = getDefaultInstance().getFioAddress();
            }

            /* access modifiers changed from: private */
            public void clearPublicAddresses() {
                this.publicAddresses_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void ensurePublicAddressesIsMutable() {
                C5011t.C5020i<PublicAddress> iVar = this.publicAddresses_;
                if (!iVar.mo37090v()) {
                    this.publicAddresses_ = GeneratedMessageLite.mutableCopy(iVar);
                }
            }

            public static AddPubAddress getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static AddPubAddress parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (AddPubAddress) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static AddPubAddress parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (AddPubAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<AddPubAddress> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void removePublicAddresses(int i) {
                ensurePublicAddressesIsMutable();
                this.publicAddresses_.remove(i);
            }

            /* access modifiers changed from: private */
            public void setFee(long j) {
                this.fee_ = j;
            }

            /* access modifiers changed from: private */
            public void setFioAddress(String str) {
                str.getClass();
                this.fioAddress_ = str;
            }

            /* access modifiers changed from: private */
            public void setFioAddressBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.fioAddress_ = byteString.toStringUtf8();
            }

            /* access modifiers changed from: private */
            public void setPublicAddresses(int i, PublicAddress publicAddress) {
                publicAddress.getClass();
                ensurePublicAddressesIsMutable();
                this.publicAddresses_.set(i, publicAddress);
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97451.f46558xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new AddPubAddress();
                    case 2:
                        return new Builder((C97451) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003\u0003", new Object[]{"fioAddress_", "publicAddresses_", PublicAddress.class, "fee_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<AddPubAddress> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (AddPubAddress.class) {
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

            public String getFioAddress() {
                return this.fioAddress_;
            }

            public ByteString getFioAddressBytes() {
                return ByteString.copyFromUtf8(this.fioAddress_);
            }

            public PublicAddress getPublicAddresses(int i) {
                return this.publicAddresses_.get(i);
            }

            public int getPublicAddressesCount() {
                return this.publicAddresses_.size();
            }

            public List<PublicAddress> getPublicAddressesList() {
                return this.publicAddresses_;
            }

            public PublicAddressOrBuilder getPublicAddressesOrBuilder(int i) {
                return this.publicAddresses_.get(i);
            }

            public List<? extends PublicAddressOrBuilder> getPublicAddressesOrBuilderList() {
                return this.publicAddresses_;
            }

            public static Builder newBuilder(AddPubAddress addPubAddress) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(addPubAddress);
            }

            public static AddPubAddress parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (AddPubAddress) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static AddPubAddress parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (AddPubAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static AddPubAddress parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (AddPubAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            /* access modifiers changed from: private */
            public void addPublicAddresses(int i, PublicAddress publicAddress) {
                publicAddress.getClass();
                ensurePublicAddressesIsMutable();
                this.publicAddresses_.add(i, publicAddress);
            }

            public static AddPubAddress parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (AddPubAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static AddPubAddress parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (AddPubAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static AddPubAddress parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (AddPubAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static AddPubAddress parseFrom(InputStream inputStream) throws IOException {
                return (AddPubAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static AddPubAddress parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (AddPubAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static AddPubAddress parseFrom(C4969g gVar) throws IOException {
                return (AddPubAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static AddPubAddress parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (AddPubAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public interface AddPubAddressOrBuilder extends qu3 {
            /* synthetic */ C4956c0 getDefaultInstanceForType();

            long getFee();

            String getFioAddress();

            ByteString getFioAddressBytes();

            PublicAddress getPublicAddresses(int i);

            int getPublicAddressesCount();

            List<PublicAddress> getPublicAddressesList();

            /* synthetic */ boolean isInitialized();
        }

        public static final class Builder extends GeneratedMessageLite.C4930a<Action, Builder> implements ActionOrBuilder {
            public /* synthetic */ Builder(C97451 r1) {
                this();
            }

            public Builder clearAddPubAddressMessage() {
                copyOnWrite();
                ((Action) this.instance).clearAddPubAddressMessage();
                return this;
            }

            public Builder clearMessageOneof() {
                copyOnWrite();
                ((Action) this.instance).clearMessageOneof();
                return this;
            }

            public Builder clearNewFundsRequestMessage() {
                copyOnWrite();
                ((Action) this.instance).clearNewFundsRequestMessage();
                return this;
            }

            public Builder clearRegisterFioAddressMessage() {
                copyOnWrite();
                ((Action) this.instance).clearRegisterFioAddressMessage();
                return this;
            }

            public Builder clearRenewFioAddressMessage() {
                copyOnWrite();
                ((Action) this.instance).clearRenewFioAddressMessage();
                return this;
            }

            public Builder clearTransferMessage() {
                copyOnWrite();
                ((Action) this.instance).clearTransferMessage();
                return this;
            }

            public AddPubAddress getAddPubAddressMessage() {
                return ((Action) this.instance).getAddPubAddressMessage();
            }

            public MessageOneofCase getMessageOneofCase() {
                return ((Action) this.instance).getMessageOneofCase();
            }

            public NewFundsRequest getNewFundsRequestMessage() {
                return ((Action) this.instance).getNewFundsRequestMessage();
            }

            public RegisterFioAddress getRegisterFioAddressMessage() {
                return ((Action) this.instance).getRegisterFioAddressMessage();
            }

            public RenewFioAddress getRenewFioAddressMessage() {
                return ((Action) this.instance).getRenewFioAddressMessage();
            }

            public Transfer getTransferMessage() {
                return ((Action) this.instance).getTransferMessage();
            }

            public boolean hasAddPubAddressMessage() {
                return ((Action) this.instance).hasAddPubAddressMessage();
            }

            public boolean hasNewFundsRequestMessage() {
                return ((Action) this.instance).hasNewFundsRequestMessage();
            }

            public boolean hasRegisterFioAddressMessage() {
                return ((Action) this.instance).hasRegisterFioAddressMessage();
            }

            public boolean hasRenewFioAddressMessage() {
                return ((Action) this.instance).hasRenewFioAddressMessage();
            }

            public boolean hasTransferMessage() {
                return ((Action) this.instance).hasTransferMessage();
            }

            public Builder mergeAddPubAddressMessage(AddPubAddress addPubAddress) {
                copyOnWrite();
                ((Action) this.instance).mergeAddPubAddressMessage(addPubAddress);
                return this;
            }

            public Builder mergeNewFundsRequestMessage(NewFundsRequest newFundsRequest) {
                copyOnWrite();
                ((Action) this.instance).mergeNewFundsRequestMessage(newFundsRequest);
                return this;
            }

            public Builder mergeRegisterFioAddressMessage(RegisterFioAddress registerFioAddress) {
                copyOnWrite();
                ((Action) this.instance).mergeRegisterFioAddressMessage(registerFioAddress);
                return this;
            }

            public Builder mergeRenewFioAddressMessage(RenewFioAddress renewFioAddress) {
                copyOnWrite();
                ((Action) this.instance).mergeRenewFioAddressMessage(renewFioAddress);
                return this;
            }

            public Builder mergeTransferMessage(Transfer transfer) {
                copyOnWrite();
                ((Action) this.instance).mergeTransferMessage(transfer);
                return this;
            }

            public Builder setAddPubAddressMessage(AddPubAddress addPubAddress) {
                copyOnWrite();
                ((Action) this.instance).setAddPubAddressMessage(addPubAddress);
                return this;
            }

            public Builder setNewFundsRequestMessage(NewFundsRequest newFundsRequest) {
                copyOnWrite();
                ((Action) this.instance).setNewFundsRequestMessage(newFundsRequest);
                return this;
            }

            public Builder setRegisterFioAddressMessage(RegisterFioAddress registerFioAddress) {
                copyOnWrite();
                ((Action) this.instance).setRegisterFioAddressMessage(registerFioAddress);
                return this;
            }

            public Builder setRenewFioAddressMessage(RenewFioAddress renewFioAddress) {
                copyOnWrite();
                ((Action) this.instance).setRenewFioAddressMessage(renewFioAddress);
                return this;
            }

            public Builder setTransferMessage(Transfer transfer) {
                copyOnWrite();
                ((Action) this.instance).setTransferMessage(transfer);
                return this;
            }

            private Builder() {
                super(Action.DEFAULT_INSTANCE);
            }

            public Builder setAddPubAddressMessage(AddPubAddress.Builder builder) {
                copyOnWrite();
                ((Action) this.instance).setAddPubAddressMessage((AddPubAddress) builder.build());
                return this;
            }

            public Builder setNewFundsRequestMessage(NewFundsRequest.Builder builder) {
                copyOnWrite();
                ((Action) this.instance).setNewFundsRequestMessage((NewFundsRequest) builder.build());
                return this;
            }

            public Builder setRegisterFioAddressMessage(RegisterFioAddress.Builder builder) {
                copyOnWrite();
                ((Action) this.instance).setRegisterFioAddressMessage((RegisterFioAddress) builder.build());
                return this;
            }

            public Builder setRenewFioAddressMessage(RenewFioAddress.Builder builder) {
                copyOnWrite();
                ((Action) this.instance).setRenewFioAddressMessage((RenewFioAddress) builder.build());
                return this;
            }

            public Builder setTransferMessage(Transfer.Builder builder) {
                copyOnWrite();
                ((Action) this.instance).setTransferMessage((Transfer) builder.build());
                return this;
            }
        }

        public enum MessageOneofCase {
            REGISTER_FIO_ADDRESS_MESSAGE(1),
            ADD_PUB_ADDRESS_MESSAGE(2),
            TRANSFER_MESSAGE(3),
            RENEW_FIO_ADDRESS_MESSAGE(4),
            NEW_FUNDS_REQUEST_MESSAGE(5),
            MESSAGEONEOF_NOT_SET(0);
            
            private final int value;

            private MessageOneofCase(int i) {
                this.value = i;
            }

            public static MessageOneofCase forNumber(int i) {
                if (i == 0) {
                    return MESSAGEONEOF_NOT_SET;
                }
                if (i == 1) {
                    return REGISTER_FIO_ADDRESS_MESSAGE;
                }
                if (i == 2) {
                    return ADD_PUB_ADDRESS_MESSAGE;
                }
                if (i == 3) {
                    return TRANSFER_MESSAGE;
                }
                if (i == 4) {
                    return RENEW_FIO_ADDRESS_MESSAGE;
                }
                if (i != 5) {
                    return null;
                }
                return NEW_FUNDS_REQUEST_MESSAGE;
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static MessageOneofCase valueOf(int i) {
                return forNumber(i);
            }
        }

        public static final class NewFundsRequest extends GeneratedMessageLite<NewFundsRequest, Builder> implements NewFundsRequestOrBuilder {
            public static final int CONTENT_FIELD_NUMBER = 4;
            /* access modifiers changed from: private */
            public static final NewFundsRequest DEFAULT_INSTANCE;
            public static final int FEE_FIELD_NUMBER = 5;
            private static volatile im4<NewFundsRequest> PARSER = null;
            public static final int PAYEE_FIO_NAME_FIELD_NUMBER = 3;
            public static final int PAYER_FIO_ADDRESS_FIELD_NUMBER = 2;
            public static final int PAYER_FIO_NAME_FIELD_NUMBER = 1;
            private NewFundsContent content_;
            private long fee_;
            private String payeeFioName_ = "";
            private String payerFioAddress_ = "";
            private String payerFioName_ = "";

            public static final class Builder extends GeneratedMessageLite.C4930a<NewFundsRequest, Builder> implements NewFundsRequestOrBuilder {
                public /* synthetic */ Builder(C97451 r1) {
                    this();
                }

                public Builder clearContent() {
                    copyOnWrite();
                    ((NewFundsRequest) this.instance).clearContent();
                    return this;
                }

                public Builder clearFee() {
                    copyOnWrite();
                    ((NewFundsRequest) this.instance).clearFee();
                    return this;
                }

                public Builder clearPayeeFioName() {
                    copyOnWrite();
                    ((NewFundsRequest) this.instance).clearPayeeFioName();
                    return this;
                }

                public Builder clearPayerFioAddress() {
                    copyOnWrite();
                    ((NewFundsRequest) this.instance).clearPayerFioAddress();
                    return this;
                }

                public Builder clearPayerFioName() {
                    copyOnWrite();
                    ((NewFundsRequest) this.instance).clearPayerFioName();
                    return this;
                }

                public NewFundsContent getContent() {
                    return ((NewFundsRequest) this.instance).getContent();
                }

                public long getFee() {
                    return ((NewFundsRequest) this.instance).getFee();
                }

                public String getPayeeFioName() {
                    return ((NewFundsRequest) this.instance).getPayeeFioName();
                }

                public ByteString getPayeeFioNameBytes() {
                    return ((NewFundsRequest) this.instance).getPayeeFioNameBytes();
                }

                public String getPayerFioAddress() {
                    return ((NewFundsRequest) this.instance).getPayerFioAddress();
                }

                public ByteString getPayerFioAddressBytes() {
                    return ((NewFundsRequest) this.instance).getPayerFioAddressBytes();
                }

                public String getPayerFioName() {
                    return ((NewFundsRequest) this.instance).getPayerFioName();
                }

                public ByteString getPayerFioNameBytes() {
                    return ((NewFundsRequest) this.instance).getPayerFioNameBytes();
                }

                public boolean hasContent() {
                    return ((NewFundsRequest) this.instance).hasContent();
                }

                public Builder mergeContent(NewFundsContent newFundsContent) {
                    copyOnWrite();
                    ((NewFundsRequest) this.instance).mergeContent(newFundsContent);
                    return this;
                }

                public Builder setContent(NewFundsContent newFundsContent) {
                    copyOnWrite();
                    ((NewFundsRequest) this.instance).setContent(newFundsContent);
                    return this;
                }

                public Builder setFee(long j) {
                    copyOnWrite();
                    ((NewFundsRequest) this.instance).setFee(j);
                    return this;
                }

                public Builder setPayeeFioName(String str) {
                    copyOnWrite();
                    ((NewFundsRequest) this.instance).setPayeeFioName(str);
                    return this;
                }

                public Builder setPayeeFioNameBytes(ByteString byteString) {
                    copyOnWrite();
                    ((NewFundsRequest) this.instance).setPayeeFioNameBytes(byteString);
                    return this;
                }

                public Builder setPayerFioAddress(String str) {
                    copyOnWrite();
                    ((NewFundsRequest) this.instance).setPayerFioAddress(str);
                    return this;
                }

                public Builder setPayerFioAddressBytes(ByteString byteString) {
                    copyOnWrite();
                    ((NewFundsRequest) this.instance).setPayerFioAddressBytes(byteString);
                    return this;
                }

                public Builder setPayerFioName(String str) {
                    copyOnWrite();
                    ((NewFundsRequest) this.instance).setPayerFioName(str);
                    return this;
                }

                public Builder setPayerFioNameBytes(ByteString byteString) {
                    copyOnWrite();
                    ((NewFundsRequest) this.instance).setPayerFioNameBytes(byteString);
                    return this;
                }

                private Builder() {
                    super(NewFundsRequest.DEFAULT_INSTANCE);
                }

                public Builder setContent(NewFundsContent.Builder builder) {
                    copyOnWrite();
                    ((NewFundsRequest) this.instance).setContent((NewFundsContent) builder.build());
                    return this;
                }
            }

            static {
                NewFundsRequest newFundsRequest = new NewFundsRequest();
                DEFAULT_INSTANCE = newFundsRequest;
                GeneratedMessageLite.registerDefaultInstance(NewFundsRequest.class, newFundsRequest);
            }

            private NewFundsRequest() {
            }

            /* access modifiers changed from: private */
            public void clearContent() {
                this.content_ = null;
            }

            /* access modifiers changed from: private */
            public void clearFee() {
                this.fee_ = 0;
            }

            /* access modifiers changed from: private */
            public void clearPayeeFioName() {
                this.payeeFioName_ = getDefaultInstance().getPayeeFioName();
            }

            /* access modifiers changed from: private */
            public void clearPayerFioAddress() {
                this.payerFioAddress_ = getDefaultInstance().getPayerFioAddress();
            }

            /* access modifiers changed from: private */
            public void clearPayerFioName() {
                this.payerFioName_ = getDefaultInstance().getPayerFioName();
            }

            public static NewFundsRequest getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* access modifiers changed from: private */
            public void mergeContent(NewFundsContent newFundsContent) {
                newFundsContent.getClass();
                NewFundsContent newFundsContent2 = this.content_;
                if (newFundsContent2 == null || newFundsContent2 == NewFundsContent.getDefaultInstance()) {
                    this.content_ = newFundsContent;
                } else {
                    this.content_ = (NewFundsContent) ((NewFundsContent.Builder) NewFundsContent.newBuilder(this.content_).mergeFrom(newFundsContent)).buildPartial();
                }
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static NewFundsRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (NewFundsRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static NewFundsRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (NewFundsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<NewFundsRequest> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setContent(NewFundsContent newFundsContent) {
                newFundsContent.getClass();
                this.content_ = newFundsContent;
            }

            /* access modifiers changed from: private */
            public void setFee(long j) {
                this.fee_ = j;
            }

            /* access modifiers changed from: private */
            public void setPayeeFioName(String str) {
                str.getClass();
                this.payeeFioName_ = str;
            }

            /* access modifiers changed from: private */
            public void setPayeeFioNameBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.payeeFioName_ = byteString.toStringUtf8();
            }

            /* access modifiers changed from: private */
            public void setPayerFioAddress(String str) {
                str.getClass();
                this.payerFioAddress_ = str;
            }

            /* access modifiers changed from: private */
            public void setPayerFioAddressBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.payerFioAddress_ = byteString.toStringUtf8();
            }

            /* access modifiers changed from: private */
            public void setPayerFioName(String str) {
                str.getClass();
                this.payerFioName_ = str;
            }

            /* access modifiers changed from: private */
            public void setPayerFioNameBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.payerFioName_ = byteString.toStringUtf8();
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97451.f46558xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new NewFundsRequest();
                    case 2:
                        return new Builder((C97451) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\t\u0005\u0003", new Object[]{"payerFioName_", "payerFioAddress_", "payeeFioName_", "content_", "fee_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<NewFundsRequest> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (NewFundsRequest.class) {
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

            public NewFundsContent getContent() {
                NewFundsContent newFundsContent = this.content_;
                if (newFundsContent == null) {
                    return NewFundsContent.getDefaultInstance();
                }
                return newFundsContent;
            }

            public long getFee() {
                return this.fee_;
            }

            public String getPayeeFioName() {
                return this.payeeFioName_;
            }

            public ByteString getPayeeFioNameBytes() {
                return ByteString.copyFromUtf8(this.payeeFioName_);
            }

            public String getPayerFioAddress() {
                return this.payerFioAddress_;
            }

            public ByteString getPayerFioAddressBytes() {
                return ByteString.copyFromUtf8(this.payerFioAddress_);
            }

            public String getPayerFioName() {
                return this.payerFioName_;
            }

            public ByteString getPayerFioNameBytes() {
                return ByteString.copyFromUtf8(this.payerFioName_);
            }

            public boolean hasContent() {
                if (this.content_ != null) {
                    return true;
                }
                return false;
            }

            public static Builder newBuilder(NewFundsRequest newFundsRequest) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(newFundsRequest);
            }

            public static NewFundsRequest parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (NewFundsRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static NewFundsRequest parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (NewFundsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static NewFundsRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (NewFundsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static NewFundsRequest parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (NewFundsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static NewFundsRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (NewFundsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static NewFundsRequest parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (NewFundsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static NewFundsRequest parseFrom(InputStream inputStream) throws IOException {
                return (NewFundsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static NewFundsRequest parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (NewFundsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static NewFundsRequest parseFrom(C4969g gVar) throws IOException {
                return (NewFundsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static NewFundsRequest parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (NewFundsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public interface NewFundsRequestOrBuilder extends qu3 {
            NewFundsContent getContent();

            /* synthetic */ C4956c0 getDefaultInstanceForType();

            long getFee();

            String getPayeeFioName();

            ByteString getPayeeFioNameBytes();

            String getPayerFioAddress();

            ByteString getPayerFioAddressBytes();

            String getPayerFioName();

            ByteString getPayerFioNameBytes();

            boolean hasContent();

            /* synthetic */ boolean isInitialized();
        }

        public static final class RegisterFioAddress extends GeneratedMessageLite<RegisterFioAddress, Builder> implements RegisterFioAddressOrBuilder {
            /* access modifiers changed from: private */
            public static final RegisterFioAddress DEFAULT_INSTANCE;
            public static final int FEE_FIELD_NUMBER = 3;
            public static final int FIO_ADDRESS_FIELD_NUMBER = 1;
            public static final int OWNER_FIO_PUBLIC_KEY_FIELD_NUMBER = 2;
            private static volatile im4<RegisterFioAddress> PARSER;
            private long fee_;
            private String fioAddress_ = "";
            private String ownerFioPublicKey_ = "";

            public static final class Builder extends GeneratedMessageLite.C4930a<RegisterFioAddress, Builder> implements RegisterFioAddressOrBuilder {
                public /* synthetic */ Builder(C97451 r1) {
                    this();
                }

                public Builder clearFee() {
                    copyOnWrite();
                    ((RegisterFioAddress) this.instance).clearFee();
                    return this;
                }

                public Builder clearFioAddress() {
                    copyOnWrite();
                    ((RegisterFioAddress) this.instance).clearFioAddress();
                    return this;
                }

                public Builder clearOwnerFioPublicKey() {
                    copyOnWrite();
                    ((RegisterFioAddress) this.instance).clearOwnerFioPublicKey();
                    return this;
                }

                public long getFee() {
                    return ((RegisterFioAddress) this.instance).getFee();
                }

                public String getFioAddress() {
                    return ((RegisterFioAddress) this.instance).getFioAddress();
                }

                public ByteString getFioAddressBytes() {
                    return ((RegisterFioAddress) this.instance).getFioAddressBytes();
                }

                public String getOwnerFioPublicKey() {
                    return ((RegisterFioAddress) this.instance).getOwnerFioPublicKey();
                }

                public ByteString getOwnerFioPublicKeyBytes() {
                    return ((RegisterFioAddress) this.instance).getOwnerFioPublicKeyBytes();
                }

                public Builder setFee(long j) {
                    copyOnWrite();
                    ((RegisterFioAddress) this.instance).setFee(j);
                    return this;
                }

                public Builder setFioAddress(String str) {
                    copyOnWrite();
                    ((RegisterFioAddress) this.instance).setFioAddress(str);
                    return this;
                }

                public Builder setFioAddressBytes(ByteString byteString) {
                    copyOnWrite();
                    ((RegisterFioAddress) this.instance).setFioAddressBytes(byteString);
                    return this;
                }

                public Builder setOwnerFioPublicKey(String str) {
                    copyOnWrite();
                    ((RegisterFioAddress) this.instance).setOwnerFioPublicKey(str);
                    return this;
                }

                public Builder setOwnerFioPublicKeyBytes(ByteString byteString) {
                    copyOnWrite();
                    ((RegisterFioAddress) this.instance).setOwnerFioPublicKeyBytes(byteString);
                    return this;
                }

                private Builder() {
                    super(RegisterFioAddress.DEFAULT_INSTANCE);
                }
            }

            static {
                RegisterFioAddress registerFioAddress = new RegisterFioAddress();
                DEFAULT_INSTANCE = registerFioAddress;
                GeneratedMessageLite.registerDefaultInstance(RegisterFioAddress.class, registerFioAddress);
            }

            private RegisterFioAddress() {
            }

            /* access modifiers changed from: private */
            public void clearFee() {
                this.fee_ = 0;
            }

            /* access modifiers changed from: private */
            public void clearFioAddress() {
                this.fioAddress_ = getDefaultInstance().getFioAddress();
            }

            /* access modifiers changed from: private */
            public void clearOwnerFioPublicKey() {
                this.ownerFioPublicKey_ = getDefaultInstance().getOwnerFioPublicKey();
            }

            public static RegisterFioAddress getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static RegisterFioAddress parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (RegisterFioAddress) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static RegisterFioAddress parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (RegisterFioAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<RegisterFioAddress> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setFee(long j) {
                this.fee_ = j;
            }

            /* access modifiers changed from: private */
            public void setFioAddress(String str) {
                str.getClass();
                this.fioAddress_ = str;
            }

            /* access modifiers changed from: private */
            public void setFioAddressBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.fioAddress_ = byteString.toStringUtf8();
            }

            /* access modifiers changed from: private */
            public void setOwnerFioPublicKey(String str) {
                str.getClass();
                this.ownerFioPublicKey_ = str;
            }

            /* access modifiers changed from: private */
            public void setOwnerFioPublicKeyBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.ownerFioPublicKey_ = byteString.toStringUtf8();
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97451.f46558xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new RegisterFioAddress();
                    case 2:
                        return new Builder((C97451) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0003", new Object[]{"fioAddress_", "ownerFioPublicKey_", "fee_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<RegisterFioAddress> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (RegisterFioAddress.class) {
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

            public String getFioAddress() {
                return this.fioAddress_;
            }

            public ByteString getFioAddressBytes() {
                return ByteString.copyFromUtf8(this.fioAddress_);
            }

            public String getOwnerFioPublicKey() {
                return this.ownerFioPublicKey_;
            }

            public ByteString getOwnerFioPublicKeyBytes() {
                return ByteString.copyFromUtf8(this.ownerFioPublicKey_);
            }

            public static Builder newBuilder(RegisterFioAddress registerFioAddress) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(registerFioAddress);
            }

            public static RegisterFioAddress parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (RegisterFioAddress) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static RegisterFioAddress parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (RegisterFioAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static RegisterFioAddress parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (RegisterFioAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static RegisterFioAddress parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (RegisterFioAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static RegisterFioAddress parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (RegisterFioAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static RegisterFioAddress parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (RegisterFioAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static RegisterFioAddress parseFrom(InputStream inputStream) throws IOException {
                return (RegisterFioAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static RegisterFioAddress parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (RegisterFioAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static RegisterFioAddress parseFrom(C4969g gVar) throws IOException {
                return (RegisterFioAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static RegisterFioAddress parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (RegisterFioAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public interface RegisterFioAddressOrBuilder extends qu3 {
            /* synthetic */ C4956c0 getDefaultInstanceForType();

            long getFee();

            String getFioAddress();

            ByteString getFioAddressBytes();

            String getOwnerFioPublicKey();

            ByteString getOwnerFioPublicKeyBytes();

            /* synthetic */ boolean isInitialized();
        }

        public static final class RenewFioAddress extends GeneratedMessageLite<RenewFioAddress, Builder> implements RenewFioAddressOrBuilder {
            /* access modifiers changed from: private */
            public static final RenewFioAddress DEFAULT_INSTANCE;
            public static final int FEE_FIELD_NUMBER = 3;
            public static final int FIO_ADDRESS_FIELD_NUMBER = 1;
            public static final int OWNER_FIO_PUBLIC_KEY_FIELD_NUMBER = 2;
            private static volatile im4<RenewFioAddress> PARSER;
            private long fee_;
            private String fioAddress_ = "";
            private String ownerFioPublicKey_ = "";

            public static final class Builder extends GeneratedMessageLite.C4930a<RenewFioAddress, Builder> implements RenewFioAddressOrBuilder {
                public /* synthetic */ Builder(C97451 r1) {
                    this();
                }

                public Builder clearFee() {
                    copyOnWrite();
                    ((RenewFioAddress) this.instance).clearFee();
                    return this;
                }

                public Builder clearFioAddress() {
                    copyOnWrite();
                    ((RenewFioAddress) this.instance).clearFioAddress();
                    return this;
                }

                public Builder clearOwnerFioPublicKey() {
                    copyOnWrite();
                    ((RenewFioAddress) this.instance).clearOwnerFioPublicKey();
                    return this;
                }

                public long getFee() {
                    return ((RenewFioAddress) this.instance).getFee();
                }

                public String getFioAddress() {
                    return ((RenewFioAddress) this.instance).getFioAddress();
                }

                public ByteString getFioAddressBytes() {
                    return ((RenewFioAddress) this.instance).getFioAddressBytes();
                }

                public String getOwnerFioPublicKey() {
                    return ((RenewFioAddress) this.instance).getOwnerFioPublicKey();
                }

                public ByteString getOwnerFioPublicKeyBytes() {
                    return ((RenewFioAddress) this.instance).getOwnerFioPublicKeyBytes();
                }

                public Builder setFee(long j) {
                    copyOnWrite();
                    ((RenewFioAddress) this.instance).setFee(j);
                    return this;
                }

                public Builder setFioAddress(String str) {
                    copyOnWrite();
                    ((RenewFioAddress) this.instance).setFioAddress(str);
                    return this;
                }

                public Builder setFioAddressBytes(ByteString byteString) {
                    copyOnWrite();
                    ((RenewFioAddress) this.instance).setFioAddressBytes(byteString);
                    return this;
                }

                public Builder setOwnerFioPublicKey(String str) {
                    copyOnWrite();
                    ((RenewFioAddress) this.instance).setOwnerFioPublicKey(str);
                    return this;
                }

                public Builder setOwnerFioPublicKeyBytes(ByteString byteString) {
                    copyOnWrite();
                    ((RenewFioAddress) this.instance).setOwnerFioPublicKeyBytes(byteString);
                    return this;
                }

                private Builder() {
                    super(RenewFioAddress.DEFAULT_INSTANCE);
                }
            }

            static {
                RenewFioAddress renewFioAddress = new RenewFioAddress();
                DEFAULT_INSTANCE = renewFioAddress;
                GeneratedMessageLite.registerDefaultInstance(RenewFioAddress.class, renewFioAddress);
            }

            private RenewFioAddress() {
            }

            /* access modifiers changed from: private */
            public void clearFee() {
                this.fee_ = 0;
            }

            /* access modifiers changed from: private */
            public void clearFioAddress() {
                this.fioAddress_ = getDefaultInstance().getFioAddress();
            }

            /* access modifiers changed from: private */
            public void clearOwnerFioPublicKey() {
                this.ownerFioPublicKey_ = getDefaultInstance().getOwnerFioPublicKey();
            }

            public static RenewFioAddress getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static RenewFioAddress parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (RenewFioAddress) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static RenewFioAddress parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (RenewFioAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<RenewFioAddress> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setFee(long j) {
                this.fee_ = j;
            }

            /* access modifiers changed from: private */
            public void setFioAddress(String str) {
                str.getClass();
                this.fioAddress_ = str;
            }

            /* access modifiers changed from: private */
            public void setFioAddressBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.fioAddress_ = byteString.toStringUtf8();
            }

            /* access modifiers changed from: private */
            public void setOwnerFioPublicKey(String str) {
                str.getClass();
                this.ownerFioPublicKey_ = str;
            }

            /* access modifiers changed from: private */
            public void setOwnerFioPublicKeyBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.ownerFioPublicKey_ = byteString.toStringUtf8();
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97451.f46558xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new RenewFioAddress();
                    case 2:
                        return new Builder((C97451) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0003", new Object[]{"fioAddress_", "ownerFioPublicKey_", "fee_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<RenewFioAddress> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (RenewFioAddress.class) {
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

            public String getFioAddress() {
                return this.fioAddress_;
            }

            public ByteString getFioAddressBytes() {
                return ByteString.copyFromUtf8(this.fioAddress_);
            }

            public String getOwnerFioPublicKey() {
                return this.ownerFioPublicKey_;
            }

            public ByteString getOwnerFioPublicKeyBytes() {
                return ByteString.copyFromUtf8(this.ownerFioPublicKey_);
            }

            public static Builder newBuilder(RenewFioAddress renewFioAddress) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(renewFioAddress);
            }

            public static RenewFioAddress parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (RenewFioAddress) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static RenewFioAddress parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (RenewFioAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static RenewFioAddress parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (RenewFioAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static RenewFioAddress parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (RenewFioAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static RenewFioAddress parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (RenewFioAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static RenewFioAddress parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (RenewFioAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static RenewFioAddress parseFrom(InputStream inputStream) throws IOException {
                return (RenewFioAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static RenewFioAddress parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (RenewFioAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static RenewFioAddress parseFrom(C4969g gVar) throws IOException {
                return (RenewFioAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static RenewFioAddress parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (RenewFioAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public interface RenewFioAddressOrBuilder extends qu3 {
            /* synthetic */ C4956c0 getDefaultInstanceForType();

            long getFee();

            String getFioAddress();

            ByteString getFioAddressBytes();

            String getOwnerFioPublicKey();

            ByteString getOwnerFioPublicKeyBytes();

            /* synthetic */ boolean isInitialized();
        }

        public static final class Transfer extends GeneratedMessageLite<Transfer, Builder> implements TransferOrBuilder {
            public static final int AMOUNT_FIELD_NUMBER = 2;
            /* access modifiers changed from: private */
            public static final Transfer DEFAULT_INSTANCE;
            public static final int FEE_FIELD_NUMBER = 3;
            private static volatile im4<Transfer> PARSER = null;
            public static final int PAYEE_PUBLIC_KEY_FIELD_NUMBER = 1;
            private long amount_;
            private long fee_;
            private String payeePublicKey_ = "";

            public static final class Builder extends GeneratedMessageLite.C4930a<Transfer, Builder> implements TransferOrBuilder {
                public /* synthetic */ Builder(C97451 r1) {
                    this();
                }

                public Builder clearAmount() {
                    copyOnWrite();
                    ((Transfer) this.instance).clearAmount();
                    return this;
                }

                public Builder clearFee() {
                    copyOnWrite();
                    ((Transfer) this.instance).clearFee();
                    return this;
                }

                public Builder clearPayeePublicKey() {
                    copyOnWrite();
                    ((Transfer) this.instance).clearPayeePublicKey();
                    return this;
                }

                public long getAmount() {
                    return ((Transfer) this.instance).getAmount();
                }

                public long getFee() {
                    return ((Transfer) this.instance).getFee();
                }

                public String getPayeePublicKey() {
                    return ((Transfer) this.instance).getPayeePublicKey();
                }

                public ByteString getPayeePublicKeyBytes() {
                    return ((Transfer) this.instance).getPayeePublicKeyBytes();
                }

                public Builder setAmount(long j) {
                    copyOnWrite();
                    ((Transfer) this.instance).setAmount(j);
                    return this;
                }

                public Builder setFee(long j) {
                    copyOnWrite();
                    ((Transfer) this.instance).setFee(j);
                    return this;
                }

                public Builder setPayeePublicKey(String str) {
                    copyOnWrite();
                    ((Transfer) this.instance).setPayeePublicKey(str);
                    return this;
                }

                public Builder setPayeePublicKeyBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Transfer) this.instance).setPayeePublicKeyBytes(byteString);
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
            public void clearAmount() {
                this.amount_ = 0;
            }

            /* access modifiers changed from: private */
            public void clearFee() {
                this.fee_ = 0;
            }

            /* access modifiers changed from: private */
            public void clearPayeePublicKey() {
                this.payeePublicKey_ = getDefaultInstance().getPayeePublicKey();
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
            public void setAmount(long j) {
                this.amount_ = j;
            }

            /* access modifiers changed from: private */
            public void setFee(long j) {
                this.fee_ = j;
            }

            /* access modifiers changed from: private */
            public void setPayeePublicKey(String str) {
                str.getClass();
                this.payeePublicKey_ = str;
            }

            /* access modifiers changed from: private */
            public void setPayeePublicKeyBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.payeePublicKey_ = byteString.toStringUtf8();
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97451.f46558xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Transfer();
                    case 2:
                        return new Builder((C97451) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0003\u0003\u0003", new Object[]{"payeePublicKey_", "amount_", "fee_"});
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

            public long getAmount() {
                return this.amount_;
            }

            public long getFee() {
                return this.fee_;
            }

            public String getPayeePublicKey() {
                return this.payeePublicKey_;
            }

            public ByteString getPayeePublicKeyBytes() {
                return ByteString.copyFromUtf8(this.payeePublicKey_);
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
            long getAmount();

            /* synthetic */ C4956c0 getDefaultInstanceForType();

            long getFee();

            String getPayeePublicKey();

            ByteString getPayeePublicKeyBytes();

            /* synthetic */ boolean isInitialized();
        }

        static {
            Action action = new Action();
            DEFAULT_INSTANCE = action;
            GeneratedMessageLite.registerDefaultInstance(Action.class, action);
        }

        private Action() {
        }

        /* access modifiers changed from: private */
        public void clearAddPubAddressMessage() {
            if (this.messageOneofCase_ == 2) {
                this.messageOneofCase_ = 0;
                this.messageOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearMessageOneof() {
            this.messageOneofCase_ = 0;
            this.messageOneof_ = null;
        }

        /* access modifiers changed from: private */
        public void clearNewFundsRequestMessage() {
            if (this.messageOneofCase_ == 5) {
                this.messageOneofCase_ = 0;
                this.messageOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearRegisterFioAddressMessage() {
            if (this.messageOneofCase_ == 1) {
                this.messageOneofCase_ = 0;
                this.messageOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearRenewFioAddressMessage() {
            if (this.messageOneofCase_ == 4) {
                this.messageOneofCase_ = 0;
                this.messageOneof_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearTransferMessage() {
            if (this.messageOneofCase_ == 3) {
                this.messageOneofCase_ = 0;
                this.messageOneof_ = null;
            }
        }

        public static Action getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeAddPubAddressMessage(AddPubAddress addPubAddress) {
            addPubAddress.getClass();
            if (this.messageOneofCase_ != 2 || this.messageOneof_ == AddPubAddress.getDefaultInstance()) {
                this.messageOneof_ = addPubAddress;
            } else {
                this.messageOneof_ = ((AddPubAddress.Builder) AddPubAddress.newBuilder((AddPubAddress) this.messageOneof_).mergeFrom(addPubAddress)).buildPartial();
            }
            this.messageOneofCase_ = 2;
        }

        /* access modifiers changed from: private */
        public void mergeNewFundsRequestMessage(NewFundsRequest newFundsRequest) {
            newFundsRequest.getClass();
            if (this.messageOneofCase_ != 5 || this.messageOneof_ == NewFundsRequest.getDefaultInstance()) {
                this.messageOneof_ = newFundsRequest;
            } else {
                this.messageOneof_ = ((NewFundsRequest.Builder) NewFundsRequest.newBuilder((NewFundsRequest) this.messageOneof_).mergeFrom(newFundsRequest)).buildPartial();
            }
            this.messageOneofCase_ = 5;
        }

        /* access modifiers changed from: private */
        public void mergeRegisterFioAddressMessage(RegisterFioAddress registerFioAddress) {
            registerFioAddress.getClass();
            if (this.messageOneofCase_ != 1 || this.messageOneof_ == RegisterFioAddress.getDefaultInstance()) {
                this.messageOneof_ = registerFioAddress;
            } else {
                this.messageOneof_ = ((RegisterFioAddress.Builder) RegisterFioAddress.newBuilder((RegisterFioAddress) this.messageOneof_).mergeFrom(registerFioAddress)).buildPartial();
            }
            this.messageOneofCase_ = 1;
        }

        /* access modifiers changed from: private */
        public void mergeRenewFioAddressMessage(RenewFioAddress renewFioAddress) {
            renewFioAddress.getClass();
            if (this.messageOneofCase_ != 4 || this.messageOneof_ == RenewFioAddress.getDefaultInstance()) {
                this.messageOneof_ = renewFioAddress;
            } else {
                this.messageOneof_ = ((RenewFioAddress.Builder) RenewFioAddress.newBuilder((RenewFioAddress) this.messageOneof_).mergeFrom(renewFioAddress)).buildPartial();
            }
            this.messageOneofCase_ = 4;
        }

        /* access modifiers changed from: private */
        public void mergeTransferMessage(Transfer transfer) {
            transfer.getClass();
            if (this.messageOneofCase_ != 3 || this.messageOneof_ == Transfer.getDefaultInstance()) {
                this.messageOneof_ = transfer;
            } else {
                this.messageOneof_ = ((Transfer.Builder) Transfer.newBuilder((Transfer) this.messageOneof_).mergeFrom(transfer)).buildPartial();
            }
            this.messageOneofCase_ = 3;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Action parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Action) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Action parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<Action> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAddPubAddressMessage(AddPubAddress addPubAddress) {
            addPubAddress.getClass();
            this.messageOneof_ = addPubAddress;
            this.messageOneofCase_ = 2;
        }

        /* access modifiers changed from: private */
        public void setNewFundsRequestMessage(NewFundsRequest newFundsRequest) {
            newFundsRequest.getClass();
            this.messageOneof_ = newFundsRequest;
            this.messageOneofCase_ = 5;
        }

        /* access modifiers changed from: private */
        public void setRegisterFioAddressMessage(RegisterFioAddress registerFioAddress) {
            registerFioAddress.getClass();
            this.messageOneof_ = registerFioAddress;
            this.messageOneofCase_ = 1;
        }

        /* access modifiers changed from: private */
        public void setRenewFioAddressMessage(RenewFioAddress renewFioAddress) {
            renewFioAddress.getClass();
            this.messageOneof_ = renewFioAddress;
            this.messageOneofCase_ = 4;
        }

        /* access modifiers changed from: private */
        public void setTransferMessage(Transfer transfer) {
            transfer.getClass();
            this.messageOneof_ = transfer;
            this.messageOneofCase_ = 3;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97451.f46558xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Action();
                case 2:
                    return new Builder((C97451) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"messageOneof_", "messageOneofCase_", RegisterFioAddress.class, AddPubAddress.class, Transfer.class, RenewFioAddress.class, NewFundsRequest.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<Action> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (Action.class) {
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

        public AddPubAddress getAddPubAddressMessage() {
            if (this.messageOneofCase_ == 2) {
                return (AddPubAddress) this.messageOneof_;
            }
            return AddPubAddress.getDefaultInstance();
        }

        public MessageOneofCase getMessageOneofCase() {
            return MessageOneofCase.forNumber(this.messageOneofCase_);
        }

        public NewFundsRequest getNewFundsRequestMessage() {
            if (this.messageOneofCase_ == 5) {
                return (NewFundsRequest) this.messageOneof_;
            }
            return NewFundsRequest.getDefaultInstance();
        }

        public RegisterFioAddress getRegisterFioAddressMessage() {
            if (this.messageOneofCase_ == 1) {
                return (RegisterFioAddress) this.messageOneof_;
            }
            return RegisterFioAddress.getDefaultInstance();
        }

        public RenewFioAddress getRenewFioAddressMessage() {
            if (this.messageOneofCase_ == 4) {
                return (RenewFioAddress) this.messageOneof_;
            }
            return RenewFioAddress.getDefaultInstance();
        }

        public Transfer getTransferMessage() {
            if (this.messageOneofCase_ == 3) {
                return (Transfer) this.messageOneof_;
            }
            return Transfer.getDefaultInstance();
        }

        public boolean hasAddPubAddressMessage() {
            if (this.messageOneofCase_ == 2) {
                return true;
            }
            return false;
        }

        public boolean hasNewFundsRequestMessage() {
            if (this.messageOneofCase_ == 5) {
                return true;
            }
            return false;
        }

        public boolean hasRegisterFioAddressMessage() {
            if (this.messageOneofCase_ == 1) {
                return true;
            }
            return false;
        }

        public boolean hasRenewFioAddressMessage() {
            if (this.messageOneofCase_ == 4) {
                return true;
            }
            return false;
        }

        public boolean hasTransferMessage() {
            if (this.messageOneofCase_ == 3) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(Action action) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(action);
        }

        public static Action parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Action) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Action parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static Action parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Action parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static Action parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Action parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static Action parseFrom(InputStream inputStream) throws IOException {
            return (Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Action parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Action parseFrom(C4969g gVar) throws IOException {
            return (Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static Action parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface ActionOrBuilder extends qu3 {
        Action.AddPubAddress getAddPubAddressMessage();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        Action.MessageOneofCase getMessageOneofCase();

        Action.NewFundsRequest getNewFundsRequestMessage();

        Action.RegisterFioAddress getRegisterFioAddressMessage();

        Action.RenewFioAddress getRenewFioAddressMessage();

        Action.Transfer getTransferMessage();

        boolean hasAddPubAddressMessage();

        boolean hasNewFundsRequestMessage();

        boolean hasRegisterFioAddressMessage();

        boolean hasRenewFioAddressMessage();

        boolean hasTransferMessage();

        /* synthetic */ boolean isInitialized();
    }

    public static final class ChainParams extends GeneratedMessageLite<ChainParams, Builder> implements ChainParamsOrBuilder {
        public static final int CHAIN_ID_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final ChainParams DEFAULT_INSTANCE;
        public static final int HEAD_BLOCK_NUMBER_FIELD_NUMBER = 2;
        private static volatile im4<ChainParams> PARSER = null;
        public static final int REF_BLOCK_PREFIX_FIELD_NUMBER = 3;
        private ByteString chainId_ = ByteString.EMPTY;
        private long headBlockNumber_;
        private long refBlockPrefix_;

        public static final class Builder extends GeneratedMessageLite.C4930a<ChainParams, Builder> implements ChainParamsOrBuilder {
            public /* synthetic */ Builder(C97451 r1) {
                this();
            }

            public Builder clearChainId() {
                copyOnWrite();
                ((ChainParams) this.instance).clearChainId();
                return this;
            }

            public Builder clearHeadBlockNumber() {
                copyOnWrite();
                ((ChainParams) this.instance).clearHeadBlockNumber();
                return this;
            }

            public Builder clearRefBlockPrefix() {
                copyOnWrite();
                ((ChainParams) this.instance).clearRefBlockPrefix();
                return this;
            }

            public ByteString getChainId() {
                return ((ChainParams) this.instance).getChainId();
            }

            public long getHeadBlockNumber() {
                return ((ChainParams) this.instance).getHeadBlockNumber();
            }

            public long getRefBlockPrefix() {
                return ((ChainParams) this.instance).getRefBlockPrefix();
            }

            public Builder setChainId(ByteString byteString) {
                copyOnWrite();
                ((ChainParams) this.instance).setChainId(byteString);
                return this;
            }

            public Builder setHeadBlockNumber(long j) {
                copyOnWrite();
                ((ChainParams) this.instance).setHeadBlockNumber(j);
                return this;
            }

            public Builder setRefBlockPrefix(long j) {
                copyOnWrite();
                ((ChainParams) this.instance).setRefBlockPrefix(j);
                return this;
            }

            private Builder() {
                super(ChainParams.DEFAULT_INSTANCE);
            }
        }

        static {
            ChainParams chainParams = new ChainParams();
            DEFAULT_INSTANCE = chainParams;
            GeneratedMessageLite.registerDefaultInstance(ChainParams.class, chainParams);
        }

        private ChainParams() {
        }

        /* access modifiers changed from: private */
        public void clearChainId() {
            this.chainId_ = getDefaultInstance().getChainId();
        }

        /* access modifiers changed from: private */
        public void clearHeadBlockNumber() {
            this.headBlockNumber_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearRefBlockPrefix() {
            this.refBlockPrefix_ = 0;
        }

        public static ChainParams getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ChainParams parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ChainParams) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ChainParams parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ChainParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<ChainParams> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setChainId(ByteString byteString) {
            byteString.getClass();
            this.chainId_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setHeadBlockNumber(long j) {
            this.headBlockNumber_ = j;
        }

        /* access modifiers changed from: private */
        public void setRefBlockPrefix(long j) {
            this.refBlockPrefix_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97451.f46558xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new ChainParams();
                case 2:
                    return new Builder((C97451) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\u0003\u0003\u0003", new Object[]{"chainId_", "headBlockNumber_", "refBlockPrefix_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<ChainParams> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (ChainParams.class) {
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

        public ByteString getChainId() {
            return this.chainId_;
        }

        public long getHeadBlockNumber() {
            return this.headBlockNumber_;
        }

        public long getRefBlockPrefix() {
            return this.refBlockPrefix_;
        }

        public static Builder newBuilder(ChainParams chainParams) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(chainParams);
        }

        public static ChainParams parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (ChainParams) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static ChainParams parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (ChainParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static ChainParams parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ChainParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ChainParams parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (ChainParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static ChainParams parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ChainParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ChainParams parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (ChainParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static ChainParams parseFrom(InputStream inputStream) throws IOException {
            return (ChainParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ChainParams parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (ChainParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static ChainParams parseFrom(C4969g gVar) throws IOException {
            return (ChainParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static ChainParams parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (ChainParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface ChainParamsOrBuilder extends qu3 {
        ByteString getChainId();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        long getHeadBlockNumber();

        long getRefBlockPrefix();

        /* synthetic */ boolean isInitialized();
    }

    public static final class NewFundsContent extends GeneratedMessageLite<NewFundsContent, Builder> implements NewFundsContentOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 2;
        public static final int COIN_SYMBOL_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final NewFundsContent DEFAULT_INSTANCE;
        public static final int HASH_FIELD_NUMBER = 5;
        public static final int MEMO_FIELD_NUMBER = 4;
        public static final int OFFLINE_URL_FIELD_NUMBER = 6;
        private static volatile im4<NewFundsContent> PARSER = null;
        public static final int PAYEE_PUBLIC_ADDRESS_FIELD_NUMBER = 1;
        private String amount_ = "";
        private String coinSymbol_ = "";
        private String hash_ = "";
        private String memo_ = "";
        private String offlineUrl_ = "";
        private String payeePublicAddress_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<NewFundsContent, Builder> implements NewFundsContentOrBuilder {
            public /* synthetic */ Builder(C97451 r1) {
                this();
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((NewFundsContent) this.instance).clearAmount();
                return this;
            }

            public Builder clearCoinSymbol() {
                copyOnWrite();
                ((NewFundsContent) this.instance).clearCoinSymbol();
                return this;
            }

            public Builder clearHash() {
                copyOnWrite();
                ((NewFundsContent) this.instance).clearHash();
                return this;
            }

            public Builder clearMemo() {
                copyOnWrite();
                ((NewFundsContent) this.instance).clearMemo();
                return this;
            }

            public Builder clearOfflineUrl() {
                copyOnWrite();
                ((NewFundsContent) this.instance).clearOfflineUrl();
                return this;
            }

            public Builder clearPayeePublicAddress() {
                copyOnWrite();
                ((NewFundsContent) this.instance).clearPayeePublicAddress();
                return this;
            }

            public String getAmount() {
                return ((NewFundsContent) this.instance).getAmount();
            }

            public ByteString getAmountBytes() {
                return ((NewFundsContent) this.instance).getAmountBytes();
            }

            public String getCoinSymbol() {
                return ((NewFundsContent) this.instance).getCoinSymbol();
            }

            public ByteString getCoinSymbolBytes() {
                return ((NewFundsContent) this.instance).getCoinSymbolBytes();
            }

            public String getHash() {
                return ((NewFundsContent) this.instance).getHash();
            }

            public ByteString getHashBytes() {
                return ((NewFundsContent) this.instance).getHashBytes();
            }

            public String getMemo() {
                return ((NewFundsContent) this.instance).getMemo();
            }

            public ByteString getMemoBytes() {
                return ((NewFundsContent) this.instance).getMemoBytes();
            }

            public String getOfflineUrl() {
                return ((NewFundsContent) this.instance).getOfflineUrl();
            }

            public ByteString getOfflineUrlBytes() {
                return ((NewFundsContent) this.instance).getOfflineUrlBytes();
            }

            public String getPayeePublicAddress() {
                return ((NewFundsContent) this.instance).getPayeePublicAddress();
            }

            public ByteString getPayeePublicAddressBytes() {
                return ((NewFundsContent) this.instance).getPayeePublicAddressBytes();
            }

            public Builder setAmount(String str) {
                copyOnWrite();
                ((NewFundsContent) this.instance).setAmount(str);
                return this;
            }

            public Builder setAmountBytes(ByteString byteString) {
                copyOnWrite();
                ((NewFundsContent) this.instance).setAmountBytes(byteString);
                return this;
            }

            public Builder setCoinSymbol(String str) {
                copyOnWrite();
                ((NewFundsContent) this.instance).setCoinSymbol(str);
                return this;
            }

            public Builder setCoinSymbolBytes(ByteString byteString) {
                copyOnWrite();
                ((NewFundsContent) this.instance).setCoinSymbolBytes(byteString);
                return this;
            }

            public Builder setHash(String str) {
                copyOnWrite();
                ((NewFundsContent) this.instance).setHash(str);
                return this;
            }

            public Builder setHashBytes(ByteString byteString) {
                copyOnWrite();
                ((NewFundsContent) this.instance).setHashBytes(byteString);
                return this;
            }

            public Builder setMemo(String str) {
                copyOnWrite();
                ((NewFundsContent) this.instance).setMemo(str);
                return this;
            }

            public Builder setMemoBytes(ByteString byteString) {
                copyOnWrite();
                ((NewFundsContent) this.instance).setMemoBytes(byteString);
                return this;
            }

            public Builder setOfflineUrl(String str) {
                copyOnWrite();
                ((NewFundsContent) this.instance).setOfflineUrl(str);
                return this;
            }

            public Builder setOfflineUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((NewFundsContent) this.instance).setOfflineUrlBytes(byteString);
                return this;
            }

            public Builder setPayeePublicAddress(String str) {
                copyOnWrite();
                ((NewFundsContent) this.instance).setPayeePublicAddress(str);
                return this;
            }

            public Builder setPayeePublicAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((NewFundsContent) this.instance).setPayeePublicAddressBytes(byteString);
                return this;
            }

            private Builder() {
                super(NewFundsContent.DEFAULT_INSTANCE);
            }
        }

        static {
            NewFundsContent newFundsContent = new NewFundsContent();
            DEFAULT_INSTANCE = newFundsContent;
            GeneratedMessageLite.registerDefaultInstance(NewFundsContent.class, newFundsContent);
        }

        private NewFundsContent() {
        }

        /* access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = getDefaultInstance().getAmount();
        }

        /* access modifiers changed from: private */
        public void clearCoinSymbol() {
            this.coinSymbol_ = getDefaultInstance().getCoinSymbol();
        }

        /* access modifiers changed from: private */
        public void clearHash() {
            this.hash_ = getDefaultInstance().getHash();
        }

        /* access modifiers changed from: private */
        public void clearMemo() {
            this.memo_ = getDefaultInstance().getMemo();
        }

        /* access modifiers changed from: private */
        public void clearOfflineUrl() {
            this.offlineUrl_ = getDefaultInstance().getOfflineUrl();
        }

        /* access modifiers changed from: private */
        public void clearPayeePublicAddress() {
            this.payeePublicAddress_ = getDefaultInstance().getPayeePublicAddress();
        }

        public static NewFundsContent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static NewFundsContent parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NewFundsContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NewFundsContent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (NewFundsContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<NewFundsContent> parser() {
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
        public void setCoinSymbol(String str) {
            str.getClass();
            this.coinSymbol_ = str;
        }

        /* access modifiers changed from: private */
        public void setCoinSymbolBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.coinSymbol_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setHash(String str) {
            str.getClass();
            this.hash_ = str;
        }

        /* access modifiers changed from: private */
        public void setHashBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.hash_ = byteString.toStringUtf8();
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
        public void setOfflineUrl(String str) {
            str.getClass();
            this.offlineUrl_ = str;
        }

        /* access modifiers changed from: private */
        public void setOfflineUrlBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.offlineUrl_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setPayeePublicAddress(String str) {
            str.getClass();
            this.payeePublicAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setPayeePublicAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.payeePublicAddress_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97451.f46558xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new NewFundsContent();
                case 2:
                    return new Builder((C97451) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ", new Object[]{"payeePublicAddress_", "amount_", "coinSymbol_", "memo_", "hash_", "offlineUrl_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<NewFundsContent> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (NewFundsContent.class) {
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

        public String getCoinSymbol() {
            return this.coinSymbol_;
        }

        public ByteString getCoinSymbolBytes() {
            return ByteString.copyFromUtf8(this.coinSymbol_);
        }

        public String getHash() {
            return this.hash_;
        }

        public ByteString getHashBytes() {
            return ByteString.copyFromUtf8(this.hash_);
        }

        public String getMemo() {
            return this.memo_;
        }

        public ByteString getMemoBytes() {
            return ByteString.copyFromUtf8(this.memo_);
        }

        public String getOfflineUrl() {
            return this.offlineUrl_;
        }

        public ByteString getOfflineUrlBytes() {
            return ByteString.copyFromUtf8(this.offlineUrl_);
        }

        public String getPayeePublicAddress() {
            return this.payeePublicAddress_;
        }

        public ByteString getPayeePublicAddressBytes() {
            return ByteString.copyFromUtf8(this.payeePublicAddress_);
        }

        public static Builder newBuilder(NewFundsContent newFundsContent) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(newFundsContent);
        }

        public static NewFundsContent parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (NewFundsContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static NewFundsContent parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (NewFundsContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static NewFundsContent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (NewFundsContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NewFundsContent parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (NewFundsContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static NewFundsContent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (NewFundsContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NewFundsContent parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (NewFundsContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static NewFundsContent parseFrom(InputStream inputStream) throws IOException {
            return (NewFundsContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NewFundsContent parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (NewFundsContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static NewFundsContent parseFrom(C4969g gVar) throws IOException {
            return (NewFundsContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static NewFundsContent parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (NewFundsContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface NewFundsContentOrBuilder extends qu3 {
        String getAmount();

        ByteString getAmountBytes();

        String getCoinSymbol();

        ByteString getCoinSymbolBytes();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getHash();

        ByteString getHashBytes();

        String getMemo();

        ByteString getMemoBytes();

        String getOfflineUrl();

        ByteString getOfflineUrlBytes();

        String getPayeePublicAddress();

        ByteString getPayeePublicAddressBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class PublicAddress extends GeneratedMessageLite<PublicAddress, Builder> implements PublicAddressOrBuilder {
        public static final int ADDRESS_FIELD_NUMBER = 2;
        public static final int COIN_SYMBOL_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final PublicAddress DEFAULT_INSTANCE;
        private static volatile im4<PublicAddress> PARSER;
        private String address_ = "";
        private String coinSymbol_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<PublicAddress, Builder> implements PublicAddressOrBuilder {
            public /* synthetic */ Builder(C97451 r1) {
                this();
            }

            public Builder clearAddress() {
                copyOnWrite();
                ((PublicAddress) this.instance).clearAddress();
                return this;
            }

            public Builder clearCoinSymbol() {
                copyOnWrite();
                ((PublicAddress) this.instance).clearCoinSymbol();
                return this;
            }

            public String getAddress() {
                return ((PublicAddress) this.instance).getAddress();
            }

            public ByteString getAddressBytes() {
                return ((PublicAddress) this.instance).getAddressBytes();
            }

            public String getCoinSymbol() {
                return ((PublicAddress) this.instance).getCoinSymbol();
            }

            public ByteString getCoinSymbolBytes() {
                return ((PublicAddress) this.instance).getCoinSymbolBytes();
            }

            public Builder setAddress(String str) {
                copyOnWrite();
                ((PublicAddress) this.instance).setAddress(str);
                return this;
            }

            public Builder setAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((PublicAddress) this.instance).setAddressBytes(byteString);
                return this;
            }

            public Builder setCoinSymbol(String str) {
                copyOnWrite();
                ((PublicAddress) this.instance).setCoinSymbol(str);
                return this;
            }

            public Builder setCoinSymbolBytes(ByteString byteString) {
                copyOnWrite();
                ((PublicAddress) this.instance).setCoinSymbolBytes(byteString);
                return this;
            }

            private Builder() {
                super(PublicAddress.DEFAULT_INSTANCE);
            }
        }

        static {
            PublicAddress publicAddress = new PublicAddress();
            DEFAULT_INSTANCE = publicAddress;
            GeneratedMessageLite.registerDefaultInstance(PublicAddress.class, publicAddress);
        }

        private PublicAddress() {
        }

        /* access modifiers changed from: private */
        public void clearAddress() {
            this.address_ = getDefaultInstance().getAddress();
        }

        /* access modifiers changed from: private */
        public void clearCoinSymbol() {
            this.coinSymbol_ = getDefaultInstance().getCoinSymbol();
        }

        public static PublicAddress getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static PublicAddress parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PublicAddress) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PublicAddress parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (PublicAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<PublicAddress> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAddress(String str) {
            str.getClass();
            this.address_ = str;
        }

        /* access modifiers changed from: private */
        public void setAddressBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.address_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setCoinSymbol(String str) {
            str.getClass();
            this.coinSymbol_ = str;
        }

        /* access modifiers changed from: private */
        public void setCoinSymbolBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.coinSymbol_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97451.f46558xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new PublicAddress();
                case 2:
                    return new Builder((C97451) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"coinSymbol_", "address_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<PublicAddress> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (PublicAddress.class) {
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

        public String getAddress() {
            return this.address_;
        }

        public ByteString getAddressBytes() {
            return ByteString.copyFromUtf8(this.address_);
        }

        public String getCoinSymbol() {
            return this.coinSymbol_;
        }

        public ByteString getCoinSymbolBytes() {
            return ByteString.copyFromUtf8(this.coinSymbol_);
        }

        public static Builder newBuilder(PublicAddress publicAddress) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(publicAddress);
        }

        public static PublicAddress parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (PublicAddress) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static PublicAddress parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (PublicAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static PublicAddress parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (PublicAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static PublicAddress parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (PublicAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static PublicAddress parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (PublicAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PublicAddress parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (PublicAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static PublicAddress parseFrom(InputStream inputStream) throws IOException {
            return (PublicAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PublicAddress parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (PublicAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static PublicAddress parseFrom(C4969g gVar) throws IOException {
            return (PublicAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static PublicAddress parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (PublicAddress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface PublicAddressOrBuilder extends qu3 {
        String getAddress();

        ByteString getAddressBytes();

        String getCoinSymbol();

        ByteString getCoinSymbolBytes();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SigningInput extends GeneratedMessageLite<SigningInput, Builder> implements SigningInputOrBuilder {
        public static final int ACTION_FIELD_NUMBER = 5;
        public static final int CHAIN_PARAMS_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final SigningInput DEFAULT_INSTANCE;
        public static final int EXPIRY_FIELD_NUMBER = 1;
        private static volatile im4<SigningInput> PARSER = null;
        public static final int PRIVATE_KEY_FIELD_NUMBER = 3;
        public static final int TPID_FIELD_NUMBER = 4;
        private Action action_;
        private ChainParams chainParams_;
        private int expiry_;
        private ByteString privateKey_ = ByteString.EMPTY;
        private String tpid_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningInput, Builder> implements SigningInputOrBuilder {
            public /* synthetic */ Builder(C97451 r1) {
                this();
            }

            public Builder clearAction() {
                copyOnWrite();
                ((SigningInput) this.instance).clearAction();
                return this;
            }

            public Builder clearChainParams() {
                copyOnWrite();
                ((SigningInput) this.instance).clearChainParams();
                return this;
            }

            public Builder clearExpiry() {
                copyOnWrite();
                ((SigningInput) this.instance).clearExpiry();
                return this;
            }

            public Builder clearPrivateKey() {
                copyOnWrite();
                ((SigningInput) this.instance).clearPrivateKey();
                return this;
            }

            public Builder clearTpid() {
                copyOnWrite();
                ((SigningInput) this.instance).clearTpid();
                return this;
            }

            public Action getAction() {
                return ((SigningInput) this.instance).getAction();
            }

            public ChainParams getChainParams() {
                return ((SigningInput) this.instance).getChainParams();
            }

            public int getExpiry() {
                return ((SigningInput) this.instance).getExpiry();
            }

            public ByteString getPrivateKey() {
                return ((SigningInput) this.instance).getPrivateKey();
            }

            public String getTpid() {
                return ((SigningInput) this.instance).getTpid();
            }

            public ByteString getTpidBytes() {
                return ((SigningInput) this.instance).getTpidBytes();
            }

            public boolean hasAction() {
                return ((SigningInput) this.instance).hasAction();
            }

            public boolean hasChainParams() {
                return ((SigningInput) this.instance).hasChainParams();
            }

            public Builder mergeAction(Action action) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeAction(action);
                return this;
            }

            public Builder mergeChainParams(ChainParams chainParams) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeChainParams(chainParams);
                return this;
            }

            public Builder setAction(Action action) {
                copyOnWrite();
                ((SigningInput) this.instance).setAction(action);
                return this;
            }

            public Builder setChainParams(ChainParams chainParams) {
                copyOnWrite();
                ((SigningInput) this.instance).setChainParams(chainParams);
                return this;
            }

            public Builder setExpiry(int i) {
                copyOnWrite();
                ((SigningInput) this.instance).setExpiry(i);
                return this;
            }

            public Builder setPrivateKey(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setPrivateKey(byteString);
                return this;
            }

            public Builder setTpid(String str) {
                copyOnWrite();
                ((SigningInput) this.instance).setTpid(str);
                return this;
            }

            public Builder setTpidBytes(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setTpidBytes(byteString);
                return this;
            }

            private Builder() {
                super(SigningInput.DEFAULT_INSTANCE);
            }

            public Builder setAction(Action.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setAction((Action) builder.build());
                return this;
            }

            public Builder setChainParams(ChainParams.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setChainParams((ChainParams) builder.build());
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
        public void clearAction() {
            this.action_ = null;
        }

        /* access modifiers changed from: private */
        public void clearChainParams() {
            this.chainParams_ = null;
        }

        /* access modifiers changed from: private */
        public void clearExpiry() {
            this.expiry_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearPrivateKey() {
            this.privateKey_ = getDefaultInstance().getPrivateKey();
        }

        /* access modifiers changed from: private */
        public void clearTpid() {
            this.tpid_ = getDefaultInstance().getTpid();
        }

        public static SigningInput getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeAction(Action action) {
            action.getClass();
            Action action2 = this.action_;
            if (action2 == null || action2 == Action.getDefaultInstance()) {
                this.action_ = action;
            } else {
                this.action_ = (Action) ((Action.Builder) Action.newBuilder(this.action_).mergeFrom(action)).buildPartial();
            }
        }

        /* access modifiers changed from: private */
        public void mergeChainParams(ChainParams chainParams) {
            chainParams.getClass();
            ChainParams chainParams2 = this.chainParams_;
            if (chainParams2 == null || chainParams2 == ChainParams.getDefaultInstance()) {
                this.chainParams_ = chainParams;
            } else {
                this.chainParams_ = (ChainParams) ((ChainParams.Builder) ChainParams.newBuilder(this.chainParams_).mergeFrom(chainParams)).buildPartial();
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
        public void setAction(Action action) {
            action.getClass();
            this.action_ = action;
        }

        /* access modifiers changed from: private */
        public void setChainParams(ChainParams chainParams) {
            chainParams.getClass();
            this.chainParams_ = chainParams;
        }

        /* access modifiers changed from: private */
        public void setExpiry(int i) {
            this.expiry_ = i;
        }

        /* access modifiers changed from: private */
        public void setPrivateKey(ByteString byteString) {
            byteString.getClass();
            this.privateKey_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setTpid(String str) {
            str.getClass();
            this.tpid_ = str;
        }

        /* access modifiers changed from: private */
        public void setTpidBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.tpid_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97451.f46558xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningInput();
                case 2:
                    return new Builder((C97451) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004Ȉ\u0005\t", new Object[]{"expiry_", "chainParams_", "privateKey_", "tpid_", "action_"});
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

        public Action getAction() {
            Action action = this.action_;
            if (action == null) {
                return Action.getDefaultInstance();
            }
            return action;
        }

        public ChainParams getChainParams() {
            ChainParams chainParams = this.chainParams_;
            if (chainParams == null) {
                return ChainParams.getDefaultInstance();
            }
            return chainParams;
        }

        public int getExpiry() {
            return this.expiry_;
        }

        public ByteString getPrivateKey() {
            return this.privateKey_;
        }

        public String getTpid() {
            return this.tpid_;
        }

        public ByteString getTpidBytes() {
            return ByteString.copyFromUtf8(this.tpid_);
        }

        public boolean hasAction() {
            if (this.action_ != null) {
                return true;
            }
            return false;
        }

        public boolean hasChainParams() {
            if (this.chainParams_ != null) {
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
        Action getAction();

        ChainParams getChainParams();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        int getExpiry();

        ByteString getPrivateKey();

        String getTpid();

        ByteString getTpidBytes();

        boolean hasAction();

        boolean hasChainParams();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SigningOutput extends GeneratedMessageLite<SigningOutput, Builder> implements SigningOutputOrBuilder {
        /* access modifiers changed from: private */
        public static final SigningOutput DEFAULT_INSTANCE;
        public static final int ERROR_FIELD_NUMBER = 2;
        public static final int JSON_FIELD_NUMBER = 1;
        private static volatile im4<SigningOutput> PARSER;
        private int error_;
        private String json_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningOutput, Builder> implements SigningOutputOrBuilder {
            public /* synthetic */ Builder(C97451 r1) {
                this();
            }

            public Builder clearError() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearError();
                return this;
            }

            public Builder clearJson() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearJson();
                return this;
            }

            public Common.SigningError getError() {
                return ((SigningOutput) this.instance).getError();
            }

            public int getErrorValue() {
                return ((SigningOutput) this.instance).getErrorValue();
            }

            public String getJson() {
                return ((SigningOutput) this.instance).getJson();
            }

            public ByteString getJsonBytes() {
                return ((SigningOutput) this.instance).getJsonBytes();
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
        public void clearJson() {
            this.json_ = getDefaultInstance().getJson();
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
        public void setJson(String str) {
            str.getClass();
            this.json_ = str;
        }

        /* access modifiers changed from: private */
        public void setJsonBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.json_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97451.f46558xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningOutput();
                case 2:
                    return new Builder((C97451) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"json_", "error_"});
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

        public String getJson() {
            return this.json_;
        }

        public ByteString getJsonBytes() {
            return ByteString.copyFromUtf8(this.json_);
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

        String getJson();

        ByteString getJsonBytes();

        /* synthetic */ boolean isInitialized();
    }

    private FIO() {
    }

    public static void registerAllExtensions(C4987l lVar) {
    }
}
