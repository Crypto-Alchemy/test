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
import wallet.core.jni.proto.Common;

public final class TransactionCompiler {

    /* renamed from: wallet.core.jni.proto.TransactionCompiler$1 */
    public static /* synthetic */ class C97721 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f46584xa1df5c61;

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
                f46584xa1df5c61 = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f46584xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f46584xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f46584xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f46584xa1df5c61     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f46584xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f46584xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wallet.core.jni.proto.TransactionCompiler.C97721.<clinit>():void");
        }
    }

    public static final class PreSigningOutput extends GeneratedMessageLite<PreSigningOutput, Builder> implements PreSigningOutputOrBuilder {
        public static final int DATA_FIELD_NUMBER = 2;
        public static final int DATA_HASH_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final PreSigningOutput DEFAULT_INSTANCE;
        public static final int ERROR_FIELD_NUMBER = 3;
        public static final int ERROR_MESSAGE_FIELD_NUMBER = 4;
        private static volatile im4<PreSigningOutput> PARSER;
        private ByteString dataHash_;
        private ByteString data_;
        private String errorMessage_ = "";
        private int error_;

        public static final class Builder extends GeneratedMessageLite.C4930a<PreSigningOutput, Builder> implements PreSigningOutputOrBuilder {
            public /* synthetic */ Builder(C97721 r1) {
                this();
            }

            public Builder clearData() {
                copyOnWrite();
                ((PreSigningOutput) this.instance).clearData();
                return this;
            }

            public Builder clearDataHash() {
                copyOnWrite();
                ((PreSigningOutput) this.instance).clearDataHash();
                return this;
            }

            public Builder clearError() {
                copyOnWrite();
                ((PreSigningOutput) this.instance).clearError();
                return this;
            }

            public Builder clearErrorMessage() {
                copyOnWrite();
                ((PreSigningOutput) this.instance).clearErrorMessage();
                return this;
            }

            public ByteString getData() {
                return ((PreSigningOutput) this.instance).getData();
            }

            public ByteString getDataHash() {
                return ((PreSigningOutput) this.instance).getDataHash();
            }

            public Common.SigningError getError() {
                return ((PreSigningOutput) this.instance).getError();
            }

            public String getErrorMessage() {
                return ((PreSigningOutput) this.instance).getErrorMessage();
            }

            public ByteString getErrorMessageBytes() {
                return ((PreSigningOutput) this.instance).getErrorMessageBytes();
            }

            public int getErrorValue() {
                return ((PreSigningOutput) this.instance).getErrorValue();
            }

            public Builder setData(ByteString byteString) {
                copyOnWrite();
                ((PreSigningOutput) this.instance).setData(byteString);
                return this;
            }

            public Builder setDataHash(ByteString byteString) {
                copyOnWrite();
                ((PreSigningOutput) this.instance).setDataHash(byteString);
                return this;
            }

            public Builder setError(Common.SigningError signingError) {
                copyOnWrite();
                ((PreSigningOutput) this.instance).setError(signingError);
                return this;
            }

            public Builder setErrorMessage(String str) {
                copyOnWrite();
                ((PreSigningOutput) this.instance).setErrorMessage(str);
                return this;
            }

            public Builder setErrorMessageBytes(ByteString byteString) {
                copyOnWrite();
                ((PreSigningOutput) this.instance).setErrorMessageBytes(byteString);
                return this;
            }

            public Builder setErrorValue(int i) {
                copyOnWrite();
                ((PreSigningOutput) this.instance).setErrorValue(i);
                return this;
            }

            private Builder() {
                super(PreSigningOutput.DEFAULT_INSTANCE);
            }
        }

        static {
            PreSigningOutput preSigningOutput = new PreSigningOutput();
            DEFAULT_INSTANCE = preSigningOutput;
            GeneratedMessageLite.registerDefaultInstance(PreSigningOutput.class, preSigningOutput);
        }

        private PreSigningOutput() {
            ByteString byteString = ByteString.EMPTY;
            this.dataHash_ = byteString;
            this.data_ = byteString;
        }

        /* access modifiers changed from: private */
        public void clearData() {
            this.data_ = getDefaultInstance().getData();
        }

        /* access modifiers changed from: private */
        public void clearDataHash() {
            this.dataHash_ = getDefaultInstance().getDataHash();
        }

        /* access modifiers changed from: private */
        public void clearError() {
            this.error_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearErrorMessage() {
            this.errorMessage_ = getDefaultInstance().getErrorMessage();
        }

        public static PreSigningOutput getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static PreSigningOutput parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PreSigningOutput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PreSigningOutput parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (PreSigningOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<PreSigningOutput> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setData(ByteString byteString) {
            byteString.getClass();
            this.data_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setDataHash(ByteString byteString) {
            byteString.getClass();
            this.dataHash_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setError(Common.SigningError signingError) {
            this.error_ = signingError.getNumber();
        }

        /* access modifiers changed from: private */
        public void setErrorMessage(String str) {
            str.getClass();
            this.errorMessage_ = str;
        }

        /* access modifiers changed from: private */
        public void setErrorMessageBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.errorMessage_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setErrorValue(int i) {
            this.error_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97721.f46584xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new PreSigningOutput();
                case 2:
                    return new Builder((C97721) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\n\u0002\n\u0003\f\u0004Ȉ", new Object[]{"dataHash_", "data_", "error_", "errorMessage_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<PreSigningOutput> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (PreSigningOutput.class) {
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

        public ByteString getDataHash() {
            return this.dataHash_;
        }

        public Common.SigningError getError() {
            Common.SigningError forNumber = Common.SigningError.forNumber(this.error_);
            if (forNumber == null) {
                return Common.SigningError.UNRECOGNIZED;
            }
            return forNumber;
        }

        public String getErrorMessage() {
            return this.errorMessage_;
        }

        public ByteString getErrorMessageBytes() {
            return ByteString.copyFromUtf8(this.errorMessage_);
        }

        public int getErrorValue() {
            return this.error_;
        }

        public static Builder newBuilder(PreSigningOutput preSigningOutput) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(preSigningOutput);
        }

        public static PreSigningOutput parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (PreSigningOutput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static PreSigningOutput parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (PreSigningOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static PreSigningOutput parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (PreSigningOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static PreSigningOutput parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (PreSigningOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static PreSigningOutput parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (PreSigningOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PreSigningOutput parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (PreSigningOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static PreSigningOutput parseFrom(InputStream inputStream) throws IOException {
            return (PreSigningOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PreSigningOutput parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (PreSigningOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static PreSigningOutput parseFrom(C4969g gVar) throws IOException {
            return (PreSigningOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static PreSigningOutput parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (PreSigningOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface PreSigningOutputOrBuilder extends qu3 {
        ByteString getData();

        ByteString getDataHash();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        Common.SigningError getError();

        String getErrorMessage();

        ByteString getErrorMessageBytes();

        int getErrorValue();

        /* synthetic */ boolean isInitialized();
    }

    private TransactionCompiler() {
    }

    public static void registerAllExtensions(C4987l lVar) {
    }
}
